.class public final synthetic Lu7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Laf;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkc1;


# direct methods
.method public synthetic constructor <init>(ILkc1;)V
    .locals 0

    .line 1
    iput p1, p0, Lu7;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lu7;->b:Lkc1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget v0, p0, Lu7;->a:I

    .line 2
    .line 3
    const v1, 0x7f1300fa

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu7;->b:Lkc1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, v0, Lup0;->a:Landroid/view/ViewGroup;

    .line 19
    .line 20
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, p1

    .line 27
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 28
    .line 29
    iget-object p1, p1, Lup0;->i:Landroid/view/View;

    .line 30
    .line 31
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 32
    .line 33
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    mul-int/lit8 p1, p1, 0x2

    .line 40
    .line 41
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 42
    .line 43
    if-ge v0, p1, :cond_1

    .line 44
    .line 45
    iget-object p1, v2, Lup0;->i:Landroid/view/View;

    .line 46
    .line 47
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 48
    .line 49
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 50
    .line 51
    iget-object p0, p0, Lui4;->f:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object p0, v2, Lup0;->i:Landroid/view/View;

    .line 58
    .line 59
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 66
    .line 67
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v0, v0, Lbq4;->p:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    add-int/2addr v0, p1

    .line 81
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 82
    .line 83
    iget-object p1, p1, Lbq4;->q:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 86
    .line 87
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    mul-int/lit8 p1, p1, 0x2

    .line 94
    .line 95
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 96
    .line 97
    if-ge v0, p1, :cond_3

    .line 98
    .line 99
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 102
    .line 103
    const p1, 0x7f130413

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 113
    .line 114
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 115
    .line 116
    .line 117
    :goto_1
    return-void

    .line 118
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;

    .line 119
    .line 120
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Lrc1;

    .line 121
    .line 122
    if-nez v0, :cond_4

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    iget-object v0, v0, Lrc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    add-int/2addr v0, p1

    .line 132
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Lrc1;

    .line 133
    .line 134
    iget-object p1, p1, Lrc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 135
    .line 136
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    mul-int/lit8 p1, p1, 0x2

    .line 143
    .line 144
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Lrc1;

    .line 145
    .line 146
    if-ge v0, p1, :cond_5

    .line 147
    .line 148
    iget-object p0, p0, Lrc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 149
    .line 150
    const p1, 0x7f1303e0

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    iget-object p0, p0, Lrc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 158
    .line 159
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 160
    .line 161
    .line 162
    :goto_2
    return-void

    .line 163
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 164
    .line 165
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 166
    .line 167
    if-nez v0, :cond_6

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_6
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    add-int/2addr v0, p1

    .line 179
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 180
    .line 181
    iget-object p1, p1, Lml3;->f:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 184
    .line 185
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    mul-int/lit8 p1, p1, 0x2

    .line 192
    .line 193
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 194
    .line 195
    if-ge v0, p1, :cond_7

    .line 196
    .line 197
    iget-object p0, p0, Lml3;->f:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 200
    .line 201
    const p1, 0x7f1302f7

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_7
    iget-object p0, p0, Lml3;->f:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 211
    .line 212
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 213
    .line 214
    .line 215
    :goto_3
    return-void

    .line 216
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 217
    .line 218
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ley;

    .line 219
    .line 220
    if-nez v0, :cond_8

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_8
    iget-object v0, v0, Ley;->e:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 226
    .line 227
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    add-int/2addr v0, p1

    .line 232
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ley;

    .line 233
    .line 234
    iget-object p1, p1, Ley;->h:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 237
    .line 238
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 239
    .line 240
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    mul-int/lit8 p1, p1, 0x2

    .line 245
    .line 246
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->l0:Ley;

    .line 247
    .line 248
    if-ge v0, p1, :cond_a

    .line 249
    .line 250
    iget-object p1, v2, Ley;->h:Ljava/lang/Object;

    .line 251
    .line 252
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 253
    .line 254
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->n0:Lwx1;

    .line 255
    .line 256
    iget-object p0, p0, Lwx1;->d:Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 257
    .line 258
    if-eqz p0, :cond_9

    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    goto :goto_4

    .line 265
    :cond_9
    const-string p0, ""

    .line 266
    .line 267
    :goto_4
    invoke-virtual {p1, p0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_a
    iget-object p0, v2, Ley;->h:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 274
    .line 275
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 276
    .line 277
    .line 278
    :goto_5
    return-void

    .line 279
    :pswitch_4
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 280
    .line 281
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Lml3;

    .line 282
    .line 283
    if-nez v0, :cond_b

    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_b
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 289
    .line 290
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    add-int/2addr v0, p1

    .line 295
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Lml3;

    .line 296
    .line 297
    iget-object p1, p1, Lml3;->f:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 300
    .line 301
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 302
    .line 303
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    mul-int/lit8 p1, p1, 0x2

    .line 308
    .line 309
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Lml3;

    .line 310
    .line 311
    if-ge v0, p1, :cond_c

    .line 312
    .line 313
    iget-object p0, p0, Lml3;->f:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 316
    .line 317
    const p1, 0x7f130162

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_6

    .line 324
    :cond_c
    iget-object p0, p0, Lml3;->f:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 327
    .line 328
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 329
    .line 330
    .line 331
    :goto_6
    return-void

    .line 332
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;

    .line 333
    .line 334
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 335
    .line 336
    if-nez v0, :cond_d

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_d
    iget-object v0, v0, Llv4;->r:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 342
    .line 343
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    add-int/2addr v0, p1

    .line 348
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 349
    .line 350
    iget-object p1, p1, Llv4;->t:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 353
    .line 354
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 355
    .line 356
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    mul-int/lit8 p1, p1, 0x2

    .line 361
    .line 362
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 363
    .line 364
    if-ge v0, p1, :cond_e

    .line 365
    .line 366
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 369
    .line 370
    const p1, 0x7f130151

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_e
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 380
    .line 381
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 382
    .line 383
    .line 384
    :goto_7
    return-void

    .line 385
    :pswitch_6
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

    .line 386
    .line 387
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Loc1;

    .line 388
    .line 389
    if-nez v0, :cond_f

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_f
    iget-object v0, v0, Loc1;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 393
    .line 394
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    add-int/2addr v0, p1

    .line 399
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Loc1;

    .line 400
    .line 401
    iget-object p1, p1, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 402
    .line 403
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 404
    .line 405
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 406
    .line 407
    .line 408
    move-result p1

    .line 409
    mul-int/lit8 p1, p1, 0x2

    .line 410
    .line 411
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Loc1;

    .line 412
    .line 413
    if-ge v0, p1, :cond_10

    .line 414
    .line 415
    iget-object p0, p0, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 416
    .line 417
    const p1, 0x7f130065

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 421
    .line 422
    .line 423
    goto :goto_8

    .line 424
    :cond_10
    iget-object p0, p0, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 425
    .line 426
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 427
    .line 428
    .line 429
    :goto_8
    return-void

    .line 430
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 431
    .line 432
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Lrc1;

    .line 433
    .line 434
    if-nez v0, :cond_11

    .line 435
    .line 436
    goto :goto_9

    .line 437
    :cond_11
    iget-object v0, v0, Lrc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 438
    .line 439
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    add-int/2addr v0, p1

    .line 444
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Lrc1;

    .line 445
    .line 446
    iget-object p1, p1, Lrc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 447
    .line 448
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 449
    .line 450
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 451
    .line 452
    .line 453
    move-result p1

    .line 454
    mul-int/lit8 p1, p1, 0x2

    .line 455
    .line 456
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Lrc1;

    .line 457
    .line 458
    if-ge v0, p1, :cond_12

    .line 459
    .line 460
    iget-object p0, p0, Lrc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 461
    .line 462
    const p1, 0x7f13005f

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 466
    .line 467
    .line 468
    goto :goto_9

    .line 469
    :cond_12
    iget-object p0, p0, Lrc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 470
    .line 471
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 472
    .line 473
    .line 474
    :goto_9
    return-void

    .line 475
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

    .line 476
    .line 477
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 478
    .line 479
    if-nez v0, :cond_13

    .line 480
    .line 481
    goto :goto_a

    .line 482
    :cond_13
    iget-object v0, v0, Loc1;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 483
    .line 484
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    add-int/2addr v0, p1

    .line 489
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 490
    .line 491
    iget-object p1, p1, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 492
    .line 493
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 494
    .line 495
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 496
    .line 497
    .line 498
    move-result p1

    .line 499
    mul-int/lit8 p1, p1, 0x2

    .line 500
    .line 501
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 502
    .line 503
    if-ge v0, p1, :cond_14

    .line 504
    .line 505
    iget-object p0, p0, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 506
    .line 507
    const p1, 0x7f13004a

    .line 508
    .line 509
    .line 510
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 511
    .line 512
    .line 513
    goto :goto_a

    .line 514
    :cond_14
    iget-object p0, p0, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 515
    .line 516
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 517
    .line 518
    .line 519
    :goto_a
    return-void

    .line 520
    :pswitch_9
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 521
    .line 522
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Llv4;

    .line 523
    .line 524
    if-nez v0, :cond_15

    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_15
    iget-object v0, v0, Llv4;->o:Ljava/lang/Object;

    .line 528
    .line 529
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 530
    .line 531
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 532
    .line 533
    .line 534
    move-result v0

    .line 535
    add-int/2addr v0, p1

    .line 536
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Llv4;

    .line 537
    .line 538
    iget-object p1, p1, Llv4;->t:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 541
    .line 542
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 543
    .line 544
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 545
    .line 546
    .line 547
    move-result p1

    .line 548
    mul-int/lit8 p1, p1, 0x2

    .line 549
    .line 550
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Llv4;

    .line 551
    .line 552
    if-ge v0, p1, :cond_16

    .line 553
    .line 554
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 557
    .line 558
    const p1, 0x7f130041

    .line 559
    .line 560
    .line 561
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 562
    .line 563
    .line 564
    goto :goto_b

    .line 565
    :cond_16
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 568
    .line 569
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 570
    .line 571
    .line 572
    :goto_b
    return-void

    .line 573
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
