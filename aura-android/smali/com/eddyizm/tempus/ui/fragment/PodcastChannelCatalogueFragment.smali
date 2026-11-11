.class public Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lbq4;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lwm3;

.field public o0:Lej;


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
    new-instance p2, Lw7;

    .line 25
    .line 26
    const/4 v0, 0x5

    .line 27
    invoke-direct {p2, p0, p1, v0}, Lw7;-><init>(Lkc1;Landroid/widget/SearchView;I)V

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
    .locals 7

    .line 1
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0083

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
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

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
    if-eqz v3, :cond_3

    .line 29
    .line 30
    const p2, 0x7f0a04cd

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object v4, v1

    .line 38
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    const p2, 0x7f0a04d1

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    move-object v5, v1

    .line 50
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 51
    .line 52
    if-eqz v5, :cond_3

    .line 53
    .line 54
    const p2, 0x7f0a061b

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    move-object v6, v1

    .line 62
    check-cast v6, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 63
    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    new-instance v1, Lbq4;

    .line 67
    .line 68
    move-object v2, p1

    .line 69
    check-cast v2, Landroid/widget/LinearLayout;

    .line 70
    .line 71
    invoke-direct/range {v1 .. v6}, Lbq4;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 75
    .line 76
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {p1, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance v3, Lbq4;

    .line 93
    .line 94
    invoke-direct {v3, p2, v1, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 95
    .line 96
    .line 97
    const-class p1, Lwm3;

    .line 98
    .line 99
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    if-eqz p2, :cond_2

    .line 108
    .line 109
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 110
    .line 111
    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {v3, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Lwm3;

    .line 120
    .line 121
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->n0:Lwm3;

    .line 122
    .line 123
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 124
    .line 125
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 126
    .line 127
    iget-object p2, p2, Lbq4;->q:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 135
    .line 136
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/4 p2, 0x1

    .line 141
    if-eqz p1, :cond_0

    .line 142
    .line 143
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 144
    .line 145
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {p1, p2}, Ll93;->f0(Z)V

    .line 150
    .line 151
    .line 152
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 153
    .line 154
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ll93;->g0()V

    .line 159
    .line 160
    .line 161
    :cond_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 162
    .line 163
    iget-object p1, p1, Lbq4;->q:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 166
    .line 167
    new-instance v1, Lbj3;

    .line 168
    .line 169
    const/16 v3, 0xb

    .line 170
    .line 171
    invoke-direct {v1, v3, p0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 178
    .line 179
    iget-object p1, p1, Lbq4;->n:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 182
    .line 183
    new-instance v1, Lu7;

    .line 184
    .line 185
    const/16 v3, 0x9

    .line 186
    .line 187
    invoke-direct {v1, v3, p0}, Lu7;-><init>(ILkc1;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->a(Laf;)V

    .line 191
    .line 192
    .line 193
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 194
    .line 195
    iget-object p1, p1, Lbq4;->o:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 198
    .line 199
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 200
    .line 201
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    const/4 v3, 0x2

    .line 205
    invoke-direct {v1, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 212
    .line 213
    iget-object p1, p1, Lbq4;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 216
    .line 217
    new-instance v1, Lek1;

    .line 218
    .line 219
    const/16 v4, 0x14

    .line 220
    .line 221
    invoke-direct {v1, v3, v4}, Lek1;-><init>(II)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 228
    .line 229
    iget-object p1, p1, Lbq4;->o:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 234
    .line 235
    .line 236
    new-instance p1, Lej;

    .line 237
    .line 238
    invoke-direct {p1, p0}, Lej;-><init>(Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;)V

    .line 239
    .line 240
    .line 241
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->o0:Lej;

    .line 242
    .line 243
    iput v3, p1, Ldw3;->p:I

    .line 244
    .line 245
    iget-object p1, p1, Ldw3;->n:Lew3;

    .line 246
    .line 247
    invoke-virtual {p1}, Lew3;->g()V

    .line 248
    .line 249
    .line 250
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 251
    .line 252
    iget-object p1, p1, Lbq4;->o:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 255
    .line 256
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->o0:Lej;

    .line 257
    .line 258
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 259
    .line 260
    .line 261
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->n0:Lwm3;

    .line 262
    .line 263
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    iget-object v1, p1, Lwm3;->d:Lk03;

    .line 268
    .line 269
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    if-nez v3, :cond_1

    .line 274
    .line 275
    iget-object p1, p1, Lwm3;->c:Lhh3;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-static {p3, v0}, Lhh3;->l(Ljava/lang/String;Z)Lk03;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    new-instance p3, Lg7;

    .line 285
    .line 286
    invoke-direct {p3, v1, v0}, Lg7;-><init>(Lk03;I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, p2, p3}, Lad2;->e(Lba2;La83;)V

    .line 290
    .line 291
    .line 292
    :cond_1
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    new-instance p2, Ld8;

    .line 297
    .line 298
    const/16 p3, 0x16

    .line 299
    .line 300
    invoke-direct {p2, p3, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, p1, p2}, Lad2;->e(Lba2;La83;)V

    .line 304
    .line 305
    .line 306
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 307
    .line 308
    iget-object p1, p1, Lbq4;->o:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 311
    .line 312
    new-instance p2, Ls7;

    .line 313
    .line 314
    const/16 p3, 0x8

    .line 315
    .line 316
    invoke-direct {p2, p3, p0}, Ls7;-><init>(ILjava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 320
    .line 321
    .line 322
    return-object v2

    .line 323
    :cond_2
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 324
    .line 325
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-object p3

    .line 329
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    const-string p1, "Missing required view with ID: "

    .line 338
    .line 339
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    return-object p3
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->l0:Lbq4;

    .line 6
    .line 7
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

.method public final onPodcastChannelClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0a04ca

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->h0(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onPodcastChannelLongClick(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method
