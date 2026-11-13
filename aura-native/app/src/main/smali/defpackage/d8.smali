.class public final synthetic Ldefpackage/d8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/d8;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/d8;->b:Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget v0, p0, Ldefpackage/d8;->a:I

    .line 2
    .line 3
    const v1, 0x7f130160

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x3

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object p0, p0, Ldefpackage/d8;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Ldefpackage/cl4;

    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/cl4;->d:Ldefpackage/k03;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    new-instance v1, Ldefpackage/xj;

    .line 36
    .line 37
    invoke-direct {v1, v0, v3}, Ldefpackage/xj;-><init>(Ldefpackage/k03;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Ldefpackage/cl4;->c(Ljava/util/List;Ldefpackage/xj;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :pswitch_0
    check-cast p0, Ldefpackage/bl4;

    .line 54
    .line 55
    check-cast p1, Ljava/util/List;

    .line 56
    .line 57
    iget-object v0, p0, Ldefpackage/bl4;->d:Ldefpackage/k03;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    new-instance v1, Ldefpackage/xj;

    .line 71
    .line 72
    invoke-direct {v1, v0, v5}, Ldefpackage/xj;-><init>(Ldefpackage/k03;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, v1}, Ldefpackage/bl4;->c(Ljava/util/List;Ldefpackage/xj;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    return-void

    .line 88
    :pswitch_1
    check-cast p0, Ldefpackage/ui4;

    .line 89
    .line 90
    check-cast p1, Ljava/util/List;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    iget-object v0, p0, Ldefpackage/ui4;->j:Ldefpackage/k03;

    .line 104
    .line 105
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    iget-object p0, p0, Ldefpackage/ui4;->j:Ldefpackage/k03;

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_2
    return-void

    .line 120
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;

    .line 121
    .line 122
    check-cast p1, Ljava/util/List;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 125
    .line 126
    if-nez p1, :cond_4

    .line 127
    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    iget-object p1, v0, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    :cond_3
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Ldefpackage/en3;

    .line 138
    .line 139
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 140
    .line 141
    invoke-virtual {p0, p1}, Ldefpackage/en3;->p(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    if-eqz v0, :cond_5

    .line 146
    .line 147
    iget-object v0, v0, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 150
    .line 151
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    :cond_5
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_8

    .line 159
    .line 160
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getEpisodes()Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 183
    .line 184
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getEpisodes()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 189
    .line 190
    if-eqz v0, :cond_7

    .line 191
    .line 192
    if-eqz p1, :cond_7

    .line 193
    .line 194
    iget-object v0, v0, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_6

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_6
    move v4, v7

    .line 206
    :goto_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Ldefpackage/en3;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, Ldefpackage/en3;->p(Ljava/util/List;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_7
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Ldefpackage/en3;

    .line 216
    .line 217
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 218
    .line 219
    invoke-virtual {p0, p1}, Ldefpackage/en3;->p(Ljava/util/List;)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_8
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->l0:Ldefpackage/z40;

    .line 224
    .line 225
    if-eqz p1, :cond_9

    .line 226
    .line 227
    iget-object p1, p1, Ldefpackage/z40;->p:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 230
    .line 231
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 232
    .line 233
    .line 234
    :cond_9
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->o0:Ldefpackage/en3;

    .line 235
    .line 236
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 237
    .line 238
    invoke-virtual {p0, p1}, Ldefpackage/en3;->p(Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    :goto_3
    return-void

    .line 242
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 243
    .line 244
    check-cast p1, Ljava/util/List;

    .line 245
    .line 246
    if-eqz p1, :cond_a

    .line 247
    .line 248
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->o0:Ldefpackage/ej;

    .line 249
    .line 250
    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 251
    .line 252
    new-instance v0, Ljava/util/ArrayList;

    .line 253
    .line 254
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 255
    .line 256
    .line 257
    iput-object v0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 260
    .line 261
    .line 262
    :cond_a
    return-void

    .line 263
    :pswitch_4
    check-cast p0, Ldefpackage/im3;

    .line 264
    .line 265
    check-cast p1, Ljava/lang/Boolean;

    .line 266
    .line 267
    if-eqz p1, :cond_b

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_b

    .line 274
    .line 275
    iget-object p1, p0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 276
    .line 277
    if-eqz p1, :cond_b

    .line 278
    .line 279
    invoke-virtual {p0}, Ldefpackage/im3;->h()V

    .line 280
    .line 281
    .line 282
    :cond_b
    return-void

    .line 283
    :pswitch_5
    check-cast p0, Ldefpackage/wl3;

    .line 284
    .line 285
    check-cast p1, Ljava/util/List;

    .line 286
    .line 287
    if-nez p1, :cond_c

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_c
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    iput-object p1, p0, Ldefpackage/wl3;->j:Ljava/lang/Integer;

    .line 299
    .line 300
    iget-object p1, p0, Ldefpackage/wl3;->k:Ldefpackage/d8;

    .line 301
    .line 302
    if-nez p1, :cond_d

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_d
    iget-object v0, p0, Ldefpackage/wl3;->g:Ldefpackage/k03;

    .line 306
    .line 307
    invoke-virtual {v0, p1}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 308
    .line 309
    .line 310
    iput-object v2, p0, Ldefpackage/wl3;->k:Ldefpackage/d8;

    .line 311
    .line 312
    :goto_4
    return-void

    .line 313
    :pswitch_6
    check-cast p0, Ldefpackage/sl3;

    .line 314
    .line 315
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 316
    .line 317
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const-string v1, "clipboard"

    .line 322
    .line 323
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    check-cast v0, Landroid/content/ClipboardManager;

    .line 328
    .line 329
    const v1, 0x7f130056

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getUrl()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {p0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :pswitch_7
    check-cast p0, Ldefpackage/fl3;

    .line 349
    .line 350
    check-cast p1, Ljava/util/List;

    .line 351
    .line 352
    if-eqz p1, :cond_12

    .line 353
    .line 354
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    iget-object v1, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 359
    .line 360
    if-nez v0, :cond_10

    .line 361
    .line 362
    if-eqz v1, :cond_e

    .line 363
    .line 364
    iget-object v0, v1, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, Landroid/widget/TextView;

    .line 367
    .line 368
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 369
    .line 370
    .line 371
    :cond_e
    iget-object v0, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 372
    .line 373
    if-eqz v0, :cond_f

    .line 374
    .line 375
    iget-object v0, v0, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 378
    .line 379
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 380
    .line 381
    .line 382
    :cond_f
    iget-object p0, p0, Ldefpackage/fl3;->D0:Ldefpackage/zd0;

    .line 383
    .line 384
    iput-object p1, p0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 385
    .line 386
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_10
    if-eqz v1, :cond_11

    .line 391
    .line 392
    iget-object p1, v1, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast p1, Landroid/widget/TextView;

    .line 395
    .line 396
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    :cond_11
    iget-object p0, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 400
    .line 401
    if-eqz p0, :cond_12

    .line 402
    .line 403
    iget-object p0, p0, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 406
    .line 407
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 408
    .line 409
    .line 410
    :cond_12
    :goto_5
    return-void

    .line 411
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;

    .line 412
    .line 413
    check-cast p1, Ljava/util/List;

    .line 414
    .line 415
    if-eqz p1, :cond_13

    .line 416
    .line 417
    new-instance v0, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v1, "UI Update: Received "

    .line 420
    .line 421
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    const-string v1, " items"

    .line 432
    .line 433
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    const-string v1, "TempusLog"

    .line 441
    .line 442
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 443
    .line 444
    .line 445
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->o0:Ldefpackage/q7;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    new-instance v1, Ljava/util/ArrayList;

    .line 451
    .line 452
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 453
    .line 454
    .line 455
    iput-object v1, v0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 456
    .line 457
    iget-object p1, v0, Ldefpackage/q7;->v:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast p1, Ljava/lang/String;

    .line 460
    .line 461
    invoke-static {p1, v1}, Ldefpackage/su3;->q(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    iput-object p1, v0, Ldefpackage/q7;->t:Ljava/util/List;

    .line 466
    .line 467
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 468
    .line 469
    .line 470
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->o0:Ldefpackage/q7;

    .line 471
    .line 472
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 473
    .line 474
    .line 475
    :cond_13
    return-void

    .line 476
    :pswitch_9
    check-cast p0, Ldefpackage/aj3;

    .line 477
    .line 478
    check-cast p1, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 479
    .line 480
    invoke-virtual {p0, p1}, Ldefpackage/aj3;->e(Lcom/eddyizm/tempus/model/LyricsCache;)V

    .line 481
    .line 482
    .line 483
    return-void

    .line 484
    :pswitch_a
    check-cast p0, Ljava/lang/Runnable;

    .line 485
    .line 486
    check-cast p1, Ljava/lang/Long;

    .line 487
    .line 488
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :pswitch_b
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 493
    .line 494
    check-cast p1, Ljava/util/List;

    .line 495
    .line 496
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 497
    .line 498
    .line 499
    move-result v0

    .line 500
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Ldefpackage/ml3;

    .line 501
    .line 502
    if-nez v0, :cond_16

    .line 503
    .line 504
    if-eqz v1, :cond_14

    .line 505
    .line 506
    iget-object v0, v1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v0, Landroid/widget/TextView;

    .line 509
    .line 510
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 511
    .line 512
    .line 513
    :cond_14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Ldefpackage/ml3;

    .line 514
    .line 515
    if-eqz v0, :cond_15

    .line 516
    .line 517
    iget-object v0, v0, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 520
    .line 521
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 522
    .line 523
    .line 524
    :cond_15
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->o0:Ldefpackage/zd0;

    .line 525
    .line 526
    iput-object p1, p0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 527
    .line 528
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 529
    .line 530
    .line 531
    goto :goto_6

    .line 532
    :cond_16
    if-eqz v1, :cond_17

    .line 533
    .line 534
    iget-object p1, v1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast p1, Landroid/widget/TextView;

    .line 537
    .line 538
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 539
    .line 540
    .line 541
    :cond_17
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Ldefpackage/ml3;

    .line 542
    .line 543
    if-eqz p0, :cond_18

    .line 544
    .line 545
    iget-object p0, p0, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 548
    .line 549
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 550
    .line 551
    .line 552
    :cond_18
    :goto_6
    return-void

    .line 553
    :pswitch_c
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 554
    .line 555
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Indexes;

    .line 556
    .line 557
    if-eqz p1, :cond_1c

    .line 558
    .line 559
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Indexes;->getIndices()Ljava/util/List;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    if-nez v0, :cond_19

    .line 564
    .line 565
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 566
    .line 567
    goto :goto_8

    .line 568
    :cond_19
    new-instance v0, Ljava/util/ArrayList;

    .line 569
    .line 570
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Indexes;->getIndices()Ljava/util/List;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    :cond_1a
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-eqz v1, :cond_1b

    .line 586
    .line 587
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Index;

    .line 592
    .line 593
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Index;->getArtists()Ljava/util/List;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    if-eqz v2, :cond_1a

    .line 598
    .line 599
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Index;->getArtists()Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 604
    .line 605
    .line 606
    goto :goto_7

    .line 607
    :cond_1b
    move-object p1, v0

    .line 608
    :goto_8
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->s0:Ljava/util/List;

    .line 609
    .line 610
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->h0()V

    .line 611
    .line 612
    .line 613
    :cond_1c
    return-void

    .line 614
    :pswitch_d
    check-cast p0, Ldefpackage/hp1;

    .line 615
    .line 616
    check-cast p1, Ljava/util/List;

    .line 617
    .line 618
    iget-object v0, p0, Ldefpackage/hp1;->l0:Ldefpackage/z40;

    .line 619
    .line 620
    if-nez p1, :cond_1e

    .line 621
    .line 622
    if-eqz v0, :cond_1d

    .line 623
    .line 624
    iget-object p1, v0, Ldefpackage/z40;->q:Ljava/lang/Object;

    .line 625
    .line 626
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 627
    .line 628
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 629
    .line 630
    .line 631
    :cond_1d
    iget-object p0, p0, Ldefpackage/hp1;->l0:Ldefpackage/z40;

    .line 632
    .line 633
    if-eqz p0, :cond_23

    .line 634
    .line 635
    iget-object p0, p0, Ldefpackage/z40;->n:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast p0, Landroid/widget/LinearLayout;

    .line 638
    .line 639
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 640
    .line 641
    .line 642
    goto :goto_a

    .line 643
    :cond_1e
    if-eqz v0, :cond_20

    .line 644
    .line 645
    iget-object v0, v0, Ldefpackage/z40;->q:Ljava/lang/Object;

    .line 646
    .line 647
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 648
    .line 649
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    if-nez v1, :cond_1f

    .line 654
    .line 655
    move v1, v7

    .line 656
    goto :goto_9

    .line 657
    :cond_1f
    move v1, v4

    .line 658
    :goto_9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 659
    .line 660
    .line 661
    :cond_20
    iget-object v0, p0, Ldefpackage/hp1;->l0:Ldefpackage/z40;

    .line 662
    .line 663
    if-eqz v0, :cond_22

    .line 664
    .line 665
    iget-object v0, v0, Ldefpackage/z40;->n:Ljava/lang/Object;

    .line 666
    .line 667
    check-cast v0, Landroid/widget/LinearLayout;

    .line 668
    .line 669
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    if-eqz v1, :cond_21

    .line 674
    .line 675
    move v4, v7

    .line 676
    :cond_21
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 677
    .line 678
    .line 679
    :cond_22
    iget-object p0, p0, Ldefpackage/hp1;->o0:Ldefpackage/zd0;

    .line 680
    .line 681
    iput-object p1, p0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 682
    .line 683
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 684
    .line 685
    .line 686
    :cond_23
    :goto_a
    return-void

    .line 687
    :pswitch_e
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 688
    .line 689
    check-cast p1, Ljava/util/List;

    .line 690
    .line 691
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Ldefpackage/ej;

    .line 692
    .line 693
    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 694
    .line 695
    new-instance v0, Ljava/util/ArrayList;

    .line 696
    .line 697
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 698
    .line 699
    .line 700
    iput-object v0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 701
    .line 702
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 703
    .line 704
    .line 705
    return-void

    .line 706
    :pswitch_f
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;

    .line 707
    .line 708
    check-cast p1, Ljava/util/List;

    .line 709
    .line 710
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Ldefpackage/lv4;

    .line 711
    .line 712
    iget-object v0, v0, Ldefpackage/lv4;->s:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v0, Landroid/widget/ProgressBar;

    .line 715
    .line 716
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 717
    .line 718
    .line 719
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Ldefpackage/lv4;

    .line 720
    .line 721
    iget-object v0, v0, Ldefpackage/lv4;->o:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v0, Landroidx/core/widget/NestedScrollView;

    .line 724
    .line 725
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 726
    .line 727
    .line 728
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 729
    .line 730
    .line 731
    move-result-object p1

    .line 732
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-eqz v0, :cond_24

    .line 737
    .line 738
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 743
    .line 744
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-virtual {v1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    const v3, 0x7f0d0029

    .line 753
    .line 754
    .line 755
    invoke-virtual {v1, v3, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    check-cast v1, Lcom/google/android/material/chip/Chip;

    .line 760
    .line 761
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 766
    .line 767
    .line 768
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->n0:Ldefpackage/f71;

    .line 769
    .line 770
    iget-object v3, v3, Ldefpackage/f71;->d:Ljava/util/ArrayList;

    .line 771
    .line 772
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v4

    .line 776
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    invoke-virtual {v1, v3}, Lcom/google/android/material/chip/Chip;->setChecked(Z)V

    .line 781
    .line 782
    .line 783
    new-instance v3, Ldefpackage/w11;

    .line 784
    .line 785
    invoke-direct {v3, v6, p0, v0}, Ldefpackage/w11;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v3}, Lcom/google/android/material/chip/Chip;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 789
    .line 790
    .line 791
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Ldefpackage/lv4;

    .line 792
    .line 793
    iget-object v0, v0, Ldefpackage/lv4;->p:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v0, Lcom/google/android/material/chip/ChipGroup;

    .line 796
    .line 797
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 798
    .line 799
    .line 800
    goto :goto_b

    .line 801
    :cond_24
    return-void

    .line 802
    :pswitch_10
    check-cast p0, Ldefpackage/bu0;

    .line 803
    .line 804
    check-cast p1, Ljava/util/List;

    .line 805
    .line 806
    iget-object p0, p0, Ldefpackage/bu0;->d:Ldefpackage/k03;

    .line 807
    .line 808
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 809
    .line 810
    .line 811
    move-result-object p1

    .line 812
    new-instance v0, Ldefpackage/m7;

    .line 813
    .line 814
    const/16 v1, 0x16

    .line 815
    .line 816
    invoke-direct {v0, v1}, Ldefpackage/m7;-><init>(I)V

    .line 817
    .line 818
    .line 819
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 820
    .line 821
    .line 822
    move-result-object p1

    .line 823
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object p1

    .line 831
    check-cast p1, Ljava/util/List;

    .line 832
    .line 833
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 834
    .line 835
    .line 836
    return-void

    .line 837
    :pswitch_11
    check-cast p0, Ldefpackage/qq0;

    .line 838
    .line 839
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 840
    .line 841
    iget-object v0, p0, Ldefpackage/qq0;->n:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 842
    .line 843
    invoke-virtual {v0}, Ldefpackage/kc1;->B()Z

    .line 844
    .line 845
    .line 846
    move-result v1

    .line 847
    if-eqz v1, :cond_26

    .line 848
    .line 849
    invoke-virtual {v0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    if-eqz v1, :cond_26

    .line 854
    .line 855
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 856
    .line 857
    .line 858
    move-result-object p1

    .line 859
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    new-instance v1, Ldefpackage/c7;

    .line 864
    .line 865
    invoke-direct {v1, v5}, Ldefpackage/c7;-><init>(I)V

    .line 866
    .line 867
    .line 868
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 873
    .line 874
    .line 875
    move-result-object v1

    .line 876
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    check-cast p1, Ljava/util/List;

    .line 881
    .line 882
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v1

    .line 886
    if-nez v1, :cond_25

    .line 887
    .line 888
    invoke-virtual {v0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 889
    .line 890
    .line 891
    move-result-object p0

    .line 892
    invoke-static {p0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 893
    .line 894
    .line 895
    move-result-object p0

    .line 896
    invoke-static {p1}, Ldefpackage/gi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 901
    .line 902
    .line 903
    move-result-object p1

    .line 904
    new-instance v1, Ldefpackage/hu3;

    .line 905
    .line 906
    const/4 v2, 0x6

    .line 907
    invoke-direct {v1, v2}, Ldefpackage/hu3;-><init>(I)V

    .line 908
    .line 909
    .line 910
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 911
    .line 912
    .line 913
    move-result-object p1

    .line 914
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 915
    .line 916
    .line 917
    move-result-object v1

    .line 918
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object p1

    .line 922
    check-cast p1, Ljava/util/List;

    .line 923
    .line 924
    invoke-virtual {p0, v0, p1, v7}, Ldefpackage/eu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 925
    .line 926
    .line 927
    goto :goto_c

    .line 928
    :cond_25
    new-instance v0, Ldefpackage/d7;

    .line 929
    .line 930
    invoke-direct {v0, v3, p0}, Ldefpackage/d7;-><init>(ILjava/lang/Object;)V

    .line 931
    .line 932
    .line 933
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 934
    .line 935
    .line 936
    :cond_26
    :goto_c
    return-void

    .line 937
    :pswitch_12
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 938
    .line 939
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 940
    .line 941
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Ldefpackage/ml3;

    .line 942
    .line 943
    iget-object v0, v0, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 946
    .line 947
    new-instance v1, Ldefpackage/pq0;

    .line 948
    .line 949
    invoke-direct {v1, p0, p1}, Ldefpackage/pq0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;Lcom/eddyizm/tempus/subsonic/models/Directory;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 953
    .line 954
    .line 955
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Ldefpackage/ml3;

    .line 956
    .line 957
    iget-object v0, v0, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v0, Landroid/widget/TextView;

    .line 960
    .line 961
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getName()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 966
    .line 967
    .line 968
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->o0:Ldefpackage/zd0;

    .line 969
    .line 970
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 975
    .line 976
    .line 977
    if-eqz v1, :cond_27

    .line 978
    .line 979
    new-instance v3, Ljava/util/ArrayList;

    .line 980
    .line 981
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 982
    .line 983
    .line 984
    new-instance v1, Ldefpackage/n7;

    .line 985
    .line 986
    const/16 v4, 0x12

    .line 987
    .line 988
    invoke-direct {v1, v4}, Ldefpackage/n7;-><init>(I)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 992
    .line 993
    .line 994
    iput-object v3, v0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 995
    .line 996
    goto :goto_d

    .line 997
    :cond_27
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 998
    .line 999
    iput-object v1, v0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 1000
    .line 1001
    :goto_d
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 1002
    .line 1003
    .line 1004
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->r0:Landroid/view/MenuItem;

    .line 1005
    .line 1006
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    if-eqz v0, :cond_28

    .line 1011
    .line 1012
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Directory;->getChildren()Ljava/util/List;

    .line 1013
    .line 1014
    .line 1015
    move-result-object p1

    .line 1016
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1017
    .line 1018
    .line 1019
    move-result-object p1

    .line 1020
    new-instance v0, Ldefpackage/c7;

    .line 1021
    .line 1022
    invoke-direct {v0, v6}, Ldefpackage/c7;-><init>(I)V

    .line 1023
    .line 1024
    .line 1025
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 1026
    .line 1027
    .line 1028
    move-result-object p1

    .line 1029
    invoke-interface {p1}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 1030
    .line 1031
    .line 1032
    move-result-object p1

    .line 1033
    invoke-virtual {p1, v2}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p1

    .line 1037
    if-eqz p1, :cond_28

    .line 1038
    .line 1039
    goto :goto_e

    .line 1040
    :cond_28
    move v6, v7

    .line 1041
    :goto_e
    invoke-interface {p0, v6}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 1042
    .line 1043
    .line 1044
    return-void

    .line 1045
    :pswitch_13
    check-cast p0, Ldefpackage/wj;

    .line 1046
    .line 1047
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 1048
    .line 1049
    iget-object v0, p0, Ldefpackage/wj;->f:Ldefpackage/k03;

    .line 1050
    .line 1051
    iget-object v1, p0, Ldefpackage/wj;->g:Ldefpackage/k03;

    .line 1052
    .line 1053
    if-eqz p1, :cond_2a

    .line 1054
    .line 1055
    instance-of v2, p1, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 1056
    .line 1057
    if-eqz v2, :cond_2a

    .line 1058
    .line 1059
    new-instance v2, Ldefpackage/tj;

    .line 1060
    .line 1061
    invoke-direct {v2, v7, p0}, Ldefpackage/tj;-><init>(ILjava/lang/Object;)V

    .line 1062
    .line 1063
    .line 1064
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 1065
    .line 1066
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;->getAlbums()Ljava/util/List;

    .line 1067
    .line 1068
    .line 1069
    move-result-object p0

    .line 1070
    if-eqz p0, :cond_29

    .line 1071
    .line 1072
    new-instance p1, Ldefpackage/m7;

    .line 1073
    .line 1074
    invoke-direct {p1, v5}, Ldefpackage/m7;-><init>(I)V

    .line 1075
    .line 1076
    .line 1077
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 1078
    .line 1079
    .line 1080
    move-result-object p1

    .line 1081
    invoke-interface {p1}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    .line 1082
    .line 1083
    .line 1084
    move-result-object p1

    .line 1085
    invoke-interface {p0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1089
    .line 1090
    .line 1091
    move-result-object p1

    .line 1092
    invoke-interface {p1, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 1093
    .line 1094
    .line 1095
    move-result-object p1

    .line 1096
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v3

    .line 1100
    invoke-interface {p1, v3}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 1101
    .line 1102
    .line 1103
    move-result-object p1

    .line 1104
    check-cast p1, Ljava/util/List;

    .line 1105
    .line 1106
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1107
    .line 1108
    .line 1109
    move-result-object p1

    .line 1110
    new-instance v3, Ldefpackage/m7;

    .line 1111
    .line 1112
    const/16 v4, 0xe

    .line 1113
    .line 1114
    invoke-direct {v3, v4}, Ldefpackage/m7;-><init>(I)V

    .line 1115
    .line 1116
    .line 1117
    invoke-static {v3}, Ljava/util/stream/Collectors;->groupingBy(Ljava/util/function/Function;)Ljava/util/stream/Collector;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v3

    .line 1121
    invoke-interface {p1, v3}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object p1

    .line 1125
    check-cast p1, Ljava/util/Map;

    .line 1126
    .line 1127
    invoke-virtual {v1, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1128
    .line 1129
    .line 1130
    goto :goto_f

    .line 1131
    :cond_29
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 1132
    .line 1133
    invoke-virtual {v1, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1134
    .line 1135
    .line 1136
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1137
    .line 1138
    invoke-virtual {v0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1139
    .line 1140
    .line 1141
    :goto_f
    if-eqz p0, :cond_2a

    .line 1142
    .line 1143
    new-instance p1, Ldefpackage/m7;

    .line 1144
    .line 1145
    invoke-direct {p1, v5}, Ldefpackage/m7;-><init>(I)V

    .line 1146
    .line 1147
    .line 1148
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 1149
    .line 1150
    .line 1151
    move-result-object p1

    .line 1152
    invoke-interface {p1}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    .line 1153
    .line 1154
    .line 1155
    move-result-object p1

    .line 1156
    invoke-interface {p0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 1157
    .line 1158
    .line 1159
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 1160
    .line 1161
    .line 1162
    move-result-object p0

    .line 1163
    new-instance p1, Ldefpackage/tj;

    .line 1164
    .line 1165
    invoke-direct {p1, v6, v2}, Ldefpackage/tj;-><init>(ILjava/lang/Object;)V

    .line 1166
    .line 1167
    .line 1168
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 1169
    .line 1170
    .line 1171
    move-result-object p0

    .line 1172
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 1173
    .line 1174
    .line 1175
    move-result-object p1

    .line 1176
    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object p0

    .line 1180
    check-cast p0, Ljava/util/List;

    .line 1181
    .line 1182
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1183
    .line 1184
    .line 1185
    :cond_2a
    return-void

    .line 1186
    :pswitch_14
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

    .line 1187
    .line 1188
    check-cast p1, Ljava/util/List;

    .line 1189
    .line 1190
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->o0:Ldefpackage/b8;

    .line 1191
    .line 1192
    if-eqz p1, :cond_2b

    .line 1193
    .line 1194
    move-object v2, p1

    .line 1195
    goto :goto_10

    .line 1196
    :cond_2b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1200
    .line 1201
    :goto_10
    iput-object v2, v0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 1202
    .line 1203
    iget-object v2, v0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 1204
    .line 1205
    check-cast v2, Ldefpackage/o7;

    .line 1206
    .line 1207
    iget-object v3, v0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 1208
    .line 1209
    invoke-virtual {v2, v3}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 1213
    .line 1214
    .line 1215
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->n0:Ldefpackage/nj;

    .line 1216
    .line 1217
    iget-object v0, v0, Ldefpackage/nj;->e:Ljava/lang/String;

    .line 1218
    .line 1219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    const-string v2, "ARTIST_STARRED"

    .line 1223
    .line 1224
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v3

    .line 1228
    const-string v4, "ARTIST_DOWNLOADED"

    .line 1229
    .line 1230
    if-nez v3, :cond_2c

    .line 1231
    .line 1232
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1233
    .line 1234
    .line 1235
    move-result v0

    .line 1236
    if-nez v0, :cond_2c

    .line 1237
    .line 1238
    goto :goto_11

    .line 1239
    :cond_2c
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 1240
    .line 1241
    iget-object v0, v0, Ldefpackage/oc1;->e:Landroid/widget/TextView;

    .line 1242
    .line 1243
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1244
    .line 1245
    .line 1246
    move-result p1

    .line 1247
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1248
    .line 1249
    .line 1250
    move-result-object p1

    .line 1251
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object p1

    .line 1255
    invoke-virtual {p0, v1, p1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object p1

    .line 1259
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1260
    .line 1261
    .line 1262
    :goto_11
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->n0:Ldefpackage/nj;

    .line 1263
    .line 1264
    iget-object p1, p1, Ldefpackage/nj;->e:Ljava/lang/String;

    .line 1265
    .line 1266
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    move-result v0

    .line 1273
    if-nez v0, :cond_2d

    .line 1274
    .line 1275
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1276
    .line 1277
    .line 1278
    move-result p1

    .line 1279
    if-nez p1, :cond_2d

    .line 1280
    .line 1281
    goto :goto_12

    .line 1282
    :cond_2d
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 1283
    .line 1284
    iget-object p0, p0, Ldefpackage/oc1;->d:Landroid/widget/Button;

    .line 1285
    .line 1286
    invoke-virtual {p0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1287
    .line 1288
    .line 1289
    :goto_12
    return-void

    .line 1290
    :pswitch_15
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 1291
    .line 1292
    check-cast p1, Ljava/util/List;

    .line 1293
    .line 1294
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Ldefpackage/ej;

    .line 1295
    .line 1296
    iput-object p1, v0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 1297
    .line 1298
    new-instance v1, Ljava/util/ArrayList;

    .line 1299
    .line 1300
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1301
    .line 1302
    .line 1303
    iput-object v1, v0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 1304
    .line 1305
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 1306
    .line 1307
    .line 1308
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Ldefpackage/ej;

    .line 1309
    .line 1310
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 1311
    .line 1312
    .line 1313
    move-result-object p1

    .line 1314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 1318
    .line 1319
    .line 1320
    move-result-object p1

    .line 1321
    const-string v0, "artist_sort_by_album_count"

    .line 1322
    .line 1323
    invoke-interface {p1, v0, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 1324
    .line 1325
    .line 1326
    move-result p1

    .line 1327
    const-string v0, "Preferences"

    .line 1328
    .line 1329
    const-string v1, "getSortOrder"

    .line 1330
    .line 1331
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1332
    .line 1333
    .line 1334
    if-eqz p1, :cond_2e

    .line 1335
    .line 1336
    const-string p1, "ARTIST_ORDER_BY_ALBUM_COUNT"

    .line 1337
    .line 1338
    goto :goto_13

    .line 1339
    :cond_2e
    const-string p1, "ARTIST_ORDER_BY_NAME"

    .line 1340
    .line 1341
    :goto_13
    invoke-virtual {p0, p1}, Ldefpackage/ej;->q(Ljava/lang/String;)V

    .line 1342
    .line 1343
    .line 1344
    return-void

    .line 1345
    :pswitch_16
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 1346
    .line 1347
    check-cast p1, Ljava/util/List;

    .line 1348
    .line 1349
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 1350
    .line 1351
    .line 1352
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1353
    .line 1354
    .line 1355
    move-result v0

    .line 1356
    if-nez v0, :cond_2f

    .line 1357
    .line 1358
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->D0:Ldefpackage/bl2;

    .line 1359
    .line 1360
    const-string v1, "artist"

    .line 1361
    .line 1362
    invoke-static {v0, p1, v7, v1}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 1366
    .line 1367
    .line 1368
    move-result-object p1

    .line 1369
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1370
    .line 1371
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 1372
    .line 1373
    iget-object p1, p1, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 1374
    .line 1375
    check-cast p1, Ldefpackage/au;

    .line 1376
    .line 1377
    invoke-virtual {p1, v6}, Ldefpackage/au;->d(Z)V

    .line 1378
    .line 1379
    .line 1380
    :cond_2f
    invoke-virtual {p0}, Ldefpackage/zt;->h0()V

    .line 1381
    .line 1382
    .line 1383
    return-void

    .line 1384
    :pswitch_17
    check-cast p0, Ldefpackage/n8;

    .line 1385
    .line 1386
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1387
    .line 1388
    if-eqz p1, :cond_30

    .line 1389
    .line 1390
    iget-object p0, p0, Ldefpackage/n8;->h:Ldefpackage/k03;

    .line 1391
    .line 1392
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1393
    .line 1394
    .line 1395
    goto :goto_14

    .line 1396
    :cond_30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1397
    .line 1398
    .line 1399
    :goto_14
    return-void

    .line 1400
    :pswitch_18
    check-cast p0, Landroid/widget/ToggleButton;

    .line 1401
    .line 1402
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1403
    .line 1404
    if-eqz p1, :cond_32

    .line 1405
    .line 1406
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getStarred()Ljava/util/Date;

    .line 1411
    .line 1412
    .line 1413
    move-result-object p1

    .line 1414
    if-eqz p1, :cond_31

    .line 1415
    .line 1416
    goto :goto_15

    .line 1417
    :cond_31
    move v6, v7

    .line 1418
    :goto_15
    invoke-static {v5, v0, v6}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 1419
    .line 1420
    .line 1421
    move-result p1

    .line 1422
    invoke-virtual {p0, p1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 1423
    .line 1424
    .line 1425
    :cond_32
    return-void

    .line 1426
    :pswitch_19
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

    .line 1427
    .line 1428
    check-cast p1, Ljava/util/List;

    .line 1429
    .line 1430
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Ldefpackage/b8;

    .line 1431
    .line 1432
    if-eqz p1, :cond_33

    .line 1433
    .line 1434
    move-object v2, p1

    .line 1435
    goto :goto_16

    .line 1436
    :cond_33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1437
    .line 1438
    .line 1439
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1440
    .line 1441
    :goto_16
    iput-object v2, v0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 1442
    .line 1443
    iget-object v2, v0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 1444
    .line 1445
    check-cast v2, Ldefpackage/o7;

    .line 1446
    .line 1447
    iget-object v8, v0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 1448
    .line 1449
    invoke-virtual {v2, v8}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 1450
    .line 1451
    .line 1452
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 1453
    .line 1454
    .line 1455
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Ldefpackage/f8;

    .line 1456
    .line 1457
    iget-object v0, v0, Ldefpackage/f8;->d:Ljava/lang/String;

    .line 1458
    .line 1459
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1460
    .line 1461
    .line 1462
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1463
    .line 1464
    .line 1465
    move-result v2

    .line 1466
    const-string v8, "ALBUM_RECENTLY_ADDED"

    .line 1467
    .line 1468
    const-string v9, "ALBUM_RECENTLY_PLAYED"

    .line 1469
    .line 1470
    const-string v10, "ALBUM_STARRED"

    .line 1471
    .line 1472
    const-string v11, "ALBUM_MOST_PLAYED"

    .line 1473
    .line 1474
    const/4 v12, -0x1

    .line 1475
    sparse-switch v2, :sswitch_data_0

    .line 1476
    .line 1477
    .line 1478
    :goto_17
    move v0, v12

    .line 1479
    goto :goto_18

    .line 1480
    :sswitch_0
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1481
    .line 1482
    .line 1483
    move-result v0

    .line 1484
    if-nez v0, :cond_34

    .line 1485
    .line 1486
    goto :goto_17

    .line 1487
    :cond_34
    move v0, v3

    .line 1488
    goto :goto_18

    .line 1489
    :sswitch_1
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1490
    .line 1491
    .line 1492
    move-result v0

    .line 1493
    if-nez v0, :cond_35

    .line 1494
    .line 1495
    goto :goto_17

    .line 1496
    :cond_35
    move v0, v5

    .line 1497
    goto :goto_18

    .line 1498
    :sswitch_2
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1499
    .line 1500
    .line 1501
    move-result v0

    .line 1502
    if-nez v0, :cond_36

    .line 1503
    .line 1504
    goto :goto_17

    .line 1505
    :cond_36
    move v0, v6

    .line 1506
    goto :goto_18

    .line 1507
    :sswitch_3
    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1508
    .line 1509
    .line 1510
    move-result v0

    .line 1511
    if-nez v0, :cond_37

    .line 1512
    .line 1513
    goto :goto_17

    .line 1514
    :cond_37
    move v0, v7

    .line 1515
    :goto_18
    packed-switch v0, :pswitch_data_1

    .line 1516
    .line 1517
    .line 1518
    goto :goto_1a

    .line 1519
    :pswitch_1a
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Ldefpackage/oc1;

    .line 1520
    .line 1521
    iget-object v0, v0, Ldefpackage/oc1;->e:Landroid/widget/TextView;

    .line 1522
    .line 1523
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1524
    .line 1525
    .line 1526
    move-result p1

    .line 1527
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1528
    .line 1529
    .line 1530
    move-result-object p1

    .line 1531
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object p1

    .line 1535
    invoke-virtual {p0, v1, p1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1536
    .line 1537
    .line 1538
    move-result-object p1

    .line 1539
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1540
    .line 1541
    .line 1542
    goto :goto_1a

    .line 1543
    :pswitch_1b
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Ldefpackage/oc1;

    .line 1544
    .line 1545
    iget-object v0, v0, Ldefpackage/oc1;->e:Landroid/widget/TextView;

    .line 1546
    .line 1547
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1548
    .line 1549
    .line 1550
    move-result v2

    .line 1551
    iget-object v13, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Ldefpackage/f8;

    .line 1552
    .line 1553
    iget v13, v13, Ldefpackage/f8;->h:I

    .line 1554
    .line 1555
    if-ge v2, v13, :cond_38

    .line 1556
    .line 1557
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1558
    .line 1559
    .line 1560
    move-result p1

    .line 1561
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1562
    .line 1563
    .line 1564
    move-result-object p1

    .line 1565
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1566
    .line 1567
    .line 1568
    move-result-object p1

    .line 1569
    invoke-virtual {p0, v1, p1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object p1

    .line 1573
    goto :goto_19

    .line 1574
    :cond_38
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1575
    .line 1576
    .line 1577
    move-result-object p1

    .line 1578
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 1579
    .line 1580
    .line 1581
    move-result-object p1

    .line 1582
    const v1, 0x7f130161

    .line 1583
    .line 1584
    .line 1585
    invoke-virtual {p0, v1, p1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object p1

    .line 1589
    :goto_19
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1590
    .line 1591
    .line 1592
    :goto_1a
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Ldefpackage/f8;

    .line 1593
    .line 1594
    iget-object p1, p1, Ldefpackage/f8;->d:Ljava/lang/String;

    .line 1595
    .line 1596
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 1600
    .line 1601
    .line 1602
    move-result v0

    .line 1603
    sparse-switch v0, :sswitch_data_1

    .line 1604
    .line 1605
    .line 1606
    :goto_1b
    move v3, v12

    .line 1607
    goto :goto_1c

    .line 1608
    :sswitch_4
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1609
    .line 1610
    .line 1611
    move-result p1

    .line 1612
    if-nez p1, :cond_3c

    .line 1613
    .line 1614
    goto :goto_1b

    .line 1615
    :sswitch_5
    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1616
    .line 1617
    .line 1618
    move-result p1

    .line 1619
    if-nez p1, :cond_39

    .line 1620
    .line 1621
    goto :goto_1b

    .line 1622
    :cond_39
    move v3, v5

    .line 1623
    goto :goto_1c

    .line 1624
    :sswitch_6
    invoke-virtual {p1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1625
    .line 1626
    .line 1627
    move-result p1

    .line 1628
    if-nez p1, :cond_3a

    .line 1629
    .line 1630
    goto :goto_1b

    .line 1631
    :cond_3a
    move v3, v6

    .line 1632
    goto :goto_1c

    .line 1633
    :sswitch_7
    invoke-virtual {p1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1634
    .line 1635
    .line 1636
    move-result p1

    .line 1637
    if-nez p1, :cond_3b

    .line 1638
    .line 1639
    goto :goto_1b

    .line 1640
    :cond_3b
    move v3, v7

    .line 1641
    :cond_3c
    :goto_1c
    packed-switch v3, :pswitch_data_2

    .line 1642
    .line 1643
    .line 1644
    goto :goto_1d

    .line 1645
    :pswitch_1c
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Ldefpackage/oc1;

    .line 1646
    .line 1647
    iget-object p0, p0, Ldefpackage/oc1;->d:Landroid/widget/Button;

    .line 1648
    .line 1649
    invoke-virtual {p0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1650
    .line 1651
    .line 1652
    goto :goto_1d

    .line 1653
    :pswitch_1d
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Ldefpackage/oc1;

    .line 1654
    .line 1655
    iget-object p0, p0, Ldefpackage/oc1;->d:Landroid/widget/Button;

    .line 1656
    .line 1657
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1658
    .line 1659
    .line 1660
    :goto_1d
    return-void

    .line 1661
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    :sswitch_data_0
    .sparse-switch
        -0x4a3e2ae1 -> :sswitch_3
        0x363632ef -> :sswitch_2
        0x3756b3da -> :sswitch_1
        0x430286f9 -> :sswitch_0
    .end sparse-switch

    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_1b
        :pswitch_1b
    .end packed-switch

    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    :sswitch_data_1
    .sparse-switch
        -0x4a3e2ae1 -> :sswitch_7
        0x363632ef -> :sswitch_6
        0x3756b3da -> :sswitch_5
        0x430286f9 -> :sswitch_4
    .end sparse-switch

    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1d
        :pswitch_1d
    .end packed-switch
.end method
