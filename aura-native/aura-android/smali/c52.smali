.class public final Lc52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lkk1;


# instance fields
.field public a:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lz40;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lrr;

    .line 5
    .line 6
    iget-object v1, p1, Lz40;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lxb0;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Lrr;-><init>(Lxb0;I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lrr;

    .line 15
    .line 16
    iget-object v3, p1, Lz40;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lsr;

    .line 19
    .line 20
    invoke-direct {v1, v3}, Lrr;-><init>(Lsr;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Lrr;

    .line 24
    .line 25
    iget-object v4, p1, Lz40;->r:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lxb0;

    .line 28
    .line 29
    const/4 v5, 0x4

    .line 30
    invoke-direct {v3, v4, v5}, Lrr;-><init>(Lxb0;I)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Lrr;

    .line 34
    .line 35
    iget-object v6, p1, Lz40;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v6, Lxb0;

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    invoke-direct {v4, v6, v7}, Lrr;-><init>(Lxb0;I)V

    .line 41
    .line 42
    .line 43
    new-instance v8, Lrr;

    .line 44
    .line 45
    const/4 v9, 0x3

    .line 46
    invoke-direct {v8, v6, v9}, Lrr;-><init>(Lxb0;I)V

    .line 47
    .line 48
    .line 49
    new-instance v10, Ln53;

    .line 50
    .line 51
    invoke-direct {v10, v6}, Ln53;-><init>(Lxb0;)V

    .line 52
    .line 53
    .line 54
    new-instance v11, Lm53;

    .line 55
    .line 56
    invoke-direct {v11, v6}, Lm53;-><init>(Lxb0;)V

    .line 57
    .line 58
    .line 59
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 v12, 0x1c

    .line 62
    .line 63
    if-lt v6, v12, :cond_0

    .line 64
    .line 65
    iget-object p1, p1, Lz40;->n:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Landroid/content/Context;

    .line 68
    .line 69
    sget-object v6, Llc5;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    const-string v6, "connectivity"

    .line 75
    .line 76
    invoke-virtual {p1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p1, Landroid/net/ConnectivityManager;

    .line 84
    .line 85
    new-instance v6, Lp53;

    .line 86
    .line 87
    invoke-direct {v6, p1}, Lp53;-><init>(Landroid/net/ConnectivityManager;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const/4 v6, 0x0

    .line 92
    :goto_0
    const/16 p1, 0x8

    .line 93
    .line 94
    new-array p1, p1, [Ljb0;

    .line 95
    .line 96
    aput-object v0, p1, v2

    .line 97
    .line 98
    const/4 v0, 0x1

    .line 99
    aput-object v1, p1, v0

    .line 100
    .line 101
    aput-object v3, p1, v7

    .line 102
    .line 103
    aput-object v4, p1, v9

    .line 104
    .line 105
    aput-object v8, p1, v5

    .line 106
    .line 107
    const/4 v0, 0x5

    .line 108
    aput-object v10, p1, v0

    .line 109
    .line 110
    const/4 v0, 0x6

    .line 111
    aput-object v11, p1, v0

    .line 112
    .line 113
    const/4 v0, 0x7

    .line 114
    aput-object v6, p1, v0

    .line 115
    .line 116
    invoke-static {p1}, Lti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 124
    .line 125
    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lc52;->b(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object v0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void

    .line 28
    :cond_2
    const-string p0, "category must not be null"

    .line 29
    .line 30
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public c(Ldd5;)Z
    .locals 8

    .line 1
    iget-object p0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    move-object v4, v3

    .line 22
    check-cast v4, Ljb0;

    .line 23
    .line 24
    invoke-interface {v4, p1}, Ljb0;->a(Ldd5;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-nez p0, :cond_2

    .line 39
    .line 40
    invoke-static {}, Lcx;->f()Lcx;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object v6, Llc5;->a:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v7, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v1, "Work "

    .line 49
    .line 50
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p1, Ldd5;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p1, " constrained by "

    .line 59
    .line 60
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    sget-object v4, Lk5;->C:Lk5;

    .line 64
    .line 65
    const/16 v5, 0x1f

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    const/4 v2, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static/range {v0 .. v5}, Lq40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lif1;I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p0, v6, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method public d()Lrq2;
    .locals 3

    .line 1
    iget-object v0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lrq2;->c:Lrq2;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "controlCategories"

    .line 14
    .line 15
    iget-object v2, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lrq2;

    .line 21
    .line 22
    iget-object p0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1, v0, p0}, Lrq2;-><init>(Landroid/os/Bundle;Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method

.method public declared-synchronized e(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_2

    .line 20
    :cond_0
    :try_start_1
    iget-object v1, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, 0x0

    .line 27
    move v4, v3

    .line 28
    :cond_1
    :goto_0
    if-ge v4, v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    check-cast v5, Lnw4;

    .line 37
    .line 38
    iget-object v6, v5, Lnw4;->a:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {v6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    iget-object v6, v5, Lnw4;->b:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {p2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_2

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v6, v3

    .line 57
    :goto_1
    if-eqz v6, :cond_1

    .line 58
    .line 59
    iget-object v6, v5, Lnw4;->b:Ljava/lang/Class;

    .line 60
    .line 61
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_1

    .line 66
    .line 67
    iget-object v5, v5, Lnw4;->b:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    monitor-exit p0

    .line 74
    return-object v0

    .line 75
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    throw p1
.end method

.method public f(Ldd5;)Lp81;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    move-object v5, v4

    .line 26
    check-cast v5, Ljb0;

    .line 27
    .line 28
    invoke-interface {v5, p1}, Ljb0;->c(Ldd5;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 39
    .line 40
    const/16 v1, 0xa

    .line 41
    .line 42
    invoke-static {v0, v1}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    move v3, v2

    .line 54
    :goto_1
    if-ge v3, v1, :cond_2

    .line 55
    .line 56
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    check-cast v4, Ljb0;

    .line 63
    .line 64
    iget-object v5, p1, Ldd5;->j:Lmc0;

    .line 65
    .line 66
    invoke-interface {v4, v5}, Ljb0;->b(Lmc0;)Lny;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {p0}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-array p1, v2, [Lp81;

    .line 79
    .line 80
    invoke-interface {p0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    check-cast p0, [Lp81;

    .line 85
    .line 86
    new-instance p1, Lgc0;

    .line 87
    .line 88
    const/4 v0, 0x2

    .line 89
    invoke-direct {p1, v0, p0}, Lgc0;-><init>(ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Lya4;->m(Lp81;)Lp81;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method

.method public keyOf(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method public sourceIterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    iget-object p0, p0, Lc52;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
