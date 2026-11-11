.class public Lvb4;
.super Lkp3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A0:Ljava/util/HashSet;

.field public B0:Z

.field public C0:Ljava/lang/Integer;

.field public D0:Ljava/lang/String;

.field public final E0:Lnp0;

.field public final F0:Ly11;

.field public t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public u0:Lob4;

.field public v0:Lvf2;

.field public w0:Lr5;

.field public x0:Lxp;

.field public y0:Z

.field public z0:Lr5;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkp3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lvb4;->y0:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lvb4;->A0:Ljava/util/HashSet;

    .line 13
    .line 14
    iput-boolean v0, p0, Lvb4;->B0:Z

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lvb4;->C0:Ljava/lang/Integer;

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    iput-object v0, p0, Lvb4;->D0:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v0, Lnp0;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, v1, p0}, Lnp0;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lvb4;->E0:Lnp0;

    .line 30
    .line 31
    new-instance v0, Ly11;

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    invoke-direct {v0, v1, p0}, Ly11;-><init>(ILkc1;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lvb4;->F0:Ly11;

    .line 38
    .line 39
    return-void
.end method

.method public static k0(Lvb4;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lvb4;->u0:Lob4;

    .line 2
    .line 3
    new-instance v1, Lnb4;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2, p0}, Lnb4;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, v0, Lob4;->c:Lhh3;

    .line 10
    .line 11
    new-instance v0, Lnb4;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v2, v1}, Lnb4;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object v1, p0, Lpn4;->k:Lrm3;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Lrm3;

    .line 29
    .line 30
    const/16 v2, 0xe

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, Lrm3;-><init>(Lpn4;I)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lpn4;->k:Lrm3;

    .line 36
    .line 37
    :cond_0
    iget-object p0, p0, Lpn4;->k:Lrm3;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-string v1, "MediaLibraryScanningClient"

    .line 43
    .line 44
    const-string v2, "startScan()"

    .line 45
    .line 46
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lrm3;->o:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lin2;

    .line 52
    .line 53
    iget-object p0, p0, Lrm3;->n:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lpn4;

    .line 56
    .line 57
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {v1, p0}, Lin2;->a(Ljava/util/Map;)Lretrofit2/Call;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance v1, Lom1;

    .line 66
    .line 67
    const/16 v2, 0x16

    .line 68
    .line 69
    invoke-direct {v1, v2, v0}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {p0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static r0(Landroidx/preference/PreferenceGroup;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_2

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 17
    .line 18
    .line 19
    instance-of v3, v2, Landroidx/preference/PreferenceCategory;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget-object v3, v2, Landroidx/preference/Preference;->x:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    iput-object v3, v2, Landroidx/preference/Preference;->x:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    iput v0, v2, Landroidx/preference/Preference;->w:I

    .line 31
    .line 32
    invoke-virtual {v2}, Landroidx/preference/Preference;->h()V

    .line 33
    .line 34
    .line 35
    :cond_0
    instance-of v3, v2, Landroidx/preference/PreferenceGroup;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    check-cast v2, Landroidx/preference/PreferenceGroup;

    .line 40
    .line 41
    invoke-static {v2}, Lvb4;->r0(Landroidx/preference/PreferenceGroup;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lkp3;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lq5;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p1, v0}, Lq5;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lnz2;

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    invoke-direct {v1, v2}, Lnz2;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, p1}, Lkc1;->W(Lp5;Lsu3;)Ldc1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lvb4;->z0:Lr5;

    .line 22
    .line 23
    new-instance p1, Lq5;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lq5;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lss1;

    .line 29
    .line 30
    const/16 v1, 0x11

    .line 31
    .line 32
    invoke-direct {v0, p0, v1}, Lss1;-><init>(Lvb4;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, p1}, Lkc1;->W(Lp5;Lsu3;)Ldc1;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lvb4;->w0:Lr5;

    .line 40
    .line 41
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    iput-object v0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, Lkp3;->H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {p2, v0}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    new-instance v1, Lbq4;

    .line 30
    .line 31
    invoke-direct {v1, p3, v0, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 32
    .line 33
    .line 34
    const-class p2, Lob4;

    .line 35
    .line 36
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const/4 v0, 0x0

    .line 45
    const-string v2, "Local and anonymous classes can not be ViewModels"

    .line 46
    .line 47
    if-eqz p3, :cond_1

    .line 48
    .line 49
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 50
    .line 51
    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {v1, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p2, Lob4;

    .line 60
    .line 61
    iput-object p2, p0, Lvb4;->u0:Lob4;

    .line 62
    .line 63
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {p2, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    new-instance v4, Lbq4;

    .line 80
    .line 81
    invoke-direct {v4, p3, v1, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 82
    .line 83
    .line 84
    const-class p2, Lvf2;

    .line 85
    .line 86
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    if-eqz p3, :cond_0

    .line 95
    .line 96
    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-virtual {v4, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    check-cast p2, Lvf2;

    .line 105
    .line 106
    iput-object p2, p0, Lvb4;->v0:Lvf2;

    .line 107
    .line 108
    iget-object p2, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 109
    .line 110
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const p3, 0x7f070357

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, p3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    float-to-int p0, p0

    .line 122
    const/4 p3, 0x0

    .line 123
    invoke-virtual {p2, p3, p3, p3, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_0
    invoke-static {v2}, Lkf2;->n(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_1
    invoke-static {v2}, Lkf2;->n(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v0
.end method

.method public final J()V
    .locals 1

    .line 1
    invoke-super {p0}, Lkp3;->J()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lvb4;->B0:Z

    .line 6
    .line 7
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
    iget-boolean v0, p0, Lvb4;->y0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lvb4;->F0:Ly11;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lvb4;->y0:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final P()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    iput-boolean v2, v1, Lkc1;->R:Z

    .line 5
    .line 6
    iget-object v0, v1, Lvb4;->A0:Ljava/util/HashSet;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 9
    .line 10
    .line 11
    const-string v0, "streaming_cache_size"

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/preference/ListPreference;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v3, Lom1;

    .line 22
    .line 23
    const/16 v4, 0x18

    .line 24
    .line 25
    invoke-direct {v3, v4, v1}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->y(Lep3;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const-string v0, "language"

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v3, v0

    .line 38
    check-cast v3, Landroidx/preference/ListPreference;

    .line 39
    .line 40
    invoke-virtual {v1}, Lkc1;->Z()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v4, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const v5, 0x7f160004

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    const/4 v5, 0x2

    .line 61
    const/4 v6, 0x0

    .line 62
    :try_start_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eq v7, v2, :cond_2

    .line 67
    .line 68
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-ne v8, v5, :cond_1

    .line 77
    .line 78
    const-string v8, "locale"

    .line 79
    .line 80
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_1

    .line 85
    .line 86
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-lez v7, :cond_1

    .line 91
    .line 92
    invoke-interface {v0, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v8, "name"

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_1

    .line 103
    .line 104
    invoke-interface {v0, v6}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catch_0
    move-exception v0

    .line 113
    goto :goto_2

    .line 114
    :catch_1
    move-exception v0

    .line 115
    goto :goto_2

    .line 116
    :cond_1
    :goto_1
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 121
    .line 122
    .line 123
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_3

    .line 137
    .line 138
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    check-cast v7, Ljava/lang/CharSequence;

    .line 143
    .line 144
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-eqz v7, :cond_3

    .line 152
    .line 153
    const-string v7, ","

    .line 154
    .line 155
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lwd2;->a(Ljava/lang/String;)Lwd2;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-instance v4, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    const v8, 0x7f130503

    .line 177
    .line 178
    .line 179
    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    move v9, v6

    .line 184
    :goto_4
    invoke-virtual {v0}, Lwd2;->b()I

    .line 185
    .line 186
    .line 187
    move-result v10

    .line 188
    if-ge v9, v10, :cond_b

    .line 189
    .line 190
    iget-object v10, v0, Lwd2;->a:Lxd2;

    .line 191
    .line 192
    iget-object v10, v10, Lxd2;->a:Landroid/os/LocaleList;

    .line 193
    .line 194
    invoke-virtual {v10, v9}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 195
    .line 196
    .line 197
    move-result-object v10

    .line 198
    if-eqz v10, :cond_a

    .line 199
    .line 200
    new-instance v11, Ljava/util/AbstractMap$SimpleEntry;

    .line 201
    .line 202
    invoke-virtual {v10}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    if-eqz v12, :cond_4

    .line 207
    .line 208
    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v13

    .line 212
    if-eqz v13, :cond_5

    .line 213
    .line 214
    :cond_4
    move/from16 v17, v6

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_5
    new-instance v13, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v12}, Ljava/lang/String;->toCharArray()[C

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    move v14, v6

    .line 227
    move v15, v14

    .line 228
    :goto_5
    array-length v5, v12

    .line 229
    sub-int/2addr v5, v2

    .line 230
    if-gt v14, v5, :cond_9

    .line 231
    .line 232
    if-nez v14, :cond_6

    .line 233
    .line 234
    aget-char v5, v12, v14

    .line 235
    .line 236
    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    new-instance v13, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-static {v5}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-direct {v13, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    move/from16 v17, v6

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_6
    aget-char v5, v12, v14

    .line 253
    .line 254
    move/from16 v17, v6

    .line 255
    .line 256
    const/16 v6, 0x5f

    .line 257
    .line 258
    if-ne v5, v6, :cond_7

    .line 259
    .line 260
    move v15, v2

    .line 261
    goto :goto_6

    .line 262
    :cond_7
    if-eqz v15, :cond_8

    .line 263
    .line 264
    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    move/from16 v15, v17

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_8
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    :goto_6
    add-int/lit8 v14, v14, 0x1

    .line 278
    .line 279
    move/from16 v6, v17

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    move/from16 v17, v6

    .line 283
    .line 284
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    :goto_7
    invoke-virtual {v10}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    invoke-direct {v11, v12, v5}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_a
    move/from16 v17, v6

    .line 300
    .line 301
    :goto_8
    add-int/lit8 v9, v9, 0x1

    .line 302
    .line 303
    move/from16 v6, v17

    .line 304
    .line 305
    const/4 v5, 0x2

    .line 306
    goto :goto_4

    .line 307
    :cond_b
    move/from16 v17, v6

    .line 308
    .line 309
    sget-object v0, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 310
    .line 311
    invoke-static {v0}, Ljava/util/Map$Entry;->comparingByKey(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 316
    .line 317
    .line 318
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 319
    .line 320
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 321
    .line 322
    .line 323
    const-string v5, "default"

    .line 324
    .line 325
    invoke-virtual {v0, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v6

    .line 332
    move/from16 v7, v17

    .line 333
    .line 334
    :goto_9
    if-ge v7, v6, :cond_c

    .line 335
    .line 336
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    add-int/lit8 v7, v7, 0x1

    .line 341
    .line 342
    check-cast v9, Ljava/util/Map$Entry;

    .line 343
    .line 344
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    check-cast v10, Ljava/lang/String;

    .line 349
    .line 350
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    check-cast v9, Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v0, v10, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    goto :goto_9

    .line 360
    :cond_c
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    new-array v6, v6, [Ljava/lang/CharSequence;

    .line 369
    .line 370
    invoke-interface {v4, v6}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    check-cast v4, [Ljava/lang/CharSequence;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    new-array v0, v0, [Ljava/lang/CharSequence;

    .line 385
    .line 386
    invoke-interface {v6, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, [Ljava/lang/CharSequence;

    .line 391
    .line 392
    invoke-virtual {v3, v4}, Landroidx/preference/ListPreference;->G([Ljava/lang/CharSequence;)V

    .line 393
    .line 394
    .line 395
    iput-object v0, v3, Landroidx/preference/ListPreference;->i0:[Ljava/lang/CharSequence;

    .line 396
    .line 397
    iget-object v0, v3, Landroidx/preference/ListPreference;->j0:Ljava/lang/String;

    .line 398
    .line 399
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    if-eqz v4, :cond_d

    .line 404
    .line 405
    invoke-virtual {v1}, Lkc1;->Z()Landroid/content/Context;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v3, v0}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 414
    .line 415
    .line 416
    goto :goto_a

    .line 417
    :cond_d
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v0}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v3, v0}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 426
    .line 427
    .line 428
    :goto_a
    new-instance v0, Lss1;

    .line 429
    .line 430
    const/16 v4, 0x10

    .line 431
    .line 432
    invoke-direct {v0, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 433
    .line 434
    .line 435
    iput-object v0, v3, Landroidx/preference/Preference;->r:Lbp3;

    .line 436
    .line 437
    const-string v0, "active_music_folder_id"

    .line 438
    .line 439
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    check-cast v0, Landroidx/preference/ListPreference;

    .line 444
    .line 445
    if-nez v0, :cond_e

    .line 446
    .line 447
    goto :goto_b

    .line 448
    :cond_e
    iget-object v3, v0, Landroidx/preference/ListPreference;->h0:[Ljava/lang/CharSequence;

    .line 449
    .line 450
    if-nez v3, :cond_f

    .line 451
    .line 452
    const v3, 0x7f1304c4

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    new-array v4, v2, [Ljava/lang/CharSequence;

    .line 460
    .line 461
    aput-object v3, v4, v17

    .line 462
    .line 463
    invoke-virtual {v0, v4}, Landroidx/preference/ListPreference;->G([Ljava/lang/CharSequence;)V

    .line 464
    .line 465
    .line 466
    new-array v3, v2, [Ljava/lang/CharSequence;

    .line 467
    .line 468
    aput-object v5, v3, v17

    .line 469
    .line 470
    iput-object v3, v0, Landroidx/preference/ListPreference;->i0:[Ljava/lang/CharSequence;

    .line 471
    .line 472
    :cond_f
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    if-eqz v3, :cond_10

    .line 477
    .line 478
    move-object v5, v3

    .line 479
    :cond_10
    invoke-virtual {v0, v5}, Landroidx/preference/ListPreference;->H(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v1, v0}, Lvb4;->s0(Landroidx/preference/ListPreference;)V

    .line 483
    .line 484
    .line 485
    new-instance v3, Lqb4;

    .line 486
    .line 487
    move/from16 v4, v17

    .line 488
    .line 489
    invoke-direct {v3, v1, v0, v4}, Lqb4;-><init>(Lvb4;Landroidx/preference/ListPreference;I)V

    .line 490
    .line 491
    .line 492
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 493
    .line 494
    iget-boolean v0, v1, Lvb4;->B0:Z

    .line 495
    .line 496
    if-eqz v0, :cond_11

    .line 497
    .line 498
    goto :goto_b

    .line 499
    :cond_11
    iput-boolean v2, v1, Lvb4;->B0:Z

    .line 500
    .line 501
    iget-object v0, v1, Lvb4;->u0:Lob4;

    .line 502
    .line 503
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    iget-object v4, v0, Lob4;->e:Lk03;

    .line 508
    .line 509
    invoke-virtual {v4}, Lad2;->d()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    if-nez v5, :cond_12

    .line 514
    .line 515
    iget-object v0, v0, Lob4;->d:Lom0;

    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    invoke-static {}, Lom0;->X()Lk03;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    new-instance v5, Lg7;

    .line 525
    .line 526
    const/4 v6, 0x0

    .line 527
    invoke-direct {v5, v4, v6}, Lg7;-><init>(Lk03;I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v0, v3, v5}, Lad2;->e(Lba2;La83;)V

    .line 531
    .line 532
    .line 533
    :cond_12
    invoke-virtual {v1}, Lkc1;->v()Lle1;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    iget-object v3, v1, Lvb4;->E0:Lnp0;

    .line 538
    .line 539
    invoke-virtual {v4, v0, v3}, Lad2;->e(Lba2;La83;)V

    .line 540
    .line 541
    .line 542
    :goto_b
    const-string v0, "version"

    .line 543
    .line 544
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v1}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v3
    invoke-static {v3}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v3

    .line 549
    .line 550
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 551
    .line 552
    .line 553
    const-string v0, "network_ping_timeout_base"

    .line 554
    .line 555
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    check-cast v0, Landroidx/preference/EditTextPreference;

    .line 560
    .line 561
    if-eqz v0, :cond_14

    .line 562
    .line 563
    sget-object v3, Lom0;->o:Lom0;

    .line 564
    .line 565
    if-nez v3, :cond_13

    .line 566
    .line 567
    new-instance v3, Lom0;

    .line 568
    .line 569
    const/16 v4, 0x13

    .line 570
    .line 571
    invoke-direct {v3, v4}, Lom0;-><init>(I)V

    .line 572
    .line 573
    .line 574
    sput-object v3, Lom0;->o:Lom0;

    .line 575
    .line 576
    :cond_13
    sget-object v3, Lom0;->o:Lom0;

    .line 577
    .line 578
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->y(Lep3;)V

    .line 579
    .line 580
    .line 581
    new-instance v3, Ltb4;

    .line 582
    .line 583
    invoke-direct {v3, v2}, Ltb4;-><init>(I)V

    .line 584
    .line 585
    .line 586
    iput-object v3, v0, Landroidx/preference/EditTextPreference;->i0:Lgz0;

    .line 587
    .line 588
    new-instance v3, Ltb4;

    .line 589
    .line 590
    const/4 v4, 0x2

    .line 591
    invoke-direct {v3, v4}, Ltb4;-><init>(I)V

    .line 592
    .line 593
    .line 594
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 595
    .line 596
    :cond_14
    const-string v0, "permissions"

    .line 597
    .line 598
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    new-instance v3, Lss1;

    .line 603
    .line 604
    const/4 v4, 0x4

    .line 605
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 606
    .line 607
    .line 608
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 609
    .line 610
    const-string v0, "theme"

    .line 611
    .line 612
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    new-instance v3, Lss1;

    .line 617
    .line 618
    const/16 v4, 0xd

    .line 619
    .line 620
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 621
    .line 622
    .line 623
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 624
    .line 625
    const-string v0, "logout"

    .line 626
    .line 627
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    new-instance v3, Lss1;

    .line 632
    .line 633
    const/16 v4, 0xa

    .line 634
    .line 635
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 636
    .line 637
    .line 638
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 639
    .line 640
    const-string v0, "scan_library"

    .line 641
    .line 642
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    new-instance v3, Lss1;

    .line 647
    .line 648
    const/16 v4, 0x14

    .line 649
    .line 650
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 651
    .line 652
    .line 653
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 654
    .line 655
    const-string v0, "sync_starred_albums_for_offline_use"

    .line 656
    .line 657
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    new-instance v3, Lss1;

    .line 662
    .line 663
    const/4 v4, 0x6

    .line 664
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 665
    .line 666
    .line 667
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 668
    .line 669
    const-string v0, "sync_starred_tracks_for_offline_use"

    .line 670
    .line 671
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    new-instance v3, Lss1;

    .line 676
    .line 677
    const/4 v4, 0x3

    .line 678
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 679
    .line 680
    .line 681
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 682
    .line 683
    const-string v0, "sync_starred_artists_for_offline_use"

    .line 684
    .line 685
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    new-instance v3, Lss1;

    .line 690
    .line 691
    const/4 v4, 0x7

    .line 692
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 693
    .line 694
    .line 695
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 696
    .line 697
    const-string v0, "streaming_cache_storage"

    .line 698
    .line 699
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    new-instance v3, Lss1;

    .line 704
    .line 705
    const/16 v4, 0xb

    .line 706
    .line 707
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 708
    .line 709
    .line 710
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 711
    .line 712
    const-string v0, "download_storage"

    .line 713
    .line 714
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    new-instance v3, Lss1;

    .line 719
    .line 720
    const/16 v4, 0xc

    .line 721
    .line 722
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 723
    .line 724
    .line 725
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 726
    .line 727
    const-string v0, "song_preload_buffer"

    .line 728
    .line 729
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    check-cast v3, Landroidx/preference/ListPreference;

    .line 734
    .line 735
    invoke-virtual {v1}, Lkc1;->n()Landroid/content/Context;

    .line 736
    .line 737
    .line 738
    move-result-object v4

    .line 739
    invoke-virtual {v1}, Lkc1;->r()Landroid/content/res/Resources;

    .line 740
    .line 741
    .line 742
    move-result-object v5

    .line 743
    const v6, 0x7f03002f

    .line 744
    .line 745
    .line 746
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v6

    .line 750
    const v7, 0x7f030030

    .line 751
    .line 752
    .line 753
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    const/16 v16, 0x2

    .line 758
    .line 759
    aget-object v7, v5, v16

    .line 760
    .line 761
    invoke-static {v4}, Lpp3;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    const/4 v9, 0x0

    .line 766
    invoke-virtual {v4, v8, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 767
    .line 768
    .line 769
    move-result-object v8

    .line 770
    invoke-interface {v8, v0, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v0

    .line 774
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    invoke-interface {v5, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    const/4 v5, -0x1

    .line 783
    if-ne v0, v5, :cond_15

    .line 784
    .line 785
    move/from16 v5, v16

    .line 786
    .line 787
    goto :goto_c

    .line 788
    :cond_15
    move v5, v0

    .line 789
    :goto_c
    aget-object v0, v6, v5

    .line 790
    .line 791
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    const v5, 0x7f1304e7

    .line 796
    .line 797
    .line 798
    invoke-virtual {v4, v5, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v3, v0}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 803
    .line 804
    .line 805
    const-string v0, "set_download_directory"

    .line 806
    .line 807
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    if-eqz v0, :cond_16

    .line 812
    .line 813
    new-instance v3, Lss1;

    .line 814
    .line 815
    const/16 v4, 0xe

    .line 816
    .line 817
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 818
    .line 819
    .line 820
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 821
    .line 822
    :cond_16
    const-string v0, "delete_download_storage"

    .line 823
    .line 824
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    new-instance v3, Lss1;

    .line 829
    .line 830
    const/16 v4, 0xf

    .line 831
    .line 832
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 833
    .line 834
    .line 835
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 836
    .line 837
    const-string v0, "always_on_display"

    .line 838
    .line 839
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    new-instance v3, Lss1;

    .line 844
    .line 845
    const/16 v4, 0x8

    .line 846
    .line 847
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 848
    .line 849
    .line 850
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 851
    .line 852
    const-string v0, "auto_download_lyrics"

    .line 853
    .line 854
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    check-cast v0, Landroidx/preference/SwitchPreference;

    .line 859
    .line 860
    if-nez v0, :cond_17

    .line 861
    .line 862
    goto :goto_d

    .line 863
    :cond_17
    invoke-static {}, Lud3;->O()Z

    .line 864
    .line 865
    .line 866
    move-result v3

    .line 867
    invoke-virtual {v0, v3}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 868
    .line 869
    .line 870
    new-instance v3, Lnz2;

    .line 871
    .line 872
    const/16 v4, 0x1c

    .line 873
    .line 874
    invoke-direct {v3, v4}, Lnz2;-><init>(I)V

    .line 875
    .line 876
    .line 877
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 878
    .line 879
    :goto_d
    const-string v0, "mini_shuffle_button_visibility"

    .line 880
    .line 881
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    check-cast v3, Landroidx/preference/SwitchPreference;

    .line 886
    .line 887
    if-nez v3, :cond_18

    .line 888
    .line 889
    goto :goto_e

    .line 890
    :cond_18
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 898
    .line 899
    .line 900
    move-result-object v4

    .line 901
    const/4 v6, 0x0

    .line 902
    invoke-interface {v4, v0, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 903
    .line 904
    .line 905
    move-result v0

    .line 906
    invoke-virtual {v3, v0}, Landroidx/preference/TwoStatePreference;->E(Z)V

    .line 907
    .line 908
    .line 909
    new-instance v0, Ltb4;

    .line 910
    .line 911
    invoke-direct {v0, v6}, Ltb4;-><init>(I)V

    .line 912
    .line 913
    .line 914
    iput-object v0, v3, Landroidx/preference/Preference;->r:Lbp3;

    .line 915
    .line 916
    :goto_e
    new-instance v0, Landroid/content/Intent;

    .line 917
    .line 918
    invoke-virtual {v1}, Lkc1;->X()Lnc1;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    const-class v4, Lcom/eddyizm/tempus/service/MediaService;

    .line 923
    .line 924
    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 925
    .line 926
    .line 927
    const-string v3, "com.eddyizm.tempus.service.BIND_EQUALIZER"

    .line 928
    .line 929
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 930
    .line 931
    .line 932
    invoke-virtual {v1}, Lkc1;->X()Lnc1;

    .line 933
    .line 934
    .line 935
    move-result-object v3

    .line 936
    iget-object v4, v1, Lvb4;->F0:Ly11;

    .line 937
    .line 938
    invoke-virtual {v3, v0, v4, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 939
    .line 940
    .line 941
    iput-boolean v2, v1, Lvb4;->y0:Z

    .line 942
    .line 943
    const-string v0, "builtin_equalizer"

    .line 944
    .line 945
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    if-eqz v0, :cond_19

    .line 950
    .line 951
    new-instance v3, Lss1;

    .line 952
    .line 953
    const/4 v4, 0x5

    .line 954
    invoke-direct {v3, v1, v4}, Lss1;-><init>(Lvb4;I)V

    .line 955
    .line 956
    .line 957
    iput-object v3, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 958
    .line 959
    :cond_19
    const-string v0, "selected_equalizer"

    .line 960
    .line 961
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    check-cast v0, Landroidx/preference/ListPreference;

    .line 966
    .line 967
    if-eqz v0, :cond_1a

    .line 968
    .line 969
    invoke-virtual {v0}, Landroidx/preference/ListPreference;->F()Ljava/lang/CharSequence;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    invoke-virtual {v0, v3}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 974
    .line 975
    .line 976
    new-instance v3, Lqb4;

    .line 977
    .line 978
    invoke-direct {v3, v1, v0, v2}, Lqb4;-><init>(Lvb4;Landroidx/preference/ListPreference;I)V

    .line 979
    .line 980
    .line 981
    iput-object v3, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 982
    .line 983
    :cond_1a
    const-string v0, "replay_gain_preamp"

    .line 984
    .line 985
    invoke-virtual {v1, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    check-cast v0, Landroidx/preference/SeekBarPreference;

    .line 990
    .line 991
    if-nez v0, :cond_1b

    .line 992
    .line 993
    goto :goto_f

    .line 994
    :cond_1b
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 995
    .line 996
    .line 997
    move-result-object v3

    .line 998
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 999
    .line 1000
    .line 1001
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v3

    .line 1005
    const-string v4, "loudness_preamp"

    .line 1006
    .line 1007
    const/4 v6, 0x0

    .line 1008
    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 1009
    .line 1010
    .line 1011
    move-result v3

    .line 1012
    int-to-float v3, v3

    .line 1013
    float-to-int v3, v3

    .line 1014
    invoke-virtual {v0, v3, v2}, Landroidx/preference/SeekBarPreference;->E(IZ)V

    .line 1015
    .line 1016
    .line 1017
    new-instance v2, Lss1;

    .line 1018
    .line 1019
    const/16 v3, 0x9

    .line 1020
    .line 1021
    invoke-direct {v2, v1, v3}, Lss1;-><init>(Lvb4;I)V

    .line 1022
    .line 1023
    .line 1024
    iput-object v2, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 1025
    .line 1026
    :goto_f
    invoke-virtual {v1}, Lvb4;->l0()V

    .line 1027
    .line 1028
    .line 1029
    return-void
.end method

.method public final R()V
    .locals 2

    .line 1
    invoke-super {p0}, Lkp3;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lom1;->p(Z)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final i0(Ljava/lang/String;)V
    .locals 11

    .line 1
    const v0, 0x7f160001

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0, p1}, Lkp3;->j0(ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string p1, "settings_github_update_category_key"

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroidx/preference/PreferenceCategory;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lkp3;->m0:Lpp3;

    .line 18
    .line 19
    iget-object v0, v0, Lpp3;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroidx/preference/PreferenceScreen;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroidx/preference/PreferenceGroup;->I(Landroidx/preference/Preference;)Z

    .line 24
    .line 25
    .line 26
    iget-object p1, v0, Landroidx/preference/Preference;->U:Lnp3;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object v0, p1, Lnp3;->u:Landroid/os/Handler;

    .line 31
    .line 32
    iget-object p1, p1, Lnp3;->v:Lg5;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    sput-boolean p1, Lbu;->f:Z

    .line 42
    .line 43
    sput-boolean p1, Lbu;->g:Z

    .line 44
    .line 45
    iget-object v0, p0, Lkp3;->m0:Lpp3;

    .line 46
    .line 47
    iget-object v0, v0, Lpp3;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroidx/preference/PreferenceScreen;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    :goto_0
    move-object v5, p0

    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    const-string v0, "homemusic_category"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v0, "homemusic_hub_url"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Landroidx/preference/EditTextPreference;

    .line 73
    .line 74
    const/4 v2, 0x5

    .line 75
    const/4 v3, 0x3

    .line 76
    const/16 v4, 0x11

    .line 77
    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    new-instance v5, Le90;

    .line 81
    .line 82
    invoke-direct {v5, v4}, Le90;-><init>(I)V

    .line 83
    .line 84
    .line 85
    new-instance v6, Lef0;

    .line 86
    .line 87
    const-string v7, "https://146.103.112.215:8445"

    .line 88
    .line 89
    invoke-direct {v6, v2, v0, v7}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iput-object v6, v0, Landroidx/preference/EditTextPreference;->i0:Lgz0;

    .line 93
    .line 94
    new-instance v6, Lcn;

    .line 95
    .line 96
    invoke-direct {v6, v4, v5}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v6}, Landroidx/preference/Preference;->y(Lep3;)V

    .line 100
    .line 101
    .line 102
    new-instance v5, Ler1;

    .line 103
    .line 104
    invoke-direct {v5, v3}, Ler1;-><init>(I)V

    .line 105
    .line 106
    .line 107
    iput-object v5, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 108
    .line 109
    :cond_3
    const-string v0, "homemusic_hub_local_url"

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Landroidx/preference/EditTextPreference;

    .line 116
    .line 117
    if-eqz v0, :cond_4

    .line 118
    .line 119
    new-instance v5, Lwc;

    .line 120
    .line 121
    const/4 v6, 0x6

    .line 122
    invoke-direct {v5, v6, p0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v6, Lef0;

    .line 126
    .line 127
    const-string v7, "http://192.168.0.111:8080"

    .line 128
    .line 129
    invoke-direct {v6, v2, v0, v7}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iput-object v6, v0, Landroidx/preference/EditTextPreference;->i0:Lgz0;

    .line 133
    .line 134
    new-instance v2, Lcn;

    .line 135
    .line 136
    invoke-direct {v2, v4, v5}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v2}, Landroidx/preference/Preference;->y(Lep3;)V

    .line 140
    .line 141
    .line 142
    new-instance v2, Ler1;

    .line 143
    .line 144
    invoke-direct {v2, v3}, Ler1;-><init>(I)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v0, Landroidx/preference/Preference;->r:Lbp3;

    .line 148
    .line 149
    :cond_4
    const-string v0, "homemusic_google"

    .line 150
    .line 151
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    new-instance v6, Ljx3;

    .line 158
    .line 159
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance v5, Ljx3;

    .line 163
    .line 164
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 165
    .line 166
    .line 167
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 168
    .line 169
    new-instance v4, Lt6;

    .line 170
    .line 171
    const/4 v9, 0x7

    .line 172
    move-object v7, v5

    .line 173
    move-object v5, p0

    .line 174
    invoke-direct/range {v4 .. v9}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v0, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 178
    .line 179
    .line 180
    new-instance v4, Ldg0;

    .line 181
    .line 182
    const/4 v9, 0x3

    .line 183
    move-object v10, v6

    .line 184
    move-object v6, v5

    .line 185
    move-object v5, v7

    .line 186
    move-object v7, v10

    .line 187
    invoke-direct/range {v4 .. v9}, Ldg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 188
    .line 189
    .line 190
    move-object v5, v6

    .line 191
    iput-object v4, v8, Landroidx/preference/Preference;->s:Lcp3;

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_5
    move-object v5, p0

    .line 195
    :goto_1
    const-string p0, "homemusic_admin"

    .line 196
    .line 197
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    if-eqz p0, :cond_6

    .line 202
    .line 203
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 204
    .line 205
    new-instance v2, Lts1;

    .line 206
    .line 207
    const/4 v4, 0x2

    .line 208
    invoke-direct {v2, v5, p0, v4}, Lts1;-><init>(Lvb4;Landroidx/preference/Preference;I)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lss1;

    .line 215
    .line 216
    invoke-direct {v0, v5, v4}, Lss1;-><init>(Lvb4;I)V

    .line 217
    .line 218
    .line 219
    iput-object v0, p0, Landroidx/preference/Preference;->s:Lcp3;

    .line 220
    .line 221
    :cond_6
    const-string p0, "homemusic_check_update"

    .line 222
    .line 223
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-eqz p0, :cond_7

    .line 228
    .line 229
    invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v0
    invoke-static {v0}, Lapp/homemusic/AURAVersion;->versionCodeInt(Landroid/content/Context;)I
    move-result v0

    .line 230
    .line 231
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v5}, Lkc1;->Z()Landroid/content/Context;
    move-result-object v2
    invoke-static {v2}, Lapp/homemusic/AURAVersion;->versionName(Landroid/content/Context;)Ljava/lang/String;
    move-result-object v2

    .line 236
    .line 237
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const v2, 0x7f130226

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 249
    .line 250
    .line 251
    new-instance v0, Lss1;

    .line 252
    .line 253
    invoke-direct {v0, v5, v1}, Lss1;-><init>(Lvb4;I)V

    .line 254
    .line 255
    .line 256
    iput-object v0, p0, Landroidx/preference/Preference;->s:Lcp3;

    .line 257
    .line 258
    :cond_7
    const-string p0, "homemusic_leave"

    .line 259
    .line 260
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    if-eqz p0, :cond_c

    .line 265
    .line 266
    invoke-static {}, Lud3;->K()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const-string v2, ""

    .line 271
    .line 272
    if-nez v0, :cond_8

    .line 273
    .line 274
    move-object v0, v2

    .line 275
    :cond_8
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    if-nez v4, :cond_9

    .line 280
    .line 281
    goto :goto_2

    .line 282
    :cond_9
    move-object v2, v4

    .line 283
    :goto_2
    const/4 v4, 0x0

    .line 284
    :try_start_0
    new-instance v6, Lfr1;

    .line 285
    .line 286
    invoke-direct {v6}, Lfr1;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, v4, v2}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6}, Lfr1;->b()Lgr1;

    .line 293
    .line 294
    .line 295
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 296
    :catch_0
    if-eqz v4, :cond_b

    .line 297
    .line 298
    iget-object v4, v4, Lgr1;->d:Ljava/lang/String;

    .line 299
    .line 300
    if-nez v4, :cond_a

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_a
    move-object v2, v4

    .line 304
    :cond_b
    :goto_3
    new-instance v4, Leg0;

    .line 305
    .line 306
    invoke-direct {v4, v5, v0, v2, v3}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 307
    .line 308
    .line 309
    iput-object v4, p0, Landroidx/preference/Preference;->s:Lcp3;

    .line 310
    .line 311
    :cond_c
    const-string p0, "logout"

    .line 312
    .line 313
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    if-eqz p0, :cond_d

    .line 318
    .line 319
    invoke-virtual {p0, p1}, Landroidx/preference/Preference;->A(Z)V

    .line 320
    .line 321
    .line 322
    :cond_d
    const-string p0, "homemusic_mix_offline"

    .line 323
    .line 324
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    if-eqz p0, :cond_e

    .line 329
    .line 330
    new-instance v0, Lss1;

    .line 331
    .line 332
    invoke-direct {v0, v5, p1}, Lss1;-><init>(Lvb4;I)V

    .line 333
    .line 334
    .line 335
    iput-object v0, p0, Landroidx/preference/Preference;->r:Lbp3;

    .line 336
    .line 337
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 338
    .line 339
    new-instance v2, Lts1;

    .line 340
    .line 341
    invoke-direct {v2, v5, p0, p1}, Lts1;-><init>(Lvb4;Landroidx/preference/Preference;I)V

    .line 342
    .line 343
    .line 344
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 345
    .line 346
    .line 347
    :cond_e
    const-string p0, "homemusic_traffic_stats"

    .line 348
    .line 349
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    if-eqz p0, :cond_f

    .line 354
    .line 355
    new-instance v0, Lef0;

    .line 356
    .line 357
    const/4 v2, 0x4

    .line 358
    invoke-direct {v0, v2, p0, v5}, Lef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    iput-object v0, p0, Landroidx/preference/Preference;->s:Lcp3;

    .line 362
    .line 363
    const v0, 0x7f130223

    .line 364
    .line 365
    .line 366
    invoke-virtual {v5, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 374
    .line 375
    new-instance v2, Lts1;

    .line 376
    .line 377
    invoke-direct {v2, v5, p0, v1}, Lts1;-><init>(Lvb4;Landroidx/preference/Preference;I)V

    .line 378
    .line 379
    .line 380
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 381
    .line 382
    .line 383
    :cond_f
    :goto_4
    const-string p0, "settings_androidauto_category_key"

    .line 384
    .line 385
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    check-cast p0, Lcom/eddyizm/tempus/util/ClickablePreferenceCategory;

    .line 390
    .line 391
    if-eqz p0, :cond_10

    .line 392
    .line 393
    iget-object v0, v5, Lkp3;->m0:Lpp3;

    .line 394
    .line 395
    iget-object v0, v0, Lpp3;->g:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Landroidx/preference/PreferenceScreen;

    .line 398
    .line 399
    invoke-virtual {v0, p0}, Landroidx/preference/PreferenceGroup;->I(Landroidx/preference/Preference;)Z

    .line 400
    .line 401
    .line 402
    iget-object p0, v0, Landroidx/preference/Preference;->U:Lnp3;

    .line 403
    .line 404
    if-eqz p0, :cond_10

    .line 405
    .line 406
    iget-object v0, p0, Lnp3;->u:Landroid/os/Handler;

    .line 407
    .line 408
    iget-object p0, p0, Lnp3;->v:Lg5;

    .line 409
    .line 410
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 414
    .line 415
    .line 416
    :cond_10
    iget-object p0, v5, Lkp3;->m0:Lpp3;

    .line 417
    .line 418
    iget-object p0, p0, Lpp3;->g:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast p0, Landroidx/preference/PreferenceScreen;

    .line 421
    .line 422
    if-eqz p0, :cond_14

    .line 423
    .line 424
    :goto_5
    iget-object v0, p0, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-ge p1, v0, :cond_14

    .line 431
    .line 432
    invoke-virtual {p0, p1}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    instance-of v2, v0, Lcom/eddyizm/tempus/util/ClickablePreferenceCategory;

    .line 437
    .line 438
    if-eqz v2, :cond_13

    .line 439
    .line 440
    check-cast v0, Lcom/eddyizm/tempus/util/ClickablePreferenceCategory;

    .line 441
    .line 442
    iget-object v2, v0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 443
    .line 444
    if-nez v2, :cond_12

    .line 445
    .line 446
    const-string v2, "category_key_"

    .line 447
    .line 448
    invoke-static {p1, v2}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    iput-object v2, v0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 453
    .line 454
    iget-boolean v3, v0, Landroidx/preference/Preference;->E:Z

    .line 455
    .line 456
    if-eqz v3, :cond_12

    .line 457
    .line 458
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-eqz v2, :cond_12

    .line 463
    .line 464
    iget-object v2, v0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 465
    .line 466
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    if-nez v2, :cond_11

    .line 471
    .line 472
    iput-boolean v1, v0, Landroidx/preference/Preference;->E:Z

    .line 473
    .line 474
    goto :goto_6

    .line 475
    :cond_11
    const-string p0, "Preference does not have a key assigned."

    .line 476
    .line 477
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :cond_12
    :goto_6
    new-instance v2, Lss1;

    .line 482
    .line 483
    const/16 v3, 0x12

    .line 484
    .line 485
    invoke-direct {v2, v5, v3}, Lss1;-><init>(Lvb4;I)V

    .line 486
    .line 487
    .line 488
    iput-object v2, v0, Lcom/eddyizm/tempus/util/ClickablePreferenceCategory;->j0:Lss1;

    .line 489
    .line 490
    :cond_13
    add-int/lit8 p1, p1, 0x1

    .line 491
    .line 492
    goto :goto_5

    .line 493
    :cond_14
    const-string p0, "download_wifi_only"

    .line 494
    .line 495
    invoke-virtual {v5, p0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    check-cast p0, Landroidx/preference/SwitchPreference;

    .line 500
    .line 501
    if-eqz p0, :cond_15

    .line 502
    .line 503
    new-instance p1, Lss1;

    .line 504
    .line 505
    const/16 v0, 0x13

    .line 506
    .line 507
    invoke-direct {p1, v5, v0}, Lss1;-><init>(Lvb4;I)V

    .line 508
    .line 509
    .line 510
    iput-object p1, p0, Landroidx/preference/Preference;->r:Lbp3;

    .line 511
    .line 512
    :cond_15
    return-void
.end method

.method public final l0()V
    .locals 6

    .line 1
    iget-object v0, p0, Lkp3;->m0:Lpp3;

    .line 2
    .line 3
    iget-object v0, v0, Lpp3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/preference/PreferenceScreen;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_8

    .line 10
    .line 11
    :cond_0
    invoke-static {v0}, Lvb4;->r0(Landroidx/preference/PreferenceGroup;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lvb4;->p0()V

    .line 15
    .line 16
    .line 17
    const-string v1, "streaming_cache_storage"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v4, v5}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    aget-object v4, v4, v2

    .line 38
    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {}, Lud3;->G()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    const v4, 0x7f1300f2

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const v4, 0x7f1300f1

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {v1, v4}, Landroidx/preference/Preference;->w(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catch_0
    invoke-virtual {v1, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {p0}, Lvb4;->o0()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lvb4;->m0()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lvb4;->n0()V

    .line 72
    .line 73
    .line 74
    const-string v1, "active_music_folder_id"

    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-nez v1, :cond_4

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_4
    iget-object v4, p0, Lvb4;->C0:Ljava/lang/Integer;

    .line 84
    .line 85
    if-eqz v4, :cond_6

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-gt v4, v2, :cond_6

    .line 92
    .line 93
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    move v2, v3

    .line 101
    :cond_6
    :goto_2
    invoke-virtual {v1, v2}, Landroidx/preference/Preference;->A(Z)V

    .line 102
    .line 103
    .line 104
    :goto_3
    const-string v1, "homemusic_google"

    .line 105
    .line 106
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-eqz v1, :cond_7

    .line 111
    .line 112
    sget-boolean v2, Lbu;->f:Z

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Landroidx/preference/Preference;->A(Z)V

    .line 115
    .line 116
    .line 117
    :cond_7
    const-string v1, "homemusic_admin"

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    sget-boolean v2, Lbu;->g:Z

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Landroidx/preference/Preference;->A(Z)V

    .line 128
    .line 129
    .line 130
    :cond_8
    const-string v1, "logout"

    .line 131
    .line 132
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_9

    .line 137
    .line 138
    invoke-virtual {v1, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 139
    .line 140
    .line 141
    :cond_9
    const-string v1, "music_directory_section_visibility"

    .line 142
    .line 143
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_a

    .line 148
    .line 149
    invoke-virtual {v1, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 150
    .line 151
    .line 152
    :cond_a
    const-string v1, "song_preload_buffer"

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-eqz v1, :cond_b

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 161
    .line 162
    .line 163
    :cond_b
    iget-object v1, p0, Lvb4;->D0:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-nez v1, :cond_c

    .line 170
    .line 171
    invoke-virtual {p0, v0, v3}, Lvb4;->q0(Landroidx/preference/PreferenceGroup;Z)Z

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :cond_c
    move v1, v3

    .line 176
    :goto_4
    iget-object v2, v0, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-ge v1, v2, :cond_f

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    instance-of v4, v2, Landroidx/preference/PreferenceCategory;

    .line 189
    .line 190
    if-eqz v4, :cond_e

    .line 191
    .line 192
    check-cast v2, Landroidx/preference/PreferenceCategory;

    .line 193
    .line 194
    iget-object v4, p0, Lvb4;->A0:Ljava/util/HashSet;

    .line 195
    .line 196
    iget-object v5, v2, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_d

    .line 203
    .line 204
    const v5, 0x7f08010a

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_d
    const v5, 0x7f0801fd

    .line 209
    .line 210
    .line 211
    :goto_5
    invoke-virtual {v2, v5}, Landroidx/preference/Preference;->v(I)V

    .line 212
    .line 213
    .line 214
    if-nez v4, :cond_e

    .line 215
    .line 216
    move v4, v3

    .line 217
    :goto_6
    iget-object v5, v2, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-ge v4, v5, :cond_e

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-virtual {v5, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 230
    .line 231
    .line 232
    add-int/lit8 v4, v4, 0x1

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_f
    :goto_7
    iget-object v0, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 239
    .line 240
    if-eqz v0, :cond_10

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-eqz v0, :cond_10

    .line 247
    .line 248
    iget-object p0, p0, Lkp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 249
    .line 250
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-virtual {p0}, Ldw3;->d()V

    .line 255
    .line 256
    .line 257
    :cond_10
    :goto_8
    return-void
.end method

.method public final m0()V
    .locals 5

    .line 1
    const-string v0, "download_storage"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "set_download_directory"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/preference/Preference;->n:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, v4}, Landroidx/preference/Preference;->A(Z)V

    .line 32
    .line 33
    .line 34
    const v0, 0x7f08011c

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->v(I)V

    .line 38
    .line 39
    .line 40
    const v0, 0x7f130497

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->z(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v2}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Landroidx/preference/Preference;->A(Z)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {}, Lud3;->p()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v2, 0x2

    .line 64
    if-ne v0, v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0, v4}, Landroidx/preference/Preference;->A(Z)V

    .line 67
    .line 68
    .line 69
    const v0, 0x7f08012d

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->v(I)V

    .line 73
    .line 74
    .line 75
    const v0, 0x7f1304e2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->z(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const v0, 0x7f130496

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->w(I)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    invoke-virtual {p0, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final n0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvb4;->x0:Lxp;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, v0, Lxp;->e:Lcom/eddyizm/tempus/service/MediaService;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/eddyizm/tempus/service/MediaService;->A:Lwo0;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lv11;

    .line 14
    .line 15
    invoke-interface {v0}, Lv11;->b()S

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const-string v1, "app_equalizer"

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, 0x0

    .line 32
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/preference/Preference;->A(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string p0, "equalizerManager"

    .line 37
    .line 38
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0

    .line 43
    :cond_2
    return-void
.end method

.method public final o0()V
    .locals 3

    .line 1
    const-string v0, "download_storage"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :try_start_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v2}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v2, 0x1

    .line 21
    aget-object p0, p0, v2

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->A(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-static {}, Lud3;->p()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    const p0, 0x7f1300f2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Landroidx/preference/Preference;->w(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    if-ne p0, v2, :cond_3

    .line 43
    .line 44
    const p0, 0x7f1300f1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Landroidx/preference/Preference;->w(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    const p0, 0x7f1300f0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Landroidx/preference/Preference;->w(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catch_0
    invoke-virtual {v0, v1}, Landroidx/preference/Preference;->A(Z)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final p0()V
    .locals 6

    .line 1
    const-string v0, "system_equalizer"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "builtin_equalizer"

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lkp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Lud3;->C()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    move v5, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v5, v3

    .line 26
    :goto_0
    invoke-virtual {v1, v5}, Landroidx/preference/Preference;->A(Z)V

    .line 27
    .line 28
    .line 29
    :cond_1
    if-eqz v0, :cond_4

    .line 30
    .line 31
    new-instance v1, Landroid/content/Intent;

    .line 32
    .line 33
    const-string v5, "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL"

    .line 34
    .line 35
    invoke-direct {v1, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v1, v5}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    new-instance v5, Lbt2;

    .line 53
    .line 54
    invoke-direct {v5, p0, v1}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v5, v0, Landroidx/preference/Preference;->s:Lcp3;

    .line 58
    .line 59
    const/4 p0, 0x2

    .line 60
    if-ne v2, p0, :cond_2

    .line 61
    .line 62
    move v3, v4

    .line 63
    :cond_2
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 68
    .line 69
    .line 70
    :cond_4
    return-void
.end method

.method public final q0(Landroidx/preference/PreferenceGroup;Z)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lkp3;->m0:Lpp3;

    .line 2
    .line 3
    iget-object v0, v0, Lpp3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/preference/PreferenceScreen;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v0, v2

    .line 14
    :goto_0
    move v3, v2

    .line 15
    move v4, v3

    .line 16
    :goto_1
    iget-object v5, p1, Landroidx/preference/PreferenceGroup;->d0:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-ge v3, v5, :cond_c

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Landroidx/preference/PreferenceGroup;->G(I)Landroidx/preference/Preference;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-nez p2, :cond_4

    .line 29
    .line 30
    iget-object v6, v5, Landroidx/preference/Preference;->u:Ljava/lang/CharSequence;

    .line 31
    .line 32
    const-string v7, ""

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {v6}, Lg12;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    move-object v6, v7

    .line 46
    :goto_2
    invoke-virtual {v5}, Landroidx/preference/Preference;->f()Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    invoke-virtual {v5}, Landroidx/preference/Preference;->f()Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    invoke-static {v7}, Lg12;->I(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    :cond_2
    iget-object v8, p0, Lvb4;->D0:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_3

    .line 71
    .line 72
    iget-object v6, p0, Lvb4;->D0:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v7, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v6, :cond_4

    .line 79
    .line 80
    :cond_3
    move v6, v1

    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move v6, p2

    .line 83
    :goto_3
    instance-of v7, v5, Landroidx/preference/PreferenceGroup;

    .line 84
    .line 85
    if-eqz v7, :cond_9

    .line 86
    .line 87
    iget-boolean v7, v5, Landroidx/preference/Preference;->K:Z

    .line 88
    .line 89
    move-object v8, v5

    .line 90
    check-cast v8, Landroidx/preference/PreferenceGroup;

    .line 91
    .line 92
    if-eqz v6, :cond_5

    .line 93
    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    move v9, v1

    .line 97
    goto :goto_4

    .line 98
    :cond_5
    move v9, v2

    .line 99
    :goto_4
    invoke-virtual {p0, v8, v9}, Lvb4;->q0(Landroidx/preference/PreferenceGroup;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-nez v6, :cond_6

    .line 104
    .line 105
    if-eqz v8, :cond_7

    .line 106
    .line 107
    :cond_6
    if-eqz v7, :cond_7

    .line 108
    .line 109
    move v6, v1

    .line 110
    goto :goto_5

    .line 111
    :cond_7
    move v6, v2

    .line 112
    :goto_5
    invoke-virtual {v5, v6}, Landroidx/preference/Preference;->A(Z)V

    .line 113
    .line 114
    .line 115
    instance-of v7, v5, Landroidx/preference/PreferenceCategory;

    .line 116
    .line 117
    if-eqz v7, :cond_8

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    const v7, 0x7f08010a

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v7}, Landroidx/preference/Preference;->v(I)V

    .line 125
    .line 126
    .line 127
    :cond_8
    if-eqz v6, :cond_b

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_9
    iget-boolean v7, v5, Landroidx/preference/Preference;->K:Z

    .line 131
    .line 132
    if-eqz v6, :cond_a

    .line 133
    .line 134
    if-eqz v7, :cond_a

    .line 135
    .line 136
    move v6, v1

    .line 137
    goto :goto_6

    .line 138
    :cond_a
    move v6, v2

    .line 139
    :goto_6
    invoke-virtual {v5, v6}, Landroidx/preference/Preference;->A(Z)V

    .line 140
    .line 141
    .line 142
    if-eqz v6, :cond_b

    .line 143
    .line 144
    :goto_7
    move v4, v1

    .line 145
    :cond_b
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_c
    return v4
.end method

.method public final s0(Landroidx/preference/ListPreference;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/preference/ListPreference;->F()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const v0, 0x7f1304c4

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :goto_0
    invoke-virtual {p1, v0}, Landroidx/preference/ListPreference;->x(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
