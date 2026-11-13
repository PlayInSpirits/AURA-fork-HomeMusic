.class public final synthetic Ldefpackage/ib;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/wf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/ib;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/ib;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/ib;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Comparable;Ljava/lang/String;II)V
    .locals 0

    .line 11
    iput p4, p0, Ldefpackage/ib;->n:I

    iput-object p1, p0, Ldefpackage/ib;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/ib;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget v2, v0, Ldefpackage/ib;->n:I

    .line 6
    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x1

    .line 10
    sget-object v8, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 11
    .line 12
    iget-object v9, v0, Ldefpackage/ib;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v0, v0, Ldefpackage/ib;->o:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v2, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v0, Ldefpackage/gx3;

    .line 20
    .line 21
    check-cast v9, Ldefpackage/sm0;

    .line 22
    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Float;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    check-cast v1, Ljava/lang/Float;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget v1, v0, Ldefpackage/gx3;->n:F

    .line 37
    .line 38
    sub-float/2addr v2, v1

    .line 39
    iget-object v1, v9, Ldefpackage/sm0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ldefpackage/q64;

    .line 42
    .line 43
    invoke-interface {v1, v2}, Ldefpackage/q64;->a(F)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget v2, v0, Ldefpackage/gx3;->n:F

    .line 48
    .line 49
    add-float/2addr v2, v1

    .line 50
    iput v2, v0, Ldefpackage/gx3;->n:F

    .line 51
    .line 52
    return-object v8

    .line 53
    :pswitch_0
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    check-cast v9, Ljava/lang/String;

    .line 56
    .line 57
    move-object/from16 v2, p1

    .line 58
    .line 59
    check-cast v2, Ldefpackage/rg1;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-static {v7}, Ldefpackage/xl;->O(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v0, v9, v2, v1}, Ldefpackage/e35;->g(Ljava/lang/String;Ljava/lang/String;Ldefpackage/rg1;I)V

    .line 71
    .line 72
    .line 73
    return-object v8

    .line 74
    :pswitch_1
    check-cast v0, Landroid/net/Uri;

    .line 75
    .line 76
    check-cast v9, Ljava/lang/String;

    .line 77
    .line 78
    move-object/from16 v2, p1

    .line 79
    .line 80
    check-cast v2, Ldefpackage/rg1;

    .line 81
    .line 82
    check-cast v1, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v7}, Ldefpackage/xl;->O(I)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v0, v9, v2, v1}, Ldefpackage/e35;->f(Landroid/net/Uri;Ljava/lang/String;Ldefpackage/rg1;I)V

    .line 92
    .line 93
    .line 94
    return-object v8

    .line 95
    :pswitch_2
    check-cast v0, Ldefpackage/f63;

    .line 96
    .line 97
    check-cast v9, Ldefpackage/c63;

    .line 98
    .line 99
    move-object/from16 v2, p1

    .line 100
    .line 101
    check-cast v2, Ldefpackage/jz;

    .line 102
    .line 103
    check-cast v1, Ldefpackage/sj1;

    .line 104
    .line 105
    iget-object v3, v0, Ldefpackage/f63;->H:Ldefpackage/c72;

    .line 106
    .line 107
    invoke-virtual {v3}, Ldefpackage/c72;->H()Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_0

    .line 112
    .line 113
    iput-object v2, v0, Ldefpackage/f63;->c0:Ldefpackage/jz;

    .line 114
    .line 115
    iput-object v1, v0, Ldefpackage/f63;->b0:Ldefpackage/sj1;

    .line 116
    .line 117
    invoke-static {v3}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    check-cast v1, Ldefpackage/ra;

    .line 122
    .line 123
    invoke-virtual {v1}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    sget-object v2, Ldefpackage/f63;->i0:Ldefpackage/k52;

    .line 128
    .line 129
    iget-object v1, v1, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 130
    .line 131
    invoke-virtual {v1, v0, v2, v9}, Ldefpackage/pp3;->e(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/gf1;)V

    .line 132
    .line 133
    .line 134
    iput-boolean v6, v0, Ldefpackage/f63;->f0:Z

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    iput-boolean v7, v0, Ldefpackage/f63;->f0:Z

    .line 138
    .line 139
    :goto_0
    return-object v8

    .line 140
    :pswitch_3
    check-cast v0, Ldefpackage/r70;

    .line 141
    .line 142
    check-cast v9, Ldefpackage/z82;

    .line 143
    .line 144
    move-object/from16 v2, p1

    .line 145
    .line 146
    check-cast v2, Ldefpackage/rg1;

    .line 147
    .line 148
    check-cast v1, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    and-int/lit8 v3, v1, 0x3

    .line 155
    .line 156
    if-eq v3, v5, :cond_1

    .line 157
    .line 158
    move v3, v7

    .line 159
    goto :goto_1

    .line 160
    :cond_1
    move v3, v6

    .line 161
    :goto_1
    and-int/2addr v1, v7

    .line 162
    invoke-virtual {v2, v1, v3}, Ldefpackage/rg1;->K(IZ)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_2

    .line 167
    .line 168
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v9, v2, v1}, Ldefpackage/r70;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_2
    invoke-virtual {v2}, Ldefpackage/rg1;->N()V

    .line 177
    .line 178
    .line 179
    :goto_2
    return-object v8

    .line 180
    :pswitch_4
    check-cast v0, Ldefpackage/c82;

    .line 181
    .line 182
    check-cast v9, Ldefpackage/pc3;

    .line 183
    .line 184
    move-object/from16 v2, p1

    .line 185
    .line 186
    check-cast v2, Ldefpackage/ln4;

    .line 187
    .line 188
    check-cast v1, Ldefpackage/nc0;

    .line 189
    .line 190
    new-instance v10, Ldefpackage/f82;

    .line 191
    .line 192
    invoke-direct {v10, v0, v2}, Ldefpackage/f82;-><init>(Ldefpackage/c82;Ldefpackage/ln4;)V

    .line 193
    .line 194
    .line 195
    iget-wide v0, v1, Ldefpackage/nc0;->a:J

    .line 196
    .line 197
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object v5, v9, Ldefpackage/pc3;->b:Ldefpackage/ac3;

    .line 201
    .line 202
    iget v8, v5, Ldefpackage/ac3;->b:F

    .line 203
    .line 204
    iget v5, v5, Ldefpackage/ac3;->a:F

    .line 205
    .line 206
    iget-object v11, v9, Ldefpackage/pc3;->a:Ldefpackage/lm0;

    .line 207
    .line 208
    iget-object v12, v11, Ldefpackage/ad3;->B:Ldefpackage/b13;

    .line 209
    .line 210
    invoke-interface {v12}, Ldefpackage/kl4;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    invoke-static {v0, v1}, Ldefpackage/nc0;->h(J)I

    .line 214
    .line 215
    .line 216
    move-result v12

    .line 217
    const v13, 0x7fffffff

    .line 218
    .line 219
    .line 220
    if-eq v12, v13, :cond_3

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_3
    const-string v12, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 224
    .line 225
    invoke-static {v12}, Ldefpackage/fz1;->c(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :goto_3
    invoke-interface {v2}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 229
    .line 230
    .line 231
    move-result-object v12

    .line 232
    sget-object v14, Ldefpackage/r62;->n:Ldefpackage/r62;

    .line 233
    .line 234
    if-ne v12, v14, :cond_6

    .line 235
    .line 236
    if-ne v12, v14, :cond_5

    .line 237
    .line 238
    :cond_4
    move v12, v5

    .line 239
    goto :goto_5

    .line 240
    :cond_5
    :goto_4
    move v12, v8

    .line 241
    goto :goto_5

    .line 242
    :cond_6
    if-ne v12, v14, :cond_4

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :goto_5
    invoke-interface {v2, v12}, Ldefpackage/oo0;->V(F)I

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    invoke-interface {v2}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 250
    .line 251
    .line 252
    move-result-object v15

    .line 253
    if-ne v15, v14, :cond_8

    .line 254
    .line 255
    if-ne v15, v14, :cond_7

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_7
    :goto_6
    move v8, v5

    .line 259
    goto :goto_7

    .line 260
    :cond_8
    if-ne v15, v14, :cond_9

    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_9
    :goto_7
    invoke-interface {v2, v8}, Ldefpackage/oo0;->V(F)I

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    const/4 v8, 0x0

    .line 268
    invoke-interface {v2, v8}, Ldefpackage/oo0;->V(F)I

    .line 269
    .line 270
    .line 271
    move-result v14

    .line 272
    invoke-interface {v2, v8}, Ldefpackage/oo0;->V(F)I

    .line 273
    .line 274
    .line 275
    move-result v15

    .line 276
    add-int/2addr v15, v14

    .line 277
    add-int/2addr v5, v12

    .line 278
    sub-int v16, v5, v12

    .line 279
    .line 280
    move/from16 p0, v8

    .line 281
    .line 282
    neg-int v8, v5

    .line 283
    const/16 v17, -0x1

    .line 284
    .line 285
    neg-int v4, v15

    .line 286
    invoke-static {v0, v1}, Ldefpackage/nc0;->j(J)I

    .line 287
    .line 288
    .line 289
    move-result v18

    .line 290
    add-int v18, v18, v8

    .line 291
    .line 292
    if-gez v18, :cond_a

    .line 293
    .line 294
    move v3, v6

    .line 295
    :goto_8
    move/from16 v33, v7

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_a
    move/from16 v3, v18

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :goto_9
    invoke-static {v0, v1}, Ldefpackage/nc0;->h(J)I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-ne v7, v13, :cond_b

    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_b
    add-int/2addr v7, v8

    .line 309
    if-gez v7, :cond_c

    .line 310
    .line 311
    move v7, v6

    .line 312
    :cond_c
    :goto_a
    invoke-static {v0, v1}, Ldefpackage/nc0;->i(J)I

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    add-int/2addr v8, v4

    .line 317
    if-gez v8, :cond_d

    .line 318
    .line 319
    move v8, v6

    .line 320
    :cond_d
    invoke-static {v0, v1}, Ldefpackage/nc0;->g(J)I

    .line 321
    .line 322
    .line 323
    move-result v6

    .line 324
    if-ne v6, v13, :cond_e

    .line 325
    .line 326
    move v4, v6

    .line 327
    goto :goto_b

    .line 328
    :cond_e
    add-int/2addr v4, v6

    .line 329
    if-gez v4, :cond_f

    .line 330
    .line 331
    const/4 v4, 0x0

    .line 332
    :cond_f
    :goto_b
    invoke-static {v3, v7, v8, v4}, Ldefpackage/qc0;->a(IIII)J

    .line 333
    .line 334
    .line 335
    move-result-wide v3

    .line 336
    iput-object v10, v11, Ldefpackage/ad3;->n:Ldefpackage/oo0;

    .line 337
    .line 338
    iget v6, v9, Ldefpackage/pc3;->c:F

    .line 339
    .line 340
    invoke-interface {v2, v6}, Ldefpackage/oo0;->V(F)I

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    invoke-static {v0, v1}, Ldefpackage/nc0;->h(J)I

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    sub-int/2addr v7, v5

    .line 349
    move/from16 p2, v14

    .line 350
    .line 351
    int-to-long v13, v12

    .line 352
    const/16 v8, 0x20

    .line 353
    .line 354
    shl-long/2addr v13, v8

    .line 355
    move/from16 v8, p2

    .line 356
    .line 357
    move/from16 p2, v5

    .line 358
    .line 359
    move/from16 v18, v6

    .line 360
    .line 361
    int-to-long v5, v8

    .line 362
    const-wide v19, 0xffffffffL

    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    and-long v5, v5, v19

    .line 368
    .line 369
    or-long/2addr v5, v13

    .line 370
    iget-object v8, v9, Ldefpackage/pc3;->d:Ldefpackage/rv2;

    .line 371
    .line 372
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    if-gez v7, :cond_10

    .line 376
    .line 377
    const/4 v8, 0x0

    .line 378
    goto :goto_c

    .line 379
    :cond_10
    move v8, v7

    .line 380
    :goto_c
    invoke-static {v3, v4}, Ldefpackage/nc0;->g(J)I

    .line 381
    .line 382
    .line 383
    move-result v13

    .line 384
    const/4 v14, 0x5

    .line 385
    invoke-static {v8, v13, v14}, Ldefpackage/qc0;->b(III)J

    .line 386
    .line 387
    .line 388
    iget-object v13, v9, Ldefpackage/pc3;->e:Ldefpackage/gf1;

    .line 389
    .line 390
    invoke-interface {v13}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v13

    .line 394
    check-cast v13, Ldefpackage/nc3;

    .line 395
    .line 396
    iget-object v14, v9, Ldefpackage/pc3;->h:Ldefpackage/rv2;

    .line 397
    .line 398
    move-wide/from16 v20, v5

    .line 399
    .line 400
    invoke-static {}, Ldefpackage/ya4;->t()Ldefpackage/ch4;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    if-eqz v5, :cond_11

    .line 405
    .line 406
    invoke-virtual {v5}, Ldefpackage/ch4;->e()Ldefpackage/if1;

    .line 407
    .line 408
    .line 409
    move-result-object v22

    .line 410
    move-object/from16 v6, v22

    .line 411
    .line 412
    :goto_d
    move-object/from16 v30, v10

    .line 413
    .line 414
    goto :goto_e

    .line 415
    :cond_11
    const/4 v6, 0x0

    .line 416
    goto :goto_d

    .line 417
    :goto_e
    invoke-static {v5}, Ldefpackage/ya4;->z(Ldefpackage/ch4;)Ldefpackage/ch4;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    move-object/from16 v22, v14

    .line 422
    .line 423
    :try_start_0
    invoke-virtual {v11}, Ldefpackage/ad3;->k()I

    .line 424
    .line 425
    .line 426
    move-result v14

    .line 427
    move/from16 v23, v15

    .line 428
    .line 429
    iget-object v15, v11, Ldefpackage/ad3;->d:Ldefpackage/nq;

    .line 430
    .line 431
    move-wide/from16 v26, v3

    .line 432
    .line 433
    iget-object v3, v15, Ldefpackage/nq;->r:Ljava/lang/Object;

    .line 434
    .line 435
    invoke-static {v14, v13, v3}, Ldefpackage/ud3;->i(ILdefpackage/nc3;Ljava/lang/Object;)I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-eq v14, v3, :cond_12

    .line 440
    .line 441
    iget-object v4, v15, Ldefpackage/nq;->p:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v4, Ldefpackage/wd3;

    .line 444
    .line 445
    invoke-virtual {v4, v3}, Ldefpackage/wd3;->h(I)V

    .line 446
    .line 447
    .line 448
    iget-object v4, v15, Ldefpackage/nq;->s:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v4, Ldefpackage/g82;

    .line 451
    .line 452
    iget v15, v4, Ldefpackage/g82;->o:I

    .line 453
    .line 454
    if-eq v14, v15, :cond_12

    .line 455
    .line 456
    iput v14, v4, Ldefpackage/g82;->o:I

    .line 457
    .line 458
    div-int/lit8 v14, v14, 0x1e

    .line 459
    .line 460
    mul-int/lit8 v14, v14, 0x1e

    .line 461
    .line 462
    add-int/lit8 v15, v14, -0x64

    .line 463
    .line 464
    move/from16 v28, v3

    .line 465
    .line 466
    const/4 v3, 0x0

    .line 467
    invoke-static {v15, v3}, Ljava/lang/Math;->max(II)I

    .line 468
    .line 469
    .line 470
    move-result v15

    .line 471
    add-int/lit16 v14, v14, 0x82

    .line 472
    .line 473
    invoke-static {v15, v14}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    iget-object v4, v4, Ldefpackage/g82;->n:Ldefpackage/zd3;

    .line 478
    .line 479
    invoke-virtual {v4, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    goto :goto_f

    .line 483
    :cond_12
    move/from16 v28, v3

    .line 484
    .line 485
    :goto_f
    invoke-virtual {v11}, Ldefpackage/ad3;->k()I

    .line 486
    .line 487
    .line 488
    invoke-virtual {v11}, Ldefpackage/ad3;->l()F

    .line 489
    .line 490
    .line 491
    move-result v3

    .line 492
    invoke-virtual {v11}, Ldefpackage/lm0;->n()I

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    add-int v4, v8, v18

    .line 499
    .line 500
    int-to-float v14, v4

    .line 501
    mul-float/2addr v3, v14

    .line 502
    sub-float v3, p0, v3

    .line 503
    .line 504
    invoke-static {v3}, Ldefpackage/ji2;->L(F)I

    .line 505
    .line 506
    .line 507
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 508
    invoke-static {v5, v10, v6}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 509
    .line 510
    .line 511
    iget-object v5, v11, Ldefpackage/ad3;->z:Ldefpackage/n82;

    .line 512
    .line 513
    iget-object v6, v11, Ldefpackage/ad3;->v:Ldefpackage/hg3;

    .line 514
    .line 515
    iget-object v5, v5, Ldefpackage/n82;->n:Ldefpackage/rh4;

    .line 516
    .line 517
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-static {v5}, Ldefpackage/rr2;->F(Ldefpackage/rh4;)Ldefpackage/ql4;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    iget-object v5, v5, Ldefpackage/ql4;->c:Ldefpackage/y1;

    .line 525
    .line 526
    iget-object v10, v6, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 527
    .line 528
    check-cast v10, Ldefpackage/f13;

    .line 529
    .line 530
    iget v14, v10, Ldefpackage/f13;->p:I

    .line 531
    .line 532
    if-eqz v14, :cond_13

    .line 533
    .line 534
    move/from16 v14, v33

    .line 535
    .line 536
    goto :goto_10

    .line 537
    :cond_13
    const/4 v14, 0x0

    .line 538
    :goto_10
    if-nez v14, :cond_14

    .line 539
    .line 540
    invoke-virtual {v5}, Ldefpackage/y;->isEmpty()Z

    .line 541
    .line 542
    .line 543
    move-result v14

    .line 544
    if-eqz v14, :cond_14

    .line 545
    .line 546
    sget-object v5, Ldefpackage/c02;->a:Ldefpackage/h03;

    .line 547
    .line 548
    move/from16 v22, v3

    .line 549
    .line 550
    move/from16 v29, v4

    .line 551
    .line 552
    :goto_11
    move/from16 v15, v23

    .line 553
    .line 554
    goto/16 :goto_1b

    .line 555
    .line 556
    :cond_14
    new-instance v14, Ldefpackage/h03;

    .line 557
    .line 558
    invoke-direct {v14}, Ldefpackage/h03;-><init>()V

    .line 559
    .line 560
    .line 561
    iget-object v6, v6, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v6, Ldefpackage/f13;

    .line 564
    .line 565
    iget v6, v6, Ldefpackage/f13;->p:I

    .line 566
    .line 567
    if-eqz v6, :cond_1c

    .line 568
    .line 569
    iget v6, v10, Ldefpackage/f13;->p:I

    .line 570
    .line 571
    const-string v15, "MutableVector is empty."

    .line 572
    .line 573
    if-eqz v6, :cond_1b

    .line 574
    .line 575
    move/from16 v22, v3

    .line 576
    .line 577
    iget-object v3, v10, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 578
    .line 579
    const/16 v34, 0x0

    .line 580
    .line 581
    aget-object v29, v3, v34

    .line 582
    .line 583
    move-object/from16 v31, v3

    .line 584
    .line 585
    move-object/from16 v3, v29

    .line 586
    .line 587
    check-cast v3, Ldefpackage/v72;

    .line 588
    .line 589
    iget v3, v3, Ldefpackage/v72;->a:I

    .line 590
    .line 591
    move/from16 v29, v4

    .line 592
    .line 593
    const/4 v4, 0x0

    .line 594
    :goto_12
    if-ge v4, v6, :cond_16

    .line 595
    .line 596
    aget-object v32, v31, v4

    .line 597
    .line 598
    move/from16 v35, v4

    .line 599
    .line 600
    move-object/from16 v4, v32

    .line 601
    .line 602
    check-cast v4, Ldefpackage/v72;

    .line 603
    .line 604
    iget v4, v4, Ldefpackage/v72;->a:I

    .line 605
    .line 606
    if-ge v4, v3, :cond_15

    .line 607
    .line 608
    move v3, v4

    .line 609
    :cond_15
    add-int/lit8 v4, v35, 0x1

    .line 610
    .line 611
    goto :goto_12

    .line 612
    :cond_16
    if-ltz v3, :cond_17

    .line 613
    .line 614
    goto :goto_13

    .line 615
    :cond_17
    const-string v4, "negative minIndex"

    .line 616
    .line 617
    invoke-static {v4}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    :goto_13
    iget v4, v10, Ldefpackage/f13;->p:I

    .line 621
    .line 622
    if-eqz v4, :cond_1a

    .line 623
    .line 624
    iget-object v6, v10, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 625
    .line 626
    const/16 v34, 0x0

    .line 627
    .line 628
    aget-object v10, v6, v34

    .line 629
    .line 630
    check-cast v10, Ldefpackage/v72;

    .line 631
    .line 632
    iget v10, v10, Ldefpackage/v72;->b:I

    .line 633
    .line 634
    const/4 v15, 0x0

    .line 635
    :goto_14
    if-ge v15, v4, :cond_19

    .line 636
    .line 637
    aget-object v31, v6, v15

    .line 638
    .line 639
    move/from16 v32, v3

    .line 640
    .line 641
    move-object/from16 v3, v31

    .line 642
    .line 643
    check-cast v3, Ldefpackage/v72;

    .line 644
    .line 645
    iget v3, v3, Ldefpackage/v72;->b:I

    .line 646
    .line 647
    if-le v3, v10, :cond_18

    .line 648
    .line 649
    move v10, v3

    .line 650
    :cond_18
    add-int/lit8 v15, v15, 0x1

    .line 651
    .line 652
    move/from16 v3, v32

    .line 653
    .line 654
    goto :goto_14

    .line 655
    :cond_19
    move/from16 v32, v3

    .line 656
    .line 657
    invoke-virtual {v13}, Ldefpackage/nc3;->b()I

    .line 658
    .line 659
    .line 660
    move-result v3

    .line 661
    add-int/lit8 v3, v3, -0x1

    .line 662
    .line 663
    invoke-static {v10, v3}, Ljava/lang/Math;->min(II)I

    .line 664
    .line 665
    .line 666
    move-result v3

    .line 667
    move v4, v3

    .line 668
    move/from16 v3, v32

    .line 669
    .line 670
    goto :goto_16

    .line 671
    :cond_1a
    invoke-static {v15}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    :goto_15
    const/4 v6, 0x0

    .line 675
    goto/16 :goto_5d

    .line 676
    .line 677
    :cond_1b
    invoke-static {v15}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    goto :goto_15

    .line 681
    :cond_1c
    move/from16 v22, v3

    .line 682
    .line 683
    move/from16 v29, v4

    .line 684
    .line 685
    move/from16 v3, v33

    .line 686
    .line 687
    const/4 v4, 0x0

    .line 688
    :goto_16
    invoke-virtual {v5}, Ldefpackage/y;->a()I

    .line 689
    .line 690
    .line 691
    move-result v6

    .line 692
    const/4 v10, 0x0

    .line 693
    :goto_17
    if-ge v10, v6, :cond_1f

    .line 694
    .line 695
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v15

    .line 699
    check-cast v15, Ldefpackage/l82;

    .line 700
    .line 701
    move-object/from16 v31, v5

    .line 702
    .line 703
    iget-object v5, v15, Ldefpackage/l82;->a:Ljava/lang/Object;

    .line 704
    .line 705
    iget v15, v15, Ldefpackage/l82;->c:I

    .line 706
    .line 707
    invoke-static {v15, v13, v5}, Ldefpackage/ud3;->i(ILdefpackage/nc3;Ljava/lang/Object;)I

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    if-gt v3, v5, :cond_1d

    .line 712
    .line 713
    if-gt v5, v4, :cond_1d

    .line 714
    .line 715
    goto :goto_18

    .line 716
    :cond_1d
    if-ltz v5, :cond_1e

    .line 717
    .line 718
    invoke-virtual {v13}, Ldefpackage/nc3;->b()I

    .line 719
    .line 720
    .line 721
    move-result v15

    .line 722
    if-ge v5, v15, :cond_1e

    .line 723
    .line 724
    invoke-virtual {v14, v5}, Ldefpackage/h03;->a(I)V

    .line 725
    .line 726
    .line 727
    :cond_1e
    :goto_18
    add-int/lit8 v10, v10, 0x1

    .line 728
    .line 729
    move-object/from16 v5, v31

    .line 730
    .line 731
    goto :goto_17

    .line 732
    :cond_1f
    if-gt v3, v4, :cond_20

    .line 733
    .line 734
    :goto_19
    invoke-virtual {v14, v3}, Ldefpackage/h03;->a(I)V

    .line 735
    .line 736
    .line 737
    if-eq v3, v4, :cond_20

    .line 738
    .line 739
    add-int/lit8 v3, v3, 0x1

    .line 740
    .line 741
    goto :goto_19

    .line 742
    :cond_20
    iget v3, v14, Ldefpackage/h03;->b:I

    .line 743
    .line 744
    if-nez v3, :cond_21

    .line 745
    .line 746
    :goto_1a
    move-object v5, v14

    .line 747
    goto/16 :goto_11

    .line 748
    .line 749
    :cond_21
    iget-object v4, v14, Ldefpackage/h03;->a:[I

    .line 750
    .line 751
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    const/4 v5, 0x0

    .line 755
    invoke-static {v4, v5, v3}, Ljava/util/Arrays;->sort([III)V

    .line 756
    .line 757
    .line 758
    goto :goto_1a

    .line 759
    :goto_1b
    new-instance v23, Ldefpackage/i03;

    .line 760
    .line 761
    invoke-direct/range {v23 .. v23}, Ldefpackage/i03;-><init>()V

    .line 762
    .line 763
    .line 764
    iget-object v3, v9, Ldefpackage/pc3;->f:Ldefpackage/gf1;

    .line 765
    .line 766
    invoke-interface {v3}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v3

    .line 770
    check-cast v3, Ljava/lang/Number;

    .line 771
    .line 772
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 773
    .line 774
    .line 775
    move-result v3

    .line 776
    iget-object v4, v11, Ldefpackage/ad3;->A:Ldefpackage/b13;

    .line 777
    .line 778
    iget-object v6, v9, Ldefpackage/pc3;->g:Ldefpackage/gs;

    .line 779
    .line 780
    move/from16 v10, v18

    .line 781
    .line 782
    sget-object v18, Ldefpackage/fz0;->z:Ldefpackage/fs;

    .line 783
    .line 784
    iget-object v14, v9, Ldefpackage/pc3;->h:Ldefpackage/rv2;

    .line 785
    .line 786
    iget-object v9, v9, Ldefpackage/pc3;->i:Ldefpackage/we0;

    .line 787
    .line 788
    if-ltz v12, :cond_22

    .line 789
    .line 790
    goto :goto_1c

    .line 791
    :cond_22
    const-string v31, "negative beforeContentPadding"

    .line 792
    .line 793
    invoke-static/range {v31 .. v31}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    :goto_1c
    if-ltz v16, :cond_23

    .line 797
    .line 798
    goto :goto_1d

    .line 799
    :cond_23
    const-string v31, "negative afterContentPadding"

    .line 800
    .line 801
    invoke-static/range {v31 .. v31}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    :goto_1d
    move-object/from16 v31, v6

    .line 805
    .line 806
    if-gez v29, :cond_24

    .line 807
    .line 808
    const/4 v6, 0x0

    .line 809
    goto :goto_1e

    .line 810
    :cond_24
    move/from16 v6, v29

    .line 811
    .line 812
    :goto_1e
    move/from16 v32, v17

    .line 813
    .line 814
    move-object/from16 v17, v14

    .line 815
    .line 816
    move-object v14, v13

    .line 817
    move/from16 v13, v16

    .line 818
    .line 819
    if-gez v3, :cond_25

    .line 820
    .line 821
    move/from16 v16, v3

    .line 822
    .line 823
    :goto_1f
    move-object/from16 v35, v9

    .line 824
    .line 825
    goto :goto_20

    .line 826
    :cond_25
    const/16 v16, 0x0

    .line 827
    .line 828
    goto :goto_1f

    .line 829
    :goto_20
    invoke-static/range {v26 .. v27}, Ldefpackage/nc0;->g(J)I

    .line 830
    .line 831
    .line 832
    move-result v9

    .line 833
    move/from16 v36, v10

    .line 834
    .line 835
    const/4 v10, 0x5

    .line 836
    invoke-static {v8, v9, v10}, Ldefpackage/qc0;->b(III)J

    .line 837
    .line 838
    .line 839
    move-result-wide v9

    .line 840
    move/from16 v19, v8

    .line 841
    .line 842
    sget-object v8, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 843
    .line 844
    if-gtz v3, :cond_26

    .line 845
    .line 846
    neg-int v14, v12

    .line 847
    add-int/2addr v7, v13

    .line 848
    invoke-static/range {v26 .. v27}, Ldefpackage/nc0;->j(J)I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    invoke-static/range {v26 .. v27}, Ldefpackage/nc0;->i(J)I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    new-instance v5, Ldefpackage/or1;

    .line 857
    .line 858
    const/16 v6, 0x18

    .line 859
    .line 860
    invoke-direct {v5, v6}, Ldefpackage/or1;-><init>(I)V

    .line 861
    .line 862
    .line 863
    add-int v3, v3, p2

    .line 864
    .line 865
    invoke-static {v3, v0, v1}, Ldefpackage/qc0;->f(IJ)I

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    add-int/2addr v4, v15

    .line 870
    invoke-static {v4, v0, v1}, Ldefpackage/qc0;->e(IJ)I

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    invoke-interface {v2, v3, v0, v8, v5}, Ldefpackage/wi2;->v(IILjava/util/Map;Ldefpackage/if1;)Ldefpackage/vi2;

    .line 875
    .line 876
    .line 877
    move-result-object v18

    .line 878
    move-wide/from16 v31, v9

    .line 879
    .line 880
    new-instance v10, Ldefpackage/qc3;

    .line 881
    .line 882
    move v15, v7

    .line 883
    move-object v9, v11

    .line 884
    move/from16 v11, v19

    .line 885
    .line 886
    move-object/from16 v20, v30

    .line 887
    .line 888
    move-wide/from16 v21, v31

    .line 889
    .line 890
    move-object/from16 v19, v35

    .line 891
    .line 892
    move/from16 v12, v36

    .line 893
    .line 894
    const v0, 0x7fffffff

    .line 895
    .line 896
    .line 897
    invoke-direct/range {v10 .. v22}, Ldefpackage/qc3;-><init>(IIIIIILdefpackage/rv2;Ldefpackage/vi2;Ldefpackage/we0;Ldefpackage/oo0;J)V

    .line 898
    .line 899
    .line 900
    move-object v1, v10

    .line 901
    move-object v0, v2

    .line 902
    move-object/from16 v39, v9

    .line 903
    .line 904
    move-object/from16 v10, v20

    .line 905
    .line 906
    :goto_21
    move-object v6, v1

    .line 907
    goto/16 :goto_5a

    .line 908
    .line 909
    :cond_26
    move-object/from16 v24, v30

    .line 910
    .line 911
    move/from16 v30, v13

    .line 912
    .line 913
    move/from16 v13, v36

    .line 914
    .line 915
    move-wide/from16 v36, v9

    .line 916
    .line 917
    move-object/from16 v10, v24

    .line 918
    .line 919
    move-object v9, v11

    .line 920
    move-object/from16 v24, v17

    .line 921
    .line 922
    const/16 v38, 0x15

    .line 923
    .line 924
    move/from16 v11, v28

    .line 925
    .line 926
    :goto_22
    if-lez v11, :cond_27

    .line 927
    .line 928
    if-lez v22, :cond_27

    .line 929
    .line 930
    add-int/lit8 v11, v11, -0x1

    .line 931
    .line 932
    sub-int v22, v22, v6

    .line 933
    .line 934
    goto :goto_22

    .line 935
    :cond_27
    mul-int/lit8 v17, v22, -0x1

    .line 936
    .line 937
    if-lt v11, v3, :cond_28

    .line 938
    .line 939
    add-int/lit8 v11, v3, -0x1

    .line 940
    .line 941
    const/16 v17, 0x0

    .line 942
    .line 943
    :cond_28
    move-object/from16 v39, v9

    .line 944
    .line 945
    new-instance v9, Ldefpackage/ii;

    .line 946
    .line 947
    invoke-direct {v9}, Ldefpackage/ii;-><init>()V

    .line 948
    .line 949
    .line 950
    move-object/from16 v28, v8

    .line 951
    .line 952
    neg-int v8, v12

    .line 953
    if-gez v13, :cond_29

    .line 954
    .line 955
    move/from16 v22, v13

    .line 956
    .line 957
    :goto_23
    move/from16 v32, v8

    .line 958
    .line 959
    goto :goto_24

    .line 960
    :cond_29
    const/16 v22, 0x0

    .line 961
    .line 962
    goto :goto_23

    .line 963
    :goto_24
    add-int v8, v32, v22

    .line 964
    .line 965
    add-int v17, v17, v8

    .line 966
    .line 967
    move-wide/from16 v40, v0

    .line 968
    .line 969
    move/from16 v0, v17

    .line 970
    .line 971
    const/4 v1, 0x0

    .line 972
    :goto_25
    sget-object v17, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 973
    .line 974
    move/from16 v22, v16

    .line 975
    .line 976
    move-wide/from16 v53, v20

    .line 977
    .line 978
    move/from16 v20, v15

    .line 979
    .line 980
    move-wide/from16 v15, v53

    .line 981
    .line 982
    const/16 v21, 0x0

    .line 983
    .line 984
    if-gez v0, :cond_2a

    .line 985
    .line 986
    if-lez v11, :cond_2a

    .line 987
    .line 988
    add-int/lit8 v11, v11, -0x1

    .line 989
    .line 990
    move/from16 v42, v20

    .line 991
    .line 992
    invoke-interface {v2}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 993
    .line 994
    .line 995
    move-result-object v20

    .line 996
    move/from16 p1, v22

    .line 997
    .line 998
    move/from16 v22, v19

    .line 999
    .line 1000
    move-object/from16 v19, v31

    .line 1001
    .line 1002
    move/from16 v31, p1

    .line 1003
    .line 1004
    move-object/from16 p1, v2

    .line 1005
    .line 1006
    move-object/from16 v43, v4

    .line 1007
    .line 1008
    move v4, v12

    .line 1009
    move-wide/from16 v53, v36

    .line 1010
    .line 1011
    move/from16 v36, v13

    .line 1012
    .line 1013
    move-wide/from16 v12, v53

    .line 1014
    .line 1015
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    move-object/from16 v20, v10

    .line 1020
    .line 1021
    const/4 v10, 0x0

    .line 1022
    invoke-virtual {v9, v10, v2}, Ldefpackage/ii;->add(ILjava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    iget v2, v2, Ldefpackage/xi2;->j:I

    .line 1026
    .line 1027
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 1028
    .line 1029
    .line 1030
    move-result v1

    .line 1031
    add-int/2addr v0, v6

    .line 1032
    move/from16 v13, v36

    .line 1033
    .line 1034
    move-wide/from16 v36, v53

    .line 1035
    .line 1036
    move-object/from16 v2, p1

    .line 1037
    .line 1038
    move v12, v4

    .line 1039
    move-object/from16 v10, v20

    .line 1040
    .line 1041
    move-object/from16 v4, v43

    .line 1042
    .line 1043
    move-wide/from16 v20, v15

    .line 1044
    .line 1045
    move/from16 v16, v31

    .line 1046
    .line 1047
    move/from16 v15, v42

    .line 1048
    .line 1049
    move-object/from16 v31, v19

    .line 1050
    .line 1051
    move/from16 v19, v22

    .line 1052
    .line 1053
    goto :goto_25

    .line 1054
    :cond_2a
    move/from16 p1, v22

    .line 1055
    .line 1056
    move/from16 v22, v19

    .line 1057
    .line 1058
    move-object/from16 v19, v31

    .line 1059
    .line 1060
    move/from16 v31, p1

    .line 1061
    .line 1062
    move-object/from16 p1, v2

    .line 1063
    .line 1064
    move-object/from16 v43, v4

    .line 1065
    .line 1066
    move v4, v12

    .line 1067
    move/from16 v42, v20

    .line 1068
    .line 1069
    move-object/from16 v20, v10

    .line 1070
    .line 1071
    move-wide/from16 v53, v36

    .line 1072
    .line 1073
    move/from16 v36, v13

    .line 1074
    .line 1075
    move-wide/from16 v12, v53

    .line 1076
    .line 1077
    if-ge v0, v8, :cond_2b

    .line 1078
    .line 1079
    move v0, v8

    .line 1080
    :cond_2b
    sub-int/2addr v0, v8

    .line 1081
    add-int v2, v7, v30

    .line 1082
    .line 1083
    if-gez v2, :cond_2c

    .line 1084
    .line 1085
    const/4 v10, 0x0

    .line 1086
    :goto_26
    move/from16 v37, v1

    .line 1087
    .line 1088
    goto :goto_27

    .line 1089
    :cond_2c
    move v10, v2

    .line 1090
    goto :goto_26

    .line 1091
    :goto_27
    neg-int v1, v0

    .line 1092
    move/from16 v45, v0

    .line 1093
    .line 1094
    move/from16 v47, v2

    .line 1095
    .line 1096
    move/from16 v46, v11

    .line 1097
    .line 1098
    const/4 v0, 0x0

    .line 1099
    const/16 v44, 0x0

    .line 1100
    .line 1101
    :goto_28
    iget v2, v9, Ldefpackage/ii;->p:I

    .line 1102
    .line 1103
    if-ge v0, v2, :cond_2e

    .line 1104
    .line 1105
    if-lt v1, v10, :cond_2d

    .line 1106
    .line 1107
    invoke-virtual {v9, v0}, Ldefpackage/ii;->b(I)Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    move/from16 v44, v33

    .line 1111
    .line 1112
    goto :goto_28

    .line 1113
    :cond_2d
    add-int/lit8 v46, v46, 0x1

    .line 1114
    .line 1115
    add-int/2addr v1, v6

    .line 1116
    add-int/lit8 v0, v0, 0x1

    .line 1117
    .line 1118
    goto :goto_28

    .line 1119
    :cond_2e
    move v2, v11

    .line 1120
    move/from16 v0, v37

    .line 1121
    .line 1122
    move/from16 v11, v46

    .line 1123
    .line 1124
    :goto_29
    if-ge v11, v3, :cond_30

    .line 1125
    .line 1126
    if-lt v1, v10, :cond_2f

    .line 1127
    .line 1128
    if-lez v1, :cond_2f

    .line 1129
    .line 1130
    invoke-virtual {v9}, Ldefpackage/ii;->isEmpty()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v37

    .line 1134
    if-eqz v37, :cond_30

    .line 1135
    .line 1136
    :cond_2f
    move/from16 v37, v10

    .line 1137
    .line 1138
    move-object/from16 v10, v20

    .line 1139
    .line 1140
    goto :goto_2a

    .line 1141
    :cond_30
    move/from16 v46, v2

    .line 1142
    .line 1143
    goto :goto_2d

    .line 1144
    :goto_2a
    invoke-interface/range {p1 .. p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v20

    .line 1148
    move/from16 v46, v2

    .line 1149
    .line 1150
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v2

    .line 1154
    move-object/from16 v20, v10

    .line 1155
    .line 1156
    add-int/lit8 v10, v3, -0x1

    .line 1157
    .line 1158
    if-ne v11, v10, :cond_31

    .line 1159
    .line 1160
    move/from16 v48, v22

    .line 1161
    .line 1162
    goto :goto_2b

    .line 1163
    :cond_31
    move/from16 v48, v6

    .line 1164
    .line 1165
    :goto_2b
    add-int v1, v1, v48

    .line 1166
    .line 1167
    if-gt v1, v8, :cond_32

    .line 1168
    .line 1169
    if-eq v11, v10, :cond_32

    .line 1170
    .line 1171
    add-int/lit8 v2, v11, 0x1

    .line 1172
    .line 1173
    sub-int v45, v45, v6

    .line 1174
    .line 1175
    move/from16 v44, v33

    .line 1176
    .line 1177
    goto :goto_2c

    .line 1178
    :cond_32
    iget v10, v2, Ldefpackage/xi2;->j:I

    .line 1179
    .line 1180
    invoke-static {v0, v10}, Ljava/lang/Math;->max(II)I

    .line 1181
    .line 1182
    .line 1183
    move-result v0

    .line 1184
    invoke-virtual {v9, v2}, Ldefpackage/ii;->addLast(Ljava/lang/Object;)V

    .line 1185
    .line 1186
    .line 1187
    move/from16 v2, v46

    .line 1188
    .line 1189
    :goto_2c
    add-int/lit8 v11, v11, 0x1

    .line 1190
    .line 1191
    move/from16 v10, v37

    .line 1192
    .line 1193
    goto :goto_29

    .line 1194
    :goto_2d
    if-ge v1, v7, :cond_35

    .line 1195
    .line 1196
    sub-int v2, v7, v1

    .line 1197
    .line 1198
    sub-int v45, v45, v2

    .line 1199
    .line 1200
    add-int/2addr v1, v2

    .line 1201
    move/from16 v8, v45

    .line 1202
    .line 1203
    move/from16 v2, v46

    .line 1204
    .line 1205
    :goto_2e
    if-ge v8, v4, :cond_33

    .line 1206
    .line 1207
    if-lez v2, :cond_33

    .line 1208
    .line 1209
    add-int/lit8 v2, v2, -0x1

    .line 1210
    .line 1211
    move-object/from16 v10, v20

    .line 1212
    .line 1213
    invoke-interface/range {p1 .. p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v20

    .line 1217
    move/from16 v46, v11

    .line 1218
    .line 1219
    move v11, v2

    .line 1220
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v2

    .line 1224
    move-object/from16 v20, v17

    .line 1225
    .line 1226
    move/from16 v17, v1

    .line 1227
    .line 1228
    const/4 v1, 0x0

    .line 1229
    invoke-virtual {v9, v1, v2}, Ldefpackage/ii;->add(ILjava/lang/Object;)V

    .line 1230
    .line 1231
    .line 1232
    iget v1, v2, Ldefpackage/xi2;->j:I

    .line 1233
    .line 1234
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 1235
    .line 1236
    .line 1237
    move-result v0

    .line 1238
    add-int/2addr v8, v6

    .line 1239
    move v2, v11

    .line 1240
    move/from16 v1, v17

    .line 1241
    .line 1242
    move-object/from16 v17, v20

    .line 1243
    .line 1244
    move/from16 v11, v46

    .line 1245
    .line 1246
    move-object/from16 v20, v10

    .line 1247
    .line 1248
    goto :goto_2e

    .line 1249
    :cond_33
    move-object/from16 v10, v20

    .line 1250
    .line 1251
    move-object/from16 v20, v17

    .line 1252
    .line 1253
    move/from16 v17, v1

    .line 1254
    .line 1255
    if-gez v8, :cond_34

    .line 1256
    .line 1257
    add-int v1, v17, v8

    .line 1258
    .line 1259
    const/4 v8, 0x0

    .line 1260
    goto :goto_2f

    .line 1261
    :cond_34
    move/from16 v1, v17

    .line 1262
    .line 1263
    goto :goto_2f

    .line 1264
    :cond_35
    move-object/from16 v10, v20

    .line 1265
    .line 1266
    move-object/from16 v20, v17

    .line 1267
    .line 1268
    move/from16 v8, v45

    .line 1269
    .line 1270
    move/from16 v2, v46

    .line 1271
    .line 1272
    :goto_2f
    if-ltz v8, :cond_36

    .line 1273
    .line 1274
    :goto_30
    move/from16 v37, v0

    .line 1275
    .line 1276
    goto :goto_31

    .line 1277
    :cond_36
    const-string v17, "invalid currentFirstPageScrollOffset"

    .line 1278
    .line 1279
    invoke-static/range {v17 .. v17}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 1280
    .line 1281
    .line 1282
    goto :goto_30

    .line 1283
    :goto_31
    neg-int v0, v8

    .line 1284
    invoke-virtual {v9}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v17

    .line 1288
    check-cast v17, Ldefpackage/xi2;

    .line 1289
    .line 1290
    if-gtz v4, :cond_39

    .line 1291
    .line 1292
    if-gez v36, :cond_37

    .line 1293
    .line 1294
    goto :goto_32

    .line 1295
    :cond_37
    move/from16 v45, v2

    .line 1296
    .line 1297
    :cond_38
    move-object/from16 v2, v17

    .line 1298
    .line 1299
    goto :goto_34

    .line 1300
    :cond_39
    :goto_32
    invoke-virtual {v9}, Ldefpackage/ii;->a()I

    .line 1301
    .line 1302
    .line 1303
    move-result v4

    .line 1304
    move/from16 v45, v2

    .line 1305
    .line 1306
    const/4 v2, 0x0

    .line 1307
    :goto_33
    if-ge v2, v4, :cond_38

    .line 1308
    .line 1309
    if-eqz v8, :cond_38

    .line 1310
    .line 1311
    if-gt v6, v8, :cond_38

    .line 1312
    .line 1313
    invoke-virtual {v9}, Ldefpackage/ii;->a()I

    .line 1314
    .line 1315
    .line 1316
    move-result v46

    .line 1317
    move/from16 v48, v4

    .line 1318
    .line 1319
    add-int/lit8 v4, v46, -0x1

    .line 1320
    .line 1321
    if-eq v2, v4, :cond_38

    .line 1322
    .line 1323
    sub-int/2addr v8, v6

    .line 1324
    add-int/lit8 v2, v2, 0x1

    .line 1325
    .line 1326
    invoke-virtual {v9, v2}, Ldefpackage/ii;->get(I)Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v4

    .line 1330
    move-object/from16 v17, v4

    .line 1331
    .line 1332
    check-cast v17, Ldefpackage/xi2;

    .line 1333
    .line 1334
    move/from16 v4, v48

    .line 1335
    .line 1336
    goto :goto_33

    .line 1337
    :goto_34
    sub-int v4, v45, v31

    .line 1338
    .line 1339
    move/from16 v46, v8

    .line 1340
    .line 1341
    const/4 v8, 0x0

    .line 1342
    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    .line 1343
    .line 1344
    .line 1345
    move-result v4

    .line 1346
    add-int/lit8 v8, v45, -0x1

    .line 1347
    .line 1348
    if-gt v4, v8, :cond_3b

    .line 1349
    .line 1350
    const/16 v17, 0x0

    .line 1351
    .line 1352
    :goto_35
    if-nez v17, :cond_3a

    .line 1353
    .line 1354
    new-instance v17, Ljava/util/ArrayList;

    .line 1355
    .line 1356
    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 1357
    .line 1358
    .line 1359
    :cond_3a
    move/from16 v45, v8

    .line 1360
    .line 1361
    move-object/from16 v8, v17

    .line 1362
    .line 1363
    move-object/from16 v17, v20

    .line 1364
    .line 1365
    invoke-interface/range {p1 .. p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v20

    .line 1369
    move/from16 v49, v11

    .line 1370
    .line 1371
    move/from16 v11, v45

    .line 1372
    .line 1373
    move/from16 v45, v6

    .line 1374
    .line 1375
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v6

    .line 1379
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1380
    .line 1381
    .line 1382
    if-eq v11, v4, :cond_3c

    .line 1383
    .line 1384
    add-int/lit8 v6, v11, -0x1

    .line 1385
    .line 1386
    move-object/from16 v20, v17

    .line 1387
    .line 1388
    move/from16 v11, v49

    .line 1389
    .line 1390
    move-object/from16 v17, v8

    .line 1391
    .line 1392
    move v8, v6

    .line 1393
    move/from16 v6, v45

    .line 1394
    .line 1395
    goto :goto_35

    .line 1396
    :cond_3b
    move/from16 v45, v6

    .line 1397
    .line 1398
    move/from16 v49, v11

    .line 1399
    .line 1400
    move-object/from16 v17, v20

    .line 1401
    .line 1402
    const/4 v8, 0x0

    .line 1403
    :cond_3c
    iget-object v6, v5, Ldefpackage/h03;->a:[I

    .line 1404
    .line 1405
    iget v11, v5, Ldefpackage/h03;->b:I

    .line 1406
    .line 1407
    move-object/from16 v48, v6

    .line 1408
    .line 1409
    const/4 v6, 0x0

    .line 1410
    :goto_36
    if-ge v6, v11, :cond_3f

    .line 1411
    .line 1412
    move/from16 v20, v11

    .line 1413
    .line 1414
    aget v11, v48, v6

    .line 1415
    .line 1416
    if-ge v11, v4, :cond_3e

    .line 1417
    .line 1418
    if-nez v8, :cond_3d

    .line 1419
    .line 1420
    new-instance v8, Ljava/util/ArrayList;

    .line 1421
    .line 1422
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1423
    .line 1424
    .line 1425
    :cond_3d
    move/from16 v50, v20

    .line 1426
    .line 1427
    invoke-interface/range {p1 .. p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v20

    .line 1431
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v11

    .line 1435
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1436
    .line 1437
    .line 1438
    goto :goto_37

    .line 1439
    :cond_3e
    move/from16 v50, v20

    .line 1440
    .line 1441
    :goto_37
    add-int/lit8 v6, v6, 0x1

    .line 1442
    .line 1443
    move/from16 v11, v50

    .line 1444
    .line 1445
    goto :goto_36

    .line 1446
    :cond_3f
    sget-object v4, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 1447
    .line 1448
    if-nez v8, :cond_40

    .line 1449
    .line 1450
    move-object v8, v4

    .line 1451
    :cond_40
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 1452
    .line 1453
    .line 1454
    move-result v6

    .line 1455
    move/from16 v11, v37

    .line 1456
    .line 1457
    move-object/from16 v37, v4

    .line 1458
    .line 1459
    const/4 v4, 0x0

    .line 1460
    :goto_38
    if-ge v4, v6, :cond_41

    .line 1461
    .line 1462
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v20

    .line 1466
    move/from16 v48, v4

    .line 1467
    .line 1468
    move-object/from16 v4, v20

    .line 1469
    .line 1470
    check-cast v4, Ldefpackage/xi2;

    .line 1471
    .line 1472
    iget v4, v4, Ldefpackage/xi2;->j:I

    .line 1473
    .line 1474
    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    .line 1475
    .line 1476
    .line 1477
    move-result v11

    .line 1478
    add-int/lit8 v4, v48, 0x1

    .line 1479
    .line 1480
    goto :goto_38

    .line 1481
    :cond_41
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v4

    .line 1485
    check-cast v4, Ldefpackage/xi2;

    .line 1486
    .line 1487
    iget v4, v4, Ldefpackage/xi2;->a:I

    .line 1488
    .line 1489
    sub-int v6, v3, v4

    .line 1490
    .line 1491
    add-int/lit8 v6, v6, -0x1

    .line 1492
    .line 1493
    move/from16 v20, v4

    .line 1494
    .line 1495
    move/from16 v4, v31

    .line 1496
    .line 1497
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 1498
    .line 1499
    .line 1500
    move-result v6

    .line 1501
    add-int v6, v6, v20

    .line 1502
    .line 1503
    add-int/lit8 v4, v20, 0x1

    .line 1504
    .line 1505
    if-gt v4, v6, :cond_43

    .line 1506
    .line 1507
    const/16 v20, 0x0

    .line 1508
    .line 1509
    :goto_39
    if-nez v20, :cond_42

    .line 1510
    .line 1511
    new-instance v20, Ljava/util/ArrayList;

    .line 1512
    .line 1513
    invoke-direct/range {v20 .. v20}, Ljava/util/ArrayList;-><init>()V

    .line 1514
    .line 1515
    .line 1516
    :cond_42
    move/from16 v48, v4

    .line 1517
    .line 1518
    move-object/from16 v4, v20

    .line 1519
    .line 1520
    invoke-interface/range {p1 .. p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v20

    .line 1524
    move/from16 v50, v48

    .line 1525
    .line 1526
    move/from16 v48, v11

    .line 1527
    .line 1528
    move/from16 v11, v50

    .line 1529
    .line 1530
    move-object/from16 v50, v8

    .line 1531
    .line 1532
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v8

    .line 1536
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1537
    .line 1538
    .line 1539
    if-eq v11, v6, :cond_44

    .line 1540
    .line 1541
    add-int/lit8 v8, v11, 0x1

    .line 1542
    .line 1543
    move-object/from16 v20, v4

    .line 1544
    .line 1545
    move v4, v8

    .line 1546
    move/from16 v11, v48

    .line 1547
    .line 1548
    move-object/from16 v8, v50

    .line 1549
    .line 1550
    goto :goto_39

    .line 1551
    :cond_43
    move-object/from16 v50, v8

    .line 1552
    .line 1553
    move/from16 v48, v11

    .line 1554
    .line 1555
    const/4 v4, 0x0

    .line 1556
    :cond_44
    iget-object v8, v5, Ldefpackage/h03;->a:[I

    .line 1557
    .line 1558
    iget v5, v5, Ldefpackage/h03;->b:I

    .line 1559
    .line 1560
    const/4 v11, 0x0

    .line 1561
    :goto_3a
    if-ge v11, v5, :cond_47

    .line 1562
    .line 1563
    move/from16 v20, v11

    .line 1564
    .line 1565
    aget v11, v8, v20

    .line 1566
    .line 1567
    move-object/from16 v51, v4

    .line 1568
    .line 1569
    add-int/lit8 v4, v6, 0x1

    .line 1570
    .line 1571
    if-gt v4, v11, :cond_46

    .line 1572
    .line 1573
    if-ge v11, v3, :cond_46

    .line 1574
    .line 1575
    if-nez v51, :cond_45

    .line 1576
    .line 1577
    new-instance v4, Ljava/util/ArrayList;

    .line 1578
    .line 1579
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1580
    .line 1581
    .line 1582
    :goto_3b
    move/from16 v51, v20

    .line 1583
    .line 1584
    goto :goto_3c

    .line 1585
    :cond_45
    move-object/from16 v4, v51

    .line 1586
    .line 1587
    goto :goto_3b

    .line 1588
    :goto_3c
    invoke-interface/range {p1 .. p1}, Ldefpackage/wi2;->getLayoutDirection()Ldefpackage/r62;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v20

    .line 1592
    move/from16 v52, v51

    .line 1593
    .line 1594
    invoke-static/range {v10 .. v23}, Ldefpackage/gb;->z(Ldefpackage/f82;IJLdefpackage/nc3;JLdefpackage/hb3;Ldefpackage/fs;Ldefpackage/gs;Ldefpackage/r62;ZILdefpackage/i03;)Ldefpackage/xi2;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v11

    .line 1598
    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1599
    .line 1600
    .line 1601
    goto :goto_3d

    .line 1602
    :cond_46
    move/from16 v52, v20

    .line 1603
    .line 1604
    move-object/from16 v4, v51

    .line 1605
    .line 1606
    :goto_3d
    add-int/lit8 v11, v52, 0x1

    .line 1607
    .line 1608
    goto :goto_3a

    .line 1609
    :cond_47
    move-object/from16 v51, v4

    .line 1610
    .line 1611
    if-nez v51, :cond_48

    .line 1612
    .line 1613
    move-object/from16 v4, v37

    .line 1614
    .line 1615
    goto :goto_3e

    .line 1616
    :cond_48
    move-object/from16 v4, v51

    .line 1617
    .line 1618
    :goto_3e
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1619
    .line 1620
    .line 1621
    move-result v5

    .line 1622
    move/from16 v11, v48

    .line 1623
    .line 1624
    const/4 v6, 0x0

    .line 1625
    :goto_3f
    if-ge v6, v5, :cond_49

    .line 1626
    .line 1627
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v8

    .line 1631
    check-cast v8, Ldefpackage/xi2;

    .line 1632
    .line 1633
    iget v8, v8, Ldefpackage/xi2;->j:I

    .line 1634
    .line 1635
    invoke-static {v11, v8}, Ljava/lang/Math;->max(II)I

    .line 1636
    .line 1637
    .line 1638
    move-result v11

    .line 1639
    add-int/lit8 v6, v6, 0x1

    .line 1640
    .line 1641
    goto :goto_3f

    .line 1642
    :cond_49
    invoke-virtual {v9}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v5

    .line 1646
    invoke-static {v2, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v5

    .line 1650
    if-eqz v5, :cond_4a

    .line 1651
    .line 1652
    invoke-interface/range {v50 .. v50}, Ljava/util/List;->isEmpty()Z

    .line 1653
    .line 1654
    .line 1655
    move-result v5

    .line 1656
    if-eqz v5, :cond_4a

    .line 1657
    .line 1658
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1659
    .line 1660
    .line 1661
    move-result v5

    .line 1662
    if-eqz v5, :cond_4a

    .line 1663
    .line 1664
    move/from16 v5, v33

    .line 1665
    .line 1666
    :goto_40
    move-wide/from16 v14, v26

    .line 1667
    .line 1668
    goto :goto_41

    .line 1669
    :cond_4a
    const/4 v5, 0x0

    .line 1670
    goto :goto_40

    .line 1671
    :goto_41
    invoke-static {v1, v14, v15}, Ldefpackage/qc0;->f(IJ)I

    .line 1672
    .line 1673
    .line 1674
    move-result v6

    .line 1675
    invoke-static {v11, v14, v15}, Ldefpackage/qc0;->e(IJ)I

    .line 1676
    .line 1677
    .line 1678
    move-result v8

    .line 1679
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 1680
    .line 1681
    .line 1682
    move-result v11

    .line 1683
    if-ge v1, v11, :cond_4b

    .line 1684
    .line 1685
    move/from16 v11, v33

    .line 1686
    .line 1687
    goto :goto_42

    .line 1688
    :cond_4b
    const/4 v11, 0x0

    .line 1689
    :goto_42
    if-eqz v11, :cond_4d

    .line 1690
    .line 1691
    if-nez v0, :cond_4c

    .line 1692
    .line 1693
    goto :goto_43

    .line 1694
    :cond_4c
    new-instance v14, Ljava/lang/StringBuilder;

    .line 1695
    .line 1696
    const-string v15, "non-zero pagesScrollOffset="

    .line 1697
    .line 1698
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1702
    .line 1703
    .line 1704
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v14

    .line 1708
    invoke-static {v14}, Ldefpackage/fz1;->c(Ljava/lang/String;)V

    .line 1709
    .line 1710
    .line 1711
    :cond_4d
    :goto_43
    new-instance v14, Ljava/util/ArrayList;

    .line 1712
    .line 1713
    invoke-virtual {v9}, Ldefpackage/ii;->a()I

    .line 1714
    .line 1715
    .line 1716
    move-result v15

    .line 1717
    invoke-interface/range {v50 .. v50}, Ljava/util/List;->size()I

    .line 1718
    .line 1719
    .line 1720
    move-result v16

    .line 1721
    add-int v16, v16, v15

    .line 1722
    .line 1723
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1724
    .line 1725
    .line 1726
    move-result v15

    .line 1727
    add-int v15, v15, v16

    .line 1728
    .line 1729
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 1730
    .line 1731
    .line 1732
    if-eqz v11, :cond_55

    .line 1733
    .line 1734
    invoke-interface/range {v50 .. v50}, Ljava/util/List;->isEmpty()Z

    .line 1735
    .line 1736
    .line 1737
    move-result v0

    .line 1738
    if-eqz v0, :cond_4e

    .line 1739
    .line 1740
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1741
    .line 1742
    .line 1743
    move-result v0

    .line 1744
    if-eqz v0, :cond_4e

    .line 1745
    .line 1746
    goto :goto_44

    .line 1747
    :cond_4e
    const-string v0, "No extra pages"

    .line 1748
    .line 1749
    invoke-static {v0}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 1750
    .line 1751
    .line 1752
    :goto_44
    invoke-virtual {v9}, Ldefpackage/ii;->a()I

    .line 1753
    .line 1754
    .line 1755
    move-result v0

    .line 1756
    new-array v11, v0, [I

    .line 1757
    .line 1758
    const/4 v15, 0x0

    .line 1759
    :goto_45
    if-ge v15, v0, :cond_4f

    .line 1760
    .line 1761
    aput v22, v11, v15

    .line 1762
    .line 1763
    add-int/lit8 v15, v15, 0x1

    .line 1764
    .line 1765
    goto :goto_45

    .line 1766
    :cond_4f
    new-array v15, v0, [I

    .line 1767
    .line 1768
    move/from16 v16, v0

    .line 1769
    .line 1770
    move-object/from16 v19, v2

    .line 1771
    .line 1772
    move/from16 v18, v31

    .line 1773
    .line 1774
    move-object/from16 v0, p1

    .line 1775
    .line 1776
    move-wide/from16 v53, v12

    .line 1777
    .line 1778
    move/from16 v12, v32

    .line 1779
    .line 1780
    move-wide/from16 v31, v53

    .line 1781
    .line 1782
    move/from16 v13, v36

    .line 1783
    .line 1784
    invoke-interface {v0, v13}, Ldefpackage/oo0;->B(I)F

    .line 1785
    .line 1786
    .line 1787
    move-result v2

    .line 1788
    move/from16 p1, v5

    .line 1789
    .line 1790
    array-length v5, v11

    .line 1791
    if-nez v5, :cond_50

    .line 1792
    .line 1793
    move-object/from16 v20, v10

    .line 1794
    .line 1795
    goto :goto_47

    .line 1796
    :cond_50
    invoke-interface {v10, v2}, Ldefpackage/oo0;->V(F)I

    .line 1797
    .line 1798
    .line 1799
    move-result v2

    .line 1800
    array-length v5, v11

    .line 1801
    move-object/from16 v20, v10

    .line 1802
    .line 1803
    move-object/from16 v21, v11

    .line 1804
    .line 1805
    const/4 v10, 0x0

    .line 1806
    const/4 v11, 0x0

    .line 1807
    const/16 v23, 0x0

    .line 1808
    .line 1809
    :goto_46
    if-ge v10, v5, :cond_51

    .line 1810
    .line 1811
    aget v26, v21, v10

    .line 1812
    .line 1813
    add-int/lit8 v27, v23, 0x1

    .line 1814
    .line 1815
    move/from16 v29, v5

    .line 1816
    .line 1817
    sub-int v5, v6, v26

    .line 1818
    .line 1819
    invoke-static {v11, v5}, Ljava/lang/Math;->min(II)I

    .line 1820
    .line 1821
    .line 1822
    move-result v5

    .line 1823
    aput v5, v15, v23

    .line 1824
    .line 1825
    sub-int v5, v6, v5

    .line 1826
    .line 1827
    sub-int v5, v5, v26

    .line 1828
    .line 1829
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 1830
    .line 1831
    .line 1832
    move-result v5

    .line 1833
    aget v11, v15, v23

    .line 1834
    .line 1835
    add-int v11, v11, v26

    .line 1836
    .line 1837
    add-int/2addr v11, v5

    .line 1838
    add-int/lit8 v10, v10, 0x1

    .line 1839
    .line 1840
    move/from16 v23, v27

    .line 1841
    .line 1842
    move/from16 v5, v29

    .line 1843
    .line 1844
    goto :goto_46

    .line 1845
    :cond_51
    :goto_47
    new-instance v2, Ldefpackage/j02;

    .line 1846
    .line 1847
    add-int/lit8 v5, v16, -0x1

    .line 1848
    .line 1849
    move/from16 v11, v33

    .line 1850
    .line 1851
    const/4 v10, 0x0

    .line 1852
    invoke-direct {v2, v10, v5, v11}, Ldefpackage/h02;-><init>(III)V

    .line 1853
    .line 1854
    .line 1855
    iget v5, v2, Ldefpackage/h02;->o:I

    .line 1856
    .line 1857
    iget v2, v2, Ldefpackage/h02;->p:I

    .line 1858
    .line 1859
    if-lez v2, :cond_52

    .line 1860
    .line 1861
    if-gez v5, :cond_53

    .line 1862
    .line 1863
    :cond_52
    if-gez v2, :cond_54

    .line 1864
    .line 1865
    if-gtz v5, :cond_54

    .line 1866
    .line 1867
    :cond_53
    const/4 v10, 0x0

    .line 1868
    :goto_48
    aget v11, v15, v10

    .line 1869
    .line 1870
    invoke-virtual {v9, v10}, Ldefpackage/ii;->get(I)Ljava/lang/Object;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v16

    .line 1874
    move/from16 v21, v2

    .line 1875
    .line 1876
    move-object/from16 v2, v16

    .line 1877
    .line 1878
    check-cast v2, Ldefpackage/xi2;

    .line 1879
    .line 1880
    invoke-virtual {v2, v11, v6, v8}, Ldefpackage/xi2;->b(III)V

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1884
    .line 1885
    .line 1886
    if-eq v10, v5, :cond_54

    .line 1887
    .line 1888
    add-int v10, v10, v21

    .line 1889
    .line 1890
    move/from16 v2, v21

    .line 1891
    .line 1892
    goto :goto_48

    .line 1893
    :cond_54
    move-object/from16 v15, v50

    .line 1894
    .line 1895
    goto/16 :goto_4c

    .line 1896
    .line 1897
    :cond_55
    move-object/from16 v19, v2

    .line 1898
    .line 1899
    move-object/from16 v20, v10

    .line 1900
    .line 1901
    move/from16 v18, v31

    .line 1902
    .line 1903
    move v2, v0

    .line 1904
    move-object/from16 v0, p1

    .line 1905
    .line 1906
    move/from16 p1, v5

    .line 1907
    .line 1908
    move-wide/from16 v53, v12

    .line 1909
    .line 1910
    move/from16 v12, v32

    .line 1911
    .line 1912
    move-wide/from16 v31, v53

    .line 1913
    .line 1914
    move/from16 v13, v36

    .line 1915
    .line 1916
    invoke-interface/range {v50 .. v50}, Ljava/util/Collection;->size()I

    .line 1917
    .line 1918
    .line 1919
    move-result v5

    .line 1920
    move v11, v2

    .line 1921
    const/4 v10, 0x0

    .line 1922
    :goto_49
    if-ge v10, v5, :cond_56

    .line 1923
    .line 1924
    move-object/from16 v15, v50

    .line 1925
    .line 1926
    invoke-interface {v15, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v16

    .line 1930
    move/from16 v21, v2

    .line 1931
    .line 1932
    move-object/from16 v2, v16

    .line 1933
    .line 1934
    check-cast v2, Ldefpackage/xi2;

    .line 1935
    .line 1936
    sub-int v11, v11, v29

    .line 1937
    .line 1938
    invoke-virtual {v2, v11, v6, v8}, Ldefpackage/xi2;->b(III)V

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1942
    .line 1943
    .line 1944
    add-int/lit8 v10, v10, 0x1

    .line 1945
    .line 1946
    move/from16 v2, v21

    .line 1947
    .line 1948
    goto :goto_49

    .line 1949
    :cond_56
    move/from16 v21, v2

    .line 1950
    .line 1951
    move-object/from16 v15, v50

    .line 1952
    .line 1953
    invoke-virtual {v9}, Ldefpackage/ii;->a()I

    .line 1954
    .line 1955
    .line 1956
    move-result v2

    .line 1957
    move/from16 v5, v21

    .line 1958
    .line 1959
    const/4 v10, 0x0

    .line 1960
    :goto_4a
    if-ge v10, v2, :cond_57

    .line 1961
    .line 1962
    invoke-virtual {v9, v10}, Ldefpackage/ii;->get(I)Ljava/lang/Object;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v11

    .line 1966
    check-cast v11, Ldefpackage/xi2;

    .line 1967
    .line 1968
    invoke-virtual {v11, v5, v6, v8}, Ldefpackage/xi2;->b(III)V

    .line 1969
    .line 1970
    .line 1971
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1972
    .line 1973
    .line 1974
    add-int v5, v5, v29

    .line 1975
    .line 1976
    add-int/lit8 v10, v10, 0x1

    .line 1977
    .line 1978
    goto :goto_4a

    .line 1979
    :cond_57
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 1980
    .line 1981
    .line 1982
    move-result v2

    .line 1983
    const/4 v10, 0x0

    .line 1984
    :goto_4b
    if-ge v10, v2, :cond_58

    .line 1985
    .line 1986
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v11

    .line 1990
    check-cast v11, Ldefpackage/xi2;

    .line 1991
    .line 1992
    invoke-virtual {v11, v5, v6, v8}, Ldefpackage/xi2;->b(III)V

    .line 1993
    .line 1994
    .line 1995
    invoke-virtual {v14, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1996
    .line 1997
    .line 1998
    add-int v5, v5, v29

    .line 1999
    .line 2000
    add-int/lit8 v10, v10, 0x1

    .line 2001
    .line 2002
    goto :goto_4b

    .line 2003
    :cond_58
    :goto_4c
    if-eqz p1, :cond_59

    .line 2004
    .line 2005
    move-object v11, v14

    .line 2006
    :goto_4d
    move-object/from16 p1, v4

    .line 2007
    .line 2008
    move/from16 v23, v6

    .line 2009
    .line 2010
    goto :goto_4f

    .line 2011
    :cond_59
    new-instance v2, Ljava/util/ArrayList;

    .line 2012
    .line 2013
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2014
    .line 2015
    .line 2016
    move-result v5

    .line 2017
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2018
    .line 2019
    .line 2020
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2021
    .line 2022
    .line 2023
    move-result v5

    .line 2024
    const/4 v10, 0x0

    .line 2025
    :goto_4e
    if-ge v10, v5, :cond_5b

    .line 2026
    .line 2027
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v11

    .line 2031
    move-object/from16 p1, v4

    .line 2032
    .line 2033
    move-object v4, v11

    .line 2034
    check-cast v4, Ldefpackage/xi2;

    .line 2035
    .line 2036
    move/from16 v16, v5

    .line 2037
    .line 2038
    iget v5, v4, Ldefpackage/xi2;->a:I

    .line 2039
    .line 2040
    invoke-virtual {v9}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v21

    .line 2044
    move/from16 v23, v6

    .line 2045
    .line 2046
    move-object/from16 v6, v21

    .line 2047
    .line 2048
    check-cast v6, Ldefpackage/xi2;

    .line 2049
    .line 2050
    iget v6, v6, Ldefpackage/xi2;->a:I

    .line 2051
    .line 2052
    if-lt v5, v6, :cond_5a

    .line 2053
    .line 2054
    iget v4, v4, Ldefpackage/xi2;->a:I

    .line 2055
    .line 2056
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v5

    .line 2060
    check-cast v5, Ldefpackage/xi2;

    .line 2061
    .line 2062
    iget v5, v5, Ldefpackage/xi2;->a:I

    .line 2063
    .line 2064
    if-gt v4, v5, :cond_5a

    .line 2065
    .line 2066
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2067
    .line 2068
    .line 2069
    :cond_5a
    add-int/lit8 v10, v10, 0x1

    .line 2070
    .line 2071
    move-object/from16 v4, p1

    .line 2072
    .line 2073
    move/from16 v5, v16

    .line 2074
    .line 2075
    move/from16 v6, v23

    .line 2076
    .line 2077
    goto :goto_4e

    .line 2078
    :cond_5b
    move-object v11, v2

    .line 2079
    goto :goto_4d

    .line 2080
    :goto_4f
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    .line 2081
    .line 2082
    .line 2083
    move-result v2

    .line 2084
    if-eqz v2, :cond_5c

    .line 2085
    .line 2086
    move-object/from16 v27, v37

    .line 2087
    .line 2088
    goto :goto_51

    .line 2089
    :cond_5c
    new-instance v2, Ljava/util/ArrayList;

    .line 2090
    .line 2091
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2092
    .line 2093
    .line 2094
    move-result v4

    .line 2095
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 2096
    .line 2097
    .line 2098
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2099
    .line 2100
    .line 2101
    move-result v4

    .line 2102
    const/4 v5, 0x0

    .line 2103
    :goto_50
    if-ge v5, v4, :cond_5e

    .line 2104
    .line 2105
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v6

    .line 2109
    move-object v10, v6

    .line 2110
    check-cast v10, Ldefpackage/xi2;

    .line 2111
    .line 2112
    iget v10, v10, Ldefpackage/xi2;->a:I

    .line 2113
    .line 2114
    invoke-virtual {v9}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v15

    .line 2118
    check-cast v15, Ldefpackage/xi2;

    .line 2119
    .line 2120
    iget v15, v15, Ldefpackage/xi2;->a:I

    .line 2121
    .line 2122
    if-ge v10, v15, :cond_5d

    .line 2123
    .line 2124
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2125
    .line 2126
    .line 2127
    :cond_5d
    add-int/lit8 v5, v5, 0x1

    .line 2128
    .line 2129
    goto :goto_50

    .line 2130
    :cond_5e
    move-object/from16 v27, v2

    .line 2131
    .line 2132
    :goto_51
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    .line 2133
    .line 2134
    .line 2135
    move-result v2

    .line 2136
    if-eqz v2, :cond_5f

    .line 2137
    .line 2138
    move-object/from16 v4, v37

    .line 2139
    .line 2140
    goto :goto_53

    .line 2141
    :cond_5f
    new-instance v4, Ljava/util/ArrayList;

    .line 2142
    .line 2143
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2144
    .line 2145
    .line 2146
    move-result v2

    .line 2147
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 2148
    .line 2149
    .line 2150
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 2151
    .line 2152
    .line 2153
    move-result v2

    .line 2154
    const/4 v5, 0x0

    .line 2155
    :goto_52
    if-ge v5, v2, :cond_61

    .line 2156
    .line 2157
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v6

    .line 2161
    move-object v10, v6

    .line 2162
    check-cast v10, Ldefpackage/xi2;

    .line 2163
    .line 2164
    iget v10, v10, Ldefpackage/xi2;->a:I

    .line 2165
    .line 2166
    invoke-virtual {v9}, Ldefpackage/ii;->last()Ljava/lang/Object;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v15

    .line 2170
    check-cast v15, Ldefpackage/xi2;

    .line 2171
    .line 2172
    iget v15, v15, Ldefpackage/xi2;->a:I

    .line 2173
    .line 2174
    if-le v10, v15, :cond_60

    .line 2175
    .line 2176
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2177
    .line 2178
    .line 2179
    :cond_60
    add-int/lit8 v5, v5, 0x1

    .line 2180
    .line 2181
    goto :goto_52

    .line 2182
    :cond_61
    :goto_53
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 2183
    .line 2184
    .line 2185
    move-result v2

    .line 2186
    if-eqz v2, :cond_62

    .line 2187
    .line 2188
    const/4 v6, 0x0

    .line 2189
    goto :goto_55

    .line 2190
    :cond_62
    const/4 v10, 0x0

    .line 2191
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2192
    .line 2193
    .line 2194
    move-result-object v2

    .line 2195
    move-object v5, v2

    .line 2196
    check-cast v5, Ldefpackage/xi2;

    .line 2197
    .line 2198
    iget v5, v5, Ldefpackage/xi2;->l:I

    .line 2199
    .line 2200
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2201
    .line 2202
    .line 2203
    int-to-float v5, v5

    .line 2204
    sub-float v5, v5, p0

    .line 2205
    .line 2206
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 2207
    .line 2208
    .line 2209
    move-result v5

    .line 2210
    neg-float v5, v5

    .line 2211
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 2212
    .line 2213
    .line 2214
    move-result v6

    .line 2215
    const/4 v9, 0x1

    .line 2216
    sub-int/2addr v6, v9

    .line 2217
    if-gt v9, v6, :cond_64

    .line 2218
    .line 2219
    const/4 v9, 0x1

    .line 2220
    :goto_54
    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v10

    .line 2224
    move-object v15, v10

    .line 2225
    check-cast v15, Ldefpackage/xi2;

    .line 2226
    .line 2227
    iget v15, v15, Ldefpackage/xi2;->l:I

    .line 2228
    .line 2229
    int-to-float v15, v15

    .line 2230
    sub-float v15, v15, p0

    .line 2231
    .line 2232
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 2233
    .line 2234
    .line 2235
    move-result v15

    .line 2236
    neg-float v15, v15

    .line 2237
    invoke-static {v5, v15}, Ljava/lang/Float;->compare(FF)I

    .line 2238
    .line 2239
    .line 2240
    move-result v16

    .line 2241
    if-gez v16, :cond_63

    .line 2242
    .line 2243
    move-object v2, v10

    .line 2244
    move v5, v15

    .line 2245
    :cond_63
    if-eq v9, v6, :cond_64

    .line 2246
    .line 2247
    add-int/lit8 v9, v9, 0x1

    .line 2248
    .line 2249
    goto :goto_54

    .line 2250
    :cond_64
    move-object v6, v2

    .line 2251
    :goto_55
    check-cast v6, Ldefpackage/xi2;

    .line 2252
    .line 2253
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2254
    .line 2255
    .line 2256
    if-eqz v6, :cond_65

    .line 2257
    .line 2258
    iget v2, v6, Ldefpackage/xi2;->l:I

    .line 2259
    .line 2260
    goto :goto_56

    .line 2261
    :cond_65
    const/4 v2, 0x0

    .line 2262
    :goto_56
    if-nez v45, :cond_66

    .line 2263
    .line 2264
    move/from16 v21, p0

    .line 2265
    .line 2266
    goto :goto_57

    .line 2267
    :cond_66
    const/16 v34, 0x0

    .line 2268
    .line 2269
    rsub-int/lit8 v2, v2, 0x0

    .line 2270
    .line 2271
    int-to-float v2, v2

    .line 2272
    move/from16 v5, v45

    .line 2273
    .line 2274
    int-to-float v5, v5

    .line 2275
    div-float/2addr v2, v5

    .line 2276
    const/high16 v5, -0x41000000    # -0.5f

    .line 2277
    .line 2278
    const/high16 v9, 0x3f000000    # 0.5f

    .line 2279
    .line 2280
    invoke-static {v2, v5, v9}, Ldefpackage/gb;->l(FFF)F

    .line 2281
    .line 2282
    .line 2283
    move-result v2

    .line 2284
    move/from16 v21, v2

    .line 2285
    .line 2286
    :goto_57
    new-instance v2, Ldefpackage/o;

    .line 2287
    .line 2288
    move/from16 v9, v38

    .line 2289
    .line 2290
    move-object/from16 v5, v43

    .line 2291
    .line 2292
    invoke-direct {v2, v9, v5, v14}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 2293
    .line 2294
    .line 2295
    add-int v5, v23, p2

    .line 2296
    .line 2297
    move-wide/from16 v9, v40

    .line 2298
    .line 2299
    invoke-static {v5, v9, v10}, Ldefpackage/qc0;->f(IJ)I

    .line 2300
    .line 2301
    .line 2302
    move-result v5

    .line 2303
    add-int v8, v8, v42

    .line 2304
    .line 2305
    invoke-static {v8, v9, v10}, Ldefpackage/qc0;->e(IJ)I

    .line 2306
    .line 2307
    .line 2308
    move-result v8

    .line 2309
    move-object/from16 v9, v28

    .line 2310
    .line 2311
    invoke-interface {v0, v5, v8, v9, v2}, Ldefpackage/wi2;->v(IILjava/util/Map;Ldefpackage/if1;)Ldefpackage/vi2;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v25

    .line 2315
    move/from16 v2, v49

    .line 2316
    .line 2317
    if-lt v2, v3, :cond_68

    .line 2318
    .line 2319
    if-le v1, v7, :cond_67

    .line 2320
    .line 2321
    goto :goto_58

    .line 2322
    :cond_67
    const/16 v23, 0x0

    .line 2323
    .line 2324
    goto :goto_59

    .line 2325
    :cond_68
    :goto_58
    const/16 v23, 0x1

    .line 2326
    .line 2327
    :goto_59
    new-instance v10, Ldefpackage/qc3;

    .line 2328
    .line 2329
    move-object/from16 v28, v4

    .line 2330
    .line 2331
    move/from16 v16, v12

    .line 2332
    .line 2333
    move-object/from16 v15, v17

    .line 2334
    .line 2335
    move/from16 v12, v22

    .line 2336
    .line 2337
    move/from16 v14, v30

    .line 2338
    .line 2339
    move-object/from16 v29, v35

    .line 2340
    .line 2341
    move/from16 v26, v44

    .line 2342
    .line 2343
    move/from16 v22, v46

    .line 2344
    .line 2345
    move/from16 v17, v47

    .line 2346
    .line 2347
    move-object/from16 v30, v20

    .line 2348
    .line 2349
    move-object/from16 v20, v6

    .line 2350
    .line 2351
    invoke-direct/range {v10 .. v32}, Ldefpackage/qc3;-><init>(Ljava/util/List;IIILdefpackage/hb3;IIILdefpackage/xi2;Ldefpackage/xi2;FIZLdefpackage/rv2;Ldefpackage/vi2;ZLjava/util/List;Ljava/util/List;Ldefpackage/we0;Ldefpackage/oo0;J)V

    .line 2352
    .line 2353
    .line 2354
    move-object v1, v10

    .line 2355
    move-object/from16 v10, v30

    .line 2356
    .line 2357
    goto/16 :goto_21

    .line 2358
    .line 2359
    :goto_5a
    invoke-interface {v0}, Ldefpackage/wi2;->K()Z

    .line 2360
    .line 2361
    .line 2362
    move-result v0

    .line 2363
    move-object/from16 v9, v39

    .line 2364
    .line 2365
    const/4 v1, 0x0

    .line 2366
    invoke-virtual {v9, v6, v0, v1}, Ldefpackage/ad3;->h(Ldefpackage/qc3;ZZ)V

    .line 2367
    .line 2368
    .line 2369
    iget-object v0, v9, Ldefpackage/ad3;->u:Ldefpackage/fc3;

    .line 2370
    .line 2371
    iget-object v1, v6, Ldefpackage/qc3;->a:Ljava/util/List;

    .line 2372
    .line 2373
    const-string v2, "compose:pager:cache_window:keepAroundItems"

    .line 2374
    .line 2375
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2376
    .line 2377
    .line 2378
    :try_start_1
    iget v2, v0, Ldefpackage/fc3;->h:I

    .line 2379
    .line 2380
    const v11, 0x7fffffff

    .line 2381
    .line 2382
    .line 2383
    if-eq v2, v11, :cond_6a

    .line 2384
    .line 2385
    iget v2, v0, Ldefpackage/fc3;->i:I

    .line 2386
    .line 2387
    const/high16 v3, -0x80000000

    .line 2388
    .line 2389
    if-eq v2, v3, :cond_6a

    .line 2390
    .line 2391
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 2392
    .line 2393
    .line 2394
    move-result v2

    .line 2395
    if-nez v2, :cond_6a

    .line 2396
    .line 2397
    invoke-static {v1}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v2

    .line 2401
    check-cast v2, Ldefpackage/xi2;

    .line 2402
    .line 2403
    iget v2, v2, Ldefpackage/xi2;->a:I

    .line 2404
    .line 2405
    invoke-static {v1}, Ldefpackage/q40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 2406
    .line 2407
    .line 2408
    move-result-object v1

    .line 2409
    check-cast v1, Ldefpackage/xi2;

    .line 2410
    .line 2411
    iget v1, v1, Ldefpackage/xi2;->a:I

    .line 2412
    .line 2413
    iget v3, v0, Ldefpackage/fc3;->h:I

    .line 2414
    .line 2415
    :goto_5b
    if-ge v3, v2, :cond_69

    .line 2416
    .line 2417
    invoke-virtual {v10, v3}, Ldefpackage/f82;->a(I)Ljava/util/List;

    .line 2418
    .line 2419
    .line 2420
    add-int/lit8 v3, v3, 0x1

    .line 2421
    .line 2422
    goto :goto_5b

    .line 2423
    :cond_69
    const/16 v33, 0x1

    .line 2424
    .line 2425
    add-int/lit8 v1, v1, 0x1

    .line 2426
    .line 2427
    iget v0, v0, Ldefpackage/fc3;->i:I

    .line 2428
    .line 2429
    if-gt v1, v0, :cond_6a

    .line 2430
    .line 2431
    :goto_5c
    invoke-virtual {v10, v1}, Ldefpackage/f82;->a(I)Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2432
    .line 2433
    .line 2434
    if-eq v1, v0, :cond_6a

    .line 2435
    .line 2436
    add-int/lit8 v1, v1, 0x1

    .line 2437
    .line 2438
    goto :goto_5c

    .line 2439
    :catchall_0
    move-exception v0

    .line 2440
    goto :goto_5e

    .line 2441
    :cond_6a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2442
    .line 2443
    .line 2444
    :goto_5d
    return-object v6

    .line 2445
    :goto_5e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2446
    .line 2447
    .line 2448
    throw v0

    .line 2449
    :catchall_1
    move-exception v0

    .line 2450
    invoke-static {v5, v10, v6}, Ldefpackage/ya4;->H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V

    .line 2451
    .line 2452
    .line 2453
    throw v0

    .line 2454
    :pswitch_5
    const/16 v32, -0x1

    .line 2455
    .line 2456
    check-cast v0, Ldefpackage/c82;

    .line 2457
    .line 2458
    check-cast v9, Ldefpackage/b82;

    .line 2459
    .line 2460
    iget-object v13, v9, Ldefpackage/b82;->a:Ljava/lang/Object;

    .line 2461
    .line 2462
    move-object/from16 v14, p1

    .line 2463
    .line 2464
    check-cast v14, Ldefpackage/rg1;

    .line 2465
    .line 2466
    check-cast v1, Ljava/lang/Integer;

    .line 2467
    .line 2468
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2469
    .line 2470
    .line 2471
    move-result v1

    .line 2472
    and-int/lit8 v2, v1, 0x3

    .line 2473
    .line 2474
    if-eq v2, v5, :cond_6b

    .line 2475
    .line 2476
    const/4 v2, 0x1

    .line 2477
    :goto_5f
    const/16 v33, 0x1

    .line 2478
    .line 2479
    goto :goto_60

    .line 2480
    :cond_6b
    const/4 v2, 0x0

    .line 2481
    goto :goto_5f

    .line 2482
    :goto_60
    and-int/lit8 v1, v1, 0x1

    .line 2483
    .line 2484
    invoke-virtual {v14, v1, v2}, Ldefpackage/rg1;->K(IZ)Z

    .line 2485
    .line 2486
    .line 2487
    move-result v1

    .line 2488
    if-eqz v1, :cond_73

    .line 2489
    .line 2490
    iget-object v1, v0, Ldefpackage/c82;->b:Ldefpackage/wc;

    .line 2491
    .line 2492
    invoke-virtual {v1}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 2493
    .line 2494
    .line 2495
    move-result-object v1

    .line 2496
    move-object v10, v1

    .line 2497
    check-cast v10, Ldefpackage/nc3;

    .line 2498
    .line 2499
    iget v1, v9, Ldefpackage/b82;->b:I

    .line 2500
    .line 2501
    invoke-virtual {v10}, Ldefpackage/nc3;->b()I

    .line 2502
    .line 2503
    .line 2504
    move-result v2

    .line 2505
    if-ge v1, v2, :cond_6e

    .line 2506
    .line 2507
    invoke-virtual {v10, v1}, Ldefpackage/nc3;->c(I)Ljava/lang/Object;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v2

    .line 2511
    invoke-virtual {v2, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2512
    .line 2513
    .line 2514
    move-result v2

    .line 2515
    if-nez v2, :cond_6c

    .line 2516
    .line 2517
    goto :goto_62

    .line 2518
    :cond_6c
    move/from16 v2, v32

    .line 2519
    .line 2520
    :cond_6d
    :goto_61
    move v12, v1

    .line 2521
    goto :goto_64

    .line 2522
    :cond_6e
    :goto_62
    iget-object v1, v10, Ldefpackage/nc3;->c:Ldefpackage/ue1;

    .line 2523
    .line 2524
    iget-object v1, v1, Ldefpackage/ue1;->p:Ljava/lang/Object;

    .line 2525
    .line 2526
    check-cast v1, Ldefpackage/p03;

    .line 2527
    .line 2528
    invoke-virtual {v1, v13}, Ldefpackage/p03;->d(Ljava/lang/Object;)I

    .line 2529
    .line 2530
    .line 2531
    move-result v2

    .line 2532
    if-ltz v2, :cond_6f

    .line 2533
    .line 2534
    iget-object v1, v1, Ldefpackage/p03;->c:[I

    .line 2535
    .line 2536
    aget v17, v1, v2

    .line 2537
    .line 2538
    move/from16 v1, v17

    .line 2539
    .line 2540
    move/from16 v2, v32

    .line 2541
    .line 2542
    goto :goto_63

    .line 2543
    :cond_6f
    move/from16 v1, v32

    .line 2544
    .line 2545
    move v2, v1

    .line 2546
    :goto_63
    if-eq v1, v2, :cond_6d

    .line 2547
    .line 2548
    iput v1, v9, Ldefpackage/b82;->b:I

    .line 2549
    .line 2550
    goto :goto_61

    .line 2551
    :goto_64
    if-eq v12, v2, :cond_70

    .line 2552
    .line 2553
    const v1, -0x6339ef97

    .line 2554
    .line 2555
    .line 2556
    invoke-virtual {v14, v1}, Ldefpackage/rg1;->R(I)V

    .line 2557
    .line 2558
    .line 2559
    iget-object v11, v0, Ldefpackage/c82;->a:Ldefpackage/u44;

    .line 2560
    .line 2561
    const/4 v15, 0x0

    .line 2562
    invoke-static/range {v10 .. v15}, Ldefpackage/l93;->b(Ldefpackage/nc3;Ljava/lang/Object;ILjava/lang/Object;Ldefpackage/rg1;I)V

    .line 2563
    .line 2564
    .line 2565
    const/4 v10, 0x0

    .line 2566
    invoke-virtual {v14, v10}, Ldefpackage/rg1;->o(Z)V

    .line 2567
    .line 2568
    .line 2569
    goto :goto_65

    .line 2570
    :cond_70
    const/4 v10, 0x0

    .line 2571
    const v0, -0x633657e2

    .line 2572
    .line 2573
    .line 2574
    invoke-virtual {v14, v0}, Ldefpackage/rg1;->R(I)V

    .line 2575
    .line 2576
    .line 2577
    invoke-virtual {v14, v10}, Ldefpackage/rg1;->o(Z)V

    .line 2578
    .line 2579
    .line 2580
    :goto_65
    invoke-virtual {v14, v9}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    .line 2581
    .line 2582
    .line 2583
    move-result v0

    .line 2584
    invoke-virtual {v14}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v1

    .line 2588
    if-nez v0, :cond_71

    .line 2589
    .line 2590
    sget-object v0, Ldefpackage/j80;->a:Ldefpackage/i80;

    .line 2591
    .line 2592
    if-ne v1, v0, :cond_72

    .line 2593
    .line 2594
    :cond_71
    new-instance v1, Ldefpackage/x;

    .line 2595
    .line 2596
    const/16 v0, 0x15

    .line 2597
    .line 2598
    invoke-direct {v1, v0, v9}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 2599
    .line 2600
    .line 2601
    invoke-virtual {v14, v1}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 2602
    .line 2603
    .line 2604
    :cond_72
    check-cast v1, Ldefpackage/if1;

    .line 2605
    .line 2606
    invoke-static {v13, v1, v14}, Ldefpackage/bu;->b(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/rg1;)V

    .line 2607
    .line 2608
    .line 2609
    goto :goto_66

    .line 2610
    :cond_73
    invoke-virtual {v14}, Ldefpackage/rg1;->N()V

    .line 2611
    .line 2612
    .line 2613
    :goto_66
    return-object v8

    .line 2614
    :pswitch_6
    check-cast v0, Ldefpackage/h72;

    .line 2615
    .line 2616
    check-cast v9, Ldefpackage/wf1;

    .line 2617
    .line 2618
    move-object/from16 v2, p1

    .line 2619
    .line 2620
    check-cast v2, Ldefpackage/rg1;

    .line 2621
    .line 2622
    check-cast v1, Ljava/lang/Integer;

    .line 2623
    .line 2624
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2625
    .line 2626
    .line 2627
    move-result v1

    .line 2628
    and-int/lit8 v3, v1, 0x3

    .line 2629
    .line 2630
    if-eq v3, v5, :cond_74

    .line 2631
    .line 2632
    const/4 v3, 0x1

    .line 2633
    :goto_67
    const/16 v33, 0x1

    .line 2634
    .line 2635
    goto :goto_68

    .line 2636
    :cond_74
    const/4 v3, 0x0

    .line 2637
    goto :goto_67

    .line 2638
    :goto_68
    and-int/lit8 v1, v1, 0x1

    .line 2639
    .line 2640
    invoke-virtual {v2, v1, v3}, Ldefpackage/rg1;->K(IZ)Z

    .line 2641
    .line 2642
    .line 2643
    move-result v1

    .line 2644
    if-eqz v1, :cond_7a

    .line 2645
    .line 2646
    iget-object v0, v0, Ldefpackage/h72;->g:Ldefpackage/zd3;

    .line 2647
    .line 2648
    invoke-virtual {v0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 2649
    .line 2650
    .line 2651
    move-result-object v0

    .line 2652
    check-cast v0, Ljava/lang/Boolean;

    .line 2653
    .line 2654
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2655
    .line 2656
    .line 2657
    move-result v1

    .line 2658
    invoke-virtual {v2, v0}, Ldefpackage/rg1;->T(Ljava/lang/Object;)V

    .line 2659
    .line 2660
    .line 2661
    invoke-virtual {v2, v1}, Ldefpackage/rg1;->f(Z)Z

    .line 2662
    .line 2663
    .line 2664
    move-result v0

    .line 2665
    if-eqz v1, :cond_75

    .line 2666
    .line 2667
    const/16 v34, 0x0

    .line 2668
    .line 2669
    invoke-static/range {v34 .. v34}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v0

    .line 2673
    invoke-interface {v9, v2, v0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2674
    .line 2675
    .line 2676
    goto :goto_6a

    .line 2677
    :cond_75
    iget v1, v2, Ldefpackage/rg1;->l:I

    .line 2678
    .line 2679
    if-nez v1, :cond_76

    .line 2680
    .line 2681
    goto :goto_69

    .line 2682
    :cond_76
    const-string v1, "No nodes can be emitted before calling deactivateToEndGroup"

    .line 2683
    .line 2684
    invoke-static {v1}, Ldefpackage/l80;->a(Ljava/lang/String;)V

    .line 2685
    .line 2686
    .line 2687
    :goto_69
    iget-boolean v1, v2, Ldefpackage/rg1;->S:Z

    .line 2688
    .line 2689
    if-nez v1, :cond_78

    .line 2690
    .line 2691
    if-nez v0, :cond_77

    .line 2692
    .line 2693
    invoke-virtual {v2}, Ldefpackage/rg1;->M()V

    .line 2694
    .line 2695
    .line 2696
    goto :goto_6a

    .line 2697
    :cond_77
    iget-object v0, v2, Ldefpackage/rg1;->G:Ldefpackage/hg4;

    .line 2698
    .line 2699
    iget v1, v0, Ldefpackage/hg4;->g:I

    .line 2700
    .line 2701
    iget v0, v0, Ldefpackage/hg4;->h:I

    .line 2702
    .line 2703
    iget-object v3, v2, Ldefpackage/rg1;->M:Ldefpackage/k80;

    .line 2704
    .line 2705
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2706
    .line 2707
    .line 2708
    const/4 v10, 0x0

    .line 2709
    invoke-virtual {v3, v10}, Ldefpackage/k80;->d(Z)V

    .line 2710
    .line 2711
    .line 2712
    iget-object v3, v3, Ldefpackage/k80;->b:Ldefpackage/w00;

    .line 2713
    .line 2714
    iget-object v3, v3, Ldefpackage/w00;->n:Ldefpackage/ya3;

    .line 2715
    .line 2716
    sget-object v4, Ldefpackage/t93;->f:Ldefpackage/t93;

    .line 2717
    .line 2718
    invoke-virtual {v3, v4}, Ldefpackage/ya3;->x0(Ldefpackage/e22;)V

    .line 2719
    .line 2720
    .line 2721
    iget-object v3, v2, Ldefpackage/rg1;->s:Ljava/util/ArrayList;

    .line 2722
    .line 2723
    invoke-static {v1, v0, v3}, Ldefpackage/si0;->i(IILjava/util/List;)V

    .line 2724
    .line 2725
    .line 2726
    iget-object v0, v2, Ldefpackage/rg1;->G:Ldefpackage/hg4;

    .line 2727
    .line 2728
    invoke-virtual {v0}, Ldefpackage/hg4;->t()V

    .line 2729
    .line 2730
    .line 2731
    :cond_78
    :goto_6a
    iget-boolean v0, v2, Ldefpackage/rg1;->y:Z

    .line 2732
    .line 2733
    if-eqz v0, :cond_79

    .line 2734
    .line 2735
    iget-object v0, v2, Ldefpackage/rg1;->G:Ldefpackage/hg4;

    .line 2736
    .line 2737
    iget v0, v0, Ldefpackage/hg4;->i:I

    .line 2738
    .line 2739
    iget v1, v2, Ldefpackage/rg1;->z:I

    .line 2740
    .line 2741
    if-ne v0, v1, :cond_79

    .line 2742
    .line 2743
    const/4 v0, -0x1

    .line 2744
    iput v0, v2, Ldefpackage/rg1;->z:I

    .line 2745
    .line 2746
    const/4 v10, 0x0

    .line 2747
    iput-boolean v10, v2, Ldefpackage/rg1;->y:Z

    .line 2748
    .line 2749
    goto :goto_6b

    .line 2750
    :cond_79
    const/4 v10, 0x0

    .line 2751
    :goto_6b
    invoke-virtual {v2, v10}, Ldefpackage/rg1;->o(Z)V

    .line 2752
    .line 2753
    .line 2754
    goto :goto_6c

    .line 2755
    :cond_7a
    invoke-virtual {v2}, Ldefpackage/rg1;->N()V

    .line 2756
    .line 2757
    .line 2758
    :goto_6c
    return-object v8

    .line 2759
    :pswitch_7
    check-cast v0, Ldefpackage/uy3;

    .line 2760
    .line 2761
    check-cast v9, Ldefpackage/lg4;

    .line 2762
    .line 2763
    move-object/from16 v2, p1

    .line 2764
    .line 2765
    check-cast v2, Ljava/lang/Integer;

    .line 2766
    .line 2767
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2768
    .line 2769
    .line 2770
    move-result v2

    .line 2771
    instance-of v3, v1, Ldefpackage/u70;

    .line 2772
    .line 2773
    if-eqz v3, :cond_7b

    .line 2774
    .line 2775
    check-cast v1, Ldefpackage/u70;

    .line 2776
    .line 2777
    iget-object v0, v0, Ldefpackage/uy3;->f:Ldefpackage/f13;

    .line 2778
    .line 2779
    invoke-virtual {v0, v1}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 2780
    .line 2781
    .line 2782
    goto :goto_6d

    .line 2783
    :cond_7b
    instance-of v3, v1, Ldefpackage/a24;

    .line 2784
    .line 2785
    if-nez v3, :cond_7d

    .line 2786
    .line 2787
    instance-of v3, v1, Ldefpackage/wg1;

    .line 2788
    .line 2789
    if-eqz v3, :cond_7c

    .line 2790
    .line 2791
    invoke-static {v9, v2, v1}, Ldefpackage/si0;->O(Ldefpackage/lg4;ILjava/lang/Object;)V

    .line 2792
    .line 2793
    .line 2794
    check-cast v1, Ldefpackage/wg1;

    .line 2795
    .line 2796
    invoke-virtual {v0, v1}, Ldefpackage/uy3;->e(Ldefpackage/wg1;)V

    .line 2797
    .line 2798
    .line 2799
    goto :goto_6d

    .line 2800
    :cond_7c
    instance-of v0, v1, Ldefpackage/lv3;

    .line 2801
    .line 2802
    if-eqz v0, :cond_7d

    .line 2803
    .line 2804
    invoke-static {v9, v2, v1}, Ldefpackage/si0;->O(Ldefpackage/lg4;ILjava/lang/Object;)V

    .line 2805
    .line 2806
    .line 2807
    move-object v0, v1

    .line 2808
    check-cast v0, Ldefpackage/lv3;

    .line 2809
    .line 2810
    invoke-virtual {v0}, Ldefpackage/lv3;->c()V

    .line 2811
    .line 2812
    .line 2813
    :cond_7d
    :goto_6d
    return-object v8

    .line 2814
    :pswitch_8
    check-cast v0, Ldefpackage/j94;

    .line 2815
    .line 2816
    check-cast v9, Ldefpackage/lb;

    .line 2817
    .line 2818
    move-object/from16 v2, p1

    .line 2819
    .line 2820
    check-cast v2, Ljava/lang/Integer;

    .line 2821
    .line 2822
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2823
    .line 2824
    .line 2825
    move-result v2

    .line 2826
    check-cast v1, Ldefpackage/i94;

    .line 2827
    .line 2828
    iget-object v0, v0, Ldefpackage/j94;->b:Ldefpackage/j03;

    .line 2829
    .line 2830
    iget v3, v1, Ldefpackage/i94;->f:I

    .line 2831
    .line 2832
    invoke-virtual {v0, v3}, Ldefpackage/j03;->c(I)Z

    .line 2833
    .line 2834
    .line 2835
    move-result v0

    .line 2836
    if-nez v0, :cond_7e

    .line 2837
    .line 2838
    invoke-virtual {v9, v2, v1}, Ldefpackage/lb;->i(ILdefpackage/i94;)V

    .line 2839
    .line 2840
    .line 2841
    iget-object v0, v9, Ldefpackage/lb;->u:Ldefpackage/aw;

    .line 2842
    .line 2843
    invoke-interface {v0, v8}, Ldefpackage/y94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2844
    .line 2845
    .line 2846
    :cond_7e
    return-object v8

    .line 2847
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
