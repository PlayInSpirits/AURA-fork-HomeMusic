.class public final Ldefpackage/rd3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ldefpackage/zs4;

.field public c:Ldefpackage/ha1;

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:J

.field public i:Ldefpackage/oo0;

.field public j:Ldefpackage/ic;

.field public k:Z

.field public l:J

.field public m:Ldefpackage/mw2;

.field public n:Ldefpackage/qd3;

.field public o:Ldefpackage/r62;

.field public p:J

.field public q:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ldefpackage/zs4;Ldefpackage/ha1;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/rd3;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/rd3;->b:Ldefpackage/zs4;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/rd3;->c:Ldefpackage/ha1;

    .line 9
    .line 10
    iput p4, p0, Ldefpackage/rd3;->d:I

    .line 11
    .line 12
    iput-boolean p5, p0, Ldefpackage/rd3;->e:Z

    .line 13
    .line 14
    iput p6, p0, Ldefpackage/rd3;->f:I

    .line 15
    .line 16
    iput p7, p0, Ldefpackage/rd3;->g:I

    .line 17
    .line 18
    sget-wide p1, Ldefpackage/gz1;->a:J

    .line 19
    .line 20
    iput-wide p1, p0, Ldefpackage/rd3;->h:J

    .line 21
    .line 22
    const-wide/16 p1, 0x0

    .line 23
    .line 24
    iput-wide p1, p0, Ldefpackage/rd3;->l:J

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-static {p1, p1, p1, p1}, Ldefpackage/qc0;->g(IIII)J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, p0, Ldefpackage/rd3;->p:J

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(JLdefpackage/r62;)Z
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-wide v2, v0, Ldefpackage/rd3;->q:J

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    shl-long/2addr v2, v4

    .line 9
    const-wide/16 v5, 0x3

    .line 10
    .line 11
    or-long/2addr v2, v5

    .line 12
    iput-wide v2, v0, Ldefpackage/rd3;->q:J

    .line 13
    .line 14
    iget v2, v0, Ldefpackage/rd3;->g:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v5, 0x1

    .line 18
    if-le v2, v5, :cond_5

    .line 19
    .line 20
    iget-object v2, v0, Ldefpackage/rd3;->b:Ldefpackage/zs4;

    .line 21
    .line 22
    iget-object v6, v0, Ldefpackage/rd3;->m:Ldefpackage/mw2;

    .line 23
    .line 24
    iget-object v7, v0, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 25
    .line 26
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v8, v0, Ldefpackage/rd3;->c:Ldefpackage/ha1;

    .line 30
    .line 31
    invoke-static {v6, v1, v2, v7, v8}, Ldefpackage/j51;->t(Ldefpackage/mw2;Ldefpackage/r62;Ldefpackage/zs4;Ldefpackage/oo0;Ldefpackage/ha1;)Ldefpackage/mw2;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iput-object v2, v0, Ldefpackage/rd3;->m:Ldefpackage/mw2;

    .line 36
    .line 37
    iget v6, v0, Ldefpackage/rd3;->g:I

    .line 38
    .line 39
    iget-object v13, v2, Ldefpackage/mw2;->c:Ldefpackage/ro0;

    .line 40
    .line 41
    iget v7, v2, Ldefpackage/mw2;->g:F

    .line 42
    .line 43
    iget v8, v2, Ldefpackage/mw2;->f:F

    .line 44
    .line 45
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    const/16 v16, 0x1

    .line 50
    .line 51
    if-nez v9, :cond_1

    .line 52
    .line 53
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move v5, v7

    .line 61
    move/from16 v7, v16

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    sget-object v8, Ldefpackage/nw2;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v9, v2, Ldefpackage/mw2;->e:Ldefpackage/zs4;

    .line 67
    .line 68
    iget-object v12, v2, Ldefpackage/mw2;->d:Ldefpackage/ha1;

    .line 69
    .line 70
    new-instance v15, Ldefpackage/mc;

    .line 71
    .line 72
    sget-object v10, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 73
    .line 74
    const/4 v14, 0x0

    .line 75
    move-object v11, v10

    .line 76
    move-object v7, v15

    .line 77
    invoke-direct/range {v7 .. v14}, Ldefpackage/mc;-><init>(Ljava/lang/String;Ldefpackage/zs4;Ljava/util/List;Ljava/util/List;Ldefpackage/ha1;Ldefpackage/oo0;Z)V

    .line 78
    .line 79
    .line 80
    const/16 v7, 0xf

    .line 81
    .line 82
    invoke-static {v3, v3, v7}, Ldefpackage/qc0;->b(III)J

    .line 83
    .line 84
    .line 85
    move-result-wide v18

    .line 86
    new-instance v14, Ldefpackage/ic;

    .line 87
    .line 88
    move/from16 v17, v16

    .line 89
    .line 90
    invoke-direct/range {v14 .. v19}, Ldefpackage/ic;-><init>(Ldefpackage/mc;IIJ)V

    .line 91
    .line 92
    .line 93
    move-object v15, v14

    .line 94
    sget-object v8, Ldefpackage/nw2;->b:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v9, v2, Ldefpackage/mw2;->e:Ldefpackage/zs4;

    .line 97
    .line 98
    iget-object v12, v2, Ldefpackage/mw2;->d:Ldefpackage/ha1;

    .line 99
    .line 100
    move v11, v7

    .line 101
    new-instance v7, Ldefpackage/mc;

    .line 102
    .line 103
    const/4 v14, 0x1

    .line 104
    move/from16 v17, v11

    .line 105
    .line 106
    move-object v11, v10

    .line 107
    move/from16 v5, v17

    .line 108
    .line 109
    invoke-direct/range {v7 .. v14}, Ldefpackage/mc;-><init>(Ljava/lang/String;Ldefpackage/zs4;Ljava/util/List;Ljava/util/List;Ldefpackage/ha1;Ldefpackage/oo0;Z)V

    .line 110
    .line 111
    .line 112
    invoke-static {v3, v3, v5}, Ldefpackage/qc0;->b(III)J

    .line 113
    .line 114
    .line 115
    move-result-wide v18

    .line 116
    new-instance v14, Ldefpackage/ic;

    .line 117
    .line 118
    move/from16 v17, v16

    .line 119
    .line 120
    const/16 v16, 0x2

    .line 121
    .line 122
    move-object v5, v15

    .line 123
    move-object v15, v7

    .line 124
    invoke-direct/range {v14 .. v19}, Ldefpackage/ic;-><init>(Ldefpackage/mc;IIJ)V

    .line 125
    .line 126
    .line 127
    move/from16 v7, v17

    .line 128
    .line 129
    iget v8, v14, Ldefpackage/ic;->f:F

    .line 130
    .line 131
    iget v5, v5, Ldefpackage/ic;->f:F

    .line 132
    .line 133
    sub-float/2addr v8, v5

    .line 134
    iput v5, v2, Ldefpackage/mw2;->g:F

    .line 135
    .line 136
    iput v8, v2, Ldefpackage/mw2;->f:F

    .line 137
    .line 138
    :goto_1
    if-eq v6, v7, :cond_3

    .line 139
    .line 140
    sub-int/2addr v6, v7

    .line 141
    int-to-float v2, v6

    .line 142
    mul-float/2addr v8, v2

    .line 143
    add-float/2addr v8, v5

    .line 144
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-gez v2, :cond_2

    .line 149
    .line 150
    move v2, v3

    .line 151
    :cond_2
    invoke-static/range {p1 .. p2}, Ldefpackage/nc0;->g(J)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-le v2, v5, :cond_4

    .line 156
    .line 157
    move v2, v5

    .line 158
    goto :goto_2

    .line 159
    :cond_3
    invoke-static/range {p1 .. p2}, Ldefpackage/nc0;->i(J)I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    :cond_4
    :goto_2
    invoke-static/range {p1 .. p2}, Ldefpackage/nc0;->g(J)I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    invoke-static/range {p1 .. p2}, Ldefpackage/nc0;->j(J)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    invoke-static/range {p1 .. p2}, Ldefpackage/nc0;->h(J)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    invoke-static {v6, v7, v2, v5}, Ldefpackage/qc0;->a(IIII)J

    .line 176
    .line 177
    .line 178
    move-result-wide v5

    .line 179
    goto :goto_3

    .line 180
    :cond_5
    move-wide/from16 v5, p1

    .line 181
    .line 182
    :goto_3
    iget-object v2, v0, Ldefpackage/rd3;->j:Ldefpackage/ic;

    .line 183
    .line 184
    const/4 v7, 0x3

    .line 185
    const-wide v8, 0xffffffffL

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    const/16 v10, 0x20

    .line 191
    .line 192
    if-nez v2, :cond_6

    .line 193
    .line 194
    goto/16 :goto_8

    .line 195
    .line 196
    :cond_6
    iget-object v11, v0, Ldefpackage/rd3;->n:Ldefpackage/qd3;

    .line 197
    .line 198
    if-nez v11, :cond_7

    .line 199
    .line 200
    goto/16 :goto_8

    .line 201
    .line 202
    :cond_7
    invoke-interface {v11}, Ldefpackage/qd3;->a()Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-eqz v11, :cond_8

    .line 207
    .line 208
    goto/16 :goto_8

    .line 209
    .line 210
    :cond_8
    iget-object v11, v0, Ldefpackage/rd3;->o:Ldefpackage/r62;

    .line 211
    .line 212
    if-eq v1, v11, :cond_9

    .line 213
    .line 214
    goto/16 :goto_8

    .line 215
    .line 216
    :cond_9
    iget-wide v11, v0, Ldefpackage/rd3;->p:J

    .line 217
    .line 218
    invoke-static {v5, v6, v11, v12}, Ldefpackage/nc0;->b(JJ)Z

    .line 219
    .line 220
    .line 221
    move-result v11

    .line 222
    if-eqz v11, :cond_a

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_a
    invoke-static {v5, v6}, Ldefpackage/nc0;->h(J)I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    iget-wide v12, v0, Ldefpackage/rd3;->p:J

    .line 230
    .line 231
    invoke-static {v12, v13}, Ldefpackage/nc0;->h(J)I

    .line 232
    .line 233
    .line 234
    move-result v12

    .line 235
    if-eq v11, v12, :cond_b

    .line 236
    .line 237
    goto/16 :goto_8

    .line 238
    .line 239
    :cond_b
    invoke-static {v5, v6}, Ldefpackage/nc0;->j(J)I

    .line 240
    .line 241
    .line 242
    move-result v11

    .line 243
    iget-wide v12, v0, Ldefpackage/rd3;->p:J

    .line 244
    .line 245
    invoke-static {v12, v13}, Ldefpackage/nc0;->j(J)I

    .line 246
    .line 247
    .line 248
    move-result v12

    .line 249
    if-eq v11, v12, :cond_c

    .line 250
    .line 251
    goto :goto_8

    .line 252
    :cond_c
    invoke-static {v5, v6}, Ldefpackage/nc0;->g(J)I

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    int-to-float v11, v11

    .line 257
    iget v12, v2, Ldefpackage/ic;->f:F

    .line 258
    .line 259
    cmpg-float v11, v11, v12

    .line 260
    .line 261
    if-ltz v11, :cond_12

    .line 262
    .line 263
    iget-object v2, v2, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 264
    .line 265
    iget-boolean v2, v2, Ldefpackage/ks4;->d:Z

    .line 266
    .line 267
    if-eqz v2, :cond_d

    .line 268
    .line 269
    goto :goto_8

    .line 270
    :cond_d
    :goto_4
    iget-wide v1, v0, Ldefpackage/rd3;->p:J

    .line 271
    .line 272
    invoke-static {v5, v6, v1, v2}, Ldefpackage/nc0;->b(JJ)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-nez v1, :cond_11

    .line 277
    .line 278
    iget-object v1, v0, Ldefpackage/rd3;->j:Ldefpackage/ic;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget-object v2, v1, Ldefpackage/ic;->a:Ldefpackage/mc;

    .line 284
    .line 285
    iget-object v2, v2, Ldefpackage/mc;->v:Ldefpackage/t62;

    .line 286
    .line 287
    invoke-virtual {v2}, Ldefpackage/t62;->c()F

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual {v1}, Ldefpackage/ic;->c()F

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    invoke-static {v2}, Ldefpackage/ji2;->g(F)I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    iget v4, v1, Ldefpackage/ic;->f:F

    .line 304
    .line 305
    invoke-static {v4}, Ldefpackage/ji2;->g(F)I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    int-to-long v11, v2

    .line 310
    shl-long/2addr v11, v10

    .line 311
    int-to-long v13, v4

    .line 312
    and-long/2addr v13, v8

    .line 313
    or-long/2addr v11, v13

    .line 314
    invoke-static {v5, v6, v11, v12}, Ldefpackage/qc0;->d(JJ)J

    .line 315
    .line 316
    .line 317
    move-result-wide v11

    .line 318
    iput-wide v11, v0, Ldefpackage/rd3;->l:J

    .line 319
    .line 320
    iget v2, v0, Ldefpackage/rd3;->d:I

    .line 321
    .line 322
    if-ne v2, v7, :cond_e

    .line 323
    .line 324
    goto :goto_5

    .line 325
    :cond_e
    shr-long v13, v11, v10

    .line 326
    .line 327
    long-to-int v2, v13

    .line 328
    int-to-float v2, v2

    .line 329
    invoke-virtual {v1}, Ldefpackage/ic;->c()F

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    cmpg-float v2, v2, v4

    .line 334
    .line 335
    if-ltz v2, :cond_10

    .line 336
    .line 337
    and-long v7, v11, v8

    .line 338
    .line 339
    long-to-int v2, v7

    .line 340
    int-to-float v2, v2

    .line 341
    iget v1, v1, Ldefpackage/ic;->f:F

    .line 342
    .line 343
    cmpg-float v1, v2, v1

    .line 344
    .line 345
    if-gez v1, :cond_f

    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_f
    :goto_5
    move v1, v3

    .line 349
    goto :goto_7

    .line 350
    :cond_10
    :goto_6
    const/4 v1, 0x1

    .line 351
    :goto_7
    iput-boolean v1, v0, Ldefpackage/rd3;->k:Z

    .line 352
    .line 353
    iput-wide v5, v0, Ldefpackage/rd3;->p:J

    .line 354
    .line 355
    :cond_11
    return v3

    .line 356
    :cond_12
    :goto_8
    iget-object v2, v0, Ldefpackage/rd3;->n:Ldefpackage/qd3;

    .line 357
    .line 358
    if-eqz v2, :cond_13

    .line 359
    .line 360
    iget-object v11, v0, Ldefpackage/rd3;->o:Ldefpackage/r62;

    .line 361
    .line 362
    if-ne v1, v11, :cond_13

    .line 363
    .line 364
    invoke-interface {v2}, Ldefpackage/qd3;->a()Z

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    if-eqz v11, :cond_14

    .line 369
    .line 370
    :cond_13
    iput-object v1, v0, Ldefpackage/rd3;->o:Ldefpackage/r62;

    .line 371
    .line 372
    iget-object v13, v0, Ldefpackage/rd3;->a:Ljava/lang/String;

    .line 373
    .line 374
    iget-object v2, v0, Ldefpackage/rd3;->b:Ldefpackage/zs4;

    .line 375
    .line 376
    invoke-static {v2, v1}, Ldefpackage/ud3;->g0(Ldefpackage/zs4;Ldefpackage/r62;)Ldefpackage/zs4;

    .line 377
    .line 378
    .line 379
    move-result-object v14

    .line 380
    iget-object v1, v0, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    iget-object v2, v0, Ldefpackage/rd3;->c:Ldefpackage/ha1;

    .line 386
    .line 387
    iget-boolean v11, v0, Ldefpackage/rd3;->e:Z

    .line 388
    .line 389
    new-instance v12, Ldefpackage/mc;

    .line 390
    .line 391
    sget-object v15, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 392
    .line 393
    move-object/from16 v16, v15

    .line 394
    .line 395
    move-object/from16 v18, v1

    .line 396
    .line 397
    move-object/from16 v17, v2

    .line 398
    .line 399
    move/from16 v19, v11

    .line 400
    .line 401
    invoke-direct/range {v12 .. v19}, Ldefpackage/mc;-><init>(Ljava/lang/String;Ldefpackage/zs4;Ljava/util/List;Ljava/util/List;Ldefpackage/ha1;Ldefpackage/oo0;Z)V

    .line 402
    .line 403
    .line 404
    move-object v2, v12

    .line 405
    :cond_14
    iput-object v2, v0, Ldefpackage/rd3;->n:Ldefpackage/qd3;

    .line 406
    .line 407
    iget-boolean v1, v0, Ldefpackage/rd3;->e:Z

    .line 408
    .line 409
    iget v11, v0, Ldefpackage/rd3;->d:I

    .line 410
    .line 411
    invoke-interface {v2}, Ldefpackage/qd3;->d()F

    .line 412
    .line 413
    .line 414
    move-result v12

    .line 415
    invoke-static {v5, v6, v1, v11, v12}, Ldefpackage/ji2;->w(JZIF)J

    .line 416
    .line 417
    .line 418
    move-result-wide v17

    .line 419
    iget-boolean v1, v0, Ldefpackage/rd3;->e:Z

    .line 420
    .line 421
    iget v11, v0, Ldefpackage/rd3;->d:I

    .line 422
    .line 423
    iget v12, v0, Ldefpackage/rd3;->f:I

    .line 424
    .line 425
    if-nez v1, :cond_17

    .line 426
    .line 427
    if-ne v11, v4, :cond_15

    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_15
    const/4 v1, 0x4

    .line 431
    if-ne v11, v1, :cond_16

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_16
    const/4 v1, 0x5

    .line 435
    if-ne v11, v1, :cond_17

    .line 436
    .line 437
    :goto_9
    const/4 v15, 0x1

    .line 438
    goto :goto_a

    .line 439
    :cond_17
    const/4 v1, 0x1

    .line 440
    if-ge v12, v1, :cond_18

    .line 441
    .line 442
    goto :goto_9

    .line 443
    :cond_18
    move v15, v12

    .line 444
    :goto_a
    new-instance v13, Ldefpackage/ic;

    .line 445
    .line 446
    move-object v14, v2

    .line 447
    check-cast v14, Ldefpackage/mc;

    .line 448
    .line 449
    move/from16 v16, v11

    .line 450
    .line 451
    invoke-direct/range {v13 .. v18}, Ldefpackage/ic;-><init>(Ldefpackage/mc;IIJ)V

    .line 452
    .line 453
    .line 454
    iput-wide v5, v0, Ldefpackage/rd3;->p:J

    .line 455
    .line 456
    invoke-virtual {v13}, Ldefpackage/ic;->c()F

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    invoke-static {v1}, Ldefpackage/ji2;->g(F)I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    iget v2, v13, Ldefpackage/ic;->f:F

    .line 465
    .line 466
    invoke-static {v2}, Ldefpackage/ji2;->g(F)I

    .line 467
    .line 468
    .line 469
    move-result v4

    .line 470
    int-to-long v11, v1

    .line 471
    shl-long/2addr v11, v10

    .line 472
    int-to-long v14, v4

    .line 473
    and-long/2addr v14, v8

    .line 474
    or-long/2addr v11, v14

    .line 475
    invoke-static {v5, v6, v11, v12}, Ldefpackage/qc0;->d(JJ)J

    .line 476
    .line 477
    .line 478
    move-result-wide v4

    .line 479
    iput-wide v4, v0, Ldefpackage/rd3;->l:J

    .line 480
    .line 481
    iget v1, v0, Ldefpackage/rd3;->d:I

    .line 482
    .line 483
    if-ne v1, v7, :cond_19

    .line 484
    .line 485
    goto :goto_b

    .line 486
    :cond_19
    shr-long v6, v4, v10

    .line 487
    .line 488
    long-to-int v1, v6

    .line 489
    int-to-float v1, v1

    .line 490
    invoke-virtual {v13}, Ldefpackage/ic;->c()F

    .line 491
    .line 492
    .line 493
    move-result v6

    .line 494
    cmpg-float v1, v1, v6

    .line 495
    .line 496
    if-ltz v1, :cond_1a

    .line 497
    .line 498
    and-long/2addr v4, v8

    .line 499
    long-to-int v1, v4

    .line 500
    int-to-float v1, v1

    .line 501
    cmpg-float v1, v1, v2

    .line 502
    .line 503
    if-gez v1, :cond_1b

    .line 504
    .line 505
    :cond_1a
    const/4 v3, 0x1

    .line 506
    :cond_1b
    :goto_b
    iput-boolean v3, v0, Ldefpackage/rd3;->k:Z

    .line 507
    .line 508
    iput-object v13, v0, Ldefpackage/rd3;->j:Ldefpackage/ic;

    .line 509
    .line 510
    const/16 v20, 0x1

    .line 511
    .line 512
    return v20
