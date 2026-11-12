.class public final Lkd1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lid1;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;

.field public final synthetic c:Lld1;


# direct methods
.method public synthetic constructor <init>(Lld1;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lkd1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lkd1;->c:Lld1;

    .line 4
    .line 5
    iput-object p2, p0, Lkd1;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v0, Lkd1;->a:I

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, Lkd1;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, v0, Lkd1;->c:Lld1;

    .line 14
    .line 15
    packed-switch v3, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    invoke-virtual {v0, v3, v6, v4}, Lld1;->B(ILjava/lang/String;Z)I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    if-gez v8, :cond_0

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    goto/16 :goto_e

    .line 27
    .line 28
    :cond_0
    move v9, v8

    .line 29
    :goto_0
    iget-object v10, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    const-string v11, "saveBackStack(\""

    .line 36
    .line 37
    if-ge v9, v10, :cond_2

    .line 38
    .line 39
    iget-object v10, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    check-cast v10, Lpo;

    .line 46
    .line 47
    iget-boolean v12, v10, Lpo;->p:Z

    .line 48
    .line 49
    if-eqz v12, :cond_1

    .line 50
    .line 51
    add-int/lit8 v9, v9, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v3, "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found "

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v3, " that did not use setReorderingAllowed(true)."

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 85
    .line 86
    .line 87
    throw v5

    .line 88
    :cond_2
    new-instance v9, Ljava/util/HashSet;

    .line 89
    .line 90
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    move v10, v8

    .line 94
    :goto_1
    iget-object v12, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-ge v10, v12, :cond_c

    .line 101
    .line 102
    iget-object v12, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    check-cast v12, Lpo;

    .line 109
    .line 110
    new-instance v15, Ljava/util/HashSet;

    .line 111
    .line 112
    invoke-direct {v15}, Ljava/util/HashSet;-><init>()V

    .line 113
    .line 114
    .line 115
    move/from16 p0, v3

    .line 116
    .line 117
    new-instance v3, Ljava/util/HashSet;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 120
    .line 121
    .line 122
    iget-object v7, v12, Lpo;->a:Ljava/util/ArrayList;

    .line 123
    .line 124
    move-object/from16 v17, v5

    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    const/4 v13, 0x0

    .line 131
    :goto_2
    if-ge v13, v5, :cond_9

    .line 132
    .line 133
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v18

    .line 137
    add-int/lit8 v13, v13, 0x1

    .line 138
    .line 139
    move-object/from16 v14, v18

    .line 140
    .line 141
    check-cast v14, Lje1;

    .line 142
    .line 143
    iget-object v4, v14, Lje1;->b:Lkc1;

    .line 144
    .line 145
    if-nez v4, :cond_3

    .line 146
    .line 147
    :goto_3
    const/4 v4, 0x1

    .line 148
    goto :goto_2

    .line 149
    :cond_3
    move/from16 v19, v5

    .line 150
    .line 151
    iget-boolean v5, v14, Lje1;->c:Z

    .line 152
    .line 153
    if-eqz v5, :cond_4

    .line 154
    .line 155
    iget v5, v14, Lje1;->a:I

    .line 156
    .line 157
    move-object/from16 v20, v7

    .line 158
    .line 159
    const/4 v7, 0x1

    .line 160
    if-eq v5, v7, :cond_5

    .line 161
    .line 162
    const/4 v7, 0x2

    .line 163
    if-eq v5, v7, :cond_5

    .line 164
    .line 165
    const/16 v7, 0x8

    .line 166
    .line 167
    if-ne v5, v7, :cond_6

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_4
    move-object/from16 v20, v7

    .line 171
    .line 172
    :cond_5
    :goto_4
    invoke-virtual {v9, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    invoke-virtual {v15, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_6
    iget v5, v14, Lje1;->a:I

    .line 179
    .line 180
    const/4 v7, 0x1

    .line 181
    if-eq v5, v7, :cond_7

    .line 182
    .line 183
    const/4 v7, 0x2

    .line 184
    if-ne v5, v7, :cond_8

    .line 185
    .line 186
    :cond_7
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :cond_8
    move/from16 v5, v19

    .line 190
    .line 191
    move-object/from16 v7, v20

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_9
    invoke-virtual {v15, v3}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    invoke-virtual {v15}, Ljava/util/HashSet;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_b

    .line 202
    .line 203
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 204
    .line 205
    const-string v2, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment"

    .line 206
    .line 207
    invoke-static {v11, v6, v2}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v15}, Ljava/util/HashSet;->size()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    const/4 v7, 0x1

    .line 216
    if-ne v3, v7, :cond_a

    .line 217
    .line 218
    new-instance v3, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v4, " "

    .line 221
    .line 222
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v15}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    goto :goto_5

    .line 241
    :cond_a
    new-instance v3, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    const-string v4, "s "

    .line 244
    .line 245
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :goto_5
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    const-string v3, " in "

    .line 259
    .line 260
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    const-string v3, " that were previously added to the FragmentManager through a separate FragmentTransaction."

    .line 267
    .line 268
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 279
    .line 280
    .line 281
    throw v17

    .line 282
    :cond_b
    add-int/lit8 v10, v10, 0x1

    .line 283
    .line 284
    move/from16 v3, p0

    .line 285
    .line 286
    move-object/from16 v5, v17

    .line 287
    .line 288
    const/4 v4, 0x1

    .line 289
    goto/16 :goto_1

    .line 290
    .line 291
    :cond_c
    move/from16 p0, v3

    .line 292
    .line 293
    move-object/from16 v17, v5

    .line 294
    .line 295
    new-instance v3, Ljava/util/ArrayDeque;

    .line 296
    .line 297
    invoke-direct {v3, v9}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 298
    .line 299
    .line 300
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-nez v4, :cond_11

    .line 305
    .line 306
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    check-cast v4, Lkc1;

    .line 311
    .line 312
    iget-boolean v5, v4, Lkc1;->O:Z

    .line 313
    .line 314
    if-eqz v5, :cond_f

    .line 315
    .line 316
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 317
    .line 318
    const-string v2, "\") must not contain retained fragments. Found "

    .line 319
    .line 320
    invoke-static {v11, v6, v2}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    invoke-virtual {v9, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_e

    .line 329
    .line 330
    const-string v3, "direct reference to retained "

    .line 331
    .line 332
    goto :goto_6

    .line 333
    :cond_e
    const-string v3, "retained child "

    .line 334
    .line 335
    :goto_6
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v3, "fragment "

    .line 339
    .line 340
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v1}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 354
    .line 355
    .line 356
    throw v17

    .line 357
    :cond_f
    iget-object v4, v4, Lkc1;->H:Lmd1;

    .line 358
    .line 359
    iget-object v4, v4, Lld1;->c:Lss0;

    .line 360
    .line 361
    invoke-virtual {v4}, Lss0;->w()Ljava/util/ArrayList;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    const/4 v7, 0x0

    .line 370
    :cond_10
    :goto_7
    if-ge v7, v5, :cond_d

    .line 371
    .line 372
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v10

    .line 376
    add-int/lit8 v7, v7, 0x1

    .line 377
    .line 378
    check-cast v10, Lkc1;

    .line 379
    .line 380
    if-eqz v10, :cond_10

    .line 381
    .line 382
    invoke-virtual {v3, v10}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    goto :goto_7

    .line 386
    :cond_11
    new-instance v3, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    if-eqz v5, :cond_12

    .line 400
    .line 401
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    check-cast v5, Lkc1;

    .line 406
    .line 407
    iget-object v5, v5, Lkc1;->r:Ljava/lang/String;

    .line 408
    .line 409
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_12
    new-instance v4, Ljava/util/ArrayList;

    .line 414
    .line 415
    iget-object v5, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 416
    .line 417
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    sub-int/2addr v5, v8

    .line 422
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 423
    .line 424
    .line 425
    move v5, v8

    .line 426
    :goto_9
    iget-object v7, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 427
    .line 428
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    if-ge v5, v7, :cond_13

    .line 433
    .line 434
    move-object/from16 v7, v17

    .line 435
    .line 436
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    add-int/lit8 v5, v5, 0x1

    .line 440
    .line 441
    const/16 v17, 0x0

    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_13
    new-instance v5, Lro;

    .line 445
    .line 446
    invoke-direct {v5, v3, v4}, Lro;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 447
    .line 448
    .line 449
    iget-object v3, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    const/16 v18, 0x1

    .line 456
    .line 457
    add-int/lit8 v3, v3, -0x1

    .line 458
    .line 459
    :goto_a
    if-lt v3, v8, :cond_19

    .line 460
    .line 461
    iget-object v7, v0, Lld1;->d:Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    check-cast v7, Lpo;

    .line 468
    .line 469
    new-instance v9, Lpo;

    .line 470
    .line 471
    invoke-direct {v9, v7}, Lpo;-><init>(Lpo;)V

    .line 472
    .line 473
    .line 474
    iget-object v10, v9, Lpo;->a:Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    add-int/lit8 v11, v11, -0x1

    .line 481
    .line 482
    :goto_b
    if-ltz v11, :cond_18

    .line 483
    .line 484
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v12

    .line 488
    check-cast v12, Lje1;

    .line 489
    .line 490
    iget-boolean v13, v12, Lje1;->c:Z

    .line 491
    .line 492
    if-nez v13, :cond_14

    .line 493
    .line 494
    goto :goto_d

    .line 495
    :cond_14
    iget v13, v12, Lje1;->a:I

    .line 496
    .line 497
    const/16 v14, 0x8

    .line 498
    .line 499
    if-ne v13, v14, :cond_15

    .line 500
    .line 501
    const/4 v13, 0x0

    .line 502
    iput-boolean v13, v12, Lje1;->c:Z

    .line 503
    .line 504
    add-int/lit8 v12, v11, -0x1

    .line 505
    .line 506
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    add-int/lit8 v11, v11, -0x1

    .line 510
    .line 511
    goto :goto_d

    .line 512
    :cond_15
    const/4 v13, 0x0

    .line 513
    iget-object v15, v12, Lje1;->b:Lkc1;

    .line 514
    .line 515
    iget v15, v15, Lkc1;->K:I

    .line 516
    .line 517
    const/4 v14, 0x2

    .line 518
    iput v14, v12, Lje1;->a:I

    .line 519
    .line 520
    iput-boolean v13, v12, Lje1;->c:Z

    .line 521
    .line 522
    add-int/lit8 v12, v11, -0x1

    .line 523
    .line 524
    :goto_c
    if-ltz v12, :cond_17

    .line 525
    .line 526
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v16

    .line 530
    move-object/from16 v13, v16

    .line 531
    .line 532
    check-cast v13, Lje1;

    .line 533
    .line 534
    iget-boolean v14, v13, Lje1;->c:Z

    .line 535
    .line 536
    if-eqz v14, :cond_16

    .line 537
    .line 538
    iget-object v13, v13, Lje1;->b:Lkc1;

    .line 539
    .line 540
    iget v13, v13, Lkc1;->K:I

    .line 541
    .line 542
    if-ne v13, v15, :cond_16

    .line 543
    .line 544
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    add-int/lit8 v11, v11, -0x1

    .line 548
    .line 549
    :cond_16
    add-int/lit8 v12, v12, -0x1

    .line 550
    .line 551
    const/4 v13, 0x0

    .line 552
    const/4 v14, 0x2

    .line 553
    goto :goto_c

    .line 554
    :cond_17
    :goto_d
    add-int/lit8 v11, v11, -0x1

    .line 555
    .line 556
    goto :goto_b

    .line 557
    :cond_18
    new-instance v10, Lqo;

    .line 558
    .line 559
    invoke-direct {v10, v9}, Lqo;-><init>(Lpo;)V

    .line 560
    .line 561
    .line 562
    sub-int v9, v3, v8

    .line 563
    .line 564
    invoke-virtual {v4, v9, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    const/4 v9, 0x1

    .line 568
    iput-boolean v9, v7, Lpo;->t:Z

    .line 569
    .line 570
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 574
    .line 575
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    add-int/lit8 v3, v3, -0x1

    .line 579
    .line 580
    move/from16 v18, v9

    .line 581
    .line 582
    goto :goto_a

    .line 583
    :cond_19
    move/from16 v9, v18

    .line 584
    .line 585
    iget-object v0, v0, Lld1;->j:Ljava/util/Map;

    .line 586
    .line 587
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move v4, v9

    .line 591
    :goto_e
    return v4

    .line 592
    :pswitch_0
    move v9, v4

    .line 593
    iget-object v3, v0, Lld1;->j:Ljava/util/Map;

    .line 594
    .line 595
    invoke-interface {v3, v6}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    check-cast v3, Lro;

    .line 600
    .line 601
    if-nez v3, :cond_1a

    .line 602
    .line 603
    :goto_f
    const/4 v7, 0x0

    .line 604
    goto/16 :goto_16

    .line 605
    .line 606
    :cond_1a
    new-instance v4, Ljava/util/HashMap;

    .line 607
    .line 608
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 612
    .line 613
    .line 614
    move-result v5

    .line 615
    const/4 v6, 0x0

    .line 616
    :cond_1b
    if-ge v6, v5, :cond_1d

    .line 617
    .line 618
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    add-int/lit8 v6, v6, 0x1

    .line 623
    .line 624
    check-cast v7, Lpo;

    .line 625
    .line 626
    iget-boolean v8, v7, Lpo;->t:Z

    .line 627
    .line 628
    if-eqz v8, :cond_1b

    .line 629
    .line 630
    iget-object v7, v7, Lpo;->a:Ljava/util/ArrayList;

    .line 631
    .line 632
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    const/4 v10, 0x0

    .line 637
    :cond_1c
    :goto_10
    if-ge v10, v8, :cond_1b

    .line 638
    .line 639
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    add-int/lit8 v10, v10, 0x1

    .line 644
    .line 645
    check-cast v11, Lje1;

    .line 646
    .line 647
    iget-object v11, v11, Lje1;->b:Lkc1;

    .line 648
    .line 649
    if-eqz v11, :cond_1c

    .line 650
    .line 651
    iget-object v12, v11, Lkc1;->r:Ljava/lang/String;

    .line 652
    .line 653
    invoke-virtual {v4, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    goto :goto_10

    .line 657
    :cond_1d
    new-instance v5, Ljava/util/HashMap;

    .line 658
    .line 659
    iget-object v6, v3, Lro;->n:Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 662
    .line 663
    .line 664
    move-result v7

    .line 665
    invoke-direct {v5, v7}, Ljava/util/HashMap;-><init>(I)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    const/4 v8, 0x0

    .line 673
    :goto_11
    if-ge v8, v7, :cond_22

    .line 674
    .line 675
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v10

    .line 679
    add-int/lit8 v8, v8, 0x1

    .line 680
    .line 681
    check-cast v10, Ljava/lang/String;

    .line 682
    .line 683
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v11

    .line 687
    check-cast v11, Lkc1;

    .line 688
    .line 689
    if-eqz v11, :cond_1e

    .line 690
    .line 691
    iget-object v10, v11, Lkc1;->r:Ljava/lang/String;

    .line 692
    .line 693
    invoke-virtual {v5, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    goto :goto_11

    .line 697
    :cond_1e
    iget-object v11, v0, Lld1;->c:Lss0;

    .line 698
    .line 699
    const/4 v12, 0x0

    .line 700
    invoke-virtual {v11, v10, v12}, Lss0;->G(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 701
    .line 702
    .line 703
    move-result-object v10

    .line 704
    if-eqz v10, :cond_21

    .line 705
    .line 706
    iget-object v11, v0, Lld1;->v:Lmc1;

    .line 707
    .line 708
    iget-object v11, v11, Lmc1;->B:Lnc1;

    .line 709
    .line 710
    invoke-virtual {v11}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 711
    .line 712
    .line 713
    move-result-object v11

    .line 714
    const-string v13, "state"

    .line 715
    .line 716
    invoke-virtual {v10, v13}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 717
    .line 718
    .line 719
    move-result-object v13

    .line 720
    check-cast v13, Lbe1;

    .line 721
    .line 722
    invoke-virtual {v0}, Lld1;->F()Ldd1;

    .line 723
    .line 724
    .line 725
    move-result-object v14

    .line 726
    invoke-virtual {v13, v14}, Lbe1;->a(Ldd1;)Lkc1;

    .line 727
    .line 728
    .line 729
    move-result-object v13

    .line 730
    iput-object v10, v13, Lkc1;->o:Landroid/os/Bundle;

    .line 731
    .line 732
    const-string v14, "savedInstanceState"

    .line 733
    .line 734
    invoke-virtual {v10, v14}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 735
    .line 736
    .line 737
    move-result-object v15

    .line 738
    if-nez v15, :cond_1f

    .line 739
    .line 740
    iget-object v15, v13, Lkc1;->o:Landroid/os/Bundle;

    .line 741
    .line 742
    new-instance v9, Landroid/os/Bundle;

    .line 743
    .line 744
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v15, v14, v9}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 748
    .line 749
    .line 750
    :cond_1f
    const-string v9, "arguments"

    .line 751
    .line 752
    invoke-virtual {v10, v9}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 753
    .line 754
    .line 755
    move-result-object v9

    .line 756
    if-eqz v9, :cond_20

    .line 757
    .line 758
    invoke-virtual {v9, v11}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 759
    .line 760
    .line 761
    :cond_20
    invoke-virtual {v13, v9}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 762
    .line 763
    .line 764
    iget-object v9, v13, Lkc1;->r:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v5, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    :cond_21
    const/4 v9, 0x1

    .line 770
    goto :goto_11

    .line 771
    :cond_22
    new-instance v4, Ljava/util/ArrayList;

    .line 772
    .line 773
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 774
    .line 775
    .line 776
    iget-object v3, v3, Lro;->o:Ljava/util/ArrayList;

    .line 777
    .line 778
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 779
    .line 780
    .line 781
    move-result v6

    .line 782
    const/4 v7, 0x0

    .line 783
    :goto_12
    if-ge v7, v6, :cond_26

    .line 784
    .line 785
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v8

    .line 789
    add-int/lit8 v7, v7, 0x1

    .line 790
    .line 791
    check-cast v8, Lqo;

    .line 792
    .line 793
    iget-object v9, v8, Lqo;->o:Ljava/util/ArrayList;

    .line 794
    .line 795
    new-instance v10, Lpo;

    .line 796
    .line 797
    invoke-direct {v10, v0}, Lpo;-><init>(Lld1;)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v8, v10}, Lqo;->a(Lpo;)V

    .line 801
    .line 802
    .line 803
    const/4 v11, 0x0

    .line 804
    :goto_13
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 805
    .line 806
    .line 807
    move-result v12

    .line 808
    if-ge v11, v12, :cond_25

    .line 809
    .line 810
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v12

    .line 814
    check-cast v12, Ljava/lang/String;

    .line 815
    .line 816
    if-eqz v12, :cond_24

    .line 817
    .line 818
    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v13

    .line 822
    check-cast v13, Lkc1;

    .line 823
    .line 824
    if-eqz v13, :cond_23

    .line 825
    .line 826
    iget-object v12, v10, Lpo;->a:Ljava/util/ArrayList;

    .line 827
    .line 828
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v12

    .line 832
    check-cast v12, Lje1;

    .line 833
    .line 834
    iput-object v13, v12, Lje1;->b:Lkc1;

    .line 835
    .line 836
    goto :goto_14

    .line 837
    :cond_23
    iget-object v0, v8, Lqo;->s:Ljava/lang/String;

    .line 838
    .line 839
    const-string v1, " failed due to missing saved state for Fragment ("

    .line 840
    .line 841
    const-string v2, ")"

    .line 842
    .line 843
    const-string v3, "Restoring FragmentTransaction "

    .line 844
    .line 845
    invoke-static {v3, v0, v1, v12, v2}, Ltb4;->j(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    goto/16 :goto_f

    .line 849
    .line 850
    :cond_24
    :goto_14
    add-int/lit8 v11, v11, 0x1

    .line 851
    .line 852
    goto :goto_13

    .line 853
    :cond_25
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    goto :goto_12

    .line 857
    :cond_26
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 858
    .line 859
    .line 860
    move-result v0

    .line 861
    const/4 v3, 0x0

    .line 862
    const/4 v7, 0x0

    .line 863
    :goto_15
    if-ge v3, v0, :cond_27

    .line 864
    .line 865
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    add-int/lit8 v3, v3, 0x1

    .line 870
    .line 871
    check-cast v5, Lpo;

    .line 872
    .line 873
    invoke-virtual {v5, v1, v2}, Lpo;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 874
    .line 875
    .line 876
    const/4 v7, 0x1

    .line 877
    goto :goto_15

    .line 878
    :cond_27
    :goto_16
    return v7

    .line 879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
