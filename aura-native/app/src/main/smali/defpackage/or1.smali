.class public final synthetic Ldefpackage/or1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/or1;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v0, v0, Ldefpackage/or1;->n:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v0, p1

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Throwable;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Throwable;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :pswitch_1
    move-object/from16 v0, p1

    .line 38
    .line 39
    check-cast v0, Ldefpackage/x34;

    .line 40
    .line 41
    const-string v2, "DELETE FROM internet_radio_station_cache WHERE source = \'subsonic\'"

    .line 42
    .line 43
    invoke-interface {v0, v2}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :try_start_0
    invoke-interface {v2}, Ldefpackage/z34;->O()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :pswitch_2
    move-object/from16 v0, p1

    .line 60
    .line 61
    check-cast v0, Ldefpackage/x34;

    .line 62
    .line 63
    const-string v2, "SELECT * FROM internet_radio_station_cache WHERE source = \'local\'"

    .line 64
    .line 65
    invoke-interface {v0, v2}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :try_start_1
    const-string v0, "id"

    .line 70
    .line 71
    invoke-static {v2, v0}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const-string v3, "name"

    .line 76
    .line 77
    invoke-static {v2, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    const-string v4, "stream_url"

    .line 82
    .line 83
    invoke-static {v2, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    const-string v5, "home_page_url"

    .line 88
    .line 89
    invoke-static {v2, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    const-string v6, "source"

    .line 94
    .line 95
    invoke-static {v2, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    const-string v7, "cover_art_url"

    .line 100
    .line 101
    invoke-static {v2, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    new-instance v8, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-interface {v2}, Ldefpackage/z34;->O()Z

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-eqz v9, :cond_6

    .line 115
    .line 116
    invoke-interface {v2, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    if-eqz v9, :cond_0

    .line 121
    .line 122
    move-object v11, v1

    .line 123
    goto :goto_1

    .line 124
    :cond_0
    invoke-interface {v2, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    move-object v11, v9

    .line 129
    :goto_1
    invoke-interface {v2, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-eqz v9, :cond_1

    .line 134
    .line 135
    move-object v12, v1

    .line 136
    goto :goto_2

    .line 137
    :cond_1
    invoke-interface {v2, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    move-object v12, v9

    .line 142
    :goto_2
    invoke-interface {v2, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_2

    .line 147
    .line 148
    move-object v13, v1

    .line 149
    goto :goto_3

    .line 150
    :cond_2
    invoke-interface {v2, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    move-object v13, v9

    .line 155
    :goto_3
    invoke-interface {v2, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-eqz v9, :cond_3

    .line 160
    .line 161
    move-object v14, v1

    .line 162
    goto :goto_4

    .line 163
    :cond_3
    invoke-interface {v2, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    move-object v14, v9

    .line 168
    :goto_4
    invoke-interface {v2, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_4

    .line 173
    .line 174
    move-object v15, v1

    .line 175
    goto :goto_5

    .line 176
    :cond_4
    invoke-interface {v2, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    move-object v15, v9

    .line 181
    :goto_5
    invoke-interface {v2, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-eqz v9, :cond_5

    .line 186
    .line 187
    move-object/from16 v16, v1

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_5
    invoke-interface {v2, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    move-object/from16 v16, v9

    .line 195
    .line 196
    :goto_6
    new-instance v10, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 197
    .line 198
    invoke-direct/range {v10 .. v16}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 202
    .line 203
    .line 204
    goto :goto_0

    .line 205
    :catchall_1
    move-exception v0

    .line 206
    goto :goto_7

    .line 207
    :cond_6
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 208
    .line 209
    .line 210
    return-object v8

    .line 211
    :goto_7
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :pswitch_3
    move-object/from16 v0, p1

    .line 216
    .line 217
    check-cast v0, Ldefpackage/x34;

    .line 218
    .line 219
    const-string v2, "SELECT * FROM internet_radio_station_cache"

    .line 220
    .line 221
    invoke-interface {v0, v2}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    :try_start_2
    const-string v0, "id"

    .line 226
    .line 227
    invoke-static {v2, v0}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    const-string v3, "name"

    .line 232
    .line 233
    invoke-static {v2, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    const-string v4, "stream_url"

    .line 238
    .line 239
    invoke-static {v2, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    const-string v5, "home_page_url"

    .line 244
    .line 245
    invoke-static {v2, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 246
    .line 247
    .line 248
    move-result v5

    .line 249
    const-string v6, "source"

    .line 250
    .line 251
    invoke-static {v2, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v6

    .line 255
    const-string v7, "cover_art_url"

    .line 256
    .line 257
    invoke-static {v2, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    new-instance v8, Ljava/util/ArrayList;

    .line 262
    .line 263
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 264
    .line 265
    .line 266
    :goto_8
    invoke-interface {v2}, Ldefpackage/z34;->O()Z

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    if-eqz v9, :cond_d

    .line 271
    .line 272
    invoke-interface {v2, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    if-eqz v9, :cond_7

    .line 277
    .line 278
    move-object v11, v1

    .line 279
    goto :goto_9

    .line 280
    :cond_7
    invoke-interface {v2, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    move-object v11, v9

    .line 285
    :goto_9
    invoke-interface {v2, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 286
    .line 287
    .line 288
    move-result v9

    .line 289
    if-eqz v9, :cond_8

    .line 290
    .line 291
    move-object v12, v1

    .line 292
    goto :goto_a

    .line 293
    :cond_8
    invoke-interface {v2, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    move-object v12, v9

    .line 298
    :goto_a
    invoke-interface {v2, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    if-eqz v9, :cond_9

    .line 303
    .line 304
    move-object v13, v1

    .line 305
    goto :goto_b

    .line 306
    :cond_9
    invoke-interface {v2, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v9

    .line 310
    move-object v13, v9

    .line 311
    :goto_b
    invoke-interface {v2, v5}, Ldefpackage/z34;->isNull(I)Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-eqz v9, :cond_a

    .line 316
    .line 317
    move-object v14, v1

    .line 318
    goto :goto_c

    .line 319
    :cond_a
    invoke-interface {v2, v5}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    move-object v14, v9

    .line 324
    :goto_c
    invoke-interface {v2, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-eqz v9, :cond_b

    .line 329
    .line 330
    move-object v15, v1

    .line 331
    goto :goto_d

    .line 332
    :cond_b
    invoke-interface {v2, v6}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v9

    .line 336
    move-object v15, v9

    .line 337
    :goto_d
    invoke-interface {v2, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    if-eqz v9, :cond_c

    .line 342
    .line 343
    move-object/from16 v16, v1

    .line 344
    .line 345
    goto :goto_e

    .line 346
    :cond_c
    invoke-interface {v2, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v9

    .line 350
    move-object/from16 v16, v9

    .line 351
    .line 352
    :goto_e
    new-instance v10, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 353
    .line 354
    invoke-direct/range {v10 .. v16}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 358
    .line 359
    .line 360
    goto :goto_8

    .line 361
    :catchall_2
    move-exception v0

    .line 362
    goto :goto_f

    .line 363
    :cond_d
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 364
    .line 365
    .line 366
    return-object v8

    .line 367
    :goto_f
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :pswitch_4
    move-object/from16 v0, p1

    .line 372
    .line 373
    check-cast v0, Ldefpackage/ig3;

    .line 374
    .line 375
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_5
    move-object/from16 v0, p1

    .line 379
    .line 380
    check-cast v0, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    sget-object v2, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 386
    .line 387
    sget-object v2, Ldefpackage/rs1;->b:Ldefpackage/rp4;

    .line 388
    .line 389
    invoke-virtual {v2}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    check-cast v2, Ldefpackage/lh3;

    .line 394
    .line 395
    monitor-enter v2

    .line 396
    :try_start_3
    invoke-virtual {v2}, Ldefpackage/lh3;->a()Ljava/util/List;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    new-instance v4, Ljava/util/ArrayList;

    .line 401
    .line 402
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-eqz v3, :cond_e

    .line 410
    .line 411
    goto :goto_10

    .line 412
    :cond_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    const/4 v5, 0x0

    .line 417
    :cond_f
    if-ge v5, v3, :cond_10

    .line 418
    .line 419
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    add-int/lit8 v5, v5, 0x1

    .line 424
    .line 425
    check-cast v6, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 426
    .line 427
    invoke-virtual {v6}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    invoke-static {v6, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 439
    if-eqz v6, :cond_f

    .line 440
    .line 441
    monitor-exit v2

    .line 442
    goto :goto_11

    .line 443
    :catchall_3
    move-exception v0

    .line 444
    goto/16 :goto_16

    .line 445
    .line 446
    :cond_10
    :goto_10
    :try_start_4
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    const-string v5, "progress"

    .line 451
    .line 452
    invoke-static {v3, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-eqz v3, :cond_11

    .line 457
    .line 458
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    if-eqz v3, :cond_11

    .line 463
    .line 464
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDeviceId()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    if-eqz v3, :cond_11

    .line 469
    .line 470
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    if-eqz v3, :cond_11

    .line 475
    .line 476
    new-instance v3, Ldefpackage/x;

    .line 477
    .line 478
    const/16 v5, 0x1c

    .line 479
    .line 480
    invoke-direct {v3, v5, v0}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-static {v4, v3}, Ldefpackage/v40;->p0(Ljava/util/List;Ldefpackage/if1;)Z

    .line 484
    .line 485
    .line 486
    :cond_11
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v4}, Ldefpackage/lh3;->d(Ljava/util/List;)V

    .line 490
    .line 491
    .line 492
    iput-object v4, v2, Ldefpackage/lh3;->c:Ljava/util/ArrayList;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 493
    .line 494
    monitor-exit v2

    .line 495
    :goto_11
    sget-object v2, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 496
    .line 497
    const-string v2, "Check failed."

    .line 498
    .line 499
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v3

    .line 503
    if-nez v3, :cond_12

    .line 504
    .line 505
    goto/16 :goto_14

    .line 506
    .line 507
    :cond_12
    new-instance v4, Ljava/io/File;

    .line 508
    .line 509
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 514
    .line 515
    .line 516
    move-result-object v5

    .line 517
    const-string v6, "homemusic-open-plays"

    .line 518
    .line 519
    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 523
    .line 524
    .line 525
    move-result v5

    .line 526
    if-nez v5, :cond_14

    .line 527
    .line 528
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 529
    .line 530
    .line 531
    move-result v5

    .line 532
    if-eqz v5, :cond_13

    .line 533
    .line 534
    goto :goto_12

    .line 535
    :cond_13
    invoke-static {v2}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_15

    .line 539
    .line 540
    :cond_14
    :goto_12
    new-instance v5, Ljava/io/File;

    .line 541
    .line 542
    const-string v6, ".json"

    .line 543
    .line 544
    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v6

    .line 548
    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    const-string v7, "start"

    .line 556
    .line 557
    invoke-static {v6, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v6

    .line 561
    if-nez v6, :cond_17

    .line 562
    .line 563
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    const-string v7, "progress"

    .line 568
    .line 569
    invoke-static {v6, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    if-eqz v6, :cond_15

    .line 574
    .line 575
    goto :goto_13

    .line 576
    :cond_15
    const-string v3, "skip"

    .line 577
    .line 578
    const-string v4, "finish"

    .line 579
    .line 580
    const-string v6, "interrupted"

    .line 581
    .line 582
    const-string v7, "error"

    .line 583
    .line 584
    filled-new-array {v3, v4, v6, v7}, [Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    invoke-static {v3}, Ldefpackage/ti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_18

    .line 601
    .line 602
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-nez v0, :cond_18

    .line 607
    .line 608
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-nez v0, :cond_16

    .line 613
    .line 614
    goto :goto_14

    .line 615
    :cond_16
    invoke-static {v2}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    goto :goto_15

    .line 619
    :cond_17
    :goto_13
    new-instance v1, Ljava/io/File;

    .line 620
    .line 621
    const-string v2, ".tmp"

    .line 622
    .line 623
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v2

    .line 627
    invoke-direct {v1, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    sget-object v2, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 631
    .line 632
    invoke-virtual {v2, v0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    invoke-static {v1, v0}, Ldefpackage/ji2;->U(Ljava/io/File;Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v1, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    if-nez v0, :cond_18

    .line 647
    .line 648
    invoke-static {v1}, Ldefpackage/ji2;->H(Ljava/io/File;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-static {v5, v0}, Ldefpackage/ji2;->U(Ljava/io/File;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 656
    .line 657
    .line 658
    :cond_18
    :goto_14
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 659
    .line 660
    :goto_15
    return-object v1

    .line 661
    :goto_16
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 662
    throw v0

    .line 663
    :pswitch_6
    move-object/from16 v0, p1

    .line 664
    .line 665
    check-cast v0, Ljava/lang/String;

    .line 666
    .line 667
    invoke-static {v0}, Ldefpackage/b11;->f(Ljava/lang/String;)Ldefpackage/nz3;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    const-string v2, "/api/starred"

    .line 672
    .line 673
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {v1, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    new-instance v0, Ldefpackage/oz3;

    .line 681
    .line 682
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 683
    .line 684
    .line 685
    return-object v0

    .line 686
    :pswitch_7
    move-object/from16 v0, p1

    .line 687
    .line 688
    check-cast v0, Ldefpackage/k14;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 694
    .line 695
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;

    .line 696
    .line 697
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;

    .line 702
    .line 703
    return-object v0

    .line 704
    :pswitch_8
    move-object/from16 v0, p1

    .line 705
    .line 706
    check-cast v0, Ldefpackage/k14;

    .line 707
    .line 708
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 712
    .line 713
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubDownloadItem;

    .line 714
    .line 715
    invoke-static {v0, v1}, Ldefpackage/rr1;->q(Ldefpackage/k14;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    return-object v0

    .line 720
    :pswitch_9
    move-object/from16 v0, p1

    .line 721
    .line 722
    check-cast v0, Ldefpackage/k14;

    .line 723
    .line 724
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 725
    .line 726
    .line 727
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 728
    .line 729
    return-object v0

    .line 730
    :pswitch_a
    move-object/from16 v0, p1

    .line 731
    .line 732
    check-cast v0, Ljava/lang/String;

    .line 733
    .line 734
    invoke-static {v0}, Ldefpackage/b11;->f(Ljava/lang/String;)Ldefpackage/nz3;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    const-string v2, "/api/downloads?limit=200"

    .line 739
    .line 740
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v1, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    new-instance v0, Ldefpackage/oz3;

    .line 748
    .line 749
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 750
    .line 751
    .line 752
    return-object v0

    .line 753
    :pswitch_b
    move-object/from16 v0, p1

    .line 754
    .line 755
    check-cast v0, Ldefpackage/k14;

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 761
    .line 762
    const-class v1, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 763
    .line 764
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 769
    .line 770
    return-object v0

    .line 771
    :pswitch_c
    move-object/from16 v0, p1

    .line 772
    .line 773
    check-cast v0, Ldefpackage/k14;

    .line 774
    .line 775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_d
    move-object/from16 v0, p1

    .line 782
    .line 783
    check-cast v0, Ldefpackage/k14;

    .line 784
    .line 785
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 789
    .line 790
    const-class v1, Lcom/eddyizm/tempus/homemusic/SmartAddOut;

    .line 791
    .line 792
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartAddOut;

    .line 797
    .line 798
    return-object v0

    .line 799
    :pswitch_e
    move-object/from16 v0, p1

    .line 800
    .line 801
    check-cast v0, Ldefpackage/k14;

    .line 802
    .line 803
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 807
    .line 808
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubTrackSource;

    .line 809
    .line 810
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubTrackSource;

    .line 815
    .line 816
    return-object v0

    .line 817
    :pswitch_f
    move-object/from16 v0, p1

    .line 818
    .line 819
    check-cast v0, Ldefpackage/k14;

    .line 820
    .line 821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 825
    .line 826
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubTrackSource;

    .line 827
    .line 828
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubTrackSource;

    .line 833
    .line 834
    return-object v0

    .line 835
    :pswitch_10
    move-object/from16 v0, p1

    .line 836
    .line 837
    check-cast v0, Ldefpackage/k14;

    .line 838
    .line 839
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 843
    .line 844
    const-class v1, Ldefpackage/vr1;

    .line 845
    .line 846
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    new-instance v0, Ljava/lang/ClassCastException;

    .line 850
    .line 851
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 852
    .line 853
    .line 854
    throw v0

    .line 855
    :pswitch_11
    move-object/from16 v0, p1

    .line 856
    .line 857
    check-cast v0, Ldefpackage/k14;

    .line 858
    .line 859
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 863
    .line 864
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 865
    .line 866
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 871
    .line 872
    return-object v0

    .line 873
    :pswitch_12
    move-object/from16 v0, p1

    .line 874
    .line 875
    check-cast v0, Ljava/lang/String;

    .line 876
    .line 877
    invoke-static {v0}, Ldefpackage/b11;->f(Ljava/lang/String;)Ldefpackage/nz3;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    const-string v2, "/api/auth/google/link"

    .line 882
    .line 883
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual {v1, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    sget-object v0, Ldefpackage/xe5;->d:Ldefpackage/we5;

    .line 891
    .line 892
    const-string v2, "DELETE"

    .line 893
    .line 894
    invoke-virtual {v1, v2, v0}, Ldefpackage/nz3;->b(Ljava/lang/String;Ldefpackage/tz3;)V

    .line 895
    .line 896
    .line 897
    new-instance v0, Ldefpackage/oz3;

    .line 898
    .line 899
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 900
    .line 901
    .line 902
    return-object v0

    .line 903
    :pswitch_13
    move-object/from16 v0, p1

    .line 904
    .line 905
    check-cast v0, Ldefpackage/k14;

    .line 906
    .line 907
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    .line 909
    .line 910
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_14
    move-object/from16 v0, p1

    .line 914
    .line 915
    check-cast v0, Ldefpackage/k14;

    .line 916
    .line 917
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 921
    .line 922
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 923
    .line 924
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 929
    .line 930
    return-object v0

    .line 931
    :pswitch_15
    move-object/from16 v0, p1

    .line 932
    .line 933
    check-cast v0, Ldefpackage/k14;

    .line 934
    .line 935
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 939
    .line 940
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubLikedSongs;

    .line 941
    .line 942
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubLikedSongs;

    .line 947
    .line 948
    return-object v0

    .line 949
    :pswitch_16
    move-object/from16 v0, p1

    .line 950
    .line 951
    check-cast v0, Ljava/lang/String;

    .line 952
    .line 953
    invoke-static {v0}, Ldefpackage/b11;->f(Ljava/lang/String;)Ldefpackage/nz3;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    const-string v2, "/api/nd/liked"

    .line 958
    .line 959
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v1, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 964
    .line 965
    .line 966
    new-instance v0, Ldefpackage/oz3;

    .line 967
    .line 968
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 969
    .line 970
    .line 971
    return-object v0

    .line 972
    :pswitch_17
    move-object/from16 v0, p1

    .line 973
    .line 974
    check-cast v0, Ldefpackage/k14;

    .line 975
    .line 976
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 977
    .line 978
    .line 979
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 980
    .line 981
    const-class v1, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 982
    .line 983
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v0

    .line 987
    check-cast v0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 988
    .line 989
    return-object v0

    .line 990
    :pswitch_18
    move-object/from16 v0, p1

    .line 991
    .line 992
    check-cast v0, Ldefpackage/k14;

    .line 993
    .line 994
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 998
    .line 999
    const-class v1, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 1000
    .line 1001
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v0

    .line 1005
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 1006
    .line 1007
    return-object v0

    .line 1008
    :pswitch_19
    move-object/from16 v0, p1

    .line 1009
    .line 1010
    check-cast v0, Ldefpackage/k14;

    .line 1011
    .line 1012
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 1016
    .line 1017
    const-class v1, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 1018
    .line 1019
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    check-cast v0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 1024
    .line 1025
    return-object v0

    .line 1026
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1027
    .line 1028
    check-cast v0, Ldefpackage/k14;

    .line 1029
    .line 1030
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1034
    .line 1035
    return-object v0

    .line 1036
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1037
    .line 1038
    check-cast v0, Ldefpackage/k14;

    .line 1039
    .line 1040
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1041
    .line 1042
    .line 1043
    sget-object v1, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 1044
    .line 1045
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 1046
    .line 1047
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 1052
    .line 1053
    return-object v0

    .line 1054
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1055
    .line 1056
    check-cast v0, Ljava/lang/String;

    .line 1057
    .line 1058
    invoke-static {v0}, Ldefpackage/b11;->f(Ljava/lang/String;)Ldefpackage/nz3;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    const-string v2, "/api/mixes/today"

    .line 1063
    .line 1064
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    invoke-virtual {v1, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 1069
    .line 1070
    .line 1071
    new-instance v0, Ldefpackage/oz3;

    .line 1072
    .line 1073
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 1074
    .line 1075
    .line 1076
    return-object v0

    .line 1077
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
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
