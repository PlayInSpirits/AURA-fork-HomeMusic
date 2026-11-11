.class public final Lb10;
.super La10;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final d(Lne0;ILwv;)Lz00;
    .locals 1

    .line 1
    new-instance v0, Lb10;

    .line 2
    .line 3
    iget-object p0, p0, La10;->q:Lp81;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2, p3}, La10;-><init>(Lp81;Lne0;ILwv;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final e()Lp81;
    .locals 0

    .line 1
    iget-object p0, p0, La10;->q:Lp81;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f(Lq81;Lvd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La10;->q:Lp81;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lp81;->a(Lq81;Lvd0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lxe0;->n:Lxe0;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lj15;->a:Lj15;

    .line 13
    .line 14
    return-object p0
.end method
