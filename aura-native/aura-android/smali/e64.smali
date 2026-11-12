.class public Le64;
.super Lc0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lye0;


# instance fields
.field public final s:Lvd0;


# direct methods
.method public constructor <init>(Lvd0;Lne0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p2, v0}, Lc0;-><init>(Lne0;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Le64;->s:Lvd0;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final P()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final getCallerFrame()Lye0;
    .locals 1

    .line 1
    iget-object p0, p0, Le64;->s:Lvd0;

    .line 2
    .line 3
    instance-of v0, p0, Lye0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Lye0;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public l(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Le64;->s:Lvd0;

    .line 2
    .line 3
    invoke-static {p0}, Lya4;->x(Lvd0;)Lvd0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1}, Lhw;->I(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1}, Luc5;->T(Lvd0;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public m(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Le64;->s:Lvd0;

    .line 2
    .line 3
    invoke-static {p1}, Lhw;->I(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Lvd0;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
