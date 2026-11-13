.class public final Ldefpackage/nk;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:Ljava/util/List;

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/Runnable;

.field public final synthetic r:Ldefpackage/pk;


# direct methods
.method public constructor <init>(Ldefpackage/pk;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/nk;->r:Ldefpackage/pk;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/nk;->n:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/nk;->o:Ljava/util/List;

    .line 9
    .line 10
    iput p4, p0, Ldefpackage/nk;->p:I

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/nk;->q:Ljava/lang/Runnable;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ldefpackage/zg5;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Ldefpackage/zg5;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ldefpackage/zg5;->u()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-virtual {v1}, Ldefpackage/zg5;->t()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    new-instance v4, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v5, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v6, Ldefpackage/zp0;

    .line 27
    .line 28
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    iput v7, v6, Ldefpackage/zp0;->a:I

    .line 33
    .line 34
    iput v2, v6, Ldefpackage/zp0;->b:I

    .line 35
    .line 36
    iput v7, v6, Ldefpackage/zp0;->c:I

    .line 37
    .line 38
    iput v3, v6, Ldefpackage/zp0;->d:I

    .line 39
    .line 40
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    add-int/2addr v2, v3

    .line 44
    const/4 v3, 0x1

    .line 45
    add-int/2addr v2, v3

    .line 46
    div-int/lit8 v2, v2, 0x2

    .line 47
    .line 48
    mul-int/lit8 v2, v2, 0x2

    .line 49
    .line 50
    add-int/2addr v2, v3

    .line 51
    new-array v6, v2, [I

    .line 52
    .line 53
    div-int/lit8 v8, v2, 0x2

    .line 54
    .line 55
    new-array v2, v2, [I

    .line 56
    .line 57
    new-instance v9, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-nez v10, :cond_1d

    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    sub-int/2addr v10, v3

    .line 73
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    check-cast v10, Ldefpackage/zp0;

    .line 78
    .line 79
    invoke-virtual {v10}, Ldefpackage/zp0;->b()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    if-lt v11, v3, :cond_16

    .line 84
    .line 85
    invoke-virtual {v10}, Ldefpackage/zp0;->a()I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    if-ge v11, v3, :cond_0

    .line 90
    .line 91
    goto/16 :goto_13

    .line 92
    .line 93
    :cond_0
    invoke-virtual {v10}, Ldefpackage/zp0;->b()I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    invoke-virtual {v10}, Ldefpackage/zp0;->a()I

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    add-int/2addr v13, v11

    .line 102
    add-int/2addr v13, v3

    .line 103
    div-int/lit8 v13, v13, 0x2

    .line 104
    .line 105
    iget v11, v10, Ldefpackage/zp0;->a:I

    .line 106
    .line 107
    add-int v14, v3, v8

    .line 108
    .line 109
    aput v11, v6, v14

    .line 110
    .line 111
    iget v11, v10, Ldefpackage/zp0;->b:I

    .line 112
    .line 113
    aput v11, v2, v14

    .line 114
    .line 115
    move v11, v7

    .line 116
    :goto_1
    if-ge v11, v13, :cond_16

    .line 117
    .line 118
    invoke-virtual {v10}, Ldefpackage/zp0;->b()I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    invoke-virtual {v10}, Ldefpackage/zp0;->a()I

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    sub-int/2addr v14, v15

    .line 127
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    .line 128
    .line 129
    .line 130
    move-result v14

    .line 131
    rem-int/lit8 v14, v14, 0x2

    .line 132
    .line 133
    if-ne v14, v3, :cond_1

    .line 134
    .line 135
    move v14, v3

    .line 136
    goto :goto_2

    .line 137
    :cond_1
    move v14, v7

    .line 138
    :goto_2
    invoke-virtual {v10}, Ldefpackage/zp0;->b()I

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    invoke-virtual {v10}, Ldefpackage/zp0;->a()I

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    sub-int v15, v15, v16

    .line 147
    .line 148
    neg-int v12, v11

    .line 149
    move v3, v12

    .line 150
    :goto_3
    if-gt v3, v11, :cond_a

    .line 151
    .line 152
    if-eq v3, v12, :cond_4

    .line 153
    .line 154
    if-eq v3, v11, :cond_2

    .line 155
    .line 156
    add-int/lit8 v18, v3, 0x1

    .line 157
    .line 158
    add-int v18, v18, v8

    .line 159
    .line 160
    aget v7, v6, v18

    .line 161
    .line 162
    add-int/lit8 v18, v3, -0x1

    .line 163
    .line 164
    add-int v18, v18, v8

    .line 165
    .line 166
    move/from16 v19, v3

    .line 167
    .line 168
    aget v3, v6, v18

    .line 169
    .line 170
    if-le v7, v3, :cond_3

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_2
    move/from16 v19, v3

    .line 174
    .line 175
    :cond_3
    add-int/lit8 v3, v19, -0x1

    .line 176
    .line 177
    add-int/2addr v3, v8

    .line 178
    aget v3, v6, v3

    .line 179
    .line 180
    add-int/lit8 v7, v3, 0x1

    .line 181
    .line 182
    :goto_4
    move/from16 v18, v8

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_4
    move/from16 v19, v3

    .line 186
    .line 187
    :goto_5
    add-int/lit8 v3, v19, 0x1

    .line 188
    .line 189
    add-int/2addr v3, v8

    .line 190
    aget v3, v6, v3

    .line 191
    .line 192
    move v7, v3

    .line 193
    goto :goto_4

    .line 194
    :goto_6
    iget v8, v10, Ldefpackage/zp0;->c:I

    .line 195
    .line 196
    move/from16 v20, v8

    .line 197
    .line 198
    iget v8, v10, Ldefpackage/zp0;->a:I

    .line 199
    .line 200
    sub-int v8, v7, v8

    .line 201
    .line 202
    add-int v8, v8, v20

    .line 203
    .line 204
    sub-int v8, v8, v19

    .line 205
    .line 206
    if-eqz v11, :cond_6

    .line 207
    .line 208
    if-eq v7, v3, :cond_5

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_5
    add-int/lit8 v20, v8, -0x1

    .line 212
    .line 213
    move/from16 v23, v20

    .line 214
    .line 215
    move/from16 v20, v7

    .line 216
    .line 217
    move/from16 v7, v23

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_6
    :goto_7
    move/from16 v20, v7

    .line 221
    .line 222
    move v7, v8

    .line 223
    :goto_8
    move/from16 v21, v13

    .line 224
    .line 225
    move v13, v8

    .line 226
    move/from16 v8, v20

    .line 227
    .line 228
    move/from16 v20, v21

    .line 229
    .line 230
    move/from16 v21, v14

    .line 231
    .line 232
    :goto_9
    iget v14, v10, Ldefpackage/zp0;->b:I

    .line 233
    .line 234
    if-ge v8, v14, :cond_7

    .line 235
    .line 236
    iget v14, v10, Ldefpackage/zp0;->d:I

    .line 237
    .line 238
    if-ge v13, v14, :cond_7

    .line 239
    .line 240
    invoke-virtual {v1, v8, v13}, Ldefpackage/zg5;->m(II)Z

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    if-eqz v14, :cond_7

    .line 245
    .line 246
    add-int/lit8 v8, v8, 0x1

    .line 247
    .line 248
    add-int/lit8 v13, v13, 0x1

    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_7
    add-int v14, v19, v18

    .line 252
    .line 253
    aput v8, v6, v14

    .line 254
    .line 255
    if-eqz v21, :cond_8

    .line 256
    .line 257
    sub-int v14, v15, v19

    .line 258
    .line 259
    move/from16 v22, v15

    .line 260
    .line 261
    add-int/lit8 v15, v12, 0x1

    .line 262
    .line 263
    if-lt v14, v15, :cond_9

    .line 264
    .line 265
    add-int/lit8 v15, v11, -0x1

    .line 266
    .line 267
    if-gt v14, v15, :cond_9

    .line 268
    .line 269
    add-int v14, v14, v18

    .line 270
    .line 271
    aget v14, v2, v14

    .line 272
    .line 273
    if-gt v14, v8, :cond_9

    .line 274
    .line 275
    new-instance v14, Ldefpackage/aq0;

    .line 276
    .line 277
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    iput v3, v14, Ldefpackage/aq0;->a:I

    .line 281
    .line 282
    iput v7, v14, Ldefpackage/aq0;->b:I

    .line 283
    .line 284
    iput v8, v14, Ldefpackage/aq0;->c:I

    .line 285
    .line 286
    iput v13, v14, Ldefpackage/aq0;->d:I

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    iput-boolean v3, v14, Ldefpackage/aq0;->e:Z

    .line 290
    .line 291
    goto :goto_a

    .line 292
    :cond_8
    move/from16 v22, v15

    .line 293
    .line 294
    :cond_9
    add-int/lit8 v3, v19, 0x2

    .line 295
    .line 296
    move/from16 v8, v18

    .line 297
    .line 298
    move/from16 v13, v20

    .line 299
    .line 300
    move/from16 v14, v21

    .line 301
    .line 302
    move/from16 v15, v22

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    goto/16 :goto_3

    .line 306
    .line 307
    :cond_a
    move/from16 v18, v8

    .line 308
    .line 309
    move/from16 v20, v13

    .line 310
    .line 311
    const/4 v14, 0x0

    .line 312
    :goto_a
    if-eqz v14, :cond_b

    .line 313
    .line 314
    move-object v12, v14

    .line 315
    goto/16 :goto_14

    .line 316
    .line 317
    :cond_b
    invoke-virtual {v10}, Ldefpackage/zp0;->b()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    invoke-virtual {v10}, Ldefpackage/zp0;->a()I

    .line 322
    .line 323
    .line 324
    move-result v7

    .line 325
    sub-int/2addr v3, v7

    .line 326
    rem-int/lit8 v3, v3, 0x2

    .line 327
    .line 328
    if-nez v3, :cond_c

    .line 329
    .line 330
    const/4 v3, 0x1

    .line 331
    goto :goto_b

    .line 332
    :cond_c
    const/4 v3, 0x0

    .line 333
    :goto_b
    invoke-virtual {v10}, Ldefpackage/zp0;->b()I

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    invoke-virtual {v10}, Ldefpackage/zp0;->a()I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    sub-int/2addr v7, v8

    .line 342
    move v8, v12

    .line 343
    :goto_c
    if-gt v8, v11, :cond_14

    .line 344
    .line 345
    if-eq v8, v12, :cond_e

    .line 346
    .line 347
    if-eq v8, v11, :cond_d

    .line 348
    .line 349
    add-int/lit8 v13, v8, 0x1

    .line 350
    .line 351
    add-int v13, v13, v18

    .line 352
    .line 353
    aget v13, v2, v13

    .line 354
    .line 355
    add-int/lit8 v14, v8, -0x1

    .line 356
    .line 357
    add-int v14, v14, v18

    .line 358
    .line 359
    aget v14, v2, v14

    .line 360
    .line 361
    if-ge v13, v14, :cond_d

    .line 362
    .line 363
    goto :goto_d

    .line 364
    :cond_d
    add-int/lit8 v13, v8, -0x1

    .line 365
    .line 366
    add-int v13, v13, v18

    .line 367
    .line 368
    aget v13, v2, v13

    .line 369
    .line 370
    add-int/lit8 v14, v13, -0x1

    .line 371
    .line 372
    goto :goto_e

    .line 373
    :cond_e
    :goto_d
    add-int/lit8 v13, v8, 0x1

    .line 374
    .line 375
    add-int v13, v13, v18

    .line 376
    .line 377
    aget v13, v2, v13

    .line 378
    .line 379
    move v14, v13

    .line 380
    :goto_e
    iget v15, v10, Ldefpackage/zp0;->d:I

    .line 381
    .line 382
    move/from16 v19, v3

    .line 383
    .line 384
    iget v3, v10, Ldefpackage/zp0;->b:I

    .line 385
    .line 386
    sub-int/2addr v3, v14

    .line 387
    sub-int/2addr v3, v8

    .line 388
    sub-int/2addr v15, v3

    .line 389
    if-eqz v11, :cond_10

    .line 390
    .line 391
    if-eq v14, v13, :cond_f

    .line 392
    .line 393
    goto :goto_f

    .line 394
    :cond_f
    add-int/lit8 v3, v15, 0x1

    .line 395
    .line 396
    goto :goto_10

    .line 397
    :cond_10
    :goto_f
    move v3, v15

    .line 398
    :goto_10
    move/from16 v21, v7

    .line 399
    .line 400
    :goto_11
    iget v7, v10, Ldefpackage/zp0;->a:I

    .line 401
    .line 402
    if-le v14, v7, :cond_11

    .line 403
    .line 404
    iget v7, v10, Ldefpackage/zp0;->c:I

    .line 405
    .line 406
    if-le v15, v7, :cond_11

    .line 407
    .line 408
    add-int/lit8 v7, v14, -0x1

    .line 409
    .line 410
    move/from16 v22, v8

    .line 411
    .line 412
    add-int/lit8 v8, v15, -0x1

    .line 413
    .line 414
    invoke-virtual {v1, v7, v8}, Ldefpackage/zg5;->m(II)Z

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    if-eqz v7, :cond_12

    .line 419
    .line 420
    add-int/lit8 v14, v14, -0x1

    .line 421
    .line 422
    add-int/lit8 v15, v15, -0x1

    .line 423
    .line 424
    move/from16 v8, v22

    .line 425
    .line 426
    goto :goto_11

    .line 427
    :cond_11
    move/from16 v22, v8

    .line 428
    .line 429
    :cond_12
    add-int v8, v22, v18

    .line 430
    .line 431
    aput v14, v2, v8

    .line 432
    .line 433
    if-eqz v19, :cond_13

    .line 434
    .line 435
    sub-int v7, v21, v22

    .line 436
    .line 437
    if-lt v7, v12, :cond_13

    .line 438
    .line 439
    if-gt v7, v11, :cond_13

    .line 440
    .line 441
    add-int v7, v7, v18

    .line 442
    .line 443
    aget v7, v6, v7

    .line 444
    .line 445
    if-lt v7, v14, :cond_13

    .line 446
    .line 447
    new-instance v7, Ldefpackage/aq0;

    .line 448
    .line 449
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 450
    .line 451
    .line 452
    iput v14, v7, Ldefpackage/aq0;->a:I

    .line 453
    .line 454
    iput v15, v7, Ldefpackage/aq0;->b:I

    .line 455
    .line 456
    iput v13, v7, Ldefpackage/aq0;->c:I

    .line 457
    .line 458
    iput v3, v7, Ldefpackage/aq0;->d:I

    .line 459
    .line 460
    const/4 v3, 0x1

    .line 461
    iput-boolean v3, v7, Ldefpackage/aq0;->e:Z

    .line 462
    .line 463
    goto :goto_12

    .line 464
    :cond_13
    add-int/lit8 v8, v22, 0x2

    .line 465
    .line 466
    move/from16 v3, v19

    .line 467
    .line 468
    move/from16 v7, v21

    .line 469
    .line 470
    goto :goto_c

    .line 471
    :cond_14
    const/4 v7, 0x0

    .line 472
    :goto_12
    if-eqz v7, :cond_15

    .line 473
    .line 474
    move-object v12, v7

    .line 475
    goto :goto_14

    .line 476
    :cond_15
    add-int/lit8 v11, v11, 0x1

    .line 477
    .line 478
    move/from16 v8, v18

    .line 479
    .line 480
    move/from16 v13, v20

    .line 481
    .line 482
    const/4 v3, 0x1

    .line 483
    const/4 v7, 0x0

    .line 484
    goto/16 :goto_1

    .line 485
    .line 486
    :cond_16
    :goto_13
    move/from16 v18, v8

    .line 487
    .line 488
    const/4 v12, 0x0

    .line 489
    :goto_14
    if-eqz v12, :cond_1c

    .line 490
    .line 491
    invoke-virtual {v12}, Ldefpackage/aq0;->a()I

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-lez v3, :cond_1a

    .line 496
    .line 497
    iget v3, v12, Ldefpackage/aq0;->d:I

    .line 498
    .line 499
    iget v7, v12, Ldefpackage/aq0;->b:I

    .line 500
    .line 501
    sub-int/2addr v3, v7

    .line 502
    iget v8, v12, Ldefpackage/aq0;->c:I

    .line 503
    .line 504
    iget v11, v12, Ldefpackage/aq0;->a:I

    .line 505
    .line 506
    sub-int/2addr v8, v11

    .line 507
    if-eq v3, v8, :cond_19

    .line 508
    .line 509
    iget-boolean v13, v12, Ldefpackage/aq0;->e:Z

    .line 510
    .line 511
    if-eqz v13, :cond_17

    .line 512
    .line 513
    new-instance v3, Ldefpackage/wp0;

    .line 514
    .line 515
    invoke-virtual {v12}, Ldefpackage/aq0;->a()I

    .line 516
    .line 517
    .line 518
    move-result v8

    .line 519
    invoke-direct {v3, v11, v7, v8}, Ldefpackage/wp0;-><init>(III)V

    .line 520
    .line 521
    .line 522
    goto :goto_15

    .line 523
    :cond_17
    if-le v3, v8, :cond_18

    .line 524
    .line 525
    new-instance v3, Ldefpackage/wp0;

    .line 526
    .line 527
    add-int/lit8 v7, v7, 0x1

    .line 528
    .line 529
    invoke-virtual {v12}, Ldefpackage/aq0;->a()I

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    invoke-direct {v3, v11, v7, v8}, Ldefpackage/wp0;-><init>(III)V

    .line 534
    .line 535
    .line 536
    goto :goto_15

    .line 537
    :cond_18
    new-instance v3, Ldefpackage/wp0;

    .line 538
    .line 539
    add-int/lit8 v11, v11, 0x1

    .line 540
    .line 541
    invoke-virtual {v12}, Ldefpackage/aq0;->a()I

    .line 542
    .line 543
    .line 544
    move-result v8

    .line 545
    invoke-direct {v3, v11, v7, v8}, Ldefpackage/wp0;-><init>(III)V

    .line 546
    .line 547
    .line 548
    goto :goto_15

    .line 549
    :cond_19
    new-instance v3, Ldefpackage/wp0;

    .line 550
    .line 551
    invoke-direct {v3, v11, v7, v8}, Ldefpackage/wp0;-><init>(III)V

    .line 552
    .line 553
    .line 554
    :goto_15
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    :cond_1a
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    if-eqz v3, :cond_1b

    .line 562
    .line 563
    new-instance v3, Ldefpackage/zp0;

    .line 564
    .line 565
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 566
    .line 567
    .line 568
    const/16 v17, 0x1

    .line 569
    .line 570
    goto :goto_16

    .line 571
    :cond_1b
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 572
    .line 573
    .line 574
    move-result v3

    .line 575
    const/16 v17, 0x1

    .line 576
    .line 577
    add-int/lit8 v3, v3, -0x1

    .line 578
    .line 579
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    check-cast v3, Ldefpackage/zp0;

    .line 584
    .line 585
    :goto_16
    iget v7, v10, Ldefpackage/zp0;->a:I

    .line 586
    .line 587
    iput v7, v3, Ldefpackage/zp0;->a:I

    .line 588
    .line 589
    iget v7, v10, Ldefpackage/zp0;->c:I

    .line 590
    .line 591
    iput v7, v3, Ldefpackage/zp0;->c:I

    .line 592
    .line 593
    iget v7, v12, Ldefpackage/aq0;->a:I

    .line 594
    .line 595
    iput v7, v3, Ldefpackage/zp0;->b:I

    .line 596
    .line 597
    iget v7, v12, Ldefpackage/aq0;->b:I

    .line 598
    .line 599
    iput v7, v3, Ldefpackage/zp0;->d:I

    .line 600
    .line 601
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    iget v3, v10, Ldefpackage/zp0;->b:I

    .line 605
    .line 606
    iput v3, v10, Ldefpackage/zp0;->b:I

    .line 607
    .line 608
    iget v3, v10, Ldefpackage/zp0;->d:I

    .line 609
    .line 610
    iput v3, v10, Ldefpackage/zp0;->d:I

    .line 611
    .line 612
    iget v3, v12, Ldefpackage/aq0;->c:I

    .line 613
    .line 614
    iput v3, v10, Ldefpackage/zp0;->a:I

    .line 615
    .line 616
    iget v3, v12, Ldefpackage/aq0;->d:I

    .line 617
    .line 618
    iput v3, v10, Ldefpackage/zp0;->c:I

    .line 619
    .line 620
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    goto :goto_17

    .line 624
    :cond_1c
    const/16 v17, 0x1

    .line 625
    .line 626
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    :goto_17
    move/from16 v3, v17

    .line 630
    .line 631
    move/from16 v8, v18

    .line 632
    .line 633
    const/4 v7, 0x0

    .line 634
    goto/16 :goto_0

    .line 635
    .line 636
    :cond_1d
    sget-object v3, Ldefpackage/jz4;->a:Ldefpackage/ca1;

    .line 637
    .line 638
    invoke-static {v4, v3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 639
    .line 640
    .line 641
    new-instance v3, Ldefpackage/xp0;

    .line 642
    .line 643
    invoke-direct {v3, v1, v4, v6, v2}, Ldefpackage/xp0;-><init>(Ldefpackage/zg5;Ljava/util/ArrayList;[I[I)V

    .line 644
    .line 645
    .line 646
    iget-object v1, v0, Ldefpackage/nk;->r:Ldefpackage/pk;

    .line 647
    .line 648
    iget-object v1, v1, Ldefpackage/pk;->c:Ldefpackage/ok;

    .line 649
    .line 650
    new-instance v2, Ldefpackage/lg1;

    .line 651
    .line 652
    const/4 v4, 0x5

    .line 653
    const/4 v5, 0x0

    .line 654
    invoke-direct {v2, v0, v3, v5, v4}, Ldefpackage/lg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1, v2}, Ldefpackage/ok;->execute(Ljava/lang/Runnable;)V

    .line 658
    .line 659
    .line 660
    return-void
.end method
