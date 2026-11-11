.class public final Lg01;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg01;->e:Ljava/lang/Object;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    iput v1, p0, Lg01;->a:I

    .line 14
    .line 15
    const/16 v1, 0x3100

    .line 16
    .line 17
    iput v1, p0, Lg01;->b:I

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Lg01;->c:I

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lg01;->f:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    sget-object v2, Lbq4;->r:Lmd3;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lg01;->d:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p0, Lxq4;->d:Lxq4;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p0, Lxq4;->e:Lxq4;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    sget-object p0, Lxq4;->f:Lxq4;

    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    sget-object p0, Lxq4;->g:Lxq4;

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    sget-object p0, Lxq4;->h:Lxq4;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    sget-object p0, Lxq4;->i:Lxq4;

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const-string p0, "Bitmap is not valid"

    .line 74
    .line 75
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    throw p0
.end method

.method public constructor <init>(Lzv2;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 81
    iput v0, p0, Lg01;->a:I

    .line 82
    iput-object p1, p0, Lg01;->d:Ljava/lang/Object;

    .line 83
    iput-object p1, p0, Lg01;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lbq4;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lg01;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v2, v0, Lg01;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroid/graphics/Bitmap;

    .line 10
    .line 11
    if-eqz v2, :cond_13

    .line 12
    .line 13
    iget v3, v0, Lg01;->c:I

    .line 14
    .line 15
    iget v4, v0, Lg01;->b:I

    .line 16
    .line 17
    const-wide/high16 v5, -0x4010000000000000L    # -1.0

    .line 18
    .line 19
    if-lez v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    mul-int/2addr v7, v3

    .line 30
    if-le v7, v4, :cond_1

    .line 31
    .line 32
    int-to-double v3, v4

    .line 33
    int-to-double v5, v7

    .line 34
    div-double/2addr v3, v5

    .line 35
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    if-lez v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-le v4, v3, :cond_1

    .line 55
    .line 56
    int-to-double v5, v3

    .line 57
    int-to-double v3, v4

    .line 58
    div-double/2addr v5, v3

    .line 59
    :cond_1
    :goto_0
    const-wide/16 v3, 0x0

    .line 60
    .line 61
    cmpg-double v3, v5, v3

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-gtz v3, :cond_2

    .line 65
    .line 66
    move-object v5, v2

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    int-to-double v7, v3

    .line 73
    mul-double/2addr v7, v5

    .line 74
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 75
    .line 76
    .line 77
    move-result-wide v7

    .line 78
    double-to-int v3, v7

    .line 79
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    int-to-double v7, v7

    .line 84
    mul-double/2addr v7, v5

    .line 85
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    double-to-int v5, v5

    .line 90
    invoke-static {v2, v3, v5, v4}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    move-object v5, v3

    .line 95
    :goto_1
    new-instance v3, Lz40;

    .line 96
    .line 97
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    mul-int v6, v8, v12

    .line 106
    .line 107
    new-array v6, v6, [I

    .line 108
    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    move v11, v8

    .line 113
    invoke-virtual/range {v5 .. v12}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 114
    .line 115
    .line 116
    iget v7, v0, Lg01;->a:I

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_3

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    goto :goto_2

    .line 126
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    new-array v8, v8, [Lmd3;

    .line 131
    .line 132
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, [Lmd3;

    .line 137
    .line 138
    :goto_2
    invoke-direct {v3, v6, v7, v1}, Lz40;-><init>([II[Lmd3;)V

    .line 139
    .line 140
    .line 141
    if-eq v5, v2, :cond_4

    .line 142
    .line 143
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 144
    .line 145
    .line 146
    :cond_4
    iget-object v1, v3, Lz40;->p:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, Ljava/util/ArrayList;

    .line 149
    .line 150
    new-instance v2, Lbq4;

    .line 151
    .line 152
    iget-object v0, v0, Lg01;->e:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v2, v1, v0}, Lbq4;-><init>(Ljava/util/List;Ljava/util/ArrayList;)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v2, Lbq4;->p:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Landroid/util/SparseBooleanArray;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    move v5, v4

    .line 168
    :goto_3
    if-ge v5, v3, :cond_12

    .line 169
    .line 170
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    check-cast v6, Lxq4;

    .line 175
    .line 176
    iget-object v7, v6, Lxq4;->c:[F

    .line 177
    .line 178
    iget-object v8, v6, Lxq4;->a:[F

    .line 179
    .line 180
    array-length v10, v7

    .line 181
    const/4 v11, 0x0

    .line 182
    move v12, v4

    .line 183
    move v13, v11

    .line 184
    :goto_4
    if-ge v12, v10, :cond_6

    .line 185
    .line 186
    aget v14, v7, v12

    .line 187
    .line 188
    cmpl-float v15, v14, v11

    .line 189
    .line 190
    if-lez v15, :cond_5

    .line 191
    .line 192
    add-float/2addr v13, v14

    .line 193
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    cmpl-float v10, v13, v11

    .line 197
    .line 198
    if-eqz v10, :cond_8

    .line 199
    .line 200
    array-length v10, v7

    .line 201
    move v12, v4

    .line 202
    :goto_5
    if-ge v12, v10, :cond_8

    .line 203
    .line 204
    aget v14, v7, v12

    .line 205
    .line 206
    cmpl-float v15, v14, v11

    .line 207
    .line 208
    if-lez v15, :cond_7

    .line 209
    .line 210
    div-float/2addr v14, v13

    .line 211
    aput v14, v7, v12

    .line 212
    .line 213
    :cond_7
    add-int/lit8 v12, v12, 0x1

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_8
    iget-object v7, v2, Lbq4;->o:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v7, Loi;

    .line 219
    .line 220
    iget-object v10, v2, Lbq4;->n:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v10, Ljava/util/List;

    .line 223
    .line 224
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 225
    .line 226
    .line 227
    move-result v12

    .line 228
    move v13, v4

    .line 229
    move/from16 v16, v13

    .line 230
    .line 231
    move v15, v11

    .line 232
    const/4 v14, 0x0

    .line 233
    :goto_6
    const/4 v4, 0x1

    .line 234
    if-ge v13, v12, :cond_10

    .line 235
    .line 236
    invoke-interface {v10, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v17

    .line 240
    move-object/from16 v9, v17

    .line 241
    .line 242
    check-cast v9, Lnd3;

    .line 243
    .line 244
    invoke-virtual {v9}, Lnd3;->b()[F

    .line 245
    .line 246
    .line 247
    move-result-object v17

    .line 248
    aget v18, v17, v4

    .line 249
    .line 250
    move/from16 p0, v11

    .line 251
    .line 252
    iget-object v11, v6, Lxq4;->b:[F

    .line 253
    .line 254
    aget v19, v8, v16

    .line 255
    .line 256
    cmpl-float v19, v18, v19

    .line 257
    .line 258
    if-ltz v19, :cond_e

    .line 259
    .line 260
    const/16 v19, 0x2

    .line 261
    .line 262
    aget v20, v8, v19

    .line 263
    .line 264
    cmpg-float v18, v18, v20

    .line 265
    .line 266
    if-gtz v18, :cond_e

    .line 267
    .line 268
    aget v17, v17, v19

    .line 269
    .line 270
    aget v18, v11, v16

    .line 271
    .line 272
    cmpl-float v18, v17, v18

    .line 273
    .line 274
    if-ltz v18, :cond_e

    .line 275
    .line 276
    aget v18, v11, v19

    .line 277
    .line 278
    cmpg-float v17, v17, v18

    .line 279
    .line 280
    if-gtz v17, :cond_e

    .line 281
    .line 282
    move/from16 v17, v4

    .line 283
    .line 284
    iget v4, v9, Lnd3;->d:I

    .line 285
    .line 286
    invoke-virtual {v1, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-nez v4, :cond_e

    .line 291
    .line 292
    invoke-virtual {v9}, Lnd3;->b()[F

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    move-object/from16 v18, v0

    .line 297
    .line 298
    iget-object v0, v2, Lbq4;->q:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Lnd3;

    .line 301
    .line 302
    if-eqz v0, :cond_9

    .line 303
    .line 304
    iget v0, v0, Lnd3;->e:I

    .line 305
    .line 306
    :goto_7
    move-object/from16 v20, v2

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_9
    move/from16 v0, v17

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :goto_8
    iget-object v2, v6, Lxq4;->c:[F

    .line 313
    .line 314
    aget v21, v2, v16

    .line 315
    .line 316
    cmpl-float v22, v21, p0

    .line 317
    .line 318
    const/high16 v23, 0x3f800000    # 1.0f

    .line 319
    .line 320
    if-lez v22, :cond_a

    .line 321
    .line 322
    aget v22, v4, v17

    .line 323
    .line 324
    aget v24, v8, v17

    .line 325
    .line 326
    sub-float v22, v22, v24

    .line 327
    .line 328
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    .line 329
    .line 330
    .line 331
    move-result v22

    .line 332
    sub-float v22, v23, v22

    .line 333
    .line 334
    mul-float v22, v22, v21

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_a
    move/from16 v22, p0

    .line 338
    .line 339
    :goto_9
    aget v21, v2, v17

    .line 340
    .line 341
    cmpl-float v24, v21, p0

    .line 342
    .line 343
    if-lez v24, :cond_b

    .line 344
    .line 345
    aget v4, v4, v19

    .line 346
    .line 347
    aget v11, v11, v17

    .line 348
    .line 349
    sub-float/2addr v4, v11

    .line 350
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 351
    .line 352
    .line 353
    move-result v4

    .line 354
    sub-float v23, v23, v4

    .line 355
    .line 356
    mul-float v23, v23, v21

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_b
    move/from16 v23, p0

    .line 360
    .line 361
    :goto_a
    aget v2, v2, v19

    .line 362
    .line 363
    cmpl-float v4, v2, p0

    .line 364
    .line 365
    if-lez v4, :cond_c

    .line 366
    .line 367
    iget v4, v9, Lnd3;->e:I

    .line 368
    .line 369
    int-to-float v4, v4

    .line 370
    int-to-float v0, v0

    .line 371
    div-float/2addr v4, v0

    .line 372
    mul-float/2addr v4, v2

    .line 373
    goto :goto_b

    .line 374
    :cond_c
    move/from16 v4, p0

    .line 375
    .line 376
    :goto_b
    add-float v22, v22, v23

    .line 377
    .line 378
    add-float v22, v22, v4

    .line 379
    .line 380
    if-eqz v14, :cond_d

    .line 381
    .line 382
    cmpl-float v0, v22, v15

    .line 383
    .line 384
    if-lez v0, :cond_f

    .line 385
    .line 386
    :cond_d
    move-object v14, v9

    .line 387
    move/from16 v15, v22

    .line 388
    .line 389
    goto :goto_c

    .line 390
    :cond_e
    move-object/from16 v18, v0

    .line 391
    .line 392
    move-object/from16 v20, v2

    .line 393
    .line 394
    :cond_f
    :goto_c
    add-int/lit8 v13, v13, 0x1

    .line 395
    .line 396
    move/from16 v11, p0

    .line 397
    .line 398
    move-object/from16 v0, v18

    .line 399
    .line 400
    move-object/from16 v2, v20

    .line 401
    .line 402
    goto/16 :goto_6

    .line 403
    .line 404
    :cond_10
    move-object/from16 v18, v0

    .line 405
    .line 406
    move-object/from16 v20, v2

    .line 407
    .line 408
    move/from16 v17, v4

    .line 409
    .line 410
    if-eqz v14, :cond_11

    .line 411
    .line 412
    iget v0, v14, Lnd3;->d:I

    .line 413
    .line 414
    move/from16 v2, v17

    .line 415
    .line 416
    invoke-virtual {v1, v0, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 417
    .line 418
    .line 419
    :cond_11
    invoke-virtual {v7, v6, v14}, Lyd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    add-int/lit8 v5, v5, 0x1

    .line 423
    .line 424
    move/from16 v4, v16

    .line 425
    .line 426
    move-object/from16 v0, v18

    .line 427
    .line 428
    move-object/from16 v2, v20

    .line 429
    .line 430
    goto/16 :goto_3

    .line 431
    .line 432
    :cond_12
    move-object/from16 v20, v2

    .line 433
    .line 434
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->clear()V

    .line 435
    .line 436
    .line 437
    return-object v20

    .line 438
    :cond_13
    new-instance v0, Ljava/lang/AssertionError;

    .line 439
    .line 440
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 441
    .line 442
    .line 443
    throw v0
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lg01;->a:I

    .line 3
    .line 4
    iget-object v0, p0, Lg01;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lzv2;

    .line 7
    .line 8
    iput-object v0, p0, Lg01;->e:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lg01;->c:I

    .line 12
    .line 13
    return-void
.end method

.method public c()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lg01;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzv2;

    .line 4
    .line 5
    iget-object v0, v0, Lzv2;->b:Lk05;

    .line 6
    .line 7
    invoke-virtual {v0}, Lk05;->b()Lvv2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-virtual {v0, v1}, Lzf2;->a(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v3, v0, Lzf2;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iget v0, v0, Lzf2;->n:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->get(I)B

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    return v2

    .line 33
    :cond_0
    iget p0, p0, Lg01;->b:I

    .line 34
    .line 35
    const v0, 0xfe0f

    .line 36
    .line 37
    .line 38
    if-ne p0, v0, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    return p0
.end method
