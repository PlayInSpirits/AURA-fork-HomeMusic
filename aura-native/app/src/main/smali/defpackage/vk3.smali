.class public final synthetic Ldefpackage/vk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/wk3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/wk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/vk3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/vk3;->o:Ldefpackage/wk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 11

    .line 1
    iget p1, p0, Ldefpackage/vk3;->n:I

    .line 2
    .line 3
    sget-object v0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 4
    .line 5
    const-string v1, "Queue is empty"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const-wide/16 v3, 0x3e8

    .line 9
    .line 10
    const/4 v5, 0x4

    .line 11
    const-string v6, "PlayerQueueFragment"

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/vk3;->o:Ldefpackage/wk3;

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    const-string p1, "Load Queue Clicked!"

    .line 19
    .line 20
    invoke-static {v6, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ldefpackage/ud3;->Y()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/wk3;->k0()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v2, Ldefpackage/bq4;

    .line 50
    .line 51
    invoke-direct {v2, v0, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 52
    .line 53
    .line 54
    const-class p1, Ldefpackage/aj3;

    .line 55
    .line 56
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v2, p1, v0}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Ldefpackage/aj3;

    .line 77
    .line 78
    invoke-virtual {p1}, Ldefpackage/aj3;->c()Ldefpackage/k03;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v2, Ldefpackage/i7;

    .line 87
    .line 88
    invoke-direct {v2, v5, p0, p1}, Ldefpackage/i7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, Landroid/os/Handler;

    .line 95
    .line 96
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 97
    .line 98
    .line 99
    new-instance v0, Ldefpackage/tk3;

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    invoke-direct {v0, p0, v1}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 110
    .line 111
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    return-void

    .line 115
    :pswitch_0
    const-string p1, "Download All Clicked!"

    .line 116
    .line 117
    invoke-static {v6, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 121
    .line 122
    iget-object p1, p1, Ldefpackage/yk3;->s:Ljava/util/List;

    .line 123
    .line 124
    if-eqz p1, :cond_9

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    goto/16 :goto_4

    .line 133
    .line 134
    :cond_2
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const v1, 0x7f120010

    .line 139
    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {p1}, Ldefpackage/gi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v5, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    if-eqz v8, :cond_3

    .line 161
    .line 162
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 167
    .line 168
    new-instance v9, Lcom/eddyizm/tempus/model/Download;

    .line 169
    .line 170
    invoke-direct {v9, v8}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v9, v10}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    invoke-virtual {v9, v10}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    invoke-virtual {v9, v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_3
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-static {v7}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    if-eqz v7, :cond_4

    .line 207
    .line 208
    invoke-virtual {v7, v0, v5, v2}, Ldefpackage/eu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 209
    .line 210
    .line 211
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-virtual {v5, v1, p1, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {v0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 240
    .line 241
    .line 242
    new-instance p1, Landroid/os/Handler;

    .line 243
    .line 244
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 245
    .line 246
    .line 247
    new-instance v0, Ldefpackage/tk3;

    .line 248
    .line 249
    const/4 v1, 0x2

    .line 250
    invoke-direct {v0, p0, v1}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 254
    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_4
    const-string p1, "DownloaderManager not initialized. Check DownloadUtil."

    .line 258
    .line 259
    invoke-static {v6, p1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    const-string v0, "Download service unavailable."

    .line 267
    .line 268
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 273
    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    move v0, v2

    .line 281
    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-eqz v3, :cond_7

    .line 286
    .line 287
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 292
    .line 293
    invoke-static {v3}, Ldefpackage/g51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    if-nez v4, :cond_6

    .line 298
    .line 299
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-static {v4, v3}, Ldefpackage/i51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 304
    .line 305
    .line 306
    add-int/lit8 v0, v0, 0x1

    .line 307
    .line 308
    goto :goto_2

    .line 309
    :cond_7
    if-lez v0, :cond_8

    .line 310
    .line 311
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {p0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v3, v1, v0, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 336
    .line 337
    .line 338
    new-instance p1, Landroid/os/Handler;

    .line 339
    .line 340
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 341
    .line 342
    .line 343
    new-instance v0, Ldefpackage/tk3;

    .line 344
    .line 345
    const/4 v1, 0x3

    .line 346
    invoke-direct {v0, p0, v1}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 347
    .line 348
    .line 349
    const-wide/16 v1, 0x7d0

    .line 350
    .line 351
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 352
    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_8
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    const-string v0, "All songs already downloaded"

    .line 360
    .line 361
    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 366
    .line 367
    .line 368
    :goto_3
    invoke-virtual {p0}, Ldefpackage/wk3;->k0()V

    .line 369
    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_9
    :goto_4
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    invoke-static {p1, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0}, Ldefpackage/wk3;->k0()V

    .line 384
    .line 385
    .line 386
    :goto_5
    return-void

    .line 387
    :pswitch_1
    const-string p1, "Save to Playlist Clicked!"

    .line 388
    .line 389
    invoke-static {v6, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 390
    .line 391
    .line 392
    iget-object p1, p0, Ldefpackage/wk3;->w0:Ldefpackage/yk3;

    .line 393
    .line 394
    iget-object p1, p1, Ldefpackage/yk3;->s:Ljava/util/List;

    .line 395
    .line 396
    if-eqz p1, :cond_b

    .line 397
    .line 398
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_a

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_a
    new-instance v0, Landroid/os/Bundle;

    .line 406
    .line 407
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 408
    .line 409
    .line 410
    new-instance v1, Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 413
    .line 414
    .line 415
    const-string p1, "TRACKS_OBJECT"

    .line 416
    .line 417
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 418
    .line 419
    .line 420
    new-instance p1, Ldefpackage/fl3;

    .line 421
    .line 422
    invoke-direct {p1}, Ldefpackage/fl3;-><init>()V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1, v0}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    const/4 v1, 0x0

    .line 437
    invoke-virtual {p1, v0, v1}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p0}, Ldefpackage/wk3;->k0()V

    .line 441
    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_b
    :goto_6
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-static {p1, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {p0}, Ldefpackage/wk3;->k0()V

    .line 456
    .line 457
    .line 458
    :goto_7
    return-void

    .line 459
    :pswitch_2
    const-string p1, "Shuffle Queue Clicked!"

    .line 460
    .line 461
    invoke-static {v6, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 462
    .line 463
    .line 464
    iget-object p1, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 465
    .line 466
    new-instance v1, Ldefpackage/tk3;

    .line 467
    .line 468
    const/4 v2, 0x6

    .line 469
    invoke-direct {v1, p0, v2}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1, v1, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :pswitch_3
    const-string p1, "Clear Queue Clicked!"

    .line 477
    .line 478
    invoke-static {v6, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 479
    .line 480
    .line 481
    iget-object p1, p0, Ldefpackage/wk3;->v0:Ldefpackage/bl2;

    .line 482
    .line 483
    new-instance v1, Ldefpackage/tk3;

    .line 484
    .line 485
    invoke-direct {v1, p0, v5}, Ldefpackage/tk3;-><init>(Ldefpackage/wk3;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {p1, v1, v0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :pswitch_4
    invoke-virtual {p0}, Ldefpackage/wk3;->k0()V

    .line 493
    .line 494
    .line 495
    return-void

    .line 496
    nop

    .line 497
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
