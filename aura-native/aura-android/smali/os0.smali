.class public final synthetic Los0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lss0;


# direct methods
.method public synthetic constructor <init>(Lss0;I)V
    .locals 0

    .line 1
    iput p2, p0, Los0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Los0;->o:Lss0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 60

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lx34;

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    iget-object v1, v1, Los0;->o:Lss0;

    .line 8
    .line 9
    iget-object v1, v1, Lss0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v1, "SELECT * FROM download WHERE download_state = 1 ORDER BY IFNULL(NULLIF(album_artist, \'\'), album), album, album_id, disc_number, track ASC"

    .line 12
    .line 13
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :try_start_0
    const-string v0, "id"

    .line 18
    .line 19
    invoke-static {v1, v0}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const-string v2, "playlist_id"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "playlist_name"

    .line 30
    .line 31
    invoke-static {v1, v3}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const-string v4, "download_state"

    .line 36
    .line 37
    invoke-static {v1, v4}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const-string v5, "download_uri"

    .line 42
    .line 43
    invoke-static {v1, v5}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const-string v6, "parent_id"

    .line 48
    .line 49
    invoke-static {v1, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    const-string v7, "is_dir"

    .line 54
    .line 55
    invoke-static {v1, v7}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    const-string v8, "title"

    .line 60
    .line 61
    invoke-static {v1, v8}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    const-string v9, "album"

    .line 66
    .line 67
    invoke-static {v1, v9}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    const-string v10, "artist"

    .line 72
    .line 73
    invoke-static {v1, v10}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    const-string v11, "track"

    .line 78
    .line 79
    invoke-static {v1, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    const-string v12, "year"

    .line 84
    .line 85
    invoke-static {v1, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v12

    .line 89
    const-string v13, "genre"

    .line 90
    .line 91
    invoke-static {v1, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    const-string v14, "cover_art_id"

    .line 96
    .line 97
    invoke-static {v1, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    const-string v15, "size"

    .line 102
    .line 103
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    move/from16 p0, v15

    .line 108
    .line 109
    const-string v15, "content_type"

    .line 110
    .line 111
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    move/from16 p1, v15

    .line 116
    .line 117
    const-string v15, "suffix"

    .line 118
    .line 119
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    move/from16 v16, v15

    .line 124
    .line 125
    const-string v15, "transcoding_content_type"

    .line 126
    .line 127
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    move-result v15

    .line 131
    move/from16 v17, v15

    .line 132
    .line 133
    const-string v15, "transcoded_suffix"

    .line 134
    .line 135
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v15

    .line 139
    move/from16 v18, v15

    .line 140
    .line 141
    const-string v15, "duration"

    .line 142
    .line 143
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    move/from16 v19, v15

    .line 148
    .line 149
    const-string v15, "bitrate"

    .line 150
    .line 151
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    move-result v15

    .line 155
    move/from16 v20, v15

    .line 156
    .line 157
    const-string v15, "sampling_rate"

    .line 158
    .line 159
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    move/from16 v21, v15

    .line 164
    .line 165
    const-string v15, "bit_depth"

    .line 166
    .line 167
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    move/from16 v22, v15

    .line 172
    .line 173
    const-string v15, "path"

    .line 174
    .line 175
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v15

    .line 179
    move/from16 v23, v15

    .line 180
    .line 181
    const-string v15, "is_video"

    .line 182
    .line 183
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result v15

    .line 187
    move/from16 v24, v15

    .line 188
    .line 189
    const-string v15, "user_rating"

    .line 190
    .line 191
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    move/from16 v25, v15

    .line 196
    .line 197
    const-string v15, "average_rating"

    .line 198
    .line 199
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    move/from16 v26, v15

    .line 204
    .line 205
    const-string v15, "play_count"

    .line 206
    .line 207
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    move/from16 v27, v15

    .line 212
    .line 213
    const-string v15, "disc_number"

    .line 214
    .line 215
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    move/from16 v28, v15

    .line 220
    .line 221
    const-string v15, "created"

    .line 222
    .line 223
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v15

    .line 227
    move/from16 v29, v15

    .line 228
    .line 229
    const-string v15, "starred"

    .line 230
    .line 231
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    move-result v15

    .line 235
    move/from16 v30, v15

    .line 236
    .line 237
    const-string v15, "album_id"

    .line 238
    .line 239
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v15

    .line 243
    move/from16 v31, v15

    .line 244
    .line 245
    const-string v15, "artist_id"

    .line 246
    .line 247
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    move/from16 v32, v15

    .line 252
    .line 253
    const-string v15, "type"

    .line 254
    .line 255
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    move-result v15

    .line 259
    move/from16 v33, v15

    .line 260
    .line 261
    const-string v15, "bookmark_position"

    .line 262
    .line 263
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    move/from16 v34, v15

    .line 268
    .line 269
    const-string v15, "original_width"

    .line 270
    .line 271
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 272
    .line 273
    .line 274
    move-result v15

    .line 275
    move/from16 v35, v15

    .line 276
    .line 277
    const-string v15, "original_height"

    .line 278
    .line 279
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    move-result v15

    .line 283
    move/from16 v36, v15

    .line 284
    .line 285
    const-string v15, "album_artist"

    .line 286
    .line 287
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v15

    .line 291
    move/from16 v37, v15

    .line 292
    .line 293
    const-string v15, "rg_track_gain"

    .line 294
    .line 295
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 296
    .line 297
    .line 298
    move-result v15

    .line 299
    move/from16 v38, v14

    .line 300
    .line 301
    const-string v14, "rg_album_gain"

    .line 302
    .line 303
    invoke-static {v1, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    move/from16 v39, v13

    .line 308
    .line 309
    const-string v13, "rg_track_peak"

    .line 310
    .line 311
    invoke-static {v1, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 312
    .line 313
    .line 314
    move-result v13

    .line 315
    move/from16 v40, v12

    .line 316
    .line 317
    const-string v12, "rg_album_peak"

    .line 318
    .line 319
    invoke-static {v1, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    move/from16 v41, v11

    .line 324
    .line 325
    const-string v11, "rg_base_gain"

    .line 326
    .line 327
    invoke-static {v1, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    move/from16 v42, v10

    .line 332
    .line 333
    const-string v10, "rg_fallback_gain"

    .line 334
    .line 335
    invoke-static {v1, v10}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    move-result v10

    .line 339
    move/from16 v43, v9

    .line 340
    .line 341
    new-instance v9, Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 344
    .line 345
    .line 346
    :goto_0
    invoke-interface {v1}, Lz34;->O()Z

    .line 347
    .line 348
    .line 349
    move-result v44

    .line 350
    if-eqz v44, :cond_2d

    .line 351
    .line 352
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 353
    .line 354
    .line 355
    move-result v44

    .line 356
    const/16 v45, 0x0

    .line 357
    .line 358
    if-eqz v44, :cond_0

    .line 359
    .line 360
    move-object/from16 v47, v45

    .line 361
    .line 362
    goto :goto_1

    .line 363
    :cond_0
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v44

    .line 367
    move-object/from16 v47, v44

    .line 368
    .line 369
    :goto_1
    invoke-interface {v1, v2}, Lz34;->isNull(I)Z

    .line 370
    .line 371
    .line 372
    move-result v44

    .line 373
    if-eqz v44, :cond_1

    .line 374
    .line 375
    move-object/from16 v48, v45

    .line 376
    .line 377
    goto :goto_2

    .line 378
    :cond_1
    invoke-interface {v1, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v44

    .line 382
    move-object/from16 v48, v44

    .line 383
    .line 384
    :goto_2
    invoke-interface {v1, v3}, Lz34;->isNull(I)Z

    .line 385
    .line 386
    .line 387
    move-result v44

    .line 388
    if-eqz v44, :cond_2

    .line 389
    .line 390
    move-object/from16 v49, v45

    .line 391
    .line 392
    move/from16 v44, v2

    .line 393
    .line 394
    move/from16 v52, v3

    .line 395
    .line 396
    goto :goto_3

    .line 397
    :cond_2
    invoke-interface {v1, v3}, Lz34;->D(I)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v44

    .line 401
    move-object/from16 v49, v44

    .line 402
    .line 403
    move/from16 v52, v3

    .line 404
    .line 405
    move/from16 v44, v2

    .line 406
    .line 407
    :goto_3
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 408
    .line 409
    .line 410
    move-result-wide v2

    .line 411
    long-to-int v2, v2

    .line 412
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    if-eqz v3, :cond_3

    .line 417
    .line 418
    move-object/from16 v51, v45

    .line 419
    .line 420
    goto :goto_4

    .line 421
    :cond_3
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    move-object/from16 v51, v3

    .line 426
    .line 427
    :goto_4
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 428
    .line 429
    .line 430
    move-result v3

    .line 431
    if-eqz v3, :cond_5

    .line 432
    .line 433
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-eqz v3, :cond_5

    .line 438
    .line 439
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    if-eqz v3, :cond_5

    .line 444
    .line 445
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    if-eqz v3, :cond_5

    .line 450
    .line 451
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    if-eqz v3, :cond_5

    .line 456
    .line 457
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-nez v3, :cond_4

    .line 462
    .line 463
    goto :goto_5

    .line 464
    :cond_4
    move/from16 v50, v2

    .line 465
    .line 466
    move-object/from16 v2, v45

    .line 467
    .line 468
    goto/16 :goto_c

    .line 469
    .line 470
    :catchall_0
    move-exception v0

    .line 471
    goto/16 :goto_30

    .line 472
    .line 473
    :cond_5
    :goto_5
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    if-eqz v3, :cond_6

    .line 478
    .line 479
    move/from16 v50, v2

    .line 480
    .line 481
    move-object/from16 v54, v45

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_6
    move/from16 v50, v2

    .line 485
    .line 486
    invoke-interface {v1, v15}, Lz34;->getDouble(I)D

    .line 487
    .line 488
    .line 489
    move-result-wide v2

    .line 490
    double-to-float v2, v2

    .line 491
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    move-object/from16 v54, v2

    .line 496
    .line 497
    :goto_6
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    if-eqz v2, :cond_7

    .line 502
    .line 503
    move-object/from16 v55, v45

    .line 504
    .line 505
    goto :goto_7

    .line 506
    :cond_7
    invoke-interface {v1, v14}, Lz34;->getDouble(I)D

    .line 507
    .line 508
    .line 509
    move-result-wide v2

    .line 510
    double-to-float v2, v2

    .line 511
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    move-object/from16 v55, v2

    .line 516
    .line 517
    :goto_7
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v2, :cond_8

    .line 522
    .line 523
    move-object/from16 v56, v45

    .line 524
    .line 525
    goto :goto_8

    .line 526
    :cond_8
    invoke-interface {v1, v13}, Lz34;->getDouble(I)D

    .line 527
    .line 528
    .line 529
    move-result-wide v2

    .line 530
    double-to-float v2, v2

    .line 531
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    move-object/from16 v56, v2

    .line 536
    .line 537
    :goto_8
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    if-eqz v2, :cond_9

    .line 542
    .line 543
    move-object/from16 v57, v45

    .line 544
    .line 545
    goto :goto_9

    .line 546
    :cond_9
    invoke-interface {v1, v12}, Lz34;->getDouble(I)D

    .line 547
    .line 548
    .line 549
    move-result-wide v2

    .line 550
    double-to-float v2, v2

    .line 551
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    move-object/from16 v57, v2

    .line 556
    .line 557
    :goto_9
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 558
    .line 559
    .line 560
    move-result v2

    .line 561
    if-eqz v2, :cond_a

    .line 562
    .line 563
    move-object/from16 v58, v45

    .line 564
    .line 565
    goto :goto_a

    .line 566
    :cond_a
    invoke-interface {v1, v11}, Lz34;->getDouble(I)D

    .line 567
    .line 568
    .line 569
    move-result-wide v2

    .line 570
    double-to-float v2, v2

    .line 571
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    move-object/from16 v58, v2

    .line 576
    .line 577
    :goto_a
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 578
    .line 579
    .line 580
    move-result v2

    .line 581
    if-eqz v2, :cond_b

    .line 582
    .line 583
    move-object/from16 v59, v45

    .line 584
    .line 585
    goto :goto_b

    .line 586
    :cond_b
    invoke-interface {v1, v10}, Lz34;->getDouble(I)D

    .line 587
    .line 588
    .line 589
    move-result-wide v2

    .line 590
    double-to-float v2, v2

    .line 591
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    move-object/from16 v59, v2

    .line 596
    .line 597
    :goto_b
    new-instance v53, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 598
    .line 599
    invoke-direct/range {v53 .. v59}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 600
    .line 601
    .line 602
    move-object/from16 v2, v53

    .line 603
    .line 604
    :goto_c
    new-instance v46, Lcom/eddyizm/tempus/model/Download;

    .line 605
    .line 606
    invoke-direct/range {v46 .. v51}, Lcom/eddyizm/tempus/model/Download;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 607
    .line 608
    .line 609
    move-object/from16 v3, v46

    .line 610
    .line 611
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 612
    .line 613
    .line 614
    move-result v46

    .line 615
    if-eqz v46, :cond_c

    .line 616
    .line 617
    move/from16 v47, v0

    .line 618
    .line 619
    move-object/from16 v0, v45

    .line 620
    .line 621
    goto :goto_d

    .line 622
    :cond_c
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v46

    .line 626
    move/from16 v47, v0

    .line 627
    .line 628
    move-object/from16 v0, v46

    .line 629
    .line 630
    :goto_d
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 631
    .line 632
    .line 633
    move v0, v4

    .line 634
    move/from16 v46, v5

    .line 635
    .line 636
    invoke-interface {v1, v7}, Lz34;->getLong(I)J

    .line 637
    .line 638
    .line 639
    move-result-wide v4

    .line 640
    long-to-int v4, v4

    .line 641
    const/16 v48, 0x1

    .line 642
    .line 643
    if-eqz v4, :cond_d

    .line 644
    .line 645
    move/from16 v4, v48

    .line 646
    .line 647
    goto :goto_e

    .line 648
    :cond_d
    const/4 v4, 0x0

    .line 649
    :goto_e
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 650
    .line 651
    .line 652
    invoke-interface {v1, v8}, Lz34;->isNull(I)Z

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    if-eqz v4, :cond_e

    .line 657
    .line 658
    move-object/from16 v4, v45

    .line 659
    .line 660
    goto :goto_f

    .line 661
    :cond_e
    invoke-interface {v1, v8}, Lz34;->D(I)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    :goto_f
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    move/from16 v4, v43

    .line 669
    .line 670
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 671
    .line 672
    .line 673
    move-result v43

    .line 674
    if-eqz v43, :cond_f

    .line 675
    .line 676
    move-object/from16 v5, v45

    .line 677
    .line 678
    goto :goto_10

    .line 679
    :cond_f
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v43

    .line 683
    move-object/from16 v5, v43

    .line 684
    .line 685
    :goto_10
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    move/from16 v5, v42

    .line 689
    .line 690
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 691
    .line 692
    .line 693
    move-result v42

    .line 694
    if-eqz v42, :cond_10

    .line 695
    .line 696
    move/from16 v43, v0

    .line 697
    .line 698
    move-object/from16 v0, v45

    .line 699
    .line 700
    goto :goto_11

    .line 701
    :cond_10
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v42

    .line 705
    move/from16 v43, v0

    .line 706
    .line 707
    move-object/from16 v0, v42

    .line 708
    .line 709
    :goto_11
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    move/from16 v0, v41

    .line 713
    .line 714
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 715
    .line 716
    .line 717
    move-result v41

    .line 718
    if-eqz v41, :cond_11

    .line 719
    .line 720
    move/from16 v41, v4

    .line 721
    .line 722
    move/from16 v42, v5

    .line 723
    .line 724
    move-object/from16 v4, v45

    .line 725
    .line 726
    goto :goto_12

    .line 727
    :cond_11
    move/from16 v41, v4

    .line 728
    .line 729
    move/from16 v42, v5

    .line 730
    .line 731
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 732
    .line 733
    .line 734
    move-result-wide v4

    .line 735
    long-to-int v4, v4

    .line 736
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    :goto_12
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 741
    .line 742
    .line 743
    move/from16 v4, v40

    .line 744
    .line 745
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    if-eqz v5, :cond_12

    .line 750
    .line 751
    move/from16 v40, v6

    .line 752
    .line 753
    move-object/from16 v5, v45

    .line 754
    .line 755
    goto :goto_13

    .line 756
    :cond_12
    move/from16 v40, v6

    .line 757
    .line 758
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 759
    .line 760
    .line 761
    move-result-wide v5

    .line 762
    long-to-int v5, v5

    .line 763
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    .line 765
    .line 766
    move-result-object v5

    .line 767
    :goto_13
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 768
    .line 769
    .line 770
    move/from16 v5, v39

    .line 771
    .line 772
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    if-eqz v6, :cond_13

    .line 777
    .line 778
    move-object/from16 v6, v45

    .line 779
    .line 780
    goto :goto_14

    .line 781
    :cond_13
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v6

    .line 785
    :goto_14
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    move/from16 v6, v38

    .line 789
    .line 790
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 791
    .line 792
    .line 793
    move-result v38

    .line 794
    if-eqz v38, :cond_14

    .line 795
    .line 796
    move/from16 v39, v0

    .line 797
    .line 798
    move-object/from16 v0, v45

    .line 799
    .line 800
    goto :goto_15

    .line 801
    :cond_14
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v38

    .line 805
    move/from16 v39, v0

    .line 806
    .line 807
    move-object/from16 v0, v38

    .line 808
    .line 809
    :goto_15
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    move/from16 v0, p0

    .line 813
    .line 814
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 815
    .line 816
    .line 817
    move-result v38

    .line 818
    if-eqz v38, :cond_15

    .line 819
    .line 820
    move/from16 p0, v0

    .line 821
    .line 822
    move-object/from16 v0, v45

    .line 823
    .line 824
    goto :goto_16

    .line 825
    :cond_15
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 826
    .line 827
    .line 828
    move-result-wide v50

    .line 829
    invoke-static/range {v50 .. v51}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 830
    .line 831
    .line 832
    move-result-object v38

    .line 833
    move/from16 p0, v0

    .line 834
    .line 835
    move-object/from16 v0, v38

    .line 836
    .line 837
    :goto_16
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 838
    .line 839
    .line 840
    move/from16 v0, p1

    .line 841
    .line 842
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 843
    .line 844
    .line 845
    move-result v38

    .line 846
    if-eqz v38, :cond_16

    .line 847
    .line 848
    move/from16 p1, v0

    .line 849
    .line 850
    move-object/from16 v0, v45

    .line 851
    .line 852
    goto :goto_17

    .line 853
    :cond_16
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v38

    .line 857
    move/from16 p1, v0

    .line 858
    .line 859
    move-object/from16 v0, v38

    .line 860
    .line 861
    :goto_17
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 862
    .line 863
    .line 864
    move/from16 v0, v16

    .line 865
    .line 866
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 867
    .line 868
    .line 869
    move-result v16

    .line 870
    if-eqz v16, :cond_17

    .line 871
    .line 872
    move/from16 v38, v0

    .line 873
    .line 874
    move-object/from16 v0, v45

    .line 875
    .line 876
    goto :goto_18

    .line 877
    :cond_17
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v16

    .line 881
    move/from16 v38, v0

    .line 882
    .line 883
    move-object/from16 v0, v16

    .line 884
    .line 885
    :goto_18
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    move/from16 v0, v17

    .line 889
    .line 890
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 891
    .line 892
    .line 893
    move-result v16

    .line 894
    if-eqz v16, :cond_18

    .line 895
    .line 896
    move/from16 v17, v0

    .line 897
    .line 898
    move-object/from16 v0, v45

    .line 899
    .line 900
    goto :goto_19

    .line 901
    :cond_18
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v16

    .line 905
    move/from16 v17, v0

    .line 906
    .line 907
    move-object/from16 v0, v16

    .line 908
    .line 909
    :goto_19
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    move/from16 v0, v18

    .line 913
    .line 914
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 915
    .line 916
    .line 917
    move-result v16

    .line 918
    if-eqz v16, :cond_19

    .line 919
    .line 920
    move/from16 v18, v0

    .line 921
    .line 922
    move-object/from16 v0, v45

    .line 923
    .line 924
    goto :goto_1a

    .line 925
    :cond_19
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v16

    .line 929
    move/from16 v18, v0

    .line 930
    .line 931
    move-object/from16 v0, v16

    .line 932
    .line 933
    :goto_1a
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 934
    .line 935
    .line 936
    move/from16 v0, v19

    .line 937
    .line 938
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 939
    .line 940
    .line 941
    move-result v16

    .line 942
    if-eqz v16, :cond_1a

    .line 943
    .line 944
    move/from16 v16, v4

    .line 945
    .line 946
    move/from16 v19, v5

    .line 947
    .line 948
    move-object/from16 v4, v45

    .line 949
    .line 950
    goto :goto_1b

    .line 951
    :cond_1a
    move/from16 v16, v4

    .line 952
    .line 953
    move/from16 v19, v5

    .line 954
    .line 955
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 956
    .line 957
    .line 958
    move-result-wide v4

    .line 959
    long-to-int v4, v4

    .line 960
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 961
    .line 962
    .line 963
    move-result-object v4

    .line 964
    :goto_1b
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 965
    .line 966
    .line 967
    move/from16 v4, v20

    .line 968
    .line 969
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 970
    .line 971
    .line 972
    move-result v5

    .line 973
    if-eqz v5, :cond_1b

    .line 974
    .line 975
    move/from16 v20, v6

    .line 976
    .line 977
    move-object/from16 v5, v45

    .line 978
    .line 979
    goto :goto_1c

    .line 980
    :cond_1b
    move/from16 v20, v6

    .line 981
    .line 982
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 983
    .line 984
    .line 985
    move-result-wide v5

    .line 986
    long-to-int v5, v5

    .line 987
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 988
    .line 989
    .line 990
    move-result-object v5

    .line 991
    :goto_1c
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 992
    .line 993
    .line 994
    move/from16 v5, v21

    .line 995
    .line 996
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 997
    .line 998
    .line 999
    move-result v6

    .line 1000
    if-eqz v6, :cond_1c

    .line 1001
    .line 1002
    move/from16 v21, v7

    .line 1003
    .line 1004
    move-object/from16 v6, v45

    .line 1005
    .line 1006
    goto :goto_1d

    .line 1007
    :cond_1c
    move/from16 v21, v7

    .line 1008
    .line 1009
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1010
    .line 1011
    .line 1012
    move-result-wide v6

    .line 1013
    long-to-int v6, v6

    .line 1014
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v6

    .line 1018
    :goto_1d
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 1019
    .line 1020
    .line 1021
    move/from16 v6, v22

    .line 1022
    .line 1023
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v7

    .line 1027
    if-eqz v7, :cond_1d

    .line 1028
    .line 1029
    move v7, v4

    .line 1030
    move/from16 v22, v5

    .line 1031
    .line 1032
    move-object/from16 v4, v45

    .line 1033
    .line 1034
    goto :goto_1e

    .line 1035
    :cond_1d
    move v7, v4

    .line 1036
    move/from16 v22, v5

    .line 1037
    .line 1038
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v4

    .line 1042
    long-to-int v4, v4

    .line 1043
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v4

    .line 1047
    :goto_1e
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 1048
    .line 1049
    .line 1050
    move/from16 v4, v23

    .line 1051
    .line 1052
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v5

    .line 1056
    if-eqz v5, :cond_1e

    .line 1057
    .line 1058
    move-object/from16 v5, v45

    .line 1059
    .line 1060
    goto :goto_1f

    .line 1061
    :cond_1e
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v5

    .line 1065
    :goto_1f
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 1066
    .line 1067
    .line 1068
    move/from16 v23, v6

    .line 1069
    .line 1070
    move/from16 v5, v24

    .line 1071
    .line 1072
    move/from16 v24, v7

    .line 1073
    .line 1074
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1075
    .line 1076
    .line 1077
    move-result-wide v6

    .line 1078
    long-to-int v6, v6

    .line 1079
    if-eqz v6, :cond_1f

    .line 1080
    .line 1081
    move/from16 v6, v48

    .line 1082
    .line 1083
    goto :goto_20

    .line 1084
    :cond_1f
    const/4 v6, 0x0

    .line 1085
    :goto_20
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 1086
    .line 1087
    .line 1088
    move/from16 v6, v25

    .line 1089
    .line 1090
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 1091
    .line 1092
    .line 1093
    move-result v7

    .line 1094
    if-eqz v7, :cond_20

    .line 1095
    .line 1096
    move v7, v4

    .line 1097
    move/from16 v25, v5

    .line 1098
    .line 1099
    move-object/from16 v4, v45

    .line 1100
    .line 1101
    goto :goto_21

    .line 1102
    :cond_20
    move v7, v4

    .line 1103
    move/from16 v25, v5

    .line 1104
    .line 1105
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v4

    .line 1109
    long-to-int v4, v4

    .line 1110
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v4

    .line 1114
    :goto_21
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 1115
    .line 1116
    .line 1117
    move/from16 v4, v26

    .line 1118
    .line 1119
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v5

    .line 1123
    if-eqz v5, :cond_21

    .line 1124
    .line 1125
    move-object/from16 v5, v45

    .line 1126
    .line 1127
    goto :goto_22

    .line 1128
    :cond_21
    invoke-interface {v1, v4}, Lz34;->getDouble(I)D

    .line 1129
    .line 1130
    .line 1131
    move-result-wide v48

    .line 1132
    invoke-static/range {v48 .. v49}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    :goto_22
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 1137
    .line 1138
    .line 1139
    move/from16 v5, v27

    .line 1140
    .line 1141
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v26

    .line 1145
    if-eqz v26, :cond_22

    .line 1146
    .line 1147
    move/from16 v27, v0

    .line 1148
    .line 1149
    move-object/from16 v0, v45

    .line 1150
    .line 1151
    goto :goto_23

    .line 1152
    :cond_22
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v26

    .line 1156
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v26

    .line 1160
    move/from16 v27, v0

    .line 1161
    .line 1162
    move-object/from16 v0, v26

    .line 1163
    .line 1164
    :goto_23
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 1165
    .line 1166
    .line 1167
    move/from16 v0, v28

    .line 1168
    .line 1169
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v26

    .line 1173
    if-eqz v26, :cond_23

    .line 1174
    .line 1175
    move/from16 v26, v4

    .line 1176
    .line 1177
    move/from16 v28, v5

    .line 1178
    .line 1179
    move-object/from16 v4, v45

    .line 1180
    .line 1181
    goto :goto_24

    .line 1182
    :cond_23
    move/from16 v26, v4

    .line 1183
    .line 1184
    move/from16 v28, v5

    .line 1185
    .line 1186
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v4

    .line 1190
    long-to-int v4, v4

    .line 1191
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v4

    .line 1195
    :goto_24
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 1196
    .line 1197
    .line 1198
    move/from16 v4, v29

    .line 1199
    .line 1200
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v5

    .line 1204
    if-eqz v5, :cond_24

    .line 1205
    .line 1206
    move-object/from16 v5, v45

    .line 1207
    .line 1208
    goto :goto_25

    .line 1209
    :cond_24
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 1210
    .line 1211
    .line 1212
    move-result-wide v48

    .line 1213
    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v5

    .line 1217
    :goto_25
    invoke-static {v5}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v5

    .line 1221
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 1222
    .line 1223
    .line 1224
    move/from16 v5, v30

    .line 1225
    .line 1226
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v29

    .line 1230
    if-eqz v29, :cond_25

    .line 1231
    .line 1232
    move-object/from16 v29, v45

    .line 1233
    .line 1234
    :goto_26
    move/from16 v30, v0

    .line 1235
    .line 1236
    goto :goto_27

    .line 1237
    :cond_25
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1238
    .line 1239
    .line 1240
    move-result-wide v29

    .line 1241
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v29

    .line 1245
    goto :goto_26

    .line 1246
    :goto_27
    invoke-static/range {v29 .. v29}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 1251
    .line 1252
    .line 1253
    move/from16 v0, v31

    .line 1254
    .line 1255
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1256
    .line 1257
    .line 1258
    move-result v29

    .line 1259
    if-eqz v29, :cond_26

    .line 1260
    .line 1261
    move/from16 v31, v0

    .line 1262
    .line 1263
    move-object/from16 v0, v45

    .line 1264
    .line 1265
    goto :goto_28

    .line 1266
    :cond_26
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v29

    .line 1270
    move/from16 v31, v0

    .line 1271
    .line 1272
    move-object/from16 v0, v29

    .line 1273
    .line 1274
    :goto_28
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 1275
    .line 1276
    .line 1277
    move/from16 v0, v32

    .line 1278
    .line 1279
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v29

    .line 1283
    if-eqz v29, :cond_27

    .line 1284
    .line 1285
    move/from16 v32, v0

    .line 1286
    .line 1287
    move-object/from16 v0, v45

    .line 1288
    .line 1289
    goto :goto_29

    .line 1290
    :cond_27
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v29

    .line 1294
    move/from16 v32, v0

    .line 1295
    .line 1296
    move-object/from16 v0, v29

    .line 1297
    .line 1298
    :goto_29
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 1299
    .line 1300
    .line 1301
    move/from16 v0, v33

    .line 1302
    .line 1303
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1304
    .line 1305
    .line 1306
    move-result v29

    .line 1307
    if-eqz v29, :cond_28

    .line 1308
    .line 1309
    move/from16 v33, v0

    .line 1310
    .line 1311
    move-object/from16 v0, v45

    .line 1312
    .line 1313
    goto :goto_2a

    .line 1314
    :cond_28
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v29

    .line 1318
    move/from16 v33, v0

    .line 1319
    .line 1320
    move-object/from16 v0, v29

    .line 1321
    .line 1322
    :goto_2a
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 1323
    .line 1324
    .line 1325
    move/from16 v0, v34

    .line 1326
    .line 1327
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1328
    .line 1329
    .line 1330
    move-result v29

    .line 1331
    if-eqz v29, :cond_29

    .line 1332
    .line 1333
    move/from16 v34, v0

    .line 1334
    .line 1335
    move-object/from16 v0, v45

    .line 1336
    .line 1337
    goto :goto_2b

    .line 1338
    :cond_29
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1339
    .line 1340
    .line 1341
    move-result-wide v48

    .line 1342
    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v29

    .line 1346
    move/from16 v34, v0

    .line 1347
    .line 1348
    move-object/from16 v0, v29

    .line 1349
    .line 1350
    :goto_2b
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 1351
    .line 1352
    .line 1353
    move/from16 v0, v35

    .line 1354
    .line 1355
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1356
    .line 1357
    .line 1358
    move-result v29

    .line 1359
    if-eqz v29, :cond_2a

    .line 1360
    .line 1361
    move/from16 v29, v4

    .line 1362
    .line 1363
    move/from16 v35, v5

    .line 1364
    .line 1365
    move-object/from16 v4, v45

    .line 1366
    .line 1367
    goto :goto_2c

    .line 1368
    :cond_2a
    move/from16 v29, v4

    .line 1369
    .line 1370
    move/from16 v35, v5

    .line 1371
    .line 1372
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1373
    .line 1374
    .line 1375
    move-result-wide v4

    .line 1376
    long-to-int v4, v4

    .line 1377
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v4

    .line 1381
    :goto_2c
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 1382
    .line 1383
    .line 1384
    move/from16 v4, v36

    .line 1385
    .line 1386
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v5

    .line 1390
    if-eqz v5, :cond_2b

    .line 1391
    .line 1392
    move/from16 v36, v6

    .line 1393
    .line 1394
    move-object/from16 v5, v45

    .line 1395
    .line 1396
    goto :goto_2d

    .line 1397
    :cond_2b
    move/from16 v36, v6

    .line 1398
    .line 1399
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 1400
    .line 1401
    .line 1402
    move-result-wide v5

    .line 1403
    long-to-int v5, v5

    .line 1404
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v5

    .line 1408
    :goto_2d
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 1409
    .line 1410
    .line 1411
    move/from16 v5, v37

    .line 1412
    .line 1413
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1414
    .line 1415
    .line 1416
    move-result v6

    .line 1417
    if-eqz v6, :cond_2c

    .line 1418
    .line 1419
    :goto_2e
    move-object/from16 v6, v45

    .line 1420
    .line 1421
    goto :goto_2f

    .line 1422
    :cond_2c
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v45

    .line 1426
    goto :goto_2e

    .line 1427
    :goto_2f
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1434
    .line 1435
    .line 1436
    move/from16 v2, v23

    .line 1437
    .line 1438
    move/from16 v23, v7

    .line 1439
    .line 1440
    move/from16 v7, v21

    .line 1441
    .line 1442
    move/from16 v21, v22

    .line 1443
    .line 1444
    move/from16 v22, v2

    .line 1445
    .line 1446
    move/from16 v37, v5

    .line 1447
    .line 1448
    move/from16 v6, v40

    .line 1449
    .line 1450
    move/from16 v2, v44

    .line 1451
    .line 1452
    move/from16 v5, v46

    .line 1453
    .line 1454
    move/from16 v3, v52

    .line 1455
    .line 1456
    move/from16 v40, v16

    .line 1457
    .line 1458
    move/from16 v16, v38

    .line 1459
    .line 1460
    move/from16 v38, v20

    .line 1461
    .line 1462
    move/from16 v20, v24

    .line 1463
    .line 1464
    move/from16 v24, v25

    .line 1465
    .line 1466
    move/from16 v25, v36

    .line 1467
    .line 1468
    move/from16 v36, v4

    .line 1469
    .line 1470
    move/from16 v4, v43

    .line 1471
    .line 1472
    move/from16 v43, v41

    .line 1473
    .line 1474
    move/from16 v41, v39

    .line 1475
    .line 1476
    move/from16 v39, v19

    .line 1477
    .line 1478
    move/from16 v19, v27

    .line 1479
    .line 1480
    move/from16 v27, v28

    .line 1481
    .line 1482
    move/from16 v28, v30

    .line 1483
    .line 1484
    move/from16 v30, v35

    .line 1485
    .line 1486
    move/from16 v35, v0

    .line 1487
    .line 1488
    move/from16 v0, v47

    .line 1489
    .line 1490
    goto/16 :goto_0

    .line 1491
    .line 1492
    :cond_2d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1493
    .line 1494
    .line 1495
    return-object v9

    .line 1496
    :goto_30
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1497
    .line 1498
    .line 1499
    throw v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 60

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Los0;->n:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Lx34;

    .line 11
    .line 12
    iget-object v0, v0, Los0;->o:Lss0;

    .line 13
    .line 14
    iget-object v0, v0, Lss0;->p:Ljava/lang/Object;

    .line 15
    .line 16
    const-string v0, "SELECT * FROM download WHERE download_state = 1 ORDER BY IFNULL(NULLIF(album_artist, \'\'), album), album, album_id, disc_number, track ASC"

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :try_start_0
    const-string v0, "id"

    .line 23
    .line 24
    invoke-static {v1, v0}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const-string v2, "playlist_id"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const-string v3, "playlist_name"

    .line 35
    .line 36
    invoke-static {v1, v3}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const-string v4, "download_state"

    .line 41
    .line 42
    invoke-static {v1, v4}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-string v5, "download_uri"

    .line 47
    .line 48
    invoke-static {v1, v5}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    const-string v6, "parent_id"

    .line 53
    .line 54
    invoke-static {v1, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const-string v7, "is_dir"

    .line 59
    .line 60
    invoke-static {v1, v7}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    const-string v8, "title"

    .line 65
    .line 66
    invoke-static {v1, v8}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v8

    .line 70
    const-string v9, "album"

    .line 71
    .line 72
    invoke-static {v1, v9}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    const-string v10, "artist"

    .line 77
    .line 78
    invoke-static {v1, v10}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v10

    .line 82
    const-string v11, "track"

    .line 83
    .line 84
    invoke-static {v1, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    const-string v12, "year"

    .line 89
    .line 90
    invoke-static {v1, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    const-string v13, "genre"

    .line 95
    .line 96
    invoke-static {v1, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    const-string v14, "cover_art_id"

    .line 101
    .line 102
    invoke-static {v1, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    const-string v15, "size"

    .line 107
    .line 108
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    move/from16 p0, v15

    .line 113
    .line 114
    const-string v15, "content_type"

    .line 115
    .line 116
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    move/from16 p1, v15

    .line 121
    .line 122
    const-string v15, "suffix"

    .line 123
    .line 124
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    move/from16 v16, v15

    .line 129
    .line 130
    const-string v15, "transcoding_content_type"

    .line 131
    .line 132
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    move/from16 v17, v15

    .line 137
    .line 138
    const-string v15, "transcoded_suffix"

    .line 139
    .line 140
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    move/from16 v18, v15

    .line 145
    .line 146
    const-string v15, "duration"

    .line 147
    .line 148
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    move/from16 v19, v15

    .line 153
    .line 154
    const-string v15, "bitrate"

    .line 155
    .line 156
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    move/from16 v20, v15

    .line 161
    .line 162
    const-string v15, "sampling_rate"

    .line 163
    .line 164
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    move/from16 v21, v15

    .line 169
    .line 170
    const-string v15, "bit_depth"

    .line 171
    .line 172
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    move/from16 v22, v15

    .line 177
    .line 178
    const-string v15, "path"

    .line 179
    .line 180
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    move/from16 v23, v15

    .line 185
    .line 186
    const-string v15, "is_video"

    .line 187
    .line 188
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    move/from16 v24, v15

    .line 193
    .line 194
    const-string v15, "user_rating"

    .line 195
    .line 196
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    move/from16 v25, v15

    .line 201
    .line 202
    const-string v15, "average_rating"

    .line 203
    .line 204
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v15

    .line 208
    move/from16 v26, v15

    .line 209
    .line 210
    const-string v15, "play_count"

    .line 211
    .line 212
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    move/from16 v27, v15

    .line 217
    .line 218
    const-string v15, "disc_number"

    .line 219
    .line 220
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v15

    .line 224
    move/from16 v28, v15

    .line 225
    .line 226
    const-string v15, "created"

    .line 227
    .line 228
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    move/from16 v29, v15

    .line 233
    .line 234
    const-string v15, "starred"

    .line 235
    .line 236
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    move/from16 v30, v15

    .line 241
    .line 242
    const-string v15, "album_id"

    .line 243
    .line 244
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    move/from16 v31, v15

    .line 249
    .line 250
    const-string v15, "artist_id"

    .line 251
    .line 252
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    move/from16 v32, v15

    .line 257
    .line 258
    const-string v15, "type"

    .line 259
    .line 260
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 261
    .line 262
    .line 263
    move-result v15

    .line 264
    move/from16 v33, v15

    .line 265
    .line 266
    const-string v15, "bookmark_position"

    .line 267
    .line 268
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 269
    .line 270
    .line 271
    move-result v15

    .line 272
    move/from16 v34, v15

    .line 273
    .line 274
    const-string v15, "original_width"

    .line 275
    .line 276
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 277
    .line 278
    .line 279
    move-result v15

    .line 280
    move/from16 v35, v15

    .line 281
    .line 282
    const-string v15, "original_height"

    .line 283
    .line 284
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 285
    .line 286
    .line 287
    move-result v15

    .line 288
    move/from16 v36, v15

    .line 289
    .line 290
    const-string v15, "album_artist"

    .line 291
    .line 292
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 293
    .line 294
    .line 295
    move-result v15

    .line 296
    move/from16 v37, v15

    .line 297
    .line 298
    const-string v15, "rg_track_gain"

    .line 299
    .line 300
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    move/from16 v38, v14

    .line 305
    .line 306
    const-string v14, "rg_album_gain"

    .line 307
    .line 308
    invoke-static {v1, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    move/from16 v39, v13

    .line 313
    .line 314
    const-string v13, "rg_track_peak"

    .line 315
    .line 316
    invoke-static {v1, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 317
    .line 318
    .line 319
    move-result v13

    .line 320
    move/from16 v40, v12

    .line 321
    .line 322
    const-string v12, "rg_album_peak"

    .line 323
    .line 324
    invoke-static {v1, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    move/from16 v41, v11

    .line 329
    .line 330
    const-string v11, "rg_base_gain"

    .line 331
    .line 332
    invoke-static {v1, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    move-result v11

    .line 336
    move/from16 v42, v10

    .line 337
    .line 338
    const-string v10, "rg_fallback_gain"

    .line 339
    .line 340
    invoke-static {v1, v10}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v10

    .line 344
    move/from16 v43, v9

    .line 345
    .line 346
    new-instance v9, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 349
    .line 350
    .line 351
    :goto_0
    invoke-interface {v1}, Lz34;->O()Z

    .line 352
    .line 353
    .line 354
    move-result v44

    .line 355
    if-eqz v44, :cond_2d

    .line 356
    .line 357
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 358
    .line 359
    .line 360
    move-result v44

    .line 361
    const/16 v45, 0x0

    .line 362
    .line 363
    if-eqz v44, :cond_0

    .line 364
    .line 365
    move-object/from16 v47, v45

    .line 366
    .line 367
    goto :goto_1

    .line 368
    :cond_0
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v44

    .line 372
    move-object/from16 v47, v44

    .line 373
    .line 374
    :goto_1
    invoke-interface {v1, v2}, Lz34;->isNull(I)Z

    .line 375
    .line 376
    .line 377
    move-result v44

    .line 378
    if-eqz v44, :cond_1

    .line 379
    .line 380
    move-object/from16 v48, v45

    .line 381
    .line 382
    goto :goto_2

    .line 383
    :cond_1
    invoke-interface {v1, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v44

    .line 387
    move-object/from16 v48, v44

    .line 388
    .line 389
    :goto_2
    invoke-interface {v1, v3}, Lz34;->isNull(I)Z

    .line 390
    .line 391
    .line 392
    move-result v44

    .line 393
    if-eqz v44, :cond_2

    .line 394
    .line 395
    move-object/from16 v49, v45

    .line 396
    .line 397
    move/from16 v44, v2

    .line 398
    .line 399
    move/from16 v52, v3

    .line 400
    .line 401
    goto :goto_3

    .line 402
    :cond_2
    invoke-interface {v1, v3}, Lz34;->D(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v44

    .line 406
    move-object/from16 v49, v44

    .line 407
    .line 408
    move/from16 v52, v3

    .line 409
    .line 410
    move/from16 v44, v2

    .line 411
    .line 412
    :goto_3
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 413
    .line 414
    .line 415
    move-result-wide v2

    .line 416
    long-to-int v2, v2

    .line 417
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-eqz v3, :cond_3

    .line 422
    .line 423
    move-object/from16 v51, v45

    .line 424
    .line 425
    goto :goto_4

    .line 426
    :cond_3
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    move-object/from16 v51, v3

    .line 431
    .line 432
    :goto_4
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    if-eqz v3, :cond_5

    .line 437
    .line 438
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-eqz v3, :cond_5

    .line 443
    .line 444
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_5

    .line 449
    .line 450
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_5

    .line 455
    .line 456
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    if-eqz v3, :cond_5

    .line 461
    .line 462
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    if-nez v3, :cond_4

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_4
    move/from16 v50, v2

    .line 470
    .line 471
    move-object/from16 v2, v45

    .line 472
    .line 473
    goto/16 :goto_c

    .line 474
    .line 475
    :catchall_0
    move-exception v0

    .line 476
    goto/16 :goto_30

    .line 477
    .line 478
    :cond_5
    :goto_5
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-eqz v3, :cond_6

    .line 483
    .line 484
    move/from16 v50, v2

    .line 485
    .line 486
    move-object/from16 v54, v45

    .line 487
    .line 488
    goto :goto_6

    .line 489
    :cond_6
    move/from16 v50, v2

    .line 490
    .line 491
    invoke-interface {v1, v15}, Lz34;->getDouble(I)D

    .line 492
    .line 493
    .line 494
    move-result-wide v2

    .line 495
    double-to-float v2, v2

    .line 496
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    move-object/from16 v54, v2

    .line 501
    .line 502
    :goto_6
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 503
    .line 504
    .line 505
    move-result v2

    .line 506
    if-eqz v2, :cond_7

    .line 507
    .line 508
    move-object/from16 v55, v45

    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_7
    invoke-interface {v1, v14}, Lz34;->getDouble(I)D

    .line 512
    .line 513
    .line 514
    move-result-wide v2

    .line 515
    double-to-float v2, v2

    .line 516
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    move-object/from16 v55, v2

    .line 521
    .line 522
    :goto_7
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 523
    .line 524
    .line 525
    move-result v2

    .line 526
    if-eqz v2, :cond_8

    .line 527
    .line 528
    move-object/from16 v56, v45

    .line 529
    .line 530
    goto :goto_8

    .line 531
    :cond_8
    invoke-interface {v1, v13}, Lz34;->getDouble(I)D

    .line 532
    .line 533
    .line 534
    move-result-wide v2

    .line 535
    double-to-float v2, v2

    .line 536
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    move-object/from16 v56, v2

    .line 541
    .line 542
    :goto_8
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    if-eqz v2, :cond_9

    .line 547
    .line 548
    move-object/from16 v57, v45

    .line 549
    .line 550
    goto :goto_9

    .line 551
    :cond_9
    invoke-interface {v1, v12}, Lz34;->getDouble(I)D

    .line 552
    .line 553
    .line 554
    move-result-wide v2

    .line 555
    double-to-float v2, v2

    .line 556
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    move-object/from16 v57, v2

    .line 561
    .line 562
    :goto_9
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    if-eqz v2, :cond_a

    .line 567
    .line 568
    move-object/from16 v58, v45

    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_a
    invoke-interface {v1, v11}, Lz34;->getDouble(I)D

    .line 572
    .line 573
    .line 574
    move-result-wide v2

    .line 575
    double-to-float v2, v2

    .line 576
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    move-object/from16 v58, v2

    .line 581
    .line 582
    :goto_a
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    if-eqz v2, :cond_b

    .line 587
    .line 588
    move-object/from16 v59, v45

    .line 589
    .line 590
    goto :goto_b

    .line 591
    :cond_b
    invoke-interface {v1, v10}, Lz34;->getDouble(I)D

    .line 592
    .line 593
    .line 594
    move-result-wide v2

    .line 595
    double-to-float v2, v2

    .line 596
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    move-object/from16 v59, v2

    .line 601
    .line 602
    :goto_b
    new-instance v53, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 603
    .line 604
    invoke-direct/range {v53 .. v59}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 605
    .line 606
    .line 607
    move-object/from16 v2, v53

    .line 608
    .line 609
    :goto_c
    new-instance v46, Lcom/eddyizm/tempus/model/Download;

    .line 610
    .line 611
    invoke-direct/range {v46 .. v51}, Lcom/eddyizm/tempus/model/Download;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 612
    .line 613
    .line 614
    move-object/from16 v3, v46

    .line 615
    .line 616
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 617
    .line 618
    .line 619
    move-result v46

    .line 620
    if-eqz v46, :cond_c

    .line 621
    .line 622
    move/from16 v47, v0

    .line 623
    .line 624
    move-object/from16 v0, v45

    .line 625
    .line 626
    goto :goto_d

    .line 627
    :cond_c
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v46

    .line 631
    move/from16 v47, v0

    .line 632
    .line 633
    move-object/from16 v0, v46

    .line 634
    .line 635
    :goto_d
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    move v0, v4

    .line 639
    move/from16 v46, v5

    .line 640
    .line 641
    invoke-interface {v1, v7}, Lz34;->getLong(I)J

    .line 642
    .line 643
    .line 644
    move-result-wide v4

    .line 645
    long-to-int v4, v4

    .line 646
    const/16 v48, 0x1

    .line 647
    .line 648
    if-eqz v4, :cond_d

    .line 649
    .line 650
    move/from16 v4, v48

    .line 651
    .line 652
    goto :goto_e

    .line 653
    :cond_d
    const/4 v4, 0x0

    .line 654
    :goto_e
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 655
    .line 656
    .line 657
    invoke-interface {v1, v8}, Lz34;->isNull(I)Z

    .line 658
    .line 659
    .line 660
    move-result v4

    .line 661
    if-eqz v4, :cond_e

    .line 662
    .line 663
    move-object/from16 v4, v45

    .line 664
    .line 665
    goto :goto_f

    .line 666
    :cond_e
    invoke-interface {v1, v8}, Lz34;->D(I)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v4

    .line 670
    :goto_f
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 671
    .line 672
    .line 673
    move/from16 v4, v43

    .line 674
    .line 675
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 676
    .line 677
    .line 678
    move-result v43

    .line 679
    if-eqz v43, :cond_f

    .line 680
    .line 681
    move-object/from16 v5, v45

    .line 682
    .line 683
    goto :goto_10

    .line 684
    :cond_f
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v43

    .line 688
    move-object/from16 v5, v43

    .line 689
    .line 690
    :goto_10
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    move/from16 v5, v42

    .line 694
    .line 695
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 696
    .line 697
    .line 698
    move-result v42

    .line 699
    if-eqz v42, :cond_10

    .line 700
    .line 701
    move/from16 v43, v0

    .line 702
    .line 703
    move-object/from16 v0, v45

    .line 704
    .line 705
    goto :goto_11

    .line 706
    :cond_10
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v42

    .line 710
    move/from16 v43, v0

    .line 711
    .line 712
    move-object/from16 v0, v42

    .line 713
    .line 714
    :goto_11
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    move/from16 v0, v41

    .line 718
    .line 719
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 720
    .line 721
    .line 722
    move-result v41

    .line 723
    if-eqz v41, :cond_11

    .line 724
    .line 725
    move/from16 v41, v4

    .line 726
    .line 727
    move/from16 v42, v5

    .line 728
    .line 729
    move-object/from16 v4, v45

    .line 730
    .line 731
    goto :goto_12

    .line 732
    :cond_11
    move/from16 v41, v4

    .line 733
    .line 734
    move/from16 v42, v5

    .line 735
    .line 736
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 737
    .line 738
    .line 739
    move-result-wide v4

    .line 740
    long-to-int v4, v4

    .line 741
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    :goto_12
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 746
    .line 747
    .line 748
    move/from16 v4, v40

    .line 749
    .line 750
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 751
    .line 752
    .line 753
    move-result v5

    .line 754
    if-eqz v5, :cond_12

    .line 755
    .line 756
    move/from16 v40, v6

    .line 757
    .line 758
    move-object/from16 v5, v45

    .line 759
    .line 760
    goto :goto_13

    .line 761
    :cond_12
    move/from16 v40, v6

    .line 762
    .line 763
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 764
    .line 765
    .line 766
    move-result-wide v5

    .line 767
    long-to-int v5, v5

    .line 768
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 769
    .line 770
    .line 771
    move-result-object v5

    .line 772
    :goto_13
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 773
    .line 774
    .line 775
    move/from16 v5, v39

    .line 776
    .line 777
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 778
    .line 779
    .line 780
    move-result v6

    .line 781
    if-eqz v6, :cond_13

    .line 782
    .line 783
    move-object/from16 v6, v45

    .line 784
    .line 785
    goto :goto_14

    .line 786
    :cond_13
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v6

    .line 790
    :goto_14
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 791
    .line 792
    .line 793
    move/from16 v6, v38

    .line 794
    .line 795
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 796
    .line 797
    .line 798
    move-result v38

    .line 799
    if-eqz v38, :cond_14

    .line 800
    .line 801
    move/from16 v39, v0

    .line 802
    .line 803
    move-object/from16 v0, v45

    .line 804
    .line 805
    goto :goto_15

    .line 806
    :cond_14
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v38

    .line 810
    move/from16 v39, v0

    .line 811
    .line 812
    move-object/from16 v0, v38

    .line 813
    .line 814
    :goto_15
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    move/from16 v0, p0

    .line 818
    .line 819
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 820
    .line 821
    .line 822
    move-result v38

    .line 823
    if-eqz v38, :cond_15

    .line 824
    .line 825
    move/from16 p0, v0

    .line 826
    .line 827
    move-object/from16 v0, v45

    .line 828
    .line 829
    goto :goto_16

    .line 830
    :cond_15
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 831
    .line 832
    .line 833
    move-result-wide v50

    .line 834
    invoke-static/range {v50 .. v51}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 835
    .line 836
    .line 837
    move-result-object v38

    .line 838
    move/from16 p0, v0

    .line 839
    .line 840
    move-object/from16 v0, v38

    .line 841
    .line 842
    :goto_16
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 843
    .line 844
    .line 845
    move/from16 v0, p1

    .line 846
    .line 847
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 848
    .line 849
    .line 850
    move-result v38

    .line 851
    if-eqz v38, :cond_16

    .line 852
    .line 853
    move/from16 p1, v0

    .line 854
    .line 855
    move-object/from16 v0, v45

    .line 856
    .line 857
    goto :goto_17

    .line 858
    :cond_16
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v38

    .line 862
    move/from16 p1, v0

    .line 863
    .line 864
    move-object/from16 v0, v38

    .line 865
    .line 866
    :goto_17
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 867
    .line 868
    .line 869
    move/from16 v0, v16

    .line 870
    .line 871
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 872
    .line 873
    .line 874
    move-result v16

    .line 875
    if-eqz v16, :cond_17

    .line 876
    .line 877
    move/from16 v38, v0

    .line 878
    .line 879
    move-object/from16 v0, v45

    .line 880
    .line 881
    goto :goto_18

    .line 882
    :cond_17
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v16

    .line 886
    move/from16 v38, v0

    .line 887
    .line 888
    move-object/from16 v0, v16

    .line 889
    .line 890
    :goto_18
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    move/from16 v0, v17

    .line 894
    .line 895
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 896
    .line 897
    .line 898
    move-result v16

    .line 899
    if-eqz v16, :cond_18

    .line 900
    .line 901
    move/from16 v17, v0

    .line 902
    .line 903
    move-object/from16 v0, v45

    .line 904
    .line 905
    goto :goto_19

    .line 906
    :cond_18
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v16

    .line 910
    move/from16 v17, v0

    .line 911
    .line 912
    move-object/from16 v0, v16

    .line 913
    .line 914
    :goto_19
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    move/from16 v0, v18

    .line 918
    .line 919
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 920
    .line 921
    .line 922
    move-result v16

    .line 923
    if-eqz v16, :cond_19

    .line 924
    .line 925
    move/from16 v18, v0

    .line 926
    .line 927
    move-object/from16 v0, v45

    .line 928
    .line 929
    goto :goto_1a

    .line 930
    :cond_19
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v16

    .line 934
    move/from16 v18, v0

    .line 935
    .line 936
    move-object/from16 v0, v16

    .line 937
    .line 938
    :goto_1a
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    move/from16 v0, v19

    .line 942
    .line 943
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 944
    .line 945
    .line 946
    move-result v16

    .line 947
    if-eqz v16, :cond_1a

    .line 948
    .line 949
    move/from16 v16, v4

    .line 950
    .line 951
    move/from16 v19, v5

    .line 952
    .line 953
    move-object/from16 v4, v45

    .line 954
    .line 955
    goto :goto_1b

    .line 956
    :cond_1a
    move/from16 v16, v4

    .line 957
    .line 958
    move/from16 v19, v5

    .line 959
    .line 960
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 961
    .line 962
    .line 963
    move-result-wide v4

    .line 964
    long-to-int v4, v4

    .line 965
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 966
    .line 967
    .line 968
    move-result-object v4

    .line 969
    :goto_1b
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 970
    .line 971
    .line 972
    move/from16 v4, v20

    .line 973
    .line 974
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 975
    .line 976
    .line 977
    move-result v5

    .line 978
    if-eqz v5, :cond_1b

    .line 979
    .line 980
    move/from16 v20, v6

    .line 981
    .line 982
    move-object/from16 v5, v45

    .line 983
    .line 984
    goto :goto_1c

    .line 985
    :cond_1b
    move/from16 v20, v6

    .line 986
    .line 987
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 988
    .line 989
    .line 990
    move-result-wide v5

    .line 991
    long-to-int v5, v5

    .line 992
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 993
    .line 994
    .line 995
    move-result-object v5

    .line 996
    :goto_1c
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 997
    .line 998
    .line 999
    move/from16 v5, v21

    .line 1000
    .line 1001
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v6

    .line 1005
    if-eqz v6, :cond_1c

    .line 1006
    .line 1007
    move/from16 v21, v7

    .line 1008
    .line 1009
    move-object/from16 v6, v45

    .line 1010
    .line 1011
    goto :goto_1d

    .line 1012
    :cond_1c
    move/from16 v21, v7

    .line 1013
    .line 1014
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1015
    .line 1016
    .line 1017
    move-result-wide v6

    .line 1018
    long-to-int v6, v6

    .line 1019
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v6

    .line 1023
    :goto_1d
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 1024
    .line 1025
    .line 1026
    move/from16 v6, v22

    .line 1027
    .line 1028
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v7

    .line 1032
    if-eqz v7, :cond_1d

    .line 1033
    .line 1034
    move v7, v4

    .line 1035
    move/from16 v22, v5

    .line 1036
    .line 1037
    move-object/from16 v4, v45

    .line 1038
    .line 1039
    goto :goto_1e

    .line 1040
    :cond_1d
    move v7, v4

    .line 1041
    move/from16 v22, v5

    .line 1042
    .line 1043
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 1044
    .line 1045
    .line 1046
    move-result-wide v4

    .line 1047
    long-to-int v4, v4

    .line 1048
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v4

    .line 1052
    :goto_1e
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 1053
    .line 1054
    .line 1055
    move/from16 v4, v23

    .line 1056
    .line 1057
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v5

    .line 1061
    if-eqz v5, :cond_1e

    .line 1062
    .line 1063
    move-object/from16 v5, v45

    .line 1064
    .line 1065
    goto :goto_1f

    .line 1066
    :cond_1e
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    :goto_1f
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 1071
    .line 1072
    .line 1073
    move/from16 v23, v6

    .line 1074
    .line 1075
    move/from16 v5, v24

    .line 1076
    .line 1077
    move/from16 v24, v7

    .line 1078
    .line 1079
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1080
    .line 1081
    .line 1082
    move-result-wide v6

    .line 1083
    long-to-int v6, v6

    .line 1084
    if-eqz v6, :cond_1f

    .line 1085
    .line 1086
    move/from16 v6, v48

    .line 1087
    .line 1088
    goto :goto_20

    .line 1089
    :cond_1f
    const/4 v6, 0x0

    .line 1090
    :goto_20
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 1091
    .line 1092
    .line 1093
    move/from16 v6, v25

    .line 1094
    .line 1095
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v7

    .line 1099
    if-eqz v7, :cond_20

    .line 1100
    .line 1101
    move v7, v4

    .line 1102
    move/from16 v25, v5

    .line 1103
    .line 1104
    move-object/from16 v4, v45

    .line 1105
    .line 1106
    goto :goto_21

    .line 1107
    :cond_20
    move v7, v4

    .line 1108
    move/from16 v25, v5

    .line 1109
    .line 1110
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 1111
    .line 1112
    .line 1113
    move-result-wide v4

    .line 1114
    long-to-int v4, v4

    .line 1115
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v4

    .line 1119
    :goto_21
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 1120
    .line 1121
    .line 1122
    move/from16 v4, v26

    .line 1123
    .line 1124
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1125
    .line 1126
    .line 1127
    move-result v5

    .line 1128
    if-eqz v5, :cond_21

    .line 1129
    .line 1130
    move-object/from16 v5, v45

    .line 1131
    .line 1132
    goto :goto_22

    .line 1133
    :cond_21
    invoke-interface {v1, v4}, Lz34;->getDouble(I)D

    .line 1134
    .line 1135
    .line 1136
    move-result-wide v48

    .line 1137
    invoke-static/range {v48 .. v49}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v5

    .line 1141
    :goto_22
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 1142
    .line 1143
    .line 1144
    move/from16 v5, v27

    .line 1145
    .line 1146
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v26

    .line 1150
    if-eqz v26, :cond_22

    .line 1151
    .line 1152
    move/from16 v27, v0

    .line 1153
    .line 1154
    move-object/from16 v0, v45

    .line 1155
    .line 1156
    goto :goto_23

    .line 1157
    :cond_22
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1158
    .line 1159
    .line 1160
    move-result-wide v26

    .line 1161
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v26

    .line 1165
    move/from16 v27, v0

    .line 1166
    .line 1167
    move-object/from16 v0, v26

    .line 1168
    .line 1169
    :goto_23
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 1170
    .line 1171
    .line 1172
    move/from16 v0, v28

    .line 1173
    .line 1174
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v26

    .line 1178
    if-eqz v26, :cond_23

    .line 1179
    .line 1180
    move/from16 v26, v4

    .line 1181
    .line 1182
    move/from16 v28, v5

    .line 1183
    .line 1184
    move-object/from16 v4, v45

    .line 1185
    .line 1186
    goto :goto_24

    .line 1187
    :cond_23
    move/from16 v26, v4

    .line 1188
    .line 1189
    move/from16 v28, v5

    .line 1190
    .line 1191
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1192
    .line 1193
    .line 1194
    move-result-wide v4

    .line 1195
    long-to-int v4, v4

    .line 1196
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    :goto_24
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 1201
    .line 1202
    .line 1203
    move/from16 v4, v29

    .line 1204
    .line 1205
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v5

    .line 1209
    if-eqz v5, :cond_24

    .line 1210
    .line 1211
    move-object/from16 v5, v45

    .line 1212
    .line 1213
    goto :goto_25

    .line 1214
    :cond_24
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 1215
    .line 1216
    .line 1217
    move-result-wide v48

    .line 1218
    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v5

    .line 1222
    :goto_25
    invoke-static {v5}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v5

    .line 1226
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 1227
    .line 1228
    .line 1229
    move/from16 v5, v30

    .line 1230
    .line 1231
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v29

    .line 1235
    if-eqz v29, :cond_25

    .line 1236
    .line 1237
    move-object/from16 v29, v45

    .line 1238
    .line 1239
    :goto_26
    move/from16 v30, v0

    .line 1240
    .line 1241
    goto :goto_27

    .line 1242
    :cond_25
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1243
    .line 1244
    .line 1245
    move-result-wide v29

    .line 1246
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v29

    .line 1250
    goto :goto_26

    .line 1251
    :goto_27
    invoke-static/range {v29 .. v29}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 1256
    .line 1257
    .line 1258
    move/from16 v0, v31

    .line 1259
    .line 1260
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v29

    .line 1264
    if-eqz v29, :cond_26

    .line 1265
    .line 1266
    move/from16 v31, v0

    .line 1267
    .line 1268
    move-object/from16 v0, v45

    .line 1269
    .line 1270
    goto :goto_28

    .line 1271
    :cond_26
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v29

    .line 1275
    move/from16 v31, v0

    .line 1276
    .line 1277
    move-object/from16 v0, v29

    .line 1278
    .line 1279
    :goto_28
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 1280
    .line 1281
    .line 1282
    move/from16 v0, v32

    .line 1283
    .line 1284
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v29

    .line 1288
    if-eqz v29, :cond_27

    .line 1289
    .line 1290
    move/from16 v32, v0

    .line 1291
    .line 1292
    move-object/from16 v0, v45

    .line 1293
    .line 1294
    goto :goto_29

    .line 1295
    :cond_27
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v29

    .line 1299
    move/from16 v32, v0

    .line 1300
    .line 1301
    move-object/from16 v0, v29

    .line 1302
    .line 1303
    :goto_29
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 1304
    .line 1305
    .line 1306
    move/from16 v0, v33

    .line 1307
    .line 1308
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v29

    .line 1312
    if-eqz v29, :cond_28

    .line 1313
    .line 1314
    move/from16 v33, v0

    .line 1315
    .line 1316
    move-object/from16 v0, v45

    .line 1317
    .line 1318
    goto :goto_2a

    .line 1319
    :cond_28
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v29

    .line 1323
    move/from16 v33, v0

    .line 1324
    .line 1325
    move-object/from16 v0, v29

    .line 1326
    .line 1327
    :goto_2a
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 1328
    .line 1329
    .line 1330
    move/from16 v0, v34

    .line 1331
    .line 1332
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1333
    .line 1334
    .line 1335
    move-result v29

    .line 1336
    if-eqz v29, :cond_29

    .line 1337
    .line 1338
    move/from16 v34, v0

    .line 1339
    .line 1340
    move-object/from16 v0, v45

    .line 1341
    .line 1342
    goto :goto_2b

    .line 1343
    :cond_29
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1344
    .line 1345
    .line 1346
    move-result-wide v48

    .line 1347
    invoke-static/range {v48 .. v49}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v29

    .line 1351
    move/from16 v34, v0

    .line 1352
    .line 1353
    move-object/from16 v0, v29

    .line 1354
    .line 1355
    :goto_2b
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 1356
    .line 1357
    .line 1358
    move/from16 v0, v35

    .line 1359
    .line 1360
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1361
    .line 1362
    .line 1363
    move-result v29

    .line 1364
    if-eqz v29, :cond_2a

    .line 1365
    .line 1366
    move/from16 v29, v4

    .line 1367
    .line 1368
    move/from16 v35, v5

    .line 1369
    .line 1370
    move-object/from16 v4, v45

    .line 1371
    .line 1372
    goto :goto_2c

    .line 1373
    :cond_2a
    move/from16 v29, v4

    .line 1374
    .line 1375
    move/from16 v35, v5

    .line 1376
    .line 1377
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1378
    .line 1379
    .line 1380
    move-result-wide v4

    .line 1381
    long-to-int v4, v4

    .line 1382
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v4

    .line 1386
    :goto_2c
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 1387
    .line 1388
    .line 1389
    move/from16 v4, v36

    .line 1390
    .line 1391
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1392
    .line 1393
    .line 1394
    move-result v5

    .line 1395
    if-eqz v5, :cond_2b

    .line 1396
    .line 1397
    move/from16 v36, v6

    .line 1398
    .line 1399
    move-object/from16 v5, v45

    .line 1400
    .line 1401
    goto :goto_2d

    .line 1402
    :cond_2b
    move/from16 v36, v6

    .line 1403
    .line 1404
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 1405
    .line 1406
    .line 1407
    move-result-wide v5

    .line 1408
    long-to-int v5, v5

    .line 1409
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v5

    .line 1413
    :goto_2d
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 1414
    .line 1415
    .line 1416
    move/from16 v5, v37

    .line 1417
    .line 1418
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1419
    .line 1420
    .line 1421
    move-result v6

    .line 1422
    if-eqz v6, :cond_2c

    .line 1423
    .line 1424
    :goto_2e
    move-object/from16 v6, v45

    .line 1425
    .line 1426
    goto :goto_2f

    .line 1427
    :cond_2c
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v45

    .line 1431
    goto :goto_2e

    .line 1432
    :goto_2f
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1439
    .line 1440
    .line 1441
    move/from16 v2, v23

    .line 1442
    .line 1443
    move/from16 v23, v7

    .line 1444
    .line 1445
    move/from16 v7, v21

    .line 1446
    .line 1447
    move/from16 v21, v22

    .line 1448
    .line 1449
    move/from16 v22, v2

    .line 1450
    .line 1451
    move/from16 v37, v5

    .line 1452
    .line 1453
    move/from16 v6, v40

    .line 1454
    .line 1455
    move/from16 v2, v44

    .line 1456
    .line 1457
    move/from16 v5, v46

    .line 1458
    .line 1459
    move/from16 v3, v52

    .line 1460
    .line 1461
    move/from16 v40, v16

    .line 1462
    .line 1463
    move/from16 v16, v38

    .line 1464
    .line 1465
    move/from16 v38, v20

    .line 1466
    .line 1467
    move/from16 v20, v24

    .line 1468
    .line 1469
    move/from16 v24, v25

    .line 1470
    .line 1471
    move/from16 v25, v36

    .line 1472
    .line 1473
    move/from16 v36, v4

    .line 1474
    .line 1475
    move/from16 v4, v43

    .line 1476
    .line 1477
    move/from16 v43, v41

    .line 1478
    .line 1479
    move/from16 v41, v39

    .line 1480
    .line 1481
    move/from16 v39, v19

    .line 1482
    .line 1483
    move/from16 v19, v27

    .line 1484
    .line 1485
    move/from16 v27, v28

    .line 1486
    .line 1487
    move/from16 v28, v30

    .line 1488
    .line 1489
    move/from16 v30, v35

    .line 1490
    .line 1491
    move/from16 v35, v0

    .line 1492
    .line 1493
    move/from16 v0, v47

    .line 1494
    .line 1495
    goto/16 :goto_0

    .line 1496
    .line 1497
    :cond_2d
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1498
    .line 1499
    .line 1500
    return-object v9

    .line 1501
    :goto_30
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1502
    .line 1503
    .line 1504
    throw v0

    .line 1505
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Los0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v0

    .line 1509
    return-object v0

    .line 1510
    nop

    .line 1511
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
