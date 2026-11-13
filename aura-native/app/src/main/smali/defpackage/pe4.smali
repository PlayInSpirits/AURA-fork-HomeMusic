.class public final Ldefpackage/pe4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:I

.field public final B:I

.field public final C:I

.field public final D:Ldefpackage/ne4;

.field public final E:Ldefpackage/xm;

.field public final F:Ldefpackage/xm;

.field public final G:Ldefpackage/xm;

.field public final H:Ldefpackage/xm;

.field public final I:Z

.field public final J:I

.field public final K:J

.field public final L:Z

.field public final a:Ldefpackage/mi3;

.field public final b:Z

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Landroidx/media3/common/PlaybackException;

.field public final g:I

.field public final h:Z

.field public final i:J

.field public final j:J

.field public final k:J

.field public final l:Ldefpackage/qh3;

.field public final m:Ldefpackage/cw4;

.field public final n:Ldefpackage/il;

.field public final o:F

.field public final p:F

.field public final q:Ldefpackage/s55;

.field public final r:Ldefpackage/jg0;

.field public final s:Ldefpackage/hp0;

.field public final t:I

.field public final u:Ldefpackage/pf4;

.field public final v:Ldefpackage/qv2;

.field public final w:Ldefpackage/cu4;

.field public final x:Ldefpackage/jw4;

.field public final y:Ldefpackage/do2;

.field public final z:Ldefpackage/do2;


