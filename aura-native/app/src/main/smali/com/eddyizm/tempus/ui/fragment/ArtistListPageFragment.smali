.class public Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/oc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/nj;

.field public o0:Ldefpackage/b8;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/kc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->d0()V

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
    new-instance p2, Ldefpackage/w7;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p2, p0, p1, v0}, Ldefpackage/w7;-><init>(Ldefpackage/kc1;Landroid/widget/SearchView;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 31
    .line 32
    .line 33
    const/16 p0, -0x20

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    invoke-virtual {p1, p0, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0065

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a00da

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    move-object v3, p3

    .line 25
    check-cast v3, Lcom/google/android/material/appbar/AppBarLayout;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    if-eqz v3, :cond_8

    .line 29
    .line 30
    const p2, 0x7f0a00e9

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v4, v1

    .line 38
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 39
    .line 40
    if-eqz v4, :cond_8

    .line 41
    .line 42
    const p2, 0x7f0a00ec

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v5, v1

    .line 50
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    if-eqz v5, :cond_8

    .line 53
    .line 54
    const p2, 0x7f0a00ed

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v6, v1

    .line 62
    check-cast v6, Landroid/widget/Button;

    .line 63
    .line 64
    if-eqz v6, :cond_8

    .line 65
    .line 66
    const p2, 0x7f0a0448

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    move-object v7, v1

    .line 74
    check-cast v7, Landroid/widget/TextView;

    .line 75
    .line 76
    if-eqz v7, :cond_8

    .line 77
    .line 78
    const p2, 0x7f0a0449

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    move-object v8, v1

    .line 86
    check-cast v8, Landroid/widget/TextView;

    .line 87
    .line 88
    if-eqz v8, :cond_8

    .line 89
    .line 90
    const p2, 0x7f0a061b

    .line 91
    .line 92
    .line 93
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    move-object v9, v1

    .line 98
    check-cast v9, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 99
    .line 100
    if-eqz v9, :cond_8

    .line 101
    .line 102
    new-instance v1, Ldefpackage/oc1;

    .line 103
    .line 104
    move-object v2, p1

    .line 105
    check-cast v2, Landroid/widget/LinearLayout;

    .line 106
    .line 107
    invoke-direct/range {v1 .. v9}, Ldefpackage/oc1;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 111
    .line 112
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v3, Ldefpackage/bq4;

    .line 129
    .line 130
    invoke-direct {v3, p2, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 131
    .line 132
    .line 133
    const-class p1, Ldefpackage/nj;

    .line 134
    .line 135
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    if-eqz p2, :cond_7

    .line 144
    .line 145
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 146
    .line 147
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {v3, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Ldefpackage/nj;

    .line 156
    .line 157
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->n0:Ldefpackage/nj;

    .line 158
    .line 159
    iget-object p1, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 160
    .line 161
    if-nez p1, :cond_1

    .line 162
    .line 163
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 164
    .line 165
    if-eqz p0, :cond_0

    .line 166
    .line 167
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 168
    .line 169
    if-eqz p0, :cond_0

    .line 170
    .line 171
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 172
    .line 173
    .line 174
    :cond_0
    return-object v2

    .line 175
    :cond_1
    const-string p2, "ARTIST_STARRED"

    .line 176
    .line 177
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p3

    .line 181
    const-string v1, "ARTIST_DOWNLOADED"

    .line 182
    .line 183
    if-eqz p3, :cond_2

    .line 184
    .line 185
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->n0:Ldefpackage/nj;

    .line 186
    .line 187
    iput-object p2, p1, Ldefpackage/nj;->e:Ljava/lang/String;

    .line 188
    .line 189
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 190
    .line 191
    iget-object p1, p1, Ldefpackage/oc1;->f:Landroid/widget/TextView;

    .line 192
    .line 193
    const p3, 0x7f130064

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-eqz p1, :cond_3

    .line 205
    .line 206
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->n0:Ldefpackage/nj;

    .line 207
    .line 208
    iput-object v1, p1, Ldefpackage/nj;->e:Ljava/lang/String;

    .line 209
    .line 210
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 211
    .line 212
    iget-object p1, p1, Ldefpackage/oc1;->f:Landroid/widget/TextView;

    .line 213
    .line 214
    const p3, 0x7f130063

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    .line 218
    .line 219
    .line 220
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 221
    .line 222
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 223
    .line 224
    iget-object p3, p3, Ldefpackage/oc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 225
    .line 226
    invoke-virtual {p1, p3}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 227
    .line 228
    .line 229
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 230
    .line 231
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const/4 p3, 0x1

    .line 236
    if-eqz p1, :cond_4

    .line 237
    .line 238
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 239
    .line 240
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-virtual {p1, p3}, Ldefpackage/l93;->f0(Z)V

    .line 245
    .line 246
    .line 247
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 248
    .line 249
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 254
    .line 255
    .line 256
    :cond_4
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 257
    .line 258
    iget-object p1, p1, Ldefpackage/oc1;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 259
    .line 260
    new-instance v3, Ldefpackage/kj;

    .line 261
    .line 262
    invoke-direct {v3, p0, p3}, Ldefpackage/kj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;I)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 266
    .line 267
    .line 268
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 269
    .line 270
    iget-object p1, p1, Ldefpackage/oc1;->a:Lcom/google/android/material/appbar/AppBarLayout;

    .line 271
    .line 272
    new-instance v3, Ldefpackage/u7;

    .line 273
    .line 274
    const/4 v4, 0x3

    .line 275
    invoke-direct {v3, v4, p0}, Ldefpackage/u7;-><init>(ILdefpackage/kc1;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v3}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 279
    .line 280
    .line 281
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 282
    .line 283
    iget-object p1, p1, Ldefpackage/oc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 284
    .line 285
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 286
    .line 287
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 288
    .line 289
    .line 290
    invoke-direct {v3, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 294
    .line 295
    .line 296
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 297
    .line 298
    iget-object p1, p1, Ldefpackage/oc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 299
    .line 300
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 301
    .line 302
    .line 303
    new-instance p1, Ldefpackage/b8;

    .line 304
    .line 305
    invoke-direct {p1, p0, p3}, Ldefpackage/b8;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;I)V

    .line 306
    .line 307
    .line 308
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->o0:Ldefpackage/b8;

    .line 309
    .line 310
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 311
    .line 312
    iget-object v3, v3, Ldefpackage/oc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 313
    .line 314
    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 315
    .line 316
    .line 317
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->n0:Ldefpackage/nj;

    .line 318
    .line 319
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    new-instance v5, Ldefpackage/k03;

    .line 327
    .line 328
    new-instance v6, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-direct {v5, v6}, Ldefpackage/ad2;-><init>(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    iput-object v5, p1, Ldefpackage/nj;->f:Ldefpackage/k03;

    .line 337
    .line 338
    iget-object v5, p1, Ldefpackage/nj;->e:Ljava/lang/String;

    .line 339
    .line 340
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result p2

    .line 347
    if-nez p2, :cond_6

    .line 348
    .line 349
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result p2

    .line 353
    if-nez p2, :cond_5

    .line 354
    .line 355
    goto :goto_1

    .line 356
    :cond_5
    iget-object p2, p1, Ldefpackage/nj;->d:Ldefpackage/hg3;

    .line 357
    .line 358
    iget-object p2, p2, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast p2, Ldefpackage/ss0;

    .line 361
    .line 362
    iget-object v1, p2, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v1, Ldefpackage/s24;

    .line 365
    .line 366
    invoke-virtual {v1}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    const-string v5, "download"

    .line 371
    .line 372
    filled-new-array {v5}, [Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    new-instance v6, Ldefpackage/os0;

    .line 377
    .line 378
    invoke-direct {v6, p2, p3}, Ldefpackage/os0;-><init>(Ldefpackage/ss0;I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v5, v6}, Ldefpackage/s12;->a([Ljava/lang/String;Ldefpackage/if1;)Ldefpackage/t24;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    new-instance p3, Ldefpackage/lj;

    .line 386
    .line 387
    invoke-direct {p3, v0}, Ldefpackage/lj;-><init>(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p2, v3, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 391
    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_6
    iget-object p2, p1, Ldefpackage/nj;->c:Ldefpackage/pa;

    .line 395
    .line 396
    const/4 p3, -0x1

    .line 397
    invoke-virtual {p2, p3, v0}, Ldefpackage/pa;->y(IZ)Ldefpackage/k03;

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    iput-object p2, p1, Ldefpackage/nj;->f:Ldefpackage/k03;

    .line 402
    .line 403
    :goto_1
    iget-object p1, p1, Ldefpackage/nj;->f:Ldefpackage/k03;

    .line 404
    .line 405
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 406
    .line 407
    .line 408
    move-result-object p2

    .line 409
    new-instance p3, Ldefpackage/d8;

    .line 410
    .line 411
    const/4 v1, 0x5

    .line 412
    invoke-direct {p3, v1, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 416
    .line 417
    .line 418
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 419
    .line 420
    iget-object p1, p1, Ldefpackage/oc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 421
    .line 422
    new-instance p2, Ldefpackage/s7;

    .line 423
    .line 424
    invoke-direct {p2, v4, p0}, Ldefpackage/s7;-><init>(ILjava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 428
    .line 429
    .line 430
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 431
    .line 432
    iget-object p1, p1, Ldefpackage/oc1;->d:Landroid/widget/Button;

    .line 433
    .line 434
    new-instance p2, Ldefpackage/kj;

    .line 435
    .line 436
    invoke-direct {p2, p0, v0}, Ldefpackage/kj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 440
    .line 441
    .line 442
    return-object v2

    .line 443
    :cond_7
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 444
    .line 445
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    return-object p3

    .line 449
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    const-string p1, "Missing required view with ID: "

    .line 458
    .line 459
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object p0

    .line 463
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    return-object p3
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->l0:Ldefpackage/oc1;

    .line 6
    .line 7
    return-void
.end method

.method public final onArtistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00e2

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onArtistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00df

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
