.class public Lxk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/media/session/MediaController;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/HashMap;

.field public final e:Lpr2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lpr2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxk2;->b:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lxk2;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lxk2;->d:Ljava/util/HashMap;

    .line 24
    .line 25
    iput-object p2, p0, Lxk2;->e:Lpr2;

    .line 26
    .line 27
    new-instance v0, Landroid/media/session/MediaController;

    .line 28
    .line 29
    iget-object v1, p2, Lpr2;->o:Landroid/media/session/MediaSession$Token;

    .line 30
    .line 31
    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaController;-><init>(Landroid/content/Context;Landroid/media/session/MediaSession$Token;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 35
    .line 36
    invoke-virtual {p2}, Lpr2;->a()Lqu1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    new-instance p1, Lwk2;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Lwk2;-><init>(Lxk2;)V

    .line 45
    .line 46
    .line 47
    const-string p0, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    .line 48
    .line 49
    const/4 p2, 0x0

    .line 50
    invoke-virtual {v0, p0, p2, p1}, Landroid/media/session/MediaController;->sendCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lxk2;->e:Lpr2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpr2;->a()Lqu1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lxk2;->c:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Lgm2;

    .line 26
    .line 27
    new-instance v5, Ltk2;

    .line 28
    .line 29
    invoke-direct {v5, v4}, Ltk2;-><init>(Lgm2;)V

    .line 30
    .line 31
    .line 32
    iget-object v6, p0, Lxk2;->d:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v6, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iput-object v5, v4, Lgm2;->c:Ltk2;

    .line 38
    .line 39
    :try_start_0
    invoke-interface {v0, v5}, Lqu1;->l0(Llu1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    const/16 v5, 0xd

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-virtual {v4, v5, v6}, Lgm2;->c(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto :goto_1

    .line 51
    :catch_1
    move-exception p0

    .line 52
    :goto_1
    const-string v0, "MediaControllerCompat"

    .line 53
    .line 54
    const-string v2, "Dead object in registerCallback."

    .line 55
    .line 56
    invoke-static {v0, v2, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final b(Lgm2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 2
    .line 3
    iget-object v1, p1, Lgm2;->a:Luk2;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/media/session/MediaController;->unregisterCallback(Landroid/media/session/MediaController$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lxk2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lxk2;->e:Lpr2;

    .line 15
    .line 16
    invoke-virtual {v1}, Lpr2;->a()Lqu1;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    :try_start_1
    iget-object p0, p0, Lxk2;->d:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ltk2;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    iput-object v2, p1, Lgm2;->c:Ltk2;

    .line 34
    .line 35
    invoke-interface {v1, p0}, Lqu1;->b0(Llu1;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_2

    .line 41
    :catch_0
    move-exception p0

    .line 42
    goto :goto_0

    .line 43
    :catch_1
    move-exception p0

    .line 44
    :goto_0
    :try_start_2
    const-string p1, "MediaControllerCompat"

    .line 45
    .line 46
    const-string v1, "Dead object in unregisterCallback."

    .line 47
    .line 48
    invoke-static {p1, v1, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    iget-object p0, p0, Lxk2;->c:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_1
    :goto_1
    monitor-exit v0

    .line 58
    return-void

    .line 59
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    throw p0
.end method
