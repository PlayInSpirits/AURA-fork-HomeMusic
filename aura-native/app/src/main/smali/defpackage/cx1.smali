.class public final Ldefpackage/cx1;
.super Ldefpackage/o15;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final o:Ldefpackage/o15;

.field public p:Ljava/lang/Object;

.field public q:Ldefpackage/o15;


# direct methods
.method public constructor <init>(Ldefpackage/zw1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ldefpackage/o15;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iget-object p1, p1, Ldefpackage/zw1;->r:Ldefpackage/ly3;

    .line 6
    .line 7
    iget-object v0, p1, Ldefpackage/bx1;->n:Ldefpackage/jx1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ldefpackage/ly3;->c()Ldefpackage/iy3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p1, Ldefpackage/bx1;->n:Ldefpackage/jx1;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Ldefpackage/cx1;->o:Ldefpackage/o15;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Ldefpackage/cx1;->p:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object p1, Ldefpackage/j22;->r:Ldefpackage/j22;

    .line 27
    .line 28
    iput-object p1, p0, Ldefpackage/cx1;->q:Ldefpackage/o15;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/cx1;->q:Ldefpackage/o15;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/cx1;->o:Ldefpackage/o15;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/cx1;->q:Ldefpackage/o15;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/cx1;->o:Ldefpackage/o15;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/Map$Entry;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, p0, Ldefpackage/cx1;->p:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ldefpackage/rw1;

    .line 28
    .line 29
    invoke-virtual {v0}, Ldefpackage/rw1;->h()Ldefpackage/o15;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Ldefpackage/cx1;->q:Ldefpackage/o15;

    .line 34
    .line 35
    :cond_0
    iget-object v0, p0, Ldefpackage/cx1;->p:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/cx1;->q:Ldefpackage/o15;

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v1, Ldefpackage/sw1;

    .line 47
    .line 48
    invoke-direct {v1, v0, p0}, Ldefpackage/sw1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method
