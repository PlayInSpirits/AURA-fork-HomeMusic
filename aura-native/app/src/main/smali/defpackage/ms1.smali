.class public final Ldefpackage/ms1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field public static volatile b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, Ldefpackage/ms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/List;ILjava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {p2, v1, v0}, Ldefpackage/gb;->m(III)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    sget p2, Ldefpackage/ms1;->b:I

    .line 26
    .line 27
    add-int/lit8 p2, p2, 0x1

    .line 28
    .line 29
    sput p2, Ldefpackage/ms1;->b:I

    .line 30
    .line 31
    sget v5, Ldefpackage/ms1;->b:I

    .line 32
    .line 33
    sget-object p2, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    new-instance v2, Ldefpackage/ks1;

    .line 36
    .line 37
    move-object v6, p0

    .line 38
    move-object v3, p1

    .line 39
    move-object v7, p3

    .line 40
    invoke-direct/range {v2 .. v7}, Ldefpackage/ks1;-><init>(Ljava/util/List;IILcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p2, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static b(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_6

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getRef()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-static {v2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getSongId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-static {v2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getRef()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "hub:"

    .line 51
    .line 52
    invoke-static {v3, v2}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getSongId()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v3, Ldefpackage/n61;->a:Ljava/util/HashMap;

    .line 61
    .line 62
    const-class v3, Ldefpackage/n61;

    .line 63
    .line 64
    monitor-enter v3

    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    :try_start_0
    sget-object v4, Ldefpackage/n61;->a:Ljava/util/HashMap;

    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    invoke-static {v5, v1}, Ldefpackage/n61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    invoke-static {v5, v2}, Ldefpackage/n61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v4, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v6, "SONG"

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v6, ":"

    .line 96
    .line 97
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v5, v1}, Ldefpackage/n61;->e(ILjava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    sget-object v1, Ldefpackage/n61;->c:Ljava/util/HashMap;

    .line 118
    .line 119
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :catchall_0
    move-exception p0

    .line 124
    goto :goto_2

    .line 125
    :cond_4
    :goto_1
    monitor-exit v3

    .line 126
    goto :goto_0

    .line 127
    :goto_2
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    throw p0

    .line 129
    :cond_5
    :goto_3
    monitor-exit v3

    .line 130
    goto :goto_0

    .line 131
    :cond_6
    const/4 v0, 0x0

    .line 132
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    new-instance v2, Ljava/util/ArrayList;

    .line 141
    .line 142
    const/16 v3, 0xa

    .line 143
    .line 144
    invoke-static {p0, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    const/4 v6, 0x0

    .line 160
    if-eqz v5, :cond_9

    .line 161
    .line 162
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 167
    .line 168
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getSongId()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    if-eqz v7, :cond_7

    .line 173
    .line 174
    invoke-static {v7}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    if-nez v8, :cond_7

    .line 179
    .line 180
    move-object v6, v7

    .line 181
    :cond_7
    if-nez v6, :cond_8

    .line 182
    .line 183
    sget-object v6, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 184
    .line 185
    invoke-static {v5}, Ldefpackage/ot1;->b(Lcom/eddyizm/tempus/homemusic/HubTracks$Item;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-static {v5}, Ljava/util/concurrent/CompletableFuture;->completedFuture(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    goto :goto_5

    .line 194
    :cond_8
    sget-object v5, Ldefpackage/ms1;->a:Ljava/util/concurrent/ExecutorService;

    .line 195
    .line 196
    new-instance v7, Ldefpackage/ei0;

    .line 197
    .line 198
    const/4 v8, 0x2

    .line 199
    invoke-direct {v7, v8, v1, v6}, Ldefpackage/ei0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v5, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    :goto_5
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-static {v2, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    move v4, v0

    .line 224
    :goto_6
    if-ge v4, v3, :cond_f

    .line 225
    .line 226
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    add-int/lit8 v4, v4, 0x1

    .line 231
    .line 232
    add-int/lit8 v7, v0, 0x1

    .line 233
    .line 234
    if-ltz v0, :cond_e

    .line 235
    .line 236
    check-cast v5, Ljava/util/concurrent/Future;

    .line 237
    .line 238
    :try_start_2
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 239
    .line 240
    const-wide/16 v9, 0x1e

    .line 241
    .line 242
    invoke-interface {v5, v9, v10, v8}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :catchall_1
    move-exception v5

    .line 250
    new-instance v8, Ldefpackage/s14;

    .line 251
    .line 252
    invoke-direct {v8, v5}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    move-object v5, v8

    .line 256
    :goto_7
    nop

    .line 257
    instance-of v8, v5, Ldefpackage/s14;

    .line 258
    .line 259
    if-eqz v8, :cond_a

    .line 260
    .line 261
    move-object v5, v6

    .line 262
    :cond_a
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 263
    .line 264
    if-nez v5, :cond_d

    .line 265
    .line 266
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    move-object v5, v0

    .line 271
    check-cast v5, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 272
    .line 273
    invoke-virtual {v5}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getSongId()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    if-eqz v5, :cond_b

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_b
    move-object v0, v6

    .line 281
    :goto_8
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 282
    .line 283
    if-eqz v0, :cond_c

    .line 284
    .line 285
    sget-object v5, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 286
    .line 287
    invoke-static {v0}, Ldefpackage/ot1;->b(Lcom/eddyizm/tempus/homemusic/HubTracks$Item;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    goto :goto_9

    .line 292
    :cond_c
    move-object v5, v6

    .line 293
    :cond_d
    :goto_9
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move v0, v7

    .line 297
    goto :goto_6

    .line 298
    :cond_e
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 299
    .line 300
    .line 301
    throw v6

    .line 302
    :cond_f
    return-object v1
.end method
