.class public final La52;
.super Lqe4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final i1()Lpe4;
    .locals 27

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, v0, Lv52;->k:Z

    .line 6
    .line 7
    iget-boolean v2, v0, Lv52;->b:Z

    .line 8
    .line 9
    invoke-static {}, Lu52;->k()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lu52;->l()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v3, Lu01;->n:Lu01;

    .line 21
    .line 22
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    iget v4, v0, Lv52;->p:I

    .line 29
    .line 30
    if-lez v4, :cond_1

    .line 31
    .line 32
    invoke-static {}, Lu52;->d()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v4, v3

    .line 42
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/4 v5, -0x1

    .line 49
    goto :goto_3

    .line 50
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_3

    .line 55
    .line 56
    :goto_2
    const/4 v5, 0x0

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    iget v5, v0, Lv52;->o:I

    .line 59
    .line 60
    invoke-static {v4}, Lgb;->C(Ljava/util/Collection;)Lj02;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    iget v8, v7, Lh02;->o:I

    .line 65
    .line 66
    invoke-virtual {v7}, Lj02;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-nez v9, :cond_12

    .line 71
    .line 72
    if-gez v5, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    if-le v5, v8, :cond_5

    .line 76
    .line 77
    move v5, v8

    .line 78
    :cond_5
    :goto_3
    new-instance v7, Ljava/util/ArrayList;

    .line 79
    .line 80
    const/16 v8, 0xa

    .line 81
    .line 82
    invoke-static {v4, v8}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    const/4 v10, 0x0

    .line 94
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v11

    .line 98
    const/4 v12, 0x1

    .line 99
    const/4 v13, 0x0

    .line 100
    if-eqz v11, :cond_b

    .line 101
    .line 102
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    add-int/lit8 v14, v10, 0x1

    .line 107
    .line 108
    if-ltz v10, :cond_a

    .line 109
    .line 110
    check-cast v11, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 111
    .line 112
    const-wide/16 v15, 0x3e8

    .line 113
    .line 114
    move-object/from16 v17, v9

    .line 115
    .line 116
    if-ne v10, v5, :cond_6

    .line 117
    .line 118
    iget-wide v8, v0, Lv52;->i:J

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_6
    invoke-virtual {v11}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    if-eqz v8, :cond_7

    .line 126
    .line 127
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    goto :goto_5

    .line 132
    :cond_7
    const/4 v8, 0x0

    .line 133
    :goto_5
    int-to-long v8, v8

    .line 134
    mul-long/2addr v8, v15

    .line 135
    :goto_6
    new-instance v13, Lge4;

    .line 136
    .line 137
    iget-object v6, v0, Lv52;->s:Ljava/lang/String;

    .line 138
    .line 139
    move-wide/from16 v18, v15

    .line 140
    .line 141
    new-instance v15, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v6, ":"

    .line 150
    .line 151
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-direct {v13, v6}, Lge4;-><init>(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance v6, Lum2;

    .line 165
    .line 166
    invoke-direct {v6}, Lum2;-><init>()V

    .line 167
    .line 168
    .line 169
    sget-object v10, Lyw1;->o:Lvw1;

    .line 170
    .line 171
    sget-object v10, Lgy3;->r:Lgy3;

    .line 172
    .line 173
    sget-object v10, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 174
    .line 175
    sget-object v10, Lgy3;->r:Lgy3;

    .line 176
    .line 177
    new-instance v10, Lzm2;

    .line 178
    .line 179
    invoke-direct {v10}, Lzm2;-><init>()V

    .line 180
    .line 181
    .line 182
    sget-object v26, Lcn2;->d:Lcn2;

    .line 183
    .line 184
    invoke-virtual {v11}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v21

    .line 188
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v11}, Lsi0;->E(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldo2;

    .line 192
    .line 193
    .line 194
    move-result-object v25

    .line 195
    new-instance v20, Lgn2;

    .line 196
    .line 197
    new-instance v11, Lwm2;

    .line 198
    .line 199
    invoke-direct {v11, v6}, Lvm2;-><init>(Lum2;)V

    .line 200
    .line 201
    .line 202
    new-instance v6, Lan2;

    .line 203
    .line 204
    invoke-direct {v6, v10}, Lan2;-><init>(Lzm2;)V

    .line 205
    .line 206
    .line 207
    const/16 v23, 0x0

    .line 208
    .line 209
    move-object/from16 v24, v6

    .line 210
    .line 211
    move-object/from16 v22, v11

    .line 212
    .line 213
    invoke-direct/range {v20 .. v26}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 214
    .line 215
    .line 216
    move-object/from16 v6, v20

    .line 217
    .line 218
    iput-object v6, v13, Lge4;->c:Lgn2;

    .line 219
    .line 220
    const-wide/16 v10, 0x0

    .line 221
    .line 222
    cmp-long v6, v8, v10

    .line 223
    .line 224
    if-lez v6, :cond_8

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_8
    const/4 v12, 0x0

    .line 228
    :goto_7
    iput-boolean v12, v13, Lge4;->j:Z

    .line 229
    .line 230
    if-lez v6, :cond_9

    .line 231
    .line 232
    mul-long v8, v8, v18

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    :goto_8
    invoke-virtual {v13, v8, v9}, Lge4;->a(J)V

    .line 241
    .line 242
    .line 243
    new-instance v6, Lhe4;

    .line 244
    .line 245
    invoke-direct {v6, v13}, Lhe4;-><init>(Lge4;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move v10, v14

    .line 252
    move-object/from16 v9, v17

    .line 253
    .line 254
    const/16 v8, 0xa

    .line 255
    .line 256
    goto/16 :goto_4

    .line 257
    .line 258
    :cond_a
    invoke-static {}, Lgb;->c0()V

    .line 259
    .line 260
    .line 261
    throw v13

    .line 262
    :cond_b
    new-instance v6, Lxk0;

    .line 263
    .line 264
    const/4 v8, 0x2

    .line 265
    invoke-direct {v6, v8}, Lxk0;-><init>(I)V

    .line 266
    .line 267
    .line 268
    const/16 v9, 0x10

    .line 269
    .line 270
    const/16 v10, 0x16

    .line 271
    .line 272
    const/16 v11, 0x11

    .line 273
    .line 274
    const/16 v14, 0x12

    .line 275
    .line 276
    filled-new-array {v11, v14, v9, v10}, [I

    .line 277
    .line 278
    .line 279
    move-result-object v9

    .line 280
    invoke-virtual {v6, v9}, Lxk0;->d([I)V

    .line 281
    .line 282
    .line 283
    if-eqz v2, :cond_c

    .line 284
    .line 285
    const/16 v9, 0x18

    .line 286
    .line 287
    const/16 v10, 0xd

    .line 288
    .line 289
    const/16 v11, 0xf

    .line 290
    .line 291
    const/16 v14, 0xe

    .line 292
    .line 293
    filled-new-array {v12, v11, v14, v9, v10}, [I

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    invoke-virtual {v6, v9}, Lxk0;->d([I)V

    .line 298
    .line 299
    .line 300
    :cond_c
    if-eqz v2, :cond_e

    .line 301
    .line 302
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-nez v3, :cond_e

    .line 307
    .line 308
    const/4 v3, 0x5

    .line 309
    const/16 v9, 0xa

    .line 310
    .line 311
    filled-new-array {v3, v9}, [I

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v6, v3}, Lxk0;->d([I)V

    .line 316
    .line 317
    .line 318
    const/4 v3, 0x7

    .line 319
    invoke-virtual {v6, v3}, Lxk0;->b(I)V

    .line 320
    .line 321
    .line 322
    iget-boolean v3, v0, Lv52;->v:Z

    .line 323
    .line 324
    if-eqz v3, :cond_d

    .line 325
    .line 326
    const/16 v3, 0x8

    .line 327
    .line 328
    const/16 v9, 0x9

    .line 329
    .line 330
    filled-new-array {v3, v9}, [I

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v6, v3}, Lxk0;->d([I)V

    .line 335
    .line 336
    .line 337
    :cond_d
    iget-boolean v3, v0, Lv52;->w:Z

    .line 338
    .line 339
    if-eqz v3, :cond_e

    .line 340
    .line 341
    const/4 v3, 0x6

    .line 342
    invoke-virtual {v6, v3}, Lxk0;->b(I)V

    .line 343
    .line 344
    .line 345
    :cond_e
    new-instance v3, Lmi3;

    .line 346
    .line 347
    invoke-virtual {v6}, Lxk0;->f()Lw71;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-direct {v3, v6}, Lmi3;-><init>(Lw71;)V

    .line 352
    .line 353
    .line 354
    new-instance v6, Loe4;

    .line 355
    .line 356
    invoke-direct {v6}, Loe4;-><init>()V

    .line 357
    .line 358
    .line 359
    iput-object v3, v6, Loe4;->a:Lmi3;

    .line 360
    .line 361
    invoke-virtual {v6, v7}, Loe4;->b(Ljava/util/ArrayList;)V

    .line 362
    .line 363
    .line 364
    iput v5, v6, Loe4;->B:I

    .line 365
    .line 366
    iput-boolean v1, v6, Loe4;->b:Z

    .line 367
    .line 368
    iput v12, v6, Loe4;->c:I

    .line 369
    .line 370
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-eqz v3, :cond_f

    .line 375
    .line 376
    move v8, v12

    .line 377
    goto :goto_9

    .line 378
    :cond_f
    if-nez v2, :cond_10

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_10
    const/4 v8, 0x3

    .line 382
    :goto_9
    iput v8, v6, Loe4;->d:I

    .line 383
    .line 384
    if-eqz v1, :cond_11

    .line 385
    .line 386
    iget-boolean v1, v0, Lv52;->j:Z

    .line 387
    .line 388
    if-nez v1, :cond_11

    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_11
    const/4 v12, 0x0

    .line 392
    :goto_a
    iput v12, v6, Loe4;->e:I

    .line 393
    .line 394
    iget v1, v0, Lv52;->u:I

    .line 395
    .line 396
    iput v1, v6, Loe4;->g:I

    .line 397
    .line 398
    iget-boolean v1, v0, Lv52;->t:Z

    .line 399
    .line 400
    iput-boolean v1, v6, Loe4;->h:Z

    .line 401
    .line 402
    iget v1, v0, Lv52;->l:F

    .line 403
    .line 404
    invoke-virtual {v6, v1}, Loe4;->c(F)V

    .line 405
    .line 406
    .line 407
    new-instance v1, Lqh3;

    .line 408
    .line 409
    iget v2, v0, Lv52;->y:F

    .line 410
    .line 411
    iget v3, v0, Lv52;->z:F

    .line 412
    .line 413
    invoke-direct {v1, v2, v3}, Lqh3;-><init>(FF)V

    .line 414
    .line 415
    .line 416
    iput-object v1, v6, Loe4;->l:Lqh3;

    .line 417
    .line 418
    new-instance v1, Lcn;

    .line 419
    .line 420
    const/16 v2, 0x13

    .line 421
    .line 422
    invoke-direct {v1, v2, v0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    iput-object v13, v6, Loe4;->E:Ljava/lang/Long;

    .line 426
    .line 427
    iput-object v1, v6, Loe4;->F:Lne4;

    .line 428
    .line 429
    new-instance v0, Lpe4;

    .line 430
    .line 431
    invoke-direct {v0, v6}, Lpe4;-><init>(Loe4;)V

    .line 432
    .line 433
    .line 434
    return-object v0

    .line 435
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 436
    .line 437
    new-instance v1, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    const-string v2, "Cannot coerce value to an empty range: "

    .line 440
    .line 441
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    const/16 v2, 0x2e

    .line 448
    .line 449
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw v0
.end method

.method public final r1(IIJ)Lic2;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lu52;->c()Lv52;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Lv52;->o:I

    .line 11
    .line 12
    if-eq p1, p0, :cond_0

    .line 13
    .line 14
    const-string p0, "select"

    .line 15
    .line 16
    invoke-static {p0, p1, p1}, Lu52;->q(Ljava/lang/String;II)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long p0, p3, p0

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    move-wide p3, v0

    .line 30
    :cond_1
    const-string p0, "seek"

    .line 31
    .line 32
    invoke-static {p0, p3, p4}, Lu52;->a(Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_0
    const-string p0, "next"

    .line 37
    .line 38
    invoke-static {p0, v0, v1}, Lu52;->a(Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_1
    const-string p0, "previous"

    .line 43
    .line 44
    invoke-static {p0, v0, v1}, Lu52;->a(Ljava/lang/String;J)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p0, Lmw1;->o:Lmw1;

    .line 48
    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final t1(Z)Lic2;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string p0, "play"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p0, "pause"

    .line 7
    .line 8
    :goto_0
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Lu52;->a(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lmw1;->o:Lmw1;

    .line 14
    .line 15
    return-object p0
.end method

.method public final u1(Lqh3;)Lic2;
    .locals 0

    .line 1
    iget p0, p1, Lqh3;->a:F

    .line 2
    .line 3
    iget p1, p1, Lqh3;->b:F

    .line 4
    .line 5
    invoke-static {p0, p1}, Lu52;->j(FF)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lmw1;->o:Lmw1;

    .line 9
    .line 10
    return-object p0
.end method

.method public final v1(I)Lic2;
    .locals 2

    .line 1
    const-string p0, "repeat"

    .line 2
    .line 3
    int-to-long v0, p1

    .line 4
    invoke-static {p0, v0, v1}, Lu52;->a(Ljava/lang/String;J)V

    .line 5
    .line 6
    .line 7
    sget-object p0, Lmw1;->o:Lmw1;

    .line 8
    .line 9
    return-object p0
.end method

.method public final w1(Z)Lic2;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-wide/16 p0, 0x1

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-wide/16 p0, 0x0

    .line 7
    .line 8
    :goto_0
    const-string v0, "shuffle"

    .line 9
    .line 10
    invoke-static {v0, p0, p1}, Lu52;->a(Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lmw1;->o:Lmw1;

    .line 14
    .line 15
    return-object p0
.end method

.method public final x1(F)Lic2;
    .locals 1

    .line 1
    const/high16 p0, 0x42c80000    # 100.0f

    .line 2
    .line 3
    mul-float/2addr p1, p0

    .line 4
    float-to-long p0, p1

    .line 5
    const-string v0, "volume"

    .line 6
    .line 7
    invoke-static {v0, p0, p1}, Lu52;->a(Ljava/lang/String;J)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lmw1;->o:Lmw1;

    .line 11
    .line 12
    return-object p0
.end method
