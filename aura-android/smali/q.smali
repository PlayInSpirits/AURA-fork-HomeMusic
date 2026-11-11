.class public final synthetic Lq;
.super Lig1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 1
    iput p7, p0, Lq;->n:I

    .line 2
    .line 3
    move-object v0, p4

    .line 4
    move-object p4, p2

    .line 5
    move p2, p6

    .line 6
    move-object p6, p5

    .line 7
    move-object p5, v0

    .line 8
    invoke-direct/range {p0 .. p6}, Lhg1;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lq;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lj15;->a:Lj15;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Throwable;

    .line 16
    .line 17
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lu22;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lu22;->s(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    return-object v5

    .line 25
    :pswitch_0
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Ljava/util/Set;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ls12;

    .line 35
    .line 36
    iget-object v2, v0, Ls12;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 39
    .line 40
    .line 41
    :try_start_0
    iget-object v0, v0, Ls12;->c:Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-static {v0}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_5

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ld83;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v6, v2, Ld83;->b:[I

    .line 76
    .line 77
    array-length v7, v6

    .line 78
    sget-object v8, Lz01;->n:Lz01;

    .line 79
    .line 80
    if-eqz v7, :cond_4

    .line 81
    .line 82
    if-eq v7, v4, :cond_3

    .line 83
    .line 84
    new-instance v7, Lfb4;

    .line 85
    .line 86
    invoke-direct {v7}, Lfb4;-><init>()V

    .line 87
    .line 88
    .line 89
    array-length v8, v6

    .line 90
    move v9, v3

    .line 91
    move v10, v9

    .line 92
    :goto_1
    if-ge v9, v8, :cond_2

    .line 93
    .line 94
    aget v11, v6, v9

    .line 95
    .line 96
    add-int/lit8 v12, v10, 0x1

    .line 97
    .line 98
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    invoke-interface {v1, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-eqz v11, :cond_1

    .line 107
    .line 108
    iget-object v11, v2, Ld83;->c:[Ljava/lang/String;

    .line 109
    .line 110
    aget-object v10, v11, v10

    .line 111
    .line 112
    invoke-virtual {v7, v10}, Lfb4;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 116
    .line 117
    move v10, v12

    .line 118
    goto :goto_1

    .line 119
    :cond_2
    invoke-static {v7}, Lkb4;->l(Lfb4;)Lfb4;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    goto :goto_2

    .line 124
    :cond_3
    aget v6, v6, v3

    .line 125
    .line 126
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-interface {v1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    iget-object v8, v2, Ld83;->d:Ljava/util/Set;

    .line 137
    .line 138
    :cond_4
    :goto_2
    move-object v6, v8

    .line 139
    check-cast v6, Ljava/util/Collection;

    .line 140
    .line 141
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-nez v6, :cond_0

    .line 146
    .line 147
    iget-object v2, v2, Ld83;->a:Lq12;

    .line 148
    .line 149
    invoke-virtual {v2, v8}, Lq12;->a(Ljava/util/Set;)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_5
    return-object v5

    .line 154
    :catchall_0
    move-exception v0

    .line 155
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :pswitch_1
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, Ljava/lang/String;

    .line 162
    .line 163
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 166
    .line 167
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isListed(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0

    .line 176
    :pswitch_2
    move-object/from16 v1, p1

    .line 177
    .line 178
    check-cast v1, Ljava/lang/String;

    .line 179
    .line 180
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isListed(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    return-object v0

    .line 193
    :pswitch_3
    sget-object v1, Lmh3;->r:Lmh3;

    .line 194
    .line 195
    move-object/from16 v3, p1

    .line 196
    .line 197
    check-cast v3, Ljava/util/List;

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lrs1;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    const-string v5, "HubPlays"

    .line 210
    .line 211
    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    :cond_6
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_7

    .line 225
    .line 226
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 231
    .line 232
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    if-eqz v7, :cond_6

    .line 237
    .line 238
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    goto :goto_3

    .line 242
    :catch_0
    move-exception v0

    .line 243
    goto/16 :goto_9

    .line 244
    .line 245
    :cond_7
    invoke-static {v0}, Lq40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-eqz v6, :cond_8

    .line 254
    .line 255
    invoke-static {v3}, Lrr1;->r(Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    goto :goto_4

    .line 260
    :cond_8
    sget-object v6, Lrr1;->a:Lrr1;

    .line 261
    .line 262
    invoke-static {v0}, Lq40;->I0(Ljava/util/List;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Ljava/lang/String;

    .line 267
    .line 268
    new-instance v6, Lkm0;

    .line 269
    .line 270
    invoke-direct {v6, v3, v4}, Lkm0;-><init>(Ljava/util/List;I)V

    .line 271
    .line 272
    .line 273
    invoke-static {v0, v6}, Lrr1;->B(Ljava/lang/String;Lgf1;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;

    .line 278
    .line 279
    :goto_4
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->getRejected()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    if-eqz v4, :cond_13

    .line 284
    .line 285
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_9

    .line 290
    .line 291
    goto/16 :goto_8

    .line 292
    .line 293
    :cond_9
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->getRejected()Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    const/16 v4, 0xa

    .line 301
    .line 302
    invoke-static {v0, v4}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    invoke-static {v4}, Llg2;->W(I)I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    const/16 v6, 0x10

    .line 311
    .line 312
    if-ge v4, v6, :cond_a

    .line 313
    .line 314
    move v4, v6

    .line 315
    :cond_a
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 316
    .line 317
    invoke-direct {v6, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    if-eqz v4, :cond_10

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    check-cast v4, Ljava/util/Map;

    .line 335
    .line 336
    const-string v7, "index"

    .line 337
    .line 338
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v7

    .line 342
    instance-of v8, v7, Ljava/lang/Number;

    .line 343
    .line 344
    if-eqz v8, :cond_b

    .line 345
    .line 346
    check-cast v7, Ljava/lang/Number;

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_b
    move-object v7, v2

    .line 350
    :goto_6
    if-eqz v7, :cond_f

    .line 351
    .line 352
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    invoke-static {v3, v7}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    check-cast v7, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 361
    .line 362
    if-eqz v7, :cond_e

    .line 363
    .line 364
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    const-string v8, "detail"

    .line 369
    .line 370
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    if-eqz v4, :cond_c

    .line 375
    .line 376
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    if-nez v4, :cond_d

    .line 381
    .line 382
    :cond_c
    const-string v4, "Hub rejected event"

    .line 383
    .line 384
    :cond_d
    invoke-interface {v6, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    goto :goto_5

    .line 388
    :cond_e
    new-instance v0, Ljava/io/IOException;

    .line 389
    .line 390
    const-string v2, "Hub returned out of range rejection index"

    .line 391
    .line 392
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v0

    .line 396
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 397
    .line 398
    const-string v2, "Hub returned invalid rejection index"

    .line 399
    .line 400
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    throw v0

    .line 404
    :cond_10
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    new-instance v4, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 415
    .line 416
    .line 417
    const-string v7, "Hub rejected "

    .line 418
    .line 419
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    const-string v0, " of "

    .line 426
    .line 427
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    const-string v0, "; quarantined"

    .line 434
    .line 435
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    sget-object v0, Lrs1;->b:Lrp4;

    .line 446
    .line 447
    invoke-virtual {v0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    check-cast v2, Llh3;

    .line 452
    .line 453
    invoke-virtual {v2, v6}, Llh3;->b(Ljava/util/Map;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    check-cast v0, Llh3;

    .line 461
    .line 462
    new-instance v2, Ljava/util/ArrayList;

    .line 463
    .line 464
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 465
    .line 466
    .line 467
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    :cond_11
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    if-eqz v4, :cond_12

    .line 476
    .line 477
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    move-object v7, v4

    .line 482
    check-cast v7, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 483
    .line 484
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    if-nez v7, :cond_11

    .line 493
    .line 494
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_7

    .line 498
    :cond_12
    invoke-virtual {v0, v2}, Llh3;->c(Ljava/util/List;)V

    .line 499
    .line 500
    .line 501
    sget-object v0, Lmh3;->o:Lmh3;

    .line 502
    .line 503
    goto :goto_c

    .line 504
    :cond_13
    :goto_8
    sget-object v0, Lmh3;->n:Lmh3;
    :try_end_1
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 505
    .line 506
    goto :goto_c

    .line 507
    :catch_1
    invoke-static {}, Lrr1;->m()V

    .line 508
    .line 509
    .line 510
    goto :goto_b

    .line 511
    :goto_9
    const/16 v2, 0x194

    .line 512
    .line 513
    iget v0, v0, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 514
    .line 515
    if-ne v0, v2, :cond_14

    .line 516
    .line 517
    sget-object v0, Lmh3;->s:Lmh3;

    .line 518
    .line 519
    :goto_a
    move-object v1, v0

    .line 520
    goto :goto_b

    .line 521
    :cond_14
    const/16 v2, 0x19d

    .line 522
    .line 523
    if-ne v0, v2, :cond_15

    .line 524
    .line 525
    const-string v0, "play event batch too large; splitting or retaining single event"

    .line 526
    .line 527
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 528
    .line 529
    .line 530
    sget-object v0, Lmh3;->q:Lmh3;

    .line 531
    .line 532
    goto :goto_a

    .line 533
    :cond_15
    if-eqz v0, :cond_17

    .line 534
    .line 535
    const/16 v2, 0x191

    .line 536
    .line 537
    if-eq v0, v2, :cond_17

    .line 538
    .line 539
    const/16 v2, 0x193

    .line 540
    .line 541
    if-eq v0, v2, :cond_17

    .line 542
    .line 543
    const/16 v2, 0x198

    .line 544
    .line 545
    if-eq v0, v2, :cond_17

    .line 546
    .line 547
    const/16 v2, 0x1ad

    .line 548
    .line 549
    if-ne v0, v2, :cond_16

    .line 550
    .line 551
    goto :goto_b

    .line 552
    :cond_16
    const/16 v2, 0x190

    .line 553
    .line 554
    if-gt v2, v0, :cond_17

    .line 555
    .line 556
    const/16 v2, 0x1f4

    .line 557
    .line 558
    if-ge v0, v2, :cond_17

    .line 559
    .line 560
    sget-object v0, Lmh3;->p:Lmh3;

    .line 561
    .line 562
    goto :goto_a

    .line 563
    :cond_17
    :goto_b
    move-object v0, v1

    .line 564
    :goto_c
    return-object v0

    .line 565
    :pswitch_4
    move-object/from16 v1, p1

    .line 566
    .line 567
    check-cast v1, Ljz;

    .line 568
    .line 569
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lic;

    .line 572
    .line 573
    invoke-static {v0, v1}, Lic;->a(Lic;Ljz;)V

    .line 574
    .line 575
    .line 576
    return-object v5

    .line 577
    :pswitch_5
    move-object/from16 v1, p1

    .line 578
    .line 579
    check-cast v1, Ljz;

    .line 580
    .line 581
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v0, Lic;

    .line 584
    .line 585
    invoke-static {v0, v1}, Lic;->a(Lic;Ljz;)V

    .line 586
    .line 587
    .line 588
    return-object v5

    .line 589
    :pswitch_6
    move-object/from16 v1, p1

    .line 590
    .line 591
    check-cast v1, Ljava/lang/Boolean;

    .line 592
    .line 593
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    iget-object v0, v0, Ljy;->receiver:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v0, Lu30;

    .line 600
    .line 601
    iget-object v6, v0, Lu30;->O:Lm03;

    .line 602
    .line 603
    if-eqz v1, :cond_18

    .line 604
    .line 605
    invoke-virtual {v0}, Lu30;->x0()V

    .line 606
    .line 607
    .line 608
    goto/16 :goto_11

    .line 609
    .line 610
    :cond_18
    iget-object v1, v0, Lu30;->D:Lrm2;

    .line 611
    .line 612
    if-eqz v1, :cond_1d

    .line 613
    .line 614
    iget-object v1, v6, Lm03;->c:[Ljava/lang/Object;

    .line 615
    .line 616
    iget-object v7, v6, Lm03;->a:[J

    .line 617
    .line 618
    array-length v8, v7

    .line 619
    add-int/lit8 v8, v8, -0x2

    .line 620
    .line 621
    const/4 v9, 0x3

    .line 622
    if-ltz v8, :cond_1c

    .line 623
    .line 624
    move v10, v3

    .line 625
    :goto_d
    aget-wide v11, v7, v10

    .line 626
    .line 627
    not-long v13, v11

    .line 628
    const/4 v15, 0x7

    .line 629
    shl-long/2addr v13, v15

    .line 630
    and-long/2addr v13, v11

    .line 631
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    and-long/2addr v13, v15

    .line 637
    cmp-long v13, v13, v15

    .line 638
    .line 639
    if-eqz v13, :cond_1b

    .line 640
    .line 641
    sub-int v13, v10, v8

    .line 642
    .line 643
    not-int v13, v13

    .line 644
    ushr-int/lit8 v13, v13, 0x1f

    .line 645
    .line 646
    const/16 v14, 0x8

    .line 647
    .line 648
    rsub-int/lit8 v13, v13, 0x8

    .line 649
    .line 650
    move v15, v3

    .line 651
    :goto_e
    if-ge v15, v13, :cond_1a

    .line 652
    .line 653
    const-wide/16 v16, 0xff

    .line 654
    .line 655
    and-long v16, v11, v16

    .line 656
    .line 657
    const-wide/16 v18, 0x80

    .line 658
    .line 659
    cmp-long v16, v16, v18

    .line 660
    .line 661
    if-gez v16, :cond_19

    .line 662
    .line 663
    shl-int/lit8 v16, v10, 0x3

    .line 664
    .line 665
    add-int v16, v16, v15

    .line 666
    .line 667
    aget-object v16, v1, v16

    .line 668
    .line 669
    move-object/from16 v4, v16

    .line 670
    .line 671
    check-cast v4, Lbq3;

    .line 672
    .line 673
    move/from16 p0, v14

    .line 674
    .line 675
    invoke-virtual {v0}, Lcx2;->e0()Lwe0;

    .line 676
    .line 677
    .line 678
    move-result-object v14

    .line 679
    move-object/from16 v16, v1

    .line 680
    .line 681
    new-instance v1, Lv;

    .line 682
    .line 683
    invoke-direct {v1, v0, v4, v2, v3}, Lv;-><init>(Lu30;Lbq3;Lvd0;I)V

    .line 684
    .line 685
    .line 686
    invoke-static {v14, v2, v2, v1, v9}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 687
    .line 688
    .line 689
    goto :goto_f

    .line 690
    :cond_19
    move-object/from16 v16, v1

    .line 691
    .line 692
    move/from16 p0, v14

    .line 693
    .line 694
    :goto_f
    shr-long v11, v11, p0

    .line 695
    .line 696
    add-int/lit8 v15, v15, 0x1

    .line 697
    .line 698
    move/from16 v14, p0

    .line 699
    .line 700
    move-object/from16 v1, v16

    .line 701
    .line 702
    const/4 v4, 0x1

    .line 703
    goto :goto_e

    .line 704
    :cond_1a
    move-object/from16 v16, v1

    .line 705
    .line 706
    move v1, v14

    .line 707
    if-ne v13, v1, :cond_1c

    .line 708
    .line 709
    goto :goto_10

    .line 710
    :cond_1b
    move-object/from16 v16, v1

    .line 711
    .line 712
    :goto_10
    if-eq v10, v8, :cond_1c

    .line 713
    .line 714
    add-int/lit8 v10, v10, 0x1

    .line 715
    .line 716
    move-object/from16 v1, v16

    .line 717
    .line 718
    const/4 v4, 0x1

    .line 719
    goto :goto_d

    .line 720
    :cond_1c
    iget-object v1, v0, Lu30;->P:Lbq3;

    .line 721
    .line 722
    if-eqz v1, :cond_1d

    .line 723
    .line 724
    invoke-virtual {v0}, Lcx2;->e0()Lwe0;

    .line 725
    .line 726
    .line 727
    move-result-object v3

    .line 728
    new-instance v4, Lv;

    .line 729
    .line 730
    const/4 v7, 0x1

    .line 731
    invoke-direct {v4, v0, v1, v2, v7}, Lv;-><init>(Lu30;Lbq3;Lvd0;I)V

    .line 732
    .line 733
    .line 734
    invoke-static {v3, v2, v2, v4, v9}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 735
    .line 736
    .line 737
    :cond_1d
    invoke-virtual {v6}, Lm03;->a()V

    .line 738
    .line 739
    .line 740
    iput-object v2, v0, Lu30;->P:Lbq3;

    .line 741
    .line 742
    :goto_11
    return-object v5

    .line 743
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
