.class public final Landroidx/media3/decoder/ffmpeg/b;
.super Lkq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyj2;


# instance fields
.field public final F:Lxc5;

.field public final G:Lsm;

.field public final H:Lcj0;

.field public I:Lbj0;

.field public J:Ltb1;

.field public K:I

.field public L:I

.field public M:Z

.field public N:Lzi0;

.field public O:Lcj0;

.field public P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

.field public Q:Lpw0;

.field public R:Lpw0;

.field public S:I

.field public T:Z

.field public U:Z

.field public V:J

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:J

.field public final a0:[J

.field public b0:I

.field public c0:Z

.field public d0:Z

.field public e0:Z

.field public f0:J

.field public g0:J

.field public h0:J


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lqm;Lsm;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkq;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v1, Lxc5;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lxc5;-><init>(Landroid/os/Handler;Lqm;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 11
    .line 12
    iput-object p3, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 13
    .line 14
    new-instance p1, Laj0;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Laj0;-><init>(Landroidx/media3/decoder/ffmpeg/b;)V

    .line 17
    .line 18
    .line 19
    check-cast p3, Ltj0;

    .line 20
    .line 21
    iput-object p1, p3, Ltj0;->n:Lrm;

    .line 22
    .line 23
    new-instance p1, Lcj0;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-direct {p1, p2, p2}, Lcj0;-><init>(II)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->H:Lcj0;

    .line 30
    .line 31
    iput p2, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 32
    .line 33
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->U:Z

    .line 34
    .line 35
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Landroidx/media3/decoder/ffmpeg/b;->N(J)V

    .line 41
    .line 42
    .line 43
    const/16 p3, 0xa

    .line 44
    .line 45
    new-array p3, p3, [J

    .line 46
    .line 47
    iput-object p3, p0, Landroidx/media3/decoder/ffmpeg/b;->a0:[J

    .line 48
    .line 49
    iput-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->f0:J

    .line 50
    .line 51
    iput-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 52
    .line 53
    iput-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final A(JJ)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->Y:Z

    .line 2
    .line 3
    const/16 p2, 0x138a

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 8
    .line 9
    check-cast p1, Ltj0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ltj0;->t()V

    .line 12
    .line 13
    .line 14
    iget-wide p3, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 15
    .line 16
    iput-wide p3, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p1

    .line 20
    iget-object p3, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->p:Ltb1;

    .line 21
    .line 22
    iget-boolean p4, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->o:Z

    .line 23
    .line 24
    invoke-virtual {p0, p1, p3, p4, p2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    throw p0

    .line 29
    :cond_0
    iget-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 30
    .line 31
    const/4 p3, 0x0

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lkq;->p:Lgp3;

    .line 35
    .line 36
    invoke-virtual {p1}, Lgp3;->d()V

    .line 37
    .line 38
    .line 39
    iget-object p4, p0, Landroidx/media3/decoder/ffmpeg/b;->H:Lcj0;

    .line 40
    .line 41
    invoke-virtual {p4}, Lcj0;->r()V

    .line 42
    .line 43
    .line 44
    iget-object p4, p0, Landroidx/media3/decoder/ffmpeg/b;->H:Lcj0;

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-virtual {p0, p1, p4, v0}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    const/4 v0, -0x5

    .line 52
    if-ne p4, v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Landroidx/media3/decoder/ffmpeg/b;->L(Lgp3;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 p1, -0x4

    .line 59
    if-ne p4, p1, :cond_6

    .line 60
    .line 61
    iget-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->H:Lcj0;

    .line 62
    .line 63
    const/4 p4, 0x4

    .line 64
    invoke-virtual {p1, p4}, Luv;->d(I)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    invoke-static {p1}, Lrr2;->w(Z)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x1

    .line 72
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->X:Z

    .line 73
    .line 74
    :try_start_1
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->Y:Z

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 77
    .line 78
    check-cast p1, Ltj0;

    .line 79
    .line 80
    invoke-virtual {p1}, Ltj0;->t()V

    .line 81
    .line 82
    .line 83
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 84
    .line 85
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 86
    .line 87
    return-void

    .line 88
    :catch_1
    move-exception p1

    .line 89
    const/4 p4, 0x0

    .line 90
    invoke-virtual {p0, p1, p4, p3, p2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    throw p0

    .line 95
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->K()V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 99
    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    const/16 p1, 0x1389

    .line 103
    .line 104
    :try_start_2
    const-string p4, "drainAndFeed"

    .line 105
    .line 106
    invoke-static {p4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->I()Z

    .line 110
    .line 111
    .line 112
    move-result p4

    .line 113
    if-eqz p4, :cond_3

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    :goto_2
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->J()Z

    .line 117
    .line 118
    .line 119
    move-result p4

    .line 120
    if-eqz p4, :cond_4

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catch Landroidx/media3/decoder/DecoderException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 124
    .line 125
    .line 126
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 127
    .line 128
    monitor-enter p0

    .line 129
    monitor-exit p0

    .line 130
    return-void

    .line 131
    :catch_2
    move-exception p1

    .line 132
    goto :goto_3

    .line 133
    :catch_3
    move-exception p2

    .line 134
    goto :goto_4

    .line 135
    :catch_4
    move-exception p2

    .line 136
    goto :goto_5

    .line 137
    :catch_5
    move-exception p1

    .line 138
    goto :goto_6

    .line 139
    :goto_3
    iget-object p3, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->p:Ltb1;

    .line 140
    .line 141
    iget-boolean p4, p1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->o:Z

    .line 142
    .line 143
    invoke-virtual {p0, p1, p3, p4, p2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    throw p0

    .line 148
    :goto_4
    iget-object p3, p2, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->o:Ltb1;

    .line 149
    .line 150
    iget-boolean p4, p2, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->n:Z

    .line 151
    .line 152
    invoke-virtual {p0, p2, p3, p4, p1}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    throw p0

    .line 157
    :goto_5
    iget-object p4, p2, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;->n:Ltb1;

    .line 158
    .line 159
    invoke-virtual {p0, p2, p4, p3, p1}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    throw p0

    .line 164
    :goto_6
    const-string p2, "DecoderAudioRenderer"

    .line 165
    .line 166
    const-string p4, "Audio codec error"

    .line 167
    .line 168
    invoke-static {p2, p4, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 172
    .line 173
    iget-object p4, p2, Lxc5;->o:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p4, Landroid/os/Handler;

    .line 176
    .line 177
    if-eqz p4, :cond_5

    .line 178
    .line 179
    new-instance v0, Ljm;

    .line 180
    .line 181
    invoke-direct {v0, p2, p1, p3}, Ljm;-><init>(Lxc5;Ljava/lang/Exception;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 185
    .line 186
    .line 187
    :cond_5
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 188
    .line 189
    const/16 p4, 0xfa3

    .line 190
    .line 191
    invoke-virtual {p0, p1, p2, p3, p4}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    throw p0

    .line 196
    :cond_6
    return-void
.end method

.method public final E(Ltb1;)I
    .locals 6

    .line 1
    iget-object v0, p1, Ltb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p1, Ltb1;->G:I

    .line 4
    .line 5
    iget v2, p1, Ltb1;->F:I

    .line 6
    .line 7
    invoke-static {v0}, Llw2;->i(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {v3, v3, v3, v3}, Lkq;->a(IIII)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    iget-object v0, p1, Ltb1;->n:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->d()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x2

    .line 29
    if-eqz v4, :cond_4

    .line 30
    .line 31
    invoke-static {v0}, Llw2;->i(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v0}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->e(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-static {v5, v2, v1}, Lf35;->D(III)Ltb1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 49
    .line 50
    move-object v4, p0

    .line 51
    check-cast v4, Ltj0;

    .line 52
    .line 53
    invoke-virtual {v4, v0}, Ltj0;->j(Ltb1;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v4, 0x4

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {v4, v2, v1}, Lf35;->D(III)Ltb1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast p0, Ltj0;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Ltj0;->j(Ltb1;)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    :goto_0
    iget p0, p1, Ltb1;->O:I

    .line 74
    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    move v4, v5

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const/4 v4, 0x1

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    move v4, v3

    .line 82
    :cond_5
    :goto_2
    if-gt v4, v5, :cond_6

    .line 83
    .line 84
    invoke-static {v4, v3, v3, v3}, Lkq;->a(IIII)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0

    .line 89
    :cond_6
    or-int/lit16 p0, v4, 0xa8

    .line 90
    .line 91
    return p0
.end method

.method public final F()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public final H(Ltb1;)Lzi0;
    .locals 7

    .line 1
    const-string v0, "createFfmpegAudioDecoder"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Ltb1;->o:I

    .line 7
    .line 8
    iget v1, p1, Ltb1;->G:I

    .line 9
    .line 10
    iget v2, p1, Ltb1;->F:I

    .line 11
    .line 12
    const/4 v3, -0x1

    .line 13
    if-eq v0, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/16 v0, 0x1680

    .line 17
    .line 18
    :goto_0
    new-instance v3, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    invoke-static {v4, v2, v1}, Lf35;->D(III)Ltb1;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 26
    .line 27
    move-object v6, p0

    .line 28
    check-cast v6, Ltj0;

    .line 29
    .line 30
    invoke-virtual {v6, v5}, Ltj0;->j(Ltb1;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    const/4 v5, 0x4

    .line 38
    invoke-static {v5, v2, v1}, Lf35;->D(III)Ltb1;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast p0, Ltj0;

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Ltj0;->j(Ltb1;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eq p0, v4, :cond_1

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const-string p0, "audio/ac3"

    .line 53
    .line 54
    iget-object v1, p1, Ltb1;->n:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    xor-int/2addr v6, p0

    .line 61
    :cond_2
    :goto_1
    invoke-direct {v3, v0, p1, v6}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;-><init>(ILtb1;Z)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 65
    .line 66
    .line 67
    return-object v3
.end method

.method public final I()Z
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 8
    .line 9
    check-cast v0, Lve4;

    .line 10
    .line 11
    invoke-virtual {v0}, Lve4;->l()Ldj0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 16
    .line 17
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return v2

    .line 22
    :cond_0
    iget v3, v0, Ldj0;->q:I

    .line 23
    .line 24
    if-lez v3, :cond_1

    .line 25
    .line 26
    iget-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 27
    .line 28
    iget v5, v4, Lbj0;->f:I

    .line 29
    .line 30
    add-int/2addr v5, v3

    .line 31
    iput v5, v4, Lbj0;->f:I

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 34
    .line 35
    check-cast v3, Ltj0;

    .line 36
    .line 37
    iput-boolean v1, v3, Ltj0;->E:Z

    .line 38
    .line 39
    :cond_1
    const/high16 v3, 0x8000000

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Luv;->d(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->a0:[J

    .line 48
    .line 49
    iget-object v3, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 50
    .line 51
    check-cast v3, Ltj0;

    .line 52
    .line 53
    iput-boolean v1, v3, Ltj0;->E:Z

    .line 54
    .line 55
    iget v3, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    aget-wide v3, v0, v2

    .line 60
    .line 61
    invoke-virtual {p0, v3, v4}, Landroidx/media3/decoder/ffmpeg/b;->N(J)V

    .line 62
    .line 63
    .line 64
    iget v3, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 65
    .line 66
    sub-int/2addr v3, v1

    .line 67
    iput v3, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 68
    .line 69
    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 73
    .line 74
    const/4 v3, 0x4

    .line 75
    invoke-virtual {v0, v3}, Luv;->d(I)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v3, 0x0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    iget v0, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 83
    .line 84
    const/4 v4, 0x2

    .line 85
    if-ne v0, v4, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->M()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->K()V

    .line 91
    .line 92
    .line 93
    iput-boolean v1, p0, Landroidx/media3/decoder/ffmpeg/b;->U:Z

    .line 94
    .line 95
    return v2

    .line 96
    :cond_3
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->s()V

    .line 99
    .line 100
    .line 101
    iput-object v3, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 102
    .line 103
    :try_start_0
    iput-boolean v1, p0, Landroidx/media3/decoder/ffmpeg/b;->Y:Z

    .line 104
    .line 105
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 106
    .line 107
    check-cast v0, Ltj0;

    .line 108
    .line 109
    invoke-virtual {v0}, Ltj0;->t()V

    .line 110
    .line 111
    .line 112
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 113
    .line 114
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    .line 116
    return v2

    .line 117
    :catch_0
    move-exception v0

    .line 118
    iget-object v1, v0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->p:Ltb1;

    .line 119
    .line 120
    iget-boolean v2, v0, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;->o:Z

    .line 121
    .line 122
    const/16 v3, 0x138a

    .line 123
    .line 124
    invoke-virtual {p0, v0, v1, v2, v3}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    throw p0

    .line 129
    :cond_4
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    iput-wide v4, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 135
    .line 136
    iget-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->U:Z

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 141
    .line 142
    check-cast v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    new-instance v4, Lsb1;

    .line 148
    .line 149
    invoke-direct {v4}, Lsb1;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v5, "audio/raw"

    .line 153
    .line 154
    invoke-static {v5}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    iput-object v5, v4, Lsb1;->m:Ljava/lang/String;

    .line 159
    .line 160
    iget v5, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->u:I

    .line 161
    .line 162
    iput v5, v4, Lsb1;->E:I

    .line 163
    .line 164
    iget v5, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->v:I

    .line 165
    .line 166
    iput v5, v4, Lsb1;->F:I

    .line 167
    .line 168
    iget v0, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->q:I

    .line 169
    .line 170
    iput v0, v4, Lsb1;->G:I

    .line 171
    .line 172
    new-instance v0, Ltb1;

    .line 173
    .line 174
    invoke-direct {v0, v4}, Ltb1;-><init>(Lsb1;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ltb1;->a()Lsb1;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget v4, p0, Landroidx/media3/decoder/ffmpeg/b;->K:I

    .line 182
    .line 183
    iput v4, v0, Lsb1;->H:I

    .line 184
    .line 185
    iget v4, p0, Landroidx/media3/decoder/ffmpeg/b;->L:I

    .line 186
    .line 187
    iput v4, v0, Lsb1;->I:I

    .line 188
    .line 189
    iget-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 190
    .line 191
    iget-object v5, v4, Ltb1;->l:Lqv2;

    .line 192
    .line 193
    iput-object v5, v0, Lsb1;->k:Lqv2;

    .line 194
    .line 195
    iget-object v5, v4, Ltb1;->a:Ljava/lang/String;

    .line 196
    .line 197
    iput-object v5, v0, Lsb1;->a:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v5, v4, Ltb1;->b:Ljava/lang/String;

    .line 200
    .line 201
    iput-object v5, v0, Lsb1;->b:Ljava/lang/String;

    .line 202
    .line 203
    iget-object v4, v4, Ltb1;->c:Lyw1;

    .line 204
    .line 205
    invoke-static {v4}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    iput-object v4, v0, Lsb1;->c:Lyw1;

    .line 210
    .line 211
    iget-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 212
    .line 213
    iget-object v5, v4, Ltb1;->d:Ljava/lang/String;

    .line 214
    .line 215
    iput-object v5, v0, Lsb1;->d:Ljava/lang/String;

    .line 216
    .line 217
    iget v5, v4, Ltb1;->e:I

    .line 218
    .line 219
    iput v5, v0, Lsb1;->e:I

    .line 220
    .line 221
    iget v4, v4, Ltb1;->f:I

    .line 222
    .line 223
    iput v4, v0, Lsb1;->f:I

    .line 224
    .line 225
    new-instance v4, Ltb1;

    .line 226
    .line 227
    invoke-direct {v4, v0}, Ltb1;-><init>(Lsb1;)V

    .line 228
    .line 229
    .line 230
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 231
    .line 232
    check-cast v0, Ltj0;

    .line 233
    .line 234
    invoke-virtual {v0, v4, v3}, Ltj0;->c(Ltb1;[I)V

    .line 235
    .line 236
    .line 237
    iput-boolean v2, p0, Landroidx/media3/decoder/ffmpeg/b;->U:Z

    .line 238
    .line 239
    :cond_5
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 240
    .line 241
    iget-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 242
    .line 243
    iget-object v5, v4, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 244
    .line 245
    iget-wide v6, v4, Ldj0;->p:J

    .line 246
    .line 247
    check-cast v0, Ltj0;

    .line 248
    .line 249
    invoke-virtual {v0, v1, v6, v7, v5}, Ltj0;->m(IJLjava/nio/ByteBuffer;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_6

    .line 254
    .line 255
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 256
    .line 257
    iget v2, v0, Lbj0;->e:I

    .line 258
    .line 259
    add-int/2addr v2, v1

    .line 260
    iput v2, v0, Lbj0;->e:I

    .line 261
    .line 262
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->s()V

    .line 265
    .line 266
    .line 267
    iput-object v3, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 268
    .line 269
    return v1

    .line 270
    :cond_6
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 271
    .line 272
    iget-wide v0, v0, Ldj0;->p:J

    .line 273
    .line 274
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 275
    .line 276
    return v2
.end method

.method public final J()Z
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_a

    .line 5
    .line 6
    iget v2, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 7
    .line 8
    const/4 v3, 0x2

    .line 9
    if-eq v2, v3, :cond_a

    .line 10
    .line 11
    iget-boolean v2, p0, Landroidx/media3/decoder/ffmpeg/b;->X:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    check-cast v0, Lve4;

    .line 22
    .line 23
    invoke-virtual {v0}, Lve4;->e()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcj0;

    .line 28
    .line 29
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_1
    iget v0, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 36
    .line 37
    const/4 v2, 0x4

    .line 38
    const/4 v4, 0x0

    .line 39
    const/4 v5, 0x1

    .line 40
    if-ne v0, v5, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 43
    .line 44
    iput v2, v0, Luv;->o:I

    .line 45
    .line 46
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 47
    .line 48
    check-cast v2, Lve4;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v0}, Lve4;->m(Lcj0;)V

    .line 54
    .line 55
    .line 56
    iput-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 57
    .line 58
    iput v3, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 59
    .line 60
    return v1

    .line 61
    :cond_2
    iget-object v0, p0, Lkq;->p:Lgp3;

    .line 62
    .line 63
    invoke-virtual {v0}, Lgp3;->d()V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 67
    .line 68
    invoke-virtual {p0, v0, v3, v1}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    const/4 v6, -0x5

    .line 73
    if-eq v3, v6, :cond_9

    .line 74
    .line 75
    const/4 v0, -0x4

    .line 76
    if-eq v3, v0, :cond_4

    .line 77
    .line 78
    const/4 v0, -0x3

    .line 79
    if-ne v3, v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0}, Lkq;->l()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_a

    .line 86
    .line 87
    iget-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->f0:J

    .line 88
    .line 89
    iput-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 90
    .line 91
    return v1

    .line 92
    :cond_3
    invoke-static {}, Ltb4;->a()V

    .line 93
    .line 94
    .line 95
    return v1

    .line 96
    :cond_4
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Luv;->d(I)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    iput-boolean v5, p0, Landroidx/media3/decoder/ffmpeg/b;->X:Z

    .line 105
    .line 106
    iget-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->f0:J

    .line 107
    .line 108
    iput-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 109
    .line 110
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 111
    .line 112
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 113
    .line 114
    check-cast v0, Lve4;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2}, Lve4;->m(Lcj0;)V

    .line 120
    .line 121
    .line 122
    iput-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 123
    .line 124
    return v1

    .line 125
    :cond_5
    iget-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->M:Z

    .line 126
    .line 127
    if-nez v0, :cond_6

    .line 128
    .line 129
    iput-boolean v5, p0, Landroidx/media3/decoder/ffmpeg/b;->M:Z

    .line 130
    .line 131
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 132
    .line 133
    const/high16 v1, 0x8000000

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Luv;->a(I)V

    .line 136
    .line 137
    .line 138
    :cond_6
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 139
    .line 140
    iget-wide v0, v0, Lcj0;->t:J

    .line 141
    .line 142
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->f0:J

    .line 143
    .line 144
    invoke-virtual {p0}, Lkq;->l()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    if-nez v0, :cond_7

    .line 149
    .line 150
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 151
    .line 152
    const/high16 v1, 0x20000000

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Luv;->d(I)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_8

    .line 159
    .line 160
    :cond_7
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->f0:J

    .line 161
    .line 162
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 163
    .line 164
    :cond_8
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 165
    .line 166
    invoke-virtual {v0}, Lcj0;->u()V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 170
    .line 171
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 172
    .line 173
    iput-object v1, v0, Lcj0;->p:Ltb1;

    .line 174
    .line 175
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 176
    .line 177
    check-cast v1, Lve4;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v0}, Lve4;->m(Lcj0;)V

    .line 183
    .line 184
    .line 185
    iput-boolean v5, p0, Landroidx/media3/decoder/ffmpeg/b;->T:Z

    .line 186
    .line 187
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 188
    .line 189
    iget v1, v0, Lbj0;->c:I

    .line 190
    .line 191
    add-int/2addr v1, v5

    .line 192
    iput v1, v0, Lbj0;->c:I

    .line 193
    .line 194
    iput-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 195
    .line 196
    return v5

    .line 197
    :cond_9
    invoke-virtual {p0, v0}, Landroidx/media3/decoder/ffmpeg/b;->L(Lgp3;)V

    .line 198
    .line 199
    .line 200
    return v5

    .line 201
    :cond_a
    :goto_0
    return v1
.end method

.method public final K()V
    .locals 11

    .line 1
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->R:Lpw0;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->Q:Lpw0;

    .line 11
    .line 12
    invoke-static {v2, v0}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->Q:Lpw0;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-interface {v0}, Lpw0;->h()Lse1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->Q:Lpw0;

    .line 26
    .line 27
    invoke-interface {v0}, Lpw0;->g()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    return-void

    .line 35
    :cond_2
    :goto_1
    const/4 v8, 0x0

    .line 36
    const/16 v9, 0xfa1

    .line 37
    .line 38
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    const-string v0, "createAudioDecoder"

    .line 43
    .line 44
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Landroidx/media3/decoder/ffmpeg/b;->H(Ltb1;)Lzi0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 54
    .line 55
    iget-wide v4, p0, Lkq;->y:J

    .line 56
    .line 57
    check-cast v0, Lve4;

    .line 58
    .line 59
    invoke-virtual {v0, v4, v5}, Lve4;->b(J)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 63
    .line 64
    .line 65
    move-wide v5, v2

    .line 66
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 71
    .line 72
    check-cast v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sub-long v5, v3, v5

    .line 79
    .line 80
    iget-object v0, v1, Lxc5;->o:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v10, v0

    .line 83
    check-cast v10, Landroid/os/Handler;

    .line 84
    .line 85
    if-eqz v10, :cond_3

    .line 86
    .line 87
    new-instance v0, Lom;

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    invoke-direct/range {v0 .. v7}, Lom;-><init>(Ljava/lang/Object;Ljava/lang/String;JJI)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 94
    .line 95
    .line 96
    :cond_3
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 97
    .line 98
    iget v2, v0, Lbj0;->a:I

    .line 99
    .line 100
    add-int/lit8 v2, v2, 0x1

    .line 101
    .line 102
    iput v2, v0, Lbj0;->a:I
    :try_end_0
    .catch Landroidx/media3/decoder/DecoderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    return-void

    .line 105
    :catch_0
    move-exception v0

    .line 106
    goto :goto_2

    .line 107
    :catch_1
    move-exception v0

    .line 108
    goto :goto_3

    .line 109
    :goto_2
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 110
    .line 111
    invoke-virtual {p0, v0, v1, v8, v9}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0

    .line 116
    :goto_3
    const-string v2, "DecoderAudioRenderer"

    .line 117
    .line 118
    const-string v3, "Audio codec error"

    .line 119
    .line 120
    invoke-static {v2, v3, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    iget-object v2, v1, Lxc5;->o:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v2, Landroid/os/Handler;

    .line 126
    .line 127
    if-eqz v2, :cond_4

    .line 128
    .line 129
    new-instance v3, Ljm;

    .line 130
    .line 131
    invoke-direct {v3, v1, v0, v8}, Ljm;-><init>(Lxc5;Ljava/lang/Exception;I)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 135
    .line 136
    .line 137
    :cond_4
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 138
    .line 139
    invoke-virtual {p0, v0, v1, v8, v9}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    throw p0
.end method

.method public final L(Lgp3;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lgp3;->p:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, v0

    .line 4
    check-cast v4, Ltb1;

    .line 5
    .line 6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lgp3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lpw0;

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->R:Lpw0;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->R:Lpw0;

    .line 19
    .line 20
    iget-object v3, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 21
    .line 22
    iput-object v4, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 23
    .line 24
    iget v0, v4, Ltb1;->I:I

    .line 25
    .line 26
    iput v0, p0, Landroidx/media3/decoder/ffmpeg/b;->K:I

    .line 27
    .line 28
    iget v0, v4, Ltb1;->J:I

    .line 29
    .line 30
    iput v0, p0, Landroidx/media3/decoder/ffmpeg/b;->L:I

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    iget-object v8, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->K()V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 43
    .line 44
    iget-object p1, v8, Lxc5;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Landroid/os/Handler;

    .line 47
    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    new-instance v0, Lv6;

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-direct {v0, v8, p0, v1, v7}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->Q:Lpw0;

    .line 61
    .line 62
    if-eq p1, v1, :cond_1

    .line 63
    .line 64
    new-instance v1, Lej0;

    .line 65
    .line 66
    check-cast v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const/4 v5, 0x0

    .line 73
    const/16 v6, 0x80

    .line 74
    .line 75
    invoke-direct/range {v1 .. v6}, Lej0;-><init>(Ljava/lang/String;Ltb1;Ltb1;II)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    check-cast v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v1, Lej0;

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v6, 0x1

    .line 89
    invoke-direct/range {v1 .. v6}, Lej0;-><init>(Ljava/lang/String;Ltb1;Ltb1;II)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget p1, v1, Lej0;->d:I

    .line 93
    .line 94
    if-nez p1, :cond_3

    .line 95
    .line 96
    iget-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->T:Z

    .line 97
    .line 98
    if-eqz p1, :cond_2

    .line 99
    .line 100
    iput v7, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->M()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->K()V

    .line 107
    .line 108
    .line 109
    iput-boolean v7, p0, Landroidx/media3/decoder/ffmpeg/b;->U:Z

    .line 110
    .line 111
    :cond_3
    :goto_1
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 112
    .line 113
    iget-object p1, v8, Lxc5;->o:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Landroid/os/Handler;

    .line 116
    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    new-instance v0, Lv6;

    .line 120
    .line 121
    invoke-direct {v0, v8, p0, v1, v7}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 125
    .line 126
    .line 127
    :cond_4
    return-void
.end method

.method public final M()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput v1, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 8
    .line 9
    iput-boolean v1, p0, Landroidx/media3/decoder/ffmpeg/b;->T:Z

    .line 10
    .line 11
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide v1, p0, Landroidx/media3/decoder/ffmpeg/b;->f0:J

    .line 17
    .line 18
    iput-wide v1, p0, Landroidx/media3/decoder/ffmpeg/b;->g0:J

    .line 19
    .line 20
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 25
    .line 26
    iget v3, v2, Lbj0;->b:I

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    iput v3, v2, Lbj0;->b:I

    .line 31
    .line 32
    check-cast v1, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 38
    .line 39
    check-cast v1, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 46
    .line 47
    iget-object v3, v2, Lxc5;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Landroid/os/Handler;

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    new-instance v4, Lk6;

    .line 54
    .line 55
    const/4 v5, 0x5

    .line 56
    invoke-direct {v4, v5, v2, v1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 63
    .line 64
    :cond_1
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->Q:Lpw0;

    .line 65
    .line 66
    invoke-static {v1, v0}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->Q:Lpw0;

    .line 70
    .line 71
    return-void
.end method

.method public final N(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->Z:J

    .line 2
    .line 3
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final O()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->m()Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 5
    .line 6
    check-cast v0, Ltj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ltj0;->h()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/high16 v2, -0x8000000000000000L

    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-boolean v2, p0, Landroidx/media3/decoder/ffmpeg/b;->W:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->V:J

    .line 24
    .line 25
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    :goto_0
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->V:J

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->W:Z

    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 6

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 3
    .line 4
    if-eq p1, v0, :cond_10

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_d

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p1, v0, :cond_c

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    if-eq p1, v0, :cond_b

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    if-eq p1, v0, :cond_8

    .line 19
    .line 20
    const/16 v0, 0xa

    .line 21
    .line 22
    if-eq p1, v0, :cond_7

    .line 23
    .line 24
    const/16 v0, 0x13

    .line 25
    .line 26
    if-eq p1, v0, :cond_4

    .line 27
    .line 28
    const/16 v0, 0x14

    .line 29
    .line 30
    if-eq p1, v0, :cond_0

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast p2, Ldn;

    .line 38
    .line 39
    check-cast p0, Ltj0;

    .line 40
    .line 41
    iget-object p1, p0, Ltj0;->r:Ldn;

    .line 42
    .line 43
    if-eq p2, p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Ldn;->d()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Ltj0;->r:Ldn;

    .line 49
    .line 50
    iget-object p1, p0, Ltj0;->s:Loj0;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p2}, Ldn;->f()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p2, Ldn;->e:Ltc2;

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    new-instance v0, Ltc2;

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v0, v1}, Ltc2;-><init>(Ljava/lang/Thread;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p2, Ldn;->e:Ltc2;

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    iput-boolean v1, v0, Ltc2;->i:Z

    .line 74
    .line 75
    :cond_1
    iget-object p2, p2, Ldn;->e:Ltc2;

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ltc2;->a(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    invoke-virtual {p0}, Ltj0;->v()V

    .line 81
    .line 82
    .line 83
    :cond_3
    return-void

    .line 84
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast p2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    check-cast p0, Ltj0;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const/4 p2, -0x1

    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    if-eq p1, p2, :cond_5

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_5
    move p1, p2

    .line 105
    :goto_0
    iget p2, p0, Ltj0;->U:I

    .line 106
    .line 107
    if-ne p2, p1, :cond_6

    .line 108
    .line 109
    goto/16 :goto_3

    .line 110
    .line 111
    :cond_6
    iput p1, p0, Ltj0;->U:I

    .line 112
    .line 113
    invoke-virtual {p0}, Ltj0;->v()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_7
    check-cast p2, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    check-cast p0, Ltj0;

    .line 124
    .line 125
    invoke-virtual {p0, p1}, Ltj0;->y(I)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_8
    check-cast p2, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    check-cast p0, Ltj0;

    .line 136
    .line 137
    iput-boolean p1, p0, Ltj0;->y:Z

    .line 138
    .line 139
    invoke-virtual {p0}, Ltj0;->C()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_9

    .line 144
    .line 145
    sget-object p1, Lqh3;->d:Lqh3;

    .line 146
    .line 147
    :goto_1
    move-object v1, p1

    .line 148
    goto :goto_2

    .line 149
    :cond_9
    iget-object p1, p0, Ltj0;->x:Lqh3;

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :goto_2
    new-instance v0, Lrj0;

    .line 153
    .line 154
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-direct/range {v0 .. v5}, Lrj0;-><init>(Lqh3;JJ)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Ltj0;->p()Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_a

    .line 172
    .line 173
    iput-object v0, p0, Ltj0;->v:Lrj0;

    .line 174
    .line 175
    return-void

    .line 176
    :cond_a
    iput-object v0, p0, Ltj0;->w:Lrj0;

    .line 177
    .line 178
    return-void

    .line 179
    :cond_b
    check-cast p2, Landroid/media/AudioDeviceInfo;

    .line 180
    .line 181
    check-cast p0, Ltj0;

    .line 182
    .line 183
    iput-object p2, p0, Ltj0;->T:Landroid/media/AudioDeviceInfo;

    .line 184
    .line 185
    iget-object p0, p0, Ltj0;->t:Lan;

    .line 186
    .line 187
    if-eqz p0, :cond_11

    .line 188
    .line 189
    iget-object p0, p0, Lan;->a:Landroid/media/AudioTrack;

    .line 190
    .line 191
    invoke-virtual {p0, p2}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_c
    check-cast p2, Lxn;

    .line 196
    .line 197
    check-cast p0, Ltj0;

    .line 198
    .line 199
    invoke-virtual {p0, p2}, Ltj0;->z(Lxn;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_d
    check-cast p2, Lil;

    .line 204
    .line 205
    check-cast p0, Ltj0;

    .line 206
    .line 207
    iget-object p1, p0, Ltj0;->u:Lil;

    .line 208
    .line 209
    invoke-virtual {p1, p2}, Lil;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_e

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_e
    iput-object p2, p0, Ltj0;->u:Lil;

    .line 217
    .line 218
    iget-boolean p1, p0, Ltj0;->V:Z

    .line 219
    .line 220
    if-eqz p1, :cond_f

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_f
    invoke-virtual {p0}, Ltj0;->v()V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_10
    check-cast p2, Ljava/lang/Float;

    .line 228
    .line 229
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    check-cast p0, Ltj0;

    .line 234
    .line 235
    iget p2, p0, Ltj0;->H:F

    .line 236
    .line 237
    cmpl-float p2, p2, p1

    .line 238
    .line 239
    if-eqz p2, :cond_11

    .line 240
    .line 241
    iput p1, p0, Ltj0;->H:F

    .line 242
    .line 243
    invoke-virtual {p0}, Ltj0;->p()Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_11

    .line 248
    .line 249
    iget-object p1, p0, Ltj0;->t:Lan;

    .line 250
    .line 251
    iget p0, p0, Ltj0;->H:F

    .line 252
    .line 253
    iget-object p1, p1, Lan;->a:Landroid/media/AudioTrack;

    .line 254
    .line 255
    invoke-virtual {p1, p0}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 256
    .line 257
    .line 258
    :cond_11
    :goto_3
    return-void
.end method

.method public final d(Lqh3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ltj0;->B(Lqh3;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f(JJ)J
    .locals 7

    .line 1
    iget-object p3, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 2
    .line 3
    check-cast p3, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p3}, Ltj0;->n()Z

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    iget-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 17
    .line 18
    cmp-long p4, v2, v0

    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    const/4 p4, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p4, 0x0

    .line 25
    :goto_0
    iget-boolean v2, p0, Landroidx/media3/decoder/ffmpeg/b;->e0:Z

    .line 26
    .line 27
    const-wide/16 v3, 0x2710

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    iget-boolean p0, p0, Landroidx/media3/decoder/ffmpeg/b;->Y:Z

    .line 34
    .line 35
    if-eqz p0, :cond_5

    .line 36
    .line 37
    :cond_1
    const-wide/32 p0, 0xf4240

    .line 38
    .line 39
    .line 40
    return-wide p0

    .line 41
    :cond_2
    invoke-virtual {p3}, Ltj0;->g()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    iget-boolean p3, p0, Landroidx/media3/decoder/ffmpeg/b;->d0:Z

    .line 46
    .line 47
    if-eqz p3, :cond_5

    .line 48
    .line 49
    if-eqz p4, :cond_5

    .line 50
    .line 51
    cmp-long p3, v5, v0

    .line 52
    .line 53
    if-nez p3, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    iget-wide p3, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 57
    .line 58
    sub-long/2addr p3, p1

    .line 59
    invoke-static {v5, v6, p3, p4}, Ljava/lang/Math;->min(JJ)J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    long-to-float p1, p1

    .line 64
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->i()Lqh3;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-eqz p2, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->i()Lqh3;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget p0, p0, Lqh3;->a:F

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const/high16 p0, 0x3f800000    # 1.0f

    .line 78
    .line 79
    :goto_1
    div-float/2addr p1, p0

    .line 80
    const/high16 p0, 0x40000000    # 2.0f

    .line 81
    .line 82
    div-float/2addr p1, p0

    .line 83
    float-to-long p0, p1

    .line 84
    invoke-static {v3, v4, p0, p1}, Ljava/lang/Math;->max(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide p0

    .line 88
    return-wide p0

    .line 89
    :cond_5
    :goto_2
    return-wide v3
.end method

.method public final g()Lyj2;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "FfmpegAudioRenderer"

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Lqh3;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    iget-object p0, p0, Ltj0;->x:Lqh3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget v0, p0, Lkq;->u:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->O()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/b;->V:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final k()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->c0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, p0, Landroidx/media3/decoder/ffmpeg/b;->c0:Z

    .line 5
    .line 6
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->Y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 6
    .line 7
    check-cast p0, Ltj0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ltj0;->p()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Ltj0;->L:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ltj0;->n()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final o()Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 2
    .line 3
    check-cast p0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ltj0;->n()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->J:Ltb1;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    iput-boolean v2, p0, Landroidx/media3/decoder/ffmpeg/b;->U:Z

    .line 8
    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v2, v3}, Landroidx/media3/decoder/ffmpeg/b;->N(J)V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    iput-boolean v4, p0, Landroidx/media3/decoder/ffmpeg/b;->c0:Z

    .line 19
    .line 20
    iput-boolean v4, p0, Landroidx/media3/decoder/ffmpeg/b;->d0:Z

    .line 21
    .line 22
    iput-wide v2, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 23
    .line 24
    :try_start_0
    iget-object v2, p0, Landroidx/media3/decoder/ffmpeg/b;->R:Lpw0;

    .line 25
    .line 26
    invoke-static {v2, v1}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->R:Lpw0;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->M()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 35
    .line 36
    check-cast v1, Ltj0;

    .line 37
    .line 38
    invoke-virtual {v1}, Ltj0;->w()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Lxc5;->o(Lbj0;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v1

    .line 48
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lxc5;->o(Lbj0;)V

    .line 51
    .line 52
    .line 53
    throw v1
.end method

.method public final q(ZZ)V
    .locals 3

    .line 1
    new-instance p1, Lbj0;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/media3/decoder/ffmpeg/b;->I:Lbj0;

    .line 7
    .line 8
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 9
    .line 10
    iget-object v0, p2, Lxc5;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/os/Handler;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v2, Lkm;

    .line 18
    .line 19
    invoke-direct {v2, p2, p1, v1}, Lkm;-><init>(Lxc5;Lbj0;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lkq;->q:Ldz3;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-boolean p1, p1, Ldz3;->b:Z

    .line 31
    .line 32
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    move-object p1, p2

    .line 37
    check-cast p1, Ltj0;

    .line 38
    .line 39
    iget-boolean v0, p1, Ltj0;->P:Z

    .line 40
    .line 41
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 42
    .line 43
    .line 44
    iget-boolean v0, p1, Ltj0;->V:Z

    .line 45
    .line 46
    if-nez v0, :cond_2

    .line 47
    .line 48
    iput-boolean v1, p1, Ltj0;->V:Z

    .line 49
    .line 50
    invoke-virtual {p1}, Ltj0;->v()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object p1, p2

    .line 55
    check-cast p1, Ltj0;

    .line 56
    .line 57
    iget-boolean v0, p1, Ltj0;->V:Z

    .line 58
    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-boolean v0, p1, Ltj0;->V:Z

    .line 63
    .line 64
    invoke-virtual {p1}, Ltj0;->v()V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    iget-object p1, p0, Lkq;->s:Lik3;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast p2, Ltj0;

    .line 73
    .line 74
    iput-object p1, p2, Ltj0;->m:Lik3;

    .line 75
    .line 76
    iget-object p0, p0, Lkq;->t:Lvp4;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p1, p2, Ltj0;->r:Ldn;

    .line 82
    .line 83
    iput-object p0, p1, Ldn;->f:Lvp4;

    .line 84
    .line 85
    return-void
.end method

.method public final r(JZZ)V
    .locals 0

    .line 1
    iget-object p3, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 2
    .line 3
    check-cast p3, Ltj0;

    .line 4
    .line 5
    invoke-virtual {p3}, Ltj0;->f()V

    .line 6
    .line 7
    .line 8
    iput-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->V:J

    .line 9
    .line 10
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->h0:J

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->c0:Z

    .line 19
    .line 20
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->d0:Z

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    iput-boolean p2, p0, Landroidx/media3/decoder/ffmpeg/b;->W:Z

    .line 24
    .line 25
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->X:Z

    .line 26
    .line 27
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->Y:Z

    .line 28
    .line 29
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    iget p2, p0, Landroidx/media3/decoder/ffmpeg/b;->S:I

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->M()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->K()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const/4 p2, 0x0

    .line 45
    iput-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->O:Lcj0;

    .line 46
    .line 47
    iget-object p3, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 48
    .line 49
    if-eqz p3, :cond_1

    .line 50
    .line 51
    invoke-virtual {p3}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->s()V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->P:Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 55
    .line 56
    :cond_1
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->N:Lzi0;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast p2, Lve4;

    .line 62
    .line 63
    invoke-virtual {p2}, Lve4;->flush()V

    .line 64
    .line 65
    .line 66
    iget-wide p3, p0, Lkq;->y:J

    .line 67
    .line 68
    invoke-virtual {p2, p3, p4}, Lve4;->b(J)V

    .line 69
    .line 70
    .line 71
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->T:Z

    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 2
    .line 3
    check-cast v0, Ltj0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltj0;->r()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->e0:Z

    .line 10
    .line 11
    return-void
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/media3/decoder/ffmpeg/b;->O()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/b;->G:Lsm;

    .line 5
    .line 6
    check-cast v0, Ltj0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ltj0;->q()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->e0:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->d0:Z

    .line 15
    .line 16
    return-void
.end method

.method public final x([Ltb1;JJLmt2;)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/media3/decoder/ffmpeg/b;->M:Z

    .line 3
    .line 4
    iget-wide p1, p0, Landroidx/media3/decoder/ffmpeg/b;->Z:J

    .line 5
    .line 6
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    cmp-long p1, p1, v0

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p4, p5}, Landroidx/media3/decoder/ffmpeg/b;->N(J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget p1, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 20
    .line 21
    iget-object p2, p0, Landroidx/media3/decoder/ffmpeg/b;->a0:[J

    .line 22
    .line 23
    array-length p3, p2

    .line 24
    if-ne p1, p3, :cond_1

    .line 25
    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string p3, "Too many stream changes, so dropping offset: "

    .line 29
    .line 30
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget p3, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 34
    .line 35
    add-int/lit8 p3, p3, -0x1

    .line 36
    .line 37
    aget-wide v0, p2, p3

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p3, "DecoderAudioRenderer"

    .line 47
    .line 48
    invoke-static {p3, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 53
    .line 54
    iput p1, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 55
    .line 56
    :goto_0
    iget p0, p0, Landroidx/media3/decoder/ffmpeg/b;->b0:I

    .line 57
    .line 58
    add-int/lit8 p0, p0, -0x1

    .line 59
    .line 60
    aput-wide p4, p2, p0

    .line 61
    .line 62
    return-void
.end method
