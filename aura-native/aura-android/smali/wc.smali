.class public final synthetic Lwc;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lwc;->n:I

    iput-object p2, p0, Lwc;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Luo;J)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lwc;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwc;->o:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwc;->n:I

    .line 4
    .line 5
    const/16 v6, 0x8

    .line 6
    .line 7
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v9, 0x7

    .line 13
    const/4 v10, 0x2

    .line 14
    const/4 v11, 0x1

    .line 15
    const/4 v12, 0x0

    .line 16
    const/4 v13, 0x0

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lys4;

    .line 23
    .line 24
    iput-object v12, v0, Lys4;->L:Lxs4;

    .line 25
    .line 26
    invoke-static {v0}, Lfu;->C(Lg94;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lg12;->A(Lu62;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ljz4;->z(Lrv0;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljs4;

    .line 41
    .line 42
    new-instance v1, Landroid/view/inputmethod/BaseInputConnection;

    .line 43
    .line 44
    iget-object v0, v0, Ljs4;->a:Landroid/view/View;

    .line 45
    .line 46
    invoke-direct {v1, v0, v13}, Landroid/view/inputmethod/BaseInputConnection;-><init>(Landroid/view/View;Z)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :pswitch_1
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lkn4;

    .line 53
    .line 54
    invoke-virtual {v0}, Lkn4;->a()Lo72;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, v0, Lo72;->n:Lc72;

    .line 59
    .line 60
    invoke-virtual {v1}, Lc72;->o()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    check-cast v12, Lc13;

    .line 65
    .line 66
    iget-object v12, v12, Lc13;->n:Lf13;

    .line 67
    .line 68
    iget v12, v12, Lf13;->p:I

    .line 69
    .line 70
    iget v14, v0, Lo72;->A:I

    .line 71
    .line 72
    if-eq v14, v12, :cond_5

    .line 73
    .line 74
    iget-object v0, v0, Lo72;->s:Lw03;

    .line 75
    .line 76
    iget-object v12, v0, Lw03;->c:[Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v0, v0, Lw03;->a:[J

    .line 79
    .line 80
    array-length v14, v0

    .line 81
    sub-int/2addr v14, v10

    .line 82
    if-ltz v14, :cond_3

    .line 83
    .line 84
    move v10, v13

    .line 85
    const-wide/16 v15, 0x80

    .line 86
    .line 87
    :goto_0
    aget-wide v2, v0, v10

    .line 88
    .line 89
    const-wide/16 v17, 0xff

    .line 90
    .line 91
    not-long v4, v2

    .line 92
    shl-long/2addr v4, v9

    .line 93
    and-long/2addr v4, v2

    .line 94
    and-long/2addr v4, v7

    .line 95
    cmp-long v4, v4, v7

    .line 96
    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    sub-int v4, v10, v14

    .line 100
    .line 101
    not-int v4, v4

    .line 102
    ushr-int/lit8 v4, v4, 0x1f

    .line 103
    .line 104
    rsub-int/lit8 v4, v4, 0x8

    .line 105
    .line 106
    move v5, v13

    .line 107
    :goto_1
    if-ge v5, v4, :cond_1

    .line 108
    .line 109
    and-long v19, v2, v17

    .line 110
    .line 111
    cmp-long v19, v19, v15

    .line 112
    .line 113
    if-gez v19, :cond_0

    .line 114
    .line 115
    shl-int/lit8 v19, v10, 0x3

    .line 116
    .line 117
    add-int v19, v19, v5

    .line 118
    .line 119
    aget-object v19, v12, v19

    .line 120
    .line 121
    move-wide/from16 v20, v7

    .line 122
    .line 123
    move-object/from16 v7, v19

    .line 124
    .line 125
    check-cast v7, Lh72;

    .line 126
    .line 127
    iput-boolean v11, v7, Lh72;->d:Z

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_0
    move-wide/from16 v20, v7

    .line 131
    .line 132
    :goto_2
    shr-long/2addr v2, v6

    .line 133
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    move-wide/from16 v7, v20

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    move-wide/from16 v20, v7

    .line 139
    .line 140
    if-ne v4, v6, :cond_3

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_2
    move-wide/from16 v20, v7

    .line 144
    .line 145
    :goto_3
    if-eq v10, v14, :cond_3

    .line 146
    .line 147
    add-int/lit8 v10, v10, 0x1

    .line 148
    .line 149
    move-wide/from16 v7, v20

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_3
    iget-object v0, v1, Lc72;->u:Lc72;

    .line 153
    .line 154
    if-eqz v0, :cond_4

    .line 155
    .line 156
    iget-object v0, v1, Lc72;->R:Lf72;

    .line 157
    .line 158
    iget-boolean v0, v0, Lf72;->e:Z

    .line 159
    .line 160
    if-nez v0, :cond_5

    .line 161
    .line 162
    invoke-static {v1, v13, v9}, Lc72;->U(Lc72;ZI)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_4
    invoke-virtual {v1}, Lc72;->q()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_5

    .line 171
    .line 172
    invoke-static {v1, v13, v9}, Lc72;->W(Lc72;ZI)V

    .line 173
    .line 174
    .line 175
    :cond_5
    :goto_4
    sget-object v0, Lj15;->a:Lj15;

    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_2
    move-wide/from16 v20, v7

    .line 179
    .line 180
    const-wide/16 v15, 0x80

    .line 181
    .line 182
    const-wide/16 v17, 0xff

    .line 183
    .line 184
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 185
    .line 186
    move-object v1, v0

    .line 187
    check-cast v1, Lpp3;

    .line 188
    .line 189
    :goto_5
    iget-object v2, v1, Lpp3;->h:Ljava/lang/Object;

    .line 190
    .line 191
    monitor-enter v2

    .line 192
    :try_start_0
    iget-boolean v0, v1, Lpp3;->a:Z

    .line 193
    .line 194
    if-nez v0, :cond_b

    .line 195
    .line 196
    iput-boolean v11, v1, Lpp3;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 197
    .line 198
    :try_start_1
    iget-object v0, v1, Lpp3;->g:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lf13;

    .line 201
    .line 202
    iget-object v3, v0, Lf13;->n:[Ljava/lang/Object;

    .line 203
    .line 204
    iget v0, v0, Lf13;->p:I

    .line 205
    .line 206
    move v4, v13

    .line 207
    :goto_6
    if-ge v4, v0, :cond_a

    .line 208
    .line 209
    aget-object v5, v3, v4

    .line 210
    .line 211
    check-cast v5, Lsh4;

    .line 212
    .line 213
    iget-object v7, v5, Lsh4;->g:Lx03;

    .line 214
    .line 215
    iget-object v5, v5, Lsh4;->a:Lif1;

    .line 216
    .line 217
    iget-object v8, v7, Lx03;->b:[Ljava/lang/Object;

    .line 218
    .line 219
    iget-object v12, v7, Lx03;->a:[J

    .line 220
    .line 221
    array-length v14, v12

    .line 222
    sub-int/2addr v14, v10

    .line 223
    move/from16 v19, v9

    .line 224
    .line 225
    if-ltz v14, :cond_9

    .line 226
    .line 227
    move v9, v13

    .line 228
    :goto_7
    aget-wide v10, v12, v9

    .line 229
    .line 230
    move/from16 p0, v14

    .line 231
    .line 232
    not-long v13, v10

    .line 233
    shl-long v13, v13, v19

    .line 234
    .line 235
    and-long/2addr v13, v10

    .line 236
    and-long v13, v13, v20

    .line 237
    .line 238
    cmp-long v13, v13, v20

    .line 239
    .line 240
    if-eqz v13, :cond_8

    .line 241
    .line 242
    sub-int v13, v9, p0

    .line 243
    .line 244
    not-int v13, v13

    .line 245
    ushr-int/lit8 v13, v13, 0x1f

    .line 246
    .line 247
    rsub-int/lit8 v13, v13, 0x8

    .line 248
    .line 249
    const/4 v14, 0x0

    .line 250
    :goto_8
    if-ge v14, v13, :cond_7

    .line 251
    .line 252
    and-long v22, v10, v17

    .line 253
    .line 254
    cmp-long v22, v22, v15

    .line 255
    .line 256
    if-gez v22, :cond_6

    .line 257
    .line 258
    shl-int/lit8 v22, v9, 0x3

    .line 259
    .line 260
    add-int v22, v22, v14

    .line 261
    .line 262
    aget-object v15, v8, v22

    .line 263
    .line 264
    invoke-interface {v5, v15}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_6
    shr-long/2addr v10, v6

    .line 268
    add-int/lit8 v14, v14, 0x1

    .line 269
    .line 270
    const-wide/16 v15, 0x80

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_7
    if-ne v13, v6, :cond_9

    .line 274
    .line 275
    :cond_8
    move/from16 v14, p0

    .line 276
    .line 277
    if-eq v9, v14, :cond_9

    .line 278
    .line 279
    add-int/lit8 v9, v9, 0x1

    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const-wide/16 v15, 0x80

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_9
    invoke-virtual {v7}, Lx03;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    .line 287
    .line 288
    add-int/lit8 v4, v4, 0x1

    .line 289
    .line 290
    move/from16 v9, v19

    .line 291
    .line 292
    const/4 v10, 0x2

    .line 293
    const/4 v11, 0x1

    .line 294
    const/4 v13, 0x0

    .line 295
    const-wide/16 v15, 0x80

    .line 296
    .line 297
    goto :goto_6

    .line 298
    :goto_9
    const/4 v3, 0x0

    .line 299
    goto :goto_a

    .line 300
    :catchall_0
    move-exception v0

    .line 301
    goto :goto_9

    .line 302
    :cond_a
    move/from16 v19, v9

    .line 303
    .line 304
    move v3, v13

    .line 305
    :try_start_2
    iput-boolean v3, v1, Lpp3;->a:Z

    .line 306
    .line 307
    goto :goto_b

    .line 308
    :catchall_1
    move-exception v0

    .line 309
    goto :goto_c

    .line 310
    :goto_a
    iput-boolean v3, v1, Lpp3;->a:Z

    .line 311
    .line 312
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 313
    :cond_b
    move/from16 v19, v9

    .line 314
    .line 315
    :goto_b
    monitor-exit v2

    .line 316
    invoke-virtual {v1}, Lpp3;->a()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-nez v0, :cond_c

    .line 321
    .line 322
    sget-object v0, Lj15;->a:Lj15;

    .line 323
    .line 324
    return-object v0

    .line 325
    :cond_c
    move/from16 v9, v19

    .line 326
    .line 327
    const/4 v10, 0x2

    .line 328
    const/4 v11, 0x1

    .line 329
    const/4 v13, 0x0

    .line 330
    const-wide/16 v15, 0x80

    .line 331
    .line 332
    goto/16 :goto_5

    .line 333
    .line 334
    :goto_c
    monitor-exit v2

    .line 335
    throw v0

    .line 336
    :pswitch_3
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Lrx1;

    .line 339
    .line 340
    invoke-virtual {v0}, Lrx1;->e()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    iget-object v0, v0, Lrx1;->a:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Ls24;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Ls24;->a()V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ls24;->b()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Ls24;->j()Lso4;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-interface {v0}, Lso4;->z()Lwe1;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-virtual {v0, v1}, Lwe1;->j(Ljava/lang/String;)Ldf1;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0

    .line 370
    :pswitch_4
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v0, Lwb4;

    .line 373
    .line 374
    iget-object v1, v0, Lwb4;->p:Lzd3;

    .line 375
    .line 376
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    check-cast v2, Lqf4;

    .line 381
    .line 382
    iget-wide v2, v2, Lqf4;->a:J

    .line 383
    .line 384
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    cmp-long v2, v2, v4

    .line 390
    .line 391
    if-nez v2, :cond_d

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_d
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    check-cast v2, Lqf4;

    .line 399
    .line 400
    iget-wide v2, v2, Lqf4;->a:J

    .line 401
    .line 402
    invoke-static {v2, v3}, Lqf4;->b(J)Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    if-eqz v2, :cond_e

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :cond_e
    iget-object v0, v0, Lwb4;->n:Lpv;

    .line 410
    .line 411
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    check-cast v1, Lqf4;

    .line 416
    .line 417
    iget-wide v1, v1, Lqf4;->a:J

    .line 418
    .line 419
    iget-object v12, v0, Lpv;->w:Landroid/graphics/Shader;

    .line 420
    .line 421
    :goto_d
    return-object v12

    .line 422
    :pswitch_5
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 423
    .line 424
    return-object v0

    .line 425
    :pswitch_6
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v0, Lj54;

    .line 428
    .line 429
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    new-instance v2, Lvv3;

    .line 434
    .line 435
    const/4 v3, 0x0

    .line 436
    invoke-direct {v2, v3, v0}, Lvv3;-><init>(ILjava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1, v2}, Lea2;->a(Laa2;)V

    .line 440
    .line 441
    .line 442
    sget-object v0, Lj15;->a:Lj15;

    .line 443
    .line 444
    return-object v0

    .line 445
    :pswitch_7
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, Lf75;

    .line 448
    .line 449
    invoke-static {v0}, Le54;->c(Lf75;)Lg54;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0

    .line 454
    :pswitch_8
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, La54;

    .line 457
    .line 458
    iget-object v0, v0, La54;->p:Lgp3;

    .line 459
    .line 460
    if-eqz v0, :cond_10

    .line 461
    .line 462
    const/4 v3, 0x0

    .line 463
    new-array v1, v3, [Lkd3;

    .line 464
    .line 465
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, [Lkd3;

    .line 470
    .line 471
    invoke-static {v1}, Lfh0;->g([Lkd3;)Landroid/os/Bundle;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    invoke-virtual {v0, v1}, Lgp3;->t(Landroid/os/Bundle;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_f

    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_f
    move-object v12, v1

    .line 486
    :cond_10
    :goto_e
    return-object v12

    .line 487
    :pswitch_9
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, Lt44;

    .line 490
    .line 491
    iget-object v1, v0, Lt44;->n:Lm54;

    .line 492
    .line 493
    iget-object v2, v0, Lt44;->q:Ljava/lang/Object;

    .line 494
    .line 495
    if-eqz v2, :cond_11

    .line 496
    .line 497
    invoke-interface {v1, v0, v2}, Lm54;->h(Lt44;Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v12

    .line 501
    goto :goto_f

    .line 502
    :cond_11
    const-string v0, "Value should be initialized"

    .line 503
    .line 504
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :goto_f
    return-object v12

    .line 508
    :pswitch_a
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, Lyv3;

    .line 511
    .line 512
    iput-object v12, v0, Lyv3;->i:Lga;

    .line 513
    .line 514
    const-string v1, "OnPositionedDispatch"

    .line 515
    .line 516
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    :try_start_3
    invoke-virtual {v0}, Lyv3;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 520
    .line 521
    .line 522
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 523
    .line 524
    .line 525
    sget-object v0, Lj15;->a:Lj15;

    .line 526
    .line 527
    return-object v0

    .line 528
    :catchall_2
    move-exception v0

    .line 529
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 530
    .line 531
    .line 532
    throw v0

    .line 533
    :pswitch_b
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v0, Lhk3;

    .line 536
    .line 537
    const/4 v1, 0x1

    .line 538
    invoke-virtual {v0, v1}, Lhk3;->l0(Z)V

    .line 539
    .line 540
    .line 541
    sget-object v0, Lj15;->a:Lj15;

    .line 542
    .line 543
    return-object v0

    .line 544
    :pswitch_c
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v0, La93;

    .line 547
    .line 548
    new-instance v1, Ly83;

    .line 549
    .line 550
    invoke-direct {v1, v0}, Ly83;-><init>(La93;)V

    .line 551
    .line 552
    .line 553
    return-object v1

    .line 554
    :pswitch_d
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Le53;

    .line 557
    .line 558
    invoke-virtual {v0}, Le53;->q0()Lwe0;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    return-object v0

    .line 563
    :pswitch_e
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, Lna4;

    .line 566
    .line 567
    iget-object v0, v0, Lna4;->q:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v0, Lwe0;

    .line 570
    .line 571
    return-object v0

    .line 572
    :pswitch_f
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 573
    .line 574
    check-cast v0, Lha2;

    .line 575
    .line 576
    iget-object v0, v0, Lha2;->a:Lpz1;

    .line 577
    .line 578
    iget-object v0, v0, Lpz1;->o:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Lwf2;

    .line 581
    .line 582
    iget-boolean v1, v0, Lwf2;->o:Z

    .line 583
    .line 584
    if-eqz v1, :cond_12

    .line 585
    .line 586
    goto :goto_10

    .line 587
    :cond_12
    iget-boolean v1, v0, Lwf2;->p:Z

    .line 588
    .line 589
    if-eqz v1, :cond_13

    .line 590
    .line 591
    const-string v1, "ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?"

    .line 592
    .line 593
    invoke-static {v1}, Lpo3;->a(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    :cond_13
    invoke-virtual {v0}, Lwf2;->a()V

    .line 597
    .line 598
    .line 599
    const/4 v1, 0x1

    .line 600
    iput-boolean v1, v0, Lwf2;->p:Z

    .line 601
    .line 602
    :goto_10
    sget-object v0, Lj15;->a:Lj15;

    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_10
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, Lb13;

    .line 608
    .line 609
    invoke-interface {v0}, Lkl4;->getValue()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    check-cast v0, Lgf1;

    .line 614
    .line 615
    invoke-interface {v0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    check-cast v0, Lnc3;

    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_11
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, Lh72;

    .line 625
    .line 626
    iget-object v1, v0, Lh72;->g:Lzd3;

    .line 627
    .line 628
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    check-cast v1, Ljava/lang/Boolean;

    .line 633
    .line 634
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-nez v1, :cond_14

    .line 639
    .line 640
    iget-object v0, v0, Lh72;->c:Lz80;

    .line 641
    .line 642
    if-eqz v0, :cond_14

    .line 643
    .line 644
    invoke-virtual {v0}, Lz80;->l()V

    .line 645
    .line 646
    .line 647
    :cond_14
    sget-object v0, Lj15;->a:Lj15;

    .line 648
    .line 649
    return-object v0

    .line 650
    :pswitch_12
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v0, Lc72;

    .line 653
    .line 654
    iget-object v0, v0, Lc72;->R:Lf72;

    .line 655
    .line 656
    iget-object v1, v0, Lf72;->p:Lti2;

    .line 657
    .line 658
    const/4 v2, 0x1

    .line 659
    iput-boolean v2, v1, Lti2;->J:Z

    .line 660
    .line 661
    iget-object v0, v0, Lf72;->q:Lif2;

    .line 662
    .line 663
    if-eqz v0, :cond_15

    .line 664
    .line 665
    iput-boolean v2, v0, Lif2;->F:Z

    .line 666
    .line 667
    :cond_15
    sget-object v0, Lj15;->a:Lj15;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_13
    move v2, v11

    .line 671
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, Ls12;

    .line 674
    .line 675
    iget-object v0, v0, Ls12;->a:Ls24;

    .line 676
    .line 677
    invoke-virtual {v0}, Ls24;->m()Z

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    if-eqz v1, :cond_17

    .line 682
    .line 683
    invoke-virtual {v0}, Ls24;->q()Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    if-eqz v0, :cond_16

    .line 688
    .line 689
    goto :goto_11

    .line 690
    :cond_16
    const/4 v11, 0x0

    .line 691
    goto :goto_12

    .line 692
    :cond_17
    :goto_11
    move v11, v2

    .line 693
    :goto_12
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    return-object v0

    .line 698
    :pswitch_14
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v0, Lpz1;

    .line 701
    .line 702
    iget-object v0, v0, Lpz1;->o:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v0, Landroid/view/View;

    .line 705
    .line 706
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    const-string v1, "input_method"

    .line 711
    .line 712
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    .line 718
    .line 719
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 720
    .line 721
    return-object v0

    .line 722
    :pswitch_15
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 723
    .line 724
    check-cast v0, Lwe0;

    .line 725
    .line 726
    invoke-interface {v0}, Lwe0;->e()Lne0;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-static {v0}, Lj51;->v(Lne0;)F

    .line 731
    .line 732
    .line 733
    move-result v0

    .line 734
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    return-object v0

    .line 739
    :pswitch_16
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v0, Lvb4;

    .line 742
    .line 743
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 744
    .line 745
    .line 746
    move-result-object v1

    .line 747
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    const-string v2, "homemusic_hub_local_url"

    .line 758
    .line 759
    invoke-interface {v1, v2, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    if-nez v1, :cond_18

    .line 764
    .line 765
    const-string v1, "http://192.168.0.111:8080"

    .line 766
    .line 767
    :cond_18
    invoke-static {v1}, Le35;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    if-nez v1, :cond_19

    .line 772
    .line 773
    const v1, 0x7f13021b

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0, v1}, Lkc1;->s(I)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    :cond_19
    return-object v1

    .line 784
    :pswitch_17
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v0, Lbf1;

    .line 787
    .line 788
    iget-object v1, v0, Lbf1;->o:Ljava/lang/String;

    .line 789
    .line 790
    const/16 v2, 0x1c

    .line 791
    .line 792
    if-eqz v1, :cond_1a

    .line 793
    .line 794
    iget-boolean v3, v0, Lbf1;->q:Z

    .line 795
    .line 796
    if-eqz v3, :cond_1a

    .line 797
    .line 798
    new-instance v3, Ljava/io/File;

    .line 799
    .line 800
    iget-object v4, v0, Lbf1;->n:Landroid/content/Context;

    .line 801
    .line 802
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v4}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 806
    .line 807
    .line 808
    move-result-object v4

    .line 809
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    invoke-direct {v3, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    new-instance v5, Laf1;

    .line 816
    .line 817
    iget-object v6, v0, Lbf1;->n:Landroid/content/Context;

    .line 818
    .line 819
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v7

    .line 823
    new-instance v8, Ld34;

    .line 824
    .line 825
    invoke-direct {v8, v2}, Ld34;-><init>(I)V

    .line 826
    .line 827
    .line 828
    iget-object v9, v0, Lbf1;->p:Luv;

    .line 829
    .line 830
    iget-boolean v10, v0, Lbf1;->r:Z

    .line 831
    .line 832
    invoke-direct/range {v5 .. v10}, Laf1;-><init>(Landroid/content/Context;Ljava/lang/String;Ld34;Luv;Z)V

    .line 833
    .line 834
    .line 835
    goto :goto_13

    .line 836
    :cond_1a
    new-instance v6, Laf1;

    .line 837
    .line 838
    iget-object v7, v0, Lbf1;->n:Landroid/content/Context;

    .line 839
    .line 840
    iget-object v8, v0, Lbf1;->o:Ljava/lang/String;

    .line 841
    .line 842
    new-instance v9, Ld34;

    .line 843
    .line 844
    invoke-direct {v9, v2}, Ld34;-><init>(I)V

    .line 845
    .line 846
    .line 847
    iget-object v10, v0, Lbf1;->p:Luv;

    .line 848
    .line 849
    iget-boolean v11, v0, Lbf1;->r:Z

    .line 850
    .line 851
    invoke-direct/range {v6 .. v11}, Laf1;-><init>(Landroid/content/Context;Ljava/lang/String;Ld34;Luv;Z)V

    .line 852
    .line 853
    .line 854
    move-object v5, v6

    .line 855
    :goto_13
    iget-boolean v0, v0, Lbf1;->t:Z

    .line 856
    .line 857
    invoke-virtual {v5, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 858
    .line 859
    .line 860
    return-object v5

    .line 861
    :pswitch_18
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, Lba1;

    .line 864
    .line 865
    invoke-virtual {v0}, Lba1;->s0()Lx91;

    .line 866
    .line 867
    .line 868
    sget-object v0, Lj15;->a:Lj15;

    .line 869
    .line 870
    return-object v0

    .line 871
    :pswitch_19
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v0, Lrf2;

    .line 874
    .line 875
    const-string v1, ":memory:"

    .line 876
    .line 877
    invoke-virtual {v0, v1}, Lrf2;->b(Ljava/lang/String;)Lx34;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    return-object v0

    .line 882
    :pswitch_1a
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v0, Lh80;

    .line 885
    .line 886
    const-wide/16 v1, 0x0

    .line 887
    .line 888
    invoke-static {v1, v2, v1, v2}, Ln02;->a(JJ)Z

    .line 889
    .line 890
    .line 891
    move-result v3

    .line 892
    iget-object v0, v0, Lh80;->a:Landroid/view/View;

    .line 893
    .line 894
    if-eqz v3, :cond_23

    .line 895
    .line 896
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    move-object v1, v0

    .line 901
    :goto_14
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 902
    .line 903
    if-eqz v2, :cond_1f

    .line 904
    .line 905
    instance-of v2, v1, Landroid/app/Activity;

    .line 906
    .line 907
    if-eqz v2, :cond_1b

    .line 908
    .line 909
    :goto_15
    move-object v12, v1

    .line 910
    goto :goto_16

    .line 911
    :cond_1b
    instance-of v2, v1, Landroid/inputmethodservice/InputMethodService;

    .line 912
    .line 913
    if-eqz v2, :cond_1c

    .line 914
    .line 915
    goto :goto_15

    .line 916
    :cond_1c
    instance-of v2, v1, Landroid/app/Application;

    .line 917
    .line 918
    if-eqz v2, :cond_1d

    .line 919
    .line 920
    goto :goto_15

    .line 921
    :cond_1d
    check-cast v1, Landroid/content/ContextWrapper;

    .line 922
    .line 923
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    if-nez v2, :cond_1e

    .line 928
    .line 929
    goto :goto_16

    .line 930
    :cond_1e
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    goto :goto_14

    .line 935
    :cond_1f
    :goto_16
    const-wide v1, 0xffffffffL

    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    const/16 v3, 0x20

    .line 941
    .line 942
    if-eqz v12, :cond_22

    .line 943
    .line 944
    sget-object v0, Lbc5;->a:Lac5;

    .line 945
    .line 946
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    sget-object v0, Lac5;->a:Lac5;

    .line 950
    .line 951
    sget-object v0, Lac5;->b:Lcc5;

    .line 952
    .line 953
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 957
    .line 958
    const/16 v5, 0x22

    .line 959
    .line 960
    if-lt v4, v5, :cond_20

    .line 961
    .line 962
    sget-object v4, Lqo0;->o:Lqo0;

    .line 963
    .line 964
    goto :goto_17

    .line 965
    :cond_20
    const/16 v5, 0x1e

    .line 966
    .line 967
    if-lt v4, v5, :cond_21

    .line 968
    .line 969
    sget-object v4, Lku;->o:Lku;

    .line 970
    .line 971
    goto :goto_17

    .line 972
    :cond_21
    sget-object v4, Lrv2;->L:Lrv2;

    .line 973
    .line 974
    :goto_17
    iget-object v0, v0, Lcc5;->b:Lpo0;

    .line 975
    .line 976
    invoke-interface {v4, v12, v0}, Ldc5;->e(Landroid/content/Context;Lpo0;)Lzb5;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    invoke-virtual {v0}, Lzb5;->a()Landroid/graphics/Rect;

    .line 981
    .line 982
    .line 983
    move-result-object v4

    .line 984
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 985
    .line 986
    .line 987
    move-result v4

    .line 988
    invoke-virtual {v0}, Lzb5;->a()Landroid/graphics/Rect;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    int-to-long v4, v4

    .line 997
    shl-long v3, v4, v3

    .line 998
    .line 999
    int-to-long v5, v0

    .line 1000
    and-long v0, v5, v1

    .line 1001
    .line 1002
    or-long/2addr v0, v3

    .line 1003
    invoke-static {v12}, Lbu;->a(Landroid/content/Context;)Lso0;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    invoke-static {v0, v1}, Ll93;->o0(J)J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v3

    .line 1011
    invoke-interface {v2, v3, v4}, Loo0;->i(J)J

    .line 1012
    .line 1013
    .line 1014
    move-result-wide v2

    .line 1015
    new-instance v4, Lap0;

    .line 1016
    .line 1017
    invoke-direct {v4, v0, v1, v2, v3}, Lap0;-><init>(JJ)V

    .line 1018
    .line 1019
    .line 1020
    goto :goto_18

    .line 1021
    :cond_22
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v4

    .line 1029
    invoke-static {v0}, Lbu;->a(Landroid/content/Context;)Lso0;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    iget v5, v4, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 1034
    .line 1035
    int-to-float v5, v5

    .line 1036
    iget v4, v4, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 1037
    .line 1038
    int-to-float v4, v4

    .line 1039
    invoke-static {v5, v4}, Ll93;->a(FF)J

    .line 1040
    .line 1041
    .line 1042
    move-result-wide v4

    .line 1043
    invoke-interface {v0, v4, v5}, Loo0;->Y(J)J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v6

    .line 1047
    shr-long v8, v6, v3

    .line 1048
    .line 1049
    long-to-int v0, v8

    .line 1050
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    float-to-int v0, v0

    .line 1055
    and-long/2addr v6, v1

    .line 1056
    long-to-int v6, v6

    .line 1057
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1058
    .line 1059
    .line 1060
    move-result v6

    .line 1061
    float-to-int v6, v6

    .line 1062
    int-to-long v7, v0

    .line 1063
    shl-long/2addr v7, v3

    .line 1064
    int-to-long v9, v6

    .line 1065
    and-long v0, v9, v1

    .line 1066
    .line 1067
    or-long/2addr v0, v7

    .line 1068
    new-instance v2, Lap0;

    .line 1069
    .line 1070
    invoke-direct {v2, v0, v1, v4, v5}, Lap0;-><init>(JJ)V

    .line 1071
    .line 1072
    .line 1073
    move-object v4, v2

    .line 1074
    goto :goto_18

    .line 1075
    :cond_23
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-static {v0}, Lbu;->a(Landroid/content/Context;)Lso0;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-static {v1, v2}, Ll93;->o0(J)J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v3

    .line 1087
    invoke-interface {v0, v3, v4}, Loo0;->i(J)J

    .line 1088
    .line 1089
    .line 1090
    move-result-wide v3

    .line 1091
    new-instance v0, Lap0;

    .line 1092
    .line 1093
    invoke-direct {v0, v1, v2, v3, v4}, Lap0;-><init>(JJ)V

    .line 1094
    .line 1095
    .line 1096
    move-object v4, v0

    .line 1097
    :goto_18
    return-object v4

    .line 1098
    :pswitch_1b
    move v2, v11

    .line 1099
    sget-object v1, Lj15;->a:Lj15;

    .line 1100
    .line 1101
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v0, Lvz;

    .line 1104
    .line 1105
    sget-object v3, Lrr1;->a:Lrr1;

    .line 1106
    .line 1107
    iget-object v3, v0, Lvz;->c:Ljava/lang/String;

    .line 1108
    .line 1109
    iget-boolean v4, v0, Lvz;->d:Z

    .line 1110
    .line 1111
    iget-object v5, v0, Lvz;->f:Ljava/lang/String;

    .line 1112
    .line 1113
    iget-object v6, v0, Lvz;->g:Ljava/lang/String;

    .line 1114
    .line 1115
    iget-object v7, v0, Lvz;->h:Ljava/lang/String;

    .line 1116
    .line 1117
    iget-object v0, v0, Lvz;->i:Ljava/lang/String;

    .line 1118
    .line 1119
    sget-object v8, Lrr1;->e:Ljava/lang/ThreadLocal;

    .line 1120
    .line 1121
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v8

    .line 1125
    check-cast v8, Lqr1;

    .line 1126
    .line 1127
    if-eqz v8, :cond_24

    .line 1128
    .line 1129
    iget-object v8, v8, Lqr1;->a:Ljava/lang/String;

    .line 1130
    .line 1131
    goto :goto_19

    .line 1132
    :cond_24
    invoke-static {}, Lrr1;->c()Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v8

    .line 1136
    :goto_19
    sget-object v9, Lrr1;->h:Lrp4;

    .line 1137
    .line 1138
    invoke-virtual {v9}, Lrp4;->getValue()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v9

    .line 1142
    check-cast v9, Lo83;

    .line 1143
    .line 1144
    new-instance v10, Lnz3;

    .line 1145
    .line 1146
    invoke-direct {v10}, Lnz3;-><init>()V

    .line 1147
    .line 1148
    .line 1149
    const-string v11, "/healthz"

    .line 1150
    .line 1151
    invoke-virtual {v8, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v8

    .line 1155
    invoke-virtual {v10, v8}, Lnz3;->d(Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    new-instance v8, Loz3;

    .line 1159
    .line 1160
    invoke-direct {v8, v10}, Loz3;-><init>(Lnz3;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1164
    .line 1165
    .line 1166
    new-instance v10, Lbv3;

    .line 1167
    .line 1168
    invoke-direct {v10, v9, v8}, Lbv3;-><init>(Lo83;Loz3;)V

    .line 1169
    .line 1170
    .line 1171
    invoke-virtual {v10}, Lbv3;->c()Lk14;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v8

    .line 1175
    :try_start_4
    iget-boolean v9, v8, Lk14;->C:Z

    .line 1176
    .line 1177
    if-eqz v9, :cond_2d

    .line 1178
    .line 1179
    iget-object v9, v8, Lk14;->t:Ln14;

    .line 1180
    .line 1181
    if-eqz v9, :cond_25

    .line 1182
    .line 1183
    invoke-virtual {v9}, Ln14;->string()Ljava/lang/String;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v12

    .line 1187
    goto :goto_1a

    .line 1188
    :catchall_3
    move-exception v0

    .line 1189
    move-object v1, v0

    .line 1190
    goto/16 :goto_1f

    .line 1191
    .line 1192
    :cond_25
    :goto_1a
    if-nez v12, :cond_26

    .line 1193
    .line 1194
    const-string v12, ""

    .line 1195
    .line 1196
    :cond_26
    invoke-static {v12}, Le35;->N(Ljava/lang/String;)Lh32;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v9

    .line 1200
    invoke-virtual {v9}, Lh32;->a()Lj32;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v9

    .line 1204
    const-string v10, "capabilities"

    .line 1205
    .line 1206
    iget-object v9, v9, Lj32;->n:Lnb2;

    .line 1207
    .line 1208
    invoke-virtual {v9, v10}, Lnb2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v9

    .line 1212
    check-cast v9, Lf32;

    .line 1213
    .line 1214
    if-eqz v9, :cond_29

    .line 1215
    .line 1216
    instance-of v10, v9, Ljava/util/Collection;

    .line 1217
    .line 1218
    if-eqz v10, :cond_27

    .line 1219
    .line 1220
    move-object v10, v9

    .line 1221
    check-cast v10, Ljava/util/Collection;

    .line 1222
    .line 1223
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 1224
    .line 1225
    .line 1226
    move-result v10

    .line 1227
    if-eqz v10, :cond_27

    .line 1228
    .line 1229
    goto :goto_1b

    .line 1230
    :cond_27
    iget-object v9, v9, Lf32;->n:Ljava/util/ArrayList;

    .line 1231
    .line 1232
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1233
    .line 1234
    .line 1235
    move-result v10

    .line 1236
    const/4 v11, 0x0

    .line 1237
    :cond_28
    if-ge v11, v10, :cond_29

    .line 1238
    .line 1239
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v12

    .line 1243
    add-int/lit8 v11, v11, 0x1

    .line 1244
    .line 1245
    check-cast v12, Lh32;

    .line 1246
    .line 1247
    invoke-virtual {v12}, Lh32;->b()Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v12

    .line 1251
    const-string v13, "catalog_favorite_download_v1"

    .line 1252
    .line 1253
    invoke-static {v12, v13}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v12
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 1257
    if-eqz v12, :cond_28

    .line 1258
    .line 1259
    move v11, v2

    .line 1260
    goto :goto_1c

    .line 1261
    :cond_29
    :goto_1b
    const/4 v11, 0x0

    .line 1262
    :goto_1c
    invoke-virtual {v8}, Lk14;->close()V

    .line 1263
    .line 1264
    .line 1265
    if-eqz v11, :cond_2c

    .line 1266
    .line 1267
    if-eqz v4, :cond_2a

    .line 1268
    .line 1269
    const-string v2, "/api/downloads"

    .line 1270
    .line 1271
    const-string v4, "track_refs"

    .line 1272
    .line 1273
    invoke-static {v3}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v3

    .line 1277
    new-instance v8, Lkd3;

    .line 1278
    .line 1279
    invoke-direct {v8, v4, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1280
    .line 1281
    .line 1282
    const-string v3, "star"

    .line 1283
    .line 1284
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1285
    .line 1286
    new-instance v9, Lkd3;

    .line 1287
    .line 1288
    invoke-direct {v9, v3, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1289
    .line 1290
    .line 1291
    const-string v3, "favorite_event_id"

    .line 1292
    .line 1293
    new-instance v10, Lkd3;

    .line 1294
    .line 1295
    invoke-direct {v10, v3, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1296
    .line 1297
    .line 1298
    const-string v3, "favorite_ts"

    .line 1299
    .line 1300
    new-instance v11, Lkd3;

    .line 1301
    .line 1302
    invoke-direct {v11, v3, v6}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1303
    .line 1304
    .line 1305
    const-string v3, "favorite_client"

    .line 1306
    .line 1307
    new-instance v12, Lkd3;

    .line 1308
    .line 1309
    invoke-direct {v12, v3, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1310
    .line 1311
    .line 1312
    const-string v3, "favorite_context"

    .line 1313
    .line 1314
    new-instance v13, Lkd3;

    .line 1315
    .line 1316
    invoke-direct {v13, v3, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1317
    .line 1318
    .line 1319
    filled-new-array/range {v8 .. v13}, [Lkd3;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    new-instance v3, Lkd3;

    .line 1328
    .line 1329
    invoke-direct {v3, v2, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1330
    .line 1331
    .line 1332
    goto :goto_1d

    .line 1333
    :cond_2a
    const-string v2, "/api/star"

    .line 1334
    .line 1335
    const-string v4, "refs"

    .line 1336
    .line 1337
    invoke-static {v3}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    new-instance v8, Lkd3;

    .line 1342
    .line 1343
    invoke-direct {v8, v4, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1344
    .line 1345
    .line 1346
    const-string v3, "unstar"

    .line 1347
    .line 1348
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1349
    .line 1350
    new-instance v9, Lkd3;

    .line 1351
    .line 1352
    invoke-direct {v9, v3, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1353
    .line 1354
    .line 1355
    const-string v3, "event_id"

    .line 1356
    .line 1357
    new-instance v10, Lkd3;

    .line 1358
    .line 1359
    invoke-direct {v10, v3, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1360
    .line 1361
    .line 1362
    const-string v3, "ts"

    .line 1363
    .line 1364
    new-instance v11, Lkd3;

    .line 1365
    .line 1366
    invoke-direct {v11, v3, v6}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1367
    .line 1368
    .line 1369
    const-string v3, "client"

    .line 1370
    .line 1371
    new-instance v12, Lkd3;

    .line 1372
    .line 1373
    invoke-direct {v12, v3, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1374
    .line 1375
    .line 1376
    const-string v3, "context"

    .line 1377
    .line 1378
    new-instance v13, Lkd3;

    .line 1379
    .line 1380
    invoke-direct {v13, v3, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1381
    .line 1382
    .line 1383
    filled-new-array/range {v8 .. v13}, [Lkd3;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0

    .line 1391
    new-instance v3, Lkd3;

    .line 1392
    .line 1393
    invoke-direct {v3, v2, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1394
    .line 1395
    .line 1396
    :goto_1d
    iget-object v0, v3, Lkd3;->n:Ljava/lang/Object;

    .line 1397
    .line 1398
    move-object v2, v0

    .line 1399
    check-cast v2, Ljava/lang/String;

    .line 1400
    .line 1401
    iget-object v0, v3, Lkd3;->o:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v0, Ljava/util/Map;

    .line 1404
    .line 1405
    sget-object v3, Ltz3;->Companion:Lsz3;

    .line 1406
    .line 1407
    sget-object v4, Lrr1;->c:Lnk1;

    .line 1408
    .line 1409
    invoke-virtual {v4, v0}, Lnk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1414
    .line 1415
    .line 1416
    sget-object v4, Lrr1;->b:Lhu2;

    .line 1417
    .line 1418
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1419
    .line 1420
    .line 1421
    invoke-static {v0, v4}, Lsz3;->b(Ljava/lang/String;Lhu2;)Lwe5;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v3

    .line 1425
    :try_start_5
    sget-object v0, Lrr1;->a:Lrr1;

    .line 1426
    .line 1427
    new-instance v0, Lpr1;

    .line 1428
    .line 1429
    const/4 v4, 0x0

    .line 1430
    invoke-direct {v0, v2, v3, v4}, Lpr1;-><init>(Ljava/lang/String;Lwe5;I)V

    .line 1431
    .line 1432
    .line 1433
    new-instance v4, Lor1;

    .line 1434
    .line 1435
    const/4 v5, 0x2

    .line 1436
    invoke-direct {v4, v5}, Lor1;-><init>(I)V

    .line 1437
    .line 1438
    .line 1439
    invoke-static {v0, v4}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 1440
    .line 1441
    .line 1442
    goto :goto_1e

    .line 1443
    :catch_0
    move-exception v0

    .line 1444
    instance-of v4, v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1445
    .line 1446
    if-nez v4, :cond_2b

    .line 1447
    .line 1448
    sget-object v0, Lrr1;->a:Lrr1;

    .line 1449
    .line 1450
    new-instance v0, Lpr1;

    .line 1451
    .line 1452
    const/4 v4, 0x0

    .line 1453
    invoke-direct {v0, v2, v3, v4}, Lpr1;-><init>(Ljava/lang/String;Lwe5;I)V

    .line 1454
    .line 1455
    .line 1456
    new-instance v2, Lor1;

    .line 1457
    .line 1458
    const/4 v5, 0x2

    .line 1459
    invoke-direct {v2, v5}, Lor1;-><init>(I)V

    .line 1460
    .line 1461
    .line 1462
    invoke-static {v0, v2}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    :goto_1e
    return-object v1

    .line 1466
    :cond_2b
    throw v0

    .line 1467
    :cond_2c
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1468
    .line 1469
    const-string v1, "\u041e\u0431\u043d\u043e\u0432\u0438\u0442\u0435 \u0425\u0430\u0431 \u0434\u043b\u044f \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0438\u044f \u043f\u043e\u043d\u0440\u0430\u0432\u0438\u0432\u0448\u0438\u0445\u0441\u044f \u0442\u0440\u0435\u043a\u043e\u0432 \u043a\u0430\u0442\u0430\u043b\u043e\u0433\u0430"

    .line 1470
    .line 1471
    const/16 v2, 0x1aa

    .line 1472
    .line 1473
    invoke-direct {v0, v2, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(ILjava/lang/String;)V

    .line 1474
    .line 1475
    .line 1476
    throw v0

    .line 1477
    :cond_2d
    :try_start_6
    invoke-static {v8}, Lrr1;->i(Lk14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 1482
    :goto_1f
    :try_start_7
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 1483
    :catchall_4
    move-exception v0

    .line 1484
    invoke-static {v8, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 1485
    .line 1486
    .line 1487
    throw v0

    .line 1488
    :pswitch_1c
    iget-object v0, v0, Lwc;->o:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v0, Luo;

    .line 1491
    .line 1492
    check-cast v0, Lpv;

    .line 1493
    .line 1494
    iget-object v0, v0, Lpv;->w:Landroid/graphics/Shader;

    .line 1495
    .line 1496
    return-object v0

    .line 1497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
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
