.class public final synthetic Lo54;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lo54;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lm24;)V
    .locals 0

    .line 1
    const/16 p1, 0xc

    .line 2
    .line 3
    iput p1, p0, Lo54;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lo54;->n:I

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    const/4 v2, 0x7

    .line 8
    const/4 v3, 0x6

    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/16 v7, 0x20

    .line 13
    .line 14
    sget-object v8, Lj15;->a:Lj15;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v11, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    check-cast v0, Lmu0;

    .line 24
    .line 25
    new-instance v1, Lae;

    .line 26
    .line 27
    iget-wide v2, v0, Lmu0;->a:J

    .line 28
    .line 29
    shr-long/2addr v2, v7

    .line 30
    long-to-int v2, v2

    .line 31
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    iget-wide v3, v0, Lmu0;->a:J

    .line 36
    .line 37
    const-wide v5, 0xffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    and-long/2addr v3, v5

    .line 43
    long-to-int v0, v3

    .line 44
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-direct {v1, v2, v0}, Lae;-><init>(FF)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :pswitch_0
    move-object/from16 v0, p1

    .line 53
    .line 54
    check-cast v0, Lzd;

    .line 55
    .line 56
    iget v0, v0, Lzd;->a:F

    .line 57
    .line 58
    new-instance v1, Lku0;

    .line 59
    .line 60
    invoke-direct {v1, v0}, Lku0;-><init>(F)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_1
    move-object/from16 v0, p1

    .line 65
    .line 66
    check-cast v0, Lku0;

    .line 67
    .line 68
    new-instance v1, Lzd;

    .line 69
    .line 70
    iget v0, v0, Lku0;->n:F

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lzd;-><init>(F)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_2
    move-object/from16 v0, p1

    .line 77
    .line 78
    check-cast v0, Lzd;

    .line 79
    .line 80
    iget v0, v0, Lzd;->a:F

    .line 81
    .line 82
    float-to-int v0, v0

    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :pswitch_3
    move-object/from16 v0, p1

    .line 89
    .line 90
    check-cast v0, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    new-instance v1, Lzd;

    .line 97
    .line 98
    int-to-float v0, v0

    .line 99
    invoke-direct {v1, v0}, Lzd;-><init>(F)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :pswitch_4
    move-object/from16 v0, p1

    .line 104
    .line 105
    check-cast v0, Ljava/lang/Float;

    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    new-instance v1, Lzd;

    .line 112
    .line 113
    invoke-direct {v1, v0}, Lzd;-><init>(F)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :pswitch_5
    move-object/from16 v0, p1

    .line 118
    .line 119
    check-cast v0, Lgn2;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object v1, v0, Lgn2;->d:Ldo2;

    .line 125
    .line 126
    iget-object v1, v1, Ldo2;->I:Landroid/os/Bundle;

    .line 127
    .line 128
    if-eqz v1, :cond_0

    .line 129
    .line 130
    const-string v2, "type"

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_0

    .line 137
    :cond_0
    const/4 v1, 0x0

    .line 138
    :goto_0
    const-string v2, "music"

    .line 139
    .line 140
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_1

    .line 145
    .line 146
    iget-object v0, v0, Lgn2;->a:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v11, v0}, Le03;->j(ILjava/lang/String;)Landroid/net/Uri;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    goto :goto_1

    .line 157
    :cond_1
    iget-object v0, v0, Lgn2;->b:Lbn2;

    .line 158
    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    iget-object v0, v0, Lbn2;->a:Landroid/net/Uri;

    .line 162
    .line 163
    if-eqz v0, :cond_2

    .line 164
    .line 165
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    goto :goto_1

    .line 170
    :cond_2
    const/4 v10, 0x0

    .line 171
    :goto_1
    return-object v10

    .line 172
    :pswitch_6
    move-object/from16 v0, p1

    .line 173
    .line 174
    check-cast v0, Lkd3;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    iget-object v1, v0, Lkd3;->n:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Ljava/lang/String;

    .line 182
    .line 183
    iget-object v0, v0, Lkd3;->o:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Ljava/lang/String;

    .line 186
    .line 187
    sget-object v2, Lf25;->c:Ljava/util/List;

    .line 188
    .line 189
    invoke-static {v0}, Lud3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v2, "</"

    .line 194
    .line 195
    const-string v3, "<"

    .line 196
    .line 197
    const-string v4, ">"

    .line 198
    .line 199
    invoke-static {v3, v1, v4, v0, v2}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0, v1, v4}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    return-object v0

    .line 208
    :pswitch_7
    move-object/from16 v0, p1

    .line 209
    .line 210
    check-cast v0, Lz34;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v1, Lfb4;

    .line 216
    .line 217
    invoke-direct {v1}, Lfb4;-><init>()V

    .line 218
    .line 219
    .line 220
    :goto_2
    invoke-interface {v0}, Lz34;->O()Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_3

    .line 225
    .line 226
    invoke-interface {v0, v11}, Lz34;->getLong(I)J

    .line 227
    .line 228
    .line 229
    move-result-wide v2

    .line 230
    long-to-int v2, v2

    .line 231
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v1, v2}, Lfb4;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_3
    invoke-static {v1}, Lkb4;->l(Lfb4;)Lfb4;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    return-object v0

    .line 244
    :pswitch_8
    move-object/from16 v0, p1

    .line 245
    .line 246
    check-cast v0, Lz34;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-interface {v0}, Lz34;->O()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    return-object v0

    .line 260
    :pswitch_9
    move-object/from16 v0, p1

    .line 261
    .line 262
    check-cast v0, Ljw1;

    .line 263
    .line 264
    return-object v8

    .line 265
    :pswitch_a
    move-object/from16 v0, p1

    .line 266
    .line 267
    check-cast v0, Ljava/util/List;

    .line 268
    .line 269
    return-object v8

    .line 270
    :pswitch_b
    move-object/from16 v0, p1

    .line 271
    .line 272
    check-cast v0, Ljava/lang/Float;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    return-object v8

    .line 278
    :pswitch_c
    move-object/from16 v0, p1

    .line 279
    .line 280
    check-cast v0, Landroid/content/res/Resources;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 290
    .line 291
    and-int/lit8 v0, v0, 0x30

    .line 292
    .line 293
    if-ne v0, v7, :cond_4

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_4
    move v9, v11

    .line 297
    :goto_3
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0

    .line 302
    :pswitch_d
    move-object/from16 v0, p1

    .line 303
    .line 304
    check-cast v0, Lgh4;

    .line 305
    .line 306
    sget-object v0, Ljh4;->a:Lo54;

    .line 307
    .line 308
    return-object v8

    .line 309
    :pswitch_e
    move-object/from16 v0, p1

    .line 310
    .line 311
    check-cast v0, Lx34;

    .line 312
    .line 313
    const-string v1, "SELECT * FROM server"

    .line 314
    .line 315
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    :try_start_0
    const-string v0, "id"

    .line 320
    .line 321
    invoke-static {v1, v0}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    const-string v2, "server_name"

    .line 326
    .line 327
    invoke-static {v1, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    const-string v3, "username"

    .line 332
    .line 333
    invoke-static {v1, v3}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    const-string v4, "password"

    .line 338
    .line 339
    invoke-static {v1, v4}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    const-string v5, "address"

    .line 344
    .line 345
    invoke-static {v1, v5}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    const-string v6, "local_address"

    .line 350
    .line 351
    invoke-static {v1, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    const-string v7, "timestamp"

    .line 356
    .line 357
    invoke-static {v1, v7}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    move-result v7

    .line 361
    const-string v8, "low_security"

    .line 362
    .line 363
    invoke-static {v1, v8}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 364
    .line 365
    .line 366
    move-result v8

    .line 367
    const-string v12, "client_cert"

    .line 368
    .line 369
    invoke-static {v1, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 370
    .line 371
    .line 372
    move-result v12

    .line 373
    new-instance v13, Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 376
    .line 377
    .line 378
    :goto_4
    invoke-interface {v1}, Lz34;->O()Z

    .line 379
    .line 380
    .line 381
    move-result v14

    .line 382
    if-eqz v14, :cond_d

    .line 383
    .line 384
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 385
    .line 386
    .line 387
    move-result v14

    .line 388
    if-eqz v14, :cond_5

    .line 389
    .line 390
    const/16 v16, 0x0

    .line 391
    .line 392
    goto :goto_5

    .line 393
    :cond_5
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v14

    .line 397
    move-object/from16 v16, v14

    .line 398
    .line 399
    :goto_5
    invoke-interface {v1, v2}, Lz34;->isNull(I)Z

    .line 400
    .line 401
    .line 402
    move-result v14

    .line 403
    if-eqz v14, :cond_6

    .line 404
    .line 405
    const/16 v17, 0x0

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_6
    invoke-interface {v1, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v14

    .line 412
    move-object/from16 v17, v14

    .line 413
    .line 414
    :goto_6
    invoke-interface {v1, v3}, Lz34;->isNull(I)Z

    .line 415
    .line 416
    .line 417
    move-result v14

    .line 418
    if-eqz v14, :cond_7

    .line 419
    .line 420
    const/16 v18, 0x0

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_7
    invoke-interface {v1, v3}, Lz34;->D(I)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v14

    .line 427
    move-object/from16 v18, v14

    .line 428
    .line 429
    :goto_7
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 430
    .line 431
    .line 432
    move-result v14

    .line 433
    if-eqz v14, :cond_8

    .line 434
    .line 435
    const/16 v19, 0x0

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_8
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v14

    .line 442
    move-object/from16 v19, v14

    .line 443
    .line 444
    :goto_8
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 445
    .line 446
    .line 447
    move-result v14

    .line 448
    if-eqz v14, :cond_9

    .line 449
    .line 450
    const/16 v20, 0x0

    .line 451
    .line 452
    goto :goto_9

    .line 453
    :cond_9
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v14

    .line 457
    move-object/from16 v20, v14

    .line 458
    .line 459
    :goto_9
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 460
    .line 461
    .line 462
    move-result v14

    .line 463
    if-eqz v14, :cond_a

    .line 464
    .line 465
    const/16 v21, 0x0

    .line 466
    .line 467
    goto :goto_a

    .line 468
    :cond_a
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v14

    .line 472
    move-object/from16 v21, v14

    .line 473
    .line 474
    :goto_a
    invoke-interface {v1, v7}, Lz34;->getLong(I)J

    .line 475
    .line 476
    .line 477
    move-result-wide v22

    .line 478
    invoke-interface {v1, v8}, Lz34;->getLong(I)J

    .line 479
    .line 480
    .line 481
    move-result-wide v14

    .line 482
    long-to-int v14, v14

    .line 483
    if-eqz v14, :cond_b

    .line 484
    .line 485
    move/from16 v24, v9

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_b
    move/from16 v24, v11

    .line 489
    .line 490
    :goto_b
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 491
    .line 492
    .line 493
    move-result v14

    .line 494
    if-eqz v14, :cond_c

    .line 495
    .line 496
    const/16 v25, 0x0

    .line 497
    .line 498
    goto :goto_c

    .line 499
    :cond_c
    invoke-interface {v1, v12}, Lz34;->D(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v14

    .line 503
    move-object/from16 v25, v14

    .line 504
    .line 505
    :goto_c
    new-instance v15, Lcom/eddyizm/tempus/model/Server;

    .line 506
    .line 507
    invoke-direct/range {v15 .. v25}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 511
    .line 512
    .line 513
    goto/16 :goto_4

    .line 514
    .line 515
    :catchall_0
    move-exception v0

    .line 516
    goto :goto_d

    .line 517
    :cond_d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 518
    .line 519
    .line 520
    return-object v13

    .line 521
    :goto_d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 522
    .line 523
    .line 524
    throw v0

    .line 525
    :pswitch_f
    if-nez p1, :cond_e

    .line 526
    .line 527
    goto :goto_e

    .line 528
    :cond_e
    move v9, v11

    .line 529
    :goto_e
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    return-object v0

    .line 534
    :pswitch_10
    move-object/from16 v0, p1

    .line 535
    .line 536
    check-cast v0, Lq94;

    .line 537
    .line 538
    invoke-static {v0}, Lo94;->a(Lq94;)V

    .line 539
    .line 540
    .line 541
    return-object v8

    .line 542
    :pswitch_11
    move-object/from16 v0, p1

    .line 543
    .line 544
    check-cast v0, Lj64;

    .line 545
    .line 546
    iget-object v0, v0, Lj64;->c:Lk02;

    .line 547
    .line 548
    iget v1, v0, Lk02;->d:I

    .line 549
    .line 550
    iget v0, v0, Lk02;->b:I

    .line 551
    .line 552
    sub-int/2addr v1, v0

    .line 553
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    return-object v0

    .line 558
    :pswitch_12
    move-object/from16 v0, p1

    .line 559
    .line 560
    check-cast v0, Lj64;

    .line 561
    .line 562
    iget v0, v0, Lj64;->b:I

    .line 563
    .line 564
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    return-object v0

    .line 569
    :pswitch_13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-object/from16 v0, p1

    .line 573
    .line 574
    check-cast v0, Ljava/lang/Integer;

    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    new-instance v1, Lps4;

    .line 581
    .line 582
    invoke-direct {v1, v0}, Lps4;-><init>(I)V

    .line 583
    .line 584
    .line 585
    return-object v1

    .line 586
    :pswitch_14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    .line 588
    .line 589
    move-object/from16 v0, p1

    .line 590
    .line 591
    check-cast v0, Ljava/util/List;

    .line 592
    .line 593
    new-instance v1, Lqs4;

    .line 594
    .line 595
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 600
    .line 601
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    sget-object v4, Lt54;->e:Lxc5;

    .line 606
    .line 607
    if-eqz v3, :cond_10

    .line 608
    .line 609
    :cond_f
    const/4 v2, 0x0

    .line 610
    goto :goto_f

    .line 611
    :cond_10
    if-eqz v2, :cond_f

    .line 612
    .line 613
    iget-object v3, v4, Lxc5;->p:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v3, Lif1;

    .line 616
    .line 617
    invoke-interface {v3, v2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    check-cast v2, Lps4;

    .line 622
    .line 623
    :goto_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    iget v2, v2, Lps4;->a:I

    .line 627
    .line 628
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    if-eqz v0, :cond_11

    .line 633
    .line 634
    move-object v10, v0

    .line 635
    check-cast v10, Ljava/lang/Boolean;

    .line 636
    .line 637
    goto :goto_10

    .line 638
    :cond_11
    const/4 v10, 0x0

    .line 639
    :goto_10
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    invoke-direct {v1, v2, v0}, Lqs4;-><init>(IZ)V

    .line 647
    .line 648
    .line 649
    return-object v1

    .line 650
    :pswitch_15
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    move-object/from16 v0, p1

    .line 654
    .line 655
    check-cast v0, Ljava/lang/Integer;

    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 658
    .line 659
    .line 660
    move-result v0

    .line 661
    new-instance v1, Lma2;

    .line 662
    .line 663
    invoke-direct {v1, v0}, Lma2;-><init>(I)V

    .line 664
    .line 665
    .line 666
    return-object v1

    .line 667
    :pswitch_16
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    move-object/from16 v0, p1

    .line 671
    .line 672
    check-cast v0, Ljava/lang/Integer;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 675
    .line 676
    .line 677
    move-result v0

    .line 678
    new-instance v1, Lh01;

    .line 679
    .line 680
    invoke-direct {v1, v0}, Lh01;-><init>(I)V

    .line 681
    .line 682
    .line 683
    return-object v1

    .line 684
    :pswitch_17
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-object/from16 v0, p1

    .line 688
    .line 689
    check-cast v0, Ljava/util/List;

    .line 690
    .line 691
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    if-eqz v1, :cond_12

    .line 696
    .line 697
    check-cast v1, Ljava/lang/Boolean;

    .line 698
    .line 699
    goto :goto_11

    .line 700
    :cond_12
    const/4 v1, 0x0

    .line 701
    :goto_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 713
    .line 714
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    sget-object v3, Lt54;->b:Lxc5;

    .line 719
    .line 720
    if-eqz v2, :cond_14

    .line 721
    .line 722
    :cond_13
    const/4 v10, 0x0

    .line 723
    goto :goto_12

    .line 724
    :cond_14
    if-eqz v0, :cond_13

    .line 725
    .line 726
    iget-object v2, v3, Lxc5;->p:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v2, Lif1;

    .line 729
    .line 730
    invoke-interface {v2, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v0

    .line 734
    move-object v10, v0

    .line 735
    check-cast v10, Lh01;

    .line 736
    .line 737
    :goto_12
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    iget v0, v10, Lh01;->a:I

    .line 741
    .line 742
    new-instance v2, Lzg3;

    .line 743
    .line 744
    invoke-direct {v2, v0, v1}, Lzg3;-><init>(IZ)V

    .line 745
    .line 746
    .line 747
    return-object v2

    .line 748
    :pswitch_18
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    move-object/from16 v0, p1

    .line 752
    .line 753
    check-cast v0, Ljava/util/List;

    .line 754
    .line 755
    new-instance v12, Lij4;

    .line 756
    .line 757
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v7

    .line 761
    sget v8, Lx40;->h:I

    .line 762
    .line 763
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 764
    .line 765
    invoke-static {v7, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    if-eqz v7, :cond_16

    .line 769
    .line 770
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v11

    .line 774
    if-eqz v11, :cond_15

    .line 775
    .line 776
    sget-wide v13, Lx40;->g:J

    .line 777
    .line 778
    new-instance v7, Lx40;

    .line 779
    .line 780
    invoke-direct {v7, v13, v14}, Lx40;-><init>(J)V

    .line 781
    .line 782
    .line 783
    goto :goto_13

    .line 784
    :cond_15
    check-cast v7, Ljava/lang/Integer;

    .line 785
    .line 786
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 787
    .line 788
    .line 789
    move-result v7

    .line 790
    invoke-static {v7}, Le35;->b(I)J

    .line 791
    .line 792
    .line 793
    move-result-wide v13

    .line 794
    new-instance v7, Lx40;

    .line 795
    .line 796
    invoke-direct {v7, v13, v14}, Lx40;-><init>(J)V

    .line 797
    .line 798
    .line 799
    goto :goto_13

    .line 800
    :cond_16
    const/4 v7, 0x0

    .line 801
    :goto_13
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    iget-wide v13, v7, Lx40;->a:J

    .line 805
    .line 806
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v7

    .line 810
    sget-object v9, Lbt4;->b:[Lct4;

    .line 811
    .line 812
    sget-object v9, Ls54;->v:Lr54;

    .line 813
    .line 814
    iget-object v9, v9, Lr54;->o:Lif1;

    .line 815
    .line 816
    invoke-static {v7, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 817
    .line 818
    .line 819
    if-eqz v7, :cond_17

    .line 820
    .line 821
    invoke-interface {v9, v7}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v7

    .line 825
    check-cast v7, Lbt4;

    .line 826
    .line 827
    goto :goto_14

    .line 828
    :cond_17
    const/4 v7, 0x0

    .line 829
    :goto_14
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    iget-wide v10, v7, Lbt4;->a:J

    .line 833
    .line 834
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 835
    .line 836
    .line 837
    move-result-object v6

    .line 838
    sget-object v7, Lgb1;->o:Lgb1;

    .line 839
    .line 840
    sget-object v7, Ls54;->m:Lxc5;

    .line 841
    .line 842
    invoke-static {v6, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v15

    .line 846
    if-eqz v15, :cond_19

    .line 847
    .line 848
    :cond_18
    const/16 v17, 0x0

    .line 849
    .line 850
    goto :goto_15

    .line 851
    :cond_19
    if-eqz v6, :cond_18

    .line 852
    .line 853
    iget-object v7, v7, Lxc5;->p:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v7, Lif1;

    .line 856
    .line 857
    invoke-interface {v7, v6}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v6

    .line 861
    check-cast v6, Lgb1;

    .line 862
    .line 863
    move-object/from16 v17, v6

    .line 864
    .line 865
    :goto_15
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    sget-object v6, Ls54;->t:Lxc5;

    .line 870
    .line 871
    invoke-static {v5, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    move-result v7

    .line 875
    if-eqz v7, :cond_1b

    .line 876
    .line 877
    :cond_1a
    const/16 v18, 0x0

    .line 878
    .line 879
    goto :goto_16

    .line 880
    :cond_1b
    if-eqz v5, :cond_1a

    .line 881
    .line 882
    iget-object v6, v6, Lxc5;->p:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v6, Lif1;

    .line 885
    .line 886
    invoke-interface {v6, v5}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v5

    .line 890
    check-cast v5, Leb1;

    .line 891
    .line 892
    move-object/from16 v18, v5

    .line 893
    .line 894
    :goto_16
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v4

    .line 898
    sget-object v5, Ls54;->u:Lxc5;

    .line 899
    .line 900
    invoke-static {v4, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v6

    .line 904
    if-eqz v6, :cond_1d

    .line 905
    .line 906
    :cond_1c
    const/16 v19, 0x0

    .line 907
    .line 908
    goto :goto_17

    .line 909
    :cond_1d
    if-eqz v4, :cond_1c

    .line 910
    .line 911
    iget-object v5, v5, Lxc5;->p:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v5, Lif1;

    .line 914
    .line 915
    invoke-interface {v5, v4}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v4

    .line 919
    check-cast v4, Lfb1;

    .line 920
    .line 921
    move-object/from16 v19, v4

    .line 922
    .line 923
    :goto_17
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    if-eqz v3, :cond_1e

    .line 928
    .line 929
    check-cast v3, Ljava/lang/String;

    .line 930
    .line 931
    move-object/from16 v21, v3

    .line 932
    .line 933
    goto :goto_18

    .line 934
    :cond_1e
    const/16 v21, 0x0

    .line 935
    .line 936
    :goto_18
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v2

    .line 940
    invoke-static {v2, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    if-eqz v2, :cond_1f

    .line 944
    .line 945
    invoke-interface {v9, v2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    check-cast v2, Lbt4;

    .line 950
    .line 951
    goto :goto_19

    .line 952
    :cond_1f
    const/4 v2, 0x0

    .line 953
    :goto_19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    iget-wide v2, v2, Lbt4;->a:J

    .line 957
    .line 958
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    sget-object v4, Ls54;->n:Lxc5;

    .line 963
    .line 964
    invoke-static {v1, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    move-result v5

    .line 968
    if-eqz v5, :cond_21

    .line 969
    .line 970
    :cond_20
    const/16 v24, 0x0

    .line 971
    .line 972
    goto :goto_1a

    .line 973
    :cond_21
    if-eqz v1, :cond_20

    .line 974
    .line 975
    iget-object v4, v4, Lxc5;->p:Ljava/lang/Object;

    .line 976
    .line 977
    check-cast v4, Lif1;

    .line 978
    .line 979
    invoke-interface {v4, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    check-cast v1, Lhr;

    .line 984
    .line 985
    move-object/from16 v24, v1

    .line 986
    .line 987
    :goto_1a
    const/16 v1, 0x9

    .line 988
    .line 989
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    sget-object v4, Ls54;->k:Lxc5;

    .line 994
    .line 995
    invoke-static {v1, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v5

    .line 999
    if-eqz v5, :cond_23

    .line 1000
    .line 1001
    :cond_22
    const/16 v25, 0x0

    .line 1002
    .line 1003
    goto :goto_1b

    .line 1004
    :cond_23
    if-eqz v1, :cond_22

    .line 1005
    .line 1006
    iget-object v4, v4, Lxc5;->p:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v4, Lif1;

    .line 1009
    .line 1010
    invoke-interface {v4, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    check-cast v1, Lbs4;

    .line 1015
    .line 1016
    move-object/from16 v25, v1

    .line 1017
    .line 1018
    :goto_1b
    const/16 v1, 0xa

    .line 1019
    .line 1020
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    sget-object v4, Lvd2;->p:Lvd2;

    .line 1025
    .line 1026
    sget-object v4, Ls54;->y:Lxc5;

    .line 1027
    .line 1028
    invoke-static {v1, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v5

    .line 1032
    if-eqz v5, :cond_25

    .line 1033
    .line 1034
    :cond_24
    const/16 v26, 0x0

    .line 1035
    .line 1036
    goto :goto_1c

    .line 1037
    :cond_25
    if-eqz v1, :cond_24

    .line 1038
    .line 1039
    iget-object v4, v4, Lxc5;->p:Ljava/lang/Object;

    .line 1040
    .line 1041
    check-cast v4, Lif1;

    .line 1042
    .line 1043
    invoke-interface {v4, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    check-cast v1, Lvd2;

    .line 1048
    .line 1049
    move-object/from16 v26, v1

    .line 1050
    .line 1051
    :goto_1c
    const/16 v1, 0xb

    .line 1052
    .line 1053
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    invoke-static {v1, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1058
    .line 1059
    .line 1060
    if-eqz v1, :cond_27

    .line 1061
    .line 1062
    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v4

    .line 1066
    if-eqz v4, :cond_26

    .line 1067
    .line 1068
    sget-wide v4, Lx40;->g:J

    .line 1069
    .line 1070
    new-instance v1, Lx40;

    .line 1071
    .line 1072
    invoke-direct {v1, v4, v5}, Lx40;-><init>(J)V

    .line 1073
    .line 1074
    .line 1075
    goto :goto_1d

    .line 1076
    :cond_26
    check-cast v1, Ljava/lang/Integer;

    .line 1077
    .line 1078
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    invoke-static {v1}, Le35;->b(I)J

    .line 1083
    .line 1084
    .line 1085
    move-result-wide v4

    .line 1086
    new-instance v1, Lx40;

    .line 1087
    .line 1088
    invoke-direct {v1, v4, v5}, Lx40;-><init>(J)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_1d

    .line 1092
    :cond_27
    const/4 v1, 0x0

    .line 1093
    :goto_1d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1094
    .line 1095
    .line 1096
    iget-wide v4, v1, Lx40;->a:J

    .line 1097
    .line 1098
    const/16 v1, 0xc

    .line 1099
    .line 1100
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    sget-object v6, Ls54;->j:Lxc5;

    .line 1105
    .line 1106
    invoke-static {v1, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v7

    .line 1110
    if-eqz v7, :cond_29

    .line 1111
    .line 1112
    :cond_28
    const/16 v29, 0x0

    .line 1113
    .line 1114
    goto :goto_1e

    .line 1115
    :cond_29
    if-eqz v1, :cond_28

    .line 1116
    .line 1117
    iget-object v6, v6, Lxc5;->p:Ljava/lang/Object;

    .line 1118
    .line 1119
    check-cast v6, Lif1;

    .line 1120
    .line 1121
    invoke-interface {v6, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v1

    .line 1125
    check-cast v1, Lsr4;

    .line 1126
    .line 1127
    move-object/from16 v29, v1

    .line 1128
    .line 1129
    :goto_1e
    const/16 v1, 0xd

    .line 1130
    .line 1131
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    sget-object v1, Lxb4;->d:Lxb4;

    .line 1136
    .line 1137
    sget-object v1, Ls54;->o:Lxc5;

    .line 1138
    .line 1139
    invoke-static {v0, v8}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1140
    .line 1141
    .line 1142
    move-result v6

    .line 1143
    if-eqz v6, :cond_2b

    .line 1144
    .line 1145
    :cond_2a
    const/16 v30, 0x0

    .line 1146
    .line 1147
    goto :goto_1f

    .line 1148
    :cond_2b
    if-eqz v0, :cond_2a

    .line 1149
    .line 1150
    iget-object v1, v1, Lxc5;->p:Ljava/lang/Object;

    .line 1151
    .line 1152
    check-cast v1, Lif1;

    .line 1153
    .line 1154
    invoke-interface {v1, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    check-cast v0, Lxb4;

    .line 1159
    .line 1160
    move-object/from16 v30, v0

    .line 1161
    .line 1162
    :goto_1f
    const v31, 0xc020

    .line 1163
    .line 1164
    .line 1165
    const/16 v20, 0x0

    .line 1166
    .line 1167
    move-wide/from16 v22, v2

    .line 1168
    .line 1169
    move-wide/from16 v27, v4

    .line 1170
    .line 1171
    move-wide v15, v10

    .line 1172
    invoke-direct/range {v12 .. v31}, Lij4;-><init>(JJLgb1;Leb1;Lfb1;Lvk0;Ljava/lang/String;JLhr;Lbs4;Lvd2;JLsr4;Lxb4;I)V

    .line 1173
    .line 1174
    .line 1175
    return-object v12

    .line 1176
    :pswitch_19
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    .line 1178
    .line 1179
    move-object/from16 v0, p1

    .line 1180
    .line 1181
    check-cast v0, Ljava/util/List;

    .line 1182
    .line 1183
    new-instance v12, Lsd3;

    .line 1184
    .line 1185
    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v7

    .line 1189
    sget-object v8, Ls54;->q:Lr54;

    .line 1190
    .line 1191
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1192
    .line 1193
    invoke-static {v7, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1194
    .line 1195
    .line 1196
    if-eqz v7, :cond_2c

    .line 1197
    .line 1198
    iget-object v8, v8, Lr54;->o:Lif1;

    .line 1199
    .line 1200
    invoke-interface {v8, v7}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v7

    .line 1204
    check-cast v7, Lmr4;

    .line 1205
    .line 1206
    goto :goto_20

    .line 1207
    :cond_2c
    const/4 v7, 0x0

    .line 1208
    :goto_20
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    iget v13, v7, Lmr4;->a:I

    .line 1212
    .line 1213
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v7

    .line 1217
    sget-object v8, Ls54;->r:Lr54;

    .line 1218
    .line 1219
    invoke-static {v7, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1220
    .line 1221
    .line 1222
    if-eqz v7, :cond_2d

    .line 1223
    .line 1224
    iget-object v8, v8, Lr54;->o:Lif1;

    .line 1225
    .line 1226
    invoke-interface {v8, v7}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v7

    .line 1230
    check-cast v7, Lur4;

    .line 1231
    .line 1232
    goto :goto_21

    .line 1233
    :cond_2d
    const/4 v7, 0x0

    .line 1234
    :goto_21
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    iget v14, v7, Lur4;->a:I

    .line 1238
    .line 1239
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v6

    .line 1243
    sget-object v7, Lbt4;->b:[Lct4;

    .line 1244
    .line 1245
    sget-object v7, Ls54;->v:Lr54;

    .line 1246
    .line 1247
    invoke-static {v6, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1248
    .line 1249
    .line 1250
    if-eqz v6, :cond_2e

    .line 1251
    .line 1252
    iget-object v7, v7, Lr54;->o:Lif1;

    .line 1253
    .line 1254
    invoke-interface {v7, v6}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v6

    .line 1258
    check-cast v6, Lbt4;

    .line 1259
    .line 1260
    goto :goto_22

    .line 1261
    :cond_2e
    const/4 v6, 0x0

    .line 1262
    :goto_22
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1263
    .line 1264
    .line 1265
    iget-wide v6, v6, Lbt4;->a:J

    .line 1266
    .line 1267
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1268
    .line 1269
    .line 1270
    move-result-object v5

    .line 1271
    sget-object v8, Lcs4;->c:Lcs4;

    .line 1272
    .line 1273
    sget-object v8, Ls54;->l:Lxc5;

    .line 1274
    .line 1275
    invoke-static {v5, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1276
    .line 1277
    .line 1278
    move-result v9

    .line 1279
    if-eqz v9, :cond_30

    .line 1280
    .line 1281
    :cond_2f
    const/16 v17, 0x0

    .line 1282
    .line 1283
    goto :goto_23

    .line 1284
    :cond_30
    if-eqz v5, :cond_2f

    .line 1285
    .line 1286
    iget-object v8, v8, Lxc5;->p:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v8, Lif1;

    .line 1289
    .line 1290
    invoke-interface {v8, v5}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v5

    .line 1294
    check-cast v5, Lcs4;

    .line 1295
    .line 1296
    move-object/from16 v17, v5

    .line 1297
    .line 1298
    :goto_23
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v4

    .line 1302
    invoke-static {v4, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v5

    .line 1306
    sget-object v8, Lt54;->a:Lxc5;

    .line 1307
    .line 1308
    if-eqz v5, :cond_32

    .line 1309
    .line 1310
    :cond_31
    const/16 v18, 0x0

    .line 1311
    .line 1312
    goto :goto_24

    .line 1313
    :cond_32
    if-eqz v4, :cond_31

    .line 1314
    .line 1315
    iget-object v5, v8, Lxc5;->p:Ljava/lang/Object;

    .line 1316
    .line 1317
    check-cast v5, Lif1;

    .line 1318
    .line 1319
    invoke-interface {v5, v4}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v4

    .line 1323
    check-cast v4, Lzg3;

    .line 1324
    .line 1325
    move-object/from16 v18, v4

    .line 1326
    .line 1327
    :goto_24
    const/4 v4, 0x5

    .line 1328
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    sget-object v5, Lra2;->d:Lra2;

    .line 1333
    .line 1334
    sget-object v5, Ls54;->A:Lxc5;

    .line 1335
    .line 1336
    invoke-static {v4, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v8

    .line 1340
    if-eqz v8, :cond_34

    .line 1341
    .line 1342
    :cond_33
    const/16 v19, 0x0

    .line 1343
    .line 1344
    goto :goto_25

    .line 1345
    :cond_34
    if-eqz v4, :cond_33

    .line 1346
    .line 1347
    iget-object v5, v5, Lxc5;->p:Ljava/lang/Object;

    .line 1348
    .line 1349
    check-cast v5, Lif1;

    .line 1350
    .line 1351
    invoke-interface {v5, v4}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v4

    .line 1355
    check-cast v4, Lra2;

    .line 1356
    .line 1357
    move-object/from16 v19, v4

    .line 1358
    .line 1359
    :goto_25
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v3

    .line 1363
    invoke-static {v3, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v4

    .line 1367
    sget-object v5, Lt54;->c:Lxc5;

    .line 1368
    .line 1369
    if-eqz v4, :cond_36

    .line 1370
    .line 1371
    :cond_35
    const/4 v3, 0x0

    .line 1372
    goto :goto_26

    .line 1373
    :cond_36
    if-eqz v3, :cond_35

    .line 1374
    .line 1375
    iget-object v4, v5, Lxc5;->p:Ljava/lang/Object;

    .line 1376
    .line 1377
    check-cast v4, Lif1;

    .line 1378
    .line 1379
    invoke-interface {v4, v3}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v3

    .line 1383
    check-cast v3, Lma2;

    .line 1384
    .line 1385
    :goto_26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1386
    .line 1387
    .line 1388
    iget v3, v3, Lma2;->a:I

    .line 1389
    .line 1390
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v2

    .line 1394
    sget-object v4, Ls54;->s:Lr54;

    .line 1395
    .line 1396
    invoke-static {v2, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1397
    .line 1398
    .line 1399
    if-eqz v2, :cond_37

    .line 1400
    .line 1401
    iget-object v4, v4, Lr54;->o:Lif1;

    .line 1402
    .line 1403
    invoke-interface {v4, v2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v2

    .line 1407
    check-cast v2, Ldu1;

    .line 1408
    .line 1409
    goto :goto_27

    .line 1410
    :cond_37
    const/4 v2, 0x0

    .line 1411
    :goto_27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1412
    .line 1413
    .line 1414
    iget v2, v2, Ldu1;->a:I

    .line 1415
    .line 1416
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v0

    .line 1420
    invoke-static {v0, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1421
    .line 1422
    .line 1423
    move-result v1

    .line 1424
    sget-object v4, Lt54;->d:Lxc5;

    .line 1425
    .line 1426
    if-eqz v1, :cond_39

    .line 1427
    .line 1428
    :cond_38
    move/from16 v21, v2

    .line 1429
    .line 1430
    move/from16 v20, v3

    .line 1431
    .line 1432
    move-wide v15, v6

    .line 1433
    const/16 v22, 0x0

    .line 1434
    .line 1435
    goto :goto_28

    .line 1436
    :cond_39
    if-eqz v0, :cond_38

    .line 1437
    .line 1438
    iget-object v1, v4, Lxc5;->p:Ljava/lang/Object;

    .line 1439
    .line 1440
    check-cast v1, Lif1;

    .line 1441
    .line 1442
    invoke-interface {v1, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    move-object v10, v0

    .line 1447
    check-cast v10, Lqs4;

    .line 1448
    .line 1449
    move/from16 v21, v2

    .line 1450
    .line 1451
    move/from16 v20, v3

    .line 1452
    .line 1453
    move-wide v15, v6

    .line 1454
    move-object/from16 v22, v10

    .line 1455
    .line 1456
    :goto_28
    invoke-direct/range {v12 .. v22}, Lsd3;-><init>(IIJLcs4;Lzg3;Lra2;IILqs4;)V

    .line 1457
    .line 1458
    .line 1459
    return-object v12

    .line 1460
    :pswitch_1a
    new-instance v0, Lv25;

    .line 1461
    .line 1462
    if-eqz p1, :cond_3a

    .line 1463
    .line 1464
    move-object/from16 v10, p1

    .line 1465
    .line 1466
    check-cast v10, Ljava/lang/String;

    .line 1467
    .line 1468
    goto :goto_29

    .line 1469
    :cond_3a
    const/4 v10, 0x0

    .line 1470
    :goto_29
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1471
    .line 1472
    .line 1473
    invoke-direct {v0, v10}, Lv25;-><init>(Ljava/lang/String;)V

    .line 1474
    .line 1475
    .line 1476
    return-object v0

    .line 1477
    :pswitch_1b
    new-instance v0, Lp45;

    .line 1478
    .line 1479
    if-eqz p1, :cond_3b

    .line 1480
    .line 1481
    move-object/from16 v10, p1

    .line 1482
    .line 1483
    check-cast v10, Ljava/lang/String;

    .line 1484
    .line 1485
    goto :goto_2a

    .line 1486
    :cond_3b
    const/4 v10, 0x0

    .line 1487
    :goto_2a
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    invoke-direct {v0, v10}, Lp45;-><init>(Ljava/lang/String;)V

    .line 1491
    .line 1492
    .line 1493
    return-object v0

    .line 1494
    :pswitch_1c
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    move-object/from16 v0, p1

    .line 1498
    .line 1499
    check-cast v0, Ljava/lang/Integer;

    .line 1500
    .line 1501
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1502
    .line 1503
    .line 1504
    move-result v0

    .line 1505
    new-instance v1, Lpa2;

    .line 1506
    .line 1507
    invoke-direct {v1, v0}, Lpa2;-><init>(I)V

    .line 1508
    .line 1509
    .line 1510
    return-object v1

    .line 1511
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
