.class public final Lb9;
.super Landroid/os/Handler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 15
    const/4 v0, 0x0

    iput v0, p0, Lb9;->a:I

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public constructor <init>(Lxx3;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lb9;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lb9;->b:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lb9;->a:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch v2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lb9;->b:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lxx3;

    .line 18
    .line 19
    if-eqz v0, :cond_15

    .line 20
    .line 21
    iget-object v2, v0, Lxx3;->h:Landroid/util/SparseArray;

    .line 22
    .line 23
    iget-object v4, v0, Lxx3;->i:Lcy3;

    .line 24
    .line 25
    iget-object v5, v4, Lcy3;->x:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget v6, v1, Landroid/os/Message;->what:I

    .line 28
    .line 29
    iget v7, v1, Landroid/os/Message;->arg1:I

    .line 30
    .line 31
    iget v8, v1, Landroid/os/Message;->arg2:I

    .line 32
    .line 33
    iget-object v9, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/os/Message;->peekData()Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    packed-switch v6, :pswitch_data_1

    .line 42
    .line 43
    .line 44
    goto/16 :goto_6

    .line 45
    .line 46
    :pswitch_0
    iget-object v1, v4, Lcy3;->A:Lxx3;

    .line 47
    .line 48
    if-ne v1, v0, :cond_13

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    :cond_0
    if-ge v10, v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    add-int/lit8 v10, v10, 0x1

    .line 61
    .line 62
    check-cast v1, Lyx3;

    .line 63
    .line 64
    invoke-interface {v1}, Lyx3;->a()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-ne v2, v8, :cond_0

    .line 69
    .line 70
    move-object v11, v1

    .line 71
    :cond_1
    iget-object v0, v4, Lcy3;->C:Lss2;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    instance-of v1, v11, Loq2;

    .line 76
    .line 77
    if-eqz v1, :cond_2

    .line 78
    .line 79
    move-object v1, v11

    .line 80
    check-cast v1, Loq2;

    .line 81
    .line 82
    iget-object v0, v0, Lss2;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lip0;

    .line 85
    .line 86
    iget-object v0, v0, Lip0;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lui1;

    .line 89
    .line 90
    iget-object v2, v0, Lui1;->d:Loq2;

    .line 91
    .line 92
    if-ne v2, v1, :cond_2

    .line 93
    .line 94
    invoke-virtual {v0}, Lui1;->c()Lwq2;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    const/4 v2, 0x2

    .line 99
    invoke-virtual {v0, v1, v2, v3}, Lui1;->i(Lwq2;IZ)V

    .line 100
    .line 101
    .line 102
    :cond_2
    if-eqz v11, :cond_13

    .line 103
    .line 104
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-interface {v11}, Lyx3;->c()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Lcy3;->l()V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :pswitch_1
    if-eqz v9, :cond_3

    .line 116
    .line 117
    instance-of v1, v9, Landroid/os/Bundle;

    .line 118
    .line 119
    if-eqz v1, :cond_13

    .line 120
    .line 121
    :cond_3
    check-cast v9, Landroid/os/Bundle;

    .line 122
    .line 123
    iget v1, v0, Lxx3;->f:I

    .line 124
    .line 125
    if-eqz v1, :cond_13

    .line 126
    .line 127
    const-string v1, "groupRoute"

    .line 128
    .line 129
    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Landroid/os/Bundle;

    .line 134
    .line 135
    if-eqz v1, :cond_4

    .line 136
    .line 137
    new-instance v2, Lsp2;

    .line 138
    .line 139
    invoke-direct {v2, v1}, Lsp2;-><init>(Landroid/os/Bundle;)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_4
    move-object v2, v11

    .line 144
    :goto_0
    const-string v1, "dynamicRoutes"

    .line 145
    .line 146
    invoke-virtual {v9, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    new-instance v6, Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    move v9, v10

    .line 160
    :goto_1
    if-ge v9, v7, :cond_7

    .line 161
    .line 162
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v12

    .line 166
    add-int/lit8 v9, v9, 0x1

    .line 167
    .line 168
    check-cast v12, Landroid/os/Bundle;

    .line 169
    .line 170
    if-nez v12, :cond_5

    .line 171
    .line 172
    move-object v15, v11

    .line 173
    goto :goto_3

    .line 174
    :cond_5
    const-string v13, "mrDescriptor"

    .line 175
    .line 176
    invoke-virtual {v12, v13}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 177
    .line 178
    .line 179
    move-result-object v13

    .line 180
    if-eqz v13, :cond_6

    .line 181
    .line 182
    new-instance v14, Lsp2;

    .line 183
    .line 184
    invoke-direct {v14, v13}, Lsp2;-><init>(Landroid/os/Bundle;)V

    .line 185
    .line 186
    .line 187
    move-object/from16 v16, v14

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    move-object/from16 v16, v11

    .line 191
    .line 192
    :goto_2
    const-string v13, "selectionState"

    .line 193
    .line 194
    invoke-virtual {v12, v13, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 195
    .line 196
    .line 197
    move-result v17

    .line 198
    const-string v13, "isUnselectable"

    .line 199
    .line 200
    invoke-virtual {v12, v13, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v18

    .line 204
    const-string v13, "isGroupable"

    .line 205
    .line 206
    invoke-virtual {v12, v13, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v19

    .line 210
    const-string v13, "isTransferable"

    .line 211
    .line 212
    invoke-virtual {v12, v13, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 213
    .line 214
    .line 215
    move-result v20

    .line 216
    new-instance v15, Lmq2;

    .line 217
    .line 218
    invoke-direct/range {v15 .. v20}, Lmq2;-><init>(Lsp2;IZZZ)V

    .line 219
    .line 220
    .line 221
    :goto_3
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_1

    .line 225
    :cond_7
    iget-object v1, v4, Lcy3;->A:Lxx3;

    .line 226
    .line 227
    if-ne v1, v0, :cond_15

    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    :cond_8
    if-ge v10, v0, :cond_9

    .line 234
    .line 235
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    add-int/lit8 v10, v10, 0x1

    .line 240
    .line 241
    check-cast v1, Lyx3;

    .line 242
    .line 243
    invoke-interface {v1}, Lyx3;->a()I

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-ne v3, v8, :cond_8

    .line 248
    .line 249
    move-object v11, v1

    .line 250
    :cond_9
    instance-of v0, v11, Lay3;

    .line 251
    .line 252
    if-eqz v0, :cond_15

    .line 253
    .line 254
    check-cast v11, Lay3;

    .line 255
    .line 256
    invoke-virtual {v11, v2, v6}, Lnq2;->l(Lsp2;Ljava/util/ArrayList;)V

    .line 257
    .line 258
    .line 259
    goto/16 :goto_7

    .line 260
    .line 261
    :pswitch_2
    instance-of v0, v9, Landroid/os/Bundle;

    .line 262
    .line 263
    if-eqz v0, :cond_b

    .line 264
    .line 265
    check-cast v9, Landroid/os/Bundle;

    .line 266
    .line 267
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, Lzx3;

    .line 272
    .line 273
    const-string v1, "routeId"

    .line 274
    .line 275
    invoke-virtual {v9, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_a

    .line 280
    .line 281
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->remove(I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v9}, Lzx3;->b(Landroid/os/Bundle;)V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_6

    .line 288
    .line 289
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const-string v0, "DynamicGroupRouteController is created without valid route id."

    .line 293
    .line 294
    invoke-static {v0, v9}, Lzx3;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_6

    .line 298
    .line 299
    :cond_b
    const-string v0, "MediaRouteProviderProxy"

    .line 300
    .line 301
    const-string v1, "No further information on the dynamic group controller"

    .line 302
    .line 303
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 304
    .line 305
    .line 306
    goto/16 :goto_6

    .line 307
    .line 308
    :pswitch_3
    if-eqz v9, :cond_c

    .line 309
    .line 310
    instance-of v1, v9, Landroid/os/Bundle;

    .line 311
    .line 312
    if-eqz v1, :cond_13

    .line 313
    .line 314
    :cond_c
    check-cast v9, Landroid/os/Bundle;

    .line 315
    .line 316
    iget v1, v0, Lxx3;->f:I

    .line 317
    .line 318
    if-eqz v1, :cond_13

    .line 319
    .line 320
    invoke-static {v9}, Lxk0;->h(Landroid/os/Bundle;)Lxk0;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    iget-object v2, v4, Lcy3;->A:Lxx3;

    .line 325
    .line 326
    if-ne v2, v0, :cond_15

    .line 327
    .line 328
    invoke-virtual {v4, v1}, Lqq2;->f(Lxk0;)V

    .line 329
    .line 330
    .line 331
    goto/16 :goto_7

    .line 332
    .line 333
    :pswitch_4
    if-eqz v9, :cond_d

    .line 334
    .line 335
    instance-of v0, v9, Landroid/os/Bundle;

    .line 336
    .line 337
    if-eqz v0, :cond_13

    .line 338
    .line 339
    :cond_d
    if-nez v1, :cond_e

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_e
    const-string v0, "error"

    .line 343
    .line 344
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    :goto_4
    check-cast v9, Landroid/os/Bundle;

    .line 349
    .line 350
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, Lzx3;

    .line 355
    .line 356
    if-eqz v0, :cond_13

    .line 357
    .line 358
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->remove(I)V

    .line 359
    .line 360
    .line 361
    invoke-static {v11, v9}, Lzx3;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 362
    .line 363
    .line 364
    goto/16 :goto_7

    .line 365
    .line 366
    :pswitch_5
    if-eqz v9, :cond_f

    .line 367
    .line 368
    instance-of v0, v9, Landroid/os/Bundle;

    .line 369
    .line 370
    if-eqz v0, :cond_13

    .line 371
    .line 372
    :cond_f
    check-cast v9, Landroid/os/Bundle;

    .line 373
    .line 374
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    check-cast v0, Lzx3;

    .line 379
    .line 380
    if-eqz v0, :cond_13

    .line 381
    .line 382
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->remove(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v9}, Lzx3;->b(Landroid/os/Bundle;)V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_7

    .line 389
    .line 390
    :pswitch_6
    if-eqz v9, :cond_10

    .line 391
    .line 392
    instance-of v1, v9, Landroid/os/Bundle;

    .line 393
    .line 394
    if-eqz v1, :cond_13

    .line 395
    .line 396
    :cond_10
    check-cast v9, Landroid/os/Bundle;

    .line 397
    .line 398
    iget v1, v0, Lxx3;->f:I

    .line 399
    .line 400
    if-nez v1, :cond_13

    .line 401
    .line 402
    iget v1, v0, Lxx3;->g:I

    .line 403
    .line 404
    if-ne v7, v1, :cond_13

    .line 405
    .line 406
    if-lt v8, v3, :cond_13

    .line 407
    .line 408
    iput v10, v0, Lxx3;->g:I

    .line 409
    .line 410
    iput v8, v0, Lxx3;->f:I

    .line 411
    .line 412
    invoke-static {v9}, Lxk0;->h(Landroid/os/Bundle;)Lxk0;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    iget-object v2, v4, Lcy3;->A:Lxx3;

    .line 417
    .line 418
    if-ne v2, v0, :cond_11

    .line 419
    .line 420
    invoke-virtual {v4, v1}, Lqq2;->f(Lxk0;)V

    .line 421
    .line 422
    .line 423
    :cond_11
    iget-object v1, v4, Lcy3;->A:Lxx3;

    .line 424
    .line 425
    if-ne v1, v0, :cond_15

    .line 426
    .line 427
    iput-boolean v3, v4, Lcy3;->B:Z

    .line 428
    .line 429
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    :goto_5
    if-ge v10, v0, :cond_12

    .line 434
    .line 435
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, Lyx3;

    .line 440
    .line 441
    iget-object v2, v4, Lcy3;->A:Lxx3;

    .line 442
    .line 443
    invoke-interface {v1, v2}, Lyx3;->b(Lxx3;)V

    .line 444
    .line 445
    .line 446
    add-int/lit8 v10, v10, 0x1

    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_12
    iget-object v0, v4, Lqq2;->r:Lup2;

    .line 450
    .line 451
    if-eqz v0, :cond_15

    .line 452
    .line 453
    iget-object v5, v4, Lcy3;->A:Lxx3;

    .line 454
    .line 455
    iget v7, v5, Lxx3;->d:I

    .line 456
    .line 457
    add-int/lit8 v1, v7, 0x1

    .line 458
    .line 459
    iput v1, v5, Lxx3;->d:I

    .line 460
    .line 461
    iget-object v9, v0, Lup2;->a:Landroid/os/Bundle;

    .line 462
    .line 463
    const/4 v10, 0x0

    .line 464
    const/16 v6, 0xa

    .line 465
    .line 466
    const/4 v8, 0x0

    .line 467
    invoke-virtual/range {v5 .. v10}, Lxx3;->b(IIILandroid/os/Bundle;Landroid/os/Bundle;)Z

    .line 468
    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_13
    :goto_6
    sget v0, Lcy3;->D:I

    .line 472
    .line 473
    goto :goto_7

    .line 474
    :pswitch_7
    iget v1, v0, Lxx3;->g:I

    .line 475
    .line 476
    if-ne v7, v1, :cond_14

    .line 477
    .line 478
    iput v10, v0, Lxx3;->g:I

    .line 479
    .line 480
    iget-object v1, v4, Lcy3;->A:Lxx3;

    .line 481
    .line 482
    if-ne v1, v0, :cond_14

    .line 483
    .line 484
    invoke-virtual {v4}, Lcy3;->k()V

    .line 485
    .line 486
    .line 487
    :cond_14
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, Lzx3;

    .line 492
    .line 493
    if-eqz v0, :cond_15

    .line 494
    .line 495
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->remove(I)V

    .line 496
    .line 497
    .line 498
    invoke-static {v11, v11}, Lzx3;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 499
    .line 500
    .line 501
    :cond_15
    :goto_7
    :pswitch_8
    return-void

    .line 502
    :pswitch_9
    iget v2, v1, Landroid/os/Message;->what:I

    .line 503
    .line 504
    const/4 v4, -0x3

    .line 505
    if-eq v2, v4, :cond_17

    .line 506
    .line 507
    const/4 v4, -0x2

    .line 508
    if-eq v2, v4, :cond_17

    .line 509
    .line 510
    const/4 v4, -0x1

    .line 511
    if-eq v2, v4, :cond_17

    .line 512
    .line 513
    if-eq v2, v3, :cond_16

    .line 514
    .line 515
    goto :goto_8

    .line 516
    :cond_16
    iget-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Landroid/content/DialogInterface;

    .line 519
    .line 520
    invoke-interface {v0}, Landroid/content/DialogInterface;->dismiss()V

    .line 521
    .line 522
    .line 523
    goto :goto_8

    .line 524
    :cond_17
    iget-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v2, Landroid/content/DialogInterface$OnClickListener;

    .line 527
    .line 528
    iget-object v0, v0, Lb9;->b:Ljava/lang/ref/WeakReference;

    .line 529
    .line 530
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    check-cast v0, Landroid/content/DialogInterface;

    .line 535
    .line 536
    iget v1, v1, Landroid/os/Message;->what:I

    .line 537
    .line 538
    invoke-interface {v2, v0, v1}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    .line 539
    .line 540
    .line 541
    :goto_8
    return-void

    .line 542
    nop

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
    .end packed-switch

    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
