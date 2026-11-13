.class public Lcom/google/android/material/slider/Slider;
.super Ldefpackage/uq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 35
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/slider/Slider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f04049e

    .line 34
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/slider/Slider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ldefpackage/uq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const p3, 0x1010024

    .line 5
    .line 6
    .line 7
    filled-new-array {p3}, [I

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p0, p2}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    const-class p0, Landroid/widget/SeekBar;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getActiveThumbIndex()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->c0:I

    .line 2
    .line 3
    return p0
.end method

.method public getFocusedThumbIndex()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->d0:I

    .line 2
    .line 3
    return p0
.end method

.method public getHaloRadius()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->Q:I

    .line 2
    .line 3
    return p0
.end method

.method public getHaloTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->m0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLabelBehavior()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->M:I

    .line 2
    .line 3
    return p0
.end method

.method public getStepSize()F
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->e0:F

    .line 2
    .line 3
    return p0
.end method

.method public getThumbElevation()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/ei2;->m:F

    .line 6
    .line 7
    return p0
.end method

.method public getThumbRadius()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->P:I

    .line 2
    .line 3
    return p0
.end method

.method public getThumbStrokeColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0
.end method

.method public getThumbStrokeWidth()F
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/ei2;->j:F

    .line 6
    .line 7
    return p0
.end method

.method public getThumbTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    return-object p0
.end method

.method public getTickActiveRadius()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->h0:I

    .line 2
    .line 3
    return p0
.end method

.method public getTickActiveTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->n0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTickInactiveRadius()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->i0:I

    .line 2
    .line 3
    return p0
.end method

.method public getTickInactiveTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->o0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTickTintList()Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->o0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/uq;->n0:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/uq;->n0:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead."

    .line 15
    .line 16
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public getTrackActiveTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->p0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTrackHeight()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->N:I

    .line 2
    .line 3
    return p0
.end method

.method public getTrackInactiveTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->q0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTrackSidePadding()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->O:I

    .line 2
    .line 3
    return p0
.end method

.method public getTrackTintList()Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->q0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/uq;->p0:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/uq;->p0:Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead."

    .line 15
    .line 16
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public getTrackWidth()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->j0:I

    .line 2
    .line 3
    return p0
.end method

.method public getValue()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/uq;->getValues()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/Float;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public getValueFrom()F
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->W:F

    .line 2
    .line 3
    return p0
.end method

.method public getValueTo()F
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/uq;->a0:F

    .line 2
    .line 3
    return p0
.end method

