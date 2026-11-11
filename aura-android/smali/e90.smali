.class public final synthetic Le90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Le90;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ls12;I)V
    .locals 0

    .line 7
    iput p2, p0, Le90;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget p0, p0, Le90;->n:I

    .line 2
    .line 3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lj15;->a:Lj15;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "CompositionLocal LocalLifecycleOwner not present"

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0

    .line 20
    :pswitch_0
    new-instance p0, Lc72;

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    invoke-direct {p0, v0}, Lc72;-><init>(I)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_1
    sput-boolean v1, Lu52;->e:Z

    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_2
    sput-object v3, Lu52;->d:Ljava/lang/String;

    .line 31
    .line 32
    sget-object p0, Lu52;->a:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {}, Lu52;->m()V

    .line 35
    .line 36
    .line 37
    return-object v2

    .line 38
    :pswitch_3
    sget-object p0, Lu52;->a:Landroid/os/Handler;

    .line 39
    .line 40
    return-object v2

    .line 41
    :pswitch_4
    sput-object v3, Lu52;->d:Ljava/lang/String;

    .line 42
    .line 43
    sget-object p0, Lu52;->a:Landroid/os/Handler;

    .line 44
    .line 45
    invoke-static {}, Lu52;->m()V

    .line 46
    .line 47
    .line 48
    :pswitch_5
    return-object v2

    .line 49
    :pswitch_6
    sget-object p0, Lyz1;->a:Lwl4;

    .line 50
    .line 51
    return-object v3

    .line 52
    :pswitch_7
    sget-object p0, Lzx1;->a:Ll90;

    .line 53
    .line 54
    sget-object p0, Ldk0;->a:Ldk0;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_8
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->i()Lo83;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_9
    sget-object p0, Lrr1;->a:Lrr1;

    .line 63
    .line 64
    new-instance p0, Lor1;

    .line 65
    .line 66
    const/16 v0, 0xa

    .line 67
    .line 68
    invoke-direct {p0, v0}, Lor1;-><init>(I)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Lor1;

    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lor1;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v0}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_a
    invoke-static {}, Le35;->Q()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_b
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    const-string v0, "homemusic-listening"

    .line 95
    .line 96
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string v0, "device_id"

    .line 101
    .line 102
    invoke-interface {p0, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez v1, :cond_0

    .line 107
    .line 108
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_1

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    :cond_0
    move-object v3, v1

    .line 134
    goto :goto_0

    .line 135
    :cond_1
    const-string p0, "Check failed."

    .line 136
    .line 137
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_0
    return-object v3

    .line 141
    :pswitch_c
    new-instance p0, Llx0;

    .line 142
    .line 143
    new-instance v0, Lor1;

    .line 144
    .line 145
    const/16 v1, 0x17

    .line 146
    .line 147
    invoke-direct {v0, v1}, Lor1;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-direct {p0, v0}, Llx0;-><init>(Lor1;)V

    .line 151
    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_d
    new-instance v2, Lnh3;

    .line 155
    .line 156
    sget-object v5, Lrs1;->a:Lrs1;

    .line 157
    .line 158
    sget-object p0, Lrs1;->b:Lrp4;

    .line 159
    .line 160
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Llh3;

    .line 165
    .line 166
    new-instance v3, Lq;

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    const/4 v10, 0x3

    .line 170
    const/4 v4, 0x1

    .line 171
    const-class v6, Lrs1;

    .line 172
    .line 173
    const-string v7, "post"

    .line 174
    .line 175
    const-string v8, "post(Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/PlaySender$Outcome;"

    .line 176
    .line 177
    invoke-direct/range {v3 .. v10}, Lq;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 178
    .line 179
    .line 180
    new-instance v4, Lna;

    .line 181
    .line 182
    sget-object v7, Lrr1;->a:Lrr1;

    .line 183
    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v11, 0x4

    .line 186
    const/4 v5, 0x0

    .line 187
    move-object v6, v7

    .line 188
    const-class v7, Lrr1;

    .line 189
    .line 190
    const-string v8, "supportsTypedFavorites"

    .line 191
    .line 192
    const-string v9, "supportsTypedFavorites()Z"

    .line 193
    .line 194
    invoke-direct/range {v4 .. v11}, Lna;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 195
    .line 196
    .line 197
    new-instance v5, Lna;

    .line 198
    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v12, 0x5

    .line 201
    move-object v7, v6

    .line 202
    const/4 v6, 0x0

    .line 203
    const-class v8, Lrr1;

    .line 204
    .line 205
    const-string v9, "supportsCompensationChains"

    .line 206
    .line 207
    const-string v10, "supportsCompensationChains()Z"

    .line 208
    .line 209
    invoke-direct/range {v5 .. v12}, Lna;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 210
    .line 211
    .line 212
    move-object v0, v5

    .line 213
    move-object v6, v7

    .line 214
    new-instance v7, Lna;

    .line 215
    .line 216
    sget-object v9, Lb00;->a:Lb00;

    .line 217
    .line 218
    const/4 v13, 0x0

    .line 219
    const/4 v14, 0x6

    .line 220
    const/4 v8, 0x0

    .line 221
    const-class v10, Lb00;

    .line 222
    .line 223
    const-string v11, "currentAccount"

    .line 224
    .line 225
    const-string v12, "currentAccount()Ljava/lang/String;"

    .line 226
    .line 227
    invoke-direct/range {v7 .. v14}, Lna;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 228
    .line 229
    .line 230
    move-object v1, v7

    .line 231
    new-instance v5, Lna;

    .line 232
    .line 233
    const/4 v11, 0x0

    .line 234
    const/4 v12, 0x7

    .line 235
    move-object v7, v6

    .line 236
    const/4 v6, 0x0

    .line 237
    const-class v8, Lrr1;

    .line 238
    .line 239
    const-string v9, "supportsListeningCheckpoints"

    .line 240
    .line 241
    const-string v10, "supportsListeningCheckpoints()Z"

    .line 242
    .line 243
    invoke-direct/range {v5 .. v12}, Lna;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 244
    .line 245
    .line 246
    move-object v6, v0

    .line 247
    move-object v7, v1

    .line 248
    move-object v8, v5

    .line 249
    move-object v5, v4

    .line 250
    move-object v4, v3

    .line 251
    move-object v3, p0

    .line 252
    invoke-direct/range {v2 .. v8}, Lnh3;-><init>(Llh3;Lq;Lna;Lna;Lna;Lna;)V

    .line 253
    .line 254
    .line 255
    return-object v2

    .line 256
    :pswitch_e
    new-instance p0, Llh3;

    .line 257
    .line 258
    new-instance v0, Ljava/io/File;

    .line 259
    .line 260
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    const-string v2, "homemusic_play_events.json"

    .line 269
    .line 270
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {p0, v0}, Llh3;-><init>(Ljava/io/File;)V

    .line 274
    .line 275
    .line 276
    return-object p0

    .line 277
    :pswitch_f
    invoke-static {}, Lrr1;->k()Lo83;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-virtual {p0}, Lo83;->a()Ln83;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    const-wide/16 v1, 0x46

    .line 289
    .line 290
    invoke-static {v1, v2, v0}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    iput v0, p0, Ln83;->z:I

    .line 295
    .line 296
    new-instance v0, Lo83;

    .line 297
    .line 298
    invoke-direct {v0, p0}, Lo83;-><init>(Ln83;)V

    .line 299
    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_10
    invoke-static {}, Lrr1;->k()Lo83;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0}, Lo83;->a()Ln83;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    const-wide/16 v0, 0x5dc

    .line 311
    .line 312
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 313
    .line 314
    invoke-virtual {p0, v0, v1, v2}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v0, v1, v2}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    iput v0, p0, Ln83;->z:I

    .line 322
    .line 323
    const-wide/16 v0, 0x9c4

    .line 324
    .line 325
    invoke-static {v0, v1, v2}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    iput v0, p0, Ln83;->x:I

    .line 330
    .line 331
    new-instance v0, Lo83;

    .line 332
    .line 333
    invoke-direct {v0, p0}, Lo83;-><init>(Ln83;)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_11
    new-instance p0, Ln83;

    .line 338
    .line 339
    invoke-direct {p0}, Ln83;-><init>()V

    .line 340
    .line 341
    .line 342
    sget-object v1, Lrr1;->d:Lsi1;

    .line 343
    .line 344
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    iput-object v1, p0, Ln83;->k:Lbe0;

    .line 348
    .line 349
    const-wide/16 v1, 0xf

    .line 350
    .line 351
    invoke-virtual {p0, v1, v2, v0}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 352
    .line 353
    .line 354
    const-wide/16 v1, 0x3c

    .line 355
    .line 356
    invoke-static {v1, v2, v0}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    iput v0, p0, Ln83;->z:I

    .line 361
    .line 362
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    const-wide/16 v1, 0xa

    .line 368
    .line 369
    invoke-static {v1, v2, v0}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    iput v0, p0, Ln83;->A:I

    .line 374
    .line 375
    new-instance v0, Lo83;

    .line 376
    .line 377
    invoke-direct {v0, p0}, Lo83;-><init>(Ln83;)V

    .line 378
    .line 379
    .line 380
    return-object v0

    .line 381
    :pswitch_12
    invoke-static {}, Lrr1;->k()Lo83;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    invoke-virtual {p0}, Lo83;->a()Ln83;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    sget-object v0, Lbe0;->g:Li80;

    .line 390
    .line 391
    iput-object v0, p0, Ln83;->k:Lbe0;

    .line 392
    .line 393
    new-instance v0, Lo83;

    .line 394
    .line 395
    invoke-direct {v0, p0}, Lo83;-><init>(Ln83;)V

    .line 396
    .line 397
    .line 398
    return-object v0

    .line 399
    :pswitch_13
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 400
    .line 401
    const-string v0, "CompositionLocal LocalHostDefaultProvider not present"

    .line 402
    .line 403
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    throw p0

    .line 407
    :pswitch_14
    sget-object p0, Lrr1;->a:Lrr1;

    .line 408
    .line 409
    new-instance p0, Lor1;

    .line 410
    .line 411
    const/4 v0, 0x6

    .line 412
    invoke-direct {p0, v0}, Lor1;-><init>(I)V

    .line 413
    .line 414
    .line 415
    new-instance v0, Lor1;

    .line 416
    .line 417
    const/4 v1, 0x7

    .line 418
    invoke-direct {v0, v1}, Lor1;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-static {p0, v0}, Lrr1;->d(Lif1;Lif1;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubLikedSongs;

    .line 426
    .line 427
    invoke-static {}, Lrr1;->c()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/homemusic/HubLikedSongs;->children(Ljava/lang/String;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    return-object p0

    .line 436
    :pswitch_15
    :try_start_0
    sget-object p0, Lwe1;->o:[Ljava/lang/String;

    .line 437
    .line 438
    sget-object p0, Lwe1;->q:Lr72;

    .line 439
    .line 440
    invoke-interface {p0}, Lr72;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    check-cast p0, Ljava/lang/reflect/Method;

    .line 445
    .line 446
    if-eqz p0, :cond_2

    .line 447
    .line 448
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    if-eqz p0, :cond_2

    .line 453
    .line 454
    const-string v0, "beginTransaction"

    .line 455
    .line 456
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 457
    .line 458
    const-class v2, Landroid/database/sqlite/SQLiteTransactionListener;

    .line 459
    .line 460
    const-class v4, Landroid/os/CancellationSignal;

    .line 461
    .line 462
    filled-new-array {v1, v2, v1, v4}, [Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    invoke-virtual {p0, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 467
    .line 468
    .line 469
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 470
    :catchall_0
    :cond_2
    return-object v3

    .line 471
    :pswitch_16
    :try_start_1
    const-class p0, Landroid/database/sqlite/SQLiteDatabase;

    .line 472
    .line 473
    const-string v0, "getThreadSession"

    .line 474
    .line 475
    invoke-virtual {p0, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    const/4 v0, 0x1

    .line 480
    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 481
    .line 482
    .line 483
    move-object v3, p0

    .line 484
    :catchall_1
    return-object v3

    .line 485
    :pswitch_17
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 486
    .line 487
    return-object p0

    .line 488
    :pswitch_18
    const-string p0, "Unexpected call to default provider"

    .line 489
    .line 490
    invoke-static {p0}, Ll80;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 491
    .line 492
    .line 493
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 494
    .line 495
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 496
    .line 497
    .line 498
    throw p0

    .line 499
    :pswitch_19
    const-string p0, "LocalWindowInfo"

    .line 500
    .line 501
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v3

    .line 505
    :pswitch_1a
    const-string p0, "LocalViewConfiguration"

    .line 506
    .line 507
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    throw v3

    .line 511
    :pswitch_1b
    const-string p0, "LocalUriHandler"

    .line 512
    .line 513
    invoke-static {p0}, Lg90;->b(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    throw v3

    .line 517
    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
