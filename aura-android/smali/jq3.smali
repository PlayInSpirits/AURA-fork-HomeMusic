.class public final synthetic Ljq3;
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

    .line 10
    iput p1, p0, Ljq3;->n:I

    iput-object p2, p0, Ljq3;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lhh3;Lk03;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Ljq3;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ljq3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Ljq3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    iget-object p0, p0, Ljq3;->o:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lj55;

    .line 13
    .line 14
    iget-object v0, p0, Lg55;->n:Landroid/view/Choreographer;

    .line 15
    .line 16
    invoke-static {v0, p0}, Li55;->b(Landroid/view/Choreographer;Landroid/view/Choreographer$VsyncCallback;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    check-cast p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 21
    .line 22
    sget-object v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a0:[I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->l()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    check-cast p0, Lsj4;

    .line 29
    .line 30
    iget-object v0, p0, Lsj4;->u:Landroid/view/Surface;

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v1, p0, Lsj4;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ld41;

    .line 51
    .line 52
    iget-object v3, v3, Ld41;->n:Li41;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Li41;->t1(Landroid/view/Surface;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v1, p0, Lsj4;->t:Landroid/graphics/SurfaceTexture;

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/graphics/SurfaceTexture;->release()V

    .line 63
    .line 64
    .line 65
    :cond_1
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 68
    .line 69
    .line 70
    :cond_2
    iput-object v2, p0, Lsj4;->t:Landroid/graphics/SurfaceTexture;

    .line 71
    .line 72
    iput-object v2, p0, Lsj4;->u:Landroid/view/Surface;

    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_2
    check-cast p0, Lo7;

    .line 76
    .line 77
    iget-object p0, p0, Lo7;->b:Landroid/widget/Filterable;

    .line 78
    .line 79
    check-cast p0, Lni4;

    .line 80
    .line 81
    iget-object v0, p0, Lni4;->z:Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-ltz v1, :cond_3

    .line 104
    .line 105
    iget-object v2, p0, Lni4;->v:Lpk;

    .line 106
    .line 107
    iget-object v2, v2, Lpk;->f:Ljava/util/List;

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-ge v1, v2, :cond_3

    .line 114
    .line 115
    const-string v2, "payload_playback"

    .line 116
    .line 117
    invoke-virtual {p0, v1, v2}, Ldw3;->e(ILjava/lang/Comparable;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    return-void

    .line 122
    :pswitch_3
    check-cast p0, Lyf4;

    .line 123
    .line 124
    iget-boolean v0, p0, Lyf4;->f:Z

    .line 125
    .line 126
    if-eqz v0, :cond_b

    .line 127
    .line 128
    iget-boolean v1, p0, Lyf4;->g:Z

    .line 129
    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    const-wide/16 v5, 0x0

    .line 134
    .line 135
    if-eqz v0, :cond_7

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    iget-wide v0, p0, Lyf4;->e:J

    .line 141
    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    move-result-wide v7

    .line 146
    sub-long/2addr v0, v7

    .line 147
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v0

    .line 151
    goto :goto_3

    .line 152
    :cond_7
    :goto_2
    move-wide v0, v5

    .line 153
    :goto_3
    cmp-long v0, v0, v5

    .line 154
    .line 155
    if-gtz v0, :cond_9

    .line 156
    .line 157
    iput-boolean v4, p0, Lyf4;->f:Z

    .line 158
    .line 159
    iput-object v2, p0, Lyf4;->b:Ljq3;

    .line 160
    .line 161
    invoke-static {}, Lyf4;->b()V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, Lyf4;->h:Lvj3;

    .line 165
    .line 166
    if-eqz v0, :cond_8

    .line 167
    .line 168
    iget-object v0, v0, Lvj3;->a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 169
    .line 170
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 171
    .line 172
    .line 173
    :cond_8
    iget-object p0, p0, Lyf4;->i:Lzh0;

    .line 174
    .line 175
    if-eqz p0, :cond_b

    .line 176
    .line 177
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iget-object p0, p0, Lzh0;->o:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Lcom/eddyizm/tempus/service/MediaService;

    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    new-array v1, v3, [F

    .line 194
    .line 195
    const/high16 v2, 0x3f800000    # 1.0f

    .line 196
    .line 197
    aput v2, v1, v4

    .line 198
    .line 199
    iput-boolean v4, v0, Lyf4;->c:Z

    .line 200
    .line 201
    new-instance v2, Lpb0;

    .line 202
    .line 203
    const/4 v3, 0x6

    .line 204
    invoke-direct {v2, v0, p0, v1, v3}, Lpb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    iget-object p0, v0, Lyf4;->a:Landroid/os/Handler;

    .line 208
    .line 209
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_9
    iget-object v0, p0, Lyf4;->h:Lvj3;

    .line 214
    .line 215
    if-eqz v0, :cond_a

    .line 216
    .line 217
    iget-object v0, v0, Lvj3;->a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 220
    .line 221
    .line 222
    :cond_a
    new-instance v0, Ljq3;

    .line 223
    .line 224
    const/16 v1, 0x8

    .line 225
    .line 226
    invoke-direct {v0, v1, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    iput-object v0, p0, Lyf4;->b:Ljq3;

    .line 230
    .line 231
    iget-object p0, p0, Lyf4;->a:Landroid/os/Handler;

    .line 232
    .line 233
    const-wide/16 v1, 0x3e8

    .line 234
    .line 235
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 236
    .line 237
    .line 238
    :cond_b
    :goto_4
    return-void

    .line 239
    :pswitch_4
    check-cast p0, Lbk;

    .line 240
    .line 241
    iput-boolean v4, p0, Lbk;->p:Z

    .line 242
    .line 243
    iget-object v0, p0, Lbk;->r:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 246
    .line 247
    iget-object v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->v:Lo65;

    .line 248
    .line 249
    if-eqz v2, :cond_c

    .line 250
    .line 251
    invoke-virtual {v2}, Lo65;->g()Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_c

    .line 256
    .line 257
    iget v0, p0, Lbk;->o:I

    .line 258
    .line 259
    invoke-virtual {p0, v0}, Lbk;->c(I)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_c
    iget v2, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:I

    .line 264
    .line 265
    if-ne v2, v1, :cond_d

    .line 266
    .line 267
    iget p0, p0, Lbk;->o:I

    .line 268
    .line 269
    invoke-virtual {v0, p0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 270
    .line 271
    .line 272
    :cond_d
    :goto_5
    return-void

    .line 273
    :pswitch_5
    check-cast p0, Lyk;

    .line 274
    .line 275
    invoke-virtual {p0}, Lyk;->a()V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_6
    check-cast p0, Lt24;

    .line 280
    .line 281
    iget v0, p0, Lad2;->c:I

    .line 282
    .line 283
    if-lez v0, :cond_e

    .line 284
    .line 285
    move v0, v3

    .line 286
    goto :goto_6

    .line 287
    :cond_e
    move v0, v4

    .line 288
    :goto_6
    iget-object v5, p0, Lt24;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 289
    .line 290
    invoke-virtual {v5, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_f

    .line 295
    .line 296
    if-eqz v0, :cond_f

    .line 297
    .line 298
    iget-object v0, p0, Lt24;->l:Ls24;

    .line 299
    .line 300
    invoke-virtual {v0}, Ls24;->h()Lwe0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    iget-object v3, p0, Lt24;->r:Lne0;

    .line 305
    .line 306
    new-instance v5, Lx24;

    .line 307
    .line 308
    invoke-direct {v5, p0, v2, v4}, Lx24;-><init>(Lt24;Lvd0;I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v0, v3, v2, v5, v1}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 312
    .line 313
    .line 314
    :cond_f
    return-void

    .line 315
    :pswitch_7
    check-cast p0, Lgn2;

    .line 316
    .line 317
    :try_start_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-eqz v0, :cond_10

    .line 322
    .line 323
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    goto :goto_7

    .line 328
    :catchall_0
    move-exception v0

    .line 329
    goto/16 :goto_f

    .line 330
    .line 331
    :cond_10
    :goto_7
    if-eqz v2, :cond_11

    .line 332
    .line 333
    move v0, v3

    .line 334
    goto :goto_8

    .line 335
    :cond_11
    move v0, v4

    .line 336
    :goto_8
    const-string v1, "Context must be provided if MediaSource.Factory is not set."

    .line 337
    .line 338
    invoke-static {v1, v0}, Lrr2;->v(Ljava/lang/String;Z)V

    .line 339
    .line 340
    .line 341
    new-instance v0, Lsk0;

    .line 342
    .line 343
    invoke-direct {v0}, Lsk0;-><init>()V

    .line 344
    .line 345
    .line 346
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 347
    const/16 v1, 0x104

    .line 348
    .line 349
    :try_start_1
    iput v1, v0, Lsk0;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 350
    .line 351
    :try_start_2
    monitor-exit v0

    .line 352
    new-instance v1, Ldm0;

    .line 353
    .line 354
    invoke-direct {v1, v2, v0}, Ldm0;-><init>(Landroid/content/Context;Lsk0;)V

    .line 355
    .line 356
    .line 357
    new-instance v0, Lhw2;

    .line 358
    .line 359
    invoke-direct {v0, p0, v1}, Lhw2;-><init>(Lgn2;Ldm0;)V

    .line 360
    .line 361
    .line 362
    new-instance v1, Law2;

    .line 363
    .line 364
    invoke-direct {v1, v0}, Law2;-><init>(Lhw2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 365
    .line 366
    .line 367
    :try_start_3
    invoke-virtual {v1}, Law2;->b()Ln0;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 372
    .line 373
    const-wide/16 v5, 0x14

    .line 374
    .line 375
    invoke-virtual {v0, v5, v6, v2}, Lu0;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Ltv4;

    .line 380
    .line 381
    new-instance v2, Ljava/util/ArrayList;

    .line 382
    .line 383
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 384
    .line 385
    .line 386
    if-nez v0, :cond_12

    .line 387
    .line 388
    goto :goto_b

    .line 389
    :cond_12
    move v5, v4

    .line 390
    :goto_9
    iget v6, v0, Ltv4;->a:I

    .line 391
    .line 392
    if-ge v5, v6, :cond_15

    .line 393
    .line 394
    invoke-virtual {v0, v5}, Ltv4;->a(I)Lsv4;

    .line 395
    .line 396
    .line 397
    move-result-object v6

    .line 398
    move v7, v4

    .line 399
    :goto_a
    iget v8, v6, Lsv4;->a:I

    .line 400
    .line 401
    if-ge v7, v8, :cond_14

    .line 402
    .line 403
    iget-object v8, v6, Lsv4;->d:[Ltb1;

    .line 404
    .line 405
    aget-object v8, v8, v7

    .line 406
    .line 407
    iget-object v8, v8, Ltb1;->l:Lqv2;

    .line 408
    .line 409
    if-eqz v8, :cond_13

    .line 410
    .line 411
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 415
    .line 416
    goto :goto_a

    .line 417
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 418
    .line 419
    goto :goto_9

    .line 420
    :cond_15
    :goto_b
    invoke-static {v2}, Ljz3;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v0}, Ljz3;->m(Ljava/util/List;)F

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    const/4 v5, 0x0

    .line 429
    cmpl-float v2, v2, v5

    .line 430
    .line 431
    if-nez v2, :cond_17

    .line 432
    .line 433
    invoke-static {v0}, Ljz3;->j(Ljava/util/List;)F

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    cmpl-float v2, v2, v5

    .line 438
    .line 439
    if-eqz v2, :cond_16

    .line 440
    .line 441
    goto :goto_c

    .line 442
    :cond_16
    move v3, v4

    .line 443
    goto :goto_c

    .line 444
    :catchall_1
    move-exception v0

    .line 445
    goto :goto_d

    .line 446
    :cond_17
    :goto_c
    if-eqz v3, :cond_18

    .line 447
    .line 448
    sget-object v2, Ljz3;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 449
    .line 450
    iget-object v4, p0, Lgn2;->a:Ljava/lang/String;

    .line 451
    .line 452
    invoke-virtual {v2, v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    :cond_18
    const-string v2, "ReplayGainUtil"

    .line 456
    .line 457
    new-instance v4, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 460
    .line 461
    .line 462
    const-string v5, "Prefetched "

    .line 463
    .line 464
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    iget-object v5, p0, Lgn2;->a:Ljava/lang/String;

    .line 468
    .line 469
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    const-string v5, " trackGain="

    .line 473
    .line 474
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-static {v0}, Ljz3;->m(Ljava/util/List;)F

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    const-string v5, " valid="

    .line 485
    .line 486
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 497
    .line 498
    .line 499
    sget-object v2, Ljz3;->g:Landroid/os/Handler;

    .line 500
    .line 501
    new-instance v3, Lur2;

    .line 502
    .line 503
    const/16 v4, 0x12

    .line 504
    .line 505
    invoke-direct {v3, v4, p0, v0}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 509
    .line 510
    .line 511
    :try_start_4
    invoke-virtual {v1}, Law2;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 512
    .line 513
    .line 514
    goto :goto_10

    .line 515
    :goto_d
    :try_start_5
    invoke-virtual {v1}, Law2;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 516
    .line 517
    .line 518
    goto :goto_e

    .line 519
    :catchall_2
    move-exception v1

    .line 520
    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 521
    .line 522
    .line 523
    :goto_e
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 524
    :catchall_3
    move-exception v1

    .line 525
    :try_start_7
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 526
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 527
    :goto_f
    const-string v1, "ReplayGainUtil"

    .line 528
    .line 529
    new-instance v2, Ljava/lang/StringBuilder;

    .line 530
    .line 531
    const-string v3, "Prefetch failed for "

    .line 532
    .line 533
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    iget-object v3, p0, Lgn2;->a:Ljava/lang/String;

    .line 537
    .line 538
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    const-string v3, ": "

    .line 542
    .line 543
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 554
    .line 555
    .line 556
    sget-object v0, Ljz3;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 557
    .line 558
    iget-object p0, p0, Lgn2;->a:Ljava/lang/String;

    .line 559
    .line 560
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    :goto_10
    return-void

    .line 564
    :pswitch_8
    check-cast p0, Ljava/util/List;

    .line 565
    .line 566
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->z()Lc12;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    iget-object v1, v1, Lc12;->o:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v1, Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 577
    .line 578
    new-instance v2, Lor1;

    .line 579
    .line 580
    const/16 v5, 0x1b

    .line 581
    .line 582
    invoke-direct {v2, v5}, Lor1;-><init>(I)V

    .line 583
    .line 584
    .line 585
    invoke-static {v1, v4, v3, v2}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    new-instance v1, Lhu3;

    .line 593
    .line 594
    invoke-direct {v1, v3}, Lhu3;-><init>(I)V

    .line 595
    .line 596
    .line 597
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    check-cast p0, Ljava/util/List;

    .line 610
    .line 611
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->z()Lc12;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    iget-object v1, v0, Lc12;->o:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v1, Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 618
    .line 619
    new-instance v2, Lo;

    .line 620
    .line 621
    const/16 v5, 0xd

    .line 622
    .line 623
    invoke-direct {v2, v5, v0, p0}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    invoke-static {v1, v4, v3, v2}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    :cond_19
    :goto_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 634
    .line 635
    .line 636
    move-result v0

    .line 637
    if-eqz v0, :cond_1a

    .line 638
    .line 639
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    check-cast v0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 644
    .line 645
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v1

    .line 649
    if-eqz v1, :cond_19

    .line 650
    .line 651
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    if-nez v1, :cond_19

    .line 660
    .line 661
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    invoke-static {v1, v0}, Lxt3;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    goto :goto_11

    .line 673
    :cond_1a
    return-void

    .line 674
    :pswitch_9
    check-cast p0, Lk03;

    .line 675
    .line 676
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->z()Lc12;

    .line 681
    .line 682
    .line 683
    move-result-object v0

    .line 684
    iget-object v0, v0, Lc12;->o:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast v0, Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 687
    .line 688
    new-instance v2, Lor1;

    .line 689
    .line 690
    const/16 v5, 0x19

    .line 691
    .line 692
    invoke-direct {v2, v5}, Lor1;-><init>(I)V

    .line 693
    .line 694
    .line 695
    invoke-static {v0, v3, v4, v2}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    check-cast v0, Ljava/util/List;

    .line 700
    .line 701
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    new-instance v2, Lhu3;

    .line 706
    .line 707
    invoke-direct {v2, v4}, Lhu3;-><init>(I)V

    .line 708
    .line 709
    .line 710
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    check-cast v0, Ljava/util/List;

    .line 723
    .line 724
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 725
    .line 726
    .line 727
    move-result v2

    .line 728
    if-nez v2, :cond_1b

    .line 729
    .line 730
    new-instance v2, Lhu3;

    .line 731
    .line 732
    invoke-direct {v2, v1}, Lhu3;-><init>(I)V

    .line 733
    .line 734
    .line 735
    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 736
    .line 737
    invoke-static {v2, v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 738
    .line 739
    .line 740
    move-result-object v1

    .line 741
    invoke-interface {v0, v1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {p0, v0}, Lad2;->i(Ljava/lang/Object;)V

    .line 745
    .line 746
    .line 747
    :cond_1b
    return-void

    .line 748
    :pswitch_a
    check-cast p0, Lns3;

    .line 749
    .line 750
    iget-object p0, p0, Lns3;->o:Ljava/lang/Object;

    .line 751
    .line 752
    check-cast p0, Ls24;

    .line 753
    .line 754
    new-instance v0, Lk52;

    .line 755
    .line 756
    const/16 v1, 0x1d

    .line 757
    .line 758
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 759
    .line 760
    .line 761
    invoke-static {p0, v4, v3, v0}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    return-void

    .line 765
    :pswitch_b
    check-cast p0, Llq3;

    .line 766
    .line 767
    iget-object v0, p0, Llq3;->s:Lea2;

    .line 768
    .line 769
    iget v1, p0, Llq3;->o:I

    .line 770
    .line 771
    if-nez v1, :cond_1c

    .line 772
    .line 773
    iput-boolean v3, p0, Llq3;->p:Z

    .line 774
    .line 775
    sget-object v1, Lq92;->ON_PAUSE:Lq92;

    .line 776
    .line 777
    invoke-virtual {v0, v1}, Lea2;->d(Lq92;)V

    .line 778
    .line 779
    .line 780
    :cond_1c
    iget v1, p0, Llq3;->n:I

    .line 781
    .line 782
    if-nez v1, :cond_1d

    .line 783
    .line 784
    iget-boolean v1, p0, Llq3;->p:Z

    .line 785
    .line 786
    if-eqz v1, :cond_1d

    .line 787
    .line 788
    sget-object v1, Lq92;->ON_STOP:Lq92;

    .line 789
    .line 790
    invoke-virtual {v0, v1}, Lea2;->d(Lq92;)V

    .line 791
    .line 792
    .line 793
    iput-boolean v3, p0, Llq3;->q:Z

    .line 794
    .line 795
    :cond_1d
    return-void

    .line 796
    nop

    .line 797
    :pswitch_data_0
    .packed-switch 0x0
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
