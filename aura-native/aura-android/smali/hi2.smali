.class public final Lhi2;
.super Lyg2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final g:F

.field public final h:F

.field public final i:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lyg2;-><init>(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const v0, 0x7f070377

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lhi2;->g:F

    .line 16
    .line 17
    const v0, 0x7f070376

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lhi2;->h:F

    .line 25
    .line 26
    const v0, 0x7f070378

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iput p1, p0, Lhi2;->i:F

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lyg2;->a()Loo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object v1, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    new-array v3, v2, [F

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    const/high16 v5, 0x3f800000    # 1.0f

    .line 20
    .line 21
    aput v5, v3, v4

    .line 22
    .line 23
    iget-object v6, p0, Lyg2;->b:Landroid/view/View;

    .line 24
    .line 25
    invoke-static {v6, v1, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v3, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 30
    .line 31
    new-array v7, v2, [F

    .line 32
    .line 33
    aput v5, v7, v4

    .line 34
    .line 35
    invoke-static {v6, v3, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    const/4 v7, 0x2

    .line 40
    new-array v7, v7, [Landroid/animation/Animator;

    .line 41
    .line 42
    aput-object v1, v7, v4

    .line 43
    .line 44
    aput-object v3, v7, v2

    .line 45
    .line 46
    invoke-virtual {v0, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 47
    .line 48
    .line 49
    instance-of v1, v6, Landroid/view/ViewGroup;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    check-cast v6, Landroid/view/ViewGroup;

    .line 54
    .line 55
    move v1, v4

    .line 56
    :goto_0
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-ge v1, v3, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    sget-object v7, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 67
    .line 68
    new-array v8, v2, [F

    .line 69
    .line 70
    aput v5, v8, v4

    .line 71
    .line 72
    invoke-static {v3, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-array v7, v2, [Landroid/animation/Animator;

    .line 77
    .line 78
    aput-object v3, v7, v4

    .line 79
    .line 80
    invoke-virtual {v0, v7}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    iget p0, p0, Lyg2;->e:I

    .line 87
    .line 88
    int-to-long v1, p0

    .line 89
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final c(Loo;ILandroid/animation/AnimatorListenerAdapter;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 8

    .line 1
    iget v0, p1, Loo;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    sget-object v3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    iget-object v3, p0, Lyg2;->b:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-static {p2, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x3

    .line 23
    and-int/2addr v4, v5

    .line 24
    if-ne v4, v5, :cond_1

    .line 25
    .line 26
    move v4, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v4, v2

    .line 29
    :goto_1
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    int-to-float v5, v5

    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getScaleX()F

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    mul-float/2addr v6, v5

    .line 39
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    instance-of v7, v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 44
    .line 45
    if-eqz v7, :cond_3

    .line 46
    .line 47
    check-cast v5, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    iget v5, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move v5, v2

    .line 58
    :goto_2
    int-to-float v5, v5

    .line 59
    add-float/2addr v6, v5

    .line 60
    sget-object v5, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 61
    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    neg-float v6, v6

    .line 65
    :cond_4
    new-array v4, v1, [F

    .line 66
    .line 67
    aput v6, v4, v2

    .line 68
    .line 69
    invoke-static {v3, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz p4, :cond_5

    .line 74
    .line 75
    invoke-virtual {v2, p4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    new-instance p4, La61;

    .line 79
    .line 80
    invoke-direct {p4, v1}, La61;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, p4}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 84
    .line 85
    .line 86
    iget p4, p0, Lyg2;->d:I

    .line 87
    .line 88
    iget p1, p1, Loo;->c:F

    .line 89
    .line 90
    iget v1, p0, Lyg2;->c:I

    .line 91
    .line 92
    invoke-static {v1, p1, p4}, Lyd;->c(IFI)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    int-to-long v3, p1

    .line 97
    invoke-virtual {v2, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 98
    .line 99
    .line 100
    new-instance p1, Lgi2;

    .line 101
    .line 102
    invoke-direct {p1, p0, v0, p2}, Lgi2;-><init>(Lhi2;ZI)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Landroid/animation/ObjectAnimator;->start()V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public final d(FIZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lyg2;->a:Landroid/animation/TimeInterpolator;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    iget-object v0, p0, Lyg2;->b:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {p2, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    const/4 v1, 0x3

    .line 20
    and-int/2addr p2, v1

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x1

    .line 23
    if-ne p2, v1, :cond_0

    .line 24
    .line 25
    move p2, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p2, v2

    .line 28
    :goto_0
    if-ne p3, p2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v2

    .line 32
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    int-to-float v4, p3

    .line 41
    const/4 v5, 0x0

    .line 42
    cmpg-float v6, v4, v5

    .line 43
    .line 44
    if-lez v6, :cond_8

    .line 45
    .line 46
    int-to-float v1, v1

    .line 47
    cmpg-float v6, v1, v5

    .line 48
    .line 49
    if-gtz v6, :cond_2

    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_2
    iget v6, p0, Lhi2;->g:F

    .line 54
    .line 55
    div-float/2addr v6, v4

    .line 56
    iget v7, p0, Lhi2;->h:F

    .line 57
    .line 58
    div-float/2addr v7, v4

    .line 59
    iget p0, p0, Lhi2;->i:F

    .line 60
    .line 61
    div-float/2addr p0, v1

    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    move v4, v5

    .line 65
    :cond_3
    invoke-virtual {v0, v4}, Landroid/view/View;->setPivotX(F)V

    .line 66
    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    neg-float v7, v6

    .line 72
    :goto_2
    invoke-static {v5, v7, p1}, Lyd;->a(FFF)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/high16 v4, 0x3f800000    # 1.0f

    .line 77
    .line 78
    add-float v6, v1, v4

    .line 79
    .line 80
    invoke-virtual {v0, v6}, Landroid/view/View;->setScaleX(F)V

    .line 81
    .line 82
    .line 83
    invoke-static {v5, p0, p1}, Lyd;->a(FFF)F

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    sub-float p0, v4, p0

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Landroid/view/View;->setScaleY(F)V

    .line 90
    .line 91
    .line 92
    instance-of p1, v0, Landroid/view/ViewGroup;

    .line 93
    .line 94
    if-eqz p1, :cond_8

    .line 95
    .line 96
    check-cast v0, Landroid/view/ViewGroup;

    .line 97
    .line 98
    :goto_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-ge v2, p1, :cond_8

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p2, :cond_5

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    sub-int v7, p3, v7

    .line 115
    .line 116
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    add-int/2addr v8, v7

    .line 121
    int-to-float v7, v8

    .line 122
    goto :goto_4

    .line 123
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    neg-int v7, v7

    .line 128
    int-to-float v7, v7

    .line 129
    :goto_4
    invoke-virtual {p1, v7}, Landroid/view/View;->setPivotX(F)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    neg-int v7, v7

    .line 137
    int-to-float v7, v7

    .line 138
    invoke-virtual {p1, v7}, Landroid/view/View;->setPivotY(F)V

    .line 139
    .line 140
    .line 141
    if-eqz v3, :cond_6

    .line 142
    .line 143
    sub-float v7, v4, v1

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    move v7, v4

    .line 147
    :goto_5
    cmpl-float v8, p0, v5

    .line 148
    .line 149
    if-eqz v8, :cond_7

    .line 150
    .line 151
    div-float v8, v6, p0

    .line 152
    .line 153
    mul-float/2addr v8, v7

    .line 154
    goto :goto_6

    .line 155
    :cond_7
    move v8, v4

    .line 156
    :goto_6
    invoke-virtual {p1, v7}, Landroid/view/View;->setScaleX(F)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1, v8}, Landroid/view/View;->setScaleY(F)V

    .line 160
    .line 161
    .line 162
    add-int/lit8 v2, v2, 0x1

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_8
    :goto_7
    return-void
.end method
