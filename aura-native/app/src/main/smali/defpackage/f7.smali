.class public final synthetic Ldefpackage/f7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/f7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/f7;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/f7;->c:Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/f7;->a:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ldefpackage/f7;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/f7;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Ldefpackage/im3;

    .line 13
    .line 14
    check-cast v3, Ldefpackage/k03;

    .line 15
    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v0, Ldefpackage/tj;

    .line 26
    .line 27
    invoke-direct {v0, v1, p0}, Ldefpackage/tj;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {v3, p0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_0
    check-cast p0, Ldefpackage/aj3;

    .line 43
    .line 44
    check-cast v3, Ljava/lang/String;

    .line 45
    .line 46
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 47
    .line 48
    iget-object v0, p0, Ldefpackage/aj3;->u:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    iget-object p0, p0, Ldefpackage/aj3;->n:Ldefpackage/k03;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void

    .line 62
    :pswitch_1
    check-cast p0, Ldefpackage/cp1;

    .line 63
    .line 64
    check-cast v3, [Z

    .line 65
    .line 66
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    aget-boolean v0, v3, v2

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    new-instance v0, Landroid/os/Handler;

    .line 82
    .line 83
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Ldefpackage/v6;

    .line 91
    .line 92
    const/16 v2, 0xe

    .line 93
    .line 94
    invoke-direct {v1, p0, v3, p1, v2}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    const-wide/16 p0, 0x12c

    .line 98
    .line 99
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_0
    return-void

    .line 103
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 104
    .line 105
    check-cast v3, Ljava/util/List;

    .line 106
    .line 107
    check-cast p1, Ljava/util/ArrayList;

    .line 108
    .line 109
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 110
    .line 111
    iget-object v0, v0, Ldefpackage/up0;->f:Landroid/view/View;

    .line 112
    .line 113
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 114
    .line 115
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 116
    .line 117
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    const/4 v5, 0x1

    .line 121
    invoke-direct {v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    sub-int/2addr v0, v5

    .line 132
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    const/4 v7, 0x3

    .line 150
    const-string v8, "download_type_album"

    .line 151
    .line 152
    const-string v9, "download_type_track"

    .line 153
    .line 154
    const/4 v10, -0x1

    .line 155
    sparse-switch v6, :sswitch_data_0

    .line 156
    .line 157
    .line 158
    :goto_1
    move v1, v10

    .line 159
    goto :goto_2

    .line 160
    :sswitch_0
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_3

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_3
    const/4 v1, 0x5

    .line 168
    goto :goto_2

    .line 169
    :sswitch_1
    const-string v6, "download_type_genre"

    .line 170
    .line 171
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-nez v4, :cond_8

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :sswitch_2
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_4

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_4
    move v1, v7

    .line 186
    goto :goto_2

    .line 187
    :sswitch_3
    const-string v1, "download_type_playlist"

    .line 188
    .line 189
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_5

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_5
    const/4 v1, 0x2

    .line 197
    goto :goto_2

    .line 198
    :sswitch_4
    const-string v1, "download_type_year"

    .line 199
    .line 200
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-nez v1, :cond_6

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_6
    move v1, v5

    .line 208
    goto :goto_2

    .line 209
    :sswitch_5
    const-string v1, "download_type_artist"

    .line 210
    .line 211
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_7

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_7
    move v1, v2

    .line 219
    :cond_8
    :goto_2
    packed-switch v1, :pswitch_data_1

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :pswitch_3
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Ldefpackage/ft0;

    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getView()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v1, v9, v4, v0, v3}, Ldefpackage/ft0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :pswitch_4
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Ldefpackage/ft0;

    .line 238
    .line 239
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getView()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v1, v9, v4, v0, v3}, Ldefpackage/ft0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :pswitch_5
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Ldefpackage/ft0;

    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getView()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v1, v9, v4, v0, v3}, Ldefpackage/ft0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :pswitch_6
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Ldefpackage/ft0;

    .line 266
    .line 267
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getView()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v1, v9, v4, v0, v3}, Ldefpackage/ft0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 276
    .line 277
    .line 278
    goto :goto_3

    .line 279
    :pswitch_7
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Ldefpackage/ft0;

    .line 280
    .line 281
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getView()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-virtual {v1, v9, v4, v0, v3}, Ldefpackage/ft0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :pswitch_8
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Ldefpackage/ft0;

    .line 294
    .line 295
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getId()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/DownloadStack;->getView()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v1, v8, v4, v0, v3}, Ldefpackage/ft0;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 304
    .line 305
    .line 306
    :goto_3
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 307
    .line 308
    iget-object v0, v0, Ldefpackage/up0;->d:Landroid/view/View;

    .line 309
    .line 310
    check-cast v0, Landroid/widget/ImageView;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-le v1, v5, :cond_9

    .line 317
    .line 318
    goto :goto_4

    .line 319
    :cond_9
    const/16 v2, 0x8

    .line 320
    .line 321
    :goto_4
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 325
    .line 326
    .line 327
    move-result p1

    .line 328
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v0}, Ldefpackage/l70;->i()Ldefpackage/a93;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    new-instance v2, Ldefpackage/xs0;

    .line 341
    .line 342
    invoke-direct {v2, p0, p1}, Ldefpackage/xs0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1, v2}, Ldefpackage/a93;->a(Ldefpackage/ba2;Ldefpackage/v83;)V

    .line 346
    .line 347
    .line 348
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Ldefpackage/up0;

    .line 349
    .line 350
    iget-object p1, p1, Ldefpackage/up0;->i:Landroid/view/View;

    .line 351
    .line 352
    check-cast p1, Landroid/widget/TextView;

    .line 353
    .line 354
    new-instance v0, Ldefpackage/ws0;

    .line 355
    .line 356
    invoke-direct {v0, p0, v7}, Ldefpackage/ws0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :pswitch_9
    move-object v2, p0

    .line 364
    check-cast v2, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 365
    .line 366
    move-object p0, v3

    .line 367
    check-cast p0, Landroid/widget/TextView;

    .line 368
    .line 369
    move-object v5, p1

    .line 370
    check-cast v5, Ljava/util/List;

    .line 371
    .line 372
    invoke-static {v5}, Ldefpackage/gi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-interface {v5}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    new-instance v0, Ldefpackage/hu3;

    .line 381
    .line 382
    const/4 v1, 0x6

    .line 383
    invoke-direct {v0, v1}, Ldefpackage/hu3;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    move-object v4, p1

    .line 399
    check-cast v4, Ljava/util/List;

    .line 400
    .line 401
    new-instance v1, Ldefpackage/a7;

    .line 402
    .line 403
    const/4 v6, 0x0

    .line 404
    invoke-direct/range {v1 .. v6}, Ldefpackage/a7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method
