.class public final Ldefpackage/pp3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public b:J

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 56
    iput-wide v0, p0, Ldefpackage/pp3;->b:J

    .line 57
    iput-object p1, p0, Ldefpackage/pp3;->c:Ljava/lang/Object;

    .line 58
    invoke-static {p1}, Ldefpackage/pp3;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 59
    iput-object p1, p0, Ldefpackage/pp3;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Ldefpackage/pp3;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldefpackage/ja;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/pp3;->c:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ldefpackage/pp3;->d:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, Ldefpackage/z;

    .line 15
    .line 16
    const/16 v0, 0xd

    .line 17
    .line 18
    invoke-direct {p1, v0, p0}, Ldefpackage/z;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ldefpackage/pp3;->e:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance p1, Ldefpackage/kl3;

    .line 24
    .line 25
    const/16 v0, 0xb

    .line 26
    .line 27
    invoke-direct {p1, v0, p0}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Ldefpackage/pp3;->f:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance p1, Ldefpackage/f13;

    .line 33
    .line 34
    const/16 v0, 0x10

    .line 35
    .line 36
    new-array v0, v0, [Ldefpackage/sh4;

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Ldefpackage/pp3;->g:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance p1, Ljava/lang/Object;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 49
    .line 50
    const-wide/16 v0, -0x1

    .line 51
    .line 52
    iput-wide v0, p0, Ldefpackage/pp3;->b:J

    .line 53
    .line 54
    return-void
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "_preferences"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public a()Z
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Ldefpackage/pp3;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    iget-object v2, p0, Ldefpackage/pp3;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    :goto_1
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x1

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    goto :goto_4

    .line 25
    :cond_1
    instance-of v6, v3, Ljava/util/Set;

    .line 26
    .line 27
    if-eqz v6, :cond_2

    .line 28
    .line 29
    move-object v6, v3

    .line 30
    check-cast v6, Ljava/util/Set;

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_2
    instance-of v6, v3, Ljava/util/List;

    .line 34
    .line 35
    if-eqz v6, :cond_b

    .line 36
    .line 37
    move-object v6, v3

    .line 38
    check-cast v6, Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    check-cast v7, Ljava/util/Set;

    .line 45
    .line 46
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    const/4 v9, 0x2

    .line 51
    if-ne v8, v9, :cond_3

    .line 52
    .line 53
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-le v8, v9, :cond_4

    .line 63
    .line 64
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-interface {v6, v5, v4}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    :cond_4
    :goto_2
    move-object v6, v7

    .line 73
    :cond_5
    :goto_3
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_a

    .line 78
    .line 79
    move-object v4, v6

    .line 80
    :goto_4
    if-nez v4, :cond_6

    .line 81
    .line 82
    return v1

    .line 83
    :cond_6
    iget-object v2, p0, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 84
    .line 85
    monitor-enter v2

    .line 86
    :try_start_1
    iget-object v3, p0, Ldefpackage/pp3;->g:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v3, Ldefpackage/f13;

    .line 89
    .line 90
    iget-object v6, v3, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 91
    .line 92
    iget v3, v3, Ldefpackage/f13;->p:I

    .line 93
    .line 94
    move v7, v0

    .line 95
    :goto_5
    if-ge v7, v3, :cond_9

    .line 96
    .line 97
    aget-object v8, v6, v7

    .line 98
    .line 99
    check-cast v8, Ldefpackage/sh4;

    .line 100
    .line 101
    invoke-virtual {v8, v4}, Ldefpackage/sh4;->a(Ljava/util/Set;)Z

    .line 102
    .line 103
    .line 104
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    if-nez v8, :cond_8

    .line 106
    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_7
    move v1, v0

    .line 111
    goto :goto_7

    .line 112
    :cond_8
    :goto_6
    move v1, v5

    .line 113
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto :goto_8

    .line 118
    :cond_9
    monitor-exit v2

    .line 119
    goto :goto_0

    .line 120
    :goto_8
    monitor-exit v2

    .line 121
    throw p0

    .line 122
    :cond_a
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-eq v7, v3, :cond_5

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_b
    const-string p0, "Unexpected notification"

    .line 130
    .line 131
    invoke-static {p0}, Ldefpackage/l80;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 132
    .line 133
    .line 134
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 135
    .line 136
    .line 137
    return v0

    .line 138
    :catchall_1
    move-exception p0

    .line 139
    monitor-exit v0

    .line 140
    throw p0
.end method

.method public c()Landroid/content/SharedPreferences$Editor;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/pp3;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/pp3;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/content/SharedPreferences$Editor;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/pp3;->d()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ldefpackage/pp3;->e:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object p0, p0, Ldefpackage/pp3;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p0}, Ldefpackage/pp3;->d()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public d()Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/pp3;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/pp3;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/pp3;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Ldefpackage/pp3;->d:Ljava/lang/Object;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Ldefpackage/pp3;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/content/SharedPreferences;

    .line 25
    .line 26
    return-object p0
