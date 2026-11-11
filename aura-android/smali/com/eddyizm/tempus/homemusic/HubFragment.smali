.class public final Lcom/eddyizm/tempus/homemusic/HubFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final y0:Ljava/util/List;

.field public static final z0:[Ljava/lang/String;


# instance fields
.field public l0:Lup0;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Landroid/webkit/WebView;

.field public o0:Ljava/lang/String;

.field public p0:Z

.field public q0:J

.field public r0:Landroid/webkit/ValueCallback;

.field public final s0:Ldc1;

.field public final t0:Lbd1;

.field public final u0:Lwt;

.field public final v0:Lcs1;

.field public final w0:Lhs1;

.field public final x0:Lgs1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lfs1;

    .line 2
    .line 3
    const v1, 0x7f130245

    .line 4
    .line 5
    .line 6
    const-string v2, "/search"

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lfs1;-><init>(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lfs1;

    .line 12
    .line 13
    const v2, 0x7f130246

    .line 14
    .line 15
    .line 16
    const-string v3, "/downloads"

    .line 17
    .line 18
    invoke-direct {v1, v2, v3}, Lfs1;-><init>(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lfs1;

    .line 22
    .line 23
    const v3, 0x7f130244

    .line 24
    .line 25
    .line 26
    const-string v4, "/assistant"

    .line 27
    .line 28
    invoke-direct {v2, v3, v4}, Lfs1;-><init>(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lfs1;

    .line 32
    .line 33
    const v4, 0x7f130247

    .line 34
    .line 35
    .line 36
    const-string v5, "/library"

    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Lfs1;-><init>(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [Lfs1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    new-array v0, v0, [Ljava/lang/String;

    .line 56
    .line 57
    sput-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->z0:[Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "/search"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Lq5;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1}, Lq5;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Lcn;

    .line 15
    .line 16
    const/16 v3, 0x10

    .line 17
    .line 18
    invoke-direct {v2, v3, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v2, v0}, Lkc1;->W(Lp5;Lsu3;)Ldc1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->s0:Ldc1;

    .line 26
    .line 27
    new-instance v0, Lbd1;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {v0, v2, p0}, Lbd1;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->t0:Lbd1;

    .line 34
    .line 35
    new-instance v0, Lwt;

    .line 36
    .line 37
    invoke-direct {v0, v1, p0}, Lwt;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->u0:Lwt;

    .line 41
    .line 42
    new-instance v0, Lcs1;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-direct {v0, v1, p0}, Lcs1;-><init>(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->v0:Lcs1;

    .line 49
    .line 50
    new-instance v0, Lhs1;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lhs1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->w0:Lhs1;

    .line 56
    .line 57
    new-instance v0, Lgs1;

    .line 58
    .line 59
    invoke-direct {v0, p0}, Lgs1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->x0:Lgs1;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 11
    .line 12
    const p3, 0x7f0d0074

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const p2, 0x7f0a02ee

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    move-object v2, p3

    .line 28
    check-cast v2, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const p2, 0x7f0a02ef

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    move-object v3, p3

    .line 40
    check-cast v3, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    const p2, 0x7f0a02f0

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    move-object v4, p3

    .line 52
    check-cast v4, Landroid/widget/ImageButton;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    const p2, 0x7f0a02f1

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    move-object v5, p3

    .line 64
    check-cast v5, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 65
    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    const p2, 0x7f0a02f2

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    move-object v6, p3

    .line 76
    check-cast v6, Lcom/google/android/material/button/MaterialButton;

    .line 77
    .line 78
    if-eqz v6, :cond_0

    .line 79
    .line 80
    move-object v1, p1

    .line 81
    check-cast v1, Landroid/widget/LinearLayout;

    .line 82
    .line 83
    const p2, 0x7f0a02f4

    .line 84
    .line 85
    .line 86
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    move-object v7, p3

    .line 91
    check-cast v7, Lcom/google/android/material/button/MaterialButton;

    .line 92
    .line 93
    if-eqz v7, :cond_0

    .line 94
    .line 95
    const p2, 0x7f0a02f8

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    move-object v8, p3

    .line 103
    check-cast v8, Lcom/google/android/material/tabs/TabLayout;

    .line 104
    .line 105
    if-eqz v8, :cond_0

    .line 106
    .line 107
    const p2, 0x7f0a02fb

    .line 108
    .line 109
    .line 110
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    move-object v9, p3

    .line 115
    check-cast v9, Landroid/widget/FrameLayout;

    .line 116
    .line 117
    if-eqz v9, :cond_0

    .line 118
    .line 119
    new-instance v0, Lup0;

    .line 120
    .line 121
    invoke-direct/range {v0 .. v9}, Lup0;-><init>(Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageButton;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/tabs/TabLayout;Landroid/widget/FrameLayout;)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    const-string p1, "Missing required view with ID: "

    .line 139
    .line 140
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const/4 p0, 0x0

    .line 148
    return-object p0
.end method

.method public final J()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Lxt1;->b:Lyr1;

    .line 3
    .line 4
    sput-object v0, Lxt1;->c:Les1;

    .line 5
    .line 6
    sput-object v0, Lxt1;->d:Les1;

    .line 7
    .line 8
    sput-object v0, Lxt1;->e:Lzr1;

    .line 9
    .line 10
    sput-object v0, Lxt1;->f:Lyr1;

    .line 11
    .line 12
    sput-object v0, Lxt1;->g:Lzr1;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->r0:Landroid/webkit/ValueCallback;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->r0:Landroid/webkit/ValueCallback;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 24
    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    iget-object v2, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 28
    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    instance-of v4, v3, Landroid/view/ViewGroup;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    check-cast v3, Landroid/view/ViewGroup;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v3, v0

    .line 50
    :goto_0
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    new-instance v3, Landroid/webkit/WebViewClient;

    .line 56
    .line 57
    invoke-direct {v3}, Landroid/webkit/WebViewClient;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 61
    .line 62
    .line 63
    new-instance v3, Landroid/webkit/WebChromeClient;

    .line 64
    .line 65
    invoke-direct {v3}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 69
    .line 70
    .line 71
    sget-object v1, Lhw;->h:Landroid/content/MutableContextWrapper;

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const-string p0, "activity"

    .line 80
    .line 81
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_4
    :goto_1
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 86
    .line 87
    iput-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 91
    .line 92
    return-void
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "hub_route"

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final R()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const-string v3, "activity"

    .line 8
    .line 9
    if-eqz v1, :cond_5

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->J()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 15
    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    sget-boolean v4, Lxt1;->h:Z

    .line 19
    .line 20
    xor-int/2addr v4, v0

    .line 21
    invoke-virtual {v1, v4}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->u0:Lwt;

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w(Lut;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 40
    .line 41
    iget-object v1, v1, Lqp4;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 44
    .line 45
    iget-object v4, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->v0:Lcs1;

    .line 46
    .line 47
    invoke-virtual {v1, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v1, v1, Lup0;->a:Landroid/view/ViewGroup;

    .line 56
    .line 57
    check-cast v1, Landroid/widget/LinearLayout;

    .line 58
    .line 59
    new-instance v4, Las1;

    .line 60
    .line 61
    invoke-direct {v4, p0, v0}, Las1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    sget-object v0, Llr1;->a:Ljava/lang/ref/WeakReference;

    .line 68
    .line 69
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 70
    .line 71
    if-eqz p0, :cond_1

    .line 72
    .line 73
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 74
    .line 75
    if-nez v0, :cond_0

    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    new-instance v1, Ljr1;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-direct {v1, v0, v2}, Ljr1;-><init>(Lbl2;I)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0}, Lud3;->w(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v0, v1, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v2

    .line 96
    :cond_2
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v2

    .line 100
    :cond_3
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v2

    .line 104
    :cond_4
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v2

    .line 108
    :cond_5
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v2
.end method

.method public final S()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "activity"

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 17
    .line 18
    iget-object v4, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->u0:Lwt;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->j0:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Lqp4;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->v0:Lcs1;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iput-boolean v3, p0, Lkc1;->R:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_2
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_3
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v1
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lup0;->g:Landroid/view/View;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    .line 12
    .line 13
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lfs1;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->g()Lkq4;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v1, v1, Lfs1;->a:I

    .line 38
    .line 39
    iget-object v5, v4, Lkq4;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v4, v1}, Lkq4;->a(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v4, v2}, Lcom/google/android/material/tabs/TabLayout;->a(Lkq4;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v4, Lkq4;->e:Lmq4;

    .line 58
    .line 59
    invoke-static {v1, v3}, Le35;->S(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const-string p0, "Tab not attached to a TabLayout"

    .line 64
    .line 65
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    new-instance v0, Lis1;

    .line 70
    .line 71
    invoke-direct {v0, v2, p0}, Lis1;-><init>(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, Lcom/google/android/material/tabs/TabLayout;->a0:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    .line 94
    .line 95
    const/4 v0, 0x2

    .line 96
    if-ne p1, v0, :cond_3

    .line 97
    .line 98
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p1, p1, Lup0;->i:Landroid/view/View;

    .line 104
    .line 105
    check-cast p1, Landroid/widget/ImageButton;

    .line 106
    .line 107
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object p1, p1, Lup0;->i:Landroid/view/View;

    .line 116
    .line 117
    check-cast p1, Landroid/widget/ImageButton;

    .line 118
    .line 119
    new-instance v1, Lds1;

    .line 120
    .line 121
    invoke-direct {v1, p0, v2}, Lds1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    .line 126
    .line 127
    :cond_3
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object p1, p1, Lup0;->e:Landroid/view/View;

    .line 133
    .line 134
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 135
    .line 136
    new-instance v1, Lds1;

    .line 137
    .line 138
    const/4 v4, 0x1

    .line 139
    invoke-direct {v1, p0, v4}, Lds1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object p1, p1, Lup0;->f:Landroid/view/View;

    .line 151
    .line 152
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 153
    .line 154
    new-instance v1, Lds1;

    .line 155
    .line 156
    invoke-direct {v1, p0, v0}, Lds1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 163
    .line 164
    const-string v1, "activity"

    .line 165
    .line 166
    if-eqz p1, :cond_14

    .line 167
    .line 168
    sget-object v5, Lhw;->g:Landroid/webkit/WebView;

    .line 169
    .line 170
    if-eqz v5, :cond_7

    .line 171
    .line 172
    sget-object v6, Lhw;->h:Landroid/content/MutableContextWrapper;

    .line 173
    .line 174
    if-eqz v6, :cond_4

    .line 175
    .line 176
    invoke-virtual {v6, p1}, Landroid/content/MutableContextWrapper;->setBaseContext(Landroid/content/Context;)V

    .line 177
    .line 178
    .line 179
    :cond_4
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    instance-of v6, p1, Landroid/view/ViewGroup;

    .line 184
    .line 185
    if-eqz v6, :cond_5

    .line 186
    .line 187
    check-cast p1, Landroid/view/ViewGroup;

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    move-object p1, v3

    .line 191
    :goto_1
    if-eqz p1, :cond_6

    .line 192
    .line 193
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 194
    .line 195
    .line 196
    :cond_6
    new-instance p1, Lxk0;

    .line 197
    .line 198
    invoke-direct {p1, v5, v2}, Lxk0;-><init>(Landroid/webkit/WebView;Z)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_3

    .line 202
    .line 203
    :cond_7
    new-instance v5, Landroid/content/MutableContextWrapper;

    .line 204
    .line 205
    invoke-direct {v5, p1}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    new-instance p1, Landroid/webkit/WebView;

    .line 209
    .line 210
    invoke-direct {p1, v5}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 211
    .line 212
    .line 213
    const-string v6, "#0B0B0B"

    .line 214
    .line 215
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    invoke-virtual {p1, v6}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    invoke-virtual {v6, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v6, v4}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v6, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v4}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6, v4}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v6, v4}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v7

    .line 251
    new-instance v8, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string v7, " HomeMusicAndroid/1.14.7"

    .line 260
    .line 261
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-virtual {v6, v4}, Landroid/webkit/CookieManager;->setAcceptCookie(Z)V

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    invoke-virtual {v6, p1, v2}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    .line 283
    .line 284
    .line 285
    sget-object v6, Lxt1;->a:Lxt1;

    .line 286
    .line 287
    const-string v7, "HomeMusicAndroid"

    .line 288
    .line 289
    invoke-virtual {p1, v6, v7}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-string v6, "DOCUMENT_START_SCRIPT"

    .line 293
    .line 294
    invoke-static {v6}, Lg12;->C(Ljava/lang/String;)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-eqz v6, :cond_9

    .line 299
    .line 300
    const-string v6, "*"

    .line 301
    .line 302
    invoke-static {v6}, Lkb4;->S(Ljava/lang/Object;)Ljava/util/Set;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    sget v7, Lj95;->a:I

    .line 307
    .line 308
    sget-object v7, Lm95;->b:Lte;

    .line 309
    .line 310
    invoke-virtual {v7}, Lue;->b()Z

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    if-eqz v7, :cond_8

    .line 315
    .line 316
    sget-object v7, Ln95;->a:Lo95;

    .line 317
    .line 318
    invoke-interface {v7, p1}, Lo95;->createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    new-array v8, v2, [Ljava/lang/String;

    .line 323
    .line 324
    invoke-interface {v6, v8}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    check-cast v6, [Ljava/lang/String;

    .line 329
    .line 330
    const-string v8, "(function () {\n  if (window.__AURA_HUB_STYLE__) return;\n  window.__AURA_HUB_STYLE__ = true;\n  var css = [\n    ':root{color-scheme:dark;--aura-text:#f4f1ff;--aura-muted:#beb9d2;--aura-violet:#bdadff;--aura-cyan:#79d9df;--aura-line:rgba(189,173,255,.18)}',\n    'html,body{min-height:100%;background:radial-gradient(ellipse at 12% 0%,rgba(93,65,150,.22),transparent 42%),radial-gradient(ellipse at 92% 28%,rgba(30,132,145,.14),transparent 38%),#0d0e18!important;color:var(--aura-text)!important}',\n    'body{font-family:system-ui,-apple-system,Roboto,sans-serif!important}main{padding:14px 14px 24px!important;background:transparent!important}',\n    'nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"]{display:flex!important;position:sticky;top:0;z-index:5;gap:7px;max-width:100%;overflow-x:auto;white-space:nowrap;padding:9px 12px!important;background:rgba(17,18,34,.92)!important;border-bottom:1px solid var(--aura-line)!important;backdrop-filter:blur(16px)}',\n    'nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"] a,nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"] button,nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"] [role=\"tab\"]{flex:0 0 auto;min-height:38px;padding:8px 13px!important;border:1px solid transparent!important;border-radius:14px!important;color:var(--aura-muted)!important;background:rgba(255,255,255,.035)!important;transition:background .22s ease,border-color .22s ease,color .22s ease,transform .22s ease}',\n    'nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"] [aria-current=\"page\"],nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"] [aria-selected=\"true\"],nav[aria-label=\"\u0420\u0430\u0437\u0434\u0435\u043b\u044b\"] .active{color:var(--aura-text)!important;background:linear-gradient(110deg,rgba(129,98,201,.34),rgba(38,139,150,.24))!important;border-color:rgba(189,173,255,.34)!important}',\n    'article,[data-slot=\"card\"],[class*=\"Card\"],[class*=\"rounded-xl\"],[class*=\"rounded-2xl\"],.card{background:linear-gradient(145deg,rgba(31,30,53,.92),rgba(17,28,42,.9))!important;border:1px solid var(--aura-line)!important;border-radius:18px!important;box-shadow:0 10px 28px rgba(0,0,0,.2)!important;color:var(--aura-text)!important}',\n    'h1,h2,h3,h4,strong{color:#fff!important}p,label,small,li{color:var(--aura-muted)}',\n    'button,[role=\"button\"],a[data-slot=\"button\"]{border-radius:14px!important;transition:transform .2s ease,box-shadow .2s ease,background .2s ease,border-color .2s ease!important}',\n    'button:not(:disabled):hover,[role=\"button\"]:hover,a[data-slot=\"button\"]:hover{transform:translateY(-1px);box-shadow:0 7px 20px rgba(0,0,0,.22)}',\n    'input,select,textarea{background:rgba(10,12,24,.82)!important;color:var(--aura-text)!important;border-color:rgba(189,173,255,.25)!important;border-radius:13px!important;transition:border-color .2s ease,box-shadow .2s ease!important}',\n    'input:focus,select:focus,textarea:focus{border-color:var(--aura-violet)!important;box-shadow:0 0 0 3px rgba(189,173,255,.12)!important;outline:none!important}',\n    'a{color:var(--aura-cyan)}hr{border-color:var(--aura-line)!important}img{border-radius:12px}',\n    '::-webkit-scrollbar{width:7px;height:7px}::-webkit-scrollbar-thumb{background:rgba(189,173,255,.28);border-radius:8px}',\n    '.aura-hub-enter{animation:auraHubEnter .34s cubic-bezier(.2,.7,.25,1) both}',\n    '@keyframes auraHubEnter{from{opacity:.35;transform:translateY(7px)}to{opacity:1;transform:translateY(0)}}',\n    '@media(prefers-reduced-motion:reduce){*,*::before,*::after{scroll-behavior:auto!important;animation-duration:.01ms!important;transition-duration:.01ms!important}}'\n  ].join('');\n  function addStyle() {\n    if (!document.getElementById('aura-hub-style')) {\n      var style = document.createElement('style');\n      style.id = 'aura-hub-style';\n      style.textContent = css;\n      (document.head || document.documentElement).appendChild(style);\n    }\n  }\n  function animatePage() {\n    var main = document.querySelector('main');\n    if (!main || window.matchMedia('(prefers-reduced-motion: reduce)').matches) return;\n    main.classList.remove('aura-hub-enter');\n    void main.offsetWidth;\n    main.classList.add('aura-hub-enter');\n  }\n  function start() {\n    addStyle();\n    animatePage();\n    if (document.body && window.MutationObserver) {\n      var pending = false;\n      var observer = new MutationObserver(function (records) {\n        var changed = records.some(function (record) { return record.addedNodes && record.addedNodes.length; });\n        if (!changed || pending) return;\n        pending = true;\n        requestAnimationFrame(function () { pending = false; animatePage(); });\n      });\n      observer.observe(document.body, {childList:true, subtree:true});\n    }\n  }\n  if (document.readyState === 'loading') document.addEventListener('DOMContentLoaded', start, {once:true});\n  else start();\n  window.addEventListener('popstate', animatePage);\n  window.addEventListener('hm:unauthorized', function () {\n    try { HomeMusicAndroid.onUnauthorized(); } catch (e) {}\n  });\n})();"

    .line 331
    .line 332
    invoke-interface {v7, v8, v6}, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;->addDocumentStartJavaScript(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/reflect/InvocationHandler;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    const-class v7, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    .line 337
    .line 338
    invoke-static {v7, v6}, Lfu;->j(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    check-cast v6, Lorg/chromium/support_lib_boundary/ScriptHandlerBoundaryInterface;

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_8
    const-string p0, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 346
    .line 347
    invoke-static {p0}, Ler1;->l(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :cond_9
    :goto_2
    sput-object p1, Lhw;->g:Landroid/webkit/WebView;

    .line 352
    .line 353
    sput-object v5, Lhw;->h:Landroid/content/MutableContextWrapper;

    .line 354
    .line 355
    new-instance v5, Lxk0;

    .line 356
    .line 357
    invoke-direct {v5, p1, v4}, Lxk0;-><init>(Landroid/webkit/WebView;Z)V

    .line 358
    .line 359
    .line 360
    move-object p1, v5

    .line 361
    :goto_3
    iget-object v5, p1, Lxk0;->p:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v5, Landroid/webkit/WebView;

    .line 364
    .line 365
    iput-object v5, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 366
    .line 367
    iget-object v6, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    iget-object v6, v6, Lup0;->h:Landroid/view/View;

    .line 373
    .line 374
    check-cast v6, Landroid/widget/FrameLayout;

    .line 375
    .line 376
    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    .line 377
    .line 378
    const/4 v8, -0x1

    .line 379
    invoke-direct {v7, v8, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v6, v5, v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 383
    .line 384
    .line 385
    iget-object v6, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->w0:Lhs1;

    .line 386
    .line 387
    invoke-virtual {v5, v6}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 388
    .line 389
    .line 390
    iget-object v6, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->x0:Lgs1;

    .line 391
    .line 392
    invoke-virtual {v5, v6}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 393
    .line 394
    .line 395
    new-instance v6, Lyr1;

    .line 396
    .line 397
    invoke-direct {v6, p0, v4}, Lyr1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 398
    .line 399
    .line 400
    sput-object v6, Lxt1;->b:Lyr1;

    .line 401
    .line 402
    new-instance v6, Les1;

    .line 403
    .line 404
    invoke-direct {v6, p0, v2}, Les1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 405
    .line 406
    .line 407
    sput-object v6, Lxt1;->c:Les1;

    .line 408
    .line 409
    new-instance v6, Les1;

    .line 410
    .line 411
    invoke-direct {v6, p0, v4}, Les1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 412
    .line 413
    .line 414
    sput-object v6, Lxt1;->d:Les1;

    .line 415
    .line 416
    new-instance v6, Lzr1;

    .line 417
    .line 418
    invoke-direct {v6, p0, v0}, Lzr1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 419
    .line 420
    .line 421
    sput-object v6, Lxt1;->e:Lzr1;

    .line 422
    .line 423
    new-instance v0, Lyr1;

    .line 424
    .line 425
    invoke-direct {v0, p0, v2}, Lyr1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 426
    .line 427
    .line 428
    sput-object v0, Lxt1;->f:Lyr1;

    .line 429
    .line 430
    new-instance v0, Lzr1;

    .line 431
    .line 432
    invoke-direct {v0, p0, v2}, Lzr1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 433
    .line 434
    .line 435
    sput-object v0, Lxt1;->g:Lzr1;

    .line 436
    .line 437
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 438
    .line 439
    if-eqz v0, :cond_13

    .line 440
    .line 441
    invoke-static {v0}, Lhw;->c(Landroid/app/Activity;)V

    .line 442
    .line 443
    .line 444
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 445
    .line 446
    if-eqz v0, :cond_12

    .line 447
    .line 448
    invoke-virtual {v0}, Ll70;->i()La93;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    iget-object v6, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->t0:Lbd1;

    .line 457
    .line 458
    invoke-virtual {v0, v1, v6}, La93;->a(Lba2;Lv83;)V

    .line 459
    .line 460
    .line 461
    sget-object v0, Ljs1;->a:Lk03;

    .line 462
    .line 463
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    check-cast v1, Ljava/lang/String;

    .line 468
    .line 469
    if-eqz v1, :cond_a

    .line 470
    .line 471
    invoke-virtual {v0, v3}, Lad2;->k(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    :cond_a
    if-nez v1, :cond_c

    .line 475
    .line 476
    iget-object v1, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 477
    .line 478
    if-eqz v1, :cond_b

    .line 479
    .line 480
    const-string v6, "route"

    .line 481
    .line 482
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    if-eqz v1, :cond_b

    .line 487
    .line 488
    iget-object v7, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 489
    .line 490
    if-eqz v7, :cond_c

    .line 491
    .line 492
    invoke-virtual {v7, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_4

    .line 496
    :cond_b
    move-object v1, v3

    .line 497
    :cond_c
    :goto_4
    if-eqz p2, :cond_d

    .line 498
    .line 499
    const-string v3, "hub_route"

    .line 500
    .line 501
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    :cond_d
    if-eqz v1, :cond_e

    .line 506
    .line 507
    invoke-virtual {p0, v1, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_e
    iget-boolean p1, p1, Lxk0;->o:Z

    .line 512
    .line 513
    if-nez p1, :cond_10

    .line 514
    .line 515
    sget-object p1, Lhw;->i:Ljava/lang/String;

    .line 516
    .line 517
    if-eqz p1, :cond_10

    .line 518
    .line 519
    invoke-virtual {v5}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-static {p1}, Lxl;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    if-nez p1, :cond_f

    .line 528
    .line 529
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 530
    .line 531
    :cond_f
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubFragment;->j0(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    goto :goto_5

    .line 535
    :cond_10
    if-nez v3, :cond_11

    .line 536
    .line 537
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->z0:[Ljava/lang/String;

    .line 538
    .line 539
    aget-object v3, p1, v2

    .line 540
    .line 541
    if-nez v3, :cond_11

    .line 542
    .line 543
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 544
    .line 545
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    check-cast p1, Lfs1;

    .line 550
    .line 551
    iget-object v3, p1, Lfs1;->b:Ljava/lang/String;

    .line 552
    .line 553
    :cond_11
    invoke-virtual {p0, v3, v2}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V

    .line 554
    .line 555
    .line 556
    :goto_5
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    new-instance p2, Lzr1;

    .line 561
    .line 562
    invoke-direct {p2, p0, v4}, Lzr1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 563
    .line 564
    .line 565
    new-instance p0, Lwd1;

    .line 566
    .line 567
    const/4 v1, 0x4

    .line 568
    invoke-direct {p0, p2, v1}, Lwd1;-><init>(Lif1;I)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0, p1, p0}, Lad2;->e(Lba2;La83;)V

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :cond_12
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    throw v3

    .line 579
    :cond_13
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    throw v3

    .line 583
    :cond_14
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    throw v3
.end method

.method public final h0(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->k0(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0(Z)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    new-instance v1, Lbs1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, p2, p1, v2}, Lbs1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final i0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v1, Lhw;->i:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/eddyizm/tempus/homemusic/HubFragment;->h0(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lxl;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_2
    sget-object p0, Lrr1;->c:Lnk1;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lnk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, "window.location.hash = "

    .line 39
    .line 40
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, ";"

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-virtual {v0, p0, p1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final j0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->o0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x3f

    .line 7
    .line 8
    invoke-static {p1, v0}, Lqm4;->H0(Ljava/lang/String;C)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "/search"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v1, :cond_5

    .line 21
    .line 22
    const-string v1, "/artist/"

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_5

    .line 29
    .line 30
    const-string v1, "/album/"

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const-string v1, "/downloads"

    .line 40
    .line 41
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    move v0, v3

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const-string v1, "/assistant"

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const-string v1, "/library"

    .line 60
    .line 61
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    const-string v1, "/upload"

    .line 68
    .line 69
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_4

    .line 74
    .line 75
    const-string v1, "/playlists"

    .line 76
    .line 77
    invoke-static {v0, v1, v2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const/4 v0, -0x1

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_0
    const/4 v0, 0x3

    .line 87
    goto :goto_2

    .line 88
    :cond_5
    :goto_1
    move v0, v2

    .line 89
    :goto_2
    if-ltz v0, :cond_6

    .line 90
    .line 91
    sget-object v1, Lcom/eddyizm/tempus/homemusic/HubFragment;->z0:[Ljava/lang/String;

    .line 92
    .line 93
    aput-object p1, v1, v0

    .line 94
    .line 95
    :cond_6
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 96
    .line 97
    if-eqz p1, :cond_b

    .line 98
    .line 99
    iget-object p1, p1, Lup0;->g:Landroid/view/View;

    .line 100
    .line 101
    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    .line 102
    .line 103
    iput-boolean v3, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->p0:Z

    .line 104
    .line 105
    if-ltz v0, :cond_8

    .line 106
    .line 107
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eq v1, v0, :cond_8

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->f(I)Lkq4;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_9

    .line 118
    .line 119
    iget-object v0, p1, Lkq4;->d:Lcom/google/android/material/tabs/TabLayout;

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v0, p1, v3}, Lcom/google/android/material/tabs/TabLayout;->i(Lkq4;Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 128
    .line 129
    const-string v0, "Tab not attached to a TabLayout"

    .line 130
    .line 131
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :catchall_0
    move-exception p1

    .line 136
    goto :goto_3

    .line 137
    :cond_8
    if-gez v0, :cond_9

    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    invoke-virtual {p1, v0, v3}, Lcom/google/android/material/tabs/TabLayout;->i(Lkq4;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :goto_3
    iput-boolean v2, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->p0:Z

    .line 145
    .line 146
    throw p1

    .line 147
    :cond_9
    :goto_4
    iput-boolean v2, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->p0:Z

    .line 148
    .line 149
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 150
    .line 151
    if-eqz p1, :cond_a

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-ne p1, v3, :cond_a

    .line 158
    .line 159
    move v2, v3

    .line 160
    :cond_a
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->t0:Lbd1;

    .line 161
    .line 162
    invoke-virtual {p0, v2}, Lv83;->c(Z)V

    .line 163
    .line 164
    .line 165
    :cond_b
    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v1, v0, Lup0;->b:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/16 v3, 0x8

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move v3, v2

    .line 15
    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->n0:Landroid/webkit/WebView;

    .line 19
    .line 20
    if-eqz p0, :cond_3

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 v2, 0x4

    .line 26
    :goto_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_3
    if-eqz p1, :cond_4

    .line 30
    .line 31
    iget-object p0, v0, Lup0;->c:Landroid/view/View;

    .line 32
    .line 33
    check-cast p0, Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_4
    :goto_2
    return-void
.end method

.method public final l0(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Lup0;->a:Landroid/view/ViewGroup;

    .line 19
    .line 20
    check-cast p1, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    new-instance v0, Las1;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, Las1;-><init>(Lcom/eddyizm/tempus/homemusic/HubFragment;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string p0, "activity"

    .line 33
    .line 34
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public final m0(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lup0;->d:Landroid/view/View;

    .line 6
    .line 7
    check-cast p0, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 p1, 0x8

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final n0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->l0:Lup0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    iget-object v0, v0, Lup0;->a:Landroid/view/ViewGroup;

    .line 8
    .line 9
    check-cast v0, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz p0, :cond_a

    .line 15
    .line 16
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :cond_1
    iget-object v3, v2, Lqp4;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 25
    .line 26
    iget-object v2, v2, Lqp4;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Landroid/widget/FrameLayout;

    .line 29
    .line 30
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-nez v4, :cond_2

    .line 39
    .line 40
    iget v4, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 41
    .line 42
    const/4 v7, 0x5

    .line 43
    if-eq v4, v7, :cond_2

    .line 44
    .line 45
    move v4, v5

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move v4, v6

    .line 48
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-nez v7, :cond_3

    .line 53
    .line 54
    move v7, v5

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move v7, v6

    .line 57
    :goto_1
    if-eqz v4, :cond_4

    .line 58
    .line 59
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 60
    .line 61
    const/4 v8, 0x4

    .line 62
    if-eq p0, v8, :cond_4

    .line 63
    .line 64
    goto :goto_5

    .line 65
    :cond_4
    if-eqz v4, :cond_5

    .line 66
    .line 67
    move-object v1, v2

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    if-eqz v7, :cond_6

    .line 70
    .line 71
    move-object v1, v3

    .line 72
    :cond_6
    :goto_2
    if-nez v1, :cond_7

    .line 73
    .line 74
    :goto_3
    move v3, v6

    .line 75
    goto :goto_4

    .line 76
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x2

    .line 80
    new-array v2, p0, [I

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationInWindow([I)V

    .line 83
    .line 84
    .line 85
    aget v2, v2, v5

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    add-int/2addr v3, v2

    .line 92
    new-array p0, p0, [I

    .line 93
    .line 94
    invoke-virtual {v1, p0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 95
    .line 96
    .line 97
    aget p0, p0, v5

    .line 98
    .line 99
    sub-int/2addr v3, p0

    .line 100
    if-gez v3, :cond_8

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_8
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eq p0, v3, :cond_9

    .line 108
    .line 109
    invoke-virtual {v0, v6, v6, v6, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 110
    .line 111
    .line 112
    :cond_9
    :goto_5
    return-void

    .line 113
    :cond_a
    const-string p0, "activity"

    .line 114
    .line 115
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v1
.end method