.end method

.method public final b()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ldefpackage/rd3;->j:Ldefpackage/ic;

    .line 3
    .line 4
    iput-object v0, p0, Ldefpackage/rd3;->n:Ldefpackage/qd3;

    .line 5
    .line 6
    iput-object v0, p0, Ldefpackage/rd3;->o:Ldefpackage/r62;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, v0, v0, v0}, Ldefpackage/qc0;->g(IIII)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    iput-wide v1, p0, Ldefpackage/rd3;->p:J

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    iput-wide v1, p0, Ldefpackage/rd3;->l:J

    .line 18
    .line 19
    iput-boolean v0, p0, Ldefpackage/rd3;->k:Z

    .line 20
    .line 21
    return-void
.end method

.method public final c(Ldefpackage/oo0;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget v1, Ldefpackage/gz1;->b:I

    .line 6
    .line 7
    invoke-interface {p1}, Ldefpackage/oo0;->g()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p1}, Ldefpackage/oo0;->J()F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1, v2}, Ldefpackage/gz1;->a(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-wide v1, Ldefpackage/gz1;->a:J

    .line 21
    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput-object p1, p0, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 25
    .line 26
    iput-wide v1, p0, Ldefpackage/rd3;->h:J

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-wide v3, p0, Ldefpackage/rd3;->h:J

    .line 32
    .line 33
    cmp-long v0, v3, v1

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iput-object p1, p0, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 39
    .line 40
    iput-wide v1, p0, Ldefpackage/rd3;->h:J

    .line 41
    .line 42
    iget-wide v0, p0, Ldefpackage/rd3;->q:J

    .line 43
    .line 44
    const/4 p1, 0x2

    .line 45
    shl-long/2addr v0, p1

    .line 46
    const-wide/16 v2, 0x1

    .line 47
    .line 48
    or-long/2addr v0, v2

    .line 49
    iput-wide v0, p0, Ldefpackage/rd3;->q:J

    .line 50
    .line 51
    invoke-virtual {p0}, Ldefpackage/rd3;->b()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/rd3;->j:Ldefpackage/ic;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "<paragraph>"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "null"

    .line 9
    .line 10
    :goto_0
    iget-wide v1, p0, Ldefpackage/rd3;->h:J

    .line 11
    .line 12
    invoke-static {v1, v2}, Ldefpackage/gz1;->b(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-wide v2, p0, Ldefpackage/rd3;->q:J

    .line 17
    .line 18
    const-string p0, ", lastDensity="

    .line 19
    .line 20
    const-string v4, ", history="

    .line 21
    .line 22
    const-string v5, "ParagraphLayoutCache(paragraph="

    .line 23
    .line 24
    invoke-static {v5, v0, p0, v1, v4}, Ldefpackage/b11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string v0, ", constraints=$)"

    .line 29
    .line 30
    invoke-static {p0, v2, v3, v0}, Ldefpackage/b11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
