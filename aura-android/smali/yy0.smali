.class public final Lyy0;
.super Lez0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public b(Lup4;Lup4;Landroid/view/Window;Landroid/view/View;ZZ)V
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
    invoke-static {p3, p0}, Ll93;->d0(Landroid/view/Window;Z)V

    .line 15
    .line 16
    .line 17
    if-eqz p5, :cond_0

    .line 18
    .line 19
    iget p0, p1, Lup4;->b:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget p0, p1, Lup4;->a:I

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p3, p0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 25
    .line 26
    .line 27
    iget p0, p2, Lup4;->b:I

    .line 28
    .line 29
    invoke-virtual {p3, p0}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 30
    .line 31
    .line 32
    new-instance p0, Lom1;

    .line 33
    .line 34
    invoke-direct {p0, p4}, Lom1;-><init>(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 p2, 0x23

    .line 40
    .line 41
    if-lt p1, p2, :cond_1

    .line 42
    .line 43
    new-instance p1, Ltb5;

    .line 44
    .line 45
    invoke-direct {p1, p3, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/16 p2, 0x1e

    .line 50
    .line 51
    if-lt p1, p2, :cond_2

    .line 52
    .line 53
    new-instance p1, Lsb5;

    .line 54
    .line 55
    invoke-direct {p1, p3, p0}, Lsb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/16 p2, 0x1a

    .line 60
    .line 61
    if-lt p1, p2, :cond_3

    .line 62
    .line 63
    new-instance p1, Lrb5;

    .line 64
    .line 65
    invoke-direct {p1, p3, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    new-instance p1, Lqb5;

    .line 70
    .line 71
    invoke-direct {p1, p3, p0}, Lqb5;-><init>(Landroid/view/Window;Lom1;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    xor-int/lit8 p0, p5, 0x1

    .line 75
    .line 76
    invoke-virtual {p1, p0}, Lsu3;->D(Z)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
