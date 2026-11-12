.class public final synthetic Lf52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/lan/LanReceiverService;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/lan/LanReceiverService;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf52;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lf52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lf52;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lf52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 15
    .line 16
    const-string v0, "Tempus "

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    :try_start_0
    sget-object v2, Lfz0;->j0:Lfz0;

    .line 20
    .line 21
    invoke-virtual {v2}, Lfz0;->e()Ljavax/net/ssl/SSLContext;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljavax/net/ssl/SSLContext;->getServerSocketFactory()Ljavax/net/ssl/SSLServerSocketFactory;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {v2, v3}, Ljavax/net/ServerSocketFactory;->createServerSocket(I)Ljava/net/ServerSocket;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast v2, Ljavax/net/ssl/SSLServerSocket;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljavax/net/ssl/SSLServerSocket;->setNeedClientAuth(Z)V

    .line 40
    .line 41
    .line 42
    iput-object v2, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->r:Ljavax/net/ssl/SSLServerSocket;

    .line 43
    .line 44
    iget-boolean v3, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 45
    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/net/ServerSocket;->close()V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :catch_0
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    iget-object v3, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->t:Landroid/net/nsd/NsdManager;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    new-instance v4, Landroid/net/nsd/NsdServiceInfo;

    .line 60
    .line 61
    invoke-direct {v4}, Landroid/net/nsd/NsdServiceInfo;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Lkb4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v4, v0}, Landroid/net/nsd/NsdServiceInfo;->setServiceName(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v0, "_tempus-lan._tcp."

    .line 76
    .line 77
    invoke-virtual {v4, v0}, Landroid/net/nsd/NsdServiceInfo;->setServiceType(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/net/ServerSocket;->getLocalPort()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-virtual {v4, v0}, Landroid/net/nsd/NsdServiceInfo;->setPort(I)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->x:Li52;

    .line 88
    .line 89
    invoke-virtual {v3, v4, v1, v0}, Landroid/net/nsd/NsdManager;->registerService(Landroid/net/nsd/NsdServiceInfo;ILandroid/net/nsd/NsdManager$RegistrationListener;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget-boolean v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 104
    .line 105
    const/16 v3, 0x3a98

    .line 106
    .line 107
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 108
    .line 109
    .line 110
    iget-object v3, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 111
    .line 112
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    :try_start_1
    iget-object v3, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 116
    .line 117
    new-instance v4, Lws1;

    .line 118
    .line 119
    const/16 v5, 0x8

    .line 120
    .line 121
    invoke-direct {v4, v5, p0, v0}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catch_1
    :try_start_2
    iget-object v3, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 129
    .line 130
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_1
    const-string v0, "nsd"

    .line 138
    .line 139
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 v0, 0x0

    .line 143
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 144
    :goto_1
    sget-object v2, Lw42;->a:Lw42;

    .line 145
    .line 146
    const-string v3, "Receiver listener failed"

    .line 147
    .line 148
    invoke-virtual {v2, v3, v0}, Lw42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 149
    .line 150
    .line 151
    iget-boolean v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 152
    .line 153
    if-eqz v0, :cond_2

    .line 154
    .line 155
    const v0, 0x7f1302b1

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    sput-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 166
    .line 167
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->n:Landroid/os/Handler;

    .line 168
    .line 169
    new-instance v2, Lf52;

    .line 170
    .line 171
    invoke-direct {v2, p0, v1}, Lf52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;I)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 175
    .line 176
    .line 177
    :cond_2
    :goto_2
    return-void

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
