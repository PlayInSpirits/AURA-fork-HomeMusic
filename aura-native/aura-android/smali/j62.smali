.class public final Lj62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lmz0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lbe3;

.field public final d:Lh00;

.field public e:Lwv4;

.field public f:Ljava/lang/String;

.field public g:Ltb1;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:J

.field public m:Z

.field public n:I

.field public o:I

.field public p:I

.field public q:Z

.field public r:J

.field public s:I

.field public t:J

.field public u:I

.field public v:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lj62;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p1, p0, Lj62;->b:I

    .line 7
    .line 8
    new-instance p1, Lbe3;

    .line 9
    .line 10
    const/16 p2, 0x400

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lbe3;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lj62;->c:Lbe3;

    .line 16
    .line 17
    new-instance p2, Lh00;

    .line 18
    .line 19
    iget-object p1, p1, Lbe3;->a:[B

    .line 20
    .line 21
    array-length v0, p1

    .line 22
    invoke-direct {p2, v0, p1}, Lh00;-><init>(I[B)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lj62;->d:Lh00;

    .line 26
    .line 27
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide p1, p0, Lj62;->l:J

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Lbe3;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj62;->e:Lwv4;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lbe3;->a()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-lez v1, :cond_1e

    .line 13
    .line 14
    iget v1, v0, Lj62;->h:I

    .line 15
    .line 16
    const/16 v2, 0x56

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_1d

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    if-eq v1, v3, :cond_1b

    .line 24
    .line 25
    iget-object v2, v0, Lj62;->c:Lbe3;

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    iget-object v8, v0, Lj62;->d:Lh00;

    .line 31
    .line 32
    if-eq v1, v4, :cond_19

    .line 33
    .line 34
    if-ne v1, v7, :cond_18

    .line 35
    .line 36
    invoke-virtual/range {p1 .. p1}, Lbe3;->a()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v9, v0, Lj62;->j:I

    .line 41
    .line 42
    iget v10, v0, Lj62;->i:I

    .line 43
    .line 44
    sub-int/2addr v9, v10

    .line 45
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    iget-object v9, v8, Lh00;->b:[B

    .line 50
    .line 51
    iget v10, v0, Lj62;->i:I

    .line 52
    .line 53
    move-object/from16 v11, p1

    .line 54
    .line 55
    invoke-virtual {v11, v9, v10, v1}, Lbe3;->k([BII)V

    .line 56
    .line 57
    .line 58
    iget v9, v0, Lj62;->i:I

    .line 59
    .line 60
    add-int/2addr v9, v1

    .line 61
    iput v9, v0, Lj62;->i:I

    .line 62
    .line 63
    iget v1, v0, Lj62;->j:I

    .line 64
    .line 65
    if-ne v9, v1, :cond_0

    .line 66
    .line 67
    invoke-virtual {v8, v5}, Lh00;->q(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v8}, Lh00;->h()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v9, 0x0

    .line 75
    if-nez v1, :cond_f

    .line 76
    .line 77
    iput-boolean v3, v0, Lj62;->m:Z

    .line 78
    .line 79
    invoke-virtual {v8, v3}, Lh00;->i(I)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ne v1, v3, :cond_1

    .line 84
    .line 85
    invoke-virtual {v8, v3}, Lh00;->i(I)I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move v10, v5

    .line 91
    :goto_1
    iput v10, v0, Lj62;->n:I

    .line 92
    .line 93
    if-nez v10, :cond_e

    .line 94
    .line 95
    if-ne v1, v3, :cond_2

    .line 96
    .line 97
    invoke-virtual {v8, v4}, Lh00;->i(I)I

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    add-int/2addr v10, v3

    .line 102
    mul-int/2addr v10, v6

    .line 103
    invoke-virtual {v8, v10}, Lh00;->i(I)I

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {v8}, Lh00;->h()Z

    .line 107
    .line 108
    .line 109
    move-result v10

    .line 110
    if-eqz v10, :cond_d

    .line 111
    .line 112
    const/4 v10, 0x6

    .line 113
    invoke-virtual {v8, v10}, Lh00;->i(I)I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    iput v12, v0, Lj62;->o:I

    .line 118
    .line 119
    const/4 v12, 0x4

    .line 120
    invoke-virtual {v8, v12}, Lh00;->i(I)I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    invoke-virtual {v8, v7}, Lh00;->i(I)I

    .line 125
    .line 126
    .line 127
    move-result v14

    .line 128
    if-nez v13, :cond_c

    .line 129
    .line 130
    if-nez v14, :cond_c

    .line 131
    .line 132
    if-nez v1, :cond_3

    .line 133
    .line 134
    invoke-virtual {v8}, Lh00;->g()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    invoke-virtual {v8}, Lh00;->b()I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    invoke-static {v8, v3}, Lxl;->D(Lh00;Z)Lg;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    iget-object v5, v15, Lg;->a:Ljava/lang/String;

    .line 147
    .line 148
    iput-object v5, v0, Lj62;->v:Ljava/lang/String;

    .line 149
    .line 150
    iget v5, v15, Lg;->b:I

    .line 151
    .line 152
    iput v5, v0, Lj62;->s:I

    .line 153
    .line 154
    iget v5, v15, Lg;->c:I

    .line 155
    .line 156
    iput v5, v0, Lj62;->u:I

    .line 157
    .line 158
    invoke-virtual {v8}, Lh00;->b()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    sub-int/2addr v14, v5

    .line 163
    invoke-virtual {v8, v13}, Lh00;->q(I)V

    .line 164
    .line 165
    .line 166
    add-int/lit8 v5, v14, 0x7

    .line 167
    .line 168
    div-int/2addr v5, v6

    .line 169
    new-array v5, v5, [B

    .line 170
    .line 171
    invoke-virtual {v8, v14, v5}, Lh00;->j(I[B)V

    .line 172
    .line 173
    .line 174
    new-instance v13, Lsb1;

    .line 175
    .line 176
    invoke-direct {v13}, Lsb1;-><init>()V

    .line 177
    .line 178
    .line 179
    iget-object v14, v0, Lj62;->f:Ljava/lang/String;

    .line 180
    .line 181
    iput-object v14, v13, Lsb1;->a:Ljava/lang/String;

    .line 182
    .line 183
    const-string v14, "video/mp2t"

    .line 184
    .line 185
    invoke-static {v14}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    iput-object v14, v13, Lsb1;->l:Ljava/lang/String;

    .line 190
    .line 191
    const-string v14, "audio/mp4a-latm"

    .line 192
    .line 193
    invoke-static {v14}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    iput-object v14, v13, Lsb1;->m:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v14, v0, Lj62;->v:Ljava/lang/String;

    .line 200
    .line 201
    iput-object v14, v13, Lsb1;->j:Ljava/lang/String;

    .line 202
    .line 203
    iget v14, v0, Lj62;->u:I

    .line 204
    .line 205
    iput v14, v13, Lsb1;->E:I

    .line 206
    .line 207
    iget v14, v0, Lj62;->s:I

    .line 208
    .line 209
    iput v14, v13, Lsb1;->F:I

    .line 210
    .line 211
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    iput-object v5, v13, Lsb1;->p:Ljava/util/List;

    .line 216
    .line 217
    iget-object v5, v0, Lj62;->a:Ljava/lang/String;

    .line 218
    .line 219
    iput-object v5, v13, Lsb1;->d:Ljava/lang/String;

    .line 220
    .line 221
    iget v5, v0, Lj62;->b:I

    .line 222
    .line 223
    iput v5, v13, Lsb1;->f:I

    .line 224
    .line 225
    new-instance v5, Ltb1;

    .line 226
    .line 227
    invoke-direct {v5, v13}, Ltb1;-><init>(Lsb1;)V

    .line 228
    .line 229
    .line 230
    iget-object v13, v0, Lj62;->g:Ltb1;

    .line 231
    .line 232
    invoke-virtual {v5, v13}, Ltb1;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v13

    .line 236
    if-nez v13, :cond_4

    .line 237
    .line 238
    iput-object v5, v0, Lj62;->g:Ltb1;

    .line 239
    .line 240
    iget v13, v5, Ltb1;->G:I

    .line 241
    .line 242
    int-to-long v13, v13

    .line 243
    const-wide/32 v16, 0x3d090000

    .line 244
    .line 245
    .line 246
    div-long v13, v16, v13

    .line 247
    .line 248
    iput-wide v13, v0, Lj62;->t:J

    .line 249
    .line 250
    iget-object v13, v0, Lj62;->e:Lwv4;

    .line 251
    .line 252
    invoke-interface {v13, v5}, Lwv4;->g(Ltb1;)V

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_3
    invoke-virtual {v8, v4}, Lh00;->i(I)I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    add-int/2addr v5, v3

    .line 261
    mul-int/2addr v5, v6

    .line 262
    invoke-virtual {v8, v5}, Lh00;->i(I)I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    int-to-long v13, v5

    .line 267
    long-to-int v5, v13

    .line 268
    invoke-virtual {v8}, Lh00;->b()I

    .line 269
    .line 270
    .line 271
    move-result v13

    .line 272
    invoke-static {v8, v3}, Lxl;->D(Lh00;Z)Lg;

    .line 273
    .line 274
    .line 275
    move-result-object v14

    .line 276
    iget-object v15, v14, Lg;->a:Ljava/lang/String;

    .line 277
    .line 278
    iput-object v15, v0, Lj62;->v:Ljava/lang/String;

    .line 279
    .line 280
    iget v15, v14, Lg;->b:I

    .line 281
    .line 282
    iput v15, v0, Lj62;->s:I

    .line 283
    .line 284
    iget v14, v14, Lg;->c:I

    .line 285
    .line 286
    iput v14, v0, Lj62;->u:I

    .line 287
    .line 288
    invoke-virtual {v8}, Lh00;->b()I

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    sub-int/2addr v13, v14

    .line 293
    sub-int/2addr v5, v13

    .line 294
    invoke-virtual {v8, v5}, Lh00;->t(I)V

    .line 295
    .line 296
    .line 297
    :cond_4
    :goto_2
    invoke-virtual {v8, v7}, Lh00;->i(I)I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    iput v5, v0, Lj62;->p:I

    .line 302
    .line 303
    if-eqz v5, :cond_9

    .line 304
    .line 305
    if-eq v5, v3, :cond_8

    .line 306
    .line 307
    if-eq v5, v7, :cond_7

    .line 308
    .line 309
    if-eq v5, v12, :cond_7

    .line 310
    .line 311
    const/4 v7, 0x5

    .line 312
    if-eq v5, v7, :cond_7

    .line 313
    .line 314
    if-eq v5, v10, :cond_6

    .line 315
    .line 316
    const/4 v7, 0x7

    .line 317
    if-ne v5, v7, :cond_5

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_5
    invoke-static {}, Ltb4;->a()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :cond_6
    :goto_3
    invoke-virtual {v8, v3}, Lh00;->t(I)V

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_7
    invoke-virtual {v8, v10}, Lh00;->t(I)V

    .line 329
    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_8
    const/16 v5, 0x9

    .line 333
    .line 334
    invoke-virtual {v8, v5}, Lh00;->t(I)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_9
    invoke-virtual {v8, v6}, Lh00;->t(I)V

    .line 339
    .line 340
    .line 341
    :goto_4
    invoke-virtual {v8}, Lh00;->h()Z

    .line 342
    .line 343
    .line 344
    move-result v5

    .line 345
    iput-boolean v5, v0, Lj62;->q:Z

    .line 346
    .line 347
    const-wide/16 v12, 0x0

    .line 348
    .line 349
    iput-wide v12, v0, Lj62;->r:J

    .line 350
    .line 351
    if-eqz v5, :cond_b

    .line 352
    .line 353
    if-ne v1, v3, :cond_a

    .line 354
    .line 355
    invoke-virtual {v8, v4}, Lh00;->i(I)I

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    add-int/2addr v1, v3

    .line 360
    mul-int/2addr v1, v6

    .line 361
    invoke-virtual {v8, v1}, Lh00;->i(I)I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    int-to-long v4, v1

    .line 366
    iput-wide v4, v0, Lj62;->r:J

    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_a
    invoke-virtual {v8}, Lh00;->h()Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    iget-wide v4, v0, Lj62;->r:J

    .line 374
    .line 375
    shl-long/2addr v4, v6

    .line 376
    invoke-virtual {v8, v6}, Lh00;->i(I)I

    .line 377
    .line 378
    .line 379
    move-result v7

    .line 380
    int-to-long v12, v7

    .line 381
    add-long/2addr v4, v12

    .line 382
    iput-wide v4, v0, Lj62;->r:J

    .line 383
    .line 384
    if-nez v1, :cond_a

    .line 385
    .line 386
    :cond_b
    :goto_5
    invoke-virtual {v8}, Lh00;->h()Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_10

    .line 391
    .line 392
    invoke-virtual {v8, v6}, Lh00;->t(I)V

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_c
    invoke-static {v9, v9}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    throw v0

    .line 401
    :cond_d
    invoke-static {v9, v9}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    throw v0

    .line 406
    :cond_e
    invoke-static {v9, v9}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    throw v0

    .line 411
    :cond_f
    iget-boolean v1, v0, Lj62;->m:Z

    .line 412
    .line 413
    if-nez v1, :cond_10

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_10
    :goto_6
    iget v1, v0, Lj62;->n:I

    .line 417
    .line 418
    if-nez v1, :cond_17

    .line 419
    .line 420
    iget v1, v0, Lj62;->o:I

    .line 421
    .line 422
    if-nez v1, :cond_16

    .line 423
    .line 424
    iget v1, v0, Lj62;->p:I

    .line 425
    .line 426
    if-nez v1, :cond_15

    .line 427
    .line 428
    const/4 v1, 0x0

    .line 429
    :goto_7
    invoke-virtual {v8, v6}, Lh00;->i(I)I

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    add-int/2addr v1, v4

    .line 434
    const/16 v5, 0xff

    .line 435
    .line 436
    if-eq v4, v5, :cond_14

    .line 437
    .line 438
    invoke-virtual {v8}, Lh00;->g()I

    .line 439
    .line 440
    .line 441
    move-result v4

    .line 442
    and-int/lit8 v5, v4, 0x7

    .line 443
    .line 444
    if-nez v5, :cond_11

    .line 445
    .line 446
    shr-int/lit8 v4, v4, 0x3

    .line 447
    .line 448
    invoke-virtual {v2, v4}, Lbe3;->N(I)V

    .line 449
    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_11
    iget-object v4, v2, Lbe3;->a:[B

    .line 453
    .line 454
    mul-int/lit8 v5, v1, 0x8

    .line 455
    .line 456
    invoke-virtual {v8, v5, v4}, Lh00;->j(I[B)V

    .line 457
    .line 458
    .line 459
    const/4 v4, 0x0

    .line 460
    invoke-virtual {v2, v4}, Lbe3;->N(I)V

    .line 461
    .line 462
    .line 463
    :goto_8
    iget-object v4, v0, Lj62;->e:Lwv4;

    .line 464
    .line 465
    invoke-interface {v4, v1, v2}, Lwv4;->e(ILbe3;)V

    .line 466
    .line 467
    .line 468
    iget-wide v4, v0, Lj62;->l:J

    .line 469
    .line 470
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    cmp-long v2, v4, v6

    .line 476
    .line 477
    if-eqz v2, :cond_12

    .line 478
    .line 479
    goto :goto_9

    .line 480
    :cond_12
    const/4 v3, 0x0

    .line 481
    :goto_9
    invoke-static {v3}, Lrr2;->w(Z)V

    .line 482
    .line 483
    .line 484
    iget-object v2, v0, Lj62;->e:Lwv4;

    .line 485
    .line 486
    iget-wide v3, v0, Lj62;->l:J

    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const/16 v22, 0x0

    .line 491
    .line 492
    const/16 v19, 0x1

    .line 493
    .line 494
    move/from16 v20, v1

    .line 495
    .line 496
    move-object/from16 v16, v2

    .line 497
    .line 498
    move-wide/from16 v17, v3

    .line 499
    .line 500
    invoke-interface/range {v16 .. v22}, Lwv4;->a(JIIILvv4;)V

    .line 501
    .line 502
    .line 503
    iget-wide v1, v0, Lj62;->l:J

    .line 504
    .line 505
    iget-wide v3, v0, Lj62;->t:J

    .line 506
    .line 507
    add-long/2addr v1, v3

    .line 508
    iput-wide v1, v0, Lj62;->l:J

    .line 509
    .line 510
    iget-boolean v1, v0, Lj62;->q:Z

    .line 511
    .line 512
    if-eqz v1, :cond_13

    .line 513
    .line 514
    iget-wide v1, v0, Lj62;->r:J

    .line 515
    .line 516
    long-to-int v1, v1

    .line 517
    invoke-virtual {v8, v1}, Lh00;->t(I)V

    .line 518
    .line 519
    .line 520
    :cond_13
    :goto_a
    const/4 v4, 0x0

    .line 521
    iput v4, v0, Lj62;->h:I

    .line 522
    .line 523
    goto/16 :goto_0

    .line 524
    .line 525
    :cond_14
    move/from16 v20, v1

    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_15
    invoke-static {v9, v9}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    throw v0

    .line 533
    :cond_16
    invoke-static {v9, v9}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    throw v0

    .line 538
    :cond_17
    invoke-static {v9, v9}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    throw v0

    .line 543
    :cond_18
    invoke-static {}, Ltb4;->a()V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :cond_19
    move-object/from16 v11, p1

    .line 548
    .line 549
    iget v1, v0, Lj62;->k:I

    .line 550
    .line 551
    and-int/lit16 v1, v1, -0xe1

    .line 552
    .line 553
    shl-int/2addr v1, v6

    .line 554
    invoke-virtual {v11}, Lbe3;->A()I

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    or-int/2addr v1, v3

    .line 559
    iput v1, v0, Lj62;->j:I

    .line 560
    .line 561
    iget-object v3, v2, Lbe3;->a:[B

    .line 562
    .line 563
    array-length v3, v3

    .line 564
    if-le v1, v3, :cond_1a

    .line 565
    .line 566
    invoke-virtual {v2, v1}, Lbe3;->K(I)V

    .line 567
    .line 568
    .line 569
    iget-object v1, v2, Lbe3;->a:[B

    .line 570
    .line 571
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    array-length v2, v1

    .line 575
    invoke-virtual {v8, v2, v1}, Lh00;->o(I[B)V

    .line 576
    .line 577
    .line 578
    :cond_1a
    const/4 v4, 0x0

    .line 579
    iput v4, v0, Lj62;->i:I

    .line 580
    .line 581
    iput v7, v0, Lj62;->h:I

    .line 582
    .line 583
    goto/16 :goto_0

    .line 584
    .line 585
    :cond_1b
    move-object/from16 v11, p1

    .line 586
    .line 587
    invoke-virtual {v11}, Lbe3;->A()I

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    and-int/lit16 v3, v1, 0xe0

    .line 592
    .line 593
    const/16 v5, 0xe0

    .line 594
    .line 595
    if-ne v3, v5, :cond_1c

    .line 596
    .line 597
    iput v1, v0, Lj62;->k:I

    .line 598
    .line 599
    iput v4, v0, Lj62;->h:I

    .line 600
    .line 601
    goto/16 :goto_0

    .line 602
    .line 603
    :cond_1c
    if-eq v1, v2, :cond_0

    .line 604
    .line 605
    const/4 v4, 0x0

    .line 606
    iput v4, v0, Lj62;->h:I

    .line 607
    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :cond_1d
    move-object/from16 v11, p1

    .line 611
    .line 612
    invoke-virtual {v11}, Lbe3;->A()I

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    if-ne v1, v2, :cond_0

    .line 617
    .line 618
    iput v3, v0, Lj62;->h:I

    .line 619
    .line 620
    goto/16 :goto_0

    .line 621
    .line 622
    :cond_1e
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lj62;->h:I

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lj62;->l:J

    .line 10
    .line 11
    iput-boolean v0, p0, Lj62;->m:Z

    .line 12
    .line 13
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lj62;->l:J

    .line 2
    .line 3
    return-void
.end method

.method public final f(Lm51;Lsy4;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lsy4;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lsy4;->b()V

    .line 5
    .line 6
    .line 7
    iget v0, p2, Lsy4;->d:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-interface {p1, v0, v1}, Lm51;->t(II)Lwv4;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lj62;->e:Lwv4;

    .line 15
    .line 16
    invoke-virtual {p2}, Lsy4;->b()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lsy4;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p1, p0, Lj62;->f:Ljava/lang/String;

    .line 22
    .line 23
    return-void
.end method
