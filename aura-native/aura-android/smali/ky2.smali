.class public final Lky2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public final a:J

.field public final b:Lbe3;

.field public final c:Lwy2;

.field public final d:Lzg1;

.field public final e:Lov1;

.field public final f:Ltq0;

.field public g:Lm51;

.field public h:Lwv4;

.field public i:Lwv4;

.field public j:I

.field public k:Lqv2;

.field public l:Lqv2;

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:I

.field public r:Lq84;

.field public s:Z

.field public t:Z

.field public u:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 58
    invoke-direct {p0, v0, v1}, Lky2;-><init>(J)V

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lky2;->a:J

    .line 5
    .line 6
    new-instance p1, Lbe3;

    .line 7
    .line 8
    const/16 p2, 0xa

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lbe3;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lky2;->b:Lbe3;

    .line 14
    .line 15
    new-instance p1, Lwy2;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lky2;->c:Lwy2;

    .line 21
    .line 22
    new-instance p1, Lzg1;

    .line 23
    .line 24
    invoke-direct {p1}, Lzg1;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lky2;->d:Lzg1;

    .line 28
    .line 29
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    iput-wide p1, p0, Lky2;->m:J

    .line 35
    .line 36
    new-instance p1, Lov1;

    .line 37
    .line 38
    const/4 p2, 0x0

    .line 39
    invoke-direct {p1, p2}, Lov1;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lky2;->e:Lov1;

    .line 43
    .line 44
    new-instance p1, Ltq0;

    .line 45
    .line 46
    invoke-direct {p1}, Ltq0;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lky2;->f:Ltq0;

    .line 50
    .line 51
    iput-object p1, p0, Lky2;->i:Lwv4;

    .line 52
    .line 53
    const-wide/16 p1, -0x1

    .line 54
    .line 55
    iput-wide p1, p0, Lky2;->p:J

    .line 56
    .line 57
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 58

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lky2;->h:Lwv4;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, v0, Lky2;->j:I

    .line 13
    .line 14
    const/4 v14, 0x0

    .line 15
    iget-object v7, v0, Lky2;->c:Lwy2;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0, v1, v14}, Lky2;->i(Ll51;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-object v3, v7

    .line 24
    const/16 p2, 0x0

    .line 25
    .line 26
    const/4 v6, -0x1

    .line 27
    const/4 v14, -0x1

    .line 28
    const-wide/32 v17, 0xf4240

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2e

    .line 32
    .line 33
    :cond_0
    :goto_0
    iget-object v2, v0, Lky2;->r:Lq84;

    .line 34
    .line 35
    iget-object v8, v0, Lky2;->b:Lbe3;

    .line 36
    .line 37
    const/4 v9, 0x1

    .line 38
    if-nez v2, :cond_37

    .line 39
    .line 40
    new-instance v2, Lbe3;

    .line 41
    .line 42
    iget v15, v7, Lwy2;->b:I

    .line 43
    .line 44
    invoke-direct {v2, v15}, Lbe3;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iget-object v15, v2, Lbe3;->a:[B

    .line 48
    .line 49
    const/16 p2, 0x0

    .line 50
    .line 51
    iget v3, v7, Lwy2;->b:I

    .line 52
    .line 53
    invoke-interface {v1, v15, v14, v3}, Ll51;->n([BII)V

    .line 54
    .line 55
    .line 56
    iget v3, v7, Lwy2;->a:I

    .line 57
    .line 58
    and-int/2addr v3, v9

    .line 59
    iget v15, v7, Lwy2;->d:I

    .line 60
    .line 61
    const/16 v16, 0x15

    .line 62
    .line 63
    const-wide/32 v17, 0xf4240

    .line 64
    .line 65
    .line 66
    const/16 v4, 0x24

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    if-eq v15, v9, :cond_1

    .line 71
    .line 72
    move v3, v4

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    :goto_1
    move/from16 v3, v16

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    if-eq v15, v9, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/16 v16, 0xd

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :goto_2
    iget v5, v2, Lbe3;->c:I

    .line 84
    .line 85
    add-int/lit8 v15, v3, 0x4

    .line 86
    .line 87
    const-wide/16 v19, 0x0

    .line 88
    .line 89
    const v12, 0x496e666f

    .line 90
    .line 91
    .line 92
    const v13, 0x56425249

    .line 93
    .line 94
    .line 95
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    const v10, 0x58696e67

    .line 101
    .line 102
    .line 103
    if-lt v5, v15, :cond_4

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lbe3;->m()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eq v3, v10, :cond_6

    .line 113
    .line 114
    if-ne v3, v12, :cond_4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    iget v3, v2, Lbe3;->c:I

    .line 118
    .line 119
    const/16 v5, 0x28

    .line 120
    .line 121
    if-lt v3, v5, :cond_5

    .line 122
    .line 123
    invoke-virtual {v2, v4}, Lbe3;->N(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Lbe3;->m()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-ne v3, v13, :cond_5

    .line 131
    .line 132
    move v3, v13

    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move v3, v14

    .line 135
    :cond_6
    :goto_3
    iget-object v11, v0, Lky2;->d:Lzg1;

    .line 136
    .line 137
    const-wide/16 v23, 0x1

    .line 138
    .line 139
    const-wide/16 v25, -0x1

    .line 140
    .line 141
    if-eq v3, v12, :cond_7

    .line 142
    .line 143
    if-eq v3, v13, :cond_8

    .line 144
    .line 145
    if-eq v3, v10, :cond_7

    .line 146
    .line 147
    invoke-interface {v1}, Ll51;->k()V

    .line 148
    .line 149
    .line 150
    move-object/from16 v30, p2

    .line 151
    .line 152
    move-object v15, v7

    .line 153
    const/16 v29, 0x0

    .line 154
    .line 155
    goto/16 :goto_1b

    .line 156
    .line 157
    :cond_7
    move-object v15, v7

    .line 158
    const/16 v29, 0x0

    .line 159
    .line 160
    goto/16 :goto_9

    .line 161
    .line 162
    :cond_8
    invoke-interface {v1}, Ll51;->getLength()J

    .line 163
    .line 164
    .line 165
    move-result-wide v12

    .line 166
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 167
    .line 168
    .line 169
    move-result-wide v27

    .line 170
    const/4 v3, 0x6

    .line 171
    invoke-virtual {v2, v3}, Lbe3;->O(I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lbe3;->m()I

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    iget v10, v7, Lwy2;->b:I

    .line 179
    .line 180
    const/16 v29, 0x0

    .line 181
    .line 182
    int-to-long v5, v10

    .line 183
    add-long v35, v27, v5

    .line 184
    .line 185
    int-to-long v5, v3

    .line 186
    add-long v5, v35, v5

    .line 187
    .line 188
    invoke-virtual {v2}, Lbe3;->m()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-gtz v3, :cond_9

    .line 193
    .line 194
    move-object/from16 v30, p2

    .line 195
    .line 196
    move-object v15, v7

    .line 197
    goto/16 :goto_8

    .line 198
    .line 199
    :cond_9
    iget v10, v7, Lwy2;->c:I

    .line 200
    .line 201
    move-wide/from16 v30, v5

    .line 202
    .line 203
    int-to-long v4, v3

    .line 204
    iget v3, v7, Lwy2;->f:I

    .line 205
    .line 206
    int-to-long v14, v3

    .line 207
    mul-long/2addr v4, v14

    .line 208
    sub-long v4, v4, v23

    .line 209
    .line 210
    invoke-static {v10, v4, v5}, Lf35;->Y(IJ)J

    .line 211
    .line 212
    .line 213
    move-result-wide v33

    .line 214
    invoke-virtual {v2}, Lbe3;->H()I

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    invoke-virtual {v2}, Lbe3;->H()I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    invoke-virtual {v2}, Lbe3;->H()I

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    const/4 v10, 0x2

    .line 227
    invoke-virtual {v2, v10}, Lbe3;->O(I)V

    .line 228
    .line 229
    .line 230
    iget v10, v7, Lwy2;->b:I

    .line 231
    .line 232
    int-to-long v14, v10

    .line 233
    add-long v27, v27, v14

    .line 234
    .line 235
    new-array v10, v3, [J

    .line 236
    .line 237
    new-array v14, v3, [J

    .line 238
    .line 239
    move-object v15, v7

    .line 240
    move-wide/from16 v6, v27

    .line 241
    .line 242
    const/4 v9, 0x0

    .line 243
    :goto_4
    if-ge v9, v3, :cond_e

    .line 244
    .line 245
    move-object/from16 v23, v14

    .line 246
    .line 247
    move-object/from16 v24, v15

    .line 248
    .line 249
    int-to-long v14, v9

    .line 250
    mul-long v14, v14, v33

    .line 251
    .line 252
    move/from16 v37, v9

    .line 253
    .line 254
    move-object/from16 v28, v10

    .line 255
    .line 256
    int-to-long v9, v3

    .line 257
    div-long/2addr v14, v9

    .line 258
    aput-wide v14, v28, v37

    .line 259
    .line 260
    aput-wide v6, v23, v37

    .line 261
    .line 262
    const/4 v9, 0x1

    .line 263
    if-eq v5, v9, :cond_d

    .line 264
    .line 265
    const/4 v10, 0x2

    .line 266
    if-eq v5, v10, :cond_c

    .line 267
    .line 268
    const/4 v9, 0x3

    .line 269
    if-eq v5, v9, :cond_b

    .line 270
    .line 271
    const/4 v9, 0x4

    .line 272
    if-eq v5, v9, :cond_a

    .line 273
    .line 274
    move-object/from16 v30, p2

    .line 275
    .line 276
    move-object/from16 v15, v24

    .line 277
    .line 278
    goto/16 :goto_8

    .line 279
    .line 280
    :cond_a
    invoke-virtual {v2}, Lbe3;->E()I

    .line 281
    .line 282
    .line 283
    move-result v9

    .line 284
    goto :goto_5

    .line 285
    :cond_b
    invoke-virtual {v2}, Lbe3;->D()I

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    goto :goto_5

    .line 290
    :cond_c
    invoke-virtual {v2}, Lbe3;->H()I

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    goto :goto_5

    .line 295
    :cond_d
    invoke-virtual {v2}, Lbe3;->A()I

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    :goto_5
    int-to-long v9, v9

    .line 300
    int-to-long v14, v4

    .line 301
    mul-long/2addr v9, v14

    .line 302
    add-long/2addr v6, v9

    .line 303
    add-int/lit8 v9, v37, 0x1

    .line 304
    .line 305
    move-object/from16 v14, v23

    .line 306
    .line 307
    move-object/from16 v15, v24

    .line 308
    .line 309
    move-object/from16 v10, v28

    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_e
    move-object/from16 v28, v10

    .line 313
    .line 314
    move-object/from16 v23, v14

    .line 315
    .line 316
    move-object/from16 v24, v15

    .line 317
    .line 318
    cmp-long v2, v12, v25

    .line 319
    .line 320
    const-string v3, ", "

    .line 321
    .line 322
    const-string v4, "VbriSeeker"

    .line 323
    .line 324
    if-eqz v2, :cond_f

    .line 325
    .line 326
    cmp-long v2, v12, v30

    .line 327
    .line 328
    if-eqz v2, :cond_f

    .line 329
    .line 330
    new-instance v2, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v5, "VBRI data size mismatch: "

    .line 333
    .line 334
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    move-wide/from16 v9, v30

    .line 344
    .line 345
    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v4, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_f
    move-wide/from16 v9, v30

    .line 357
    .line 358
    :goto_6
    cmp-long v2, v9, v6

    .line 359
    .line 360
    if-eqz v2, :cond_10

    .line 361
    .line 362
    new-instance v2, Ljava/lang/StringBuilder;

    .line 363
    .line 364
    const-string v5, "VBRI bytes and ToC mismatch (using max): "

    .line 365
    .line 366
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string v3, "\nSeeking will be inaccurate."

    .line 379
    .line 380
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-static {v4, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 391
    .line 392
    .line 393
    move-result-wide v5

    .line 394
    move-wide/from16 v37, v5

    .line 395
    .line 396
    goto :goto_7

    .line 397
    :cond_10
    move-wide/from16 v37, v9

    .line 398
    .line 399
    :goto_7
    new-instance v30, Ll35;

    .line 400
    .line 401
    move-object/from16 v15, v24

    .line 402
    .line 403
    iget v2, v15, Lwy2;->e:I

    .line 404
    .line 405
    move/from16 v39, v2

    .line 406
    .line 407
    move-object/from16 v32, v23

    .line 408
    .line 409
    move-object/from16 v31, v28

    .line 410
    .line 411
    invoke-direct/range {v30 .. v39}, Ll35;-><init>([J[JJJJI)V

    .line 412
    .line 413
    .line 414
    :goto_8
    iget v2, v15, Lwy2;->b:I

    .line 415
    .line 416
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_1b

    .line 420
    .line 421
    :goto_9
    invoke-virtual {v2}, Lbe3;->m()I

    .line 422
    .line 423
    .line 424
    move-result v4

    .line 425
    and-int/lit8 v5, v4, 0x1

    .line 426
    .line 427
    if-eqz v5, :cond_11

    .line 428
    .line 429
    invoke-virtual {v2}, Lbe3;->E()I

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    goto :goto_a

    .line 434
    :cond_11
    const/4 v5, -0x1

    .line 435
    :goto_a
    and-int/lit8 v6, v4, 0x2

    .line 436
    .line 437
    if-eqz v6, :cond_12

    .line 438
    .line 439
    invoke-virtual {v2}, Lbe3;->C()J

    .line 440
    .line 441
    .line 442
    move-result-wide v6

    .line 443
    move-wide/from16 v47, v6

    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_12
    move-wide/from16 v47, v25

    .line 447
    .line 448
    :goto_b
    and-int/lit8 v6, v4, 0x4

    .line 449
    .line 450
    const/4 v9, 0x4

    .line 451
    if-ne v6, v9, :cond_14

    .line 452
    .line 453
    const/16 v6, 0x64

    .line 454
    .line 455
    new-array v7, v6, [J

    .line 456
    .line 457
    const/4 v9, 0x0

    .line 458
    :goto_c
    if-ge v9, v6, :cond_13

    .line 459
    .line 460
    invoke-virtual {v2}, Lbe3;->A()I

    .line 461
    .line 462
    .line 463
    move-result v12

    .line 464
    int-to-long v12, v12

    .line 465
    aput-wide v12, v7, v9

    .line 466
    .line 467
    add-int/lit8 v9, v9, 0x1

    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_13
    move-object/from16 v49, v7

    .line 471
    .line 472
    goto :goto_d

    .line 473
    :cond_14
    move-object/from16 v49, p2

    .line 474
    .line 475
    :goto_d
    and-int/lit8 v4, v4, 0x8

    .line 476
    .line 477
    if-eqz v4, :cond_15

    .line 478
    .line 479
    const/4 v9, 0x4

    .line 480
    invoke-virtual {v2, v9}, Lbe3;->O(I)V

    .line 481
    .line 482
    .line 483
    :cond_15
    invoke-virtual {v2}, Lbe3;->a()I

    .line 484
    .line 485
    .line 486
    move-result v4

    .line 487
    const/16 v6, 0x18

    .line 488
    .line 489
    if-lt v4, v6, :cond_17

    .line 490
    .line 491
    const/16 v4, 0xb

    .line 492
    .line 493
    invoke-virtual {v2, v4}, Lbe3;->O(I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Lbe3;->m()I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 501
    .line 502
    .line 503
    move-result v4

    .line 504
    invoke-virtual {v2}, Lbe3;->H()I

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    invoke-virtual {v2}, Lbe3;->H()I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    invoke-static {v6}, Lly2;->a(I)Lly2;

    .line 513
    .line 514
    .line 515
    move-result-object v6

    .line 516
    invoke-static {v7}, Lly2;->a(I)Lly2;

    .line 517
    .line 518
    .line 519
    move-result-object v7

    .line 520
    const/4 v9, 0x0

    .line 521
    cmpg-float v9, v4, v9

    .line 522
    .line 523
    if-gtz v9, :cond_16

    .line 524
    .line 525
    if-nez v6, :cond_16

    .line 526
    .line 527
    if-nez v7, :cond_16

    .line 528
    .line 529
    move-object/from16 v9, p2

    .line 530
    .line 531
    :goto_e
    const/4 v4, 0x2

    .line 532
    goto :goto_f

    .line 533
    :cond_16
    new-instance v9, Lmy2;

    .line 534
    .line 535
    invoke-direct {v9, v4, v6, v7}, Lmy2;-><init>(FLly2;Lly2;)V

    .line 536
    .line 537
    .line 538
    goto :goto_e

    .line 539
    :goto_f
    invoke-virtual {v2, v4}, Lbe3;->O(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2}, Lbe3;->D()I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    const v4, 0xfff000

    .line 547
    .line 548
    .line 549
    and-int/2addr v4, v2

    .line 550
    shr-int/lit8 v4, v4, 0xc

    .line 551
    .line 552
    and-int/lit16 v2, v2, 0xfff

    .line 553
    .line 554
    goto :goto_10

    .line 555
    :cond_17
    move-object/from16 v9, p2

    .line 556
    .line 557
    const/4 v2, -0x1

    .line 558
    const/4 v4, -0x1

    .line 559
    :goto_10
    int-to-long v5, v5

    .line 560
    iget v7, v15, Lwy2;->b:I

    .line 561
    .line 562
    iget v12, v15, Lwy2;->c:I

    .line 563
    .line 564
    iget v13, v15, Lwy2;->e:I

    .line 565
    .line 566
    iget v14, v15, Lwy2;->f:I

    .line 567
    .line 568
    iget v10, v11, Lzg1;->a:I

    .line 569
    .line 570
    move/from16 v43, v7

    .line 571
    .line 572
    const/4 v7, -0x1

    .line 573
    if-eq v10, v7, :cond_18

    .line 574
    .line 575
    iget v10, v11, Lzg1;->b:I

    .line 576
    .line 577
    if-eq v10, v7, :cond_18

    .line 578
    .line 579
    goto :goto_11

    .line 580
    :cond_18
    if-eq v4, v7, :cond_19

    .line 581
    .line 582
    if-eq v2, v7, :cond_19

    .line 583
    .line 584
    iput v4, v11, Lzg1;->a:I

    .line 585
    .line 586
    iput v2, v11, Lzg1;->b:I

    .line 587
    .line 588
    :cond_19
    :goto_11
    if-eqz v9, :cond_1a

    .line 589
    .line 590
    new-instance v2, Lqv2;

    .line 591
    .line 592
    const/4 v4, 0x1

    .line 593
    new-array v7, v4, [Lpv2;

    .line 594
    .line 595
    aput-object v9, v7, v29

    .line 596
    .line 597
    invoke-direct {v2, v7}, Lqv2;-><init>([Lpv2;)V

    .line 598
    .line 599
    .line 600
    goto :goto_12

    .line 601
    :cond_1a
    const/4 v4, 0x1

    .line 602
    move-object/from16 v2, p2

    .line 603
    .line 604
    :goto_12
    iput-object v2, v0, Lky2;->l:Lqv2;

    .line 605
    .line 606
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 607
    .line 608
    .line 609
    move-result-wide v41

    .line 610
    invoke-interface {v1}, Ll51;->getLength()J

    .line 611
    .line 612
    .line 613
    move-result-wide v9

    .line 614
    cmp-long v2, v9, v25

    .line 615
    .line 616
    if-eqz v2, :cond_1b

    .line 617
    .line 618
    cmp-long v2, v47, v25

    .line 619
    .line 620
    if-eqz v2, :cond_1b

    .line 621
    .line 622
    invoke-interface {v1}, Ll51;->getLength()J

    .line 623
    .line 624
    .line 625
    move-result-wide v9

    .line 626
    move-wide/from16 v30, v5

    .line 627
    .line 628
    add-long v4, v41, v47

    .line 629
    .line 630
    cmp-long v2, v9, v4

    .line 631
    .line 632
    if-eqz v2, :cond_1c

    .line 633
    .line 634
    new-instance v2, Ljava/lang/StringBuilder;

    .line 635
    .line 636
    const-string v6, "Data size mismatch between stream ("

    .line 637
    .line 638
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-interface {v1}, Ll51;->getLength()J

    .line 642
    .line 643
    .line 644
    move-result-wide v6

    .line 645
    invoke-virtual {v2, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    const-string v6, ") and Xing frame ("

    .line 649
    .line 650
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    const-string v4, "), using Xing value."

    .line 657
    .line 658
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    const-string v4, "Mp3Extractor"

    .line 666
    .line 667
    invoke-static {v4, v2}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    goto :goto_13

    .line 671
    :cond_1b
    move-wide/from16 v30, v5

    .line 672
    .line 673
    :cond_1c
    :goto_13
    iget v2, v15, Lwy2;->b:I

    .line 674
    .line 675
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 676
    .line 677
    .line 678
    const v2, 0x58696e67

    .line 679
    .line 680
    .line 681
    if-ne v3, v2, :cond_21

    .line 682
    .line 683
    cmp-long v2, v30, v25

    .line 684
    .line 685
    if-eqz v2, :cond_1e

    .line 686
    .line 687
    cmp-long v2, v30, v19

    .line 688
    .line 689
    if-nez v2, :cond_1d

    .line 690
    .line 691
    goto :goto_14

    .line 692
    :cond_1d
    int-to-long v2, v14

    .line 693
    mul-long v5, v30, v2

    .line 694
    .line 695
    sub-long v5, v5, v23

    .line 696
    .line 697
    invoke-static {v12, v5, v6}, Lf35;->Y(IJ)J

    .line 698
    .line 699
    .line 700
    move-result-wide v2

    .line 701
    move-wide/from16 v44, v2

    .line 702
    .line 703
    goto :goto_15

    .line 704
    :cond_1e
    :goto_14
    move-wide/from16 v44, v21

    .line 705
    .line 706
    :goto_15
    cmp-long v2, v44, v21

    .line 707
    .line 708
    if-nez v2, :cond_20

    .line 709
    .line 710
    :cond_1f
    :goto_16
    move-object/from16 v30, p2

    .line 711
    .line 712
    goto/16 :goto_1b

    .line 713
    .line 714
    :cond_20
    new-instance v40, Lge5;

    .line 715
    .line 716
    move/from16 v46, v13

    .line 717
    .line 718
    invoke-direct/range {v40 .. v49}, Lge5;-><init>(JIJIJ[J)V

    .line 719
    .line 720
    .line 721
    move-object/from16 v30, v40

    .line 722
    .line 723
    goto :goto_1b

    .line 724
    :cond_21
    move/from16 v2, v43

    .line 725
    .line 726
    invoke-interface {v1}, Ll51;->getLength()J

    .line 727
    .line 728
    .line 729
    move-result-wide v3

    .line 730
    cmp-long v5, v30, v25

    .line 731
    .line 732
    if-eqz v5, :cond_23

    .line 733
    .line 734
    cmp-long v5, v30, v19

    .line 735
    .line 736
    if-nez v5, :cond_22

    .line 737
    .line 738
    goto :goto_17

    .line 739
    :cond_22
    int-to-long v5, v14

    .line 740
    mul-long v5, v5, v30

    .line 741
    .line 742
    sub-long v5, v5, v23

    .line 743
    .line 744
    invoke-static {v12, v5, v6}, Lf35;->Y(IJ)J

    .line 745
    .line 746
    .line 747
    move-result-wide v5

    .line 748
    move-wide/from16 v36, v5

    .line 749
    .line 750
    goto :goto_18

    .line 751
    :cond_23
    :goto_17
    move-wide/from16 v36, v21

    .line 752
    .line 753
    :goto_18
    cmp-long v5, v36, v21

    .line 754
    .line 755
    if-nez v5, :cond_24

    .line 756
    .line 757
    goto :goto_16

    .line 758
    :cond_24
    cmp-long v5, v47, v25

    .line 759
    .line 760
    if-eqz v5, :cond_25

    .line 761
    .line 762
    add-long v3, v41, v47

    .line 763
    .line 764
    int-to-long v5, v2

    .line 765
    sub-long v47, v47, v5

    .line 766
    .line 767
    :goto_19
    move-wide/from16 v50, v3

    .line 768
    .line 769
    move-wide/from16 v32, v47

    .line 770
    .line 771
    goto :goto_1a

    .line 772
    :cond_25
    cmp-long v5, v3, v25

    .line 773
    .line 774
    if-eqz v5, :cond_1f

    .line 775
    .line 776
    sub-long v5, v3, v41

    .line 777
    .line 778
    int-to-long v9, v2

    .line 779
    sub-long v47, v5, v9

    .line 780
    .line 781
    goto :goto_19

    .line 782
    :goto_1a
    sget-object v38, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 783
    .line 784
    const-wide/32 v34, 0x7a1200

    .line 785
    .line 786
    .line 787
    invoke-static/range {v32 .. v38}, Lf35;->a0(JJJLjava/math/RoundingMode;)J

    .line 788
    .line 789
    .line 790
    move-result-wide v3

    .line 791
    move-wide/from16 v5, v32

    .line 792
    .line 793
    move-object/from16 v7, v38

    .line 794
    .line 795
    invoke-static {v3, v4}, Ljz4;->m(J)I

    .line 796
    .line 797
    .line 798
    move-result v54

    .line 799
    move-wide/from16 v3, v30

    .line 800
    .line 801
    invoke-static {v5, v6, v3, v4, v7}, Lgh0;->h(JJLjava/math/RoundingMode;)J

    .line 802
    .line 803
    .line 804
    move-result-wide v3

    .line 805
    invoke-static {v3, v4}, Ljz4;->m(J)I

    .line 806
    .line 807
    .line 808
    move-result v55

    .line 809
    new-instance v49, Leb0;

    .line 810
    .line 811
    int-to-long v2, v2

    .line 812
    add-long v52, v41, v2

    .line 813
    .line 814
    const/16 v56, 0x0

    .line 815
    .line 816
    const/16 v57, 0x1

    .line 817
    .line 818
    invoke-direct/range {v49 .. v57}, Leb0;-><init>(JJIIZZ)V

    .line 819
    .line 820
    .line 821
    move-object/from16 v30, v49

    .line 822
    .line 823
    :goto_1b
    iget-object v2, v0, Lky2;->k:Lqv2;

    .line 824
    .line 825
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 826
    .line 827
    .line 828
    move-result-wide v3

    .line 829
    if-nez v2, :cond_26

    .line 830
    .line 831
    :goto_1c
    move-object/from16 v2, p2

    .line 832
    .line 833
    goto/16 :goto_25

    .line 834
    .line 835
    :cond_26
    iget-object v5, v2, Lqv2;->a:[Lpv2;

    .line 836
    .line 837
    array-length v6, v5

    .line 838
    move/from16 v7, v29

    .line 839
    .line 840
    :goto_1d
    if-ge v7, v6, :cond_29

    .line 841
    .line 842
    aget-object v9, v5, v7

    .line 843
    .line 844
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 845
    .line 846
    .line 847
    move-result-object v10

    .line 848
    const-class v12, Lpw2;

    .line 849
    .line 850
    invoke-virtual {v12, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 851
    .line 852
    .line 853
    move-result v10

    .line 854
    if-eqz v10, :cond_27

    .line 855
    .line 856
    invoke-virtual {v12, v9}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v9

    .line 860
    check-cast v9, Lpv2;

    .line 861
    .line 862
    sget-object v10, Lzo3;->n:Lvo3;

    .line 863
    .line 864
    invoke-interface {v10, v9}, Lro3;->apply(Ljava/lang/Object;)Z

    .line 865
    .line 866
    .line 867
    move-result v10

    .line 868
    if-eqz v10, :cond_27

    .line 869
    .line 870
    goto :goto_1e

    .line 871
    :cond_27
    move-object/from16 v9, p2

    .line 872
    .line 873
    :goto_1e
    if-eqz v9, :cond_28

    .line 874
    .line 875
    goto :goto_1f

    .line 876
    :cond_28
    add-int/lit8 v7, v7, 0x1

    .line 877
    .line 878
    goto :goto_1d

    .line 879
    :cond_29
    move-object/from16 v9, p2

    .line 880
    .line 881
    :goto_1f
    check-cast v9, Lpw2;

    .line 882
    .line 883
    if-nez v9, :cond_2a

    .line 884
    .line 885
    goto :goto_1c

    .line 886
    :cond_2a
    iget-object v5, v9, Lpw2;->e:[I

    .line 887
    .line 888
    iget-object v2, v2, Lqv2;->a:[Lpv2;

    .line 889
    .line 890
    array-length v6, v2

    .line 891
    const/4 v7, 0x0

    .line 892
    :goto_20
    if-ge v7, v6, :cond_2d

    .line 893
    .line 894
    aget-object v10, v2, v7

    .line 895
    .line 896
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    move-result-object v12

    .line 900
    const-class v13, Lds4;

    .line 901
    .line 902
    invoke-virtual {v13, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 903
    .line 904
    .line 905
    move-result v12

    .line 906
    if-eqz v12, :cond_2b

    .line 907
    .line 908
    invoke-virtual {v13, v10}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v10

    .line 912
    check-cast v10, Lpv2;

    .line 913
    .line 914
    move-object v12, v10

    .line 915
    check-cast v12, Lds4;

    .line 916
    .line 917
    iget-object v12, v12, Lnv1;->a:Ljava/lang/String;

    .line 918
    .line 919
    const-string v13, "TLEN"

    .line 920
    .line 921
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result v12

    .line 925
    if-eqz v12, :cond_2b

    .line 926
    .line 927
    goto :goto_21

    .line 928
    :cond_2b
    move-object/from16 v10, p2

    .line 929
    .line 930
    :goto_21
    if-eqz v10, :cond_2c

    .line 931
    .line 932
    goto :goto_22

    .line 933
    :cond_2c
    add-int/lit8 v7, v7, 0x1

    .line 934
    .line 935
    goto :goto_20

    .line 936
    :cond_2d
    move-object/from16 v10, p2

    .line 937
    .line 938
    :goto_22
    check-cast v10, Lds4;

    .line 939
    .line 940
    if-nez v10, :cond_2e

    .line 941
    .line 942
    move-wide/from16 v6, v21

    .line 943
    .line 944
    const/4 v14, 0x0

    .line 945
    goto :goto_23

    .line 946
    :cond_2e
    iget-object v2, v10, Lds4;->d:Lyw1;

    .line 947
    .line 948
    const/4 v14, 0x0

    .line 949
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    check-cast v2, Ljava/lang/String;

    .line 954
    .line 955
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 956
    .line 957
    .line 958
    move-result-wide v6

    .line 959
    invoke-static {v6, v7}, Lf35;->Q(J)J

    .line 960
    .line 961
    .line 962
    move-result-wide v6

    .line 963
    :goto_23
    array-length v2, v5

    .line 964
    add-int/lit8 v10, v2, 0x1

    .line 965
    .line 966
    new-array v12, v10, [J

    .line 967
    .line 968
    new-array v10, v10, [J

    .line 969
    .line 970
    aput-wide v3, v12, v14

    .line 971
    .line 972
    aput-wide v19, v10, v14

    .line 973
    .line 974
    move-wide/from16 v23, v19

    .line 975
    .line 976
    const/4 v13, 0x1

    .line 977
    :goto_24
    if-gt v13, v2, :cond_2f

    .line 978
    .line 979
    iget v14, v9, Lpw2;->c:I

    .line 980
    .line 981
    add-int/lit8 v25, v13, -0x1

    .line 982
    .line 983
    aget v26, v5, v25

    .line 984
    .line 985
    add-int v14, v14, v26

    .line 986
    .line 987
    move/from16 v26, v2

    .line 988
    .line 989
    move-wide/from16 v31, v3

    .line 990
    .line 991
    int-to-long v2, v14

    .line 992
    add-long v3, v31, v2

    .line 993
    .line 994
    iget v2, v9, Lpw2;->d:I

    .line 995
    .line 996
    iget-object v14, v9, Lpw2;->f:[I

    .line 997
    .line 998
    aget v14, v14, v25

    .line 999
    .line 1000
    add-int/2addr v2, v14

    .line 1001
    move-wide/from16 v31, v3

    .line 1002
    .line 1003
    int-to-long v2, v2

    .line 1004
    add-long v23, v23, v2

    .line 1005
    .line 1006
    aput-wide v31, v12, v13

    .line 1007
    .line 1008
    aput-wide v23, v10, v13

    .line 1009
    .line 1010
    add-int/lit8 v13, v13, 0x1

    .line 1011
    .line 1012
    move/from16 v2, v26

    .line 1013
    .line 1014
    move-wide/from16 v3, v31

    .line 1015
    .line 1016
    const/4 v14, 0x0

    .line 1017
    goto :goto_24

    .line 1018
    :cond_2f
    new-instance v2, Lqw2;

    .line 1019
    .line 1020
    invoke-direct {v2, v6, v7, v12, v10}, Lqw2;-><init>(J[J[J)V

    .line 1021
    .line 1022
    .line 1023
    :goto_25
    iget-boolean v3, v0, Lky2;->s:Z

    .line 1024
    .line 1025
    if-eqz v3, :cond_30

    .line 1026
    .line 1027
    new-instance v2, Lp84;

    .line 1028
    .line 1029
    move-wide/from16 v3, v21

    .line 1030
    .line 1031
    invoke-direct {v2, v3, v4}, Lbo;-><init>(J)V

    .line 1032
    .line 1033
    .line 1034
    move-object v6, v2

    .line 1035
    move-object v2, v8

    .line 1036
    move-object v5, v11

    .line 1037
    move-object v3, v15

    .line 1038
    const/4 v4, 0x1

    .line 1039
    const/4 v14, 0x0

    .line 1040
    goto :goto_28

    .line 1041
    :cond_30
    move-wide/from16 v3, v21

    .line 1042
    .line 1043
    if-eqz v2, :cond_31

    .line 1044
    .line 1045
    move-object/from16 v30, v2

    .line 1046
    .line 1047
    goto :goto_26

    .line 1048
    :cond_31
    if-eqz v30, :cond_32

    .line 1049
    .line 1050
    goto :goto_26

    .line 1051
    :cond_32
    move-object/from16 v30, p2

    .line 1052
    .line 1053
    :goto_26
    if-nez v30, :cond_33

    .line 1054
    .line 1055
    iget-object v2, v8, Lbe3;->a:[B

    .line 1056
    .line 1057
    move/from16 v5, v29

    .line 1058
    .line 1059
    const/4 v9, 0x4

    .line 1060
    invoke-interface {v1, v2, v5, v9}, Ll51;->n([BII)V

    .line 1061
    .line 1062
    .line 1063
    invoke-virtual {v8, v5}, Lbe3;->N(I)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v8}, Lbe3;->m()I

    .line 1067
    .line 1068
    .line 1069
    move-result v2

    .line 1070
    invoke-virtual {v15, v2}, Lwy2;->a(I)Z

    .line 1071
    .line 1072
    .line 1073
    new-instance v7, Leb0;

    .line 1074
    .line 1075
    move-object v2, v8

    .line 1076
    invoke-interface {v1}, Ll51;->getLength()J

    .line 1077
    .line 1078
    .line 1079
    move-result-wide v8

    .line 1080
    move-object v5, v11

    .line 1081
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1082
    .line 1083
    .line 1084
    move-result-wide v10

    .line 1085
    iget v12, v15, Lwy2;->e:I

    .line 1086
    .line 1087
    iget v13, v15, Lwy2;->b:I

    .line 1088
    .line 1089
    move-object/from16 v24, v15

    .line 1090
    .line 1091
    const/4 v15, 0x1

    .line 1092
    move-wide/from16 v21, v3

    .line 1093
    .line 1094
    move-object/from16 v3, v24

    .line 1095
    .line 1096
    const/4 v4, 0x1

    .line 1097
    const/4 v14, 0x0

    .line 1098
    invoke-direct/range {v7 .. v15}, Leb0;-><init>(JJIIZZ)V

    .line 1099
    .line 1100
    .line 1101
    move-object/from16 v30, v7

    .line 1102
    .line 1103
    goto :goto_27

    .line 1104
    :cond_33
    move-wide/from16 v21, v3

    .line 1105
    .line 1106
    move-object v2, v8

    .line 1107
    move-object v5, v11

    .line 1108
    move-object v3, v15

    .line 1109
    const/4 v4, 0x1

    .line 1110
    const/4 v14, 0x0

    .line 1111
    :goto_27
    invoke-interface/range {v30 .. v30}, Lm84;->b()Z

    .line 1112
    .line 1113
    .line 1114
    invoke-interface/range {v30 .. v30}, Lm84;->b()Z

    .line 1115
    .line 1116
    .line 1117
    iget-object v6, v0, Lky2;->h:Lwv4;

    .line 1118
    .line 1119
    invoke-interface/range {v30 .. v30}, Lm84;->g()J

    .line 1120
    .line 1121
    .line 1122
    move-result-wide v7

    .line 1123
    invoke-interface {v6, v7, v8}, Lwv4;->d(J)V

    .line 1124
    .line 1125
    .line 1126
    move-object/from16 v6, v30

    .line 1127
    .line 1128
    :goto_28
    iput-object v6, v0, Lky2;->r:Lq84;

    .line 1129
    .line 1130
    iget-object v7, v0, Lky2;->g:Lm51;

    .line 1131
    .line 1132
    invoke-interface {v7, v6}, Lm51;->w(Lm84;)V

    .line 1133
    .line 1134
    .line 1135
    iget-object v6, v0, Lky2;->k:Lqv2;

    .line 1136
    .line 1137
    iget-object v7, v0, Lky2;->l:Lqv2;

    .line 1138
    .line 1139
    if-eqz v6, :cond_35

    .line 1140
    .line 1141
    if-eqz v7, :cond_34

    .line 1142
    .line 1143
    invoke-virtual {v6, v7}, Lqv2;->b(Lqv2;)Lqv2;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v6

    .line 1147
    :cond_34
    move-object v7, v6

    .line 1148
    :cond_35
    new-instance v6, Lsb1;

    .line 1149
    .line 1150
    invoke-direct {v6}, Lsb1;-><init>()V

    .line 1151
    .line 1152
    .line 1153
    const-string v8, "audio/mpeg"

    .line 1154
    .line 1155
    invoke-static {v8}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v8

    .line 1159
    iput-object v8, v6, Lsb1;->l:Ljava/lang/String;

    .line 1160
    .line 1161
    iget-object v8, v3, Lwy2;->g:Ljava/io/Serializable;

    .line 1162
    .line 1163
    check-cast v8, Ljava/lang/String;

    .line 1164
    .line 1165
    invoke-static {v8}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v8

    .line 1169
    iput-object v8, v6, Lsb1;->m:Ljava/lang/String;

    .line 1170
    .line 1171
    const/16 v8, 0x1000

    .line 1172
    .line 1173
    iput v8, v6, Lsb1;->n:I

    .line 1174
    .line 1175
    iget v8, v3, Lwy2;->d:I

    .line 1176
    .line 1177
    iput v8, v6, Lsb1;->E:I

    .line 1178
    .line 1179
    iget v8, v3, Lwy2;->c:I

    .line 1180
    .line 1181
    iput v8, v6, Lsb1;->F:I

    .line 1182
    .line 1183
    iget v8, v5, Lzg1;->a:I

    .line 1184
    .line 1185
    iput v8, v6, Lsb1;->H:I

    .line 1186
    .line 1187
    iget v5, v5, Lzg1;->b:I

    .line 1188
    .line 1189
    iput v5, v6, Lsb1;->I:I

    .line 1190
    .line 1191
    iput-object v7, v6, Lsb1;->k:Lqv2;

    .line 1192
    .line 1193
    iget-object v5, v0, Lky2;->r:Lq84;

    .line 1194
    .line 1195
    invoke-interface {v5}, Lq84;->f()I

    .line 1196
    .line 1197
    .line 1198
    move-result v5

    .line 1199
    const v7, -0x7fffffff

    .line 1200
    .line 1201
    .line 1202
    if-eq v5, v7, :cond_36

    .line 1203
    .line 1204
    iget-object v5, v0, Lky2;->r:Lq84;

    .line 1205
    .line 1206
    invoke-interface {v5}, Lq84;->f()I

    .line 1207
    .line 1208
    .line 1209
    move-result v5

    .line 1210
    iput v5, v6, Lsb1;->h:I

    .line 1211
    .line 1212
    :cond_36
    iget-object v5, v0, Lky2;->i:Lwv4;

    .line 1213
    .line 1214
    new-instance v7, Ltb1;

    .line 1215
    .line 1216
    invoke-direct {v7, v6}, Ltb1;-><init>(Lsb1;)V

    .line 1217
    .line 1218
    .line 1219
    invoke-interface {v5, v7}, Lwv4;->g(Ltb1;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1223
    .line 1224
    .line 1225
    move-result-wide v5

    .line 1226
    iput-wide v5, v0, Lky2;->o:J

    .line 1227
    .line 1228
    const-wide/16 v7, 0x0

    .line 1229
    .line 1230
    goto :goto_29

    .line 1231
    :cond_37
    move-object v3, v7

    .line 1232
    move-object v2, v8

    .line 1233
    move v4, v9

    .line 1234
    const/16 p2, 0x0

    .line 1235
    .line 1236
    const-wide/32 v17, 0xf4240

    .line 1237
    .line 1238
    .line 1239
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    iget-wide v5, v0, Lky2;->o:J

    .line 1245
    .line 1246
    const-wide/16 v7, 0x0

    .line 1247
    .line 1248
    cmp-long v5, v5, v7

    .line 1249
    .line 1250
    if-eqz v5, :cond_38

    .line 1251
    .line 1252
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1253
    .line 1254
    .line 1255
    move-result-wide v5

    .line 1256
    iget-wide v9, v0, Lky2;->o:J

    .line 1257
    .line 1258
    cmp-long v11, v5, v9

    .line 1259
    .line 1260
    if-gez v11, :cond_38

    .line 1261
    .line 1262
    sub-long/2addr v9, v5

    .line 1263
    long-to-int v5, v9

    .line 1264
    invoke-interface {v1, v5}, Ll51;->l(I)V

    .line 1265
    .line 1266
    .line 1267
    :cond_38
    :goto_29
    iget v5, v0, Lky2;->q:I

    .line 1268
    .line 1269
    if-nez v5, :cond_3e

    .line 1270
    .line 1271
    invoke-interface {v1}, Ll51;->k()V

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual/range {p0 .. p1}, Lky2;->h(Ll51;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v5

    .line 1278
    if-eqz v5, :cond_39

    .line 1279
    .line 1280
    goto/16 :goto_2d

    .line 1281
    .line 1282
    :cond_39
    invoke-virtual {v2, v14}, Lbe3;->N(I)V

    .line 1283
    .line 1284
    .line 1285
    invoke-virtual {v2}, Lbe3;->m()I

    .line 1286
    .line 1287
    .line 1288
    move-result v2

    .line 1289
    iget v5, v0, Lky2;->j:I

    .line 1290
    .line 1291
    int-to-long v5, v5

    .line 1292
    const v9, -0x1f400

    .line 1293
    .line 1294
    .line 1295
    and-int/2addr v9, v2

    .line 1296
    int-to-long v9, v9

    .line 1297
    const-wide/32 v11, -0x1f400

    .line 1298
    .line 1299
    .line 1300
    and-long/2addr v5, v11

    .line 1301
    cmp-long v5, v9, v5

    .line 1302
    .line 1303
    if-nez v5, :cond_3d

    .line 1304
    .line 1305
    invoke-static {v2}, Ljz4;->v(I)I

    .line 1306
    .line 1307
    .line 1308
    move-result v5

    .line 1309
    const/4 v6, -0x1

    .line 1310
    if-ne v5, v6, :cond_3a

    .line 1311
    .line 1312
    goto :goto_2a

    .line 1313
    :cond_3a
    invoke-virtual {v3, v2}, Lwy2;->a(I)Z

    .line 1314
    .line 1315
    .line 1316
    iget-wide v5, v0, Lky2;->m:J

    .line 1317
    .line 1318
    cmp-long v2, v5, v21

    .line 1319
    .line 1320
    if-nez v2, :cond_3b

    .line 1321
    .line 1322
    iget-object v2, v0, Lky2;->r:Lq84;

    .line 1323
    .line 1324
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1325
    .line 1326
    .line 1327
    move-result-wide v5

    .line 1328
    invoke-interface {v2, v5, v6}, Lq84;->c(J)J

    .line 1329
    .line 1330
    .line 1331
    move-result-wide v5

    .line 1332
    iput-wide v5, v0, Lky2;->m:J

    .line 1333
    .line 1334
    iget-wide v5, v0, Lky2;->a:J

    .line 1335
    .line 1336
    cmp-long v2, v5, v21

    .line 1337
    .line 1338
    if-eqz v2, :cond_3b

    .line 1339
    .line 1340
    iget-object v2, v0, Lky2;->r:Lq84;

    .line 1341
    .line 1342
    invoke-interface {v2, v7, v8}, Lq84;->c(J)J

    .line 1343
    .line 1344
    .line 1345
    move-result-wide v7

    .line 1346
    iget-wide v9, v0, Lky2;->m:J

    .line 1347
    .line 1348
    sub-long/2addr v5, v7

    .line 1349
    add-long/2addr v5, v9

    .line 1350
    iput-wide v5, v0, Lky2;->m:J

    .line 1351
    .line 1352
    :cond_3b
    iget v2, v3, Lwy2;->b:I

    .line 1353
    .line 1354
    iput v2, v0, Lky2;->q:I

    .line 1355
    .line 1356
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 1357
    .line 1358
    .line 1359
    move-result-wide v5

    .line 1360
    iget v2, v3, Lwy2;->b:I

    .line 1361
    .line 1362
    int-to-long v7, v2

    .line 1363
    add-long/2addr v5, v7

    .line 1364
    iput-wide v5, v0, Lky2;->p:J

    .line 1365
    .line 1366
    iget-object v2, v0, Lky2;->r:Lq84;

    .line 1367
    .line 1368
    instance-of v2, v2, Lvx1;

    .line 1369
    .line 1370
    if-nez v2, :cond_3c

    .line 1371
    .line 1372
    goto :goto_2c

    .line 1373
    :cond_3c
    iget-wide v0, v0, Lky2;->n:J

    .line 1374
    .line 1375
    iget v2, v3, Lwy2;->f:I

    .line 1376
    .line 1377
    int-to-long v4, v2

    .line 1378
    add-long/2addr v0, v4

    .line 1379
    mul-long v0, v0, v17

    .line 1380
    .line 1381
    iget v2, v3, Lwy2;->c:I

    .line 1382
    .line 1383
    int-to-long v2, v2

    .line 1384
    div-long/2addr v0, v2

    .line 1385
    throw p2

    .line 1386
    :cond_3d
    :goto_2a
    invoke-interface {v1, v4}, Ll51;->l(I)V

    .line 1387
    .line 1388
    .line 1389
    iput v14, v0, Lky2;->j:I

    .line 1390
    .line 1391
    :goto_2b
    const/4 v6, -0x1

    .line 1392
    goto :goto_2e

    .line 1393
    :cond_3e
    :goto_2c
    iget-object v2, v0, Lky2;->i:Lwv4;

    .line 1394
    .line 1395
    iget v5, v0, Lky2;->q:I

    .line 1396
    .line 1397
    invoke-interface {v2, v1, v5, v4}, Lwv4;->f(Lwh0;IZ)I

    .line 1398
    .line 1399
    .line 1400
    move-result v1

    .line 1401
    const/4 v6, -0x1

    .line 1402
    if-ne v1, v6, :cond_3f

    .line 1403
    .line 1404
    :goto_2d
    const/4 v6, -0x1

    .line 1405
    const/4 v14, -0x1

    .line 1406
    goto :goto_2e

    .line 1407
    :cond_3f
    iget v2, v0, Lky2;->q:I

    .line 1408
    .line 1409
    sub-int/2addr v2, v1

    .line 1410
    iput v2, v0, Lky2;->q:I

    .line 1411
    .line 1412
    if-lez v2, :cond_40

    .line 1413
    .line 1414
    goto :goto_2b

    .line 1415
    :cond_40
    iget-object v4, v0, Lky2;->i:Lwv4;

    .line 1416
    .line 1417
    iget-wide v1, v0, Lky2;->n:J

    .line 1418
    .line 1419
    iget-wide v5, v0, Lky2;->m:J

    .line 1420
    .line 1421
    mul-long v1, v1, v17

    .line 1422
    .line 1423
    iget v7, v3, Lwy2;->c:I

    .line 1424
    .line 1425
    int-to-long v7, v7

    .line 1426
    div-long/2addr v1, v7

    .line 1427
    add-long/2addr v5, v1

    .line 1428
    iget v8, v3, Lwy2;->b:I

    .line 1429
    .line 1430
    const/4 v9, 0x0

    .line 1431
    const/4 v10, 0x0

    .line 1432
    const/4 v7, 0x1

    .line 1433
    invoke-interface/range {v4 .. v10}, Lwv4;->a(JIIILvv4;)V

    .line 1434
    .line 1435
    .line 1436
    iget-wide v1, v0, Lky2;->n:J

    .line 1437
    .line 1438
    iget v4, v3, Lwy2;->f:I

    .line 1439
    .line 1440
    int-to-long v4, v4

    .line 1441
    add-long/2addr v1, v4

    .line 1442
    iput-wide v1, v0, Lky2;->n:J

    .line 1443
    .line 1444
    iput v14, v0, Lky2;->q:I

    .line 1445
    .line 1446
    goto :goto_2b

    .line 1447
    :goto_2e
    if-ne v14, v6, :cond_42

    .line 1448
    .line 1449
    iget-object v1, v0, Lky2;->r:Lq84;

    .line 1450
    .line 1451
    instance-of v2, v1, Lvx1;

    .line 1452
    .line 1453
    if-eqz v2, :cond_42

    .line 1454
    .line 1455
    iget-wide v4, v0, Lky2;->n:J

    .line 1456
    .line 1457
    iget-wide v6, v0, Lky2;->m:J

    .line 1458
    .line 1459
    mul-long v4, v4, v17

    .line 1460
    .line 1461
    iget v2, v3, Lwy2;->c:I

    .line 1462
    .line 1463
    int-to-long v2, v2

    .line 1464
    div-long/2addr v4, v2

    .line 1465
    add-long/2addr v4, v6

    .line 1466
    invoke-interface {v1}, Lm84;->g()J

    .line 1467
    .line 1468
    .line 1469
    move-result-wide v1

    .line 1470
    cmp-long v1, v1, v4

    .line 1471
    .line 1472
    if-nez v1, :cond_41

    .line 1473
    .line 1474
    goto :goto_2f

    .line 1475
    :cond_41
    iget-object v0, v0, Lky2;->r:Lq84;

    .line 1476
    .line 1477
    check-cast v0, Lvx1;

    .line 1478
    .line 1479
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1480
    .line 1481
    .line 1482
    throw p2

    .line 1483
    :cond_42
    :goto_2f
    return v14
.end method

.method public final c(Ll51;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lky2;->i(Ll51;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public final d(JJ)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lky2;->j:I

    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lky2;->m:J

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iput-wide v0, p0, Lky2;->n:J

    .line 14
    .line 15
    iput p1, p0, Lky2;->q:I

    .line 16
    .line 17
    const-wide/16 p1, -0x1

    .line 18
    .line 19
    iput-wide p1, p0, Lky2;->p:J

    .line 20
    .line 21
    iput-wide p3, p0, Lky2;->u:J

    .line 22
    .line 23
    iget-object p0, p0, Lky2;->r:Lq84;

    .line 24
    .line 25
    instance-of p0, p0, Lvx1;

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public final f(Lm51;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lky2;->g:Lm51;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lm51;->t(II)Lwv4;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lky2;->h:Lwv4;

    .line 10
    .line 11
    iput-object p1, p0, Lky2;->i:Lwv4;

    .line 12
    .line 13
    iget-object p0, p0, Lky2;->g:Lm51;

    .line 14
    .line 15
    invoke-interface {p0}, Lm51;->p()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final g()V
    .locals 10

    .line 1
    iget-object v0, p0, Lky2;->r:Lq84;

    .line 2
    .line 3
    instance-of v1, v0, Leb0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Leb0;

    .line 8
    .line 9
    invoke-virtual {v0}, Leb0;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-wide v0, p0, Lky2;->p:J

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lky2;->r:Lq84;

    .line 24
    .line 25
    invoke-interface {v2}, Lq84;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lky2;->r:Lq84;

    .line 34
    .line 35
    check-cast v0, Leb0;

    .line 36
    .line 37
    iget-wide v2, p0, Lky2;->p:J

    .line 38
    .line 39
    new-instance v1, Leb0;

    .line 40
    .line 41
    iget-wide v4, v0, Leb0;->i:J

    .line 42
    .line 43
    iget v6, v0, Leb0;->j:I

    .line 44
    .line 45
    iget v7, v0, Leb0;->k:I

    .line 46
    .line 47
    iget-boolean v8, v0, Leb0;->l:Z

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    invoke-direct/range {v1 .. v9}, Leb0;-><init>(JJIIZZ)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lky2;->r:Lq84;

    .line 54
    .line 55
    iget-object v0, p0, Lky2;->g:Lm51;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Lky2;->r:Lq84;

    .line 61
    .line 62
    invoke-interface {v0, v1}, Lm51;->w(Lm84;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lky2;->h:Lwv4;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, Lky2;->r:Lq84;

    .line 71
    .line 72
    invoke-interface {p0}, Lm84;->g()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    invoke-interface {v0, v1, v2}, Lwv4;->d(J)V

    .line 77
    .line 78
    .line 79
    :cond_0
    return-void
.end method

.method public final h(Ll51;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lky2;->r:Lq84;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lq84;->a()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Ll51;->f()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, 0x4

    .line 21
    .line 22
    sub-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object p0, p0, Lky2;->b:Lbe3;

    .line 29
    .line 30
    iget-object p0, p0, Lbe3;->a:[B

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const/4 v2, 0x4

    .line 34
    invoke-interface {p1, p0, v0, v2, v1}, Ll51;->e([BIIZ)Z

    .line 35
    .line 36
    .line 37
    move-result p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    xor-int/2addr p0, v1

    .line 39
    return p0

    .line 40
    :catch_0
    :goto_0
    return v1
.end method

.method public final i(Ll51;Z)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1}, Ll51;->k()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v2, v2, v4

    .line 15
    .line 16
    const/high16 v3, 0x20000

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-nez v2, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iget-object v5, v0, Lky2;->e:Lov1;

    .line 23
    .line 24
    invoke-virtual {v5, v1, v2, v3}, Lov1;->a(Ll51;Lkv1;I)Lqv2;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, v0, Lky2;->k:Lqv2;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    iget-object v5, v0, Lky2;->d:Lzg1;

    .line 33
    .line 34
    invoke-virtual {v5, v2}, Lzg1;->b(Lqv2;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-interface {v1}, Ll51;->f()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    long-to-int v2, v5

    .line 42
    if-nez p2, :cond_1

    .line 43
    .line 44
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    move v5, v4

    .line 48
    :goto_0
    move v6, v5

    .line 49
    move v7, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v2, v4

    .line 52
    move v5, v2

    .line 53
    goto :goto_0

    .line 54
    :goto_1
    invoke-virtual/range {p0 .. p1}, Lky2;->h(Ll51;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    const/4 v9, 0x1

    .line 59
    if-eqz v8, :cond_4

    .line 60
    .line 61
    if-lez v6, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {v0}, Lky2;->g()V

    .line 65
    .line 66
    .line 67
    new-instance v0, Ljava/io/EOFException;

    .line 68
    .line 69
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_4
    iget-object v8, v0, Lky2;->b:Lbe3;

    .line 74
    .line 75
    invoke-virtual {v8, v4}, Lbe3;->N(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v8}, Lbe3;->m()I

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v5, :cond_5

    .line 83
    .line 84
    int-to-long v10, v5

    .line 85
    const v12, -0x1f400

    .line 86
    .line 87
    .line 88
    and-int/2addr v12, v8

    .line 89
    int-to-long v12, v12

    .line 90
    const-wide/32 v14, -0x1f400

    .line 91
    .line 92
    .line 93
    and-long/2addr v10, v14

    .line 94
    cmp-long v10, v12, v10

    .line 95
    .line 96
    if-nez v10, :cond_6

    .line 97
    .line 98
    :cond_5
    invoke-static {v8}, Ljz4;->v(I)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    const/4 v11, -0x1

    .line 103
    if-ne v10, v11, :cond_a

    .line 104
    .line 105
    :cond_6
    add-int/lit8 v5, v7, 0x1

    .line 106
    .line 107
    if-ne v7, v3, :cond_8

    .line 108
    .line 109
    if-eqz p2, :cond_7

    .line 110
    .line 111
    return v4

    .line 112
    :cond_7
    invoke-virtual {v0}, Lky2;->g()V

    .line 113
    .line 114
    .line 115
    new-instance v0, Ljava/io/EOFException;

    .line 116
    .line 117
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 118
    .line 119
    .line 120
    throw v0

    .line 121
    :cond_8
    if-eqz p2, :cond_9

    .line 122
    .line 123
    invoke-interface {v1}, Ll51;->k()V

    .line 124
    .line 125
    .line 126
    add-int v6, v2, v5

    .line 127
    .line 128
    invoke-interface {v1, v6}, Ll51;->g(I)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_9
    invoke-interface {v1, v9}, Ll51;->l(I)V

    .line 133
    .line 134
    .line 135
    :goto_2
    move v6, v4

    .line 136
    move v7, v5

    .line 137
    move v5, v6

    .line 138
    goto :goto_1

    .line 139
    :cond_a
    add-int/lit8 v6, v6, 0x1

    .line 140
    .line 141
    if-ne v6, v9, :cond_b

    .line 142
    .line 143
    iget-object v5, v0, Lky2;->c:Lwy2;

    .line 144
    .line 145
    invoke-virtual {v5, v8}, Lwy2;->a(I)Z

    .line 146
    .line 147
    .line 148
    move v5, v8

    .line 149
    goto :goto_5

    .line 150
    :cond_b
    const/4 v8, 0x4

    .line 151
    if-ne v6, v8, :cond_d

    .line 152
    .line 153
    :goto_3
    if-eqz p2, :cond_c

    .line 154
    .line 155
    add-int/2addr v2, v7

    .line 156
    invoke-interface {v1, v2}, Ll51;->l(I)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_c
    invoke-interface {v1}, Ll51;->k()V

    .line 161
    .line 162
    .line 163
    :goto_4
    iput v5, v0, Lky2;->j:I

    .line 164
    .line 165
    return v9

    .line 166
    :cond_d
    :goto_5
    add-int/lit8 v10, v10, -0x4

    .line 167
    .line 168
    invoke-interface {v1, v10}, Ll51;->g(I)V

    .line 169
    .line 170
    .line 171
    goto :goto_1
.end method
