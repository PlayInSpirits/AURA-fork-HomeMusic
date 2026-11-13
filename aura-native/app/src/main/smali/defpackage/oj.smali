.class public final synthetic Ldefpackage/oj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/oj;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/oj;->b:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

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
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/oj;->a:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x3

    .line 6
    const/16 v4, 0x8

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object p0, p0, Ldefpackage/oj;->b:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    iget-object p0, v0, Ldefpackage/sc1;->u:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;->getSimilarArtists()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 37
    .line 38
    iget-object v0, v0, Ldefpackage/sc1;->u:Landroid/widget/LinearLayout;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;->getSimilarArtists()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    move v4, v5

    .line 51
    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;->getSimilarArtists()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;->getSimilarArtists()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->s0:Ldefpackage/s6;

    .line 73
    .line 74
    iput-object v0, p0, Ldefpackage/s6;->r:Ljava/util/List;

    .line 75
    .line 76
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_0
    return-void

    .line 80
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 81
    .line 82
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 83
    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    iget-object v0, v0, Ldefpackage/sc1;->g:Landroid/widget/LinearLayout;

    .line 87
    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_5

    .line 95
    .line 96
    move v2, v5

    .line 97
    goto :goto_1

    .line 98
    :cond_5
    move v2, v4

    .line 99
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 105
    .line 106
    iget-object v0, v0, Ldefpackage/sc1;->e:Landroid/widget/TextView;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-le v2, v1, :cond_6

    .line 113
    .line 114
    move v4, v5

    .line 115
    :cond_6
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->r0:Ldefpackage/l7;

    .line 119
    .line 120
    iput-object p1, v0, Ldefpackage/l7;->r:Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {v0}, Ldefpackage/dw3;->d()V

    .line 123
    .line 124
    .line 125
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 126
    .line 127
    iget-object v0, v0, Ldefpackage/sc1;->e:Landroid/widget/TextView;

    .line 128
    .line 129
    new-instance v1, Ldefpackage/j8;

    .line 130
    .line 131
    invoke-direct {v1, v3, p0, p1}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    .line 136
    .line 137
    :cond_7
    return-void

    .line 138
    :pswitch_1
    check-cast p1, Ljava/util/Map;

    .line 139
    .line 140
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 141
    .line 142
    if-eqz v0, :cond_9

    .line 143
    .line 144
    iget-object v0, v0, Ldefpackage/sc1;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 145
    .line 146
    if-eqz p1, :cond_8

    .line 147
    .line 148
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_8

    .line 153
    .line 154
    move v4, v5

    .line 155
    :cond_8
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 156
    .line 157
    .line 158
    if-eqz p1, :cond_9

    .line 159
    .line 160
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->q0:Ldefpackage/v8;

    .line 161
    .line 162
    iput-object p1, p0, Ldefpackage/v8;->s:Ljava/util/Map;

    .line 163
    .line 164
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 165
    .line 166
    .line 167
    :cond_9
    return-void

    .line 168
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 169
    .line 170
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Ldefpackage/ni4;

    .line 171
    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Ldefpackage/li3;

    .line 175
    .line 176
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 177
    .line 178
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    check-cast v0, Ljava/lang/String;

    .line 183
    .line 184
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Ldefpackage/ni4;

    .line 185
    .line 186
    if-eqz p1, :cond_a

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_a

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_a
    move v2, v5

    .line 196
    :goto_2
    invoke-virtual {p0, v0, v2}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 197
    .line 198
    .line 199
    :cond_b
    return-void

    .line 200
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 201
    .line 202
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->w0:Landroid/os/Handler;

    .line 203
    .line 204
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->x0:Ldefpackage/a0;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 214
    .line 215
    if-eqz v2, :cond_c

    .line 216
    .line 217
    iget-object p1, v6, Ldefpackage/sc1;->k:Landroid/widget/LinearLayout;

    .line 218
    .line 219
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 223
    .line 224
    iget-object p1, p1, Ldefpackage/sc1;->p:Landroid/widget/LinearLayout;

    .line 225
    .line 226
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 230
    .line 231
    iget-object p1, p1, Ldefpackage/sc1;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 237
    .line 238
    iget-object p1, p1, Ldefpackage/sc1;->r:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 239
    .line 240
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 241
    .line 242
    .line 243
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 244
    .line 245
    iget-object p0, p0, Ldefpackage/sc1;->q:Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    const-wide/16 p0, 0xbb8

    .line 251
    .line 252
    invoke-virtual {v0, v1, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_c
    iget-object v0, v6, Ldefpackage/sc1;->t:Landroid/widget/TextView;

    .line 257
    .line 258
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 262
    .line 263
    iget-object v0, v0, Ldefpackage/sc1;->k:Landroid/widget/LinearLayout;

    .line 264
    .line 265
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 266
    .line 267
    .line 268
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 269
    .line 270
    iget-object v0, v0, Ldefpackage/sc1;->p:Landroid/widget/LinearLayout;

    .line 271
    .line 272
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 273
    .line 274
    .line 275
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 276
    .line 277
    iget-object v0, v0, Ldefpackage/sc1;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 278
    .line 279
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 280
    .line 281
    .line 282
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 283
    .line 284
    iget-object v0, v0, Ldefpackage/sc1;->r:Lcom/facebook/shimmer/ShimmerFrameLayout;

    .line 285
    .line 286
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 287
    .line 288
    .line 289
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 290
    .line 291
    iget-object v0, v0, Ldefpackage/sc1;->q:Landroid/widget/TextView;

    .line 292
    .line 293
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 294
    .line 295
    .line 296
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 297
    .line 298
    iget-object v0, v0, Ldefpackage/sc1;->t:Landroid/widget/TextView;

    .line 299
    .line 300
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-le v1, v3, :cond_d

    .line 305
    .line 306
    move v4, v5

    .line 307
    :cond_d
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 308
    .line 309
    .line 310
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Ldefpackage/ni4;

    .line 311
    .line 312
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    const-wide/16 v1, 0x3

    .line 317
    .line 318
    invoke-interface {p1, v1, v2}, Ljava/util/stream/Stream;->limit(J)Ljava/util/stream/Stream;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    check-cast p1, Ljava/util/List;

    .line 331
    .line 332
    invoke-virtual {v0, p1}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->i0()V

    .line 336
    .line 337
    .line 338
    :goto_3
    return-void

    .line 339
    :pswitch_4
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;

    .line 340
    .line 341
    if-nez p1, :cond_e

    .line 342
    .line 343
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 344
    .line 345
    if-eqz p0, :cond_17

    .line 346
    .line 347
    iget-object p0, p0, Ldefpackage/sc1;->h:Landroid/widget/LinearLayout;

    .line 348
    .line 349
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 350
    .line 351
    .line 352
    goto/16 :goto_8

    .line 353
    .line 354
    :cond_e
    invoke-virtual {p0}, Ldefpackage/kc1;->n()Landroid/content/Context;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_12

    .line 359
    .line 360
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 361
    .line 362
    if-eqz v0, :cond_12

    .line 363
    .line 364
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Ldefpackage/wj;

    .line 365
    .line 366
    iget-object v0, v0, Ldefpackage/wj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 367
    .line 368
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    if-eqz v6, :cond_f

    .line 373
    .line 374
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    if-nez v6, :cond_f

    .line 387
    .line 388
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    goto :goto_4

    .line 393
    :cond_f
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    :goto_4
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v7

    .line 408
    if-eqz v7, :cond_10

    .line 409
    .line 410
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    if-eqz v7, :cond_10

    .line 415
    .line 416
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v7

    .line 424
    if-nez v7, :cond_10

    .line 425
    .line 426
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    goto :goto_5

    .line 431
    :cond_10
    const/4 v0, 0x0

    .line 432
    :goto_5
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    invoke-static {v7}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 437
    .line 438
    .line 439
    move-result-object v8

    .line 440
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    invoke-static {v9, v6}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    invoke-static {v7, v6, v3, v8, v9}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-virtual {v3, v6}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 461
    .line 462
    .line 463
    move-result v6

    .line 464
    if-eqz v6, :cond_11

    .line 465
    .line 466
    invoke-virtual {v3}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, Ldefpackage/vz3;

    .line 471
    .line 472
    :cond_11
    new-instance v6, Ldefpackage/rj;

    .line 473
    .line 474
    invoke-direct {v6, p0, v0}, Ldefpackage/rj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v3, v6}, Ldefpackage/vz3;->L(Ldefpackage/rj;)Ldefpackage/vz3;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 482
    .line 483
    iget-object v3, v3, Ldefpackage/sc1;->f:Landroid/widget/ImageView;

    .line 484
    .line 485
    invoke-virtual {v0, v3}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 486
    .line 487
    .line 488
    :cond_12
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 489
    .line 490
    if-eqz v0, :cond_17

    .line 491
    .line 492
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfoBase;->getBiography()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-static {v0}, Ldefpackage/e03;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfoBase;->getLastFmUrl()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 509
    .line 510
    .line 511
    move-result v6

    .line 512
    iget-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 513
    .line 514
    if-eqz v6, :cond_13

    .line 515
    .line 516
    iget-object v6, v7, Ldefpackage/sc1;->m:Landroid/widget/TextView;

    .line 517
    .line 518
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 519
    .line 520
    .line 521
    goto :goto_6

    .line 522
    :cond_13
    iget-object v6, v7, Ldefpackage/sc1;->m:Landroid/widget/TextView;

    .line 523
    .line 524
    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 525
    .line 526
    .line 527
    :goto_6
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 528
    .line 529
    if-nez v3, :cond_14

    .line 530
    .line 531
    iget-object p1, v6, Ldefpackage/sc1;->l:Landroid/widget/TextView;

    .line 532
    .line 533
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 534
    .line 535
    .line 536
    goto :goto_7

    .line 537
    :cond_14
    iget-object v6, v6, Ldefpackage/sc1;->l:Landroid/widget/TextView;

    .line 538
    .line 539
    new-instance v7, Ldefpackage/j8;

    .line 540
    .line 541
    const/4 v8, 0x4

    .line 542
    invoke-direct {v7, v8, p0, p1}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 546
    .line 547
    .line 548
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 549
    .line 550
    iget-object p1, p1, Ldefpackage/sc1;->l:Landroid/widget/TextView;

    .line 551
    .line 552
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 553
    .line 554
    .line 555
    :goto_7
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result p1

    .line 559
    if-eqz p1, :cond_15

    .line 560
    .line 561
    if-eqz v3, :cond_17

    .line 562
    .line 563
    :cond_15
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 564
    .line 565
    iget-object p1, p1, Ldefpackage/sc1;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 566
    .line 567
    const v0, 0x7f0a0137

    .line 568
    .line 569
    .line 570
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    check-cast p1, Landroid/widget/Button;

    .line 575
    .line 576
    new-instance v0, Ldefpackage/pj;

    .line 577
    .line 578
    invoke-direct {v0, p0, v1}, Ldefpackage/pj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 582
    .line 583
    .line 584
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 585
    .line 586
    .line 587
    move-result-object p1

    .line 588
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 592
    .line 593
    .line 594
    move-result-object p1

    .line 595
    const-string v0, "artist_display_biography"

    .line 596
    .line 597
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 598
    .line 599
    .line 600
    move-result p1

    .line 601
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Ldefpackage/sc1;

    .line 602
    .line 603
    iget-object p0, p0, Ldefpackage/sc1;->h:Landroid/widget/LinearLayout;

    .line 604
    .line 605
    if-eqz p1, :cond_16

    .line 606
    .line 607
    move v4, v5

    .line 608
    :cond_16
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 609
    .line 610
    .line 611
    :cond_17
    :goto_8
    return-void

    .line 612
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 613
    .line 614
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Ldefpackage/ni4;

    .line 615
    .line 616
    if-eqz v0, :cond_19

    .line 617
    .line 618
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->o0:Ldefpackage/li3;

    .line 619
    .line 620
    iget-object v0, v0, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 621
    .line 622
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    check-cast v0, Ljava/lang/Boolean;

    .line 627
    .line 628
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->p0:Ldefpackage/ni4;

    .line 629
    .line 630
    if-eqz v0, :cond_18

    .line 631
    .line 632
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    if-eqz v0, :cond_18

    .line 637
    .line 638
    goto :goto_9

    .line 639
    :cond_18
    move v2, v5

    .line 640
    :goto_9
    invoke-virtual {p0, p1, v2}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 641
    .line 642
    .line 643
    :cond_19
    return-void

    .line 644
    nop

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
