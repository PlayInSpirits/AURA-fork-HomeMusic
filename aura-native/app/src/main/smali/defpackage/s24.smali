.class public abstract Ldefpackage/s24;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ldefpackage/td0;

.field public b:Ljava/util/concurrent/Executor;

.field public c:Ldefpackage/ia4;

.field public d:Ldefpackage/p24;

.field public e:Ldefpackage/s12;

.field public final f:Ldefpackage/qr2;

.field public g:Z

.field public final h:Ljava/lang/ThreadLocal;

.field public final i:Ljava/util/LinkedHashMap;

.field public j:Z


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/qr2;

    .line 5
    .line 6
    new-instance v1, Ldefpackage/na;

    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    const/16 v8, 0x8

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const-class v4, Ldefpackage/s24;

    .line 13
    .line 14
    const-string v5, "onClosed"

    .line 15
    .line 16
    const-string v6, "onClosed()V"

    .line 17
    .line 18
    move-object v3, p0

    .line 19
    invoke-direct/range {v1 .. v8}, Ldefpackage/na;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ldefpackage/qr2;-><init>(Ldefpackage/na;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, v3, Ldefpackage/s24;->f:Ldefpackage/qr2;

    .line 26
    .line 27
    new-instance p0, Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p0, v3, Ldefpackage/s24;->h:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p0, v3, Ldefpackage/s24;->i:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    iput-boolean p0, v3, Ldefpackage/s24;->j:Z

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Ldefpackage/s24;->g:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    :goto_0
    if-nez p0, :cond_2

    .line 24
    .line 25
    :goto_1
    return-void

    .line 26
    :cond_2
    const-string p0, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    .line 27
    .line 28
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/s24;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/s24;->h:Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    .line 23
    .line 24
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/s24;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/s24;->j()Ldefpackage/so4;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ldefpackage/so4;->z()Ldefpackage/we1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ldefpackage/we1;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v1, Ldefpackage/r12;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v1, p0, v2, v3}, Ldefpackage/r12;-><init>(Ldefpackage/s12;Ldefpackage/vd0;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {v1}, Ldefpackage/g12;->Q(Ldefpackage/wf1;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p0, v0, Ldefpackage/we1;->n:Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isWriteAheadLoggingEnabled()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Ldefpackage/we1;->f()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v0}, Ldefpackage/we1;->b()V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void
.end method

.method public abstract d()Ldefpackage/s12;
.end method

.method public e()Ldefpackage/qz0;
    .locals 1

    .line 1
    new-instance p0, Ldefpackage/p63;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Ldefpackage/p63;-><init>(I)V

    .line 5
    .line 6
    .line 7
    throw p0
.end method

.method public f(Ldefpackage/li0;)Ldefpackage/so4;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ldefpackage/p63;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-direct {p0, p1}, Ldefpackage/p63;-><init>(I)V

    .line 8
    .line 9
    .line 10
    throw p0
.end method

.method public g(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Ldefpackage/we0;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/s24;->a:Ldefpackage/td0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "coroutineScope"

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final i()Ldefpackage/s12;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/s24;->e:Ldefpackage/s12;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "internalTracker"

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final j()Ldefpackage/so4;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/s24;->d:Ldefpackage/p24;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/p24;->c()Ldefpackage/so4;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const-string p0, "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string p0, "connectionManager"

    .line 20
    .line 21
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public k()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/z01;->n:Ldefpackage/z01;

    .line 2
    .line 3
    return-object p0
.end method

.method public l()Ljava/util/Map;
    .locals 0

    .line 1
    sget-object p0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/s24;->d:Ldefpackage/p24;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/p24;->c()Ldefpackage/so4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_1
    const-string p0, "connectionManager"

    .line 16
    .line 17
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method public final n()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/s24;->j()Ldefpackage/so4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Ldefpackage/so4;->z()Ldefpackage/we1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ldefpackage/we1;->v()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final o()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->j()Ldefpackage/so4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ldefpackage/so4;->z()Ldefpackage/we1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ldefpackage/we1;->n()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/s24;->n()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object v0, p0, Ldefpackage/s12;->b:Ldefpackage/jy4;

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/s12;->e:Ldefpackage/e90;

    .line 25
    .line 26
    iget-object p0, p0, Ldefpackage/s12;->f:Ldefpackage/e90;

    .line 27
    .line 28
    invoke-virtual {v0, v1, p0}, Ldefpackage/jy4;->e(Ldefpackage/gf1;Ldefpackage/gf1;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final p(Ldefpackage/x34;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, Ldefpackage/s12;->b:Ldefpackage/jy4;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "PRAGMA query_only"

    .line 14
    .line 15
    invoke-interface {p1, v1}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :try_start_0
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {v1, v2}, Ldefpackage/z34;->getLong(I)J

    .line 24
    .line 25
    .line 26
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 27
    const-wide/16 v5, 0x0

    .line 28
    .line 29
    cmp-long v3, v3, v5

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    move v2, v4

    .line 35
    :cond_0
    const/4 v3, 0x0

    .line 36
    invoke-static {v1, v3}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const-string v1, "PRAGMA temp_store = MEMORY"

    .line 42
    .line 43
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "PRAGMA recursive_triggers = 1"

    .line 47
    .line 48
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v1, "DROP TABLE IF EXISTS room_table_modification_log"

    .line 52
    .line 53
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-boolean v1, v0, Ldefpackage/jy4;->d:Z

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    const-string v1, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    .line 61
    .line 62
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const-string v1, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    .line 67
    .line 68
    const-string v2, "TEMP"

    .line 69
    .line 70
    const-string v3, ""

    .line 71
    .line 72
    invoke-static {v1, v2, v3}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {p1, v1}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    iget-object p1, v0, Ldefpackage/jy4;->h:Ldefpackage/ll;

    .line 80
    .line 81
    iget-object v0, p1, Ldefpackage/ll;->p:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/util/concurrent/locks/ReentrantLock;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 86
    .line 87
    .line 88
    :try_start_1
    iput-boolean v4, p1, Ldefpackage/ll;->o:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_2
    :goto_1
    iget-object p0, p0, Ldefpackage/s12;->h:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter p0

    .line 102
    monitor-exit p0

    .line 103
    return-void

    .line 104
    :catchall_1
    move-exception p0

    .line 105
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 106
    :catchall_2
    move-exception p1

    .line 107
    invoke-static {v1, p0}, Ldefpackage/ud3;->e(Ldefpackage/z34;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    throw p1
.end method

.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/s24;->d:Ldefpackage/p24;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/p24;->g:Ldefpackage/we1;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/we1;->n:Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    const-string p0, "connectionManager"

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0
.end method

.method public final r(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Ldefpackage/s24;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/s24;->o()V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    invoke-virtual {p0}, Ldefpackage/s24;->o()V

    .line 17
    .line 18
    .line 19
    throw p1
.end method

.method public final s(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/s24;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/s24;->o()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    invoke-virtual {p0}, Ldefpackage/s24;->o()V

    .line 16
    .line 17
    .line 18
    throw p1
.end method

.method public final t()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/s24;->j()Ldefpackage/so4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ldefpackage/so4;->z()Ldefpackage/we1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ldefpackage/we1;->H()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final u(ZLdefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/s24;->d:Ldefpackage/p24;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/p24;->f:Ldefpackage/fa0;

    .line 6
    .line 7
    invoke-interface {p0, p1, p2, p3}, Ldefpackage/fa0;->k(ZLdefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "connectionManager"

    .line 13
    .line 14
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    throw p0
.end method
