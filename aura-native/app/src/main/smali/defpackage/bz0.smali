.class public Ldefpackage/bz0;
.super Ldefpackage/az0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public b(Ldefpackage/up4;Ldefpackage/up4;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p3, p0}, Ldefpackage/l93;->d0(Landroid/view/Window;Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {p3}, Ldefpackage/kz;->p(Landroid/view/Window;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3}, Ldefpackage/kz;->x(Landroid/view/Window;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Ldefpackage/om1;

    .line 30
    .line 31
    invoke-direct {p0, p4}, Ldefpackage/om1;-><init>(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 35
    .line 36
    const/16 p2, 0x23

    .line 37
    .line 38
    if-lt p1, p2, :cond_0

    .line 39
    .line 40
    new-instance p1, Ldefpackage/tb5;

    .line 41
    .line 42
    invoke-direct {p1, p3, p0}, Ldefpackage/sb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/16 p2, 0x1e

    .line 47
    .line 48
    if-lt p1, p2, :cond_1

    .line 49
    .line 50
    new-instance p1, Ldefpackage/sb5;

    .line 51
    .line 52
    invoke-direct {p1, p3, p0}, Ldefpackage/sb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/16 p2, 0x1a

    .line 57
    .line 58
    if-lt p1, p2, :cond_2

    .line 59
    .line 60
    new-instance p1, Ldefpackage/rb5;

    .line 61
    .line 62
    invoke-direct {p1, p3, p0}, Ldefpackage/qb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    new-instance p1, Ldefpackage/qb5;

    .line 67
    .line 68
    invoke-direct {p1, p3, p0}, Ldefpackage/qb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    xor-int/lit8 p0, p5, 0x1

    .line 72
    .line 73
    invoke-virtual {p1, p0}, Ldefpackage/su3;->D(Z)V

    .line 74
    .line 75
    .line 76
    xor-int/lit8 p0, p6, 0x1

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Ldefpackage/su3;->C(Z)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
