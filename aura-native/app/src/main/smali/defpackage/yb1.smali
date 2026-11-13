.class public abstract Ldefpackage/yb1;
.super Ldefpackage/uo;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/util/Collection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ldefpackage/uo;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract W()Ldefpackage/jx1;
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final clear()V
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ldefpackage/rw1;->clear()V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    throw p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/yb1;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/jx1;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/yb1;->W()Ldefpackage/jx1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public bridge synthetic o()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/yb1;->W()Ldefpackage/jx1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final size()I
    .locals 0

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p0, Ldefpackage/a05;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Ldefpackage/rw1;->n:[Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ldefpackage/rw1;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p0, Ldefpackage/a05;

    .line 15
    invoke-virtual {p0}, Ldefpackage/a05;->W()Ldefpackage/jx1;

    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Ldefpackage/rw1;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
