.class public Lhp1;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;
.implements Lcom/eddyizm/tempus/interfaces/RadioCallback;


# instance fields
.field public l0:Lz40;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Liu3;

.field public o0:Lzd0;

.field public p0:Lbl2;


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
    .locals 8

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
    iput-object p3, p0, Lhp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0072

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
    const p2, 0x7f0a01ef

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
    const p2, 0x7f0a031b

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
    check-cast v5, Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    const p2, 0x7f0a031c

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
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    const p2, 0x7f0a0320

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    move-object v7, p3

    .line 85
    check-cast v7, Landroid/widget/TextView;

    .line 86
    .line 87
    if-eqz v7, :cond_1

    .line 88
    .line 89
    const p2, 0x7f0a05d6

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    check-cast p3, Landroid/widget/TextView;

    .line 97
    .line 98
    if-eqz p3, :cond_1

    .line 99
    .line 100
    const p2, 0x7f0a0614

    .line 101
    .line 102
    .line 103
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    check-cast p3, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz p3, :cond_1

    .line 110
    .line 111
    new-instance v1, Lz40;

    .line 112
    .line 113
    move-object v2, p1

    .line 114
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 115
    .line 116
    invoke-direct/range {v1 .. v7}, Lz40;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    iput-object v1, p0, Lhp1;->l0:Lz40;

    .line 120
    .line 121
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-static {p1, p3}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    new-instance v1, Lbq4;

    .line 138
    .line 139
    invoke-direct {v1, p2, p3, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 140
    .line 141
    .line 142
    const-class p1, Liu3;

    .line 143
    .line 144
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-eqz p2, :cond_0

    .line 153
    .line 154
    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 155
    .line 156
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {v1, p1, p2}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Liu3;

    .line 165
    .line 166
    iput-object p1, p0, Lhp1;->n0:Liu3;

    .line 167
    .line 168
    return-object v2

    .line 169
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 170
    .line 171
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    const-string p1, "Missing required view with ID: "

    .line 184
    .line 185
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
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
    iput-object v0, p0, Lhp1;->l0:Lz40;

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
    iput-object v7, p0, Lhp1;->p0:Lbl2;

    .line 86
    .line 87
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lhp1;->p0:Lbl2;

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
    iget-object p1, p0, Lhp1;->l0:Lz40;

    .line 2
    .line 3
    iget-object p1, p1, Lz40;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/TextView;

    .line 6
    .line 7
    new-instance p2, Lp6;

    .line 8
    .line 9
    const/16 v0, 0x13

    .line 10
    .line 11
    invoke-direct {p2, v0, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lhp1;->l0:Lz40;

    .line 18
    .line 19
    iget-object p1, p1, Lz40;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroid/widget/TextView;

    .line 22
    .line 23
    new-instance p2, Lq6;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    invoke-direct {p2, v0, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lhp1;->l0:Lz40;

    .line 34
    .line 35
    iget-object p1, p1, Lz40;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Landroid/widget/TextView;

    .line 38
    .line 39
    new-instance p2, Lep1;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-direct {p2, v0}, Lep1;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lhp1;->l0:Lz40;

    .line 49
    .line 50
    iget-object p1, p1, Lz40;->q:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 53
    .line 54
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 55
    .line 56
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lhp1;->l0:Lz40;

    .line 66
    .line 67
    iget-object p1, p1, Lz40;->q:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lzd0;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Lzd0;-><init>(Lhp1;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lhp1;->o0:Lzd0;

    .line 80
    .line 81
    iget-object p2, p0, Lhp1;->l0:Lz40;

    .line 82
    .line 83
    iget-object p2, p2, Lz40;->q:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    .line 87
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lhp1;->n0:Liu3;

    .line 91
    .line 92
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p1, p2}, Liu3;->c(Lle1;)Lk03;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    new-instance v0, Ld8;

    .line 105
    .line 106
    const/16 v1, 0xc

    .line 107
    .line 108
    invoke-direct {v0, v1, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p2, v0}, Lad2;->e(Lba2;La83;)V

    .line 112
    .line 113
    .line 114
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
    const/16 v2, 0xc

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

.method public final onInternetRadioStationClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhp1;->p0:Lbl2;

    .line 2
    .line 3
    const-string v1, "INTERNET_RADIO_STATION_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

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
    const/16 v2, 0x16

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
    iget-object p0, p0, Lhp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

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

.method public final onInternetRadioStationLongClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance v0, Leu3;

    .line 2
    .line 3
    new-instance v1, Lhg3;

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    invoke-direct {v1, v2, p0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Leu3;-><init>(Lcom/eddyizm/tempus/interfaces/RadioCallback;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lhp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 17
    .line 18
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {v0, p0, p1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
