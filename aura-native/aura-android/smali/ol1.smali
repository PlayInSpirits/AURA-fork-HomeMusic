.class public final Lol1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D

.field public final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lol1;->d:I

    .line 5
    .line 6
    invoke-static {p1}, Lsy;->a(I)Lsy;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-wide v1, v0, Lsy;->a:D

    .line 11
    .line 12
    iput-wide v1, p0, Lol1;->a:D

    .line 13
    .line 14
    iget-wide v0, v0, Lsy;->b:D

    .line 15
    .line 16
    iput-wide v0, p0, Lol1;->b:D

    .line 17
    .line 18
    shr-int/lit8 v0, p1, 0x10

    .line 19
    .line 20
    and-int/lit16 v0, v0, 0xff

    .line 21
    .line 22
    invoke-static {v0}, Lh12;->E(I)D

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    shr-int/lit8 v2, p1, 0x8

    .line 27
    .line 28
    and-int/lit16 v2, v2, 0xff

    .line 29
    .line 30
    invoke-static {v2}, Lh12;->E(I)D

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    and-int/lit16 p1, p1, 0xff

    .line 35
    .line 36
    invoke-static {p1}, Lh12;->E(I)D

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    const/4 p1, 0x3

    .line 41
    new-array p1, p1, [D

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    aput-wide v0, p1, v6

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    aput-wide v2, p1, v0

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aput-wide v4, p1, v1

    .line 51
    .line 52
    sget-object v1, Lh12;->a:[[D

    .line 53
    .line 54
    invoke-static {p1, v1}, Lud3;->a0([D[[D)[D

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    aget-wide v0, p1, v0

    .line 59
    .line 60
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 61
    .line 62
    div-double/2addr v0, v2

    .line 63
    invoke-static {v0, v1}, Lh12;->B(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    const-wide/high16 v2, 0x405d000000000000L    # 116.0

    .line 68
    .line 69
    mul-double/2addr v0, v2

    .line 70
    const-wide/high16 v2, 0x4030000000000000L    # 16.0

    .line 71
    .line 72
    sub-double/2addr v0, v2

    .line 73
    iput-wide v0, p0, Lol1;->c:D

    .line 74
    .line 75
    return-void
.end method

.method public static a(DDD)Lol1;
    .locals 45

    .line 1
    sget-object v0, Lj51;->e:[D

    .line 2
    .line 3
    const-wide v1, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmpg-double v3, p2, v1

    .line 9
    .line 10
    if-ltz v3, :cond_0

    .line 11
    .line 12
    cmpg-double v1, p4, v1

    .line 13
    .line 14
    if-ltz v1, :cond_0

    .line 15
    .line 16
    const-wide v1, 0x4058fffe5c91d14eL    # 99.9999

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmpl-double v1, p4, v1

    .line 22
    .line 23
    if-lez v1, :cond_1

    .line 24
    .line 25
    :cond_0
    const/high16 v29, -0x1000000

    .line 26
    .line 27
    goto/16 :goto_18

    .line 28
    .line 29
    :cond_1
    const-wide v1, 0x4076800000000000L    # 360.0

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    rem-double v5, p0, v1

    .line 35
    .line 36
    const-wide/16 v7, 0x0

    .line 37
    .line 38
    cmpg-double v3, v5, v7

    .line 39
    .line 40
    if-gez v3, :cond_2

    .line 41
    .line 42
    add-double/2addr v5, v1

    .line 43
    :cond_2
    const-wide v1, 0x4066800000000000L    # 180.0

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    div-double/2addr v5, v1

    .line 49
    const-wide v1, 0x400921fb54442d18L    # Math.PI

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    mul-double/2addr v5, v1

    .line 55
    invoke-static/range {p4 .. p5}, Lh12;->R(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    const-wide/high16 v11, 0x4026000000000000L    # 11.0

    .line 64
    .line 65
    mul-double/2addr v9, v11

    .line 66
    sget-object v3, Lh85;->k:Lh85;

    .line 67
    .line 68
    const-wide v13, 0x3fd28f5c28f5c28fL    # 0.29

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    move-wide/from16 p0, v5

    .line 74
    .line 75
    const/high16 v15, -0x1000000

    .line 76
    .line 77
    iget-wide v4, v3, Lh85;->f:D

    .line 78
    .line 79
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    const-wide v13, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    sub-double/2addr v13, v4

    .line 89
    const-wide v4, 0x3fe75c28f5c28f5cL    # 0.73

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 99
    .line 100
    div-double v4, v13, v4

    .line 101
    .line 102
    const-wide/high16 v16, 0x4000000000000000L    # 2.0

    .line 103
    .line 104
    add-double v18, p0, v16

    .line 105
    .line 106
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    .line 107
    .line 108
    .line 109
    move-result-wide v18

    .line 110
    const-wide v20, 0x400e666666666666L    # 3.8

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    add-double v18, v18, v20

    .line 116
    .line 117
    const-wide/high16 v20, 0x3fd0000000000000L    # 0.25

    .line 118
    .line 119
    mul-double v18, v18, v20

    .line 120
    .line 121
    const-wide v20, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    mul-double v18, v18, v20

    .line 127
    .line 128
    move-wide/from16 v20, v7

    .line 129
    .line 130
    iget-wide v7, v3, Lh85;->e:D

    .line 131
    .line 132
    mul-double v18, v18, v7

    .line 133
    .line 134
    iget-wide v6, v3, Lh85;->c:D

    .line 135
    .line 136
    mul-double v18, v18, v6

    .line 137
    .line 138
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->sin(D)D

    .line 139
    .line 140
    .line 141
    move-result-wide v6

    .line 142
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->cos(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v22

    .line 146
    move-wide/from16 p4, v11

    .line 147
    .line 148
    const/4 v8, 0x0

    .line 149
    const/16 v24, 0x0

    .line 150
    .line 151
    :goto_0
    const/4 v11, 0x5

    .line 152
    move-wide/from16 v25, v13

    .line 153
    .line 154
    const-wide/high16 v27, 0x4059000000000000L    # 100.0

    .line 155
    .line 156
    move/from16 v29, v15

    .line 157
    .line 158
    const/16 v30, 0x2

    .line 159
    .line 160
    if-ge v8, v11, :cond_b

    .line 161
    .line 162
    const/16 v11, 0x8

    .line 163
    .line 164
    div-double v13, v9, v27

    .line 165
    .line 166
    cmpl-double v31, p2, v20

    .line 167
    .line 168
    if-eqz v31, :cond_4

    .line 169
    .line 170
    cmpl-double v31, v9, v20

    .line 171
    .line 172
    if-nez v31, :cond_3

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_3
    invoke-static {v13, v14}, Ljava/lang/Math;->sqrt(D)D

    .line 176
    .line 177
    .line 178
    move-result-wide v31

    .line 179
    div-double v31, p2, v31

    .line 180
    .line 181
    :goto_1
    move/from16 v34, v11

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_4
    :goto_2
    move-wide/from16 v31, v20

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :goto_3
    mul-double v11, v31, v4

    .line 188
    .line 189
    move-object/from16 v31, v0

    .line 190
    .line 191
    move-wide/from16 v35, v1

    .line 192
    .line 193
    const-wide v0, 0x3ff1c71c71c71c72L    # 1.1111111111111112

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    invoke-static {v11, v12, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 199
    .line 200
    .line 201
    move-result-wide v0

    .line 202
    iget-wide v11, v3, Lh85;->a:D

    .line 203
    .line 204
    move-wide/from16 v37, v0

    .line 205
    .line 206
    iget-wide v0, v3, Lh85;->d:D

    .line 207
    .line 208
    div-double v0, v25, v0

    .line 209
    .line 210
    move-wide/from16 v39, v0

    .line 211
    .line 212
    iget-wide v0, v3, Lh85;->j:D

    .line 213
    .line 214
    div-double v0, v39, v0

    .line 215
    .line 216
    invoke-static {v13, v14, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 217
    .line 218
    .line 219
    move-result-wide v0

    .line 220
    mul-double/2addr v0, v11

    .line 221
    iget-wide v11, v3, Lh85;->b:D

    .line 222
    .line 223
    div-double/2addr v0, v11

    .line 224
    const-wide v11, 0x3fd3851eb851eb85L    # 0.305

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    add-double/2addr v11, v0

    .line 230
    const-wide/high16 v13, 0x4037000000000000L    # 23.0

    .line 231
    .line 232
    mul-double/2addr v11, v13

    .line 233
    mul-double v11, v11, v37

    .line 234
    .line 235
    mul-double v13, v13, v18

    .line 236
    .line 237
    mul-double v39, v37, p4

    .line 238
    .line 239
    mul-double v39, v39, v22

    .line 240
    .line 241
    add-double v39, v39, v13

    .line 242
    .line 243
    const-wide/high16 v13, 0x405b000000000000L    # 108.0

    .line 244
    .line 245
    mul-double v13, v13, v37

    .line 246
    .line 247
    mul-double/2addr v13, v6

    .line 248
    add-double v13, v13, v39

    .line 249
    .line 250
    div-double/2addr v11, v13

    .line 251
    mul-double v13, v11, v22

    .line 252
    .line 253
    mul-double/2addr v11, v6

    .line 254
    const-wide v37, 0x407cc00000000000L    # 460.0

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    mul-double v0, v0, v37

    .line 260
    .line 261
    const-wide v37, 0x407c300000000000L    # 451.0

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    mul-double v37, v37, v13

    .line 267
    .line 268
    add-double v37, v37, v0

    .line 269
    .line 270
    const-wide/high16 v39, 0x4072000000000000L    # 288.0

    .line 271
    .line 272
    mul-double v39, v39, v11

    .line 273
    .line 274
    add-double v39, v39, v37

    .line 275
    .line 276
    const-wide v37, 0x4095ec0000000000L    # 1403.0

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    div-double v39, v39, v37

    .line 282
    .line 283
    const-wide v41, 0x408bd80000000000L    # 891.0

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    mul-double v41, v41, v13

    .line 289
    .line 290
    sub-double v41, v0, v41

    .line 291
    .line 292
    const-wide v43, 0x4070500000000000L    # 261.0

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    mul-double v43, v43, v11

    .line 298
    .line 299
    sub-double v41, v41, v43

    .line 300
    .line 301
    div-double v41, v41, v37

    .line 302
    .line 303
    const-wide v43, 0x406b800000000000L    # 220.0

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    mul-double v13, v13, v43

    .line 309
    .line 310
    sub-double/2addr v0, v13

    .line 311
    const-wide v13, 0x40b89c0000000000L    # 6300.0

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    mul-double/2addr v11, v13

    .line 317
    sub-double/2addr v0, v11

    .line 318
    div-double v0, v0, v37

    .line 319
    .line 320
    invoke-static/range {v39 .. v40}, Lj51;->A(D)D

    .line 321
    .line 322
    .line 323
    move-result-wide v11

    .line 324
    invoke-static/range {v41 .. v42}, Lj51;->A(D)D

    .line 325
    .line 326
    .line 327
    move-result-wide v13

    .line 328
    invoke-static {v0, v1}, Lj51;->A(D)D

    .line 329
    .line 330
    .line 331
    move-result-wide v0

    .line 332
    const/4 v2, 0x3

    .line 333
    const/16 v32, 0x1

    .line 334
    .line 335
    new-array v15, v2, [D

    .line 336
    .line 337
    aput-wide v11, v15, v24

    .line 338
    .line 339
    aput-wide v13, v15, v32

    .line 340
    .line 341
    aput-wide v0, v15, v30

    .line 342
    .line 343
    sget-object v0, Lj51;->d:[[D

    .line 344
    .line 345
    invoke-static {v15, v0}, Lud3;->a0([D[[D)[D

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    aget-wide v1, v0, v24

    .line 350
    .line 351
    cmpg-double v11, v1, v20

    .line 352
    .line 353
    if-ltz v11, :cond_6

    .line 354
    .line 355
    aget-wide v11, v0, v32

    .line 356
    .line 357
    cmpg-double v13, v11, v20

    .line 358
    .line 359
    if-ltz v13, :cond_6

    .line 360
    .line 361
    aget-wide v13, v0, v30

    .line 362
    .line 363
    cmpg-double v15, v13, v20

    .line 364
    .line 365
    if-gez v15, :cond_5

    .line 366
    .line 367
    goto :goto_4

    .line 368
    :cond_5
    aget-wide v37, v31, v24

    .line 369
    .line 370
    aget-wide v39, v31, v32

    .line 371
    .line 372
    aget-wide v41, v31, v30

    .line 373
    .line 374
    mul-double v37, v37, v1

    .line 375
    .line 376
    mul-double v39, v39, v11

    .line 377
    .line 378
    add-double v39, v39, v37

    .line 379
    .line 380
    mul-double v41, v41, v13

    .line 381
    .line 382
    add-double v41, v41, v39

    .line 383
    .line 384
    cmpg-double v1, v41, v20

    .line 385
    .line 386
    if-gtz v1, :cond_7

    .line 387
    .line 388
    :cond_6
    :goto_4
    move/from16 v0, v24

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_7
    const/4 v1, 0x4

    .line 392
    if-eq v8, v1, :cond_9

    .line 393
    .line 394
    sub-double v1, v41, v35

    .line 395
    .line 396
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 397
    .line 398
    .line 399
    move-result-wide v11

    .line 400
    const-wide v13, 0x3f60624dd2f1a9fcL    # 0.002

    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    cmpg-double v11, v11, v13

    .line 406
    .line 407
    if-gez v11, :cond_8

    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_8
    mul-double/2addr v1, v9

    .line 411
    mul-double v41, v41, v16

    .line 412
    .line 413
    div-double v1, v1, v41

    .line 414
    .line 415
    sub-double/2addr v9, v1

    .line 416
    add-int/lit8 v8, v8, 0x1

    .line 417
    .line 418
    move-wide/from16 v13, v25

    .line 419
    .line 420
    move/from16 v15, v29

    .line 421
    .line 422
    move-object/from16 v0, v31

    .line 423
    .line 424
    move-wide/from16 v1, v35

    .line 425
    .line 426
    goto/16 :goto_0

    .line 427
    .line 428
    :cond_9
    :goto_5
    aget-wide v1, v0, v24

    .line 429
    .line 430
    const-wide v3, 0x405900a3d70a3d71L    # 100.01

    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    cmpl-double v5, v1, v3

    .line 436
    .line 437
    if-gtz v5, :cond_6

    .line 438
    .line 439
    aget-wide v5, v0, v32

    .line 440
    .line 441
    cmpl-double v5, v5, v3

    .line 442
    .line 443
    if-gtz v5, :cond_6

    .line 444
    .line 445
    aget-wide v5, v0, v30

    .line 446
    .line 447
    cmpl-double v3, v5, v3

    .line 448
    .line 449
    if-lez v3, :cond_a

    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_a
    invoke-static {v1, v2}, Lh12;->l(D)I

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    aget-wide v2, v0, v32

    .line 457
    .line 458
    invoke-static {v2, v3}, Lh12;->l(D)I

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    aget-wide v3, v0, v30

    .line 463
    .line 464
    invoke-static {v3, v4}, Lh12;->l(D)I

    .line 465
    .line 466
    .line 467
    move-result v0

    .line 468
    and-int/lit16 v1, v1, 0xff

    .line 469
    .line 470
    shl-int/lit8 v1, v1, 0x10

    .line 471
    .line 472
    or-int v1, v1, v29

    .line 473
    .line 474
    and-int/lit16 v2, v2, 0xff

    .line 475
    .line 476
    shl-int/lit8 v2, v2, 0x8

    .line 477
    .line 478
    or-int/2addr v1, v2

    .line 479
    and-int/lit16 v0, v0, 0xff

    .line 480
    .line 481
    or-int/2addr v0, v1

    .line 482
    goto :goto_6

    .line 483
    :cond_b
    move-object/from16 v31, v0

    .line 484
    .line 485
    move-wide/from16 v35, v1

    .line 486
    .line 487
    const/16 v32, 0x1

    .line 488
    .line 489
    const/16 v34, 0x8

    .line 490
    .line 491
    goto :goto_4

    .line 492
    :goto_6
    if-eqz v0, :cond_c

    .line 493
    .line 494
    goto/16 :goto_19

    .line 495
    .line 496
    :cond_c
    const/4 v2, 0x3

    .line 497
    new-array v0, v2, [D

    .line 498
    .line 499
    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    .line 500
    .line 501
    aput-wide v1, v0, v24

    .line 502
    .line 503
    aput-wide v1, v0, v32

    .line 504
    .line 505
    aput-wide v1, v0, v30

    .line 506
    .line 507
    move-object v1, v0

    .line 508
    move-wide/from16 v5, v20

    .line 509
    .line 510
    move-wide v9, v5

    .line 511
    move/from16 v2, v24

    .line 512
    .line 513
    move v4, v2

    .line 514
    move/from16 v3, v32

    .line 515
    .line 516
    :goto_7
    const/16 v7, 0xc

    .line 517
    .line 518
    if-ge v4, v7, :cond_19

    .line 519
    .line 520
    aget-wide v7, v31, v24

    .line 521
    .line 522
    aget-wide v12, v31, v32

    .line 523
    .line 524
    aget-wide v14, v31, v30

    .line 525
    .line 526
    rem-int/lit8 v11, v4, 0x4

    .line 527
    .line 528
    move/from16 v18, v2

    .line 529
    .line 530
    move/from16 v2, v32

    .line 531
    .line 532
    if-gt v11, v2, :cond_d

    .line 533
    .line 534
    move-wide/from16 v22, v20

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_d
    move-wide/from16 v22, v27

    .line 538
    .line 539
    :goto_8
    rem-int/lit8 v2, v4, 0x2

    .line 540
    .line 541
    if-nez v2, :cond_e

    .line 542
    .line 543
    move-wide/from16 v25, v20

    .line 544
    .line 545
    :goto_9
    const/4 v2, 0x4

    .line 546
    goto :goto_a

    .line 547
    :cond_e
    move-wide/from16 v25, v27

    .line 548
    .line 549
    goto :goto_9

    .line 550
    :goto_a
    if-ge v4, v2, :cond_10

    .line 551
    .line 552
    mul-double v12, v12, v22

    .line 553
    .line 554
    sub-double v11, v35, v12

    .line 555
    .line 556
    mul-double v14, v14, v25

    .line 557
    .line 558
    sub-double/2addr v11, v14

    .line 559
    div-double/2addr v11, v7

    .line 560
    invoke-static {v11, v12}, Lj51;->B(D)Z

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    if-eqz v7, :cond_f

    .line 565
    .line 566
    const/4 v7, 0x3

    .line 567
    new-array v8, v7, [D

    .line 568
    .line 569
    aput-wide v11, v8, v24

    .line 570
    .line 571
    const/16 v32, 0x1

    .line 572
    .line 573
    aput-wide v22, v8, v32

    .line 574
    .line 575
    aput-wide v25, v8, v30

    .line 576
    .line 577
    :goto_b
    move-object v12, v8

    .line 578
    goto :goto_c

    .line 579
    :cond_f
    const/4 v7, 0x3

    .line 580
    new-array v8, v7, [D

    .line 581
    .line 582
    fill-array-data v8, :array_0

    .line 583
    .line 584
    .line 585
    goto :goto_b

    .line 586
    :cond_10
    move/from16 v11, v34

    .line 587
    .line 588
    const/16 v33, 0x3

    .line 589
    .line 590
    if-ge v4, v11, :cond_12

    .line 591
    .line 592
    move/from16 v2, v33

    .line 593
    .line 594
    mul-double v7, v7, v25

    .line 595
    .line 596
    sub-double v7, v35, v7

    .line 597
    .line 598
    mul-double v14, v14, v22

    .line 599
    .line 600
    sub-double/2addr v7, v14

    .line 601
    div-double/2addr v7, v12

    .line 602
    invoke-static {v7, v8}, Lj51;->B(D)Z

    .line 603
    .line 604
    .line 605
    move-result v12

    .line 606
    if-eqz v12, :cond_11

    .line 607
    .line 608
    new-array v12, v2, [D

    .line 609
    .line 610
    aput-wide v25, v12, v24

    .line 611
    .line 612
    const/16 v32, 0x1

    .line 613
    .line 614
    aput-wide v7, v12, v32

    .line 615
    .line 616
    aput-wide v22, v12, v30

    .line 617
    .line 618
    goto :goto_c

    .line 619
    :cond_11
    new-array v8, v2, [D

    .line 620
    .line 621
    fill-array-data v8, :array_1

    .line 622
    .line 623
    .line 624
    goto :goto_b

    .line 625
    :cond_12
    move/from16 v2, v33

    .line 626
    .line 627
    mul-double v7, v7, v22

    .line 628
    .line 629
    sub-double v7, v35, v7

    .line 630
    .line 631
    mul-double v12, v12, v25

    .line 632
    .line 633
    sub-double/2addr v7, v12

    .line 634
    div-double/2addr v7, v14

    .line 635
    invoke-static {v7, v8}, Lj51;->B(D)Z

    .line 636
    .line 637
    .line 638
    move-result v12

    .line 639
    if-eqz v12, :cond_13

    .line 640
    .line 641
    new-array v12, v2, [D

    .line 642
    .line 643
    aput-wide v22, v12, v24

    .line 644
    .line 645
    const/16 v32, 0x1

    .line 646
    .line 647
    aput-wide v25, v12, v32

    .line 648
    .line 649
    aput-wide v7, v12, v30

    .line 650
    .line 651
    goto :goto_c

    .line 652
    :cond_13
    new-array v8, v2, [D

    .line 653
    .line 654
    fill-array-data v8, :array_2

    .line 655
    .line 656
    .line 657
    goto :goto_b

    .line 658
    :goto_c
    aget-wide v7, v12, v24

    .line 659
    .line 660
    cmpg-double v2, v7, v20

    .line 661
    .line 662
    if-gez v2, :cond_14

    .line 663
    .line 664
    goto :goto_d

    .line 665
    :cond_14
    invoke-static {v12}, Lj51;->y([D)D

    .line 666
    .line 667
    .line 668
    move-result-wide v7

    .line 669
    if-nez v18, :cond_15

    .line 670
    .line 671
    move-wide/from16 v13, p0

    .line 672
    .line 673
    move-wide v5, v7

    .line 674
    move-wide v9, v5

    .line 675
    move-object v0, v12

    .line 676
    move-object v1, v0

    .line 677
    const/4 v2, 0x1

    .line 678
    goto :goto_10

    .line 679
    :cond_15
    if-nez v3, :cond_16

    .line 680
    .line 681
    invoke-static/range {v5 .. v10}, Lj51;->i(DDD)Z

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    if-eqz v2, :cond_17

    .line 686
    .line 687
    :cond_16
    move-wide/from16 p2, p0

    .line 688
    .line 689
    move-wide/from16 p0, v5

    .line 690
    .line 691
    move-wide/from16 p4, v7

    .line 692
    .line 693
    goto :goto_e

    .line 694
    :cond_17
    :goto_d
    move-wide/from16 v13, p0

    .line 695
    .line 696
    move/from16 v2, v18

    .line 697
    .line 698
    goto :goto_10

    .line 699
    :goto_e
    invoke-static/range {p0 .. p5}, Lj51;->i(DDD)Z

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    move-wide/from16 v5, p0

    .line 704
    .line 705
    move-wide/from16 v13, p2

    .line 706
    .line 707
    move-wide/from16 v7, p4

    .line 708
    .line 709
    if-eqz v2, :cond_18

    .line 710
    .line 711
    move-wide v9, v7

    .line 712
    move-object v1, v12

    .line 713
    :goto_f
    move/from16 v2, v18

    .line 714
    .line 715
    move/from16 v3, v24

    .line 716
    .line 717
    goto :goto_10

    .line 718
    :cond_18
    move-wide v5, v7

    .line 719
    move-object v0, v12

    .line 720
    goto :goto_f

    .line 721
    :goto_10
    add-int/lit8 v4, v4, 0x1

    .line 722
    .line 723
    move-wide/from16 p0, v13

    .line 724
    .line 725
    const/16 v32, 0x1

    .line 726
    .line 727
    const/16 v34, 0x8

    .line 728
    .line 729
    goto/16 :goto_7

    .line 730
    .line 731
    :cond_19
    move-wide/from16 v13, p0

    .line 732
    .line 733
    filled-new-array {v0, v1}, [[D

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    aget-object v1, v0, v24

    .line 738
    .line 739
    invoke-static {v1}, Lj51;->y([D)D

    .line 740
    .line 741
    .line 742
    move-result-wide v2

    .line 743
    const/16 v32, 0x1

    .line 744
    .line 745
    aget-object v0, v0, v32

    .line 746
    .line 747
    move/from16 v4, v24

    .line 748
    .line 749
    :goto_11
    const/4 v7, 0x3

    .line 750
    if-ge v4, v7, :cond_1f

    .line 751
    .line 752
    aget-wide v5, v1, v4

    .line 753
    .line 754
    aget-wide v7, v0, v4

    .line 755
    .line 756
    cmpl-double v9, v5, v7

    .line 757
    .line 758
    if-eqz v9, :cond_1e

    .line 759
    .line 760
    cmpg-double v7, v5, v7

    .line 761
    .line 762
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 763
    .line 764
    if-gez v7, :cond_1a

    .line 765
    .line 766
    invoke-static {v5, v6}, Lj51;->S(D)D

    .line 767
    .line 768
    .line 769
    move-result-wide v5

    .line 770
    sub-double/2addr v5, v8

    .line 771
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 772
    .line 773
    .line 774
    move-result-wide v5

    .line 775
    double-to-int v5, v5

    .line 776
    aget-wide v6, v0, v4

    .line 777
    .line 778
    invoke-static {v6, v7}, Lj51;->S(D)D

    .line 779
    .line 780
    .line 781
    move-result-wide v6

    .line 782
    sub-double/2addr v6, v8

    .line 783
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 784
    .line 785
    .line 786
    move-result-wide v6

    .line 787
    :goto_12
    double-to-int v6, v6

    .line 788
    goto :goto_13

    .line 789
    :cond_1a
    invoke-static {v5, v6}, Lj51;->S(D)D

    .line 790
    .line 791
    .line 792
    move-result-wide v5

    .line 793
    sub-double/2addr v5, v8

    .line 794
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 795
    .line 796
    .line 797
    move-result-wide v5

    .line 798
    double-to-int v5, v5

    .line 799
    aget-wide v6, v0, v4

    .line 800
    .line 801
    invoke-static {v6, v7}, Lj51;->S(D)D

    .line 802
    .line 803
    .line 804
    move-result-wide v6

    .line 805
    sub-double/2addr v6, v8

    .line 806
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 807
    .line 808
    .line 809
    move-result-wide v6

    .line 810
    goto :goto_12

    .line 811
    :goto_13
    move/from16 v7, v24

    .line 812
    .line 813
    :goto_14
    const/16 v11, 0x8

    .line 814
    .line 815
    if-ge v7, v11, :cond_1b

    .line 816
    .line 817
    sub-int v8, v6, v5

    .line 818
    .line 819
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 820
    .line 821
    .line 822
    move-result v8

    .line 823
    const/4 v9, 0x1

    .line 824
    if-gt v8, v9, :cond_1c

    .line 825
    .line 826
    :cond_1b
    move-wide/from16 v18, v2

    .line 827
    .line 828
    goto :goto_16

    .line 829
    :cond_1c
    add-int v8, v5, v6

    .line 830
    .line 831
    int-to-double v8, v8

    .line 832
    div-double v8, v8, v16

    .line 833
    .line 834
    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    .line 835
    .line 836
    .line 837
    move-result-wide v8

    .line 838
    double-to-int v8, v8

    .line 839
    sget-object v9, Lj51;->f:[D

    .line 840
    .line 841
    aget-wide v18, v9, v8

    .line 842
    .line 843
    aget-wide v9, v1, v4

    .line 844
    .line 845
    aget-wide v20, v0, v4

    .line 846
    .line 847
    sub-double v18, v18, v9

    .line 848
    .line 849
    sub-double v20, v20, v9

    .line 850
    .line 851
    div-double v18, v18, v20

    .line 852
    .line 853
    aget-wide v9, v1, v24

    .line 854
    .line 855
    aget-wide v20, v0, v24

    .line 856
    .line 857
    sub-double v20, v20, v9

    .line 858
    .line 859
    mul-double v20, v20, v18

    .line 860
    .line 861
    add-double v20, v20, v9

    .line 862
    .line 863
    const/16 v32, 0x1

    .line 864
    .line 865
    aget-wide v9, v1, v32

    .line 866
    .line 867
    aget-wide v22, v0, v32

    .line 868
    .line 869
    sub-double v22, v22, v9

    .line 870
    .line 871
    mul-double v22, v22, v18

    .line 872
    .line 873
    add-double v22, v22, v9

    .line 874
    .line 875
    aget-wide v9, v1, v30

    .line 876
    .line 877
    aget-wide v25, v0, v30

    .line 878
    .line 879
    sub-double v25, v25, v9

    .line 880
    .line 881
    mul-double v25, v25, v18

    .line 882
    .line 883
    add-double v25, v25, v9

    .line 884
    .line 885
    const/4 v9, 0x3

    .line 886
    new-array v10, v9, [D

    .line 887
    .line 888
    aput-wide v20, v10, v24

    .line 889
    .line 890
    aput-wide v22, v10, v32

    .line 891
    .line 892
    aput-wide v25, v10, v30

    .line 893
    .line 894
    invoke-static {v10}, Lj51;->y([D)D

    .line 895
    .line 896
    .line 897
    move-result-wide v18

    .line 898
    move-wide/from16 p0, v2

    .line 899
    .line 900
    move-wide/from16 p2, v13

    .line 901
    .line 902
    move-wide/from16 p4, v18

    .line 903
    .line 904
    invoke-static/range {p0 .. p5}, Lj51;->i(DDD)Z

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    move-wide/from16 v18, p0

    .line 909
    .line 910
    move-wide/from16 v20, p4

    .line 911
    .line 912
    if-eqz v2, :cond_1d

    .line 913
    .line 914
    move v6, v8

    .line 915
    move-object v0, v10

    .line 916
    move-wide/from16 v2, v18

    .line 917
    .line 918
    goto :goto_15

    .line 919
    :cond_1d
    move v5, v8

    .line 920
    move-object v1, v10

    .line 921
    move-wide/from16 v2, v20

    .line 922
    .line 923
    :goto_15
    add-int/lit8 v7, v7, 0x1

    .line 924
    .line 925
    goto :goto_14

    .line 926
    :goto_16
    move-wide/from16 v2, v18

    .line 927
    .line 928
    :cond_1e
    add-int/lit8 v4, v4, 0x1

    .line 929
    .line 930
    goto/16 :goto_11

    .line 931
    .line 932
    :cond_1f
    aget-wide v2, v1, v24

    .line 933
    .line 934
    aget-wide v4, v0, v24

    .line 935
    .line 936
    add-double/2addr v2, v4

    .line 937
    div-double v2, v2, v16

    .line 938
    .line 939
    const/16 v32, 0x1

    .line 940
    .line 941
    aget-wide v4, v1, v32

    .line 942
    .line 943
    aget-wide v6, v0, v32

    .line 944
    .line 945
    add-double/2addr v4, v6

    .line 946
    div-double v4, v4, v16

    .line 947
    .line 948
    aget-wide v6, v1, v30

    .line 949
    .line 950
    aget-wide v8, v0, v30

    .line 951
    .line 952
    add-double/2addr v6, v8

    .line 953
    div-double v6, v6, v16

    .line 954
    .line 955
    const/4 v9, 0x3

    .line 956
    new-array v0, v9, [D

    .line 957
    .line 958
    aput-wide v2, v0, v24

    .line 959
    .line 960
    aput-wide v4, v0, v32

    .line 961
    .line 962
    aput-wide v6, v0, v30

    .line 963
    .line 964
    aget-wide v1, v0, v24

    .line 965
    .line 966
    invoke-static {v1, v2}, Lh12;->l(D)I

    .line 967
    .line 968
    .line 969
    move-result v1

    .line 970
    aget-wide v2, v0, v32

    .line 971
    .line 972
    invoke-static {v2, v3}, Lh12;->l(D)I

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    aget-wide v3, v0, v30

    .line 977
    .line 978
    invoke-static {v3, v4}, Lh12;->l(D)I

    .line 979
    .line 980
    .line 981
    move-result v0

    .line 982
    and-int/lit16 v1, v1, 0xff

    .line 983
    .line 984
    shl-int/lit8 v1, v1, 0x10

    .line 985
    .line 986
    or-int v1, v1, v29

    .line 987
    .line 988
    and-int/lit16 v2, v2, 0xff

    .line 989
    .line 990
    const/16 v11, 0x8

    .line 991
    .line 992
    shl-int/2addr v2, v11

    .line 993
    or-int/2addr v1, v2

    .line 994
    and-int/lit16 v0, v0, 0xff

    .line 995
    .line 996
    :goto_17
    or-int/2addr v0, v1

    .line 997
    goto :goto_19

    .line 998
    :goto_18
    invoke-static/range {p4 .. p5}, Lh12;->R(D)D

    .line 999
    .line 1000
    .line 1001
    move-result-wide v0

    .line 1002
    invoke-static {v0, v1}, Lh12;->l(D)I

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    and-int/lit16 v0, v0, 0xff

    .line 1007
    .line 1008
    shl-int/lit8 v1, v0, 0x10

    .line 1009
    .line 1010
    or-int v1, v1, v29

    .line 1011
    .line 1012
    shl-int/lit8 v2, v0, 0x8

    .line 1013
    .line 1014
    or-int/2addr v1, v2

    .line 1015
    goto :goto_17

    .line 1016
    :goto_19
    new-instance v1, Lol1;

    .line 1017
    .line 1018
    invoke-direct {v1, v0}, Lol1;-><init>(I)V

    .line 1019
    .line 1020
    .line 1021
    return-object v1

    .line 1022
    nop

    .line 1023
    :array_0
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
    .end array-data

    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    :array_1
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
    .end array-data

    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    :array_2
    .array-data 8
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
        -0x4010000000000000L    # -1.0
    .end array-data
.end method
