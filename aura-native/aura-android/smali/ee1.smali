.class public abstract Lee1;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lea2;

.field public final r:Lld1;

.field public final s:Lxe2;

.field public final t:Lxe2;

.field public final u:Lxe2;

.field public v:Lde1;

.field public final w:Lzh0;

.field public x:Z

.field public y:Z


# direct methods
.method public constructor <init>(Lld1;Lea2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxe2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lxe2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lee1;->s:Lxe2;

    .line 11
    .line 12
    new-instance v0, Lxe2;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lxe2;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lee1;->t:Lxe2;

    .line 18
    .line 19
    new-instance v0, Lxe2;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lxe2;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lee1;->u:Lxe2;

    .line 25
    .line 26
    new-instance v0, Lzh0;

    .line 27
    .line 28
    const/16 v1, 0x1a

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lzh0;-><init>(I)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, Lzh0;->o:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v0, p0, Lee1;->w:Lzh0;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    iput-boolean v0, p0, Lee1;->x:Z

    .line 44
    .line 45
    iput-boolean v0, p0, Lee1;->y:Z

    .line 46
    .line 47
    iput-object p1, p0, Lee1;->r:Lld1;

    .line 48
    .line 49
    iput-object p2, p0, Lee1;->q:Lea2;

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    invoke-virtual {p0, p1}, Ldw3;->o(Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static p(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-gt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne v0, p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    const-string p0, "Design assumption violated."

    .line 44
    .line 45
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final f(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lee1;->v:Lde1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lde1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lde1;-><init>(Lee1;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lee1;->v:Lde1;

    .line 11
    .line 12
    invoke-static {p1}, Lde1;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, v0, Lde1;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 17
    .line 18
    new-instance v1, Lq80;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, v2, v0}, Lq80;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lde1;->a:Lq80;

    .line 25
    .line 26
    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->p:Lq80;

    .line 27
    .line 28
    iget-object p1, p1, Lq80;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    new-instance p1, Lce1;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {p1, v1, v0}, Lce1;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, Lde1;->b:Lce1;

    .line 42
    .line 43
    iget-object v1, p0, Ldw3;->n:Lew3;

    .line 44
    .line 45
    invoke-virtual {v1, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p1, Lvv3;

    .line 49
    .line 50
    const/4 v1, 0x5

    .line 51
    invoke-direct {p1, v1, v0}, Lvv3;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, v0, Lde1;->c:Lvv3;

    .line 55
    .line 56
    iget-object p0, p0, Lee1;->q:Lea2;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lea2;->a(Laa2;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    invoke-static {}, Lnz2;->c()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final g(Lcx3;I)V
    .locals 8

    .line 1
    check-cast p1, Lke1;

    .line 2
    .line 3
    iget-wide v0, p1, Lcx3;->e:J

    .line 4
    .line 5
    iget-object v2, p1, Lcx3;->a:Landroid/view/View;

    .line 6
    .line 7
    check-cast v2, Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {p0, v3}, Lee1;->t(I)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, p0, Lee1;->u:Lxe2;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    cmp-long v6, v6, v0

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-virtual {p0, v6, v7}, Lee1;->v(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    invoke-virtual {v5, v6, v7}, Lxe2;->g(J)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v5, v0, v1, v3}, Lxe2;->f(JLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    int-to-long v0, p2

    .line 51
    iget-object v3, p0, Lee1;->s:Lxe2;

    .line 52
    .line 53
    invoke-virtual {v3, v0, v1}, Lxe2;->c(J)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-ltz v4, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p0, p2}, Lee1;->r(I)Lkc1;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-object v4, p0, Lee1;->t:Lxe2;

    .line 65
    .line 66
    invoke-virtual {v4, v0, v1}, Lxe2;->b(J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, Ljc1;

    .line 71
    .line 72
    iget-object v5, p2, Lkc1;->F:Lld1;

    .line 73
    .line 74
    if-nez v5, :cond_4

    .line 75
    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    iget-object v4, v4, Ljc1;->n:Landroid/os/Bundle;

    .line 79
    .line 80
    if-eqz v4, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 v4, 0x0

    .line 84
    :goto_0
    iput-object v4, p2, Lkc1;->o:Landroid/os/Bundle;

    .line 85
    .line 86
    invoke-virtual {v3, v0, v1, p2}, Lxe2;->f(JLjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object p2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_3

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lee1;->u(Lke1;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0}, Lee1;->s()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    const-string p0, "Fragment already added"

    .line 105
    .line 106
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 0

    .line 1
    sget p0, Lke1;->u:I

    .line 2
    .line 3
    new-instance p0, Landroid/widget/FrameLayout;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    const/4 p2, -0x1

    .line 15
    invoke-direct {p1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lke1;

    .line 35
    .line 36
    invoke-direct {p1, p0}, Lcx3;-><init>(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final j(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lee1;->v:Lde1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lde1;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, v0, Lde1;->a:Lq80;

    .line 11
    .line 12
    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->p:Lq80;

    .line 13
    .line 14
    iget-object p1, p1, Lq80;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, Lde1;->f:Lee1;

    .line 22
    .line 23
    iget-object v1, v0, Lde1;->b:Lce1;

    .line 24
    .line 25
    iget-object v2, p1, Ldw3;->n:Lew3;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Lee1;->q:Lea2;

    .line 31
    .line 32
    iget-object v1, v0, Lde1;->c:Lvv3;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lea2;->f(Laa2;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, v0, Lde1;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 39
    .line 40
    iput-object p1, p0, Lee1;->v:Lde1;

    .line 41
    .line 42
    return-void
.end method

.method public final bridge synthetic k(Lcx3;)Z
    .locals 0

    .line 1
    check-cast p1, Lke1;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final l(Lcx3;)V
    .locals 0

    .line 1
    check-cast p1, Lke1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lee1;->u(Lke1;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lee1;->s()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n(Lcx3;)V
    .locals 2

    .line 1
    check-cast p1, Lke1;

    .line 2
    .line 3
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lee1;->t(I)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0, v0, v1}, Lee1;->v(J)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lee1;->u:Lxe2;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p0, v0, v1}, Lxe2;->g(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final q(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldw3;->a()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-long v0, p0

    .line 12
    cmp-long p0, p1, v0

    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public abstract r(I)Lkc1;
.end method

.method public final s()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lee1;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, Lee1;->r:Lld1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lld1;->N()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lqi;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lqi;-><init>(I)V

    .line 19
    .line 20
    .line 21
    move v2, v1

    .line 22
    :goto_0
    iget-object v3, p0, Lee1;->s:Lxe2;

    .line 23
    .line 24
    invoke-virtual {v3}, Lxe2;->h()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v5, p0, Lee1;->u:Lxe2;

    .line 29
    .line 30
    if-ge v2, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Lxe2;->e(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-virtual {p0, v3, v4}, Lee1;->q(J)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v0, v6}, Lqi;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v3, v4}, Lxe2;->g(J)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-boolean v2, p0, Lee1;->x:Z

    .line 56
    .line 57
    if-nez v2, :cond_7

    .line 58
    .line 59
    iput-boolean v1, p0, Lee1;->y:Z

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v3}, Lxe2;->h()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v1, v2, :cond_7

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Lxe2;->e(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-virtual {v5, v6, v7}, Lxe2;->c(J)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ltz v2, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {v3, v6, v7}, Lxe2;->b(J)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lkc1;

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    iget-object v2, v2, Lkc1;->T:Landroid/view/View;

    .line 88
    .line 89
    if-nez v2, :cond_5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Lqi;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    new-instance v1, Lki;

    .line 110
    .line 111
    invoke-direct {v1, v0}, Lki;-><init>(Lqi;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    invoke-virtual {v1}, Lki;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_8

    .line 119
    .line 120
    invoke-virtual {v1}, Lki;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Ljava/lang/Long;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    invoke-virtual {p0, v2, v3}, Lee1;->v(J)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_8
    :goto_5
    return-void
.end method

.method public final t(I)Ljava/lang/Long;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, v0

    .line 4
    :goto_0
    iget-object v3, p0, Lee1;->u:Lxe2;

    .line 5
    .line 6
    invoke-virtual {v3}, Lxe2;->h()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    if-ge v1, v4, :cond_2

    .line 11
    .line 12
    invoke-virtual {v3, v1}, Lxe2;->i(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ne v4, p1, :cond_1

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3, v1}, Lxe2;->e(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const-string p0, "Design assumption violated: a ViewHolder can only be bound to one item at a time."

    .line 36
    .line 37
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-object v2
.end method

.method public final u(Lke1;)V
    .locals 8

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    iget-object v1, p0, Lee1;->s:Lxe2;

    .line 4
    .line 5
    iget-wide v2, p1, Lcx3;->e:J

    .line 6
    .line 7
    invoke-virtual {v1, v2, v3}, Lxe2;->b(J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lkc1;

    .line 12
    .line 13
    const-string v2, "Design assumption violated."

    .line 14
    .line 15
    if-eqz v1, :cond_9

    .line 16
    .line 17
    iget-object v3, p1, Lcx3;->a:Landroid/view/View;

    .line 18
    .line 19
    check-cast v3, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    iget-object v4, v1, Lkc1;->T:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-nez v5, :cond_1

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v2}, Lkf2;->o(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v5, p0, Lee1;->r:Lld1;

    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    new-instance p1, Lrf2;

    .line 47
    .line 48
    invoke-direct {p1, p0, v1, v3}, Lrf2;-><init>(Lee1;Lkc1;Landroid/widget/FrameLayout;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v5, Lld1;->n:Lwo0;

    .line 52
    .line 53
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 56
    .line 57
    new-instance v0, Lyc1;

    .line 58
    .line 59
    invoke-direct {v0, p1}, Lyc1;-><init>(Lrf2;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eq p0, v3, :cond_7

    .line 83
    .line 84
    invoke-static {v4, v3}, Lee1;->p(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_4

    .line 93
    .line 94
    invoke-static {v4, v3}, Lee1;->p(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_4
    invoke-virtual {v5}, Lld1;->N()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_6

    .line 103
    .line 104
    new-instance v2, Lrf2;

    .line 105
    .line 106
    invoke-direct {v2, p0, v1, v3}, Lrf2;-><init>(Lee1;Lkc1;Landroid/widget/FrameLayout;)V

    .line 107
    .line 108
    .line 109
    iget-object v3, v5, Lld1;->n:Lwo0;

    .line 110
    .line 111
    iget-object v3, v3, Lwo0;->n:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 114
    .line 115
    new-instance v4, Lyc1;

    .line 116
    .line 117
    invoke-direct {v4, v2}, Lyc1;-><init>(Lrf2;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    iget-object v2, p0, Lee1;->w:Lzh0;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    new-instance v3, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v2, v2, Lzh0;->o:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-nez v4, :cond_5

    .line 146
    .line 147
    const/4 v2, 0x0

    .line 148
    :try_start_0
    invoke-virtual {v1, v2}, Lkc1;->e0(Z)V

    .line 149
    .line 150
    .line 151
    new-instance v4, Lpo;

    .line 152
    .line 153
    invoke-direct {v4, v5}, Lpo;-><init>(Lld1;)V

    .line 154
    .line 155
    .line 156
    new-instance v5, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iget-wide v6, p1, Lcx3;->e:J

    .line 162
    .line 163
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    const/4 v0, 0x1

    .line 171
    invoke-virtual {v4, v2, v1, p1, v0}, Lpo;->g(ILkc1;Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    sget-object p1, Lr92;->q:Lr92;

    .line 175
    .line 176
    invoke-virtual {v4, v1, p1}, Lpo;->k(Lkc1;Lr92;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Lpo;->f()V

    .line 180
    .line 181
    .line 182
    iget-object p0, p0, Lee1;->v:Lde1;

    .line 183
    .line 184
    invoke-virtual {p0, v2}, Lde1;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    .line 186
    .line 187
    invoke-static {v3}, Lzh0;->B(Ljava/util/List;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :catchall_0
    move-exception p0

    .line 192
    invoke-static {v3}, Lzh0;->B(Ljava/util/List;)V

    .line 193
    .line 194
    .line 195
    throw p0

    .line 196
    :cond_5
    invoke-static {v2}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    throw p0

    .line 201
    :cond_6
    iget-boolean v0, v5, Lld1;->I:Z

    .line 202
    .line 203
    if-eqz v0, :cond_8

    .line 204
    .line 205
    :cond_7
    return-void

    .line 206
    :cond_8
    new-instance v0, Ltl0;

    .line 207
    .line 208
    invoke-direct {v0, p0, p1}, Ltl0;-><init>(Lee1;Lke1;)V

    .line 209
    .line 210
    .line 211
    iget-object p0, p0, Lee1;->q:Lea2;

    .line 212
    .line 213
    invoke-virtual {p0, v0}, Lea2;->a(Laa2;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_9
    invoke-static {v2}, Lkf2;->o(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void
.end method

.method public final v(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lee1;->s:Lxe2;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lxe2;->b(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lkc1;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, v1, Lkc1;->T:Landroid/view/View;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    check-cast v2, Landroid/widget/FrameLayout;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0, p1, p2}, Lee1;->q(J)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lee1;->t:Lxe2;

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3, p1, p2}, Lxe2;->g(J)V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, p1, p2}, Lxe2;->g(J)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    iget-object v2, p0, Lee1;->r:Lld1;

    .line 49
    .line 50
    invoke-virtual {v2}, Lld1;->N()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    iput-boolean p1, p0, Lee1;->y:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_4
    invoke-virtual {v1}, Lkc1;->y()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget-object v5, p0, Lee1;->w:Lzh0;

    .line 65
    .line 66
    if-eqz v4, :cond_8

    .line 67
    .line 68
    invoke-virtual {p0, p1, p2}, Lee1;->q(J)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_8

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p0, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v4, v5, Lzh0;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-nez v6, :cond_7

    .line 95
    .line 96
    iget-object v4, v2, Lld1;->c:Lss0;

    .line 97
    .line 98
    iget-object v6, v1, Lkc1;->r:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v4, v4, Lss0;->o:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, Lfe1;

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    if-eqz v4, :cond_6

    .line 112
    .line 113
    iget-object v7, v4, Lfe1;->c:Lkc1;

    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    if-ne v7, v1, :cond_6

    .line 119
    .line 120
    iget v7, v7, Lkc1;->n:I

    .line 121
    .line 122
    const/4 v8, -0x1

    .line 123
    if-le v7, v8, :cond_5

    .line 124
    .line 125
    new-instance v6, Ljc1;

    .line 126
    .line 127
    invoke-virtual {v4}, Lfe1;->o()Landroid/os/Bundle;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-direct {v6, v4}, Ljc1;-><init>(Landroid/os/Bundle;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    invoke-static {p0}, Lzh0;->B(Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, p1, p2, v6}, Lxe2;->f(JLjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    const-string p1, "Fragment "

    .line 144
    .line 145
    const-string p2, " is not currently in the FragmentManager"

    .line 146
    .line 147
    invoke-static {p1, v1, p2}, Lb11;->l(Ljava/lang/String;Lkc1;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, p0}, Lld1;->g0(Ljava/lang/RuntimeException;)V

    .line 155
    .line 156
    .line 157
    throw v6

    .line 158
    :cond_7
    invoke-static {v4}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    throw p0

    .line 163
    :cond_8
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    new-instance p0, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    iget-object v3, v5, Lzh0;->o:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-nez v4, :cond_9

    .line 184
    .line 185
    :try_start_0
    new-instance v3, Lpo;

    .line 186
    .line 187
    invoke-direct {v3, v2}, Lpo;-><init>(Lld1;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v1}, Lpo;->i(Lkc1;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Lpo;->f()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, p1, p2}, Lxe2;->g(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 197
    .line 198
    .line 199
    invoke-static {p0}, Lzh0;->B(Ljava/util/List;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :catchall_0
    move-exception p1

    .line 204
    invoke-static {p0}, Lzh0;->B(Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    throw p1

    .line 208
    :cond_9
    invoke-static {v3}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    throw p0
.end method
