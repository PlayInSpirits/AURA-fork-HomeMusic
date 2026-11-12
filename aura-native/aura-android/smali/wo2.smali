.class public final Lwo2;
.super Loq2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lwo2;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lwo2;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lwo2;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public e()V
    .locals 5

    .line 1
    iget v0, p0, Lwo2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lwo2;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ls25;

    .line 10
    .line 11
    iget-object v0, v0, Ls25;->w:Lhd5;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lhd5;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lcom/eddyizm/tempus/service/MediaService;

    .line 18
    .line 19
    iget-object p0, p0, Lwo2;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lg25;

    .line 22
    .line 23
    iget-object v2, v1, Lcom/eddyizm/tempus/service/MediaService;->x:Lq25;

    .line 24
    .line 25
    new-instance v3, Lq25;

    .line 26
    .line 27
    iget-object v0, v0, Lhd5;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lf25;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v0, p0, v4, v1}, Lq25;-><init>(Lf25;Lg25;Landroid/os/Looper;Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    iput-object v3, v1, Lcom/eddyizm/tempus/service/MediaService;->x:Lq25;

    .line 42
    .line 43
    invoke-virtual {v1, v3}, Lcom/eddyizm/tempus/service/MediaService;->q(Lqi3;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v1, p0, v3}, Lcom/eddyizm/tempus/service/MediaService;->s(Lqi3;Lqi3;)V

    .line 55
    .line 56
    .line 57
    if-eqz v2, :cond_0

    .line 58
    .line 59
    invoke-virtual {v2}, Lqe4;->A1()V

    .line 60
    .line 61
    .line 62
    :cond_0
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f(I)V
    .locals 5

    .line 1
    iget v0, p0, Lwo2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lwo2;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, Lwo2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lvo2;

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, p0, Lvo2;->h:Landroid/os/Messenger;

    .line 21
    .line 22
    iget-object v2, p0, Lvo2;->g:Landroid/media/MediaRouter2$RoutingController;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-static {v2}, Lto2;->w(Landroid/media/MediaRouter2$RoutingController;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v2, p0, Lvo2;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/4 v4, 0x7

    .line 46
    iput v4, v3, Landroid/os/Message;->what:I

    .line 47
    .line 48
    iput v2, v3, Landroid/os/Message;->arg1:I

    .line 49
    .line 50
    new-instance v2, Landroid/os/Bundle;

    .line 51
    .line 52
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v4, "volume"

    .line 56
    .line 57
    invoke-virtual {v2, v4, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    const-string p1, "routeId"

    .line 61
    .line 62
    invoke-virtual {v2, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lvo2;->i:Landroid/os/Messenger;

    .line 69
    .line 70
    iput-object p0, v3, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 71
    .line 72
    :try_start_0
    invoke-virtual {v1, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catch_0
    move-exception p0

    .line 77
    const-string p1, "MR2Provider"

    .line 78
    .line 79
    const-string v0, "Could not send control request to service."

    .line 80
    .line 81
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 82
    .line 83
    .line 84
    :catch_1
    :cond_2
    :goto_0
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget v0, p0, Lwo2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Loq2;->h(I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Lwo2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ls25;

    .line 13
    .line 14
    iget-object p1, p1, Ls25;->w:Lhd5;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object p0, p0, Lwo2;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lg25;

    .line 21
    .line 22
    iget-object p1, p1, Lhd5;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Lcom/eddyizm/tempus/service/MediaService;

    .line 25
    .line 26
    iget-object v0, p1, Lcom/eddyizm/tempus/service/MediaService;->x:Lq25;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, v0, Lq25;->k:Lg25;

    .line 32
    .line 33
    invoke-static {v1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    iput-object p0, p1, Lcom/eddyizm/tempus/service/MediaService;->x:Lq25;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, v0, p0}, Lcom/eddyizm/tempus/service/MediaService;->s(Lqi3;Lqi3;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lqe4;->A1()V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public i(I)V
    .locals 5

    .line 1
    iget v0, p0, Lwo2;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object v0, p0, Lwo2;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object p0, p0, Lwo2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lvo2;

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v1, p0, Lvo2;->h:Landroid/os/Messenger;

    .line 21
    .line 22
    iget-object v2, p0, Lvo2;->g:Landroid/media/MediaRouter2$RoutingController;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-static {v2}, Lto2;->w(Landroid/media/MediaRouter2$RoutingController;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v2, p0, Lvo2;->l:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const/16 v4, 0x8

    .line 46
    .line 47
    iput v4, v3, Landroid/os/Message;->what:I

    .line 48
    .line 49
    iput v2, v3, Landroid/os/Message;->arg1:I

    .line 50
    .line 51
    new-instance v2, Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v4, "volume"

    .line 57
    .line 58
    invoke-virtual {v2, v4, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    const-string p1, "routeId"

    .line 62
    .line 63
    invoke-virtual {v2, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lvo2;->i:Landroid/os/Messenger;

    .line 70
    .line 71
    iput-object p0, v3, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 72
    .line 73
    :try_start_0
    invoke-virtual {v1, v3}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception p0

    .line 78
    const-string p1, "MR2Provider"

    .line 79
    .line 80
    const-string v0, "Could not send control request to service."

    .line 81
    .line 82
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    :catch_1
    :cond_2
    :goto_0
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
