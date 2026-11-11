.class public final synthetic Lu6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lu6;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget p0, p0, Lu6;->n:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x6

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object p0, Lis3;->c:Lcom/eddyizm/tempus/service/MediaService;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->b()Lqi3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {v0, p0}, Lis3;->a(Lqi3;Lao2;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :pswitch_0
    sget-object p0, Lxt1;->b:Lyr1;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lyr1;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :pswitch_1
    sget-object p0, Lxt1;->f:Lyr1;

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lyr1;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void

    .line 44
    :pswitch_2
    sget-object p0, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 45
    .line 46
    if-nez p0, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-virtual {p0, v7}, Lcom/eddyizm/tempus/homemusic/WaveSession;->setFailures(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->c()V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    :pswitch_3
    sget-object p0, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 57
    .line 58
    if-nez p0, :cond_4

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    sput-wide v0, Lcom/eddyizm/tempus/homemusic/b;->d:J

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveSession;->getInFlight()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->c()V

    .line 74
    .line 75
    .line 76
    :cond_5
    :goto_1
    return-void

    .line 77
    :pswitch_4
    sput-object v6, Lcom/eddyizm/tempus/homemusic/b;->c:Lu6;

    .line 78
    .line 79
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/b;->c()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_5
    sput-object v6, Lcom/eddyizm/tempus/homemusic/a;->c:Lu6;

    .line 84
    .line 85
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->b()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_6
    sget-object p0, Lrs1;->a:Lrs1;

    .line 90
    .line 91
    invoke-static {}, Lrs1;->e()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_7
    sget-object p0, Lrs1;->a:Lrs1;

    .line 96
    .line 97
    invoke-static {}, Lrs1;->h()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_8
    sget-object p0, Lrs1;->a:Lrs1;

    .line 102
    .line 103
    invoke-static {v3, v4}, Lrs1;->k(J)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_9
    sget-object p0, Lrs1;->a:Lrs1;

    .line 108
    .line 109
    invoke-static {}, Lrs1;->e()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_a
    sget-object p0, Lxr1;->d:Landroid/content/Context;

    .line 114
    .line 115
    if-nez p0, :cond_6

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 119
    .line 120
    new-instance v1, Llf;

    .line 121
    .line 122
    invoke-direct {v1, p0, v5}, Llf;-><init>(Landroid/content/Context;I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 126
    .line 127
    .line 128
    :goto_2
    return-void

    .line 129
    :pswitch_b
    sget-boolean p0, Lxr1;->a:Z

    .line 130
    .line 131
    const-string p0, "library"

    .line 132
    .line 133
    const-string v0, "message"

    .line 134
    .line 135
    const-string v1, "/api/events"

    .line 136
    .line 137
    const-string v3, "HubEvents"

    .line 138
    .line 139
    const-wide/16 v8, 0x1388

    .line 140
    .line 141
    move-wide v10, v8

    .line 142
    :cond_7
    :goto_3
    sget-boolean v4, Lxr1;->a:Z

    .line 143
    .line 144
    if-eqz v4, :cond_14

    .line 145
    .line 146
    :try_start_0
    invoke-static {}, Lrr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 147
    .line 148
    .line 149
    invoke-static {}, Lrr1;->c()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    new-instance v6, Lnz3;

    .line 154
    .line 155
    invoke-direct {v6}, Lnz3;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v12, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    invoke-virtual {v6, v12}, Lnz3;->d(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const-string v12, "Accept"

    .line 177
    .line 178
    const-string v13, "text/event-stream"

    .line 179
    .line 180
    invoke-virtual {v6, v12, v13}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    new-instance v12, Loz3;

    .line 184
    .line 185
    invoke-direct {v12, v6}, Loz3;-><init>(Lnz3;)V

    .line 186
    .line 187
    .line 188
    sget-object v6, Lxr1;->e:Lrp4;

    .line 189
    .line 190
    invoke-virtual {v6}, Lrp4;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    check-cast v6, Lo83;

    .line 195
    .line 196
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    new-instance v13, Lbv3;

    .line 200
    .line 201
    invoke-direct {v13, v6, v12}, Lbv3;-><init>(Lo83;Loz3;)V

    .line 202
    .line 203
    .line 204
    sput-object v13, Lxr1;->b:Lbv3;

    .line 205
    .line 206
    invoke-virtual {v13}, Lbv3;->c()Lk14;

    .line 207
    .line 208
    .line 209
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 210
    :try_start_1
    iget-boolean v12, v6, Lk14;->C:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    .line 212
    if-eqz v12, :cond_13

    .line 213
    .line 214
    :try_start_2
    new-instance v10, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    const-string v11, "Listening to "

    .line 220
    .line 221
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    sget-object v4, Lio1;->b:Landroid/os/Handler;

    .line 238
    .line 239
    sget-object v10, Lxr1;->f:Lu6;

    .line 240
    .line 241
    invoke-virtual {v4, v10}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 242
    .line 243
    .line 244
    const-wide/16 v11, 0xbb8

    .line 245
    .line 246
    invoke-virtual {v4, v10, v11, v12}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 247
    .line 248
    .line 249
    iget-object v4, v6, Lk14;->t:Ln14;

    .line 250
    .line 251
    if-eqz v4, :cond_12

    .line 252
    .line 253
    invoke-virtual {v4}, Ln14;->source()Lfw;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    if-nez v4, :cond_8

    .line 258
    .line 259
    goto/16 :goto_7

    .line 260
    .line 261
    :cond_8
    :goto_4
    move-object v10, v0

    .line 262
    :cond_9
    :goto_5
    sget-boolean v13, Lxr1;->a:Z

    .line 263
    .line 264
    if-eqz v13, :cond_12

    .line 265
    .line 266
    invoke-interface {v4}, Lfw;->o()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    if-nez v13, :cond_a

    .line 271
    .line 272
    goto/16 :goto_7

    .line 273
    .line 274
    :cond_a
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 275
    .line 276
    .line 277
    move-result v14

    .line 278
    if-nez v14, :cond_b

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_b
    const-string v14, "event:"

    .line 282
    .line 283
    invoke-static {v13, v14, v7}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 284
    .line 285
    .line 286
    move-result v14

    .line 287
    if-eqz v14, :cond_c

    .line 288
    .line 289
    invoke-virtual {v13, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    invoke-static {v10}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    goto :goto_5

    .line 302
    :catchall_0
    move-exception v4

    .line 303
    move-wide v10, v8

    .line 304
    goto/16 :goto_8

    .line 305
    .line 306
    :cond_c
    const-string v14, "data:"

    .line 307
    .line 308
    invoke-static {v13, v14, v7}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 309
    .line 310
    .line 311
    move-result v13

    .line 312
    if-eqz v13, :cond_9

    .line 313
    .line 314
    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    .line 315
    .line 316
    .line 317
    move-result v13

    .line 318
    const v14, 0x9e824bb

    .line 319
    .line 320
    .line 321
    if-eq v13, v14, :cond_f

    .line 322
    .line 323
    const v14, 0x551ac888

    .line 324
    .line 325
    .line 326
    if-eq v13, v14, :cond_e

    .line 327
    .line 328
    const v14, 0x553972de

    .line 329
    .line 330
    .line 331
    if-eq v13, v14, :cond_d

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_d
    const-string v13, "assistant"

    .line 335
    .line 336
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-eqz v13, :cond_9

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_e
    const-string v13, "download"

    .line 344
    .line 345
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    if-nez v13, :cond_10

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_f
    invoke-virtual {v10, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v13

    .line 356
    if-nez v13, :cond_10

    .line 357
    .line 358
    goto :goto_5

    .line 359
    :cond_10
    :goto_6
    new-instance v13, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    const-string v14, "Event: "

    .line 365
    .line 366
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v13

    .line 376
    invoke-static {v3, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    invoke-virtual {v10, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v13

    .line 383
    if-eqz v13, :cond_11

    .line 384
    .line 385
    sget-object v13, Lwn1;->a:Lk03;

    .line 386
    .line 387
    sget-object v13, Lio1;->b:Landroid/os/Handler;

    .line 388
    .line 389
    new-instance v14, Lu6;

    .line 390
    .line 391
    invoke-direct {v14, v5}, Lu6;-><init>(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 395
    .line 396
    .line 397
    :cond_11
    sget-object v13, Lio1;->b:Landroid/os/Handler;

    .line 398
    .line 399
    sget-object v14, Lxr1;->f:Lu6;

    .line 400
    .line 401
    invoke-virtual {v13, v14}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v13, v14, v11, v12}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 405
    .line 406
    .line 407
    goto/16 :goto_5

    .line 408
    .line 409
    :cond_12
    :goto_7
    :try_start_3
    invoke-virtual {v6}, Lk14;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 410
    .line 411
    .line 412
    move-wide v10, v8

    .line 413
    goto :goto_a

    .line 414
    :catch_0
    move-exception v4

    .line 415
    move-wide v10, v8

    .line 416
    goto :goto_9

    .line 417
    :cond_13
    :try_start_4
    invoke-static {v6}, Lrr1;->i(Lk14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 422
    :catchall_1
    move-exception v4

    .line 423
    :goto_8
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 424
    :catchall_2
    move-exception v12

    .line 425
    :try_start_6
    invoke-static {v6, v4}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    throw v12
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 429
    :catch_1
    move-exception v4

    .line 430
    :goto_9
    sget-boolean v6, Lxr1;->a:Z

    .line 431
    .line 432
    if-eqz v6, :cond_14

    .line 433
    .line 434
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    new-instance v6, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    const-string v12, "Event stream dropped: "

    .line 441
    .line 442
    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    invoke-static {}, Lrr1;->m()V

    .line 456
    .line 457
    .line 458
    :goto_a
    sget-boolean v4, Lxr1;->a:Z

    .line 459
    .line 460
    if-eqz v4, :cond_14

    .line 461
    .line 462
    :try_start_7
    invoke-static {v10, v11}, Ljava/lang/Thread;->sleep(J)V
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_2

    .line 463
    .line 464
    .line 465
    const-wide/16 v12, 0x2

    .line 466
    .line 467
    mul-long/2addr v10, v12

    .line 468
    const-wide/32 v12, 0xea60

    .line 469
    .line 470
    .line 471
    cmp-long v4, v10, v12

    .line 472
    .line 473
    if-lez v4, :cond_7

    .line 474
    .line 475
    move-wide v10, v12

    .line 476
    goto/16 :goto_3

    .line 477
    .line 478
    :catch_2
    :cond_14
    return-void

    .line 479
    :pswitch_c
    sget-object p0, Lwn1;->a:Lk03;

    .line 480
    .line 481
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    check-cast v0, Ljava/lang/Long;

    .line 486
    .line 487
    if-eqz v0, :cond_15

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 490
    .line 491
    .line 492
    move-result-wide v3

    .line 493
    :cond_15
    const-wide/16 v0, 0x1

    .line 494
    .line 495
    add-long/2addr v3, v0

    .line 496
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {p0, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :pswitch_d
    :try_start_8
    invoke-static {}, Lg51;->h()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 505
    .line 506
    .line 507
    invoke-static {}, Lg51;->g()V

    .line 508
    .line 509
    .line 510
    return-void

    .line 511
    :catchall_3
    move-exception p0

    .line 512
    invoke-static {}, Lg51;->g()V

    .line 513
    .line 514
    .line 515
    throw p0

    .line 516
    :pswitch_e
    sget-object p0, Lb00;->a:Lb00;

    .line 517
    .line 518
    monitor-enter p0

    .line 519
    :try_start_9
    sput-boolean v7, Lb00;->i:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 520
    .line 521
    monitor-exit p0

    .line 522
    :goto_b
    invoke-static {}, Lb00;->b()Lkd3;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    if-nez v3, :cond_16

    .line 527
    .line 528
    goto/16 :goto_f

    .line 529
    .line 530
    :cond_16
    iget-object v3, v3, Lkd3;->n:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v3, Ljava/lang/String;

    .line 533
    .line 534
    sget-object v4, Lb00;->e:Lrp4;

    .line 535
    .line 536
    invoke-virtual {v4}, Lrp4;->getValue()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    check-cast v4, Lzz;

    .line 541
    .line 542
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    iget-object v7, v4, Lzz;->a:Lwz;

    .line 549
    .line 550
    monitor-enter v7

    .line 551
    :try_start_a
    iget-object v8, v7, Lwz;->c:Ljava/util/List;

    .line 552
    .line 553
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 554
    .line 555
    .line 556
    move-result-object v8

    .line 557
    :cond_17
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 558
    .line 559
    .line 560
    move-result v9

    .line 561
    if-eqz v9, :cond_18

    .line 562
    .line 563
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v9

    .line 567
    move-object v10, v9

    .line 568
    check-cast v10, Lvz;

    .line 569
    .line 570
    iget-object v10, v10, Lvz;->a:Ljava/lang/String;

    .line 571
    .line 572
    invoke-static {v10, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v10

    .line 576
    if-eqz v10, :cond_17

    .line 577
    .line 578
    goto :goto_c

    .line 579
    :catchall_4
    move-exception p0

    .line 580
    goto/16 :goto_10

    .line 581
    .line 582
    :cond_18
    move-object v9, v6

    .line 583
    :goto_c
    check-cast v9, Lvz;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 584
    .line 585
    monitor-exit v7

    .line 586
    if-nez v9, :cond_19

    .line 587
    .line 588
    new-instance v4, Lyz;

    .line 589
    .line 590
    sget-object v7, Lxz;->n:Lxz;

    .line 591
    .line 592
    invoke-direct {v4, v7, v6, v2}, Lyz;-><init>(Lxz;Lvz;I)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_e

    .line 596
    .line 597
    :cond_19
    :try_start_b
    iget-object v7, v4, Lzz;->b:Lk2;

    .line 598
    .line 599
    invoke-virtual {v7, v9}, Lk2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    iget-object v7, v4, Lzz;->a:Lwz;

    .line 603
    .line 604
    invoke-virtual {v7, v9}, Lwz;->b(Lvz;)V

    .line 605
    .line 606
    .line 607
    new-instance v7, Lyz;

    .line 608
    .line 609
    sget-object v8, Lxz;->p:Lxz;

    .line 610
    .line 611
    invoke-direct {v7, v8, v9, v5}, Lyz;-><init>(Lxz;Lvz;I)V
    :try_end_b
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    .line 612
    .line 613
    .line 614
    move-object v4, v7

    .line 615
    goto :goto_e

    .line 616
    :catch_3
    move-exception v7

    .line 617
    goto :goto_d

    .line 618
    :catch_4
    new-instance v4, Lyz;

    .line 619
    .line 620
    sget-object v7, Lxz;->o:Lxz;

    .line 621
    .line 622
    invoke-direct {v4, v7, v6, v2}, Lyz;-><init>(Lxz;Lvz;I)V

    .line 623
    .line 624
    .line 625
    goto :goto_e

    .line 626
    :goto_d
    iget v8, v7, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 627
    .line 628
    const/16 v10, 0x190

    .line 629
    .line 630
    if-gt v10, v8, :cond_1a

    .line 631
    .line 632
    const/16 v10, 0x1f4

    .line 633
    .line 634
    if-ge v8, v10, :cond_1a

    .line 635
    .line 636
    const/16 v8, 0x191

    .line 637
    .line 638
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 639
    .line 640
    .line 641
    move-result-object v8

    .line 642
    const/16 v10, 0x193

    .line 643
    .line 644
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    const/16 v11, 0x198

    .line 649
    .line 650
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 651
    .line 652
    .line 653
    move-result-object v11

    .line 654
    const/16 v12, 0x1ad

    .line 655
    .line 656
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 657
    .line 658
    .line 659
    move-result-object v12

    .line 660
    filled-new-array {v8, v10, v11, v12}, [Ljava/lang/Integer;

    .line 661
    .line 662
    .line 663
    move-result-object v8

    .line 664
    invoke-static {v8}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object v8

    .line 668
    iget v10, v7, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 669
    .line 670
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 671
    .line 672
    .line 673
    move-result-object v10

    .line 674
    invoke-interface {v8, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 675
    .line 676
    .line 677
    move-result v8

    .line 678
    if-nez v8, :cond_1a

    .line 679
    .line 680
    :try_start_c
    iget-object v4, v4, Lzz;->a:Lwz;

    .line 681
    .line 682
    invoke-virtual {v4, v9}, Lwz;->b(Lvz;)V

    .line 683
    .line 684
    .line 685
    new-instance v4, Lyz;

    .line 686
    .line 687
    sget-object v8, Lxz;->q:Lxz;

    .line 688
    .line 689
    invoke-direct {v4, v8, v9, v7}, Lyz;-><init>(Lxz;Lvz;Lcom/eddyizm/tempus/homemusic/HubException;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    .line 690
    .line 691
    .line 692
    goto :goto_e

    .line 693
    :catch_5
    new-instance v4, Lyz;

    .line 694
    .line 695
    sget-object v7, Lxz;->o:Lxz;

    .line 696
    .line 697
    invoke-direct {v4, v7, v6, v2}, Lyz;-><init>(Lxz;Lvz;I)V

    .line 698
    .line 699
    .line 700
    goto :goto_e

    .line 701
    :cond_1a
    new-instance v4, Lyz;

    .line 702
    .line 703
    sget-object v7, Lxz;->o:Lxz;

    .line 704
    .line 705
    invoke-direct {v4, v7, v6, v2}, Lyz;-><init>(Lxz;Lvz;I)V

    .line 706
    .line 707
    .line 708
    :goto_e
    iget-object v7, v4, Lyz;->b:Lvz;

    .line 709
    .line 710
    iget-object v8, v4, Lyz;->a:Lxz;

    .line 711
    .line 712
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 713
    .line 714
    .line 715
    move-result v8

    .line 716
    if-eqz v8, :cond_20

    .line 717
    .line 718
    const/4 v9, 0x1

    .line 719
    if-eq v8, v9, :cond_1f

    .line 720
    .line 721
    if-eq v8, v1, :cond_1d

    .line 722
    .line 723
    if-ne v8, v0, :cond_1c

    .line 724
    .line 725
    if-eqz v7, :cond_1b

    .line 726
    .line 727
    sget-object v8, Lio1;->b:Landroid/os/Handler;

    .line 728
    .line 729
    new-instance v9, Lv6;

    .line 730
    .line 731
    const/4 v10, 0x5

    .line 732
    invoke-direct {v9, v3, v7, v4, v10}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 736
    .line 737
    .line 738
    goto/16 :goto_b

    .line 739
    .line 740
    :cond_1b
    const-string p0, "Required value was null."

    .line 741
    .line 742
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    goto :goto_f

    .line 746
    :cond_1c
    invoke-static {}, Ler1;->n()V

    .line 747
    .line 748
    .line 749
    goto :goto_f

    .line 750
    :cond_1d
    if-eqz v7, :cond_1e

    .line 751
    .line 752
    sget-object v4, Lio1;->b:Landroid/os/Handler;

    .line 753
    .line 754
    new-instance v8, Lk6;

    .line 755
    .line 756
    const/16 v9, 0xe

    .line 757
    .line 758
    invoke-direct {v8, v9, v3, v7}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 762
    .line 763
    .line 764
    goto/16 :goto_b

    .line 765
    .line 766
    :cond_1e
    const-string p0, "Required value was null."

    .line 767
    .line 768
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_f

    .line 772
    :cond_1f
    const-wide/16 v0, 0x7530

    .line 773
    .line 774
    invoke-virtual {p0, v0, v1}, Lb00;->d(J)V

    .line 775
    .line 776
    .line 777
    :cond_20
    :goto_f
    return-void

    .line 778
    :goto_10
    :try_start_d
    monitor-exit v7
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 779
    throw p0

    .line 780
    :catchall_5
    move-exception v0

    .line 781
    monitor-exit p0

    .line 782
    throw v0

    .line 783
    :pswitch_f
    sget-object p0, Lra;->X0:Lq03;

    .line 784
    .line 785
    monitor-enter p0

    .line 786
    :try_start_e
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 787
    .line 788
    iget-object v3, p0, Lq03;->a:[Ljava/lang/Object;

    .line 789
    .line 790
    iget v4, p0, Lq03;->b:I

    .line 791
    .line 792
    const/16 v5, 0x1e

    .line 793
    .line 794
    if-ge v2, v5, :cond_22

    .line 795
    .line 796
    :goto_11
    if-ge v7, v4, :cond_23

    .line 797
    .line 798
    :try_start_f
    aget-object v0, v3, v7

    .line 799
    .line 800
    check-cast v0, Lra;

    .line 801
    .line 802
    invoke-virtual {v0}, Lra;->getShowLayoutBounds()Z

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    sget-object v5, Lra;->U0:Ljava/lang/Class;

    .line 807
    .line 808
    invoke-static {}, Lte5;->v()Z

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    invoke-virtual {v0, v5}, Lra;->setShowLayoutBounds(Z)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v0}, Lra;->getShowLayoutBounds()Z

    .line 816
    .line 817
    .line 818
    move-result v5

    .line 819
    if-eq v2, v5, :cond_21

    .line 820
    .line 821
    new-instance v2, Lia;

    .line 822
    .line 823
    invoke-direct {v2, v0, v1}, Lia;-><init>(Lra;I)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 827
    .line 828
    .line 829
    goto :goto_12

    .line 830
    :catchall_6
    move-exception v0

    .line 831
    goto :goto_14

    .line 832
    :cond_21
    :goto_12
    add-int/lit8 v7, v7, 0x1

    .line 833
    .line 834
    goto :goto_11

    .line 835
    :cond_22
    :goto_13
    if-ge v7, v4, :cond_23

    .line 836
    .line 837
    aget-object v1, v3, v7

    .line 838
    .line 839
    check-cast v1, Lra;

    .line 840
    .line 841
    new-instance v2, Lia;

    .line 842
    .line 843
    invoke-direct {v2, v1, v0}, Lia;-><init>(Lra;I)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 847
    .line 848
    .line 849
    add-int/lit8 v7, v7, 0x1

    .line 850
    .line 851
    goto :goto_13

    .line 852
    :cond_23
    monitor-exit p0

    .line 853
    return-void

    .line 854
    :goto_14
    monitor-exit p0

    .line 855
    throw v0

    .line 856
    :pswitch_10
    sget-object p0, Lx6;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 857
    .line 858
    :try_start_10
    invoke-static {}, Lx6;->a()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 859
    .line 860
    .line 861
    :goto_15
    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 862
    .line 863
    .line 864
    goto :goto_16

    .line 865
    :catchall_7
    move-exception v0

    .line 866
    goto :goto_17

    .line 867
    :catch_6
    move-exception v0

    .line 868
    :try_start_11
    sget-object v1, Lx6;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 869
    .line 870
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 871
    .line 872
    .line 873
    const-string v1, "AlbumArtistBackfill"

    .line 874
    .line 875
    const-string v2, "Album artist backfill failed"

    .line 876
    .line 877
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 878
    .line 879
    .line 880
    goto :goto_15

    .line 881
    :goto_16
    return-void

    .line 882
    :goto_17
    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 883
    .line 884
    .line 885
    throw v0

    .line 886
    nop

    .line 887
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
