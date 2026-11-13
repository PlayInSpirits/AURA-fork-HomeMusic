.class public Ldefpackage/zw1;
.super Ldefpackage/qp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/vb2;
.implements Ljava/io/Serializable;


# instance fields
.field public final transient r:Ldefpackage/ly3;

.field public final transient s:I


# direct methods
.method public constructor <init>(Ldefpackage/ly3;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zw1;->r:Ldefpackage/ly3;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/zw1;->s:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-super {p0}, Ldefpackage/u1;->a()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ldefpackage/rw1;

    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic b()Ljava/util/Map;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/zw1;->i()Ldefpackage/bx1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1}, Ldefpackage/u1;->d(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final e()Ljava/util/Map;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v0, "should never be called"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final f()Ljava/util/Collection;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/dx1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldefpackage/dx1;-><init>(Ldefpackage/zw1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/AssertionError;

    .line 2
    .line 3
    const-string v0, "unreachable"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zw1;->r:Ldefpackage/ly3;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/ly3;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/yw1;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 12
    .line 13
    sget-object p0, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public final h()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/cx1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldefpackage/cx1;-><init>(Ldefpackage/zw1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public i()Ldefpackage/bx1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/zw1;->r:Ldefpackage/ly3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zw1;->r:Ldefpackage/ly3;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/bx1;->o:Ldefpackage/jx1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/ly3;->d()Ldefpackage/jy3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ldefpackage/bx1;->o:Ldefpackage/jx1;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/zw1;->s:I

    .line 2
    .line 3
    return p0
.end method
