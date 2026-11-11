.class public final synthetic Lkl3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lkl3;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lkl3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lkl3;->n:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, Lkl3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v2, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, Llu2;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lj15;->a:Lj15;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    check-cast v0, Lwf1;

    .line 23
    .line 24
    sget-object v2, Lp35;->a:Lhd5;

    .line 25
    .line 26
    check-cast v1, Lvd;

    .line 27
    .line 28
    iget-object v3, v1, Lvd;->e:Lzd3;

    .line 29
    .line 30
    invoke-virtual {v3}, Lzd3;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v2, v2, Lhd5;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lif1;

    .line 37
    .line 38
    iget-object v1, v1, Lvd;->f:Lce;

    .line 39
    .line 40
    invoke-interface {v2, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v0, v3, v1}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v0, Lj15;->a:Lj15;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_1
    check-cast v0, Lpp3;

    .line 51
    .line 52
    iget-object v2, v0, Lpp3;->h:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v2

    .line 55
    :try_start_0
    iget-object v0, v0, Lpp3;->j:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lsh4;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Lsh4;->b:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget v4, v0, Lsh4;->d:I

    .line 68
    .line 69
    iget-object v5, v0, Lsh4;->c:Lp03;

    .line 70
    .line 71
    if-nez v5, :cond_0

    .line 72
    .line 73
    new-instance v5, Lp03;

    .line 74
    .line 75
    invoke-direct {v5}, Lp03;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v5, v0, Lsh4;->c:Lp03;

    .line 79
    .line 80
    iget-object v6, v0, Lsh4;->f:Lw03;

    .line 81
    .line 82
    invoke-virtual {v6, v3, v5}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    invoke-virtual {v0, v1, v4, v3, v5}, Lsh4;->b(Ljava/lang/Object;ILjava/lang/Object;Lp03;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    monitor-exit v2

    .line 89
    sget-object v0, Lj15;->a:Lj15;

    .line 90
    .line 91
    return-object v0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    monitor-exit v2

    .line 94
    throw v0

    .line 95
    :pswitch_2
    check-cast v0, Ljf4;

    .line 96
    .line 97
    iget-object v2, v0, Ljf4;->f:Ly94;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v3, v0, Ljf4;->f:Ly94;

    .line 103
    .line 104
    invoke-static {v3, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_1

    .line 109
    .line 110
    const-string v2, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 111
    .line 112
    invoke-static {v2}, Loo3;->b(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_1
    iget-object v2, v0, Ljf4;->e:Lx03;

    .line 116
    .line 117
    iget-object v3, v0, Ljf4;->c:Ljava/lang/Object;

    .line 118
    .line 119
    if-nez v2, :cond_3

    .line 120
    .line 121
    if-nez v3, :cond_2

    .line 122
    .line 123
    iput-object v1, v0, Ljf4;->c:Ljava/lang/Object;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    sget-object v2, Lw54;->a:Lx03;

    .line 127
    .line 128
    new-instance v2, Lx03;

    .line 129
    .line 130
    invoke-direct {v2}, Lx03;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2, v3}, Lx03;->a(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v1}, Lx03;->a(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    iput-object v2, v0, Ljf4;->e:Lx03;

    .line 140
    .line 141
    iput-object v4, v0, Ljf4;->c:Ljava/lang/Object;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    if-nez v3, :cond_4

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    const-string v0, "workingSoleWatchedObject must be null when workingWatchSet is non-null"

    .line 148
    .line 149
    invoke-static {v0}, Loo3;->b(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_0
    invoke-virtual {v2, v1}, Lx03;->a(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :goto_1
    sget-object v0, Lj15;->a:Lj15;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_3
    check-cast v0, Lwe4;

    .line 159
    .line 160
    check-cast v1, Lb24;

    .line 161
    .line 162
    iget v2, v0, Lwe4;->B:F

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Lb24;->c(F)V

    .line 165
    .line 166
    .line 167
    iget v2, v0, Lwe4;->C:F

    .line 168
    .line 169
    invoke-virtual {v1, v2}, Lb24;->e(F)V

    .line 170
    .line 171
    .line 172
    iget v2, v0, Lwe4;->D:F

    .line 173
    .line 174
    invoke-virtual {v1, v2}, Lb24;->b(F)V

    .line 175
    .line 176
    .line 177
    iget v2, v0, Lwe4;->E:F

    .line 178
    .line 179
    iget v3, v1, Lb24;->t:F

    .line 180
    .line 181
    cmpg-float v3, v3, v2

    .line 182
    .line 183
    if-nez v3, :cond_5

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_5
    iget v3, v1, Lb24;->n:I

    .line 187
    .line 188
    or-int/lit16 v3, v3, 0x800

    .line 189
    .line 190
    iput v3, v1, Lb24;->n:I

    .line 191
    .line 192
    iput v2, v1, Lb24;->t:F

    .line 193
    .line 194
    :goto_2
    iget-wide v2, v0, Lwe4;->F:J

    .line 195
    .line 196
    iget-wide v4, v1, Lb24;->u:J

    .line 197
    .line 198
    sget v6, Ltw4;->b:I

    .line 199
    .line 200
    cmp-long v4, v4, v2

    .line 201
    .line 202
    if-nez v4, :cond_6

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    iget v4, v1, Lb24;->n:I

    .line 206
    .line 207
    or-int/lit16 v4, v4, 0x1000

    .line 208
    .line 209
    iput v4, v1, Lb24;->n:I

    .line 210
    .line 211
    iput-wide v2, v1, Lb24;->u:J

    .line 212
    .line 213
    :goto_3
    iget-object v2, v0, Lwe4;->G:Lac4;

    .line 214
    .line 215
    iget-object v3, v1, Lb24;->v:Lac4;

    .line 216
    .line 217
    invoke-static {v3, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    if-nez v3, :cond_7

    .line 222
    .line 223
    iget v3, v1, Lb24;->n:I

    .line 224
    .line 225
    or-int/lit16 v3, v3, 0x2000

    .line 226
    .line 227
    iput v3, v1, Lb24;->n:I

    .line 228
    .line 229
    iput-object v2, v1, Lb24;->v:Lac4;

    .line 230
    .line 231
    :cond_7
    iget-boolean v2, v0, Lwe4;->H:Z

    .line 232
    .line 233
    iget-boolean v3, v1, Lb24;->w:Z

    .line 234
    .line 235
    if-eq v3, v2, :cond_8

    .line 236
    .line 237
    iget v3, v1, Lb24;->n:I

    .line 238
    .line 239
    or-int/lit16 v3, v3, 0x4000

    .line 240
    .line 241
    iput v3, v1, Lb24;->n:I

    .line 242
    .line 243
    iput-boolean v2, v1, Lb24;->w:Z

    .line 244
    .line 245
    :cond_8
    iget-wide v2, v0, Lwe4;->I:J

    .line 246
    .line 247
    iget-wide v4, v1, Lb24;->r:J

    .line 248
    .line 249
    invoke-static {v4, v5, v2, v3}, Lx40;->c(JJ)Z

    .line 250
    .line 251
    .line 252
    move-result v4

    .line 253
    if-nez v4, :cond_9

    .line 254
    .line 255
    iget v4, v1, Lb24;->n:I

    .line 256
    .line 257
    or-int/lit8 v4, v4, 0x40

    .line 258
    .line 259
    iput v4, v1, Lb24;->n:I

    .line 260
    .line 261
    iput-wide v2, v1, Lb24;->r:J

    .line 262
    .line 263
    :cond_9
    iget-wide v2, v0, Lwe4;->J:J

    .line 264
    .line 265
    iget-wide v4, v1, Lb24;->s:J

    .line 266
    .line 267
    invoke-static {v4, v5, v2, v3}, Lx40;->c(JJ)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-nez v4, :cond_a

    .line 272
    .line 273
    iget v4, v1, Lb24;->n:I

    .line 274
    .line 275
    or-int/lit16 v4, v4, 0x80

    .line 276
    .line 277
    iput v4, v1, Lb24;->n:I

    .line 278
    .line 279
    iput-wide v2, v1, Lb24;->s:J

    .line 280
    .line 281
    :cond_a
    iget v2, v0, Lwe4;->K:I

    .line 282
    .line 283
    iget v3, v1, Lb24;->B:I

    .line 284
    .line 285
    if-ne v3, v2, :cond_b

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_b
    iget v3, v1, Lb24;->n:I

    .line 289
    .line 290
    const/high16 v4, 0x80000

    .line 291
    .line 292
    or-int/2addr v3, v4

    .line 293
    iput v3, v1, Lb24;->n:I

    .line 294
    .line 295
    iput v2, v1, Lb24;->B:I

    .line 296
    .line 297
    :goto_4
    iget-object v0, v0, Lwe4;->L:Lm62;

    .line 298
    .line 299
    iget-object v2, v1, Lb24;->y:Lm62;

    .line 300
    .line 301
    invoke-static {v2, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-nez v2, :cond_c

    .line 306
    .line 307
    iget v2, v1, Lb24;->n:I

    .line 308
    .line 309
    const/high16 v3, 0x100000

    .line 310
    .line 311
    or-int/2addr v2, v3

    .line 312
    iput v2, v1, Lb24;->n:I

    .line 313
    .line 314
    iput-object v0, v1, Lb24;->y:Lm62;

    .line 315
    .line 316
    :cond_c
    sget-object v0, Lj15;->a:Lj15;

    .line 317
    .line 318
    return-object v0

    .line 319
    :pswitch_4
    check-cast v0, Lt5;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Lt5;->invoke()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    return-object v0

    .line 329
    :pswitch_5
    check-cast v0, Lv82;

    .line 330
    .line 331
    check-cast v1, Ljava/util/List;

    .line 332
    .line 333
    invoke-virtual {v0}, Lv82;->invoke()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    check-cast v0, Ljava/lang/Float;

    .line 338
    .line 339
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    return-object v0

    .line 347
    :pswitch_6
    check-cast v0, Lg74;

    .line 348
    .line 349
    check-cast v1, Lg83;

    .line 350
    .line 351
    iget-object v2, v0, Lg74;->k:Lq64;

    .line 352
    .line 353
    iget-wide v3, v1, Lg83;->a:J

    .line 354
    .line 355
    iget v1, v0, Lg74;->j:I

    .line 356
    .line 357
    invoke-virtual {v0, v2, v3, v4, v1}, Lg74;->d(Lq64;JI)J

    .line 358
    .line 359
    .line 360
    move-result-wide v0

    .line 361
    new-instance v2, Lg83;

    .line 362
    .line 363
    invoke-direct {v2, v0, v1}, Lg83;-><init>(J)V

    .line 364
    .line 365
    .line 366
    return-object v2

    .line 367
    :pswitch_7
    check-cast v0, Lw44;

    .line 368
    .line 369
    iget-object v0, v0, Lw44;->p:Lx44;

    .line 370
    .line 371
    if-eqz v0, :cond_d

    .line 372
    .line 373
    invoke-interface {v0, v1}, Lx44;->b(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    :cond_d
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    return-object v0

    .line 382
    :pswitch_8
    check-cast v0, Ls24;

    .line 383
    .line 384
    check-cast v1, Lli0;

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v1}, Ls24;->f(Lli0;)Lso4;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    return-object v0

    .line 394
    :pswitch_9
    check-cast v0, Lp24;

    .line 395
    .line 396
    check-cast v1, Lwe1;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iput-object v1, v0, Lp24;->g:Lwe1;

    .line 402
    .line 403
    sget-object v0, Lj15;->a:Lj15;

    .line 404
    .line 405
    return-object v0

    .line 406
    :pswitch_a
    check-cast v0, Ltv3;

    .line 407
    .line 408
    check-cast v1, Ljava/lang/Throwable;

    .line 409
    .line 410
    const-string v2, "Recomposer effect job completed"

    .line 411
    .line 412
    new-instance v3, Ljava/util/concurrent/CancellationException;

    .line 413
    .line 414
    invoke-direct {v3, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 418
    .line 419
    .line 420
    iget-object v2, v0, Ltv3;->c:Ljava/lang/Object;

    .line 421
    .line 422
    monitor-enter v2

    .line 423
    :try_start_1
    iget-object v5, v0, Ltv3;->d:Ls22;

    .line 424
    .line 425
    if-eqz v5, :cond_e

    .line 426
    .line 427
    iget-object v6, v0, Ltv3;->u:Lnl4;

    .line 428
    .line 429
    sget-object v7, Lov3;->o:Lov3;

    .line 430
    .line 431
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v6, v4, v7}, Lnl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    invoke-interface {v5, v3}, Ls22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 438
    .line 439
    .line 440
    iput-object v4, v0, Ltv3;->r:Lcz;

    .line 441
    .line 442
    new-instance v3, Lo;

    .line 443
    .line 444
    const/16 v4, 0x1a

    .line 445
    .line 446
    invoke-direct {v3, v4, v0, v1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    invoke-interface {v5, v3}, Ls22;->M(Lif1;)Las0;

    .line 450
    .line 451
    .line 452
    goto :goto_5

    .line 453
    :catchall_1
    move-exception v0

    .line 454
    goto :goto_6

    .line 455
    :cond_e
    iput-object v3, v0, Ltv3;->e:Ljava/lang/Throwable;

    .line 456
    .line 457
    iget-object v0, v0, Ltv3;->u:Lnl4;

    .line 458
    .line 459
    sget-object v1, Lov3;->n:Lov3;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v4, v1}, Lnl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 465
    .line 466
    .line 467
    :goto_5
    monitor-exit v2

    .line 468
    sget-object v0, Lj15;->a:Lj15;

    .line 469
    .line 470
    return-object v0

    .line 471
    :goto_6
    monitor-exit v2

    .line 472
    throw v0

    .line 473
    :pswitch_b
    check-cast v0, Lz80;

    .line 474
    .line 475
    invoke-virtual {v0, v1}, Lz80;->y(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    sget-object v0, Lj15;->a:Lj15;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_c
    check-cast v0, Lml3;

    .line 482
    .line 483
    check-cast v1, Lx34;

    .line 484
    .line 485
    iget-object v2, v0, Lml3;->c:Ljava/lang/Object;

    .line 486
    .line 487
    const-string v2, "SELECT * FROM playlist"

    .line 488
    .line 489
    invoke-interface {v1, v2}, Lx34;->U(Ljava/lang/String;)Lz34;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    :try_start_2
    const-string v2, "id"

    .line 494
    .line 495
    invoke-static {v1, v2}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 496
    .line 497
    .line 498
    move-result v2

    .line 499
    const-string v5, "name"

    .line 500
    .line 501
    invoke-static {v1, v5}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    const-string v6, "duration"

    .line 506
    .line 507
    invoke-static {v1, v6}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    const-string v7, "coverArt"

    .line 512
    .line 513
    invoke-static {v1, v7}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 514
    .line 515
    .line 516
    move-result v7

    .line 517
    const-string v8, "comment"

    .line 518
    .line 519
    invoke-static {v1, v8}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 520
    .line 521
    .line 522
    move-result v8

    .line 523
    const-string v9, "owner"

    .line 524
    .line 525
    invoke-static {v1, v9}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 526
    .line 527
    .line 528
    move-result v9

    .line 529
    const-string v10, "isUniversal"

    .line 530
    .line 531
    invoke-static {v1, v10}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 532
    .line 533
    .line 534
    move-result v10

    .line 535
    const-string v11, "songCount"

    .line 536
    .line 537
    invoke-static {v1, v11}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    const-string v12, "created"

    .line 542
    .line 543
    invoke-static {v1, v12}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v12

    .line 547
    const-string v13, "changed"

    .line 548
    .line 549
    invoke-static {v1, v13}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 550
    .line 551
    .line 552
    move-result v13

    .line 553
    const-string v14, "lastPlayed"

    .line 554
    .line 555
    invoke-static {v1, v14}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 556
    .line 557
    .line 558
    move-result v14

    .line 559
    const-string v15, "allowedUsers"

    .line 560
    .line 561
    invoke-static {v1, v15}, Lrr2;->E(Lz34;Ljava/lang/String;)I

    .line 562
    .line 563
    .line 564
    move-result v15

    .line 565
    new-instance v3, Ljava/util/ArrayList;

    .line 566
    .line 567
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 568
    .line 569
    .line 570
    :goto_7
    invoke-interface {v1}, Lz34;->O()Z

    .line 571
    .line 572
    .line 573
    move-result v16

    .line 574
    if-eqz v16, :cond_1a

    .line 575
    .line 576
    invoke-interface {v1, v2}, Lz34;->isNull(I)Z

    .line 577
    .line 578
    .line 579
    move-result v16

    .line 580
    if-eqz v16, :cond_f

    .line 581
    .line 582
    move-object/from16 v18, v4

    .line 583
    .line 584
    goto :goto_8

    .line 585
    :cond_f
    invoke-interface {v1, v2}, Lz34;->D(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v16

    .line 589
    move-object/from16 v18, v16

    .line 590
    .line 591
    :goto_8
    invoke-interface {v1, v5}, Lz34;->isNull(I)Z

    .line 592
    .line 593
    .line 594
    move-result v16

    .line 595
    if-eqz v16, :cond_10

    .line 596
    .line 597
    move-object/from16 v19, v4

    .line 598
    .line 599
    goto :goto_9

    .line 600
    :cond_10
    invoke-interface {v1, v5}, Lz34;->D(I)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v16

    .line 604
    move-object/from16 v19, v16

    .line 605
    .line 606
    :goto_9
    invoke-interface {v1, v6}, Lz34;->getLong(I)J

    .line 607
    .line 608
    .line 609
    move-result-wide v20

    .line 610
    invoke-interface {v1, v7}, Lz34;->isNull(I)Z

    .line 611
    .line 612
    .line 613
    move-result v16

    .line 614
    if-eqz v16, :cond_11

    .line 615
    .line 616
    move-object/from16 v22, v4

    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_11
    invoke-interface {v1, v7}, Lz34;->D(I)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v16

    .line 623
    move-object/from16 v22, v16

    .line 624
    .line 625
    :goto_a
    new-instance v17, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 626
    .line 627
    invoke-direct/range {v17 .. v22}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 628
    .line 629
    .line 630
    move-object/from16 v4, v17

    .line 631
    .line 632
    invoke-interface {v1, v8}, Lz34;->isNull(I)Z

    .line 633
    .line 634
    .line 635
    move-result v17

    .line 636
    if-eqz v17, :cond_12

    .line 637
    .line 638
    move/from16 p0, v2

    .line 639
    .line 640
    const/4 v2, 0x0

    .line 641
    goto :goto_b

    .line 642
    :cond_12
    invoke-interface {v1, v8}, Lz34;->D(I)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v17

    .line 646
    move/from16 p0, v2

    .line 647
    .line 648
    move-object/from16 v2, v17

    .line 649
    .line 650
    :goto_b
    invoke-virtual {v4, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setComment(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    invoke-interface {v1, v9}, Lz34;->isNull(I)Z

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    if-eqz v2, :cond_13

    .line 658
    .line 659
    const/4 v2, 0x0

    .line 660
    goto :goto_c

    .line 661
    :cond_13
    invoke-interface {v1, v9}, Lz34;->D(I)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    :goto_c
    invoke-virtual {v4, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setOwner(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    invoke-interface {v1, v10}, Lz34;->isNull(I)Z

    .line 669
    .line 670
    .line 671
    move-result v2

    .line 672
    if-eqz v2, :cond_14

    .line 673
    .line 674
    move/from16 p1, v5

    .line 675
    .line 676
    move v2, v6

    .line 677
    const/4 v5, 0x0

    .line 678
    goto :goto_d

    .line 679
    :cond_14
    move/from16 p1, v5

    .line 680
    .line 681
    move v2, v6

    .line 682
    invoke-interface {v1, v10}, Lz34;->getLong(I)J

    .line 683
    .line 684
    .line 685
    move-result-wide v5

    .line 686
    long-to-int v5, v5

    .line 687
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 688
    .line 689
    .line 690
    move-result-object v5

    .line 691
    :goto_d
    if-nez v5, :cond_15

    .line 692
    .line 693
    const/4 v5, 0x0

    .line 694
    goto :goto_f

    .line 695
    :cond_15
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 696
    .line 697
    .line 698
    move-result v5

    .line 699
    if-eqz v5, :cond_16

    .line 700
    .line 701
    const/4 v5, 0x1

    .line 702
    goto :goto_e

    .line 703
    :cond_16
    const/4 v5, 0x0

    .line 704
    :goto_e
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    :goto_f
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setUniversal(Ljava/lang/Boolean;)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v1, v11}, Lz34;->getLong(I)J

    .line 712
    .line 713
    .line 714
    move-result-wide v5

    .line 715
    long-to-int v5, v5

    .line 716
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setSongCount(I)V

    .line 717
    .line 718
    .line 719
    invoke-interface {v1, v12}, Lz34;->isNull(I)Z

    .line 720
    .line 721
    .line 722
    move-result v5

    .line 723
    if-eqz v5, :cond_17

    .line 724
    .line 725
    const/4 v5, 0x0

    .line 726
    goto :goto_10

    .line 727
    :cond_17
    invoke-interface {v1, v12}, Lz34;->getLong(I)J

    .line 728
    .line 729
    .line 730
    move-result-wide v5

    .line 731
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    :goto_10
    invoke-static {v5}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setCreated(Ljava/util/Date;)V

    .line 740
    .line 741
    .line 742
    invoke-interface {v1, v13}, Lz34;->isNull(I)Z

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    if-eqz v5, :cond_18

    .line 747
    .line 748
    const/4 v5, 0x0

    .line 749
    goto :goto_11

    .line 750
    :cond_18
    invoke-interface {v1, v13}, Lz34;->getLong(I)J

    .line 751
    .line 752
    .line 753
    move-result-wide v5

    .line 754
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 755
    .line 756
    .line 757
    move-result-object v5

    .line 758
    :goto_11
    invoke-static {v5}, Li80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 759
    .line 760
    .line 761
    move-result-object v5

    .line 762
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setChanged(Ljava/util/Date;)V

    .line 763
    .line 764
    .line 765
    invoke-interface {v1, v14}, Lz34;->getLong(I)J

    .line 766
    .line 767
    .line 768
    move-result-wide v5

    .line 769
    invoke-virtual {v4, v5, v6}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setLastPlayed(J)V

    .line 770
    .line 771
    .line 772
    invoke-interface {v1, v15}, Lz34;->isNull(I)Z

    .line 773
    .line 774
    .line 775
    move-result v5

    .line 776
    if-eqz v5, :cond_19

    .line 777
    .line 778
    const/4 v5, 0x0

    .line 779
    goto :goto_12

    .line 780
    :cond_19
    invoke-interface {v1, v15}, Lz34;->D(I)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    :goto_12
    iget-object v6, v0, Lml3;->d:Ljava/lang/Object;

    .line 785
    .line 786
    check-cast v6, Lsi1;

    .line 787
    .line 788
    invoke-virtual {v6, v5}, Lsi1;->E(Ljava/lang/String;)Ljava/util/List;

    .line 789
    .line 790
    .line 791
    move-result-object v5

    .line 792
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setAllowedUsers(Ljava/util/List;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 796
    .line 797
    .line 798
    move/from16 v5, p1

    .line 799
    .line 800
    move v6, v2

    .line 801
    const/4 v4, 0x0

    .line 802
    move/from16 v2, p0

    .line 803
    .line 804
    goto/16 :goto_7

    .line 805
    .line 806
    :catchall_2
    move-exception v0

    .line 807
    goto :goto_13

    .line 808
    :cond_1a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 809
    .line 810
    .line 811
    return-object v3

    .line 812
    :goto_13
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 813
    .line 814
    .line 815
    throw v0

    .line 816
    nop

    .line 817
    :pswitch_data_0
    .packed-switch 0x0
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
