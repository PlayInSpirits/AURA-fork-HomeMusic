.class public final Ldefpackage/er3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/jd2;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ldefpackage/yl4;

.field public final c:Ldefpackage/z05;

.field public final d:Ldefpackage/hr3;

.field public final e:Ldefpackage/q90;

.field public final f:Ldefpackage/t71;

.field public volatile g:Z

.field public h:Z

.field public i:J

.field public j:Ldefpackage/ii0;

.field public k:Ldefpackage/wv4;

.field public l:Z

.field public final synthetic m:Ldefpackage/hr3;


# direct methods
.method public constructor <init>(Ldefpackage/hr3;Landroid/net/Uri;Ldefpackage/ci0;Ldefpackage/z05;Ldefpackage/hr3;Ldefpackage/q90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/er3;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p1, Ldefpackage/yl4;

    .line 9
    .line 10
    invoke-direct {p1, p3}, Ldefpackage/yl4;-><init>(Ldefpackage/ci0;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 14
    .line 15
    iput-object p4, p0, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 16
    .line 17
    iput-object p5, p0, Ldefpackage/er3;->d:Ldefpackage/hr3;

    .line 18
    .line 19
    iput-object p6, p0, Ldefpackage/er3;->e:Ldefpackage/q90;

    .line 20
    .line 21
    new-instance p1, Ldefpackage/t71;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Ldefpackage/er3;->f:Ldefpackage/t71;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Ldefpackage/er3;->h:Z

    .line 30
    .line 31
    sget-object p1, Ldefpackage/ed2;->g:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 34
    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    invoke-virtual {p0, p3, p1, p2}, Ldefpackage/er3;->c(Ljava/lang/String;J)Ldefpackage/ii0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Ldefpackage/er3;->j:Ldefpackage/ii0;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v0

    .line 6
    move-object v4, v2

    .line 7
    :goto_0
    if-nez v3, :cond_d

    .line 8
    .line 9
    iget-boolean v5, v1, Ldefpackage/er3;->g:Z

    .line 10
    .line 11
    if-nez v5, :cond_d

    .line 12
    .line 13
    const-wide/16 v5, -0x1

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    :try_start_0
    iget-object v8, v1, Ldefpackage/er3;->f:Ldefpackage/t71;

    .line 17
    .line 18
    iget-wide v13, v8, Ldefpackage/t71;->a:J

    .line 19
    .line 20
    invoke-virtual {v1, v4, v13, v14}, Ldefpackage/er3;->c(Ljava/lang/String;J)Ldefpackage/ii0;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iput-object v4, v1, Ldefpackage/er3;->j:Ldefpackage/ii0;

    .line 25
    .line 26
    iget-object v8, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 27
    .line 28
    invoke-virtual {v8, v4}, Ldefpackage/yl4;->b(Ldefpackage/ii0;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    iget-boolean v4, v1, Ldefpackage/er3;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    if-ne v3, v7, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v0, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 40
    .line 41
    invoke-virtual {v0}, Ldefpackage/z05;->g()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    cmp-long v0, v2, v5

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iget-object v0, v1, Ldefpackage/er3;->f:Ldefpackage/t71;

    .line 50
    .line 51
    iget-object v2, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 52
    .line 53
    invoke-virtual {v2}, Ldefpackage/z05;->g()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    iput-wide v2, v0, Ldefpackage/t71;->a:J

    .line 58
    .line 59
    :cond_1
    :goto_1
    iget-object v0, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 60
    .line 61
    invoke-static {v0}, Ldefpackage/fu;->k(Ldefpackage/ci0;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :try_start_1
    iget-object v4, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 66
    .line 67
    iget-object v4, v4, Ldefpackage/yl4;->n:Ldefpackage/ci0;

    .line 68
    .line 69
    invoke-interface {v4}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v10, "ETag"

    .line 74
    .line 75
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/util/List;

    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    if-nez v10, :cond_3

    .line 88
    .line 89
    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Ljava/lang/String;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :cond_3
    move-object v4, v2

    .line 100
    :goto_2
    cmp-long v10, v8, v5

    .line 101
    .line 102
    if-eqz v10, :cond_4

    .line 103
    .line 104
    add-long/2addr v8, v13

    .line 105
    iget-object v10, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 106
    .line 107
    iget-object v11, v10, Ldefpackage/hr3;->E:Landroid/os/Handler;

    .line 108
    .line 109
    new-instance v12, Ldefpackage/ar3;

    .line 110
    .line 111
    invoke-direct {v12, v10, v0}, Ldefpackage/ar3;-><init>(Ldefpackage/hr3;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v11, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 115
    .line 116
    .line 117
    :cond_4
    move-wide v15, v8

    .line 118
    iget-object v8, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 119
    .line 120
    iget-object v9, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 121
    .line 122
    iget-object v9, v9, Ldefpackage/yl4;->n:Ldefpackage/ci0;

    .line 123
    .line 124
    invoke-interface {v9}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-static {v9}, Ldefpackage/iv1;->d(Ljava/util/Map;)Ldefpackage/iv1;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    iput-object v9, v8, Ldefpackage/hr3;->G:Ldefpackage/iv1;

    .line 133
    .line 134
    iget-object v8, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 135
    .line 136
    iget-object v9, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 137
    .line 138
    iget-object v9, v9, Ldefpackage/hr3;->G:Ldefpackage/iv1;

    .line 139
    .line 140
    if-eqz v9, :cond_5

    .line 141
    .line 142
    iget v9, v9, Ldefpackage/iv1;->f:I

    .line 143
    .line 144
    const/4 v10, -0x1

    .line 145
    if-eq v9, v10, :cond_5

    .line 146
    .line 147
    new-instance v10, Ldefpackage/gv1;

    .line 148
    .line 149
    invoke-direct {v10, v8, v9, v1}, Ldefpackage/gv1;-><init>(Ldefpackage/ci0;ILdefpackage/er3;)V

    .line 150
    .line 151
    .line 152
    iget-object v8, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 153
    .line 154
    new-instance v9, Ldefpackage/gr3;

    .line 155
    .line 156
    invoke-direct {v9, v0, v7}, Ldefpackage/gr3;-><init>(IZ)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8, v9}, Ldefpackage/hr3;->D(Ldefpackage/gr3;)Ldefpackage/wv4;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    iput-object v8, v1, Ldefpackage/er3;->k:Ldefpackage/wv4;

    .line 164
    .line 165
    sget-object v9, Ldefpackage/hr3;->f0:Ldefpackage/tb1;

    .line 166
    .line 167
    invoke-interface {v8, v9}, Ldefpackage/wv4;->g(Ldefpackage/tb1;)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    move-object v10, v8

    .line 172
    :goto_3
    iget-object v9, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 173
    .line 174
    iget-object v11, v1, Ldefpackage/er3;->a:Landroid/net/Uri;

    .line 175
    .line 176
    iget-object v8, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 177
    .line 178
    iget-object v8, v8, Ldefpackage/yl4;->n:Ldefpackage/ci0;

    .line 179
    .line 180
    invoke-interface {v8}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 181
    .line 182
    .line 183
    move-result-object v12

    .line 184
    iget-object v8, v1, Ldefpackage/er3;->d:Ldefpackage/hr3;

    .line 185
    .line 186
    move-object/from16 v17, v8

    .line 187
    .line 188
    invoke-virtual/range {v9 .. v17}, Ldefpackage/z05;->h(Ldefpackage/ci0;Landroid/net/Uri;Ljava/util/Map;JJLdefpackage/hr3;)V

    .line 189
    .line 190
    .line 191
    iget-object v8, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 192
    .line 193
    iget-object v8, v8, Ldefpackage/hr3;->G:Ldefpackage/iv1;

    .line 194
    .line 195
    if-eqz v8, :cond_7

    .line 196
    .line 197
    iget-object v8, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 198
    .line 199
    iget-object v8, v8, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v8, Ldefpackage/k51;

    .line 202
    .line 203
    if-nez v8, :cond_6

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_6
    instance-of v9, v8, Ldefpackage/ky2;

    .line 207
    .line 208
    if-eqz v9, :cond_7

    .line 209
    .line 210
    check-cast v8, Ldefpackage/ky2;

    .line 211
    .line 212
    iput-boolean v7, v8, Ldefpackage/ky2;->s:Z

    .line 213
    .line 214
    :cond_7
    :goto_4
    iget-boolean v8, v1, Ldefpackage/er3;->h:Z

    .line 215
    .line 216
    if-eqz v8, :cond_8

    .line 217
    .line 218
    iget-object v8, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 219
    .line 220
    iget-wide v9, v1, Ldefpackage/er3;->i:J

    .line 221
    .line 222
    iget-object v8, v8, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v8, Ldefpackage/k51;

    .line 225
    .line 226
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-interface {v8, v13, v14, v9, v10}, Ldefpackage/k51;->d(JJ)V

    .line 230
    .line 231
    .line 232
    iput-boolean v0, v1, Ldefpackage/er3;->h:Z

    .line 233
    .line 234
    :cond_8
    :goto_5
    if-nez v3, :cond_9

    .line 235
    .line 236
    iget-boolean v8, v1, Ldefpackage/er3;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    .line 238
    if-nez v8, :cond_9

    .line 239
    .line 240
    :try_start_2
    iget-object v8, v1, Ldefpackage/er3;->e:Ldefpackage/q90;

    .line 241
    .line 242
    invoke-virtual {v8}, Ldefpackage/q90;->a()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    .line 244
    .line 245
    :try_start_3
    iget-object v8, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 246
    .line 247
    iget-object v9, v1, Ldefpackage/er3;->f:Ldefpackage/t71;

    .line 248
    .line 249
    iget-object v10, v8, Ldefpackage/z05;->p:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v10, Ldefpackage/k51;

    .line 252
    .line 253
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v8, v8, Ldefpackage/z05;->q:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v8, Ldefpackage/rk0;

    .line 259
    .line 260
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-interface {v10, v8, v9}, Ldefpackage/k51;->b(Ldefpackage/l51;Ldefpackage/t71;)I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    iget-object v8, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 268
    .line 269
    invoke-virtual {v8}, Ldefpackage/z05;->g()J

    .line 270
    .line 271
    .line 272
    move-result-wide v8

    .line 273
    iget-object v10, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 274
    .line 275
    iget-wide v10, v10, Ldefpackage/hr3;->w:J

    .line 276
    .line 277
    add-long/2addr v10, v13

    .line 278
    cmp-long v10, v8, v10

    .line 279
    .line 280
    if-lez v10, :cond_8

    .line 281
    .line 282
    iget-object v10, v1, Ldefpackage/er3;->e:Ldefpackage/q90;

    .line 283
    .line 284
    monitor-enter v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 285
    :try_start_4
    iput-boolean v0, v10, Ldefpackage/q90;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 286
    .line 287
    :try_start_5
    monitor-exit v10

    .line 288
    iget-object v10, v1, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 289
    .line 290
    iget-object v11, v10, Ldefpackage/hr3;->E:Landroid/os/Handler;

    .line 291
    .line 292
    iget-object v10, v10, Ldefpackage/hr3;->D:Ldefpackage/ar3;

    .line 293
    .line 294
    invoke-virtual {v11, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 295
    .line 296
    .line 297
    move-wide v13, v8

    .line 298
    goto :goto_5

    .line 299
    :catchall_1
    move-exception v0

    .line 300
    :try_start_6
    monitor-exit v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 301
    :try_start_7
    throw v0

    .line 302
    :catch_0
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 303
    .line 304
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 305
    .line 306
    .line 307
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 308
    :cond_9
    if-ne v3, v7, :cond_a

    .line 309
    .line 310
    move v3, v0

    .line 311
    goto :goto_6

    .line 312
    :cond_a
    iget-object v7, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 313
    .line 314
    invoke-virtual {v7}, Ldefpackage/z05;->g()J

    .line 315
    .line 316
    .line 317
    move-result-wide v7

    .line 318
    cmp-long v5, v7, v5

    .line 319
    .line 320
    if-eqz v5, :cond_b

    .line 321
    .line 322
    iget-object v5, v1, Ldefpackage/er3;->f:Ldefpackage/t71;

    .line 323
    .line 324
    iget-object v6, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 325
    .line 326
    invoke-virtual {v6}, Ldefpackage/z05;->g()J

    .line 327
    .line 328
    .line 329
    move-result-wide v6

    .line 330
    iput-wide v6, v5, Ldefpackage/t71;->a:J

    .line 331
    .line 332
    :cond_b
    :goto_6
    iget-object v5, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 333
    .line 334
    invoke-static {v5}, Ldefpackage/fu;->k(Ldefpackage/ci0;)V

    .line 335
    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :goto_7
    if-eq v3, v7, :cond_c

    .line 340
    .line 341
    iget-object v2, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 342
    .line 343
    invoke-virtual {v2}, Ldefpackage/z05;->g()J

    .line 344
    .line 345
    .line 346
    move-result-wide v2

    .line 347
    cmp-long v2, v2, v5

    .line 348
    .line 349
    if-eqz v2, :cond_c

    .line 350
    .line 351
    iget-object v2, v1, Ldefpackage/er3;->f:Ldefpackage/t71;

    .line 352
    .line 353
    iget-object v3, v1, Ldefpackage/er3;->c:Ldefpackage/z05;

    .line 354
    .line 355
    invoke-virtual {v3}, Ldefpackage/z05;->g()J

    .line 356
    .line 357
    .line 358
    move-result-wide v3

    .line 359
    iput-wide v3, v2, Ldefpackage/t71;->a:J

    .line 360
    .line 361
    :cond_c
    iget-object v1, v1, Ldefpackage/er3;->b:Ldefpackage/yl4;

    .line 362
    .line 363
    invoke-static {v1}, Ldefpackage/fu;->k(Ldefpackage/ci0;)V

    .line 364
    .line 365
    .line 366
    throw v0

    .line 367
    :cond_d
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/er3;->g:Z

    .line 3
    .line 4
    return-void
.end method

.method public final c(Ljava/lang/String;J)Ldefpackage/ii0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Ldefpackage/hr3;->e0:Ljava/util/Map;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v3, "W/"

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    invoke-static {}, Ldefpackage/bx1;->a()Ldefpackage/ue1;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v3, v2}, Ldefpackage/ue1;->y(Ljava/lang/Iterable;)Ldefpackage/ue1;

    .line 26
    .line 27
    .line 28
    const-string v2, "If-Range"

    .line 29
    .line 30
    invoke-virtual {v3, v2, v1}, Ldefpackage/ue1;->x(Ljava/lang/Object;Ljava/lang/Object;)Ldefpackage/ue1;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Ldefpackage/ue1;->f()Ldefpackage/bx1;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :cond_0
    move-object v9, v2

    .line 38
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 39
    .line 40
    iget-object v1, v0, Ldefpackage/er3;->m:Ldefpackage/hr3;

    .line 41
    .line 42
    iget-object v14, v1, Ldefpackage/hr3;->v:Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "The uri must be set."

    .line 45
    .line 46
    iget-object v4, v0, Ldefpackage/er3;->a:Landroid/net/Uri;

    .line 47
    .line 48
    invoke-static {v4, v1}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Ldefpackage/ii0;

    .line 52
    .line 53
    const-wide/16 v5, 0x0

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    const/4 v8, 0x0

    .line 57
    const-wide/16 v12, -0x1

    .line 58
    .line 59
    const/4 v15, 0x6

    .line 60
    move-wide/from16 v10, p2

    .line 61
    .line 62
    invoke-direct/range {v3 .. v15}, Ldefpackage/ii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    return-object v3
.end method
