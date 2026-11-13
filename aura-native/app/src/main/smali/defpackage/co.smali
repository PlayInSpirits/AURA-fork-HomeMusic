.class public final Ldefpackage/co;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/k51;


# instance fields
.field public final a:Ldefpackage/be3;

.field public final b:Ldefpackage/v2;

.field public final c:Z

.field public final d:Ldefpackage/om0;

.field public e:I

.field public f:Ldefpackage/m51;

.field public g:Ldefpackage/eo;

.field public h:J

.field public i:[Ldefpackage/u20;

.field public j:J

.field public k:Ldefpackage/u20;

.field public l:I

.field public m:J

.field public n:J

.field public o:I

.field public p:Z


# direct methods
.method public constructor <init>(ILdefpackage/om0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ldefpackage/co;->d:Ldefpackage/om0;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    and-int/2addr p1, p2

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p2, v0

    .line 13
    :goto_0
    iput-boolean p2, p0, Ldefpackage/co;->c:Z

    .line 14
    .line 15
    new-instance p1, Ldefpackage/be3;

    .line 16
    .line 17
    const/16 p2, 0xc

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ldefpackage/be3;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/co;->a:Ldefpackage/be3;

    .line 23
    .line 24
    new-instance p1, Ldefpackage/v2;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/co;->b:Ldefpackage/v2;

    .line 30
    .line 31
    new-instance p1, Ldefpackage/tv1;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Ldefpackage/co;->f:Ldefpackage/m51;

    .line 37
    .line 38
    new-array p1, v0, [Ldefpackage/u20;

    .line 39
    .line 40
    iput-object p1, p0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 41
    .line 42
    const-wide/16 p1, -0x1

    .line 43
    .line 44
    iput-wide p1, p0, Ldefpackage/co;->m:J

    .line 45
    .line 46
    iput-wide p1, p0, Ldefpackage/co;->n:J

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, p0, Ldefpackage/co;->l:I

    .line 50
    .line 51
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    iput-wide p1, p0, Ldefpackage/co;->h:J

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ldefpackage/l51;Ldefpackage/t71;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v0, Ldefpackage/co;->j:J

    .line 6
    .line 7
    const-wide/16 v4, -0x1

    .line 8
    .line 9
    cmp-long v2, v2, v4

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 16
    .line 17
    .line 18
    move-result-wide v7

    .line 19
    iget-wide v9, v0, Ldefpackage/co;->j:J

    .line 20
    .line 21
    cmp-long v2, v9, v7

    .line 22
    .line 23
    if-ltz v2, :cond_0

    .line 24
    .line 25
    const-wide/32 v11, 0x40000

    .line 26
    .line 27
    .line 28
    add-long/2addr v11, v7

    .line 29
    cmp-long v2, v9, v11

    .line 30
    .line 31
    if-lez v2, :cond_1

    .line 32
    .line 33
    :cond_0
    move-object/from16 v2, p2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sub-long/2addr v9, v7

    .line 37
    long-to-int v2, v9

    .line 38
    invoke-interface {v1, v2}, Ldefpackage/l51;->l(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :goto_0
    iput-wide v9, v2, Ldefpackage/t71;->a:J

    .line 43
    .line 44
    move v2, v3

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    move v2, v6

    .line 47
    :goto_2
    iput-wide v4, v0, Ldefpackage/co;->j:J

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    return v3

    .line 52
    :cond_3
    iget v2, v0, Ldefpackage/co;->e:I

    .line 53
    .line 54
    const v7, 0x6c726468

    .line 55
    .line 56
    .line 57
    const/16 v10, 0x10

    .line 58
    .line 59
    const v11, 0x69766f6d

    .line 60
    .line 61
    .line 62
    const/4 v13, 0x4

    .line 63
    const v14, 0x5453494c

    .line 64
    .line 65
    .line 66
    const/16 v15, 0x8

    .line 67
    .line 68
    const-wide/16 v16, 0x8

    .line 69
    .line 70
    move-wide/from16 v18, v4

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    const/16 v5, 0xc

    .line 74
    .line 75
    const/16 p2, 0x3

    .line 76
    .line 77
    iget-object v9, v0, Ldefpackage/co;->b:Ldefpackage/v2;

    .line 78
    .line 79
    const/16 v20, 0x2

    .line 80
    .line 81
    iget-object v12, v0, Ldefpackage/co;->a:Ldefpackage/be3;

    .line 82
    .line 83
    packed-switch v2, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    new-instance v0, Ljava/lang/AssertionError;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :pswitch_0
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    iget-wide v9, v0, Ldefpackage/co;->n:J

    .line 97
    .line 98
    cmp-long v2, v7, v9

    .line 99
    .line 100
    if-ltz v2, :cond_4

    .line 101
    .line 102
    const/4 v0, -0x1

    .line 103
    return v0

    .line 104
    :cond_4
    iget-object v2, v0, Ldefpackage/co;->k:Ldefpackage/u20;

    .line 105
    .line 106
    if-eqz v2, :cond_a

    .line 107
    .line 108
    iget v5, v2, Ldefpackage/u20;->h:I

    .line 109
    .line 110
    iget-object v7, v2, Ldefpackage/u20;->b:Ldefpackage/wv4;

    .line 111
    .line 112
    invoke-interface {v7, v1, v5, v6}, Ldefpackage/wv4;->f(Ldefpackage/wh0;IZ)I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    sub-int/2addr v5, v1

    .line 117
    iput v5, v2, Ldefpackage/u20;->h:I

    .line 118
    .line 119
    if-nez v5, :cond_5

    .line 120
    .line 121
    move v1, v3

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    move v1, v6

    .line 124
    :goto_3
    if-eqz v1, :cond_8

    .line 125
    .line 126
    iget v5, v2, Ldefpackage/u20;->g:I

    .line 127
    .line 128
    if-lez v5, :cond_7

    .line 129
    .line 130
    iget-object v7, v2, Ldefpackage/u20;->b:Ldefpackage/wv4;

    .line 131
    .line 132
    iget v5, v2, Ldefpackage/u20;->i:I

    .line 133
    .line 134
    iget-wide v8, v2, Ldefpackage/u20;->e:J

    .line 135
    .line 136
    int-to-long v10, v5

    .line 137
    mul-long/2addr v8, v10

    .line 138
    iget v10, v2, Ldefpackage/u20;->f:I

    .line 139
    .line 140
    int-to-long v10, v10

    .line 141
    div-long/2addr v8, v10

    .line 142
    iget-object v10, v2, Ldefpackage/u20;->n:[I

    .line 143
    .line 144
    invoke-static {v10, v5}, Ljava/util/Arrays;->binarySearch([II)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-ltz v5, :cond_6

    .line 149
    .line 150
    move v10, v3

    .line 151
    goto :goto_4

    .line 152
    :cond_6
    move v10, v6

    .line 153
    :goto_4
    iget v11, v2, Ldefpackage/u20;->g:I

    .line 154
    .line 155
    const/4 v12, 0x0

    .line 156
    const/4 v13, 0x0

    .line 157
    invoke-interface/range {v7 .. v13}, Ldefpackage/wv4;->a(JIIILdefpackage/vv4;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    iget v5, v2, Ldefpackage/u20;->i:I

    .line 161
    .line 162
    add-int/2addr v5, v3

    .line 163
    iput v5, v2, Ldefpackage/u20;->i:I

    .line 164
    .line 165
    :cond_8
    if-eqz v1, :cond_9

    .line 166
    .line 167
    iput-object v4, v0, Ldefpackage/co;->k:Ldefpackage/u20;

    .line 168
    .line 169
    :cond_9
    return v6

    .line 170
    :cond_a
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 171
    .line 172
    .line 173
    move-result-wide v7

    .line 174
    const-wide/16 v9, 0x1

    .line 175
    .line 176
    and-long/2addr v7, v9

    .line 177
    cmp-long v2, v7, v9

    .line 178
    .line 179
    if-nez v2, :cond_b

    .line 180
    .line 181
    invoke-interface {v1, v3}, Ldefpackage/l51;->l(I)V

    .line 182
    .line 183
    .line 184
    :cond_b
    iget-object v2, v12, Ldefpackage/be3;->a:[B

    .line 185
    .line 186
    invoke-interface {v1, v2, v6, v5}, Ldefpackage/l51;->n([BII)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v6}, Ldefpackage/be3;->N(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-ne v2, v14, :cond_d

    .line 197
    .line 198
    invoke-virtual {v12, v15}, Ldefpackage/be3;->N(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-ne v0, v11, :cond_c

    .line 206
    .line 207
    move v15, v5

    .line 208
    :cond_c
    invoke-interface {v1, v15}, Ldefpackage/l51;->l(I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v1}, Ldefpackage/l51;->k()V

    .line 212
    .line 213
    .line 214
    return v6

    .line 215
    :cond_d
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    const v5, 0x4b4e554a    # 1.352225E7f

    .line 220
    .line 221
    .line 222
    if-ne v2, v5, :cond_e

    .line 223
    .line 224
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 225
    .line 226
    .line 227
    move-result-wide v1

    .line 228
    int-to-long v3, v3

    .line 229
    add-long/2addr v1, v3

    .line 230
    add-long v1, v1, v16

    .line 231
    .line 232
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 233
    .line 234
    return v6

    .line 235
    :cond_e
    invoke-interface {v1, v15}, Ldefpackage/l51;->l(I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v1}, Ldefpackage/l51;->k()V

    .line 239
    .line 240
    .line 241
    iget-object v5, v0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 242
    .line 243
    array-length v7, v5

    .line 244
    move v8, v6

    .line 245
    :goto_5
    if-ge v8, v7, :cond_11

    .line 246
    .line 247
    aget-object v9, v5, v8

    .line 248
    .line 249
    iget v10, v9, Ldefpackage/u20;->c:I

    .line 250
    .line 251
    if-eq v10, v2, :cond_10

    .line 252
    .line 253
    iget v10, v9, Ldefpackage/u20;->d:I

    .line 254
    .line 255
    if-ne v10, v2, :cond_f

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_f
    add-int/lit8 v8, v8, 0x1

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_10
    :goto_6
    move-object v4, v9

    .line 262
    :cond_11
    if-nez v4, :cond_12

    .line 263
    .line 264
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 265
    .line 266
    .line 267
    move-result-wide v1

    .line 268
    int-to-long v3, v3

    .line 269
    add-long/2addr v1, v3

    .line 270
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 271
    .line 272
    return v6

    .line 273
    :cond_12
    iput v3, v4, Ldefpackage/u20;->g:I

    .line 274
    .line 275
    iput v3, v4, Ldefpackage/u20;->h:I

    .line 276
    .line 277
    iput-object v4, v0, Ldefpackage/co;->k:Ldefpackage/u20;

    .line 278
    .line 279
    return v6

    .line 280
    :pswitch_1
    new-instance v2, Ldefpackage/be3;

    .line 281
    .line 282
    iget v5, v0, Ldefpackage/co;->o:I

    .line 283
    .line 284
    invoke-direct {v2, v5}, Ldefpackage/be3;-><init>(I)V

    .line 285
    .line 286
    .line 287
    iget-object v5, v2, Ldefpackage/be3;->a:[B

    .line 288
    .line 289
    iget v7, v0, Ldefpackage/co;->o:I

    .line 290
    .line 291
    invoke-interface {v1, v5, v6, v7}, Ldefpackage/l51;->readFully([BII)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-ge v1, v10, :cond_13

    .line 299
    .line 300
    const-wide/16 v11, 0x0

    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_13
    iget v1, v2, Ldefpackage/be3;->b:I

    .line 304
    .line 305
    invoke-virtual {v2, v15}, Ldefpackage/be3;->O(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ldefpackage/be3;->o()I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    int-to-long v14, v5

    .line 313
    iget-wide v11, v0, Ldefpackage/co;->m:J

    .line 314
    .line 315
    cmp-long v5, v14, v11

    .line 316
    .line 317
    if-lez v5, :cond_14

    .line 318
    .line 319
    const-wide/16 v11, 0x0

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_14
    add-long v11, v11, v16

    .line 323
    .line 324
    :goto_7
    invoke-virtual {v2, v1}, Ldefpackage/be3;->N(I)V

    .line 325
    .line 326
    .line 327
    :goto_8
    invoke-virtual {v2}, Ldefpackage/be3;->a()I

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    if-lt v1, v10, :cond_1d

    .line 332
    .line 333
    invoke-virtual {v2}, Ldefpackage/be3;->o()I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    invoke-virtual {v2}, Ldefpackage/be3;->o()I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    invoke-virtual {v2}, Ldefpackage/be3;->o()I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    int-to-long v14, v7

    .line 346
    add-long/2addr v14, v11

    .line 347
    invoke-virtual {v2, v13}, Ldefpackage/be3;->O(I)V

    .line 348
    .line 349
    .line 350
    iget-object v7, v0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 351
    .line 352
    array-length v9, v7

    .line 353
    move v4, v6

    .line 354
    :goto_9
    if-ge v4, v9, :cond_16

    .line 355
    .line 356
    aget-object v13, v7, v4

    .line 357
    .line 358
    iget v8, v13, Ldefpackage/u20;->c:I

    .line 359
    .line 360
    if-eq v8, v1, :cond_17

    .line 361
    .line 362
    iget v8, v13, Ldefpackage/u20;->d:I

    .line 363
    .line 364
    if-ne v8, v1, :cond_15

    .line 365
    .line 366
    goto :goto_a

    .line 367
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 368
    .line 369
    const/4 v13, 0x4

    .line 370
    goto :goto_9

    .line 371
    :cond_16
    const/4 v13, 0x0

    .line 372
    :cond_17
    :goto_a
    if-nez v13, :cond_18

    .line 373
    .line 374
    :goto_b
    const/4 v4, 0x0

    .line 375
    const/4 v13, 0x4

    .line 376
    goto :goto_8

    .line 377
    :cond_18
    and-int/lit8 v1, v5, 0x10

    .line 378
    .line 379
    if-ne v1, v10, :cond_19

    .line 380
    .line 381
    move v1, v3

    .line 382
    goto :goto_c

    .line 383
    :cond_19
    move v1, v6

    .line 384
    :goto_c
    iget-wide v4, v13, Ldefpackage/u20;->l:J

    .line 385
    .line 386
    cmp-long v4, v4, v18

    .line 387
    .line 388
    if-nez v4, :cond_1a

    .line 389
    .line 390
    iput-wide v14, v13, Ldefpackage/u20;->l:J

    .line 391
    .line 392
    :cond_1a
    if-eqz v1, :cond_1c

    .line 393
    .line 394
    iget v1, v13, Ldefpackage/u20;->k:I

    .line 395
    .line 396
    iget-object v4, v13, Ldefpackage/u20;->n:[I

    .line 397
    .line 398
    array-length v4, v4

    .line 399
    if-ne v1, v4, :cond_1b

    .line 400
    .line 401
    iget-object v1, v13, Ldefpackage/u20;->m:[J

    .line 402
    .line 403
    array-length v4, v1

    .line 404
    mul-int/lit8 v4, v4, 0x3

    .line 405
    .line 406
    div-int/lit8 v4, v4, 0x2

    .line 407
    .line 408
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    iput-object v1, v13, Ldefpackage/u20;->m:[J

    .line 413
    .line 414
    iget-object v1, v13, Ldefpackage/u20;->n:[I

    .line 415
    .line 416
    array-length v4, v1

    .line 417
    mul-int/lit8 v4, v4, 0x3

    .line 418
    .line 419
    div-int/lit8 v4, v4, 0x2

    .line 420
    .line 421
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    iput-object v1, v13, Ldefpackage/u20;->n:[I

    .line 426
    .line 427
    :cond_1b
    iget-object v1, v13, Ldefpackage/u20;->m:[J

    .line 428
    .line 429
    iget v4, v13, Ldefpackage/u20;->k:I

    .line 430
    .line 431
    aput-wide v14, v1, v4

    .line 432
    .line 433
    iget-object v1, v13, Ldefpackage/u20;->n:[I

    .line 434
    .line 435
    iget v5, v13, Ldefpackage/u20;->j:I

    .line 436
    .line 437
    aput v5, v1, v4

    .line 438
    .line 439
    add-int/2addr v4, v3

    .line 440
    iput v4, v13, Ldefpackage/u20;->k:I

    .line 441
    .line 442
    :cond_1c
    iget v1, v13, Ldefpackage/u20;->j:I

    .line 443
    .line 444
    add-int/2addr v1, v3

    .line 445
    iput v1, v13, Ldefpackage/u20;->j:I

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_1d
    iget-object v1, v0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 449
    .line 450
    array-length v2, v1

    .line 451
    move v4, v6

    .line 452
    :goto_d
    if-ge v4, v2, :cond_1f

    .line 453
    .line 454
    aget-object v5, v1, v4

    .line 455
    .line 456
    iget-object v7, v5, Ldefpackage/u20;->m:[J

    .line 457
    .line 458
    iget v8, v5, Ldefpackage/u20;->k:I

    .line 459
    .line 460
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    iput-object v7, v5, Ldefpackage/u20;->m:[J

    .line 465
    .line 466
    iget-object v7, v5, Ldefpackage/u20;->n:[I

    .line 467
    .line 468
    iget v8, v5, Ldefpackage/u20;->k:I

    .line 469
    .line 470
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([II)[I

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    iput-object v7, v5, Ldefpackage/u20;->n:[I

    .line 475
    .line 476
    iget v7, v5, Ldefpackage/u20;->c:I

    .line 477
    .line 478
    const/high16 v8, 0x62770000

    .line 479
    .line 480
    and-int/2addr v7, v8

    .line 481
    if-ne v7, v8, :cond_1e

    .line 482
    .line 483
    iget-object v7, v5, Ldefpackage/u20;->a:Ldefpackage/fo;

    .line 484
    .line 485
    iget v7, v7, Ldefpackage/fo;->f:I

    .line 486
    .line 487
    if-eqz v7, :cond_1e

    .line 488
    .line 489
    iget v7, v5, Ldefpackage/u20;->k:I

    .line 490
    .line 491
    if-lez v7, :cond_1e

    .line 492
    .line 493
    iput v7, v5, Ldefpackage/u20;->f:I

    .line 494
    .line 495
    :cond_1e
    add-int/lit8 v4, v4, 0x1

    .line 496
    .line 497
    goto :goto_d

    .line 498
    :cond_1f
    iput-boolean v3, v0, Ldefpackage/co;->p:Z

    .line 499
    .line 500
    iget-object v1, v0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 501
    .line 502
    array-length v1, v1

    .line 503
    iget-object v2, v0, Ldefpackage/co;->f:Ldefpackage/m51;

    .line 504
    .line 505
    iget-wide v3, v0, Ldefpackage/co;->h:J

    .line 506
    .line 507
    if-nez v1, :cond_20

    .line 508
    .line 509
    new-instance v1, Ldefpackage/bo;

    .line 510
    .line 511
    invoke-direct {v1, v3, v4}, Ldefpackage/bo;-><init>(J)V

    .line 512
    .line 513
    .line 514
    invoke-interface {v2, v1}, Ldefpackage/m51;->w(Ldefpackage/m84;)V

    .line 515
    .line 516
    .line 517
    :goto_e
    const/4 v1, 0x6

    .line 518
    goto :goto_f

    .line 519
    :cond_20
    new-instance v1, Ldefpackage/bo;

    .line 520
    .line 521
    invoke-direct {v1, v0, v3, v4, v6}, Ldefpackage/bo;-><init>(Ljava/lang/Object;JI)V

    .line 522
    .line 523
    .line 524
    invoke-interface {v2, v1}, Ldefpackage/m51;->w(Ldefpackage/m84;)V

    .line 525
    .line 526
    .line 527
    goto :goto_e

    .line 528
    :goto_f
    iput v1, v0, Ldefpackage/co;->e:I

    .line 529
    .line 530
    iget-wide v1, v0, Ldefpackage/co;->m:J

    .line 531
    .line 532
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 533
    .line 534
    return v6

    .line 535
    :pswitch_2
    iget-object v2, v12, Ldefpackage/be3;->a:[B

    .line 536
    .line 537
    invoke-interface {v1, v2, v6, v15}, Ldefpackage/l51;->readFully([BII)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v12, v6}, Ldefpackage/be3;->N(I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 548
    .line 549
    .line 550
    move-result v3

    .line 551
    const v4, 0x31786469

    .line 552
    .line 553
    .line 554
    if-ne v2, v4, :cond_21

    .line 555
    .line 556
    const/4 v1, 0x5

    .line 557
    iput v1, v0, Ldefpackage/co;->e:I

    .line 558
    .line 559
    iput v3, v0, Ldefpackage/co;->o:I

    .line 560
    .line 561
    return v6

    .line 562
    :cond_21
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 563
    .line 564
    .line 565
    move-result-wide v1

    .line 566
    int-to-long v3, v3

    .line 567
    add-long/2addr v1, v3

    .line 568
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 569
    .line 570
    return v6

    .line 571
    :pswitch_3
    iget-wide v7, v0, Ldefpackage/co;->m:J

    .line 572
    .line 573
    cmp-long v2, v7, v18

    .line 574
    .line 575
    if-eqz v2, :cond_22

    .line 576
    .line 577
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 578
    .line 579
    .line 580
    move-result-wide v7

    .line 581
    iget-wide v3, v0, Ldefpackage/co;->m:J

    .line 582
    .line 583
    cmp-long v7, v7, v3

    .line 584
    .line 585
    if-eqz v7, :cond_22

    .line 586
    .line 587
    iput-wide v3, v0, Ldefpackage/co;->j:J

    .line 588
    .line 589
    return v6

    .line 590
    :cond_22
    iget-object v3, v12, Ldefpackage/be3;->a:[B

    .line 591
    .line 592
    invoke-interface {v1, v3, v6, v5}, Ldefpackage/l51;->n([BII)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v1}, Ldefpackage/l51;->k()V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v6}, Ldefpackage/be3;->N(I)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    iput v3, v9, Ldefpackage/v2;->a:I

    .line 609
    .line 610
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    iput v3, v9, Ldefpackage/v2;->b:I

    .line 615
    .line 616
    iput v6, v9, Ldefpackage/v2;->c:I

    .line 617
    .line 618
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    iget v4, v9, Ldefpackage/v2;->a:I

    .line 623
    .line 624
    const v7, 0x46464952

    .line 625
    .line 626
    .line 627
    if-ne v4, v7, :cond_23

    .line 628
    .line 629
    invoke-interface {v1, v5}, Ldefpackage/l51;->l(I)V

    .line 630
    .line 631
    .line 632
    return v6

    .line 633
    :cond_23
    if-ne v4, v14, :cond_27

    .line 634
    .line 635
    if-eq v3, v11, :cond_24

    .line 636
    .line 637
    goto :goto_10

    .line 638
    :cond_24
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 639
    .line 640
    .line 641
    move-result-wide v3

    .line 642
    iput-wide v3, v0, Ldefpackage/co;->m:J

    .line 643
    .line 644
    iget v5, v9, Ldefpackage/v2;->b:I

    .line 645
    .line 646
    int-to-long v7, v5

    .line 647
    add-long/2addr v3, v7

    .line 648
    add-long v3, v3, v16

    .line 649
    .line 650
    iput-wide v3, v0, Ldefpackage/co;->n:J

    .line 651
    .line 652
    iget-boolean v3, v0, Ldefpackage/co;->p:Z

    .line 653
    .line 654
    if-nez v3, :cond_26

    .line 655
    .line 656
    iget-object v3, v0, Ldefpackage/co;->g:Ldefpackage/eo;

    .line 657
    .line 658
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    iget v3, v3, Ldefpackage/eo;->b:I

    .line 662
    .line 663
    and-int/2addr v3, v10

    .line 664
    if-ne v3, v10, :cond_25

    .line 665
    .line 666
    const/4 v3, 0x4

    .line 667
    iput v3, v0, Ldefpackage/co;->e:I

    .line 668
    .line 669
    iget-wide v1, v0, Ldefpackage/co;->n:J

    .line 670
    .line 671
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 672
    .line 673
    return v6

    .line 674
    :cond_25
    iget-object v3, v0, Ldefpackage/co;->f:Ldefpackage/m51;

    .line 675
    .line 676
    new-instance v4, Ldefpackage/bo;

    .line 677
    .line 678
    iget-wide v7, v0, Ldefpackage/co;->h:J

    .line 679
    .line 680
    invoke-direct {v4, v7, v8}, Ldefpackage/bo;-><init>(J)V

    .line 681
    .line 682
    .line 683
    invoke-interface {v3, v4}, Ldefpackage/m51;->w(Ldefpackage/m84;)V

    .line 684
    .line 685
    .line 686
    const/4 v2, 0x1

    .line 687
    iput-boolean v2, v0, Ldefpackage/co;->p:Z

    .line 688
    .line 689
    :cond_26
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 690
    .line 691
    .line 692
    move-result-wide v1

    .line 693
    const-wide/16 v3, 0xc

    .line 694
    .line 695
    add-long/2addr v1, v3

    .line 696
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 697
    .line 698
    const/4 v1, 0x6

    .line 699
    iput v1, v0, Ldefpackage/co;->e:I

    .line 700
    .line 701
    return v6

    .line 702
    :cond_27
    :goto_10
    invoke-interface {v1}, Ldefpackage/l51;->getPosition()J

    .line 703
    .line 704
    .line 705
    move-result-wide v1

    .line 706
    iget v3, v9, Ldefpackage/v2;->b:I

    .line 707
    .line 708
    int-to-long v3, v3

    .line 709
    add-long/2addr v1, v3

    .line 710
    add-long v1, v1, v16

    .line 711
    .line 712
    iput-wide v1, v0, Ldefpackage/co;->j:J

    .line 713
    .line 714
    return v6

    .line 715
    :pswitch_4
    iget v3, v0, Ldefpackage/co;->l:I

    .line 716
    .line 717
    const/16 v21, 0x4

    .line 718
    .line 719
    add-int/lit8 v3, v3, -0x4

    .line 720
    .line 721
    new-instance v4, Ldefpackage/be3;

    .line 722
    .line 723
    invoke-direct {v4, v3}, Ldefpackage/be3;-><init>(I)V

    .line 724
    .line 725
    .line 726
    iget-object v5, v4, Ldefpackage/be3;->a:[B

    .line 727
    .line 728
    invoke-interface {v1, v5, v6, v3}, Ldefpackage/l51;->readFully([BII)V

    .line 729
    .line 730
    .line 731
    invoke-static {v7, v4}, Ldefpackage/rb2;->b(ILdefpackage/be3;)Ldefpackage/rb2;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    iget v3, v1, Ldefpackage/rb2;->b:I

    .line 736
    .line 737
    if-ne v3, v7, :cond_32

    .line 738
    .line 739
    const-class v3, Ldefpackage/eo;

    .line 740
    .line 741
    invoke-virtual {v1, v3}, Ldefpackage/rb2;->a(Ljava/lang/Class;)Ldefpackage/ao;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    check-cast v3, Ldefpackage/eo;

    .line 746
    .line 747
    if-eqz v3, :cond_31

    .line 748
    .line 749
    iput-object v3, v0, Ldefpackage/co;->g:Ldefpackage/eo;

    .line 750
    .line 751
    iget v4, v3, Ldefpackage/eo;->c:I

    .line 752
    .line 753
    int-to-long v4, v4

    .line 754
    iget v3, v3, Ldefpackage/eo;->a:I

    .line 755
    .line 756
    int-to-long v7, v3

    .line 757
    mul-long/2addr v4, v7

    .line 758
    iput-wide v4, v0, Ldefpackage/co;->h:J

    .line 759
    .line 760
    new-instance v3, Ljava/util/ArrayList;

    .line 761
    .line 762
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 763
    .line 764
    .line 765
    iget-object v1, v1, Ldefpackage/rb2;->a:Ldefpackage/yw1;

    .line 766
    .line 767
    invoke-virtual {v1, v6}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    move v4, v6

    .line 772
    :goto_11
    invoke-virtual {v1}, Ldefpackage/v0;->hasNext()Z

    .line 773
    .line 774
    .line 775
    move-result v5

    .line 776
    if-eqz v5, :cond_30

    .line 777
    .line 778
    invoke-virtual {v1}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    check-cast v5, Ldefpackage/ao;

    .line 783
    .line 784
    invoke-interface {v5}, Ldefpackage/ao;->getType()I

    .line 785
    .line 786
    .line 787
    move-result v7

    .line 788
    const v8, 0x6c727473

    .line 789
    .line 790
    .line 791
    if-ne v7, v8, :cond_2f

    .line 792
    .line 793
    check-cast v5, Ldefpackage/rb2;

    .line 794
    .line 795
    add-int/lit8 v7, v4, 0x1

    .line 796
    .line 797
    const-class v8, Ldefpackage/fo;

    .line 798
    .line 799
    invoke-virtual {v5, v8}, Ldefpackage/rb2;->a(Ljava/lang/Class;)Ldefpackage/ao;

    .line 800
    .line 801
    .line 802
    move-result-object v8

    .line 803
    check-cast v8, Ldefpackage/fo;

    .line 804
    .line 805
    const-class v9, Ldefpackage/dm4;

    .line 806
    .line 807
    invoke-virtual {v5, v9}, Ldefpackage/rb2;->a(Ljava/lang/Class;)Ldefpackage/ao;

    .line 808
    .line 809
    .line 810
    move-result-object v9

    .line 811
    check-cast v9, Ldefpackage/dm4;

    .line 812
    .line 813
    const-string v10, "AviExtractor"

    .line 814
    .line 815
    if-nez v8, :cond_29

    .line 816
    .line 817
    const-string v4, "Missing Stream Header"

    .line 818
    .line 819
    invoke-static {v10, v4}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    :goto_12
    move/from16 p1, v7

    .line 823
    .line 824
    :cond_28
    const/4 v6, 0x0

    .line 825
    goto :goto_13

    .line 826
    :cond_29
    if-nez v9, :cond_2a

    .line 827
    .line 828
    const-string v4, "Missing Stream Format"

    .line 829
    .line 830
    invoke-static {v10, v4}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    goto :goto_12

    .line 834
    :cond_2a
    iget v10, v8, Ldefpackage/fo;->d:I

    .line 835
    .line 836
    int-to-long v11, v10

    .line 837
    iget v10, v8, Ldefpackage/fo;->b:I

    .line 838
    .line 839
    int-to-long v13, v10

    .line 840
    const-wide/32 v15, 0xf4240

    .line 841
    .line 842
    .line 843
    mul-long/2addr v13, v15

    .line 844
    iget v10, v8, Ldefpackage/fo;->c:I

    .line 845
    .line 846
    move/from16 p1, v7

    .line 847
    .line 848
    int-to-long v6, v10

    .line 849
    sget-object v10, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 850
    .line 851
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 852
    .line 853
    move-wide v15, v6

    .line 854
    invoke-static/range {v11 .. v17}, Ldefpackage/f35;->a0(JJJLjava/math/RoundingMode;)J

    .line 855
    .line 856
    .line 857
    move-result-wide v6

    .line 858
    iget-object v9, v9, Ldefpackage/dm4;->a:Ldefpackage/tb1;

    .line 859
    .line 860
    invoke-virtual {v9}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 861
    .line 862
    .line 863
    move-result-object v10

    .line 864
    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object v11

    .line 868
    iput-object v11, v10, Ldefpackage/sb1;->a:Ljava/lang/String;

    .line 869
    .line 870
    iget v11, v8, Ldefpackage/fo;->e:I

    .line 871
    .line 872
    if-eqz v11, :cond_2b

    .line 873
    .line 874
    iput v11, v10, Ldefpackage/sb1;->n:I

    .line 875
    .line 876
    :cond_2b
    const-class v11, Ldefpackage/hm4;

    .line 877
    .line 878
    invoke-virtual {v5, v11}, Ldefpackage/rb2;->a(Ljava/lang/Class;)Ldefpackage/ao;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    check-cast v5, Ldefpackage/hm4;

    .line 883
    .line 884
    if-eqz v5, :cond_2c

    .line 885
    .line 886
    iget-object v5, v5, Ldefpackage/hm4;->a:Ljava/lang/String;

    .line 887
    .line 888
    iput-object v5, v10, Ldefpackage/sb1;->b:Ljava/lang/String;

    .line 889
    .line 890
    :cond_2c
    iget-object v5, v9, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 891
    .line 892
    invoke-static {v5}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 893
    .line 894
    .line 895
    move-result v5

    .line 896
    const/4 v2, 0x1

    .line 897
    if-eq v5, v2, :cond_2d

    .line 898
    .line 899
    move/from16 v9, v20

    .line 900
    .line 901
    if-ne v5, v9, :cond_28

    .line 902
    .line 903
    :cond_2d
    iget-object v9, v0, Ldefpackage/co;->f:Ldefpackage/m51;

    .line 904
    .line 905
    invoke-interface {v9, v4, v5}, Ldefpackage/m51;->t(II)Ldefpackage/wv4;

    .line 906
    .line 907
    .line 908
    move-result-object v5

    .line 909
    new-instance v9, Ldefpackage/tb1;

    .line 910
    .line 911
    invoke-direct {v9, v10}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 912
    .line 913
    .line 914
    invoke-interface {v5, v9}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 915
    .line 916
    .line 917
    invoke-interface {v5, v6, v7}, Ldefpackage/wv4;->d(J)V

    .line 918
    .line 919
    .line 920
    iget-wide v9, v0, Ldefpackage/co;->h:J

    .line 921
    .line 922
    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 923
    .line 924
    .line 925
    move-result-wide v6

    .line 926
    iput-wide v6, v0, Ldefpackage/co;->h:J

    .line 927
    .line 928
    new-instance v6, Ldefpackage/u20;

    .line 929
    .line 930
    invoke-direct {v6, v4, v8, v5}, Ldefpackage/u20;-><init>(ILdefpackage/fo;Ldefpackage/wv4;)V

    .line 931
    .line 932
    .line 933
    :goto_13
    if-eqz v6, :cond_2e

    .line 934
    .line 935
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    :cond_2e
    move/from16 v4, p1

    .line 939
    .line 940
    :cond_2f
    const/4 v6, 0x0

    .line 941
    const/16 v20, 0x2

    .line 942
    .line 943
    goto/16 :goto_11

    .line 944
    .line 945
    :cond_30
    move v4, v6

    .line 946
    new-array v1, v4, [Ldefpackage/u20;

    .line 947
    .line 948
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    check-cast v1, [Ldefpackage/u20;

    .line 953
    .line 954
    iput-object v1, v0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 955
    .line 956
    iget-object v1, v0, Ldefpackage/co;->f:Ldefpackage/m51;

    .line 957
    .line 958
    invoke-interface {v1}, Ldefpackage/m51;->p()V

    .line 959
    .line 960
    .line 961
    move/from16 v1, p2

    .line 962
    .line 963
    iput v1, v0, Ldefpackage/co;->e:I

    .line 964
    .line 965
    return v4

    .line 966
    :cond_31
    const-string v0, "AviHeader not found"

    .line 967
    .line 968
    const/4 v1, 0x0

    .line 969
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    throw v0

    .line 974
    :cond_32
    const/4 v1, 0x0

    .line 975
    new-instance v0, Ljava/lang/StringBuilder;

    .line 976
    .line 977
    const-string v2, "Unexpected header list type "

    .line 978
    .line 979
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    throw v0

    .line 994
    :pswitch_5
    iget-object v2, v12, Ldefpackage/be3;->a:[B

    .line 995
    .line 996
    const/4 v4, 0x0

    .line 997
    invoke-interface {v1, v2, v4, v5}, Ldefpackage/l51;->readFully([BII)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v12, v4}, Ldefpackage/be3;->N(I)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 1007
    .line 1008
    .line 1009
    move-result v1

    .line 1010
    iput v1, v9, Ldefpackage/v2;->a:I

    .line 1011
    .line 1012
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 1013
    .line 1014
    .line 1015
    move-result v1

    .line 1016
    iput v1, v9, Ldefpackage/v2;->b:I

    .line 1017
    .line 1018
    iput v4, v9, Ldefpackage/v2;->c:I

    .line 1019
    .line 1020
    iget v1, v9, Ldefpackage/v2;->a:I

    .line 1021
    .line 1022
    if-ne v1, v14, :cond_34

    .line 1023
    .line 1024
    invoke-virtual {v12}, Ldefpackage/be3;->o()I

    .line 1025
    .line 1026
    .line 1027
    move-result v1

    .line 1028
    iput v1, v9, Ldefpackage/v2;->c:I

    .line 1029
    .line 1030
    if-ne v1, v7, :cond_33

    .line 1031
    .line 1032
    iget v1, v9, Ldefpackage/v2;->b:I

    .line 1033
    .line 1034
    iput v1, v0, Ldefpackage/co;->l:I

    .line 1035
    .line 1036
    const/4 v9, 0x2

    .line 1037
    iput v9, v0, Ldefpackage/co;->e:I

    .line 1038
    .line 1039
    return v4

    .line 1040
    :cond_33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    const-string v1, "hdrl expected, found: "

    .line 1043
    .line 1044
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    iget v1, v9, Ldefpackage/v2;->c:I

    .line 1048
    .line 1049
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    const/4 v3, 0x0

    .line 1057
    invoke-static {v3, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    throw v0

    .line 1062
    :cond_34
    const/4 v3, 0x0

    .line 1063
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1064
    .line 1065
    const-string v1, "LIST expected, found: "

    .line 1066
    .line 1067
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1068
    .line 1069
    .line 1070
    iget v1, v9, Ldefpackage/v2;->a:I

    .line 1071
    .line 1072
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-static {v3, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    throw v0

    .line 1084
    :pswitch_6
    move-object v3, v4

    .line 1085
    invoke-virtual/range {p0 .. p1}, Ldefpackage/co;->c(Ldefpackage/l51;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v4

    .line 1089
    if-eqz v4, :cond_35

    .line 1090
    .line 1091
    invoke-interface {v1, v5}, Ldefpackage/l51;->l(I)V

    .line 1092
    .line 1093
    .line 1094
    const/4 v2, 0x1

    .line 1095
    iput v2, v0, Ldefpackage/co;->e:I

    .line 1096
    .line 1097
    const/16 v18, 0x0

    .line 1098
    .line 1099
    return v18

    .line 1100
    :cond_35
    const-string v0, "AVI Header List not found"

    .line 1101
    .line 1102
    invoke-static {v3, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v0

    .line 1106
    throw v0

    .line 1107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ldefpackage/l51;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/co;->a:Ldefpackage/be3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/be3;->a:[B

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {p1, v0, v2, v1}, Ldefpackage/l51;->n([BII)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v2}, Ldefpackage/be3;->N(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/be3;->o()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const v0, 0x46464952

    .line 19
    .line 20
    .line 21
    if-eq p1, v0, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    const/4 p1, 0x4

    .line 25
    invoke-virtual {p0, p1}, Ldefpackage/be3;->O(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/be3;->o()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    const p1, 0x20495641

    .line 33
    .line 34
    .line 35
    if-ne p0, p1, :cond_1

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    return v2
.end method

.method public final d(JJ)V
    .locals 5

    .line 1
    const-wide/16 p3, -0x1

    .line 2
    .line 3
    iput-wide p3, p0, Ldefpackage/co;->j:J

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    iput-object p3, p0, Ldefpackage/co;->k:Ldefpackage/u20;

    .line 7
    .line 8
    iget-object p3, p0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 9
    .line 10
    array-length p4, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p4, :cond_1

    .line 14
    .line 15
    aget-object v2, p3, v1

    .line 16
    .line 17
    iget v3, v2, Ldefpackage/u20;->k:I

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    iput v0, v2, Ldefpackage/u20;->i:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iget-object v3, v2, Ldefpackage/u20;->m:[J

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    invoke-static {v3, p1, p2, v4}, Ldefpackage/f35;->f([JJZ)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iget-object v4, v2, Ldefpackage/u20;->n:[I

    .line 32
    .line 33
    aget v3, v4, v3

    .line 34
    .line 35
    iput v3, v2, Ldefpackage/u20;->i:I

    .line 36
    .line 37
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 p3, 0x0

    .line 41
    .line 42
    cmp-long p1, p1, p3

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iget-object p1, p0, Ldefpackage/co;->i:[Ldefpackage/u20;

    .line 47
    .line 48
    array-length p1, p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    iput v0, p0, Ldefpackage/co;->e:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const/4 p1, 0x3

    .line 55
    iput p1, p0, Ldefpackage/co;->e:I

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    const/4 p1, 0x6

    .line 59
    iput p1, p0, Ldefpackage/co;->e:I

    .line 60
    .line 61
    return-void
.end method

.method public final f(Ldefpackage/m51;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/co;->e:I

    .line 3
    .line 4
    iget-boolean v0, p0, Ldefpackage/co;->c:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ldefpackage/ll;

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/co;->d:Ldefpackage/om0;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, Ldefpackage/ll;-><init>(Ldefpackage/m51;Ldefpackage/xn4;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v0

    .line 16
    :cond_0
    iput-object p1, p0, Ldefpackage/co;->f:Ldefpackage/m51;

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    iput-wide v0, p0, Ldefpackage/co;->j:J

    .line 21
    .line 22
    return-void
.end method
