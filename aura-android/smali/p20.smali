.class public final synthetic Lp20;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Lr20;

.field public final synthetic o:J

.field public final synthetic p:J

.field public final synthetic q:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lr20;JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp20;->n:Lr20;

    .line 5
    .line 6
    iput-wide p2, p0, Lp20;->o:J

    .line 7
    .line 8
    iput-wide p4, p0, Lp20;->p:J

    .line 9
    .line 10
    iput-object p6, p0, Lp20;->q:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lp20;->o:J

    .line 4
    .line 5
    iget-wide v3, v0, Lp20;->p:J

    .line 6
    .line 7
    move-object/from16 v5, p1

    .line 8
    .line 9
    check-cast v5, Lx34;

    .line 10
    .line 11
    iget-object v6, v0, Lp20;->n:Lr20;

    .line 12
    .line 13
    iget-object v6, v6, Lr20;->q:Ljava/lang/Object;

    .line 14
    .line 15
    const-string v6, "SELECT * FROM chronology WHERE timestamp >= ? AND timestamp < ? AND server == ? GROUP BY id ORDER BY COUNT(id) DESC LIMIT 20"

    .line 16
    .line 17
    invoke-interface {v5, v6}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const/4 v6, 0x1

    .line 22
    :try_start_0
    invoke-interface {v5, v6, v1, v2}, Lz34;->c(IJ)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    invoke-interface {v5, v1, v3, v4}, Lz34;->c(IJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    iget-object v0, v0, Lp20;->q:Ljava/lang/String;

    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    :try_start_1
    invoke-interface {v5, v1}, Lz34;->e(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_2f

    .line 40
    .line 41
    :cond_0
    invoke-interface {v5, v1, v0}, Lz34;->r(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    const-string v0, "id"

    .line 45
    .line 46
    invoke-static {v5, v0}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const-string v1, "timestamp"

    .line 51
    .line 52
    invoke-static {v5, v1}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const-string v2, "server"

    .line 57
    .line 58
    invoke-static {v5, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    const-string v3, "parent_id"

    .line 63
    .line 64
    invoke-static {v5, v3}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const-string v4, "is_dir"

    .line 69
    .line 70
    invoke-static {v5, v4}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const-string v7, "title"

    .line 75
    .line 76
    invoke-static {v5, v7}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    const-string v8, "album"

    .line 81
    .line 82
    invoke-static {v5, v8}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    const-string v9, "artist"

    .line 87
    .line 88
    invoke-static {v5, v9}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    const-string v10, "track"

    .line 93
    .line 94
    invoke-static {v5, v10}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    const-string v11, "year"

    .line 99
    .line 100
    invoke-static {v5, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    const-string v12, "genre"

    .line 105
    .line 106
    invoke-static {v5, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    const-string v13, "cover_art_id"

    .line 111
    .line 112
    invoke-static {v5, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    const-string v14, "size"

    .line 117
    .line 118
    invoke-static {v5, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    const-string v15, "content_type"

    .line 123
    .line 124
    invoke-static {v5, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    const-string v6, "suffix"

    .line 129
    .line 130
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    move/from16 p0, v6

    .line 135
    .line 136
    const-string v6, "transcoding_content_type"

    .line 137
    .line 138
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    move/from16 v16, v6

    .line 143
    .line 144
    const-string v6, "transcoded_suffix"

    .line 145
    .line 146
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    move/from16 v17, v6

    .line 151
    .line 152
    const-string v6, "duration"

    .line 153
    .line 154
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    move/from16 v18, v6

    .line 159
    .line 160
    const-string v6, "bitrate"

    .line 161
    .line 162
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    move/from16 v19, v6

    .line 167
    .line 168
    const-string v6, "sampling_rate"

    .line 169
    .line 170
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    move/from16 v20, v6

    .line 175
    .line 176
    const-string v6, "bit_depth"

    .line 177
    .line 178
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    move/from16 v21, v6

    .line 183
    .line 184
    const-string v6, "path"

    .line 185
    .line 186
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    move/from16 v22, v6

    .line 191
    .line 192
    const-string v6, "is_video"

    .line 193
    .line 194
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    move/from16 v23, v6

    .line 199
    .line 200
    const-string v6, "user_rating"

    .line 201
    .line 202
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    move/from16 v24, v6

    .line 207
    .line 208
    const-string v6, "average_rating"

    .line 209
    .line 210
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v6

    .line 214
    move/from16 v25, v6

    .line 215
    .line 216
    const-string v6, "play_count"

    .line 217
    .line 218
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    move/from16 v26, v6

    .line 223
    .line 224
    const-string v6, "disc_number"

    .line 225
    .line 226
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    move/from16 v27, v6

    .line 231
    .line 232
    const-string v6, "created"

    .line 233
    .line 234
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    move/from16 v28, v6

    .line 239
    .line 240
    const-string v6, "starred"

    .line 241
    .line 242
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    move/from16 v29, v6

    .line 247
    .line 248
    const-string v6, "album_id"

    .line 249
    .line 250
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    move/from16 v30, v6

    .line 255
    .line 256
    const-string v6, "artist_id"

    .line 257
    .line 258
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    move/from16 v31, v6

    .line 263
    .line 264
    const-string v6, "type"

    .line 265
    .line 266
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    move/from16 v32, v6

    .line 271
    .line 272
    const-string v6, "bookmark_position"

    .line 273
    .line 274
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    move/from16 v33, v6

    .line 279
    .line 280
    const-string v6, "original_width"

    .line 281
    .line 282
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    move/from16 v34, v6

    .line 287
    .line 288
    const-string v6, "original_height"

    .line 289
    .line 290
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    move/from16 v35, v6

    .line 295
    .line 296
    const-string v6, "album_artist"

    .line 297
    .line 298
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    move/from16 v36, v6

    .line 303
    .line 304
    const-string v6, "rg_track_gain"

    .line 305
    .line 306
    invoke-static {v5, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    move/from16 v37, v15

    .line 311
    .line 312
    const-string v15, "rg_album_gain"

    .line 313
    .line 314
    invoke-static {v5, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v15

    .line 318
    move/from16 v38, v14

    .line 319
    .line 320
    const-string v14, "rg_track_peak"

    .line 321
    .line 322
    invoke-static {v5, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 323
    .line 324
    .line 325
    move-result v14

    .line 326
    move/from16 v39, v13

    .line 327
    .line 328
    const-string v13, "rg_album_peak"

    .line 329
    .line 330
    invoke-static {v5, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    move/from16 v40, v12

    .line 335
    .line 336
    const-string v12, "rg_base_gain"

    .line 337
    .line 338
    invoke-static {v5, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    move/from16 v41, v11

    .line 343
    .line 344
    const-string v11, "rg_fallback_gain"

    .line 345
    .line 346
    invoke-static {v5, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    move/from16 v42, v10

    .line 351
    .line 352
    new-instance v10, Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 355
    .line 356
    .line 357
    :goto_1
    invoke-interface {v5}, Lz34;->O()Z

    .line 358
    .line 359
    .line 360
    move-result v43

    .line 361
    if-eqz v43, :cond_2c

    .line 362
    .line 363
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 364
    .line 365
    .line 366
    move-result v43

    .line 367
    const/16 v44, 0x0

    .line 368
    .line 369
    if-eqz v43, :cond_1

    .line 370
    .line 371
    move/from16 v45, v0

    .line 372
    .line 373
    move-object/from16 v0, v44

    .line 374
    .line 375
    move/from16 v43, v9

    .line 376
    .line 377
    move-object/from16 v46, v10

    .line 378
    .line 379
    goto :goto_2

    .line 380
    :cond_1
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v43

    .line 384
    move/from16 v45, v0

    .line 385
    .line 386
    move-object/from16 v0, v43

    .line 387
    .line 388
    move-object/from16 v46, v10

    .line 389
    .line 390
    move/from16 v43, v9

    .line 391
    .line 392
    :goto_2
    invoke-interface {v5, v1}, Lz34;->getLong(I)J

    .line 393
    .line 394
    .line 395
    move-result-wide v9

    .line 396
    invoke-interface {v5, v2}, Lz34;->isNull(I)Z

    .line 397
    .line 398
    .line 399
    move-result v47

    .line 400
    if-eqz v47, :cond_2

    .line 401
    .line 402
    move/from16 v48, v1

    .line 403
    .line 404
    move-object/from16 v1, v44

    .line 405
    .line 406
    goto :goto_3

    .line 407
    :cond_2
    invoke-interface {v5, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v47

    .line 411
    move/from16 v48, v1

    .line 412
    .line 413
    move-object/from16 v1, v47

    .line 414
    .line 415
    :goto_3
    invoke-interface {v5, v6}, Lz34;->isNull(I)Z

    .line 416
    .line 417
    .line 418
    move-result v47

    .line 419
    if-eqz v47, :cond_4

    .line 420
    .line 421
    invoke-interface {v5, v15}, Lz34;->isNull(I)Z

    .line 422
    .line 423
    .line 424
    move-result v47

    .line 425
    if-eqz v47, :cond_4

    .line 426
    .line 427
    invoke-interface {v5, v14}, Lz34;->isNull(I)Z

    .line 428
    .line 429
    .line 430
    move-result v47

    .line 431
    if-eqz v47, :cond_4

    .line 432
    .line 433
    invoke-interface {v5, v13}, Lz34;->isNull(I)Z

    .line 434
    .line 435
    .line 436
    move-result v47

    .line 437
    if-eqz v47, :cond_4

    .line 438
    .line 439
    invoke-interface {v5, v12}, Lz34;->isNull(I)Z

    .line 440
    .line 441
    .line 442
    move-result v47

    .line 443
    if-eqz v47, :cond_4

    .line 444
    .line 445
    invoke-interface {v5, v11}, Lz34;->isNull(I)Z

    .line 446
    .line 447
    .line 448
    move-result v47

    .line 449
    if-nez v47, :cond_3

    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_3
    move/from16 v47, v7

    .line 453
    .line 454
    move/from16 v49, v8

    .line 455
    .line 456
    move-object/from16 v7, v44

    .line 457
    .line 458
    goto/16 :goto_b

    .line 459
    .line 460
    :cond_4
    :goto_4
    invoke-interface {v5, v6}, Lz34;->isNull(I)Z

    .line 461
    .line 462
    .line 463
    move-result v47

    .line 464
    if-eqz v47, :cond_5

    .line 465
    .line 466
    move/from16 v47, v7

    .line 467
    .line 468
    move/from16 v49, v8

    .line 469
    .line 470
    move-object/from16 v51, v44

    .line 471
    .line 472
    goto :goto_5

    .line 473
    :cond_5
    move/from16 v47, v7

    .line 474
    .line 475
    move/from16 v49, v8

    .line 476
    .line 477
    invoke-interface {v5, v6}, Lz34;->getDouble(I)D

    .line 478
    .line 479
    .line 480
    move-result-wide v7

    .line 481
    double-to-float v7, v7

    .line 482
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 483
    .line 484
    .line 485
    move-result-object v7

    .line 486
    move-object/from16 v51, v7

    .line 487
    .line 488
    :goto_5
    invoke-interface {v5, v15}, Lz34;->isNull(I)Z

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    if-eqz v7, :cond_6

    .line 493
    .line 494
    move-object/from16 v52, v44

    .line 495
    .line 496
    goto :goto_6

    .line 497
    :cond_6
    invoke-interface {v5, v15}, Lz34;->getDouble(I)D

    .line 498
    .line 499
    .line 500
    move-result-wide v7

    .line 501
    double-to-float v7, v7

    .line 502
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    move-object/from16 v52, v7

    .line 507
    .line 508
    :goto_6
    invoke-interface {v5, v14}, Lz34;->isNull(I)Z

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    if-eqz v7, :cond_7

    .line 513
    .line 514
    move-object/from16 v53, v44

    .line 515
    .line 516
    goto :goto_7

    .line 517
    :cond_7
    invoke-interface {v5, v14}, Lz34;->getDouble(I)D

    .line 518
    .line 519
    .line 520
    move-result-wide v7

    .line 521
    double-to-float v7, v7

    .line 522
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    move-object/from16 v53, v7

    .line 527
    .line 528
    :goto_7
    invoke-interface {v5, v13}, Lz34;->isNull(I)Z

    .line 529
    .line 530
    .line 531
    move-result v7

    .line 532
    if-eqz v7, :cond_8

    .line 533
    .line 534
    move-object/from16 v54, v44

    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_8
    invoke-interface {v5, v13}, Lz34;->getDouble(I)D

    .line 538
    .line 539
    .line 540
    move-result-wide v7

    .line 541
    double-to-float v7, v7

    .line 542
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 543
    .line 544
    .line 545
    move-result-object v7

    .line 546
    move-object/from16 v54, v7

    .line 547
    .line 548
    :goto_8
    invoke-interface {v5, v12}, Lz34;->isNull(I)Z

    .line 549
    .line 550
    .line 551
    move-result v7

    .line 552
    if-eqz v7, :cond_9

    .line 553
    .line 554
    move-object/from16 v55, v44

    .line 555
    .line 556
    goto :goto_9

    .line 557
    :cond_9
    invoke-interface {v5, v12}, Lz34;->getDouble(I)D

    .line 558
    .line 559
    .line 560
    move-result-wide v7

    .line 561
    double-to-float v7, v7

    .line 562
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    move-object/from16 v55, v7

    .line 567
    .line 568
    :goto_9
    invoke-interface {v5, v11}, Lz34;->isNull(I)Z

    .line 569
    .line 570
    .line 571
    move-result v7

    .line 572
    if-eqz v7, :cond_a

    .line 573
    .line 574
    move-object/from16 v56, v44

    .line 575
    .line 576
    goto :goto_a

    .line 577
    :cond_a
    invoke-interface {v5, v11}, Lz34;->getDouble(I)D

    .line 578
    .line 579
    .line 580
    move-result-wide v7

    .line 581
    double-to-float v7, v7

    .line 582
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    move-object/from16 v56, v7

    .line 587
    .line 588
    :goto_a
    new-instance v50, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 589
    .line 590
    invoke-direct/range {v50 .. v56}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 591
    .line 592
    .line 593
    move-object/from16 v7, v50

    .line 594
    .line 595
    :goto_b
    new-instance v8, Lcom/eddyizm/tempus/model/Chronology;

    .line 596
    .line 597
    invoke-direct {v8, v0, v9, v10, v1}, Lcom/eddyizm/tempus/model/Chronology;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 598
    .line 599
    .line 600
    invoke-interface {v5, v3}, Lz34;->isNull(I)Z

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    if-eqz v0, :cond_b

    .line 605
    .line 606
    move-object/from16 v0, v44

    .line 607
    .line 608
    goto :goto_c

    .line 609
    :cond_b
    invoke-interface {v5, v3}, Lz34;->D(I)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    :goto_c
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    invoke-interface {v5, v4}, Lz34;->getLong(I)J

    .line 617
    .line 618
    .line 619
    move-result-wide v0

    .line 620
    long-to-int v0, v0

    .line 621
    if-eqz v0, :cond_c

    .line 622
    .line 623
    const/4 v0, 0x1

    .line 624
    goto :goto_d

    .line 625
    :cond_c
    const/4 v0, 0x0

    .line 626
    :goto_d
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 627
    .line 628
    .line 629
    move/from16 v0, v47

    .line 630
    .line 631
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 632
    .line 633
    .line 634
    move-result v9

    .line 635
    if-eqz v9, :cond_d

    .line 636
    .line 637
    move-object/from16 v9, v44

    .line 638
    .line 639
    goto :goto_e

    .line 640
    :cond_d
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    :goto_e
    invoke-virtual {v8, v9}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 645
    .line 646
    .line 647
    move/from16 v9, v49

    .line 648
    .line 649
    invoke-interface {v5, v9}, Lz34;->isNull(I)Z

    .line 650
    .line 651
    .line 652
    move-result v10

    .line 653
    if-eqz v10, :cond_e

    .line 654
    .line 655
    move-object/from16 v10, v44

    .line 656
    .line 657
    goto :goto_f

    .line 658
    :cond_e
    invoke-interface {v5, v9}, Lz34;->D(I)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v10

    .line 662
    :goto_f
    invoke-virtual {v8, v10}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    move/from16 v10, v43

    .line 666
    .line 667
    invoke-interface {v5, v10}, Lz34;->isNull(I)Z

    .line 668
    .line 669
    .line 670
    move-result v43

    .line 671
    if-eqz v43, :cond_f

    .line 672
    .line 673
    move-object/from16 v1, v44

    .line 674
    .line 675
    goto :goto_10

    .line 676
    :cond_f
    invoke-interface {v5, v10}, Lz34;->D(I)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v43

    .line 680
    move-object/from16 v1, v43

    .line 681
    .line 682
    :goto_10
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    move/from16 v1, v42

    .line 686
    .line 687
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 688
    .line 689
    .line 690
    move-result v42

    .line 691
    if-eqz v42, :cond_10

    .line 692
    .line 693
    move/from16 v42, v2

    .line 694
    .line 695
    move/from16 v43, v3

    .line 696
    .line 697
    move-object/from16 v2, v44

    .line 698
    .line 699
    goto :goto_11

    .line 700
    :cond_10
    move/from16 v42, v2

    .line 701
    .line 702
    move/from16 v43, v3

    .line 703
    .line 704
    invoke-interface {v5, v1}, Lz34;->getLong(I)J

    .line 705
    .line 706
    .line 707
    move-result-wide v2

    .line 708
    long-to-int v2, v2

    .line 709
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    :goto_11
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 714
    .line 715
    .line 716
    move/from16 v2, v41

    .line 717
    .line 718
    invoke-interface {v5, v2}, Lz34;->isNull(I)Z

    .line 719
    .line 720
    .line 721
    move-result v3

    .line 722
    if-eqz v3, :cond_11

    .line 723
    .line 724
    move v3, v0

    .line 725
    move/from16 v41, v1

    .line 726
    .line 727
    move-object/from16 v0, v44

    .line 728
    .line 729
    goto :goto_12

    .line 730
    :cond_11
    move v3, v0

    .line 731
    move/from16 v41, v1

    .line 732
    .line 733
    invoke-interface {v5, v2}, Lz34;->getLong(I)J

    .line 734
    .line 735
    .line 736
    move-result-wide v0

    .line 737
    long-to-int v0, v0

    .line 738
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    :goto_12
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 743
    .line 744
    .line 745
    move/from16 v0, v40

    .line 746
    .line 747
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 748
    .line 749
    .line 750
    move-result v1

    .line 751
    if-eqz v1, :cond_12

    .line 752
    .line 753
    move-object/from16 v1, v44

    .line 754
    .line 755
    goto :goto_13

    .line 756
    :cond_12
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    :goto_13
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    move/from16 v1, v39

    .line 764
    .line 765
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 766
    .line 767
    .line 768
    move-result v39

    .line 769
    if-eqz v39, :cond_13

    .line 770
    .line 771
    move/from16 v40, v0

    .line 772
    .line 773
    move-object/from16 v0, v44

    .line 774
    .line 775
    goto :goto_14

    .line 776
    :cond_13
    invoke-interface {v5, v1}, Lz34;->D(I)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v39

    .line 780
    move/from16 v40, v0

    .line 781
    .line 782
    move-object/from16 v0, v39

    .line 783
    .line 784
    :goto_14
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    move/from16 v0, v38

    .line 788
    .line 789
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 790
    .line 791
    .line 792
    move-result v38

    .line 793
    if-eqz v38, :cond_14

    .line 794
    .line 795
    move/from16 v39, v0

    .line 796
    .line 797
    move-object/from16 v0, v44

    .line 798
    .line 799
    goto :goto_15

    .line 800
    :cond_14
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 801
    .line 802
    .line 803
    move-result-wide v38

    .line 804
    invoke-static/range {v38 .. v39}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 805
    .line 806
    .line 807
    move-result-object v38

    .line 808
    move/from16 v39, v0

    .line 809
    .line 810
    move-object/from16 v0, v38

    .line 811
    .line 812
    :goto_15
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 813
    .line 814
    .line 815
    move/from16 v0, v37

    .line 816
    .line 817
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 818
    .line 819
    .line 820
    move-result v37

    .line 821
    if-eqz v37, :cond_15

    .line 822
    .line 823
    move/from16 v38, v0

    .line 824
    .line 825
    move-object/from16 v0, v44

    .line 826
    .line 827
    goto :goto_16

    .line 828
    :cond_15
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v37

    .line 832
    move/from16 v38, v0

    .line 833
    .line 834
    move-object/from16 v0, v37

    .line 835
    .line 836
    :goto_16
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 837
    .line 838
    .line 839
    move/from16 v0, p0

    .line 840
    .line 841
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 842
    .line 843
    .line 844
    move-result v37

    .line 845
    if-eqz v37, :cond_16

    .line 846
    .line 847
    move/from16 p0, v0

    .line 848
    .line 849
    move-object/from16 v0, v44

    .line 850
    .line 851
    goto :goto_17

    .line 852
    :cond_16
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v37

    .line 856
    move/from16 p0, v0

    .line 857
    .line 858
    move-object/from16 v0, v37

    .line 859
    .line 860
    :goto_17
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    move/from16 v0, v16

    .line 864
    .line 865
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 866
    .line 867
    .line 868
    move-result v16

    .line 869
    if-eqz v16, :cond_17

    .line 870
    .line 871
    move/from16 v37, v0

    .line 872
    .line 873
    move-object/from16 v0, v44

    .line 874
    .line 875
    goto :goto_18

    .line 876
    :cond_17
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v16

    .line 880
    move/from16 v37, v0

    .line 881
    .line 882
    move-object/from16 v0, v16

    .line 883
    .line 884
    :goto_18
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 885
    .line 886
    .line 887
    move/from16 v0, v17

    .line 888
    .line 889
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 890
    .line 891
    .line 892
    move-result v16

    .line 893
    if-eqz v16, :cond_18

    .line 894
    .line 895
    move/from16 v17, v0

    .line 896
    .line 897
    move-object/from16 v0, v44

    .line 898
    .line 899
    goto :goto_19

    .line 900
    :cond_18
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v16

    .line 904
    move/from16 v17, v0

    .line 905
    .line 906
    move-object/from16 v0, v16

    .line 907
    .line 908
    :goto_19
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    move/from16 v0, v18

    .line 912
    .line 913
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 914
    .line 915
    .line 916
    move-result v16

    .line 917
    if-eqz v16, :cond_19

    .line 918
    .line 919
    move/from16 v18, v1

    .line 920
    .line 921
    move/from16 v16, v2

    .line 922
    .line 923
    move-object/from16 v1, v44

    .line 924
    .line 925
    goto :goto_1a

    .line 926
    :cond_19
    move/from16 v18, v1

    .line 927
    .line 928
    move/from16 v16, v2

    .line 929
    .line 930
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 931
    .line 932
    .line 933
    move-result-wide v1

    .line 934
    long-to-int v1, v1

    .line 935
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 936
    .line 937
    .line 938
    move-result-object v1

    .line 939
    :goto_1a
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 940
    .line 941
    .line 942
    move/from16 v1, v19

    .line 943
    .line 944
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 945
    .line 946
    .line 947
    move-result v2

    .line 948
    if-eqz v2, :cond_1a

    .line 949
    .line 950
    move/from16 v19, v3

    .line 951
    .line 952
    move-object/from16 v2, v44

    .line 953
    .line 954
    goto :goto_1b

    .line 955
    :cond_1a
    move/from16 v19, v3

    .line 956
    .line 957
    invoke-interface {v5, v1}, Lz34;->getLong(I)J

    .line 958
    .line 959
    .line 960
    move-result-wide v2

    .line 961
    long-to-int v2, v2

    .line 962
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    :goto_1b
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 967
    .line 968
    .line 969
    move/from16 v2, v20

    .line 970
    .line 971
    invoke-interface {v5, v2}, Lz34;->isNull(I)Z

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    if-eqz v3, :cond_1b

    .line 976
    .line 977
    move v3, v0

    .line 978
    move/from16 v20, v1

    .line 979
    .line 980
    move-object/from16 v0, v44

    .line 981
    .line 982
    goto :goto_1c

    .line 983
    :cond_1b
    move v3, v0

    .line 984
    move/from16 v20, v1

    .line 985
    .line 986
    invoke-interface {v5, v2}, Lz34;->getLong(I)J

    .line 987
    .line 988
    .line 989
    move-result-wide v0

    .line 990
    long-to-int v0, v0

    .line 991
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    :goto_1c
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 996
    .line 997
    .line 998
    move/from16 v0, v21

    .line 999
    .line 1000
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v1

    .line 1004
    if-eqz v1, :cond_1c

    .line 1005
    .line 1006
    move/from16 v21, v2

    .line 1007
    .line 1008
    move-object/from16 v1, v44

    .line 1009
    .line 1010
    goto :goto_1d

    .line 1011
    :cond_1c
    move/from16 v21, v2

    .line 1012
    .line 1013
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v1

    .line 1017
    long-to-int v1, v1

    .line 1018
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    :goto_1d
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 1023
    .line 1024
    .line 1025
    move/from16 v1, v22

    .line 1026
    .line 1027
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 1028
    .line 1029
    .line 1030
    move-result v2

    .line 1031
    if-eqz v2, :cond_1d

    .line 1032
    .line 1033
    move-object/from16 v2, v44

    .line 1034
    .line 1035
    goto :goto_1e

    .line 1036
    :cond_1d
    invoke-interface {v5, v1}, Lz34;->D(I)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    :goto_1e
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    move/from16 v22, v0

    .line 1044
    .line 1045
    move/from16 v2, v23

    .line 1046
    .line 1047
    move/from16 v23, v1

    .line 1048
    .line 1049
    invoke-interface {v5, v2}, Lz34;->getLong(I)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v0

    .line 1053
    long-to-int v0, v0

    .line 1054
    if-eqz v0, :cond_1e

    .line 1055
    .line 1056
    const/4 v1, 0x1

    .line 1057
    goto :goto_1f

    .line 1058
    :cond_1e
    const/4 v1, 0x0

    .line 1059
    :goto_1f
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 1060
    .line 1061
    .line 1062
    move/from16 v0, v24

    .line 1063
    .line 1064
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v1

    .line 1068
    if-eqz v1, :cond_1f

    .line 1069
    .line 1070
    move/from16 v24, v2

    .line 1071
    .line 1072
    move-object/from16 v1, v44

    .line 1073
    .line 1074
    goto :goto_20

    .line 1075
    :cond_1f
    move/from16 v24, v2

    .line 1076
    .line 1077
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 1078
    .line 1079
    .line 1080
    move-result-wide v1

    .line 1081
    long-to-int v1, v1

    .line 1082
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    :goto_20
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 1087
    .line 1088
    .line 1089
    move/from16 v1, v25

    .line 1090
    .line 1091
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v2

    .line 1095
    if-eqz v2, :cond_20

    .line 1096
    .line 1097
    move-object/from16 v2, v44

    .line 1098
    .line 1099
    goto :goto_21

    .line 1100
    :cond_20
    invoke-interface {v5, v1}, Lz34;->getDouble(I)D

    .line 1101
    .line 1102
    .line 1103
    move-result-wide v49

    .line 1104
    invoke-static/range {v49 .. v50}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v2

    .line 1108
    :goto_21
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 1109
    .line 1110
    .line 1111
    move/from16 v2, v26

    .line 1112
    .line 1113
    invoke-interface {v5, v2}, Lz34;->isNull(I)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v25

    .line 1117
    if-eqz v25, :cond_21

    .line 1118
    .line 1119
    move/from16 v26, v0

    .line 1120
    .line 1121
    move-object/from16 v0, v44

    .line 1122
    .line 1123
    goto :goto_22

    .line 1124
    :cond_21
    invoke-interface {v5, v2}, Lz34;->getLong(I)J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v25

    .line 1128
    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v25

    .line 1132
    move/from16 v26, v0

    .line 1133
    .line 1134
    move-object/from16 v0, v25

    .line 1135
    .line 1136
    :goto_22
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 1137
    .line 1138
    .line 1139
    move/from16 v0, v27

    .line 1140
    .line 1141
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v25

    .line 1145
    if-eqz v25, :cond_22

    .line 1146
    .line 1147
    move/from16 v25, v1

    .line 1148
    .line 1149
    move/from16 v27, v2

    .line 1150
    .line 1151
    move-object/from16 v1, v44

    .line 1152
    .line 1153
    goto :goto_23

    .line 1154
    :cond_22
    move/from16 v25, v1

    .line 1155
    .line 1156
    move/from16 v27, v2

    .line 1157
    .line 1158
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 1159
    .line 1160
    .line 1161
    move-result-wide v1

    .line 1162
    long-to-int v1, v1

    .line 1163
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v1

    .line 1167
    :goto_23
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 1168
    .line 1169
    .line 1170
    move/from16 v1, v28

    .line 1171
    .line 1172
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v2

    .line 1176
    if-eqz v2, :cond_23

    .line 1177
    .line 1178
    move-object/from16 v2, v44

    .line 1179
    .line 1180
    goto :goto_24

    .line 1181
    :cond_23
    invoke-interface {v5, v1}, Lz34;->getLong(I)J

    .line 1182
    .line 1183
    .line 1184
    move-result-wide v49

    .line 1185
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v2

    .line 1189
    :goto_24
    invoke-static {v2}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v2

    .line 1193
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 1194
    .line 1195
    .line 1196
    move/from16 v2, v29

    .line 1197
    .line 1198
    invoke-interface {v5, v2}, Lz34;->isNull(I)Z

    .line 1199
    .line 1200
    .line 1201
    move-result v28

    .line 1202
    if-eqz v28, :cond_24

    .line 1203
    .line 1204
    move-object/from16 v28, v44

    .line 1205
    .line 1206
    :goto_25
    move/from16 v29, v0

    .line 1207
    .line 1208
    goto :goto_26

    .line 1209
    :cond_24
    invoke-interface {v5, v2}, Lz34;->getLong(I)J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v28

    .line 1213
    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v28

    .line 1217
    goto :goto_25

    .line 1218
    :goto_26
    invoke-static/range {v28 .. v28}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 1223
    .line 1224
    .line 1225
    move/from16 v0, v30

    .line 1226
    .line 1227
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v28

    .line 1231
    if-eqz v28, :cond_25

    .line 1232
    .line 1233
    move/from16 v30, v0

    .line 1234
    .line 1235
    move-object/from16 v0, v44

    .line 1236
    .line 1237
    goto :goto_27

    .line 1238
    :cond_25
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v28

    .line 1242
    move/from16 v30, v0

    .line 1243
    .line 1244
    move-object/from16 v0, v28

    .line 1245
    .line 1246
    :goto_27
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    move/from16 v0, v31

    .line 1250
    .line 1251
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v28

    .line 1255
    if-eqz v28, :cond_26

    .line 1256
    .line 1257
    move/from16 v31, v0

    .line 1258
    .line 1259
    move-object/from16 v0, v44

    .line 1260
    .line 1261
    goto :goto_28

    .line 1262
    :cond_26
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v28

    .line 1266
    move/from16 v31, v0

    .line 1267
    .line 1268
    move-object/from16 v0, v28

    .line 1269
    .line 1270
    :goto_28
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 1271
    .line 1272
    .line 1273
    move/from16 v0, v32

    .line 1274
    .line 1275
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1276
    .line 1277
    .line 1278
    move-result v28

    .line 1279
    if-eqz v28, :cond_27

    .line 1280
    .line 1281
    move/from16 v32, v0

    .line 1282
    .line 1283
    move-object/from16 v0, v44

    .line 1284
    .line 1285
    goto :goto_29

    .line 1286
    :cond_27
    invoke-interface {v5, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v28

    .line 1290
    move/from16 v32, v0

    .line 1291
    .line 1292
    move-object/from16 v0, v28

    .line 1293
    .line 1294
    :goto_29
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    move/from16 v0, v33

    .line 1298
    .line 1299
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1300
    .line 1301
    .line 1302
    move-result v28

    .line 1303
    if-eqz v28, :cond_28

    .line 1304
    .line 1305
    move/from16 v33, v0

    .line 1306
    .line 1307
    move-object/from16 v0, v44

    .line 1308
    .line 1309
    goto :goto_2a

    .line 1310
    :cond_28
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 1311
    .line 1312
    .line 1313
    move-result-wide v49

    .line 1314
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v28

    .line 1318
    move/from16 v33, v0

    .line 1319
    .line 1320
    move-object/from16 v0, v28

    .line 1321
    .line 1322
    :goto_2a
    invoke-virtual {v8, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 1323
    .line 1324
    .line 1325
    move/from16 v0, v34

    .line 1326
    .line 1327
    invoke-interface {v5, v0}, Lz34;->isNull(I)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v28

    .line 1331
    if-eqz v28, :cond_29

    .line 1332
    .line 1333
    move/from16 v28, v1

    .line 1334
    .line 1335
    move/from16 v34, v2

    .line 1336
    .line 1337
    move-object/from16 v1, v44

    .line 1338
    .line 1339
    goto :goto_2b

    .line 1340
    :cond_29
    move/from16 v28, v1

    .line 1341
    .line 1342
    move/from16 v34, v2

    .line 1343
    .line 1344
    invoke-interface {v5, v0}, Lz34;->getLong(I)J

    .line 1345
    .line 1346
    .line 1347
    move-result-wide v1

    .line 1348
    long-to-int v1, v1

    .line 1349
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v1

    .line 1353
    :goto_2b
    invoke-virtual {v8, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 1354
    .line 1355
    .line 1356
    move/from16 v1, v35

    .line 1357
    .line 1358
    invoke-interface {v5, v1}, Lz34;->isNull(I)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v2

    .line 1362
    if-eqz v2, :cond_2a

    .line 1363
    .line 1364
    move/from16 v35, v3

    .line 1365
    .line 1366
    move-object/from16 v2, v44

    .line 1367
    .line 1368
    goto :goto_2c

    .line 1369
    :cond_2a
    move/from16 v35, v3

    .line 1370
    .line 1371
    invoke-interface {v5, v1}, Lz34;->getLong(I)J

    .line 1372
    .line 1373
    .line 1374
    move-result-wide v2

    .line 1375
    long-to-int v2, v2

    .line 1376
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v2

    .line 1380
    :goto_2c
    invoke-virtual {v8, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 1381
    .line 1382
    .line 1383
    move/from16 v2, v36

    .line 1384
    .line 1385
    invoke-interface {v5, v2}, Lz34;->isNull(I)Z

    .line 1386
    .line 1387
    .line 1388
    move-result v3

    .line 1389
    if-eqz v3, :cond_2b

    .line 1390
    .line 1391
    :goto_2d
    move-object/from16 v3, v44

    .line 1392
    .line 1393
    goto :goto_2e

    .line 1394
    :cond_2b
    invoke-interface {v5, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v44

    .line 1398
    goto :goto_2d

    .line 1399
    :goto_2e
    invoke-virtual {v8, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v8, v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V

    .line 1403
    .line 1404
    .line 1405
    move-object/from16 v3, v46

    .line 1406
    .line 1407
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1408
    .line 1409
    .line 1410
    move/from16 v36, v2

    .line 1411
    .line 1412
    move v8, v9

    .line 1413
    move v9, v10

    .line 1414
    move/from16 v7, v19

    .line 1415
    .line 1416
    move/from16 v19, v20

    .line 1417
    .line 1418
    move/from16 v20, v21

    .line 1419
    .line 1420
    move/from16 v21, v22

    .line 1421
    .line 1422
    move/from16 v22, v23

    .line 1423
    .line 1424
    move/from16 v23, v24

    .line 1425
    .line 1426
    move/from16 v24, v26

    .line 1427
    .line 1428
    move/from16 v26, v27

    .line 1429
    .line 1430
    move/from16 v27, v29

    .line 1431
    .line 1432
    move/from16 v29, v34

    .line 1433
    .line 1434
    move/from16 v2, v42

    .line 1435
    .line 1436
    move/from16 v34, v0

    .line 1437
    .line 1438
    move-object v10, v3

    .line 1439
    move/from16 v42, v41

    .line 1440
    .line 1441
    move/from16 v3, v43

    .line 1442
    .line 1443
    move/from16 v0, v45

    .line 1444
    .line 1445
    move/from16 v41, v16

    .line 1446
    .line 1447
    move/from16 v16, v37

    .line 1448
    .line 1449
    move/from16 v37, v38

    .line 1450
    .line 1451
    move/from16 v38, v39

    .line 1452
    .line 1453
    move/from16 v39, v18

    .line 1454
    .line 1455
    move/from16 v18, v35

    .line 1456
    .line 1457
    move/from16 v35, v1

    .line 1458
    .line 1459
    move/from16 v1, v48

    .line 1460
    .line 1461
    goto/16 :goto_1

    .line 1462
    .line 1463
    :cond_2c
    move-object v3, v10

    .line 1464
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    .line 1465
    .line 1466
    .line 1467
    return-object v3

    .line 1468
    :goto_2f
    invoke-interface {v5}, Ljava/lang/AutoCloseable;->close()V

    .line 1469
    .line 1470
    .line 1471
    throw v0
.end method
