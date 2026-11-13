.class public final Ldefpackage/hx4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public n:Ldefpackage/dx4;

.field public o:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/hx4;->n:Ldefpackage/dx4;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/hx4;->o:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 15
    .line 16
    .line 17
    sget-object v3, Ldefpackage/ix4;->c:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v6, 0x1

    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    return v6

    .line 27
    :cond_0
    invoke-static {}, Ldefpackage/ix4;->b()Ldefpackage/oi;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v3, v2}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/util/ArrayList;

    .line 36
    .line 37
    if-nez v4, :cond_2

    .line 38
    .line 39
    new-instance v4, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v2, v4}, Ldefpackage/yd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    :cond_1
    const/4 v7, 0x0

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-lez v7, :cond_1

    .line 54
    .line 55
    new-instance v7, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v7, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    new-instance v4, Ldefpackage/gx4;

    .line 64
    .line 65
    invoke-direct {v4, v0, v3}, Ldefpackage/gx4;-><init>(Ldefpackage/hx4;Ldefpackage/oi;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v4}, Ldefpackage/dx4;->a(Ldefpackage/bx4;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-virtual {v1, v2, v0}, Ldefpackage/dx4;->g(Landroid/view/ViewGroup;Z)V

    .line 73
    .line 74
    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    move v4, v0

    .line 82
    :goto_1
    if-ge v4, v3, :cond_3

    .line 83
    .line 84
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    add-int/lit8 v4, v4, 0x1

    .line 89
    .line 90
    check-cast v8, Ldefpackage/dx4;

    .line 91
    .line 92
    invoke-virtual {v8, v2}, Ldefpackage/dx4;->v(Landroid/view/View;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v3, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 102
    .line 103
    new-instance v3, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    iput-object v3, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 109
    .line 110
    iget-object v3, v1, Ldefpackage/dx4;->t:Ldefpackage/bq4;

    .line 111
    .line 112
    iget-object v4, v1, Ldefpackage/dx4;->u:Ldefpackage/bq4;

    .line 113
    .line 114
    new-instance v7, Ldefpackage/oi;

    .line 115
    .line 116
    iget-object v8, v3, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v8, Ldefpackage/oi;

    .line 119
    .line 120
    invoke-direct {v7, v8}, Ldefpackage/oi;-><init>(Ldefpackage/oi;)V

    .line 121
    .line 122
    .line 123
    new-instance v8, Ldefpackage/oi;

    .line 124
    .line 125
    iget-object v9, v4, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v9, Ldefpackage/oi;

    .line 128
    .line 129
    invoke-direct {v8, v9}, Ldefpackage/oi;-><init>(Ldefpackage/oi;)V

    .line 130
    .line 131
    .line 132
    move v9, v0

    .line 133
    :goto_2
    iget-object v10, v1, Ldefpackage/dx4;->w:[I

    .line 134
    .line 135
    array-length v11, v10

    .line 136
    if-ge v9, v11, :cond_f

    .line 137
    .line 138
    aget v10, v10, v9

    .line 139
    .line 140
    if-eq v10, v6, :cond_c

    .line 141
    .line 142
    const/4 v11, 0x2

    .line 143
    if-eq v10, v11, :cond_a

    .line 144
    .line 145
    const/4 v11, 0x3

    .line 146
    if-eq v10, v11, :cond_8

    .line 147
    .line 148
    const/4 v11, 0x4

    .line 149
    if-eq v10, v11, :cond_5

    .line 150
    .line 151
    :cond_4
    move/from16 v16, v6

    .line 152
    .line 153
    goto/16 :goto_8

    .line 154
    .line 155
    :cond_5
    iget-object v10, v3, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v10, Ldefpackage/xe2;

    .line 158
    .line 159
    iget-object v11, v4, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v11, Ldefpackage/xe2;

    .line 162
    .line 163
    invoke-virtual {v10}, Ldefpackage/xe2;->h()I

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    move v13, v0

    .line 168
    :goto_3
    if-ge v13, v12, :cond_4

    .line 169
    .line 170
    invoke-virtual {v10, v13}, Ldefpackage/xe2;->i(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    check-cast v14, Landroid/view/View;

    .line 175
    .line 176
    if-eqz v14, :cond_7

    .line 177
    .line 178
    invoke-virtual {v1, v14}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 179
    .line 180
    .line 181
    move-result v15

    .line 182
    if-eqz v15, :cond_7

    .line 183
    .line 184
    move v15, v6

    .line 185
    invoke-virtual {v10, v13}, Ldefpackage/xe2;->e(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v5

    .line 189
    invoke-virtual {v11, v5, v6}, Ldefpackage/xe2;->b(J)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    check-cast v5, Landroid/view/View;

    .line 194
    .line 195
    if-eqz v5, :cond_6

    .line 196
    .line 197
    invoke-virtual {v1, v5}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_6

    .line 202
    .line 203
    invoke-virtual {v7, v14}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    check-cast v6, Ldefpackage/mx4;

    .line 208
    .line 209
    invoke-virtual {v8, v5}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v16

    .line 213
    move-object/from16 v0, v16

    .line 214
    .line 215
    check-cast v0, Ldefpackage/mx4;

    .line 216
    .line 217
    if-eqz v6, :cond_6

    .line 218
    .line 219
    if-eqz v0, :cond_6

    .line 220
    .line 221
    move/from16 v16, v15

    .line 222
    .line 223
    iget-object v15, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    iget-object v6, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    invoke-virtual {v7, v14}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8, v5}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_6
    move/from16 v16, v15

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_7
    move/from16 v16, v6

    .line 244
    .line 245
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 246
    .line 247
    move/from16 v6, v16

    .line 248
    .line 249
    const/4 v0, 0x0

    .line 250
    goto :goto_3

    .line 251
    :cond_8
    move/from16 v16, v6

    .line 252
    .line 253
    iget-object v0, v3, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, Landroid/util/SparseArray;

    .line 256
    .line 257
    iget-object v5, v4, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v5, Landroid/util/SparseArray;

    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    const/4 v10, 0x0

    .line 266
    :goto_5
    if-ge v10, v6, :cond_e

    .line 267
    .line 268
    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    check-cast v11, Landroid/view/View;

    .line 273
    .line 274
    if-eqz v11, :cond_9

    .line 275
    .line 276
    invoke-virtual {v1, v11}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-eqz v12, :cond_9

    .line 281
    .line 282
    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->keyAt(I)I

    .line 283
    .line 284
    .line 285
    move-result v12

    .line 286
    invoke-virtual {v5, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    check-cast v12, Landroid/view/View;

    .line 291
    .line 292
    if-eqz v12, :cond_9

    .line 293
    .line 294
    invoke-virtual {v1, v12}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 295
    .line 296
    .line 297
    move-result v13

    .line 298
    if-eqz v13, :cond_9

    .line 299
    .line 300
    invoke-virtual {v7, v11}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v13

    .line 304
    check-cast v13, Ldefpackage/mx4;

    .line 305
    .line 306
    invoke-virtual {v8, v12}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v14

    .line 310
    check-cast v14, Ldefpackage/mx4;

    .line 311
    .line 312
    if-eqz v13, :cond_9

    .line 313
    .line 314
    if-eqz v14, :cond_9

    .line 315
    .line 316
    iget-object v15, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    iget-object v13, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    invoke-virtual {v7, v11}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v8, v12}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    :cond_9
    add-int/lit8 v10, v10, 0x1

    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_a
    move/from16 v16, v6

    .line 336
    .line 337
    iget-object v0, v3, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Ldefpackage/oi;

    .line 340
    .line 341
    iget-object v5, v4, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v5, Ldefpackage/oi;

    .line 344
    .line 345
    iget v6, v0, Ldefpackage/yd4;->p:I

    .line 346
    .line 347
    const/4 v10, 0x0

    .line 348
    :goto_6
    if-ge v10, v6, :cond_e

    .line 349
    .line 350
    invoke-virtual {v0, v10}, Ldefpackage/yd4;->j(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v11

    .line 354
    check-cast v11, Landroid/view/View;

    .line 355
    .line 356
    if-eqz v11, :cond_b

    .line 357
    .line 358
    invoke-virtual {v1, v11}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    if-eqz v12, :cond_b

    .line 363
    .line 364
    invoke-virtual {v0, v10}, Ldefpackage/yd4;->f(I)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v12

    .line 368
    invoke-virtual {v5, v12}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v12

    .line 372
    check-cast v12, Landroid/view/View;

    .line 373
    .line 374
    if-eqz v12, :cond_b

    .line 375
    .line 376
    invoke-virtual {v1, v12}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 377
    .line 378
    .line 379
    move-result v13

    .line 380
    if-eqz v13, :cond_b

    .line 381
    .line 382
    invoke-virtual {v7, v11}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v13

    .line 386
    check-cast v13, Ldefpackage/mx4;

    .line 387
    .line 388
    invoke-virtual {v8, v12}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v14

    .line 392
    check-cast v14, Ldefpackage/mx4;

    .line 393
    .line 394
    if-eqz v13, :cond_b

    .line 395
    .line 396
    if-eqz v14, :cond_b

    .line 397
    .line 398
    iget-object v15, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 399
    .line 400
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    iget-object v13, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    invoke-virtual {v7, v11}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v8, v12}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_c
    move/from16 v16, v6

    .line 418
    .line 419
    iget v0, v7, Ldefpackage/yd4;->p:I

    .line 420
    .line 421
    add-int/lit8 v0, v0, -0x1

    .line 422
    .line 423
    :goto_7
    if-ltz v0, :cond_e

    .line 424
    .line 425
    invoke-virtual {v7, v0}, Ldefpackage/yd4;->f(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    check-cast v5, Landroid/view/View;

    .line 430
    .line 431
    if-eqz v5, :cond_d

    .line 432
    .line 433
    invoke-virtual {v1, v5}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    if-eqz v6, :cond_d

    .line 438
    .line 439
    invoke-virtual {v8, v5}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    check-cast v5, Ldefpackage/mx4;

    .line 444
    .line 445
    if-eqz v5, :cond_d

    .line 446
    .line 447
    iget-object v6, v5, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 448
    .line 449
    invoke-virtual {v1, v6}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 450
    .line 451
    .line 452
    move-result v6

    .line 453
    if-eqz v6, :cond_d

    .line 454
    .line 455
    invoke-virtual {v7, v0}, Ldefpackage/yd4;->h(I)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v6

    .line 459
    check-cast v6, Ldefpackage/mx4;

    .line 460
    .line 461
    iget-object v10, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    iget-object v6, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 467
    .line 468
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    :cond_d
    add-int/lit8 v0, v0, -0x1

    .line 472
    .line 473
    goto :goto_7

    .line 474
    :cond_e
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 475
    .line 476
    move/from16 v6, v16

    .line 477
    .line 478
    const/4 v0, 0x0

    .line 479
    goto/16 :goto_2

    .line 480
    .line 481
    :cond_f
    move/from16 v16, v6

    .line 482
    .line 483
    const/4 v0, 0x0

    .line 484
    :goto_9
    iget v3, v7, Ldefpackage/yd4;->p:I

    .line 485
    .line 486
    if-ge v0, v3, :cond_11

    .line 487
    .line 488
    invoke-virtual {v7, v0}, Ldefpackage/yd4;->j(I)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    check-cast v3, Ldefpackage/mx4;

    .line 493
    .line 494
    iget-object v4, v3, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 495
    .line 496
    invoke-virtual {v1, v4}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    if-eqz v4, :cond_10

    .line 501
    .line 502
    iget-object v4, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 503
    .line 504
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    iget-object v3, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 508
    .line 509
    const/4 v4, 0x0

    .line 510
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    :cond_10
    add-int/lit8 v0, v0, 0x1

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_11
    const/4 v0, 0x0

    .line 517
    :goto_a
    iget v3, v8, Ldefpackage/yd4;->p:I

    .line 518
    .line 519
    if-ge v0, v3, :cond_13

    .line 520
    .line 521
    invoke-virtual {v8, v0}, Ldefpackage/yd4;->j(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    check-cast v3, Ldefpackage/mx4;

    .line 526
    .line 527
    iget-object v4, v3, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 528
    .line 529
    invoke-virtual {v1, v4}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_12

    .line 534
    .line 535
    iget-object v4, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    iget-object v3, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 541
    .line 542
    const/4 v4, 0x0

    .line 543
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    goto :goto_b

    .line 547
    :cond_12
    const/4 v4, 0x0

    .line 548
    :goto_b
    add-int/lit8 v0, v0, 0x1

    .line 549
    .line 550
    goto :goto_a

    .line 551
    :cond_13
    invoke-static {}, Ldefpackage/dx4;->n()Ldefpackage/oi;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    iget v3, v0, Ldefpackage/yd4;->p:I

    .line 556
    .line 557
    sget-object v4, Ldefpackage/d85;->a:Ldefpackage/f85;

    .line 558
    .line 559
    invoke-virtual {v2}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    add-int/lit8 v3, v3, -0x1

    .line 564
    .line 565
    :goto_c
    if-ltz v3, :cond_19

    .line 566
    .line 567
    invoke-virtual {v0, v3}, Ldefpackage/yd4;->f(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v5

    .line 571
    check-cast v5, Landroid/animation/Animator;

    .line 572
    .line 573
    if-eqz v5, :cond_18

    .line 574
    .line 575
    invoke-virtual {v0, v5}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    check-cast v6, Ldefpackage/ax4;

    .line 580
    .line 581
    if-eqz v6, :cond_18

    .line 582
    .line 583
    iget-object v7, v6, Ldefpackage/ax4;->a:Landroid/view/View;

    .line 584
    .line 585
    if-eqz v7, :cond_18

    .line 586
    .line 587
    iget-object v8, v6, Ldefpackage/ax4;->d:Ldefpackage/ja5;

    .line 588
    .line 589
    iget-object v8, v8, Ldefpackage/ja5;->a:Landroid/view/WindowId;

    .line 590
    .line 591
    invoke-virtual {v8, v4}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    .line 592
    .line 593
    .line 594
    move-result v8

    .line 595
    if-eqz v8, :cond_18

    .line 596
    .line 597
    iget-object v8, v6, Ldefpackage/ax4;->c:Ldefpackage/mx4;

    .line 598
    .line 599
    move/from16 v15, v16

    .line 600
    .line 601
    invoke-virtual {v1, v7, v15}, Ldefpackage/dx4;->p(Landroid/view/View;Z)Ldefpackage/mx4;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    invoke-virtual {v1, v7, v15}, Ldefpackage/dx4;->m(Landroid/view/View;Z)Ldefpackage/mx4;

    .line 606
    .line 607
    .line 608
    move-result-object v10

    .line 609
    if-nez v9, :cond_14

    .line 610
    .line 611
    if-nez v10, :cond_14

    .line 612
    .line 613
    iget-object v10, v1, Ldefpackage/dx4;->u:Ldefpackage/bq4;

    .line 614
    .line 615
    iget-object v10, v10, Ldefpackage/bq4;->n:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v10, Ldefpackage/oi;

    .line 618
    .line 619
    invoke-virtual {v10, v7}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v7

    .line 623
    move-object v10, v7

    .line 624
    check-cast v10, Ldefpackage/mx4;

    .line 625
    .line 626
    :cond_14
    if-nez v9, :cond_15

    .line 627
    .line 628
    if-eqz v10, :cond_18

    .line 629
    .line 630
    :cond_15
    iget-object v6, v6, Ldefpackage/ax4;->e:Ldefpackage/dx4;

    .line 631
    .line 632
    invoke-virtual {v6, v8, v10}, Ldefpackage/dx4;->q(Ldefpackage/mx4;Ldefpackage/mx4;)Z

    .line 633
    .line 634
    .line 635
    move-result v6

    .line 636
    if-eqz v6, :cond_18

    .line 637
    .line 638
    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    if-nez v6, :cond_17

    .line 643
    .line 644
    invoke-virtual {v5}, Landroid/animation/Animator;->isStarted()Z

    .line 645
    .line 646
    .line 647
    move-result v6

    .line 648
    if-eqz v6, :cond_16

    .line 649
    .line 650
    goto :goto_d

    .line 651
    :cond_16
    invoke-virtual {v0, v5}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    goto :goto_e

    .line 655
    :cond_17
    :goto_d
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    .line 656
    .line 657
    .line 658
    :cond_18
    :goto_e
    add-int/lit8 v3, v3, -0x1

    .line 659
    .line 660
    const/16 v16, 0x1

    .line 661
    .line 662
    goto :goto_c

    .line 663
    :cond_19
    iget-object v0, v1, Ldefpackage/dx4;->t:Ldefpackage/bq4;

    .line 664
    .line 665
    iget-object v3, v1, Ldefpackage/dx4;->u:Ldefpackage/bq4;

    .line 666
    .line 667
    iget-object v4, v1, Ldefpackage/dx4;->x:Ljava/util/ArrayList;

    .line 668
    .line 669
    iget-object v5, v1, Ldefpackage/dx4;->y:Ljava/util/ArrayList;

    .line 670
    .line 671
    move-object/from16 v17, v2

    .line 672
    .line 673
    move-object v2, v0

    .line 674
    move-object v0, v1

    .line 675
    move-object/from16 v1, v17

    .line 676
    .line 677
    invoke-virtual/range {v0 .. v5}, Ldefpackage/dx4;->k(Landroid/view/ViewGroup;Ldefpackage/bq4;Ldefpackage/bq4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Ldefpackage/dx4;->w()V

    .line 681
    .line 682
    .line 683
    const/4 v15, 0x1

    .line 684
    return v15
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Ldefpackage/hx4;->o:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Ldefpackage/ix4;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ldefpackage/ix4;->b()Ldefpackage/oi;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-lez v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    :goto_0
    if-ge v2, v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    check-cast v3, Ldefpackage/dx4;

    .line 50
    .line 51
    invoke-virtual {v3, p1}, Ldefpackage/dx4;->v(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object p0, p0, Ldefpackage/hx4;->n:Ldefpackage/dx4;

    .line 56
    .line 57
    const/4 p1, 0x1

    .line 58
    invoke-virtual {p0, p1}, Ldefpackage/dx4;->h(Z)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
