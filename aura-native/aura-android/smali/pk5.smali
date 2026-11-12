.class public final Lpk5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final n:Ljava/util/HashMap;

.field public o:I

.field public p:Z

.field public q:Landroid/os/IBinder;

.field public final r:Lnk5;

.field public s:Landroid/content/ComponentName;

.field public final synthetic t:Ltk5;


# direct methods
.method public constructor <init>(Ltk5;Lnk5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpk5;->t:Ltk5;

    .line 5
    .line 6
    iput-object p2, p0, Lpk5;->r:Lnk5;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lpk5;->n:Ljava/util/HashMap;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    iput p1, p0, Lpk5;->o:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/concurrent/Executor;)V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lpk5;->o:I

    .line 3
    .line 4
    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    const/16 v2, 0x1f

    .line 11
    .line 12
    if-lt v0, v2, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroid/os/StrictMode$VmPolicy$Builder;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Landroid/os/StrictMode$VmPolicy$Builder;-><init>(Landroid/os/StrictMode$VmPolicy;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lb05;->e(Landroid/os/StrictMode$VmPolicy$Builder;)Landroid/os/StrictMode$VmPolicy$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/os/StrictMode$VmPolicy$Builder;->build()Landroid/os/StrictMode$VmPolicy;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    :try_start_0
    iget-object v0, p0, Lpk5;->t:Ltk5;

    .line 31
    .line 32
    iget-object v2, v0, Ltk5;->d:Lfz0;

    .line 33
    .line 34
    iget-object v3, v0, Ltk5;->b:Landroid/content/Context;

    .line 35
    .line 36
    iget-object v0, p0, Lpk5;->r:Lnk5;

    .line 37
    .line 38
    invoke-virtual {v0, v3}, Lnk5;->a(Landroid/content/Context;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    move-object v6, p0

    .line 43
    move-object v4, p1

    .line 44
    move-object v7, p2

    .line 45
    invoke-virtual/range {v2 .. v7}, Lfz0;->q(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Lpk5;Ljava/util/concurrent/Executor;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    iput-boolean p0, v6, Lpk5;->p:Z

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    iget-object p0, v6, Lpk5;->t:Ltk5;

    .line 54
    .line 55
    iget-object p0, p0, Ltk5;->c:Lzw2;

    .line 56
    .line 57
    iget-object p1, v6, Lpk5;->r:Lnk5;

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-virtual {p0, p2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p1, v6, Lpk5;->t:Ltk5;

    .line 65
    .line 66
    iget-object p1, p1, Ltk5;->c:Lzw2;

    .line 67
    .line 68
    iget-object p2, v6, Lpk5;->t:Ltk5;

    .line 69
    .line 70
    iget-wide v2, p2, Ltk5;->f:J

    .line 71
    .line 72
    invoke-virtual {p1, p0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    move-object p0, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    const/4 p0, 0x2

    .line 80
    iput p0, v6, Lpk5;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    :try_start_1
    iget-object p0, v6, Lpk5;->t:Ltk5;

    .line 83
    .line 84
    iget-object p1, p0, Ltk5;->d:Lfz0;

    .line 85
    .line 86
    iget-object p0, p0, Ltk5;->b:Landroid/content/Context;

    .line 87
    .line 88
    invoke-virtual {p1, p0, v6}, Lfz0;->o(Landroid/content/Context;Lpk5;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    :catch_0
    :goto_0
    invoke-static {v1}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :goto_1
    invoke-static {v1}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    .line 96
    .line 97
    .line 98
    throw p0
.end method

.method public final onBindingDied(Landroid/content/ComponentName;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lpk5;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpk5;->t:Ltk5;

    .line 2
    .line 3
    iget-object v0, v0, Ltk5;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lpk5;->t:Ltk5;

    .line 7
    .line 8
    iget-object v1, v1, Ltk5;->c:Lzw2;

    .line 9
    .line 10
    iget-object v2, p0, Lpk5;->r:Lnk5;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lpk5;->q:Landroid/os/IBinder;

    .line 17
    .line 18
    iput-object p1, p0, Lpk5;->s:Landroid/content/ComponentName;

    .line 19
    .line 20
    iget-object v1, p0, Lpk5;->n:Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Landroid/content/ServiceConnection;

    .line 41
    .line 42
    invoke-interface {v2, p1, p2}, Landroid/content/ServiceConnection;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iput v3, p0, Lpk5;->o:I

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    return-void

    .line 52
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw p0
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lpk5;->t:Ltk5;

    .line 2
    .line 3
    iget-object v0, v0, Ltk5;->a:Ljava/util/HashMap;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lpk5;->t:Ltk5;

    .line 7
    .line 8
    iget-object v1, v1, Ltk5;->c:Lzw2;

    .line 9
    .line 10
    iget-object v2, p0, Lpk5;->r:Lnk5;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v1, v3, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lpk5;->q:Landroid/os/IBinder;

    .line 18
    .line 19
    iput-object p1, p0, Lpk5;->s:Landroid/content/ComponentName;

    .line 20
    .line 21
    iget-object v1, p0, Lpk5;->n:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Landroid/content/ServiceConnection;

    .line 42
    .line 43
    invoke-interface {v2, p1}, Landroid/content/ServiceConnection;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/4 p1, 0x2

    .line 50
    iput p1, p0, Lpk5;->o:I

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p0
.end method
