.class public final Ldefpackage/tj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/sm;


# static fields
.field public static final c0:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:I

.field public E:Z

.field public F:Z

.field public G:J

.field public H:F

.field public I:Ljava/nio/ByteBuffer;

.field public J:I

.field public K:Ljava/nio/ByteBuffer;

.field public L:Z

.field public M:Z

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:Z

.field public S:Ldefpackage/xn;

.field public T:Landroid/media/AudioDeviceInfo;

.field public U:I

.field public V:Z

.field public W:J

.field public X:Z

.field public Y:Z

.field public Z:J

.field public final a:Landroid/content/Context;

.field public a0:J

.field public final b:Ldefpackage/qp4;

.field public b0:Landroid/os/Handler;

.field public final c:Ldefpackage/g10;

.field public final d:Ldefpackage/ky4;

.field public final e:Ldefpackage/pu4;

.field public final f:Ldefpackage/ou4;

.field public final g:Ldefpackage/gy3;

.field public final h:Ljava/util/ArrayDeque;

.field public i:I

.field public j:Ldefpackage/pj0;

.field public final k:Ldefpackage/sj0;

.field public final l:Ldefpackage/sj0;

.field public m:Ldefpackage/ik3;

.field public n:Ldefpackage/rm;

.field public o:Ldefpackage/qj0;

.field public p:Ldefpackage/qj0;

.field public q:Ldefpackage/fm;

.field public r:Ldefpackage/dn;

.field public s:Ldefpackage/oj0;

.field public t:Ldefpackage/an;

.field public u:Ldefpackage/il;

.field public v:Ldefpackage/rj0;

.field public w:Ldefpackage/rj0;

.field public x:Ldefpackage/qh3;

