.class public final Ldefpackage/qe1;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final B:[B

.field public static final C:[B


# instance fields
.field public A:[B

.field public final o:[B

.field public final p:Ldefpackage/hg3;

.field public final q:Ldefpackage/df0;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Ljava/io/InputStream;

.field public w:Z

.field public x:Z

.field public final y:Ldefpackage/de5;

.field public final z:Ldefpackage/de5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/qe1;->B:[B

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldefpackage/qe1;->C:[B

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 1
        0x4t
        0x22t
        0x4dt
        0x18t
    .end array-data

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    :array_1
    .array-data 1
        0x2at
        0x4dt
        0x18t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ldefpackage/i90;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    new-array v1, v0, [B

    .line 6
    .line 7
    iput-object v1, p0, Ldefpackage/qe1;->o:[B

    .line 8
    .line 9
    new-instance v1, Ldefpackage/hg3;

    .line 10
    .line 11
    const/16 v2, 0x14

    .line 12
    .line 13
    invoke-direct {v1, v2, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ldefpackage/qe1;->p:Ldefpackage/hg3;

    .line 17
    .line 18
    new-instance v1, Ldefpackage/de5;

    .line 19
    .line 20
    invoke-direct {v1}, Ldefpackage/de5;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Ldefpackage/qe1;->y:Ldefpackage/de5;

    .line 24
    .line 25
    new-instance v1, Ldefpackage/de5;

    .line 26
    .line 27
    invoke-direct {v1}, Ldefpackage/de5;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Ldefpackage/qe1;->z:Ldefpackage/de5;

    .line 31
    .line 32
    new-instance v1, Ldefpackage/df0;

    .line 33
    .line 34
    invoke-direct {v1, p1}, Ldefpackage/df0;-><init>(Ljava/io/InputStream;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Ldefpackage/qe1;->q:Ldefpackage/df0;

    .line 38
    .line 39
    iget-object p1, p0, Ldefpackage/qe1;->q:Ldefpackage/df0;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    new-array v2, v1, [B

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-static {p1, v2, v3, v1}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    int-to-long v5, v4

    .line 50
    invoke-virtual {p0, v5, v6}, Ldefpackage/i90;->b(J)V

    .line 51
    .line 52
    .line 53
    const-string v5, "Not a LZ4 frame stream"

    .line 54
    .line 55
    if-ne v1, v4, :cond_14

    .line 56
    .line 57
    move v4, v1

    .line 58
    :goto_0
    if-ne v4, v1, :cond_5

    .line 59
    .line 60
    aget-byte v6, v2, v3

    .line 61
    .line 62
    const/16 v7, 0x50

    .line 63
    .line 64
    and-int/2addr v6, v7

    .line 65
    if-eq v6, v7, :cond_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_0
    move v6, v0

    .line 69
    :goto_1
    if-ge v6, v1, :cond_2

    .line 70
    .line 71
    aget-byte v7, v2, v6

    .line 72
    .line 73
    add-int/lit8 v8, v6, -0x1

    .line 74
    .line 75
    sget-object v9, Ldefpackage/qe1;->C:[B

    .line 76
    .line 77
    aget-byte v8, v9, v8

    .line 78
    .line 79
    if-eq v7, v8, :cond_1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    iget-object v4, p0, Ldefpackage/qe1;->p:Ldefpackage/hg3;

    .line 86
    .line 87
    invoke-static {v4, v1}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v6

    .line 91
    const-wide/16 v8, 0x0

    .line 92
    .line 93
    cmp-long v4, v6, v8

    .line 94
    .line 95
    if-ltz v4, :cond_4

    .line 96
    .line 97
    invoke-static {p1, v6, v7}, Ldefpackage/vr1;->G(Ljava/io/InputStream;J)J

    .line 98
    .line 99
    .line 100
    move-result-wide v8

    .line 101
    invoke-virtual {p0, v8, v9}, Ldefpackage/i90;->b(J)V

    .line 102
    .line 103
    .line 104
    cmp-long v4, v6, v8

    .line 105
    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    invoke-static {p1, v2, v3, v1}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    int-to-long v6, v4

    .line 113
    invoke-virtual {p0, v6, v7}, Ldefpackage/i90;->b(J)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    const-string p0, "Premature end of stream while skipping frame"

    .line 118
    .line 119
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_9

    .line 123
    .line 124
    :cond_4
    const-string p0, "Found illegal skippable frame with negative size"

    .line 125
    .line 126
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_9

    .line 130
    .line 131
    :cond_5
    :goto_2
    if-ne v1, v4, :cond_13

    .line 132
    .line 133
    sget-object v4, Ldefpackage/qe1;->B:[B

    .line 134
    .line 135
    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_13

    .line 140
    .line 141
    iget-object v2, p0, Ldefpackage/qe1;->y:Ldefpackage/de5;

    .line 142
    .line 143
    invoke-virtual {p0}, Ldefpackage/qe1;->n()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    const/4 v5, -0x1

    .line 148
    if-eq v4, v5, :cond_12

    .line 149
    .line 150
    invoke-virtual {v2, v4}, Ldefpackage/de5;->update(I)V

    .line 151
    .line 152
    .line 153
    and-int/lit16 v6, v4, 0xc0

    .line 154
    .line 155
    const/16 v7, 0x40

    .line 156
    .line 157
    if-ne v6, v7, :cond_11

    .line 158
    .line 159
    and-int/lit8 v6, v4, 0x20

    .line 160
    .line 161
    if-nez v6, :cond_6

    .line 162
    .line 163
    move v6, v0

    .line 164
    goto :goto_3

    .line 165
    :cond_6
    move v6, v3

    .line 166
    :goto_3
    iput-boolean v6, p0, Ldefpackage/qe1;->s:Z

    .line 167
    .line 168
    if-eqz v6, :cond_7

    .line 169
    .line 170
    iget-object v6, p0, Ldefpackage/qe1;->A:[B

    .line 171
    .line 172
    if-nez v6, :cond_8

    .line 173
    .line 174
    const/high16 v6, 0x10000

    .line 175
    .line 176
    new-array v6, v6, [B

    .line 177
    .line 178
    iput-object v6, p0, Ldefpackage/qe1;->A:[B

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_7
    const/4 v6, 0x0

    .line 182
    iput-object v6, p0, Ldefpackage/qe1;->A:[B

    .line 183
    .line 184
    :cond_8
    :goto_4
    and-int/lit8 v6, v4, 0x10

    .line 185
    .line 186
    if-eqz v6, :cond_9

    .line 187
    .line 188
    move v6, v0

    .line 189
    goto :goto_5

    .line 190
    :cond_9
    move v6, v3

    .line 191
    :goto_5
    iput-boolean v6, p0, Ldefpackage/qe1;->r:Z

    .line 192
    .line 193
    and-int/lit8 v6, v4, 0x8

    .line 194
    .line 195
    if-eqz v6, :cond_a

    .line 196
    .line 197
    move v6, v0

    .line 198
    goto :goto_6

    .line 199
    :cond_a
    move v6, v3

    .line 200
    :goto_6
    iput-boolean v6, p0, Ldefpackage/qe1;->t:Z

    .line 201
    .line 202
    and-int/2addr v1, v4

    .line 203
    if-eqz v1, :cond_b

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_b
    move v0, v3

    .line 207
    :goto_7
    iput-boolean v0, p0, Ldefpackage/qe1;->u:Z

    .line 208
    .line 209
    invoke-virtual {p0}, Ldefpackage/qe1;->n()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eq v0, v5, :cond_10

    .line 214
    .line 215
    invoke-virtual {v2, v0}, Ldefpackage/de5;->update(I)V

    .line 216
    .line 217
    .line 218
    iget-boolean v0, p0, Ldefpackage/qe1;->t:Z

    .line 219
    .line 220
    const/16 v1, 0x8

    .line 221
    .line 222
    if-eqz v0, :cond_d

    .line 223
    .line 224
    new-array v0, v1, [B

    .line 225
    .line 226
    invoke-static {p1, v0, v3, v1}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 227
    .line 228
    .line 229
    move-result p1

    .line 230
    int-to-long v6, p1

    .line 231
    invoke-virtual {p0, v6, v7}, Ldefpackage/i90;->b(J)V

    .line 232
    .line 233
    .line 234
    if-ne v1, p1, :cond_c

    .line 235
    .line 236
    invoke-virtual {v2, v0, v3, v1}, Ldefpackage/de5;->update([BII)V

    .line 237
    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_c
    const-string p0, "Premature end of stream while reading content size"

    .line 241
    .line 242
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    goto :goto_9

    .line 246
    :cond_d
    :goto_8
    invoke-virtual {p0}, Ldefpackage/qe1;->n()I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-eq p1, v5, :cond_f

    .line 251
    .line 252
    invoke-virtual {v2}, Ldefpackage/de5;->getValue()J

    .line 253
    .line 254
    .line 255
    move-result-wide v3

    .line 256
    shr-long v0, v3, v1

    .line 257
    .line 258
    const-wide/16 v3, 0xff

    .line 259
    .line 260
    and-long/2addr v0, v3

    .line 261
    long-to-int v0, v0

    .line 262
    invoke-virtual {v2}, Ldefpackage/de5;->reset()V

    .line 263
    .line 264
    .line 265
    if-ne p1, v0, :cond_e

    .line 266
    .line 267
    invoke-virtual {p0}, Ldefpackage/qe1;->f()V

    .line 268
    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_e
    const-string p0, "Frame header checksum mismatch"

    .line 272
    .line 273
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_f
    const-string p0, "Premature end of stream while reading frame header checksum"

    .line 278
    .line 279
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_10
    const-string p0, "Premature end of stream while reading frame BD byte"

    .line 284
    .line 285
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto :goto_9

    .line 289
    :cond_11
    new-instance p0, Ljava/io/IOException;

    .line 290
    .line 291
    shr-int/lit8 p1, v4, 0x6

    .line 292
    .line 293
    new-instance v0, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    const-string v1, "Unsupported version "

    .line 296
    .line 297
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw p0

    .line 311
    :cond_12
    const-string p0, "Premature end of stream while reading frame flags"

    .line 312
    .line 313
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_13
    invoke-static {v5}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_14
    invoke-static {v5}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    :goto_9
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/qe1;->q:Ldefpackage/df0;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :goto_1
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public final f()V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qe1;->z:Ldefpackage/de5;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;

    .line 12
    .line 13
    iget-boolean v0, p0, Ldefpackage/qe1;->r:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-string v0, "block"

    .line 18
    .line 19
    invoke-virtual {p0, v1, v0}, Ldefpackage/qe1;->q(Ldefpackage/de5;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ldefpackage/de5;->reset()V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Ldefpackage/qe1;->p:Ldefpackage/hg3;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-static {v0, v2}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    const-wide/32 v4, -0x80000000

    .line 33
    .line 34
    .line 35
    and-long/2addr v4, v2

    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    cmp-long v0, v4, v6

    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    const/4 v5, 0x0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    move v0, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v0, v5

    .line 47
    :goto_0
    const-wide/32 v6, 0x7fffffff

    .line 48
    .line 49
    .line 50
    and-long/2addr v2, v6

    .line 51
    long-to-int v2, v2

    .line 52
    if-ltz v2, :cond_8

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    iget-boolean v0, p0, Ldefpackage/qe1;->u:Z

    .line 57
    .line 58
    iget-object v1, p0, Ldefpackage/qe1;->y:Ldefpackage/de5;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    const-string v0, "content"

    .line 63
    .line 64
    invoke-virtual {p0, v1, v0}, Ldefpackage/qe1;->q(Ldefpackage/de5;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v1}, Ldefpackage/de5;->reset()V

    .line 68
    .line 69
    .line 70
    iput-boolean v4, p0, Ldefpackage/qe1;->w:Z

    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    new-instance v3, Ldefpackage/gu;

    .line 74
    .line 75
    iget-object v6, p0, Ldefpackage/qe1;->q:Ldefpackage/df0;

    .line 76
    .line 77
    int-to-long v7, v2

    .line 78
    invoke-direct {v3, v6, v7, v8}, Ldefpackage/gu;-><init>(Ljava/io/InputStream;J)V

    .line 79
    .line 80
    .line 81
    iget-boolean v2, p0, Ldefpackage/qe1;->r:Z

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    new-instance v2, Ldefpackage/a20;

    .line 86
    .line 87
    invoke-direct {v2, v1, v3}, Ldefpackage/a20;-><init>(Ljava/util/zip/Checksum;Ldefpackage/gu;)V

    .line 88
    .line 89
    .line 90
    move-object v3, v2

    .line 91
    :cond_4
    if-eqz v0, :cond_5

    .line 92
    .line 93
    iput-boolean v4, p0, Ldefpackage/qe1;->x:Z

    .line 94
    .line 95
    iput-object v3, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_5
    iput-boolean v5, p0, Ldefpackage/qe1;->x:Z

    .line 99
    .line 100
    new-instance v0, Ldefpackage/gt;

    .line 101
    .line 102
    invoke-direct {v0, v3}, Ldefpackage/gt;-><init>(Ljava/io/InputStream;)V

    .line 103
    .line 104
    .line 105
    iget-boolean v1, p0, Ldefpackage/qe1;->s:Z

    .line 106
    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    iget-object v1, p0, Ldefpackage/qe1;->A:[B

    .line 110
    .line 111
    iget v2, v0, Ldefpackage/w0;->q:I

    .line 112
    .line 113
    if-nez v2, :cond_6

    .line 114
    .line 115
    iget v2, v0, Ldefpackage/w0;->o:I

    .line 116
    .line 117
    array-length v3, v1

    .line 118
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    array-length v3, v1

    .line 123
    sub-int/2addr v3, v2

    .line 124
    iget-object v4, v0, Ldefpackage/w0;->p:[B

    .line 125
    .line 126
    invoke-static {v1, v3, v4, v5, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 127
    .line 128
    .line 129
    iget v1, v0, Ldefpackage/w0;->q:I

    .line 130
    .line 131
    add-int/2addr v1, v2

    .line 132
    iput v1, v0, Ldefpackage/w0;->q:I

    .line 133
    .line 134
    iget v1, v0, Ldefpackage/w0;->r:I

    .line 135
    .line 136
    add-int/2addr v1, v2

    .line 137
    iput v1, v0, Ldefpackage/w0;->r:I

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    const-string p0, "The stream has already been read from, can\'t prefill anymore"

    .line 141
    .line 142
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_7
    :goto_1
    iput-object v0, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;

    .line 147
    .line 148
    return-void

    .line 149
    :cond_8
    const-string p0, "Found illegal block with negative size"

    .line 150
    .line 151
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method public final j([BII)I
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/qe1;->x:Z

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/qe1;->v:Ljava/io/InputStream;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    int-to-long p2, p1

    .line 12
    invoke-virtual {p0, p2, p3}, Ldefpackage/i90;->b(J)V

    .line 13
    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    move-object v0, v1

    .line 17
    check-cast v0, Ldefpackage/gt;

    .line 18
    .line 19
    iget-wide v2, v0, Ldefpackage/i90;->n:J

    .line 20
    .line 21
    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-wide p2, v0, Ldefpackage/i90;->n:J

    .line 26
    .line 27
    sub-long/2addr p2, v2

    .line 28
    invoke-virtual {p0, p2, p3}, Ldefpackage/i90;->b(J)V

    .line 29
    .line 30
    .line 31
    return p1
.end method

.method public final n()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/qe1;->q:Ldefpackage/df0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/df0;->read()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const-wide/16 v1, 0x1

    .line 11
    .line 12
    invoke-virtual {p0, v1, v2}, Ldefpackage/i90;->b(J)V

    .line 13
    .line 14
    .line 15
    and-int/lit16 p0, v0, 0xff

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    return v1
.end method

.method public final q(Ldefpackage/de5;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    iget-object v2, p0, Ldefpackage/qe1;->q:Ldefpackage/df0;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-static {v2, v1, v3, v0}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    int-to-long v4, v2

    .line 12
    invoke-virtual {p0, v4, v5}, Ldefpackage/i90;->b(J)V

    .line 13
    .line 14
    .line 15
    if-ne v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ldefpackage/de5;->getValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    invoke-static {v1, v3, v0}, Ldefpackage/gh0;->m([BII)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    cmp-long p0, p0, v0

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, " checksum mismatch."

    .line 31
    .line 32
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const-string p0, "Premature end of stream while reading "

    .line 41
    .line 42
    const-string p1, " checksum"

    .line 43
    .line 44
    invoke-static {p0, p2, p1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final read()I
    .locals 3

    const/4 v0, 0x1

    .line 67
    iget-object v1, p0, Ldefpackage/qe1;->o:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ldefpackage/qe1;->read([BII)I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    aget-byte p0, v1, v2

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public final read([BII)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-boolean v1, p0, Ldefpackage/qe1;->w:Z

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/qe1;->j([BII)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ne v1, v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/qe1;->f()V

    .line 18
    .line 19
    .line 20
    iget-boolean v3, p0, Ldefpackage/qe1;->w:Z

    .line 21
    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/qe1;->j([BII)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    :cond_2
    if-eq v1, v2, :cond_5

    .line 29
    .line 30
    iget-boolean p3, p0, Ldefpackage/qe1;->s:Z

    .line 31
    .line 32
    if-eqz p3, :cond_4

    .line 33
    .line 34
    iget-object p3, p0, Ldefpackage/qe1;->A:[B

    .line 35
    .line 36
    array-length p3, p3

    .line 37
    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-lez p3, :cond_4

    .line 42
    .line 43
    iget-object v2, p0, Ldefpackage/qe1;->A:[B

    .line 44
    .line 45
    array-length v3, v2

    .line 46
    sub-int/2addr v3, p3

    .line 47
    if-lez v3, :cond_3

    .line 48
    .line 49
    invoke-static {v2, p3, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget-object v0, p0, Ldefpackage/qe1;->A:[B

    .line 53
    .line 54
    invoke-static {p1, p2, v0, v3, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    :cond_4
    iget-boolean p3, p0, Ldefpackage/qe1;->u:Z

    .line 58
    .line 59
    if-eqz p3, :cond_5

    .line 60
    .line 61
    iget-object p0, p0, Ldefpackage/qe1;->y:Ldefpackage/de5;

    .line 62
    .line 63
    invoke-virtual {p0, p1, p2, v1}, Ldefpackage/de5;->update([BII)V

    .line 64
    .line 65
    .line 66
    :cond_5
    return v1
.end method
