.class public Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lml3;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lrq0;

.field public o0:Lzd0;

.field public p0:Lbl2;

.field public q0:Lom0;

.field public r0:Landroid/view/MenuItem;


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
    const v0, 0x7f0f0005

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 5
    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-interface {p1, p2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->r0:Landroid/view/MenuItem;

    .line 13
    .line 14
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d006a

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
    if-eqz v3, :cond_4

    .line 29
    .line 30
    const p2, 0x7f0a01ae

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
    check-cast v4, Landroid/widget/Button;

    .line 39
    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    const p2, 0x7f0a01af

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
    if-eqz v5, :cond_4

    .line 53
    .line 54
    const p2, 0x7f0a01b0

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
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    if-eqz v6, :cond_4

    .line 65
    .line 66
    const p2, 0x7f0a01b1

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

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
    if-eqz v7, :cond_4

    .line 77
    .line 78
    const p2, 0x7f0a061b

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

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
    if-eqz v8, :cond_4

    .line 89
    .line 90
    new-instance v1, Lml3;

    .line 91
    .line 92
    move-object v2, p1

    .line 93
    check-cast v2, Landroid/widget/LinearLayout;

    .line 94
    .line 95
    invoke-direct/range {v1 .. v8}, Lml3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 96
    .line 97
    .line 98
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 99
    .line 100
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-static {p1, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v3, Lbq4;

    .line 117
    .line 118
    invoke-direct {v3, p2, v1, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 119
    .line 120
    .line 121
    const-class p1, Lrq0;

    .line 122
    .line 123
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-eqz p2, :cond_3

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
    invoke-virtual {v3, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lrq0;

    .line 144
    .line 145
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->n0:Lrq0;

    .line 146
    .line 147
    new-instance p1, Lom0;

    .line 148
    .line 149
    const/4 p2, 0x5

    .line 150
    invoke-direct {p1, p2}, Lom0;-><init>(I)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->q0:Lom0;

    .line 154
    .line 155
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 156
    .line 157
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 158
    .line 159
    if-nez p1, :cond_1

    .line 160
    .line 161
    if-eqz p2, :cond_0

    .line 162
    .line 163
    iget-object p0, p2, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 164
    .line 165
    if-eqz p0, :cond_0

    .line 166
    .line 167
    invoke-virtual {p0}, Lv23;->o()V

    .line 168
    .line 169
    .line 170
    :cond_0
    return-object v2

    .line 171
    :cond_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 172
    .line 173
    iget-object p1, p1, Lml3;->f:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 176
    .line 177
    invoke-virtual {p2, p1}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 181
    .line 182
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const/4 p2, 0x1

    .line 187
    if-eqz p1, :cond_2

    .line 188
    .line 189
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 190
    .line 191
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p1, p2}, Ll93;->f0(Z)V

    .line 196
    .line 197
    .line 198
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 199
    .line 200
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Ll93;->g0()V

    .line 205
    .line 206
    .line 207
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 208
    .line 209
    iget-object p1, p1, Lml3;->f:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 212
    .line 213
    new-instance p3, Lnq0;

    .line 214
    .line 215
    invoke-direct {p3, p0, v0}, Lnq0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 219
    .line 220
    .line 221
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 222
    .line 223
    iget-object p1, p1, Lml3;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p1, Landroid/widget/Button;

    .line 226
    .line 227
    new-instance p3, Lnq0;

    .line 228
    .line 229
    invoke-direct {p3, p0, p2}, Lnq0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 233
    .line 234
    .line 235
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 236
    .line 237
    iget-object p1, p1, Lml3;->d:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 240
    .line 241
    new-instance p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 242
    .line 243
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 244
    .line 245
    .line 246
    invoke-direct {p3, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 250
    .line 251
    .line 252
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 253
    .line 254
    iget-object p1, p1, Lml3;->d:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 257
    .line 258
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 259
    .line 260
    .line 261
    new-instance p1, Lzd0;

    .line 262
    .line 263
    invoke-direct {p1, p0}, Lzd0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;)V

    .line 264
    .line 265
    .line 266
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->o0:Lzd0;

    .line 267
    .line 268
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 269
    .line 270
    iget-object p2, p2, Lml3;->d:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 273
    .line 274
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->o0:Lzd0;

    .line 282
    .line 283
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    new-instance p3, La0;

    .line 287
    .line 288
    const/16 v0, 0x17

    .line 289
    .line 290
    invoke-direct {p3, v0, p2}, La0;-><init>(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-static {p1, p3}, Lkb4;->N(Lba2;Ljava/lang/Runnable;)V

    .line 294
    .line 295
    .line 296
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->n0:Lrq0;

    .line 297
    .line 298
    iget-object p2, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 299
    .line 300
    const-string p3, "MUSIC_DIRECTORY_ID"

    .line 301
    .line 302
    invoke-virtual {p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p2

    .line 306
    iget-object p1, p1, Lrq0;->c:Lom0;

    .line 307
    .line 308
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-static {p2}, Lom0;->W(Ljava/lang/String;)Lk03;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 316
    .line 317
    .line 318
    move-result-object p2

    .line 319
    new-instance p3, Ld8;

    .line 320
    .line 321
    const/4 v0, 0x7

    .line 322
    invoke-direct {p3, v0, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1, p2, p3}, Lad2;->e(Lba2;La83;)V

    .line 326
    .line 327
    .line 328
    return-object v2

    .line 329
    :cond_3
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 330
    .line 331
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-object p3

    .line 335
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    const-string p1, "Missing required view with ID: "

    .line 344
    .line 345
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->l0:Lml3;

    .line 6
    .line 7
    return-void
.end method

.method public final N(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x7f0a0054

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lus0;

    .line 12
    .line 13
    new-instance v0, Lqq0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lqq0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, v0, v1}, Lus0;-><init>(Lcom/eddyizm/tempus/interfaces/DialogClickCallback;I)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 22
    .line 23
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, p0, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    return v1
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
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->p0:Lbl2;

    .line 86
    .line 87
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->p0:Lbl2;

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

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->p0:Lbl2;

    .line 2
    .line 3
    const-string v0, "TRACKS_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "ITEM_POSITION"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p0, v0, p1}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onMediaLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a0595

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

.method public final onMusicDirectoryClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a01ad

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

.method public final onMusicDirectoryPlay(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    const-string v0, "MUSIC_DIRECTORY_ID"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const v1, 0x7f13015a

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v1}, Lkc1;->s(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    new-instance v5, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    invoke-direct {v6, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v7, Lmq0;

    .line 39
    .line 40
    invoke-direct {v7, p0, v5, v2}, Lmq0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;Ljava/util/ArrayList;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->q0:Lom0;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lom0;->W(Ljava/lang/String;)Lk03;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v3, Loq0;

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    move-object v4, p0

    .line 63
    invoke-direct/range {v3 .. v8}, Loq0;-><init>(Ljava/lang/Object;Ljava/util/AbstractList;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v3}, Lad2;->e(Lba2;La83;)V

    .line 67
    .line 68
    .line 69
    :cond_0
    return-void
.end method
