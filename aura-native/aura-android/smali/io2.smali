.class public final synthetic Lio2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p6, p0, Lio2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lio2;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lio2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lio2;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p4, p0, Lio2;->s:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p5, p0, Lio2;->o:Z

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lio2;->n:I

    .line 4
    .line 5
    iget-object v2, v1, Lio2;->s:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v1, Lio2;->r:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v1, Lio2;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v1, Lio2;->p:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v5, Lqs2;

    .line 17
    .line 18
    check-cast v4, Lju1;

    .line 19
    .line 20
    move-object v7, v3

    .line 21
    check-cast v7, Lms2;

    .line 22
    .line 23
    check-cast v2, Lja0;

    .line 24
    .line 25
    iget-boolean v10, v1, Lio2;->o:Z

    .line 26
    .line 27
    iget-object v0, v5, Lqs2;->g:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v0, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :try_start_0
    iget-object v0, v5, Lqs2;->e:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroidx/media3/session/MediaLibraryService;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    :goto_0
    invoke-static {v4}, Lau0;->k(Lju1;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :try_start_1
    new-instance v6, Lfr2;

    .line 47
    .line 48
    iget v8, v2, Lja0;->a:I

    .line 49
    .line 50
    iget v9, v2, Lja0;->b:I

    .line 51
    .line 52
    new-instance v11, Lft2;

    .line 53
    .line 54
    invoke-direct {v11, v4, v9}, Lft2;-><init>(Lju1;I)V

    .line 55
    .line 56
    .line 57
    iget-object v12, v2, Lja0;->e:Landroid/os/Bundle;

    .line 58
    .line 59
    invoke-direct/range {v6 .. v12}, Lfr2;-><init>(Lms2;IIZLer2;Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v6}, Landroidx/media3/session/MediaLibraryService;->i(Lfr2;)Lkn2;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {v0, v1}, Landroidx/media3/session/MediaLibraryService;->c(Lkn2;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v1, Lkn2;->a:Ltn2;

    .line 73
    .line 74
    iget-object v0, v0, Ltn2;->g:Lkt2;

    .line 75
    .line 76
    invoke-virtual {v0, v4, v6}, Lkt2;->m(Lju1;Lfr2;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    goto :goto_2

    .line 82
    :catch_0
    move-exception v0

    .line 83
    :try_start_2
    const-string v1, "MSessionService"

    .line 84
    .line 85
    const-string v2, "Failed to add a session to session service"

    .line 86
    .line 87
    invoke-static {v1, v2, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_1
    return-void

    .line 92
    :goto_2
    invoke-static {v4}, Lau0;->k(Lju1;)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :pswitch_0
    move-object v6, v5

    .line 97
    check-cast v6, Llo2;

    .line 98
    .line 99
    move-object v7, v4

    .line 100
    check-cast v7, Lkn2;

    .line 101
    .line 102
    check-cast v3, Lyw1;

    .line 103
    .line 104
    check-cast v2, Lvl2;

    .line 105
    .line 106
    iget-object v4, v6, Llo2;->u:Lyl0;

    .line 107
    .line 108
    iget-object v5, v6, Llo2;->o:Lx7;

    .line 109
    .line 110
    iget-object v0, v4, Lyl0;->a:Landroid/content/Context;

    .line 111
    .line 112
    iget-object v8, v4, Lyl0;->c:Landroid/app/NotificationManager;

    .line 113
    .line 114
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 115
    .line 116
    const/16 v10, 0x1a

    .line 117
    .line 118
    if-lt v9, v10, :cond_4

    .line 119
    .line 120
    invoke-static {v8}, Ltn;->a(Landroid/app/NotificationManager;)Landroid/app/NotificationChannel;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    if-eqz v11, :cond_2

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_2
    iget v11, v4, Lyl0;->b:I

    .line 128
    .line 129
    invoke-virtual {v0, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-static {v11}, Ltn;->b(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 134
    .line 135
    .line 136
    move-result-object v11

    .line 137
    const/16 v12, 0x1b

    .line 138
    .line 139
    if-gt v9, v12, :cond_3

    .line 140
    .line 141
    invoke-static {v11}, Ltn;->o(Landroid/app/NotificationChannel;)V

    .line 142
    .line 143
    .line 144
    :cond_3
    invoke-static {v8, v11}, Ltn;->p(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_3
    invoke-virtual {v7}, Lkn2;->a()Lqi3;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    iget-object v9, v7, Lkn2;->a:Ltn2;

    .line 152
    .line 153
    new-instance v11, Ls63;

    .line 154
    .line 155
    const-string v12, "default_channel_id"

    .line 156
    .line 157
    invoke-direct {v11, v0, v12}, Ls63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    new-instance v12, Leu2;

    .line 161
    .line 162
    invoke-direct {v12, v7}, Leu2;-><init>(Lkn2;)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v8}, Lqi3;->o()Lmi3;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    iget-boolean v14, v9, Ltn2;->p:Z

    .line 170
    .line 171
    invoke-static {v8, v14}, Lf35;->d0(Lqi3;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v14

    .line 175
    const/4 v15, 0x1

    .line 176
    invoke-static {v3, v15, v15}, Lj60;->j(Ljava/util/List;ZZ)Lgy3;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    const/4 v10, 0x2

    .line 181
    invoke-static {v3, v10}, Lj60;->c(Ljava/util/List;I)Z

    .line 182
    .line 183
    .line 184
    move-result v16

    .line 185
    const/4 v10, 0x3

    .line 186
    invoke-static {v3, v10}, Lj60;->c(Ljava/util/List;I)Z

    .line 187
    .line 188
    .line 189
    move-result v17

    .line 190
    new-instance v10, Luw1;

    .line 191
    .line 192
    const/4 v15, 0x4

    .line 193
    invoke-direct {v10, v15}, Lpw1;-><init>(I)V

    .line 194
    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    if-eqz v16, :cond_5

    .line 198
    .line 199
    invoke-virtual {v3, v15}, Lgy3;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v16

    .line 203
    move-object/from16 v15, v16

    .line 204
    .line 205
    check-cast v15, Lj60;

    .line 206
    .line 207
    invoke-virtual {v10, v15}, Lpw1;->c(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move/from16 v16, v14

    .line 211
    .line 212
    const/4 v14, 0x1

    .line 213
    :goto_4
    const/4 v15, 0x1

    .line 214
    goto :goto_5

    .line 215
    :cond_5
    const/4 v15, 0x7

    .line 216
    move/from16 v16, v14

    .line 217
    .line 218
    const/4 v14, 0x6

    .line 219
    filled-new-array {v15, v14}, [I

    .line 220
    .line 221
    .line 222
    move-result-object v15

    .line 223
    iget-object v14, v13, Lmi3;->a:Lw71;

    .line 224
    .line 225
    invoke-virtual {v14, v15}, Lw71;->a([I)Z

    .line 226
    .line 227
    .line 228
    move-result v14

    .line 229
    if-eqz v14, :cond_6

    .line 230
    .line 231
    new-instance v14, Li60;

    .line 232
    .line 233
    const v15, 0xe045

    .line 234
    .line 235
    .line 236
    invoke-direct {v14, v15}, Li60;-><init>(I)V

    .line 237
    .line 238
    .line 239
    const/4 v15, 0x6

    .line 240
    invoke-virtual {v14, v15}, Li60;->c(I)V

    .line 241
    .line 242
    .line 243
    const v15, 0x7f130324

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v15

    .line 250
    iput-object v15, v14, Li60;->f:Ljava/lang/CharSequence;

    .line 251
    .line 252
    invoke-virtual {v14}, Li60;->a()Lj60;

    .line 253
    .line 254
    .line 255
    move-result-object v14

    .line 256
    invoke-virtual {v10, v14}, Lpw1;->c(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_6
    const/4 v14, 0x0

    .line 260
    goto :goto_4

    .line 261
    :goto_5
    invoke-virtual {v13, v15}, Lmi3;->a(I)Z

    .line 262
    .line 263
    .line 264
    move-result v18

    .line 265
    if-eqz v18, :cond_8

    .line 266
    .line 267
    if-nez v16, :cond_7

    .line 268
    .line 269
    new-instance v15, Li60;

    .line 270
    .line 271
    const v1, 0xe034

    .line 272
    .line 273
    .line 274
    invoke-direct {v15, v1}, Li60;-><init>(I)V

    .line 275
    .line 276
    .line 277
    const/4 v1, 0x1

    .line 278
    invoke-virtual {v15, v1}, Li60;->c(I)V

    .line 279
    .line 280
    .line 281
    const v1, 0x7f13031f

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    iput-object v1, v15, Li60;->f:Ljava/lang/CharSequence;

    .line 289
    .line 290
    invoke-virtual {v15}, Li60;->a()Lj60;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {v10, v1}, Lpw1;->c(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_7
    new-instance v1, Li60;

    .line 299
    .line 300
    const v15, 0xe037

    .line 301
    .line 302
    .line 303
    invoke-direct {v1, v15}, Li60;-><init>(I)V

    .line 304
    .line 305
    .line 306
    const/4 v15, 0x1

    .line 307
    invoke-virtual {v1, v15}, Li60;->c(I)V

    .line 308
    .line 309
    .line 310
    const v15, 0x7f130320

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v15

    .line 317
    iput-object v15, v1, Li60;->f:Ljava/lang/CharSequence;

    .line 318
    .line 319
    invoke-virtual {v1}, Li60;->a()Lj60;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v10, v1}, Lpw1;->c(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_8
    :goto_6
    const/16 v1, 0x8

    .line 327
    .line 328
    if-eqz v17, :cond_9

    .line 329
    .line 330
    add-int/lit8 v13, v14, 0x1

    .line 331
    .line 332
    invoke-virtual {v3, v14}, Lgy3;->get(I)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    check-cast v14, Lj60;

    .line 337
    .line 338
    invoke-virtual {v10, v14}, Lpw1;->c(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    move v14, v13

    .line 342
    goto :goto_7

    .line 343
    :cond_9
    const/16 v15, 0x9

    .line 344
    .line 345
    filled-new-array {v15, v1}, [I

    .line 346
    .line 347
    .line 348
    move-result-object v15

    .line 349
    iget-object v13, v13, Lmi3;->a:Lw71;

    .line 350
    .line 351
    invoke-virtual {v13, v15}, Lw71;->a([I)Z

    .line 352
    .line 353
    .line 354
    move-result v13

    .line 355
    if-eqz v13, :cond_a

    .line 356
    .line 357
    new-instance v13, Li60;

    .line 358
    .line 359
    const v15, 0xe044

    .line 360
    .line 361
    .line 362
    invoke-direct {v13, v15}, Li60;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v13, v1}, Li60;->c(I)V

    .line 366
    .line 367
    .line 368
    const v15, 0x7f130323

    .line 369
    .line 370
    .line 371
    invoke-virtual {v0, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v15

    .line 375
    iput-object v15, v13, Li60;->f:Ljava/lang/CharSequence;

    .line 376
    .line 377
    invoke-virtual {v13}, Li60;->a()Lj60;

    .line 378
    .line 379
    .line 380
    move-result-object v13

    .line 381
    invoke-virtual {v10, v13}, Lpw1;->c(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    :cond_a
    :goto_7
    iget v13, v3, Lgy3;->q:I

    .line 385
    .line 386
    if-ge v14, v13, :cond_b

    .line 387
    .line 388
    invoke-virtual {v3, v14}, Lgy3;->get(I)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v13

    .line 392
    check-cast v13, Lj60;

    .line 393
    .line 394
    invoke-virtual {v10, v13}, Lpw1;->c(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    add-int/lit8 v14, v14, 0x1

    .line 398
    .line 399
    goto :goto_7

    .line 400
    :cond_b
    invoke-virtual {v10}, Luw1;->f()Lgy3;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    const/4 v10, 0x3

    .line 405
    new-array v13, v10, [I

    .line 406
    .line 407
    new-array v14, v10, [I

    .line 408
    .line 409
    const/4 v10, -0x1

    .line 410
    invoke-static {v13, v10}, Ljava/util/Arrays;->fill([II)V

    .line 411
    .line 412
    .line 413
    invoke-static {v14, v10}, Ljava/util/Arrays;->fill([II)V

    .line 414
    .line 415
    .line 416
    const/4 v1, 0x0

    .line 417
    const/4 v15, 0x0

    .line 418
    :goto_8
    iget v10, v3, Lgy3;->q:I

    .line 419
    .line 420
    move-object/from16 v19, v14

    .line 421
    .line 422
    if-ge v1, v10, :cond_1c

    .line 423
    .line 424
    invoke-virtual {v3, v1}, Lgy3;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v10

    .line 428
    check-cast v10, Lj60;

    .line 429
    .line 430
    iget-object v14, v10, Lj60;->a:Lva4;

    .line 431
    .line 432
    move-object/from16 v21, v0

    .line 433
    .line 434
    iget v0, v10, Lj60;->b:I

    .line 435
    .line 436
    move/from16 v22, v1

    .line 437
    .line 438
    iget-object v1, v10, Lj60;->f:Ljava/lang/CharSequence;

    .line 439
    .line 440
    move-object/from16 v23, v3

    .line 441
    .line 442
    iget v3, v10, Lj60;->d:I

    .line 443
    .line 444
    move/from16 v24, v15

    .line 445
    .line 446
    iget-object v15, v10, Lj60;->h:Ltw1;

    .line 447
    .line 448
    move-object/from16 v25, v6

    .line 449
    .line 450
    iget-object v6, v11, Ls63;->b:Ljava/util/ArrayList;

    .line 451
    .line 452
    if-eqz v14, :cond_d

    .line 453
    .line 454
    iget-object v0, v5, Lx7;->p:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, Landroidx/media3/session/MediaLibraryService;

    .line 457
    .line 458
    move-object/from16 v26, v2

    .line 459
    .line 460
    iget v2, v14, Lva4;->a:I

    .line 461
    .line 462
    if-nez v2, :cond_c

    .line 463
    .line 464
    const/4 v2, 0x1

    .line 465
    goto :goto_9

    .line 466
    :cond_c
    const/4 v2, 0x0

    .line 467
    :goto_9
    invoke-static {v2}, Lrr2;->l(Z)V

    .line 468
    .line 469
    .line 470
    new-instance v2, Lq63;

    .line 471
    .line 472
    sget-object v20, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 473
    .line 474
    move-object/from16 v27, v4

    .line 475
    .line 476
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    move-object/from16 v28, v11

    .line 481
    .line 482
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    invoke-static {v4, v11, v3}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    iget-object v4, v14, Lva4;->b:Ljava/lang/String;

    .line 491
    .line 492
    iget-object v11, v14, Lva4;->c:Landroid/os/Bundle;

    .line 493
    .line 494
    new-instance v14, Landroid/content/Intent;

    .line 495
    .line 496
    move-object/from16 v29, v8

    .line 497
    .line 498
    const-string v8, "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION"

    .line 499
    .line 500
    invoke-direct {v14, v8}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    iget-object v8, v9, Ltn2;->b:Landroid/net/Uri;

    .line 504
    .line 505
    invoke-virtual {v14, v8}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 506
    .line 507
    .line 508
    new-instance v8, Landroid/content/ComponentName;

    .line 509
    .line 510
    move-object/from16 v30, v9

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    invoke-direct {v8, v0, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v14, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 520
    .line 521
    .line 522
    const-string v8, "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION"

    .line 523
    .line 524
    invoke-virtual {v14, v8, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 525
    .line 526
    .line 527
    const-string v4, "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS"

    .line 528
    .line 529
    invoke-virtual {v14, v4, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 530
    .line 531
    .line 532
    iget v4, v5, Lx7;->o:I

    .line 533
    .line 534
    const/16 v18, 0x1

    .line 535
    .line 536
    add-int/lit8 v4, v4, 0x1

    .line 537
    .line 538
    iput v4, v5, Lx7;->o:I

    .line 539
    .line 540
    const/high16 v8, 0xc000000

    .line 541
    .line 542
    invoke-static {v0, v4, v14, v8}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-direct {v2, v3, v1, v0}, Lq63;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    const/16 v8, 0x1a

    .line 553
    .line 554
    goto/16 :goto_f

    .line 555
    .line 556
    :cond_d
    move-object/from16 v26, v2

    .line 557
    .line 558
    move-object/from16 v27, v4

    .line 559
    .line 560
    move-object/from16 v29, v8

    .line 561
    .line 562
    move-object/from16 v30, v9

    .line 563
    .line 564
    move-object/from16 v28, v11

    .line 565
    .line 566
    const/4 v2, -0x1

    .line 567
    if-eq v0, v2, :cond_e

    .line 568
    .line 569
    const/4 v2, 0x1

    .line 570
    goto :goto_a

    .line 571
    :cond_e
    const/4 v2, 0x0

    .line 572
    :goto_a
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 573
    .line 574
    .line 575
    sget-object v2, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    .line 576
    .line 577
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    invoke-virtual/range {v21 .. v21}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    invoke-static {v2, v4, v3}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    new-instance v3, Lq63;

    .line 593
    .line 594
    int-to-long v8, v0

    .line 595
    iget-object v0, v5, Lx7;->p:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v0, Landroidx/media3/session/MediaLibraryService;

    .line 598
    .line 599
    const-wide/16 v31, 0x8

    .line 600
    .line 601
    cmp-long v4, v8, v31

    .line 602
    .line 603
    const-wide/16 v31, 0x1

    .line 604
    .line 605
    if-eqz v4, :cond_16

    .line 606
    .line 607
    const-wide/16 v33, 0x9

    .line 608
    .line 609
    cmp-long v4, v8, v33

    .line 610
    .line 611
    if-nez v4, :cond_f

    .line 612
    .line 613
    goto :goto_c

    .line 614
    :cond_f
    const-wide/16 v33, 0x6

    .line 615
    .line 616
    cmp-long v4, v8, v33

    .line 617
    .line 618
    if-eqz v4, :cond_15

    .line 619
    .line 620
    const-wide/16 v33, 0x7

    .line 621
    .line 622
    cmp-long v4, v8, v33

    .line 623
    .line 624
    if-nez v4, :cond_10

    .line 625
    .line 626
    goto :goto_b

    .line 627
    :cond_10
    const-wide/16 v33, 0x3

    .line 628
    .line 629
    cmp-long v4, v8, v33

    .line 630
    .line 631
    if-nez v4, :cond_11

    .line 632
    .line 633
    const/16 v4, 0x56

    .line 634
    .line 635
    goto :goto_d

    .line 636
    :cond_11
    const-wide/16 v33, 0xc

    .line 637
    .line 638
    cmp-long v4, v8, v33

    .line 639
    .line 640
    if-nez v4, :cond_12

    .line 641
    .line 642
    const/16 v4, 0x5a

    .line 643
    .line 644
    goto :goto_d

    .line 645
    :cond_12
    const-wide/16 v33, 0xb

    .line 646
    .line 647
    cmp-long v4, v8, v33

    .line 648
    .line 649
    if-nez v4, :cond_13

    .line 650
    .line 651
    const/16 v4, 0x59

    .line 652
    .line 653
    goto :goto_d

    .line 654
    :cond_13
    cmp-long v4, v8, v31

    .line 655
    .line 656
    if-nez v4, :cond_14

    .line 657
    .line 658
    const/16 v4, 0x55

    .line 659
    .line 660
    goto :goto_d

    .line 661
    :cond_14
    const/4 v4, 0x0

    .line 662
    goto :goto_d

    .line 663
    :cond_15
    :goto_b
    const/16 v4, 0x58

    .line 664
    .line 665
    goto :goto_d

    .line 666
    :cond_16
    :goto_c
    const/16 v4, 0x57

    .line 667
    .line 668
    :goto_d
    invoke-virtual {v5, v7, v4}, Lx7;->b(Lkn2;I)Landroid/content/Intent;

    .line 669
    .line 670
    .line 671
    move-result-object v11

    .line 672
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 673
    .line 674
    move-wide/from16 v33, v8

    .line 675
    .line 676
    const/16 v8, 0x1a

    .line 677
    .line 678
    if-lt v14, v8, :cond_17

    .line 679
    .line 680
    cmp-long v9, v33, v31

    .line 681
    .line 682
    if-nez v9, :cond_17

    .line 683
    .line 684
    invoke-virtual {v7}, Lkn2;->a()Lqi3;

    .line 685
    .line 686
    .line 687
    move-result-object v9

    .line 688
    invoke-interface {v9}, Lqi3;->q()Z

    .line 689
    .line 690
    .line 691
    move-result v9

    .line 692
    if-nez v9, :cond_17

    .line 693
    .line 694
    invoke-static {v0, v4, v11}, Ltn;->c(Landroidx/media3/session/MediaLibraryService;ILandroid/content/Intent;)Landroid/app/PendingIntent;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    goto :goto_e

    .line 699
    :cond_17
    const/high16 v9, 0x4000000

    .line 700
    .line 701
    invoke-static {v0, v4, v11, v9}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    :goto_e
    invoke-direct {v3, v2, v1, v0}, Lq63;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 709
    .line 710
    .line 711
    :goto_f
    iget-object v0, v10, Lj60;->g:Landroid/os/Bundle;

    .line 712
    .line 713
    const-string v1, "androidx.media3.session.command.COMPACT_VIEW_INDEX"

    .line 714
    .line 715
    const/4 v2, -0x1

    .line 716
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-ltz v0, :cond_18

    .line 721
    .line 722
    const/4 v10, 0x3

    .line 723
    if-ge v0, v10, :cond_18

    .line 724
    .line 725
    aput v22, v13, v0

    .line 726
    .line 727
    const/4 v10, 0x3

    .line 728
    const/4 v15, 0x1

    .line 729
    goto :goto_12

    .line 730
    :cond_18
    const/4 v1, 0x0

    .line 731
    invoke-virtual {v15, v1}, Ltw1;->a(I)I

    .line 732
    .line 733
    .line 734
    move-result v0

    .line 735
    const/4 v2, 0x2

    .line 736
    if-ne v0, v2, :cond_19

    .line 737
    .line 738
    aput v22, v19, v1

    .line 739
    .line 740
    :goto_10
    const/4 v10, 0x3

    .line 741
    goto :goto_11

    .line 742
    :cond_19
    invoke-virtual {v15, v1}, Ltw1;->a(I)I

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    const/4 v3, 0x1

    .line 747
    if-ne v0, v3, :cond_1a

    .line 748
    .line 749
    aput v22, v19, v3

    .line 750
    .line 751
    goto :goto_10

    .line 752
    :cond_1a
    invoke-virtual {v15, v1}, Ltw1;->a(I)I

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    const/4 v10, 0x3

    .line 757
    if-ne v0, v10, :cond_1b

    .line 758
    .line 759
    aput v22, v19, v2

    .line 760
    .line 761
    :cond_1b
    :goto_11
    move/from16 v15, v24

    .line 762
    .line 763
    :goto_12
    add-int/lit8 v1, v22, 0x1

    .line 764
    .line 765
    move-object/from16 v14, v19

    .line 766
    .line 767
    move-object/from16 v0, v21

    .line 768
    .line 769
    move-object/from16 v3, v23

    .line 770
    .line 771
    move-object/from16 v6, v25

    .line 772
    .line 773
    move-object/from16 v2, v26

    .line 774
    .line 775
    move-object/from16 v4, v27

    .line 776
    .line 777
    move-object/from16 v11, v28

    .line 778
    .line 779
    move-object/from16 v8, v29

    .line 780
    .line 781
    move-object/from16 v9, v30

    .line 782
    .line 783
    goto/16 :goto_8

    .line 784
    .line 785
    :cond_1c
    move-object/from16 v26, v2

    .line 786
    .line 787
    move-object/from16 v27, v4

    .line 788
    .line 789
    move-object/from16 v25, v6

    .line 790
    .line 791
    move-object/from16 v29, v8

    .line 792
    .line 793
    move-object/from16 v30, v9

    .line 794
    .line 795
    move-object/from16 v28, v11

    .line 796
    .line 797
    move/from16 v24, v15

    .line 798
    .line 799
    const/4 v10, 0x3

    .line 800
    if-nez v24, :cond_1e

    .line 801
    .line 802
    const/4 v0, 0x0

    .line 803
    const/4 v1, 0x0

    .line 804
    :goto_13
    if-ge v0, v10, :cond_1e

    .line 805
    .line 806
    aget v2, v19, v0

    .line 807
    .line 808
    const/4 v3, -0x1

    .line 809
    if-ne v2, v3, :cond_1d

    .line 810
    .line 811
    goto :goto_14

    .line 812
    :cond_1d
    aput v2, v13, v1

    .line 813
    .line 814
    add-int/lit8 v1, v1, 0x1

    .line 815
    .line 816
    :goto_14
    add-int/lit8 v0, v0, 0x1

    .line 817
    .line 818
    const/4 v10, 0x3

    .line 819
    goto :goto_13

    .line 820
    :cond_1e
    const/4 v0, 0x0

    .line 821
    const/4 v10, 0x3

    .line 822
    :goto_15
    if-ge v0, v10, :cond_20

    .line 823
    .line 824
    aget v1, v13, v0

    .line 825
    .line 826
    const/4 v2, -0x1

    .line 827
    if-ne v1, v2, :cond_1f

    .line 828
    .line 829
    invoke-static {v13, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 830
    .line 831
    .line 832
    move-result-object v13

    .line 833
    goto :goto_16

    .line 834
    :cond_1f
    add-int/lit8 v0, v0, 0x1

    .line 835
    .line 836
    goto :goto_15

    .line 837
    :cond_20
    :goto_16
    iput-object v13, v12, Leu2;->c:[I

    .line 838
    .line 839
    const/16 v0, 0x12

    .line 840
    .line 841
    move-object/from16 v1, v29

    .line 842
    .line 843
    invoke-interface {v1, v0}, Lqi3;->S0(I)Z

    .line 844
    .line 845
    .line 846
    move-result v0

    .line 847
    if-eqz v0, :cond_25

    .line 848
    .line 849
    invoke-interface {v1}, Lqi3;->K0()Ldo2;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    iget-object v2, v0, Ldo2;->a:Ljava/lang/CharSequence;

    .line 854
    .line 855
    invoke-static {v2}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    move-object/from16 v3, v28

    .line 860
    .line 861
    iput-object v2, v3, Ls63;->e:Ljava/lang/CharSequence;

    .line 862
    .line 863
    iget-object v2, v0, Ldo2;->b:Ljava/lang/CharSequence;

    .line 864
    .line 865
    invoke-static {v2}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    iput-object v2, v3, Ls63;->f:Ljava/lang/CharSequence;

    .line 870
    .line 871
    move-object/from16 v2, v30

    .line 872
    .line 873
    iget-object v4, v2, Ltn2;->m:Lx7;

    .line 874
    .line 875
    move-object/from16 v6, v27

    .line 876
    .line 877
    iget-object v8, v6, Lyl0;->g:Lxc5;

    .line 878
    .line 879
    if-eqz v8, :cond_21

    .line 880
    .line 881
    iget-object v8, v6, Lyl0;->f:Lx7;

    .line 882
    .line 883
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v8

    .line 887
    if-nez v8, :cond_22

    .line 888
    .line 889
    :cond_21
    iput-object v4, v6, Lyl0;->f:Lx7;

    .line 890
    .line 891
    new-instance v8, Lxc5;

    .line 892
    .line 893
    new-instance v9, Lx7;

    .line 894
    .line 895
    sget-object v10, Lyl0;->h:Lgo4;

    .line 896
    .line 897
    invoke-interface {v10}, Lgo4;->get()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v10

    .line 901
    check-cast v10, Ljava/lang/Integer;

    .line 902
    .line 903
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 904
    .line 905
    .line 906
    move-result v10

    .line 907
    const/16 v11, 0xc

    .line 908
    .line 909
    invoke-direct {v9, v10, v11, v4}, Lx7;-><init>(IILjava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    const/4 v4, 0x4

    .line 913
    invoke-direct {v8, v4, v9}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    iput-object v8, v6, Lyl0;->g:Lxc5;

    .line 917
    .line 918
    :cond_22
    iget-object v4, v6, Lyl0;->g:Lxc5;

    .line 919
    .line 920
    invoke-virtual {v4, v0}, Lxc5;->i(Ldo2;)Lic2;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    if-eqz v0, :cond_26

    .line 925
    .line 926
    iget-object v4, v6, Lyl0;->d:Lmf4;

    .line 927
    .line 928
    if-eqz v4, :cond_23

    .line 929
    .line 930
    const/4 v15, 0x1

    .line 931
    iput-boolean v15, v4, Lmf4;->o:Z

    .line 932
    .line 933
    :cond_23
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 934
    .line 935
    .line 936
    move-result v4

    .line 937
    if-eqz v4, :cond_24

    .line 938
    .line 939
    :try_start_3
    invoke-static {v0}, Lhw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v0

    .line 943
    check-cast v0, Landroid/graphics/Bitmap;

    .line 944
    .line 945
    invoke-virtual {v3, v0}, Ls63;->d(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1

    .line 946
    .line 947
    .line 948
    goto :goto_18

    .line 949
    :catch_1
    move-exception v0

    .line 950
    goto :goto_17

    .line 951
    :catch_2
    move-exception v0

    .line 952
    :goto_17
    new-instance v4, Ljava/lang/StringBuilder;

    .line 953
    .line 954
    const-string v8, "Failed to load bitmap: "

    .line 955
    .line 956
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    const-string v4, "NotificationProvider"

    .line 971
    .line 972
    invoke-static {v4, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    goto :goto_18

    .line 976
    :cond_24
    new-instance v4, Lmf4;

    .line 977
    .line 978
    move-object/from16 v8, v26

    .line 979
    .line 980
    invoke-direct {v4, v3, v8}, Lmf4;-><init>(Ls63;Lvl2;)V

    .line 981
    .line 982
    .line 983
    iput-object v4, v6, Lyl0;->d:Lmf4;

    .line 984
    .line 985
    iget-object v8, v2, Ltn2;->l:Landroid/os/Handler;

    .line 986
    .line 987
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    new-instance v9, Lym;

    .line 991
    .line 992
    const/4 v15, 0x1

    .line 993
    invoke-direct {v9, v8, v15}, Lym;-><init>(Landroid/os/Handler;I)V

    .line 994
    .line 995
    .line 996
    new-instance v8, Llg1;

    .line 997
    .line 998
    const/4 v10, 0x0

    .line 999
    invoke-direct {v8, v10, v0, v4}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-interface {v0, v8, v9}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1003
    .line 1004
    .line 1005
    goto :goto_18

    .line 1006
    :cond_25
    move-object/from16 v6, v27

    .line 1007
    .line 1008
    move-object/from16 v3, v28

    .line 1009
    .line 1010
    move-object/from16 v2, v30

    .line 1011
    .line 1012
    :cond_26
    :goto_18
    invoke-interface {v1}, Lqi3;->h0()Z

    .line 1013
    .line 1014
    .line 1015
    move-result v0

    .line 1016
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    if-eqz v0, :cond_27

    .line 1022
    .line 1023
    invoke-interface {v1}, Lqi3;->k()Z

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    if-nez v0, :cond_27

    .line 1028
    .line 1029
    invoke-interface {v1}, Lqi3;->T0()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v0

    .line 1033
    if-nez v0, :cond_27

    .line 1034
    .line 1035
    invoke-interface {v1}, Lqi3;->i()Lqh3;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    iget v0, v0, Lqh3;->a:F

    .line 1040
    .line 1041
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1042
    .line 1043
    cmpl-float v0, v0, v4

    .line 1044
    .line 1045
    if-nez v0, :cond_27

    .line 1046
    .line 1047
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1048
    .line 1049
    .line 1050
    move-result-wide v10

    .line 1051
    invoke-interface {v1}, Lqi3;->Z()J

    .line 1052
    .line 1053
    .line 1054
    move-result-wide v0

    .line 1055
    sub-long/2addr v10, v0

    .line 1056
    goto :goto_19

    .line 1057
    :cond_27
    move-wide v10, v8

    .line 1058
    :goto_19
    cmp-long v0, v10, v8

    .line 1059
    .line 1060
    if-eqz v0, :cond_28

    .line 1061
    .line 1062
    const/4 v15, 0x1

    .line 1063
    goto :goto_1a

    .line 1064
    :cond_28
    const/4 v15, 0x0

    .line 1065
    :goto_1a
    if-eqz v15, :cond_29

    .line 1066
    .line 1067
    goto :goto_1b

    .line 1068
    :cond_29
    const-wide/16 v10, 0x0

    .line 1069
    .line 1070
    :goto_1b
    iget-object v0, v3, Ls63;->v:Landroid/app/Notification;

    .line 1071
    .line 1072
    iput-wide v10, v0, Landroid/app/Notification;->when:J

    .line 1073
    .line 1074
    iput-boolean v15, v3, Ls63;->j:Z

    .line 1075
    .line 1076
    iput-boolean v15, v3, Ls63;->k:Z

    .line 1077
    .line 1078
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1079
    .line 1080
    const/16 v4, 0x1f

    .line 1081
    .line 1082
    const/4 v15, 0x1

    .line 1083
    if-lt v1, v4, :cond_2a

    .line 1084
    .line 1085
    iput v15, v3, Ls63;->t:I

    .line 1086
    .line 1087
    :cond_2a
    iget-object v1, v2, Ltn2;->t:Landroid/app/PendingIntent;

    .line 1088
    .line 1089
    iput-object v1, v3, Ls63;->g:Landroid/app/PendingIntent;

    .line 1090
    .line 1091
    const/16 v1, 0x56

    .line 1092
    .line 1093
    invoke-virtual {v5, v7, v1}, Lx7;->b(Lkn2;I)Landroid/content/Intent;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v2

    .line 1097
    const-string v4, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 1098
    .line 1099
    invoke-virtual {v2, v4, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    iget-object v4, v5, Lx7;->p:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v4, Landroidx/media3/session/MediaLibraryService;

    .line 1106
    .line 1107
    const/high16 v9, 0x4000000

    .line 1108
    .line 1109
    invoke-static {v4, v1, v2, v9}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    iput-object v1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 1114
    .line 1115
    const/16 v1, 0x8

    .line 1116
    .line 1117
    invoke-virtual {v3, v1, v15}, Ls63;->c(IZ)V

    .line 1118
    .line 1119
    .line 1120
    iget v1, v6, Lyl0;->e:I

    .line 1121
    .line 1122
    iput v1, v0, Landroid/app/Notification;->icon:I

    .line 1123
    .line 1124
    invoke-virtual {v3, v12}, Ls63;->e(Lrp;)V

    .line 1125
    .line 1126
    .line 1127
    iput v15, v3, Ls63;->r:I

    .line 1128
    .line 1129
    const/4 v1, 0x0

    .line 1130
    const/4 v2, 0x2

    .line 1131
    invoke-virtual {v3, v2, v1}, Ls63;->c(IZ)V

    .line 1132
    .line 1133
    .line 1134
    const-string v0, "media3_group_key"

    .line 1135
    .line 1136
    iput-object v0, v3, Ls63;->o:Ljava/lang/String;

    .line 1137
    .line 1138
    invoke-virtual {v3}, Ls63;->a()Landroid/app/Notification;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    new-instance v8, Lrm2;

    .line 1143
    .line 1144
    invoke-direct {v8, v0}, Lrm2;-><init>(Landroid/app/Notification;)V

    .line 1145
    .line 1146
    .line 1147
    move-object/from16 v6, v25

    .line 1148
    .line 1149
    iget-object v0, v6, Llo2;->r:Lh41;

    .line 1150
    .line 1151
    new-instance v5, Lb41;

    .line 1152
    .line 1153
    const/4 v10, 0x2

    .line 1154
    move-object/from16 v1, p0

    .line 1155
    .line 1156
    iget-boolean v9, v1, Lio2;->o:Z

    .line 1157
    .line 1158
    invoke-direct/range {v5 .. v10}, Lb41;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v0, v5}, Lh41;->execute(Ljava/lang/Runnable;)V

    .line 1162
    .line 1163
    .line 1164
    return-void

    .line 1165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
