.class public final Ldefpackage/cg4;
.super Ldefpackage/l85;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final N:Landroid/view/animation/DecelerateInterpolator;

.field public static final O:Landroid/view/animation/AccelerateInterpolator;

.field public static final P:Ldefpackage/zf4;

.field public static final Q:Ldefpackage/zf4;

.field public static final R:Ldefpackage/ag4;

.field public static final S:Ldefpackage/zf4;

.field public static final T:Ldefpackage/zf4;

.field public static final U:Ldefpackage/ag4;


# instance fields
.field public final M:Ldefpackage/bg4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/cg4;->N:Landroid/view/animation/DecelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldefpackage/cg4;->O:Landroid/view/animation/AccelerateInterpolator;

    .line 14
    .line 15
    new-instance v0, Ldefpackage/zf4;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ldefpackage/zf4;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ldefpackage/cg4;->P:Ldefpackage/zf4;

    .line 22
    .line 23
    new-instance v0, Ldefpackage/zf4;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, Ldefpackage/zf4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ldefpackage/cg4;->Q:Ldefpackage/zf4;

    .line 30
    .line 31
    new-instance v0, Ldefpackage/ag4;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, Ldefpackage/ag4;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Ldefpackage/cg4;->R:Ldefpackage/ag4;

    .line 38
    .line 39
    new-instance v0, Ldefpackage/zf4;

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    invoke-direct {v0, v1}, Ldefpackage/zf4;-><init>(I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Ldefpackage/cg4;->S:Ldefpackage/zf4;

    .line 46
    .line 47
    new-instance v0, Ldefpackage/zf4;

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    invoke-direct {v0, v1}, Ldefpackage/zf4;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Ldefpackage/cg4;->T:Ldefpackage/zf4;

    .line 54
    .line 55
    new-instance v0, Ldefpackage/ag4;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {v0, v1}, Ldefpackage/ag4;-><init>(I)V

    .line 59
    .line 60
    .line 61
    sput-object v0, Ldefpackage/cg4;->U:Ldefpackage/ag4;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ldefpackage/l85;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/cg4;->U:Ldefpackage/ag4;

    .line 5
    .line 6
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 7
    .line 8
    const/4 v1, 0x3

    .line 9
    if-eq p1, v1, :cond_5

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    if-eq p1, v1, :cond_4

    .line 13
    .line 14
    const/16 v1, 0x30

    .line 15
    .line 16
    if-eq p1, v1, :cond_3

    .line 17
    .line 18
    const/16 v1, 0x50

    .line 19
    .line 20
    if-eq p1, v1, :cond_2

    .line 21
    .line 22
    const v0, 0x800003

    .line 23
    .line 24
    .line 25
    if-eq p1, v0, :cond_1

    .line 26
    .line 27
    const v0, 0x800005

    .line 28
    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    sget-object v0, Ldefpackage/cg4;->T:Ldefpackage/zf4;

    .line 33
    .line 34
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "Invalid slide direction"

    .line 38
    .line 39
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0

    .line 44
    :cond_1
    sget-object v0, Ldefpackage/cg4;->Q:Ldefpackage/zf4;

    .line 45
    .line 46
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    sget-object v0, Ldefpackage/cg4;->R:Ldefpackage/ag4;

    .line 53
    .line 54
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_4
    sget-object v0, Ldefpackage/cg4;->S:Ldefpackage/zf4;

    .line 58
    .line 59
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    sget-object v0, Ldefpackage/cg4;->P:Ldefpackage/zf4;

    .line 63
    .line 64
    iput-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 65
    .line 66
    :goto_0
    new-instance v0, Ldefpackage/cx;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    iput p1, v0, Ldefpackage/cx;->a:I

    .line 72
    .line 73
    iput-object v0, p0, Ldefpackage/dx4;->F:Ldefpackage/cx;

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;
    .locals 10

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object p3, p4, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v0, "android:slide:screenPosition"

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, [I

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    iget-object v0, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, Ldefpackage/bg4;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-interface {v0, p1, p2}, Ldefpackage/bg4;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 p1, 0x0

    .line 34
    aget v2, p3, p1

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    aget v3, p3, p1

    .line 38
    .line 39
    sget-object v8, Ldefpackage/cg4;->N:Landroid/view/animation/DecelerateInterpolator;

    .line 40
    .line 41
    move-object v9, p0

    .line 42
    move-object v0, p2

    .line 43
    move-object v1, p4

    .line 44
    invoke-static/range {v0 .. v9}, Ldefpackage/fh0;->k(Landroid/view/View;Ldefpackage/mx4;IIFFFFLandroid/animation/TimeInterpolator;Ldefpackage/cg4;)Landroid/animation/ObjectAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public final I(Landroid/view/ViewGroup;Landroid/view/View;Ldefpackage/mx4;)Landroid/animation/ObjectAnimator;
    .locals 11

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object v0, p3, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v1, "android:slide:screenPosition"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, [I

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    iget-object v1, p0, Ldefpackage/cg4;->M:Ldefpackage/bg4;

    .line 24
    .line 25
    invoke-interface {v1, p1, p2}, Ldefpackage/bg4;->b(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    invoke-interface {v1, p1, p2}, Ldefpackage/bg4;->a(Landroid/view/ViewGroup;Landroid/view/View;)F

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    const/4 p1, 0x0

    .line 34
    aget v3, v0, p1

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    aget v4, v0, p1

    .line 38
    .line 39
    sget-object v9, Ldefpackage/cg4;->O:Landroid/view/animation/AccelerateInterpolator;

    .line 40
    .line 41
    move-object v10, p0

    .line 42
    move-object v1, p2

    .line 43
    move-object v2, p3

    .line 44
    invoke-static/range {v1 .. v10}, Ldefpackage/fh0;->k(Landroid/view/View;Ldefpackage/mx4;IIFFFFLandroid/animation/TimeInterpolator;Ldefpackage/cg4;)Landroid/animation/ObjectAnimator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public final c(Ldefpackage/mx4;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ldefpackage/l85;->F(Ldefpackage/mx4;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p1, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    const-string p1, "android:slide:screenPosition"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final f(Ldefpackage/mx4;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ldefpackage/l85;->F(Ldefpackage/mx4;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p1, Ldefpackage/mx4;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    const-string p1, "android:slide:screenPosition"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method
