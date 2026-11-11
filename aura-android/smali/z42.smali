.class public final Lz42;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public volatile a:Ljavax/net/ssl/SSLSocket;


# virtual methods
.method public final a(Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;)Ly42;
    .locals 12

    .line 1
    const-string v0, "ok"

    .line 2
    .line 3
    const-string v1, "Controller pairing failed at "

    .line 4
    .line 5
    sget-object v2, Lr42;->n:Lr42;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    const/4 v5, 0x0

    .line 12
    :try_start_0
    sget-object v6, Lfz0;->j0:Lfz0;

    .line 13
    .line 14
    invoke-virtual {v6}, Lfz0;->e()Ljavax/net/ssl/SSLContext;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    invoke-virtual {v6}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-virtual {v6}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast v6, Ljavax/net/ssl/SSLSocket;

    .line 30
    .line 31
    iput-object v6, p0, Lz42;->a:Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    const/16 v7, 0x3a98

    .line 34
    .line 35
    :try_start_1
    invoke-virtual {v6, v7}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 36
    .line 37
    .line 38
    sget-object v2, Lr42;->o:Lr42;

    .line 39
    .line 40
    new-instance v7, Ljava/net/InetSocketAddress;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getHost()Ljava/net/InetAddress;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {v7, v8, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0x1388

    .line 54
    .line 55
    invoke-virtual {v6, v7, p1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 56
    .line 57
    .line 58
    sget-object v2, Lr42;->p:Lr42;

    .line 59
    .line 60
    invoke-virtual {v6}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 61
    .line 62
    .line 63
    sget-object v2, Lr42;->q:Lr42;

    .line 64
    .line 65
    invoke-static {v6}, Lfz0;->m(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-static {v6}, Lfz0;->l(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    const-string v9, "Failed requirement."

    .line 78
    .line 79
    if-nez v8, :cond_3

    .line 80
    .line 81
    :try_start_2
    sget-object v2, Lr42;->r:Lr42;

    .line 82
    .line 83
    new-instance v8, Lorg/json/JSONObject;

    .line 84
    .line 85
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v10, "command"

    .line 89
    .line 90
    const-string v11, "hello"

    .line 91
    .line 92
    invoke-virtual {v8, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const-string v10, "name"

    .line 97
    .line 98
    invoke-virtual {v8, v10, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v6, p2}, Lfz0;->p(Ljavax/net/ssl/SSLSocket;Lorg/json/JSONObject;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v6}, Lfz0;->n(Ljavax/net/ssl/SSLSocket;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    const-string v8, "error"

    .line 113
    .line 114
    invoke-virtual {p2, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-nez v8, :cond_2

    .line 119
    .line 120
    invoke-static {p1, v7}, Lfz0;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-nez v8, :cond_1

    .line 129
    .line 130
    const-string v8, "pair"

    .line 131
    .line 132
    invoke-virtual {p2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    invoke-static {v8, v7}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_0

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 144
    .line 145
    invoke-direct {p1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :catchall_0
    move-exception p1

    .line 150
    goto :goto_1

    .line 151
    :cond_1
    :goto_0
    new-instance v8, Ly42;

    .line 152
    .line 153
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    invoke-direct {v8, p1, v7, p2}, Ly42;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    .line 159
    .line 160
    :try_start_3
    invoke-interface {v6}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 161
    .line 162
    .line 163
    iput-object v5, p0, Lz42;->a:Ljavax/net/ssl/SSLSocket;

    .line 164
    .line 165
    return-object v8

    .line 166
    :catchall_1
    move-exception p1

    .line 167
    goto :goto_3

    .line 168
    :catch_0
    move-exception p1

    .line 169
    goto :goto_2

    .line 170
    :cond_2
    :try_start_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    invoke-direct {p1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw p1

    .line 176
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    invoke-direct {p1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 182
    :goto_1
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 183
    :catchall_2
    move-exception p2

    .line 184
    :try_start_6
    invoke-static {v6, p1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 185
    .line 186
    .line 187
    throw p2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 188
    :goto_2
    :try_start_7
    sget-object p2, Lw42;->a:Lw42;

    .line 189
    .line 190
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    sub-long/2addr v6, v3

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v1, " ("

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v1, "ms)"

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {p2, v0, p1}, Lw42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 221
    .line 222
    .line 223
    new-instance p2, Lcom/eddyizm/tempus/lan/LanConnectionFailure;

    .line 224
    .line 225
    invoke-direct {p2, v2, p1}, Lcom/eddyizm/tempus/lan/LanConnectionFailure;-><init>(Lr42;Ljava/lang/Exception;)V

    .line 226
    .line 227
    .line 228
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 229
    :goto_3
    iput-object v5, p0, Lz42;->a:Ljavax/net/ssl/SSLSocket;

    .line 230
    .line 231
    throw p1
.end method
