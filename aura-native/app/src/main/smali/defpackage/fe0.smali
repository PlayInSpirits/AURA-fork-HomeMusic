.class public final Ldefpackage/fe0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroid/view/KeyEvent$Callback;


# direct methods
.method public constructor <init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/fe0;->n:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/fe0;->o:Landroid/view/KeyEvent$Callback;

    return-void
.end method

.method public constructor <init>(Ldefpackage/tj4;Ldefpackage/df;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Ldefpackage/fe0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/fe0;->o:Landroid/view/KeyEvent$Callback;

    .line 8
    .line 9
    return-void
.end method

.method private final a(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/fe0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fe0;->o:Landroid/view/KeyEvent$Callback;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Ldefpackage/go2;->x(Landroid/view/View;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-static {p2}, Ldefpackage/go2;->j(Landroid/view/View;)Landroid/window/SplashScreenView;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ldefpackage/ek2;->k()Landroid/view/WindowInsets$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-static {p2}, Ldefpackage/ek2;->l(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v0, Landroid/graphics/Rect;

    .line 33
    .line 34
    const/high16 v1, -0x80000000

    .line 35
    .line 36
    const v2, 0x7fffffff

    .line 37
    .line 38
    .line 39
    invoke-direct {v0, v1, v1, v2, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Ldefpackage/go2;->i(Landroid/window/SplashScreenView;)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->computeSystemWindowInsets(Landroid/view/WindowInsets;Landroid/graphics/Rect;)Landroid/view/WindowInsets;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p2, p1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    :cond_0
    check-cast p0, Ldefpackage/df;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void

    .line 73
    :pswitch_0
    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 74
    .line 75
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->C:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 76
    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    invoke-interface {p0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewAdded(Landroid/view/View;Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/fe0;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p0, p0, Ldefpackage/fe0;->o:Landroid/view/KeyEvent$Callback;

    .line 8
    .line 9
    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p0, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(I)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->C:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, p1, p2}, Landroid/view/ViewGroup$OnHierarchyChangeListener;->onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
