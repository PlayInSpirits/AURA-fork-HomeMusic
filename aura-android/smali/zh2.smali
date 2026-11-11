.class public final synthetic Lzh2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lzh2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltv1;)V
    .locals 0

    .line 1
    const/16 p1, 0x1a

    .line 2
    .line 3
    iput p1, p0, Lzh2;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lzh2;->a:I

    .line 4
    .line 5
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    .line 6
    .line 7
    const-wide v3, 0x4055400000000000L    # 85.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    const-wide v6, 0x4058800000000000L    # 98.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    .line 19
    .line 20
    const-wide/high16 v10, 0x4054000000000000L    # 80.0

    .line 21
    .line 22
    const-wide/16 v12, 0x0

    .line 23
    .line 24
    const-wide/high16 v14, 0x4018000000000000L    # 6.0

    .line 25
    .line 26
    const-wide v16, 0x4056800000000000L    # 90.0

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const-wide/high16 v18, 0x403e000000000000L    # 30.0

    .line 32
    .line 33
    packed-switch v0, :pswitch_data_0

    .line 34
    .line 35
    .line 36
    move-object/from16 v0, p1

    .line 37
    .line 38
    check-cast v0, Ld64;

    .line 39
    .line 40
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_0
    move-object/from16 v0, p1

    .line 44
    .line 45
    check-cast v0, Ld64;

    .line 46
    .line 47
    iget-boolean v0, v0, Ld64;->c:Z

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    move-wide/from16 v10, v18

    .line 52
    .line 53
    :cond_0
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :pswitch_1
    move-object/from16 v0, p1

    .line 59
    .line 60
    check-cast v0, Ld64;

    .line 61
    .line 62
    iget-object v0, v0, Ld64;->i:Ltu4;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_2
    move-object/from16 v0, p1

    .line 66
    .line 67
    check-cast v0, Ld64;

    .line 68
    .line 69
    new-instance v0, Lzh2;

    .line 70
    .line 71
    const/16 v1, 0x13

    .line 72
    .line 73
    invoke-direct {v0, v1}, Lzh2;-><init>(I)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Lzh2;

    .line 77
    .line 78
    const/16 v2, 0x14

    .line 79
    .line 80
    invoke-direct {v1, v2}, Lzh2;-><init>(I)V

    .line 81
    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    invoke-static {v0, v1, v2, v2}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :pswitch_3
    move-object/from16 v0, p1

    .line 90
    .line 91
    check-cast v0, Ld64;

    .line 92
    .line 93
    iget-boolean v0, v0, Ld64;->c:Z

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    move-wide/from16 v8, v16

    .line 98
    .line 99
    :cond_1
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_4
    move-object/from16 v0, p1

    .line 105
    .line 106
    check-cast v0, Ld64;

    .line 107
    .line 108
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_5
    move-object/from16 v0, p1

    .line 112
    .line 113
    check-cast v0, Ld64;

    .line 114
    .line 115
    iget-boolean v0, v0, Ld64;->c:Z

    .line 116
    .line 117
    if-eqz v0, :cond_2

    .line 118
    .line 119
    const-wide/high16 v0, 0x4031000000000000L    # 17.0

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    const-wide/high16 v0, 0x4057000000000000L    # 92.0

    .line 123
    .line 124
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    return-object v0

    .line 129
    :pswitch_6
    move-object/from16 v0, p1

    .line 130
    .line 131
    check-cast v0, Ld64;

    .line 132
    .line 133
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_7
    move-object/from16 v0, p1

    .line 137
    .line 138
    check-cast v0, Ld64;

    .line 139
    .line 140
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_8
    move-object/from16 v0, p1

    .line 144
    .line 145
    check-cast v0, Ld64;

    .line 146
    .line 147
    iget-boolean v0, v0, Ld64;->c:Z

    .line 148
    .line 149
    if-eqz v0, :cond_3

    .line 150
    .line 151
    move-wide v6, v14

    .line 152
    :cond_3
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_9
    move-object/from16 v0, p1

    .line 158
    .line 159
    check-cast v0, Ld64;

    .line 160
    .line 161
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_a
    move-object/from16 v0, p1

    .line 165
    .line 166
    check-cast v0, Ld64;

    .line 167
    .line 168
    invoke-static {v0}, Ltv1;->B(Ld64;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_4

    .line 173
    .line 174
    iget-object v1, v0, Ld64;->a:Lol1;

    .line 175
    .line 176
    invoke-static {v1, v0}, Ltv1;->D(Lol1;Ld64;)D

    .line 177
    .line 178
    .line 179
    move-result-wide v0

    .line 180
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    goto :goto_2

    .line 185
    :cond_4
    iget v1, v0, Ld64;->b:I

    .line 186
    .line 187
    iget-boolean v0, v0, Ld64;->c:Z

    .line 188
    .line 189
    if-ne v1, v5, :cond_6

    .line 190
    .line 191
    if-eqz v0, :cond_5

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_5
    const-wide/high16 v3, 0x4039000000000000L    # 25.0

    .line 195
    .line 196
    :goto_1
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    goto :goto_2

    .line 201
    :cond_6
    if-eqz v0, :cond_7

    .line 202
    .line 203
    move-wide/from16 v16, v18

    .line 204
    .line 205
    :cond_7
    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_2
    return-object v0

    .line 210
    :pswitch_b
    move-object/from16 v0, p1

    .line 211
    .line 212
    check-cast v0, Ld64;

    .line 213
    .line 214
    iget-object v0, v0, Ld64;->e:Ltu4;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_c
    move-object/from16 v1, p1

    .line 218
    .line 219
    check-cast v1, Ld64;

    .line 220
    .line 221
    new-instance v2, Lm7;

    .line 222
    .line 223
    const/16 v0, 0x1d

    .line 224
    .line 225
    invoke-direct {v2, v0}, Lm7;-><init>(I)V

    .line 226
    .line 227
    .line 228
    new-instance v3, Lzx0;

    .line 229
    .line 230
    const/4 v0, 0x2

    .line 231
    invoke-direct {v3, v1, v0}, Lzx0;-><init>(Ld64;I)V

    .line 232
    .line 233
    .line 234
    new-instance v4, Lay0;

    .line 235
    .line 236
    const/4 v5, 0x0

    .line 237
    invoke-direct {v4, v5, v1}, Lay0;-><init>(Ljava/util/function/Function;Ld64;)V

    .line 238
    .line 239
    .line 240
    const/4 v7, 0x0

    .line 241
    const/4 v8, 0x0

    .line 242
    move-object v6, v5

    .line 243
    invoke-static/range {v1 .. v8}, Lgy0;->a(Ld64;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;Ldy0;Ljava/util/function/Function;)D

    .line 244
    .line 245
    .line 246
    move-result-wide v0

    .line 247
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :pswitch_d
    move-object/from16 v1, p1

    .line 253
    .line 254
    check-cast v1, Ld64;

    .line 255
    .line 256
    new-instance v2, Lzh2;

    .line 257
    .line 258
    const/4 v0, 0x0

    .line 259
    invoke-direct {v2, v0}, Lzh2;-><init>(I)V

    .line 260
    .line 261
    .line 262
    new-instance v3, Lzx0;

    .line 263
    .line 264
    invoke-direct {v3, v1, v5}, Lzx0;-><init>(Ld64;I)V

    .line 265
    .line 266
    .line 267
    new-instance v4, Lby0;

    .line 268
    .line 269
    const/4 v5, 0x0

    .line 270
    invoke-direct {v4, v2, v1, v5}, Lby0;-><init>(Ljava/util/function/Function;Ld64;Ljava/util/function/Function;)V

    .line 271
    .line 272
    .line 273
    new-instance v8, Lm7;

    .line 274
    .line 275
    const/16 v0, 0x17

    .line 276
    .line 277
    invoke-direct {v8, v0}, Lm7;-><init>(I)V

    .line 278
    .line 279
    .line 280
    const/4 v7, 0x0

    .line 281
    move-object v6, v5

    .line 282
    invoke-static/range {v1 .. v8}, Lgy0;->a(Ld64;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;Ldy0;Ljava/util/function/Function;)D

    .line 283
    .line 284
    .line 285
    move-result-wide v0

    .line 286
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    return-object v0

    .line 291
    :pswitch_e
    move-object/from16 v0, p1

    .line 292
    .line 293
    check-cast v0, Ld64;

    .line 294
    .line 295
    iget-boolean v0, v0, Ld64;->c:Z

    .line 296
    .line 297
    if-eqz v0, :cond_8

    .line 298
    .line 299
    const-wide v0, 0x3fc999999999999aL    # 0.2

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_8
    const-wide v0, 0x3fbeb851eb851eb8L    # 0.12

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    return-object v0

    .line 315
    :pswitch_f
    move-object/from16 v0, p1

    .line 316
    .line 317
    check-cast v0, Ld64;

    .line 318
    .line 319
    iget-boolean v0, v0, Ld64;->c:Z

    .line 320
    .line 321
    if-eqz v0, :cond_9

    .line 322
    .line 323
    goto :goto_4

    .line 324
    :cond_9
    move-wide v1, v12

    .line 325
    :goto_4
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    return-object v0

    .line 330
    :pswitch_10
    move-object/from16 v0, p1

    .line 331
    .line 332
    check-cast v0, Ld64;

    .line 333
    .line 334
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    return-object v0

    .line 339
    :pswitch_11
    move-object/from16 v0, p1

    .line 340
    .line 341
    check-cast v0, Ld64;

    .line 342
    .line 343
    iget-boolean v0, v0, Ld64;->c:Z

    .line 344
    .line 345
    if-eqz v0, :cond_a

    .line 346
    .line 347
    move-wide v6, v14

    .line 348
    :cond_a
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    return-object v0

    .line 353
    :pswitch_12
    move-object/from16 v0, p1

    .line 354
    .line 355
    check-cast v0, Ld64;

    .line 356
    .line 357
    invoke-static {v0}, Ltv1;->C(Ld64;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    iget-object v2, v0, Ld64;->f:Ltu4;

    .line 362
    .line 363
    iget-boolean v5, v0, Ld64;->c:Z

    .line 364
    .line 365
    if-eqz v1, :cond_c

    .line 366
    .line 367
    if-eqz v5, :cond_b

    .line 368
    .line 369
    move-wide/from16 v3, v18

    .line 370
    .line 371
    :cond_b
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    goto/16 :goto_a

    .line 376
    .line 377
    :cond_c
    if-eqz v5, :cond_d

    .line 378
    .line 379
    move-wide/from16 v10, v18

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_d
    move-wide/from16 v10, v16

    .line 383
    .line 384
    :goto_5
    invoke-static {v0}, Ltv1;->B(Ld64;)Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-nez v1, :cond_e

    .line 389
    .line 390
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    goto/16 :goto_a

    .line 395
    .line 396
    :cond_e
    iget-wide v6, v2, Ltu4;->a:D

    .line 397
    .line 398
    iget-wide v8, v2, Ltu4;->b:D

    .line 399
    .line 400
    invoke-static/range {v6 .. v11}, Lol1;->a(DDD)Lol1;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    iget-wide v3, v1, Lol1;->b:D

    .line 405
    .line 406
    cmpg-double v12, v3, v8

    .line 407
    .line 408
    if-gez v12, :cond_11

    .line 409
    .line 410
    :goto_6
    iget-wide v12, v1, Lol1;->b:D

    .line 411
    .line 412
    cmpg-double v12, v12, v8

    .line 413
    .line 414
    if-gez v12, :cond_11

    .line 415
    .line 416
    if-nez v5, :cond_f

    .line 417
    .line 418
    const-wide/high16 v12, -0x4010000000000000L    # -1.0

    .line 419
    .line 420
    goto :goto_7

    .line 421
    :cond_f
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 422
    .line 423
    :goto_7
    add-double/2addr v10, v12

    .line 424
    invoke-static/range {v6 .. v11}, Lol1;->a(DDD)Lol1;

    .line 425
    .line 426
    .line 427
    move-result-object v12

    .line 428
    iget-wide v13, v12, Lol1;->b:D

    .line 429
    .line 430
    cmpl-double v15, v3, v13

    .line 431
    .line 432
    if-lez v15, :cond_10

    .line 433
    .line 434
    goto :goto_8

    .line 435
    :cond_10
    sub-double/2addr v13, v8

    .line 436
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 437
    .line 438
    .line 439
    move-result-wide v13

    .line 440
    const-wide v15, 0x3fd999999999999aL    # 0.4

    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    cmpg-double v13, v13, v15

    .line 446
    .line 447
    if-gez v13, :cond_12

    .line 448
    .line 449
    :cond_11
    :goto_8
    move-wide/from16 v20, v10

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_12
    iget-wide v13, v12, Lol1;->b:D

    .line 453
    .line 454
    sub-double/2addr v13, v8

    .line 455
    invoke-static {v13, v14}, Ljava/lang/Math;->abs(D)D

    .line 456
    .line 457
    .line 458
    move-result-wide v13

    .line 459
    move v15, v5

    .line 460
    move-wide/from16 p0, v6

    .line 461
    .line 462
    iget-wide v5, v1, Lol1;->b:D

    .line 463
    .line 464
    sub-double/2addr v5, v8

    .line 465
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 466
    .line 467
    .line 468
    move-result-wide v5

    .line 469
    cmpg-double v5, v13, v5

    .line 470
    .line 471
    if-gez v5, :cond_13

    .line 472
    .line 473
    move-object v1, v12

    .line 474
    :cond_13
    iget-wide v5, v12, Lol1;->b:D

    .line 475
    .line 476
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 477
    .line 478
    .line 479
    move-result-wide v3

    .line 480
    move-wide/from16 v6, p0

    .line 481
    .line 482
    move v5, v15

    .line 483
    goto :goto_6

    .line 484
    :goto_9
    iget-wide v3, v2, Ltu4;->a:D

    .line 485
    .line 486
    iget-wide v1, v2, Ltu4;->b:D

    .line 487
    .line 488
    move-wide/from16 v18, v1

    .line 489
    .line 490
    move-wide/from16 v16, v3

    .line 491
    .line 492
    invoke-static/range {v16 .. v21}, Lol1;->a(DDD)Lol1;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-static {v1, v0}, Ltv1;->D(Lol1;Ld64;)D

    .line 497
    .line 498
    .line 499
    move-result-wide v0

    .line 500
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    :goto_a
    return-object v0

    .line 505
    :pswitch_13
    move-object/from16 v0, p1

    .line 506
    .line 507
    check-cast v0, Ld64;

    .line 508
    .line 509
    iget-object v0, v0, Ld64;->f:Ltu4;

    .line 510
    .line 511
    return-object v0

    .line 512
    :pswitch_14
    move-object/from16 v0, p1

    .line 513
    .line 514
    check-cast v0, Ld64;

    .line 515
    .line 516
    iget-boolean v0, v0, Ld64;->c:Z

    .line 517
    .line 518
    if-eqz v0, :cond_14

    .line 519
    .line 520
    goto :goto_b

    .line 521
    :cond_14
    const-wide/high16 v8, 0x4058000000000000L    # 96.0

    .line 522
    .line 523
    :goto_b
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    return-object v0

    .line 528
    :pswitch_15
    move-object/from16 v0, p1

    .line 529
    .line 530
    check-cast v0, Ld64;

    .line 531
    .line 532
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_16
    move-object/from16 v0, p1

    .line 536
    .line 537
    check-cast v0, Ld64;

    .line 538
    .line 539
    iget-boolean v0, v0, Ld64;->c:Z

    .line 540
    .line 541
    if-eqz v0, :cond_15

    .line 542
    .line 543
    move-wide/from16 v16, v18

    .line 544
    .line 545
    :cond_15
    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    return-object v0

    .line 550
    :pswitch_17
    move-object/from16 v0, p1

    .line 551
    .line 552
    check-cast v0, Ld64;

    .line 553
    .line 554
    iget-object v0, v0, Ld64;->e:Ltu4;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_18
    move-object/from16 v0, p1

    .line 558
    .line 559
    check-cast v0, Ld64;

    .line 560
    .line 561
    iget-boolean v0, v0, Ld64;->c:Z

    .line 562
    .line 563
    if-eqz v0, :cond_16

    .line 564
    .line 565
    goto :goto_c

    .line 566
    :cond_16
    move-wide/from16 v10, v18

    .line 567
    .line 568
    :goto_c
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    return-object v0

    .line 573
    :pswitch_19
    move-object/from16 v0, p1

    .line 574
    .line 575
    check-cast v0, Ld64;

    .line 576
    .line 577
    iget-object v0, v0, Ld64;->i:Ltu4;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_1a
    move-object/from16 v0, p1

    .line 581
    .line 582
    check-cast v0, Ld64;

    .line 583
    .line 584
    iget-boolean v0, v0, Ld64;->c:Z

    .line 585
    .line 586
    if-eqz v0, :cond_17

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_17
    const-wide v14, 0x4055c00000000000L    # 87.0

    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    :goto_d
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    return-object v0

    .line 599
    :pswitch_1b
    move-object/from16 v0, p1

    .line 600
    .line 601
    check-cast v0, Ld64;

    .line 602
    .line 603
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_1c
    move-object/from16 v0, p1

    .line 607
    .line 608
    check-cast v0, Ld64;

    .line 609
    .line 610
    iget-boolean v0, v0, Ld64;->c:Z

    .line 611
    .line 612
    if-eqz v0, :cond_18

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :cond_18
    move-wide v1, v12

    .line 616
    :goto_e
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    return-object v0

    .line 621
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