.field public y:Z

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/tj0;->c0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ldefpackage/au;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    iput-object v1, p0, Ldefpackage/tj0;->a:Landroid/content/Context;

    .line 17
    .line 18
    sget-object v1, Ldefpackage/il;->i:Ldefpackage/il;

    .line 19
    .line 20
    iput-object v1, p0, Ldefpackage/tj0;->u:Ldefpackage/il;

    .line 21
    .line 22
    iget-object v1, p1, Ldefpackage/au;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Ldefpackage/qp4;

    .line 25
    .line 26
    iput-object v1, p0, Ldefpackage/tj0;->b:Ldefpackage/qp4;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput v1, p0, Ldefpackage/tj0;->i:I

    .line 30
    .line 31
    iget-object p1, p1, Ldefpackage/au;->f:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ldefpackage/dn;

    .line 34
    .line 35
    iput-object p1, p0, Ldefpackage/tj0;->r:Ldefpackage/dn;

    .line 36
    .line 37
    new-instance p1, Ldefpackage/g10;

    .line 38
    .line 39
    invoke-direct {p1}, Ldefpackage/fp;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Ldefpackage/tj0;->c:Ldefpackage/g10;

    .line 43
    .line 44
    new-instance v2, Ldefpackage/ky4;

    .line 45
    .line 46
    invoke-direct {v2}, Ldefpackage/fp;-><init>()V

    .line 47
    .line 48
    .line 49
    sget-object v3, Ldefpackage/f35;->b:[B

    .line 50
    .line 51
    iput-object v3, v2, Ldefpackage/ky4;->m:[B

    .line 52
    .line 53
    iput-object v2, p0, Ldefpackage/tj0;->d:Ldefpackage/ky4;

    .line 54
    .line 55
    new-instance v3, Ldefpackage/pu4;

    .line 56
    .line 57
    invoke-direct {v3}, Ldefpackage/fp;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v3, p0, Ldefpackage/tj0;->e:Ldefpackage/pu4;

    .line 61
    .line 62
    new-instance v3, Ldefpackage/ou4;

    .line 63
    .line 64
    invoke-direct {v3}, Ldefpackage/fp;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v3, p0, Ldefpackage/tj0;->f:Ldefpackage/ou4;

    .line 68
    .line 69
    invoke-static {v2, p1}, Ldefpackage/yw1;->p(Ljava/lang/Object;Ljava/lang/Object;)Ldefpackage/gy3;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Ldefpackage/tj0;->g:Ldefpackage/gy3;

    .line 74
    .line 75
    const/high16 p1, 0x3f800000    # 1.0f

    .line 76
    .line 77
    iput p1, p0, Ldefpackage/tj0;->H:F

    .line 78
    .line 79
    iput v1, p0, Ldefpackage/tj0;->Q:I

    .line 80
    .line 81
    new-instance p1, Ldefpackage/xn;

    .line 82
    .line 83
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Ldefpackage/tj0;->S:Ldefpackage/xn;

    .line 87
    .line 88
    new-instance v2, Ldefpackage/rj0;

    .line 89
    .line 90
    sget-object v3, Ldefpackage/qh3;->d:Ldefpackage/qh3;

    .line 91
    .line 92
    const-wide/16 v4, 0x0

    .line 93
    .line 94
    const-wide/16 v6, 0x0

    .line 95
    .line 96
    invoke-direct/range {v2 .. v7}, Ldefpackage/rj0;-><init>(Ldefpackage/qh3;JJ)V

    .line 97
    .line 98
    .line 99
    iput-object v2, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 100
    .line 101
    iput-object v3, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 102
    .line 103
    iput-boolean v1, p0, Ldefpackage/tj0;->y:Z

    .line 104
    .line 105
    new-instance p1, Ljava/util/ArrayDeque;

    .line 106
    .line 107
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Ldefpackage/tj0;->h:Ljava/util/ArrayDeque;

    .line 111
    .line 112
    new-instance p1, Ldefpackage/sj0;

    .line 113
    .line 114
    invoke-direct {p1}, Ldefpackage/sj0;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, Ldefpackage/tj0;->k:Ldefpackage/sj0;

    .line 118
    .line 119
    new-instance p1, Ldefpackage/sj0;

    .line 120
    .line 121
    invoke-direct {p1}, Ldefpackage/sj0;-><init>()V

    .line 122
    .line 123
    .line 124
    iput-object p1, p0, Ldefpackage/tj0;->l:Ldefpackage/sj0;

    .line 125
    .line 126
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 127
    .line 128
    const/16 v1, 0x22

    .line 129
    .line 130
    const/4 v2, -0x1

    .line 131
    if-lt p1, v1, :cond_2

    .line 132
    .line 133
    if-nez v0, :cond_1

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_1
    invoke-static {v0}, Ldefpackage/bn;->c(Landroid/content/Context;)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_2

    .line 141
    .line 142
    if-eq p1, v2, :cond_2

    .line 143
    .line 144
    move v2, p1

    .line 145
    :cond_2
    :goto_1
    iput v2, p0, Ldefpackage/tj0;->U:I

    .line 146
    .line 147
    return-void
.end method

.method public static k(ILjava/nio/ByteBuffer;)I
    .locals 10

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x5

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    if-eq p0, v0, :cond_19

    .line 8
    .line 9
    const/16 v0, 0x1e

    .line 10
    .line 11
    const/4 v5, -0x2

    .line 12
    const/4 v6, -0x1

    .line 13
    if-eq p0, v0, :cond_12

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    const/16 v7, 0xa

    .line 17
    .line 18
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    packed-switch p0, :pswitch_data_1

    .line 24
    .line 25
    .line 26
    const-string p1, "Unexpected audio encoding: "

    .line 27
    .line 28
    invoke-static {p0, p1}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return v3

    .line 36
    :pswitch_0
    new-array p0, v1, [B

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 46
    .line 47
    .line 48
    new-instance p1, Ldefpackage/h00;

    .line 49
    .line 50
    invoke-direct {p1, v1, p0}, Ldefpackage/h00;-><init>(I[B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ldefpackage/hw;->D(Ldefpackage/h00;)Ldefpackage/v2;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget p0, p0, Ldefpackage/v2;->c:I

    .line 58
    .line 59
    return p0

    .line 60
    :pswitch_1
    const/16 p0, 0x200

    .line 61
    .line 62
    return p0

    .line 63
    :pswitch_2
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    sub-int/2addr v0, v7

    .line 72
    move v2, p0

    .line 73
    :goto_0
    if-gt v2, v0, :cond_2

    .line 74
    .line 75
    add-int/lit8 v7, v2, 0x4

    .line 76
    .line 77
    sget-object v8, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    sget-object v9, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 88
    .line 89
    if-ne v8, v9, :cond_0

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_0
    invoke-static {v7}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    :goto_1
    and-int/2addr v7, v5

    .line 97
    const v8, -0x78d9046

    .line 98
    .line 99
    .line 100
    if-ne v7, v8, :cond_1

    .line 101
    .line 102
    sub-int/2addr v2, p0

    .line 103
    goto :goto_2

    .line 104
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    move v2, v6

    .line 108
    :goto_2
    if-ne v2, v6, :cond_3

    .line 109
    .line 110
    return v3

    .line 111
    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    add-int/2addr p0, v2

    .line 116
    add-int/lit8 p0, p0, 0x7

    .line 117
    .line 118
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    and-int/lit16 p0, p0, 0xff

    .line 123
    .line 124
    const/16 v0, 0xbb

    .line 125
    .line 126
    if-ne p0, v0, :cond_4

    .line 127
    .line 128
    move v3, v4

    .line 129
    :cond_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    add-int/2addr p0, v2

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    const/16 v0, 0x9

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    const/16 v0, 0x8

    .line 140
    .line 141
    :goto_3
    add-int/2addr p0, v0

    .line 142
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    shr-int/lit8 p0, p0, 0x4

    .line 147
    .line 148
    and-int/lit8 p0, p0, 0x7

    .line 149
    .line 150
    const/16 p1, 0x28

    .line 151
    .line 152
    shl-int p0, p1, p0

    .line 153
    .line 154
    mul-int/2addr p0, v1

    .line 155
    return p0

    .line 156
    :pswitch_3
    const/16 p0, 0x800

    .line 157
    .line 158
    return p0

    .line 159
    :pswitch_4
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    sget-object v2, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 174
    .line 175
    if-ne p1, v2, :cond_6

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_6
    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    :goto_4
    const/high16 p1, -0x200000

    .line 183
    .line 184
    and-int v2, p0, p1

    .line 185
    .line 186
    if-ne v2, p1, :cond_7

    .line 187
    .line 188
    ushr-int/lit8 p1, p0, 0x13

    .line 189
    .line 190
    and-int/2addr p1, v0

    .line 191
    if-ne p1, v4, :cond_8

    .line 192
    .line 193
    :cond_7
    :goto_5
    move p0, v6

    .line 194
    goto :goto_6

    .line 195
    :cond_8
    ushr-int/lit8 v2, p0, 0x11

    .line 196
    .line 197
    and-int/2addr v2, v0

    .line 198
    if-nez v2, :cond_9

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    ushr-int/lit8 v5, p0, 0xc

    .line 202
    .line 203
    const/16 v8, 0xf

    .line 204
    .line 205
    and-int/2addr v5, v8

    .line 206
    ushr-int/2addr p0, v7

    .line 207
    and-int/2addr p0, v0

    .line 208
    if-eqz v5, :cond_7

    .line 209
    .line 210
    if-eq v5, v8, :cond_7

    .line 211
    .line 212
    if-ne p0, v0, :cond_a

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_a
    const/16 p0, 0x480

    .line 216
    .line 217
    if-eq v2, v4, :cond_c

    .line 218
    .line 219
    if-eq v2, v1, :cond_e

    .line 220
    .line 221
    if-ne v2, v0, :cond_b

    .line 222
    .line 223
    const/16 p0, 0x180

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_b
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 227
    .line 228
    .line 229
    return v3

    .line 230
    :cond_c
    if-ne p1, v0, :cond_d

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_d
    const/16 p0, 0x240

    .line 234
    .line 235
    :cond_e
    :goto_6
    if-eq p0, v6, :cond_f

    .line 236
    .line 237
    return p0

    .line 238
    :cond_f
    invoke-static {}, Ldefpackage/nz2;->c()V

    .line 239
    .line 240
    .line 241
    return v3

    .line 242
    :pswitch_5
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    add-int/2addr p0, v2

    .line 247
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    and-int/lit16 p0, p0, 0xf8

    .line 252
    .line 253
    shr-int/2addr p0, v0

    .line 254
    if-le p0, v7, :cond_11

    .line 255
    .line 256
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 257
    .line 258
    .line 259
    move-result p0

    .line 260
    add-int/lit8 p0, p0, 0x4

    .line 261
    .line 262
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    and-int/lit16 p0, p0, 0xc0

    .line 267
    .line 268
    shr-int/lit8 p0, p0, 0x6

    .line 269
    .line 270
    if-ne p0, v0, :cond_10

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_10
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    add-int/lit8 p0, p0, 0x4

    .line 278
    .line 279
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    and-int/lit8 p0, p0, 0x30

    .line 284
    .line 285
    shr-int/lit8 v0, p0, 0x4

    .line 286
    .line 287
    :goto_7
    sget-object p0, Ldefpackage/fu;->n:[I

    .line 288
    .line 289
    aget p0, p0, v0

    .line 290
    .line 291
    mul-int/lit16 p0, p0, 0x100

    .line 292
    .line 293
    return p0

    .line 294
    :cond_11
    const/16 p0, 0x600

    .line 295
    .line 296
    return p0

    .line 297
    :cond_12
    :pswitch_6
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 298
    .line 299
    .line 300
    move-result p0

    .line 301
    const v0, -0xde4bec0

    .line 302
    .line 303
    .line 304
    if-eq p0, v0, :cond_18

    .line 305
    .line 306
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    const v0, -0x17bd3b8f

    .line 311
    .line 312
    .line 313
    if-ne p0, v0, :cond_13

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_13
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    const v0, 0x25205864

    .line 321
    .line 322
    .line 323
    if-ne p0, v0, :cond_14

    .line 324
    .line 325
    const/16 p0, 0x1000

    .line 326
    .line 327
    return p0

    .line 328
    :cond_14
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 329
    .line 330
    .line 331
    move-result p0

    .line 332
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eq v0, v5, :cond_17

    .line 337
    .line 338
    if-eq v0, v6, :cond_16

    .line 339
    .line 340
    const/16 v3, 0x1f

    .line 341
    .line 342
    if-eq v0, v3, :cond_15

    .line 343
    .line 344
    add-int/lit8 v0, p0, 0x4

    .line 345
    .line 346
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    and-int/2addr v0, v4

    .line 351
    shl-int/lit8 v0, v0, 0x6

    .line 352
    .line 353
    add-int/2addr p0, v2

    .line 354
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 355
    .line 356
    .line 357
    move-result p0

    .line 358
    :goto_8
    and-int/lit16 p0, p0, 0xfc

    .line 359
    .line 360
    :goto_9
    shr-int/2addr p0, v1

    .line 361
    or-int/2addr p0, v0

    .line 362
    goto :goto_b

    .line 363
    :cond_15
    add-int/lit8 v0, p0, 0x5

    .line 364
    .line 365
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    and-int/lit8 v0, v0, 0x7

    .line 370
    .line 371
    shl-int/lit8 v0, v0, 0x4

    .line 372
    .line 373
    add-int/lit8 p0, p0, 0x6

    .line 374
    .line 375
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    :goto_a
    and-int/lit8 p0, p0, 0x3c

    .line 380
    .line 381
    goto :goto_9

    .line 382
    :cond_16
    add-int/lit8 v0, p0, 0x4

    .line 383
    .line 384
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    and-int/lit8 v0, v0, 0x7

    .line 389
    .line 390
    shl-int/lit8 v0, v0, 0x4

    .line 391
    .line 392
    add-int/lit8 p0, p0, 0x7

    .line 393
    .line 394
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 395
    .line 396
    .line 397
    move-result p0

    .line 398
    goto :goto_a

    .line 399
    :cond_17
    add-int/lit8 v0, p0, 0x5

    .line 400
    .line 401
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    and-int/2addr v0, v4

    .line 406
    shl-int/lit8 v0, v0, 0x6

    .line 407
    .line 408
    add-int/lit8 p0, p0, 0x4

    .line 409
    .line 410
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    goto :goto_8

    .line 415
    :goto_b
    add-int/2addr p0, v4

    .line 416
    mul-int/lit8 p0, p0, 0x20

    .line 417
    .line 418
    return p0

    .line 419
    :cond_18
    :goto_c
    :pswitch_7
    const/16 p0, 0x400

    .line 420
    .line 421
    return p0

    .line 422
    :cond_19
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    .line 423
    .line 424
    .line 425
    move-result p0

    .line 426
    and-int/2addr p0, v1

    .line 427
    if-nez p0, :cond_1a

    .line 428
    .line 429
    move v2, v3

    .line 430
    goto :goto_f

    .line 431
    :cond_1a
    const/16 p0, 0x1a

    .line 432
    .line 433
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    const/16 v0, 0x1c

    .line 438
    .line 439
    move v2, v0

    .line 440
    move v1, v3

    .line 441
    :goto_d
    if-ge v1, p0, :cond_1b

    .line 442
    .line 443
    add-int/lit8 v5, v1, 0x1b

    .line 444
    .line 445
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    add-int/2addr v2, v5

    .line 450
    add-int/lit8 v1, v1, 0x1

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_1b
    add-int/lit8 p0, v2, 0x1a

    .line 454
    .line 455
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 456
    .line 457
    .line 458
    move-result p0

    .line 459
    move v1, v3

    .line 460
    :goto_e
    if-ge v1, p0, :cond_1c

    .line 461
    .line 462
    add-int/lit8 v5, v2, 0x1b

    .line 463
    .line 464
    add-int/2addr v5, v1

    .line 465
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->get(I)B

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    add-int/2addr v0, v5

    .line 470
    add-int/lit8 v1, v1, 0x1

    .line 471
    .line 472
    goto :goto_e

    .line 473
    :cond_1c
    add-int/2addr v2, v0

    .line 474
    :goto_f
    add-int/lit8 p0, v2, 0x1a

    .line 475
    .line 476
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 477
    .line 478
    .line 479
    move-result p0

    .line 480
    add-int/lit8 p0, p0, 0x1b

    .line 481
    .line 482
    add-int/2addr p0, v2

    .line 483
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 488
    .line 489
    .line 490
    move-result v1

    .line 491
    sub-int/2addr v1, p0

    .line 492
    if-le v1, v4, :cond_1d

    .line 493
    .line 494
    add-int/2addr p0, v4

    .line 495
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->get(I)B

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    :cond_1d
    invoke-static {v0, v3}, Ldefpackage/su3;->t(BB)J

    .line 500
    .line 501
    .line 502
    move-result-wide p0

    .line 503
    const-wide/32 v0, 0xbb80

    .line 504
    .line 505
    .line 506
    mul-long/2addr p0, v0

    .line 507
    const-wide/32 v0, 0xf4240

    .line 508
    .line 509
    .line 510
    div-long/2addr p0, v0

    .line 511
    long-to-int p0, p0

    .line 512
    return p0

    .line 513
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_7
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method public final A(Ljava/nio/ByteBuffer;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget-object v1, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 21
    .line 22
    invoke-static {v1}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    const-wide/16 v1, 0x14

    .line 30
    .line 31
    invoke-static {v1, v2}, Ldefpackage/f35;->Q(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    iget-object v1, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 36
    .line 37
    iget-object v1, v1, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ldefpackage/em;

    .line 40
    .line 41
    iget v1, v1, Ldefpackage/em;->b:I

    .line 42
    .line 43
    int-to-long v5, v1

    .line 44
    const-wide/32 v7, 0xf4240

    .line 45
    .line 46
    .line 47
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 48
    .line 49
    invoke-static/range {v3 .. v9}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    long-to-int v1, v1

    .line 54
    invoke-virtual {v0}, Ldefpackage/tj0;->l()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    int-to-long v4, v1

    .line 59
    cmp-long v6, v2, v4

    .line 60
    .line 61
    if-ltz v6, :cond_3

    .line 62
    .line 63
    :goto_1
    move-object/from16 v3, p1

    .line 64
    .line 65
    goto/16 :goto_8

    .line 66
    .line 67
    :cond_3
    iget-object v6, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 68
    .line 69
    iget-object v7, v6, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v7, Ldefpackage/em;

    .line 72
    .line 73
    iget v7, v7, Ldefpackage/em;->a:I

    .line 74
    .line 75
    iget v6, v6, Ldefpackage/qj0;->b:I

    .line 76
    .line 77
    long-to-int v2, v2

    .line 78
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->remaining()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_17

    .line 103
    .line 104
    if-ge v2, v1, :cond_17

    .line 105
    .line 106
    const/high16 v12, 0x50000000

    .line 107
    .line 108
    const/high16 v13, 0x10000000

    .line 109
    .line 110
    const/16 v14, 0x16

    .line 111
    .line 112
    const/16 v15, 0x15

    .line 113
    .line 114
    const/high16 v16, 0x4f000000

    .line 115
    .line 116
    const/4 v9, 0x4

    .line 117
    const/high16 v17, -0x31000000

    .line 118
    .line 119
    const/4 v10, 0x3

    .line 120
    const/4 v11, 0x2

    .line 121
    if-eq v7, v11, :cond_d

    .line 122
    .line 123
    if-eq v7, v10, :cond_c

    .line 124
    .line 125
    if-eq v7, v9, :cond_a

    .line 126
    .line 127
    if-eq v7, v15, :cond_9

    .line 128
    .line 129
    if-eq v7, v14, :cond_8

    .line 130
    .line 131
    if-eq v7, v13, :cond_7

    .line 132
    .line 133
    if-eq v7, v12, :cond_6

    .line 134
    .line 135
    const/high16 v12, 0x60000000

    .line 136
    .line 137
    if-ne v7, v12, :cond_5

    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    and-int/lit16 v12, v12, 0xff

    .line 144
    .line 145
    shl-int/lit8 v12, v12, 0x18

    .line 146
    .line 147
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 148
    .line 149
    .line 150
    move-result v13

    .line 151
    and-int/lit16 v13, v13, 0xff

    .line 152
    .line 153
    shl-int/lit8 v13, v13, 0x10

    .line 154
    .line 155
    or-int/2addr v12, v13

    .line 156
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    and-int/lit16 v13, v13, 0xff

    .line 161
    .line 162
    shl-int/lit8 v13, v13, 0x8

    .line 163
    .line 164
    or-int/2addr v12, v13

    .line 165
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    and-int/lit16 v13, v13, 0xff

    .line 170
    .line 171
    :goto_3
    or-int/2addr v12, v13

    .line 172
    goto/16 :goto_6

    .line 173
    .line 174
    :cond_5
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_6
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    and-int/lit16 v12, v12, 0xff

    .line 183
    .line 184
    shl-int/lit8 v12, v12, 0x18

    .line 185
    .line 186
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    and-int/lit16 v13, v13, 0xff

    .line 191
    .line 192
    shl-int/lit8 v13, v13, 0x10

    .line 193
    .line 194
    or-int/2addr v12, v13

    .line 195
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    and-int/lit16 v13, v13, 0xff

    .line 200
    .line 201
    shl-int/lit8 v13, v13, 0x8

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    and-int/lit16 v12, v12, 0xff

    .line 209
    .line 210
    shl-int/lit8 v12, v12, 0x18

    .line 211
    .line 212
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 213
    .line 214
    .line 215
    move-result v13

    .line 216
    and-int/lit16 v13, v13, 0xff

    .line 217
    .line 218
    shl-int/lit8 v13, v13, 0x10

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 222
    .line 223
    .line 224
    move-result v12

    .line 225
    and-int/lit16 v12, v12, 0xff

    .line 226
    .line 227
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    and-int/lit16 v13, v13, 0xff

    .line 232
    .line 233
    shl-int/lit8 v13, v13, 0x8

    .line 234
    .line 235
    or-int/2addr v12, v13

    .line 236
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    and-int/lit16 v13, v13, 0xff

    .line 241
    .line 242
    shl-int/lit8 v13, v13, 0x10

    .line 243
    .line 244
    or-int/2addr v12, v13

    .line 245
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    :goto_4
    and-int/lit16 v13, v13, 0xff

    .line 250
    .line 251
    shl-int/lit8 v13, v13, 0x18

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    and-int/lit16 v12, v12, 0xff

    .line 259
    .line 260
    shl-int/lit8 v12, v12, 0x8

    .line 261
    .line 262
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    and-int/lit16 v13, v13, 0xff

    .line 267
    .line 268
    shl-int/lit8 v13, v13, 0x10

    .line 269
    .line 270
    or-int/2addr v12, v13

    .line 271
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    goto :goto_4

    .line 276
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    const/high16 v13, -0x40800000    # -1.0f

    .line 281
    .line 282
    const/high16 v14, 0x3f800000    # 1.0f

    .line 283
    .line 284
    invoke-static {v12, v13, v14}, Ldefpackage/f35;->i(FFF)F

    .line 285
    .line 286
    .line 287
    move-result v12

    .line 288
    const/4 v13, 0x0

    .line 289
    cmpg-float v13, v12, v13

    .line 290
    .line 291
    if-gez v13, :cond_b

    .line 292
    .line 293
    neg-float v12, v12

    .line 294
    mul-float v12, v12, v17

    .line 295
    .line 296
    :goto_5
    float-to-int v12, v12

    .line 297
    goto :goto_6

    .line 298
    :cond_b
    mul-float v12, v12, v16

    .line 299
    .line 300
    goto :goto_5

    .line 301
    :cond_c
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 302
    .line 303
    .line 304
    move-result v12

    .line 305
    and-int/lit16 v12, v12, 0xff

    .line 306
    .line 307
    shl-int/lit8 v12, v12, 0x18

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_d
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 311
    .line 312
    .line 313
    move-result v12

    .line 314
    and-int/lit16 v12, v12, 0xff

    .line 315
    .line 316
    shl-int/lit8 v12, v12, 0x10

    .line 317
    .line 318
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->get()B

    .line 319
    .line 320
    .line 321
    move-result v13

    .line 322
    goto :goto_4

    .line 323
    :goto_6
    int-to-long v12, v12

    .line 324
    int-to-long v9, v2

    .line 325
    mul-long/2addr v12, v9

    .line 326
    div-long/2addr v12, v4

    .line 327
    long-to-int v9, v12

    .line 328
    if-eq v7, v11, :cond_16

    .line 329
    .line 330
    const/4 v10, 0x3

    .line 331
    if-eq v7, v10, :cond_15

    .line 332
    .line 333
    const/4 v14, 0x4

    .line 334
    if-eq v7, v14, :cond_13

    .line 335
    .line 336
    if-eq v7, v15, :cond_12

    .line 337
    .line 338
    const/16 v10, 0x16

    .line 339
    .line 340
    if-eq v7, v10, :cond_11

    .line 341
    .line 342
    const/high16 v10, 0x10000000

    .line 343
    .line 344
    if-eq v7, v10, :cond_10

    .line 345
    .line 346
    const/high16 v10, 0x50000000

    .line 347
    .line 348
    if-eq v7, v10, :cond_f

    .line 349
    .line 350
    const/high16 v12, 0x60000000

    .line 351
    .line 352
    if-ne v7, v12, :cond_e

    .line 353
    .line 354
    shr-int/lit8 v10, v9, 0x18

    .line 355
    .line 356
    int-to-byte v10, v10

    .line 357
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 358
    .line 359
    .line 360
    shr-int/lit8 v10, v9, 0x10

    .line 361
    .line 362
    int-to-byte v10, v10

    .line 363
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 364
    .line 365
    .line 366
    shr-int/lit8 v10, v9, 0x8

    .line 367
    .line 368
    int-to-byte v10, v10

    .line 369
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 370
    .line 371
    .line 372
    int-to-byte v9, v9

    .line 373
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 374
    .line 375
    .line 376
    goto/16 :goto_7

    .line 377
    .line 378
    :cond_e
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :cond_f
    shr-int/lit8 v10, v9, 0x18

    .line 383
    .line 384
    int-to-byte v10, v10

    .line 385
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 386
    .line 387
    .line 388
    shr-int/lit8 v10, v9, 0x10

    .line 389
    .line 390
    int-to-byte v10, v10

    .line 391
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 392
    .line 393
    .line 394
    shr-int/lit8 v9, v9, 0x8

    .line 395
    .line 396
    int-to-byte v9, v9

    .line 397
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 398
    .line 399
    .line 400
    goto :goto_7

    .line 401
    :cond_10
    shr-int/lit8 v10, v9, 0x18

    .line 402
    .line 403
    int-to-byte v10, v10

    .line 404
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 405
    .line 406
    .line 407
    shr-int/lit8 v9, v9, 0x10

    .line 408
    .line 409
    int-to-byte v9, v9

    .line 410
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 411
    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_11
    int-to-byte v10, v9

    .line 415
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 416
    .line 417
    .line 418
    shr-int/lit8 v10, v9, 0x8

    .line 419
    .line 420
    int-to-byte v10, v10

    .line 421
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 422
    .line 423
    .line 424
    shr-int/lit8 v10, v9, 0x10

    .line 425
    .line 426
    int-to-byte v10, v10

    .line 427
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 428
    .line 429
    .line 430
    shr-int/lit8 v9, v9, 0x18

    .line 431
    .line 432
    int-to-byte v9, v9

    .line 433
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 434
    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_12
    shr-int/lit8 v10, v9, 0x8

    .line 438
    .line 439
    int-to-byte v10, v10

    .line 440
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 441
    .line 442
    .line 443
    shr-int/lit8 v10, v9, 0x10

    .line 444
    .line 445
    int-to-byte v10, v10

    .line 446
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 447
    .line 448
    .line 449
    shr-int/lit8 v9, v9, 0x18

    .line 450
    .line 451
    int-to-byte v9, v9

    .line 452
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 453
    .line 454
    .line 455
    goto :goto_7

    .line 456
    :cond_13
    if-gez v9, :cond_14

    .line 457
    .line 458
    int-to-float v9, v9

    .line 459
    neg-float v9, v9

    .line 460
    div-float v9, v9, v17

    .line 461
    .line 462
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 463
    .line 464
    .line 465
    goto :goto_7

    .line 466
    :cond_14
    int-to-float v9, v9

    .line 467
    div-float v9, v9, v16

    .line 468
    .line 469
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    .line 470
    .line 471
    .line 472
    goto :goto_7

    .line 473
    :cond_15
    shr-int/lit8 v9, v9, 0x18

    .line 474
    .line 475
    int-to-byte v9, v9

    .line 476
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 477
    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_16
    shr-int/lit8 v10, v9, 0x10

    .line 481
    .line 482
    int-to-byte v10, v10

    .line 483
    invoke-virtual {v3, v10}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 484
    .line 485
    .line 486
    shr-int/lit8 v9, v9, 0x18

    .line 487
    .line 488
    int-to-byte v9, v9

    .line 489
    invoke-virtual {v3, v9}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 490
    .line 491
    .line 492
    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 493
    .line 494
    .line 495
    move-result v9

    .line 496
    add-int v10, v8, v6

    .line 497
    .line 498
    if-ne v9, v10, :cond_4

    .line 499
    .line 500
    add-int/lit8 v2, v2, 0x1

    .line 501
    .line 502
    invoke-virtual/range {p1 .. p1}, Ljava/nio/Buffer;->position()I

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    goto/16 :goto_2

    .line 507
    .line 508
    :cond_17
    move-object/from16 v1, p1

    .line 509
    .line 510
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 514
    .line 515
    .line 516
    :goto_8
    iput-object v3, v0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 517
    .line 518
    return-void
.end method

.method public final B(Ldefpackage/qh3;)V
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/qh3;

    .line 2
    .line 3
    iget v1, p1, Ldefpackage/qh3;->a:F

    .line 4
    .line 5
    const v2, 0x3dcccccd    # 0.1f

    .line 6
    .line 7
    .line 8
    const/high16 v3, 0x41000000    # 8.0f

    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Ldefpackage/f35;->i(FFF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v4, p1, Ldefpackage/qh3;->b:F

    .line 15
    .line 16
    invoke-static {v4, v2, v3}, Ldefpackage/f35;->i(FFF)F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v0, v1, v2}, Ldefpackage/qh3;-><init>(FF)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/tj0;->C()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/tj0;->x()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance v1, Ldefpackage/rj0;

    .line 36
    .line 37
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    move-object v2, p1

    .line 48
    invoke-direct/range {v1 .. v6}, Ldefpackage/rj0;-><init>(Ldefpackage/qh3;JJ)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    iput-object v1, p0, Ldefpackage/tj0;->v:Ldefpackage/rj0;

    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iput-object v1, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 61
    .line 62
    return-void
.end method

.method public final C()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ldefpackage/em;

    .line 8
    .line 9
    iget-boolean p0, p0, Ldefpackage/em;->j:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final a(J)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->C()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iget-object v2, p0, Ldefpackage/tj0;->b:Ldefpackage/qp4;

    .line 7
    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    iget-boolean v0, p0, Ldefpackage/tj0;->V:Z

    .line 11
    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 15
    .line 16
    invoke-static {v0}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 23
    .line 24
    iget-object v0, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ldefpackage/tb1;

    .line 27
    .line 28
    iget v0, v0, Ldefpackage/tb1;->H:I

    .line 29
    .line 30
    iget-object v0, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 31
    .line 32
    iget-object v3, v2, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v3, Ldefpackage/bj4;

    .line 35
    .line 36
    iget v4, v0, Ldefpackage/qh3;->a:F

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    cmpl-float v6, v4, v5

    .line 43
    .line 44
    const/4 v7, 0x1

    .line 45
    if-lez v6, :cond_0

    .line 46
    .line 47
    move v6, v7

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v6, v1

    .line 50
    :goto_0
    invoke-static {v6}, Ldefpackage/rr2;->l(Z)V

    .line 51
    .line 52
    .line 53
    iget v6, v3, Ldefpackage/bj4;->c:F

    .line 54
    .line 55
    cmpl-float v6, v6, v4

    .line 56
    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    iput v4, v3, Ldefpackage/bj4;->c:F

    .line 60
    .line 61
    iput-boolean v7, v3, Ldefpackage/bj4;->i:Z

    .line 62
    .line 63
    :cond_1
    iget v4, v0, Ldefpackage/qh3;->b:F

    .line 64
    .line 65
    cmpl-float v5, v4, v5

    .line 66
    .line 67
    if-lez v5, :cond_2

    .line 68
    .line 69
    move v5, v7

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    move v5, v1

    .line 72
    :goto_1
    invoke-static {v5}, Ldefpackage/rr2;->l(Z)V

    .line 73
    .line 74
    .line 75
    iget v5, v3, Ldefpackage/bj4;->d:F

    .line 76
    .line 77
    cmpl-float v5, v5, v4

    .line 78
    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    iput v4, v3, Ldefpackage/bj4;->d:F

    .line 82
    .line 83
    iput-boolean v7, v3, Ldefpackage/bj4;->i:Z

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    sget-object v0, Ldefpackage/qh3;->d:Ldefpackage/qh3;

    .line 87
    .line 88
    :cond_4
    :goto_2
    iput-object v0, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 89
    .line 90
    :goto_3
    move-object v4, v0

    .line 91
    goto :goto_4

    .line 92
    :cond_5
    sget-object v0, Ldefpackage/qh3;->d:Ldefpackage/qh3;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :goto_4
    iget-boolean v0, p0, Ldefpackage/tj0;->V:Z

    .line 96
    .line 97
    if-nez v0, :cond_6

    .line 98
    .line 99
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 100
    .line 101
    invoke-static {v0}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_6

    .line 106
    .line 107
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 108
    .line 109
    iget-object v0, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Ldefpackage/tb1;

    .line 112
    .line 113
    iget v0, v0, Ldefpackage/tb1;->H:I

    .line 114
    .line 115
    iget-boolean v1, p0, Ldefpackage/tj0;->y:Z

    .line 116
    .line 117
    iget-object v0, v2, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ldefpackage/wd4;

    .line 120
    .line 121
    iput-boolean v1, v0, Ldefpackage/wd4;->o:Z

    .line 122
    .line 123
    :cond_6
    iput-boolean v1, p0, Ldefpackage/tj0;->y:Z

    .line 124
    .line 125
    new-instance v3, Ldefpackage/rj0;

    .line 126
    .line 127
    const-wide/16 v0, 0x0

    .line 128
    .line 129
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    iget-object p1, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 134
    .line 135
    invoke-virtual {p0}, Ldefpackage/tj0;->l()J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    iget-object p1, p1, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p1, Ldefpackage/em;

    .line 142
    .line 143
    iget p1, p1, Ldefpackage/em;->b:I

    .line 144
    .line 145
    invoke-static {p1, v0, v1}, Ldefpackage/f35;->Y(IJ)J

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    invoke-direct/range {v3 .. v8}, Ldefpackage/rj0;-><init>(Ldefpackage/qh3;JJ)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Ldefpackage/tj0;->h:Ljava/util/ArrayDeque;

    .line 153
    .line 154
    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    iget-object p1, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 158
    .line 159
    iget-object p1, p1, Ldefpackage/qj0;->f:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, Ldefpackage/fm;

    .line 162
    .line 163
    iput-object p1, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 164
    .line 165
    invoke-virtual {p1}, Ldefpackage/fm;->a()V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 169
    .line 170
    if-eqz p1, :cond_7

    .line 171
    .line 172
    iget-boolean p0, p0, Ldefpackage/tj0;->y:Z

    .line 173
    .line 174
    invoke-interface {p1, p0}, Ldefpackage/rm;->d(Z)V

    .line 175
    .line 176
    .line 177
    :cond_7
    return-void
.end method

.method public final b(Ldefpackage/em;)Ldefpackage/an;
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/tj0;->r:Ldefpackage/dn;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/dn;->a(Ldefpackage/em;)Ldefpackage/an;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioOutputProvider$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    move-object v8, v0

    .line 10
    new-instance v1, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;

    .line 11
    .line 12
    iget v2, p1, Ldefpackage/em;->b:I

    .line 13
    .line 14
    iget v3, p1, Ldefpackage/em;->c:I

    .line 15
    .line 16
    iget v4, p1, Ldefpackage/em;->a:I

    .line 17
    .line 18
    iget v5, p1, Ldefpackage/em;->f:I

    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 21
    .line 22
    iget-object v0, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, v0

    .line 25
    check-cast v6, Ldefpackage/tb1;

    .line 26
    .line 27
    iget-boolean v7, p1, Ldefpackage/em;->e:Z

    .line 28
    .line 29
    invoke-direct/range {v1 .. v8}, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;-><init>(IIIILdefpackage/tb1;ZLandroidx/media3/exoplayer/audio/AudioOutputProvider$InitializationException;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-interface {p0, v1}, Ldefpackage/rm;->g(Ljava/lang/Exception;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    throw v1
.end method

.method public final c(Ldefpackage/tb1;[I)V
    .locals 13

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->s:Ldefpackage/oj0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/tj0;->a:Landroid/content/Context;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Ldefpackage/oj0;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Ldefpackage/oj0;-><init>(Ldefpackage/tj0;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ldefpackage/tj0;->s:Ldefpackage/oj0;

    .line 16
    .line 17
    iget-object v2, p0, Ldefpackage/tj0;->r:Ldefpackage/dn;

    .line 18
    .line 19
    invoke-virtual {v2}, Ldefpackage/dn;->f()V

    .line 20
    .line 21
    .line 22
    iget-object v3, v2, Ldefpackage/dn;->e:Ldefpackage/tc2;

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    new-instance v3, Ldefpackage/tc2;

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-direct {v3, v4}, Ldefpackage/tc2;-><init>(Ljava/lang/Thread;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, v2, Ldefpackage/dn;->e:Ldefpackage/tc2;

    .line 36
    .line 37
    iput-boolean v1, v3, Ldefpackage/tc2;->i:Z

    .line 38
    .line 39
    :cond_0
    iget-object v2, v2, Ldefpackage/dn;->e:Ldefpackage/tc2;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ldefpackage/tc2;->a(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object v0, p1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 45
    .line 46
    iget v2, p1, Ldefpackage/tb1;->F:I

    .line 47
    .line 48
    iget v3, p1, Ldefpackage/tb1;->H:I

    .line 49
    .line 50
    const-string v4, "audio/raw"

    .line 51
    .line 52
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    invoke-static {v3}, Ldefpackage/f35;->L(I)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Ldefpackage/f35;->t(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    mul-int/2addr v0, v2

    .line 70
    new-instance v4, Ldefpackage/uw1;

    .line 71
    .line 72
    const/4 v5, 0x4

    .line 73
    invoke-direct {v4, v5}, Ldefpackage/pw1;-><init>(I)V

    .line 74
    .line 75
    .line 76
    iget-object v5, p0, Ldefpackage/tj0;->g:Ldefpackage/gy3;

    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ldefpackage/pw1;->d(Ljava/lang/Iterable;)V

    .line 79
    .line 80
    .line 81
    iget-object v5, p0, Ldefpackage/tj0;->e:Ldefpackage/pu4;

    .line 82
    .line 83
    invoke-virtual {v4, v5}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v5, p0, Ldefpackage/tj0;->b:Ldefpackage/qp4;

    .line 87
    .line 88
    iget-object v5, v5, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v5, [Ldefpackage/im;

    .line 91
    .line 92
    array-length v6, v5

    .line 93
    invoke-static {v6, v5}, Ldefpackage/gh0;->f(I[Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v6}, Ldefpackage/pw1;->e(I)V

    .line 97
    .line 98
    .line 99
    iget-object v7, v4, Ldefpackage/pw1;->a:[Ljava/lang/Object;

    .line 100
    .line 101
    iget v8, v4, Ldefpackage/pw1;->b:I

    .line 102
    .line 103
    invoke-static {v5, v1, v7, v8, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 104
    .line 105
    .line 106
    iget v5, v4, Ldefpackage/pw1;->b:I

    .line 107
    .line 108
    add-int/2addr v5, v6

    .line 109
    iput v5, v4, Ldefpackage/pw1;->b:I

    .line 110
    .line 111
    new-instance v5, Ldefpackage/fm;

    .line 112
    .line 113
    invoke-virtual {v4}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-direct {v5, v4}, Ldefpackage/fm;-><init>(Ldefpackage/yw1;)V

    .line 118
    .line 119
    .line 120
    iget-object v4, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 121
    .line 122
    invoke-virtual {v5, v4}, Ldefpackage/fm;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_2

    .line 127
    .line 128
    iget-object v5, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 129
    .line 130
    :cond_2
    iget v4, p1, Ldefpackage/tb1;->I:I

    .line 131
    .line 132
    iget v6, p1, Ldefpackage/tb1;->J:I

    .line 133
    .line 134
    iget-object v7, p0, Ldefpackage/tj0;->d:Ldefpackage/ky4;

    .line 135
    .line 136
    iput v4, v7, Ldefpackage/ky4;->i:I

    .line 137
    .line 138
    iput v6, v7, Ldefpackage/ky4;->j:I

    .line 139
    .line 140
    iget-object v4, p0, Ldefpackage/tj0;->c:Ldefpackage/g10;

    .line 141
    .line 142
    iput-object p2, v4, Ldefpackage/g10;->i:[I

    .line 143
    .line 144
    new-instance p2, Ldefpackage/gm;

    .line 145
    .line 146
    iget v4, p1, Ldefpackage/tb1;->G:I

    .line 147
    .line 148
    invoke-direct {p2, v4, v2, v3}, Ldefpackage/gm;-><init>(III)V

    .line 149
    .line 150
    .line 151
    :try_start_0
    iget-object v2, v5, Ldefpackage/fm;->a:Ldefpackage/yw1;

    .line 152
    .line 153
    sget-object v3, Ldefpackage/gm;->e:Ldefpackage/gm;

    .line 154
    .line 155
    invoke-virtual {p2, v3}, Ldefpackage/gm;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_5

    .line 160
    .line 161
    move v3, v1

    .line 162
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    if-ge v3, v4, :cond_4

    .line 167
    .line 168
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Ldefpackage/im;

    .line 173
    .line 174
    invoke-interface {v4, p2}, Ldefpackage/im;->f(Ldefpackage/gm;)Ldefpackage/gm;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-interface {v4}, Ldefpackage/im;->b()Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_3

    .line 183
    .line 184
    sget-object p2, Ldefpackage/gm;->e:Ldefpackage/gm;

    .line 185
    .line 186
    invoke-virtual {v6, p2}, Ldefpackage/gm;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p2

    .line 190
    xor-int/lit8 p2, p2, 0x1

    .line 191
    .line 192
    invoke-static {p2}, Ldefpackage/rr2;->w(Z)V
    :try_end_0
    .catch Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 193
    .line 194
    .line 195
    move-object p2, v6

    .line 196
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_4
    iget v2, p2, Ldefpackage/gm;->b:I

    .line 200
    .line 201
    iget v3, p2, Ldefpackage/gm;->c:I

    .line 202
    .line 203
    invoke-virtual {p1}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    iput v3, v4, Ldefpackage/sb1;->G:I

    .line 208
    .line 209
    iget p2, p2, Ldefpackage/gm;->a:I

    .line 210
    .line 211
    iput p2, v4, Ldefpackage/sb1;->F:I

    .line 212
    .line 213
    iput v2, v4, Ldefpackage/sb1;->E:I

    .line 214
    .line 215
    new-instance p2, Ldefpackage/tb1;

    .line 216
    .line 217
    invoke-direct {p2, v4}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v3}, Ldefpackage/f35;->t(I)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    mul-int/2addr v3, v2

    .line 225
    move-object v8, p2

    .line 226
    move v9, v0

    .line 227
    move v10, v3

    .line 228
    :goto_1
    move-object v12, v5

    .line 229
    goto :goto_2

    .line 230
    :cond_5
    :try_start_1
    new-instance p0, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;

    .line 231
    .line 232
    invoke-direct {p0, p2}, Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException;-><init>(Ldefpackage/gm;)V

    .line 233
    .line 234
    .line 235
    throw p0
    :try_end_1
    .catch Landroidx/media3/common/audio/AudioProcessor$UnhandledAudioFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 236
    :catch_0
    move-exception v0

    .line 237
    move-object p0, v0

    .line 238
    new-instance p2, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 239
    .line 240
    invoke-direct {p2, p0, p1}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/Exception;Ldefpackage/tb1;)V

    .line 241
    .line 242
    .line 243
    throw p2

    .line 244
    :cond_6
    new-instance v5, Ldefpackage/fm;

    .line 245
    .line 246
    sget-object p2, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 247
    .line 248
    invoke-direct {v5, p2}, Ldefpackage/fm;-><init>(Ldefpackage/yw1;)V

    .line 249
    .line 250
    .line 251
    const/4 v0, -0x1

    .line 252
    move-object v8, p1

    .line 253
    move v9, v0

    .line 254
    move v10, v9

    .line 255
    goto :goto_1

    .line 256
    :goto_2
    invoke-virtual {p0, v8}, Ldefpackage/tj0;->i(Ldefpackage/tb1;)Ldefpackage/am;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    iget-object v0, p2, Ldefpackage/am;->a:Ldefpackage/tb1;

    .line 261
    .line 262
    :try_start_2
    iget-object v2, p0, Ldefpackage/tj0;->r:Ldefpackage/dn;

    .line 263
    .line 264
    invoke-virtual {v2, p2}, Ldefpackage/dn;->c(Ldefpackage/am;)Ldefpackage/em;

    .line 265
    .line 266
    .line 267
    move-result-object v11
    :try_end_2
    .catch Landroidx/media3/exoplayer/audio/AudioOutputProvider$ConfigurationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 268
    iget-boolean p2, v11, Ldefpackage/em;->e:Z

    .line 269
    .line 270
    iget v2, v11, Ldefpackage/em;->a:I

    .line 271
    .line 272
    const-string v3, ")"

    .line 273
    .line 274
    if-eqz v2, :cond_9

    .line 275
    .line 276
    iget v2, v11, Ldefpackage/em;->c:I

    .line 277
    .line 278
    if-eqz v2, :cond_8

    .line 279
    .line 280
    iput-boolean v1, p0, Ldefpackage/tj0;->X:Z

    .line 281
    .line 282
    new-instance v6, Ldefpackage/qj0;

    .line 283
    .line 284
    move-object v7, p1

    .line 285
    invoke-direct/range {v6 .. v12}, Ldefpackage/qj0;-><init>(Ldefpackage/tb1;Ldefpackage/tb1;IILdefpackage/em;Ldefpackage/fm;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 289
    .line 290
    .line 291
    move-result p1

    .line 292
    if-eqz p1, :cond_7

    .line 293
    .line 294
    iput-object v6, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 295
    .line 296
    return-void

    .line 297
    :cond_7
    iput-object v6, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 298
    .line 299
    return-void

    .line 300
    :cond_8
    new-instance p0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 301
    .line 302
    new-instance p1, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    const-string v1, "Invalid output channel config (isOffload="

    .line 305
    .line 306
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Ldefpackage/tb1;)V

    .line 320
    .line 321
    .line 322
    throw p0

    .line 323
    :cond_9
    new-instance p0, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 324
    .line 325
    new-instance p1, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v1, "Invalid output encoding (isOffload="

    .line 328
    .line 329
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/String;Ldefpackage/tb1;)V

    .line 343
    .line 344
    .line 345
    throw p0

    .line 346
    :catch_1
    move-exception v0

    .line 347
    move-object v7, p1

    .line 348
    move-object p0, v0

    .line 349
    new-instance p1, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 350
    .line 351
    invoke-direct {p1, p0, v7}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/Exception;Ldefpackage/tb1;)V

    .line 352
    .line 353
    .line 354
    throw p1
.end method

.method public final d(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Ldefpackage/tj0;->l:Ldefpackage/sj0;

    .line 8
    .line 9
    iget-object v1, v0, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Exception;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    sget-object v1, Ldefpackage/tj0;->c0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-lez v1, :cond_2

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v1

    .line 30
    iget-wide v3, v0, Ldefpackage/sj0;->b:J

    .line 31
    .line 32
    cmp-long v1, v1, v3

    .line 33
    .line 34
    if-gez v1, :cond_3

    .line 35
    .line 36
    goto/16 :goto_2

    .line 37
    .line 38
    :cond_3
    :goto_0
    iget-object v1, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const-wide/16 v2, 0x0

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    :try_start_0
    iget-object v6, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 49
    .line 50
    iget-object v7, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 51
    .line 52
    iget v8, p0, Ldefpackage/tj0;->J:I

    .line 53
    .line 54
    invoke-virtual {v6, v8, p1, p2, v7}, Ldefpackage/an;->d(IJLjava/nio/ByteBuffer;)Z

    .line 55
    .line 56
    .line 57
    move-result p1
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioOutput$WriteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 59
    .line 60
    .line 61
    move-result-wide v6

    .line 62
    iput-wide v6, p0, Ldefpackage/tj0;->W:J

    .line 63
    .line 64
    const/4 p2, 0x0

    .line 65
    iput-object p2, v0, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 66
    .line 67
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    iput-wide v6, v0, Ldefpackage/sj0;->a:J

    .line 73
    .line 74
    iput-wide v6, v0, Ldefpackage/sj0;->b:J

    .line 75
    .line 76
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 77
    .line 78
    invoke-virtual {v0}, Ldefpackage/an;->c()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    iget-wide v6, p0, Ldefpackage/tj0;->C:J

    .line 85
    .line 86
    cmp-long v0, v6, v2

    .line 87
    .line 88
    if-lez v0, :cond_4

    .line 89
    .line 90
    iput-boolean v5, p0, Ldefpackage/tj0;->Y:Z

    .line 91
    .line 92
    :cond_4
    iget-boolean v0, p0, Ldefpackage/tj0;->O:Z

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    iget-object v0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    if-nez p1, :cond_5

    .line 101
    .line 102
    iget-boolean v2, p0, Ldefpackage/tj0;->Y:Z

    .line 103
    .line 104
    if-nez v2, :cond_5

    .line 105
    .line 106
    invoke-interface {v0}, Ldefpackage/rm;->o()V

    .line 107
    .line 108
    .line 109
    :cond_5
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 110
    .line 111
    invoke-static {v0}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    iget-wide v2, p0, Ldefpackage/tj0;->B:J

    .line 118
    .line 119
    iget-object v0, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    sub-int/2addr v1, v0

    .line 126
    int-to-long v0, v1

    .line 127
    add-long/2addr v2, v0

    .line 128
    iput-wide v2, p0, Ldefpackage/tj0;->B:J

    .line 129
    .line 130
    :cond_6
    if-eqz p1, :cond_9

    .line 131
    .line 132
    iget-object p1, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 133
    .line 134
    invoke-static {p1}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-nez p1, :cond_8

    .line 139
    .line 140
    iget-object p1, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 141
    .line 142
    iget-object v0, p0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 143
    .line 144
    if-ne p1, v0, :cond_7

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    move v4, v5

    .line 148
    :goto_1
    invoke-static {v4}, Ldefpackage/rr2;->w(Z)V

    .line 149
    .line 150
    .line 151
    iget-wide v0, p0, Ldefpackage/tj0;->C:J

    .line 152
    .line 153
    iget p1, p0, Ldefpackage/tj0;->D:I

    .line 154
    .line 155
    int-to-long v2, p1

    .line 156
    iget p1, p0, Ldefpackage/tj0;->J:I

    .line 157
    .line 158
    int-to-long v4, p1

    .line 159
    mul-long/2addr v2, v4

    .line 160
    add-long/2addr v2, v0

    .line 161
    iput-wide v2, p0, Ldefpackage/tj0;->C:J

    .line 162
    .line 163
    :cond_8
    iput-object p2, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 164
    .line 165
    :cond_9
    :goto_2
    return-void

    .line 166
    :catch_0
    move-exception p1

    .line 167
    iget-boolean p2, p1, Landroidx/media3/exoplayer/audio/AudioOutput$WriteException;->o:Z

    .line 168
    .line 169
    if-eqz p2, :cond_c

    .line 170
    .line 171
    invoke-virtual {p0}, Ldefpackage/tj0;->l()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    cmp-long v1, v6, v2

    .line 176
    .line 177
    if-lez v1, :cond_a

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_a
    iget-object v1, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 181
    .line 182
    invoke-virtual {v1}, Ldefpackage/an;->c()Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_c

    .line 187
    .line 188
    iget-object v1, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 189
    .line 190
    iget-object v1, v1, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v1, Ldefpackage/em;

    .line 193
    .line 194
    iget-boolean v1, v1, Ldefpackage/em;->e:Z

    .line 195
    .line 196
    if-nez v1, :cond_b

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_b
    iput-boolean v4, p0, Ldefpackage/tj0;->X:Z

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_c
    move v4, v5

    .line 203
    :goto_3
    new-instance v1, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;

    .line 204
    .line 205
    iget-object v2, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 206
    .line 207
    iget-object v2, v2, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, Ldefpackage/tb1;

    .line 210
    .line 211
    iget p1, p1, Landroidx/media3/exoplayer/audio/AudioOutput$WriteException;->n:I

    .line 212
    .line 213
    invoke-direct {v1, p1, v2, v4}, Landroidx/media3/exoplayer/audio/AudioSink$WriteException;-><init>(ILdefpackage/tb1;Z)V

    .line 214
    .line 215
    .line 216
    iget-object p0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 217
    .line 218
    if-eqz p0, :cond_d

    .line 219
    .line 220
    invoke-interface {p0, v1}, Ldefpackage/rm;->g(Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    :cond_d
    if-nez p2, :cond_e

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Ldefpackage/sj0;->e(Ljava/lang/Exception;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_e
    throw v1
.end method

.method public final e()Z
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/fm;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-wide/high16 v1, -0x8000000000000000L

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v1, v2}, Ldefpackage/tj0;->d(J)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    if-nez p0, :cond_4

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 22
    .line 23
    invoke-virtual {v0}, Ldefpackage/fm;->d()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-boolean v5, v0, Ldefpackage/fm;->d:Z

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iput-boolean v4, v0, Ldefpackage/fm;->d:Z

    .line 35
    .line 36
    iget-object v0, v0, Ldefpackage/fm;->b:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ldefpackage/im;

    .line 43
    .line 44
    invoke-interface {v0}, Ldefpackage/im;->g()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-virtual {p0, v1, v2}, Ldefpackage/tj0;->u(J)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 51
    .line 52
    invoke-virtual {v0}, Ldefpackage/fm;->c()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object p0, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_4

    .line 67
    .line 68
    :cond_3
    :goto_1
    return v4

    .line 69
    :cond_4
    return v3
.end method

.method public final f()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    iput-wide v1, p0, Ldefpackage/tj0;->z:J

    .line 11
    .line 12
    iput-wide v1, p0, Ldefpackage/tj0;->A:J

    .line 13
    .line 14
    iput-wide v1, p0, Ldefpackage/tj0;->B:J

    .line 15
    .line 16
    iput-wide v1, p0, Ldefpackage/tj0;->C:J

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Ldefpackage/tj0;->Y:Z

    .line 20
    .line 21
    iput v0, p0, Ldefpackage/tj0;->D:I

    .line 22
    .line 23
    new-instance v4, Ldefpackage/rj0;

    .line 24
    .line 25
    iget-object v5, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    const-wide/16 v8, 0x0

    .line 30
    .line 31
    invoke-direct/range {v4 .. v9}, Ldefpackage/rj0;-><init>(Ldefpackage/qh3;JJ)V

    .line 32
    .line 33
    .line 34
    iput-object v4, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 35
    .line 36
    iput-wide v1, p0, Ldefpackage/tj0;->G:J

    .line 37
    .line 38
    iput-object v3, p0, Ldefpackage/tj0;->v:Ldefpackage/rj0;

    .line 39
    .line 40
    iget-object v4, p0, Ldefpackage/tj0;->h:Ljava/util/ArrayDeque;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    iput v0, p0, Ldefpackage/tj0;->J:I

    .line 48
    .line 49
    iput-object v3, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    iput-boolean v0, p0, Ldefpackage/tj0;->M:Z

    .line 52
    .line 53
    iput-boolean v0, p0, Ldefpackage/tj0;->L:Z

    .line 54
    .line 55
    iput-boolean v0, p0, Ldefpackage/tj0;->N:Z

    .line 56
    .line 57
    iget-object v0, p0, Ldefpackage/tj0;->d:Ldefpackage/ky4;

    .line 58
    .line 59
    iput-wide v1, v0, Ldefpackage/ky4;->o:J

    .line 60
    .line 61
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 62
    .line 63
    iget-object v0, v0, Ldefpackage/qj0;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ldefpackage/fm;

    .line 66
    .line 67
    iput-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 68
    .line 69
    invoke-virtual {v0}, Ldefpackage/fm;->a()V

    .line 70
    .line 71
    .line 72
    iput-object v3, p0, Ldefpackage/tj0;->j:Ldefpackage/pj0;

    .line 73
    .line 74
    iget-object v0, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 75
    .line 76
    if-eqz v0, :cond_0

    .line 77
    .line 78
    iput-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 79
    .line 80
    iput-object v3, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 81
    .line 82
    :cond_0
    sget-object v0, Ldefpackage/tj0;->c0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 88
    .line 89
    iget-object v4, v0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 90
    .line 91
    iget-object v4, v4, Ldefpackage/en;->d:Landroid/media/AudioTrack;

    .line 92
    .line 93
    invoke-virtual {v4}, Landroid/media/AudioTrack;->getPlayState()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    const/4 v5, 0x3

    .line 98
    if-ne v4, v5, :cond_1

    .line 99
    .line 100
    iget-object v4, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 101
    .line 102
    invoke-virtual {v4}, Landroid/media/AudioTrack;->pause()V

    .line 103
    .line 104
    .line 105
    :cond_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    const/16 v5, 0x1d

    .line 108
    .line 109
    if-lt v4, v5, :cond_2

    .line 110
    .line 111
    invoke-virtual {v0}, Ldefpackage/an;->c()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_2

    .line 116
    .line 117
    iget-object v4, v0, Ldefpackage/an;->h:Ldefpackage/jv3;

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v5, v4, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v5, Ldefpackage/an;

    .line 125
    .line 126
    iget-object v5, v5, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 127
    .line 128
    iget-object v6, v4, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v6, Ldefpackage/zm;

    .line 131
    .line 132
    invoke-static {v5, v6}, Ldefpackage/z9;->q(Landroid/media/AudioTrack;Ldefpackage/zm;)V

    .line 133
    .line 134
    .line 135
    iget-object v4, v4, Ldefpackage/jv3;->n:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Landroid/os/Handler;

    .line 138
    .line 139
    invoke-virtual {v4, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_2
    iget-object v4, v0, Ldefpackage/an;->d:Ldefpackage/bq4;

    .line 143
    .line 144
    if-eqz v4, :cond_3

    .line 145
    .line 146
    iget-object v5, v4, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v5, Landroid/media/AudioTrack;

    .line 149
    .line 150
    iget-object v6, v4, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v6, Ldefpackage/wm;

    .line 153
    .line 154
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v6}, Landroid/media/AudioTrack;->removeOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;)V

    .line 158
    .line 159
    .line 160
    iput-object v3, v4, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v3, v0, Ldefpackage/an;->d:Ldefpackage/bq4;

    .line 163
    .line 164
    :cond_3
    iget-object v4, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 165
    .line 166
    iget-object v0, v0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 167
    .line 168
    invoke-static {v3}, Ldefpackage/f35;->p(Ldefpackage/nk2;)Landroid/os/Handler;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    sget-object v6, Ldefpackage/an;->r:Ljava/lang/Object;

    .line 173
    .line 174
    monitor-enter v6

    .line 175
    :try_start_0
    sget-object v7, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 176
    .line 177
    const/4 v8, 0x1

    .line 178
    if-nez v7, :cond_4

    .line 179
    .line 180
    new-instance v7, Ldefpackage/ps3;

    .line 181
    .line 182
    invoke-direct {v7, v8}, Ldefpackage/ps3;-><init>(I)V

    .line 183
    .line 184
    .line 185
    invoke-static {v7}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    sput-object v7, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :catchall_0
    move-exception v0

    .line 193
    move-object p0, v0

    .line 194
    goto :goto_1

    .line 195
    :cond_4
    :goto_0
    sget v7, Ldefpackage/an;->t:I

    .line 196
    .line 197
    add-int/2addr v7, v8

    .line 198
    sput v7, Ldefpackage/an;->t:I

    .line 199
    .line 200
    sget-object v7, Ldefpackage/an;->s:Ljava/util/concurrent/ScheduledExecutorService;

    .line 201
    .line 202
    new-instance v8, Ldefpackage/v6;

    .line 203
    .line 204
    const/4 v9, 0x2

    .line 205
    invoke-direct {v8, v4, v5, v0, v9}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 206
    .line 207
    .line 208
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 209
    .line 210
    const-wide/16 v4, 0x14

    .line 211
    .line 212
    invoke-interface {v7, v8, v4, v5, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 213
    .line 214
    .line 215
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    iput-object v3, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 217
    .line 218
    goto :goto_2

    .line 219
    :goto_1
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    throw p0

    .line 221
    :cond_5
    :goto_2
    iget-object v0, p0, Ldefpackage/tj0;->l:Ldefpackage/sj0;

    .line 222
    .line 223
    iput-object v3, v0, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 224
    .line 225
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    iput-wide v4, v0, Ldefpackage/sj0;->a:J

    .line 231
    .line 232
    iput-wide v4, v0, Ldefpackage/sj0;->b:J

    .line 233
    .line 234
    iget-object v0, p0, Ldefpackage/tj0;->k:Ldefpackage/sj0;

    .line 235
    .line 236
    iput-object v3, v0, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 237
    .line 238
    iput-wide v4, v0, Ldefpackage/sj0;->a:J

    .line 239
    .line 240
    iput-wide v4, v0, Ldefpackage/sj0;->b:J

    .line 241
    .line 242
    iput-wide v1, p0, Ldefpackage/tj0;->Z:J

    .line 243
    .line 244
    iput-wide v1, p0, Ldefpackage/tj0;->a0:J

    .line 245
    .line 246
    iget-object p0, p0, Ldefpackage/tj0;->b0:Landroid/os/Handler;

    .line 247
    .line 248
    if-eqz p0, :cond_6

    .line 249
    .line 250
    invoke-virtual {p0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_6
    return-void
.end method

.method public final g()J
    .locals 8

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 14
    .line 15
    invoke-static {v0}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    int-to-long v1, p0

    .line 32
    iget-object p0, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ldefpackage/em;

    .line 35
    .line 36
    iget p0, p0, Ldefpackage/em;->b:I

    .line 37
    .line 38
    invoke-static {p0, v1, v2}, Ldefpackage/f35;->Y(IJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0

    .line 43
    :cond_1
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 44
    .line 45
    iget-object v0, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-long v1, v0

    .line 52
    iget-object p0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 53
    .line 54
    iget-object p0, p0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Ldefpackage/em;

    .line 57
    .line 58
    iget p0, p0, Ldefpackage/em;->a:I

    .line 59
    .line 60
    invoke-static {p0}, Ldefpackage/wr1;->w(I)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    const v0, -0x7fffffff

    .line 65
    .line 66
    .line 67
    if-eq p0, v0, :cond_2

    .line 68
    .line 69
    const/4 v0, 0x1

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v0, 0x0

    .line 72
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 73
    .line 74
    .line 75
    int-to-long v5, p0

    .line 76
    sget-object v7, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 77
    .line 78
    const-wide/32 v3, 0xf4240

    .line 79
    .line 80
    .line 81
    invoke-static/range {v1 .. v7}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    return-wide v0
.end method

.method public final h()J
    .locals 14

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    iget-boolean v0, p0, Ldefpackage/tj0;->F:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/an;->a()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object v2, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/tj0;->l()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    iget-object v2, v2, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Ldefpackage/em;

    .line 28
    .line 29
    iget v2, v2, Ldefpackage/em;->b:I

    .line 30
    .line 31
    invoke-static {v2, v3, v4}, Ldefpackage/f35;->Y(IJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    :goto_0
    iget-object v2, p0, Ldefpackage/tj0;->h:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ldefpackage/rj0;

    .line 52
    .line 53
    iget-wide v3, v3, Ldefpackage/rj0;->c:J

    .line 54
    .line 55
    cmp-long v3, v0, v3

    .line 56
    .line 57
    if-ltz v3, :cond_1

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ldefpackage/rj0;

    .line 64
    .line 65
    iput-object v2, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    iget-object v3, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 69
    .line 70
    iget-wide v4, v3, Ldefpackage/rj0;->c:J

    .line 71
    .line 72
    sub-long v6, v0, v4

    .line 73
    .line 74
    iget-object v0, v3, Ldefpackage/rj0;->a:Ldefpackage/qh3;

    .line 75
    .line 76
    iget v0, v0, Ldefpackage/qh3;->a:F

    .line 77
    .line 78
    invoke-static {v6, v7, v0}, Ldefpackage/f35;->A(JF)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    iget-object v3, p0, Ldefpackage/tj0;->b:Ldefpackage/qp4;

    .line 87
    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    iget-object v2, v3, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Ldefpackage/bj4;

    .line 93
    .line 94
    invoke-virtual {v2}, Ldefpackage/bj4;->b()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    iget-wide v4, v2, Ldefpackage/bj4;->n:J

    .line 101
    .line 102
    const-wide/16 v8, 0x400

    .line 103
    .line 104
    cmp-long v4, v4, v8

    .line 105
    .line 106
    if-ltz v4, :cond_3

    .line 107
    .line 108
    iget-wide v4, v2, Ldefpackage/bj4;->m:J

    .line 109
    .line 110
    iget-object v8, v2, Ldefpackage/bj4;->j:Ldefpackage/aj4;

    .line 111
    .line 112
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget v9, v8, Ldefpackage/aj4;->j:I

    .line 116
    .line 117
    iget v10, v8, Ldefpackage/aj4;->b:I

    .line 118
    .line 119
    mul-int/2addr v9, v10

    .line 120
    iget-object v8, v8, Ldefpackage/aj4;->i:Ldefpackage/zi4;

    .line 121
    .line 122
    invoke-interface {v8}, Ldefpackage/zi4;->o()I

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    mul-int/2addr v8, v9

    .line 127
    int-to-long v8, v8

    .line 128
    sub-long v8, v4, v8

    .line 129
    .line 130
    iget-object v4, v2, Ldefpackage/bj4;->h:Ldefpackage/gm;

    .line 131
    .line 132
    iget v4, v4, Ldefpackage/gm;->a:I

    .line 133
    .line 134
    iget-object v5, v2, Ldefpackage/bj4;->g:Ldefpackage/gm;

    .line 135
    .line 136
    iget v5, v5, Ldefpackage/gm;->a:I

    .line 137
    .line 138
    iget-wide v10, v2, Ldefpackage/bj4;->n:J

    .line 139
    .line 140
    if-ne v4, v5, :cond_2

    .line 141
    .line 142
    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 143
    .line 144
    invoke-static/range {v6 .. v12}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 145
    .line 146
    .line 147
    move-result-wide v6

    .line 148
    goto :goto_1

    .line 149
    :cond_2
    int-to-long v12, v4

    .line 150
    mul-long/2addr v8, v12

    .line 151
    int-to-long v4, v5

    .line 152
    mul-long/2addr v10, v4

    .line 153
    sget-object v12, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 154
    .line 155
    invoke-static/range {v6 .. v12}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v6

    .line 159
    goto :goto_1

    .line 160
    :cond_3
    iget v2, v2, Ldefpackage/bj4;->c:F

    .line 161
    .line 162
    float-to-double v4, v2

    .line 163
    long-to-double v6, v6

    .line 164
    mul-double/2addr v4, v6

    .line 165
    double-to-long v6, v4

    .line 166
    :cond_4
    :goto_1
    iget-object v2, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 167
    .line 168
    iget-wide v4, v2, Ldefpackage/rj0;->b:J

    .line 169
    .line 170
    add-long/2addr v4, v6

    .line 171
    sub-long/2addr v6, v0

    .line 172
    iput-wide v6, v2, Ldefpackage/rj0;->d:J

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    iget-object v2, p0, Ldefpackage/tj0;->w:Ldefpackage/rj0;

    .line 176
    .line 177
    iget-wide v4, v2, Ldefpackage/rj0;->b:J

    .line 178
    .line 179
    add-long/2addr v4, v0

    .line 180
    iget-wide v0, v2, Ldefpackage/rj0;->d:J

    .line 181
    .line 182
    add-long/2addr v4, v0

    .line 183
    :goto_2
    iget-object v0, v3, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ldefpackage/wd4;

    .line 186
    .line 187
    iget-wide v0, v0, Ldefpackage/wd4;->q:J

    .line 188
    .line 189
    iget-object v2, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 190
    .line 191
    iget-object v2, v2, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v2, Ldefpackage/em;

    .line 194
    .line 195
    iget v2, v2, Ldefpackage/em;->b:I

    .line 196
    .line 197
    invoke-static {v2, v0, v1}, Ldefpackage/f35;->Y(IJ)J

    .line 198
    .line 199
    .line 200
    move-result-wide v2

    .line 201
    add-long/2addr v2, v4

    .line 202
    iget-wide v4, p0, Ldefpackage/tj0;->Z:J

    .line 203
    .line 204
    cmp-long v6, v0, v4

    .line 205
    .line 206
    if-lez v6, :cond_7

    .line 207
    .line 208
    iget-object v6, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 209
    .line 210
    sub-long v4, v0, v4

    .line 211
    .line 212
    iget-object v6, v6, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v6, Ldefpackage/em;

    .line 215
    .line 216
    iget v6, v6, Ldefpackage/em;->b:I

    .line 217
    .line 218
    invoke-static {v6, v4, v5}, Ldefpackage/f35;->Y(IJ)J

    .line 219
    .line 220
    .line 221
    move-result-wide v4

    .line 222
    iput-wide v0, p0, Ldefpackage/tj0;->Z:J

    .line 223
    .line 224
    iget-wide v0, p0, Ldefpackage/tj0;->a0:J

    .line 225
    .line 226
    add-long/2addr v0, v4

    .line 227
    iput-wide v0, p0, Ldefpackage/tj0;->a0:J

    .line 228
    .line 229
    iget-object v0, p0, Ldefpackage/tj0;->b0:Landroid/os/Handler;

    .line 230
    .line 231
    if-nez v0, :cond_6

    .line 232
    .line 233
    new-instance v0, Landroid/os/Handler;

    .line 234
    .line 235
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Ldefpackage/tj0;->b0:Landroid/os/Handler;

    .line 243
    .line 244
    :cond_6
    iget-object v0, p0, Ldefpackage/tj0;->b0:Landroid/os/Handler;

    .line 245
    .line 246
    const/4 v1, 0x0

    .line 247
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Ldefpackage/tj0;->b0:Landroid/os/Handler;

    .line 251
    .line 252
    new-instance v1, Ldefpackage/a0;

    .line 253
    .line 254
    const/16 v4, 0x11

    .line 255
    .line 256
    invoke-direct {v1, v4, p0}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    const-wide/16 v4, 0x64

    .line 260
    .line 261
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 262
    .line 263
    .line 264
    :cond_7
    return-wide v2

    .line 265
    :cond_8
    :goto_3
    const-wide/high16 v0, -0x8000000000000000L

    .line 266
    .line 267
    return-wide v0
.end method

.method public final i(Ldefpackage/tb1;)Ldefpackage/am;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/am;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldefpackage/am;-><init>(Ldefpackage/tb1;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldefpackage/tj0;->u:Ldefpackage/il;

    .line 7
    .line 8
    iput-object p1, v0, Ldefpackage/am;->b:Ldefpackage/il;

    .line 9
    .line 10
    iget p1, p0, Ldefpackage/tj0;->i:I

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iput-boolean p1, v0, Ldefpackage/am;->d:Z

    .line 18
    .line 19
    iget-object p1, p0, Ldefpackage/tj0;->T:Landroid/media/AudioDeviceInfo;

    .line 20
    .line 21
    iput-object p1, v0, Ldefpackage/am;->c:Landroid/media/AudioDeviceInfo;

    .line 22
    .line 23
    iget p1, p0, Ldefpackage/tj0;->Q:I

    .line 24
    .line 25
    iput p1, v0, Ldefpackage/am;->e:I

    .line 26
    .line 27
    iget-boolean p1, p0, Ldefpackage/tj0;->V:Z

    .line 28
    .line 29
    iput-boolean p1, v0, Ldefpackage/am;->g:Z

    .line 30
    .line 31
    const/4 p1, -0x1

    .line 32
    iput p1, v0, Ldefpackage/am;->h:I

    .line 33
    .line 34
    iget p0, p0, Ldefpackage/tj0;->U:I

    .line 35
    .line 36
    iput p0, v0, Ldefpackage/am;->f:I

    .line 37
    .line 38
    new-instance p0, Ldefpackage/am;

    .line 39
    .line 40
    invoke-direct {p0, v0}, Ldefpackage/am;-><init>(Ldefpackage/am;)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public final j(Ldefpackage/tb1;)I
    .locals 5

    .line 1
    iget v0, p1, Ldefpackage/tb1;->H:I

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/f35;->L(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget v0, p1, Ldefpackage/tb1;->H:I

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput v1, p1, Ldefpackage/sb1;->G:I

    .line 21
    .line 22
    new-instance v0, Ldefpackage/tb1;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v0

    .line 28
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v0, v3

    .line 31
    :goto_0
    iget-object v4, p0, Ldefpackage/tj0;->r:Ldefpackage/dn;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ldefpackage/tj0;->i(Ldefpackage/tb1;)Ldefpackage/am;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v4, p0}, Ldefpackage/dn;->b(Ldefpackage/am;)Ldefpackage/cm;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget p0, p0, Ldefpackage/cm;->d:I

    .line 42
    .line 43
    if-eq p0, v2, :cond_3

    .line 44
    .line 45
    if-eq p0, v1, :cond_1

    .line 46
    .line 47
    return v3

    .line 48
    :cond_1
    if-eqz v0, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    return v1

    .line 52
    :cond_3
    :goto_1
    return v2
.end method

.method public final l()J
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Ldefpackage/tj0;->B:J

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 12
    .line 13
    iget p0, p0, Ldefpackage/qj0;->b:I

    .line 14
    .line 15
    int-to-long v2, p0

    .line 16
    add-long/2addr v0, v2

    .line 17
    const-wide/16 v4, 0x1

    .line 18
    .line 19
    sub-long/2addr v0, v4

    .line 20
    div-long/2addr v0, v2

    .line 21
    return-wide v0

    .line 22
    :cond_0
    iget-wide v0, p0, Ldefpackage/tj0;->C:J

    .line 23
    .line 24
    return-wide v0
.end method

.method public final m(IJLjava/nio/ByteBuffer;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    iget-object v5, v0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    if-eqz v5, :cond_1

    .line 14
    .line 15
    if-ne v4, v5, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v5, v7

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v5, v6

    .line 21
    :goto_1
    invoke-static {v5}, Ldefpackage/rr2;->l(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    if-eqz v5, :cond_9

    .line 28
    .line 29
    invoke-virtual {v0}, Ldefpackage/tj0;->e()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-nez v5, :cond_2

    .line 34
    .line 35
    goto/16 :goto_a

    .line 36
    .line 37
    :cond_2
    iget-object v5, v0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 38
    .line 39
    iget-object v9, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v9, v9, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v9, Ldefpackage/em;

    .line 47
    .line 48
    iget-object v5, v5, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v5, Ldefpackage/em;

    .line 51
    .line 52
    invoke-virtual {v9, v5}, Ldefpackage/em;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0}, Ldefpackage/tj0;->s()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ldefpackage/tj0;->n()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    goto/16 :goto_a

    .line 68
    .line 69
    :cond_3
    invoke-virtual {v0}, Ldefpackage/tj0;->f()V

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    iget-object v5, v0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 74
    .line 75
    iput-object v5, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 76
    .line 77
    iput-object v8, v0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 78
    .line 79
    iget-object v5, v0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 80
    .line 81
    if-eqz v5, :cond_8

    .line 82
    .line 83
    invoke-virtual {v5}, Ldefpackage/an;->c()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_8

    .line 88
    .line 89
    iget-object v5, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 90
    .line 91
    iget-object v5, v5, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Ldefpackage/em;

    .line 94
    .line 95
    iget-boolean v5, v5, Ldefpackage/em;->k:Z

    .line 96
    .line 97
    if-eqz v5, :cond_8

    .line 98
    .line 99
    iget-object v5, v0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 100
    .line 101
    iget-object v9, v5, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 102
    .line 103
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    const/16 v11, 0x1d

    .line 106
    .line 107
    if-ge v10, v11, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    invoke-virtual {v9}, Landroid/media/AudioTrack;->getPlayState()I

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    const/4 v13, 0x3

    .line 115
    if-eq v12, v13, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    invoke-static {v9}, Ldefpackage/z9;->n(Landroid/media/AudioTrack;)V

    .line 119
    .line 120
    .line 121
    iget-object v5, v5, Ldefpackage/an;->e:Ldefpackage/en;

    .line 122
    .line 123
    iput-boolean v6, v5, Ldefpackage/en;->A:Z

    .line 124
    .line 125
    iget-object v5, v5, Ldefpackage/en;->h:Ldefpackage/vm;

    .line 126
    .line 127
    iget-object v5, v5, Ldefpackage/vm;->a:Ldefpackage/um;

    .line 128
    .line 129
    iput-boolean v6, v5, Ldefpackage/um;->f:Z

    .line 130
    .line 131
    :goto_2
    iget-object v5, v0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 132
    .line 133
    iget-object v9, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 134
    .line 135
    iget-object v9, v9, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v9, Ldefpackage/tb1;

    .line 138
    .line 139
    iget v12, v9, Ldefpackage/tb1;->I:I

    .line 140
    .line 141
    iget v9, v9, Ldefpackage/tb1;->J:I

    .line 142
    .line 143
    if-ge v10, v11, :cond_7

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    iget-object v5, v5, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 150
    .line 151
    invoke-static {v5, v12, v9}, Ldefpackage/z9;->o(Landroid/media/AudioTrack;II)V

    .line 152
    .line 153
    .line 154
    :goto_3
    iput-boolean v6, v0, Ldefpackage/tj0;->Y:Z

    .line 155
    .line 156
    :cond_8
    :goto_4
    invoke-virtual {v0, v2, v3}, Ldefpackage/tj0;->a(J)V

    .line 157
    .line 158
    .line 159
    :cond_9
    invoke-virtual {v0}, Ldefpackage/tj0;->p()Z

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    iget-object v9, v0, Ldefpackage/tj0;->k:Ldefpackage/sj0;

    .line 164
    .line 165
    if-nez v5, :cond_b

    .line 166
    .line 167
    :try_start_0
    invoke-virtual {v0}, Ldefpackage/tj0;->o()Z

    .line 168
    .line 169
    .line 170
    move-result v5
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    if-nez v5, :cond_b

    .line 172
    .line 173
    goto/16 :goto_a

    .line 174
    .line 175
    :catch_0
    move-exception v0

    .line 176
    iget-boolean v1, v0, Landroidx/media3/exoplayer/audio/AudioSink$InitializationException;->n:Z

    .line 177
    .line 178
    if-nez v1, :cond_a

    .line 179
    .line 180
    invoke-virtual {v9, v0}, Ldefpackage/sj0;->e(Ljava/lang/Exception;)V

    .line 181
    .line 182
    .line 183
    return v7

    .line 184
    :cond_a
    throw v0

    .line 185
    :cond_b
    iput-object v8, v9, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 186
    .line 187
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    iput-wide v10, v9, Ldefpackage/sj0;->a:J

    .line 193
    .line 194
    iput-wide v10, v9, Ldefpackage/sj0;->b:J

    .line 195
    .line 196
    iget-boolean v5, v0, Ldefpackage/tj0;->F:Z

    .line 197
    .line 198
    const-wide/16 v12, 0x0

    .line 199
    .line 200
    if-eqz v5, :cond_d

    .line 201
    .line 202
    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v14

    .line 206
    iput-wide v14, v0, Ldefpackage/tj0;->G:J

    .line 207
    .line 208
    iput-boolean v7, v0, Ldefpackage/tj0;->E:Z

    .line 209
    .line 210
    iput-boolean v7, v0, Ldefpackage/tj0;->F:Z

    .line 211
    .line 212
    invoke-virtual {v0}, Ldefpackage/tj0;->C()Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-eqz v5, :cond_c

    .line 217
    .line 218
    invoke-virtual {v0}, Ldefpackage/tj0;->x()V

    .line 219
    .line 220
    .line 221
    :cond_c
    invoke-virtual {v0, v2, v3}, Ldefpackage/tj0;->a(J)V

    .line 222
    .line 223
    .line 224
    iget-boolean v5, v0, Ldefpackage/tj0;->O:Z

    .line 225
    .line 226
    if-eqz v5, :cond_d

    .line 227
    .line 228
    invoke-virtual {v0}, Ldefpackage/tj0;->r()V

    .line 229
    .line 230
    .line 231
    :cond_d
    iget-object v5, v0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 232
    .line 233
    if-nez v5, :cond_19

    .line 234
    .line 235
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    sget-object v9, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 240
    .line 241
    if-ne v5, v9, :cond_e

    .line 242
    .line 243
    move v5, v6

    .line 244
    goto :goto_5

    .line 245
    :cond_e
    move v5, v7

    .line 246
    :goto_5
    invoke-static {v5}, Ldefpackage/rr2;->l(Z)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-nez v5, :cond_f

    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_f
    iget-object v5, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 257
    .line 258
    invoke-static {v5}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-nez v5, :cond_10

    .line 263
    .line 264
    iget v5, v0, Ldefpackage/tj0;->D:I

    .line 265
    .line 266
    if-nez v5, :cond_10

    .line 267
    .line 268
    iget-object v5, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 269
    .line 270
    iget-object v5, v5, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v5, Ldefpackage/em;

    .line 273
    .line 274
    iget v5, v5, Ldefpackage/em;->a:I

    .line 275
    .line 276
    invoke-static {v5, v4}, Ldefpackage/tj0;->k(ILjava/nio/ByteBuffer;)I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    iput v5, v0, Ldefpackage/tj0;->D:I

    .line 281
    .line 282
    if-nez v5, :cond_10

    .line 283
    .line 284
    :goto_6
    return v6

    .line 285
    :cond_10
    iget-object v5, v0, Ldefpackage/tj0;->v:Ldefpackage/rj0;

    .line 286
    .line 287
    if-eqz v5, :cond_12

    .line 288
    .line 289
    invoke-virtual {v0}, Ldefpackage/tj0;->e()Z

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    if-nez v5, :cond_11

    .line 294
    .line 295
    goto/16 :goto_a

    .line 296
    .line 297
    :cond_11
    invoke-virtual {v0, v2, v3}, Ldefpackage/tj0;->a(J)V

    .line 298
    .line 299
    .line 300
    iput-object v8, v0, Ldefpackage/tj0;->v:Ldefpackage/rj0;

    .line 301
    .line 302
    :cond_12
    iget-wide v14, v0, Ldefpackage/tj0;->G:J

    .line 303
    .line 304
    iget-object v5, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 305
    .line 306
    invoke-static {v5}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 307
    .line 308
    .line 309
    move-result v9

    .line 310
    if-eqz v9, :cond_13

    .line 311
    .line 312
    move-wide/from16 v16, v10

    .line 313
    .line 314
    iget-wide v10, v0, Ldefpackage/tj0;->z:J

    .line 315
    .line 316
    iget-object v9, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 317
    .line 318
    iget v9, v9, Ldefpackage/qj0;->a:I

    .line 319
    .line 320
    move-wide/from16 v18, v12

    .line 321
    .line 322
    int-to-long v12, v9

    .line 323
    div-long/2addr v10, v12

    .line 324
    goto :goto_7

    .line 325
    :cond_13
    move-wide/from16 v16, v10

    .line 326
    .line 327
    move-wide/from16 v18, v12

    .line 328
    .line 329
    iget-wide v10, v0, Ldefpackage/tj0;->A:J

    .line 330
    .line 331
    :goto_7
    iget-object v9, v0, Ldefpackage/tj0;->d:Ldefpackage/ky4;

    .line 332
    .line 333
    iget-wide v12, v9, Ldefpackage/ky4;->o:J

    .line 334
    .line 335
    sub-long/2addr v10, v12

    .line 336
    iget-object v5, v5, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v5, Ldefpackage/tb1;

    .line 339
    .line 340
    iget v5, v5, Ldefpackage/tb1;->G:I

    .line 341
    .line 342
    invoke-static {v5, v10, v11}, Ldefpackage/f35;->Y(IJ)J

    .line 343
    .line 344
    .line 345
    move-result-wide v9

    .line 346
    add-long/2addr v9, v14

    .line 347
    iget-boolean v5, v0, Ldefpackage/tj0;->E:Z

    .line 348
    .line 349
    if-nez v5, :cond_15

    .line 350
    .line 351
    sub-long v11, v9, v2

    .line 352
    .line 353
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(J)J

    .line 354
    .line 355
    .line 356
    move-result-wide v11

    .line 357
    const-wide/32 v13, 0x30d40

    .line 358
    .line 359
    .line 360
    cmp-long v5, v11, v13

    .line 361
    .line 362
    if-lez v5, :cond_15

    .line 363
    .line 364
    iget-object v5, v0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 365
    .line 366
    if-eqz v5, :cond_14

    .line 367
    .line 368
    new-instance v11, Landroidx/media3/exoplayer/audio/AudioSink$UnexpectedDiscontinuityException;

    .line 369
    .line 370
    new-instance v12, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    const-string v13, "Unexpected audio track timestamp discontinuity: expected "

    .line 373
    .line 374
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v13, ", got "

    .line 381
    .line 382
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v12

    .line 392
    invoke-direct {v11, v12}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v5, v11}, Ldefpackage/rm;->g(Ljava/lang/Exception;)V

    .line 396
    .line 397
    .line 398
    :cond_14
    iput-boolean v6, v0, Ldefpackage/tj0;->E:Z

    .line 399
    .line 400
    :cond_15
    iget-boolean v5, v0, Ldefpackage/tj0;->E:Z

    .line 401
    .line 402
    if-eqz v5, :cond_17

    .line 403
    .line 404
    invoke-virtual {v0}, Ldefpackage/tj0;->e()Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-nez v5, :cond_16

    .line 409
    .line 410
    goto/16 :goto_a

    .line 411
    .line 412
    :cond_16
    sub-long v9, v2, v9

    .line 413
    .line 414
    iget-wide v11, v0, Ldefpackage/tj0;->G:J

    .line 415
    .line 416
    add-long/2addr v11, v9

    .line 417
    iput-wide v11, v0, Ldefpackage/tj0;->G:J

    .line 418
    .line 419
    iput-boolean v7, v0, Ldefpackage/tj0;->E:Z

    .line 420
    .line 421
    invoke-virtual {v0, v2, v3}, Ldefpackage/tj0;->a(J)V

    .line 422
    .line 423
    .line 424
    iget-object v5, v0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 425
    .line 426
    if-eqz v5, :cond_17

    .line 427
    .line 428
    cmp-long v9, v9, v18

    .line 429
    .line 430
    if-eqz v9, :cond_17

    .line 431
    .line 432
    invoke-interface {v5}, Ldefpackage/rm;->u()V

    .line 433
    .line 434
    .line 435
    :cond_17
    iget-object v5, v0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 436
    .line 437
    invoke-static {v5}, Ldefpackage/qj0;->a(Ldefpackage/qj0;)Z

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    if-eqz v5, :cond_18

    .line 442
    .line 443
    iget-wide v9, v0, Ldefpackage/tj0;->z:J

    .line 444
    .line 445
    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    int-to-long v11, v5

    .line 450
    add-long/2addr v9, v11

    .line 451
    iput-wide v9, v0, Ldefpackage/tj0;->z:J

    .line 452
    .line 453
    goto :goto_8

    .line 454
    :cond_18
    iget-wide v9, v0, Ldefpackage/tj0;->A:J

    .line 455
    .line 456
    iget v5, v0, Ldefpackage/tj0;->D:I

    .line 457
    .line 458
    int-to-long v11, v5

    .line 459
    int-to-long v13, v1

    .line 460
    mul-long/2addr v11, v13

    .line 461
    add-long/2addr v11, v9

    .line 462
    iput-wide v11, v0, Ldefpackage/tj0;->A:J

    .line 463
    .line 464
    :goto_8
    iput-object v4, v0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 465
    .line 466
    iput v1, v0, Ldefpackage/tj0;->J:I

    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_19
    move-wide/from16 v16, v10

    .line 470
    .line 471
    move-wide/from16 v18, v12

    .line 472
    .line 473
    :goto_9
    invoke-virtual {v0, v2, v3}, Ldefpackage/tj0;->u(J)V

    .line 474
    .line 475
    .line 476
    iget-object v1, v0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-nez v1, :cond_1a

    .line 483
    .line 484
    iput-object v8, v0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 485
    .line 486
    iput v7, v0, Ldefpackage/tj0;->J:I

    .line 487
    .line 488
    return v6

    .line 489
    :cond_1a
    iget-object v1, v0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 490
    .line 491
    iget-object v2, v1, Ldefpackage/an;->e:Ldefpackage/en;

    .line 492
    .line 493
    invoke-virtual {v1}, Ldefpackage/an;->b()J

    .line 494
    .line 495
    .line 496
    move-result-wide v3

    .line 497
    iget-wide v8, v2, Ldefpackage/en;->v:J

    .line 498
    .line 499
    cmp-long v1, v8, v16

    .line 500
    .line 501
    if-eqz v1, :cond_1b

    .line 502
    .line 503
    cmp-long v1, v3, v18

    .line 504
    .line 505
    if-lez v1, :cond_1b

    .line 506
    .line 507
    iget-object v1, v2, Ldefpackage/en;->b:Ldefpackage/vp4;

    .line 508
    .line 509
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 513
    .line 514
    .line 515
    move-result-wide v3

    .line 516
    iget-wide v1, v2, Ldefpackage/en;->v:J

    .line 517
    .line 518
    sub-long/2addr v3, v1

    .line 519
    const-wide/16 v1, 0xc8

    .line 520
    .line 521
    cmp-long v1, v3, v1

    .line 522
    .line 523
    if-ltz v1, :cond_1b

    .line 524
    .line 525
    const-string v1, "DefaultAudioSink"

    .line 526
    .line 527
    const-string v2, "Resetting stalled audio output"

    .line 528
    .line 529
    invoke-static {v1, v2}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0}, Ldefpackage/tj0;->f()V

    .line 533
    .line 534
    .line 535
    return v6

    .line 536
    :cond_1b
    :goto_a
    return v7
.end method

.method public final n()Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/an;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Ldefpackage/tj0;->N:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Ldefpackage/tj0;->l()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-object v2, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 30
    .line 31
    invoke-virtual {v2}, Ldefpackage/an;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    iget-object p0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getSampleRate()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    int-to-long v5, p0

    .line 47
    const-wide/32 v7, 0xf4240

    .line 48
    .line 49
    .line 50
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 51
    .line 52
    invoke-static/range {v3 .. v9}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long p0, v0, v2

    .line 57
    .line 58
    if-lez p0, :cond_1

    .line 59
    .line 60
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_1
    const/4 p0, 0x0

    .line 63
    return p0
.end method

.method public final o()Z
    .locals 13

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->k:Ldefpackage/sj0;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Exception;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    sget-object v1, Ldefpackage/tj0;->c0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    iget-wide v0, v0, Ldefpackage/sj0;->b:J

    .line 25
    .line 26
    cmp-long v0, v3, v0

    .line 27
    .line 28
    if-gez v0, :cond_2

    .line 29
    .line 30
    :goto_0
    return v2

    .line 31
    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 32
    :try_start_0
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 33
    .line 34
    iget-object v0, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ldefpackage/em;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ldefpackage/tj0;->b(Ldefpackage/em;)Ldefpackage/an;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_2

    .line 43
    :catch_0
    move-exception v0

    .line 44
    move-object v3, v0

    .line 45
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 46
    .line 47
    iget-object v0, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ldefpackage/em;

    .line 50
    .line 51
    iget v4, v0, Ldefpackage/em;->f:I

    .line 52
    .line 53
    const v5, 0xf4240

    .line 54
    .line 55
    .line 56
    if-le v4, v5, :cond_c

    .line 57
    .line 58
    invoke-virtual {v0}, Ldefpackage/em;->a()Ldefpackage/dm;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput v5, v0, Ldefpackage/dm;->f:I

    .line 63
    .line 64
    new-instance v11, Ldefpackage/em;

    .line 65
    .line 66
    invoke-direct {v11, v0}, Ldefpackage/em;-><init>(Ldefpackage/dm;)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    invoke-virtual {p0, v11}, Ldefpackage/tj0;->b(Ldefpackage/em;)Ldefpackage/an;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v4, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 74
    .line 75
    new-instance v6, Ldefpackage/qj0;

    .line 76
    .line 77
    iget-object v5, v4, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v7, v5

    .line 80
    check-cast v7, Ldefpackage/tb1;

    .line 81
    .line 82
    iget-object v5, v4, Ldefpackage/qj0;->d:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v8, v5

    .line 85
    check-cast v8, Ldefpackage/tb1;

    .line 86
    .line 87
    iget v9, v4, Ldefpackage/qj0;->a:I

    .line 88
    .line 89
    iget v10, v4, Ldefpackage/qj0;->b:I

    .line 90
    .line 91
    iget-object v4, v4, Ldefpackage/qj0;->f:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v12, v4

    .line 94
    check-cast v12, Ldefpackage/fm;

    .line 95
    .line 96
    invoke-direct/range {v6 .. v12}, Ldefpackage/qj0;-><init>(Ldefpackage/tb1;Ldefpackage/tb1;IILdefpackage/em;Ldefpackage/fm;)V

    .line 97
    .line 98
    .line 99
    iput-object v6, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;
    :try_end_1
    .catch Landroidx/media3/exoplayer/audio/AudioSink$InitializationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 100
    .line 101
    :goto_2
    iput-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 102
    .line 103
    new-instance v3, Ldefpackage/pj0;

    .line 104
    .line 105
    iget-object v4, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 106
    .line 107
    iget-object v4, v4, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Ldefpackage/em;

    .line 110
    .line 111
    invoke-direct {v3, p0, v4}, Ldefpackage/pj0;-><init>(Ldefpackage/tj0;Ldefpackage/em;)V

    .line 112
    .line 113
    .line 114
    iput-object v3, p0, Ldefpackage/tj0;->j:Ldefpackage/pj0;

    .line 115
    .line 116
    iget-object v0, v0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 117
    .line 118
    invoke-virtual {v0, v3}, Ldefpackage/tc2;->a(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 122
    .line 123
    invoke-virtual {v0}, Ldefpackage/an;->c()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 130
    .line 131
    iget-object v3, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v3, Ldefpackage/em;

    .line 134
    .line 135
    iget-boolean v3, v3, Ldefpackage/em;->k:Z

    .line 136
    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    iget-object v3, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 140
    .line 141
    iget-object v0, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v0, Ldefpackage/tb1;

    .line 144
    .line 145
    iget v4, v0, Ldefpackage/tb1;->I:I

    .line 146
    .line 147
    iget v0, v0, Ldefpackage/tb1;->J:I

    .line 148
    .line 149
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 150
    .line 151
    const/16 v6, 0x1d

    .line 152
    .line 153
    if-ge v5, v6, :cond_3

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_3
    iget-object v3, v3, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 160
    .line 161
    invoke-static {v3, v4, v0}, Ldefpackage/z9;->o(Landroid/media/AudioTrack;II)V

    .line 162
    .line 163
    .line 164
    :cond_4
    :goto_3
    iget-object v0, p0, Ldefpackage/tj0;->m:Ldefpackage/ik3;

    .line 165
    .line 166
    if-eqz v0, :cond_6

    .line 167
    .line 168
    iget-object v3, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 174
    .line 175
    const/16 v5, 0x1f

    .line 176
    .line 177
    if-ge v4, v5, :cond_5

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_5
    invoke-virtual {v0}, Ldefpackage/ik3;->a()Landroid/media/metrics/LogSessionId;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {}, Ldefpackage/go2;->d()Landroid/media/metrics/LogSessionId;

    .line 185
    .line 186
    .line 187
    invoke-static {v0}, Ldefpackage/go2;->w(Landroid/media/metrics/LogSessionId;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-nez v4, :cond_6

    .line 192
    .line 193
    iget-object v3, v3, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 194
    .line 195
    invoke-static {v3, v0}, Ldefpackage/db;->t(Landroid/media/AudioTrack;Landroid/media/metrics/LogSessionId;)V

    .line 196
    .line 197
    .line 198
    :cond_6
    :goto_4
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_7

    .line 203
    .line 204
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 205
    .line 206
    iget v3, p0, Ldefpackage/tj0;->H:F

    .line 207
    .line 208
    iget-object v0, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 209
    .line 210
    invoke-virtual {v0, v3}, Landroid/media/AudioTrack;->setVolume(F)I

    .line 211
    .line 212
    .line 213
    :cond_7
    iget-object v0, p0, Ldefpackage/tj0;->S:Ldefpackage/xn;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object v0, p0, Ldefpackage/tj0;->T:Landroid/media/AudioDeviceInfo;

    .line 219
    .line 220
    if-eqz v0, :cond_8

    .line 221
    .line 222
    iget-object v3, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 223
    .line 224
    iget-object v3, v3, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 225
    .line 226
    invoke-virtual {v3, v0}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 227
    .line 228
    .line 229
    :cond_8
    iput-boolean v1, p0, Ldefpackage/tj0;->F:Z

    .line 230
    .line 231
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 232
    .line 233
    iget-object v0, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 234
    .line 235
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    iget v3, p0, Ldefpackage/tj0;->Q:I

    .line 240
    .line 241
    if-eq v0, v3, :cond_9

    .line 242
    .line 243
    move v2, v1

    .line 244
    :cond_9
    iput v0, p0, Ldefpackage/tj0;->Q:I

    .line 245
    .line 246
    iget-object v0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 247
    .line 248
    if-eqz v0, :cond_b

    .line 249
    .line 250
    iget-object v3, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 251
    .line 252
    new-instance v4, Ldefpackage/pa;

    .line 253
    .line 254
    iget-object v3, v3, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v3, Ldefpackage/em;

    .line 257
    .line 258
    iget v3, v3, Ldefpackage/em;->a:I

    .line 259
    .line 260
    const/16 v3, 0xf

    .line 261
    .line 262
    invoke-direct {v4, v3}, Ldefpackage/pa;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v0, v4}, Ldefpackage/rm;->j(Ldefpackage/pa;)V

    .line 266
    .line 267
    .line 268
    if-eqz v2, :cond_b

    .line 269
    .line 270
    iput-boolean v1, p0, Ldefpackage/tj0;->R:Z

    .line 271
    .line 272
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 273
    .line 274
    iget-object v2, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v2, Ldefpackage/em;

    .line 277
    .line 278
    invoke-virtual {v2}, Ldefpackage/em;->a()Ldefpackage/dm;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    iget v3, p0, Ldefpackage/tj0;->Q:I

    .line 283
    .line 284
    iput v3, v2, Ldefpackage/dm;->h:I

    .line 285
    .line 286
    new-instance v9, Ldefpackage/em;

    .line 287
    .line 288
    invoke-direct {v9, v2}, Ldefpackage/em;-><init>(Ldefpackage/dm;)V

    .line 289
    .line 290
    .line 291
    new-instance v4, Ldefpackage/qj0;

    .line 292
    .line 293
    iget-object v2, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 294
    .line 295
    move-object v5, v2

    .line 296
    check-cast v5, Ldefpackage/tb1;

    .line 297
    .line 298
    iget-object v2, v0, Ldefpackage/qj0;->d:Ljava/lang/Object;

    .line 299
    .line 300
    move-object v6, v2

    .line 301
    check-cast v6, Ldefpackage/tb1;

    .line 302
    .line 303
    iget v7, v0, Ldefpackage/qj0;->a:I

    .line 304
    .line 305
    iget v8, v0, Ldefpackage/qj0;->b:I

    .line 306
    .line 307
    iget-object v0, v0, Ldefpackage/qj0;->f:Ljava/lang/Object;

    .line 308
    .line 309
    move-object v10, v0

    .line 310
    check-cast v10, Ldefpackage/fm;

    .line 311
    .line 312
    invoke-direct/range {v4 .. v10}, Ldefpackage/qj0;-><init>(Ldefpackage/tb1;Ldefpackage/tb1;IILdefpackage/em;Ldefpackage/fm;)V

    .line 313
    .line 314
    .line 315
    iput-object v4, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 316
    .line 317
    iget-object v0, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 318
    .line 319
    if-eqz v0, :cond_a

    .line 320
    .line 321
    iget-object v2, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v2, Ldefpackage/em;

    .line 324
    .line 325
    invoke-virtual {v2}, Ldefpackage/em;->a()Ldefpackage/dm;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    iget v3, p0, Ldefpackage/tj0;->Q:I

    .line 330
    .line 331
    iput v3, v2, Ldefpackage/dm;->h:I

    .line 332
    .line 333
    new-instance v9, Ldefpackage/em;

    .line 334
    .line 335
    invoke-direct {v9, v2}, Ldefpackage/em;-><init>(Ldefpackage/dm;)V

    .line 336
    .line 337
    .line 338
    new-instance v4, Ldefpackage/qj0;

    .line 339
    .line 340
    iget-object v2, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 341
    .line 342
    move-object v5, v2

    .line 343
    check-cast v5, Ldefpackage/tb1;

    .line 344
    .line 345
    iget-object v2, v0, Ldefpackage/qj0;->d:Ljava/lang/Object;

    .line 346
    .line 347
    move-object v6, v2

    .line 348
    check-cast v6, Ldefpackage/tb1;

    .line 349
    .line 350
    iget v7, v0, Ldefpackage/qj0;->a:I

    .line 351
    .line 352
    iget v8, v0, Ldefpackage/qj0;->b:I

    .line 353
    .line 354
    iget-object v0, v0, Ldefpackage/qj0;->f:Ljava/lang/Object;

    .line 355
    .line 356
    move-object v10, v0

    .line 357
    check-cast v10, Ldefpackage/fm;

    .line 358
    .line 359
    invoke-direct/range {v4 .. v10}, Ldefpackage/qj0;-><init>(Ldefpackage/tb1;Ldefpackage/tb1;IILdefpackage/em;Ldefpackage/fm;)V

    .line 360
    .line 361
    .line 362
    iput-object v4, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 363
    .line 364
    :cond_a
    iget-object v0, p0, Ldefpackage/tj0;->n:Ldefpackage/rm;

    .line 365
    .line 366
    iget p0, p0, Ldefpackage/tj0;->Q:I

    .line 367
    .line 368
    invoke-interface {v0, p0}, Ldefpackage/rm;->b(I)V

    .line 369
    .line 370
    .line 371
    :cond_b
    return v1

    .line 372
    :catch_1
    move-exception v0

    .line 373
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 374
    .line 375
    .line 376
    :cond_c
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 377
    .line 378
    iget-object v0, v0, Ldefpackage/qj0;->e:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Ldefpackage/em;

    .line 381
    .line 382
    iget-boolean v0, v0, Ldefpackage/em;->e:Z

    .line 383
    .line 384
    if-nez v0, :cond_d

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_d
    iput-boolean v1, p0, Ldefpackage/tj0;->X:Z

    .line 388
    .line 389
    :goto_5
    throw v3
.end method

.method public final p()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final q()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldefpackage/tj0;->O:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    iput-wide v2, v1, Ldefpackage/en;->k:J

    .line 17
    .line 18
    iput v0, v1, Ldefpackage/en;->t:I

    .line 19
    .line 20
    iput v0, v1, Ldefpackage/en;->s:I

    .line 21
    .line 22
    iput-wide v2, v1, Ldefpackage/en;->l:J

    .line 23
    .line 24
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide v2, v1, Ldefpackage/en;->y:J

    .line 30
    .line 31
    iput-wide v2, v1, Ldefpackage/en;->z:J

    .line 32
    .line 33
    iget-wide v4, v1, Ldefpackage/en;->u:J

    .line 34
    .line 35
    cmp-long v2, v4, v2

    .line 36
    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    iget-object v2, v1, Ldefpackage/en;->h:Ldefpackage/vm;

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ldefpackage/vm;->a(I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Ldefpackage/en;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    iput-wide v2, v1, Ldefpackage/en;->w:J

    .line 49
    .line 50
    iget-boolean v0, p0, Ldefpackage/an;->j:Z

    .line 51
    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {p0}, Ldefpackage/an;->c()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    :cond_1
    iget-object p0, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/media/AudioTrack;->pause()V

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public final r()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/tj0;->O:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 13
    .line 14
    iget-wide v1, v0, Ldefpackage/en;->u:J

    .line 15
    .line 16
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v1, v1, v3

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v0, Ldefpackage/en;->b:Ldefpackage/vp4;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, Ldefpackage/f35;->Q(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iput-wide v1, v0, Ldefpackage/en;->u:J

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v0}, Ldefpackage/en;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    iget v3, v0, Ldefpackage/en;->e:I

    .line 45
    .line 46
    invoke-static {v3, v1, v2}, Ldefpackage/f35;->Y(IJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    iput-wide v1, v0, Ldefpackage/en;->j:J

    .line 51
    .line 52
    iget-object v0, v0, Ldefpackage/en;->h:Ldefpackage/vm;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-virtual {v0, v1}, Ldefpackage/vm;->a(I)V

    .line 56
    .line 57
    .line 58
    iget-boolean v0, p0, Ldefpackage/an;->j:Z

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Ldefpackage/an;->c()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    :cond_1
    iget-object p0, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/media/AudioTrack;->play()V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public final s()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ldefpackage/tj0;->M:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ldefpackage/tj0;->M:Z

    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 9
    .line 10
    invoke-virtual {v1}, Ldefpackage/an;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iput-boolean v2, p0, Ldefpackage/tj0;->N:Z

    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 20
    .line 21
    iget-boolean v1, p0, Ldefpackage/an;->j:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-boolean v0, p0, Ldefpackage/an;->j:Z

    .line 27
    .line 28
    iget-object v0, p0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/an;->b()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    invoke-virtual {v0}, Ldefpackage/en;->a()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    iput-wide v5, v0, Ldefpackage/en;->w:J

    .line 39
    .line 40
    iget-object v1, v0, Ldefpackage/en;->b:Ldefpackage/vp4;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-static {v5, v6}, Ldefpackage/f35;->Q(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    iput-wide v5, v0, Ldefpackage/en;->u:J

    .line 54
    .line 55
    iput-wide v3, v0, Ldefpackage/en;->x:J

    .line 56
    .line 57
    iget-object v0, p0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/media/AudioTrack;->stop()V

    .line 60
    .line 61
    .line 62
    iput v2, p0, Ldefpackage/an;->o:I

    .line 63
    .line 64
    :cond_2
    :goto_0
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/tj0;->L:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/tj0;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/tj0;->s()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Ldefpackage/tj0;->L:Z

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final u(J)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1, p2}, Ldefpackage/tj0;->d(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 11
    .line 12
    invoke-virtual {v0}, Ldefpackage/fm;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    if-eqz v0, :cond_8

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ldefpackage/tj0;->A(Ljava/nio/ByteBuffer;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Ldefpackage/tj0;->d(J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 30
    .line 31
    invoke-virtual {v0}, Ldefpackage/fm;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_8

    .line 36
    .line 37
    :cond_2
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 38
    .line 39
    invoke-virtual {v0}, Ldefpackage/fm;->d()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    sget-object v0, Ldefpackage/im;->a:Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    iget-object v1, v0, Ldefpackage/fm;->c:[Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    invoke-virtual {v0}, Ldefpackage/fm;->b()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    aget-object v1, v1, v2

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move-object v0, v1

    .line 63
    goto :goto_1

    .line 64
    :cond_4
    sget-object v1, Ldefpackage/im;->a:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ldefpackage/fm;->e(Ljava/nio/ByteBuffer;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Ldefpackage/fm;->c:[Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    invoke-virtual {v0}, Ldefpackage/fm;->b()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ldefpackage/tj0;->A(Ljava/nio/ByteBuffer;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, Ldefpackage/tj0;->d(J)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Ldefpackage/tj0;->K:Ljava/nio/ByteBuffer;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    iget-object v0, p0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    if-eqz v0, :cond_8

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_6

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_6
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 106
    .line 107
    iget-object v1, p0, Ldefpackage/tj0;->I:Ljava/nio/ByteBuffer;

    .line 108
    .line 109
    invoke-virtual {v0}, Ldefpackage/fm;->d()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    iget-boolean v2, v0, Ldefpackage/fm;->d:Z

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-virtual {v0, v1}, Ldefpackage/fm;->e(Ljava/nio/ByteBuffer;)V

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    :goto_2
    return-void
.end method

.method public final v()V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Ldefpackage/tj0;->o:Ldefpackage/qj0;

    .line 13
    .line 14
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldefpackage/tj0;->r:Ldefpackage/dn;

    .line 15
    .line 16
    iget-object v1, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 17
    .line 18
    iget-object v1, v1, Ldefpackage/qj0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ldefpackage/tb1;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ldefpackage/tj0;->i(Ldefpackage/tb1;)Ldefpackage/am;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Ldefpackage/dn;->c(Ldefpackage/am;)Ldefpackage/em;

    .line 27
    .line 28
    .line 29
    move-result-object v7
    :try_end_0
    .catch Landroidx/media3/exoplayer/audio/AudioOutputProvider$ConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    new-instance v2, Ldefpackage/qj0;

    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 33
    .line 34
    iget-object v1, v0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v3, v1

    .line 37
    check-cast v3, Ldefpackage/tb1;

    .line 38
    .line 39
    iget-object v1, v0, Ldefpackage/qj0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v4, v1

    .line 42
    check-cast v4, Ldefpackage/tb1;

    .line 43
    .line 44
    iget v5, v0, Ldefpackage/qj0;->a:I

    .line 45
    .line 46
    iget v6, v0, Ldefpackage/qj0;->b:I

    .line 47
    .line 48
    iget-object v0, v0, Ldefpackage/qj0;->f:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v8, v0

    .line 51
    check-cast v8, Ldefpackage/fm;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v8}, Ldefpackage/qj0;-><init>(Ldefpackage/tb1;Ldefpackage/tb1;IILdefpackage/em;Ldefpackage/fm;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    .line 60
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    new-instance v2, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;

    .line 63
    .line 64
    iget-object p0, p0, Ldefpackage/tj0;->p:Ldefpackage/qj0;

    .line 65
    .line 66
    iget-object p0, p0, Ldefpackage/qj0;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Ldefpackage/tb1;

    .line 69
    .line 70
    invoke-direct {v2, v0, p0}, Landroidx/media3/exoplayer/audio/AudioSink$ConfigurationException;-><init>(Ljava/lang/Exception;Ldefpackage/tb1;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ldefpackage/tj0;->f()V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final w()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->f()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/tj0;->g:Ldefpackage/gy3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-virtual {v0}, Ldefpackage/v0;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ldefpackage/im;

    .line 22
    .line 23
    invoke-interface {v2}, Ldefpackage/im;->reset()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Ldefpackage/tj0;->e:Ldefpackage/pu4;

    .line 28
    .line 29
    invoke-virtual {v0}, Ldefpackage/fp;->reset()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/tj0;->f:Ldefpackage/ou4;

    .line 33
    .line 34
    invoke-virtual {v0}, Ldefpackage/fp;->reset()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ldefpackage/tj0;->q:Ldefpackage/fm;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v2, v0, Ldefpackage/fm;->a:Ldefpackage/yw1;

    .line 42
    .line 43
    move v3, v1

    .line 44
    :goto_1
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ge v3, v4, :cond_1

    .line 49
    .line 50
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ldefpackage/im;

    .line 55
    .line 56
    sget-object v5, Ldefpackage/hm;->b:Ldefpackage/hm;

    .line 57
    .line 58
    invoke-interface {v4}, Ldefpackage/im;->flush()V

    .line 59
    .line 60
    .line 61
    invoke-interface {v4}, Ldefpackage/im;->reset()V

    .line 62
    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iget-object v2, v0, Ldefpackage/fm;->b:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    new-array v2, v1, [Ljava/nio/ByteBuffer;

    .line 73
    .line 74
    iput-object v2, v0, Ldefpackage/fm;->c:[Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    sget-object v2, Ldefpackage/gm;->e:Ldefpackage/gm;

    .line 77
    .line 78
    iput-boolean v1, v0, Ldefpackage/fm;->d:Z

    .line 79
    .line 80
    :cond_2
    iput-boolean v1, p0, Ldefpackage/tj0;->O:Z

    .line 81
    .line 82
    iput-boolean v1, p0, Ldefpackage/tj0;->X:Z

    .line 83
    .line 84
    return-void
.end method

.method public final x()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/tj0;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 10
    .line 11
    iget-object v2, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 12
    .line 13
    new-instance v3, Landroid/media/PlaybackParams;

    .line 14
    .line 15
    invoke-direct {v3}, Landroid/media/PlaybackParams;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/media/PlaybackParams;->allowDefaults()Landroid/media/PlaybackParams;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget v4, v1, Ldefpackage/qh3;->a:F

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget v1, v1, Ldefpackage/qh3;->b:F

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Landroid/media/PlaybackParams;->setPitch(F)Landroid/media/PlaybackParams;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v3, 0x2

    .line 35
    invoke-virtual {v1, v3}, Landroid/media/PlaybackParams;->setAudioFallbackMode(I)Landroid/media/PlaybackParams;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/media/AudioTrack;->setPlaybackParams(Landroid/media/PlaybackParams;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v1

    .line 44
    const-string v3, "AudioTrackAudioOutput"

    .line 45
    .line 46
    const-string v4, "Failed to set playback params"

    .line 47
    .line 48
    invoke-static {v3, v4, v1}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v0, v0, Ldefpackage/an;->e:Ldefpackage/en;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iput v1, v0, Ldefpackage/en;->i:F

    .line 62
    .line 63
    iget-object v1, v0, Ldefpackage/en;->h:Ldefpackage/vm;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-virtual {v1, v2}, Ldefpackage/vm;->a(I)V

    .line 67
    .line 68
    .line 69
    const-wide/16 v3, 0x0

    .line 70
    .line 71
    iput-wide v3, v0, Ldefpackage/en;->k:J

    .line 72
    .line 73
    iput v2, v0, Ldefpackage/en;->t:I

    .line 74
    .line 75
    iput v2, v0, Ldefpackage/en;->s:I

    .line 76
    .line 77
    iput-wide v3, v0, Ldefpackage/en;->l:J

    .line 78
    .line 79
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide v1, v0, Ldefpackage/en;->y:J

    .line 85
    .line 86
    iput-wide v1, v0, Ldefpackage/en;->z:J

    .line 87
    .line 88
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 89
    .line 90
    iget-object v0, v0, Ldefpackage/an;->a:Landroid/media/AudioTrack;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlaybackParams()Landroid/media/PlaybackParams;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Ldefpackage/qh3;

    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getSpeed()F

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    invoke-virtual {v0}, Landroid/media/PlaybackParams;->getPitch()F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-direct {v1, v2, v0}, Ldefpackage/qh3;-><init>(FF)V

    .line 107
    .line 108
    .line 109
    iput-object v1, p0, Ldefpackage/tj0;->x:Ldefpackage/qh3;

    .line 110
    .line 111
    :cond_0
    return-void
.end method

.method public final y(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/tj0;->R:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Ldefpackage/tj0;->Q:I

    .line 7
    .line 8
    if-ne v0, p1, :cond_2

    .line 9
    .line 10
    iput-boolean v1, p0, Ldefpackage/tj0;->R:Z

    .line 11
    .line 12
    :cond_0
    iget v0, p0, Ldefpackage/tj0;->Q:I

    .line 13
    .line 14
    if-eq v0, p1, :cond_2

    .line 15
    .line 16
    iput p1, p0, Ldefpackage/tj0;->Q:I

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    :cond_1
    iput-boolean v1, p0, Ldefpackage/tj0;->P:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/tj0;->v()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public final z(Ldefpackage/xn;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/tj0;->S:Ldefpackage/xn;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/xn;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/tj0;->t:Ldefpackage/an;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/tj0;->S:Ldefpackage/xn;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    :cond_1
    iput-object p1, p0, Ldefpackage/tj0;->S:Ldefpackage/xn;

    .line 23
    .line 24
    return-void
.end method
