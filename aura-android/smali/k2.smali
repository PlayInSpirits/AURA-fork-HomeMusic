.class public final synthetic Lk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    const/16 p1, 0x13

    .line 2
    .line 3
    iput p1, p0, Lk2;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 9
    iput p1, p0, Lk2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lk2;->n:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v0, v1

    .line 14
    check-cast v0, Lk14;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v1, Lrr1;->a:Lrr1;

    .line 20
    .line 21
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lrr1;->p(Lk14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    move-object v0, v1

    .line 31
    check-cast v0, Lk14;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lrr1;->a:Lrr1;

    .line 37
    .line 38
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubUpload;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lrr1;->q(Lk14;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :pswitch_1
    move-object v0, v1

    .line 46
    check-cast v0, Lk14;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v1, Lrr1;->a:Lrr1;

    .line 52
    .line 53
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lrr1;->p(Lk14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object v0, v1

    .line 63
    check-cast v0, Lk14;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v1, Lrr1;->a:Lrr1;

    .line 69
    .line 70
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lrr1;->q(Lk14;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    :pswitch_3
    move-object v0, v1

    .line 78
    check-cast v0, Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0}, Lb11;->f(Ljava/lang/String;)Lnz3;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "/api/assistant/tasks"

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v1, v0}, Lnz3;->d(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance v0, Loz3;

    .line 94
    .line 95
    invoke-direct {v0, v1}, Loz3;-><init>(Lnz3;)V

    .line 96
    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_4
    move-object v0, v1

    .line 100
    check-cast v0, Lk14;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    sget-object v1, Lrr1;->a:Lrr1;

    .line 106
    .line 107
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;

    .line 108
    .line 109
    invoke-static {v0, v1}, Lrr1;->p(Lk14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_5
    move-object v0, v1

    .line 117
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-eqz v0, :cond_0

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_0
    const-string v0, ""

    .line 130
    .line 131
    :goto_0
    return-object v0

    .line 132
    :pswitch_6
    move-object v0, v1

    .line 133
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    :goto_1
    return-object v0

    .line 150
    :pswitch_7
    move-object v0, v1

    .line 151
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_2

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_2
    return-object v0

    .line 168
    :pswitch_8
    sget-object v2, Ljh4;->c:Ljava/lang/Object;

    .line 169
    .line 170
    monitor-enter v2

    .line 171
    :try_start_0
    sget-object v0, Ljh4;->i:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    :goto_3
    if-ge v4, v3, :cond_3

    .line 178
    .line 179
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Lif1;

    .line 184
    .line 185
    invoke-interface {v5, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    .line 188
    add-int/lit8 v4, v4, 0x1

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    goto :goto_4

    .line 193
    :cond_3
    monitor-exit v2

    .line 194
    sget-object v0, Lj15;->a:Lj15;

    .line 195
    .line 196
    return-object v0

    .line 197
    :goto_4
    monitor-exit v2

    .line 198
    throw v0

    .line 199
    :pswitch_9
    move-object v0, v1

    .line 200
    check-cast v0, Lba1;

    .line 201
    .line 202
    invoke-virtual {v0}, Lba1;->q0()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0

    .line 211
    :pswitch_a
    move-object v0, v1

    .line 212
    check-cast v0, Lxy;

    .line 213
    .line 214
    sget-object v0, Lj15;->a:Lj15;

    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_b
    move-object v0, v1

    .line 218
    check-cast v0, Lx34;

    .line 219
    .line 220
    const-string v1, "SELECT * FROM favorite"

    .line 221
    .line 222
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    :try_start_1
    const-string v0, "timestamp"

    .line 227
    .line 228
    invoke-static {v1, v0}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    const-string v5, "songId"

    .line 233
    .line 234
    invoke-static {v1, v5}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    const-string v6, "albumId"

    .line 239
    .line 240
    invoke-static {v1, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    const-string v7, "artistId"

    .line 245
    .line 246
    invoke-static {v1, v7}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    const-string v8, "toStar"

    .line 251
    .line 252
    invoke-static {v1, v8}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    new-instance v9, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    :goto_5
    invoke-interface {v1}, Lz34;->O()Z

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    if-eqz v10, :cond_8

    .line 266
    .line 267
    invoke-interface {v1, v0}, Lz34;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v12

    .line 271
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    if-eqz v10, :cond_4

    .line 276
    .line 277
    move-object v14, v2

    .line 278
    goto :goto_6

    .line 279
    :cond_4
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v10

    .line 283
    move-object v14, v10

    .line 284
    :goto_6
    invoke-interface {v1, v6}, Lz34;->isNull(I)Z

    .line 285
    .line 286
    .line 287
    move-result v10

    .line 288
    if-eqz v10, :cond_5

    .line 289
    .line 290
    move-object v15, v2

    .line 291
    goto :goto_7

    .line 292
    :cond_5
    invoke-interface {v1, v6}, Lz34;->D(I)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v10

    .line 296
    move-object v15, v10

    .line 297
    :goto_7
    invoke-interface {v1, v7}, Lz34;->isNull(I)Z

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    if-eqz v10, :cond_6

    .line 302
    .line 303
    move-object/from16 v16, v2

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_6
    invoke-interface {v1, v7}, Lz34;->D(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    move-object/from16 v16, v10

    .line 311
    .line 312
    :goto_8
    invoke-interface {v1, v8}, Lz34;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v10

    .line 316
    long-to-int v10, v10

    .line 317
    if-eqz v10, :cond_7

    .line 318
    .line 319
    move/from16 v17, v3

    .line 320
    .line 321
    goto :goto_9

    .line 322
    :cond_7
    move/from16 v17, v4

    .line 323
    .line 324
    :goto_9
    new-instance v11, Lcom/eddyizm/tempus/model/Favorite;

    .line 325
    .line 326
    invoke-direct/range {v11 .. v17}, Lcom/eddyizm/tempus/model/Favorite;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 330
    .line 331
    .line 332
    goto :goto_5

    .line 333
    :catchall_1
    move-exception v0

    .line 334
    goto :goto_a

    .line 335
    :cond_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 336
    .line 337
    .line 338
    return-object v9

    .line 339
    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 340
    .line 341
    .line 342
    throw v0

    .line 343
    :pswitch_c
    move-object v0, v1

    .line 344
    check-cast v0, Lx34;

    .line 345
    .line 346
    const-string v1, "SELECT COUNT(*) FROM download WHERE download_state = 1"

    .line 347
    .line 348
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    :try_start_2
    invoke-interface {v1}, Lz34;->O()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_9

    .line 357
    .line 358
    invoke-interface {v1, v4}, Lz34;->getLong(I)J

    .line 359
    .line 360
    .line 361
    move-result-wide v2

    .line 362
    long-to-int v4, v2

    .line 363
    goto :goto_b

    .line 364
    :catchall_2
    move-exception v0

    .line 365
    goto :goto_c

    .line 366
    :cond_9
    :goto_b
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 370
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 371
    .line 372
    .line 373
    return-object v0

    .line 374
    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 375
    .line 376
    .line 377
    throw v0

    .line 378
    :pswitch_d
    move-object v0, v1

    .line 379
    check-cast v0, Lx34;

    .line 380
    .line 381
    const-string v1, "DELETE FROM download"

    .line 382
    .line 383
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    :try_start_3
    invoke-interface {v1}, Lz34;->O()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 388
    .line 389
    .line 390
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 391
    .line 392
    .line 393
    return-object v2

    .line 394
    :catchall_3
    move-exception v0

    .line 395
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 396
    .line 397
    .line 398
    throw v0

    .line 399
    :pswitch_e
    move-object v0, v1

    .line 400
    check-cast v0, Lx34;

    .line 401
    .line 402
    const-string v1, "SELECT DISTINCT album_id FROM download WHERE NULLIF(album_artist, \'\') IS NULL AND NULLIF(album_id, \'\') IS NOT NULL AND download_state = 1"

    .line 403
    .line 404
    invoke-interface {v0, v1}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    :try_start_4
    new-instance v0, Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 411
    .line 412
    .line 413
    :goto_d
    invoke-interface {v1}, Lz34;->O()Z

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    if-eqz v3, :cond_b

    .line 418
    .line 419
    invoke-interface {v1, v4}, Lz34;->isNull(I)Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-eqz v3, :cond_a

    .line 424
    .line 425
    move-object v3, v2

    .line 426
    goto :goto_e

    .line 427
    :cond_a
    invoke-interface {v1, v4}, Lz34;->D(I)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    :goto_e
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 432
    .line 433
    .line 434
    goto :goto_d

    .line 435
    :catchall_4
    move-exception v0

    .line 436
    goto :goto_f

    .line 437
    :cond_b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 438
    .line 439
    .line 440
    return-object v0

    .line 441
    :goto_f
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 442
    .line 443
    .line 444
    throw v0

    .line 445
    :pswitch_f
    invoke-static {v1}, Lte5;->f(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    return-object v0

    .line 454
    :pswitch_10
    move-object v0, v1

    .line 455
    check-cast v0, Ljava/util/List;

    .line 456
    .line 457
    new-instance v1, Llm0;

    .line 458
    .line 459
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    check-cast v2, Ljava/lang/Integer;

    .line 467
    .line 468
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    check-cast v3, Ljava/lang/Float;

    .line 480
    .line 481
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    new-instance v5, Lkm0;

    .line 486
    .line 487
    invoke-direct {v5, v0, v4}, Lkm0;-><init>(Ljava/util/List;I)V

    .line 488
    .line 489
    .line 490
    invoke-direct {v1, v2, v3, v5}, Llm0;-><init>(IFLgf1;)V

    .line 491
    .line 492
    .line 493
    return-object v1

    .line 494
    :pswitch_11
    move-object v0, v1

    .line 495
    check-cast v0, Lle0;

    .line 496
    .line 497
    instance-of v1, v0, Lpe0;

    .line 498
    .line 499
    if-eqz v1, :cond_c

    .line 500
    .line 501
    move-object v2, v0

    .line 502
    check-cast v2, Lpe0;

    .line 503
    .line 504
    :cond_c
    return-object v2

    .line 505
    :pswitch_12
    move-object v0, v1

    .line 506
    check-cast v0, Lbx2;

    .line 507
    .line 508
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 509
    .line 510
    return-object v0

    .line 511
    :pswitch_13
    move-object v0, v1

    .line 512
    check-cast v0, Le80;

    .line 513
    .line 514
    instance-of v1, v0, Lc72;

    .line 515
    .line 516
    if-eqz v1, :cond_d

    .line 517
    .line 518
    move-object v2, v0

    .line 519
    check-cast v2, Lc72;

    .line 520
    .line 521
    :cond_d
    if-eqz v2, :cond_e

    .line 522
    .line 523
    iget-boolean v1, v2, Lc72;->Z:Z

    .line 524
    .line 525
    if-ne v1, v3, :cond_e

    .line 526
    .line 527
    new-instance v1, Ljava/lang/StringBuilder;

    .line 528
    .line 529
    const-string v2, "Apply is called on deactivated node "

    .line 530
    .line 531
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    :cond_e
    sget-object v0, Lj15;->a:Lj15;

    .line 545
    .line 546
    return-object v0

    .line 547
    :pswitch_14
    move-object v0, v1

    .line 548
    check-cast v0, Lvz;

    .line 549
    .line 550
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    sget-object v1, Lrr1;->a:Lrr1;

    .line 554
    .line 555
    iget-object v1, v0, Lvz;->a:Ljava/lang/String;

    .line 556
    .line 557
    new-instance v2, Lwc;

    .line 558
    .line 559
    invoke-direct {v2, v3, v0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    invoke-static {v1, v2}, Lrr1;->B(Ljava/lang/String;Lgf1;)Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    sget-object v0, Lj15;->a:Lj15;

    .line 566
    .line 567
    return-object v0

    .line 568
    :pswitch_15
    move-object v0, v1

    .line 569
    check-cast v0, Ljava/lang/String;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    sget-object v1, Lb00;->a:Lb00;

    .line 575
    .line 576
    sget-object v1, Lb00;->b:Lrp4;

    .line 577
    .line 578
    invoke-virtual {v1}, Lrp4;->getValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    check-cast v1, Landroid/content/SharedPreferences;

    .line 583
    .line 584
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    const-string v2, "queue"

    .line 589
    .line 590
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    return-object v0

    .line 603
    :pswitch_16
    move-object v0, v1

    .line 604
    check-cast v0, Lmf3;

    .line 605
    .line 606
    sget-object v1, Lhb;->b:Lwl4;

    .line 607
    .line 608
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-static {v0, v1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    check-cast v0, Landroid/content/Context;

    .line 616
    .line 617
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    const-string v1, "android.software.leanback"

    .line 622
    .line 623
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    if-nez v0, :cond_f

    .line 628
    .line 629
    sget-object v0, Lfv;->a:Lev;

    .line 630
    .line 631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    sget-object v0, Lev;->c:Ldv;

    .line 635
    .line 636
    goto :goto_10

    .line 637
    :cond_f
    sget-object v0, Lhv;->b:Lgv;

    .line 638
    .line 639
    :goto_10
    return-object v0

    .line 640
    :pswitch_17
    move-object v0, v1

    .line 641
    check-cast v0, Li94;

    .line 642
    .line 643
    invoke-static {v0}, Lfh0;->p(Li94;)Z

    .line 644
    .line 645
    .line 646
    move-result v0

    .line 647
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    return-object v0

    .line 652
    :pswitch_18
    move-object v0, v1

    .line 653
    check-cast v0, Lmf3;

    .line 654
    .line 655
    sget-object v1, Lhb;->a:Ll90;

    .line 656
    .line 657
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    invoke-static {v0, v1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    sget-object v1, Lhb;->b:Lwl4;

    .line 664
    .line 665
    invoke-static {v0, v1}, Lvr1;->C(Lmf3;Lqr3;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    check-cast v0, Landroid/content/Context;

    .line 670
    .line 671
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    return-object v0

    .line 676
    :pswitch_19
    move-object v0, v1

    .line 677
    check-cast v0, Ljs4;

    .line 678
    .line 679
    return-object v0

    .line 680
    :pswitch_1a
    move-object v0, v1

    .line 681
    check-cast v0, Li94;

    .line 682
    .line 683
    invoke-static {v0}, Lfh0;->p(Li94;)Z

    .line 684
    .line 685
    .line 686
    move-result v0

    .line 687
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    return-object v0

    .line 692
    :pswitch_1b
    move-object v0, v1

    .line 693
    check-cast v0, Lba1;

    .line 694
    .line 695
    sget-object v0, Lra;->U0:Ljava/lang/Class;

    .line 696
    .line 697
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 698
    .line 699
    return-object v0

    .line 700
    :pswitch_1c
    move-object v0, v1

    .line 701
    check-cast v0, Lun3;

    .line 702
    .line 703
    xor-int/lit8 v0, v4, 0x1

    .line 704
    .line 705
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    return-object v0

    .line 710
    nop

    .line 711
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
