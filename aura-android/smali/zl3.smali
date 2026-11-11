.class public final synthetic Lzl3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lzl3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lzl3;->b:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

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
    .locals 8

    .line 1
    iget v0, p0, Lzl3;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lzl3;->b:Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Lni4;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lni4;->r(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 22
    .line 23
    iget-object v0, v0, Lyd1;->c:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    move v1, v3

    .line 32
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 36
    .line 37
    iget-object v0, v0, Lyd1;->m:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const v2, 0x7f130408

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v2, v1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Lbm3;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->mapToLong(Ljava/util/function/ToLongFunction;)Ljava/util/stream/LongStream;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/stream/LongStream;->sum()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 79
    .line 80
    iget-object v2, v2, Lyd1;->h:Landroid/widget/TextView;

    .line 81
    .line 82
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0, v3}, Le03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const v1, 0x7f1303f1

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v1, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    .line 103
    .line 104
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->s0:Z

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v1, Lm7;

    .line 113
    .line 114
    const/16 v2, 0x11

    .line 115
    .line 116
    invoke-direct {v1, v2}, Lm7;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/util/List;

    .line 132
    .line 133
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->u0:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v0, v1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-eqz v1, :cond_1

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_1
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->u0:Ljava/util/List;

    .line 143
    .line 144
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->h0(Ljava/util/List;)V

    .line 145
    .line 146
    .line 147
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->i0()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 152
    .line 153
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 154
    .line 155
    if-eqz v0, :cond_f

    .line 156
    .line 157
    if-eqz p1, :cond_f

    .line 158
    .line 159
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_f

    .line 164
    .line 165
    new-instance v0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/4 v4, 0x0

    .line 182
    if-nez v1, :cond_3

    .line 183
    .line 184
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    goto :goto_1

    .line 195
    :cond_3
    move-object v1, v4

    .line 196
    :goto_1
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    if-eqz v1, :cond_4

    .line 201
    .line 202
    invoke-static {}, Lud3;->t()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-static {v5, v1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    goto :goto_2

    .line 211
    :cond_4
    move-object v5, v4

    .line 212
    :goto_2
    const/16 v6, 0x9

    .line 213
    .line 214
    invoke-static {p1, v1, v6, v3, v5}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {p1, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-static {}, Lud3;->R()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_5

    .line 231
    .line 232
    invoke-virtual {p1}, Llq;->l()Llq;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    check-cast p1, Lvz3;

    .line 237
    .line 238
    :cond_5
    new-instance v1, Lqj1;

    .line 239
    .line 240
    sget v3, Lwg0;->a:I

    .line 241
    .line 242
    int-to-float v3, v3

    .line 243
    const/4 v5, 0x0

    .line 244
    invoke-direct {v1, v3, v5, v5, v5}, Lqj1;-><init>(FFFF)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v1}, Llq;->A(Luw4;)Llq;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Lvz3;

    .line 252
    .line 253
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 254
    .line 255
    iget-object v1, v1, Lyd1;->f:Landroid/widget/ImageView;

    .line 256
    .line 257
    invoke-virtual {p1, v1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-le v1, v2, :cond_6

    .line 269
    .line 270
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 275
    .line 276
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    goto :goto_3

    .line 281
    :cond_6
    move-object v1, v4

    .line 282
    :goto_3
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    if-eqz v1, :cond_7

    .line 287
    .line 288
    invoke-static {}, Lud3;->t()I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    invoke-static {v7, v1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    goto :goto_4

    .line 297
    :cond_7
    move-object v7, v4

    .line 298
    :goto_4
    invoke-static {p1, v1, v6, v2, v7}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    invoke-virtual {p1, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    invoke-static {}, Lud3;->R()Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_8

    .line 315
    .line 316
    invoke-virtual {p1}, Llq;->l()Llq;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    check-cast p1, Lvz3;

    .line 321
    .line 322
    :cond_8
    new-instance v1, Lqj1;

    .line 323
    .line 324
    invoke-direct {v1, v5, v3, v5, v5}, Lqj1;-><init>(FFFF)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1, v1}, Llq;->A(Luw4;)Llq;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    check-cast p1, Lvz3;

    .line 332
    .line 333
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 334
    .line 335
    iget-object v1, v1, Lyd1;->g:Landroid/widget/ImageView;

    .line 336
    .line 337
    invoke-virtual {p1, v1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    const/4 v2, 0x2

    .line 349
    if-le v1, v2, :cond_9

    .line 350
    .line 351
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 356
    .line 357
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    goto :goto_5

    .line 362
    :cond_9
    move-object v1, v4

    .line 363
    :goto_5
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    if-eqz v1, :cond_a

    .line 368
    .line 369
    invoke-static {}, Lud3;->t()I

    .line 370
    .line 371
    .line 372
    move-result v7

    .line 373
    invoke-static {v7, v1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    goto :goto_6

    .line 378
    :cond_a
    move-object v7, v4

    .line 379
    :goto_6
    invoke-static {p1, v1, v6, v2, v7}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {p1, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-static {}, Lud3;->R()Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_b

    .line 396
    .line 397
    invoke-virtual {p1}, Llq;->l()Llq;

    .line 398
    .line 399
    .line 400
    move-result-object p1

    .line 401
    check-cast p1, Lvz3;

    .line 402
    .line 403
    :cond_b
    new-instance v1, Lqj1;

    .line 404
    .line 405
    invoke-direct {v1, v5, v5, v5, v3}, Lqj1;-><init>(FFFF)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p1, v1}, Llq;->A(Luw4;)Llq;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    check-cast p1, Lvz3;

    .line 413
    .line 414
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 415
    .line 416
    iget-object v1, v1, Lyd1;->d:Landroid/widget/ImageView;

    .line 417
    .line 418
    invoke-virtual {p1, v1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 422
    .line 423
    .line 424
    move-result-object p1

    .line 425
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    const/4 v2, 0x3

    .line 430
    if-le v1, v2, :cond_c

    .line 431
    .line 432
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 437
    .line 438
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    goto :goto_7

    .line 443
    :cond_c
    move-object v0, v4

    .line 444
    :goto_7
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    if-eqz v0, :cond_d

    .line 449
    .line 450
    invoke-static {}, Lud3;->t()I

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    invoke-static {v2, v0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    :cond_d
    invoke-static {p1, v0, v6, v1, v4}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {p1, v0}, Lvz3;->T(Lxv0;)Lvz3;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-static {}, Lud3;->R()Z

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    if-eqz v0, :cond_e

    .line 475
    .line 476
    invoke-virtual {p1}, Llq;->l()Llq;

    .line 477
    .line 478
    .line 479
    move-result-object p1

    .line 480
    check-cast p1, Lvz3;

    .line 481
    .line 482
    :cond_e
    new-instance v0, Lqj1;

    .line 483
    .line 484
    invoke-direct {v0, v5, v5, v3, v5}, Lqj1;-><init>(FFFF)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {p1, v0}, Llq;->A(Luw4;)Llq;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    check-cast p1, Lvz3;

    .line 492
    .line 493
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 494
    .line 495
    iget-object p0, p0, Lyd1;->e:Landroid/widget/ImageView;

    .line 496
    .line 497
    invoke-virtual {p1, p0}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 498
    .line 499
    .line 500
    :cond_f
    return-void

    .line 501
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 502
    .line 503
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 504
    .line 505
    .line 506
    move-result p1

    .line 507
    if-eqz p1, :cond_11

    .line 508
    .line 509
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    if-eqz p1, :cond_11

    .line 514
    .line 515
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->q0:Lf9;

    .line 516
    .line 517
    if-eqz p1, :cond_10

    .line 518
    .line 519
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    .line 520
    .line 521
    .line 522
    move-result p1

    .line 523
    if-nez p1, :cond_11

    .line 524
    .line 525
    :cond_10
    new-instance p1, Le9;

    .line 526
    .line 527
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    invoke-direct {p1, v0}, Le9;-><init>(Landroid/content/Context;)V

    .line 532
    .line 533
    .line 534
    const v0, 0x7f130403

    .line 535
    .line 536
    .line 537
    iget-object v1, p1, Le9;->a:La9;

    .line 538
    .line 539
    iget-object v2, v1, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 540
    .line 541
    invoke-virtual {v2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    iput-object v0, v1, La9;->d:Ljava/lang/CharSequence;

    .line 546
    .line 547
    const v0, 0x7f130402

    .line 548
    .line 549
    .line 550
    iget-object v2, v1, La9;->a:Landroid/view/ContextThemeWrapper;

    .line 551
    .line 552
    invoke-virtual {v2, v0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    iput-object v0, v1, La9;->f:Ljava/lang/CharSequence;

    .line 557
    .line 558
    new-instance v0, Lvr;

    .line 559
    .line 560
    const/4 v1, 0x4

    .line 561
    invoke-direct {v0, v1, p0}, Lvr;-><init>(ILjava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    const v1, 0x104000a

    .line 565
    .line 566
    .line 567
    invoke-virtual {p1, v1, v0}, Le9;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Le9;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    invoke-virtual {p1}, Le9;->a()Le9;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    invoke-virtual {p1}, Le9;->h()Lf9;

    .line 576
    .line 577
    .line 578
    move-result-object p1

    .line 579
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->q0:Lf9;

    .line 580
    .line 581
    :cond_11
    return-void

    .line 582
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 583
    .line 584
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Lni4;

    .line 585
    .line 586
    if-eqz v0, :cond_13

    .line 587
    .line 588
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Lli3;

    .line 589
    .line 590
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 591
    .line 592
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    check-cast v0, Ljava/lang/String;

    .line 597
    .line 598
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Lni4;

    .line 599
    .line 600
    if-eqz p1, :cond_12

    .line 601
    .line 602
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 603
    .line 604
    .line 605
    move-result p1

    .line 606
    if-eqz p1, :cond_12

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_12
    move v2, v3

    .line 610
    :goto_8
    invoke-virtual {p0, v0, v2}, Lni4;->s(Ljava/lang/String;Z)V

    .line 611
    .line 612
    .line 613
    :cond_13
    return-void

    .line 614
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 615
    .line 616
    if-eqz p1, :cond_16

    .line 617
    .line 618
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 619
    .line 620
    iget-object v0, v0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 621
    .line 622
    if-eqz v0, :cond_15

    .line 623
    .line 624
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-static {v0}, Lv13;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 633
    .line 634
    iget-object v4, v4, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 635
    .line 636
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v4

    .line 640
    sget-object v5, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 641
    .line 642
    if-eqz v4, :cond_15

    .line 643
    .line 644
    invoke-static {v4}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 645
    .line 646
    .line 647
    move-result v5

    .line 648
    if-eqz v5, :cond_14

    .line 649
    .line 650
    goto :goto_9

    .line 651
    :cond_14
    sget-object v5, Lcom/eddyizm/tempus/homemusic/a;->e:Ljava/util/HashMap;

    .line 652
    .line 653
    invoke-virtual {v5, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    :cond_15
    :goto_9
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 657
    .line 658
    iget-object v0, v0, Lyd1;->k:Landroid/widget/Button;

    .line 659
    .line 660
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    xor-int/2addr v4, v2

    .line 665
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 666
    .line 667
    .line 668
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 669
    .line 670
    iget-object v0, v0, Lyd1;->l:Landroid/widget/Button;

    .line 671
    .line 672
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 673
    .line 674
    .line 675
    move-result v4

    .line 676
    xor-int/2addr v4, v2

    .line 677
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 678
    .line 679
    .line 680
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 681
    .line 682
    iget-object v0, v0, Lyd1;->o:Landroid/widget/ProgressBar;

    .line 683
    .line 684
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 685
    .line 686
    .line 687
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 688
    .line 689
    iget-object v0, v0, Lyd1;->k:Landroid/widget/Button;

    .line 690
    .line 691
    new-instance v1, Lam3;

    .line 692
    .line 693
    invoke-direct {v1, p0, p1, v3}, Lam3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;Ljava/util/List;I)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 697
    .line 698
    .line 699
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Lyd1;

    .line 700
    .line 701
    iget-object v0, v0, Lyd1;->l:Landroid/widget/Button;

    .line 702
    .line 703
    new-instance v1, Lam3;

    .line 704
    .line 705
    invoke-direct {v1, p0, p1, v2}, Lam3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;Ljava/util/List;I)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 709
    .line 710
    .line 711
    :cond_16
    return-void

    .line 712
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 713
    .line 714
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Lni4;

    .line 715
    .line 716
    if-eqz v0, :cond_18

    .line 717
    .line 718
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Lli3;

    .line 719
    .line 720
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 721
    .line 722
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    check-cast v0, Ljava/lang/Boolean;

    .line 727
    .line 728
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Lni4;

    .line 729
    .line 730
    if-eqz v0, :cond_17

    .line 731
    .line 732
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-eqz v0, :cond_17

    .line 737
    .line 738
    goto :goto_a

    .line 739
    :cond_17
    move v2, v3

    .line 740
    :goto_a
    invoke-virtual {p0, p1, v2}, Lni4;->s(Ljava/lang/String;Z)V

    .line 741
    .line 742
    .line 743
    :cond_18
    return-void

    .line 744
    nop

    .line 745
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
