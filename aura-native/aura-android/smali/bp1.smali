.class public final Lbp1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lcp1;


# direct methods
.method public synthetic constructor <init>(Lcp1;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbp1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbp1;->c:Lcp1;

    .line 4
    .line 5
    iput-object p2, p0, Lbp1;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lbp1;->a:I

    .line 4
    .line 5
    const-string v2, "\n"

    .line 6
    .line 7
    const-string v3, "..."

    .line 8
    .line 9
    const-string v4, ", "

    .line 10
    .line 11
    iget-object v5, v0, Lbp1;->c:Lcp1;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    iget-object v8, v0, Lbp1;->b:Ljava/util/List;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    if-eqz v1, :cond_d

    .line 24
    .line 25
    new-instance v11, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v12

    .line 34
    if-nez v12, :cond_3

    .line 35
    .line 36
    invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    invoke-static {v12}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    move v13, v6

    .line 49
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v14

    .line 53
    if-eqz v14, :cond_7

    .line 54
    .line 55
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v14

    .line 59
    check-cast v14, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 60
    .line 61
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    move/from16 v16, v6

    .line 66
    .line 67
    :cond_1
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v17

    .line 71
    if-eqz v17, :cond_2

    .line 72
    .line 73
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v17

    .line 77
    check-cast v17, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 78
    .line 79
    invoke-virtual/range {v17 .. v17}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v18

    .line 83
    if-eqz v18, :cond_1

    .line 84
    .line 85
    invoke-virtual/range {v17 .. v17}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    invoke-virtual {v7, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-eqz v7, :cond_1

    .line 98
    .line 99
    invoke-virtual/range {v17 .. v17}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v7}, Leu0;->d(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-nez v7, :cond_1

    .line 111
    .line 112
    add-int/lit8 v13, v13, 0x1

    .line 113
    .line 114
    const/16 v16, 0x1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    if-eqz v16, :cond_0

    .line 118
    .line 119
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    move v13, v6

    .line 132
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-eqz v8, :cond_7

    .line 137
    .line 138
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    move v12, v6

    .line 149
    :cond_5
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-eqz v14, :cond_6

    .line 154
    .line 155
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    check-cast v14, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 160
    .line 161
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v15

    .line 165
    if-eqz v15, :cond_5

    .line 166
    .line 167
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-eqz v9, :cond_5

    .line 180
    .line 181
    invoke-static {v14}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    if-nez v9, :cond_5

    .line 186
    .line 187
    add-int/lit8 v13, v13, 0x1

    .line 188
    .line 189
    const/4 v12, 0x1

    .line 190
    goto :goto_3

    .line 191
    :cond_6
    if-eqz v12, :cond_4

    .line 192
    .line 193
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_7
    iget-object v1, v5, Lcp1;->l0:Ltc1;

    .line 202
    .line 203
    if-lez v13, :cond_c

    .line 204
    .line 205
    iget-object v1, v1, Ltc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 206
    .line 207
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 208
    .line 209
    .line 210
    new-instance v1, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    new-instance v7, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 218
    .line 219
    .line 220
    :goto_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    const/4 v9, 0x3

    .line 225
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    if-ge v6, v8, :cond_8

    .line 230
    .line 231
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    check-cast v8, Ljava/lang/String;

    .line 236
    .line 237
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    add-int/lit8 v6, v6, 0x1

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_8
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    if-nez v6, :cond_a

    .line 248
    .line 249
    new-instance v6, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    if-eqz v8, :cond_9

    .line 263
    .line 264
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    check-cast v8, Ljava/lang/CharSequence;

    .line 269
    .line 270
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v8

    .line 277
    if-eqz v8, :cond_9

    .line 278
    .line 279
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_9
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    const/4 v9, 0x3

    .line 295
    if-le v4, v9, :cond_a

    .line 296
    .line 297
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    :cond_a
    invoke-virtual {v5}, Lkc1;->r()Landroid/content/res/Resources;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v6

    .line 312
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v6

    .line 316
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    const v7, 0x7f120004

    .line 321
    .line 322
    .line 323
    invoke-virtual {v3, v7, v4, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    iget-object v6, v5, Lcp1;->l0:Ltc1;

    .line 332
    .line 333
    if-lez v4, :cond_b

    .line 334
    .line 335
    iget-object v4, v6, Ltc1;->F:Landroid/widget/TextView;

    .line 336
    .line 337
    new-instance v6, Ljava/lang/StringBuilder;

    .line 338
    .line 339
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    goto :goto_6

    .line 363
    :cond_b
    iget-object v1, v6, Ltc1;->F:Landroid/widget/TextView;

    .line 364
    .line 365
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 366
    .line 367
    .line 368
    :goto_6
    invoke-virtual {v5}, Lkc1;->l()Lnc1;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    if-eqz v1, :cond_d

    .line 373
    .line 374
    invoke-virtual {v5}, Lkc1;->l()Lnc1;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    new-instance v2, Lqa1;

    .line 379
    .line 380
    const/16 v3, 0xa

    .line 381
    .line 382
    invoke-direct {v2, v3, v0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 386
    .line 387
    .line 388
    goto :goto_7

    .line 389
    :cond_c
    iget-object v0, v1, Ltc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 390
    .line 391
    const/16 v1, 0x8

    .line 392
    .line 393
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 394
    .line 395
    .line 396
    :cond_d
    :goto_7
    return-void

    .line 397
    :pswitch_0
    move-object/from16 v1, p1

    .line 398
    .line 399
    check-cast v1, Ljava/util/List;

    .line 400
    .line 401
    if-eqz v1, :cond_1b

    .line 402
    .line 403
    new-instance v7, Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v9

    .line 412
    if-nez v9, :cond_11

    .line 413
    .line 414
    invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    invoke-static {v9}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 419
    .line 420
    .line 421
    move-result-object v9

    .line 422
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    move v10, v6

    .line 427
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    if-eqz v11, :cond_15

    .line 432
    .line 433
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v11

    .line 437
    check-cast v11, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 438
    .line 439
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 440
    .line 441
    .line 442
    move-result-object v12

    .line 443
    move v13, v6

    .line 444
    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 445
    .line 446
    .line 447
    move-result v14

    .line 448
    if-eqz v14, :cond_f

    .line 449
    .line 450
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v14

    .line 454
    check-cast v14, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 455
    .line 456
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v15

    .line 460
    if-eqz v15, :cond_e

    .line 461
    .line 462
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v15

    .line 466
    invoke-virtual {v11}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v6

    .line 474
    if-eqz v6, :cond_e

    .line 475
    .line 476
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v6

    .line 480
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-static {v6}, Leu0;->d(Ljava/lang/String;)Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-nez v6, :cond_e

    .line 488
    .line 489
    add-int/lit8 v10, v10, 0x1

    .line 490
    .line 491
    const/4 v13, 0x1

    .line 492
    :cond_e
    const/4 v6, 0x0

    .line 493
    goto :goto_9

    .line 494
    :cond_f
    if-eqz v13, :cond_10

    .line 495
    .line 496
    invoke-virtual {v11}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v6

    .line 500
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    :cond_10
    const/4 v6, 0x0

    .line 504
    goto :goto_8

    .line 505
    :cond_11
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    const/4 v10, 0x0

    .line 510
    :cond_12
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v8

    .line 514
    if-eqz v8, :cond_15

    .line 515
    .line 516
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v8

    .line 520
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 521
    .line 522
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 523
    .line 524
    .line 525
    move-result-object v9

    .line 526
    const/4 v11, 0x0

    .line 527
    :cond_13
    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v12

    .line 531
    if-eqz v12, :cond_14

    .line 532
    .line 533
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v12

    .line 537
    check-cast v12, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 538
    .line 539
    invoke-virtual {v12}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v13

    .line 543
    if-eqz v13, :cond_13

    .line 544
    .line 545
    invoke-virtual {v12}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v13

    .line 549
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v14

    .line 553
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v13

    .line 557
    if-eqz v13, :cond_13

    .line 558
    .line 559
    invoke-static {v12}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 560
    .line 561
    .line 562
    move-result-object v12

    .line 563
    if-nez v12, :cond_13

    .line 564
    .line 565
    add-int/lit8 v10, v10, 0x1

    .line 566
    .line 567
    const/4 v11, 0x1

    .line 568
    goto :goto_b

    .line 569
    :cond_14
    if-eqz v11, :cond_12

    .line 570
    .line 571
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v8

    .line 575
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    goto :goto_a

    .line 579
    :cond_15
    iget-object v1, v5, Lcp1;->l0:Ltc1;

    .line 580
    .line 581
    if-lez v10, :cond_1a

    .line 582
    .line 583
    iget-object v1, v1, Ltc1;->z:Lcom/google/android/material/card/MaterialCardView;

    .line 584
    .line 585
    const/4 v6, 0x0

    .line 586
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 587
    .line 588
    .line 589
    new-instance v1, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    new-instance v8, Ljava/util/ArrayList;

    .line 595
    .line 596
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 597
    .line 598
    .line 599
    :goto_c
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 600
    .line 601
    .line 602
    move-result v9

    .line 603
    const/4 v10, 0x3

    .line 604
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    .line 605
    .line 606
    .line 607
    move-result v9

    .line 608
    if-ge v6, v9, :cond_16

    .line 609
    .line 610
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v9

    .line 614
    check-cast v9, Ljava/lang/String;

    .line 615
    .line 616
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    add-int/lit8 v6, v6, 0x1

    .line 620
    .line 621
    goto :goto_c

    .line 622
    :cond_16
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 623
    .line 624
    .line 625
    move-result v6

    .line 626
    if-nez v6, :cond_18

    .line 627
    .line 628
    new-instance v6, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v9

    .line 641
    if-eqz v9, :cond_17

    .line 642
    .line 643
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v9

    .line 647
    check-cast v9, Ljava/lang/CharSequence;

    .line 648
    .line 649
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result v9

    .line 656
    if-eqz v9, :cond_17

    .line 657
    .line 658
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    goto :goto_d

    .line 662
    :cond_17
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 670
    .line 671
    .line 672
    move-result v4

    .line 673
    const/4 v9, 0x3

    .line 674
    if-le v4, v9, :cond_18

    .line 675
    .line 676
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    :cond_18
    invoke-virtual {v5}, Lkc1;->r()Landroid/content/res/Resources;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 688
    .line 689
    .line 690
    move-result v6

    .line 691
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v6

    .line 699
    const v7, 0x7f120003

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3, v7, v4, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    iget-object v6, v5, Lcp1;->l0:Ltc1;

    .line 711
    .line 712
    if-lez v4, :cond_19

    .line 713
    .line 714
    iget-object v4, v6, Ltc1;->B:Landroid/widget/TextView;

    .line 715
    .line 716
    new-instance v6, Ljava/lang/StringBuilder;

    .line 717
    .line 718
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 739
    .line 740
    .line 741
    goto :goto_e

    .line 742
    :cond_19
    iget-object v1, v6, Ltc1;->B:Landroid/widget/TextView;

    .line 743
    .line 744
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 745
    .line 746
    .line 747
    :goto_e
    invoke-virtual {v5}, Lkc1;->l()Lnc1;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    if-eqz v1, :cond_1b

    .line 752
    .line 753
    invoke-virtual {v5}, Lkc1;->l()Lnc1;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    new-instance v2, Lqa1;

    .line 758
    .line 759
    const/16 v3, 0x8

    .line 760
    .line 761
    invoke-direct {v2, v3, v0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 765
    .line 766
    .line 767
    goto :goto_f

    .line 768
    :cond_1a
    const/16 v3, 0x8

    .line 769
    .line 770
    iget-object v0, v1, Ltc1;->z:Lcom/google/android/material/card/MaterialCardView;

    .line 771
    .line 772
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 773
    .line 774
    .line 775
    :cond_1b
    :goto_f
    return-void

    .line 776
    nop

    .line 777
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
