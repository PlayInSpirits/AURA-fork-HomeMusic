.class public Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Loc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lf8;

.field public o0:Lb8;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->d0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final G(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .line 1
    const v0, 0x7f0f0001

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 5
    .line 6
    .line 7
    const p2, 0x7f0a0084

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroidx/appcompat/widget/SearchView;

    .line 19
    .line 20
    const/4 p2, 0x6

    .line 21
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Lrm3;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Lrm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Lu74;)V

    .line 30
    .line 31
    .line 32
    const/16 p0, -0x20

    .line 33
    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-virtual {p1, p0, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lkc1;->l()Lnc1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v1, 0x7f0d0062

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move-object/from16 v3, p1

    .line 16
    .line 17
    move-object/from16 v4, p2

    .line 18
    .line 19
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v3, 0x7f0a00ae

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    move-object v7, v4

    .line 31
    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v7, :cond_13

    .line 35
    .line 36
    const v3, 0x7f0a00b1

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    move-object v8, v5

    .line 44
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    if-eqz v8, :cond_13

    .line 47
    .line 48
    const v3, 0x7f0a00b2

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    move-object v9, v5

    .line 56
    check-cast v9, Landroid/widget/Button;

    .line 57
    .line 58
    if-eqz v9, :cond_13

    .line 59
    .line 60
    const v3, 0x7f0a00da

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    move-object v10, v5

    .line 68
    check-cast v10, Lcom/google/android/material/appbar/AppBarLayout;

    .line 69
    .line 70
    if-eqz v10, :cond_13

    .line 71
    .line 72
    const v3, 0x7f0a0448

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v11, v5

    .line 80
    check-cast v11, Landroid/widget/TextView;

    .line 81
    .line 82
    if-eqz v11, :cond_13

    .line 83
    .line 84
    const v3, 0x7f0a0449

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    move-object v12, v5

    .line 92
    check-cast v12, Landroid/widget/TextView;

    .line 93
    .line 94
    if-eqz v12, :cond_13

    .line 95
    .line 96
    const v3, 0x7f0a061b

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    move-object v13, v5

    .line 104
    check-cast v13, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 105
    .line 106
    if-eqz v13, :cond_13

    .line 107
    .line 108
    new-instance v5, Loc1;

    .line 109
    .line 110
    move-object v6, v1

    .line 111
    check-cast v6, Landroid/widget/LinearLayout;

    .line 112
    .line 113
    invoke-direct/range {v5 .. v13}, Loc1;-><init>(Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Lcom/google/android/material/appbar/AppBarLayout;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 114
    .line 115
    .line 116
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 117
    .line 118
    invoke-virtual {v0}, Lkc1;->d()Le75;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-static {v0}, Lgh0;->r(Lf75;)Lb75;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-static {v0}, Lgh0;->q(Lf75;)Ltf0;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v7, Lbq4;

    .line 137
    .line 138
    invoke-direct {v7, v1, v3, v5}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 139
    .line 140
    .line 141
    const-class v1, Lf8;

    .line 142
    .line 143
    invoke-static {v1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v1}, Li30;->b()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-eqz v3, :cond_12

    .line 152
    .line 153
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 154
    .line 155
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v7, v1, v3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Lf8;

    .line 164
    .line 165
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 166
    .line 167
    iget-object v1, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 168
    .line 169
    if-nez v1, :cond_1

    .line 170
    .line 171
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 172
    .line 173
    if-eqz v0, :cond_0

    .line 174
    .line 175
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 176
    .line 177
    if-eqz v0, :cond_0

    .line 178
    .line 179
    invoke-virtual {v0}, Lv23;->o()V

    .line 180
    .line 181
    .line 182
    :cond_0
    return-object v6

    .line 183
    :cond_1
    const-string v3, "ALBUM_RECENTLY_PLAYED"

    .line 184
    .line 185
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const-string v7, "ALBUM_MOST_PLAYED"

    .line 190
    .line 191
    const-string v8, "ALBUM_RECENTLY_ADDED"

    .line 192
    .line 193
    const-string v9, "ALBUM_STARRED"

    .line 194
    .line 195
    const-string v10, "ALBUM_NEW_RELEASES"

    .line 196
    .line 197
    const-string v11, "ALBUM_FROM_ARTIST"

    .line 198
    .line 199
    const-string v12, "ALBUM_DOWNLOADED"

    .line 200
    .line 201
    if-eqz v5, :cond_2

    .line 202
    .line 203
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 204
    .line 205
    iput-object v3, v1, Lf8;->d:Ljava/lang/String;

    .line 206
    .line 207
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 208
    .line 209
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 210
    .line 211
    const v5, 0x7f130048

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_2
    invoke-virtual {v1, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    if-eqz v5, :cond_3

    .line 224
    .line 225
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 226
    .line 227
    iput-object v7, v1, Lf8;->d:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 230
    .line 231
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 232
    .line 233
    const v5, 0x7f130045

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :cond_3
    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    if-eqz v5, :cond_4

    .line 246
    .line 247
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 248
    .line 249
    iput-object v8, v1, Lf8;->d:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 252
    .line 253
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 254
    .line 255
    const v5, 0x7f130047

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_4
    invoke-virtual {v1, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    if-eqz v5, :cond_5

    .line 268
    .line 269
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 270
    .line 271
    iput-object v9, v1, Lf8;->d:Ljava/lang/String;

    .line 272
    .line 273
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 274
    .line 275
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 276
    .line 277
    const v5, 0x7f130049

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_5
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    if-eqz v5, :cond_6

    .line 290
    .line 291
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 292
    .line 293
    iput-object v10, v1, Lf8;->d:Ljava/lang/String;

    .line 294
    .line 295
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 296
    .line 297
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 298
    .line 299
    const v5, 0x7f130046

    .line 300
    .line 301
    .line 302
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 303
    .line 304
    .line 305
    goto :goto_0

    .line 306
    :cond_6
    invoke-virtual {v1, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    if-eqz v5, :cond_7

    .line 311
    .line 312
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 313
    .line 314
    iput-object v12, v1, Lf8;->d:Ljava/lang/String;

    .line 315
    .line 316
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 317
    .line 318
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 319
    .line 320
    const v5, 0x7f130044

    .line 321
    .line 322
    .line 323
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(I)V

    .line 324
    .line 325
    .line 326
    goto :goto_0

    .line 327
    :cond_7
    const-string v5, "ARTIST_OBJECT"

    .line 328
    .line 329
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    if-eqz v13, :cond_8

    .line 334
    .line 335
    iget-object v13, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 336
    .line 337
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 342
    .line 343
    iput-object v1, v13, Lf8;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 344
    .line 345
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 346
    .line 347
    iput-object v11, v1, Lf8;->d:Ljava/lang/String;

    .line 348
    .line 349
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 350
    .line 351
    iget-object v5, v5, Loc1;->f:Landroid/widget/TextView;

    .line 352
    .line 353
    iget-object v1, v1, Lf8;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 354
    .line 355
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    goto :goto_0

    .line 363
    :cond_8
    const-string v5, "ALBUMS_OBJECT"

    .line 364
    .line 365
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    if-eqz v13, :cond_9

    .line 370
    .line 371
    iget-object v13, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 372
    .line 373
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    iput-object v5, v13, Lf8;->f:Ljava/util/ArrayList;

    .line 378
    .line 379
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 380
    .line 381
    const-string v13, "ALBUM_LIST_TITLE"

    .line 382
    .line 383
    const-string v14, ""

    .line 384
    .line 385
    invoke-virtual {v1, v13, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    iput-object v1, v5, Lf8;->d:Ljava/lang/String;

    .line 390
    .line 391
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 392
    .line 393
    iget-object v1, v1, Loc1;->f:Landroid/widget/TextView;

    .line 394
    .line 395
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 396
    .line 397
    iget-object v5, v5, Lf8;->d:Ljava/lang/String;

    .line 398
    .line 399
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 400
    .line 401
    .line 402
    :cond_9
    :goto_0
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 403
    .line 404
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 405
    .line 406
    iget-object v5, v5, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 407
    .line 408
    invoke-virtual {v1, v5}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 409
    .line 410
    .line 411
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 412
    .line 413
    invoke-virtual {v1}, Ldf;->n()Ll93;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    const/4 v5, 0x1

    .line 418
    if-eqz v1, :cond_a

    .line 419
    .line 420
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 421
    .line 422
    invoke-virtual {v1}, Ldf;->n()Ll93;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    invoke-virtual {v1, v5}, Ll93;->f0(Z)V

    .line 427
    .line 428
    .line 429
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 430
    .line 431
    invoke-virtual {v1}, Ldf;->n()Ll93;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {v1}, Ll93;->g0()V

    .line 436
    .line 437
    .line 438
    :cond_a
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 439
    .line 440
    iget-object v1, v1, Loc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 441
    .line 442
    new-instance v13, Lc8;

    .line 443
    .line 444
    invoke-direct {v13, v0, v2}, Lc8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v13}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 448
    .line 449
    .line 450
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 451
    .line 452
    iget-object v1, v1, Loc1;->a:Lcom/google/android/material/appbar/AppBarLayout;

    .line 453
    .line 454
    new-instance v13, Lu7;

    .line 455
    .line 456
    invoke-direct {v13, v5, v0}, Lu7;-><init>(ILkc1;)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v1, v13}, Lcom/google/android/material/appbar/AppBarLayout;->a(Laf;)V

    .line 460
    .line 461
    .line 462
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 463
    .line 464
    iget-object v1, v1, Loc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 465
    .line 466
    new-instance v13, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 467
    .line 468
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 469
    .line 470
    .line 471
    invoke-direct {v13, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v13}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 475
    .line 476
    .line 477
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 478
    .line 479
    iget-object v1, v1, Loc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 480
    .line 481
    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 482
    .line 483
    .line 484
    new-instance v1, Lb8;

    .line 485
    .line 486
    iget-object v13, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 487
    .line 488
    iget-object v13, v13, Lf8;->d:Ljava/lang/String;

    .line 489
    .line 490
    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    if-nez v12, :cond_b

    .line 495
    .line 496
    iget-object v12, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 497
    .line 498
    iget-object v12, v12, Lf8;->d:Ljava/lang/String;

    .line 499
    .line 500
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v11

    .line 504
    :cond_b
    invoke-direct {v1, v0, v2}, Lb8;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;I)V

    .line 505
    .line 506
    .line 507
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Lb8;

    .line 508
    .line 509
    const/4 v11, 0x2

    .line 510
    iput v11, v1, Ldw3;->p:I

    .line 511
    .line 512
    iget-object v1, v1, Ldw3;->n:Lew3;

    .line 513
    .line 514
    invoke-virtual {v1}, Lew3;->g()V

    .line 515
    .line 516
    .line 517
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 518
    .line 519
    iget-object v1, v1, Loc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 520
    .line 521
    iget-object v12, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->o0:Lb8;

    .line 522
    .line 523
    invoke-virtual {v1, v12}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 524
    .line 525
    .line 526
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->n0:Lf8;

    .line 527
    .line 528
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 529
    .line 530
    .line 531
    move-result-object v12

    .line 532
    iget v13, v1, Lf8;->h:I

    .line 533
    .line 534
    iget-object v14, v1, Lf8;->c:Lrv2;

    .line 535
    .line 536
    iget-object v15, v1, Lf8;->f:Ljava/util/ArrayList;

    .line 537
    .line 538
    if-eqz v15, :cond_c

    .line 539
    .line 540
    new-instance v1, Lk03;

    .line 541
    .line 542
    invoke-direct {v1, v15}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_4

    .line 546
    .line 547
    :cond_c
    new-instance v15, Lk03;

    .line 548
    .line 549
    new-instance v5, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 552
    .line 553
    .line 554
    invoke-direct {v15, v5}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 555
    .line 556
    .line 557
    iput-object v15, v1, Lf8;->g:Lk03;

    .line 558
    .line 559
    iget-object v5, v1, Lf8;->d:Ljava/lang/String;

    .line 560
    .line 561
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 565
    .line 566
    .line 567
    move-result v15

    .line 568
    const/4 v2, -0x1

    .line 569
    sparse-switch v15, :sswitch_data_0

    .line 570
    .line 571
    .line 572
    :goto_1
    move v3, v2

    .line 573
    goto :goto_2

    .line 574
    :sswitch_0
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    if-nez v3, :cond_d

    .line 579
    .line 580
    goto :goto_1

    .line 581
    :cond_d
    const/4 v3, 0x4

    .line 582
    goto :goto_2

    .line 583
    :sswitch_1
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v3

    .line 587
    if-nez v3, :cond_e

    .line 588
    .line 589
    goto :goto_1

    .line 590
    :cond_e
    const/4 v3, 0x3

    .line 591
    goto :goto_2

    .line 592
    :sswitch_2
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-nez v3, :cond_f

    .line 597
    .line 598
    goto :goto_1

    .line 599
    :cond_f
    move v3, v11

    .line 600
    goto :goto_2

    .line 601
    :sswitch_3
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-nez v3, :cond_10

    .line 606
    .line 607
    goto :goto_1

    .line 608
    :cond_10
    const/4 v3, 0x1

    .line 609
    goto :goto_2

    .line 610
    :sswitch_4
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v3

    .line 614
    if-nez v3, :cond_11

    .line 615
    .line 616
    goto :goto_1

    .line 617
    :cond_11
    const/4 v3, 0x0

    .line 618
    :goto_2
    packed-switch v3, :pswitch_data_0

    .line 619
    .line 620
    .line 621
    goto :goto_3

    .line 622
    :pswitch_0
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    const-string v2, "newest"

    .line 626
    .line 627
    invoke-static {v2, v13, v4, v4}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    new-instance v3, Le8;

    .line 632
    .line 633
    invoke-direct {v3, v1, v11}, Le8;-><init>(Lf8;I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v2, v12, v3}, Lad2;->e(Lba2;La83;)V

    .line 637
    .line 638
    .line 639
    goto :goto_3

    .line 640
    :pswitch_1
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    .line 642
    .line 643
    const-string v2, "recent"

    .line 644
    .line 645
    invoke-static {v2, v13, v4, v4}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    new-instance v3, Le8;

    .line 650
    .line 651
    const/4 v4, 0x0

    .line 652
    invoke-direct {v3, v1, v4}, Le8;-><init>(Lf8;I)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v2, v12, v3}, Lad2;->e(Lba2;La83;)V

    .line 656
    .line 657
    .line 658
    goto :goto_3

    .line 659
    :pswitch_2
    const/4 v4, 0x0

    .line 660
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    invoke-static {v2, v4}, Lrv2;->o(IZ)Lk03;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    iput-object v2, v1, Lf8;->g:Lk03;

    .line 668
    .line 669
    goto :goto_3

    .line 670
    :pswitch_3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    const/4 v3, 0x1

    .line 675
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    const-string v4, "byYear"

    .line 691
    .line 692
    invoke-static {v4, v13, v3, v2}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    new-instance v3, Le8;

    .line 697
    .line 698
    const/4 v4, 0x3

    .line 699
    invoke-direct {v3, v1, v4}, Le8;-><init>(Lf8;I)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v12, v3}, Lad2;->e(Lba2;La83;)V

    .line 703
    .line 704
    .line 705
    goto :goto_3

    .line 706
    :pswitch_4
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    const-string v2, "frequent"

    .line 710
    .line 711
    invoke-static {v2, v13, v4, v4}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    new-instance v3, Le8;

    .line 716
    .line 717
    const/4 v4, 0x1

    .line 718
    invoke-direct {v3, v1, v4}, Le8;-><init>(Lf8;I)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v2, v12, v3}, Lad2;->e(Lba2;La83;)V

    .line 722
    .line 723
    .line 724
    :goto_3
    iget-object v1, v1, Lf8;->g:Lk03;

    .line 725
    .line 726
    :goto_4
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    new-instance v3, Ld8;

    .line 731
    .line 732
    const/4 v4, 0x0

    .line 733
    invoke-direct {v3, v4, v0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v1, v2, v3}, Lad2;->e(Lba2;La83;)V

    .line 737
    .line 738
    .line 739
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 740
    .line 741
    iget-object v1, v1, Loc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 742
    .line 743
    new-instance v2, Ls7;

    .line 744
    .line 745
    const/4 v3, 0x1

    .line 746
    invoke-direct {v2, v3, v0}, Ls7;-><init>(ILjava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 750
    .line 751
    .line 752
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 753
    .line 754
    iget-object v1, v1, Loc1;->d:Landroid/widget/Button;

    .line 755
    .line 756
    new-instance v2, Lc8;

    .line 757
    .line 758
    invoke-direct {v2, v0, v3}, Lc8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 762
    .line 763
    .line 764
    return-object v6

    .line 765
    :cond_12
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 766
    .line 767
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    return-object v4

    .line 771
    :cond_13
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    const-string v1, "Missing required view with ID: "

    .line 780
    .line 781
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    return-object v4

    .line 789
    :sswitch_data_0
    .sparse-switch
        -0x4a3e2ae1 -> :sswitch_4
        -0x22d426e5 -> :sswitch_3
        0x363632ef -> :sswitch_2
        0x3756b3da -> :sswitch_1
        0x430286f9 -> :sswitch_0
    .end sparse-switch

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->l0:Loc1;

    .line 6
    .line 7
    return-void
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a009f

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onAlbumLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a009b

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
