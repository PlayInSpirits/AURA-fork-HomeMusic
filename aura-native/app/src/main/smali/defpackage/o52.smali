.class public final synthetic Ldefpackage/o52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:J

.field public final synthetic o:Landroid/net/nsd/NsdServiceInfo;

.field public final synthetic p:Lorg/json/JSONObject;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ldefpackage/if1;

.field public final synthetic s:Ldefpackage/gf1;


# direct methods
.method public synthetic constructor <init>(JLandroid/net/nsd/NsdServiceInfo;Lorg/json/JSONObject;Ljava/lang/String;Ldefpackage/if1;Ldefpackage/gf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ldefpackage/o52;->n:J

    .line 5
    .line 6
    iput-object p3, p0, Ldefpackage/o52;->o:Landroid/net/nsd/NsdServiceInfo;

    .line 7
    .line 8
    iput-object p4, p0, Ldefpackage/o52;->p:Lorg/json/JSONObject;

    .line 9
    .line 10
    iput-object p5, p0, Ldefpackage/o52;->q:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Ldefpackage/o52;->r:Ldefpackage/if1;

    .line 13
    .line 14
    iput-object p7, p0, Ldefpackage/o52;->s:Ldefpackage/gf1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-wide v1, p0, Ldefpackage/o52;->n:J

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/o52;->o:Landroid/net/nsd/NsdServiceInfo;

    .line 4
    .line 5
    iget-object v6, p0, Ldefpackage/o52;->p:Lorg/json/JSONObject;

    .line 6
    .line 7
    iget-object v3, p0, Ldefpackage/o52;->q:Ljava/lang/String;

    .line 8
    .line 9
    move-object v4, v3

    .line 10
    iget-object v3, p0, Ldefpackage/o52;->r:Ldefpackage/if1;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/o52;->s:Ldefpackage/gf1;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    :try_start_0
    sget-wide v8, Ldefpackage/u52;->i:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    cmp-long v5, v8, v1

    .line 18
    .line 19
    const-string v8, "Check failed."

    .line 20
    .line 21
    if-nez v5, :cond_5

    .line 22
    .line 23
    :try_start_1
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    sget-object v9, Ldefpackage/u52;->l:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v5, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_5

    .line 34
    .line 35
    sget-object v5, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 36
    .line 37
    sget-object v5, Ldefpackage/fz0;->j0:Ldefpackage/fz0;

    .line 38
    .line 39
    invoke-virtual {v5}, Ldefpackage/fz0;->e()Ljavax/net/ssl/SSLContext;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v9, 0x0

    .line 44
    invoke-static {v5, v0, v1, v2, v9}, Ldefpackage/u52;->i(Ljavax/net/ssl/SSLContext;Landroid/net/nsd/NsdServiceInfo;JZ)Ljavax/net/ssl/SSLSocket;

    .line 45
    .line 46
    .line 47
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    :try_start_2
    const-string v0, "command"

    .line 49
    .line 50
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v9, "edit"

    .line 55
    .line 56
    invoke-static {v0, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    const v0, 0x1d4c0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object v3, v0

    .line 71
    goto/16 :goto_1

    .line 72
    .line 73
    :cond_0
    :goto_0
    invoke-static {v5}, Ldefpackage/fz0;->m(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    const-string v4, "Failed requirement."

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    :try_start_3
    sget-wide v9, Ldefpackage/u52;->i:J

    .line 86
    .line 87
    cmp-long v0, v9, v1

    .line 88
    .line 89
    if-nez v0, :cond_3

    .line 90
    .line 91
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    sget-object v9, Ldefpackage/u52;->l:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-static {v5, v6}, Ldefpackage/fz0;->p(Ljavax/net/ssl/SSLSocket;Lorg/json/JSONObject;)V

    .line 104
    .line 105
    .line 106
    move-object v0, v4

    .line 107
    invoke-static {v5}, Ldefpackage/fz0;->n(Ljavax/net/ssl/SSLSocket;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v8, "error"

    .line 112
    .line 113
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const-string v9, "queue_changed"

    .line 118
    .line 119
    invoke-static {v8, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    if-nez v8, :cond_2

    .line 124
    .line 125
    const-string v8, "ok"

    .line 126
    .line 127
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 128
    .line 129
    .line 130
    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 131
    if-eqz v8, :cond_1

    .line 132
    .line 133
    :try_start_4
    invoke-interface {v5}, Ljava/io/Closeable;->close()V

    .line 134
    .line 135
    .line 136
    sget-object v8, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 137
    .line 138
    new-instance v0, Ldefpackage/sn1;

    .line 139
    .line 140
    const/4 v5, 0x1

    .line 141
    invoke-direct/range {v0 .. v5}, Ldefpackage/sn1;-><init>(JLjava/lang/Object;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 145
    .line 146
    .line 147
    sget-wide v3, Ldefpackage/u52;->i:J

    .line 148
    .line 149
    cmp-long p0, v3, v1

    .line 150
    .line 151
    if-nez p0, :cond_6

    .line 152
    .line 153
    sput-object v7, Ldefpackage/u52;->n:Ljavax/net/ssl/SSLSocket;

    .line 154
    .line 155
    return-void

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    move-object p0, v0

    .line 158
    goto :goto_3

    .line 159
    :catch_0
    move-exception v0

    .line 160
    move-object v3, v0

    .line 161
    goto :goto_2

    .line 162
    :cond_1
    :try_start_5
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v3

    .line 168
    :cond_2
    new-instance v0, Ldefpackage/q52;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 171
    .line 172
    .line 173
    throw v0

    .line 174
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :cond_4
    move-object v0, v4

    .line 181
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 182
    .line 183
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 187
    :goto_1
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 188
    :catchall_2
    move-exception v0

    .line 189
    :try_start_7
    invoke-static {v5, v3}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    invoke-direct {v0, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 199
    :goto_2
    :try_start_8
    sget-object v0, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 200
    .line 201
    const-string v4, "Remote command failed"

    .line 202
    .line 203
    invoke-virtual {v0, v4, v3}, Ldefpackage/w42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 204
    .line 205
    .line 206
    sget-object v8, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 207
    .line 208
    new-instance v0, Ldefpackage/un1;

    .line 209
    .line 210
    move-object v4, v6

    .line 211
    const/4 v6, 0x1

    .line 212
    move-object v5, p0

    .line 213
    invoke-direct/range {v0 .. v6}, Ldefpackage/un1;-><init>(JLjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 217
    .line 218
    .line 219
    sget-wide v3, Ldefpackage/u52;->i:J

    .line 220
    .line 221
    cmp-long p0, v3, v1

    .line 222
    .line 223
    if-nez p0, :cond_6

    .line 224
    .line 225
    sput-object v7, Ldefpackage/u52;->n:Ljavax/net/ssl/SSLSocket;

    .line 226
    .line 227
    :cond_6
    return-void

    .line 228
    :goto_3
    sget-wide v3, Ldefpackage/u52;->i:J

    .line 229
    .line 230
    cmp-long v0, v3, v1

    .line 231
    .line 232
    if-nez v0, :cond_7

    .line 233
    .line 234
    sput-object v7, Ldefpackage/u52;->n:Ljavax/net/ssl/SSLSocket;

    .line 235
    .line 236
    :cond_7
    throw p0
.end method
