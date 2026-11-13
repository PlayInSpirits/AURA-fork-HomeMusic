.class public final Ldefpackage/lp4;
.super Landroid/view/animation/Animation;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/lp4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/lp4;->o:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 1
    iget p2, p0, Ldefpackage/lp4;->n:I

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/lp4;->o:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->k(F)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->K:I

    .line 15
    .line 16
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->J:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr p2, v1

    .line 23
    iget v1, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->I:I

    .line 24
    .line 25
    sub-int/2addr p2, v1

    .line 26
    int-to-float p2, p2

    .line 27
    mul-float/2addr p2, p1

    .line 28
    float-to-int p2, p2

    .line 29
    add-int/2addr v1, p2

    .line 30
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->G:Ldefpackage/w20;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    sub-int/2addr v1, p2

    .line 37
    invoke-virtual {p0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->M:Ldefpackage/f30;

    .line 41
    .line 42
    sub-float/2addr v0, p1

    .line 43
    iget-object p1, p0, Ldefpackage/f30;->n:Ldefpackage/e30;

    .line 44
    .line 45
    iget p2, p1, Ldefpackage/e30;->p:F

    .line 46
    .line 47
    cmpl-float p2, v0, p2

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    iput v0, p1, Ldefpackage/e30;->p:F

    .line 52
    .line 53
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_1
    sub-float/2addr v0, p1

    .line 58
    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_2
    invoke-virtual {p0, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
