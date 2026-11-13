.class public final Ldefpackage/gi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/r55;


# instance fields
.field public a:Ldefpackage/yw1;

.field public b:Ldefpackage/tb1;

.field public c:J

.field public d:J

.field public e:I

.field public final synthetic f:Ldefpackage/ki3;


# direct methods
.method public constructor <init>(Ldefpackage/ki3;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 5
    .line 6
    invoke-static {p2}, Ldefpackage/f35;->M(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    sget-object p1, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 10
    .line 11
    sget-object p1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/gi3;->a:Ldefpackage/yw1;

    .line 14
    .line 15
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    iput-wide p1, p0, Ldefpackage/gi3;->d:J

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/ki3;->n:I

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Ldefpackage/ki3;->k:Ldefpackage/yp4;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ldefpackage/yp4;->e()V

    .line 14
    .line 15
    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ldefpackage/ki3;->l:Landroid/util/Pair;

    .line 18
    .line 19
    iput v1, p0, Ldefpackage/ki3;->n:I

    .line 20
    .line 21
    return-void
.end method

.method public final b()Landroid/view/Surface;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    invoke-static {p0}, Ldefpackage/rr2;->w(Z)V

    .line 3
    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    throw p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/ki3;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/tn0;->d()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final e(F)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ki3;->i:Ldefpackage/f55;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ldefpackage/f55;->c(F)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Ldefpackage/tn0;->e(F)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/ki3;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/tn0;->f()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final g(Ldefpackage/tb1;JILjava/util/List;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-static {p2}, Ldefpackage/rr2;->w(Z)V

    .line 3
    .line 4
    .line 5
    invoke-static {p5}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iput-object p2, p0, Ldefpackage/gi3;->a:Ldefpackage/yw1;

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/gi3;->b:Ldefpackage/tb1;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p1, p1, Ldefpackage/tb1;->D:Ldefpackage/c50;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ldefpackage/c50;->d()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p1, Ldefpackage/c50;->h:Ldefpackage/c50;

    .line 29
    .line 30
    :goto_0
    iput-object p1, p0, Ldefpackage/sb1;->C:Ldefpackage/c50;

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/sb1;->a()Ldefpackage/tb1;

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method public final h(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ldefpackage/gi3;->c:J

    .line 2
    .line 3
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/gi3;->d:J

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 4
    .line 5
    iget-wide v2, p0, Ldefpackage/ki3;->o:J

    .line 6
    .line 7
    cmp-long v0, v2, v0

    .line 8
    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/tn0;->i()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final j(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/tn0;->j(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/pf4;->c:Ldefpackage/pf4;

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/pf4;->a:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/ki3;->l:Landroid/util/Pair;

    .line 9
    .line 10
    return-void
.end method

.method public final l(Ldefpackage/kk2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(JLdefpackage/lk2;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v1, p0, Ldefpackage/gi3;->c:J

    .line 6
    .line 7
    add-long/2addr p1, v1

    .line 8
    iget-object v1, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 9
    .line 10
    iget-object v2, v1, Ldefpackage/ki3;->i:Ldefpackage/f55;

    .line 11
    .line 12
    iget-wide v3, v2, Ldefpackage/f55;->a:J

    .line 13
    .line 14
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v7, v3, v5

    .line 20
    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    move-wide p1, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-wide v7, v2, Ldefpackage/f55;->b:J

    .line 26
    .line 27
    long-to-double v7, v7

    .line 28
    sub-long/2addr p1, v3

    .line 29
    long-to-double p1, p1

    .line 30
    iget-wide v2, v2, Ldefpackage/f55;->c:D

    .line 31
    .line 32
    mul-double/2addr p1, v2

    .line 33
    add-double/2addr p1, v7

    .line 34
    double-to-long p1, p1

    .line 35
    :goto_0
    cmp-long v2, p1, v5

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    iget-wide v2, v1, Ldefpackage/ki3;->h:J

    .line 40
    .line 41
    cmp-long v4, v2, v5

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    cmp-long p1, p1, v2

    .line 46
    .line 47
    if-gez p1, :cond_1

    .line 48
    .line 49
    iget p1, p0, Ldefpackage/gi3;->e:I

    .line 50
    .line 51
    const/4 p2, 0x2

    .line 52
    if-ge p1, p2, :cond_1

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    add-int/2addr p1, p2

    .line 56
    iput p1, p0, Ldefpackage/gi3;->e:I

    .line 57
    .line 58
    iget-object p0, p3, Ldefpackage/lk2;->c:Ldefpackage/ok2;

    .line 59
    .line 60
    iget-object p1, p3, Ldefpackage/lk2;->a:Ldefpackage/ak2;

    .line 61
    .line 62
    iget p3, p3, Ldefpackage/lk2;->b:I

    .line 63
    .line 64
    const-string v1, "dropVideoBuffer"

    .line 65
    .line 66
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p3}, Ldefpackage/ak2;->g(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0, p2}, Ldefpackage/ok2;->S0(II)V

    .line 76
    .line 77
    .line 78
    return p2

    .line 79
    :cond_1
    iget p0, v1, Ldefpackage/ki3;->p:I

    .line 80
    .line 81
    const/4 p1, -0x1

    .line 82
    if-eq p0, p1, :cond_3

    .line 83
    .line 84
    if-eqz p0, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    const/4 p0, 0x0

    .line 88
    throw p0

    .line 89
    :cond_3
    :goto_1
    return v0
.end method

.method public final n(Ldefpackage/tb1;)Z
    .locals 9

    .line 1
    const-string v0, "Color transfer "

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 4
    .line 5
    iget v1, p0, Ldefpackage/ki3;->n:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v3

    .line 14
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, Ldefpackage/tb1;->D:Ldefpackage/c50;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ldefpackage/c50;->d()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    sget-object v1, Ldefpackage/c50;->h:Ldefpackage/c50;

    .line 29
    .line 30
    :goto_1
    iget v1, v1, Ldefpackage/c50;->c:I

    .line 31
    .line 32
    const-string v4, "EGL_EXT_gl_colorspace_bt2020_pq"

    .line 33
    .line 34
    const/16 v5, 0x21

    .line 35
    .line 36
    const/4 v6, 0x7

    .line 37
    if-ne v1, v6, :cond_4

    .line 38
    .line 39
    :try_start_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v8, 0x22

    .line 42
    .line 43
    if-ge v7, v8, :cond_4

    .line 44
    .line 45
    if-lt v7, v5, :cond_2

    .line 46
    .line 47
    invoke-static {v4}, Ldefpackage/j51;->D(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_2

    .line 52
    .line 53
    move v7, v2

    .line 54
    goto :goto_2

    .line 55
    :catch_0
    move-exception p0

    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_2
    move v7, v3

    .line 59
    :goto_2
    if-nez v7, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    new-instance v0, Ldefpackage/c50;

    .line 63
    .line 64
    goto :goto_6

    .line 65
    :cond_4
    :goto_3
    const/4 v7, 0x6

    .line 66
    if-ne v1, v7, :cond_6

    .line 67
    .line 68
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    if-lt v6, v5, :cond_5

    .line 71
    .line 72
    invoke-static {v4}, Ldefpackage/j51;->D(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_5

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_5
    move v2, v3

    .line 80
    goto :goto_4

    .line 81
    :cond_6
    if-ne v1, v6, :cond_7

    .line 82
    .line 83
    const-string v2, "EGL_EXT_gl_colorspace_bt2020_hlg"

    .line 84
    .line 85
    invoke-static {v2}, Ldefpackage/j51;->D(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :cond_7
    :goto_4
    if-nez v2, :cond_9

    .line 90
    .line 91
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 92
    .line 93
    const/16 v3, 0x1d

    .line 94
    .line 95
    if-ge v2, v3, :cond_8

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    const-string v2, "PlaybackVidGraphWrapper"

    .line 99
    .line 100
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 101
    .line 102
    new-instance v3, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v0, " is not supported. Falling back to OpenGl tone mapping."

    .line 111
    .line 112
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v2, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Ldefpackage/c50;->h:Ldefpackage/c50;

    .line 123
    .line 124
    goto :goto_6

    .line 125
    :cond_9
    :goto_5
    const/4 v0, 0x2

    .line 126
    if-eq v1, v0, :cond_a

    .line 127
    .line 128
    const/16 v0, 0xa

    .line 129
    .line 130
    if-ne v1, v0, :cond_b

    .line 131
    .line 132
    :cond_a
    sget-object v0, Ldefpackage/c50;->h:Ldefpackage/c50;
    :try_end_0
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    .line 134
    :cond_b
    :goto_6
    iget-object v0, p0, Ldefpackage/ki3;->f:Ldefpackage/vp4;

    .line 135
    .line 136
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const/4 v2, 0x0

    .line 144
    invoke-virtual {v0, v1, v2}, Ldefpackage/vp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ldefpackage/yp4;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, p0, Ldefpackage/ki3;->k:Ldefpackage/yp4;

    .line 149
    .line 150
    :try_start_1
    iget-object p0, p0, Ldefpackage/ki3;->b:Ldefpackage/ii3;

    .line 151
    .line 152
    invoke-virtual {p0}, Ldefpackage/ii3;->a()V
    :try_end_1
    .catch Landroidx/media3/common/VideoFrameProcessingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 153
    .line 154
    .line 155
    throw v2

    .line 156
    :catch_1
    move-exception p0

    .line 157
    new-instance v0, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 158
    .line 159
    invoke-direct {v0, p0, p1}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Exception;Ldefpackage/tb1;)V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :goto_7
    new-instance v0, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 164
    .line 165
    invoke-direct {v0, p0, p1}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Exception;Ldefpackage/tb1;)V

    .line 166
    .line 167
    .line 168
    throw v0
.end method

.method public final o(Z)V
    .locals 5

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Ldefpackage/gi3;->d:J

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 9
    .line 10
    iget-object v2, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 11
    .line 12
    iget v3, p0, Ldefpackage/ki3;->n:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-ne v3, v4, :cond_2

    .line 16
    .line 17
    iget v3, p0, Ldefpackage/ki3;->m:I

    .line 18
    .line 19
    add-int/2addr v3, v4

    .line 20
    iput v3, p0, Ldefpackage/ki3;->m:I

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Ldefpackage/tn0;->o(Z)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 26
    .line 27
    invoke-virtual {p1}, Ldefpackage/tu;->h()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v2, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 32
    .line 33
    if-le p1, v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v2}, Ldefpackage/tu;->h()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eq p1, v4, :cond_1

    .line 44
    .line 45
    iput-wide v0, p0, Ldefpackage/ki3;->o:J

    .line 46
    .line 47
    iget-object p1, p0, Ldefpackage/ki3;->k:Ldefpackage/yp4;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, Ldefpackage/qa1;

    .line 53
    .line 54
    const/16 v1, 0x19

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    iget-object p0, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 64
    .line 65
    invoke-virtual {p0}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ldefpackage/ji3;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0

    .line 76
    :cond_2
    :goto_1
    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/gi3;->a:Ldefpackage/yw1;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/yw1;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Ldefpackage/gi3;->a:Ldefpackage/yw1;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/gi3;->b:Ldefpackage/tb1;

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object p0, p0, Ldefpackage/tb1;->D:Ldefpackage/c50;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/c50;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    sget-object p0, Ldefpackage/c50;->h:Ldefpackage/c50;

    .line 37
    .line 38
    :goto_1
    iput-object p0, p1, Ldefpackage/sb1;->C:Ldefpackage/c50;

    .line 39
    .line 40
    invoke-virtual {p1}, Ldefpackage/sb1;->a()Ldefpackage/tb1;

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0
.end method

.method public final q(JJ)V
    .locals 2

    .line 1
    iget-wide v0, p0, Ldefpackage/gi3;->c:J

    .line 2
    .line 3
    add-long/2addr p1, v0

    .line 4
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2, p3, p4}, Ldefpackage/tn0;->q(JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final r(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/ki3;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ldefpackage/tn0;->r(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final s(Z)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/e55;->b(Z)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final t(Ldefpackage/c55;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/tn0;->j:Ldefpackage/c55;

    .line 6
    .line 7
    return-void
.end method

.method public final u()V
    .locals 0

    .line 1
    return-void
.end method

.method public final v(Landroid/view/Surface;Ldefpackage/pf4;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ki3;->l:Landroid/util/Pair;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/view/Surface;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/ki3;->l:Landroid/util/Pair;

    .line 18
    .line 19
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ldefpackage/pf4;

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ldefpackage/pf4;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Ldefpackage/ki3;->l:Landroid/util/Pair;

    .line 35
    .line 36
    iget p0, p2, Ldefpackage/pf4;->a:I

    .line 37
    .line 38
    return-void
.end method

.method public final w()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/gi3;->f:Ldefpackage/ki3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/tu;->h()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ki3;->e:Ldefpackage/tn0;

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/tn0;->x()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, Ldefpackage/tu;

    .line 18
    .line 19
    invoke-direct {v0}, Ldefpackage/tu;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 23
    .line 24
    invoke-virtual {v1}, Ldefpackage/tu;->h()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-gtz v1, :cond_1

    .line 29
    .line 30
    iput-object v0, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p0, p0, Ldefpackage/ki3;->j:Ldefpackage/tu;

    .line 34
    .line 35
    invoke-virtual {p0}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ldefpackage/ji3;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    throw p0
.end method
