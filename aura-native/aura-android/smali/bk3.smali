.class public final Lbk3;
.super Lee1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public final r(I)Lkc1;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    if-eq p1, p0, :cond_0

    .line 5
    .line 6
    new-instance p0, Lhk3;

    .line 7
    .line 8
    invoke-direct {p0}, Lhk3;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lqk3;

    .line 13
    .line 14
    invoke-direct {p0}, Lqk3;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Lhk3;

    .line 19
    .line 20
    invoke-direct {p0}, Lhk3;-><init>()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method
