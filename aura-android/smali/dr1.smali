.class public final Ldr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr02;


# instance fields
.field public final a:Lfz0;

.field public volatile b:Lcr1;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lfz0;->e0:Lfz0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ldr1;->a:Lfz0;

    .line 7
    .line 8
    sget-object v0, Lcr1;->n:Lcr1;

    .line 9
    .line 10
    iput-object v0, p0, Ldr1;->b:Lcr1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lev3;)Lk14;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ldr1;->b:Lcr1;

    .line 6
    .line 7
    iget-object v3, v0, Lev3;->e:Loz3;

    .line 8
    .line 9
    sget-object v4, Lcr1;->n:Lcr1;

    .line 10
    .line 11
    if-ne v2, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lev3;->b(Loz3;)Lk14;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v4, Lcr1;->p:Lcr1;

    .line 19
    .line 20
    const/4 v6, 0x1

    .line 21
    if-ne v2, v4, :cond_1

    .line 22
    .line 23
    move v4, v6

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v4, 0x0

    .line 26
    :goto_0
    if-nez v4, :cond_3

    .line 27
    .line 28
    sget-object v7, Lcr1;->o:Lcr1;

    .line 29
    .line 30
    if-ne v2, v7, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/4 v6, 0x0

    .line 34
    :cond_3
    :goto_1
    iget-object v2, v3, Loz3;->d:Ltz3;

    .line 35
    .line 36
    iget-object v7, v0, Lev3;->d:Ly10;

    .line 37
    .line 38
    if-eqz v7, :cond_4

    .line 39
    .line 40
    invoke-virtual {v7}, Ly10;->e()Lcv3;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    goto :goto_2

    .line 45
    :cond_4
    const/4 v7, 0x0

    .line 46
    :goto_2
    new-instance v9, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v10, "--> "

    .line 49
    .line 50
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v10, v3, Loz3;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const/16 v10, 0x20

    .line 59
    .line 60
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v10, v3, Loz3;->a:Lgr1;

    .line 64
    .line 65
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v10, v10, Lgr1;->i:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v10, " "

    .line 74
    .line 75
    const-string v11, ""

    .line 76
    .line 77
    if-eqz v7, :cond_5

    .line 78
    .line 79
    new-instance v12, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v12, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object v7, v7, Lcv3;->h:Lpr3;

    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move-object v7, v11

    .line 98
    :goto_3
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    const-string v9, "-byte body)"

    .line 106
    .line 107
    const-string v12, " ("

    .line 108
    .line 109
    if-nez v6, :cond_6

    .line 110
    .line 111
    if-eqz v2, :cond_6

    .line 112
    .line 113
    invoke-static {v7, v12}, Lb11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v2}, Ltz3;->contentLength()J

    .line 118
    .line 119
    .line 120
    move-result-wide v13

    .line 121
    invoke-virtual {v7, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    :cond_6
    iget-object v13, v1, Ldr1;->a:Lfz0;

    .line 132
    .line 133
    invoke-virtual {v13, v7}, Lfz0;->k(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const-string v7, "identity"

    .line 137
    .line 138
    const-string v13, "-byte body omitted)"

    .line 139
    .line 140
    const-string v14, "Content-Encoding"

    .line 141
    .line 142
    const-string v15, "gzip"

    .line 143
    .line 144
    const-wide/16 v16, -0x1

    .line 145
    .line 146
    if-eqz v6, :cond_16

    .line 147
    .line 148
    iget-object v5, v3, Loz3;->c:Ltl1;

    .line 149
    .line 150
    if-eqz v2, :cond_9

    .line 151
    .line 152
    invoke-virtual {v2}, Ltz3;->contentType()Lhu2;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    move/from16 v18, v4

    .line 157
    .line 158
    if-eqz v8, :cond_7

    .line 159
    .line 160
    const-string v4, "Content-Type"

    .line 161
    .line 162
    invoke-virtual {v5, v4}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    if-nez v4, :cond_7

    .line 167
    .line 168
    iget-object v4, v1, Ldr1;->a:Lfz0;

    .line 169
    .line 170
    move/from16 v19, v6

    .line 171
    .line 172
    new-instance v6, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    move-object/from16 v20, v10

    .line 175
    .line 176
    const-string v10, "Content-Type: "

    .line 177
    .line 178
    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    invoke-virtual {v4, v6}, Lfz0;->k(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_7
    move/from16 v19, v6

    .line 193
    .line 194
    move-object/from16 v20, v10

    .line 195
    .line 196
    :goto_4
    invoke-virtual {v2}, Ltz3;->contentLength()J

    .line 197
    .line 198
    .line 199
    move-result-wide v21

    .line 200
    cmp-long v4, v21, v16

    .line 201
    .line 202
    if-eqz v4, :cond_8

    .line 203
    .line 204
    const-string v4, "Content-Length"

    .line 205
    .line 206
    invoke-virtual {v5, v4}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-nez v4, :cond_8

    .line 211
    .line 212
    iget-object v4, v1, Ldr1;->a:Lfz0;

    .line 213
    .line 214
    new-instance v6, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    const-string v8, "Content-Length: "

    .line 217
    .line 218
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    move-object v10, v9

    .line 222
    invoke-virtual {v2}, Ltz3;->contentLength()J

    .line 223
    .line 224
    .line 225
    move-result-wide v8

    .line 226
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    invoke-virtual {v4, v6}, Lfz0;->k(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_8
    :goto_5
    move-object v10, v9

    .line 238
    goto :goto_6

    .line 239
    :cond_9
    move/from16 v18, v4

    .line 240
    .line 241
    move/from16 v19, v6

    .line 242
    .line 243
    move-object/from16 v20, v10

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :goto_6
    invoke-virtual {v5}, Ltl1;->size()I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    const/4 v6, 0x0

    .line 251
    :goto_7
    if-ge v6, v4, :cond_a

    .line 252
    .line 253
    invoke-virtual {v1, v5, v6}, Ldr1;->b(Ltl1;I)V

    .line 254
    .line 255
    .line 256
    add-int/lit8 v6, v6, 0x1

    .line 257
    .line 258
    goto :goto_7

    .line 259
    :cond_a
    const-string v4, "--> END "

    .line 260
    .line 261
    if-eqz v18, :cond_15

    .line 262
    .line 263
    if-nez v2, :cond_b

    .line 264
    .line 265
    goto/16 :goto_a

    .line 266
    .line 267
    :cond_b
    iget-object v6, v3, Loz3;->c:Ltl1;

    .line 268
    .line 269
    invoke-virtual {v6, v14}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    if-nez v6, :cond_c

    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_c
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-nez v8, :cond_d

    .line 281
    .line 282
    invoke-virtual {v6, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_d

    .line 287
    .line 288
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 289
    .line 290
    new-instance v5, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 296
    .line 297
    const-string v6, " (encoded body omitted)"

    .line 298
    .line 299
    invoke-static {v5, v4, v6}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_b

    .line 307
    .line 308
    :cond_d
    :goto_8
    invoke-virtual {v2}, Ltz3;->isDuplex()Z

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    if-eqz v6, :cond_e

    .line 313
    .line 314
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 315
    .line 316
    new-instance v5, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 322
    .line 323
    const-string v6, " (duplex request body omitted)"

    .line 324
    .line 325
    invoke-static {v5, v4, v6}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_b

    .line 333
    .line 334
    :cond_e
    invoke-virtual {v2}, Ltz3;->isOneShot()Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-eqz v6, :cond_f

    .line 339
    .line 340
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 341
    .line 342
    new-instance v5, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 348
    .line 349
    const-string v6, " (one-shot body omitted)"

    .line 350
    .line 351
    invoke-static {v5, v4, v6}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    goto/16 :goto_b

    .line 359
    .line 360
    :cond_f
    new-instance v6, Ltv;

    .line 361
    .line 362
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v6}, Ltz3;->writeTo(Lew;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5, v14}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    invoke-virtual {v15, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    if-eqz v5, :cond_10

    .line 377
    .line 378
    iget-wide v8, v6, Ltv;->o:J

    .line 379
    .line 380
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 381
    .line 382
    .line 383
    move-result-object v5

    .line 384
    new-instance v8, Ltk1;

    .line 385
    .line 386
    invoke-direct {v8, v6}, Ltk1;-><init>(Lej4;)V

    .line 387
    .line 388
    .line 389
    :try_start_0
    new-instance v6, Ltv;

    .line 390
    .line 391
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v6, v8}, Ltv;->p(Lej4;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 395
    .line 396
    .line 397
    invoke-virtual {v8}, Ltk1;->close()V

    .line 398
    .line 399
    .line 400
    goto :goto_9

    .line 401
    :catchall_0
    move-exception v0

    .line 402
    move-object v1, v0

    .line 403
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 404
    :catchall_1
    move-exception v0

    .line 405
    invoke-static {v8, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :cond_10
    const/4 v5, 0x0

    .line 410
    :goto_9
    invoke-virtual {v2}, Ltz3;->contentType()Lhu2;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    if-eqz v8, :cond_11

    .line 415
    .line 416
    invoke-static {v8}, Lhu2;->a(Lhu2;)Ljava/nio/charset/Charset;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    if-nez v8, :cond_12

    .line 421
    .line 422
    :cond_11
    sget-object v8, Lw10;->a:Ljava/nio/charset/Charset;

    .line 423
    .line 424
    :cond_12
    iget-object v9, v1, Ldr1;->a:Lfz0;

    .line 425
    .line 426
    invoke-virtual {v9, v11}, Lfz0;->k(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v6}, Luc5;->z(Ltv;)Z

    .line 430
    .line 431
    .line 432
    move-result v9

    .line 433
    move-object/from16 v21, v2

    .line 434
    .line 435
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 436
    .line 437
    if-nez v9, :cond_13

    .line 438
    .line 439
    new-instance v5, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    const-string v4, " (binary "

    .line 450
    .line 451
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v21 .. v21}, Ltz3;->contentLength()J

    .line 455
    .line 456
    .line 457
    move-result-wide v8

    .line 458
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v4

    .line 468
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_13
    if-eqz v5, :cond_14

    .line 473
    .line 474
    new-instance v8, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    iget-wide v9, v6, Ltv;->o:J

    .line 488
    .line 489
    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    const-string v4, "-byte, "

    .line 493
    .line 494
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    const-string v4, "-gzipped-byte body)"

    .line 501
    .line 502
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    goto :goto_b

    .line 513
    :cond_14
    invoke-virtual {v6, v8}, Ltv;->B(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    invoke-virtual {v2, v5}, Lfz0;->k(Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 521
    .line 522
    new-instance v5, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 528
    .line 529
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v21 .. v21}, Ltz3;->contentLength()J

    .line 536
    .line 537
    .line 538
    move-result-wide v8

    .line 539
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_15
    :goto_a
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 554
    .line 555
    new-instance v5, Ljava/lang/StringBuilder;

    .line 556
    .line 557
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 561
    .line 562
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v4

    .line 569
    invoke-virtual {v2, v4}, Lfz0;->k(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    goto :goto_b

    .line 573
    :cond_16
    move/from16 v18, v4

    .line 574
    .line 575
    move/from16 v19, v6

    .line 576
    .line 577
    move-object/from16 v20, v10

    .line 578
    .line 579
    :goto_b
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 580
    .line 581
    .line 582
    move-result-wide v4

    .line 583
    :try_start_2
    invoke-virtual {v0, v3}, Lev3;->b(Loz3;)Lk14;

    .line 584
    .line 585
    .line 586
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 587
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 588
    .line 589
    .line 590
    move-result-wide v2

    .line 591
    sub-long/2addr v2, v4

    .line 592
    const-wide/32 v8, 0xf4240

    .line 593
    .line 594
    .line 595
    div-long/2addr v2, v8

    .line 596
    iget-object v6, v0, Lk14;->t:Ln14;

    .line 597
    .line 598
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    move-wide/from16 v21, v8

    .line 602
    .line 603
    invoke-virtual {v6}, Ln14;->contentLength()J

    .line 604
    .line 605
    .line 606
    move-result-wide v8

    .line 607
    cmp-long v10, v8, v16

    .line 608
    .line 609
    move-wide/from16 v16, v4

    .line 610
    .line 611
    const-string v4, "-byte"

    .line 612
    .line 613
    if-eqz v10, :cond_17

    .line 614
    .line 615
    new-instance v5, Ljava/lang/StringBuilder;

    .line 616
    .line 617
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v5

    .line 630
    goto :goto_c

    .line 631
    :cond_17
    const-string v5, "unknown-length"

    .line 632
    .line 633
    :goto_c
    iget-object v10, v1, Ldr1;->a:Lfz0;

    .line 634
    .line 635
    move-object/from16 p1, v6

    .line 636
    .line 637
    new-instance v6, Ljava/lang/StringBuilder;

    .line 638
    .line 639
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 640
    .line 641
    .line 642
    move-wide/from16 v23, v8

    .line 643
    .line 644
    new-instance v8, Ljava/lang/StringBuilder;

    .line 645
    .line 646
    const-string v9, "<-- "

    .line 647
    .line 648
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    iget v9, v0, Lk14;->q:I

    .line 652
    .line 653
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v8

    .line 660
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 661
    .line 662
    .line 663
    iget-object v8, v0, Lk14;->p:Ljava/lang/String;

    .line 664
    .line 665
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 666
    .line 667
    .line 668
    move-result v8

    .line 669
    if-lez v8, :cond_18

    .line 670
    .line 671
    new-instance v8, Ljava/lang/StringBuilder;

    .line 672
    .line 673
    move-object/from16 v9, v20

    .line 674
    .line 675
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    move-object/from16 v20, v4

    .line 679
    .line 680
    iget-object v4, v0, Lk14;->p:Ljava/lang/String;

    .line 681
    .line 682
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v4

    .line 689
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    goto :goto_d

    .line 693
    :cond_18
    move-object/from16 v9, v20

    .line 694
    .line 695
    move-object/from16 v20, v4

    .line 696
    .line 697
    :goto_d
    new-instance v4, Ljava/lang/StringBuilder;

    .line 698
    .line 699
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    iget-object v8, v0, Lk14;->n:Loz3;

    .line 703
    .line 704
    iget-object v8, v8, Loz3;->a:Lgr1;

    .line 705
    .line 706
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    iget-object v8, v8, Lgr1;->i:Ljava/lang/String;

    .line 710
    .line 711
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    const-string v2, "ms"

    .line 721
    .line 722
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    .line 731
    .line 732
    const-string v2, ", "

    .line 733
    .line 734
    if-nez v19, :cond_19

    .line 735
    .line 736
    new-instance v3, Ljava/lang/StringBuilder;

    .line 737
    .line 738
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    .line 743
    .line 744
    const-string v4, " body"

    .line 745
    .line 746
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    :cond_19
    const-string v3, ")"

    .line 757
    .line 758
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-virtual {v10, v3}, Lfz0;->k(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    if-eqz v19, :cond_26

    .line 769
    .line 770
    iget-object v3, v0, Lk14;->s:Ltl1;

    .line 771
    .line 772
    invoke-virtual {v3}, Ltl1;->size()I

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    const/4 v5, 0x0

    .line 777
    :goto_e
    if-ge v5, v4, :cond_1a

    .line 778
    .line 779
    invoke-virtual {v1, v3, v5}, Ldr1;->b(Ltl1;I)V

    .line 780
    .line 781
    .line 782
    add-int/lit8 v5, v5, 0x1

    .line 783
    .line 784
    goto :goto_e

    .line 785
    :cond_1a
    if-eqz v18, :cond_25

    .line 786
    .line 787
    invoke-static {v0}, Lbr1;->a(Lk14;)Z

    .line 788
    .line 789
    .line 790
    move-result v4

    .line 791
    if-nez v4, :cond_1b

    .line 792
    .line 793
    goto/16 :goto_11

    .line 794
    .line 795
    :cond_1b
    iget-object v4, v0, Lk14;->s:Ltl1;

    .line 796
    .line 797
    invoke-virtual {v4, v14}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    if-nez v4, :cond_1c

    .line 802
    .line 803
    goto :goto_f

    .line 804
    :cond_1c
    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 805
    .line 806
    .line 807
    move-result v5

    .line 808
    if-nez v5, :cond_1d

    .line 809
    .line 810
    invoke-virtual {v4, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 811
    .line 812
    .line 813
    move-result v4

    .line 814
    if-nez v4, :cond_1d

    .line 815
    .line 816
    iget-object v1, v1, Ldr1;->a:Lfz0;

    .line 817
    .line 818
    const-string v2, "<-- END HTTP (encoded body omitted)"

    .line 819
    .line 820
    invoke-virtual {v1, v2}, Lfz0;->k(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    return-object v0

    .line 824
    :cond_1d
    :goto_f
    iget-object v4, v0, Lk14;->t:Ln14;

    .line 825
    .line 826
    invoke-virtual {v4}, Ln14;->contentType()Lhu2;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    if-eqz v4, :cond_1e

    .line 831
    .line 832
    iget-object v5, v4, Lhu2;->b:Ljava/lang/String;

    .line 833
    .line 834
    const-string v6, "text"

    .line 835
    .line 836
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    if-eqz v5, :cond_1e

    .line 841
    .line 842
    iget-object v4, v4, Lhu2;->c:Ljava/lang/String;

    .line 843
    .line 844
    const-string v5, "event-stream"

    .line 845
    .line 846
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    if-eqz v4, :cond_1e

    .line 851
    .line 852
    iget-object v1, v1, Ldr1;->a:Lfz0;

    .line 853
    .line 854
    const-string v2, "<-- END HTTP (streaming)"

    .line 855
    .line 856
    invoke-virtual {v1, v2}, Lfz0;->k(Ljava/lang/String;)V

    .line 857
    .line 858
    .line 859
    return-object v0

    .line 860
    :cond_1e
    invoke-virtual/range {p1 .. p1}, Ln14;->source()Lfw;

    .line 861
    .line 862
    .line 863
    move-result-object v4

    .line 864
    const-wide v5, 0x7fffffffffffffffL

    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    invoke-interface {v4, v5, v6}, Lfw;->G(J)Z

    .line 870
    .line 871
    .line 872
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 873
    .line 874
    .line 875
    move-result-wide v5

    .line 876
    sub-long v5, v5, v16

    .line 877
    .line 878
    div-long v5, v5, v21

    .line 879
    .line 880
    invoke-interface {v4}, Lfw;->a()Ltv;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    invoke-virtual {v3, v14}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    invoke-virtual {v15, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 889
    .line 890
    .line 891
    move-result v3

    .line 892
    if-eqz v3, :cond_1f

    .line 893
    .line 894
    iget-wide v7, v4, Ltv;->o:J

    .line 895
    .line 896
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 897
    .line 898
    .line 899
    move-result-object v8

    .line 900
    new-instance v3, Ltk1;

    .line 901
    .line 902
    invoke-virtual {v4}, Ltv;->f()Ltv;

    .line 903
    .line 904
    .line 905
    move-result-object v4

    .line 906
    invoke-direct {v3, v4}, Ltk1;-><init>(Lej4;)V

    .line 907
    .line 908
    .line 909
    :try_start_3
    new-instance v4, Ltv;

    .line 910
    .line 911
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v4, v3}, Ltv;->p(Lej4;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 915
    .line 916
    .line 917
    invoke-virtual {v3}, Ltk1;->close()V

    .line 918
    .line 919
    .line 920
    goto :goto_10

    .line 921
    :catchall_2
    move-exception v0

    .line 922
    move-object v1, v0

    .line 923
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 924
    :catchall_3
    move-exception v0

    .line 925
    invoke-static {v3, v1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 926
    .line 927
    .line 928
    throw v0

    .line 929
    :cond_1f
    const/4 v8, 0x0

    .line 930
    :goto_10
    invoke-virtual/range {p1 .. p1}, Ln14;->contentType()Lhu2;

    .line 931
    .line 932
    .line 933
    move-result-object v3

    .line 934
    if-eqz v3, :cond_20

    .line 935
    .line 936
    invoke-static {v3}, Lhu2;->a(Lhu2;)Ljava/nio/charset/Charset;

    .line 937
    .line 938
    .line 939
    move-result-object v3

    .line 940
    if-nez v3, :cond_21

    .line 941
    .line 942
    :cond_20
    sget-object v3, Lw10;->a:Ljava/nio/charset/Charset;

    .line 943
    .line 944
    :cond_21
    invoke-static {v4}, Luc5;->z(Ltv;)Z

    .line 945
    .line 946
    .line 947
    move-result v7

    .line 948
    const-string v9, "<-- END HTTP ("

    .line 949
    .line 950
    if-nez v7, :cond_22

    .line 951
    .line 952
    iget-object v2, v1, Ldr1;->a:Lfz0;

    .line 953
    .line 954
    invoke-virtual {v2, v11}, Lfz0;->k(Ljava/lang/String;)V

    .line 955
    .line 956
    .line 957
    iget-object v1, v1, Ldr1;->a:Lfz0;

    .line 958
    .line 959
    new-instance v2, Ljava/lang/StringBuilder;

    .line 960
    .line 961
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 965
    .line 966
    .line 967
    const-string v3, "ms, binary "

    .line 968
    .line 969
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 970
    .line 971
    .line 972
    iget-wide v3, v4, Ltv;->o:J

    .line 973
    .line 974
    invoke-static {v2, v3, v4, v13}, Lb11;->p(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v2

    .line 978
    invoke-virtual {v1, v2}, Lfz0;->k(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    return-object v0

    .line 982
    :cond_22
    const-wide/16 v12, 0x0

    .line 983
    .line 984
    cmp-long v7, v23, v12

    .line 985
    .line 986
    if-eqz v7, :cond_23

    .line 987
    .line 988
    iget-object v7, v1, Ldr1;->a:Lfz0;

    .line 989
    .line 990
    invoke-virtual {v7, v11}, Lfz0;->k(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    iget-object v7, v1, Ldr1;->a:Lfz0;

    .line 994
    .line 995
    invoke-virtual {v4}, Ltv;->f()Ltv;

    .line 996
    .line 997
    .line 998
    move-result-object v10

    .line 999
    invoke-virtual {v10, v3}, Ltv;->B(Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    invoke-virtual {v7, v3}, Lfz0;->k(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    :cond_23
    iget-object v1, v1, Ldr1;->a:Lfz0;

    .line 1007
    .line 1008
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1009
    .line 1010
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1014
    .line 1015
    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    .line 1021
    const-string v5, "ms, "

    .line 1022
    .line 1023
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1024
    .line 1025
    .line 1026
    iget-wide v4, v4, Ltv;->o:J

    .line 1027
    .line 1028
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    move-object/from16 v4, v20

    .line 1032
    .line 1033
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v4

    .line 1040
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    if-eqz v8, :cond_24

    .line 1044
    .line 1045
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1051
    .line 1052
    .line 1053
    const-string v2, "-gzipped-byte"

    .line 1054
    .line 1055
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1063
    .line 1064
    .line 1065
    :cond_24
    const-string v2, " body)"

    .line 1066
    .line 1067
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1068
    .line 1069
    .line 1070
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v2

    .line 1074
    invoke-virtual {v1, v2}, Lfz0;->k(Ljava/lang/String;)V

    .line 1075
    .line 1076
    .line 1077
    return-object v0

    .line 1078
    :cond_25
    :goto_11
    iget-object v1, v1, Ldr1;->a:Lfz0;

    .line 1079
    .line 1080
    const-string v2, "<-- END HTTP"

    .line 1081
    .line 1082
    invoke-virtual {v1, v2}, Lfz0;->k(Ljava/lang/String;)V

    .line 1083
    .line 1084
    .line 1085
    :cond_26
    return-object v0

    .line 1086
    :catch_0
    move-exception v0

    .line 1087
    iget-object v1, v1, Ldr1;->a:Lfz0;

    .line 1088
    .line 1089
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1090
    .line 1091
    const-string v3, "<-- HTTP FAILED: "

    .line 1092
    .line 1093
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    invoke-virtual {v1, v2}, Lfz0;->k(Ljava/lang/String;)V

    .line 1104
    .line 1105
    .line 1106
    throw v0
.end method

.method public final b(Ltl1;I)V
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Ltl1;->b(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, p2}, Ltl1;->e(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ltl1;->b(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p1, ": "

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p0, p0, Ldr1;->a:Lfz0;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lfz0;->k(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
