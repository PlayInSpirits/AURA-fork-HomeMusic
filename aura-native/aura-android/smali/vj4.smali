.class public final Lvj4;
.super Lzz1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Lbe3;

.field public final o:Lh00;

.field public p:Liu4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbe3;

    .line 5
    .line 6
    invoke-direct {v0}, Lbe3;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lvj4;->n:Lbe3;

    .line 10
    .line 11
    new-instance v0, Lh00;

    .line 12
    .line 13
    invoke-direct {v0}, Lh00;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lvj4;->o:Lh00;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final k(Luv2;Ljava/nio/ByteBuffer;)Lqv2;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lvj4;->n:Lbe3;

    .line 6
    .line 7
    iget-object v3, v0, Lvj4;->o:Lh00;

    .line 8
    .line 9
    iget-object v4, v0, Lvj4;->p:Liu4;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-wide v5, v1, Luv2;->x:J

    .line 14
    .line 15
    monitor-enter v4

    .line 16
    :try_start_0
    iget-wide v7, v4, Liu4;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit v4

    .line 19
    cmp-long v4, v5, v7

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0

    .line 27
    :cond_0
    :goto_0
    new-instance v4, Liu4;

    .line 28
    .line 29
    iget-wide v5, v1, Lcj0;->t:J

    .line 30
    .line 31
    invoke-direct {v4, v5, v6}, Liu4;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iput-object v4, v0, Lvj4;->p:Liu4;

    .line 35
    .line 36
    iget-wide v5, v1, Lcj0;->t:J

    .line 37
    .line 38
    iget-wide v7, v1, Luv2;->x:J

    .line 39
    .line 40
    sub-long/2addr v5, v7

    .line 41
    invoke-virtual {v4, v5, v6}, Liu4;->a(J)J

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual/range {p2 .. p2}, Ljava/nio/Buffer;->limit()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {v2, v4, v1}, Lbe3;->L(I[B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v4, v1}, Lh00;->o(I[B)V

    .line 56
    .line 57
    .line 58
    const/16 v1, 0x27

    .line 59
    .line 60
    invoke-virtual {v3, v1}, Lh00;->t(I)V

    .line 61
    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    invoke-virtual {v3, v1}, Lh00;->i(I)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    int-to-long v4, v4

    .line 69
    const/16 v6, 0x20

    .line 70
    .line 71
    shl-long/2addr v4, v6

    .line 72
    invoke-virtual {v3, v6}, Lh00;->i(I)I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    int-to-long v6, v6

    .line 77
    or-long v12, v4, v6

    .line 78
    .line 79
    const/16 v4, 0x14

    .line 80
    .line 81
    invoke-virtual {v3, v4}, Lh00;->t(I)V

    .line 82
    .line 83
    .line 84
    const/16 v4, 0xc

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Lh00;->i(I)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    const/16 v5, 0x8

    .line 91
    .line 92
    invoke-virtual {v3, v5}, Lh00;->i(I)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/16 v5, 0xe

    .line 97
    .line 98
    invoke-virtual {v2, v5}, Lbe3;->O(I)V

    .line 99
    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    if-eqz v3, :cond_19

    .line 103
    .line 104
    const/16 v6, 0xff

    .line 105
    .line 106
    const/4 v7, 0x4

    .line 107
    if-eq v3, v6, :cond_18

    .line 108
    .line 109
    const/4 v4, 0x5

    .line 110
    if-eq v3, v7, :cond_e

    .line 111
    .line 112
    if-eq v3, v4, :cond_3

    .line 113
    .line 114
    const/4 v4, 0x6

    .line 115
    if-eq v3, v4, :cond_2

    .line 116
    .line 117
    const/4 v0, 0x0

    .line 118
    goto/16 :goto_f

    .line 119
    .line 120
    :cond_2
    iget-object v0, v0, Lvj4;->p:Liu4;

    .line 121
    .line 122
    invoke-static {v12, v13, v2}, Liq3;->d(JLbe3;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v8

    .line 126
    invoke-virtual {v0, v8, v9}, Liu4;->b(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v10

    .line 130
    new-instance v6, Liq3;

    .line 131
    .line 132
    const/4 v7, 0x2

    .line 133
    invoke-direct/range {v6 .. v11}, Liq3;-><init>(IJJ)V

    .line 134
    .line 135
    .line 136
    move-object v0, v6

    .line 137
    goto/16 :goto_f

    .line 138
    .line 139
    :cond_3
    iget-object v0, v0, Lvj4;->p:Liu4;

    .line 140
    .line 141
    invoke-virtual {v2}, Lbe3;->C()J

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Lbe3;->A()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    and-int/lit16 v3, v3, 0x80

    .line 149
    .line 150
    if-eqz v3, :cond_4

    .line 151
    .line 152
    move v3, v1

    .line 153
    goto :goto_1

    .line 154
    :cond_4
    move v3, v5

    .line 155
    :goto_1
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 156
    .line 157
    if-nez v3, :cond_d

    .line 158
    .line 159
    invoke-virtual {v2}, Lbe3;->A()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    and-int/lit8 v8, v3, 0x40

    .line 164
    .line 165
    if-eqz v8, :cond_5

    .line 166
    .line 167
    move v8, v1

    .line 168
    goto :goto_2

    .line 169
    :cond_5
    move v8, v5

    .line 170
    :goto_2
    and-int/lit8 v9, v3, 0x20

    .line 171
    .line 172
    if-eqz v9, :cond_6

    .line 173
    .line 174
    move v9, v1

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    move v9, v5

    .line 177
    :goto_3
    and-int/lit8 v3, v3, 0x10

    .line 178
    .line 179
    if-eqz v3, :cond_7

    .line 180
    .line 181
    move v3, v1

    .line 182
    goto :goto_4

    .line 183
    :cond_7
    move v3, v5

    .line 184
    :goto_4
    if-eqz v8, :cond_8

    .line 185
    .line 186
    if-nez v3, :cond_8

    .line 187
    .line 188
    invoke-static {v12, v13, v2}, Liq3;->d(JLbe3;)J

    .line 189
    .line 190
    .line 191
    move-result-wide v10

    .line 192
    goto :goto_5

    .line 193
    :cond_8
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    :goto_5
    if-nez v8, :cond_b

    .line 199
    .line 200
    invoke-virtual {v2}, Lbe3;->A()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    new-instance v8, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v8, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 207
    .line 208
    .line 209
    move v14, v5

    .line 210
    :goto_6
    if-ge v14, v4, :cond_a

    .line 211
    .line 212
    invoke-virtual {v2}, Lbe3;->A()I

    .line 213
    .line 214
    .line 215
    if-nez v3, :cond_9

    .line 216
    .line 217
    invoke-static {v12, v13, v2}, Liq3;->d(JLbe3;)J

    .line 218
    .line 219
    .line 220
    move-result-wide v15

    .line 221
    move-wide v6, v15

    .line 222
    goto :goto_7

    .line 223
    :cond_9
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    :goto_7
    new-instance v15, Lxi4;

    .line 229
    .line 230
    invoke-virtual {v0, v6, v7}, Liu4;->b(J)J

    .line 231
    .line 232
    .line 233
    const/4 v6, 0x3

    .line 234
    invoke-direct {v15, v6}, Lxi4;-><init>(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    add-int/lit8 v14, v14, 0x1

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_a
    move-object v4, v8

    .line 244
    :cond_b
    if-eqz v9, :cond_c

    .line 245
    .line 246
    invoke-virtual {v2}, Lbe3;->A()I

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2}, Lbe3;->C()J

    .line 250
    .line 251
    .line 252
    :cond_c
    invoke-virtual {v2}, Lbe3;->H()I

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2}, Lbe3;->A()I

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lbe3;->A()I

    .line 259
    .line 260
    .line 261
    move-wide v13, v10

    .line 262
    :goto_8
    move-object/from16 v17, v4

    .line 263
    .line 264
    goto :goto_9

    .line 265
    :cond_d
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    goto :goto_8

    .line 271
    :goto_9
    new-instance v12, Liq3;

    .line 272
    .line 273
    invoke-virtual {v0, v13, v14}, Liu4;->b(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v15

    .line 277
    invoke-direct/range {v12 .. v17}, Liq3;-><init>(JJLjava/util/List;)V

    .line 278
    .line 279
    .line 280
    move-object v0, v12

    .line 281
    goto/16 :goto_f

    .line 282
    .line 283
    :cond_e
    invoke-virtual {v2}, Lbe3;->A()I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    new-instance v3, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 290
    .line 291
    .line 292
    move v6, v5

    .line 293
    :goto_a
    if-ge v6, v0, :cond_17

    .line 294
    .line 295
    invoke-virtual {v2}, Lbe3;->C()J

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Lbe3;->A()I

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    and-int/lit16 v8, v8, 0x80

    .line 303
    .line 304
    if-eqz v8, :cond_f

    .line 305
    .line 306
    move v8, v1

    .line 307
    goto :goto_b

    .line 308
    :cond_f
    move v8, v5

    .line 309
    :goto_b
    new-instance v9, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 312
    .line 313
    .line 314
    if-nez v8, :cond_16

    .line 315
    .line 316
    invoke-virtual {v2}, Lbe3;->A()I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    and-int/lit8 v10, v8, 0x40

    .line 321
    .line 322
    if-eqz v10, :cond_10

    .line 323
    .line 324
    move v10, v1

    .line 325
    goto :goto_c

    .line 326
    :cond_10
    move v10, v5

    .line 327
    :goto_c
    and-int/lit8 v8, v8, 0x20

    .line 328
    .line 329
    if-eqz v8, :cond_11

    .line 330
    .line 331
    move v8, v1

    .line 332
    goto :goto_d

    .line 333
    :cond_11
    move v8, v5

    .line 334
    :goto_d
    if-eqz v10, :cond_12

    .line 335
    .line 336
    invoke-virtual {v2}, Lbe3;->C()J

    .line 337
    .line 338
    .line 339
    :cond_12
    if-nez v10, :cond_14

    .line 340
    .line 341
    invoke-virtual {v2}, Lbe3;->A()I

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    new-instance v10, Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-direct {v10, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 348
    .line 349
    .line 350
    move v11, v5

    .line 351
    :goto_e
    if-ge v11, v9, :cond_13

    .line 352
    .line 353
    invoke-virtual {v2}, Lbe3;->A()I

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2}, Lbe3;->C()J

    .line 357
    .line 358
    .line 359
    new-instance v12, Lxi4;

    .line 360
    .line 361
    invoke-direct {v12, v7}, Lxi4;-><init>(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    add-int/lit8 v11, v11, 0x1

    .line 368
    .line 369
    goto :goto_e

    .line 370
    :cond_13
    move-object v9, v10

    .line 371
    :cond_14
    if-eqz v8, :cond_15

    .line 372
    .line 373
    invoke-virtual {v2}, Lbe3;->A()I

    .line 374
    .line 375
    .line 376
    invoke-virtual {v2}, Lbe3;->C()J

    .line 377
    .line 378
    .line 379
    :cond_15
    invoke-virtual {v2}, Lbe3;->H()I

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, Lbe3;->A()I

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2}, Lbe3;->A()I

    .line 386
    .line 387
    .line 388
    :cond_16
    new-instance v8, Lxi4;

    .line 389
    .line 390
    invoke-direct {v8, v4}, Lxi4;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-static {v9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    add-int/lit8 v6, v6, 0x1

    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_17
    new-instance v0, Lwj4;

    .line 403
    .line 404
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 405
    .line 406
    .line 407
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 408
    .line 409
    .line 410
    goto :goto_f

    .line 411
    :cond_18
    invoke-virtual {v2}, Lbe3;->C()J

    .line 412
    .line 413
    .line 414
    move-result-wide v10

    .line 415
    sub-int/2addr v4, v7

    .line 416
    new-array v0, v4, [B

    .line 417
    .line 418
    invoke-virtual {v2, v0, v5, v4}, Lbe3;->k([BII)V

    .line 419
    .line 420
    .line 421
    new-instance v8, Liq3;

    .line 422
    .line 423
    const/4 v9, 0x0

    .line 424
    invoke-direct/range {v8 .. v13}, Liq3;-><init>(IJJ)V

    .line 425
    .line 426
    .line 427
    move-object v0, v8

    .line 428
    goto :goto_f

    .line 429
    :cond_19
    new-instance v0, Lwj4;

    .line 430
    .line 431
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 432
    .line 433
    .line 434
    :goto_f
    if-nez v0, :cond_1a

    .line 435
    .line 436
    new-instance v0, Lqv2;

    .line 437
    .line 438
    new-array v1, v5, [Lpv2;

    .line 439
    .line 440
    invoke-direct {v0, v1}, Lqv2;-><init>([Lpv2;)V

    .line 441
    .line 442
    .line 443
    return-object v0

    .line 444
    :cond_1a
    new-instance v2, Lqv2;

    .line 445
    .line 446
    new-array v1, v1, [Lpv2;

    .line 447
    .line 448
    aput-object v0, v1, v5

    .line 449
    .line 450
    invoke-direct {v2, v1}, Lqv2;-><init>([Lpv2;)V

    .line 451
    .line 452
    .line 453
    return-object v2
.end method
