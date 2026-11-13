.class public Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/yd1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/im3;

.field public o0:Ldefpackage/li3;

.field public p0:Ldefpackage/ni4;

.field public q0:Ldefpackage/f9;

.field public r0:Ldefpackage/bl2;

.field public s0:Z

.field public t0:Z

.field public u0:Ljava/util/List;

.field public v0:Z


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
    .locals 8

    .line 1
    const v0, 0x7f0f000e

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
    move-result-object p2

    .line 14
    invoke-interface {p2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Landroid/widget/SearchView;

    .line 19
    .line 20
    const/4 v0, 0x6

    .line 21
    invoke-virtual {p2, v0}, Landroid/widget/SearchView;->setImeOptions(I)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Ldefpackage/w7;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-direct {v0, p0, p2, v1}, Ldefpackage/w7;-><init>(Ldefpackage/kc1;Landroid/widget/SearchView;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 31
    .line 32
    .line 33
    const/16 v0, -0x20

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {p2, v0, v2, v2, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 40
    .line 41
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v3, Ldefpackage/k03;

    .line 49
    .line 50
    invoke-direct {v3}, Ldefpackage/ad2;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v4, p2, Ldefpackage/im3;->c:Ldefpackage/mm3;

    .line 54
    .line 55
    iget-object v4, v4, Ldefpackage/mm3;->a:Ldefpackage/hg3;

    .line 56
    .line 57
    iget-object v4, v4, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v4, Ldefpackage/s24;

    .line 60
    .line 61
    invoke-virtual {v4}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    const-string v5, "pinned_playlist"

    .line 66
    .line 67
    filled-new-array {v5}, [Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-instance v6, Ldefpackage/k52;

    .line 72
    .line 73
    const/16 v7, 0x1a

    .line 74
    .line 75
    invoke-direct {v6, v7}, Ldefpackage/k52;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5, v6}, Ldefpackage/s12;->a([Ljava/lang/String;Ldefpackage/if1;)Ldefpackage/t24;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    new-instance v5, Ldefpackage/f7;

    .line 83
    .line 84
    invoke-direct {v5, v1, p2, v3}, Ldefpackage/f7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v0, v5}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    new-instance v0, Ldefpackage/cm3;

    .line 95
    .line 96
    invoke-direct {v0, v2, p1}, Ldefpackage/cm3;-><init>(ILandroid/view/Menu;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, p2, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 103
    .line 104
    invoke-virtual {p2}, Ldefpackage/im3;->f()Ldefpackage/ad2;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    new-instance v0, Ldefpackage/cm3;

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    invoke-direct {v0, v1, p1}, Ldefpackage/cm3;-><init>(ILandroid/view/Menu;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2, p0, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 25

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-virtual {v2}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v0, 0x7f0d0082

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    move-object/from16 v3, p2

    .line 18
    .line 19
    invoke-virtual {v1, v0, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f0a00a4

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Landroid/widget/TextView;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_13

    .line 34
    .line 35
    const v1, 0x7f0a00d1

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    move-object v9, v3

    .line 43
    check-cast v9, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 44
    .line 45
    if-eqz v9, :cond_13

    .line 46
    .line 47
    const v1, 0x7f0a00da

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lcom/google/android/material/appbar/AppBarLayout;

    .line 55
    .line 56
    if-eqz v3, :cond_13

    .line 57
    .line 58
    const v1, 0x7f0a011c

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    if-eqz v10, :cond_13

    .line 66
    .line 67
    const v1, 0x7f0a01ed

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    move-object v11, v3

    .line 75
    check-cast v11, Landroid/widget/TextView;

    .line 76
    .line 77
    if-eqz v11, :cond_13

    .line 78
    .line 79
    const v1, 0x7f0a04a9

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    move-object v12, v3

    .line 87
    check-cast v12, Landroid/widget/ImageView;

    .line 88
    .line 89
    if-eqz v12, :cond_13

    .line 90
    .line 91
    const v1, 0x7f0a04aa

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    move-object v13, v3

    .line 99
    check-cast v13, Landroid/widget/ImageView;

    .line 100
    .line 101
    if-eqz v13, :cond_13

    .line 102
    .line 103
    const v1, 0x7f0a04ab

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    move-object v14, v3

    .line 111
    check-cast v14, Landroid/widget/ImageView;

    .line 112
    .line 113
    if-eqz v14, :cond_13

    .line 114
    .line 115
    const v1, 0x7f0a04ac

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    move-object v15, v3

    .line 123
    check-cast v15, Landroid/widget/ImageView;

    .line 124
    .line 125
    if-eqz v15, :cond_13

    .line 126
    .line 127
    const v1, 0x7f0a04b8

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object/from16 v16, v3

    .line 135
    .line 136
    check-cast v16, Landroid/widget/TextView;

    .line 137
    .line 138
    if-eqz v16, :cond_13

    .line 139
    .line 140
    const v1, 0x7f0a04b9

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    move-object/from16 v17, v1

    .line 148
    .line 149
    check-cast v17, Landroidx/core/widget/NestedScrollView;

    .line 150
    .line 151
    const v1, 0x7f0a04ba

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 159
    .line 160
    if-eqz v3, :cond_13

    .line 161
    .line 162
    const v1, 0x7f0a04bd

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    move-object/from16 v18, v3

    .line 170
    .line 171
    check-cast v18, Landroid/widget/TextView;

    .line 172
    .line 173
    if-eqz v18, :cond_13

    .line 174
    .line 175
    const v1, 0x7f0a04bf

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Landroid/widget/LinearLayout;

    .line 183
    .line 184
    if-eqz v3, :cond_13

    .line 185
    .line 186
    const v1, 0x7f0a04c0

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    move-object/from16 v19, v3

    .line 194
    .line 195
    check-cast v19, Landroid/widget/Button;

    .line 196
    .line 197
    if-eqz v19, :cond_13

    .line 198
    .line 199
    const v1, 0x7f0a04c1

    .line 200
    .line 201
    .line 202
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    move-object/from16 v20, v3

    .line 207
    .line 208
    check-cast v20, Landroid/widget/Button;

    .line 209
    .line 210
    if-eqz v20, :cond_13

    .line 211
    .line 212
    const v1, 0x7f0a04c4

    .line 213
    .line 214
    .line 215
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    move-object/from16 v21, v3

    .line 220
    .line 221
    check-cast v21, Landroid/widget/TextView;

    .line 222
    .line 223
    if-eqz v21, :cond_13

    .line 224
    .line 225
    const v1, 0x7f0a059e

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    move-object/from16 v22, v3

    .line 233
    .line 234
    check-cast v22, Landroidx/recyclerview/widget/RecyclerView;

    .line 235
    .line 236
    if-eqz v22, :cond_13

    .line 237
    .line 238
    const v1, 0x7f0a059f

    .line 239
    .line 240
    .line 241
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    move-object/from16 v23, v3

    .line 246
    .line 247
    check-cast v23, Landroid/widget/ProgressBar;

    .line 248
    .line 249
    if-eqz v23, :cond_13

    .line 250
    .line 251
    const v1, 0x7f0a064b

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v1}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 255
    .line 256
    .line 257
    move-result-object v24

    .line 258
    if-eqz v24, :cond_13

    .line 259
    .line 260
    new-instance v7, Ldefpackage/yd1;

    .line 261
    .line 262
    move-object v8, v0

    .line 263
    check-cast v8, Landroid/widget/LinearLayout;

    .line 264
    .line 265
    invoke-direct/range {v7 .. v24}, Ldefpackage/yd1;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/appbar/MaterialToolbar;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/core/widget/NestedScrollView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/ProgressBar;Landroid/view/View;)V

    .line 266
    .line 267
    .line 268
    iput-object v7, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 269
    .line 270
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v0}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-static {v0}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-static {v0, v3}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-instance v5, Ldefpackage/bq4;

    .line 287
    .line 288
    invoke-direct {v5, v1, v3, v0}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 289
    .line 290
    .line 291
    const-class v0, Ldefpackage/im3;

    .line 292
    .line 293
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    const-string v3, "Local and anonymous classes can not be ViewModels"

    .line 302
    .line 303
    if-eqz v1, :cond_12

    .line 304
    .line 305
    const-string v7, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 306
    .line 307
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-virtual {v5, v0, v1}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    check-cast v0, Ldefpackage/im3;

    .line 316
    .line 317
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 318
    .line 319
    invoke-virtual {v2}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    invoke-static {v0}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-static {v0, v5}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    new-instance v9, Ldefpackage/bq4;

    .line 336
    .line 337
    invoke-direct {v9, v1, v5, v0}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 338
    .line 339
    .line 340
    const-class v0, Ldefpackage/li3;

    .line 341
    .line 342
    invoke-static {v0}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-eqz v1, :cond_11

    .line 351
    .line 352
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v9, v0, v1}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    check-cast v0, Ldefpackage/li3;

    .line 361
    .line 362
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Ldefpackage/li3;

    .line 363
    .line 364
    iget-object v0, v2, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 365
    .line 366
    if-eqz v0, :cond_0

    .line 367
    .line 368
    const-string v1, "PLAYLIST_OBJECT"

    .line 369
    .line 370
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 375
    .line 376
    goto :goto_0

    .line 377
    :cond_0
    move-object v0, v4

    .line 378
    :goto_0
    if-nez v0, :cond_2

    .line 379
    .line 380
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 381
    .line 382
    if-eqz v0, :cond_1

    .line 383
    .line 384
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 385
    .line 386
    if-eqz v0, :cond_1

    .line 387
    .line 388
    invoke-virtual {v0}, Ldefpackage/v23;->o()V

    .line 389
    .line 390
    .line 391
    :cond_1
    return-object v8

    .line 392
    :cond_2
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 393
    .line 394
    iget-object v3, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 395
    .line 396
    const/4 v7, 0x1

    .line 397
    if-eqz v3, :cond_4

    .line 398
    .line 399
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v3

    .line 403
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-nez v3, :cond_3

    .line 412
    .line 413
    goto :goto_1

    .line 414
    :cond_3
    move v3, v6

    .line 415
    goto :goto_2

    .line 416
    :cond_4
    :goto_1
    move v3, v7

    .line 417
    :goto_2
    iput-object v0, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 418
    .line 419
    iput-object v4, v1, Ldefpackage/im3;->g:Ljava/lang/String;

    .line 420
    .line 421
    if-eqz v3, :cond_5

    .line 422
    .line 423
    iget-object v3, v1, Ldefpackage/im3;->j:Ldefpackage/k03;

    .line 424
    .line 425
    invoke-virtual {v3, v4}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    iget-object v1, v1, Ldefpackage/im3;->k:Ldefpackage/k03;

    .line 429
    .line 430
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 431
    .line 432
    invoke-virtual {v1, v3}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_5
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 436
    .line 437
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    iget-object v1, v1, Ldefpackage/im3;->c:Ldefpackage/mm3;

    .line 442
    .line 443
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    new-instance v3, Ljava/lang/Thread;

    .line 447
    .line 448
    new-instance v5, Ldefpackage/jm3;

    .line 449
    .line 450
    const/4 v9, 0x2

    .line 451
    invoke-direct {v5, v1, v0, v9}, Ldefpackage/jm3;-><init>(Ldefpackage/mm3;Ljava/lang/String;I)V

    .line 452
    .line 453
    .line 454
    invoke-direct {v3, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 458
    .line 459
    .line 460
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 461
    .line 462
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 463
    .line 464
    iget-object v1, v1, Ldefpackage/yd1;->a:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 465
    .line 466
    invoke-virtual {v0, v1}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 467
    .line 468
    .line 469
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 470
    .line 471
    invoke-virtual {v0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    if-eqz v0, :cond_6

    .line 476
    .line 477
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 478
    .line 479
    invoke-virtual {v0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-virtual {v0, v7}, Ldefpackage/l93;->f0(Z)V

    .line 484
    .line 485
    .line 486
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 487
    .line 488
    invoke-virtual {v0}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-virtual {v0}, Ldefpackage/l93;->g0()V

    .line 493
    .line 494
    .line 495
    :cond_6
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 496
    .line 497
    iget-object v0, v0, Ldefpackage/yd1;->a:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 498
    .line 499
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 500
    .line 501
    iget-object v1, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 502
    .line 503
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 508
    .line 509
    .line 510
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 511
    .line 512
    iget-object v0, v0, Ldefpackage/yd1;->j:Landroid/widget/TextView;

    .line 513
    .line 514
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 515
    .line 516
    iget-object v1, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 517
    .line 518
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 523
    .line 524
    .line 525
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 526
    .line 527
    iget-object v0, v0, Ldefpackage/yd1;->m:Landroid/widget/TextView;

    .line 528
    .line 529
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 530
    .line 531
    iget-object v1, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 532
    .line 533
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    const v3, 0x7f130408

    .line 546
    .line 547
    .line 548
    invoke-virtual {v2, v3, v1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 553
    .line 554
    .line 555
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 556
    .line 557
    iget-object v0, v0, Ldefpackage/yd1;->h:Landroid/widget/TextView;

    .line 558
    .line 559
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 560
    .line 561
    iget-object v1, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 562
    .line 563
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 564
    .line 565
    .line 566
    move-result-wide v9

    .line 567
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    invoke-static {v1, v6}, Ldefpackage/e03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    const v3, 0x7f1303f1

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v3, v1}, Ldefpackage/kc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 587
    .line 588
    .line 589
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 590
    .line 591
    iget-object v0, v0, Ldefpackage/yd1;->a:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 592
    .line 593
    new-instance v1, Ldefpackage/bj3;

    .line 594
    .line 595
    const/16 v3, 0x8

    .line 596
    .line 597
    invoke-direct {v1, v3, v2}, Ldefpackage/bj3;-><init>(ILjava/lang/Object;)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 601
    .line 602
    .line 603
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 604
    .line 605
    iget-object v0, v0, Ldefpackage/yd1;->a:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 606
    .line 607
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    const v5, 0x7f06036c

    .line 623
    .line 624
    .line 625
    invoke-virtual {v1, v5, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 626
    .line 627
    .line 628
    move-result v1

    .line 629
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 630
    .line 631
    .line 632
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 633
    .line 634
    invoke-virtual {v0}, Ldefpackage/im3;->d()Ldefpackage/ad2;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    new-instance v4, Ldefpackage/zl3;

    .line 643
    .line 644
    invoke-direct {v4, v2, v7}, Ldefpackage/zl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0, v1, v4}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 648
    .line 649
    .line 650
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 651
    .line 652
    iget-object v0, v0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 653
    .line 654
    if-eqz v0, :cond_e

    .line 655
    .line 656
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 657
    .line 658
    if-nez v1, :cond_7

    .line 659
    .line 660
    goto/16 :goto_4

    .line 661
    .line 662
    :cond_7
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 667
    .line 668
    iget-object v1, v1, Ldefpackage/yd1;->f:Landroid/widget/ImageView;

    .line 669
    .line 670
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    check-cast v1, Landroid/view/ViewGroup;

    .line 675
    .line 676
    const-string v4, "SINGLE_PLAYLIST_COVER"

    .line 677
    .line 678
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    check-cast v5, Landroid/widget/ImageView;

    .line 683
    .line 684
    if-eqz v0, :cond_c

    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v9

    .line 690
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 691
    .line 692
    .line 693
    move-result v9

    .line 694
    if-nez v9, :cond_c

    .line 695
    .line 696
    if-nez v5, :cond_a

    .line 697
    .line 698
    new-instance v5, Landroid/widget/ImageView;

    .line 699
    .line 700
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 701
    .line 702
    .line 703
    move-result-object v3

    .line 704
    invoke-direct {v5, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v5, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 708
    .line 709
    .line 710
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 711
    .line 712
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 713
    .line 714
    .line 715
    instance-of v3, v1, Landroid/widget/FrameLayout;

    .line 716
    .line 717
    const/4 v4, -0x1

    .line 718
    if-eqz v3, :cond_8

    .line 719
    .line 720
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 721
    .line 722
    invoke-direct {v3, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 723
    .line 724
    .line 725
    goto :goto_3

    .line 726
    :cond_8
    instance-of v3, v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 727
    .line 728
    if-eqz v3, :cond_9

    .line 729
    .line 730
    new-instance v3, Ldefpackage/mb0;

    .line 731
    .line 732
    invoke-direct {v3, v4, v4}, Ldefpackage/mb0;-><init>(II)V

    .line 733
    .line 734
    .line 735
    goto :goto_3

    .line 736
    :cond_9
    new-instance v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 737
    .line 738
    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 739
    .line 740
    .line 741
    :goto_3
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 742
    .line 743
    .line 744
    move-result-object v4

    .line 745
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 754
    .line 755
    const/high16 v9, 0x42780000    # 62.0f

    .line 756
    .line 757
    mul-float/2addr v4, v9

    .line 758
    float-to-int v4, v4

    .line 759
    invoke-virtual {v3, v4, v6, v4, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 763
    .line 764
    .line 765
    :cond_a
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    invoke-static {v1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 777
    .line 778
    .line 779
    move-result v4

    .line 780
    invoke-static {v4, v0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    const/4 v9, 0x6

    .line 785
    invoke-static {v1, v0, v9, v3, v4}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    invoke-virtual {v0, v1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 798
    .line 799
    .line 800
    move-result v1

    .line 801
    if-eqz v1, :cond_b

    .line 802
    .line 803
    invoke-virtual {v0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    check-cast v0, Ldefpackage/vz3;

    .line 808
    .line 809
    :cond_b
    new-instance v1, Ldefpackage/qj1;

    .line 810
    .line 811
    sget v3, Ldefpackage/wg0;->a:I

    .line 812
    .line 813
    int-to-float v3, v3

    .line 814
    invoke-direct {v1, v3, v3, v3, v3}, Ldefpackage/qj1;-><init>(FFFF)V

    .line 815
    .line 816
    .line 817
    invoke-virtual {v0, v1}, Ldefpackage/lq;->A(Ldefpackage/uw4;)Ldefpackage/lq;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    check-cast v0, Ldefpackage/vz3;

    .line 822
    .line 823
    invoke-virtual {v0, v5}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 824
    .line 825
    .line 826
    goto :goto_4

    .line 827
    :cond_c
    if-eqz v5, :cond_d

    .line 828
    .line 829
    invoke-virtual {v5, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 830
    .line 831
    .line 832
    :cond_d
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 833
    .line 834
    invoke-virtual {v0}, Ldefpackage/im3;->d()Ldefpackage/ad2;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 839
    .line 840
    .line 841
    move-result-object v1

    .line 842
    new-instance v3, Ldefpackage/zl3;

    .line 843
    .line 844
    const/4 v4, 0x4

    .line 845
    invoke-direct {v3, v2, v4}, Ldefpackage/zl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0, v1, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 849
    .line 850
    .line 851
    :cond_e
    :goto_4
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 852
    .line 853
    iget-object v0, v0, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 854
    .line 855
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 856
    .line 857
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 858
    .line 859
    .line 860
    invoke-direct {v1, v7}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 864
    .line 865
    .line 866
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 867
    .line 868
    iget-object v0, v0, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 869
    .line 870
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 871
    .line 872
    .line 873
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 874
    .line 875
    iget-object v0, v0, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 876
    .line 877
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 878
    .line 879
    .line 880
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 881
    .line 882
    iget-object v0, v0, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 883
    .line 884
    new-instance v1, Ldefpackage/qa1;

    .line 885
    .line 886
    const/16 v3, 0x1d

    .line 887
    .line 888
    invoke-direct {v1, v3, v2}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 892
    .line 893
    .line 894
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 895
    .line 896
    iget-object v1, v0, Ldefpackage/yd1;->i:Landroidx/core/widget/NestedScrollView;

    .line 897
    .line 898
    if-eqz v1, :cond_f

    .line 899
    .line 900
    iget-object v0, v0, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 901
    .line 902
    new-instance v3, Ldefpackage/l8;

    .line 903
    .line 904
    invoke-direct {v3, v1, v7}, Ldefpackage/l8;-><init>(Landroidx/core/widget/NestedScrollView;I)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->j(Ldefpackage/rw3;)V

    .line 908
    .line 909
    .line 910
    :cond_f
    new-instance v0, Ldefpackage/ni4;

    .line 911
    .line 912
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    const/4 v4, 0x0

    .line 917
    const/4 v5, 0x0

    .line 918
    const/4 v3, 0x1

    .line 919
    invoke-direct/range {v0 .. v5}, Ldefpackage/ni4;-><init>(Ldefpackage/le1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 920
    .line 921
    .line 922
    iput-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Ldefpackage/ni4;

    .line 923
    .line 924
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 925
    .line 926
    iget-object v1, v1, Ldefpackage/yd1;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 927
    .line 928
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 929
    .line 930
    .line 931
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Ldefpackage/ni4;

    .line 932
    .line 933
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 934
    .line 935
    iput-object v1, v0, Ldefpackage/ni4;->A:Ldefpackage/bl2;

    .line 936
    .line 937
    invoke-virtual {v2}, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->i0()V

    .line 938
    .line 939
    .line 940
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 941
    .line 942
    invoke-virtual {v0}, Ldefpackage/im3;->d()Ldefpackage/ad2;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 947
    .line 948
    .line 949
    move-result-object v1

    .line 950
    new-instance v3, Ldefpackage/zl3;

    .line 951
    .line 952
    const/4 v4, 0x5

    .line 953
    invoke-direct {v3, v2, v4}, Ldefpackage/zl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0, v1, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 957
    .line 958
    .line 959
    if-nez p3, :cond_10

    .line 960
    .line 961
    goto :goto_5

    .line 962
    :cond_10
    move v7, v6

    .line 963
    :goto_5
    iput-boolean v6, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->s0:Z

    .line 964
    .line 965
    iput-boolean v6, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->t0:Z

    .line 966
    .line 967
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 968
    .line 969
    invoke-virtual {v0}, Ldefpackage/im3;->f()Ldefpackage/ad2;

    .line 970
    .line 971
    .line 972
    move-result-object v0

    .line 973
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    new-instance v3, Ldefpackage/dm3;

    .line 978
    .line 979
    invoke-direct {v3, v2, v7}, Ldefpackage/dm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;Z)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v0, v1, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 983
    .line 984
    .line 985
    iget-object v0, v2, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 986
    .line 987
    iget-object v0, v0, Ldefpackage/im3;->k:Ldefpackage/k03;

    .line 988
    .line 989
    invoke-virtual {v2}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    new-instance v3, Ldefpackage/zl3;

    .line 994
    .line 995
    const/4 v4, 0x3

    .line 996
    invoke-direct {v3, v2, v4}, Ldefpackage/zl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v0, v1, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 1000
    .line 1001
    .line 1002
    return-object v8

    .line 1003
    :cond_11
    invoke-static {v3}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 1004
    .line 1005
    .line 1006
    return-object v4

    .line 1007
    :cond_12
    invoke-static {v3}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    return-object v4

    .line 1011
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v0

    .line 1019
    const-string v1, "Missing required view with ID: "

    .line 1020
    .line 1021
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    invoke-static {v0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 1026
    .line 1027
    .line 1028
    return-object v4
.end method

.method public final J()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->q0:Ldefpackage/f9;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->q0:Ldefpackage/f9;

    .line 15
    .line 16
    invoke-virtual {v0}, Ldefpackage/dg;->dismiss()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->q0:Ldefpackage/f9;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->v0:Z

    .line 24
    .line 25
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->u0:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 28
    .line 29
    return-void
.end method

.method public final N(Landroid/view/MenuItem;)Z
    .locals 10

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a0055

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->v0:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->v0:Z

    .line 18
    .line 19
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 20
    .line 21
    iget-object p1, p1, Ldefpackage/im3;->j:Ldefpackage/k03;

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ldefpackage/i7;

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    invoke-direct {v1, v3, p0, p1}, Ldefpackage/i7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 34
    .line 35
    .line 36
    return v2

    .line 37
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const v1, 0x7f0a0068

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x15

    .line 45
    .line 46
    if-ne v0, v1, :cond_4

    .line 47
    .line 48
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    xor-int/lit8 v6, v0, 0x1

    .line 53
    .line 54
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 55
    .line 56
    iget-object v5, v1, Ldefpackage/im3;->c:Ldefpackage/mm3;

    .line 57
    .line 58
    iget-object v4, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    goto/16 :goto_0

    .line 63
    .line 64
    :cond_2
    new-instance v7, Ldefpackage/lg1;

    .line 65
    .line 66
    iget-object v8, v5, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 67
    .line 68
    invoke-direct {v7, v3, v8, v4}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v3, Ljava/lang/Thread;

    .line 72
    .line 73
    invoke-direct {v3, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 77
    .line 78
    .line 79
    iget-object v1, v1, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    if-nez v8, :cond_3

    .line 90
    .line 91
    new-instance p0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string p1, "No server address in use, keep synced not saved for "

    .line 94
    .line 95
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string p1, "PlaylistRepository"

    .line 106
    .line 107
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    return v2

    .line 111
    :cond_3
    sget-object v1, Ldefpackage/mm3;->f:Ljava/util/concurrent/ExecutorService;

    .line 112
    .line 113
    new-instance v4, Ldefpackage/b41;

    .line 114
    .line 115
    const/4 v9, 0x4

    .line 116
    invoke-direct/range {v4 .. v9}, Ldefpackage/b41;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p1, v6}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 123
    .line 124
    .line 125
    iput-boolean v6, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->s0:Z

    .line 126
    .line 127
    if-nez v0, :cond_7

    .line 128
    .line 129
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 130
    .line 131
    iget-object p1, p1, Ldefpackage/im3;->j:Ldefpackage/k03;

    .line 132
    .line 133
    invoke-virtual {p1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Ljava/util/List;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->h0(Ljava/util/List;)V

    .line 140
    .line 141
    .line 142
    return v2

    .line 143
    :cond_4
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const v1, 0x7f0a007d

    .line 148
    .line 149
    .line 150
    if-ne v0, v1, :cond_5

    .line 151
    .line 152
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 153
    .line 154
    iget-object p1, p0, Ldefpackage/im3;->c:Ldefpackage/mm3;

    .line 155
    .line 156
    iget-object v0, p0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 157
    .line 158
    new-instance v1, Ldefpackage/lg1;

    .line 159
    .line 160
    iget-object v4, p1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 161
    .line 162
    invoke-direct {v1, v3, v4, v0}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Ljava/lang/Thread;

    .line 166
    .line 167
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 171
    .line 172
    .line 173
    iget-object p0, p0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    new-instance v0, Ljava/lang/Thread;

    .line 180
    .line 181
    new-instance v1, Ldefpackage/jm3;

    .line 182
    .line 183
    invoke-direct {v1, p1, p0, v2}, Ldefpackage/jm3;-><init>(Ldefpackage/mm3;Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 190
    .line 191
    .line 192
    return v2

    .line 193
    :cond_5
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    const v1, 0x7f0a008c

    .line 198
    .line 199
    .line 200
    const/4 v4, 0x0

    .line 201
    if-ne v0, v1, :cond_6

    .line 202
    .line 203
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 204
    .line 205
    iget-object p1, p0, Ldefpackage/im3;->c:Ldefpackage/mm3;

    .line 206
    .line 207
    iget-object v0, p0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 208
    .line 209
    new-instance v1, Ldefpackage/lg1;

    .line 210
    .line 211
    iget-object v5, p1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 212
    .line 213
    invoke-direct {v1, v3, v5, v0}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    new-instance v0, Ljava/lang/Thread;

    .line 217
    .line 218
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 222
    .line 223
    .line 224
    iget-object p0, p0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    new-instance v0, Ljava/lang/Thread;

    .line 231
    .line 232
    new-instance v1, Ldefpackage/jm3;

    .line 233
    .line 234
    invoke-direct {v1, p1, p0, v4}, Ldefpackage/jm3;-><init>(Ldefpackage/mm3;Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 241
    .line 242
    .line 243
    return v2

    .line 244
    :cond_6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    const v1, 0x7f0a0037

    .line 249
    .line 250
    .line 251
    if-ne v0, v1, :cond_8

    .line 252
    .line 253
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 254
    .line 255
    invoke-virtual {p1}, Ldefpackage/im3;->d()Ldefpackage/ad2;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    check-cast p1, Ljava/util/List;

    .line 264
    .line 265
    invoke-virtual {p0}, Ldefpackage/kc1;->B()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_7

    .line 270
    .line 271
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    if-eqz v0, :cond_7

    .line 276
    .line 277
    if-eqz p1, :cond_7

    .line 278
    .line 279
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-nez v0, :cond_7

    .line 284
    .line 285
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 286
    .line 287
    invoke-static {p0, p1, v4}, Ldefpackage/bo2;->e(Ldefpackage/ic2;Ljava/util/List;Z)V

    .line 288
    .line 289
    .line 290
    :cond_7
    :goto_0
    return v2

    .line 291
    :cond_8
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    const v1, 0x7f0a0056

    .line 296
    .line 297
    .line 298
    const/4 v3, 0x0

    .line 299
    const-string v5, "PLAYLIST_OBJECT"

    .line 300
    .line 301
    if-ne v0, v1, :cond_9

    .line 302
    .line 303
    new-instance p1, Landroid/os/Bundle;

    .line 304
    .line 305
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 306
    .line 307
    .line 308
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 309
    .line 310
    iget-object v0, v0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 311
    .line 312
    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    const v0, 0x7f0a049f

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0, v0, p1, v3}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 327
    .line 328
    .line 329
    return v2

    .line 330
    :cond_9
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    const v0, 0x7f0a0057

    .line 335
    .line 336
    .line 337
    if-ne p1, v0, :cond_a

    .line 338
    .line 339
    new-instance p1, Landroid/os/Bundle;

    .line 340
    .line 341
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 342
    .line 343
    .line 344
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 345
    .line 346
    iget-object v0, v0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 347
    .line 348
    invoke-virtual {p1, v5, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Ldefpackage/sl3;

    .line 352
    .line 353
    new-instance v1, Ldefpackage/si1;

    .line 354
    .line 355
    const/16 v5, 0xf

    .line 356
    .line 357
    invoke-direct {v1, v5, p0}, Ldefpackage/si1;-><init>(ILjava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    invoke-direct {v0, v4, v1}, Ldefpackage/sl3;-><init>(ILjava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0, p1}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 364
    .line 365
    .line 366
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 367
    .line 368
    invoke-virtual {p0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-virtual {v0, p0, v3}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return v2

    .line 376
    :cond_a
    return v4
.end method

.method public final P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Ldefpackage/ni4;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 9
    .line 10
    iput-object p0, v0, Ldefpackage/ni4;->A:Ldefpackage/bl2;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Ldefpackage/cb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

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
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Ldefpackage/aj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ldefpackage/bl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 45
    .line 46
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Ldefpackage/xc5;

    .line 53
    .line 54
    new-instance v1, Ldefpackage/x7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Ldefpackage/fi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

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
    new-instance v1, Ldefpackage/bj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

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
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 86
    .line 87
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Ldefpackage/li3;

    .line 88
    .line 89
    invoke-static {v7, v0}, Ldefpackage/bo2;->j(Ldefpackage/bl2;Ldefpackage/li3;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Ldefpackage/li3;

    .line 93
    .line 94
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 95
    .line 96
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Ldefpackage/zl3;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, p0, v3}, Ldefpackage/zl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Ldefpackage/li3;

    .line 110
    .line 111
    iget-object v0, v0, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 112
    .line 113
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, Ldefpackage/zl3;

    .line 118
    .line 119
    const/4 v3, 0x2

    .line 120
    invoke-direct {v2, p0, v3}, Ldefpackage/zl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final h0(Ljava/util/List;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->l0:Ldefpackage/yd1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ldefpackage/m7;

    .line 13
    .line 14
    const/16 v2, 0x11

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ldefpackage/m7;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/List;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->u0:Ljava/util/List;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 36
    .line 37
    iget-object v0, v0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v6, Ldefpackage/g41;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-direct {v6, v0, p0}, Ldefpackage/g41;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    move-object v2, p1

    .line 59
    invoke-static/range {v1 .. v6}, Ldefpackage/au0;->l(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    return-void
.end method

.method public final i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Ldefpackage/ni4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Ldefpackage/li3;

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 8
    .line 9
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->o0:Ldefpackage/li3;

    .line 16
    .line 17
    iget-object v1, v1, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 18
    .line 19
    invoke-virtual {v1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->p0:Ldefpackage/ni4;

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
    invoke-virtual {p0, v0, v1}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 2
    .line 3
    const-string v1, "TRACKS_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "ITEM_POSITION"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 16
    .line 17
    iget-object v2, v2, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Ldefpackage/v13;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0, v1, p1, v2}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ldefpackage/au;

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    invoke-virtual {p0, p1}, Ldefpackage/au;->d(Z)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final onMediaLongClick(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/im3;->d()Ldefpackage/ad2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    const-string v1, "TRACK_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 20
    .line 21
    const-string v2, "ITEM_POSITION"

    .line 22
    .line 23
    const/4 v3, -0x1

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-ge v4, v5, :cond_1

    .line 32
    .line 33
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-ne v5, v1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v4, v3

    .line 44
    :goto_1
    if-ne v4, v3, :cond_2

    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :cond_2
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 51
    .line 52
    iget-object v0, v0, Ldefpackage/im3;->f:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move v3, v4

    .line 58
    :goto_2
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-virtual {p1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    :goto_3
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 66
    .line 67
    iget-object v0, v0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "PLAYLIST_ID"

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Ldefpackage/im3;

    .line 79
    .line 80
    iget-object v0, v0, Ldefpackage/im3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "PLAYLIST_NAME"

    .line 87
    .line 88
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    const v0, 0x7f0a0595

    .line 100
    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method
