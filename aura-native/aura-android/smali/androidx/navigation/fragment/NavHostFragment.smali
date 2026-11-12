.class public Landroidx/navigation/fragment/NavHostFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final l0:Lrp4;

.field public m0:Landroid/view/View;

.field public n0:I

.field public o0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzf0;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1, p0}, Lzf0;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lrp4;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lrp4;-><init>(Lgf1;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/navigation/fragment/NavHostFragment;->l0:Lrp4;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final E(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lkc1;->E(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    iget-boolean p1, p0, Landroidx/navigation/fragment/NavHostFragment;->o0:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lkc1;->q()Lld1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Lpo;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lpo;-><init>(Lld1;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lpo;->l(Lkc1;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    invoke-virtual {v0, p0}, Lpo;->e(Z)I

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final F(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/navigation/fragment/NavHostFragment;->h0()Lv23;

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "android-support-nav:fragment:defaultHost"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Landroidx/navigation/fragment/NavHostFragment;->o0:Z

    .line 17
    .line 18
    invoke-virtual {p0}, Lkc1;->q()Lld1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v2, Lpo;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lpo;-><init>(Lld1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0}, Lpo;->l(Lkc1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Lpo;->e(Z)I

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p2, Landroidx/fragment/app/FragmentContainerView;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, p1}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    iget p0, p0, Lkc1;->J:I

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 p1, -0x1

    .line 21
    if-eq p0, p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const p0, 0x7f0a040f

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p2, p0}, Landroid/view/View;->setId(I)V

    .line 28
    .line 29
    .line 30
    return-object p2
.end method

.method public final J()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/navigation/fragment/NavHostFragment;->m0:Landroid/view/View;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroidx/navigation/fragment/NavHostFragment;->h0()Lv23;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ne v2, v3, :cond_0

    .line 18
    .line 19
    const v2, 0x7f0a040c

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iput-object v1, p0, Landroidx/navigation/fragment/NavHostFragment;->m0:Landroid/view/View;

    .line 26
    .line 27
    return-void
.end method

.method public final M(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2, p3}, Lkc1;->M(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    sget-object p3, Lrt3;->b:[I

    .line 8
    .line 9
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p3, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iput v1, p0, Landroidx/navigation/fragment/NavHostFragment;->n0:I

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 26
    .line 27
    .line 28
    sget-object p3, Lat3;->c:[I

    .line 29
    .line 30
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    const/4 p2, 0x1

    .line 44
    iput-boolean p2, p0, Landroidx/navigation/fragment/NavHostFragment;->o0:Z

    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final Q(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Landroidx/navigation/fragment/NavHostFragment;->o0:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string p0, "android-support-nav:fragment:defaultHost"

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/navigation/fragment/NavHostFragment;->h0()Lv23;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    const v0, 0x7f0a040c

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast p1, Landroid/view/View;

    .line 32
    .line 33
    iput-object p1, p0, Landroidx/navigation/fragment/NavHostFragment;->m0:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget p2, p0, Lkc1;->J:I

    .line 40
    .line 41
    if-ne p1, p2, :cond_0

    .line 42
    .line 43
    iget-object p1, p0, Landroidx/navigation/fragment/NavHostFragment;->m0:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/navigation/fragment/NavHostFragment;->h0()Lv23;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1, v0, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void

    .line 56
    :cond_1
    const-string p0, "created host view "

    .line 57
    .line 58
    const-string p2, " is not a ViewGroup"

    .line 59
    .line 60
    invoke-static {p1, p2, p0}, Lnz2;->z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final h0()Lv23;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/navigation/fragment/NavHostFragment;->l0:Lrp4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv23;

    .line 8
    .line 9
    return-object p0
.end method
