.class public final Lsq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr21;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Lcv3;

.field public final b:Lev3;

.field public final c:Lrq1;

.field public volatile d:Lyq1;

.field public final e:Lpr3;

.field public volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, ":scheme"

    .line 2
    .line 3
    const-string v11, ":authority"

    .line 4
    .line 5
    const-string v0, "connection"

    .line 6
    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    const-string v2, "keep-alive"

    .line 10
    .line 11
    const-string v3, "proxy-connection"

    .line 12
    .line 13
    const-string v4, "te"

    .line 14
    .line 15
    const-string v5, "transfer-encoding"

    .line 16
    .line 17
    const-string v6, "encoding"

    .line 18
    .line 19
    const-string v7, "upgrade"

    .line 20
    .line 21
    const-string v8, ":method"

    .line 22
    .line 23
    const-string v9, ":path"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lze5;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lsq1;->g:Ljava/util/List;

    .line 34
    .line 35
    const-string v7, "encoding"

    .line 36
    .line 37
    const-string v8, "upgrade"

    .line 38
    .line 39
    const-string v1, "connection"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    const-string v3, "keep-alive"

    .line 44
    .line 45
    const-string v4, "proxy-connection"

    .line 46
    .line 47
    const-string v5, "te"

    .line 48
    .line 49
    const-string v6, "transfer-encoding"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lze5;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lsq1;->h:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Lo83;Lcv3;Lev3;Lrq1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lsq1;->a:Lcv3;

    .line 11
    .line 12
    iput-object p3, p0, Lsq1;->b:Lev3;

    .line 13
    .line 14
    iput-object p4, p0, Lsq1;->c:Lrq1;

    .line 15
    .line 16
    iget-object p1, p1, Lo83;->s:Ljava/util/List;

    .line 17
    .line 18
    sget-object p2, Lpr3;->t:Lpr3;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object p2, Lpr3;->s:Lpr3;

    .line 28
    .line 29
    :goto_0
    iput-object p2, p0, Lsq1;->e:Lpr3;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lk14;)Lej4;
    .locals 0

    .line 1
    iget-object p0, p0, Lsq1;->d:Lyq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyq1;->h:Lwq1;

    .line 7
    .line 8
    return-object p0
.end method

