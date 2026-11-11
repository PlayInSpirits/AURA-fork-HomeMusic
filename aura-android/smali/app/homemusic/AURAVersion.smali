.class public final Lapp/homemusic/AURAVersion;
.super Ljava/lang/Object;
.field public static waveStarted:Z
.field public static wavePlaying:Z
.field public static waveButton:Landroid/view/View;

.field public static pendingSearch:Z

.method public static versionName(Landroid/content/Context;)Ljava/lang/String;
    .locals 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    move-result-object v0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    const/4 v2, 0x0
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    move-result-object v0
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    if-eqz v0, :fallback
    return-object v0
:fallback
    const-string v0, "unknown"
    return-object v0
.end method

.method public static versionCodeInt(Landroid/content/Context;)I
    .locals 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
    move-result-object v0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
    move-result-object v1
    const/4 v2, 0x0
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    move-result-object v0
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    return v0
.end method

.method public static versionCode(Landroid/content/Context;)J
    .locals 2
    invoke-static {p0}, Lapp/homemusic/AURAVersion;->versionCodeInt(Landroid/content/Context;)I
    move-result v0
    int-to-long v0, v0
    return-wide v0
.end method
