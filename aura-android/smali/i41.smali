.class public final Li41;
.super Lfq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroidx/media3/exoplayer/ExoPlayer;


# instance fields
.field public final A:Ly10;

.field public final B:Ly10;

.field public final C:J

.field public final D:Lc6;

.field public final E:Lw12;

.field public final F:Lyc5;

.field public final G:Lqr2;

.field public final H:Lqr2;

.field public I:I

.field public J:Z

.field public K:I

.field public L:I

.field public M:Z

.field public N:Z

.field public O:Ljx1;

.field public final P:Li74;

.field public Q:Lpd4;

.field public R:Lmi3;

.field public S:Ldo2;

.field public T:Ldo2;

.field public U:Ljava/lang/Object;

.field public V:Landroid/view/Surface;

.field public W:Landroid/view/SurfaceHolder;

.field public X:Z

.field public final Y:I

.field public Z:Lpf4;

.field public a0:Lil;

.field public b0:F

.field public final c:Lew4;

.field public c0:F

.field public final d:Lmi3;

.field public d0:Z

.field public final e:Lq90;

.field public e0:Ljg0;

.field public final f:Landroid/content/Context;

.field public final f0:Z

.field public final g:Li41;

.field public g0:Z

.field public final h:[Lkq;

.field public final h0:I

.field public final i:[Lkq;

.field public i0:Z

.field public final j:Lpn0;

.field public final j0:Lhp0;

.field public final k:Lyp4;

.field public k0:Ls55;

.field public final l:Lu31;

.field public final l0:J

.field public final m:Lq41;

.field public final m0:J

.field public final n:Ltc2;

.field public final n0:J

.field public final o:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public o0:Ldo2;

.field public final p:Lzt4;

.field public p0:Lph3;

.field public final q:Ljava/util/ArrayList;

.field public q0:I

.field public final r:Z

.field public r0:J

.field public final s:Llt2;

.field public final t:Lnj0;

.field public final u:Landroid/os/Looper;

.field public final v:Lcp;

.field public final w:Lvp4;

.field public final x:Ld41;

.field public final y:Le41;

.field public final z:Lll;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, Lhn2;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lo31;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    iget-object v0, v8, Lo31;->h:Landroid/os/Looper;

    .line 6
    .line 7
    iget-object v6, v8, Lo31;->a:Lcom/eddyizm/tempus/service/MediaService;

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, " [AndroidXMedia3/1.9.2] ["

    .line 15
    .line 16
    const-string v4, "Init "

    .line 17
    .line 18
    invoke-direct {v1}, Lfq;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v5, Lq90;

    .line 22
    .line 23
    invoke-direct {v5}, Lq90;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v5, v1, Li41;->e:Lq90;

    .line 27
    .line 28
    :try_start_0
    const-string v5, "ExoPlayerImpl"

    .line 29
    .line 30
    new-instance v9, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    sget-object v3, Lf35;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v3, "]"

    .line 55
    .line 56
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v5, v3}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, v8, Lo31;->b:Lvp4;

    .line 67
    .line 68
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iput-object v4, v1, Li41;->f:Landroid/content/Context;

    .line 73
    .line 74
    new-instance v4, Lnj0;

    .line 75
    .line 76
    invoke-direct {v4, v3}, Lnj0;-><init>(Lvp4;)V

    .line 77
    .line 78
    .line 79
    iput-object v4, v1, Li41;->t:Lnj0;

    .line 80
    .line 81
    iget v4, v8, Lo31;->i:I

    .line 82
    .line 83
    iput v4, v1, Li41;->h0:I

    .line 84
    .line 85
    iget-object v4, v8, Lo31;->j:Lil;

    .line 86
    .line 87
    iput-object v4, v1, Li41;->a0:Lil;

    .line 88
    .line 89
    iget v4, v8, Lo31;->o:I

    .line 90
    .line 91
    iput v4, v1, Li41;->Y:I

    .line 92
    .line 93
    iput-boolean v7, v1, Li41;->d0:Z

    .line 94
    .line 95
    iget-wide v4, v8, Lo31;->x:J

    .line 96
    .line 97
    iput-wide v4, v1, Li41;->C:J

    .line 98
    .line 99
    new-instance v11, Ld41;

    .line 100
    .line 101
    invoke-direct {v11, v1}, Ld41;-><init>(Li41;)V

    .line 102
    .line 103
    .line 104
    iput-object v11, v1, Li41;->x:Ld41;

    .line 105
    .line 106
    new-instance v4, Le41;

    .line 107
    .line 108
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v4, v1, Li41;->y:Le41;

    .line 112
    .line 113
    new-instance v10, Landroid/os/Handler;

    .line 114
    .line 115
    invoke-direct {v10, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 116
    .line 117
    .line 118
    iget-object v4, v8, Lo31;->c:Lgo4;

    .line 119
    .line 120
    invoke-interface {v4}, Lgo4;->get()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    move-object v9, v4

    .line 125
    check-cast v9, Lpm0;

    .line 126
    .line 127
    move-object v12, v11

    .line 128
    move-object v13, v11

    .line 129
    move-object v14, v11

    .line 130
    invoke-virtual/range {v9 .. v14}, Lpm0;->b(Landroid/os/Handler;Lo55;Lqm;Lrs4;Lxv2;)[Lkq;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    iput-object v4, v1, Li41;->h:[Lkq;

    .line 135
    .line 136
    array-length v5, v4

    .line 137
    if-lez v5, :cond_0

    .line 138
    .line 139
    const/4 v5, 0x1

    .line 140
    goto :goto_0

    .line 141
    :cond_0
    move v5, v7

    .line 142
    :goto_0
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 143
    .line 144
    .line 145
    array-length v4, v4

    .line 146
    new-array v4, v4, [Lkq;

    .line 147
    .line 148
    iput-object v4, v1, Li41;->i:[Lkq;

    .line 149
    .line 150
    move v4, v7

    .line 151
    :goto_1
    iget-object v5, v1, Li41;->i:[Lkq;

    .line 152
    .line 153
    array-length v10, v5

    .line 154
    const/4 v11, 0x0

    .line 155
    if-ge v4, v10, :cond_1

    .line 156
    .line 157
    iget-object v10, v1, Li41;->h:[Lkq;

    .line 158
    .line 159
    aget-object v10, v10, v4

    .line 160
    .line 161
    iget v10, v10, Lkq;->o:I

    .line 162
    .line 163
    aput-object v11, v5, v4

    .line 164
    .line 165
    add-int/lit8 v4, v4, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catchall_0
    move-exception v0

    .line 169
    goto/16 :goto_c

    .line 170
    .line 171
    :cond_1
    iget-object v4, v8, Lo31;->e:Ln31;

    .line 172
    .line 173
    invoke-virtual {v4}, Ln31;->get()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    move-object v13, v4

    .line 178
    check-cast v13, Lpn0;

    .line 179
    .line 180
    iput-object v13, v1, Li41;->j:Lpn0;

    .line 181
    .line 182
    iget-object v4, v8, Lo31;->d:Lgo4;

    .line 183
    .line 184
    invoke-interface {v4}, Lgo4;->get()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Llt2;

    .line 189
    .line 190
    iput-object v4, v1, Li41;->s:Llt2;

    .line 191
    .line 192
    iget-object v4, v8, Lo31;->g:Ln31;

    .line 193
    .line 194
    invoke-virtual {v4}, Ln31;->get()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    check-cast v4, Lcp;

    .line 199
    .line 200
    iput-object v4, v1, Li41;->v:Lcp;

    .line 201
    .line 202
    iget-boolean v5, v8, Lo31;->p:Z

    .line 203
    .line 204
    iput-boolean v5, v1, Li41;->r:Z

    .line 205
    .line 206
    iget-object v5, v8, Lo31;->q:Ln84;

    .line 207
    .line 208
    iget-wide v14, v8, Lo31;->s:J

    .line 209
    .line 210
    iput-wide v14, v1, Li41;->l0:J

    .line 211
    .line 212
    iget-wide v14, v8, Lo31;->t:J

    .line 213
    .line 214
    iput-wide v14, v1, Li41;->m0:J

    .line 215
    .line 216
    iget-wide v14, v8, Lo31;->u:J

    .line 217
    .line 218
    iput-wide v14, v1, Li41;->n0:J

    .line 219
    .line 220
    iget-object v10, v8, Lo31;->r:Li74;

    .line 221
    .line 222
    iput-object v10, v1, Li41;->P:Li74;

    .line 223
    .line 224
    iput-object v0, v1, Li41;->u:Landroid/os/Looper;

    .line 225
    .line 226
    iput-object v3, v1, Li41;->w:Lvp4;

    .line 227
    .line 228
    iput-object v1, v1, Li41;->g:Li41;

    .line 229
    .line 230
    new-instance v10, Ltc2;

    .line 231
    .line 232
    new-instance v12, Lu31;

    .line 233
    .line 234
    invoke-direct {v12, v1, v7}, Lu31;-><init>(Li41;I)V

    .line 235
    .line 236
    .line 237
    invoke-direct {v10, v0, v3, v12}, Ltc2;-><init>(Landroid/os/Looper;Lvp4;Lrc2;)V

    .line 238
    .line 239
    .line 240
    iput-object v10, v1, Li41;->n:Ltc2;

    .line 241
    .line 242
    new-instance v10, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 243
    .line 244
    invoke-direct {v10}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 245
    .line 246
    .line 247
    iput-object v10, v1, Li41;->o:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 248
    .line 249
    new-instance v12, Ljava/util/ArrayList;

    .line 250
    .line 251
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 252
    .line 253
    .line 254
    iput-object v12, v1, Li41;->q:Ljava/util/ArrayList;

    .line 255
    .line 256
    new-instance v12, Lpd4;

    .line 257
    .line 258
    invoke-direct {v12}, Lpd4;-><init>()V

    .line 259
    .line 260
    .line 261
    iput-object v12, v1, Li41;->Q:Lpd4;

    .line 262
    .line 263
    new-instance v14, Lew4;

    .line 264
    .line 265
    iget-object v12, v1, Li41;->h:[Lkq;

    .line 266
    .line 267
    array-length v15, v12

    .line 268
    new-array v15, v15, [Ldz3;

    .line 269
    .line 270
    array-length v12, v12

    .line 271
    new-array v12, v12, [Lt41;

    .line 272
    .line 273
    sget-object v7, Ljw4;->b:Ljw4;

    .line 274
    .line 275
    invoke-direct {v14, v15, v12, v7, v11}, Lew4;-><init>([Ldz3;[Lt41;Ljw4;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    iput-object v14, v1, Li41;->c:Lew4;

    .line 279
    .line 280
    new-instance v7, Lzt4;

    .line 281
    .line 282
    invoke-direct {v7}, Lzt4;-><init>()V

    .line 283
    .line 284
    .line 285
    iput-object v7, v1, Li41;->p:Lzt4;

    .line 286
    .line 287
    new-instance v7, Landroid/util/SparseBooleanArray;

    .line 288
    .line 289
    invoke-direct {v7}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 290
    .line 291
    .line 292
    const/16 v12, 0x14

    .line 293
    .line 294
    new-array v12, v12, [I

    .line 295
    .line 296
    fill-array-data v12, :array_0

    .line 297
    .line 298
    .line 299
    array-length v15, v12

    .line 300
    const/4 v11, 0x0

    .line 301
    :goto_2
    if-ge v11, v15, :cond_2

    .line 302
    .line 303
    const/16 v17, 0x1

    .line 304
    .line 305
    aget v9, v12, v11

    .line 306
    .line 307
    const/16 v18, 0x0

    .line 308
    .line 309
    xor-int/lit8 v18, v18, 0x1

    .line 310
    .line 311
    invoke-static/range {v18 .. v18}, Lrr2;->w(Z)V

    .line 312
    .line 313
    .line 314
    move-object/from16 v31, v2

    .line 315
    .line 316
    move/from16 v2, v17

    .line 317
    .line 318
    invoke-virtual {v7, v9, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 319
    .line 320
    .line 321
    add-int/lit8 v11, v11, 0x1

    .line 322
    .line 323
    move-object/from16 v2, v31

    .line 324
    .line 325
    goto :goto_2

    .line 326
    :cond_2
    move-object/from16 v31, v2

    .line 327
    .line 328
    const/4 v2, 0x0

    .line 329
    const/4 v9, 0x1

    .line 330
    xor-int/2addr v2, v9

    .line 331
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 332
    .line 333
    .line 334
    const/16 v2, 0x1d

    .line 335
    .line 336
    invoke-virtual {v7, v2, v9}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 337
    .line 338
    .line 339
    new-instance v2, Lmi3;

    .line 340
    .line 341
    const/4 v11, 0x0

    .line 342
    xor-int/2addr v11, v9

    .line 343
    invoke-static {v11}, Lrr2;->w(Z)V

    .line 344
    .line 345
    .line 346
    new-instance v9, Lw71;

    .line 347
    .line 348
    invoke-direct {v9, v7}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 349
    .line 350
    .line 351
    invoke-direct {v2, v9}, Lmi3;-><init>(Lw71;)V

    .line 352
    .line 353
    .line 354
    iput-object v2, v1, Li41;->d:Lmi3;

    .line 355
    .line 356
    new-instance v2, Landroid/util/SparseBooleanArray;

    .line 357
    .line 358
    invoke-direct {v2}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 359
    .line 360
    .line 361
    const/4 v7, 0x0

    .line 362
    :goto_3
    iget-object v11, v9, Lw71;->a:Landroid/util/SparseBooleanArray;

    .line 363
    .line 364
    invoke-virtual {v11}, Landroid/util/SparseBooleanArray;->size()I

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    if-ge v7, v11, :cond_3

    .line 369
    .line 370
    invoke-virtual {v9, v7}, Lw71;->b(I)I

    .line 371
    .line 372
    .line 373
    move-result v11

    .line 374
    const/4 v12, 0x0

    .line 375
    const/4 v15, 0x1

    .line 376
    xor-int/2addr v12, v15

    .line 377
    invoke-static {v12}, Lrr2;->w(Z)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, v11, v15}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 381
    .line 382
    .line 383
    add-int/lit8 v7, v7, 0x1

    .line 384
    .line 385
    goto :goto_3

    .line 386
    :cond_3
    const/4 v7, 0x0

    .line 387
    const/4 v15, 0x1

    .line 388
    xor-int/2addr v7, v15

    .line 389
    invoke-static {v7}, Lrr2;->w(Z)V

    .line 390
    .line 391
    .line 392
    const/4 v7, 0x4

    .line 393
    invoke-virtual {v2, v7, v15}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 394
    .line 395
    .line 396
    const/4 v9, 0x0

    .line 397
    xor-int/2addr v9, v15

    .line 398
    invoke-static {v9}, Lrr2;->w(Z)V

    .line 399
    .line 400
    .line 401
    const/16 v9, 0xa

    .line 402
    .line 403
    invoke-virtual {v2, v9, v15}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 404
    .line 405
    .line 406
    new-instance v9, Lmi3;

    .line 407
    .line 408
    const/4 v11, 0x0

    .line 409
    xor-int/2addr v11, v15

    .line 410
    invoke-static {v11}, Lrr2;->w(Z)V

    .line 411
    .line 412
    .line 413
    new-instance v11, Lw71;

    .line 414
    .line 415
    invoke-direct {v11, v2}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 416
    .line 417
    .line 418
    invoke-direct {v9, v11}, Lmi3;-><init>(Lw71;)V

    .line 419
    .line 420
    .line 421
    iput-object v9, v1, Li41;->R:Lmi3;

    .line 422
    .line 423
    const/4 v2, 0x0

    .line 424
    invoke-virtual {v3, v0, v2}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    .line 425
    .line 426
    .line 427
    move-result-object v9

    .line 428
    iput-object v9, v1, Li41;->k:Lyp4;

    .line 429
    .line 430
    new-instance v9, Lu31;

    .line 431
    .line 432
    const/4 v15, 0x1

    .line 433
    invoke-direct {v9, v1, v15}, Lu31;-><init>(Li41;I)V

    .line 434
    .line 435
    .line 436
    iput-object v9, v1, Li41;->l:Lu31;

    .line 437
    .line 438
    invoke-static {v14}, Lph3;->k(Lew4;)Lph3;

    .line 439
    .line 440
    .line 441
    move-result-object v11

    .line 442
    iput-object v11, v1, Li41;->p0:Lph3;

    .line 443
    .line 444
    iget-object v11, v1, Li41;->t:Lnj0;

    .line 445
    .line 446
    invoke-virtual {v11, v1, v0}, Lnj0;->c0(Li41;Landroid/os/Looper;)V

    .line 447
    .line 448
    .line 449
    new-instance v11, Lik3;

    .line 450
    .line 451
    iget-object v12, v8, Lo31;->E:Ljava/lang/String;

    .line 452
    .line 453
    invoke-direct {v11, v12}, Lik3;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    move-object/from16 v26, v9

    .line 457
    .line 458
    new-instance v9, Lq41;

    .line 459
    .line 460
    move-object v12, v10

    .line 461
    iget-object v10, v1, Li41;->f:Landroid/content/Context;

    .line 462
    .line 463
    move-object/from16 v27, v11

    .line 464
    .line 465
    iget-object v11, v1, Li41;->h:[Lkq;

    .line 466
    .line 467
    move-object/from16 v16, v12

    .line 468
    .line 469
    iget-object v12, v1, Li41;->i:[Lkq;

    .line 470
    .line 471
    iget-object v2, v8, Lo31;->f:Lgo4;

    .line 472
    .line 473
    invoke-interface {v2}, Lgo4;->get()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    check-cast v2, Lcd2;

    .line 478
    .line 479
    iget v15, v1, Li41;->I:I

    .line 480
    .line 481
    iget-boolean v7, v1, Li41;->J:Z

    .line 482
    .line 483
    move-object/from16 v24, v0

    .line 484
    .line 485
    iget-object v0, v1, Li41;->t:Lnj0;

    .line 486
    .line 487
    move-object/from16 v19, v0

    .line 488
    .line 489
    iget-object v0, v8, Lo31;->v:Lul0;

    .line 490
    .line 491
    move-object/from16 v20, v2

    .line 492
    .line 493
    move-object/from16 v25, v3

    .line 494
    .line 495
    iget-wide v2, v8, Lo31;->w:J

    .line 496
    .line 497
    move-object/from16 v21, v0

    .line 498
    .line 499
    iget-object v0, v1, Li41;->y:Le41;

    .line 500
    .line 501
    move-object/from16 v28, v0

    .line 502
    .line 503
    iget-boolean v0, v8, Lo31;->F:Z

    .line 504
    .line 505
    move/from16 v29, v0

    .line 506
    .line 507
    move-wide/from16 v22, v2

    .line 508
    .line 509
    move/from16 v18, v7

    .line 510
    .line 511
    move/from16 v17, v15

    .line 512
    .line 513
    move-object/from16 v2, v16

    .line 514
    .line 515
    move-object/from16 v15, v20

    .line 516
    .line 517
    const/4 v0, 0x0

    .line 518
    const/4 v7, 0x1

    .line 519
    move-object/from16 v16, v4

    .line 520
    .line 521
    move-object/from16 v20, v5

    .line 522
    .line 523
    invoke-direct/range {v9 .. v29}, Lq41;-><init>(Landroid/content/Context;[Lkq;[Lkq;Lpn0;Lew4;Lcd2;Lcp;IZLnj0;Ln84;Lul0;JLandroid/os/Looper;Lvp4;Lu31;Lik3;Lc55;Z)V

    .line 524
    .line 525
    .line 526
    move-object v10, v6

    .line 527
    move-object v3, v9

    .line 528
    move-object/from16 v4, v16

    .line 529
    .line 530
    move-object/from16 v9, v24

    .line 531
    .line 532
    move-object/from16 v6, v25

    .line 533
    .line 534
    iget-object v11, v3, Lq41;->u:Lyp4;

    .line 535
    .line 536
    iput-object v3, v1, Li41;->m:Lq41;

    .line 537
    .line 538
    iget-object v12, v3, Lq41;->w:Landroid/os/Looper;

    .line 539
    .line 540
    const/high16 v5, 0x3f800000    # 1.0f

    .line 541
    .line 542
    iput v5, v1, Li41;->b0:F

    .line 543
    .line 544
    const/4 v5, 0x0

    .line 545
    iput v5, v1, Li41;->I:I

    .line 546
    .line 547
    sget-object v5, Ldo2;->K:Ldo2;

    .line 548
    .line 549
    iput-object v5, v1, Li41;->S:Ldo2;

    .line 550
    .line 551
    iput-object v5, v1, Li41;->T:Ldo2;

    .line 552
    .line 553
    iput-object v5, v1, Li41;->o0:Ldo2;

    .line 554
    .line 555
    const/4 v13, -0x1

    .line 556
    iput v13, v1, Li41;->q0:I

    .line 557
    .line 558
    sget-object v5, Ljg0;->d:Ljg0;

    .line 559
    .line 560
    iput-object v5, v1, Li41;->e0:Ljg0;

    .line 561
    .line 562
    iput-boolean v7, v1, Li41;->f0:Z

    .line 563
    .line 564
    iget-object v5, v1, Li41;->t:Lnj0;

    .line 565
    .line 566
    invoke-virtual {v1, v5}, Li41;->v(Loi3;)V

    .line 567
    .line 568
    .line 569
    new-instance v5, Landroid/os/Handler;

    .line 570
    .line 571
    invoke-direct {v5, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 572
    .line 573
    .line 574
    iget-object v14, v1, Li41;->t:Lnj0;

    .line 575
    .line 576
    invoke-interface {v4, v5, v14}, Lcp;->L(Landroid/os/Handler;Lnj0;)V

    .line 577
    .line 578
    .line 579
    iget-object v4, v1, Li41;->x:Ld41;

    .line 580
    .line 581
    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 585
    .line 586
    const/16 v15, 0x1f

    .line 587
    .line 588
    if-lt v14, v15, :cond_4

    .line 589
    .line 590
    move-object v2, v1

    .line 591
    :try_start_1
    iget-object v1, v2, Li41;->f:Landroid/content/Context;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 592
    .line 593
    :try_start_2
    iget-boolean v2, v8, Lo31;->C:Z

    .line 594
    .line 595
    iget-object v3, v3, Lq41;->w:Landroid/os/Looper;

    .line 596
    .line 597
    invoke-virtual {v6, v3, v0}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    move-object/from16 v16, v0

    .line 602
    .line 603
    new-instance v0, Lb41;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 604
    .line 605
    const/4 v5, 0x0

    .line 606
    move-object v7, v3

    .line 607
    move-object/from16 v15, v16

    .line 608
    .line 609
    move-object/from16 v4, v27

    .line 610
    .line 611
    move-object/from16 v13, v31

    .line 612
    .line 613
    move-object/from16 v3, p0

    .line 614
    .line 615
    :try_start_3
    invoke-direct/range {v0 .. v5}, Lb41;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 616
    .line 617
    .line 618
    move-object v1, v3

    .line 619
    :try_start_4
    invoke-virtual {v7, v0}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 620
    .line 621
    .line 622
    goto :goto_4

    .line 623
    :catchall_1
    move-exception v0

    .line 624
    move-object v1, v3

    .line 625
    goto/16 :goto_c

    .line 626
    .line 627
    :catchall_2
    move-exception v0

    .line 628
    move-object/from16 v1, p0

    .line 629
    .line 630
    goto/16 :goto_c

    .line 631
    .line 632
    :catchall_3
    move-exception v0

    .line 633
    move-object v1, v2

    .line 634
    goto/16 :goto_c

    .line 635
    .line 636
    :cond_4
    move-object v15, v0

    .line 637
    move-object/from16 v13, v31

    .line 638
    .line 639
    :goto_4
    new-instance v0, Lc6;

    .line 640
    .line 641
    new-instance v2, Lu31;

    .line 642
    .line 643
    const/4 v7, 0x2

    .line 644
    invoke-direct {v2, v1, v7}, Lu31;-><init>(Li41;I)V

    .line 645
    .line 646
    .line 647
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v6, v12, v15}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    iput-object v3, v0, Lc6;->b:Ljava/lang/Object;

    .line 655
    .line 656
    invoke-virtual {v6, v9, v15}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    iput-object v3, v0, Lc6;->c:Ljava/lang/Object;

    .line 661
    .line 662
    iput-object v13, v0, Lc6;->e:Ljava/lang/Object;

    .line 663
    .line 664
    iput-object v13, v0, Lc6;->f:Ljava/lang/Object;

    .line 665
    .line 666
    iput-object v2, v0, Lc6;->d:Ljava/lang/Object;

    .line 667
    .line 668
    iput-object v0, v1, Li41;->D:Lc6;

    .line 669
    .line 670
    new-instance v2, La0;

    .line 671
    .line 672
    const/16 v3, 0x1b

    .line 673
    .line 674
    invoke-direct {v2, v3, v1}, La0;-><init>(ILjava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, v2}, Lc6;->v(Ljava/lang/Runnable;)V

    .line 678
    .line 679
    .line 680
    new-instance v0, Lll;

    .line 681
    .line 682
    iget-object v4, v8, Lo31;->h:Landroid/os/Looper;

    .line 683
    .line 684
    iget-object v5, v1, Li41;->x:Ld41;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 685
    .line 686
    move-object v9, v1

    .line 687
    move-object v2, v10

    .line 688
    move-object v3, v12

    .line 689
    move-object v1, v0

    .line 690
    :try_start_5
    invoke-direct/range {v1 .. v6}, Lll;-><init>(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Looper;Landroid/os/Looper;Ld41;Lvp4;)V

    .line 691
    .line 692
    .line 693
    iput-object v1, v9, Li41;->z:Lll;

    .line 694
    .line 695
    iget-boolean v0, v8, Lo31;->n:Z

    .line 696
    .line 697
    invoke-virtual {v1, v0}, Lll;->l(Z)V

    .line 698
    .line 699
    .line 700
    iget v0, v8, Lo31;->l:I

    .line 701
    .line 702
    iget-boolean v1, v8, Lo31;->m:Z

    .line 703
    .line 704
    if-nez v1, :cond_7

    .line 705
    .line 706
    iget v0, v8, Lo31;->y:I

    .line 707
    .line 708
    const v1, 0x7fffffff

    .line 709
    .line 710
    .line 711
    if-eq v0, v1, :cond_6

    .line 712
    .line 713
    iget v0, v8, Lo31;->z:I

    .line 714
    .line 715
    if-eq v0, v1, :cond_6

    .line 716
    .line 717
    iget v0, v8, Lo31;->A:I

    .line 718
    .line 719
    if-eq v0, v1, :cond_6

    .line 720
    .line 721
    iget v0, v8, Lo31;->B:I

    .line 722
    .line 723
    if-ne v0, v1, :cond_5

    .line 724
    .line 725
    goto :goto_5

    .line 726
    :cond_5
    const/4 v0, 0x1

    .line 727
    goto :goto_6

    .line 728
    :catchall_4
    move-exception v0

    .line 729
    move-object v1, v9

    .line 730
    goto/16 :goto_c

    .line 731
    .line 732
    :cond_6
    :goto_5
    const/4 v0, 0x0

    .line 733
    :cond_7
    :goto_6
    new-instance v1, Ly10;

    .line 734
    .line 735
    const/4 v10, 0x3

    .line 736
    invoke-direct {v1, v2, v3, v6, v10}, Ly10;-><init>(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Looper;Lvp4;I)V

    .line 737
    .line 738
    .line 739
    iput-object v1, v9, Li41;->A:Ly10;

    .line 740
    .line 741
    if-eqz v0, :cond_8

    .line 742
    .line 743
    const/4 v4, 0x1

    .line 744
    goto :goto_7

    .line 745
    :cond_8
    const/4 v4, 0x0

    .line 746
    :goto_7
    iget-boolean v5, v1, Ly10;->b:Z

    .line 747
    .line 748
    if-ne v5, v4, :cond_9

    .line 749
    .line 750
    goto :goto_8

    .line 751
    :cond_9
    iput-boolean v4, v1, Ly10;->b:Z

    .line 752
    .line 753
    iget-boolean v5, v1, Ly10;->c:Z

    .line 754
    .line 755
    invoke-virtual {v1, v4, v5}, Ly10;->h(ZZ)V

    .line 756
    .line 757
    .line 758
    :goto_8
    new-instance v1, Ly10;

    .line 759
    .line 760
    const/4 v4, 0x4

    .line 761
    invoke-direct {v1, v2, v3, v6, v4}, Ly10;-><init>(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Looper;Lvp4;I)V

    .line 762
    .line 763
    .line 764
    iput-object v1, v9, Li41;->B:Ly10;

    .line 765
    .line 766
    if-ne v0, v7, :cond_a

    .line 767
    .line 768
    const/4 v0, 0x1

    .line 769
    goto :goto_9

    .line 770
    :cond_a
    const/4 v0, 0x0

    .line 771
    :goto_9
    iget-boolean v3, v1, Ly10;->b:Z

    .line 772
    .line 773
    if-ne v3, v0, :cond_b

    .line 774
    .line 775
    goto :goto_a

    .line 776
    :cond_b
    iput-boolean v0, v1, Ly10;->b:Z

    .line 777
    .line 778
    iget-boolean v3, v1, Ly10;->c:Z

    .line 779
    .line 780
    invoke-virtual {v1, v0, v3}, Ly10;->i(ZZ)V

    .line 781
    .line 782
    .line 783
    :goto_a
    sget-object v0, Lhp0;->e:Lhp0;

    .line 784
    .line 785
    iput-object v0, v9, Li41;->j0:Lhp0;

    .line 786
    .line 787
    sget-object v0, Ls55;->d:Ls55;

    .line 788
    .line 789
    iput-object v0, v9, Li41;->k0:Ls55;

    .line 790
    .line 791
    sget-object v0, Lpf4;->c:Lpf4;

    .line 792
    .line 793
    iput-object v0, v9, Li41;->Z:Lpf4;

    .line 794
    .line 795
    const/16 v0, 0x22

    .line 796
    .line 797
    if-lt v14, v0, :cond_c

    .line 798
    .line 799
    new-instance v0, Lyc5;

    .line 800
    .line 801
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 802
    .line 803
    .line 804
    iput-object v9, v0, Lyc5;->p:Ljava/lang/Object;

    .line 805
    .line 806
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 807
    .line 808
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    iput-object v1, v0, Lyc5;->n:Ljava/lang/Object;

    .line 812
    .line 813
    new-instance v1, Lg41;

    .line 814
    .line 815
    const/4 v5, 0x0

    .line 816
    invoke-direct {v1, v5, v0}, Lg41;-><init>(ILjava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    iput-object v1, v0, Lyc5;->o:Ljava/lang/Object;

    .line 820
    .line 821
    iget-object v3, v9, Li41;->w:Lvp4;

    .line 822
    .line 823
    iget-object v5, v9, Li41;->u:Landroid/os/Looper;

    .line 824
    .line 825
    invoke-virtual {v3, v5, v15}, Lvp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lyp4;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    new-instance v5, Lh41;

    .line 830
    .line 831
    const/4 v6, 0x0

    .line 832
    invoke-direct {v5, v6, v3}, Lh41;-><init>(ILjava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    invoke-static {v2, v5, v1}, Lbn;->y(Lcom/eddyizm/tempus/service/MediaService;Lh41;Lg41;)V

    .line 836
    .line 837
    .line 838
    move-object v15, v0

    .line 839
    goto :goto_b

    .line 840
    :cond_c
    const/4 v6, 0x0

    .line 841
    :goto_b
    iput-object v15, v9, Li41;->F:Lyc5;

    .line 842
    .line 843
    new-instance v0, Lqr2;

    .line 844
    .line 845
    const/16 v12, 0x8

    .line 846
    .line 847
    invoke-direct {v0, v12}, Lqr2;-><init>(I)V

    .line 848
    .line 849
    .line 850
    iput-object v0, v9, Li41;->G:Lqr2;

    .line 851
    .line 852
    new-instance v0, Lqr2;

    .line 853
    .line 854
    invoke-direct {v0, v12}, Lqr2;-><init>(I)V

    .line 855
    .line 856
    .line 857
    iput-object v0, v9, Li41;->H:Lqr2;

    .line 858
    .line 859
    new-instance v0, Lw12;

    .line 860
    .line 861
    iget-object v2, v9, Li41;->x:Ld41;

    .line 862
    .line 863
    iget-object v3, v9, Li41;->w:Lvp4;

    .line 864
    .line 865
    move/from16 v32, v4

    .line 866
    .line 867
    iget v4, v8, Lo31;->y:I

    .line 868
    .line 869
    iget v5, v8, Lo31;->z:I

    .line 870
    .line 871
    move/from16 v30, v6

    .line 872
    .line 873
    iget v6, v8, Lo31;->A:I

    .line 874
    .line 875
    move v1, v7

    .line 876
    iget v7, v8, Lo31;->B:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 877
    .line 878
    move v14, v1

    .line 879
    move-object v1, v9

    .line 880
    move/from16 v12, v30

    .line 881
    .line 882
    move/from16 v9, v32

    .line 883
    .line 884
    const/4 v15, 0x1

    .line 885
    :try_start_6
    invoke-direct/range {v0 .. v7}, Lw12;-><init>(Li41;Ld41;Lvp4;IIII)V

    .line 886
    .line 887
    .line 888
    iput-object v0, v1, Li41;->E:Lw12;

    .line 889
    .line 890
    iget-object v0, v1, Li41;->P:Li74;

    .line 891
    .line 892
    const/16 v2, 0x26

    .line 893
    .line 894
    invoke-virtual {v11, v2, v0}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    invoke-virtual {v0}, Lxp4;->b()V

    .line 899
    .line 900
    .line 901
    iget-object v0, v1, Li41;->a0:Lil;

    .line 902
    .line 903
    iget-boolean v2, v8, Lo31;->k:Z

    .line 904
    .line 905
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    iget-object v4, v11, Lyp4;->a:Landroid/os/Handler;

    .line 913
    .line 914
    const/16 v5, 0x1f

    .line 915
    .line 916
    invoke-virtual {v4, v5, v2, v12, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    iput-object v0, v3, Lxp4;->a:Landroid/os/Message;

    .line 921
    .line 922
    invoke-virtual {v3}, Lxp4;->b()V

    .line 923
    .line 924
    .line 925
    iget-object v0, v1, Li41;->a0:Lil;

    .line 926
    .line 927
    invoke-virtual {v1, v15, v10, v0}, Li41;->q1(IILjava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    iget v0, v1, Li41;->Y:I

    .line 931
    .line 932
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-virtual {v1, v14, v9, v0}, Li41;->q1(IILjava/lang/Object;)V

    .line 937
    .line 938
    .line 939
    const/4 v0, 0x5

    .line 940
    invoke-virtual {v1, v14, v0, v13}, Li41;->q1(IILjava/lang/Object;)V

    .line 941
    .line 942
    .line 943
    iget-boolean v0, v1, Li41;->d0:Z

    .line 944
    .line 945
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    const/16 v2, 0x9

    .line 950
    .line 951
    invoke-virtual {v1, v15, v2, v0}, Li41;->q1(IILjava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    iget-object v0, v1, Li41;->y:Le41;

    .line 955
    .line 956
    const/4 v2, 0x6

    .line 957
    const/16 v3, 0x8

    .line 958
    .line 959
    invoke-virtual {v1, v2, v3, v0}, Li41;->q1(IILjava/lang/Object;)V

    .line 960
    .line 961
    .line 962
    iget v0, v1, Li41;->h0:I

    .line 963
    .line 964
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    const/16 v2, 0x10

    .line 969
    .line 970
    const/4 v3, -0x1

    .line 971
    invoke-virtual {v1, v3, v2, v0}, Li41;->q1(IILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 972
    .line 973
    .line 974
    iget-object v0, v1, Li41;->e:Lq90;

    .line 975
    .line 976
    invoke-virtual {v0}, Lq90;->d()Z

    .line 977
    .line 978
    .line 979
    return-void

    .line 980
    :goto_c
    iget-object v1, v1, Li41;->e:Lq90;

    .line 981
    .line 982
    invoke-virtual {v1}, Lq90;->d()Z

    .line 983
    .line 984
    .line 985
    throw v0

    .line 986
    nop

    .line 987
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static j1(Lph3;)J
    .locals 6

    .line 1
    new-instance v0, Lbu4;

    .line 2
    .line 3
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lzt4;

    .line 7
    .line 8
    invoke-direct {v1}, Lzt4;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lph3;->a:Lcu4;

    .line 12
    .line 13
    iget-object v3, p0, Lph3;->b:Lmt2;

    .line 14
    .line 15
    iget-object v3, v3, Lmt2;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 18
    .line 19
    .line 20
    iget-wide v2, p0, Lph3;->c:J

    .line 21
    .line 22
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v4, v2, v4

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    iget-object p0, p0, Lph3;->a:Lcu4;

    .line 32
    .line 33
    iget v1, v1, Lzt4;->c:I

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, Lbu4;->k:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_0
    iget-wide v0, v1, Lzt4;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v2

    .line 47
    return-wide v0
.end method

.method public static k1(Lph3;I)Lph3;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lph3;->h(I)Lph3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x4

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object p0

    .line 13
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lph3;->b(Z)Lph3;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final A0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li41;->b0:F

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    cmpl-float v0, v0, v1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Li41;->R(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final B()F
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Li41;->b0:F

    .line 5
    .line 6
    return p0
.end method

.method public final C0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final D()Lil;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->a0:Lil;

    .line 5
    .line 6
    return-object p0
.end method

.method public final D0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Li41;->J:Z

    .line 5
    .line 6
    return p0
.end method

.method public final E(IZ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final E0()Lcw4;
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->j:Lpn0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lpn0;->d()Ljn0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v1, p0, Li41;->N:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v1, Lin0;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Lin0;-><init>(Ljn0;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Li41;->O:Ljx1;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Lin0;->m(Ljava/util/Set;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Ljn0;

    .line 28
    .line 29
    invoke-direct {p0, v1}, Ljn0;-><init>(Lin0;)V

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    return-object v0
.end method

.method public final F()Lhp0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->j0:Lhp0;

    .line 5
    .line 6
    return-object p0
.end method

.method public final F0()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, Li41;->r0:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 18
    .line 19
    iget-object v1, v0, Lph3;->k:Lmt2;

    .line 20
    .line 21
    iget-wide v1, v1, Lmt2;->d:J

    .line 22
    .line 23
    iget-object v3, v0, Lph3;->b:Lmt2;

    .line 24
    .line 25
    iget-wide v3, v3, Lmt2;->d:J

    .line 26
    .line 27
    cmp-long v1, v1, v3

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 32
    .line 33
    invoke-virtual {p0}, Li41;->o0()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-wide v0, p0, Lbu4;->l:J

    .line 46
    .line 47
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0

    .line 52
    :cond_1
    iget-wide v0, v0, Lph3;->q:J

    .line 53
    .line 54
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 55
    .line 56
    iget-object v2, v2, Lph3;->k:Lmt2;

    .line 57
    .line 58
    invoke-virtual {v2}, Lmt2;->b()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 65
    .line 66
    iget-object v1, v0, Lph3;->a:Lcu4;

    .line 67
    .line 68
    iget-object v0, v0, Lph3;->k:Lmt2;

    .line 69
    .line 70
    iget-object v0, v0, Lmt2;->a:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v2, p0, Li41;->p:Lzt4;

    .line 73
    .line 74
    invoke-virtual {v1, v0, v2}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v1, p0, Li41;->p0:Lph3;

    .line 79
    .line 80
    iget-object v1, v1, Lph3;->k:Lmt2;

    .line 81
    .line 82
    iget v1, v1, Lmt2;->b:I

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lzt4;->d(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v1

    .line 88
    const-wide/high16 v3, -0x8000000000000000L

    .line 89
    .line 90
    cmp-long v3, v1, v3

    .line 91
    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    iget-wide v0, v0, Lzt4;->d:J

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move-wide v0, v1

    .line 98
    :cond_3
    :goto_0
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 99
    .line 100
    iget-object v3, v2, Lph3;->a:Lcu4;

    .line 101
    .line 102
    iget-object v2, v2, Lph3;->k:Lmt2;

    .line 103
    .line 104
    iget-object v2, v2, Lmt2;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object p0, p0, Li41;->p:Lzt4;

    .line 107
    .line 108
    invoke-virtual {v3, v2, p0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 109
    .line 110
    .line 111
    iget-wide v2, p0, Lzt4;->e:J

    .line 112
    .line 113
    add-long/2addr v0, v2

    .line 114
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    return-wide v0
.end method

.method public final G()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final G0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final H(II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final J(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final K()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li41;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 11
    .line 12
    iget-object p0, p0, Lph3;->b:Lmt2;

    .line 13
    .line 14
    iget p0, p0, Lmt2;->c:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final K0()Ldo2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->S:Ldo2;

    .line 5
    .line 6
    return-object p0
.end method

.method public final L(IILjava/util/List;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v4, 0x0

    .line 5
    const/4 v5, 0x1

    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    if-lt p2, p1, :cond_0

    .line 9
    .line 10
    move v6, v5

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v6, v4

    .line 13
    :goto_0
    invoke-static {v6}, Lrr2;->l(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v6, p0, Li41;->q:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-le p1, v7, :cond_1

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p2, v7}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    sub-int v7, v2, p1

    .line 30
    .line 31
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eq v7, v8, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v7, p1

    .line 39
    :goto_1
    if-ge v7, v2, :cond_6

    .line 40
    .line 41
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, Lf41;

    .line 46
    .line 47
    iget-object v8, v8, Lf41;->b:Lrg2;

    .line 48
    .line 49
    sub-int v9, v7, p1

    .line 50
    .line 51
    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    check-cast v9, Lgn2;

    .line 56
    .line 57
    iget-object v8, v8, Lbe5;->k:Lbq;

    .line 58
    .line 59
    invoke-virtual {v8, v9}, Lbq;->a(Lgn2;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-nez v8, :cond_5

    .line 64
    .line 65
    :goto_2
    invoke-virtual {p0, p3}, Li41;->c1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v3, p0, Li41;->p0:Lph3;

    .line 70
    .line 71
    iget-object v3, v3, Lph3;->a:Lcu4;

    .line 72
    .line 73
    invoke-virtual {v3}, Lcu4;->p()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    iget v2, p0, Li41;->q0:I

    .line 80
    .line 81
    const/4 v3, -0x1

    .line 82
    if-ne v2, v3, :cond_3

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    move v5, v4

    .line 86
    :goto_3
    invoke-virtual {p0}, Li41;->z1()V

    .line 87
    .line 88
    .line 89
    const/4 v2, -0x1

    .line 90
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    move-object v0, p0

    .line 96
    invoke-virtual/range {v0 .. v5}, Li41;->r1(Ljava/util/ArrayList;IJZ)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    iget-object v3, p0, Li41;->p0:Lph3;

    .line 101
    .line 102
    invoke-virtual {p0, v3, v2, v1}, Li41;->Z0(Lph3;ILjava/util/ArrayList;)Lph3;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {p0, v1, p1, v2}, Li41;->o1(Lph3;II)Lph3;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iget-object v2, v1, Lph3;->b:Lmt2;

    .line 111
    .line 112
    iget-object v2, v2, Lmt2;->a:Ljava/lang/Object;

    .line 113
    .line 114
    iget-object v3, p0, Li41;->p0:Lph3;

    .line 115
    .line 116
    iget-object v3, v3, Lph3;->b:Lmt2;

    .line 117
    .line 118
    iget-object v3, v3, Lmt2;->a:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    xor-int/lit8 v3, v2, 0x1

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Li41;->g1(Lph3;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    const/4 v7, -0x1

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v2, 0x0

    .line 133
    const/4 v4, 0x4

    .line 134
    move-object v0, p0

    .line 135
    invoke-virtual/range {v0 .. v8}, Li41;->x1(Lph3;IZIJIZ)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    iget v1, p0, Li41;->K:I

    .line 143
    .line 144
    add-int/2addr v1, v5

    .line 145
    iput v1, p0, Li41;->K:I

    .line 146
    .line 147
    iget-object v1, p0, Li41;->m:Lq41;

    .line 148
    .line 149
    iget-object v1, v1, Lq41;->u:Lyp4;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    iget-object v1, v1, Lyp4;->a:Landroid/os/Handler;

    .line 159
    .line 160
    const/16 v5, 0x1b

    .line 161
    .line 162
    invoke-virtual {v1, v5, p1, v2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, v4, Lxp4;->a:Landroid/os/Message;

    .line 167
    .line 168
    invoke-virtual {v4}, Lxp4;->b()V

    .line 169
    .line 170
    .line 171
    move v1, p1

    .line 172
    :goto_4
    if-ge v1, v2, :cond_8

    .line 173
    .line 174
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Lf41;

    .line 179
    .line 180
    iget-object v5, v4, Lf41;->c:Lcu4;

    .line 181
    .line 182
    sub-int v7, v1, p1

    .line 183
    .line 184
    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    check-cast v7, Lgn2;

    .line 189
    .line 190
    instance-of v9, v5, Ldu4;

    .line 191
    .line 192
    if-eqz v9, :cond_7

    .line 193
    .line 194
    new-instance v9, Ldu4;

    .line 195
    .line 196
    check-cast v5, Ldu4;

    .line 197
    .line 198
    iget-object v5, v5, Lbc1;->e:Lcu4;

    .line 199
    .line 200
    invoke-direct {v9, v5, v7}, Ldu4;-><init>(Lcu4;Lgn2;)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_7
    new-instance v9, Ldu4;

    .line 205
    .line 206
    invoke-direct {v9, v5, v7}, Ldu4;-><init>(Lcu4;Lgn2;)V

    .line 207
    .line 208
    .line 209
    :goto_5
    iput-object v9, v4, Lf41;->c:Lcu4;

    .line 210
    .line 211
    add-int/lit8 v1, v1, 0x1

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_8
    invoke-virtual {p0}, Li41;->b1()Ltm3;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 219
    .line 220
    invoke-virtual {v2, v1}, Lph3;->j(Lcu4;)Lph3;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    const/4 v7, -0x1

    .line 225
    const/4 v8, 0x0

    .line 226
    const/4 v2, 0x0

    .line 227
    const/4 v3, 0x0

    .line 228
    const/4 v4, 0x4

    .line 229
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    move-object v0, p0

    .line 235
    invoke-virtual/range {v0 .. v8}, Li41;->x1(Lph3;IZIJIZ)V

    .line 236
    .line 237
    .line 238
    return-void
.end method

.method public final L0(Ljava/util/List;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Li41;->c1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Li41;->z1()V

    .line 9
    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    move-object v0, p0

    .line 19
    invoke-virtual/range {v0 .. v5}, Li41;->r1(Ljava/util/ArrayList;IJZ)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final M(Lcw4;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->j:Lpn0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Li41;->E0()Lcw4;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-boolean v2, p0, Li41;->N:Z

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    iget-object v2, p1, Lcw4;->I:Ljx1;

    .line 18
    .line 19
    iput-object v2, p0, Li41;->O:Ljx1;

    .line 20
    .line 21
    iget-object v2, p0, Li41;->P:Li74;

    .line 22
    .line 23
    iget-object v2, v2, Li74;->a:Ljx1;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcw4;->a()Lbw4;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2}, Lrw1;->h()Lo15;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x1

    .line 50
    invoke-virtual {v3, v4, v5}, Lbw4;->l(IZ)Lbw4;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v3}, Lbw4;->b()Lcw4;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    move-object v2, p1

    .line 60
    :goto_1
    invoke-virtual {v0}, Lpn0;->d()Ljn0;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v2, v3}, Lcw4;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Lpn0;->j(Lcw4;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {v1, p1}, Lcw4;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_3

    .line 78
    .line 79
    new-instance v0, Ly31;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-direct {v0, p1, v1}, Ly31;-><init>(Lcw4;I)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 86
    .line 87
    const/16 p1, 0x13

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Ltc2;->f(ILqc2;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    return-void
.end method

.method public final M0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li41;->g1(Lph3;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public final N0(Ljava/util/List;I)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p0 .. p1}, Li41;->c1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {p0}, Li41;->z1()V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x1

    .line 13
    if-ltz p2, :cond_0

    .line 14
    .line 15
    move v5, v4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v5, v3

    .line 18
    :goto_0
    invoke-static {v5}, Lrr2;->l(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, Li41;->q:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v5, p0, Li41;->p0:Lph3;

    .line 32
    .line 33
    iget-object v5, v5, Lph3;->a:Lcu4;

    .line 34
    .line 35
    invoke-virtual {v5}, Lcu4;->p()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    iget v1, p0, Li41;->q0:I

    .line 42
    .line 43
    const/4 v5, -0x1

    .line 44
    if-ne v1, v5, :cond_1

    .line 45
    .line 46
    move v5, v4

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v5, v3

    .line 49
    :goto_1
    invoke-virtual {p0}, Li41;->z1()V

    .line 50
    .line 51
    .line 52
    move-object v1, v2

    .line 53
    const/4 v2, -0x1

    .line 54
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    move-object v0, p0

    .line 60
    invoke-virtual/range {v0 .. v5}, Li41;->r1(Ljava/util/ArrayList;IJZ)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    iget-object v3, p0, Li41;->p0:Lph3;

    .line 65
    .line 66
    invoke-virtual {p0, v3, v1, v2}, Li41;->Z0(Lph3;ILjava/util/ArrayList;)Lph3;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    const/4 v7, -0x1

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v2, 0x0

    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x5

    .line 75
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    move-object v0, p0

    .line 81
    invoke-virtual/range {v0 .. v8}, Li41;->x1(Lph3;IZIJIZ)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final O0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Li41;->l0:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public final P(II)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    move v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, Lrr2;->l(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Li41;->q:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-ge p1, v1, :cond_2

    .line 26
    .line 27
    if-ne p1, p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object v1, p0, Li41;->p0:Lph3;

    .line 31
    .line 32
    invoke-virtual {p0, v1, p1, p2}, Li41;->o1(Lph3;II)Lph3;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object p1, v3, Lph3;->b:Lmt2;

    .line 37
    .line 38
    iget-object p1, p1, Lmt2;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iget-object p2, p0, Li41;->p0:Lph3;

    .line 41
    .line 42
    iget-object p2, p2, Lph3;->b:Lmt2;

    .line 43
    .line 44
    iget-object p2, p2, Lmt2;->a:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    xor-int/lit8 v5, p1, 0x1

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Li41;->g1(Lph3;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    const/4 v9, -0x1

    .line 57
    const/4 v10, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    const/4 v6, 0x4

    .line 60
    move-object v2, p0

    .line 61
    invoke-virtual/range {v2 .. v10}, Li41;->x1(Lph3;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
.end method

.method public final Q(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Li41;->z1()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Li41;->p1()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Li41;->t1(Landroid/view/Surface;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v1}, Li41;->n1(II)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p0}, Li41;->p1()V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    iput-boolean v2, p0, Li41;->X:Z

    .line 26
    .line 27
    iput-object p1, p0, Li41;->W:Landroid/view/SurfaceHolder;

    .line 28
    .line 29
    iget-object v2, p0, Li41;->x:Ld41;

    .line 30
    .line 31
    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Li41;->t1(Landroid/view/Surface;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0, v0, p1}, Li41;->n1(II)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    invoke-virtual {p0, v0}, Li41;->t1(Landroid/view/Surface;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, v1}, Li41;->n1(II)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final R(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {p1, v1, v0}, Lf35;->i(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Li41;->b0:F

    .line 12
    .line 13
    cmpl-float v2, v0, p1

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    cmpl-float v1, p1, v1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move v0, p1

    .line 23
    :cond_1
    iput v0, p0, Li41;->c0:F

    .line 24
    .line 25
    iput p1, p0, Li41;->b0:F

    .line 26
    .line 27
    iget-object v0, p0, Li41;->m:Lq41;

    .line 28
    .line 29
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lxp4;->b()V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lw31;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {v0, v1, p1}, Lw31;-><init>(IF)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 51
    .line 52
    const/16 p1, 0x16

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, Ltc2;->f(ILqc2;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final T(Ljava/util/List;IJ)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Li41;->c1(Ljava/util/List;)Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p0}, Li41;->z1()V

    .line 9
    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    move-object v0, p0

    .line 13
    move v2, p2

    .line 14
    move-wide v3, p3

    .line 15
    invoke-virtual/range {v0 .. v5}, Li41;->r1(Ljava/util/ArrayList;IJZ)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final U()Landroidx/media3/common/PlaybackException;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object p0, p0, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 7
    .line 8
    return-object p0
.end method

.method public final U0()Landroid/os/Looper;
    .locals 0

    .line 1
    iget-object p0, p0, Li41;->u:Landroid/os/Looper;

    .line 2
    .line 3
    return-object p0
.end method

.method public final V(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0, v0, p1}, Li41;->w1(IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final X()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Li41;->m0:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public final X0(IIJZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne p1, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v3, 0x1

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, Lrr2;->l(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Li41;->p0:Lph3;

    .line 18
    .line 19
    iget-object v4, v4, Lph3;->a:Lcu4;

    .line 20
    .line 21
    invoke-virtual {v4}, Lcu4;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    invoke-virtual {v4}, Lcu4;->o()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-lt p1, v5, :cond_2

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_2
    iget-object v5, p0, Li41;->t:Lnj0;

    .line 35
    .line 36
    iget-boolean v6, v5, Lnj0;->v:Z

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v5}, Lnj0;->W()Lq9;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iput-boolean v3, v5, Lnj0;->v:Z

    .line 45
    .line 46
    new-instance v7, Loi0;

    .line 47
    .line 48
    const/16 v8, 0x14

    .line 49
    .line 50
    invoke-direct {v7, v8}, Loi0;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v6, v2, v7}, Lnj0;->b0(Lq9;ILqc2;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget v2, p0, Li41;->K:I

    .line 57
    .line 58
    add-int/2addr v2, v3

    .line 59
    iput v2, p0, Li41;->K:I

    .line 60
    .line 61
    invoke-virtual {p0}, Li41;->k()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    const-string v1, "ExoPlayerImpl"

    .line 68
    .line 69
    const-string v2, "seekTo ignored because an ad is playing"

    .line 70
    .line 71
    invoke-static {v1, v2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, Ln41;

    .line 75
    .line 76
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 77
    .line 78
    invoke-direct {v1, v2}, Ln41;-><init>(Lph3;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ln41;->e(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Li41;->l:Lu31;

    .line 85
    .line 86
    iget-object v0, v0, Lu31;->o:Li41;

    .line 87
    .line 88
    iget-object v2, v0, Li41;->k:Lyp4;

    .line 89
    .line 90
    new-instance v3, Lk6;

    .line 91
    .line 92
    const/16 v4, 0x18

    .line 93
    .line 94
    invoke-direct {v3, v4, v0, v1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Lyp4;->d(Ljava/lang/Runnable;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 102
    .line 103
    iget v3, v2, Lph3;->e:I

    .line 104
    .line 105
    const/4 v5, 0x3

    .line 106
    if-eq v3, v5, :cond_5

    .line 107
    .line 108
    const/4 v6, 0x4

    .line 109
    if-ne v3, v6, :cond_6

    .line 110
    .line 111
    invoke-virtual {v4}, Lcu4;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_6

    .line 116
    .line 117
    :cond_5
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 118
    .line 119
    const/4 v3, 0x2

    .line 120
    invoke-virtual {v2, v3}, Lph3;->h(I)Lph3;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :cond_6
    invoke-virtual {p0}, Li41;->o0()I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    invoke-virtual {p0, p1, p3, p4, v4}, Li41;->m1(IJLcu4;)Landroid/util/Pair;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {p0, v2, v4, v3}, Li41;->l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-static {p3, p4}, Lf35;->Q(J)J

    .line 137
    .line 138
    .line 139
    move-result-wide v8

    .line 140
    iget-object v3, p0, Li41;->m:Lq41;

    .line 141
    .line 142
    iget-object v3, v3, Lq41;->u:Lyp4;

    .line 143
    .line 144
    new-instance v6, Lp41;

    .line 145
    .line 146
    invoke-direct {v6, p1, v8, v9, v4}, Lp41;-><init>(IJLcu4;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v5, v6}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Lxp4;->b()V

    .line 154
    .line 155
    .line 156
    const/4 v4, 0x1

    .line 157
    invoke-virtual {p0, v2}, Li41;->g1(Lph3;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v5

    .line 161
    move-object v1, v2

    .line 162
    const/4 v2, 0x0

    .line 163
    const/4 v3, 0x1

    .line 164
    move-object v0, p0

    .line 165
    move v8, p5

    .line 166
    invoke-virtual/range {v0 .. v8}, Li41;->x1(Lph3;IZIJIZ)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public final Z()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li41;->f1(Lph3;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public final Z0(Lph3;ILjava/util/ArrayList;)Lph3;
    .locals 9

    .line 1
    iget-object v1, p1, Lph3;->a:Lcu4;

    .line 2
    .line 3
    iget v0, p0, Li41;->K:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    iput v0, p0, Li41;->K:I

    .line 8
    .line 9
    new-instance v6, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    move v0, v8

    .line 16
    :goto_0
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v0, v2, :cond_0

    .line 21
    .line 22
    new-instance v2, Lbu2;

    .line 23
    .line 24
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lbq;

    .line 29
    .line 30
    iget-boolean v4, p0, Li41;->r:Z

    .line 31
    .line 32
    invoke-direct {v2, v3, v4}, Lbu2;-><init>(Lbq;Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    add-int v3, v0, p2

    .line 39
    .line 40
    new-instance v4, Lf41;

    .line 41
    .line 42
    iget-object v5, v2, Lbu2;->b:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v2, v2, Lbu2;->a:Lrg2;

    .line 45
    .line 46
    invoke-direct {v4, v5, v2}, Lf41;-><init>(Ljava/lang/Object;Lrg2;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Li41;->q:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v2, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v0, v0, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object p3, p0, Li41;->Q:Lpd4;

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p3, p2, v0}, Lpd4;->a(II)Lpd4;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    iput-object p3, p0, Li41;->Q:Lpd4;

    .line 68
    .line 69
    invoke-virtual {p0}, Li41;->b1()Ltm3;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {p0, p1}, Li41;->h1(Lph3;)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {p0, p1}, Li41;->f1(Lph3;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    move-object v0, p0

    .line 82
    invoke-virtual/range {v0 .. v5}, Li41;->i1(Lcu4;Ltm3;IJ)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v0, p1, v2, p0}, Li41;->l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iget-object v4, v0, Li41;->Q:Lpd4;

    .line 91
    .line 92
    iget-object p1, v0, Li41;->m:Lq41;

    .line 93
    .line 94
    iget-object p1, p1, Lq41;->u:Lyp4;

    .line 95
    .line 96
    new-instance v2, Ll41;

    .line 97
    .line 98
    const/4 v5, -0x1

    .line 99
    move-object v3, v6

    .line 100
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    invoke-direct/range {v2 .. v7}, Ll41;-><init>(Ljava/util/ArrayList;Lpd4;IJ)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    iget-object p1, p1, Lyp4;->a:Landroid/os/Handler;

    .line 116
    .line 117
    const/16 v0, 0x12

    .line 118
    .line 119
    invoke-virtual {p1, v0, p2, v8, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p3, Lxp4;->a:Landroid/os/Message;

    .line 124
    .line 125
    invoke-virtual {p3}, Lxp4;->b()V

    .line 126
    .line 127
    .line 128
    return-object p0
.end method

.method public final a0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li41;->b0:F

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    cmpl-float v0, v0, v1

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Li41;->c0:F

    .line 12
    .line 13
    cmpl-float v1, v0, v1

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Li41;->R(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final a1()Ldo2;
    .locals 5

    .line 1
    invoke-virtual {p0}, Li41;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Li41;->o0:Ldo2;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Li41;->o0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lfq;->b:Lbu4;

    .line 19
    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3, v4}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, Lbu4;->b:Lgn2;

    .line 27
    .line 28
    iget-object p0, p0, Li41;->o0:Ldo2;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldo2;->a()Lco2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object v0, v0, Lgn2;->d:Ldo2;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lco2;->b(Ldo2;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Ldo2;

    .line 40
    .line 41
    invoke-direct {v0, p0}, Ldo2;-><init>(Lco2;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method

.method public final b()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget v1, v0, Lph3;->e:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Lph3;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lph3;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v0, Lph3;->a:Lcu4;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    invoke-static {v0, v1}, Li41;->k1(Lph3;I)Lph3;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v0, p0, Li41;->K:I

    .line 33
    .line 34
    add-int/2addr v0, v2

    .line 35
    iput v0, p0, Li41;->K:I

    .line 36
    .line 37
    iget-object v0, p0, Li41;->m:Lq41;

    .line 38
    .line 39
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 40
    .line 41
    const/16 v1, 0x1d

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lyp4;->a(I)Lxp4;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Lxp4;->b()V

    .line 48
    .line 49
    .line 50
    const/4 v10, -0x1

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v5, 0x1

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x5

    .line 55
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    move-object v3, p0

    .line 61
    invoke-virtual/range {v3 .. v11}, Li41;->x1(Lph3;IZIJIZ)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final b0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li41;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 11
    .line 12
    iget-object v1, v0, Lph3;->k:Lmt2;

    .line 13
    .line 14
    iget-object v0, v0, Lph3;->b:Lmt2;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 23
    .line 24
    iget-wide v0, p0, Lph3;->q:J

    .line 25
    .line 26
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    invoke-virtual {p0}, Li41;->getDuration()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Li41;->F0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
.end method

.method public final b1()Ltm3;
    .locals 2

    .line 1
    new-instance v0, Ltm3;

    .line 2
    .line 3
    iget-object v1, p0, Li41;->q:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, Li41;->Q:Lpd4;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Ltm3;-><init>(Ljava/util/ArrayList;Lpd4;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final c1(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lgn2;

    .line 18
    .line 19
    iget-object v3, p0, Li41;->s:Llt2;

    .line 20
    .line 21
    invoke-interface {v3, v2}, Llt2;->d(Lgn2;)Lbq;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object v0
.end method

.method public final d(Lqh3;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object v0, v0, Lph3;->o:Lqh3;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lph3;->g(Lqh3;)Lph3;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v0, p0, Li41;->K:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, Li41;->K:I

    .line 26
    .line 27
    iget-object v0, p0, Li41;->m:Lq41;

    .line 28
    .line 29
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-virtual {v0, v1, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lxp4;->b()V

    .line 37
    .line 38
    .line 39
    const/4 v8, -0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x5

    .line 44
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    move-object v1, p0

    .line 50
    invoke-virtual/range {v1 .. v9}, Li41;->x1(Lph3;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final d0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d1(Lrk3;)Lsk3;
    .locals 7

    .line 1
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li41;->h1(Lph3;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Lsk3;

    .line 8
    .line 9
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 10
    .line 11
    iget-object v4, v2, Lph3;->a:Lcu4;

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    :cond_0
    move v5, v0

    .line 18
    iget-object v2, p0, Li41;->m:Lq41;

    .line 19
    .line 20
    iget-object v6, v2, Lq41;->w:Landroid/os/Looper;

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    invoke-direct/range {v1 .. v6}, Lsk3;-><init>(Lq41;Lrk3;Lcu4;ILandroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final e0()Ljw4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object p0, p0, Lph3;->i:Lew4;

    .line 7
    .line 8
    iget-object p0, p0, Lew4;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Ljw4;

    .line 11
    .line 12
    return-object p0
.end method

.method public final e1()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->D:Lc6;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lc6;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lyp4;

    .line 16
    .line 17
    iget-object v1, v1, Lyp4;->a:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lc6;->e:Ljava/lang/Object;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget-object v1, p0, Lc6;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lyp4;

    .line 31
    .line 32
    iget-object v1, v1, Lyp4;->a:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-ne v0, v1, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lc6;->f:Ljava/lang/Object;

    .line 47
    .line 48
    :goto_1
    check-cast p0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-boolean p0, p0, Lph3;->g:Z

    .line 7
    .line 8
    return p0
.end method

.method public final f1(Lph3;)J
    .locals 7

    .line 1
    iget-object v0, p1, Lph3;->b:Lmt2;

    .line 2
    .line 3
    iget-wide v1, p1, Lph3;->c:J

    .line 4
    .line 5
    iget-object v3, p1, Lph3;->a:Lcu4;

    .line 6
    .line 7
    invoke-virtual {v0}, Lmt2;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, Lph3;->b:Lmt2;

    .line 14
    .line 15
    iget-object v0, v0, Lmt2;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v4, p0, Li41;->p:Lzt4;

    .line 18
    .line 19
    invoke-virtual {v3, v0, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 20
    .line 21
    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long v0, v1, v5

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Li41;->h1(Lph3;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 36
    .line 37
    const-wide/16 v0, 0x0

    .line 38
    .line 39
    invoke-virtual {v3, p1, p0, v0, v1}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-wide p0, p0, Lbu4;->k:J

    .line 44
    .line 45
    invoke-static {p0, p1}, Lf35;->i0(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p0

    .line 49
    return-wide p0

    .line 50
    :cond_0
    iget-wide p0, v4, Lzt4;->e:J

    .line 51
    .line 52
    invoke-static {p0, p1}, Lf35;->i0(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    invoke-static {v1, v2}, Lf35;->i0(J)J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    add-long/2addr v0, p0

    .line 61
    return-wide v0

    .line 62
    :cond_1
    invoke-virtual {p0, p1}, Li41;->g1(Lph3;)J

    .line 63
    .line 64
    .line 65
    move-result-wide p0

    .line 66
    invoke-static {p0, p1}, Lf35;->i0(J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    return-wide p0
.end method

.method public final g()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget p0, p0, Lph3;->e:I

    .line 7
    .line 8
    return p0
.end method

.method public final g0()Ldo2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->T:Ldo2;

    .line 5
    .line 6
    return-object p0
.end method

.method public final g1(Lph3;)J
    .locals 3

    .line 1
    iget-object v0, p1, Lph3;->a:Lcu4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide p0, p0, Li41;->r0:J

    .line 10
    .line 11
    invoke-static {p0, p1}, Lf35;->Q(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    iget-boolean v0, p1, Lph3;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Lph3;->l()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, Lph3;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, Lph3;->b:Lmt2;

    .line 28
    .line 29
    invoke-virtual {v2}, Lmt2;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, Lph3;->a:Lcu4;

    .line 37
    .line 38
    iget-object p1, p1, Lph3;->b:Lmt2;

    .line 39
    .line 40
    iget-object p1, p1, Lmt2;->a:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object p0, p0, Li41;->p:Lzt4;

    .line 43
    .line 44
    invoke-virtual {v2, p1, p0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 45
    .line 46
    .line 47
    iget-wide p0, p0, Lzt4;->e:J

    .line 48
    .line 49
    add-long/2addr v0, p0

    .line 50
    return-wide v0
.end method

.method public final getDuration()J
    .locals 3

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li41;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 11
    .line 12
    iget-object v1, v0, Lph3;->b:Lmt2;

    .line 13
    .line 14
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 15
    .line 16
    iget-object v2, v1, Lmt2;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p0, p0, Li41;->p:Lzt4;

    .line 19
    .line 20
    invoke-virtual {v0, v2, p0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 21
    .line 22
    .line 23
    iget v0, v1, Lmt2;->b:I

    .line 24
    .line 25
    iget v1, v1, Lmt2;->c:I

    .line 26
    .line 27
    invoke-virtual {p0, v0, v1}, Lzt4;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lfq;->x()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0
.end method

.method public final h()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget p0, p0, Li41;->I:I

    .line 5
    .line 6
    return p0
.end method

.method public final h1(Lph3;)I
    .locals 1

    .line 1
    iget-object v0, p1, Lph3;->a:Lcu4;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p0, p0, Li41;->q0:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    iget-object v0, p1, Lph3;->a:Lcu4;

    .line 13
    .line 14
    iget-object p1, p1, Lph3;->b:Lmt2;

    .line 15
    .line 16
    iget-object p1, p1, Lmt2;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p0, p0, Li41;->p:Lzt4;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p0}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget p0, p0, Lzt4;->c:I

    .line 25
    .line 26
    return p0
.end method

.method public final i()Lqh3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object p0, p0, Lph3;->o:Lqh3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final i0()Ljg0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->e0:Ljg0;

    .line 5
    .line 6
    return-object p0
.end method

.method public final i1(Lcu4;Ltm3;IJ)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, -0x1

    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v7}, Lcu4;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v13, v0, Li41;->p:Lzt4;

    .line 25
    .line 26
    invoke-static/range {p4 .. p5}, Lf35;->Q(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v15

    .line 30
    iget-object v12, v0, Lfq;->b:Lbu4;

    .line 31
    .line 32
    move-object/from16 v11, p1

    .line 33
    .line 34
    move/from16 v14, p3

    .line 35
    .line 36
    invoke-virtual/range {v11 .. v16}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {v7, v5}, Ltm3;->b(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eq v2, v10, :cond_1

    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    iget v3, v0, Li41;->I:I

    .line 50
    .line 51
    iget-boolean v4, v0, Li41;->J:Z

    .line 52
    .line 53
    iget-object v1, v0, Lfq;->b:Lbu4;

    .line 54
    .line 55
    iget-object v2, v0, Li41;->p:Lzt4;

    .line 56
    .line 57
    move-object/from16 v6, p1

    .line 58
    .line 59
    invoke-static/range {v1 .. v7}, Lq41;->U(Lbu4;Lzt4;IZLjava/lang/Object;Lcu4;Lcu4;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v1, v10, :cond_2

    .line 64
    .line 65
    const-wide/16 v2, 0x0

    .line 66
    .line 67
    iget-object v4, v0, Lfq;->b:Lbu4;

    .line 68
    .line 69
    invoke-virtual {v7, v1, v4, v2, v3}, Ltm3;->m(ILbu4;J)Lbu4;

    .line 70
    .line 71
    .line 72
    iget-wide v2, v4, Lbu4;->k:J

    .line 73
    .line 74
    invoke-static {v2, v3}, Lf35;->i0(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v2

    .line 78
    invoke-virtual {v0, v1, v2, v3, v7}, Li41;->m1(IJLcu4;)Landroid/util/Pair;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :cond_2
    invoke-virtual {v0, v10, v8, v9, v7}, Li41;->m1(IJLcu4;)Landroid/util/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0

    .line 88
    :cond_3
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcu4;->p()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-nez v1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v7}, Lcu4;->p()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    const/4 v1, 0x1

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    const/4 v1, 0x0

    .line 103
    :goto_1
    if-eqz v1, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move/from16 v10, p3

    .line 107
    .line 108
    :goto_2
    if-eqz v1, :cond_6

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_6
    move-wide/from16 v8, p4

    .line 112
    .line 113
    :goto_3
    invoke-virtual {v0, v10, v8, v9, v7}, Li41;->m1(IJLcu4;)Landroid/util/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final isScrubbingModeEnabled()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-boolean p0, p0, Li41;->N:Z

    .line 5
    .line 6
    return p0
.end method

.method public final j()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object p0, p0, Lph3;->b:Lmt2;

    .line 7
    .line 8
    invoke-virtual {p0}, Lmt2;->b()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final k0(Lil;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Li41;->i0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Li41;->a0:Lil;

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, Li41;->n:Ltc2;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    iput-object p1, p0, Li41;->a0:Lil;

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    const/4 v3, 0x3

    .line 24
    invoke-virtual {p0, v0, v3, p1}, Li41;->q1(IILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lx31;

    .line 28
    .line 29
    invoke-direct {v0, p1, v1}, Lx31;-><init>(Lil;I)V

    .line 30
    .line 31
    .line 32
    const/16 p1, 0x14

    .line 33
    .line 34
    invoke-virtual {v2, p1, v0}, Ltc2;->c(ILqc2;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Li41;->a0:Lil;

    .line 38
    .line 39
    iget-object p0, p0, Li41;->m:Lq41;

    .line 40
    .line 41
    iget-object p0, p0, Lq41;->u:Lyp4;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object p0, p0, Lyp4;->a:Landroid/os/Handler;

    .line 51
    .line 52
    const/16 v3, 0x1f

    .line 53
    .line 54
    invoke-virtual {p0, v3, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iput-object p0, v0, Lxp4;->a:Landroid/os/Message;

    .line 59
    .line 60
    invoke-virtual {v0}, Lxp4;->b()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ltc2;->b()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final l0(Ldo2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Li41;->T:Ldo2;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ldo2;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-object p1, p0, Li41;->T:Ldo2;

    .line 17
    .line 18
    new-instance p1, Lu31;

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    invoke-direct {p1, p0, v0}, Lu31;-><init>(Li41;I)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 25
    .line 26
    const/16 v0, 0xf

    .line 27
    .line 28
    invoke-virtual {p0, v0, p1}, Ltc2;->f(ILqc2;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v3, v5

    .line 21
    :goto_1
    invoke-static {v3}, Lrr2;->l(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, Lph3;->a:Lcu4;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, Li41;->f1(Lph3;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    invoke-virtual/range {p1 .. p2}, Lph3;->j(Lcu4;)Lph3;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    sget-object v10, Lph3;->u:Lmt2;

    .line 43
    .line 44
    iget-wide v1, v0, Li41;->r0:J

    .line 45
    .line 46
    invoke-static {v1, v2}, Lf35;->Q(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    sget-object v19, Ltv4;->d:Ltv4;

    .line 51
    .line 52
    iget-object v0, v0, Li41;->c:Lew4;

    .line 53
    .line 54
    sget-object v21, Lgy3;->r:Lgy3;

    .line 55
    .line 56
    const-wide/16 v17, 0x0

    .line 57
    .line 58
    move-wide v13, v11

    .line 59
    move-wide v15, v11

    .line 60
    move-object/from16 v20, v0

    .line 61
    .line 62
    invoke-virtual/range {v9 .. v21}, Lph3;->d(Lmt2;JJJJLtv4;Lew4;Ljava/util/List;)Lph3;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, v10}, Lph3;->c(Lmt2;)Lph3;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-wide v1, v0, Lph3;->s:J

    .line 71
    .line 72
    iput-wide v1, v0, Lph3;->q:J

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    iget-object v3, v9, Lph3;->b:Lmt2;

    .line 76
    .line 77
    iget-object v3, v3, Lmt2;->a:Ljava/lang/Object;

    .line 78
    .line 79
    sget-object v10, Lf35;->a:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v10, :cond_3

    .line 88
    .line 89
    new-instance v11, Lmt2;

    .line 90
    .line 91
    iget-object v12, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-direct {v11, v12}, Lmt2;-><init>(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    iget-object v11, v9, Lph3;->b:Lmt2;

    .line 98
    .line 99
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    invoke-static {v7, v8}, Lf35;->Q(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v7

    .line 111
    invoke-virtual {v6}, Lcu4;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    iget-object v2, v0, Li41;->p:Lzt4;

    .line 118
    .line 119
    invoke-virtual {v6, v3, v2}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-wide v14, v2, Lzt4;->e:J

    .line 124
    .line 125
    sub-long/2addr v7, v14

    .line 126
    if-eqz v10, :cond_4

    .line 127
    .line 128
    sub-long v14, v7, v12

    .line 129
    .line 130
    const-wide/16 v16, 0x1

    .line 131
    .line 132
    cmp-long v2, v14, v16

    .line 133
    .line 134
    if-nez v2, :cond_4

    .line 135
    .line 136
    iget-object v2, v0, Li41;->p:Lzt4;

    .line 137
    .line 138
    invoke-virtual {v6, v3, v2}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    iget-wide v2, v2, Lzt4;->d:J

    .line 143
    .line 144
    cmp-long v2, v7, v2

    .line 145
    .line 146
    if-nez v2, :cond_4

    .line 147
    .line 148
    sub-long v7, v7, v16

    .line 149
    .line 150
    :cond_4
    if-eqz v10, :cond_5

    .line 151
    .line 152
    cmp-long v2, v12, v7

    .line 153
    .line 154
    if-gez v2, :cond_6

    .line 155
    .line 156
    :cond_5
    move v1, v10

    .line 157
    move-object v10, v11

    .line 158
    move-wide v11, v12

    .line 159
    goto/16 :goto_6

    .line 160
    .line 161
    :cond_6
    if-nez v2, :cond_a

    .line 162
    .line 163
    iget-object v2, v9, Lph3;->k:Lmt2;

    .line 164
    .line 165
    iget-object v2, v2, Lmt2;->a:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-virtual {v1, v2}, Lcu4;->b(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    const/4 v3, -0x1

    .line 172
    if-eq v2, v3, :cond_8

    .line 173
    .line 174
    iget-object v3, v0, Li41;->p:Lzt4;

    .line 175
    .line 176
    invoke-virtual {v1, v2, v3, v4}, Lcu4;->f(ILzt4;Z)Lzt4;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iget v2, v2, Lzt4;->c:I

    .line 181
    .line 182
    iget-object v3, v11, Lmt2;->a:Ljava/lang/Object;

    .line 183
    .line 184
    iget-object v4, v0, Li41;->p:Lzt4;

    .line 185
    .line 186
    invoke-virtual {v1, v3, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget v3, v3, Lzt4;->c:I

    .line 191
    .line 192
    if-eq v2, v3, :cond_7

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    return-object v9

    .line 196
    :cond_8
    :goto_3
    iget-object v2, v11, Lmt2;->a:Ljava/lang/Object;

    .line 197
    .line 198
    iget-object v3, v0, Li41;->p:Lzt4;

    .line 199
    .line 200
    invoke-virtual {v1, v2, v3}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v11}, Lmt2;->b()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iget-object v0, v0, Li41;->p:Lzt4;

    .line 208
    .line 209
    if-eqz v1, :cond_9

    .line 210
    .line 211
    iget v1, v11, Lmt2;->b:I

    .line 212
    .line 213
    iget v2, v11, Lmt2;->c:I

    .line 214
    .line 215
    invoke-virtual {v0, v1, v2}, Lzt4;->a(II)J

    .line 216
    .line 217
    .line 218
    move-result-wide v0

    .line 219
    :goto_4
    move-object v10, v11

    .line 220
    goto :goto_5

    .line 221
    :cond_9
    iget-wide v0, v0, Lzt4;->d:J

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :goto_5
    iget-wide v11, v9, Lph3;->s:J

    .line 225
    .line 226
    iget-wide v13, v9, Lph3;->s:J

    .line 227
    .line 228
    iget-wide v2, v9, Lph3;->d:J

    .line 229
    .line 230
    iget-wide v4, v9, Lph3;->s:J

    .line 231
    .line 232
    sub-long v17, v0, v4

    .line 233
    .line 234
    iget-object v4, v9, Lph3;->h:Ltv4;

    .line 235
    .line 236
    iget-object v5, v9, Lph3;->i:Lew4;

    .line 237
    .line 238
    iget-object v6, v9, Lph3;->j:Ljava/util/List;

    .line 239
    .line 240
    move-wide v15, v2

    .line 241
    move-object/from16 v19, v4

    .line 242
    .line 243
    move-object/from16 v20, v5

    .line 244
    .line 245
    move-object/from16 v21, v6

    .line 246
    .line 247
    invoke-virtual/range {v9 .. v21}, Lph3;->d(Lmt2;JJJJLtv4;Lew4;Ljava/util/List;)Lph3;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {v2, v10}, Lph3;->c(Lmt2;)Lph3;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    iput-wide v0, v2, Lph3;->q:J

    .line 256
    .line 257
    return-object v2

    .line 258
    :cond_a
    move-object v10, v11

    .line 259
    invoke-virtual {v10}, Lmt2;->b()Z

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    xor-int/2addr v0, v5

    .line 264
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 265
    .line 266
    .line 267
    iget-wide v0, v9, Lph3;->r:J

    .line 268
    .line 269
    sub-long v2, v12, v7

    .line 270
    .line 271
    sub-long/2addr v0, v2

    .line 272
    const-wide/16 v2, 0x0

    .line 273
    .line 274
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 275
    .line 276
    .line 277
    move-result-wide v17

    .line 278
    iget-wide v0, v9, Lph3;->q:J

    .line 279
    .line 280
    iget-object v2, v9, Lph3;->k:Lmt2;

    .line 281
    .line 282
    iget-object v3, v9, Lph3;->b:Lmt2;

    .line 283
    .line 284
    invoke-virtual {v2, v3}, Lmt2;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_b

    .line 289
    .line 290
    add-long v0, v12, v17

    .line 291
    .line 292
    :cond_b
    iget-object v2, v9, Lph3;->h:Ltv4;

    .line 293
    .line 294
    iget-object v3, v9, Lph3;->i:Lew4;

    .line 295
    .line 296
    iget-object v4, v9, Lph3;->j:Ljava/util/List;

    .line 297
    .line 298
    move-wide v11, v12

    .line 299
    move-wide v13, v11

    .line 300
    move-wide v15, v11

    .line 301
    move-object/from16 v19, v2

    .line 302
    .line 303
    move-object/from16 v20, v3

    .line 304
    .line 305
    move-object/from16 v21, v4

    .line 306
    .line 307
    invoke-virtual/range {v9 .. v21}, Lph3;->d(Lmt2;JJJJLtv4;Lew4;Ljava/util/List;)Lph3;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    iput-wide v0, v2, Lph3;->q:J

    .line 312
    .line 313
    return-object v2

    .line 314
    :goto_6
    invoke-virtual {v10}, Lmt2;->b()Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    xor-int/2addr v2, v5

    .line 319
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 320
    .line 321
    .line 322
    if-nez v1, :cond_c

    .line 323
    .line 324
    sget-object v2, Ltv4;->d:Ltv4;

    .line 325
    .line 326
    :goto_7
    move-object/from16 v19, v2

    .line 327
    .line 328
    goto :goto_8

    .line 329
    :cond_c
    iget-object v2, v9, Lph3;->h:Ltv4;

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :goto_8
    if-nez v1, :cond_d

    .line 333
    .line 334
    iget-object v0, v0, Li41;->c:Lew4;

    .line 335
    .line 336
    :goto_9
    move-object/from16 v20, v0

    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_d
    iget-object v0, v9, Lph3;->i:Lew4;

    .line 340
    .line 341
    goto :goto_9

    .line 342
    :goto_a
    if-nez v1, :cond_e

    .line 343
    .line 344
    sget-object v0, Lyw1;->o:Lvw1;

    .line 345
    .line 346
    sget-object v0, Lgy3;->r:Lgy3;

    .line 347
    .line 348
    :goto_b
    move-object/from16 v21, v0

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :cond_e
    iget-object v0, v9, Lph3;->j:Ljava/util/List;

    .line 352
    .line 353
    goto :goto_b

    .line 354
    :goto_c
    const-wide/16 v17, 0x0

    .line 355
    .line 356
    move-wide v13, v11

    .line 357
    move-wide v15, v11

    .line 358
    invoke-virtual/range {v9 .. v21}, Lph3;->d(Lmt2;JJJJLtv4;Lew4;Ljava/util/List;)Lph3;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-virtual {v0, v10}, Lph3;->c(Lmt2;)Lph3;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iput-wide v11, v0, Lph3;->q:J

    .line 367
    .line 368
    return-object v0
.end method

.method public final m()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-wide v0, p0, Lph3;->r:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final m1(IJLcu4;)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p4}, Lcu4;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p1, p0, Li41;->q0:I

    .line 10
    .line 11
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, p2, v3

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-wide p2, v1

    .line 21
    :cond_0
    iput-wide p2, p0, Li41;->r0:J

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p1, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p4}, Lcu4;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p1, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p1

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    iget-boolean p1, p0, Li41;->J:Z

    .line 38
    .line 39
    invoke-virtual {p4, p1}, Lcu4;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget-object p2, p0, Lfq;->b:Lbu4;

    .line 44
    .line 45
    invoke-virtual {p4, p1, p2, v1, v2}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-wide p2, p2, Lbu4;->k:J

    .line 50
    .line 51
    invoke-static {p2, p3}, Lf35;->i0(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide p2

    .line 55
    goto :goto_0

    .line 56
    :goto_2
    iget-object v2, p0, Li41;->p:Lzt4;

    .line 57
    .line 58
    invoke-static {p2, p3}, Lf35;->Q(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    iget-object v1, p0, Lfq;->b:Lbu4;

    .line 63
    .line 64
    move-object v0, p4

    .line 65
    invoke-virtual/range {v0 .. v5}, Lcu4;->i(Lbu4;Lzt4;IJ)Landroid/util/Pair;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0
.end method

.method public final n0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Li41;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 11
    .line 12
    iget-object p0, p0, Lph3;->b:Lmt2;

    .line 13
    .line 14
    iget p0, p0, Lmt2;->b:I

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final n1(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Li41;->Z:Lpf4;

    .line 2
    .line 3
    iget v1, v0, Lpf4;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Lpf4;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Lpf4;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lpf4;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li41;->Z:Lpf4;

    .line 19
    .line 20
    new-instance v0, Lv31;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p1, p2, v1}, Lv31;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Li41;->n:Ltc2;

    .line 27
    .line 28
    const/16 v2, 0x18

    .line 29
    .line 30
    invoke-virtual {v1, v2, v0}, Ltc2;->f(ILqc2;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, Lpf4;

    .line 34
    .line 35
    invoke-direct {v0, p1, p2}, Lpf4;-><init>(II)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    const/16 p2, 0xe

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2, v0}, Li41;->q1(IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final o()Lmi3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->R:Lmi3;

    .line 5
    .line 6
    return-object p0
.end method

.method public final o0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Li41;->h1(Lph3;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    const/4 v0, -0x1

    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    :cond_0
    return p0
.end method

.method public final o1(Lph3;II)Lph3;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move/from16 v7, p2

    .line 6
    .line 7
    move/from16 v8, p3

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p1}, Li41;->h1(Lph3;)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual/range {p0 .. p1}, Li41;->f1(Lph3;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    iget-object v14, v6, Lph3;->a:Lcu4;

    .line 18
    .line 19
    iget v1, v0, Li41;->K:I

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    add-int/2addr v1, v9

    .line 23
    iput v1, v0, Li41;->K:I

    .line 24
    .line 25
    add-int/lit8 v1, v8, -0x1

    .line 26
    .line 27
    :goto_0
    if-lt v1, v7, :cond_0

    .line 28
    .line 29
    iget-object v2, v0, Li41;->q:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v1, v0, Li41;->Q:Lpd4;

    .line 38
    .line 39
    sub-int v2, v8, v7

    .line 40
    .line 41
    iget-object v10, v1, Lpd4;->b:[I

    .line 42
    .line 43
    array-length v11, v10

    .line 44
    sub-int/2addr v11, v2

    .line 45
    new-array v11, v11, [I

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    move v13, v12

    .line 49
    :goto_1
    array-length v15, v10

    .line 50
    if-ge v12, v15, :cond_3

    .line 51
    .line 52
    aget v15, v10, v12

    .line 53
    .line 54
    if-lt v15, v7, :cond_1

    .line 55
    .line 56
    if-ge v15, v8, :cond_1

    .line 57
    .line 58
    add-int/lit8 v13, v13, 0x1

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    sub-int v16, v12, v13

    .line 62
    .line 63
    if-lt v15, v7, :cond_2

    .line 64
    .line 65
    sub-int/2addr v15, v2

    .line 66
    :cond_2
    aput v15, v11, v16

    .line 67
    .line 68
    :goto_2
    add-int/lit8 v12, v12, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    new-instance v2, Lpd4;

    .line 72
    .line 73
    new-instance v10, Ljava/util/Random;

    .line 74
    .line 75
    iget-object v1, v1, Lpd4;->a:Ljava/util/Random;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    .line 78
    .line 79
    .line 80
    move-result-wide v12

    .line 81
    invoke-direct {v10, v12, v13}, Ljava/util/Random;-><init>(J)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v11, v10}, Lpd4;-><init>([ILjava/util/Random;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, v0, Li41;->Q:Lpd4;

    .line 88
    .line 89
    invoke-virtual {v0}, Li41;->b1()Ltm3;

    .line 90
    .line 91
    .line 92
    move-result-object v15

    .line 93
    move-object v1, v14

    .line 94
    move-object v2, v15

    .line 95
    invoke-virtual/range {v0 .. v5}, Li41;->i1(Lcu4;Ltm3;IJ)Landroid/util/Pair;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v0, v6, v15, v4}, Li41;->l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget v2, v1, Lph3;->e:I

    .line 104
    .line 105
    if-eq v2, v9, :cond_4

    .line 106
    .line 107
    const/4 v4, 0x4

    .line 108
    if-eq v2, v4, :cond_4

    .line 109
    .line 110
    if-lt v3, v7, :cond_4

    .line 111
    .line 112
    if-ge v3, v8, :cond_4

    .line 113
    .line 114
    iget-object v2, v6, Lph3;->b:Lmt2;

    .line 115
    .line 116
    iget-object v13, v2, Lmt2;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iget v11, v0, Li41;->I:I

    .line 119
    .line 120
    iget-boolean v12, v0, Li41;->J:Z

    .line 121
    .line 122
    iget-object v9, v0, Lfq;->b:Lbu4;

    .line 123
    .line 124
    iget-object v10, v0, Li41;->p:Lzt4;

    .line 125
    .line 126
    invoke-static/range {v9 .. v15}, Lq41;->U(Lbu4;Lzt4;IZLjava/lang/Object;Lcu4;Lcu4;)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    const/4 v3, -0x1

    .line 131
    if-ne v2, v3, :cond_4

    .line 132
    .line 133
    invoke-static {v1, v4}, Li41;->k1(Lph3;I)Lph3;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :cond_4
    iget-object v2, v0, Li41;->Q:Lpd4;

    .line 138
    .line 139
    iget-object v0, v0, Li41;->m:Lq41;

    .line 140
    .line 141
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget-object v0, v0, Lyp4;->a:Landroid/os/Handler;

    .line 151
    .line 152
    const/16 v4, 0x14

    .line 153
    .line 154
    invoke-virtual {v0, v4, v7, v8, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, v3, Lxp4;->a:Landroid/os/Message;

    .line 159
    .line 160
    invoke-virtual {v3}, Lxp4;->b()V

    .line 161
    .line 162
    .line 163
    return-object v1
.end method

.method public final p0(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Li41;->I:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, Li41;->I:I

    .line 9
    .line 10
    iget-object v0, p0, Li41;->m:Lq41;

    .line 11
    .line 12
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Lyp4;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Lxp4;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Lxp4;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lij0;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p1, v1}, Lij0;-><init>(II)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Li41;->n:Ltc2;

    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    invoke-virtual {p1, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Li41;->v1()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ltc2;->b()V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final p1()V
    .locals 2

    .line 1
    iget-object v0, p0, Li41;->W:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Li41;->x:Ld41;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Li41;->W:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final q()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-boolean p0, p0, Lph3;->l:Z

    .line 7
    .line 8
    return p0
.end method

.method public final q0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final q1(IILjava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Li41;->h:[Lkq;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, -0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    aget-object v5, v0, v3

    .line 10
    .line 11
    if-eq p1, v4, :cond_0

    .line 12
    .line 13
    iget v4, v5, Lkq;->o:I

    .line 14
    .line 15
    if-ne v4, p1, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, v5}, Li41;->d1(Lrk3;)Lsk3;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-boolean v5, v4, Lsk3;->f:Z

    .line 22
    .line 23
    xor-int/lit8 v5, v5, 0x1

    .line 24
    .line 25
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 26
    .line 27
    .line 28
    iput p2, v4, Lsk3;->c:I

    .line 29
    .line 30
    iget-boolean v5, v4, Lsk3;->f:Z

    .line 31
    .line 32
    xor-int/lit8 v5, v5, 0x1

    .line 33
    .line 34
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 35
    .line 36
    .line 37
    iput-object p3, v4, Lsk3;->d:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v4}, Lsk3;->b()V

    .line 40
    .line 41
    .line 42
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object v0, p0, Li41;->i:[Lkq;

    .line 46
    .line 47
    array-length v1, v0

    .line 48
    :goto_1
    if-ge v2, v1, :cond_5

    .line 49
    .line 50
    aget-object v3, v0, v2

    .line 51
    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    if-eq p1, v4, :cond_3

    .line 55
    .line 56
    iget v5, v3, Lkq;->o:I

    .line 57
    .line 58
    if-ne v5, p1, :cond_4

    .line 59
    .line 60
    :cond_3
    invoke-virtual {p0, v3}, Li41;->d1(Lrk3;)Lsk3;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iget-boolean v5, v3, Lsk3;->f:Z

    .line 65
    .line 66
    xor-int/lit8 v5, v5, 0x1

    .line 67
    .line 68
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 69
    .line 70
    .line 71
    iput p2, v3, Lsk3;->c:I

    .line 72
    .line 73
    iget-boolean v5, v3, Lsk3;->f:Z

    .line 74
    .line 75
    xor-int/lit8 v5, v5, 0x1

    .line 76
    .line 77
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 78
    .line 79
    .line 80
    iput-object p3, v3, Lsk3;->d:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v3}, Lsk3;->b()V

    .line 83
    .line 84
    .line 85
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    return-void
.end method

.method public final r0(Loi3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ltc2;->e(Loi3;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r1(Ljava/util/ArrayList;IJZ)V
    .locals 14

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 4
    .line 5
    invoke-virtual {p0, v2}, Li41;->h1(Lph3;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, Li41;->M0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget v5, p0, Li41;->K:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    add-int/2addr v5, v6

    .line 17
    iput v5, p0, Li41;->K:I

    .line 18
    .line 19
    iget-object v5, p0, Li41;->q:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 22
    .line 23
    .line 24
    new-instance v8, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    move v7, v13

    .line 31
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    if-ge v7, v9, :cond_0

    .line 36
    .line 37
    new-instance v9, Lbu2;

    .line 38
    .line 39
    invoke-virtual {p1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    check-cast v11, Lbq;

    .line 44
    .line 45
    iget-boolean v12, p0, Li41;->r:Z

    .line 46
    .line 47
    invoke-direct {v9, v11, v12}, Lbu2;-><init>(Lbq;Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v11, Lf41;

    .line 54
    .line 55
    iget-object v12, v9, Lbu2;->b:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v9, v9, Lbu2;->a:Lrg2;

    .line 58
    .line 59
    invoke-direct {v11, v12, v9}, Lf41;-><init>(Ljava/lang/Object;Lrg2;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5, v7, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v7, v7, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v5, p0, Li41;->Q:Lpd4;

    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v9, Lpd4;

    .line 78
    .line 79
    new-instance v10, Ljava/util/Random;

    .line 80
    .line 81
    iget-object v5, v5, Lpd4;->a:Ljava/util/Random;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/util/Random;->nextLong()J

    .line 84
    .line 85
    .line 86
    move-result-wide v11

    .line 87
    invoke-direct {v10, v11, v12}, Ljava/util/Random;-><init>(J)V

    .line 88
    .line 89
    .line 90
    invoke-direct {v9, v10}, Lpd4;-><init>(Ljava/util/Random;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9, v13, v7}, Lpd4;->a(II)Lpd4;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    iput-object v5, p0, Li41;->Q:Lpd4;

    .line 98
    .line 99
    invoke-virtual {p0}, Li41;->b1()Ltm3;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iget v7, v5, Ltm3;->g:I

    .line 104
    .line 105
    invoke-virtual {v5}, Lcu4;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_2

    .line 110
    .line 111
    if-ge v1, v7, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    new-instance v0, Landroidx/media3/common/IllegalSeekPositionException;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_2
    :goto_1
    const/4 v9, -0x1

    .line 121
    if-eqz p5, :cond_3

    .line 122
    .line 123
    iget-boolean v1, p0, Li41;->J:Z

    .line 124
    .line 125
    invoke-virtual {v5, v1}, Ltm3;->a(Z)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    :goto_2
    move v10, v1

    .line 135
    goto :goto_3

    .line 136
    :cond_3
    if-ne v1, v9, :cond_4

    .line 137
    .line 138
    move v10, v2

    .line 139
    move-wide v2, v3

    .line 140
    goto :goto_3

    .line 141
    :cond_4
    move-wide/from16 v2, p3

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :goto_3
    iget-object v1, p0, Li41;->p0:Lph3;

    .line 145
    .line 146
    invoke-virtual {p0, v10, v2, v3, v5}, Li41;->m1(IJLcu4;)Landroid/util/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {p0, v1, v5, v4}, Li41;->l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget v4, v1, Lph3;->e:I

    .line 155
    .line 156
    if-ne v4, v6, :cond_5

    .line 157
    .line 158
    move v4, v6

    .line 159
    goto :goto_5

    .line 160
    :cond_5
    invoke-virtual {v5}, Lcu4;->p()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    const/4 v11, 0x4

    .line 165
    if-eqz v5, :cond_6

    .line 166
    .line 167
    :goto_4
    move v4, v11

    .line 168
    goto :goto_5

    .line 169
    :cond_6
    if-ne v10, v9, :cond_7

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    if-lt v10, v7, :cond_8

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_8
    const/4 v4, 0x2

    .line 176
    :goto_5
    invoke-static {v1, v4}, Li41;->k1(Lph3;I)Lph3;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v2, v3}, Lf35;->Q(J)J

    .line 181
    .line 182
    .line 183
    move-result-wide v11

    .line 184
    iget-object v9, p0, Li41;->Q:Lpd4;

    .line 185
    .line 186
    iget-object v2, p0, Li41;->m:Lq41;

    .line 187
    .line 188
    iget-object v2, v2, Lq41;->u:Lyp4;

    .line 189
    .line 190
    new-instance v7, Ll41;

    .line 191
    .line 192
    invoke-direct/range {v7 .. v12}, Ll41;-><init>(Ljava/util/ArrayList;Lpd4;IJ)V

    .line 193
    .line 194
    .line 195
    const/16 v3, 0x11

    .line 196
    .line 197
    invoke-virtual {v2, v3, v7}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v2}, Lxp4;->b()V

    .line 202
    .line 203
    .line 204
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 205
    .line 206
    iget-object v2, v2, Lph3;->b:Lmt2;

    .line 207
    .line 208
    iget-object v2, v2, Lmt2;->a:Ljava/lang/Object;

    .line 209
    .line 210
    iget-object v3, v1, Lph3;->b:Lmt2;

    .line 211
    .line 212
    iget-object v3, v3, Lmt2;->a:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    if-nez v2, :cond_9

    .line 219
    .line 220
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 221
    .line 222
    iget-object v2, v2, Lph3;->a:Lcu4;

    .line 223
    .line 224
    invoke-virtual {v2}, Lcu4;->p()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-nez v2, :cond_9

    .line 229
    .line 230
    move v3, v6

    .line 231
    goto :goto_6

    .line 232
    :cond_9
    move v3, v13

    .line 233
    :goto_6
    invoke-virtual {p0, v1}, Li41;->g1(Lph3;)J

    .line 234
    .line 235
    .line 236
    move-result-wide v5

    .line 237
    const/4 v7, -0x1

    .line 238
    const/4 v8, 0x0

    .line 239
    const/4 v2, 0x0

    .line 240
    const/4 v4, 0x4

    .line 241
    move-object v0, p0

    .line 242
    invoke-virtual/range {v0 .. v8}, Li41;->x1(Lph3;IZIJIZ)V

    .line 243
    .line 244
    .line 245
    return-void
.end method

.method public final s(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Li41;->J:Z

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput-boolean p1, p0, Li41;->J:Z

    .line 9
    .line 10
    iget-object v0, p0, Li41;->m:Lq41;

    .line 11
    .line 12
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Lyp4;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xc

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Lxp4;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Lxp4;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, Lt31;

    .line 36
    .line 37
    invoke-direct {v0, v3, p1}, Lt31;-><init>(IZ)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Li41;->n:Ltc2;

    .line 41
    .line 42
    const/16 v1, 0x9

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Li41;->v1()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ltc2;->b()V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public final s1(Lpd4;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lpd4;->b:[I

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    iget-object v1, p0, Li41;->q:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-static {v0}, Lrr2;->l(Z)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Li41;->Q:Lpd4;

    .line 23
    .line 24
    invoke-virtual {p0}, Li41;->b1()Ltm3;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Li41;->p0:Lph3;

    .line 29
    .line 30
    invoke-virtual {p0}, Li41;->o0()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {p0}, Li41;->M0()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-virtual {p0, v3, v4, v5, v0}, Li41;->m1(IJLcu4;)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {p0, v1, v0, v3}, Li41;->l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    iget v0, p0, Li41;->K:I

    .line 47
    .line 48
    add-int/2addr v0, v2

    .line 49
    iput v0, p0, Li41;->K:I

    .line 50
    .line 51
    iget-object v0, p0, Li41;->m:Lq41;

    .line 52
    .line 53
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 54
    .line 55
    const/16 v1, 0x15

    .line 56
    .line 57
    invoke-virtual {v0, v1, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lxp4;->b()V

    .line 62
    .line 63
    .line 64
    const/4 v11, -0x1

    .line 65
    const/4 v12, 0x0

    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x5

    .line 69
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    move-object v4, p0

    .line 75
    invoke-virtual/range {v4 .. v12}, Li41;->x1(Lph3;IZIJIZ)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final setImageOutput(Landroidx/media3/exoplayer/image/ImageOutput;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, p1}, Li41;->q1(IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final setScrubbingModeEnabled(Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Li41;->N:Z

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean p1, p0, Li41;->N:Z

    .line 10
    .line 11
    iget-object v0, p0, Li41;->P:Li74;

    .line 12
    .line 13
    iget-object v1, v0, Li74;->a:Ljx1;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    iget-object v1, p0, Li41;->j:Lpn0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lpn0;->d()Ljn0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object v3, v2, Lcw4;->I:Ljx1;

    .line 33
    .line 34
    iput-object v3, p0, Li41;->O:Ljx1;

    .line 35
    .line 36
    iget-object v0, v0, Li74;->a:Ljx1;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljn0;->a()Lbw4;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0}, Lrw1;->h()Lo15;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v5, 0x1

    .line 63
    invoke-virtual {v3, v4, v5}, Lbw4;->l(IZ)Lbw4;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v3}, Lbw4;->b()Lcw4;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    new-instance v0, Lin0;

    .line 76
    .line 77
    invoke-direct {v0, v2}, Lin0;-><init>(Ljn0;)V

    .line 78
    .line 79
    .line 80
    iget-object v3, p0, Li41;->O:Ljx1;

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Lin0;->m(Ljava/util/Set;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Ljn0;

    .line 86
    .line 87
    invoke-direct {v3, v0}, Ljn0;-><init>(Lin0;)V

    .line 88
    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    iput-object v0, p0, Li41;->O:Ljx1;

    .line 92
    .line 93
    move-object v0, v3

    .line 94
    :goto_1
    invoke-virtual {v0, v2}, Lcw4;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_3

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Lpn0;->j(Lcw4;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    iget-object v0, p0, Li41;->m:Lq41;

    .line 104
    .line 105
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 106
    .line 107
    const/16 v1, 0x24

    .line 108
    .line 109
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {v0, v1, p1}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lxp4;->b()V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Li41;->p0:Lph3;

    .line 121
    .line 122
    iget-boolean v0, p1, Lph3;->l:Z

    .line 123
    .line 124
    iget p1, p1, Lph3;->m:I

    .line 125
    .line 126
    invoke-virtual {p0, p1, v0}, Li41;->w1(IZ)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final stop()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Li41;->u1(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljg0;

    .line 9
    .line 10
    sget-object v1, Lgy3;->r:Lgy3;

    .line 11
    .line 12
    iget-object v2, p0, Li41;->p0:Lph3;

    .line 13
    .line 14
    iget-wide v2, v2, Lph3;->s:J

    .line 15
    .line 16
    invoke-direct {v0, v2, v3, v1}, Ljg0;-><init>(JLjava/util/List;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Li41;->e0:Ljg0;

    .line 20
    .line 21
    return-void
.end method

.method public final t1(Landroid/view/Surface;)V
    .locals 10

    .line 1
    iget-object v0, p0, Li41;->U:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-wide v4, p0, Li41;->C:J

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-wide v4, v2

    .line 22
    :goto_1
    iget-object v6, p0, Li41;->m:Lq41;

    .line 23
    .line 24
    iget-boolean v7, v6, Lq41;->X:Z

    .line 25
    .line 26
    if-nez v7, :cond_3

    .line 27
    .line 28
    iget-object v7, v6, Lq41;->w:Landroid/os/Looper;

    .line 29
    .line 30
    invoke-virtual {v7}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v7}, Ljava/lang/Thread;->isAlive()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-nez v7, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    new-instance v7, Lq90;

    .line 42
    .line 43
    iget-object v8, v6, Lq41;->D:Lvp4;

    .line 44
    .line 45
    invoke-direct {v7, v8}, Lq90;-><init>(Lvp4;)V

    .line 46
    .line 47
    .line 48
    iget-object v6, v6, Lq41;->u:Lyp4;

    .line 49
    .line 50
    new-instance v8, Landroid/util/Pair;

    .line 51
    .line 52
    invoke-direct {v8, p1, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/16 v9, 0x1e

    .line 56
    .line 57
    invoke-virtual {v6, v9, v8}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Lxp4;->b()V

    .line 62
    .line 63
    .line 64
    cmp-long v2, v4, v2

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v7, v4, v5}, Lq90;->c(J)Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Li41;->U:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v2, p0, Li41;->V:Landroid/view/Surface;

    .line 77
    .line 78
    if-ne v0, v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/view/Surface;->release()V

    .line 81
    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    iput-object v0, p0, Li41;->V:Landroid/view/Surface;

    .line 85
    .line 86
    :cond_4
    iput-object p1, p0, Li41;->U:Ljava/lang/Object;

    .line 87
    .line 88
    if-nez v1, :cond_5

    .line 89
    .line 90
    new-instance p1, Landroidx/media3/exoplayer/ExoTimeoutException;

    .line 91
    .line 92
    const-string v0, "Detaching surface timed out."

    .line 93
    .line 94
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 98
    .line 99
    const/4 v1, 0x2

    .line 100
    const/16 v2, 0x3eb

    .line 101
    .line 102
    invoke-direct {v0, v1, p1, v2}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v0}, Li41;->u1(Landroidx/media3/exoplayer/ExoPlaybackException;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    return-void
.end method

.method public final u()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Li41;->n0:J

    .line 5
    .line 6
    return-wide v0
.end method

.method public final u0(III)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 v3, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-gt p1, p2, :cond_0

    .line 8
    .line 9
    if-ltz p3, :cond_0

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, Lrr2;->l(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Li41;->q:Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    sub-int v1, v7, p1

    .line 28
    .line 29
    sub-int v1, v5, v1

    .line 30
    .line 31
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-ge p1, v5, :cond_2

    .line 36
    .line 37
    if-eq p1, v7, :cond_2

    .line 38
    .line 39
    if-ne p1, v8, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, Li41;->x0()Lcu4;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v2, p0, Li41;->K:I

    .line 47
    .line 48
    add-int/2addr v2, v3

    .line 49
    iput v2, p0, Li41;->K:I

    .line 50
    .line 51
    invoke-static {v4, p1, v7, v8}, Lf35;->P(Ljava/util/ArrayList;III)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Li41;->Q:Lpd4;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iput-object v2, p0, Li41;->Q:Lpd4;

    .line 60
    .line 61
    invoke-virtual {p0}, Li41;->b1()Ltm3;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v9, p0, Li41;->p0:Lph3;

    .line 66
    .line 67
    invoke-virtual {p0, v9}, Li41;->h1(Lph3;)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    iget-object v4, p0, Li41;->p0:Lph3;

    .line 72
    .line 73
    invoke-virtual {p0, v4}, Li41;->f1(Lph3;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    move-object v0, p0

    .line 78
    invoke-virtual/range {v0 .. v5}, Li41;->i1(Lcu4;Ltm3;IJ)Landroid/util/Pair;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p0, v9, v2, v1}, Li41;->l1(Lph3;Lcu4;Landroid/util/Pair;)Lph3;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-object v2, p0, Li41;->Q:Lpd4;

    .line 87
    .line 88
    iget-object v3, p0, Li41;->m:Lq41;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v4, Lm41;

    .line 94
    .line 95
    invoke-direct {v4, p1, v7, v8, v2}, Lm41;-><init>(IIILpd4;)V

    .line 96
    .line 97
    .line 98
    iget-object v2, v3, Lq41;->u:Lyp4;

    .line 99
    .line 100
    const/16 v3, 0x13

    .line 101
    .line 102
    invoke-virtual {v2, v3, v4}, Lyp4;->b(ILjava/lang/Object;)Lxp4;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v2}, Lxp4;->b()V

    .line 107
    .line 108
    .line 109
    const/4 v7, -0x1

    .line 110
    const/4 v8, 0x0

    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x5

    .line 114
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v0 .. v8}, Li41;->x1(Lph3;IZIJIZ)V

    .line 120
    .line 121
    .line 122
    :cond_2
    :goto_1
    return-void
.end method

.method public final u1(Landroidx/media3/exoplayer/ExoPlaybackException;)V
    .locals 11

    .line 1
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 2
    .line 3
    iget-object v1, v0, Lph3;->b:Lmt2;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lph3;->c(Lmt2;)Lph3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, Lph3;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, Lph3;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, Lph3;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-static {v0, v1}, Li41;->k1(Lph3;I)Lph3;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lph3;->f(Landroidx/media3/exoplayer/ExoPlaybackException;)Lph3;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, Li41;->K:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, Li41;->K:I

    .line 33
    .line 34
    iget-object p1, p0, Li41;->m:Lq41;

    .line 35
    .line 36
    iget-object p1, p1, Lq41;->u:Lyp4;

    .line 37
    .line 38
    const/4 v0, 0x6

    .line 39
    invoke-virtual {p1, v0}, Lyp4;->a(I)Lxp4;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lxp4;->b()V

    .line 44
    .line 45
    .line 46
    const/4 v9, -0x1

    .line 47
    const/4 v10, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    const/4 v6, 0x5

    .line 51
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    move-object v2, p0

    .line 57
    invoke-virtual/range {v2 .. v10}, Li41;->x1(Lph3;IZIJIZ)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final v(Loi3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ltc2;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final v0()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget p0, p0, Lph3;->n:I

    .line 7
    .line 8
    return p0
.end method

.method public final v1()V
    .locals 15

    .line 1
    iget-object v0, p0, Li41;->R:Lmi3;

    .line 2
    .line 3
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Li41;->g:Li41;

    .line 6
    .line 7
    invoke-virtual {v1}, Li41;->k()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Lfq;->R0()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-virtual {v1}, Lfq;->I()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v1}, Lfq;->f0()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {v1}, Lfq;->V0()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v1}, Lfq;->T0()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    invoke-virtual {v1}, Li41;->x0()Lcu4;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcu4;->p()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    new-instance v8, Lzg5;

    .line 40
    .line 41
    const/4 v9, 0x1

    .line 42
    invoke-direct {v8, v9}, Lzg5;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iget-object v10, v8, Lzg5;->n:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v10, Lxk0;

    .line 48
    .line 49
    iget-object v11, p0, Li41;->d:Lmi3;

    .line 50
    .line 51
    iget-object v11, v11, Lmi3;->a:Lw71;

    .line 52
    .line 53
    invoke-virtual {v10, v11}, Lxk0;->c(Lw71;)V

    .line 54
    .line 55
    .line 56
    xor-int/lit8 v11, v2, 0x1

    .line 57
    .line 58
    const/4 v12, 0x4

    .line 59
    invoke-virtual {v8, v12, v11}, Lzg5;->k(IZ)V

    .line 60
    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    if-nez v2, :cond_0

    .line 66
    .line 67
    move v13, v9

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move v13, v12

    .line 70
    :goto_0
    const/4 v14, 0x5

    .line 71
    invoke-virtual {v8, v14, v13}, Lzg5;->k(IZ)V

    .line 72
    .line 73
    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    if-nez v2, :cond_1

    .line 77
    .line 78
    move v13, v9

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move v13, v12

    .line 81
    :goto_1
    const/4 v14, 0x6

    .line 82
    invoke-virtual {v8, v14, v13}, Lzg5;->k(IZ)V

    .line 83
    .line 84
    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    if-nez v4, :cond_2

    .line 88
    .line 89
    if-eqz v6, :cond_2

    .line 90
    .line 91
    if-eqz v3, :cond_3

    .line 92
    .line 93
    :cond_2
    if-nez v2, :cond_3

    .line 94
    .line 95
    move v4, v9

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move v4, v12

    .line 98
    :goto_2
    const/4 v13, 0x7

    .line 99
    invoke-virtual {v8, v13, v4}, Lzg5;->k(IZ)V

    .line 100
    .line 101
    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    if-nez v2, :cond_4

    .line 105
    .line 106
    move v4, v9

    .line 107
    goto :goto_3

    .line 108
    :cond_4
    move v4, v12

    .line 109
    :goto_3
    const/16 v13, 0x8

    .line 110
    .line 111
    invoke-virtual {v8, v13, v4}, Lzg5;->k(IZ)V

    .line 112
    .line 113
    .line 114
    if-nez v1, :cond_6

    .line 115
    .line 116
    if-nez v5, :cond_5

    .line 117
    .line 118
    if-eqz v6, :cond_6

    .line 119
    .line 120
    if-eqz v7, :cond_6

    .line 121
    .line 122
    :cond_5
    if-nez v2, :cond_6

    .line 123
    .line 124
    move v1, v9

    .line 125
    goto :goto_4

    .line 126
    :cond_6
    move v1, v12

    .line 127
    :goto_4
    const/16 v4, 0x9

    .line 128
    .line 129
    invoke-virtual {v8, v4, v1}, Lzg5;->k(IZ)V

    .line 130
    .line 131
    .line 132
    const/16 v1, 0xa

    .line 133
    .line 134
    invoke-virtual {v8, v1, v11}, Lzg5;->k(IZ)V

    .line 135
    .line 136
    .line 137
    if-eqz v3, :cond_7

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    move v1, v9

    .line 142
    goto :goto_5

    .line 143
    :cond_7
    move v1, v12

    .line 144
    :goto_5
    const/16 v4, 0xb

    .line 145
    .line 146
    invoke-virtual {v8, v4, v1}, Lzg5;->k(IZ)V

    .line 147
    .line 148
    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    if-nez v2, :cond_8

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_8
    move v9, v12

    .line 155
    :goto_6
    const/16 v1, 0xc

    .line 156
    .line 157
    invoke-virtual {v8, v1, v9}, Lzg5;->k(IZ)V

    .line 158
    .line 159
    .line 160
    new-instance v1, Lmi3;

    .line 161
    .line 162
    invoke-virtual {v10}, Lxk0;->f()Lw71;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-direct {v1, v2}, Lmi3;-><init>(Lw71;)V

    .line 167
    .line 168
    .line 169
    iput-object v1, p0, Li41;->R:Lmi3;

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Lmi3;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-nez v0, :cond_9

    .line 176
    .line 177
    new-instance v0, Lu31;

    .line 178
    .line 179
    const/4 v1, 0x3

    .line 180
    invoke-direct {v0, p0, v1}, Lu31;-><init>(Li41;I)V

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, Li41;->n:Ltc2;

    .line 184
    .line 185
    const/16 v1, 0xd

    .line 186
    .line 187
    invoke-virtual {p0, v1, v0}, Ltc2;->c(ILqc2;)V

    .line 188
    .line 189
    .line 190
    :cond_9
    return-void
.end method

.method public final w1(IZ)V
    .locals 13

    .line 1
    iget-boolean v0, p0, Li41;->N:Z

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 10
    .line 11
    iget v0, v0, Lph3;->n:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    move v0, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object v3, p0, Li41;->p0:Lph3;

    .line 21
    .line 22
    iget-boolean v4, v3, Lph3;->l:Z

    .line 23
    .line 24
    if-ne v4, p2, :cond_2

    .line 25
    .line 26
    iget v4, v3, Lph3;->n:I

    .line 27
    .line 28
    if-ne v4, v0, :cond_2

    .line 29
    .line 30
    iget v4, v3, Lph3;->m:I

    .line 31
    .line 32
    if-ne v4, p1, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget v4, p0, Li41;->K:I

    .line 36
    .line 37
    add-int/2addr v4, v2

    .line 38
    iput v4, p0, Li41;->K:I

    .line 39
    .line 40
    iget-boolean v4, v3, Lph3;->p:Z

    .line 41
    .line 42
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v3}, Lph3;->a()Lph3;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_3
    invoke-virtual {v3, p1, v0, p2}, Lph3;->e(IIZ)Lph3;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    shl-int/2addr v0, v1

    .line 53
    or-int/2addr p1, v0

    .line 54
    iget-object v0, p0, Li41;->m:Lq41;

    .line 55
    .line 56
    iget-object v0, v0, Lq41;->u:Lyp4;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lyp4;->c()Lxp4;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v0, v0, Lyp4;->a:Landroid/os/Handler;

    .line 66
    .line 67
    invoke-virtual {v0, v2, p2, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, v1, Lxp4;->a:Landroid/os/Message;

    .line 72
    .line 73
    invoke-virtual {v1}, Lxp4;->b()V

    .line 74
    .line 75
    .line 76
    const/4 v11, -0x1

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x5

    .line 81
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    move-object v4, p0

    .line 87
    invoke-virtual/range {v4 .. v12}, Li41;->x1(Lph3;IZIJIZ)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final x0()Lcu4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object p0, p0, Lph3;->a:Lcu4;

    .line 7
    .line 8
    return-object p0
.end method

.method public final x1(Lph3;IZIJIZ)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Li41;->p0:Lph3;

    .line 8
    .line 9
    iput-object v1, v0, Li41;->p0:Lph3;

    .line 10
    .line 11
    iget-object v4, v3, Lph3;->a:Lcu4;

    .line 12
    .line 13
    iget-object v5, v1, Lph3;->a:Lcu4;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Lcu4;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v0, Lfq;->b:Lbu4;

    .line 20
    .line 21
    iget-object v6, v0, Li41;->p:Lzt4;

    .line 22
    .line 23
    const/4 v7, -0x1

    .line 24
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    iget-object v9, v3, Lph3;->a:Lcu4;

    .line 29
    .line 30
    iget-object v10, v3, Lph3;->b:Lmt2;

    .line 31
    .line 32
    iget-object v11, v1, Lph3;->a:Lcu4;

    .line 33
    .line 34
    iget-object v12, v1, Lph3;->b:Lmt2;

    .line 35
    .line 36
    invoke-virtual {v11}, Lcu4;->p()Z

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    const/16 v16, 0x0

    .line 41
    .line 42
    const/16 v17, 0x2

    .line 43
    .line 44
    const-wide/16 v14, 0x0

    .line 45
    .line 46
    const/16 v18, 0x3

    .line 47
    .line 48
    if-eqz v13, :cond_0

    .line 49
    .line 50
    invoke-virtual {v9}, Lcu4;->p()Z

    .line 51
    .line 52
    .line 53
    move-result v13

    .line 54
    if-eqz v13, :cond_0

    .line 55
    .line 56
    new-instance v5, Landroid/util/Pair;

    .line 57
    .line 58
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_0
    invoke-virtual {v11}, Lcu4;->p()Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    invoke-virtual {v9}, Lcu4;->p()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eq v13, v7, :cond_1

    .line 74
    .line 75
    new-instance v5, Landroid/util/Pair;

    .line 76
    .line 77
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_1

    .line 87
    .line 88
    :cond_1
    iget-object v7, v10, Lmt2;->a:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v9, v7, v6}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iget v7, v7, Lzt4;->c:I

    .line 95
    .line 96
    invoke-virtual {v9, v7, v5, v14, v15}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    iget-object v7, v7, Lbu4;->a:Ljava/lang/Object;

    .line 101
    .line 102
    iget-object v9, v12, Lmt2;->a:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-virtual {v11, v9, v6}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iget v6, v6, Lzt4;->c:I

    .line 109
    .line 110
    invoke-virtual {v11, v6, v5, v14, v15}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    iget-object v5, v5, Lbu4;->a:Ljava/lang/Object;

    .line 115
    .line 116
    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_5

    .line 121
    .line 122
    if-eqz p3, :cond_2

    .line 123
    .line 124
    if-nez v2, :cond_2

    .line 125
    .line 126
    const/4 v5, 0x1

    .line 127
    goto :goto_0

    .line 128
    :cond_2
    if-eqz p3, :cond_3

    .line 129
    .line 130
    const/4 v5, 0x1

    .line 131
    if-ne v2, v5, :cond_3

    .line 132
    .line 133
    move/from16 v5, v17

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_3
    if-nez v4, :cond_4

    .line 137
    .line 138
    move/from16 v5, v18

    .line 139
    .line 140
    :goto_0
    new-instance v6, Landroid/util/Pair;

    .line 141
    .line 142
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    move-object v5, v6

    .line 152
    goto :goto_1

    .line 153
    :cond_4
    invoke-static {}, Ltb4;->a()V

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_5
    if-eqz p3, :cond_6

    .line 158
    .line 159
    if-nez v2, :cond_6

    .line 160
    .line 161
    iget-wide v5, v10, Lmt2;->d:J

    .line 162
    .line 163
    iget-wide v9, v12, Lmt2;->d:J

    .line 164
    .line 165
    cmp-long v5, v5, v9

    .line 166
    .line 167
    if-gez v5, :cond_6

    .line 168
    .line 169
    new-instance v5, Landroid/util/Pair;

    .line 170
    .line 171
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 172
    .line 173
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_6
    if-eqz p3, :cond_7

    .line 182
    .line 183
    const/4 v5, 0x1

    .line 184
    if-ne v2, v5, :cond_7

    .line 185
    .line 186
    if-eqz p8, :cond_7

    .line 187
    .line 188
    new-instance v5, Landroid/util/Pair;

    .line 189
    .line 190
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_7
    new-instance v5, Landroid/util/Pair;

    .line 201
    .line 202
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 203
    .line 204
    invoke-direct {v5, v6, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :goto_1
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v6, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v5, Ljava/lang/Integer;

    .line 218
    .line 219
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v6, :cond_9

    .line 224
    .line 225
    iget-object v8, v1, Lph3;->a:Lcu4;

    .line 226
    .line 227
    invoke-virtual {v8}, Lcu4;->p()Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-nez v8, :cond_8

    .line 232
    .line 233
    iget-object v8, v1, Lph3;->a:Lcu4;

    .line 234
    .line 235
    iget-object v9, v1, Lph3;->b:Lmt2;

    .line 236
    .line 237
    iget-object v9, v9, Lmt2;->a:Ljava/lang/Object;

    .line 238
    .line 239
    iget-object v10, v0, Li41;->p:Lzt4;

    .line 240
    .line 241
    invoke-virtual {v8, v9, v10}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    iget v8, v8, Lzt4;->c:I

    .line 246
    .line 247
    iget-object v9, v1, Lph3;->a:Lcu4;

    .line 248
    .line 249
    iget-object v10, v0, Lfq;->b:Lbu4;

    .line 250
    .line 251
    invoke-virtual {v9, v8, v10, v14, v15}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    iget-object v8, v8, Lbu4;->b:Lgn2;

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_8
    const/4 v8, 0x0

    .line 259
    :goto_2
    sget-object v9, Ldo2;->K:Ldo2;

    .line 260
    .line 261
    iput-object v9, v0, Li41;->o0:Ldo2;

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_9
    const/4 v8, 0x0

    .line 265
    :goto_3
    if-nez v6, :cond_a

    .line 266
    .line 267
    iget-object v9, v3, Lph3;->j:Ljava/util/List;

    .line 268
    .line 269
    iget-object v10, v1, Lph3;->j:Ljava/util/List;

    .line 270
    .line 271
    invoke-interface {v9, v10}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    if-nez v9, :cond_d

    .line 276
    .line 277
    :cond_a
    iget-object v9, v0, Li41;->o0:Ldo2;

    .line 278
    .line 279
    invoke-virtual {v9}, Ldo2;->a()Lco2;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    iget-object v10, v1, Lph3;->j:Ljava/util/List;

    .line 284
    .line 285
    move/from16 v11, v16

    .line 286
    .line 287
    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    if-ge v11, v12, :cond_c

    .line 292
    .line 293
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    check-cast v12, Lqv2;

    .line 298
    .line 299
    move/from16 v13, v16

    .line 300
    .line 301
    :goto_5
    iget-object v7, v12, Lqv2;->a:[Lpv2;

    .line 302
    .line 303
    array-length v14, v7

    .line 304
    if-ge v13, v14, :cond_b

    .line 305
    .line 306
    aget-object v7, v7, v13

    .line 307
    .line 308
    invoke-interface {v7, v9}, Lpv2;->b(Lco2;)V

    .line 309
    .line 310
    .line 311
    add-int/lit8 v13, v13, 0x1

    .line 312
    .line 313
    const-wide/16 v14, 0x0

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_b
    add-int/lit8 v11, v11, 0x1

    .line 317
    .line 318
    const-wide/16 v14, 0x0

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_c
    new-instance v7, Ldo2;

    .line 322
    .line 323
    invoke-direct {v7, v9}, Ldo2;-><init>(Lco2;)V

    .line 324
    .line 325
    .line 326
    iput-object v7, v0, Li41;->o0:Ldo2;

    .line 327
    .line 328
    :cond_d
    invoke-virtual {v0}, Li41;->a1()Ldo2;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    iget-object v9, v0, Li41;->S:Ldo2;

    .line 333
    .line 334
    invoke-virtual {v7, v9}, Ldo2;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    iput-object v7, v0, Li41;->S:Ldo2;

    .line 339
    .line 340
    iget-boolean v7, v3, Lph3;->l:Z

    .line 341
    .line 342
    iget-boolean v10, v1, Lph3;->l:Z

    .line 343
    .line 344
    if-eq v7, v10, :cond_e

    .line 345
    .line 346
    const/4 v7, 0x1

    .line 347
    goto :goto_6

    .line 348
    :cond_e
    move/from16 v7, v16

    .line 349
    .line 350
    :goto_6
    iget v10, v3, Lph3;->e:I

    .line 351
    .line 352
    iget v11, v1, Lph3;->e:I

    .line 353
    .line 354
    if-eq v10, v11, :cond_f

    .line 355
    .line 356
    const/4 v10, 0x1

    .line 357
    goto :goto_7

    .line 358
    :cond_f
    move/from16 v10, v16

    .line 359
    .line 360
    :goto_7
    if-nez v10, :cond_10

    .line 361
    .line 362
    if-eqz v7, :cond_11

    .line 363
    .line 364
    :cond_10
    invoke-virtual {v0}, Li41;->y1()V

    .line 365
    .line 366
    .line 367
    :cond_11
    iget-boolean v11, v3, Lph3;->g:Z

    .line 368
    .line 369
    iget-boolean v12, v1, Lph3;->g:Z

    .line 370
    .line 371
    if-eq v11, v12, :cond_12

    .line 372
    .line 373
    const/4 v11, 0x1

    .line 374
    goto :goto_8

    .line 375
    :cond_12
    move/from16 v11, v16

    .line 376
    .line 377
    :goto_8
    if-nez v4, :cond_13

    .line 378
    .line 379
    iget-object v4, v0, Li41;->n:Ltc2;

    .line 380
    .line 381
    new-instance v12, Lq31;

    .line 382
    .line 383
    move/from16 v13, p2

    .line 384
    .line 385
    move/from16 v14, v16

    .line 386
    .line 387
    invoke-direct {v12, v13, v14, v1}, Lq31;-><init>(IILjava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4, v14, v12}, Ltc2;->c(ILqc2;)V

    .line 391
    .line 392
    .line 393
    :cond_13
    if-eqz p3, :cond_1b

    .line 394
    .line 395
    new-instance v4, Lzt4;

    .line 396
    .line 397
    invoke-direct {v4}, Lzt4;-><init>()V

    .line 398
    .line 399
    .line 400
    iget-object v12, v3, Lph3;->a:Lcu4;

    .line 401
    .line 402
    invoke-virtual {v12}, Lcu4;->p()Z

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    if-nez v12, :cond_14

    .line 407
    .line 408
    iget-object v12, v3, Lph3;->b:Lmt2;

    .line 409
    .line 410
    iget-object v12, v12, Lmt2;->a:Ljava/lang/Object;

    .line 411
    .line 412
    iget-object v13, v3, Lph3;->a:Lcu4;

    .line 413
    .line 414
    invoke-virtual {v13, v12, v4}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 415
    .line 416
    .line 417
    iget v13, v4, Lzt4;->c:I

    .line 418
    .line 419
    iget-object v14, v3, Lph3;->a:Lcu4;

    .line 420
    .line 421
    invoke-virtual {v14, v12}, Lcu4;->b(Ljava/lang/Object;)I

    .line 422
    .line 423
    .line 424
    move-result v14

    .line 425
    iget-object v15, v3, Lph3;->a:Lcu4;

    .line 426
    .line 427
    move/from16 v19, v6

    .line 428
    .line 429
    iget-object v6, v0, Lfq;->b:Lbu4;

    .line 430
    .line 431
    move/from16 v20, v9

    .line 432
    .line 433
    move/from16 v21, v10

    .line 434
    .line 435
    const-wide/16 v9, 0x0

    .line 436
    .line 437
    invoke-virtual {v15, v13, v6, v9, v10}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    iget-object v6, v6, Lbu4;->a:Ljava/lang/Object;

    .line 442
    .line 443
    iget-object v9, v0, Lfq;->b:Lbu4;

    .line 444
    .line 445
    iget-object v9, v9, Lbu4;->b:Lgn2;

    .line 446
    .line 447
    move-object/from16 v23, v6

    .line 448
    .line 449
    move-object/from16 v25, v9

    .line 450
    .line 451
    move-object/from16 v26, v12

    .line 452
    .line 453
    move/from16 v24, v13

    .line 454
    .line 455
    move/from16 v27, v14

    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_14
    move/from16 v19, v6

    .line 459
    .line 460
    move/from16 v20, v9

    .line 461
    .line 462
    move/from16 v21, v10

    .line 463
    .line 464
    move/from16 v24, p7

    .line 465
    .line 466
    move/from16 v27, v24

    .line 467
    .line 468
    const/16 v23, 0x0

    .line 469
    .line 470
    const/16 v25, 0x0

    .line 471
    .line 472
    const/16 v26, 0x0

    .line 473
    .line 474
    :goto_9
    iget-object v6, v3, Lph3;->b:Lmt2;

    .line 475
    .line 476
    if-nez v2, :cond_17

    .line 477
    .line 478
    invoke-virtual {v6}, Lmt2;->b()Z

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    iget-object v9, v3, Lph3;->b:Lmt2;

    .line 483
    .line 484
    if-eqz v6, :cond_15

    .line 485
    .line 486
    iget v6, v9, Lmt2;->b:I

    .line 487
    .line 488
    iget v9, v9, Lmt2;->c:I

    .line 489
    .line 490
    invoke-virtual {v4, v6, v9}, Lzt4;->a(II)J

    .line 491
    .line 492
    .line 493
    move-result-wide v9

    .line 494
    invoke-static {v3}, Li41;->j1(Lph3;)J

    .line 495
    .line 496
    .line 497
    move-result-wide v12

    .line 498
    goto :goto_c

    .line 499
    :cond_15
    iget v6, v9, Lmt2;->e:I

    .line 500
    .line 501
    const/4 v9, -0x1

    .line 502
    if-eq v6, v9, :cond_16

    .line 503
    .line 504
    iget-object v4, v0, Li41;->p0:Lph3;

    .line 505
    .line 506
    invoke-static {v4}, Li41;->j1(Lph3;)J

    .line 507
    .line 508
    .line 509
    move-result-wide v9

    .line 510
    :goto_a
    move-wide v12, v9

    .line 511
    goto :goto_c

    .line 512
    :cond_16
    iget-wide v9, v4, Lzt4;->e:J

    .line 513
    .line 514
    iget-wide v12, v4, Lzt4;->d:J

    .line 515
    .line 516
    :goto_b
    add-long/2addr v9, v12

    .line 517
    goto :goto_a

    .line 518
    :cond_17
    invoke-virtual {v6}, Lmt2;->b()Z

    .line 519
    .line 520
    .line 521
    move-result v6

    .line 522
    if-eqz v6, :cond_18

    .line 523
    .line 524
    iget-wide v9, v3, Lph3;->s:J

    .line 525
    .line 526
    invoke-static {v3}, Li41;->j1(Lph3;)J

    .line 527
    .line 528
    .line 529
    move-result-wide v12

    .line 530
    goto :goto_c

    .line 531
    :cond_18
    iget-wide v9, v4, Lzt4;->e:J

    .line 532
    .line 533
    iget-wide v12, v3, Lph3;->s:J

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :goto_c
    new-instance v22, Lpi3;

    .line 537
    .line 538
    invoke-static {v9, v10}, Lf35;->i0(J)J

    .line 539
    .line 540
    .line 541
    move-result-wide v28

    .line 542
    invoke-static {v12, v13}, Lf35;->i0(J)J

    .line 543
    .line 544
    .line 545
    move-result-wide v30

    .line 546
    iget-object v4, v3, Lph3;->b:Lmt2;

    .line 547
    .line 548
    iget v6, v4, Lmt2;->b:I

    .line 549
    .line 550
    iget v4, v4, Lmt2;->c:I

    .line 551
    .line 552
    move/from16 v33, v4

    .line 553
    .line 554
    move/from16 v32, v6

    .line 555
    .line 556
    invoke-direct/range {v22 .. v33}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 557
    .line 558
    .line 559
    move-object/from16 v4, v22

    .line 560
    .line 561
    iget-object v6, v0, Lfq;->b:Lbu4;

    .line 562
    .line 563
    invoke-virtual {v0}, Li41;->o0()I

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    invoke-virtual {v0}, Li41;->y()I

    .line 568
    .line 569
    .line 570
    move-result v10

    .line 571
    iget-object v12, v0, Li41;->p0:Lph3;

    .line 572
    .line 573
    iget-object v12, v12, Lph3;->a:Lcu4;

    .line 574
    .line 575
    invoke-virtual {v12}, Lcu4;->p()Z

    .line 576
    .line 577
    .line 578
    move-result v12

    .line 579
    if-nez v12, :cond_19

    .line 580
    .line 581
    iget-object v10, v0, Li41;->p0:Lph3;

    .line 582
    .line 583
    iget-object v12, v10, Lph3;->b:Lmt2;

    .line 584
    .line 585
    iget-object v12, v12, Lmt2;->a:Ljava/lang/Object;

    .line 586
    .line 587
    iget-object v10, v10, Lph3;->a:Lcu4;

    .line 588
    .line 589
    iget-object v13, v0, Li41;->p:Lzt4;

    .line 590
    .line 591
    invoke-virtual {v10, v12, v13}, Lcu4;->g(Ljava/lang/Object;Lzt4;)Lzt4;

    .line 592
    .line 593
    .line 594
    iget-object v10, v0, Li41;->p0:Lph3;

    .line 595
    .line 596
    iget-object v10, v10, Lph3;->a:Lcu4;

    .line 597
    .line 598
    invoke-virtual {v10, v12}, Lcu4;->b(Ljava/lang/Object;)I

    .line 599
    .line 600
    .line 601
    move-result v10

    .line 602
    iget-object v13, v0, Li41;->p0:Lph3;

    .line 603
    .line 604
    iget-object v13, v13, Lph3;->a:Lcu4;

    .line 605
    .line 606
    const-wide/16 v14, 0x0

    .line 607
    .line 608
    invoke-virtual {v13, v9, v6, v14, v15}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 609
    .line 610
    .line 611
    move-result-object v13

    .line 612
    iget-object v13, v13, Lbu4;->a:Ljava/lang/Object;

    .line 613
    .line 614
    iget-object v6, v6, Lbu4;->b:Lgn2;

    .line 615
    .line 616
    move-object/from16 v25, v6

    .line 617
    .line 618
    move-object/from16 v26, v12

    .line 619
    .line 620
    move-object/from16 v23, v13

    .line 621
    .line 622
    :goto_d
    move/from16 v27, v10

    .line 623
    .line 624
    goto :goto_e

    .line 625
    :cond_19
    const/16 v23, 0x0

    .line 626
    .line 627
    const/16 v25, 0x0

    .line 628
    .line 629
    const/16 v26, 0x0

    .line 630
    .line 631
    goto :goto_d

    .line 632
    :goto_e
    invoke-static/range {p5 .. p6}, Lf35;->i0(J)J

    .line 633
    .line 634
    .line 635
    move-result-wide v28

    .line 636
    new-instance v22, Lpi3;

    .line 637
    .line 638
    iget-object v6, v0, Li41;->p0:Lph3;

    .line 639
    .line 640
    iget-object v6, v6, Lph3;->b:Lmt2;

    .line 641
    .line 642
    invoke-virtual {v6}, Lmt2;->b()Z

    .line 643
    .line 644
    .line 645
    move-result v6

    .line 646
    if-eqz v6, :cond_1a

    .line 647
    .line 648
    iget-object v6, v0, Li41;->p0:Lph3;

    .line 649
    .line 650
    invoke-static {v6}, Li41;->j1(Lph3;)J

    .line 651
    .line 652
    .line 653
    move-result-wide v12

    .line 654
    invoke-static {v12, v13}, Lf35;->i0(J)J

    .line 655
    .line 656
    .line 657
    move-result-wide v12

    .line 658
    move-wide/from16 v30, v12

    .line 659
    .line 660
    goto :goto_f

    .line 661
    :cond_1a
    move-wide/from16 v30, v28

    .line 662
    .line 663
    :goto_f
    iget-object v6, v0, Li41;->p0:Lph3;

    .line 664
    .line 665
    iget-object v6, v6, Lph3;->b:Lmt2;

    .line 666
    .line 667
    iget v10, v6, Lmt2;->b:I

    .line 668
    .line 669
    iget v6, v6, Lmt2;->c:I

    .line 670
    .line 671
    move/from16 v33, v6

    .line 672
    .line 673
    move/from16 v24, v9

    .line 674
    .line 675
    move/from16 v32, v10

    .line 676
    .line 677
    invoke-direct/range {v22 .. v33}, Lpi3;-><init>(Ljava/lang/Object;ILgn2;Ljava/lang/Object;IJJII)V

    .line 678
    .line 679
    .line 680
    move-object/from16 v6, v22

    .line 681
    .line 682
    iget-object v9, v0, Li41;->n:Ltc2;

    .line 683
    .line 684
    new-instance v10, Lz31;

    .line 685
    .line 686
    const/4 v14, 0x0

    .line 687
    invoke-direct {v10, v2, v4, v6, v14}, Lz31;-><init>(ILpi3;Lpi3;I)V

    .line 688
    .line 689
    .line 690
    const/16 v2, 0xb

    .line 691
    .line 692
    invoke-virtual {v9, v2, v10}, Ltc2;->c(ILqc2;)V

    .line 693
    .line 694
    .line 695
    goto :goto_10

    .line 696
    :cond_1b
    move/from16 v19, v6

    .line 697
    .line 698
    move/from16 v20, v9

    .line 699
    .line 700
    move/from16 v21, v10

    .line 701
    .line 702
    const/4 v14, 0x0

    .line 703
    :goto_10
    if-eqz v19, :cond_1c

    .line 704
    .line 705
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 706
    .line 707
    new-instance v4, La41;

    .line 708
    .line 709
    invoke-direct {v4, v8, v5, v14}, La41;-><init>(Lgn2;II)V

    .line 710
    .line 711
    .line 712
    const/4 v5, 0x1

    .line 713
    invoke-virtual {v2, v5, v4}, Ltc2;->c(ILqc2;)V

    .line 714
    .line 715
    .line 716
    :cond_1c
    iget-object v2, v3, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 717
    .line 718
    iget-object v4, v1, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 719
    .line 720
    const/4 v5, 0x7

    .line 721
    if-eq v2, v4, :cond_1d

    .line 722
    .line 723
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 724
    .line 725
    new-instance v4, Ls31;

    .line 726
    .line 727
    invoke-direct {v4, v1, v5}, Ls31;-><init>(Lph3;I)V

    .line 728
    .line 729
    .line 730
    const/16 v6, 0xa

    .line 731
    .line 732
    invoke-virtual {v2, v6, v4}, Ltc2;->c(ILqc2;)V

    .line 733
    .line 734
    .line 735
    iget-object v2, v1, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 736
    .line 737
    if-eqz v2, :cond_1d

    .line 738
    .line 739
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 740
    .line 741
    new-instance v4, Ls31;

    .line 742
    .line 743
    const/16 v8, 0x8

    .line 744
    .line 745
    invoke-direct {v4, v1, v8}, Ls31;-><init>(Lph3;I)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2, v6, v4}, Ltc2;->c(ILqc2;)V

    .line 749
    .line 750
    .line 751
    :cond_1d
    iget-object v2, v3, Lph3;->i:Lew4;

    .line 752
    .line 753
    iget-object v4, v1, Lph3;->i:Lew4;

    .line 754
    .line 755
    if-eq v2, v4, :cond_1e

    .line 756
    .line 757
    iget-object v2, v0, Li41;->j:Lpn0;

    .line 758
    .line 759
    iget-object v4, v4, Lew4;->s:Ljava/lang/Object;

    .line 760
    .line 761
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    check-cast v4, Lgg2;

    .line 765
    .line 766
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 767
    .line 768
    new-instance v4, Ls31;

    .line 769
    .line 770
    const/16 v6, 0x9

    .line 771
    .line 772
    invoke-direct {v4, v1, v6}, Ls31;-><init>(Lph3;I)V

    .line 773
    .line 774
    .line 775
    move/from16 v6, v17

    .line 776
    .line 777
    invoke-virtual {v2, v6, v4}, Ltc2;->c(ILqc2;)V

    .line 778
    .line 779
    .line 780
    :cond_1e
    if-nez v20, :cond_1f

    .line 781
    .line 782
    iget-object v2, v0, Li41;->S:Ldo2;

    .line 783
    .line 784
    iget-object v4, v0, Li41;->n:Ltc2;

    .line 785
    .line 786
    new-instance v6, Lr31;

    .line 787
    .line 788
    const/4 v14, 0x0

    .line 789
    invoke-direct {v6, v2, v14}, Lr31;-><init>(Ldo2;I)V

    .line 790
    .line 791
    .line 792
    const/16 v2, 0xe

    .line 793
    .line 794
    invoke-virtual {v4, v2, v6}, Ltc2;->c(ILqc2;)V

    .line 795
    .line 796
    .line 797
    goto :goto_11

    .line 798
    :cond_1f
    const/4 v14, 0x0

    .line 799
    :goto_11
    if-eqz v11, :cond_20

    .line 800
    .line 801
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 802
    .line 803
    new-instance v4, Ls31;

    .line 804
    .line 805
    invoke-direct {v4, v1, v14}, Ls31;-><init>(Lph3;I)V

    .line 806
    .line 807
    .line 808
    move/from16 v6, v18

    .line 809
    .line 810
    invoke-virtual {v2, v6, v4}, Ltc2;->c(ILqc2;)V

    .line 811
    .line 812
    .line 813
    :cond_20
    if-nez v21, :cond_21

    .line 814
    .line 815
    if-eqz v7, :cond_22

    .line 816
    .line 817
    :cond_21
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 818
    .line 819
    new-instance v4, Ls31;

    .line 820
    .line 821
    const/4 v6, 0x1

    .line 822
    invoke-direct {v4, v1, v6}, Ls31;-><init>(Lph3;I)V

    .line 823
    .line 824
    .line 825
    const/4 v9, -0x1

    .line 826
    invoke-virtual {v2, v9, v4}, Ltc2;->c(ILqc2;)V

    .line 827
    .line 828
    .line 829
    :cond_22
    const/4 v2, 0x4

    .line 830
    if-eqz v21, :cond_23

    .line 831
    .line 832
    iget-object v4, v0, Li41;->n:Ltc2;

    .line 833
    .line 834
    new-instance v6, Ls31;

    .line 835
    .line 836
    const/4 v8, 0x2

    .line 837
    invoke-direct {v6, v1, v8}, Ls31;-><init>(Lph3;I)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v4, v2, v6}, Ltc2;->c(ILqc2;)V

    .line 841
    .line 842
    .line 843
    :cond_23
    const/4 v4, 0x5

    .line 844
    if-nez v7, :cond_24

    .line 845
    .line 846
    iget v6, v3, Lph3;->m:I

    .line 847
    .line 848
    iget v7, v1, Lph3;->m:I

    .line 849
    .line 850
    if-eq v6, v7, :cond_25

    .line 851
    .line 852
    :cond_24
    iget-object v6, v0, Li41;->n:Ltc2;

    .line 853
    .line 854
    new-instance v7, Ls31;

    .line 855
    .line 856
    const/4 v8, 0x3

    .line 857
    invoke-direct {v7, v1, v8}, Ls31;-><init>(Lph3;I)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v6, v4, v7}, Ltc2;->c(ILqc2;)V

    .line 861
    .line 862
    .line 863
    :cond_25
    iget v6, v3, Lph3;->n:I

    .line 864
    .line 865
    iget v7, v1, Lph3;->n:I

    .line 866
    .line 867
    const/4 v8, 0x6

    .line 868
    if-eq v6, v7, :cond_26

    .line 869
    .line 870
    iget-object v6, v0, Li41;->n:Ltc2;

    .line 871
    .line 872
    new-instance v7, Ls31;

    .line 873
    .line 874
    invoke-direct {v7, v1, v2}, Ls31;-><init>(Lph3;I)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v6, v8, v7}, Ltc2;->c(ILqc2;)V

    .line 878
    .line 879
    .line 880
    :cond_26
    invoke-virtual {v3}, Lph3;->m()Z

    .line 881
    .line 882
    .line 883
    move-result v2

    .line 884
    invoke-virtual {v1}, Lph3;->m()Z

    .line 885
    .line 886
    .line 887
    move-result v6

    .line 888
    if-eq v2, v6, :cond_27

    .line 889
    .line 890
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 891
    .line 892
    new-instance v6, Ls31;

    .line 893
    .line 894
    invoke-direct {v6, v1, v4}, Ls31;-><init>(Lph3;I)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v2, v5, v6}, Ltc2;->c(ILqc2;)V

    .line 898
    .line 899
    .line 900
    :cond_27
    iget-object v2, v3, Lph3;->o:Lqh3;

    .line 901
    .line 902
    iget-object v4, v1, Lph3;->o:Lqh3;

    .line 903
    .line 904
    invoke-virtual {v2, v4}, Lqh3;->equals(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    if-nez v2, :cond_28

    .line 909
    .line 910
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 911
    .line 912
    new-instance v4, Ls31;

    .line 913
    .line 914
    invoke-direct {v4, v1, v8}, Ls31;-><init>(Lph3;I)V

    .line 915
    .line 916
    .line 917
    const/16 v5, 0xc

    .line 918
    .line 919
    invoke-virtual {v2, v5, v4}, Ltc2;->c(ILqc2;)V

    .line 920
    .line 921
    .line 922
    :cond_28
    invoke-virtual {v0}, Li41;->v1()V

    .line 923
    .line 924
    .line 925
    iget-object v2, v0, Li41;->n:Ltc2;

    .line 926
    .line 927
    invoke-virtual {v2}, Ltc2;->b()V

    .line 928
    .line 929
    .line 930
    iget-boolean v2, v3, Lph3;->p:Z

    .line 931
    .line 932
    iget-boolean v1, v1, Lph3;->p:Z

    .line 933
    .line 934
    if-eq v2, v1, :cond_29

    .line 935
    .line 936
    iget-object v0, v0, Li41;->o:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 943
    .line 944
    .line 945
    move-result v1

    .line 946
    if-eqz v1, :cond_29

    .line 947
    .line 948
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v1

    .line 952
    check-cast v1, Ld41;

    .line 953
    .line 954
    iget-object v1, v1, Ld41;->n:Li41;

    .line 955
    .line 956
    invoke-virtual {v1}, Li41;->y1()V

    .line 957
    .line 958
    .line 959
    goto :goto_12

    .line 960
    :cond_29
    return-void
.end method

.method public final y()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 5
    .line 6
    iget-object v0, v0, Lph3;->a:Lcu4;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget p0, p0, Li41;->q0:I

    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    :cond_0
    return p0

    .line 21
    :cond_1
    iget-object p0, p0, Li41;->p0:Lph3;

    .line 22
    .line 23
    iget-object v0, p0, Lph3;->a:Lcu4;

    .line 24
    .line 25
    iget-object p0, p0, Lph3;->b:Lmt2;

    .line 26
    .line 27
    iget-object p0, p0, Lmt2;->a:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lcu4;->b(Ljava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public final y0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return p0
.end method

.method public final y1()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Li41;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Li41;->B:Ly10;

    .line 6
    .line 7
    iget-object v2, p0, Li41;->A:Ly10;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eq v0, v4, :cond_3

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    if-eq v0, v5, :cond_1

    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    if-eq v0, v5, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x4

    .line 20
    if-ne v0, p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, Ltb4;->a()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {p0}, Li41;->z1()V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Li41;->p0:Lph3;

    .line 31
    .line 32
    iget-boolean v0, v0, Lph3;->p:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Li41;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    move v3, v4

    .line 43
    :cond_2
    invoke-virtual {v2, v3}, Ly10;->k(Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Li41;->q()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {v1, p0}, Ly10;->k(Z)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    :goto_0
    invoke-virtual {v2, v3}, Ly10;->k(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ly10;->k(Z)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final z()Ls55;
    .locals 0

    .line 1
    invoke-virtual {p0}, Li41;->z1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Li41;->k0:Ls55;

    .line 5
    .line 6
    return-object p0
.end method

.method public final z1()V
    .locals 5

    .line 1
    iget-object v0, p0, Li41;->e:Lq90;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq90;->b()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Li41;->u:Landroid/os/Looper;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v0, v2, :cond_2

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 35
    .line 36
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    const-string v2, "\'\nExpected thread: \'"

    .line 39
    .line 40
    const-string v3, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 41
    .line 42
    const-string v4, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 43
    .line 44
    invoke-static {v4, v0, v2, v1, v3}, Lf34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-boolean v1, p0, Li41;->f0:Z

    .line 49
    .line 50
    if-nez v1, :cond_1

    .line 51
    .line 52
    iget-boolean v1, p0, Li41;->g0:Z

    .line 53
    .line 54
    if-eqz v1, :cond_0

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_0
    const-string v2, "ExoPlayerImpl"

    .line 64
    .line 65
    invoke-static {v2, v0, v1}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    iput-boolean v0, p0, Li41;->g0:Z

    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method
