.class public final synthetic Ldefpackage/na;
.super Ldefpackage/ig1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 1
    iput p7, p0, Ldefpackage/na;->n:I

    .line 2
    .line 3
    move-object v0, p4

    .line 4
    move-object p4, p2

    .line 5
    move p2, p6

    .line 6
    move-object p6, p5

    .line 7
    move-object p5, v0

    .line 8
    invoke-direct/range {p0 .. p6}, Ldefpackage/hg1;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/na;->n:I

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    sget-object v3, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ldefpackage/s24;

    .line 15
    .line 16
    iget-object v1, v0, Ldefpackage/s24;->a:Ldefpackage/td0;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1, v4}, Ldefpackage/te5;->g(Ldefpackage/we0;Landroidx/compose/ui/ModifierNodeDetachedCancellationException;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Ldefpackage/s24;->d:Ldefpackage/p24;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, v0, Ldefpackage/p24;->f:Ldefpackage/fa0;

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    .line 33
    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_0
    const-string v0, "connectionManager"

    .line 37
    .line 38
    invoke-static {v0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v4

    .line 42
    :cond_1
    const-string v0, "coroutineScope"

    .line 43
    .line 44
    invoke-static {v0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v4

    .line 48
    :pswitch_0
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ldefpackage/rr1;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v1, "listening_checkpoints_v1"

    .line 60
    .line 61
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    :pswitch_1
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ldefpackage/b00;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0

    .line 82
    :pswitch_2
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ldefpackage/rr1;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v1, "favorite_compensation_chains_v1"

    .line 94
    .line 95
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :pswitch_3
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Ldefpackage/rr1;

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-string v1, "typed_favorites_v1"

    .line 116
    .line 117
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    :pswitch_4
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Ldefpackage/b00;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :pswitch_5
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Ldefpackage/ea1;

    .line 141
    .line 142
    iget-object v0, v0, Ldefpackage/ea1;->I:Ldefpackage/ba1;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ldefpackage/ba1;->y0(I)Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_6
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Ldefpackage/s91;

    .line 156
    .line 157
    iget-object v1, v0, Ldefpackage/s91;->c:Ldefpackage/x03;

    .line 158
    .line 159
    iget-object v5, v0, Ldefpackage/s91;->d:Ldefpackage/x03;

    .line 160
    .line 161
    iget-object v6, v0, Ldefpackage/s91;->a:Ldefpackage/ey;

    .line 162
    .line 163
    invoke-virtual {v6}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    const/16 v14, 0x8

    .line 168
    .line 169
    const/4 v15, 0x0

    .line 170
    if-nez v7, :cond_5

    .line 171
    .line 172
    iget-object v7, v5, Ldefpackage/x03;->b:[Ljava/lang/Object;

    .line 173
    .line 174
    move/from16 v16, v2

    .line 175
    .line 176
    iget-object v2, v5, Ldefpackage/x03;->a:[J

    .line 177
    .line 178
    move-object/from16 v17, v4

    .line 179
    .line 180
    array-length v4, v2

    .line 181
    add-int/lit8 v4, v4, -0x2

    .line 182
    .line 183
    if-ltz v4, :cond_12

    .line 184
    .line 185
    move v8, v15

    .line 186
    const-wide/16 v18, 0x80

    .line 187
    .line 188
    const-wide/16 v20, 0xff

    .line 189
    .line 190
    :goto_0
    aget-wide v10, v2, v8

    .line 191
    .line 192
    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    not-long v12, v10

    .line 198
    shl-long v12, v12, v16

    .line 199
    .line 200
    and-long/2addr v12, v10

    .line 201
    and-long v12, v12, v22

    .line 202
    .line 203
    cmp-long v9, v12, v22

    .line 204
    .line 205
    if-eqz v9, :cond_4

    .line 206
    .line 207
    sub-int v9, v8, v4

    .line 208
    .line 209
    not-int v9, v9

    .line 210
    ushr-int/lit8 v9, v9, 0x1f

    .line 211
    .line 212
    rsub-int/lit8 v9, v9, 0x8

    .line 213
    .line 214
    move v12, v15

    .line 215
    :goto_1
    if-ge v12, v9, :cond_3

    .line 216
    .line 217
    and-long v24, v10, v20

    .line 218
    .line 219
    cmp-long v13, v24, v18

    .line 220
    .line 221
    if-ltz v13, :cond_2

    .line 222
    .line 223
    shr-long/2addr v10, v14

    .line 224
    add-int/lit8 v12, v12, 0x1

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_2
    shl-int/lit8 v0, v8, 0x3

    .line 228
    .line 229
    add-int/2addr v0, v12

    .line 230
    aget-object v0, v7, v0

    .line 231
    .line 232
    check-cast v0, Ldefpackage/xo;

    .line 233
    .line 234
    invoke-virtual {v0}, Ldefpackage/xo;->r0()V

    .line 235
    .line 236
    .line 237
    throw v17

    .line 238
    :cond_3
    if-ne v9, v14, :cond_12

    .line 239
    .line 240
    :cond_4
    if-eq v8, v4, :cond_12

    .line 241
    .line 242
    add-int/lit8 v8, v8, 0x1

    .line 243
    .line 244
    goto :goto_0

    .line 245
    :cond_5
    move/from16 v16, v2

    .line 246
    .line 247
    move-object/from16 v17, v4

    .line 248
    .line 249
    const-wide/16 v18, 0x80

    .line 250
    .line 251
    const-wide/16 v20, 0xff

    .line 252
    .line 253
    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    iget-boolean v2, v7, Ldefpackage/cx2;->A:Z

    .line 259
    .line 260
    if-eqz v2, :cond_12

    .line 261
    .line 262
    invoke-virtual {v1, v7}, Ldefpackage/x03;->c(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_6

    .line 267
    .line 268
    invoke-virtual {v7}, Ldefpackage/ba1;->w0()V

    .line 269
    .line 270
    .line 271
    :cond_6
    invoke-virtual {v7}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 272
    .line 273
    .line 274
    iget-object v2, v7, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 275
    .line 276
    iget-boolean v2, v2, Ldefpackage/cx2;->A:Z

    .line 277
    .line 278
    if-nez v2, :cond_7

    .line 279
    .line 280
    const-string v2, "visitAncestors called on an unattached node"

    .line 281
    .line 282
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :cond_7
    iget-object v2, v7, Ldefpackage/cx2;->n:Ldefpackage/cx2;

    .line 286
    .line 287
    invoke-static {v7}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    move v7, v15

    .line 292
    :goto_2
    if-eqz v4, :cond_e

    .line 293
    .line 294
    iget-object v8, v4, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 295
    .line 296
    iget-object v8, v8, Ldefpackage/w12;->g:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v8, Ldefpackage/cx2;

    .line 299
    .line 300
    iget v8, v8, Ldefpackage/cx2;->q:I

    .line 301
    .line 302
    and-int/lit16 v8, v8, 0x1400

    .line 303
    .line 304
    if-eqz v8, :cond_c

    .line 305
    .line 306
    :goto_3
    if-eqz v2, :cond_c

    .line 307
    .line 308
    iget v8, v2, Ldefpackage/cx2;->p:I

    .line 309
    .line 310
    and-int/lit16 v9, v8, 0x1400

    .line 311
    .line 312
    if-eqz v9, :cond_b

    .line 313
    .line 314
    and-int/lit16 v8, v8, 0x400

    .line 315
    .line 316
    if-eqz v8, :cond_8

    .line 317
    .line 318
    add-int/lit8 v7, v7, 0x1

    .line 319
    .line 320
    :cond_8
    instance-of v8, v2, Ldefpackage/xo;

    .line 321
    .line 322
    if-eqz v8, :cond_b

    .line 323
    .line 324
    invoke-virtual {v5, v2}, Ldefpackage/x03;->c(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-nez v8, :cond_9

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_9
    const/4 v0, 0x1

    .line 332
    if-gt v7, v0, :cond_a

    .line 333
    .line 334
    check-cast v2, Ldefpackage/xo;

    .line 335
    .line 336
    invoke-virtual {v2}, Ldefpackage/xo;->r0()V

    .line 337
    .line 338
    .line 339
    throw v17

    .line 340
    :cond_a
    check-cast v2, Ldefpackage/xo;

    .line 341
    .line 342
    invoke-virtual {v2}, Ldefpackage/xo;->r0()V

    .line 343
    .line 344
    .line 345
    throw v17

    .line 346
    :cond_b
    :goto_4
    iget-object v2, v2, Ldefpackage/cx2;->r:Ldefpackage/cx2;

    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_c
    invoke-virtual {v4}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    if-eqz v4, :cond_d

    .line 354
    .line 355
    iget-object v2, v4, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 356
    .line 357
    if-eqz v2, :cond_d

    .line 358
    .line 359
    iget-object v2, v2, Ldefpackage/w12;->f:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v2, Ldefpackage/sq4;

    .line 362
    .line 363
    goto :goto_2

    .line 364
    :cond_d
    move-object/from16 v2, v17

    .line 365
    .line 366
    goto :goto_2

    .line 367
    :cond_e
    iget-object v2, v5, Ldefpackage/x03;->b:[Ljava/lang/Object;

    .line 368
    .line 369
    iget-object v4, v5, Ldefpackage/x03;->a:[J

    .line 370
    .line 371
    array-length v7, v4

    .line 372
    add-int/lit8 v7, v7, -0x2

    .line 373
    .line 374
    if-ltz v7, :cond_12

    .line 375
    .line 376
    move v8, v15

    .line 377
    :goto_5
    aget-wide v9, v4, v8

    .line 378
    .line 379
    not-long v11, v9

    .line 380
    shl-long v11, v11, v16

    .line 381
    .line 382
    and-long/2addr v11, v9

    .line 383
    and-long v11, v11, v22

    .line 384
    .line 385
    cmp-long v11, v11, v22

    .line 386
    .line 387
    if-eqz v11, :cond_11

    .line 388
    .line 389
    sub-int v11, v8, v7

    .line 390
    .line 391
    not-int v11, v11

    .line 392
    ushr-int/lit8 v11, v11, 0x1f

    .line 393
    .line 394
    rsub-int/lit8 v11, v11, 0x8

    .line 395
    .line 396
    move v12, v15

    .line 397
    :goto_6
    if-ge v12, v11, :cond_10

    .line 398
    .line 399
    and-long v24, v9, v20

    .line 400
    .line 401
    cmp-long v13, v24, v18

    .line 402
    .line 403
    if-ltz v13, :cond_f

    .line 404
    .line 405
    shr-long/2addr v9, v14

    .line 406
    add-int/lit8 v12, v12, 0x1

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_f
    shl-int/lit8 v0, v8, 0x3

    .line 410
    .line 411
    add-int/2addr v0, v12

    .line 412
    aget-object v0, v2, v0

    .line 413
    .line 414
    check-cast v0, Ldefpackage/xo;

    .line 415
    .line 416
    invoke-virtual {v0}, Ldefpackage/xo;->r0()V

    .line 417
    .line 418
    .line 419
    throw v17

    .line 420
    :cond_10
    if-ne v11, v14, :cond_12

    .line 421
    .line 422
    :cond_11
    if-eq v8, v7, :cond_12

    .line 423
    .line 424
    add-int/lit8 v8, v8, 0x1

    .line 425
    .line 426
    goto :goto_5

    .line 427
    :cond_12
    invoke-virtual {v6}, Ldefpackage/ey;->f()Ldefpackage/ba1;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-eqz v2, :cond_13

    .line 432
    .line 433
    iget-object v2, v6, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v2, Ldefpackage/ba1;

    .line 436
    .line 437
    invoke-virtual {v2}, Ldefpackage/ba1;->v0()Ldefpackage/z91;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    sget-object v4, Ldefpackage/z91;->p:Ldefpackage/z91;

    .line 442
    .line 443
    if-ne v2, v4, :cond_14

    .line 444
    .line 445
    :cond_13
    invoke-virtual {v6}, Ldefpackage/ey;->c()V

    .line 446
    .line 447
    .line 448
    :cond_14
    invoke-virtual {v1}, Ldefpackage/x03;->b()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v5}, Ldefpackage/x03;->b()V

    .line 452
    .line 453
    .line 454
    iput-boolean v15, v0, Ldefpackage/s91;->e:Z

    .line 455
    .line 456
    return-object v3

    .line 457
    :pswitch_7
    move-object/from16 v17, v4

    .line 458
    .line 459
    iget-object v0, v0, Ldefpackage/jy;->receiver:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v0, Landroid/view/View;

    .line 462
    .line 463
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 464
    .line 465
    const/16 v2, 0x1e

    .line 466
    .line 467
    if-lt v1, v2, :cond_15

    .line 468
    .line 469
    invoke-static {v0}, Ldefpackage/p3;->g(Landroid/view/View;)V

    .line 470
    .line 471
    .line 472
    :cond_15
    const/16 v2, 0x1d

    .line 473
    .line 474
    if-lt v1, v2, :cond_17

    .line 475
    .line 476
    invoke-static {v0}, Ldefpackage/yh;->a(Landroid/view/View;)Landroid/view/contentcapture/ContentCaptureSession;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    if-nez v1, :cond_16

    .line 481
    .line 482
    goto :goto_7

    .line 483
    :cond_16
    new-instance v4, Ldefpackage/gp3;

    .line 484
    .line 485
    const/4 v2, 0x5

    .line 486
    invoke-direct {v4, v2, v1, v0}, Ldefpackage/gp3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_17
    :goto_7
    move-object/from16 v4, v17

    .line 491
    .line 492
    :goto_8
    return-object v4

    .line 493
    :pswitch_data_0
    .packed-switch 0x0
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
