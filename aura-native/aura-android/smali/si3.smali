.class public final synthetic Lsi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxi3;


# direct methods
.method public synthetic constructor <init>(Lxi3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsi3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsi3;->b:Lxi3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lsi3;->a:I

    .line 4
    .line 5
    iget-object v0, v0, Lsi3;->b:Lxi3;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Long;

    .line 13
    .line 14
    iget-object v1, v0, Lxi3;->p0:Laj3;

    .line 15
    .line 16
    iget-object v1, v1, Laj3;->n:Lk03;

    .line 17
    .line 18
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 23
    .line 24
    iget-object v0, v0, Lxi3;->o0:Lns3;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lae1;

    .line 31
    .line 32
    iget-object v0, v0, Lae1;->a:Landroid/widget/TextView;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v2, 0x0

    .line 42
    :goto_0
    invoke-static {v0, v2}, Lfu;->p(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void

    .line 46
    :pswitch_0
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, Lv52;

    .line 49
    .line 50
    iget-object v3, v0, Lxi3;->o0:Lns3;

    .line 51
    .line 52
    if-nez v3, :cond_2

    .line 53
    .line 54
    goto/16 :goto_d

    .line 55
    .line 56
    :cond_2
    iget-object v3, v3, Lns3;->q:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Lae1;

    .line 59
    .line 60
    iget-object v3, v3, Lae1;->k:Landroid/view/View;

    .line 61
    .line 62
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 63
    .line 64
    iget-boolean v4, v1, Lv52;->a:Z

    .line 65
    .line 66
    iget-object v5, v1, Lv52;->g:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v6, v1, Lv52;->d:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v7, v1, Lv52;->c:Ljava/lang/String;

    .line 71
    .line 72
    iget-boolean v8, v1, Lv52;->b:Z

    .line 73
    .line 74
    invoke-virtual {v3, v4}, Landroid/view/View;->setSelected(Z)V

    .line 75
    .line 76
    .line 77
    iget-object v3, v0, Lxi3;->o0:Lns3;

    .line 78
    .line 79
    iget-object v3, v3, Lns3;->q:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Lae1;

    .line 82
    .line 83
    iget-object v3, v3, Lae1;->k:Landroid/view/View;

    .line 84
    .line 85
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 86
    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    const v9, 0x7f1302b5

    .line 90
    .line 91
    .line 92
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v0, v9, v10}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    goto :goto_1

    .line 101
    :cond_3
    const v9, 0x7f1302d2

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v9}, Lkc1;->s(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    :goto_1
    invoke-virtual {v3, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    iget-object v3, v0, Lxi3;->o0:Lns3;

    .line 112
    .line 113
    iget-object v3, v3, Lns3;->q:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, Lae1;

    .line 116
    .line 117
    iget-object v3, v3, Lae1;->k:Landroid/view/View;

    .line 118
    .line 119
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-static {v3, v9}, Le35;->S(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 126
    .line 127
    .line 128
    iget-boolean v3, v0, Lxi3;->l0:Z

    .line 129
    .line 130
    iput-boolean v4, v0, Lxi3;->l0:Z

    .line 131
    .line 132
    const/4 v9, 0x1

    .line 133
    if-eqz v4, :cond_18

    .line 134
    .line 135
    if-nez v3, :cond_4

    .line 136
    .line 137
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 142
    .line 143
    iget-object v3, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 144
    .line 145
    iget-object v3, v3, Lzg5;->n:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v3, Lau;

    .line 148
    .line 149
    invoke-virtual {v3, v9}, Lau;->d(Z)V

    .line 150
    .line 151
    .line 152
    :cond_4
    invoke-static {}, Lu52;->d()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    new-instance v4, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v11, ":"

    .line 169
    .line 170
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    iget-object v11, v0, Lxi3;->n0:Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v11, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v11

    .line 200
    if-nez v11, :cond_e

    .line 201
    .line 202
    iput-object v4, v0, Lxi3;->n0:Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    const-string v11, "music"

    .line 213
    .line 214
    if-eqz v4, :cond_5

    .line 215
    .line 216
    const/4 v4, 0x0

    .line 217
    goto :goto_2

    .line 218
    :cond_5
    move-object v4, v11

    .line 219
    :goto_2
    iget-object v12, v0, Lxi3;->p0:Laj3;

    .line 220
    .line 221
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    invoke-virtual {v12, v13, v4, v14}, Laj3;->i(Lle1;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    iget-object v12, v0, Lxi3;->p0:Laj3;

    .line 233
    .line 234
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v14

    .line 246
    if-eqz v14, :cond_6

    .line 247
    .line 248
    const/4 v14, 0x0

    .line 249
    goto :goto_3

    .line 250
    :cond_6
    move-object v14, v4

    .line 251
    :goto_3
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v15

    .line 255
    iget-object v10, v12, Laj3;->o:Lk03;

    .line 256
    .line 257
    const-string v2, "podcast"

    .line 258
    .line 259
    if-eqz v14, :cond_9

    .line 260
    .line 261
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v16

    .line 265
    if-nez v16, :cond_8

    .line 266
    .line 267
    invoke-virtual {v14, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v14

    .line 271
    if-nez v14, :cond_7

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_7
    iget-object v12, v12, Laj3;->d:Lrv2;

    .line 275
    .line 276
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    invoke-static {v15}, Lrv2;->j(Ljava/lang/String;)Lk03;

    .line 280
    .line 281
    .line 282
    move-result-object v12

    .line 283
    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    new-instance v14, Lg7;

    .line 287
    .line 288
    invoke-direct {v14, v10, v9}, Lg7;-><init>(Lk03;I)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12, v13, v14}, Lad2;->e(Lba2;La83;)V

    .line 292
    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_8
    const/4 v12, 0x0

    .line 296
    invoke-virtual {v10, v12}, Lad2;->i(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    :cond_9
    :goto_4
    iget-object v10, v0, Lxi3;->p0:Laj3;

    .line 300
    .line 301
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 310
    .line 311
    .line 312
    move-result v13

    .line 313
    if-eqz v13, :cond_a

    .line 314
    .line 315
    const/4 v4, 0x0

    .line 316
    :cond_a
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    iget-object v13, v10, Laj3;->p:Lk03;

    .line 321
    .line 322
    if-eqz v4, :cond_c

    .line 323
    .line 324
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-nez v2, :cond_d

    .line 329
    .line 330
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-nez v2, :cond_b

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_b
    iget-object v2, v10, Laj3;->e:Lpa;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-static {v3}, Lpa;->v(Ljava/lang/String;)Lk03;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    new-instance v3, Lg7;

    .line 350
    .line 351
    const/4 v4, 0x2

    .line 352
    invoke-direct {v3, v13, v4}, Lg7;-><init>(Lk03;I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2, v12, v3}, Lad2;->e(Lba2;La83;)V

    .line 356
    .line 357
    .line 358
    :cond_c
    :goto_5
    const/4 v12, 0x0

    .line 359
    goto :goto_6

    .line 360
    :cond_d
    const/4 v12, 0x0

    .line 361
    invoke-virtual {v13, v12}, Lad2;->i(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :goto_6
    iget-object v2, v0, Lxi3;->p0:Laj3;

    .line 365
    .line 366
    iget-object v2, v2, Laj3;->m:Lk03;

    .line 367
    .line 368
    invoke-virtual {v2, v12}, Lad2;->i(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_e
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 372
    .line 373
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, Lae1;

    .line 376
    .line 377
    iget-object v2, v2, Lae1;->i:Landroid/view/View;

    .line 378
    .line 379
    check-cast v2, Landroid/widget/TextView;

    .line 380
    .line 381
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_f

    .line 386
    .line 387
    const v3, 0x7f1302c4

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    :cond_f
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 395
    .line 396
    .line 397
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 398
    .line 399
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v2, Lae1;

    .line 402
    .line 403
    iget-object v2, v2, Lae1;->i:Landroid/view/View;

    .line 404
    .line 405
    check-cast v2, Landroid/widget/TextView;

    .line 406
    .line 407
    const/4 v3, 0x0

    .line 408
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 409
    .line 410
    .line 411
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 412
    .line 413
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v2, Lae1;

    .line 416
    .line 417
    iget-object v2, v2, Lae1;->a:Landroid/widget/TextView;

    .line 418
    .line 419
    iget v3, v1, Lv52;->r:I

    .line 420
    .line 421
    if-eqz v3, :cond_10

    .line 422
    .line 423
    goto :goto_7

    .line 424
    :cond_10
    if-eqz v8, :cond_11

    .line 425
    .line 426
    const v3, 0x7f1302db

    .line 427
    .line 428
    .line 429
    goto :goto_7

    .line 430
    :cond_11
    const v3, 0x7f1302b0

    .line 431
    .line 432
    .line 433
    :goto_7
    invoke-virtual {v0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    filled-new-array {v7, v3}, [Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    const v4, 0x7f1302b7

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v4, v3}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 449
    .line 450
    .line 451
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 452
    .line 453
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v2, Lae1;

    .line 456
    .line 457
    iget-object v2, v2, Lae1;->a:Landroid/widget/TextView;

    .line 458
    .line 459
    const/4 v3, 0x0

    .line 460
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 461
    .line 462
    .line 463
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 464
    .line 465
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 466
    .line 467
    check-cast v2, Lae1;

    .line 468
    .line 469
    iget-object v2, v2, Lae1;->f:Landroid/view/View;

    .line 470
    .line 471
    check-cast v2, Landroid/widget/ToggleButton;

    .line 472
    .line 473
    iget-boolean v3, v1, Lv52;->k:Z

    .line 474
    .line 475
    invoke-virtual {v2, v3}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 476
    .line 477
    .line 478
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 479
    .line 480
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v2, Lae1;

    .line 483
    .line 484
    iget-object v2, v2, Lae1;->f:Landroid/view/View;

    .line 485
    .line 486
    check-cast v2, Landroid/widget/ToggleButton;

    .line 487
    .line 488
    if-eqz v8, :cond_12

    .line 489
    .line 490
    iget v3, v1, Lv52;->p:I

    .line 491
    .line 492
    if-lez v3, :cond_12

    .line 493
    .line 494
    move v3, v9

    .line 495
    goto :goto_8

    .line 496
    :cond_12
    const/4 v3, 0x0

    .line 497
    :goto_8
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 498
    .line 499
    .line 500
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 501
    .line 502
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v2, Lae1;

    .line 505
    .line 506
    iget-object v2, v2, Lae1;->j:Landroid/view/View;

    .line 507
    .line 508
    check-cast v2, Landroid/widget/ImageButton;

    .line 509
    .line 510
    const/4 v3, 0x0

    .line 511
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 512
    .line 513
    .line 514
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 515
    .line 516
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v2, Lae1;

    .line 519
    .line 520
    iget-object v2, v2, Lae1;->j:Landroid/view/View;

    .line 521
    .line 522
    check-cast v2, Landroid/widget/ImageButton;

    .line 523
    .line 524
    if-eqz v8, :cond_13

    .line 525
    .line 526
    iget-boolean v3, v1, Lv52;->v:Z

    .line 527
    .line 528
    if-eqz v3, :cond_13

    .line 529
    .line 530
    goto :goto_9

    .line 531
    :cond_13
    const/4 v9, 0x0

    .line 532
    :goto_9
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 533
    .line 534
    .line 535
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 536
    .line 537
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v2, Lae1;

    .line 540
    .line 541
    iget-object v2, v2, Lae1;->j:Landroid/view/View;

    .line 542
    .line 543
    check-cast v2, Landroid/widget/ImageButton;

    .line 544
    .line 545
    if-eqz v8, :cond_14

    .line 546
    .line 547
    const/high16 v3, 0x3f800000    # 1.0f

    .line 548
    .line 549
    goto :goto_a

    .line 550
    :cond_14
    const v3, 0x3e99999a    # 0.3f

    .line 551
    .line 552
    .line 553
    :goto_a
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 554
    .line 555
    .line 556
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 557
    .line 558
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v2, Lae1;

    .line 561
    .line 562
    iget-object v2, v2, Lae1;->l:Landroid/view/View;

    .line 563
    .line 564
    check-cast v2, Landroid/widget/ImageButton;

    .line 565
    .line 566
    const/16 v3, 0x8

    .line 567
    .line 568
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 569
    .line 570
    .line 571
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 572
    .line 573
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v2, Lae1;

    .line 576
    .line 577
    iget-object v2, v2, Lae1;->g:Landroid/view/View;

    .line 578
    .line 579
    check-cast v2, Landroid/widget/ImageButton;

    .line 580
    .line 581
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 582
    .line 583
    .line 584
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 585
    .line 586
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v2, Lae1;

    .line 589
    .line 590
    iget-object v2, v2, Lae1;->e:Landroid/view/View;

    .line 591
    .line 592
    check-cast v2, Landroid/widget/ImageButton;

    .line 593
    .line 594
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 595
    .line 596
    .line 597
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 598
    .line 599
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v2, Lae1;

    .line 602
    .line 603
    iget-object v2, v2, Lae1;->m:Landroid/view/View;

    .line 604
    .line 605
    check-cast v2, Landroid/widget/SeekBar;

    .line 606
    .line 607
    iget-wide v3, v1, Lv52;->i:J

    .line 608
    .line 609
    const-wide/16 v6, 0x3e8

    .line 610
    .line 611
    div-long/2addr v3, v6

    .line 612
    long-to-int v3, v3

    .line 613
    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 614
    .line 615
    .line 616
    iget-object v2, v0, Lxi3;->o0:Lns3;

    .line 617
    .line 618
    iget-object v2, v2, Lns3;->q:Ljava/lang/Object;

    .line 619
    .line 620
    check-cast v2, Lae1;

    .line 621
    .line 622
    iget-object v2, v2, Lae1;->m:Landroid/view/View;

    .line 623
    .line 624
    check-cast v2, Landroid/widget/SeekBar;

    .line 625
    .line 626
    iget-wide v3, v1, Lv52;->h:J

    .line 627
    .line 628
    div-long/2addr v3, v6

    .line 629
    long-to-int v1, v3

    .line 630
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 631
    .line 632
    .line 633
    iget-object v1, v0, Lxi3;->m0:Ljava/lang/String;

    .line 634
    .line 635
    invoke-static {v1, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    if-nez v1, :cond_19

    .line 640
    .line 641
    iput-object v5, v0, Lxi3;->m0:Ljava/lang/String;

    .line 642
    .line 643
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    iget-object v2, v0, Lxi3;->m0:Ljava/lang/String;

    .line 648
    .line 649
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    if-eqz v2, :cond_15

    .line 654
    .line 655
    const/4 v12, 0x0

    .line 656
    goto :goto_b

    .line 657
    :cond_15
    iget-object v12, v0, Lxi3;->m0:Ljava/lang/String;

    .line 658
    .line 659
    :goto_b
    invoke-static {v1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 660
    .line 661
    .line 662
    move-result-object v2

    .line 663
    if-eqz v12, :cond_16

    .line 664
    .line 665
    invoke-static {}, Lud3;->t()I

    .line 666
    .line 667
    .line 668
    move-result v3

    .line 669
    invoke-static {v3, v12}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    goto :goto_c

    .line 674
    :cond_16
    const/4 v3, 0x0

    .line 675
    :goto_c
    const/16 v4, 0x9

    .line 676
    .line 677
    invoke-static {v1, v12, v4, v2, v3}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    invoke-virtual {v1, v2}, Lvz3;->T(Lxv0;)Lvz3;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-static {}, Lud3;->R()Z

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    if-eqz v2, :cond_17

    .line 694
    .line 695
    invoke-virtual {v1}, Llq;->l()Llq;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    check-cast v1, Lvz3;

    .line 700
    .line 701
    :cond_17
    iget-object v0, v0, Lxi3;->o0:Lns3;

    .line 702
    .line 703
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, Lae1;

    .line 706
    .line 707
    iget-object v0, v0, Lae1;->h:Landroid/view/View;

    .line 708
    .line 709
    check-cast v0, Landroid/widget/ImageView;

    .line 710
    .line 711
    invoke-virtual {v1, v0}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 712
    .line 713
    .line 714
    goto :goto_d

    .line 715
    :cond_18
    if-eqz v3, :cond_19

    .line 716
    .line 717
    const/4 v12, 0x0

    .line 718
    iput-object v12, v0, Lxi3;->m0:Ljava/lang/String;

    .line 719
    .line 720
    iput-object v12, v0, Lxi3;->n0:Ljava/lang/String;

    .line 721
    .line 722
    iget-object v1, v0, Lxi3;->o0:Lns3;

    .line 723
    .line 724
    iget-object v1, v1, Lns3;->q:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v1, Lae1;

    .line 727
    .line 728
    iget-object v1, v1, Lae1;->f:Landroid/view/View;

    .line 729
    .line 730
    check-cast v1, Landroid/widget/ToggleButton;

    .line 731
    .line 732
    invoke-virtual {v1, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 733
    .line 734
    .line 735
    iget-object v1, v0, Lxi3;->q0:Lbl2;

    .line 736
    .line 737
    if-eqz v1, :cond_19

    .line 738
    .line 739
    invoke-virtual {v1}, Lu0;->isDone()Z

    .line 740
    .line 741
    .line 742
    move-result v1

    .line 743
    if-eqz v1, :cond_19

    .line 744
    .line 745
    :try_start_0
    iget-object v1, v0, Lxi3;->q0:Lbl2;

    .line 746
    .line 747
    invoke-virtual {v1}, Lu0;->get()Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    check-cast v1, Lbj2;

    .line 752
    .line 753
    invoke-virtual {v0, v1}, Lxi3;->k0(Lbj2;)V

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1}, Lsk2;->K0()Ldo2;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    invoke-virtual {v0, v2}, Lxi3;->l0(Ldo2;)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1}, Lsk2;->h0()Z

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    invoke-virtual {v0, v2}, Lxi3;->m0(Z)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v1}, Lsk2;->x()J

    .line 771
    .line 772
    .line 773
    move-result-wide v2

    .line 774
    invoke-virtual {v0, v2, v3}, Lxi3;->h0(J)V

    .line 775
    .line 776
    .line 777
    invoke-virtual {v1}, Lsk2;->f0()Z

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    invoke-virtual {v0, v2}, Lxi3;->i0(Z)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v0, v1}, Lxi3;->n0(Lbj2;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v1}, Lsk2;->Q0()I

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    if-nez v1, :cond_19

    .line 792
    .line 793
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 798
    .line 799
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 800
    .line 801
    iget-object v0, v0, Lzg5;->n:Ljava/lang/Object;

    .line 802
    .line 803
    check-cast v0, Lau;

    .line 804
    .line 805
    const/4 v3, 0x0

    .line 806
    invoke-virtual {v0, v3}, Lau;->d(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 807
    .line 808
    .line 809
    :catch_0
    :cond_19
    :goto_d
    return-void

    .line 810
    nop

    .line 811
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
