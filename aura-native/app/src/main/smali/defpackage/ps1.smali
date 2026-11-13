.class public final Ldefpackage/ps1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/oi3;


# instance fields
.field public final n:Ldefpackage/qi3;

.field public final o:Ljava/util/LinkedHashMap;

.field public final p:Ldefpackage/zq2;

.field public final q:Landroid/os/Handler;

.field public final r:Ldefpackage/g5;

.field public final s:Ldefpackage/qa1;


# direct methods
.method public constructor <init>(Ldefpackage/qi3;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/ps1;->o:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    new-instance v0, Ldefpackage/zq2;

    .line 14
    .line 15
    new-instance v1, Ldefpackage/lc;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-direct {v1, v2, p0}, Ldefpackage/lc;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Ldefpackage/zq2;-><init>(Ldefpackage/lc;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 25
    .line 26
    new-instance v0, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-interface {p1}, Ldefpackage/qi3;->U0()Landroid/os/Looper;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ldefpackage/ps1;->q:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance p1, Ldefpackage/g5;

    .line 38
    .line 39
    const/16 v1, 0xf

    .line 40
    .line 41
    invoke-direct {p1, v1, p0}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/ps1;->r:Ldefpackage/g5;

    .line 45
    .line 46
    new-instance v1, Ldefpackage/qa1;

    .line 47
    .line 48
    const/16 v2, 0xd

    .line 49
    .line 50
    invoke-direct {v1, v2, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Ldefpackage/ps1;->s:Ldefpackage/qa1;

    .line 54
    .line 55
    const-wide/16 v2, 0x3a98

    .line 56
    .line 57
    invoke-virtual {v0, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final S(Landroidx/media3/common/PlaybackException;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 5
    .line 6
    invoke-interface {p1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 13
    .line 14
    :goto_0
    move-object v2, v0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    goto :goto_0

    .line 18
    :goto_1
    invoke-interface {p1}, Ldefpackage/qi3;->M0()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    const/4 v6, 0x0

    .line 31
    const-string v7, "error"

    .line 32
    .line 33
    iget-object v1, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 34
    .line 35
    invoke-virtual/range {v1 .. v7}, Ldefpackage/zq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final V(Z)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/ps1;->c()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 8
    .line 9
    invoke-interface {p1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v0, v1

    .line 20
    :goto_0
    iget-object v2, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 21
    .line 22
    iget-object p0, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Ldefpackage/oh3;

    .line 25
    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 29
    .line 30
    :cond_2
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_3

    .line 35
    .line 36
    invoke-interface {p1}, Ldefpackage/qi3;->M0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v3

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 41
    .line 42
    .line 43
    move-result-wide v5

    .line 44
    iget-object p0, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ldefpackage/oh3;

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-virtual/range {v2 .. v7}, Ldefpackage/zq2;->b(JJZ)V

    .line 52
    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method public final c()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 4
    .line 5
    invoke-interface {v1}, Ldefpackage/qi3;->h0()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v1, v0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 13
    .line 14
    invoke-interface {v1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ldefpackage/ps1;->l(Ldefpackage/gn2;)Ldefpackage/oh3;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_a

    .line 23
    .line 24
    iget-object v4, v0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 25
    .line 26
    iget-object v4, v4, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Ldefpackage/oh3;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iget-object v4, v4, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v4, v5

    .line 37
    :goto_0
    if-nez v4, :cond_a

    .line 38
    .line 39
    iget-object v4, v0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 40
    .line 41
    invoke-interface {v4}, Ldefpackage/qi3;->M0()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    sget-object v4, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 46
    .line 47
    invoke-static {}, Ldefpackage/b00;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    sget-object v8, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 52
    .line 53
    iget-object v9, v1, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 54
    .line 55
    monitor-enter v8

    .line 56
    :try_start_0
    sget-object v10, Ldefpackage/rs1;->l:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    const/4 v12, 0x0

    .line 63
    move v13, v12

    .line 64
    :cond_2
    if-ge v13, v11, :cond_4

    .line 65
    .line 66
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    add-int/lit8 v13, v13, 0x1

    .line 71
    .line 72
    move-object v15, v14

    .line 73
    check-cast v15, Ldefpackage/kd3;

    .line 74
    .line 75
    iget-object v15, v15, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v15, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 78
    .line 79
    sget-object v16, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 80
    .line 81
    const-wide/16 v16, 0x0

    .line 82
    .line 83
    invoke-virtual {v15}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getRef()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_3

    .line 88
    .line 89
    const-string v3, "hub:"

    .line 90
    .line 91
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v15}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getNdSongId()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :goto_1
    invoke-static {v2, v9}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    invoke-virtual {v15}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_2

    .line 115
    .line 116
    invoke-virtual {v15}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDeviceId()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    sget-object v3, Ldefpackage/rs1;->k:Ldefpackage/rp4;

    .line 121
    .line 122
    invoke-virtual {v3}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v2, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_2

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    goto/16 :goto_3

    .line 137
    .line 138
    :cond_4
    const-wide/16 v16, 0x0

    .line 139
    .line 140
    move-object v14, v5

    .line 141
    :goto_2
    check-cast v14, Ldefpackage/kd3;

    .line 142
    .line 143
    if-eqz v14, :cond_5

    .line 144
    .line 145
    sget-object v2, Ldefpackage/rs1;->l:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    :cond_5
    monitor-exit v8

    .line 151
    sget-object v2, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 152
    .line 153
    iget-object v2, v1, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-static {v4, v2}, Ldefpackage/rs1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    if-eqz v14, :cond_b

    .line 159
    .line 160
    iget-object v2, v14, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 163
    .line 164
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPositionS()Ljava/lang/Double;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    if-eqz v3, :cond_6

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 171
    .line 172
    .line 173
    move-result-wide v3

    .line 174
    const-wide v8, 0x408f400000000000L    # 1000.0

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    mul-double/2addr v3, v8

    .line 180
    double-to-long v3, v3

    .line 181
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :cond_6
    if-eqz v5, :cond_9

    .line 186
    .line 187
    cmp-long v3, v6, v16

    .line 188
    .line 189
    if-lez v3, :cond_9

    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 192
    .line 193
    .line 194
    move-result-wide v3

    .line 195
    sub-long/2addr v6, v3

    .line 196
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v3

    .line 200
    const-wide/16 v5, 0x3a98

    .line 201
    .line 202
    cmp-long v3, v3, v5

    .line 203
    .line 204
    if-gtz v3, :cond_9

    .line 205
    .line 206
    iget-object v3, v0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 207
    .line 208
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 223
    .line 224
    .line 225
    move-result-wide v5

    .line 226
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object v7, v3, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v7, Ldefpackage/oh3;

    .line 232
    .line 233
    if-nez v7, :cond_8

    .line 234
    .line 235
    iput-object v4, v1, Ldefpackage/oh3;->f:Ljava/lang/String;

    .line 236
    .line 237
    cmp-long v4, v5, v16

    .line 238
    .line 239
    if-gez v4, :cond_7

    .line 240
    .line 241
    move-wide/from16 v5, v16

    .line 242
    .line 243
    :cond_7
    iput-wide v5, v1, Ldefpackage/oh3;->g:J

    .line 244
    .line 245
    iput-object v1, v3, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 246
    .line 247
    iput-boolean v12, v3, Ldefpackage/zq2;->p:Z

    .line 248
    .line 249
    iget-object v3, v0, Ldefpackage/ps1;->o:Ljava/util/LinkedHashMap;

    .line 250
    .line 251
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-virtual {v2}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_8
    const-string v0, "Check failed."

    .line 264
    .line 265
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :cond_9
    invoke-static {v2}, Ldefpackage/rs1;->d(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :goto_3
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 274
    throw v0

    .line 275
    :cond_a
    const-wide/16 v16, 0x0

    .line 276
    .line 277
    :cond_b
    :goto_4
    iget-object v9, v0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 278
    .line 279
    if-eqz v1, :cond_f

    .line 280
    .line 281
    iget-object v0, v0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 282
    .line 283
    invoke-interface {v0}, Ldefpackage/qi3;->M0()J

    .line 284
    .line 285
    .line 286
    move-result-wide v2

    .line 287
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 288
    .line 289
    .line 290
    move-result-wide v4

    .line 291
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    iget-object v0, v9, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Ldefpackage/oh3;

    .line 297
    .line 298
    if-eqz v0, :cond_c

    .line 299
    .line 300
    iget-object v6, v0, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 301
    .line 302
    iget-object v7, v1, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 303
    .line 304
    invoke-static {v6, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-nez v6, :cond_c

    .line 309
    .line 310
    iget-object v10, v0, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 311
    .line 312
    const/4 v14, 0x0

    .line 313
    const/4 v15, 0x0

    .line 314
    const/4 v11, 0x0

    .line 315
    move-wide v12, v4

    .line 316
    invoke-virtual/range {v9 .. v15}, Ldefpackage/zq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 317
    .line 318
    .line 319
    :cond_c
    iget-object v0, v9, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Ldefpackage/oh3;

    .line 322
    .line 323
    if-nez v0, :cond_d

    .line 324
    .line 325
    iput-object v1, v9, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 326
    .line 327
    iget-object v0, v9, Ldefpackage/zq2;->q:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Ldefpackage/lc;

    .line 330
    .line 331
    const-string v6, "start"

    .line 332
    .line 333
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 338
    .line 339
    .line 340
    move-result-object v8

    .line 341
    invoke-virtual {v0, v6, v1, v7, v8}, Ldefpackage/lc;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_d
    iget-wide v6, v1, Ldefpackage/oh3;->b:J

    .line 346
    .line 347
    cmp-long v1, v6, v16

    .line 348
    .line 349
    if-lez v1, :cond_e

    .line 350
    .line 351
    iget-wide v10, v0, Ldefpackage/oh3;->b:J

    .line 352
    .line 353
    cmp-long v1, v10, v16

    .line 354
    .line 355
    if-gtz v1, :cond_e

    .line 356
    .line 357
    iput-wide v6, v0, Ldefpackage/oh3;->b:J

    .line 358
    .line 359
    :cond_e
    :goto_5
    const/4 v6, 0x1

    .line 360
    move-object v1, v9

    .line 361
    invoke-virtual/range {v1 .. v6}, Ldefpackage/zq2;->b(JJZ)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :cond_f
    move-object v1, v9

    .line 366
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 367
    .line 368
    .line 369
    move-result-wide v4

    .line 370
    const/4 v6, 0x0

    .line 371
    const/4 v7, 0x0

    .line 372
    const/4 v2, 0x0

    .line 373
    const/4 v3, 0x0

    .line 374
    invoke-virtual/range {v1 .. v7}, Ldefpackage/zq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 375
    .line 376
    .line 377
    return-void
.end method

.method public final k(Ldefpackage/pi3;Ldefpackage/pi3;I)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Ldefpackage/pi3;->c:Ldefpackage/gn2;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 13
    .line 14
    move-object v3, v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v3, v1

    .line 17
    :goto_0
    if-nez p3, :cond_1

    .line 18
    .line 19
    const/4 p3, 0x1

    .line 20
    :goto_1
    move v7, p3

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    const/4 p3, 0x0

    .line 23
    goto :goto_1

    .line 24
    :goto_2
    if-nez v7, :cond_7

    .line 25
    .line 26
    iget p3, p1, Ldefpackage/pi3;->b:I

    .line 27
    .line 28
    iget v0, p2, Ldefpackage/pi3;->b:I

    .line 29
    .line 30
    if-ne p3, v0, :cond_7

    .line 31
    .line 32
    iget-object p3, p2, Ldefpackage/pi3;->c:Ldefpackage/gn2;

    .line 33
    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    iget-object p3, p3, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_2
    move-object p3, v1

    .line 40
    :goto_3
    invoke-static {v3, p3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-nez p3, :cond_3

    .line 45
    .line 46
    goto :goto_5

    .line 47
    :cond_3
    iget-object p1, p0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 48
    .line 49
    invoke-interface {p1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    iget-object p1, p1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_4
    move-object p1, v1

    .line 59
    :goto_4
    iget-object v2, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 60
    .line 61
    iget-object p0, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, Ldefpackage/oh3;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    iget-object v1, p0, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 68
    .line 69
    :cond_5
    invoke-static {p1, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    iget-wide v3, p2, Ldefpackage/pi3;->f:J

    .line 76
    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    iget-object p0, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, Ldefpackage/oh3;

    .line 84
    .line 85
    if-eqz p0, :cond_6

    .line 86
    .line 87
    iget-boolean v7, v2, Ldefpackage/zq2;->p:Z

    .line 88
    .line 89
    invoke-virtual/range {v2 .. v7}, Ldefpackage/zq2;->b(JJZ)V

    .line 90
    .line 91
    .line 92
    :cond_6
    return-void

    .line 93
    :cond_7
    :goto_5
    iget-wide p1, p1, Ldefpackage/pi3;->f:J

    .line 94
    .line 95
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    const/4 v8, 0x0

    .line 104
    iget-object v2, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 105
    .line 106
    invoke-virtual/range {v2 .. v8}, Ldefpackage/zq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ldefpackage/ps1;->c()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final l(Ldefpackage/gn2;)Ldefpackage/oh3;
    .locals 11

    .line 1
    iget-object p0, p0, Ldefpackage/ps1;->n:Ldefpackage/qi3;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_8

    .line 7
    .line 8
    :cond_0
    iget-object v2, p1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p1, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 11
    .line 12
    iget-object v3, v1, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    const-string v4, "type"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v4, v0

    .line 24
    :goto_0
    const-string v5, "music"

    .line 25
    .line 26
    invoke-static {v4, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_12

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    goto/16 :goto_8

    .line 42
    .line 43
    :cond_2
    invoke-interface {p0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p1, v4}, Ldefpackage/gn2;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    invoke-interface {p0}, Ldefpackage/qi3;->getDuration()J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move-wide p0, v4

    .line 64
    :goto_1
    cmp-long v4, p0, v4

    .line 65
    .line 66
    const-wide/16 v5, 0x0

    .line 67
    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    cmp-long v4, p0, v5

    .line 71
    .line 72
    if-lez v4, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    const-string p0, "duration"

    .line 76
    .line 77
    invoke-virtual {v3, p0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    int-to-long p0, p0

    .line 82
    const-wide/16 v7, 0x3e8

    .line 83
    .line 84
    mul-long/2addr p0, v7

    .line 85
    :goto_2
    new-instance v4, Ldefpackage/ag2;

    .line 86
    .line 87
    invoke-direct {v4}, Ldefpackage/ag2;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object v7, v1, Ldefpackage/do2;->a:Ljava/lang/CharSequence;

    .line 91
    .line 92
    if-eqz v7, :cond_6

    .line 93
    .line 94
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    if-eqz v7, :cond_6

    .line 99
    .line 100
    invoke-static {v7}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    if-nez v8, :cond_5

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_5
    move-object v7, v0

    .line 108
    :goto_3
    if-eqz v7, :cond_6

    .line 109
    .line 110
    const-string v8, "title"

    .line 111
    .line 112
    invoke-virtual {v4, v8, v7}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_6
    iget-object v7, v1, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 116
    .line 117
    if-eqz v7, :cond_8

    .line 118
    .line 119
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    if-eqz v7, :cond_8

    .line 124
    .line 125
    invoke-static {v7}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-nez v8, :cond_7

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    move-object v7, v0

    .line 133
    :goto_4
    if-eqz v7, :cond_8

    .line 134
    .line 135
    const-string v8, "artist_credit"

    .line 136
    .line 137
    invoke-virtual {v4, v8, v7}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    :cond_8
    const-string v7, "artistId"

    .line 141
    .line 142
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    if-eqz v7, :cond_a

    .line 147
    .line 148
    invoke-static {v7}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-nez v8, :cond_9

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_9
    move-object v7, v0

    .line 156
    :goto_5
    if-eqz v7, :cond_a

    .line 157
    .line 158
    const-string v8, "primary_nd_artist_id"

    .line 159
    .line 160
    invoke-virtual {v4, v8, v7}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    :cond_a
    const-string v7, "year"

    .line 164
    .line 165
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    const/16 v10, 0x3e8

    .line 174
    .line 175
    if-gt v10, v8, :cond_b

    .line 176
    .line 177
    const/16 v10, 0x2710

    .line 178
    .line 179
    if-ge v8, v10, :cond_b

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_b
    move-object v9, v0

    .line 183
    :goto_6
    if-eqz v9, :cond_c

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    invoke-virtual {v4, v7, v8}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    :cond_c
    const-string v7, "genre"

    .line 197
    .line 198
    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    if-eqz v3, :cond_e

    .line 203
    .line 204
    invoke-static {v3}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-nez v8, :cond_d

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_d
    move-object v3, v0

    .line 212
    :goto_7
    if-eqz v3, :cond_e

    .line 213
    .line 214
    invoke-virtual {v4, v7, v3}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    :cond_e
    iget-object v1, v1, Ldefpackage/do2;->c:Ljava/lang/CharSequence;

    .line 218
    .line 219
    if-eqz v1, :cond_10

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    if-eqz v1, :cond_10

    .line 226
    .line 227
    invoke-static {v1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-nez v3, :cond_f

    .line 232
    .line 233
    move-object v0, v1

    .line 234
    :cond_f
    if-eqz v0, :cond_10

    .line 235
    .line 236
    const-string v1, "album"

    .line 237
    .line 238
    invoke-virtual {v4, v1, v0}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    :cond_10
    cmp-long v0, p0, v5

    .line 242
    .line 243
    if-lez v0, :cond_11

    .line 244
    .line 245
    long-to-double v0, p0

    .line 246
    const-wide v5, 0x408f400000000000L    # 1000.0

    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    div-double/2addr v0, v5

    .line 252
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    const-string v1, "duration_s"

    .line 257
    .line 258
    invoke-virtual {v4, v1, v0}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    :cond_11
    invoke-virtual {v4}, Ldefpackage/ag2;->b()Ldefpackage/ag2;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    new-instance v1, Ldefpackage/oh3;

    .line 266
    .line 267
    sget-object v0, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 268
    .line 269
    invoke-static {v2}, Ldefpackage/rs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    sget-object v0, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 274
    .line 275
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    move-object v7, v0

    .line 280
    check-cast v7, Ldefpackage/k62;

    .line 281
    .line 282
    move-wide v3, p0

    .line 283
    invoke-direct/range {v1 .. v7}, Ldefpackage/oh3;-><init>(Ljava/lang/String;JLjava/lang/String;Ldefpackage/ag2;Ldefpackage/k62;)V

    .line 284
    .line 285
    .line 286
    return-object v1

    .line 287
    :cond_12
    :goto_8
    return-object v0
.end method

.method public final t(ILdefpackage/gn2;)V
    .locals 8

    .line 1
    iget-object p1, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ldefpackage/oh3;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v0

    .line 15
    :goto_0
    if-eqz v2, :cond_2

    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    iget-object v0, p2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 20
    .line 21
    :cond_1
    invoke-static {v0, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    iget-object v1, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-virtual/range {v1 .. v7}, Ldefpackage/zq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0}, Ldefpackage/ps1;->c()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final v(I)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p1, v0, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 5
    .line 6
    iget-object p0, v1, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/oh3;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/oh3;->a:Ljava/lang/String;

    .line 13
    .line 14
    :goto_0
    move-object v2, p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    goto :goto_0

    .line 18
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    const/4 v6, 0x1

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual/range {v1 .. v7}, Ldefpackage/zq2;->c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    sget-object p0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance p1, Ldefpackage/u6;

    .line 33
    .line 34
    const/16 v0, 0xd

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ldefpackage/u6;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method
