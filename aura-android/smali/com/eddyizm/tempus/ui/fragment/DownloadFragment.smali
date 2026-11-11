.class public Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lup0;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lom1;

.field public o0:Lbu0;

.field public p0:Lft0;

.field public q0:Lbl2;

.field public r0:Lcom/google/android/material/appbar/MaterialToolbar;


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
.method public final D(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lkc1;->D(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x3ea

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    if-ne p2, p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 p3, 0x3

    .line 26
    invoke-virtual {p2, p1, p3}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lud3;->i0(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lg51;->i()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string p1, "Download directory set"

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iget-object p3, p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->n0:Lom1;

    .line 12
    .line 13
    const p3, 0x7f0d006b

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const p2, 0x7f0a01c4

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    move-object v2, p3

    .line 29
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 30
    .line 31
    const/4 p3, 0x0

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    const p2, 0x7f0a01c8

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v3, v0

    .line 42
    check-cast v3, Landroid/widget/ImageView;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    const p2, 0x7f0a01c9

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v4, v0

    .line 54
    check-cast v4, Landroid/widget/ImageView;

    .line 55
    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    const p2, 0x7f0a01ce

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v5, v0

    .line 66
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    const p2, 0x7f0a01cf

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    move-object v6, v0

    .line 78
    check-cast v6, Landroid/widget/ImageView;

    .line 79
    .line 80
    if-eqz v6, :cond_1

    .line 81
    .line 82
    const p2, 0x7f0a01d0

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    const p2, 0x7f0a01eb

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Landroid/widget/ImageView;

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    const p2, 0x7f0a01ec

    .line 105
    .line 106
    .line 107
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move-object v7, v0

    .line 112
    check-cast v7, Landroid/widget/LinearLayout;

    .line 113
    .line 114
    if-eqz v7, :cond_1

    .line 115
    .line 116
    const p2, 0x7f0a0347

    .line 117
    .line 118
    .line 119
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    move-object v8, v0

    .line 124
    check-cast v8, Landroid/widget/ProgressBar;

    .line 125
    .line 126
    if-eqz v8, :cond_1

    .line 127
    .line 128
    const p2, 0x7f0a0581

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    move-object v9, v0

    .line 136
    check-cast v9, Landroid/widget/TextView;

    .line 137
    .line 138
    if-eqz v9, :cond_1

    .line 139
    .line 140
    const p2, 0x7f0a05d6

    .line 141
    .line 142
    .line 143
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Landroid/widget/TextView;

    .line 148
    .line 149
    if-eqz v0, :cond_1

    .line 150
    .line 151
    const p2, 0x7f0a0614

    .line 152
    .line 153
    .line 154
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Landroid/widget/TextView;

    .line 159
    .line 160
    if-eqz v0, :cond_1

    .line 161
    .line 162
    new-instance v0, Lup0;

    .line 163
    .line 164
    move-object v1, p1

    .line 165
    check-cast v1, Landroid/widget/LinearLayout;

    .line 166
    .line 167
    invoke-direct/range {v0 .. v9}, Lup0;-><init>(Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/ProgressBar;Landroid/widget/TextView;)V

    .line 168
    .line 169
    .line 170
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 171
    .line 172
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {p1, v0}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    new-instance v2, Lbq4;

    .line 189
    .line 190
    invoke-direct {v2, p2, v0, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 191
    .line 192
    .line 193
    const-class p1, Lbu0;

    .line 194
    .line 195
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    if-eqz p2, :cond_0

    .line 204
    .line 205
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 206
    .line 207
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {v2, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    check-cast p1, Lbu0;

    .line 216
    .line 217
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 218
    .line 219
    return-object v1

    .line 220
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 221
    .line 222
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object p3

    .line 226
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    const-string p1, "Missing required view with ID: "

    .line 235
    .line 236
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 10

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
    move-result-object v1

    .line 14
    new-instance v4, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const-class v6, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v1, v4}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

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
    iget-object v1, v3, Lcb4;->a:Lbb4;

    .line 45
    .line 46
    invoke-interface {v1}, Lbb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    new-instance v1, Lxc5;

    .line 53
    .line 54
    new-instance v8, Lx7;

    .line 55
    .line 56
    invoke-direct {v8, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v9, Lfi0;

    .line 60
    .line 61
    invoke-direct {v9, v8}, Lfi0;-><init>(Lx7;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x4

    .line 65
    invoke-direct {v1, v8, v9}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v1, 0x0

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
    new-instance v2, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v2, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v2}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->q0:Lbl2;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->J()V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->q0:Lbl2;

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
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 2
    .line 3
    iget-object p1, p1, Lup0;->a:Landroid/view/ViewGroup;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/LinearLayout;

    .line 6
    .line 7
    const p2, 0x7f0a061b

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->r0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 17
    .line 18
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->n0:Lom1;

    .line 24
    .line 25
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->r0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 28
    .line 29
    invoke-virtual {p1, p2, v0}, Lom1;->n(Ldf;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->r0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const v0, 0x7f06036c

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 61
    .line 62
    iget-object p1, p1, Lup0;->f:Landroid/view/View;

    .line 63
    .line 64
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    const/4 p2, 0x1

    .line 67
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 68
    .line 69
    .line 70
    new-instance p1, Lft0;

    .line 71
    .line 72
    invoke-direct {p1, p0}, Lft0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Lft0;

    .line 76
    .line 77
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 78
    .line 79
    iget-object v0, v0, Lup0;->f:Landroid/view/View;

    .line 80
    .line 81
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 87
    .line 88
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, p1, Lbu0;->c:Lhg3;

    .line 93
    .line 94
    iget-object v1, v1, Lhg3;->o:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lss0;

    .line 97
    .line 98
    iget-object v2, v1, Lss0;->n:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Ls24;

    .line 101
    .line 102
    invoke-virtual {v2}, Ls24;->i()Ls12;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    const-string v3, "download"

    .line 107
    .line 108
    filled-new-array {v3}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    new-instance v4, Los0;

    .line 113
    .line 114
    invoke-direct {v4, v1, p2}, Los0;-><init>(Lss0;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3, v4}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    new-instance v2, Ld8;

    .line 122
    .line 123
    const/16 v3, 0x9

    .line 124
    .line 125
    invoke-direct {v2, v3, p1}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v0, v2}, Lad2;->e(Lba2;La83;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p1, Lbu0;->d:Lk03;

    .line 132
    .line 133
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    new-instance v1, Lvs0;

    .line 138
    .line 139
    const/4 v2, 0x0

    .line 140
    invoke-direct {v1, p0, v2}, Lvs0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 144
    .line 145
    .line 146
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 147
    .line 148
    iget-object p1, p1, Lbu0;->f:Lk03;

    .line 149
    .line 150
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v1, Lvs0;

    .line 155
    .line 156
    invoke-direct {v1, p0, p2}, Lvs0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 163
    .line 164
    iget-object p1, p1, Lup0;->e:Landroid/view/View;

    .line 165
    .line 166
    check-cast p1, Landroid/widget/ImageView;

    .line 167
    .line 168
    new-instance v0, Lws0;

    .line 169
    .line 170
    invoke-direct {v0, p0, v2}, Lws0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 177
    .line 178
    iget-object p1, p1, Lup0;->d:Landroid/view/View;

    .line 179
    .line 180
    check-cast p1, Landroid/widget/ImageView;

    .line 181
    .line 182
    new-instance v0, Lws0;

    .line 183
    .line 184
    invoke-direct {v0, p0, p2}, Lws0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 188
    .line 189
    .line 190
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->l0:Lup0;

    .line 191
    .line 192
    iget-object p1, p1, Lup0;->g:Landroid/view/View;

    .line 193
    .line 194
    check-cast p1, Landroid/widget/ImageView;

    .line 195
    .line 196
    new-instance p2, Lws0;

    .line 197
    .line 198
    const/4 v0, 0x2

    .line 199
    invoke-direct {p2, p0, v0}, Lws0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final h0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p1, v1}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lbu0;->e:Lk03;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const-string v0, "default_download_view_type"

    .line 41
    .line 42
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 4
    .line 5
    const-string v1, "download_type_album"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbu0;->c(Lcom/eddyizm/tempus/model/DownloadStack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onArtistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 4
    .line 5
    const-string v1, "download_type_artist"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbu0;->c(Lcom/eddyizm/tempus/model/DownloadStack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onDownloadGroupLongClick(Landroid/os/Bundle;)V
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
    const v0, 0x7f0a01c0

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

.method public final onGenreClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 4
    .line 5
    const-string v1, "download_type_genre"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbu0;->c(Lcom/eddyizm/tempus/model/DownloadStack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->q0:Lbl2;

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
    invoke-static {v0, v1, p1}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 19
    .line 20
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 21
    .line 22
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lau;

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 28
    .line 29
    .line 30
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

.method public final onPlaylistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 4
    .line 5
    const-string v1, "download_type_playlist"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbu0;->c(Lcom/eddyizm/tempus/model/DownloadStack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onYearClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 2
    .line 3
    new-instance v0, Lcom/eddyizm/tempus/model/DownloadStack;

    .line 4
    .line 5
    const-string v1, "download_type_year"

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, v1, p1}, Lcom/eddyizm/tempus/model/DownloadStack;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lbu0;->c(Lcom/eddyizm/tempus/model/DownloadStack;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
