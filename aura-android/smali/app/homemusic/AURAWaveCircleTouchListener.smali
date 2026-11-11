.class public final Lapp/homemusic/AURAWaveCircleTouchListener;
.super Ljava/lang/Object;
.implements Landroid/view/View$OnTouchListener;

.field private tracking:Z

.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I
    move-result v0
    if-nez v0, :not_down
    invoke-static {p1, p2}, Lapp/homemusic/AURAWaveCircleTouchListener;->insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    move-result v1
    iput-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V
    const/4 v0, 0x1
    return v0

:not_down
    const/4 v1, 0x1
    if-ne v0, v1, :move_or_cancel
    iget-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-static {p1, p2}, Lapp/homemusic/AURAWaveCircleTouchListener;->insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    move-result v2
    and-int/2addr v1, v2
    const/4 v2, 0x0
    iput-boolean v2, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-virtual {p1, v2}, Landroid/view/View;->setPressed(Z)V
    if-eqz v1, :handled
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z
:handled
    const/4 v0, 0x1
    return v0

:move_or_cancel
    const/4 v1, 0x2
    if-ne v0, v1, :cancel
    iget-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-static {p1, p2}, Lapp/homemusic/AURAWaveCircleTouchListener;->insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    move-result v2
    and-int/2addr v1, v2
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V
    const/4 v0, 0x1
    return v0

:cancel
    const/4 v1, 0x0
    iput-boolean v1, p0, Lapp/homemusic/AURAWaveCircleTouchListener;->tracking:Z
    invoke-virtual {p1, v1}, Landroid/view/View;->setPressed(Z)V
    const/4 v0, 0x1
    return v0
.end method

.method private static insideCircle(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I
    move-result v0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I
    move-result v1
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
    move-result v2
    int-to-float v2, v2
    const/high16 v3, 0x3f000000
    mul-float/2addr v2, v3
    int-to-float v4, v0
    mul-float/2addr v4, v3
    int-to-float v5, v1
    mul-float/2addr v5, v3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
    move-result v6
    sub-float/2addr v6, v4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
    move-result v7
    sub-float/2addr v7, v5
    mul-float/2addr v6, v6
    mul-float/2addr v7, v7
    add-float/2addr v6, v7
    mul-float v2, v2, v2
    cmpl-float v6, v6, v2
    if-lez v6, :inside
    const/4 v0, 0x0
    return v0
:inside
    const/4 v0, 0x1
    return v0
.end method
