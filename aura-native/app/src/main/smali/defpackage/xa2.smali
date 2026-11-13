.class public final Ldefpackage/xa2;
.super Ldefpackage/rx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final l:[I

.field public static final m:[I

.field public static final n:Ldefpackage/r00;


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public e:Landroid/animation/ObjectAnimator;

.field public final f:[Landroid/view/animation/Interpolator;

.field public final g:Ldefpackage/cb2;

.field public h:I

.field public i:Z

.field public j:F

.field public k:Ldefpackage/hq;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x352

    .line 2
    .line 3
    const/16 v1, 0x2ee

    .line 4
    .line 5
    const/16 v2, 0x215

    .line 6
    .line 7
    const/16 v3, 0x237

    .line 8
    .line 9
    filled-new-array {v2, v3, v0, v1}, [I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Ldefpackage/xa2;->l:[I

    .line 14
    .line 15
    const/16 v0, 0x14d

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const/16 v2, 0x4f3

    .line 19
    .line 20
    const/16 v3, 0x3e8

    .line 21
    .line 22
    filled-new-array {v2, v3, v0, v1}, [I

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Ldefpackage/xa2;->m:[I

    .line 27
    .line 28
    new-instance v0, Ldefpackage/r00;

    .line 29
    .line 30
    const-string v1, "animationFraction"

    .line 31
    .line 32
    const/16 v2, 0xd

    .line 33
    .line 34
    const-class v3, Ljava/lang/Float;

    .line 35
    .line 36
    invoke-direct {v0, v3, v1, v2}, Ldefpackage/r00;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ldefpackage/xa2;->n:Ldefpackage/r00;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/cb2;)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Ldefpackage/rx1;-><init>(I)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput v1, p0, Ldefpackage/xa2;->h:I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, p0, Ldefpackage/xa2;->k:Ldefpackage/hq;

    .line 10
    .line 11
    iput-object p2, p0, Ldefpackage/xa2;->g:Ldefpackage/cb2;

    .line 12
    .line 13
    const p2, 0x7f01001f

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const v2, 0x7f010020

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const v3, 0x7f010021

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v3}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const v4, 0x7f010022

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v4}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/4 v4, 0x4

    .line 42
    new-array v4, v4, [Landroid/view/animation/Interpolator;

    .line 43
    .line 44
    aput-object p2, v4, v1

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    aput-object v2, v4, p2

    .line 48
    .line 49
    aput-object v3, v4, v0

    .line 50
    .line 51
    const/4 p2, 0x3

    .line 52
    aput-object p1, v4, p2

    .line 53
    .line 54
    iput-object v4, p0, Ldefpackage/xa2;->f:[Landroid/view/animation/Interpolator;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/xa2;->h:I

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/xa2;->g:Ldefpackage/cb2;

    .line 5
    .line 6
    iget-object v1, v1, Ldefpackage/jq;->c:[I

    .line 7
    .line 8
    aget v1, v1, v0

    .line 9
    .line 10
    iget-object v2, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ldefpackage/sx1;

    .line 13
    .line 14
    iget v2, v2, Ldefpackage/cw0;->w:I

    .line 15
    .line 16
    invoke-static {v1, v2}, Ldefpackage/g12;->l(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object p0, p0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 21
    .line 22
    check-cast p0, [I

    .line 23
    .line 24
    aput v1, p0, v0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aput v1, p0, v0

    .line 28
    .line 29
    return-void
.end method

.method public final g(Ldefpackage/hq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/xa2;->k:Ldefpackage/hq;

    .line 2
    .line 3
    return-void
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ldefpackage/xa2;->d()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ldefpackage/sx1;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    iget v1, p0, Ldefpackage/xa2;->j:F

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    new-array v2, v2, [F

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    aput v1, v2, v3

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    const/high16 v3, 0x3f800000    # 1.0f

    .line 37
    .line 38
    aput v3, v2, v1

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 44
    .line 45
    iget v1, p0, Ldefpackage/xa2;->j:F

    .line 46
    .line 47
    sub-float/2addr v3, v1

    .line 48
    const/high16 v1, 0x44e10000    # 1800.0f

    .line 49
    .line 50
    mul-float/2addr v3, v1

    .line 51
    float-to-long v1, v3

    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 58
    .line 59
    .line 60
    :cond_1
    :goto_0
    return-void
.end method

.method public final j()V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-wide/16 v3, 0x708

    .line 6
    .line 7
    sget-object v5, Ldefpackage/xa2;->n:Ldefpackage/r00;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    new-array v0, v0, [F

    .line 13
    .line 14
    fill-array-data v0, :array_0

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 32
    .line 33
    const/4 v6, -0x1

    .line 34
    invoke-virtual {v0, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 38
    .line 39
    new-instance v6, Ldefpackage/wa2;

    .line 40
    .line 41
    invoke-direct {v6, p0, v1}, Ldefpackage/wa2;-><init>(Ldefpackage/xa2;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    new-array v0, v6, [F

    .line 53
    .line 54
    const/high16 v7, 0x3f800000    # 1.0f

    .line 55
    .line 56
    aput v7, v0, v1

    .line 57
    .line 58
    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 63
    .line 64
    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Ldefpackage/xa2;->e:Landroid/animation/ObjectAnimator;

    .line 73
    .line 74
    new-instance v2, Ldefpackage/wa2;

    .line 75
    .line 76
    invoke-direct {v2, p0, v6}, Ldefpackage/wa2;-><init>(Ldefpackage/xa2;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    iput v1, p0, Ldefpackage/xa2;->h:I

    .line 83
    .line 84
    iget-object v0, p0, Ldefpackage/xa2;->g:Ldefpackage/cb2;

    .line 85
    .line 86
    iget-object v0, v0, Ldefpackage/jq;->c:[I

    .line 87
    .line 88
    aget v0, v0, v1

    .line 89
    .line 90
    iget-object v2, p0, Ldefpackage/rx1;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v2, Ldefpackage/sx1;

    .line 93
    .line 94
    iget v2, v2, Ldefpackage/cw0;->w:I

    .line 95
    .line 96
    invoke-static {v0, v2}, Ldefpackage/g12;->l(II)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v2, p0, Ldefpackage/rx1;->c:Ljava/io/Serializable;

    .line 101
    .line 102
    check-cast v2, [I

    .line 103
    .line 104
    aput v0, v2, v1

    .line 105
    .line 106
    aput v0, v2, v6

    .line 107
    .line 108
    iget-object p0, p0, Ldefpackage/xa2;->d:Landroid/animation/ObjectAnimator;

    .line 109
    .line 110
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    nop

    .line 115
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ldefpackage/xa2;->k:Ldefpackage/hq;

    .line 3
    .line 4
    return-void
.end method
