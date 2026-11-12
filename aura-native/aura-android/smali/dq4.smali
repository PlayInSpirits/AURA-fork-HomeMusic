.class public final Ldq4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La64;


# static fields
.field public static final s:Ljava/lang/String;


# instance fields
.field public final n:Landroid/content/Context;

.field public final o:Landroid/app/job/JobScheduler;

.field public final p:Lcq4;

.field public final q:Landroidx/work/impl/WorkDatabase;

.field public final r:Lr90;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobScheduler"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldq4;->s:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lr90;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lw22;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcq4;

    .line 6
    .line 7
    iget-object v2, p3, Lr90;->d:Lxi4;

    .line 8
    .line 9
    iget-boolean v3, p3, Lr90;->l:Z

    .line 10
    .line 11
    invoke-direct {v1, p1, v2, v3}, Lcq4;-><init>(Landroid/content/Context;Lxi4;Z)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Ldq4;->n:Landroid/content/Context;

    .line 18
    .line 19
    iput-object v0, p0, Ldq4;->o:Landroid/app/job/JobScheduler;

    .line 20
    .line 21
    iput-object v1, p0, Ldq4;->p:Lcq4;

    .line 22
    .line 23
    iput-object p2, p0, Ldq4;->q:Landroidx/work/impl/WorkDatabase;

    .line 24
    .line 25
    iput-object p3, p0, Ldq4;->r:Lr90;

    .line 26
    .line 27
    return-void
.end method

.method public static a(Landroid/app/job/JobScheduler;I)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p0

    .line 6
    invoke-static {}, Lcx;->f()Lcx;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v2, "Exception while trying to cancel job (%d)"

    .line 23
    .line 24
    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object v1, Ldq4;->s:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1, p1, p0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    sget-object v0, Lw22;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    sget-object v1, Lw22;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {}, Lcx;->f()Lcx;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "getAllPendingJobs() is not reliable on this device."

    .line 23
    .line 24
    invoke-virtual {v2, v1, v3, p1}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v0

    .line 28
    :goto_0
    if-nez p1, :cond_0

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Landroid/content/ComponentName;

    .line 41
    .line 42
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 43
    .line 44
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Landroid/app/job/JobInfo;

    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    return-object v0
.end method

