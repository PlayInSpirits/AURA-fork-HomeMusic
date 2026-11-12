.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()Lnc2;
    .locals 85

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, Loc2;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0}, Lsc5;->b(Landroid/content/Context;)Lsc5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->y()Lxc5;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->B()Lhd5;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->x()Lbq4;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v0, v0, Lsc5;->b:Lr90;

    .line 31
    .line 32
    iget-object v0, v0, Lr90;->d:Lxi4;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v5

    .line 41
    const-wide/32 v7, 0x5265c00

    .line 42
    .line 43
    .line 44
    sub-long/2addr v5, v7

    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    const-string v7, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    .line 50
    .line 51
    invoke-static {v0, v7}, Lw24;->b(ILjava/lang/String;)Lw24;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-virtual {v7, v0, v5, v6}, Lw24;->c(IJ)V

    .line 56
    .line 57
    .line 58
    iget-object v5, v2, Lfd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 59
    .line 60
    invoke-virtual {v5}, Ls24;->b()V

    .line 61
    .line 62
    .line 63
    invoke-static {v5, v7}, Lxl;->H(Ls24;Lwo4;)Landroid/database/Cursor;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    :try_start_0
    const-string v6, "id"

    .line 68
    .line 69
    invoke-static {v5, v6}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    const-string v8, "state"

    .line 74
    .line 75
    invoke-static {v5, v8}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    const-string v9, "worker_class_name"

    .line 80
    .line 81
    invoke-static {v5, v9}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    const-string v10, "input_merger_class_name"

    .line 86
    .line 87
    invoke-static {v5, v10}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    const-string v11, "input"

    .line 92
    .line 93
    invoke-static {v5, v11}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    const-string v12, "output"

    .line 98
    .line 99
    invoke-static {v5, v12}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    const-string v13, "initial_delay"

    .line 104
    .line 105
    invoke-static {v5, v13}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    const-string v14, "interval_duration"

    .line 110
    .line 111
    invoke-static {v5, v14}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result v14

    .line 115
    const-string v15, "flex_duration"

    .line 116
    .line 117
    invoke-static {v5, v15}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    const-string v0, "run_attempt_count"

    .line 122
    .line 123
    invoke-static {v5, v0}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    move-object/from16 v16, v2

    .line 128
    .line 129
    const-string v2, "backoff_policy"

    .line 130
    .line 131
    invoke-static {v5, v2}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    move-object/from16 v17, v7

    .line 136
    .line 137
    :try_start_1
    const-string v7, "backoff_delay_duration"

    .line 138
    .line 139
    invoke-static {v5, v7}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    move-object/from16 v18, v1

    .line 144
    .line 145
    const-string v1, "last_enqueue_time"

    .line 146
    .line 147
    invoke-static {v5, v1}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    move-object/from16 v19, v3

    .line 152
    .line 153
    const-string v3, "minimum_retention_duration"

    .line 154
    .line 155
    invoke-static {v5, v3}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    move-object/from16 v20, v4

    .line 160
    .line 161
    const-string v4, "schedule_requested_at"

    .line 162
    .line 163
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    move/from16 v21, v4

    .line 168
    .line 169
    const-string v4, "run_in_foreground"

    .line 170
    .line 171
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    move/from16 v22, v4

    .line 176
    .line 177
    const-string v4, "out_of_quota_policy"

    .line 178
    .line 179
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    move/from16 v23, v4

    .line 184
    .line 185
    const-string v4, "period_count"

    .line 186
    .line 187
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    move/from16 v24, v4

    .line 192
    .line 193
    const-string v4, "generation"

    .line 194
    .line 195
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    move/from16 v25, v4

    .line 200
    .line 201
    const-string v4, "next_schedule_time_override"

    .line 202
    .line 203
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    move/from16 v26, v4

    .line 208
    .line 209
    const-string v4, "next_schedule_time_override_generation"

    .line 210
    .line 211
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    move/from16 v27, v4

    .line 216
    .line 217
    const-string v4, "stop_reason"

    .line 218
    .line 219
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    move/from16 v28, v4

    .line 224
    .line 225
    const-string v4, "trace_tag"

    .line 226
    .line 227
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    move/from16 v29, v4

    .line 232
    .line 233
    const-string v4, "required_network_type"

    .line 234
    .line 235
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    move/from16 v30, v4

    .line 240
    .line 241
    const-string v4, "required_network_request"

    .line 242
    .line 243
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    move/from16 v31, v4

    .line 248
    .line 249
    const-string v4, "requires_charging"

    .line 250
    .line 251
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    move/from16 v32, v4

    .line 256
    .line 257
    const-string v4, "requires_device_idle"

    .line 258
    .line 259
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    move/from16 v33, v4

    .line 264
    .line 265
    const-string v4, "requires_battery_not_low"

    .line 266
    .line 267
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    move/from16 v34, v4

    .line 272
    .line 273
    const-string v4, "requires_storage_not_low"

    .line 274
    .line 275
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    move/from16 v35, v4

    .line 280
    .line 281
    const-string v4, "trigger_content_update_delay"

    .line 282
    .line 283
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    move/from16 v36, v4

    .line 288
    .line 289
    const-string v4, "trigger_max_content_delay"

    .line 290
    .line 291
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    move/from16 v37, v4

    .line 296
    .line 297
    const-string v4, "content_uri_triggers"

    .line 298
    .line 299
    invoke-static {v5, v4}, Le35;->x(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    move/from16 v38, v4

    .line 304
    .line 305
    new-instance v4, Ljava/util/ArrayList;

    .line 306
    .line 307
    move/from16 v39, v3

    .line 308
    .line 309
    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    .line 315
    .line 316
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_6

    .line 321
    .line 322
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v41

    .line 326
    invoke-interface {v5, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    invoke-static {v3}, Luc5;->x(I)I

    .line 331
    .line 332
    .line 333
    move-result v42

    .line 334
    invoke-interface {v5, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v43

    .line 338
    invoke-interface {v5, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v44

    .line 342
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-static {v3}, Loh0;->a([B)Loh0;

    .line 347
    .line 348
    .line 349
    move-result-object v45

    .line 350
    invoke-interface {v5, v12}, Landroid/database/Cursor;->getBlob(I)[B

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v3}, Loh0;->a([B)Loh0;

    .line 355
    .line 356
    .line 357
    move-result-object v46

    .line 358
    invoke-interface {v5, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 359
    .line 360
    .line 361
    move-result-wide v47

    .line 362
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 363
    .line 364
    .line 365
    move-result-wide v49

    .line 366
    invoke-interface {v5, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v51

    .line 370
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 371
    .line 372
    .line 373
    move-result v54

    .line 374
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    invoke-static {v3}, Luc5;->u(I)I

    .line 379
    .line 380
    .line 381
    move-result v55

    .line 382
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 383
    .line 384
    .line 385
    move-result-wide v56

    .line 386
    invoke-interface {v5, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 387
    .line 388
    .line 389
    move-result-wide v58

    .line 390
    move/from16 v3, v39

    .line 391
    .line 392
    invoke-interface {v5, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 393
    .line 394
    .line 395
    move-result-wide v60

    .line 396
    move/from16 v39, v0

    .line 397
    .line 398
    move/from16 v0, v21

    .line 399
    .line 400
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 401
    .line 402
    .line 403
    move-result-wide v62

    .line 404
    move/from16 v21, v0

    .line 405
    .line 406
    move/from16 v0, v22

    .line 407
    .line 408
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 409
    .line 410
    .line 411
    move-result v22

    .line 412
    const/16 v40, 0x0

    .line 413
    .line 414
    if-eqz v22, :cond_0

    .line 415
    .line 416
    const/16 v64, 0x1

    .line 417
    .line 418
    :goto_1
    move/from16 v22, v0

    .line 419
    .line 420
    move/from16 v0, v23

    .line 421
    .line 422
    goto :goto_2

    .line 423
    :cond_0
    move/from16 v64, v40

    .line 424
    .line 425
    goto :goto_1

    .line 426
    :goto_2
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 427
    .line 428
    .line 429
    move-result v23

    .line 430
    invoke-static/range {v23 .. v23}, Luc5;->w(I)I

    .line 431
    .line 432
    .line 433
    move-result v65

    .line 434
    move/from16 v23, v0

    .line 435
    .line 436
    move/from16 v0, v24

    .line 437
    .line 438
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 439
    .line 440
    .line 441
    move-result v66

    .line 442
    move/from16 v24, v0

    .line 443
    .line 444
    move/from16 v0, v25

    .line 445
    .line 446
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 447
    .line 448
    .line 449
    move-result v67

    .line 450
    move/from16 v25, v0

    .line 451
    .line 452
    move/from16 v0, v26

    .line 453
    .line 454
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 455
    .line 456
    .line 457
    move-result-wide v68

    .line 458
    move/from16 v26, v0

    .line 459
    .line 460
    move/from16 v0, v27

    .line 461
    .line 462
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 463
    .line 464
    .line 465
    move-result v70

    .line 466
    move/from16 v27, v0

    .line 467
    .line 468
    move/from16 v0, v28

    .line 469
    .line 470
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 471
    .line 472
    .line 473
    move-result v71

    .line 474
    move/from16 v28, v0

    .line 475
    .line 476
    move/from16 v0, v29

    .line 477
    .line 478
    invoke-interface {v5, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 479
    .line 480
    .line 481
    move-result v29

    .line 482
    if-eqz v29, :cond_1

    .line 483
    .line 484
    const/16 v29, 0x0

    .line 485
    .line 486
    :goto_3
    move-object/from16 v72, v29

    .line 487
    .line 488
    move/from16 v29, v0

    .line 489
    .line 490
    move/from16 v0, v30

    .line 491
    .line 492
    goto :goto_4

    .line 493
    :cond_1
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v29

    .line 497
    goto :goto_3

    .line 498
    :goto_4
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 499
    .line 500
    .line 501
    move-result v30

    .line 502
    invoke-static/range {v30 .. v30}, Luc5;->v(I)I

    .line 503
    .line 504
    .line 505
    move-result v75

    .line 506
    move/from16 v30, v0

    .line 507
    .line 508
    move/from16 v0, v31

    .line 509
    .line 510
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 511
    .line 512
    .line 513
    move-result-object v31

    .line 514
    invoke-static/range {v31 .. v31}, Luc5;->a0([B)Lo53;

    .line 515
    .line 516
    .line 517
    move-result-object v74

    .line 518
    move/from16 v31, v0

    .line 519
    .line 520
    move/from16 v0, v32

    .line 521
    .line 522
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 523
    .line 524
    .line 525
    move-result v32

    .line 526
    if-eqz v32, :cond_2

    .line 527
    .line 528
    const/16 v76, 0x1

    .line 529
    .line 530
    :goto_5
    move/from16 v32, v0

    .line 531
    .line 532
    move/from16 v0, v33

    .line 533
    .line 534
    goto :goto_6

    .line 535
    :cond_2
    move/from16 v76, v40

    .line 536
    .line 537
    goto :goto_5

    .line 538
    :goto_6
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 539
    .line 540
    .line 541
    move-result v33

    .line 542
    if-eqz v33, :cond_3

    .line 543
    .line 544
    const/16 v77, 0x1

    .line 545
    .line 546
    :goto_7
    move/from16 v33, v0

    .line 547
    .line 548
    move/from16 v0, v34

    .line 549
    .line 550
    goto :goto_8

    .line 551
    :cond_3
    move/from16 v77, v40

    .line 552
    .line 553
    goto :goto_7

    .line 554
    :goto_8
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 555
    .line 556
    .line 557
    move-result v34

    .line 558
    if-eqz v34, :cond_4

    .line 559
    .line 560
    const/16 v78, 0x1

    .line 561
    .line 562
    :goto_9
    move/from16 v34, v0

    .line 563
    .line 564
    move/from16 v0, v35

    .line 565
    .line 566
    goto :goto_a

    .line 567
    :cond_4
    move/from16 v78, v40

    .line 568
    .line 569
    goto :goto_9

    .line 570
    :goto_a
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 571
    .line 572
    .line 573
    move-result v35

    .line 574
    if-eqz v35, :cond_5

    .line 575
    .line 576
    const/16 v79, 0x1

    .line 577
    .line 578
    :goto_b
    move/from16 v35, v0

    .line 579
    .line 580
    move/from16 v0, v36

    .line 581
    .line 582
    goto :goto_c

    .line 583
    :cond_5
    move/from16 v79, v40

    .line 584
    .line 585
    goto :goto_b

    .line 586
    :goto_c
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 587
    .line 588
    .line 589
    move-result-wide v80

    .line 590
    move/from16 v36, v0

    .line 591
    .line 592
    move/from16 v0, v37

    .line 593
    .line 594
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 595
    .line 596
    .line 597
    move-result-wide v82

    .line 598
    move/from16 v37, v0

    .line 599
    .line 600
    move/from16 v0, v38

    .line 601
    .line 602
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 603
    .line 604
    .line 605
    move-result-object v38

    .line 606
    invoke-static/range {v38 .. v38}, Luc5;->b([B)Ljava/util/LinkedHashSet;

    .line 607
    .line 608
    .line 609
    move-result-object v84

    .line 610
    new-instance v53, Lmc0;

    .line 611
    .line 612
    move-object/from16 v73, v53

    .line 613
    .line 614
    invoke-direct/range {v73 .. v84}, Lmc0;-><init>(Lo53;IZZZZJJLjava/util/Set;)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v53, v73

    .line 618
    .line 619
    new-instance v40, Ldd5;

    .line 620
    .line 621
    invoke-direct/range {v40 .. v72}, Ldd5;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Loh0;Loh0;JJJLmc0;IIJJJJZIIIJIILjava/lang/String;)V

    .line 622
    .line 623
    .line 624
    move/from16 v38, v0

    .line 625
    .line 626
    move-object/from16 v0, v40

    .line 627
    .line 628
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 629
    .line 630
    .line 631
    move/from16 v0, v39

    .line 632
    .line 633
    move/from16 v39, v3

    .line 634
    .line 635
    goto/16 :goto_0

    .line 636
    .line 637
    :catchall_0
    move-exception v0

    .line 638
    goto/16 :goto_e

    .line 639
    .line 640
    :cond_6
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v17 .. v17}, Lw24;->j()V

    .line 644
    .line 645
    .line 646
    invoke-virtual/range {v16 .. v16}, Lfd5;->e()Ljava/util/ArrayList;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual/range {v16 .. v16}, Lfd5;->b()Ljava/util/ArrayList;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 655
    .line 656
    .line 657
    move-result v2

    .line 658
    if-nez v2, :cond_7

    .line 659
    .line 660
    invoke-static {}, Lcx;->f()Lcx;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    sget-object v3, Lkp0;->a:Ljava/lang/String;

    .line 665
    .line 666
    const-string v5, "Recently completed work:\n\n"

    .line 667
    .line 668
    invoke-virtual {v2, v3, v5}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    invoke-static {}, Lcx;->f()Lcx;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    move-object/from16 v7, v18

    .line 676
    .line 677
    move-object/from16 v5, v19

    .line 678
    .line 679
    move-object/from16 v6, v20

    .line 680
    .line 681
    invoke-static {v5, v6, v7, v4}, Lkp0;->a(Lxc5;Lhd5;Lbq4;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v4

    .line 685
    invoke-virtual {v2, v3, v4}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    goto :goto_d

    .line 689
    :cond_7
    move-object/from16 v7, v18

    .line 690
    .line 691
    move-object/from16 v5, v19

    .line 692
    .line 693
    move-object/from16 v6, v20

    .line 694
    .line 695
    :goto_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 696
    .line 697
    .line 698
    move-result v2

    .line 699
    if-nez v2, :cond_8

    .line 700
    .line 701
    invoke-static {}, Lcx;->f()Lcx;

    .line 702
    .line 703
    .line 704
    move-result-object v2

    .line 705
    sget-object v3, Lkp0;->a:Ljava/lang/String;

    .line 706
    .line 707
    const-string v4, "Running work:\n\n"

    .line 708
    .line 709
    invoke-virtual {v2, v3, v4}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    invoke-static {}, Lcx;->f()Lcx;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    invoke-static {v5, v6, v7, v0}, Lkp0;->a(Lxc5;Lhd5;Lbq4;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v2, v3, v0}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-nez v0, :cond_9

    .line 728
    .line 729
    invoke-static {}, Lcx;->f()Lcx;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    sget-object v2, Lkp0;->a:Ljava/lang/String;

    .line 734
    .line 735
    const-string v3, "Enqueued work:\n\n"

    .line 736
    .line 737
    invoke-virtual {v0, v2, v3}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    invoke-static {}, Lcx;->f()Lcx;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-static {v5, v6, v7, v1}, Lkp0;->a(Lxc5;Lhd5;Lbq4;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-virtual {v0, v2, v1}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    :cond_9
    new-instance v0, Lmc2;

    .line 752
    .line 753
    invoke-direct {v0}, Lmc2;-><init>()V

    .line 754
    .line 755
    .line 756
    return-object v0

    .line 757
    :catchall_1
    move-exception v0

    .line 758
    move-object/from16 v17, v7

    .line 759
    .line 760
    :goto_e
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 761
    .line 762
    .line 763
    invoke-virtual/range {v17 .. v17}, Lw24;->j()V

    .line 764
    .line 765
    .line 766
    throw v0
.end method
