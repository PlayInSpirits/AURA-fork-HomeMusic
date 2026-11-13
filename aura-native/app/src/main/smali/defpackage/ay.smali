.class public final Ldefpackage/ay;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/ay;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/ay;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/ay;->a:Ldefpackage/ay;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;[FLandroid/graphics/Matrix;[I)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Landroid/graphics/Matrix;->reset()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p3}, Ldefpackage/z9;->s(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    instance-of v0, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move-object p1, p0

    .line 16
    check-cast p1, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    aget v0, p4, p0

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    aget v2, p4, v1

    .line 31
    .line 32
    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 33
    .line 34
    .line 35
    aget p0, p4, p0

    .line 36
    .line 37
    aget p1, p4, v1

    .line 38
    .line 39
    sub-int/2addr p0, v0

    .line 40
    int-to-float p0, p0

    .line 41
    sub-int/2addr p1, v2

    .line 42
    int-to-float p1, p1

    .line 43
    invoke-virtual {p3, p0, p1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 44
    .line 45
    .line 46
    invoke-static {p2, p3}, Ldefpackage/hw;->L([FLandroid/graphics/Matrix;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
