.class public final synthetic Lz;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lz;->n:I

    .line 2
    .line 3
    iput-object p3, p0, Lz;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 9
    iput p1, p0, Lz;->n:I

    iput-object p2, p0, Lz;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, Lz;->n:I

    .line 6
    .line 7
    const/16 v7, 0x8

    .line 8
    .line 9
    const/4 v10, 0x7

    .line 10
    const/4 v11, 0x2

    .line 11
    const/4 v12, 0x3

    .line 12
    const/4 v13, 0x0

    .line 13
    const/4 v14, 0x0

    .line 14
    const/4 v15, 0x1

    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    move-object/from16 v3, p1

    .line 23
    .line 24
    check-cast v3, Ljava/lang/CharSequence;

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ne v2, v15, :cond_2

    .line 40
    .line 41
    invoke-static {v0}, Lq40;->I0(Ljava/util/List;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    invoke-static {v3, v0, v1, v2}, Lqm4;->s0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-gez v1, :cond_1

    .line 53
    .line 54
    :cond_0
    move-object v2, v13

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, Lkd3;

    .line 62
    .line 63
    invoke-direct {v2, v1, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_4

    .line 67
    .line 68
    :cond_2
    new-instance v2, Lj02;

    .line 69
    .line 70
    if-gez v1, :cond_3

    .line 71
    .line 72
    move v1, v14

    .line 73
    :cond_3
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-direct {v2, v1, v4, v15}, Lh02;-><init>(III)V

    .line 78
    .line 79
    .line 80
    iget v7, v2, Lh02;->p:I

    .line 81
    .line 82
    iget v8, v2, Lh02;->o:I

    .line 83
    .line 84
    instance-of v2, v3, Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v2, :cond_9

    .line 87
    .line 88
    if-lez v7, :cond_4

    .line 89
    .line 90
    if-le v1, v8, :cond_5

    .line 91
    .line 92
    :cond_4
    if-gez v7, :cond_0

    .line 93
    .line 94
    if-gt v8, v1, :cond_0

    .line 95
    .line 96
    :cond_5
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    move-object v5, v4

    .line 111
    check-cast v5, Ljava/lang/String;

    .line 112
    .line 113
    move-object v6, v3

    .line 114
    check-cast v6, Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v5, v14, v6, v1, v9}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_6

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_7
    move-object v4, v13

    .line 128
    :goto_1
    check-cast v4, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v4, :cond_8

    .line 131
    .line 132
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v2, Lkd3;

    .line 137
    .line 138
    invoke-direct {v2, v0, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    if-eq v1, v8, :cond_0

    .line 143
    .line 144
    add-int/2addr v1, v7

    .line 145
    goto :goto_0

    .line 146
    :cond_9
    if-lez v7, :cond_a

    .line 147
    .line 148
    if-le v1, v8, :cond_b

    .line 149
    .line 150
    :cond_a
    if-gez v7, :cond_0

    .line 151
    .line 152
    if-gt v8, v1, :cond_0

    .line 153
    .line 154
    :cond_b
    move v4, v1

    .line 155
    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    :cond_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_d

    .line 164
    .line 165
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    move-object v1, v10

    .line 170
    check-cast v1, Ljava/lang/String;

    .line 171
    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    const/4 v6, 0x0

    .line 178
    invoke-static/range {v1 .. v6}, Lqm4;->y0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_c

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_d
    move-object v10, v13

    .line 186
    :goto_3
    check-cast v10, Ljava/lang/String;

    .line 187
    .line 188
    if-eqz v10, :cond_e

    .line 189
    .line 190
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    new-instance v2, Lkd3;

    .line 195
    .line 196
    invoke-direct {v2, v0, v10}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_e
    if-eq v4, v8, :cond_0

    .line 201
    .line 202
    add-int/2addr v4, v7

    .line 203
    goto :goto_2

    .line 204
    :goto_4
    if-eqz v2, :cond_f

    .line 205
    .line 206
    iget-object v0, v2, Lkd3;->n:Ljava/lang/Object;

    .line 207
    .line 208
    iget-object v1, v2, Lkd3;->o:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-instance v13, Lkd3;

    .line 221
    .line 222
    invoke-direct {v13, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_f
    return-object v13

    .line 226
    :pswitch_0
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, [C

    .line 229
    .line 230
    move-object/from16 v2, p1

    .line 231
    .line 232
    check-cast v2, Ljava/lang/CharSequence;

    .line 233
    .line 234
    check-cast v1, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {v2, v0, v1, v14}, Lqm4;->t0(Ljava/lang/CharSequence;[CIZ)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-gez v0, :cond_10

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    new-instance v13, Lkd3;

    .line 259
    .line 260
    invoke-direct {v13, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    :goto_5
    return-object v13

    .line 264
    :pswitch_1
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, Lpp3;

    .line 267
    .line 268
    move-object/from16 v2, p1

    .line 269
    .line 270
    check-cast v2, Ljava/util/Set;

    .line 271
    .line 272
    check-cast v1, Lch4;

    .line 273
    .line 274
    iget-object v1, v0, Lpp3;->d:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 277
    .line 278
    :goto_6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    if-nez v3, :cond_11

    .line 283
    .line 284
    move-object v4, v2

    .line 285
    check-cast v4, Ljava/util/Collection;

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_11
    instance-of v4, v3, Ljava/util/Set;

    .line 289
    .line 290
    if-eqz v4, :cond_12

    .line 291
    .line 292
    new-array v4, v11, [Ljava/util/Set;

    .line 293
    .line 294
    aput-object v3, v4, v14

    .line 295
    .line 296
    aput-object v2, v4, v15

    .line 297
    .line 298
    invoke-static {v4}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    goto :goto_7

    .line 303
    :cond_12
    instance-of v4, v3, Ljava/util/List;

    .line 304
    .line 305
    if-eqz v4, :cond_16

    .line 306
    .line 307
    move-object v4, v3

    .line 308
    check-cast v4, Ljava/util/Collection;

    .line 309
    .line 310
    invoke-static {v2}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-static {v4, v5}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    :cond_13
    :goto_7
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_15

    .line 323
    .line 324
    invoke-virtual {v0}, Lpp3;->a()Z

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    if-eqz v1, :cond_14

    .line 329
    .line 330
    iget-object v1, v0, Lpp3;->c:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v1, Lja;

    .line 333
    .line 334
    new-instance v2, Lwc;

    .line 335
    .line 336
    const/16 v3, 0x1a

    .line 337
    .line 338
    invoke-direct {v2, v3, v0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v2}, Lja;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    :cond_14
    sget-object v13, Lj15;->a:Lj15;

    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_15
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    if-eq v5, v3, :cond_13

    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_16
    const-string v0, "Unexpected notification"

    .line 355
    .line 356
    invoke-static {v0}, Ll80;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 357
    .line 358
    .line 359
    invoke-static {}, Ler1;->a()V

    .line 360
    .line 361
    .line 362
    :goto_8
    return-object v13

    .line 363
    :pswitch_2
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v0, Ljf4;

    .line 366
    .line 367
    move-object/from16 v2, p1

    .line 368
    .line 369
    check-cast v2, Ljava/util/Set;

    .line 370
    .line 371
    check-cast v1, Lch4;

    .line 372
    .line 373
    iget-object v1, v0, Lrp;->a:Ljava/lang/Object;

    .line 374
    .line 375
    monitor-enter v1

    .line 376
    :try_start_0
    iget-object v12, v0, Ljf4;->d:Lx03;

    .line 377
    .line 378
    if-nez v12, :cond_17

    .line 379
    .line 380
    check-cast v2, Ljava/lang/Iterable;

    .line 381
    .line 382
    iget-object v3, v0, Ljf4;->b:Ljava/lang/Object;

    .line 383
    .line 384
    invoke-static {v2, v3}, Lq40;->s0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-eqz v2, :cond_1b

    .line 389
    .line 390
    iget-object v13, v0, Ljf4;->f:Ly94;

    .line 391
    .line 392
    goto :goto_b

    .line 393
    :catchall_0
    move-exception v0

    .line 394
    goto :goto_c

    .line 395
    :cond_17
    iget-object v15, v12, Lx03;->b:[Ljava/lang/Object;

    .line 396
    .line 397
    iget-object v12, v12, Lx03;->a:[J

    .line 398
    .line 399
    const-wide/16 v16, 0x80

    .line 400
    .line 401
    array-length v3, v12

    .line 402
    sub-int/2addr v3, v11

    .line 403
    if-ltz v3, :cond_1b

    .line 404
    .line 405
    move v4, v14

    .line 406
    const-wide/16 v18, 0xff

    .line 407
    .line 408
    :goto_9
    aget-wide v5, v12, v4

    .line 409
    .line 410
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    not-long v8, v5

    .line 416
    shl-long/2addr v8, v10

    .line 417
    and-long/2addr v8, v5

    .line 418
    and-long v8, v8, v20

    .line 419
    .line 420
    cmp-long v8, v8, v20

    .line 421
    .line 422
    if-eqz v8, :cond_1a

    .line 423
    .line 424
    sub-int v8, v4, v3

    .line 425
    .line 426
    not-int v8, v8

    .line 427
    ushr-int/lit8 v8, v8, 0x1f

    .line 428
    .line 429
    rsub-int/lit8 v8, v8, 0x8

    .line 430
    .line 431
    move v9, v14

    .line 432
    :goto_a
    if-ge v9, v8, :cond_19

    .line 433
    .line 434
    and-long v22, v5, v18

    .line 435
    .line 436
    cmp-long v11, v22, v16

    .line 437
    .line 438
    if-gez v11, :cond_18

    .line 439
    .line 440
    shl-int/lit8 v11, v4, 0x3

    .line 441
    .line 442
    add-int/2addr v11, v9

    .line 443
    aget-object v11, v15, v11

    .line 444
    .line 445
    invoke-interface {v2, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v11

    .line 449
    if-eqz v11, :cond_18

    .line 450
    .line 451
    iget-object v13, v0, Ljf4;->f:Ly94;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_18
    shr-long/2addr v5, v7

    .line 455
    add-int/lit8 v9, v9, 0x1

    .line 456
    .line 457
    goto :goto_a

    .line 458
    :cond_19
    if-ne v8, v7, :cond_1b

    .line 459
    .line 460
    :cond_1a
    if-eq v4, v3, :cond_1b

    .line 461
    .line 462
    add-int/lit8 v4, v4, 0x1

    .line 463
    .line 464
    goto :goto_9

    .line 465
    :cond_1b
    :goto_b
    monitor-exit v1

    .line 466
    if-eqz v13, :cond_1c

    .line 467
    .line 468
    sget-object v0, Lj15;->a:Lj15;

    .line 469
    .line 470
    invoke-interface {v13, v0}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    :cond_1c
    sget-object v0, Lj15;->a:Lj15;

    .line 474
    .line 475
    return-object v0

    .line 476
    :goto_c
    monitor-exit v1

    .line 477
    throw v0

    .line 478
    :pswitch_3
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, La44;

    .line 481
    .line 482
    move-object/from16 v2, p1

    .line 483
    .line 484
    check-cast v2, Ljava/lang/Integer;

    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    check-cast v1, Lle0;

    .line 491
    .line 492
    invoke-interface {v1}, Lle0;->getKey()Lme0;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    iget-object v0, v0, La44;->o:Lne0;

    .line 497
    .line 498
    invoke-interface {v0, v3}, Lne0;->K(Lme0;)Lle0;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sget-object v4, Lfz0;->h0:Lfz0;

    .line 503
    .line 504
    if-eq v3, v4, :cond_1e

    .line 505
    .line 506
    if-eq v1, v0, :cond_1d

    .line 507
    .line 508
    const/high16 v2, -0x80000000

    .line 509
    .line 510
    goto :goto_10

    .line 511
    :cond_1d
    add-int/lit8 v2, v2, 0x1

    .line 512
    .line 513
    goto :goto_10

    .line 514
    :cond_1e
    move-object v3, v0

    .line 515
    check-cast v3, Ls22;

    .line 516
    .line 517
    check-cast v1, Ls22;

    .line 518
    .line 519
    :goto_d
    if-nez v1, :cond_1f

    .line 520
    .line 521
    goto :goto_f

    .line 522
    :cond_1f
    if-ne v1, v3, :cond_20

    .line 523
    .line 524
    goto :goto_e

    .line 525
    :cond_20
    instance-of v0, v1, Le64;

    .line 526
    .line 527
    if-nez v0, :cond_22

    .line 528
    .line 529
    :goto_e
    move-object v13, v1

    .line 530
    :goto_f
    if-ne v13, v3, :cond_21

    .line 531
    .line 532
    if-nez v3, :cond_1d

    .line 533
    .line 534
    :goto_10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    return-object v0

    .line 539
    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 540
    .line 541
    new-instance v1, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    const-string v2, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 544
    .line 545
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    const-string v2, ", expected child of "

    .line 552
    .line 553
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    const-string v2, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 560
    .line 561
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :cond_22
    check-cast v1, Le64;

    .line 577
    .line 578
    invoke-virtual {v1}, La32;->G()Lc20;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    if-eqz v0, :cond_23

    .line 583
    .line 584
    invoke-interface {v0}, Lc20;->getParent()Ls22;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    move-object v1, v0

    .line 589
    goto :goto_d

    .line 590
    :cond_23
    move-object v1, v13

    .line 591
    goto :goto_d

    .line 592
    :pswitch_4
    const-wide/16 v16, 0x80

    .line 593
    .line 594
    const-wide/16 v18, 0xff

    .line 595
    .line 596
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v0, Ltv3;

    .line 604
    .line 605
    move-object/from16 v2, p1

    .line 606
    .line 607
    check-cast v2, Ljava/util/Set;

    .line 608
    .line 609
    check-cast v1, Lch4;

    .line 610
    .line 611
    iget-object v1, v0, Ltv3;->c:Ljava/lang/Object;

    .line 612
    .line 613
    monitor-enter v1

    .line 614
    :try_start_1
    iget-object v3, v0, Ltv3;->u:Lnl4;

    .line 615
    .line 616
    invoke-virtual {v3}, Lnl4;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v3

    .line 620
    check-cast v3, Lov3;

    .line 621
    .line 622
    sget-object v4, Lov3;->r:Lov3;

    .line 623
    .line 624
    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 625
    .line 626
    .line 627
    move-result v3

    .line 628
    if-ltz v3, :cond_2b

    .line 629
    .line 630
    iget-object v3, v0, Ltv3;->h:Lx03;

    .line 631
    .line 632
    instance-of v4, v2, Lx54;

    .line 633
    .line 634
    if-eqz v4, :cond_28

    .line 635
    .line 636
    check-cast v2, Lx54;

    .line 637
    .line 638
    iget-object v2, v2, Lx54;->n:Lx03;

    .line 639
    .line 640
    iget-object v4, v2, Lx03;->b:[Ljava/lang/Object;

    .line 641
    .line 642
    iget-object v2, v2, Lx03;->a:[J

    .line 643
    .line 644
    array-length v5, v2

    .line 645
    sub-int/2addr v5, v11

    .line 646
    if-ltz v5, :cond_2a

    .line 647
    .line 648
    move v6, v14

    .line 649
    :goto_11
    aget-wide v8, v2, v6

    .line 650
    .line 651
    not-long v11, v8

    .line 652
    shl-long/2addr v11, v10

    .line 653
    and-long/2addr v11, v8

    .line 654
    and-long v11, v11, v20

    .line 655
    .line 656
    cmp-long v11, v11, v20

    .line 657
    .line 658
    if-eqz v11, :cond_27

    .line 659
    .line 660
    sub-int v11, v6, v5

    .line 661
    .line 662
    not-int v11, v11

    .line 663
    ushr-int/lit8 v11, v11, 0x1f

    .line 664
    .line 665
    rsub-int/lit8 v11, v11, 0x8

    .line 666
    .line 667
    move v12, v14

    .line 668
    :goto_12
    if-ge v12, v11, :cond_26

    .line 669
    .line 670
    and-long v22, v8, v18

    .line 671
    .line 672
    cmp-long v13, v22, v16

    .line 673
    .line 674
    if-gez v13, :cond_25

    .line 675
    .line 676
    shl-int/lit8 v13, v6, 0x3

    .line 677
    .line 678
    add-int/2addr v13, v12

    .line 679
    aget-object v13, v4, v13

    .line 680
    .line 681
    move/from16 v22, v10

    .line 682
    .line 683
    instance-of v10, v13, Lsl4;

    .line 684
    .line 685
    if-eqz v10, :cond_24

    .line 686
    .line 687
    move-object v10, v13

    .line 688
    check-cast v10, Lsl4;

    .line 689
    .line 690
    invoke-virtual {v10, v15}, Lsl4;->e(I)Z

    .line 691
    .line 692
    .line 693
    move-result v10

    .line 694
    if-nez v10, :cond_24

    .line 695
    .line 696
    goto :goto_13

    .line 697
    :catchall_1
    move-exception v0

    .line 698
    goto :goto_16

    .line 699
    :cond_24
    invoke-virtual {v3, v13}, Lx03;->a(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    goto :goto_13

    .line 703
    :cond_25
    move/from16 v22, v10

    .line 704
    .line 705
    :goto_13
    shr-long/2addr v8, v7

    .line 706
    add-int/lit8 v12, v12, 0x1

    .line 707
    .line 708
    move/from16 v10, v22

    .line 709
    .line 710
    goto :goto_12

    .line 711
    :cond_26
    move/from16 v22, v10

    .line 712
    .line 713
    if-ne v11, v7, :cond_2a

    .line 714
    .line 715
    goto :goto_14

    .line 716
    :cond_27
    move/from16 v22, v10

    .line 717
    .line 718
    :goto_14
    if-eq v6, v5, :cond_2a

    .line 719
    .line 720
    add-int/lit8 v6, v6, 0x1

    .line 721
    .line 722
    move/from16 v10, v22

    .line 723
    .line 724
    goto :goto_11

    .line 725
    :cond_28
    check-cast v2, Ljava/lang/Iterable;

    .line 726
    .line 727
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 732
    .line 733
    .line 734
    move-result v4

    .line 735
    if-eqz v4, :cond_2a

    .line 736
    .line 737
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    instance-of v5, v4, Lsl4;

    .line 742
    .line 743
    if-eqz v5, :cond_29

    .line 744
    .line 745
    move-object v5, v4

    .line 746
    check-cast v5, Lsl4;

    .line 747
    .line 748
    invoke-virtual {v5, v15}, Lsl4;->e(I)Z

    .line 749
    .line 750
    .line 751
    move-result v5

    .line 752
    if-nez v5, :cond_29

    .line 753
    .line 754
    goto :goto_15

    .line 755
    :cond_29
    invoke-virtual {v3, v4}, Lx03;->a(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    goto :goto_15

    .line 759
    :cond_2a
    invoke-virtual {v0}, Ltv3;->y()Laz;

    .line 760
    .line 761
    .line 762
    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 763
    :cond_2b
    monitor-exit v1

    .line 764
    if-eqz v13, :cond_2c

    .line 765
    .line 766
    sget-object v0, Lj15;->a:Lj15;

    .line 767
    .line 768
    check-cast v13, Lcz;

    .line 769
    .line 770
    invoke-virtual {v13, v0}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 771
    .line 772
    .line 773
    :cond_2c
    sget-object v0, Lj15;->a:Lj15;

    .line 774
    .line 775
    return-object v0

    .line 776
    :goto_16
    monitor-exit v1

    .line 777
    throw v0

    .line 778
    :pswitch_5
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v0, Lhk3;

    .line 781
    .line 782
    move-object/from16 v2, p1

    .line 783
    .line 784
    check-cast v2, Lrg1;

    .line 785
    .line 786
    check-cast v1, Ljava/lang/Integer;

    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 789
    .line 790
    .line 791
    move-result v1

    .line 792
    sget-object v3, Lj80;->a:Li80;

    .line 793
    .line 794
    and-int/lit8 v4, v1, 0x3

    .line 795
    .line 796
    if-eq v4, v11, :cond_2d

    .line 797
    .line 798
    move v14, v15

    .line 799
    :cond_2d
    and-int/2addr v1, v15

    .line 800
    invoke-virtual {v2, v1, v14}, Lrg1;->K(IZ)Z

    .line 801
    .line 802
    .line 803
    move-result v1

    .line 804
    if-eqz v1, :cond_32

    .line 805
    .line 806
    invoke-virtual {v0}, Lhk3;->h0()Ljava/util/List;

    .line 807
    .line 808
    .line 809
    move-result-object v16

    .line 810
    iget-object v1, v0, Lhk3;->s0:Lwd3;

    .line 811
    .line 812
    invoke-virtual {v1}, Lwd3;->g()I

    .line 813
    .line 814
    .line 815
    move-result v17

    .line 816
    iget-object v1, v0, Lhk3;->t0:Lzd3;

    .line 817
    .line 818
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    check-cast v1, Ljava/lang/Boolean;

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 825
    .line 826
    .line 827
    move-result v18

    .line 828
    iget-object v1, v0, Lhk3;->u0:Lzd3;

    .line 829
    .line 830
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    move-object/from16 v19, v1

    .line 835
    .line 836
    check-cast v19, Landroid/net/Uri;

    .line 837
    .line 838
    iget-object v1, v0, Lhk3;->v0:Lzd3;

    .line 839
    .line 840
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    move-object/from16 v20, v1

    .line 845
    .line 846
    check-cast v20, Ljava/lang/String;

    .line 847
    .line 848
    iget-object v1, v0, Lhk3;->x0:Lzd3;

    .line 849
    .line 850
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    check-cast v1, Ljava/lang/Boolean;

    .line 855
    .line 856
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 857
    .line 858
    .line 859
    move-result v21

    .line 860
    iget-object v1, v0, Lhk3;->y0:Lzd3;

    .line 861
    .line 862
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    check-cast v1, Ljava/lang/Boolean;

    .line 867
    .line 868
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 869
    .line 870
    .line 871
    move-result v22

    .line 872
    invoke-virtual {v2, v0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    invoke-virtual {v2}, Lrg1;->H()Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    if-nez v1, :cond_2e

    .line 881
    .line 882
    if-ne v4, v3, :cond_2f

    .line 883
    .line 884
    :cond_2e
    new-instance v4, Ldk3;

    .line 885
    .line 886
    invoke-direct {v4, v0, v15}, Ldk3;-><init>(Lhk3;I)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v2, v4}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    :cond_2f
    move-object/from16 v23, v4

    .line 893
    .line 894
    check-cast v23, Lif1;

    .line 895
    .line 896
    invoke-virtual {v2, v0}, Lrg1;->g(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v1

    .line 900
    invoke-virtual {v2}, Lrg1;->H()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v4

    .line 904
    if-nez v1, :cond_30

    .line 905
    .line 906
    if-ne v4, v3, :cond_31

    .line 907
    .line 908
    :cond_30
    new-instance v4, Lwc;

    .line 909
    .line 910
    const/16 v1, 0x11

    .line 911
    .line 912
    invoke-direct {v4, v1, v0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v2, v4}, Lrg1;->b0(Ljava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    :cond_31
    move-object/from16 v24, v4

    .line 919
    .line 920
    check-cast v24, Lgf1;

    .line 921
    .line 922
    const/16 v26, 0x0

    .line 923
    .line 924
    move-object/from16 v25, v2

    .line 925
    .line 926
    invoke-static/range {v16 .. v26}, Le35;->e(Ljava/util/List;IZLandroid/net/Uri;Ljava/lang/String;ZZLif1;Lgf1;Lrg1;I)V

    .line 927
    .line 928
    .line 929
    goto :goto_17

    .line 930
    :cond_32
    move-object/from16 v25, v2

    .line 931
    .line 932
    invoke-virtual/range {v25 .. v25}, Lrg1;->N()V

    .line 933
    .line 934
    .line 935
    :goto_17
    sget-object v0, Lj15;->a:Lj15;

    .line 936
    .line 937
    return-object v0

    .line 938
    :pswitch_6
    move/from16 v22, v10

    .line 939
    .line 940
    const-wide/16 v16, 0x80

    .line 941
    .line 942
    const-wide/16 v18, 0xff

    .line 943
    .line 944
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v0, Lkz2;

    .line 952
    .line 953
    move-object/from16 v2, p1

    .line 954
    .line 955
    check-cast v2, Ljava/util/Set;

    .line 956
    .line 957
    check-cast v1, Lch4;

    .line 958
    .line 959
    new-instance v1, Ljx3;

    .line 960
    .line 961
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 962
    .line 963
    .line 964
    iget-object v3, v0, Lrp;->a:Ljava/lang/Object;

    .line 965
    .line 966
    monitor-enter v3

    .line 967
    :try_start_2
    iget-object v4, v0, Lkz2;->b:Lw03;

    .line 968
    .line 969
    new-instance v5, Ldd0;

    .line 970
    .line 971
    invoke-direct {v5, v2, v0, v1, v12}, Ldd0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 972
    .line 973
    .line 974
    invoke-static {v15, v5}, Ljz4;->j(ILjava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    iget-object v0, v4, Lw03;->b:[Ljava/lang/Object;

    .line 978
    .line 979
    iget-object v2, v4, Lw03;->a:[J

    .line 980
    .line 981
    array-length v4, v2

    .line 982
    sub-int/2addr v4, v11

    .line 983
    if-ltz v4, :cond_36

    .line 984
    .line 985
    move v6, v14

    .line 986
    :goto_18
    aget-wide v8, v2, v6

    .line 987
    .line 988
    not-long v10, v8

    .line 989
    shl-long v10, v10, v22

    .line 990
    .line 991
    and-long/2addr v10, v8

    .line 992
    and-long v10, v10, v20

    .line 993
    .line 994
    cmp-long v10, v10, v20

    .line 995
    .line 996
    if-eqz v10, :cond_35

    .line 997
    .line 998
    sub-int v10, v6, v4

    .line 999
    .line 1000
    not-int v10, v10

    .line 1001
    ushr-int/lit8 v10, v10, 0x1f

    .line 1002
    .line 1003
    rsub-int/lit8 v10, v10, 0x8

    .line 1004
    .line 1005
    move v11, v14

    .line 1006
    :goto_19
    if-ge v11, v10, :cond_34

    .line 1007
    .line 1008
    and-long v12, v8, v18

    .line 1009
    .line 1010
    cmp-long v12, v12, v16

    .line 1011
    .line 1012
    if-gez v12, :cond_33

    .line 1013
    .line 1014
    shl-int/lit8 v12, v6, 0x3

    .line 1015
    .line 1016
    add-int/2addr v12, v11

    .line 1017
    aget-object v12, v0, v12

    .line 1018
    .line 1019
    invoke-virtual {v5, v12}, Ldd0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    :cond_33
    shr-long/2addr v8, v7

    .line 1023
    add-int/lit8 v11, v11, 0x1

    .line 1024
    .line 1025
    goto :goto_19

    .line 1026
    :cond_34
    if-ne v10, v7, :cond_36

    .line 1027
    .line 1028
    :cond_35
    if-eq v6, v4, :cond_36

    .line 1029
    .line 1030
    add-int/lit8 v6, v6, 0x1

    .line 1031
    .line 1032
    goto :goto_18

    .line 1033
    :cond_36
    iget-object v0, v1, Ljx3;->n:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v0, Ljava/util/List;

    .line 1036
    .line 1037
    if-eqz v0, :cond_37

    .line 1038
    .line 1039
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1040
    .line 1041
    .line 1042
    move-result v1

    .line 1043
    :goto_1a
    if-ge v14, v1, :cond_37

    .line 1044
    .line 1045
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    check-cast v2, Ly94;

    .line 1050
    .line 1051
    sget-object v4, Lj15;->a:Lj15;

    .line 1052
    .line 1053
    invoke-interface {v2, v4}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1054
    .line 1055
    .line 1056
    add-int/lit8 v14, v14, 0x1

    .line 1057
    .line 1058
    goto :goto_1a

    .line 1059
    :catchall_2
    move-exception v0

    .line 1060
    goto :goto_1b

    .line 1061
    :cond_37
    monitor-exit v3

    .line 1062
    sget-object v0, Lj15;->a:Lj15;

    .line 1063
    .line 1064
    return-object v0

    .line 1065
    :goto_1b
    monitor-exit v3

    .line 1066
    throw v0

    .line 1067
    :pswitch_7
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1068
    .line 1069
    check-cast v0, Ld60;

    .line 1070
    .line 1071
    move-object/from16 v2, p1

    .line 1072
    .line 1073
    check-cast v2, Lt44;

    .line 1074
    .line 1075
    invoke-virtual {v0, v2, v1}, Ld60;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    check-cast v0, Ljava/util/List;

    .line 1080
    .line 1081
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1082
    .line 1083
    .line 1084
    move-result v1

    .line 1085
    :goto_1c
    if-ge v14, v1, :cond_3a

    .line 1086
    .line 1087
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v3

    .line 1091
    if-eqz v3, :cond_39

    .line 1092
    .line 1093
    iget-object v4, v2, Lt44;->o:Lx44;

    .line 1094
    .line 1095
    if-eqz v4, :cond_39

    .line 1096
    .line 1097
    invoke-interface {v4, v3}, Lx44;->b(Ljava/lang/Object;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    if-eqz v4, :cond_38

    .line 1102
    .line 1103
    goto :goto_1d

    .line 1104
    :cond_38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1105
    .line 1106
    const-string v1, "item at index "

    .line 1107
    .line 1108
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1112
    .line 1113
    .line 1114
    const-string v1, " can\'t be saved: "

    .line 1115
    .line 1116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 1127
    .line 1128
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    throw v1

    .line 1136
    :cond_39
    :goto_1d
    add-int/lit8 v14, v14, 0x1

    .line 1137
    .line 1138
    goto :goto_1c

    .line 1139
    :cond_3a
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1140
    .line 1141
    .line 1142
    move-result v1

    .line 1143
    if-nez v1, :cond_3b

    .line 1144
    .line 1145
    new-instance v13, Ljava/util/ArrayList;

    .line 1146
    .line 1147
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1148
    .line 1149
    .line 1150
    :cond_3b
    return-object v13

    .line 1151
    :pswitch_8
    move/from16 v22, v10

    .line 1152
    .line 1153
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v0, Lr70;

    .line 1156
    .line 1157
    move-object/from16 v2, p1

    .line 1158
    .line 1159
    check-cast v2, Lrg1;

    .line 1160
    .line 1161
    check-cast v1, Ljava/lang/Integer;

    .line 1162
    .line 1163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    invoke-static/range {v22 .. v22}, Lxl;->O(I)I

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    invoke-static {v0, v2, v1}, Lq05;->a(Lr70;Lrg1;I)V

    .line 1171
    .line 1172
    .line 1173
    sget-object v0, Lj15;->a:Lj15;

    .line 1174
    .line 1175
    return-object v0

    .line 1176
    :pswitch_9
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v0, Lty1;

    .line 1179
    .line 1180
    move-object/from16 v2, p1

    .line 1181
    .line 1182
    check-cast v2, Lrg1;

    .line 1183
    .line 1184
    check-cast v1, Ljava/lang/Integer;

    .line 1185
    .line 1186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    invoke-static {v15}, Lxl;->O(I)I

    .line 1190
    .line 1191
    .line 1192
    move-result v1

    .line 1193
    invoke-virtual {v0, v1, v2}, Lty1;->a(ILrg1;)V

    .line 1194
    .line 1195
    .line 1196
    sget-object v0, Lj15;->a:Lj15;

    .line 1197
    .line 1198
    return-object v0

    .line 1199
    :pswitch_a
    move-object/from16 v0, p1

    .line 1200
    .line 1201
    check-cast v0, Lrg1;

    .line 1202
    .line 1203
    check-cast v1, Ljava/lang/Integer;

    .line 1204
    .line 1205
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    and-int/lit8 v2, v1, 0x3

    .line 1210
    .line 1211
    if-eq v2, v11, :cond_3c

    .line 1212
    .line 1213
    move v14, v15

    .line 1214
    :cond_3c
    and-int/2addr v1, v15

    .line 1215
    invoke-virtual {v0, v1, v14}, Lrg1;->K(IZ)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v1

    .line 1219
    if-nez v1, :cond_3d

    .line 1220
    .line 1221
    invoke-virtual {v0}, Lrg1;->N()V

    .line 1222
    .line 1223
    .line 1224
    sget-object v0, Lj15;->a:Lj15;

    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :cond_3d
    throw v13

    .line 1228
    :pswitch_b
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v0, Luy3;

    .line 1231
    .line 1232
    move-object/from16 v2, p1

    .line 1233
    .line 1234
    check-cast v2, Ljava/lang/Integer;

    .line 1235
    .line 1236
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    instance-of v2, v1, Lu70;

    .line 1240
    .line 1241
    if-eqz v2, :cond_3f

    .line 1242
    .line 1243
    move-object v2, v1

    .line 1244
    check-cast v2, Lu70;

    .line 1245
    .line 1246
    iget-object v3, v0, Luy3;->h:Lx03;

    .line 1247
    .line 1248
    if-nez v3, :cond_3e

    .line 1249
    .line 1250
    sget-object v3, Lw54;->a:Lx03;

    .line 1251
    .line 1252
    new-instance v3, Lx03;

    .line 1253
    .line 1254
    invoke-direct {v3}, Lx03;-><init>()V

    .line 1255
    .line 1256
    .line 1257
    iput-object v3, v0, Luy3;->h:Lx03;

    .line 1258
    .line 1259
    :cond_3e
    invoke-virtual {v3, v2}, Lx03;->k(Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    iget-object v3, v0, Luy3;->f:Lf13;

    .line 1263
    .line 1264
    invoke-virtual {v3, v2}, Lf13;->b(Ljava/lang/Object;)V

    .line 1265
    .line 1266
    .line 1267
    :cond_3f
    instance-of v2, v1, Lwg1;

    .line 1268
    .line 1269
    if-eqz v2, :cond_40

    .line 1270
    .line 1271
    move-object v2, v1

    .line 1272
    check-cast v2, Lwg1;

    .line 1273
    .line 1274
    invoke-virtual {v0, v2}, Luy3;->e(Lwg1;)V

    .line 1275
    .line 1276
    .line 1277
    :cond_40
    instance-of v0, v1, Llv3;

    .line 1278
    .line 1279
    if-eqz v0, :cond_41

    .line 1280
    .line 1281
    move-object v0, v1

    .line 1282
    check-cast v0, Llv3;

    .line 1283
    .line 1284
    invoke-virtual {v0}, Llv3;->c()V

    .line 1285
    .line 1286
    .line 1287
    :cond_41
    sget-object v0, Lj15;->a:Lj15;

    .line 1288
    .line 1289
    return-object v0

    .line 1290
    :pswitch_c
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1291
    .line 1292
    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    .line 1293
    .line 1294
    move-object/from16 v2, p1

    .line 1295
    .line 1296
    check-cast v2, Lrg1;

    .line 1297
    .line 1298
    check-cast v1, Ljava/lang/Integer;

    .line 1299
    .line 1300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    sget v1, Landroidx/compose/ui/platform/ComposeView;->y:I

    .line 1304
    .line 1305
    invoke-static {v15}, Lxl;->O(I)I

    .line 1306
    .line 1307
    .line 1308
    move-result v1

    .line 1309
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ComposeView;->a(ILrg1;)V

    .line 1310
    .line 1311
    .line 1312
    sget-object v0, Lj15;->a:Lj15;

    .line 1313
    .line 1314
    return-object v0

    .line 1315
    :pswitch_d
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1316
    .line 1317
    check-cast v0, Lz64;

    .line 1318
    .line 1319
    move-object/from16 v2, p1

    .line 1320
    .line 1321
    check-cast v2, Ljava/lang/Float;

    .line 1322
    .line 1323
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 1324
    .line 1325
    .line 1326
    move-result v2

    .line 1327
    check-cast v1, Ljava/lang/Float;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1330
    .line 1331
    .line 1332
    move-result v1

    .line 1333
    invoke-virtual {v0}, Lcx2;->e0()Lwe0;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v3

    .line 1337
    new-instance v4, Li2;

    .line 1338
    .line 1339
    invoke-direct {v4, v0, v2, v1, v13}, Li2;-><init>(Lz64;FFLvd0;)V

    .line 1340
    .line 1341
    .line 1342
    invoke-static {v3, v13, v13, v4, v12}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 1343
    .line 1344
    .line 1345
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1346
    .line 1347
    return-object v0

    .line 1348
    :pswitch_e
    iget-object v0, v0, Lz;->o:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v0, Lb0;

    .line 1351
    .line 1352
    move-object/from16 v2, p1

    .line 1353
    .line 1354
    check-cast v2, Lrg1;

    .line 1355
    .line 1356
    check-cast v1, Ljava/lang/Integer;

    .line 1357
    .line 1358
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1359
    .line 1360
    .line 1361
    move-result v1

    .line 1362
    and-int/lit8 v3, v1, 0x3

    .line 1363
    .line 1364
    if-eq v3, v11, :cond_42

    .line 1365
    .line 1366
    move v3, v15

    .line 1367
    goto :goto_1e

    .line 1368
    :cond_42
    move v3, v14

    .line 1369
    :goto_1e
    and-int/2addr v1, v15

    .line 1370
    invoke-virtual {v2, v1, v3}, Lrg1;->K(IZ)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v1

    .line 1374
    if-eqz v1, :cond_43

    .line 1375
    .line 1376
    invoke-virtual {v0, v14, v2}, Lb0;->a(ILrg1;)V

    .line 1377
    .line 1378
    .line 1379
    goto :goto_1f

    .line 1380
    :cond_43
    invoke-virtual {v2}, Lrg1;->N()V

    .line 1381
    .line 1382
    .line 1383
    :goto_1f
    sget-object v0, Lj15;->a:Lj15;

    .line 1384
    .line 1385
    return-object v0

    .line 1386
    nop

    .line 1387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
