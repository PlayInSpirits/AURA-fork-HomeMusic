.class public final Ldefpackage/zk;
.super Landroid/os/Handler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 16
    iput p1, p0, Ldefpackage/zk;->a:I

    iput-object p2, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Looper;)V
    .locals 1

    .line 14
    const/4 v0, 0x3

    iput v0, p0, Ldefpackage/zk;->a:I

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;Ldefpackage/na4;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Ldefpackage/zk;->a:I

    .line 17
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    iput-object p2, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Looper;I)V
    .locals 0

    .line 15
    iput p3, p0, Ldefpackage/zk;->a:I

    iput-object p1, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/vo2;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Ldefpackage/zk;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final a(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ldefpackage/ir2;

    .line 9
    .line 10
    iget-object v0, v0, Ldefpackage/ir2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ldefpackage/ir2;

    .line 16
    .line 17
    iget-object v1, v1, Ldefpackage/ir2;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ldefpackage/kr2;

    .line 26
    .line 27
    iget-object v2, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Ldefpackage/ir2;

    .line 30
    .line 31
    iget-object v3, v2, Ldefpackage/ir2;->e:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ldefpackage/zk;

    .line 34
    .line 35
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object v0, v1, Ldefpackage/kr2;->d:Ljava/lang/Object;

    .line 39
    .line 40
    monitor-enter v0

    .line 41
    :try_start_1
    iget-object v4, v1, Ldefpackage/kr2;->l:Ldefpackage/ir2;

    .line 42
    .line 43
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    if-ne v2, v4, :cond_1

    .line 45
    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ldefpackage/ms2;

    .line 52
    .line 53
    invoke-virtual {v1, p1}, Ldefpackage/kr2;->c(Ldefpackage/ms2;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ldefpackage/ir2;

    .line 59
    .line 60
    invoke-virtual {p0, v1, v3}, Ldefpackage/ir2;->b(Ldefpackage/kr2;Landroid/os/Handler;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    invoke-virtual {v1, p0}, Ldefpackage/kr2;->c(Ldefpackage/ms2;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    throw p0

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 73
    throw p0

    .line 74
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/zk;->a:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget p1, p1, Landroid/os/Message;->what:I

    .line 13
    .line 14
    if-eq p1, v6, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ldefpackage/kp3;

    .line 20
    .line 21
    iget-object p1, p0, Ldefpackage/kp3;->m0:Ldefpackage/pp3;

    .line 22
    .line 23
    iget-object p1, p1, Ldefpackage/pp3;->g:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Landroidx/preference/PreferenceScreen;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Ldefpackage/kp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 30
    .line 31
    new-instance v0, Ldefpackage/np3;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ldefpackage/np3;-><init>(Landroidx/preference/PreferenceGroup;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/preference/PreferenceGroup;->j()V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ldefpackage/fr2;

    .line 46
    .line 47
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Ldefpackage/na4;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ldefpackage/na4;->F(Ldefpackage/fr2;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, p1, Ldefpackage/fr2;->d:Ldefpackage/er2;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Ldefpackage/er2;->c()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ldefpackage/na4;->N(Ldefpackage/fr2;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    return-void

    .line 69
    :pswitch_1
    invoke-direct {p0, p1}, Ldefpackage/zk;->a(Landroid/os/Message;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_2
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Ldefpackage/qq2;

    .line 76
    .line 77
    iget p1, p1, Landroid/os/Message;->what:I

    .line 78
    .line 79
    if-eq p1, v6, :cond_4

    .line 80
    .line 81
    if-eq p1, v5, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    iput-boolean v3, p0, Ldefpackage/qq2;->s:Z

    .line 85
    .line 86
    iget-object p1, p0, Ldefpackage/qq2;->r:Ldefpackage/up2;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ldefpackage/qq2;->e(Ldefpackage/up2;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    iput-boolean v3, p0, Ldefpackage/qq2;->u:Z

    .line 93
    .line 94
    iget-object p1, p0, Ldefpackage/qq2;->q:Ldefpackage/si1;

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    iget-object v0, p0, Ldefpackage/qq2;->t:Ldefpackage/xk0;

    .line 99
    .line 100
    iget-object p1, p1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Ldefpackage/ui1;

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ldefpackage/ui1;->d(Ldefpackage/qq2;)Ldefpackage/vq2;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-eqz p0, :cond_5

    .line 109
    .line 110
    invoke-virtual {p1, p0, v0}, Ldefpackage/ui1;->m(Ldefpackage/vq2;Ldefpackage/xk0;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    :goto_1
    return-void

    .line 114
    :pswitch_3
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Ldefpackage/lq2;

    .line 117
    .line 118
    iget p1, p1, Landroid/os/Message;->what:I

    .line 119
    .line 120
    if-eq p1, v6, :cond_7

    .line 121
    .line 122
    if-eq p1, v5, :cond_6

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    iget-object p1, p0, Ldefpackage/lq2;->K:Ldefpackage/wq2;

    .line 126
    .line 127
    if-eqz p1, :cond_8

    .line 128
    .line 129
    iput-object v4, p0, Ldefpackage/lq2;->K:Ldefpackage/wq2;

    .line 130
    .line 131
    invoke-virtual {p0}, Ldefpackage/lq2;->q()V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-virtual {p0}, Ldefpackage/lq2;->p()V

    .line 136
    .line 137
    .line 138
    :cond_8
    :goto_2
    return-void

    .line 139
    :pswitch_4
    iget v0, p1, Landroid/os/Message;->what:I

    .line 140
    .line 141
    if-eq v0, v6, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Ldefpackage/aq2;

    .line 147
    .line 148
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p1, Ljava/util/List;

    .line 151
    .line 152
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v0

    .line 156
    iput-wide v0, p0, Ldefpackage/aq2;->D:J

    .line 157
    .line 158
    iget-object v0, p0, Ldefpackage/aq2;->x:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Ldefpackage/aq2;->x:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, Ldefpackage/aq2;->y:Ldefpackage/zp2;

    .line 169
    .line 170
    invoke-virtual {p0}, Ldefpackage/zp2;->p()V

    .line 171
    .line 172
    .line 173
    :goto_3
    return-void

    .line 174
    :pswitch_5
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Ldefpackage/ep2;

    .line 177
    .line 178
    iget-object v0, p0, Ldefpackage/ep2;->K:Ldefpackage/zk;

    .line 179
    .line 180
    iget v2, p1, Landroid/os/Message;->what:I

    .line 181
    .line 182
    if-eq v2, v6, :cond_c

    .line 183
    .line 184
    if-eq v2, v5, :cond_b

    .line 185
    .line 186
    if-eq v2, v1, :cond_a

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_a
    iget-object p1, p0, Ldefpackage/ep2;->w:Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_d

    .line 196
    .line 197
    invoke-virtual {p0, v1}, Ldefpackage/ep2;->l(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v6}, Landroid/os/Handler;->removeMessages(I)V

    .line 207
    .line 208
    .line 209
    iget-object p1, p0, Ldefpackage/ep2;->t:Ldefpackage/yq2;

    .line 210
    .line 211
    iget-object p0, p0, Ldefpackage/ep2;->u:Ldefpackage/ap2;

    .line 212
    .line 213
    invoke-virtual {p1, p0}, Ldefpackage/yq2;->e(Ldefpackage/uo;)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_b
    iget-object p1, p0, Ldefpackage/ep2;->w:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-eqz p1, :cond_d

    .line 224
    .line 225
    invoke-virtual {p0, v5}, Ldefpackage/ep2;->l(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    const-wide/16 v1, 0x3a98

    .line 239
    .line 240
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p1, Ljava/util/List;

    .line 247
    .line 248
    invoke-virtual {p0, p1}, Ldefpackage/ep2;->i(Ljava/util/List;)V

    .line 249
    .line 250
    .line 251
    :cond_d
    :goto_4
    return-void

    .line 252
    :pswitch_6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 253
    .line 254
    iget v3, p1, Landroid/os/Message;->arg1:I

    .line 255
    .line 256
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 257
    .line 258
    invoke-virtual {p1}, Landroid/os/Message;->peekData()Landroid/os/Bundle;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p0, Ldefpackage/vo2;

    .line 265
    .line 266
    iget-object p0, p0, Ldefpackage/vo2;->j:Landroid/util/SparseArray;

    .line 267
    .line 268
    invoke-virtual {p0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    check-cast v6, Ldefpackage/zx3;

    .line 273
    .line 274
    if-nez v6, :cond_e

    .line 275
    .line 276
    const-string p0, "MR2Provider"

    .line 277
    .line 278
    const-string p1, "Pending callback not found for control request."

    .line 279
    .line 280
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_e
    invoke-virtual {p0, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 285
    .line 286
    .line 287
    if-eq v0, v1, :cond_11

    .line 288
    .line 289
    if-eq v0, v2, :cond_f

    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_f
    if-nez p1, :cond_10

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_10
    const-string p0, "error"

    .line 296
    .line 297
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    :goto_5
    check-cast v5, Landroid/os/Bundle;

    .line 302
    .line 303
    invoke-static {v4, v5}, Ldefpackage/zx3;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_11
    check-cast v5, Landroid/os/Bundle;

    .line 308
    .line 309
    invoke-virtual {v6, v5}, Ldefpackage/zx3;->b(Landroid/os/Bundle;)V

    .line 310
    .line 311
    .line 312
    :goto_6
    return-void

    .line 313
    :pswitch_7
    iget-object v0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Ldefpackage/pn2;

    .line 316
    .line 317
    if-eqz v0, :cond_15

    .line 318
    .line 319
    const-string p0, "data_callback_token"

    .line 320
    .line 321
    const-string v1, "data_media_item_id"

    .line 322
    .line 323
    const-string v2, "data_result_receiver"

    .line 324
    .line 325
    iget-object v5, v0, Ldefpackage/pn2;->o:Ldefpackage/pz1;

    .line 326
    .line 327
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iget v4, p1, Landroid/os/Message;->what:I

    .line 332
    .line 333
    const/16 v6, 0x1d

    .line 334
    .line 335
    packed-switch v4, :pswitch_data_1

    .line 336
    .line 337
    .line 338
    const-string p0, "MBServiceCompat"

    .line 339
    .line 340
    new-instance v0, Ljava/lang/StringBuilder;

    .line 341
    .line 342
    const-string v1, "Unhandled message: "

    .line 343
    .line 344
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v1, "\n  Service version: 2\n  Client version: "

    .line 351
    .line 352
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 356
    .line 357
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-static {p0, p1}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_7

    .line 368
    .line 369
    :pswitch_8
    const-string p0, "data_custom_action_extras"

    .line 370
    .line 371
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    invoke-static {p0}, Ldefpackage/f35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 376
    .line 377
    .line 378
    move-result-object v8

    .line 379
    const-string p0, "data_custom_action"

    .line 380
    .line 381
    invoke-virtual {v0, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v7

    .line 385
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 386
    .line 387
    .line 388
    move-result-object p0

    .line 389
    move-object v9, p0

    .line 390
    check-cast v9, Ldefpackage/v14;

    .line 391
    .line 392
    move v4, v6

    .line 393
    new-instance v6, Ldefpackage/hg3;

    .line 394
    .line 395
    iget-object p0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 396
    .line 397
    invoke-direct {v6, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    if-nez p0, :cond_16

    .line 408
    .line 409
    if-nez v9, :cond_12

    .line 410
    .line 411
    goto/16 :goto_7

    .line 412
    .line 413
    :cond_12
    iget-object p0, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast p0, Ldefpackage/pn2;

    .line 416
    .line 417
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 418
    .line 419
    new-instance v4, Ldefpackage/wj2;

    .line 420
    .line 421
    const/4 v10, 0x1

    .line 422
    invoke-direct/range {v4 .. v10}, Ldefpackage/wj2;-><init>(Ldefpackage/pz1;Ldefpackage/hg3;Ljava/lang/String;Landroid/os/Bundle;Ldefpackage/v14;I)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p0, v4}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_7

    .line 429
    .line 430
    :pswitch_9
    move v4, v6

    .line 431
    const-string p0, "data_search_extras"

    .line 432
    .line 433
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-static {p0}, Ldefpackage/f35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 438
    .line 439
    .line 440
    move-result-object v8

    .line 441
    const-string p0, "data_search_query"

    .line 442
    .line 443
    invoke-virtual {v0, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 448
    .line 449
    .line 450
    move-result-object p0

    .line 451
    move-object v9, p0

    .line 452
    check-cast v9, Ldefpackage/v14;

    .line 453
    .line 454
    new-instance v6, Ldefpackage/hg3;

    .line 455
    .line 456
    iget-object p0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 457
    .line 458
    invoke-direct {v6, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 465
    .line 466
    .line 467
    move-result p0

    .line 468
    if-nez p0, :cond_16

    .line 469
    .line 470
    if-nez v9, :cond_13

    .line 471
    .line 472
    goto/16 :goto_7

    .line 473
    .line 474
    :cond_13
    iget-object p0, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast p0, Ldefpackage/pn2;

    .line 477
    .line 478
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 479
    .line 480
    new-instance v4, Ldefpackage/wj2;

    .line 481
    .line 482
    const/4 v10, 0x0

    .line 483
    invoke-direct/range {v4 .. v10}, Ldefpackage/wj2;-><init>(Ldefpackage/pz1;Ldefpackage/hg3;Ljava/lang/String;Landroid/os/Bundle;Ldefpackage/v14;I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {p0, v4}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 487
    .line 488
    .line 489
    goto/16 :goto_7

    .line 490
    .line 491
    :pswitch_a
    move v4, v6

    .line 492
    new-instance p0, Ldefpackage/hg3;

    .line 493
    .line 494
    iget-object p1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 495
    .line 496
    invoke-direct {p0, v4, p1}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    iget-object p1, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 500
    .line 501
    check-cast p1, Ldefpackage/pn2;

    .line 502
    .line 503
    iget-object p1, p1, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 504
    .line 505
    new-instance v0, Ldefpackage/lg1;

    .line 506
    .line 507
    const/16 v1, 0x14

    .line 508
    .line 509
    invoke-direct {v0, v5, p0, v3, v1}, Ldefpackage/lg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {p1, v0}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 513
    .line 514
    .line 515
    goto/16 :goto_7

    .line 516
    .line 517
    :pswitch_b
    move v4, v6

    .line 518
    const-string p0, "data_root_hints"

    .line 519
    .line 520
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-static {p0}, Ldefpackage/f35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 525
    .line 526
    .line 527
    move-result-object v10

    .line 528
    new-instance v6, Ldefpackage/hg3;

    .line 529
    .line 530
    iget-object p0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 531
    .line 532
    invoke-direct {v6, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    const-string p0, "data_package_name"

    .line 536
    .line 537
    invoke-virtual {v0, p0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v8

    .line 541
    const-string p0, "data_calling_pid"

    .line 542
    .line 543
    invoke-virtual {v0, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v9

    .line 547
    const-string p0, "data_calling_uid"

    .line 548
    .line 549
    invoke-virtual {v0, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 550
    .line 551
    .line 552
    move-result v7

    .line 553
    iget-object p0, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast p0, Ldefpackage/pn2;

    .line 556
    .line 557
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 558
    .line 559
    new-instance v4, Ldefpackage/vj2;

    .line 560
    .line 561
    invoke-direct/range {v4 .. v10}, Ldefpackage/vj2;-><init>(Ldefpackage/pz1;Ldefpackage/hg3;ILjava/lang/String;ILandroid/os/Bundle;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {p0, v4}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_7

    .line 568
    .line 569
    :pswitch_c
    move v4, v6

    .line 570
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    move-object v8, p0

    .line 579
    check-cast v8, Ldefpackage/v14;

    .line 580
    .line 581
    new-instance v6, Ldefpackage/hg3;

    .line 582
    .line 583
    iget-object p0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 584
    .line 585
    invoke-direct {v6, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 592
    .line 593
    .line 594
    move-result p0

    .line 595
    if-nez p0, :cond_16

    .line 596
    .line 597
    if-nez v8, :cond_14

    .line 598
    .line 599
    goto :goto_7

    .line 600
    :cond_14
    iget-object p0, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast p0, Ldefpackage/pn2;

    .line 603
    .line 604
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 605
    .line 606
    new-instance v4, Ldefpackage/sz;

    .line 607
    .line 608
    const/4 v9, 0x3

    .line 609
    invoke-direct/range {v4 .. v9}, Ldefpackage/sz;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {p0, v4}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 613
    .line 614
    .line 615
    goto :goto_7

    .line 616
    :pswitch_d
    move v4, v6

    .line 617
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    new-instance v6, Ldefpackage/hg3;

    .line 626
    .line 627
    iget-object p0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 628
    .line 629
    invoke-direct {v6, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    iget-object p0, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast p0, Ldefpackage/pn2;

    .line 635
    .line 636
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 637
    .line 638
    new-instance v4, Ldefpackage/sz;

    .line 639
    .line 640
    const/4 v9, 0x2

    .line 641
    invoke-direct/range {v4 .. v9}, Ldefpackage/sz;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {p0, v4}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 645
    .line 646
    .line 647
    goto :goto_7

    .line 648
    :pswitch_e
    move v4, v6

    .line 649
    const-string v2, "data_options"

    .line 650
    .line 651
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-static {v2}, Ldefpackage/f35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 656
    .line 657
    .line 658
    move-result-object v9

    .line 659
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v7

    .line 663
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    .line 664
    .line 665
    .line 666
    move-result-object v8

    .line 667
    new-instance v6, Ldefpackage/hg3;

    .line 668
    .line 669
    iget-object p0, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 670
    .line 671
    invoke-direct {v6, v4, p0}, Ldefpackage/hg3;-><init>(ILjava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    iget-object p0, v5, Ldefpackage/pz1;->o:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast p0, Ldefpackage/pn2;

    .line 677
    .line 678
    iget-object p0, p0, Ldefpackage/pn2;->t:Ldefpackage/zk;

    .line 679
    .line 680
    new-instance v4, Ldefpackage/wj2;

    .line 681
    .line 682
    invoke-direct/range {v4 .. v9}, Ldefpackage/wj2;-><init>(Ldefpackage/pz1;Ldefpackage/hg3;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {p0, v4}, Ldefpackage/zk;->b(Ljava/lang/Runnable;)V

    .line 686
    .line 687
    .line 688
    goto :goto_7

    .line 689
    :cond_15
    invoke-virtual {p0, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    :cond_16
    :goto_7
    return-void

    .line 693
    :pswitch_f
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v0, [B

    .line 696
    .line 697
    if-nez v0, :cond_17

    .line 698
    .line 699
    goto :goto_8

    .line 700
    :cond_17
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast p0, Ldefpackage/kk0;

    .line 703
    .line 704
    iget-object p0, p0, Ldefpackage/kk0;->m:Ljava/util/ArrayList;

    .line 705
    .line 706
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    move v4, v3

    .line 711
    :cond_18
    if-ge v4, v1, :cond_1a

    .line 712
    .line 713
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v6

    .line 717
    add-int/lit8 v4, v4, 0x1

    .line 718
    .line 719
    check-cast v6, Ldefpackage/ik0;

    .line 720
    .line 721
    invoke-virtual {v6}, Ldefpackage/ik0;->o()V

    .line 722
    .line 723
    .line 724
    iget-object v7, v6, Ldefpackage/ik0;->v:[B

    .line 725
    .line 726
    invoke-static {v7, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 727
    .line 728
    .line 729
    move-result v7

    .line 730
    if-eqz v7, :cond_18

    .line 731
    .line 732
    iget p0, p1, Landroid/os/Message;->what:I

    .line 733
    .line 734
    if-eq p0, v5, :cond_19

    .line 735
    .line 736
    goto :goto_8

    .line 737
    :cond_19
    iget p0, v6, Ldefpackage/ik0;->p:I

    .line 738
    .line 739
    if-ne p0, v2, :cond_1a

    .line 740
    .line 741
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 742
    .line 743
    invoke-virtual {v6, v3}, Ldefpackage/ik0;->i(Z)V

    .line 744
    .line 745
    .line 746
    :cond_1a
    :goto_8
    return-void

    .line 747
    :pswitch_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v0, Landroid/util/Pair;

    .line 750
    .line 751
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 752
    .line 753
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 754
    .line 755
    iget p1, p1, Landroid/os/Message;->what:I

    .line 756
    .line 757
    if-eq p1, v6, :cond_20

    .line 758
    .line 759
    if-eq p1, v5, :cond_1b

    .line 760
    .line 761
    goto/16 :goto_f

    .line 762
    .line 763
    :cond_1b
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast p0, Ldefpackage/ik0;

    .line 766
    .line 767
    iget-object p1, p0, Ldefpackage/ik0;->x:Ldefpackage/k31;

    .line 768
    .line 769
    if-ne v1, p1, :cond_24

    .line 770
    .line 771
    invoke-virtual {p0}, Ldefpackage/ik0;->j()Z

    .line 772
    .line 773
    .line 774
    move-result p1

    .line 775
    if-nez p1, :cond_1c

    .line 776
    .line 777
    goto/16 :goto_f

    .line 778
    .line 779
    :cond_1c
    iput-object v4, p0, Ldefpackage/ik0;->x:Ldefpackage/k31;

    .line 780
    .line 781
    iget-object p1, p0, Ldefpackage/ik0;->o:Ljava/lang/Object;

    .line 782
    .line 783
    monitor-enter p1

    .line 784
    :try_start_0
    iget-object v1, p0, Ldefpackage/ik0;->y:Ldefpackage/si1;

    .line 785
    .line 786
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    new-instance v5, Ldefpackage/tv1;

    .line 790
    .line 791
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 792
    .line 793
    .line 794
    iget-object v1, v1, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, Ldefpackage/uw1;

    .line 797
    .line 798
    invoke-virtual {v1}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 799
    .line 800
    .line 801
    iput-object v4, p0, Ldefpackage/ik0;->y:Ldefpackage/si1;

    .line 802
    .line 803
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 804
    instance-of p1, v0, Ljava/lang/Exception;

    .line 805
    .line 806
    if-nez p1, :cond_1f

    .line 807
    .line 808
    instance-of p1, v0, Ljava/lang/NoSuchMethodError;

    .line 809
    .line 810
    if-eqz p1, :cond_1d

    .line 811
    .line 812
    goto :goto_d

    .line 813
    :cond_1d
    :try_start_1
    check-cast v0, Ldefpackage/qm2;

    .line 814
    .line 815
    iget-object p1, v0, Ldefpackage/qm2;->a:[B
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_1 .. :try_end_1} :catch_0

    .line 816
    .line 817
    iget-object v0, p0, Ldefpackage/ik0;->b:Ldefpackage/m31;

    .line 818
    .line 819
    :try_start_2
    iget-object v1, p0, Ldefpackage/ik0;->v:[B

    .line 820
    .line 821
    invoke-interface {v0, v1, p1}, Ldefpackage/m31;->H([B[B)[B

    .line 822
    .line 823
    .line 824
    move-result-object p1

    .line 825
    iget-object v0, p0, Ldefpackage/ik0;->w:[B

    .line 826
    .line 827
    if-eqz v0, :cond_1e

    .line 828
    .line 829
    if-eqz p1, :cond_1e

    .line 830
    .line 831
    array-length v0, p1

    .line 832
    if-eqz v0, :cond_1e

    .line 833
    .line 834
    iput-object p1, p0, Ldefpackage/ik0;->w:[B

    .line 835
    .line 836
    goto :goto_a

    .line 837
    :catch_0
    move-exception v0

    .line 838
    :goto_9
    move-object p1, v0

    .line 839
    goto :goto_c

    .line 840
    :catch_1
    move-exception v0

    .line 841
    goto :goto_9

    .line 842
    :cond_1e
    :goto_a
    iput v2, p0, Ldefpackage/ik0;->p:I

    .line 843
    .line 844
    iget-object p1, p0, Ldefpackage/ik0;->h:Ldefpackage/ie0;

    .line 845
    .line 846
    iget-object v1, p1, Ldefpackage/ie0;->n:Ljava/lang/Object;

    .line 847
    .line 848
    monitor-enter v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_2 .. :try_end_2} :catch_0

    .line 849
    :try_start_3
    iget-object p1, p1, Ldefpackage/ie0;->p:Ljava/util/Set;

    .line 850
    .line 851
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 852
    :try_start_4
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 853
    .line 854
    .line 855
    move-result-object p1

    .line 856
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    if-eqz v0, :cond_24

    .line 861
    .line 862
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    check-cast v0, Ldefpackage/sw0;

    .line 867
    .line 868
    invoke-virtual {v0, v5}, Ldefpackage/sw0;->a(Ldefpackage/tv1;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_4 .. :try_end_4} :catch_0

    .line 869
    .line 870
    .line 871
    goto :goto_b

    .line 872
    :catchall_0
    move-exception v0

    .line 873
    move-object p1, v0

    .line 874
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 875
    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/NoSuchMethodError; {:try_start_6 .. :try_end_6} :catch_0

    .line 876
    :goto_c
    invoke-virtual {p0, p1, v6}, Ldefpackage/ik0;->l(Ljava/lang/Throwable;Z)V

    .line 877
    .line 878
    .line 879
    goto :goto_f

    .line 880
    :cond_1f
    :goto_d
    check-cast v0, Ljava/lang/Throwable;

    .line 881
    .line 882
    invoke-virtual {p0, v0, v3}, Ldefpackage/ik0;->l(Ljava/lang/Throwable;Z)V

    .line 883
    .line 884
    .line 885
    goto :goto_f

    .line 886
    :catchall_1
    move-exception v0

    .line 887
    move-object p0, v0

    .line 888
    :try_start_7
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 889
    throw p0

    .line 890
    :cond_20
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast p0, Ldefpackage/ik0;

    .line 893
    .line 894
    iget-object p1, p0, Ldefpackage/ik0;->c:Ldefpackage/qr2;

    .line 895
    .line 896
    iget-object v2, p0, Ldefpackage/ik0;->z:Ldefpackage/l31;

    .line 897
    .line 898
    if-ne v1, v2, :cond_24

    .line 899
    .line 900
    iget v1, p0, Ldefpackage/ik0;->p:I

    .line 901
    .line 902
    if-eq v1, v5, :cond_21

    .line 903
    .line 904
    invoke-virtual {p0}, Ldefpackage/ik0;->j()Z

    .line 905
    .line 906
    .line 907
    move-result v1

    .line 908
    if-nez v1, :cond_21

    .line 909
    .line 910
    goto :goto_f

    .line 911
    :cond_21
    iput-object v4, p0, Ldefpackage/ik0;->z:Ldefpackage/l31;

    .line 912
    .line 913
    instance-of v1, v0, Ljava/lang/Exception;

    .line 914
    .line 915
    if-eqz v1, :cond_22

    .line 916
    .line 917
    check-cast v0, Ljava/lang/Exception;

    .line 918
    .line 919
    invoke-virtual {p1, v0, v3}, Ldefpackage/qr2;->q(Ljava/lang/Exception;Z)V

    .line 920
    .line 921
    .line 922
    goto :goto_f

    .line 923
    :cond_22
    :try_start_8
    iget-object p0, p0, Ldefpackage/ik0;->b:Ldefpackage/m31;

    .line 924
    .line 925
    check-cast v0, Ldefpackage/qm2;

    .line 926
    .line 927
    iget-object v0, v0, Ldefpackage/qm2;->a:[B

    .line 928
    .line 929
    invoke-interface {p0, v0}, Ldefpackage/m31;->N([B)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 930
    .line 931
    .line 932
    iput-object v4, p1, Ldefpackage/qr2;->p:Ljava/lang/Object;

    .line 933
    .line 934
    iget-object p0, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 935
    .line 936
    check-cast p0, Ljava/util/HashSet;

    .line 937
    .line 938
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 939
    .line 940
    .line 941
    move-result-object p1

    .line 942
    invoke-virtual {p0}, Ljava/util/HashSet;->clear()V

    .line 943
    .line 944
    .line 945
    invoke-virtual {p1, v3}, Ldefpackage/yw1;->m(I)Ldefpackage/vw1;

    .line 946
    .line 947
    .line 948
    move-result-object p0

    .line 949
    :cond_23
    :goto_e
    invoke-virtual {p0}, Ldefpackage/v0;->hasNext()Z

    .line 950
    .line 951
    .line 952
    move-result p1

    .line 953
    if-eqz p1, :cond_24

    .line 954
    .line 955
    invoke-virtual {p0}, Ldefpackage/v0;->next()Ljava/lang/Object;

    .line 956
    .line 957
    .line 958
    move-result-object p1

    .line 959
    check-cast p1, Ldefpackage/ik0;

    .line 960
    .line 961
    invoke-virtual {p1}, Ldefpackage/ik0;->m()Z

    .line 962
    .line 963
    .line 964
    move-result v0

    .line 965
    if-eqz v0, :cond_23

    .line 966
    .line 967
    invoke-virtual {p1, v6}, Ldefpackage/ik0;->i(Z)V

    .line 968
    .line 969
    .line 970
    goto :goto_e

    .line 971
    :catch_2
    move-exception v0

    .line 972
    move-object p0, v0

    .line 973
    invoke-virtual {p1, p0, v6}, Ldefpackage/qr2;->q(Ljava/lang/Exception;Z)V

    .line 974
    .line 975
    .line 976
    :cond_24
    :goto_f
    return-void

    .line 977
    :pswitch_11
    iget-object p0, p0, Ldefpackage/zk;->b:Ljava/lang/Object;

    .line 978
    .line 979
    check-cast p0, Ldefpackage/bl;

    .line 980
    .line 981
    iget v0, p1, Landroid/os/Message;->what:I

    .line 982
    .line 983
    if-eq v0, v6, :cond_2e

    .line 984
    .line 985
    if-eq v0, v5, :cond_2b

    .line 986
    .line 987
    if-eq v0, v1, :cond_2a

    .line 988
    .line 989
    if-eq v0, v2, :cond_27

    .line 990
    .line 991
    iget-object v1, p0, Ldefpackage/bl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    .line 992
    .line 993
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 994
    .line 995
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object p0

    .line 999
    invoke-direct {v2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    :cond_25
    invoke-virtual {v1, v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result p0

    .line 1006
    if-eqz p0, :cond_26

    .line 1007
    .line 1008
    goto/16 :goto_12

    .line 1009
    .line 1010
    :cond_26
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object p0

    .line 1014
    if-eqz p0, :cond_25

    .line 1015
    .line 1016
    goto/16 :goto_12

    .line 1017
    .line 1018
    :cond_27
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast p1, Landroid/os/Bundle;

    .line 1021
    .line 1022
    :try_start_9
    iget-object v0, p0, Ldefpackage/bl;->n:Landroid/media/MediaCodec;

    .line 1023
    .line 1024
    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V
    :try_end_9
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_3

    .line 1025
    .line 1026
    .line 1027
    goto/16 :goto_12

    .line 1028
    .line 1029
    :catch_3
    move-exception v0

    .line 1030
    move-object p1, v0

    .line 1031
    iget-object v0, p0, Ldefpackage/bl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1032
    .line 1033
    :cond_28
    invoke-virtual {v0, v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result p0

    .line 1037
    if-eqz p0, :cond_29

    .line 1038
    .line 1039
    goto :goto_12

    .line 1040
    :cond_29
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object p0

    .line 1044
    if-eqz p0, :cond_28

    .line 1045
    .line 1046
    goto :goto_12

    .line 1047
    :cond_2a
    iget-object p0, p0, Ldefpackage/bl;->r:Ldefpackage/q90;

    .line 1048
    .line 1049
    invoke-virtual {p0}, Ldefpackage/q90;->d()Z

    .line 1050
    .line 1051
    .line 1052
    goto :goto_12

    .line 1053
    :cond_2b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1054
    .line 1055
    move-object v1, p1

    .line 1056
    check-cast v1, Ldefpackage/al;

    .line 1057
    .line 1058
    iget v6, v1, Ldefpackage/al;->a:I

    .line 1059
    .line 1060
    iget-object v8, v1, Ldefpackage/al;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 1061
    .line 1062
    iget-wide v9, v1, Ldefpackage/al;->d:J

    .line 1063
    .line 1064
    iget v11, v1, Ldefpackage/al;->e:I

    .line 1065
    .line 1066
    :try_start_a
    sget-object p1, Ldefpackage/bl;->u:Ljava/lang/Object;

    .line 1067
    .line 1068
    monitor-enter p1
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4

    .line 1069
    :try_start_b
    iget-object v5, p0, Ldefpackage/bl;->n:Landroid/media/MediaCodec;

    .line 1070
    .line 1071
    const/4 v7, 0x0

    .line 1072
    invoke-virtual/range {v5 .. v11}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 1073
    .line 1074
    .line 1075
    monitor-exit p1

    .line 1076
    goto :goto_10

    .line 1077
    :catchall_2
    move-exception v0

    .line 1078
    monitor-exit p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1079
    :try_start_c
    throw v0
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_4

    .line 1080
    :catch_4
    move-exception v0

    .line 1081
    move-object p1, v0

    .line 1082
    iget-object v2, p0, Ldefpackage/bl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1083
    .line 1084
    :cond_2c
    invoke-virtual {v2, v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    move-result p0

    .line 1088
    if-eqz p0, :cond_2d

    .line 1089
    .line 1090
    goto :goto_10

    .line 1091
    :cond_2d
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object p0

    .line 1095
    if-eqz p0, :cond_2c

    .line 1096
    .line 1097
    :goto_10
    move-object v4, v1

    .line 1098
    goto :goto_12

    .line 1099
    :cond_2e
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast p1, Ldefpackage/al;

    .line 1102
    .line 1103
    iget v6, p1, Ldefpackage/al;->a:I

    .line 1104
    .line 1105
    iget v8, p1, Ldefpackage/al;->b:I

    .line 1106
    .line 1107
    iget-wide v9, p1, Ldefpackage/al;->d:J

    .line 1108
    .line 1109
    iget v11, p1, Ldefpackage/al;->e:I

    .line 1110
    .line 1111
    :try_start_d
    iget-object v5, p0, Ldefpackage/bl;->n:Landroid/media/MediaCodec;

    .line 1112
    .line 1113
    const/4 v7, 0x0

    .line 1114
    invoke-virtual/range {v5 .. v11}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_5

    .line 1115
    .line 1116
    .line 1117
    goto :goto_11

    .line 1118
    :catch_5
    move-exception v0

    .line 1119
    iget-object p0, p0, Ldefpackage/bl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1120
    .line 1121
    :cond_2f
    invoke-virtual {p0, v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1122
    .line 1123
    .line 1124
    move-result v1

    .line 1125
    if-eqz v1, :cond_30

    .line 1126
    .line 1127
    goto :goto_11

    .line 1128
    :cond_30
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v1

    .line 1132
    if-eqz v1, :cond_2f

    .line 1133
    .line 1134
    :goto_11
    move-object v4, p1

    .line 1135
    :goto_12
    if-eqz v4, :cond_31

    .line 1136
    .line 1137
    sget-object p0, Ldefpackage/bl;->t:Ljava/util/ArrayDeque;

    .line 1138
    .line 1139
    monitor-enter p0

    .line 1140
    :try_start_e
    invoke-virtual {p0, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1141
    .line 1142
    .line 1143
    monitor-exit p0

    .line 1144
    goto :goto_13

    .line 1145
    :catchall_3
    move-exception v0

    .line 1146
    move-object p1, v0

    .line 1147
    monitor-exit p0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 1148
    throw p1

    .line 1149
    :cond_31
    :goto_13
    return-void

    .line 1150
    nop

    .line 1151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public sendMessageAtTime(Landroid/os/Message;J)Z
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/zk;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-class v1, Ldefpackage/jj2;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 25
    .line 26
    .line 27
    const-string v1, "data_calling_uid"

    .line 28
    .line 29
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const-string v2, "data_calling_pid"

    .line 41
    .line 42
    if-lez v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    const/4 v1, -0x1

    .line 55
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    return p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
