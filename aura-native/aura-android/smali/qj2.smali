.class public Lqj2;
.super Landroid/service/media/MediaBrowserService;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:Lbq4;


# direct methods
.method public constructor <init>(Lbq4;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqj2;->n:Lbq4;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/service/media/MediaBrowserService;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p2}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/service/media/MediaBrowserService$BrowserRoot;
    .locals 23

    .line 1
    invoke-static/range {p3 .. p3}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    iget-object v1, v1, Lqj2;->n:Lbq4;

    .line 8
    .line 9
    iget-object v2, v1, Lbq4;->q:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    check-cast v4, Lpn2;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    move-object v9, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v3, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    move-object v9, v3

    .line 25
    :goto_0
    const/4 v10, 0x0

    .line 26
    const/4 v0, -0x1

    .line 27
    if-eqz v9, :cond_3

    .line 28
    .line 29
    const-string v3, "extra_client_version"

    .line 30
    .line 31
    invoke-virtual {v9, v3, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v9, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance v3, Landroid/os/Messenger;

    .line 41
    .line 42
    iget-object v5, v4, Lpn2;->t:Lzk;

    .line 43
    .line 44
    invoke-direct {v3, v5}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 45
    .line 46
    .line 47
    iput-object v3, v1, Lbq4;->p:Ljava/lang/Object;

    .line 48
    .line 49
    new-instance v3, Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v5, "extra_service_version"

    .line 55
    .line 56
    const/4 v6, 0x2

    .line 57
    invoke-virtual {v3, v5, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    iget-object v5, v1, Lbq4;->p:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v5, Landroid/os/Messenger;

    .line 63
    .line 64
    invoke-virtual {v5}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const-string v6, "extra_messenger"

    .line 69
    .line 70
    invoke-virtual {v3, v6, v5}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 71
    .line 72
    .line 73
    iget-object v5, v4, Lpn2;->u:Lpr2;

    .line 74
    .line 75
    if-eqz v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {v5}, Lpr2;->a()Lqu1;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    if-nez v5, :cond_1

    .line 82
    .line 83
    move-object v5, v2

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    invoke-interface {v5}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    :goto_1
    const-string v6, "extra_session_binder"

    .line 90
    .line 91
    invoke-virtual {v3, v6, v5}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    iget-object v5, v1, Lbq4;->n:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v5, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :goto_2
    const-string v5, "extra_calling_pid"

    .line 103
    .line 104
    invoke-virtual {v9, v5, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {v9, v5}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object v11, v3

    .line 112
    :goto_3
    move v6, v0

    .line 113
    goto :goto_4

    .line 114
    :cond_3
    move-object v11, v2

    .line 115
    goto :goto_3

    .line 116
    :goto_4
    new-instance v3, Loj2;

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    move-object/from16 v5, p1

    .line 120
    .line 121
    move/from16 v7, p2

    .line 122
    .line 123
    invoke-direct/range {v3 .. v8}, Loj2;-><init>(Lpn2;Ljava/lang/String;IILhg3;)V

    .line 124
    .line 125
    .line 126
    move-object v12, v3

    .line 127
    iput-object v12, v4, Lpn2;->s:Loj2;

    .line 128
    .line 129
    iget-object v13, v4, Lpn2;->z:Ltn2;

    .line 130
    .line 131
    iget-object v14, v4, Lpn2;->x:Lna4;

    .line 132
    .line 133
    iget-object v0, v4, Lpn2;->n:Lbq4;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lbq4;->j()Lms2;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v9, :cond_4

    .line 143
    .line 144
    move-object v3, v9

    .line 145
    goto :goto_5

    .line 146
    :cond_4
    sget-object v3, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 147
    .line 148
    :goto_5
    new-instance v15, Lfr2;

    .line 149
    .line 150
    iget-object v5, v4, Lpn2;->v:Lhg3;

    .line 151
    .line 152
    invoke-virtual {v5, v0}, Lhg3;->G(Lms2;)Z

    .line 153
    .line 154
    .line 155
    move-result v19

    .line 156
    new-instance v5, Lon2;

    .line 157
    .line 158
    invoke-direct {v5, v4, v0}, Lon2;-><init>(Lpn2;Lms2;)V

    .line 159
    .line 160
    .line 161
    sget-object v6, Lf92;->a:Ljx1;

    .line 162
    .line 163
    const-string v6, "androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT"

    .line 164
    .line 165
    invoke-virtual {v3, v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    invoke-static {v10, v6}, Ljava/lang/Math;->max(II)I

    .line 170
    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/16 v18, 0x0

    .line 175
    .line 176
    move-object/from16 v16, v0

    .line 177
    .line 178
    move-object/from16 v21, v3

    .line 179
    .line 180
    move-object/from16 v20, v5

    .line 181
    .line 182
    invoke-direct/range {v15 .. v21}, Lfr2;-><init>(Lms2;IIZLer2;Landroid/os/Bundle;)V

    .line 183
    .line 184
    .line 185
    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 186
    .line 187
    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 188
    .line 189
    .line 190
    new-instance v7, Lq90;

    .line 191
    .line 192
    invoke-direct {v7}, Lq90;-><init>()V

    .line 193
    .line 194
    .line 195
    iget-object v3, v4, Lpn2;->w:Ltn2;

    .line 196
    .line 197
    iget-object v3, v3, Ltn2;->l:Landroid/os/Handler;

    .line 198
    .line 199
    move-object v6, v3

    .line 200
    new-instance v3, Lt6;

    .line 201
    .line 202
    const/16 v8, 0x16

    .line 203
    .line 204
    move-object/from16 v22, v15

    .line 205
    .line 206
    move-object v15, v6

    .line 207
    move-object/from16 v6, v22

    .line 208
    .line 209
    invoke-direct/range {v3 .. v8}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 210
    .line 211
    .line 212
    invoke-static {v15, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 213
    .line 214
    .line 215
    :try_start_0
    invoke-virtual {v7}, Lq90;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    check-cast v3, Ldr2;

    .line 223
    .line 224
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iget-object v5, v3, Ldr2;->a:Lwa4;

    .line 228
    .line 229
    iget-object v3, v3, Ldr2;->b:Lmi3;

    .line 230
    .line 231
    invoke-virtual {v14, v0, v6, v5, v3}, Lna4;->a(Ljava/lang/Object;Lfr2;Lwa4;Lmi3;)V

    .line 232
    .line 233
    .line 234
    sget-object v0, Lju2;->a:Lhd5;

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :catch_0
    move-exception v0

    .line 238
    const-string v3, "MSSLegacyStub"

    .line 239
    .line 240
    const-string v5, "Couldn\'t get a result from onConnect"

    .line 241
    .line 242
    invoke-static {v3, v5, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    move-object v0, v2

    .line 246
    :goto_6
    if-nez v0, :cond_5

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_5
    invoke-virtual {v4}, Lpn2;->b()Lfr2;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    if-nez v6, :cond_6

    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_6
    const v0, 0xc350

    .line 257
    .line 258
    .line 259
    invoke-virtual {v14, v6, v0}, Lna4;->I(Lfr2;I)Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    if-nez v0, :cond_7

    .line 264
    .line 265
    :goto_7
    move-object v0, v2

    .line 266
    goto/16 :goto_d

    .line 267
    .line 268
    :cond_7
    iget-object v0, v13, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 269
    .line 270
    invoke-static {v0, v9}, Lf92;->h(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Bundle;)Ljn2;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    new-instance v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 275
    .line 276
    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 277
    .line 278
    .line 279
    new-instance v8, Lq90;

    .line 280
    .line 281
    invoke-direct {v8}, Lq90;-><init>()V

    .line 282
    .line 283
    .line 284
    iget-object v0, v13, Ltn2;->l:Landroid/os/Handler;

    .line 285
    .line 286
    new-instance v3, Lmr;

    .line 287
    .line 288
    const/4 v9, 0x6

    .line 289
    invoke-direct/range {v3 .. v9}, Lmr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v3}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    :try_start_1
    invoke-virtual {v8}, Lq90;->a()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Lic2;

    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Lm92;

    .line 309
    .line 310
    const-string v3, "LibraryResult must not be null"

    .line 311
    .line 312
    invoke-static {v0, v3}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 313
    .line 314
    .line 315
    goto :goto_9

    .line 316
    :catch_1
    move-exception v0

    .line 317
    goto :goto_8

    .line 318
    :catch_2
    move-exception v0

    .line 319
    goto :goto_8

    .line 320
    :catch_3
    move-exception v0

    .line 321
    :goto_8
    const-string v3, "MLSLegacyStub"

    .line 322
    .line 323
    const-string v5, "Couldn\'t get a result from onGetLibraryRoot"

    .line 324
    .line 325
    invoke-static {v3, v5, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    move-object v0, v2

    .line 329
    :goto_9
    if-eqz v0, :cond_11

    .line 330
    .line 331
    iget-object v3, v0, Lm92;->c:Ljava/lang/Object;

    .line 332
    .line 333
    iget v5, v0, Lm92;->a:I

    .line 334
    .line 335
    if-nez v5, :cond_11

    .line 336
    .line 337
    if-eqz v3, :cond_11

    .line 338
    .line 339
    iget-object v0, v0, Lm92;->e:Ljn2;

    .line 340
    .line 341
    if-eqz v0, :cond_a

    .line 342
    .line 343
    iget-object v5, v0, Ljn2;->a:Landroid/os/Bundle;

    .line 344
    .line 345
    new-instance v7, Landroid/os/Bundle;

    .line 346
    .line 347
    invoke-direct {v7, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 348
    .line 349
    .line 350
    const-string v8, "androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY"

    .line 351
    .line 352
    invoke-virtual {v5, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 353
    .line 354
    .line 355
    move-result v9

    .line 356
    if-eqz v9, :cond_9

    .line 357
    .line 358
    invoke-virtual {v5, v8, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    invoke-virtual {v7, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    if-eqz v5, :cond_8

    .line 366
    .line 367
    const/4 v5, 0x1

    .line 368
    goto :goto_a

    .line 369
    :cond_8
    const/4 v5, 0x3

    .line 370
    :goto_a
    const-string v8, "androidx.media.MediaBrowserCompat.Extras.KEY_ROOT_CHILDREN_SUPPORTED_FLAGS"

    .line 371
    .line 372
    invoke-virtual {v7, v8, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 373
    .line 374
    .line 375
    :cond_9
    const-string v5, "android.service.media.extra.RECENT"

    .line 376
    .line 377
    iget-boolean v8, v0, Ljn2;->b:Z

    .line 378
    .line 379
    invoke-virtual {v7, v5, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 380
    .line 381
    .line 382
    const-string v5, "android.service.media.extra.OFFLINE"

    .line 383
    .line 384
    iget-boolean v8, v0, Ljn2;->c:Z

    .line 385
    .line 386
    invoke-virtual {v7, v5, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 387
    .line 388
    .line 389
    const-string v5, "android.service.media.extra.SUGGESTED"

    .line 390
    .line 391
    iget-boolean v0, v0, Ljn2;->d:Z

    .line 392
    .line 393
    invoke-virtual {v7, v5, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 394
    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_a
    new-instance v7, Landroid/os/Bundle;

    .line 398
    .line 399
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 400
    .line 401
    .line 402
    :goto_b
    const v0, 0xc355

    .line 403
    .line 404
    .line 405
    invoke-virtual {v14, v6, v0}, Lna4;->I(Lfr2;I)Z

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    const-string v5, "android.media.browse.SEARCH_SUPPORTED"

    .line 410
    .line 411
    invoke-virtual {v7, v5, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 412
    .line 413
    .line 414
    iget-object v0, v13, Ltn2;->q:Lyw1;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    if-nez v5, :cond_10

    .line 421
    .line 422
    new-instance v5, Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 425
    .line 426
    .line 427
    :goto_c
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 428
    .line 429
    .line 430
    move-result v6

    .line 431
    if-ge v10, v6, :cond_f

    .line 432
    .line 433
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    check-cast v6, Lj60;

    .line 438
    .line 439
    iget-object v8, v6, Lj60;->a:Lva4;

    .line 440
    .line 441
    if-eqz v8, :cond_e

    .line 442
    .line 443
    iget v8, v8, Lva4;->a:I

    .line 444
    .line 445
    if-nez v8, :cond_e

    .line 446
    .line 447
    new-instance v8, Landroid/os/Bundle;

    .line 448
    .line 449
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 450
    .line 451
    .line 452
    iget-object v9, v6, Lj60;->a:Lva4;

    .line 453
    .line 454
    iget-object v13, v6, Lj60;->g:Landroid/os/Bundle;

    .line 455
    .line 456
    if-eqz v9, :cond_b

    .line 457
    .line 458
    const-string v14, "androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ID"

    .line 459
    .line 460
    iget-object v9, v9, Lva4;->b:Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {v8, v14, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    :cond_b
    iget-object v9, v6, Lj60;->f:Ljava/lang/CharSequence;

    .line 466
    .line 467
    invoke-interface {v9}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v9

    .line 471
    const-string v14, "androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_LABEL"

    .line 472
    .line 473
    invoke-virtual {v8, v14, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    iget-object v6, v6, Lj60;->e:Landroid/net/Uri;

    .line 477
    .line 478
    if-eqz v6, :cond_c

    .line 479
    .line 480
    const-string v9, "androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_ICON_URI"

    .line 481
    .line 482
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    invoke-virtual {v8, v9, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    :cond_c
    invoke-virtual {v13}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v6

    .line 493
    if-nez v6, :cond_d

    .line 494
    .line 495
    const-string v6, "androidx.media.utils.extras.KEY_CUSTOM_BROWSER_ACTION_EXTRAS"

    .line 496
    .line 497
    invoke-virtual {v8, v6, v13}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 498
    .line 499
    .line 500
    :cond_d
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 504
    .line 505
    goto :goto_c

    .line 506
    :cond_f
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-nez v0, :cond_10

    .line 511
    .line 512
    const-string v0, "androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ROOT_LIST"

    .line 513
    .line 514
    invoke-virtual {v7, v0, v5}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 515
    .line 516
    .line 517
    :cond_10
    new-instance v0, Lhd5;

    .line 518
    .line 519
    check-cast v3, Lgn2;

    .line 520
    .line 521
    iget-object v3, v3, Lgn2;->a:Ljava/lang/String;

    .line 522
    .line 523
    invoke-direct {v0, v3, v7}, Lhd5;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 524
    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_11
    if-eqz v0, :cond_12

    .line 528
    .line 529
    iget v0, v0, Lm92;->a:I

    .line 530
    .line 531
    if-eqz v0, :cond_12

    .line 532
    .line 533
    goto/16 :goto_7

    .line 534
    .line 535
    :cond_12
    sget-object v0, Lju2;->a:Lhd5;

    .line 536
    .line 537
    :goto_d
    iput-object v2, v4, Lpn2;->s:Loj2;

    .line 538
    .line 539
    if-nez v0, :cond_13

    .line 540
    .line 541
    move-object v1, v2

    .line 542
    goto :goto_f

    .line 543
    :cond_13
    iget-object v1, v1, Lbq4;->p:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v1, Landroid/os/Messenger;

    .line 546
    .line 547
    if-eqz v1, :cond_14

    .line 548
    .line 549
    iget-object v1, v4, Lpn2;->q:Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    :cond_14
    iget-object v1, v0, Lhd5;->p:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v1, Landroid/os/Bundle;

    .line 557
    .line 558
    if-nez v11, :cond_15

    .line 559
    .line 560
    move-object v11, v1

    .line 561
    goto :goto_e

    .line 562
    :cond_15
    if-eqz v1, :cond_16

    .line 563
    .line 564
    invoke-virtual {v11, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 565
    .line 566
    .line 567
    :cond_16
    :goto_e
    new-instance v1, Lhd5;

    .line 568
    .line 569
    iget-object v0, v0, Lhd5;->o:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Ljava/lang/String;

    .line 572
    .line 573
    invoke-direct {v1, v0, v11}, Lhd5;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 574
    .line 575
    .line 576
    :goto_f
    if-nez v1, :cond_17

    .line 577
    .line 578
    return-object v2

    .line 579
    :cond_17
    new-instance v0, Landroid/service/media/MediaBrowserService$BrowserRoot;

    .line 580
    .line 581
    iget-object v2, v1, Lhd5;->o:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v2, Ljava/lang/String;

    .line 584
    .line 585
    iget-object v1, v1, Lhd5;->p:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v1, Landroid/os/Bundle;

    .line 588
    .line 589
    invoke-direct {v0, v2, v1}, Landroid/service/media/MediaBrowserService$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 590
    .line 591
    .line 592
    return-object v0
.end method

.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 2

    .line 1
    new-instance v0, Lom1;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1, p2}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p2, Lpj2;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p2, p1, v0, v1}, Lpj2;-><init>(Ljava/lang/String;Lom1;I)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lqj2;->n:Lbq4;

    .line 14
    .line 15
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lpn2;

    .line 18
    .line 19
    iget-object v0, p0, Lpn2;->p:Loj2;

    .line 20
    .line 21
    iput-object v0, p0, Lpn2;->s:Loj2;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, p2, v0}, Lpn2;->d(Ljava/lang/String;Luj2;Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lpn2;->s:Loj2;

    .line 28
    .line 29
    return-void
.end method

.method public final onLoadItem(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 2

    .line 1
    new-instance v0, Lom1;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1, p2}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p2, Lpj2;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {p2, p1, v0, v1}, Lpj2;-><init>(Ljava/lang/String;Lom1;I)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lqj2;->n:Lbq4;

    .line 14
    .line 15
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lpn2;

    .line 18
    .line 19
    iget-object v0, p0, Lpn2;->p:Loj2;

    .line 20
    .line 21
    iput-object v0, p0, Lpn2;->s:Loj2;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lpn2;->e(Ljava/lang/String;Luj2;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lpn2;->s:Loj2;

    .line 28
    .line 29
    return-void
.end method
