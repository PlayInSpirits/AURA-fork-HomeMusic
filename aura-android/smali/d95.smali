.class public final Ld95;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public a:Lm51;

.field public b:Lwv4;

.field public c:I

.field public d:J

.field public e:Lb95;

.field public f:I

.field public g:J


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
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ld95;->c:I

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    iput-wide v0, p0, Ld95;->d:J

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    iput v2, p0, Ld95;->f:I

    .line 13
    .line 14
    iput-wide v0, p0, Ld95;->g:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ld95;->b:Lwv4;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, v0, Ld95;->c:I

    .line 13
    .line 14
    const/4 v3, -0x1

    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v2, :cond_19

    .line 19
    .line 20
    const/16 v7, 0x8

    .line 21
    .line 22
    const/4 v8, 0x2

    .line 23
    const-wide/16 v9, -0x1

    .line 24
    .line 25
    if-eq v2, v5, :cond_17

    .line 26
    .line 27
    const/4 v11, 0x3

    .line 28
    if-eq v2, v8, :cond_6

    .line 29
    .line 30
    if-eq v2, v11, :cond_3

    .line 31
    .line 32
    if-ne v2, v4, :cond_2

    .line 33
    .line 34
    iget-wide v7, v0, Ld95;->g:J

    .line 35
    .line 36
    cmp-long v2, v7, v9

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v6

    .line 42
    :goto_0
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 43
    .line 44
    .line 45
    iget-wide v4, v0, Ld95;->g:J

    .line 46
    .line 47
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    sub-long/2addr v4, v7

    .line 52
    iget-object v0, v0, Ld95;->e:Lb95;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v1, v4, v5}, Lb95;->b(Ll51;J)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    return v3

    .line 64
    :cond_1
    return v6

    .line 65
    :cond_2
    invoke-static {}, Ltb4;->a()V

    .line 66
    .line 67
    .line 68
    return v6

    .line 69
    :cond_3
    invoke-interface {v1}, Ll51;->k()V

    .line 70
    .line 71
    .line 72
    new-instance v2, Lbe3;

    .line 73
    .line 74
    invoke-direct {v2, v7}, Lbe3;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const v3, 0x64617461

    .line 78
    .line 79
    .line 80
    invoke-static {v3, v1, v2}, Luo;->T(ILl51;Lbe3;)Ldd2;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-interface {v1, v7}, Ll51;->l(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 88
    .line 89
    .line 90
    move-result-wide v7

    .line 91
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    iget-wide v7, v2, Ldd2;->b:J

    .line 96
    .line 97
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Ljava/lang/Long;

    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/lang/Long;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    iput v3, v0, Ld95;->f:I

    .line 114
    .line 115
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, Ljava/lang/Long;

    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v2

    .line 123
    iget-wide v7, v0, Ld95;->d:J

    .line 124
    .line 125
    cmp-long v5, v7, v9

    .line 126
    .line 127
    if-eqz v5, :cond_4

    .line 128
    .line 129
    const-wide v11, 0xffffffffL

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    cmp-long v5, v2, v11

    .line 135
    .line 136
    if-nez v5, :cond_4

    .line 137
    .line 138
    move-wide v2, v7

    .line 139
    :cond_4
    iget v5, v0, Ld95;->f:I

    .line 140
    .line 141
    int-to-long v7, v5

    .line 142
    add-long/2addr v7, v2

    .line 143
    iput-wide v7, v0, Ld95;->g:J

    .line 144
    .line 145
    invoke-interface {v1}, Ll51;->getLength()J

    .line 146
    .line 147
    .line 148
    move-result-wide v1

    .line 149
    cmp-long v3, v1, v9

    .line 150
    .line 151
    if-eqz v3, :cond_5

    .line 152
    .line 153
    iget-wide v7, v0, Ld95;->g:J

    .line 154
    .line 155
    cmp-long v3, v7, v1

    .line 156
    .line 157
    if-lez v3, :cond_5

    .line 158
    .line 159
    new-instance v3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v5, "Data exceeds input length: "

    .line 162
    .line 163
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-wide v7, v0, Ld95;->g:J

    .line 167
    .line 168
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v5, ", "

    .line 172
    .line 173
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    const-string v5, "WavExtractor"

    .line 184
    .line 185
    invoke-static {v5, v3}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iput-wide v1, v0, Ld95;->g:J

    .line 189
    .line 190
    :cond_5
    iget-object v1, v0, Ld95;->e:Lb95;

    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    iget v2, v0, Ld95;->f:I

    .line 196
    .line 197
    iget-wide v7, v0, Ld95;->g:J

    .line 198
    .line 199
    invoke-interface {v1, v2, v7, v8}, Lb95;->c(IJ)V

    .line 200
    .line 201
    .line 202
    iput v4, v0, Ld95;->c:I

    .line 203
    .line 204
    return v6

    .line 205
    :cond_6
    new-instance v2, Lbe3;

    .line 206
    .line 207
    const/16 v3, 0x10

    .line 208
    .line 209
    invoke-direct {v2, v3}, Lbe3;-><init>(I)V

    .line 210
    .line 211
    .line 212
    const v7, 0x666d7420

    .line 213
    .line 214
    .line 215
    invoke-static {v7, v1, v2}, Luo;->T(ILl51;Lbe3;)Ldd2;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    iget-wide v7, v7, Ldd2;->b:J

    .line 220
    .line 221
    const-wide/16 v9, 0x10

    .line 222
    .line 223
    cmp-long v9, v7, v9

    .line 224
    .line 225
    if-ltz v9, :cond_7

    .line 226
    .line 227
    move v9, v5

    .line 228
    goto :goto_1

    .line 229
    :cond_7
    move v9, v6

    .line 230
    :goto_1
    invoke-static {v9}, Lrr2;->w(Z)V

    .line 231
    .line 232
    .line 233
    iget-object v9, v2, Lbe3;->a:[B

    .line 234
    .line 235
    invoke-interface {v1, v9, v6, v3}, Ll51;->n([BII)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6}, Lbe3;->N(I)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Lbe3;->t()I

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    invoke-virtual {v2}, Lbe3;->t()I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    invoke-virtual {v2}, Lbe3;->s()I

    .line 250
    .line 251
    .line 252
    move-result v12

    .line 253
    invoke-virtual {v2}, Lbe3;->s()I

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Lbe3;->t()I

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    invoke-virtual {v2}, Lbe3;->t()I

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    long-to-int v7, v7

    .line 265
    sub-int/2addr v7, v3

    .line 266
    const v3, 0xfffe

    .line 267
    .line 268
    .line 269
    if-lez v7, :cond_e

    .line 270
    .line 271
    new-array v8, v7, [B

    .line 272
    .line 273
    invoke-interface {v1, v8, v6, v7}, Ll51;->n([BII)V

    .line 274
    .line 275
    .line 276
    if-ne v9, v3, :cond_f

    .line 277
    .line 278
    const/16 v14, 0x18

    .line 279
    .line 280
    if-ne v7, v14, :cond_f

    .line 281
    .line 282
    new-instance v7, Lbe3;

    .line 283
    .line 284
    invoke-direct {v7, v8}, Lbe3;-><init>([B)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7}, Lbe3;->t()I

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Lbe3;->t()I

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_9

    .line 295
    .line 296
    if-ne v9, v2, :cond_8

    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v1, "validBits ( "

    .line 302
    .line 303
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    const-string v1, ")  != bitsPerSample( "

    .line 310
    .line 311
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string v1, ") are not supported"

    .line 318
    .line 319
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    throw v0

    .line 331
    :cond_9
    :goto_2
    invoke-virtual {v7}, Lbe3;->s()I

    .line 332
    .line 333
    .line 334
    move-result v9

    .line 335
    shr-int/lit8 v14, v9, 0x12

    .line 336
    .line 337
    if-nez v14, :cond_d

    .line 338
    .line 339
    if-eqz v9, :cond_b

    .line 340
    .line 341
    invoke-static {v9}, Ljava/lang/Integer;->bitCount(I)I

    .line 342
    .line 343
    .line 344
    move-result v14

    .line 345
    if-ne v14, v10, :cond_a

    .line 346
    .line 347
    goto :goto_3

    .line 348
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 349
    .line 350
    const-string v1, "invalid number of channels ("

    .line 351
    .line 352
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-static {v9}, Ljava/lang/Integer;->bitCount(I)I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const-string v1, ") in channel mask "

    .line 363
    .line 364
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    throw v0

    .line 379
    :cond_b
    :goto_3
    invoke-virtual {v7}, Lbe3;->t()I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    const/16 v14, 0xe

    .line 384
    .line 385
    new-array v15, v14, [B

    .line 386
    .line 387
    invoke-virtual {v7, v15, v6, v14}, Lbe3;->k([BII)V

    .line 388
    .line 389
    .line 390
    sget-object v7, Luo;->s:[B

    .line 391
    .line 392
    invoke-static {v15, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    if-nez v7, :cond_f

    .line 397
    .line 398
    sget-object v7, Luo;->t:[B

    .line 399
    .line 400
    invoke-static {v15, v7}, Ljava/util/Arrays;->equals([B[B)Z

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    if-eqz v7, :cond_c

    .line 405
    .line 406
    goto :goto_4

    .line 407
    :cond_c
    const-string v0, "invalid wav format extension guid"

    .line 408
    .line 409
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    throw v0

    .line 414
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    const-string v1, "invalid channel mask "

    .line 417
    .line 418
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    throw v0

    .line 433
    :cond_e
    sget-object v8, Lf35;->b:[B

    .line 434
    .line 435
    :cond_f
    :goto_4
    invoke-interface {v1}, Ll51;->f()J

    .line 436
    .line 437
    .line 438
    move-result-wide v14

    .line 439
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 440
    .line 441
    .line 442
    move-result-wide v16

    .line 443
    sub-long v14, v14, v16

    .line 444
    .line 445
    long-to-int v7, v14

    .line 446
    invoke-interface {v1, v7}, Ll51;->l(I)V

    .line 447
    .line 448
    .line 449
    new-instance v1, Luu;

    .line 450
    .line 451
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 452
    .line 453
    .line 454
    iput v10, v1, Luu;->n:I

    .line 455
    .line 456
    iput v12, v1, Luu;->o:I

    .line 457
    .line 458
    iput v13, v1, Luu;->p:I

    .line 459
    .line 460
    iput v2, v1, Luu;->q:I

    .line 461
    .line 462
    iput-object v8, v1, Luu;->r:Ljava/lang/Object;

    .line 463
    .line 464
    const/16 v7, 0x11

    .line 465
    .line 466
    if-ne v9, v7, :cond_10

    .line 467
    .line 468
    new-instance v2, La95;

    .line 469
    .line 470
    iget-object v3, v0, Ld95;->a:Lm51;

    .line 471
    .line 472
    iget-object v4, v0, Ld95;->b:Lwv4;

    .line 473
    .line 474
    invoke-direct {v2, v3, v4, v1}, La95;-><init>(Lm51;Lwv4;Luu;)V

    .line 475
    .line 476
    .line 477
    iput-object v2, v0, Ld95;->e:Lb95;

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_10
    const/4 v7, 0x6

    .line 481
    if-ne v9, v7, :cond_11

    .line 482
    .line 483
    new-instance v14, Lc95;

    .line 484
    .line 485
    iget-object v15, v0, Ld95;->a:Lm51;

    .line 486
    .line 487
    iget-object v2, v0, Ld95;->b:Lwv4;

    .line 488
    .line 489
    const-string v18, "audio/g711-alaw"

    .line 490
    .line 491
    const/16 v19, -0x1

    .line 492
    .line 493
    move-object/from16 v17, v1

    .line 494
    .line 495
    move-object/from16 v16, v2

    .line 496
    .line 497
    invoke-direct/range {v14 .. v19}, Lc95;-><init>(Lm51;Lwv4;Luu;Ljava/lang/String;I)V

    .line 498
    .line 499
    .line 500
    iput-object v14, v0, Ld95;->e:Lb95;

    .line 501
    .line 502
    goto :goto_7

    .line 503
    :cond_11
    move-object/from16 v17, v1

    .line 504
    .line 505
    const/4 v1, 0x7

    .line 506
    if-ne v9, v1, :cond_12

    .line 507
    .line 508
    new-instance v14, Lc95;

    .line 509
    .line 510
    iget-object v15, v0, Ld95;->a:Lm51;

    .line 511
    .line 512
    iget-object v1, v0, Ld95;->b:Lwv4;

    .line 513
    .line 514
    const-string v18, "audio/g711-mlaw"

    .line 515
    .line 516
    const/16 v19, -0x1

    .line 517
    .line 518
    move-object/from16 v16, v1

    .line 519
    .line 520
    invoke-direct/range {v14 .. v19}, Lc95;-><init>(Lm51;Lwv4;Luu;Ljava/lang/String;I)V

    .line 521
    .line 522
    .line 523
    iput-object v14, v0, Ld95;->e:Lb95;

    .line 524
    .line 525
    goto :goto_7

    .line 526
    :cond_12
    if-eq v9, v5, :cond_15

    .line 527
    .line 528
    if-eq v9, v11, :cond_14

    .line 529
    .line 530
    if-eq v9, v3, :cond_15

    .line 531
    .line 532
    :cond_13
    move/from16 v19, v6

    .line 533
    .line 534
    goto :goto_6

    .line 535
    :cond_14
    const/16 v1, 0x20

    .line 536
    .line 537
    if-ne v2, v1, :cond_13

    .line 538
    .line 539
    :goto_5
    move/from16 v19, v4

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :cond_15
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 543
    .line 544
    invoke-static {v2, v1}, Lf35;->C(ILjava/nio/ByteOrder;)I

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    goto :goto_5

    .line 549
    :goto_6
    if-eqz v19, :cond_16

    .line 550
    .line 551
    new-instance v14, Lc95;

    .line 552
    .line 553
    iget-object v15, v0, Ld95;->a:Lm51;

    .line 554
    .line 555
    iget-object v1, v0, Ld95;->b:Lwv4;

    .line 556
    .line 557
    const-string v18, "audio/raw"

    .line 558
    .line 559
    move-object/from16 v16, v1

    .line 560
    .line 561
    invoke-direct/range {v14 .. v19}, Lc95;-><init>(Lm51;Lwv4;Luu;Ljava/lang/String;I)V

    .line 562
    .line 563
    .line 564
    iput-object v14, v0, Ld95;->e:Lb95;

    .line 565
    .line 566
    :goto_7
    iput v11, v0, Ld95;->c:I

    .line 567
    .line 568
    return v6

    .line 569
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    const-string v1, "Unsupported WAV format type: "

    .line 572
    .line 573
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    throw v0

    .line 588
    :cond_17
    new-instance v2, Lbe3;

    .line 589
    .line 590
    invoke-direct {v2, v7}, Lbe3;-><init>(I)V

    .line 591
    .line 592
    .line 593
    invoke-static {v1, v2}, Ldd2;->a(Ll51;Lbe3;)Ldd2;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    iget v4, v3, Ldd2;->a:I

    .line 598
    .line 599
    const v5, 0x64733634

    .line 600
    .line 601
    .line 602
    if-eq v4, v5, :cond_18

    .line 603
    .line 604
    invoke-interface {v1}, Ll51;->k()V

    .line 605
    .line 606
    .line 607
    goto :goto_8

    .line 608
    :cond_18
    invoke-interface {v1, v7}, Ll51;->g(I)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v6}, Lbe3;->N(I)V

    .line 612
    .line 613
    .line 614
    iget-object v4, v2, Lbe3;->a:[B

    .line 615
    .line 616
    invoke-interface {v1, v4, v6, v7}, Ll51;->n([BII)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v2}, Lbe3;->p()J

    .line 620
    .line 621
    .line 622
    move-result-wide v9

    .line 623
    iget-wide v2, v3, Ldd2;->b:J

    .line 624
    .line 625
    long-to-int v2, v2

    .line 626
    add-int/2addr v2, v7

    .line 627
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 628
    .line 629
    .line 630
    :goto_8
    iput-wide v9, v0, Ld95;->d:J

    .line 631
    .line 632
    iput v8, v0, Ld95;->c:I

    .line 633
    .line 634
    return v6

    .line 635
    :cond_19
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 636
    .line 637
    .line 638
    move-result-wide v7

    .line 639
    const-wide/16 v9, 0x0

    .line 640
    .line 641
    cmp-long v2, v7, v9

    .line 642
    .line 643
    if-nez v2, :cond_1a

    .line 644
    .line 645
    move v2, v5

    .line 646
    goto :goto_9

    .line 647
    :cond_1a
    move v2, v6

    .line 648
    :goto_9
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 649
    .line 650
    .line 651
    iget v2, v0, Ld95;->f:I

    .line 652
    .line 653
    if-eq v2, v3, :cond_1b

    .line 654
    .line 655
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 656
    .line 657
    .line 658
    iput v4, v0, Ld95;->c:I

    .line 659
    .line 660
    return v6

    .line 661
    :cond_1b
    invoke-static {v1}, Luo;->g(Ll51;)Z

    .line 662
    .line 663
    .line 664
    move-result v2

    .line 665
    if-eqz v2, :cond_1c

    .line 666
    .line 667
    invoke-interface {v1}, Ll51;->f()J

    .line 668
    .line 669
    .line 670
    move-result-wide v2

    .line 671
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 672
    .line 673
    .line 674
    move-result-wide v7

    .line 675
    sub-long/2addr v2, v7

    .line 676
    long-to-int v2, v2

    .line 677
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 678
    .line 679
    .line 680
    iput v5, v0, Ld95;->c:I

    .line 681
    .line 682
    return v6

    .line 683
    :cond_1c
    const-string v0, "Unsupported or unrecognized wav file type."

    .line 684
    .line 685
    const/4 v1, 0x0

    .line 686
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    throw v0
.end method

.method public final c(Ll51;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Luo;->g(Ll51;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
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
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p1, 0x4

    .line 10
    :goto_0
    iput p1, p0, Ld95;->c:I

    .line 11
    .line 12
    iget-object p0, p0, Ld95;->e:Lb95;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, p3, p4}, Lb95;->a(J)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final f(Lm51;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ld95;->a:Lm51;

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
    iput-object v0, p0, Ld95;->b:Lwv4;

    .line 10
    .line 11
    invoke-interface {p1}, Lm51;->p()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
