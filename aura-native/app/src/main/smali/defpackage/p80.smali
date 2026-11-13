.class public abstract Ldefpackage/p80;
.super Ldefpackage/bq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final h:Ljava/util/HashMap;

.field public i:Landroid/os/Handler;

.field public j:Ldefpackage/rw4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/bq;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

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
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ldefpackage/o80;

    .line 22
    .line 23
    iget-object v1, v0, Ldefpackage/o80;->a:Ldefpackage/bq;

    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/o80;->b:Ldefpackage/m80;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ldefpackage/bq;->c(Ldefpackage/nt2;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

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
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ldefpackage/o80;

    .line 22
    .line 23
    iget-object v1, v0, Ldefpackage/o80;->a:Ldefpackage/bq;

    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/o80;->b:Ldefpackage/m80;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ldefpackage/bq;->e(Ldefpackage/nt2;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void
.end method

.method public j()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

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
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ldefpackage/o80;

    .line 22
    .line 23
    iget-object v0, v0, Ldefpackage/o80;->a:Ldefpackage/bq;

    .line 24
    .line 25
    invoke-virtual {v0}, Ldefpackage/bq;->j()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public p()V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

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
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ldefpackage/o80;

    .line 22
    .line 23
    iget-object v2, v1, Ldefpackage/o80;->a:Ldefpackage/bq;

    .line 24
    .line 25
    iget-object v3, v1, Ldefpackage/o80;->c:Ldefpackage/n80;

    .line 26
    .line 27
    iget-object v1, v1, Ldefpackage/o80;->b:Ldefpackage/m80;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ldefpackage/bq;->o(Ldefpackage/nt2;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ldefpackage/bq;->r(Ldefpackage/st2;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ldefpackage/bq;->q(Ldefpackage/tw0;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public abstract t(Ljava/lang/Object;Ldefpackage/mt2;)Ldefpackage/mt2;
.end method

.method public u(JLjava/lang/Object;)J
    .locals 0

    .line 1
    return-wide p1
.end method

.method public v(ILjava/lang/Object;)I
    .locals 0

    .line 1
    return p1
.end method

.method public abstract w(Ljava/lang/Object;Ldefpackage/bq;Ldefpackage/cu4;)V
.end method

.method public final x(Ljava/lang/Integer;Ldefpackage/bq;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    xor-int/lit8 v1, v1, 0x1

    .line 8
    .line 9
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ldefpackage/m80;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1}, Ldefpackage/m80;-><init>(Ldefpackage/p80;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ldefpackage/n80;

    .line 18
    .line 19
    invoke-direct {v2, p0, p1}, Ldefpackage/n80;-><init>(Ldefpackage/p80;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ldefpackage/o80;

    .line 23
    .line 24
    invoke-direct {v3, p2, v1, v2}, Ldefpackage/o80;-><init>(Ldefpackage/bq;Ldefpackage/m80;Ldefpackage/n80;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Ldefpackage/p80;->i:Landroid/os/Handler;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, p2, Ldefpackage/bq;->c:Ldefpackage/ue1;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 46
    .line 47
    new-instance v3, Ldefpackage/rt2;

    .line 48
    .line 49
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, v3, Ldefpackage/rt2;->a:Landroid/os/Handler;

    .line 53
    .line 54
    iput-object v2, v3, Ldefpackage/rt2;->b:Ldefpackage/st2;

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Ldefpackage/p80;->i:Landroid/os/Handler;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v0, p2, Ldefpackage/bq;->d:Ldefpackage/sw0;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, Ldefpackage/sw0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    new-instance v3, Ldefpackage/rw0;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, v3, Ldefpackage/rw0;->a:Landroid/os/Handler;

    .line 77
    .line 78
    iput-object v2, v3, Ldefpackage/rw0;->b:Ldefpackage/tw0;

    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Ldefpackage/p80;->j:Ldefpackage/rw4;

    .line 84
    .line 85
    iget-object v0, p0, Ldefpackage/bq;->g:Ldefpackage/ik3;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v1, p1, v0}, Ldefpackage/bq;->k(Ldefpackage/nt2;Ldefpackage/rw4;Ldefpackage/ik3;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Ldefpackage/bq;->b:Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_0

    .line 100
    .line 101
    invoke-virtual {p2, v1}, Ldefpackage/bq;->c(Ldefpackage/nt2;)V

    .line 102
    .line 103
    .line 104
    :cond_0
    return-void
.end method

.method public final y(Ljava/lang/Integer;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/p80;->h:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/o80;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Ldefpackage/o80;->a:Ldefpackage/bq;

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/o80;->b:Ldefpackage/m80;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ldefpackage/bq;->o(Ldefpackage/nt2;)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/o80;->c:Ldefpackage/n80;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Ldefpackage/bq;->r(Ldefpackage/st2;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ldefpackage/bq;->q(Ldefpackage/tw0;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
