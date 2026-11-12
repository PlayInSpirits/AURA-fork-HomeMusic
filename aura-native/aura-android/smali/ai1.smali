.class public final Lai1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lai1;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lai1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p0, Lai1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const-string v0, "Timeout waiting for ServiceConnection callback "

    .line 10
    .line 11
    iget v4, p1, Landroid/os/Message;->what:I

    .line 12
    .line 13
    if-eqz v4, :cond_4

    .line 14
    .line 15
    if-eq v4, v2, :cond_0

    .line 16
    .line 17
    move v2, v3

    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lai1;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Ltk5;

    .line 23
    .line 24
    iget-object v4, v1, Ltk5;->a:Ljava/util/HashMap;

    .line 25
    .line 26
    monitor-enter v4

    .line 27
    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lnk5;

    .line 30
    .line 31
    iget-object p0, p0, Lai1;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Ltk5;

    .line 34
    .line 35
    iget-object p0, p0, Ltk5;->a:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lpk5;

    .line 42
    .line 43
    if-eqz p0, :cond_3

    .line 44
    .line 45
    iget v1, p0, Lpk5;->o:I

    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    if-ne v1, v3, :cond_3

    .line 49
    .line 50
    const-string v1, "GmsClientSupervisor"

    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v3, Ljava/lang/Exception;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/lang/Exception;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lpk5;->s:Landroid/content/ComponentName;

    .line 69
    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 80
    .line 81
    new-instance v0, Landroid/content/ComponentName;

    .line 82
    .line 83
    iget-object p1, p1, Lnk5;->b:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p1}, Lji2;->m(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    const-string v1, "unknown"

    .line 89
    .line 90
    invoke-direct {v0, p1, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    invoke-virtual {p0, v0}, Lpk5;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    monitor-exit v4

    .line 97
    goto :goto_3

    .line 98
    :goto_1
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    throw p0

    .line 100
    :cond_4
    iget-object v0, p0, Lai1;->o:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ltk5;

    .line 103
    .line 104
    iget-object v0, v0, Ltk5;->a:Ljava/util/HashMap;

    .line 105
    .line 106
    monitor-enter v0

    .line 107
    :try_start_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p1, Lnk5;

    .line 110
    .line 111
    iget-object v4, p0, Lai1;->o:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, Ltk5;

    .line 114
    .line 115
    iget-object v4, v4, Ltk5;->a:Ljava/util/HashMap;

    .line 116
    .line 117
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Lpk5;

    .line 122
    .line 123
    if-eqz v4, :cond_6

    .line 124
    .line 125
    iget-object v5, v4, Lpk5;->n:Ljava/util/HashMap;

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_6

    .line 132
    .line 133
    iget-boolean v5, v4, Lpk5;->p:Z

    .line 134
    .line 135
    if-eqz v5, :cond_5

    .line 136
    .line 137
    iget-object v5, v4, Lpk5;->r:Lnk5;

    .line 138
    .line 139
    iget-object v6, v4, Lpk5;->t:Ltk5;

    .line 140
    .line 141
    iget-object v6, v6, Ltk5;->c:Lzw2;

    .line 142
    .line 143
    invoke-virtual {v6, v2, v5}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iget-object v5, v4, Lpk5;->t:Ltk5;

    .line 147
    .line 148
    iget-object v6, v5, Ltk5;->d:Lfz0;

    .line 149
    .line 150
    iget-object v5, v5, Ltk5;->b:Landroid/content/Context;

    .line 151
    .line 152
    invoke-virtual {v6, v5, v4}, Lfz0;->o(Landroid/content/Context;Lpk5;)V

    .line 153
    .line 154
    .line 155
    iput-boolean v3, v4, Lpk5;->p:Z

    .line 156
    .line 157
    iput v1, v4, Lpk5;->o:I

    .line 158
    .line 159
    :cond_5
    iget-object p0, p0, Lai1;->o:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p0, Ltk5;

    .line 162
    .line 163
    iget-object p0, p0, Ltk5;->a:Ljava/util/HashMap;

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_2

    .line 169
    :catchall_1
    move-exception p0

    .line 170
    goto :goto_4

    .line 171
    :cond_6
    :goto_2
    monitor-exit v0

    .line 172
    :goto_3
    return v2

    .line 173
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 174
    throw p0

    .line 175
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 176
    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    move v2, v3

    .line 180
    goto :goto_5

    .line 181
    :cond_7
    iget-object p0, p0, Lai1;->o:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Lna4;

    .line 184
    .line 185
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Lrg4;

    .line 188
    .line 189
    iget-object v0, p0, Lna4;->n:Ljava/lang/Object;

    .line 190
    .line 191
    monitor-enter v0

    .line 192
    :try_start_2
    iget-object v3, p0, Lna4;->p:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v3, Lrg4;

    .line 195
    .line 196
    if-eq v3, p1, :cond_8

    .line 197
    .line 198
    iget-object v3, p0, Lna4;->q:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v3, Lrg4;

    .line 201
    .line 202
    if-ne v3, p1, :cond_9

    .line 203
    .line 204
    :cond_8
    invoke-virtual {p0, p1, v1}, Lna4;->j(Lrg4;I)Z

    .line 205
    .line 206
    .line 207
    :cond_9
    monitor-exit v0

    .line 208
    :goto_5
    return v2

    .line 209
    :catchall_2
    move-exception p0

    .line 210
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 211
    throw p0

    .line 212
    :pswitch_1
    iget-object p0, p0, Lai1;->o:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast p0, Lbi1;

    .line 215
    .line 216
    iget v0, p1, Landroid/os/Message;->what:I

    .line 217
    .line 218
    if-ne v0, v2, :cond_a

    .line 219
    .line 220
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast p1, Lzh1;

    .line 223
    .line 224
    invoke-virtual {p0, p1}, Lbi1;->b(Lzh1;)V

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_a
    if-ne v0, v1, :cond_b

    .line 229
    .line 230
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Lzh1;

    .line 233
    .line 234
    iget-object p0, p0, Lbi1;->d:Lc04;

    .line 235
    .line 236
    invoke-virtual {p0, p1}, Lc04;->q(Lwq4;)V

    .line 237
    .line 238
    .line 239
    :cond_b
    move v2, v3

    .line 240
    :goto_6
    return v2

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
