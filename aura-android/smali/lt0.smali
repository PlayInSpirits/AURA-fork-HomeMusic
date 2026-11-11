.class public final Llt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final n:Lh04;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lfk0;

.field public final c:Lit0;

.field public final d:Lcn;

.field public final e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:I

.field public k:Z

.field public l:Ljava/util/List;

.field public m:Lhq1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh04;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lh04;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Llt0;->n:Lh04;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ltk4;Lse4;Lbi0;Ljava/util/concurrent/ExecutorService;)V
    .locals 6

    .line 1
    new-instance v2, Lfk0;

    .line 2
    .line 3
    invoke-direct {v2, p2}, Lfk0;-><init>(Ltk4;)V

    .line 4
    .line 5
    .line 6
    new-instance v3, Lz05;

    .line 7
    .line 8
    new-instance p2, Lkx;

    .line 9
    .line 10
    invoke-direct {p2}, Lkx;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p3, p2, Lkx;->n:Lse4;

    .line 14
    .line 15
    iput-object p4, p2, Lkx;->r:Lbi0;

    .line 16
    .line 17
    invoke-direct {v3, p2, p5}, Lz05;-><init>(Lkx;Ljava/util/concurrent/Executor;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Llt0;->a:Landroid/content/Context;

    .line 28
    .line 29
    iput-object v2, p0, Llt0;->b:Lfk0;

    .line 30
    .line 31
    const/4 p2, 0x1

    .line 32
    iput-boolean p2, p0, Llt0;->i:Z

    .line 33
    .line 34
    sget-object p3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 35
    .line 36
    iput-object p3, p0, Llt0;->l:Ljava/util/List;

    .line 37
    .line 38
    new-instance p3, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 39
    .line 40
    invoke-direct {p3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p3, p0, Llt0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 44
    .line 45
    new-instance p3, Lgt0;

    .line 46
    .line 47
    const/4 p4, 0x0

    .line 48
    invoke-direct {p3, p4, p0}, Lgt0;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {p3}, Lf35;->q(Lgt0;)Landroid/os/Handler;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    new-instance v1, Landroid/os/HandlerThread;

    .line 56
    .line 57
    const-string p3, "ExoPlayer:DownloadManager"

    .line 58
    .line 59
    invoke-direct {v1, p3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lit0;

    .line 66
    .line 67
    iget-boolean v5, p0, Llt0;->i:Z

    .line 68
    .line 69
    invoke-direct/range {v0 .. v5}, Lit0;-><init>(Landroid/os/HandlerThread;Lfk0;Lz05;Landroid/os/Handler;Z)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Llt0;->c:Lit0;

    .line 73
    .line 74
    new-instance p3, Lcn;

    .line 75
    .line 76
    const/4 p5, 0x7

    .line 77
    invoke-direct {p3, p5, p0}, Lcn;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p3, p0, Llt0;->d:Lcn;

    .line 81
    .line 82
    new-instance p5, Lhq1;

    .line 83
    .line 84
    sget-object v1, Llt0;->n:Lh04;

    .line 85
    .line 86
    invoke-direct {p5, p1, p3, v1}, Lhq1;-><init>(Landroid/content/Context;Lcn;Lh04;)V

    .line 87
    .line 88
    .line 89
    iput-object p5, p0, Llt0;->m:Lhq1;

    .line 90
    .line 91
    invoke-virtual {p5}, Lhq1;->m()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iput p1, p0, Llt0;->j:I

    .line 96
    .line 97
    iput p2, p0, Llt0;->f:I

    .line 98
    .line 99
    invoke-virtual {v0, p2, p1, p4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 104
    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Llt0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljt0;

    .line 18
    .line 19
    iget-boolean v2, p0, Llt0;->k:Z

    .line 20
    .line 21
    invoke-interface {v1, p0, v2}, Ljt0;->f(Llt0;Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final b(Lhq1;I)V
    .locals 2

    .line 1
    iget-object p1, p1, Lhq1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Llt0;->j:I

    .line 4
    .line 5
    if-eq p1, p2, :cond_0

    .line 6
    .line 7
    iput p2, p0, Llt0;->j:I

    .line 8
    .line 9
    iget p1, p0, Llt0;->f:I

    .line 10
    .line 11
    add-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    iput p1, p0, Llt0;->f:I

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    const/4 v0, 0x0

    .line 17
    iget-object v1, p0, Llt0;->c:Lit0;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p2, v0}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, Llt0;->e()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object p2, p0, Llt0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ljt0;

    .line 47
    .line 48
    invoke-interface {v0}, Ljt0;->c()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Llt0;->a()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Llt0;->i:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput-boolean p1, p0, Llt0;->i:Z

    .line 7
    .line 8
    iget v0, p0, Llt0;->f:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    iput v0, p0, Llt0;->f:I

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, Llt0;->c:Lit0;

    .line 17
    .line 18
    invoke-virtual {v2, v0, p1, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Llt0;->e()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v0, p0, Llt0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljt0;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Llt0;->a()V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    return-void
.end method

.method public final d(Lh04;)V
    .locals 4

    .line 1
    iget-object v0, p0, Llt0;->m:Lhq1;

    .line 2
    .line 3
    iget-object v0, v0, Lhq1;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lh04;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lh04;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Llt0;->m:Lhq1;

    .line 15
    .line 16
    iget-object v1, v0, Lhq1;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroid/content/Context;

    .line 19
    .line 20
    iget-object v2, v0, Lhq1;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lv9;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    iput-object v2, v0, Lhq1;->f:Ljava/lang/Object;

    .line 32
    .line 33
    iget-object v3, v0, Lhq1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lj04;

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    const-string v3, "connectivity"

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v3, v0, Lhq1;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lj04;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 58
    .line 59
    .line 60
    iput-object v2, v0, Lhq1;->g:Ljava/lang/Object;

    .line 61
    .line 62
    :cond_1
    new-instance v0, Lhq1;

    .line 63
    .line 64
    iget-object v1, p0, Llt0;->a:Landroid/content/Context;

    .line 65
    .line 66
    iget-object v2, p0, Llt0;->d:Lcn;

    .line 67
    .line 68
    invoke-direct {v0, v1, v2, p1}, Lhq1;-><init>(Landroid/content/Context;Lcn;Lh04;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Llt0;->m:Lhq1;

    .line 72
    .line 73
    invoke-virtual {v0}, Lhq1;->m()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget-object v0, p0, Llt0;->m:Lhq1;

    .line 78
    .line 79
    invoke-virtual {p0, v0, p1}, Llt0;->b(Lhq1;I)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Llt0;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Llt0;->j:I

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move v0, v2

    .line 12
    :goto_0
    iget-object v3, p0, Llt0;->l:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v0, v3, :cond_1

    .line 19
    .line 20
    iget-object v3, p0, Llt0;->l:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lns0;

    .line 27
    .line 28
    iget v3, v3, Lns0;->b:I

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    move v0, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v0, v2

    .line 38
    :goto_1
    iget-boolean v3, p0, Llt0;->k:Z

    .line 39
    .line 40
    if-eq v3, v0, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v1, v2

    .line 44
    :goto_2
    iput-boolean v0, p0, Llt0;->k:Z

    .line 45
    .line 46
    return v1
.end method
