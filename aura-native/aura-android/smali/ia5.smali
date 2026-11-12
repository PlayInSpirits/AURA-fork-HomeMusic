.class public final Lia5;
.super Ll93;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ln4;


# static fields
.field public static final B:Landroid/view/animation/AccelerateInterpolator;

.field public static final C:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field public final A:Loz4;

.field public d:Landroid/content/Context;

.field public e:Landroid/content/Context;

.field public f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public g:Landroidx/appcompat/widget/ActionBarContainer;

.field public h:Lfj0;

.field public i:Landroidx/appcompat/widget/ActionBarContextView;

.field public final j:Landroid/view/View;

.field public k:Z

.field public l:Lha5;

.field public m:Lha5;

.field public n:Lrm3;

.field public o:Z

.field public final p:Ljava/util/ArrayList;

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Lt75;

.field public w:Z

.field public x:Z

.field public final y:Lga5;

.field public final z:Lga5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lia5;->B:Landroid/view/animation/AccelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lia5;->C:Landroid/view/animation/DecelerateInterpolator;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
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
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lia5;->p:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lia5;->q:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    iput-boolean v1, p0, Lia5;->r:Z

    .line 21
    .line 22
    iput-boolean v1, p0, Lia5;->u:Z

    .line 23
    .line 24
    new-instance v2, Lga5;

    .line 25
    .line 26
    invoke-direct {v2, p0, v0}, Lga5;-><init>(Lia5;I)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lia5;->y:Lga5;

    .line 30
    .line 31
    new-instance v0, Lga5;

    .line 32
    .line 33
    invoke-direct {v0, p0, v1}, Lga5;-><init>(Lia5;I)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lia5;->z:Lga5;

    .line 37
    .line 38
    new-instance v0, Loz4;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Loz4;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lia5;->A:Loz4;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, p1}, Lia5;->v0(Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    if-nez p2, :cond_0

    .line 57
    .line 58
    const p2, 0x1020002

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lia5;->j:Landroid/view/View;

    .line 66
    .line 67
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lia5;->p:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Lia5;->q:I

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Lia5;->r:Z

    .line 73
    iput-boolean v0, p0, Lia5;->u:Z

    .line 74
    new-instance v0, Lga5;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lga5;-><init>(Lia5;I)V

    iput-object v0, p0, Lia5;->y:Lga5;

    .line 75
    new-instance v0, Lga5;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lga5;-><init>(Lia5;I)V

    iput-object v0, p0, Lia5;->z:Lga5;

    .line 76
    new-instance v0, Loz4;

    invoke-direct {v0, p0}, Loz4;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lia5;->A:Loz4;

    .line 77
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lia5;->v0(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final D(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lia5;->o:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput-boolean p1, p0, Lia5;->o:Z

    .line 7
    .line 8
    iget-object p0, p0, Lia5;->p:Ljava/util/ArrayList;

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
    invoke-static {}, Lkf2;->k()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final I()I
    .locals 0

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    check-cast p0, Lgv4;

    .line 4
    .line 5
    iget p0, p0, Lgv4;->b:I

    .line 6
    .line 7
    return p0
.end method

.method public final J()Landroid/content/Context;
    .locals 4

    .line 1
    iget-object v0, p0, Lia5;->e:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Lia5;->d:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x7f04000d

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 21
    .line 22
    .line 23
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 28
    .line 29
    iget-object v2, p0, Lia5;->d:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lia5;->e:Landroid/content/Context;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lia5;->d:Landroid/content/Context;

    .line 38
    .line 39
    iput-object v0, p0, Lia5;->e:Landroid/content/Context;

    .line 40
    .line 41
    :cond_1
    :goto_0
    iget-object p0, p0, Lia5;->e:Landroid/content/Context;

    .line 42
    .line 43
    return-object p0
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, Lia5;->d:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/high16 v1, 0x7f050000

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lia5;->w0(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final P(ILandroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    iget-object p0, p0, Lia5;->l:Lha5;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object p0, p0, Lha5;->q:Lqu2;

    .line 8
    .line 9
    if-eqz p0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v2, v0

    .line 28
    :goto_0
    invoke-virtual {p0, v2}, Lqu2;->setQwertyMode(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1, p2, v0}, Lqu2;->performShortcut(ILandroid/view/KeyEvent;I)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_1
    return v0
.end method

.method public final e0(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lia5;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lia5;->f0(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final f0(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    move p1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iget-object v1, p0, Lia5;->h:Lfj0;

    .line 8
    .line 9
    check-cast v1, Lgv4;

    .line 10
    .line 11
    iget v2, v1, Lgv4;->b:I

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    iput-boolean v3, p0, Lia5;->k:Z

    .line 15
    .line 16
    and-int/lit8 p0, p1, 0x4

    .line 17
    .line 18
    and-int/lit8 p1, v2, -0x5

    .line 19
    .line 20
    or-int/2addr p0, p1

    .line 21
    invoke-virtual {v1, p0}, Lgv4;->a(I)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    check-cast p0, Lgv4;

    .line 4
    .line 5
    iget v0, p0, Lgv4;->b:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, -0x3

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    or-int/2addr v0, v1

    .line 11
    invoke-virtual {p0, v0}, Lgv4;->a(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h0(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    check-cast p0, Lgv4;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lgv4;->b(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final i0(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    check-cast p0, Lgv4;

    .line 4
    .line 5
    iput-object p1, p0, Lgv4;->f:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    iget v0, p0, Lgv4;->b:I

    .line 8
    .line 9
    and-int/lit8 v0, v0, 0x4

    .line 10
    .line 11
    iget-object v1, p0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Lgv4;->o:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    invoke-virtual {v1, p0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final j0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lia5;->w:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lia5;->v:Lt75;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lt75;->a()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    check-cast p0, Lgv4;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lgv4;->g:Z

    .line 7
    .line 8
    iget-object v0, p0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iput-object p1, p0, Lgv4;->h:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iget v1, p0, Lgv4;->b:I

    .line 13
    .line 14
    and-int/lit8 v1, v1, 0x8

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p0, p0, Lgv4;->g:Z

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0, p1}, Lj65;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final l0(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    check-cast p0, Lgv4;

    .line 4
    .line 5
    iget-boolean v0, p0, Lgv4;->g:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 10
    .line 11
    iput-object p1, p0, Lgv4;->h:Ljava/lang/CharSequence;

    .line 12
    .line 13
    iget v1, p0, Lgv4;->b:I

    .line 14
    .line 15
    and-int/lit8 v1, v1, 0x8

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget-boolean p0, p0, Lgv4;->g:Z

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0, p1}, Lj65;->p(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final n0(Lrm3;)Ld5;
    .locals 2

    .line 1
    iget-object v0, p0, Lia5;->l:Lha5;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lha5;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lha5;

    .line 20
    .line 21
    iget-object v1, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-direct {v0, p0, v1, p1}, Lha5;-><init>(Lia5;Landroid/content/Context;Lrm3;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v0, Lha5;->q:Lqu2;

    .line 31
    .line 32
    invoke-virtual {p1}, Lqu2;->y()V

    .line 33
    .line 34
    .line 35
    :try_start_0
    iget-object v1, v0, Lha5;->r:Lrm3;

    .line 36
    .line 37
    iget-object v1, v1, Lrm3;->n:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lbq4;

    .line 40
    .line 41
    invoke-virtual {v1, v0, p1}, Lbq4;->s(Ld5;Landroid/view/Menu;)Z

    .line 42
    .line 43
    .line 44
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    invoke-virtual {p1}, Lqu2;->x()V

    .line 46
    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iput-object v0, p0, Lia5;->l:Lha5;

    .line 51
    .line 52
    invoke-virtual {v0}, Lha5;->g()V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->c(Ld5;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    invoke-virtual {p0, p1}, Lia5;->u0(Z)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_1
    const/4 p0, 0x0

    .line 66
    return-object p0

    .line 67
    :catchall_0
    move-exception p0

    .line 68
    invoke-virtual {p1}, Lqu2;->x()V

    .line 69
    .line 70
    .line 71
    throw p0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lia5;->h:Lfj0;

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lgv4;

    .line 7
    .line 8
    iget-object v0, v0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->c0:Lyu4;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v0, v0, Lyu4;->o:Ltu2;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p0, Lgv4;

    .line 19
    .line 20
    iget-object p0, p0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/appcompat/widget/Toolbar;->c0:Lyu4;

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p0, p0, Lyu4;->o:Ltu2;

    .line 29
    .line 30
    :goto_0
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Ltu2;->collapseActionView()Z

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public final u0(Z)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lia5;->t:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lia5;->t:Z

    .line 10
    .line 11
    iget-object v2, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Lia5;->x0(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    if-eqz v0, :cond_3

    .line 23
    .line 24
    iput-boolean v1, p0, Lia5;->t:Z

    .line 25
    .line 26
    iget-object v0, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    .line 31
    .line 32
    .line 33
    :cond_2
    invoke-virtual {p0, v1}, Lia5;->x0(Z)V

    .line 34
    .line 35
    .line 36
    :cond_3
    :goto_0
    iget-object v0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, Lia5;->h:Lfj0;

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    const-wide/16 v5, 0xc8

    .line 50
    .line 51
    const-wide/16 v7, 0x64

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    check-cast v2, Lgv4;

    .line 56
    .line 57
    iget-object p1, v2, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 58
    .line 59
    invoke-static {p1}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-virtual {p1, v0}, Ls75;->a(F)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v7, v8}, Ls75;->c(J)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lfv4;

    .line 71
    .line 72
    invoke-direct {v0, v2, v4}, Lfv4;-><init>(Lgv4;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ls75;->d(Lu75;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 79
    .line 80
    invoke-virtual {p0, v1, v5, v6}, Landroidx/appcompat/widget/ActionBarContextView;->i(IJ)Ls75;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    check-cast v2, Lgv4;

    .line 86
    .line 87
    iget-object p1, v2, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 88
    .line 89
    invoke-static {p1}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/high16 v0, 0x3f800000    # 1.0f

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Ls75;->a(F)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v5, v6}, Ls75;->c(J)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Lfv4;

    .line 102
    .line 103
    invoke-direct {v0, v2, v1}, Lfv4;-><init>(Lgv4;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ls75;->d(Lu75;)V

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 110
    .line 111
    invoke-virtual {p0, v3, v7, v8}, Landroidx/appcompat/widget/ActionBarContextView;->i(IJ)Ls75;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    move-object v9, p1

    .line 116
    move-object p1, p0

    .line 117
    move-object p0, v9

    .line 118
    :goto_1
    new-instance v0, Lt75;

    .line 119
    .line 120
    invoke-direct {v0}, Lt75;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v1, v0, Lt75;->a:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    iget-object p1, p1, Ls75;->a:Ljava/lang/ref/WeakReference;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, Landroid/view/View;

    .line 135
    .line 136
    if-eqz p1, :cond_5

    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    .line 143
    .line 144
    .line 145
    move-result-wide v2

    .line 146
    goto :goto_2

    .line 147
    :cond_5
    const-wide/16 v2, 0x0

    .line 148
    .line 149
    :goto_2
    iget-object p1, p0, Ls75;->a:Ljava/lang/ref/WeakReference;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Landroid/view/View;

    .line 156
    .line 157
    if-eqz p1, :cond_6

    .line 158
    .line 159
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 164
    .line 165
    .line 166
    :cond_6
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lt75;->b()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_7
    if-eqz p1, :cond_8

    .line 174
    .line 175
    check-cast v2, Lgv4;

    .line 176
    .line 177
    iget-object p1, v2, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 178
    .line 179
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 180
    .line 181
    .line 182
    iget-object p0, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 183
    .line 184
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_8
    check-cast v2, Lgv4;

    .line 189
    .line 190
    iget-object p1, v2, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 191
    .line 192
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 196
    .line 197
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public final v0(Landroid/view/View;)V
    .locals 6

    .line 1
    const v0, 0x7f0a019a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 9
    .line 10
    iput-object v0, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(Ln4;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const v0, 0x7f0a0040

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Lfj0;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Lfj0;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    .line 32
    .line 33
    if-eqz v1, :cond_8

    .line 34
    .line 35
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lfj0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    iput-object v0, p0, Lia5;->h:Lfj0;

    .line 42
    .line 43
    const v0, 0x7f0a0048

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 51
    .line 52
    iput-object v0, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 53
    .line 54
    const v0, 0x7f0a0042

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    .line 62
    .line 63
    iput-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 64
    .line 65
    iget-object v0, p0, Lia5;->h:Lfj0;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    iget-object v1, p0, Lia5;->i:Landroidx/appcompat/widget/ActionBarContextView;

    .line 70
    .line 71
    if-eqz v1, :cond_7

    .line 72
    .line 73
    if-eqz p1, :cond_7

    .line 74
    .line 75
    check-cast v0, Lgv4;

    .line 76
    .line 77
    iget-object p1, v0, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, p0, Lia5;->d:Landroid/content/Context;

    .line 84
    .line 85
    iget-object v0, p0, Lia5;->h:Lfj0;

    .line 86
    .line 87
    check-cast v0, Lgv4;

    .line 88
    .line 89
    iget v0, v0, Lgv4;->b:I

    .line 90
    .line 91
    and-int/lit8 v0, v0, 0x4

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    const/4 v2, 0x0

    .line 95
    if-eqz v0, :cond_2

    .line 96
    .line 97
    move v0, v1

    .line 98
    goto :goto_1

    .line 99
    :cond_2
    move v0, v2

    .line 100
    :goto_1
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iput-boolean v1, p0, Lia5;->k:Z

    .line 103
    .line 104
    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 109
    .line 110
    const/16 v4, 0xe

    .line 111
    .line 112
    iget-object v0, p0, Lia5;->h:Lfj0;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const/high16 v0, 0x7f050000

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {p0, p1}, Lia5;->w0(Z)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p0, Lia5;->d:Landroid/content/Context;

    .line 131
    .line 132
    sget-object v0, Lst3;->a:[I

    .line 133
    .line 134
    const v3, 0x7f040008

    .line 135
    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-virtual {p1, v5, v0, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    iget-object v0, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 149
    .line 150
    iget-boolean v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->t:Z

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    iput-boolean v1, p0, Lia5;->x:Z

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    const-string p0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    .line 161
    .line 162
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_5
    :goto_2
    const/16 v0, 0xc

    .line 167
    .line 168
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_6

    .line 173
    .line 174
    int-to-float v0, v0

    .line 175
    iget-object p0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 176
    .line 177
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 178
    .line 179
    invoke-virtual {p0, v0}, Landroid/view/View;->setElevation(F)V

    .line 180
    .line 181
    .line 182
    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_7
    const-class p0, Lia5;

    .line 187
    .line 188
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    const-string p1, " can only be used with a compatible window decor layout"

    .line 193
    .line 194
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 203
    .line 204
    if-eqz v0, :cond_9

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    goto :goto_3

    .line 215
    :cond_9
    const-string p1, "null"

    .line 216
    .line 217
    :goto_3
    const-string v0, "Can\'t make a decor toolbar out of "

    .line 218
    .line 219
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p0
.end method

.method public final w0(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lia5;->h:Lfj0;

    .line 5
    .line 6
    check-cast p1, Lgv4;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lh74;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lh74;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lia5;->h:Lfj0;

    .line 23
    .line 24
    check-cast p1, Lgv4;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, p0, Lia5;->h:Lfj0;

    .line 30
    .line 31
    check-cast p1, Lgv4;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, Lgv4;->a:Landroidx/appcompat/widget/Toolbar;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final x0(Z)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lia5;->s:Z

    .line 2
    .line 3
    iget-boolean v1, p0, Lia5;->t:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move v0, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    move v0, v2

    .line 15
    :goto_1
    iget-boolean v1, p0, Lia5;->u:Z

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    const-wide/16 v5, 0xfa

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/high16 v8, 0x3f800000    # 1.0f

    .line 22
    .line 23
    iget-object v9, p0, Lia5;->A:Loz4;

    .line 24
    .line 25
    iget-object v10, p0, Lia5;->j:Landroid/view/View;

    .line 26
    .line 27
    if-eqz v0, :cond_e

    .line 28
    .line 29
    if-nez v1, :cond_1a

    .line 30
    .line 31
    iput-boolean v2, p0, Lia5;->u:Z

    .line 32
    .line 33
    iget-object v0, p0, Lia5;->v:Lt75;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Lt75;->a()V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget v0, p0, Lia5;->q:I

    .line 46
    .line 47
    iget-object v1, p0, Lia5;->z:Lga5;

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    if-nez v0, :cond_c

    .line 51
    .line 52
    iget-boolean v0, p0, Lia5;->w:Z

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    if-eqz p1, :cond_c

    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 59
    .line 60
    invoke-virtual {v0, v11}, Landroid/view/View;->setTranslationY(F)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    neg-int v0, v0

    .line 70
    int-to-float v0, v0

    .line 71
    if-eqz p1, :cond_4

    .line 72
    .line 73
    filled-new-array {v3, v3}, [I

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v3, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 78
    .line 79
    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 80
    .line 81
    .line 82
    aget p1, p1, v2

    .line 83
    .line 84
    int-to-float p1, p1

    .line 85
    sub-float/2addr v0, p1

    .line 86
    :cond_4
    iget-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Lt75;

    .line 92
    .line 93
    invoke-direct {p1}, Lt75;-><init>()V

    .line 94
    .line 95
    .line 96
    iget-object v2, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 97
    .line 98
    invoke-static {v2}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2, v11}, Ls75;->e(F)V

    .line 103
    .line 104
    .line 105
    iget-object v3, v2, Ls75;->a:Ljava/lang/ref/WeakReference;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    check-cast v3, Landroid/view/View;

    .line 112
    .line 113
    if-eqz v3, :cond_6

    .line 114
    .line 115
    if-eqz v9, :cond_5

    .line 116
    .line 117
    new-instance v7, Lxe;

    .line 118
    .line 119
    invoke-direct {v7, v4, v9, v3}, Lxe;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v3, v7}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 127
    .line 128
    .line 129
    :cond_6
    iget-boolean v3, p1, Lt75;->e:Z

    .line 130
    .line 131
    iget-object v4, p1, Lt75;->a:Ljava/util/ArrayList;

    .line 132
    .line 133
    if-nez v3, :cond_7

    .line 134
    .line 135
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_7
    iget-boolean v2, p0, Lia5;->r:Z

    .line 139
    .line 140
    if-eqz v2, :cond_8

    .line 141
    .line 142
    if-eqz v10, :cond_8

    .line 143
    .line 144
    invoke-virtual {v10, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 145
    .line 146
    .line 147
    invoke-static {v10}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v0, v11}, Ls75;->e(F)V

    .line 152
    .line 153
    .line 154
    iget-boolean v2, p1, Lt75;->e:Z

    .line 155
    .line 156
    if-nez v2, :cond_8

    .line 157
    .line 158
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :cond_8
    iget-boolean v0, p1, Lt75;->e:Z

    .line 162
    .line 163
    if-nez v0, :cond_9

    .line 164
    .line 165
    sget-object v2, Lia5;->C:Landroid/view/animation/DecelerateInterpolator;

    .line 166
    .line 167
    iput-object v2, p1, Lt75;->c:Landroid/view/animation/Interpolator;

    .line 168
    .line 169
    :cond_9
    if-nez v0, :cond_a

    .line 170
    .line 171
    iput-wide v5, p1, Lt75;->b:J

    .line 172
    .line 173
    :cond_a
    if-nez v0, :cond_b

    .line 174
    .line 175
    iput-object v1, p1, Lt75;->d:Lu75;

    .line 176
    .line 177
    :cond_b
    iput-object p1, p0, Lia5;->v:Lt75;

    .line 178
    .line 179
    invoke-virtual {p1}, Lt75;->b()V

    .line 180
    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_c
    iget-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 184
    .line 185
    invoke-virtual {p1, v8}, Landroid/view/View;->setAlpha(F)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 189
    .line 190
    invoke-virtual {p1, v11}, Landroid/view/View;->setTranslationY(F)V

    .line 191
    .line 192
    .line 193
    iget-boolean p1, p0, Lia5;->r:Z

    .line 194
    .line 195
    if-eqz p1, :cond_d

    .line 196
    .line 197
    if-eqz v10, :cond_d

    .line 198
    .line 199
    invoke-virtual {v10, v11}, Landroid/view/View;->setTranslationY(F)V

    .line 200
    .line 201
    .line 202
    :cond_d
    invoke-virtual {v1}, Lga5;->c()V

    .line 203
    .line 204
    .line 205
    :goto_2
    iget-object p0, p0, Lia5;->f:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 206
    .line 207
    if-eqz p0, :cond_1a

    .line 208
    .line 209
    sget-object p1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_e
    if-eqz v1, :cond_1a

    .line 216
    .line 217
    iput-boolean v3, p0, Lia5;->u:Z

    .line 218
    .line 219
    iget-object v0, p0, Lia5;->v:Lt75;

    .line 220
    .line 221
    if-eqz v0, :cond_f

    .line 222
    .line 223
    invoke-virtual {v0}, Lt75;->a()V

    .line 224
    .line 225
    .line 226
    :cond_f
    iget v0, p0, Lia5;->q:I

    .line 227
    .line 228
    iget-object v1, p0, Lia5;->y:Lga5;

    .line 229
    .line 230
    if-nez v0, :cond_19

    .line 231
    .line 232
    iget-boolean v0, p0, Lia5;->w:Z

    .line 233
    .line 234
    if-nez v0, :cond_10

    .line 235
    .line 236
    if-eqz p1, :cond_19

    .line 237
    .line 238
    :cond_10
    iget-object v0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 239
    .line 240
    invoke-virtual {v0, v8}, Landroid/view/View;->setAlpha(F)V

    .line 241
    .line 242
    .line 243
    iget-object v0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 244
    .line 245
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 246
    .line 247
    .line 248
    new-instance v0, Lt75;

    .line 249
    .line 250
    invoke-direct {v0}, Lt75;-><init>()V

    .line 251
    .line 252
    .line 253
    iget-object v8, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 254
    .line 255
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 256
    .line 257
    .line 258
    move-result v8

    .line 259
    neg-int v8, v8

    .line 260
    int-to-float v8, v8

    .line 261
    if-eqz p1, :cond_11

    .line 262
    .line 263
    filled-new-array {v3, v3}, [I

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iget-object v3, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 268
    .line 269
    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 270
    .line 271
    .line 272
    aget p1, p1, v2

    .line 273
    .line 274
    int-to-float p1, p1

    .line 275
    sub-float/2addr v8, p1

    .line 276
    :cond_11
    iget-object p1, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 277
    .line 278
    invoke-static {p1}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p1, v8}, Ls75;->e(F)V

    .line 283
    .line 284
    .line 285
    iget-object v2, p1, Ls75;->a:Ljava/lang/ref/WeakReference;

    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    check-cast v2, Landroid/view/View;

    .line 292
    .line 293
    if-eqz v2, :cond_13

    .line 294
    .line 295
    if-eqz v9, :cond_12

    .line 296
    .line 297
    new-instance v7, Lxe;

    .line 298
    .line 299
    invoke-direct {v7, v4, v9, v2}, Lxe;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    :cond_12
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v2, v7}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    .line 307
    .line 308
    .line 309
    :cond_13
    iget-boolean v2, v0, Lt75;->e:Z

    .line 310
    .line 311
    iget-object v3, v0, Lt75;->a:Ljava/util/ArrayList;

    .line 312
    .line 313
    if-nez v2, :cond_14

    .line 314
    .line 315
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    :cond_14
    iget-boolean p1, p0, Lia5;->r:Z

    .line 319
    .line 320
    if-eqz p1, :cond_15

    .line 321
    .line 322
    if-eqz v10, :cond_15

    .line 323
    .line 324
    invoke-static {v10}, Lj65;->a(Landroid/view/View;)Ls75;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p1, v8}, Ls75;->e(F)V

    .line 329
    .line 330
    .line 331
    iget-boolean v2, v0, Lt75;->e:Z

    .line 332
    .line 333
    if-nez v2, :cond_15

    .line 334
    .line 335
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    :cond_15
    iget-boolean p1, v0, Lt75;->e:Z

    .line 339
    .line 340
    if-nez p1, :cond_16

    .line 341
    .line 342
    sget-object v2, Lia5;->B:Landroid/view/animation/AccelerateInterpolator;

    .line 343
    .line 344
    iput-object v2, v0, Lt75;->c:Landroid/view/animation/Interpolator;

    .line 345
    .line 346
    :cond_16
    if-nez p1, :cond_17

    .line 347
    .line 348
    iput-wide v5, v0, Lt75;->b:J

    .line 349
    .line 350
    :cond_17
    if-nez p1, :cond_18

    .line 351
    .line 352
    iput-object v1, v0, Lt75;->d:Lu75;

    .line 353
    .line 354
    :cond_18
    iput-object v0, p0, Lia5;->v:Lt75;

    .line 355
    .line 356
    invoke-virtual {v0}, Lt75;->b()V

    .line 357
    .line 358
    .line 359
    return-void

    .line 360
    :cond_19
    invoke-virtual {v1}, Lga5;->c()V

    .line 361
    .line 362
    .line 363
    :cond_1a
    return-void
.end method
