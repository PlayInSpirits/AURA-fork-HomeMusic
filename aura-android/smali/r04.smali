.class public final Lr04;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Luh0;
.implements Lrh0;


# instance fields
.field public final n:Lxi0;

.field public final o:Lwi0;

.field public p:I

.field public q:I

.field public r:Lf42;

.field public s:Ljava/util/List;

.field public t:I

.field public volatile u:Ltw2;

.field public v:Ljava/io/File;

.field public w:Ls04;


# direct methods
.method public constructor <init>(Lwi0;Lxi0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lr04;->q:I

    .line 6
    .line 7
    iput-object p1, p0, Lr04;->o:Lwi0;

    .line 8
    .line 9
    iput-object p2, p0, Lr04;->n:Lxi0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr04;->n:Lxi0;

    .line 2
    .line 3
    iget-object v1, p0, Lr04;->w:Ls04;

    .line 4
    .line 5
    iget-object p0, p0, Lr04;->u:Ltw2;

    .line 6
    .line 7
    iget-object p0, p0, Ltw2;->c:Lsh0;

    .line 8
    .line 9
    const/4 v2, 0x4

    .line 10
    invoke-virtual {v0, v1, p1, p0, v2}, Lxi0;->b(Lf42;Ljava/lang/Exception;Lsh0;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c()Z
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "Failed to find any load path from "

    .line 4
    .line 5
    iget-object v2, v0, Lr04;->o:Lwi0;

    .line 6
    .line 7
    invoke-virtual {v2}, Lwi0;->a()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const/16 v17, 0x0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    iget-object v3, v0, Lr04;->o:Lwi0;

    .line 22
    .line 23
    iget-object v5, v3, Lwi0;->c:Lii1;

    .line 24
    .line 25
    invoke-virtual {v5}, Lii1;->a()Ley3;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v6, v3, Lwi0;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget-object v7, v3, Lwi0;->g:Ljava/lang/Class;

    .line 36
    .line 37
    iget-object v3, v3, Lwi0;->k:Ljava/lang/Class;

    .line 38
    .line 39
    iget-object v8, v5, Ley3;->h:Lqr2;

    .line 40
    .line 41
    iget-object v9, v8, Lqr2;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v9, Ljava/util/concurrent/atomic/AtomicReference;

    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-virtual {v9, v10}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    check-cast v9, Lyy2;

    .line 51
    .line 52
    if-nez v9, :cond_1

    .line 53
    .line 54
    new-instance v9, Lyy2;

    .line 55
    .line 56
    invoke-direct {v9, v6, v7, v3}, Lyy2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iput-object v6, v9, Lyy2;->a:Ljava/lang/Class;

    .line 61
    .line 62
    iput-object v7, v9, Lyy2;->b:Ljava/lang/Class;

    .line 63
    .line 64
    iput-object v3, v9, Lyy2;->c:Ljava/lang/Class;

    .line 65
    .line 66
    :goto_0
    iget-object v11, v8, Lqr2;->p:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v11, Loi;

    .line 69
    .line 70
    monitor-enter v11

    .line 71
    :try_start_0
    iget-object v12, v8, Lqr2;->p:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v12, Loi;

    .line 74
    .line 75
    invoke-virtual {v12, v9}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    check-cast v12, Ljava/util/List;

    .line 80
    .line 81
    monitor-exit v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 82
    iget-object v8, v8, Lqr2;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 85
    .line 86
    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    if-nez v12, :cond_5

    .line 90
    .line 91
    new-instance v12, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-object v8, v5, Ley3;->a:Lrf2;

    .line 97
    .line 98
    monitor-enter v8

    .line 99
    :try_start_1
    iget-object v9, v8, Lrf2;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v9, Lna4;

    .line 102
    .line 103
    invoke-virtual {v9, v6}, Lna4;->y(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 104
    .line 105
    .line 106
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 107
    monitor-exit v8

    .line 108
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    const/4 v11, 0x0

    .line 113
    :cond_2
    if-ge v11, v8, :cond_4

    .line 114
    .line 115
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    add-int/lit8 v11, v11, 0x1

    .line 120
    .line 121
    check-cast v13, Ljava/lang/Class;

    .line 122
    .line 123
    iget-object v14, v5, Ley3;->c:Lrf2;

    .line 124
    .line 125
    invoke-virtual {v14, v13, v7}, Lrf2;->f(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v14

    .line 133
    const/4 v15, 0x0

    .line 134
    :goto_1
    if-ge v15, v14, :cond_2

    .line 135
    .line 136
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v16

    .line 140
    add-int/lit8 v15, v15, 0x1

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    move-object/from16 v4, v16

    .line 145
    .line 146
    check-cast v4, Ljava/lang/Class;

    .line 147
    .line 148
    iget-object v10, v5, Ley3;->f:Lc52;

    .line 149
    .line 150
    invoke-virtual {v10, v4, v3}, Lc52;->e(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-nez v10, :cond_3

    .line 159
    .line 160
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v10

    .line 164
    if-nez v10, :cond_3

    .line 165
    .line 166
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    :cond_3
    const/4 v10, 0x0

    .line 170
    goto :goto_1

    .line 171
    :cond_4
    const/16 v17, 0x0

    .line 172
    .line 173
    iget-object v4, v5, Ley3;->h:Lqr2;

    .line 174
    .line 175
    invoke-static {v12}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    iget-object v8, v4, Lqr2;->p:Ljava/lang/Object;

    .line 180
    .line 181
    move-object v9, v8

    .line 182
    check-cast v9, Loi;

    .line 183
    .line 184
    monitor-enter v9

    .line 185
    :try_start_2
    iget-object v4, v4, Lqr2;->p:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v4, Loi;

    .line 188
    .line 189
    new-instance v8, Lyy2;

    .line 190
    .line 191
    invoke-direct {v8, v6, v7, v3}, Lyy2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v4, v8, v5}, Lyd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    monitor-exit v9

    .line 198
    goto :goto_2

    .line 199
    :catchall_0
    move-exception v0

    .line 200
    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 201
    throw v0

    .line 202
    :catchall_1
    move-exception v0

    .line 203
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 204
    throw v0

    .line 205
    :cond_5
    const/16 v17, 0x0

    .line 206
    .line 207
    :goto_2
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_7

    .line 212
    .line 213
    const-class v2, Ljava/io/File;

    .line 214
    .line 215
    iget-object v3, v0, Lr04;->o:Lwi0;

    .line 216
    .line 217
    iget-object v3, v3, Lwi0;->k:Ljava/lang/Class;

    .line 218
    .line 219
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_6

    .line 224
    .line 225
    goto/16 :goto_5

    .line 226
    .line 227
    :cond_6
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    new-instance v3, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-object v1, v0, Lr04;->o:Lwi0;

    .line 235
    .line 236
    iget-object v1, v1, Lwi0;->d:Ljava/lang/Object;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v1, " to "

    .line 246
    .line 247
    iget-object v0, v0, Lr04;->o:Lwi0;

    .line 248
    .line 249
    iget-object v0, v0, Lwi0;->k:Ljava/lang/Class;

    .line 250
    .line 251
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v2

    .line 265
    :cond_7
    :goto_3
    iget-object v1, v0, Lr04;->s:Ljava/util/List;

    .line 266
    .line 267
    const/4 v3, 0x1

    .line 268
    if-eqz v1, :cond_a

    .line 269
    .line 270
    iget v4, v0, Lr04;->t:I

    .line 271
    .line 272
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-ge v4, v1, :cond_a

    .line 277
    .line 278
    const/4 v1, 0x0

    .line 279
    iput-object v1, v0, Lr04;->u:Ltw2;

    .line 280
    .line 281
    move/from16 v4, v17

    .line 282
    .line 283
    :cond_8
    :goto_4
    if-nez v4, :cond_9

    .line 284
    .line 285
    iget v1, v0, Lr04;->t:I

    .line 286
    .line 287
    iget-object v2, v0, Lr04;->s:Ljava/util/List;

    .line 288
    .line 289
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    if-ge v1, v2, :cond_9

    .line 294
    .line 295
    iget-object v1, v0, Lr04;->s:Ljava/util/List;

    .line 296
    .line 297
    iget v2, v0, Lr04;->t:I

    .line 298
    .line 299
    add-int/lit8 v5, v2, 0x1

    .line 300
    .line 301
    iput v5, v0, Lr04;->t:I

    .line 302
    .line 303
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    check-cast v1, Luw2;

    .line 308
    .line 309
    iget-object v2, v0, Lr04;->v:Ljava/io/File;

    .line 310
    .line 311
    iget-object v5, v0, Lr04;->o:Lwi0;

    .line 312
    .line 313
    iget v6, v5, Lwi0;->e:I

    .line 314
    .line 315
    iget v7, v5, Lwi0;->f:I

    .line 316
    .line 317
    iget-object v5, v5, Lwi0;->i:Ldb3;

    .line 318
    .line 319
    invoke-interface {v1, v2, v6, v7, v5}, Luw2;->b(Ljava/lang/Object;IILdb3;)Ltw2;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    iput-object v1, v0, Lr04;->u:Ltw2;

    .line 324
    .line 325
    iget-object v1, v0, Lr04;->u:Ltw2;

    .line 326
    .line 327
    if-eqz v1, :cond_8

    .line 328
    .line 329
    iget-object v1, v0, Lr04;->o:Lwi0;

    .line 330
    .line 331
    iget-object v2, v0, Lr04;->u:Ltw2;

    .line 332
    .line 333
    iget-object v2, v2, Ltw2;->c:Lsh0;

    .line 334
    .line 335
    invoke-interface {v2}, Lsh0;->a()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v1, v2}, Lwi0;->c(Ljava/lang/Class;)Lfd2;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    if-eqz v1, :cond_8

    .line 344
    .line 345
    iget-object v1, v0, Lr04;->u:Ltw2;

    .line 346
    .line 347
    iget-object v1, v1, Ltw2;->c:Lsh0;

    .line 348
    .line 349
    iget-object v2, v0, Lr04;->o:Lwi0;

    .line 350
    .line 351
    iget-object v2, v2, Lwi0;->o:Leq3;

    .line 352
    .line 353
    invoke-interface {v1, v2, v0}, Lsh0;->d(Leq3;Lrh0;)V

    .line 354
    .line 355
    .line 356
    move v4, v3

    .line 357
    goto :goto_4

    .line 358
    :cond_9
    return v4

    .line 359
    :cond_a
    const/4 v1, 0x0

    .line 360
    iget v4, v0, Lr04;->q:I

    .line 361
    .line 362
    add-int/2addr v4, v3

    .line 363
    iput v4, v0, Lr04;->q:I

    .line 364
    .line 365
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    if-lt v4, v5, :cond_c

    .line 370
    .line 371
    iget v4, v0, Lr04;->p:I

    .line 372
    .line 373
    add-int/2addr v4, v3

    .line 374
    iput v4, v0, Lr04;->p:I

    .line 375
    .line 376
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    if-lt v4, v3, :cond_b

    .line 381
    .line 382
    :goto_5
    return v17

    .line 383
    :cond_b
    move/from16 v3, v17

    .line 384
    .line 385
    iput v3, v0, Lr04;->q:I

    .line 386
    .line 387
    :cond_c
    iget v3, v0, Lr04;->p:I

    .line 388
    .line 389
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    move-object/from16 v20, v3

    .line 394
    .line 395
    check-cast v20, Lf42;

    .line 396
    .line 397
    iget v3, v0, Lr04;->q:I

    .line 398
    .line 399
    invoke-interface {v12, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    check-cast v3, Ljava/lang/Class;

    .line 404
    .line 405
    iget-object v4, v0, Lr04;->o:Lwi0;

    .line 406
    .line 407
    invoke-virtual {v4, v3}, Lwi0;->e(Ljava/lang/Class;)Luw4;

    .line 408
    .line 409
    .line 410
    move-result-object v24

    .line 411
    new-instance v18, Ls04;

    .line 412
    .line 413
    iget-object v4, v0, Lr04;->o:Lwi0;

    .line 414
    .line 415
    iget-object v5, v4, Lwi0;->c:Lii1;

    .line 416
    .line 417
    iget-object v5, v5, Lii1;->a:Lqj0;

    .line 418
    .line 419
    iget-object v6, v4, Lwi0;->n:Lf42;

    .line 420
    .line 421
    iget v7, v4, Lwi0;->e:I

    .line 422
    .line 423
    iget v8, v4, Lwi0;->f:I

    .line 424
    .line 425
    iget-object v9, v4, Lwi0;->i:Ldb3;

    .line 426
    .line 427
    move-object/from16 v25, v3

    .line 428
    .line 429
    move-object/from16 v19, v5

    .line 430
    .line 431
    move-object/from16 v21, v6

    .line 432
    .line 433
    move/from16 v22, v7

    .line 434
    .line 435
    move/from16 v23, v8

    .line 436
    .line 437
    move-object/from16 v26, v9

    .line 438
    .line 439
    invoke-direct/range {v18 .. v26}, Ls04;-><init>(Lqj0;Lf42;Lf42;IILuw4;Ljava/lang/Class;Ldb3;)V

    .line 440
    .line 441
    .line 442
    move-object/from16 v5, v18

    .line 443
    .line 444
    move-object/from16 v3, v20

    .line 445
    .line 446
    iput-object v5, v0, Lr04;->w:Ls04;

    .line 447
    .line 448
    iget-object v4, v4, Lwi0;->h:Lsd0;

    .line 449
    .line 450
    invoke-virtual {v4}, Lsd0;->a()Lwq0;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    iget-object v5, v0, Lr04;->w:Ls04;

    .line 455
    .line 456
    invoke-interface {v4, v5}, Lwq0;->m(Lf42;)Ljava/io/File;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    iput-object v4, v0, Lr04;->v:Ljava/io/File;

    .line 461
    .line 462
    if-eqz v4, :cond_d

    .line 463
    .line 464
    iput-object v3, v0, Lr04;->r:Lf42;

    .line 465
    .line 466
    iget-object v3, v0, Lr04;->o:Lwi0;

    .line 467
    .line 468
    iget-object v3, v3, Lwi0;->c:Lii1;

    .line 469
    .line 470
    invoke-virtual {v3}, Lii1;->a()Ley3;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v3, v4}, Ley3;->f(Ljava/lang/Object;)Ljava/util/List;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    iput-object v3, v0, Lr04;->s:Ljava/util/List;

    .line 479
    .line 480
    const/4 v3, 0x0

    .line 481
    iput v3, v0, Lr04;->t:I

    .line 482
    .line 483
    goto :goto_6

    .line 484
    :cond_d
    const/4 v3, 0x0

    .line 485
    :goto_6
    move/from16 v17, v3

    .line 486
    .line 487
    goto/16 :goto_3

    .line 488
    .line 489
    :catchall_2
    move-exception v0

    .line 490
    :try_start_4
    monitor-exit v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 491
    throw v0
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lr04;->u:Ltw2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ltw2;->c:Lsh0;

    .line 6
    .line 7
    invoke-interface {p0}, Lsh0;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr04;->n:Lxi0;

    .line 2
    .line 3
    iget-object v1, p0, Lr04;->r:Lf42;

    .line 4
    .line 5
    iget-object v2, p0, Lr04;->u:Ltw2;

    .line 6
    .line 7
    iget-object v3, v2, Ltw2;->c:Lsh0;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    iget-object v5, p0, Lr04;->w:Ls04;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    invoke-virtual/range {v0 .. v5}, Lxi0;->a(Lf42;Ljava/lang/Object;Lsh0;ILf42;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
