.class public Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/ml3;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/gh1;

.field public o0:Ldefpackage/ej;

.field public p0:I

.field public q0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->p0:I

    .line 6
    .line 7
    const/16 v0, 0x14

    .line 8
    .line 9
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->q0:I

    .line 10
    .line 11
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
    const/4 v0, 0x2

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
    .locals 9

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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d006e

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
    if-eqz v3, :cond_5

    .line 29
    .line 30
    const p2, 0x7f0a024b

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
    check-cast v4, Landroid/widget/Button;

    .line 39
    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    const p2, 0x7f0a0268

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
    if-eqz v5, :cond_5

    .line 53
    .line 54
    const p2, 0x7f0a026c

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
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 63
    .line 64
    if-eqz v6, :cond_5

    .line 65
    .line 66
    const p2, 0x7f0a026f

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
    check-cast v7, Landroid/widget/Button;

    .line 75
    .line 76
    if-eqz v7, :cond_5

    .line 77
    .line 78
    const p2, 0x7f0a061b

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
    check-cast v8, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 87
    .line 88
    if-eqz v8, :cond_5

    .line 89
    .line 90
    new-instance v1, Ldefpackage/ml3;

    .line 91
    .line 92
    move-object v2, p1

    .line 93
    check-cast v2, Landroid/widget/LinearLayout;

    .line 94
    .line 95
    invoke-direct/range {v1 .. v8}, Ldefpackage/ml3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 99
    .line 100
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v3, Ldefpackage/bq4;

    .line 117
    .line 118
    invoke-direct {v3, p2, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 119
    .line 120
    .line 121
    const-class p1, Ldefpackage/gh1;

    .line 122
    .line 123
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-eqz p2, :cond_4

    .line 132
    .line 133
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 134
    .line 135
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    invoke-virtual {v3, p1, p2}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Ldefpackage/gh1;

    .line 144
    .line 145
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->n0:Ldefpackage/gh1;

    .line 146
    .line 147
    iget-object p2, p1, Ldefpackage/gh1;->d:Ldefpackage/k03;

    .line 148
    .line 149
    if-nez p2, :cond_0

    .line 150
    .line 151
    iget-object p2, p1, Ldefpackage/gh1;->c:Ldefpackage/y41;

    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    const/4 p2, -0x1

    .line 157
    invoke-static {p2, v0}, Ldefpackage/y41;->j(IZ)Ldefpackage/k03;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    iput-object p2, p1, Ldefpackage/gh1;->d:Ldefpackage/k03;

    .line 162
    .line 163
    :cond_0
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->a(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    iget-boolean p3, p1, Ldefpackage/ut4;->i:Z

    .line 183
    .line 184
    if-nez p3, :cond_1

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->a(Landroid/content/Context;)V

    .line 187
    .line 188
    .line 189
    :cond_1
    iget p1, p1, Ldefpackage/ut4;->d:I

    .line 190
    .line 191
    iput p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->p0:I

    .line 192
    .line 193
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    iget-boolean p3, p1, Ldefpackage/ut4;->i:Z

    .line 202
    .line 203
    if-nez p3, :cond_2

    .line 204
    .line 205
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->a(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    :cond_2
    iget p1, p1, Ldefpackage/ut4;->e:I

    .line 209
    .line 210
    iput p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->q0:I

    .line 211
    .line 212
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 213
    .line 214
    iget-object p1, p1, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p1, Landroid/widget/Button;

    .line 217
    .line 218
    new-instance p2, Ldefpackage/fh1;

    .line 219
    .line 220
    const/4 p3, 0x1

    .line 221
    invoke-direct {p2, p0, p3}, Ldefpackage/fh1;-><init>(Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 228
    .line 229
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 230
    .line 231
    iget-object p2, p2, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 236
    .line 237
    .line 238
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 239
    .line 240
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-eqz p1, :cond_3

    .line 245
    .line 246
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 247
    .line 248
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-virtual {p1, p3}, Ldefpackage/l93;->f0(Z)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 256
    .line 257
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 262
    .line 263
    .line 264
    :cond_3
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 265
    .line 266
    iget-object p1, p1, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 269
    .line 270
    new-instance p2, Ldefpackage/fh1;

    .line 271
    .line 272
    const/4 v1, 0x2

    .line 273
    invoke-direct {p2, p0, v1}, Ldefpackage/fh1;-><init>(Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;I)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 277
    .line 278
    .line 279
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 280
    .line 281
    iget-object p1, p1, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 284
    .line 285
    new-instance p2, Ldefpackage/u7;

    .line 286
    .line 287
    const/4 v3, 0x5

    .line 288
    invoke-direct {p2, v3, p0}, Ldefpackage/u7;-><init>(ILdefpackage/kc1;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, p2}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 292
    .line 293
    .line 294
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 295
    .line 296
    iget-object p1, p1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 299
    .line 300
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 301
    .line 302
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 303
    .line 304
    .line 305
    iget v4, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->p0:I

    .line 306
    .line 307
    invoke-direct {p2, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 311
    .line 312
    .line 313
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 314
    .line 315
    iget-object p1, p1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 318
    .line 319
    new-instance p2, Ldefpackage/ek1;

    .line 320
    .line 321
    iget v4, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->p0:I

    .line 322
    .line 323
    iget v5, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->q0:I

    .line 324
    .line 325
    invoke-direct {p2, v4, v5}, Ldefpackage/ek1;-><init>(II)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->i(Ldefpackage/kw3;)V

    .line 329
    .line 330
    .line 331
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 332
    .line 333
    iget-object p1, p1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 336
    .line 337
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 338
    .line 339
    .line 340
    new-instance p1, Ldefpackage/ej;

    .line 341
    .line 342
    invoke-direct {p1, p0}, Ldefpackage/ej;-><init>(Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;)V

    .line 343
    .line 344
    .line 345
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Ldefpackage/ej;

    .line 346
    .line 347
    iput v1, p1, Ldefpackage/dw3;->p:I

    .line 348
    .line 349
    iget-object p1, p1, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 350
    .line 351
    invoke-virtual {p1}, Ldefpackage/ew3;->g()V

    .line 352
    .line 353
    .line 354
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 355
    .line 356
    iget-object p1, p1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 359
    .line 360
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->o0:Ldefpackage/ej;

    .line 361
    .line 362
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 363
    .line 364
    .line 365
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->n0:Ldefpackage/gh1;

    .line 366
    .line 367
    iget-object p1, p1, Ldefpackage/gh1;->d:Ldefpackage/k03;

    .line 368
    .line 369
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    new-instance p3, Ldefpackage/d8;

    .line 374
    .line 375
    const/16 v1, 0xb

    .line 376
    .line 377
    invoke-direct {p3, v1, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 381
    .line 382
    .line 383
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 384
    .line 385
    iget-object p1, p1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 388
    .line 389
    new-instance p2, Ldefpackage/s7;

    .line 390
    .line 391
    invoke-direct {p2, v3, p0}, Ldefpackage/s7;-><init>(ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 395
    .line 396
    .line 397
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 398
    .line 399
    iget-object p1, p1, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast p1, Landroid/widget/Button;

    .line 402
    .line 403
    new-instance p2, Ldefpackage/fh1;

    .line 404
    .line 405
    invoke-direct {p2, p0, v0}, Ldefpackage/fh1;-><init>(Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    return-object v2

    .line 412
    :cond_4
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 413
    .line 414
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    return-object p3

    .line 418
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p0

    .line 426
    const-string p1, "Missing required view with ID: "

    .line 427
    .line 428
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->l0:Ldefpackage/ml3;

    .line 6
    .line 7
    return-void
.end method

.method public final h0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

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

.method public final onGenreClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0a0596

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->h0(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
