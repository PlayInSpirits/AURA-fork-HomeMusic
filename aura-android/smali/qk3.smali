.class public Lqk3;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Lml3;

.field public m0:Laj3;

.field public n0:Lbl2;

.field public o0:Lbj2;

.field public p0:Landroid/os/Handler;

.field public q0:Lnk3;

.field public r0:Ljava/lang/String;

.field public s0:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

.field public t0:Ljava/lang/Integer;

.field public u0:Ljava/lang/String;


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

.method public static h0(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->getLine()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->getLine()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_0

    .line 65
    .line 66
    const/4 p0, 0x1

    .line 67
    return p0

    .line 68
    :cond_0
    return v0
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 1
    const p3, 0x7f0d0090

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
    const p2, 0x7f0a01c6

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    move-object v3, p3

    .line 17
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    const p2, 0x7f0a01eb

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    move-object v4, v1

    .line 30
    check-cast v4, Landroid/widget/ImageView;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const p2, 0x7f0a042c

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v5, v1

    .line 42
    check-cast v5, Landroidx/core/widget/NestedScrollView;

    .line 43
    .line 44
    if-eqz v5, :cond_1

    .line 45
    .line 46
    const p2, 0x7f0a042d

    .line 47
    .line 48
    .line 49
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v6, v1

    .line 54
    check-cast v6, Landroid/widget/TextView;

    .line 55
    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    const p2, 0x7f0a05df

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    move-object v7, v1

    .line 66
    check-cast v7, Lcom/google/android/material/button/MaterialButton;

    .line 67
    .line 68
    if-eqz v7, :cond_1

    .line 69
    .line 70
    const p2, 0x7f0a05f3

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Landroid/widget/TextView;

    .line 78
    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    const p2, 0x7f0a0614

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v8, v1

    .line 89
    check-cast v8, Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz v8, :cond_1

    .line 92
    .line 93
    new-instance v1, Lml3;

    .line 94
    .line 95
    move-object v2, p1

    .line 96
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 97
    .line 98
    invoke-direct/range {v1 .. v8}, Lml3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, Lqk3;->l0:Lml3;

    .line 102
    .line 103
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {p1, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance v3, Lbq4;

    .line 120
    .line 121
    invoke-direct {v3, p2, v1, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 122
    .line 123
    .line 124
    const-class p1, Laj3;

    .line 125
    .line 126
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-eqz p2, :cond_0

    .line 135
    .line 136
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 137
    .line 138
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {v3, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    check-cast p1, Laj3;

    .line 147
    .line 148
    iput-object p1, p0, Lqk3;->m0:Laj3;

    .line 149
    .line 150
    iget-object p1, p0, Lqk3;->l0:Lml3;

    .line 151
    .line 152
    iget-object p1, p1, Lml3;->e:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 155
    .line 156
    new-instance p2, Lok3;

    .line 157
    .line 158
    invoke-direct {p2, p0, v0}, Lok3;-><init>(Lqk3;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lqk3;->l0:Lml3;

    .line 165
    .line 166
    iget-object p1, p1, Lml3;->a:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 169
    .line 170
    new-instance p2, Lok3;

    .line 171
    .line 172
    const/4 p3, 0x1

    .line 173
    invoke-direct {p2, p0, p3}, Lok3;-><init>(Lqk3;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 181
    .line 182
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object p3

    .line 186
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    const-string p1, "Missing required view with ID: "

    .line 195
    .line 196
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
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
    iput-object v0, p0, Lqk3;->l0:Lml3;

    .line 6
    .line 7
    iput-object v0, p0, Lqk3;->r0:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lqk3;->s0:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 10
    .line 11
    iput-object v0, p0, Lqk3;->u0:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v0, p0, Lqk3;->t0:Ljava/lang/Integer;

    .line 14
    .line 15
    return-void
.end method

.method public final O()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lqk3;->q0:Lnk3;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lqk3;->p0:Landroid/os/Handler;

    .line 15
    .line 16
    :cond_0
    const-string v0, "always_on_display"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 v0, 0x80

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final P()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lqk3;->n0:Lbl2;

    .line 5
    .line 6
    new-instance v1, Lnk3;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Lnk3;-><init>(Lqk3;I)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lgq0;->n:Lgq0;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/16 v0, 0x80

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 28
    .line 29
    .line 30
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
    iput-object v7, p0, Lqk3;->n0:Lbl2;

    .line 86
    .line 87
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqk3;->n0:Lbl2;

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
    .locals 2

    .line 1
    iget-object p1, p0, Lqk3;->m0:Laj3;

    .line 2
    .line 3
    iget-object p1, p1, Laj3;->j:Lk03;

    .line 4
    .line 5
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    new-instance v0, Lmk3;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, Lmk3;-><init>(Lqk3;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2, v0}, Lad2;->e(Lba2;La83;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lqk3;->m0:Laj3;

    .line 19
    .line 20
    iget-object p1, p1, Laj3;->k:Lk03;

    .line 21
    .line 22
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lmk3;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, p0, v1}, Lmk3;-><init>(Lqk3;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lad2;->e(Lba2;La83;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lqk3;->m0:Laj3;

    .line 36
    .line 37
    iget-object p1, p1, Laj3;->m:Lk03;

    .line 38
    .line 39
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v0, Lmk3;

    .line 44
    .line 45
    const/4 v1, 0x3

    .line 46
    invoke-direct {v0, p0, v1}, Lmk3;-><init>(Lqk3;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2, v0}, Lad2;->e(Lba2;La83;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lqk3;->m0:Laj3;

    .line 53
    .line 54
    iget-object p1, p1, Laj3;->l:Lk03;

    .line 55
    .line 56
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    new-instance v0, Lmk3;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {v0, p0, v1}, Lmk3;-><init>(Lqk3;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2, v0}, Lad2;->e(Lba2;La83;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final i0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Lml3;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/core/widget/NestedScrollView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    rsub-int/lit8 v1, v1, 0x0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    rsub-int/lit8 v3, v3, 0x0

    .line 22
    .line 23
    invoke-virtual {v0, v1, v3, v2}, Landroidx/core/widget/NestedScrollView;->u(IIZ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lqk3;->s0:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 27
    .line 28
    invoke-static {v0}, Lqk3;->h0(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x1

    .line 33
    const/16 v3, 0x8

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p0, Lqk3;->s0:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;

    .line 64
    .line 65
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->getLine()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    new-instance v4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/LyricsList;->getStructuredLyrics()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->getLine()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_1

    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Line;

    .line 107
    .line 108
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Line;->getValue()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v5, "\n\n"

    .line 120
    .line 121
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_1
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 126
    .line 127
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Landroid/widget/TextView;

    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 139
    .line 140
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 148
    .line 149
    iget-object v0, v0, Lml3;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Landroid/widget/ImageView;

    .line 152
    .line 153
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 157
    .line 158
    iget-object v0, v0, Lml3;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 166
    .line 167
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 170
    .line 171
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 172
    .line 173
    .line 174
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 175
    .line 176
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 179
    .line 180
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, Lqk3;->l0:Lml3;

    .line 184
    .line 185
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 188
    .line 189
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_3
    iget-object v0, p0, Lqk3;->r0:Ljava/lang/String;

    .line 194
    .line 195
    if-eqz v0, :cond_4

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_4

    .line 206
    .line 207
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 208
    .line 209
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Landroid/widget/TextView;

    .line 212
    .line 213
    iget-object v4, p0, Lqk3;->r0:Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v4}, Le03;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 223
    .line 224
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Landroid/widget/TextView;

    .line 227
    .line 228
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 232
    .line 233
    iget-object v0, v0, Lml3;->b:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Landroid/widget/ImageView;

    .line 236
    .line 237
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 241
    .line 242
    iget-object v0, v0, Lml3;->f:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Landroid/widget/TextView;

    .line 245
    .line 246
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 247
    .line 248
    .line 249
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 250
    .line 251
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 254
    .line 255
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 256
    .line 257
    .line 258
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 259
    .line 260
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 263
    .line 264
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 265
    .line 266
    .line 267
    iget-object p0, p0, Lqk3;->l0:Lml3;

    .line 268
    .line 269
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 272
    .line 273
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :cond_4
    iget-object v0, p0, Lqk3;->u0:Ljava/lang/String;

    .line 278
    .line 279
    if-eqz v0, :cond_5

    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    if-nez v0, :cond_5

    .line 290
    .line 291
    goto :goto_1

    .line 292
    :cond_5
    move v1, v2

    .line 293
    :goto_1
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 294
    .line 295
    if-eqz v1, :cond_6

    .line 296
    .line 297
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Landroid/widget/TextView;

    .line 300
    .line 301
    iget-object v1, p0, Lqk3;->u0:Ljava/lang/String;

    .line 302
    .line 303
    invoke-static {v1}, Le03;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 308
    .line 309
    .line 310
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 311
    .line 312
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Landroid/widget/TextView;

    .line 315
    .line 316
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 317
    .line 318
    .line 319
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 320
    .line 321
    iget-object v0, v0, Lml3;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast v0, Landroid/widget/ImageView;

    .line 324
    .line 325
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 326
    .line 327
    .line 328
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 329
    .line 330
    iget-object v0, v0, Lml3;->f:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Landroid/widget/TextView;

    .line 333
    .line 334
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 335
    .line 336
    .line 337
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 338
    .line 339
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 342
    .line 343
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 344
    .line 345
    .line 346
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 347
    .line 348
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 351
    .line 352
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 353
    .line 354
    .line 355
    iget-object p0, p0, Lqk3;->l0:Lml3;

    .line 356
    .line 357
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 360
    .line 361
    invoke-virtual {p0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :cond_6
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, Landroid/widget/TextView;

    .line 368
    .line 369
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 370
    .line 371
    .line 372
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 373
    .line 374
    iget-object v0, v0, Lml3;->b:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Landroid/widget/ImageView;

    .line 377
    .line 378
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 379
    .line 380
    .line 381
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 382
    .line 383
    iget-object v0, v0, Lml3;->f:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast v0, Landroid/widget/TextView;

    .line 386
    .line 387
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 388
    .line 389
    .line 390
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 391
    .line 392
    iget-object v0, v0, Lml3;->e:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 395
    .line 396
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 397
    .line 398
    .line 399
    iget-object v0, p0, Lqk3;->l0:Lml3;

    .line 400
    .line 401
    iget-object v0, v0, Lml3;->a:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 404
    .line 405
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 406
    .line 407
    .line 408
    iget-object p0, p0, Lqk3;->l0:Lml3;

    .line 409
    .line 410
    iget-object p0, p0, Lml3;->a:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 413
    .line 414
    invoke-virtual {p0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 415
    .line 416
    .line 417
    return-void
.end method
