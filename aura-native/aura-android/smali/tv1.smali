.class public Ltv1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lf04;
.implements Lep3;
.implements Lq51;
.implements Lxj2;
.implements Lqk2;
.implements Lkg1;
.implements Lm51;
.implements Lex4;
.implements Le63;
.implements Lza3;
.implements Lbh3;
.implements Lgh3;


# static fields
.field public static n:Ltv1;


# direct methods
.method public static A(Ljava/io/File;)Lge3;
    .locals 1

    .line 1
    sget-object v0, Lge3;->o:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ltv1;->z(Ljava/lang/String;)Lge3;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static B(Ld64;)Z
    .locals 1

    .line 1
    iget p0, p0, Ld64;->b:I

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static C(Ld64;)Z
    .locals 1

    .line 1
    iget p0, p0, Ld64;->b:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static D(Lol1;Ld64;)D
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v1, v1, Ld64;->c:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-wide/high16 v1, 0x4054000000000000L    # 80.0

    .line 13
    .line 14
    :goto_0
    invoke-static {v1, v2}, Lh85;->a(D)Lh85;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget v2, v0, Lol1;->d:I

    .line 19
    .line 20
    invoke-static {v2}, Lsy;->a(I)Lsy;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-wide v3, v2, Lsy;->c:D

    .line 25
    .line 26
    iget-wide v5, v2, Lsy;->b:D

    .line 27
    .line 28
    const-wide/16 v7, 0x0

    .line 29
    .line 30
    cmpl-double v9, v5, v7

    .line 31
    .line 32
    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    .line 33
    .line 34
    if-eqz v9, :cond_2

    .line 35
    .line 36
    cmpl-double v9, v3, v7

    .line 37
    .line 38
    if-nez v9, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    div-double v12, v3, v10

    .line 42
    .line 43
    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v12

    .line 47
    div-double/2addr v5, v12

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    move-wide v5, v7

    .line 50
    :goto_2
    iget-wide v12, v1, Lh85;->f:D

    .line 51
    .line 52
    iget-wide v14, v1, Lh85;->h:D

    .line 53
    .line 54
    move-wide/from16 v16, v10

    .line 55
    .line 56
    const-wide v10, 0x3fd28f5c28f5c28fL    # 0.29

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v9

    .line 65
    const-wide v11, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    sub-double/2addr v11, v9

    .line 71
    const-wide v9, 0x3fe75c28f5c28f5cL    # 0.73

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 77
    .line 78
    .line 79
    move-result-wide v9

    .line 80
    div-double/2addr v5, v9

    .line 81
    const-wide v9, 0x3ff1c71c71c71c72L    # 1.1111111111111112

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->pow(DD)D

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    iget-wide v9, v2, Lsy;->a:D

    .line 91
    .line 92
    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 97
    .line 98
    add-double/2addr v11, v9

    .line 99
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 100
    .line 101
    .line 102
    move-result-wide v11

    .line 103
    const-wide v18, 0x400e666666666666L    # 3.8

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    add-double v11, v11, v18

    .line 109
    .line 110
    const-wide/high16 v18, 0x3fd0000000000000L    # 0.25

    .line 111
    .line 112
    mul-double v11, v11, v18

    .line 113
    .line 114
    iget-wide v7, v1, Lh85;->a:D

    .line 115
    .line 116
    div-double v3, v3, v16

    .line 117
    .line 118
    const-wide v20, 0x3ff7303b5cc0ed74L    # 1.4492753623188408

    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    move-wide/from16 v22, v5

    .line 124
    .line 125
    iget-wide v5, v1, Lh85;->j:D

    .line 126
    .line 127
    div-double v5, v20, v5

    .line 128
    .line 129
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    mul-double/2addr v2, v7

    .line 134
    const-wide v4, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    mul-double/2addr v11, v4

    .line 140
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 141
    .line 142
    mul-double/2addr v11, v4

    .line 143
    iget-wide v4, v1, Lh85;->c:D

    .line 144
    .line 145
    mul-double/2addr v11, v4

    .line 146
    iget-wide v4, v1, Lh85;->b:D

    .line 147
    .line 148
    div-double/2addr v2, v4

    .line 149
    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    invoke-static {v9, v10}, Ljava/lang/Math;->cos(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    const-wide v8, 0x3fd3851eb851eb85L    # 0.305

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    add-double/2addr v8, v2

    .line 163
    const-wide/high16 v20, 0x4037000000000000L    # 23.0

    .line 164
    .line 165
    mul-double v8, v8, v20

    .line 166
    .line 167
    mul-double v8, v8, v22

    .line 168
    .line 169
    mul-double v11, v11, v20

    .line 170
    .line 171
    const-wide/high16 v20, 0x4026000000000000L    # 11.0

    .line 172
    .line 173
    mul-double v20, v20, v22

    .line 174
    .line 175
    mul-double v20, v20, v6

    .line 176
    .line 177
    add-double v20, v20, v11

    .line 178
    .line 179
    const-wide/high16 v10, 0x405b000000000000L    # 108.0

    .line 180
    .line 181
    mul-double v10, v10, v22

    .line 182
    .line 183
    mul-double/2addr v10, v4

    .line 184
    add-double v10, v10, v20

    .line 185
    .line 186
    div-double/2addr v8, v10

    .line 187
    mul-double/2addr v6, v8

    .line 188
    mul-double/2addr v8, v4

    .line 189
    const-wide v4, 0x407cc00000000000L    # 460.0

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    mul-double/2addr v2, v4

    .line 195
    const-wide v4, 0x407c300000000000L    # 451.0

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    mul-double/2addr v4, v6

    .line 201
    add-double/2addr v4, v2

    .line 202
    const-wide/high16 v10, 0x4072000000000000L    # 288.0

    .line 203
    .line 204
    mul-double/2addr v10, v8

    .line 205
    add-double/2addr v10, v4

    .line 206
    const-wide v4, 0x4095ec0000000000L    # 1403.0

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    div-double/2addr v10, v4

    .line 212
    const-wide v12, 0x408bd80000000000L    # 891.0

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    mul-double/2addr v12, v6

    .line 218
    sub-double v12, v2, v12

    .line 219
    .line 220
    const-wide v20, 0x4070500000000000L    # 261.0

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    mul-double v20, v20, v8

    .line 226
    .line 227
    sub-double v12, v12, v20

    .line 228
    .line 229
    div-double/2addr v12, v4

    .line 230
    const-wide v20, 0x406b800000000000L    # 220.0

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    mul-double v6, v6, v20

    .line 236
    .line 237
    sub-double/2addr v2, v6

    .line 238
    const-wide v6, 0x40b89c0000000000L    # 6300.0

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    mul-double/2addr v8, v6

    .line 244
    sub-double/2addr v2, v8

    .line 245
    div-double/2addr v2, v4

    .line 246
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    .line 247
    .line 248
    .line 249
    move-result-wide v4

    .line 250
    const-wide v6, 0x403b2147ae147ae1L    # 27.13

    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    mul-double/2addr v4, v6

    .line 256
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    .line 257
    .line 258
    .line 259
    move-result-wide v8

    .line 260
    const-wide/high16 v20, 0x4079000000000000L    # 400.0

    .line 261
    .line 262
    sub-double v8, v20, v8

    .line 263
    .line 264
    div-double/2addr v4, v8

    .line 265
    const-wide/16 v8, 0x0

    .line 266
    .line 267
    invoke-static {v8, v9, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 268
    .line 269
    .line 270
    move-result-wide v4

    .line 271
    invoke-static {v10, v11}, Ljava/lang/Math;->signum(D)D

    .line 272
    .line 273
    .line 274
    move-result-wide v8

    .line 275
    div-double v10, v16, v14

    .line 276
    .line 277
    mul-double/2addr v8, v10

    .line 278
    const-wide v14, 0x40030c30c30c30c3L    # 2.380952380952381

    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    invoke-static {v4, v5, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 284
    .line 285
    .line 286
    move-result-wide v4

    .line 287
    mul-double/2addr v4, v8

    .line 288
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 289
    .line 290
    .line 291
    move-result-wide v8

    .line 292
    mul-double/2addr v8, v6

    .line 293
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 294
    .line 295
    .line 296
    move-result-wide v22

    .line 297
    sub-double v22, v20, v22

    .line 298
    .line 299
    div-double v8, v8, v22

    .line 300
    .line 301
    move-wide/from16 v22, v6

    .line 302
    .line 303
    const-wide/16 v6, 0x0

    .line 304
    .line 305
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(DD)D

    .line 306
    .line 307
    .line 308
    move-result-wide v8

    .line 309
    invoke-static {v12, v13}, Ljava/lang/Math;->signum(D)D

    .line 310
    .line 311
    .line 312
    move-result-wide v12

    .line 313
    mul-double/2addr v12, v10

    .line 314
    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 315
    .line 316
    .line 317
    move-result-wide v8

    .line 318
    mul-double/2addr v8, v12

    .line 319
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 320
    .line 321
    .line 322
    move-result-wide v12

    .line 323
    mul-double v12, v12, v22

    .line 324
    .line 325
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 326
    .line 327
    .line 328
    move-result-wide v18

    .line 329
    sub-double v20, v20, v18

    .line 330
    .line 331
    div-double v12, v12, v20

    .line 332
    .line 333
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(DD)D

    .line 334
    .line 335
    .line 336
    move-result-wide v6

    .line 337
    invoke-static {v2, v3}, Ljava/lang/Math;->signum(D)D

    .line 338
    .line 339
    .line 340
    move-result-wide v2

    .line 341
    mul-double/2addr v2, v10

    .line 342
    invoke-static {v6, v7, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 343
    .line 344
    .line 345
    move-result-wide v6

    .line 346
    mul-double/2addr v6, v2

    .line 347
    iget-object v1, v1, Lh85;->g:[D

    .line 348
    .line 349
    const/4 v2, 0x0

    .line 350
    aget-wide v10, v1, v2

    .line 351
    .line 352
    div-double/2addr v4, v10

    .line 353
    const/4 v3, 0x1

    .line 354
    aget-wide v10, v1, v3

    .line 355
    .line 356
    div-double/2addr v8, v10

    .line 357
    const/4 v10, 0x2

    .line 358
    aget-wide v11, v1, v10

    .line 359
    .line 360
    div-double/2addr v6, v11

    .line 361
    sget-object v1, Lsy;->e:[[D

    .line 362
    .line 363
    aget-object v11, v1, v2

    .line 364
    .line 365
    aget-wide v12, v11, v2

    .line 366
    .line 367
    mul-double/2addr v12, v4

    .line 368
    aget-wide v14, v11, v3

    .line 369
    .line 370
    mul-double/2addr v14, v8

    .line 371
    add-double/2addr v14, v12

    .line 372
    aget-wide v12, v11, v10

    .line 373
    .line 374
    mul-double/2addr v12, v6

    .line 375
    add-double/2addr v12, v14

    .line 376
    aget-object v11, v1, v3

    .line 377
    .line 378
    aget-wide v14, v11, v2

    .line 379
    .line 380
    mul-double/2addr v14, v4

    .line 381
    aget-wide v18, v11, v3

    .line 382
    .line 383
    mul-double v18, v18, v8

    .line 384
    .line 385
    add-double v18, v18, v14

    .line 386
    .line 387
    aget-wide v14, v11, v10

    .line 388
    .line 389
    mul-double/2addr v14, v6

    .line 390
    add-double v14, v14, v18

    .line 391
    .line 392
    aget-object v1, v1, v10

    .line 393
    .line 394
    aget-wide v18, v1, v2

    .line 395
    .line 396
    mul-double v4, v4, v18

    .line 397
    .line 398
    aget-wide v18, v1, v3

    .line 399
    .line 400
    mul-double v8, v8, v18

    .line 401
    .line 402
    add-double/2addr v8, v4

    .line 403
    aget-wide v4, v1, v10

    .line 404
    .line 405
    mul-double/2addr v6, v4

    .line 406
    add-double/2addr v6, v8

    .line 407
    const/4 v1, 0x3

    .line 408
    new-array v1, v1, [D

    .line 409
    .line 410
    aput-wide v12, v1, v2

    .line 411
    .line 412
    aput-wide v14, v1, v3

    .line 413
    .line 414
    aput-wide v6, v1, v10

    .line 415
    .line 416
    aget-wide v18, v1, v2

    .line 417
    .line 418
    aget-wide v20, v1, v3

    .line 419
    .line 420
    aget-wide v22, v1, v10

    .line 421
    .line 422
    sget-object v24, Lh85;->k:Lh85;

    .line 423
    .line 424
    invoke-static/range {v18 .. v24}, Lsy;->b(DDDLh85;)Lsy;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    iget-wide v4, v2, Lsy;->a:D

    .line 429
    .line 430
    iget-wide v6, v2, Lsy;->b:D

    .line 431
    .line 432
    aget-wide v2, v1, v3

    .line 433
    .line 434
    div-double v2, v2, v16

    .line 435
    .line 436
    invoke-static {v2, v3}, Lh12;->B(D)D

    .line 437
    .line 438
    .line 439
    move-result-wide v1

    .line 440
    const-wide/high16 v8, 0x405d000000000000L    # 116.0

    .line 441
    .line 442
    mul-double/2addr v1, v8

    .line 443
    const-wide/high16 v8, 0x4030000000000000L    # 16.0

    .line 444
    .line 445
    sub-double v8, v1, v8

    .line 446
    .line 447
    invoke-static/range {v4 .. v9}, Lol1;->a(DDD)Lol1;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    iget-wide v2, v0, Lol1;->c:D

    .line 452
    .line 453
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 454
    .line 455
    .line 456
    move-result-wide v2

    .line 457
    const-wide/16 v4, 0x3c

    .line 458
    .line 459
    cmp-long v2, v2, v4

    .line 460
    .line 461
    const-wide v6, 0x4048800000000000L    # 49.0

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    const-wide/16 v8, 0x31

    .line 467
    .line 468
    if-gez v2, :cond_6

    .line 469
    .line 470
    iget-wide v2, v1, Lol1;->c:D

    .line 471
    .line 472
    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    .line 473
    .line 474
    .line 475
    move-result-wide v2

    .line 476
    cmp-long v2, v2, v8

    .line 477
    .line 478
    if-gtz v2, :cond_3

    .line 479
    .line 480
    goto :goto_4

    .line 481
    :cond_3
    iget-wide v0, v0, Lol1;->c:D

    .line 482
    .line 483
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 484
    .line 485
    .line 486
    move-result-wide v2

    .line 487
    cmp-long v2, v2, v4

    .line 488
    .line 489
    if-gez v2, :cond_5

    .line 490
    .line 491
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 492
    .line 493
    .line 494
    move-result-wide v2

    .line 495
    cmp-long v2, v2, v8

    .line 496
    .line 497
    if-gtz v2, :cond_4

    .line 498
    .line 499
    goto :goto_3

    .line 500
    :cond_4
    return-wide v6

    .line 501
    :cond_5
    :goto_3
    return-wide v0

    .line 502
    :cond_6
    :goto_4
    iget-wide v0, v1, Lol1;->c:D

    .line 503
    .line 504
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 505
    .line 506
    .line 507
    move-result-wide v2

    .line 508
    cmp-long v2, v2, v4

    .line 509
    .line 510
    if-gez v2, :cond_8

    .line 511
    .line 512
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 513
    .line 514
    .line 515
    move-result-wide v2

    .line 516
    cmp-long v2, v2, v8

    .line 517
    .line 518
    if-gtz v2, :cond_7

    .line 519
    .line 520
    goto :goto_5

    .line 521
    :cond_7
    return-wide v6

    .line 522
    :cond_8
    :goto_5
    return-wide v0
.end method

.method public static v(Landroid/content/Context;Lr23;Landroid/os/Bundle;Lr92;Lj23;)La23;
    .locals 9

    .line 1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v7

    .line 9
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, La23;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    move-object v2, p0

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v5, p3

    .line 25
    move-object v6, p4

    .line 26
    invoke-direct/range {v1 .. v8}, La23;-><init>(Landroid/content/Context;Lr23;Landroid/os/Bundle;Lr92;Lj23;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public static z(Ljava/lang/String;)Lge3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lf;->a:Lyw;

    .line 5
    .line 6
    new-instance v0, Ltv;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Ltv;->d0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-static {v0, p0}, Lf;->d(Ltv;Z)Lge3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method


# virtual methods
.method public E()Lgy0;
    .locals 4

    .line 1
    new-instance v0, Lzh2;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lzh2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lzh2;

    .line 9
    .line 10
    const/16 v2, 0x12

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lzh2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lbi2;

    .line 16
    .line 17
    const/16 v3, 0x1a

    .line 18
    .line 19
    invoke-direct {v2, p0, v3}, Lbi2;-><init>(Ltv1;I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-static {v0, v1, v2, p0}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public F()Lgy0;
    .locals 4

    .line 1
    new-instance v0, Lzh2;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lzh2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lzh2;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lzh2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lbi2;

    .line 16
    .line 17
    const/16 v3, 0x1a

    .line 18
    .line 19
    invoke-direct {v2, p0, v3}, Lbi2;-><init>(Ltv1;I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-static {v0, v1, v2, p0}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public G()Lgy0;
    .locals 4

    .line 1
    new-instance v0, Lai2;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lai2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lai2;

    .line 9
    .line 10
    const/16 v2, 0x14

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lai2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lbi2;

    .line 16
    .line 17
    const/16 v3, 0x1a

    .line 18
    .line 19
    invoke-direct {v2, p0, v3}, Lbi2;-><init>(Ltv1;I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-static {v0, v1, v2, p0}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public a(Lcx2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public b(Lgb1;I)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    sget-object p0, Lgb1;->p:Lgb1;

    .line 4
    .line 5
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    if-nez p2, :cond_1

    .line 15
    .line 16
    sget-object p0, Lgb1;->q:Lgb1;

    .line 17
    .line 18
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 28
    .line 29
    iget p1, p1, Lgb1;->n:I

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-ne p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    :goto_0
    invoke-static {p0, p1, v0}, Lsr0;->g(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public d()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public e([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lcx2;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lj51;->O(Leo0;)Lc72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p1}, Lhw;->a(Lc72;Z)Li94;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lwr1;->I(Li94;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public g()Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p0, Lde2;

    .line 2
    .line 3
    invoke-direct {p0}, Lde2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lab4;

    .line 2
    .line 3
    iget p0, p1, Lab4;->a:I

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "insertPlayNext: play-next fixup rejected with code "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget p1, p1, Lab4;->a:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "MediaManager"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public i(Lc72;JLfm1;IZ)V
    .locals 7

    .line 1
    iget-object p0, p1, Lc72;->Q:Lw12;

    .line 2
    .line 3
    iget-object p1, p0, Lw12;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Lf63;

    .line 6
    .line 7
    sget-object p5, Lf63;->h0:Lk52;

    .line 8
    .line 9
    invoke-virtual {p1, p2, p3}, Lf63;->x0(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    iget-object p0, p0, Lw12;->e:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    check-cast v0, Lf63;

    .line 17
    .line 18
    sget-object v1, Lf63;->m0:Ltv1;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    move-object v4, p4

    .line 22
    move v6, p6

    .line 23
    invoke-virtual/range {v0 .. v6}, Lf63;->G0(Le63;JLfm1;IZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public j()J
    .locals 0

    .line 1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public k(Lfm1;Lc72;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public m(Lc72;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lc72;->v()Le94;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-boolean p0, p0, Le94;->q:Z

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    move p1, v0

    .line 14
    :cond_0
    xor-int/lit8 p0, p1, 0x1

    .line 15
    .line 16
    return p0
.end method

.method public n()J
    .locals 0

    .line 1
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public next()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string p0, "MediaManager"

    .line 2
    .line 3
    const-string v0, "insertPlayNext: play-next fixup command failed"

    .line 4
    .line 5
    invoke-static {p0, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public p()V
    .locals 0

    .line 1
    return-void
.end method

.method public q(FF)F
    .locals 0

    .line 1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return p0
.end method

.method public r(Landroidx/preference/Preference;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    check-cast p1, Landroidx/preference/ListPreference;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/preference/ListPreference;->F()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p0, p1, Landroidx/preference/Preference;->n:Landroid/content/Context;

    .line 14
    .line 15
    const p1, 0x7f1303b7

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/preference/ListPreference;->F()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public s(I)Lcx4;
    .locals 0

    .line 1
    sget-object p0, Lz53;->n:Lz53;

    .line 2
    .line 3
    return-object p0
.end method

.method public t(II)Lwv4;
    .locals 0

    .line 1
    new-instance p0, Ltq0;

    .line 2
    .line 3
    invoke-direct {p0}, Ltq0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public w(Lm84;)V
    .locals 0

    .line 1
    return-void
.end method

.method public x()Lgy0;
    .locals 4

    .line 1
    new-instance v0, Lbi2;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbi2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lbi2;

    .line 9
    .line 10
    const/16 v2, 0x17

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lbi2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lbi2;

    .line 16
    .line 17
    const/16 v3, 0x1a

    .line 18
    .line 19
    invoke-direct {v2, p0, v3}, Lbi2;-><init>(Ltv1;I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-static {v0, v1, v2, p0}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
