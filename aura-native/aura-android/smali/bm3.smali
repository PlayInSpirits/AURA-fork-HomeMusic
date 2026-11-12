.class public final synthetic Lbm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/ToLongFunction;


# virtual methods
.method public final applyAsLong(Ljava/lang/Object;)J
    .locals 0

    .line 1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    int-to-long p0, p0

    .line 18
    return-wide p0

    .line 19
    :cond_0
    const-wide/16 p0, 0x0

    .line 20
    .line 21
    return-wide p0
.end method
