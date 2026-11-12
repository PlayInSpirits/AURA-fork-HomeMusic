#!/usr/bin/env bash
# Persistent, checksum-verified cache for the Windows self-hosted AURA runner.
# Store immutable APK/tool inputs outside the checkout so actions/checkout cannot remove them.
set -euo pipefail

if [[ -z "\${RUNNER_TOOL_CACHE:-}" ]]; then
  echo "::error::RUNNER_TOOL_CACHE is not available; refusing to use a workspace-local cache."
  return 1 2>/dev/null || exit 1
fi

AURA_RUNNER_CACHE_ROOT="$(cygpath -u "$RUNNER_TOOL_CACHE")/aura-native-v0.10.1"
mkdir -p "$AURA_RUNNER_CACHE_ROOT"

# aura_cache_fetch <cache-relative-path> <url> <expected-digest> <destination> [sha256|md5]
aura_cache_fetch() {
  local relative="$1"
  local url="$2"
  local expected="$3"
  local destination="$4"
  local algorithm="\${5:-sha256}"
  local cached="$AURA_RUNNER_CACHE_ROOT/$relative"
  local actual=""
  local actual_command=""

  case "$algorithm" in
    sha256) actual_command="sha256sum" ;;
    md5) actual_command="md5sum" ;;
    *) echo "::error::Unsupported cache digest algorithm: $algorithm"; return 2 ;;
  esac

  mkdir -p "$(dirname "$cached")" "$(dirname "$destination")"

  if [[ -s "$cached" ]]; then
    actual="$($actual_command "$cached" | awk '{print tolower($1)}')"
    if [[ "$actual" == "\${expected,,}" ]]; then
      cp -f "$cached" "$destination"
      echo "AURA cache hit: $relative ($algorithm $actual)"
      return 0
    fi
    echo "AURA cache entry failed checksum; replacing it: $relative"
    rm -f "$cached"
  fi

  echo "AURA cache miss: downloading $relative"
  curl.exe -fL --retry 3 --retry-delay 2 "$url" -o "$destination"
  actual="$($actual_command "$destination" | awk '{print tolower($1)}')"
  if [[ "$actual" != "\${expected,,}" ]]; then
    rm -f "$destination"
    echo "::error::Checksum mismatch for $relative: got $actual, expected \${expected,,}"
    return 1
  fi

  cp -f "$destination" "$cached"
  echo "AURA input cached permanently for this runner: $relative ($algorithm $actual)"
}
