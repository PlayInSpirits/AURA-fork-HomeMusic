# AURA native client recovery

This branch is the isolated native-client migration line. It does not change `main`, the
`v0.75.1` tag, or the existing APK release.

## Product and compatibility contract

- Android application ID stays `app.homemusic`.
- First native release display version is `v0.10.1`.
- Its Android `versionCode` is `7502` (must remain greater than the installed AURA 0.75.1 code 7501).
- Release signing must use the existing AURA keystore and alias from repository Actions secrets.
  Never generate a replacement release key.
- Upgrading over AURA 0.75.1 must preserve app data. Any Room/SQLite schema changes require
  explicit migrations; no destructive migration or app-data reset is acceptable.
- The Windows self-hosted runner remains the production build runner.

## Server boundary

The PC remains responsible for HomeMusic's recommendation and mix computation. The Android app
consumes the existing HomeMusic Hub API and Navidrome/Subsonic API; it must not reimplement server
ranking or recommendation algorithms on-device.

The native client must preserve:
- Hub login, invite-code registration, optional email/Google auth as currently supported by Hub;
- Hub catalog/search, downloads, uploads, assistant, library-management and notification features;
- Navidrome/Subsonic login, browsing, favourites, playlists, streaming and scrobbling;
- endless My Wave sessions via `POST /api/wave/start` and `POST /api/wave/{session_id}/next`,
  including idempotent play-event delivery, likes, skips, queued refs and session restoration;
- Media3 playback, background service, media session, queue and notification controls.

The Hub API contract is documented in the server repository:
https://github.com/justman-1/HomeMusic-public/blob/master/hub/API.md

## Recovery strategy

The upstream Tempus repository is a useful source of architecture and reusable Android components,
but it is not a drop-in replacement for the HomeMusic client. The public HomeMusic server repository
does not contain the separate Android `homemusic` branch mentioned by its README.

Therefore the first recovery pass uses JADX on three real APKs:
1. the original HomeMusic 1.14.7 APK;
2. AURA 0.30.2;
3. AURA 0.75.1.

JADX output is evidence for reconstructing Java/Kotlin source, not automatically trusted buildable
source. Smali, resources, manifest, assets, DEX metadata and the actual APK remain the behavioural
reference where decompilation is incomplete or misleading.

After reviewing the recovery artifact, create a reproducible Gradle project in this branch, restore
the original package/dependencies/components, and port AURA-specific functionality. Do not replace
working HomeMusic behaviour with a mock screen or an empty application shell.

## UI direction

New and migrated screens should use Kotlin and Jetpack Compose with Material 3 foundations,
consistent rounded geometry, restrained translucent/glass surfaces, subtle blur and motion.
The My Wave background should use the server/web implementation as a visual reference and be
implemented natively (GLSL/RuntimeShader or a measured Compose/Canvas fallback), not as a GIF/video.

## Acceptance gates

A native release is not ready until:
- it installs as an update over AURA 0.75.1 using the same certificate;
- package ID and version code are correct;
- existing local settings/session data survives upgrade;
- login and real Hub/Navidrome endpoints work;
- My Wave can continue through multiple server batches, recording likes/skips/finishes correctly;
- background playback and Android media controls work after app process recreation;
- the required HomeMusic features have no regression against the 0.75.1 baseline.
