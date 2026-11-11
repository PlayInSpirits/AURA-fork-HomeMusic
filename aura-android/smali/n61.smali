.class public abstract Ln61;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/HashMap;

.field public static final b:Ljava/util/HashMap;

.field public static final c:Ljava/util/HashMap;

.field public static d:J

.field public static volatile e:Lmq;

.field public static final f:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile g:Ler1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln61;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ln61;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Ln61;->c:Ljava/util/HashMap;

    .line 21
    .line 22
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Ln61;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    return-void
.end method

.method public static declared-synchronized a(Ll61;)V
    .locals 2

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    :try_start_0
    iput-boolean v1, p0, Ll61;->d:Z

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, Ll61;->e:Z

    .line 13
    .line 14
    iget-object p0, p0, Ll61;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Ln61;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ln61;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method

.method public static b()V
    .locals 2

    .line 1
    sget-object v0, Ln61;->e:Lmq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lmq;->run()V

    .line 6
    .line 7
    .line 8
    :cond_0
    sget-object v0, Ln61;->f:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/Runnable;

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ln61;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ll61;

    .line 13
    .line 14
    :goto_0
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    iget-object v3, p0, Ll61;->f:Lk61;

    .line 19
    .line 20
    iget-boolean v4, p0, Ll61;->e:Z

    .line 21
    .line 22
    xor-int/2addr v2, v4

    .line 23
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v4, Lj61;

    .line 28
    .line 29
    invoke-direct {v4, v1}, Lj61;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v3, v2, v4}, Ljava/util/Map;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ll61;->c:Ll61;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lk61;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v4, v3, Lk61;->f:Z

    .line 75
    .line 76
    if-eq v0, v4, :cond_1

    .line 77
    .line 78
    iput-boolean v0, v3, Lk61;->f:Z

    .line 79
    .line 80
    iget-object v9, v3, Lk61;->e:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iput-object v4, v3, Lk61;->e:Ljava/lang/String;

    .line 91
    .line 92
    sget-object v4, Ln61;->g:Ler1;

    .line 93
    .line 94
    if-eqz v4, :cond_1

    .line 95
    .line 96
    sget-object v4, Ln61;->g:Ler1;

    .line 97
    .line 98
    iget v5, v3, Lk61;->a:I

    .line 99
    .line 100
    iget-object v6, v3, Lk61;->b:Ljava/lang/String;

    .line 101
    .line 102
    iget-boolean v7, v3, Lk61;->c:Z

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    if-nez v7, :cond_3

    .line 108
    .line 109
    move v7, v2

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    move v7, v1

    .line 112
    :goto_2
    iget-object v8, v3, Lk61;->e:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v0, v3, Lk61;->d:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    xor-int/lit8 v10, v0, 0x1

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-static/range {v5 .. v10}, Ler1;->p(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    return-void
.end method

.method public static declared-synchronized d()J
    .locals 3

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-wide v1, Ln61;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-wide v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
.end method

.method public static e(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p0, v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq p0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    const-string p0, "ARTIST"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    throw p0

    .line 20
    :cond_1
    const-string p0, "ALBUM"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const-string p0, "SONG"

    .line 24
    .line 25
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ":"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :goto_1
    sget-object p1, Ln61;->c:Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-object p0
.end method

.method public static declared-synchronized f(ILjava/lang/String;Z)Z
    .locals 3

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    sget-object v1, Ln61;->a:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-static {p0, p1}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ll61;

    .line 17
    .line 18
    :goto_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-boolean v2, v1, Ll61;->e:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v1, v1, Ll61;->c:Ll61;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    const/4 v1, 0x0

    .line 30
    :cond_1
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget-boolean p0, v1, Ll61;->b:Z

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    sget-object v1, Ln61;->b:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-static {p0, p1}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v1, p0, p1}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    return p0

    .line 57
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0
.end method

.method public static declared-synchronized g(ILjava/lang/String;Z)Ll61;
    .locals 3

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    invoke-static {p0, p1, p2, v1, v2}, Ln61;->h(ILjava/lang/String;ZLjava/lang/String;Z)Ll61;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw p0
.end method

.method public static declared-synchronized h(ILjava/lang/String;ZLjava/lang/String;Z)Ll61;
    .locals 10

    .line 1
    const-class v1, Ln61;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    monitor-exit v1

    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v2, Ln61;->a:Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Ll61;

    .line 20
    .line 21
    :goto_0
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget-boolean v4, v3, Ll61;->e:Z

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    iget-object v3, v3, Ll61;->c:Ll61;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    if-eqz v3, :cond_3

    .line 31
    .line 32
    iget-boolean v4, v3, Ll61;->b:Z

    .line 33
    .line 34
    if-eq v4, p2, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 v4, 0x0

    .line 38
    goto :goto_2

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p0, v0

    .line 41
    goto :goto_4

    .line 42
    :cond_3
    :goto_1
    const/4 v4, 0x1

    .line 43
    :goto_2
    if-eqz v4, :cond_5

    .line 44
    .line 45
    if-nez p3, :cond_4

    .line 46
    .line 47
    new-instance p3, Lk61;

    .line 48
    .line 49
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {p3, p1, p0, v3, p2}, Lk61;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    new-instance v3, Lk61;

    .line 62
    .line 63
    invoke-direct {v3, p1, p0, p3, p2}, Lk61;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    move-object p3, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_5
    iget-object p3, v3, Ll61;->f:Lk61;

    .line 69
    .line 70
    :goto_3
    new-instance v3, Ll61;

    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, Ll61;

    .line 77
    .line 78
    invoke-direct {v3, v0, p2, v5, p3}, Ll61;-><init>(Ljava/lang/String;ZLl61;Lk61;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Ln61;->b()V

    .line 85
    .line 86
    .line 87
    if-eqz p4, :cond_6

    .line 88
    .line 89
    if-eqz v4, :cond_6

    .line 90
    .line 91
    sget-object p4, Ln61;->g:Ler1;

    .line 92
    .line 93
    if-eqz p4, :cond_6

    .line 94
    .line 95
    sget-object p4, Ln61;->g:Ler1;

    .line 96
    .line 97
    iget-object v7, p3, Lk61;->d:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    move v4, p0

    .line 105
    move-object v5, p1

    .line 106
    move v6, p2

    .line 107
    invoke-static/range {v4 .. v9}, Ler1;->p(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    :cond_6
    monitor-exit v1

    .line 111
    return-object v3

    .line 112
    :goto_4
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    throw p0
.end method

.method public static declared-synchronized i(JLjava/util/List;)V
    .locals 3

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-wide v1, Ln61;->d:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    cmp-long p0, p0, v1

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_1
    sget-object p0, Ln61;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/util/HashMap;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

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
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lm61;

    .line 32
    .line 33
    sget-object p2, Ln61;->b:Ljava/util/HashMap;

    .line 34
    .line 35
    iget v1, p1, Lm61;->a:I

    .line 36
    .line 37
    iget-object v2, p1, Lm61;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v2}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-boolean p1, p1, Lm61;->c:Z

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p2, v1, p1}, Ljava/util/HashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-static {}, Ln61;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-void

    .line 60
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    throw p0
.end method

.method public static declared-synchronized j(Ll61;)V
    .locals 4

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :cond_0
    move-object v1, p0

    .line 9
    :goto_0
    if-eqz v1, :cond_3

    .line 10
    .line 11
    :try_start_0
    iget-boolean v2, v1, Ll61;->e:Z

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget-boolean v2, v1, Ll61;->d:Z

    .line 17
    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    iget-boolean v2, v1, Ll61;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p0, Ll61;->b:Z

    .line 23
    .line 24
    if-eq v2, v3, :cond_2

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    const/4 v2, 0x1

    .line 28
    iput-boolean v2, v1, Ll61;->e:Z

    .line 29
    .line 30
    :goto_1
    iget-object v1, v1, Ll61;->c:Ll61;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    :goto_2
    iget-object p0, p0, Ll61;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Ln61;->c(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ln61;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p0
.end method

.method public static declared-synchronized k(ILjava/lang/String;Z)V
    .locals 3

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    sget-object v1, Ln61;->a:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-static {p0, p1}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ll61;

    .line 19
    .line 20
    :goto_0
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-boolean v2, v1, Ll61;->d:Z

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    iget-boolean v2, v1, Ll61;->b:Z

    .line 27
    .line 28
    if-eq v2, p2, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    iput-boolean v2, v1, Ll61;->e:Z

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    iget-object v1, v1, Ll61;->c:Ll61;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p0, p1}, Ln61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Ln61;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Ln61;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    throw p0
.end method

.method public static declared-synchronized l(Ll61;)V
    .locals 2

    .line 1
    const-class v0, Ln61;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    :try_start_0
    iget-boolean v1, p0, Ll61;->d:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, p0, Ll61;->e:Z

    .line 13
    .line 14
    iget-object p0, p0, Ll61;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Ln61;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ln61;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_0
    monitor-exit v0

    .line 28
    return-void
.end method
