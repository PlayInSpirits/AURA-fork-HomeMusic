.class public final Ldefpackage/ub5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/su3;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/om1;

    .line 5
    .line 6
    invoke-direct {v0, p2}, Ldefpackage/om1;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x23

    .line 12
    .line 13
    if-lt p2, v1, :cond_0

    .line 14
    .line 15
    new-instance p2, Ldefpackage/tb5;

    .line 16
    .line 17
    invoke-direct {p2, p1, v0}, Ldefpackage/sb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Ldefpackage/ub5;->a:Ldefpackage/su3;

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const/16 v1, 0x1e

    .line 24
    .line 25
    if-lt p2, v1, :cond_1

    .line 26
    .line 27
    new-instance p2, Ldefpackage/sb5;

    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, Ldefpackage/sb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Ldefpackage/ub5;->a:Ldefpackage/su3;

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    const/16 v1, 0x1a

    .line 36
    .line 37
    if-lt p2, v1, :cond_2

    .line 38
    .line 39
    new-instance p2, Ldefpackage/rb5;

    .line 40
    .line 41
    invoke-direct {p2, p1, v0}, Ldefpackage/qb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Ldefpackage/ub5;->a:Ldefpackage/su3;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    new-instance p2, Ldefpackage/qb5;

    .line 48
    .line 49
    invoke-direct {p2, p1, v0}, Ldefpackage/qb5;-><init>(Landroid/view/Window;Ldefpackage/om1;)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Ldefpackage/ub5;->a:Ldefpackage/su3;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    .line 57
    new-instance v0, Ldefpackage/tb5;

    new-instance v1, Ldefpackage/om1;

    invoke-direct {v1, p1}, Ldefpackage/om1;-><init>(Landroid/view/WindowInsetsController;)V

    .line 58
    invoke-direct {v0, p1, v1}, Ldefpackage/sb5;-><init>(Landroid/view/WindowInsetsController;Ldefpackage/om1;)V

    .line 59
    iput-object v0, p0, Ldefpackage/ub5;->a:Ldefpackage/su3;

    return-void

    .line 60
    :cond_0
    new-instance v0, Ldefpackage/sb5;

    new-instance v1, Ldefpackage/om1;

    invoke-direct {v1, p1}, Ldefpackage/om1;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, v1}, Ldefpackage/sb5;-><init>(Landroid/view/WindowInsetsController;Ldefpackage/om1;)V

    iput-object v0, p0, Ldefpackage/ub5;->a:Ldefpackage/su3;

    return-void
.end method
