.class public abstract Lq10;
.super Lu10;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Character;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Lu10;->c(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public d()Lu10;
    .locals 1

    .line 1
    new-instance v0, Lt10;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lp10;-><init>(Lu10;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
