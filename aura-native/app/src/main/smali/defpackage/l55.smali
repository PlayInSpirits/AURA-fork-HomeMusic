.class public final Ldefpackage/l55;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/gp3;

.field public final b:Ldefpackage/e55;

.field public final c:Ldefpackage/pu;

.field public final d:Ldefpackage/tu;

.field public final e:Ldefpackage/tu;

.field public final f:Ldefpackage/uu;

.field public final g:Ldefpackage/f55;

.field public h:J

.field public i:J

.field public j:J

.field public k:Ldefpackage/s55;

.field public l:J


# direct methods
.method public constructor <init>(Ldefpackage/gp3;Ldefpackage/e55;Ldefpackage/f55;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/l55;->a:Ldefpackage/gp3;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/l55;->b:Ldefpackage/e55;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/l55;->g:Ldefpackage/f55;

    .line 9
    .line 10
    new-instance p1, Ldefpackage/pu;

    .line 11
    .line 12
    invoke-direct {p1}, Ldefpackage/pu;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/l55;->c:Ldefpackage/pu;

    .line 16
    .line 17
    new-instance p1, Ldefpackage/tu;

    .line 18
    .line 19
    invoke-direct {p1}, Ldefpackage/tu;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/l55;->d:Ldefpackage/tu;

    .line 23
    .line 24
    new-instance p1, Ldefpackage/tu;

    .line 25
    .line 26
    invoke-direct {p1}, Ldefpackage/tu;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/l55;->e:Ldefpackage/tu;

    .line 30
    .line 31
    new-instance p1, Ldefpackage/uu;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x10

    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    const/4 v0, 0x1

    .line 43
    if-eq p3, v0, :cond_0

    .line 44
    .line 45
    const/16 p2, 0xf

    .line 46
    .line 47
    invoke-static {p2}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    shl-int/2addr p2, v0

    .line 52
    :cond_0
    const/4 p3, 0x0

    .line 53
    iput p3, p1, Ldefpackage/uu;->n:I

    .line 54
    .line 55
    const/4 v1, -0x1

    .line 56
    iput v1, p1, Ldefpackage/uu;->o:I

    .line 57
    .line 58
    iput p3, p1, Ldefpackage/uu;->p:I

    .line 59
    .line 60
    new-array p3, p2, [J

    .line 61
    .line 62
    iput-object p3, p1, Ldefpackage/uu;->r:Ljava/lang/Object;

    .line 63
    .line 64
    sub-int/2addr p2, v0

    .line 65
    iput p2, p1, Ldefpackage/uu;->q:I

    .line 66
    .line 67
    iput-object p1, p0, Ldefpackage/l55;->f:Ldefpackage/uu;

    .line 68
    .line 69
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    iput-wide p1, p0, Ldefpackage/l55;->h:J

    .line 75
    .line 76
    sget-object p3, Ldefpackage/s55;->d:Ldefpackage/s55;

    .line 77
    .line 78
    iput-object p3, p0, Ldefpackage/l55;->k:Ldefpackage/s55;

    .line 79
    .line 80
    iput-wide p1, p0, Ldefpackage/l55;->i:J

    .line 81
    .line 82
    iput-wide p1, p0, Ldefpackage/l55;->j:J

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/l55;->a:Ldefpackage/gp3;

    .line 4
    .line 5
    iget-object v2, v1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ldefpackage/tn0;

    .line 8
    .line 9
    :goto_0
    iget-object v3, v0, Ldefpackage/l55;->f:Ldefpackage/uu;

    .line 10
    .line 11
    iget v4, v3, Ldefpackage/uu;->p:I

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    if-eqz v4, :cond_d

    .line 17
    .line 18
    iget-object v4, v3, Ldefpackage/uu;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, [J

    .line 21
    .line 22
    iget v5, v3, Ldefpackage/uu;->n:I

    .line 23
    .line 24
    aget-wide v7, v4, v5

    .line 25
    .line 26
    iget-object v4, v0, Ldefpackage/l55;->e:Ldefpackage/tu;

    .line 27
    .line 28
    invoke-virtual {v4, v7, v8}, Ldefpackage/tu;->f(J)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Long;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    iget-object v6, v0, Ldefpackage/l55;->b:Ldefpackage/e55;

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 40
    .line 41
    .line 42
    move-result-wide v9

    .line 43
    iget-wide v11, v0, Ldefpackage/l55;->l:J

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-eqz v9, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    iput-wide v9, v0, Ldefpackage/l55;->l:J

    .line 54
    .line 55
    invoke-virtual {v6, v5}, Ldefpackage/e55;->e(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-wide v13, v0, Ldefpackage/l55;->l:J

    .line 59
    .line 60
    const/4 v15, 0x0

    .line 61
    const/16 v16, 0x0

    .line 62
    .line 63
    move-object v4, v6

    .line 64
    iget-object v6, v0, Ldefpackage/l55;->b:Ldefpackage/e55;

    .line 65
    .line 66
    iget-object v9, v0, Ldefpackage/l55;->c:Ldefpackage/pu;

    .line 67
    .line 68
    move-wide/from16 v11, p3

    .line 69
    .line 70
    move-object/from16 v17, v9

    .line 71
    .line 72
    move-wide/from16 v9, p1

    .line 73
    .line 74
    invoke-virtual/range {v6 .. v17}, Ldefpackage/e55;->a(JJJJZZLdefpackage/pu;)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    move-object/from16 v9, v17

    .line 79
    .line 80
    const/4 v10, 0x4

    .line 81
    const/4 v11, 0x5

    .line 82
    if-eq v6, v11, :cond_2

    .line 83
    .line 84
    if-eq v6, v10, :cond_2

    .line 85
    .line 86
    iget-object v12, v0, Ldefpackage/l55;->g:Ldefpackage/f55;

    .line 87
    .line 88
    iget-wide v13, v9, Ldefpackage/pu;->a:J

    .line 89
    .line 90
    invoke-virtual {v12, v7, v8, v13, v14}, Ldefpackage/f55;->a(JJ)V

    .line 91
    .line 92
    .line 93
    :cond_2
    const/4 v12, 0x3

    .line 94
    const/4 v13, 0x0

    .line 95
    const/4 v14, 0x1

    .line 96
    if-eqz v6, :cond_6

    .line 97
    .line 98
    if-eq v6, v14, :cond_6

    .line 99
    .line 100
    if-eq v6, v5, :cond_5

    .line 101
    .line 102
    if-eq v6, v12, :cond_5

    .line 103
    .line 104
    if-eq v6, v10, :cond_4

    .line 105
    .line 106
    if-ne v6, v11, :cond_3

    .line 107
    .line 108
    return-void

    .line 109
    :cond_3
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_4
    iput-wide v7, v0, Ldefpackage/l55;->i:J

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_5
    iput-wide v7, v0, Ldefpackage/l55;->i:J

    .line 121
    .line 122
    invoke-virtual {v3}, Ldefpackage/uu;->a()J

    .line 123
    .line 124
    .line 125
    iget-object v3, v2, Ldefpackage/tn0;->i:Ljava/util/concurrent/Executor;

    .line 126
    .line 127
    new-instance v4, Ldefpackage/sn0;

    .line 128
    .line 129
    invoke-direct {v4, v1, v14}, Ldefpackage/sn0;-><init>(Ldefpackage/gp3;I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 133
    .line 134
    .line 135
    iget-object v3, v2, Ldefpackage/tn0;->d:Ljava/util/ArrayDeque;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Ldefpackage/lk2;

    .line 142
    .line 143
    iget-object v4, v3, Ldefpackage/lk2;->c:Ldefpackage/ok2;

    .line 144
    .line 145
    iget-object v5, v3, Ldefpackage/lk2;->a:Ldefpackage/ak2;

    .line 146
    .line 147
    iget v3, v3, Ldefpackage/lk2;->b:I

    .line 148
    .line 149
    const-string v6, "dropVideoBuffer"

    .line 150
    .line 151
    invoke-static {v6}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v5, v3}, Ldefpackage/ak2;->g(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v13, v14}, Ldefpackage/ok2;->S0(II)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_6
    iput-wide v7, v0, Ldefpackage/l55;->i:J

    .line 166
    .line 167
    if-nez v6, :cond_7

    .line 168
    .line 169
    move v5, v14

    .line 170
    goto :goto_1

    .line 171
    :cond_7
    move v5, v13

    .line 172
    :goto_1
    invoke-virtual {v3}, Ldefpackage/uu;->a()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    iget-object v3, v0, Ldefpackage/l55;->d:Ldefpackage/tu;

    .line 177
    .line 178
    invoke-virtual {v3, v6, v7}, Ldefpackage/tu;->f(J)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ldefpackage/s55;

    .line 183
    .line 184
    if-eqz v3, :cond_8

    .line 185
    .line 186
    sget-object v8, Ldefpackage/s55;->d:Ldefpackage/s55;

    .line 187
    .line 188
    invoke-virtual {v3, v8}, Ldefpackage/s55;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v8

    .line 192
    if-nez v8, :cond_8

    .line 193
    .line 194
    iget-object v8, v0, Ldefpackage/l55;->k:Ldefpackage/s55;

    .line 195
    .line 196
    invoke-virtual {v3, v8}, Ldefpackage/s55;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    if-nez v8, :cond_8

    .line 201
    .line 202
    iput-object v3, v0, Ldefpackage/l55;->k:Ldefpackage/s55;

    .line 203
    .line 204
    new-instance v8, Ldefpackage/sb1;

    .line 205
    .line 206
    invoke-direct {v8}, Ldefpackage/sb1;-><init>()V

    .line 207
    .line 208
    .line 209
    iget v10, v3, Ldefpackage/s55;->a:I

    .line 210
    .line 211
    iput v10, v8, Ldefpackage/sb1;->t:I

    .line 212
    .line 213
    iget v10, v3, Ldefpackage/s55;->b:I

    .line 214
    .line 215
    iput v10, v8, Ldefpackage/sb1;->u:I

    .line 216
    .line 217
    const-string v10, "video/raw"

    .line 218
    .line 219
    invoke-static {v10}, Ldefpackage/lw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    iput-object v10, v8, Ldefpackage/sb1;->m:Ljava/lang/String;

    .line 224
    .line 225
    new-instance v10, Ldefpackage/tb1;

    .line 226
    .line 227
    invoke-direct {v10, v8}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 228
    .line 229
    .line 230
    iput-object v10, v1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 231
    .line 232
    iget-object v8, v2, Ldefpackage/tn0;->i:Ljava/util/concurrent/Executor;

    .line 233
    .line 234
    new-instance v10, Ldefpackage/k6;

    .line 235
    .line 236
    const/16 v11, 0x15

    .line 237
    .line 238
    invoke-direct {v10, v11, v1, v3}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-interface {v8, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 242
    .line 243
    .line 244
    :cond_8
    if-eqz v5, :cond_9

    .line 245
    .line 246
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 247
    .line 248
    .line 249
    move-result-wide v8

    .line 250
    :goto_2
    move-wide/from16 v18, v8

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :cond_9
    iget-wide v8, v9, Ldefpackage/pu;->b:J

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :goto_3
    iget v3, v4, Ldefpackage/e55;->e:I

    .line 257
    .line 258
    if-eq v3, v12, :cond_a

    .line 259
    .line 260
    goto :goto_4

    .line 261
    :cond_a
    move v14, v13

    .line 262
    :goto_4
    iput v12, v4, Ldefpackage/e55;->e:I

    .line 263
    .line 264
    iget-object v3, v4, Ldefpackage/e55;->l:Ldefpackage/vp4;

    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 270
    .line 271
    .line 272
    move-result-wide v8

    .line 273
    invoke-static {v8, v9}, Ldefpackage/f35;->Q(J)J

    .line 274
    .line 275
    .line 276
    move-result-wide v8

    .line 277
    iput-wide v8, v4, Ldefpackage/e55;->g:J

    .line 278
    .line 279
    if-eqz v14, :cond_b

    .line 280
    .line 281
    iget-object v3, v2, Ldefpackage/tn0;->e:Landroid/view/Surface;

    .line 282
    .line 283
    if-eqz v3, :cond_b

    .line 284
    .line 285
    iget-object v3, v2, Ldefpackage/tn0;->i:Ljava/util/concurrent/Executor;

    .line 286
    .line 287
    new-instance v4, Ldefpackage/sn0;

    .line 288
    .line 289
    invoke-direct {v4, v1, v13}, Ldefpackage/sn0;-><init>(Ldefpackage/gp3;I)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 293
    .line 294
    .line 295
    :cond_b
    iget-object v3, v1, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v3, Ldefpackage/tb1;

    .line 298
    .line 299
    if-nez v3, :cond_c

    .line 300
    .line 301
    new-instance v3, Ldefpackage/sb1;

    .line 302
    .line 303
    invoke-direct {v3}, Ldefpackage/sb1;-><init>()V

    .line 304
    .line 305
    .line 306
    new-instance v4, Ldefpackage/tb1;

    .line 307
    .line 308
    invoke-direct {v4, v3}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v20, v4

    .line 312
    .line 313
    goto :goto_5

    .line 314
    :cond_c
    move-object/from16 v20, v3

    .line 315
    .line 316
    :goto_5
    iget-object v15, v2, Ldefpackage/tn0;->j:Ldefpackage/c55;

    .line 317
    .line 318
    const/16 v21, 0x0

    .line 319
    .line 320
    move-wide/from16 v16, v6

    .line 321
    .line 322
    invoke-interface/range {v15 .. v21}, Ldefpackage/c55;->d(JJLdefpackage/tb1;Landroid/media/MediaFormat;)V

    .line 323
    .line 324
    .line 325
    move-wide/from16 v8, v18

    .line 326
    .line 327
    iget-object v3, v2, Ldefpackage/tn0;->d:Ljava/util/ArrayDeque;

    .line 328
    .line 329
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->remove()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    check-cast v3, Ldefpackage/lk2;

    .line 334
    .line 335
    iget-object v4, v3, Ldefpackage/lk2;->c:Ldefpackage/ok2;

    .line 336
    .line 337
    iget-object v5, v3, Ldefpackage/lk2;->a:Ldefpackage/ak2;

    .line 338
    .line 339
    iget v3, v3, Ldefpackage/lk2;->b:I

    .line 340
    .line 341
    invoke-virtual {v4, v5, v3, v8, v9}, Ldefpackage/ok2;->N0(Ldefpackage/ak2;IJ)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :cond_d
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 347
    .line 348
    .line 349
    return-void
.end method
