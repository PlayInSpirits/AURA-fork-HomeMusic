.class public final Ldefpackage/cv4;
.super Ldefpackage/l93;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final d:Ldefpackage/gv4;

.field public final e:Landroid/view/Window$Callback;

.field public final f:Ldefpackage/om1;

.field public g:Z

.field public h:Z

.field public i:Z

.field public final j:Ljava/util/ArrayList;

.field public final k:Ldefpackage/wu4;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Ldefpackage/xf;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Ldefpackage/cv4;->j:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ldefpackage/wu4;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1, p0}, Ldefpackage/wu4;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ldefpackage/cv4;->k:Ldefpackage/wu4;

    .line 18
    .line 19
    new-instance v0, Ldefpackage/rm2;

    .line 20
    .line 21
    const/16 v1, 0x19

    .line 22
    .line 23
    invoke-direct {v0, v1, p0}, Ldefpackage/rm2;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v1, Ldefpackage/gv4;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, p1, v2}, Ldefpackage/gv4;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iput-object p3, p0, Ldefpackage/cv4;->e:Landroid/view/Window$Callback;

    .line 41
    .line 42
    iput-object p3, v1, Ldefpackage/gv4;->k:Landroid/view/Window$Callback;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Ldefpackage/av4;)V

    .line 45
    .line 46
    .line 47
    iget-boolean p3, v1, Ldefpackage/gv4;->g:Z

    .line 48
    .line 49
    if-nez p3, :cond_0

    .line 50
    .line 51
    iput-object p2, v1, Ldefpackage/gv4;->h:Ljava/lang/CharSequence;

    .line 52
    .line 53
    iget p3, v1, Ldefpackage/gv4;->b:I

    .line 54
    .line 55
    and-int/lit8 p3, p3, 0x8

    .line 56
    .line 57
    if-eqz p3, :cond_0

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    iget-boolean p3, v1, Ldefpackage/gv4;->g:Z

    .line 63
    .line 64
    if-eqz p3, :cond_0

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p1, p2}, Ldefpackage/j65;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    new-instance p1, Ldefpackage/om1;

    .line 74
    .line 75
    const/16 p2, 0x1d

    .line 76
    .line 77
    invoke-direct {p1, p2, p0}, Ldefpackage/om1;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Ldefpackage/cv4;->f:Ldefpackage/om1;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final D(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/cv4;->i:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Ldefpackage/cv4;->i:Z

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/cv4;->j:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-gtz p1, :cond_1

    .line 15
    .line 16
    :goto_0
    return-void

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final I()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/gv4;->b:I

    .line 4
    .line 5
    return p0
.end method

.method public final J()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final L()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cv4;->k:Ldefpackage/wu4;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final N()V
    .locals 0

    .line 1
    return-void
.end method

.method public final O()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cv4;->k:Ldefpackage/wu4;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final P(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/cv4;->u0()Landroid/view/Menu;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eq v1, v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v0

    .line 25
    :goto_0
    invoke-interface {p0, v2}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1, p2, v0}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_1
    return v0
.end method

.method public final Q(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/cv4;->R()Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return v0
.end method

.method public final R()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->v()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final e0(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f0(Z)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget p1, p0, Ldefpackage/gv4;->b:I

    .line 4
    .line 5
    and-int/lit8 p1, p1, -0x5

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    or-int/2addr p1, v0

    .line 9
    invoke-virtual {p0, p1}, Ldefpackage/gv4;->a(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/gv4;->b:I

    .line 4
    .line 5
    and-int/lit8 v0, v0, -0x3

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    or-int/2addr v0, v1

    .line 9
    invoke-virtual {p0, v0}, Ldefpackage/gv4;->a(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final h0(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/gv4;->b(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i0(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/gv4;->f:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/gv4;->b:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Ldefpackage/gv4;->o:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    invoke-virtual {v1, p0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final j0(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 3
    .line 4
    iput-boolean v0, p0, Ldefpackage/gv4;->g:Z

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/gv4;->h:Ljava/lang/CharSequence;

    .line 9
    .line 10
    iget v1, p0, Ldefpackage/gv4;->b:I

    .line 11
    .line 12
    and-int/lit8 v1, v1, 0x8

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p0, p0, Ldefpackage/gv4;->g:Z

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0, p1}, Ldefpackage/j65;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final l0(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/gv4;->g:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/gv4;->h:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget v1, p0, Ldefpackage/gv4;->b:I

    .line 12
    .line 13
    and-int/lit8 v1, v1, 0x8

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    iget-boolean p0, p0, Ldefpackage/gv4;->g:Z

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, p1}, Ldefpackage/j65;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->n:Landroidx/appcompat/widget/ActionMenuView;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->G:Ldefpackage/y4;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/y4;->f()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->c0:Ldefpackage/yu4;

    .line 6
    .line 7
    if-eqz p0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/yu4;->o:Ldefpackage/tu2;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ldefpackage/tu2;->collapseActionView()Z

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_2
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final u0()Landroid/view/Menu;
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/cv4;->h:Z

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/cv4;->d:Ldefpackage/gv4;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Ldefpackage/xk0;

    .line 8
    .line 9
    const/16 v2, 0x9

    .line 10
    .line 11
    invoke-direct {v0, v2, p0}, Ldefpackage/xk0;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ldefpackage/si1;

    .line 15
    .line 16
    const/16 v3, 0x1c

    .line 17
    .line 18
    invoke-direct {v2, v3, p0}, Ldefpackage/si1;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v1, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 22
    .line 23
    iput-object v0, v3, Landroidx/appcompat/widget/Toolbar;->d0:Ldefpackage/xk0;

    .line 24
    .line 25
    iput-object v2, v3, Landroidx/appcompat/widget/Toolbar;->e0:Ldefpackage/si1;

    .line 26
    .line 27
    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->n:Landroidx/appcompat/widget/ActionMenuView;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    iput-object v0, v3, Landroidx/appcompat/widget/ActionMenuView;->H:Ldefpackage/xk0;

    .line 32
    .line 33
    iput-object v2, v3, Landroidx/appcompat/widget/ActionMenuView;->I:Ldefpackage/ou2;

    .line 34
    .line 35
    :cond_0
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Ldefpackage/cv4;->h:Z

    .line 37
    .line 38
    :cond_1
    iget-object p0, v1, Ldefpackage/gv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