.end method

.method public e(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/gf1;)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-object v5, v1, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 12
    .line 13
    monitor-enter v5

    .line 14
    :try_start_0
    iget-object v6, v1, Ldefpackage/pp3;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v6, Ldefpackage/f13;

    .line 17
    .line 18
    iget-object v7, v6, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 19
    .line 20
    iget v8, v6, Ldefpackage/f13;->p:I

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    :goto_0
    if-ge v10, v8, :cond_1

    .line 24
    .line 25
    aget-object v12, v7, v10

    .line 26
    .line 27
    move-object v13, v12

    .line 28
    check-cast v13, Ldefpackage/sh4;

    .line 29
    .line 30
    iget-object v13, v13, Ldefpackage/sh4;->a:Ldefpackage/if1;

    .line 31
    .line 32
    if-ne v13, v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v12, 0x0

    .line 39
    :goto_1
    check-cast v12, Ldefpackage/sh4;

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    if-nez v12, :cond_2

    .line 43
    .line 44
    new-instance v12, Ldefpackage/sh4;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v7, v2}, Ldefpackage/jz4;->j(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v12, v2}, Ldefpackage/sh4;-><init>(Ldefpackage/if1;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v12}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-object v2, v1, Ldefpackage/pp3;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ldefpackage/sh4;

    .line 61
    .line 62
    iget-wide v13, v1, Ldefpackage/pp3;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_d

    .line 63
    .line 64
    monitor-exit v5

    .line 65
    const-wide/16 v5, -0x1

    .line 66
    .line 67
    cmp-long v5, v13, v5

    .line 68
    .line 69
    if-eqz v5, :cond_4

    .line 70
    .line 71
    cmp-long v5, v13, v3

    .line 72
    .line 73
    if-nez v5, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v8, "Detected multithreaded access to SnapshotStateObserver: previousThreadId="

    .line 87
    .line 88
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v8, "), currentThread={id="

    .line 95
    .line 96
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v8, ", name="

    .line 103
    .line 104
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v5, "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."

    .line 111
    .line 112
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {v5}, Ldefpackage/oo3;->a(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    :goto_2
    :try_start_1
    iget-object v5, v1, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 123
    .line 124
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    :try_start_2
    iput-object v12, v1, Ldefpackage/pp3;->j:Ljava/lang/Object;

    .line 126
    .line 127
    iput-wide v3, v1, Ldefpackage/pp3;->b:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    .line 128
    .line 129
    :try_start_3
    monitor-exit v5

    .line 130
    iget-object v3, v1, Ldefpackage/pp3;->f:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Ldefpackage/kl3;

    .line 133
    .line 134
    iget-object v4, v12, Ldefpackage/sh4;->b:Ljava/lang/Object;

    .line 135
    .line 136
    iget-object v5, v12, Ldefpackage/sh4;->c:Ldefpackage/p03;

    .line 137
    .line 138
    iget v6, v12, Ldefpackage/sh4;->d:I

    .line 139
    .line 140
    iput-object v0, v12, Ldefpackage/sh4;->b:Ljava/lang/Object;

    .line 141
    .line 142
    iget-object v8, v12, Ldefpackage/sh4;->f:Ldefpackage/w03;

    .line 143
    .line 144
    invoke-virtual {v8, v0}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ldefpackage/p03;

    .line 149
    .line 150
    iput-object v0, v12, Ldefpackage/sh4;->c:Ldefpackage/p03;

    .line 151
    .line 152
    iget v0, v12, Ldefpackage/sh4;->d:I

    .line 153
    .line 154
    const/4 v8, -0x1

    .line 155
    if-ne v0, v8, :cond_5

    .line 156
    .line 157
    invoke-static {}, Ldefpackage/jh4;->j()Ldefpackage/ch4;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Ldefpackage/ch4;->g()J

    .line 162
    .line 163
    .line 164
    move-result-wide v15

    .line 165
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->hashCode(J)I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iput v0, v12, Ldefpackage/sh4;->d:I

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :catchall_0
    move-exception v0

    .line 173
    move-wide v6, v13

    .line 174
    goto/16 :goto_12

    .line 175
    .line 176
    :cond_5
    :goto_3
    iget-object v0, v12, Ldefpackage/sh4;->i:Ldefpackage/qg1;

    .line 177
    .line 178
    invoke-static {}, Ldefpackage/uc5;->n()Ldefpackage/f13;

    .line 179
    .line 180
    .line 181
    move-result-object v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    :try_start_4
    invoke-virtual {v8, v0}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    if-nez v3, :cond_6

    .line 186
    .line 187
    invoke-interface/range {p3 .. p3}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-object/from16 p2, v12

    .line 191
    .line 192
    goto/16 :goto_7

    .line 193
    .line 194
    :catchall_1
    move-exception v0

    .line 195
    move/from16 v18, v7

    .line 196
    .line 197
    move-wide v6, v13

    .line 198
    goto/16 :goto_11

    .line 199
    .line 200
    :cond_6
    sget-object v0, Ldefpackage/jh4;->b:Ldefpackage/z05;

    .line 201
    .line 202
    invoke-virtual {v0}, Ldefpackage/z05;->f()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v10, v0

    .line 207
    check-cast v10, Ldefpackage/ch4;

    .line 208
    .line 209
    instance-of v0, v10, Ldefpackage/ox4;

    .line 210
    .line 211
    if-eqz v0, :cond_7

    .line 212
    .line 213
    move-object v0, v10

    .line 214
    check-cast v0, Ldefpackage/ox4;

    .line 215
    .line 216
    move-object/from16 p2, v12

    .line 217
    .line 218
    iget-wide v11, v0, Ldefpackage/ox4;->t:J

    .line 219
    .line 220
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 221
    .line 222
    .line 223
    move-result-wide v16

    .line 224
    cmp-long v0, v11, v16

    .line 225
    .line 226
    if-nez v0, :cond_8

    .line 227
    .line 228
    move-object v0, v10

    .line 229
    check-cast v0, Ldefpackage/ox4;

    .line 230
    .line 231
    iget-object v11, v0, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 232
    .line 233
    move-object v0, v10

    .line 234
    check-cast v0, Ldefpackage/ox4;

    .line 235
    .line 236
    iget-object v12, v0, Ldefpackage/ox4;->s:Ldefpackage/if1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 237
    .line 238
    :try_start_5
    move-object v0, v10

    .line 239
    check-cast v0, Ldefpackage/ox4;

    .line 240
    .line 241
    invoke-static {v3, v11, v7}, Ldefpackage/jh4;->k(Ldefpackage/if1;Ldefpackage/if1;Z)Ldefpackage/if1;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iput-object v3, v0, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 246
    .line 247
    move-object v0, v10

    .line 248
    check-cast v0, Ldefpackage/ox4;

    .line 249
    .line 250
    iput-object v12, v0, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 251
    .line 252
    invoke-interface/range {p3 .. p3}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 253
    .line 254
    .line 255
    :try_start_6
    move-object v0, v10

    .line 256
    check-cast v0, Ldefpackage/ox4;

    .line 257
    .line 258
    iput-object v11, v0, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 259
    .line 260
    check-cast v10, Ldefpackage/ox4;

    .line 261
    .line 262
    iput-object v12, v10, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :catchall_2
    move-exception v0

    .line 266
    move-object v3, v10

    .line 267
    check-cast v3, Ldefpackage/ox4;

    .line 268
    .line 269
    iput-object v11, v3, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 270
    .line 271
    check-cast v10, Ldefpackage/ox4;

    .line 272
    .line 273
    iput-object v12, v10, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 274
    .line 275
    throw v0

    .line 276
    :cond_7
    move-object/from16 p2, v12

    .line 277
    .line 278
    :cond_8
    if-eqz v10, :cond_9

    .line 279
    .line 280
    instance-of v0, v10, Ldefpackage/a13;

    .line 281
    .line 282
    if-eqz v0, :cond_a

    .line 283
    .line 284
    :cond_9
    const/4 v0, 0x0

    .line 285
    goto :goto_4

    .line 286
    :cond_a
    invoke-virtual {v10, v3}, Ldefpackage/ch4;->u(Ldefpackage/if1;)Ldefpackage/ch4;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    move-object v15, v0

    .line 291
    goto :goto_6

    .line 292
    :goto_4
    new-instance v15, Ldefpackage/ox4;

    .line 293
    .line 294
    instance-of v11, v10, Ldefpackage/a13;

    .line 295
    .line 296
    if-eqz v11, :cond_b

    .line 297
    .line 298
    move-object v11, v10

    .line 299
    check-cast v11, Ldefpackage/a13;

    .line 300
    .line 301
    move-object/from16 v16, v11

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_b
    move-object/from16 v16, v0

    .line 305
    .line 306
    :goto_5
    const/16 v19, 0x1

    .line 307
    .line 308
    const/16 v20, 0x0

    .line 309
    .line 310
    const/16 v18, 0x0

    .line 311
    .line 312
    move-object/from16 v17, v3

    .line 313
    .line 314
    invoke-direct/range {v15 .. v20}, Ldefpackage/ox4;-><init>(Ldefpackage/a13;Ldefpackage/if1;Ldefpackage/if1;ZZ)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 315
    .line 316
    .line 317
    :goto_6
    :try_start_7
    invoke-virtual {v15}, Ldefpackage/ch4;->j()Ldefpackage/ch4;

    .line 318
    .line 319
    .line 320
    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 321
    :try_start_8
    invoke-interface/range {p3 .. p3}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 322
    .line 323
    .line 324
    :try_start_9
    invoke-static {v3}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 325
    .line 326
    .line 327
    :try_start_a
    invoke-virtual {v15}, Ldefpackage/ch4;->c()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 328
    .line 329
    .line 330
    :goto_7
    :try_start_b
    iget v0, v8, Ldefpackage/f13;->p:I

    .line 331
    .line 332
    sub-int/2addr v0, v7

    .line 333
    invoke-virtual {v8, v0}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-object/from16 v12, p2

    .line 337
    .line 338
    iget-object v0, v12, Ldefpackage/sh4;->b:Ljava/lang/Object;

    .line 339
    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget v3, v12, Ldefpackage/sh4;->d:I

    .line 344
    .line 345
    iget-object v8, v12, Ldefpackage/sh4;->c:Ldefpackage/p03;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 346
    .line 347
    if-eqz v8, :cond_13

    .line 348
    .line 349
    :try_start_c
    iget-object v10, v8, Ldefpackage/p03;->a:[J

    .line 350
    .line 351
    array-length v11, v10

    .line 352
    add-int/lit8 v11, v11, -0x2

    .line 353
    .line 354
    if-ltz v11, :cond_13

    .line 355
    .line 356
    move-object/from16 v17, v10

    .line 357
    .line 358
    const/4 v15, 0x0

    .line 359
    :goto_8
    aget-wide v9, v17, v15

    .line 360
    .line 361
    move/from16 v18, v7

    .line 362
    .line 363
    move-object/from16 v19, v8

    .line 364
    .line 365
    not-long v7, v9

    .line 366
    const/16 v20, 0x7

    .line 367
    .line 368
    shl-long v7, v7, v20

    .line 369
    .line 370
    and-long/2addr v7, v9

    .line 371
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    and-long v7, v7, v20

    .line 377
    .line 378
    cmp-long v7, v7, v20

    .line 379
    .line 380
    if-eqz v7, :cond_12

    .line 381
    .line 382
    sub-int v7, v15, v11

    .line 383
    .line 384
    not-int v7, v7

    .line 385
    ushr-int/lit8 v7, v7, 0x1f

    .line 386
    .line 387
    const/16 v8, 0x8

    .line 388
    .line 389
    rsub-int/lit8 v7, v7, 0x8

    .line 390
    .line 391
    move/from16 p1, v8

    .line 392
    .line 393
    const/4 v8, 0x0

    .line 394
    :goto_9
    if-ge v8, v7, :cond_11

    .line 395
    .line 396
    const-wide/16 v20, 0xff

    .line 397
    .line 398
    and-long v20, v9, v20

    .line 399
    .line 400
    const-wide/16 v22, 0x80

    .line 401
    .line 402
    cmp-long v20, v20, v22

    .line 403
    .line 404
    if-gez v20, :cond_f

    .line 405
    .line 406
    shl-int/lit8 v20, v15, 0x3

    .line 407
    .line 408
    move/from16 v21, v8

    .line 409
    .line 410
    add-int v8, v20, v21

    .line 411
    .line 412
    move-wide/from16 p2, v9

    .line 413
    .line 414
    move-object/from16 v9, v19

    .line 415
    .line 416
    iget-object v10, v9, Ldefpackage/p03;->b:[Ljava/lang/Object;

    .line 417
    .line 418
    aget-object v10, v10, v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 419
    .line 420
    move-wide/from16 v19, v13

    .line 421
    .line 422
    :try_start_d
    iget-object v13, v9, Ldefpackage/p03;->c:[I

    .line 423
    .line 424
    aget v13, v13, v8

    .line 425
    .line 426
    if-eq v13, v3, :cond_c

    .line 427
    .line 428
    move/from16 v13, v18

    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_c
    const/4 v13, 0x0

    .line 432
    :goto_a
    if-eqz v13, :cond_d

    .line 433
    .line 434
    iget-object v14, v12, Ldefpackage/sh4;->e:Ldefpackage/w03;

    .line 435
    .line 436
    invoke-static {v14, v10, v0}, Ldefpackage/te5;->I(Ldefpackage/w03;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-object/from16 v22, v0

    .line 440
    .line 441
    instance-of v0, v10, Ldefpackage/dp0;

    .line 442
    .line 443
    if-eqz v0, :cond_e

    .line 444
    .line 445
    invoke-virtual {v14, v10}, Ldefpackage/w03;->c(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-nez v0, :cond_e

    .line 450
    .line 451
    iget-object v0, v12, Ldefpackage/sh4;->l:Ldefpackage/w03;

    .line 452
    .line 453
    invoke-static {v0, v10}, Ldefpackage/te5;->J(Ldefpackage/w03;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    iget-object v0, v12, Ldefpackage/sh4;->m:Ljava/util/HashMap;

    .line 457
    .line 458
    invoke-virtual {v0, v10}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_d
    move-object/from16 v22, v0

    .line 463
    .line 464
    :cond_e
    :goto_b
    if-eqz v13, :cond_10

    .line 465
    .line 466
    invoke-virtual {v9, v8}, Ldefpackage/p03;->f(I)V

    .line 467
    .line 468
    .line 469
    goto :goto_c

    .line 470
    :cond_f
    move-object/from16 v22, v0

    .line 471
    .line 472
    move/from16 v21, v8

    .line 473
    .line 474
    move-wide/from16 p2, v9

    .line 475
    .line 476
    move-object/from16 v9, v19

    .line 477
    .line 478
    move-wide/from16 v19, v13

    .line 479
    .line 480
    :cond_10
    :goto_c
    shr-long v13, p2, p1

    .line 481
    .line 482
    add-int/lit8 v8, v21, 0x1

    .line 483
    .line 484
    move-wide/from16 v24, v19

    .line 485
    .line 486
    move-object/from16 v19, v9

    .line 487
    .line 488
    move-wide v9, v13

    .line 489
    move-wide/from16 v13, v24

    .line 490
    .line 491
    move-object/from16 v0, v22

    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_11
    move-object/from16 v22, v0

    .line 495
    .line 496
    move-object/from16 v9, v19

    .line 497
    .line 498
    move/from16 v0, p1

    .line 499
    .line 500
    move-wide/from16 v19, v13

    .line 501
    .line 502
    if-ne v7, v0, :cond_14

    .line 503
    .line 504
    goto :goto_d

    .line 505
    :cond_12
    move-object/from16 v22, v0

    .line 506
    .line 507
    move-object/from16 v9, v19

    .line 508
    .line 509
    move-wide/from16 v19, v13

    .line 510
    .line 511
    :goto_d
    if-eq v15, v11, :cond_14

    .line 512
    .line 513
    add-int/lit8 v15, v15, 0x1

    .line 514
    .line 515
    move-object v8, v9

    .line 516
    move/from16 v7, v18

    .line 517
    .line 518
    move-wide/from16 v13, v19

    .line 519
    .line 520
    move-object/from16 v0, v22

    .line 521
    .line 522
    goto/16 :goto_8

    .line 523
    .line 524
    :cond_13
    move-wide/from16 v19, v13

    .line 525
    .line 526
    goto :goto_e

    .line 527
    :catchall_3
    move-exception v0

    .line 528
    move-wide/from16 v19, v13

    .line 529
    .line 530
    goto :goto_f

    .line 531
    :cond_14
    :goto_e
    iput-object v4, v12, Ldefpackage/sh4;->b:Ljava/lang/Object;

    .line 532
    .line 533
    iput-object v5, v12, Ldefpackage/sh4;->c:Ldefpackage/p03;

    .line 534
    .line 535
    iput v6, v12, Ldefpackage/sh4;->d:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 536
    .line 537
    iget-object v3, v1, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 538
    .line 539
    monitor-enter v3

    .line 540
    :try_start_e
    iput-object v2, v1, Ldefpackage/pp3;->j:Ljava/lang/Object;

    .line 541
    .line 542
    move-wide/from16 v6, v19

    .line 543
    .line 544
    iput-wide v6, v1, Ldefpackage/pp3;->b:J
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 545
    .line 546
    monitor-exit v3

    .line 547
    return-void

    .line 548
    :catchall_4
    move-exception v0

    .line 549
    monitor-exit v3

    .line 550
    throw v0

    .line 551
    :catchall_5
    move-exception v0

    .line 552
    :goto_f
    move-wide/from16 v6, v19

    .line 553
    .line 554
    goto :goto_12

    .line 555
    :catchall_6
    move-exception v0

    .line 556
    move/from16 v18, v7

    .line 557
    .line 558
    move-wide v6, v13

    .line 559
    goto :goto_10

    .line 560
    :catchall_7
    move-exception v0

    .line 561
    move/from16 v18, v7

    .line 562
    .line 563
    move-wide v6, v13

    .line 564
    :try_start_f
    invoke-static {v3}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V

    .line 565
    .line 566
    .line 567
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 568
    :catchall_8
    move-exception v0

    .line 569
    :goto_10
    :try_start_10
    invoke-virtual {v15}, Ldefpackage/ch4;->c()V

    .line 570
    .line 571
    .line 572
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 573
    :catchall_9
    move-exception v0

    .line 574
    :goto_11
    :try_start_11
    iget v3, v8, Ldefpackage/f13;->p:I

    .line 575
    .line 576
    add-int/lit8 v3, v3, -0x1

    .line 577
    .line 578
    invoke-virtual {v8, v3}, Ldefpackage/f13;->k(I)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    throw v0

    .line 582
    :catchall_a
    move-exception v0

    .line 583
    goto :goto_12

    .line 584
    :catchall_b
    move-exception v0

    .line 585
    move-wide v6, v13

    .line 586
    monitor-exit v5

    .line 587
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 588
    :goto_12
    iget-object v3, v1, Ldefpackage/pp3;->h:Ljava/lang/Object;

    .line 589
    .line 590
    monitor-enter v3

    .line 591
    :try_start_12
    iput-object v2, v1, Ldefpackage/pp3;->j:Ljava/lang/Object;

    .line 592
    .line 593
    iput-wide v6, v1, Ldefpackage/pp3;->b:J
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 594
    .line 595
    monitor-exit v3

    .line 596
    throw v0

    .line 597
    :catchall_c
    move-exception v0

    .line 598
    monitor-exit v3

    .line 599
    throw v0

    .line 600
    :catchall_d
    move-exception v0

    .line 601
    monitor-exit v5

    .line 602
    throw v0
.end method
