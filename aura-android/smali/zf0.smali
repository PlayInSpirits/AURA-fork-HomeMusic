.class public final Lzf0;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lzf0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lzf0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lzf0;->n:I

    .line 4
    .line 5
    sget-object v2, Lj15;->a:Lj15;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v0, v0, Lzf0;->o:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, Landroidx/work/Worker;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/work/Worker;->d()Lnc2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0

    .line 22
    :pswitch_0
    check-cast v0, [Lp81;

    .line 23
    .line 24
    array-length v0, v0

    .line 25
    new-array v0, v0, [Ltc0;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    check-cast v0, Ly10;

    .line 29
    .line 30
    iget-object v0, v0, Ly10;->f:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lr21;

    .line 33
    .line 34
    invoke-interface {v0}, Lr21;->i()Ltl1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_2
    check-cast v0, Ly04;

    .line 40
    .line 41
    iget-object v1, v0, Ly04;->c:Ljava/lang/ClassLoader;

    .line 42
    .line 43
    iget-object v2, v0, Ly04;->d:Lb71;

    .line 44
    .line 45
    const-string v0, ""

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v3, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    move v8, v5

    .line 71
    :cond_0
    :goto_0
    if-ge v8, v7, :cond_2

    .line 72
    .line 73
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    add-int/lit8 v8, v8, 0x1

    .line 78
    .line 79
    check-cast v9, Ljava/net/URL;

    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const-string v11, "file"

    .line 89
    .line 90
    invoke-static {v10, v11}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-nez v10, :cond_1

    .line 95
    .line 96
    const/4 v10, 0x0

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    sget-object v10, Lge3;->o:Ljava/lang/String;

    .line 99
    .line 100
    new-instance v10, Ljava/io/File;

    .line 101
    .line 102
    invoke-virtual {v9}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v10}, Ltv1;->A(Ljava/io/File;)Lge3;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    new-instance v10, Lkd3;

    .line 114
    .line 115
    invoke-direct {v10, v2, v9}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :goto_1
    if-eqz v10, :cond_0

    .line 119
    .line 120
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_2
    const-string v0, "META-INF/MANIFEST.MF"

    .line 125
    .line 126
    invoke-virtual {v1, v0}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    new-instance v7, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    move v0, v5

    .line 150
    :goto_2
    if-ge v0, v8, :cond_16

    .line 151
    .line 152
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    add-int/lit8 v10, v0, 0x1

    .line 157
    .line 158
    check-cast v9, Ljava/net/URL;

    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    const-string v9, "jar:file:"

    .line 171
    .line 172
    invoke-static {v0, v9, v5}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-nez v9, :cond_3

    .line 177
    .line 178
    :goto_3
    move/from16 p0, v10

    .line 179
    .line 180
    const/4 v6, 0x0

    .line 181
    goto/16 :goto_17

    .line 182
    .line 183
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    const/4 v11, 0x1

    .line 188
    sub-int/2addr v9, v11

    .line 189
    const-string v12, "!"

    .line 190
    .line 191
    invoke-virtual {v0, v12, v9}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-ne v9, v4, :cond_4

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_4
    sget-object v12, Lge3;->o:Ljava/lang/String;

    .line 199
    .line 200
    new-instance v12, Ljava/io/File;

    .line 201
    .line 202
    const/4 v13, 0x4

    .line 203
    invoke-virtual {v0, v13, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v12}, Ltv1;->A(Ljava/io/File;)Lge3;

    .line 215
    .line 216
    .line 217
    move-result-object v9

    .line 218
    const-string v0, "not a zip: size="

    .line 219
    .line 220
    invoke-virtual {v2, v9}, Lb71;->i(Lge3;)Lr32;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    :try_start_0
    invoke-virtual {v12}, Lr32;->size()J

    .line 225
    .line 226
    .line 227
    move-result-wide v13

    .line 228
    const-wide/16 v15, 0x16

    .line 229
    .line 230
    sub-long v15, v13, v15

    .line 231
    .line 232
    const-wide/16 v5, 0x0

    .line 233
    .line 234
    cmp-long v17, v15, v5

    .line 235
    .line 236
    if-ltz v17, :cond_14

    .line 237
    .line 238
    const-wide/32 v17, 0x10016

    .line 239
    .line 240
    .line 241
    sub-long v13, v13, v17

    .line 242
    .line 243
    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 244
    .line 245
    .line 246
    move-result-wide v13

    .line 247
    move-wide/from16 v17, v5

    .line 248
    .line 249
    move-wide v5, v15

    .line 250
    :goto_4
    invoke-virtual {v12, v5, v6}, Lr32;->b(J)Lw61;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    new-instance v15, Lxu3;

    .line 255
    .line 256
    invoke-direct {v15, v0}, Lxu3;-><init>(Lej4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_10

    .line 257
    .line 258
    .line 259
    :try_start_1
    invoke-virtual {v15}, Lxu3;->f()I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    const v4, 0x6054b50

    .line 264
    .line 265
    .line 266
    if-ne v0, v4, :cond_12

    .line 267
    .line 268
    invoke-virtual {v15}, Lxu3;->n()S

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    const v4, 0xffff

    .line 273
    .line 274
    .line 275
    and-int/2addr v0, v4

    .line 276
    invoke-virtual {v15}, Lxu3;->n()S

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    and-int/2addr v13, v4

    .line 281
    invoke-virtual {v15}, Lxu3;->n()S

    .line 282
    .line 283
    .line 284
    move-result v14

    .line 285
    and-int/2addr v14, v4

    .line 286
    move/from16 p0, v4

    .line 287
    .line 288
    move-wide/from16 v25, v5

    .line 289
    .line 290
    int-to-long v4, v14

    .line 291
    invoke-virtual {v15}, Lxu3;->n()S

    .line 292
    .line 293
    .line 294
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_f

    .line 295
    and-int v6, v6, p0

    .line 296
    .line 297
    move-object/from16 v28, v12

    .line 298
    .line 299
    int-to-long v11, v6

    .line 300
    cmp-long v6, v4, v11

    .line 301
    .line 302
    const-string v11, "unsupported zip: spanned"

    .line 303
    .line 304
    if-nez v6, :cond_11

    .line 305
    .line 306
    if-nez v0, :cond_11

    .line 307
    .line 308
    if-nez v13, :cond_11

    .line 309
    .line 310
    const-wide/16 v12, 0x4

    .line 311
    .line 312
    :try_start_2
    invoke-virtual {v15, v12, v13}, Lxu3;->skip(J)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v15}, Lxu3;->f()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    int-to-long v12, v0

    .line 320
    const-wide v19, 0xffffffffL

    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    and-long v23, v12, v19

    .line 326
    .line 327
    invoke-virtual {v15}, Lxu3;->n()S

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    and-int v30, v0, p0

    .line 332
    .line 333
    new-instance v19, Lpu;

    .line 334
    .line 335
    move-wide/from16 v21, v4

    .line 336
    .line 337
    move/from16 v20, v30

    .line 338
    .line 339
    invoke-direct/range {v19 .. v24}, Lpu;-><init>(IJJ)V

    .line 340
    .line 341
    .line 342
    move/from16 v0, v20

    .line 343
    .line 344
    int-to-long v4, v0

    .line 345
    invoke-virtual {v15, v4, v5}, Lxu3;->q(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_d

    .line 346
    .line 347
    .line 348
    :try_start_3
    invoke-virtual {v15}, Lxu3;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_c

    .line 349
    .line 350
    .line 351
    const-wide/16 v4, 0x14

    .line 352
    .line 353
    sub-long v5, v25, v4

    .line 354
    .line 355
    cmp-long v4, v5, v17

    .line 356
    .line 357
    if-lez v4, :cond_b

    .line 358
    .line 359
    move-object/from16 v4, v28

    .line 360
    .line 361
    :try_start_4
    invoke-virtual {v4, v5, v6}, Lr32;->b(J)Lw61;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    new-instance v6, Lxu3;

    .line 366
    .line 367
    invoke-direct {v6, v5}, Lxu3;-><init>(Lej4;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 368
    .line 369
    .line 370
    :try_start_5
    invoke-virtual {v6}, Lxu3;->f()I

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    const v12, 0x7064b50

    .line 375
    .line 376
    .line 377
    if-ne v5, v12, :cond_9

    .line 378
    .line 379
    invoke-virtual {v6}, Lxu3;->f()I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    invoke-virtual {v6}, Lxu3;->j()J

    .line 384
    .line 385
    .line 386
    move-result-wide v12

    .line 387
    invoke-virtual {v6}, Lxu3;->f()I

    .line 388
    .line 389
    .line 390
    move-result v14

    .line 391
    const/4 v15, 0x1

    .line 392
    if-ne v14, v15, :cond_8

    .line 393
    .line 394
    if-nez v5, :cond_8

    .line 395
    .line 396
    invoke-virtual {v4, v12, v13}, Lr32;->b(J)Lw61;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    new-instance v12, Lxu3;

    .line 401
    .line 402
    invoke-direct {v12, v5}, Lxu3;-><init>(Lej4;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 403
    .line 404
    .line 405
    :try_start_6
    invoke-virtual {v12}, Lxu3;->f()I

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    const v13, 0x6064b50

    .line 410
    .line 411
    .line 412
    if-ne v5, v13, :cond_6

    .line 413
    .line 414
    const-wide/16 v13, 0xc

    .line 415
    .line 416
    invoke-virtual {v12, v13, v14}, Lxu3;->skip(J)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Lxu3;->f()I

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    invoke-virtual {v12}, Lxu3;->f()I

    .line 424
    .line 425
    .line 426
    move-result v13

    .line 427
    invoke-virtual {v12}, Lxu3;->j()J

    .line 428
    .line 429
    .line 430
    move-result-wide v31

    .line 431
    invoke-virtual {v12}, Lxu3;->j()J

    .line 432
    .line 433
    .line 434
    move-result-wide v14

    .line 435
    cmp-long v14, v31, v14

    .line 436
    .line 437
    if-nez v14, :cond_5

    .line 438
    .line 439
    if-nez v5, :cond_5

    .line 440
    .line 441
    if-nez v13, :cond_5

    .line 442
    .line 443
    const-wide/16 v13, 0x8

    .line 444
    .line 445
    invoke-virtual {v12, v13, v14}, Lxu3;->skip(J)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v12}, Lxu3;->j()J

    .line 449
    .line 450
    .line 451
    move-result-wide v33

    .line 452
    new-instance v29, Lpu;

    .line 453
    .line 454
    move/from16 v30, v0

    .line 455
    .line 456
    invoke-direct/range {v29 .. v34}, Lpu;-><init>(IJJ)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 457
    .line 458
    .line 459
    :try_start_7
    invoke-virtual {v12}, Lxu3;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 460
    .line 461
    .line 462
    const/4 v0, 0x0

    .line 463
    goto :goto_5

    .line 464
    :catchall_0
    move-exception v0

    .line 465
    :goto_5
    move-object/from16 v19, v29

    .line 466
    .line 467
    goto :goto_9

    .line 468
    :cond_5
    :try_start_8
    new-instance v0, Ljava/io/IOException;

    .line 469
    .line 470
    invoke-direct {v0, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    :goto_6
    move-object v5, v0

    .line 475
    goto :goto_7

    .line 476
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 477
    .line 478
    new-instance v11, Ljava/lang/StringBuilder;

    .line 479
    .line 480
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 481
    .line 482
    .line 483
    const-string v14, "bad zip: expected "

    .line 484
    .line 485
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-static {v13}, Lgb;->B(I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v13

    .line 492
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    const-string v13, " but was "

    .line 496
    .line 497
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-static {v5}, Lgb;->B(I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 515
    :catchall_1
    move-exception v0

    .line 516
    goto :goto_6

    .line 517
    :goto_7
    :try_start_9
    invoke-virtual {v12}, Lxu3;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 518
    .line 519
    .line 520
    goto :goto_8

    .line 521
    :catchall_2
    move-exception v0

    .line 522
    :try_start_a
    invoke-static {v5, v0}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 523
    .line 524
    .line 525
    :goto_8
    move-object v0, v5

    .line 526
    :goto_9
    if-nez v0, :cond_7

    .line 527
    .line 528
    goto :goto_a

    .line 529
    :cond_7
    throw v0

    .line 530
    :catchall_3
    move-exception v0

    .line 531
    move-object v5, v0

    .line 532
    goto :goto_b

    .line 533
    :cond_8
    new-instance v0, Ljava/io/IOException;

    .line 534
    .line 535
    invoke-direct {v0, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 539
    :cond_9
    :goto_a
    :try_start_b
    invoke-virtual {v6}, Lxu3;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 540
    .line 541
    .line 542
    const/4 v0, 0x0

    .line 543
    goto :goto_d

    .line 544
    :catchall_4
    move-exception v0

    .line 545
    goto :goto_d

    .line 546
    :goto_b
    :try_start_c
    invoke-virtual {v6}, Lxu3;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 547
    .line 548
    .line 549
    goto :goto_c

    .line 550
    :catchall_5
    move-exception v0

    .line 551
    :try_start_d
    invoke-static {v5, v0}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 552
    .line 553
    .line 554
    :goto_c
    move-object v0, v5

    .line 555
    :goto_d
    if-nez v0, :cond_a

    .line 556
    .line 557
    :goto_e
    move-object/from16 v0, v19

    .line 558
    .line 559
    goto :goto_10

    .line 560
    :cond_a
    throw v0

    .line 561
    :catchall_6
    move-exception v0

    .line 562
    :goto_f
    move-object v1, v0

    .line 563
    goto/16 :goto_19

    .line 564
    .line 565
    :cond_b
    move-object/from16 v4, v28

    .line 566
    .line 567
    goto :goto_e

    .line 568
    :goto_10
    new-instance v5, Ljava/util/ArrayList;

    .line 569
    .line 570
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 571
    .line 572
    .line 573
    iget-wide v11, v0, Lpu;->b:J

    .line 574
    .line 575
    invoke-virtual {v4, v11, v12}, Lr32;->b(J)Lw61;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    new-instance v11, Lxu3;

    .line 580
    .line 581
    invoke-direct {v11, v6}, Lxu3;-><init>(Lej4;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 582
    .line 583
    .line 584
    :try_start_e
    iget-wide v12, v0, Lpu;->a:J

    .line 585
    .line 586
    :goto_11
    cmp-long v6, v17, v12

    .line 587
    .line 588
    if-gez v6, :cond_e

    .line 589
    .line 590
    invoke-static {v11}, Lgb;->V(Lxu3;)Lne5;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    iget-wide v14, v6, Lne5;->h:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 595
    .line 596
    move/from16 p0, v10

    .line 597
    .line 598
    move-object/from16 v19, v11

    .line 599
    .line 600
    :try_start_f
    iget-wide v10, v0, Lpu;->b:J

    .line 601
    .line 602
    cmp-long v10, v14, v10

    .line 603
    .line 604
    if-gez v10, :cond_d

    .line 605
    .line 606
    sget-object v10, Ly04;->f:Lge3;

    .line 607
    .line 608
    iget-object v10, v6, Lne5;->a:Lge3;

    .line 609
    .line 610
    invoke-static {v10}, Lhh3;->d(Lge3;)Z

    .line 611
    .line 612
    .line 613
    move-result v10

    .line 614
    if-eqz v10, :cond_c

    .line 615
    .line 616
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    goto :goto_13

    .line 620
    :catchall_7
    move-exception v0

    .line 621
    :goto_12
    move-object v6, v0

    .line 622
    goto :goto_14

    .line 623
    :cond_c
    :goto_13
    const-wide/16 v10, 0x1

    .line 624
    .line 625
    add-long v17, v17, v10

    .line 626
    .line 627
    move/from16 v10, p0

    .line 628
    .line 629
    move-object/from16 v11, v19

    .line 630
    .line 631
    goto :goto_11

    .line 632
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 633
    .line 634
    const-string v6, "bad zip: local file header offset >= central directory offset"

    .line 635
    .line 636
    invoke-direct {v0, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 640
    :catchall_8
    move-exception v0

    .line 641
    move/from16 p0, v10

    .line 642
    .line 643
    move-object/from16 v19, v11

    .line 644
    .line 645
    goto :goto_12

    .line 646
    :cond_e
    move/from16 p0, v10

    .line 647
    .line 648
    move-object/from16 v19, v11

    .line 649
    .line 650
    :try_start_10
    invoke-virtual/range {v19 .. v19}, Lxu3;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 651
    .line 652
    .line 653
    const/4 v0, 0x0

    .line 654
    goto :goto_16

    .line 655
    :catchall_9
    move-exception v0

    .line 656
    goto :goto_16

    .line 657
    :goto_14
    :try_start_11
    invoke-virtual/range {v19 .. v19}, Lxu3;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 658
    .line 659
    .line 660
    goto :goto_15

    .line 661
    :catchall_a
    move-exception v0

    .line 662
    :try_start_12
    invoke-static {v6, v0}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 663
    .line 664
    .line 665
    :goto_15
    move-object v0, v6

    .line 666
    :goto_16
    if-nez v0, :cond_10

    .line 667
    .line 668
    invoke-static {v5}, Lgb;->g(Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    new-instance v5, Loe5;

    .line 673
    .line 674
    invoke-direct {v5, v9, v2, v0}, Loe5;-><init>(Lge3;Lb71;Ljava/util/LinkedHashMap;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 675
    .line 676
    .line 677
    :try_start_13
    invoke-virtual {v4}, Lr32;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    .line 678
    .line 679
    .line 680
    :catchall_b
    sget-object v0, Ly04;->f:Lge3;

    .line 681
    .line 682
    new-instance v4, Lkd3;

    .line 683
    .line 684
    invoke-direct {v4, v5, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    move-object v6, v4

    .line 688
    :goto_17
    if-eqz v6, :cond_f

    .line 689
    .line 690
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    :cond_f
    move/from16 v0, p0

    .line 694
    .line 695
    const/4 v4, -0x1

    .line 696
    const/4 v5, 0x0

    .line 697
    goto/16 :goto_2

    .line 698
    .line 699
    :cond_10
    :try_start_14
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 700
    :catchall_c
    move-exception v0

    .line 701
    move-object/from16 v4, v28

    .line 702
    .line 703
    goto/16 :goto_f

    .line 704
    .line 705
    :catchall_d
    move-exception v0

    .line 706
    move-object/from16 v4, v28

    .line 707
    .line 708
    goto :goto_18

    .line 709
    :cond_11
    move-object/from16 v4, v28

    .line 710
    .line 711
    :try_start_15
    new-instance v0, Ljava/io/IOException;

    .line 712
    .line 713
    invoke-direct {v0, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    .line 717
    :catchall_e
    move-exception v0

    .line 718
    goto :goto_18

    .line 719
    :cond_12
    move-wide/from16 v25, v5

    .line 720
    .line 721
    move/from16 p0, v10

    .line 722
    .line 723
    move/from16 v27, v11

    .line 724
    .line 725
    move-object v4, v12

    .line 726
    :try_start_16
    invoke-virtual {v15}, Lxu3;->close()V

    .line 727
    .line 728
    .line 729
    const-wide/16 v5, -0x1

    .line 730
    .line 731
    add-long v5, v25, v5

    .line 732
    .line 733
    cmp-long v0, v5, v13

    .line 734
    .line 735
    if-ltz v0, :cond_13

    .line 736
    .line 737
    move/from16 v10, p0

    .line 738
    .line 739
    move-object v12, v4

    .line 740
    move/from16 v11, v27

    .line 741
    .line 742
    const/4 v4, -0x1

    .line 743
    goto/16 :goto_4

    .line 744
    .line 745
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 746
    .line 747
    const-string v1, "not a zip: end of central directory signature not found"

    .line 748
    .line 749
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    throw v0

    .line 753
    :catchall_f
    move-exception v0

    .line 754
    move-object v4, v12

    .line 755
    :goto_18
    invoke-virtual {v15}, Lxu3;->close()V

    .line 756
    .line 757
    .line 758
    throw v0

    .line 759
    :catchall_10
    move-exception v0

    .line 760
    move-object v4, v12

    .line 761
    goto/16 :goto_f

    .line 762
    .line 763
    :cond_14
    move-object v4, v12

    .line 764
    new-instance v1, Ljava/io/IOException;

    .line 765
    .line 766
    new-instance v2, Ljava/lang/StringBuilder;

    .line 767
    .line 768
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v4}, Lr32;->size()J

    .line 772
    .line 773
    .line 774
    move-result-wide v5

    .line 775
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    throw v1
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    .line 786
    :goto_19
    if-eqz v4, :cond_15

    .line 787
    .line 788
    :try_start_17
    invoke-virtual {v4}, Lr32;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_11

    .line 789
    .line 790
    .line 791
    goto :goto_1a

    .line 792
    :catchall_11
    move-exception v0

    .line 793
    invoke-static {v1, v0}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 794
    .line 795
    .line 796
    :cond_15
    :goto_1a
    throw v1

    .line 797
    :cond_16
    invoke-static {v3, v7}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    return-object v0

    .line 802
    :pswitch_3
    check-cast v0, Landroidx/navigation/fragment/NavHostFragment;

    .line 803
    .line 804
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    if-eqz v1, :cond_26

    .line 809
    .line 810
    new-instance v2, Lv23;

    .line 811
    .line 812
    invoke-direct {v2, v1}, Lv23;-><init>(Landroid/content/Context;)V

    .line 813
    .line 814
    .line 815
    iget-object v4, v2, Lv23;->n:Lba2;

    .line 816
    .line 817
    if-eq v0, v4, :cond_18

    .line 818
    .line 819
    iget-object v5, v2, Lv23;->r:Lpd1;

    .line 820
    .line 821
    if-eqz v4, :cond_17

    .line 822
    .line 823
    invoke-interface {v4}, Lba2;->h()Lea2;

    .line 824
    .line 825
    .line 826
    move-result-object v4

    .line 827
    if-eqz v4, :cond_17

    .line 828
    .line 829
    invoke-virtual {v4, v5}, Lea2;->f(Laa2;)V

    .line 830
    .line 831
    .line 832
    :cond_17
    iput-object v0, v2, Lv23;->n:Lba2;

    .line 833
    .line 834
    iget-object v4, v0, Lkc1;->c0:Lea2;

    .line 835
    .line 836
    invoke-virtual {v4, v5}, Lea2;->a(Laa2;)V

    .line 837
    .line 838
    .line 839
    :cond_18
    invoke-virtual {v0}, Lkc1;->d()Le75;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    iget-object v5, v2, Lv23;->o:Lj23;

    .line 844
    .line 845
    invoke-static {v4}, Lsu3;->s(Le75;)Lj23;

    .line 846
    .line 847
    .line 848
    move-result-object v6

    .line 849
    invoke-static {v5, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v5

    .line 853
    if-eqz v5, :cond_19

    .line 854
    .line 855
    goto :goto_1b

    .line 856
    :cond_19
    iget-object v5, v2, Lv23;->g:Lii;

    .line 857
    .line 858
    invoke-virtual {v5}, Lii;->isEmpty()Z

    .line 859
    .line 860
    .line 861
    move-result v5

    .line 862
    if-eqz v5, :cond_25

    .line 863
    .line 864
    invoke-static {v4}, Lsu3;->s(Le75;)Lj23;

    .line 865
    .line 866
    .line 867
    move-result-object v4

    .line 868
    iput-object v4, v2, Lv23;->o:Lj23;

    .line 869
    .line 870
    :goto_1b
    new-instance v4, Ltp0;

    .line 871
    .line 872
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 873
    .line 874
    .line 875
    move-result-object v5

    .line 876
    invoke-virtual {v0}, Lkc1;->m()Lld1;

    .line 877
    .line 878
    .line 879
    move-result-object v6

    .line 880
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    invoke-direct {v4, v5, v6}, Ltp0;-><init>(Landroid/content/Context;Lld1;)V

    .line 884
    .line 885
    .line 886
    iget-object v5, v2, Lv23;->u:Lu43;

    .line 887
    .line 888
    invoke-virtual {v5, v4}, Lu43;->a(Lt43;)V

    .line 889
    .line 890
    .line 891
    new-instance v4, Lrd1;

    .line 892
    .line 893
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 894
    .line 895
    .line 896
    move-result-object v6

    .line 897
    invoke-virtual {v0}, Lkc1;->m()Lld1;

    .line 898
    .line 899
    .line 900
    move-result-object v7

    .line 901
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 902
    .line 903
    .line 904
    iget v8, v0, Lkc1;->J:I

    .line 905
    .line 906
    if-eqz v8, :cond_1a

    .line 907
    .line 908
    const/4 v9, -0x1

    .line 909
    if-eq v8, v9, :cond_1a

    .line 910
    .line 911
    goto :goto_1c

    .line 912
    :cond_1a
    const v8, 0x7f0a040f

    .line 913
    .line 914
    .line 915
    :goto_1c
    invoke-direct {v4, v6, v7, v8}, Lrd1;-><init>(Landroid/content/Context;Lld1;I)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v5, v4}, Lu43;->a(Lt43;)V

    .line 919
    .line 920
    .line 921
    iget-object v4, v0, Lkc1;->g0:Lgp3;

    .line 922
    .line 923
    iget-object v4, v4, Lgp3;->p:Ljava/lang/Object;

    .line 924
    .line 925
    check-cast v4, Lrm3;

    .line 926
    .line 927
    const-string v5, "android-support-nav:fragment:navControllerState"

    .line 928
    .line 929
    invoke-virtual {v4, v5}, Lrm3;->A(Ljava/lang/String;)Landroid/os/Bundle;

    .line 930
    .line 931
    .line 932
    move-result-object v4

    .line 933
    if-eqz v4, :cond_1f

    .line 934
    .line 935
    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    invoke-virtual {v4, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 940
    .line 941
    .line 942
    const-string v1, "android-support-nav:controller:navigatorState"

    .line 943
    .line 944
    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    iput-object v1, v2, Lv23;->d:Landroid/os/Bundle;

    .line 949
    .line 950
    const-string v1, "android-support-nav:controller:backStack"

    .line 951
    .line 952
    invoke-virtual {v4, v1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    iput-object v1, v2, Lv23;->e:[Landroid/os/Parcelable;

    .line 957
    .line 958
    iget-object v1, v2, Lv23;->m:Ljava/util/LinkedHashMap;

    .line 959
    .line 960
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    .line 961
    .line 962
    .line 963
    const-string v6, "android-support-nav:controller:backStackDestIds"

    .line 964
    .line 965
    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 966
    .line 967
    .line 968
    move-result-object v6

    .line 969
    const-string v7, "android-support-nav:controller:backStackIds"

    .line 970
    .line 971
    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 972
    .line 973
    .line 974
    move-result-object v7

    .line 975
    if-eqz v6, :cond_1b

    .line 976
    .line 977
    if-eqz v7, :cond_1b

    .line 978
    .line 979
    array-length v8, v6

    .line 980
    const/4 v9, 0x0

    .line 981
    const/4 v10, 0x0

    .line 982
    :goto_1d
    if-ge v9, v8, :cond_1b

    .line 983
    .line 984
    aget v11, v6, v9

    .line 985
    .line 986
    add-int/lit8 v12, v10, 0x1

    .line 987
    .line 988
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 989
    .line 990
    .line 991
    move-result-object v11

    .line 992
    iget-object v13, v2, Lv23;->l:Ljava/util/LinkedHashMap;

    .line 993
    .line 994
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v10

    .line 998
    invoke-interface {v13, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    add-int/lit8 v9, v9, 0x1

    .line 1002
    .line 1003
    move v10, v12

    .line 1004
    goto :goto_1d

    .line 1005
    :cond_1b
    const-string v6, "android-support-nav:controller:backStackStates"

    .line 1006
    .line 1007
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v6

    .line 1011
    if-eqz v6, :cond_1e

    .line 1012
    .line 1013
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 1014
    .line 1015
    .line 1016
    move-result v7

    .line 1017
    const/4 v8, 0x0

    .line 1018
    :cond_1c
    :goto_1e
    if-ge v8, v7, :cond_1e

    .line 1019
    .line 1020
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v9

    .line 1024
    add-int/lit8 v8, v8, 0x1

    .line 1025
    .line 1026
    check-cast v9, Ljava/lang/String;

    .line 1027
    .line 1028
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    const-string v11, "android-support-nav:controller:backStackStates:"

    .line 1031
    .line 1032
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v10

    .line 1042
    invoke-virtual {v4, v10}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v10

    .line 1046
    if-eqz v10, :cond_1c

    .line 1047
    .line 1048
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    new-instance v11, Lii;

    .line 1052
    .line 1053
    array-length v12, v10

    .line 1054
    invoke-direct {v11, v12}, Lii;-><init>(I)V

    .line 1055
    .line 1056
    .line 1057
    const/4 v12, 0x0

    .line 1058
    :goto_1f
    array-length v13, v10

    .line 1059
    if-ge v12, v13, :cond_1d

    .line 1060
    .line 1061
    add-int/lit8 v13, v12, 0x1

    .line 1062
    .line 1063
    :try_start_18
    aget-object v12, v10, v12
    :try_end_18
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_18 .. :try_end_18} :catch_0

    .line 1064
    .line 1065
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    check-cast v12, Lc23;

    .line 1069
    .line 1070
    invoke-virtual {v11, v12}, Lii;->addLast(Ljava/lang/Object;)V

    .line 1071
    .line 1072
    .line 1073
    move v12, v13

    .line 1074
    goto :goto_1f

    .line 1075
    :catch_0
    move-exception v0

    .line 1076
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    invoke-static {v0}, Lkf2;->m(Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    :goto_20
    const/4 v6, 0x0

    .line 1084
    goto/16 :goto_24

    .line 1085
    .line 1086
    :cond_1d
    invoke-interface {v1, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1087
    .line 1088
    .line 1089
    goto :goto_1e

    .line 1090
    :cond_1e
    const-string v1, "android-support-nav:controller:deepLinkHandled"

    .line 1091
    .line 1092
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v1

    .line 1096
    iput-boolean v1, v2, Lv23;->f:Z

    .line 1097
    .line 1098
    :cond_1f
    iget-object v1, v0, Lkc1;->g0:Lgp3;

    .line 1099
    .line 1100
    iget-object v1, v1, Lgp3;->p:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v1, Lrm3;

    .line 1103
    .line 1104
    new-instance v4, Lcs0;

    .line 1105
    .line 1106
    invoke-direct {v4, v3, v2}, Lcs0;-><init>(ILjava/lang/Object;)V

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v1, v5, v4}, Lrm3;->L(Ljava/lang/String;Li54;)V

    .line 1110
    .line 1111
    .line 1112
    iget-object v1, v0, Lkc1;->g0:Lgp3;

    .line 1113
    .line 1114
    iget-object v1, v1, Lgp3;->p:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v1, Lrm3;

    .line 1117
    .line 1118
    const-string v3, "android-support-nav:fragment:graphId"

    .line 1119
    .line 1120
    invoke-virtual {v1, v3}, Lrm3;->A(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v1

    .line 1124
    if-eqz v1, :cond_20

    .line 1125
    .line 1126
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    iput v1, v0, Landroidx/navigation/fragment/NavHostFragment;->n0:I

    .line 1131
    .line 1132
    :cond_20
    iget-object v1, v0, Lkc1;->g0:Lgp3;

    .line 1133
    .line 1134
    iget-object v1, v1, Lgp3;->p:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v1, Lrm3;

    .line 1137
    .line 1138
    new-instance v4, Lcs0;

    .line 1139
    .line 1140
    const/4 v5, 0x3

    .line 1141
    invoke-direct {v4, v5, v0}, Lcs0;-><init>(ILjava/lang/Object;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v1, v3, v4}, Lrm3;->L(Ljava/lang/String;Li54;)V

    .line 1145
    .line 1146
    .line 1147
    iget v1, v0, Landroidx/navigation/fragment/NavHostFragment;->n0:I

    .line 1148
    .line 1149
    iget-object v4, v2, Lv23;->B:Lrp4;

    .line 1150
    .line 1151
    if-eqz v1, :cond_22

    .line 1152
    .line 1153
    invoke-virtual {v4}, Lrp4;->getValue()Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    check-cast v0, Lw23;

    .line 1158
    .line 1159
    invoke-virtual {v0, v1}, Lw23;->b(I)Lt23;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    const/4 v1, 0x0

    .line 1164
    invoke-virtual {v2, v0, v1}, Lv23;->v(Lt23;Landroid/os/Bundle;)V

    .line 1165
    .line 1166
    .line 1167
    :cond_21
    :goto_21
    move-object v6, v2

    .line 1168
    goto :goto_24

    .line 1169
    :cond_22
    iget-object v0, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 1170
    .line 1171
    if-eqz v0, :cond_23

    .line 1172
    .line 1173
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1174
    .line 1175
    .line 1176
    move-result v5

    .line 1177
    goto :goto_22

    .line 1178
    :cond_23
    const/4 v5, 0x0

    .line 1179
    :goto_22
    if-eqz v0, :cond_24

    .line 1180
    .line 1181
    const-string v1, "android-support-nav:fragment:startDestinationArgs"

    .line 1182
    .line 1183
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v6

    .line 1187
    goto :goto_23

    .line 1188
    :cond_24
    const/4 v6, 0x0

    .line 1189
    :goto_23
    if-eqz v5, :cond_21

    .line 1190
    .line 1191
    invoke-virtual {v4}, Lrp4;->getValue()Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    check-cast v0, Lw23;

    .line 1196
    .line 1197
    invoke-virtual {v0, v5}, Lw23;->b(I)Lt23;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    invoke-virtual {v2, v0, v6}, Lv23;->v(Lt23;Landroid/os/Bundle;)V

    .line 1202
    .line 1203
    .line 1204
    goto :goto_21

    .line 1205
    :cond_25
    const-string v0, "ViewModelStore should be set before setGraph call"

    .line 1206
    .line 1207
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    goto :goto_20

    .line 1211
    :cond_26
    const-string v0, "NavController cannot be created before the fragment is attached"

    .line 1212
    .line 1213
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    goto/16 :goto_20

    .line 1217
    .line 1218
    :goto_24
    return-object v6

    .line 1219
    :pswitch_4
    check-cast v0, Ljava/lang/String;

    .line 1220
    .line 1221
    new-instance v1, Ln23;

    .line 1222
    .line 1223
    const/4 v2, 0x0

    .line 1224
    invoke-direct {v1, v0, v2, v2}, Ln23;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    return-object v1

    .line 1228
    :pswitch_5
    check-cast v0, Lv23;

    .line 1229
    .line 1230
    new-instance v1, Lw23;

    .line 1231
    .line 1232
    iget-object v2, v0, Lv23;->a:Landroid/content/Context;

    .line 1233
    .line 1234
    iget-object v0, v0, Lv23;->u:Lu43;

    .line 1235
    .line 1236
    invoke-direct {v1, v2, v0}, Lw23;-><init>(Landroid/content/Context;Lu43;)V

    .line 1237
    .line 1238
    .line 1239
    return-object v1

    .line 1240
    :pswitch_6
    const/4 v2, 0x0

    .line 1241
    new-instance v1, Lk54;

    .line 1242
    .line 1243
    check-cast v0, La23;

    .line 1244
    .line 1245
    iget-object v3, v0, La23;->n:Landroid/content/Context;

    .line 1246
    .line 1247
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v3

    .line 1251
    instance-of v4, v3, Landroid/app/Application;

    .line 1252
    .line 1253
    if-eqz v4, :cond_27

    .line 1254
    .line 1255
    move-object v6, v3

    .line 1256
    check-cast v6, Landroid/app/Application;

    .line 1257
    .line 1258
    goto :goto_25

    .line 1259
    :cond_27
    move-object v6, v2

    .line 1260
    :goto_25
    invoke-virtual {v0}, La23;->c()Landroid/os/Bundle;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v2

    .line 1264
    invoke-direct {v1, v6, v0, v2}, Lk54;-><init>(Landroid/app/Application;Lj54;Landroid/os/Bundle;)V

    .line 1265
    .line 1266
    .line 1267
    return-object v1

    .line 1268
    :pswitch_7
    move-object v1, v0

    .line 1269
    check-cast v1, Lrq1;

    .line 1270
    .line 1271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1272
    .line 1273
    .line 1274
    :try_start_19
    iget-object v0, v1, Lrq1;->J:Lzq1;

    .line 1275
    .line 1276
    const/4 v4, 0x0

    .line 1277
    invoke-virtual {v0, v3, v4, v4}, Lzq1;->s(IIZ)V
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_1

    .line 1278
    .line 1279
    .line 1280
    goto :goto_26

    .line 1281
    :catch_1
    move-exception v0

    .line 1282
    invoke-virtual {v1, v0}, Lrq1;->f(Ljava/io/IOException;)V

    .line 1283
    .line 1284
    .line 1285
    :goto_26
    return-object v2

    .line 1286
    :pswitch_8
    check-cast v0, Lwo0;

    .line 1287
    .line 1288
    new-instance v1, Landroidx/credentials/exceptions/GetCredentialUnsupportedException;

    .line 1289
    .line 1290
    const-string v3, "Your device doesn\'t support credential manager"

    .line 1291
    .line 1292
    invoke-direct {v1, v3}, Landroidx/credentials/exceptions/GetCredentialUnsupportedException;-><init>(Ljava/lang/CharSequence;)V

    .line 1293
    .line 1294
    .line 1295
    invoke-virtual {v0, v1}, Lwo0;->F(Ljava/lang/Object;)V

    .line 1296
    .line 1297
    .line 1298
    return-object v2

    .line 1299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
