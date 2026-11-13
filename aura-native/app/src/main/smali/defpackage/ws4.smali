.class public final synthetic Ldefpackage/ws4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/ys4;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ys4;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ws4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ws4;->o:Ldefpackage/ys4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ws4;->n:I

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/ws4;->o:Ldefpackage/ys4;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v4, v0, Ldefpackage/ys4;->L:Ldefpackage/xs4;

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-boolean v1, v4, Ldefpackage/xs4;->c:Z

    .line 25
    .line 26
    invoke-static {v0}, Ldefpackage/fu;->C(Ldefpackage/g94;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ldefpackage/g12;->A(Ldefpackage/u62;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Ldefpackage/jz4;->z(Ldefpackage/rv0;)V

    .line 33
    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, Ldefpackage/he;

    .line 44
    .line 45
    iget-object v3, v1, Ldefpackage/he;->o:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, v0, Ldefpackage/ys4;->L:Ldefpackage/xs4;

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    iget-object v2, v1, Ldefpackage/xs4;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v3, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iput-object v3, v1, Ldefpackage/xs4;->b:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v1, v1, Ldefpackage/xs4;->d:Ldefpackage/rd3;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object v2, v0, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 67
    .line 68
    iget-object v4, v0, Ldefpackage/ys4;->D:Ldefpackage/ha1;

    .line 69
    .line 70
    iget v5, v0, Ldefpackage/ys4;->E:I

    .line 71
    .line 72
    iget-boolean v6, v0, Ldefpackage/ys4;->F:Z

    .line 73
    .line 74
    iget v7, v0, Ldefpackage/ys4;->G:I

    .line 75
    .line 76
    iget v8, v0, Ldefpackage/ys4;->H:I

    .line 77
    .line 78
    iput-object v3, v1, Ldefpackage/rd3;->a:Ljava/lang/String;

    .line 79
    .line 80
    iput-object v2, v1, Ldefpackage/rd3;->b:Ldefpackage/zs4;

    .line 81
    .line 82
    iput-object v4, v1, Ldefpackage/rd3;->c:Ldefpackage/ha1;

    .line 83
    .line 84
    iput v5, v1, Ldefpackage/rd3;->d:I

    .line 85
    .line 86
    iput-boolean v6, v1, Ldefpackage/rd3;->e:Z

    .line 87
    .line 88
    iput v7, v1, Ldefpackage/rd3;->f:I

    .line 89
    .line 90
    iput v8, v1, Ldefpackage/rd3;->g:I

    .line 91
    .line 92
    iget-wide v2, v1, Ldefpackage/rd3;->q:J

    .line 93
    .line 94
    const/4 v4, 0x2

    .line 95
    shl-long/2addr v2, v4

    .line 96
    const-wide/16 v4, 0x2

    .line 97
    .line 98
    or-long/2addr v2, v4

    .line 99
    iput-wide v2, v1, Ldefpackage/rd3;->q:J

    .line 100
    .line 101
    invoke-virtual {v1}, Ldefpackage/rd3;->b()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    new-instance v1, Ldefpackage/xs4;

    .line 106
    .line 107
    iget-object v2, v0, Ldefpackage/ys4;->B:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v1, v2, v3}, Ldefpackage/xs4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v2, Ldefpackage/rd3;

    .line 113
    .line 114
    iget-object v4, v0, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 115
    .line 116
    iget-object v5, v0, Ldefpackage/ys4;->D:Ldefpackage/ha1;

    .line 117
    .line 118
    iget v6, v0, Ldefpackage/ys4;->E:I

    .line 119
    .line 120
    iget-boolean v7, v0, Ldefpackage/ys4;->F:Z

    .line 121
    .line 122
    iget v8, v0, Ldefpackage/ys4;->G:I

    .line 123
    .line 124
    iget v9, v0, Ldefpackage/ys4;->H:I

    .line 125
    .line 126
    invoke-direct/range {v2 .. v9}, Ldefpackage/rd3;-><init>(Ljava/lang/String;Ldefpackage/zs4;Ldefpackage/ha1;IZII)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ldefpackage/ys4;->q0()Ldefpackage/rd3;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget-object v3, v3, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Ldefpackage/rd3;->c(Ldefpackage/oo0;)V

    .line 136
    .line 137
    .line 138
    iput-object v2, v1, Ldefpackage/xs4;->d:Ldefpackage/rd3;

    .line 139
    .line 140
    iput-object v1, v0, Ldefpackage/ys4;->L:Ldefpackage/xs4;

    .line 141
    .line 142
    :cond_3
    :goto_1
    invoke-static {v0}, Ldefpackage/fu;->C(Ldefpackage/g94;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Ldefpackage/g12;->A(Ldefpackage/u62;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v0}, Ldefpackage/jz4;->z(Ldefpackage/rv0;)V

    .line 149
    .line 150
    .line 151
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_1
    move-object/from16 v1, p1

    .line 155
    .line 156
    check-cast v1, Ljava/util/List;

    .line 157
    .line 158
    invoke-virtual {v0}, Ldefpackage/ys4;->q0()Ldefpackage/rd3;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iget-object v0, v0, Ldefpackage/ys4;->C:Ldefpackage/zs4;

    .line 163
    .line 164
    sget-wide v5, Ldefpackage/x40;->g:J

    .line 165
    .line 166
    invoke-static {v0, v5, v6}, Ldefpackage/zs4;->a(Ldefpackage/zs4;J)Ldefpackage/zs4;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    iget-object v15, v4, Ldefpackage/rd3;->o:Ldefpackage/r62;

    .line 171
    .line 172
    if-nez v15, :cond_4

    .line 173
    .line 174
    :goto_2
    const/4 v5, 0x0

    .line 175
    const/4 v7, 0x0

    .line 176
    goto/16 :goto_d

    .line 177
    .line 178
    :cond_4
    iget-object v14, v4, Ldefpackage/rd3;->i:Ldefpackage/oo0;

    .line 179
    .line 180
    if-nez v14, :cond_5

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    new-instance v8, Ldefpackage/he;

    .line 184
    .line 185
    iget-object v5, v4, Ldefpackage/rd3;->a:Ljava/lang/String;

    .line 186
    .line 187
    invoke-direct {v8, v5}, Ldefpackage/he;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object v5, v4, Ldefpackage/rd3;->j:Ldefpackage/ic;

    .line 191
    .line 192
    if-nez v5, :cond_6

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    iget-object v5, v4, Ldefpackage/rd3;->n:Ldefpackage/qd3;

    .line 196
    .line 197
    if-nez v5, :cond_7

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_7
    iget-wide v5, v4, Ldefpackage/rd3;->p:J

    .line 201
    .line 202
    const-wide v10, -0x1fffffffdL

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    and-long v17, v5, v10

    .line 208
    .line 209
    new-instance v5, Ldefpackage/ms4;

    .line 210
    .line 211
    new-instance v7, Ldefpackage/ls4;

    .line 212
    .line 213
    iget v11, v4, Ldefpackage/rd3;->f:I

    .line 214
    .line 215
    iget-boolean v12, v4, Ldefpackage/rd3;->e:Z

    .line 216
    .line 217
    iget v13, v4, Ldefpackage/rd3;->d:I

    .line 218
    .line 219
    iget-object v6, v4, Ldefpackage/rd3;->c:Ldefpackage/ha1;

    .line 220
    .line 221
    sget-object v10, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 222
    .line 223
    move-object/from16 v16, v6

    .line 224
    .line 225
    invoke-direct/range {v7 .. v18}, Ldefpackage/ls4;-><init>(Ldefpackage/he;Ldefpackage/zs4;Ljava/util/List;IZILdefpackage/oo0;Ldefpackage/r62;Ldefpackage/ha1;J)V

    .line 226
    .line 227
    .line 228
    move-object v6, v7

    .line 229
    new-instance v15, Ldefpackage/fd;

    .line 230
    .line 231
    new-instance v7, Ldefpackage/bq4;

    .line 232
    .line 233
    move v13, v12

    .line 234
    move-object v11, v14

    .line 235
    move-object/from16 v12, v16

    .line 236
    .line 237
    invoke-direct/range {v7 .. v13}, Ldefpackage/bq4;-><init>(Ldefpackage/he;Ldefpackage/zs4;Ljava/util/List;Ldefpackage/oo0;Ldefpackage/ha1;Z)V

    .line 238
    .line 239
    .line 240
    iget v8, v4, Ldefpackage/rd3;->f:I

    .line 241
    .line 242
    iget v12, v4, Ldefpackage/rd3;->d:I

    .line 243
    .line 244
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 245
    .line 246
    .line 247
    iput-object v7, v15, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 248
    .line 249
    iput v8, v15, Ldefpackage/fd;->a:I

    .line 250
    .line 251
    invoke-static/range {v17 .. v18}, Ldefpackage/nc0;->j(J)I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    if-nez v8, :cond_8

    .line 256
    .line 257
    invoke-static/range {v17 .. v18}, Ldefpackage/nc0;->i(J)I

    .line 258
    .line 259
    .line 260
    move-result v8

    .line 261
    if-nez v8, :cond_8

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_8
    const-string v8, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 265
    .line 266
    invoke-static {v8}, Ldefpackage/dz1;->a(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :goto_3
    new-instance v8, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    iget-object v7, v7, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v7, Ljava/util/ArrayList;

    .line 277
    .line 278
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    const/16 v16, 0x0

    .line 283
    .line 284
    move/from16 v11, v16

    .line 285
    .line 286
    const/4 v10, 0x0

    .line 287
    const/16 v23, 0x0

    .line 288
    .line 289
    :goto_4
    if-ge v10, v9, :cond_c

    .line 290
    .line 291
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    check-cast v13, Ldefpackage/pd3;

    .line 296
    .line 297
    move v14, v10

    .line 298
    iget-object v10, v13, Ldefpackage/pd3;->a:Ldefpackage/mc;

    .line 299
    .line 300
    invoke-static/range {v17 .. v18}, Ldefpackage/nc0;->h(J)I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    invoke-static/range {v17 .. v18}, Ldefpackage/nc0;->c(J)Z

    .line 305
    .line 306
    .line 307
    move-result v19

    .line 308
    if-eqz v19, :cond_a

    .line 309
    .line 310
    invoke-static/range {v17 .. v18}, Ldefpackage/nc0;->g(J)I

    .line 311
    .line 312
    .line 313
    move-result v19

    .line 314
    move-object/from16 p0, v4

    .line 315
    .line 316
    float-to-double v3, v11

    .line 317
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    .line 318
    .line 319
    .line 320
    move-result-wide v3

    .line 321
    double-to-float v3, v3

    .line 322
    float-to-int v3, v3

    .line 323
    sub-int v19, v19, v3

    .line 324
    .line 325
    if-gez v19, :cond_9

    .line 326
    .line 327
    const/16 v19, 0x0

    .line 328
    .line 329
    :cond_9
    :goto_5
    move/from16 v3, v19

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_a
    move-object/from16 p0, v4

    .line 333
    .line 334
    invoke-static/range {v17 .. v18}, Ldefpackage/nc0;->g(J)I

    .line 335
    .line 336
    .line 337
    move-result v19

    .line 338
    goto :goto_5

    .line 339
    :goto_6
    const/4 v4, 0x5

    .line 340
    invoke-static {v2, v3, v4}, Ldefpackage/qc0;->b(III)J

    .line 341
    .line 342
    .line 343
    move-result-wide v2

    .line 344
    iget v4, v15, Ldefpackage/fd;->a:I

    .line 345
    .line 346
    sub-int v4, v4, v23

    .line 347
    .line 348
    new-instance v20, Ldefpackage/ic;

    .line 349
    .line 350
    move/from16 v25, v11

    .line 351
    .line 352
    move v11, v4

    .line 353
    move-object v4, v13

    .line 354
    move-wide/from16 v27, v2

    .line 355
    .line 356
    move v2, v9

    .line 357
    move v3, v14

    .line 358
    move-object/from16 v9, v20

    .line 359
    .line 360
    move-wide/from16 v13, v27

    .line 361
    .line 362
    invoke-direct/range {v9 .. v14}, Ldefpackage/ic;-><init>(Ldefpackage/mc;IIJ)V

    .line 363
    .line 364
    .line 365
    iget v10, v9, Ldefpackage/ic;->f:F

    .line 366
    .line 367
    add-float v26, v25, v10

    .line 368
    .line 369
    iget-object v10, v9, Ldefpackage/ic;->d:Ldefpackage/ks4;

    .line 370
    .line 371
    iget v11, v10, Ldefpackage/ks4;->f:I

    .line 372
    .line 373
    add-int v24, v23, v11

    .line 374
    .line 375
    new-instance v19, Ldefpackage/od3;

    .line 376
    .line 377
    iget v11, v4, Ldefpackage/pd3;->b:I

    .line 378
    .line 379
    iget v4, v4, Ldefpackage/pd3;->c:I

    .line 380
    .line 381
    move/from16 v22, v4

    .line 382
    .line 383
    move/from16 v21, v11

    .line 384
    .line 385
    invoke-direct/range {v19 .. v26}, Ldefpackage/od3;-><init>(Ldefpackage/ic;IIIIFF)V

    .line 386
    .line 387
    .line 388
    move-object/from16 v9, v19

    .line 389
    .line 390
    move/from16 v4, v24

    .line 391
    .line 392
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    iget-boolean v9, v10, Ldefpackage/ks4;->d:Z

    .line 396
    .line 397
    if-nez v9, :cond_d

    .line 398
    .line 399
    iget v9, v15, Ldefpackage/fd;->a:I

    .line 400
    .line 401
    if-ne v4, v9, :cond_b

    .line 402
    .line 403
    iget-object v9, v15, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v9, Ldefpackage/bq4;

    .line 406
    .line 407
    iget-object v9, v9, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v9, Ljava/util/ArrayList;

    .line 410
    .line 411
    invoke-static {v9}, Ldefpackage/gb;->E(Ljava/util/List;)I

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-eq v3, v9, :cond_b

    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_b
    add-int/lit8 v10, v3, 0x1

    .line 419
    .line 420
    move v9, v2

    .line 421
    move/from16 v23, v4

    .line 422
    .line 423
    move/from16 v11, v26

    .line 424
    .line 425
    move-object/from16 v4, p0

    .line 426
    .line 427
    goto/16 :goto_4

    .line 428
    .line 429
    :cond_c
    move-object/from16 p0, v4

    .line 430
    .line 431
    move/from16 v4, v23

    .line 432
    .line 433
    :cond_d
    :goto_7
    iput v4, v15, Ldefpackage/fd;->b:I

    .line 434
    .line 435
    iput-object v8, v15, Ldefpackage/fd;->e:Ljava/lang/Object;

    .line 436
    .line 437
    new-instance v2, Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    const/4 v4, 0x0

    .line 451
    :goto_8
    if-ge v4, v3, :cond_10

    .line 452
    .line 453
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    check-cast v7, Ldefpackage/od3;

    .line 458
    .line 459
    iget-object v9, v7, Ldefpackage/od3;->a:Ldefpackage/ic;

    .line 460
    .line 461
    iget-object v9, v9, Ldefpackage/ic;->g:Ljava/util/List;

    .line 462
    .line 463
    new-instance v10, Ljava/util/ArrayList;

    .line 464
    .line 465
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 466
    .line 467
    .line 468
    move-result v11

    .line 469
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 473
    .line 474
    .line 475
    move-result v11

    .line 476
    const/4 v12, 0x0

    .line 477
    :goto_9
    if-ge v12, v11, :cond_f

    .line 478
    .line 479
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v13

    .line 483
    check-cast v13, Ldefpackage/wv3;

    .line 484
    .line 485
    if-eqz v13, :cond_e

    .line 486
    .line 487
    iget v14, v7, Ldefpackage/od3;->f:F

    .line 488
    .line 489
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    move/from16 v17, v3

    .line 494
    .line 495
    move/from16 v18, v4

    .line 496
    .line 497
    int-to-long v3, v0

    .line 498
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    move-wide/from16 v19, v3

    .line 503
    .line 504
    int-to-long v3, v0

    .line 505
    const/16 v0, 0x20

    .line 506
    .line 507
    shl-long v19, v19, v0

    .line 508
    .line 509
    const-wide v21, 0xffffffffL

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    and-long v3, v3, v21

    .line 515
    .line 516
    or-long v3, v19, v3

    .line 517
    .line 518
    invoke-virtual {v13, v3, v4}, Ldefpackage/wv3;->f(J)Ldefpackage/wv3;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    goto :goto_a

    .line 523
    :cond_e
    move/from16 v17, v3

    .line 524
    .line 525
    move/from16 v18, v4

    .line 526
    .line 527
    const/4 v0, 0x0

    .line 528
    :goto_a
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    add-int/lit8 v12, v12, 0x1

    .line 532
    .line 533
    move/from16 v3, v17

    .line 534
    .line 535
    move/from16 v4, v18

    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_f
    move/from16 v17, v3

    .line 539
    .line 540
    move/from16 v18, v4

    .line 541
    .line 542
    invoke-static {v10, v2}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 543
    .line 544
    .line 545
    add-int/lit8 v4, v18, 0x1

    .line 546
    .line 547
    goto :goto_8

    .line 548
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    iget-object v3, v15, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v3, Ldefpackage/bq4;

    .line 555
    .line 556
    iget-object v3, v3, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v3, Ljava/util/List;

    .line 559
    .line 560
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    if-ge v0, v3, :cond_12

    .line 565
    .line 566
    iget-object v0, v15, Ldefpackage/fd;->c:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v0, Ldefpackage/bq4;

    .line 569
    .line 570
    iget-object v0, v0, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v0, Ljava/util/List;

    .line 573
    .line 574
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 579
    .line 580
    .line 581
    move-result v3

    .line 582
    sub-int/2addr v0, v3

    .line 583
    new-instance v3, Ljava/util/ArrayList;

    .line 584
    .line 585
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 586
    .line 587
    .line 588
    const/4 v4, 0x0

    .line 589
    :goto_b
    const/4 v7, 0x0

    .line 590
    if-ge v4, v0, :cond_11

    .line 591
    .line 592
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    add-int/lit8 v4, v4, 0x1

    .line 596
    .line 597
    goto :goto_b

    .line 598
    :cond_11
    invoke-static {v2, v3}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    goto :goto_c

    .line 603
    :cond_12
    const/4 v7, 0x0

    .line 604
    :goto_c
    iput-object v2, v15, Ldefpackage/fd;->d:Ljava/lang/Object;

    .line 605
    .line 606
    move-object/from16 v0, p0

    .line 607
    .line 608
    iget-wide v2, v0, Ldefpackage/rd3;->l:J

    .line 609
    .line 610
    invoke-direct {v5, v6, v15, v2, v3}, Ldefpackage/ms4;-><init>(Ldefpackage/ls4;Ldefpackage/fd;J)V

    .line 611
    .line 612
    .line 613
    :goto_d
    if-eqz v5, :cond_13

    .line 614
    .line 615
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 616
    .line 617
    .line 618
    move-object v0, v5

    .line 619
    goto :goto_e

    .line 620
    :cond_13
    move-object v0, v7

    .line 621
    :goto_e
    if-eqz v0, :cond_14

    .line 622
    .line 623
    const/4 v2, 0x1

    .line 624
    goto :goto_f

    .line 625
    :cond_14
    const/4 v2, 0x0

    .line 626
    :goto_f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    return-object v0

    .line 631
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
