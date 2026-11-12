$ErrorActionPreference = "Stop"
$Repository = "PlayInSpirits/HomeMusic-Fork"
$Root = Join-Path $env:USERPROFILE "AURA-signing"
$KeyStore = Join-Path $Root "aura-release.jks"
$PasswordFile = Join-Path $Root "signing-password.txt"
$Alias = "aura-release"

if (-not (Get-Command gh -ErrorAction SilentlyContinue)) { throw "Install GitHub CLI from https://cli.github.com/ and run gh auth login." }
if (-not (Get-Command keytool -ErrorAction SilentlyContinue)) { throw "Install a JDK and ensure keytool.exe is on PATH." }
gh auth status --hostname github.com | Out-Null
if ($LASTEXITCODE -ne 0) { throw "Authenticate first with: gh auth login" }
New-Item -ItemType Directory -Force -Path $Root | Out-Null
if (Test-Path $KeyStore) {
    if (-not (Test-Path $PasswordFile)) { throw "The existing keystore has no matching password file. Do not generate a replacement key." }
    $Password = (Get-Content -Path $PasswordFile -Raw).Trim()
} else {
    $random = New-Object byte[] 48
    $rng = [System.Security.Cryptography.RandomNumberGenerator]::Create()
    $rng.GetBytes($random); $rng.Dispose()
    $Password = [Convert]::ToBase64String($random).Replace("+","A").Replace("/","B").TrimEnd("=")
    & keytool -genkeypair -noprompt -keystore $KeyStore -storepass $Password -keypass $Password -alias $Alias -keyalg RSA -keysize 4096 -validity 10000 -dname "CN=AURA Release, OU=Android, O=PlayInSpirits, C=SE"
    if ($LASTEXITCODE -ne 0) { throw "keytool failed to generate the signing key." }
    Set-Content -Path $PasswordFile -Value $Password -NoNewline -Encoding ASCII
}
$Base64 = [Convert]::ToBase64String([IO.File]::ReadAllBytes($KeyStore))
gh secret set AURA_KEYSTORE_BASE64 --repo $Repository --body "$Base64"
if ($LASTEXITCODE -ne 0) { throw "Could not set AURA_KEYSTORE_BASE64." }
gh secret set AURA_KEYSTORE_PASSWORD --repo $Repository --body "$Password"
if ($LASTEXITCODE -ne 0) { throw "Could not set AURA_KEYSTORE_PASSWORD." }
gh secret set AURA_KEY_ALIAS --repo $Repository --body "$Alias"
if ($LASTEXITCODE -ne 0) { throw "Could not set AURA_KEY_ALIAS." }
gh secret set AURA_KEY_PASSWORD --repo $Repository --body "$Password"
if ($LASTEXITCODE -ne 0) { throw "Could not set AURA_KEY_PASSWORD." }

$Description = 'Форк Android-приложения HomeMusic-public.'
gh repo edit $Repository --description $Description --homepage "https://github.com/justman-1/HomeMusic-public"
if ($LASTEXITCODE -ne 0) { Write-Warning "Could not update repository About description automatically." }

Write-Host "Persistent signing key created and GitHub Actions secrets configured."
Write-Host "Keep this folder safe and back it up securely: $Root"
Write-Host "Do not delete, regenerate, or commit either file."
gh workflow run aura-build.yml --repo $Repository --ref main
if ($LASTEXITCODE -ne 0) { throw "Secrets saved, but workflow dispatch failed. Run gh workflow run aura-build.yml --repo $Repository --ref main" }
Write-Host "Build queued. Monitor https://github.com/$Repository/actions"
