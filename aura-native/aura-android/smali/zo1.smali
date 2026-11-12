.class public final synthetic Lzo1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcp1;


# direct methods
.method public synthetic constructor <init>(Lcp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzo1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lzo1;->o:Lcp1;

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
    iget v0, p0, Lzo1;->n:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lzo1;->o:Lcp1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lkc1;->T:Landroid/view/View;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcp1;->l0:Ltc1;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lud3;->V()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 27
    .line 28
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/viewmodel/b;->g(Lba2;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    invoke-virtual {p0}, Lcp1;->j0()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    invoke-virtual {p0}, Lcp1;->j0()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_2
    invoke-virtual {p0}, Lcp1;->j0()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    iget-object v0, p0, Lcp1;->G0:Lzd0;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lcp1;->l0:Ltc1;

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {}, Lud3;->A()Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/Iterable;

    .line 66
    .line 67
    new-instance v4, Ljb2;

    .line 68
    .line 69
    invoke-direct {v4, v2}, Ljb2;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0, v4}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 81
    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    iget-object p0, v4, Ltc1;->m:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iget-object v1, v4, Ltc1;->m:Landroid/widget/LinearLayout;

    .line 91
    .line 92
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Lcp1;->G0:Lzd0;

    .line 96
    .line 97
    iput-object v0, p0, Lzd0;->r:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {p0}, Ldw3;->d()V

    .line 100
    .line 101
    .line 102
    :cond_3
    :goto_0
    return-void

    .line 103
    :pswitch_4
    iget-object v0, p0, Lkc1;->T:Landroid/view/View;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    iget-object v0, p0, Lcp1;->l0:Ltc1;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    iget-object p0, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 112
    .line 113
    if-eqz p0, :cond_4

    .line 114
    .line 115
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/b;->A:Lk03;

    .line 116
    .line 117
    invoke-static {}, Lud3;->s()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {p0, v0}, Lad2;->k(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_4
    return-void

    .line 125
    :pswitch_5
    iget-object p0, p0, Lcp1;->l0:Ltc1;

    .line 126
    .line 127
    if-eqz p0, :cond_5

    .line 128
    .line 129
    iget-object p0, p0, Ltc1;->w:Landroid/widget/Button;

    .line 130
    .line 131
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    :cond_5
    return-void

    .line 135
    :pswitch_6
    iput-boolean v3, p0, Lcp1;->I0:Z

    .line 136
    .line 137
    iget-object v0, p0, Lcp1;->l0:Ltc1;

    .line 138
    .line 139
    if-eqz v0, :cond_1f

    .line 140
    .line 141
    iget-object v0, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 142
    .line 143
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->D:Ljava/util/List;

    .line 144
    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    goto/16 :goto_6

    .line 148
    .line 149
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 150
    .line 151
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 152
    .line 153
    .line 154
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 155
    .line 156
    iget-object v4, v4, Ltc1;->H:Lcom/google/android/material/card/MaterialCardView;

    .line 157
    .line 158
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_7

    .line 163
    .line 164
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 165
    .line 166
    iget-object v4, v4, Ltc1;->H:Lcom/google/android/material/card/MaterialCardView;

    .line 167
    .line 168
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    :cond_7
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 172
    .line 173
    iget-object v4, v4, Ltc1;->z:Lcom/google/android/material/card/MaterialCardView;

    .line 174
    .line 175
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-nez v4, :cond_8

    .line 180
    .line 181
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 182
    .line 183
    iget-object v4, v4, Ltc1;->z:Lcom/google/android/material/card/MaterialCardView;

    .line 184
    .line 185
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :cond_8
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 189
    .line 190
    iget-object v4, v4, Ltc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 191
    .line 192
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-nez v4, :cond_9

    .line 197
    .line 198
    iget-object v4, p0, Lcp1;->l0:Ltc1;

    .line 199
    .line 200
    iget-object v4, v4, Ltc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 201
    .line 202
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_9
    iget-object v4, p0, Lcp1;->H0:Landroid/view/View;

    .line 206
    .line 207
    if-eqz v4, :cond_a

    .line 208
    .line 209
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_a
    iget-object v4, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 213
    .line 214
    iget-object v4, v4, Lcom/eddyizm/tempus/viewmodel/b;->D:Ljava/util/List;

    .line 215
    .line 216
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    if-eqz v5, :cond_1c

    .line 225
    .line 226
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    check-cast v5, Lcom/eddyizm/tempus/model/HomeSector;

    .line 231
    .line 232
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/HomeSector;->isVisible()Z

    .line 233
    .line 234
    .line 235
    move-result v6

    .line 236
    if-nez v6, :cond_b

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_b
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/HomeSector;->getId()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    const/4 v7, -0x1

    .line 251
    sparse-switch v6, :sswitch_data_0

    .line 252
    .line 253
    .line 254
    goto/16 :goto_2

    .line 255
    .line 256
    :sswitch_0
    const-string v6, "HOME_SECTOR_MADE_FOR_YOU"

    .line 257
    .line 258
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-nez v5, :cond_c

    .line 263
    .line 264
    goto/16 :goto_2

    .line 265
    .line 266
    :cond_c
    const/16 v7, 0xf

    .line 267
    .line 268
    goto/16 :goto_2

    .line 269
    .line 270
    :sswitch_1
    const-string v6, "HOME_SECTOR_RADIO_STATION"

    .line 271
    .line 272
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    if-nez v5, :cond_d

    .line 277
    .line 278
    goto/16 :goto_2

    .line 279
    .line 280
    :cond_d
    const/16 v7, 0xe

    .line 281
    .line 282
    goto/16 :goto_2

    .line 283
    .line 284
    :sswitch_2
    const-string v6, "HOME_SECTOR_LAST_PLAYED"

    .line 285
    .line 286
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-nez v5, :cond_e

    .line 291
    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :cond_e
    const/16 v7, 0xd

    .line 295
    .line 296
    goto/16 :goto_2

    .line 297
    .line 298
    :sswitch_3
    const-string v6, "HOME_SECTOR_STARRED_ALBUMS"

    .line 299
    .line 300
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    if-nez v5, :cond_f

    .line 305
    .line 306
    goto/16 :goto_2

    .line 307
    .line 308
    :cond_f
    const/16 v7, 0xc

    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :sswitch_4
    const-string v6, "HOME_SECTOR_MOST_PLAYED"

    .line 313
    .line 314
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v5

    .line 318
    if-nez v5, :cond_10

    .line 319
    .line 320
    goto/16 :goto_2

    .line 321
    .line 322
    :cond_10
    const/16 v7, 0xb

    .line 323
    .line 324
    goto/16 :goto_2

    .line 325
    .line 326
    :sswitch_5
    const-string v6, "HOME_SECTOR_PINNED_PLAYLISTS"

    .line 327
    .line 328
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-nez v5, :cond_11

    .line 333
    .line 334
    goto/16 :goto_2

    .line 335
    .line 336
    :cond_11
    const/16 v7, 0xa

    .line 337
    .line 338
    goto/16 :goto_2

    .line 339
    .line 340
    :sswitch_6
    const-string v6, "HOME_SECTOR_TOP_SONGS"

    .line 341
    .line 342
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    if-nez v5, :cond_12

    .line 347
    .line 348
    goto/16 :goto_2

    .line 349
    .line 350
    :cond_12
    const/16 v7, 0x9

    .line 351
    .line 352
    goto/16 :goto_2

    .line 353
    .line 354
    :sswitch_7
    const-string v6, "HOME_SECTOR_RECENTLY_ADDED"

    .line 355
    .line 356
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v5

    .line 360
    if-nez v5, :cond_13

    .line 361
    .line 362
    goto/16 :goto_2

    .line 363
    .line 364
    :cond_13
    move v7, v1

    .line 365
    goto/16 :goto_2

    .line 366
    .line 367
    :sswitch_8
    const-string v6, "HOME_SECTOR_STARRED_ARTISTS"

    .line 368
    .line 369
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-nez v5, :cond_14

    .line 374
    .line 375
    goto :goto_2

    .line 376
    :cond_14
    const/4 v7, 0x7

    .line 377
    goto :goto_2

    .line 378
    :sswitch_9
    const-string v6, "HOME_SECTOR_DISCOVERY"

    .line 379
    .line 380
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    if-nez v5, :cond_15

    .line 385
    .line 386
    goto :goto_2

    .line 387
    :cond_15
    const/4 v7, 0x6

    .line 388
    goto :goto_2

    .line 389
    :sswitch_a
    const-string v6, "HOME_SECTOR_BEST_OF"

    .line 390
    .line 391
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v5

    .line 395
    if-nez v5, :cond_16

    .line 396
    .line 397
    goto :goto_2

    .line 398
    :cond_16
    const/4 v7, 0x5

    .line 399
    goto :goto_2

    .line 400
    :sswitch_b
    const-string v6, "HOME_SECTOR_SHARED"

    .line 401
    .line 402
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-nez v5, :cond_17

    .line 407
    .line 408
    goto :goto_2

    .line 409
    :cond_17
    const/4 v7, 0x4

    .line 410
    goto :goto_2

    .line 411
    :sswitch_c
    const-string v6, "HOME_SECTOR_FLASHBACK"

    .line 412
    .line 413
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v5

    .line 417
    if-nez v5, :cond_18

    .line 418
    .line 419
    goto :goto_2

    .line 420
    :cond_18
    const/4 v7, 0x3

    .line 421
    goto :goto_2

    .line 422
    :sswitch_d
    const-string v6, "HOME_SECTOR_CONTINUE_LISTENING"

    .line 423
    .line 424
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    if-nez v5, :cond_19

    .line 429
    .line 430
    goto :goto_2

    .line 431
    :cond_19
    const/4 v7, 0x2

    .line 432
    goto :goto_2

    .line 433
    :sswitch_e
    const-string v6, "HOME_SECTOR_NEW_RELEASES"

    .line 434
    .line 435
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    if-nez v5, :cond_1a

    .line 440
    .line 441
    goto :goto_2

    .line 442
    :cond_1a
    move v7, v2

    .line 443
    goto :goto_2

    .line 444
    :sswitch_f
    const-string v6, "HOME_SECTOR_STARRED_TRACKS"

    .line 445
    .line 446
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    if-nez v5, :cond_1b

    .line 451
    .line 452
    goto :goto_2

    .line 453
    :cond_1b
    move v7, v3

    .line 454
    :goto_2
    packed-switch v7, :pswitch_data_1

    .line 455
    .line 456
    .line 457
    goto/16 :goto_1

    .line 458
    .line 459
    :pswitch_7
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 460
    .line 461
    iget-object v5, v5, Ltc1;->x:Landroid/widget/LinearLayout;

    .line 462
    .line 463
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    goto/16 :goto_1

    .line 467
    .line 468
    :pswitch_8
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 469
    .line 470
    iget-object v5, v5, Ltc1;->t:Landroid/widget/LinearLayout;

    .line 471
    .line 472
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    goto/16 :goto_1

    .line 476
    .line 477
    :pswitch_9
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 478
    .line 479
    iget-object v5, v5, Ltc1;->v:Landroid/widget/LinearLayout;

    .line 480
    .line 481
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    goto/16 :goto_1

    .line 485
    .line 486
    :pswitch_a
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 487
    .line 488
    iget-object v5, v5, Ltc1;->f0:Landroid/widget/LinearLayout;

    .line 489
    .line 490
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    goto/16 :goto_1

    .line 494
    .line 495
    :pswitch_b
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 496
    .line 497
    iget-object v5, v5, Ltc1;->r:Landroid/widget/LinearLayout;

    .line 498
    .line 499
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    goto/16 :goto_1

    .line 503
    .line 504
    :pswitch_c
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 505
    .line 506
    iget-object v5, v5, Ltc1;->P:Landroid/widget/LinearLayout;

    .line 507
    .line 508
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    goto/16 :goto_1

    .line 512
    .line 513
    :pswitch_d
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 514
    .line 515
    iget-object v5, v5, Ltc1;->p:Landroid/widget/LinearLayout;

    .line 516
    .line 517
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    goto/16 :goto_1

    .line 521
    .line 522
    :pswitch_e
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 523
    .line 524
    iget-object v5, v5, Ltc1;->u:Landroid/widget/LinearLayout;

    .line 525
    .line 526
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    goto/16 :goto_1

    .line 530
    .line 531
    :pswitch_f
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 532
    .line 533
    iget-object v5, v5, Ltc1;->j0:Landroid/widget/LinearLayout;

    .line 534
    .line 535
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    goto/16 :goto_1

    .line 539
    .line 540
    :pswitch_10
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 541
    .line 542
    iget-object v5, v5, Ltc1;->n:Landroid/widget/LinearLayout;

    .line 543
    .line 544
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    goto/16 :goto_1

    .line 548
    .line 549
    :pswitch_11
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 550
    .line 551
    iget-object v5, v5, Ltc1;->l:Landroid/widget/LinearLayout;

    .line 552
    .line 553
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    goto/16 :goto_1

    .line 557
    .line 558
    :pswitch_12
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 559
    .line 560
    iget-object v5, v5, Ltc1;->a0:Landroid/widget/LinearLayout;

    .line 561
    .line 562
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    goto/16 :goto_1

    .line 566
    .line 567
    :pswitch_13
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 568
    .line 569
    iget-object v5, v5, Ltc1;->o:Landroid/widget/LinearLayout;

    .line 570
    .line 571
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    goto/16 :goto_1

    .line 575
    .line 576
    :pswitch_14
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 577
    .line 578
    iget-object v5, v5, Ltc1;->m:Landroid/widget/LinearLayout;

    .line 579
    .line 580
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    goto/16 :goto_1

    .line 584
    .line 585
    :pswitch_15
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 586
    .line 587
    iget-object v5, v5, Ltc1;->s:Landroid/widget/LinearLayout;

    .line 588
    .line 589
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    goto/16 :goto_1

    .line 593
    .line 594
    :pswitch_16
    iget-object v5, p0, Lcp1;->l0:Ltc1;

    .line 595
    .line 596
    iget-object v5, v5, Ltc1;->n0:Landroid/widget/LinearLayout;

    .line 597
    .line 598
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    goto/16 :goto_1

    .line 602
    .line 603
    :cond_1c
    iget-object v1, p0, Lcp1;->l0:Ltc1;

    .line 604
    .line 605
    iget-object v1, v1, Ltc1;->w:Landroid/widget/Button;

    .line 606
    .line 607
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    iget-object p0, p0, Lcp1;->l0:Ltc1;

    .line 611
    .line 612
    iget-object p0, p0, Ltc1;->q:Landroid/widget/LinearLayout;

    .line 613
    .line 614
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-ne v1, v2, :cond_1e

    .line 623
    .line 624
    move v1, v3

    .line 625
    :goto_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    if-ge v1, v2, :cond_1f

    .line 630
    .line 631
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    if-eq v2, v4, :cond_1d

    .line 640
    .line 641
    goto :goto_4

    .line 642
    :cond_1d
    add-int/lit8 v1, v1, 0x1

    .line 643
    .line 644
    goto :goto_3

    .line 645
    :cond_1e
    :goto_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 649
    .line 650
    .line 651
    move-result v1

    .line 652
    :goto_5
    if-ge v3, v1, :cond_1f

    .line 653
    .line 654
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v2

    .line 658
    add-int/lit8 v3, v3, 0x1

    .line 659
    .line 660
    check-cast v2, Landroid/view/View;

    .line 661
    .line 662
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 663
    .line 664
    .line 665
    goto :goto_5

    .line 666
    :cond_1f
    :goto_6
    return-void

    .line 667
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

    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    :sswitch_data_0
    .sparse-switch
        -0x7cd12d7f -> :sswitch_f
        -0x779559fc -> :sswitch_e
        -0x6aaa7ae4 -> :sswitch_d
        -0x5ee5c582 -> :sswitch_c
        -0x2e84e002 -> :sswitch_b
        -0x2980a667 -> :sswitch_a
        -0x21c3bca9 -> :sswitch_9
        -0x95c50ed -> :sswitch_8
        0x19c1bda2 -> :sswitch_7
        0x2314901b -> :sswitch_6
        0x31c97173 -> :sswitch_5
        0x60714716 -> :sswitch_4
        0x626ee9dd -> :sswitch_3
        0x6f8864a3 -> :sswitch_2
        0x70dcb6f7 -> :sswitch_1
        0x7df88318 -> :sswitch_0
    .end sparse-switch

    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
