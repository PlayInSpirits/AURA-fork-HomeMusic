.class public Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/rc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/dl3;

.field public o0:Ldefpackage/q7;


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
    const/4 v0, 0x3

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
    .locals 8

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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0080

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
    const p2, 0x7f0a00ae

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
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    if-eqz v3, :cond_9

    .line 29
    .line 30
    const p2, 0x7f0a00da

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
    check-cast v4, Lcom/google/android/material/appbar/AppBarLayout;

    .line 39
    .line 40
    if-eqz v4, :cond_9

    .line 41
    .line 42
    const p2, 0x7f0a04a2

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
    if-eqz v5, :cond_9

    .line 53
    .line 54
    const p2, 0x7f0a04bb

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
    if-eqz v6, :cond_9

    .line 65
    .line 66
    const p2, 0x7f0a061b

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
    check-cast v7, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 75
    .line 76
    if-eqz v7, :cond_9

    .line 77
    .line 78
    new-instance v1, Ldefpackage/rc1;

    .line 79
    .line 80
    move-object v2, p1

    .line 81
    check-cast v2, Landroid/widget/LinearLayout;

    .line 82
    .line 83
    invoke-direct/range {v1 .. v7}, Ldefpackage/rc1;-><init>(Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 87
    .line 88
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    new-instance v3, Ldefpackage/bq4;

    .line 105
    .line 106
    invoke-direct {v3, p2, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 107
    .line 108
    .line 109
    const-class p1, Ldefpackage/dl3;

    .line 110
    .line 111
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-eqz p2, :cond_8

    .line 120
    .line 121
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 122
    .line 123
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {v3, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Ldefpackage/dl3;

    .line 132
    .line 133
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldefpackage/dl3;

    .line 134
    .line 135
    iget-object p1, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 136
    .line 137
    if-nez p1, :cond_1

    .line 138
    .line 139
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 140
    .line 141
    if-eqz p0, :cond_0

    .line 142
    .line 143
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 144
    .line 145
    if-eqz p0, :cond_0

    .line 146
    .line 147
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 148
    .line 149
    .line 150
    :cond_0
    return-object v2

    .line 151
    :cond_1
    const-string p2, "ALL"

    .line 152
    .line 153
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p2, :cond_2

    .line 158
    .line 159
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldefpackage/dl3;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_2
    const-string p2, "DOWNLOADED"

    .line 166
    .line 167
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-eqz p1, :cond_3

    .line 172
    .line 173
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldefpackage/dl3;

    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 179
    .line 180
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 181
    .line 182
    iget-object p2, p2, Ldefpackage/rc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 188
    .line 189
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    const/4 p2, 0x1

    .line 194
    if-eqz p1, :cond_4

    .line 195
    .line 196
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 197
    .line 198
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1, p2}, Ldefpackage/l93;->f0(Z)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 206
    .line 207
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 212
    .line 213
    .line 214
    :cond_4
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 215
    .line 216
    iget-object p1, p1, Ldefpackage/rc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 217
    .line 218
    new-instance p3, Ldefpackage/cl3;

    .line 219
    .line 220
    invoke-direct {p3, p0, v0}, Ldefpackage/cl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 224
    .line 225
    .line 226
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 227
    .line 228
    iget-object p1, p1, Ldefpackage/rc1;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 229
    .line 230
    new-instance p3, Ldefpackage/u7;

    .line 231
    .line 232
    const/16 v1, 0x8

    .line 233
    .line 234
    invoke-direct {p3, v1, p0}, Ldefpackage/u7;-><init>(ILdefpackage/kc1;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, p3}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 238
    .line 239
    .line 240
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 241
    .line 242
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 243
    .line 244
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 245
    .line 246
    .line 247
    move-result-object p3

    .line 248
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iget-boolean v3, v1, Ldefpackage/ut4;->h:Z

    .line 253
    .line 254
    if-nez v3, :cond_5

    .line 255
    .line 256
    invoke-virtual {v1, p3}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 257
    .line 258
    .line 259
    :cond_5
    iget v1, v1, Ldefpackage/ut4;->b:I

    .line 260
    .line 261
    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 262
    .line 263
    invoke-direct {v3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 267
    .line 268
    .line 269
    new-instance v3, Ldefpackage/ek1;

    .line 270
    .line 271
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    iget-boolean v5, v4, Ldefpackage/ut4;->h:Z

    .line 276
    .line 277
    if-nez v5, :cond_6

    .line 278
    .line 279
    invoke-virtual {v4, p3}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 280
    .line 281
    .line 282
    :cond_6
    iget p3, v4, Ldefpackage/ut4;->c:I

    .line 283
    .line 284
    invoke-direct {v3, v1, p3}, Ldefpackage/ek1;-><init>(II)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->i(Ldefpackage/kw3;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 294
    .line 295
    .line 296
    move-result-object p3

    .line 297
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 298
    .line 299
    .line 300
    move-result-object p3

    .line 301
    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 302
    .line 303
    const/high16 v1, 0x41800000    # 16.0f

    .line 304
    .line 305
    mul-float/2addr v1, p3

    .line 306
    float-to-int p3, v1

    .line 307
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-virtual {p1, p3, v1, p3, v3}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 316
    .line 317
    .line 318
    new-instance p3, Ldefpackage/q7;

    .line 319
    .line 320
    invoke-direct {p3, p0, p2}, Ldefpackage/q7;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Z)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 324
    .line 325
    .line 326
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->o0:Ldefpackage/q7;

    .line 327
    .line 328
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldefpackage/dl3;

    .line 329
    .line 330
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 331
    .line 332
    .line 333
    move-result-object p3

    .line 334
    iget-object v1, p1, Ldefpackage/dl3;->e:Ldefpackage/k03;

    .line 335
    .line 336
    invoke-virtual {v1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    if-nez v3, :cond_7

    .line 341
    .line 342
    iget-object p1, p1, Ldefpackage/dl3;->c:Ldefpackage/mm3;

    .line 343
    .line 344
    const/4 v3, -0x1

    .line 345
    invoke-virtual {p1, v3, v0}, Ldefpackage/mm3;->d(IZ)Ldefpackage/k03;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    new-instance v3, Ldefpackage/g7;

    .line 350
    .line 351
    invoke-direct {v3, v1, v0}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p1, p3, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 355
    .line 356
    .line 357
    :cond_7
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 358
    .line 359
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 360
    .line 361
    new-instance p3, Ldefpackage/s7;

    .line 362
    .line 363
    const/4 v0, 0x6

    .line 364
    invoke-direct {p3, v0, p0}, Ldefpackage/s7;-><init>(ILjava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 368
    .line 369
    .line 370
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 371
    .line 372
    iget-object p1, p1, Ldefpackage/rc1;->d:Landroid/widget/Button;

    .line 373
    .line 374
    new-instance p3, Ldefpackage/cl3;

    .line 375
    .line 376
    invoke-direct {p3, p0, p2}, Ldefpackage/cl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;I)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 380
    .line 381
    .line 382
    return-object v2

    .line 383
    :cond_8
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 384
    .line 385
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    return-object p3

    .line 389
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 390
    .line 391
    .line 392
    move-result-object p0

    .line 393
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    const-string p1, "Missing required view with ID: "

    .line 398
    .line 399
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 6
    .line 7
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->n0:Ldefpackage/dl3;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/dl3;->f:Ldefpackage/lu2;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Ldefpackage/d8;

    .line 10
    .line 11
    const/16 v1, 0x11

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final h0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 2
    .line 3
    const-string v0, "input_method"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onPlaylistClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "is_offline"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const v1, 0x7f0a04a0

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v1, p1, v2}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlaylistCatalogueFragment;->h0(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onPlaylistLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a04a1

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
