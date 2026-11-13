.class public abstract Ldefpackage/b0;
.super Landroid/view/ViewGroup;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Ljava/lang/ref/WeakReference;

.field public o:Landroid/os/IBinder;

.field public p:Ldefpackage/wd5;

.field public q:Ldefpackage/u80;

.field public r:Ldefpackage/h80;

.field public s:Ldefpackage/gf1;

.field public t:Z

.field public u:Z

.field public v:Z


# direct methods
.method private static synthetic getDisposeViewCompositionStrategy$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final setParentContext(Ldefpackage/u80;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/b0;->q:Ldefpackage/u80;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/b0;->q:Ldefpackage/u80;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/b0;->n:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ldefpackage/wd5;->a()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/b0;->e()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private final setPreviousAttachedWindowToken(Landroid/os/IBinder;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/b0;->o:Landroid/os/IBinder;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/b0;->o:Landroid/os/IBinder;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Ldefpackage/b0;->n:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public abstract a(ILdefpackage/rg1;)V
.end method

.method public final addView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 0

    .line 8
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 9
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 0

    .line 10
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 11
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 14
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 15
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 12
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 13
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z
    .locals 0

    .line 9
    invoke-virtual {p0}, Ldefpackage/b0;->c()V

    .line 10
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    move-result p0

    return p0
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p0, v0}, Ldefpackage/b0;->setPreviousAttachedWindowToken(Landroid/os/IBinder;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/b0;->r:Ldefpackage/h80;

    .line 16
    .line 17
    if-nez v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    instance-of v2, v0, Ldefpackage/ra;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, Ldefpackage/ra;

    .line 38
    .line 39
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-virtual {v1}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0}, Ldefpackage/au0;->p(Landroid/view/View;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p0, v2, v0}, Ldefpackage/b0;->h(Landroid/view/View;Ldefpackage/h80;)Ldefpackage/h80;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v1, v0}, Ldefpackage/ra;->setComposeViewContext(Ldefpackage/h80;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {p0}, Ldefpackage/b0;->getShouldCreateCompositionOnAttachedToWindow()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0}, Ldefpackage/b0;->e()V

    .line 63
    .line 64
    .line 65
    :cond_4
    :goto_1
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/b0;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v0, "Cannot add views to "

    .line 15
    .line 16
    const-string v1, "; only Compose content is supported"

    .line 17
    .line 18
    invoke-static {v0, p0, v1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    instance-of v2, v1, Ldefpackage/ra;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast v1, Ldefpackage/ra;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, v3

    .line 15
    :goto_0
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-boolean v2, v1, Ldefpackage/ra;->P0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ldefpackage/h80;->b()V

    .line 26
    .line 27
    .line 28
    iput-boolean v0, v1, Ldefpackage/ra;->P0:Z

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {v0}, Ldefpackage/wd5;->a()V

    .line 35
    .line 36
    .line 37
    :cond_2
    iput-object v3, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p0, Ldefpackage/b0;->u:Z

    .line 8
    .line 9
    const-string v2, "Compose:initializeView"

    .line 10
    .line 11
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    .line 13
    .line 14
    :try_start_1
    iget-object v2, p0, Ldefpackage/b0;->r:Ldefpackage/h80;

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/b0;->f()Ldefpackage/h80;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    new-instance v3, Ldefpackage/z;

    .line 26
    .line 27
    invoke-direct {v3, v0, p0}, Ldefpackage/z;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Ldefpackage/r70;

    .line 31
    .line 32
    const v5, 0x3bca7461

    .line 33
    .line 34
    .line 35
    invoke-direct {v4, v5, v1, v3}, Ldefpackage/r70;-><init>(IZLdefpackage/sf1;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v2, v4}, Ldefpackage/zd5;->a(Ldefpackage/b0;Ldefpackage/h80;Ldefpackage/r70;)Ldefpackage/wd5;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    .line 44
    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 45
    .line 46
    .line 47
    iput-boolean v0, p0, Ldefpackage/b0;->u:Z

    .line 48
    .line 49
    return-void

    .line 50
    :catchall_1
    move-exception v1

    .line 51
    goto :goto_2

    .line 52
    :goto_1
    :try_start_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 53
    .line 54
    .line 55
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 56
    :goto_2
    iput-boolean v0, p0, Ldefpackage/b0;->u:Z

    .line 57
    .line 58
    throw v1

    .line 59
    :cond_1
    return-void
.end method

.method public final f()Ldefpackage/h80;
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    :cond_0
    move-object v0, v1

    .line 9
    goto :goto_1

    .line 10
    :cond_1
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v2, v0, Ldefpackage/ra;

    .line 16
    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    check-cast v0, Ldefpackage/ra;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move-object v0, v1

    .line 23
    :goto_0
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Ldefpackage/ra;->getComposeViewContext()Ldefpackage/h80;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_1
    invoke-static {p0}, Ldefpackage/au0;->p(Landroid/view/View;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4}, Ldefpackage/au0;->q(Landroid/view/View;)Ldefpackage/h80;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_b

    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/b0;->g()Ldefpackage/u80;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-static {v4}, Ldefpackage/j51;->u(Landroid/view/View;)Ldefpackage/ba2;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-nez p0, :cond_4

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Ldefpackage/h80;->d()Ldefpackage/ba2;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move-object p0, v1

    .line 57
    :goto_2
    if-eqz p0, :cond_5

    .line 58
    .line 59
    :cond_4
    move-object v6, p0

    .line 60
    goto :goto_3

    .line 61
    :cond_5
    const-string p0, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    .line 62
    .line 63
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :goto_3
    invoke-static {v4}, Ldefpackage/kb4;->y(Landroid/view/View;)Ldefpackage/j54;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-nez p0, :cond_7

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Ldefpackage/h80;->g()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v0, Ldefpackage/h80;->e:Ldefpackage/j54;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    move-object p0, v1

    .line 85
    :goto_4
    if-eqz p0, :cond_8

    .line 86
    .line 87
    :cond_7
    move-object v7, p0

    .line 88
    goto :goto_5

    .line 89
    :cond_8
    const-string p0, "Composed into the View which doesn\'t propagate ViewTreeSavedStateRegistryOwner!"

    .line 90
    .line 91
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v1

    .line 95
    :goto_5
    invoke-static {v4}, Ldefpackage/gi1;->o(Landroid/view/View;)Ldefpackage/f75;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-nez p0, :cond_a

    .line 100
    .line 101
    if-eqz v0, :cond_9

    .line 102
    .line 103
    invoke-virtual {v0}, Ldefpackage/h80;->g()V

    .line 104
    .line 105
    .line 106
    iget-object v1, v0, Ldefpackage/h80;->f:Ldefpackage/f75;

    .line 107
    .line 108
    :cond_9
    move-object v8, v1

    .line 109
    goto :goto_6

    .line 110
    :cond_a
    move-object v8, p0

    .line 111
    :goto_6
    new-instance v2, Ldefpackage/h80;

    .line 112
    .line 113
    invoke-static {v4}, Ldefpackage/au0;->p(Landroid/view/View;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Ldefpackage/au0;->q(Landroid/view/View;)Ldefpackage/h80;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-direct/range {v2 .. v8}, Ldefpackage/h80;-><init>(Ldefpackage/h80;Landroid/view/View;Ldefpackage/u80;Ldefpackage/ba2;Ldefpackage/j54;Ldefpackage/f75;)V

    .line 122
    .line 123
    .line 124
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 125
    .line 126
    invoke-direct {p0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const v0, 0x7f0a00cd

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :cond_b
    invoke-virtual {p0, v4, v2}, Ldefpackage/b0;->h(Landroid/view/View;Ldefpackage/h80;)Ldefpackage/h80;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    return-object p0
.end method

.method public final g()Ldefpackage/u80;
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/b0;->q:Ldefpackage/u80;

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    invoke-static {p0}, Ldefpackage/ic5;->a(Landroid/view/View;)Ldefpackage/u80;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    instance-of v2, v1, Landroid/view/View;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast v1, Landroid/view/View;

    .line 23
    .line 24
    invoke-static {v1}, Ldefpackage/ic5;->a(Landroid/view/View;)Ldefpackage/u80;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v1}, Ldefpackage/au0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    sget-object v1, Ldefpackage/ov3;->o:Ldefpackage/ov3;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    instance-of v3, v0, Ldefpackage/tv3;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    move-object v3, v0

    .line 43
    check-cast v3, Ldefpackage/tv3;

    .line 44
    .line 45
    iget-object v3, v3, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 46
    .line 47
    invoke-virtual {v3}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ldefpackage/ov3;

    .line 52
    .line 53
    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-lez v3, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v3, v2

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    :goto_2
    move-object v3, v0

    .line 63
    :goto_3
    if-eqz v3, :cond_5

    .line 64
    .line 65
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 66
    .line 67
    invoke-direct {v4, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v4, p0, Ldefpackage/b0;->n:Ljava/lang/ref/WeakReference;

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_4
    move-object v0, v2

    .line 74
    :cond_5
    :goto_4
    if-nez v0, :cond_9

    .line 75
    .line 76
    iget-object v0, p0, Ldefpackage/b0;->n:Ljava/lang/ref/WeakReference;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ldefpackage/u80;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    instance-of v3, v0, Ldefpackage/tv3;

    .line 89
    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    move-object v3, v0

    .line 93
    check-cast v3, Ldefpackage/tv3;

    .line 94
    .line 95
    iget-object v3, v3, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 96
    .line 97
    invoke-virtual {v3}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Ldefpackage/ov3;

    .line 102
    .line 103
    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-lez v3, :cond_6

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    move-object v0, v2

    .line 111
    :cond_7
    :goto_5
    if-nez v0, :cond_9

    .line 112
    .line 113
    invoke-static {p0}, Ldefpackage/ic5;->b(Landroid/view/View;)Ldefpackage/tv3;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v3, v0, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 118
    .line 119
    invoke-virtual {v3}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Ldefpackage/ov3;

    .line 124
    .line 125
    invoke-virtual {v3, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-lez v1, :cond_8

    .line 130
    .line 131
    move-object v2, v0

    .line 132
    :cond_8
    if-eqz v2, :cond_9

    .line 133
    .line 134
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 135
    .line 136
    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iput-object v1, p0, Ldefpackage/b0;->n:Ljava/lang/ref/WeakReference;

    .line 140
    .line 141
    :cond_9
    return-object v0
.end method

.method public final getAutoClearFocusBehavior-4UtRPd4()I
    .locals 1

    .line 1
    const v0, 0x7f0a0105

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    instance-of v0, p0, Ldefpackage/on;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Ldefpackage/on;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    iget p0, p0, Ldefpackage/on;->a:I

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public final getComposeViewContext$ui()Ldefpackage/h80;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/b0;->r:Ldefpackage/h80;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHasComposition()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/b0;->p:Ldefpackage/wd5;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final getShowLayoutBounds()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/b0;->t:Z

    .line 2
    .line 3
    return p0
.end method

.method public final h(Landroid/view/View;Ldefpackage/h80;)Ldefpackage/h80;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ldefpackage/b0;->g()Ldefpackage/u80;

    .line 2
    .line 3
    .line 4
    move-result-object v3

    .line 5
    invoke-static {p1}, Ldefpackage/j51;->u(Landroid/view/View;)Ldefpackage/ba2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1}, Ldefpackage/gi1;->o(Landroid/view/View;)Ldefpackage/f75;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-static {p1}, Ldefpackage/kb4;->y(Landroid/view/View;)Ldefpackage/j54;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p2}, Ldefpackage/h80;->c()Ldefpackage/u80;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-ne v3, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2}, Ldefpackage/h80;->d()Ldefpackage/ba2;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-ne v0, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2}, Ldefpackage/h80;->g()V

    .line 30
    .line 31
    .line 32
    iget-object v2, p2, Ldefpackage/h80;->f:Ldefpackage/f75;

    .line 33
    .line 34
    if-ne v6, v2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p2}, Ldefpackage/h80;->g()V

    .line 37
    .line 38
    .line 39
    iget-object v2, p2, Ldefpackage/h80;->e:Ldefpackage/j54;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    if-ne v1, v2, :cond_0

    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_0
    invoke-virtual {v3}, Ldefpackage/u80;->j()Ldefpackage/ne0;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p2}, Ldefpackage/h80;->c()Ldefpackage/u80;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4}, Ldefpackage/u80;->j()Ldefpackage/ne0;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-eq v2, v4, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, Ldefpackage/b0;->d()V

    .line 62
    .line 63
    .line 64
    :cond_1
    if-nez v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {p2}, Ldefpackage/h80;->d()Ldefpackage/ba2;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_2
    move-object v4, v0

    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {p2}, Ldefpackage/h80;->g()V

    .line 74
    .line 75
    .line 76
    iget-object v1, p2, Ldefpackage/h80;->e:Ldefpackage/j54;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    :cond_3
    move-object v5, v1

    .line 82
    new-instance v0, Ldefpackage/h80;

    .line 83
    .line 84
    move-object v2, p1

    .line 85
    move-object v1, p2

    .line 86
    invoke-direct/range {v0 .. v6}, Ldefpackage/h80;-><init>(Ldefpackage/h80;Landroid/view/View;Ldefpackage/u80;Ldefpackage/ba2;Ldefpackage/j54;Ldefpackage/f75;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    invoke-direct {p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const p1, 0x7f0a00cd

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object v0
.end method

.method public final isTransitionGroup()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/b0;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/ic5;->a:Ldefpackage/w03;

    .line 5
    .line 6
    invoke-static {p0}, Ldefpackage/au0;->z(Landroid/view/View;)Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    move-object v1, p0

    .line 11
    :goto_0
    instance-of v2, v0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    check-cast v0, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const v3, 0x1020002

    .line 22
    .line 23
    .line 24
    if-ne v2, v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v4, v1

    .line 32
    move-object v1, v0

    .line 33
    move-object v0, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ldefpackage/a0;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v1, v2, p0}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-virtual {p0}, Ldefpackage/b0;->b()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr p4, p2

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    sub-int/2addr p4, p2

    .line 22
    sub-int/2addr p5, p3

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sub-int/2addr p5, p0

    .line 28
    invoke-virtual {p1, v0, v1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/b0;->e()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sub-int/2addr v2, v3

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int/2addr v2, v3

    .line 29
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    sub-int/2addr v3, v4

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    sub-int/2addr v3, v4

    .line 47
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-static {v2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {v1, p1, p2}, Landroid/view/View;->measure(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    add-int/2addr p2, p1

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    add-int/2addr p1, p2

    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/2addr v0, p2

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    add-int/2addr p2, v0

    .line 98
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final setAutoClearFocusBehavior-17tfJxM(I)V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/on;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldefpackage/on;-><init>(I)V

    .line 4
    .line 5
    .line 6
    const p1, 0x7f0a0105

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setComposeViewContext$ui(Ldefpackage/h80;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/b0;->r:Ldefpackage/h80;

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/b0;->d()V

    .line 8
    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Ldefpackage/ra;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    check-cast v0, Ldefpackage/ra;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Ldefpackage/ra;->getCoroutineContext()Ldefpackage/ne0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Ldefpackage/h80;->c()Ldefpackage/u80;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ldefpackage/u80;->j()Ldefpackage/ne0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eq v1, v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/b0;->d()V

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0, p1}, Ldefpackage/ra;->setComposeViewContext(Ldefpackage/h80;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    :goto_1
    iput-object p1, p0, Ldefpackage/b0;->r:Ldefpackage/h80;

    .line 53
    .line 54
    :cond_4
    return-void
.end method

.method public final setParentCompositionContext(Ldefpackage/u80;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/b0;->setParentContext(Ldefpackage/u80;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final setShowLayoutBounds(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Ldefpackage/b0;->t:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p0, Ldefpackage/ub3;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/ra;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldefpackage/ra;->setShowLayoutBounds(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setTransitionGroup(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Ldefpackage/b0;->v:Z

    .line 6
    .line 7
    return-void
.end method

.method public final setViewCompositionStrategy(Ldefpackage/l65;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/b0;->s:Ldefpackage/gf1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-interface {p1, p0}, Ldefpackage/l65;->d(Ldefpackage/b0;)Ldefpackage/gf1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Ldefpackage/b0;->s:Ldefpackage/gf1;

    .line 13
    .line 14
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
