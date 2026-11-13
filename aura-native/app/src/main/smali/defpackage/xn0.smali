.class public final Ldefpackage/xn0;
.super Ldefpackage/i90;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public o:Ljava/io/ByteArrayInputStream;

.field public p:Ldefpackage/cu1;

.field public final q:[B


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayInputStream;)V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/cu1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldefpackage/cu1;-><init>(Ljava/io/ByteArrayInputStream;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldefpackage/i90;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    new-array v1, v1, [B

    .line 11
    .line 12
    iput-object v1, p0, Ldefpackage/xn0;->q:[B

    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/xn0;->p:Ldefpackage/cu1;

    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/xn0;->o:Ljava/io/ByteArrayInputStream;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xn0;->p:Ldefpackage/cu1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/fh0;->e()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Ldefpackage/xn0;->p:Ldefpackage/cu1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    :try_start_1
    invoke-virtual {v1}, Ldefpackage/cu1;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    .line 8
    .line 9
    :catch_0
    :cond_0
    :try_start_2
    iput-object v0, p0, Ldefpackage/xn0;->p:Ldefpackage/cu1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/xn0;->o:Ljava/io/ByteArrayInputStream;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ldefpackage/xn0;->o:Ljava/io/ByteArrayInputStream;

    .line 19
    .line 20
    :cond_1
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    iget-object v2, p0, Ldefpackage/xn0;->o:Ljava/io/ByteArrayInputStream;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Ldefpackage/xn0;->o:Ljava/io/ByteArrayInputStream;

    .line 30
    .line 31
    :cond_2
    throw v1
.end method

.method public final read()I
    .locals 3

    .line 365
    :cond_0
    iget-object v0, p0, Ldefpackage/xn0;->q:[B

    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    if-ne v1, p0, :cond_1

    const/4 p0, 0x0

    .line 366
    aget-byte p0, v0, p0

    and-int/lit16 p0, p0, 0xff

    return p0

    .line 367
    :cond_1
    const-string p0, "Invalid return value from read: "

    .line 368
    invoke-static {v1, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 369
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0

    :cond_2
    return v2
.end method

.method public final read([BII)I
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v3, v0, Ldefpackage/xn0;->p:Ldefpackage/cu1;

    .line 10
    .line 11
    if-eqz v3, :cond_14

    .line 12
    .line 13
    :cond_1
    :goto_0
    iget-boolean v5, v3, Ldefpackage/cu1;->n:Z

    .line 14
    .line 15
    if-eqz v5, :cond_3

    .line 16
    .line 17
    iget-object v5, v3, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 18
    .line 19
    invoke-virtual {v5}, Ldefpackage/fh0;->o()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    const/4 v4, -0x1

    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_3
    :goto_1
    iget-object v5, v3, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 30
    .line 31
    invoke-virtual {v5}, Ldefpackage/fh0;->x()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const/4 v6, 0x1

    .line 36
    if-ne v5, v6, :cond_11

    .line 37
    .line 38
    iget-object v5, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 39
    .line 40
    invoke-static {v5, v6}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v7

    .line 44
    const-wide/16 v9, 0x1

    .line 45
    .line 46
    cmp-long v5, v7, v9

    .line 47
    .line 48
    if-nez v5, :cond_4

    .line 49
    .line 50
    move v5, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_4
    move v5, v2

    .line 53
    :goto_2
    iput-boolean v5, v3, Ldefpackage/cu1;->n:Z

    .line 54
    .line 55
    iget-object v5, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 56
    .line 57
    const/4 v7, 0x2

    .line 58
    invoke-static {v5, v7}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 59
    .line 60
    .line 61
    move-result-wide v11

    .line 62
    long-to-int v5, v11

    .line 63
    const/16 v8, 0x10

    .line 64
    .line 65
    if-eqz v5, :cond_e

    .line 66
    .line 67
    const/4 v11, 0x4

    .line 68
    if-eq v5, v6, :cond_d

    .line 69
    .line 70
    if-ne v5, v7, :cond_c

    .line 71
    .line 72
    iget-object v5, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 73
    .line 74
    const/4 v12, 0x5

    .line 75
    invoke-static {v5, v12}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 76
    .line 77
    .line 78
    move-result-wide v13

    .line 79
    const-wide/16 v15, 0x101

    .line 80
    .line 81
    add-long/2addr v13, v15

    .line 82
    long-to-int v5, v13

    .line 83
    new-array v5, v5, [I

    .line 84
    .line 85
    iget-object v13, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 86
    .line 87
    invoke-static {v13, v12}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 88
    .line 89
    .line 90
    move-result-wide v12

    .line 91
    add-long/2addr v12, v9

    .line 92
    long-to-int v9, v12

    .line 93
    new-array v9, v9, [I

    .line 94
    .line 95
    filled-new-array {v5, v9}, [[I

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iget-object v9, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 100
    .line 101
    aget-object v10, v5, v2

    .line 102
    .line 103
    aget-object v12, v5, v6

    .line 104
    .line 105
    invoke-static {v9, v11}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 106
    .line 107
    .line 108
    move-result-wide v13

    .line 109
    const-wide/16 v15, 0x4

    .line 110
    .line 111
    add-long/2addr v13, v15

    .line 112
    long-to-int v11, v13

    .line 113
    const/16 v13, 0x13

    .line 114
    .line 115
    new-array v13, v13, [I

    .line 116
    .line 117
    move v14, v2

    .line 118
    :goto_3
    const/4 v15, 0x3

    .line 119
    if-ge v14, v11, :cond_5

    .line 120
    .line 121
    sget-object v16, Ldefpackage/cu1;->u:[I

    .line 122
    .line 123
    aget v16, v16, v14

    .line 124
    .line 125
    move-object/from16 v18, v5

    .line 126
    .line 127
    invoke-static {v9, v15}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 128
    .line 129
    .line 130
    move-result-wide v4

    .line 131
    long-to-int v4, v4

    .line 132
    aput v4, v13, v16

    .line 133
    .line 134
    add-int/lit8 v14, v14, 0x1

    .line 135
    .line 136
    move-object/from16 v5, v18

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_5
    move-object/from16 v18, v5

    .line 140
    .line 141
    invoke-static {v13}, Ldefpackage/cu1;->b([I)Ldefpackage/tu;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    array-length v5, v10

    .line 146
    array-length v11, v12

    .line 147
    add-int/2addr v5, v11

    .line 148
    new-array v11, v5, [I

    .line 149
    .line 150
    move v14, v2

    .line 151
    move/from16 v16, v14

    .line 152
    .line 153
    const/4 v13, -0x1

    .line 154
    :goto_4
    if-ge v14, v5, :cond_b

    .line 155
    .line 156
    if-lez v16, :cond_6

    .line 157
    .line 158
    add-int/lit8 v19, v14, 0x1

    .line 159
    .line 160
    aput v13, v11, v14

    .line 161
    .line 162
    add-int/lit8 v16, v16, -0x1

    .line 163
    .line 164
    move/from16 v14, v19

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    move/from16 v19, v6

    .line 168
    .line 169
    invoke-static {v9, v4}, Ldefpackage/cu1;->f(Ldefpackage/qs;Ldefpackage/tu;)I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-ge v6, v8, :cond_7

    .line 174
    .line 175
    add-int/lit8 v13, v14, 0x1

    .line 176
    .line 177
    aput v6, v11, v14

    .line 178
    .line 179
    move v14, v13

    .line 180
    move v13, v6

    .line 181
    goto :goto_7

    .line 182
    :cond_7
    const-wide/16 v20, 0x3

    .line 183
    .line 184
    if-ne v6, v8, :cond_8

    .line 185
    .line 186
    invoke-static {v9, v7}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 187
    .line 188
    .line 189
    move-result-wide v22

    .line 190
    add-long v7, v22, v20

    .line 191
    .line 192
    long-to-int v6, v7

    .line 193
    :goto_5
    move/from16 v16, v6

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_8
    const/16 v7, 0x11

    .line 197
    .line 198
    if-ne v6, v7, :cond_9

    .line 199
    .line 200
    invoke-static {v9, v15}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    :goto_6
    add-long v6, v6, v20

    .line 205
    .line 206
    long-to-int v6, v6

    .line 207
    move v13, v2

    .line 208
    goto :goto_5

    .line 209
    :cond_9
    const/16 v7, 0x12

    .line 210
    .line 211
    if-ne v6, v7, :cond_a

    .line 212
    .line 213
    const/4 v6, 0x7

    .line 214
    invoke-static {v9, v6}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    const-wide/16 v20, 0xb

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    :goto_7
    move/from16 v6, v19

    .line 222
    .line 223
    const/4 v7, 0x2

    .line 224
    const/16 v8, 0x10

    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_b
    move/from16 v19, v6

    .line 228
    .line 229
    array-length v4, v10

    .line 230
    invoke-static {v11, v2, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 231
    .line 232
    .line 233
    array-length v4, v10

    .line 234
    array-length v5, v12

    .line 235
    invoke-static {v11, v4, v12, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 236
    .line 237
    .line 238
    new-instance v4, Ldefpackage/zt1;

    .line 239
    .line 240
    aget-object v5, v18, v2

    .line 241
    .line 242
    aget-object v6, v18, v19

    .line 243
    .line 244
    invoke-direct {v4, v3, v15, v5, v6}, Ldefpackage/zt1;-><init>(Ldefpackage/cu1;I[I[I)V

    .line 245
    .line 246
    .line 247
    iput-object v4, v3, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_c
    const-string v0, "Unsupported compression: "

    .line 252
    .line 253
    invoke-static {v5, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    return v2

    .line 261
    :cond_d
    new-instance v4, Ldefpackage/zt1;

    .line 262
    .line 263
    sget-object v5, Ldefpackage/cu1;->v:[I

    .line 264
    .line 265
    sget-object v6, Ldefpackage/cu1;->w:[I

    .line 266
    .line 267
    invoke-direct {v4, v3, v11, v5, v6}, Ldefpackage/zt1;-><init>(Ldefpackage/cu1;I[I[I)V

    .line 268
    .line 269
    .line 270
    iput-object v4, v3, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_e
    iget-object v4, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 275
    .line 276
    iget v5, v4, Ldefpackage/qs;->q:I

    .line 277
    .line 278
    rem-int/lit8 v5, v5, 0x8

    .line 279
    .line 280
    if-lez v5, :cond_f

    .line 281
    .line 282
    invoke-virtual {v4, v5}, Ldefpackage/qs;->f(I)J

    .line 283
    .line 284
    .line 285
    :cond_f
    iget-object v4, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 286
    .line 287
    const/16 v5, 0x10

    .line 288
    .line 289
    invoke-static {v4, v5}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 290
    .line 291
    .line 292
    move-result-wide v6

    .line 293
    iget-object v4, v3, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 294
    .line 295
    invoke-static {v4, v5}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 296
    .line 297
    .line 298
    move-result-wide v4

    .line 299
    const-wide/32 v8, 0xffff

    .line 300
    .line 301
    .line 302
    xor-long v10, v6, v8

    .line 303
    .line 304
    and-long/2addr v8, v10

    .line 305
    cmp-long v4, v8, v4

    .line 306
    .line 307
    if-nez v4, :cond_10

    .line 308
    .line 309
    new-instance v4, Ldefpackage/bu1;

    .line 310
    .line 311
    invoke-direct {v4, v3, v6, v7}, Ldefpackage/bu1;-><init>(Ldefpackage/cu1;J)V

    .line 312
    .line 313
    .line 314
    iput-object v4, v3, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 315
    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_10
    const-string v0, "Illegal LEN / NLEN values"

    .line 319
    .line 320
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    return v2

    .line 324
    :cond_11
    iget-object v4, v3, Ldefpackage/cu1;->o:Ldefpackage/fh0;

    .line 325
    .line 326
    move-object/from16 v5, p1

    .line 327
    .line 328
    move/from16 v6, p2

    .line 329
    .line 330
    invoke-virtual {v4, v5, v6, v1}, Ldefpackage/fh0;->r([BII)I

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-eqz v4, :cond_1

    .line 335
    .line 336
    :goto_8
    iget-object v1, v0, Ldefpackage/xn0;->p:Ldefpackage/cu1;

    .line 337
    .line 338
    iget-object v1, v1, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 339
    .line 340
    iget-object v1, v1, Ldefpackage/qs;->n:Ldefpackage/df0;

    .line 341
    .line 342
    iget-wide v1, v1, Ldefpackage/df0;->n:J

    .line 343
    .line 344
    int-to-long v1, v4

    .line 345
    invoke-virtual {v0, v1, v2}, Ldefpackage/i90;->b(J)V

    .line 346
    .line 347
    .line 348
    const/4 v1, -0x1

    .line 349
    if-ne v4, v1, :cond_13

    .line 350
    .line 351
    iget-object v1, v0, Ldefpackage/xn0;->p:Ldefpackage/cu1;

    .line 352
    .line 353
    if-eqz v1, :cond_12

    .line 354
    .line 355
    :try_start_0
    invoke-virtual {v1}, Ldefpackage/cu1;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    .line 357
    .line 358
    :catch_0
    :cond_12
    const/4 v1, 0x0

    .line 359
    iput-object v1, v0, Ldefpackage/xn0;->p:Ldefpackage/cu1;

    .line 360
    .line 361
    :cond_13
    return v4

    .line 362
    :cond_14
    const/16 v17, -0x1

    .line 363
    .line 364
    return v17
.end method