# direct methods
.method public constructor <init>(Ldefpackage/oe4;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, Ldefpackage/oe4;->y:Ldefpackage/jw4;

    .line 9
    .line 10
    iget-object v3, v1, Ldefpackage/oe4;->z:Ldefpackage/do2;

    .line 11
    .line 12
    iget-object v4, v1, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 13
    .line 14
    invoke-virtual {v4}, Ldefpackage/cu4;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, 0x4

    .line 19
    const/4 v6, -0x1

    .line 20
    const/4 v7, 0x1

    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz v4, :cond_4

    .line 23
    .line 24
    iget v4, v1, Ldefpackage/oe4;->d:I

    .line 25
    .line 26
    if-eq v4, v7, :cond_1

    .line 27
    .line 28
    if-ne v4, v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v4, v8

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    move v4, v7

    .line 34
    :goto_1
    const-string v9, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED"

    .line 35
    .line 36
    invoke-static {v9, v4}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    iget v4, v1, Ldefpackage/oe4;->C:I

    .line 40
    .line 41
    if-ne v4, v6, :cond_2

    .line 42
    .line 43
    iget v4, v1, Ldefpackage/oe4;->D:I

    .line 44
    .line 45
    if-ne v4, v6, :cond_2

    .line 46
    .line 47
    move v4, v7

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v4, v8

    .line 50
    :goto_2
    const-string v9, "Ads not allowed if playlist is empty"

    .line 51
    .line 52
    invoke-static {v9, v4}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    sget-object v2, Ldefpackage/jw4;->b:Ldefpackage/jw4;

    .line 58
    .line 59
    :cond_3
    if-nez v3, :cond_10

    .line 60
    .line 61
    sget-object v3, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 62
    .line 63
    goto/16 :goto_b

    .line 64
    .line 65
    :cond_4
    iget v4, v1, Ldefpackage/oe4;->B:I

    .line 66
    .line 67
    if-ne v4, v6, :cond_5

    .line 68
    .line 69
    move v14, v8

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    iget-object v9, v1, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 72
    .line 73
    invoke-virtual {v9}, Ldefpackage/cu4;->o()I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-ge v4, v9, :cond_6

    .line 78
    .line 79
    move v9, v7

    .line 80
    goto :goto_3

    .line 81
    :cond_6
    move v9, v8

    .line 82
    :goto_3
    const-string v10, "currentMediaItemIndex must be less than playlist.size()"

    .line 83
    .line 84
    invoke-static {v10, v9}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    move v14, v4

    .line 88
    :goto_4
    iget v4, v1, Ldefpackage/oe4;->C:I

    .line 89
    .line 90
    if-eq v4, v6, :cond_a

    .line 91
    .line 92
    new-instance v13, Ldefpackage/zt4;

    .line 93
    .line 94
    invoke-direct {v13}, Ldefpackage/zt4;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v12, Ldefpackage/bu4;

    .line 98
    .line 99
    invoke-direct {v12}, Ldefpackage/bu4;-><init>()V

    .line 100
    .line 101
    .line 102
    iget-object v4, v1, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 103
    .line 104
    if-eqz v4, :cond_7

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 107
    .line 108
    .line 109
    move-result-wide v9

    .line 110
    goto :goto_5

    .line 111
    :cond_7
    iget-object v4, v1, Ldefpackage/oe4;->F:Ldefpackage/ne4;

    .line 112
    .line 113
    invoke-interface {v4}, Ldefpackage/ne4;->get()J

    .line 114
    .line 115
    .line 116
    move-result-wide v9

    .line 117
    :goto_5
    iget-object v11, v1, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 118
    .line 119
    invoke-static {v9, v10}, Ldefpackage/f35;->Q(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v15

    .line 123
    invoke-virtual/range {v11 .. v16}, Ldefpackage/cu4;->i(Ldefpackage/bu4;Ldefpackage/zt4;IJ)Landroid/util/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {v11, v4}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    iget-object v9, v1, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 134
    .line 135
    invoke-virtual {v9, v4, v13, v8}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 136
    .line 137
    .line 138
    iget v4, v1, Ldefpackage/oe4;->C:I

    .line 139
    .line 140
    iget-object v9, v13, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 141
    .line 142
    iget v9, v9, Ldefpackage/z5;->a:I

    .line 143
    .line 144
    if-ge v4, v9, :cond_8

    .line 145
    .line 146
    move v4, v7

    .line 147
    goto :goto_6

    .line 148
    :cond_8
    move v4, v8

    .line 149
    :goto_6
    const-string v9, "PeriodData has less ad groups than adGroupIndex"

    .line 150
    .line 151
    invoke-static {v9, v4}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    iget v4, v1, Ldefpackage/oe4;->C:I

    .line 155
    .line 156
    iget-object v9, v13, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 157
    .line 158
    invoke-virtual {v9, v4}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iget v4, v4, Ldefpackage/x5;->b:I

    .line 163
    .line 164
    if-eq v4, v6, :cond_a

    .line 165
    .line 166
    iget v9, v1, Ldefpackage/oe4;->D:I

    .line 167
    .line 168
    if-ge v9, v4, :cond_9

    .line 169
    .line 170
    move v4, v7

    .line 171
    goto :goto_7

    .line 172
    :cond_9
    move v4, v8

    .line 173
    :goto_7
    const-string v9, "Ad group has less ads than adIndexInGroupIndex"

    .line 174
    .line 175
    invoke-static {v9, v4}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 176
    .line 177
    .line 178
    :cond_a
    iget-object v4, v1, Ldefpackage/oe4;->w:Ldefpackage/yw1;

    .line 179
    .line 180
    if-eqz v4, :cond_b

    .line 181
    .line 182
    invoke-interface {v4, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Ldefpackage/he4;

    .line 187
    .line 188
    iget-object v3, v2, Ldefpackage/he4;->b:Ldefpackage/jw4;

    .line 189
    .line 190
    iget-object v2, v2, Ldefpackage/he4;->d:Ldefpackage/do2;

    .line 191
    .line 192
    move-object/from16 v17, v3

    .line 193
    .line 194
    move-object v3, v2

    .line 195
    move-object/from16 v2, v17

    .line 196
    .line 197
    :cond_b
    if-nez v3, :cond_f

    .line 198
    .line 199
    iget-object v3, v1, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 200
    .line 201
    new-instance v4, Ldefpackage/bu4;

    .line 202
    .line 203
    invoke-direct {v4}, Ldefpackage/bu4;-><init>()V

    .line 204
    .line 205
    .line 206
    const-wide/16 v9, 0x0

    .line 207
    .line 208
    invoke-virtual {v3, v14, v4, v9, v10}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    iget-object v3, v3, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    new-instance v4, Ldefpackage/co2;

    .line 218
    .line 219
    invoke-direct {v4}, Ldefpackage/co2;-><init>()V

    .line 220
    .line 221
    .line 222
    iget-object v9, v2, Ldefpackage/jw4;->a:Ldefpackage/yw1;

    .line 223
    .line 224
    invoke-virtual {v9}, Ljava/util/AbstractCollection;->size()I

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    move v11, v8

    .line 229
    :goto_8
    if-ge v11, v10, :cond_e

    .line 230
    .line 231
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    check-cast v12, Ldefpackage/iw4;

    .line 236
    .line 237
    move v13, v8

    .line 238
    :goto_9
    iget v14, v12, Ldefpackage/iw4;->a:I

    .line 239
    .line 240
    if-ge v13, v14, :cond_d

    .line 241
    .line 242
    iget-object v14, v12, Ldefpackage/iw4;->e:[Z

    .line 243
    .line 244
    aget-boolean v14, v14, v13

    .line 245
    .line 246
    if-eqz v14, :cond_c

    .line 247
    .line 248
    invoke-virtual {v12, v13}, Ldefpackage/iw4;->a(I)Ldefpackage/tb1;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    iget-object v15, v14, Ldefpackage/tb1;->l:Ldefpackage/qv2;

    .line 253
    .line 254
    if-eqz v15, :cond_c

    .line 255
    .line 256
    move v15, v8

    .line 257
    :goto_a
    iget-object v8, v14, Ldefpackage/tb1;->l:Ldefpackage/qv2;

    .line 258
    .line 259
    iget-object v8, v8, Ldefpackage/qv2;->a:[Ldefpackage/pv2;

    .line 260
    .line 261
    array-length v6, v8

    .line 262
    if-ge v15, v6, :cond_c

    .line 263
    .line 264
    aget-object v6, v8, v15

    .line 265
    .line 266
    invoke-interface {v6, v4}, Ldefpackage/pv2;->b(Ldefpackage/co2;)V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v15, v15, 0x1

    .line 270
    .line 271
    const/4 v6, -0x1

    .line 272
    goto :goto_a

    .line 273
    :cond_c
    add-int/lit8 v13, v13, 0x1

    .line 274
    .line 275
    const/4 v6, -0x1

    .line 276
    const/4 v8, 0x0

    .line 277
    goto :goto_9

    .line 278
    :cond_d
    add-int/lit8 v11, v11, 0x1

    .line 279
    .line 280
    const/4 v6, -0x1

    .line 281
    const/4 v8, 0x0

    .line 282
    goto :goto_8

    .line 283
    :cond_e
    iget-object v3, v3, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 284
    .line 285
    invoke-virtual {v4, v3}, Ldefpackage/co2;->b(Ldefpackage/do2;)V

    .line 286
    .line 287
    .line 288
    new-instance v3, Ldefpackage/do2;

    .line 289
    .line 290
    invoke-direct {v3, v4}, Ldefpackage/do2;-><init>(Ldefpackage/co2;)V

    .line 291
    .line 292
    .line 293
    move v8, v7

    .line 294
    goto :goto_b

    .line 295
    :cond_f
    const/4 v8, 0x0

    .line 296
    :cond_10
    :goto_b
    iget-object v4, v1, Ldefpackage/oe4;->f:Landroidx/media3/common/PlaybackException;

    .line 297
    .line 298
    if-eqz v4, :cond_12

    .line 299
    .line 300
    iget v4, v1, Ldefpackage/oe4;->d:I

    .line 301
    .line 302
    if-ne v4, v7, :cond_11

    .line 303
    .line 304
    move v4, v7

    .line 305
    goto :goto_c

    .line 306
    :cond_11
    const/4 v4, 0x0

    .line 307
    :goto_c
    const-string v6, "Player error only allowed in STATE_IDLE"

    .line 308
    .line 309
    invoke-static {v6, v4}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 310
    .line 311
    .line 312
    :cond_12
    iget v4, v1, Ldefpackage/oe4;->d:I

    .line 313
    .line 314
    iget-object v4, v1, Ldefpackage/oe4;->F:Ldefpackage/ne4;

    .line 315
    .line 316
    iget-object v5, v1, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 317
    .line 318
    if-eqz v5, :cond_14

    .line 319
    .line 320
    iget v4, v1, Ldefpackage/oe4;->C:I

    .line 321
    .line 322
    const/4 v6, -0x1

    .line 323
    if-ne v4, v6, :cond_13

    .line 324
    .line 325
    iget-boolean v4, v1, Ldefpackage/oe4;->b:Z

    .line 326
    .line 327
    if-eqz v4, :cond_13

    .line 328
    .line 329
    iget v4, v1, Ldefpackage/oe4;->d:I

    .line 330
    .line 331
    const/4 v6, 0x3

    .line 332
    if-ne v4, v6, :cond_13

    .line 333
    .line 334
    iget v4, v1, Ldefpackage/oe4;->e:I

    .line 335
    .line 336
    if-nez v4, :cond_13

    .line 337
    .line 338
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 339
    .line 340
    .line 341
    move-result-wide v4

    .line 342
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    cmp-long v4, v4, v6

    .line 348
    .line 349
    if-eqz v4, :cond_13

    .line 350
    .line 351
    iget-object v4, v1, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 354
    .line 355
    .line 356
    move-result-wide v10

    .line 357
    iget-object v4, v1, Ldefpackage/oe4;->l:Ldefpackage/qh3;

    .line 358
    .line 359
    iget v14, v4, Ldefpackage/qh3;->a:F

    .line 360
    .line 361
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 362
    .line 363
    .line 364
    move-result-wide v12

    .line 365
    new-instance v9, Ldefpackage/me4;

    .line 366
    .line 367
    invoke-direct/range {v9 .. v14}, Ldefpackage/me4;-><init>(JJF)V

    .line 368
    .line 369
    .line 370
    move-object v4, v9

    .line 371
    goto :goto_d

    .line 372
    :cond_13
    iget-object v4, v1, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 373
    .line 374
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 375
    .line 376
    .line 377
    move-result-wide v4

    .line 378
    new-instance v6, Ldefpackage/xm;

    .line 379
    .line 380
    invoke-direct {v6, v4, v5}, Ldefpackage/xm;-><init>(J)V

    .line 381
    .line 382
    .line 383
    move-object v4, v6

    .line 384
    :cond_14
    :goto_d
    iget-object v5, v1, Ldefpackage/oe4;->G:Ldefpackage/xm;

    .line 385
    .line 386
    iget-object v6, v1, Ldefpackage/oe4;->a:Ldefpackage/mi3;

    .line 387
    .line 388
    iput-object v6, v0, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 389
    .line 390
    iget-boolean v6, v1, Ldefpackage/oe4;->b:Z

    .line 391
    .line 392
    iput-boolean v6, v0, Ldefpackage/pe4;->b:Z

    .line 393
    .line 394
    iget v6, v1, Ldefpackage/oe4;->c:I

    .line 395
    .line 396
    iput v6, v0, Ldefpackage/pe4;->c:I

    .line 397
    .line 398
    iget v6, v1, Ldefpackage/oe4;->d:I

    .line 399
    .line 400
    iput v6, v0, Ldefpackage/pe4;->d:I

    .line 401
    .line 402
    iget v6, v1, Ldefpackage/oe4;->e:I

    .line 403
    .line 404
    iput v6, v0, Ldefpackage/pe4;->e:I

    .line 405
    .line 406
    iget-object v6, v1, Ldefpackage/oe4;->f:Landroidx/media3/common/PlaybackException;

    .line 407
    .line 408
    iput-object v6, v0, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 409
    .line 410
    iget v6, v1, Ldefpackage/oe4;->g:I

    .line 411
    .line 412
    iput v6, v0, Ldefpackage/pe4;->g:I

    .line 413
    .line 414
    iget-boolean v6, v1, Ldefpackage/oe4;->h:Z

    .line 415
    .line 416
    iput-boolean v6, v0, Ldefpackage/pe4;->h:Z

    .line 417
    .line 418
    iget-wide v6, v1, Ldefpackage/oe4;->i:J

    .line 419
    .line 420
    iput-wide v6, v0, Ldefpackage/pe4;->i:J

    .line 421
    .line 422
    iget-wide v6, v1, Ldefpackage/oe4;->j:J

    .line 423
    .line 424
    iput-wide v6, v0, Ldefpackage/pe4;->j:J

    .line 425
    .line 426
    iget-wide v6, v1, Ldefpackage/oe4;->k:J

    .line 427
    .line 428
    iput-wide v6, v0, Ldefpackage/pe4;->k:J

    .line 429
    .line 430
    iget-object v6, v1, Ldefpackage/oe4;->l:Ldefpackage/qh3;

    .line 431
    .line 432
    iput-object v6, v0, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 433
    .line 434
    iget-object v6, v1, Ldefpackage/oe4;->m:Ldefpackage/cw4;

    .line 435
    .line 436
    iput-object v6, v0, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 437
    .line 438
    iget-object v6, v1, Ldefpackage/oe4;->n:Ldefpackage/il;

    .line 439
    .line 440
    iput-object v6, v0, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 441
    .line 442
    iget v6, v1, Ldefpackage/oe4;->o:F

    .line 443
    .line 444
    iput v6, v0, Ldefpackage/pe4;->o:F

    .line 445
    .line 446
    iget v6, v1, Ldefpackage/oe4;->p:F

    .line 447
    .line 448
    iput v6, v0, Ldefpackage/pe4;->p:F

    .line 449
    .line 450
    iget-object v6, v1, Ldefpackage/oe4;->q:Ldefpackage/s55;

    .line 451
    .line 452
    iput-object v6, v0, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 453
    .line 454
    iget-object v6, v1, Ldefpackage/oe4;->r:Ldefpackage/jg0;

    .line 455
    .line 456
    iput-object v6, v0, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 457
    .line 458
    iget-object v6, v1, Ldefpackage/oe4;->s:Ldefpackage/hp0;

    .line 459
    .line 460
    iput-object v6, v0, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 461
    .line 462
    iget v6, v1, Ldefpackage/oe4;->t:I

    .line 463
    .line 464
    iput v6, v0, Ldefpackage/pe4;->t:I

    .line 465
    .line 466
    iget-object v6, v1, Ldefpackage/oe4;->u:Ldefpackage/pf4;

    .line 467
    .line 468
    iput-object v6, v0, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 469
    .line 470
    iget-object v6, v1, Ldefpackage/oe4;->v:Ldefpackage/qv2;

    .line 471
    .line 472
    iput-object v6, v0, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 473
    .line 474
    iget-object v6, v1, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 475
    .line 476
    iput-object v6, v0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 477
    .line 478
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    iput-object v2, v0, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 482
    .line 483
    iput-object v3, v0, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 484
    .line 485
    iget-object v2, v1, Ldefpackage/oe4;->A:Ldefpackage/do2;

    .line 486
    .line 487
    iput-object v2, v0, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 488
    .line 489
    iget v2, v1, Ldefpackage/oe4;->B:I

    .line 490
    .line 491
    iput v2, v0, Ldefpackage/pe4;->A:I

    .line 492
    .line 493
    iget v2, v1, Ldefpackage/oe4;->C:I

    .line 494
    .line 495
    iput v2, v0, Ldefpackage/pe4;->B:I

    .line 496
    .line 497
    iget v2, v1, Ldefpackage/oe4;->D:I

    .line 498
    .line 499
    iput v2, v0, Ldefpackage/pe4;->C:I

    .line 500
    .line 501
    iput-object v4, v0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 502
    .line 503
    iput-object v5, v0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 504
    .line 505
    iget-object v2, v1, Ldefpackage/oe4;->H:Ldefpackage/xm;

    .line 506
    .line 507
    iput-object v2, v0, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 508
    .line 509
    iget-object v2, v1, Ldefpackage/oe4;->I:Ldefpackage/xm;

    .line 510
    .line 511
    iput-object v2, v0, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 512
    .line 513
    iget-object v2, v1, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 514
    .line 515
    iput-object v2, v0, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 516
    .line 517
    iget-boolean v2, v1, Ldefpackage/oe4;->K:Z

    .line 518
    .line 519
    iput-boolean v2, v0, Ldefpackage/pe4;->I:Z

    .line 520
    .line 521
    iget v2, v1, Ldefpackage/oe4;->L:I

    .line 522
    .line 523
    iput v2, v0, Ldefpackage/pe4;->J:I

    .line 524
    .line 525
    iget-wide v1, v1, Ldefpackage/oe4;->M:J

    .line 526
    .line 527
    iput-wide v1, v0, Ldefpackage/pe4;->K:J

    .line 528
    .line 529
    iput-boolean v8, v0, Ldefpackage/pe4;->L:Z

    .line 530
    .line 531
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/oe4;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/oe4;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 7
    .line 8
    iput-object v1, v0, Ldefpackage/oe4;->a:Ldefpackage/mi3;

    .line 9
    .line 10
    iget-boolean v1, p0, Ldefpackage/pe4;->b:Z

    .line 11
    .line 12
    iput-boolean v1, v0, Ldefpackage/oe4;->b:Z

    .line 13
    .line 14
    iget v1, p0, Ldefpackage/pe4;->c:I

    .line 15
    .line 16
    iput v1, v0, Ldefpackage/oe4;->c:I

    .line 17
    .line 18
    iget v1, p0, Ldefpackage/pe4;->d:I

    .line 19
    .line 20
    iput v1, v0, Ldefpackage/oe4;->d:I

    .line 21
    .line 22
    iget v1, p0, Ldefpackage/pe4;->e:I

    .line 23
    .line 24
    iput v1, v0, Ldefpackage/oe4;->e:I

    .line 25
    .line 26
    iget-object v1, p0, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 27
    .line 28
    iput-object v1, v0, Ldefpackage/oe4;->f:Landroidx/media3/common/PlaybackException;

    .line 29
    .line 30
    iget v1, p0, Ldefpackage/pe4;->g:I

    .line 31
    .line 32
    iput v1, v0, Ldefpackage/oe4;->g:I

    .line 33
    .line 34
    iget-boolean v1, p0, Ldefpackage/pe4;->h:Z

    .line 35
    .line 36
    iput-boolean v1, v0, Ldefpackage/oe4;->h:Z

    .line 37
    .line 38
    iget-wide v1, p0, Ldefpackage/pe4;->i:J

    .line 39
    .line 40
    iput-wide v1, v0, Ldefpackage/oe4;->i:J

    .line 41
    .line 42
    iget-wide v1, p0, Ldefpackage/pe4;->j:J

    .line 43
    .line 44
    iput-wide v1, v0, Ldefpackage/oe4;->j:J

    .line 45
    .line 46
    iget-wide v1, p0, Ldefpackage/pe4;->k:J

    .line 47
    .line 48
    iput-wide v1, v0, Ldefpackage/oe4;->k:J

    .line 49
    .line 50
    iget-object v1, p0, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 51
    .line 52
    iput-object v1, v0, Ldefpackage/oe4;->l:Ldefpackage/qh3;

    .line 53
    .line 54
    iget-object v1, p0, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 55
    .line 56
    iput-object v1, v0, Ldefpackage/oe4;->m:Ldefpackage/cw4;

    .line 57
    .line 58
    iget-object v1, p0, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 59
    .line 60
    iput-object v1, v0, Ldefpackage/oe4;->n:Ldefpackage/il;

    .line 61
    .line 62
    iget v1, p0, Ldefpackage/pe4;->o:F

    .line 63
    .line 64
    iput v1, v0, Ldefpackage/oe4;->o:F

    .line 65
    .line 66
    iget v1, p0, Ldefpackage/pe4;->p:F

    .line 67
    .line 68
    iput v1, v0, Ldefpackage/oe4;->p:F

    .line 69
    .line 70
    iget-object v1, p0, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 71
    .line 72
    iput-object v1, v0, Ldefpackage/oe4;->q:Ldefpackage/s55;

    .line 73
    .line 74
    iget-object v1, p0, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 75
    .line 76
    iput-object v1, v0, Ldefpackage/oe4;->r:Ldefpackage/jg0;

    .line 77
    .line 78
    iget-object v1, p0, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 79
    .line 80
    iput-object v1, v0, Ldefpackage/oe4;->s:Ldefpackage/hp0;

    .line 81
    .line 82
    iget v1, p0, Ldefpackage/pe4;->t:I

    .line 83
    .line 84
    iput v1, v0, Ldefpackage/oe4;->t:I

    .line 85
    .line 86
    iget-object v1, p0, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 87
    .line 88
    iput-object v1, v0, Ldefpackage/oe4;->u:Ldefpackage/pf4;

    .line 89
    .line 90
    iget-object v1, p0, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 91
    .line 92
    iput-object v1, v0, Ldefpackage/oe4;->v:Ldefpackage/qv2;

    .line 93
    .line 94
    iget-object v1, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 95
    .line 96
    iput-object v1, v0, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 97
    .line 98
    instance-of v2, v1, Ldefpackage/le4;

    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    if-eqz v2, :cond_0

    .line 102
    .line 103
    check-cast v1, Ldefpackage/le4;

    .line 104
    .line 105
    iget-object v1, v1, Ldefpackage/le4;->e:Ldefpackage/yw1;

    .line 106
    .line 107
    iput-object v1, v0, Ldefpackage/oe4;->w:Ldefpackage/yw1;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_0
    iget-object v1, p0, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 111
    .line 112
    iput-object v1, v0, Ldefpackage/oe4;->y:Ldefpackage/jw4;

    .line 113
    .line 114
    iget-boolean v1, p0, Ldefpackage/pe4;->L:Z

    .line 115
    .line 116
    if-eqz v1, :cond_1

    .line 117
    .line 118
    move-object v1, v3

    .line 119
    goto :goto_0

    .line 120
    :cond_1
    iget-object v1, p0, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 121
    .line 122
    :goto_0
    iput-object v1, v0, Ldefpackage/oe4;->z:Ldefpackage/do2;

    .line 123
    .line 124
    :goto_1
    iget-object v1, p0, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 125
    .line 126
    iput-object v1, v0, Ldefpackage/oe4;->A:Ldefpackage/do2;

    .line 127
    .line 128
    iget v1, p0, Ldefpackage/pe4;->A:I

    .line 129
    .line 130
    iput v1, v0, Ldefpackage/oe4;->B:I

    .line 131
    .line 132
    iget v1, p0, Ldefpackage/pe4;->B:I

    .line 133
    .line 134
    iput v1, v0, Ldefpackage/oe4;->C:I

    .line 135
    .line 136
    iget v1, p0, Ldefpackage/pe4;->C:I

    .line 137
    .line 138
    iput v1, v0, Ldefpackage/oe4;->D:I

    .line 139
    .line 140
    iput-object v3, v0, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 141
    .line 142
    iget-object v1, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 143
    .line 144
    iput-object v1, v0, Ldefpackage/oe4;->F:Ldefpackage/ne4;

    .line 145
    .line 146
    iget-object v1, p0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 147
    .line 148
    iput-object v1, v0, Ldefpackage/oe4;->G:Ldefpackage/xm;

    .line 149
    .line 150
    iget-object v1, p0, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 151
    .line 152
    iput-object v1, v0, Ldefpackage/oe4;->H:Ldefpackage/xm;

    .line 153
    .line 154
    iget-object v1, p0, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 155
    .line 156
    iput-object v1, v0, Ldefpackage/oe4;->I:Ldefpackage/xm;

    .line 157
    .line 158
    iget-object v1, p0, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 159
    .line 160
    iput-object v1, v0, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 161
    .line 162
    iget-boolean v1, p0, Ldefpackage/pe4;->I:Z

    .line 163
    .line 164
    iput-boolean v1, v0, Ldefpackage/oe4;->K:Z

    .line 165
    .line 166
    iget v1, p0, Ldefpackage/pe4;->J:I

    .line 167
    .line 168
    iput v1, v0, Ldefpackage/oe4;->L:I

    .line 169
    .line 170
    iget-wide v1, p0, Ldefpackage/pe4;->K:J

    .line 171
    .line 172
    iput-wide v1, v0, Ldefpackage/oe4;->M:J

    .line 173
    .line 174
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Ldefpackage/pe4;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_1
    check-cast p1, Ldefpackage/pe4;

    .line 13
    .line 14
    iget-boolean v0, p0, Ldefpackage/pe4;->b:Z

    .line 15
    .line 16
    iget-boolean v2, p1, Ldefpackage/pe4;->b:Z

    .line 17
    .line 18
    if-ne v0, v2, :cond_3

    .line 19
    .line 20
    iget v0, p0, Ldefpackage/pe4;->c:I

    .line 21
    .line 22
    iget v2, p1, Ldefpackage/pe4;->c:I

    .line 23
    .line 24
    if-ne v0, v2, :cond_3

    .line 25
    .line 26
    iget-object v0, p0, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 27
    .line 28
    iget-object v2, p1, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ldefpackage/mi3;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    iget v0, p0, Ldefpackage/pe4;->d:I

    .line 37
    .line 38
    iget v2, p1, Ldefpackage/pe4;->d:I

    .line 39
    .line 40
    if-ne v0, v2, :cond_3

    .line 41
    .line 42
    iget v0, p0, Ldefpackage/pe4;->e:I

    .line 43
    .line 44
    iget v2, p1, Ldefpackage/pe4;->e:I

    .line 45
    .line 46
    if-ne v0, v2, :cond_3

    .line 47
    .line 48
    iget-object v0, p0, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 49
    .line 50
    iget-object v2, p1, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 51
    .line 52
    if-eq v0, v2, :cond_2

    .line 53
    .line 54
    return v1

    .line 55
    :cond_2
    iget v0, p0, Ldefpackage/pe4;->g:I

    .line 56
    .line 57
    iget v2, p1, Ldefpackage/pe4;->g:I

    .line 58
    .line 59
    if-ne v0, v2, :cond_3

    .line 60
    .line 61
    iget-boolean v0, p0, Ldefpackage/pe4;->h:Z

    .line 62
    .line 63
    iget-boolean v2, p1, Ldefpackage/pe4;->h:Z

    .line 64
    .line 65
    if-ne v0, v2, :cond_3

    .line 66
    .line 67
    iget-wide v2, p0, Ldefpackage/pe4;->i:J

    .line 68
    .line 69
    iget-wide v4, p1, Ldefpackage/pe4;->i:J

    .line 70
    .line 71
    cmp-long v0, v2, v4

    .line 72
    .line 73
    if-nez v0, :cond_3

    .line 74
    .line 75
    iget-wide v2, p0, Ldefpackage/pe4;->j:J

    .line 76
    .line 77
    iget-wide v4, p1, Ldefpackage/pe4;->j:J

    .line 78
    .line 79
    cmp-long v0, v2, v4

    .line 80
    .line 81
    if-nez v0, :cond_3

    .line 82
    .line 83
    iget-wide v2, p0, Ldefpackage/pe4;->k:J

    .line 84
    .line 85
    iget-wide v4, p1, Ldefpackage/pe4;->k:J

    .line 86
    .line 87
    cmp-long v0, v2, v4

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    iget-object v0, p0, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 92
    .line 93
    iget-object v2, p1, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Ldefpackage/qh3;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    iget-object v0, p0, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 102
    .line 103
    iget-object v2, p1, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ldefpackage/cw4;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    iget-object v0, p0, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 112
    .line 113
    iget-object v2, p1, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ldefpackage/il;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    iget v0, p0, Ldefpackage/pe4;->o:F

    .line 122
    .line 123
    iget v2, p1, Ldefpackage/pe4;->o:F

    .line 124
    .line 125
    cmpl-float v0, v0, v2

    .line 126
    .line 127
    if-nez v0, :cond_3

    .line 128
    .line 129
    iget v0, p0, Ldefpackage/pe4;->p:F

    .line 130
    .line 131
    iget v2, p1, Ldefpackage/pe4;->p:F

    .line 132
    .line 133
    cmpl-float v0, v0, v2

    .line 134
    .line 135
    if-nez v0, :cond_3

    .line 136
    .line 137
    iget-object v0, p0, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 138
    .line 139
    iget-object v2, p1, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 140
    .line 141
    invoke-virtual {v0, v2}, Ldefpackage/s55;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_3

    .line 146
    .line 147
    iget-object v0, p0, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 148
    .line 149
    iget-object v2, p1, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 150
    .line 151
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_3

    .line 156
    .line 157
    iget-object v0, p0, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 158
    .line 159
    iget-object v2, p1, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 160
    .line 161
    invoke-virtual {v0, v2}, Ldefpackage/hp0;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_3

    .line 166
    .line 167
    iget v0, p0, Ldefpackage/pe4;->t:I

    .line 168
    .line 169
    iget v2, p1, Ldefpackage/pe4;->t:I

    .line 170
    .line 171
    if-ne v0, v2, :cond_3

    .line 172
    .line 173
    iget-object v0, p0, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 174
    .line 175
    iget-object v2, p1, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 176
    .line 177
    invoke-virtual {v0, v2}, Ldefpackage/pf4;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_3

    .line 182
    .line 183
    iget-object v0, p0, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 184
    .line 185
    iget-object v2, p1, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 186
    .line 187
    invoke-virtual {v0, v2}, Ldefpackage/qv2;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_3

    .line 192
    .line 193
    iget-object v0, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 194
    .line 195
    iget-object v2, p1, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Ldefpackage/cu4;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_3

    .line 202
    .line 203
    iget-object v0, p0, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 204
    .line 205
    iget-object v2, p1, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Ldefpackage/jw4;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_3

    .line 212
    .line 213
    iget-object v0, p0, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 214
    .line 215
    iget-object v2, p1, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 216
    .line 217
    invoke-virtual {v0, v2}, Ldefpackage/do2;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_3

    .line 222
    .line 223
    iget-object v0, p0, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 224
    .line 225
    iget-object v2, p1, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Ldefpackage/do2;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_3

    .line 232
    .line 233
    iget v0, p0, Ldefpackage/pe4;->A:I

    .line 234
    .line 235
    iget v2, p1, Ldefpackage/pe4;->A:I

    .line 236
    .line 237
    if-ne v0, v2, :cond_3

    .line 238
    .line 239
    iget v0, p0, Ldefpackage/pe4;->B:I

    .line 240
    .line 241
    iget v2, p1, Ldefpackage/pe4;->B:I

    .line 242
    .line 243
    if-ne v0, v2, :cond_3

    .line 244
    .line 245
    iget v0, p0, Ldefpackage/pe4;->C:I

    .line 246
    .line 247
    iget v2, p1, Ldefpackage/pe4;->C:I

    .line 248
    .line 249
    if-ne v0, v2, :cond_3

    .line 250
    .line 251
    iget-object v0, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 252
    .line 253
    iget-object v2, p1, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 254
    .line 255
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_3

    .line 260
    .line 261
    iget-object v0, p0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 262
    .line 263
    iget-object v2, p1, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_3

    .line 270
    .line 271
    iget-object v0, p0, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 272
    .line 273
    iget-object v2, p1, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 274
    .line 275
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_3

    .line 280
    .line 281
    iget-object v0, p0, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 282
    .line 283
    iget-object v2, p1, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 284
    .line 285
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-eqz v0, :cond_3

    .line 290
    .line 291
    iget-object v0, p0, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 292
    .line 293
    iget-object v2, p1, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 294
    .line 295
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_3

    .line 300
    .line 301
    iget-boolean v0, p0, Ldefpackage/pe4;->I:Z

    .line 302
    .line 303
    iget-boolean v2, p1, Ldefpackage/pe4;->I:Z

    .line 304
    .line 305
    if-ne v0, v2, :cond_3

    .line 306
    .line 307
    iget v0, p0, Ldefpackage/pe4;->J:I

    .line 308
    .line 309
    iget v2, p1, Ldefpackage/pe4;->J:I

    .line 310
    .line 311
    if-ne v0, v2, :cond_3

    .line 312
    .line 313
    iget-wide v2, p0, Ldefpackage/pe4;->K:J

    .line 314
    .line 315
    iget-wide p0, p1, Ldefpackage/pe4;->K:J

    .line 316
    .line 317
    cmp-long p0, v2, p0

    .line 318
    .line 319
    if-nez p0, :cond_3

    .line 320
    .line 321
    :goto_0
    const/4 p0, 0x1

    .line 322
    return p0

    .line 323
    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/mi3;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit16 v0, v0, 0xd9

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-boolean v1, p0, Ldefpackage/pe4;->b:Z

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget v1, p0, Ldefpackage/pe4;->c:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    iget v1, p0, Ldefpackage/pe4;->d:I

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    iget v1, p0, Ldefpackage/pe4;->e:I

    .line 27
    .line 28
    add-int/2addr v0, v1

    .line 29
    mul-int/lit8 v0, v0, 0x1f

    .line 30
    .line 31
    iget-object v1, p0, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 32
    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_0
    add-int/2addr v0, v1

    .line 42
    mul-int/lit8 v0, v0, 0x1f

    .line 43
    .line 44
    iget v1, p0, Ldefpackage/pe4;->g:I

    .line 45
    .line 46
    add-int/2addr v0, v1

    .line 47
    mul-int/lit8 v0, v0, 0x1f

    .line 48
    .line 49
    iget-boolean v1, p0, Ldefpackage/pe4;->h:Z

    .line 50
    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit16 v0, v0, 0x3c1

    .line 53
    .line 54
    iget-wide v1, p0, Ldefpackage/pe4;->i:J

    .line 55
    .line 56
    const/16 v3, 0x20

    .line 57
    .line 58
    ushr-long v4, v1, v3

    .line 59
    .line 60
    xor-long/2addr v1, v4

    .line 61
    long-to-int v1, v1

    .line 62
    add-int/2addr v0, v1

    .line 63
    mul-int/lit8 v0, v0, 0x1f

    .line 64
    .line 65
    iget-wide v1, p0, Ldefpackage/pe4;->j:J

    .line 66
    .line 67
    ushr-long v4, v1, v3

    .line 68
    .line 69
    xor-long/2addr v1, v4

    .line 70
    long-to-int v1, v1

    .line 71
    add-int/2addr v0, v1

    .line 72
    mul-int/lit8 v0, v0, 0x1f

    .line 73
    .line 74
    iget-wide v1, p0, Ldefpackage/pe4;->k:J

    .line 75
    .line 76
    ushr-long v4, v1, v3

    .line 77
    .line 78
    xor-long/2addr v1, v4

    .line 79
    long-to-int v1, v1

    .line 80
    add-int/2addr v0, v1

    .line 81
    mul-int/lit8 v0, v0, 0x1f

    .line 82
    .line 83
    iget-object v1, p0, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 84
    .line 85
    invoke-virtual {v1}, Ldefpackage/qh3;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    add-int/2addr v1, v0

    .line 90
    mul-int/lit8 v1, v1, 0x1f

    .line 91
    .line 92
    iget-object v0, p0, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 93
    .line 94
    invoke-virtual {v0}, Ldefpackage/cw4;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    add-int/2addr v0, v1

    .line 99
    mul-int/lit8 v0, v0, 0x1f

    .line 100
    .line 101
    iget-object v1, p0, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 102
    .line 103
    invoke-virtual {v1}, Ldefpackage/il;->hashCode()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-int/2addr v1, v0

    .line 108
    mul-int/lit8 v1, v1, 0x1f

    .line 109
    .line 110
    iget v0, p0, Ldefpackage/pe4;->o:F

    .line 111
    .line 112
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    add-int/2addr v0, v1

    .line 117
    mul-int/lit8 v0, v0, 0x1f

    .line 118
    .line 119
    iget v1, p0, Ldefpackage/pe4;->p:F

    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    add-int/2addr v1, v0

    .line 126
    mul-int/lit8 v1, v1, 0x1f

    .line 127
    .line 128
    iget-object v0, p0, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 129
    .line 130
    invoke-virtual {v0}, Ldefpackage/s55;->hashCode()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    add-int/2addr v0, v1

    .line 135
    mul-int/lit8 v0, v0, 0x1f

    .line 136
    .line 137
    iget-object v1, p0, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    add-int/2addr v1, v0

    .line 144
    mul-int/lit8 v1, v1, 0x1f

    .line 145
    .line 146
    iget-object v0, p0, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 147
    .line 148
    invoke-virtual {v0}, Ldefpackage/hp0;->hashCode()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    add-int/2addr v0, v1

    .line 153
    mul-int/lit8 v0, v0, 0x1f

    .line 154
    .line 155
    iget v1, p0, Ldefpackage/pe4;->t:I

    .line 156
    .line 157
    add-int/2addr v0, v1

    .line 158
    mul-int/lit16 v0, v0, 0x3c1

    .line 159
    .line 160
    iget-object v1, p0, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 161
    .line 162
    invoke-virtual {v1}, Ldefpackage/pf4;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    add-int/2addr v1, v0

    .line 167
    mul-int/lit16 v1, v1, 0x3c1

    .line 168
    .line 169
    iget-object v0, p0, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 170
    .line 171
    invoke-virtual {v0}, Ldefpackage/qv2;->hashCode()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    add-int/2addr v0, v1

    .line 176
    mul-int/lit8 v0, v0, 0x1f

    .line 177
    .line 178
    iget-object v1, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 179
    .line 180
    invoke-virtual {v1}, Ldefpackage/cu4;->hashCode()I

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    add-int/2addr v1, v0

    .line 185
    mul-int/lit8 v1, v1, 0x1f

    .line 186
    .line 187
    iget-object v0, p0, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 188
    .line 189
    iget-object v0, v0, Ldefpackage/jw4;->a:Ldefpackage/yw1;

    .line 190
    .line 191
    invoke-virtual {v0}, Ldefpackage/yw1;->hashCode()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    add-int/2addr v0, v1

    .line 196
    mul-int/lit8 v0, v0, 0x1f

    .line 197
    .line 198
    iget-object v1, p0, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 199
    .line 200
    invoke-virtual {v1}, Ldefpackage/do2;->hashCode()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    add-int/2addr v1, v0

    .line 205
    mul-int/lit8 v1, v1, 0x1f

    .line 206
    .line 207
    iget-object v0, p0, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 208
    .line 209
    invoke-virtual {v0}, Ldefpackage/do2;->hashCode()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    add-int/2addr v0, v1

    .line 214
    mul-int/lit8 v0, v0, 0x1f

    .line 215
    .line 216
    iget v1, p0, Ldefpackage/pe4;->A:I

    .line 217
    .line 218
    add-int/2addr v0, v1

    .line 219
    mul-int/lit8 v0, v0, 0x1f

    .line 220
    .line 221
    iget v1, p0, Ldefpackage/pe4;->B:I

    .line 222
    .line 223
    add-int/2addr v0, v1

    .line 224
    mul-int/lit8 v0, v0, 0x1f

    .line 225
    .line 226
    iget v1, p0, Ldefpackage/pe4;->C:I

    .line 227
    .line 228
    add-int/2addr v0, v1

    .line 229
    mul-int/lit8 v0, v0, 0x1f

    .line 230
    .line 231
    iget-object v1, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    add-int/2addr v1, v0

    .line 238
    mul-int/lit8 v1, v1, 0x1f

    .line 239
    .line 240
    iget-object v0, p0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    add-int/2addr v0, v1

    .line 247
    mul-int/lit8 v0, v0, 0x1f

    .line 248
    .line 249
    iget-object v1, p0, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    add-int/2addr v1, v0

    .line 256
    mul-int/lit8 v1, v1, 0x1f

    .line 257
    .line 258
    iget-object v0, p0, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    add-int/2addr v0, v1

    .line 265
    mul-int/lit8 v0, v0, 0x1f

    .line 266
    .line 267
    iget-object v1, p0, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    add-int/2addr v1, v0

    .line 274
    mul-int/lit8 v1, v1, 0x1f

    .line 275
    .line 276
    iget-boolean v0, p0, Ldefpackage/pe4;->I:Z

    .line 277
    .line 278
    add-int/2addr v1, v0

    .line 279
    mul-int/lit8 v1, v1, 0x1f

    .line 280
    .line 281
    iget v0, p0, Ldefpackage/pe4;->J:I

    .line 282
    .line 283
    add-int/2addr v1, v0

    .line 284
    mul-int/lit8 v1, v1, 0x1f

    .line 285
    .line 286
    iget-wide v4, p0, Ldefpackage/pe4;->K:J

    .line 287
    .line 288
    ushr-long v2, v4, v3

    .line 289
    .line 290
    xor-long/2addr v2, v4

    .line 291
    long-to-int p0, v2

    .line 292
    add-int/2addr v1, p0

    .line 293
    return v1
.end method
