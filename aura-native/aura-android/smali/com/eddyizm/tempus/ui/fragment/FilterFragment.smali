.class public Lcom/eddyizm/tempus/ui/fragment/FilterFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public m0:Llv4;

.field public n0:Lf71;


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
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d006d

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
    if-eqz v3, :cond_2

    .line 29
    .line 30
    const p2, 0x7f0a024a

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
    check-cast v4, Landroidx/core/widget/NestedScrollView;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    const p2, 0x7f0a024c

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
    check-cast v5, Lcom/google/android/material/chip/ChipGroup;

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    const p2, 0x7f0a0251

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
    check-cast v6, Landroid/widget/Button;

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    const p2, 0x7f0a026b

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
    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 75
    .line 76
    if-eqz v7, :cond_2

    .line 77
    .line 78
    const p2, 0x7f0a0347

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
    check-cast v8, Landroid/widget/ProgressBar;

    .line 87
    .line 88
    if-eqz v8, :cond_2

    .line 89
    .line 90
    const p2, 0x7f0a061b

    .line 91
    .line 92
    .line 93
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

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
    if-eqz v9, :cond_2

    .line 101
    .line 102
    new-instance v1, Llv4;

    .line 103
    .line 104
    move-object v2, p1

    .line 105
    check-cast v2, Landroid/widget/LinearLayout;

    .line 106
    .line 107
    invoke-direct/range {v1 .. v9}, Llv4;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/ViewGroup;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 111
    .line 112
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {p1, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    new-instance v3, Lbq4;

    .line 129
    .line 130
    invoke-direct {v3, p2, v1, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 131
    .line 132
    .line 133
    const-class p1, Lf71;

    .line 134
    .line 135
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    if-eqz p2, :cond_1

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
    invoke-virtual {v3, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lf71;

    .line 156
    .line 157
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->n0:Lf71;

    .line 158
    .line 159
    const-string p1, "MEDIA_BY_GENRES"

    .line 160
    .line 161
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->n0:Lf71;

    .line 166
    .line 167
    iget-object p2, p2, Lf71;->d:Ljava/util/ArrayList;

    .line 168
    .line 169
    const-string p3, "filters_list"

    .line 170
    .line 171
    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 172
    .line 173
    .line 174
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->n0:Lf71;

    .line 175
    .line 176
    iget-object p2, p2, Lf71;->e:Ljava/util/ArrayList;

    .line 177
    .line 178
    const-string p3, "filter_name_list"

    .line 179
    .line 180
    invoke-virtual {p1, p3, p2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 181
    .line 182
    .line 183
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 184
    .line 185
    iget-object p2, p2, Llv4;->q:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p2, Landroid/widget/Button;

    .line 188
    .line 189
    new-instance p3, Lj8;

    .line 190
    .line 191
    const/16 v1, 0x9

    .line 192
    .line 193
    invoke-direct {p3, v1, p0, p1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    .line 198
    .line 199
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 200
    .line 201
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 202
    .line 203
    iget-object p2, p2, Llv4;->t:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 206
    .line 207
    invoke-virtual {p1, p2}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 208
    .line 209
    .line 210
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 211
    .line 212
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-eqz p1, :cond_0

    .line 217
    .line 218
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 219
    .line 220
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    const/4 p2, 0x1

    .line 225
    invoke-virtual {p1, p2}, Ll93;->f0(Z)V

    .line 226
    .line 227
    .line 228
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 229
    .line 230
    invoke-virtual {p1}, Ldf;->n()Ll93;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p1}, Ll93;->g0()V

    .line 235
    .line 236
    .line 237
    :cond_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 238
    .line 239
    iget-object p1, p1, Llv4;->t:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 242
    .line 243
    new-instance p2, Lp6;

    .line 244
    .line 245
    const/16 p3, 0xe

    .line 246
    .line 247
    invoke-direct {p2, p3, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 251
    .line 252
    .line 253
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 254
    .line 255
    iget-object p1, p1, Llv4;->n:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 258
    .line 259
    new-instance p2, Lu7;

    .line 260
    .line 261
    const/4 p3, 0x4

    .line 262
    invoke-direct {p2, p3, p0}, Lu7;-><init>(ILkc1;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1, p2}, Lcom/google/android/material/appbar/AppBarLayout;->a(Laf;)V

    .line 266
    .line 267
    .line 268
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->n0:Lf71;

    .line 269
    .line 270
    iget-object p1, p1, Lf71;->c:Ly41;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    const/4 p1, -0x1

    .line 276
    invoke-static {p1, v0}, Ly41;->j(IZ)Lk03;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    new-instance p3, Ld8;

    .line 285
    .line 286
    const/16 v0, 0xa

    .line 287
    .line 288
    invoke-direct {p3, v0, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1, p2, p3}, Lad2;->e(Lba2;La83;)V

    .line 292
    .line 293
    .line 294
    return-object v2

    .line 295
    :cond_1
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 296
    .line 297
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-object p3

    .line 301
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    const-string p1, "Missing required view with ID: "

    .line 310
    .line 311
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->m0:Llv4;

    .line 6
    .line 7
    return-void
.end method
