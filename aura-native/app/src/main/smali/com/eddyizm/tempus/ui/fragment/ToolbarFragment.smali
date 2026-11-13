.class public Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Ldefpackage/ie1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/n92;

.field public o0:Ldefpackage/vf2;

.field public final p0:Ljava/util/ArrayList;

.field public q0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->p0:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/kc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->d0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final G(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 2

    .line 1
    const v0, 0x7f0f000b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const p2, 0x7f0a036d

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const v1, 0x7f130587

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v1, v0, Ldefpackage/cp2;

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    check-cast v0, Ldefpackage/cp2;

    .line 33
    .line 34
    const v1, 0x7f080117

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0, p0}, Ldefpackage/cp2;->setRemoteIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    instance-of p1, p0, Ldefpackage/oo4;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    check-cast p0, Ldefpackage/oo4;

    .line 57
    .line 58
    invoke-interface {p0}, Ldefpackage/oo4;->b()Ldefpackage/e5;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const-string p0, "MenuItemCompat"

    .line 64
    .line 65
    const-string p1, "getActionProvider: item does not implement SupportMenuItem; returning null"

    .line 66
    .line 67
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-object p0, p2

    .line 71
    :goto_0
    instance-of p1, p0, Landroidx/mediarouter/app/MediaRouteActionProvider;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    move-object p2, p0

    .line 76
    check-cast p2, Landroidx/mediarouter/app/MediaRouteActionProvider;

    .line 77
    .line 78
    :cond_3
    if-nez p2, :cond_4

    .line 79
    .line 80
    const-string p0, "UpnpRouteSetup"

    .line 81
    .line 82
    const-string p1, "route item has no MediaRouteActionProvider, leaving it alone"

    .line 83
    .line 84
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_4
    new-instance p0, Ldefpackage/c52;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object p1, p2, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Ldefpackage/rq2;

    .line 94
    .line 95
    const-string v0, "selector must not be null"

    .line 96
    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    invoke-virtual {p1}, Ldefpackage/rq2;->b()Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Ldefpackage/c52;->a(Ljava/util/ArrayList;)V

    .line 104
    .line 105
    .line 106
    const-string p1, "com.eddyizm.tempus.UPNP"

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Ldefpackage/c52;->b(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ldefpackage/c52;->d()Ldefpackage/rq2;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    if-eqz p0, :cond_6

    .line 116
    .line 117
    iget-object p1, p2, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Ldefpackage/rq2;

    .line 118
    .line 119
    invoke-virtual {p1, p0}, Ldefpackage/rq2;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_5

    .line 124
    .line 125
    iput-object p0, p2, Landroidx/mediarouter/app/MediaRouteActionProvider;->c:Ldefpackage/rq2;

    .line 126
    .line 127
    iget-object p1, p2, Landroidx/mediarouter/app/MediaRouteActionProvider;->e:Ldefpackage/cp2;

    .line 128
    .line 129
    if-eqz p1, :cond_5

    .line 130
    .line 131
    invoke-virtual {p1, p0}, Ldefpackage/cp2;->setRouteSelector(Ldefpackage/rq2;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_1
    return-void

    .line 135
    :cond_6
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_7
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

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
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    const p3, 0x7f0d0088

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
    move-object p2, p1

    .line 18
    check-cast p2, Lcom/google/android/material/appbar/AppBarLayout;

    .line 19
    .line 20
    const p3, 0x7f0a061b

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    const p3, 0x7f0a061d

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    const p3, 0x7f0a061e

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroid/widget/LinearLayout;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    new-instance p1, Ldefpackage/ie1;

    .line 55
    .line 56
    invoke-direct {p1, p2, v0, v2}, Ldefpackage/ie1;-><init>(Lcom/google/android/material/appbar/AppBarLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 60
    .line 61
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p1, v0}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v2, Ldefpackage/bq4;

    .line 78
    .line 79
    invoke-direct {v2, p3, v0, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 80
    .line 81
    .line 82
    const-class p1, Ldefpackage/n92;

    .line 83
    .line 84
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 93
    .line 94
    if-eqz p3, :cond_1

    .line 95
    .line 96
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 97
    .line 98
    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    invoke-virtual {v2, p1, p3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Ldefpackage/n92;

    .line 107
    .line 108
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->n0:Ldefpackage/n92;

    .line 109
    .line 110
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 115
    .line 116
    .line 117
    move-result-object p3

    .line 118
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {p1, v2}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    new-instance v4, Ldefpackage/bq4;

    .line 127
    .line 128
    invoke-direct {v4, p3, v2, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 129
    .line 130
    .line 131
    const-class p1, Ldefpackage/vf2;

    .line 132
    .line 133
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    if-eqz p3, :cond_0

    .line 142
    .line 143
    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p3

    .line 147
    invoke-virtual {v4, p1, p3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p1, Ldefpackage/vf2;

    .line 152
    .line 153
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->o0:Ldefpackage/vf2;

    .line 154
    .line 155
    return-object p2

    .line 156
    :cond_0
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object v1

    .line 160
    :cond_1
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0, p3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    const-string p1, "Missing required view with ID: "

    .line 173
    .line 174
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    return-object v1
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 6
    .line 7
    return-void
.end method

.method public final N(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a0084

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 13
    .line 14
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 15
    .line 16
    const p1, 0x7f0a0535

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 20
    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const v0, 0x7f0a0088

    .line 28
    .line 29
    .line 30
    if-ne p1, v0, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 33
    .line 34
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 35
    .line 36
    const p1, 0x7f0a056d

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 40
    .line 41
    .line 42
    return v2

    .line 43
    :cond_1
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->h0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object p1, p0, Ldefpackage/kc1;->I:Ldefpackage/kc1;

    .line 2
    .line 3
    instance-of p1, p1, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 9
    .line 10
    iget-object p1, p1, Ldefpackage/ie1;->a:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    new-instance p2, Ldefpackage/bj3;

    .line 13
    .line 14
    const/16 v0, 0x10

    .line 15
    .line 16
    invoke-direct {p2, v0, p0}, Ldefpackage/bj3;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->n0:Ldefpackage/n92;

    .line 23
    .line 24
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object v0, p1, Ldefpackage/n92;->h:Ldefpackage/k03;

    .line 29
    .line 30
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v2, 0x0

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    iget-object p1, p1, Ldefpackage/n92;->c:Ldefpackage/om0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ldefpackage/om0;->X()Ldefpackage/k03;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v1, Ldefpackage/g7;

    .line 47
    .line 48
    invoke-direct {v1, v0, v2}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Ldefpackage/dv4;

    .line 59
    .line 60
    invoke-direct {p2, p0, v2}, Ldefpackage/dv4;-><init>(Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1, p2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->o0:Ldefpackage/vf2;

    .line 67
    .line 68
    iget-object p1, p1, Ldefpackage/vf2;->d:Ldefpackage/k03;

    .line 69
    .line 70
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    new-instance v0, Ldefpackage/dv4;

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    invoke-direct {v0, p0, v1}, Ldefpackage/dv4;-><init>(Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p1}, Lcom/eddyizm/tempus/database/AppDatabase;->G()Ldefpackage/na4;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object p1, p1, Ldefpackage/na4;->n:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Ldefpackage/s24;

    .line 94
    .line 95
    invoke-virtual {p1}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    const-string p2, "server"

    .line 100
    .line 101
    filled-new-array {p2}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    new-instance v0, Ldefpackage/o54;

    .line 106
    .line 107
    const/16 v1, 0xe

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ldefpackage/o54;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2, v0}, Ldefpackage/s12;->a([Ljava/lang/String;Ldefpackage/if1;)Ldefpackage/t24;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    new-instance v0, Ldefpackage/dv4;

    .line 121
    .line 122
    const/4 v1, 0x2

    .line 123
    invoke-direct {v0, p0, v1}, Ldefpackage/dv4;-><init>(Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final h0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->p0:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x1

    .line 14
    const/4 v3, 0x0

    .line 15
    if-gt v1, v2, :cond_1

    .line 16
    .line 17
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    :cond_1
    iget-object v1, p0, Ldefpackage/kc1;->I:Ldefpackage/kc1;

    .line 24
    .line 25
    instance-of v4, v1, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 26
    .line 27
    if-nez v4, :cond_3

    .line 28
    .line 29
    instance-of v4, v1, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;

    .line 34
    .line 35
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/fragment/HomeFragment;->l0:Ldefpackage/hd5;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iget-object v1, v1, Ldefpackage/hd5;->p:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    :cond_2
    move v1, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_3
    move v1, v3

    .line 52
    :goto_0
    if-nez v1, :cond_4

    .line 53
    .line 54
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->q0:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    iget-object v5, p0, Ldefpackage/kc1;->I:Ldefpackage/kc1;

    .line 59
    .line 60
    instance-of v5, v5, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 61
    .line 62
    if-nez v5, :cond_4

    .line 63
    .line 64
    const v5, 0x7f130056

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v5}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    move v2, v3

    .line 79
    :goto_1
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 80
    .line 81
    iget-object v4, v4, Ldefpackage/ie1;->a:Landroid/widget/LinearLayout;

    .line 82
    .line 83
    invoke-virtual {v4, v1}, Landroid/view/View;->setClickable(Z)V

    .line 84
    .line 85
    .line 86
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 87
    .line 88
    iget-object v4, v4, Ldefpackage/ie1;->b:Landroid/widget/TextView;

    .line 89
    .line 90
    if-nez v1, :cond_6

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    const/16 v5, 0x8

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    :goto_2
    move v5, v3

    .line 99
    :goto_3
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 103
    .line 104
    iget-object v4, v4, Ldefpackage/ie1;->b:Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v1, :cond_7

    .line 107
    .line 108
    const v5, 0x7f080126

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_7
    move v5, v3

    .line 113
    :goto_4
    invoke-virtual {v4, v3, v3, v5, v3}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    .line 114
    .line 115
    .line 116
    if-eqz v2, :cond_8

    .line 117
    .line 118
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 119
    .line 120
    iget-object v0, v0, Ldefpackage/ie1;->b:Landroid/widget/TextView;

    .line 121
    .line 122
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->q0:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_8
    if-nez v1, :cond_9

    .line 129
    .line 130
    :goto_5
    return-void

    .line 131
    :cond_9
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-nez v1, :cond_a

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    goto :goto_6

    .line 139
    :cond_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    :cond_b
    if-ge v3, v2, :cond_d

    .line 144
    .line 145
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    add-int/lit8 v3, v3, 0x1

    .line 150
    .line 151
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-eqz v5, :cond_b

    .line 162
    .line 163
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    if-eqz v0, :cond_c

    .line 168
    .line 169
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    goto :goto_6

    .line 174
    :cond_c
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    :cond_d
    :goto_6
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->l0:Ldefpackage/ie1;

    .line 179
    .line 180
    iget-object v0, v0, Ldefpackage/ie1;->b:Landroid/widget/TextView;

    .line 181
    .line 182
    if-eqz v1, :cond_e

    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_e
    const v1, 0x7f1304c4

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    :goto_7
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    .line 194
    .line 195
    return-void
.end method
