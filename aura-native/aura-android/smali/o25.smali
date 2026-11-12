.class public final synthetic Lo25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lq25;


# direct methods
.method public synthetic constructor <init>(Lq25;I)V
    .locals 0

    .line 1
    iput p2, p0, Lo25;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lo25;->o:Lq25;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lo25;->n:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v6, v0, Lo25;->o:Lq25;

    .line 9
    .line 10
    const-string v0, "PLAYING"

    .line 11
    .line 12
    const-string v1, "TrackURI"

    .line 13
    .line 14
    const-string v15, "could not read the renderer\'s state"

    .line 15
    .line 16
    const-string v13, "CurrentTransportState"

    .line 17
    .line 18
    const-string v14, "UpnpPlayer"

    .line 19
    .line 20
    iget-boolean v7, v6, Lq25;->C:Z

    .line 21
    .line 22
    if-nez v7, :cond_19

    .line 23
    .line 24
    iget-boolean v7, v6, Lq25;->M:Z

    .line 25
    .line 26
    if-nez v7, :cond_0

    .line 27
    .line 28
    goto/16 :goto_e

    .line 29
    .line 30
    :cond_0
    :try_start_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v9

    .line 34
    iget-object v8, v6, Lq25;->j:Lf25;

    .line 35
    .line 36
    iget-object v11, v6, Lq25;->k:Lg25;

    .line 37
    .line 38
    invoke-virtual {v8, v11}, Lf25;->c(Lg25;)Ljava/util/Map;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 43
    .line 44
    .line 45
    move-result-wide v11

    .line 46
    iget-object v7, v6, Lq25;->j:Lf25;

    .line 47
    .line 48
    iget-object v5, v6, Lq25;->k:Lg25;

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v5}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const-string v2, "GetTransportInfo"

    .line 61
    .line 62
    const-string v3, "InstanceID"

    .line 63
    .line 64
    const-string v4, "0"

    .line 65
    .line 66
    move-wide/from16 v18, v9

    .line 67
    .line 68
    new-instance v9, Lkd3;

    .line 69
    .line 70
    invoke-direct {v9, v3, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v9}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v7, v5, v2, v3}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-wide/16 v3, 0x0

    .line 82
    .line 83
    iput-wide v3, v6, Lq25;->L:J

    .line 84
    .line 85
    iget-wide v3, v6, Lq25;->F:J

    .line 86
    .line 87
    iget-wide v9, v6, Lq25;->E:J

    .line 88
    .line 89
    cmp-long v3, v3, v9

    .line 90
    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    goto/16 :goto_e

    .line 94
    .line 95
    :cond_1
    invoke-virtual {v6}, Lq25;->U1()J

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    iget-wide v9, v6, Lq25;->A:J

    .line 100
    .line 101
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 102
    .line 103
    .line 104
    move-result-wide v9

    .line 105
    iput-wide v9, v6, Lq25;->A:J
    :try_end_0
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    .line 107
    :try_start_1
    invoke-virtual {v6}, Lq25;->J1()Lp25;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    iget-object v5, v5, Lp25;->b:Lgn2;

    .line 114
    .line 115
    if-eqz v5, :cond_2

    .line 116
    .line 117
    iget-object v5, v5, Lgn2;->d:Ldo2;

    .line 118
    .line 119
    if-eqz v5, :cond_2

    .line 120
    .line 121
    iget-object v5, v5, Ldo2;->I:Landroid/os/Bundle;

    .line 122
    .line 123
    if-eqz v5, :cond_2

    .line 124
    .line 125
    const-string v7, "duration"

    .line 126
    .line 127
    move-wide/from16 v20, v3

    .line 128
    .line 129
    const/4 v3, 0x0

    .line 130
    invoke-virtual {v5, v7, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 131
    .line 132
    .line 133
    move-result v4
    :try_end_1
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 134
    goto :goto_0

    .line 135
    :cond_2
    move-wide/from16 v20, v3

    .line 136
    .line 137
    const/4 v4, 0x0

    .line 138
    :goto_0
    int-to-long v3, v4

    .line 139
    const-wide/16 v22, 0x3e8

    .line 140
    .line 141
    mul-long v3, v3, v22

    .line 142
    .line 143
    :try_start_2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const-wide/16 v16, 0x0

    .line 148
    .line 149
    cmp-long v3, v3, v16

    .line 150
    .line 151
    if-lez v3, :cond_3

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    const/4 v5, 0x0

    .line 155
    :goto_1
    if-eqz v5, :cond_4

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    :goto_2
    move-wide/from16 v24, v9

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :catch_0
    move-exception v0

    .line 165
    move-object v1, v14

    .line 166
    goto/16 :goto_b

    .line 167
    .line 168
    :catch_1
    move-exception v0

    .line 169
    :goto_3
    move-object v1, v14

    .line 170
    :goto_4
    const-wide/16 v3, 0x0

    .line 171
    .line 172
    goto/16 :goto_c

    .line 173
    .line 174
    :cond_4
    iget-wide v3, v6, Lq25;->B:J

    .line 175
    .line 176
    const-wide/16 v16, 0x0

    .line 177
    .line 178
    cmp-long v3, v3, v16

    .line 179
    .line 180
    if-lez v3, :cond_5

    .line 181
    .line 182
    iget-wide v3, v6, Lq25;->B:J

    .line 183
    .line 184
    div-long v3, v3, v22

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_5
    move-wide/from16 v24, v9

    .line 188
    .line 189
    const-wide/16 v3, 0x0

    .line 190
    .line 191
    :goto_5
    iget-wide v9, v6, Lq25;->B:J

    .line 192
    .line 193
    const-wide/16 v16, 0x0

    .line 194
    .line 195
    cmp-long v5, v9, v16

    .line 196
    .line 197
    if-lez v5, :cond_6

    .line 198
    .line 199
    iget-wide v9, v6, Lq25;->B:J

    .line 200
    .line 201
    div-long v9, v9, v22

    .line 202
    .line 203
    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 204
    .line 205
    .line 206
    move-result-wide v9

    .line 207
    move-wide/from16 v26, v9

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_6
    move-wide/from16 v26, v3

    .line 211
    .line 212
    :goto_6
    sget-object v5, Lq25;->Q:Ljava/util/Set;

    .line 213
    .line 214
    const-string v5, "TrackDuration"

    .line 215
    .line 216
    invoke-interface {v8, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    check-cast v5, Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v5}, Lya4;->d(Ljava/lang/String;)Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    if-eqz v5, :cond_8

    .line 227
    .line 228
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 229
    .line 230
    .line 231
    move-result-wide v9

    .line 232
    const-wide/16 v16, 0x0

    .line 233
    .line 234
    cmp-long v7, v9, v16

    .line 235
    .line 236
    if-lez v7, :cond_7

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_7
    const/4 v5, 0x0

    .line 240
    :goto_7
    if-eqz v5, :cond_8

    .line 241
    .line 242
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v9

    .line 246
    mul-long v9, v9, v22

    .line 247
    .line 248
    iput-wide v9, v6, Lq25;->B:J

    .line 249
    .line 250
    :cond_8
    const-string v5, "RelTime"

    .line 251
    .line 252
    invoke-interface {v8, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    check-cast v5, Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v5}, Lya4;->d(Ljava/lang/String;)Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v5

    .line 262
    if-eqz v5, :cond_9

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 265
    .line 266
    .line 267
    move-result-wide v9

    .line 268
    move-object v5, v8

    .line 269
    move-wide v7, v9

    .line 270
    move-wide/from16 v9, v18

    .line 271
    .line 272
    invoke-virtual/range {v6 .. v12}, Lq25;->b2(JJJ)V

    .line 273
    .line 274
    .line 275
    goto :goto_8

    .line 276
    :cond_9
    move-object v5, v8

    .line 277
    :goto_8
    sget-object v12, Lq25;->Q:Ljava/util/Set;

    .line 278
    .line 279
    move-object v7, v12

    .line 280
    check-cast v7, Ljava/lang/Iterable;

    .line 281
    .line 282
    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v8

    .line 286
    invoke-static {v7, v8}, Lq40;->s0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v7, :cond_c

    .line 291
    .line 292
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    check-cast v7, Ljava/lang/String;

    .line 297
    .line 298
    if-eqz v7, :cond_b

    .line 299
    .line 300
    invoke-static {v7}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    if-nez v8, :cond_a

    .line 305
    .line 306
    goto :goto_9

    .line 307
    :cond_a
    const/4 v7, 0x0

    .line 308
    :goto_9
    if-eqz v7, :cond_b

    .line 309
    .line 310
    iput-object v7, v6, Lq25;->D:Ljava/lang/String;

    .line 311
    .line 312
    :cond_b
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    move-object v11, v1

    .line 317
    check-cast v11, Ljava/lang/String;

    .line 318
    .line 319
    move-wide v9, v3

    .line 320
    move-wide/from16 v7, v24

    .line 321
    .line 322
    invoke-virtual/range {v6 .. v11}, Lq25;->N1(JJLjava/lang/String;)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_d

    .line 327
    .line 328
    goto/16 :goto_e

    .line 329
    .line 330
    :cond_c
    move-wide v9, v3

    .line 331
    move-wide/from16 v7, v24

    .line 332
    .line 333
    :cond_d
    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    check-cast v1, Ljava/lang/String;

    .line 338
    .line 339
    invoke-static {v1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    const/4 v4, 0x3

    .line 344
    if-nez v3, :cond_e

    .line 345
    .line 346
    const-string v3, "PAUSED_PLAYBACK"

    .line 347
    .line 348
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-eqz v3, :cond_f

    .line 353
    .line 354
    :cond_e
    move-object v1, v14

    .line 355
    goto :goto_a

    .line 356
    :cond_f
    const-string v0, "TRANSITIONING"

    .line 357
    .line 358
    invoke-static {v1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_11

    .line 363
    .line 364
    iget v0, v6, Lq25;->s:I

    .line 365
    .line 366
    if-ne v0, v4, :cond_10

    .line 367
    .line 368
    iget-boolean v0, v6, Lq25;->r:Z

    .line 369
    .line 370
    if-eqz v0, :cond_10

    .line 371
    .line 372
    invoke-virtual {v6}, Lq25;->U1()J

    .line 373
    .line 374
    .line 375
    move-result-wide v0

    .line 376
    invoke-virtual {v6, v0, v1}, Lq25;->Y1(J)V

    .line 377
    .line 378
    .line 379
    :cond_10
    const/4 v0, 0x2

    .line 380
    iput v0, v6, Lq25;->s:I

    .line 381
    .line 382
    goto/16 :goto_d

    .line 383
    .line 384
    :cond_11
    check-cast v12, Ljava/lang/Iterable;

    .line 385
    .line 386
    invoke-static {v12, v1}, Lq40;->s0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v0
    :try_end_2
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 390
    if-eqz v0, :cond_18

    .line 391
    .line 392
    move-object v1, v14

    .line 393
    move-wide/from16 v13, v20

    .line 394
    .line 395
    move-wide/from16 v11, v26

    .line 396
    .line 397
    :try_start_3
    invoke-virtual/range {v6 .. v14}, Lq25;->S1(JJJJ)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_d

    .line 401
    .line 402
    :catch_2
    move-exception v0

    .line 403
    goto :goto_b

    .line 404
    :catch_3
    move-exception v0

    .line 405
    goto/16 :goto_4

    .line 406
    .line 407
    :goto_a
    iget v3, v6, Lq25;->s:I

    .line 408
    .line 409
    if-eq v3, v4, :cond_12

    .line 410
    .line 411
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 412
    .line 413
    .line 414
    move-result-wide v7

    .line 415
    iput-wide v7, v6, Lq25;->u:J

    .line 416
    .line 417
    :cond_12
    const/4 v3, 0x0

    .line 418
    iput v3, v6, Lq25;->x:I

    .line 419
    .line 420
    const/4 v3, 0x1

    .line 421
    iput-boolean v3, v6, Lq25;->J:Z

    .line 422
    .line 423
    iput v4, v6, Lq25;->s:I

    .line 424
    .line 425
    invoke-interface {v2, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-static {v2, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    invoke-virtual {v6, v0}, Lq25;->M1(Z)V
    :try_end_3
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 434
    .line 435
    .line 436
    goto :goto_d

    .line 437
    :catch_4
    move-exception v0

    .line 438
    goto/16 :goto_3

    .line 439
    .line 440
    :goto_b
    iget-wide v2, v6, Lq25;->L:J

    .line 441
    .line 442
    const-wide/16 v16, 0x0

    .line 443
    .line 444
    cmp-long v2, v2, v16

    .line 445
    .line 446
    if-nez v2, :cond_13

    .line 447
    .line 448
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 449
    .line 450
    .line 451
    move-result-wide v2

    .line 452
    iput-wide v2, v6, Lq25;->L:J

    .line 453
    .line 454
    :cond_13
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 455
    .line 456
    .line 457
    move-result-wide v2

    .line 458
    iget-wide v4, v6, Lq25;->L:J

    .line 459
    .line 460
    sub-long/2addr v2, v4

    .line 461
    sget-wide v4, Lq25;->S:J

    .line 462
    .line 463
    cmp-long v2, v2, v4

    .line 464
    .line 465
    if-gtz v2, :cond_14

    .line 466
    .line 467
    invoke-static {v1, v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 468
    .line 469
    .line 470
    goto :goto_d

    .line 471
    :cond_14
    iget-boolean v2, v6, Lq25;->r:Z

    .line 472
    .line 473
    if-eqz v2, :cond_15

    .line 474
    .line 475
    invoke-virtual {v6, v0}, Lq25;->G1(Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    invoke-virtual {v6, v0}, Lq25;->L1(Landroidx/media3/common/PlaybackException;)V

    .line 480
    .line 481
    .line 482
    goto :goto_d

    .line 483
    :cond_15
    const-string v2, "renderer is unreachable while paused, no longer reading it"

    .line 484
    .line 485
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 486
    .line 487
    .line 488
    const/4 v1, 0x0

    .line 489
    iput-object v1, v6, Lq25;->D:Ljava/lang/String;

    .line 490
    .line 491
    const/4 v3, 0x1

    .line 492
    iput v3, v6, Lq25;->s:I

    .line 493
    .line 494
    invoke-virtual {v6}, Lq25;->Z1()V

    .line 495
    .line 496
    .line 497
    goto :goto_d

    .line 498
    :goto_c
    iput-wide v3, v6, Lq25;->L:J

    .line 499
    .line 500
    iget v2, v0, Lcom/eddyizm/tempus/upnp/UpnpException;->n:I

    .line 501
    .line 502
    const/16 v3, 0x2cc

    .line 503
    .line 504
    if-ne v2, v3, :cond_17

    .line 505
    .line 506
    iget-boolean v2, v6, Lq25;->r:Z

    .line 507
    .line 508
    if-eqz v2, :cond_17

    .line 509
    .line 510
    invoke-virtual {v6}, Lq25;->J1()Lp25;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    if-eqz v2, :cond_16

    .line 515
    .line 516
    invoke-virtual {v6, v2, v0}, Lq25;->H1(Lp25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {v6, v0}, Lq25;->L1(Landroidx/media3/common/PlaybackException;)V

    .line 521
    .line 522
    .line 523
    goto :goto_d

    .line 524
    :cond_16
    invoke-static {v1, v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 525
    .line 526
    .line 527
    goto :goto_d

    .line 528
    :cond_17
    invoke-static {v1, v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 529
    .line 530
    .line 531
    :cond_18
    :goto_d
    invoke-virtual {v6}, Lq25;->O1()V

    .line 532
    .line 533
    .line 534
    :cond_19
    :goto_e
    return-void

    .line 535
    :pswitch_0
    iget-object v0, v0, Lo25;->o:Lq25;

    .line 536
    .line 537
    iget-boolean v1, v0, Lq25;->C:Z

    .line 538
    .line 539
    if-nez v1, :cond_1b

    .line 540
    .line 541
    invoke-virtual {v0}, Lqe4;->F1()V

    .line 542
    .line 543
    .line 544
    iget-object v1, v0, Lqe4;->f:Ljava/util/HashSet;

    .line 545
    .line 546
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    if-eqz v1, :cond_1b

    .line 551
    .line 552
    iget-boolean v1, v0, Lqe4;->i:Z

    .line 553
    .line 554
    if-eqz v1, :cond_1a

    .line 555
    .line 556
    goto :goto_f

    .line 557
    :cond_1a
    invoke-virtual {v0}, Lq25;->i1()Lpe4;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    const/4 v3, 0x0

    .line 562
    invoke-virtual {v0, v1, v3, v3}, Lqe4;->D1(Lpe4;ZZ)V

    .line 563
    .line 564
    .line 565
    :cond_1b
    :goto_f
    return-void

    .line 566
    :pswitch_1
    iget-object v0, v0, Lo25;->o:Lq25;

    .line 567
    .line 568
    iget-object v1, v0, Lq25;->n:Landroid/os/Handler;

    .line 569
    .line 570
    iget-object v0, v0, Lq25;->O:Lwu4;

    .line 571
    .line 572
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 573
    .line 574
    .line 575
    return-void

    .line 576
    :pswitch_2
    iget-object v0, v0, Lo25;->o:Lq25;

    .line 577
    .line 578
    iget-boolean v1, v0, Lq25;->C:Z

    .line 579
    .line 580
    if-eqz v1, :cond_1c

    .line 581
    .line 582
    goto :goto_10

    .line 583
    :cond_1c
    const/4 v3, 0x1

    .line 584
    iput-boolean v3, v0, Lq25;->M:Z

    .line 585
    .line 586
    invoke-virtual {v0}, Lq25;->c2()V

    .line 587
    .line 588
    .line 589
    const-wide/16 v3, 0x0

    .line 590
    .line 591
    iput-wide v3, v0, Lq25;->L:J

    .line 592
    .line 593
    iget-object v1, v0, Lq25;->n:Landroid/os/Handler;

    .line 594
    .line 595
    iget-object v2, v0, Lq25;->O:Lwu4;

    .line 596
    .line 597
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 598
    .line 599
    .line 600
    iget-object v1, v0, Lq25;->n:Landroid/os/Handler;

    .line 601
    .line 602
    iget-object v0, v0, Lq25;->O:Lwu4;

    .line 603
    .line 604
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 605
    .line 606
    .line 607
    :goto_10
    return-void

    .line 608
    :pswitch_3
    iget-object v0, v0, Lo25;->o:Lq25;

    .line 609
    .line 610
    iget-boolean v1, v0, Lq25;->r:Z

    .line 611
    .line 612
    if-eqz v1, :cond_1e

    .line 613
    .line 614
    iget-boolean v1, v0, Lq25;->C:Z

    .line 615
    .line 616
    if-eqz v1, :cond_1d

    .line 617
    .line 618
    goto :goto_11

    .line 619
    :cond_1d
    const/4 v3, 0x1

    .line 620
    iput-boolean v3, v0, Lq25;->M:Z

    .line 621
    .line 622
    invoke-virtual {v0}, Lq25;->c2()V

    .line 623
    .line 624
    .line 625
    const-wide/16 v3, 0x0

    .line 626
    .line 627
    iput-wide v3, v0, Lq25;->L:J

    .line 628
    .line 629
    iget-object v1, v0, Lq25;->n:Landroid/os/Handler;

    .line 630
    .line 631
    iget-object v2, v0, Lq25;->O:Lwu4;

    .line 632
    .line 633
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 634
    .line 635
    .line 636
    iget-object v1, v0, Lq25;->n:Landroid/os/Handler;

    .line 637
    .line 638
    iget-object v0, v0, Lq25;->O:Lwu4;

    .line 639
    .line 640
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 641
    .line 642
    .line 643
    :cond_1e
    :goto_11
    return-void

    .line 644
    nop

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