.method public final b(Loz3;)V
    .locals 14

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lsq1;->d:Lyq1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p1, Loz3;->d:Ltz3;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v1

    .line 18
    :goto_0
    iget-object v3, p1, Loz3;->c:Ltl1;

    .line 19
    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v3}, Ltl1;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    add-int/lit8 v5, v5, 0x4

    .line 27
    .line 28
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Lpl1;

    .line 32
    .line 33
    sget-object v6, Lpl1;->f:Lyw;

    .line 34
    .line 35
    iget-object v7, p1, Loz3;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v5, v6, v7}, Lpl1;-><init>(Lyw;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    new-instance v5, Lpl1;

    .line 44
    .line 45
    sget-object v6, Lpl1;->g:Lyw;

    .line 46
    .line 47
    iget-object p1, p1, Loz3;->a:Lgr1;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lgr1;->b()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {p1}, Lgr1;->d()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    if-eqz v8, :cond_2

    .line 61
    .line 62
    new-instance v9, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v7, 0x3f

    .line 71
    .line 72
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    :cond_2
    invoke-direct {v5, v6, v7}, Lpl1;-><init>(Lyw;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    const-string v5, "Host"

    .line 89
    .line 90
    invoke-virtual {v3, v5}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eqz v5, :cond_3

    .line 95
    .line 96
    new-instance v6, Lpl1;

    .line 97
    .line 98
    sget-object v7, Lpl1;->i:Lyw;

    .line 99
    .line 100
    invoke-direct {v6, v7, v5}, Lpl1;-><init>(Lyw;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    new-instance v5, Lpl1;

    .line 107
    .line 108
    sget-object v6, Lpl1;->h:Lyw;

    .line 109
    .line 110
    iget-object p1, p1, Lgr1;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-direct {v5, v6, p1}, Lpl1;-><init>(Lyw;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3}, Ltl1;->size()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    move v5, v1

    .line 123
    :goto_1
    if-ge v5, p1, :cond_6

    .line 124
    .line 125
    invoke-virtual {v3, v5}, Ltl1;->b(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 130
    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object v7, Lsq1;->g:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_4

    .line 148
    .line 149
    const-string v7, "te"

    .line 150
    .line 151
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    if-eqz v7, :cond_5

    .line 156
    .line 157
    invoke-virtual {v3, v5}, Ltl1;->e(I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const-string v8, "trailers"

    .line 162
    .line 163
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    if-eqz v7, :cond_5

    .line 168
    .line 169
    :cond_4
    new-instance v7, Lpl1;

    .line 170
    .line 171
    invoke-virtual {v3, v5}, Ltl1;->e(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-direct {v7, v6, v8}, Lpl1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_6
    iget-object v8, p0, Lsq1;->c:Lrq1;

    .line 185
    .line 186
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    xor-int/lit8 v9, v0, 0x1

    .line 190
    .line 191
    iget-object p1, v8, Lrq1;->J:Lzq1;

    .line 192
    .line 193
    monitor-enter p1

    .line 194
    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 195
    :try_start_1
    iget v3, v8, Lrq1;->r:I

    .line 196
    .line 197
    const v5, 0x3fffffff    # 1.9999999f

    .line 198
    .line 199
    .line 200
    if-le v3, v5, :cond_7

    .line 201
    .line 202
    sget-object v3, Lb21;->t:Lb21;

    .line 203
    .line 204
    invoke-virtual {v8, v3}, Lrq1;->q(Lb21;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    move-object p0, v0

    .line 210
    goto/16 :goto_3

    .line 211
    .line 212
    :cond_7
    :goto_2
    iget-boolean v3, v8, Lrq1;->s:Z

    .line 213
    .line 214
    if-nez v3, :cond_d

    .line 215
    .line 216
    iget v7, v8, Lrq1;->r:I

    .line 217
    .line 218
    add-int/lit8 v3, v7, 0x2

    .line 219
    .line 220
    iput v3, v8, Lrq1;->r:I

    .line 221
    .line 222
    new-instance v6, Lyq1;

    .line 223
    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v10, 0x0

    .line 226
    invoke-direct/range {v6 .. v11}, Lyq1;-><init>(ILrq1;ZZLtl1;)V

    .line 227
    .line 228
    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    iget-wide v10, v8, Lrq1;->G:J

    .line 232
    .line 233
    iget-wide v12, v8, Lrq1;->H:J

    .line 234
    .line 235
    cmp-long v0, v10, v12

    .line 236
    .line 237
    if-gez v0, :cond_8

    .line 238
    .line 239
    iget-wide v10, v6, Lyq1;->d:J

    .line 240
    .line 241
    iget-wide v12, v6, Lyq1;->e:J

    .line 242
    .line 243
    cmp-long v0, v10, v12

    .line 244
    .line 245
    if-ltz v0, :cond_9

    .line 246
    .line 247
    :cond_8
    move v1, v2

    .line 248
    :cond_9
    invoke-virtual {v6}, Lyq1;->h()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_a

    .line 253
    .line 254
    iget-object v0, v8, Lrq1;->o:Ljava/util/LinkedHashMap;

    .line 255
    .line 256
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 261
    .line 262
    .line 263
    :cond_a
    :try_start_2
    monitor-exit v8

    .line 264
    iget-object v0, v8, Lrq1;->J:Lzq1;

    .line 265
    .line 266
    invoke-virtual {v0, v9, v7, v4}, Lzq1;->q(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 267
    .line 268
    .line 269
    monitor-exit p1

    .line 270
    if-eqz v1, :cond_b

    .line 271
    .line 272
    iget-object p1, v8, Lrq1;->J:Lzq1;

    .line 273
    .line 274
    invoke-virtual {p1}, Lzq1;->flush()V

    .line 275
    .line 276
    .line 277
    :cond_b
    iput-object v6, p0, Lsq1;->d:Lyq1;

    .line 278
    .line 279
    iget-boolean p1, p0, Lsq1;->f:Z

    .line 280
    .line 281
    iget-object v0, p0, Lsq1;->d:Lyq1;

    .line 282
    .line 283
    if-nez p1, :cond_c

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object p1, v0, Lyq1;->j:Lxq1;

    .line 289
    .line 290
    iget-object v0, p0, Lsq1;->b:Lev3;

    .line 291
    .line 292
    iget v0, v0, Lev3;->g:I

    .line 293
    .line 294
    int-to-long v0, v0

    .line 295
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 296
    .line 297
    invoke-virtual {p1, v0, v1, v2}, Lfu4;->g(JLjava/util/concurrent/TimeUnit;)Lfu4;

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Lsq1;->d:Lyq1;

    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    iget-object p1, p1, Lyq1;->k:Lxq1;

    .line 306
    .line 307
    iget-object p0, p0, Lsq1;->b:Lev3;

    .line 308
    .line 309
    iget p0, p0, Lev3;->h:I

    .line 310
    .line 311
    int-to-long v0, p0

    .line 312
    invoke-virtual {p1, v0, v1, v2}, Lfu4;->g(JLjava/util/concurrent/TimeUnit;)Lfu4;

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    sget-object p0, Lb21;->u:Lb21;

    .line 320
    .line 321
    invoke-virtual {v0, p0}, Lyq1;->e(Lb21;)V

    .line 322
    .line 323
    .line 324
    const-string p0, "Canceled"

    .line 325
    .line 326
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :catchall_1
    move-exception v0

    .line 331
    move-object p0, v0

    .line 332
    goto :goto_4

    .line 333
    :cond_d
    :try_start_3
    new-instance p0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 334
    .line 335
    invoke-direct {p0}, Lokhttp3/internal/http2/ConnectionShutdownException;-><init>()V

    .line 336
    .line 337
    .line 338
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 339
    :goto_3
    :try_start_4
    monitor-exit v8

    .line 340
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 341
    :goto_4
    monitor-exit p1

    .line 342
    throw p0
.end method

.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, Lsq1;->d:Lyq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lyq1;->f()Lvq1;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lvq1;->close()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lsq1;->f:Z

    .line 3
    .line 4
    iget-object p0, p0, Lsq1;->d:Lyq1;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lb21;->u:Lb21;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lyq1;->e(Lb21;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final d(Lk14;)J
    .locals 0

    .line 1
    invoke-static {p1}, Lbr1;->a(Lk14;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-static {p1}, Lze5;->e(Lk14;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public final e(Loz3;J)Lof4;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsq1;->d:Lyq1;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lyq1;->f()Lvq1;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final f(Z)Lj14;
    .locals 10

    .line 1
    iget-object v0, p0, Lsq1;->d:Lyq1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_f

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :cond_0
    :goto_0
    :try_start_0
    iget-object v2, v0, Lyq1;->f:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_7

    .line 15
    .line 16
    iget-object v2, v0, Lyq1;->l:Lb21;

    .line 17
    .line 18
    if-nez v2, :cond_7

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-nez p1, :cond_3

    .line 22
    .line 23
    iget-object v4, v0, Lyq1;->b:Lrq1;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v4, v0, Lyq1;->i:Lvq1;

    .line 29
    .line 30
    iget-boolean v5, v4, Lvq1;->p:Z

    .line 31
    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    iget-boolean v4, v4, Lvq1;->n:Z

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v4, v3

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    move v4, v2

    .line 42
    :goto_2
    if-eqz v4, :cond_4

    .line 43
    .line 44
    :cond_3
    move v3, v2

    .line 45
    :cond_4
    if-eqz v3, :cond_5

    .line 46
    .line 47
    iget-object v2, v0, Lyq1;->j:Lxq1;

    .line 48
    .line 49
    invoke-virtual {v2}, Luk;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto/16 :goto_8

    .line 55
    .line 56
    :cond_5
    :goto_3
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    .line 58
    .line 59
    if-eqz v3, :cond_0

    .line 60
    .line 61
    :try_start_2
    iget-object v2, v0, Lyq1;->j:Lxq1;

    .line 62
    .line 63
    invoke-virtual {v2}, Lxq1;->k()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_1
    move-exception p0

    .line 68
    goto :goto_4

    .line 69
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 74
    .line 75
    .line 76
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 77
    .line 78
    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 79
    .line 80
    .line 81
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    :goto_4
    if-eqz v3, :cond_6

    .line 83
    .line 84
    :try_start_4
    iget-object p1, v0, Lyq1;->j:Lxq1;

    .line 85
    .line 86
    invoke-virtual {p1}, Lxq1;->k()V

    .line 87
    .line 88
    .line 89
    :cond_6
    throw p0

    .line 90
    :cond_7
    iget-object v2, v0, Lyq1;->f:Ljava/util/ArrayDeque;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_d

    .line 97
    .line 98
    iget-object v2, v0, Lyq1;->f:Ljava/util/ArrayDeque;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    check-cast v2, Ltl1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 108
    .line 109
    monitor-exit v0

    .line 110
    iget-object p0, p0, Lsq1;->e:Lpr3;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v0, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v4, 0x14

    .line 118
    .line 119
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ltl1;->size()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    move-object v6, v1

    .line 127
    move v5, v3

    .line 128
    :goto_5
    if-ge v5, v4, :cond_a

    .line 129
    .line 130
    invoke-virtual {v2, v5}, Ltl1;->b(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v2, v5}, Ltl1;->e(I)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    const-string v9, ":status"

    .line 139
    .line 140
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v9

    .line 144
    if-eqz v9, :cond_8

    .line 145
    .line 146
    const-string v6, "HTTP/1.1 "

    .line 147
    .line 148
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-static {v6}, Lhw;->C(Ljava/lang/String;)Lue1;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    goto :goto_6

    .line 157
    :cond_8
    sget-object v9, Lsq1;->h:Ljava/util/List;

    .line 158
    .line 159
    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-nez v9, :cond_9

    .line 164
    .line 165
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    invoke-static {v8}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    :cond_9
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_a
    if-eqz v6, :cond_c

    .line 183
    .line 184
    new-instance v2, Lj14;

    .line 185
    .line 186
    invoke-direct {v2}, Lj14;-><init>()V

    .line 187
    .line 188
    .line 189
    iput-object p0, v2, Lj14;->b:Lpr3;

    .line 190
    .line 191
    iget p0, v6, Lue1;->o:I

    .line 192
    .line 193
    iput p0, v2, Lj14;->c:I

    .line 194
    .line 195
    iget-object p0, v6, Lue1;->q:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p0, Ljava/lang/String;

    .line 198
    .line 199
    iput-object p0, v2, Lj14;->d:Ljava/lang/String;

    .line 200
    .line 201
    new-array p0, v3, [Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, [Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    new-instance v0, Lsl1;

    .line 213
    .line 214
    invoke-direct {v0}, Lsl1;-><init>()V

    .line 215
    .line 216
    .line 217
    iget-object v3, v0, Lsl1;->a:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 230
    .line 231
    .line 232
    iput-object v0, v2, Lj14;->f:Lsl1;

    .line 233
    .line 234
    sget-object p0, Lgq1;->p:Lgq1;

    .line 235
    .line 236
    iput-object p0, v2, Lj14;->n:Lgf1;

    .line 237
    .line 238
    if-eqz p1, :cond_b

    .line 239
    .line 240
    iget p0, v2, Lj14;->c:I

    .line 241
    .line 242
    const/16 p1, 0x64

    .line 243
    .line 244
    if-ne p0, p1, :cond_b

    .line 245
    .line 246
    return-object v1

    .line 247
    :cond_b
    return-object v2

    .line 248
    :cond_c
    new-instance p0, Ljava/net/ProtocolException;

    .line 249
    .line 250
    const-string p1, "Expected \':status\' header not present"

    .line 251
    .line 252
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw p0

    .line 256
    :cond_d
    :try_start_5
    iget-object p0, v0, Lyq1;->m:Ljava/io/IOException;

    .line 257
    .line 258
    if-eqz p0, :cond_e

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_e
    new-instance p0, Lokhttp3/internal/http2/StreamResetException;

    .line 262
    .line 263
    iget-object p1, v0, Lyq1;->l:Lb21;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    invoke-direct {p0, p1}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lb21;)V

    .line 269
    .line 270
    .line 271
    :goto_7
    throw p0

    .line 272
    :goto_8
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 273
    throw p0

    .line 274
    :cond_f
    const-string p0, "stream wasn\'t created"

    .line 275
    .line 276
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    return-object v1
.end method

.method public final g()V
    .locals 0

    .line 1
    iget-object p0, p0, Lsq1;->c:Lrq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lrq1;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final h()Lq21;
    .locals 0

    .line 1
    iget-object p0, p0, Lsq1;->a:Lcv3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Ltl1;
    .locals 2

    .line 1
    iget-object p0, p0, Lsq1;->d:Lyq1;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lyq1;->h:Lwq1;

    .line 8
    .line 9
    iget-boolean v1, v0, Lwq1;->o:Z

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lwq1;->p:Ltv;

    .line 14
    .line 15
    invoke-virtual {v0}, Ltv;->l()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lyq1;->h:Lwq1;

    .line 22
    .line 23
    iget-object v0, v0, Lwq1;->q:Ltv;

    .line 24
    .line 25
    invoke-virtual {v0}, Ltv;->l()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lyq1;->h:Lwq1;

    .line 32
    .line 33
    iget-object v0, v0, Lwq1;->r:Ltl1;

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    sget-object v0, Lze5;->a:Ltl1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    :goto_0
    monitor-exit p0

    .line 43
    return-object v0

    .line 44
    :cond_1
    :try_start_1
    iget-object v0, p0, Lyq1;->l:Lb21;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    iget-object v1, p0, Lyq1;->m:Ljava/io/IOException;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    new-instance v1, Lokhttp3/internal/http2/StreamResetException;

    .line 54
    .line 55
    invoke-direct {v1, v0}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lb21;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    throw v1

    .line 59
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v1, "too early; can\'t read the trailers yet"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    throw v0
.end method
