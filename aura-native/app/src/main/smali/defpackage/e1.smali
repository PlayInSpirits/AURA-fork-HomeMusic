.class public Ldefpackage/e1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/util/Iterator;

.field public p:Ljava/lang/Object;

.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/e1;->n:I

    .line 31
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v1, Ldefpackage/k90;

    iput-object v1, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 34
    invoke-static {v1, v0}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    const/4 v0, 0x0

    .line 36
    iput-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/f1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/e1;->n:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 42
    iget-object p1, p1, Ldefpackage/f1;->p:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ldefpackage/g1;Ljava/util/Iterator;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/e1;->n:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    iput-object p1, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/m1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldefpackage/e1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/m1;->o:Ljava/util/Collection;

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 12
    .line 13
    instance-of v0, p1, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    iput-object p1, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Ldefpackage/o1;Ljava/util/ListIterator;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/e1;->n:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 38
    iget-object p1, p1, Ldefpackage/m1;->o:Ljava/util/Collection;

    iput-object p1, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 39
    iput-object p2, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 2
    .line 3
    :goto_0
    iget-object v1, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Ldefpackage/e1;->p:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/ServiceConfigurationError; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    instance-of v2, v2, Ljava/lang/SecurityException;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    throw v1

    .line 33
    :cond_2
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/m1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/m1;->b()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Ldefpackage/m1;->o:Ljava/util/Collection;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/util/Collection;

    .line 13
    .line 14
    if-ne v0, p0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->c()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/e1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/e1;->a()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/e1;->b()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :pswitch_1
    iget-object p0, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :pswitch_2
    iget-object p0, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/e1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/e1;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v2, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    check-cast v1, Ljava/lang/Class;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "No more elements for service "

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-object v2

    .line 39
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/e1;->b()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/Map$Entry;

    .line 52
    .line 53
    iput-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/util/Collection;

    .line 71
    .line 72
    iput-object v2, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Ldefpackage/f1;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ldefpackage/f1;->a(Ljava/util/Map$Entry;)Ldefpackage/sw1;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/e1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "no calls to next() since the last call to remove()"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, Ldefpackage/e1;->o:Ljava/util/Iterator;

    .line 9
    .line 10
    iget-object v6, p0, Ldefpackage/e1;->q:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    check-cast v6, Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "service="

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :pswitch_0
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 34
    .line 35
    .line 36
    check-cast v6, Ldefpackage/m1;

    .line 37
    .line 38
    iget-object p0, v6, Ldefpackage/m1;->r:Ldefpackage/q1;

    .line 39
    .line 40
    iget v0, p0, Ldefpackage/q1;->s:I

    .line 41
    .line 42
    sub-int/2addr v0, v4

    .line 43
    iput v0, p0, Ldefpackage/q1;->s:I

    .line 44
    .line 45
    invoke-virtual {v6}, Ldefpackage/m1;->d()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    iget-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Ljava/util/Map$Entry;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    move v3, v4

    .line 56
    :cond_0
    invoke-static {v2, v3}, Ldefpackage/rr2;->v(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/Map$Entry;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/util/Collection;

    .line 68
    .line 69
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 70
    .line 71
    .line 72
    check-cast v6, Ldefpackage/g1;

    .line 73
    .line 74
    iget-object v2, v6, Ldefpackage/g1;->o:Ldefpackage/q1;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    iget v4, v2, Ldefpackage/q1;->s:I

    .line 81
    .line 82
    sub-int/2addr v4, v3

    .line 83
    iput v4, v2, Ldefpackage/q1;->s:I

    .line 84
    .line 85
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_2
    iget-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/util/Collection;

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    move v3, v4

    .line 98
    :cond_1
    invoke-static {v2, v3}, Ldefpackage/rr2;->v(Ljava/lang/String;Z)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    .line 102
    .line 103
    .line 104
    check-cast v6, Ldefpackage/f1;

    .line 105
    .line 106
    iget-object v0, v6, Ldefpackage/f1;->q:Ldefpackage/q1;

    .line 107
    .line 108
    iget-object v2, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Ljava/util/Collection;

    .line 111
    .line 112
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    iget v3, v0, Ldefpackage/q1;->s:I

    .line 117
    .line 118
    sub-int/2addr v3, v2

    .line 119
    iput v3, v0, Ldefpackage/q1;->s:I

    .line 120
    .line 121
    iget-object v0, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Ljava/util/Collection;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    .line 126
    .line 127
    .line 128
    iput-object v1, p0, Ldefpackage/e1;->p:Ljava/lang/Object;

    .line 129
    .line 130
    return-void

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
