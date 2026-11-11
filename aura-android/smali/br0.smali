.class public final Lbr0;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbr0;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lbr0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lbr0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lbr0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    instance-of v0, p1, Landroidx/work/impl/WorkerStoppedException;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lbr0;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Loc2;

    .line 17
    .line 18
    check-cast p1, Landroidx/work/impl/WorkerStoppedException;

    .line 19
    .line 20
    iget p1, p1, Landroidx/work/impl/WorkerStoppedException;->n:I

    .line 21
    .line 22
    iget-object v0, v0, Loc2;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    const/16 v2, -0x100

    .line 25
    .line 26
    invoke-virtual {v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object p0, p0, Lbr0;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lic2;

    .line 32
    .line 33
    invoke-interface {p0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 34
    .line 35
    .line 36
    sget-object p0, Lj15;->a:Lj15;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p1, Ltc0;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lbr0;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lsk4;

    .line 47
    .line 48
    invoke-virtual {v0, v2}, La32;->f(Ljava/util/concurrent/CancellationException;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lbr0;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Lrq3;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Lrq3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    sget-object p0, Lj15;->a:Lj15;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    check-cast p1, La23;

    .line 62
    .line 63
    iget-object v0, p0, Lbr0;->o:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Lt43;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v1, p1, La23;->o:Lr23;

    .line 71
    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_1
    move-object v1, v2

    .line 76
    :goto_0
    if-nez v1, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-virtual {p1}, La23;->c()Landroid/os/Bundle;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object p0, p0, Lbr0;->p:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Ly23;

    .line 86
    .line 87
    invoke-virtual {v0, v1, v3, p0}, Lt43;->c(Lr23;Landroid/os/Bundle;Ly23;)Lr23;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    invoke-virtual {p0, v1}, Lr23;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    move-object v2, p1

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v0}, Lt43;->b()Ld23;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p1}, La23;->c()Landroid/os/Bundle;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Lr23;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iget-object v0, v0, Ld23;->h:Lv23;

    .line 115
    .line 116
    iget-object v1, v0, Lv23;->a:Landroid/content/Context;

    .line 117
    .line 118
    invoke-virtual {v0}, Lv23;->j()Lr92;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-object v0, v0, Lv23;->o:Lj23;

    .line 123
    .line 124
    invoke-static {v1, p0, p1, v2, v0}, Ltv1;->v(Landroid/content/Context;Lr23;Landroid/os/Bundle;Lr92;Lj23;)La23;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    :goto_1
    return-object v2

    .line 129
    :pswitch_2
    check-cast p1, Lz23;

    .line 130
    .line 131
    iget-object v0, p0, Lbr0;->p:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lv23;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v3, p1, Lz23;->a:Lx23;

    .line 139
    .line 140
    iput v1, v3, Lx23;->f:I

    .line 141
    .line 142
    iput v1, v3, Lx23;->g:I

    .line 143
    .line 144
    iget-object p0, p0, Lbr0;->o:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Lr23;

    .line 147
    .line 148
    instance-of v1, p0, Lt23;

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    sget v1, Lr23;->w:I

    .line 153
    .line 154
    sget-object v1, Lk5;->y:Lk5;

    .line 155
    .line 156
    invoke-static {v1, p0}, Lfa4;->c0(Lif1;Ljava/lang/Object;)Laa4;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-interface {p0}, Laa4;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_7

    .line 169
    .line 170
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    check-cast v1, Lr23;

    .line 175
    .line 176
    invoke-virtual {v0}, Lv23;->g()Lr23;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-eqz v3, :cond_6

    .line 181
    .line 182
    iget-object v3, v3, Lr23;->o:Lt23;

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_6
    move-object v3, v2

    .line 186
    :goto_2
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_5

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_7
    sget p0, Lt23;->A:I

    .line 194
    .line 195
    invoke-virtual {v0}, Lv23;->i()Lt23;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, Ljz4;->s(Lt23;)Lr23;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    iget p0, p0, Lr23;->u:I

    .line 204
    .line 205
    iput p0, p1, Lz23;->b:I

    .line 206
    .line 207
    const/4 p0, 0x1

    .line 208
    iput-boolean p0, p1, Lz23;->c:Z

    .line 209
    .line 210
    :cond_8
    :goto_3
    sget-object p0, Lj15;->a:Lj15;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_3
    check-cast p1, Ljava/io/IOException;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Lbr0;->o:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p1, Ljr0;

    .line 221
    .line 222
    iget-object p0, p0, Lbr0;->p:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, Lll;

    .line 225
    .line 226
    monitor-enter p1

    .line 227
    :try_start_0
    invoke-virtual {p0}, Lll;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 228
    .line 229
    .line 230
    monitor-exit p1

    .line 231
    sget-object p0, Lj15;->a:Lj15;

    .line 232
    .line 233
    return-object p0

    .line 234
    :catchall_0
    move-exception p0

    .line 235
    monitor-exit p1

    .line 236
    throw p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
