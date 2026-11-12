.class public Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public m0:Ld34;

.field public n0:Z


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
.method public final F(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 11
    .line 12
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    :goto_0
    iput-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->n0:Z

    .line 29
    .line 30
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    const p3, 0x7f0d0086

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
    const p2, 0x7f0a056e

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    check-cast p3, Landroid/widget/FrameLayout;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    const p2, 0x7f0a056f

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    new-instance p2, Ld34;

    .line 33
    .line 34
    check-cast p1, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    invoke-direct {p2, p1, p3}, Ld34;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->m0:Ld34;

    .line 40
    .line 41
    const p2, 0x7f0f000f

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3, p2}, Lcom/google/android/material/appbar/MaterialToolbar;->m(I)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->m0:Ld34;

    .line 48
    .line 49
    iget-object p2, p2, Ld34;->o:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 52
    .line 53
    invoke-virtual {p2}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    const p3, 0x7f0a0084

    .line 58
    .line 59
    .line 60
    invoke-interface {p2, p3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-eqz p2, :cond_1

    .line 65
    .line 66
    invoke-interface {p2}, Landroid/view/MenuItem;->getActionView()Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, Landroidx/appcompat/widget/SearchView;

    .line 71
    .line 72
    if-eqz p2, :cond_1

    .line 73
    .line 74
    const p3, 0x7fffffff

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v0}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    .line 81
    .line 82
    .line 83
    const p3, 0x7f1304e1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, p3}, Lkc1;->s(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    const p3, 0x7f0a053f

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    check-cast p3, Landroid/widget/ImageView;

    .line 101
    .line 102
    if-eqz p3, :cond_0

    .line 103
    .line 104
    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    const/16 v0, 0x8

    .line 108
    .line 109
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    :cond_0
    new-instance p3, Lom1;

    .line 113
    .line 114
    const/16 v0, 0x19

    .line 115
    .line 116
    invoke-direct {p3, v0, p0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/SearchView;->setOnQueryTextListener(Lu74;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->m0:Ld34;

    .line 123
    .line 124
    iget-object p2, p2, Ld34;->o:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p2, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 127
    .line 128
    new-instance p3, Lbj3;

    .line 129
    .line 130
    const/16 v0, 0xe

    .line 131
    .line 132
    invoke-direct {p3, v0, p0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2, p3}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    const-string p1, "Missing required view with ID: "

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v1
.end method

.method public final R()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Lom1;->p(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 20
    .line 21
    iget-object v1, v1, Lom1;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lss0;

    .line 24
    .line 25
    iget-object v1, v1, Lss0;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 33
    .line 34
    iget-boolean p0, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->n0:Z

    .line 35
    .line 36
    xor-int/2addr p0, v0

    .line 37
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 38
    .line 39
    invoke-virtual {v0, v1, p0}, Lom1;->q(Ldf;Z)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final S()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->n0:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 17
    .line 18
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lss0;

    .line 21
    .line 22
    iget-object p0, p0, Lss0;->p:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string v0, "enable_drawer_on_portrait"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 39
    .line 40
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 41
    .line 42
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lss0;

    .line 45
    .line 46
    iget-object p0, p0, Lss0;->p:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p1, Lvb4;

    .line 4
    .line 5
    invoke-direct {p1}, Lvb4;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lkc1;->m()Lld1;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p2, Lpo;

    .line 16
    .line 17
    invoke-direct {p2, p0}, Lpo;-><init>(Lld1;)V

    .line 18
    .line 19
    .line 20
    const p0, 0x7f0a056e

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p2, p0, p1, v0}, Lpo;->j(ILkc1;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    iput-boolean p0, p2, Lpo;->p:Z

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    invoke-virtual {p2, p0}, Lpo;->e(Z)I

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
