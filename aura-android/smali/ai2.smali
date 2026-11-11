.class public final synthetic Lai2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Lai2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltv1;)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    .line 2
    iput p1, p0, Lai2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Lai2;->a:I

    .line 4
    .line 5
    const-wide/high16 v1, 0x403e000000000000L    # 30.0

    .line 6
    .line 7
    const-wide/high16 v3, 0x4044000000000000L    # 40.0

    .line 8
    .line 9
    const-wide/high16 v5, 0x4054000000000000L    # 80.0

    .line 10
    .line 11
    const-wide/high16 v7, 0x404e000000000000L    # 60.0

    .line 12
    .line 13
    const-wide/high16 v9, 0x4034000000000000L    # 20.0

    .line 14
    .line 15
    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    .line 16
    .line 17
    const-wide/high16 v13, 0x4024000000000000L    # 10.0

    .line 18
    .line 19
    const-wide v15, 0x4056800000000000L    # 90.0

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, Ld64;

    .line 30
    .line 31
    iget-boolean v0, v0, Ld64;->c:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-wide/high16 v7, 0x4049000000000000L    # 50.0

    .line 37
    .line 38
    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    .line 40
    .line 41
    move-result-object v0

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
    iget-object v0, v0, Ld64;->i:Ltu4;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    move-object/from16 v0, p1

    .line 51
    .line 52
    check-cast v0, Ld64;

    .line 53
    .line 54
    iget-boolean v0, v0, Ld64;->c:Z

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    const-wide/high16 v11, 0x4010000000000000L    # 4.0

    .line 59
    .line 60
    :cond_1
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 61
    .line 62
    .line 63
    move-result-object v0

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
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_3
    move-object/from16 v0, p1

    .line 73
    .line 74
    check-cast v0, Ld64;

    .line 75
    .line 76
    iget-boolean v0, v0, Ld64;->c:Z

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    move-wide v3, v5

    .line 81
    :cond_2
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :pswitch_4
    move-object/from16 v0, p1

    .line 87
    .line 88
    check-cast v0, Ld64;

    .line 89
    .line 90
    iget-object v0, v0, Ld64;->f:Ltu4;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_5
    move-object/from16 v0, p1

    .line 94
    .line 95
    check-cast v0, Ld64;

    .line 96
    .line 97
    invoke-static {v0}, Ltv1;->C(Ld64;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    iget-boolean v0, v0, Ld64;->c:Z

    .line 102
    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    move-wide v11, v13

    .line 108
    :cond_3
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_2

    .line 113
    :cond_4
    if-eqz v0, :cond_5

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    move-wide v9, v11

    .line 117
    :goto_1
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :goto_2
    return-object v0

    .line 122
    :pswitch_6
    move-object/from16 v0, p1

    .line 123
    .line 124
    check-cast v0, Ld64;

    .line 125
    .line 126
    iget-object v0, v0, Ld64;->f:Ltu4;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_7
    move-object/from16 v0, p1

    .line 130
    .line 131
    check-cast v0, Ld64;

    .line 132
    .line 133
    invoke-static {v0}, Ltv1;->C(Ld64;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    iget-boolean v0, v0, Ld64;->c:Z

    .line 138
    .line 139
    if-eqz v1, :cond_7

    .line 140
    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_6
    move-wide v13, v15

    .line 145
    :goto_3
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    goto :goto_5

    .line 150
    :cond_7
    if-eqz v0, :cond_8

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    move-wide v9, v11

    .line 154
    :goto_4
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :goto_5
    return-object v0

    .line 159
    :pswitch_8
    move-object/from16 v0, p1

    .line 160
    .line 161
    check-cast v0, Ld64;

    .line 162
    .line 163
    invoke-static {v0}, Ltv1;->C(Ld64;)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    iget-object v4, v0, Ld64;->g:Ltu4;

    .line 168
    .line 169
    iget-boolean v5, v0, Ld64;->c:Z

    .line 170
    .line 171
    if-eqz v3, :cond_a

    .line 172
    .line 173
    if-eqz v5, :cond_9

    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_9
    const-wide v7, 0x4048800000000000L    # 49.0

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    :goto_6
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    goto :goto_8

    .line 186
    :cond_a
    invoke-static {v0}, Ltv1;->B(Ld64;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-nez v3, :cond_c

    .line 191
    .line 192
    if-eqz v5, :cond_b

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_b
    move-wide v1, v15

    .line 196
    :goto_7
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    goto :goto_8

    .line 201
    :cond_c
    iget-object v1, v0, Ld64;->a:Lol1;

    .line 202
    .line 203
    iget-wide v9, v1, Lol1;->c:D

    .line 204
    .line 205
    iget-wide v5, v4, Ltu4;->a:D

    .line 206
    .line 207
    iget-wide v7, v4, Ltu4;->b:D

    .line 208
    .line 209
    invoke-static/range {v5 .. v10}, Lol1;->a(DDD)Lol1;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v1, v0}, Ltv1;->D(Lol1;Ld64;)D

    .line 214
    .line 215
    .line 216
    move-result-wide v9

    .line 217
    iget-wide v5, v4, Ltu4;->a:D

    .line 218
    .line 219
    iget-wide v7, v4, Ltu4;->b:D

    .line 220
    .line 221
    invoke-static/range {v5 .. v10}, Lol1;->a(DDD)Lol1;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0}, Lvr1;->q(Lol1;)Lol1;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iget-wide v0, v0, Lol1;->c:D

    .line 230
    .line 231
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    :goto_8
    return-object v0

    .line 236
    :pswitch_9
    move-object/from16 v0, p1

    .line 237
    .line 238
    check-cast v0, Ld64;

    .line 239
    .line 240
    iget-object v0, v0, Ld64;->g:Ltu4;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_a
    move-object/from16 v0, p1

    .line 244
    .line 245
    check-cast v0, Ld64;

    .line 246
    .line 247
    iget-boolean v0, v0, Ld64;->c:Z

    .line 248
    .line 249
    if-eqz v0, :cond_d

    .line 250
    .line 251
    const-wide/high16 v15, 0x4036000000000000L    # 22.0

    .line 252
    .line 253
    :cond_d
    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    return-object v0

    .line 258
    :pswitch_b
    move-object/from16 v0, p1

    .line 259
    .line 260
    check-cast v0, Ld64;

    .line 261
    .line 262
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_c
    move-object/from16 v0, p1

    .line 266
    .line 267
    check-cast v0, Ld64;

    .line 268
    .line 269
    iget-boolean v0, v0, Ld64;->c:Z

    .line 270
    .line 271
    if-eqz v0, :cond_e

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_e
    move-wide v13, v15

    .line 275
    :goto_9
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0

    .line 280
    :pswitch_d
    move-object/from16 v0, p1

    .line 281
    .line 282
    check-cast v0, Ld64;

    .line 283
    .line 284
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_e
    move-object/from16 v0, p1

    .line 288
    .line 289
    check-cast v0, Ld64;

    .line 290
    .line 291
    iget-boolean v0, v0, Ld64;->c:Z

    .line 292
    .line 293
    if-eqz v0, :cond_f

    .line 294
    .line 295
    goto :goto_a

    .line 296
    :cond_f
    move-wide v1, v15

    .line 297
    :goto_a
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0

    .line 302
    :pswitch_f
    move-object/from16 v0, p1

    .line 303
    .line 304
    check-cast v0, Ld64;

    .line 305
    .line 306
    iget-object v0, v0, Ld64;->i:Ltu4;

    .line 307
    .line 308
    return-object v0

    .line 309
    :pswitch_10
    move-object/from16 v0, p1

    .line 310
    .line 311
    check-cast v0, Ld64;

    .line 312
    .line 313
    iget-object v0, v0, Ld64;->g:Ltu4;

    .line 314
    .line 315
    return-object v0

    .line 316
    :pswitch_11
    move-object/from16 v0, p1

    .line 317
    .line 318
    check-cast v0, Ld64;

    .line 319
    .line 320
    iget-object v0, v0, Ld64;->e:Ltu4;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_12
    move-object/from16 v0, p1

    .line 324
    .line 325
    check-cast v0, Ld64;

    .line 326
    .line 327
    iget-boolean v0, v0, Ld64;->c:Z

    .line 328
    .line 329
    if-eqz v0, :cond_10

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_10
    move-wide v13, v15

    .line 333
    :goto_b
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    :pswitch_13
    move-object/from16 v0, p1

    .line 339
    .line 340
    check-cast v0, Ld64;

    .line 341
    .line 342
    iget-object v0, v0, Ld64;->h:Ltu4;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_14
    move-object/from16 v0, p1

    .line 346
    .line 347
    check-cast v0, Ld64;

    .line 348
    .line 349
    iget-boolean v0, v0, Ld64;->c:Z

    .line 350
    .line 351
    if-eqz v0, :cond_11

    .line 352
    .line 353
    goto :goto_c

    .line 354
    :cond_11
    move-wide v9, v11

    .line 355
    :goto_c
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    return-object v0

    .line 360
    :pswitch_15
    move-object/from16 v0, p1

    .line 361
    .line 362
    check-cast v0, Ld64;

    .line 363
    .line 364
    iget-object v0, v0, Ld64;->j:Ltu4;

    .line 365
    .line 366
    return-object v0

    .line 367
    :pswitch_16
    move-object/from16 v0, p1

    .line 368
    .line 369
    check-cast v0, Ld64;

    .line 370
    .line 371
    new-instance v0, Lbi2;

    .line 372
    .line 373
    const/16 v1, 0xf

    .line 374
    .line 375
    invoke-direct {v0, v1}, Lbi2;-><init>(I)V

    .line 376
    .line 377
    .line 378
    new-instance v1, Lbi2;

    .line 379
    .line 380
    const/16 v2, 0x11

    .line 381
    .line 382
    invoke-direct {v1, v2}, Lbi2;-><init>(I)V

    .line 383
    .line 384
    .line 385
    const/4 v2, 0x0

    .line 386
    invoke-static {v0, v1, v2, v2}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    return-object v0

    .line 391
    :pswitch_17
    move-object/from16 v0, p1

    .line 392
    .line 393
    check-cast v0, Ld64;

    .line 394
    .line 395
    iget-boolean v0, v0, Ld64;->c:Z

    .line 396
    .line 397
    if-eqz v0, :cond_12

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_12
    move-wide v3, v5

    .line 401
    :goto_d
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    return-object v0

    .line 406
    :pswitch_18
    move-object/from16 v0, p1

    .line 407
    .line 408
    check-cast v0, Ld64;

    .line 409
    .line 410
    iget-object v0, v0, Ld64;->e:Ltu4;

    .line 411
    .line 412
    return-object v0

    .line 413
    :pswitch_19
    move-object/from16 v0, p1

    .line 414
    .line 415
    check-cast v0, Ld64;

    .line 416
    .line 417
    iget-boolean v0, v0, Ld64;->c:Z

    .line 418
    .line 419
    if-eqz v0, :cond_13

    .line 420
    .line 421
    goto :goto_e

    .line 422
    :cond_13
    move-wide v13, v15

    .line 423
    :goto_e
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    return-object v0

    .line 428
    :pswitch_1a
    move-object/from16 v0, p1

    .line 429
    .line 430
    check-cast v0, Ld64;

    .line 431
    .line 432
    invoke-static {v0}, Ltv1;->C(Ld64;)Z

    .line 433
    .line 434
    .line 435
    move-result v1

    .line 436
    iget-boolean v0, v0, Ld64;->c:Z

    .line 437
    .line 438
    if-eqz v1, :cond_15

    .line 439
    .line 440
    if-eqz v0, :cond_14

    .line 441
    .line 442
    goto :goto_f

    .line 443
    :cond_14
    move-wide v13, v15

    .line 444
    :goto_f
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    goto :goto_11

    .line 449
    :cond_15
    if-eqz v0, :cond_16

    .line 450
    .line 451
    goto :goto_10

    .line 452
    :cond_16
    move-wide v9, v11

    .line 453
    :goto_10
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :goto_11
    return-object v0

    .line 458
    :pswitch_1b
    move-object/from16 v0, p1

    .line 459
    .line 460
    check-cast v0, Ld64;

    .line 461
    .line 462
    iget-object v0, v0, Ld64;->e:Ltu4;

    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_1c
    move-object/from16 v0, p1

    .line 466
    .line 467
    check-cast v0, Ld64;

    .line 468
    .line 469
    iget-boolean v0, v0, Ld64;->c:Z

    .line 470
    .line 471
    if-eqz v0, :cond_17

    .line 472
    .line 473
    const-wide/high16 v0, 0x4038000000000000L    # 24.0

    .line 474
    .line 475
    goto :goto_12

    .line 476
    :cond_17
    const-wide v0, 0x4058800000000000L    # 98.0

    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    :goto_12
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    return-object v0

    .line 486
    nop

    .line 487
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
