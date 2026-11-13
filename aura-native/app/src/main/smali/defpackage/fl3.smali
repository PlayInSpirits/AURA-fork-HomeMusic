.class public Ldefpackage/fl3;
.super Ldefpackage/pp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public B0:Ldefpackage/ml3;

.field public C0:Ldefpackage/gl3;

.field public D0:Ldefpackage/zd0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/pp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldefpackage/pp0;->J()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 3

    .line 1
    invoke-super {p0}, Ldefpackage/pp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 5
    .line 6
    iget-object v0, v0, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 23
    .line 24
    iget-object v0, v0, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ldefpackage/zd0;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Ldefpackage/zd0;-><init>(Ldefpackage/fl3;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Ldefpackage/fl3;->D0:Ldefpackage/zd0;

    .line 37
    .line 38
    iget-object v1, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 39
    .line 40
    iget-object v1, v1, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Ldefpackage/fl3;->C0:Ldefpackage/gl3;

    .line 48
    .line 49
    iget-object v0, v0, Ldefpackage/gl3;->c:Ldefpackage/mm3;

    .line 50
    .line 51
    invoke-virtual {v0}, Ldefpackage/mm3;->h()V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ldefpackage/ud3;->s()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v0, v1}, Ldefpackage/mm3;->e(Ljava/lang/String;)Ldefpackage/t24;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Ldefpackage/d8;

    .line 63
    .line 64
    const/16 v2, 0x12

    .line 65
    .line 66
    invoke-direct {v1, v2, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Ldefpackage/fl3;->C0:Ldefpackage/gl3;

    .line 73
    .line 74
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v1, "TRACKS_OBJECT"

    .line 79
    .line 80
    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iput-object p0, v0, Ldefpackage/gl3;->e:Ljava/util/ArrayList;

    .line 85
    .line 86
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ldefpackage/ml3;->p(Landroid/view/LayoutInflater;)Ldefpackage/ml3;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/kc1;->o()Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Ldefpackage/ml3;->p(Landroid/view/LayoutInflater;)Ldefpackage/ml3;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v2, Ldefpackage/bq4;

    .line 35
    .line 36
    invoke-direct {v2, v0, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 37
    .line 38
    .line 39
    const-class p1, Ldefpackage/gl3;

    .line 40
    .line 41
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 53
    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v2, p1, v0}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ldefpackage/gl3;

    .line 63
    .line 64
    iput-object p1, p0, Ldefpackage/fl3;->C0:Ldefpackage/gl3;

    .line 65
    .line 66
    iget-object p1, p1, Ldefpackage/gl3;->d:Ldefpackage/k03;

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 72
    .line 73
    iget-object p1, p1, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 76
    .line 77
    new-instance v0, Ldefpackage/g20;

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    invoke-direct {v0, v1, p0}, Ldefpackage/g20;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 87
    .line 88
    iget-object p1, p1, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Landroid/widget/Button;

    .line 91
    .line 92
    new-instance v0, Ldefpackage/el3;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-direct {v0, p0, v1}, Ldefpackage/el3;-><init>(Ldefpackage/fl3;I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 102
    .line 103
    iget-object p1, p1, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, Landroid/widget/Button;

    .line 106
    .line 107
    new-instance v0, Ldefpackage/el3;

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    invoke-direct {v0, p0, v2}, Ldefpackage/el3;-><init>(Ldefpackage/fl3;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Ldefpackage/vg2;

    .line 117
    .line 118
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-direct {p1, v0, v1}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, Ldefpackage/fl3;->B0:Ldefpackage/ml3;

    .line 126
    .line 127
    iget-object p0, p0, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, Landroid/widget/LinearLayout;

    .line 130
    .line 131
    invoke-virtual {p1, p0}, Ldefpackage/vg2;->q(Landroid/view/View;)Ldefpackage/vg2;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const p1, 0x7f1303e5

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, p1}, Ldefpackage/vg2;->p(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Ldefpackage/vg2;->create()Ldefpackage/f9;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 147
    .line 148
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v1
.end method

.method public final onPlaylistClick(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/fl3;->C0:Ldefpackage/gl3;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/gl3;->e:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "PLAYLIST_OBJECT"

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 21
    .line 22
    iget-object v3, p0, Ldefpackage/fl3;->C0:Ldefpackage/gl3;

    .line 23
    .line 24
    iget-object v6, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object p1, v3, Ldefpackage/gl3;->e:Ljava/util/ArrayList;

    .line 31
    .line 32
    new-instance v0, Ldefpackage/nz2;

    .line 33
    .line 34
    const/16 v2, 0xe

    .line 35
    .line 36
    invoke-direct {v0, v2}, Ldefpackage/nz2;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p1}, Ldefpackage/hw;->P(Ldefpackage/eg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string p1, "allow_playlist_duplicates"

    .line 44
    .line 45
    invoke-static {p1, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v0, v3, Ldefpackage/gl3;->c:Ldefpackage/mm3;

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    new-instance p0, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v3, Ldefpackage/gl3;->d:Ldefpackage/k03;

    .line 59
    .line 60
    invoke-virtual {p1}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0, v5, p0, p1}, Ldefpackage/mm3;->a(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Boolean;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6}, Landroid/app/Dialog;->dismiss()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_0
    const/4 p1, 0x1

    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-virtual {v0, v5, p1, v1}, Ldefpackage/mm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Ldefpackage/k03;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v2, Ldefpackage/oq0;

    .line 80
    .line 81
    const/4 v7, 0x2

    .line 82
    invoke-direct/range {v2 .. v7}, Ldefpackage/oq0;-><init>(Ljava/lang/Object;Ljava/util/AbstractList;Ljava/io/Serializable;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const p1, 0x7f1303e6

    .line 94
    .line 95
    .line 96
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 101
    .line 102
    .line 103
    return-void
.end method
