.class public final Ldefpackage/dp;
.super Ldefpackage/kb0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public u:I

.field public v:I

.field public w:Ldefpackage/ep;


# virtual methods
.method public getAllowsGoneWidget()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dp;->w:Ldefpackage/ep;

    .line 2
    .line 3
    iget-boolean p0, p0, Ldefpackage/ep;->s0:Z

    .line 4
    .line 5
    return p0
.end method

.method public getMargin()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dp;->w:Ldefpackage/ep;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/ep;->t0:I

    .line 4
    .line 5
    return p0
.end method

.method public getType()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/dp;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public setAllowsGoneWidget(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dp;->w:Ldefpackage/ep;

    .line 2
    .line 3
    iput-boolean p1, p0, Ldefpackage/ep;->s0:Z

    .line 4
    .line 5
    return-void
.end method

.method public setDpMargin(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    int-to-float p1, p1

    .line 12
    mul-float/2addr p1, v0

    .line 13
    const/high16 v0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, v0

    .line 16
    float-to-int p1, p1

    .line 17
    iget-object p0, p0, Ldefpackage/dp;->w:Ldefpackage/ep;

    .line 18
    .line 19
    iput p1, p0, Ldefpackage/ep;->t0:I

    .line 20
    .line 21
    return-void
.end method

.method public setMargin(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/dp;->w:Ldefpackage/ep;

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/ep;->t0:I

    .line 4
    .line 5
    return-void
.end method

.method public setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/dp;->u:I

    .line 2
    .line 3
    return-void
.end method
