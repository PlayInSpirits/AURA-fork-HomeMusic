.class public final Ltb5;
.super Lsb5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final C(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsb5;->g:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x10

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-static {p0, p1}, Lhb5;->s(Landroid/view/WindowInsetsController;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsb5;->g:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/16 p1, 0x8

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    invoke-static {p0, p1}, Lhb5;->u(Landroid/view/WindowInsetsController;I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final E(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsb5;->g:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lhb5;->i(Landroid/view/WindowInsetsController;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final y()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lsb5;->g:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    invoke-static {p0}, Lhb5;->b(Landroid/view/WindowInsetsController;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    and-int/lit8 p0, p0, 0x8

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method
