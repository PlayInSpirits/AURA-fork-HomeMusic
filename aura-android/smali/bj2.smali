.class public final Lbj2;
.super Lsk2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final W0(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;Lxs;)Lrk2;
    .locals 8

    .line 1
    iget-object v0, p2, Lcb4;->a:Lbb4;

    .line 2
    .line 3
    invoke-interface {v0}, Lbb4;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Llj2;

    .line 10
    .line 11
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v3, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v5, p3

    .line 18
    move-object v6, p4

    .line 19
    move-object v7, p5

    .line 20
    invoke-direct/range {v1 .. v7}, Llj2;-><init>(Landroid/content/Context;Lbj2;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;Lxs;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    move-object p5, p4

    .line 25
    move-object p4, p3

    .line 26
    move-object p3, p2

    .line 27
    move-object p2, p0

    .line 28
    new-instance p0, Lkj2;

    .line 29
    .line 30
    invoke-direct/range {p0 .. p5}, Lkj2;-><init>(Landroid/content/Context;Lbj2;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method
