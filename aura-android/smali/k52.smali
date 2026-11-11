.class public final synthetic Lk52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk52;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lk52;->n:I

    .line 4
    .line 5
    const v1, 0x1fffcfff

    .line 6
    .line 7
    .line 8
    const-string v2, "deviceVolumeMax"

    .line 9
    .line 10
    const-string v3, "deviceVolume"

    .line 11
    .line 12
    const-string v4, ":"

    .line 13
    .line 14
    const/4 v5, 0x7

    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    sget-object v9, Lj15;->a:Lj15;

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v0, p1

    .line 24
    .line 25
    check-cast v0, Lx34;

    .line 26
    .line 27
    const-string v1, "DELETE FROM queue"

    .line 28
    .line 29
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :try_start_0
    invoke-interface {v1}, Lz34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 37
    .line 38
    .line 39
    return-object v7

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :pswitch_0
    move-object/from16 v0, p1

    .line 46
    .line 47
    check-cast v0, Lx34;

    .line 48
    .line 49
    const-string v1, "SELECT COUNT(*) FROM queue"

    .line 50
    .line 51
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :try_start_1
    invoke-interface {v1}, Lz34;->O()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    invoke-interface {v1, v8}, Lz34;->getLong(I)J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    long-to-int v8, v2

    .line 66
    goto :goto_0

    .line 67
    :catchall_1
    move-exception v0

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :goto_0
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :pswitch_1
    move-object/from16 v0, p1

    .line 82
    .line 83
    check-cast v0, Lb24;

    .line 84
    .line 85
    sget-object v0, Lkg3;->a:Lk52;

    .line 86
    .line 87
    return-object v9

    .line 88
    :pswitch_2
    move-object/from16 v0, p1

    .line 89
    .line 90
    check-cast v0, Lx34;

    .line 91
    .line 92
    const-string v1, "SELECT playlistId FROM pinned_playlist"

    .line 93
    .line 94
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    :goto_2
    invoke-interface {v1}, Lz34;->O()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_2

    .line 108
    .line 109
    invoke-interface {v1, v8}, Lz34;->isNull(I)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    move-object v2, v7

    .line 116
    goto :goto_3

    .line 117
    :cond_1
    invoke-interface {v1, v8}, Lz34;->D(I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    :goto_3
    new-instance v3, Lgg3;

    .line 122
    .line 123
    invoke-direct {v3, v2}, Lgg3;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    goto :goto_4

    .line 132
    :cond_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 133
    .line 134
    .line 135
    return-object v0

    .line 136
    :goto_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 137
    .line 138
    .line 139
    throw v0

    .line 140
    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-object/from16 v0, p1

    .line 144
    .line 145
    check-cast v0, Lvb3;

    .line 146
    .line 147
    invoke-interface {v0}, Lvb3;->j()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    xor-int/2addr v0, v6

    .line 152
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_4
    move-object/from16 v0, p1

    .line 158
    .line 159
    check-cast v0, Lc72;

    .line 160
    .line 161
    invoke-virtual {v0}, Lc72;->G()Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_3

    .line 166
    .line 167
    invoke-virtual {v0, v8}, Lc72;->T(Z)V

    .line 168
    .line 169
    .line 170
    :cond_3
    return-object v9

    .line 171
    :pswitch_5
    move-object/from16 v0, p1

    .line 172
    .line 173
    check-cast v0, Lc72;

    .line 174
    .line 175
    invoke-virtual {v0}, Lc72;->G()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_4

    .line 180
    .line 181
    invoke-virtual {v0, v8}, Lc72;->T(Z)V

    .line 182
    .line 183
    .line 184
    :cond_4
    return-object v9

    .line 185
    :pswitch_6
    move-object/from16 v0, p1

    .line 186
    .line 187
    check-cast v0, Lc72;

    .line 188
    .line 189
    invoke-virtual {v0}, Lc72;->G()Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-eqz v1, :cond_5

    .line 194
    .line 195
    invoke-virtual {v0, v8}, Lc72;->V(Z)V

    .line 196
    .line 197
    .line 198
    :cond_5
    return-object v9

    .line 199
    :pswitch_7
    move-object/from16 v0, p1

    .line 200
    .line 201
    check-cast v0, Lc72;

    .line 202
    .line 203
    invoke-virtual {v0}, Lc72;->G()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_6

    .line 208
    .line 209
    invoke-virtual {v0, v8}, Lc72;->V(Z)V

    .line 210
    .line 211
    .line 212
    :cond_6
    return-object v9

    .line 213
    :pswitch_8
    move-object/from16 v0, p1

    .line 214
    .line 215
    check-cast v0, Lc72;

    .line 216
    .line 217
    invoke-virtual {v0}, Lc72;->G()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_7

    .line 222
    .line 223
    invoke-virtual {v0}, Lc72;->E()V

    .line 224
    .line 225
    .line 226
    :cond_7
    return-object v9

    .line 227
    :pswitch_9
    move-object/from16 v0, p1

    .line 228
    .line 229
    check-cast v0, Lc72;

    .line 230
    .line 231
    invoke-virtual {v0}, Lc72;->G()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_8

    .line 236
    .line 237
    invoke-static {v0, v8, v5}, Lc72;->W(Lc72;ZI)V

    .line 238
    .line 239
    .line 240
    :cond_8
    return-object v9

    .line 241
    :pswitch_a
    move-object/from16 v0, p1

    .line 242
    .line 243
    check-cast v0, Lc72;

    .line 244
    .line 245
    invoke-virtual {v0}, Lc72;->G()Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-eqz v1, :cond_9

    .line 250
    .line 251
    invoke-static {v0, v8, v5}, Lc72;->U(Lc72;ZI)V

    .line 252
    .line 253
    .line 254
    :cond_9
    return-object v9

    .line 255
    :pswitch_b
    move-object/from16 v0, p1

    .line 256
    .line 257
    check-cast v0, Lmf3;

    .line 258
    .line 259
    sget v1, Lfc;->a:I

    .line 260
    .line 261
    sget-object v1, Lhb;->b:Lwl4;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    move-object v9, v1

    .line 271
    check-cast v9, Landroid/content/Context;

    .line 272
    .line 273
    sget-object v1, Lg90;->h:Lwl4;

    .line 274
    .line 275
    invoke-static {v0, v1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    move-object v10, v1

    .line 280
    check-cast v10, Loo0;

    .line 281
    .line 282
    sget-object v1, Lrb3;->a:Ll90;

    .line 283
    .line 284
    invoke-static {v0, v1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    check-cast v0, Lqb3;

    .line 289
    .line 290
    if-nez v0, :cond_a

    .line 291
    .line 292
    goto :goto_5

    .line 293
    :cond_a
    new-instance v8, Lub;

    .line 294
    .line 295
    iget-wide v11, v0, Lqb3;->a:J

    .line 296
    .line 297
    iget-object v13, v0, Lqb3;->b:Lac3;

    .line 298
    .line 299
    invoke-direct/range {v8 .. v13}, Lub;-><init>(Landroid/content/Context;Loo0;JLac3;)V

    .line 300
    .line 301
    .line 302
    move-object v7, v8

    .line 303
    :goto_5
    return-object v7

    .line 304
    :pswitch_c
    move-object/from16 v0, p1

    .line 305
    .line 306
    check-cast v0, Lc83;

    .line 307
    .line 308
    invoke-virtual {v0}, Lc83;->j()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_b

    .line 313
    .line 314
    iget-object v0, v0, Lc83;->n:Lb83;

    .line 315
    .line 316
    invoke-interface {v0}, Lb83;->Q()V

    .line 317
    .line 318
    .line 319
    :cond_b
    return-object v9

    .line 320
    :pswitch_d
    move-object/from16 v0, p1

    .line 321
    .line 322
    check-cast v0, Ljava/lang/Long;

    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    return-object v9

    .line 328
    :pswitch_e
    move-object/from16 v0, p1

    .line 329
    .line 330
    check-cast v0, Lf63;

    .line 331
    .line 332
    iget-object v0, v0, Lf63;->g0:Ltb3;

    .line 333
    .line 334
    if-eqz v0, :cond_c

    .line 335
    .line 336
    check-cast v0, Lvj1;

    .line 337
    .line 338
    invoke-virtual {v0}, Lvj1;->c()V

    .line 339
    .line 340
    .line 341
    :cond_c
    return-object v9

    .line 342
    :pswitch_f
    move-object/from16 v0, p1

    .line 343
    .line 344
    check-cast v0, Lf63;

    .line 345
    .line 346
    iget-object v1, v0, Lf63;->H:Lc72;

    .line 347
    .line 348
    :try_start_3
    invoke-virtual {v0}, Lf63;->j()Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_d

    .line 353
    .line 354
    invoke-virtual {v0, v6}, Lf63;->Z0(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 355
    .line 356
    .line 357
    goto :goto_6

    .line 358
    :catchall_3
    move-exception v0

    .line 359
    goto :goto_7

    .line 360
    :cond_d
    :goto_6
    return-object v9

    .line 361
    :goto_7
    invoke-virtual {v1, v0}, Lc72;->Z(Ljava/lang/Throwable;)V

    .line 362
    .line 363
    .line 364
    throw v7

    .line 365
    :pswitch_10
    move-object/from16 v0, p1

    .line 366
    .line 367
    check-cast v0, Lw53;

    .line 368
    .line 369
    iget-object v0, v0, Lw53;->a:Lwc;

    .line 370
    .line 371
    if-eqz v0, :cond_e

    .line 372
    .line 373
    invoke-virtual {v0}, Lwc;->invoke()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    :cond_e
    return-object v9

    .line 377
    :pswitch_11
    move-object/from16 v0, p1

    .line 378
    .line 379
    check-cast v0, Lod3;

    .line 380
    .line 381
    iget v1, v0, Lod3;->b:I

    .line 382
    .line 383
    iget v0, v0, Lod3;->c:I

    .line 384
    .line 385
    const-string v2, ", "

    .line 386
    .line 387
    const-string v3, ")"

    .line 388
    .line 389
    const-string v4, "["

    .line 390
    .line 391
    invoke-static {v4, v2, v1, v0, v3}, Lb11;->n(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    return-object v0

    .line 396
    :pswitch_12
    move-object/from16 v0, p1

    .line 397
    .line 398
    check-cast v0, Llg3;

    .line 399
    .line 400
    invoke-virtual {v0}, Llg3;->j()Z

    .line 401
    .line 402
    .line 403
    move-result v1

    .line 404
    if-eqz v1, :cond_11

    .line 405
    .line 406
    iget-object v1, v0, Llg3;->p:Lrp1;

    .line 407
    .line 408
    if-eqz v1, :cond_11

    .line 409
    .line 410
    iget-object v0, v0, Llg3;->o:Lcf2;

    .line 411
    .line 412
    iget-object v2, v0, Lcf2;->E:Lw03;

    .line 413
    .line 414
    if-eqz v2, :cond_f

    .line 415
    .line 416
    invoke-virtual {v2, v1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    move-object v7, v2

    .line 421
    check-cast v7, Lx03;

    .line 422
    .line 423
    :cond_f
    if-eqz v7, :cond_11

    .line 424
    .line 425
    iget-object v2, v0, Lcf2;->D:Lc6;

    .line 426
    .line 427
    if-eqz v2, :cond_10

    .line 428
    .line 429
    invoke-virtual {v2, v1}, Lc6;->u(Lrp1;)V

    .line 430
    .line 431
    .line 432
    :cond_10
    invoke-virtual {v0, v7}, Lcf2;->m0(Lx03;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v7}, Lx03;->b()V

    .line 436
    .line 437
    .line 438
    :cond_11
    return-object v9

    .line 439
    :pswitch_13
    move-object/from16 v11, p1

    .line 440
    .line 441
    check-cast v11, Llg3;

    .line 442
    .line 443
    invoke-virtual {v11}, Llg3;->j()Z

    .line 444
    .line 445
    .line 446
    move-result v0

    .line 447
    if-eqz v0, :cond_15

    .line 448
    .line 449
    iget-object v10, v11, Llg3;->o:Lcf2;

    .line 450
    .line 451
    iget-boolean v0, v10, Lcf2;->B:Z

    .line 452
    .line 453
    if-eqz v0, :cond_12

    .line 454
    .line 455
    goto :goto_8

    .line 456
    :cond_12
    iget-object v0, v11, Llg3;->n:Lvi2;

    .line 457
    .line 458
    invoke-interface {v0}, Lvi2;->g()Lif1;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    iget-object v1, v11, Llg3;->n:Lvi2;

    .line 463
    .line 464
    invoke-interface {v1}, Lvi2;->f()Lwf1;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-eqz v1, :cond_13

    .line 469
    .line 470
    invoke-virtual {v10}, Lcf2;->o0()V

    .line 471
    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_13
    if-nez v0, :cond_14

    .line 475
    .line 476
    iput-object v7, v10, Lcf2;->u:Lwf1;

    .line 477
    .line 478
    iput-object v7, v10, Lcf2;->v:Lif1;

    .line 479
    .line 480
    iput-object v7, v10, Lcf2;->t:Lif1;

    .line 481
    .line 482
    invoke-virtual {v10}, Lcf2;->o0()V

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_14
    iput-object v7, v10, Lcf2;->u:Lwf1;

    .line 487
    .line 488
    iput-object v7, v10, Lcf2;->v:Lif1;

    .line 489
    .line 490
    const-wide v12, 0x7fffffff7fffffffL

    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    const-wide/16 v14, 0x0

    .line 496
    .line 497
    invoke-virtual/range {v10 .. v15}, Lcf2;->Z(Llg3;JJ)V

    .line 498
    .line 499
    .line 500
    iput-object v0, v10, Lcf2;->t:Lif1;

    .line 501
    .line 502
    :cond_15
    :goto_8
    return-object v9

    .line 503
    :pswitch_14
    move-object/from16 v0, p1

    .line 504
    .line 505
    check-cast v0, Lkd3;

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    iget-object v1, v0, Lkd3;->n:Ljava/lang/Object;

    .line 511
    .line 512
    iget-object v0, v0, Lkd3;->o:Ljava/lang/Object;

    .line 513
    .line 514
    new-instance v2, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    return-object v0

    .line 533
    :pswitch_15
    move-object/from16 v0, p1

    .line 534
    .line 535
    check-cast v0, Lh52;

    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    iget-object v1, v0, Lh52;->a:Ljava/lang/String;

    .line 541
    .line 542
    iget-wide v2, v0, Lh52;->d:J

    .line 543
    .line 544
    new-instance v0, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    return-object v0

    .line 563
    :pswitch_16
    move-object/from16 v0, p1

    .line 564
    .line 565
    check-cast v0, Lorg/json/JSONObject;

    .line 566
    .line 567
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    return-object v9

    .line 571
    :pswitch_17
    move-object/from16 v0, p1

    .line 572
    .line 573
    check-cast v0, Lorg/json/JSONObject;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    return-object v9

    .line 579
    :pswitch_18
    move-object/from16 v0, p1

    .line 580
    .line 581
    check-cast v0, Lorg/json/JSONObject;

    .line 582
    .line 583
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    invoke-static {}, Lu52;->c()Lv52;

    .line 587
    .line 588
    .line 589
    move-result-object v4

    .line 590
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    invoke-static {v4, v3, v0, v8, v1}, Lv52;->a(Lv52;IIII)Lv52;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    sget-object v1, Lu52;->b:Lk03;

    .line 603
    .line 604
    invoke-virtual {v1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    sget-object v1, Lu52;->f:Landroid/content/Context;

    .line 608
    .line 609
    if-eqz v1, :cond_16

    .line 610
    .line 611
    invoke-static {v1, v0}, Lz52;->c(Landroid/content/Context;Lv52;)V

    .line 612
    .line 613
    .line 614
    :cond_16
    return-object v9

    .line 615
    :pswitch_19
    move-object/from16 v0, p1

    .line 616
    .line 617
    check-cast v0, Lorg/json/JSONObject;

    .line 618
    .line 619
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    invoke-static {}, Lu52;->c()Lv52;

    .line 623
    .line 624
    .line 625
    move-result-object v4

    .line 626
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    invoke-static {v4, v3, v0, v8, v1}, Lv52;->a(Lv52;IIII)Lv52;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    sget-object v1, Lu52;->b:Lk03;

    .line 639
    .line 640
    invoke-virtual {v1, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 641
    .line 642
    .line 643
    sget-object v1, Lu52;->f:Landroid/content/Context;

    .line 644
    .line 645
    if-eqz v1, :cond_17

    .line 646
    .line 647
    invoke-static {v1, v0}, Lz52;->c(Landroid/content/Context;Lv52;)V

    .line 648
    .line 649
    .line 650
    :cond_17
    return-object v9

    .line 651
    :pswitch_1a
    move-object/from16 v0, p1

    .line 652
    .line 653
    check-cast v0, Lorg/json/JSONObject;

    .line 654
    .line 655
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    sput-object v7, Lu52;->d:Ljava/lang/String;

    .line 659
    .line 660
    sget-object v0, Lu52;->a:Landroid/os/Handler;

    .line 661
    .line 662
    invoke-static {}, Lu52;->m()V

    .line 663
    .line 664
    .line 665
    return-object v9

    .line 666
    :pswitch_1b
    move-object/from16 v0, p1

    .line 667
    .line 668
    check-cast v0, Lorg/json/JSONObject;

    .line 669
    .line 670
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    return-object v9

    .line 674
    :pswitch_1c
    move-object/from16 v0, p1

    .line 675
    .line 676
    check-cast v0, Lorg/json/JSONObject;

    .line 677
    .line 678
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 679
    .line 680
    .line 681
    sput-object v7, Lu52;->d:Ljava/lang/String;

    .line 682
    .line 683
    sget-object v0, Lu52;->a:Landroid/os/Handler;

    .line 684
    .line 685
    invoke-static {}, Lu52;->m()V

    .line 686
    .line 687
    .line 688
    return-object v9

    .line 689
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