.method public static f(Landroid/app/job/JobInfo;)Lrc5;
    .locals 3

    .line 1
    const-string v0, "EXTRA_WORK_SPEC_ID"

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string v1, "EXTRA_WORK_SPEC_GENERATION"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    new-instance v2, Lrc5;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v2, v1, p0}, Lrc5;-><init>(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :catch_0
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method


# virtual methods
.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldq4;->n:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Ldq4;->o:Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldq4;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    move v5, v2

    .line 25
    :cond_1
    :goto_0
    if-ge v5, v4, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    add-int/lit8 v5, v5, 0x1

    .line 32
    .line 33
    check-cast v6, Landroid/app/job/JobInfo;

    .line 34
    .line 35
    invoke-static {v6}, Ldq4;->f(Landroid/app/job/JobInfo;)Lrc5;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    iget-object v7, v7, Lrc5;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_1

    .line 48
    .line 49
    invoke-virtual {v6}, Landroid/app/job/JobInfo;->getId()I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v0, v3

    .line 62
    :goto_1
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    :goto_2
    if-ge v2, v3, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    add-int/lit8 v2, v2, 0x1

    .line 81
    .line 82
    check-cast v4, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {v1, v4}, Ldq4;->a(Landroid/app/job/JobScheduler;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    iget-object p0, p0, Ldq4;->q:Landroidx/work/impl/WorkDatabase;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->x()Lbq4;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iget-object v0, p0, Lbq4;->n:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 101
    .line 102
    invoke-virtual {v0}, Ls24;->b()V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Laq4;

    .line 108
    .line 109
    invoke-virtual {p0}, Lrx1;->a()Ldf1;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const/4 v2, 0x1

    .line 114
    invoke-interface {v1, v2, p1}, Lvo4;->h(ILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :try_start_0
    invoke-virtual {v0}, Ls24;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    :try_start_1
    invoke-virtual {v1}, Ldf1;->b()I

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ls24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    .line 125
    .line 126
    :try_start_2
    invoke-virtual {v0}, Ls24;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Lrx1;->h(Ldf1;)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :catchall_0
    move-exception p1

    .line 134
    goto :goto_3

    .line 135
    :catchall_1
    move-exception p1

    .line 136
    :try_start_3
    invoke-virtual {v0}, Ls24;->o()V

    .line 137
    .line 138
    .line 139
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    :goto_3
    invoke-virtual {p0, v1}, Lrx1;->h(Ldf1;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_4
    return-void
.end method

.method public final varargs e([Ldd5;)V
    .locals 11

    .line 1
    iget-object v0, p0, Ldq4;->r:Lr90;

    .line 2
    .line 3
    new-instance v1, Lrv1;

    .line 4
    .line 5
    iget-object v2, p0, Ldq4;->q:Landroidx/work/impl/WorkDatabase;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v2, v3}, Lrv1;-><init>(Landroidx/work/impl/WorkDatabase;I)V

    .line 9
    .line 10
    .line 11
    array-length v4, p1

    .line 12
    :goto_0
    if-ge v3, v4, :cond_4

    .line 13
    .line 14
    aget-object v5, p1, v3

    .line 15
    .line 16
    invoke-virtual {v2}, Ls24;->c()V

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    iget-object v7, v5, Ldd5;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v6, v7}, Lfd5;->h(Ljava/lang/String;)Ldd5;

    .line 26
    .line 27
    .line 28
    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const-string v8, "Skipping scheduling "

    .line 30
    .line 31
    sget-object v9, Ldq4;->s:Ljava/lang/String;

    .line 32
    .line 33
    if-nez v6, :cond_0

    .line 34
    .line 35
    :try_start_1
    invoke-static {}, Lcx;->f()Lcx;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    new-instance v6, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v7, " because it\'s no longer in the DB"

    .line 51
    .line 52
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v5, v9, v6}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ls24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    :goto_1
    invoke-virtual {v2}, Ls24;->o()V

    .line 66
    .line 67
    .line 68
    goto :goto_3

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_4

    .line 71
    :cond_0
    :try_start_2
    iget v6, v6, Ldd5;->b:I

    .line 72
    .line 73
    const/4 v10, 0x1

    .line 74
    if-eq v6, v10, :cond_1

    .line 75
    .line 76
    invoke-static {}, Lcx;->f()Lcx;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v7, " because it is no longer enqueued"

    .line 92
    .line 93
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v5, v9, v6}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2}, Ls24;->t()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    invoke-static {v5}, Lq05;->m(Ldd5;)Lrc5;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->x()Lbq4;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7, v6}, Lbq4;->k(Lrc5;)Lzp4;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    if-eqz v7, :cond_2

    .line 120
    .line 121
    iget v8, v7, Lzp4;->c:I

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget v8, v0, Lr90;->i:I

    .line 128
    .line 129
    iget-object v9, v1, Lrv1;->a:Landroidx/work/impl/WorkDatabase;

    .line 130
    .line 131
    new-instance v10, Lqv1;

    .line 132
    .line 133
    invoke-direct {v10, v1, v8}, Lqv1;-><init>(Lrv1;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9, v10}, Ls24;->r(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    check-cast v8, Ljava/lang/Number;

    .line 144
    .line 145
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    :goto_2
    if-nez v7, :cond_3

    .line 150
    .line 151
    new-instance v7, Lzp4;

    .line 152
    .line 153
    iget-object v9, v6, Lrc5;->a:Ljava/lang/String;

    .line 154
    .line 155
    iget v6, v6, Lrc5;->b:I

    .line 156
    .line 157
    invoke-direct {v7, v9, v6, v8}, Lzp4;-><init>(Ljava/lang/String;II)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->x()Lbq4;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6, v7}, Lbq4;->n(Lzp4;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    invoke-virtual {p0, v5, v8}, Ldq4;->g(Ldd5;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Ls24;->t()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 175
    .line 176
    goto/16 :goto_0

    .line 177
    .line 178
    :goto_4
    invoke-virtual {v2}, Ls24;->o()V

    .line 179
    .line 180
    .line 181
    throw p0

    .line 182
    :cond_4
    return-void
.end method

.method public final g(Ldd5;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    iget-object v3, v1, Ldq4;->p:Lcq4;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v4, v2, Ldd5;->j:Lmc0;

    .line 13
    .line 14
    new-instance v5, Landroid/os/PersistableBundle;

    .line 15
    .line 16
    invoke-direct {v5}, Landroid/os/PersistableBundle;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v6, v2, Ldd5;->a:Ljava/lang/String;

    .line 20
    .line 21
    const-string v7, "EXTRA_WORK_SPEC_ID"

    .line 22
    .line 23
    invoke-virtual {v5, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v7, "EXTRA_WORK_SPEC_GENERATION"

    .line 27
    .line 28
    iget v8, v2, Ldd5;->t:I

    .line 29
    .line 30
    invoke-virtual {v5, v7, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    const-string v7, "EXTRA_IS_PERIODIC"

    .line 34
    .line 35
    invoke-virtual {v2}, Ldd5;->d()Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {v5, v7, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    new-instance v7, Landroid/app/job/JobInfo$Builder;

    .line 43
    .line 44
    iget-object v8, v3, Lcq4;->a:Landroid/content/ComponentName;

    .line 45
    .line 46
    invoke-direct {v7, v0, v8}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v8, v4, Lmc0;->c:Z

    .line 50
    .line 51
    iget-object v9, v4, Lmc0;->i:Ljava/util/Set;

    .line 52
    .line 53
    invoke-virtual {v7, v8}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    iget-boolean v8, v4, Lmc0;->d:Z

    .line 58
    .line 59
    invoke-virtual {v7, v8}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v7, v5}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v4}, Lmc0;->a()Landroid/net/NetworkRequest;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/4 v11, 0x2

    .line 74
    const/16 v12, 0x1a

    .line 75
    .line 76
    const/4 v14, 0x1

    .line 77
    const/16 v15, 0x1c

    .line 78
    .line 79
    if-lt v10, v15, :cond_0

    .line 80
    .line 81
    if-eqz v7, :cond_0

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v5, v7}, Lvl4;->j(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_0
    iget v7, v4, Lmc0;->a:I

    .line 91
    .line 92
    const/16 v13, 0x1e

    .line 93
    .line 94
    if-lt v10, v13, :cond_1

    .line 95
    .line 96
    const/4 v13, 0x6

    .line 97
    if-ne v7, v13, :cond_1

    .line 98
    .line 99
    new-instance v7, Landroid/net/NetworkRequest$Builder;

    .line 100
    .line 101
    invoke-direct {v7}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 102
    .line 103
    .line 104
    const/16 v13, 0x19

    .line 105
    .line 106
    invoke-virtual {v7, v13}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v7}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    invoke-static {v5, v7}, Lvl4;->f(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_1
    invoke-static {v7}, Lxa3;->w(I)I

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_6

    .line 123
    .line 124
    if-eq v13, v14, :cond_4

    .line 125
    .line 126
    if-eq v13, v11, :cond_5

    .line 127
    .line 128
    const/4 v14, 0x3

    .line 129
    if-eq v13, v14, :cond_7

    .line 130
    .line 131
    const/4 v14, 0x4

    .line 132
    if-eq v13, v14, :cond_2

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    if-lt v10, v12, :cond_3

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    :goto_0
    invoke-static {}, Lcx;->f()Lcx;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    sget-object v14, Lcq4;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v7}, Lb11;->y(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    const-string v12, "API version too low. Cannot convert network type value "

    .line 149
    .line 150
    invoke-virtual {v12, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-virtual {v13, v14, v7}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_4
    const/4 v14, 0x1

    .line 158
    goto :goto_1

    .line 159
    :cond_5
    move v14, v11

    .line 160
    goto :goto_1

    .line 161
    :cond_6
    const/4 v14, 0x0

    .line 162
    :cond_7
    :goto_1
    invoke-virtual {v5, v14}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 163
    .line 164
    .line 165
    :goto_2
    if-nez v8, :cond_9

    .line 166
    .line 167
    iget v7, v2, Ldd5;->l:I

    .line 168
    .line 169
    if-ne v7, v11, :cond_8

    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    goto :goto_3

    .line 173
    :cond_8
    const/4 v7, 0x1

    .line 174
    :goto_3
    iget-wide v11, v2, Ldd5;->m:J

    .line 175
    .line 176
    invoke-virtual {v5, v11, v12, v7}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 177
    .line 178
    .line 179
    :cond_9
    invoke-virtual {v2}, Ldd5;->a()J

    .line 180
    .line 181
    .line 182
    move-result-wide v7

    .line 183
    iget-object v11, v3, Lcq4;->b:Lxi4;

    .line 184
    .line 185
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 189
    .line 190
    .line 191
    move-result-wide v11

    .line 192
    sub-long/2addr v7, v11

    .line 193
    const-wide/16 v11, 0x0

    .line 194
    .line 195
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->max(JJ)J

    .line 196
    .line 197
    .line 198
    move-result-wide v7

    .line 199
    if-gt v10, v15, :cond_a

    .line 200
    .line 201
    invoke-virtual {v5, v7, v8}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_a
    cmp-long v10, v7, v11

    .line 206
    .line 207
    if-lez v10, :cond_b

    .line 208
    .line 209
    invoke-virtual {v5, v7, v8}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_b
    iget-boolean v10, v2, Ldd5;->q:Z

    .line 214
    .line 215
    if-nez v10, :cond_c

    .line 216
    .line 217
    iget-boolean v3, v3, Lcq4;->c:Z

    .line 218
    .line 219
    if-eqz v3, :cond_c

    .line 220
    .line 221
    invoke-static {v5}, Lvl4;->e(Landroid/app/job/JobInfo$Builder;)V

    .line 222
    .line 223
    .line 224
    :cond_c
    :goto_4
    move-object v3, v9

    .line 225
    check-cast v3, Ljava/util/Collection;

    .line 226
    .line 227
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-nez v3, :cond_e

    .line 232
    .line 233
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-eqz v9, :cond_d

    .line 242
    .line 243
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    check-cast v9, Llc0;

    .line 248
    .line 249
    iget-boolean v10, v9, Llc0;->b:Z

    .line 250
    .line 251
    new-instance v13, Landroid/app/job/JobInfo$TriggerContentUri;

    .line 252
    .line 253
    iget-object v9, v9, Llc0;->a:Landroid/net/Uri;

    .line 254
    .line 255
    invoke-direct {v13, v9, v10}, Landroid/app/job/JobInfo$TriggerContentUri;-><init>(Landroid/net/Uri;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v13}, Landroid/app/job/JobInfo$Builder;->addTriggerContentUri(Landroid/app/job/JobInfo$TriggerContentUri;)Landroid/app/job/JobInfo$Builder;

    .line 259
    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_d
    iget-wide v9, v4, Lmc0;->g:J

    .line 263
    .line 264
    invoke-virtual {v5, v9, v10}, Landroid/app/job/JobInfo$Builder;->setTriggerContentUpdateDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 265
    .line 266
    .line 267
    iget-wide v9, v4, Lmc0;->h:J

    .line 268
    .line 269
    invoke-virtual {v5, v9, v10}, Landroid/app/job/JobInfo$Builder;->setTriggerContentMaxDelay(J)Landroid/app/job/JobInfo$Builder;

    .line 270
    .line 271
    .line 272
    :cond_e
    const/4 v3, 0x0

    .line 273
    invoke-virtual {v5, v3}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 274
    .line 275
    .line 276
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 277
    .line 278
    const/16 v9, 0x1a

    .line 279
    .line 280
    if-lt v3, v9, :cond_f

    .line 281
    .line 282
    iget-boolean v9, v4, Lmc0;->e:Z

    .line 283
    .line 284
    invoke-static {v5, v9}, Lrg3;->i(Landroid/app/job/JobInfo$Builder;Z)V

    .line 285
    .line 286
    .line 287
    iget-boolean v4, v4, Lmc0;->f:Z

    .line 288
    .line 289
    invoke-static {v5, v4}, Lrg3;->q(Landroid/app/job/JobInfo$Builder;Z)V

    .line 290
    .line 291
    .line 292
    :cond_f
    iget v4, v2, Ldd5;->k:I

    .line 293
    .line 294
    if-lez v4, :cond_10

    .line 295
    .line 296
    const/4 v4, 0x1

    .line 297
    goto :goto_6

    .line 298
    :cond_10
    const/4 v4, 0x0

    .line 299
    :goto_6
    cmp-long v7, v7, v11

    .line 300
    .line 301
    if-lez v7, :cond_11

    .line 302
    .line 303
    const/4 v7, 0x1

    .line 304
    goto :goto_7

    .line 305
    :cond_11
    const/4 v7, 0x0

    .line 306
    :goto_7
    const/16 v8, 0x1f

    .line 307
    .line 308
    if-lt v3, v8, :cond_12

    .line 309
    .line 310
    iget-boolean v9, v2, Ldd5;->q:Z

    .line 311
    .line 312
    if-eqz v9, :cond_12

    .line 313
    .line 314
    if-nez v4, :cond_12

    .line 315
    .line 316
    if-nez v7, :cond_12

    .line 317
    .line 318
    invoke-static {v5}, Lgo2;->k(Landroid/app/job/JobInfo$Builder;)V

    .line 319
    .line 320
    .line 321
    :cond_12
    const/16 v4, 0x23

    .line 322
    .line 323
    if-lt v3, v4, :cond_13

    .line 324
    .line 325
    iget-object v3, v2, Ldd5;->x:Ljava/lang/String;

    .line 326
    .line 327
    if-eqz v3, :cond_13

    .line 328
    .line 329
    invoke-static {v5, v3}, Lvk;->d(Landroid/app/job/JobInfo$Builder;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :cond_13
    invoke-virtual {v5}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-static {}, Lcx;->f()Lcx;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    new-instance v5, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v7, "Scheduling work ID "

    .line 343
    .line 344
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v7, "Job ID "

    .line 351
    .line 352
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v5

    .line 362
    sget-object v7, Ldq4;->s:Ljava/lang/String;

    .line 363
    .line 364
    invoke-virtual {v4, v7, v5}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :try_start_0
    iget-object v4, v1, Ldq4;->o:Landroid/app/job/JobScheduler;

    .line 368
    .line 369
    invoke-virtual {v4, v3}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-nez v3, :cond_14

    .line 374
    .line 375
    invoke-static {}, Lcx;->f()Lcx;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    new-instance v4, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    const-string v5, "Unable to schedule work ID "

    .line 385
    .line 386
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    invoke-virtual {v3, v7, v4}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    iget-boolean v3, v2, Ldd5;->q:Z

    .line 400
    .line 401
    if-eqz v3, :cond_14

    .line 402
    .line 403
    iget v3, v2, Ldd5;->r:I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    .line 405
    const/4 v4, 0x1

    .line 406
    if-ne v3, v4, :cond_14

    .line 407
    .line 408
    const/4 v3, 0x0

    .line 409
    :try_start_1
    iput-boolean v3, v2, Ldd5;->q:Z

    .line 410
    .line 411
    new-instance v4, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 414
    .line 415
    .line 416
    const-string v5, "Scheduling a non-expedited job (work ID "

    .line 417
    .line 418
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    const-string v5, ")"

    .line 425
    .line 426
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-static {}, Lcx;->f()Lcx;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    invoke-virtual {v5, v7, v4}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual/range {p0 .. p2}, Ldq4;->g(Ldd5;I)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 441
    .line 442
    .line 443
    return-void

    .line 444
    :catchall_0
    move-exception v0

    .line 445
    goto :goto_9

    .line 446
    :catch_0
    move-exception v0

    .line 447
    :goto_8
    move-object v2, v0

    .line 448
    goto :goto_a

    .line 449
    :catch_1
    move-exception v0

    .line 450
    const/4 v3, 0x0

    .line 451
    goto :goto_8

    .line 452
    :cond_14
    return-void

    .line 453
    :goto_9
    invoke-static {}, Lcx;->f()Lcx;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    new-instance v3, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    const-string v4, "Unable to schedule "

    .line 460
    .line 461
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    invoke-virtual {v1, v7, v2, v0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :goto_a
    sget-object v0, Lw22;->a:Ljava/lang/String;

    .line 476
    .line 477
    iget-object v4, v1, Ldq4;->n:Landroid/content/Context;

    .line 478
    .line 479
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    iget-object v0, v1, Ldq4;->q:Landroidx/work/impl/WorkDatabase;

    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    iget-object v1, v1, Ldq4;->r:Lr90;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 493
    .line 494
    if-lt v5, v8, :cond_15

    .line 495
    .line 496
    const/16 v6, 0x96

    .line 497
    .line 498
    goto :goto_b

    .line 499
    :cond_15
    const/16 v6, 0x64

    .line 500
    .line 501
    :goto_b
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v0}, Lfd5;->f()Ljava/util/ArrayList;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 510
    .line 511
    .line 512
    move-result v8

    .line 513
    const/16 v0, 0x22

    .line 514
    .line 515
    const-string v9, "<faulty JobScheduler failed to getPendingJobs>"

    .line 516
    .line 517
    if-lt v5, v0, :cond_1a

    .line 518
    .line 519
    invoke-static {v4}, Lw22;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    const/4 v10, 0x0

    .line 524
    :try_start_2
    invoke-virtual {v5}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 529
    .line 530
    .line 531
    goto :goto_c

    .line 532
    :catchall_1
    move-exception v0

    .line 533
    sget-object v11, Lw22;->a:Ljava/lang/String;

    .line 534
    .line 535
    invoke-static {}, Lcx;->f()Lcx;

    .line 536
    .line 537
    .line 538
    move-result-object v12

    .line 539
    const-string v13, "getAllPendingJobs() is not reliable on this device."

    .line 540
    .line 541
    invoke-virtual {v12, v11, v13, v0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 542
    .line 543
    .line 544
    move-object v0, v10

    .line 545
    :goto_c
    if-eqz v0, :cond_1c

    .line 546
    .line 547
    invoke-static {v4, v5}, Ldq4;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    if-eqz v5, :cond_16

    .line 552
    .line 553
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 554
    .line 555
    .line 556
    move-result v9

    .line 557
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 558
    .line 559
    .line 560
    move-result v5

    .line 561
    sub-int v5, v9, v5

    .line 562
    .line 563
    goto :goto_d

    .line 564
    :cond_16
    move v5, v3

    .line 565
    :goto_d
    if-nez v5, :cond_17

    .line 566
    .line 567
    move-object v5, v10

    .line 568
    goto :goto_e

    .line 569
    :cond_17
    new-instance v9, Ljava/lang/StringBuilder;

    .line 570
    .line 571
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 575
    .line 576
    .line 577
    const-string v5, " of which are not owned by WorkManager"

    .line 578
    .line 579
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    :goto_e
    const-string v9, "jobscheduler"

    .line 587
    .line 588
    invoke-virtual {v4, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v9

    .line 592
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    check-cast v9, Landroid/app/job/JobScheduler;

    .line 596
    .line 597
    invoke-static {v4, v9}, Ldq4;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 598
    .line 599
    .line 600
    move-result-object v4

    .line 601
    if-eqz v4, :cond_18

    .line 602
    .line 603
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 604
    .line 605
    .line 606
    move-result v13

    .line 607
    goto :goto_f

    .line 608
    :cond_18
    move v13, v3

    .line 609
    :goto_f
    if-nez v13, :cond_19

    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_19
    new-instance v3, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    const-string v4, " from WorkManager in the default namespace"

    .line 621
    .line 622
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v10

    .line 629
    :goto_10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 632
    .line 633
    .line 634
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 635
    .line 636
    .line 637
    move-result v0

    .line 638
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    const-string v0, " jobs in \"androidx.work.systemjobscheduler\" namespace"

    .line 642
    .line 643
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    filled-new-array {v0, v5, v10}, [Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-static {v0}, Lti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 655
    .line 656
    .line 657
    move-result-object v9

    .line 658
    const/4 v13, 0x0

    .line 659
    const/16 v14, 0x3e

    .line 660
    .line 661
    const-string v10, ",\n"

    .line 662
    .line 663
    const/4 v11, 0x0

    .line 664
    const/4 v12, 0x0

    .line 665
    invoke-static/range {v9 .. v14}, Lq40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lif1;I)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v9

    .line 669
    goto :goto_11

    .line 670
    :cond_1a
    invoke-static {v4}, Lw22;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    invoke-static {v4, v0}, Ldq4;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    if-nez v0, :cond_1b

    .line 679
    .line 680
    goto :goto_11

    .line 681
    :cond_1b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 682
    .line 683
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    const-string v0, " jobs from WorkManager"

    .line 694
    .line 695
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v9

    .line 702
    :cond_1c
    :goto_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 703
    .line 704
    const-string v3, "JobScheduler "

    .line 705
    .line 706
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    const-string v3, " job limit exceeded.\nIn JobScheduler there are "

    .line 713
    .line 714
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    const-string v3, ".\nThere are "

    .line 721
    .line 722
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    const-string v3, " jobs tracked by WorkManager\'s database;\nthe Configuration limit is "

    .line 729
    .line 730
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    iget v1, v1, Lr90;->k:I

    .line 734
    .line 735
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    const/16 v1, 0x2e

    .line 739
    .line 740
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-static {}, Lcx;->f()Lcx;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    invoke-virtual {v1, v7, v0}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    invoke-static {v0, v2}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 755
    .line 756
    .line 757
    return-void
.end method
