.class public final Lyk3;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lwk3;

.field public r:Lbl2;

.field public s:Ljava/util/List;

.field public t:Ljava/lang/String;

.field public u:Z

.field public v:Ljava/util/List;


# direct methods
.method public constructor <init>(Lwk3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 10
    .line 11
    iput-object v0, p0, Lyk3;->v:Ljava/util/List;

    .line 12
    .line 13
    iput-object p1, p0, Lyk3;->q:Lwk3;

    .line 14
    .line 15
    iput-object v0, p0, Lyk3;->s:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyk3;->s:Ljava/util/List;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final g(Lcx3;I)V
    .locals 13

    .line 1
    check-cast p1, Lxk3;

    .line 2
    .line 3
    iget-object p2, p0, Lyk3;->s:Ljava/util/List;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcx3;->d()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 14
    .line 15
    iget-object v0, p1, Lxk3;->u:Llo;

    .line 16
    .line 17
    iget-object v1, v0, Llo;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v2, v0, Llo;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/view/View;

    .line 24
    .line 25
    iget-object v3, v0, Llo;->m:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    iget-object v4, v0, Llo;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v4, Landroid/widget/ImageView;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Llo;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroid/widget/TextView;

    .line 43
    .line 44
    iget-object v5, p1, Lcx3;->a:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-static {v7, v8}, Lcom/eddyizm/tempus/homemusic/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-static {v8}, Le03;->g(Ljava/lang/Integer;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-static {p2}, Le03;->f(Lcom/eddyizm/tempus/subsonic/models/Child;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    filled-new-array {v7, v8, v9}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const v8, 0x7f13054d

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v8, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    invoke-static {v1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    const/4 v8, 0x0

    .line 101
    if-eqz v6, :cond_0

    .line 102
    .line 103
    invoke-static {}, Lud3;->t()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    invoke-static {v9, v6}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    move-object v9, v8

    .line 113
    :goto_0
    const/16 v10, 0x9

    .line 114
    .line 115
    invoke-static {v1, v6, v10, v7, v9}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-virtual {v1, v6}, Lvz3;->T(Lxv0;)Lvz3;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {}, Lud3;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    if-eqz v6, :cond_1

    .line 132
    .line 133
    invoke-virtual {v1}, Llq;->l()Llq;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Lvz3;

    .line 138
    .line 139
    :cond_1
    invoke-virtual {v1}, Llq;->x()Llq;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    check-cast v1, Lvz3;

    .line 144
    .line 145
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    invoke-static {v6}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    if-eqz v7, :cond_2

    .line 158
    .line 159
    invoke-static {}, Lud3;->t()I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-static {v8, v7}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    :cond_2
    invoke-static {v6, v7, v10, v9, v8}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v6, v7}, Lvz3;->T(Lxv0;)Lvz3;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    invoke-static {}, Lud3;->R()Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_3

    .line 184
    .line 185
    invoke-virtual {v6}, Llq;->l()Llq;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    check-cast v6, Lvz3;

    .line 190
    .line 191
    :cond_3
    invoke-virtual {v6, v1}, Lvz3;->S(Lvz3;)Lvz3;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget-object v6, v0, Llo;->i:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v6, Landroid/widget/ImageView;

    .line 198
    .line 199
    invoke-virtual {v1, v6}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 200
    .line 201
    .line 202
    iget-object v1, p0, Lyk3;->r:Lbl2;

    .line 203
    .line 204
    new-instance v6, Lsi1;

    .line 205
    .line 206
    const/16 v7, 0xe

    .line 207
    .line 208
    invoke-direct {v6, v7, p1}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    sget-object v7, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 212
    .line 213
    invoke-static {}, Lu52;->c()Lv52;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    iget-boolean v7, v7, Lv52;->a:Z

    .line 218
    .line 219
    const/16 v8, 0x14

    .line 220
    .line 221
    if-eqz v7, :cond_4

    .line 222
    .line 223
    invoke-static {}, Lu52;->c()Lv52;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iget v1, v1, Lv52;->o:I

    .line 228
    .line 229
    invoke-virtual {v6, v1}, Lsi1;->onRecovery(I)V

    .line 230
    .line 231
    .line 232
    goto :goto_1

    .line 233
    :cond_4
    if-eqz v1, :cond_5

    .line 234
    .line 235
    new-instance v7, Lws1;

    .line 236
    .line 237
    invoke-direct {v7, v8, v1, v6}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    sget-object v6, Lgq0;->n:Lgq0;

    .line 241
    .line 242
    invoke-virtual {v1, v7, v6}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 243
    .line 244
    .line 245
    :cond_5
    :goto_1
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    const/4 v6, 0x1

    .line 250
    const/4 v7, 0x0

    .line 251
    if-nez v1, :cond_7

    .line 252
    .line 253
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    if-eqz v1, :cond_6

    .line 262
    .line 263
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v1}, Leu0;->d(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    goto :goto_2

    .line 272
    :cond_6
    move v1, v7

    .line 273
    goto :goto_2

    .line 274
    :cond_7
    invoke-static {p2}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    if-eqz v1, :cond_6

    .line 279
    .line 280
    move v1, v6

    .line 281
    :goto_2
    iget-object v9, v0, Llo;->c:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v9, Landroid/widget/ImageView;

    .line 284
    .line 285
    const/16 v10, 0x8

    .line 286
    .line 287
    if-eqz v1, :cond_8

    .line 288
    .line 289
    invoke-virtual {v9, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_8
    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 294
    .line 295
    .line 296
    :goto_3
    const-string v1, "rating_per_item"

    .line 297
    .line 298
    invoke-static {v1, v7}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    const/4 v9, 0x4

    .line 303
    if-eqz v1, :cond_13

    .line 304
    .line 305
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    if-eqz v11, :cond_9

    .line 314
    .line 315
    move v11, v6

    .line 316
    goto :goto_4

    .line 317
    :cond_9
    move v11, v7

    .line 318
    :goto_4
    invoke-static {v6, v1, v11}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    if-nez v1, :cond_b

    .line 323
    .line 324
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    if-eqz v11, :cond_a

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_a
    move v11, v10

    .line 332
    goto :goto_6

    .line 333
    :cond_b
    :goto_5
    move v11, v7

    .line 334
    :goto_6
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    .line 335
    .line 336
    .line 337
    iget-object v3, v0, Llo;->h:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v3, Landroid/widget/ImageView;

    .line 340
    .line 341
    if-eqz v1, :cond_c

    .line 342
    .line 343
    move v1, v7

    .line 344
    goto :goto_7

    .line 345
    :cond_c
    move v1, v10

    .line 346
    :goto_7
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 347
    .line 348
    .line 349
    iget-object v1, v0, Llo;->l:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v1, Landroid/widget/LinearLayout;

    .line 352
    .line 353
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    if-eqz v3, :cond_d

    .line 358
    .line 359
    move v10, v7

    .line 360
    :cond_d
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    if-eqz v1, :cond_14

    .line 368
    .line 369
    iget-object v1, v0, Llo;->f:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v1, Landroid/widget/ImageView;

    .line 372
    .line 373
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 382
    .line 383
    .line 384
    move-result v10

    .line 385
    const v11, 0x7f080224

    .line 386
    .line 387
    .line 388
    const v12, 0x7f080223

    .line 389
    .line 390
    .line 391
    if-lt v10, v6, :cond_e

    .line 392
    .line 393
    move v6, v12

    .line 394
    goto :goto_8

    .line 395
    :cond_e
    move v6, v11

    .line 396
    :goto_8
    invoke-static {v3, v6}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 401
    .line 402
    .line 403
    iget-object v1, v0, Llo;->o:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v1, Landroid/widget/ImageView;

    .line 406
    .line 407
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result v6

    .line 419
    const/4 v10, 0x2

    .line 420
    if-lt v6, v10, :cond_f

    .line 421
    .line 422
    move v6, v12

    .line 423
    goto :goto_9

    .line 424
    :cond_f
    move v6, v11

    .line 425
    :goto_9
    invoke-static {v3, v6}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 430
    .line 431
    .line 432
    iget-object v1, v0, Llo;->n:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v1, Landroid/widget/ImageView;

    .line 435
    .line 436
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result v6

    .line 448
    const/4 v10, 0x3

    .line 449
    if-lt v6, v10, :cond_10

    .line 450
    .line 451
    move v6, v12

    .line 452
    goto :goto_a

    .line 453
    :cond_10
    move v6, v11

    .line 454
    :goto_a
    invoke-static {v3, v6}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 459
    .line 460
    .line 461
    iget-object v1, v0, Llo;->e:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v1, Landroid/widget/ImageView;

    .line 464
    .line 465
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 474
    .line 475
    .line 476
    move-result v6

    .line 477
    if-lt v6, v9, :cond_11

    .line 478
    .line 479
    move v6, v12

    .line 480
    goto :goto_b

    .line 481
    :cond_11
    move v6, v11

    .line 482
    :goto_b
    invoke-static {v3, v6}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 487
    .line 488
    .line 489
    iget-object v0, v0, Llo;->d:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, Landroid/widget/ImageView;

    .line 492
    .line 493
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    const/4 v6, 0x5

    .line 506
    if-lt v3, v6, :cond_12

    .line 507
    .line 508
    move v11, v12

    .line 509
    :cond_12
    invoke-static {v1, v11}, Lzz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 514
    .line 515
    .line 516
    goto :goto_c

    .line 517
    :cond_13
    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 518
    .line 519
    .line 520
    :cond_14
    :goto_c
    new-instance v0, Lj8;

    .line 521
    .line 522
    invoke-direct {v0, v8, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 526
    .line 527
    .line 528
    iget-object p1, p0, Lyk3;->t:Ljava/lang/String;

    .line 529
    .line 530
    if-eqz p1, :cond_16

    .line 531
    .line 532
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object p2

    .line 536
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result p1

    .line 540
    if-eqz p1, :cond_16

    .line 541
    .line 542
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 543
    .line 544
    .line 545
    iget-boolean p0, p0, Lyk3;->u:Z

    .line 546
    .line 547
    if-eqz p0, :cond_15

    .line 548
    .line 549
    const p0, 0x7f080201

    .line 550
    .line 551
    .line 552
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 553
    .line 554
    .line 555
    goto :goto_d

    .line 556
    :cond_15
    const p0, 0x7f08020a

    .line 557
    .line 558
    .line 559
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 560
    .line 561
    .line 562
    :goto_d
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 563
    .line 564
    .line 565
    return-void

    .line 566
    :cond_16
    invoke-virtual {v4, v9}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 570
    .line 571
    .line 572
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 18

    .line 1
    const v0, 0x7f0d00b5

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v0, v2, v1}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f0a017a

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    const v1, 0x7f0a01c5

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v5, v2

    .line 28
    check-cast v5, Landroid/widget/ImageView;

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    const v1, 0x7f0a0258

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v6, v2

    .line 40
    check-cast v6, Landroid/widget/ImageView;

    .line 41
    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    const v1, 0x7f0a0260

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    move-object v7, v2

    .line 52
    check-cast v7, Landroid/widget/ImageView;

    .line 53
    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    const v1, 0x7f0a0434

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    move-object v8, v2

    .line 64
    check-cast v8, Landroid/widget/ImageView;

    .line 65
    .line 66
    if-eqz v8, :cond_0

    .line 67
    .line 68
    const v1, 0x7f0a0465

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    move-object v9, v2

    .line 76
    check-cast v9, Landroid/widget/ImageView;

    .line 77
    .line 78
    if-eqz v9, :cond_0

    .line 79
    .line 80
    const v1, 0x7f0a04f8

    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    move-object v10, v2

    .line 88
    check-cast v10, Landroid/widget/ImageView;

    .line 89
    .line 90
    if-eqz v10, :cond_0

    .line 91
    .line 92
    const v1, 0x7f0a04fe

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    move-object v11, v2

    .line 100
    check-cast v11, Landroid/widget/ImageView;

    .line 101
    .line 102
    if-eqz v11, :cond_0

    .line 103
    .line 104
    const v1, 0x7f0a04ff

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    check-cast v2, Landroid/widget/ImageView;

    .line 112
    .line 113
    if-eqz v2, :cond_0

    .line 114
    .line 115
    const v1, 0x7f0a0500

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v12, v2

    .line 123
    check-cast v12, Landroid/widget/TextView;

    .line 124
    .line 125
    if-eqz v12, :cond_0

    .line 126
    .line 127
    const v1, 0x7f0a0501

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v13, v2

    .line 135
    check-cast v13, Landroid/widget/TextView;

    .line 136
    .line 137
    if-eqz v13, :cond_0

    .line 138
    .line 139
    const v1, 0x7f0a050b

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    move-object v14, v2

    .line 147
    check-cast v14, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    if-eqz v14, :cond_0

    .line 150
    .line 151
    const v1, 0x7f0a050d

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    move-object v15, v2

    .line 159
    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 160
    .line 161
    if-eqz v15, :cond_0

    .line 162
    .line 163
    const v1, 0x7f0a060c

    .line 164
    .line 165
    .line 166
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move-object/from16 v16, v2

    .line 171
    .line 172
    check-cast v16, Landroid/widget/ImageView;

    .line 173
    .line 174
    if-eqz v16, :cond_0

    .line 175
    .line 176
    const v1, 0x7f0a0643

    .line 177
    .line 178
    .line 179
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    move-object/from16 v17, v2

    .line 184
    .line 185
    check-cast v17, Landroid/widget/ImageView;

    .line 186
    .line 187
    if-eqz v17, :cond_0

    .line 188
    .line 189
    new-instance v2, Llo;

    .line 190
    .line 191
    move-object v3, v0

    .line 192
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 193
    .line 194
    invoke-direct/range {v2 .. v17}, Llo;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

    .line 195
    .line 196
    .line 197
    new-instance v0, Lxk3;

    .line 198
    .line 199
    move-object/from16 v1, p0

    .line 200
    .line 201
    invoke-direct {v0, v1, v2}, Lxk3;-><init>(Lyk3;Llo;)V

    .line 202
    .line 203
    .line 204
    return-object v0

    .line 205
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const-string v1, "Missing required view with ID: "

    .line 214
    .line 215
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const/4 v0, 0x0

    .line 223
    return-object v0
.end method

.method public final p(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    iget-object v2, p0, Lyk3;->s:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ge v1, v2, :cond_2

    .line 19
    .line 20
    iget-object v2, p0, Lyk3;->s:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return-object v0
.end method

.method public final q(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyk3;->t:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lyk3;->u:Z

    .line 4
    .line 5
    iget-object v2, p0, Lyk3;->v:Ljava/util/List;

    .line 6
    .line 7
    iput-object p1, p0, Lyk3;->t:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, Lyk3;->u:Z

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v1, p2, :cond_1

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lyk3;->p(Ljava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 27
    .line 28
    :goto_0
    invoke-interface {v2, p2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    goto :goto_4

    .line 35
    :cond_1
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lyk3;->p(Ljava/lang/String;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 43
    .line 44
    :goto_1
    iput-object p1, p0, Lyk3;->v:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const-string v0, "payload_playback"

    .line 55
    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-ltz p2, :cond_3

    .line 69
    .line 70
    iget-object v1, p0, Lyk3;->s:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-ge p2, v1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, p2, v0}, Ldw3;->e(ILjava/lang/Comparable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    iget-object p1, p0, Lyk3;->v:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_6

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_5

    .line 109
    .line 110
    if-ltz v1, :cond_5

    .line 111
    .line 112
    iget-object p2, p0, Lyk3;->s:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-ge v1, p2, :cond_5

    .line 119
    .line 120
    invoke-virtual {p0, v1, v0}, Ldw3;->e(ILjava/lang/Comparable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    :goto_4
    return-void
.end method
