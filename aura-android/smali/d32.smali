.class public final Ld32;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public final a:Lbe3;

.field public b:Lm51;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:Lxx2;

.field public h:Ll51;

.field public i:Le20;

.field public j:Lsy2;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbe3;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lbe3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ld32;->a:Lbe3;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, Ld32;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Ld32;->j:Lsy2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 25

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
    iget v3, v0, Ld32;->c:I

    .line 8
    .line 9
    const-wide/16 v4, -0x1

    .line 10
    .line 11
    iget-object v6, v0, Ld32;->a:Lbe3;

    .line 12
    .line 13
    const/4 v7, 0x4

    .line 14
    const/4 v8, 0x2

    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    if-eqz v3, :cond_19

    .line 18
    .line 19
    if-eq v3, v9, :cond_18

    .line 20
    .line 21
    if-eq v3, v8, :cond_a

    .line 22
    .line 23
    const/4 v4, 0x6

    .line 24
    const/4 v5, 0x5

    .line 25
    if-eq v3, v7, :cond_5

    .line 26
    .line 27
    if-eq v3, v5, :cond_1

    .line 28
    .line 29
    if-ne v3, v4, :cond_0

    .line 30
    .line 31
    const/4 v0, -0x1

    .line 32
    return v0

    .line 33
    :cond_0
    invoke-static {}, Ltb4;->a()V

    .line 34
    .line 35
    .line 36
    return v10

    .line 37
    :cond_1
    iget-object v3, v0, Ld32;->i:Le20;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v0, Ld32;->h:Ll51;

    .line 42
    .line 43
    if-eq v1, v3, :cond_3

    .line 44
    .line 45
    :cond_2
    iput-object v1, v0, Ld32;->h:Ll51;

    .line 46
    .line 47
    new-instance v3, Le20;

    .line 48
    .line 49
    iget-wide v4, v0, Ld32;->f:J

    .line 50
    .line 51
    invoke-direct {v3, v1, v4, v5}, Le20;-><init>(Ll51;J)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Ld32;->i:Le20;

    .line 55
    .line 56
    :cond_3
    iget-object v1, v0, Ld32;->j:Lsy2;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v3, v0, Ld32;->i:Le20;

    .line 62
    .line 63
    invoke-virtual {v1, v3, v2}, Lsy2;->b(Ll51;Lt71;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v1, v9, :cond_4

    .line 68
    .line 69
    iget-wide v3, v2, Lt71;->a:J

    .line 70
    .line 71
    iget-wide v5, v0, Ld32;->f:J

    .line 72
    .line 73
    add-long/2addr v3, v5

    .line 74
    iput-wide v3, v2, Lt71;->a:J

    .line 75
    .line 76
    :cond_4
    return v1

    .line 77
    :cond_5
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 78
    .line 79
    .line 80
    move-result-wide v11

    .line 81
    iget-wide v13, v0, Ld32;->f:J

    .line 82
    .line 83
    cmp-long v3, v11, v13

    .line 84
    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iput-wide v13, v2, Lt71;->a:J

    .line 88
    .line 89
    return v9

    .line 90
    :cond_6
    iget-object v2, v6, Lbe3;->a:[B

    .line 91
    .line 92
    invoke-interface {v1, v2, v10, v9, v9}, Ll51;->e([BIIZ)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_7

    .line 97
    .line 98
    invoke-virtual {v0}, Ld32;->g()V

    .line 99
    .line 100
    .line 101
    return v10

    .line 102
    :cond_7
    invoke-interface {v1}, Ll51;->k()V

    .line 103
    .line 104
    .line 105
    iget-object v2, v0, Ld32;->j:Lsy2;

    .line 106
    .line 107
    if-nez v2, :cond_8

    .line 108
    .line 109
    new-instance v2, Lsy2;

    .line 110
    .line 111
    sget-object v3, Lxn4;->m:Lxi4;

    .line 112
    .line 113
    const/16 v6, 0x8

    .line 114
    .line 115
    invoke-direct {v2, v3, v6}, Lsy2;-><init>(Lxn4;I)V

    .line 116
    .line 117
    .line 118
    iput-object v2, v0, Ld32;->j:Lsy2;

    .line 119
    .line 120
    :cond_8
    new-instance v2, Le20;

    .line 121
    .line 122
    iget-wide v11, v0, Ld32;->f:J

    .line 123
    .line 124
    invoke-direct {v2, v1, v11, v12}, Le20;-><init>(Ll51;J)V

    .line 125
    .line 126
    .line 127
    iput-object v2, v0, Ld32;->i:Le20;

    .line 128
    .line 129
    iget-object v1, v0, Ld32;->j:Lsy2;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lsy2;->c(Ll51;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    iget-object v1, v0, Ld32;->j:Lsy2;

    .line 138
    .line 139
    new-instance v2, Le20;

    .line 140
    .line 141
    iget-wide v11, v0, Ld32;->f:J

    .line 142
    .line 143
    iget-object v3, v0, Ld32;->b:Lm51;

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-direct {v2, v11, v12, v3, v4}, Le20;-><init>(JLjava/lang/Object;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Lsy2;->f(Lm51;)V

    .line 152
    .line 153
    .line 154
    iget-object v1, v0, Ld32;->g:Lxx2;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v2, v0, Ld32;->b:Lm51;

    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    const/16 v3, 0x400

    .line 165
    .line 166
    invoke-interface {v2, v3, v7}, Lm51;->t(II)Lwv4;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    new-instance v3, Lsb1;

    .line 171
    .line 172
    invoke-direct {v3}, Lsb1;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v4, "image/jpeg"

    .line 176
    .line 177
    invoke-static {v4}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    iput-object v4, v3, Lsb1;->l:Ljava/lang/String;

    .line 182
    .line 183
    new-instance v4, Lqv2;

    .line 184
    .line 185
    new-array v6, v9, [Lpv2;

    .line 186
    .line 187
    aput-object v1, v6, v10

    .line 188
    .line 189
    invoke-direct {v4, v6}, Lqv2;-><init>([Lpv2;)V

    .line 190
    .line 191
    .line 192
    iput-object v4, v3, Lsb1;->k:Lqv2;

    .line 193
    .line 194
    invoke-static {v3, v2}, Lf34;->l(Lsb1;Lwv4;)V

    .line 195
    .line 196
    .line 197
    iput v5, v0, Ld32;->c:I

    .line 198
    .line 199
    return v10

    .line 200
    :cond_9
    invoke-virtual {v0}, Ld32;->g()V

    .line 201
    .line 202
    .line 203
    return v10

    .line 204
    :cond_a
    iget v2, v0, Ld32;->d:I

    .line 205
    .line 206
    const v3, 0xffe1

    .line 207
    .line 208
    .line 209
    if-ne v2, v3, :cond_16

    .line 210
    .line 211
    new-instance v2, Lbe3;

    .line 212
    .line 213
    iget v3, v0, Ld32;->e:I

    .line 214
    .line 215
    invoke-direct {v2, v3}, Lbe3;-><init>(I)V

    .line 216
    .line 217
    .line 218
    iget-object v3, v2, Lbe3;->a:[B

    .line 219
    .line 220
    iget v6, v0, Ld32;->e:I

    .line 221
    .line 222
    invoke-interface {v1, v3, v10, v6}, Ll51;->readFully([BII)V

    .line 223
    .line 224
    .line 225
    iget-object v3, v0, Ld32;->g:Lxx2;

    .line 226
    .line 227
    if-nez v3, :cond_17

    .line 228
    .line 229
    const-string v3, "http://ns.adobe.com/xap/1.0/"

    .line 230
    .line 231
    invoke-virtual {v2}, Lbe3;->v()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_17

    .line 240
    .line 241
    invoke-virtual {v2}, Lbe3;->v()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    if-eqz v2, :cond_17

    .line 246
    .line 247
    invoke-interface {v1}, Ll51;->getLength()J

    .line 248
    .line 249
    .line 250
    move-result-wide v6

    .line 251
    cmp-long v1, v6, v4

    .line 252
    .line 253
    if-nez v1, :cond_c

    .line 254
    .line 255
    :cond_b
    :goto_0
    const/4 v3, 0x0

    .line 256
    goto/16 :goto_7

    .line 257
    .line 258
    :cond_c
    :try_start_0
    invoke-static {v2}, Lbu;->y(Ljava/lang/String;)Le20;

    .line 259
    .line 260
    .line 261
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    goto :goto_1

    .line 263
    :catch_0
    const-string v1, "MotionPhotoXmpParser"

    .line 264
    .line 265
    const-string v2, "Ignoring unexpected XMP metadata"

    .line 266
    .line 267
    invoke-static {v1, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    const/4 v1, 0x0

    .line 271
    :goto_1
    if-nez v1, :cond_d

    .line 272
    .line 273
    goto :goto_0

    .line 274
    :cond_d
    iget-object v2, v1, Le20;->p:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v2, Lgy3;

    .line 277
    .line 278
    iget v11, v2, Lgy3;->q:I

    .line 279
    .line 280
    if-ge v11, v8, :cond_e

    .line 281
    .line 282
    goto :goto_0

    .line 283
    :cond_e
    sub-int/2addr v11, v9

    .line 284
    move-wide v13, v4

    .line 285
    move-wide v15, v13

    .line 286
    move-wide/from16 v19, v15

    .line 287
    .line 288
    move-wide/from16 v21, v19

    .line 289
    .line 290
    :goto_2
    if-ltz v11, :cond_14

    .line 291
    .line 292
    invoke-virtual {v2, v11}, Lgy3;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    check-cast v8, Lwx2;

    .line 297
    .line 298
    iget-object v12, v8, Lwx2;->a:Ljava/lang/String;

    .line 299
    .line 300
    const-string v3, "video/mp4"

    .line 301
    .line 302
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-nez v3, :cond_10

    .line 307
    .line 308
    const-string v3, "video/quicktime"

    .line 309
    .line 310
    invoke-virtual {v12, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_f

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :cond_f
    move v3, v10

    .line 318
    goto :goto_4

    .line 319
    :cond_10
    :goto_3
    move v3, v9

    .line 320
    :goto_4
    if-nez v11, :cond_11

    .line 321
    .line 322
    move-wide/from16 v17, v4

    .line 323
    .line 324
    iget-wide v4, v8, Lwx2;->c:J

    .line 325
    .line 326
    sub-long/2addr v6, v4

    .line 327
    const-wide/16 v4, 0x0

    .line 328
    .line 329
    :goto_5
    move-wide/from16 v23, v6

    .line 330
    .line 331
    move-wide v6, v4

    .line 332
    move-wide/from16 v4, v23

    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_11
    move-wide/from16 v17, v4

    .line 336
    .line 337
    iget-wide v4, v8, Lwx2;->b:J

    .line 338
    .line 339
    sub-long v4, v6, v4

    .line 340
    .line 341
    goto :goto_5

    .line 342
    :goto_6
    if-eqz v3, :cond_12

    .line 343
    .line 344
    cmp-long v3, v6, v4

    .line 345
    .line 346
    if-eqz v3, :cond_12

    .line 347
    .line 348
    sub-long v21, v4, v6

    .line 349
    .line 350
    move-wide/from16 v19, v6

    .line 351
    .line 352
    :cond_12
    if-nez v11, :cond_13

    .line 353
    .line 354
    move-wide v15, v4

    .line 355
    move-wide v13, v6

    .line 356
    :cond_13
    add-int/lit8 v11, v11, -0x1

    .line 357
    .line 358
    move-wide/from16 v4, v17

    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_14
    move-wide/from16 v17, v4

    .line 362
    .line 363
    cmp-long v2, v19, v17

    .line 364
    .line 365
    if-eqz v2, :cond_b

    .line 366
    .line 367
    cmp-long v2, v21, v17

    .line 368
    .line 369
    if-eqz v2, :cond_b

    .line 370
    .line 371
    cmp-long v2, v13, v17

    .line 372
    .line 373
    if-eqz v2, :cond_b

    .line 374
    .line 375
    cmp-long v2, v15, v17

    .line 376
    .line 377
    if-nez v2, :cond_15

    .line 378
    .line 379
    goto :goto_0

    .line 380
    :cond_15
    new-instance v12, Lxx2;

    .line 381
    .line 382
    iget-wide v1, v1, Le20;->o:J

    .line 383
    .line 384
    move-wide/from16 v17, v1

    .line 385
    .line 386
    invoke-direct/range {v12 .. v22}, Lxx2;-><init>(JJJJJ)V

    .line 387
    .line 388
    .line 389
    move-object v3, v12

    .line 390
    :goto_7
    iput-object v3, v0, Ld32;->g:Lxx2;

    .line 391
    .line 392
    if-eqz v3, :cond_17

    .line 393
    .line 394
    iget-wide v1, v3, Lxx2;->d:J

    .line 395
    .line 396
    iput-wide v1, v0, Ld32;->f:J

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_16
    iget v2, v0, Ld32;->e:I

    .line 400
    .line 401
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 402
    .line 403
    .line 404
    :cond_17
    :goto_8
    iput v10, v0, Ld32;->c:I

    .line 405
    .line 406
    return v10

    .line 407
    :cond_18
    invoke-virtual {v6, v8}, Lbe3;->K(I)V

    .line 408
    .line 409
    .line 410
    iget-object v2, v6, Lbe3;->a:[B

    .line 411
    .line 412
    invoke-interface {v1, v2, v10, v8}, Ll51;->n([BII)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6}, Lbe3;->H()I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    sub-int/2addr v2, v8

    .line 420
    iput v2, v0, Ld32;->e:I

    .line 421
    .line 422
    invoke-interface {v1, v8}, Ll51;->l(I)V

    .line 423
    .line 424
    .line 425
    iput v8, v0, Ld32;->c:I

    .line 426
    .line 427
    return v10

    .line 428
    :cond_19
    move-wide/from16 v17, v4

    .line 429
    .line 430
    invoke-virtual {v6, v8}, Lbe3;->K(I)V

    .line 431
    .line 432
    .line 433
    iget-object v2, v6, Lbe3;->a:[B

    .line 434
    .line 435
    invoke-interface {v1, v2, v10, v8}, Ll51;->readFully([BII)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v6}, Lbe3;->H()I

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    iput v1, v0, Ld32;->d:I

    .line 443
    .line 444
    const v2, 0xffda

    .line 445
    .line 446
    .line 447
    if-ne v1, v2, :cond_1b

    .line 448
    .line 449
    iget-wide v1, v0, Ld32;->f:J

    .line 450
    .line 451
    cmp-long v1, v1, v17

    .line 452
    .line 453
    if-eqz v1, :cond_1a

    .line 454
    .line 455
    iput v7, v0, Ld32;->c:I

    .line 456
    .line 457
    return v10

    .line 458
    :cond_1a
    invoke-virtual {v0}, Ld32;->g()V

    .line 459
    .line 460
    .line 461
    return v10

    .line 462
    :cond_1b
    const v2, 0xffd0

    .line 463
    .line 464
    .line 465
    if-lt v1, v2, :cond_1c

    .line 466
    .line 467
    const v2, 0xffd9

    .line 468
    .line 469
    .line 470
    if-le v1, v2, :cond_1d

    .line 471
    .line 472
    :cond_1c
    const v2, 0xff01

    .line 473
    .line 474
    .line 475
    if-eq v1, v2, :cond_1d

    .line 476
    .line 477
    iput v9, v0, Ld32;->c:I

    .line 478
    .line 479
    :cond_1d
    return v10
.end method

.method public final c(Ll51;)Z
    .locals 8

    .line 1
    check-cast p1, Lrk0;

    .line 2
    .line 3
    iget-object v0, p0, Ld32;->a:Lbe3;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, Lbe3;->K(I)V

    .line 7
    .line 8
    .line 9
    iget-object v2, v0, Lbe3;->a:[B

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p1, v2, v3, v1, v3}, Lrk0;->e([BIIZ)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lbe3;->H()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const v4, 0xffd8

    .line 20
    .line 21
    .line 22
    if-eq v2, v4, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v0, v1}, Lbe3;->K(I)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, Lbe3;->a:[B

    .line 29
    .line 30
    invoke-virtual {p1, v2, v3, v1, v3}, Lrk0;->e([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lbe3;->H()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, Ld32;->d:I

    .line 38
    .line 39
    const v4, 0xffda

    .line 40
    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0, v1}, Lbe3;->K(I)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v0, Lbe3;->a:[B

    .line 49
    .line 50
    invoke-virtual {p1, v2, v3, v1}, Lrk0;->n([BII)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lbe3;->H()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    sub-int/2addr v2, v1

    .line 58
    if-gez v2, :cond_2

    .line 59
    .line 60
    :goto_1
    return v3

    .line 61
    :cond_2
    iget v4, p0, Ld32;->d:I

    .line 62
    .line 63
    const v5, 0xffe1

    .line 64
    .line 65
    .line 66
    if-eq v4, v5, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1, v2, v3}, Lrk0;->o(IZ)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {v0, v2}, Lbe3;->K(I)V

    .line 73
    .line 74
    .line 75
    iget-object v4, v0, Lbe3;->a:[B

    .line 76
    .line 77
    invoke-virtual {p1, v4, v3, v2, v3}, Lrk0;->e([BIIZ)Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lbe3;->v()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const-string v4, "http://ns.adobe.com/xap/1.0/"

    .line 85
    .line 86
    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-nez v2, :cond_4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-virtual {v0}, Lbe3;->v()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    sget-object v4, Lbu;->c:[Ljava/lang/String;

    .line 101
    .line 102
    move v5, v3

    .line 103
    :goto_2
    const/4 v6, 0x4

    .line 104
    if-ge v5, v6, :cond_0

    .line 105
    .line 106
    aget-object v6, v4, v5

    .line 107
    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v6, "=\"1\""

    .line 117
    .line 118
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v2, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_6

    .line 130
    .line 131
    const/4 p0, 0x1

    .line 132
    return p0

    .line 133
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 134
    .line 135
    goto :goto_2
.end method

.method public final d(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Ld32;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Ld32;->j:Lsy2;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, Ld32;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Ld32;->j:Lsy2;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2, p3, p4}, Lsy2;->d(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final f(Lm51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld32;->b:Lm51;

    .line 2
    .line 3
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld32;->b:Lm51;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lm51;->p()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ld32;->b:Lm51;

    .line 10
    .line 11
    new-instance v1, Lbo;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lbo;-><init>(J)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Lm51;->w(Lm84;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x6

    .line 25
    iput v0, p0, Ld32;->c:I

    .line 26
    .line 27
    return-void
.end method
