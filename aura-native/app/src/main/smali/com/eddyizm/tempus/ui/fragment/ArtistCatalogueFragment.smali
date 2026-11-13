.class public Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/rc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/hj;

.field public o0:Ldefpackage/ej;

.field public p0:I

.field public q0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->p0:I

    .line 6
    .line 7
    const/16 v0, 0x14

    .line 8
    .line 9
    iput v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->q0:I

    .line 10
    .line 11
    return-void
.end method

.method public static h0(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->n0:Ldefpackage/hj;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/hj;->c:Ldefpackage/k03;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/util/List;

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    if-eqz p1, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Ldefpackage/ej;

    .line 87
    .line 88
    iput-object v1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 89
    .line 90
    new-instance p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    :goto_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Ldefpackage/ej;

    .line 102
    .line 103
    iput-object v0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 104
    .line 105
    new-instance p1, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 113
    .line 114
    .line 115
    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/kc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->d0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p1, v1}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v2, Ldefpackage/bq4;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 26
    .line 27
    .line 28
    const-class p1, Ldefpackage/hj;

    .line 29
    .line 30
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v2, p1, v0}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Ldefpackage/hj;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->n0:Ldefpackage/hj;

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    invoke-static {p0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ldefpackage/gp3;->j()Lretrofit2/Call;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance v0, Ldefpackage/zh0;

    .line 68
    .line 69
    const/4 v1, 0x7

    .line 70
    invoke-direct {v0, v1, p1}, Ldefpackage/zh0;-><init>(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p0, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 78
    .line 79
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final G(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .line 1
    const v0, 0x7f0f0017

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
    move-result-object p1

    .line 14
    invoke-interface {p1}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroid/widget/SearchView;

    .line 19
    .line 20
    const/4 p2, 0x6

    .line 21
    invoke-virtual {p1, p2}, Landroid/widget/SearchView;->setImeOptions(I)V

    .line 22
    .line 23
    .line 24
    const p2, 0x7f13014f

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    new-instance p2, Ldefpackage/gj;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Ldefpackage/gj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p2}, Landroid/widget/SearchView;->setOnQueryTextListener(Landroid/widget/SearchView$OnQueryTextListener;)V

    .line 40
    .line 41
    .line 42
    const/16 p0, -0x20

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p1, p0, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0064

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
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

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
    if-eqz v3, :cond_3

    .line 28
    .line 29
    const p2, 0x7f0a00e5

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    move-object v4, p3

    .line 37
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    const p2, 0x7f0a00e9

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    move-object v5, p3

    .line 49
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 50
    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    const p2, 0x7f0a00ed

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    move-object v6, p3

    .line 61
    check-cast v6, Landroid/widget/Button;

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    const p2, 0x7f0a061b

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    move-object v7, p3

    .line 73
    check-cast v7, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 74
    .line 75
    if-eqz v7, :cond_3

    .line 76
    .line 77
    new-instance v1, Ldefpackage/rc1;

    .line 78
    .line 79
    move-object v2, p1

    .line 80
    check-cast v2, Landroid/widget/LinearLayout;

    .line 81
    .line 82
    invoke-direct/range {v1 .. v7}, Ldefpackage/rc1;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/appbar/AppBarLayout;Landroidx/recyclerview/widget/RecyclerView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/Button;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 86
    .line 87
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    iget-boolean p3, p1, Ldefpackage/ut4;->h:Z

    .line 107
    .line 108
    if-nez p3, :cond_0

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 111
    .line 112
    .line 113
    :cond_0
    iget p1, p1, Ldefpackage/ut4;->b:I

    .line 114
    .line 115
    iput p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->p0:I

    .line 116
    .line 117
    invoke-static {}, Ldefpackage/ut4;->c()Ldefpackage/ut4;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    iget-boolean p3, p1, Ldefpackage/ut4;->h:Z

    .line 126
    .line 127
    if-nez p3, :cond_1

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ldefpackage/ut4;->b(Landroid/content/Context;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    iget p1, p1, Ldefpackage/ut4;->c:I

    .line 133
    .line 134
    iput p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->q0:I

    .line 135
    .line 136
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 137
    .line 138
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 139
    .line 140
    iget-object p2, p2, Ldefpackage/rc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 141
    .line 142
    invoke-virtual {p1, p2}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 146
    .line 147
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const/4 p2, 0x1

    .line 152
    if-eqz p1, :cond_2

    .line 153
    .line 154
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 155
    .line 156
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-virtual {p1, p2}, Ldefpackage/l93;->f0(Z)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 164
    .line 165
    invoke-virtual {p1}, Ldefpackage/df;->n()Ldefpackage/l93;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, Ldefpackage/l93;->g0()V

    .line 170
    .line 171
    .line 172
    :cond_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 173
    .line 174
    iget-object p1, p1, Ldefpackage/rc1;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 175
    .line 176
    new-instance p3, Ldefpackage/fj;

    .line 177
    .line 178
    invoke-direct {p3, p0, p2}, Ldefpackage/fj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    .line 183
    .line 184
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 185
    .line 186
    iget-object p1, p1, Ldefpackage/rc1;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 187
    .line 188
    new-instance p3, Ldefpackage/u7;

    .line 189
    .line 190
    const/4 v1, 0x2

    .line 191
    invoke-direct {p3, v1, p0}, Ldefpackage/u7;-><init>(ILdefpackage/kc1;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, p3}, Lcom/google/android/material/appbar/AppBarLayout;->a(Ldefpackage/af;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 198
    .line 199
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 200
    .line 201
    new-instance p3, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 202
    .line 203
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 204
    .line 205
    .line 206
    iget v3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->p0:I

    .line 207
    .line 208
    invoke-direct {p3, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 215
    .line 216
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 217
    .line 218
    new-instance p3, Ldefpackage/ek1;

    .line 219
    .line 220
    iget v3, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->p0:I

    .line 221
    .line 222
    iget v4, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->q0:I

    .line 223
    .line 224
    invoke-direct {p3, v3, v4}, Ldefpackage/ek1;-><init>(II)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/RecyclerView;->i(Ldefpackage/kw3;)V

    .line 228
    .line 229
    .line 230
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 231
    .line 232
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 233
    .line 234
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 235
    .line 236
    .line 237
    new-instance p1, Ldefpackage/ej;

    .line 238
    .line 239
    invoke-direct {p1, p0}, Ldefpackage/ej;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;)V

    .line 240
    .line 241
    .line 242
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Ldefpackage/ej;

    .line 243
    .line 244
    iput v1, p1, Ldefpackage/dw3;->p:I

    .line 245
    .line 246
    iget-object p1, p1, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 247
    .line 248
    invoke-virtual {p1}, Ldefpackage/ew3;->g()V

    .line 249
    .line 250
    .line 251
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 252
    .line 253
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 254
    .line 255
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->o0:Ldefpackage/ej;

    .line 256
    .line 257
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 258
    .line 259
    .line 260
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->n0:Ldefpackage/hj;

    .line 261
    .line 262
    iget-object p1, p1, Ldefpackage/hj;->c:Ldefpackage/k03;

    .line 263
    .line 264
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    new-instance p3, Ldefpackage/d8;

    .line 269
    .line 270
    const/4 v3, 0x4

    .line 271
    invoke-direct {p3, v3, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1, p2, p3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 275
    .line 276
    .line 277
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 278
    .line 279
    iget-object p1, p1, Ldefpackage/rc1;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 280
    .line 281
    new-instance p2, Ldefpackage/s7;

    .line 282
    .line 283
    invoke-direct {p2, v1, p0}, Ldefpackage/s7;-><init>(ILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 287
    .line 288
    .line 289
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 290
    .line 291
    iget-object p1, p1, Ldefpackage/rc1;->d:Landroid/widget/Button;

    .line 292
    .line 293
    new-instance p2, Ldefpackage/fj;

    .line 294
    .line 295
    invoke-direct {p2, p0, v0}, Ldefpackage/fj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 299
    .line 300
    .line 301
    return-object v2

    .line 302
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    const-string p1, "Missing required view with ID: "

    .line 311
    .line 312
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    const/4 p0, 0x0

    .line 320
    return-object p0
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->l0:Ldefpackage/rc1;

    .line 6
    .line 7
    return-void
.end method

.method public final i0(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 2
    .line 3
    const-string v0, "input_method"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onArtistClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0a00e2

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, p1, v2}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->i0(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onArtistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00df

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
