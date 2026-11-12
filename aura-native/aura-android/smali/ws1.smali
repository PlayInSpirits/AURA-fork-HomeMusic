.class public final synthetic Lws1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lws1;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lws1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 11
    iput p3, p0, Lws1;->n:I

    iput-object p1, p0, Lws1;->p:Ljava/lang/Object;

    iput-object p2, p0, Lws1;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v2, p0

    .line 8
    check-cast v2, Lbj2;

    .line 9
    .line 10
    invoke-static {v0}, Lgi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    new-instance p0, Lvs3;

    .line 15
    .line 16
    invoke-direct {p0}, Lvs3;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lvs3;->a()Lcom/eddyizm/tempus/model/Queue;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v0, -0x1

    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    move v5, v1

    .line 32
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-ge v5, v6, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Lgn2;

    .line 43
    .line 44
    iget-object v6, v6, Lgn2;->a:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    move v0, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    :goto_1
    if-ltz v0, :cond_2

    .line 58
    .line 59
    move v4, v0

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move v4, v1

    .line 62
    :goto_2
    const-wide/16 v5, 0x0

    .line 63
    .line 64
    if-ltz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lud3;->A()Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lsp3;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    iget-wide v0, v0, Lsp3;->b:J

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    move-wide v0, v5

    .line 89
    :goto_3
    cmp-long v7, v0, v5

    .line 90
    .line 91
    if-eqz v7, :cond_4

    .line 92
    .line 93
    :goto_4
    move-wide v5, v0

    .line 94
    goto :goto_5

    .line 95
    :cond_4
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Queue;->getPlayingChanged()J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    :goto_5
    new-instance p0, Landroid/os/Handler;

    .line 105
    .line 106
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 111
    .line 112
    .line 113
    new-instance v1, Lwn2;

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    invoke-direct/range {v1 .. v7}, Lwn2;-><init>(Lbj2;Ljava/util/ArrayList;IJI)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method private final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lic2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lgn2;

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :try_start_1
    invoke-static {}, Lu52;->c()Lv52;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v1, v1, Lv52;->a:Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lbj2;

    .line 29
    .line 30
    sget-object v1, Lbo2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Lsk2;->s0(Lgn2;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lsk2;->b()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lsk2;->m0()V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 43
    .line 44
    .line 45
    :try_start_3
    new-instance p0, Lvs3;

    .line 46
    .line 47
    invoke-direct {p0}, Lvs3;-><init>()V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 51
    .line 52
    iget-object p0, p0, Lvs3;->a:Lns3;

    .line 53
    .line 54
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v1, Ljq3;

    .line 58
    .line 59
    invoke-direct {v1, v2, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :catch_0
    move-exception p0

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    :goto_0
    return-void

    .line 69
    :catch_1
    move-exception p0

    .line 70
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lic2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 8
    .line 9
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 10
    .line 11
    .line 12
    move-result v1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :try_start_1
    invoke-static {}, Lu52;->c()Lv52;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v1, v1, Lv52;->a:Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lbj2;

    .line 29
    .line 30
    sget-object v1, Lbo2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Lgi1;->I(Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;)Lgn2;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {v0, p0}, Lsk2;->s0(Lgn2;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lsk2;->b()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lsk2;->m0()V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    return-void

    .line 53
    :catch_1
    move-exception p0

    .line 54
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lho2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/media/metrics/NetworkEvent;

    .line 8
    .line 9
    iget-object v0, v0, Lho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lfo2;->q(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lho2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/media/metrics/PlaybackErrorEvent;

    .line 8
    .line 9
    iget-object v0, v0, Lho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lfo2;->r(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lho2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/media/metrics/PlaybackMetrics;

    .line 8
    .line 9
    iget-object v0, v0, Lho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lfo2;->s(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lho2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/media/metrics/PlaybackStateEvent;

    .line 8
    .line 9
    iget-object v0, v0, Lho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lfo2;->t(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lws1;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltn2;

    .line 4
    .line 5
    iget-object p0, p0, Lws1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lal3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1, p0}, Ltn2;->D(Lal3;Lal3;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lws1;->n:I

    .line 4
    .line 5
    const/16 v2, 0x13

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ltn2;

    .line 16
    .line 17
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Llb4;

    .line 20
    .line 21
    invoke-virtual {v1}, Ltn2;->u()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    invoke-direct {v0}, Lws1;->h()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    invoke-direct {v0}, Lws1;->g()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_2
    invoke-direct {v0}, Lws1;->f()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_3
    invoke-direct {v0}, Lws1;->e()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_4
    invoke-direct {v0}, Lws1;->d()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_5
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lho2;

    .line 56
    .line 57
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Landroid/media/metrics/TrackChangeEvent;

    .line 60
    .line 61
    iget-object v1, v1, Lho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 62
    .line 63
    invoke-static {v1, v0}, Lgo2;->m(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_6
    invoke-direct {v0}, Lws1;->c()V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_7
    invoke-direct {v0}, Lws1;->b()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_8
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lic2;

    .line 78
    .line 79
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lsi1;

    .line 82
    .line 83
    :try_start_0
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_0

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Lbj2;

    .line 94
    .line 95
    invoke-virtual {v1}, Lsk2;->o0()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-virtual {v0, v1}, Lsi1;->onRecovery(I)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catch_0
    move-exception v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 105
    .line 106
    .line 107
    :cond_0
    :goto_0
    return-void

    .line 108
    :pswitch_9
    invoke-direct {v0}, Lws1;->a()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :pswitch_a
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, Lic2;

    .line 115
    .line 116
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ljava/util/List;

    .line 119
    .line 120
    :try_start_1
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_1

    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Lbj2;

    .line 131
    .line 132
    sget-object v3, Lbo2;->d:Ljava/util/concurrent/ExecutorService;

    .line 133
    .line 134
    new-instance v4, Lws1;

    .line 135
    .line 136
    invoke-direct {v4, v2, v0, v1}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :catch_1
    move-exception v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 145
    .line 146
    .line 147
    :cond_1
    :goto_1
    return-void

    .line 148
    :pswitch_b
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, Lic2;

    .line 151
    .line 152
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 155
    .line 156
    :try_start_2
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 157
    .line 158
    .line 159
    move-result v2
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 160
    if-eqz v2, :cond_3

    .line 161
    .line 162
    :try_start_3
    invoke-static {}, Lu52;->c()Lv52;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    iget-boolean v2, v2, Lv52;->a:Z
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_2

    .line 167
    .line 168
    if-eqz v2, :cond_2

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_2
    :try_start_4
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lbj2;

    .line 176
    .line 177
    sget-object v2, Lbo2;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 178
    .line 179
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Lgi1;->L(Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;)Lgn2;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v1, v0}, Lsk2;->s0(Lgn2;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lsk2;->b()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lsk2;->m0()V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :catch_2
    move-exception v0

    .line 197
    goto :goto_2

    .line 198
    :catch_3
    move-exception v0

    .line 199
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 200
    .line 201
    .line 202
    :cond_3
    :goto_3
    return-void

    .line 203
    :pswitch_c
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v1, Llb4;

    .line 206
    .line 207
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, Ljava/util/ArrayList;

    .line 210
    .line 211
    iget-object v1, v1, Lu0;->n:Ljava/lang/Object;

    .line 212
    .line 213
    instance-of v1, v1, Lf0;

    .line 214
    .line 215
    if-eqz v1, :cond_5

    .line 216
    .line 217
    move v1, v4

    .line 218
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-ge v1, v2, :cond_5

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    if-eqz v2, :cond_4

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    check-cast v2, Lic2;

    .line 235
    .line 236
    invoke-interface {v2, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 237
    .line 238
    .line 239
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_5
    return-void

    .line 243
    :pswitch_d
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v1, Lic2;

    .line 246
    .line 247
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 248
    .line 249
    move-object v2, v0

    .line 250
    check-cast v2, Lnj2;

    .line 251
    .line 252
    :try_start_5
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, Lab4;

    .line 257
    .line 258
    const-string v1, "SessionResult must not be null"

    .line 259
    .line 260
    invoke-static {v0, v1}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    iget-object v0, v0, Lab4;->b:Landroid/os/Bundle;

    .line 264
    .line 265
    invoke-virtual {v2, v0}, Luj2;->f(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_4

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :catch_4
    move-exception v0

    .line 270
    goto :goto_5

    .line 271
    :catch_5
    move-exception v0

    .line 272
    goto :goto_5

    .line 273
    :catch_6
    move-exception v0

    .line 274
    :goto_5
    const-string v1, "MLSLegacyStub"

    .line 275
    .line 276
    const-string v3, "Custom action failed"

    .line 277
    .line 278
    invoke-static {v1, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v2}, Luj2;->e()V

    .line 282
    .line 283
    .line 284
    :goto_6
    return-void

    .line 285
    :pswitch_e
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v1, Lbm2;

    .line 288
    .line 289
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Llm2;

    .line 292
    .line 293
    iget-boolean v2, v1, Lbm2;->p:Z

    .line 294
    .line 295
    if-eqz v2, :cond_6

    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_6
    invoke-interface {v0, v1}, Llm2;->c(Lbm2;)V

    .line 299
    .line 300
    .line 301
    :goto_7
    return-void

    .line 302
    :pswitch_f
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Lim2;

    .line 305
    .line 306
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v0, Lpr2;

    .line 309
    .line 310
    new-instance v2, Lwo0;

    .line 311
    .line 312
    iget-object v4, v1, Lim2;->a:Landroid/content/Context;

    .line 313
    .line 314
    invoke-direct {v2, v4, v0}, Lwo0;-><init>(Landroid/content/Context;Lpr2;)V

    .line 315
    .line 316
    .line 317
    iput-object v2, v1, Lim2;->i:Lwo0;

    .line 318
    .line 319
    iget-object v0, v1, Lim2;->e:Lgm2;

    .line 320
    .line 321
    invoke-virtual {v1}, Lim2;->a1()Lsk2;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    iget-object v1, v1, Lsk2;->f:Landroid/os/Handler;

    .line 326
    .line 327
    iget-object v4, v2, Lwo0;->o:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v4, Ljava/util/Set;

    .line 330
    .line 331
    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    if-nez v4, :cond_7

    .line 336
    .line 337
    const-string v0, "MediaControllerCompat"

    .line 338
    .line 339
    const-string v1, "the callback has already been registered"

    .line 340
    .line 341
    invoke-static {v0, v1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_7
    if-nez v1, :cond_8

    .line 346
    .line 347
    new-instance v1, Landroid/os/Handler;

    .line 348
    .line 349
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 350
    .line 351
    .line 352
    :cond_8
    invoke-virtual {v0, v1}, Lgm2;->d(Landroid/os/Handler;)V

    .line 353
    .line 354
    .line 355
    iget-object v2, v2, Lwo0;->n:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v2, Lxk2;

    .line 358
    .line 359
    iget-object v4, v2, Lxk2;->a:Landroid/media/session/MediaController;

    .line 360
    .line 361
    iget-object v5, v0, Lgm2;->a:Luk2;

    .line 362
    .line 363
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4, v5, v1}, Landroid/media/session/MediaController;->registerCallback(Landroid/media/session/MediaController$Callback;Landroid/os/Handler;)V

    .line 367
    .line 368
    .line 369
    iget-object v1, v2, Lxk2;->b:Ljava/lang/Object;

    .line 370
    .line 371
    monitor-enter v1

    .line 372
    :try_start_6
    iget-object v4, v2, Lxk2;->e:Lpr2;

    .line 373
    .line 374
    invoke-virtual {v4}, Lpr2;->a()Lqu1;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    if-eqz v4, :cond_9

    .line 379
    .line 380
    new-instance v5, Ltk2;

    .line 381
    .line 382
    invoke-direct {v5, v0}, Ltk2;-><init>(Lgm2;)V

    .line 383
    .line 384
    .line 385
    iget-object v2, v2, Lxk2;->d:Ljava/util/HashMap;

    .line 386
    .line 387
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    iput-object v5, v0, Lgm2;->c:Ltk2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 391
    .line 392
    :try_start_7
    invoke-interface {v4, v5}, Lqu1;->l0(Llu1;)V

    .line 393
    .line 394
    .line 395
    const/16 v2, 0xd

    .line 396
    .line 397
    invoke-virtual {v0, v2, v3}, Lgm2;->c(ILjava/lang/Object;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 398
    .line 399
    .line 400
    goto :goto_9

    .line 401
    :catchall_0
    move-exception v0

    .line 402
    goto :goto_b

    .line 403
    :catch_7
    move-exception v0

    .line 404
    goto :goto_8

    .line 405
    :catch_8
    move-exception v0

    .line 406
    :goto_8
    :try_start_8
    const-string v2, "MediaControllerCompat"

    .line 407
    .line 408
    const-string v3, "Dead object in registerCallback."

    .line 409
    .line 410
    invoke-static {v2, v3, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    goto :goto_9

    .line 414
    :cond_9
    iput-object v3, v0, Lgm2;->c:Ltk2;

    .line 415
    .line 416
    iget-object v2, v2, Lxk2;->c:Ljava/util/ArrayList;

    .line 417
    .line 418
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    :goto_9
    monitor-exit v1

    .line 422
    :goto_a
    return-void

    .line 423
    :goto_b
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 424
    throw v0

    .line 425
    :pswitch_10
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v1, Lgk2;

    .line 428
    .line 429
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lgp3;

    .line 432
    .line 433
    iget-object v2, v1, Lgk2;->Q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 434
    .line 435
    iget-object v3, v1, Lgk2;->K:Lcj0;

    .line 436
    .line 437
    invoke-virtual {v1, v0, v3, v4}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 442
    .line 443
    .line 444
    return-void

    .line 445
    :pswitch_11
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v1, Lbl2;

    .line 448
    .line 449
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Lbj2;

    .line 452
    .line 453
    iput-object v0, v1, Lbl2;->v:Lsk2;

    .line 454
    .line 455
    iget-boolean v2, v1, Lbl2;->w:Z

    .line 456
    .line 457
    if-eqz v2, :cond_a

    .line 458
    .line 459
    invoke-virtual {v1, v0}, Lu0;->l(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    :cond_a
    new-instance v2, Lpk2;

    .line 463
    .line 464
    invoke-direct {v2, v1, v0, v5}, Lpk2;-><init>(Lbl2;Lsk2;I)V

    .line 465
    .line 466
    .line 467
    new-instance v0, Lh41;

    .line 468
    .line 469
    invoke-direct {v0, v5, v1}, Lh41;-><init>(ILjava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1, v2, v0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :pswitch_12
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v1, Lwc0;

    .line 479
    .line 480
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Laj2;

    .line 483
    .line 484
    invoke-interface {v1, v0}, Lwc0;->accept(Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :pswitch_13
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v1, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 491
    .line 492
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Lj52;

    .line 495
    .line 496
    invoke-static {v1, v0}, Lcom/eddyizm/tempus/lan/LanReceiverService;->a(Lcom/eddyizm/tempus/lan/LanReceiverService;Lj52;)V

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_14
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 501
    .line 502
    move-object v7, v1

    .line 503
    check-cast v7, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 504
    .line 505
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 506
    .line 507
    move-object v1, v0

    .line 508
    check-cast v1, Ljavax/net/ssl/SSLSocket;

    .line 509
    .line 510
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 511
    .line 512
    const-string v2, "Failed requirement."

    .line 513
    .line 514
    const-string v12, "Receiver failed at "

    .line 515
    .line 516
    const-string v0, "Receiver unpaired request; windowOpen="

    .line 517
    .line 518
    :try_start_9
    sget-object v6, Lw42;->a:Lw42;

    .line 519
    .line 520
    const-string v6, "Receiver accepted connection; starting TLS"

    .line 521
    .line 522
    invoke-static {v6}, Lw42;->b(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 526
    .line 527
    .line 528
    :try_start_a
    const-string v6, "Receiver TLS established"

    .line 529
    .line 530
    invoke-static {v6}, Lw42;->b(Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    sput-object v3, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 534
    .line 535
    invoke-static {v1}, Lfz0;->m(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    invoke-static {v1}, Lfz0;->l(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    invoke-virtual {v8, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v3

    .line 547
    if-nez v3, :cond_18

    .line 548
    .line 549
    invoke-static {v1}, Lfz0;->n(Ljavax/net/ssl/SSLSocket;)Lorg/json/JSONObject;

    .line 550
    .line 551
    .line 552
    move-result-object v10

    .line 553
    const-string v3, "command"

    .line 554
    .line 555
    invoke-virtual {v10, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v9

    .line 559
    invoke-static {v7}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    invoke-interface {v3, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v3

    .line 567
    if-nez v3, :cond_12

    .line 568
    .line 569
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 570
    .line 571
    .line 572
    move-result-wide v13

    .line 573
    sget-wide v15, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 574
    .line 575
    cmp-long v3, v13, v15

    .line 576
    .line 577
    if-gez v3, :cond_b

    .line 578
    .line 579
    move v4, v5

    .line 580
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 581
    .line 582
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-static {v0}, Lw42;->b(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 599
    .line 600
    .line 601
    move-result-wide v3

    .line 602
    sget-wide v13, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 603
    .line 604
    const-string v0, "hello"

    .line 605
    .line 606
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v0

    .line 610
    if-eqz v0, :cond_11

    .line 611
    .line 612
    cmp-long v0, v3, v13

    .line 613
    .line 614
    if-gez v0, :cond_11

    .line 615
    .line 616
    sget-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 617
    .line 618
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    check-cast v3, Ljava/lang/Iterable;

    .line 626
    .line 627
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    if-eqz v4, :cond_d

    .line 636
    .line 637
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    check-cast v4, Ljava/util/Map$Entry;

    .line 642
    .line 643
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 647
    .line 648
    .line 649
    move-result-wide v13

    .line 650
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v4

    .line 654
    check-cast v4, Lh52;

    .line 655
    .line 656
    iget-wide v5, v4, Lh52;->d:J

    .line 657
    .line 658
    sub-long/2addr v13, v5

    .line 659
    const-wide/32 v4, 0x1d4c0

    .line 660
    .line 661
    .line 662
    cmp-long v4, v13, v4

    .line 663
    .line 664
    if-lez v4, :cond_c

    .line 665
    .line 666
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 667
    .line 668
    .line 669
    :cond_c
    const/4 v5, 0x1

    .line 670
    goto :goto_c

    .line 671
    :cond_d
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 672
    .line 673
    .line 674
    move-result v3

    .line 675
    const/4 v4, 0x4

    .line 676
    if-lt v3, v4, :cond_f

    .line 677
    .line 678
    invoke-virtual {v0, v8}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    if-eqz v3, :cond_e

    .line 683
    .line 684
    goto :goto_d

    .line 685
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 686
    .line 687
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    throw v0

    .line 691
    :catchall_1
    move-exception v0

    .line 692
    goto/16 :goto_13

    .line 693
    .line 694
    :catch_9
    move-exception v0

    .line 695
    const/4 v4, 0x1

    .line 696
    goto/16 :goto_10

    .line 697
    .line 698
    :cond_f
    :goto_d
    invoke-static {v1}, Lfz0;->l(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    invoke-static {v8, v3}, Lfz0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v18

    .line 706
    new-instance v13, Lh52;

    .line 707
    .line 708
    const-string v3, "name"

    .line 709
    .line 710
    invoke-virtual {v10, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v3

    .line 714
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 715
    .line 716
    .line 717
    const/16 v4, 0x28

    .line 718
    .line 719
    invoke-static {v4, v3}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v15

    .line 723
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 724
    .line 725
    .line 726
    move-result-wide v16

    .line 727
    move-object v14, v8

    .line 728
    invoke-direct/range {v13 .. v18}, Lh52;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 729
    .line 730
    .line 731
    move-object v8, v14

    .line 732
    move-object/from16 v3, v18

    .line 733
    .line 734
    invoke-virtual {v0, v8, v13}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    new-instance v0, Lorg/json/JSONObject;

    .line 738
    .line 739
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 740
    .line 741
    .line 742
    const-string v4, "pair"

    .line 743
    .line 744
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    invoke-static {v1, v0}, Lfz0;->p(Ljavax/net/ssl/SSLSocket;Lorg/json/JSONObject;)V

    .line 752
    .line 753
    .line 754
    const-string v0, "Receiver pairing code sent; awaiting approval"

    .line 755
    .line 756
    invoke-static {v0}, Lw42;->b(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 757
    .line 758
    .line 759
    :catchall_2
    :cond_10
    :goto_e
    iget-object v0, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 760
    .line 761
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    :try_start_b
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 765
    .line 766
    .line 767
    goto/16 :goto_12

    .line 768
    .line 769
    :cond_11
    :try_start_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 770
    .line 771
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 772
    .line 773
    .line 774
    throw v0

    .line 775
    :cond_12
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    iget-object v3, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 780
    .line 781
    invoke-static {v0, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    if-eqz v0, :cond_17

    .line 786
    .line 787
    iget-object v0, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 788
    .line 789
    if-eqz v0, :cond_17

    .line 790
    .line 791
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    if-eqz v0, :cond_17

    .line 796
    .line 797
    const-string v0, "watch"

    .line 798
    .line 799
    invoke-static {v9, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v0

    .line 803
    if-eqz v0, :cond_14

    .line 804
    .line 805
    iget-object v0, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->q:Ljava/util/concurrent/Semaphore;

    .line 806
    .line 807
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->tryAcquire()Z

    .line 808
    .line 809
    .line 810
    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 811
    if-eqz v0, :cond_13

    .line 812
    .line 813
    :try_start_d
    invoke-virtual {v7, v1, v8}, Lcom/eddyizm/tempus/lan/LanReceiverService;->g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 814
    .line 815
    .line 816
    :try_start_e
    iget-object v0, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->q:Ljava/util/concurrent/Semaphore;

    .line 817
    .line 818
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 819
    .line 820
    .line 821
    goto :goto_e

    .line 822
    :catchall_3
    move-exception v0

    .line 823
    iget-object v3, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->q:Ljava/util/concurrent/Semaphore;

    .line 824
    .line 825
    invoke-virtual {v3}, Ljava/util/concurrent/Semaphore;->release()V

    .line 826
    .line 827
    .line 828
    throw v0

    .line 829
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 830
    .line 831
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    throw v0

    .line 835
    :cond_14
    const-string v0, "queue"

    .line 836
    .line 837
    invoke-static {v9, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    if-eqz v0, :cond_15

    .line 842
    .line 843
    invoke-virtual {v7, v10, v8}, Lcom/eddyizm/tempus/lan/LanReceiverService;->c(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    goto :goto_f

    .line 848
    :cond_15
    const-string v0, "edit"

    .line 849
    .line 850
    invoke-static {v9, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    move-result v0

    .line 854
    if-eqz v0, :cond_16

    .line 855
    .line 856
    invoke-virtual {v7, v10, v8}, Lcom/eddyizm/tempus/lan/LanReceiverService;->b(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    goto :goto_f

    .line 861
    :cond_16
    new-instance v6, Luy1;

    .line 862
    .line 863
    const/4 v11, 0x1

    .line 864
    invoke-direct/range {v6 .. v11}, Luy1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v7, v6}, Lcom/eddyizm/tempus/lan/LanReceiverService;->d(Lgf1;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    check-cast v0, Lorg/json/JSONObject;

    .line 872
    .line 873
    :goto_f
    invoke-static {v1, v0}, Lfz0;->p(Ljavax/net/ssl/SSLSocket;Lorg/json/JSONObject;)V

    .line 874
    .line 875
    .line 876
    goto :goto_e

    .line 877
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 878
    .line 879
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    throw v0

    .line 883
    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 884
    .line 885
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    throw v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 889
    :catch_a
    move-exception v0

    .line 890
    :goto_10
    :try_start_f
    sget-object v3, Lw42;->a:Lw42;

    .line 891
    .line 892
    if-eqz v4, :cond_19

    .line 893
    .line 894
    const-string v5, "request"

    .line 895
    .line 896
    goto :goto_11

    .line 897
    :cond_19
    const-string v5, "TLS"

    .line 898
    .line 899
    :goto_11
    invoke-virtual {v12, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v5

    .line 903
    invoke-virtual {v3, v5, v0}, Lw42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 904
    .line 905
    .line 906
    if-nez v4, :cond_1a

    .line 907
    .line 908
    iget-boolean v0, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 909
    .line 910
    if-eqz v0, :cond_1a

    .line 911
    .line 912
    const v0, 0x7f1302e8

    .line 913
    .line 914
    .line 915
    invoke-virtual {v7, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    sput-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 920
    .line 921
    :cond_1a
    if-eqz v4, :cond_10

    .line 922
    .line 923
    :try_start_10
    new-instance v0, Lorg/json/JSONObject;

    .line 924
    .line 925
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 926
    .line 927
    .line 928
    const-string v3, "error"

    .line 929
    .line 930
    const-string v4, "unavailable"

    .line 931
    .line 932
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    sget-object v3, Lw10;->a:Ljava/nio/charset/Charset;

    .line 947
    .line 948
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 953
    .line 954
    .line 955
    array-length v3, v0

    .line 956
    const/4 v4, 0x1

    .line 957
    if-gt v4, v3, :cond_1b

    .line 958
    .line 959
    const v4, 0x20001

    .line 960
    .line 961
    .line 962
    if-ge v3, v4, :cond_1b

    .line 963
    .line 964
    new-instance v2, Ljava/io/DataOutputStream;

    .line 965
    .line 966
    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 967
    .line 968
    .line 969
    move-result-object v3

    .line 970
    invoke-direct {v2, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 971
    .line 972
    .line 973
    array-length v3, v0

    .line 974
    invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V

    .line 981
    .line 982
    .line 983
    goto/16 :goto_e

    .line 984
    .line 985
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 986
    .line 987
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 991
    :catchall_4
    :goto_12
    return-void

    .line 992
    :goto_13
    iget-object v2, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 993
    .line 994
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    :try_start_11
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 998
    .line 999
    .line 1000
    :catchall_5
    throw v0

    .line 1001
    :pswitch_15
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v1, Lfx3;

    .line 1004
    .line 1005
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 1006
    .line 1007
    check-cast v0, Lf9;

    .line 1008
    .line 1009
    iget-boolean v1, v1, Lfx3;->n:Z

    .line 1010
    .line 1011
    if-nez v1, :cond_1c

    .line 1012
    .line 1013
    const v1, 0x7f1302bb

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v0, v1}, Ldg;->setTitle(I)V

    .line 1017
    .line 1018
    .line 1019
    :cond_1c
    return-void

    .line 1020
    :pswitch_16
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 1021
    .line 1022
    check-cast v1, Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 1023
    .line 1024
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 1025
    .line 1026
    check-cast v0, Ljava/io/Serializable;

    .line 1027
    .line 1028
    sget-object v2, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 1029
    .line 1030
    invoke-virtual {v1, v4}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setInFlight(Z)V

    .line 1031
    .line 1032
    .line 1033
    sget-object v2, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 1034
    .line 1035
    if-eq v2, v1, :cond_1d

    .line 1036
    .line 1037
    goto/16 :goto_16

    .line 1038
    .line 1039
    :cond_1d
    instance-of v2, v0, Ls14;

    .line 1040
    .line 1041
    if-nez v2, :cond_21

    .line 1042
    .line 1043
    move-object v2, v0

    .line 1044
    check-cast v2, Lly4;

    .line 1045
    .line 1046
    iget-object v3, v2, Lly4;->n:Ljava/lang/String;

    .line 1047
    .line 1048
    iget-object v2, v2, Lly4;->p:Ljava/io/Serializable;

    .line 1049
    .line 1050
    check-cast v2, Ljava/util/List;

    .line 1051
    .line 1052
    invoke-virtual {v1, v3}, Lcom/eddyizm/tempus/homemusic/WaveSession;->renew(Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    sget-object v3, Lrs1;->a:Lrs1;

    .line 1056
    .line 1057
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->ids()Ljava/util/Set;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v3

    .line 1061
    check-cast v3, Ljava/lang/Iterable;

    .line 1062
    .line 1063
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 1064
    .line 1065
    const/16 v5, 0xa

    .line 1066
    .line 1067
    invoke-static {v3, v5}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 1068
    .line 1069
    .line 1070
    move-result v5

    .line 1071
    invoke-static {v5}, Llg2;->W(I)I

    .line 1072
    .line 1073
    .line 1074
    move-result v5

    .line 1075
    const/16 v6, 0x10

    .line 1076
    .line 1077
    if-ge v5, v6, :cond_1e

    .line 1078
    .line 1079
    move v5, v6

    .line 1080
    :cond_1e
    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1081
    .line 1082
    .line 1083
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1088
    .line 1089
    .line 1090
    move-result v5

    .line 1091
    if-eqz v5, :cond_1f

    .line 1092
    .line 1093
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v5

    .line 1097
    move-object v6, v5

    .line 1098
    check-cast v6, Ljava/lang/String;

    .line 1099
    .line 1100
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getContext()Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v6

    .line 1104
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1105
    .line 1106
    .line 1107
    goto :goto_14

    .line 1108
    :cond_1f
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->g(Lcom/eddyizm/tempus/homemusic/WaveSession;)Ljava/util/Map;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    invoke-static {v4, v3}, Lrs1;->b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v1, v2}, Lcom/eddyizm/tempus/homemusic/b;->b(Lcom/eddyizm/tempus/homemusic/WaveSession;Ljava/util/List;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getAgain()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v2

    .line 1122
    if-eqz v2, :cond_20

    .line 1123
    .line 1124
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->c()V

    .line 1125
    .line 1126
    .line 1127
    goto :goto_15

    .line 1128
    :cond_20
    invoke-static {v1}, Lcom/eddyizm/tempus/homemusic/b;->f(Lcom/eddyizm/tempus/homemusic/WaveSession;)V

    .line 1129
    .line 1130
    .line 1131
    :cond_21
    :goto_15
    invoke-static {v0}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    if-eqz v0, :cond_22

    .line 1136
    .line 1137
    const-string v2, "HubWave"

    .line 1138
    .line 1139
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1144
    .line 1145
    const-string v4, "renew: "

    .line 1146
    .line 1147
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getFailures()I

    .line 1161
    .line 1162
    .line 1163
    move-result v0

    .line 1164
    const/16 v19, 0x1

    .line 1165
    .line 1166
    add-int/lit8 v0, v0, 0x1

    .line 1167
    .line 1168
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setFailures(I)V

    .line 1169
    .line 1170
    .line 1171
    sget-object v0, Lcom/eddyizm/tempus/homemusic/WaveRetry;->INSTANCE:Lcom/eddyizm/tempus/homemusic/WaveRetry;

    .line 1172
    .line 1173
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getFailures()I

    .line 1174
    .line 1175
    .line 1176
    move-result v1

    .line 1177
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/WaveRetry;->afterFailure(I)Ljava/lang/Long;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    if-eqz v0, :cond_22

    .line 1182
    .line 1183
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 1184
    .line 1185
    .line 1186
    move-result-wide v0

    .line 1187
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->e()V

    .line 1188
    .line 1189
    .line 1190
    new-instance v2, Lu6;

    .line 1191
    .line 1192
    const/16 v3, 0xc

    .line 1193
    .line 1194
    invoke-direct {v2, v3}, Lu6;-><init>(I)V

    .line 1195
    .line 1196
    .line 1197
    sput-object v2, Lcom/eddyizm/tempus/homemusic/b;->c:Lu6;

    .line 1198
    .line 1199
    sget-object v3, Lio1;->b:Landroid/os/Handler;

    .line 1200
    .line 1201
    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1202
    .line 1203
    .line 1204
    :cond_22
    :goto_16
    return-void

    .line 1205
    :pswitch_17
    iget-object v1, v0, Lws1;->p:Ljava/lang/Object;

    .line 1206
    .line 1207
    check-cast v1, Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 1208
    .line 1209
    iget-object v0, v0, Lws1;->o:Ljava/lang/Object;

    .line 1210
    .line 1211
    check-cast v0, Ljava/lang/String;

    .line 1212
    .line 1213
    sget-object v2, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 1214
    .line 1215
    :try_start_12
    sget-object v2, Lrr1;->a:Lrr1;

    .line 1216
    .line 1217
    invoke-static {}, Lrr1;->e()Ljava/util/Set;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    const-string v4, "wave_origin_v1"

    .line 1222
    .line 1223
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v2

    .line 1227
    sget-object v4, Lcom/eddyizm/tempus/homemusic/WaveSession;->Companion:Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;

    .line 1228
    .line 1229
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getSeed()Ljava/util/Map;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v5

    .line 1233
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getMode()Ljava/lang/String;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v6

    .line 1237
    const-string v7, "restart"

    .line 1238
    .line 1239
    if-eqz v2, :cond_23

    .line 1240
    .line 1241
    goto :goto_17

    .line 1242
    :cond_23
    move-object v7, v3

    .line 1243
    :goto_17
    if-eqz v2, :cond_24

    .line 1244
    .line 1245
    move-object v8, v0

    .line 1246
    goto :goto_18

    .line 1247
    :cond_24
    move-object v8, v3

    .line 1248
    :goto_18
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v0

    .line 1252
    if-eqz v2, :cond_25

    .line 1253
    .line 1254
    move-object v9, v0

    .line 1255
    goto :goto_19

    .line 1256
    :cond_25
    move-object v9, v3

    .line 1257
    :goto_19
    invoke-virtual/range {v4 .. v9}, Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;->startBody(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v0

    .line 1261
    invoke-static {v0}, Lrr1;->A(Ljava/util/Map;)Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getTracks()Ljava/util/List;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    if-nez v2, :cond_26

    .line 1270
    .line 1271
    sget-object v2, Lu01;->n:Lu01;

    .line 1272
    .line 1273
    goto :goto_1a

    .line 1274
    :catchall_6
    move-exception v0

    .line 1275
    goto :goto_1c

    .line 1276
    :cond_26
    :goto_1a
    new-instance v3, Ljava/util/ArrayList;

    .line 1277
    .line 1278
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1279
    .line 1280
    .line 1281
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v2

    .line 1285
    :cond_27
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1286
    .line 1287
    .line 1288
    move-result v4

    .line 1289
    if-eqz v4, :cond_28

    .line 1290
    .line 1291
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v4

    .line 1295
    move-object v5, v4

    .line 1296
    check-cast v5, Lcom/eddyizm/tempus/homemusic/WaveTrack;

    .line 1297
    .line 1298
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getGenerator()Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v5

    .line 1302
    const-string v6, "seed"

    .line 1303
    .line 1304
    invoke-static {v5, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1305
    .line 1306
    .line 1307
    move-result v5

    .line 1308
    if-nez v5, :cond_27

    .line 1309
    .line 1310
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    goto :goto_1b

    .line 1314
    :cond_28
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/WaveOut;->getSessionId()Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v2

    .line 1318
    if-eqz v2, :cond_29

    .line 1319
    .line 1320
    new-instance v4, Lly4;

    .line 1321
    .line 1322
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1323
    .line 1324
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    const-string v6, "wave:"

    .line 1328
    .line 1329
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1330
    .line 1331
    .line 1332
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v5

    .line 1339
    invoke-static {v5, v3}, Lcom/eddyizm/tempus/homemusic/b;->k(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v3

    .line 1343
    invoke-direct {v4, v2, v0, v3}, Lly4;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/io/Serializable;)V

    .line 1344
    .line 1345
    .line 1346
    goto :goto_1d

    .line 1347
    :cond_29
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1348
    .line 1349
    const-string v2, "\u041f\u0443\u0441\u0442\u043e\u0439 \u043e\u0442\u0432\u0435\u0442 \u0425\u0430\u0431\u0430"

    .line 1350
    .line 1351
    invoke-direct {v0, v2}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 1355
    :goto_1c
    new-instance v4, Ls14;

    .line 1356
    .line 1357
    invoke-direct {v4, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1358
    .line 1359
    .line 1360
    :goto_1d
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 1361
    .line 1362
    new-instance v2, Lws1;

    .line 1363
    .line 1364
    const/4 v3, 0x6

    .line 1365
    invoke-direct {v2, v3, v1, v4}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1366
    .line 1367
    .line 1368
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1369
    .line 1370
    .line 1371
    return-void

    .line 1372
    :pswitch_18
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 1373
    .line 1374
    check-cast v1, Ljava/lang/String;

    .line 1375
    .line 1376
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 1377
    .line 1378
    move-object v4, v0

    .line 1379
    check-cast v4, Landroid/content/Context;

    .line 1380
    .line 1381
    :try_start_13
    invoke-static {v1}, Lrr1;->g(Ljava/lang/String;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 1382
    .line 1383
    .line 1384
    goto :goto_1e

    .line 1385
    :catchall_7
    move-exception v0

    .line 1386
    new-instance v3, Ls14;

    .line 1387
    .line 1388
    invoke-direct {v3, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1389
    .line 1390
    .line 1391
    :goto_1e
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 1392
    .line 1393
    new-instance v5, Lv6;

    .line 1394
    .line 1395
    invoke-direct {v5, v3, v4, v1, v2}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1399
    .line 1400
    .line 1401
    return-void

    .line 1402
    :pswitch_19
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 1403
    .line 1404
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 1405
    .line 1406
    check-cast v0, Landroid/content/Context;

    .line 1407
    .line 1408
    instance-of v2, v1, Ls14;

    .line 1409
    .line 1410
    if-nez v2, :cond_2a

    .line 1411
    .line 1412
    move-object v2, v1

    .line 1413
    check-cast v2, Lj15;

    .line 1414
    .line 1415
    const v2, 0x7f130239

    .line 1416
    .line 1417
    .line 1418
    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v2

    .line 1422
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 1423
    .line 1424
    .line 1425
    :cond_2a
    invoke-static {v1}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    if-eqz v1, :cond_2e

    .line 1430
    .line 1431
    const-string v2, "HubSmart"

    .line 1432
    .line 1433
    const-string v4, "hide"

    .line 1434
    .line 1435
    invoke-static {v2, v4, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1436
    .line 1437
    .line 1438
    instance-of v2, v1, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1439
    .line 1440
    if-eqz v2, :cond_2b

    .line 1441
    .line 1442
    move-object v3, v1

    .line 1443
    check-cast v3, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1444
    .line 1445
    :cond_2b
    if-eqz v3, :cond_2d

    .line 1446
    .line 1447
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v1

    .line 1451
    if-nez v1, :cond_2c

    .line 1452
    .line 1453
    goto :goto_20

    .line 1454
    :cond_2c
    :goto_1f
    const/4 v4, 0x1

    .line 1455
    goto :goto_21

    .line 1456
    :cond_2d
    :goto_20
    const v1, 0x7f130238

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v1

    .line 1463
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1464
    .line 1465
    .line 1466
    goto :goto_1f

    .line 1467
    :goto_21
    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1472
    .line 1473
    .line 1474
    :cond_2e
    return-void

    .line 1475
    :pswitch_1a
    iget-object v1, v0, Lws1;->p:Ljava/lang/Object;

    .line 1476
    .line 1477
    check-cast v1, Lcom/eddyizm/tempus/homemusic/HubShareActivity;

    .line 1478
    .line 1479
    iget-object v0, v0, Lws1;->o:Ljava/lang/Object;

    .line 1480
    .line 1481
    check-cast v0, Ljava/lang/String;

    .line 1482
    .line 1483
    sget-object v2, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Lux3;

    .line 1484
    .line 1485
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1486
    .line 1487
    .line 1488
    move-result v2

    .line 1489
    if-nez v2, :cond_31

    .line 1490
    .line 1491
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 1492
    .line 1493
    .line 1494
    move-result v2

    .line 1495
    if-eqz v2, :cond_2f

    .line 1496
    .line 1497
    goto :goto_22

    .line 1498
    :cond_2f
    iget-object v1, v1, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->N:Ljv3;

    .line 1499
    .line 1500
    if-eqz v1, :cond_30

    .line 1501
    .line 1502
    iget-object v1, v1, Ljv3;->p:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v1, Landroid/widget/TextView;

    .line 1505
    .line 1506
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1507
    .line 1508
    .line 1509
    goto :goto_22

    .line 1510
    :cond_30
    const-string v0, "bind"

    .line 1511
    .line 1512
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 1513
    .line 1514
    .line 1515
    throw v3

    .line 1516
    :cond_31
    :goto_22
    return-void

    .line 1517
    :pswitch_1b
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 1518
    .line 1519
    check-cast v1, Lcom/eddyizm/tempus/homemusic/HubShareActivity;

    .line 1520
    .line 1521
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 1522
    .line 1523
    check-cast v0, Ljava/lang/Exception;

    .line 1524
    .line 1525
    sget-object v2, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Lux3;

    .line 1526
    .line 1527
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    if-nez v0, :cond_32

    .line 1532
    .line 1533
    const v0, 0x7f130229

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v0

    .line 1540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1541
    .line 1542
    .line 1543
    :cond_32
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->p(Ljava/lang/String;)V

    .line 1544
    .line 1545
    .line 1546
    return-void

    .line 1547
    :pswitch_1c
    iget-object v1, v0, Lws1;->o:Ljava/lang/Object;

    .line 1548
    .line 1549
    move-object v6, v1

    .line 1550
    check-cast v6, Ljava/lang/String;

    .line 1551
    .line 1552
    iget-object v0, v0, Lws1;->p:Ljava/lang/Object;

    .line 1553
    .line 1554
    move-object v1, v0

    .line 1555
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1556
    .line 1557
    if-eqz v6, :cond_33

    .line 1558
    .line 1559
    :try_start_14
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v0

    .line 1563
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->G()Lna4;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    new-instance v5, Lcom/eddyizm/tempus/model/Server;

    .line 1568
    .line 1569
    const-string v7, ""

    .line 1570
    .line 1571
    const-string v8, ""

    .line 1572
    .line 1573
    const-string v9, ""

    .line 1574
    .line 1575
    const-string v10, ""

    .line 1576
    .line 1577
    const/4 v14, 0x0

    .line 1578
    const/4 v15, 0x0

    .line 1579
    const/4 v11, 0x0

    .line 1580
    const-wide/16 v12, 0x0

    .line 1581
    .line 1582
    invoke-direct/range {v5 .. v15}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 1583
    .line 1584
    .line 1585
    iget-object v2, v0, Lna4;->n:Ljava/lang/Object;

    .line 1586
    .line 1587
    check-cast v2, Ls24;

    .line 1588
    .line 1589
    new-instance v3, Lma4;

    .line 1590
    .line 1591
    const/4 v6, 0x1

    .line 1592
    invoke-direct {v3, v0, v5, v6}, Lma4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 1593
    .line 1594
    .line 1595
    invoke-static {v2, v4, v6, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    sget-object v0, Lj15;->a:Lj15;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 1599
    .line 1600
    goto :goto_23

    .line 1601
    :catchall_8
    move-exception v0

    .line 1602
    new-instance v2, Ls14;

    .line 1603
    .line 1604
    invoke-direct {v2, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1605
    .line 1606
    .line 1607
    move-object v0, v2

    .line 1608
    :goto_23
    invoke-static {v0}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    if-eqz v0, :cond_33

    .line 1613
    .line 1614
    const-string v2, "HubSettings"

    .line 1615
    .line 1616
    const-string v3, "Cannot forget the account"

    .line 1617
    .line 1618
    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1619
    .line 1620
    .line 1621
    :cond_33
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 1622
    .line 1623
    new-instance v2, Lxs1;

    .line 1624
    .line 1625
    invoke-direct {v2, v1, v4}, Lxs1;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1629
    .line 1630
    .line 1631
    return-void

    .line 1632
    nop

    .line 1633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
