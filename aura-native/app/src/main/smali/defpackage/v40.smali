.class public abstract Ldefpackage/v40;
.super Ldefpackage/u40;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public static n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p0, Ljava/util/Collection;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public static final o0(Ljava/lang/Iterable;Ldefpackage/if1;Z)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p1, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ne v1, p2, :cond_0

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v0
.end method

.method public static p0(Ljava/util/List;Ldefpackage/if1;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Ljava/util/RandomAccess;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    instance-of v0, p0, Ldefpackage/x32;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    instance-of v0, p0, Ldefpackage/y32;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "kotlin.collections.MutableIterable"

    .line 19
    .line 20
    invoke-static {p0, p1}, Ldefpackage/jz4;->M(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :cond_1
    :goto_0
    invoke-static {p0, p1, v1}, Ldefpackage/v40;->o0(Ljava/lang/Iterable;Ldefpackage/if1;Z)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sub-int/2addr v0, v1

    .line 35
    const/4 v2, 0x0

    .line 36
    if-ltz v0, :cond_5

    .line 37
    .line 38
    move v3, v2

    .line 39
    move v4, v3

    .line 40
    :goto_1
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {p1, v5}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-ne v6, v1, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    if-eq v4, v3, :cond_4

    .line 58
    .line 59
    invoke-interface {p0, v4, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 63
    .line 64
    :goto_2
    if-eq v3, v0, :cond_6

    .line 65
    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_5
    move v4, v2

    .line 70
    :cond_6
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-ge v4, p1, :cond_8

    .line 75
    .line 76
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    sub-int/2addr p1, v1

    .line 81
    if-gt v4, p1, :cond_7

    .line 82
    .line 83
    :goto_3
    invoke-interface {p0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    if-eq p1, v4, :cond_7

    .line 87
    .line 88
    add-int/lit8 p1, p1, -0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    return v1

    .line 92
    :cond_8
    return v2
.end method

.method public static q0(Ljava/util/List;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "List is empty."

    .line 22
    .line 23
    invoke-static {p0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static r0(Ljava/util/AbstractList;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    add-int/lit8 v0, v0, -0x1

    .line 17
    .line 18
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
