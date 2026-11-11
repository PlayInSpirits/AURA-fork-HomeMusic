.class public final synthetic Lv7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkc1;


# direct methods
.method public synthetic constructor <init>(ILkc1;)V
    .locals 0

    .line 1
    iput p1, p0, Lv7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lv7;->b:Lkc1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    iget v0, p0, Lv7;->a:I

    .line 2
    .line 3
    const-string v1, "ALBUM_ORDER_BY_NAME"

    .line 4
    .line 5
    const-string v2, "ARTIST_ORDER_BY_NAME"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object p0, p0, Lv7;->b:Lkc1;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 15
    .line 16
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const v1, 0x7f0a0396

    .line 21
    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 26
    .line 27
    const-string p1, "MEDIA_BY_TITLE"

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lni4;->t(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    move v3, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const v1, 0x7f0a0395

    .line 39
    .line 40
    .line 41
    if-ne v0, v1, :cond_1

    .line 42
    .line 43
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 44
    .line 45
    const-string p1, "MEDIA_MOST_RECENTLY_STARRED"

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lni4;->t(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    const v0, 0x7f0a0394

    .line 56
    .line 57
    .line 58
    if-ne p1, v0, :cond_2

    .line 59
    .line 60
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 61
    .line 62
    const-string p1, "MEDIA_LEAST_RECENTLY_STARRED"

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lni4;->t(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    :goto_1
    return v3

    .line 69
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;

    .line 70
    .line 71
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const v1, 0x7f0a0393

    .line 76
    .line 77
    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Len3;

    .line 81
    .line 82
    const-string p1, "PODCAST_FILTER_BY_DOWNLOAD"

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Len3;->q(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    move v3, v4

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    const v0, 0x7f0a0392

    .line 94
    .line 95
    .line 96
    if-ne p1, v0, :cond_4

    .line 97
    .line 98
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Len3;

    .line 99
    .line 100
    const-string p1, "PODCAST_FILTER_BY_ALL"

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Len3;->q(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    :goto_3
    return v3

    .line 107
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;

    .line 108
    .line 109
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const v0, 0x7f0a038e

    .line 114
    .line 115
    .line 116
    if-ne p1, v0, :cond_5

    .line 117
    .line 118
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 119
    .line 120
    const-string p1, "ORDER_BY_NAME"

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    const v0, 0x7f0a038f

    .line 127
    .line 128
    .line 129
    if-ne p1, v0, :cond_6

    .line 130
    .line 131
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 132
    .line 133
    const-string p1, "ORDER_BY_PINNED"

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_6
    const v0, 0x7f0a0390

    .line 140
    .line 141
    .line 142
    if-ne p1, v0, :cond_7

    .line 143
    .line 144
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 145
    .line 146
    const-string p1, "ORDER_BY_RANDOM"

    .line 147
    .line 148
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    const v0, 0x7f0a038b

    .line 153
    .line 154
    .line 155
    if-ne p1, v0, :cond_8

    .line 156
    .line 157
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 158
    .line 159
    const-string p1, "ORDER_BY_DATE"

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_8
    const v0, 0x7f0a0391

    .line 166
    .line 167
    .line 168
    if-ne p1, v0, :cond_9

    .line 169
    .line 170
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 171
    .line 172
    const-string p1, "ORDER_BY_SONGS"

    .line 173
    .line 174
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_9
    const v0, 0x7f0a038c

    .line 179
    .line 180
    .line 181
    if-ne p1, v0, :cond_a

    .line 182
    .line 183
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 184
    .line 185
    const-string p1, "ORDER_BY_LAST_PLAYED"

    .line 186
    .line 187
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_a
    const v0, 0x7f0a038d

    .line 192
    .line 193
    .line 194
    if-ne p1, v0, :cond_b

    .line 195
    .line 196
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 197
    .line 198
    const-string p1, "ORDER_BY_LAST_UPDATED"

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_b
    const v0, 0x7f0a038a

    .line 205
    .line 206
    .line 207
    if-ne p1, v0, :cond_c

    .line 208
    .line 209
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldl3;

    .line 210
    .line 211
    const-string p1, "ORDER_BY_BOTH"

    .line 212
    .line 213
    invoke-virtual {p0, p1}, Ldl3;->c(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_c
    :goto_4
    return v4

    .line 217
    :pswitch_2
    check-cast p0, Lcp1;

    .line 218
    .line 219
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const v1, 0x7f0a0388

    .line 224
    .line 225
    .line 226
    if-ne v0, v1, :cond_d

    .line 227
    .line 228
    iget-object p1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 229
    .line 230
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {p1, v0, v3}, Lcom/eddyizm/tempus/viewmodel/b;->c(Lle1;I)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lcp1;->l0:Ltc1;

    .line 238
    .line 239
    iget-object p1, p1, Ltc1;->k:Landroid/widget/TextView;

    .line 240
    .line 241
    const v0, 0x7f13018a

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    .line 250
    .line 251
    :goto_5
    move v3, v4

    .line 252
    goto :goto_6

    .line 253
    :cond_d
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    const v1, 0x7f0a0387

    .line 258
    .line 259
    .line 260
    if-ne v0, v1, :cond_e

    .line 261
    .line 262
    iget-object p1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 263
    .line 264
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {p1, v0, v4}, Lcom/eddyizm/tempus/viewmodel/b;->c(Lle1;I)V

    .line 269
    .line 270
    .line 271
    iget-object p1, p0, Lcp1;->l0:Ltc1;

    .line 272
    .line 273
    iget-object p1, p1, Ltc1;->k:Landroid/widget/TextView;

    .line 274
    .line 275
    const v0, 0x7f130187

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_e
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    const v0, 0x7f0a0389

    .line 291
    .line 292
    .line 293
    if-ne p1, v0, :cond_f

    .line 294
    .line 295
    iget-object p1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 296
    .line 297
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    const/4 v1, 0x2

    .line 302
    invoke-virtual {p1, v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->c(Lle1;I)V

    .line 303
    .line 304
    .line 305
    iget-object p1, p0, Lcp1;->l0:Ltc1;

    .line 306
    .line 307
    iget-object p1, p1, Ltc1;->k:Landroid/widget/TextView;

    .line 308
    .line 309
    const v0, 0x7f13018b

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 317
    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_f
    :goto_6
    return v3

    .line 321
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 322
    .line 323
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    const v1, 0x7f0a037f

    .line 328
    .line 329
    .line 330
    if-ne v0, v1, :cond_10

    .line 331
    .line 332
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Lej;

    .line 333
    .line 334
    iget-object p1, p0, Lej;->r:Ljava/util/List;

    .line 335
    .line 336
    new-instance v0, Lm7;

    .line 337
    .line 338
    const/16 v1, 0x18

    .line 339
    .line 340
    invoke-direct {v0, v1}, Lm7;-><init>(I)V

    .line 341
    .line 342
    .line 343
    invoke-static {v0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-interface {p1, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p0}, Ldw3;->d()V

    .line 351
    .line 352
    .line 353
    :goto_7
    move v3, v4

    .line 354
    goto :goto_8

    .line 355
    :cond_10
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    const v0, 0x7f0a0380

    .line 360
    .line 361
    .line 362
    if-ne p1, v0, :cond_11

    .line 363
    .line 364
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Lej;

    .line 365
    .line 366
    iget-object p1, p0, Lej;->r:Ljava/util/List;

    .line 367
    .line 368
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p0}, Ldw3;->d()V

    .line 372
    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_11
    :goto_8
    return v3

    .line 376
    :pswitch_4
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 377
    .line 378
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    const v1, 0x7f0a037c

    .line 383
    .line 384
    .line 385
    if-ne v0, v1, :cond_12

    .line 386
    .line 387
    const-string p1, "download_type_track"

    .line 388
    .line 389
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->h0(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :goto_9
    move v3, v4

    .line 393
    goto :goto_a

    .line 394
    :cond_12
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    const v1, 0x7f0a0378

    .line 399
    .line 400
    .line 401
    if-ne v0, v1, :cond_13

    .line 402
    .line 403
    const-string p1, "download_type_album"

    .line 404
    .line 405
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->h0(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    goto :goto_9

    .line 409
    :cond_13
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    const v1, 0x7f0a0379

    .line 414
    .line 415
    .line 416
    if-ne v0, v1, :cond_14

    .line 417
    .line 418
    const-string p1, "download_type_artist"

    .line 419
    .line 420
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->h0(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_14
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    const v1, 0x7f0a037a

    .line 429
    .line 430
    .line 431
    if-ne v0, v1, :cond_15

    .line 432
    .line 433
    const-string p1, "download_type_genre"

    .line 434
    .line 435
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->h0(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    goto :goto_9

    .line 439
    :cond_15
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    const v1, 0x7f0a037d

    .line 444
    .line 445
    .line 446
    if-ne v0, v1, :cond_16

    .line 447
    .line 448
    const-string p1, "download_type_year"

    .line 449
    .line 450
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->h0(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    goto :goto_9

    .line 454
    :cond_16
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    const v1, 0x7f0a037b

    .line 459
    .line 460
    .line 461
    if-ne v0, v1, :cond_17

    .line 462
    .line 463
    const-string p1, "download_type_playlist"

    .line 464
    .line 465
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->h0(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_17
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    const v0, 0x7f0a037e

    .line 474
    .line 475
    .line 476
    if-ne p1, v0, :cond_18

    .line 477
    .line 478
    new-instance p1, Landroid/content/Intent;

    .line 479
    .line 480
    const-string v0, "android.intent.action.OPEN_DOCUMENT_TREE"

    .line 481
    .line 482
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    const/16 v0, 0x3ea

    .line 486
    .line 487
    invoke-virtual {p0, p1, v0}, Lkc1;->startActivityForResult(Landroid/content/Intent;I)V

    .line 488
    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_18
    :goto_a
    return v3

    .line 492
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

    .line 493
    .line 494
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    const v1, 0x7f0a0386

    .line 499
    .line 500
    .line 501
    if-ne v0, v1, :cond_19

    .line 502
    .line 503
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->o0:Lb8;

    .line 504
    .line 505
    invoke-virtual {p0, v2}, Lb8;->p(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    :goto_b
    move v3, v4

    .line 509
    goto :goto_c

    .line 510
    :cond_19
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 511
    .line 512
    .line 513
    move-result v0

    .line 514
    const v1, 0x7f0a0385

    .line 515
    .line 516
    .line 517
    if-ne v0, v1, :cond_1a

    .line 518
    .line 519
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->o0:Lb8;

    .line 520
    .line 521
    const-string p1, "ARTIST_ORDER_BY_MOST_RECENTLY_STARRED"

    .line 522
    .line 523
    invoke-virtual {p0, p1}, Lb8;->p(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_1a
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 528
    .line 529
    .line 530
    move-result p1

    .line 531
    const v0, 0x7f0a0384

    .line 532
    .line 533
    .line 534
    if-ne p1, v0, :cond_1b

    .line 535
    .line 536
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->o0:Lb8;

    .line 537
    .line 538
    const-string p1, "ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED"

    .line 539
    .line 540
    invoke-virtual {p0, p1}, Lb8;->p(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    goto :goto_b

    .line 544
    :cond_1b
    :goto_c
    return v3

    .line 545
    :pswitch_6
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 546
    .line 547
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 548
    .line 549
    .line 550
    move-result v0

    .line 551
    const v1, 0x7f0a0376

    .line 552
    .line 553
    .line 554
    if-ne v0, v1, :cond_1c

    .line 555
    .line 556
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Lej;

    .line 557
    .line 558
    invoke-virtual {p0, v2}, Lej;->q(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    :goto_d
    move v3, v4

    .line 562
    goto :goto_e

    .line 563
    :cond_1c
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 564
    .line 565
    .line 566
    move-result v0

    .line 567
    const v1, 0x7f0a0377

    .line 568
    .line 569
    .line 570
    if-ne v0, v1, :cond_1d

    .line 571
    .line 572
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Lej;

    .line 573
    .line 574
    const-string p1, "ARTIST_ORDER_BY_RANDOM"

    .line 575
    .line 576
    invoke-virtual {p0, p1}, Lej;->q(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_1d
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 581
    .line 582
    .line 583
    move-result p1

    .line 584
    const v0, 0x7f0a0375

    .line 585
    .line 586
    .line 587
    if-ne p1, v0, :cond_1e

    .line 588
    .line 589
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Lej;

    .line 590
    .line 591
    const-string p1, "ARTIST_ORDER_BY_ALBUM_COUNT"

    .line 592
    .line 593
    invoke-virtual {p0, p1}, Lej;->q(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_1e
    :goto_e
    return v3

    .line 598
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

    .line 599
    .line 600
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    const v2, 0x7f0a0383

    .line 605
    .line 606
    .line 607
    if-ne v0, v2, :cond_1f

    .line 608
    .line 609
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Lb8;

    .line 610
    .line 611
    invoke-virtual {p0, v1}, Lb8;->p(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    :goto_f
    move v3, v4

    .line 615
    goto :goto_10

    .line 616
    :cond_1f
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    const v1, 0x7f0a0382

    .line 621
    .line 622
    .line 623
    if-ne v0, v1, :cond_20

    .line 624
    .line 625
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Lb8;

    .line 626
    .line 627
    const-string p1, "ALBUM_ORDER_BY_MOST_RECENTLY_STARRED"

    .line 628
    .line 629
    invoke-virtual {p0, p1}, Lb8;->p(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    goto :goto_f

    .line 633
    :cond_20
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 634
    .line 635
    .line 636
    move-result p1

    .line 637
    const v0, 0x7f0a0381

    .line 638
    .line 639
    .line 640
    if-ne p1, v0, :cond_21

    .line 641
    .line 642
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Lb8;

    .line 643
    .line 644
    const-string p1, "ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED"

    .line 645
    .line 646
    invoke-virtual {p0, p1}, Lb8;->p(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    goto :goto_f

    .line 650
    :cond_21
    :goto_10
    return v3

    .line 651
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 652
    .line 653
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 654
    .line 655
    .line 656
    move-result v0

    .line 657
    const v2, 0x7f0a0370

    .line 658
    .line 659
    .line 660
    if-ne v0, v2, :cond_22

    .line 661
    .line 662
    goto :goto_11

    .line 663
    :cond_22
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 664
    .line 665
    .line 666
    move-result v0

    .line 667
    const v1, 0x7f0a036e

    .line 668
    .line 669
    .line 670
    if-ne v0, v1, :cond_23

    .line 671
    .line 672
    const-string v1, "ALBUM_ORDER_BY_ARTIST"

    .line 673
    .line 674
    goto :goto_11

    .line 675
    :cond_23
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    const v1, 0x7f0a0374

    .line 680
    .line 681
    .line 682
    if-ne v0, v1, :cond_24

    .line 683
    .line 684
    const-string v1, "ALBUM_ORDER_BY_YEAR"

    .line 685
    .line 686
    goto :goto_11

    .line 687
    :cond_24
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    const v1, 0x7f0a0371

    .line 692
    .line 693
    .line 694
    if-ne v0, v1, :cond_25

    .line 695
    .line 696
    const-string v1, "ALBUM_ORDER_BY_RANDOM"

    .line 697
    .line 698
    goto :goto_11

    .line 699
    :cond_25
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    const v1, 0x7f0a0372

    .line 704
    .line 705
    .line 706
    if-ne v0, v1, :cond_26

    .line 707
    .line 708
    const-string v1, "ALBUM_ORDER_BY_RECENTLY_ADDED"

    .line 709
    .line 710
    goto :goto_11

    .line 711
    :cond_26
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    const v1, 0x7f0a0373

    .line 716
    .line 717
    .line 718
    if-ne v0, v1, :cond_27

    .line 719
    .line 720
    const-string v1, "ALBUM_ORDER_BY_RECENTLY_PLAYED"

    .line 721
    .line 722
    goto :goto_11

    .line 723
    :cond_27
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 724
    .line 725
    .line 726
    move-result p1

    .line 727
    const v0, 0x7f0a036f

    .line 728
    .line 729
    .line 730
    if-ne p1, v0, :cond_28

    .line 731
    .line 732
    const-string v1, "ALBUM_ORDER_BY_MOST_PLAYED"

    .line 733
    .line 734
    goto :goto_11

    .line 735
    :cond_28
    const/4 v1, 0x0

    .line 736
    :goto_11
    if-eqz v1, :cond_29

    .line 737
    .line 738
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 739
    .line 740
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 741
    .line 742
    .line 743
    move-result-object p1

    .line 744
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 748
    .line 749
    .line 750
    move-result-object p1

    .line 751
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 752
    .line 753
    .line 754
    move-result-object p1

    .line 755
    const-string v0, "album_sort_order"

    .line 756
    .line 757
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 758
    .line 759
    .line 760
    move-result-object p1

    .line 761
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 762
    .line 763
    .line 764
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->h0(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->j0()V

    .line 768
    .line 769
    .line 770
    move v3, v4

    .line 771
    :cond_29
    return v3

    .line 772
    nop

    .line 773
    :pswitch_data_0
    .packed-switch 0x0
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
