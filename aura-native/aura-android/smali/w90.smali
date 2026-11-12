.class public final Lw90;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw90;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lw90;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lw90;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lw90;->q:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lw90;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Led4;->b:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lw90;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/net/NetworkRequest;

    .line 11
    .line 12
    iget-object v2, p0, Lw90;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 15
    .line 16
    iget-object p0, p0, Lw90;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Led4;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    sget-object v3, Led4;->c:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-interface {v3, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-static {}, Lcx;->f()Lcx;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    sget-object v3, Llc5;->a:Ljava/lang/String;

    .line 37
    .line 38
    const-string v4, "NetworkRequestConstraintController unregister shared callback"

    .line 39
    .line 40
    invoke-virtual {v1, v3, v4}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    :goto_0
    monitor-exit v0

    .line 50
    sget-object p0, Lj15;->a:Lj15;

    .line 51
    .line 52
    return-object p0

    .line 53
    :goto_1
    monitor-exit v0

    .line 54
    throw p0

    .line 55
    :pswitch_0
    iget-object v0, p0, Lw90;->o:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lfx3;

    .line 58
    .line 59
    iget-boolean v0, v0, Lfx3;->n:Z

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-static {}, Lcx;->f()Lcx;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sget-object v1, Llc5;->a:Ljava/lang/String;

    .line 68
    .line 69
    const-string v2, "NetworkRequestConstraintController unregister callback"

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lw90;->p:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 77
    .line 78
    iget-object p0, p0, Lw90;->q:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Loy1;

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    sget-object p0, Lj15;->a:Lj15;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_1
    iget-object v0, p0, Lw90;->o:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lo00;

    .line 91
    .line 92
    iget-object v0, v0, Lo00;->b:Lrr2;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lw90;->p:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljl1;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljl1;->a()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object p0, p0, Lw90;->q:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Lf6;

    .line 108
    .line 109
    iget-object p0, p0, Lf6;->h:Lgr1;

    .line 110
    .line 111
    iget-object p0, p0, Lgr1;->d:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0, p0, v1}, Lrr2;->x(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
