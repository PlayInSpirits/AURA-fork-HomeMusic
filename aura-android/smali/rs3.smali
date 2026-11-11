.class public final Lrs3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lrs3;

.field public static final b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static volatile d:Lux;

.field public static volatile e:Ljava/util/List;

.field public static final f:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lrs3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrs3;->a:Lrs3;

    .line 7
    .line 8
    new-instance v0, Lps3;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Lps3;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lrs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lrs3;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    sget-object v0, Lu01;->n:Lu01;

    .line 28
    .line 29
    sput-object v0, Lrs3;->e:Ljava/util/List;

    .line 30
    .line 31
    new-instance v0, Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lrs3;->f:Ljava/util/HashSet;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lqs3;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    const-string v2, "Pre-cache aborted for "

    .line 4
    .line 5
    const-string v3, "Pre-cached "

    .line 6
    .line 7
    iget-object v5, v1, Lqs3;->a:Landroid/net/Uri;

    .line 8
    .line 9
    const-string v0, "Head of "

    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    :try_start_0
    invoke-static/range {p1 .. p1}, Lau0;->D(Landroid/content/Context;)Lse4;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    new-instance v7, Lxi4;

    .line 18
    .line 19
    invoke-direct {v7, v4}, Lxi4;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sget-object v10, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 23
    .line 24
    move v8, v4

    .line 25
    :try_start_1
    new-instance v4, Lii0;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 26
    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    const/4 v15, 0x0

    .line 30
    const-wide/16 v11, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    move-object v13, v6

    .line 34
    move-object v14, v7

    .line 35
    const-wide/16 v6, 0x0

    .line 36
    .line 37
    move/from16 v17, v8

    .line 38
    .line 39
    const/4 v8, 0x1

    .line 40
    move-object/from16 v18, v13

    .line 41
    .line 42
    move-object/from16 v19, v14

    .line 43
    .line 44
    const-wide/16 v13, -0x1

    .line 45
    .line 46
    move-object/from16 v20, v18

    .line 47
    .line 48
    move-object/from16 v18, v3

    .line 49
    .line 50
    move/from16 v3, v17

    .line 51
    .line 52
    move-object/from16 v17, v2

    .line 53
    .line 54
    move-object/from16 v2, v19

    .line 55
    .line 56
    :try_start_2
    invoke-direct/range {v4 .. v16}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v4}, Lxi4;->d(Lii0;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-object/from16 v13, v20

    .line 67
    .line 68
    invoke-virtual {v13, v11}, Lse4;->i(Ljava/lang/String;)Lyj0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Lnd0;->a(Lnd0;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    const-wide/16 v8, -0x1

    .line 77
    .line 78
    cmp-long v2, v6, v8

    .line 79
    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_0
    const-wide/16 v7, 0x0

    .line 84
    .line 85
    const-wide/16 v9, 0x1

    .line 86
    .line 87
    move-object v6, v13

    .line 88
    invoke-virtual/range {v6 .. v11}, Lse4;->g(JJLjava/lang/String;)J

    .line 89
    .line 90
    .line 91
    move-result-wide v7

    .line 92
    const-wide/16 v9, 0x0

    .line 93
    .line 94
    cmp-long v2, v7, v9

    .line 95
    .line 96
    if-gtz v2, :cond_1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sget-object v2, Lrs3;->f:Ljava/util/HashSet;

    .line 100
    .line 101
    monitor-enter v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 102
    :try_start_3
    invoke-virtual {v2, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 106
    :try_start_4
    monitor-exit v2

    .line 107
    if-nez v4, :cond_2

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    const-string v2, "QueuePreloader"

    .line 111
    .line 112
    new-instance v4, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v0, " has no length, loading it again"

    .line 121
    .line 122
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    invoke-virtual {v13, v11}, Lse4;->m(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :catch_0
    move-exception v0

    .line 137
    goto :goto_0

    .line 138
    :catchall_0
    move-exception v0

    .line 139
    monitor-exit v2

    .line 140
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 141
    :catch_1
    move-exception v0

    .line 142
    move-object/from16 v17, v2

    .line 143
    .line 144
    move-object/from16 v18, v3

    .line 145
    .line 146
    move v3, v8

    .line 147
    goto :goto_0

    .line 148
    :catch_2
    move-exception v0

    .line 149
    move-object/from16 v17, v2

    .line 150
    .line 151
    move-object/from16 v18, v3

    .line 152
    .line 153
    move v3, v4

    .line 154
    :goto_0
    const-string v2, "QueuePreloader"

    .line 155
    .line 156
    new-instance v4, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const-string v6, "Could not check the head of "

    .line 159
    .line 160
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v6, ": "

    .line 167
    .line 168
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 182
    .line 183
    iget-wide v13, v1, Lqs3;->b:J

    .line 184
    .line 185
    invoke-static {v5}, Lot1;->d(Landroid/net/Uri;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_3

    .line 190
    .line 191
    const-string v0, "X-HomeMusic-Prefetch"

    .line 192
    .line 193
    const-string v2, "1"

    .line 194
    .line 195
    invoke-static {v0, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    :goto_2
    move-object v10, v0

    .line 203
    goto :goto_3

    .line 204
    :cond_3
    sget-object v0, Lv01;->n:Lv01;

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :goto_3
    new-instance v4, Lii0;

    .line 208
    .line 209
    const-wide/16 v6, 0x0

    .line 210
    .line 211
    const/4 v8, 0x1

    .line 212
    const/4 v9, 0x0

    .line 213
    const-wide/16 v11, 0x0

    .line 214
    .line 215
    const/4 v15, 0x0

    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    invoke-direct/range {v4 .. v16}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 219
    .line 220
    .line 221
    const-class v2, Lau0;

    .line 222
    .line 223
    monitor-enter v2

    .line 224
    :try_start_5
    invoke-static/range {p1 .. p1}, Lau0;->B(Landroid/content/Context;)Lse4;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    new-instance v11, Lxi4;

    .line 229
    .line 230
    invoke-direct {v11, v3}, Lxi4;-><init>(I)V

    .line 231
    .line 232
    .line 233
    invoke-static {}, Lau0;->x()Lbi0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-static/range {p1 .. p1}, Lau0;->B(Landroid/content/Context;)Lse4;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 249
    .line 250
    .line 251
    monitor-exit v2

    .line 252
    new-instance v8, Lqx;

    .line 253
    .line 254
    new-instance v2, Lzj0;

    .line 255
    .line 256
    check-cast v0, Lom1;

    .line 257
    .line 258
    invoke-virtual {v0}, Lom1;->m()Lci0;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-direct {v2, v3, v0}, Lzj0;-><init>(Landroid/content/Context;Lci0;)V

    .line 263
    .line 264
    .line 265
    invoke-direct {v8, v2, v6}, Lqx;-><init>(Lci0;Lse4;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v10, Ljx;

    .line 272
    .line 273
    invoke-direct {v10, v7}, Ljx;-><init>(Lse4;)V

    .line 274
    .line 275
    .line 276
    new-instance v6, Llx;

    .line 277
    .line 278
    new-instance v9, Lt61;

    .line 279
    .line 280
    const/4 v0, 0x0

    .line 281
    invoke-direct {v9, v0}, Lkp;-><init>(Z)V

    .line 282
    .line 283
    .line 284
    const/4 v12, 0x0

    .line 285
    invoke-direct/range {v6 .. v12}, Llx;-><init>(Lse4;Lci0;Lci0;Ljx;Lpx;I)V

    .line 286
    .line 287
    .line 288
    new-instance v2, Lux;

    .line 289
    .line 290
    const/4 v3, 0x0

    .line 291
    invoke-direct {v2, v6, v4, v3, v3}, Lux;-><init>(Llx;Lii0;[BLtx;)V

    .line 292
    .line 293
    .line 294
    monitor-enter p0

    .line 295
    :try_start_6
    sget-object v0, Lrs3;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 298
    .line 299
    .line 300
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 301
    move/from16 v4, p3

    .line 302
    .line 303
    if-eq v0, v4, :cond_4

    .line 304
    .line 305
    monitor-exit p0

    .line 306
    return-void

    .line 307
    :cond_4
    :try_start_7
    sput-object v2, Lrs3;->d:Lux;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 308
    .line 309
    monitor-exit p0

    .line 310
    :try_start_8
    invoke-virtual {v2}, Lux;->a()V

    .line 311
    .line 312
    .line 313
    const-string v0, "QueuePreloader"

    .line 314
    .line 315
    iget-wide v6, v1, Lqs3;->b:J

    .line 316
    .line 317
    new-instance v1, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    move-object/from16 v4, v18

    .line 320
    .line 321
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const-string v4, " bytes of "

    .line 328
    .line 329
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 340
    .line 341
    .line 342
    monitor-enter p0

    .line 343
    :try_start_9
    sget-object v0, Lrs3;->d:Lux;

    .line 344
    .line 345
    if-ne v0, v2, :cond_5

    .line 346
    .line 347
    sput-object v3, Lrs3;->d:Lux;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :catchall_1
    move-exception v0

    .line 351
    goto :goto_5

    .line 352
    :cond_5
    :goto_4
    monitor-exit p0

    .line 353
    goto :goto_6

    .line 354
    :goto_5
    monitor-exit p0

    .line 355
    throw v0

    .line 356
    :catchall_2
    move-exception v0

    .line 357
    goto :goto_8

    .line 358
    :catch_3
    move-exception v0

    .line 359
    :try_start_a
    const-string v1, "QueuePreloader"

    .line 360
    .line 361
    new-instance v4, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    move-object/from16 v6, v17

    .line 364
    .line 365
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    const-string v5, ": "

    .line 372
    .line 373
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 384
    .line 385
    .line 386
    monitor-enter p0

    .line 387
    :try_start_b
    sget-object v0, Lrs3;->d:Lux;

    .line 388
    .line 389
    if-ne v0, v2, :cond_5

    .line 390
    .line 391
    sput-object v3, Lrs3;->d:Lux;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 392
    .line 393
    goto :goto_4

    .line 394
    :catchall_3
    move-exception v0

    .line 395
    goto :goto_7

    .line 396
    :goto_6
    return-void

    .line 397
    :goto_7
    monitor-exit p0

    .line 398
    throw v0

    .line 399
    :goto_8
    monitor-enter p0

    .line 400
    :try_start_c
    sget-object v1, Lrs3;->d:Lux;

    .line 401
    .line 402
    if-ne v1, v2, :cond_6

    .line 403
    .line 404
    sput-object v3, Lrs3;->d:Lux;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 405
    .line 406
    goto :goto_9

    .line 407
    :catchall_4
    move-exception v0

    .line 408
    goto :goto_a

    .line 409
    :cond_6
    :goto_9
    monitor-exit p0

    .line 410
    throw v0

    .line 411
    :goto_a
    monitor-exit p0

    .line 412
    throw v0

    .line 413
    :catchall_5
    move-exception v0

    .line 414
    monitor-exit p0

    .line 415
    throw v0

    .line 416
    :catchall_6
    move-exception v0

    .line 417
    :try_start_d
    monitor-exit v2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 418
    throw v0
.end method

.method public final b()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Lrs3;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 5
    .line 6
    .line 7
    sget-object v0, Lu01;->n:Lu01;

    .line 8
    .line 9
    sput-object v0, Lrs3;->e:Ljava/util/List;

    .line 10
    .line 11
    sget-object v0, Lrs3;->d:Lux;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    iput-boolean v1, v0, Lux;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :goto_1
    monitor-exit p0

    .line 24
    throw v0
.end method

.method public final c(Landroid/content/Context;Lqi3;)V
    .locals 29

    .line 1
    invoke-static {}, Ljp1;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "precache_tracks_count"

    .line 17
    .line 18
    const-string v3, "0"

    .line 19
    .line 20
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    if-le v1, v2, :cond_0

    .line 35
    .line 36
    move v1, v2

    .line 37
    :cond_0
    if-gtz v1, :cond_1

    .line 38
    .line 39
    goto/16 :goto_10

    .line 40
    .line 41
    :cond_1
    invoke-static {}, Lud3;->F()J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    cmp-long v3, v3, v5

    .line 48
    .line 49
    if-gtz v3, :cond_2

    .line 50
    .line 51
    goto/16 :goto_10

    .line 52
    .line 53
    :cond_2
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-string v4, "precache_wifi_only"

    .line 58
    .line 59
    invoke-static {v4, v2}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-class v4, Landroid/net/ConnectivityManager;

    .line 69
    .line 70
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, Landroid/net/ConnectivityManager;

    .line 75
    .line 76
    if-nez v4, :cond_3

    .line 77
    .line 78
    move v4, v2

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->isActiveNetworkMetered()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    :goto_0
    if-eqz v4, :cond_4

    .line 85
    .line 86
    invoke-virtual/range {p0 .. p0}, Lrs3;->b()V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    invoke-interface/range {p2 .. p2}, Lqi3;->f()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_5

    .line 95
    .line 96
    goto/16 :goto_10

    .line 97
    .line 98
    :cond_5
    sget-object v4, Lcom/eddyizm/tempus/homemusic/b;->b:Lcom/eddyizm/tempus/homemusic/WaveSession;

    .line 99
    .line 100
    if-nez v4, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    invoke-interface/range {p2 .. p2}, Lqi3;->a()Lgn2;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    if-eqz v6, :cond_7

    .line 108
    .line 109
    iget-object v6, v6, Lgn2;->a:Ljava/lang/String;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_7
    const/4 v6, 0x0

    .line 113
    :goto_1
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/WaveSession;->isWave(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_9

    .line 118
    .line 119
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/WaveSession;->settled(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_8

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lrs3;->b()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_9
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v4, Lu01;->n:Lu01;

    .line 134
    .line 135
    invoke-interface/range {p2 .. p2}, Lqi3;->x0()Lcu4;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6}, Lcu4;->p()Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_b

    .line 147
    .line 148
    :cond_a
    :goto_3
    move-object/from16 v16, v3

    .line 149
    .line 150
    goto/16 :goto_e

    .line 151
    .line 152
    :cond_b
    invoke-interface/range {p2 .. p2}, Lqi3;->o0()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    const/4 v8, -0x1

    .line 157
    if-ne v7, v8, :cond_c

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_c
    new-instance v4, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    move v9, v7

    .line 166
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    if-ge v10, v1, :cond_a

    .line 171
    .line 172
    invoke-interface/range {p2 .. p2}, Lqi3;->h()I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    invoke-interface/range {p2 .. p2}, Lqi3;->D0()Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    invoke-virtual {v6, v9, v10, v11}, Lcu4;->e(IIZ)I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-eq v9, v8, :cond_a

    .line 185
    .line 186
    if-ne v9, v7, :cond_d

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_d
    move-object/from16 v10, p2

    .line 190
    .line 191
    invoke-interface {v10, v9}, Lqi3;->Y(I)Lgn2;

    .line 192
    .line 193
    .line 194
    move-result-object v11

    .line 195
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    iget-object v12, v11, Lgn2;->a:Ljava/lang/String;

    .line 199
    .line 200
    iget-object v13, v11, Lgn2;->d:Ldo2;

    .line 201
    .line 202
    iget-object v14, v13, Ldo2;->I:Landroid/os/Bundle;

    .line 203
    .line 204
    if-eqz v14, :cond_e

    .line 205
    .line 206
    const-string v15, "type"

    .line 207
    .line 208
    invoke-virtual {v14, v15}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    goto :goto_5

    .line 213
    :cond_e
    const/4 v14, 0x0

    .line 214
    :goto_5
    const-string v15, "radio"

    .line 215
    .line 216
    invoke-static {v14, v15}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-nez v14, :cond_f

    .line 221
    .line 222
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    const-string v14, "ir-"

    .line 226
    .line 227
    const/4 v15, 0x0

    .line 228
    invoke-static {v12, v14, v15}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v14

    .line 232
    if-eqz v14, :cond_10

    .line 233
    .line 234
    :cond_f
    :goto_6
    move-object/from16 v16, v3

    .line 235
    .line 236
    move v15, v9

    .line 237
    goto/16 :goto_d

    .line 238
    .line 239
    :cond_10
    invoke-static {v3}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 240
    .line 241
    .line 242
    move-result-object v14

    .line 243
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {v12}, Leu0;->d(Ljava/lang/String;)Z

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    if-nez v12, :cond_f

    .line 251
    .line 252
    iget-object v12, v11, Lgn2;->b:Lbn2;

    .line 253
    .line 254
    if-eqz v12, :cond_11

    .line 255
    .line 256
    iget-object v12, v12, Lbn2;->a:Landroid/net/Uri;

    .line 257
    .line 258
    if-nez v12, :cond_12

    .line 259
    .line 260
    :cond_11
    iget-object v11, v11, Lgn2;->f:Lcn2;

    .line 261
    .line 262
    iget-object v12, v11, Lcn2;->a:Landroid/net/Uri;

    .line 263
    .line 264
    if-nez v12, :cond_12

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_12
    invoke-virtual {v12}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v11

    .line 271
    const-string v14, "http"

    .line 272
    .line 273
    invoke-static {v11, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v14

    .line 277
    if-nez v14, :cond_13

    .line 278
    .line 279
    const-string v14, "https"

    .line 280
    .line 281
    invoke-static {v11, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    if-nez v11, :cond_13

    .line 286
    .line 287
    invoke-static {v12}, Lot1;->d(Landroid/net/Uri;)Z

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    if-eqz v11, :cond_f

    .line 292
    .line 293
    :cond_13
    invoke-static {v12}, Lot1;->d(Landroid/net/Uri;)Z

    .line 294
    .line 295
    .line 296
    move-result v11

    .line 297
    if-nez v11, :cond_15

    .line 298
    .line 299
    const-string v11, "format"

    .line 300
    .line 301
    invoke-virtual {v12, v11}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v11

    .line 305
    const-string v14, "maxBitRate"

    .line 306
    .line 307
    invoke-virtual {v12, v14}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    if-eqz v11, :cond_14

    .line 312
    .line 313
    const-string v5, "raw"

    .line 314
    .line 315
    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-eqz v5, :cond_f

    .line 320
    .line 321
    :cond_14
    if-eqz v14, :cond_15

    .line 322
    .line 323
    const-string v5, "0"

    .line 324
    .line 325
    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    if-eqz v5, :cond_f

    .line 330
    .line 331
    :cond_15
    iget-object v5, v13, Ldo2;->I:Landroid/os/Bundle;

    .line 332
    .line 333
    if-eqz v5, :cond_16

    .line 334
    .line 335
    const-string v11, "bitrate"

    .line 336
    .line 337
    invoke-virtual {v5, v11}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 338
    .line 339
    .line 340
    move-result v5

    .line 341
    goto :goto_7

    .line 342
    :cond_16
    move v5, v15

    .line 343
    :goto_7
    new-instance v11, Lxi4;

    .line 344
    .line 345
    const/16 v13, 0xa

    .line 346
    .line 347
    invoke-direct {v11, v13}, Lxi4;-><init>(I)V

    .line 348
    .line 349
    .line 350
    sget-object v22, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 351
    .line 352
    new-instance v16, Lii0;

    .line 353
    .line 354
    const-wide/16 v18, 0x0

    .line 355
    .line 356
    const/16 v20, 0x1

    .line 357
    .line 358
    const/16 v21, 0x0

    .line 359
    .line 360
    const-wide/16 v23, 0x0

    .line 361
    .line 362
    const-wide/16 v25, -0x1

    .line 363
    .line 364
    const/16 v27, 0x0

    .line 365
    .line 366
    const/16 v28, 0x0

    .line 367
    .line 368
    move-object/from16 v17, v12

    .line 369
    .line 370
    invoke-direct/range {v16 .. v28}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 371
    .line 372
    .line 373
    move-object/from16 v14, v16

    .line 374
    .line 375
    invoke-virtual {v11, v14}, Lxi4;->d(Lii0;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    const-string v14, "|mobile"

    .line 380
    .line 381
    invoke-static {v11, v14, v15}, Lxm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 382
    .line 383
    .line 384
    move-result v11

    .line 385
    new-instance v14, Lqs3;

    .line 386
    .line 387
    if-eqz v11, :cond_18

    .line 388
    .line 389
    const/16 v11, 0xa0

    .line 390
    .line 391
    if-gt v2, v5, :cond_17

    .line 392
    .line 393
    if-ge v5, v11, :cond_17

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_17
    move v5, v11

    .line 397
    :cond_18
    :goto_8
    if-lez v5, :cond_19

    .line 398
    .line 399
    :goto_9
    move v15, v9

    .line 400
    goto :goto_a

    .line 401
    :cond_19
    const/16 v5, 0x140

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :goto_a
    int-to-long v8, v5

    .line 405
    const-wide/16 v16, 0x3e8

    .line 406
    .line 407
    mul-long v8, v8, v16

    .line 408
    .line 409
    const-wide/16 v16, 0x8

    .line 410
    .line 411
    div-long v8, v8, v16

    .line 412
    .line 413
    if-eqz v0, :cond_1a

    .line 414
    .line 415
    :goto_b
    move-object/from16 v16, v3

    .line 416
    .line 417
    goto :goto_c

    .line 418
    :cond_1a
    const/16 v13, 0xf

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :goto_c
    int-to-long v2, v13

    .line 422
    mul-long/2addr v8, v2

    .line 423
    const-wide/32 v2, 0x10000

    .line 424
    .line 425
    .line 426
    add-long/2addr v8, v2

    .line 427
    const-wide/32 v2, 0x40000

    .line 428
    .line 429
    .line 430
    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 431
    .line 432
    .line 433
    move-result-wide v2

    .line 434
    invoke-direct {v14, v12, v2, v3}, Lqs3;-><init>(Landroid/net/Uri;J)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    :goto_d
    move v9, v15

    .line 441
    move-object/from16 v3, v16

    .line 442
    .line 443
    const/4 v2, 0x1

    .line 444
    const/4 v8, -0x1

    .line 445
    goto/16 :goto_4

    .line 446
    .line 447
    :goto_e
    new-instance v0, Lhx3;

    .line 448
    .line 449
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 450
    .line 451
    .line 452
    monitor-enter p0

    .line 453
    :try_start_0
    sget-object v1, Lrs3;->e:Ljava/util/List;

    .line 454
    .line 455
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 459
    if-eqz v1, :cond_1b

    .line 460
    .line 461
    monitor-exit p0

    .line 462
    return-void

    .line 463
    :cond_1b
    :try_start_1
    sget-object v1, Lrs3;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 464
    .line 465
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    iput v1, v0, Lhx3;->n:I

    .line 470
    .line 471
    sput-object v4, Lrs3;->e:Ljava/util/List;

    .line 472
    .line 473
    sget-object v1, Lrs3;->d:Lux;

    .line 474
    .line 475
    if-eqz v1, :cond_1c

    .line 476
    .line 477
    const/4 v5, 0x1

    .line 478
    iput-boolean v5, v1, Lux;->j:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 479
    .line 480
    goto :goto_f

    .line 481
    :catchall_0
    move-exception v0

    .line 482
    goto :goto_11

    .line 483
    :cond_1c
    :goto_f
    monitor-exit p0

    .line 484
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-eqz v1, :cond_1d

    .line 489
    .line 490
    :goto_10
    return-void

    .line 491
    :cond_1d
    sget-object v1, Lrs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 492
    .line 493
    new-instance v2, Lqo2;

    .line 494
    .line 495
    const/16 v3, 0xe

    .line 496
    .line 497
    move-object/from16 v5, v16

    .line 498
    .line 499
    invoke-direct {v2, v4, v0, v5, v3}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 500
    .line 501
    .line 502
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 503
    .line 504
    .line 505
    return-void

    .line 506
    :goto_11
    monitor-exit p0

    .line 507
    throw v0
.end method
