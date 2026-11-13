.class public final Ldefpackage/ci2;
.super Ldefpackage/yg2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final g:F

.field public final h:F

.field public i:F

.field public j:Landroid/graphics/Rect;

.field public k:Landroid/graphics/Rect;

.field public l:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/yg2;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f070375

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Ldefpackage/ci2;->g:F

    .line 16
    .line 17
    const v0, 0x7f070374

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, Ldefpackage/ci2;->h:F

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/View;)Landroid/animation/AnimatorSet;
    .locals 9

    .line 1
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    new-array v3, v2, [F

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/high16 v5, 0x3f800000    # 1.0f

    .line 13
    .line 14
    aput v5, v3, v4

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/yg2;->b:Landroid/view/View;

    .line 17
    .line 18
    invoke-static {p0, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sget-object v3, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 23
    .line 24
    new-array v6, v2, [F

    .line 25
    .line 26
    aput v5, v6, v4

    .line 27
    .line 28
    invoke-static {p0, v3, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    sget-object v5, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 33
    .line 34
    new-array v6, v2, [F

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    aput v7, v6, v4

    .line 38
    .line 39
    invoke-static {p0, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    sget-object v6, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 44
    .line 45
    new-array v8, v2, [F

    .line 46
    .line 47
    aput v7, v8, v4

    .line 48
    .line 49
    invoke-static {p0, v6, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 v6, 0x4

    .line 54
    new-array v6, v6, [Landroid/animation/Animator;

    .line 55
    .line 56
    aput-object v1, v6, v4

    .line 57
    .line 58
    aput-object v3, v6, v2

    .line 59
    .line 60
    const/4 v1, 0x2

    .line 61
    aput-object v5, v6, v1

    .line 62
    .line 63
    const/4 v1, 0x3

    .line 64
    aput-object p0, v6, v1

    .line 65
    .line 66
    invoke-virtual {v0, v6}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 67
    .line 68
    .line 69
    new-instance p0, Ldefpackage/l4;

    .line 70
    .line 71
    const/16 v1, 0xc

    .line 72
    .line 73
    invoke-direct {p0, v1, p1}, Ldefpackage/l4;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method

.method public final c()I
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ci2;->l:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v1, v0, [I

    .line 7
    .line 8
    iget-object v2, p0, Ldefpackage/yg2;->b:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aget v1, v1, v3

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v1, :cond_4

    .line 18
    .line 19
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v5, 0x1f

    .line 22
    .line 23
    if-lt v1, v5, :cond_4

    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    invoke-static {v1, v4}, Ldefpackage/hd0;->o(Landroid/view/WindowInsets;I)Landroid/view/RoundedCorner;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {v2}, Ldefpackage/go2;->A(Landroid/view/RoundedCorner;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move v2, v4

    .line 43
    :goto_0
    invoke-static {v1, v3}, Ldefpackage/hd0;->o(Landroid/view/WindowInsets;I)Landroid/view/RoundedCorner;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-static {v3}, Ldefpackage/go2;->A(Landroid/view/RoundedCorner;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v3, v4

    .line 55
    :goto_1
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-static {v1, v3}, Ldefpackage/hd0;->o(Landroid/view/WindowInsets;I)Landroid/view/RoundedCorner;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-static {v3}, Ldefpackage/go2;->A(Landroid/view/RoundedCorner;)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v3, v4

    .line 72
    :goto_2
    invoke-static {v1, v0}, Ldefpackage/hd0;->o(Landroid/view/WindowInsets;I)Landroid/view/RoundedCorner;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-static {v0}, Ldefpackage/go2;->A(Landroid/view/RoundedCorner;)I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    :cond_3
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Ldefpackage/ci2;->l:Ljava/lang/Integer;

    .line 95
    .line 96
    :cond_5
    iget-object p0, p0, Ldefpackage/ci2;->l:Ljava/lang/Integer;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0
.end method
