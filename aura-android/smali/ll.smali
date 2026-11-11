.class public final Lll;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lkg1;
.implements Lpi1;
.implements Lm51;


# instance fields
.field public final synthetic n:I

.field public o:Z

.field public final p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lll;->n:I

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lll;->p:Ljava/lang/Object;

    .line 110
    new-array v0, p1, [J

    iput-object v0, p0, Lll;->q:Ljava/lang/Object;

    .line 111
    new-array p1, p1, [Z

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    iput p1, p0, Lll;->n:I

    packed-switch p1, :pswitch_data_0

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    .line 123
    new-array p2, p1, [F

    iput-object p2, p0, Lll;->p:Ljava/lang/Object;

    .line 124
    new-array p1, p1, [F

    iput-object p1, p0, Lll;->q:Ljava/lang/Object;

    .line 125
    new-instance p1, Ltu;

    invoke-direct {p1}, Ltu;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    return-void

    .line 126
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Lll;->p:Ljava/lang/Object;

    .line 129
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lll;->q:Ljava/lang/Object;

    .line 130
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 131
    iput-boolean p1, p0, Lll;->o:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;Lpn0;Ljava/lang/Boolean;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lll;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    move-object p1, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {p1}, Lxl;->n(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    const/4 v2, 0x0

    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, Lm3;->c(Landroid/media/AudioManager;)Landroid/media/Spatializer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lll;->p:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p1}, Lm3;->b(Landroid/media/Spatializer;)I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-eqz p3, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v0, v2

    .line 42
    :goto_1
    iput-boolean v0, p0, Lll;->o:Z

    .line 43
    .line 44
    new-instance p3, Lkn0;

    .line 45
    .line 46
    invoke-direct {p3, p2}, Lkn0;-><init>(Lpn0;)V

    .line 47
    .line 48
    .line 49
    iput-object p3, p0, Lll;->r:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p2, Landroid/os/Handler;

    .line 52
    .line 53
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, p0, Lll;->q:Ljava/lang/Object;

    .line 64
    .line 65
    new-instance p0, Lym;

    .line 66
    .line 67
    invoke-direct {p0, p2, v2}, Lym;-><init>(Landroid/os/Handler;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, p0, p3}, Lm3;->h(Landroid/media/Spatializer;Lym;Lkn0;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    :goto_2
    iput-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 75
    .line 76
    iput-boolean v2, p0, Lll;->o:Z

    .line 77
    .line 78
    iput-object v1, p0, Lll;->q:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v1, p0, Lll;->r:Ljava/lang/Object;

    .line 81
    .line 82
    :goto_3
    return-void
.end method

.method public constructor <init>(Lc82;Lkn4;Lwp3;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lll;->n:I

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lll;->p:Ljava/lang/Object;

    .line 105
    iput-object p2, p0, Lll;->q:Ljava/lang/Object;

    .line 106
    iput-object p3, p0, Lll;->r:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 107
    iput-boolean p1, p0, Lll;->o:Z

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Ljava/util/List;Lg12;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lll;->n:I

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll;->p:Ljava/lang/Object;

    iput-object p2, p0, Lll;->q:Ljava/lang/Object;

    iput-object p3, p0, Lll;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Looper;Landroid/os/Looper;Ld41;Lvp4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lll;->n:I

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lll;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 89
    invoke-virtual {p5, p2, p1}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    move-result-object p2

    iput-object p2, p0, Lll;->r:Ljava/lang/Object;

    .line 90
    new-instance p2, Lkl;

    .line 91
    invoke-virtual {p5, p3, p1}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    move-result-object p1

    invoke-direct {p2, p0, p1, p4}, Lkl;-><init>(Lll;Lyp4;Ld41;)V

    iput-object p2, p0, Lll;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLbl0;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lll;->n:I

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 93
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 94
    iput-object p3, p0, Lll;->p:Ljava/lang/Object;

    .line 95
    iput-object p1, p0, Lll;->q:Ljava/lang/Object;

    .line 96
    iput-boolean p2, p0, Lll;->o:Z

    .line 97
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljr0;Ldr0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lll;->n:I

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    iput-object p2, p0, Lll;->p:Ljava/lang/Object;

    .line 118
    iget-boolean p2, p2, Ldr0;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 119
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    new-array p1, v0, [Z

    :goto_0
    iput-object p1, p0, Lll;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkr0;Ler0;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lll;->n:I

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    .line 113
    iput-object p2, p0, Lll;->p:Ljava/lang/Object;

    .line 114
    iget-boolean p2, p2, Ler0;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 115
    :cond_0
    iget p1, p1, Lkr0;->t:I

    .line 116
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lll;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm51;Lxn4;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lll;->n:I

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lll;->p:Ljava/lang/Object;

    .line 85
    iput-object p2, p0, Lll;->q:Ljava/lang/Object;

    .line 86
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsd0;Lkf4;)V
    .locals 2

    const/16 v0, 0xb

    iput v0, p0, Lll;->n:I

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance v0, Loy1;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Loy1;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 101
    iput-object p1, p0, Lll;->q:Ljava/lang/Object;

    .line 102
    iput-object p2, p0, Lll;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ltn2;Lfr2;ZLmi3;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lll;->n:I

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lll;->r:Ljava/lang/Object;

    iput-object p2, p0, Lll;->p:Ljava/lang/Object;

    iput-boolean p3, p0, Lll;->o:Z

    iput-object p4, p0, Lll;->q:Ljava/lang/Object;

    return-void
.end method

.method public static c([F[F)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 3
    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    aget v2, p1, v1

    .line 8
    .line 9
    mul-float/2addr v2, v2

    .line 10
    const/16 v3, 0x8

    .line 11
    .line 12
    aget v4, p1, v3

    .line 13
    .line 14
    mul-float/2addr v4, v4

    .line 15
    add-float/2addr v4, v2

    .line 16
    float-to-double v4, v4

    .line 17
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    double-to-float v2, v4

    .line 22
    aget v4, p1, v1

    .line 23
    .line 24
    div-float/2addr v4, v2

    .line 25
    aput v4, p0, v0

    .line 26
    .line 27
    aget p1, p1, v3

    .line 28
    .line 29
    div-float v0, p1, v2

    .line 30
    .line 31
    const/4 v5, 0x2

    .line 32
    aput v0, p0, v5

    .line 33
    .line 34
    neg-float p1, p1

    .line 35
    div-float/2addr p1, v2

    .line 36
    aput p1, p0, v3

    .line 37
    .line 38
    aput v4, p0, v1

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget v0, p0, Lll;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lkr0;

    .line 10
    .line 11
    invoke-static {v0, p0, v1}, Lkr0;->b(Lkr0;Lll;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljr0;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    iget-boolean v2, p0, Lll;->o:Z

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lll;->p:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Ldr0;

    .line 27
    .line 28
    iget-object v2, v2, Ldr0;->g:Lll;

    .line 29
    .line 30
    invoke-static {v2, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, p0, v1}, Ljr0;->f(Lll;Z)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    :goto_0
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, p0, Lll;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :cond_1
    :try_start_1
    const-string p0, "Check failed."

    .line 48
    .line 49
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljr0;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Lll;->o:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ldr0;

    .line 13
    .line 14
    iget-object v1, v1, Ldr0;->g:Lll;

    .line 15
    .line 16
    invoke-static {v1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p0, v2}, Ljr0;->f(Lll;Z)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iput-boolean v2, p0, Lll;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :cond_1
    :try_start_1
    const-string p0, "Check failed."

    .line 34
    .line 35
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p0
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Lll;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldr0;

    .line 4
    .line 5
    iget-object v1, v0, Ldr0;->g:Lll;

    .line 6
    .line 7
    invoke-static {v1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, Lll;->r:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljr0;

    .line 16
    .line 17
    iget-boolean v2, v1, Ljr0;->y:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {v1, p0, v0}, Ljr0;->f(Lll;Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const/4 p0, 0x1

    .line 27
    iput-boolean p0, v0, Ldr0;->f:Z

    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public e(Ljava/util/UUID;Lk31;)Lqm2;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, Lk31;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, v0, Lll;->o:Z

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v3, v0, Lll;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/lang/String;

    .line 22
    .line 23
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_5

    .line 28
    .line 29
    new-instance v4, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    sget-object v5, Lax;->e:Ljava/util/UUID;

    .line 35
    .line 36
    invoke-virtual {v5, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    const-string v6, "text/xml"

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    sget-object v6, Lax;->c:Ljava/util/UUID;

    .line 46
    .line 47
    invoke-virtual {v6, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    const-string v6, "application/json"

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const-string v6, "application/octet-stream"

    .line 57
    .line 58
    :goto_0
    const-string v7, "Content-Type"

    .line 59
    .line 60
    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    const-string v1, "SOAPAction"

    .line 70
    .line 71
    const-string v5, "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"

    .line 72
    .line 73
    invoke-virtual {v4, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object v1, v0, Lll;->r:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/util/HashMap;

    .line 79
    .line 80
    monitor-enter v1

    .line 81
    :try_start_0
    iget-object v5, v0, Lll;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v5, Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 86
    .line 87
    .line 88
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    iget-object v0, v0, Lll;->p:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lbl0;

    .line 92
    .line 93
    invoke-virtual {v0}, Lbl0;->m()Lci0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v1, v2, Lk31;->a:[B

    .line 98
    .line 99
    invoke-static {v0, v3, v1, v4}, Lgb;->w(Lci0;Ljava/lang/String;[BLjava/util/Map;)Lqm2;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    throw v0

    .line 107
    :cond_5
    new-instance v2, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;

    .line 108
    .line 109
    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 110
    .line 111
    sget-object v4, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 112
    .line 113
    const-string v0, "The uri must be set."

    .line 114
    .line 115
    invoke-static {v4, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v3, Lii0;

    .line 119
    .line 120
    const-wide/16 v5, 0x0

    .line 121
    .line 122
    const/4 v7, 0x1

    .line 123
    const/4 v8, 0x0

    .line 124
    const-wide/16 v10, 0x0

    .line 125
    .line 126
    const-wide/16 v12, -0x1

    .line 127
    .line 128
    const/4 v14, 0x0

    .line 129
    const/4 v15, 0x0

    .line 130
    invoke-direct/range {v3 .. v15}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    sget-object v5, Lly3;->t:Lly3;

    .line 134
    .line 135
    new-instance v8, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string v0, "No license URL"

    .line 138
    .line 139
    invoke-direct {v8, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-wide/16 v6, 0x0

    .line 143
    .line 144
    invoke-direct/range {v2 .. v8}, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;-><init>(Lii0;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Exception;)V

    .line 145
    .line 146
    .line 147
    throw v2
.end method

.method public f(Ll31;)Lqm2;
    .locals 9

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const-string v1, "{\"signedRequest\":\""

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p1, Ll31;->a:[B

    .line 10
    .line 11
    const-string v3, "\"}"

    .line 12
    .line 13
    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    filled-new-array {v1, v2, v0}, [[B

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    move v4, v3

    .line 25
    :goto_0
    const/4 v5, 0x3

    .line 26
    if-ge v4, v5, :cond_0

    .line 27
    .line 28
    aget-object v5, v0, v4

    .line 29
    .line 30
    array-length v5, v5

    .line 31
    int-to-long v5, v5

    .line 32
    add-long/2addr v1, v5

    .line 33
    add-int/lit8 v4, v4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    long-to-int v4, v1

    .line 37
    int-to-long v6, v4

    .line 38
    cmp-long v6, v1, v6

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v6, v3

    .line 45
    :goto_1
    const-string v7, "the total number of elements (%s) in the arrays must fit in an int"

    .line 46
    .line 47
    invoke-static {v6, v7, v1, v2}, Lrr2;->m(ZLjava/lang/String;J)V

    .line 48
    .line 49
    .line 50
    new-array v1, v4, [B

    .line 51
    .line 52
    move v2, v3

    .line 53
    move v6, v2

    .line 54
    :goto_2
    if-ge v2, v5, :cond_2

    .line 55
    .line 56
    aget-object v7, v0, v2

    .line 57
    .line 58
    array-length v8, v7

    .line 59
    invoke-static {v7, v3, v1, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    array-length v7, v7

    .line 63
    add-int/2addr v6, v7

    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    iget-object p0, p0, Lll;->p:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, Lbl0;

    .line 70
    .line 71
    invoke-virtual {p0}, Lbl0;->m()Lci0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p1, p1, Ll31;->b:Ljava/lang/String;

    .line 76
    .line 77
    sget-object v0, Liu2;->i:Liu2;

    .line 78
    .line 79
    invoke-virtual {v0}, Liu2;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v3, "Content-Length"

    .line 88
    .line 89
    invoke-static {v3, v2}, Luc5;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    const-string v4, "Content-Type"

    .line 93
    .line 94
    filled-new-array {v4, v0, v3, v2}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v2, 0x0

    .line 99
    const/4 v3, 0x2

    .line 100
    invoke-static {v3, v0, v2}, Lly3;->g(I[Ljava/lang/Object;Lue1;)Lly3;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-static {p0, p1, v1, v0}, Lgb;->w(Lci0;Ljava/lang/String;[BLjava/util/Map;)Lqm2;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method

.method public g()Ljava/io/File;
    .locals 5

    .line 1
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkr0;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ler0;

    .line 9
    .line 10
    iget-object v2, v1, Ler0;->f:Lll;

    .line 11
    .line 12
    if-ne v2, p0, :cond_1

    .line 13
    .line 14
    iget-boolean v2, v1, Ler0;->e:Z

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lll;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, [Z

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    aput-boolean v4, v2, v3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iget-object v1, v1, Ler0;->d:[Ljava/io/File;

    .line 30
    .line 31
    aget-object v1, v1, v3

    .line 32
    .line 33
    iget-object p0, p0, Lll;->r:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lkr0;

    .line 36
    .line 37
    iget-object p0, p0, Lkr0;->n:Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-object v1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    throw p0
.end method

.method public get()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lll;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Glide registry"

    .line 6
    .line 7
    invoke-static {v0}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lll;->o:Z

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :try_start_0
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lcom/bumptech/glide/a;

    .line 21
    .line 22
    iget-object v2, p0, Lll;->q:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p0, Lll;->r:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Lg12;

    .line 29
    .line 30
    invoke-static {v1, v2, v3}, Lfh0;->j(Lcom/bumptech/glide/a;Ljava/util/List;Lg12;)Ley3;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    iput-boolean v0, p0, Lll;->o:Z

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    return-object v1

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    iput-boolean v0, p0, Lll;->o:Z

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_0
    const-string p0, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"

    .line 48
    .line 49
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Lgr2;

    .line 2
    .line 3
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ltn2;

    .line 6
    .line 7
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lfr2;

    .line 10
    .line 11
    iget-boolean v2, p0, Lll;->o:Z

    .line 12
    .line 13
    iget-object p0, p0, Lll;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lmi3;

    .line 16
    .line 17
    iget-object v3, v0, Ltn2;->s:Lal3;

    .line 18
    .line 19
    invoke-static {v3, p1}, Lju2;->f(Lqi3;Lgr2;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, v0, Ltn2;->s:Lal3;

    .line 23
    .line 24
    invoke-static {p1}, Lf35;->I(Lqi3;)Z

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0, v1, p0}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public i(I)Lof4;
    .locals 4

    .line 1
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljr0;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Lll;->o:Z

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ldr0;

    .line 13
    .line 14
    iget-object v1, v1, Ldr0;->g:Lll;

    .line 15
    .line 16
    invoke-static {v1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    new-instance p0, Lct;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-object p0

    .line 29
    :cond_0
    :try_start_1
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ldr0;

    .line 32
    .line 33
    iget-boolean v1, v1, Ldr0;->e:Z

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    iget-object v1, p0, Lll;->q:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, [Z

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    aput-boolean v2, v1, p1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ldr0;

    .line 53
    .line 54
    iget-object v1, v1, Ldr0;->d:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lge3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    :try_start_2
    iget-object v1, v0, Ljr0;->o:Lhr0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Lhr0;->j(Lge3;)Lof4;

    .line 71
    .line 72
    .line 73
    move-result-object p1
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    :try_start_3
    new-instance v1, Lf61;

    .line 75
    .line 76
    new-instance v2, Lbr0;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, v3, v0, p0}, Lbr0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v1, p1, v2}, Lf61;-><init>(Lof4;Lif1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 83
    .line 84
    .line 85
    monitor-exit v0

    .line 86
    return-object v1

    .line 87
    :catch_0
    :try_start_4
    new-instance p0, Lct;

    .line 88
    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 90
    .line 91
    .line 92
    monitor-exit v0

    .line 93
    return-object p0

    .line 94
    :cond_2
    :try_start_5
    const-string p0, "Check failed."

    .line 95
    .line 96
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 102
    :goto_1
    monitor-exit v0

    .line 103
    throw p0
.end method

.method public j([I)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lll;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v2, v1, :cond_1

    .line 15
    .line 16
    aget v4, p1, v2

    .line 17
    .line 18
    iget-object v5, p0, Lll;->q:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, [J

    .line 21
    .line 22
    aget-wide v6, v5, v4

    .line 23
    .line 24
    const-wide/16 v8, 0x1

    .line 25
    .line 26
    add-long/2addr v8, v6

    .line 27
    aput-wide v8, v5, v4

    .line 28
    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    cmp-long v4, v6, v4

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    iput-boolean v3, p0, Lll;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 45
    .line 46
    .line 47
    return v3

    .line 48
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public k([I)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lll;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    array-length v1, p1

    .line 12
    const/4 v2, 0x0

    .line 13
    move v3, v2

    .line 14
    :goto_0
    if-ge v2, v1, :cond_1

    .line 15
    .line 16
    aget v4, p1, v2

    .line 17
    .line 18
    iget-object v5, p0, Lll;->q:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, [J

    .line 21
    .line 22
    aget-wide v6, v5, v4

    .line 23
    .line 24
    const-wide/16 v8, 0x1

    .line 25
    .line 26
    sub-long v10, v6, v8

    .line 27
    .line 28
    aput-wide v10, v5, v4

    .line 29
    .line 30
    cmp-long v4, v6, v8

    .line 31
    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    iput-boolean v3, p0, Lll;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_2

    .line 40
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 44
    .line 45
    .line 46
    return v3

    .line 47
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method public l(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lll;->o:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lyp4;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    new-instance p1, Ljl;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {p1, p0, v1}, Ljl;-><init>(Lll;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lll;->o:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance p1, Ljl;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {p1, p0, v1}, Ljl;-><init>(Lll;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lll;->o:Z

    .line 36
    .line 37
    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ltn2;

    .line 4
    .line 5
    instance-of v1, p1, Ljava/lang/UnsupportedOperationException;

    .line 6
    .line 7
    const-string v2, "MediaSessionImpl"

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "UnsupportedOperationException: Make sure to implement MediaSession.Callback.onPlaybackResumption() if you add a media button receiver to your manifest or if you implement the recent media item contract with your MediaLibraryService."

    .line 12
    .line 13
    invoke-static {v2, v1, p1}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "Failure calling MediaSession.Callback.onPlaybackResumption(): "

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v2, v1, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p1, v0, Ltn2;->s:Lal3;

    .line 39
    .line 40
    invoke-static {p1}, Lf35;->I(Lqi3;)Z

    .line 41
    .line 42
    .line 43
    iget-boolean p1, p0, Lll;->o:Z

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Lll;->p:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lfr2;

    .line 50
    .line 51
    iget-object p0, p0, Lll;->q:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lmi3;

    .line 54
    .line 55
    invoke-virtual {v0, p1, p0}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public p()V
    .locals 3

    .line 1
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseArray;

    .line 4
    .line 5
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lm51;

    .line 8
    .line 9
    invoke-interface {v1}, Lm51;->p()V

    .line 10
    .line 11
    .line 12
    iget-boolean p0, p0, Lll;->o:Z

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    :goto_0
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge p0, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lao4;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    iput-boolean v2, v1, Lao4;->i:Z

    .line 31
    .line 32
    add-int/lit8 p0, p0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method public t(II)Lwv4;
    .locals 3

    .line 1
    iget-object v0, p0, Lll;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseArray;

    .line 4
    .line 5
    iget-object v1, p0, Lll;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lm51;

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq p2, v2, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lll;->o:Z

    .line 14
    .line 15
    invoke-interface {v1, p1, p2}, Lm51;->t(II)Lwv4;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lao4;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    new-instance v2, Lao4;

    .line 30
    .line 31
    invoke-interface {v1, p1, p2}, Lm51;->t(II)Lwv4;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-object p0, p0, Lll;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lxn4;

    .line 38
    .line 39
    invoke-direct {v2, p2, p0}, Lao4;-><init>(Lwv4;Lxn4;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    return-object v2
.end method

.method public w(Lm84;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lll;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm51;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lm51;->w(Lm84;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
