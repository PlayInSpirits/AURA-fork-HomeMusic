.class public final Ltz2;
.super Lu1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvb2;


# instance fields
.field public final r:Lvb2;

.field public final s:Lhg3;


# direct methods
.method public constructor <init>(Lvb2;Lhg3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ltz2;->r:Lvb2;

    .line 8
    .line 9
    iput-object p2, p0, Ltz2;->s:Lhg3;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 0

    .line 1
    iget-object p0, p0, Ltz2;->r:Lvb2;

    .line 2
    .line 3
    invoke-interface {p0}, Lqz2;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, Ltz2;->r:Lvb2;

    .line 2
    .line 3
    invoke-interface {v0}, Lqz2;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lss2;

    .line 8
    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-direct {v1, v2, p0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lkg2;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lkg2;-><init>(Ljava/util/Map;Ljg2;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final f()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, Ls1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0}, Ls1;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Ltz2;->r:Lvb2;

    .line 2
    .line 3
    invoke-interface {p0}, Lqz2;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 3

    .line 1
    iget-object v0, p0, Ltz2;->r:Lvb2;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lqz2;->get(Ljava/lang/Object;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    new-instance v1, Lrm3;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object p0, p0, Ltz2;->s:Lhg3;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v2}, Lrm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Lhw;->P(Leg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final h()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Ltz2;->r:Lvb2;

    .line 2
    .line 3
    invoke-interface {v0}, Lqz2;->a()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lpz1;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    iget-object p0, p0, Ltz2;->s:Lhg3;

    .line 15
    .line 16
    invoke-direct {v1, v2, p0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Li22;

    .line 20
    .line 21
    invoke-direct {p0, v0, v1}, Li22;-><init>(Ljava/util/Iterator;Leg1;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ltz2;->get(Ljava/lang/Object;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p2}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Ltz2;->r:Lvb2;

    .line 2
    .line 3
    invoke-interface {p0}, Lqz2;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
