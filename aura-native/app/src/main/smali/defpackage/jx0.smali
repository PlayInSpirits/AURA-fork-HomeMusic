.class public final Ldefpackage/jx0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/mz0;


# instance fields
.field public final a:Ldefpackage/be3;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ldefpackage/wv4;

.field public h:I

.field public i:I

.field public j:I

.field public k:J

.field public l:Ldefpackage/tb1;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/be3;

    .line 5
    .line 6
    new-array p3, p3, [B

    .line 7
    .line 8
    invoke-direct {v0, p3}, Ldefpackage/be3;-><init>([B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/jx0;->a:Ldefpackage/be3;

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    iput p3, p0, Ldefpackage/jx0;->h:I

    .line 15
    .line 16
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, Ldefpackage/jx0;->q:J

    .line 22
    .line 23
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p3, p0, Ldefpackage/jx0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 29
    .line 30
    const/4 p3, -0x1

    .line 31
    iput p3, p0, Ldefpackage/jx0;->o:I

    .line 32
    .line 33
    iput p3, p0, Ldefpackage/jx0;->p:I

    .line 34
    .line 35
    iput-object p1, p0, Ldefpackage/jx0;->c:Ljava/lang/String;

    .line 36
    .line 37
    iput p2, p0, Ldefpackage/jx0;->d:I

    .line 38
    .line 39
    const-string p1, "video/mp2t"

    .line 40
    .line 41
    iput-object p1, p0, Ldefpackage/jx0;->e:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/be3;)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ldefpackage/be3;->a()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v2, :cond_30

    .line 15
    .line 16
    iget v2, v0, Ldefpackage/jx0;->h:I

    .line 17
    .line 18
    const/4 v14, 0x5

    .line 19
    const/16 v6, 0x20

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const-wide v18, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/4 v11, 0x2

    .line 28
    const/4 v15, 0x4

    .line 29
    const/4 v3, 0x0

    .line 30
    const/4 v4, 0x1

    .line 31
    iget-object v5, v0, Ldefpackage/jx0;->a:Ldefpackage/be3;

    .line 32
    .line 33
    packed-switch v2, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    invoke-virtual {v1}, Ldefpackage/be3;->a()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget v5, v0, Ldefpackage/jx0;->m:I

    .line 45
    .line 46
    iget v6, v0, Ldefpackage/jx0;->i:I

    .line 47
    .line 48
    sub-int/2addr v5, v6

    .line 49
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v5, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 54
    .line 55
    invoke-interface {v5, v2, v1}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 56
    .line 57
    .line 58
    iget v5, v0, Ldefpackage/jx0;->i:I

    .line 59
    .line 60
    add-int/2addr v5, v2

    .line 61
    iput v5, v0, Ldefpackage/jx0;->i:I

    .line 62
    .line 63
    iget v2, v0, Ldefpackage/jx0;->m:I

    .line 64
    .line 65
    if-ne v5, v2, :cond_0

    .line 66
    .line 67
    iget-wide v5, v0, Ldefpackage/jx0;->q:J

    .line 68
    .line 69
    cmp-long v2, v5, v18

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    move v2, v4

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v2, v3

    .line 76
    :goto_1
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v5, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 80
    .line 81
    iget-wide v6, v0, Ldefpackage/jx0;->q:J

    .line 82
    .line 83
    iget v2, v0, Ldefpackage/jx0;->n:I

    .line 84
    .line 85
    if-ne v2, v15, :cond_2

    .line 86
    .line 87
    move v8, v3

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move v8, v4

    .line 90
    :goto_2
    iget v9, v0, Ldefpackage/jx0;->m:I

    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    const/4 v11, 0x0

    .line 94
    invoke-interface/range {v5 .. v11}, Ldefpackage/wv4;->a(JIIILdefpackage/vv4;)V

    .line 95
    .line 96
    .line 97
    iget-wide v4, v0, Ldefpackage/jx0;->q:J

    .line 98
    .line 99
    iget-wide v6, v0, Ldefpackage/jx0;->k:J

    .line 100
    .line 101
    add-long/2addr v4, v6

    .line 102
    iput-wide v4, v0, Ldefpackage/jx0;->q:J

    .line 103
    .line 104
    iput v3, v0, Ldefpackage/jx0;->h:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_1
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 108
    .line 109
    iget v14, v0, Ldefpackage/jx0;->p:I

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2, v14}, Ldefpackage/jx0;->b(Ldefpackage/be3;[BI)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_0

    .line 116
    .line 117
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 118
    .line 119
    invoke-static {v2}, Ldefpackage/e35;->A([B)Ldefpackage/h00;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    invoke-virtual {v14, v6}, Ldefpackage/h00;->i(I)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    move/from16 v27, v15

    .line 128
    .line 129
    const v15, 0x40411bf2

    .line 130
    .line 131
    .line 132
    if-ne v6, v15, :cond_3

    .line 133
    .line 134
    move v6, v4

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    move v6, v3

    .line 137
    :goto_3
    sget-object v15, Ldefpackage/e35;->i:[I

    .line 138
    .line 139
    invoke-static {v14, v15}, Ldefpackage/e35;->O(Ldefpackage/h00;[I)I

    .line 140
    .line 141
    .line 142
    move-result v15

    .line 143
    add-int/lit8 v24, v15, 0x1

    .line 144
    .line 145
    if-eqz v6, :cond_e

    .line 146
    .line 147
    invoke-virtual {v14}, Ldefpackage/h00;->h()Z

    .line 148
    .line 149
    .line 150
    move-result v23

    .line 151
    if-eqz v23, :cond_d

    .line 152
    .line 153
    const/16 v28, 0x8

    .line 154
    .line 155
    add-int/lit8 v9, v15, -0x1

    .line 156
    .line 157
    aget-byte v23, v2, v9

    .line 158
    .line 159
    shl-int/lit8 v23, v23, 0x8

    .line 160
    .line 161
    const v25, 0xffff

    .line 162
    .line 163
    .line 164
    and-int v23, v23, v25

    .line 165
    .line 166
    aget-byte v15, v2, v15

    .line 167
    .line 168
    and-int/lit16 v15, v15, 0xff

    .line 169
    .line 170
    or-int v15, v23, v15

    .line 171
    .line 172
    sget-object v23, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 173
    .line 174
    move v12, v3

    .line 175
    move/from16 v10, v25

    .line 176
    .line 177
    :goto_4
    if-ge v12, v9, :cond_4

    .line 178
    .line 179
    aget-byte v3, v2, v12

    .line 180
    .line 181
    and-int/lit16 v8, v3, 0xff

    .line 182
    .line 183
    shr-int/lit8 v8, v8, 0x4

    .line 184
    .line 185
    shr-int/lit8 v13, v10, 0xc

    .line 186
    .line 187
    and-int/lit16 v13, v13, 0xff

    .line 188
    .line 189
    xor-int/2addr v8, v13

    .line 190
    and-int/lit16 v8, v8, 0xff

    .line 191
    .line 192
    shl-int/lit8 v10, v10, 0x4

    .line 193
    .line 194
    and-int v10, v10, v25

    .line 195
    .line 196
    sget-object v13, Ldefpackage/f35;->k:[I

    .line 197
    .line 198
    aget v8, v13, v8

    .line 199
    .line 200
    xor-int/2addr v8, v10

    .line 201
    and-int v8, v8, v25

    .line 202
    .line 203
    and-int/lit8 v3, v3, 0xf

    .line 204
    .line 205
    shr-int/lit8 v10, v8, 0xc

    .line 206
    .line 207
    and-int/lit16 v10, v10, 0xff

    .line 208
    .line 209
    xor-int/2addr v3, v10

    .line 210
    and-int/lit16 v3, v3, 0xff

    .line 211
    .line 212
    shl-int/lit8 v8, v8, 0x4

    .line 213
    .line 214
    and-int v8, v8, v25

    .line 215
    .line 216
    aget v3, v13, v3

    .line 217
    .line 218
    xor-int/2addr v3, v8

    .line 219
    and-int v10, v3, v25

    .line 220
    .line 221
    add-int/lit8 v12, v12, 0x1

    .line 222
    .line 223
    const/4 v3, 0x0

    .line 224
    goto :goto_4

    .line 225
    :cond_4
    if-ne v15, v10, :cond_c

    .line 226
    .line 227
    invoke-virtual {v14, v11}, Ldefpackage/h00;->i(I)I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-eqz v2, :cond_7

    .line 232
    .line 233
    if-eq v2, v4, :cond_6

    .line 234
    .line 235
    if-ne v2, v11, :cond_5

    .line 236
    .line 237
    const/16 v12, 0x180

    .line 238
    .line 239
    :goto_5
    const/4 v2, 0x3

    .line 240
    goto :goto_6

    .line 241
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v1, "Unsupported base duration index in DTS UHD header: "

    .line 244
    .line 245
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-static {v7, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    throw v0

    .line 260
    :cond_6
    const/16 v12, 0x1e0

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_7
    const/4 v2, 0x3

    .line 264
    const/16 v12, 0x200

    .line 265
    .line 266
    :goto_6
    invoke-virtual {v14, v2}, Ldefpackage/h00;->i(I)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    add-int/2addr v3, v4

    .line 271
    mul-int/2addr v3, v12

    .line 272
    invoke-virtual {v14, v11}, Ldefpackage/h00;->i(I)I

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    if-eqz v2, :cond_a

    .line 277
    .line 278
    if-eq v2, v4, :cond_9

    .line 279
    .line 280
    if-ne v2, v11, :cond_8

    .line 281
    .line 282
    const v9, 0xbb80

    .line 283
    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 287
    .line 288
    const-string v1, "Unsupported clock rate index in DTS UHD header: "

    .line 289
    .line 290
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-static {v7, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    throw v0

    .line 305
    :cond_9
    const v9, 0xac44

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_a
    const/16 v9, 0x7d00

    .line 310
    .line 311
    :goto_7
    invoke-virtual {v14}, Ldefpackage/h00;->h()Z

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    if-eqz v2, :cond_b

    .line 316
    .line 317
    const/16 v2, 0x24

    .line 318
    .line 319
    invoke-virtual {v14, v2}, Ldefpackage/h00;->t(I)V

    .line 320
    .line 321
    .line 322
    :cond_b
    invoke-virtual {v14, v11}, Ldefpackage/h00;->i(I)I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    shl-int v2, v4, v2

    .line 327
    .line 328
    mul-int v13, v9, v2

    .line 329
    .line 330
    int-to-long v2, v3

    .line 331
    int-to-long v7, v9

    .line 332
    sget-object v37, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 333
    .line 334
    const-wide/32 v33, 0xf4240

    .line 335
    .line 336
    .line 337
    move-wide/from16 v31, v2

    .line 338
    .line 339
    move-wide/from16 v35, v7

    .line 340
    .line 341
    invoke-static/range {v31 .. v37}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 342
    .line 343
    .line 344
    move-result-wide v2

    .line 345
    move-wide v11, v2

    .line 346
    move v9, v13

    .line 347
    goto :goto_8

    .line 348
    :cond_c
    const-string v0, "CRC check failed"

    .line 349
    .line 350
    invoke-static {v7, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    throw v0

    .line 355
    :cond_d
    const-string v0, "Only supports full channel mask-based audio presentation"

    .line 356
    .line 357
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    throw v0

    .line 362
    :cond_e
    move-wide/from16 v11, v18

    .line 363
    .line 364
    const v9, -0x7fffffff

    .line 365
    .line 366
    .line 367
    :goto_8
    const/4 v2, 0x0

    .line 368
    const/4 v3, 0x0

    .line 369
    :goto_9
    if-ge v2, v6, :cond_f

    .line 370
    .line 371
    sget-object v4, Ldefpackage/e35;->j:[I

    .line 372
    .line 373
    invoke-static {v14, v4}, Ldefpackage/e35;->O(Ldefpackage/h00;[I)I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    add-int/2addr v3, v4

    .line 378
    add-int/lit8 v2, v2, 0x1

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_f
    iget-object v2, v0, Ldefpackage/jx0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 382
    .line 383
    if-eqz v6, :cond_10

    .line 384
    .line 385
    sget-object v4, Ldefpackage/e35;->k:[I

    .line 386
    .line 387
    invoke-static {v14, v4}, Ldefpackage/e35;->O(Ldefpackage/h00;[I)I

    .line 388
    .line 389
    .line 390
    move-result v4

    .line 391
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 392
    .line 393
    .line 394
    :cond_10
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_11

    .line 399
    .line 400
    sget-object v2, Ldefpackage/e35;->l:[I

    .line 401
    .line 402
    invoke-static {v14, v2}, Ldefpackage/e35;->O(Ldefpackage/h00;[I)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    goto :goto_a

    .line 407
    :cond_11
    const/4 v2, 0x0

    .line 408
    :goto_a
    add-int/2addr v3, v2

    .line 409
    add-int v10, v3, v24

    .line 410
    .line 411
    new-instance v6, Ldefpackage/g;

    .line 412
    .line 413
    const-string v7, "audio/vnd.dts.uhd;profile=p2"

    .line 414
    .line 415
    const/4 v8, 0x2

    .line 416
    invoke-direct/range {v6 .. v12}, Ldefpackage/g;-><init>(Ljava/lang/String;IIIJ)V

    .line 417
    .line 418
    .line 419
    iget v2, v0, Ldefpackage/jx0;->n:I

    .line 420
    .line 421
    const/4 v3, 0x3

    .line 422
    if-ne v2, v3, :cond_12

    .line 423
    .line 424
    invoke-virtual {v0, v6}, Ldefpackage/jx0;->g(Ldefpackage/g;)V

    .line 425
    .line 426
    .line 427
    :cond_12
    iput v10, v0, Ldefpackage/jx0;->m:I

    .line 428
    .line 429
    cmp-long v2, v11, v18

    .line 430
    .line 431
    if-nez v2, :cond_13

    .line 432
    .line 433
    const-wide/16 v6, 0x0

    .line 434
    .line 435
    goto :goto_b

    .line 436
    :cond_13
    move-wide v6, v11

    .line 437
    :goto_b
    iput-wide v6, v0, Ldefpackage/jx0;->k:J

    .line 438
    .line 439
    const/4 v2, 0x0

    .line 440
    invoke-virtual {v5, v2}, Ldefpackage/be3;->N(I)V

    .line 441
    .line 442
    .line 443
    iget-object v2, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 444
    .line 445
    iget v3, v0, Ldefpackage/jx0;->p:I

    .line 446
    .line 447
    invoke-interface {v2, v3, v5}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 448
    .line 449
    .line 450
    const/4 v2, 0x6

    .line 451
    iput v2, v0, Ldefpackage/jx0;->h:I

    .line 452
    .line 453
    goto/16 :goto_0

    .line 454
    .line 455
    :pswitch_2
    const/4 v2, 0x6

    .line 456
    iget-object v3, v5, Ldefpackage/be3;->a:[B

    .line 457
    .line 458
    invoke-virtual {v0, v1, v3, v2}, Ldefpackage/jx0;->b(Ldefpackage/be3;[BI)Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-eqz v2, :cond_0

    .line 463
    .line 464
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 465
    .line 466
    invoke-static {v2}, Ldefpackage/e35;->A([B)Ldefpackage/h00;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-virtual {v2, v6}, Ldefpackage/h00;->t(I)V

    .line 471
    .line 472
    .line 473
    sget-object v3, Ldefpackage/e35;->m:[I

    .line 474
    .line 475
    invoke-static {v2, v3}, Ldefpackage/e35;->O(Ldefpackage/h00;[I)I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    add-int/2addr v2, v4

    .line 480
    iput v2, v0, Ldefpackage/jx0;->p:I

    .line 481
    .line 482
    iget v3, v0, Ldefpackage/jx0;->i:I

    .line 483
    .line 484
    if-le v3, v2, :cond_14

    .line 485
    .line 486
    sub-int v2, v3, v2

    .line 487
    .line 488
    sub-int/2addr v3, v2

    .line 489
    iput v3, v0, Ldefpackage/jx0;->i:I

    .line 490
    .line 491
    iget v3, v1, Ldefpackage/be3;->b:I

    .line 492
    .line 493
    sub-int/2addr v3, v2

    .line 494
    invoke-virtual {v1, v3}, Ldefpackage/be3;->N(I)V

    .line 495
    .line 496
    .line 497
    :cond_14
    iput v14, v0, Ldefpackage/jx0;->h:I

    .line 498
    .line 499
    goto/16 :goto_0

    .line 500
    .line 501
    :pswitch_3
    move/from16 v27, v15

    .line 502
    .line 503
    const/16 v28, 0x8

    .line 504
    .line 505
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 506
    .line 507
    iget v3, v0, Ldefpackage/jx0;->o:I

    .line 508
    .line 509
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/jx0;->b(Ldefpackage/be3;[BI)Z

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    if-eqz v2, :cond_0

    .line 514
    .line 515
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 516
    .line 517
    invoke-static {v2}, Ldefpackage/e35;->A([B)Ldefpackage/h00;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    const/16 v3, 0x28

    .line 522
    .line 523
    invoke-virtual {v2, v3}, Ldefpackage/h00;->t(I)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2, v11}, Ldefpackage/h00;->i(I)I

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 531
    .line 532
    .line 533
    move-result v6

    .line 534
    if-nez v6, :cond_15

    .line 535
    .line 536
    const/16 v6, 0x10

    .line 537
    .line 538
    move/from16 v8, v28

    .line 539
    .line 540
    goto :goto_c

    .line 541
    :cond_15
    const/16 v6, 0x14

    .line 542
    .line 543
    const/16 v8, 0xc

    .line 544
    .line 545
    :goto_c
    invoke-virtual {v2, v8}, Ldefpackage/h00;->t(I)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v6}, Ldefpackage/h00;->i(I)I

    .line 549
    .line 550
    .line 551
    move-result v8

    .line 552
    add-int/lit8 v35, v8, 0x1

    .line 553
    .line 554
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 555
    .line 556
    .line 557
    move-result v8

    .line 558
    if-eqz v8, :cond_1a

    .line 559
    .line 560
    invoke-virtual {v2, v11}, Ldefpackage/h00;->i(I)I

    .line 561
    .line 562
    .line 563
    move-result v9

    .line 564
    const/4 v10, 0x3

    .line 565
    invoke-virtual {v2, v10}, Ldefpackage/h00;->i(I)I

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    add-int/2addr v12, v4

    .line 570
    const/16 v13, 0x200

    .line 571
    .line 572
    mul-int/2addr v12, v13

    .line 573
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 574
    .line 575
    .line 576
    move-result v13

    .line 577
    if-eqz v13, :cond_16

    .line 578
    .line 579
    const/16 v13, 0x24

    .line 580
    .line 581
    invoke-virtual {v2, v13}, Ldefpackage/h00;->t(I)V

    .line 582
    .line 583
    .line 584
    :cond_16
    invoke-virtual {v2, v10}, Ldefpackage/h00;->i(I)I

    .line 585
    .line 586
    .line 587
    move-result v13

    .line 588
    add-int/2addr v13, v4

    .line 589
    invoke-virtual {v2, v10}, Ldefpackage/h00;->i(I)I

    .line 590
    .line 591
    .line 592
    move-result v10

    .line 593
    add-int/2addr v10, v4

    .line 594
    if-ne v13, v4, :cond_19

    .line 595
    .line 596
    if-ne v10, v4, :cond_19

    .line 597
    .line 598
    add-int/2addr v3, v4

    .line 599
    invoke-virtual {v2, v3}, Ldefpackage/h00;->i(I)I

    .line 600
    .line 601
    .line 602
    move-result v10

    .line 603
    const/4 v13, 0x0

    .line 604
    :goto_d
    if-ge v13, v3, :cond_18

    .line 605
    .line 606
    shr-int v15, v10, v13

    .line 607
    .line 608
    and-int/2addr v15, v4

    .line 609
    if-ne v15, v4, :cond_17

    .line 610
    .line 611
    move/from16 v15, v28

    .line 612
    .line 613
    invoke-virtual {v2, v15}, Ldefpackage/h00;->t(I)V

    .line 614
    .line 615
    .line 616
    :cond_17
    add-int/lit8 v13, v13, 0x1

    .line 617
    .line 618
    const/16 v28, 0x8

    .line 619
    .line 620
    goto :goto_d

    .line 621
    :cond_18
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    if-eqz v3, :cond_1b

    .line 626
    .line 627
    invoke-virtual {v2, v11}, Ldefpackage/h00;->t(I)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2, v11}, Ldefpackage/h00;->i(I)I

    .line 631
    .line 632
    .line 633
    move-result v3

    .line 634
    add-int/2addr v3, v4

    .line 635
    shl-int/2addr v3, v11

    .line 636
    invoke-virtual {v2, v11}, Ldefpackage/h00;->i(I)I

    .line 637
    .line 638
    .line 639
    move-result v10

    .line 640
    add-int/2addr v10, v4

    .line 641
    const/4 v13, 0x0

    .line 642
    :goto_e
    if-ge v13, v10, :cond_1b

    .line 643
    .line 644
    invoke-virtual {v2, v3}, Ldefpackage/h00;->t(I)V

    .line 645
    .line 646
    .line 647
    add-int/lit8 v13, v13, 0x1

    .line 648
    .line 649
    goto :goto_e

    .line 650
    :cond_19
    const-string v0, "Multiple audio presentations or assets not supported"

    .line 651
    .line 652
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    throw v0

    .line 657
    :cond_1a
    const/4 v9, -0x1

    .line 658
    const/4 v12, 0x0

    .line 659
    :cond_1b
    invoke-virtual {v2, v6}, Ldefpackage/h00;->t(I)V

    .line 660
    .line 661
    .line 662
    const/16 v3, 0xc

    .line 663
    .line 664
    invoke-virtual {v2, v3}, Ldefpackage/h00;->t(I)V

    .line 665
    .line 666
    .line 667
    if-eqz v8, :cond_1f

    .line 668
    .line 669
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    if-eqz v3, :cond_1c

    .line 674
    .line 675
    move/from16 v3, v27

    .line 676
    .line 677
    invoke-virtual {v2, v3}, Ldefpackage/h00;->t(I)V

    .line 678
    .line 679
    .line 680
    :cond_1c
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    if-eqz v3, :cond_1d

    .line 685
    .line 686
    const/16 v3, 0x18

    .line 687
    .line 688
    invoke-virtual {v2, v3}, Ldefpackage/h00;->t(I)V

    .line 689
    .line 690
    .line 691
    :cond_1d
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 692
    .line 693
    .line 694
    move-result v3

    .line 695
    if-eqz v3, :cond_1e

    .line 696
    .line 697
    const/16 v3, 0xa

    .line 698
    .line 699
    invoke-virtual {v2, v3}, Ldefpackage/h00;->i(I)I

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    add-int/2addr v3, v4

    .line 704
    invoke-virtual {v2, v3}, Ldefpackage/h00;->u(I)V

    .line 705
    .line 706
    .line 707
    :cond_1e
    invoke-virtual {v2, v14}, Ldefpackage/h00;->t(I)V

    .line 708
    .line 709
    .line 710
    sget-object v3, Ldefpackage/e35;->h:[I

    .line 711
    .line 712
    const/4 v6, 0x4

    .line 713
    invoke-virtual {v2, v6}, Ldefpackage/h00;->i(I)I

    .line 714
    .line 715
    .line 716
    move-result v6

    .line 717
    aget v13, v3, v6

    .line 718
    .line 719
    const/16 v15, 0x8

    .line 720
    .line 721
    invoke-virtual {v2, v15}, Ldefpackage/h00;->i(I)I

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    add-int/lit8 v15, v2, 0x1

    .line 726
    .line 727
    move/from16 v34, v13

    .line 728
    .line 729
    move/from16 v33, v15

    .line 730
    .line 731
    goto :goto_f

    .line 732
    :cond_1f
    const/16 v33, -0x1

    .line 733
    .line 734
    const v34, -0x7fffffff

    .line 735
    .line 736
    .line 737
    :goto_f
    if-eqz v8, :cond_23

    .line 738
    .line 739
    if-eqz v9, :cond_22

    .line 740
    .line 741
    if-eq v9, v4, :cond_21

    .line 742
    .line 743
    if-ne v9, v11, :cond_20

    .line 744
    .line 745
    const v9, 0xbb80

    .line 746
    .line 747
    .line 748
    goto :goto_10

    .line 749
    :cond_20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 750
    .line 751
    const-string v1, "Unsupported reference clock code in DTS HD header: "

    .line 752
    .line 753
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {v7, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    throw v0

    .line 768
    :cond_21
    const v9, 0xac44

    .line 769
    .line 770
    .line 771
    goto :goto_10

    .line 772
    :cond_22
    const/16 v9, 0x7d00

    .line 773
    .line 774
    :goto_10
    int-to-long v2, v12

    .line 775
    int-to-long v6, v9

    .line 776
    sget-object v4, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 777
    .line 778
    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 779
    .line 780
    const-wide/32 v22, 0xf4240

    .line 781
    .line 782
    .line 783
    move-wide/from16 v20, v2

    .line 784
    .line 785
    move-wide/from16 v24, v6

    .line 786
    .line 787
    invoke-static/range {v20 .. v26}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 788
    .line 789
    .line 790
    move-result-wide v2

    .line 791
    move-wide/from16 v36, v2

    .line 792
    .line 793
    goto :goto_11

    .line 794
    :cond_23
    move-wide/from16 v36, v18

    .line 795
    .line 796
    :goto_11
    new-instance v31, Ldefpackage/g;

    .line 797
    .line 798
    const-string v32, "audio/vnd.dts.hd;profile=lbr"

    .line 799
    .line 800
    invoke-direct/range {v31 .. v37}, Ldefpackage/g;-><init>(Ljava/lang/String;IIIJ)V

    .line 801
    .line 802
    .line 803
    move-object/from16 v2, v31

    .line 804
    .line 805
    move/from16 v8, v35

    .line 806
    .line 807
    invoke-virtual {v0, v2}, Ldefpackage/jx0;->g(Ldefpackage/g;)V

    .line 808
    .line 809
    .line 810
    iput v8, v0, Ldefpackage/jx0;->m:I

    .line 811
    .line 812
    cmp-long v2, v36, v18

    .line 813
    .line 814
    if-nez v2, :cond_24

    .line 815
    .line 816
    const-wide/16 v6, 0x0

    .line 817
    .line 818
    goto :goto_12

    .line 819
    :cond_24
    move-wide/from16 v6, v36

    .line 820
    .line 821
    :goto_12
    iput-wide v6, v0, Ldefpackage/jx0;->k:J

    .line 822
    .line 823
    const/4 v2, 0x0

    .line 824
    invoke-virtual {v5, v2}, Ldefpackage/be3;->N(I)V

    .line 825
    .line 826
    .line 827
    iget-object v2, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 828
    .line 829
    iget v3, v0, Ldefpackage/jx0;->o:I

    .line 830
    .line 831
    invoke-interface {v2, v3, v5}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 832
    .line 833
    .line 834
    const/4 v2, 0x6

    .line 835
    iput v2, v0, Ldefpackage/jx0;->h:I

    .line 836
    .line 837
    goto/16 :goto_0

    .line 838
    .line 839
    :pswitch_4
    const/16 v3, 0xc

    .line 840
    .line 841
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 842
    .line 843
    const/4 v6, 0x7

    .line 844
    invoke-virtual {v0, v1, v2, v6}, Ldefpackage/jx0;->b(Ldefpackage/be3;[BI)Z

    .line 845
    .line 846
    .line 847
    move-result v2

    .line 848
    if-eqz v2, :cond_0

    .line 849
    .line 850
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 851
    .line 852
    invoke-static {v2}, Ldefpackage/e35;->A([B)Ldefpackage/h00;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    const/16 v5, 0x2a

    .line 857
    .line 858
    invoke-virtual {v2, v5}, Ldefpackage/h00;->t(I)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2}, Ldefpackage/h00;->h()Z

    .line 862
    .line 863
    .line 864
    move-result v5

    .line 865
    if-eqz v5, :cond_25

    .line 866
    .line 867
    move v5, v3

    .line 868
    goto :goto_13

    .line 869
    :cond_25
    const/16 v5, 0x8

    .line 870
    .line 871
    :goto_13
    invoke-virtual {v2, v5}, Ldefpackage/h00;->i(I)I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    add-int/2addr v2, v4

    .line 876
    iput v2, v0, Ldefpackage/jx0;->o:I

    .line 877
    .line 878
    const/4 v2, 0x3

    .line 879
    iput v2, v0, Ldefpackage/jx0;->h:I

    .line 880
    .line 881
    goto/16 :goto_0

    .line 882
    .line 883
    :pswitch_5
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 884
    .line 885
    const/16 v3, 0x12

    .line 886
    .line 887
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/jx0;->b(Ldefpackage/be3;[BI)Z

    .line 888
    .line 889
    .line 890
    move-result v2

    .line 891
    if-eqz v2, :cond_0

    .line 892
    .line 893
    iget-object v2, v5, Ldefpackage/be3;->a:[B

    .line 894
    .line 895
    iget-object v8, v0, Ldefpackage/jx0;->l:Ldefpackage/tb1;

    .line 896
    .line 897
    const/16 v9, 0x3c

    .line 898
    .line 899
    if-nez v8, :cond_28

    .line 900
    .line 901
    iget-object v8, v0, Ldefpackage/jx0;->f:Ljava/lang/String;

    .line 902
    .line 903
    invoke-static {v2}, Ldefpackage/e35;->A([B)Ldefpackage/h00;

    .line 904
    .line 905
    .line 906
    move-result-object v10

    .line 907
    invoke-virtual {v10, v9}, Ldefpackage/h00;->t(I)V

    .line 908
    .line 909
    .line 910
    const/4 v12, 0x6

    .line 911
    invoke-virtual {v10, v12}, Ldefpackage/h00;->i(I)I

    .line 912
    .line 913
    .line 914
    move-result v13

    .line 915
    sget-object v12, Ldefpackage/e35;->e:[I

    .line 916
    .line 917
    aget v12, v12, v13

    .line 918
    .line 919
    const/4 v13, 0x4

    .line 920
    invoke-virtual {v10, v13}, Ldefpackage/h00;->i(I)I

    .line 921
    .line 922
    .line 923
    move-result v15

    .line 924
    sget-object v13, Ldefpackage/e35;->f:[I

    .line 925
    .line 926
    aget v13, v13, v15

    .line 927
    .line 928
    invoke-virtual {v10, v14}, Ldefpackage/h00;->i(I)I

    .line 929
    .line 930
    .line 931
    move-result v15

    .line 932
    sget-object v16, Ldefpackage/e35;->g:[I

    .line 933
    .line 934
    move/from16 v17, v6

    .line 935
    .line 936
    const/16 v6, 0x1d

    .line 937
    .line 938
    if-lt v15, v6, :cond_26

    .line 939
    .line 940
    const/4 v6, -0x1

    .line 941
    :goto_14
    const/16 v15, 0xa

    .line 942
    .line 943
    goto :goto_15

    .line 944
    :cond_26
    aget v6, v16, v15

    .line 945
    .line 946
    mul-int/lit16 v6, v6, 0x3e8

    .line 947
    .line 948
    div-int/2addr v6, v11

    .line 949
    goto :goto_14

    .line 950
    :goto_15
    invoke-virtual {v10, v15}, Ldefpackage/h00;->t(I)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v10, v11}, Ldefpackage/h00;->i(I)I

    .line 954
    .line 955
    .line 956
    move-result v10

    .line 957
    if-lez v10, :cond_27

    .line 958
    .line 959
    move v10, v4

    .line 960
    goto :goto_16

    .line 961
    :cond_27
    const/4 v10, 0x0

    .line 962
    :goto_16
    add-int/2addr v12, v10

    .line 963
    new-instance v10, Ldefpackage/sb1;

    .line 964
    .line 965
    invoke-direct {v10}, Ldefpackage/sb1;-><init>()V

    .line 966
    .line 967
    .line 968
    iput-object v8, v10, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 969
    .line 970
    iget-object v8, v0, Ldefpackage/jx0;->e:Ljava/lang/String;

    .line 971
    .line 972
    invoke-static {v8}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v8

    .line 976
    iput-object v8, v10, Ldefpackage/sb1;->l:Ljava/lang/String;

    .line 977
    .line 978
    const-string v8, "audio/vnd.dts"

    .line 979
    .line 980
    invoke-static {v8}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v8

    .line 984
    iput-object v8, v10, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 985
    .line 986
    iput v6, v10, Ldefpackage/sb1;->h:I

    .line 987
    .line 988
    iput v12, v10, Ldefpackage/sb1;->E:I

    .line 989
    .line 990
    iput v13, v10, Ldefpackage/sb1;->F:I

    .line 991
    .line 992
    iput-object v7, v10, Ldefpackage/sb1;->q:Ldefpackage/ow0;

    .line 993
    .line 994
    iget-object v6, v0, Ldefpackage/jx0;->c:Ljava/lang/String;

    .line 995
    .line 996
    iput-object v6, v10, Ldefpackage/sb1;->d:Ljava/lang/String;

    .line 997
    .line 998
    iget v6, v0, Ldefpackage/jx0;->d:I

    .line 999
    .line 1000
    iput v6, v10, Ldefpackage/sb1;->f:I

    .line 1001
    .line 1002
    new-instance v6, Ldefpackage/tb1;

    .line 1003
    .line 1004
    invoke-direct {v6, v10}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 1005
    .line 1006
    .line 1007
    iput-object v6, v0, Ldefpackage/jx0;->l:Ldefpackage/tb1;

    .line 1008
    .line 1009
    iget-object v7, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 1010
    .line 1011
    invoke-interface {v7, v6}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_17

    .line 1015
    :cond_28
    move/from16 v17, v6

    .line 1016
    .line 1017
    :goto_17
    invoke-static {v2}, Ldefpackage/e35;->y([B)I

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    iput v6, v0, Ldefpackage/jx0;->m:I

    .line 1022
    .line 1023
    const/16 v30, 0x0

    .line 1024
    .line 1025
    aget-byte v6, v2, v30

    .line 1026
    .line 1027
    const/4 v7, -0x2

    .line 1028
    if-eq v6, v7, :cond_2b

    .line 1029
    .line 1030
    const/4 v7, -0x1

    .line 1031
    if-eq v6, v7, :cond_2a

    .line 1032
    .line 1033
    const/16 v7, 0x1f

    .line 1034
    .line 1035
    if-eq v6, v7, :cond_29

    .line 1036
    .line 1037
    const/16 v27, 0x4

    .line 1038
    .line 1039
    aget-byte v6, v2, v27

    .line 1040
    .line 1041
    and-int/2addr v6, v4

    .line 1042
    const/16 v29, 0x6

    .line 1043
    .line 1044
    shl-int/lit8 v6, v6, 0x6

    .line 1045
    .line 1046
    aget-byte v2, v2, v14

    .line 1047
    .line 1048
    :goto_18
    and-int/lit16 v2, v2, 0xfc

    .line 1049
    .line 1050
    :goto_19
    shr-int/2addr v2, v11

    .line 1051
    or-int/2addr v2, v6

    .line 1052
    goto :goto_1b

    .line 1053
    :cond_29
    const/16 v27, 0x4

    .line 1054
    .line 1055
    const/16 v29, 0x6

    .line 1056
    .line 1057
    aget-byte v6, v2, v14

    .line 1058
    .line 1059
    const/16 v25, 0x7

    .line 1060
    .line 1061
    and-int/lit8 v6, v6, 0x7

    .line 1062
    .line 1063
    shl-int/lit8 v6, v6, 0x4

    .line 1064
    .line 1065
    aget-byte v2, v2, v29

    .line 1066
    .line 1067
    :goto_1a
    and-int/2addr v2, v9

    .line 1068
    goto :goto_19

    .line 1069
    :cond_2a
    const/16 v25, 0x7

    .line 1070
    .line 1071
    const/16 v27, 0x4

    .line 1072
    .line 1073
    aget-byte v6, v2, v27

    .line 1074
    .line 1075
    and-int/lit8 v6, v6, 0x7

    .line 1076
    .line 1077
    shl-int/lit8 v6, v6, 0x4

    .line 1078
    .line 1079
    aget-byte v2, v2, v25

    .line 1080
    .line 1081
    goto :goto_1a

    .line 1082
    :cond_2b
    const/16 v27, 0x4

    .line 1083
    .line 1084
    aget-byte v6, v2, v14

    .line 1085
    .line 1086
    and-int/2addr v6, v4

    .line 1087
    const/16 v29, 0x6

    .line 1088
    .line 1089
    shl-int/lit8 v6, v6, 0x6

    .line 1090
    .line 1091
    aget-byte v2, v2, v27

    .line 1092
    .line 1093
    goto :goto_18

    .line 1094
    :goto_1b
    add-int/2addr v2, v4

    .line 1095
    mul-int/lit8 v2, v2, 0x20

    .line 1096
    .line 1097
    int-to-long v6, v2

    .line 1098
    iget-object v2, v0, Ldefpackage/jx0;->l:Ldefpackage/tb1;

    .line 1099
    .line 1100
    iget v2, v2, Ldefpackage/tb1;->G:I

    .line 1101
    .line 1102
    invoke-static {v2, v6, v7}, Ldefpackage/f35;->Y(IJ)J

    .line 1103
    .line 1104
    .line 1105
    move-result-wide v6

    .line 1106
    invoke-static {v6, v7}, Ldefpackage/jz4;->m(J)I

    .line 1107
    .line 1108
    .line 1109
    move-result v2

    .line 1110
    int-to-long v6, v2

    .line 1111
    iput-wide v6, v0, Ldefpackage/jx0;->k:J

    .line 1112
    .line 1113
    const/4 v2, 0x0

    .line 1114
    invoke-virtual {v5, v2}, Ldefpackage/be3;->N(I)V

    .line 1115
    .line 1116
    .line 1117
    iget-object v2, v0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 1118
    .line 1119
    invoke-interface {v2, v3, v5}, Ldefpackage/wv4;->e(ILdefpackage/be3;)V

    .line 1120
    .line 1121
    .line 1122
    const/4 v2, 0x6

    .line 1123
    iput v2, v0, Ldefpackage/jx0;->h:I

    .line 1124
    .line 1125
    goto/16 :goto_0

    .line 1126
    .line 1127
    :cond_2c
    :pswitch_6
    invoke-virtual {v1}, Ldefpackage/be3;->a()I

    .line 1128
    .line 1129
    .line 1130
    move-result v2

    .line 1131
    if-lez v2, :cond_0

    .line 1132
    .line 1133
    iget v2, v0, Ldefpackage/jx0;->j:I

    .line 1134
    .line 1135
    const/16 v28, 0x8

    .line 1136
    .line 1137
    shl-int/lit8 v2, v2, 0x8

    .line 1138
    .line 1139
    iput v2, v0, Ldefpackage/jx0;->j:I

    .line 1140
    .line 1141
    invoke-virtual {v1}, Ldefpackage/be3;->A()I

    .line 1142
    .line 1143
    .line 1144
    move-result v3

    .line 1145
    or-int/2addr v2, v3

    .line 1146
    iput v2, v0, Ldefpackage/jx0;->j:I

    .line 1147
    .line 1148
    invoke-static {v2}, Ldefpackage/e35;->z(I)I

    .line 1149
    .line 1150
    .line 1151
    move-result v2

    .line 1152
    iput v2, v0, Ldefpackage/jx0;->n:I

    .line 1153
    .line 1154
    if-eqz v2, :cond_2c

    .line 1155
    .line 1156
    iget-object v3, v5, Ldefpackage/be3;->a:[B

    .line 1157
    .line 1158
    iget v5, v0, Ldefpackage/jx0;->j:I

    .line 1159
    .line 1160
    shr-int/lit8 v6, v5, 0x18

    .line 1161
    .line 1162
    and-int/lit16 v6, v6, 0xff

    .line 1163
    .line 1164
    int-to-byte v6, v6

    .line 1165
    const/16 v30, 0x0

    .line 1166
    .line 1167
    aput-byte v6, v3, v30

    .line 1168
    .line 1169
    shr-int/lit8 v6, v5, 0x10

    .line 1170
    .line 1171
    and-int/lit16 v6, v6, 0xff

    .line 1172
    .line 1173
    int-to-byte v6, v6

    .line 1174
    aput-byte v6, v3, v4

    .line 1175
    .line 1176
    shr-int/lit8 v6, v5, 0x8

    .line 1177
    .line 1178
    and-int/lit16 v6, v6, 0xff

    .line 1179
    .line 1180
    int-to-byte v6, v6

    .line 1181
    aput-byte v6, v3, v11

    .line 1182
    .line 1183
    and-int/lit16 v5, v5, 0xff

    .line 1184
    .line 1185
    int-to-byte v5, v5

    .line 1186
    const/4 v10, 0x3

    .line 1187
    aput-byte v5, v3, v10

    .line 1188
    .line 1189
    const/4 v3, 0x4

    .line 1190
    iput v3, v0, Ldefpackage/jx0;->i:I

    .line 1191
    .line 1192
    const/4 v6, 0x0

    .line 1193
    iput v6, v0, Ldefpackage/jx0;->j:I

    .line 1194
    .line 1195
    if-eq v2, v10, :cond_2f

    .line 1196
    .line 1197
    if-ne v2, v3, :cond_2d

    .line 1198
    .line 1199
    goto :goto_1c

    .line 1200
    :cond_2d
    if-ne v2, v4, :cond_2e

    .line 1201
    .line 1202
    iput v4, v0, Ldefpackage/jx0;->h:I

    .line 1203
    .line 1204
    goto/16 :goto_0

    .line 1205
    .line 1206
    :cond_2e
    iput v11, v0, Ldefpackage/jx0;->h:I

    .line 1207
    .line 1208
    goto/16 :goto_0

    .line 1209
    .line 1210
    :cond_2f
    :goto_1c
    iput v3, v0, Ldefpackage/jx0;->h:I

    .line 1211
    .line 1212
    goto/16 :goto_0

    .line 1213
    .line 1214
    :cond_30
    return-void

    .line 1215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ldefpackage/be3;[BI)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ldefpackage/be3;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ldefpackage/jx0;->i:I

    .line 6
    .line 7
    sub-int v1, p3, v1

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Ldefpackage/jx0;->i:I

    .line 14
    .line 15
    invoke-virtual {p1, p2, v1, v0}, Ldefpackage/be3;->k([BII)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Ldefpackage/jx0;->i:I

    .line 19
    .line 20
    add-int/2addr p1, v0

    .line 21
    iput p1, p0, Ldefpackage/jx0;->i:I

    .line 22
    .line 23
    if-ne p1, p3, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/jx0;->h:I

    .line 3
    .line 4
    iput v0, p0, Ldefpackage/jx0;->i:I

    .line 5
    .line 6
    iput v0, p0, Ldefpackage/jx0;->j:I

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Ldefpackage/jx0;->q:J

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/jx0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Ldefpackage/jx0;->q:J

    .line 2
    .line 3
    return-void
.end method

.method public final f(Ldefpackage/m51;Ldefpackage/sy4;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ldefpackage/sy4;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ldefpackage/sy4;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Ldefpackage/sy4;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/jx0;->f:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Ldefpackage/sy4;->b()V

    .line 12
    .line 13
    .line 14
    iget p2, p2, Ldefpackage/sy4;->d:I

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-interface {p1, p2, v0}, Ldefpackage/m51;->t(II)Ldefpackage/wv4;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 22
    .line 23
    return-void
.end method

.method public final g(Ldefpackage/g;)V
    .locals 4

    .line 1
    iget v0, p1, Ldefpackage/g;->b:I

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/g;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget p1, p1, Ldefpackage/g;->c:I

    .line 6
    .line 7
    const v2, -0x7fffffff

    .line 8
    .line 9
    .line 10
    if-eq v0, v2, :cond_3

    .line 11
    .line 12
    const/4 v2, -0x1

    .line 13
    if-ne p1, v2, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v2, p0, Ldefpackage/jx0;->l:Ldefpackage/tb1;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget v3, v2, Ldefpackage/tb1;->F:I

    .line 21
    .line 22
    if-ne p1, v3, :cond_1

    .line 23
    .line 24
    iget v3, v2, Ldefpackage/tb1;->G:I

    .line 25
    .line 26
    if-ne v0, v3, :cond_1

    .line 27
    .line 28
    iget-object v2, v2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-object v2, p0, Ldefpackage/jx0;->l:Ldefpackage/tb1;

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    new-instance v2, Ldefpackage/sb1;

    .line 41
    .line 42
    invoke-direct {v2}, Ldefpackage/sb1;-><init>()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v2}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :goto_0
    iget-object v3, p0, Ldefpackage/jx0;->f:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v3, v2, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v3, p0, Ldefpackage/jx0;->e:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v3}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, v2, Ldefpackage/sb1;->l:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v1}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, v2, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 67
    .line 68
    iput p1, v2, Ldefpackage/sb1;->E:I

    .line 69
    .line 70
    iput v0, v2, Ldefpackage/sb1;->F:I

    .line 71
    .line 72
    iget-object p1, p0, Ldefpackage/jx0;->c:Ljava/lang/String;

    .line 73
    .line 74
    iput-object p1, v2, Ldefpackage/sb1;->d:Ljava/lang/String;

    .line 75
    .line 76
    iget p1, p0, Ldefpackage/jx0;->d:I

    .line 77
    .line 78
    iput p1, v2, Ldefpackage/sb1;->f:I

    .line 79
    .line 80
    new-instance p1, Ldefpackage/tb1;

    .line 81
    .line 82
    invoke-direct {p1, v2}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Ldefpackage/jx0;->l:Ldefpackage/tb1;

    .line 86
    .line 87
    iget-object p0, p0, Ldefpackage/jx0;->g:Ldefpackage/wv4;

    .line 88
    .line 89
    invoke-interface {p0, p1}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_1
    return-void
.end method
