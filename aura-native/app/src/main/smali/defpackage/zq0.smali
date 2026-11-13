.class public final Ldefpackage/zq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/zq0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/zq0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/qk;

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/qk;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/qk;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 17
    .line 18
    .line 19
    const/16 v2, 0xa

    .line 20
    .line 21
    :try_start_0
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_1
    iget-object v2, p0, Ldefpackage/qk;->t:Ldefpackage/og5;

    .line 25
    .line 26
    invoke-virtual {v2}, Ldefpackage/og5;->c()V
    :try_end_1
    .catch Landroidx/core/os/OperationCanceledException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v2

    .line 31
    :try_start_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    :goto_0
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Ldefpackage/qk;->a(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :catchall_0
    move-exception v2

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 47
    :goto_1
    :try_start_4
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 48
    .line 49
    .line 50
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    invoke-virtual {p0, v1}, Ldefpackage/qk;->a(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :pswitch_0
    iget-object p0, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ldefpackage/qa1;

    .line 59
    .line 60
    invoke-virtual {p0}, Ldefpackage/qa1;->run()V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_1
    iget-object v0, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ldefpackage/kr0;

    .line 67
    .line 68
    monitor-enter v0

    .line 69
    :try_start_5
    iget-object v2, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ldefpackage/kr0;

    .line 72
    .line 73
    iget-object v3, v2, Ldefpackage/kr0;->v:Ljava/io/BufferedWriter;

    .line 74
    .line 75
    if-nez v3, :cond_1

    .line 76
    .line 77
    monitor-exit v0

    .line 78
    goto :goto_2

    .line 79
    :catchall_2
    move-exception p0

    .line 80
    goto :goto_3

    .line 81
    :cond_1
    invoke-virtual {v2}, Ldefpackage/kr0;->R()V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, Ldefpackage/kr0;

    .line 87
    .line 88
    invoke-virtual {v2}, Ldefpackage/kr0;->u()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_2

    .line 93
    .line 94
    iget-object v2, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Ldefpackage/kr0;

    .line 97
    .line 98
    invoke-virtual {v2}, Ldefpackage/kr0;->K()V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, Ldefpackage/zq0;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Ldefpackage/kr0;

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    iput v2, p0, Ldefpackage/kr0;->x:I

    .line 107
    .line 108
    :cond_2
    monitor-exit v0

    .line 109
    :goto_2
    return-object v1

    .line 110
    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 111
    throw p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
