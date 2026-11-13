.class public final Ldefpackage/re1;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final z:[B


# instance fields
.field public final o:Ljava/io/PushbackInputStream;

.field public final p:I

.field public q:Ldefpackage/bh4;

.field public final r:[B

.field public s:Z

.field public t:Z

.field public u:I

.field public v:J

.field public final w:I

.field public final x:Ldefpackage/es3;

.field public final y:Ldefpackage/zg5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/re1;->z:[B

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 1
        -0x1t
        0x6t
        0x0t
        0x0t
        0x73t
        0x4et
        0x61t
        0x50t
        0x70t
        0x59t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 3

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
    iput-object v1, p0, Ldefpackage/re1;->r:[B

    .line 8
    .line 9
    const-wide/16 v1, -0x1

    .line 10
    .line 11
    iput-wide v1, p0, Ldefpackage/re1;->v:J

    .line 12
    .line 13
    new-instance v1, Ldefpackage/es3;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    iput v2, v1, Ldefpackage/es3;->a:I

    .line 20
    .line 21
    iput-object v1, p0, Ldefpackage/re1;->x:Ldefpackage/es3;

    .line 22
    .line 23
    new-instance v1, Ldefpackage/zg5;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Ldefpackage/re1;->y:Ldefpackage/zg5;

    .line 29
    .line 30
    new-instance v1, Ldefpackage/df0;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Ldefpackage/df0;-><init>(Ljava/io/InputStream;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/io/PushbackInputStream;

    .line 36
    .line 37
    invoke-direct {p1, v1, v0}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 41
    .line 42
    const p1, 0x8000

    .line 43
    .line 44
    .line 45
    iput p1, p0, Ldefpackage/re1;->w:I

    .line 46
    .line 47
    iput v0, p0, Ldefpackage/re1;->p:I

    .line 48
    .line 49
    invoke-virtual {p0}, Ldefpackage/re1;->n()V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/re1;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/re1;->u:I

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/io/PushbackInputStream;->available()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object p0, p0, Ldefpackage/re1;->q:Ldefpackage/bh4;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/w0;->available()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ldefpackage/re1;->q:Ldefpackage/bh4;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/w0;->close()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Ldefpackage/re1;->q:Ldefpackage/bh4;
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
    invoke-virtual {v0}, Ljava/io/PushbackInputStream;->close()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :goto_1
    invoke-virtual {v0}, Ljava/io/PushbackInputStream;->close()V

    .line 21
    .line 22
    .line 23
    throw p0
.end method

.method public final f()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Ldefpackage/re1;->v:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v5, v1, v3

    .line 8
    .line 9
    iget-object v6, v0, Ldefpackage/re1;->x:Ldefpackage/es3;

    .line 10
    .line 11
    if-ltz v5, :cond_1

    .line 12
    .line 13
    invoke-virtual {v6}, Ldefpackage/es3;->getValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v7

    .line 17
    cmp-long v1, v1, v7

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "Checksum verification failed"

    .line 23
    .line 24
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    const-wide/16 v1, -0x1

    .line 29
    .line 30
    iput-wide v1, v0, Ldefpackage/re1;->v:J

    .line 31
    .line 32
    const/4 v5, -0x1

    .line 33
    iput v5, v6, Ldefpackage/es3;->a:I

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    iput-boolean v6, v0, Ldefpackage/re1;->t:Z

    .line 37
    .line 38
    iget-object v7, v0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/io/PushbackInputStream;->read()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    const/16 v9, 0xff

    .line 45
    .line 46
    const-wide/16 v10, 0x1

    .line 47
    .line 48
    if-eq v8, v5, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v10, v11}, Ldefpackage/i90;->b(J)V

    .line 51
    .line 52
    .line 53
    and-int/2addr v8, v9

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v8, v5

    .line 56
    :goto_1
    const/4 v12, 0x1

    .line 57
    if-ne v8, v5, :cond_3

    .line 58
    .line 59
    iput-boolean v12, v0, Ldefpackage/re1;->s:Z

    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    if-ne v8, v9, :cond_4

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 65
    .line 66
    .line 67
    iget-wide v1, v0, Ldefpackage/i90;->n:J

    .line 68
    .line 69
    sub-long/2addr v1, v10

    .line 70
    iput-wide v1, v0, Ldefpackage/i90;->n:J

    .line 71
    .line 72
    invoke-virtual {v0}, Ldefpackage/re1;->n()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ldefpackage/re1;->f()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4
    const/16 v5, 0xfe

    .line 80
    .line 81
    const-string v9, "Premature end of stream"

    .line 82
    .line 83
    const/4 v10, 0x3

    .line 84
    iget-object v11, v0, Ldefpackage/re1;->y:Ldefpackage/zg5;

    .line 85
    .line 86
    const-string v13, "Found illegal chunk with negative size"

    .line 87
    .line 88
    if-eq v8, v5, :cond_12

    .line 89
    .line 90
    const/16 v5, 0x7f

    .line 91
    .line 92
    if-le v8, v5, :cond_5

    .line 93
    .line 94
    const/16 v14, 0xfd

    .line 95
    .line 96
    if-gt v8, v14, :cond_5

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_5
    const/4 v14, 0x2

    .line 101
    if-lt v8, v14, :cond_7

    .line 102
    .line 103
    if-le v8, v5, :cond_6

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 107
    .line 108
    const-string v1, "Unskippable chunk with type "

    .line 109
    .line 110
    const-string v2, " (hex "

    .line 111
    .line 112
    invoke-static {v8, v1, v2}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v8}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v2, ") detected."

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_7
    :goto_2
    const/16 v5, 0xf

    .line 137
    .line 138
    const/16 v15, 0x11

    .line 139
    .line 140
    const-wide v16, 0xffffffffL

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    const-wide v18, 0xa282ead8L

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    move-wide/from16 v20, v3

    .line 151
    .line 152
    const/4 v3, 0x4

    .line 153
    if-ne v8, v12, :cond_a

    .line 154
    .line 155
    iput-boolean v12, v0, Ldefpackage/re1;->t:Z

    .line 156
    .line 157
    invoke-static {v11, v10}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    long-to-int v1, v1

    .line 162
    sub-int/2addr v1, v3

    .line 163
    iput v1, v0, Ldefpackage/re1;->u:I

    .line 164
    .line 165
    if-ltz v1, :cond_9

    .line 166
    .line 167
    new-array v1, v3, [B

    .line 168
    .line 169
    invoke-static {v7, v1, v6, v3}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    int-to-long v7, v2

    .line 174
    invoke-virtual {v0, v7, v8}, Ldefpackage/i90;->b(J)V

    .line 175
    .line 176
    .line 177
    if-ne v2, v3, :cond_8

    .line 178
    .line 179
    invoke-static {v1, v6, v3}, Ldefpackage/gh0;->m([BII)J

    .line 180
    .line 181
    .line 182
    move-result-wide v1

    .line 183
    sub-long v1, v1, v18

    .line 184
    .line 185
    and-long v1, v1, v16

    .line 186
    .line 187
    shr-long v3, v1, v15

    .line 188
    .line 189
    shl-long/2addr v1, v5

    .line 190
    or-long/2addr v1, v3

    .line 191
    and-long v1, v1, v16

    .line 192
    .line 193
    iput-wide v1, v0, Ldefpackage/re1;->v:J

    .line 194
    .line 195
    return-void

    .line 196
    :cond_8
    invoke-static {v9}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_9
    invoke-static {v13}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_a
    if-nez v8, :cond_11

    .line 205
    .line 206
    iget v4, v0, Ldefpackage/re1;->p:I

    .line 207
    .line 208
    if-eq v4, v12, :cond_c

    .line 209
    .line 210
    if-ne v4, v14, :cond_b

    .line 211
    .line 212
    move v12, v6

    .line 213
    goto :goto_3

    .line 214
    :cond_b
    const/4 v0, 0x0

    .line 215
    throw v0

    .line 216
    :cond_c
    :goto_3
    invoke-static {v11, v10}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 217
    .line 218
    .line 219
    move-result-wide v10

    .line 220
    long-to-int v4, v10

    .line 221
    int-to-long v10, v4

    .line 222
    if-eqz v12, :cond_d

    .line 223
    .line 224
    const-wide/16 v22, 0x4

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_d
    move-wide/from16 v22, v20

    .line 228
    .line 229
    :goto_4
    sub-long v10, v10, v22

    .line 230
    .line 231
    cmp-long v4, v10, v20

    .line 232
    .line 233
    if-ltz v4, :cond_10

    .line 234
    .line 235
    if-eqz v12, :cond_f

    .line 236
    .line 237
    new-array v1, v3, [B

    .line 238
    .line 239
    invoke-static {v7, v1, v6, v3}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    int-to-long v12, v2

    .line 244
    invoke-virtual {v0, v12, v13}, Ldefpackage/i90;->b(J)V

    .line 245
    .line 246
    .line 247
    if-ne v2, v3, :cond_e

    .line 248
    .line 249
    invoke-static {v1, v6, v3}, Ldefpackage/gh0;->m([BII)J

    .line 250
    .line 251
    .line 252
    move-result-wide v1

    .line 253
    sub-long v1, v1, v18

    .line 254
    .line 255
    and-long v1, v1, v16

    .line 256
    .line 257
    shr-long v3, v1, v15

    .line 258
    .line 259
    shl-long/2addr v1, v5

    .line 260
    or-long/2addr v1, v3

    .line 261
    and-long v1, v1, v16

    .line 262
    .line 263
    iput-wide v1, v0, Ldefpackage/re1;->v:J

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_e
    invoke-static {v9}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_f
    iput-wide v1, v0, Ldefpackage/re1;->v:J

    .line 271
    .line 272
    :goto_5
    new-instance v1, Ldefpackage/bh4;

    .line 273
    .line 274
    new-instance v2, Ldefpackage/gu;

    .line 275
    .line 276
    invoke-direct {v2, v7, v10, v11}, Ldefpackage/gu;-><init>(Ljava/io/InputStream;J)V

    .line 277
    .line 278
    .line 279
    iget v3, v0, Ldefpackage/re1;->w:I

    .line 280
    .line 281
    invoke-direct {v1, v2, v3}, Ldefpackage/bh4;-><init>(Ljava/io/InputStream;I)V

    .line 282
    .line 283
    .line 284
    iput-object v1, v0, Ldefpackage/re1;->q:Ldefpackage/bh4;

    .line 285
    .line 286
    iget-wide v1, v1, Ldefpackage/i90;->n:J

    .line 287
    .line 288
    invoke-virtual {v0, v1, v2}, Ldefpackage/i90;->b(J)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_10
    invoke-static {v13}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_11
    const-string v0, "Unknown chunk type "

    .line 297
    .line 298
    const-string v1, " detected."

    .line 299
    .line 300
    invoke-static {v8, v0, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    :cond_12
    :goto_6
    invoke-static {v11, v10}, Ldefpackage/gh0;->k(Ldefpackage/zw;I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v1

    .line 312
    long-to-int v1, v1

    .line 313
    if-ltz v1, :cond_14

    .line 314
    .line 315
    int-to-long v1, v1

    .line 316
    invoke-static {v7, v1, v2}, Ldefpackage/vr1;->G(Ljava/io/InputStream;J)J

    .line 317
    .line 318
    .line 319
    move-result-wide v3

    .line 320
    invoke-virtual {v0, v3, v4}, Ldefpackage/i90;->b(J)V

    .line 321
    .line 322
    .line 323
    cmp-long v1, v3, v1

    .line 324
    .line 325
    if-nez v1, :cond_13

    .line 326
    .line 327
    invoke-virtual {v0}, Ldefpackage/re1;->f()V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :cond_13
    invoke-static {v9}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :cond_14
    invoke-static {v13}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-void
.end method

.method public final j([BII)I
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/re1;->t:Z

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget v0, p0, Ldefpackage/re1;->u:I

    .line 7
    .line 8
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    if-nez p3, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    iget-object v0, p0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/PushbackInputStream;->read([BII)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-eq p3, v1, :cond_1

    .line 22
    .line 23
    iget v0, p0, Ldefpackage/re1;->u:I

    .line 24
    .line 25
    sub-int/2addr v0, p3

    .line 26
    iput v0, p0, Ldefpackage/re1;->u:I

    .line 27
    .line 28
    int-to-long v0, p3

    .line 29
    invoke-virtual {p0, v0, v1}, Ldefpackage/i90;->b(J)V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
    move v1, p3

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object v0, p0, Ldefpackage/re1;->q:Ldefpackage/bh4;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    iget-wide v2, v0, Ldefpackage/i90;->n:J

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, p3}, Ldefpackage/bh4;->read([BII)I

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    iget-object v0, p0, Ldefpackage/re1;->q:Ldefpackage/bh4;

    .line 45
    .line 46
    if-ne p3, v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Ldefpackage/w0;->close()V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    iput-object v0, p0, Ldefpackage/re1;->q:Ldefpackage/bh4;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-wide v0, v0, Ldefpackage/i90;->n:J

    .line 56
    .line 57
    sub-long/2addr v0, v2

    .line 58
    invoke-virtual {p0, v0, v1}, Ldefpackage/i90;->b(J)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    :goto_1
    if-lez v1, :cond_5

    .line 63
    .line 64
    iget-object p0, p0, Ldefpackage/re1;->x:Ldefpackage/es3;

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2, v1}, Ldefpackage/es3;->update([BII)V

    .line 67
    .line 68
    .line 69
    :cond_5
    return v1
.end method

.method public final n()V
    .locals 5

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/re1;->o:Ljava/io/PushbackInputStream;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v2, v1, v3, v0}, Ldefpackage/vr1;->D(Ljava/io/InputStream;[BII)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    int-to-long v3, v2

    .line 13
    invoke-virtual {p0, v3, v4}, Ldefpackage/i90;->b(J)V

    .line 14
    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    sget-object p0, Ldefpackage/re1;->z:[B

    .line 19
    .line 20
    invoke-static {v1, p0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "Not a framed Snappy stream"

    .line 28
    .line 29
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final read()I
    .locals 3

    const/4 v0, 0x1

    .line 26
    iget-object v1, p0, Ldefpackage/re1;->r:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ldefpackage/re1;->read([BII)I

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
    .locals 2

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/re1;->j([BII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/re1;->f()V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Ldefpackage/re1;->s:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/re1;->j([BII)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_2
    return v0
.end method
