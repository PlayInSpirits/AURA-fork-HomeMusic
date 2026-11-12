.class public abstract Lgk2;
.super Lkq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final T0:[B


# instance fields
.field public A0:Z

.field public B0:Z

.field public C0:Z

.field public D0:J

.field public E0:Z

.field public final F:Landroid/content/Context;

.field public F0:Z

.field public final G:Lzj2;

.field public G0:Z

.field public final H:Lkf2;

.field public H0:Z

.field public final I:F

.field public I0:Landroidx/media3/exoplayer/ExoPlaybackException;

.field public final J:Lcj0;

.field public J0:Lbj0;

.field public final K:Lcj0;

.field public K0:Lfk2;

.field public final L:Lcj0;

.field public L0:J

.field public final M:Lpr;

.field public M0:Z

.field public final N:Landroid/media/MediaCodec$BufferInfo;

.field public N0:Z

.field public final O:Ljava/util/ArrayDeque;

.field public O0:Z

.field public final P:Lj83;

.field public P0:J

.field public final Q:Ljava/util/concurrent/atomic/AtomicInteger;

.field public Q0:Lh40;

.field public R:Ltb1;

.field public R0:Lh40;

.field public S:Ltb1;

.field public S0:Ljx1;

.field public T:Lpw0;

.field public U:Lpw0;

.field public V:Lk41;

.field public W:Landroid/media/MediaCrypto;

.field public final X:J

.field public Y:F

.field public Z:F

.field public a0:Lak2;

.field public b0:Ltb1;

.field public c0:Landroid/media/MediaFormat;

.field public d0:Z

.field public e0:F

.field public f0:Ljava/util/ArrayDeque;

.field public g0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

.field public h0:Ldk2;

.field public i0:I

.field public j0:Z

.field public k0:Z

.field public l0:Z

.field public m0:Z

.field public n0:J

.field public o0:J

.field public p0:I

.field public q0:I

.field public r0:Ljava/nio/ByteBuffer;

.field public s0:Z

.field public t0:Z

.field public u0:Z

.field public v0:Z

.field public w0:Z

.field public x0:I

.field public y0:I

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lgk2;->T0:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x67t
        0x42t
        -0x40t
        0xbt
        -0x26t
        0x25t
        -0x70t
        0x0t
        0x0t
        0x1t
        0x68t
        -0x32t
        0xft
        0x13t
        0x20t
        0x0t
        0x0t
        0x1t
        0x65t
        -0x78t
        -0x7ct
        0xdt
        -0x32t
        0x71t
        0x18t
        -0x60t
        0x0t
        0x2ft
        -0x41t
        0x1ct
        0x31t
        -0x3dt
        0x27t
        0x5dt
        0x78t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;ILzj2;F)V
    .locals 2

    .line 1
    sget-object v0, Lkf2;->p:Lkf2;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkq;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lgk2;->F:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p3, p0, Lgk2;->G:Lzj2;

    .line 13
    .line 14
    iput-object v0, p0, Lgk2;->H:Lkf2;

    .line 15
    .line 16
    iput p4, p0, Lgk2;->I:F

    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lgk2;->Q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    new-instance p1, Lcj0;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p1, p2, p2}, Lcj0;-><init>(II)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lgk2;->J:Lcj0;

    .line 32
    .line 33
    new-instance p1, Lcj0;

    .line 34
    .line 35
    invoke-direct {p1, p2, p2}, Lcj0;-><init>(II)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lgk2;->K:Lcj0;

    .line 39
    .line 40
    new-instance p1, Lcj0;

    .line 41
    .line 42
    const/4 p3, 0x2

    .line 43
    invoke-direct {p1, p3, p2}, Lcj0;-><init>(II)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lgk2;->L:Lcj0;

    .line 47
    .line 48
    new-instance p1, Lpr;

    .line 49
    .line 50
    invoke-direct {p1, p3, p2}, Lcj0;-><init>(II)V

    .line 51
    .line 52
    .line 53
    const/16 p4, 0x20

    .line 54
    .line 55
    iput p4, p1, Lpr;->z:I

    .line 56
    .line 57
    iput-object p1, p0, Lgk2;->M:Lpr;

    .line 58
    .line 59
    new-instance p4, Landroid/media/MediaCodec$BufferInfo;

    .line 60
    .line 61
    invoke-direct {p4}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object p4, p0, Lgk2;->N:Landroid/media/MediaCodec$BufferInfo;

    .line 65
    .line 66
    const/high16 p4, 0x3f800000    # 1.0f

    .line 67
    .line 68
    iput p4, p0, Lgk2;->Y:F

    .line 69
    .line 70
    iput p4, p0, Lgk2;->Z:F

    .line 71
    .line 72
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    iput-wide v0, p0, Lgk2;->X:J

    .line 78
    .line 79
    new-instance p4, Ljava/util/ArrayDeque;

    .line 80
    .line 81
    invoke-direct {p4}, Ljava/util/ArrayDeque;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p4, p0, Lgk2;->O:Ljava/util/ArrayDeque;

    .line 85
    .line 86
    sget-object p4, Lfk2;->f:Lfk2;

    .line 87
    .line 88
    iput-object p4, p0, Lgk2;->K0:Lfk2;

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Lcj0;->t(I)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p1, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    invoke-virtual {p1, p4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 100
    .line 101
    .line 102
    new-instance p1, Lj83;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    sget-object p4, Lim;->a:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    iput-object p4, p1, Lj83;->p:Ljava/lang/Object;

    .line 110
    .line 111
    iput p2, p1, Lj83;->o:I

    .line 112
    .line 113
    iput p3, p1, Lj83;->n:I

    .line 114
    .line 115
    iput-object p1, p0, Lgk2;->P:Lj83;

    .line 116
    .line 117
    const/high16 p1, -0x40800000    # -1.0f

    .line 118
    .line 119
    iput p1, p0, Lgk2;->e0:F

    .line 120
    .line 121
    iput p2, p0, Lgk2;->i0:I

    .line 122
    .line 123
    iput p2, p0, Lgk2;->x0:I

    .line 124
    .line 125
    const/4 p1, -0x1

    .line 126
    iput p1, p0, Lgk2;->p0:I

    .line 127
    .line 128
    iput p1, p0, Lgk2;->q0:I

    .line 129
    .line 130
    iput-wide v0, p0, Lgk2;->o0:J

    .line 131
    .line 132
    iput-wide v0, p0, Lgk2;->D0:J

    .line 133
    .line 134
    iput-wide v0, p0, Lgk2;->L0:J

    .line 135
    .line 136
    iput-wide v0, p0, Lgk2;->n0:J

    .line 137
    .line 138
    iput p2, p0, Lgk2;->y0:I

    .line 139
    .line 140
    iput p2, p0, Lgk2;->z0:I

    .line 141
    .line 142
    new-instance p1, Lbj0;

    .line 143
    .line 144
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    iput-object p1, p0, Lgk2;->J0:Lbj0;

    .line 148
    .line 149
    iput-boolean p2, p0, Lgk2;->O0:Z

    .line 150
    .line 151
    const-wide/16 p1, 0x0

    .line 152
    .line 153
    iput-wide p1, p0, Lgk2;->P0:J

    .line 154
    .line 155
    sget p1, Ljx1;->p:I

    .line 156
    .line 157
    sget-object p1, Lny3;->w:Lny3;

    .line 158
    .line 159
    iput-object p1, p0, Lgk2;->S0:Ljx1;

    .line 160
    .line 161
    sget-object p1, Lh40;->b:Lh40;

    .line 162
    .line 163
    iput-object p1, p0, Lgk2;->Q0:Lh40;

    .line 164
    .line 165
    iput-object p1, p0, Lgk2;->R0:Lh40;

    .line 166
    .line 167
    return-void
.end method


# virtual methods
.method public A(JJ)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lgk2;->H0:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lgk2;->H0:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lgk2;->l0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lgk2;->I0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 12
    .line 13
    if-nez v0, :cond_11

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    :try_start_0
    iget-boolean v2, p0, Lgk2;->F0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lgk2;->p0()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto/16 :goto_8

    .line 26
    .line 27
    :catch_1
    move-exception p1

    .line 28
    goto/16 :goto_b

    .line 29
    .line 30
    :cond_1
    iget-object v2, p0, Lgk2;->R:Ltb1;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    invoke-virtual {p0, v2}, Lgk2;->n0(I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p0, Lgk2;->t0:Z

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    const-string v2, "bypassRender"

    .line 50
    .line 51
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lgk2;->I(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_7

    .line 65
    .line 66
    :cond_4
    iget-object v2, p0, Lgk2;->a0:Lak2;

    .line 67
    .line 68
    if-eqz v2, :cond_b

    .line 69
    .line 70
    iget-object v2, p0, Lkq;->t:Lvp4;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    const-string v4, "drainAndFeed"

    .line 80
    .line 81
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lgk2;->L(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget-wide v7, p0, Lgk2;->X:J

    .line 96
    .line 97
    cmp-long v4, v7, v5

    .line 98
    .line 99
    if-eqz v4, :cond_6

    .line 100
    .line 101
    iget-object v4, p0, Lkq;->t:Lvp4;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    sub-long/2addr v9, v2

    .line 111
    cmp-long v4, v9, v7

    .line 112
    .line 113
    if-gez v4, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    move v4, v1

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    :goto_2
    move v4, v0

    .line 119
    :goto_3
    if-eqz v4, :cond_7

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_7
    :goto_4
    invoke-virtual {p0}, Lgk2;->M()Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    iget-wide p1, p0, Lgk2;->X:J

    .line 129
    .line 130
    cmp-long p3, p1, v5

    .line 131
    .line 132
    if-eqz p3, :cond_9

    .line 133
    .line 134
    iget-object p3, p0, Lkq;->t:Lvp4;

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 140
    .line 141
    .line 142
    move-result-wide p3

    .line 143
    sub-long/2addr p3, v2

    .line 144
    cmp-long p1, p3, p1

    .line 145
    .line 146
    if-gez p1, :cond_8

    .line 147
    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move p1, v1

    .line 150
    goto :goto_6

    .line 151
    :cond_9
    :goto_5
    move p1, v0

    .line 152
    :goto_6
    if-eqz p1, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 156
    .line 157
    .line 158
    goto :goto_7

    .line 159
    :cond_b
    iget-object p3, p0, Lgk2;->J0:Lbj0;

    .line 160
    .line 161
    iget p4, p3, Lbj0;->d:I

    .line 162
    .line 163
    iget-object v2, p0, Lkq;->v:Lq44;

    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-wide v3, p0, Lkq;->x:J

    .line 169
    .line 170
    sub-long/2addr p1, v3

    .line 171
    invoke-interface {v2, p1, p2}, Lq44;->u(J)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    add-int/2addr p4, p1

    .line 176
    iput p4, p3, Lbj0;->d:I

    .line 177
    .line 178
    invoke-virtual {p0, v0}, Lgk2;->n0(I)Z

    .line 179
    .line 180
    .line 181
    :goto_7
    iget-object p1, p0, Lgk2;->J0:Lbj0;

    .line 182
    .line 183
    monitor-enter p1

    .line 184
    monitor-exit p1
    :try_end_0
    .catch Landroid/media/MediaCodec$CryptoException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    return-void

    .line 186
    :goto_8
    instance-of p2, p1, Landroid/media/MediaCodec$CodecException;

    .line 187
    .line 188
    if-eqz p2, :cond_c

    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    array-length p4, p3

    .line 196
    if-lez p4, :cond_10

    .line 197
    .line 198
    aget-object p3, p3, v1

    .line 199
    .line 200
    invoke-virtual {p3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p3

    .line 204
    const-string p4, "android.media.MediaCodec"

    .line 205
    .line 206
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result p3

    .line 210
    if-eqz p3, :cond_10

    .line 211
    .line 212
    :goto_9
    invoke-virtual {p0, p1}, Lgk2;->b0(Ljava/lang/Exception;)V

    .line 213
    .line 214
    .line 215
    if-eqz p2, :cond_d

    .line 216
    .line 217
    move-object p2, p1

    .line 218
    check-cast p2, Landroid/media/MediaCodec$CodecException;

    .line 219
    .line 220
    invoke-virtual {p2}, Landroid/media/MediaCodec$CodecException;->isRecoverable()Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_d

    .line 225
    .line 226
    move v1, v0

    .line 227
    :cond_d
    if-eqz v1, :cond_e

    .line 228
    .line 229
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 230
    .line 231
    .line 232
    :cond_e
    iget-object p2, p0, Lgk2;->h0:Ldk2;

    .line 233
    .line 234
    invoke-virtual {p0, p1, p2}, Lgk2;->K(Ljava/lang/IllegalStateException;Ldk2;)Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget p2, p1, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;->n:I

    .line 239
    .line 240
    const/16 p3, 0x44d

    .line 241
    .line 242
    if-ne p2, p3, :cond_f

    .line 243
    .line 244
    const/16 p2, 0xfa6

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_f
    const/16 p2, 0xfa3

    .line 248
    .line 249
    :goto_a
    iget-object p3, p0, Lgk2;->R:Ltb1;

    .line 250
    .line 251
    invoke-virtual {p0, p1, p3, v1, p2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    throw p0

    .line 256
    :cond_10
    throw p1

    .line 257
    :goto_b
    iget-object p2, p0, Lgk2;->R:Ltb1;

    .line 258
    .line 259
    invoke-virtual {p1}, Landroid/media/MediaCodec$CryptoException;->getErrorCode()I

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    invoke-static {p3}, Lf35;->y(I)I

    .line 264
    .line 265
    .line 266
    move-result p3

    .line 267
    invoke-virtual {p0, p1, p2, v1, p3}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    throw p0

    .line 272
    :cond_11
    const/4 p1, 0x0

    .line 273
    iput-object p1, p0, Lgk2;->I0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 274
    .line 275
    throw v0
.end method

.method public abstract A0(Lkf2;Ltb1;)I
.end method

.method public final B0(Ltb1;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    iget v0, p0, Lgk2;->z0:I

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    if-eq v0, v2, :cond_5

    .line 10
    .line 11
    iget v0, p0, Lkq;->u:I

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget v0, p0, Lgk2;->Z:F

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Lkq;->w:[Ltb1;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, p1, v3}, Lgk2;->Q(FLtb1;[Ltb1;)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget v0, p0, Lgk2;->e0:F

    .line 31
    .line 32
    cmpl-float v3, v0, p1

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    const/high16 v3, -0x40800000    # -1.0f

    .line 38
    .line 39
    cmpl-float v4, p1, v3

    .line 40
    .line 41
    if-nez v4, :cond_3

    .line 42
    .line 43
    iget-boolean p1, p0, Lgk2;->A0:Z

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iput v1, p0, Lgk2;->y0:I

    .line 48
    .line 49
    iput v2, p0, Lgk2;->z0:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 56
    .line 57
    .line 58
    :goto_0
    const/4 p0, 0x0

    .line 59
    return p0

    .line 60
    :cond_3
    cmpl-float v0, v0, v3

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    iget v0, p0, Lgk2;->I:F

    .line 65
    .line 66
    cmpl-float v0, p1, v0

    .line 67
    .line 68
    if-lez v0, :cond_5

    .line 69
    .line 70
    :cond_4
    new-instance v0, Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v2, "operating-rate"

    .line 76
    .line 77
    invoke-virtual {v0, v2, p1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 78
    .line 79
    .line 80
    iget-object v2, p0, Lgk2;->a0:Lak2;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-interface {v2, v0}, Lak2;->c(Landroid/os/Bundle;)V

    .line 86
    .line 87
    .line 88
    iput p1, p0, Lgk2;->e0:F

    .line 89
    .line 90
    :cond_5
    :goto_1
    return v1
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgk2;->U:Lpw0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lpw0;->h()Lse1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lse1;->b:[B

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroid/media/MediaCrypto;->setMediaDrmSession([B)V
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    iget-object v2, p0, Lgk2;->R:Ltb1;

    .line 26
    .line 27
    const/16 v3, 0x1776

    .line 28
    .line 29
    invoke-virtual {p0, v0, v2, v1, v3}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    throw p0

    .line 34
    :cond_0
    :goto_0
    iget-object v0, p0, Lgk2;->U:Lpw0;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lgk2;->t0(Lpw0;)V

    .line 37
    .line 38
    .line 39
    iput v1, p0, Lgk2;->y0:I

    .line 40
    .line 41
    iput v1, p0, Lgk2;->z0:I

    .line 42
    .line 43
    return-void
.end method

.method public D(FF)V
    .locals 0

    .line 1
    iput p1, p0, Lgk2;->Y:F

    .line 2
    .line 3
    iput p2, p0, Lgk2;->Z:F

    .line 4
    .line 5
    iget-object p1, p0, Lgk2;->b0:Ltb1;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lgk2;->B0(Ltb1;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final D0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->K0:Lfk2;

    .line 2
    .line 3
    iget-object v0, v0, Lfk2;->d:Ltu;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ltu;->f(J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ltb1;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, Lgk2;->M0:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lgk2;->c0:Landroid/media/MediaFormat;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lgk2;->K0:Lfk2;

    .line 22
    .line 23
    iget-object p1, p1, Lfk2;->d:Ltu;

    .line 24
    .line 25
    invoke-virtual {p1}, Ltu;->e()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ltb1;

    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iput-object p1, p0, Lgk2;->S:Ltb1;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-boolean p1, p0, Lgk2;->d0:Z

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p0, Lgk2;->S:Ltb1;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :goto_0
    iget-object p1, p0, Lgk2;->S:Ltb1;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, Lgk2;->c0:Landroid/media/MediaFormat;

    .line 50
    .line 51
    invoke-virtual {p0, p1, p2}, Lgk2;->g0(Ltb1;Landroid/media/MediaFormat;)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-boolean p1, p0, Lgk2;->d0:Z

    .line 56
    .line 57
    iput-boolean p1, p0, Lgk2;->M0:Z

    .line 58
    .line 59
    :cond_2
    return-void
.end method

.method public final E(Ltb1;)I
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lgk2;->H:Lkf2;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lgk2;->A0(Lkf2;Ltb1;)I

    .line 4
    .line 5
    .line 6
    move-result p0
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    const/16 v1, 0xfa2

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, v0, p1, v2, v1}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public final F()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public final H(Landroid/media/MediaFormat;)V
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_6

    .line 6
    .line 7
    iget-object p0, p0, Lgk2;->Q0:Lh40;

    .line 8
    .line 9
    iget-object p0, p0, Lh40;->a:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_6

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of v2, v0, Ljava/lang/Integer;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Integer;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    instance-of v2, v0, Ljava/lang/Long;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    check-cast v0, Ljava/lang/Long;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-virtual {p1, v1, v2, v3}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    instance-of v2, v0, Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v2, :cond_4

    .line 79
    .line 80
    check-cast v0, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    instance-of v2, v0, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    instance-of v2, v0, Ljava/nio/ByteBuffer;

    .line 101
    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    invoke-virtual {p1, v1, v0}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    return-void
.end method

.method public final I(JJ)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lgk2;->F0:Z

    .line 4
    .line 5
    const/4 v15, 0x1

    .line 6
    xor-int/2addr v1, v15

    .line 7
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lgk2;->M:Lpr;

    .line 11
    .line 12
    invoke-virtual {v1}, Lpr;->w()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x4

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v6, v1, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    iget v7, v0, Lgk2;->q0:I

    .line 22
    .line 23
    iget v9, v1, Lpr;->y:I

    .line 24
    .line 25
    iget-wide v10, v1, Lcj0;->t:J

    .line 26
    .line 27
    iget-wide v12, v0, Lkq;->y:J

    .line 28
    .line 29
    iget-wide v4, v1, Lpr;->x:J

    .line 30
    .line 31
    invoke-virtual {v0, v12, v13, v4, v5}, Lgk2;->X(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v12

    .line 35
    invoke-virtual {v1, v3}, Luv;->d(I)Z

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    iget-object v14, v0, Lgk2;->S:Ltb1;

    .line 40
    .line 41
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    move-wide/from16 v3, p3

    .line 47
    .line 48
    move-object v15, v1

    .line 49
    move-wide/from16 v1, p1

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v14}, Lgk2;->m0(JJLak2;Ljava/nio/ByteBuffer;IIIJZZLtb1;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    iget-wide v1, v15, Lpr;->x:J

    .line 58
    .line 59
    invoke-virtual {v0, v1, v2}, Lgk2;->i0(J)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v15}, Lpr;->r()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v2, 0x0

    .line 67
    goto/16 :goto_10

    .line 68
    .line 69
    :cond_1
    move-object v15, v1

    .line 70
    :goto_0
    iget-boolean v1, v0, Lgk2;->E0:Z

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    iput-boolean v1, v0, Lgk2;->F0:Z

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    return v2

    .line 79
    :cond_2
    const/4 v2, 0x0

    .line 80
    iget-boolean v1, v0, Lgk2;->u0:Z

    .line 81
    .line 82
    iget-object v3, v0, Lgk2;->L:Lcj0;

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v15, v3}, Lpr;->v(Lcj0;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 91
    .line 92
    .line 93
    iput-boolean v2, v0, Lgk2;->u0:Z

    .line 94
    .line 95
    :cond_3
    iget-boolean v1, v0, Lgk2;->v0:Z

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {v15}, Lpr;->w()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    :cond_4
    :goto_1
    const/16 v17, 0x1

    .line 106
    .line 107
    goto/16 :goto_11

    .line 108
    .line 109
    :cond_5
    iput-boolean v2, v0, Lgk2;->t0:Z

    .line 110
    .line 111
    invoke-virtual {v0}, Lgk2;->q0()V

    .line 112
    .line 113
    .line 114
    iput-boolean v2, v0, Lgk2;->v0:Z

    .line 115
    .line 116
    invoke-virtual {v0}, Lgk2;->Y()V

    .line 117
    .line 118
    .line 119
    iget-boolean v1, v0, Lgk2;->t0:Z

    .line 120
    .line 121
    if-nez v1, :cond_6

    .line 122
    .line 123
    goto/16 :goto_10

    .line 124
    .line 125
    :cond_6
    iget-boolean v1, v0, Lgk2;->E0:Z

    .line 126
    .line 127
    const/16 v17, 0x1

    .line 128
    .line 129
    xor-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v0, Lkq;->p:Lgp3;

    .line 135
    .line 136
    invoke-virtual {v1}, Lgp3;->d()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Lcj0;->r()V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-virtual {v3}, Lcj0;->r()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1, v3, v2}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    const/4 v5, -0x5

    .line 150
    if-eq v4, v5, :cond_20

    .line 151
    .line 152
    const/4 v5, -0x4

    .line 153
    if-eq v4, v5, :cond_9

    .line 154
    .line 155
    const/4 v1, -0x3

    .line 156
    if-ne v4, v1, :cond_8

    .line 157
    .line 158
    invoke-virtual {v0}, Lkq;->l()Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_21

    .line 163
    .line 164
    invoke-virtual {v0}, Lgk2;->T()Lfk2;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-wide v3, v0, Lgk2;->D0:J

    .line 169
    .line 170
    iput-wide v3, v1, Lfk2;->e:J

    .line 171
    .line 172
    goto/16 :goto_f

    .line 173
    .line 174
    :cond_8
    invoke-static {}, Ltb4;->a()V

    .line 175
    .line 176
    .line 177
    return v2

    .line 178
    :cond_9
    const/4 v4, 0x4

    .line 179
    invoke-virtual {v3, v4}, Luv;->d(I)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_a

    .line 184
    .line 185
    const/4 v5, 0x1

    .line 186
    iput-boolean v5, v0, Lgk2;->E0:Z

    .line 187
    .line 188
    invoke-virtual {v0}, Lgk2;->T()Lfk2;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    iget-wide v3, v0, Lgk2;->D0:J

    .line 193
    .line 194
    iput-wide v3, v1, Lfk2;->e:J

    .line 195
    .line 196
    goto/16 :goto_f

    .line 197
    .line 198
    :cond_a
    iget-wide v5, v0, Lgk2;->D0:J

    .line 199
    .line 200
    iget-wide v7, v3, Lcj0;->t:J

    .line 201
    .line 202
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v5

    .line 206
    iput-wide v5, v0, Lgk2;->D0:J

    .line 207
    .line 208
    invoke-virtual {v0}, Lkq;->l()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-nez v5, :cond_b

    .line 213
    .line 214
    iget-object v5, v0, Lgk2;->K:Lcj0;

    .line 215
    .line 216
    const/high16 v6, 0x20000000

    .line 217
    .line 218
    invoke-virtual {v5, v6}, Luv;->d(I)Z

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    if-eqz v5, :cond_c

    .line 223
    .line 224
    :cond_b
    invoke-virtual {v0}, Lgk2;->T()Lfk2;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    iget-wide v6, v0, Lgk2;->D0:J

    .line 229
    .line 230
    iput-wide v6, v5, Lfk2;->e:J

    .line 231
    .line 232
    :cond_c
    iget-boolean v5, v0, Lgk2;->G0:Z

    .line 233
    .line 234
    const/16 v6, 0xff

    .line 235
    .line 236
    const/4 v7, 0x0

    .line 237
    const-string v8, "audio/opus"

    .line 238
    .line 239
    if-eqz v5, :cond_e

    .line 240
    .line 241
    iget-object v5, v0, Lgk2;->R:Ltb1;

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iput-object v5, v0, Lgk2;->S:Ltb1;

    .line 247
    .line 248
    iget-object v5, v5, Ltb1;->n:Ljava/lang/String;

    .line 249
    .line 250
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_d

    .line 255
    .line 256
    iget-object v5, v0, Lgk2;->S:Ltb1;

    .line 257
    .line 258
    iget-object v5, v5, Ltb1;->q:Ljava/util/List;

    .line 259
    .line 260
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v5, :cond_d

    .line 265
    .line 266
    iget-object v5, v0, Lgk2;->S:Ltb1;

    .line 267
    .line 268
    iget-object v5, v5, Ltb1;->q:Ljava/util/List;

    .line 269
    .line 270
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    check-cast v5, [B

    .line 275
    .line 276
    const/16 v9, 0xb

    .line 277
    .line 278
    aget-byte v9, v5, v9

    .line 279
    .line 280
    and-int/2addr v9, v6

    .line 281
    shl-int/lit8 v9, v9, 0x8

    .line 282
    .line 283
    const/16 v10, 0xa

    .line 284
    .line 285
    aget-byte v5, v5, v10

    .line 286
    .line 287
    and-int/2addr v5, v6

    .line 288
    or-int/2addr v5, v9

    .line 289
    iget-object v9, v0, Lgk2;->S:Ltb1;

    .line 290
    .line 291
    invoke-virtual {v9}, Ltb1;->a()Lsb1;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    iput v5, v9, Lsb1;->H:I

    .line 296
    .line 297
    new-instance v5, Ltb1;

    .line 298
    .line 299
    invoke-direct {v5, v9}, Ltb1;-><init>(Lsb1;)V

    .line 300
    .line 301
    .line 302
    iput-object v5, v0, Lgk2;->S:Ltb1;

    .line 303
    .line 304
    :cond_d
    iget-object v5, v0, Lgk2;->S:Ltb1;

    .line 305
    .line 306
    invoke-virtual {v0, v5, v7}, Lgk2;->g0(Ltb1;Landroid/media/MediaFormat;)V

    .line 307
    .line 308
    .line 309
    iput-boolean v2, v0, Lgk2;->G0:Z

    .line 310
    .line 311
    :cond_e
    invoke-virtual {v3}, Lcj0;->u()V

    .line 312
    .line 313
    .line 314
    iget-object v5, v0, Lgk2;->S:Ltb1;

    .line 315
    .line 316
    if-eqz v5, :cond_1d

    .line 317
    .line 318
    iget-object v5, v5, Ltb1;->n:Ljava/lang/String;

    .line 319
    .line 320
    invoke-static {v5, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_1d

    .line 325
    .line 326
    const/high16 v5, 0x10000000

    .line 327
    .line 328
    invoke-virtual {v3, v5}, Luv;->d(I)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-eqz v5, :cond_f

    .line 333
    .line 334
    iget-object v5, v0, Lgk2;->S:Ltb1;

    .line 335
    .line 336
    iput-object v5, v3, Lcj0;->p:Ltb1;

    .line 337
    .line 338
    invoke-virtual {v0, v3}, Lgk2;->V(Lcj0;)V

    .line 339
    .line 340
    .line 341
    :cond_f
    iget-wide v8, v0, Lkq;->y:J

    .line 342
    .line 343
    iget-wide v10, v3, Lcj0;->t:J

    .line 344
    .line 345
    sub-long/2addr v8, v10

    .line 346
    const-wide/32 v10, 0x13880

    .line 347
    .line 348
    .line 349
    cmp-long v5, v8, v10

    .line 350
    .line 351
    if-gtz v5, :cond_1d

    .line 352
    .line 353
    iget-object v5, v0, Lgk2;->S:Ltb1;

    .line 354
    .line 355
    iget-object v5, v5, Ltb1;->q:Ljava/util/List;

    .line 356
    .line 357
    iget-object v8, v0, Lgk2;->P:Lj83;

    .line 358
    .line 359
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v9, v3, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 363
    .line 364
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    iget-object v9, v3, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 368
    .line 369
    invoke-virtual {v9}, Ljava/nio/Buffer;->limit()I

    .line 370
    .line 371
    .line 372
    move-result v9

    .line 373
    iget-object v10, v3, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 374
    .line 375
    invoke-virtual {v10}, Ljava/nio/Buffer;->position()I

    .line 376
    .line 377
    .line 378
    move-result v10

    .line 379
    sub-int/2addr v9, v10

    .line 380
    if-nez v9, :cond_10

    .line 381
    .line 382
    goto/16 :goto_c

    .line 383
    .line 384
    :cond_10
    iget v9, v8, Lj83;->n:I

    .line 385
    .line 386
    const/4 v10, 0x2

    .line 387
    if-ne v9, v10, :cond_12

    .line 388
    .line 389
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    const/4 v11, 0x1

    .line 394
    if-eq v9, v11, :cond_11

    .line 395
    .line 396
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    const/4 v11, 0x3

    .line 401
    if-ne v9, v11, :cond_12

    .line 402
    .line 403
    :cond_11
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    move-object v7, v5

    .line 408
    check-cast v7, [B

    .line 409
    .line 410
    :cond_12
    iget-object v5, v3, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    invoke-virtual {v5}, Ljava/nio/Buffer;->position()I

    .line 413
    .line 414
    .line 415
    move-result v9

    .line 416
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 417
    .line 418
    .line 419
    move-result v11

    .line 420
    sub-int v12, v11, v9

    .line 421
    .line 422
    add-int/lit16 v13, v12, 0xff

    .line 423
    .line 424
    div-int/2addr v13, v6

    .line 425
    add-int/lit8 v14, v13, 0x1b

    .line 426
    .line 427
    add-int/2addr v14, v12

    .line 428
    iget v4, v8, Lj83;->n:I

    .line 429
    .line 430
    if-ne v4, v10, :cond_14

    .line 431
    .line 432
    if-eqz v7, :cond_13

    .line 433
    .line 434
    array-length v4, v7

    .line 435
    add-int/lit8 v4, v4, 0x1c

    .line 436
    .line 437
    goto :goto_2

    .line 438
    :cond_13
    const/16 v4, 0x2f

    .line 439
    .line 440
    :goto_2
    add-int/lit8 v16, v4, 0x2c

    .line 441
    .line 442
    add-int v14, v16, v14

    .line 443
    .line 444
    goto :goto_3

    .line 445
    :cond_14
    move v4, v2

    .line 446
    :goto_3
    iget-object v6, v8, Lj83;->p:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 449
    .line 450
    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    .line 451
    .line 452
    .line 453
    move-result v6

    .line 454
    if-ge v6, v14, :cond_15

    .line 455
    .line 456
    invoke-static {v14}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    sget-object v14, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 461
    .line 462
    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    iput-object v6, v8, Lj83;->p:Ljava/lang/Object;

    .line 467
    .line 468
    goto :goto_4

    .line 469
    :cond_15
    iget-object v6, v8, Lj83;->p:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 472
    .line 473
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 474
    .line 475
    .line 476
    :goto_4
    iget-object v6, v8, Lj83;->p:Ljava/lang/Object;

    .line 477
    .line 478
    move-object/from16 v18, v6

    .line 479
    .line 480
    check-cast v18, Ljava/nio/ByteBuffer;

    .line 481
    .line 482
    iget v6, v8, Lj83;->n:I

    .line 483
    .line 484
    if-ne v6, v10, :cond_17

    .line 485
    .line 486
    if-eqz v7, :cond_16

    .line 487
    .line 488
    const/16 v22, 0x1

    .line 489
    .line 490
    const/16 v23, 0x1

    .line 491
    .line 492
    const-wide/16 v19, 0x0

    .line 493
    .line 494
    const/16 v21, 0x0

    .line 495
    .line 496
    invoke-static/range {v18 .. v23}, Lj83;->n(Ljava/nio/ByteBuffer;JIIZ)V

    .line 497
    .line 498
    .line 499
    move-object/from16 v6, v18

    .line 500
    .line 501
    array-length v10, v7

    .line 502
    move-object/from16 v16, v15

    .line 503
    .line 504
    int-to-long v14, v10

    .line 505
    invoke-static {v14, v15}, Lji2;->p(J)B

    .line 506
    .line 507
    .line 508
    move-result v10

    .line 509
    invoke-virtual {v6, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 510
    .line 511
    .line 512
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 520
    .line 521
    .line 522
    move-result v14

    .line 523
    array-length v15, v7

    .line 524
    add-int/lit8 v15, v15, 0x1c

    .line 525
    .line 526
    invoke-static {v14, v15, v2, v10}, Lf35;->o(III[B)I

    .line 527
    .line 528
    .line 529
    move-result v10

    .line 530
    const/16 v14, 0x16

    .line 531
    .line 532
    invoke-virtual {v6, v14, v10}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 533
    .line 534
    .line 535
    array-length v7, v7

    .line 536
    add-int/lit8 v7, v7, 0x1c

    .line 537
    .line 538
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 539
    .line 540
    .line 541
    goto :goto_5

    .line 542
    :cond_16
    move-object/from16 v16, v15

    .line 543
    .line 544
    move-object/from16 v6, v18

    .line 545
    .line 546
    sget-object v7, Lj83;->q:[B

    .line 547
    .line 548
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 549
    .line 550
    .line 551
    :goto_5
    sget-object v7, Lj83;->r:[B

    .line 552
    .line 553
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 554
    .line 555
    .line 556
    goto :goto_6

    .line 557
    :cond_17
    move-object/from16 v16, v15

    .line 558
    .line 559
    move-object/from16 v6, v18

    .line 560
    .line 561
    :goto_6
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 566
    .line 567
    .line 568
    move-result v10

    .line 569
    const/4 v14, 0x1

    .line 570
    if-le v10, v14, :cond_18

    .line 571
    .line 572
    invoke-virtual {v5, v14}, Ljava/nio/ByteBuffer;->get(I)B

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    goto :goto_7

    .line 577
    :cond_18
    move v10, v2

    .line 578
    :goto_7
    invoke-static {v7, v10}, Lsu3;->t(BB)J

    .line 579
    .line 580
    .line 581
    move-result-wide v14

    .line 582
    const-wide/32 v18, 0xbb80

    .line 583
    .line 584
    .line 585
    mul-long v14, v14, v18

    .line 586
    .line 587
    const-wide/32 v18, 0xf4240

    .line 588
    .line 589
    .line 590
    div-long v14, v14, v18

    .line 591
    .line 592
    long-to-int v7, v14

    .line 593
    iget v10, v8, Lj83;->o:I

    .line 594
    .line 595
    add-int/2addr v10, v7

    .line 596
    iput v10, v8, Lj83;->o:I

    .line 597
    .line 598
    int-to-long v14, v10

    .line 599
    iget v7, v8, Lj83;->n:I

    .line 600
    .line 601
    const/16 v23, 0x0

    .line 602
    .line 603
    move-object/from16 v18, v6

    .line 604
    .line 605
    move/from16 v21, v7

    .line 606
    .line 607
    move/from16 v22, v13

    .line 608
    .line 609
    move-wide/from16 v19, v14

    .line 610
    .line 611
    invoke-static/range {v18 .. v23}, Lj83;->n(Ljava/nio/ByteBuffer;JIIZ)V

    .line 612
    .line 613
    .line 614
    move v7, v2

    .line 615
    :goto_8
    if-ge v7, v13, :cond_1a

    .line 616
    .line 617
    const/16 v10, 0xff

    .line 618
    .line 619
    if-lt v12, v10, :cond_19

    .line 620
    .line 621
    const/4 v14, -0x1

    .line 622
    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 623
    .line 624
    .line 625
    add-int/lit16 v12, v12, -0xff

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :cond_19
    int-to-byte v12, v12

    .line 629
    invoke-virtual {v6, v12}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 630
    .line 631
    .line 632
    move v12, v2

    .line 633
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 634
    .line 635
    goto :goto_8

    .line 636
    :cond_1a
    :goto_a
    if-ge v9, v11, :cond_1b

    .line 637
    .line 638
    invoke-virtual {v5, v9}, Ljava/nio/ByteBuffer;->get(I)B

    .line 639
    .line 640
    .line 641
    move-result v7

    .line 642
    invoke-virtual {v6, v7}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 643
    .line 644
    .line 645
    add-int/lit8 v9, v9, 0x1

    .line 646
    .line 647
    goto :goto_a

    .line 648
    :cond_1b
    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    .line 649
    .line 650
    .line 651
    move-result v7

    .line 652
    invoke-virtual {v5, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 656
    .line 657
    .line 658
    iget v5, v8, Lj83;->n:I

    .line 659
    .line 660
    const/4 v7, 0x2

    .line 661
    if-ne v5, v7, :cond_1c

    .line 662
    .line 663
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 664
    .line 665
    .line 666
    move-result-object v5

    .line 667
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 668
    .line 669
    .line 670
    move-result v7

    .line 671
    add-int/2addr v7, v4

    .line 672
    add-int/lit8 v7, v7, 0x2c

    .line 673
    .line 674
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 675
    .line 676
    .line 677
    move-result v9

    .line 678
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 679
    .line 680
    .line 681
    move-result v10

    .line 682
    sub-int/2addr v9, v10

    .line 683
    invoke-static {v7, v9, v2, v5}, Lf35;->o(III[B)I

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    add-int/lit8 v4, v4, 0x42

    .line 688
    .line 689
    invoke-virtual {v6, v4, v5}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 690
    .line 691
    .line 692
    goto :goto_b

    .line 693
    :cond_1c
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->array()[B

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 698
    .line 699
    .line 700
    move-result v5

    .line 701
    invoke-virtual {v6}, Ljava/nio/Buffer;->limit()I

    .line 702
    .line 703
    .line 704
    move-result v7

    .line 705
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 706
    .line 707
    .line 708
    move-result v9

    .line 709
    sub-int/2addr v7, v9

    .line 710
    invoke-static {v5, v7, v2, v4}, Lf35;->o(III[B)I

    .line 711
    .line 712
    .line 713
    move-result v4

    .line 714
    const/16 v14, 0x16

    .line 715
    .line 716
    invoke-virtual {v6, v14, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 717
    .line 718
    .line 719
    :goto_b
    iget v4, v8, Lj83;->n:I

    .line 720
    .line 721
    const/16 v17, 0x1

    .line 722
    .line 723
    add-int/lit8 v4, v4, 0x1

    .line 724
    .line 725
    iput v4, v8, Lj83;->n:I

    .line 726
    .line 727
    iput-object v6, v8, Lj83;->p:Ljava/lang/Object;

    .line 728
    .line 729
    invoke-virtual {v3}, Lcj0;->r()V

    .line 730
    .line 731
    .line 732
    iget-object v4, v8, Lj83;->p:Ljava/lang/Object;

    .line 733
    .line 734
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 735
    .line 736
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 737
    .line 738
    .line 739
    move-result v4

    .line 740
    invoke-virtual {v3, v4}, Lcj0;->t(I)V

    .line 741
    .line 742
    .line 743
    iget-object v4, v3, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 744
    .line 745
    iget-object v5, v8, Lj83;->p:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 748
    .line 749
    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v3}, Lcj0;->u()V

    .line 753
    .line 754
    .line 755
    goto :goto_d

    .line 756
    :cond_1d
    :goto_c
    move-object/from16 v16, v15

    .line 757
    .line 758
    :goto_d
    invoke-virtual/range {v16 .. v16}, Lpr;->w()Z

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    if-nez v4, :cond_1e

    .line 763
    .line 764
    move-object/from16 v15, v16

    .line 765
    .line 766
    goto :goto_e

    .line 767
    :cond_1e
    iget-wide v4, v0, Lkq;->y:J

    .line 768
    .line 769
    move-object/from16 v15, v16

    .line 770
    .line 771
    iget-wide v6, v15, Lpr;->x:J

    .line 772
    .line 773
    invoke-virtual {v0, v4, v5, v6, v7}, Lgk2;->X(JJ)Z

    .line 774
    .line 775
    .line 776
    move-result v6

    .line 777
    iget-wide v7, v3, Lcj0;->t:J

    .line 778
    .line 779
    invoke-virtual {v0, v4, v5, v7, v8}, Lgk2;->X(JJ)Z

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    if-ne v6, v4, :cond_1f

    .line 784
    .line 785
    :goto_e
    invoke-virtual {v15, v3}, Lpr;->v(Lcj0;)Z

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    if-nez v4, :cond_7

    .line 790
    .line 791
    :cond_1f
    const/4 v11, 0x1

    .line 792
    iput-boolean v11, v0, Lgk2;->u0:Z

    .line 793
    .line 794
    goto :goto_f

    .line 795
    :cond_20
    invoke-virtual {v0, v1}, Lgk2;->f0(Lgp3;)Lej0;

    .line 796
    .line 797
    .line 798
    :cond_21
    :goto_f
    invoke-virtual {v15}, Lpr;->w()Z

    .line 799
    .line 800
    .line 801
    move-result v1

    .line 802
    if-eqz v1, :cond_22

    .line 803
    .line 804
    invoke-virtual {v15}, Lcj0;->u()V

    .line 805
    .line 806
    .line 807
    :cond_22
    invoke-virtual {v15}, Lpr;->w()Z

    .line 808
    .line 809
    .line 810
    move-result v1

    .line 811
    if-nez v1, :cond_4

    .line 812
    .line 813
    iget-boolean v1, v0, Lgk2;->E0:Z

    .line 814
    .line 815
    if-nez v1, :cond_4

    .line 816
    .line 817
    iget-boolean v0, v0, Lgk2;->v0:Z

    .line 818
    .line 819
    if-eqz v0, :cond_23

    .line 820
    .line 821
    goto/16 :goto_1

    .line 822
    .line 823
    :cond_23
    :goto_10
    return v2

    .line 824
    :goto_11
    return v17
.end method

.method public abstract J(Ldk2;Ltb1;Ltb1;)Lej0;
.end method

.method public K(Ljava/lang/IllegalStateException;Ldk2;)Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;
    .locals 0

    .line 1
    new-instance p0, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecDecoderException;-><init>(Ljava/lang/IllegalStateException;Ldk2;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final L(JJ)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v5, v0, Lgk2;->a0:Lak2;

    .line 4
    .line 5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v0, Lgk2;->q0:I

    .line 9
    .line 10
    const/4 v15, 0x0

    .line 11
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x0

    .line 19
    iget-object v8, v0, Lgk2;->N:Landroid/media/MediaCodec$BufferInfo;

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    invoke-interface {v5, v8}, Lak2;->n(Landroid/media/MediaCodec$BufferInfo;)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-gez v1, :cond_11

    .line 30
    .line 31
    const/4 v5, -0x2

    .line 32
    const/4 v8, 0x2

    .line 33
    if-ne v1, v5, :cond_d

    .line 34
    .line 35
    iput-boolean v6, v0, Lgk2;->C0:Z

    .line 36
    .line 37
    iget-object v1, v0, Lgk2;->a0:Lak2;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Lak2;->h()Landroid/media/MediaFormat;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v2, v0, Lgk2;->i0:I

    .line 47
    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    const-string v2, "width"

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    const/16 v3, 0x20

    .line 57
    .line 58
    if-ne v2, v3, :cond_1

    .line 59
    .line 60
    const-string v2, "height"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-ne v2, v3, :cond_1

    .line 67
    .line 68
    iput-boolean v6, v0, Lgk2;->l0:Z

    .line 69
    .line 70
    return v6

    .line 71
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v3, 0x1d

    .line 74
    .line 75
    if-lt v2, v3, :cond_c

    .line 76
    .line 77
    iget-object v2, v0, Lgk2;->S0:Ljx1;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_2
    iget-object v2, v0, Lgk2;->S0:Ljx1;

    .line 88
    .line 89
    sget-object v3, Lh40;->b:Lh40;

    .line 90
    .line 91
    new-instance v3, Ljava/util/HashMap;

    .line 92
    .line 93
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_a

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    invoke-static {v1, v5}, Lkz;->b(Landroid/media/MediaFormat;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eq v7, v6, :cond_9

    .line 123
    .line 124
    if-eq v7, v8, :cond_8

    .line 125
    .line 126
    const/4 v9, 0x3

    .line 127
    if-eq v7, v9, :cond_7

    .line 128
    .line 129
    if-eq v7, v4, :cond_6

    .line 130
    .line 131
    const/4 v9, 0x5

    .line 132
    if-eq v7, v9, :cond_4

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_4
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getByteBuffer(Ljava/lang/String;)Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    if-nez v7, :cond_5

    .line 140
    .line 141
    invoke-virtual {v3, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    invoke-virtual {v7}, Ljava/nio/Buffer;->remaining()I

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    invoke-static {v9}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v9, v7}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_6
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-virtual {v3, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    goto :goto_0

    .line 175
    :cond_7
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getFloat(Ljava/lang/String;)F

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v3, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_8
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 188
    .line 189
    .line 190
    move-result-wide v9

    .line 191
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    invoke-virtual {v3, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_9
    invoke-virtual {v1, v5}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v3, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    goto :goto_0

    .line 211
    :cond_a
    new-instance v2, Lh40;

    .line 212
    .line 213
    invoke-direct {v2, v3}, Lh40;-><init>(Ljava/util/HashMap;)V

    .line 214
    .line 215
    .line 216
    iget-object v3, v0, Lgk2;->R0:Lh40;

    .line 217
    .line 218
    invoke-virtual {v2, v3}, Lh40;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-eqz v3, :cond_b

    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_b
    iput-object v2, v0, Lgk2;->R0:Lh40;

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Lgk2;->d0(Lh40;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    :goto_1
    iput-object v1, v0, Lgk2;->c0:Landroid/media/MediaFormat;

    .line 231
    .line 232
    iput-boolean v6, v0, Lgk2;->d0:Z

    .line 233
    .line 234
    return v6

    .line 235
    :cond_d
    iget-boolean v1, v0, Lgk2;->m0:Z

    .line 236
    .line 237
    if-eqz v1, :cond_f

    .line 238
    .line 239
    iget-boolean v1, v0, Lgk2;->E0:Z

    .line 240
    .line 241
    if-nez v1, :cond_e

    .line 242
    .line 243
    iget v1, v0, Lgk2;->y0:I

    .line 244
    .line 245
    if-ne v1, v8, :cond_f

    .line 246
    .line 247
    :cond_e
    invoke-virtual {v0}, Lgk2;->l0()V

    .line 248
    .line 249
    .line 250
    :cond_f
    iget-wide v4, v0, Lgk2;->n0:J

    .line 251
    .line 252
    cmp-long v1, v4, v2

    .line 253
    .line 254
    if-eqz v1, :cond_10

    .line 255
    .line 256
    const-wide/16 v1, 0x64

    .line 257
    .line 258
    add-long/2addr v4, v1

    .line 259
    iget-object v1, v0, Lkq;->t:Lvp4;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    cmp-long v1, v4, v1

    .line 269
    .line 270
    if-gez v1, :cond_10

    .line 271
    .line 272
    invoke-virtual {v0}, Lgk2;->l0()V

    .line 273
    .line 274
    .line 275
    return v7

    .line 276
    :cond_10
    move/from16 v18, v7

    .line 277
    .line 278
    goto/16 :goto_7

    .line 279
    .line 280
    :cond_11
    iget-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 281
    .line 282
    iget-wide v11, v0, Lgk2;->P0:J

    .line 283
    .line 284
    sub-long/2addr v9, v11

    .line 285
    iput-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 286
    .line 287
    iget-boolean v9, v0, Lgk2;->l0:Z

    .line 288
    .line 289
    if-eqz v9, :cond_12

    .line 290
    .line 291
    iput-boolean v7, v0, Lgk2;->l0:Z

    .line 292
    .line 293
    invoke-interface {v5, v1}, Lak2;->g(I)V

    .line 294
    .line 295
    .line 296
    return v6

    .line 297
    :cond_12
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 298
    .line 299
    if-nez v9, :cond_13

    .line 300
    .line 301
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 302
    .line 303
    and-int/2addr v9, v4

    .line 304
    if-eqz v9, :cond_13

    .line 305
    .line 306
    invoke-virtual {v0}, Lgk2;->l0()V

    .line 307
    .line 308
    .line 309
    return v7

    .line 310
    :cond_13
    iput v1, v0, Lgk2;->q0:I

    .line 311
    .line 312
    invoke-interface {v5, v1}, Lak2;->t(I)Ljava/nio/ByteBuffer;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    iput-object v1, v0, Lgk2;->r0:Ljava/nio/ByteBuffer;

    .line 317
    .line 318
    if-eqz v1, :cond_14

    .line 319
    .line 320
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 321
    .line 322
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 323
    .line 324
    .line 325
    iget-object v1, v0, Lgk2;->r0:Ljava/nio/ByteBuffer;

    .line 326
    .line 327
    iget v9, v8, Landroid/media/MediaCodec$BufferInfo;->offset:I

    .line 328
    .line 329
    iget v10, v8, Landroid/media/MediaCodec$BufferInfo;->size:I

    .line 330
    .line 331
    add-int/2addr v9, v10

    .line 332
    invoke-virtual {v1, v9}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 333
    .line 334
    .line 335
    :cond_14
    iget-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 336
    .line 337
    invoke-virtual {v0, v9, v10}, Lgk2;->D0(J)V

    .line 338
    .line 339
    .line 340
    :goto_2
    iget-boolean v1, v0, Lgk2;->O0:Z

    .line 341
    .line 342
    if-nez v1, :cond_16

    .line 343
    .line 344
    iget-wide v9, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 345
    .line 346
    iget-wide v11, v0, Lkq;->y:J

    .line 347
    .line 348
    cmp-long v1, v9, v11

    .line 349
    .line 350
    if-gez v1, :cond_15

    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_15
    move v12, v7

    .line 354
    goto :goto_4

    .line 355
    :cond_16
    :goto_3
    move v12, v6

    .line 356
    :goto_4
    iget-object v1, v0, Lgk2;->K0:Lfk2;

    .line 357
    .line 358
    iget-wide v9, v1, Lfk2;->e:J

    .line 359
    .line 360
    cmp-long v1, v9, v2

    .line 361
    .line 362
    if-eqz v1, :cond_17

    .line 363
    .line 364
    iget-wide v1, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 365
    .line 366
    cmp-long v1, v9, v1

    .line 367
    .line 368
    if-gtz v1, :cond_17

    .line 369
    .line 370
    move v13, v6

    .line 371
    goto :goto_5

    .line 372
    :cond_17
    move v13, v7

    .line 373
    :goto_5
    iput-boolean v13, v0, Lgk2;->s0:Z

    .line 374
    .line 375
    move v1, v6

    .line 376
    iget-object v6, v0, Lgk2;->r0:Ljava/nio/ByteBuffer;

    .line 377
    .line 378
    move v2, v7

    .line 379
    iget v7, v0, Lgk2;->q0:I

    .line 380
    .line 381
    iget v3, v8, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 382
    .line 383
    iget-wide v10, v8, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 384
    .line 385
    iget-object v14, v0, Lgk2;->S:Ltb1;

    .line 386
    .line 387
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    const/4 v9, 0x1

    .line 391
    move/from16 v16, v1

    .line 392
    .line 393
    move/from16 v18, v2

    .line 394
    .line 395
    move/from16 v17, v4

    .line 396
    .line 397
    move-object v15, v8

    .line 398
    move-wide/from16 v1, p1

    .line 399
    .line 400
    move v8, v3

    .line 401
    move-wide/from16 v3, p3

    .line 402
    .line 403
    invoke-virtual/range {v0 .. v14}, Lgk2;->m0(JJLak2;Ljava/nio/ByteBuffer;IIIJZZLtb1;)Z

    .line 404
    .line 405
    .line 406
    move-result v1

    .line 407
    if-eqz v1, :cond_1b

    .line 408
    .line 409
    iget-wide v1, v15, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    .line 410
    .line 411
    invoke-virtual {v0, v1, v2}, Lgk2;->i0(J)V

    .line 412
    .line 413
    .line 414
    iget v1, v15, Landroid/media/MediaCodec$BufferInfo;->flags:I

    .line 415
    .line 416
    and-int/lit8 v1, v1, 0x4

    .line 417
    .line 418
    if-eqz v1, :cond_18

    .line 419
    .line 420
    move/from16 v6, v16

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_18
    move/from16 v6, v18

    .line 424
    .line 425
    :goto_6
    if-nez v6, :cond_19

    .line 426
    .line 427
    iget-boolean v1, v0, Lgk2;->B0:Z

    .line 428
    .line 429
    if-eqz v1, :cond_19

    .line 430
    .line 431
    iget-boolean v1, v0, Lgk2;->s0:Z

    .line 432
    .line 433
    if-eqz v1, :cond_19

    .line 434
    .line 435
    iget-object v1, v0, Lkq;->t:Lvp4;

    .line 436
    .line 437
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 441
    .line 442
    .line 443
    move-result-wide v1

    .line 444
    iput-wide v1, v0, Lgk2;->n0:J

    .line 445
    .line 446
    :cond_19
    const/4 v1, -0x1

    .line 447
    iput v1, v0, Lgk2;->q0:I

    .line 448
    .line 449
    const/4 v1, 0x0

    .line 450
    iput-object v1, v0, Lgk2;->r0:Ljava/nio/ByteBuffer;

    .line 451
    .line 452
    if-nez v6, :cond_1a

    .line 453
    .line 454
    return v16

    .line 455
    :cond_1a
    invoke-virtual {v0}, Lgk2;->l0()V

    .line 456
    .line 457
    .line 458
    :cond_1b
    :goto_7
    return v18
.end method

.method public final M()Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lgk2;->a0:Lak2;

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    if-eqz v2, :cond_1c

    .line 7
    .line 8
    iget v0, v1, Lgk2;->y0:I

    .line 9
    .line 10
    const/4 v9, 0x2

    .line 11
    if-eq v0, v9, :cond_1c

    .line 12
    .line 13
    iget-boolean v0, v1, Lgk2;->E0:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_4

    .line 18
    .line 19
    :cond_0
    iget v0, v1, Lgk2;->p0:I

    .line 20
    .line 21
    iget-object v10, v1, Lgk2;->K:Lcj0;

    .line 22
    .line 23
    if-gez v0, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Lak2;->m()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, v1, Lgk2;->p0:I

    .line 30
    .line 31
    if-gez v0, :cond_1

    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_1
    invoke-interface {v2, v0}, Lak2;->q(I)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v10}, Lcj0;->r()V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v0, v1, Lgk2;->y0:I

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    const/4 v12, -0x1

    .line 48
    const/4 v13, 0x1

    .line 49
    if-ne v0, v13, :cond_4

    .line 50
    .line 51
    iget-boolean v0, v1, Lgk2;->m0:Z

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    iput-boolean v13, v1, Lgk2;->B0:Z

    .line 57
    .line 58
    iget v3, v1, Lgk2;->p0:I

    .line 59
    .line 60
    const-wide/16 v6, 0x0

    .line 61
    .line 62
    const/4 v5, 0x4

    .line 63
    const/4 v4, 0x0

    .line 64
    invoke-interface/range {v2 .. v7}, Lak2;->f(IIIJ)V

    .line 65
    .line 66
    .line 67
    iput v12, v1, Lgk2;->p0:I

    .line 68
    .line 69
    iput-object v11, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    :goto_0
    iput v9, v1, Lgk2;->y0:I

    .line 72
    .line 73
    return v8

    .line 74
    :cond_4
    iget-boolean v0, v1, Lgk2;->k0:Z

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iput-boolean v8, v1, Lgk2;->k0:Z

    .line 79
    .line 80
    iget-object v0, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v3, Lgk2;->T0:[B

    .line 86
    .line 87
    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 88
    .line 89
    .line 90
    iget v3, v1, Lgk2;->p0:I

    .line 91
    .line 92
    const-wide/16 v6, 0x0

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    const/16 v4, 0x26

    .line 96
    .line 97
    invoke-interface/range {v2 .. v7}, Lak2;->f(IIIJ)V

    .line 98
    .line 99
    .line 100
    iput v12, v1, Lgk2;->p0:I

    .line 101
    .line 102
    iput-object v11, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iput-boolean v13, v1, Lgk2;->A0:Z

    .line 105
    .line 106
    return v13

    .line 107
    :cond_5
    iget v0, v1, Lgk2;->x0:I

    .line 108
    .line 109
    if-ne v0, v13, :cond_7

    .line 110
    .line 111
    move v0, v8

    .line 112
    :goto_1
    iget-object v3, v1, Lgk2;->b0:Ltb1;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v3, v3, Ltb1;->q:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-ge v0, v3, :cond_6

    .line 124
    .line 125
    iget-object v3, v1, Lgk2;->b0:Ltb1;

    .line 126
    .line 127
    iget-object v3, v3, Ltb1;->q:Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, [B

    .line 134
    .line 135
    iget-object v4, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 136
    .line 137
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_6
    iput v9, v1, Lgk2;->x0:I

    .line 147
    .line 148
    :cond_7
    iget-object v0, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iget-object v3, v1, Lkq;->p:Lgp3;

    .line 158
    .line 159
    invoke-virtual {v3}, Lgp3;->d()V

    .line 160
    .line 161
    .line 162
    :try_start_0
    new-instance v4, Lws1;

    .line 163
    .line 164
    const/16 v5, 0xc

    .line 165
    .line 166
    invoke-direct {v4, v5, v1, v3}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v2, v4}, Lak2;->k(Lws1;)V
    :try_end_0
    .catch Landroidx/media3/decoder/DecoderInputBuffer$InsufficientCapacityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    .line 171
    .line 172
    iget-object v4, v1, Lgk2;->Q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    const/4 v5, -0x3

    .line 179
    if-ne v4, v5, :cond_8

    .line 180
    .line 181
    invoke-virtual {v1}, Lkq;->l()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_1c

    .line 186
    .line 187
    invoke-virtual {v1}, Lgk2;->T()Lfk2;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-wide v1, v1, Lgk2;->D0:J

    .line 192
    .line 193
    iput-wide v1, v0, Lfk2;->e:J

    .line 194
    .line 195
    return v8

    .line 196
    :cond_8
    const/4 v5, -0x5

    .line 197
    if-ne v4, v5, :cond_a

    .line 198
    .line 199
    iget v0, v1, Lgk2;->x0:I

    .line 200
    .line 201
    if-ne v0, v9, :cond_9

    .line 202
    .line 203
    invoke-virtual {v10}, Lcj0;->r()V

    .line 204
    .line 205
    .line 206
    iput v13, v1, Lgk2;->x0:I

    .line 207
    .line 208
    :cond_9
    invoke-virtual {v1, v3}, Lgk2;->f0(Lgp3;)Lej0;

    .line 209
    .line 210
    .line 211
    return v13

    .line 212
    :cond_a
    const/4 v3, 0x4

    .line 213
    invoke-virtual {v10, v3}, Luv;->d(I)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_e

    .line 218
    .line 219
    invoke-virtual {v1}, Lgk2;->T()Lfk2;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-wide v3, v1, Lgk2;->D0:J

    .line 224
    .line 225
    iput-wide v3, v0, Lfk2;->e:J

    .line 226
    .line 227
    iget v0, v1, Lgk2;->x0:I

    .line 228
    .line 229
    if-ne v0, v9, :cond_b

    .line 230
    .line 231
    invoke-virtual {v10}, Lcj0;->r()V

    .line 232
    .line 233
    .line 234
    iput v13, v1, Lgk2;->x0:I

    .line 235
    .line 236
    :cond_b
    iput-boolean v13, v1, Lgk2;->E0:Z

    .line 237
    .line 238
    iget-boolean v0, v1, Lgk2;->A0:Z

    .line 239
    .line 240
    if-nez v0, :cond_c

    .line 241
    .line 242
    invoke-virtual {v1}, Lgk2;->l0()V

    .line 243
    .line 244
    .line 245
    return v8

    .line 246
    :cond_c
    iget-boolean v0, v1, Lgk2;->m0:Z

    .line 247
    .line 248
    if-eqz v0, :cond_d

    .line 249
    .line 250
    goto/16 :goto_4

    .line 251
    .line 252
    :cond_d
    iput-boolean v13, v1, Lgk2;->B0:Z

    .line 253
    .line 254
    iget v3, v1, Lgk2;->p0:I

    .line 255
    .line 256
    const-wide/16 v6, 0x0

    .line 257
    .line 258
    const/4 v5, 0x4

    .line 259
    const/4 v4, 0x0

    .line 260
    invoke-interface/range {v2 .. v7}, Lak2;->f(IIIJ)V

    .line 261
    .line 262
    .line 263
    iput v12, v1, Lgk2;->p0:I

    .line 264
    .line 265
    iput-object v11, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 266
    .line 267
    return v8

    .line 268
    :cond_e
    iget-boolean v3, v1, Lgk2;->A0:Z

    .line 269
    .line 270
    if-nez v3, :cond_f

    .line 271
    .line 272
    invoke-virtual {v10, v13}, Luv;->d(I)Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-nez v3, :cond_f

    .line 277
    .line 278
    invoke-virtual {v10}, Lcj0;->r()V

    .line 279
    .line 280
    .line 281
    iget v0, v1, Lgk2;->x0:I

    .line 282
    .line 283
    if-ne v0, v9, :cond_10

    .line 284
    .line 285
    iput v13, v1, Lgk2;->x0:I

    .line 286
    .line 287
    return v13

    .line 288
    :cond_f
    iget-wide v3, v10, Lcj0;->t:J

    .line 289
    .line 290
    invoke-virtual {v1, v10}, Lgk2;->v0(Lcj0;)Z

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    if-eqz v5, :cond_11

    .line 295
    .line 296
    :cond_10
    return v13

    .line 297
    :cond_11
    const/high16 v5, 0x40000000    # 2.0f

    .line 298
    .line 299
    invoke-virtual {v10, v5}, Luv;->d(I)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-eqz v5, :cond_14

    .line 304
    .line 305
    iget-object v6, v10, Lcj0;->q:Lfg0;

    .line 306
    .line 307
    if-nez v0, :cond_12

    .line 308
    .line 309
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_12
    iget-object v7, v6, Lfg0;->d:[I

    .line 314
    .line 315
    if-nez v7, :cond_13

    .line 316
    .line 317
    new-array v7, v13, [I

    .line 318
    .line 319
    iput-object v7, v6, Lfg0;->d:[I

    .line 320
    .line 321
    iget-object v9, v6, Lfg0;->i:Landroid/media/MediaCodec$CryptoInfo;

    .line 322
    .line 323
    iput-object v7, v9, Landroid/media/MediaCodec$CryptoInfo;->numBytesOfClearData:[I

    .line 324
    .line 325
    :cond_13
    iget-object v6, v6, Lfg0;->d:[I

    .line 326
    .line 327
    aget v7, v6, v8

    .line 328
    .line 329
    add-int/2addr v7, v0

    .line 330
    aput v7, v6, v8

    .line 331
    .line 332
    :cond_14
    :goto_2
    iget-boolean v0, v1, Lgk2;->G0:Z

    .line 333
    .line 334
    if-eqz v0, :cond_15

    .line 335
    .line 336
    invoke-virtual {v1}, Lgk2;->T()Lfk2;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    iget-object v0, v0, Lfk2;->d:Ltu;

    .line 341
    .line 342
    iget-object v6, v1, Lgk2;->R:Ltb1;

    .line 343
    .line 344
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v3, v4, v6}, Ltu;->a(JLjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    iput-boolean v8, v1, Lgk2;->G0:Z

    .line 351
    .line 352
    :cond_15
    iget-wide v6, v1, Lgk2;->D0:J

    .line 353
    .line 354
    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 355
    .line 356
    .line 357
    move-result-wide v6

    .line 358
    iput-wide v6, v1, Lgk2;->D0:J

    .line 359
    .line 360
    invoke-virtual {v1}, Lkq;->l()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-nez v0, :cond_16

    .line 365
    .line 366
    const/high16 v0, 0x20000000

    .line 367
    .line 368
    invoke-virtual {v10, v0}, Luv;->d(I)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_17

    .line 373
    .line 374
    :cond_16
    invoke-virtual {v1}, Lgk2;->T()Lfk2;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    iget-wide v6, v1, Lgk2;->D0:J

    .line 379
    .line 380
    iput-wide v6, v0, Lfk2;->e:J

    .line 381
    .line 382
    :cond_17
    invoke-virtual {v10}, Lcj0;->u()V

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x10000000

    .line 386
    .line 387
    invoke-virtual {v10, v0}, Luv;->d(I)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_18

    .line 392
    .line 393
    invoke-virtual {v1, v10}, Lgk2;->V(Lcj0;)V

    .line 394
    .line 395
    .line 396
    :cond_18
    iget-boolean v0, v1, Lgk2;->O0:Z

    .line 397
    .line 398
    if-eqz v0, :cond_1a

    .line 399
    .line 400
    iget-wide v6, v1, Lgk2;->D0:J

    .line 401
    .line 402
    cmp-long v0, v3, v6

    .line 403
    .line 404
    if-gtz v0, :cond_19

    .line 405
    .line 406
    iget-wide v14, v1, Lgk2;->P0:J

    .line 407
    .line 408
    sub-long/2addr v6, v3

    .line 409
    const-wide/16 v16, 0x1

    .line 410
    .line 411
    add-long v6, v6, v16

    .line 412
    .line 413
    add-long/2addr v6, v14

    .line 414
    iput-wide v6, v1, Lgk2;->P0:J

    .line 415
    .line 416
    :cond_19
    iput-wide v3, v1, Lgk2;->D0:J

    .line 417
    .line 418
    iput-boolean v8, v1, Lgk2;->O0:Z

    .line 419
    .line 420
    :cond_1a
    invoke-virtual {v1, v10}, Lgk2;->k0(Lcj0;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v1, v10}, Lgk2;->P(Lcj0;)I

    .line 424
    .line 425
    .line 426
    move-result v7

    .line 427
    iget-wide v14, v1, Lgk2;->P0:J

    .line 428
    .line 429
    add-long/2addr v3, v14

    .line 430
    move v0, v5

    .line 431
    move-wide v5, v3

    .line 432
    iget v3, v1, Lgk2;->p0:I

    .line 433
    .line 434
    if-eqz v0, :cond_1b

    .line 435
    .line 436
    iget-object v4, v10, Lcj0;->q:Lfg0;

    .line 437
    .line 438
    invoke-interface/range {v2 .. v7}, Lak2;->e(ILfg0;JI)V

    .line 439
    .line 440
    .line 441
    goto :goto_3

    .line 442
    :cond_1b
    move-wide/from16 v18, v5

    .line 443
    .line 444
    move v5, v7

    .line 445
    move-wide/from16 v6, v18

    .line 446
    .line 447
    iget-object v0, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    invoke-interface/range {v2 .. v7}, Lak2;->f(IIIJ)V

    .line 457
    .line 458
    .line 459
    :goto_3
    iput v12, v1, Lgk2;->p0:I

    .line 460
    .line 461
    iput-object v11, v10, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 462
    .line 463
    iput-boolean v13, v1, Lgk2;->A0:Z

    .line 464
    .line 465
    iput v8, v1, Lgk2;->x0:I

    .line 466
    .line 467
    iget-object v0, v1, Lgk2;->J0:Lbj0;

    .line 468
    .line 469
    iget v1, v0, Lbj0;->c:I

    .line 470
    .line 471
    add-int/2addr v1, v13

    .line 472
    iput v1, v0, Lbj0;->c:I

    .line 473
    .line 474
    return v13

    .line 475
    :catch_0
    move-exception v0

    .line 476
    invoke-virtual {v1, v0}, Lgk2;->b0(Ljava/lang/Exception;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v8}, Lgk2;->n0(I)Z

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1}, Lgk2;->N()V

    .line 483
    .line 484
    .line 485
    return v13

    .line 486
    :cond_1c
    :goto_4
    return v8
.end method

.method public final N()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lak2;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lgk2;->r0()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    invoke-virtual {p0}, Lgk2;->r0()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final O(Z)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lgk2;->R:Ltb1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lgk2;->H:Lkf2;

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0, p1}, Lgk2;->R(Lkf2;Ltb1;Z)Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, v1, v0, p1}, Lgk2;->R(Lkf2;Ltb1;Z)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v1, "Drm session requires secure decoder for "

    .line 34
    .line 35
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, Ltb1;->n:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", but no secure decoder available. Trying to proceed with "

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, "."

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "MediaCodecRenderer"

    .line 61
    .line 62
    invoke-static {v0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-object p0

    .line 66
    :cond_1
    return-object v2
.end method

.method public P(Lcj0;)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract Q(FLtb1;[Ltb1;)F
.end method

.method public abstract R(Lkf2;Ltb1;Z)Ljava/util/ArrayList;
.end method

.method public S(JJ)J
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lkq;->f(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final T()Lfk2;
    .locals 2

    .line 1
    iget-object v0, p0, Lgk2;->O:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lfk2;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lgk2;->K0:Lfk2;

    .line 17
    .line 18
    return-object p0
.end method

.method public abstract U(Ldk2;Ltb1;Landroid/media/MediaCrypto;F)Lml3;
.end method

.method public abstract V(Lcj0;)V
.end method

.method public final W(Ldk2;Landroid/media/MediaCrypto;)V
    .locals 12

    .line 1
    const-string v0, "createCodec:"

    .line 2
    .line 3
    iput-object p1, p0, Lgk2;->h0:Ldk2;

    .line 4
    .line 5
    iget-object v1, p0, Lgk2;->R:Ltb1;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v7, p1, Ldk2;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, p0, Lgk2;->Z:F

    .line 13
    .line 14
    iget-object v3, p0, Lkq;->w:[Ltb1;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v2, v1, v3}, Lgk2;->Q(FLtb1;[Ltb1;)F

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget v3, p0, Lgk2;->I:F

    .line 24
    .line 25
    cmpg-float v3, v2, v3

    .line 26
    .line 27
    if-gtz v3, :cond_0

    .line 28
    .line 29
    const/high16 v2, -0x40800000    # -1.0f

    .line 30
    .line 31
    :cond_0
    iget-object v3, p0, Lkq;->t:Lvp4;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-virtual {p0, p1, v1, p2, v2}, Lgk2;->U(Ldk2;Ltb1;Landroid/media/MediaCrypto;F)Lml3;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v6, 0x1f

    .line 47
    .line 48
    if-lt v5, v6, :cond_1

    .line 49
    .line 50
    iget-object v8, p0, Lkq;->s:Lik3;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v8}, Lik3;->a()Landroid/media/metrics/LogSessionId;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-static {}, Lgo2;->d()Landroid/media/metrics/LogSessionId;

    .line 60
    .line 61
    .line 62
    invoke-static {v8}, Lgo2;->w(Landroid/media/metrics/LogSessionId;)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-nez v9, :cond_1

    .line 67
    .line 68
    iget-object v9, p2, Lml3;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v9, Landroid/media/MediaFormat;

    .line 71
    .line 72
    const-string v10, "log-session-id"

    .line 73
    .line 74
    invoke-static {v8}, Lhd0;->p(Landroid/media/metrics/LogSessionId;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual {v9, v10, v8}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lgk2;->G:Lzj2;

    .line 97
    .line 98
    invoke-interface {v0, p2}, Lzj2;->a(Lml3;)Lak2;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p2, p0, Lgk2;->a0:Lak2;

    .line 103
    .line 104
    new-instance v0, Lom1;

    .line 105
    .line 106
    const/16 v8, 0x8

    .line 107
    .line 108
    invoke-direct {v0, v8, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p2, v0}, Lak2;->w(Lom1;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 115
    .line 116
    .line 117
    iget-object p2, p0, Lkq;->t:Lvp4;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-wide v8, v3

    .line 123
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    iget-object p2, p0, Lgk2;->F:Landroid/content/Context;

    .line 128
    .line 129
    invoke-virtual {p1, p2, v1}, Ldk2;->e(Landroid/content/Context;Ltb1;)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_2

    .line 134
    .line 135
    invoke-static {v1}, Ltb1;->c(Ltb1;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 140
    .line 141
    const-string v0, ", "

    .line 142
    .line 143
    const-string v10, "]"

    .line 144
    .line 145
    const-string v11, "Format exceeds selected codec\'s capabilities ["

    .line 146
    .line 147
    invoke-static {v11, p2, v0, v7, v10}, Lf34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    const-string v0, "MediaCodecRenderer"

    .line 152
    .line 153
    invoke-static {v0, p2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_2
    iput v2, p0, Lgk2;->e0:F

    .line 157
    .line 158
    iput-object v1, p0, Lgk2;->b0:Ltb1;

    .line 159
    .line 160
    const/4 p2, 0x2

    .line 161
    const/16 v0, 0x19

    .line 162
    .line 163
    const/4 v1, 0x0

    .line 164
    if-gt v5, v0, :cond_4

    .line 165
    .line 166
    const-string v2, "OMX.Exynos.avc.dec.secure"

    .line 167
    .line 168
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_4

    .line 173
    .line 174
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 175
    .line 176
    const-string v10, "SM-T585"

    .line 177
    .line 178
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v10

    .line 182
    if-nez v10, :cond_3

    .line 183
    .line 184
    const-string v10, "SM-A510"

    .line 185
    .line 186
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    if-nez v10, :cond_3

    .line 191
    .line 192
    const-string v10, "SM-A520"

    .line 193
    .line 194
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v10

    .line 198
    if-nez v10, :cond_3

    .line 199
    .line 200
    const-string v10, "SM-J700"

    .line 201
    .line 202
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-eqz v2, :cond_4

    .line 207
    .line 208
    :cond_3
    move v2, p2

    .line 209
    goto :goto_0

    .line 210
    :cond_4
    move v2, v1

    .line 211
    :goto_0
    iput v2, p0, Lgk2;->i0:I

    .line 212
    .line 213
    const/16 v2, 0x1d

    .line 214
    .line 215
    const/4 v10, 0x1

    .line 216
    if-ne v5, v2, :cond_5

    .line 217
    .line 218
    const-string v11, "c2.android.aac.decoder"

    .line 219
    .line 220
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    if-eqz v11, :cond_5

    .line 225
    .line 226
    move v11, v10

    .line 227
    goto :goto_1

    .line 228
    :cond_5
    move v11, v1

    .line 229
    :goto_1
    iput-boolean v11, p0, Lgk2;->j0:Z

    .line 230
    .line 231
    iget-object v11, p1, Ldk2;->a:Ljava/lang/String;

    .line 232
    .line 233
    if-gt v5, v0, :cond_6

    .line 234
    .line 235
    const-string v0, "OMX.rk.video_decoder.avc"

    .line 236
    .line 237
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_8

    .line 242
    .line 243
    :cond_6
    if-gt v5, v2, :cond_7

    .line 244
    .line 245
    const-string v0, "OMX.broadcom.video_decoder.tunnel"

    .line 246
    .line 247
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_8

    .line 252
    .line 253
    const-string v0, "OMX.broadcom.video_decoder.tunnel.secure"

    .line 254
    .line 255
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-nez v0, :cond_8

    .line 260
    .line 261
    const-string v0, "OMX.bcm.vdec.avc.tunnel"

    .line 262
    .line 263
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-nez v0, :cond_8

    .line 268
    .line 269
    const-string v0, "OMX.bcm.vdec.avc.tunnel.secure"

    .line 270
    .line 271
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-nez v0, :cond_8

    .line 276
    .line 277
    const-string v0, "OMX.bcm.vdec.hevc.tunnel"

    .line 278
    .line 279
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_8

    .line 284
    .line 285
    const-string v0, "OMX.bcm.vdec.hevc.tunnel.secure"

    .line 286
    .line 287
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_8

    .line 292
    .line 293
    :cond_7
    const-string v0, "Amazon"

    .line 294
    .line 295
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-eqz v0, :cond_9

    .line 302
    .line 303
    const-string v0, "AFTS"

    .line 304
    .line 305
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 306
    .line 307
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_9

    .line 312
    .line 313
    iget-boolean p1, p1, Ldk2;->f:Z

    .line 314
    .line 315
    if-eqz p1, :cond_9

    .line 316
    .line 317
    :cond_8
    move v1, v10

    .line 318
    :cond_9
    iput-boolean v1, p0, Lgk2;->m0:Z

    .line 319
    .line 320
    iget-object p1, p0, Lgk2;->a0:Lak2;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iget p1, p0, Lkq;->u:I

    .line 326
    .line 327
    if-ne p1, p2, :cond_a

    .line 328
    .line 329
    iget-object p1, p0, Lkq;->t:Lvp4;

    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 335
    .line 336
    .line 337
    move-result-wide p1

    .line 338
    const-wide/16 v0, 0x3e8

    .line 339
    .line 340
    add-long/2addr p1, v0

    .line 341
    iput-wide p1, p0, Lgk2;->o0:J

    .line 342
    .line 343
    :cond_a
    iget-object p1, p0, Lgk2;->J0:Lbj0;

    .line 344
    .line 345
    iget p2, p1, Lbj0;->a:I

    .line 346
    .line 347
    add-int/2addr p2, v10

    .line 348
    iput p2, p1, Lbj0;->a:I

    .line 349
    .line 350
    sub-long p1, v3, v8

    .line 351
    .line 352
    if-lt v5, v6, :cond_b

    .line 353
    .line 354
    iget-object v0, p0, Lgk2;->S0:Ljx1;

    .line 355
    .line 356
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    if-nez v0, :cond_b

    .line 361
    .line 362
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    new-instance v1, Ljava/util/ArrayList;

    .line 368
    .line 369
    iget-object v2, p0, Lgk2;->S0:Ljx1;

    .line 370
    .line 371
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 372
    .line 373
    .line 374
    invoke-interface {v0, v1}, Lak2;->u(Ljava/util/ArrayList;)V

    .line 375
    .line 376
    .line 377
    :cond_b
    move-object v2, p0

    .line 378
    move-wide v5, p1

    .line 379
    invoke-virtual/range {v2 .. v7}, Lgk2;->c0(JJLjava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :catchall_0
    move-exception v0

    .line 384
    move-object p0, v0

    .line 385
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 386
    .line 387
    .line 388
    throw p0
.end method

.method public final X(JJ)Z
    .locals 1

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-gez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lgk2;->S:Ltb1;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ltb1;->n:Ljava/lang/String;

    .line 10
    .line 11
    const-string v0, "audio/opus"

    .line 12
    .line 13
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sub-long/2addr p1, p3

    .line 20
    const-wide/32 p3, 0x13880

    .line 21
    .line 22
    .line 23
    cmp-long p0, p1, p3

    .line 24
    .line 25
    if-gtz p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public final Y()V
    .locals 8

    .line 1
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    iget-boolean v0, p0, Lgk2;->t0:Z

    .line 6
    .line 7
    if-nez v0, :cond_b

    .line 8
    .line 9
    iget-object v0, p0, Lgk2;->R:Ltb1;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    iget-object v1, v0, Ltb1;->n:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v2, p0, Lgk2;->U:Lpw0;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lgk2;->z0(Ltb1;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iput-boolean v3, p0, Lgk2;->t0:Z

    .line 30
    .line 31
    invoke-virtual {p0}, Lgk2;->q0()V

    .line 32
    .line 33
    .line 34
    const-string v0, "audio/mp4a-latm"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lgk2;->M:Lpr;

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "audio/mpeg"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    const-string v0, "audio/opus"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iput v4, v2, Lpr;->z:I

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    const/16 v0, 0x20

    .line 70
    .line 71
    iput v0, v2, Lpr;->z:I

    .line 72
    .line 73
    :goto_0
    iput-boolean v4, p0, Lgk2;->t0:Z

    .line 74
    .line 75
    return-void

    .line 76
    :cond_2
    iget-object v2, p0, Lgk2;->U:Lpw0;

    .line 77
    .line 78
    invoke-virtual {p0, v2}, Lgk2;->t0(Lpw0;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lgk2;->T:Lpw0;

    .line 82
    .line 83
    const/4 v5, 0x4

    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    iget-object v2, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 87
    .line 88
    if-nez v2, :cond_3

    .line 89
    .line 90
    move v2, v4

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move v2, v3

    .line 93
    :goto_1
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, Lgk2;->T:Lpw0;

    .line 97
    .line 98
    invoke-interface {v2}, Lpw0;->h()Lse1;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-boolean v7, Lse1;->c:Z

    .line 103
    .line 104
    if-eqz v7, :cond_5

    .line 105
    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    invoke-interface {v2}, Lpw0;->getState()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eq v7, v4, :cond_4

    .line 113
    .line 114
    if-eq v7, v5, :cond_5

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_4
    invoke-interface {v2}, Lpw0;->g()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v1, p0, Lgk2;->R:Ltb1;

    .line 125
    .line 126
    iget v2, v0, Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;->n:I

    .line 127
    .line 128
    invoke-virtual {p0, v0, v1, v3, v2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    throw p0

    .line 133
    :cond_5
    if-nez v6, :cond_6

    .line 134
    .line 135
    invoke-interface {v2}, Lpw0;->g()Landroidx/media3/exoplayer/drm/DrmSession$DrmSessionException;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    if-eqz v2, :cond_a

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    :try_start_0
    new-instance v2, Landroid/media/MediaCrypto;

    .line 143
    .line 144
    iget-object v7, v6, Lse1;->a:Ljava/util/UUID;

    .line 145
    .line 146
    iget-object v6, v6, Lse1;->b:[B

    .line 147
    .line 148
    invoke-direct {v2, v7, v6}, Landroid/media/MediaCrypto;-><init>(Ljava/util/UUID;[B)V

    .line 149
    .line 150
    .line 151
    iput-object v2, p0, Lgk2;->W:Landroid/media/MediaCrypto;
    :try_end_0
    .catch Landroid/media/MediaCryptoException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :catch_0
    move-exception v0

    .line 155
    iget-object v1, p0, Lgk2;->R:Ltb1;

    .line 156
    .line 157
    const/16 v2, 0x1776

    .line 158
    .line 159
    invoke-virtual {p0, v0, v1, v3, v2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    throw p0

    .line 164
    :cond_7
    :goto_2
    :try_start_1
    iget-object v2, p0, Lgk2;->T:Lpw0;

    .line 165
    .line 166
    if-eqz v2, :cond_9

    .line 167
    .line 168
    invoke-interface {v2}, Lpw0;->getState()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    const/4 v6, 0x3

    .line 173
    if-eq v2, v6, :cond_8

    .line 174
    .line 175
    iget-object v2, p0, Lgk2;->T:Lpw0;

    .line 176
    .line 177
    invoke-interface {v2}, Lpw0;->getState()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-ne v2, v5, :cond_9

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :catch_1
    move-exception v1

    .line 185
    goto :goto_6

    .line 186
    :cond_8
    :goto_3
    iget-object v2, p0, Lgk2;->T:Lpw0;

    .line 187
    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-interface {v2, v1}, Lpw0;->f(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_9

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_9
    move v4, v3

    .line 199
    :goto_4
    iget-object v1, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 200
    .line 201
    invoke-virtual {p0, v1, v4}, Lgk2;->Z(Landroid/media/MediaCrypto;Z)V
    :try_end_1
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 202
    .line 203
    .line 204
    :cond_a
    :goto_5
    iget-object v0, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 205
    .line 206
    if-eqz v0, :cond_b

    .line 207
    .line 208
    iget-object v1, p0, Lgk2;->a0:Lak2;

    .line 209
    .line 210
    if-nez v1, :cond_b

    .line 211
    .line 212
    invoke-virtual {v0}, Landroid/media/MediaCrypto;->release()V

    .line 213
    .line 214
    .line 215
    const/4 v0, 0x0

    .line 216
    iput-object v0, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 217
    .line 218
    return-void

    .line 219
    :goto_6
    const/16 v2, 0xfa1

    .line 220
    .line 221
    invoke-virtual {p0, v1, v0, v3, v2}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    throw p0

    .line 226
    :cond_b
    :goto_7
    return-void
.end method

.method public final Z(Landroid/media/MediaCrypto;Z)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    iget-object v9, v1, Lgk2;->R:Ltb1;

    .line 6
    .line 7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, v6}, Lgk2;->O(Z)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v2, Ljava/util/ArrayDeque;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 25
    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    iget-object v2, v1, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Ldk2;

    .line 42
    .line 43
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iput-object v10, v1, Lgk2;->g0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_1
    new-instance v1, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 53
    .line 54
    const v2, -0xc34e

    .line 55
    .line 56
    .line 57
    invoke-direct {v1, v9, v0, v6, v2}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Ltb1;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;ZI)V

    .line 58
    .line 59
    .line 60
    throw v1

    .line 61
    :cond_1
    :goto_2
    iget-object v0, v1, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_8

    .line 68
    .line 69
    iget-object v11, v1, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 70
    .line 71
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    :goto_3
    iget-object v0, v1, Lgk2;->a0:Lak2;

    .line 75
    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v7, v0

    .line 83
    check-cast v7, Ldk2;

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v9}, Lgk2;->a0(Ltb1;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_2
    invoke-virtual {v1, v7}, Lgk2;->x0(Ldk2;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    :goto_4
    return-void

    .line 102
    :cond_3
    move-object/from16 v12, p1

    .line 103
    .line 104
    :try_start_1
    invoke-virtual {v1, v7, v12}, Lgk2;->W(Ldk2;Landroid/media/MediaCrypto;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catch_1
    move-exception v0

    .line 109
    move-object v4, v0

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v2, "Failed to initialize decoder: "

    .line 113
    .line 114
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v2, "MediaCodecRenderer"

    .line 125
    .line 126
    invoke-static {v2, v0, v4}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    new-instance v2, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 133
    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v3, "Decoder init failed: "

    .line 137
    .line 138
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v3, v7, Ldk2;->a:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v3, ", "

    .line 147
    .line 148
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    iget-object v5, v9, Ltb1;->n:Ljava/lang/String;

    .line 159
    .line 160
    instance-of v0, v4, Landroid/media/MediaCodec$CodecException;

    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    move-object v0, v4

    .line 165
    check-cast v0, Landroid/media/MediaCodec$CodecException;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/media/MediaCodec$CodecException;->getDiagnosticInfo()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move-object v8, v0

    .line 172
    goto :goto_5

    .line 173
    :cond_4
    move-object v8, v10

    .line 174
    :goto_5
    invoke-direct/range {v2 .. v8}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLdk2;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v2}, Lgk2;->b0(Ljava/lang/Exception;)V

    .line 178
    .line 179
    .line 180
    iget-object v0, v1, Lgk2;->g0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 181
    .line 182
    if-nez v0, :cond_5

    .line 183
    .line 184
    iput-object v2, v1, Lgk2;->g0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_5
    new-instance v13, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    iget-object v2, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->n:Ljava/lang/String;

    .line 198
    .line 199
    iget-boolean v3, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->o:Z

    .line 200
    .line 201
    iget-object v4, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->p:Ldk2;

    .line 202
    .line 203
    iget-object v0, v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;->q:Ljava/lang/String;

    .line 204
    .line 205
    move-object/from16 v19, v0

    .line 206
    .line 207
    move-object/from16 v16, v2

    .line 208
    .line 209
    move/from16 v17, v3

    .line 210
    .line 211
    move-object/from16 v18, v4

    .line 212
    .line 213
    invoke-direct/range {v13 .. v19}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ZLdk2;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    iput-object v13, v1, Lgk2;->g0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 217
    .line 218
    :goto_6
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_6

    .line 223
    .line 224
    goto/16 :goto_3

    .line 225
    .line 226
    :cond_6
    iget-object v0, v1, Lgk2;->g0:Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 227
    .line 228
    throw v0

    .line 229
    :cond_7
    iput-object v10, v1, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 230
    .line 231
    return-void

    .line 232
    :cond_8
    new-instance v0, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;

    .line 233
    .line 234
    const v1, -0xc34f

    .line 235
    .line 236
    .line 237
    invoke-direct {v0, v9, v10, v6, v1}, Landroidx/media3/exoplayer/mediacodec/MediaCodecRenderer$DecoderInitializationException;-><init>(Ltb1;Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException;ZI)V

    .line 238
    .line 239
    .line 240
    throw v0
.end method

.method public a0(Ltb1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public abstract b0(Ljava/lang/Exception;)V
.end method

.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 1
    const/16 v0, 0xb

    .line 2
    .line 3
    if-eq p1, v0, :cond_f

    .line 4
    .line 5
    const/16 v0, 0x15

    .line 6
    .line 7
    const/16 v1, 0x1d

    .line 8
    .line 9
    if-eq p1, v0, :cond_6

    .line 10
    .line 11
    const/16 v0, 0x16

    .line 12
    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_2

    .line 16
    .line 17
    :cond_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    if-lt p1, v1, :cond_e

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p2, Ljx1;

    .line 25
    .line 26
    iget-object v0, p0, Lgk2;->S0:Ljx1;

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljx1;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_1
    const/16 v0, 0x1f

    .line 37
    .line 38
    if-lt p1, v0, :cond_5

    .line 39
    .line 40
    new-instance p1, Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-direct {p1, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/util/HashSet;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lgk2;->S0:Ljx1;

    .line 51
    .line 52
    invoke-virtual {v1}, Lrw1;->h()Lo15;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iget-object v1, p0, Lgk2;->a0:Lak2;

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    new-instance v2, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v2}, Lak2;->x(Ljava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_5

    .line 101
    .line 102
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v1, v0}, Lak2;->u(Ljava/util/ArrayList;)V

    .line 108
    .line 109
    .line 110
    :cond_5
    iput-object p2, p0, Lgk2;->S0:Ljx1;

    .line 111
    .line 112
    return-void

    .line 113
    :cond_6
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    if-lt p1, v1, :cond_e

    .line 116
    .line 117
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast p2, Lh40;

    .line 121
    .line 122
    iput-object p2, p0, Lgk2;->Q0:Lh40;

    .line 123
    .line 124
    iget-object p0, p0, Lgk2;->a0:Lak2;

    .line 125
    .line 126
    if-eqz p0, :cond_e

    .line 127
    .line 128
    new-instance p1, Landroid/os/Bundle;

    .line 129
    .line 130
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object p2, p2, Lh40;->a:Ljava/util/Map;

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    :cond_7
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-eqz v0, :cond_d

    .line 148
    .line 149
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Ljava/util/Map$Entry;

    .line 154
    .line 155
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/lang/String;

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-nez v0, :cond_8

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_8
    instance-of v2, v0, Ljava/lang/Integer;

    .line 169
    .line 170
    if-eqz v2, :cond_9

    .line 171
    .line 172
    check-cast v0, Ljava/lang/Integer;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_9
    instance-of v2, v0, Ljava/lang/Long;

    .line 183
    .line 184
    if-eqz v2, :cond_a

    .line 185
    .line 186
    check-cast v0, Ljava/lang/Long;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v2

    .line 192
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_a
    instance-of v2, v0, Ljava/lang/Float;

    .line 197
    .line 198
    if-eqz v2, :cond_b

    .line 199
    .line 200
    check-cast v0, Ljava/lang/Float;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 207
    .line 208
    .line 209
    goto :goto_1

    .line 210
    :cond_b
    instance-of v2, v0, Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v2, :cond_c

    .line 213
    .line 214
    check-cast v0, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_c
    instance-of v2, v0, Ljava/nio/ByteBuffer;

    .line 221
    .line 222
    if-eqz v2, :cond_7

    .line 223
    .line 224
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    new-array v2, v2, [B

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 240
    .line 241
    .line 242
    goto :goto_1

    .line 243
    :cond_d
    invoke-interface {p0, p1}, Lak2;->c(Landroid/os/Bundle;)V

    .line 244
    .line 245
    .line 246
    :cond_e
    :goto_2
    return-void

    .line 247
    :cond_f
    check-cast p2, Lk41;

    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iput-object p2, p0, Lgk2;->V:Lk41;

    .line 253
    .line 254
    return-void
.end method

.method public abstract c0(JJLjava/lang/String;)V
.end method

.method public abstract d0(Lh40;)V
.end method

.method public abstract e0(Ljava/lang/String;)V
.end method

.method public final f(JJ)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lgk2;->S(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public f0(Lgp3;)Lej0;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lgk2;->G0:Z

    .line 3
    .line 4
    iget-object v1, p1, Lgp3;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ltb1;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Ltb1;->n:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_20

    .line 15
    .line 16
    const-string v4, "video/av01"

    .line 17
    .line 18
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x0

    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    const-string v4, "video/x-vnd.on2.vp9"

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    :cond_0
    iget-object v2, v1, Ltb1;->q:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ltb1;->a()Lsb1;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iput-object v5, v1, Lsb1;->p:Ljava/util/List;

    .line 46
    .line 47
    new-instance v2, Ltb1;

    .line 48
    .line 49
    invoke-direct {v2, v1}, Ltb1;-><init>(Lsb1;)V

    .line 50
    .line 51
    .line 52
    move-object v9, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move-object v9, v1

    .line 55
    :goto_0
    iget-object p1, p1, Lgp3;->o:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lpw0;

    .line 58
    .line 59
    iget-object v1, p0, Lgk2;->U:Lpw0;

    .line 60
    .line 61
    invoke-static {v1, p1}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lgk2;->U:Lpw0;

    .line 65
    .line 66
    iput-object v9, p0, Lgk2;->R:Ltb1;

    .line 67
    .line 68
    iget-boolean p1, p0, Lgk2;->t0:Z

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iput-boolean v0, p0, Lgk2;->v0:Z

    .line 73
    .line 74
    return-object v5

    .line 75
    :cond_2
    iget-object p1, p0, Lgk2;->a0:Lak2;

    .line 76
    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    iput-object v5, p0, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 80
    .line 81
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 82
    .line 83
    .line 84
    return-object v5

    .line 85
    :cond_3
    iget-object v1, p0, Lgk2;->h0:Ldk2;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v8, p0, Lgk2;->b0:Ltb1;

    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lgk2;->T:Lpw0;

    .line 96
    .line 97
    iget-object v4, p0, Lgk2;->U:Lpw0;

    .line 98
    .line 99
    const/4 v6, 0x3

    .line 100
    const/4 v7, 0x2

    .line 101
    if-ne v2, v4, :cond_4

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_4
    if-eqz v4, :cond_1e

    .line 106
    .line 107
    if-nez v2, :cond_5

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_5
    invoke-interface {v4}, Lpw0;->h()Lse1;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    if-nez v10, :cond_6

    .line 116
    .line 117
    goto/16 :goto_7

    .line 118
    .line 119
    :cond_6
    invoke-interface {v2}, Lpw0;->h()Lse1;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    if-eqz v10, :cond_1e

    .line 124
    .line 125
    const-class v10, Lse1;

    .line 126
    .line 127
    invoke-virtual {v10, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_7

    .line 132
    .line 133
    goto/16 :goto_7

    .line 134
    .line 135
    :cond_7
    invoke-interface {v4}, Lpw0;->a()Ljava/util/UUID;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    invoke-interface {v2}, Lpw0;->a()Ljava/util/UUID;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    invoke-virtual {v10, v11}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-nez v10, :cond_8

    .line 148
    .line 149
    goto/16 :goto_7

    .line 150
    .line 151
    :cond_8
    sget-object v10, Lax;->e:Ljava/util/UUID;

    .line 152
    .line 153
    invoke-interface {v2}, Lpw0;->a()Ljava/util/UUID;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_1e

    .line 162
    .line 163
    invoke-interface {v4}, Lpw0;->a()Ljava/util/UUID;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v10, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    if-eqz v2, :cond_9

    .line 172
    .line 173
    goto/16 :goto_7

    .line 174
    .line 175
    :cond_9
    iget-boolean v2, v1, Ldk2;->f:Z

    .line 176
    .line 177
    if-nez v2, :cond_b

    .line 178
    .line 179
    invoke-interface {v4}, Lpw0;->getState()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eq v2, v7, :cond_1e

    .line 184
    .line 185
    invoke-interface {v4}, Lpw0;->getState()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eq v2, v6, :cond_a

    .line 190
    .line 191
    invoke-interface {v4}, Lpw0;->getState()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    const/4 v10, 0x4

    .line 196
    if-ne v2, v10, :cond_b

    .line 197
    .line 198
    :cond_a
    iget-object v2, v9, Ltb1;->n:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-interface {v4, v2}, Lpw0;->f(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_b

    .line 208
    .line 209
    goto/16 :goto_7

    .line 210
    .line 211
    :cond_b
    :goto_1
    iget-object v2, p0, Lgk2;->U:Lpw0;

    .line 212
    .line 213
    iget-object v4, p0, Lgk2;->T:Lpw0;

    .line 214
    .line 215
    if-eq v2, v4, :cond_c

    .line 216
    .line 217
    move v2, v0

    .line 218
    goto :goto_2

    .line 219
    :cond_c
    move v2, v3

    .line 220
    :goto_2
    invoke-virtual {p0, v1, v8, v9}, Lgk2;->J(Ldk2;Ltb1;Ltb1;)Lej0;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    iget v10, v4, Lej0;->d:I

    .line 225
    .line 226
    if-eqz v10, :cond_19

    .line 227
    .line 228
    const/16 v11, 0x10

    .line 229
    .line 230
    if-eq v10, v0, :cond_15

    .line 231
    .line 232
    if-eq v10, v7, :cond_10

    .line 233
    .line 234
    if-ne v10, v6, :cond_f

    .line 235
    .line 236
    invoke-virtual {p0, v9}, Lgk2;->B0(Ltb1;)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-nez v5, :cond_d

    .line 241
    .line 242
    goto/16 :goto_6

    .line 243
    .line 244
    :cond_d
    iput-object v9, p0, Lgk2;->b0:Ltb1;

    .line 245
    .line 246
    if-eqz v2, :cond_1b

    .line 247
    .line 248
    iget-boolean v2, p0, Lgk2;->A0:Z

    .line 249
    .line 250
    if-eqz v2, :cond_e

    .line 251
    .line 252
    iput v0, p0, Lgk2;->y0:I

    .line 253
    .line 254
    iput v7, p0, Lgk2;->z0:I

    .line 255
    .line 256
    goto/16 :goto_5

    .line 257
    .line 258
    :cond_e
    invoke-virtual {p0}, Lgk2;->C0()V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_5

    .line 262
    .line 263
    :cond_f
    invoke-static {}, Ltb4;->a()V

    .line 264
    .line 265
    .line 266
    return-object v5

    .line 267
    :cond_10
    invoke-virtual {p0, v9}, Lgk2;->B0(Ltb1;)Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-nez v5, :cond_11

    .line 272
    .line 273
    goto/16 :goto_6

    .line 274
    .line 275
    :cond_11
    iput-boolean v0, p0, Lgk2;->w0:Z

    .line 276
    .line 277
    iput v0, p0, Lgk2;->x0:I

    .line 278
    .line 279
    iget v5, p0, Lgk2;->i0:I

    .line 280
    .line 281
    if-eq v5, v7, :cond_13

    .line 282
    .line 283
    if-ne v5, v0, :cond_12

    .line 284
    .line 285
    iget v5, v9, Ltb1;->u:I

    .line 286
    .line 287
    iget v11, v8, Ltb1;->u:I

    .line 288
    .line 289
    if-ne v5, v11, :cond_12

    .line 290
    .line 291
    iget v5, v9, Ltb1;->v:I

    .line 292
    .line 293
    iget v11, v8, Ltb1;->v:I

    .line 294
    .line 295
    if-ne v5, v11, :cond_12

    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_12
    move v5, v3

    .line 299
    goto :goto_4

    .line 300
    :cond_13
    :goto_3
    move v5, v0

    .line 301
    :goto_4
    iput-boolean v5, p0, Lgk2;->k0:Z

    .line 302
    .line 303
    iput-object v9, p0, Lgk2;->b0:Ltb1;

    .line 304
    .line 305
    if-eqz v2, :cond_1b

    .line 306
    .line 307
    iget-boolean v2, p0, Lgk2;->A0:Z

    .line 308
    .line 309
    if-eqz v2, :cond_14

    .line 310
    .line 311
    iput v0, p0, Lgk2;->y0:I

    .line 312
    .line 313
    iput v7, p0, Lgk2;->z0:I

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_14
    invoke-virtual {p0}, Lgk2;->C0()V

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_15
    invoke-virtual {p0, v9}, Lgk2;->B0(Ltb1;)Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-nez v5, :cond_16

    .line 325
    .line 326
    goto :goto_6

    .line 327
    :cond_16
    iput-object v9, p0, Lgk2;->b0:Ltb1;

    .line 328
    .line 329
    iget-boolean v5, p0, Lgk2;->A0:Z

    .line 330
    .line 331
    if-eqz v2, :cond_18

    .line 332
    .line 333
    if-eqz v5, :cond_17

    .line 334
    .line 335
    iput v0, p0, Lgk2;->y0:I

    .line 336
    .line 337
    iput v7, p0, Lgk2;->z0:I

    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_17
    invoke-virtual {p0}, Lgk2;->C0()V

    .line 341
    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_18
    if-eqz v5, :cond_1b

    .line 345
    .line 346
    iput v0, p0, Lgk2;->y0:I

    .line 347
    .line 348
    iput v0, p0, Lgk2;->z0:I

    .line 349
    .line 350
    goto :goto_5

    .line 351
    :cond_19
    iget-boolean v2, p0, Lgk2;->A0:Z

    .line 352
    .line 353
    if-eqz v2, :cond_1a

    .line 354
    .line 355
    iput v0, p0, Lgk2;->y0:I

    .line 356
    .line 357
    iput v6, p0, Lgk2;->z0:I

    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_1a
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 364
    .line 365
    .line 366
    :cond_1b
    :goto_5
    move v11, v3

    .line 367
    :goto_6
    if-eqz v10, :cond_1d

    .line 368
    .line 369
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 370
    .line 371
    if-ne v0, p1, :cond_1c

    .line 372
    .line 373
    iget p0, p0, Lgk2;->z0:I

    .line 374
    .line 375
    if-ne p0, v6, :cond_1d

    .line 376
    .line 377
    :cond_1c
    new-instance v6, Lej0;

    .line 378
    .line 379
    iget-object v7, v1, Ldk2;->a:Ljava/lang/String;

    .line 380
    .line 381
    const/4 v10, 0x0

    .line 382
    invoke-direct/range {v6 .. v11}, Lej0;-><init>(Ljava/lang/String;Ltb1;Ltb1;II)V

    .line 383
    .line 384
    .line 385
    return-object v6

    .line 386
    :cond_1d
    return-object v4

    .line 387
    :cond_1e
    :goto_7
    iget-boolean p1, p0, Lgk2;->A0:Z

    .line 388
    .line 389
    if-eqz p1, :cond_1f

    .line 390
    .line 391
    iput v0, p0, Lgk2;->y0:I

    .line 392
    .line 393
    iput v6, p0, Lgk2;->z0:I

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_1f
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 397
    .line 398
    .line 399
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 400
    .line 401
    .line 402
    :goto_8
    new-instance v6, Lej0;

    .line 403
    .line 404
    iget-object v7, v1, Ldk2;->a:Ljava/lang/String;

    .line 405
    .line 406
    const/4 v10, 0x0

    .line 407
    const/16 v11, 0x80

    .line 408
    .line 409
    invoke-direct/range {v6 .. v11}, Lej0;-><init>(Ljava/lang/String;Ltb1;Ltb1;II)V

    .line 410
    .line 411
    .line 412
    return-object v6

    .line 413
    :cond_20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 414
    .line 415
    const-string v0, "Sample MIME type is null."

    .line 416
    .line 417
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    const/16 v0, 0xfa5

    .line 421
    .line 422
    invoke-virtual {p0, p1, v1, v3, v0}, Lkq;->b(Ljava/lang/Throwable;Ltb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    throw p0
.end method

.method public abstract g0(Ltb1;Landroid/media/MediaFormat;)V
.end method

.method public h0()V
    .locals 0

    .line 1
    return-void
.end method

.method public i0(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Lgk2;->L0:J

    .line 2
    .line 3
    :goto_0
    iget-object v0, p0, Lgk2;->O:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lfk2;

    .line 16
    .line 17
    iget-wide v1, v1, Lfk2;->a:J

    .line 18
    .line 19
    cmp-long v1, p1, v1

    .line 20
    .line 21
    if-ltz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lfk2;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lgk2;->u0(Lfk2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lgk2;->j0()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public abstract j0()V
.end method

.method public k0(Lcj0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final l0()V
    .locals 3

    .line 1
    iget v0, p0, Lgk2;->z0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x3

    .line 10
    if-eq v0, v2, :cond_0

    .line 11
    .line 12
    iput-boolean v1, p0, Lgk2;->F0:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lgk2;->p0()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-virtual {p0}, Lgk2;->N()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lgk2;->C0()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    invoke-virtual {p0}, Lgk2;->N()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public abstract m0(JJLak2;Ljava/nio/ByteBuffer;IIIJZZLtb1;)Z
.end method

.method public final n0(I)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lkq;->p:Lgp3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgp3;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lgk2;->J:Lcj0;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcj0;->r()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    or-int/2addr p1, v2

    .line 13
    invoke-virtual {p0, v0, v1, p1}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, -0x5

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne p1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lgk2;->f0(Lgp3;)Lej0;

    .line 22
    .line 23
    .line 24
    return v4

    .line 25
    :cond_0
    const/4 v0, -0x4

    .line 26
    if-ne p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Luv;->d(I)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iput-boolean v4, p0, Lgk2;->E0:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lgk2;->l0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public final o0()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lgk2;->a0:Lak2;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    invoke-interface {v1}, Lak2;->a()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lgk2;->J0:Lbj0;

    .line 10
    .line 11
    iget v2, v1, Lbj0;->b:I

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    iput v2, v1, Lbj0;->b:I

    .line 16
    .line 17
    iget-object v1, p0, Lgk2;->h0:Ldk2;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Ldk2;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lgk2;->e0(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    :goto_0
    iput-object v0, p0, Lgk2;->a0:Lak2;

    .line 31
    .line 32
    :try_start_1
    iget-object v1, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/media/MediaCrypto;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    iput-object v0, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lgk2;->t0(Lpw0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lgk2;->s0()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_2
    iput-object v0, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lgk2;->t0(Lpw0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lgk2;->s0()V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :goto_3
    iput-object v0, p0, Lgk2;->a0:Lak2;

    .line 61
    .line 62
    :try_start_2
    iget-object v2, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Landroid/media/MediaCrypto;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :catchall_2
    move-exception v1

    .line 71
    goto :goto_5

    .line 72
    :cond_2
    :goto_4
    iput-object v0, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lgk2;->t0(Lpw0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lgk2;->s0()V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :goto_5
    iput-object v0, p0, Lgk2;->W:Landroid/media/MediaCrypto;

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lgk2;->t0(Lpw0;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lgk2;->s0()V

    .line 87
    .line 88
    .line 89
    throw v1
.end method

.method public p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lgk2;->R:Ltb1;

    .line 3
    .line 4
    sget-object v0, Lfk2;->f:Lfk2;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lgk2;->u0(Lfk2;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lgk2;->O:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lgk2;->t0:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lgk2;->t0:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lgk2;->q0()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, Lgk2;->a0:Lak2;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {p0}, Lgk2;->y0()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Lgk2;->w0()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0}, Lgk2;->N()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lgk2;->O0:Z

    .line 52
    .line 53
    return-void
.end method

.method public abstract p0()V
.end method

.method public final q0()V
    .locals 3

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lgk2;->D0:J

    .line 7
    .line 8
    invoke-virtual {p0}, Lgk2;->T()Lfk2;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iput-wide v0, v2, Lfk2;->e:J

    .line 13
    .line 14
    iput-wide v0, p0, Lgk2;->L0:J

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lgk2;->v0:Z

    .line 18
    .line 19
    iget-object v1, p0, Lgk2;->M:Lpr;

    .line 20
    .line 21
    invoke-virtual {v1}, Lpr;->r()V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lgk2;->L:Lcj0;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcj0;->r()V

    .line 27
    .line 28
    .line 29
    iput-boolean v0, p0, Lgk2;->u0:Z

    .line 30
    .line 31
    iget-object p0, p0, Lgk2;->P:Lj83;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lim;->a:Ljava/nio/ByteBuffer;

    .line 37
    .line 38
    iput-object v1, p0, Lj83;->p:Ljava/lang/Object;

    .line 39
    .line 40
    iput v0, p0, Lj83;->o:I

    .line 41
    .line 42
    const/4 v0, 0x2

    .line 43
    iput v0, p0, Lj83;->n:I

    .line 44
    .line 45
    return-void
.end method

.method public r(JZZ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lgk2;->O:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->getLast()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lfk2;

    .line 14
    .line 15
    iput-object p2, p0, Lgk2;->K0:Lfk2;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 18
    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    iput-boolean p1, p0, Lgk2;->E0:Z

    .line 25
    .line 26
    iput-boolean p1, p0, Lgk2;->F0:Z

    .line 27
    .line 28
    iput-boolean p1, p0, Lgk2;->H0:Z

    .line 29
    .line 30
    iget-boolean p1, p0, Lgk2;->t0:Z

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Lgk2;->q0()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object p1, p0, Lgk2;->a0:Lak2;

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    invoke-virtual {p0}, Lgk2;->y0()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Lgk2;->o0()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lgk2;->Y()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    invoke-virtual {p0}, Lgk2;->w0()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0}, Lgk2;->N()V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_5
    iput-boolean p2, p0, Lgk2;->O0:Z

    .line 68
    .line 69
    :goto_0
    iget-object p1, p0, Lgk2;->K0:Lfk2;

    .line 70
    .line 71
    iget-object p1, p1, Lfk2;->d:Ltu;

    .line 72
    .line 73
    invoke-virtual {p1}, Ltu;->h()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-lez p1, :cond_6

    .line 78
    .line 79
    iput-boolean p2, p0, Lgk2;->G0:Z

    .line 80
    .line 81
    :cond_6
    iget-object p0, p0, Lgk2;->K0:Lfk2;

    .line 82
    .line 83
    iget-object p0, p0, Lfk2;->d:Ltu;

    .line 84
    .line 85
    invoke-virtual {p0}, Ltu;->b()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public r0()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lgk2;->p0:I

    .line 3
    .line 4
    iget-object v1, p0, Lgk2;->K:Lcj0;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    iput-object v2, v1, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Lgk2;->q0:I

    .line 10
    .line 11
    iput-object v2, p0, Lgk2;->r0:Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    iput-wide v0, p0, Lgk2;->D0:J

    .line 19
    .line 20
    invoke-virtual {p0}, Lgk2;->T()Lfk2;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-wide v0, v2, Lfk2;->e:J

    .line 25
    .line 26
    iput-wide v0, p0, Lgk2;->L0:J

    .line 27
    .line 28
    iput-wide v0, p0, Lgk2;->o0:J

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    iput-boolean v2, p0, Lgk2;->B0:Z

    .line 32
    .line 33
    iput-wide v0, p0, Lgk2;->n0:J

    .line 34
    .line 35
    iput-boolean v2, p0, Lgk2;->A0:Z

    .line 36
    .line 37
    iput-boolean v2, p0, Lgk2;->k0:Z

    .line 38
    .line 39
    iput-boolean v2, p0, Lgk2;->l0:Z

    .line 40
    .line 41
    iput-boolean v2, p0, Lgk2;->s0:Z

    .line 42
    .line 43
    iput v2, p0, Lgk2;->y0:I

    .line 44
    .line 45
    iput v2, p0, Lgk2;->z0:I

    .line 46
    .line 47
    iget-boolean v0, p0, Lgk2;->w0:Z

    .line 48
    .line 49
    iput v0, p0, Lgk2;->x0:I

    .line 50
    .line 51
    iput-boolean v2, p0, Lgk2;->O0:Z

    .line 52
    .line 53
    const-wide/16 v0, 0x0

    .line 54
    .line 55
    iput-wide v0, p0, Lgk2;->P0:J

    .line 56
    .line 57
    return-void
.end method

.method public final s0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lgk2;->r0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lgk2;->I0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 6
    .line 7
    iput-object v0, p0, Lgk2;->f0:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    iput-object v0, p0, Lgk2;->h0:Ldk2;

    .line 10
    .line 11
    iput-object v0, p0, Lgk2;->b0:Ltb1;

    .line 12
    .line 13
    iput-object v0, p0, Lgk2;->c0:Landroid/media/MediaFormat;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lgk2;->d0:Z

    .line 17
    .line 18
    iput-boolean v0, p0, Lgk2;->C0:Z

    .line 19
    .line 20
    const/high16 v1, -0x40800000    # -1.0f

    .line 21
    .line 22
    iput v1, p0, Lgk2;->e0:F

    .line 23
    .line 24
    iput v0, p0, Lgk2;->i0:I

    .line 25
    .line 26
    iput-boolean v0, p0, Lgk2;->j0:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lgk2;->m0:Z

    .line 29
    .line 30
    iput-boolean v0, p0, Lgk2;->w0:Z

    .line 31
    .line 32
    iput v0, p0, Lgk2;->x0:I

    .line 33
    .line 34
    return-void
.end method

.method public final t0(Lpw0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lgk2;->T:Lpw0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lpw0;->b(Lpw0;Lpw0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lgk2;->T:Lpw0;

    .line 7
    .line 8
    return-void
.end method

.method public final u0(Lfk2;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lgk2;->K0:Lfk2;

    .line 2
    .line 3
    iget-wide v0, p1, Lfk2;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lgk2;->M0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lgk2;->h0()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public v0(Lcj0;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public w0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public x([Ltb1;JJLmt2;)V
    .locals 11

    .line 1
    iget-object p1, p0, Lgk2;->K0:Lfk2;

    .line 2
    .line 3
    iget-wide v0, p1, Lfk2;->c:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    new-instance v4, Lfk2;

    .line 15
    .line 16
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    move-wide v7, p2

    .line 22
    move-wide v9, p4

    .line 23
    invoke-direct/range {v4 .. v10}, Lfk2;-><init>(JJJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lgk2;->u0(Lfk2;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, Lgk2;->N0:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lgk2;->j0()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Lgk2;->O:Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-wide v0, p0, Lgk2;->D0:J

    .line 46
    .line 47
    cmp-long v4, v0, v2

    .line 48
    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    iget-wide v4, p0, Lgk2;->L0:J

    .line 52
    .line 53
    cmp-long v6, v4, v2

    .line 54
    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    cmp-long v0, v4, v0

    .line 58
    .line 59
    if-ltz v0, :cond_3

    .line 60
    .line 61
    :cond_1
    new-instance v4, Lfk2;

    .line 62
    .line 63
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    move-wide v7, p2

    .line 69
    move-wide v9, p4

    .line 70
    invoke-direct/range {v4 .. v10}, Lfk2;-><init>(JJJ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v4}, Lgk2;->u0(Lfk2;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lgk2;->K0:Lfk2;

    .line 77
    .line 78
    iget-wide p1, p1, Lfk2;->c:J

    .line 79
    .line 80
    cmp-long p1, p1, v2

    .line 81
    .line 82
    if-eqz p1, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Lgk2;->j0()V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void

    .line 88
    :cond_3
    new-instance v0, Lfk2;

    .line 89
    .line 90
    iget-wide v1, p0, Lgk2;->D0:J

    .line 91
    .line 92
    move-wide v3, p2

    .line 93
    move-wide v5, p4

    .line 94
    invoke-direct/range {v0 .. v6}, Lfk2;-><init>(JJJ)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public x0(Ldk2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public y0()Z
    .locals 3

    .line 1
    iget v0, p0, Lgk2;->z0:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, p0, Lgk2;->j0:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lgk2;->C0:Z

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, Lgk2;->C0()V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    const-string v0, "MediaCodecRenderer"

    .line 24
    .line 25
    const-string v1, "Failed to update the DRM session, releasing the codec instead."

    .line 26
    .line 27
    invoke-static {v0, v1, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return p0

    .line 33
    :cond_2
    return v2
.end method

.method public z0(Ltb1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
