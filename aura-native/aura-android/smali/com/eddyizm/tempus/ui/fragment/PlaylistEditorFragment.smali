.class public Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Ljv3;

.field public m0:Lwl3;

.field public n0:Lzd0;

.field public o0:Lf22;

.field public p0:Lqg4;


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
    .locals 3

    .line 1
    const p3, 0x7f0d0081

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a04c5

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    check-cast p3, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p3, :cond_4

    .line 20
    .line 21
    const p2, 0x7f0a061b

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 29
    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    new-instance p2, Ljv3;

    .line 33
    .line 34
    check-cast p1, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    invoke-direct {p2, p1, p3, v2}, Ljv3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 40
    .line 41
    invoke-virtual {p0}, Lkc1;->d()Le75;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p0}, Lgh0;->r(Lf75;)Lb75;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p0}, Lgh0;->q(Lf75;)Ltf0;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v2, Lbq4;

    .line 60
    .line 61
    invoke-direct {v2, p1, p2, p3}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 62
    .line 63
    .line 64
    const-class p1, Lwl3;

    .line 65
    .line 66
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 77
    .line 78
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {v2, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lwl3;

    .line 87
    .line 88
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 89
    .line 90
    iget-object p1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 91
    .line 92
    if-eqz p1, :cond_0

    .line 93
    .line 94
    const-string p2, "PLAYLIST_OBJECT"

    .line 95
    .line 96
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    move-object p1, v1

    .line 104
    :goto_0
    if-nez p1, :cond_1

    .line 105
    .line 106
    invoke-static {p0}, Lq05;->l(Lkc1;)Lv23;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Lv23;->o()V

    .line 111
    .line 112
    .line 113
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 114
    .line 115
    iget-object p0, p0, Ljv3;->n:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Landroid/widget/LinearLayout;

    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_1
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 121
    .line 122
    iget-object p3, p2, Lwl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 123
    .line 124
    if-nez p3, :cond_2

    .line 125
    .line 126
    iput-object v1, p2, Lwl3;->e:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {p2, p1}, Lwl3;->c(Lcom/eddyizm/tempus/subsonic/models/Playlist;)V

    .line 129
    .line 130
    .line 131
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 132
    .line 133
    iget-object p1, p1, Ljv3;->p:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 136
    .line 137
    new-instance p2, Lbj3;

    .line 138
    .line 139
    const/4 p3, 0x7

    .line 140
    invoke-direct {p2, p3, p0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 147
    .line 148
    iget-object p1, p1, Ljv3;->p:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const p2, 0x7f0a0083

    .line 157
    .line 158
    .line 159
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 164
    .line 165
    iget-boolean p2, p2, Lwl3;->i:Z

    .line 166
    .line 167
    const/4 p3, 0x1

    .line 168
    xor-int/2addr p2, p3

    .line 169
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 170
    .line 171
    .line 172
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 173
    .line 174
    iget-object p1, p1, Ljv3;->p:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 177
    .line 178
    new-instance p2, Lss2;

    .line 179
    .line 180
    const/16 v1, 0x8

    .line 181
    .line 182
    invoke-direct {p2, v1, p0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Lav4;)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 189
    .line 190
    iget-object p1, p1, Ljv3;->o:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 193
    .line 194
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 195
    .line 196
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 197
    .line 198
    .line 199
    invoke-direct {p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 206
    .line 207
    iget-object p1, p1, Ljv3;->o:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 210
    .line 211
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 212
    .line 213
    .line 214
    new-instance p1, Lzd0;

    .line 215
    .line 216
    invoke-direct {p1, p0}, Lzd0;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;)V

    .line 217
    .line 218
    .line 219
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Lzd0;

    .line 220
    .line 221
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 222
    .line 223
    iget-object p2, p2, Ljv3;->o:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 226
    .line 227
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 228
    .line 229
    .line 230
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 231
    .line 232
    iget-object p1, p1, Lwl3;->g:Lk03;

    .line 233
    .line 234
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    new-instance v1, Ltl3;

    .line 239
    .line 240
    invoke-direct {v1, p0, p3}, Ltl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p2, v1}, Lad2;->e(Lba2;La83;)V

    .line 244
    .line 245
    .line 246
    new-instance p1, Lf22;

    .line 247
    .line 248
    new-instance p2, Lvl3;

    .line 249
    .line 250
    invoke-direct {p2, p0}, Lvl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {p1, p2}, Lf22;-><init>(Le22;)V

    .line 254
    .line 255
    .line 256
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->o0:Lf22;

    .line 257
    .line 258
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 259
    .line 260
    iget-object p2, p2, Ljv3;->o:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 263
    .line 264
    invoke-virtual {p1, p2}, Lf22;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 265
    .line 266
    .line 267
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 268
    .line 269
    iget-object p1, p1, Lwl3;->h:Lk03;

    .line 270
    .line 271
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 272
    .line 273
    .line 274
    move-result-object p2

    .line 275
    new-instance p3, Ltl3;

    .line 276
    .line 277
    invoke-direct {p3, p0, v0}, Ltl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, p2, p3}, Lad2;->e(Lba2;La83;)V

    .line 281
    .line 282
    .line 283
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 284
    .line 285
    iget-object p0, p0, Ljv3;->n:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast p0, Landroid/widget/LinearLayout;

    .line 288
    .line 289
    return-object p0

    .line 290
    :cond_3
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 291
    .line 292
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    return-object v1

    .line 296
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    const-string p1, "Missing required view with ID: "

    .line 305
    .line 306
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v1
.end method

.method public final J()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->p0:Lqg4;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-virtual {v0, v1}, Lfr;->a(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->p0:Lqg4;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->l0:Ljv3;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Lzd0;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->o0:Lf22;

    .line 20
    .line 21
    return-void
.end method
