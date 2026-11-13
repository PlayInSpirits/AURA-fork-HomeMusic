.class public final synthetic Ldefpackage/vn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/ic2;

.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Ldefpackage/bl2;IILjava/util/List;I)V
    .locals 0

    .line 16
    iput p5, p0, Ldefpackage/vn2;->n:I

    iput-object p1, p0, Ldefpackage/vn2;->o:Ldefpackage/ic2;

    iput p2, p0, Ldefpackage/vn2;->q:I

    iput p3, p0, Ldefpackage/vn2;->r:I

    iput-object p4, p0, Ldefpackage/vn2;->p:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/bl2;Ljava/util/List;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/vn2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/vn2;->o:Ldefpackage/ic2;

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/vn2;->p:Ljava/util/List;

    .line 10
    .line 11
    iput p3, p0, Ldefpackage/vn2;->q:I

    .line 12
    .line 13
    iput p4, p0, Ldefpackage/vn2;->r:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/vn2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const-string v3, "MediaManager"

    .line 6
    .line 7
    iget-object v4, p0, Ldefpackage/vn2;->p:Ljava/util/List;

    .line 8
    .line 9
    iget v5, p0, Ldefpackage/vn2;->r:I

    .line 10
    .line 11
    iget v6, p0, Ldefpackage/vn2;->q:I

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/vn2;->o:Ldefpackage/ic2;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string v0, "swap"

    .line 25
    .line 26
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ldefpackage/bj2;

    .line 34
    .line 35
    invoke-virtual {p0, v6, v5}, Ldefpackage/sk2;->t0(II)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 36
    .line 37
    .line 38
    :try_start_1
    new-instance p0, Ldefpackage/vs3;

    .line 39
    .line 40
    invoke-direct {p0}, Ldefpackage/vs3;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v4, v2, v1}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catch_0
    move-exception p0

    .line 48
    goto :goto_0

    .line 49
    :catch_1
    move-exception p0

    .line 50
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_1
    return-void

    .line 54
    :pswitch_0
    :try_start_2
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    const-string v0, "shuffle"

    .line 61
    .line 62
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ldefpackage/bj2;

    .line 70
    .line 71
    sget-object v0, Ldefpackage/bo2;->d:Ljava/util/concurrent/ExecutorService;

    .line 72
    .line 73
    new-instance v1, Ldefpackage/xn2;

    .line 74
    .line 75
    invoke-direct {v1, v4, p0, v6, v5}, Ldefpackage/xn2;-><init>(Ljava/util/List;Ldefpackage/bj2;II)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :catch_2
    move-exception p0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 84
    .line 85
    .line 86
    :cond_1
    :goto_2
    return-void

    .line 87
    :pswitch_1
    :try_start_3
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    const-string v0, "remove range"

    .line 94
    .line 95
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Ldefpackage/bj2;

    .line 103
    .line 104
    invoke-virtual {p0, v6, v5}, Ldefpackage/sk2;->P(II)V
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 105
    .line 106
    .line 107
    :try_start_4
    invoke-interface {v4, v6, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-interface {v4, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    new-instance p0, Ldefpackage/vs3;

    .line 115
    .line 116
    invoke-direct {p0}, Ldefpackage/vs3;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v4, v2, v1}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :catch_3
    move-exception p0

    .line 124
    goto :goto_3

    .line 125
    :catch_4
    move-exception p0

    .line 126
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 127
    .line 128
    .line 129
    :cond_2
    :goto_4
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
