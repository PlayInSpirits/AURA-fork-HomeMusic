.class public final Ldefpackage/k4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gw0;


# instance fields
.field public final a:Ldefpackage/j4;

.field public final b:Landroidx/drawerlayout/widget/DrawerLayout;

.field public final c:Ldefpackage/dw0;

.field public final d:I

.field public final e:I

.field public f:Z


# direct methods
.method public constructor <init>(Ldefpackage/df;Landroidx/drawerlayout/widget/DrawerLayout;Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/k4;->f:Z

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    new-instance p1, Ldefpackage/c12;

    .line 10
    .line 11
    invoke-direct {p1, p3}, Ldefpackage/c12;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 15
    .line 16
    new-instance p1, Ldefpackage/i4;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, v0, p0}, Ldefpackage/i4;-><init>(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, Ldefpackage/df;->m()Ldefpackage/pf;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ldefpackage/bg;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p3, Ldefpackage/d34;

    .line 38
    .line 39
    const/4 v0, 0x7

    .line 40
    invoke-direct {p3, v0, p1}, Ldefpackage/d34;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object p3, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p3, Ldefpackage/hg3;

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    invoke-direct {p3, v0, p1}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p3, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 53
    .line 54
    :goto_0
    iput-object p2, p0, Ldefpackage/k4;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 55
    .line 56
    const p1, 0x7f130566

    .line 57
    .line 58
    .line 59
    iput p1, p0, Ldefpackage/k4;->d:I

    .line 60
    .line 61
    const p1, 0x7f130565

    .line 62
    .line 63
    .line 64
    iput p1, p0, Ldefpackage/k4;->e:I

    .line 65
    .line 66
    new-instance p1, Ldefpackage/dw0;

    .line 67
    .line 68
    iget-object p2, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 69
    .line 70
    invoke-interface {p2}, Ldefpackage/j4;->h()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-direct {p1, p2}, Ldefpackage/dw0;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Ldefpackage/k4;->c:Ldefpackage/dw0;

    .line 78
    .line 79
    iget-object p0, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 80
    .line 81
    invoke-interface {p0}, Ldefpackage/j4;->t()Landroid/graphics/drawable/Drawable;

    .line 82
    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1, p1}, Ljava/lang/Math;->max(FF)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Ldefpackage/k4;->d(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 0

    .line 1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/k4;->d(F)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Ldefpackage/k4;->e:I

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 9
    .line 10
    invoke-interface {p0, p1}, Ldefpackage/j4;->u(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Ldefpackage/k4;->d(F)V

    .line 3
    .line 4
    .line 5
    iget p1, p0, Ldefpackage/k4;->d:I

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ldefpackage/j4;->u(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final d(F)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/k4;->c:Ldefpackage/dw0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Ldefpackage/dw0;->i:Z

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    iput-boolean v1, p0, Ldefpackage/dw0;->i:Z

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    cmpl-float v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Ldefpackage/dw0;->i:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Ldefpackage/dw0;->i:Z

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ldefpackage/dw0;->setProgress(F)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/k4;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 2
    .line 3
    const v1, 0x800003

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Landroidx/drawerlayout/widget/DrawerLayout;->m(Landroid/view/View;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v3

    .line 19
    :goto_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Ldefpackage/k4;->d(F)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p0, v2}, Ldefpackage/k4;->d(F)V

    .line 29
    .line 30
    .line 31
    :goto_1
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-static {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->m(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :cond_2
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget v0, p0, Ldefpackage/k4;->e:I

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    iget v0, p0, Ldefpackage/k4;->d:I

    .line 47
    .line 48
    :goto_2
    iget-boolean v1, p0, Ldefpackage/k4;->f:Z

    .line 49
    .line 50
    iget-object v2, p0, Ldefpackage/k4;->a:Ldefpackage/j4;

    .line 51
    .line 52
    if-nez v1, :cond_4

    .line 53
    .line 54
    invoke-interface {v2}, Ldefpackage/j4;->e()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_4

    .line 59
    .line 60
    const-string v1, "ActionBarDrawerToggle"

    .line 61
    .line 62
    const-string v3, "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"

    .line 63
    .line 64
    invoke-static {v1, v3}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    iput-boolean v1, p0, Ldefpackage/k4;->f:Z

    .line 69
    .line 70
    :cond_4
    iget-object p0, p0, Ldefpackage/k4;->c:Ldefpackage/dw0;

    .line 71
    .line 72
    invoke-interface {v2, p0, v0}, Ldefpackage/j4;->q(Landroid/graphics/drawable/Drawable;I)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
