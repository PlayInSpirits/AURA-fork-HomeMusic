.class public Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/lv4;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/y7;

.field public o0:I

.field public p0:I

.field public q0:Ldefpackage/q7;

.field public r0:Ljava/lang/String;

.field public s0:Ljava/util/List;


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
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->o0:I

    .line 6
    .line 7
    const/16 v0, 0x14

    .line 8
    .line 9
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->p0:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/kc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->d0()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "album_sort_order"

    .line 19
    .line 20
    const-string v1, "ALBUM_ORDER_BY_NAME"

    .line 21
    .line 22
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object v1, p1

    .line 30
    :goto_0
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v2, Ldefpackage/bq4;

    .line 49
    .line 50
    invoke-direct {v2, v0, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 51
    .line 52
    .line 53
    const-class p1, Ldefpackage/y7;

    .line 54
    .line 55
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v2, p1, v0}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Ldefpackage/y7;

    .line 76
    .line 77
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->n0:Ldefpackage/y7;

    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    iput p0, p1, Ldefpackage/y7;->e:I

    .line 81
    .line 82
    const/4 p0, 0x1

    .line 83
    iput p0, p1, Ldefpackage/y7;->f:I

    .line 84
    .line 85
    iget-object p0, p1, Ldefpackage/y7;->c:Ldefpackage/k03;

    .line 86
    .line 87
    new-instance v0, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ldefpackage/y7;->c()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_1
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 100
    .line 101
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
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
    const/4 v0, 0x0

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
    invoke-virtual {p1, p0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0061

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
    const p2, 0x7f0a00a6

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
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    const p2, 0x7f0a00ae

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    move-object v4, p3

    .line 37
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    const p2, 0x7f0a00b0

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    move-object v5, p3

    .line 49
    check-cast v5, Landroid/widget/ProgressBar;

    .line 50
    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    const p2, 0x7f0a00b2

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    move-object v6, p3

    .line 61
    check-cast v6, Landroid/widget/Button;

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    const p2, 0x7f0a009e

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    move-object v7, p3

    .line 73
    check-cast v7, Landroid/widget/TextView;

    .line 74
    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    const p2, 0x7f0a00da

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    move-object v8, p3

    .line 85
    check-cast v8, Lcom/google/android/material/appbar/AppBarLayout;

    .line 86
    .line 87
    if-eqz v8, :cond_3

    .line 88
    .line 89
    const p2, 0x7f0a05a1

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    check-cast p3, Landroid/widget/LinearLayout;

    .line 97
    .line 98
    if-eqz p3, :cond_3

    .line 99
    .line 100
    const p2, 0x7f0a061b

    .line 101
    .line 102
    .line 103
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    move-object v9, p3

    .line 108
    check-cast v9, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 109
    .line 110
    if-eqz v9, :cond_3

    .line 111
    .line 112
    new-instance v1, Ldefpackage/lv4;

    .line 113
    .line 114
    move-object v2, p1

    .line 115
    check-cast v2, Landroid/widget/LinearLayout;

    .line 116
    .line 117
    invoke-direct/range {v1 .. v9}, Ldefpackage/lv4;-><init>(Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ProgressBar;Landroid/widget/Button;Landroid/widget/TextView;Lcom/google/android/material/appbar/AppBarLayout;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 121
    .line 122
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    iget-boolean p3, p1, Ldefpackage/ut4;->h:Z

    .line 142
    .line 143
    if-nez p3, :cond_0

    .line 144
    .line 145
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 146
    .line 147
    .line 148
    :cond_0
    iget p1, p1, Ldefpackage/ut4;->b:I

    .line 149
    .line 150
    iput p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->o0:I

    .line 151
    .line 152
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iget-boolean p3, p1, Ldefpackage/ut4;->h:Z

    .line 161
    .line 162
    if-nez p3, :cond_1

    .line 163
    .line 164
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 165
    .line 166
    .line 167
    :cond_1
    iget p1, p1, Ldefpackage/ut4;->c:I

    .line 168
    .line 169
    iput p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->p0:I

    .line 170
    .line 171
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 172
    .line 173
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 174
    .line 175
    iget-object p2, p2, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 178
    .line 179
    invoke-virtual {p1, p2}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 183
    .line 184
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const/4 p2, 0x1

    .line 189
    if-eqz p1, :cond_2

    .line 190
    .line 191
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 192
    .line 193
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {p1, p2}, Ldefpackage/l93;->f0(Z)V

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 201
    .line 202
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 207
    .line 208
    .line 209
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 210
    .line 211
    iget-object p1, p1, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 214
    .line 215
    new-instance p3, Ldefpackage/t7;

    .line 216
    .line 217
    invoke-direct {p3, p0, p2}, Ldefpackage/t7;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    .line 222
    .line 223
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 224
    .line 225
    iget-object p1, p1, Ldefpackage/lv4;->s:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 228
    .line 229
    new-instance p3, Ldefpackage/u7;

    .line 230
    .line 231
    invoke-direct {p3, v0, p0}, Ldefpackage/u7;-><init>(ILdefpackage/kc1;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1, p3}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 238
    .line 239
    iget-object p1, p1, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 242
    .line 243
    new-instance p3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 244
    .line 245
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 246
    .line 247
    .line 248
    iget v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->o0:I

    .line 249
    .line 250
    invoke-direct {p3, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 257
    .line 258
    iget-object p1, p1, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 261
    .line 262
    new-instance p3, Ldefpackage/ek1;

    .line 263
    .line 264
    iget v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->o0:I

    .line 265
    .line 266
    iget v3, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->p0:I

    .line 267
    .line 268
    invoke-direct {p3, v1, v3}, Ldefpackage/ek1;-><init>(II)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->i(Ldefpackage/kw3;)V

    .line 272
    .line 273
    .line 274
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 275
    .line 276
    iget-object p1, p1, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 279
    .line 280
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 281
    .line 282
    .line 283
    new-instance p1, Ldefpackage/q7;

    .line 284
    .line 285
    invoke-direct {p1, p0}, Ldefpackage/q7;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;)V

    .line 286
    .line 287
    .line 288
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->q0:Ldefpackage/q7;

    .line 289
    .line 290
    const/4 p3, 0x2

    .line 291
    iput p3, p1, Ldefpackage/dw3;->p:I

    .line 292
    .line 293
    iget-object p1, p1, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 294
    .line 295
    invoke-virtual {p1}, Ldefpackage/ew3;->g()V

    .line 296
    .line 297
    .line 298
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 299
    .line 300
    iget-object p1, p1, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 303
    .line 304
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->q0:Ldefpackage/q7;

    .line 305
    .line 306
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 307
    .line 308
    .line 309
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->n0:Ldefpackage/y7;

    .line 310
    .line 311
    iget-object p1, p1, Ldefpackage/y7;->c:Ldefpackage/k03;

    .line 312
    .line 313
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 314
    .line 315
    .line 316
    move-result-object p3

    .line 317
    new-instance v1, Ldefpackage/r7;

    .line 318
    .line 319
    invoke-direct {v1, p0, p2}, Ldefpackage/r7;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, p3, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 323
    .line 324
    .line 325
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 326
    .line 327
    iget-object p1, p1, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 330
    .line 331
    new-instance p2, Ldefpackage/s7;

    .line 332
    .line 333
    invoke-direct {p2, v0, p0}, Ldefpackage/s7;-><init>(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 337
    .line 338
    .line 339
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 340
    .line 341
    iget-object p1, p1, Ldefpackage/lv4;->r:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast p1, Landroid/widget/Button;

    .line 344
    .line 345
    new-instance p2, Ldefpackage/t7;

    .line 346
    .line 347
    invoke-direct {p2, p0, v0}, Ldefpackage/t7;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 351
    .line 352
    .line 353
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->n0:Ldefpackage/y7;

    .line 354
    .line 355
    iget-object p1, p1, Ldefpackage/y7;->d:Ldefpackage/k03;

    .line 356
    .line 357
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    new-instance p3, Ldefpackage/r7;

    .line 362
    .line 363
    invoke-direct {p3, p0, v0}, Ldefpackage/r7;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 367
    .line 368
    .line 369
    return-object v2

    .line 370
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    const-string p1, "Missing required view with ID: "

    .line 379
    .line 380
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    const/4 p0, 0x0

    .line 388
    return-object p0
.end method

.method public final I()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->n0:Ldefpackage/y7;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iput v0, p0, Ldefpackage/y7;->f:I

    .line 8
    .line 9
    return-void
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 6
    .line 7
    return-void
.end method

.method public final P()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const-string v0, "album_sort_order"

    .line 5
    .line 6
    const-string v1, "ALBUM_ORDER_BY_NAME"

    .line 7
    .line 8
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    :goto_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->s0:Ljava/util/List;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->h0(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    const-string p0, "AlbumCatalogueFragment"

    .line 39
    .line 40
    const-string v0, "onResume - Cannot re-sort, missing data"

    .line 41
    .line 42
    invoke-static {p0, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final h0(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->s0:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->q0:Ldefpackage/q7;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iput-object v2, v1, Ldefpackage/q7;->t:Ljava/util/List;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v1, Ldefpackage/q7;->s:Ljava/util/List;

    .line 25
    .line 26
    invoke-virtual {v1}, Ldefpackage/dw3;->d()V

    .line 27
    .line 28
    .line 29
    if-eqz p1, :cond_9

    .line 30
    .line 31
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->q0:Ldefpackage/q7;

    .line 32
    .line 33
    iget-object v0, p0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x5

    .line 44
    const/4 v3, 0x4

    .line 45
    const/4 v4, 0x3

    .line 46
    const/4 v5, 0x1

    .line 47
    const/4 v6, 0x2

    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, -0x1

    .line 50
    sparse-switch v1, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :sswitch_0
    const-string v1, "ALBUM_ORDER_BY_ARTIST"

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v8, 0x6

    .line 64
    goto :goto_0

    .line 65
    :sswitch_1
    const-string v1, "ALBUM_ORDER_BY_MOST_PLAYED"

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-nez p1, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move v8, v2

    .line 75
    goto :goto_0

    .line 76
    :sswitch_2
    const-string v1, "ALBUM_ORDER_BY_YEAR"

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move v8, v3

    .line 86
    goto :goto_0

    .line 87
    :sswitch_3
    const-string v1, "ALBUM_ORDER_BY_NAME"

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-nez p1, :cond_5

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move v8, v4

    .line 97
    goto :goto_0

    .line 98
    :sswitch_4
    const-string v1, "ALBUM_ORDER_BY_RECENTLY_PLAYED"

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_6

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_6
    move v8, v6

    .line 108
    goto :goto_0

    .line 109
    :sswitch_5
    const-string v1, "ALBUM_ORDER_BY_RANDOM"

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_7

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    move v8, v5

    .line 119
    goto :goto_0

    .line 120
    :sswitch_6
    const-string v1, "ALBUM_ORDER_BY_RECENTLY_ADDED"

    .line 121
    .line 122
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_8

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_8
    move v8, v7

    .line 130
    :goto_0
    sget-object p1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 131
    .line 132
    packed-switch v8, :pswitch_data_0

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :pswitch_0
    new-instance v1, Ldefpackage/m7;

    .line 138
    .line 139
    invoke-direct {v1, v5}, Ldefpackage/m7;-><init>(I)V

    .line 140
    .line 141
    .line 142
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance v1, Ldefpackage/m7;

    .line 147
    .line 148
    invoke-direct {v1, v6}, Ldefpackage/m7;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1, v1}, Ljava/util/Comparator;->thenComparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :pswitch_1
    new-instance p1, Ldefpackage/m7;

    .line 160
    .line 161
    invoke-direct {p1, v2}, Ldefpackage/m7;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 172
    .line 173
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_2
    new-instance p1, Ldefpackage/m7;

    .line 178
    .line 179
    invoke-direct {p1, v6}, Ldefpackage/m7;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-static {p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :pswitch_3
    new-instance v1, Ldefpackage/m7;

    .line 191
    .line 192
    invoke-direct {v1, v7}, Ldefpackage/m7;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 200
    .line 201
    .line 202
    goto :goto_1

    .line 203
    :pswitch_4
    new-instance p1, Ldefpackage/m7;

    .line 204
    .line 205
    invoke-direct {p1, v3}, Ldefpackage/m7;-><init>(I)V

    .line 206
    .line 207
    .line 208
    new-instance v1, Ldefpackage/n7;

    .line 209
    .line 210
    invoke-direct {v1, v7}, Ldefpackage/n7;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-static {v1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-static {p1, v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 222
    .line 223
    .line 224
    iget-object p1, p0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 225
    .line 226
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 227
    .line 228
    .line 229
    goto :goto_1

    .line 230
    :pswitch_5
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 231
    .line 232
    .line 233
    goto :goto_1

    .line 234
    :pswitch_6
    new-instance p1, Ldefpackage/m7;

    .line 235
    .line 236
    invoke-direct {p1, v4}, Ldefpackage/m7;-><init>(I)V

    .line 237
    .line 238
    .line 239
    new-instance v1, Ldefpackage/n7;

    .line 240
    .line 241
    invoke-direct {v1, v7}, Ldefpackage/n7;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-static {v1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {p1, v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 256
    .line 257
    invoke-static {p1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 258
    .line 259
    .line 260
    :goto_1
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 261
    .line 262
    .line 263
    :cond_9
    :goto_2
    return-void

    .line 264
    nop

    .line 265
    :sswitch_data_0
    .sparse-switch
        -0x766fb4d0 -> :sswitch_6
        -0x6492ac16 -> :sswitch_5
        -0x3d7e897d -> :sswitch_4
        -0x21f1748e -> :sswitch_3
        -0x21ec66dc -> :sswitch_2
        -0x1efdabb8 -> :sswitch_1
        0x7f5d4e6e -> :sswitch_0
    .end sparse-switch

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i0(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

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

.method public final j0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, -0x1

    .line 20
    sparse-switch v3, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :sswitch_0
    const-string v3, "ALBUM_ORDER_BY_ARTIST"

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    const/4 v4, 0x6

    .line 34
    goto :goto_0

    .line 35
    :sswitch_1
    const-string v3, "ALBUM_ORDER_BY_MOST_PLAYED"

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v4, 0x5

    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v3, "ALBUM_ORDER_BY_YEAR"

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    const/4 v4, 0x4

    .line 56
    goto :goto_0

    .line 57
    :sswitch_3
    const-string v3, "ALBUM_ORDER_BY_NAME"

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_5
    const/4 v4, 0x3

    .line 67
    goto :goto_0

    .line 68
    :sswitch_4
    const-string v3, "ALBUM_ORDER_BY_RECENTLY_PLAYED"

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_6

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_6
    const/4 v4, 0x2

    .line 78
    goto :goto_0

    .line 79
    :sswitch_5
    const-string v3, "ALBUM_ORDER_BY_RANDOM"

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_7

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_7
    const/4 v4, 0x1

    .line 89
    goto :goto_0

    .line 90
    :sswitch_6
    const-string v3, "ALBUM_ORDER_BY_RECENTLY_ADDED"

    .line 91
    .line 92
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_8

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_8
    move v4, v1

    .line 100
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_0
    const v0, 0x7f130331

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    goto :goto_1

    .line 112
    :pswitch_1
    const v0, 0x7f130345

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    goto :goto_1

    .line 120
    :pswitch_2
    const v0, 0x7f13034c

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    goto :goto_1

    .line 128
    :pswitch_3
    const v0, 0x7f130347

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    goto :goto_1

    .line 136
    :pswitch_4
    const v0, 0x7f13034a

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    goto :goto_1

    .line 144
    :pswitch_5
    const v0, 0x7f130348

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    goto :goto_1

    .line 152
    :pswitch_6
    const v0, 0x7f130349

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    :goto_1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 160
    .line 161
    iget-object v0, v0, Ldefpackage/lv4;->p:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Landroid/widget/TextView;

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 169
    .line 170
    iget-object p0, p0, Ldefpackage/lv4;->p:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast p0, Landroid/widget/TextView;

    .line 173
    .line 174
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    nop

    .line 179
    :sswitch_data_0
    .sparse-switch
        -0x766fb4d0 -> :sswitch_6
        -0x6492ac16 -> :sswitch_5
        -0x3d7e897d -> :sswitch_4
        -0x21f1748e -> :sswitch_3
        -0x21ec66dc -> :sswitch_2
        -0x1efdabb8 -> :sswitch_1
        0x7f5d4e6e -> :sswitch_0
    .end sparse-switch

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
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
    const v1, 0x7f0a009f

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
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->i0(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onAlbumLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a009b

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
