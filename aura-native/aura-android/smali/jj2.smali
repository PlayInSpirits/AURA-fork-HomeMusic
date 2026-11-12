.class public final Ljj2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lgj2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Lz05;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1a

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lhj2;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2, p3, p4}, Lgj2;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lz05;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ljj2;->a:Lgj2;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Lgj2;

    .line 19
    .line 20
    invoke-direct {v0, p1, p2, p3, p4}, Lgj2;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Lz05;Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ljj2;->a:Lgj2;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object p0, p0, Ljj2;->a:Lgj2;

    .line 2
    .line 3
    iget-object v0, p0, Lgj2;->f:Lxc5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lgj2;->g:Landroid/os/Messenger;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    const/4 v3, 0x0

    .line 13
    :try_start_0
    invoke-virtual {v0, v2, v3, v1}, Lxc5;->w(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    const-string v0, "MediaBrowserCompat"

    .line 18
    .line 19
    const-string v1, "Remote error unregistering client messenger."

    .line 20
    .line 21
    invoke-static {v0, v1}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    :goto_0
    iget-object p0, p0, Lgj2;->b:Landroid/media/browse/MediaBrowser;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/media/browse/MediaBrowser;->disconnect()V

    .line 27
    .line 28
    .line 29
    return-void
.end method
