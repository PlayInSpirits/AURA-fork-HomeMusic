.class public final synthetic Lt6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lcom/eddyizm/tempus/homemusic/SmartSession;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 19
    const/16 v0, 0x9

    iput v0, p0, Lt6;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6;->o:Ljava/lang/Object;

    iput-object p2, p0, Lt6;->p:Ljava/lang/Object;

    iput-object p3, p0, Lt6;->r:Ljava/lang/Object;

    iput-object p4, p0, Lt6;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p5, p0, Lt6;->n:I

    iput-object p1, p0, Lt6;->o:Ljava/lang/Object;

    iput-object p2, p0, Lt6;->p:Ljava/lang/Object;

    iput-object p3, p0, Lt6;->q:Ljava/lang/Object;

    iput-object p4, p0, Lt6;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Llo2;Lkn2;Ljava/lang/String;Landroid/os/Bundle;Lsk2;)V
    .locals 0

    .line 18
    const/16 p2, 0x11

    iput p2, p0, Lt6;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6;->o:Ljava/lang/Object;

    iput-object p3, p0, Lt6;->p:Ljava/lang/Object;

    iput-object p4, p0, Lt6;->q:Ljava/lang/Object;

    iput-object p5, p0, Lt6;->r:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lpn2;Lfr2;Lnj2;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    const/16 p4, 0xf

    .line 2
    .line 3
    iput p4, p0, Lt6;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lt6;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lt6;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lt6;->q:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p5, p0, Lt6;->r:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Lpn2;Ljava/util/concurrent/atomic/AtomicInteger;Lyw1;Ljava/util/ArrayList;Llb4;)V
    .locals 0

    .line 17
    const/16 p1, 0xd

    iput p1, p0, Lt6;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt6;->o:Ljava/lang/Object;

    iput-object p3, p0, Lt6;->p:Ljava/lang/Object;

    iput-object p4, p0, Lt6;->q:Ljava/lang/Object;

    iput-object p5, p0, Lt6;->r:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llo2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lsk2;

    .line 16
    .line 17
    iget-object v3, v0, Llo2;->r:Lh41;

    .line 18
    .line 19
    new-instance v4, Lv6;

    .line 20
    .line 21
    invoke-direct {v4, v0, p0, v1, v2}, Lv6;-><init>(Llo2;Lsk2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v4}, Lh41;->execute(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llo2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lbl2;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lko2;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lkn2;

    .line 16
    .line 17
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    invoke-virtual {v1, v4, v5, v3}, Lu0;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lsk2;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Llo2;->d(Lkn2;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v3, v2, Lko2;->n:Landroidx/media3/session/MediaLibraryService;

    .line 34
    .line 35
    iget-object v4, v2, Lko2;->o:Lkn2;

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-virtual {v3, v4, v5}, Landroidx/media3/session/MediaLibraryService;->k(Lkn2;Z)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v1, v2}, Lsk2;->v(Loi3;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    iget-object v0, v0, Llo2;->n:Landroidx/media3/session/MediaLibraryService;

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Landroidx/media3/session/MediaLibraryService;->l(Lkn2;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnq2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lzh0;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lsp2;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2, p0}, Lzh0;->D(Lnq2;Lsp2;Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnq2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lzh0;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lsp2;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/Collection;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2, p0}, Lzh0;->D(Lnq2;Lsp2;Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final e()V
    .locals 9

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llr0;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-ne v1, v3, :cond_3

    .line 26
    .line 27
    new-instance v1, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ge v3, v4, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Lic2;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    :try_start_0
    invoke-static {v4}, Lhw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catch_0
    move-exception v4

    .line 56
    goto :goto_1

    .line 57
    :catch_1
    move-exception v4

    .line 58
    :goto_1
    const-string v6, "MediaSessionLegacyStub"

    .line 59
    .line 60
    const-string v7, "Failed to get bitmap"

    .line 61
    .line 62
    invoke-static {v6, v7, v4}, Ll93;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    move-object v4, v5

    .line 66
    :goto_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    check-cast v6, Lgn2;

    .line 71
    .line 72
    invoke-static {v6, v4}, Lf92;->i(Lgn2;Landroid/graphics/Bitmap;)Lpm2;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/4 v6, -0x1

    .line 77
    if-ne v3, v6, :cond_1

    .line 78
    .line 79
    const-wide/16 v6, -0x1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_1
    int-to-long v6, v3

    .line 83
    :goto_3
    new-instance v8, Lor2;

    .line 84
    .line 85
    invoke-direct {v8, v5, v4, v6, v7}, Lor2;-><init>(Landroid/media/session/MediaSession$QueueItem;Lpm2;J)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iget-object p0, v0, Llr0;->r:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Lls2;

    .line 97
    .line 98
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 99
    .line 100
    invoke-static {p0, v1}, Lls2;->E(Lqr2;Ljava/util/ArrayList;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void
.end method

.method private final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lpn2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lfr2;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lq90;

    .line 16
    .line 17
    iget-object v0, v0, Lpn2;->w:Ltn2;

    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ltn2;->p(Lfr2;)Ldr2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lq90;->d()Z

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method private final g()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v5, v1

    .line 6
    check-cast v5, Lkt2;

    .line 7
    .line 8
    iget-object v1, v0, Lt6;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lfr2;

    .line 11
    .line 12
    iget-object v2, v0, Lt6;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ltn2;

    .line 15
    .line 16
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lju1;

    .line 20
    .line 21
    iget-object v0, v5, Lkt2;->f:Lna4;

    .line 22
    .line 23
    const-string v4, "Controller "

    .line 24
    .line 25
    const/16 v17, 0x0

    .line 26
    .line 27
    :try_start_0
    iget-object v6, v5, Lkt2;->g:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v6, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ltn2;->l()Z

    .line 33
    .line 34
    .line 35
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    invoke-static {v3}, Lau0;->k(Lju1;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    :try_start_1
    iget-object v6, v1, Lfr2;->d:Ler2;

    .line 43
    .line 44
    check-cast v6, Lft2;

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v6, v6, Lft2;->n:Lju1;

    .line 50
    .line 51
    invoke-interface {v6}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-virtual {v2, v1}, Ltn2;->p(Lfr2;)Ldr2;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v0, v1}, Lna4;->F(Lfr2;)Z

    .line 60
    .line 61
    .line 62
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    const-string v9, "MediaSessionStub"

    .line 64
    .line 65
    if-eqz v8, :cond_1

    .line 66
    .line 67
    :try_start_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v4, " has sent connection request multiple times"

    .line 76
    .line 77
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v9, v4}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_1
    :goto_0
    iget-object v4, v7, Ldr2;->a:Lwa4;

    .line 92
    .line 93
    iget-object v8, v7, Ldr2;->b:Lmi3;

    .line 94
    .line 95
    invoke-virtual {v0, v6, v1, v4, v8}, Lna4;->a(Ljava/lang/Object;Lfr2;Lwa4;Lmi3;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lna4;->C(Lfr2;)Lyk;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-nez v0, :cond_2

    .line 103
    .line 104
    const-string v0, "Ignoring connection request from unknown controller info"

    .line 105
    .line 106
    invoke-static {v9, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Lau0;->k(Lju1;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_2
    :try_start_3
    iget-object v4, v2, Ltn2;->s:Lal3;

    .line 114
    .line 115
    iget-object v6, v2, Ltn2;->r:Llk3;

    .line 116
    .line 117
    iget-object v11, v7, Ldr2;->b:Lmi3;

    .line 118
    .line 119
    invoke-virtual {v5, v6}, Lkt2;->X(Llk3;)Llk3;

    .line 120
    .line 121
    .line 122
    move-result-object v15

    .line 123
    iget-object v6, v2, Ltn2;->h:Lls2;

    .line 124
    .line 125
    iget-object v6, v6, Lls2;->m:Lqr2;

    .line 126
    .line 127
    iget-object v6, v6, Lqr2;->o:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v6, Lkr2;

    .line 130
    .line 131
    iget-object v6, v6, Lkr2;->c:Lpr2;

    .line 132
    .line 133
    iget-object v6, v6, Lpr2;->o:Landroid/media/session/MediaSession$Token;

    .line 134
    .line 135
    new-instance v8, Loa0;

    .line 136
    .line 137
    move-object/from16 v16, v6

    .line 138
    .line 139
    iget-object v6, v2, Ltn2;->t:Landroid/app/PendingIntent;

    .line 140
    .line 141
    iget-object v9, v7, Ldr2;->c:Lyw1;

    .line 142
    .line 143
    if-eqz v9, :cond_3

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    iget-object v9, v2, Ltn2;->z:Lyw1;

    .line 147
    .line 148
    :goto_1
    iget-object v10, v7, Ldr2;->d:Lyw1;

    .line 149
    .line 150
    if-eqz v10, :cond_4

    .line 151
    .line 152
    :goto_2
    move-object v12, v9

    .line 153
    goto :goto_3

    .line 154
    :cond_4
    iget-object v10, v2, Ltn2;->A:Lyw1;

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :goto_3
    iget-object v9, v2, Ltn2;->q:Lyw1;

    .line 158
    .line 159
    iget-object v7, v7, Ldr2;->a:Lwa4;

    .line 160
    .line 161
    invoke-virtual {v4}, Lal3;->o()Lmi3;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    iget-object v13, v2, Ltn2;->j:Lcb4;

    .line 166
    .line 167
    iget-object v13, v13, Lcb4;->a:Lbb4;

    .line 168
    .line 169
    invoke-interface {v13}, Lbb4;->getExtras()Landroid/os/Bundle;

    .line 170
    .line 171
    .line 172
    move-result-object v13

    .line 173
    iget-object v14, v2, Ltn2;->B:Landroid/os/Bundle;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    .line 175
    move-object/from16 v18, v3

    .line 176
    .line 177
    const v3, 0x3c24273c

    .line 178
    .line 179
    .line 180
    move-object/from16 v19, v2

    .line 181
    .line 182
    move-object v2, v8

    .line 183
    move-object v8, v10

    .line 184
    move-object v10, v7

    .line 185
    move-object v7, v12

    .line 186
    move-object v12, v4

    .line 187
    const/16 v4, 0x8

    .line 188
    .line 189
    move-object/from16 p0, v19

    .line 190
    .line 191
    :try_start_4
    invoke-direct/range {v2 .. v16}, Loa0;-><init>(IILpu1;Landroid/app/PendingIntent;Lyw1;Lyw1;Lyw1;Lwa4;Lmi3;Lmi3;Landroid/os/Bundle;Landroid/os/Bundle;Llk3;Landroid/media/session/MediaSession$Token;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {p0 .. p0}, Ltn2;->l()Z

    .line 195
    .line 196
    .line 197
    move-result v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 198
    if-eqz v3, :cond_5

    .line 199
    .line 200
    invoke-static/range {v18 .. v18}, Lau0;->k(Lju1;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_5
    :try_start_5
    invoke-virtual {v0}, Lyk;->s()I

    .line 205
    .line 206
    .line 207
    move-result v0
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 208
    move-object/from16 v3, v18

    .line 209
    .line 210
    :try_start_6
    instance-of v4, v3, Lmm2;

    .line 211
    .line 212
    if-eqz v4, :cond_6

    .line 213
    .line 214
    new-instance v4, Landroid/os/Bundle;

    .line 215
    .line 216
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 217
    .line 218
    .line 219
    sget-object v5, Loa0;->B:Ljava/lang/String;

    .line 220
    .line 221
    new-instance v6, Lna0;

    .line 222
    .line 223
    invoke-direct {v6, v2}, Lna0;-><init>(Loa0;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_6
    iget v4, v1, Lfr2;->c:I

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Loa0;->b(I)Landroid/os/Bundle;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    :goto_4
    invoke-interface {v3, v0, v4}, Lju1;->r(ILandroid/os/Bundle;)V
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 237
    .line 238
    .line 239
    const/16 v17, 0x1

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    move-object/from16 v3, v18

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :catch_0
    move-object/from16 v3, v18

    .line 247
    .line 248
    :catch_1
    :goto_5
    if-eqz v17, :cond_8

    .line 249
    .line 250
    move-object/from16 v2, p0

    .line 251
    .line 252
    :try_start_7
    iget-boolean v0, v2, Ltn2;->y:Z

    .line 253
    .line 254
    if-eqz v0, :cond_7

    .line 255
    .line 256
    invoke-static {v1}, Ltn2;->m(Lfr2;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_7

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_7
    iget-object v0, v2, Ltn2;->e:Lpq;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 266
    .line 267
    .line 268
    :cond_8
    :goto_6
    if-nez v17, :cond_9

    .line 269
    .line 270
    invoke-static {v3}, Lau0;->k(Lju1;)V

    .line 271
    .line 272
    .line 273
    :cond_9
    return-void

    .line 274
    :goto_7
    if-nez v17, :cond_a

    .line 275
    .line 276
    invoke-static {v3}, Lau0;->k(Lju1;)V

    .line 277
    .line 278
    .line 279
    :cond_a
    throw v0
.end method

.method private final h()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltn2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Llb4;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lwc0;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lic2;

    .line 16
    .line 17
    invoke-virtual {v0}, Ltn2;->l()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v3, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v3}, Lu0;->l(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    :try_start_0
    invoke-interface {v2, p0}, Lwc0;->accept(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v3}, Lu0;->l(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    invoke-virtual {v1, p0}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltn2;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lht2;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lfr2;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0}, Ltn2;->l()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Ltn2;->s:Lal3;

    .line 24
    .line 25
    invoke-interface {v1, v0, v2, p0}, Lht2;->b(Lal3;Lfr2;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private final j()V
    .locals 9

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmm3;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    check-cast v4, Ljava/lang/String;

    .line 13
    .line 14
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v7, p0

    .line 17
    check-cast v7, Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    :goto_0
    move-object v6, p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v0, v4}, Lmm3;->j(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :goto_1
    const/4 p0, 0x0

    .line 35
    invoke-static {p0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Lpn4;->g()Lrm3;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    invoke-virtual/range {v3 .. v8}, Lrm3;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance v1, Lpz1;

    .line 50
    .line 51
    const/16 v2, 0xd

    .line 52
    .line 53
    invoke-direct {v1, v2, v0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private final k()V
    .locals 8

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lmm3;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v3, v1

    .line 8
    check-cast v3, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lt6;->q:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v7, v1

    .line 13
    check-cast v7, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lhq1;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Lpn4;->g()Lrm3;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v3}, Lmm3;->j(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-virtual/range {v2 .. v7}, Lrm3;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lxc5;

    .line 42
    .line 43
    invoke-direct {v2, v0, p0}, Lxc5;-><init>(Lmm3;Lhq1;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private final l()V
    .locals 6

    .line 1
    iget-object v0, p0, Lt6;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lt6;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lrc5;

    .line 8
    .line 9
    iget-object v2, p0, Lt6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lr90;

    .line 12
    .line 13
    iget-object p0, p0, Lt6;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/work/impl/WorkDatabase;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, La64;

    .line 32
    .line 33
    iget-object v5, v1, Lrc5;->a:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v4, v5}, La64;->d(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v2, p0, v0}, Lc64;->b(Lr90;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lt6;->n:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v4, 0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 15
    .line 16
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 19
    .line 20
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v4, v1, Lkc1;->T:Landroid/view/View;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    iget-object v4, v1, Lkc1;->T:Landroid/view/View;

    .line 39
    .line 40
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const v6, 0x7f130447

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v6, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2, v3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setName(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->s0:Lej;

    .line 71
    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    invoke-virtual {v3, v0}, Lej;->p(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    iget-object v2, v1, Lkc1;->T:Landroid/view/View;

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;->l0:Lae1;

    .line 82
    .line 83
    if-eqz v1, :cond_1

    .line 84
    .line 85
    iget-object v1, v1, Lae1;->a:Landroid/widget/TextView;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const v3, 0x7f130449

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v3, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {v3, v0}, Lej;->p(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    :cond_1
    :goto_0
    return-void

    .line 126
    :pswitch_0
    invoke-direct {v0}, Lt6;->l()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_1
    invoke-direct {v0}, Lt6;->k()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_2
    invoke-direct {v0}, Lt6;->j()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_3
    invoke-direct {v0}, Lt6;->i()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :pswitch_4
    invoke-direct {v0}, Lt6;->h()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_5
    invoke-direct {v0}, Lt6;->g()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :pswitch_6
    invoke-direct {v0}, Lt6;->f()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_7
    invoke-direct {v0}, Lt6;->e()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_8
    invoke-direct {v0}, Lt6;->d()V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_9
    invoke-direct {v0}, Lt6;->c()V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :pswitch_a
    invoke-direct {v0}, Lt6;->b()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_b
    invoke-direct {v0}, Lt6;->a()V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_c
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v1, Ltn2;

    .line 177
    .line 178
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, Llb4;

    .line 181
    .line 182
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, Lfr2;

    .line 185
    .line 186
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v2}, Ltn2;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    check-cast v2, Lm92;

    .line 195
    .line 196
    if-eqz v2, :cond_2

    .line 197
    .line 198
    iget v2, v2, Lm92;->a:I

    .line 199
    .line 200
    if-eqz v2, :cond_3

    .line 201
    .line 202
    :cond_2
    iget-object v2, v3, Lfr2;->d:Ler2;

    .line 203
    .line 204
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    iget-object v4, v1, Ltn2;->E:Lnl1;

    .line 208
    .line 209
    invoke-virtual {v4, v0, v3}, Lu1;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    iget-object v1, v1, Ltn2;->F:Lnl1;

    .line 213
    .line 214
    invoke-virtual {v1, v2, v0}, Lu1;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    :cond_3
    return-void

    .line 218
    :pswitch_d
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Lpn2;

    .line 221
    .line 222
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v2, Lfr2;

    .line 225
    .line 226
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v3, Lnj2;

    .line 229
    .line 230
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Landroid/os/Bundle;

    .line 233
    .line 234
    iget-object v4, v1, Lpn2;->x:Lna4;

    .line 235
    .line 236
    const v5, 0xc355

    .line 237
    .line 238
    .line 239
    invoke-virtual {v4, v2, v5}, Lna4;->I(Lfr2;I)Z

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    if-nez v4, :cond_4

    .line 244
    .line 245
    invoke-virtual {v3, v6}, Luj2;->f(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_4
    iget-object v3, v2, Lfr2;->d:Ler2;

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    check-cast v3, Lon2;

    .line 255
    .line 256
    iget-object v4, v3, Lon2;->n:Ljava/lang/Object;

    .line 257
    .line 258
    monitor-enter v4

    .line 259
    :try_start_0
    iget-object v3, v3, Lon2;->p:Ljava/util/ArrayList;

    .line 260
    .line 261
    new-instance v5, Ltv1;

    .line 262
    .line 263
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    iget-object v3, v1, Lpn2;->z:Ltn2;

    .line 271
    .line 272
    iget-object v3, v3, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 273
    .line 274
    invoke-static {v3, v0}, Lf92;->h(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Bundle;)Ljn2;

    .line 275
    .line 276
    .line 277
    iget-object v0, v1, Lpn2;->z:Ltn2;

    .line 278
    .line 279
    invoke-virtual {v0, v2}, Ltn2;->w(Lfr2;)Lmw1;

    .line 280
    .line 281
    .line 282
    :goto_1
    return-void

    .line 283
    :catchall_0
    move-exception v0

    .line 284
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 285
    throw v0

    .line 286
    :pswitch_e
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v1, Lpn2;

    .line 289
    .line 290
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v2, Lfr2;

    .line 293
    .line 294
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v3, Landroid/os/Bundle;

    .line 297
    .line 298
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Ljava/lang/String;

    .line 301
    .line 302
    iget-object v4, v1, Lpn2;->z:Ltn2;

    .line 303
    .line 304
    iget-object v1, v1, Lpn2;->x:Lna4;

    .line 305
    .line 306
    const v5, 0xc351

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v2, v5}, Lna4;->I(Lfr2;I)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-nez v1, :cond_5

    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_5
    iget-object v1, v4, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 317
    .line 318
    invoke-static {v1, v3}, Lf92;->h(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Bundle;)Ljn2;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v4, v2, v0, v1}, Ltn2;->y(Lfr2;Ljava/lang/String;Ljn2;)Llb4;

    .line 323
    .line 324
    .line 325
    :goto_2
    return-void

    .line 326
    :pswitch_f
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 329
    .line 330
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v2, Lyw1;

    .line 333
    .line 334
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v3, Ljava/util/ArrayList;

    .line 337
    .line 338
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 339
    .line 340
    move-object v4, v0

    .line 341
    check-cast v4, Llb4;

    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-ne v0, v1, :cond_8

    .line 352
    .line 353
    new-instance v1, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 356
    .line 357
    .line 358
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-ge v5, v0, :cond_7

    .line 363
    .line 364
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, Lic2;

    .line 369
    .line 370
    if-eqz v0, :cond_6

    .line 371
    .line 372
    :try_start_2
    invoke-static {v0}, Lhw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    check-cast v0, Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0

    .line 377
    .line 378
    goto :goto_5

    .line 379
    :catch_0
    move-exception v0

    .line 380
    goto :goto_4

    .line 381
    :catch_1
    move-exception v0

    .line 382
    :goto_4
    const-string v7, "MLSLegacyStub"

    .line 383
    .line 384
    const-string v8, "Failed to get bitmap"

    .line 385
    .line 386
    invoke-static {v7, v8, v0}, Ll93;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 387
    .line 388
    .line 389
    :cond_6
    move-object v0, v6

    .line 390
    :goto_5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    check-cast v7, Lgn2;

    .line 395
    .line 396
    invoke-static {v7, v0}, Lf92;->a(Lgn2;Landroid/graphics/Bitmap;)Lij2;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    add-int/lit8 v5, v5, 0x1

    .line 404
    .line 405
    goto :goto_3

    .line 406
    :cond_7
    invoke-virtual {v4, v1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    :cond_8
    return-void

    .line 410
    :pswitch_10
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v1, Lfx3;

    .line 413
    .line 414
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 417
    .line 418
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v3, Landroid/net/nsd/NsdServiceInfo;

    .line 421
    .line 422
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v0, Landroid/widget/ArrayAdapter;

    .line 425
    .line 426
    iget-boolean v1, v1, Lfx3;->n:Z

    .line 427
    .line 428
    if-nez v1, :cond_9

    .line 429
    .line 430
    invoke-virtual {v3}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->clear()V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    check-cast v1, Ljava/util/Collection;

    .line 445
    .line 446
    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 447
    .line 448
    .line 449
    :cond_9
    return-void

    .line 450
    :pswitch_11
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v1, Lfx3;

    .line 453
    .line 454
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v2, Lnc1;

    .line 457
    .line 458
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v3, Landroid/net/nsd/NsdServiceInfo;

    .line 461
    .line 462
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Lf9;

    .line 465
    .line 466
    iget-boolean v1, v1, Lfx3;->n:Z

    .line 467
    .line 468
    if-nez v1, :cond_a

    .line 469
    .line 470
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 471
    .line 472
    .line 473
    move-result v1

    .line 474
    if-nez v1, :cond_a

    .line 475
    .line 476
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-nez v1, :cond_a

    .line 481
    .line 482
    invoke-static {v2, v3, v6}, Lu52;->b(Landroid/content/Context;Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 486
    .line 487
    .line 488
    :cond_a
    return-void

    .line 489
    :pswitch_12
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 490
    .line 491
    move-object v8, v1

    .line 492
    check-cast v8, Ljava/util/Map;

    .line 493
    .line 494
    iget-object v1, v0, Lt6;->p:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v1, Ljava/lang/String;

    .line 497
    .line 498
    iget-object v2, v0, Lt6;->q:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 501
    .line 502
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 503
    .line 504
    move-object v3, v0

    .line 505
    check-cast v3, Ljava/lang/Runnable;

    .line 506
    .line 507
    :try_start_3
    sget-object v0, Lrr1;->a:Lrr1;

    .line 508
    .line 509
    invoke-static {}, Lrr1;->e()Ljava/util/Set;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    const-string v4, "wave_origin_v1"

    .line 514
    .line 515
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    sget-object v7, Lcom/eddyizm/tempus/homemusic/WaveSession;->Companion:Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;

    .line 520
    .line 521
    if-eqz v0, :cond_b

    .line 522
    .line 523
    move-object v10, v1

    .line 524
    goto :goto_6

    .line 525
    :cond_b
    move-object v10, v6

    .line 526
    :goto_6
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    if-eqz v0, :cond_c

    .line 531
    .line 532
    move-object v12, v1

    .line 533
    goto :goto_7

    .line 534
    :cond_c
    move-object v12, v6

    .line 535
    :goto_7
    const/4 v9, 0x0

    .line 536
    const/4 v11, 0x0

    .line 537
    invoke-virtual/range {v7 .. v12}, Lcom/eddyizm/tempus/homemusic/WaveSession$Companion;->startBody(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-static {v0}, Lrr1;->A(Ljava/util/Map;)Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 542
    .line 543
    .line 544
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 545
    goto :goto_8

    .line 546
    :catchall_1
    move-exception v0

    .line 547
    new-instance v1, Ls14;

    .line 548
    .line 549
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 550
    .line 551
    .line 552
    move-object v0, v1

    .line 553
    :goto_8
    sget-object v1, Lio1;->b:Landroid/os/Handler;

    .line 554
    .line 555
    new-instance v4, Lv6;

    .line 556
    .line 557
    const/16 v5, 0x16

    .line 558
    .line 559
    invoke-direct {v4, v2, v0, v3, v5}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 563
    .line 564
    .line 565
    return-void

    .line 566
    :pswitch_13
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 567
    .line 568
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v2, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 571
    .line 572
    iget-object v3, v0, Lt6;->r:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v3, Ljava/lang/String;

    .line 575
    .line 576
    iget-object v0, v0, Lt6;->q:Ljava/lang/Object;

    .line 577
    .line 578
    check-cast v0, Landroid/content/Context;

    .line 579
    .line 580
    instance-of v7, v1, Ls14;

    .line 581
    .line 582
    if-nez v7, :cond_f

    .line 583
    .line 584
    move-object v7, v1

    .line 585
    check-cast v7, Lcom/eddyizm/tempus/homemusic/SmartAddOut;

    .line 586
    .line 587
    invoke-virtual {v2, v3}, Lcom/eddyizm/tempus/homemusic/SmartSession;->accept(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/SmartAddOut;->getStatus()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    const-string v3, "downloading"

    .line 598
    .line 599
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v3

    .line 603
    if-eqz v3, :cond_d

    .line 604
    .line 605
    const v2, 0x7f130237

    .line 606
    .line 607
    .line 608
    goto :goto_9

    .line 609
    :cond_d
    const-string v3, "liked"

    .line 610
    .line 611
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-eqz v2, :cond_e

    .line 616
    .line 617
    const v2, 0x7f13023e

    .line 618
    .line 619
    .line 620
    goto :goto_9

    .line 621
    :cond_e
    const v2, 0x7f130236

    .line 622
    .line 623
    .line 624
    :goto_9
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 629
    .line 630
    .line 631
    :cond_f
    invoke-static {v1}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    if-eqz v1, :cond_13

    .line 636
    .line 637
    const-string v2, "HubSmart"

    .line 638
    .line 639
    const-string v3, "add"

    .line 640
    .line 641
    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 642
    .line 643
    .line 644
    instance-of v2, v1, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 645
    .line 646
    if-eqz v2, :cond_10

    .line 647
    .line 648
    move-object v6, v1

    .line 649
    check-cast v6, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 650
    .line 651
    :cond_10
    if-eqz v6, :cond_11

    .line 652
    .line 653
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    if-nez v1, :cond_12

    .line 658
    .line 659
    :cond_11
    const v1, 0x7f130238

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    :cond_12
    invoke-static {v0, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 674
    .line 675
    .line 676
    :cond_13
    return-void

    .line 677
    :pswitch_14
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v1, Ljava/util/ArrayList;

    .line 680
    .line 681
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v2, Lcom/eddyizm/tempus/homemusic/HubShareActivity;

    .line 684
    .line 685
    iget-object v7, v0, Lt6;->q:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v7, Ljava/util/ArrayList;

    .line 688
    .line 689
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 690
    .line 691
    move-object v8, v0

    .line 692
    check-cast v8, Ljava/lang/String;

    .line 693
    .line 694
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Lux3;

    .line 695
    .line 696
    const-string v9, "HubShareActivity"

    .line 697
    .line 698
    const-string v10, "/assistant/"

    .line 699
    .line 700
    :try_start_4
    invoke-static {}, Lrr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 701
    .line 702
    .line 703
    new-instance v11, Ljx3;

    .line 704
    .line 705
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 706
    .line 707
    .line 708
    new-instance v12, Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 711
    .line 712
    .line 713
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 714
    .line 715
    .line 716
    move-result v0

    .line 717
    const/16 v14, 0xa

    .line 718
    .line 719
    if-nez v0, :cond_19

    .line 720
    .line 721
    invoke-static {v14, v14}, Ll93;->o(II)V

    .line 722
    .line 723
    .line 724
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    div-int/lit8 v15, v0, 0xa

    .line 729
    .line 730
    rem-int/lit8 v16, v0, 0xa

    .line 731
    .line 732
    if-nez v16, :cond_14

    .line 733
    .line 734
    move/from16 v16, v5

    .line 735
    .line 736
    goto :goto_a

    .line 737
    :cond_14
    move/from16 v16, v4

    .line 738
    .line 739
    :goto_a
    add-int v15, v15, v16

    .line 740
    .line 741
    move-object/from16 v16, v6

    .line 742
    .line 743
    new-instance v6, Ljava/util/ArrayList;

    .line 744
    .line 745
    invoke-direct {v6, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 746
    .line 747
    .line 748
    move v15, v5

    .line 749
    :goto_b
    if-ltz v15, :cond_17

    .line 750
    .line 751
    if-ge v15, v0, :cond_17

    .line 752
    .line 753
    sub-int v4, v0, v15

    .line 754
    .line 755
    if-le v14, v4, :cond_15

    .line 756
    .line 757
    goto :goto_c

    .line 758
    :cond_15
    move v4, v14

    .line 759
    :goto_c
    new-instance v14, Ljava/util/ArrayList;

    .line 760
    .line 761
    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 762
    .line 763
    .line 764
    :goto_d
    if-ge v5, v4, :cond_16

    .line 765
    .line 766
    add-int v13, v5, v15

    .line 767
    .line 768
    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v13

    .line 772
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    add-int/lit8 v5, v5, 0x1

    .line 776
    .line 777
    goto :goto_d

    .line 778
    :cond_16
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 779
    .line 780
    .line 781
    add-int/lit8 v15, v15, 0xa

    .line 782
    .line 783
    const/4 v4, 0x1

    .line 784
    const/4 v5, 0x0

    .line 785
    const/16 v14, 0xa

    .line 786
    .line 787
    goto :goto_b

    .line 788
    :cond_17
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 789
    .line 790
    .line 791
    move-result v0

    .line 792
    move-object/from16 v4, v16

    .line 793
    .line 794
    const/4 v5, 0x0

    .line 795
    :goto_e
    if-ge v5, v0, :cond_18

    .line 796
    .line 797
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    add-int/lit8 v5, v5, 0x1

    .line 802
    .line 803
    check-cast v4, Ljava/util/List;

    .line 804
    .line 805
    invoke-virtual {v2}, Ldf;->getResources()Landroid/content/res/Resources;

    .line 806
    .line 807
    .line 808
    move-result-object v13

    .line 809
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 810
    .line 811
    .line 812
    move-result v14

    .line 813
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 814
    .line 815
    .line 816
    move-result v15

    .line 817
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 818
    .line 819
    .line 820
    move-result-object v15

    .line 821
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v15

    .line 825
    const v3, 0x7f120009

    .line 826
    .line 827
    .line 828
    invoke-virtual {v13, v3, v14, v15}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    sget-object v13, Lio1;->b:Landroid/os/Handler;

    .line 836
    .line 837
    new-instance v14, Lws1;

    .line 838
    .line 839
    const/4 v15, 0x2

    .line 840
    invoke-direct {v14, v2, v3, v15}, Lws1;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 844
    .line 845
    .line 846
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 847
    .line 848
    .line 849
    move-result-object v3

    .line 850
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 851
    .line 852
    .line 853
    invoke-static {v3, v4}, Lrr1;->a(Landroid/content/ContentResolver;Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    goto :goto_e

    .line 858
    :catch_2
    move-exception v0

    .line 859
    goto/16 :goto_19

    .line 860
    .line 861
    :cond_18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;->getId()J

    .line 865
    .line 866
    .line 867
    move-result-wide v3

    .line 868
    new-instance v0, Ljava/lang/StringBuilder;

    .line 869
    .line 870
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    iput-object v0, v11, Ljx3;->n:Ljava/lang/Object;

    .line 884
    .line 885
    const v3, 0x7f13022a

    .line 886
    .line 887
    .line 888
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    move-object v3, v0

    .line 893
    goto :goto_f

    .line 894
    :cond_19
    move-object/from16 v16, v6

    .line 895
    .line 896
    move-object/from16 v3, v16

    .line 897
    .line 898
    :goto_f
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    if-nez v0, :cond_20

    .line 903
    .line 904
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    const/4 v0, 0x0

    .line 909
    const/4 v5, 0x0

    .line 910
    const/4 v6, 0x0

    .line 911
    :goto_10
    if-ge v6, v4, :cond_1c

    .line 912
    .line 913
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v13

    .line 917
    add-int/lit8 v6, v6, 0x1

    .line 918
    .line 919
    add-int/lit8 v14, v0, 0x1

    .line 920
    .line 921
    if-ltz v0, :cond_1b

    .line 922
    .line 923
    check-cast v13, Landroid/net/Uri;

    .line 924
    .line 925
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 930
    .line 931
    .line 932
    move-result v15

    .line 933
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 934
    .line 935
    .line 936
    move-result-object v15

    .line 937
    filled-new-array {v0, v15}, [Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v0

    .line 941
    const v15, 0x7f130231

    .line 942
    .line 943
    .line 944
    invoke-virtual {v2, v15, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    sget-object v15, Lio1;->b:Landroid/os/Handler;

    .line 952
    .line 953
    move-object/from16 v18, v1

    .line 954
    .line 955
    new-instance v1, Lws1;

    .line 956
    .line 957
    move-object/from16 v19, v3

    .line 958
    .line 959
    const/4 v3, 0x2

    .line 960
    invoke-direct {v1, v2, v0, v3}, Lws1;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 961
    .line 962
    .line 963
    invoke-virtual {v15, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 964
    .line 965
    .line 966
    :try_start_5
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-static {v0, v13}, Lrr1;->y(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 974
    .line 975
    .line 976
    add-int/lit8 v5, v5, 0x1

    .line 977
    .line 978
    goto :goto_11

    .line 979
    :catch_3
    move-exception v0

    .line 980
    :try_start_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 981
    .line 982
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 983
    .line 984
    .line 985
    const-string v3, "Upload failed for "

    .line 986
    .line 987
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 988
    .line 989
    .line 990
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 991
    .line 992
    .line 993
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    invoke-static {v9, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v1

    .line 1004
    if-nez v1, :cond_1a

    .line 1005
    .line 1006
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    :cond_1a
    invoke-virtual {v12, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    :goto_11
    move v0, v14

    .line 1018
    move-object/from16 v1, v18

    .line 1019
    .line 1020
    move-object/from16 v3, v19

    .line 1021
    .line 1022
    goto :goto_10

    .line 1023
    :cond_1b
    invoke-static {}, Lgb;->c0()V

    .line 1024
    .line 1025
    .line 1026
    throw v16

    .line 1027
    :cond_1c
    move-object/from16 v18, v1

    .line 1028
    .line 1029
    move-object/from16 v19, v3

    .line 1030
    .line 1031
    if-lez v5, :cond_1e

    .line 1032
    .line 1033
    const-string v0, "/upload"

    .line 1034
    .line 1035
    iput-object v0, v11, Ljx3;->n:Ljava/lang/Object;

    .line 1036
    .line 1037
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1038
    .line 1039
    .line 1040
    move-result v0

    .line 1041
    if-nez v0, :cond_1d

    .line 1042
    .line 1043
    const v3, 0x7f13022a

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    :goto_12
    move-object v3, v0

    .line 1051
    goto :goto_13

    .line 1052
    :cond_1d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    const v1, 0x7f130227

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    goto :goto_12

    .line 1068
    :cond_1e
    iget-object v0, v11, Ljx3;->n:Ljava/lang/Object;

    .line 1069
    .line 1070
    if-nez v0, :cond_21

    .line 1071
    .line 1072
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1073
    .line 1074
    invoke-static {v12}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    check-cast v1, Ljava/lang/String;

    .line 1079
    .line 1080
    if-nez v1, :cond_1f

    .line 1081
    .line 1082
    const v1, 0x7f130229

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1090
    .line 1091
    .line 1092
    :cond_1f
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 1093
    .line 1094
    .line 1095
    throw v0

    .line 1096
    :cond_20
    move-object/from16 v18, v1

    .line 1097
    .line 1098
    move-object/from16 v19, v3

    .line 1099
    .line 1100
    :cond_21
    move-object/from16 v3, v19

    .line 1101
    .line 1102
    :goto_13
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    if-eqz v0, :cond_25

    .line 1107
    .line 1108
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v0

    .line 1112
    if-eqz v0, :cond_25

    .line 1113
    .line 1114
    const v0, 0x7f13022e

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v0

    .line 1121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    sget-object v1, Lio1;->b:Landroid/os/Handler;

    .line 1125
    .line 1126
    new-instance v4, Lws1;

    .line 1127
    .line 1128
    const/4 v15, 0x2

    .line 1129
    invoke-direct {v4, v2, v0, v15}, Lws1;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1133
    .line 1134
    .line 1135
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Lux3;

    .line 1136
    .line 1137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1138
    .line 1139
    .line 1140
    iget-object v0, v0, Lux3;->n:Ljava/util/regex/Pattern;

    .line 1141
    .line 1142
    invoke-virtual {v0, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    const/4 v1, 0x0

    .line 1150
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 1151
    .line 1152
    .line 1153
    move-result v4

    .line 1154
    if-nez v4, :cond_22

    .line 1155
    .line 1156
    move-object/from16 v1, v16

    .line 1157
    .line 1158
    goto :goto_14

    .line 1159
    :cond_22
    new-instance v1, Ljv3;

    .line 1160
    .line 1161
    invoke-direct {v1, v0, v8}, Ljv3;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 1162
    .line 1163
    .line 1164
    :goto_14
    if-eqz v1, :cond_23

    .line 1165
    .line 1166
    iget-object v0, v1, Ljv3;->n:Ljava/lang/Object;

    .line 1167
    .line 1168
    check-cast v0, Ljava/util/regex/Matcher;

    .line 1169
    .line 1170
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v6

    .line 1174
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    goto :goto_15

    .line 1178
    :cond_23
    move-object/from16 v6, v16

    .line 1179
    .line 1180
    :goto_15
    if-eqz v6, :cond_24

    .line 1181
    .line 1182
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 1183
    .line 1184
    .line 1185
    move-result v0

    .line 1186
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1187
    .line 1188
    .line 1189
    move-result v1

    .line 1190
    sub-int/2addr v0, v1

    .line 1191
    const/4 v1, 0x1

    .line 1192
    if-gt v0, v1, :cond_24

    .line 1193
    .line 1194
    invoke-static {v8, v6, v1}, Lrr1;->b(Ljava/lang/String;Ljava/lang/String;Z)Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    goto :goto_16

    .line 1199
    :cond_24
    const/4 v1, 0x0

    .line 1200
    invoke-static {v8, v6, v1}, Lrr1;->b(Ljava/lang/String;Ljava/lang/String;Z)Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v0

    .line 1204
    :goto_16
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;->getId()J

    .line 1205
    .line 1206
    .line 1207
    move-result-wide v0

    .line 1208
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1209
    .line 1210
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1217
    .line 1218
    .line 1219
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    iput-object v0, v11, Ljx3;->n:Ljava/lang/Object;

    .line 1224
    .line 1225
    :cond_25
    if-eqz v3, :cond_26

    .line 1226
    .line 1227
    invoke-static {v3}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    goto :goto_17

    .line 1232
    :cond_26
    sget-object v0, Lu01;->n:Lu01;

    .line 1233
    .line 1234
    :goto_17
    new-instance v1, Ljava/util/ArrayList;

    .line 1235
    .line 1236
    const/16 v3, 0xa

    .line 1237
    .line 1238
    invoke-static {v12, v3}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 1239
    .line 1240
    .line 1241
    move-result v3

    .line 1242
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1246
    .line 1247
    .line 1248
    move-result v3

    .line 1249
    const/4 v5, 0x0

    .line 1250
    :goto_18
    if-ge v5, v3, :cond_27

    .line 1251
    .line 1252
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v4

    .line 1256
    add-int/lit8 v5, v5, 0x1

    .line 1257
    .line 1258
    check-cast v4, Ljava/lang/String;

    .line 1259
    .line 1260
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v4

    .line 1264
    const v6, 0x7f13022d

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v2, v6, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v4

    .line 1271
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    goto :goto_18

    .line 1278
    :cond_27
    invoke-static {v0, v1}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v3

    .line 1282
    const-string v4, "\n"

    .line 1283
    .line 1284
    const/4 v7, 0x0

    .line 1285
    const/16 v8, 0x3e

    .line 1286
    .line 1287
    const/4 v5, 0x0

    .line 1288
    const/4 v6, 0x0

    .line 1289
    invoke-static/range {v3 .. v8}, Lq40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lif1;I)Ljava/lang/String;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v0

    .line 1293
    sget-object v1, Lio1;->b:Landroid/os/Handler;

    .line 1294
    .line 1295
    new-instance v3, Lv6;

    .line 1296
    .line 1297
    const/16 v4, 0x10

    .line 1298
    .line 1299
    invoke-direct {v3, v2, v11, v0, v4}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 1303
    .line 1304
    .line 1305
    goto :goto_1a

    .line 1306
    :goto_19
    const-string v1, "Share failed"

    .line 1307
    .line 1308
    invoke-static {v9, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1309
    .line 1310
    .line 1311
    sget-object v1, Lio1;->b:Landroid/os/Handler;

    .line 1312
    .line 1313
    new-instance v3, Lws1;

    .line 1314
    .line 1315
    const/4 v4, 0x1

    .line 1316
    invoke-direct {v3, v4, v2, v0}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1320
    .line 1321
    .line 1322
    :goto_1a
    return-void

    .line 1323
    :pswitch_15
    move-object/from16 v16, v6

    .line 1324
    .line 1325
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 1326
    .line 1327
    move-object v3, v1

    .line 1328
    check-cast v3, Lvb4;

    .line 1329
    .line 1330
    iget-object v1, v0, Lt6;->p:Ljava/lang/Object;

    .line 1331
    .line 1332
    move-object v5, v1

    .line 1333
    check-cast v5, Ljx3;

    .line 1334
    .line 1335
    iget-object v1, v0, Lt6;->q:Ljava/lang/Object;

    .line 1336
    .line 1337
    move-object v7, v1

    .line 1338
    check-cast v7, Ljx3;

    .line 1339
    .line 1340
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 1341
    .line 1342
    move-object v8, v0

    .line 1343
    check-cast v8, Landroidx/preference/Preference;

    .line 1344
    .line 1345
    :try_start_7
    const-string v0, "/api/auth/options"

    .line 1346
    .line 1347
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 1348
    .line 1349
    move-object/from16 v2, v16

    .line 1350
    .line 1351
    invoke-static {v2, v0, v1}, Lrr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v0

    .line 1355
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;

    .line 1356
    .line 1357
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubAuthOptions;->getGoogleClientId()Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1361
    move-object v2, v0

    .line 1362
    goto :goto_1b

    .line 1363
    :catchall_2
    move-exception v0

    .line 1364
    new-instance v1, Ls14;

    .line 1365
    .line 1366
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1367
    .line 1368
    .line 1369
    move-object v2, v1

    .line 1370
    :goto_1b
    instance-of v0, v2, Ls14;

    .line 1371
    .line 1372
    if-eqz v0, :cond_28

    .line 1373
    .line 1374
    const/4 v2, 0x0

    .line 1375
    :cond_28
    move-object v6, v2

    .line 1376
    check-cast v6, Ljava/lang/String;

    .line 1377
    .line 1378
    if-eqz v6, :cond_2b

    .line 1379
    .line 1380
    invoke-static {v6}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v0

    .line 1384
    if-eqz v0, :cond_29

    .line 1385
    .line 1386
    goto :goto_1e

    .line 1387
    :cond_29
    :try_start_8
    invoke-static {}, Lrr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1391
    goto :goto_1c

    .line 1392
    :catchall_3
    move-exception v0

    .line 1393
    new-instance v1, Ls14;

    .line 1394
    .line 1395
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1396
    .line 1397
    .line 1398
    move-object v0, v1

    .line 1399
    :goto_1c
    nop

    .line 1400
    instance-of v1, v0, Ls14;

    .line 1401
    .line 1402
    if-eqz v1, :cond_2a

    .line 1403
    .line 1404
    const/16 v16, 0x0

    .line 1405
    .line 1406
    goto :goto_1d

    .line 1407
    :cond_2a
    move-object/from16 v16, v0

    .line 1408
    .line 1409
    :goto_1d
    move-object/from16 v0, v16

    .line 1410
    .line 1411
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 1412
    .line 1413
    move-object v4, v0

    .line 1414
    goto :goto_1f

    .line 1415
    :cond_2b
    :goto_1e
    const/4 v4, 0x0

    .line 1416
    :goto_1f
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 1417
    .line 1418
    new-instance v2, Lup;

    .line 1419
    .line 1420
    invoke-direct/range {v2 .. v8}, Lup;-><init>(Lvb4;Lcom/eddyizm/tempus/homemusic/HubMe;Ljx3;Ljava/lang/String;Ljx3;Landroidx/preference/Preference;)V

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1424
    .line 1425
    .line 1426
    return-void

    .line 1427
    :pswitch_16
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 1428
    .line 1429
    move-object v4, v1

    .line 1430
    check-cast v4, Ljava/lang/String;

    .line 1431
    .line 1432
    iget-object v1, v0, Lt6;->p:Ljava/lang/Object;

    .line 1433
    .line 1434
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 1435
    .line 1436
    iget-object v2, v0, Lt6;->q:Ljava/lang/Object;

    .line 1437
    .line 1438
    move-object v8, v2

    .line 1439
    check-cast v8, Ljava/lang/String;

    .line 1440
    .line 1441
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 1442
    .line 1443
    move-object v2, v0

    .line 1444
    check-cast v2, Lfx3;

    .line 1445
    .line 1446
    :try_start_9
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v1

    .line 1454
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v3

    .line 1458
    invoke-static {v4, v0, v1, v8, v3}, Lrr1;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1459
    .line 1460
    .line 1461
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 1462
    .line 1463
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 1464
    .line 1465
    new-instance v1, Lkt1;

    .line 1466
    .line 1467
    const/4 v15, 0x2

    .line 1468
    invoke-direct {v1, v15, v4}, Lkt1;-><init>(ILjava/lang/String;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    .line 1472
    .line 1473
    .line 1474
    goto :goto_20

    .line 1475
    :catch_4
    move-exception v0

    .line 1476
    const-string v1, "HubDislikes"

    .line 1477
    .line 1478
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v0

    .line 1482
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1483
    .line 1484
    const-string v5, "dislike "

    .line 1485
    .line 1486
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1490
    .line 1491
    .line 1492
    const-string v5, ": "

    .line 1493
    .line 1494
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1498
    .line 1499
    .line 1500
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1505
    .line 1506
    .line 1507
    const/4 v1, 0x1

    .line 1508
    iput-boolean v1, v2, Lfx3;->n:Z

    .line 1509
    .line 1510
    sget-object v2, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Lih3;

    .line 1511
    .line 1512
    const-string v3, "dislike"

    .line 1513
    .line 1514
    invoke-static {}, Lrs1;->f()Ljava/lang/String;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v5

    .line 1518
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1519
    .line 1520
    .line 1521
    move-result-wide v6

    .line 1522
    const/16 v9, 0x3fb0

    .line 1523
    .line 1524
    invoke-static/range {v2 .. v9}, Lih3;->c(Lih3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;I)Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    invoke-static {v0}, Lrs1;->j(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V

    .line 1529
    .line 1530
    .line 1531
    :goto_20
    return-void

    .line 1532
    :pswitch_17
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 1533
    .line 1534
    check-cast v1, Lcp1;

    .line 1535
    .line 1536
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 1537
    .line 1538
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 1539
    .line 1540
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 1541
    .line 1542
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1543
    .line 1544
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 1545
    .line 1546
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 1547
    .line 1548
    iget-object v1, v1, Lkc1;->T:Landroid/view/View;

    .line 1549
    .line 1550
    if-nez v1, :cond_2c

    .line 1551
    .line 1552
    goto :goto_22

    .line 1553
    :cond_2c
    if-nez v2, :cond_2d

    .line 1554
    .line 1555
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMix;->getId()J

    .line 1556
    .line 1557
    .line 1558
    move-result-wide v0

    .line 1559
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1560
    .line 1561
    const-string v4, "/mix/"

    .line 1562
    .line 1563
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1564
    .line 1565
    .line 1566
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    invoke-static {v3, v0}, Ljs1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V

    .line 1574
    .line 1575
    .line 1576
    goto :goto_22

    .line 1577
    :cond_2d
    new-instance v4, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 1578
    .line 1579
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v5

    .line 1583
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 1584
    .line 1585
    .line 1586
    move-result-object v1

    .line 1587
    if-nez v1, :cond_2e

    .line 1588
    .line 1589
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMix;->getTitle()Ljava/lang/String;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v1

    .line 1593
    :cond_2e
    move-object v6, v1

    .line 1594
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 1595
    .line 1596
    .line 1597
    move-result-wide v7

    .line 1598
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 1599
    .line 1600
    .line 1601
    move-result-object v9

    .line 1602
    invoke-direct/range {v4 .. v9}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 1606
    .line 1607
    .line 1608
    move-result v0

    .line 1609
    invoke-virtual {v4, v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setSongCount(I)V

    .line 1610
    .line 1611
    .line 1612
    new-instance v0, Landroid/os/Bundle;

    .line 1613
    .line 1614
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1615
    .line 1616
    .line 1617
    const-string v1, "PLAYLIST_OBJECT"

    .line 1618
    .line 1619
    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1620
    .line 1621
    .line 1622
    :try_start_a
    iget-object v1, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 1623
    .line 1624
    const v2, 0x7f0a0061

    .line 1625
    .line 1626
    .line 1627
    const/4 v3, 0x0

    .line 1628
    invoke-virtual {v1, v2, v0, v3}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 1629
    .line 1630
    .line 1631
    sget-object v0, Lj15;->a:Lj15;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 1632
    .line 1633
    goto :goto_21

    .line 1634
    :catchall_4
    move-exception v0

    .line 1635
    new-instance v1, Ls14;

    .line 1636
    .line 1637
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1638
    .line 1639
    .line 1640
    move-object v0, v1

    .line 1641
    :goto_21
    invoke-static {v0}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v0

    .line 1645
    if-eqz v0, :cond_2f

    .line 1646
    .line 1647
    const-string v1, "HomeMixCards"

    .line 1648
    .line 1649
    const-string v2, "open the mix"

    .line 1650
    .line 1651
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1652
    .line 1653
    .line 1654
    :cond_2f
    :goto_22
    return-void

    .line 1655
    :pswitch_18
    move-object v3, v6

    .line 1656
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v1, Ljava/lang/String;

    .line 1659
    .line 1660
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 1661
    .line 1662
    move-object v5, v2

    .line 1663
    check-cast v5, Lcp1;

    .line 1664
    .line 1665
    iget-object v2, v0, Lt6;->q:Ljava/lang/Object;

    .line 1666
    .line 1667
    move-object v7, v2

    .line 1668
    check-cast v7, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1669
    .line 1670
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 1671
    .line 1672
    move-object v8, v0

    .line 1673
    check-cast v8, Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 1674
    .line 1675
    const/16 v17, 0x0

    .line 1676
    .line 1677
    :try_start_b
    invoke-static/range {v17 .. v17}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    invoke-virtual {v0}, Lpn4;->g()Lrm3;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    invoke-virtual {v0, v1}, Lrm3;->F(Ljava/lang/String;)Lretrofit2/Call;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v0

    .line 1689
    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v0

    .line 1697
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 1698
    .line 1699
    if-eqz v0, :cond_30

    .line 1700
    .line 1701
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    if-eqz v0, :cond_30

    .line 1706
    .line 1707
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1711
    goto :goto_24

    .line 1712
    :catchall_5
    move-exception v0

    .line 1713
    goto :goto_23

    .line 1714
    :cond_30
    move-object v2, v3

    .line 1715
    goto :goto_24

    .line 1716
    :goto_23
    new-instance v2, Ls14;

    .line 1717
    .line 1718
    invoke-direct {v2, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 1719
    .line 1720
    .line 1721
    :goto_24
    instance-of v0, v2, Ls14;

    .line 1722
    .line 1723
    if-eqz v0, :cond_31

    .line 1724
    .line 1725
    move-object v6, v3

    .line 1726
    goto :goto_25

    .line 1727
    :cond_31
    move-object v6, v2

    .line 1728
    :goto_25
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 1729
    .line 1730
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 1731
    .line 1732
    new-instance v4, Lt6;

    .line 1733
    .line 1734
    const/4 v9, 0x5

    .line 1735
    invoke-direct/range {v4 .. v9}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1739
    .line 1740
    .line 1741
    return-void

    .line 1742
    :pswitch_19
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 1743
    .line 1744
    check-cast v1, Lna4;

    .line 1745
    .line 1746
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 1747
    .line 1748
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1749
    .line 1750
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 1751
    .line 1752
    check-cast v3, Lba0;

    .line 1753
    .line 1754
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 1755
    .line 1756
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1757
    .line 1758
    iget-object v4, v1, Lna4;->n:Ljava/lang/Object;

    .line 1759
    .line 1760
    monitor-enter v4

    .line 1761
    :try_start_c
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 1762
    .line 1763
    .line 1764
    move-result v2

    .line 1765
    if-nez v2, :cond_32

    .line 1766
    .line 1767
    invoke-virtual {v1, v3}, Lna4;->r(Lba0;)V

    .line 1768
    .line 1769
    .line 1770
    goto :goto_26

    .line 1771
    :catchall_6
    move-exception v0

    .line 1772
    goto :goto_27

    .line 1773
    :cond_32
    const/4 v1, 0x1

    .line 1774
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1775
    .line 1776
    .line 1777
    :goto_26
    monitor-exit v4

    .line 1778
    return-void

    .line 1779
    :goto_27
    monitor-exit v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 1780
    throw v0

    .line 1781
    :pswitch_1a
    move-object v3, v6

    .line 1782
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 1783
    .line 1784
    check-cast v1, Lqi3;

    .line 1785
    .line 1786
    iget-object v4, v0, Lt6;->p:Ljava/lang/Object;

    .line 1787
    .line 1788
    check-cast v4, Ljava/lang/String;

    .line 1789
    .line 1790
    iget-object v5, v0, Lt6;->q:Ljava/lang/Object;

    .line 1791
    .line 1792
    check-cast v5, Ljava/lang/String;

    .line 1793
    .line 1794
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 1795
    .line 1796
    check-cast v0, Lcom/eddyizm/tempus/service/MediaService;

    .line 1797
    .line 1798
    const-string v6, "stationName"

    .line 1799
    .line 1800
    const-string v7, "radioTitle"

    .line 1801
    .line 1802
    const-string v8, "radioArtist"

    .line 1803
    .line 1804
    invoke-interface {v1}, Lqi3;->a()Lgn2;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v9

    .line 1808
    if-nez v9, :cond_33

    .line 1809
    .line 1810
    goto/16 :goto_2f

    .line 1811
    .line 1812
    :cond_33
    iget-object v10, v9, Lgn2;->d:Ldo2;

    .line 1813
    .line 1814
    invoke-interface {v1}, Lqi3;->o0()I

    .line 1815
    .line 1816
    .line 1817
    move-result v11

    .line 1818
    if-ne v11, v2, :cond_34

    .line 1819
    .line 1820
    goto/16 :goto_2f

    .line 1821
    .line 1822
    :cond_34
    iget-object v2, v10, Ldo2;->I:Landroid/os/Bundle;

    .line 1823
    .line 1824
    iget-object v12, v10, Ldo2;->a:Ljava/lang/CharSequence;

    .line 1825
    .line 1826
    if-eqz v2, :cond_35

    .line 1827
    .line 1828
    const-string v13, "type"

    .line 1829
    .line 1830
    invoke-virtual {v2, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v13

    .line 1834
    goto :goto_28

    .line 1835
    :cond_35
    move-object v13, v3

    .line 1836
    :goto_28
    const-string v14, "radio"

    .line 1837
    .line 1838
    invoke-static {v13, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1839
    .line 1840
    .line 1841
    move-result v13

    .line 1842
    if-nez v13, :cond_36

    .line 1843
    .line 1844
    goto/16 :goto_2f

    .line 1845
    .line 1846
    :cond_36
    iget-object v13, v10, Ldo2;->b:Ljava/lang/CharSequence;

    .line 1847
    .line 1848
    if-eqz v13, :cond_37

    .line 1849
    .line 1850
    invoke-static {v13}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1851
    .line 1852
    .line 1853
    move-result v13

    .line 1854
    if-eqz v13, :cond_4b

    .line 1855
    .line 1856
    :cond_37
    if-eqz v12, :cond_38

    .line 1857
    .line 1858
    invoke-static {v12}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1859
    .line 1860
    .line 1861
    move-result v13

    .line 1862
    if-eqz v13, :cond_4b

    .line 1863
    .line 1864
    :cond_38
    if-eqz v2, :cond_39

    .line 1865
    .line 1866
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v13

    .line 1870
    if-eqz v13, :cond_39

    .line 1871
    .line 1872
    invoke-static {v13}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v13

    .line 1876
    if-eqz v13, :cond_4b

    .line 1877
    .line 1878
    :cond_39
    if-eqz v2, :cond_3a

    .line 1879
    .line 1880
    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v13

    .line 1884
    if-eqz v13, :cond_3a

    .line 1885
    .line 1886
    invoke-static {v13}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1887
    .line 1888
    .line 1889
    move-result v13

    .line 1890
    if-eqz v13, :cond_4b

    .line 1891
    .line 1892
    :cond_3a
    invoke-virtual {v10}, Ldo2;->a()Lco2;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v10

    .line 1896
    new-instance v13, Landroid/os/Bundle;

    .line 1897
    .line 1898
    if-nez v2, :cond_3b

    .line 1899
    .line 1900
    new-instance v14, Landroid/os/Bundle;

    .line 1901
    .line 1902
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 1903
    .line 1904
    .line 1905
    goto :goto_29

    .line 1906
    :cond_3b
    move-object v14, v2

    .line 1907
    :goto_29
    invoke-direct {v13, v14}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1908
    .line 1909
    .line 1910
    if-eqz v4, :cond_3c

    .line 1911
    .line 1912
    invoke-virtual {v13, v8, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1913
    .line 1914
    .line 1915
    :cond_3c
    if-eqz v5, :cond_3d

    .line 1916
    .line 1917
    invoke-virtual {v13, v7, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1918
    .line 1919
    .line 1920
    :cond_3d
    if-eqz v2, :cond_3e

    .line 1921
    .line 1922
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v2

    .line 1926
    if-nez v2, :cond_40

    .line 1927
    .line 1928
    :cond_3e
    if-eqz v12, :cond_3f

    .line 1929
    .line 1930
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v2

    .line 1934
    goto :goto_2a

    .line 1935
    :cond_3f
    const-string v2, ""

    .line 1936
    .line 1937
    :cond_40
    :goto_2a
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1938
    .line 1939
    .line 1940
    move-result v7

    .line 1941
    if-nez v7, :cond_41

    .line 1942
    .line 1943
    invoke-virtual {v13, v6, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1944
    .line 1945
    .line 1946
    :cond_41
    if-eqz v4, :cond_44

    .line 1947
    .line 1948
    invoke-static {v4}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1949
    .line 1950
    .line 1951
    move-result v6

    .line 1952
    if-eqz v6, :cond_42

    .line 1953
    .line 1954
    goto :goto_2b

    .line 1955
    :cond_42
    if-eqz v5, :cond_44

    .line 1956
    .line 1957
    invoke-static {v5}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1958
    .line 1959
    .line 1960
    move-result v6

    .line 1961
    if-eqz v6, :cond_43

    .line 1962
    .line 1963
    goto :goto_2b

    .line 1964
    :cond_43
    const-string v6, " - "

    .line 1965
    .line 1966
    invoke-static {v4, v6, v5}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v4

    .line 1970
    goto :goto_2d

    .line 1971
    :cond_44
    :goto_2b
    if-eqz v5, :cond_46

    .line 1972
    .line 1973
    invoke-static {v5}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1974
    .line 1975
    .line 1976
    move-result v6

    .line 1977
    if-eqz v6, :cond_45

    .line 1978
    .line 1979
    goto :goto_2c

    .line 1980
    :cond_45
    move-object v4, v5

    .line 1981
    goto :goto_2d

    .line 1982
    :cond_46
    :goto_2c
    if-eqz v4, :cond_47

    .line 1983
    .line 1984
    invoke-static {v4}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1985
    .line 1986
    .line 1987
    move-result v5

    .line 1988
    if-eqz v5, :cond_48

    .line 1989
    .line 1990
    :cond_47
    move-object v4, v2

    .line 1991
    :cond_48
    :goto_2d
    iput-object v4, v10, Lco2;->a:Ljava/lang/CharSequence;

    .line 1992
    .line 1993
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1994
    .line 1995
    .line 1996
    move-result v4

    .line 1997
    if-nez v4, :cond_49

    .line 1998
    .line 1999
    iput-object v2, v10, Lco2;->b:Ljava/lang/CharSequence;

    .line 2000
    .line 2001
    :cond_49
    iput-object v13, v10, Lco2;->H:Landroid/os/Bundle;

    .line 2002
    .line 2003
    instance-of v2, v1, Landroidx/media3/exoplayer/ExoPlayer;

    .line 2004
    .line 2005
    if-eqz v2, :cond_4a

    .line 2006
    .line 2007
    move-object v6, v1

    .line 2008
    check-cast v6, Landroidx/media3/exoplayer/ExoPlayer;

    .line 2009
    .line 2010
    goto :goto_2e

    .line 2011
    :cond_4a
    move-object v6, v3

    .line 2012
    :goto_2e
    if-eqz v6, :cond_4b

    .line 2013
    .line 2014
    invoke-virtual {v9}, Lgn2;->a()Ltm2;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v1

    .line 2018
    new-instance v2, Ldo2;

    .line 2019
    .line 2020
    invoke-direct {v2, v10}, Ldo2;-><init>(Lco2;)V

    .line 2021
    .line 2022
    .line 2023
    iput-object v2, v1, Ltm2;->k:Ldo2;

    .line 2024
    .line 2025
    invoke-virtual {v1}, Ltm2;->a()Lgn2;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v1

    .line 2029
    move-object v2, v6

    .line 2030
    check-cast v2, Lfq;

    .line 2031
    .line 2032
    invoke-virtual {v2, v11, v1}, Lfq;->z0(ILgn2;)V

    .line 2033
    .line 2034
    .line 2035
    invoke-virtual {v0, v6}, Lcom/eddyizm/tempus/service/MediaService;->w(Lqi3;)V

    .line 2036
    .line 2037
    .line 2038
    :cond_4b
    :goto_2f
    return-void

    .line 2039
    :pswitch_1b
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 2040
    .line 2041
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 2042
    .line 2043
    iget-object v2, v0, Lt6;->p:Ljava/lang/Object;

    .line 2044
    .line 2045
    check-cast v2, Landroid/widget/TextView;

    .line 2046
    .line 2047
    iget-object v3, v0, Lt6;->q:Ljava/lang/Object;

    .line 2048
    .line 2049
    check-cast v3, Landroid/widget/TextView;

    .line 2050
    .line 2051
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 2052
    .line 2053
    check-cast v0, Landroid/widget/TextView;

    .line 2054
    .line 2055
    const/4 v4, 0x0

    .line 2056
    iput-boolean v4, v1, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->F0:Z

    .line 2057
    .line 2058
    const/4 v1, 0x1

    .line 2059
    if-eqz v2, :cond_4c

    .line 2060
    .line 2061
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2062
    .line 2063
    .line 2064
    :cond_4c
    if-eqz v3, :cond_4d

    .line 2065
    .line 2066
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2067
    .line 2068
    .line 2069
    :cond_4d
    if-eqz v0, :cond_4e

    .line 2070
    .line 2071
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 2072
    .line 2073
    .line 2074
    :cond_4e
    return-void

    .line 2075
    :pswitch_1c
    iget-object v1, v0, Lt6;->o:Ljava/lang/Object;

    .line 2076
    .line 2077
    check-cast v1, Landroid/os/ParcelFileDescriptor;

    .line 2078
    .line 2079
    iget-object v3, v0, Lt6;->p:Ljava/lang/Object;

    .line 2080
    .line 2081
    check-cast v3, Ljava/io/File;

    .line 2082
    .line 2083
    iget-object v4, v0, Lt6;->q:Ljava/lang/Object;

    .line 2084
    .line 2085
    check-cast v4, Landroid/content/Context;

    .line 2086
    .line 2087
    iget-object v0, v0, Lt6;->r:Ljava/lang/Object;

    .line 2088
    .line 2089
    check-cast v0, Landroid/net/Uri;

    .line 2090
    .line 2091
    sget v5, Lcom/eddyizm/tempus/provider/AlbumArtContentProvider;->o:I

    .line 2092
    .line 2093
    const-string v5, "Failed to load image: "

    .line 2094
    .line 2095
    :try_start_d
    new-instance v6, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;

    .line 2096
    .line 2097
    invoke-direct {v6, v1}, Landroid/os/ParcelFileDescriptor$AutoCloseOutputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_6

    .line 2098
    .line 2099
    .line 2100
    if-eqz v3, :cond_4f

    .line 2101
    .line 2102
    goto :goto_31

    .line 2103
    :cond_4f
    :try_start_e
    invoke-static {v4}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v3

    .line 2107
    invoke-virtual {v3}, Lc04;->p()Lvz3;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v3

    .line 2111
    invoke-virtual {v3, v0}, Lvz3;->N(Landroid/net/Uri;)Lvz3;

    .line 2112
    .line 2113
    .line 2114
    move-result-object v0

    .line 2115
    sget-object v3, Lxq0;->d:Lxq0;

    .line 2116
    .line 2117
    invoke-virtual {v0, v3}, Llq;->e(Lxq0;)Llq;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    check-cast v0, Lvz3;

    .line 2122
    .line 2123
    invoke-static {}, Lud3;->R()Z

    .line 2124
    .line 2125
    .line 2126
    move-result v3

    .line 2127
    if-eqz v3, :cond_50

    .line 2128
    .line 2129
    invoke-virtual {v0}, Llq;->l()Llq;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v0

    .line 2133
    check-cast v0, Lvz3;

    .line 2134
    .line 2135
    goto :goto_30

    .line 2136
    :catchall_7
    move-exception v0

    .line 2137
    move-object v2, v0

    .line 2138
    goto :goto_37

    .line 2139
    :cond_50
    :goto_30
    const/high16 v3, -0x80000000

    .line 2140
    .line 2141
    invoke-virtual {v0, v3, v3}, Lvz3;->R(II)Lyz3;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v0

    .line 2145
    invoke-virtual {v0}, Lyz3;->get()Ljava/lang/Object;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v0

    .line 2149
    move-object v3, v0

    .line 2150
    check-cast v3, Ljava/io/File;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 2151
    .line 2152
    :goto_31
    :try_start_f
    new-instance v4, Ljava/io/FileInputStream;

    .line 2153
    .line 2154
    invoke-direct {v4, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 2155
    .line 2156
    .line 2157
    const/16 v0, 0x2000

    .line 2158
    .line 2159
    :try_start_10
    new-array v0, v0, [B

    .line 2160
    .line 2161
    :goto_32
    invoke-virtual {v4, v0}, Ljava/io/InputStream;->read([B)I

    .line 2162
    .line 2163
    .line 2164
    move-result v3

    .line 2165
    if-eq v3, v2, :cond_51

    .line 2166
    .line 2167
    const/4 v7, 0x0

    .line 2168
    invoke-virtual {v6, v0, v7, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 2169
    .line 2170
    .line 2171
    goto :goto_32

    .line 2172
    :catchall_8
    move-exception v0

    .line 2173
    move-object v2, v0

    .line 2174
    goto :goto_33

    .line 2175
    :cond_51
    :try_start_11
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 2176
    .line 2177
    .line 2178
    goto :goto_36

    .line 2179
    :catch_5
    move-exception v0

    .line 2180
    goto :goto_35

    .line 2181
    :goto_33
    :try_start_12
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 2182
    .line 2183
    .line 2184
    goto :goto_34

    .line 2185
    :catchall_9
    move-exception v0

    .line 2186
    :try_start_13
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 2187
    .line 2188
    .line 2189
    :goto_34
    throw v2
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    .line 2190
    :goto_35
    :try_start_14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2191
    .line 2192
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2193
    .line 2194
    .line 2195
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v0

    .line 2202
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2203
    .line 2204
    .line 2205
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v0

    .line 2209
    invoke-virtual {v1, v0}, Landroid/os/ParcelFileDescriptor;->closeWithError(Ljava/lang/String;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 2210
    .line 2211
    .line 2212
    :goto_36
    :try_start_15
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_6

    .line 2213
    .line 2214
    .line 2215
    goto :goto_3a

    .line 2216
    :catch_6
    move-exception v0

    .line 2217
    goto :goto_39

    .line 2218
    :goto_37
    :try_start_16
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_a

    .line 2219
    .line 2220
    .line 2221
    goto :goto_38

    .line 2222
    :catchall_a
    move-exception v0

    .line 2223
    :try_start_17
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 2224
    .line 2225
    .line 2226
    :goto_38
    throw v2
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_6

    .line 2227
    :goto_39
    :try_start_18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2228
    .line 2229
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2230
    .line 2231
    .line 2232
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2233
    .line 2234
    .line 2235
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v0

    .line 2239
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2240
    .line 2241
    .line 2242
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v0

    .line 2246
    invoke-virtual {v1, v0}, Landroid/os/ParcelFileDescriptor;->closeWithError(Ljava/lang/String;)V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_7

    .line 2247
    .line 2248
    .line 2249
    :catch_7
    :goto_3a
    return-void

    .line 2250
    nop

    .line 2251
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
