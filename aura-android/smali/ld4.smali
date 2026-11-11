.class public final Lld4;
.super Landroid/graphics/drawable/Drawable;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lqq;

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/Matrix;

.field public e:Landroid/animation/ValueAnimator;

.field public f:Lkd4;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqq;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1, p0}, Lqq;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lld4;->a:Lqq;

    .line 11
    .line 12
    new-instance v0, Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lld4;->b:Landroid/graphics/Paint;

    .line 18
    .line 19
    new-instance v1, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lld4;->c:Landroid/graphics/Rect;

    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lld4;->d:Landroid/graphics/Matrix;

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lld4;->f:Lkd4;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, v0, Lkd4;->o:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v1, :cond_8

    .line 14
    .line 15
    if-eqz v0, :cond_8

    .line 16
    .line 17
    iget-object v2, p0, Lld4;->f:Lkd4;

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_5

    .line 22
    .line 23
    :cond_0
    iget v3, v2, Lkd4;->g:I

    .line 24
    .line 25
    if-lez v3, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget v2, v2, Lkd4;->i:F

    .line 29
    .line 30
    int-to-float v1, v1

    .line 31
    mul-float/2addr v2, v1

    .line 32
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    :goto_0
    iget-object v1, p0, Lld4;->f:Lkd4;

    .line 37
    .line 38
    iget v2, v1, Lkd4;->h:I

    .line 39
    .line 40
    if-lez v2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget v1, v1, Lkd4;->j:F

    .line 44
    .line 45
    int-to-float v0, v0

    .line 46
    mul-float/2addr v1, v0

    .line 47
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    :goto_1
    iget-object v0, p0, Lld4;->f:Lkd4;

    .line 52
    .line 53
    iget v1, v0, Lkd4;->f:I

    .line 54
    .line 55
    const/4 v4, 0x1

    .line 56
    if-eq v1, v4, :cond_7

    .line 57
    .line 58
    iget v0, v0, Lkd4;->c:I

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    if-eq v0, v4, :cond_4

    .line 62
    .line 63
    const/4 v5, 0x3

    .line 64
    if-ne v0, v5, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move v4, v1

    .line 68
    :cond_4
    :goto_2
    if-eqz v4, :cond_5

    .line 69
    .line 70
    move v3, v1

    .line 71
    :cond_5
    if-eqz v4, :cond_6

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_6
    move v2, v1

    .line 75
    :goto_3
    new-instance v4, Landroid/graphics/LinearGradient;

    .line 76
    .line 77
    int-to-float v7, v3

    .line 78
    int-to-float v8, v2

    .line 79
    iget-object v0, p0, Lld4;->f:Lkd4;

    .line 80
    .line 81
    iget-object v9, v0, Lkd4;->b:[I

    .line 82
    .line 83
    iget-object v10, v0, Lkd4;->a:[F

    .line 84
    .line 85
    sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v6, 0x0

    .line 89
    invoke-direct/range {v4 .. v11}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_7
    new-instance v5, Landroid/graphics/RadialGradient;

    .line 94
    .line 95
    int-to-float v0, v3

    .line 96
    const/high16 v1, 0x40000000    # 2.0f

    .line 97
    .line 98
    div-float v6, v0, v1

    .line 99
    .line 100
    int-to-float v0, v2

    .line 101
    div-float v7, v0, v1

    .line 102
    .line 103
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    int-to-double v0, v0

    .line 108
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 109
    .line 110
    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide v2

    .line 114
    div-double/2addr v0, v2

    .line 115
    double-to-float v8, v0

    .line 116
    iget-object v0, p0, Lld4;->f:Lkd4;

    .line 117
    .line 118
    iget-object v9, v0, Lkd4;->b:[I

    .line 119
    .line 120
    iget-object v10, v0, Lkd4;->a:[F

    .line 121
    .line 122
    sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 123
    .line 124
    invoke-direct/range {v5 .. v11}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 125
    .line 126
    .line 127
    move-object v4, v5

    .line 128
    :goto_4
    iget-object p0, p0, Lld4;->b:Landroid/graphics/Paint;

    .line 129
    .line 130
    invoke-virtual {p0, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 131
    .line 132
    .line 133
    :cond_8
    :goto_5
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lld4;->f:Lkd4;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v0, p0, Lld4;->b:Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lld4;->f:Lkd4;

    .line 16
    .line 17
    iget v1, v1, Lkd4;->m:F

    .line 18
    .line 19
    float-to-double v1, v1

    .line 20
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-static {v1, v2}, Ljava/lang/Math;->tan(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    double-to-float v1, v1

    .line 29
    iget-object v2, p0, Lld4;->c:Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    int-to-float v3, v3

    .line 36
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    int-to-float v4, v4

    .line 41
    mul-float/2addr v4, v1

    .line 42
    add-float/2addr v4, v3

    .line 43
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    int-to-float v3, v3

    .line 48
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    int-to-float v5, v5

    .line 53
    mul-float/2addr v1, v5

    .line 54
    add-float/2addr v1, v3

    .line 55
    iget-object v3, p0, Lld4;->e:Landroid/animation/ValueAnimator;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    move v3, v5

    .line 66
    :goto_0
    iget-object v6, p0, Lld4;->f:Lkd4;

    .line 67
    .line 68
    iget v6, v6, Lkd4;->c:I

    .line 69
    .line 70
    const/4 v7, 0x1

    .line 71
    if-eq v6, v7, :cond_4

    .line 72
    .line 73
    const/4 v7, 0x2

    .line 74
    if-eq v6, v7, :cond_3

    .line 75
    .line 76
    const/4 v7, 0x3

    .line 77
    if-eq v6, v7, :cond_2

    .line 78
    .line 79
    neg-float v4, v1

    .line 80
    invoke-static {v1, v4, v3, v4}, Lxa3;->a(FFFF)F

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    :goto_1
    move v8, v5

    .line 85
    move v5, v1

    .line 86
    move v1, v8

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    neg-float v1, v4

    .line 89
    invoke-static {v1, v4, v3, v4}, Lxa3;->a(FFFF)F

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    neg-float v4, v1

    .line 95
    invoke-static {v4, v1, v3, v1}, Lxa3;->a(FFFF)F

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    neg-float v1, v4

    .line 101
    invoke-static {v4, v1, v3, v1}, Lxa3;->a(FFFF)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    :goto_2
    iget-object v3, p0, Lld4;->d:Landroid/graphics/Matrix;

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lld4;->f:Lkd4;

    .line 111
    .line 112
    iget p0, p0, Lkd4;->m:F

    .line 113
    .line 114
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    int-to-float v4, v4

    .line 119
    const/high16 v6, 0x40000000    # 2.0f

    .line 120
    .line 121
    div-float/2addr v4, v6

    .line 122
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    int-to-float v7, v7

    .line 127
    div-float/2addr v7, v6

    .line 128
    invoke-virtual {v3, p0, v4, v7}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v5, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    :goto_3
    return-void
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    iget-object p0, p0, Lld4;->f:Lkd4;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lkd4;->n:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean p0, p0, Lkd4;->p:Z

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 p0, -0x3

    .line 14
    return p0

    .line 15
    :cond_1
    const/4 p0, -0x1

    .line 16
    return p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v1, p0, Lld4;->c:Landroid/graphics/Rect;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2, v2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lld4;->b()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lld4;->a()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final setAlpha(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    return-void
.end method
