.class public final synthetic Lmr;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 19
    iput p6, p0, Lmr;->n:I

    iput-object p1, p0, Lmr;->o:Ljava/lang/Object;

    iput-object p2, p0, Lmr;->p:Ljava/lang/Object;

    iput-object p3, p0, Lmr;->q:Ljava/lang/Object;

    iput-object p4, p0, Lmr;->r:Ljava/lang/Object;

    iput-object p5, p0, Lmr;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 20
    iput p6, p0, Lmr;->n:I

    iput-object p1, p0, Lmr;->o:Ljava/lang/Object;

    iput-object p2, p0, Lmr;->q:Ljava/lang/Object;

    iput-object p3, p0, Lmr;->p:Ljava/lang/Object;

    iput-object p4, p0, Lmr;->r:Ljava/lang/Object;

    iput-object p5, p0, Lmr;->s:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfu3;)V
    .locals 1

    .line 21
    const/16 v0, 0xb

    iput v0, p0, Lmr;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr;->q:Ljava/lang/Object;

    iput-object p2, p0, Lmr;->o:Ljava/lang/Object;

    iput-object p3, p0, Lmr;->p:Ljava/lang/Object;

    iput-object p4, p0, Lmr;->r:Ljava/lang/Object;

    iput-object p5, p0, Lmr;->s:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lpn2;Lfr2;Luj2;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lmr;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lmr;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lmr;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lmr;->r:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p4, p0, Lmr;->s:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p5, p0, Lmr;->q:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lmr;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lgq0;->n:Lgq0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, Lmr;->s:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, v0, Lmr;->r:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v8, v0, Lmr;->p:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v9, v0, Lmr;->o:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v0, v0, Lmr;->q:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    check-cast v9, Ljava/lang/String;

    .line 26
    .line 27
    check-cast v8, Ljava/lang/String;

    .line 28
    .line 29
    check-cast v7, Ljava/lang/String;

    .line 30
    .line 31
    check-cast v6, Lfu3;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "local_"

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 56
    .line 57
    invoke-direct {v2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->setId(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->setName(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v9}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->setStreamUrl(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v8}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->setHomePageUrl(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const-string v0, "local"

    .line 73
    .line 74
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->setSource(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v7}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->setCoverArtUrl(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->z()Lc12;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v3, v0, Lc12;->o:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 91
    .line 92
    new-instance v8, Lb12;

    .line 93
    .line 94
    invoke-direct {v8, v0, v2, v5}, Lb12;-><init>(Lc12;Lcom/eddyizm/tempus/model/InternetRadioStationCache;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v3, v4, v5, v8}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    if-eqz v7, :cond_0

    .line 101
    .line 102
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_0

    .line 107
    .line 108
    invoke-static {v1, v7}, Lxt3;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 112
    .line 113
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_0
    check-cast v9, Lmm3;

    .line 125
    .line 126
    move-object v11, v0

    .line 127
    check-cast v11, Ljava/lang/String;

    .line 128
    .line 129
    move-object v10, v8

    .line 130
    check-cast v10, Ljava/lang/String;

    .line 131
    .line 132
    check-cast v7, Ljava/util/ArrayList;

    .line 133
    .line 134
    check-cast v6, Llm3;

    .line 135
    .line 136
    invoke-static {v4}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Lpn4;->g()Lrm3;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v9, v11}, Lmm3;->j(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    const/4 v14, 0x0

    .line 149
    const/4 v15, 0x0

    .line 150
    move-object v12, v10

    .line 151
    move-object v10, v0

    .line 152
    invoke-virtual/range {v10 .. v15}, Lrm3;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object v1, v7

    .line 157
    move-object v10, v12

    .line 158
    new-instance v7, Lz40;

    .line 159
    .line 160
    move-object v12, v6

    .line 161
    move-object v8, v9

    .line 162
    move-object v9, v11

    .line 163
    move-object v11, v1

    .line 164
    invoke-direct/range {v7 .. v12}, Lz40;-><init>(Lmm3;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Llm3;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v7}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :pswitch_1
    check-cast v9, Li80;

    .line 172
    .line 173
    check-cast v0, Ljava/lang/String;

    .line 174
    .line 175
    check-cast v8, Lgf1;

    .line 176
    .line 177
    check-cast v7, Lk03;

    .line 178
    .line 179
    check-cast v6, Loy;

    .line 180
    .line 181
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Lxl;->y()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_1

    .line 189
    .line 190
    :try_start_0
    invoke-static {v0}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 195
    .line 196
    .line 197
    :cond_1
    :try_start_1
    invoke-interface {v8}, Lgf1;->invoke()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    sget-object v0, Lrv2;->v:Lqa3;

    .line 201
    .line 202
    invoke-virtual {v7, v0}, Lad2;->i(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v0}, Loy;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :catchall_0
    move-exception v0

    .line 210
    :try_start_2
    new-instance v2, Lpa3;

    .line 211
    .line 212
    invoke-direct {v2, v0}, Lpa3;-><init>(Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v7, v2}, Lad2;->i(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6, v0}, Loy;->b(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 219
    .line 220
    .line 221
    :goto_0
    if-eqz v1, :cond_2

    .line 222
    .line 223
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 224
    .line 225
    .line 226
    :cond_2
    return-void

    .line 227
    :catchall_1
    move-exception v0

    .line 228
    if-eqz v1, :cond_3

    .line 229
    .line 230
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 231
    .line 232
    .line 233
    :cond_3
    throw v0

    .line 234
    :pswitch_2
    check-cast v9, Lpn2;

    .line 235
    .line 236
    check-cast v8, Lfr2;

    .line 237
    .line 238
    check-cast v7, Luj2;

    .line 239
    .line 240
    check-cast v6, Landroid/os/Bundle;

    .line 241
    .line 242
    check-cast v0, Ljava/lang/String;

    .line 243
    .line 244
    iget-object v1, v9, Lpn2;->z:Ltn2;

    .line 245
    .line 246
    iget-object v4, v9, Lpn2;->x:Lna4;

    .line 247
    .line 248
    const v10, 0xc353

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v8, v10}, Lna4;->I(Lfr2;I)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-nez v4, :cond_4

    .line 256
    .line 257
    invoke-virtual {v7, v2}, Luj2;->f(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_4
    if-eqz v6, :cond_5

    .line 262
    .line 263
    iget-object v4, v1, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 264
    .line 265
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-virtual {v6, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 270
    .line 271
    .line 272
    :try_start_3
    const-string v4, "android.media.browse.extra.PAGE"

    .line 273
    .line 274
    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    const-string v10, "android.media.browse.extra.PAGE_SIZE"

    .line 279
    .line 280
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    iget-object v11, v1, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 285
    .line 286
    invoke-static {v11, v6}, Lf92;->h(Lcom/eddyizm/tempus/service/MediaService;Landroid/os/Bundle;)Ljn2;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    if-ltz v4, :cond_5

    .line 291
    .line 292
    if-lez v10, :cond_5

    .line 293
    .line 294
    invoke-virtual {v1, v8, v0, v10, v2}, Ltn2;->r(Lfr2;Ljava/lang/String;ILjn2;)Lic2;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    new-instance v6, Lln2;

    .line 299
    .line 300
    invoke-direct {v6, v9, v5}, Lln2;-><init>(Lpn2;I)V

    .line 301
    .line 302
    .line 303
    invoke-static {v4, v6}, Lf35;->h0(Lic2;Lmk;)Llb4;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    new-instance v6, Lnn2;

    .line 308
    .line 309
    invoke-direct {v6, v4, v7, v5}, Lnn2;-><init>(Llb4;Luj2;I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v6, v3}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_3
    .catch Landroid/os/BadParcelableException; {:try_start_3 .. :try_end_3} :catch_0

    .line 313
    .line 314
    .line 315
    goto :goto_1

    .line 316
    :catch_0
    :cond_5
    const v4, 0x7fffffff

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v8, v0, v4, v2}, Ltn2;->r(Lfr2;Ljava/lang/String;ILjn2;)Lic2;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    new-instance v1, Lln2;

    .line 324
    .line 325
    invoke-direct {v1, v9, v5}, Lln2;-><init>(Lpn2;I)V

    .line 326
    .line 327
    .line 328
    invoke-static {v0, v1}, Lf35;->h0(Lic2;Lmk;)Llb4;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    new-instance v1, Lnn2;

    .line 333
    .line 334
    invoke-direct {v1, v0, v7, v5}, Lnn2;-><init>(Llb4;Luj2;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v1, v3}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 338
    .line 339
    .line 340
    :goto_1
    return-void

    .line 341
    :pswitch_3
    check-cast v9, Lpn2;

    .line 342
    .line 343
    check-cast v0, Ljava/lang/String;

    .line 344
    .line 345
    check-cast v8, Lfr2;

    .line 346
    .line 347
    check-cast v7, Lnj2;

    .line 348
    .line 349
    check-cast v6, Landroid/os/Bundle;

    .line 350
    .line 351
    new-instance v1, Lva4;

    .line 352
    .line 353
    sget-object v2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 354
    .line 355
    invoke-direct {v1, v0, v2}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 356
    .line 357
    .line 358
    iget-object v0, v9, Lpn2;->x:Lna4;

    .line 359
    .line 360
    invoke-virtual {v0, v8, v1}, Lna4;->J(Lfr2;Lva4;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-nez v0, :cond_6

    .line 365
    .line 366
    invoke-virtual {v7}, Luj2;->e()V

    .line 367
    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_6
    iget-object v0, v9, Lpn2;->z:Ltn2;

    .line 371
    .line 372
    invoke-virtual {v0, v8, v1, v6}, Ltn2;->q(Lfr2;Lva4;Landroid/os/Bundle;)Lic2;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    new-instance v1, Lws1;

    .line 377
    .line 378
    const/16 v2, 0xf

    .line 379
    .line 380
    invoke-direct {v1, v2, v0, v7}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v0, v1, v3}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 384
    .line 385
    .line 386
    :goto_2
    return-void

    .line 387
    :pswitch_4
    check-cast v9, Lpn2;

    .line 388
    .line 389
    check-cast v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 390
    .line 391
    check-cast v0, Lfr2;

    .line 392
    .line 393
    check-cast v7, Ljn2;

    .line 394
    .line 395
    check-cast v6, Lq90;

    .line 396
    .line 397
    iget-object v1, v9, Lpn2;->z:Ltn2;

    .line 398
    .line 399
    invoke-virtual {v1, v0, v7}, Ltn2;->s(Lfr2;Ljn2;)Lmw1;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v8, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v6}, Lq90;->d()Z

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :pswitch_5
    check-cast v9, Lfx3;

    .line 411
    .line 412
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 413
    .line 414
    check-cast v0, Landroid/net/nsd/NsdServiceInfo;

    .line 415
    .line 416
    check-cast v7, Landroid/widget/ArrayAdapter;

    .line 417
    .line 418
    check-cast v6, Lf9;

    .line 419
    .line 420
    iget-boolean v1, v9, Lfx3;->n:Z

    .line 421
    .line 422
    if-nez v1, :cond_7

    .line 423
    .line 424
    invoke-virtual {v0}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-interface {v8, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v7}, Landroid/widget/ArrayAdapter;->clear()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Ljava/util/Collection;

    .line 439
    .line 440
    invoke-virtual {v7, v0}, Landroid/widget/ArrayAdapter;->addAll(Ljava/util/Collection;)V

    .line 441
    .line 442
    .line 443
    const v0, 0x7f1302ae

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6, v0}, Ldg;->setTitle(I)V

    .line 447
    .line 448
    .line 449
    :cond_7
    return-void

    .line 450
    :pswitch_6
    check-cast v9, Lf9;

    .line 451
    .line 452
    check-cast v8, Landroid/app/Activity;

    .line 453
    .line 454
    check-cast v7, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 455
    .line 456
    check-cast v6, Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 457
    .line 458
    invoke-static {v9, v8, v0, v7, v6}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->f(Lf9;Landroid/app/Activity;Ljava/lang/Object;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/eddyizm/tempus/homemusic/HubAppRelease;)V

    .line 459
    .line 460
    .line 461
    return-void

    .line 462
    :pswitch_7
    check-cast v9, Ljava/io/Serializable;

    .line 463
    .line 464
    move-object v10, v8

    .line 465
    check-cast v10, Landroid/content/Context;

    .line 466
    .line 467
    move-object v11, v0

    .line 468
    check-cast v11, Ljava/lang/String;

    .line 469
    .line 470
    move-object v12, v7

    .line 471
    check-cast v12, Ljava/util/ArrayList;

    .line 472
    .line 473
    move-object v15, v6

    .line 474
    check-cast v15, Ljava/lang/String;

    .line 475
    .line 476
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 477
    .line 478
    instance-of v0, v9, Ls14;

    .line 479
    .line 480
    if-nez v0, :cond_8

    .line 481
    .line 482
    move-object v0, v9

    .line 483
    check-cast v0, Lkd3;

    .line 484
    .line 485
    iget-object v1, v0, Lkd3;->n:Ljava/lang/Object;

    .line 486
    .line 487
    move-object v13, v1

    .line 488
    check-cast v13, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 489
    .line 490
    iget-object v0, v0, Lkd3;->o:Ljava/lang/Object;

    .line 491
    .line 492
    move-object v14, v0

    .line 493
    check-cast v14, Ljava/util/List;

    .line 494
    .line 495
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    const/16 v16, 0x0

    .line 499
    .line 500
    invoke-static/range {v10 .. v16}, Lcom/eddyizm/tempus/homemusic/a;->k(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;Lcom/eddyizm/tempus/homemusic/SmartOut;Ljava/util/List;Ljava/lang/String;I)V

    .line 501
    .line 502
    .line 503
    :cond_8
    invoke-static {v9}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    if-eqz v0, :cond_d

    .line 508
    .line 509
    const-string v1, "HubSmart"

    .line 510
    .line 511
    const-string v3, "start"

    .line 512
    .line 513
    invoke-static {v1, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 514
    .line 515
    .line 516
    sput-boolean v4, Lcom/eddyizm/tempus/homemusic/a;->d:Z

    .line 517
    .line 518
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    instance-of v1, v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 522
    .line 523
    if-eqz v1, :cond_9

    .line 524
    .line 525
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 526
    .line 527
    goto :goto_3

    .line 528
    :cond_9
    move-object v0, v2

    .line 529
    :goto_3
    if-eqz v0, :cond_b

    .line 530
    .line 531
    iget v1, v0, Lcom/eddyizm/tempus/homemusic/HubException;->n:I

    .line 532
    .line 533
    const/16 v3, 0x190

    .line 534
    .line 535
    if-gt v3, v1, :cond_a

    .line 536
    .line 537
    const/16 v3, 0x1f4

    .line 538
    .line 539
    if-ge v1, v3, :cond_a

    .line 540
    .line 541
    const/16 v3, 0x194

    .line 542
    .line 543
    if-eq v1, v3, :cond_a

    .line 544
    .line 545
    move-object v2, v0

    .line 546
    :cond_a
    if-eqz v2, :cond_b

    .line 547
    .line 548
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    if-nez v0, :cond_c

    .line 553
    .line 554
    :cond_b
    const v0, 0x7f130242

    .line 555
    .line 556
    .line 557
    invoke-virtual {v10, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    :cond_c
    invoke-static {v10, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 569
    .line 570
    .line 571
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 572
    .line 573
    .line 574
    :cond_d
    return-void

    .line 575
    :pswitch_8
    move-object v1, v9

    .line 576
    check-cast v1, Lez0;

    .line 577
    .line 578
    move-object v2, v8

    .line 579
    check-cast v2, Lup4;

    .line 580
    .line 581
    move-object v3, v0

    .line 582
    check-cast v3, Lup4;

    .line 583
    .line 584
    check-cast v7, Ldf;

    .line 585
    .line 586
    move-object v5, v6

    .line 587
    check-cast v5, Landroid/view/View;

    .line 588
    .line 589
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-object v0, v2, Lup4;->c:Lif1;

    .line 597
    .line 598
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-interface {v0, v6}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    check-cast v0, Ljava/lang/Boolean;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    iget-object v0, v3, Lup4;->c:Lif1;

    .line 616
    .line 617
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-interface {v0, v7}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    check-cast v0, Ljava/lang/Boolean;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 631
    .line 632
    .line 633
    move-result v7

    .line 634
    invoke-virtual/range {v1 .. v7}, Lez0;->b(Lup4;Lup4;Landroid/view/Window;Landroid/view/View;ZZ)V

    .line 635
    .line 636
    .line 637
    return-void

    .line 638
    :pswitch_9
    check-cast v9, Lna4;

    .line 639
    .line 640
    check-cast v8, Laa0;

    .line 641
    .line 642
    move-object v10, v0

    .line 643
    check-cast v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 644
    .line 645
    move-object v11, v7

    .line 646
    check-cast v11, Lba0;

    .line 647
    .line 648
    move-object v12, v6

    .line 649
    check-cast v12, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 650
    .line 651
    invoke-interface {v8}, Laa0;->run()Lic2;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    new-instance v8, Lt6;

    .line 656
    .line 657
    const/4 v13, 0x3

    .line 658
    invoke-direct/range {v8 .. v13}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 659
    .line 660
    .line 661
    invoke-interface {v0, v8, v3}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 662
    .line 663
    .line 664
    return-void

    .line 665
    :pswitch_a
    check-cast v9, Lzs4;

    .line 666
    .line 667
    check-cast v8, Lr62;

    .line 668
    .line 669
    move-object v11, v0

    .line 670
    check-cast v11, Ljava/lang/String;

    .line 671
    .line 672
    move-object/from16 v16, v7

    .line 673
    .line 674
    check-cast v16, Loo0;

    .line 675
    .line 676
    move-object v15, v6

    .line 677
    check-cast v15, Lha1;

    .line 678
    .line 679
    const-string v0, "BackgroundTextMeasurement"

    .line 680
    .line 681
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    :try_start_4
    invoke-static {}, Ljh4;->j()Lch4;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    instance-of v1, v0, La13;

    .line 689
    .line 690
    if-eqz v1, :cond_e

    .line 691
    .line 692
    check-cast v0, La13;

    .line 693
    .line 694
    goto :goto_4

    .line 695
    :cond_e
    move-object v0, v2

    .line 696
    :goto_4
    if-eqz v0, :cond_f

    .line 697
    .line 698
    invoke-virtual {v0, v2, v2}, La13;->C(Lif1;Lif1;)La13;

    .line 699
    .line 700
    .line 701
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 702
    if-eqz v1, :cond_f

    .line 703
    .line 704
    :try_start_5
    invoke-virtual {v1}, Lch4;->j()Lch4;

    .line 705
    .line 706
    .line 707
    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 708
    :try_start_6
    invoke-static {v9, v8}, Lud3;->g0(Lzs4;Lr62;)Lzs4;

    .line 709
    .line 710
    .line 711
    move-result-object v12

    .line 712
    sget-object v13, Lu01;->n:Lu01;

    .line 713
    .line 714
    new-instance v10, Lmc;

    .line 715
    .line 716
    const/16 v17, 0x1

    .line 717
    .line 718
    move-object v14, v13

    .line 719
    invoke-direct/range {v10 .. v17}, Lmc;-><init>(Ljava/lang/String;Lzs4;Ljava/util/List;Ljava/util/List;Lha1;Loo0;Z)V

    .line 720
    .line 721
    .line 722
    invoke-virtual {v10}, Lmc;->d()F

    .line 723
    .line 724
    .line 725
    invoke-virtual {v10}, Lmc;->b()F
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 726
    .line 727
    .line 728
    :try_start_7
    invoke-static {v2}, Lch4;->q(Lch4;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 729
    .line 730
    .line 731
    :try_start_8
    invoke-virtual {v1}, La13;->w()Ljz4;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v0}, Ljz4;->l()V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1}, La13;->c()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 739
    .line 740
    .line 741
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 742
    .line 743
    .line 744
    return-void

    .line 745
    :catchall_2
    move-exception v0

    .line 746
    goto :goto_5

    .line 747
    :catchall_3
    move-exception v0

    .line 748
    :try_start_9
    invoke-static {v2}, Lch4;->q(Lch4;)V

    .line 749
    .line 750
    .line 751
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 752
    :goto_5
    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 753
    :catchall_4
    move-exception v0

    .line 754
    :try_start_b
    invoke-virtual {v1}, La13;->c()V

    .line 755
    .line 756
    .line 757
    throw v0

    .line 758
    :catchall_5
    move-exception v0

    .line 759
    goto :goto_6

    .line 760
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 761
    .line 762
    const-string v1, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 763
    .line 764
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 768
    :goto_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 769
    .line 770
    .line 771
    throw v0

    .line 772
    nop

    .line 773
    :pswitch_data_0
    .packed-switch 0x0
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
