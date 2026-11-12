.class public final synthetic Lks3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lns3;


# direct methods
.method public synthetic constructor <init>(Lns3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lks3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lks3;->o:Lns3;

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
    iget-object v1, v1, Lks3;->o:Lns3;

    .line 8
    .line 9
    iget-object v1, v1, Lns3;->q:Ljava/lang/Object;

    .line 10
    .line 11
    const-string v1, "SELECT * FROM queue ORDER BY last_play DESC LIMIT 1"

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
    const-string v2, "track_order"

    .line 24
    .line 25
    invoke-static {v1, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const-string v3, "last_play"

    .line 30
    .line 31
    invoke-static {v1, v3}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    const-string v4, "playing_changed"

    .line 36
    .line 37
    invoke-static {v1, v4}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const-string v5, "stream_id"

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
    invoke-interface {v1}, Lz34;->O()Z

    .line 340
    .line 341
    .line 342
    move-result v43

    .line 343
    const/16 v44, 0x0

    .line 344
    .line 345
    if-eqz v43, :cond_2b

    .line 346
    .line 347
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 348
    .line 349
    .line 350
    move-result v43

    .line 351
    if-eqz v43, :cond_0

    .line 352
    .line 353
    move-object/from16 v46, v44

    .line 354
    .line 355
    :goto_0
    move v0, v8

    .line 356
    move/from16 v43, v9

    .line 357
    .line 358
    goto :goto_1

    .line 359
    :cond_0
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    move-object/from16 v46, v0

    .line 364
    .line 365
    goto :goto_0

    .line 366
    :goto_1
    invoke-interface {v1, v2}, Lz34;->getLong(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v8

    .line 370
    long-to-int v2, v8

    .line 371
    invoke-interface {v1, v3}, Lz34;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v48

    .line 375
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 376
    .line 377
    .line 378
    move-result-wide v50

    .line 379
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-eqz v3, :cond_1

    .line 384
    .line 385
    move-object/from16 v52, v44

    .line 386
    .line 387
    goto :goto_2

    .line 388
    :cond_1
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    move-object/from16 v52, v3

    .line 393
    .line 394
    :goto_2
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 395
    .line 396
    .line 397
    move-result v3

    .line 398
    if-eqz v3, :cond_3

    .line 399
    .line 400
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    if-eqz v3, :cond_3

    .line 405
    .line 406
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-eqz v3, :cond_3

    .line 411
    .line 412
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    if-eqz v3, :cond_3

    .line 417
    .line 418
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 419
    .line 420
    .line 421
    move-result v3

    .line 422
    if-eqz v3, :cond_3

    .line 423
    .line 424
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    if-nez v3, :cond_2

    .line 429
    .line 430
    goto :goto_3

    .line 431
    :cond_2
    move-object/from16 v3, v44

    .line 432
    .line 433
    goto/16 :goto_a

    .line 434
    .line 435
    :catchall_0
    move-exception v0

    .line 436
    goto/16 :goto_2c

    .line 437
    .line 438
    :cond_3
    :goto_3
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-eqz v3, :cond_4

    .line 443
    .line 444
    move-object/from16 v54, v44

    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_4
    invoke-interface {v1, v15}, Lz34;->getDouble(I)D

    .line 448
    .line 449
    .line 450
    move-result-wide v3

    .line 451
    double-to-float v3, v3

    .line 452
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    move-object/from16 v54, v3

    .line 457
    .line 458
    :goto_4
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    if-eqz v3, :cond_5

    .line 463
    .line 464
    move-object/from16 v55, v44

    .line 465
    .line 466
    goto :goto_5

    .line 467
    :cond_5
    invoke-interface {v1, v14}, Lz34;->getDouble(I)D

    .line 468
    .line 469
    .line 470
    move-result-wide v3

    .line 471
    double-to-float v3, v3

    .line 472
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    move-object/from16 v55, v3

    .line 477
    .line 478
    :goto_5
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-eqz v3, :cond_6

    .line 483
    .line 484
    move-object/from16 v56, v44

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_6
    invoke-interface {v1, v13}, Lz34;->getDouble(I)D

    .line 488
    .line 489
    .line 490
    move-result-wide v3

    .line 491
    double-to-float v3, v3

    .line 492
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    move-object/from16 v56, v3

    .line 497
    .line 498
    :goto_6
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    if-eqz v3, :cond_7

    .line 503
    .line 504
    move-object/from16 v57, v44

    .line 505
    .line 506
    goto :goto_7

    .line 507
    :cond_7
    invoke-interface {v1, v12}, Lz34;->getDouble(I)D

    .line 508
    .line 509
    .line 510
    move-result-wide v3

    .line 511
    double-to-float v3, v3

    .line 512
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    move-object/from16 v57, v3

    .line 517
    .line 518
    :goto_7
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    if-eqz v3, :cond_8

    .line 523
    .line 524
    move-object/from16 v58, v44

    .line 525
    .line 526
    goto :goto_8

    .line 527
    :cond_8
    invoke-interface {v1, v11}, Lz34;->getDouble(I)D

    .line 528
    .line 529
    .line 530
    move-result-wide v3

    .line 531
    double-to-float v3, v3

    .line 532
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    move-object/from16 v58, v3

    .line 537
    .line 538
    :goto_8
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 539
    .line 540
    .line 541
    move-result v3

    .line 542
    if-eqz v3, :cond_9

    .line 543
    .line 544
    move-object/from16 v59, v44

    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_9
    invoke-interface {v1, v10}, Lz34;->getDouble(I)D

    .line 548
    .line 549
    .line 550
    move-result-wide v3

    .line 551
    double-to-float v3, v3

    .line 552
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    move-object/from16 v59, v3

    .line 557
    .line 558
    :goto_9
    new-instance v53, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 559
    .line 560
    invoke-direct/range {v53 .. v59}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v3, v53

    .line 564
    .line 565
    :goto_a
    new-instance v45, Lcom/eddyizm/tempus/model/Queue;

    .line 566
    .line 567
    move/from16 v47, v2

    .line 568
    .line 569
    invoke-direct/range {v45 .. v52}, Lcom/eddyizm/tempus/model/Queue;-><init>(Ljava/lang/String;IJJLjava/lang/String;)V

    .line 570
    .line 571
    .line 572
    move-object/from16 v2, v45

    .line 573
    .line 574
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    if-eqz v4, :cond_a

    .line 579
    .line 580
    move-object/from16 v4, v44

    .line 581
    .line 582
    goto :goto_b

    .line 583
    :cond_a
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    :goto_b
    invoke-virtual {v2, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v1, v7}, Lz34;->getLong(I)J

    .line 591
    .line 592
    .line 593
    move-result-wide v4

    .line 594
    long-to-int v4, v4

    .line 595
    const/4 v5, 0x0

    .line 596
    const/4 v6, 0x1

    .line 597
    if-eqz v4, :cond_b

    .line 598
    .line 599
    move v4, v6

    .line 600
    goto :goto_c

    .line 601
    :cond_b
    move v4, v5

    .line 602
    :goto_c
    invoke-virtual {v2, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 603
    .line 604
    .line 605
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 606
    .line 607
    .line 608
    move-result v4

    .line 609
    if-eqz v4, :cond_c

    .line 610
    .line 611
    move-object/from16 v0, v44

    .line 612
    .line 613
    goto :goto_d

    .line 614
    :cond_c
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    :goto_d
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    move/from16 v0, v43

    .line 622
    .line 623
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 624
    .line 625
    .line 626
    move-result v4

    .line 627
    if-eqz v4, :cond_d

    .line 628
    .line 629
    move-object/from16 v0, v44

    .line 630
    .line 631
    goto :goto_e

    .line 632
    :cond_d
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    :goto_e
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    move/from16 v0, v42

    .line 640
    .line 641
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    if-eqz v4, :cond_e

    .line 646
    .line 647
    move-object/from16 v0, v44

    .line 648
    .line 649
    goto :goto_f

    .line 650
    :cond_e
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    :goto_f
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    move/from16 v0, v41

    .line 658
    .line 659
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 660
    .line 661
    .line 662
    move-result v4

    .line 663
    if-eqz v4, :cond_f

    .line 664
    .line 665
    move-object/from16 v0, v44

    .line 666
    .line 667
    goto :goto_10

    .line 668
    :cond_f
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 669
    .line 670
    .line 671
    move-result-wide v7

    .line 672
    long-to-int v0, v7

    .line 673
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    :goto_10
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 678
    .line 679
    .line 680
    move/from16 v0, v40

    .line 681
    .line 682
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    if-eqz v4, :cond_10

    .line 687
    .line 688
    move-object/from16 v0, v44

    .line 689
    .line 690
    goto :goto_11

    .line 691
    :cond_10
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 692
    .line 693
    .line 694
    move-result-wide v7

    .line 695
    long-to-int v0, v7

    .line 696
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    :goto_11
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 701
    .line 702
    .line 703
    move/from16 v0, v39

    .line 704
    .line 705
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 706
    .line 707
    .line 708
    move-result v4

    .line 709
    if-eqz v4, :cond_11

    .line 710
    .line 711
    move-object/from16 v0, v44

    .line 712
    .line 713
    goto :goto_12

    .line 714
    :cond_11
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    :goto_12
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    move/from16 v0, v38

    .line 722
    .line 723
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    if-eqz v4, :cond_12

    .line 728
    .line 729
    move-object/from16 v0, v44

    .line 730
    .line 731
    goto :goto_13

    .line 732
    :cond_12
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    :goto_13
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    move/from16 v0, p0

    .line 740
    .line 741
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    if-eqz v4, :cond_13

    .line 746
    .line 747
    move-object/from16 v0, v44

    .line 748
    .line 749
    goto :goto_14

    .line 750
    :cond_13
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 751
    .line 752
    .line 753
    move-result-wide v7

    .line 754
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    :goto_14
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 759
    .line 760
    .line 761
    move/from16 v0, p1

    .line 762
    .line 763
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 764
    .line 765
    .line 766
    move-result v4

    .line 767
    if-eqz v4, :cond_14

    .line 768
    .line 769
    move-object/from16 v0, v44

    .line 770
    .line 771
    goto :goto_15

    .line 772
    :cond_14
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    :goto_15
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    move/from16 v0, v16

    .line 780
    .line 781
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 782
    .line 783
    .line 784
    move-result v4

    .line 785
    if-eqz v4, :cond_15

    .line 786
    .line 787
    move-object/from16 v0, v44

    .line 788
    .line 789
    goto :goto_16

    .line 790
    :cond_15
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    :goto_16
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    move/from16 v0, v17

    .line 798
    .line 799
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    if-eqz v4, :cond_16

    .line 804
    .line 805
    move-object/from16 v0, v44

    .line 806
    .line 807
    goto :goto_17

    .line 808
    :cond_16
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    :goto_17
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    move/from16 v0, v18

    .line 816
    .line 817
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 818
    .line 819
    .line 820
    move-result v4

    .line 821
    if-eqz v4, :cond_17

    .line 822
    .line 823
    move-object/from16 v0, v44

    .line 824
    .line 825
    goto :goto_18

    .line 826
    :cond_17
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    :goto_18
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    move/from16 v0, v19

    .line 834
    .line 835
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 836
    .line 837
    .line 838
    move-result v4

    .line 839
    if-eqz v4, :cond_18

    .line 840
    .line 841
    move-object/from16 v0, v44

    .line 842
    .line 843
    goto :goto_19

    .line 844
    :cond_18
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 845
    .line 846
    .line 847
    move-result-wide v7

    .line 848
    long-to-int v0, v7

    .line 849
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    :goto_19
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 854
    .line 855
    .line 856
    move/from16 v0, v20

    .line 857
    .line 858
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 859
    .line 860
    .line 861
    move-result v4

    .line 862
    if-eqz v4, :cond_19

    .line 863
    .line 864
    move-object/from16 v0, v44

    .line 865
    .line 866
    goto :goto_1a

    .line 867
    :cond_19
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 868
    .line 869
    .line 870
    move-result-wide v7

    .line 871
    long-to-int v0, v7

    .line 872
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    :goto_1a
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 877
    .line 878
    .line 879
    move/from16 v0, v21

    .line 880
    .line 881
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 882
    .line 883
    .line 884
    move-result v4

    .line 885
    if-eqz v4, :cond_1a

    .line 886
    .line 887
    move-object/from16 v0, v44

    .line 888
    .line 889
    goto :goto_1b

    .line 890
    :cond_1a
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 891
    .line 892
    .line 893
    move-result-wide v7

    .line 894
    long-to-int v0, v7

    .line 895
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    :goto_1b
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 900
    .line 901
    .line 902
    move/from16 v0, v22

    .line 903
    .line 904
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 905
    .line 906
    .line 907
    move-result v4

    .line 908
    if-eqz v4, :cond_1b

    .line 909
    .line 910
    move-object/from16 v0, v44

    .line 911
    .line 912
    goto :goto_1c

    .line 913
    :cond_1b
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 914
    .line 915
    .line 916
    move-result-wide v7

    .line 917
    long-to-int v0, v7

    .line 918
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    :goto_1c
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 923
    .line 924
    .line 925
    move/from16 v0, v23

    .line 926
    .line 927
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 928
    .line 929
    .line 930
    move-result v4

    .line 931
    if-eqz v4, :cond_1c

    .line 932
    .line 933
    move-object/from16 v0, v44

    .line 934
    .line 935
    goto :goto_1d

    .line 936
    :cond_1c
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    :goto_1d
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    move/from16 v0, v24

    .line 944
    .line 945
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 946
    .line 947
    .line 948
    move-result-wide v7

    .line 949
    long-to-int v0, v7

    .line 950
    if-eqz v0, :cond_1d

    .line 951
    .line 952
    move v5, v6

    .line 953
    :cond_1d
    invoke-virtual {v2, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 954
    .line 955
    .line 956
    move/from16 v0, v25

    .line 957
    .line 958
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 959
    .line 960
    .line 961
    move-result v4

    .line 962
    if-eqz v4, :cond_1e

    .line 963
    .line 964
    move-object/from16 v0, v44

    .line 965
    .line 966
    goto :goto_1e

    .line 967
    :cond_1e
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 968
    .line 969
    .line 970
    move-result-wide v4

    .line 971
    long-to-int v0, v4

    .line 972
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 973
    .line 974
    .line 975
    move-result-object v0

    .line 976
    :goto_1e
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 977
    .line 978
    .line 979
    move/from16 v0, v26

    .line 980
    .line 981
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 982
    .line 983
    .line 984
    move-result v4

    .line 985
    if-eqz v4, :cond_1f

    .line 986
    .line 987
    move-object/from16 v0, v44

    .line 988
    .line 989
    goto :goto_1f

    .line 990
    :cond_1f
    invoke-interface {v1, v0}, Lz34;->getDouble(I)D

    .line 991
    .line 992
    .line 993
    move-result-wide v4

    .line 994
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    :goto_1f
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 999
    .line 1000
    .line 1001
    move/from16 v0, v27

    .line 1002
    .line 1003
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v4

    .line 1007
    if-eqz v4, :cond_20

    .line 1008
    .line 1009
    move-object/from16 v0, v44

    .line 1010
    .line 1011
    goto :goto_20

    .line 1012
    :cond_20
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1013
    .line 1014
    .line 1015
    move-result-wide v4

    .line 1016
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    :goto_20
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 1021
    .line 1022
    .line 1023
    move/from16 v0, v28

    .line 1024
    .line 1025
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1026
    .line 1027
    .line 1028
    move-result v4

    .line 1029
    if-eqz v4, :cond_21

    .line 1030
    .line 1031
    move-object/from16 v0, v44

    .line 1032
    .line 1033
    goto :goto_21

    .line 1034
    :cond_21
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1035
    .line 1036
    .line 1037
    move-result-wide v4

    .line 1038
    long-to-int v0, v4

    .line 1039
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    :goto_21
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 1044
    .line 1045
    .line 1046
    move/from16 v0, v29

    .line 1047
    .line 1048
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1049
    .line 1050
    .line 1051
    move-result v4

    .line 1052
    if-eqz v4, :cond_22

    .line 1053
    .line 1054
    move-object/from16 v0, v44

    .line 1055
    .line 1056
    goto :goto_22

    .line 1057
    :cond_22
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1058
    .line 1059
    .line 1060
    move-result-wide v4

    .line 1061
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    :goto_22
    invoke-static {v0}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 1070
    .line 1071
    .line 1072
    move/from16 v0, v30

    .line 1073
    .line 1074
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1075
    .line 1076
    .line 1077
    move-result v4

    .line 1078
    if-eqz v4, :cond_23

    .line 1079
    .line 1080
    move-object/from16 v0, v44

    .line 1081
    .line 1082
    goto :goto_23

    .line 1083
    :cond_23
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v4

    .line 1087
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v0

    .line 1091
    :goto_23
    invoke-static {v0}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 1096
    .line 1097
    .line 1098
    move/from16 v0, v31

    .line 1099
    .line 1100
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1101
    .line 1102
    .line 1103
    move-result v4

    .line 1104
    if-eqz v4, :cond_24

    .line 1105
    .line 1106
    move-object/from16 v0, v44

    .line 1107
    .line 1108
    goto :goto_24

    .line 1109
    :cond_24
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    :goto_24
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    move/from16 v0, v32

    .line 1117
    .line 1118
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v4

    .line 1122
    if-eqz v4, :cond_25

    .line 1123
    .line 1124
    move-object/from16 v0, v44

    .line 1125
    .line 1126
    goto :goto_25

    .line 1127
    :cond_25
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    :goto_25
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 1132
    .line 1133
    .line 1134
    move/from16 v0, v33

    .line 1135
    .line 1136
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1137
    .line 1138
    .line 1139
    move-result v4

    .line 1140
    if-eqz v4, :cond_26

    .line 1141
    .line 1142
    move-object/from16 v0, v44

    .line 1143
    .line 1144
    goto :goto_26

    .line 1145
    :cond_26
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    :goto_26
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    move/from16 v0, v34

    .line 1153
    .line 1154
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1155
    .line 1156
    .line 1157
    move-result v4

    .line 1158
    if-eqz v4, :cond_27

    .line 1159
    .line 1160
    move-object/from16 v0, v44

    .line 1161
    .line 1162
    goto :goto_27

    .line 1163
    :cond_27
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1164
    .line 1165
    .line 1166
    move-result-wide v4

    .line 1167
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    :goto_27
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 1172
    .line 1173
    .line 1174
    move/from16 v0, v35

    .line 1175
    .line 1176
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v4

    .line 1180
    if-eqz v4, :cond_28

    .line 1181
    .line 1182
    move-object/from16 v0, v44

    .line 1183
    .line 1184
    goto :goto_28

    .line 1185
    :cond_28
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v4

    .line 1189
    long-to-int v0, v4

    .line 1190
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    :goto_28
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 1195
    .line 1196
    .line 1197
    move/from16 v0, v36

    .line 1198
    .line 1199
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1200
    .line 1201
    .line 1202
    move-result v4

    .line 1203
    if-eqz v4, :cond_29

    .line 1204
    .line 1205
    move-object/from16 v0, v44

    .line 1206
    .line 1207
    goto :goto_29

    .line 1208
    :cond_29
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1209
    .line 1210
    .line 1211
    move-result-wide v4

    .line 1212
    long-to-int v0, v4

    .line 1213
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    :goto_29
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 1218
    .line 1219
    .line 1220
    move/from16 v0, v37

    .line 1221
    .line 1222
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1223
    .line 1224
    .line 1225
    move-result v4

    .line 1226
    if-eqz v4, :cond_2a

    .line 1227
    .line 1228
    :goto_2a
    move-object/from16 v0, v44

    .line 1229
    .line 1230
    goto :goto_2b

    .line 1231
    :cond_2a
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v44

    .line 1235
    goto :goto_2a

    .line 1236
    :goto_2b
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v2, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1240
    .line 1241
    .line 1242
    move-object/from16 v44, v2

    .line 1243
    .line 1244
    :cond_2b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1245
    .line 1246
    .line 1247
    return-object v44

    .line 1248
    :goto_2c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1249
    .line 1250
    .line 1251
    throw v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 63

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lks3;->n:I

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
    iget-object v0, v0, Lks3;->o:Lns3;

    .line 13
    .line 14
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 15
    .line 16
    const-string v0, "SELECT * FROM queue ORDER BY track_order ASC"

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
    const-string v2, "track_order"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const-string v3, "last_play"

    .line 35
    .line 36
    invoke-static {v1, v3}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const-string v4, "playing_changed"

    .line 41
    .line 42
    invoke-static {v1, v4}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const-string v5, "stream_id"

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
    if-eqz v44, :cond_2b

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
    move/from16 v44, v8

    .line 368
    .line 369
    move-object/from16 v54, v9

    .line 370
    .line 371
    goto :goto_1

    .line 372
    :cond_0
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v44

    .line 376
    move-object/from16 v47, v44

    .line 377
    .line 378
    move-object/from16 v54, v9

    .line 379
    .line 380
    move/from16 v44, v8

    .line 381
    .line 382
    :goto_1
    invoke-interface {v1, v2}, Lz34;->getLong(I)J

    .line 383
    .line 384
    .line 385
    move-result-wide v8

    .line 386
    long-to-int v8, v8

    .line 387
    invoke-interface {v1, v3}, Lz34;->getLong(I)J

    .line 388
    .line 389
    .line 390
    move-result-wide v49

    .line 391
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v51

    .line 395
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 396
    .line 397
    .line 398
    move-result v9

    .line 399
    if-eqz v9, :cond_1

    .line 400
    .line 401
    move-object/from16 v53, v45

    .line 402
    .line 403
    goto :goto_2

    .line 404
    :cond_1
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    move-object/from16 v53, v9

    .line 409
    .line 410
    :goto_2
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 411
    .line 412
    .line 413
    move-result v9

    .line 414
    if-eqz v9, :cond_3

    .line 415
    .line 416
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 417
    .line 418
    .line 419
    move-result v9

    .line 420
    if-eqz v9, :cond_3

    .line 421
    .line 422
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 423
    .line 424
    .line 425
    move-result v9

    .line 426
    if-eqz v9, :cond_3

    .line 427
    .line 428
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 429
    .line 430
    .line 431
    move-result v9

    .line 432
    if-eqz v9, :cond_3

    .line 433
    .line 434
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 435
    .line 436
    .line 437
    move-result v9

    .line 438
    if-eqz v9, :cond_3

    .line 439
    .line 440
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    if-nez v9, :cond_2

    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_2
    move v9, v2

    .line 448
    move/from16 v55, v3

    .line 449
    .line 450
    move-object/from16 v2, v45

    .line 451
    .line 452
    goto/16 :goto_a

    .line 453
    .line 454
    :catchall_0
    move-exception v0

    .line 455
    goto/16 :goto_2e

    .line 456
    .line 457
    :cond_3
    :goto_3
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    if-eqz v9, :cond_4

    .line 462
    .line 463
    move v9, v2

    .line 464
    move/from16 v55, v3

    .line 465
    .line 466
    move-object/from16 v57, v45

    .line 467
    .line 468
    goto :goto_4

    .line 469
    :cond_4
    move v9, v2

    .line 470
    move/from16 v55, v3

    .line 471
    .line 472
    invoke-interface {v1, v15}, Lz34;->getDouble(I)D

    .line 473
    .line 474
    .line 475
    move-result-wide v2

    .line 476
    double-to-float v2, v2

    .line 477
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    move-object/from16 v57, v2

    .line 482
    .line 483
    :goto_4
    invoke-interface {v1, v14}, Lz34;->isNull(I)Z

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-eqz v2, :cond_5

    .line 488
    .line 489
    move-object/from16 v58, v45

    .line 490
    .line 491
    goto :goto_5

    .line 492
    :cond_5
    invoke-interface {v1, v14}, Lz34;->getDouble(I)D

    .line 493
    .line 494
    .line 495
    move-result-wide v2

    .line 496
    double-to-float v2, v2

    .line 497
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    move-object/from16 v58, v2

    .line 502
    .line 503
    :goto_5
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    if-eqz v2, :cond_6

    .line 508
    .line 509
    move-object/from16 v59, v45

    .line 510
    .line 511
    goto :goto_6

    .line 512
    :cond_6
    invoke-interface {v1, v13}, Lz34;->getDouble(I)D

    .line 513
    .line 514
    .line 515
    move-result-wide v2

    .line 516
    double-to-float v2, v2

    .line 517
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    move-object/from16 v59, v2

    .line 522
    .line 523
    :goto_6
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 524
    .line 525
    .line 526
    move-result v2

    .line 527
    if-eqz v2, :cond_7

    .line 528
    .line 529
    move-object/from16 v60, v45

    .line 530
    .line 531
    goto :goto_7

    .line 532
    :cond_7
    invoke-interface {v1, v12}, Lz34;->getDouble(I)D

    .line 533
    .line 534
    .line 535
    move-result-wide v2

    .line 536
    double-to-float v2, v2

    .line 537
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    move-object/from16 v60, v2

    .line 542
    .line 543
    :goto_7
    invoke-interface {v1, v11}, Lz34;->isNull(I)Z

    .line 544
    .line 545
    .line 546
    move-result v2

    .line 547
    if-eqz v2, :cond_8

    .line 548
    .line 549
    move-object/from16 v61, v45

    .line 550
    .line 551
    goto :goto_8

    .line 552
    :cond_8
    invoke-interface {v1, v11}, Lz34;->getDouble(I)D

    .line 553
    .line 554
    .line 555
    move-result-wide v2

    .line 556
    double-to-float v2, v2

    .line 557
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    move-object/from16 v61, v2

    .line 562
    .line 563
    :goto_8
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    if-eqz v2, :cond_9

    .line 568
    .line 569
    move-object/from16 v62, v45

    .line 570
    .line 571
    goto :goto_9

    .line 572
    :cond_9
    invoke-interface {v1, v10}, Lz34;->getDouble(I)D

    .line 573
    .line 574
    .line 575
    move-result-wide v2

    .line 576
    double-to-float v2, v2

    .line 577
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    move-object/from16 v62, v2

    .line 582
    .line 583
    :goto_9
    new-instance v56, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 584
    .line 585
    invoke-direct/range {v56 .. v62}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 586
    .line 587
    .line 588
    move-object/from16 v2, v56

    .line 589
    .line 590
    :goto_a
    new-instance v46, Lcom/eddyizm/tempus/model/Queue;

    .line 591
    .line 592
    move/from16 v48, v8

    .line 593
    .line 594
    invoke-direct/range {v46 .. v53}, Lcom/eddyizm/tempus/model/Queue;-><init>(Ljava/lang/String;IJJLjava/lang/String;)V

    .line 595
    .line 596
    .line 597
    move-object/from16 v3, v46

    .line 598
    .line 599
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 600
    .line 601
    .line 602
    move-result v8

    .line 603
    if-eqz v8, :cond_a

    .line 604
    .line 605
    move-object/from16 v8, v45

    .line 606
    .line 607
    goto :goto_b

    .line 608
    :cond_a
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v8

    .line 612
    :goto_b
    invoke-virtual {v3, v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->setParentId(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    move v8, v4

    .line 616
    move/from16 v46, v5

    .line 617
    .line 618
    invoke-interface {v1, v7}, Lz34;->getLong(I)J

    .line 619
    .line 620
    .line 621
    move-result-wide v4

    .line 622
    long-to-int v4, v4

    .line 623
    const/16 v47, 0x1

    .line 624
    .line 625
    if-eqz v4, :cond_b

    .line 626
    .line 627
    move/from16 v4, v47

    .line 628
    .line 629
    goto :goto_c

    .line 630
    :cond_b
    const/4 v4, 0x0

    .line 631
    :goto_c
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDir(Z)V

    .line 632
    .line 633
    .line 634
    move/from16 v4, v44

    .line 635
    .line 636
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 637
    .line 638
    .line 639
    move-result v44

    .line 640
    if-eqz v44, :cond_c

    .line 641
    .line 642
    move-object/from16 v5, v45

    .line 643
    .line 644
    goto :goto_d

    .line 645
    :cond_c
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v44

    .line 649
    move-object/from16 v5, v44

    .line 650
    .line 651
    :goto_d
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    move/from16 v5, v43

    .line 655
    .line 656
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 657
    .line 658
    .line 659
    move-result v43

    .line 660
    if-eqz v43, :cond_d

    .line 661
    .line 662
    move/from16 v44, v0

    .line 663
    .line 664
    move-object/from16 v0, v45

    .line 665
    .line 666
    goto :goto_e

    .line 667
    :cond_d
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v43

    .line 671
    move/from16 v44, v0

    .line 672
    .line 673
    move-object/from16 v0, v43

    .line 674
    .line 675
    :goto_e
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    move/from16 v0, v42

    .line 679
    .line 680
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 681
    .line 682
    .line 683
    move-result v42

    .line 684
    if-eqz v42, :cond_e

    .line 685
    .line 686
    move/from16 v43, v0

    .line 687
    .line 688
    move-object/from16 v0, v45

    .line 689
    .line 690
    goto :goto_f

    .line 691
    :cond_e
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v42

    .line 695
    move/from16 v43, v0

    .line 696
    .line 697
    move-object/from16 v0, v42

    .line 698
    .line 699
    :goto_f
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    move/from16 v0, v41

    .line 703
    .line 704
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 705
    .line 706
    .line 707
    move-result v41

    .line 708
    if-eqz v41, :cond_f

    .line 709
    .line 710
    move/from16 v41, v4

    .line 711
    .line 712
    move/from16 v42, v5

    .line 713
    .line 714
    move-object/from16 v4, v45

    .line 715
    .line 716
    goto :goto_10

    .line 717
    :cond_f
    move/from16 v41, v4

    .line 718
    .line 719
    move/from16 v42, v5

    .line 720
    .line 721
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 722
    .line 723
    .line 724
    move-result-wide v4

    .line 725
    long-to-int v4, v4

    .line 726
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 727
    .line 728
    .line 729
    move-result-object v4

    .line 730
    :goto_10
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 731
    .line 732
    .line 733
    move/from16 v4, v40

    .line 734
    .line 735
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    if-eqz v5, :cond_10

    .line 740
    .line 741
    move/from16 v40, v6

    .line 742
    .line 743
    move-object/from16 v5, v45

    .line 744
    .line 745
    goto :goto_11

    .line 746
    :cond_10
    move/from16 v40, v6

    .line 747
    .line 748
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 749
    .line 750
    .line 751
    move-result-wide v5

    .line 752
    long-to-int v5, v5

    .line 753
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    :goto_11
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setYear(Ljava/lang/Integer;)V

    .line 758
    .line 759
    .line 760
    move/from16 v5, v39

    .line 761
    .line 762
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    if-eqz v6, :cond_11

    .line 767
    .line 768
    move-object/from16 v6, v45

    .line 769
    .line 770
    goto :goto_12

    .line 771
    :cond_11
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    :goto_12
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setGenre(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    move/from16 v6, v38

    .line 779
    .line 780
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 781
    .line 782
    .line 783
    move-result v38

    .line 784
    if-eqz v38, :cond_12

    .line 785
    .line 786
    move/from16 v39, v0

    .line 787
    .line 788
    move-object/from16 v0, v45

    .line 789
    .line 790
    goto :goto_13

    .line 791
    :cond_12
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v38

    .line 795
    move/from16 v39, v0

    .line 796
    .line 797
    move-object/from16 v0, v38

    .line 798
    .line 799
    :goto_13
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 800
    .line 801
    .line 802
    move/from16 v0, p0

    .line 803
    .line 804
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 805
    .line 806
    .line 807
    move-result v38

    .line 808
    if-eqz v38, :cond_13

    .line 809
    .line 810
    move/from16 p0, v0

    .line 811
    .line 812
    move-object/from16 v0, v45

    .line 813
    .line 814
    goto :goto_14

    .line 815
    :cond_13
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 816
    .line 817
    .line 818
    move-result-wide v49

    .line 819
    invoke-static/range {v49 .. v50}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 820
    .line 821
    .line 822
    move-result-object v38

    .line 823
    move/from16 p0, v0

    .line 824
    .line 825
    move-object/from16 v0, v38

    .line 826
    .line 827
    :goto_14
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSize(Ljava/lang/Long;)V

    .line 828
    .line 829
    .line 830
    move/from16 v0, p1

    .line 831
    .line 832
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 833
    .line 834
    .line 835
    move-result v38

    .line 836
    if-eqz v38, :cond_14

    .line 837
    .line 838
    move/from16 p1, v0

    .line 839
    .line 840
    move-object/from16 v0, v45

    .line 841
    .line 842
    goto :goto_15

    .line 843
    :cond_14
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v38

    .line 847
    move/from16 p1, v0

    .line 848
    .line 849
    move-object/from16 v0, v38

    .line 850
    .line 851
    :goto_15
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setContentType(Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    move/from16 v0, v16

    .line 855
    .line 856
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 857
    .line 858
    .line 859
    move-result v16

    .line 860
    if-eqz v16, :cond_15

    .line 861
    .line 862
    move/from16 v38, v0

    .line 863
    .line 864
    move-object/from16 v0, v45

    .line 865
    .line 866
    goto :goto_16

    .line 867
    :cond_15
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v16

    .line 871
    move/from16 v38, v0

    .line 872
    .line 873
    move-object/from16 v0, v16

    .line 874
    .line 875
    :goto_16
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSuffix(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    move/from16 v0, v17

    .line 879
    .line 880
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 881
    .line 882
    .line 883
    move-result v16

    .line 884
    if-eqz v16, :cond_16

    .line 885
    .line 886
    move/from16 v17, v0

    .line 887
    .line 888
    move-object/from16 v0, v45

    .line 889
    .line 890
    goto :goto_17

    .line 891
    :cond_16
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v16

    .line 895
    move/from16 v17, v0

    .line 896
    .line 897
    move-object/from16 v0, v16

    .line 898
    .line 899
    :goto_17
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedContentType(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    move/from16 v0, v18

    .line 903
    .line 904
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 905
    .line 906
    .line 907
    move-result v16

    .line 908
    if-eqz v16, :cond_17

    .line 909
    .line 910
    move/from16 v18, v0

    .line 911
    .line 912
    move-object/from16 v0, v45

    .line 913
    .line 914
    goto :goto_18

    .line 915
    :cond_17
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v16

    .line 919
    move/from16 v18, v0

    .line 920
    .line 921
    move-object/from16 v0, v16

    .line 922
    .line 923
    :goto_18
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTranscodedSuffix(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    move/from16 v0, v19

    .line 927
    .line 928
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 929
    .line 930
    .line 931
    move-result v16

    .line 932
    if-eqz v16, :cond_18

    .line 933
    .line 934
    move/from16 v16, v4

    .line 935
    .line 936
    move/from16 v19, v5

    .line 937
    .line 938
    move-object/from16 v4, v45

    .line 939
    .line 940
    goto :goto_19

    .line 941
    :cond_18
    move/from16 v16, v4

    .line 942
    .line 943
    move/from16 v19, v5

    .line 944
    .line 945
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 946
    .line 947
    .line 948
    move-result-wide v4

    .line 949
    long-to-int v4, v4

    .line 950
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 951
    .line 952
    .line 953
    move-result-object v4

    .line 954
    :goto_19
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 955
    .line 956
    .line 957
    move/from16 v4, v20

    .line 958
    .line 959
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 960
    .line 961
    .line 962
    move-result v5

    .line 963
    if-eqz v5, :cond_19

    .line 964
    .line 965
    move/from16 v20, v6

    .line 966
    .line 967
    move-object/from16 v5, v45

    .line 968
    .line 969
    goto :goto_1a

    .line 970
    :cond_19
    move/from16 v20, v6

    .line 971
    .line 972
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 973
    .line 974
    .line 975
    move-result-wide v5

    .line 976
    long-to-int v5, v5

    .line 977
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 978
    .line 979
    .line 980
    move-result-object v5

    .line 981
    :goto_1a
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitrate(Ljava/lang/Integer;)V

    .line 982
    .line 983
    .line 984
    move/from16 v5, v21

    .line 985
    .line 986
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 987
    .line 988
    .line 989
    move-result v6

    .line 990
    if-eqz v6, :cond_1a

    .line 991
    .line 992
    move/from16 v21, v7

    .line 993
    .line 994
    move-object/from16 v6, v45

    .line 995
    .line 996
    goto :goto_1b

    .line 997
    :cond_1a
    move/from16 v21, v7

    .line 998
    .line 999
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1000
    .line 1001
    .line 1002
    move-result-wide v6

    .line 1003
    long-to-int v6, v6

    .line 1004
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v6

    .line 1008
    :goto_1b
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setSamplingRate(Ljava/lang/Integer;)V

    .line 1009
    .line 1010
    .line 1011
    move/from16 v6, v22

    .line 1012
    .line 1013
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 1014
    .line 1015
    .line 1016
    move-result v7

    .line 1017
    if-eqz v7, :cond_1b

    .line 1018
    .line 1019
    move v7, v4

    .line 1020
    move/from16 v22, v5

    .line 1021
    .line 1022
    move-object/from16 v4, v45

    .line 1023
    .line 1024
    goto :goto_1c

    .line 1025
    :cond_1b
    move v7, v4

    .line 1026
    move/from16 v22, v5

    .line 1027
    .line 1028
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v4

    .line 1032
    long-to-int v4, v4

    .line 1033
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v4

    .line 1037
    :goto_1c
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBitDepth(Ljava/lang/Integer;)V

    .line 1038
    .line 1039
    .line 1040
    move/from16 v4, v23

    .line 1041
    .line 1042
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v5

    .line 1046
    if-eqz v5, :cond_1c

    .line 1047
    .line 1048
    move-object/from16 v5, v45

    .line 1049
    .line 1050
    goto :goto_1d

    .line 1051
    :cond_1c
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v5

    .line 1055
    :goto_1d
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPath(Ljava/lang/String;)V

    .line 1056
    .line 1057
    .line 1058
    move/from16 v23, v6

    .line 1059
    .line 1060
    move/from16 v5, v24

    .line 1061
    .line 1062
    move/from16 v24, v7

    .line 1063
    .line 1064
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1065
    .line 1066
    .line 1067
    move-result-wide v6

    .line 1068
    long-to-int v6, v6

    .line 1069
    if-eqz v6, :cond_1d

    .line 1070
    .line 1071
    move/from16 v6, v47

    .line 1072
    .line 1073
    goto :goto_1e

    .line 1074
    :cond_1d
    const/4 v6, 0x0

    .line 1075
    :goto_1e
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setVideo(Z)V

    .line 1076
    .line 1077
    .line 1078
    move/from16 v6, v25

    .line 1079
    .line 1080
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v7

    .line 1084
    if-eqz v7, :cond_1e

    .line 1085
    .line 1086
    move v7, v4

    .line 1087
    move/from16 v25, v5

    .line 1088
    .line 1089
    move-object/from16 v4, v45

    .line 1090
    .line 1091
    goto :goto_1f

    .line 1092
    :cond_1e
    move v7, v4

    .line 1093
    move/from16 v25, v5

    .line 1094
    .line 1095
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 1096
    .line 1097
    .line 1098
    move-result-wide v4

    .line 1099
    long-to-int v4, v4

    .line 1100
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v4

    .line 1104
    :goto_1f
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setUserRating(Ljava/lang/Integer;)V

    .line 1105
    .line 1106
    .line 1107
    move/from16 v4, v26

    .line 1108
    .line 1109
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v5

    .line 1113
    if-eqz v5, :cond_1f

    .line 1114
    .line 1115
    move-object/from16 v5, v45

    .line 1116
    .line 1117
    goto :goto_20

    .line 1118
    :cond_1f
    invoke-interface {v1, v4}, Lz34;->getDouble(I)D

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v47

    .line 1122
    invoke-static/range {v47 .. v48}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v5

    .line 1126
    :goto_20
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAverageRating(Ljava/lang/Double;)V

    .line 1127
    .line 1128
    .line 1129
    move/from16 v5, v27

    .line 1130
    .line 1131
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1132
    .line 1133
    .line 1134
    move-result v26

    .line 1135
    if-eqz v26, :cond_20

    .line 1136
    .line 1137
    move/from16 v27, v0

    .line 1138
    .line 1139
    move-object/from16 v0, v45

    .line 1140
    .line 1141
    goto :goto_21

    .line 1142
    :cond_20
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1143
    .line 1144
    .line 1145
    move-result-wide v26

    .line 1146
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v26

    .line 1150
    move/from16 v27, v0

    .line 1151
    .line 1152
    move-object/from16 v0, v26

    .line 1153
    .line 1154
    :goto_21
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setPlayCount(Ljava/lang/Long;)V

    .line 1155
    .line 1156
    .line 1157
    move/from16 v0, v28

    .line 1158
    .line 1159
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1160
    .line 1161
    .line 1162
    move-result v26

    .line 1163
    if-eqz v26, :cond_21

    .line 1164
    .line 1165
    move/from16 v26, v4

    .line 1166
    .line 1167
    move/from16 v28, v5

    .line 1168
    .line 1169
    move-object/from16 v4, v45

    .line 1170
    .line 1171
    goto :goto_22

    .line 1172
    :cond_21
    move/from16 v26, v4

    .line 1173
    .line 1174
    move/from16 v28, v5

    .line 1175
    .line 1176
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1177
    .line 1178
    .line 1179
    move-result-wide v4

    .line 1180
    long-to-int v4, v4

    .line 1181
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v4

    .line 1185
    :goto_22
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 1186
    .line 1187
    .line 1188
    move/from16 v4, v29

    .line 1189
    .line 1190
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1191
    .line 1192
    .line 1193
    move-result v5

    .line 1194
    if-eqz v5, :cond_22

    .line 1195
    .line 1196
    move-object/from16 v5, v45

    .line 1197
    .line 1198
    goto :goto_23

    .line 1199
    :cond_22
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 1200
    .line 1201
    .line 1202
    move-result-wide v47

    .line 1203
    invoke-static/range {v47 .. v48}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v5

    .line 1207
    :goto_23
    invoke-static {v5}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v5

    .line 1211
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCreated(Ljava/util/Date;)V

    .line 1212
    .line 1213
    .line 1214
    move/from16 v5, v30

    .line 1215
    .line 1216
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v29

    .line 1220
    if-eqz v29, :cond_23

    .line 1221
    .line 1222
    move-object/from16 v29, v45

    .line 1223
    .line 1224
    :goto_24
    move/from16 v30, v0

    .line 1225
    .line 1226
    goto :goto_25

    .line 1227
    :cond_23
    invoke-interface {v1, v5}, Lz34;->getLong(I)J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v29

    .line 1231
    invoke-static/range {v29 .. v30}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v29

    .line 1235
    goto :goto_24

    .line 1236
    :goto_25
    invoke-static/range {v29 .. v29}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 1241
    .line 1242
    .line 1243
    move/from16 v0, v31

    .line 1244
    .line 1245
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v29

    .line 1249
    if-eqz v29, :cond_24

    .line 1250
    .line 1251
    move/from16 v31, v0

    .line 1252
    .line 1253
    move-object/from16 v0, v45

    .line 1254
    .line 1255
    goto :goto_26

    .line 1256
    :cond_24
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v29

    .line 1260
    move/from16 v31, v0

    .line 1261
    .line 1262
    move-object/from16 v0, v29

    .line 1263
    .line 1264
    :goto_26
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    move/from16 v0, v32

    .line 1268
    .line 1269
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v29

    .line 1273
    if-eqz v29, :cond_25

    .line 1274
    .line 1275
    move/from16 v32, v0

    .line 1276
    .line 1277
    move-object/from16 v0, v45

    .line 1278
    .line 1279
    goto :goto_27

    .line 1280
    :cond_25
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v29

    .line 1284
    move/from16 v32, v0

    .line 1285
    .line 1286
    move-object/from16 v0, v29

    .line 1287
    .line 1288
    :goto_27
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    move/from16 v0, v33

    .line 1292
    .line 1293
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1294
    .line 1295
    .line 1296
    move-result v29

    .line 1297
    if-eqz v29, :cond_26

    .line 1298
    .line 1299
    move/from16 v33, v0

    .line 1300
    .line 1301
    move-object/from16 v0, v45

    .line 1302
    .line 1303
    goto :goto_28

    .line 1304
    :cond_26
    invoke-interface {v1, v0}, Lz34;->D(I)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v29

    .line 1308
    move/from16 v33, v0

    .line 1309
    .line 1310
    move-object/from16 v0, v29

    .line 1311
    .line 1312
    :goto_28
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 1313
    .line 1314
    .line 1315
    move/from16 v0, v34

    .line 1316
    .line 1317
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1318
    .line 1319
    .line 1320
    move-result v29

    .line 1321
    if-eqz v29, :cond_27

    .line 1322
    .line 1323
    move/from16 v34, v0

    .line 1324
    .line 1325
    move-object/from16 v0, v45

    .line 1326
    .line 1327
    goto :goto_29

    .line 1328
    :cond_27
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1329
    .line 1330
    .line 1331
    move-result-wide v47

    .line 1332
    invoke-static/range {v47 .. v48}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v29

    .line 1336
    move/from16 v34, v0

    .line 1337
    .line 1338
    move-object/from16 v0, v29

    .line 1339
    .line 1340
    :goto_29
    invoke-virtual {v3, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setBookmarkPosition(Ljava/lang/Long;)V

    .line 1341
    .line 1342
    .line 1343
    move/from16 v0, v35

    .line 1344
    .line 1345
    invoke-interface {v1, v0}, Lz34;->isNull(I)Z

    .line 1346
    .line 1347
    .line 1348
    move-result v29

    .line 1349
    if-eqz v29, :cond_28

    .line 1350
    .line 1351
    move/from16 v29, v4

    .line 1352
    .line 1353
    move/from16 v35, v5

    .line 1354
    .line 1355
    move-object/from16 v4, v45

    .line 1356
    .line 1357
    goto :goto_2a

    .line 1358
    :cond_28
    move/from16 v29, v4

    .line 1359
    .line 1360
    move/from16 v35, v5

    .line 1361
    .line 1362
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 1363
    .line 1364
    .line 1365
    move-result-wide v4

    .line 1366
    long-to-int v4, v4

    .line 1367
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v4

    .line 1371
    :goto_2a
    invoke-virtual {v3, v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalWidth(Ljava/lang/Integer;)V

    .line 1372
    .line 1373
    .line 1374
    move/from16 v4, v36

    .line 1375
    .line 1376
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 1377
    .line 1378
    .line 1379
    move-result v5

    .line 1380
    if-eqz v5, :cond_29

    .line 1381
    .line 1382
    move/from16 v36, v6

    .line 1383
    .line 1384
    move-object/from16 v5, v45

    .line 1385
    .line 1386
    goto :goto_2b

    .line 1387
    :cond_29
    move/from16 v36, v6

    .line 1388
    .line 1389
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v5

    .line 1393
    long-to-int v5, v5

    .line 1394
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v5

    .line 1398
    :goto_2b
    invoke-virtual {v3, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setOriginalHeight(Ljava/lang/Integer;)V

    .line 1399
    .line 1400
    .line 1401
    move/from16 v5, v37

    .line 1402
    .line 1403
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 1404
    .line 1405
    .line 1406
    move-result v6

    .line 1407
    if-eqz v6, :cond_2a

    .line 1408
    .line 1409
    :goto_2c
    move-object/from16 v6, v45

    .line 1410
    .line 1411
    goto :goto_2d

    .line 1412
    :cond_2a
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v45

    .line 1416
    goto :goto_2c

    .line 1417
    :goto_2d
    invoke-virtual {v3, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumArtist(Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V

    .line 1421
    .line 1422
    .line 1423
    move-object/from16 v2, v54

    .line 1424
    .line 1425
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1426
    .line 1427
    .line 1428
    move v3, v9

    .line 1429
    move-object v9, v2

    .line 1430
    move v2, v3

    .line 1431
    move/from16 v3, v23

    .line 1432
    .line 1433
    move/from16 v23, v7

    .line 1434
    .line 1435
    move/from16 v7, v21

    .line 1436
    .line 1437
    move/from16 v21, v22

    .line 1438
    .line 1439
    move/from16 v22, v3

    .line 1440
    .line 1441
    move/from16 v3, v43

    .line 1442
    .line 1443
    move/from16 v43, v42

    .line 1444
    .line 1445
    move/from16 v42, v3

    .line 1446
    .line 1447
    move/from16 v37, v5

    .line 1448
    .line 1449
    move/from16 v6, v40

    .line 1450
    .line 1451
    move/from16 v5, v46

    .line 1452
    .line 1453
    move/from16 v3, v55

    .line 1454
    .line 1455
    move/from16 v40, v16

    .line 1456
    .line 1457
    move/from16 v16, v38

    .line 1458
    .line 1459
    move/from16 v38, v20

    .line 1460
    .line 1461
    move/from16 v20, v24

    .line 1462
    .line 1463
    move/from16 v24, v25

    .line 1464
    .line 1465
    move/from16 v25, v36

    .line 1466
    .line 1467
    move/from16 v36, v4

    .line 1468
    .line 1469
    move v4, v8

    .line 1470
    move/from16 v8, v41

    .line 1471
    .line 1472
    move/from16 v41, v39

    .line 1473
    .line 1474
    move/from16 v39, v19

    .line 1475
    .line 1476
    move/from16 v19, v27

    .line 1477
    .line 1478
    move/from16 v27, v28

    .line 1479
    .line 1480
    move/from16 v28, v30

    .line 1481
    .line 1482
    move/from16 v30, v35

    .line 1483
    .line 1484
    move/from16 v35, v0

    .line 1485
    .line 1486
    move/from16 v0, v44

    .line 1487
    .line 1488
    goto/16 :goto_0

    .line 1489
    .line 1490
    :cond_2b
    move-object v2, v9

    .line 1491
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1492
    .line 1493
    .line 1494
    return-object v2

    .line 1495
    :goto_2e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1496
    .line 1497
    .line 1498
    throw v0

    .line 1499
    :pswitch_0
    invoke-direct/range {p0 .. p1}, Lks3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    return-object v0

    .line 1504
    nop

    .line 1505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
