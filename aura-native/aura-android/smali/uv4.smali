.class public final Luv4;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Lvp0;

.field public final C0:Ldo2;

.field public D0:Lik;

.field public E0:Lik;

.field public F0:Lik;

.field public G0:Lik;

.field public H0:Lik;


# direct methods
.method public constructor <init>(Ldo2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Luv4;->C0:Ldo2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    invoke-super {p0}, Lpp0;->J()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Luv4;->B0:Lvp0;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super {v0}, Lpp0;->R()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Luv4;->G0:Lik;

    .line 8
    .line 9
    iput-object v1, v0, Luv4;->H0:Lik;

    .line 10
    .line 11
    iget-object v2, v0, Luv4;->C0:Ldo2;

    .line 12
    .line 13
    iget-object v3, v2, Ldo2;->I:Landroid/os/Bundle;

    .line 14
    .line 15
    iget-object v4, v2, Ldo2;->I:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v5, v2, Ldo2;->b:Ljava/lang/CharSequence;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const-string v6, "type"

    .line 22
    .line 23
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v6, v1

    .line 29
    :goto_0
    const-string v7, "radio"

    .line 30
    .line 31
    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    const-string v7, "radioTitle"

    .line 36
    .line 37
    const-string v8, "radioArtist"

    .line 38
    .line 39
    const-string v9, "stationName"

    .line 40
    .line 41
    const-string v10, ""

    .line 42
    .line 43
    if-eqz v6, :cond_9

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v2, v10

    .line 55
    :goto_1
    invoke-virtual {v3, v9, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move-object v2, v10

    .line 68
    :goto_2
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v3, v8, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move-object v5, v10

    .line 76
    :goto_3
    if-eqz v3, :cond_5

    .line 77
    .line 78
    invoke-virtual {v3, v7, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    goto :goto_4

    .line 83
    :cond_5
    move-object v11, v10

    .line 84
    :goto_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v12

    .line 88
    if-nez v12, :cond_6

    .line 89
    .line 90
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-nez v12, :cond_6

    .line 95
    .line 96
    const-string v12, " - "

    .line 97
    .line 98
    invoke-static {v5, v12, v11}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    goto :goto_5

    .line 103
    :cond_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-nez v12, :cond_7

    .line 108
    .line 109
    move-object v5, v11

    .line 110
    goto :goto_5

    .line 111
    :cond_7
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-nez v11, :cond_8

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_8
    move-object v5, v2

    .line 119
    :goto_5
    iget-object v11, v0, Luv4;->B0:Lvp0;

    .line 120
    .line 121
    iget-object v11, v11, Lvp0;->v:Landroid/widget/TextView;

    .line 122
    .line 123
    invoke-virtual {v11, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    iget-object v5, v0, Luv4;->B0:Lvp0;

    .line 127
    .line 128
    iget-object v5, v5, Lvp0;->u:Landroid/widget/TextView;

    .line 129
    .line 130
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_9
    iget-object v11, v0, Luv4;->B0:Lvp0;

    .line 135
    .line 136
    iget-object v11, v11, Lvp0;->v:Landroid/widget/TextView;

    .line 137
    .line 138
    iget-object v2, v2, Ldo2;->a:Ljava/lang/CharSequence;

    .line 139
    .line 140
    invoke-virtual {v11, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, v0, Luv4;->B0:Lvp0;

    .line 144
    .line 145
    iget-object v2, v2, Lvp0;->u:Landroid/widget/TextView;

    .line 146
    .line 147
    if-eqz v5, :cond_a

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_a
    move-object v5, v10

    .line 151
    :goto_6
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    :goto_7
    const-string v2, "id"

    .line 155
    .line 156
    if-eqz v3, :cond_21

    .line 157
    .line 158
    const-string v5, "song"

    .line 159
    .line 160
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    invoke-static {v5, v11}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    iput-object v5, v0, Luv4;->D0:Lik;

    .line 169
    .line 170
    const-string v5, "albumId"

    .line 171
    .line 172
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    const-string v11, "album"

    .line 177
    .line 178
    invoke-static {v11, v5}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iput-object v5, v0, Luv4;->E0:Lik;

    .line 183
    .line 184
    const-string v5, "artistId"

    .line 185
    .line 186
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const-string v12, "artist"

    .line 191
    .line 192
    invoke-static {v12, v5}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    iput-object v5, v0, Luv4;->F0:Lik;

    .line 197
    .line 198
    const-string v5, "assetLinkGenre"

    .line 199
    .line 200
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_b

    .line 209
    .line 210
    move-object v5, v1

    .line 211
    goto :goto_8

    .line 212
    :cond_b
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-static {v5}, Ll93;->S(Landroid/net/Uri;)Lik;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    :goto_8
    iput-object v5, v0, Luv4;->G0:Lik;

    .line 221
    .line 222
    const-string v5, "assetLinkYear"

    .line 223
    .line 224
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    if-eqz v13, :cond_c

    .line 233
    .line 234
    move-object v5, v1

    .line 235
    goto :goto_9

    .line 236
    :cond_c
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-static {v5}, Ll93;->S(Landroid/net/Uri;)Lik;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    :goto_9
    iput-object v5, v0, Luv4;->H0:Lik;

    .line 245
    .line 246
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    const-string v13, "coverArtId"

    .line 251
    .line 252
    invoke-virtual {v3, v13, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    invoke-static {v5}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    if-eqz v13, :cond_d

    .line 261
    .line 262
    invoke-static {}, Lud3;->t()I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-static {v1, v13}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    :cond_d
    const/16 v15, 0x9

    .line 271
    .line 272
    invoke-static {v5, v13, v15, v14, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v1, v5}, Lvz3;->T(Lxv0;)Lvz3;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {}, Lud3;->R()Z

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    if-eqz v5, :cond_e

    .line 289
    .line 290
    invoke-virtual {v1}, Llq;->l()Llq;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, Lvz3;

    .line 295
    .line 296
    :cond_e
    iget-object v5, v0, Luv4;->B0:Lvp0;

    .line 297
    .line 298
    iget-object v5, v5, Lvp0;->s:Landroid/widget/ImageView;

    .line 299
    .line 300
    invoke-virtual {v1, v5}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 301
    .line 302
    .line 303
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 304
    .line 305
    iget-object v1, v1, Lvp0;->s:Landroid/widget/ImageView;

    .line 306
    .line 307
    iget-object v5, v0, Luv4;->E0:Lik;

    .line 308
    .line 309
    if-eqz v5, :cond_f

    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_f
    iget-object v5, v0, Luv4;->D0:Lik;

    .line 313
    .line 314
    :goto_a
    invoke-virtual {v0, v1, v5}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 315
    .line 316
    .line 317
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 318
    .line 319
    iget-object v1, v1, Lvp0;->v:Landroid/widget/TextView;

    .line 320
    .line 321
    iget-object v5, v0, Luv4;->D0:Lik;

    .line 322
    .line 323
    invoke-virtual {v0, v1, v5}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 324
    .line 325
    .line 326
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 327
    .line 328
    iget-object v1, v1, Lvp0;->u:Landroid/widget/TextView;

    .line 329
    .line 330
    iget-object v5, v0, Luv4;->F0:Lik;

    .line 331
    .line 332
    if-eqz v5, :cond_10

    .line 333
    .line 334
    goto :goto_b

    .line 335
    :cond_10
    iget-object v5, v0, Luv4;->D0:Lik;

    .line 336
    .line 337
    :goto_b
    invoke-virtual {v0, v1, v5}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 338
    .line 339
    .line 340
    const-string v1, "title"

    .line 341
    .line 342
    const v5, 0x7f1302aa

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v5}, Lkc1;->s(I)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v13

    .line 349
    invoke-virtual {v3, v1, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v0, v5}, Lkc1;->s(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    invoke-virtual {v3, v11, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-virtual {v0, v5}, Lkc1;->s(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    invoke-virtual {v3, v12, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    invoke-virtual {v0, v5}, Lkc1;->s(I)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v13

    .line 373
    const-string v14, "genre"

    .line 374
    .line 375
    invoke-virtual {v3, v14, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v13

    .line 379
    const-string v15, "year"

    .line 380
    .line 381
    const/4 v5, 0x0

    .line 382
    invoke-virtual {v3, v15, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 383
    .line 384
    .line 385
    move-result v16

    .line 386
    if-eqz v6, :cond_12

    .line 387
    .line 388
    const v6, 0x7f1302aa

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v3, v9, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    invoke-virtual {v3, v8, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-virtual {v3, v7, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v7

    .line 407
    iget-object v8, v0, Luv4;->B0:Lvp0;

    .line 408
    .line 409
    iget-object v8, v8, Lvp0;->o:Landroid/widget/LinearLayout;

    .line 410
    .line 411
    const/4 v9, 0x0

    .line 412
    invoke-virtual {v8, v9}, Landroid/view/View;->setVisibility(I)V

    .line 413
    .line 414
    .line 415
    iget-object v8, v0, Luv4;->B0:Lvp0;

    .line 416
    .line 417
    iget-object v8, v8, Lvp0;->p:Landroid/widget/TextView;

    .line 418
    .line 419
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 420
    .line 421
    .line 422
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-nez v5, :cond_11

    .line 427
    .line 428
    move-object v1, v7

    .line 429
    :cond_11
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    if-nez v5, :cond_13

    .line 434
    .line 435
    move-object v12, v6

    .line 436
    goto :goto_c

    .line 437
    :cond_12
    iget-object v5, v0, Luv4;->B0:Lvp0;

    .line 438
    .line 439
    iget-object v5, v5, Lvp0;->o:Landroid/widget/LinearLayout;

    .line 440
    .line 441
    const/16 v6, 0x8

    .line 442
    .line 443
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 444
    .line 445
    .line 446
    :cond_13
    :goto_c
    iget-object v5, v0, Luv4;->G0:Lik;

    .line 447
    .line 448
    if-nez v5, :cond_14

    .line 449
    .line 450
    if-eqz v13, :cond_14

    .line 451
    .line 452
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    if-nez v5, :cond_14

    .line 457
    .line 458
    const v6, 0x7f1302aa

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-virtual {v5, v13}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 466
    .line 467
    .line 468
    move-result v5

    .line 469
    if-nez v5, :cond_14

    .line 470
    .line 471
    invoke-static {v14, v13}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    iput-object v5, v0, Luv4;->G0:Lik;

    .line 476
    .line 477
    :cond_14
    iget-object v5, v0, Luv4;->H0:Lik;

    .line 478
    .line 479
    if-nez v5, :cond_15

    .line 480
    .line 481
    if-eqz v16, :cond_15

    .line 482
    .line 483
    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    invoke-static {v15, v5}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    iput-object v5, v0, Luv4;->H0:Lik;

    .line 492
    .line 493
    :cond_15
    iget-object v5, v0, Luv4;->B0:Lvp0;

    .line 494
    .line 495
    iget-object v5, v5, Lvp0;->r:Landroid/widget/TextView;

    .line 496
    .line 497
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 498
    .line 499
    .line 500
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 501
    .line 502
    iget-object v1, v1, Lvp0;->b:Landroid/widget/TextView;

    .line 503
    .line 504
    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 505
    .line 506
    .line 507
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 508
    .line 509
    iget-object v1, v1, Lvp0;->c:Landroid/widget/TextView;

    .line 510
    .line 511
    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 512
    .line 513
    .line 514
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 515
    .line 516
    iget-object v1, v1, Lvp0;->t:Landroid/widget/TextView;

    .line 517
    .line 518
    const-string v5, "track"

    .line 519
    .line 520
    const/4 v9, 0x0

    .line 521
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    if-eqz v6, :cond_16

    .line 526
    .line 527
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    const v6, 0x7f1302aa

    .line 536
    .line 537
    .line 538
    goto :goto_d

    .line 539
    :cond_16
    const v6, 0x7f1302aa

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v5

    .line 546
    :goto_d
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 550
    .line 551
    iget-object v1, v1, Lvp0;->z:Landroid/widget/TextView;

    .line 552
    .line 553
    if-eqz v16, :cond_17

    .line 554
    .line 555
    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    goto :goto_e

    .line 560
    :cond_17
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v5

    .line 564
    :goto_e
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 565
    .line 566
    .line 567
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 568
    .line 569
    iget-object v1, v1, Lvp0;->i:Landroid/widget/TextView;

    .line 570
    .line 571
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 572
    .line 573
    .line 574
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 575
    .line 576
    iget-object v1, v1, Lvp0;->l:Landroid/widget/TextView;

    .line 577
    .line 578
    const-string v5, "size"

    .line 579
    .line 580
    const-wide/16 v6, 0x0

    .line 581
    .line 582
    invoke-virtual {v3, v5, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 583
    .line 584
    .line 585
    move-result-wide v8

    .line 586
    cmp-long v8, v8, v6

    .line 587
    .line 588
    if-eqz v8, :cond_1b

    .line 589
    .line 590
    invoke-virtual {v3, v5, v6, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 591
    .line 592
    .line 593
    move-result-wide v5

    .line 594
    sget-object v7, Le03;->a:Ljava/util/regex/Pattern;

    .line 595
    .line 596
    const-wide/high16 v7, -0x8000000000000000L

    .line 597
    .line 598
    cmp-long v7, v5, v7

    .line 599
    .line 600
    if-nez v7, :cond_18

    .line 601
    .line 602
    const-wide v7, 0x7fffffffffffffffL

    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    goto :goto_f

    .line 608
    :cond_18
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(J)J

    .line 609
    .line 610
    .line 611
    move-result-wide v7

    .line 612
    :goto_f
    const-wide/16 v11, 0x400

    .line 613
    .line 614
    cmp-long v9, v7, v11

    .line 615
    .line 616
    if-gez v9, :cond_19

    .line 617
    .line 618
    new-instance v7, Ljava/lang/StringBuilder;

    .line 619
    .line 620
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    const-string v5, " B"

    .line 627
    .line 628
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    goto :goto_11

    .line 636
    :cond_19
    new-instance v9, Ljava/text/StringCharacterIterator;

    .line 637
    .line 638
    const-string v11, "KMGTPE"

    .line 639
    .line 640
    invoke-direct {v9, v11}, Ljava/text/StringCharacterIterator;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    const/16 v11, 0x28

    .line 644
    .line 645
    move-wide v12, v7

    .line 646
    :goto_10
    if-ltz v11, :cond_1a

    .line 647
    .line 648
    const-wide v14, 0xfffccccccccccccL

    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    shr-long/2addr v14, v11

    .line 654
    cmp-long v14, v7, v14

    .line 655
    .line 656
    if-lez v14, :cond_1a

    .line 657
    .line 658
    const/16 v14, 0xa

    .line 659
    .line 660
    shr-long/2addr v12, v14

    .line 661
    invoke-virtual {v9}, Ljava/text/StringCharacterIterator;->next()C

    .line 662
    .line 663
    .line 664
    add-int/lit8 v11, v11, -0xa

    .line 665
    .line 666
    goto :goto_10

    .line 667
    :cond_1a
    invoke-static {v5, v6}, Ljava/lang/Long;->signum(J)I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    int-to-long v5, v5

    .line 672
    mul-long/2addr v12, v5

    .line 673
    long-to-double v5, v12

    .line 674
    const-wide/high16 v7, 0x4090000000000000L    # 1024.0

    .line 675
    .line 676
    div-double/2addr v5, v7

    .line 677
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 678
    .line 679
    .line 680
    move-result-object v5

    .line 681
    invoke-virtual {v9}, Ljava/text/StringCharacterIterator;->current()C

    .line 682
    .line 683
    .line 684
    move-result v6

    .line 685
    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 686
    .line 687
    .line 688
    move-result-object v6

    .line 689
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v5

    .line 693
    const-string v6, "%.1f %ciB"

    .line 694
    .line 695
    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    :goto_11
    const v6, 0x7f1302aa

    .line 700
    .line 701
    .line 702
    goto :goto_12

    .line 703
    :cond_1b
    const v6, 0x7f1302aa

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    move-result-object v5

    .line 710
    :goto_12
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 711
    .line 712
    .line 713
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 714
    .line 715
    iget-object v1, v1, Lvp0;->f:Landroid/widget/TextView;

    .line 716
    .line 717
    const-string v5, "contentType"

    .line 718
    .line 719
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    invoke-virtual {v3, v5, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v5

    .line 727
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 728
    .line 729
    .line 730
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 731
    .line 732
    iget-object v1, v1, Lvp0;->q:Landroid/widget/TextView;

    .line 733
    .line 734
    const-string v5, "suffix"

    .line 735
    .line 736
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v7

    .line 740
    invoke-virtual {v3, v5, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 745
    .line 746
    .line 747
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 748
    .line 749
    iget-object v1, v1, Lvp0;->x:Landroid/widget/TextView;

    .line 750
    .line 751
    const-string v5, "transcodedContentType"

    .line 752
    .line 753
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v7

    .line 757
    invoke-virtual {v3, v5, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 762
    .line 763
    .line 764
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 765
    .line 766
    iget-object v1, v1, Lvp0;->y:Landroid/widget/TextView;

    .line 767
    .line 768
    const-string v5, "transcodedSuffix"

    .line 769
    .line 770
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v7

    .line 774
    invoke-virtual {v3, v5, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 779
    .line 780
    .line 781
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 782
    .line 783
    iget-object v1, v1, Lvp0;->h:Landroid/widget/TextView;

    .line 784
    .line 785
    const-string v5, "duration"

    .line 786
    .line 787
    const/4 v9, 0x0

    .line 788
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 789
    .line 790
    .line 791
    move-result v6

    .line 792
    if-eqz v6, :cond_1c

    .line 793
    .line 794
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    invoke-static {v5}, Le03;->g(Ljava/lang/Integer;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    goto :goto_13

    .line 807
    :cond_1c
    const v6, 0x7f1302aa

    .line 808
    .line 809
    .line 810
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v5

    .line 814
    :goto_13
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 815
    .line 816
    .line 817
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 818
    .line 819
    iget-object v1, v1, Lvp0;->e:Landroid/widget/TextView;

    .line 820
    .line 821
    const-string v5, "bitrate"

    .line 822
    .line 823
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 824
    .line 825
    .line 826
    move-result v6

    .line 827
    if-eqz v6, :cond_1d

    .line 828
    .line 829
    new-instance v6, Ljava/lang/StringBuilder;

    .line 830
    .line 831
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 835
    .line 836
    .line 837
    move-result v5

    .line 838
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 839
    .line 840
    .line 841
    const-string v5, " kbps"

    .line 842
    .line 843
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v5

    .line 850
    goto :goto_14

    .line 851
    :cond_1d
    const v6, 0x7f1302aa

    .line 852
    .line 853
    .line 854
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v5

    .line 858
    :goto_14
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 859
    .line 860
    .line 861
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 862
    .line 863
    iget-object v1, v1, Lvp0;->k:Landroid/widget/TextView;

    .line 864
    .line 865
    const-string v5, "samplingRate"

    .line 866
    .line 867
    const/4 v9, 0x0

    .line 868
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 869
    .line 870
    .line 871
    move-result v6

    .line 872
    if-eqz v6, :cond_1e

    .line 873
    .line 874
    new-instance v6, Ljava/lang/StringBuilder;

    .line 875
    .line 876
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 880
    .line 881
    .line 882
    move-result v5

    .line 883
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    const-string v5, " Hz"

    .line 887
    .line 888
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v5

    .line 895
    goto :goto_15

    .line 896
    :cond_1e
    const v6, 0x7f1302aa

    .line 897
    .line 898
    .line 899
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v5

    .line 903
    :goto_15
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 904
    .line 905
    .line 906
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 907
    .line 908
    iget-object v1, v1, Lvp0;->d:Landroid/widget/TextView;

    .line 909
    .line 910
    const-string v5, "bitDepth"

    .line 911
    .line 912
    const/4 v9, 0x0

    .line 913
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 914
    .line 915
    .line 916
    move-result v6

    .line 917
    if-eqz v6, :cond_1f

    .line 918
    .line 919
    new-instance v6, Ljava/lang/StringBuilder;

    .line 920
    .line 921
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 925
    .line 926
    .line 927
    move-result v5

    .line 928
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    const-string v5, " bits"

    .line 932
    .line 933
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v5

    .line 940
    const v6, 0x7f1302aa

    .line 941
    .line 942
    .line 943
    goto :goto_16

    .line 944
    :cond_1f
    const v6, 0x7f1302aa

    .line 945
    .line 946
    .line 947
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v5

    .line 951
    :goto_16
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 952
    .line 953
    .line 954
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 955
    .line 956
    iget-object v1, v1, Lvp0;->j:Landroid/widget/TextView;

    .line 957
    .line 958
    const-string v5, "path"

    .line 959
    .line 960
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v7

    .line 964
    invoke-virtual {v3, v5, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v5

    .line 968
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 969
    .line 970
    .line 971
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 972
    .line 973
    iget-object v1, v1, Lvp0;->g:Landroid/widget/TextView;

    .line 974
    .line 975
    const-string v5, "discNumber"

    .line 976
    .line 977
    const/4 v9, 0x0

    .line 978
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 979
    .line 980
    .line 981
    move-result v7

    .line 982
    if-eqz v7, :cond_20

    .line 983
    .line 984
    invoke-virtual {v3, v5, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 985
    .line 986
    .line 987
    move-result v3

    .line 988
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v3

    .line 992
    goto :goto_17

    .line 993
    :cond_20
    invoke-virtual {v0, v6}, Lkc1;->s(I)Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v3

    .line 997
    :goto_17
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 998
    .line 999
    .line 1000
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 1001
    .line 1002
    iget-object v1, v1, Lvp0;->r:Landroid/widget/TextView;

    .line 1003
    .line 1004
    iget-object v3, v0, Luv4;->D0:Lik;

    .line 1005
    .line 1006
    invoke-virtual {v0, v1, v3}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 1007
    .line 1008
    .line 1009
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 1010
    .line 1011
    iget-object v1, v1, Lvp0;->b:Landroid/widget/TextView;

    .line 1012
    .line 1013
    iget-object v3, v0, Luv4;->E0:Lik;

    .line 1014
    .line 1015
    invoke-virtual {v0, v1, v3}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 1016
    .line 1017
    .line 1018
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 1019
    .line 1020
    iget-object v1, v1, Lvp0;->c:Landroid/widget/TextView;

    .line 1021
    .line 1022
    iget-object v3, v0, Luv4;->F0:Lik;

    .line 1023
    .line 1024
    invoke-virtual {v0, v1, v3}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 1025
    .line 1026
    .line 1027
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 1028
    .line 1029
    iget-object v1, v1, Lvp0;->i:Landroid/widget/TextView;

    .line 1030
    .line 1031
    iget-object v3, v0, Luv4;->G0:Lik;

    .line 1032
    .line 1033
    invoke-virtual {v0, v1, v3}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 1034
    .line 1035
    .line 1036
    iget-object v1, v0, Luv4;->B0:Lvp0;

    .line 1037
    .line 1038
    iget-object v1, v1, Lvp0;->z:Landroid/widget/TextView;

    .line 1039
    .line 1040
    iget-object v3, v0, Luv4;->H0:Lik;

    .line 1041
    .line 1042
    invoke-virtual {v0, v1, v3}, Luv4;->n0(Landroid/view/View;Lik;)V

    .line 1043
    .line 1044
    .line 1045
    :cond_21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1046
    .line 1047
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1048
    .line 1049
    .line 1050
    invoke-static {}, Lud3;->U()Z

    .line 1051
    .line 1052
    .line 1053
    move-result v3

    .line 1054
    invoke-static {}, Le03;->d()I

    .line 1055
    .line 1056
    .line 1057
    move-result v5

    .line 1058
    invoke-static {v5}, Le03;->q(I)Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v5

    .line 1062
    invoke-static {}, Le03;->d()I

    .line 1063
    .line 1064
    .line 1065
    move-result v6

    .line 1066
    invoke-static {v6}, Le03;->q(I)Ljava/lang/String;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v7

    .line 1070
    invoke-static {v6, v7}, Le03;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v6

    .line 1074
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1075
    .line 1076
    .line 1077
    move-result v6

    .line 1078
    const-string v7, "Original"

    .line 1079
    .line 1080
    if-eqz v6, :cond_22

    .line 1081
    .line 1082
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1085
    .line 1086
    .line 1087
    invoke-static {}, Le03;->d()I

    .line 1088
    .line 1089
    .line 1090
    move-result v8

    .line 1091
    invoke-static {v8}, Le03;->q(I)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v9

    .line 1095
    invoke-static {v8, v9}, Le03;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v8

    .line 1099
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1100
    .line 1101
    .line 1102
    move-result v8

    .line 1103
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1104
    .line 1105
    .line 1106
    const-string v8, "kbps"

    .line 1107
    .line 1108
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v6

    .line 1115
    goto :goto_18

    .line 1116
    :cond_22
    move-object v6, v7

    .line 1117
    :goto_18
    if-eqz v4, :cond_23

    .line 1118
    .line 1119
    const-string v8, "uri"

    .line 1120
    .line 1121
    invoke-virtual {v4, v8, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v8

    .line 1125
    const-string v9, "rest/download"

    .line 1126
    .line 1127
    invoke-virtual {v8, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v8

    .line 1131
    if-eqz v8, :cond_23

    .line 1132
    .line 1133
    const v3, 0x7f130579

    .line 1134
    .line 1135
    .line 1136
    invoke-virtual {v0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v3

    .line 1140
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1141
    .line 1142
    .line 1143
    iget-object v3, v0, Luv4;->B0:Lvp0;

    .line 1144
    .line 1145
    iget-object v3, v3, Lvp0;->w:Landroid/widget/TextView;

    .line 1146
    .line 1147
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1148
    .line 1149
    .line 1150
    goto/16 :goto_19

    .line 1151
    .line 1152
    :cond_23
    if-eqz v3, :cond_24

    .line 1153
    .line 1154
    const v3, 0x7f13057c

    .line 1155
    .line 1156
    .line 1157
    invoke-virtual {v0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v3

    .line 1161
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    .line 1164
    iget-object v3, v0, Luv4;->B0:Lvp0;

    .line 1165
    .line 1166
    iget-object v3, v3, Lvp0;->w:Landroid/widget/TextView;

    .line 1167
    .line 1168
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1169
    .line 1170
    .line 1171
    goto/16 :goto_19

    .line 1172
    .line 1173
    :cond_24
    const-string v8, "raw"

    .line 1174
    .line 1175
    if-nez v3, :cond_25

    .line 1176
    .line 1177
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v9

    .line 1181
    if-eqz v9, :cond_25

    .line 1182
    .line 1183
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v9

    .line 1187
    if-eqz v9, :cond_25

    .line 1188
    .line 1189
    const v3, 0x7f13057b

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {v0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v3

    .line 1196
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1197
    .line 1198
    .line 1199
    iget-object v3, v0, Luv4;->B0:Lvp0;

    .line 1200
    .line 1201
    iget-object v3, v3, Lvp0;->w:Landroid/widget/TextView;

    .line 1202
    .line 1203
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1204
    .line 1205
    .line 1206
    goto :goto_19

    .line 1207
    :cond_25
    if-nez v3, :cond_26

    .line 1208
    .line 1209
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1210
    .line 1211
    .line 1212
    move-result v9

    .line 1213
    if-nez v9, :cond_26

    .line 1214
    .line 1215
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v9

    .line 1219
    if-eqz v9, :cond_26

    .line 1220
    .line 1221
    const v3, 0x7f13057e

    .line 1222
    .line 1223
    .line 1224
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v5

    .line 1228
    invoke-virtual {v0, v3, v5}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v3

    .line 1232
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1233
    .line 1234
    .line 1235
    iget-object v3, v0, Luv4;->B0:Lvp0;

    .line 1236
    .line 1237
    iget-object v3, v3, Lvp0;->w:Landroid/widget/TextView;

    .line 1238
    .line 1239
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1240
    .line 1241
    .line 1242
    goto :goto_19

    .line 1243
    :cond_26
    if-nez v3, :cond_27

    .line 1244
    .line 1245
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1246
    .line 1247
    .line 1248
    move-result v9

    .line 1249
    if-eqz v9, :cond_27

    .line 1250
    .line 1251
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v9

    .line 1255
    if-nez v9, :cond_27

    .line 1256
    .line 1257
    const v3, 0x7f13057d

    .line 1258
    .line 1259
    .line 1260
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v5

    .line 1264
    invoke-virtual {v0, v3, v5}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v3

    .line 1268
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1269
    .line 1270
    .line 1271
    iget-object v3, v0, Luv4;->B0:Lvp0;

    .line 1272
    .line 1273
    iget-object v3, v3, Lvp0;->w:Landroid/widget/TextView;

    .line 1274
    .line 1275
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_19

    .line 1279
    :cond_27
    if-nez v3, :cond_28

    .line 1280
    .line 1281
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    if-nez v3, :cond_28

    .line 1286
    .line 1287
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    move-result v3

    .line 1291
    if-nez v3, :cond_28

    .line 1292
    .line 1293
    const v3, 0x7f13057a

    .line 1294
    .line 1295
    .line 1296
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v5

    .line 1300
    invoke-virtual {v0, v3, v5}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1305
    .line 1306
    .line 1307
    iget-object v3, v0, Luv4;->B0:Lvp0;

    .line 1308
    .line 1309
    iget-object v3, v3, Lvp0;->w:Landroid/widget/TextView;

    .line 1310
    .line 1311
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1312
    .line 1313
    .line 1314
    :cond_28
    :goto_19
    if-nez v4, :cond_29

    .line 1315
    .line 1316
    goto :goto_1a

    .line 1317
    :cond_29
    invoke-virtual {v4, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v1

    .line 1321
    new-instance v2, Ld7;

    .line 1322
    .line 1323
    const/4 v3, 0x6

    .line 1324
    invoke-direct {v2, v3, v0}, Ld7;-><init>(ILjava/lang/Object;)V

    .line 1325
    .line 1326
    .line 1327
    sget-object v0, Ljt1;->a:Ljava/util/Map;

    .line 1328
    .line 1329
    if-eqz v1, :cond_2b

    .line 1330
    .line 1331
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1332
    .line 1333
    .line 1334
    move-result v0

    .line 1335
    if-nez v0, :cond_2a

    .line 1336
    .line 1337
    goto :goto_1a

    .line 1338
    :cond_2a
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 1339
    .line 1340
    new-instance v3, Lit1;

    .line 1341
    .line 1342
    invoke-direct {v3, v1, v2}, Lit1;-><init>(Ljava/lang/String;Ld7;)V

    .line 1343
    .line 1344
    .line 1345
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1346
    .line 1347
    .line 1348
    :cond_2b
    :goto_1a
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f0d0053

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f0a00ae

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Landroid/widget/LinearLayout;

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const v2, 0x7f0a00af

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Landroid/widget/TextView;

    .line 35
    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    const v2, 0x7f0a00c0

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    move-object v8, v5

    .line 46
    check-cast v8, Landroid/widget/TextView;

    .line 47
    .line 48
    if-eqz v8, :cond_0

    .line 49
    .line 50
    const v2, 0x7f0a00e9

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    check-cast v5, Landroid/widget/LinearLayout;

    .line 58
    .line 59
    if-eqz v5, :cond_0

    .line 60
    .line 61
    const v2, 0x7f0a00eb

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Landroid/widget/TextView;

    .line 69
    .line 70
    if-eqz v5, :cond_0

    .line 71
    .line 72
    const v2, 0x7f0a00fa

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v9, v5

    .line 80
    check-cast v9, Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v9, :cond_0

    .line 83
    .line 84
    const v2, 0x7f0a0113

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Landroid/widget/LinearLayout;

    .line 92
    .line 93
    if-eqz v5, :cond_0

    .line 94
    .line 95
    const v2, 0x7f0a0114

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Landroid/widget/TextView;

    .line 103
    .line 104
    if-eqz v5, :cond_0

    .line 105
    .line 106
    const v2, 0x7f0a0115

    .line 107
    .line 108
    .line 109
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    move-object v10, v5

    .line 114
    check-cast v10, Landroid/widget/TextView;

    .line 115
    .line 116
    if-eqz v10, :cond_0

    .line 117
    .line 118
    const v2, 0x7f0a0116

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Landroid/widget/LinearLayout;

    .line 126
    .line 127
    if-eqz v5, :cond_0

    .line 128
    .line 129
    const v2, 0x7f0a0117

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    check-cast v5, Landroid/widget/TextView;

    .line 137
    .line 138
    if-eqz v5, :cond_0

    .line 139
    .line 140
    const v2, 0x7f0a0118

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    move-object v11, v5

    .line 148
    check-cast v11, Landroid/widget/TextView;

    .line 149
    .line 150
    if-eqz v11, :cond_0

    .line 151
    .line 152
    const v2, 0x7f0a016a

    .line 153
    .line 154
    .line 155
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, Landroid/widget/LinearLayout;

    .line 160
    .line 161
    if-eqz v5, :cond_0

    .line 162
    .line 163
    const v2, 0x7f0a016b

    .line 164
    .line 165
    .line 166
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    check-cast v5, Landroid/widget/TextView;

    .line 171
    .line 172
    if-eqz v5, :cond_0

    .line 173
    .line 174
    const v2, 0x7f0a016c

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    move-object v12, v5

    .line 182
    check-cast v12, Landroid/widget/TextView;

    .line 183
    .line 184
    if-eqz v12, :cond_0

    .line 185
    .line 186
    const v2, 0x7f0a01b6

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    check-cast v5, Landroid/widget/LinearLayout;

    .line 194
    .line 195
    if-eqz v5, :cond_0

    .line 196
    .line 197
    const v2, 0x7f0a01b7

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    check-cast v5, Landroid/widget/TextView;

    .line 205
    .line 206
    if-eqz v5, :cond_0

    .line 207
    .line 208
    const v2, 0x7f0a01b8

    .line 209
    .line 210
    .line 211
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    move-object v13, v5

    .line 216
    check-cast v13, Landroid/widget/TextView;

    .line 217
    .line 218
    if-eqz v13, :cond_0

    .line 219
    .line 220
    const v2, 0x7f0a01dc

    .line 221
    .line 222
    .line 223
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    check-cast v5, Landroid/widget/LinearLayout;

    .line 228
    .line 229
    if-eqz v5, :cond_0

    .line 230
    .line 231
    const v2, 0x7f0a01dd

    .line 232
    .line 233
    .line 234
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    check-cast v5, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz v5, :cond_0

    .line 241
    .line 242
    const v2, 0x7f0a01de

    .line 243
    .line 244
    .line 245
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    move-object v14, v5

    .line 250
    check-cast v14, Landroid/widget/TextView;

    .line 251
    .line 252
    if-eqz v14, :cond_0

    .line 253
    .line 254
    const v2, 0x7f0a026c

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Landroid/widget/LinearLayout;

    .line 262
    .line 263
    if-eqz v5, :cond_0

    .line 264
    .line 265
    const v2, 0x7f0a026d

    .line 266
    .line 267
    .line 268
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    check-cast v5, Landroid/widget/TextView;

    .line 273
    .line 274
    if-eqz v5, :cond_0

    .line 275
    .line 276
    const v2, 0x7f0a0271

    .line 277
    .line 278
    .line 279
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    move-object v15, v5

    .line 284
    check-cast v15, Landroid/widget/TextView;

    .line 285
    .line 286
    if-eqz v15, :cond_0

    .line 287
    .line 288
    const v2, 0x7f0a0453

    .line 289
    .line 290
    .line 291
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    check-cast v5, Landroid/widget/LinearLayout;

    .line 296
    .line 297
    if-eqz v5, :cond_0

    .line 298
    .line 299
    const v2, 0x7f0a0454

    .line 300
    .line 301
    .line 302
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    check-cast v5, Landroid/widget/TextView;

    .line 307
    .line 308
    if-eqz v5, :cond_0

    .line 309
    .line 310
    const v2, 0x7f0a0455

    .line 311
    .line 312
    .line 313
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    move-object/from16 v16, v5

    .line 318
    .line 319
    check-cast v16, Landroid/widget/TextView;

    .line 320
    .line 321
    if-eqz v16, :cond_0

    .line 322
    .line 323
    const v2, 0x7f0a0528

    .line 324
    .line 325
    .line 326
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    check-cast v5, Landroid/widget/LinearLayout;

    .line 331
    .line 332
    if-eqz v5, :cond_0

    .line 333
    .line 334
    const v2, 0x7f0a0529

    .line 335
    .line 336
    .line 337
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    check-cast v5, Landroid/widget/TextView;

    .line 342
    .line 343
    if-eqz v5, :cond_0

    .line 344
    .line 345
    const v2, 0x7f0a052a

    .line 346
    .line 347
    .line 348
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    move-object/from16 v17, v5

    .line 353
    .line 354
    check-cast v17, Landroid/widget/TextView;

    .line 355
    .line 356
    if-eqz v17, :cond_0

    .line 357
    .line 358
    const v2, 0x7f0a0589

    .line 359
    .line 360
    .line 361
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Landroid/widget/LinearLayout;

    .line 366
    .line 367
    if-eqz v5, :cond_0

    .line 368
    .line 369
    const v2, 0x7f0a058a

    .line 370
    .line 371
    .line 372
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    check-cast v5, Landroid/widget/TextView;

    .line 377
    .line 378
    if-eqz v5, :cond_0

    .line 379
    .line 380
    const v2, 0x7f0a058b

    .line 381
    .line 382
    .line 383
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    move-object/from16 v18, v5

    .line 388
    .line 389
    check-cast v18, Landroid/widget/TextView;

    .line 390
    .line 391
    if-eqz v18, :cond_0

    .line 392
    .line 393
    const v2, 0x7f0a05a2

    .line 394
    .line 395
    .line 396
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    move-object/from16 v19, v5

    .line 401
    .line 402
    check-cast v19, Landroid/widget/LinearLayout;

    .line 403
    .line 404
    if-eqz v19, :cond_0

    .line 405
    .line 406
    const v2, 0x7f0a05a3

    .line 407
    .line 408
    .line 409
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 410
    .line 411
    .line 412
    move-result-object v5

    .line 413
    check-cast v5, Landroid/widget/TextView;

    .line 414
    .line 415
    if-eqz v5, :cond_0

    .line 416
    .line 417
    const v2, 0x7f0a05a5

    .line 418
    .line 419
    .line 420
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    move-object/from16 v20, v5

    .line 425
    .line 426
    check-cast v20, Landroid/widget/TextView;

    .line 427
    .line 428
    if-eqz v20, :cond_0

    .line 429
    .line 430
    const v2, 0x7f0a05cb

    .line 431
    .line 432
    .line 433
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    move-object/from16 v21, v5

    .line 438
    .line 439
    check-cast v21, Landroid/widget/LinearLayout;

    .line 440
    .line 441
    if-eqz v21, :cond_0

    .line 442
    .line 443
    const v2, 0x7f0a05cc

    .line 444
    .line 445
    .line 446
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    check-cast v5, Landroid/widget/TextView;

    .line 451
    .line 452
    if-eqz v5, :cond_0

    .line 453
    .line 454
    const v2, 0x7f0a05ce

    .line 455
    .line 456
    .line 457
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    move-object/from16 v22, v5

    .line 462
    .line 463
    check-cast v22, Landroid/widget/TextView;

    .line 464
    .line 465
    if-eqz v22, :cond_0

    .line 466
    .line 467
    const v2, 0x7f0a05d7

    .line 468
    .line 469
    .line 470
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    check-cast v5, Landroid/widget/LinearLayout;

    .line 475
    .line 476
    if-eqz v5, :cond_0

    .line 477
    .line 478
    const v2, 0x7f0a05d8

    .line 479
    .line 480
    .line 481
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 482
    .line 483
    .line 484
    move-result-object v5

    .line 485
    check-cast v5, Landroid/widget/TextView;

    .line 486
    .line 487
    if-eqz v5, :cond_0

    .line 488
    .line 489
    const v2, 0x7f0a05d9

    .line 490
    .line 491
    .line 492
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 493
    .line 494
    .line 495
    move-result-object v5

    .line 496
    move-object/from16 v23, v5

    .line 497
    .line 498
    check-cast v23, Landroid/widget/TextView;

    .line 499
    .line 500
    if-eqz v23, :cond_0

    .line 501
    .line 502
    const v2, 0x7f0a0615

    .line 503
    .line 504
    .line 505
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 506
    .line 507
    .line 508
    move-result-object v5

    .line 509
    check-cast v5, Landroid/widget/LinearLayout;

    .line 510
    .line 511
    if-eqz v5, :cond_0

    .line 512
    .line 513
    const v2, 0x7f0a0616

    .line 514
    .line 515
    .line 516
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    check-cast v5, Landroid/widget/TextView;

    .line 521
    .line 522
    if-eqz v5, :cond_0

    .line 523
    .line 524
    const v2, 0x7f0a0619

    .line 525
    .line 526
    .line 527
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    move-object/from16 v24, v5

    .line 532
    .line 533
    check-cast v24, Landroid/widget/TextView;

    .line 534
    .line 535
    if-eqz v24, :cond_0

    .line 536
    .line 537
    const v2, 0x7f0a0627

    .line 538
    .line 539
    .line 540
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    move-object/from16 v25, v5

    .line 545
    .line 546
    check-cast v25, Landroid/widget/ImageView;

    .line 547
    .line 548
    if-eqz v25, :cond_0

    .line 549
    .line 550
    const v2, 0x7f0a0628

    .line 551
    .line 552
    .line 553
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    check-cast v5, Landroid/widget/LinearLayout;

    .line 558
    .line 559
    if-eqz v5, :cond_0

    .line 560
    .line 561
    const v2, 0x7f0a0629

    .line 562
    .line 563
    .line 564
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    check-cast v5, Landroid/widget/TextView;

    .line 569
    .line 570
    if-eqz v5, :cond_0

    .line 571
    .line 572
    const v2, 0x7f0a062b

    .line 573
    .line 574
    .line 575
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 576
    .line 577
    .line 578
    move-result-object v5

    .line 579
    move-object/from16 v26, v5

    .line 580
    .line 581
    check-cast v26, Landroid/widget/TextView;

    .line 582
    .line 583
    if-eqz v26, :cond_0

    .line 584
    .line 585
    const v2, 0x7f0a062c

    .line 586
    .line 587
    .line 588
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    move-object/from16 v27, v5

    .line 593
    .line 594
    check-cast v27, Landroid/widget/TextView;

    .line 595
    .line 596
    if-eqz v27, :cond_0

    .line 597
    .line 598
    const v2, 0x7f0a062d

    .line 599
    .line 600
    .line 601
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 602
    .line 603
    .line 604
    move-result-object v5

    .line 605
    move-object/from16 v28, v5

    .line 606
    .line 607
    check-cast v28, Landroid/widget/TextView;

    .line 608
    .line 609
    if-eqz v28, :cond_0

    .line 610
    .line 611
    const v2, 0x7f0a062e

    .line 612
    .line 613
    .line 614
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    move-object/from16 v29, v5

    .line 619
    .line 620
    check-cast v29, Landroid/widget/TextView;

    .line 621
    .line 622
    if-eqz v29, :cond_0

    .line 623
    .line 624
    const v2, 0x7f0a062f

    .line 625
    .line 626
    .line 627
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 628
    .line 629
    .line 630
    move-result-object v5

    .line 631
    check-cast v5, Landroid/widget/LinearLayout;

    .line 632
    .line 633
    if-eqz v5, :cond_0

    .line 634
    .line 635
    const v2, 0x7f0a0630

    .line 636
    .line 637
    .line 638
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 639
    .line 640
    .line 641
    move-result-object v5

    .line 642
    check-cast v5, Landroid/widget/TextView;

    .line 643
    .line 644
    if-eqz v5, :cond_0

    .line 645
    .line 646
    const v2, 0x7f0a0631

    .line 647
    .line 648
    .line 649
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 650
    .line 651
    .line 652
    move-result-object v5

    .line 653
    move-object/from16 v30, v5

    .line 654
    .line 655
    check-cast v30, Landroid/widget/TextView;

    .line 656
    .line 657
    if-eqz v30, :cond_0

    .line 658
    .line 659
    const v2, 0x7f0a0632

    .line 660
    .line 661
    .line 662
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    check-cast v5, Landroid/widget/LinearLayout;

    .line 667
    .line 668
    if-eqz v5, :cond_0

    .line 669
    .line 670
    const v2, 0x7f0a0633

    .line 671
    .line 672
    .line 673
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 674
    .line 675
    .line 676
    move-result-object v5

    .line 677
    check-cast v5, Landroid/widget/TextView;

    .line 678
    .line 679
    if-eqz v5, :cond_0

    .line 680
    .line 681
    const v2, 0x7f0a0634

    .line 682
    .line 683
    .line 684
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 685
    .line 686
    .line 687
    move-result-object v5

    .line 688
    move-object/from16 v31, v5

    .line 689
    .line 690
    check-cast v31, Landroid/widget/TextView;

    .line 691
    .line 692
    if-eqz v31, :cond_0

    .line 693
    .line 694
    const v2, 0x7f0a066c

    .line 695
    .line 696
    .line 697
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    check-cast v5, Landroid/widget/LinearLayout;

    .line 702
    .line 703
    if-eqz v5, :cond_0

    .line 704
    .line 705
    const v2, 0x7f0a066d

    .line 706
    .line 707
    .line 708
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    check-cast v5, Landroid/widget/TextView;

    .line 713
    .line 714
    if-eqz v5, :cond_0

    .line 715
    .line 716
    const v2, 0x7f0a066f

    .line 717
    .line 718
    .line 719
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    move-object/from16 v32, v5

    .line 724
    .line 725
    check-cast v32, Landroid/widget/TextView;

    .line 726
    .line 727
    if-eqz v32, :cond_0

    .line 728
    .line 729
    new-instance v6, Lvp0;

    .line 730
    .line 731
    move-object v7, v1

    .line 732
    check-cast v7, Landroidx/core/widget/NestedScrollView;

    .line 733
    .line 734
    invoke-direct/range {v6 .. v32}, Lvp0;-><init>(Landroidx/core/widget/NestedScrollView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 735
    .line 736
    .line 737
    iput-object v6, v0, Luv4;->B0:Lvp0;

    .line 738
    .line 739
    new-instance v1, Lvg2;

    .line 740
    .line 741
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    invoke-direct {v1, v2, v4}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 746
    .line 747
    .line 748
    iget-object v0, v0, Luv4;->B0:Lvp0;

    .line 749
    .line 750
    iget-object v0, v0, Lvp0;->a:Landroidx/core/widget/NestedScrollView;

    .line 751
    .line 752
    invoke-virtual {v1, v0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    new-instance v1, Lwr;

    .line 757
    .line 758
    const/16 v2, 0xf

    .line 759
    .line 760
    invoke-direct {v1, v2}, Lwr;-><init>(I)V

    .line 761
    .line 762
    .line 763
    const v2, 0x7f13056e

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0, v2, v1}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v0}, Lvg2;->create()Lf9;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    return-object v0

    .line 775
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    const-string v1, "Missing required view with ID: "

    .line 784
    .line 785
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    return-object v3
.end method

.method public final n0(Landroid/view/View;Lik;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-nez p2, :cond_1

    .line 5
    .line 6
    invoke-static {p1}, Ll93;->p(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    invoke-virtual {p1, p0}, Landroid/view/View;->setClickable(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/view/View;->setLongClickable(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ll93;->g(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lj8;

    .line 35
    .line 36
    const/16 v1, 0x1b

    .line 37
    .line 38
    invoke-direct {v0, v1, p0, p2}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Li8;

    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    invoke-direct {v0, v1, p0, p2}, Li8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
