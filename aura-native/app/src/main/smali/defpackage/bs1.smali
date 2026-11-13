.class public final synthetic Ldefpackage/bs1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Z

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p4, p0, Ldefpackage/bs1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/bs1;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/bs1;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput-boolean p3, p0, Ldefpackage/bs1;->o:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 13
    iput p4, p0, Ldefpackage/bs1;->n:I

    iput-object p1, p0, Ldefpackage/bs1;->p:Ljava/lang/Object;

    iput-boolean p2, p0, Ldefpackage/bs1;->o:Z

    iput-object p3, p0, Ldefpackage/bs1;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/bs1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-boolean v2, p0, Ldefpackage/bs1;->o:Z

    .line 5
    .line 6
    iget-object v3, p0, Ldefpackage/bs1;->q:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v4, p0, Ldefpackage/bs1;->p:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, Ldefpackage/ic2;

    .line 14
    .line 15
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 16
    .line 17
    :try_start_0
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    .line 18
    .line 19
    .line 20
    move-result p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    :try_start_1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-boolean p0, p0, Ldefpackage/v52;->a:Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    :try_start_2
    const-string p0, "MediaManager"

    .line 34
    .line 35
    const-string v0, "enqueue"

    .line 36
    .line 37
    invoke-static {p0, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Ldefpackage/rs1;->i(Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ldefpackage/bj2;

    .line 52
    .line 53
    invoke-virtual {p0}, Ldefpackage/sk2;->o0()I

    .line 54
    .line 55
    .line 56
    move-result v0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1

    .line 57
    const/16 v5, 0x9

    .line 58
    .line 59
    if-eqz v2, :cond_1

    .line 60
    .line 61
    const/4 v2, -0x1

    .line 62
    if-eq v0, v2, :cond_1

    .line 63
    .line 64
    add-int/2addr v0, v1

    .line 65
    :try_start_3
    new-instance v1, Ldefpackage/vs3;

    .line 66
    .line 67
    invoke-direct {v1}, Ldefpackage/vs3;-><init>()V

    .line 68
    .line 69
    .line 70
    sget-object v2, Ldefpackage/vs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 71
    .line 72
    new-instance v4, Ldefpackage/gk;

    .line 73
    .line 74
    invoke-direct {v4, v1, v0, v3, v5}, Ldefpackage/gk;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Ldefpackage/yn2;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Ldefpackage/yn2;-><init>(Ldefpackage/bj2;)V
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 83
    .line 84
    .line 85
    :try_start_4
    invoke-static {v3}, Ldefpackage/gi1;->K(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v0, p0, v1}, Ldefpackage/bo2;->i(Ldefpackage/yn2;Ldefpackage/qi3;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catch_0
    move-exception v0

    .line 98
    goto :goto_0

    .line 99
    :cond_1
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Ldefpackage/bj2;

    .line 104
    .line 105
    invoke-virtual {p0}, Ldefpackage/sk2;->Q0()I

    .line 106
    .line 107
    .line 108
    move-result p0
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_1

    .line 109
    :try_start_5
    new-instance v0, Ldefpackage/vs3;

    .line 110
    .line 111
    invoke-direct {v0}, Ldefpackage/vs3;-><init>()V

    .line 112
    .line 113
    .line 114
    sget-object v1, Ldefpackage/vs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 115
    .line 116
    new-instance v2, Ldefpackage/gk;

    .line 117
    .line 118
    invoke-direct {v2, v0, p0, v3, v5}, Ldefpackage/gk;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0

    .line 122
    .line 123
    .line 124
    :try_start_6
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Ldefpackage/bj2;

    .line 129
    .line 130
    invoke-static {v3}, Ldefpackage/gi1;->K(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 131
    .line 132
    .line 133
    move-result-object v0
    :try_end_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_1

    .line 134
    :try_start_7
    invoke-virtual {p0}, Ldefpackage/sk2;->c1()V

    .line 135
    .line 136
    .line 137
    iget-object p0, p0, Ldefpackage/sk2;->d:Ldefpackage/rk2;

    .line 138
    .line 139
    invoke-interface {p0}, Ldefpackage/rk2;->Y()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-nez v1, :cond_2

    .line 144
    .line 145
    const-string p0, "MediaController"

    .line 146
    .line 147
    const-string v0, "The controller is not connected. Ignoring addMediaItem()."

    .line 148
    .line 149
    invoke-static {p0, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    invoke-interface {p0, v0}, Ldefpackage/rk2;->U0(Ldefpackage/gn2;)V
    :try_end_7
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :catch_1
    move-exception v0

    .line 158
    :goto_0
    move-object p0, v0

    .line 159
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 160
    .line 161
    .line 162
    :cond_3
    :goto_1
    return-void

    .line 163
    :pswitch_0
    check-cast v4, Ldefpackage/ic2;

    .line 164
    .line 165
    check-cast v3, Ljava/util/List;

    .line 166
    .line 167
    :try_start_8
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    .line 168
    .line 169
    .line 170
    move-result p0
    :try_end_8
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_3

    .line 171
    if-eqz p0, :cond_5

    .line 172
    .line 173
    :try_start_9
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    iget-boolean p0, p0, Ldefpackage/v52;->a:Z
    :try_end_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_9 .. :try_end_9} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_2

    .line 178
    .line 179
    if-eqz p0, :cond_4

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_4
    :try_start_a
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    check-cast p0, Ldefpackage/bj2;
    :try_end_a
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_a .. :try_end_a} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_3

    .line 187
    .line 188
    :try_start_b
    new-instance v0, Ldefpackage/yn2;

    .line 189
    .line 190
    invoke-direct {v0, p0}, Ldefpackage/yn2;-><init>(Ldefpackage/bj2;)V
    :try_end_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_b .. :try_end_b} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_2

    .line 191
    .line 192
    .line 193
    :try_start_c
    invoke-static {v0, v3, v2}, Ldefpackage/bo2;->g(Ldefpackage/yn2;Ljava/util/List;Z)V
    :try_end_c
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_c} :catch_3

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :catch_2
    move-exception v0

    .line 198
    goto :goto_2

    .line 199
    :catch_3
    move-exception v0

    .line 200
    :goto_2
    move-object p0, v0

    .line 201
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 202
    .line 203
    .line 204
    :cond_5
    :goto_3
    return-void

    .line 205
    :pswitch_1
    check-cast v4, Landroid/app/Activity;

    .line 206
    .line 207
    check-cast v3, Ljava/io/Serializable;

    .line 208
    .line 209
    invoke-static {v4, v2, v3}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->e(Landroid/app/Activity;ZLjava/io/Serializable;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_2
    check-cast v4, Landroid/content/Context;

    .line 214
    .line 215
    check-cast v3, Ljava/lang/String;

    .line 216
    .line 217
    sget-object p0, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 218
    .line 219
    invoke-static {v3}, Ldefpackage/ot1;->h(Ljava/lang/String;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {v4, p0, v2}, Ldefpackage/ot1;->g(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_3
    check-cast v4, Ldefpackage/vb4;

    .line 228
    .line 229
    check-cast v3, Landroidx/preference/Preference;

    .line 230
    .line 231
    invoke-virtual {v4}, Ldefpackage/kc1;->y()Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    if-nez p0, :cond_6

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_6
    sput-boolean v2, Ldefpackage/bu;->g:Z

    .line 239
    .line 240
    const-string p0, "homemusic_check_update"

    .line 241
    .line 242
    invoke-virtual {v4, p0}, Ldefpackage/kp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    const/4 v0, 0x0

    .line 247
    if-eqz p0, :cond_7

    .line 248
    .line 249
    iget-boolean p0, p0, Landroidx/preference/Preference;->K:Z

    .line 250
    .line 251
    if-ne p0, v1, :cond_7

    .line 252
    .line 253
    move p0, v1

    .line 254
    goto :goto_4

    .line 255
    :cond_7
    move p0, v0

    .line 256
    :goto_4
    if-eqz v2, :cond_8

    .line 257
    .line 258
    if-eqz p0, :cond_8

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_8
    move v1, v0

    .line 262
    :goto_5
    invoke-virtual {v3, v1}, Landroidx/preference/Preference;->A(Z)V

    .line 263
    .line 264
    .line 265
    :goto_6
    return-void

    .line 266
    :pswitch_4
    move-object v5, v4

    .line 267
    check-cast v5, Lcom/eddyizm/tempus/homemusic/HubFragment;

    .line 268
    .line 269
    move-object v7, v3

    .line 270
    check-cast v7, Ljava/lang/String;

    .line 271
    .line 272
    sget-object v0, Lcom/eddyizm/tempus/homemusic/HubFragment;->y0:Ljava/util/List;

    .line 273
    .line 274
    iget-boolean v8, p0, Ldefpackage/bs1;->o:Z

    .line 275
    .line 276
    if-eqz v8, :cond_9

    .line 277
    .line 278
    :try_start_d
    invoke-static {}, Ldefpackage/rr1;->m()V

    .line 279
    .line 280
    .line 281
    goto :goto_7

    .line 282
    :catchall_0
    move-exception v0

    .line 283
    move-object p0, v0

    .line 284
    goto :goto_8

    .line 285
    :cond_9
    :goto_7
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-static {}, Ldefpackage/rr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 290
    .line 291
    .line 292
    move-object v6, p0

    .line 293
    goto :goto_9

    .line 294
    :goto_8
    new-instance v0, Ldefpackage/s14;

    .line 295
    .line 296
    invoke-direct {v0, p0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    move-object v6, v0

    .line 300
    :goto_9
    sget-object p0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 301
    .line 302
    new-instance v4, Ldefpackage/b41;

    .line 303
    .line 304
    const/4 v9, 0x1

    .line 305
    invoke-direct/range {v4 .. v9}, Ldefpackage/b41;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
