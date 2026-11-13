.class public final synthetic Ldefpackage/lf;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/lf;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/lf;->o:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Ldefpackage/lf;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Ldefpackage/lf;->o:Landroid/content/Context;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Ldefpackage/di;

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    invoke-direct {v0, v2}, Ldefpackage/di;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sget-object v2, Ldefpackage/tq3;->a:Ldefpackage/hh3;

    .line 16
    .line 17
    invoke-static {p0, v0, v2, v1}, Ldefpackage/tq3;->b(Landroid/content/Context;Ljava/util/concurrent/Executor;Ldefpackage/sq3;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 22
    .line 23
    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 24
    .line 25
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x1

    .line 30
    const-wide/16 v3, 0x0

    .line 31
    .line 32
    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, Ldefpackage/lf;

    .line 38
    .line 39
    const/4 v2, 0x7

    .line 40
    invoke-direct {v1, p0, v2}, Ldefpackage/lf;-><init>(Landroid/content/Context;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    :try_start_0
    sput-object v0, Ldefpackage/mm3;->g:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v0, Ldefpackage/mm3;

    .line 58
    .line 59
    invoke-direct {v0}, Ldefpackage/mm3;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p0}, Ldefpackage/mm3;->i(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    move-object p0, v0

    .line 68
    const-string v0, "HubNotifier"

    .line 69
    .line 70
    const-string v1, "Keep-synced playlists sync failed"

    .line 71
    .line 72
    invoke-static {v0, v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void

    .line 76
    :pswitch_2
    :try_start_1
    invoke-static {p0}, Ldefpackage/gi1;->j(Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :catch_1
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    const-string v0, "HubEvents"

    .line 83
    .line 84
    const-string v1, "Check after event failed"

    .line 85
    .line 86
    invoke-static {v0, v1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 87
    .line 88
    .line 89
    :goto_1
    return-void

    .line 90
    :pswitch_3
    sget-object v2, Ldefpackage/pt0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 91
    .line 92
    :try_start_2
    invoke-static {p0}, Ldefpackage/pt0;->e(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    .line 95
    :goto_2
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 96
    .line 97
    .line 98
    goto :goto_3

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    move-object p0, v0

    .line 101
    goto :goto_4

    .line 102
    :catch_2
    move-exception v0

    .line 103
    move-object p0, v0

    .line 104
    :try_start_3
    const-string v0, "DownloadRepair"

    .line 105
    .line 106
    const-string v3, "Download repair failed"

    .line 107
    .line 108
    invoke-static {v0, v3, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :goto_3
    return-void

    .line 113
    :goto_4
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 114
    .line 115
    .line 116
    throw p0

    .line 117
    :pswitch_4
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v0, :cond_0

    .line 122
    .line 123
    invoke-static {p0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Ldefpackage/eu0;->g()V

    .line 128
    .line 129
    .line 130
    :cond_0
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    new-instance v2, Ldefpackage/af4;

    .line 141
    .line 142
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {v0, v3}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {v2, p0, v0}, Ldefpackage/af4;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 151
    .line 152
    .line 153
    const/4 v3, 0x2

    .line 154
    invoke-virtual {p0, v0, v3}, Landroid/content/Context;->checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    if-eqz v4, :cond_1

    .line 159
    .line 160
    goto/16 :goto_9

    .line 161
    .line 162
    :cond_1
    const-string v4, "mime_type"

    .line 163
    .line 164
    invoke-static {p0, v0, v4}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    const-string v5, "flags"

    .line 169
    .line 170
    const-wide/16 v6, 0x0

    .line 171
    .line 172
    invoke-static {p0, v0, v5, v6, v7}, Ldefpackage/h12;->J(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    long-to-int p0, v5

    .line 177
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_2

    .line 182
    .line 183
    goto/16 :goto_9

    .line 184
    .line 185
    :cond_2
    and-int/lit8 v0, p0, 0x4

    .line 186
    .line 187
    if-eqz v0, :cond_3

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_3
    const-string v0, "vnd.android.document/directory"

    .line 191
    .line 192
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_4

    .line 197
    .line 198
    and-int/lit8 v0, p0, 0x8

    .line 199
    .line 200
    if-eqz v0, :cond_4

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_4
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_8

    .line 208
    .line 209
    and-int/2addr p0, v3

    .line 210
    if-eqz p0, :cond_8

    .line 211
    .line 212
    :goto_5
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-virtual {p0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    new-instance v3, Ldefpackage/lg1;

    .line 221
    .line 222
    const/16 v0, 0xa

    .line 223
    .line 224
    invoke-direct {v3, v0, p0}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    new-instance p0, Ljava/lang/Thread;

    .line 228
    .line 229
    invoke-direct {p0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 233
    .line 234
    .line 235
    :try_start_4
    invoke-virtual {p0}, Ljava/lang/Thread;->join()V
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :catch_3
    move-exception v0

    .line 240
    move-object p0, v0

    .line 241
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 242
    .line 243
    .line 244
    :goto_6
    iget-object p0, v3, Ldefpackage/lg1;->p:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p0, Ljava/util/List;

    .line 247
    .line 248
    new-instance v0, Ljava/util/HashMap;

    .line 249
    .line 250
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    :cond_5
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-eqz v3, :cond_6

    .line 262
    .line 263
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    check-cast v3, Lcom/eddyizm/tempus/model/Download;

    .line 268
    .line 269
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v4

    .line 273
    if-eqz v4, :cond_5

    .line 274
    .line 275
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_6
    invoke-virtual {v2}, Ldefpackage/af4;->g()[Ldefpackage/af4;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    array-length v2, p0

    .line 288
    move v3, v1

    .line 289
    :goto_8
    if-ge v3, v2, :cond_8

    .line 290
    .line 291
    aget-object v4, p0, v3

    .line 292
    .line 293
    invoke-virtual {v4}, Ldefpackage/af4;->d()Landroid/net/Uri;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_7

    .line 306
    .line 307
    invoke-virtual {v4}, Ldefpackage/af4;->a()Z

    .line 308
    .line 309
    .line 310
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-virtual {v4}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    check-cast v5, Lcom/eddyizm/tempus/model/Download;

    .line 323
    .line 324
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    new-instance v6, Ldefpackage/qt0;

    .line 329
    .line 330
    invoke-direct {v6, v4, v5, v1}, Ldefpackage/qt0;-><init>(Ldefpackage/ss0;Ljava/lang/String;I)V

    .line 331
    .line 332
    .line 333
    new-instance v4, Ljava/lang/Thread;

    .line 334
    .line 335
    invoke-direct {v4, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 339
    .line 340
    .line 341
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :cond_8
    :goto_9
    invoke-static {}, Ldefpackage/g51;->i()V

    .line 345
    .line 346
    .line 347
    invoke-static {}, Ldefpackage/j51;->o()V

    .line 348
    .line 349
    .line 350
    :cond_9
    return-void

    .line 351
    :pswitch_5
    invoke-static {p0}, Ldefpackage/pf;->q(Landroid/content/Context;)V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 356
    .line 357
    const/4 v1, 0x1

    .line 358
    const/16 v2, 0x21

    .line 359
    .line 360
    if-lt v0, v2, :cond_d

    .line 361
    .line 362
    new-instance v3, Landroid/content/ComponentName;

    .line 363
    .line 364
    const-string v4, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 365
    .line 366
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-virtual {v4, v3}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eq v4, v1, :cond_d

    .line 378
    .line 379
    if-lt v0, v2, :cond_a

    .line 380
    .line 381
    invoke-static {}, Ldefpackage/pf;->b()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    if-eqz v0, :cond_b

    .line 386
    .line 387
    invoke-static {v0}, Ldefpackage/nf;->a(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    new-instance v2, Ldefpackage/wd2;

    .line 392
    .line 393
    new-instance v4, Ldefpackage/xd2;

    .line 394
    .line 395
    invoke-direct {v4, v0}, Ldefpackage/xd2;-><init>(Landroid/os/LocaleList;)V

    .line 396
    .line 397
    .line 398
    invoke-direct {v2, v4}, Ldefpackage/wd2;-><init>(Ldefpackage/xd2;)V

    .line 399
    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_a
    sget-object v2, Ldefpackage/pf;->p:Ldefpackage/wd2;

    .line 403
    .line 404
    if-eqz v2, :cond_b

    .line 405
    .line 406
    goto :goto_a

    .line 407
    :cond_b
    sget-object v2, Ldefpackage/wd2;->b:Ldefpackage/wd2;

    .line 408
    .line 409
    :goto_a
    iget-object v0, v2, Ldefpackage/wd2;->a:Ldefpackage/xd2;

    .line 410
    .line 411
    iget-object v0, v0, Ldefpackage/xd2;->a:Landroid/os/LocaleList;

    .line 412
    .line 413
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_c

    .line 418
    .line 419
    invoke-static {p0}, Ldefpackage/si0;->I(Landroid/content/Context;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    const-string v2, "locale"

    .line 424
    .line 425
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    if-eqz v2, :cond_c

    .line 430
    .line 431
    invoke-static {v0}, Ldefpackage/mf;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v2, v0}, Ldefpackage/nf;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 436
    .line 437
    .line 438
    :cond_c
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    invoke-virtual {p0, v3, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 443
    .line 444
    .line 445
    :cond_d
    sput-boolean v1, Ldefpackage/pf;->s:Z

    .line 446
    .line 447
    return-void

    .line 448
    nop

    .line 449
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
