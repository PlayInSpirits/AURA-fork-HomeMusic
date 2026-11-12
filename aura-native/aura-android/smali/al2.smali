.class public final Lal2;
.super Lpz1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final J(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lpz1;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Landroid/media/session/MediaController$TransportControls;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lek2;->r(Landroid/media/session/MediaController$TransportControls;F)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "speed must not be zero"

    .line 15
    .line 16
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
