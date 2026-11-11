.class public final synthetic La0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, La0;->n:I

    iput-object p2, p0, La0;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq41;I)V
    .locals 0

    .line 1
    const/16 p2, 0x1c

    .line 2
    .line 3
    iput p2, p0, La0;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lq41;Lsk3;)V
    .locals 0

    .line 12
    const/16 p1, 0x1d

    iput p1, p0, La0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La0;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, La0;->n:I

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, -0x1

    .line 11
    const/4 v7, 0x3

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    iget-object v0, v0, La0;->o:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, Lsk3;

    .line 22
    .line 23
    :try_start_0
    monitor-enter v1

    .line 24
    monitor-exit v1
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :try_start_1
    iget-object v0, v1, Lsk3;->a:Lrk3;

    .line 26
    .line 27
    iget v2, v1, Lsk3;->c:I

    .line 28
    .line 29
    iget-object v3, v1, Lsk3;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-interface {v0, v2, v3}, Lrk3;->c(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    :try_start_2
    invoke-virtual {v1, v9}, Lsk3;->a(Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    invoke-virtual {v1, v9}, Lsk3;->a(Z)V

    .line 40
    .line 41
    .line 42
    throw v0
    :try_end_2
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_2 .. :try_end_2} :catch_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    const-string v1, "ExoPlayerImplInternal"

    .line 45
    .line 46
    const-string v2, "Unexpected error delivering message on external thread."

    .line 47
    .line 48
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_0
    check-cast v0, Lq41;

    .line 56
    .line 57
    iget-object v0, v0, Lq41;->K:Lnj0;

    .line 58
    .line 59
    invoke-virtual {v0}, Lnj0;->W()Lq9;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    new-instance v2, Loi0;

    .line 64
    .line 65
    const/16 v3, 0xf

    .line 66
    .line 67
    invoke-direct {v2, v3}, Loi0;-><init>(I)V

    .line 68
    .line 69
    .line 70
    const/16 v3, 0x40a

    .line 71
    .line 72
    invoke-virtual {v0, v1, v3, v2}, Lnj0;->b0(Lq9;ILqc2;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_1
    check-cast v0, Li41;

    .line 77
    .line 78
    iget-object v1, v0, Li41;->D:Lc6;

    .line 79
    .line 80
    iget-object v0, v0, Li41;->f:Landroid/content/Context;

    .line 81
    .line 82
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0}, Lxl;->n(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eq v0, v6, :cond_0

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_0
    move v0, v10

    .line 96
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, v1, Lc6;->f:Ljava/lang/Object;

    .line 101
    .line 102
    new-instance v2, Lwo;

    .line 103
    .line 104
    invoke-direct {v2, v1, v0, v10}, Lwo;-><init>(Lc6;Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, v1, Lc6;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lyp4;

    .line 110
    .line 111
    iget-object v1, v0, Lyp4;->a:Landroid/os/Handler;

    .line 112
    .line 113
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_1
    invoke-virtual {v0, v2}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    return-void

    .line 132
    :pswitch_2
    check-cast v0, Lix0;

    .line 133
    .line 134
    iget-object v1, v0, Lix0;->h:Landroid/widget/AutoCompleteTextView;

    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v0, v1}, Lix0;->s(Z)V

    .line 141
    .line 142
    .line 143
    iput-boolean v1, v0, Lix0;->m:Z

    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_3
    move-object v1, v0

    .line 147
    check-cast v1, Lbu0;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-nez v0, :cond_2

    .line 161
    .line 162
    iget-object v0, v1, Lbu0;->f:Lk03;

    .line 163
    .line 164
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v0, v1}, Lad2;->i(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_8

    .line 172
    .line 173
    :cond_2
    iget-object v0, v1, Lbu0;->c:Lhg3;

    .line 174
    .line 175
    new-instance v3, Llg1;

    .line 176
    .line 177
    iget-object v0, v0, Lhg3;->o:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lss0;

    .line 180
    .line 181
    const/16 v4, 0xa

    .line 182
    .line 183
    invoke-direct {v3, v4, v0}, Llg1;-><init>(ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    new-instance v0, Ljava/lang/Thread;

    .line 187
    .line 188
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 192
    .line 193
    .line 194
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :catch_1
    move-exception v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 200
    .line 201
    .line 202
    :goto_3
    iget-object v0, v3, Llg1;->p:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Ljava/util/List;

    .line 205
    .line 206
    if-eqz v0, :cond_b

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_3

    .line 213
    .line 214
    goto/16 :goto_7

    .line 215
    .line 216
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 217
    .line 218
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 219
    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    if-eqz v4, :cond_8

    .line 230
    .line 231
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    check-cast v4, Lcom/eddyizm/tempus/model/Download;

    .line 236
    .line 237
    invoke-virtual {v4}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    if-eqz v5, :cond_4

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-eqz v6, :cond_5

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_5
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    if-eqz v6, :cond_4

    .line 259
    .line 260
    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    const-string v7, "content"

    .line 265
    .line 266
    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    if-nez v6, :cond_6

    .line 271
    .line 272
    goto :goto_4

    .line 273
    :cond_6
    :try_start_4
    iget-object v6, v1, Lhd;->b:Landroid/app/Application;

    .line 274
    .line 275
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    new-instance v7, Laf4;

    .line 279
    .line 280
    invoke-direct {v7}, Laf4;-><init>()V

    .line 281
    .line 282
    .line 283
    iput-object v6, v7, Laf4;->b:Landroid/content/Context;

    .line 284
    .line 285
    iput-object v5, v7, Laf4;->c:Landroid/net/Uri;
    :try_end_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_2

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :catch_2
    move-object v7, v8

    .line 289
    :goto_5
    if-eqz v7, :cond_7

    .line 290
    .line 291
    invoke-virtual {v7}, Laf4;->b()Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-nez v5, :cond_4

    .line 296
    .line 297
    :cond_7
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-nez v0, :cond_a

    .line 306
    .line 307
    new-instance v0, Ljava/util/ArrayList;

    .line 308
    .line 309
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    :goto_6
    if-ge v10, v2, :cond_9

    .line 317
    .line 318
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    add-int/lit8 v10, v10, 0x1

    .line 323
    .line 324
    check-cast v4, Lcom/eddyizm/tempus/model/Download;

    .line 325
    .line 326
    invoke-virtual {v4}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    sget-object v5, Lg51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 334
    .line 335
    const-class v5, Lg51;

    .line 336
    .line 337
    monitor-enter v5

    .line 338
    :try_start_5
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-static {v6, v7, v4}, Lg51;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    sget-object v6, Lg51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 355
    .line 356
    invoke-virtual {v6, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    invoke-static {v4}, Lj51;->K(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 360
    .line 361
    .line 362
    monitor-exit v5

    .line 363
    goto :goto_6

    .line 364
    :catchall_1
    move-exception v0

    .line 365
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 366
    throw v0

    .line 367
    :cond_9
    iget-object v2, v1, Lbu0;->c:Lhg3;

    .line 368
    .line 369
    new-instance v3, Llg1;

    .line 370
    .line 371
    iget-object v2, v2, Lhg3;->o:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v2, Lss0;

    .line 374
    .line 375
    const/16 v4, 0x9

    .line 376
    .line 377
    invoke-direct {v3, v4, v2, v0}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    new-instance v2, Ljava/lang/Thread;

    .line 381
    .line 382
    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 386
    .line 387
    .line 388
    invoke-static {}, Lg51;->i()V

    .line 389
    .line 390
    .line 391
    iget-object v1, v1, Lbu0;->f:Lk03;

    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v1, v0}, Lad2;->i(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    goto :goto_8

    .line 405
    :cond_a
    iget-object v0, v1, Lbu0;->f:Lk03;

    .line 406
    .line 407
    invoke-virtual {v0, v2}, Lad2;->i(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_b
    :goto_7
    iget-object v0, v1, Lbu0;->f:Lk03;

    .line 412
    .line 413
    invoke-virtual {v0, v2}, Lad2;->i(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    :goto_8
    return-void

    .line 417
    :pswitch_4
    check-cast v0, Lla0;

    .line 418
    .line 419
    invoke-virtual {v0}, Lla0;->d()V

    .line 420
    .line 421
    .line 422
    return-void

    .line 423
    :pswitch_5
    check-cast v0, Lzd0;

    .line 424
    .line 425
    invoke-virtual {v0}, Ldw3;->d()V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_6
    check-cast v0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 430
    .line 431
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    const v2, 0x7f13015b

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v1, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :pswitch_7
    check-cast v0, Ltn0;

    .line 451
    .line 452
    iget-object v0, v0, Ltn0;->h:Lq55;

    .line 453
    .line 454
    invoke-interface {v0}, Lq55;->d()V

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :pswitch_8
    check-cast v0, Landroidx/media3/ui/DefaultTimeBar;

    .line 459
    .line 460
    sget v1, Landroidx/media3/ui/DefaultTimeBar;->f0:I

    .line 461
    .line 462
    invoke-virtual {v0, v10}, Landroidx/media3/ui/DefaultTimeBar;->d(Z)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :pswitch_9
    check-cast v0, Lik0;

    .line 467
    .line 468
    invoke-virtual {v0, v8}, Lik0;->d(Lsw0;)V

    .line 469
    .line 470
    .line 471
    return-void

    .line 472
    :pswitch_a
    check-cast v0, Ljk0;

    .line 473
    .line 474
    iget-boolean v1, v0, Ljk0;->p:Z

    .line 475
    .line 476
    if-eqz v1, :cond_c

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_c
    iget-object v1, v0, Ljk0;->o:Lpw0;

    .line 480
    .line 481
    if-eqz v1, :cond_d

    .line 482
    .line 483
    iget-object v2, v0, Ljk0;->n:Lsw0;

    .line 484
    .line 485
    invoke-interface {v1, v2}, Lpw0;->d(Lsw0;)V

    .line 486
    .line 487
    .line 488
    :cond_d
    iget-object v1, v0, Ljk0;->q:Lkk0;

    .line 489
    .line 490
    iget-object v1, v1, Lkk0;->n:Ljava/util/Set;

    .line 491
    .line 492
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    iput-boolean v9, v0, Ljk0;->p:Z

    .line 496
    .line 497
    :goto_9
    return-void

    .line 498
    :pswitch_b
    check-cast v0, Ltj0;

    .line 499
    .line 500
    iget-wide v1, v0, Ltj0;->a0:J

    .line 501
    .line 502
    const-wide/32 v5, 0x493e0

    .line 503
    .line 504
    .line 505
    cmp-long v1, v1, v5

    .line 506
    .line 507
    if-ltz v1, :cond_e

    .line 508
    .line 509
    iget-object v1, v0, Ltj0;->n:Lrm;

    .line 510
    .line 511
    invoke-interface {v1}, Lrm;->n()V

    .line 512
    .line 513
    .line 514
    iput-wide v3, v0, Ltj0;->a0:J

    .line 515
    .line 516
    :cond_e
    return-void

    .line 517
    :pswitch_c
    check-cast v0, Lnj0;

    .line 518
    .line 519
    invoke-virtual {v0}, Lnj0;->W()Lq9;

    .line 520
    .line 521
    .line 522
    move-result-object v1

    .line 523
    new-instance v2, Ljj0;

    .line 524
    .line 525
    invoke-direct {v2, v5}, Ljj0;-><init>(I)V

    .line 526
    .line 527
    .line 528
    const/16 v3, 0x404

    .line 529
    .line 530
    invoke-virtual {v0, v1, v3, v2}, Lnj0;->b0(Lq9;ILqc2;)V

    .line 531
    .line 532
    .line 533
    iget-object v0, v0, Lnj0;->s:Ltc2;

    .line 534
    .line 535
    invoke-virtual {v0}, Ltc2;->d()V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :pswitch_d
    check-cast v0, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;

    .line 540
    .line 541
    invoke-static {v0}, Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;->$r8$lambda$5hlDM94MjJzc7w2nd16ozsS7vqI(Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;)V

    .line 542
    .line 543
    .line 544
    return-void

    .line 545
    :pswitch_e
    check-cast v0, Ln70;

    .line 546
    .line 547
    invoke-static {v0}, Ln70;->a(Ln70;)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :pswitch_f
    check-cast v0, Li70;

    .line 552
    .line 553
    iget-object v1, v0, Li70;->o:Ljava/lang/Runnable;

    .line 554
    .line 555
    if-eqz v1, :cond_f

    .line 556
    .line 557
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 558
    .line 559
    .line 560
    iput-object v8, v0, Li70;->o:Ljava/lang/Runnable;

    .line 561
    .line 562
    :cond_f
    return-void

    .line 563
    :pswitch_10
    check-cast v0, Lcom/skydoves/colorpickerview/ColorPickerView;

    .line 564
    .line 565
    sget v1, Lcom/skydoves/colorpickerview/ColorPickerView;->H:I

    .line 566
    .line 567
    invoke-virtual {v0}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    invoke-virtual {v0, v1}, Lcom/skydoves/colorpickerview/ColorPickerView;->a(I)V

    .line 572
    .line 573
    .line 574
    iget-object v1, v0, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 575
    .line 576
    invoke-virtual {v0, v1}, Lcom/skydoves/colorpickerview/ColorPickerView;->f(Landroid/graphics/Point;)V

    .line 577
    .line 578
    .line 579
    return-void

    .line 580
    :pswitch_11
    check-cast v0, Ls30;

    .line 581
    .line 582
    invoke-virtual {v0, v9}, Ls30;->s(Z)V

    .line 583
    .line 584
    .line 585
    return-void

    .line 586
    :pswitch_12
    check-cast v0, Lau;

    .line 587
    .line 588
    iput-object v8, v0, Lau;->g:Ljava/lang/Object;

    .line 589
    .line 590
    iget-object v0, v0, Lau;->b:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 593
    .line 594
    const/4 v1, 0x4

    .line 595
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :pswitch_13
    check-cast v0, Ltc2;

    .line 600
    .line 601
    new-instance v1, Lkf2;

    .line 602
    .line 603
    const/4 v2, 0x6

    .line 604
    invoke-direct {v1, v2}, Lkf2;-><init>(I)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0, v6, v1}, Ltc2;->f(ILqc2;)V

    .line 608
    .line 609
    .line 610
    return-void

    .line 611
    :pswitch_14
    check-cast v0, Lkl;

    .line 612
    .line 613
    iget-object v1, v0, Lkl;->c:Lll;

    .line 614
    .line 615
    iget-boolean v1, v1, Lll;->o:Z

    .line 616
    .line 617
    if-eqz v1, :cond_10

    .line 618
    .line 619
    iget-object v0, v0, Lkl;->a:Ld41;

    .line 620
    .line 621
    iget-object v0, v0, Ld41;->n:Li41;

    .line 622
    .line 623
    invoke-virtual {v0, v7, v10}, Li41;->w1(IZ)V

    .line 624
    .line 625
    .line 626
    :cond_10
    return-void

    .line 627
    :pswitch_15
    check-cast v0, Lcl;

    .line 628
    .line 629
    iget-object v1, v0, Lcl;->a:Ljava/lang/Object;

    .line 630
    .line 631
    monitor-enter v1

    .line 632
    :try_start_7
    iget-boolean v2, v0, Lcl;->m:Z

    .line 633
    .line 634
    if-eqz v2, :cond_11

    .line 635
    .line 636
    monitor-exit v1

    .line 637
    goto :goto_a

    .line 638
    :catchall_2
    move-exception v0

    .line 639
    goto :goto_b

    .line 640
    :cond_11
    iget-wide v5, v0, Lcl;->l:J

    .line 641
    .line 642
    const-wide/16 v7, 0x1

    .line 643
    .line 644
    sub-long/2addr v5, v7

    .line 645
    iput-wide v5, v0, Lcl;->l:J

    .line 646
    .line 647
    cmp-long v2, v5, v3

    .line 648
    .line 649
    if-lez v2, :cond_12

    .line 650
    .line 651
    monitor-exit v1

    .line 652
    goto :goto_a

    .line 653
    :cond_12
    if-gez v2, :cond_13

    .line 654
    .line 655
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 656
    .line 657
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 658
    .line 659
    .line 660
    iget-object v3, v0, Lcl;->a:Ljava/lang/Object;

    .line 661
    .line 662
    monitor-enter v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 663
    :try_start_8
    iput-object v2, v0, Lcl;->n:Ljava/lang/IllegalStateException;

    .line 664
    .line 665
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 666
    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 667
    goto :goto_a

    .line 668
    :catchall_3
    move-exception v0

    .line 669
    :try_start_a
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 670
    :try_start_b
    throw v0

    .line 671
    :cond_13
    invoke-virtual {v0}, Lcl;->a()V

    .line 672
    .line 673
    .line 674
    monitor-exit v1

    .line 675
    :goto_a
    return-void

    .line 676
    :goto_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 677
    throw v0

    .line 678
    :pswitch_16
    check-cast v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 679
    .line 680
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 681
    .line 682
    iget-object v1, v1, Lsc1;->k:Landroid/widget/LinearLayout;

    .line 683
    .line 684
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 685
    .line 686
    .line 687
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 688
    .line 689
    iget-object v1, v1, Lsc1;->p:Landroid/widget/LinearLayout;

    .line 690
    .line 691
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 692
    .line 693
    .line 694
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 695
    .line 696
    iget-object v1, v1, Lsc1;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 697
    .line 698
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 699
    .line 700
    .line 701
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 702
    .line 703
    iget-object v1, v1, Lsc1;->r:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 704
    .line 705
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 706
    .line 707
    .line 708
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 709
    .line 710
    iget-object v1, v1, Lsc1;->q:Landroid/widget/TextView;

    .line 711
    .line 712
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 713
    .line 714
    .line 715
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 716
    .line 717
    iget-object v0, v0, Lsc1;->t:Landroid/widget/TextView;

    .line 718
    .line 719
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 720
    .line 721
    .line 722
    return-void

    .line 723
    :pswitch_17
    check-cast v0, Llb;

    .line 724
    .line 725
    invoke-virtual {v0}, Llb;->e()Z

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    iget-object v3, v0, Llb;->n:Lra;

    .line 730
    .line 731
    if-nez v1, :cond_14

    .line 732
    .line 733
    goto/16 :goto_f

    .line 734
    .line 735
    :cond_14
    const-string v1, "ContentCapture:changeChecker"

    .line 736
    .line 737
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    :try_start_c
    invoke-virtual {v3, v9}, Lra;->q(Z)V

    .line 741
    .line 742
    .line 743
    iget-object v1, v0, Llb;->x:Li03;

    .line 744
    .line 745
    iget-object v4, v1, Le02;->b:[I

    .line 746
    .line 747
    iget-object v1, v1, Le02;->a:[J

    .line 748
    .line 749
    array-length v6, v1

    .line 750
    sub-int/2addr v6, v5

    .line 751
    if-ltz v6, :cond_18

    .line 752
    .line 753
    move v5, v10

    .line 754
    :goto_c
    aget-wide v7, v1, v5

    .line 755
    .line 756
    not-long v11, v7

    .line 757
    const/4 v9, 0x7

    .line 758
    shl-long/2addr v11, v9

    .line 759
    and-long/2addr v11, v7

    .line 760
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    and-long/2addr v11, v13

    .line 766
    cmp-long v9, v11, v13

    .line 767
    .line 768
    if-eqz v9, :cond_17

    .line 769
    .line 770
    sub-int v9, v5, v6

    .line 771
    .line 772
    not-int v9, v9

    .line 773
    ushr-int/lit8 v9, v9, 0x1f

    .line 774
    .line 775
    rsub-int/lit8 v9, v9, 0x8

    .line 776
    .line 777
    move v11, v10

    .line 778
    :goto_d
    if-ge v11, v9, :cond_16

    .line 779
    .line 780
    const-wide/16 v12, 0xff

    .line 781
    .line 782
    and-long/2addr v12, v7

    .line 783
    const-wide/16 v14, 0x80

    .line 784
    .line 785
    cmp-long v12, v12, v14

    .line 786
    .line 787
    if-gez v12, :cond_15

    .line 788
    .line 789
    shl-int/lit8 v12, v5, 0x3

    .line 790
    .line 791
    add-int/2addr v12, v11

    .line 792
    aget v14, v4, v12

    .line 793
    .line 794
    invoke-virtual {v0}, Llb;->d()Le02;

    .line 795
    .line 796
    .line 797
    move-result-object v12

    .line 798
    invoke-virtual {v12, v14}, Le02;->a(I)Z

    .line 799
    .line 800
    .line 801
    move-result v12

    .line 802
    if-nez v12, :cond_15

    .line 803
    .line 804
    iget-object v12, v0, Llb;->q:Ljava/util/ArrayList;

    .line 805
    .line 806
    new-instance v13, Lyc0;

    .line 807
    .line 808
    move/from16 p0, v11

    .line 809
    .line 810
    iget-wide v10, v0, Llb;->w:J

    .line 811
    .line 812
    sget-object v17, Lzc0;->o:Lzc0;

    .line 813
    .line 814
    const/16 v18, 0x0

    .line 815
    .line 816
    move-wide v15, v10

    .line 817
    invoke-direct/range {v13 .. v18}, Lyc0;-><init>(IJLzc0;Loz4;)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    iget-object v10, v0, Llb;->u:Law;

    .line 824
    .line 825
    sget-object v11, Lj15;->a:Lj15;

    .line 826
    .line 827
    invoke-interface {v10, v11}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    goto :goto_e

    .line 831
    :cond_15
    move/from16 p0, v11

    .line 832
    .line 833
    :goto_e
    shr-long/2addr v7, v2

    .line 834
    add-int/lit8 v11, p0, 0x1

    .line 835
    .line 836
    const/4 v10, 0x0

    .line 837
    goto :goto_d

    .line 838
    :cond_16
    if-ne v9, v2, :cond_18

    .line 839
    .line 840
    :cond_17
    if-eq v5, v6, :cond_18

    .line 841
    .line 842
    add-int/lit8 v5, v5, 0x1

    .line 843
    .line 844
    const/4 v10, 0x0

    .line 845
    goto :goto_c

    .line 846
    :cond_18
    const-string v1, "ContentCapture:sendAppearEvents"

    .line 847
    .line 848
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 849
    .line 850
    .line 851
    :try_start_d
    invoke-virtual {v3}, Lra;->getSemanticsOwner()Ll94;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    invoke-virtual {v1}, Ll94;->a()Li94;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    iget-object v2, v0, Llb;->y:Lj94;

    .line 860
    .line 861
    invoke-virtual {v0, v1, v2}, Llb;->g(Li94;Lj94;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 862
    .line 863
    .line 864
    :try_start_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0}, Llb;->d()Le02;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    invoke-virtual {v0, v1}, Llb;->c(Le02;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v0}, Llb;->l()V

    .line 875
    .line 876
    .line 877
    const/4 v1, 0x0

    .line 878
    iput-boolean v1, v0, Llb;->z:Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 879
    .line 880
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 881
    .line 882
    .line 883
    :goto_f
    return-void

    .line 884
    :catchall_4
    move-exception v0

    .line 885
    :try_start_f
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 886
    .line 887
    .line 888
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 889
    :catchall_5
    move-exception v0

    .line 890
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 891
    .line 892
    .line 893
    throw v0

    .line 894
    :pswitch_18
    check-cast v0, Lya;

    .line 895
    .line 896
    const-string v1, "Compose:semantics:measureAndLayout"

    .line 897
    .line 898
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    :try_start_10
    iget-object v1, v0, Lya;->q:Lra;

    .line 902
    .line 903
    invoke-virtual {v1, v9}, Lra;->q(Z)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 904
    .line 905
    .line 906
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 907
    .line 908
    .line 909
    const-string v1, "Compose:semantics:checkForSemanticsChanges"

    .line 910
    .line 911
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 912
    .line 913
    .line 914
    :try_start_11
    invoke-virtual {v0}, Lya;->n()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 915
    .line 916
    .line 917
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 918
    .line 919
    .line 920
    const/4 v1, 0x0

    .line 921
    iput-boolean v1, v0, Lya;->V:Z

    .line 922
    .line 923
    return-void

    .line 924
    :catchall_6
    move-exception v0

    .line 925
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 926
    .line 927
    .line 928
    throw v0

    .line 929
    :catchall_7
    move-exception v0

    .line 930
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 931
    .line 932
    .line 933
    throw v0

    .line 934
    :pswitch_19
    check-cast v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 935
    .line 936
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 937
    .line 938
    if-nez v1, :cond_19

    .line 939
    .line 940
    goto :goto_11

    .line 941
    :cond_19
    invoke-virtual {v0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    const v2, 0x7f0702eb

    .line 946
    .line 947
    .line 948
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 949
    .line 950
    .line 951
    move-result v1

    .line 952
    float-to-int v1, v1

    .line 953
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 954
    .line 955
    .line 956
    move-result-object v2

    .line 957
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    sget-object v3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 966
    .line 967
    invoke-static {v2}, Lb65;->a(Landroid/view/View;)Lpb5;

    .line 968
    .line 969
    .line 970
    move-result-object v2

    .line 971
    if-nez v2, :cond_1a

    .line 972
    .line 973
    const/4 v10, 0x0

    .line 974
    goto :goto_10

    .line 975
    :cond_1a
    const/16 v3, 0x207

    .line 976
    .line 977
    iget-object v2, v2, Lpb5;->a:Lmb5;

    .line 978
    .line 979
    invoke-virtual {v2, v3}, Lmb5;->h(I)Lvz1;

    .line 980
    .line 981
    .line 982
    move-result-object v2

    .line 983
    iget v10, v2, Lvz1;->d:I

    .line 984
    .line 985
    :goto_10
    iget-object v2, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 986
    .line 987
    iget-object v2, v2, Lpc1;->q:Landroid/view/View;

    .line 988
    .line 989
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 990
    .line 991
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 992
    .line 993
    .line 994
    move-result v3

    .line 995
    iget-object v4, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 996
    .line 997
    iget-object v4, v4, Lpc1;->q:Landroid/view/View;

    .line 998
    .line 999
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 1000
    .line 1001
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 1002
    .line 1003
    .line 1004
    move-result v4

    .line 1005
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 1006
    .line 1007
    iget-object v0, v0, Lpc1;->q:Landroid/view/View;

    .line 1008
    .line 1009
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1010
    .line 1011
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 1012
    .line 1013
    .line 1014
    move-result v0

    .line 1015
    add-int/2addr v10, v1

    .line 1016
    invoke-virtual {v2, v3, v4, v0, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 1017
    .line 1018
    .line 1019
    :goto_11
    return-void

    .line 1020
    :pswitch_1a
    check-cast v0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 1021
    .line 1022
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->o0()V

    .line 1023
    .line 1024
    .line 1025
    return-void

    .line 1026
    :pswitch_1b
    move-object v1, v0

    .line 1027
    check-cast v1, Landroid/app/Activity;

    .line 1028
    .line 1029
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v0

    .line 1033
    if-nez v0, :cond_24

    .line 1034
    .line 1035
    sget-object v2, Ln5;->g:Landroid/os/Handler;

    .line 1036
    .line 1037
    sget-object v0, Ln5;->f:Ljava/lang/reflect/Method;

    .line 1038
    .line 1039
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1040
    .line 1041
    const/16 v4, 0x1c

    .line 1042
    .line 1043
    if-lt v3, v4, :cond_1b

    .line 1044
    .line 1045
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1046
    .line 1047
    .line 1048
    goto/16 :goto_16

    .line 1049
    .line 1050
    :cond_1b
    const/16 v4, 0x1b

    .line 1051
    .line 1052
    const/16 v6, 0x1a

    .line 1053
    .line 1054
    if-eq v3, v6, :cond_1c

    .line 1055
    .line 1056
    if-ne v3, v4, :cond_1d

    .line 1057
    .line 1058
    :cond_1c
    if-nez v0, :cond_1d

    .line 1059
    .line 1060
    goto/16 :goto_15

    .line 1061
    .line 1062
    :cond_1d
    sget-object v8, Ln5;->e:Ljava/lang/reflect/Method;

    .line 1063
    .line 1064
    if-nez v8, :cond_1e

    .line 1065
    .line 1066
    sget-object v8, Ln5;->d:Ljava/lang/reflect/Method;

    .line 1067
    .line 1068
    if-nez v8, :cond_1e

    .line 1069
    .line 1070
    goto/16 :goto_15

    .line 1071
    .line 1072
    :cond_1e
    :try_start_12
    sget-object v8, Ln5;->c:Ljava/lang/reflect/Field;

    .line 1073
    .line 1074
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v10

    .line 1078
    if-nez v10, :cond_1f

    .line 1079
    .line 1080
    goto :goto_15

    .line 1081
    :cond_1f
    sget-object v8, Ln5;->b:Ljava/lang/reflect/Field;

    .line 1082
    .line 1083
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v8

    .line 1087
    if-nez v8, :cond_20

    .line 1088
    .line 1089
    goto :goto_15

    .line 1090
    :cond_20
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v11

    .line 1094
    new-instance v12, Lm5;

    .line 1095
    .line 1096
    invoke-direct {v12, v1}, Lm5;-><init>(Landroid/app/Activity;)V

    .line 1097
    .line 1098
    .line 1099
    invoke-virtual {v11, v12}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1100
    .line 1101
    .line 1102
    new-instance v13, Llg1;

    .line 1103
    .line 1104
    invoke-direct {v13, v5, v12, v10}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1105
    .line 1106
    .line 1107
    invoke-virtual {v2, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 1108
    .line 1109
    .line 1110
    if-eq v3, v6, :cond_22

    .line 1111
    .line 1112
    if-ne v3, v4, :cond_21

    .line 1113
    .line 1114
    goto :goto_12

    .line 1115
    :cond_21
    const/4 v9, 0x0

    .line 1116
    :cond_22
    :goto_12
    if-eqz v9, :cond_23

    .line 1117
    .line 1118
    const/16 v19, 0x0

    .line 1119
    .line 1120
    :try_start_13
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v13

    .line 1124
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 1125
    .line 1126
    const/4 v15, 0x0

    .line 1127
    const/16 v16, 0x0

    .line 1128
    .line 1129
    move-object v3, v11

    .line 1130
    const/4 v11, 0x0

    .line 1131
    move-object v4, v12

    .line 1132
    const/4 v12, 0x0

    .line 1133
    move-object/from16 v17, v14

    .line 1134
    .line 1135
    move-object/from16 v18, v14

    .line 1136
    .line 1137
    :try_start_14
    filled-new-array/range {v10 .. v18}, [Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v5

    .line 1141
    invoke-virtual {v0, v8, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    goto :goto_13

    .line 1145
    :catchall_8
    move-exception v0

    .line 1146
    goto :goto_14

    .line 1147
    :catchall_9
    move-exception v0

    .line 1148
    move-object v3, v11

    .line 1149
    move-object v4, v12

    .line 1150
    goto :goto_14

    .line 1151
    :cond_23
    move-object v3, v11

    .line 1152
    move-object v4, v12

    .line 1153
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 1154
    .line 1155
    .line 1156
    :goto_13
    :try_start_15
    new-instance v0, Llg1;

    .line 1157
    .line 1158
    invoke-direct {v0, v7, v3, v4}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1162
    .line 1163
    .line 1164
    goto :goto_16

    .line 1165
    :goto_14
    new-instance v5, Llg1;

    .line 1166
    .line 1167
    invoke-direct {v5, v7, v3, v4}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1171
    .line 1172
    .line 1173
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1174
    :catchall_a
    :goto_15
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1175
    .line 1176
    .line 1177
    :cond_24
    :goto_16
    return-void

    .line 1178
    :pswitch_1c
    check-cast v0, Lb0;

    .line 1179
    .line 1180
    invoke-virtual {v0}, Lb0;->b()V

    .line 1181
    .line 1182
    .line 1183
    return-void

    .line 1184
    nop

    .line 1185
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
