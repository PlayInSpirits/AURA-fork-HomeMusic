.class public Lpo1;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Lxc5;

.field public C0:Lcom/eddyizm/tempus/viewmodel/a;

.field public D0:Lro1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 2

    .line 1
    invoke-super {p0}, Lpp0;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpo1;->C0:Lcom/eddyizm/tempus/viewmodel/a;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 8
    .line 9
    iput-object v1, p0, Lpo1;->B0:Lxc5;

    .line 10
    .line 11
    return-void
.end method

.method public final R()V
    .locals 4

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    check-cast v0, Lf9;

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lno1;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v2, p0, v3}, Lno1;-><init>(Lpo1;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, -0x3

    .line 26
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lno1;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {v1, p0, v2}, Lno1;-><init>(Lpo1;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lpo1;->B0:Lxc5;

    .line 40
    .line 41
    iget-object v0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 46
    .line 47
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lpo1;->B0:Lxc5;

    .line 57
    .line 58
    iget-object v0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lro1;

    .line 66
    .line 67
    invoke-direct {v0}, Ldw3;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 71
    .line 72
    iput-object v1, v0, Lro1;->q:Ljava/util/List;

    .line 73
    .line 74
    iput-object v0, p0, Lpo1;->D0:Lro1;

    .line 75
    .line 76
    iget-object v1, p0, Lpo1;->B0:Lxc5;

    .line 77
    .line 78
    iget-object v1, v1, Lxc5;->p:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lpo1;->D0:Lro1;

    .line 86
    .line 87
    iget-object v1, p0, Lpo1;->C0:Lcom/eddyizm/tempus/viewmodel/a;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/eddyizm/tempus/viewmodel/a;->c()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, v0, Lro1;->q:Ljava/util/List;

    .line 94
    .line 95
    invoke-virtual {v0}, Ldw3;->d()V

    .line 96
    .line 97
    .line 98
    new-instance v0, Lf22;

    .line 99
    .line 100
    new-instance v1, Loo1;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Loo1;-><init>(Lpo1;)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, v1}, Lf22;-><init>(Le22;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lpo1;->B0:Lxc5;

    .line 109
    .line 110
    iget-object p0, p0, Lxc5;->p:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Lf22;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f0d0044

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v0, 0x7f0a02c0

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    new-instance v0, Lxc5;

    .line 26
    .line 27
    check-cast p1, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    const/4 v4, 0x6

    .line 30
    invoke-direct {v0, v4, p1, v3}, Lxc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lpo1;->B0:Lxc5;

    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {p1, v3}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v4, Lbq4;

    .line 52
    .line 53
    invoke-direct {v4, v0, v3, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 54
    .line 55
    .line 56
    const-class p1, Lcom/eddyizm/tempus/viewmodel/a;

    .line 57
    .line 58
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v4, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lcom/eddyizm/tempus/viewmodel/a;

    .line 79
    .line 80
    iput-object p1, p0, Lpo1;->C0:Lcom/eddyizm/tempus/viewmodel/a;

    .line 81
    .line 82
    new-instance p1, Lvg2;

    .line 83
    .line 84
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 89
    .line 90
    .line 91
    iget-object p0, p0, Lpo1;->B0:Lxc5;

    .line 92
    .line 93
    iget-object p0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, Landroid/widget/LinearLayout;

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const p1, 0x7f130171

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Lwr;

    .line 108
    .line 109
    const/4 v0, 0x3

    .line 110
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 111
    .line 112
    .line 113
    const v1, 0x7f13016f

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v1, p1}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, Lwr;

    .line 121
    .line 122
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 123
    .line 124
    .line 125
    const v0, 0x7f13016e

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0, v0, p1}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lwr;

    .line 132
    .line 133
    const/4 v0, 0x4

    .line 134
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 135
    .line 136
    .line 137
    const v0, 0x7f13016d

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v0, p1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 150
    .line 151
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    const-string p1, "Missing required view with ID: "

    .line 164
    .line 165
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-object v1
.end method
