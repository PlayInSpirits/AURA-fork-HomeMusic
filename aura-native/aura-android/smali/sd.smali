.class public final Lsd;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic n:Lyc5;


# direct methods
.method public constructor <init>(Lyc5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd;->n:Lyc5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Lsd;->n:Lyc5;

    .line 4
    .line 5
    iget-object v0, v0, Lyc5;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lzg5;

    .line 8
    .line 9
    iget-object v0, v0, Lzg5;->n:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ltd;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iget-object v3, v0, Ltd;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    const/4 v7, 0x0

    .line 24
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    if-ge v7, v8, :cond_e

    .line 29
    .line 30
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, Lzj4;

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    :cond_0
    :goto_1
    move v13, v7

    .line 39
    goto/16 :goto_8

    .line 40
    .line 41
    :cond_1
    iget-object v10, v0, Ltd;->a:Lyd4;

    .line 42
    .line 43
    invoke-virtual {v10, v8}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    check-cast v11, Ljava/lang/Long;

    .line 48
    .line 49
    if-nez v11, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    cmp-long v11, v11, v4

    .line 57
    .line 58
    if-gez v11, :cond_0

    .line 59
    .line 60
    invoke-virtual {v10, v8}, Lyd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :goto_2
    iget-wide v10, v8, Lzj4;->g:J

    .line 64
    .line 65
    const-wide/16 v12, 0x0

    .line 66
    .line 67
    cmp-long v14, v10, v12

    .line 68
    .line 69
    if-nez v14, :cond_3

    .line 70
    .line 71
    iput-wide v1, v8, Lzj4;->g:J

    .line 72
    .line 73
    iget v9, v8, Lzj4;->b:F

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Lzj4;->a(F)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    sub-long v19, v1, v10

    .line 80
    .line 81
    iput-wide v1, v8, Lzj4;->g:J

    .line 82
    .line 83
    iget-boolean v10, v8, Lzj4;->m:Z

    .line 84
    .line 85
    iget v11, v8, Lzj4;->l:F

    .line 86
    .line 87
    const v15, 0x7f7fffff    # Float.MAX_VALUE

    .line 88
    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    if-eqz v10, :cond_5

    .line 92
    .line 93
    cmpl-float v10, v11, v15

    .line 94
    .line 95
    if-eqz v10, :cond_4

    .line 96
    .line 97
    iget-object v10, v8, Lzj4;->k:Lak4;

    .line 98
    .line 99
    move v13, v7

    .line 100
    float-to-double v6, v11

    .line 101
    iput-wide v6, v10, Lak4;->i:D

    .line 102
    .line 103
    iput v15, v8, Lzj4;->l:F

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    move v13, v7

    .line 107
    :goto_3
    iget-object v6, v8, Lzj4;->k:Lak4;

    .line 108
    .line 109
    iget-wide v6, v6, Lak4;->i:D

    .line 110
    .line 111
    double-to-float v6, v6

    .line 112
    iput v6, v8, Lzj4;->b:F

    .line 113
    .line 114
    iput v12, v8, Lzj4;->a:F

    .line 115
    .line 116
    const/4 v6, 0x0

    .line 117
    iput-boolean v6, v8, Lzj4;->m:Z

    .line 118
    .line 119
    const/4 v9, 0x1

    .line 120
    const v11, -0x800001

    .line 121
    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :cond_5
    move v13, v7

    .line 126
    cmpl-float v6, v11, v15

    .line 127
    .line 128
    iget-object v7, v8, Lzj4;->k:Lak4;

    .line 129
    .line 130
    if-eqz v6, :cond_6

    .line 131
    .line 132
    iget-wide v10, v7, Lak4;->i:D

    .line 133
    .line 134
    iget v6, v8, Lzj4;->b:F

    .line 135
    .line 136
    float-to-double v10, v6

    .line 137
    iget v6, v8, Lzj4;->a:F

    .line 138
    .line 139
    move-wide/from16 v22, v10

    .line 140
    .line 141
    float-to-double v9, v6

    .line 142
    const-wide/16 v16, 0x2

    .line 143
    .line 144
    div-long v34, v19, v16

    .line 145
    .line 146
    move-object/from16 v21, v7

    .line 147
    .line 148
    move-wide/from16 v24, v9

    .line 149
    .line 150
    move-wide/from16 v26, v34

    .line 151
    .line 152
    invoke-virtual/range {v21 .. v27}, Lak4;->a(DDJ)Lyx0;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    iget-object v7, v8, Lzj4;->k:Lak4;

    .line 157
    .line 158
    iget v9, v8, Lzj4;->l:F

    .line 159
    .line 160
    float-to-double v9, v9

    .line 161
    iput-wide v9, v7, Lak4;->i:D

    .line 162
    .line 163
    iput v15, v8, Lzj4;->l:F

    .line 164
    .line 165
    iget v9, v6, Lyx0;->a:F

    .line 166
    .line 167
    float-to-double v9, v9

    .line 168
    iget v6, v6, Lyx0;->b:F

    .line 169
    .line 170
    float-to-double v14, v6

    .line 171
    move-object/from16 v29, v7

    .line 172
    .line 173
    move-wide/from16 v30, v9

    .line 174
    .line 175
    move-wide/from16 v32, v14

    .line 176
    .line 177
    invoke-virtual/range {v29 .. v35}, Lak4;->a(DDJ)Lyx0;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    iget v7, v6, Lyx0;->a:F

    .line 182
    .line 183
    iput v7, v8, Lzj4;->b:F

    .line 184
    .line 185
    iget v6, v6, Lyx0;->b:F

    .line 186
    .line 187
    iput v6, v8, Lzj4;->a:F

    .line 188
    .line 189
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 190
    .line 191
    .line 192
    const v11, -0x800001

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    move-object v14, v7

    .line 197
    iget v6, v8, Lzj4;->b:F

    .line 198
    .line 199
    float-to-double v6, v6

    .line 200
    iget v9, v8, Lzj4;->a:F

    .line 201
    .line 202
    float-to-double v9, v9

    .line 203
    move-wide v15, v6

    .line 204
    move-wide/from16 v17, v9

    .line 205
    .line 206
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 207
    .line 208
    .line 209
    const v11, -0x800001

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v14 .. v20}, Lak4;->a(DDJ)Lyx0;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    iget v9, v7, Lyx0;->a:F

    .line 217
    .line 218
    iput v9, v8, Lzj4;->b:F

    .line 219
    .line 220
    iget v7, v7, Lyx0;->b:F

    .line 221
    .line 222
    iput v7, v8, Lzj4;->a:F

    .line 223
    .line 224
    :goto_4
    iget v7, v8, Lzj4;->b:F

    .line 225
    .line 226
    invoke-static {v7, v11}, Ljava/lang/Math;->max(FF)F

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    iput v7, v8, Lzj4;->b:F

    .line 231
    .line 232
    invoke-static {v7, v6}, Ljava/lang/Math;->min(FF)F

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    iput v7, v8, Lzj4;->b:F

    .line 237
    .line 238
    iget v9, v8, Lzj4;->a:F

    .line 239
    .line 240
    iget-object v10, v8, Lzj4;->k:Lak4;

    .line 241
    .line 242
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    float-to-double v14, v9

    .line 250
    move v9, v7

    .line 251
    iget-wide v6, v10, Lak4;->e:D

    .line 252
    .line 253
    cmpg-double v6, v14, v6

    .line 254
    .line 255
    if-gez v6, :cond_7

    .line 256
    .line 257
    iget-wide v6, v10, Lak4;->i:D

    .line 258
    .line 259
    double-to-float v6, v6

    .line 260
    sub-float v7, v9, v6

    .line 261
    .line 262
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    float-to-double v6, v6

    .line 267
    iget-wide v9, v10, Lak4;->d:D

    .line 268
    .line 269
    cmpg-double v6, v6, v9

    .line 270
    .line 271
    if-gez v6, :cond_7

    .line 272
    .line 273
    iget-object v6, v8, Lzj4;->k:Lak4;

    .line 274
    .line 275
    iget-wide v6, v6, Lak4;->i:D

    .line 276
    .line 277
    double-to-float v6, v6

    .line 278
    iput v6, v8, Lzj4;->b:F

    .line 279
    .line 280
    iput v12, v8, Lzj4;->a:F

    .line 281
    .line 282
    const/4 v9, 0x1

    .line 283
    goto :goto_5

    .line 284
    :cond_7
    const/4 v9, 0x0

    .line 285
    :goto_5
    iget v6, v8, Lzj4;->b:F

    .line 286
    .line 287
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 288
    .line 289
    .line 290
    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    iput v6, v8, Lzj4;->b:F

    .line 295
    .line 296
    invoke-static {v6, v11}, Ljava/lang/Math;->max(FF)F

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    iput v6, v8, Lzj4;->b:F

    .line 301
    .line 302
    invoke-virtual {v8, v6}, Lzj4;->a(F)V

    .line 303
    .line 304
    .line 305
    if-eqz v9, :cond_d

    .line 306
    .line 307
    iget-object v6, v8, Lzj4;->i:Ljava/util/ArrayList;

    .line 308
    .line 309
    const/4 v7, 0x0

    .line 310
    iput-boolean v7, v8, Lzj4;->f:Z

    .line 311
    .line 312
    sget-object v7, Ltd;->f:Ljava/lang/ThreadLocal;

    .line 313
    .line 314
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    if-nez v9, :cond_8

    .line 319
    .line 320
    new-instance v9, Ltd;

    .line 321
    .line 322
    invoke-direct {v9}, Ltd;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v9}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_8
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    check-cast v7, Ltd;

    .line 333
    .line 334
    iget-object v9, v7, Ltd;->a:Lyd4;

    .line 335
    .line 336
    invoke-virtual {v9, v8}, Lyd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    iget-object v9, v7, Ltd;->b:Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 342
    .line 343
    .line 344
    move-result v10

    .line 345
    if-ltz v10, :cond_9

    .line 346
    .line 347
    const/4 v11, 0x0

    .line 348
    invoke-virtual {v9, v10, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    const/4 v9, 0x1

    .line 352
    iput-boolean v9, v7, Ltd;->e:Z

    .line 353
    .line 354
    :cond_9
    const-wide/16 v9, 0x0

    .line 355
    .line 356
    iput-wide v9, v8, Lzj4;->g:J

    .line 357
    .line 358
    const/4 v7, 0x0

    .line 359
    iput-boolean v7, v8, Lzj4;->c:Z

    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    :goto_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 363
    .line 364
    .line 365
    move-result v8

    .line 366
    if-ge v7, v8, :cond_b

    .line 367
    .line 368
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v8

    .line 372
    if-nez v8, :cond_a

    .line 373
    .line 374
    add-int/lit8 v7, v7, 0x1

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_a
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-static {}, Lkf2;->k()V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    const/16 v28, 0x1

    .line 393
    .line 394
    add-int/lit8 v7, v7, -0x1

    .line 395
    .line 396
    :goto_7
    if-ltz v7, :cond_d

    .line 397
    .line 398
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    if-nez v8, :cond_c

    .line 403
    .line 404
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    :cond_c
    add-int/lit8 v7, v7, -0x1

    .line 408
    .line 409
    goto :goto_7

    .line 410
    :cond_d
    :goto_8
    add-int/lit8 v7, v13, 0x1

    .line 411
    .line 412
    goto/16 :goto_0

    .line 413
    .line 414
    :cond_e
    iget-boolean v1, v0, Ltd;->e:Z

    .line 415
    .line 416
    if-eqz v1, :cond_11

    .line 417
    .line 418
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    const/16 v28, 0x1

    .line 423
    .line 424
    add-int/lit8 v1, v1, -0x1

    .line 425
    .line 426
    :goto_9
    if-ltz v1, :cond_10

    .line 427
    .line 428
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    if-nez v2, :cond_f

    .line 433
    .line 434
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    :cond_f
    add-int/lit8 v1, v1, -0x1

    .line 438
    .line 439
    goto :goto_9

    .line 440
    :cond_10
    const/4 v7, 0x0

    .line 441
    iput-boolean v7, v0, Ltd;->e:Z

    .line 442
    .line 443
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-lez v1, :cond_13

    .line 448
    .line 449
    iget-object v1, v0, Ltd;->d:Lyc5;

    .line 450
    .line 451
    if-nez v1, :cond_12

    .line 452
    .line 453
    new-instance v1, Lyc5;

    .line 454
    .line 455
    iget-object v2, v0, Ltd;->c:Lzg5;

    .line 456
    .line 457
    invoke-direct {v1, v2}, Lyc5;-><init>(Lzg5;)V

    .line 458
    .line 459
    .line 460
    iput-object v1, v0, Ltd;->d:Lyc5;

    .line 461
    .line 462
    :cond_12
    iget-object v0, v0, Ltd;->d:Lyc5;

    .line 463
    .line 464
    iget-object v1, v0, Lyc5;->o:Ljava/lang/Object;

    .line 465
    .line 466
    check-cast v1, Landroid/view/Choreographer;

    .line 467
    .line 468
    iget-object v0, v0, Lyc5;->p:Ljava/lang/Object;

    .line 469
    .line 470
    check-cast v0, Lsd;

    .line 471
    .line 472
    invoke-virtual {v1, v0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 473
    .line 474
    .line 475
    :cond_13
    return-void
.end method
