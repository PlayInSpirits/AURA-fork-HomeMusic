.class public Lcom/facebook/shimmer/ShimmerFrameLayout;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Landroid/graphics/Paint;

.field public final o:Lld4;

.field public final p:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->n:Landroid/graphics/Paint;

    .line 10
    .line 11
    new-instance v0, Lld4;

    .line 12
    .line 13
    invoke-direct {v0}, Lld4;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->p:Z

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p0, p1, v0}, Lcom/facebook/shimmer/ShimmerFrameLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->n:Landroid/graphics/Paint;

    .line 28
    new-instance v0, Lld4;

    invoke-direct {v0}, Lld4;-><init>()V

    iput-object v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->p:Z

    .line 30
    invoke-virtual {p0, p1, p2}, Lcom/facebook/shimmer/ShimmerFrameLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->n:Landroid/graphics/Paint;

    .line 33
    new-instance p3, Lld4;

    invoke-direct {p3}, Lld4;-><init>()V

    iput-object p3, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    const/4 p3, 0x1

    .line 34
    iput-boolean p3, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->p:Z

    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/facebook/shimmer/ShimmerFrameLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 37
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->n:Landroid/graphics/Paint;

    .line 38
    new-instance p3, Lld4;

    invoke-direct {p3}, Lld4;-><init>()V

    iput-object p3, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    const/4 p3, 0x1

    .line 39
    iput-boolean p3, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->p:Z

    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/facebook/shimmer/ShimmerFrameLayout;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 8
    .line 9
    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    new-instance p1, Ljd4;

    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljd4;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lrp;->d()Lkd4;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Lcom/facebook/shimmer/ShimmerFrameLayout;->b(Lkd4;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget-object v1, Lgt3;->a:[I

    .line 26
    .line 27
    invoke-virtual {p1, p2, v1, v0, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 p2, 0x4

    .line 32
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    new-instance p2, Ljd4;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {p2, v1}, Ljd4;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v1, p2, Lrp;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lkd4;

    .line 53
    .line 54
    iput-boolean v0, v1, Lkd4;->p:Z

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance p2, Ljd4;

    .line 60
    .line 61
    invoke-direct {p2, v0}, Ljd4;-><init>(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    invoke-virtual {p2, p1}, Lrp;->g(Landroid/content/res/TypedArray;)Lrp;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Lrp;->d()Lkd4;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p0, p2}, Lcom/facebook/shimmer/ShimmerFrameLayout;->b(Lkd4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 80
    .line 81
    .line 82
    throw p0
.end method

.method public final b(Lkd4;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 2
    .line 3
    iput-object p1, v0, Lld4;->f:Lkd4;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object v1, v0, Lld4;->b:Landroid/graphics/Paint;

    .line 8
    .line 9
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 10
    .line 11
    iget-object v3, v0, Lld4;->f:Lkd4;

    .line 12
    .line 13
    iget-boolean v3, v3, Lkd4;->p:Z

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 21
    .line 22
    :goto_0
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, Lld4;->b()V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lld4;->f:Lkd4;

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    iget-object v1, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v4, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    .line 49
    .line 50
    .line 51
    iget-object v4, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 52
    .line 53
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move v1, v3

    .line 58
    :goto_1
    iget-object v4, v0, Lld4;->f:Lkd4;

    .line 59
    .line 60
    iget-wide v5, v4, Lkd4;->t:J

    .line 61
    .line 62
    iget-wide v7, v4, Lkd4;->s:J

    .line 63
    .line 64
    div-long/2addr v5, v7

    .line 65
    long-to-float v4, v5

    .line 66
    const/high16 v5, 0x3f800000    # 1.0f

    .line 67
    .line 68
    add-float/2addr v4, v5

    .line 69
    new-array v5, v2, [F

    .line 70
    .line 71
    const/4 v6, 0x0

    .line 72
    aput v6, v5, v3

    .line 73
    .line 74
    const/4 v6, 0x1

    .line 75
    aput v4, v5, v6

    .line 76
    .line 77
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    iput-object v4, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 82
    .line 83
    iget-object v5, v0, Lld4;->f:Lkd4;

    .line 84
    .line 85
    iget v5, v5, Lkd4;->r:I

    .line 86
    .line 87
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    .line 88
    .line 89
    .line 90
    iget-object v4, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 91
    .line 92
    iget-object v5, v0, Lld4;->f:Lkd4;

    .line 93
    .line 94
    iget v5, v5, Lkd4;->q:I

    .line 95
    .line 96
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 97
    .line 98
    .line 99
    iget-object v4, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 100
    .line 101
    iget-object v5, v0, Lld4;->f:Lkd4;

    .line 102
    .line 103
    iget-wide v6, v5, Lkd4;->s:J

    .line 104
    .line 105
    iget-wide v8, v5, Lkd4;->t:J

    .line 106
    .line 107
    add-long/2addr v6, v8

    .line 108
    invoke-virtual {v4, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 109
    .line 110
    .line 111
    iget-object v4, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 112
    .line 113
    iget-object v5, v0, Lld4;->a:Lqq;

    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 116
    .line 117
    .line 118
    if-eqz v1, :cond_4

    .line 119
    .line 120
    iget-object v1, v0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 123
    .line 124
    .line 125
    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 126
    .line 127
    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    iget-boolean p1, p1, Lkd4;->n:Z

    .line 131
    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    iget-object p1, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->n:Landroid/graphics/Paint;

    .line 135
    .line 136
    invoke-virtual {p0, v2, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    const/4 p1, 0x0

    .line 141
    invoke-virtual {p0, v3, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->p:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lld4;->draw(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 5
    .line 6
    invoke-virtual {p0}, Lld4;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 5
    .line 6
    iget-object v0, p0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-virtual {p0, p3, p3, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Lcom/facebook/shimmer/ShimmerFrameLayout;->o:Lld4;

    .line 8
    .line 9
    if-ne p1, p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method
