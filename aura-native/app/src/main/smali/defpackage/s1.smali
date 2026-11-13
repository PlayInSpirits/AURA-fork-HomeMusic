.class public Ldefpackage/s1;
.super Ljava/util/AbstractCollection;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Ldefpackage/s1;->n:I

    iput-object p2, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/AbstractMap;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ldefpackage/s1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/AbstractMap;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map;->clear()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p0, Ldefpackage/p60;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/p60;->clear()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p0, Ldefpackage/q1;

    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/q1;->clear()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p0, Ldefpackage/u1;

    .line 27
    .line 28
    invoke-interface {p0}, Ldefpackage/qz2;->clear()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_1
    check-cast v1, Ljava/util/AbstractMap;

    .line 14
    .line 15
    invoke-interface {v1, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_2
    check-cast v1, Ldefpackage/q1;

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ldefpackage/u1;->d(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_3
    instance-of p0, p1, Ljava/util/Map$Entry;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    check-cast p1, Ljava/util/Map$Entry;

    .line 32
    .line 33
    check-cast v1, Ldefpackage/u1;

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v1, p0, p1}, Ldefpackage/u1;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    :goto_0
    return p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/AbstractMap;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/AbstractMap;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v0, Ldefpackage/ig2;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ldefpackage/yw4;-><init>(Ljava/util/Iterator;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    check-cast p0, Ldefpackage/p60;

    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/p60;->c()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v0, Ldefpackage/m60;

    .line 42
    .line 43
    const/4 v1, 0x2

    .line 44
    invoke-direct {v0, p0, v1}, Ldefpackage/m60;-><init>(Ldefpackage/p60;I)V

    .line 45
    .line 46
    .line 47
    move-object p0, v0

    .line 48
    :goto_0
    return-object p0

    .line 49
    :pswitch_1
    check-cast p0, Ldefpackage/q1;

    .line 50
    .line 51
    new-instance v0, Ldefpackage/c1;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {v0, p0, v1}, Ldefpackage/c1;-><init>(Ldefpackage/q1;I)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_2
    check-cast p0, Ldefpackage/u1;

    .line 59
    .line 60
    invoke-virtual {p0}, Ldefpackage/u1;->h()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 5
    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :sswitch_0
    check-cast v2, Ljava/util/AbstractMap;

    .line 15
    .line 16
    :try_start_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {p1, v3}, Ldefpackage/si0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {v2, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    :cond_1
    :goto_0
    return v1

    .line 60
    :sswitch_1
    instance-of p0, p1, Ljava/util/Map$Entry;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    check-cast p1, Ljava/util/Map$Entry;

    .line 65
    .line 66
    check-cast v2, Ldefpackage/u1;

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {v2, p0, p1}, Ldefpackage/qz2;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    :cond_2
    return v1

    .line 81
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/AbstractMap;

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-super {p0, v1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    move-result p0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_1

    .line 26
    :catch_0
    new-instance p0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p1, p0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    :goto_1
    return p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object v0, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/AbstractMap;

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-object v1, p1

    .line 19
    check-cast v1, Ljava/util/Collection;

    .line 20
    .line 21
    invoke-super {p0, v1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 22
    .line 23
    .line 24
    move-result p0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_1

    .line 26
    :catch_0
    new-instance p0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/util/Map$Entry;

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {p1, v3}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p1, p0}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    :goto_1
    return p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/s1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/s1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/AbstractMap;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p0, Ldefpackage/p60;

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/p60;->size()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :pswitch_1
    check-cast p0, Ldefpackage/q1;

    .line 23
    .line 24
    iget p0, p0, Ldefpackage/q1;->s:I

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_2
    check-cast p0, Ldefpackage/u1;

    .line 28
    .line 29
    invoke-interface {p0}, Ldefpackage/qz2;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
