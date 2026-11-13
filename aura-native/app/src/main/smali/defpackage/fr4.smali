.class public final Ldefpackage/fr4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/gr4;

.field public final b:Ljava/lang/String;

.field public c:Z

.field public d:Ldefpackage/ar4;

.field public final e:Ljava/util/ArrayList;

.field public f:Z


# direct methods
.method public constructor <init>(Ldefpackage/gr4;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/fr4;->a:Ldefpackage/gr4;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/fr4;->b:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Ldefpackage/fr4;->e:Ljava/util/ArrayList;

    .line 19
    .line 20
    return-void
.end method

.method public static c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ldefpackage/gr0;

    .line 11
    .line 12
    invoke-direct {v0, p1, p2}, Ldefpackage/gr0;-><init>(Ljava/lang/String;Ldefpackage/gf1;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1, p2}, Ldefpackage/fr4;->d(Ldefpackage/ar4;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic e(Ldefpackage/fr4;Ldefpackage/ar4;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, v1}, Ldefpackage/fr4;->d(Ldefpackage/ar4;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/fr4;->a:Ldefpackage/gr4;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/gr4;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/fr4;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Ldefpackage/gr4;->d(Ldefpackage/fr4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public final b()Z
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/fr4;->d:Ldefpackage/ar4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, v0, Ldefpackage/ar4;->b:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-boolean v1, p0, Ldefpackage/fr4;->f:Z

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Ldefpackage/fr4;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v2, v1

    .line 19
    const/4 v3, 0x0

    .line 20
    :goto_0
    const/4 v4, -0x1

    .line 21
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ldefpackage/ar4;

    .line 28
    .line 29
    iget-boolean v4, v4, Ldefpackage/ar4;->b:Z

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    iget-object v3, p0, Ldefpackage/fr4;->a:Ldefpackage/gr4;

    .line 34
    .line 35
    iget-object v3, v3, Ldefpackage/gr4;->b:Ljava/util/logging/Logger;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ldefpackage/ar4;

    .line 42
    .line 43
    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 44
    .line 45
    invoke-virtual {v3, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_1

    .line 50
    .line 51
    const-string v5, "canceled"

    .line 52
    .line 53
    invoke-static {v3, v4, p0, v5}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move v3, v1

    .line 60
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return v3
.end method

.method public final d(Ldefpackage/ar4;J)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/fr4;->a:Ldefpackage/gr4;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/gr4;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-boolean v2, p0, Ldefpackage/fr4;->c:Z

    .line 12
    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    iget-boolean p2, p1, Ldefpackage/ar4;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    iget-object p3, v0, Ldefpackage/gr4;->b:Ljava/util/logging/Logger;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    :try_start_1
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 22
    .line 23
    invoke-virtual {p3, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    const-string p2, "schedule canceled (queue is shutdown)"

    .line 30
    .line 31
    invoke-static {p3, p1, p0, p2}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    :try_start_2
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 42
    .line 43
    invoke-virtual {p3, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    const-string p2, "schedule failed (queue is shutdown)"

    .line 50
    .line 51
    invoke-static {p3, p1, p0, p2}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    new-instance p0, Ljava/util/concurrent/RejectedExecutionException;

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/util/concurrent/RejectedExecutionException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_3
    const/4 v2, 0x0

    .line 61
    invoke-virtual {p0, p1, p2, p3, v2}, Ldefpackage/fr4;->f(Ldefpackage/ar4;JZ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ldefpackage/gr4;->d(Ldefpackage/fr4;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 75
    .line 76
    .line 77
    throw p0
.end method

.method public final f(Ldefpackage/ar4;JZ)Z
    .locals 11

    .line 1
    iget-object v0, p0, Ldefpackage/fr4;->a:Ldefpackage/gr4;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/gr4;->b:Ljava/util/logging/Logger;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Ldefpackage/ar4;->c:Ldefpackage/fr4;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v1, p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-nez v1, :cond_9

    .line 15
    .line 16
    iput-object p0, p1, Ldefpackage/ar4;->c:Ldefpackage/fr4;

    .line 17
    .line 18
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    add-long v5, v3, p2

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/fr4;->e:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/4 v8, -0x1

    .line 31
    if-eq v7, v8, :cond_2

    .line 32
    .line 33
    iget-wide v9, p1, Ldefpackage/ar4;->d:J

    .line 34
    .line 35
    cmp-long v9, v9, v5

    .line 36
    .line 37
    if-gtz v9, :cond_1

    .line 38
    .line 39
    sget-object p2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_8

    .line 46
    .line 47
    const-string p2, "already scheduled"

    .line 48
    .line 49
    invoke-static {v0, p1, p0, p2}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return v2

    .line 53
    :cond_1
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_2
    iput-wide v5, p1, Ldefpackage/ar4;->d:J

    .line 57
    .line 58
    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 59
    .line 60
    invoke-virtual {v0, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_4

    .line 65
    .line 66
    if-eqz p4, :cond_3

    .line 67
    .line 68
    sub-long/2addr v5, v3

    .line 69
    invoke-static {v5, v6}, Ldefpackage/zz1;->n(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    const-string v5, "run again after "

    .line 74
    .line 75
    invoke-virtual {v5, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    sub-long/2addr v5, v3

    .line 81
    invoke-static {v5, v6}, Ldefpackage/zz1;->n(J)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    const-string v5, "scheduled after "

    .line 86
    .line 87
    invoke-virtual {v5, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p4

    .line 91
    :goto_1
    invoke-static {v0, p1, p0, p4}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    move p4, v2

    .line 99
    move v0, p4

    .line 100
    :goto_2
    if-ge v0, p0, :cond_6

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    check-cast v5, Ldefpackage/ar4;

    .line 109
    .line 110
    iget-wide v5, v5, Ldefpackage/ar4;->d:J

    .line 111
    .line 112
    sub-long/2addr v5, v3

    .line 113
    cmp-long v5, v5, p2

    .line 114
    .line 115
    if-lez v5, :cond_5

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_5
    add-int/lit8 p4, p4, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_6
    move p4, v8

    .line 122
    :goto_3
    if-ne p4, v8, :cond_7

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result p4

    .line 128
    :cond_7
    invoke-virtual {v1, p4, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    if-nez p4, :cond_8

    .line 132
    .line 133
    const/4 p0, 0x1

    .line 134
    return p0

    .line 135
    :cond_8
    return v2

    .line 136
    :cond_9
    const-string p0, "task is in multiple queues"

    .line 137
    .line 138
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return v2
.end method

.method public final g()V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/fr4;->a:Ldefpackage/gr4;

    .line 4
    .line 5
    iget-object v1, v0, Ldefpackage/gr4;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    :try_start_0
    iput-boolean v2, p0, Ldefpackage/fr4;->c:Z

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/fr4;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ldefpackage/gr4;->d(Ldefpackage/fr4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 30
    .line 31
    .line 32
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/fr4;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
