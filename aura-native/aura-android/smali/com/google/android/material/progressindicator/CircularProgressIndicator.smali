.class public final Lcom/google/android/material/progressindicator/CircularProgressIndicator;
.super Liq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0400ec

    .line 51
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/progressindicator/CircularProgressIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    const v0, 0x7f14048d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3, v0}, Liq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, Liq;->n:Ljq;

    .line 12
    .line 13
    check-cast p2, Lg30;

    .line 14
    .line 15
    new-instance p3, Lsx1;

    .line 16
    .line 17
    new-instance v0, Ly20;

    .line 18
    .line 19
    invoke-direct {v0, p2}, Ly20;-><init>(Lg30;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La30;

    .line 23
    .line 24
    invoke-direct {v1, p2}, La30;-><init>(Lg30;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p3, p1, p2, v0, v1}, Lsx1;-><init>(Landroid/content/Context;Ljq;Lmw0;Lrx1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p3}, Liq;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p3, Lgp0;

    .line 38
    .line 39
    new-instance v0, Ly20;

    .line 40
    .line 41
    invoke-direct {v0, p2}, Ly20;-><init>(Lg30;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p3, p1, p2, v0}, Lgp0;-><init>(Landroid/content/Context;Ljq;Lmw0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p3}, Liq;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Ljq;
    .locals 9

    .line 1
    new-instance p0, Lg30;

    .line 2
    .line 3
    const v3, 0x7f0400ec

    .line 4
    .line 5
    .line 6
    const v4, 0x7f14048d

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1, p2, v3, v4}, Ljq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const v1, 0x7f0705ae

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v1, 0x7f0705a9

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/4 v8, 0x0

    .line 35
    new-array v5, v8, [I

    .line 36
    .line 37
    invoke-static {p1, p2, v3, v4}, Luc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Lht3;->j:[I

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    move-object v1, p2

    .line 44
    invoke-static/range {v0 .. v5}, Luc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const/4 p2, 0x2

    .line 52
    invoke-static {v0, p1, p2, v6}, Lh12;->u(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    iget v2, p0, Ljq;->a:I

    .line 57
    .line 58
    mul-int/2addr v2, p2

    .line 59
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iput p2, p0, Lg30;->g:I

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    invoke-static {v0, p1, p2, v7}, Lh12;->u(Landroid/content/Context;Landroid/content/res/TypedArray;II)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    iput p2, p0, Lg30;->h:I

    .line 71
    .line 72
    invoke-virtual {p1, v8, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    iput p2, p0, Lg30;->i:I

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method public getIndicatorDirection()I
    .locals 0

    .line 1
    iget-object p0, p0, Liq;->n:Ljq;

    .line 2
    .line 3
    check-cast p0, Lg30;

    .line 4
    .line 5
    iget p0, p0, Lg30;->i:I

    .line 6
    .line 7
    return p0
.end method

.method public getIndicatorInset()I
    .locals 0

    .line 1
    iget-object p0, p0, Liq;->n:Ljq;

    .line 2
    .line 3
    check-cast p0, Lg30;

    .line 4
    .line 5
    iget p0, p0, Lg30;->h:I

    .line 6
    .line 7
    return p0
.end method

.method public getIndicatorSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Liq;->n:Ljq;

    .line 2
    .line 3
    check-cast p0, Lg30;

    .line 4
    .line 5
    iget p0, p0, Lg30;->g:I

    .line 6
    .line 7
    return p0
.end method

.method public setIndicatorDirection(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Liq;->n:Ljq;

    .line 2
    .line 3
    check-cast v0, Lg30;

    .line 4
    .line 5
    iput p1, v0, Lg30;->i:I

    .line 6
    .line 7
    invoke-virtual {p0}, Liq;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setIndicatorInset(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Liq;->n:Ljq;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lg30;

    .line 5
    .line 6
    iget v1, v1, Lg30;->h:I

    .line 7
    .line 8
    if-eq v1, p1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lg30;

    .line 11
    .line 12
    iput p1, v0, Lg30;->h:I

    .line 13
    .line 14
    invoke-virtual {p0}, Liq;->invalidate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setIndicatorSize(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Liq;->getTrackThickness()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Liq;->n:Ljq;

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Lg30;

    .line 15
    .line 16
    iget v1, v1, Lg30;->g:I

    .line 17
    .line 18
    if-eq v1, p1, :cond_0

    .line 19
    .line 20
    move-object v1, v0

    .line 21
    check-cast v1, Lg30;

    .line 22
    .line 23
    iput p1, v1, Lg30;->g:I

    .line 24
    .line 25
    check-cast v0, Lg30;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Liq;->invalidate()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Liq;->setTrackThickness(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Liq;->n:Ljq;

    .line 5
    .line 6
    check-cast p0, Lg30;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-void
.end method
