.class public Lgp1;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;
.implements Lcom/eddyizm/tempus/interfaces/PodcastCallback;


# instance fields
.field public l0:Lup0;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ljn3;

.field public o0:Len3;

.field public p0:Lzd0;

.field public q0:Lbl2;


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
    .locals 12

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
    iput-object p3, p0, Lgp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0071

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
    const p2, 0x7f0a01eb

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    check-cast p3, Landroid/widget/ImageView;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    const p2, 0x7f0a01ee

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    move-object v3, p3

    .line 37
    check-cast v3, Landroid/widget/LinearLayout;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    const p2, 0x7f0a028d

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    move-object v4, p3

    .line 49
    check-cast v4, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    const p2, 0x7f0a02b9

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    move-object v5, p3

    .line 61
    check-cast v5, Landroid/widget/LinearLayout;

    .line 62
    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    const p2, 0x7f0a02ba

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    move-object v6, p3

    .line 73
    check-cast v6, Landroid/widget/LinearLayout;

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    const p2, 0x7f0a02bb

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    check-cast p3, Landroidx/core/widget/NestedScrollView;

    .line 85
    .line 86
    if-eqz p3, :cond_1

    .line 87
    .line 88
    const p2, 0x7f0a041d

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    move-object v7, p3

    .line 96
    check-cast v7, Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    if-eqz v7, :cond_1

    .line 99
    .line 100
    const p2, 0x7f0a04d7

    .line 101
    .line 102
    .line 103
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    move-object v8, p3

    .line 108
    check-cast v8, Landroid/widget/TextView;

    .line 109
    .line 110
    if-eqz v8, :cond_1

    .line 111
    .line 112
    const p2, 0x7f0a04d8

    .line 113
    .line 114
    .line 115
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    move-object v9, p3

    .line 120
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 121
    .line 122
    if-eqz v9, :cond_1

    .line 123
    .line 124
    const p2, 0x7f0a04d9

    .line 125
    .line 126
    .line 127
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p3

    .line 131
    move-object v10, p3

    .line 132
    check-cast v10, Landroid/widget/TextView;

    .line 133
    .line 134
    if-eqz v10, :cond_1

    .line 135
    .line 136
    const p2, 0x7f0a05d6

    .line 137
    .line 138
    .line 139
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    check-cast p3, Landroid/widget/TextView;

    .line 144
    .line 145
    if-eqz p3, :cond_1

    .line 146
    .line 147
    const p2, 0x7f0a0614

    .line 148
    .line 149
    .line 150
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    check-cast p3, Landroid/widget/TextView;

    .line 155
    .line 156
    if-eqz p3, :cond_1

    .line 157
    .line 158
    const p2, 0x7f0a064b

    .line 159
    .line 160
    .line 161
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    if-eqz v11, :cond_1

    .line 166
    .line 167
    new-instance v1, Lup0;

    .line 168
    .line 169
    move-object v2, p1

    .line 170
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 171
    .line 172
    invoke-direct/range {v1 .. v11}, Lup0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    iput-object v1, p0, Lgp1;->l0:Lup0;

    .line 176
    .line 177
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    invoke-static {p1, p3}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    new-instance v1, Lbq4;

    .line 194
    .line 195
    invoke-direct {v1, p2, p3, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 196
    .line 197
    .line 198
    const-class p1, Ljn3;

    .line 199
    .line 200
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    if-eqz p2, :cond_0

    .line 209
    .line 210
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 211
    .line 212
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-virtual {v1, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Ljn3;

    .line 221
    .line 222
    iput-object p1, p0, Lgp1;->n0:Ljn3;

    .line 223
    .line 224
    return-object v2

    .line 225
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 226
    .line 227
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    const-string p1, "Missing required view with ID: "

    .line 240
    .line 241
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
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
    iput-object v0, p0, Lgp1;->l0:Lup0;

    .line 6
    .line 7
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
    iput-object v7, p0, Lgp1;->q0:Lbl2;

    .line 86
    .line 87
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lgp1;->q0:Lbl2;

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

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object p1, p0, Lgp1;->l0:Lup0;

    .line 2
    .line 3
    iget-object p1, p1, Lup0;->f:Landroid/view/View;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/TextView;

    .line 6
    .line 7
    new-instance p2, Ldp1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p2, p0, v0}, Ldp1;-><init>(Lgp1;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lgp1;->l0:Lup0;

    .line 17
    .line 18
    iget-object p1, p1, Lup0;->h:Landroid/view/View;

    .line 19
    .line 20
    check-cast p1, Landroid/widget/TextView;

    .line 21
    .line 22
    new-instance p2, Ldp1;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {p2, p0, v1}, Ldp1;-><init>(Lgp1;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lgp1;->l0:Lup0;

    .line 32
    .line 33
    iget-object p1, p1, Lup0;->c:Landroid/view/View;

    .line 34
    .line 35
    check-cast p1, Landroid/widget/TextView;

    .line 36
    .line 37
    new-instance p2, Lep1;

    .line 38
    .line 39
    invoke-direct {p2, v0}, Lep1;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lgp1;->n0:Ljn3;

    .line 46
    .line 47
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget-object v2, p1, Ljn3;->e:Lk03;

    .line 52
    .line 53
    invoke-virtual {v2}, Lad2;->d()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const/4 v4, 0x0

    .line 58
    if-nez v3, :cond_0

    .line 59
    .line 60
    iget-object p1, p1, Ljn3;->c:Lhh3;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v0}, Lhh3;->l(Ljava/lang/String;Z)Lk03;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v3, Lg7;

    .line 70
    .line 71
    invoke-direct {v3, v2, v0}, Lg7;-><init>(Lk03;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p2, v3}, Lad2;->e(Lba2;La83;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    new-instance p2, Lfp1;

    .line 82
    .line 83
    invoke-direct {p2, p0, v0}, Lfp1;-><init>(Lgp1;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p1, p2}, Lad2;->e(Lba2;La83;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lgp1;->l0:Lup0;

    .line 90
    .line 91
    iget-object p1, p1, Lup0;->e:Landroid/view/View;

    .line 92
    .line 93
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 94
    .line 95
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 96
    .line 97
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    invoke-direct {p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p0, Lgp1;->l0:Lup0;

    .line 107
    .line 108
    iget-object p1, p1, Lup0;->e:Landroid/view/View;

    .line 109
    .line 110
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 111
    .line 112
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {p2}, Lg12;->v(Landroid/content/Context;)Lis0;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 121
    .line 122
    .line 123
    new-instance p1, Len3;

    .line 124
    .line 125
    invoke-direct {p1, p0}, Len3;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lgp1;->o0:Len3;

    .line 129
    .line 130
    iget-object p2, p0, Lgp1;->l0:Lup0;

    .line 131
    .line 132
    iget-object p2, p2, Lup0;->e:Landroid/view/View;

    .line 133
    .line 134
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 135
    .line 136
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 137
    .line 138
    .line 139
    iget-object p1, p0, Lgp1;->n0:Ljn3;

    .line 140
    .line 141
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iget-object v2, p1, Ljn3;->d:Lk03;

    .line 146
    .line 147
    invoke-virtual {v2}, Lad2;->d()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-nez v3, :cond_1

    .line 152
    .line 153
    iget-object p1, p1, Ljn3;->c:Lhh3;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {}, Lhh3;->k()Lk03;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance v3, Lg7;

    .line 163
    .line 164
    invoke-direct {v3, v2, v0}, Lg7;-><init>(Lk03;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p2, v3}, Lad2;->e(Lba2;La83;)V

    .line 168
    .line 169
    .line 170
    :cond_1
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    new-instance p2, Lfp1;

    .line 175
    .line 176
    const/4 v3, 0x2

    .line 177
    invoke-direct {p2, p0, v3}, Lfp1;-><init>(Lgp1;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, p1, p2}, Lad2;->e(Lba2;La83;)V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Lgp1;->l0:Lup0;

    .line 184
    .line 185
    iget-object p1, p1, Lup0;->g:Landroid/view/View;

    .line 186
    .line 187
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 190
    .line 191
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    invoke-direct {p2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 198
    .line 199
    .line 200
    new-instance p1, Lzd0;

    .line 201
    .line 202
    invoke-direct {p1, p0}, Lzd0;-><init>(Lgp1;)V

    .line 203
    .line 204
    .line 205
    iput-object p1, p0, Lgp1;->p0:Lzd0;

    .line 206
    .line 207
    iget-object p2, p0, Lgp1;->l0:Lup0;

    .line 208
    .line 209
    iget-object p2, p2, Lup0;->g:Landroid/view/View;

    .line 210
    .line 211
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 212
    .line 213
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 214
    .line 215
    .line 216
    iget-object p1, p0, Lgp1;->n0:Ljn3;

    .line 217
    .line 218
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    iget-object v2, p1, Ljn3;->e:Lk03;

    .line 223
    .line 224
    invoke-virtual {v2}, Lad2;->d()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    if-nez v3, :cond_2

    .line 229
    .line 230
    iget-object p1, p1, Ljn3;->c:Lhh3;

    .line 231
    .line 232
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-static {v4, v0}, Lhh3;->l(Ljava/lang/String;Z)Lk03;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    new-instance v3, Lg7;

    .line 240
    .line 241
    invoke-direct {v3, v2, v0}, Lg7;-><init>(Lk03;I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p2, v3}, Lad2;->e(Lba2;La83;)V

    .line 245
    .line 246
    .line 247
    :cond_2
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    new-instance p2, Lfp1;

    .line 252
    .line 253
    invoke-direct {p2, p0, v1}, Lfp1;-><init>(Lgp1;I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, p1, p2}, Lad2;->e(Lba2;La83;)V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public final onDismiss()V
    .locals 4

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lqa1;

    .line 7
    .line 8
    const/16 v2, 0xb

    .line 9
    .line 10
    invoke-direct {v1, v2, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    const-wide/16 v2, 0x3e8

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final onPodcastChannelClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a04ca

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

.method public final onPodcastChannelLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a04c8

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

.method public final onPodcastEpisodeClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lgp1;->q0:Lbl2;

    .line 2
    .line 3
    const-string v1, "PODCAST_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 10
    .line 11
    sget-object v1, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-static {}, Lu52;->c()Lv52;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-boolean v1, v1, Lv52;->a:Z

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, Lws1;

    .line 24
    .line 25
    const/16 v2, 0x11

    .line 26
    .line 27
    invoke-direct {v1, v2, v0, p1}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lgq0;->n:Lgq0;

    .line 31
    .line 32
    invoke-virtual {v0, v1, p1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const p1, 0x7f1302c0

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lu52;->h(I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object p0, p0, Lgp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 43
    .line 44
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 45
    .line 46
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lau;

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final onPodcastEpisodeLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a04cb

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
