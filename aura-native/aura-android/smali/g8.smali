.class public final synthetic Lg8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg8;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lg8;->b:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

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
    .locals 7

    .line 1
    iget v0, p0, Lg8;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, Lg8;->b:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 14
    .line 15
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {v4}, Lkc1;->Z()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCoverArtId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-static {}, Lud3;->t()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-static {v1, p1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_0
    const/4 v1, 0x2

    .line 44
    invoke-static {p0, p1, v1, v0, v2}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {}, Lud3;->R()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Lvz3;

    .line 67
    .line 68
    :cond_1
    iget-object p1, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 69
    .line 70
    iget-object p1, p1, Lpc1;->j:Landroid/view/View;

    .line 71
    .line 72
    check-cast p1, Landroid/widget/ImageView;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void

    .line 78
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 79
    .line 80
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 81
    .line 82
    if-eqz p0, :cond_f

    .line 83
    .line 84
    if-eqz p1, :cond_f

    .line 85
    .line 86
    iget-object p0, p0, Lpc1;->n:Landroid/view/View;

    .line 87
    .line 88
    check-cast p0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 98
    .line 99
    iget-object p0, p0, Lpc1;->e:Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 109
    .line 110
    iget-object p0, p0, Lpc1;->c:Landroid/widget/TextView;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    .line 118
    .line 119
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 120
    .line 121
    iget-object p0, p0, Lpc1;->c:Landroid/widget/TextView;

    .line 122
    .line 123
    invoke-static {p0}, Ll93;->g(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtistId()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    if-eqz p0, :cond_4

    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtistId()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_3

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    const-string p0, "artist"

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtistId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-static {p0, v0}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    goto :goto_1

    .line 154
    :cond_4
    :goto_0
    move-object p0, v2

    .line 155
    :goto_1
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 156
    .line 157
    iget-object v0, v0, Lpc1;->c:Landroid/widget/TextView;

    .line 158
    .line 159
    new-instance v6, Li8;

    .line 160
    .line 161
    invoke-direct {v6, v5, v4, p0}, Li8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 165
    .line 166
    .line 167
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 168
    .line 169
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_5

    .line 176
    .line 177
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    goto :goto_2

    .line 186
    :cond_5
    const-string v0, ""

    .line 187
    .line 188
    :goto_2
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 196
    .line 197
    if-eqz p0, :cond_6

    .line 198
    .line 199
    iget-object p0, v0, Lpc1;->g:Landroid/widget/TextView;

    .line 200
    .line 201
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 202
    .line 203
    .line 204
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 205
    .line 206
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 207
    .line 208
    invoke-static {p0}, Ll93;->g(Landroid/view/View;)V

    .line 209
    .line 210
    .line 211
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 212
    .line 213
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 214
    .line 215
    new-instance v0, Lj8;

    .line 216
    .line 217
    invoke-direct {v0, v5, v4, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    .line 222
    .line 223
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 224
    .line 225
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 226
    .line 227
    new-instance v0, Li8;

    .line 228
    .line 229
    invoke-direct {v0, v3, v4, p1}, Li8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    iget-object p0, v0, Lpc1;->g:Landroid/widget/TextView;

    .line 237
    .line 238
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 239
    .line 240
    .line 241
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 242
    .line 243
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 244
    .line 245
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 246
    .line 247
    .line 248
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 249
    .line 250
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 251
    .line 252
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 253
    .line 254
    .line 255
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 256
    .line 257
    iget-object p0, p0, Lpc1;->g:Landroid/widget/TextView;

    .line 258
    .line 259
    invoke-static {p0}, Ll93;->p(Landroid/view/View;)V

    .line 260
    .line 261
    .line 262
    :goto_3
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 263
    .line 264
    iget-object p0, p0, Lpc1;->i:Landroid/view/View;

    .line 265
    .line 266
    check-cast p0, Landroid/widget/TextView;

    .line 267
    .line 268
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getSongCount()Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getDuration()Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    if-eqz v2, :cond_7

    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getDuration()Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    div-int/lit8 v2, v2, 0x3c

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_7
    move v2, v5

    .line 290
    :goto_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    const v2, 0x7f130050

    .line 299
    .line 300
    .line 301
    invoke-virtual {v4, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getGenre()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    if-eqz p0, :cond_8

    .line 313
    .line 314
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getGenre()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    if-nez p0, :cond_8

    .line 323
    .line 324
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 325
    .line 326
    iget-object p0, p0, Lpc1;->d:Landroid/widget/TextView;

    .line 327
    .line 328
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getGenre()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 336
    .line 337
    iget-object p0, p0, Lpc1;->d:Landroid/widget/TextView;

    .line 338
    .line 339
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_8
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 344
    .line 345
    iget-object p0, p0, Lpc1;->d:Landroid/widget/TextView;

    .line 346
    .line 347
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 348
    .line 349
    .line 350
    :goto_5
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    if-eqz p0, :cond_f

    .line 355
    .line 356
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    if-eqz p0, :cond_f

    .line 361
    .line 362
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    if-nez p0, :cond_a

    .line 371
    .line 372
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    if-eqz p0, :cond_9

    .line 381
    .line 382
    goto :goto_6

    .line 383
    :cond_9
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 384
    .line 385
    iget-object p0, p0, Lpc1;->h:Landroid/widget/TextView;

    .line 386
    .line 387
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 388
    .line 389
    .line 390
    goto :goto_7

    .line 391
    :cond_a
    :goto_6
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 392
    .line 393
    iget-object p0, p0, Lpc1;->h:Landroid/widget/TextView;

    .line 394
    .line 395
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 396
    .line 397
    .line 398
    :goto_7
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 399
    .line 400
    .line 401
    move-result-object p0

    .line 402
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    const v0, 0x7f13004d

    .line 407
    .line 408
    .line 409
    if-eqz p0, :cond_b

    .line 410
    .line 411
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    if-nez p0, :cond_d

    .line 420
    .line 421
    :cond_b
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 422
    .line 423
    iget-object p0, p0, Lpc1;->h:Landroid/widget/TextView;

    .line 424
    .line 425
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    if-eqz v1, :cond_c

    .line 430
    .line 431
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    :goto_8
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    goto :goto_9

    .line 440
    :cond_c
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    goto :goto_8

    .line 445
    :goto_9
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-virtual {v4, v0, v1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 454
    .line 455
    .line 456
    :cond_d
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    if-eqz p0, :cond_f

    .line 465
    .line 466
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    if-eqz p0, :cond_f

    .line 475
    .line 476
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getYear()Ljava/lang/Integer;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getYear()Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result p0

    .line 496
    if-eqz p0, :cond_e

    .line 497
    .line 498
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getMonth()Ljava/lang/Integer;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getMonth()Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result p0

    .line 518
    if-eqz p0, :cond_e

    .line 519
    .line 520
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getDay()Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getDay()Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-static {p0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result p0

    .line 540
    if-eqz p0, :cond_e

    .line 541
    .line 542
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 543
    .line 544
    iget-object p0, p0, Lpc1;->h:Landroid/widget/TextView;

    .line 545
    .line 546
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 547
    .line 548
    .line 549
    move-result-object p1

    .line 550
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object p1

    .line 558
    invoke-virtual {v4, v0, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 563
    .line 564
    .line 565
    goto :goto_a

    .line 566
    :cond_e
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 567
    .line 568
    iget-object p0, p0, Lpc1;->h:Landroid/widget/TextView;

    .line 569
    .line 570
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;->getFormattedDate()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object p1

    .line 586
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    const v0, 0x7f13004e

    .line 591
    .line 592
    .line 593
    invoke-virtual {v4, v0, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 598
    .line 599
    .line 600
    :cond_f
    :goto_a
    return-void

    .line 601
    :pswitch_1
    move-object v5, p1

    .line 602
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 603
    .line 604
    iget-object v2, p0, Lg8;->b:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 605
    .line 606
    iget-object p0, v2, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 607
    .line 608
    if-eqz p0, :cond_10

    .line 609
    .line 610
    if-eqz v5, :cond_10

    .line 611
    .line 612
    new-instance v0, Lni4;

    .line 613
    .line 614
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    const/4 v3, 0x0

    .line 619
    const/4 v4, 0x0

    .line 620
    invoke-direct/range {v0 .. v5}, Lni4;-><init>(Lle1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 621
    .line 622
    .line 623
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 624
    .line 625
    iget-object p0, v2, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 626
    .line 627
    iget-object p0, p0, Lpc1;->q:Landroid/view/View;

    .line 628
    .line 629
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 630
    .line 631
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 632
    .line 633
    .line 634
    iget-object p0, v2, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 635
    .line 636
    iget-object p1, v2, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 637
    .line 638
    iput-object p1, p0, Lni4;->A:Lbl2;

    .line 639
    .line 640
    invoke-virtual {v2}, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->h0()V

    .line 641
    .line 642
    .line 643
    iget-object p0, v2, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 644
    .line 645
    iget-object p0, p0, Ln8;->i:Lk03;

    .line 646
    .line 647
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    new-instance v0, Lg8;

    .line 652
    .line 653
    const/4 v1, 0x3

    .line 654
    invoke-direct {v0, v2, v1}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {p0, p1, v0}, Lad2;->e(Lba2;La83;)V

    .line 658
    .line 659
    .line 660
    :cond_10
    return-void

    .line 661
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 662
    .line 663
    invoke-virtual {v4}, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->i0()V

    .line 664
    .line 665
    .line 666
    if-nez p1, :cond_11

    .line 667
    .line 668
    invoke-virtual {v4}, Lkc1;->Z()Landroid/content/Context;

    .line 669
    .line 670
    .line 671
    move-result-object p0

    .line 672
    const p1, 0x7f130043

    .line 673
    .line 674
    .line 675
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 676
    .line 677
    .line 678
    move-result-object p0

    .line 679
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 680
    .line 681
    .line 682
    goto :goto_b

    .line 683
    :cond_11
    new-instance p0, Landroid/os/Bundle;

    .line 684
    .line 685
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 686
    .line 687
    .line 688
    const-string v0, "ARTIST_OBJECT"

    .line 689
    .line 690
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 695
    .line 696
    .line 697
    iget-object p1, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 698
    .line 699
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 700
    .line 701
    const v0, 0x7f0a003a

    .line 702
    .line 703
    .line 704
    invoke-virtual {p1, v0, p0, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 705
    .line 706
    .line 707
    :goto_b
    return-void

    .line 708
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 709
    .line 710
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 711
    .line 712
    if-eqz p0, :cond_13

    .line 713
    .line 714
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

    .line 715
    .line 716
    iget-object p0, p0, Lli3;->b:Lk03;

    .line 717
    .line 718
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object p0

    .line 722
    check-cast p0, Ljava/lang/String;

    .line 723
    .line 724
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 725
    .line 726
    if-eqz p1, :cond_12

    .line 727
    .line 728
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 729
    .line 730
    .line 731
    move-result p1

    .line 732
    if-eqz p1, :cond_12

    .line 733
    .line 734
    goto :goto_c

    .line 735
    :cond_12
    move v3, v5

    .line 736
    :goto_c
    invoke-virtual {v0, p0, v3}, Lni4;->s(Ljava/lang/String;Z)V

    .line 737
    .line 738
    .line 739
    :cond_13
    return-void

    .line 740
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 741
    .line 742
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 743
    .line 744
    invoke-virtual {p0, p1}, Lni4;->r(Ljava/util/List;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v4}, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->h0()V

    .line 748
    .line 749
    .line 750
    return-void

    .line 751
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 752
    .line 753
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 754
    .line 755
    if-eqz p0, :cond_14

    .line 756
    .line 757
    if-eqz p1, :cond_14

    .line 758
    .line 759
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 760
    .line 761
    .line 762
    move-result p0

    .line 763
    if-nez p0, :cond_14

    .line 764
    .line 765
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 766
    .line 767
    iget-object p0, p0, Lpc1;->l:Landroid/widget/TextView;

    .line 768
    .line 769
    check-cast p0, Landroid/widget/Button;

    .line 770
    .line 771
    new-instance v0, Lh8;

    .line 772
    .line 773
    invoke-direct {v0, v4, p1, v5}, Lh8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;Ljava/util/List;I)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 777
    .line 778
    .line 779
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 780
    .line 781
    iget-object p0, p0, Lpc1;->m:Landroid/widget/Button;

    .line 782
    .line 783
    new-instance v0, Lh8;

    .line 784
    .line 785
    invoke-direct {v0, v4, p1, v3}, Lh8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;Ljava/util/List;I)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 789
    .line 790
    .line 791
    :cond_14
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 792
    .line 793
    if-eqz p0, :cond_16

    .line 794
    .line 795
    if-eqz p1, :cond_15

    .line 796
    .line 797
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 798
    .line 799
    .line 800
    move-result p0

    .line 801
    if-eqz p0, :cond_16

    .line 802
    .line 803
    :cond_15
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 804
    .line 805
    iget-object p0, p0, Lpc1;->l:Landroid/widget/TextView;

    .line 806
    .line 807
    check-cast p0, Landroid/widget/Button;

    .line 808
    .line 809
    invoke-virtual {p0, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 810
    .line 811
    .line 812
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 813
    .line 814
    iget-object p0, p0, Lpc1;->m:Landroid/widget/Button;

    .line 815
    .line 816
    invoke-virtual {p0, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 817
    .line 818
    .line 819
    :cond_16
    return-void

    .line 820
    :pswitch_6
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;

    .line 821
    .line 822
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 823
    .line 824
    if-eqz p1, :cond_19

    .line 825
    .line 826
    if-eqz p0, :cond_17

    .line 827
    .line 828
    iget-object p0, p0, Lpc1;->f:Landroid/view/View;

    .line 829
    .line 830
    check-cast p0, Landroid/widget/TextView;

    .line 831
    .line 832
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 833
    .line 834
    .line 835
    :cond_17
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 836
    .line 837
    if-eqz p0, :cond_18

    .line 838
    .line 839
    iget-object p0, p0, Lpc1;->f:Landroid/view/View;

    .line 840
    .line 841
    check-cast p0, Landroid/widget/TextView;

    .line 842
    .line 843
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;->getNotes()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    invoke-static {v0}, Le03;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 852
    .line 853
    .line 854
    :cond_18
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 855
    .line 856
    if-eqz p0, :cond_1a

    .line 857
    .line 858
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;->getLastFmUrl()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object p0

    .line 862
    if-eqz p0, :cond_1a

    .line 863
    .line 864
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;->getLastFmUrl()Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    move-result-object p0

    .line 868
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 869
    .line 870
    .line 871
    move-result p0

    .line 872
    if-nez p0, :cond_1a

    .line 873
    .line 874
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 875
    .line 876
    iget-object p0, p0, Lpc1;->f:Landroid/view/View;

    .line 877
    .line 878
    check-cast p0, Landroid/widget/TextView;

    .line 879
    .line 880
    new-instance v0, Lj8;

    .line 881
    .line 882
    invoke-direct {v0, v3, v4, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 886
    .line 887
    .line 888
    goto :goto_d

    .line 889
    :cond_19
    if-eqz p0, :cond_1a

    .line 890
    .line 891
    iget-object p0, p0, Lpc1;->f:Landroid/view/View;

    .line 892
    .line 893
    check-cast p0, Landroid/widget/TextView;

    .line 894
    .line 895
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 896
    .line 897
    .line 898
    :cond_1a
    :goto_d
    return-void

    .line 899
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 900
    .line 901
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 902
    .line 903
    if-eqz p0, :cond_1c

    .line 904
    .line 905
    iget-object p0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

    .line 906
    .line 907
    iget-object p0, p0, Lli3;->c:Lk03;

    .line 908
    .line 909
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object p0

    .line 913
    check-cast p0, Ljava/lang/Boolean;

    .line 914
    .line 915
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 916
    .line 917
    if-eqz p0, :cond_1b

    .line 918
    .line 919
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 920
    .line 921
    .line 922
    move-result p0

    .line 923
    if-eqz p0, :cond_1b

    .line 924
    .line 925
    goto :goto_e

    .line 926
    :cond_1b
    move v3, v5

    .line 927
    :goto_e
    invoke-virtual {v0, p1, v3}, Lni4;->s(Ljava/lang/String;Z)V

    .line 928
    .line 929
    .line 930
    :cond_1c
    return-void

    .line 931
    :pswitch_data_0
    .packed-switch 0x0
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
