.class public final Ltp0;
.super Lt43;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt43;"
    }
.end annotation

.annotation runtime Ls43;
    value = "dialog"
.end annotation


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lld1;

.field public final e:Ljava/util/LinkedHashSet;

.field public final f:Lvv3;

.field public final g:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lld1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltp0;->c:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ltp0;->d:Lld1;

    .line 7
    .line 8
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ltp0;->e:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    new-instance p1, Lvv3;

    .line 16
    .line 17
    const/4 p2, 0x3

    .line 18
    invoke-direct {p1, p2, p0}, Lvv3;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ltp0;->f:Lvv3;

    .line 22
    .line 23
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Ltp0;->g:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Lr23;
    .locals 1

    .line 1
    new-instance v0, Lrp0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr23;-><init>(Lt43;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Ljava/util/List;Ly23;)V
    .locals 4

    .line 1
    iget-object p2, p0, Ltp0;->d:Lld1;

    .line 2
    .line 3
    invoke-virtual {p2}, Lld1;->N()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "DialogFragmentNavigator"

    .line 10
    .line 11
    const-string p1, "Ignoring navigate() call: FragmentManager has already saved its state"

    .line 12
    .line 13
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La23;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ltp0;->k(La23;)Lpp0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, v0, La23;->s:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, p2, v2}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v1, v1, Ld23;->e:Lvu3;

    .line 47
    .line 48
    iget-object v1, v1, Lvu3;->n:Lnl4;

    .line 49
    .line 50
    invoke-virtual {v1}, Lnl4;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v1}, Lq40;->D0(Ljava/util/List;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La23;

    .line 61
    .line 62
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v2, v2, Ld23;->f:Lvu3;

    .line 67
    .line 68
    iget-object v2, v2, Lvu3;->n:Lnl4;

    .line 69
    .line 70
    invoke-virtual {v2}, Lnl4;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/lang/Iterable;

    .line 75
    .line 76
    invoke-static {v2, v1}, Lq40;->s0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3, v0}, Ld23;->h(La23;)V

    .line 85
    .line 86
    .line 87
    if-eqz v1, :cond_1

    .line 88
    .line 89
    if-nez v2, :cond_1

    .line 90
    .line 91
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0, v1}, Ld23;->b(La23;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    return-void
.end method

.method public final e(Ld23;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lt43;->a:Ld23;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lt43;->b:Z

    .line 5
    .line 6
    iget-object p1, p1, Ld23;->e:Lvu3;

    .line 7
    .line 8
    iget-object p1, p1, Lvu3;->n:Lnl4;

    .line 9
    .line 10
    invoke-virtual {p1}, Lnl4;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v1, p0, Ltp0;->d:Lld1;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, La23;

    .line 33
    .line 34
    iget-object v2, v0, La23;->s:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lpp0;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-object v1, v1, Lkc1;->c0:Lea2;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v0, p0, Ltp0;->f:Lvv3;

    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lea2;->a(Laa2;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object v1, p0, Ltp0;->e:Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    iget-object v0, v0, La23;->s:Ljava/lang/String;

    .line 57
    .line 58
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance p1, Lqp0;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lqp0;-><init>(Ltp0;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v1, Lld1;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final f(La23;)V
    .locals 6

    .line 1
    iget-object v0, p1, La23;->s:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ltp0;->d:Lld1;

    .line 4
    .line 5
    invoke-virtual {v1}, Lld1;->N()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string p0, "DialogFragmentNavigator"

    .line 12
    .line 13
    const-string p1, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state"

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v2, p0, Ltp0;->g:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lpp0;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    instance-of v4, v2, Lpp0;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    check-cast v2, Lpp0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v2, v3

    .line 42
    :cond_2
    :goto_0
    if-eqz v2, :cond_3

    .line 43
    .line 44
    iget-object v4, v2, Lkc1;->c0:Lea2;

    .line 45
    .line 46
    iget-object v5, p0, Ltp0;->f:Lvv3;

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Lea2;->f(Laa2;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lpp0;->h0()V

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p0, p1}, Ltp0;->k(La23;)Lpp0;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2, v1, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object v1, p0, Ld23;->e:Lvu3;

    .line 66
    .line 67
    iget-object v1, v1, Lvu3;->n:Lnl4;

    .line 68
    .line 69
    invoke-virtual {v1}, Lnl4;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    :cond_4
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    check-cast v2, La23;

    .line 94
    .line 95
    iget-object v4, v2, La23;->s:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v4, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    iget-object v0, p0, Ld23;->c:Lnl4;

    .line 104
    .line 105
    invoke-virtual {v0}, Lnl4;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/util/Set;

    .line 110
    .line 111
    invoke-static {v1, v2}, Lkb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {v1, p1}, Lkb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v0, v3, v1}, Lnl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p1}, Ld23;->c(La23;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    const-string p0, "List contains no element matching the predicate."

    .line 127
    .line 128
    invoke-static {p0}, Lkf2;->m(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public final i(La23;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltp0;->d:Lld1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lld1;->N()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const-string p0, "DialogFragmentNavigator"

    .line 13
    .line 14
    const-string p1, "Ignoring popBackStack() call: FragmentManager has already saved its state"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v1, v1, Ld23;->e:Lvu3;

    .line 25
    .line 26
    iget-object v1, v1, Lvu3;->n:Lnl4;

    .line 27
    .line 28
    invoke-virtual {v1}, Lnl4;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-interface {v1, v2, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Lq40;->H0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, La23;

    .line 65
    .line 66
    iget-object v3, v3, La23;->s:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Lld1;->D(Ljava/lang/String;)Lkc1;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    check-cast v3, Lpp0;

    .line 75
    .line 76
    invoke-virtual {v3}, Lpp0;->h0()V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    invoke-virtual {p0, v2, p1, p2}, Ltp0;->l(ILa23;Z)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final k(La23;)Lpp0;
    .locals 7

    .line 1
    iget-object v0, p1, La23;->o:Lr23;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast v0, Lrp0;

    .line 7
    .line 8
    iget-object v1, v0, Lrp0;->x:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "DialogFragment class was not set"

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/16 v5, 0x2e

    .line 21
    .line 22
    iget-object v6, p0, Ltp0;->c:Landroid/content/Context;

    .line 23
    .line 24
    if-ne v4, v5, :cond_0

    .line 25
    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_0
    iget-object v4, p0, Ltp0;->d:Lld1;

    .line 46
    .line 47
    invoke-virtual {v4}, Lld1;->F()Ldd1;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v1}, Ldd1;->a(Ljava/lang/String;)Lkc1;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-class v4, Lpp0;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    check-cast v1, Lpp0;

    .line 74
    .line 75
    invoke-virtual {p1}, La23;->c()Landroid/os/Bundle;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, v1, Lkc1;->c0:Lea2;

    .line 83
    .line 84
    iget-object v2, p0, Ltp0;->f:Lvv3;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lea2;->a(Laa2;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, Ltp0;->g:Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    iget-object p1, p1, La23;->s:Ljava/lang/String;

    .line 92
    .line 93
    invoke-interface {p0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    const-string p1, "Dialog destination "

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v0, Lrp0;->x:Ljava/lang/String;

    .line 105
    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    const-string v0, " is not an instance of DialogFragment"

    .line 109
    .line 110
    invoke-static {p0, p1, v0}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_2
    invoke-static {v3}, Lkf2;->o(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v2

    .line 122
    :cond_3
    invoke-static {v3}, Lkf2;->o(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v2
.end method

.method public final l(ILa23;Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Ld23;->e:Lvu3;

    .line 6
    .line 7
    iget-object v0, v0, Lvu3;->n:Lnl4;

    .line 8
    .line 9
    invoke-virtual {v0}, Lnl4;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    add-int/lit8 p1, p1, -0x1

    .line 16
    .line 17
    invoke-static {v0, p1}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La23;

    .line 22
    .line 23
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, Ld23;->f:Lvu3;

    .line 28
    .line 29
    iget-object v0, v0, Lvu3;->n:Lnl4;

    .line 30
    .line 31
    invoke-virtual {v0}, Lnl4;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-static {v0, p1}, Lq40;->s0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, p2, p3}, Ld23;->f(La23;Z)V

    .line 46
    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, p1}, Ld23;->b(La23;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method
