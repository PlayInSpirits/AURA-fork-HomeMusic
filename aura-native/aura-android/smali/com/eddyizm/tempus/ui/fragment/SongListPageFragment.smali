.class public Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lup0;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lui4;

.field public o0:Lli3;

.field public p0:Lni4;

.field public q0:Lbl2;

.field public r0:Z

.field public s0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->r0:Z

    .line 6
    .line 7
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
    const v0, 0x7f0f0017

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
    check-cast p1, Landroid/widget/SearchView;

    .line 19
    .line 20
    const/4 p2, 0x6

    .line 21
    invoke-virtual {p1, p2}, Landroid/widget/SearchView;->setImeOptions(I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lw7;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1, p2}, Lw7;-><init>(Lkc1;Landroid/widget/SearchView;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

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
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Lkc1;->l()Lnc1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v0, 0x7f0d0087

    .line 12
    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    move-object/from16 v2, p1

    .line 16
    .line 17
    move-object/from16 v3, p2

    .line 18
    .line 19
    invoke-virtual {v2, v0, v3, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v2, 0x7f0a00ae

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    move-object v12, v3

    .line 31
    check-cast v12, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    if-eqz v12, :cond_15

    .line 34
    .line 35
    const v2, 0x7f0a00da

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v13, v4

    .line 43
    check-cast v13, Lcom/google/android/material/appbar/AppBarLayout;

    .line 44
    .line 45
    if-eqz v13, :cond_15

    .line 46
    .line 47
    const v2, 0x7f0a0448

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    move-object v14, v4

    .line 55
    check-cast v14, Landroid/widget/TextView;

    .line 56
    .line 57
    if-eqz v14, :cond_15

    .line 58
    .line 59
    const v2, 0x7f0a0449

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    move-object v15, v4

    .line 67
    check-cast v15, Landroid/widget/TextView;

    .line 68
    .line 69
    if-eqz v15, :cond_15

    .line 70
    .line 71
    const v2, 0x7f0a059a

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    move-object/from16 v16, v4

    .line 79
    .line 80
    check-cast v16, Landroidx/recyclerview/widget/RecyclerView;

    .line 81
    .line 82
    if-eqz v16, :cond_15

    .line 83
    .line 84
    const v2, 0x7f0a059b

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move-object/from16 v17, v4

    .line 92
    .line 93
    check-cast v17, Landroid/widget/Button;

    .line 94
    .line 95
    if-eqz v17, :cond_15

    .line 96
    .line 97
    const v2, 0x7f0a059c

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    move-object/from16 v18, v4

    .line 105
    .line 106
    check-cast v18, Landroid/widget/Button;

    .line 107
    .line 108
    if-eqz v18, :cond_15

    .line 109
    .line 110
    const v2, 0x7f0a05dd

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    move-object/from16 v19, v4

    .line 118
    .line 119
    check-cast v19, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 120
    .line 121
    if-eqz v19, :cond_15

    .line 122
    .line 123
    const v2, 0x7f0a061b

    .line 124
    .line 125
    .line 126
    invoke-static {v0, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    move-object/from16 v20, v4

    .line 131
    .line 132
    check-cast v20, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 133
    .line 134
    if-eqz v20, :cond_15

    .line 135
    .line 136
    new-instance v10, Lup0;

    .line 137
    .line 138
    move-object v11, v0

    .line 139
    check-cast v11, Landroid/widget/LinearLayout;

    .line 140
    .line 141
    invoke-direct/range {v10 .. v20}, Lup0;-><init>(Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/Button;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 142
    .line 143
    .line 144
    iput-object v10, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 145
    .line 146
    invoke-virtual {v1}, Lkc1;->X()Lnc1;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ll70;->d()Le75;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-static {v0}, Lgh0;->r(Lf75;)Lb75;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v0, v4}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v5, Lbq4;

    .line 163
    .line 164
    invoke-direct {v5, v2, v4, v0}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 165
    .line 166
    .line 167
    const-class v0, Lui4;

    .line 168
    .line 169
    invoke-static {v0}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Li30;->b()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-string v4, "Local and anonymous classes can not be ViewModels"

    .line 178
    .line 179
    if-eqz v2, :cond_14

    .line 180
    .line 181
    const-string v6, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 182
    .line 183
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v5, v0, v2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Lui4;

    .line 192
    .line 193
    iput-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 194
    .line 195
    invoke-virtual {v1}, Lkc1;->X()Lnc1;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ll70;->d()Le75;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-static {v0}, Lgh0;->r(Lf75;)Lb75;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-static {v0, v5}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    new-instance v7, Lbq4;

    .line 212
    .line 213
    invoke-direct {v7, v2, v5, v0}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 214
    .line 215
    .line 216
    const-class v0, Lli3;

    .line 217
    .line 218
    invoke-static {v0}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, Li30;->b()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    if-eqz v2, :cond_13

    .line 227
    .line 228
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v7, v0, v2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Lli3;

    .line 237
    .line 238
    iput-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 239
    .line 240
    iget-object v0, v1, Lkc1;->s:Landroid/os/Bundle;

    .line 241
    .line 242
    if-nez v0, :cond_0

    .line 243
    .line 244
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 245
    .line 246
    if-eqz v0, :cond_12

    .line 247
    .line 248
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 249
    .line 250
    if-eqz v0, :cond_12

    .line 251
    .line 252
    invoke-virtual {v0}, Lv23;->o()V

    .line 253
    .line 254
    .line 255
    return-object v11

    .line 256
    :cond_0
    const-string v2, "MEDIA_RECENTLY_PLAYED"

    .line 257
    .line 258
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    const/4 v10, 0x2

    .line 263
    const/4 v6, -0x1

    .line 264
    const/4 v12, 0x1

    .line 265
    const-string v13, "MEDIA_STARRED"

    .line 266
    .line 267
    if-eqz v4, :cond_1

    .line 268
    .line 269
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 270
    .line 271
    iput-object v2, v0, Lui4;->e:Ljava/lang/String;

    .line 272
    .line 273
    const v2, 0x7f130549

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    iput-object v3, v0, Lui4;->f:Ljava/lang/String;

    .line 281
    .line 282
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 283
    .line 284
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 285
    .line 286
    check-cast v0, Landroid/widget/TextView;

    .line 287
    .line 288
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_2

    .line 292
    .line 293
    :cond_1
    const-string v2, "MEDIA_MOST_PLAYED"

    .line 294
    .line 295
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    if-eqz v4, :cond_2

    .line 300
    .line 301
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 302
    .line 303
    iput-object v2, v0, Lui4;->e:Ljava/lang/String;

    .line 304
    .line 305
    const v2, 0x7f130547

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    iput-object v3, v0, Lui4;->f:Ljava/lang/String;

    .line 313
    .line 314
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 315
    .line 316
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 317
    .line 318
    check-cast v0, Landroid/widget/TextView;

    .line 319
    .line 320
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_2
    const-string v2, "MEDIA_RECENTLY_ADDED"

    .line 326
    .line 327
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    if-eqz v4, :cond_3

    .line 332
    .line 333
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 334
    .line 335
    iput-object v2, v0, Lui4;->e:Ljava/lang/String;

    .line 336
    .line 337
    const v2, 0x7f130548

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    iput-object v3, v0, Lui4;->f:Ljava/lang/String;

    .line 345
    .line 346
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 347
    .line 348
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 349
    .line 350
    check-cast v0, Landroid/widget/TextView;

    .line 351
    .line 352
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_2

    .line 356
    .line 357
    :cond_3
    const-string v2, "MEDIA_BY_GENRE"

    .line 358
    .line 359
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    if-eqz v4, :cond_4

    .line 364
    .line 365
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 366
    .line 367
    iput-object v2, v3, Lui4;->e:Ljava/lang/String;

    .line 368
    .line 369
    const-string v2, "GENRE_OBJECT"

    .line 370
    .line 371
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 376
    .line 377
    iput-object v0, v3, Lui4;->g:Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 378
    .line 379
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 380
    .line 381
    iget-object v2, v0, Lui4;->g:Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 382
    .line 383
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    iput-object v2, v0, Lui4;->f:Ljava/lang/String;

    .line 388
    .line 389
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 390
    .line 391
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 392
    .line 393
    check-cast v0, Landroid/widget/TextView;

    .line 394
    .line 395
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 396
    .line 397
    iget-object v2, v2, Lui4;->g:Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 398
    .line 399
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_2

    .line 407
    .line 408
    :cond_4
    const-string v2, "MEDIA_BY_ARTIST"

    .line 409
    .line 410
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    if-eqz v4, :cond_5

    .line 415
    .line 416
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 417
    .line 418
    iput-object v2, v3, Lui4;->e:Ljava/lang/String;

    .line 419
    .line 420
    const-string v2, "ARTIST_OBJECT"

    .line 421
    .line 422
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 427
    .line 428
    iput-object v0, v3, Lui4;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 429
    .line 430
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 431
    .line 432
    iget-object v2, v0, Lui4;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 433
    .line 434
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    const v3, 0x7f13054b

    .line 443
    .line 444
    .line 445
    invoke-virtual {v1, v3, v2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    iput-object v2, v0, Lui4;->f:Ljava/lang/String;

    .line 450
    .line 451
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 452
    .line 453
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 454
    .line 455
    check-cast v0, Landroid/widget/TextView;

    .line 456
    .line 457
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 458
    .line 459
    iget-object v2, v2, Lui4;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 460
    .line 461
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    invoke-virtual {v1, v3, v2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 474
    .line 475
    .line 476
    goto/16 :goto_2

    .line 477
    .line 478
    :cond_5
    const-string v2, "MEDIA_BY_GENRES"

    .line 479
    .line 480
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    if-eqz v4, :cond_6

    .line 485
    .line 486
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 487
    .line 488
    iput-object v2, v3, Lui4;->e:Ljava/lang/String;

    .line 489
    .line 490
    const-string v2, "filters_list"

    .line 491
    .line 492
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    iput-object v2, v3, Lui4;->k:Ljava/util/ArrayList;

    .line 497
    .line 498
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 499
    .line 500
    const-string v3, "filter_name_list"

    .line 501
    .line 502
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    iput-object v0, v2, Lui4;->l:Ljava/util/ArrayList;

    .line 507
    .line 508
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 509
    .line 510
    iget-object v2, v0, Lui4;->l:Ljava/util/ArrayList;

    .line 511
    .line 512
    const-string v3, ", "

    .line 513
    .line 514
    invoke-static {v3, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    iput-object v2, v0, Lui4;->f:Ljava/lang/String;

    .line 519
    .line 520
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 521
    .line 522
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 523
    .line 524
    check-cast v0, Landroid/widget/TextView;

    .line 525
    .line 526
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 527
    .line 528
    iget-object v2, v2, Lui4;->l:Ljava/util/ArrayList;

    .line 529
    .line 530
    invoke-static {v3, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 535
    .line 536
    .line 537
    goto/16 :goto_2

    .line 538
    .line 539
    :cond_6
    const-string v2, "MEDIA_BY_YEAR"

    .line 540
    .line 541
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    if-eqz v4, :cond_7

    .line 546
    .line 547
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 548
    .line 549
    iput-object v2, v3, Lui4;->e:Ljava/lang/String;

    .line 550
    .line 551
    const-string v2, "year_object"

    .line 552
    .line 553
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    iput v0, v3, Lui4;->m:I

    .line 558
    .line 559
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 560
    .line 561
    iget v2, v0, Lui4;->m:I

    .line 562
    .line 563
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    const v3, 0x7f13054c

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1, v3, v2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    iput-object v2, v0, Lui4;->f:Ljava/lang/String;

    .line 579
    .line 580
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 581
    .line 582
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 583
    .line 584
    check-cast v0, Landroid/widget/TextView;

    .line 585
    .line 586
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 587
    .line 588
    iget v2, v2, Lui4;->m:I

    .line 589
    .line 590
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    invoke-virtual {v1, v3, v2}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_2

    .line 606
    .line 607
    :cond_7
    invoke-virtual {v0, v13}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    if-eqz v2, :cond_d

    .line 612
    .line 613
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 614
    .line 615
    iput-object v13, v0, Lui4;->e:Ljava/lang/String;

    .line 616
    .line 617
    const v2, 0x7f13054a

    .line 618
    .line 619
    .line 620
    invoke-virtual {v1, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    iput-object v4, v0, Lui4;->f:Ljava/lang/String;

    .line 625
    .line 626
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 627
    .line 628
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 629
    .line 630
    check-cast v0, Landroid/widget/TextView;

    .line 631
    .line 632
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 633
    .line 634
    .line 635
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 636
    .line 637
    iget-object v2, v0, Lup0;->a:Landroid/view/ViewGroup;

    .line 638
    .line 639
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 640
    .line 641
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 642
    .line 643
    check-cast v0, Landroid/widget/TextView;

    .line 644
    .line 645
    sget-object v4, Lwn1;->a:Lk03;

    .line 646
    .line 647
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 648
    .line 649
    .line 650
    move-result-object v4

    .line 651
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 652
    .line 653
    .line 654
    move-result-object v5

    .line 655
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 656
    .line 657
    .line 658
    move-result-object v7

    .line 659
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 660
    .line 661
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 662
    .line 663
    .line 664
    move-result-object v8

    .line 665
    iget v8, v8, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 666
    .line 667
    add-int/lit8 v8, v8, -0x80

    .line 668
    .line 669
    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    iget v5, v5, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 674
    .line 675
    mul-int/2addr v5, v10

    .line 676
    div-int/lit8 v5, v5, 0x5

    .line 677
    .line 678
    invoke-static {v8, v5}, Ljava/lang/Math;->min(II)I

    .line 679
    .line 680
    .line 681
    move-result v5

    .line 682
    int-to-float v5, v5

    .line 683
    mul-float/2addr v5, v7

    .line 684
    float-to-int v5, v5

    .line 685
    mul-int/lit8 v8, v5, 0xe

    .line 686
    .line 687
    div-int/lit8 v8, v8, 0x34

    .line 688
    .line 689
    const v14, 0x7f08007f

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4, v14}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 693
    .line 694
    .line 695
    move-result-object v14

    .line 696
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v14}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 700
    .line 701
    .line 702
    move-result-object v14

    .line 703
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 704
    .line 705
    .line 706
    instance-of v15, v14, Landroid/graphics/drawable/GradientDrawable;

    .line 707
    .line 708
    if-eqz v15, :cond_8

    .line 709
    .line 710
    move-object v15, v14

    .line 711
    check-cast v15, Landroid/graphics/drawable/GradientDrawable;

    .line 712
    .line 713
    goto :goto_0

    .line 714
    :cond_8
    const/4 v15, 0x0

    .line 715
    :goto_0
    if-eqz v15, :cond_9

    .line 716
    .line 717
    const/high16 v16, 0x41400000    # 12.0f

    .line 718
    .line 719
    mul-float v3, v16, v7

    .line 720
    .line 721
    invoke-virtual {v15, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 722
    .line 723
    .line 724
    :cond_9
    new-instance v3, Landroid/widget/ImageView;

    .line 725
    .line 726
    invoke-direct {v3, v4}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 727
    .line 728
    .line 729
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 730
    .line 731
    .line 732
    move-result v4

    .line 733
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v3, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 737
    .line 738
    .line 739
    const v4, 0x7f080128

    .line 740
    .line 741
    .line 742
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 743
    .line 744
    .line 745
    invoke-static {v6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v3, v8, v8, v8, v8}, Landroid/view/View;->setPadding(IIII)V

    .line 753
    .line 754
    .line 755
    const/high16 v4, 0x40c00000    # 6.0f

    .line 756
    .line 757
    mul-float/2addr v4, v7

    .line 758
    invoke-virtual {v3, v4}, Landroid/view/View;->setElevation(F)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v3, v10}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 762
    .line 763
    .line 764
    new-instance v4, Lmb0;

    .line 765
    .line 766
    invoke-direct {v4, v5, v5}, Lmb0;-><init>(II)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 773
    .line 774
    .line 775
    move-result-object v4

    .line 776
    const/4 v5, -0x2

    .line 777
    iput v5, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 778
    .line 779
    new-instance v4, Lwb0;

    .line 780
    .line 781
    invoke-direct {v4}, Lwb0;-><init>()V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v4, v2}, Lwb0;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 788
    .line 789
    .line 790
    move-result v5

    .line 791
    const/high16 v8, 0x41000000    # 8.0f

    .line 792
    .line 793
    mul-float/2addr v8, v7

    .line 794
    float-to-int v7, v8

    .line 795
    const/4 v8, 0x3

    .line 796
    invoke-virtual {v4, v5, v8, v8, v7}, Lwb0;->c(IIII)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 800
    .line 801
    .line 802
    move-result v5

    .line 803
    invoke-virtual {v4, v5, v12, v12, v9}, Lwb0;->c(IIII)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v4, v5, v10, v10, v9}, Lwb0;->c(IIII)V

    .line 807
    .line 808
    .line 809
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    iget-object v7, v4, Lwb0;->c:Ljava/util/HashMap;

    .line 814
    .line 815
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    check-cast v5, Lrb0;

    .line 820
    .line 821
    if-eqz v5, :cond_a

    .line 822
    .line 823
    iget-object v5, v5, Lrb0;->d:Lsb0;

    .line 824
    .line 825
    const/high16 v8, 0x3f000000    # 0.5f

    .line 826
    .line 827
    iput v8, v5, Lsb0;->w:F

    .line 828
    .line 829
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 830
    .line 831
    .line 832
    move-result v0

    .line 833
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 838
    .line 839
    .line 840
    move-result-object v5

    .line 841
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    move-result v5

    .line 845
    if-nez v5, :cond_b

    .line 846
    .line 847
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 848
    .line 849
    .line 850
    move-result-object v5

    .line 851
    new-instance v8, Lrb0;

    .line 852
    .line 853
    invoke-direct {v8}, Lrb0;-><init>()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v7, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    :cond_b
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 860
    .line 861
    .line 862
    move-result-object v0

    .line 863
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    check-cast v0, Lrb0;

    .line 868
    .line 869
    if-nez v0, :cond_c

    .line 870
    .line 871
    goto :goto_1

    .line 872
    :cond_c
    iget-object v0, v0, Lrb0;->d:Lsb0;

    .line 873
    .line 874
    iput v3, v0, Lsb0;->m:I

    .line 875
    .line 876
    iput v6, v0, Lsb0;->l:I

    .line 877
    .line 878
    iput v6, v0, Lsb0;->p:I

    .line 879
    .line 880
    iput v6, v0, Lsb0;->q:I

    .line 881
    .line 882
    iput v6, v0, Lsb0;->r:I

    .line 883
    .line 884
    :goto_1
    invoke-virtual {v4, v2}, Lwb0;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 885
    .line 886
    .line 887
    const/4 v0, 0x0

    .line 888
    invoke-virtual {v2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->setConstraintSet(Lwb0;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 892
    .line 893
    .line 894
    goto :goto_2

    .line 895
    :cond_d
    const-string v2, "MEDIA_DOWNLOADED"

    .line 896
    .line 897
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v3

    .line 901
    if-eqz v3, :cond_e

    .line 902
    .line 903
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 904
    .line 905
    iput-object v2, v0, Lui4;->e:Ljava/lang/String;

    .line 906
    .line 907
    const v2, 0x7f130546

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    iput-object v3, v0, Lui4;->f:Ljava/lang/String;

    .line 915
    .line 916
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 917
    .line 918
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 919
    .line 920
    check-cast v0, Landroid/widget/TextView;

    .line 921
    .line 922
    invoke-virtual {v1, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 927
    .line 928
    .line 929
    goto :goto_2

    .line 930
    :cond_e
    const-string v2, "ALBUM_OBJECT"

    .line 931
    .line 932
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    if-eqz v3, :cond_f

    .line 937
    .line 938
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 939
    .line 940
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 945
    .line 946
    iput-object v0, v3, Lui4;->i:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 947
    .line 948
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 949
    .line 950
    const-string v2, "MEDIA_FROM_ALBUM"

    .line 951
    .line 952
    iput-object v2, v0, Lui4;->e:Ljava/lang/String;

    .line 953
    .line 954
    iget-object v2, v0, Lui4;->i:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 955
    .line 956
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    iput-object v2, v0, Lui4;->f:Ljava/lang/String;

    .line 961
    .line 962
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 963
    .line 964
    iget-object v0, v0, Lup0;->d:Landroid/view/View;

    .line 965
    .line 966
    check-cast v0, Landroid/widget/TextView;

    .line 967
    .line 968
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 969
    .line 970
    iget-object v2, v2, Lui4;->i:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 971
    .line 972
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v2

    .line 976
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 977
    .line 978
    .line 979
    :cond_f
    :goto_2
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 980
    .line 981
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 982
    .line 983
    iget-object v2, v2, Lup0;->i:Landroid/view/View;

    .line 984
    .line 985
    check-cast v2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 986
    .line 987
    invoke-virtual {v0, v2}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 988
    .line 989
    .line 990
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 991
    .line 992
    invoke-virtual {v0}, Ldf;->n()Ll93;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    if-eqz v0, :cond_10

    .line 997
    .line 998
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 999
    .line 1000
    invoke-virtual {v0}, Ldf;->n()Ll93;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    invoke-virtual {v0, v12}, Ll93;->f0(Z)V

    .line 1005
    .line 1006
    .line 1007
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1008
    .line 1009
    invoke-virtual {v0}, Ldf;->n()Ll93;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v0

    .line 1013
    invoke-virtual {v0}, Ll93;->g0()V

    .line 1014
    .line 1015
    .line 1016
    :cond_10
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1017
    .line 1018
    iget-object v0, v0, Lup0;->i:Landroid/view/View;

    .line 1019
    .line 1020
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 1021
    .line 1022
    new-instance v2, Lpi4;

    .line 1023
    .line 1024
    invoke-direct {v2, v1, v9}, Lpi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1028
    .line 1029
    .line 1030
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1031
    .line 1032
    iget-object v0, v0, Lup0;->b:Landroid/widget/LinearLayout;

    .line 1033
    .line 1034
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 1035
    .line 1036
    new-instance v2, Lu7;

    .line 1037
    .line 1038
    const/16 v14, 0xa

    .line 1039
    .line 1040
    invoke-direct {v2, v14, v1}, Lu7;-><init>(ILkc1;)V

    .line 1041
    .line 1042
    .line 1043
    invoke-virtual {v0, v2}, Lcom/google/android/material/appbar/AppBarLayout;->a(Laf;)V

    .line 1044
    .line 1045
    .line 1046
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 1047
    .line 1048
    invoke-virtual {v0}, Lui4;->c()Lk03;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    new-instance v3, Loi4;

    .line 1057
    .line 1058
    invoke-direct {v3, v1, v12}, Loi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v0, v2, v3}, Lad2;->e(Lba2;La83;)V

    .line 1062
    .line 1063
    .line 1064
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1065
    .line 1066
    iget-object v0, v0, Lup0;->e:Landroid/view/View;

    .line 1067
    .line 1068
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1069
    .line 1070
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1071
    .line 1072
    invoke-virtual {v1}, Lkc1;->Z()Landroid/content/Context;

    .line 1073
    .line 1074
    .line 1075
    invoke-direct {v2, v12}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1079
    .line 1080
    .line 1081
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1082
    .line 1083
    iget-object v0, v0, Lup0;->e:Landroid/view/View;

    .line 1084
    .line 1085
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1086
    .line 1087
    invoke-virtual {v0, v12}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1088
    .line 1089
    .line 1090
    new-instance v0, Lni4;

    .line 1091
    .line 1092
    invoke-virtual/range {p0 .. p0}, Lkc1;->v()Lle1;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v1

    .line 1096
    const/4 v4, 0x0

    .line 1097
    const/4 v5, 0x0

    .line 1098
    const/4 v3, 0x1

    .line 1099
    move-object/from16 v2, p0

    .line 1100
    .line 1101
    invoke-direct/range {v0 .. v5}, Lni4;-><init>(Lle1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 1102
    .line 1103
    .line 1104
    move-object v1, v2

    .line 1105
    iput-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 1106
    .line 1107
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1108
    .line 1109
    iget-object v2, v2, Lup0;->e:Landroid/view/View;

    .line 1110
    .line 1111
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 1112
    .line 1113
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1114
    .line 1115
    .line 1116
    iget-object v3, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 1117
    .line 1118
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1119
    .line 1120
    iget-object v0, v0, Lup0;->i:Landroid/view/View;

    .line 1121
    .line 1122
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 1123
    .line 1124
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 1125
    .line 1126
    iget-object v2, v2, Lui4;->e:Ljava/lang/String;

    .line 1127
    .line 1128
    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1129
    .line 1130
    .line 1131
    move-result v4

    .line 1132
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 1133
    .line 1134
    iget-object v2, v2, Lui4;->e:Ljava/lang/String;

    .line 1135
    .line 1136
    invoke-static {v2}, Lv13;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v8

    .line 1140
    new-instance v7, Lei4;

    .line 1141
    .line 1142
    invoke-direct {v7, v12, v1}, Lei4;-><init>(ILkc1;)V

    .line 1143
    .line 1144
    .line 1145
    new-instance v5, Lsi4;

    .line 1146
    .line 1147
    invoke-direct {v5, v1, v12}, Lsi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 1148
    .line 1149
    .line 1150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1151
    .line 1152
    .line 1153
    new-instance v15, Lrm3;

    .line 1154
    .line 1155
    const/16 v2, 0x14

    .line 1156
    .line 1157
    invoke-direct {v15, v2}, Lrm3;-><init>(I)V

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v2

    .line 1164
    new-instance v14, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 1165
    .line 1166
    invoke-direct {v14, v2}, Lcom/google/android/material/appbar/MaterialToolbar;-><init>(Landroid/content/Context;)V

    .line 1167
    .line 1168
    .line 1169
    move/from16 p2, v12

    .line 1170
    .line 1171
    const/high16 v12, -0x1000000

    .line 1172
    .line 1173
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v9

    .line 1177
    const v10, 0x7f04013b

    .line 1178
    .line 1179
    .line 1180
    invoke-static {v9, v10, v12}, Lg12;->s(Landroid/content/Context;II)I

    .line 1181
    .line 1182
    .line 1183
    move-result v9

    .line 1184
    invoke-virtual {v14, v9}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1185
    .line 1186
    .line 1187
    const v9, 0x7f08011c

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v14, v9}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 1191
    .line 1192
    .line 1193
    const v9, 0x7f1301fb

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v14, v9}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 1197
    .line 1198
    .line 1199
    const v9, 0x7f0f0009

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v14, v9}, Lcom/google/android/material/appbar/MaterialToolbar;->m(I)V

    .line 1203
    .line 1204
    .line 1205
    const/16 v9, 0x8

    .line 1206
    .line 1207
    invoke-virtual {v14, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v9

    .line 1214
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    check-cast v9, Landroid/view/ViewGroup;

    .line 1218
    .line 1219
    invoke-virtual {v9, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 1220
    .line 1221
    .line 1222
    move-result v10

    .line 1223
    add-int/lit8 v10, v10, 0x1

    .line 1224
    .line 1225
    new-instance v12, Landroid/view/ViewGroup$LayoutParams;

    .line 1226
    .line 1227
    move-object/from16 v18, v0

    .line 1228
    .line 1229
    invoke-virtual/range {v18 .. v18}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1234
    .line 1235
    invoke-direct {v12, v6, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v9, v14, v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1239
    .line 1240
    .line 1241
    new-instance v0, Lbd1;

    .line 1242
    .line 1243
    const/4 v6, 0x2

    .line 1244
    invoke-direct {v0, v6, v15}, Lbd1;-><init>(ILjava/lang/Object;)V

    .line 1245
    .line 1246
    .line 1247
    invoke-virtual {v1}, Lkc1;->X()Lnc1;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v6

    .line 1251
    invoke-virtual {v6}, Ll70;->i()La93;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v6

    .line 1255
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v9

    .line 1259
    invoke-virtual {v6, v9, v0}, La93;->a(Lba2;Lv83;)V

    .line 1260
    .line 1261
    .line 1262
    move-object/from16 v16, v15

    .line 1263
    .line 1264
    new-instance v15, Lvo1;

    .line 1265
    .line 1266
    move-object/from16 v19, v0

    .line 1267
    .line 1268
    move-object/from16 v20, v2

    .line 1269
    .line 1270
    move-object/from16 v22, v3

    .line 1271
    .line 1272
    move/from16 v21, v4

    .line 1273
    .line 1274
    move-object/from16 v17, v14

    .line 1275
    .line 1276
    invoke-direct/range {v15 .. v22}, Lvo1;-><init>(Lrm3;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lbd1;Landroid/content/Context;ZLni4;)V

    .line 1277
    .line 1278
    .line 1279
    move-object v0, v15

    .line 1280
    move-object/from16 v15, v16

    .line 1281
    .line 1282
    move-object/from16 v9, v17

    .line 1283
    .line 1284
    move-object/from16 v10, v19

    .line 1285
    .line 1286
    move-object/from16 v19, v20

    .line 1287
    .line 1288
    iput-object v0, v15, Lrm3;->o:Ljava/lang/Object;

    .line 1289
    .line 1290
    new-instance v0, Lp6;

    .line 1291
    .line 1292
    const/16 v2, 0x12

    .line 1293
    .line 1294
    invoke-direct {v0, v2, v15}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v9, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1298
    .line 1299
    .line 1300
    new-instance v0, Lso1;

    .line 1301
    .line 1302
    move-object v2, v15

    .line 1303
    move-object/from16 v6, v19

    .line 1304
    .line 1305
    invoke-direct/range {v0 .. v8}, Lso1;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Lrm3;Lni4;ZLsi4;Landroid/content/Context;Lei4;Ljava/lang/String;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v9, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Lav4;)V

    .line 1309
    .line 1310
    .line 1311
    if-eqz v4, :cond_11

    .line 1312
    .line 1313
    invoke-virtual {v1}, Lkc1;->q()Lld1;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v2

    .line 1321
    new-instance v6, Leg0;

    .line 1322
    .line 1323
    const/4 v7, 0x2

    .line 1324
    invoke-direct {v6, v3, v1, v5, v7}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1325
    .line 1326
    .line 1327
    const-string v5, "homemusic_remove_from_liked"

    .line 1328
    .line 1329
    invoke-virtual {v0, v5, v2, v6}, Lld1;->a0(Ljava/lang/String;Lle1;Lzd1;)V

    .line 1330
    .line 1331
    .line 1332
    :cond_11
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    invoke-virtual {v0}, Lle1;->e()V

    .line 1337
    .line 1338
    .line 1339
    iget-object v0, v0, Lle1;->r:Lea2;

    .line 1340
    .line 1341
    new-instance v2, Lwo1;

    .line 1342
    .line 1343
    const/4 v5, 0x0

    .line 1344
    invoke-direct {v2, v5, v15}, Lwo1;-><init>(ILjava/lang/Object;)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0, v2}, Lea2;->a(Laa2;)V

    .line 1348
    .line 1349
    .line 1350
    move-object/from16 v21, v3

    .line 1351
    .line 1352
    move/from16 v20, v4

    .line 1353
    .line 1354
    move-object/from16 v16, v9

    .line 1355
    .line 1356
    move-object/from16 v17, v18

    .line 1357
    .line 1358
    move-object/from16 v18, v10

    .line 1359
    .line 1360
    invoke-static/range {v15 .. v21}, Ljz4;->h(Lrm3;Lcom/google/android/material/appbar/MaterialToolbar;Lcom/google/android/material/appbar/MaterialToolbar;Lbd1;Landroid/content/Context;ZLni4;)V

    .line 1361
    .line 1362
    .line 1363
    iput-object v15, v3, Lni4;->B:Lrm3;

    .line 1364
    .line 1365
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 1366
    .line 1367
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Lbl2;

    .line 1368
    .line 1369
    iput-object v2, v0, Lni4;->A:Lbl2;

    .line 1370
    .line 1371
    invoke-virtual {v1}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->j0()V

    .line 1372
    .line 1373
    .line 1374
    iget v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 1375
    .line 1376
    add-int/lit8 v0, v0, 0x1

    .line 1377
    .line 1378
    iput v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 1379
    .line 1380
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 1381
    .line 1382
    invoke-virtual {v2}, Lui4;->c()Lk03;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v2

    .line 1386
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v3

    .line 1390
    new-instance v4, Lri4;

    .line 1391
    .line 1392
    move/from16 v5, p2

    .line 1393
    .line 1394
    invoke-direct {v4, v0, v5, v1}, Lri4;-><init>(IILjava/lang/Object;)V

    .line 1395
    .line 1396
    .line 1397
    invoke-virtual {v2, v3, v4}, Lad2;->e(Lba2;La83;)V

    .line 1398
    .line 1399
    .line 1400
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1401
    .line 1402
    iget-object v0, v0, Lup0;->e:Landroid/view/View;

    .line 1403
    .line 1404
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1405
    .line 1406
    new-instance v2, Lti4;

    .line 1407
    .line 1408
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v3

    .line 1412
    check-cast v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1413
    .line 1414
    invoke-direct {v2, v1, v3}, Lti4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Landroidx/recyclerview/widget/LinearLayoutManager;)V

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->j(Lrw3;)V

    .line 1418
    .line 1419
    .line 1420
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1421
    .line 1422
    iget-object v0, v0, Lup0;->e:Landroid/view/View;

    .line 1423
    .line 1424
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 1425
    .line 1426
    new-instance v2, Ls7;

    .line 1427
    .line 1428
    const/16 v3, 0xa

    .line 1429
    .line 1430
    invoke-direct {v2, v3, v1}, Ls7;-><init>(ILjava/lang/Object;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1434
    .line 1435
    .line 1436
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1437
    .line 1438
    iget-object v0, v0, Lup0;->g:Landroid/view/View;

    .line 1439
    .line 1440
    check-cast v0, Landroid/widget/Button;

    .line 1441
    .line 1442
    new-instance v2, Lpi4;

    .line 1443
    .line 1444
    const/4 v6, 0x2

    .line 1445
    invoke-direct {v2, v1, v6}, Lpi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 1446
    .line 1447
    .line 1448
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1449
    .line 1450
    .line 1451
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 1452
    .line 1453
    iget-object v0, v0, Lup0;->h:Landroid/view/View;

    .line 1454
    .line 1455
    check-cast v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 1456
    .line 1457
    new-instance v2, Lss2;

    .line 1458
    .line 1459
    const/16 v3, 0x13

    .line 1460
    .line 1461
    invoke-direct {v2, v3, v1}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v0, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Lnp4;)V

    .line 1465
    .line 1466
    .line 1467
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 1468
    .line 1469
    iget-object v0, v0, Lui4;->e:Ljava/lang/String;

    .line 1470
    .line 1471
    invoke-virtual {v13, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1472
    .line 1473
    .line 1474
    move-result v0

    .line 1475
    if-eqz v0, :cond_12

    .line 1476
    .line 1477
    new-instance v0, Lsi4;

    .line 1478
    .line 1479
    const/4 v5, 0x0

    .line 1480
    invoke-direct {v0, v1, v5}, Lsi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 1481
    .line 1482
    .line 1483
    new-instance v2, Ljx3;

    .line 1484
    .line 1485
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1486
    .line 1487
    .line 1488
    sget-object v3, Lwn1;->a:Lk03;

    .line 1489
    .line 1490
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v4

    .line 1494
    iput-object v4, v2, Ljx3;->n:Ljava/lang/Object;

    .line 1495
    .line 1496
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v1

    .line 1500
    new-instance v4, Lo;

    .line 1501
    .line 1502
    const/16 v5, 0xa

    .line 1503
    .line 1504
    invoke-direct {v4, v5, v2, v0}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1505
    .line 1506
    .line 1507
    new-instance v0, Lwd1;

    .line 1508
    .line 1509
    const/4 v5, 0x1

    .line 1510
    invoke-direct {v0, v4, v5}, Lwd1;-><init>(Lif1;I)V

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v3, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 1514
    .line 1515
    .line 1516
    :cond_12
    return-object v11

    .line 1517
    :cond_13
    invoke-static {v4}, Lkf2;->n(Ljava/lang/String;)V

    .line 1518
    .line 1519
    .line 1520
    const/4 v0, 0x0

    .line 1521
    return-object v0

    .line 1522
    :cond_14
    const/4 v0, 0x0

    .line 1523
    invoke-static {v4}, Lkf2;->n(Ljava/lang/String;)V

    .line 1524
    .line 1525
    .line 1526
    return-object v0

    .line 1527
    :cond_15
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v0

    .line 1535
    const-string v1, "Missing required view with ID: "

    .line 1536
    .line 1537
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v0

    .line 1541
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 1542
    .line 1543
    .line 1544
    const/4 v0, 0x0

    .line 1545
    return-object v0
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 6
    .line 7
    return-void
.end method

.method public final P()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Lbl2;

    .line 7
    .line 8
    iput-object v1, v0, Lni4;->A:Lbl2;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 11
    .line 12
    iget-object v0, v0, Lui4;->e:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "MEDIA_STARRED"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->i0()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Lcb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v0, v1}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Laj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Lbl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Lcb4;->a:Lbb4;

    .line 45
    .line 46
    invoke-interface {v0}, Lbb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Lxc5;

    .line 53
    .line 54
    new-instance v1, Lx7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lfi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    new-instance v1, Lbj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Lbl2;

    .line 86
    .line 87
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 88
    .line 89
    invoke-static {v7, v0}, Lbo2;->j(Lbl2;Lli3;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 93
    .line 94
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 95
    .line 96
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Loi4;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, p0, v3}, Loi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 110
    .line 111
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 112
    .line 113
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, Loi4;

    .line 118
    .line 119
    const/4 v3, 0x2

    .line 120
    invoke-direct {v2, p0, v3}, Loi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Lbl2;

    .line 2
    .line 3
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final h0(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "input_method"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final i0()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->s0:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 8
    .line 9
    iget-object v1, v1, Lui4;->e:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "MEDIA_STARRED"

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Lqi4;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, Lqi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Lwn1;->a(Ljava/util/function/Consumer;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 33
    .line 34
    invoke-virtual {v2}, Lui4;->c()Lk03;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, Lri4;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    invoke-direct {v3, v0, v4, p0}, Lri4;-><init>(IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final j0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 6
    .line 7
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 8
    .line 9
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->o0:Lli3;

    .line 16
    .line 17
    iget-object v1, v1, Lli3;->c:Lk03;

    .line 18
    .line 19
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    invoke-virtual {p0, v0, v1}, Lni4;->s(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final k0(Ljava/util/List;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 5
    .line 6
    iget-object v0, v0, Lui4;->e:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, -0x1

    .line 16
    sparse-switch v1, :sswitch_data_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :sswitch_0
    const-string v1, "MEDIA_BY_YEAR"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v2, 0x4

    .line 30
    goto :goto_0

    .line 31
    :sswitch_1
    const-string v1, "MEDIA_BY_GENRES"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const/4 v2, 0x3

    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    const-string v1, "MEDIA_BY_ARTIST"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    const/4 v2, 0x2

    .line 52
    goto :goto_0

    .line 53
    :sswitch_3
    const-string v1, "MEDIA_STARRED"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_4

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    const/4 v2, 0x1

    .line 63
    goto :goto_0

    .line 64
    :sswitch_4
    const-string v1, "MEDIA_BY_GENRE"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    const/4 v2, 0x0

    .line 74
    :goto_0
    const v0, 0x7f130161

    .line 75
    .line 76
    .line 77
    const v1, 0x7f130160

    .line 78
    .line 79
    .line 80
    packed-switch v2, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    :goto_1
    return-void

    .line 84
    :pswitch_0
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 85
    .line 86
    iget-object v2, v2, Lup0;->c:Landroid/view/View;

    .line 87
    .line 88
    check-cast v2, Landroid/widget/TextView;

    .line 89
    .line 90
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 95
    .line 96
    iget v4, v4, Lui4;->n:I

    .line 97
    .line 98
    if-ge v3, v4, :cond_6

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p0, v1, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    goto :goto_2

    .line 117
    :cond_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0, v0, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :goto_2
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 134
    .line 135
    iget-object v0, v0, Lup0;->c:Landroid/view/View;

    .line 136
    .line 137
    check-cast v0, Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p0, v1, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_2
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->l0:Lup0;

    .line 160
    .line 161
    iget-object v2, v2, Lup0;->c:Landroid/view/View;

    .line 162
    .line 163
    check-cast v2, Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 170
    .line 171
    iget v4, v4, Lui4;->o:I

    .line 172
    .line 173
    if-ge v3, v4, :cond_7

    .line 174
    .line 175
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p0, v1, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    goto :goto_3

    .line 192
    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p0, v0, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    :goto_3
    invoke-virtual {v2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    nop

    .line 209
    :sswitch_data_0
    .sparse-switch
        -0x684a2a6a -> :sswitch_4
        -0xe5e209c -> :sswitch_3
        0x55819574 -> :sswitch_2
        0x5f04dd7d -> :sswitch_1
        0x7889e9aa -> :sswitch_0
    .end sparse-switch

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->h0(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Lbl2;

    .line 9
    .line 10
    const-string v1, "TRACKS_OBJECT"

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "ITEM_POSITION"

    .line 17
    .line 18
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 23
    .line 24
    iget-object v2, v2, Lui4;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2}, Lv13;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v0, v1, p1, v2}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 34
    .line 35
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 36
    .line 37
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lau;

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final onMediaLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 2
    .line 3
    iget-object v0, v0, Lui4;->e:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "MEDIA_STARRED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const-string v0, "homemusic_song_sheet_from_liked"

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const v0, 0x7f0a0595

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
