.class public final Ldefpackage/x41;
.super Ldefpackage/kq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final F:J

.field public final G:Ldefpackage/rf2;

.field public final H:Ldefpackage/tu;

.field public final I:Ldefpackage/cj0;

.field public J:Ldefpackage/tb1;

.field public K:I

.field public L:Landroid/view/Surface;

.field public M:Landroid/view/Surface;

.field public N:Ldefpackage/pw0;

.field public O:Ldefpackage/pw0;

.field public P:I

.field public Q:J

.field public R:Z

.field public S:Ldefpackage/s55;

.field public T:J

.field public U:I

.field public V:Ldefpackage/bj0;


# direct methods
.method public constructor <init>(JLandroid/os/Handler;Ldefpackage/o55;I)V
    .locals 0

    .line 1
    const/4 p5, 0x2

    .line 2
    invoke-direct {p0, p5}, Ldefpackage/kq;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-wide p1, p0, Ldefpackage/x41;->F:J

    .line 6
    .line 7
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iput-wide p1, p0, Ldefpackage/x41;->Q:J

    .line 13
    .line 14
    new-instance p1, Ldefpackage/tu;

    .line 15
    .line 16
    invoke-direct {p1}, Ldefpackage/tu;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldefpackage/x41;->H:Ldefpackage/tu;

    .line 20
    .line 21
    new-instance p1, Ldefpackage/cj0;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-direct {p1, p2, p2}, Ldefpackage/cj0;-><init>(II)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Ldefpackage/x41;->I:Ldefpackage/cj0;

    .line 28
    .line 29
    new-instance p1, Ldefpackage/rf2;

    .line 30
    .line 31
    invoke-direct {p1, p3, p4}, Ldefpackage/rf2;-><init>(Landroid/os/Handler;Ldefpackage/o55;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 35
    .line 36
    const/4 p1, -0x1

    .line 37
    iput p1, p0, Ldefpackage/x41;->K:I

    .line 38
    .line 39
    iput p2, p0, Ldefpackage/x41;->P:I

    .line 40
    .line 41
    new-instance p1, Ldefpackage/bj0;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ldefpackage/x41;->V:Ldefpackage/bj0;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final A(JJ)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Ldefpackage/x41;->R:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 7
    .line 8
    if-nez p1, :cond_3

    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/kq;->p:Ldefpackage/gp3;

    .line 11
    .line 12
    invoke-virtual {p1}, Ldefpackage/gp3;->d()V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Ldefpackage/x41;->I:Ldefpackage/cj0;

    .line 16
    .line 17
    invoke-virtual {p2}, Ldefpackage/cj0;->r()V

    .line 18
    .line 19
    .line 20
    const/4 p3, 0x2

    .line 21
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/kq;->z(Ldefpackage/gp3;Ldefpackage/cj0;I)I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const/4 p4, -0x5

    .line 26
    if-ne p3, p4, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ldefpackage/tb1;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Ldefpackage/pw0;

    .line 38
    .line 39
    iget-object p3, p0, Ldefpackage/x41;->O:Ldefpackage/pw0;

    .line 40
    .line 41
    invoke-static {p3, p1}, Ldefpackage/pw0;->b(Ldefpackage/pw0;Ldefpackage/pw0;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/x41;->O:Ldefpackage/pw0;

    .line 45
    .line 46
    iput-object p2, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 47
    .line 48
    invoke-virtual {p0}, Ldefpackage/x41;->H()V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 57
    .line 58
    iget-object p3, p2, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p3, Landroid/os/Handler;

    .line 61
    .line 62
    if-eqz p3, :cond_3

    .line 63
    .line 64
    new-instance p4, Ldefpackage/qo2;

    .line 65
    .line 66
    const/16 v0, 0x13

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    invoke-direct {p4, p2, p1, v1, v0}, Ldefpackage/qo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const/4 p1, -0x4

    .line 77
    if-ne p3, p1, :cond_2

    .line 78
    .line 79
    const/4 p1, 0x4

    .line 80
    invoke-virtual {p2, p1}, Ldefpackage/uv;->d(I)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-static {p1}, Ldefpackage/rr2;->w(Z)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x1

    .line 88
    iput-boolean p1, p0, Ldefpackage/x41;->R:Z

    .line 89
    .line 90
    :cond_2
    :goto_0
    return-void

    .line 91
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ldefpackage/x41;->H()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final E(Ldefpackage/tb1;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0, p0, p0, p0}, Ldefpackage/kq;->a(IIII)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public final H()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/x41;->O:Ldefpackage/pw0;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/x41;->N:Ldefpackage/pw0;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ldefpackage/pw0;->b(Ldefpackage/pw0;Ldefpackage/pw0;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/x41;->N:Ldefpackage/pw0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0}, Ldefpackage/pw0;->h()Ldefpackage/se1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/x41;->N:Ldefpackage/pw0;

    .line 19
    .line 20
    invoke-interface {v0}, Ldefpackage/pw0;->g()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    const/16 v1, 0xfa1

    .line 29
    .line 30
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v2, "createFfmpegVideoDecoder"

    .line 39
    .line 40
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_0
    .catch Landroidx/media3/decoder/DecoderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    :catch_0
    move-exception v2

    .line 49
    goto :goto_0

    .line 50
    :catch_1
    move-exception v2

    .line 51
    goto :goto_1

    .line 52
    :goto_0
    iget-object v3, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 53
    .line 54
    invoke-virtual {p0, v2, v3, v0, v1}, Ldefpackage/kq;->b(Ljava/lang/Throwable;Ldefpackage/tb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    throw p0

    .line 59
    :goto_1
    const-string v3, "DecoderVideoRenderer"

    .line 60
    .line 61
    const-string v4, "Video codec error"

    .line 62
    .line 63
    invoke-static {v3, v4, v2}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 67
    .line 68
    iget-object v4, v3, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Landroid/os/Handler;

    .line 71
    .line 72
    if-eqz v4, :cond_1

    .line 73
    .line 74
    new-instance v5, Ldefpackage/ur2;

    .line 75
    .line 76
    const/16 v6, 0x1c

    .line 77
    .line 78
    invoke-direct {v5, v6, v3, v2}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-object v3, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 85
    .line 86
    invoke-virtual {p0, v2, v3, v0, v1}, Ldefpackage/kq;->b(Ljava/lang/Throwable;Ldefpackage/tb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    throw p0
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_6

    .line 3
    .line 4
    instance-of p1, p2, Landroid/view/Surface;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move-object p1, p2

    .line 10
    check-cast p1, Landroid/view/Surface;

    .line 11
    .line 12
    iput-object p1, p0, Ldefpackage/x41;->M:Landroid/view/Surface;

    .line 13
    .line 14
    iput v0, p0, Ldefpackage/x41;->K:I

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput-object v1, p0, Ldefpackage/x41;->M:Landroid/view/Surface;

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Ldefpackage/x41;->K:I

    .line 21
    .line 22
    move-object p2, v1

    .line 23
    :goto_0
    iget-object p1, p0, Ldefpackage/x41;->L:Landroid/view/Surface;

    .line 24
    .line 25
    iget-object v2, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 26
    .line 27
    if-eq p1, p2, :cond_4

    .line 28
    .line 29
    move-object p1, p2

    .line 30
    check-cast p1, Landroid/view/Surface;

    .line 31
    .line 32
    iput-object p1, p0, Ldefpackage/x41;->L:Landroid/view/Surface;

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    iget-object p1, p0, Ldefpackage/x41;->S:Ldefpackage/s55;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2, p1}, Ldefpackage/rf2;->o(Ldefpackage/s55;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget p1, p0, Ldefpackage/x41;->P:I

    .line 44
    .line 45
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iput p1, p0, Ldefpackage/x41;->P:I

    .line 50
    .line 51
    iget p1, p0, Ldefpackage/kq;->u:I

    .line 52
    .line 53
    const/4 p2, 0x2

    .line 54
    if-ne p1, p2, :cond_7

    .line 55
    .line 56
    const-wide/16 p1, 0x0

    .line 57
    .line 58
    iget-wide v0, p0, Ldefpackage/x41;->F:J

    .line 59
    .line 60
    cmp-long p1, v0, p1

    .line 61
    .line 62
    if-lez p1, :cond_2

    .line 63
    .line 64
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 65
    .line 66
    .line 67
    move-result-wide p1

    .line 68
    add-long/2addr p1, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    :goto_1
    iput-wide p1, p0, Ldefpackage/x41;->Q:J

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iput-object v1, p0, Ldefpackage/x41;->S:Ldefpackage/s55;

    .line 79
    .line 80
    iget p1, p0, Ldefpackage/x41;->P:I

    .line 81
    .line 82
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iput p1, p0, Ldefpackage/x41;->P:I

    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    if-eqz p2, :cond_7

    .line 90
    .line 91
    iget-object p1, p0, Ldefpackage/x41;->S:Ldefpackage/s55;

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    invoke-virtual {v2, p1}, Ldefpackage/rf2;->o(Ldefpackage/s55;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    iget p1, p0, Ldefpackage/x41;->P:I

    .line 99
    .line 100
    const/4 p2, 0x3

    .line 101
    if-ne p1, p2, :cond_7

    .line 102
    .line 103
    iget-object p0, p0, Ldefpackage/x41;->L:Landroid/view/Surface;

    .line 104
    .line 105
    if-eqz p0, :cond_7

    .line 106
    .line 107
    invoke-virtual {v2, p0}, Ldefpackage/rf2;->j(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_6
    const/4 p0, 0x7

    .line 112
    if-ne p1, p0, :cond_7

    .line 113
    .line 114
    check-cast p2, Ldefpackage/c55;

    .line 115
    .line 116
    :cond_7
    return-void
.end method

.method public final e()V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/x41;->P:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput v0, p0, Ldefpackage/x41;->P:I

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "ExperimentalFfmpegVideoRenderer"

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/x41;->R:Z

    .line 2
    .line 3
    return p0
.end method

.method public final o()Z
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/kq;->l()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Ldefpackage/kq;->A:Z

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Ldefpackage/kq;->v:Ldefpackage/q44;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ldefpackage/q44;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :goto_0
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget v0, p0, Ldefpackage/x41;->P:I

    .line 33
    .line 34
    const/4 v4, 0x3

    .line 35
    if-eq v0, v4, :cond_2

    .line 36
    .line 37
    iget v0, p0, Ldefpackage/x41;->K:I

    .line 38
    .line 39
    const/4 v4, -0x1

    .line 40
    if-eq v0, v4, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput-wide v2, p0, Ldefpackage/x41;->Q:J

    .line 44
    .line 45
    return v1

    .line 46
    :cond_3
    :goto_1
    iget-wide v4, p0, Ldefpackage/x41;->Q:J

    .line 47
    .line 48
    cmp-long v0, v4, v2

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    if-nez v0, :cond_4

    .line 52
    .line 53
    return v4

    .line 54
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    iget-wide v7, p0, Ldefpackage/x41;->Q:J

    .line 59
    .line 60
    cmp-long v0, v5, v7

    .line 61
    .line 62
    if-gez v0, :cond_5

    .line 63
    .line 64
    return v1

    .line 65
    :cond_5
    iput-wide v2, p0, Ldefpackage/x41;->Q:J

    .line 66
    .line 67
    return v4
.end method

.method public final p()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Ldefpackage/x41;->J:Ldefpackage/tb1;

    .line 5
    .line 6
    iput-object v1, p0, Ldefpackage/x41;->S:Ldefpackage/s55;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget v3, p0, Ldefpackage/x41;->P:I

    .line 10
    .line 11
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iput v2, p0, Ldefpackage/x41;->P:I

    .line 16
    .line 17
    :try_start_0
    iget-object v2, p0, Ldefpackage/x41;->O:Ldefpackage/pw0;

    .line 18
    .line 19
    invoke-static {v2, v1}, Ldefpackage/pw0;->b(Ldefpackage/pw0;Ldefpackage/pw0;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, Ldefpackage/x41;->O:Ldefpackage/pw0;

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/x41;->N:Ldefpackage/pw0;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v1, v2}, Ldefpackage/pw0;->b(Ldefpackage/pw0;Ldefpackage/pw0;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Ldefpackage/x41;->N:Ldefpackage/pw0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    iget-object p0, p0, Ldefpackage/x41;->V:Ldefpackage/bj0;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ldefpackage/rf2;->a(Ldefpackage/bj0;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    iget-object p0, p0, Ldefpackage/x41;->V:Ldefpackage/bj0;

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Ldefpackage/rf2;->a(Ldefpackage/bj0;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method public final q(ZZ)V
    .locals 4

    .line 1
    new-instance p1, Ldefpackage/bj0;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ldefpackage/x41;->V:Ldefpackage/bj0;

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 9
    .line 10
    iget-object v1, v0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v2, Ldefpackage/n55;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, v0, p1, v3}, Ldefpackage/n55;-><init>(Ldefpackage/rf2;Ldefpackage/bj0;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iput p2, p0, Ldefpackage/x41;->P:I

    .line 26
    .line 27
    return-void
.end method

.method public final r(JZZ)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Ldefpackage/x41;->R:Z

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iget p2, p0, Ldefpackage/x41;->P:I

    .line 6
    .line 7
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Ldefpackage/x41;->P:I

    .line 12
    .line 13
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    const-wide/16 p3, 0x0

    .line 21
    .line 22
    iget-wide v0, p0, Ldefpackage/x41;->F:J

    .line 23
    .line 24
    cmp-long p3, v0, p3

    .line 25
    .line 26
    if-lez p3, :cond_0

    .line 27
    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    add-long/2addr p1, v0

    .line 33
    :cond_0
    iput-wide p1, p0, Ldefpackage/x41;->Q:J

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iput-wide p1, p0, Ldefpackage/x41;->Q:J

    .line 37
    .line 38
    :goto_0
    iget-object p0, p0, Ldefpackage/x41;->H:Ldefpackage/tu;

    .line 39
    .line 40
    invoke-virtual {p0}, Ldefpackage/tu;->h()I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Ldefpackage/tu;->b()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/x41;->U:I

    .line 3
    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iput-wide v0, p0, Ldefpackage/x41;->T:J

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public final w()V
    .locals 8

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Ldefpackage/x41;->Q:J

    .line 7
    .line 8
    iget v0, p0, Ldefpackage/x41;->U:I

    .line 9
    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide v2, p0, Ldefpackage/x41;->T:J

    .line 17
    .line 18
    sub-long v2, v0, v2

    .line 19
    .line 20
    iget v4, p0, Ldefpackage/x41;->U:I

    .line 21
    .line 22
    iget-object v5, p0, Ldefpackage/x41;->G:Ldefpackage/rf2;

    .line 23
    .line 24
    iget-object v6, v5, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Landroid/os/Handler;

    .line 27
    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    new-instance v7, Ldefpackage/m55;

    .line 31
    .line 32
    invoke-direct {v7, v5, v4, v2, v3}, Ldefpackage/m55;-><init>(Ldefpackage/rf2;IJ)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    const/4 v2, 0x0

    .line 39
    iput v2, p0, Ldefpackage/x41;->U:I

    .line 40
    .line 41
    iput-wide v0, p0, Ldefpackage/x41;->T:J

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final x([Ldefpackage/tb1;JJLdefpackage/mt2;)V
    .locals 0

    .line 1
    return-void
.end method
