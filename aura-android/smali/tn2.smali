.class public final Ltn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final H:Lab4;

.field public static final I:Lgo4;


# instance fields
.field public final A:Lyw1;

.field public final B:Landroid/os/Bundle;

.field public final C:Lkn2;

.field public final D:Lpq;

.field public final E:Lnl1;

.field public final F:Lnl1;

.field public final G:I

.field public final a:Ljava/lang/Object;

.field public final b:Landroid/net/Uri;

.field public final c:Lwr2;

.field public final d:Lcj2;

.field public final e:Lpq;

.field public final f:Lcom/eddyizm/tempus/service/MediaService;

.field public final g:Lkt2;

.field public final h:Lls2;

.field public final i:Ljava/lang/String;

.field public final j:Lcb4;

.field public final k:Lkn2;

.field public final l:Landroid/os/Handler;

.field public final m:Lx7;

.field public final n:Lsr2;

.field public final o:Landroid/os/Handler;

.field public final p:Z

.field public final q:Lyw1;

.field public r:Llk3;

.field public s:Lal3;

.field public final t:Landroid/app/PendingIntent;

.field public u:Lxr2;

.field public v:Lrm2;

.field public w:Lpn2;

.field public x:Z

.field public y:Z

.field public final z:Lyw1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lab4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lab4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ltn2;->H:Lab4;

    .line 8
    .line 9
    new-instance v0, Ldi0;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-direct {v0, v1}, Ldi0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lau0;->L(Lgo4;)Lgo4;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Ltn2;->I:Lgo4;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lkn2;Lcom/eddyizm/tempus/service/MediaService;Landroidx/media3/exoplayer/ExoPlayer;Landroid/app/PendingIntent;Lyw1;Lyw1;Lyw1;Lpq;Landroid/os/Bundle;Landroid/os/Bundle;Lx7;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    move-object/from16 v11, p3

    .line 6
    .line 7
    move-object/from16 v12, p8

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, v1, Ltn2;->a:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Init "

    .line 22
    .line 23
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v2, " [AndroidXMedia3/1.9.2] ["

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "]"

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v2, "MediaSessionImpl"

    .line 57
    .line 58
    invoke-static {v2, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v10, v1, Ltn2;->k:Lkn2;

    .line 62
    .line 63
    move-object/from16 v13, p2

    .line 64
    .line 65
    iput-object v13, v1, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 66
    .line 67
    const-string v0, ""

    .line 68
    .line 69
    iput-object v0, v1, Ltn2;->i:Ljava/lang/String;

    .line 70
    .line 71
    move-object/from16 v2, p4

    .line 72
    .line 73
    iput-object v2, v1, Ltn2;->t:Landroid/app/PendingIntent;

    .line 74
    .line 75
    move-object/from16 v5, p5

    .line 76
    .line 77
    iput-object v5, v1, Ltn2;->z:Lyw1;

    .line 78
    .line 79
    move-object/from16 v6, p6

    .line 80
    .line 81
    iput-object v6, v1, Ltn2;->A:Lyw1;

    .line 82
    .line 83
    move-object/from16 v2, p7

    .line 84
    .line 85
    iput-object v2, v1, Ltn2;->q:Lyw1;

    .line 86
    .line 87
    iput-object v12, v1, Ltn2;->e:Lpq;

    .line 88
    .line 89
    move-object/from16 v9, p10

    .line 90
    .line 91
    iput-object v9, v1, Ltn2;->B:Landroid/os/Bundle;

    .line 92
    .line 93
    move-object/from16 v2, p11

    .line 94
    .line 95
    iput-object v2, v1, Ltn2;->m:Lx7;

    .line 96
    .line 97
    const/4 v2, 0x1

    .line 98
    iput-boolean v2, v1, Ltn2;->p:Z

    .line 99
    .line 100
    new-instance v14, Lkt2;

    .line 101
    .line 102
    invoke-direct {v14, v1}, Lkt2;-><init>(Ltn2;)V

    .line 103
    .line 104
    .line 105
    iput-object v14, v1, Ltn2;->g:Lkt2;

    .line 106
    .line 107
    new-instance v2, Landroid/os/Handler;

    .line 108
    .line 109
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 114
    .line 115
    .line 116
    iput-object v2, v1, Ltn2;->o:Landroid/os/Handler;

    .line 117
    .line 118
    move-object v2, v11

    .line 119
    check-cast v2, Li41;

    .line 120
    .line 121
    iget-object v2, v2, Li41;->u:Landroid/os/Looper;

    .line 122
    .line 123
    new-instance v3, Landroid/os/Handler;

    .line 124
    .line 125
    invoke-direct {v3, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 126
    .line 127
    .line 128
    iput-object v3, v1, Ltn2;->l:Landroid/os/Handler;

    .line 129
    .line 130
    sget-object v4, Llk3;->H:Llk3;

    .line 131
    .line 132
    iput-object v4, v1, Ltn2;->r:Llk3;

    .line 133
    .line 134
    new-instance v4, Lwr2;

    .line 135
    .line 136
    invoke-direct {v4, v1, v2}, Lwr2;-><init>(Ltn2;Landroid/os/Looper;)V

    .line 137
    .line 138
    .line 139
    iput-object v4, v1, Ltn2;->c:Lwr2;

    .line 140
    .line 141
    new-instance v4, Lcj2;

    .line 142
    .line 143
    invoke-direct {v4, v1, v2}, Lcj2;-><init>(Ltn2;Landroid/os/Looper;)V

    .line 144
    .line 145
    .line 146
    iput-object v4, v1, Ltn2;->d:Lcj2;

    .line 147
    .line 148
    new-instance v2, Landroid/net/Uri$Builder;

    .line 149
    .line 150
    invoke-direct {v2}, Landroid/net/Uri$Builder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-class v4, Ltn2;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v2, v4}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 168
    .line 169
    .line 170
    move-result-wide v7

    .line 171
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v0, v2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    iput-object v2, v1, Ltn2;->b:Landroid/net/Uri;

    .line 184
    .line 185
    sget-object v8, Ldr2;->f:Lmi3;

    .line 186
    .line 187
    sget-object v7, Ldr2;->e:Lwa4;

    .line 188
    .line 189
    new-instance v0, Ldr2;

    .line 190
    .line 191
    new-instance v0, Lls2;

    .line 192
    .line 193
    move-object/from16 v4, p9

    .line 194
    .line 195
    invoke-direct/range {v0 .. v9}, Lls2;-><init>(Ltn2;Landroid/net/Uri;Landroid/os/Handler;Landroid/os/Bundle;Lyw1;Lyw1;Lwa4;Lmi3;Landroid/os/Bundle;)V

    .line 196
    .line 197
    .line 198
    iput-object v0, v1, Ltn2;->h:Lls2;

    .line 199
    .line 200
    iget-object v0, v0, Lls2;->m:Lqr2;

    .line 201
    .line 202
    iget-object v0, v0, Lqr2;->o:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, Lkr2;

    .line 205
    .line 206
    iget-object v0, v0, Lkr2;->c:Lpr2;

    .line 207
    .line 208
    iget-object v0, v0, Lpr2;->o:Landroid/media/session/MediaSession$Token;

    .line 209
    .line 210
    new-instance v13, Lcb4;

    .line 211
    .line 212
    move-object/from16 v18, v14

    .line 213
    .line 214
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    const/16 v16, 0x8

    .line 219
    .line 220
    invoke-virtual/range {p2 .. p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v17

    .line 224
    const v15, 0x3c24273c

    .line 225
    .line 226
    .line 227
    move-object/from16 v19, p9

    .line 228
    .line 229
    move-object/from16 v20, v0

    .line 230
    .line 231
    invoke-direct/range {v13 .. v20}, Lcb4;-><init>(IIILjava/lang/String;Lpu1;Landroid/os/Bundle;Landroid/media/session/MediaSession$Token;)V

    .line 232
    .line 233
    .line 234
    iput-object v13, v1, Ltn2;->j:Lcb4;

    .line 235
    .line 236
    new-instance v0, Lal3;

    .line 237
    .line 238
    invoke-direct {v0, v11}, Lal3;-><init>(Lqi3;)V

    .line 239
    .line 240
    .line 241
    iput-object v0, v1, Ltn2;->s:Lal3;

    .line 242
    .line 243
    new-instance v2, Lws1;

    .line 244
    .line 245
    const/16 v4, 0x1c

    .line 246
    .line 247
    invoke-direct {v2, v4, v1, v0}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v3, v2}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 251
    .line 252
    .line 253
    new-instance v0, Lsr2;

    .line 254
    .line 255
    const/4 v2, 0x2

    .line 256
    invoke-direct {v0, v1, v2}, Lsr2;-><init>(Ltn2;I)V

    .line 257
    .line 258
    .line 259
    iput-object v0, v1, Ltn2;->n:Lsr2;

    .line 260
    .line 261
    new-instance v0, Lsr2;

    .line 262
    .line 263
    const/4 v4, 0x3

    .line 264
    invoke-direct {v0, v1, v4}, Lsr2;-><init>(Ltn2;I)V

    .line 265
    .line 266
    .line 267
    invoke-static {v3, v0}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 268
    .line 269
    .line 270
    iput-object v10, v1, Ltn2;->C:Lkn2;

    .line 271
    .line 272
    iput-object v12, v1, Ltn2;->D:Lpq;

    .line 273
    .line 274
    iput v2, v1, Ltn2;->G:I

    .line 275
    .line 276
    new-instance v0, Lnl1;

    .line 277
    .line 278
    invoke-direct {v0}, Lnl1;-><init>()V

    .line 279
    .line 280
    .line 281
    iput-object v0, v1, Ltn2;->E:Lnl1;

    .line 282
    .line 283
    new-instance v0, Lnl1;

    .line 284
    .line 285
    invoke-direct {v0}, Lnl1;-><init>()V

    .line 286
    .line 287
    .line 288
    iput-object v0, v1, Ltn2;->F:Lnl1;

    .line 289
    .line 290
    return-void
.end method

.method public static E(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    const-string v0, "MediaSessionImpl"

    .line 15
    .line 16
    const-string v1, "Library operation failed"

    .line 17
    .line 18
    invoke-static {v0, v1, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static G(ILm92;)V
    .locals 2

    .line 1
    iget v0, p1, Lm92;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p1, p1, Lm92;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lyw1;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gt v0, p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const-string v0, ", pageSize="

    .line 24
    .line 25
    const-string v1, "Invalid size="

    .line 26
    .line 27
    invoke-static {p1, p0, v0, v1}, Lnz2;->d(IILjava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ltn2;)V
    .locals 8

    .line 1
    iget-object v1, p0, Ltn2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-boolean v0, p0, Ltn2;->x:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit v1

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    move-object p0, v0

    .line 12
    goto :goto_2

    .line 13
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    iget-object v0, p0, Ltn2;->s:Lal3;

    .line 15
    .line 16
    invoke-virtual {v0}, Lal3;->X0()Lza4;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v0, p0, Ltn2;->c:Lwr2;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Ltn2;->r:Llk3;

    .line 30
    .line 31
    iget-object v0, v0, Llk3;->c:Lza4;

    .line 32
    .line 33
    invoke-static {v3, v0}, Lju2;->a(Lza4;Lza4;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iget-object v0, p0, Ltn2;->g:Lkt2;

    .line 40
    .line 41
    iget-object v0, v0, Lkt2;->f:Lna4;

    .line 42
    .line 43
    invoke-virtual {v0}, Lna4;->u()Lyw1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-ge v2, v4, :cond_1

    .line 53
    .line 54
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Lfr2;

    .line 59
    .line 60
    invoke-virtual {v0, v4}, Lna4;->A(Lfr2;)Landroidx/media3/common/PlaybackException;

    .line 61
    .line 62
    .line 63
    const/16 v5, 0x10

    .line 64
    .line 65
    invoke-virtual {v0, v4, v5}, Lna4;->H(Lfr2;I)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/16 v6, 0x11

    .line 70
    .line 71
    invoke-virtual {v0, v4, v6}, Lna4;->H(Lfr2;I)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    new-instance v7, Ltr2;

    .line 76
    .line 77
    invoke-direct {v7, v3, v5, v6, v4}, Ltr2;-><init>(Lza4;ZZLfr2;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v4, v7}, Ltn2;->e(Lfr2;Lyr2;)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    :try_start_1
    iget-object v0, p0, Ltn2;->h:Lls2;

    .line 87
    .line 88
    iget-object v1, v0, Lls2;->i:Llr0;

    .line 89
    .line 90
    const/4 v5, 0x1

    .line 91
    const/4 v6, 0x0

    .line 92
    const/4 v2, 0x0

    .line 93
    const/4 v4, 0x1

    .line 94
    invoke-virtual/range {v1 .. v6}, Llr0;->B(ILza4;ZZI)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catch_0
    move-exception v0

    .line 99
    const-string v1, "MediaSessionImpl"

    .line 100
    .line 101
    const-string v2, "Exception in using media1 API"

    .line 102
    .line 103
    invoke-static {v1, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_1
    invoke-virtual {p0}, Ltn2;->C()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    throw p0
.end method

.method public static b(Ltn2;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static m(Lfr2;)Z
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lfr2;->a:Lms2;

    .line 4
    .line 5
    iget-object p0, p0, Lms2;->a:Los2;

    .line 6
    .line 7
    iget-object p0, p0, Los2;->a:Ljava/lang/String;

    .line 8
    .line 9
    const-string v0, "com.android.systemui"

    .line 10
    .line 11
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method


# virtual methods
.method public final A()V
    .locals 11

    .line 1
    const-string v0, "MediaSessionImpl"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Release "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, " [AndroidXMedia3/1.9.2] ["

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "] ["

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    sget-object v2, Lhn2;->a:Ljava/util/HashSet;

    .line 37
    .line 38
    const-class v2, Lhn2;

    .line 39
    .line 40
    monitor-enter v2

    .line 41
    :try_start_0
    sget-object v3, Lhn2;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 42
    .line 43
    monitor-exit v2

    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "]"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0, v1}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Ltn2;->a:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v0

    .line 62
    :try_start_1
    iget-boolean v1, p0, Ltn2;->x:Z

    .line 63
    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    monitor-exit v0

    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto/16 :goto_6

    .line 70
    .line 71
    :cond_0
    const/4 v1, 0x1

    .line 72
    iput-boolean v1, p0, Ltn2;->x:Z

    .line 73
    .line 74
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    iget-object v0, p0, Ltn2;->d:Lcj2;

    .line 76
    .line 77
    iget-object v2, v0, Lcj2;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v2, Lqo2;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 85
    .line 86
    .line 87
    iput-object v3, v0, Lcj2;->b:Ljava/lang/Object;

    .line 88
    .line 89
    :cond_1
    iget-object v0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    :try_start_2
    iget-object v2, p0, Ltn2;->l:Landroid/os/Handler;

    .line 96
    .line 97
    new-instance v4, Lsr2;

    .line 98
    .line 99
    invoke-direct {v4, p0, v0}, Lsr2;-><init>(Ltn2;I)V

    .line 100
    .line 101
    .line 102
    invoke-static {v2, v4}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :catch_0
    move-exception v2

    .line 107
    const-string v4, "MediaSessionImpl"

    .line 108
    .line 109
    const-string v5, "Exception thrown while closing"

    .line 110
    .line 111
    invoke-static {v4, v5, v2}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    iget-object v2, p0, Ltn2;->h:Lls2;

    .line 115
    .line 116
    iget-object v4, v2, Lls2;->o:Landroid/content/ComponentName;

    .line 117
    .line 118
    iget-object v5, v2, Lls2;->g:Ltn2;

    .line 119
    .line 120
    iget-object v6, v2, Lls2;->m:Lqr2;

    .line 121
    .line 122
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 123
    .line 124
    const/16 v8, 0x1f

    .line 125
    .line 126
    if-ge v7, v8, :cond_3

    .line 127
    .line 128
    if-nez v4, :cond_2

    .line 129
    .line 130
    iget-object v4, v6, Lqr2;->o:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v4, Lkr2;

    .line 133
    .line 134
    iget-object v4, v4, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 135
    .line 136
    invoke-virtual {v4, v3}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    new-instance v8, Landroid/content/Intent;

    .line 141
    .line 142
    const-string v9, "android.intent.action.MEDIA_BUTTON"

    .line 143
    .line 144
    iget-object v10, v5, Ltn2;->b:Landroid/net/Uri;

    .line 145
    .line 146
    invoke-direct {v8, v9, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 150
    .line 151
    .line 152
    iget-object v4, v5, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 153
    .line 154
    sget v9, Lls2;->A:I

    .line 155
    .line 156
    invoke-static {v4, v0, v8, v9}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    iget-object v8, v6, Lqr2;->o:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v8, Lkr2;

    .line 163
    .line 164
    iget-object v8, v8, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 165
    .line 166
    invoke-virtual {v8, v4}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 167
    .line 168
    .line 169
    :cond_3
    :goto_1
    iget-object v4, v2, Lls2;->n:Lv9;

    .line 170
    .line 171
    if-eqz v4, :cond_4

    .line 172
    .line 173
    iget-object v5, v5, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 174
    .line 175
    invoke-virtual {v5, v4}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    iget-object v2, v2, Lls2;->l:Lw9;

    .line 179
    .line 180
    if-eqz v2, :cond_6

    .line 181
    .line 182
    iget-object v4, v2, Lw9;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 183
    .line 184
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    if-eqz v4, :cond_5

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_5
    iget-object v4, v2, Lw9;->c:Ljava/util/concurrent/Executor;

    .line 192
    .line 193
    new-instance v5, Lu9;

    .line 194
    .line 195
    invoke-direct {v5, v2, v0}, Lu9;-><init>(Lw9;I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 199
    .line 200
    .line 201
    :cond_6
    :goto_2
    iget-object v2, v6, Lqr2;->o:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, Lkr2;

    .line 204
    .line 205
    iget-object v4, v2, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 206
    .line 207
    iget-object v5, v2, Lkr2;->f:Landroid/os/RemoteCallbackList;

    .line 208
    .line 209
    invoke-virtual {v5}, Landroid/os/RemoteCallbackList;->kill()V

    .line 210
    .line 211
    .line 212
    const/16 v5, 0x1b

    .line 213
    .line 214
    if-ne v7, v5, :cond_7

    .line 215
    .line 216
    :try_start_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    const-string v6, "mCallback"

    .line 221
    .line 222
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    check-cast v1, Landroid/os/Handler;

    .line 234
    .line 235
    if-eqz v1, :cond_7

    .line 236
    .line 237
    invoke-virtual {v1, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :catch_1
    move-exception v1

    .line 242
    const-string v5, "MediaSessionCompat"

    .line 243
    .line 244
    const-string v6, "Exception happened while accessing MediaSession.mCallback."

    .line 245
    .line 246
    invoke-static {v5, v6, v1}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    :cond_7
    :goto_3
    invoke-virtual {v4, v3}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    .line 250
    .line 251
    .line 252
    iget-object v1, v2, Lkr2;->b:Ljr2;

    .line 253
    .line 254
    iget-object v1, v1, Ljr2;->e:Ljava/lang/ref/WeakReference;

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, Landroid/media/session/MediaSession;->release()V

    .line 260
    .line 261
    .line 262
    iget-object p0, p0, Ltn2;->g:Lkt2;

    .line 263
    .line 264
    iget-object v1, p0, Lkt2;->g:Ljava/util/Set;

    .line 265
    .line 266
    iget-object v2, p0, Lkt2;->f:Lna4;

    .line 267
    .line 268
    invoke-virtual {v2}, Lna4;->u()Lyw1;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    :cond_8
    :goto_4
    if-ge v0, v4, :cond_9

    .line 277
    .line 278
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    add-int/lit8 v0, v0, 0x1

    .line 283
    .line 284
    check-cast v5, Lfr2;

    .line 285
    .line 286
    invoke-virtual {v2, v5}, Lna4;->N(Lfr2;)V

    .line 287
    .line 288
    .line 289
    iget-object v5, v5, Lfr2;->d:Ler2;

    .line 290
    .line 291
    if-eqz v5, :cond_8

    .line 292
    .line 293
    invoke-interface {v5}, Ler2;->c()V

    .line 294
    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    :cond_a
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-eqz v2, :cond_b

    .line 306
    .line 307
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Lfr2;

    .line 312
    .line 313
    iget-object v2, v2, Lfr2;->d:Ler2;

    .line 314
    .line 315
    if-eqz v2, :cond_a

    .line 316
    .line 317
    invoke-interface {v2}, Ler2;->c()V

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_b
    invoke-interface {v1}, Ljava/util/Set;->clear()V

    .line 322
    .line 323
    .line 324
    iget-object p0, p0, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 325
    .line 326
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :goto_6
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 331
    throw p0

    .line 332
    :catchall_1
    move-exception p0

    .line 333
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 334
    throw p0
.end method

.method public final B(Lfr2;)Lfr2;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ltn2;->y:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ltn2;->m(Lfr2;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ltn2;->g()Lfr2;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    return-object p1
.end method

.method public final C()V
    .locals 1

    .line 1
    iget-object v0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object p0, p0, Ltn2;->n:Lsr2;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final D(Lal3;Lal3;)V
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget-object v4, v1, Ltn2;->h:Lls2;

    .line 8
    .line 9
    iput-object v3, v1, Ltn2;->s:Lal3;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object v0, v1, Ltn2;->u:Lxr2;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v0}, Lal3;->r0(Loi3;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance v0, Lxr2;

    .line 22
    .line 23
    invoke-direct {v0, v1, v3}, Lxr2;-><init>(Ltn2;Lal3;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v0}, Lal3;->v(Loi3;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v1, Ltn2;->u:Lxr2;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    :try_start_0
    iget-object v0, v4, Lls2;->i:Llr0;

    .line 33
    .line 34
    invoke-virtual {v0, v5, v2, v3}, Llr0;->p(ILal3;Lal3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v0

    .line 39
    const-string v6, "MediaSessionImpl"

    .line 40
    .line 41
    const-string v7, "Exception in using media1 API"

    .line 42
    .line 43
    invoke-static {v6, v7, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    if-nez v2, :cond_1

    .line 47
    .line 48
    iget-object v0, v4, Lls2;->m:Lqr2;

    .line 49
    .line 50
    iget-object v0, v0, Lqr2;->o:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lkr2;

    .line 53
    .line 54
    iget-object v0, v0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-virtual {v0, v2}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 58
    .line 59
    .line 60
    :cond_1
    new-instance v6, Llk3;

    .line 61
    .line 62
    invoke-virtual {v3}, Lal3;->U()Landroidx/media3/common/PlaybackException;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v3}, Lal3;->X0()Lza4;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-virtual {v3}, Lal3;->W0()Lpi3;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v3}, Lal3;->W0()Lpi3;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    invoke-virtual {v3}, Lal3;->i()Lqh3;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    invoke-virtual {v3}, Lal3;->h()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    invoke-virtual {v3}, Lal3;->D0()Z

    .line 87
    .line 88
    .line 89
    move-result v15

    .line 90
    invoke-virtual {v3}, Lal3;->z()Ls55;

    .line 91
    .line 92
    .line 93
    move-result-object v16

    .line 94
    invoke-virtual {v3}, Lal3;->Z0()Lcu4;

    .line 95
    .line 96
    .line 97
    move-result-object v17

    .line 98
    const/16 v0, 0x12

    .line 99
    .line 100
    invoke-virtual {v3, v0}, Lal3;->S0(I)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-virtual {v3}, Lal3;->g0()Ldo2;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :goto_1
    move-object/from16 v19, v0

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    sget-object v0, Ldo2;->K:Ldo2;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :goto_2
    const/16 v0, 0x16

    .line 117
    .line 118
    invoke-virtual {v3, v0}, Lal3;->S0(I)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    invoke-virtual {v3}, Lal3;->B()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    :goto_3
    move/from16 v20, v0

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :goto_4
    const/16 v0, 0x15

    .line 135
    .line 136
    invoke-virtual {v3, v0}, Lal3;->S0(I)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    invoke-virtual {v3}, Lal3;->D()Lil;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :goto_5
    move-object/from16 v22, v0

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_4
    sget-object v0, Lil;->i:Lil;

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :goto_6
    const/16 v0, 0x1c

    .line 153
    .line 154
    invoke-virtual {v3, v0}, Lal3;->S0(I)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_5

    .line 159
    .line 160
    invoke-virtual {v3}, Lal3;->i0()Ljg0;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    :goto_7
    move-object/from16 v24, v0

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_5
    sget-object v0, Ljg0;->d:Ljg0;

    .line 168
    .line 169
    goto :goto_7

    .line 170
    :goto_8
    invoke-virtual {v3}, Lal3;->F()Lhp0;

    .line 171
    .line 172
    .line 173
    move-result-object v25

    .line 174
    const/16 v0, 0x17

    .line 175
    .line 176
    invoke-virtual {v3, v0}, Lal3;->S0(I)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_6

    .line 181
    .line 182
    invoke-virtual {v3}, Lal3;->j()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    :cond_6
    move/from16 v26, v5

    .line 187
    .line 188
    invoke-virtual {v3}, Lal3;->b1()Z

    .line 189
    .line 190
    .line 191
    move-result v27

    .line 192
    invoke-virtual {v3}, Lal3;->q()Z

    .line 193
    .line 194
    .line 195
    move-result v28

    .line 196
    invoke-virtual {v3}, Lal3;->v0()I

    .line 197
    .line 198
    .line 199
    move-result v30

    .line 200
    invoke-virtual {v3}, Lal3;->g()I

    .line 201
    .line 202
    .line 203
    move-result v31

    .line 204
    invoke-virtual {v3}, Lal3;->h0()Z

    .line 205
    .line 206
    .line 207
    move-result v32

    .line 208
    invoke-virtual {v3}, Lal3;->f()Z

    .line 209
    .line 210
    .line 211
    move-result v33

    .line 212
    invoke-virtual {v3}, Lal3;->a1()Ldo2;

    .line 213
    .line 214
    .line 215
    move-result-object v34

    .line 216
    invoke-virtual {v3}, Lal3;->O0()J

    .line 217
    .line 218
    .line 219
    move-result-wide v35

    .line 220
    invoke-virtual {v3}, Lal3;->X()J

    .line 221
    .line 222
    .line 223
    move-result-wide v37

    .line 224
    invoke-virtual {v3}, Lal3;->u()J

    .line 225
    .line 226
    .line 227
    move-result-wide v39

    .line 228
    const/16 v0, 0x1e

    .line 229
    .line 230
    invoke-virtual {v3, v0}, Lal3;->S0(I)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    invoke-virtual {v3}, Lal3;->e0()Ljw4;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    :goto_9
    move-object/from16 v41, v0

    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_7
    sget-object v0, Ljw4;->b:Ljw4;

    .line 244
    .line 245
    goto :goto_9

    .line 246
    :goto_a
    invoke-virtual {v3}, Lal3;->E0()Lcw4;

    .line 247
    .line 248
    .line 249
    move-result-object v42

    .line 250
    const/4 v8, 0x0

    .line 251
    const/4 v12, 0x0

    .line 252
    const/16 v18, 0x0

    .line 253
    .line 254
    const/high16 v21, 0x3f800000    # 1.0f

    .line 255
    .line 256
    const/16 v23, 0x0

    .line 257
    .line 258
    const/16 v29, 0x1

    .line 259
    .line 260
    invoke-direct/range {v6 .. v42}, Llk3;-><init>(Landroidx/media3/common/PlaybackException;ILza4;Lpi3;Lpi3;ILqh3;IZLs55;Lcu4;ILdo2;FFLil;ILjg0;Lhp0;IZZIIIZZLdo2;JJJLjw4;Lcw4;)V

    .line 261
    .line 262
    .line 263
    iput-object v6, v1, Ltn2;->r:Llk3;

    .line 264
    .line 265
    invoke-virtual {v3}, Lal3;->o()Lmi3;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v1, v0}, Ltn2;->h(Lmi3;)V

    .line 270
    .line 271
    .line 272
    return-void
.end method

.method public final F()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "Player callback method is called from a wrong thread. See javadoc of MediaSession for details."

    .line 15
    .line 16
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final c(Landroid/view/KeyEvent;ZZ)Z
    .locals 7

    .line 1
    iget-object v0, p0, Ltn2;->k:Lkn2;

    .line 2
    .line 3
    iget-object v0, v0, Lkn2;->a:Ltn2;

    .line 4
    .line 5
    invoke-virtual {v0}, Ltn2;->g()Lfr2;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/16 v0, 0x55

    .line 17
    .line 18
    const/16 v1, 0x4f

    .line 19
    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    :cond_0
    if-eqz p2, :cond_1

    .line 25
    .line 26
    const/16 p1, 0x57

    .line 27
    .line 28
    :cond_1
    const/4 p2, 0x1

    .line 29
    if-eq p1, v1, :cond_6

    .line 30
    .line 31
    const/16 v0, 0x7e

    .line 32
    .line 33
    if-eq p1, v0, :cond_5

    .line 34
    .line 35
    const/16 v0, 0x7f

    .line 36
    .line 37
    if-eq p1, v0, :cond_4

    .line 38
    .line 39
    const/16 v0, 0x110

    .line 40
    .line 41
    if-eq p1, v0, :cond_3

    .line 42
    .line 43
    const/16 v0, 0x111

    .line 44
    .line 45
    if-eq p1, v0, :cond_2

    .line 46
    .line 47
    packed-switch p1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :pswitch_0
    new-instance p1, Ly90;

    .line 53
    .line 54
    const/4 v0, 0x4

    .line 55
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 56
    .line 57
    .line 58
    :goto_0
    move-object v5, p1

    .line 59
    goto :goto_1

    .line 60
    :pswitch_1
    new-instance p1, Ly90;

    .line 61
    .line 62
    const/4 v0, 0x5

    .line 63
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_2
    new-instance p1, Ly90;

    .line 68
    .line 69
    const/4 v0, 0x6

    .line 70
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    :pswitch_3
    new-instance p1, Ly90;

    .line 75
    .line 76
    const/4 v0, 0x3

    .line 77
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    :pswitch_4
    new-instance p1, Ly90;

    .line 82
    .line 83
    const/4 v0, 0x2

    .line 84
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    new-instance p1, Ly90;

    .line 89
    .line 90
    invoke-direct {p1, p0, v4, p2}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    new-instance p1, Ly90;

    .line 95
    .line 96
    const/16 v0, 0x9

    .line 97
    .line 98
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    :pswitch_5
    iget-object p1, p0, Ltn2;->s:Lal3;

    .line 103
    .line 104
    invoke-virtual {p1}, Lal3;->q()Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_7

    .line 109
    .line 110
    new-instance p1, Ly90;

    .line 111
    .line 112
    const/4 v0, 0x7

    .line 113
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_7
    new-instance p1, Ly90;

    .line 118
    .line 119
    const/16 v0, 0x8

    .line 120
    .line 121
    invoke-direct {p1, p0, v4, v0}, Ly90;-><init>(Ltn2;Lfr2;I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :goto_1
    new-instance v1, Lb41;

    .line 126
    .line 127
    const/4 v6, 0x3

    .line 128
    move-object v2, p0

    .line 129
    move v3, p3

    .line 130
    invoke-direct/range {v1 .. v6}, Lb41;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    iget-object p0, v2, Ltn2;->l:Landroid/os/Handler;

    .line 134
    .line 135
    invoke-static {p0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 136
    .line 137
    .line 138
    return p2

    .line 139
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_5
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lfr2;Lyr2;)Lic2;
    .locals 4

    .line 1
    iget-object v0, p0, Ltn2;->g:Lkt2;

    .line 2
    .line 3
    const/16 v1, -0x64

    .line 4
    .line 5
    :try_start_0
    iget-object v2, v0, Lkt2;->f:Lna4;

    .line 6
    .line 7
    invoke-virtual {v2, p1}, Lna4;->C(Lfr2;)Lyk;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object p0, Ltn2;->H:Lab4;

    .line 14
    .line 15
    invoke-virtual {v2, p0}, Lyk;->j(Ljava/lang/Object;)Lea4;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget v2, p0, Lea4;->u:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Ltn2;->j(Lfr2;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    new-instance p0, Lab4;

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lab4;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lmw1;

    .line 36
    .line 37
    invoke-direct {p2, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_1
    new-instance p0, Lab4;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {p0, v2}, Lab4;-><init>(I)V

    .line 45
    .line 46
    .line 47
    new-instance v3, Lmw1;

    .line 48
    .line 49
    invoke-direct {v3, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object p0, v3

    .line 53
    :goto_0
    iget-object v3, p1, Lfr2;->d:Ler2;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-interface {p2, v3, v2}, Lyr2;->f(Ler2;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    :cond_2
    return-object p0

    .line 61
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v0, "Exception in "

    .line 64
    .line 65
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string p2, "MediaSessionImpl"

    .line 76
    .line 77
    invoke-static {p2, p1, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    new-instance p0, Lab4;

    .line 81
    .line 82
    const/4 p1, -0x1

    .line 83
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 84
    .line 85
    .line 86
    new-instance p1, Lmw1;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :catch_1
    iget-object p0, v0, Lkt2;->f:Lna4;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Lna4;->N(Lfr2;)V

    .line 95
    .line 96
    .line 97
    new-instance p0, Lab4;

    .line 98
    .line 99
    invoke-direct {p0, v1}, Lab4;-><init>(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Lmw1;

    .line 103
    .line 104
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object p1
.end method

.method public final e(Lfr2;Lyr2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltn2;->g:Lkt2;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lkt2;->f:Lna4;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lna4;->C(Lfr2;)Lyk;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lyk;->s()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Ltn2;->j(Lfr2;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    :goto_0
    iget-object v1, p1, Lfr2;->d:Ler2;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {p2, v1, p0}, Lyr2;->f(Ler2;I)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v0, "Exception in "

    .line 37
    .line 38
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "MediaSessionImpl"

    .line 49
    .line 50
    invoke-static {p2, p1, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catch_1
    iget-object p0, v0, Lkt2;->f:Lna4;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lna4;->N(Lfr2;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_2
    return-void
.end method

.method public final f(Lyr2;)V
    .locals 6

    .line 1
    const-string v0, "Exception in using media1 API"

    .line 2
    .line 3
    const-string v1, "MediaSessionImpl"

    .line 4
    .line 5
    iget-object v2, p0, Ltn2;->g:Lkt2;

    .line 6
    .line 7
    iget-object v2, v2, Lkt2;->f:Lna4;

    .line 8
    .line 9
    invoke-virtual {v2}, Lna4;->u()Lyw1;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    move v4, v3

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-ge v4, v5, :cond_0

    .line 20
    .line 21
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, Lfr2;

    .line 26
    .line 27
    invoke-virtual {p0, v5, p1}, Ltn2;->e(Lfr2;Lyr2;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_0
    iget-object v2, p0, Ltn2;->h:Lls2;

    .line 34
    .line 35
    iget-object v2, v2, Lls2;->i:Llr0;

    .line 36
    .line 37
    invoke-interface {p1, v2, v3}, Lyr2;->f(Ler2;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_0
    move-exception v2

    .line 42
    invoke-static {v1, v0, v2}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    iget-object v2, p0, Ltn2;->a:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter v2

    .line 48
    :try_start_1
    iget-object p0, p0, Ltn2;->w:Lpn2;

    .line 49
    .line 50
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    :try_start_2
    iget-object p0, p0, Lpn2;->y:Lsi1;

    .line 54
    .line 55
    invoke-interface {p1, p0, v3}, Lyr2;->f(Ler2;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catch_1
    move-exception p0

    .line 60
    invoke-static {v1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    :goto_2
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 66
    throw p0
.end method

.method public final g()Lfr2;
    .locals 4

    .line 1
    iget-object v0, p0, Ltn2;->g:Lkt2;

    .line 2
    .line 3
    iget-object v0, v0, Lkt2;->f:Lna4;

    .line 4
    .line 5
    invoke-virtual {v0}, Lna4;->u()Lyw1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lfr2;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ltn2;->k(Lfr2;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final h(Lmi3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltn2;->c:Lwr2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Lwr2;->a(ZZ)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lkm2;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lkm2;-><init>(Lmi3;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ltn2;->f(Lyr2;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object p1, p0, Ltn2;->h:Lls2;

    .line 16
    .line 17
    iget-object p1, p1, Lls2;->i:Llr0;

    .line 18
    .line 19
    iget-object p0, p0, Ltn2;->r:Llk3;

    .line 20
    .line 21
    iget-object p0, p0, Llk3;->s:Lhp0;

    .line 22
    .line 23
    invoke-virtual {p1}, Llr0;->j()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p0

    .line 28
    const-string p1, "MediaSessionImpl"

    .line 29
    .line 30
    const-string v0, "Exception in using media1 API"

    .line 31
    .line 32
    invoke-static {p1, v0, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final i(Lfr2;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ltn2;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Ltn2;->s:Lal3;

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lal3;->S0(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Ltn2;->s:Lal3;

    .line 22
    .line 23
    invoke-virtual {v0}, Lal3;->a()Lgn2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v0, v1

    .line 32
    :goto_0
    iget-object v3, p0, Ltn2;->s:Lal3;

    .line 33
    .line 34
    const/16 v4, 0x1f

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lal3;->S0(I)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    iget-object v3, p0, Ltn2;->s:Lal3;

    .line 43
    .line 44
    const/16 v4, 0x14

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Lal3;->S0(I)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move v3, v1

    .line 54
    goto :goto_2

    .line 55
    :cond_3
    :goto_1
    move v3, v2

    .line 56
    :goto_2
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 61
    .line 62
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 63
    .line 64
    .line 65
    const/4 v5, 0x0

    .line 66
    xor-int/2addr v5, v2

    .line 67
    invoke-static {v5}, Lrr2;->w(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v4, v2, v2}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 71
    .line 72
    .line 73
    new-instance v5, Lmi3;

    .line 74
    .line 75
    xor-int/2addr v2, v1

    .line 76
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 77
    .line 78
    .line 79
    new-instance v2, Lw71;

    .line 80
    .line 81
    invoke-direct {v2, v4}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v5, v2}, Lmi3;-><init>(Lw71;)V

    .line 85
    .line 86
    .line 87
    if-nez v0, :cond_5

    .line 88
    .line 89
    if-nez v3, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    iget-object v0, p0, Ltn2;->e:Lpq;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 98
    .line 99
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v2, Llw1;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v0}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 108
    .line 109
    .line 110
    new-instance v0, Lll;

    .line 111
    .line 112
    invoke-direct {v0, p0, p1, p2, v5}, Lll;-><init>(Ltn2;Lfr2;ZLmi3;)V

    .line 113
    .line 114
    .line 115
    new-instance p1, Lrn2;

    .line 116
    .line 117
    const/4 p2, 0x2

    .line 118
    invoke-direct {p1, p0, p2}, Lrn2;-><init>(Ltn2;I)V

    .line 119
    .line 120
    .line 121
    new-instance p0, Llg1;

    .line 122
    .line 123
    invoke-direct {p0, v1, v2, v0}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, p0, p1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_5
    :goto_3
    if-nez v0, :cond_6

    .line 131
    .line 132
    const-string v0, "MediaSessionImpl"

    .line 133
    .line 134
    const-string v1, "Play requested without current MediaItem, but playback resumption prevented by missing available commands"

    .line 135
    .line 136
    invoke-static {v0, v1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_6
    iget-object v0, p0, Ltn2;->s:Lal3;

    .line 140
    .line 141
    invoke-static {v0}, Lf35;->I(Lqi3;)Z

    .line 142
    .line 143
    .line 144
    if-eqz p2, :cond_7

    .line 145
    .line 146
    invoke-virtual {p0, p1, v5}, Ltn2;->v(Lfr2;Lmi3;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    :goto_4
    return-void
.end method

.method public final j(Lfr2;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ltn2;->g:Lkt2;

    .line 2
    .line 3
    iget-object v0, v0, Lkt2;->f:Lna4;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lna4;->F(Lfr2;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Ltn2;->h:Lls2;

    .line 12
    .line 13
    iget-object v0, v0, Lls2;->f:Lna4;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lna4;->F(Lfr2;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Ltn2;->a:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    iget-object p0, p0, Ltn2;->w:Lpn2;

    .line 26
    .line 27
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lpn2;->x:Lna4;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lna4;->F(Lfr2;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0

    .line 44
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public final k(Lfr2;)Z
    .locals 1

    .line 1
    iget-object v0, p1, Lfr2;->a:Lms2;

    .line 2
    .line 3
    iget-object v0, v0, Lms2;->a:Los2;

    .line 4
    .line 5
    iget-object v0, v0, Los2;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {v0, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    iget p0, p1, Lfr2;->b:I

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    new-instance p0, Landroid/os/Bundle;

    .line 25
    .line 26
    iget-object p1, p1, Lfr2;->e:Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "androidx.media3.session.MediaNotificationManager"

    .line 32
    .line 33
    invoke-virtual {p0, p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    return v0
.end method

.method public final l()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ltn2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean p0, p0, Ltn2;->x:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p0
.end method

.method public final n(Lfr2;Lm92;)V
    .locals 6

    .line 1
    iget v0, p0, Ltn2;->G:I

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget p1, p1, Lfr2;->b:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_4

    .line 10
    :cond_0
    iget p1, p2, Lm92;->a:I

    .line 11
    .line 12
    const/16 v1, -0x66

    .line 13
    .line 14
    iget-object p0, p0, Ltn2;->h:Lls2;

    .line 15
    .line 16
    if-eq p1, v1, :cond_1

    .line 17
    .line 18
    const/16 v1, -0x69

    .line 19
    .line 20
    if-ne p1, v1, :cond_7

    .line 21
    .line 22
    :cond_1
    const/4 v1, 0x1

    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p2, Lm92;->e:Ljn2;

    .line 31
    .line 32
    iget-object p2, p2, Lm92;->f:Lxa4;

    .line 33
    .line 34
    invoke-static {p1}, Lf92;->g(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v3, p0, Lls2;->u:Lbk;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    iget v3, v3, Lbk;->o:I

    .line 43
    .line 44
    if-ne v3, v2, :cond_3

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    if-eqz p2, :cond_4

    .line 48
    .line 49
    iget-object v3, p2, Lxa4;->b:Ljava/lang/String;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_4
    const-string v3, "no error message provided"

    .line 53
    .line 54
    :goto_1
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 55
    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    iget-object v0, v0, Ljn2;->a:Landroid/os/Bundle;

    .line 59
    .line 60
    const-string v5, "android.media.extras.ERROR_RESOLUTION_ACTION_INTENT"

    .line 61
    .line 62
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    move-object v4, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    if-eqz p2, :cond_6

    .line 71
    .line 72
    iget-object v4, p2, Lxa4;->c:Landroid/os/Bundle;

    .line 73
    .line 74
    :cond_6
    :goto_2
    new-instance p2, Lbk;

    .line 75
    .line 76
    invoke-direct {p2, v1, v2, v3, v4}, Lbk;-><init>(ZILjava/lang/String;Landroid/os/Bundle;)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Lls2;->u:Lbk;

    .line 80
    .line 81
    iget-object p2, p0, Lls2;->g:Ltn2;

    .line 82
    .line 83
    iget-object p2, p2, Ltn2;->s:Lal3;

    .line 84
    .line 85
    invoke-virtual {p0, p2}, Lls2;->P(Lal3;)V

    .line 86
    .line 87
    .line 88
    :cond_7
    :goto_3
    if-nez p1, :cond_8

    .line 89
    .line 90
    iget-object p1, p0, Lls2;->u:Lbk;

    .line 91
    .line 92
    if-eqz p1, :cond_8

    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    iput-object p1, p0, Lls2;->u:Lbk;

    .line 96
    .line 97
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 98
    .line 99
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    :goto_4
    return-void
.end method

.method public final o(Lfr2;Ljava/util/List;)Lmw1;
    .locals 1

    .line 1
    iget-object v0, p0, Ltn2;->k:Lkn2;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Ltn2;->e:Lpq;

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1, p2}, Lpq;->d(Lkn2;Lfr2;Ljava/util/List;)Lmw1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final p(Lfr2;)Ldr2;
    .locals 8

    .line 1
    iget-boolean v0, p0, Ltn2;->y:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    invoke-static {p1}, Ltn2;->m(Lfr2;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object p0, p0, Ltn2;->h:Lls2;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p1, Ldr2;->e:Lwa4;

    .line 18
    .line 19
    iget-object p1, p0, Lls2;->y:Lwa4;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lls2;->z:Lmi3;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lls2;->x:Lyw1;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lls2;->x:Lyw1;

    .line 38
    .line 39
    if-nez p0, :cond_0

    .line 40
    .line 41
    move-object p0, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-static {p0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object p0, p0, Lls2;->w:Lyw1;

    .line 49
    .line 50
    if-nez p0, :cond_2

    .line 51
    .line 52
    move-object p0, v1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static {p0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :goto_0
    move-object v7, v1

    .line 59
    move-object v1, p0

    .line 60
    move-object p0, v7

    .line 61
    :goto_1
    new-instance v2, Ldr2;

    .line 62
    .line 63
    invoke-direct {v2, p1, v0, v1, p0}, Ldr2;-><init>(Lwa4;Lmi3;Lyw1;Lyw1;)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :cond_3
    iget-object v0, p0, Ltn2;->e:Lpq;

    .line 68
    .line 69
    iget-object v2, p0, Ltn2;->k:Lkn2;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v3, v0, Lpq;->p:Lkn2;

    .line 78
    .line 79
    const-string v4, "com.google.android.projection.gearhead"

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    invoke-virtual {v2, p1}, Lkn2;->b(Lfr2;)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-nez v3, :cond_4

    .line 89
    .line 90
    iget-object v3, v2, Lkn2;->a:Ltn2;

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v3, p1, Lfr2;->a:Lms2;

    .line 96
    .line 97
    iget-object v3, v3, Lms2;->a:Los2;

    .line 98
    .line 99
    iget-object v3, v3, Los2;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_6

    .line 106
    .line 107
    :cond_4
    const-string v3, "BaseSessionCallback"

    .line 108
    .line 109
    const-string v6, "onConnect: remove and add listener"

    .line 110
    .line 111
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    iget-object v3, v0, Lpq;->p:Lkn2;

    .line 115
    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    invoke-virtual {v2}, Lkn2;->a()Lqi3;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-object v6, v0, Lpq;->o:Loq;

    .line 123
    .line 124
    invoke-interface {v3, v6}, Lqi3;->r0(Loi3;)V

    .line 125
    .line 126
    .line 127
    :cond_5
    iput-object v2, v0, Lpq;->p:Lkn2;

    .line 128
    .line 129
    invoke-virtual {v2}, Lkn2;->a()Lqi3;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    iget-object v6, v0, Lpq;->o:Loq;

    .line 134
    .line 135
    invoke-interface {v3, v6}, Lqi3;->v(Loi3;)V

    .line 136
    .line 137
    .line 138
    new-instance v3, Lmq;

    .line 139
    .line 140
    invoke-direct {v3, v0, v5}, Lmq;-><init>(Lpq;I)V

    .line 141
    .line 142
    .line 143
    sput-object v3, Ln61;->e:Lmq;

    .line 144
    .line 145
    :cond_6
    iget-object v3, v2, Lkn2;->a:Ltn2;

    .line 146
    .line 147
    invoke-virtual {v3, p1}, Ltn2;->k(Lfr2;)Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    const/4 v6, 0x0

    .line 152
    if-nez v3, :cond_8

    .line 153
    .line 154
    invoke-virtual {v2, p1}, Lkn2;->b(Lfr2;)Z

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    if-nez v3, :cond_8

    .line 159
    .line 160
    iget-object v3, v2, Lkn2;->a:Ltn2;

    .line 161
    .line 162
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object v3, p1, Lfr2;->a:Lms2;

    .line 166
    .line 167
    iget-object v3, v3, Lms2;->a:Los2;

    .line 168
    .line 169
    iget-object v3, v3, Los2;->a:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_7

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_7
    sget-object v0, Ldr2;->e:Lwa4;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    new-instance v2, Ljava/util/HashSet;

    .line 184
    .line 185
    iget-object v0, v0, Lwa4;->a:Ljx1;

    .line 186
    .line 187
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lva4;

    .line 191
    .line 192
    const-string v3, "com.eddyizm.tempus.PLAY_NEXT_FIXUP"

    .line 193
    .line 194
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 195
    .line 196
    invoke-direct {v0, v3, v4}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    new-instance v0, Lwa4;

    .line 203
    .line 204
    invoke-direct {v0, v2}, Lwa4;-><init>(Ljava/util/HashSet;)V

    .line 205
    .line 206
    .line 207
    sget-object v2, Ldr2;->f:Lmi3;

    .line 208
    .line 209
    new-instance v3, Ldr2;

    .line 210
    .line 211
    invoke-direct {v3, v0, v2, v1, v1}, Ldr2;-><init>(Lwa4;Lmi3;Lyw1;Lyw1;)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_8
    :goto_2
    sget-object v3, Ldr2;->f:Lmi3;

    .line 216
    .line 217
    iget-object v4, v0, Lpq;->s:Lwa4;

    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, Lkn2;->a()Lqi3;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v2, v6}, Lpq;->a(Lqi3;Z)Lyw1;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v2, Ldr2;

    .line 238
    .line 239
    invoke-direct {v2, v4, v3, v1, v0}, Ldr2;-><init>(Lwa4;Lmi3;Lyw1;Lyw1;)V

    .line 240
    .line 241
    .line 242
    move-object v3, v2

    .line 243
    :goto_3
    invoke-virtual {p0, p1}, Ltn2;->k(Lfr2;)Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_f

    .line 248
    .line 249
    iput-boolean v5, p0, Ltn2;->y:Z

    .line 250
    .line 251
    iget-object p1, v3, Ldr2;->d:Lyw1;

    .line 252
    .line 253
    if-eqz p1, :cond_9

    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_9
    iget-object p1, p0, Ltn2;->k:Lkn2;

    .line 257
    .line 258
    iget-object p1, p1, Lkn2;->a:Ltn2;

    .line 259
    .line 260
    iget-object p1, p1, Ltn2;->A:Lyw1;

    .line 261
    .line 262
    :goto_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    iget-object v1, p0, Ltn2;->h:Lls2;

    .line 267
    .line 268
    if-eqz v0, :cond_b

    .line 269
    .line 270
    iget-object p1, v3, Ldr2;->c:Lyw1;

    .line 271
    .line 272
    if-eqz p1, :cond_a

    .line 273
    .line 274
    goto :goto_5

    .line 275
    :cond_a
    iget-object p1, p0, Ltn2;->k:Lkn2;

    .line 276
    .line 277
    iget-object p1, p1, Lkn2;->a:Ltn2;

    .line 278
    .line 279
    iget-object p1, p1, Ltn2;->z:Lyw1;

    .line 280
    .line 281
    :goto_5
    iput-object p1, v1, Lls2;->w:Lyw1;

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_b
    iput-object p1, v1, Lls2;->x:Lyw1;

    .line 285
    .line 286
    invoke-virtual {v1}, Lls2;->O()V

    .line 287
    .line 288
    .line 289
    :goto_6
    iget-object p0, p0, Ltn2;->h:Lls2;

    .line 290
    .line 291
    iget-object p1, v3, Ldr2;->a:Lwa4;

    .line 292
    .line 293
    iget-object v0, v3, Ldr2;->b:Lmi3;

    .line 294
    .line 295
    iget-object v1, p0, Lls2;->z:Lmi3;

    .line 296
    .line 297
    const/16 v2, 0x11

    .line 298
    .line 299
    invoke-virtual {v1, v2}, Lmi3;->a(I)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    invoke-virtual {v0, v2}, Lmi3;->a(I)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    if-eq v1, v2, :cond_c

    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_c
    move v5, v6

    .line 311
    :goto_7
    iput-object p1, p0, Lls2;->y:Lwa4;

    .line 312
    .line 313
    iput-object v0, p0, Lls2;->z:Lmi3;

    .line 314
    .line 315
    iget-object p1, p0, Lls2;->x:Lyw1;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    if-nez p1, :cond_d

    .line 322
    .line 323
    invoke-virtual {p0}, Lls2;->O()V

    .line 324
    .line 325
    .line 326
    :cond_d
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 327
    .line 328
    if-eqz v5, :cond_e

    .line 329
    .line 330
    iget-object v0, p1, Ltn2;->s:Lal3;

    .line 331
    .line 332
    iget-object p1, p1, Ltn2;->l:Landroid/os/Handler;

    .line 333
    .line 334
    new-instance v1, Lds2;

    .line 335
    .line 336
    invoke-direct {v1, p0, v0, v6}, Lds2;-><init>(Lls2;Lal3;I)V

    .line 337
    .line 338
    .line 339
    invoke-static {p1, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 340
    .line 341
    .line 342
    return-object v3

    .line 343
    :cond_e
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 344
    .line 345
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V

    .line 346
    .line 347
    .line 348
    :cond_f
    return-object v3
.end method

.method public final q(Lfr2;Lva4;Landroid/os/Bundle;)Lic2;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Ltn2;->e:Lpq;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lpq;->b:Lcom/eddyizm/tempus/service/MediaService;

    .line 11
    .line 12
    iget-object p0, p0, Ltn2;->k:Lkn2;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p2, p2, Lva4;->b:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v3, "onCustomCommand: "

    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "BaseSessionCallback"

    .line 40
    .line 41
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/4 v4, 0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    sparse-switch v2, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :sswitch_0
    const-string p1, "android.media3.session.demo.SHUFFLE_OFF"

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_0

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_0
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1, v5}, Lqi3;->s(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0, v5}, Lpq;->f(Lkn2;Z)V

    .line 73
    .line 74
    .line 75
    new-instance p0, Lab4;

    .line 76
    .line 77
    invoke-direct {p0, v5}, Lab4;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lmw1;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    return-object p1

    .line 86
    :sswitch_1
    const-string p1, "android.media3.session.demo.REPEAT_ONE"

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_1

    .line 93
    .line 94
    goto/16 :goto_4

    .line 95
    .line 96
    :sswitch_2
    const-string p1, "android.media3.session.demo.REPEAT_OFF"

    .line 97
    .line 98
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_1

    .line 103
    .line 104
    goto/16 :goto_4

    .line 105
    .line 106
    :sswitch_3
    const-string p1, "android.media3.session.demo.REPEAT_ALL"

    .line 107
    .line 108
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_1

    .line 113
    .line 114
    goto/16 :goto_4

    .line 115
    .line 116
    :cond_1
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p1}, Lqi3;->h()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_3

    .line 125
    .line 126
    if-eq p1, v4, :cond_2

    .line 127
    .line 128
    move v4, v5

    .line 129
    goto :goto_0

    .line 130
    :cond_2
    const/4 v4, 0x2

    .line 131
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {p1, v4}, Lqi3;->p0(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, p0, v5}, Lpq;->f(Lkn2;Z)V

    .line 139
    .line 140
    .line 141
    new-instance p0, Lab4;

    .line 142
    .line 143
    invoke-direct {p0, v5}, Lab4;-><init>(I)V

    .line 144
    .line 145
    .line 146
    new-instance p1, Lmw1;

    .line 147
    .line 148
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    return-object p1

    .line 152
    :sswitch_4
    const-string p1, "android.media3.session.demo.SHUFFLE_ON"

    .line 153
    .line 154
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_4

    .line 159
    .line 160
    goto/16 :goto_4

    .line 161
    .line 162
    :cond_4
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Lqi3;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-nez p1, :cond_5

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_5
    sget-object p2, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 170
    .line 171
    if-nez p2, :cond_6

    .line 172
    .line 173
    :goto_1
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-interface {p1, v4}, Lqi3;->s(Z)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_6
    sget-object p2, Lio1;->b:Landroid/os/Handler;

    .line 182
    .line 183
    new-instance p3, Lat1;

    .line 184
    .line 185
    invoke-direct {p3, p1, v5}, Lat1;-><init>(Lqi3;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 189
    .line 190
    .line 191
    :goto_2
    invoke-virtual {v0, p0, v5}, Lpq;->f(Lkn2;Z)V

    .line 192
    .line 193
    .line 194
    new-instance p0, Lab4;

    .line 195
    .line 196
    invoke-direct {p0, v5}, Lab4;-><init>(I)V

    .line 197
    .line 198
    .line 199
    new-instance p1, Lmw1;

    .line 200
    .line 201
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    return-object p1

    .line 205
    :sswitch_5
    const-string p3, "android.media3.session.demo.HEART_OFF"

    .line 206
    .line 207
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-nez p3, :cond_a

    .line 212
    .line 213
    goto/16 :goto_4

    .line 214
    .line 215
    :sswitch_6
    const-string p1, "android.media3.session.demo.INSTANT_MIX_ON"

    .line 216
    .line 217
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-nez p1, :cond_7

    .line 222
    .line 223
    goto/16 :goto_4

    .line 224
    .line 225
    :cond_7
    sget-object p1, Lbo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-nez p1, :cond_9

    .line 232
    .line 233
    invoke-static {}, Lud3;->T()Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-eqz p1, :cond_9

    .line 238
    .line 239
    const-string p1, "onCustomCommand: start onInstantMix"

    .line 240
    .line 241
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    new-instance p1, Lk6;

    .line 245
    .line 246
    const/16 p2, 0xb

    .line 247
    .line 248
    invoke-direct {p1, p2, v0, p0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-interface {p2}, Lqi3;->a()Lgn2;

    .line 259
    .line 260
    .line 261
    move-result-object p3

    .line 262
    invoke-interface {p2}, Lqi3;->o0()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-interface {p2}, Lqi3;->Q0()I

    .line 267
    .line 268
    .line 269
    move-result p2

    .line 270
    add-int/lit8 v3, p2, -0x1

    .line 271
    .line 272
    const-string v6, "BaseMediaService"

    .line 273
    .line 274
    if-ltz v2, :cond_8

    .line 275
    .line 276
    if-ge v2, v3, :cond_8

    .line 277
    .line 278
    new-instance v7, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    const-string v8, "onInstantMix: remove range from "

    .line 281
    .line 282
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    const-string v8, " to "

    .line 289
    .line 290
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    add-int/2addr v2, v4

    .line 304
    invoke-static {v1, v2, p2}, Lbo2;->k(Lao2;II)V

    .line 305
    .line 306
    .line 307
    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v2, "onInstantMix: start Continuous Play with "

    .line 310
    .line 311
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-static {v6, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    new-instance p2, Lvp;

    .line 325
    .line 326
    invoke-direct {p2, p1, v5}, Lvp;-><init>(Lk6;I)V

    .line 327
    .line 328
    .line 329
    invoke-static {p3, v1, p2}, Lbo2;->c(Lgn2;Lao2;Lvp;)V

    .line 330
    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_9
    const-string p1, "onCustomCommand: onInstantMix not usable"

    .line 334
    .line 335
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    :goto_3
    invoke-virtual {v0, p0, v5}, Lpq;->f(Lkn2;Z)V

    .line 339
    .line 340
    .line 341
    new-instance p0, Lab4;

    .line 342
    .line 343
    invoke-direct {p0, v5}, Lab4;-><init>(I)V

    .line 344
    .line 345
    .line 346
    new-instance p1, Lmw1;

    .line 347
    .line 348
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object p1

    .line 352
    :sswitch_7
    const-string p3, "android.media3.session.demo.HEART_ON"

    .line 353
    .line 354
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result p3

    .line 358
    if-nez p3, :cond_a

    .line 359
    .line 360
    goto :goto_4

    .line 361
    :cond_a
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 362
    .line 363
    .line 364
    move-result-object p2

    .line 365
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-static {p2}, Lpq;->c(Lqi3;)Z

    .line 369
    .line 370
    .line 371
    move-result p2

    .line 372
    invoke-virtual {v0, p0, v4}, Lpq;->f(Lkn2;Z)V

    .line 373
    .line 374
    .line 375
    new-instance p3, Lvl1;

    .line 376
    .line 377
    xor-int/2addr p2, v4

    .line 378
    invoke-direct {p3, p2}, Lvl1;-><init>(Z)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 382
    .line 383
    .line 384
    move-result-object p2

    .line 385
    invoke-interface {p2}, Lqi3;->a()Lgn2;

    .line 386
    .line 387
    .line 388
    move-result-object p2

    .line 389
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    iget-object p2, p2, Lgn2;->a:Ljava/lang/String;

    .line 393
    .line 394
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v0, p0, p1, p2, p3}, Lpq;->e(Lkn2;Lfr2;Ljava/lang/String;Llu3;)Lic2;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    return-object p0

    .line 402
    :sswitch_8
    const-string p0, "com.eddyizm.tempus.PLAY_NEXT_FIXUP"

    .line 403
    .line 404
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result p0

    .line 408
    if-nez p0, :cond_b

    .line 409
    .line 410
    :goto_4
    new-instance p0, Lab4;

    .line 411
    .line 412
    new-instance p1, Lxa4;

    .line 413
    .line 414
    const/4 p3, -0x6

    .line 415
    invoke-direct {p1, p3, p2}, Lxa4;-><init>(ILjava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-direct {p0, p1}, Lab4;-><init>(Lxa4;)V

    .line 419
    .line 420
    .line 421
    new-instance p1, Lmw1;

    .line 422
    .line 423
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    return-object p1

    .line 427
    :cond_b
    const-string p0, "play_next_insert_pos"

    .line 428
    .line 429
    const/4 p1, -0x1

    .line 430
    invoke-virtual {p3, p0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 431
    .line 432
    .line 433
    move-result p0

    .line 434
    const-string p2, "play_next_count"

    .line 435
    .line 436
    invoke-virtual {p3, p2, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 437
    .line 438
    .line 439
    move-result p2

    .line 440
    const-string v0, "play_next_target_count"

    .line 441
    .line 442
    invoke-virtual {p3, v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    invoke-virtual {v1, p0, p2, p1}, Lcom/eddyizm/tempus/service/MediaService;->a(III)V

    .line 447
    .line 448
    .line 449
    new-instance p0, Lab4;

    .line 450
    .line 451
    invoke-direct {p0, v5}, Lab4;-><init>(I)V

    .line 452
    .line 453
    .line 454
    new-instance p1, Lmw1;

    .line 455
    .line 456
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    return-object p1

    .line 460
    nop

    .line 461
    :sswitch_data_0
    .sparse-switch
        -0x3d03023a -> :sswitch_8
        -0x1799ddd5 -> :sswitch_7
        0xb74f653 -> :sswitch_6
        0x245e2283 -> :sswitch_5
        0x2d344dd8 -> :sswitch_4
        0x37c555b0 -> :sswitch_3
        0x37c5897e -> :sswitch_2
        0x37c58a75 -> :sswitch_1
        0x79556c76 -> :sswitch_0
    .end sparse-switch
.end method

.method public final r(Lfr2;Ljava/lang/String;ILjn2;)Lic2;
    .locals 7

    .line 1
    const-string v0, "androidx.media3.session.recent.root"

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    iget-object v1, p0, Ltn2;->D:Lpq;

    .line 9
    .line 10
    const/4 v2, -0x6

    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    iget-object p1, p0, Ltn2;->h:Lls2;

    .line 14
    .line 15
    iget-object p1, p1, Lls2;->o:Landroid/content/ComponentName;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object p1, p0, Ltn2;->s:Lal3;

    .line 20
    .line 21
    invoke-virtual {p1}, Lal3;->g()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 p2, 0x1

    .line 26
    if-ne p1, p2, :cond_1

    .line 27
    .line 28
    new-instance p1, Llb4;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iget-boolean p2, p0, Ltn2;->y:Z

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-virtual {p0}, Ltn2;->g()Lfr2;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance p2, Llw1;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2, p0}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 58
    .line 59
    .line 60
    new-instance p0, Lgp3;

    .line 61
    .line 62
    const/16 p3, 0xe

    .line 63
    .line 64
    invoke-direct {p0, p3, p1, p4}, Lgp3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    new-instance p3, Llg1;

    .line 68
    .line 69
    invoke-direct {p3, v0, p2, p0}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lgq0;->n:Lgq0;

    .line 73
    .line 74
    invoke-virtual {p2, p3, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_1
    new-instance p0, Lum2;

    .line 79
    .line 80
    invoke-direct {p0}, Lum2;-><init>()V

    .line 81
    .line 82
    .line 83
    sget-object p1, Lyw1;->o:Lvw1;

    .line 84
    .line 85
    sget-object p1, Lgy3;->r:Lgy3;

    .line 86
    .line 87
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 88
    .line 89
    sget-object p1, Lgy3;->r:Lgy3;

    .line 90
    .line 91
    new-instance p1, Lzm2;

    .line 92
    .line 93
    invoke-direct {p1}, Lzm2;-><init>()V

    .line 94
    .line 95
    .line 96
    sget-object v6, Lcn2;->d:Lcn2;

    .line 97
    .line 98
    new-instance p2, Lco2;

    .line 99
    .line 100
    invoke-direct {p2}, Lco2;-><init>()V

    .line 101
    .line 102
    .line 103
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 104
    .line 105
    iput-object p3, p2, Lco2;->q:Ljava/lang/Boolean;

    .line 106
    .line 107
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    iput-object p3, p2, Lco2;->r:Ljava/lang/Boolean;

    .line 110
    .line 111
    new-instance v5, Ldo2;

    .line 112
    .line 113
    invoke-direct {v5, p2}, Ldo2;-><init>(Lco2;)V

    .line 114
    .line 115
    .line 116
    new-instance v0, Lgn2;

    .line 117
    .line 118
    new-instance v2, Lwm2;

    .line 119
    .line 120
    invoke-direct {v2, p0}, Lvm2;-><init>(Lum2;)V

    .line 121
    .line 122
    .line 123
    new-instance v4, Lan2;

    .line 124
    .line 125
    invoke-direct {v4, p1}, Lan2;-><init>(Lzm2;)V

    .line 126
    .line 127
    .line 128
    const-string v1, "androidx.media3.session.recent.item"

    .line 129
    .line 130
    const/4 v3, 0x0

    .line 131
    invoke-direct/range {v0 .. v6}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v0}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0, p4}, Lm92;->c(Lgy3;Ljn2;)Lm92;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    new-instance p1, Lmw1;

    .line 143
    .line 144
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    :cond_2
    invoke-static {v2}, Lm92;->b(I)Lm92;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    new-instance p1, Lmw1;

    .line 153
    .line 154
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    return-object p1

    .line 158
    :cond_3
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v2}, Lm92;->b(I)Lm92;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    new-instance v3, Lmw1;

    .line 169
    .line 170
    invoke-direct {v3, p2}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    new-instance v1, Lqn2;

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    move-object v2, p0

    .line 177
    move-object v4, p1

    .line 178
    move v5, p3

    .line 179
    invoke-direct/range {v1 .. v6}, Lqn2;-><init>(Ltn2;Lmw1;Lfr2;II)V

    .line 180
    .line 181
    .line 182
    new-instance p0, Lrn2;

    .line 183
    .line 184
    invoke-direct {p0, v2, v0}, Lrn2;-><init>(Ltn2;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v3, v1, p0}, Lmw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 188
    .line 189
    .line 190
    return-object v3
.end method

.method public final s(Lfr2;Ljn2;)Lmw1;
    .locals 12

    .line 1
    const/4 v1, -0x6

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    iget-boolean v2, p2, Ljn2;->b:Z

    .line 5
    .line 6
    if-eqz v2, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Ltn2;->m(Lfr2;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Ltn2;->h:Lls2;

    .line 15
    .line 16
    iget-object v0, v0, Lls2;->o:Landroid/content/ComponentName;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Lum2;

    .line 21
    .line 22
    invoke-direct {v0}, Lum2;-><init>()V

    .line 23
    .line 24
    .line 25
    sget-object v1, Lyw1;->o:Lvw1;

    .line 26
    .line 27
    sget-object v1, Lgy3;->r:Lgy3;

    .line 28
    .line 29
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 30
    .line 31
    sget-object v1, Lgy3;->r:Lgy3;

    .line 32
    .line 33
    new-instance v1, Lzm2;

    .line 34
    .line 35
    invoke-direct {v1}, Lzm2;-><init>()V

    .line 36
    .line 37
    .line 38
    sget-object v11, Lcn2;->d:Lcn2;

    .line 39
    .line 40
    new-instance v2, Lco2;

    .line 41
    .line 42
    invoke-direct {v2}, Lco2;-><init>()V

    .line 43
    .line 44
    .line 45
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    iput-object v3, v2, Lco2;->q:Ljava/lang/Boolean;

    .line 48
    .line 49
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    iput-object v3, v2, Lco2;->r:Ljava/lang/Boolean;

    .line 52
    .line 53
    new-instance v10, Ldo2;

    .line 54
    .line 55
    invoke-direct {v10, v2}, Ldo2;-><init>(Lco2;)V

    .line 56
    .line 57
    .line 58
    new-instance v5, Lgn2;

    .line 59
    .line 60
    new-instance v7, Lwm2;

    .line 61
    .line 62
    invoke-direct {v7, v0}, Lvm2;-><init>(Lum2;)V

    .line 63
    .line 64
    .line 65
    new-instance v9, Lan2;

    .line 66
    .line 67
    invoke-direct {v9, v1}, Lan2;-><init>(Lzm2;)V

    .line 68
    .line 69
    .line 70
    const-string v6, "androidx.media3.session.recent.root"

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    invoke-direct/range {v5 .. v11}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Lm92;->d(Lgn2;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Lm92;

    .line 80
    .line 81
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    move-object v6, v5

    .line 86
    const/4 v5, 0x0

    .line 87
    const/4 v7, 0x2

    .line 88
    const/4 v1, 0x0

    .line 89
    move-object v4, p2

    .line 90
    invoke-direct/range {v0 .. v7}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    new-instance v1, Lmw1;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_0
    invoke-static {v1}, Lm92;->b(I)Lm92;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lmw1;

    .line 104
    .line 105
    invoke-direct {v1, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_1
    invoke-virtual/range {p0 .. p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Ltn2;->D:Lpq;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v1}, Lm92;->b(I)Lm92;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    new-instance v1, Lmw1;

    .line 122
    .line 123
    invoke-direct {v1, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    return-object v1
.end method

.method public final t(Lfr2;Landroid/content/Intent;)Z
    .locals 10

    .line 1
    iget v0, p1, Lfr2;->b:I

    .line 2
    .line 3
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v3, "android.intent.extra.KEY_EVENT"

    .line 11
    .line 12
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/KeyEvent;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v2

    .line 26
    :goto_0
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const-string v5, "android.intent.action.MEDIA_BUTTON"

    .line 35
    .line 36
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v4, :cond_10

    .line 42
    .line 43
    iget-object v4, p0, Ltn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {v3, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_10

    .line 60
    .line 61
    :cond_1
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0}, Ltn2;->F()V

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Ltn2;->e:Lpq;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getAction()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/16 v6, 0x4f

    .line 78
    .line 79
    const/4 v7, 0x1

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eq p0, v6, :cond_f

    .line 87
    .line 88
    const/16 p1, 0x7e

    .line 89
    .line 90
    if-eq p0, p1, :cond_f

    .line 91
    .line 92
    const/16 p1, 0x7f

    .line 93
    .line 94
    if-eq p0, p1, :cond_f

    .line 95
    .line 96
    const/16 p1, 0x110

    .line 97
    .line 98
    if-eq p0, p1, :cond_f

    .line 99
    .line 100
    const/16 p1, 0x111

    .line 101
    .line 102
    if-eq p0, p1, :cond_f

    .line 103
    .line 104
    packed-switch p0, :pswitch_data_0

    .line 105
    .line 106
    .line 107
    goto/16 :goto_4

    .line 108
    .line 109
    :cond_3
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-string v8, "android.software.leanback"

    .line 118
    .line 119
    invoke-virtual {v4, v8}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    const/16 v8, 0x55

    .line 124
    .line 125
    iget-object v9, p0, Ltn2;->d:Lcj2;

    .line 126
    .line 127
    if-eq v3, v6, :cond_5

    .line 128
    .line 129
    if-eq v3, v8, :cond_5

    .line 130
    .line 131
    iget-object p1, v9, Lcj2;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, Lqo2;

    .line 134
    .line 135
    if-eqz p1, :cond_4

    .line 136
    .line 137
    invoke-virtual {v9, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, v9, Lcj2;->b:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, Lqo2;

    .line 143
    .line 144
    iput-object v2, v9, Lcj2;->b:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v2, p1

    .line 147
    :cond_4
    if-eqz v2, :cond_b

    .line 148
    .line 149
    invoke-static {v9, v2}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    if-nez v4, :cond_9

    .line 154
    .line 155
    if-nez v0, :cond_9

    .line 156
    .line 157
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_6

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_6
    iget-object v4, v9, Lcj2;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Lqo2;

    .line 167
    .line 168
    if-eqz v4, :cond_8

    .line 169
    .line 170
    if-eqz v4, :cond_7

    .line 171
    .line 172
    invoke-virtual {v9, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 173
    .line 174
    .line 175
    iput-object v2, v9, Lcj2;->b:Ljava/lang/Object;

    .line 176
    .line 177
    :cond_7
    move p1, v7

    .line 178
    goto :goto_3

    .line 179
    :cond_8
    new-instance p0, Lqo2;

    .line 180
    .line 181
    invoke-direct {p0, v9, p1, v1, v7}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 182
    .line 183
    .line 184
    iput-object p0, v9, Lcj2;->b:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    int-to-long p1, p1

    .line 191
    invoke-virtual {v9, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 192
    .line 193
    .line 194
    return v7

    .line 195
    :cond_9
    :goto_1
    iget-object p1, v9, Lcj2;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p1, Lqo2;

    .line 198
    .line 199
    if-eqz p1, :cond_a

    .line 200
    .line 201
    invoke-virtual {v9, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 202
    .line 203
    .line 204
    iget-object p1, v9, Lcj2;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p1, Lqo2;

    .line 207
    .line 208
    iput-object v2, v9, Lcj2;->b:Ljava/lang/Object;

    .line 209
    .line 210
    move-object v2, p1

    .line 211
    :cond_a
    if-eqz v2, :cond_b

    .line 212
    .line 213
    invoke-static {v9, v2}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    :cond_b
    :goto_2
    move p1, v5

    .line 217
    :goto_3
    iget-boolean v2, p0, Ltn2;->y:Z

    .line 218
    .line 219
    if-nez v2, :cond_e

    .line 220
    .line 221
    iget-object p0, p0, Ltn2;->h:Lls2;

    .line 222
    .line 223
    if-eq v3, v8, :cond_c

    .line 224
    .line 225
    if-ne v3, v6, :cond_d

    .line 226
    .line 227
    :cond_c
    if-eqz p1, :cond_d

    .line 228
    .line 229
    invoke-virtual {p0}, Lls2;->z()V

    .line 230
    .line 231
    .line 232
    return v7

    .line 233
    :cond_d
    if-eqz v0, :cond_10

    .line 234
    .line 235
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 236
    .line 237
    iget-object p0, p0, Lqr2;->p:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p0, Lwo0;

    .line 240
    .line 241
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p0, Lxk2;

    .line 244
    .line 245
    iget-object p0, p0, Lxk2;->a:Landroid/media/session/MediaController;

    .line 246
    .line 247
    invoke-virtual {p0, v1}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 248
    .line 249
    .line 250
    return v7

    .line 251
    :cond_e
    const-string v0, "androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY"

    .line 252
    .line 253
    invoke-virtual {p2, v0, v5}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    invoke-virtual {v1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-gtz v0, :cond_f

    .line 262
    .line 263
    invoke-virtual {p0, v1, p1, p2}, Ltn2;->c(Landroid/view/KeyEvent;ZZ)Z

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-eqz p0, :cond_10

    .line 268
    .line 269
    :cond_f
    :pswitch_0
    return v7

    .line 270
    :cond_10
    :goto_4
    return v5

    .line 271
    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final u()Z
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Llb4;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lws1;

    .line 17
    .line 18
    const/16 v2, 0x1d

    .line 19
    .line 20
    invoke-direct {v1, v2, p0, v0}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Ltn2;->o:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    return p0

    .line 39
    :catch_0
    move-exception p0

    .line 40
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_0
    iget-object v0, p0, Ltn2;->v:Lrm2;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, v0, Lrm2;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroidx/media3/session/MediaLibraryService;

    .line 54
    .line 55
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 v3, 0x1f

    .line 58
    .line 59
    if-lt v2, v3, :cond_2

    .line 60
    .line 61
    const/16 v3, 0x21

    .line 62
    .line 63
    if-lt v2, v3, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    sget v2, Landroidx/media3/session/MediaLibraryService;->t:I

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-boolean v2, v2, Llo2;->x:Z

    .line 73
    .line 74
    if-nez v2, :cond_2

    .line 75
    .line 76
    iget-object p0, p0, Ltn2;->k:Lkn2;

    .line 77
    .line 78
    invoke-virtual {v0, p0, v1}, Landroidx/media3/session/MediaLibraryService;->k(Lkn2;Z)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :cond_2
    :goto_0
    return v1
.end method

.method public final v(Lfr2;Lmi3;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Ltn2;->e:Lpq;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ltn2;->k:Lkn2;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x7

    .line 22
    const/4 v0, 0x6

    .line 23
    const/16 v1, 0x9

    .line 24
    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    filled-new-array {v1, v2, p1, v0}, [I

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p2, Lmi3;->a:Lw71;

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Lw71;->a([I)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    const/4 p1, 0x3

    .line 40
    const/4 v0, 0x1

    .line 41
    filled-new-array {v0, p1}, [I

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p2, p1}, Lw71;->a([I)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-interface {p0}, Lqi3;->a()Lgn2;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-interface {p0}, Lqi3;->q()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-interface {p0}, Lqi3;->g()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-ne p1, v0, :cond_2

    .line 77
    .line 78
    invoke-interface {p0}, Lqi3;->b()V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-interface {p0}, Lqi3;->m0()V

    .line 82
    .line 83
    .line 84
    :cond_3
    :goto_0
    return-void
.end method

.method public final w(Lfr2;)Lmw1;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltn2;->D:Lpq;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, -0x6

    .line 10
    invoke-static {v0}, Lm92;->b(I)Lm92;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lmw1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lsn2;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, v1, p1, v2}, Lsn2;-><init>(Ltn2;Lmw1;Lfr2;I)V

    .line 23
    .line 24
    .line 25
    new-instance p1, Lrn2;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {p1, p0, v2}, Lrn2;-><init>(Ltn2;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0, p1}, Lmw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public final x(Lfr2;Ljava/util/List;IJ)Llb4;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Ltn2;->e:Lpq;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ltn2;->k:Lkn2;

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1, p2}, Lpq;->d(Lkn2;Lfr2;Ljava/util/List;)Lmw1;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance p1, Lcr2;

    .line 17
    .line 18
    invoke-direct {p1, p3, p4, p5}, Lcr2;-><init>(IJ)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lf35;->h0(Lic2;Lmk;)Llb4;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final y(Lfr2;Ljava/lang/String;Ljn2;)Llb4;
    .locals 10

    .line 1
    iget-object v0, p1, Lfr2;->d:Ler2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Ltn2;->F:Lnl1;

    .line 7
    .line 8
    invoke-virtual {v2, v0, p2}, Lq1;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ltn2;->E:Lnl1;

    .line 12
    .line 13
    invoke-virtual {v0, p2, p1}, Lq1;->j(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iget-object v0, p0, Ltn2;->D:Lpq;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/4 v0, -0x6

    .line 26
    invoke-static {v0}, Lm92;->b(I)Lm92;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v2, Lmw1;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, Ldg0;

    .line 36
    .line 37
    const/4 v9, 0x5

    .line 38
    iget-object v6, p0, Ltn2;->C:Lkn2;

    .line 39
    .line 40
    move-object v7, p2

    .line 41
    move-object v8, p3

    .line 42
    invoke-direct/range {v4 .. v9}, Ldg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v4}, Lf35;->h0(Lic2;Lmk;)Llb4;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v0, Lt6;

    .line 50
    .line 51
    const/16 v5, 0x10

    .line 52
    .line 53
    move-object v1, p0

    .line 54
    move-object v3, p1

    .line 55
    move-object v4, p2

    .line 56
    invoke-direct/range {v0 .. v5}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Lrn2;

    .line 60
    .line 61
    const/4 v4, 0x1

    .line 62
    invoke-direct {v3, p0, v4}, Lrn2;-><init>(Ltn2;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v0, v3}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 66
    .line 67
    .line 68
    return-object v2
.end method

.method public final z(Lfr2;Ljava/lang/String;)Lmw1;
    .locals 9

    .line 1
    invoke-virtual {p0, p1}, Ltn2;->B(Lfr2;)Lfr2;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltn2;->D:Lpq;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Lm92;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    invoke-direct/range {v1 .. v8}, Lm92;-><init>(IJLjn2;Lxa4;Ljava/lang/Object;I)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lmw1;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lv6;

    .line 29
    .line 30
    const/16 v2, 0x1c

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, p2, v2}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lrn2;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-direct {p1, p0, p2}, Lrn2;-><init>(Ltn2;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, p1}, Lmw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
