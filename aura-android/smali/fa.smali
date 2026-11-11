.class public final synthetic Lfa;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfa;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lfa;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lfa;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget v0, p0, Lfa;->n:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    sget-object v4, Lj15;->a:Lj15;

    .line 8
    .line 9
    iget-object v5, p0, Lfa;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Lfa;->o:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Lea2;

    .line 17
    .line 18
    check-cast v5, Lpd1;

    .line 19
    .line 20
    invoke-virtual {p0, v5}, Lea2;->f(Laa2;)V

    .line 21
    .line 22
    .line 23
    return-object v4

    .line 24
    :pswitch_0
    check-cast p0, Lb0;

    .line 25
    .line 26
    check-cast v5, Lvc1;

    .line 27
    .line 28
    invoke-virtual {p0, v5}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 29
    .line 30
    .line 31
    return-object v4

    .line 32
    :pswitch_1
    check-cast p0, Lx03;

    .line 33
    .line 34
    check-cast v5, Lz80;

    .line 35
    .line 36
    iget-object v0, p0, Lx03;->b:[Ljava/lang/Object;

    .line 37
    .line 38
    iget-object p0, p0, Lx03;->a:[J

    .line 39
    .line 40
    array-length v3, p0

    .line 41
    add-int/lit8 v3, v3, -0x2

    .line 42
    .line 43
    if-ltz v3, :cond_3

    .line 44
    .line 45
    move v6, v2

    .line 46
    :goto_0
    aget-wide v7, p0, v6

    .line 47
    .line 48
    not-long v9, v7

    .line 49
    const/4 v11, 0x7

    .line 50
    shl-long/2addr v9, v11

    .line 51
    and-long/2addr v9, v7

    .line 52
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v9, v11

    .line 58
    cmp-long v9, v9, v11

    .line 59
    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    sub-int v9, v6, v3

    .line 63
    .line 64
    not-int v9, v9

    .line 65
    ushr-int/lit8 v9, v9, 0x1f

    .line 66
    .line 67
    rsub-int/lit8 v9, v9, 0x8

    .line 68
    .line 69
    move v10, v2

    .line 70
    :goto_1
    if-ge v10, v9, :cond_1

    .line 71
    .line 72
    const-wide/16 v11, 0xff

    .line 73
    .line 74
    and-long/2addr v11, v7

    .line 75
    const-wide/16 v13, 0x80

    .line 76
    .line 77
    cmp-long v11, v11, v13

    .line 78
    .line 79
    if-gez v11, :cond_0

    .line 80
    .line 81
    shl-int/lit8 v11, v6, 0x3

    .line 82
    .line 83
    add-int/2addr v11, v10

    .line 84
    aget-object v11, v0, v11

    .line 85
    .line 86
    invoke-virtual {v5, v11}, Lz80;->z(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_0
    shr-long/2addr v7, v1

    .line 90
    add-int/lit8 v10, v10, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    if-ne v9, v1, :cond_3

    .line 94
    .line 95
    :cond_2
    if-eq v6, v3, :cond_3

    .line 96
    .line 97
    add-int/lit8 v6, v6, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    return-object v4

    .line 101
    :pswitch_2
    check-cast p0, Ljv3;

    .line 102
    .line 103
    check-cast v5, Lmv3;

    .line 104
    .line 105
    iget-object p0, p0, Ljv3;->n:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lfl;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    if-eqz p0, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {v5}, Lmv3;->invoke()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :goto_2
    return-object v4

    .line 120
    :pswitch_3
    check-cast p0, Landroid/widget/ArrayAdapter;

    .line 121
    .line 122
    check-cast v5, Landroid/widget/AutoCompleteTextView;

    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getCount()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-lez v0, :cond_5

    .line 129
    .line 130
    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getFilter()Landroid/widget/Filter;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0, v3}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    .line 138
    .line 139
    .line 140
    :cond_5
    return-object v4

    .line 141
    :pswitch_4
    check-cast p0, Lx44;

    .line 142
    .line 143
    check-cast v5, Lw44;

    .line 144
    .line 145
    new-instance v0, Lz82;

    .line 146
    .line 147
    sget-object v1, Lv01;->n:Lv01;

    .line 148
    .line 149
    invoke-direct {v0, p0, v1, v5}, Lz82;-><init>(Lx44;Ljava/util/Map;Lw44;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_5
    check-cast p0, Ldp0;

    .line 154
    .line 155
    check-cast v5, Llm0;

    .line 156
    .line 157
    invoke-virtual {p0}, Ldp0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, Llc3;

    .line 162
    .line 163
    new-instance v0, Lue1;

    .line 164
    .line 165
    iget-object v1, v5, Lad3;->d:Lnq;

    .line 166
    .line 167
    iget-object v1, v1, Lnq;->s:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v1, Lg82;

    .line 170
    .line 171
    invoke-virtual {v1}, Lg82;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    check-cast v1, Lj02;

    .line 176
    .line 177
    invoke-direct {v0, v1, p0}, Lue1;-><init>(Lj02;Llc3;)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lnc3;

    .line 181
    .line 182
    invoke-direct {v1, v5, p0, v0}, Lnc3;-><init>(Llm0;Llc3;Lue1;)V

    .line 183
    .line 184
    .line 185
    return-object v1

    .line 186
    :pswitch_6
    check-cast p0, Lc72;

    .line 187
    .line 188
    check-cast v5, Ljx3;

    .line 189
    .line 190
    iget-object p0, p0, Lc72;->Q:Lw12;

    .line 191
    .line 192
    iget-object v0, p0, Lw12;->g:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Lcx2;

    .line 195
    .line 196
    iget v0, v0, Lcx2;->q:I

    .line 197
    .line 198
    and-int/2addr v0, v1

    .line 199
    if-eqz v0, :cond_10

    .line 200
    .line 201
    iget-object p0, p0, Lw12;->f:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p0, Lsq4;

    .line 204
    .line 205
    :goto_3
    if-eqz p0, :cond_10

    .line 206
    .line 207
    iget v0, p0, Lcx2;->p:I

    .line 208
    .line 209
    and-int/2addr v0, v1

    .line 210
    if-eqz v0, :cond_f

    .line 211
    .line 212
    move-object v0, p0

    .line 213
    move-object v6, v3

    .line 214
    :goto_4
    if-eqz v0, :cond_f

    .line 215
    .line 216
    instance-of v7, v0, Lg94;

    .line 217
    .line 218
    const/4 v8, 0x1

    .line 219
    if-eqz v7, :cond_8

    .line 220
    .line 221
    check-cast v0, Lg94;

    .line 222
    .line 223
    invoke-interface {v0}, Lg94;->u()Z

    .line 224
    .line 225
    .line 226
    move-result v7

    .line 227
    if-eqz v7, :cond_6

    .line 228
    .line 229
    new-instance v7, Le94;

    .line 230
    .line 231
    invoke-direct {v7}, Le94;-><init>()V

    .line 232
    .line 233
    .line 234
    iput-object v7, v5, Ljx3;->n:Ljava/lang/Object;

    .line 235
    .line 236
    iput-boolean v8, v7, Le94;->q:Z

    .line 237
    .line 238
    :cond_6
    invoke-interface {v0}, Lg94;->d0()Z

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eqz v7, :cond_7

    .line 243
    .line 244
    iget-object v7, v5, Ljx3;->n:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v7, Le94;

    .line 247
    .line 248
    iput-boolean v8, v7, Le94;->p:Z

    .line 249
    .line 250
    :cond_7
    iget-object v7, v5, Ljx3;->n:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast v7, Lq94;

    .line 253
    .line 254
    invoke-interface {v0, v7}, Lg94;->c0(Lq94;)V

    .line 255
    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_8
    iget v7, v0, Lcx2;->p:I

    .line 259
    .line 260
    and-int/2addr v7, v1

    .line 261
    if-eqz v7, :cond_e

    .line 262
    .line 263
    instance-of v7, v0, Lfo0;

    .line 264
    .line 265
    if-eqz v7, :cond_e

    .line 266
    .line 267
    move-object v7, v0

    .line 268
    check-cast v7, Lfo0;

    .line 269
    .line 270
    iget-object v7, v7, Lfo0;->C:Lcx2;

    .line 271
    .line 272
    move v9, v2

    .line 273
    :goto_5
    if-eqz v7, :cond_d

    .line 274
    .line 275
    iget v10, v7, Lcx2;->p:I

    .line 276
    .line 277
    and-int/2addr v10, v1

    .line 278
    if-eqz v10, :cond_c

    .line 279
    .line 280
    add-int/lit8 v9, v9, 0x1

    .line 281
    .line 282
    if-ne v9, v8, :cond_9

    .line 283
    .line 284
    move-object v0, v7

    .line 285
    goto :goto_6

    .line 286
    :cond_9
    if-nez v6, :cond_a

    .line 287
    .line 288
    new-instance v6, Lf13;

    .line 289
    .line 290
    const/16 v10, 0x10

    .line 291
    .line 292
    new-array v10, v10, [Lcx2;

    .line 293
    .line 294
    invoke-direct {v6, v10}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_a
    if-eqz v0, :cond_b

    .line 298
    .line 299
    invoke-virtual {v6, v0}, Lf13;->b(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    move-object v0, v3

    .line 303
    :cond_b
    invoke-virtual {v6, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_c
    :goto_6
    iget-object v7, v7, Lcx2;->s:Lcx2;

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_d
    if-ne v9, v8, :cond_e

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_e
    :goto_7
    invoke-static {v6}, Lj51;->c(Lf13;)Lcx2;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    goto :goto_4

    .line 317
    :cond_f
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_10
    return-object v4

    .line 321
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 322
    .line 323
    check-cast v5, Lj52;

    .line 324
    .line 325
    iget-object p0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Lbl2;

    .line 326
    .line 327
    if-eqz p0, :cond_11

    .line 328
    .line 329
    invoke-virtual {p0}, Lu0;->get()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    check-cast p0, Lbj2;

    .line 334
    .line 335
    invoke-virtual {p0, v5}, Lsk2;->v(Loi3;)V

    .line 336
    .line 337
    .line 338
    return-object v4

    .line 339
    :cond_11
    const-string p0, "browserFuture"

    .line 340
    .line 341
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v3

    .line 345
    :pswitch_8
    check-cast p0, Ljava/lang/String;

    .line 346
    .line 347
    check-cast v5, Ljava/lang/String;

    .line 348
    .line 349
    sget-object v0, Lrr1;->a:Lrr1;

    .line 350
    .line 351
    new-instance v0, Lkd3;

    .line 352
    .line 353
    const-string v1, "username"

    .line 354
    .line 355
    invoke-direct {v0, v1, p0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    new-instance v1, Lkd3;

    .line 359
    .line 360
    const-string v2, "password"

    .line 361
    .line 362
    invoke-direct {v1, v2, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    filled-new-array {v0, v1}, [Lkd3;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 374
    .line 375
    check-cast v0, Ljava/util/Map;

    .line 376
    .line 377
    const-string v2, "/api/auth/login"

    .line 378
    .line 379
    invoke-static {v0, v2, v1}, Lrr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMe;->getUsername()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    if-nez v0, :cond_12

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_12
    move-object p0, v0

    .line 393
    :goto_8
    new-instance v0, Lkd3;

    .line 394
    .line 395
    invoke-direct {v0, p0, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_9
    check-cast p0, Lcm1;

    .line 400
    .line 401
    check-cast v5, Lcx2;

    .line 402
    .line 403
    invoke-virtual {p0, v5}, Lcm1;->d(Lcx2;)V

    .line 404
    .line 405
    .line 406
    return-object v4

    .line 407
    :pswitch_a
    check-cast p0, Ljx3;

    .line 408
    .line 409
    check-cast v5, Lea1;

    .line 410
    .line 411
    sget-object v0, Lfg3;->a:Ll90;

    .line 412
    .line 413
    invoke-static {v5, v0}, Lkb4;->q(La90;Lqr3;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    iput-object v0, p0, Ljx3;->n:Ljava/lang/Object;

    .line 418
    .line 419
    return-object v4

    .line 420
    :pswitch_b
    check-cast p0, Ljx3;

    .line 421
    .line 422
    check-cast v5, Lba1;

    .line 423
    .line 424
    invoke-virtual {v5}, Lba1;->s0()Lx91;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    iput-object v0, p0, Ljx3;->n:Ljava/lang/Object;

    .line 429
    .line 430
    return-object v4

    .line 431
    :pswitch_c
    check-cast p0, Lx80;

    .line 432
    .line 433
    iget-object p0, p0, Lx80;->n:Lrg1;

    .line 434
    .line 435
    iget-object v0, p0, Lrg1;->c:Lig4;

    .line 436
    .line 437
    invoke-virtual {v0}, Lig4;->d()Lhg4;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    move v4, v2

    .line 442
    :goto_9
    :try_start_0
    iget v6, v0, Lig4;->o:I

    .line 443
    .line 444
    if-ge v4, v6, :cond_1c

    .line 445
    .line 446
    invoke-virtual {v1, v4}, Lhg4;->l(I)Z

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    if-eqz v6, :cond_16

    .line 451
    .line 452
    invoke-virtual {v1, v4}, Lhg4;->n(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    if-eq v6, v5, :cond_15

    .line 457
    .line 458
    instance-of v7, v6, Lwg1;

    .line 459
    .line 460
    if-eqz v7, :cond_13

    .line 461
    .line 462
    check-cast v6, Lwg1;

    .line 463
    .line 464
    goto :goto_a

    .line 465
    :cond_13
    move-object v6, v3

    .line 466
    :goto_a
    if-eqz v6, :cond_14

    .line 467
    .line 468
    iget-object v6, v6, Lwg1;->a:Lvy3;

    .line 469
    .line 470
    goto :goto_b

    .line 471
    :cond_14
    move-object v6, v3

    .line 472
    :goto_b
    if-ne v6, v5, :cond_16

    .line 473
    .line 474
    :cond_15
    new-instance v2, Lu73;

    .line 475
    .line 476
    invoke-direct {v2, v4, v3}, Lu73;-><init>(ILjava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1}, Lhg4;->c()V

    .line 480
    .line 481
    .line 482
    move-object v3, v2

    .line 483
    goto :goto_11

    .line 484
    :catchall_0
    move-exception p0

    .line 485
    goto/16 :goto_13

    .line 486
    .line 487
    :cond_16
    :try_start_1
    iget-object v6, v1, Lhg4;->b:[I

    .line 488
    .line 489
    invoke-static {v6, v4}, Lkg4;->b([II)I

    .line 490
    .line 491
    .line 492
    move-result v7

    .line 493
    add-int/lit8 v8, v4, 0x1

    .line 494
    .line 495
    iget v9, v1, Lhg4;->c:I

    .line 496
    .line 497
    if-ge v8, v9, :cond_17

    .line 498
    .line 499
    mul-int/lit8 v9, v8, 0x5

    .line 500
    .line 501
    add-int/lit8 v9, v9, 0x4

    .line 502
    .line 503
    aget v6, v6, v9

    .line 504
    .line 505
    goto :goto_c

    .line 506
    :cond_17
    iget v6, v1, Lhg4;->e:I

    .line 507
    .line 508
    :goto_c
    sub-int/2addr v6, v7

    .line 509
    move v7, v2

    .line 510
    :goto_d
    if-ge v7, v6, :cond_1d

    .line 511
    .line 512
    invoke-virtual {v1, v4, v7}, Lhg4;->h(II)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    if-eq v9, v5, :cond_1b

    .line 517
    .line 518
    instance-of v10, v9, Lwg1;

    .line 519
    .line 520
    if-eqz v10, :cond_18

    .line 521
    .line 522
    check-cast v9, Lwg1;

    .line 523
    .line 524
    goto :goto_e

    .line 525
    :cond_18
    move-object v9, v3

    .line 526
    :goto_e
    if-eqz v9, :cond_19

    .line 527
    .line 528
    iget-object v9, v9, Lwg1;->a:Lvy3;

    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_19
    move-object v9, v3

    .line 532
    :goto_f
    if-ne v9, v5, :cond_1a

    .line 533
    .line 534
    goto :goto_10

    .line 535
    :cond_1a
    add-int/lit8 v7, v7, 0x1

    .line 536
    .line 537
    goto :goto_d

    .line 538
    :cond_1b
    :goto_10
    new-instance v3, Lu73;

    .line 539
    .line 540
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-direct {v3, v4, v2}, Lu73;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 545
    .line 546
    .line 547
    :cond_1c
    invoke-virtual {v1}, Lhg4;->c()V

    .line 548
    .line 549
    .line 550
    goto :goto_11

    .line 551
    :cond_1d
    move v4, v8

    .line 552
    goto :goto_9

    .line 553
    :goto_11
    if-eqz v3, :cond_1e

    .line 554
    .line 555
    iget v1, v3, Lu73;->a:I

    .line 556
    .line 557
    iget-object v2, v3, Lu73;->b:Ljava/lang/Integer;

    .line 558
    .line 559
    invoke-virtual {v0}, Lig4;->d()Lhg4;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    :try_start_2
    invoke-static {v0, v1, v2}, Lgh0;->H(Lhg4;ILjava/lang/Integer;)Ljava/util/ArrayList;

    .line 564
    .line 565
    .line 566
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 567
    invoke-virtual {v0}, Lhg4;->c()V

    .line 568
    .line 569
    .line 570
    invoke-virtual {p0}, Lrg1;->A()Ljava/util/List;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-static {v1, v0}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    goto :goto_12

    .line 579
    :catchall_1
    move-exception p0

    .line 580
    invoke-virtual {v0}, Lhg4;->c()V

    .line 581
    .line 582
    .line 583
    throw p0

    .line 584
    :cond_1e
    sget-object v0, Lu01;->n:Lu01;

    .line 585
    .line 586
    :goto_12
    new-instance v1, Lc80;

    .line 587
    .line 588
    iget-boolean p0, p0, Lrg1;->C:Z

    .line 589
    .line 590
    invoke-direct {v1, v0, p0}, Lc80;-><init>(Ljava/util/List;Z)V

    .line 591
    .line 592
    .line 593
    return-object v1

    .line 594
    :goto_13
    invoke-virtual {v1}, Lhg4;->c()V

    .line 595
    .line 596
    .line 597
    throw p0

    .line 598
    :pswitch_d
    check-cast p0, Lgf1;

    .line 599
    .line 600
    check-cast v5, Lf63;

    .line 601
    .line 602
    if-eqz p0, :cond_20

    .line 603
    .line 604
    invoke-interface {p0}, Lgf1;->invoke()Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    check-cast p0, Lwv3;

    .line 609
    .line 610
    if-nez p0, :cond_1f

    .line 611
    .line 612
    goto :goto_14

    .line 613
    :cond_1f
    move-object v3, p0

    .line 614
    goto :goto_16

    .line 615
    :cond_20
    :goto_14
    invoke-virtual {v5}, Lf63;->A0()Lcx2;

    .line 616
    .line 617
    .line 618
    move-result-object p0

    .line 619
    iget-boolean p0, p0, Lcx2;->A:Z

    .line 620
    .line 621
    if-eqz p0, :cond_21

    .line 622
    .line 623
    goto :goto_15

    .line 624
    :cond_21
    move-object v5, v3

    .line 625
    :goto_15
    if-eqz v5, :cond_22

    .line 626
    .line 627
    iget-wide v0, v5, Ljg3;->p:J

    .line 628
    .line 629
    invoke-static {v0, v1}, Ll93;->o0(J)J

    .line 630
    .line 631
    .line 632
    move-result-wide v0

    .line 633
    const-wide/16 v2, 0x0

    .line 634
    .line 635
    invoke-static {v2, v3, v0, v1}, Lbu;->d(JJ)Lwv3;

    .line 636
    .line 637
    .line 638
    move-result-object v3

    .line 639
    :cond_22
    :goto_16
    return-object v3

    .line 640
    :pswitch_e
    check-cast p0, Lvo;

    .line 641
    .line 642
    check-cast v5, Le72;

    .line 643
    .line 644
    iget-object v0, p0, Lvo;->C:Lsp1;

    .line 645
    .line 646
    iget-object v1, v5, Le72;->n:Lmz;

    .line 647
    .line 648
    invoke-interface {v1}, Lsv0;->P()J

    .line 649
    .line 650
    .line 651
    move-result-wide v1

    .line 652
    invoke-virtual {v5}, Le72;->getLayoutDirection()Lr62;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    invoke-virtual {v0, v1, v2, v3, v5}, Lsp1;->a(JLr62;Loo0;)Lya4;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    iput-object v0, p0, Lvo;->H:Lya4;

    .line 661
    .line 662
    return-object v4

    .line 663
    :pswitch_f
    check-cast p0, Lp64;

    .line 664
    .line 665
    check-cast v5, Lya;

    .line 666
    .line 667
    iget-object v0, p0, Lp64;->r:Lh64;

    .line 668
    .line 669
    iget-object v1, p0, Lp64;->s:Lh64;

    .line 670
    .line 671
    iget-object v2, p0, Lp64;->p:Ljava/lang/Float;

    .line 672
    .line 673
    iget-object v3, p0, Lp64;->q:Ljava/lang/Float;

    .line 674
    .line 675
    const/4 v6, 0x0

    .line 676
    if-eqz v0, :cond_23

    .line 677
    .line 678
    if-eqz v2, :cond_23

    .line 679
    .line 680
    iget-object v7, v0, Lh64;->a:Lv82;

    .line 681
    .line 682
    invoke-virtual {v7}, Lv82;->invoke()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    check-cast v7, Ljava/lang/Number;

    .line 687
    .line 688
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 689
    .line 690
    .line 691
    move-result v7

    .line 692
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    sub-float/2addr v7, v2

    .line 697
    goto :goto_17

    .line 698
    :cond_23
    move v7, v6

    .line 699
    :goto_17
    if-eqz v1, :cond_24

    .line 700
    .line 701
    if-eqz v3, :cond_24

    .line 702
    .line 703
    iget-object v2, v1, Lh64;->a:Lv82;

    .line 704
    .line 705
    invoke-virtual {v2}, Lv82;->invoke()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    check-cast v2, Ljava/lang/Number;

    .line 710
    .line 711
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    sub-float/2addr v2, v3

    .line 720
    goto :goto_18

    .line 721
    :cond_24
    move v2, v6

    .line 722
    :goto_18
    cmpg-float v3, v7, v6

    .line 723
    .line 724
    if-nez v3, :cond_25

    .line 725
    .line 726
    cmpg-float v2, v2, v6

    .line 727
    .line 728
    if-nez v2, :cond_25

    .line 729
    .line 730
    goto :goto_19

    .line 731
    :cond_25
    iget v2, p0, Lp64;->n:I

    .line 732
    .line 733
    invoke-virtual {v5, v2}, Lya;->A(I)I

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    invoke-virtual {v5}, Lya;->s()Le02;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    iget v6, v5, Lya;->x:I

    .line 742
    .line 743
    invoke-virtual {v3, v6}, Le02;->b(I)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    check-cast v3, Lk94;

    .line 748
    .line 749
    if-eqz v3, :cond_26

    .line 750
    .line 751
    :try_start_3
    iget-object v6, v5, Lya;->z:Lv3;

    .line 752
    .line 753
    if-eqz v6, :cond_26

    .line 754
    .line 755
    invoke-virtual {v5, v3}, Lya;->k(Lk94;)Landroid/graphics/Rect;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    iget-object v6, v6, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 760
    .line 761
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_0

    .line 762
    .line 763
    .line 764
    :catch_0
    :cond_26
    invoke-virtual {v5}, Lya;->s()Le02;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    iget v6, v5, Lya;->y:I

    .line 769
    .line 770
    invoke-virtual {v3, v6}, Le02;->b(I)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    check-cast v3, Lk94;

    .line 775
    .line 776
    if-eqz v3, :cond_27

    .line 777
    .line 778
    :try_start_4
    iget-object v6, v5, Lya;->A:Lv3;

    .line 779
    .line 780
    if-eqz v6, :cond_27

    .line 781
    .line 782
    invoke-virtual {v5, v3}, Lya;->k(Lk94;)Landroid/graphics/Rect;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    iget-object v6, v6, Lv3;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 787
    .line 788
    invoke-virtual {v6, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setBoundsInScreen(Landroid/graphics/Rect;)V
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_1

    .line 789
    .line 790
    .line 791
    :catch_1
    :cond_27
    iget-object v3, v5, Lya;->q:Lra;

    .line 792
    .line 793
    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    .line 794
    .line 795
    .line 796
    invoke-virtual {v5}, Lya;->s()Le02;

    .line 797
    .line 798
    .line 799
    move-result-object v3

    .line 800
    invoke-virtual {v3, v2}, Le02;->b(I)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    check-cast v3, Lk94;

    .line 805
    .line 806
    if-eqz v3, :cond_2a

    .line 807
    .line 808
    iget-object v3, v3, Lk94;->a:Li94;

    .line 809
    .line 810
    if-eqz v3, :cond_2a

    .line 811
    .line 812
    iget-object v3, v3, Li94;->c:Lc72;

    .line 813
    .line 814
    if-eqz v3, :cond_2a

    .line 815
    .line 816
    if-eqz v0, :cond_28

    .line 817
    .line 818
    iget-object v6, v5, Lya;->C:Li03;

    .line 819
    .line 820
    invoke-virtual {v6, v2, v0}, Li03;->i(ILjava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    :cond_28
    if-eqz v1, :cond_29

    .line 824
    .line 825
    iget-object v6, v5, Lya;->D:Li03;

    .line 826
    .line 827
    invoke-virtual {v6, v2, v1}, Li03;->i(ILjava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    :cond_29
    invoke-virtual {v5, v3}, Lya;->w(Lc72;)V

    .line 831
    .line 832
    .line 833
    :cond_2a
    :goto_19
    if-eqz v0, :cond_2b

    .line 834
    .line 835
    iget-object v0, v0, Lh64;->a:Lv82;

    .line 836
    .line 837
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    check-cast v0, Ljava/lang/Float;

    .line 842
    .line 843
    iput-object v0, p0, Lp64;->p:Ljava/lang/Float;

    .line 844
    .line 845
    :cond_2b
    if-eqz v1, :cond_2c

    .line 846
    .line 847
    iget-object v0, v1, Lh64;->a:Lv82;

    .line 848
    .line 849
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    check-cast v0, Ljava/lang/Float;

    .line 854
    .line 855
    iput-object v0, p0, Lp64;->q:Ljava/lang/Float;

    .line 856
    .line 857
    :cond_2c
    return-object v4

    .line 858
    :pswitch_10
    check-cast p0, Lra;

    .line 859
    .line 860
    check-cast v5, Landroid/view/KeyEvent;

    .line 861
    .line 862
    invoke-static {p0, v5}, Lra;->c(Lra;Landroid/view/KeyEvent;)Z

    .line 863
    .line 864
    .line 865
    move-result p0

    .line 866
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 867
    .line 868
    .line 869
    move-result-object p0

    .line 870
    return-object p0

    .line 871
    :pswitch_data_0
    .packed-switch 0x0
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