.method public setCustomThumbDrawable(I)V
    .locals 1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setCustomThumbDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setCustomThumbDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/uq;->a(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/uq;->s0:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    iget-object p1, p0, Ldefpackage/uq;->t0:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public bridge synthetic setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ldefpackage/uq;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setFocusedThumbIndex(I)V
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/uq;->b0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ge p1, v0, :cond_0

    .line 10
    .line 11
    iput p1, p0, Ldefpackage/uq;->d0:I

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/uq;->t:Ldefpackage/sq;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ldefpackage/z41;->w(I)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "index out of range"

    .line 23
    .line 24
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setHaloRadius(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/uq;->Q:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldefpackage/uq;->Q:I

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    instance-of v0, p1, Landroid/graphics/drawable/RippleDrawable;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Landroid/graphics/drawable/RippleDrawable;

    .line 25
    .line 26
    iget p0, p0, Ldefpackage/uq;->Q:I

    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/RippleDrawable;->setRadius(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setHaloRadiusResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setHaloRadius(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setHaloTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->m0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Ldefpackage/uq;->m0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v1, v1, Landroid/graphics/drawable/RippleDrawable;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/uq;->g(Landroid/content/res/ColorStateList;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget-object v0, p0, Ldefpackage/uq;->q:Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    .line 42
    .line 43
    const/16 p1, 0x3f

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public setLabelBehavior(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/uq;->M:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/uq;->M:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setLabelFormatter(Ldefpackage/p42;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/uq;->U:Ldefpackage/p42;

    .line 2
    .line 3
    return-void
.end method

.method public setStepSize(F)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-ltz v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Ldefpackage/uq;->e0:F

    .line 7
    .line 8
    cmpl-float v0, v0, p1

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput p1, p0, Ldefpackage/uq;->e0:F

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Ldefpackage/uq;->l0:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    iget v1, p0, Ldefpackage/uq;->W:F

    .line 24
    .line 25
    iget p0, p0, Ldefpackage/uq;->a0:F

    .line 26
    .line 27
    const-string v2, ") must be 0, or a factor of the valueFrom("

    .line 28
    .line 29
    const-string v3, ")-valueTo("

    .line 30
    .line 31
    const-string v4, "The stepSize("

    .line 32
    .line 33
    invoke-static {v4, p1, v2, v1, v3}, Ldefpackage/b11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ") range"

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public setThumbElevation(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->l(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setThumbElevationResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setThumbElevation(F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setThumbRadius(I)V
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/uq;->P:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Ldefpackage/uq;->P:I

    .line 7
    .line 8
    new-instance p1, Ldefpackage/fz0;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {p1, v0}, Ldefpackage/fz0;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ldefpackage/fz0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ldefpackage/fz0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Ldefpackage/fz0;

    .line 20
    .line 21
    invoke-direct {v2, v0}, Ldefpackage/fz0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ldefpackage/fz0;

    .line 25
    .line 26
    invoke-direct {v3, v0}, Ldefpackage/fz0;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iget v4, p0, Ldefpackage/uq;->P:I

    .line 30
    .line 31
    int-to-float v4, v4

    .line 32
    invoke-static {v0}, Ldefpackage/ji2;->v(I)Ldefpackage/su3;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    new-instance v6, Ldefpackage/m;

    .line 37
    .line 38
    invoke-direct {v6, v4}, Ldefpackage/m;-><init>(F)V

    .line 39
    .line 40
    .line 41
    new-instance v7, Ldefpackage/m;

    .line 42
    .line 43
    invoke-direct {v7, v4}, Ldefpackage/m;-><init>(F)V

    .line 44
    .line 45
    .line 46
    new-instance v8, Ldefpackage/m;

    .line 47
    .line 48
    invoke-direct {v8, v4}, Ldefpackage/m;-><init>(F)V

    .line 49
    .line 50
    .line 51
    new-instance v9, Ldefpackage/m;

    .line 52
    .line 53
    invoke-direct {v9, v4}, Ldefpackage/m;-><init>(F)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Ldefpackage/bc4;

    .line 57
    .line 58
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v5, v4, Ldefpackage/bc4;->a:Ldefpackage/su3;

    .line 62
    .line 63
    iput-object v5, v4, Ldefpackage/bc4;->b:Ldefpackage/su3;

    .line 64
    .line 65
    iput-object v5, v4, Ldefpackage/bc4;->c:Ldefpackage/su3;

    .line 66
    .line 67
    iput-object v5, v4, Ldefpackage/bc4;->d:Ldefpackage/su3;

    .line 68
    .line 69
    iput-object v6, v4, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 70
    .line 71
    iput-object v7, v4, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 72
    .line 73
    iput-object v8, v4, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 74
    .line 75
    iput-object v9, v4, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 76
    .line 77
    iput-object p1, v4, Ldefpackage/bc4;->i:Ldefpackage/fz0;

    .line 78
    .line 79
    iput-object v1, v4, Ldefpackage/bc4;->j:Ldefpackage/fz0;

    .line 80
    .line 81
    iput-object v2, v4, Ldefpackage/bc4;->k:Ldefpackage/fz0;

    .line 82
    .line 83
    iput-object v3, v4, Ldefpackage/bc4;->l:Ldefpackage/fz0;

    .line 84
    .line 85
    iget-object p1, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 86
    .line 87
    invoke-virtual {p1, v4}, Ldefpackage/fi2;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 88
    .line 89
    .line 90
    iget v1, p0, Ldefpackage/uq;->P:I

    .line 91
    .line 92
    mul-int/lit8 v1, v1, 0x2

    .line 93
    .line 94
    invoke-virtual {p1, v0, v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Ldefpackage/uq;->s0:Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    if-eqz p1, :cond_1

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Ldefpackage/uq;->a(Landroid/graphics/drawable/Drawable;)V

    .line 102
    .line 103
    .line 104
    :cond_1
    iget-object p1, p0, Ldefpackage/uq;->t0:Ljava/util/List;

    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ldefpackage/uq;->a(Landroid/graphics/drawable/Drawable;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_2
    invoke-virtual {p0}, Ldefpackage/uq;->v()V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public setThumbRadiusResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setThumbRadius(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setThumbStrokeColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/fi2;->q(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setThumbStrokeColorResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Ldefpackage/ud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setThumbStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setThumbStrokeWidth(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/fi2;->r(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setThumbStrokeWidthResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setThumbStrokeWidth(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setThumbTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->r0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget-object v1, v1, Ldefpackage/ei2;->c:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setTickActiveRadius(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/uq;->h0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/uq;->h0:I

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    iget-object v0, p0, Ldefpackage/uq;->s:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/uq;->v()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setTickActiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->n0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Ldefpackage/uq;->n0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/uq;->s:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldefpackage/uq;->g(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTickInactiveRadius(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/uq;->i0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/uq;->i0:I

    .line 6
    .line 7
    mul-int/lit8 p1, p1, 0x2

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    iget-object v0, p0, Ldefpackage/uq;->r:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/uq;->v()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setTickInactiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->o0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Ldefpackage/uq;->o0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/uq;->r:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldefpackage/uq;->g(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTickTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setTickInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setTickActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setTickVisible(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/uq;->g0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Ldefpackage/uq;->g0:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTrackActiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->p0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Ldefpackage/uq;->p0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/uq;->o:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldefpackage/uq;->g(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTrackHeight(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/uq;->N:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/uq;->N:I

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/uq;->n:Landroid/graphics/Paint;

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Ldefpackage/uq;->N:I

    .line 14
    .line 15
    int-to-float p1, p1

    .line 16
    iget-object v0, p0, Ldefpackage/uq;->o:Landroid/graphics/Paint;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/uq;->v()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/uq;->q0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-object p1, p0, Ldefpackage/uq;->q0:Landroid/content/res/ColorStateList;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/uq;->n:Landroid/graphics/Paint;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ldefpackage/uq;->g(Landroid/content/res/ColorStateList;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setTrackTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/google/android/material/slider/Slider;->setTrackActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setValue(F)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    filled-new-array {p1}, [Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Ldefpackage/uq;->setValues([Ljava/lang/Float;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setValueFrom(F)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/uq;->W:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Ldefpackage/uq;->l0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setValueTo(F)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/uq;->a0:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Ldefpackage/uq;->l0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
