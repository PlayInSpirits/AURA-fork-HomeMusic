.class public final synthetic Ljr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lic2;


# direct methods
.method public synthetic constructor <init>(Lbl2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljr1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ljr1;->o:Lic2;

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
    .locals 3

    .line 1
    iget v0, p0, Ljr1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, Ljr1;->o:Lic2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lbj2;

    .line 21
    .line 22
    invoke-virtual {v0}, Lsk2;->Q0()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-ge v0, v2, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lra0;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :try_start_1
    new-instance v0, Lvs3;

    .line 36
    .line 37
    invoke-direct {v0}, Lvs3;-><init>()V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    :try_start_2
    invoke-virtual {v0}, Lvs3;->b()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 50
    if-lt v1, v2, :cond_1

    .line 51
    .line 52
    :try_start_3
    new-instance v1, Lws1;

    .line 53
    .line 54
    const/16 v2, 0x12

    .line 55
    .line 56
    invoke-direct {v1, v2, p0, v0}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lgq0;->n:Lgq0;

    .line 60
    .line 61
    invoke-interface {p0, v1, v0}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception p0

    .line 66
    goto :goto_0

    .line 67
    :catch_1
    move-exception p0

    .line 68
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_1
    return-void

    .line 72
    :pswitch_0
    :try_start_4
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lbj2;

    .line 83
    .line 84
    invoke-virtual {v0}, Lsk2;->h0()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lbj2;

    .line 95
    .line 96
    invoke-virtual {v0}, Lsk2;->c()V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Lbj2;

    .line 104
    .line 105
    invoke-virtual {v0}, Lsk2;->stop()V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Lbj2;

    .line 113
    .line 114
    invoke-virtual {p0}, Lsk2;->r()V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_3

    .line 115
    .line 116
    .line 117
    :try_start_5
    new-instance p0, Lvs3;

    .line 118
    .line 119
    invoke-direct {p0}, Lvs3;-><init>()V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 123
    .line 124
    iget-object p0, p0, Lvs3;->a:Lns3;

    .line 125
    .line 126
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    new-instance v1, Ljq3;

    .line 130
    .line 131
    invoke-direct {v1, v2, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_2

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :catch_2
    move-exception p0

    .line 139
    goto :goto_2

    .line 140
    :catch_3
    move-exception p0

    .line 141
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 142
    .line 143
    .line 144
    :cond_3
    :goto_3
    return-void

    .line 145
    :pswitch_1
    :try_start_6
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    check-cast p0, Lbj2;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :catchall_0
    move-exception p0

    .line 153
    new-instance v0, Ls14;

    .line 154
    .line 155
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object p0, v0

    .line 159
    :goto_4
    nop

    .line 160
    instance-of v0, p0, Ls14;

    .line 161
    .line 162
    if-eqz v0, :cond_4

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_4
    move-object v1, p0

    .line 166
    :goto_5
    check-cast v1, Lbj2;

    .line 167
    .line 168
    if-nez v1, :cond_5

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_5
    invoke-virtual {v1}, Lsk2;->h0()Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-nez p0, :cond_6

    .line 176
    .line 177
    invoke-virtual {v1}, Lsk2;->q()Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eqz p0, :cond_7

    .line 182
    .line 183
    :cond_6
    invoke-virtual {v1}, Lsk2;->c()V

    .line 184
    .line 185
    .line 186
    :cond_7
    :goto_6
    return-void

    .line 187
    :pswitch_2
    :try_start_7
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    check-cast p0, Lbj2;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :catchall_1
    move-exception p0

    .line 195
    new-instance v0, Ls14;

    .line 196
    .line 197
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    move-object p0, v0

    .line 201
    :goto_7
    nop

    .line 202
    instance-of v0, p0, Ls14;

    .line 203
    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_8
    move-object v1, p0

    .line 208
    :goto_8
    check-cast v1, Lbj2;

    .line 209
    .line 210
    if-nez v1, :cond_9

    .line 211
    .line 212
    goto :goto_9

    .line 213
    :cond_9
    sget-object p0, Llr1;->a:Ljava/lang/ref/WeakReference;

    .line 214
    .line 215
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-ne p0, v1, :cond_a

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_a
    sget-object p0, Llr1;->b:Lkr1;

    .line 223
    .line 224
    invoke-virtual {v1, p0}, Lsk2;->v(Loi3;)V

    .line 225
    .line 226
    .line 227
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 228
    .line 229
    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    sput-object p0, Llr1;->a:Ljava/lang/ref/WeakReference;

    .line 233
    .line 234
    :goto_9
    return-void

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
