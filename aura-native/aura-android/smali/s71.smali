.class public final Ls71;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public final a:[B

.field public final b:Lbe3;

.field public final c:Z

.field public final d:Lt71;

.field public e:Lm51;

.field public f:Lwv4;

.field public g:I

.field public h:Lqv2;

.field public i:Lv71;

.field public j:I

.field public k:I

.field public l:Lr71;

.field public m:I

.field public n:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x2a

    .line 5
    .line 6
    new-array v0, v0, [B

    .line 7
    .line 8
    iput-object v0, p0, Ls71;->a:[B

    .line 9
    .line 10
    new-instance v0, Lbe3;

    .line 11
    .line 12
    const v1, 0x8000

    .line 13
    .line 14
    .line 15
    new-array v1, v1, [B

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v0, v2, v1}, Lbe3;-><init>(I[B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ls71;->b:Lbe3;

    .line 22
    .line 23
    iput-boolean v2, p0, Ls71;->c:Z

    .line 24
    .line 25
    new-instance v0, Lt71;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Ls71;->d:Lt71;

    .line 31
    .line 32
    iput v2, p0, Ls71;->g:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ls71;->g:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v2, :cond_29

    .line 11
    .line 12
    iget-object v6, v0, Ls71;->a:[B

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    if-eq v2, v4, :cond_28

    .line 16
    .line 17
    const/4 v8, 0x4

    .line 18
    const/4 v9, 0x3

    .line 19
    if-eq v2, v7, :cond_26

    .line 20
    .line 21
    const/4 v10, 0x7

    .line 22
    const/4 v11, 0x6

    .line 23
    if-eq v2, v9, :cond_1d

    .line 24
    .line 25
    const-wide/16 v12, 0x0

    .line 26
    .line 27
    const-wide/16 v14, -0x1

    .line 28
    .line 29
    const/4 v6, 0x5

    .line 30
    if-eq v2, v8, :cond_17

    .line 31
    .line 32
    if-ne v2, v6, :cond_16

    .line 33
    .line 34
    iget-object v2, v0, Ls71;->f:Lwv4;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v2, v0, Ls71;->i:Lv71;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v2, v0, Ls71;->l:Lr71;

    .line 45
    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    iget-object v6, v2, Lr71;->c:Lms;

    .line 49
    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    move-object/from16 v6, p2

    .line 53
    .line 54
    invoke-virtual {v2, v1, v6}, Lr71;->b(Ll51;Lt71;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    return v0

    .line 59
    :cond_0
    iget-wide v8, v0, Ls71;->n:J

    .line 60
    .line 61
    cmp-long v2, v8, v14

    .line 62
    .line 63
    const/4 v6, -0x1

    .line 64
    if-nez v2, :cond_8

    .line 65
    .line 66
    iget-object v2, v0, Ls71;->i:Lv71;

    .line 67
    .line 68
    invoke-interface {v1}, Ll51;->k()V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1, v4}, Ll51;->g(I)V

    .line 72
    .line 73
    .line 74
    new-array v8, v4, [B

    .line 75
    .line 76
    invoke-interface {v1, v8, v5, v4}, Ll51;->n([BII)V

    .line 77
    .line 78
    .line 79
    aget-byte v8, v8, v5

    .line 80
    .line 81
    and-int/2addr v8, v4

    .line 82
    if-ne v8, v4, :cond_1

    .line 83
    .line 84
    move v8, v4

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    move v8, v5

    .line 87
    :goto_0
    invoke-interface {v1, v7}, Ll51;->g(I)V

    .line 88
    .line 89
    .line 90
    if-eqz v8, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    move v10, v11

    .line 94
    :goto_1
    new-instance v7, Lbe3;

    .line 95
    .line 96
    invoke-direct {v7, v10}, Lbe3;-><init>(I)V

    .line 97
    .line 98
    .line 99
    iget-object v9, v7, Lbe3;->a:[B

    .line 100
    .line 101
    move v11, v5

    .line 102
    :goto_2
    if-ge v11, v10, :cond_4

    .line 103
    .line 104
    sub-int v14, v10, v11

    .line 105
    .line 106
    invoke-interface {v1, v9, v11, v14}, Ll51;->i([BII)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    if-ne v14, v6, :cond_3

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    add-int/2addr v11, v14

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    :goto_3
    invoke-virtual {v7, v11}, Lbe3;->M(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v1}, Ll51;->k()V

    .line 119
    .line 120
    .line 121
    :try_start_0
    invoke-virtual {v7}, Lbe3;->I()J

    .line 122
    .line 123
    .line 124
    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 125
    if-eqz v8, :cond_5

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_5
    iget v1, v2, Lv71;->b:I

    .line 129
    .line 130
    int-to-long v8, v1

    .line 131
    mul-long/2addr v6, v8

    .line 132
    :goto_4
    iget-wide v1, v2, Lv71;->j:J

    .line 133
    .line 134
    cmp-long v8, v1, v12

    .line 135
    .line 136
    if-eqz v8, :cond_6

    .line 137
    .line 138
    cmp-long v1, v6, v1

    .line 139
    .line 140
    if-lez v1, :cond_6

    .line 141
    .line 142
    :catch_0
    move v4, v5

    .line 143
    goto :goto_5

    .line 144
    :cond_6
    move-wide v12, v6

    .line 145
    :goto_5
    if-eqz v4, :cond_7

    .line 146
    .line 147
    iput-wide v12, v0, Ls71;->n:J

    .line 148
    .line 149
    goto/16 :goto_d

    .line 150
    .line 151
    :cond_7
    invoke-static {v3, v3}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    throw v0

    .line 156
    :cond_8
    iget-object v2, v0, Ls71;->b:Lbe3;

    .line 157
    .line 158
    iget v3, v2, Lbe3;->c:I

    .line 159
    .line 160
    const-wide/32 v7, 0xf4240

    .line 161
    .line 162
    .line 163
    const v9, 0x8000

    .line 164
    .line 165
    .line 166
    if-ge v3, v9, :cond_b

    .line 167
    .line 168
    iget-object v10, v2, Lbe3;->a:[B

    .line 169
    .line 170
    sub-int/2addr v9, v3

    .line 171
    invoke-interface {v1, v10, v3, v9}, Lwh0;->read([BII)I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    if-ne v1, v6, :cond_9

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    move v4, v5

    .line 179
    :goto_6
    if-nez v4, :cond_a

    .line 180
    .line 181
    add-int/2addr v3, v1

    .line 182
    invoke-virtual {v2, v3}, Lbe3;->M(I)V

    .line 183
    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_a
    invoke-virtual {v2}, Lbe3;->a()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-nez v1, :cond_c

    .line 191
    .line 192
    iget-wide v1, v0, Ls71;->n:J

    .line 193
    .line 194
    mul-long/2addr v1, v7

    .line 195
    iget-object v3, v0, Ls71;->i:Lv71;

    .line 196
    .line 197
    sget-object v4, Lf35;->a:Ljava/lang/String;

    .line 198
    .line 199
    iget v3, v3, Lv71;->e:I

    .line 200
    .line 201
    int-to-long v3, v3

    .line 202
    div-long v8, v1, v3

    .line 203
    .line 204
    iget-object v7, v0, Ls71;->f:Lwv4;

    .line 205
    .line 206
    iget v11, v0, Ls71;->m:I

    .line 207
    .line 208
    const/4 v12, 0x0

    .line 209
    const/4 v13, 0x0

    .line 210
    const/4 v10, 0x1

    .line 211
    invoke-interface/range {v7 .. v13}, Lwv4;->a(JIIILvv4;)V

    .line 212
    .line 213
    .line 214
    return v6

    .line 215
    :cond_b
    move v4, v5

    .line 216
    :cond_c
    :goto_7
    iget v1, v2, Lbe3;->b:I

    .line 217
    .line 218
    iget v3, v0, Ls71;->m:I

    .line 219
    .line 220
    iget v6, v0, Ls71;->j:I

    .line 221
    .line 222
    if-ge v3, v6, :cond_d

    .line 223
    .line 224
    sub-int/2addr v6, v3

    .line 225
    invoke-virtual {v2}, Lbe3;->a()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-static {v6, v3}, Ljava/lang/Math;->min(II)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-virtual {v2, v3}, Lbe3;->O(I)V

    .line 234
    .line 235
    .line 236
    :cond_d
    iget-object v3, v0, Ls71;->i:Lv71;

    .line 237
    .line 238
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget v3, v2, Lbe3;->b:I

    .line 242
    .line 243
    :goto_8
    iget v6, v2, Lbe3;->c:I

    .line 244
    .line 245
    const/16 v9, 0x10

    .line 246
    .line 247
    sub-int/2addr v6, v9

    .line 248
    iget-object v10, v0, Ls71;->d:Lt71;

    .line 249
    .line 250
    if-gt v3, v6, :cond_f

    .line 251
    .line 252
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v0, Ls71;->i:Lv71;

    .line 256
    .line 257
    iget v11, v0, Ls71;->k:I

    .line 258
    .line 259
    invoke-static {v2, v6, v11, v10}, Lrr2;->h(Lbe3;Lv71;ILt71;)Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-eqz v6, :cond_e

    .line 264
    .line 265
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 266
    .line 267
    .line 268
    iget-wide v3, v10, Lt71;->a:J

    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_f
    if-eqz v4, :cond_13

    .line 275
    .line 276
    :goto_9
    iget v4, v2, Lbe3;->c:I

    .line 277
    .line 278
    iget v6, v0, Ls71;->j:I

    .line 279
    .line 280
    sub-int v6, v4, v6

    .line 281
    .line 282
    if-gt v3, v6, :cond_12

    .line 283
    .line 284
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 285
    .line 286
    .line 287
    :try_start_1
    iget-object v4, v0, Ls71;->i:Lv71;

    .line 288
    .line 289
    iget v6, v0, Ls71;->k:I

    .line 290
    .line 291
    invoke-static {v2, v4, v6, v10}, Lrr2;->h(Lbe3;Lv71;ILt71;)Z

    .line 292
    .line 293
    .line 294
    move-result v4
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 295
    goto :goto_a

    .line 296
    :catch_1
    move v4, v5

    .line 297
    :goto_a
    iget v6, v2, Lbe3;->b:I

    .line 298
    .line 299
    iget v11, v2, Lbe3;->c:I

    .line 300
    .line 301
    if-le v6, v11, :cond_10

    .line 302
    .line 303
    move v4, v5

    .line 304
    :cond_10
    if-eqz v4, :cond_11

    .line 305
    .line 306
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 307
    .line 308
    .line 309
    iget-wide v3, v10, Lt71;->a:J

    .line 310
    .line 311
    goto :goto_c

    .line 312
    :cond_11
    add-int/lit8 v3, v3, 0x1

    .line 313
    .line 314
    goto :goto_9

    .line 315
    :cond_12
    invoke-virtual {v2, v4}, Lbe3;->N(I)V

    .line 316
    .line 317
    .line 318
    goto :goto_b

    .line 319
    :cond_13
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 320
    .line 321
    .line 322
    :goto_b
    move-wide v3, v14

    .line 323
    :goto_c
    iget v6, v2, Lbe3;->b:I

    .line 324
    .line 325
    sub-int/2addr v6, v1

    .line 326
    invoke-virtual {v2, v1}, Lbe3;->N(I)V

    .line 327
    .line 328
    .line 329
    iget-object v1, v0, Ls71;->f:Lwv4;

    .line 330
    .line 331
    invoke-interface {v1, v6, v2}, Lwv4;->e(ILbe3;)V

    .line 332
    .line 333
    .line 334
    iget v1, v0, Ls71;->m:I

    .line 335
    .line 336
    add-int/2addr v1, v6

    .line 337
    iput v1, v0, Ls71;->m:I

    .line 338
    .line 339
    cmp-long v6, v3, v14

    .line 340
    .line 341
    if-eqz v6, :cond_14

    .line 342
    .line 343
    iget-wide v10, v0, Ls71;->n:J

    .line 344
    .line 345
    mul-long/2addr v10, v7

    .line 346
    iget-object v6, v0, Ls71;->i:Lv71;

    .line 347
    .line 348
    sget-object v7, Lf35;->a:Ljava/lang/String;

    .line 349
    .line 350
    iget v6, v6, Lv71;->e:I

    .line 351
    .line 352
    int-to-long v6, v6

    .line 353
    div-long v17, v10, v6

    .line 354
    .line 355
    iget-object v6, v0, Ls71;->f:Lwv4;

    .line 356
    .line 357
    const/16 v21, 0x0

    .line 358
    .line 359
    const/16 v22, 0x0

    .line 360
    .line 361
    const/16 v19, 0x1

    .line 362
    .line 363
    move/from16 v20, v1

    .line 364
    .line 365
    move-object/from16 v16, v6

    .line 366
    .line 367
    invoke-interface/range {v16 .. v22}, Lwv4;->a(JIIILvv4;)V

    .line 368
    .line 369
    .line 370
    iput v5, v0, Ls71;->m:I

    .line 371
    .line 372
    iput-wide v3, v0, Ls71;->n:J

    .line 373
    .line 374
    :cond_14
    iget-object v0, v2, Lbe3;->a:[B

    .line 375
    .line 376
    array-length v0, v0

    .line 377
    iget v1, v2, Lbe3;->c:I

    .line 378
    .line 379
    sub-int/2addr v0, v1

    .line 380
    invoke-virtual {v2}, Lbe3;->a()I

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    if-ge v1, v9, :cond_15

    .line 385
    .line 386
    if-ge v0, v9, :cond_15

    .line 387
    .line 388
    invoke-virtual {v2}, Lbe3;->a()I

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    iget-object v1, v2, Lbe3;->a:[B

    .line 393
    .line 394
    iget v3, v2, Lbe3;->b:I

    .line 395
    .line 396
    invoke-static {v1, v3, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2, v5}, Lbe3;->N(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v0}, Lbe3;->M(I)V

    .line 403
    .line 404
    .line 405
    :cond_15
    :goto_d
    return v5

    .line 406
    :cond_16
    invoke-static {}, Ltb4;->a()V

    .line 407
    .line 408
    .line 409
    return v5

    .line 410
    :cond_17
    invoke-interface {v1}, Ll51;->k()V

    .line 411
    .line 412
    .line 413
    new-instance v2, Lbe3;

    .line 414
    .line 415
    invoke-direct {v2, v7}, Lbe3;-><init>(I)V

    .line 416
    .line 417
    .line 418
    iget-object v8, v2, Lbe3;->a:[B

    .line 419
    .line 420
    invoke-interface {v1, v8, v5, v7}, Ll51;->n([BII)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v2}, Lbe3;->H()I

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    shr-int/lit8 v7, v2, 0x2

    .line 428
    .line 429
    const/16 v8, 0x3ffe

    .line 430
    .line 431
    if-ne v7, v8, :cond_1c

    .line 432
    .line 433
    invoke-interface {v1}, Ll51;->k()V

    .line 434
    .line 435
    .line 436
    iput v2, v0, Ls71;->k:I

    .line 437
    .line 438
    iget-object v2, v0, Ls71;->e:Lm51;

    .line 439
    .line 440
    sget-object v3, Lf35;->a:Ljava/lang/String;

    .line 441
    .line 442
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 443
    .line 444
    .line 445
    move-result-wide v7

    .line 446
    invoke-interface {v1}, Ll51;->getLength()J

    .line 447
    .line 448
    .line 449
    move-result-wide v25

    .line 450
    iget-object v1, v0, Ls71;->i:Lv71;

    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    iget-object v1, v0, Ls71;->i:Lv71;

    .line 456
    .line 457
    iget-object v3, v1, Lv71;->k:Lrm3;

    .line 458
    .line 459
    if-eqz v3, :cond_18

    .line 460
    .line 461
    iget-object v3, v3, Lrm3;->n:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v3, [J

    .line 464
    .line 465
    array-length v3, v3

    .line 466
    if-lez v3, :cond_18

    .line 467
    .line 468
    new-instance v3, Lbo;

    .line 469
    .line 470
    invoke-direct {v3, v1, v7, v8, v4}, Lbo;-><init>(Ljava/lang/Object;JI)V

    .line 471
    .line 472
    .line 473
    move/from16 v30, v5

    .line 474
    .line 475
    goto/16 :goto_11

    .line 476
    .line 477
    :cond_18
    cmp-long v3, v25, v14

    .line 478
    .line 479
    if-eqz v3, :cond_1b

    .line 480
    .line 481
    iget-wide v3, v1, Lv71;->j:J

    .line 482
    .line 483
    cmp-long v3, v3, v12

    .line 484
    .line 485
    if-lez v3, :cond_1b

    .line 486
    .line 487
    new-instance v16, Lr71;

    .line 488
    .line 489
    iget v3, v0, Ls71;->k:I

    .line 490
    .line 491
    iget v4, v1, Lv71;->c:I

    .line 492
    .line 493
    new-instance v9, Lcn;

    .line 494
    .line 495
    const/16 v10, 0xd

    .line 496
    .line 497
    invoke-direct {v9, v10, v1}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    new-instance v10, Lq71;

    .line 501
    .line 502
    invoke-direct {v10, v1, v3}, Lq71;-><init>(Lv71;I)V

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1}, Lv71;->b()J

    .line 506
    .line 507
    .line 508
    move-result-wide v19

    .line 509
    iget-wide v12, v1, Lv71;->j:J

    .line 510
    .line 511
    iget v3, v1, Lv71;->d:I

    .line 512
    .line 513
    if-lez v3, :cond_19

    .line 514
    .line 515
    int-to-long v14, v3

    .line 516
    move/from16 v30, v5

    .line 517
    .line 518
    int-to-long v5, v4

    .line 519
    add-long/2addr v14, v5

    .line 520
    const-wide/16 v5, 0x2

    .line 521
    .line 522
    div-long/2addr v14, v5

    .line 523
    const-wide/16 v5, 0x1

    .line 524
    .line 525
    add-long/2addr v14, v5

    .line 526
    :goto_e
    move-wide/from16 v27, v14

    .line 527
    .line 528
    goto :goto_10

    .line 529
    :cond_19
    move/from16 v30, v5

    .line 530
    .line 531
    iget v3, v1, Lv71;->a:I

    .line 532
    .line 533
    iget v5, v1, Lv71;->b:I

    .line 534
    .line 535
    if-ne v3, v5, :cond_1a

    .line 536
    .line 537
    if-lez v3, :cond_1a

    .line 538
    .line 539
    int-to-long v5, v3

    .line 540
    goto :goto_f

    .line 541
    :cond_1a
    const-wide/16 v5, 0x1000

    .line 542
    .line 543
    :goto_f
    iget v3, v1, Lv71;->g:I

    .line 544
    .line 545
    int-to-long v14, v3

    .line 546
    mul-long/2addr v5, v14

    .line 547
    iget v1, v1, Lv71;->h:I

    .line 548
    .line 549
    int-to-long v14, v1

    .line 550
    mul-long/2addr v5, v14

    .line 551
    const-wide/16 v14, 0x8

    .line 552
    .line 553
    div-long/2addr v5, v14

    .line 554
    const-wide/16 v14, 0x40

    .line 555
    .line 556
    add-long/2addr v14, v5

    .line 557
    goto :goto_e

    .line 558
    :goto_10
    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    .line 559
    .line 560
    .line 561
    move-result v29

    .line 562
    move-wide/from16 v23, v7

    .line 563
    .line 564
    move-object/from16 v17, v9

    .line 565
    .line 566
    move-object/from16 v18, v10

    .line 567
    .line 568
    move-wide/from16 v21, v12

    .line 569
    .line 570
    invoke-direct/range {v16 .. v29}, Lr71;-><init>(Lns;Lps;JJJJJI)V

    .line 571
    .line 572
    .line 573
    move-object/from16 v1, v16

    .line 574
    .line 575
    iput-object v1, v0, Ls71;->l:Lr71;

    .line 576
    .line 577
    iget-object v3, v1, Lr71;->a:Lls;

    .line 578
    .line 579
    goto :goto_11

    .line 580
    :cond_1b
    move/from16 v30, v5

    .line 581
    .line 582
    new-instance v3, Lbo;

    .line 583
    .line 584
    invoke-virtual {v1}, Lv71;->b()J

    .line 585
    .line 586
    .line 587
    move-result-wide v4

    .line 588
    invoke-direct {v3, v4, v5}, Lbo;-><init>(J)V

    .line 589
    .line 590
    .line 591
    :goto_11
    invoke-interface {v2, v3}, Lm51;->w(Lm84;)V

    .line 592
    .line 593
    .line 594
    const/4 v1, 0x5

    .line 595
    iput v1, v0, Ls71;->g:I

    .line 596
    .line 597
    return v30

    .line 598
    :cond_1c
    invoke-interface {v1}, Ll51;->k()V

    .line 599
    .line 600
    .line 601
    const-string v0, "First frame does not start with sync code."

    .line 602
    .line 603
    invoke-static {v3, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    throw v0

    .line 608
    :cond_1d
    move/from16 v30, v5

    .line 609
    .line 610
    iget-object v2, v0, Ls71;->i:Lv71;

    .line 611
    .line 612
    move/from16 v3, v30

    .line 613
    .line 614
    :goto_12
    if-nez v3, :cond_25

    .line 615
    .line 616
    invoke-interface {v1}, Ll51;->k()V

    .line 617
    .line 618
    .line 619
    new-instance v3, Lh00;

    .line 620
    .line 621
    new-array v4, v8, [B

    .line 622
    .line 623
    invoke-direct {v3, v8, v4}, Lh00;-><init>(I[B)V

    .line 624
    .line 625
    .line 626
    move/from16 v5, v30

    .line 627
    .line 628
    invoke-interface {v1, v4, v5, v8}, Ll51;->n([BII)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {v3}, Lh00;->h()Z

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    invoke-virtual {v3, v10}, Lh00;->i(I)I

    .line 636
    .line 637
    .line 638
    move-result v7

    .line 639
    const/16 v12, 0x18

    .line 640
    .line 641
    invoke-virtual {v3, v12}, Lh00;->i(I)I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    add-int/2addr v3, v8

    .line 646
    if-nez v7, :cond_1e

    .line 647
    .line 648
    const/16 v2, 0x26

    .line 649
    .line 650
    new-array v3, v2, [B

    .line 651
    .line 652
    invoke-interface {v1, v3, v5, v2}, Ll51;->readFully([BII)V

    .line 653
    .line 654
    .line 655
    new-instance v2, Lv71;

    .line 656
    .line 657
    invoke-direct {v2, v8, v3}, Lv71;-><init>(I[B)V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_18

    .line 661
    .line 662
    :cond_1e
    if-eqz v2, :cond_24

    .line 663
    .line 664
    iget-object v12, v2, Lv71;->l:Lqv2;

    .line 665
    .line 666
    if-ne v7, v9, :cond_1f

    .line 667
    .line 668
    new-instance v7, Lbe3;

    .line 669
    .line 670
    invoke-direct {v7, v3}, Lbe3;-><init>(I)V

    .line 671
    .line 672
    .line 673
    iget-object v12, v7, Lbe3;->a:[B

    .line 674
    .line 675
    invoke-interface {v1, v12, v5, v3}, Ll51;->readFully([BII)V

    .line 676
    .line 677
    .line 678
    invoke-static {v7}, Ll93;->Y(Lbe3;)Lrm3;

    .line 679
    .line 680
    .line 681
    move-result-object v23

    .line 682
    new-instance v13, Lv71;

    .line 683
    .line 684
    iget v14, v2, Lv71;->a:I

    .line 685
    .line 686
    iget v15, v2, Lv71;->b:I

    .line 687
    .line 688
    iget v3, v2, Lv71;->c:I

    .line 689
    .line 690
    iget v5, v2, Lv71;->d:I

    .line 691
    .line 692
    iget v7, v2, Lv71;->e:I

    .line 693
    .line 694
    iget v12, v2, Lv71;->g:I

    .line 695
    .line 696
    iget v10, v2, Lv71;->h:I

    .line 697
    .line 698
    move/from16 v20, v10

    .line 699
    .line 700
    iget-wide v9, v2, Lv71;->j:J

    .line 701
    .line 702
    iget-object v2, v2, Lv71;->l:Lqv2;

    .line 703
    .line 704
    move-object/from16 v24, v2

    .line 705
    .line 706
    move/from16 v16, v3

    .line 707
    .line 708
    move/from16 v17, v5

    .line 709
    .line 710
    move/from16 v18, v7

    .line 711
    .line 712
    move-wide/from16 v21, v9

    .line 713
    .line 714
    move/from16 v19, v12

    .line 715
    .line 716
    invoke-direct/range {v13 .. v24}, Lv71;-><init>(IIIIIIIJLrm3;Lqv2;)V

    .line 717
    .line 718
    .line 719
    move-object v2, v13

    .line 720
    goto/16 :goto_18

    .line 721
    .line 722
    :cond_1f
    if-ne v7, v8, :cond_21

    .line 723
    .line 724
    new-instance v5, Lbe3;

    .line 725
    .line 726
    invoke-direct {v5, v3}, Lbe3;-><init>(I)V

    .line 727
    .line 728
    .line 729
    iget-object v7, v5, Lbe3;->a:[B

    .line 730
    .line 731
    const/4 v9, 0x0

    .line 732
    invoke-interface {v1, v7, v9, v3}, Ll51;->readFully([BII)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v5, v8}, Lbe3;->O(I)V

    .line 736
    .line 737
    .line 738
    invoke-static {v5, v9, v9}, Lzz1;->C(Lbe3;ZZ)Lc05;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    iget-object v3, v3, Lc05;->n:Ljava/lang/Object;

    .line 743
    .line 744
    check-cast v3, [Ljava/lang/String;

    .line 745
    .line 746
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    invoke-static {v3}, Lzz1;->w(Ljava/util/List;)Lqv2;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    if-nez v12, :cond_20

    .line 755
    .line 756
    :goto_13
    move-object/from16 v23, v3

    .line 757
    .line 758
    goto :goto_14

    .line 759
    :cond_20
    invoke-virtual {v12, v3}, Lqv2;->b(Lqv2;)Lqv2;

    .line 760
    .line 761
    .line 762
    move-result-object v3

    .line 763
    goto :goto_13

    .line 764
    :goto_14
    new-instance v12, Lv71;

    .line 765
    .line 766
    iget v13, v2, Lv71;->a:I

    .line 767
    .line 768
    iget v14, v2, Lv71;->b:I

    .line 769
    .line 770
    iget v15, v2, Lv71;->c:I

    .line 771
    .line 772
    iget v3, v2, Lv71;->d:I

    .line 773
    .line 774
    iget v5, v2, Lv71;->e:I

    .line 775
    .line 776
    iget v7, v2, Lv71;->g:I

    .line 777
    .line 778
    iget v9, v2, Lv71;->h:I

    .line 779
    .line 780
    move/from16 v19, v9

    .line 781
    .line 782
    iget-wide v8, v2, Lv71;->j:J

    .line 783
    .line 784
    iget-object v2, v2, Lv71;->k:Lrm3;

    .line 785
    .line 786
    move-object/from16 v22, v2

    .line 787
    .line 788
    move/from16 v16, v3

    .line 789
    .line 790
    move/from16 v17, v5

    .line 791
    .line 792
    move/from16 v18, v7

    .line 793
    .line 794
    move-wide/from16 v20, v8

    .line 795
    .line 796
    invoke-direct/range {v12 .. v23}, Lv71;-><init>(IIIIIIIJLrm3;Lqv2;)V

    .line 797
    .line 798
    .line 799
    :goto_15
    move-object v2, v12

    .line 800
    goto :goto_18

    .line 801
    :cond_21
    if-ne v7, v11, :cond_23

    .line 802
    .line 803
    new-instance v5, Lbe3;

    .line 804
    .line 805
    invoke-direct {v5, v3}, Lbe3;-><init>(I)V

    .line 806
    .line 807
    .line 808
    iget-object v7, v5, Lbe3;->a:[B

    .line 809
    .line 810
    const/4 v9, 0x0

    .line 811
    invoke-interface {v1, v7, v9, v3}, Ll51;->readFully([BII)V

    .line 812
    .line 813
    .line 814
    const/4 v10, 0x4

    .line 815
    invoke-virtual {v5, v10}, Lbe3;->O(I)V

    .line 816
    .line 817
    .line 818
    invoke-static {v5}, Ldg3;->d(Lbe3;)Ldg3;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    invoke-static {v3}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    new-instance v5, Lqv2;

    .line 827
    .line 828
    invoke-direct {v5, v3}, Lqv2;-><init>(Ljava/util/List;)V

    .line 829
    .line 830
    .line 831
    if-nez v12, :cond_22

    .line 832
    .line 833
    :goto_16
    move-object/from16 v23, v5

    .line 834
    .line 835
    goto :goto_17

    .line 836
    :cond_22
    invoke-virtual {v12, v5}, Lqv2;->b(Lqv2;)Lqv2;

    .line 837
    .line 838
    .line 839
    move-result-object v5

    .line 840
    goto :goto_16

    .line 841
    :goto_17
    new-instance v12, Lv71;

    .line 842
    .line 843
    iget v13, v2, Lv71;->a:I

    .line 844
    .line 845
    iget v14, v2, Lv71;->b:I

    .line 846
    .line 847
    iget v15, v2, Lv71;->c:I

    .line 848
    .line 849
    iget v3, v2, Lv71;->d:I

    .line 850
    .line 851
    iget v5, v2, Lv71;->e:I

    .line 852
    .line 853
    iget v7, v2, Lv71;->g:I

    .line 854
    .line 855
    iget v8, v2, Lv71;->h:I

    .line 856
    .line 857
    iget-wide v10, v2, Lv71;->j:J

    .line 858
    .line 859
    iget-object v2, v2, Lv71;->k:Lrm3;

    .line 860
    .line 861
    move-object/from16 v22, v2

    .line 862
    .line 863
    move/from16 v16, v3

    .line 864
    .line 865
    move/from16 v17, v5

    .line 866
    .line 867
    move/from16 v18, v7

    .line 868
    .line 869
    move/from16 v19, v8

    .line 870
    .line 871
    move-wide/from16 v20, v10

    .line 872
    .line 873
    invoke-direct/range {v12 .. v23}, Lv71;-><init>(IIIIIIIJLrm3;Lqv2;)V

    .line 874
    .line 875
    .line 876
    goto :goto_15

    .line 877
    :cond_23
    invoke-interface {v1, v3}, Ll51;->l(I)V

    .line 878
    .line 879
    .line 880
    :goto_18
    sget-object v3, Lf35;->a:Ljava/lang/String;

    .line 881
    .line 882
    iput-object v2, v0, Ls71;->i:Lv71;

    .line 883
    .line 884
    move v3, v4

    .line 885
    const/4 v8, 0x4

    .line 886
    const/4 v9, 0x3

    .line 887
    const/4 v10, 0x7

    .line 888
    const/4 v11, 0x6

    .line 889
    const/16 v30, 0x0

    .line 890
    .line 891
    goto/16 :goto_12

    .line 892
    .line 893
    :cond_24
    invoke-static {}, Lnz2;->c()V

    .line 894
    .line 895
    .line 896
    const/16 v30, 0x0

    .line 897
    .line 898
    return v30

    .line 899
    :cond_25
    iget-object v1, v0, Ls71;->i:Lv71;

    .line 900
    .line 901
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    iget-object v1, v0, Ls71;->i:Lv71;

    .line 905
    .line 906
    iget v1, v1, Lv71;->c:I

    .line 907
    .line 908
    const/4 v9, 0x6

    .line 909
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    .line 910
    .line 911
    .line 912
    move-result v1

    .line 913
    iput v1, v0, Ls71;->j:I

    .line 914
    .line 915
    iget-object v1, v0, Ls71;->i:Lv71;

    .line 916
    .line 917
    iget-object v2, v0, Ls71;->h:Lqv2;

    .line 918
    .line 919
    invoke-virtual {v1, v6, v2}, Lv71;->c([BLqv2;)Ltb1;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    iget-object v2, v0, Ls71;->f:Lwv4;

    .line 924
    .line 925
    invoke-virtual {v1}, Ltb1;->a()Lsb1;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    const-string v3, "audio/flac"

    .line 930
    .line 931
    invoke-static {v3}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    iput-object v3, v1, Lsb1;->l:Ljava/lang/String;

    .line 936
    .line 937
    invoke-static {v1, v2}, Lf34;->l(Lsb1;Lwv4;)V

    .line 938
    .line 939
    .line 940
    iget-object v1, v0, Ls71;->f:Lwv4;

    .line 941
    .line 942
    iget-object v2, v0, Ls71;->i:Lv71;

    .line 943
    .line 944
    invoke-virtual {v2}, Lv71;->b()J

    .line 945
    .line 946
    .line 947
    move-result-wide v2

    .line 948
    invoke-interface {v1, v2, v3}, Lwv4;->d(J)V

    .line 949
    .line 950
    .line 951
    const/4 v10, 0x4

    .line 952
    iput v10, v0, Ls71;->g:I

    .line 953
    .line 954
    const/4 v9, 0x0

    .line 955
    return v9

    .line 956
    :cond_26
    move v9, v5

    .line 957
    move v10, v8

    .line 958
    new-instance v2, Lbe3;

    .line 959
    .line 960
    invoke-direct {v2, v10}, Lbe3;-><init>(I)V

    .line 961
    .line 962
    .line 963
    iget-object v4, v2, Lbe3;->a:[B

    .line 964
    .line 965
    invoke-interface {v1, v4, v9, v10}, Ll51;->readFully([BII)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v2}, Lbe3;->C()J

    .line 969
    .line 970
    .line 971
    move-result-wide v1

    .line 972
    const-wide/32 v4, 0x664c6143

    .line 973
    .line 974
    .line 975
    cmp-long v1, v1, v4

    .line 976
    .line 977
    if-nez v1, :cond_27

    .line 978
    .line 979
    const/4 v1, 0x3

    .line 980
    iput v1, v0, Ls71;->g:I

    .line 981
    .line 982
    return v9

    .line 983
    :cond_27
    const-string v0, "Failed to read FLAC stream marker."

    .line 984
    .line 985
    invoke-static {v3, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    throw v0

    .line 990
    :cond_28
    move v9, v5

    .line 991
    array-length v2, v6

    .line 992
    invoke-interface {v1, v6, v9, v2}, Ll51;->n([BII)V

    .line 993
    .line 994
    .line 995
    invoke-interface {v1}, Ll51;->k()V

    .line 996
    .line 997
    .line 998
    iput v7, v0, Ls71;->g:I

    .line 999
    .line 1000
    return v9

    .line 1001
    :cond_29
    move v9, v5

    .line 1002
    invoke-interface {v1}, Ll51;->k()V

    .line 1003
    .line 1004
    .line 1005
    invoke-interface {v1}, Ll51;->f()J

    .line 1006
    .line 1007
    .line 1008
    move-result-wide v5

    .line 1009
    iget-boolean v2, v0, Ls71;->c:Z

    .line 1010
    .line 1011
    if-nez v2, :cond_2a

    .line 1012
    .line 1013
    move-object v2, v3

    .line 1014
    goto :goto_19

    .line 1015
    :cond_2a
    sget-object v2, Lmv1;->o:Ler1;

    .line 1016
    .line 1017
    :goto_19
    new-instance v7, Lov1;

    .line 1018
    .line 1019
    invoke-direct {v7, v9}, Lov1;-><init>(I)V

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v7, v1, v2, v9}, Lov1;->a(Ll51;Lkv1;I)Lqv2;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v2

    .line 1026
    if-eqz v2, :cond_2c

    .line 1027
    .line 1028
    iget-object v7, v2, Lqv2;->a:[Lpv2;

    .line 1029
    .line 1030
    array-length v7, v7

    .line 1031
    if-nez v7, :cond_2b

    .line 1032
    .line 1033
    goto :goto_1a

    .line 1034
    :cond_2b
    move-object v3, v2

    .line 1035
    :cond_2c
    :goto_1a
    invoke-interface {v1}, Ll51;->f()J

    .line 1036
    .line 1037
    .line 1038
    move-result-wide v7

    .line 1039
    sub-long/2addr v7, v5

    .line 1040
    long-to-int v2, v7

    .line 1041
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 1042
    .line 1043
    .line 1044
    iput-object v3, v0, Ls71;->h:Lqv2;

    .line 1045
    .line 1046
    iput v4, v0, Ls71;->g:I

    .line 1047
    .line 1048
    const/16 v30, 0x0

    .line 1049
    .line 1050
    return v30
.end method

.method public final c(Ll51;)Z
    .locals 4

    .line 1
    sget-object p0, Lmv1;->o:Ler1;

    .line 2
    .line 3
    new-instance v0, Lov1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, v1}, Lov1;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p0, v1}, Lov1;->a(Ll51;Lkv1;I)Lqv2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lqv2;->a:[Lpv2;

    .line 16
    .line 17
    array-length p0, p0

    .line 18
    :cond_0
    new-instance p0, Lbe3;

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    invoke-direct {p0, v0}, Lbe3;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lbe3;->a:[B

    .line 25
    .line 26
    check-cast p1, Lrk0;

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1, v0, v1}, Lrk0;->e([BIIZ)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lbe3;->C()J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    const-wide/32 v2, 0x664c6143

    .line 36
    .line 37
    .line 38
    cmp-long p0, p0, v2

    .line 39
    .line 40
    if-nez p0, :cond_1

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_1
    return v1
.end method

.method public final d(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    iput p2, p0, Ls71;->g:I

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Ls71;->l:Lr71;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1, p3, p4}, Lr71;->d(J)V

    .line 16
    .line 17
    .line 18
    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    const-wide/16 v0, -0x1

    .line 24
    .line 25
    :goto_1
    iput-wide v0, p0, Ls71;->n:J

    .line 26
    .line 27
    iput p2, p0, Ls71;->m:I

    .line 28
    .line 29
    iget-object p0, p0, Ls71;->b:Lbe3;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lbe3;->K(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final f(Lm51;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ls71;->e:Lm51;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lm51;->t(II)Lwv4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Ls71;->f:Lwv4;

    .line 10
    .line 11
    invoke-interface {p1}, Lm51;->p()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
