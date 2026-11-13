.class public final Ldefpackage/vp3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/p82;


# instance fields
.field public final a:I

.field public final b:Ldefpackage/rm3;

.field public final c:Ldefpackage/if1;

.field public d:Ldefpackage/nc0;

.field public e:Ldefpackage/jn4;

.field public f:Ldefpackage/in4;

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Ljava/lang/Object;

.field public k:Z

.field public l:Ldefpackage/up3;

.field public m:Z

.field public n:J

.field public o:J

.field public p:J

.field public q:Z

.field public final synthetic r:Ldefpackage/ll;


# direct methods
.method public constructor <init>(Ldefpackage/ll;ILdefpackage/rm3;Ldefpackage/if1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/vp3;->r:Ldefpackage/ll;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/vp3;->a:I

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/vp3;->b:Ldefpackage/rm3;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/vp3;->c:Ldefpackage/if1;

    .line 11
    .line 12
    sget p1, Ldefpackage/hx2;->b:I

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    sget-wide p3, Ldefpackage/hx2;->a:J

    .line 19
    .line 20
    sub-long/2addr p1, p3

    .line 21
    iput-wide p1, p0, Ldefpackage/vp3;->p:J

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/vp3;->m:Z

    .line 3
    .line 4
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/in4;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/vp3;->e:Ldefpackage/jn4;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Ldefpackage/jn4;->a()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v0, p0, Ldefpackage/vp3;->e:Ldefpackage/jn4;

    .line 19
    .line 20
    iput-object v0, p0, Ldefpackage/vp3;->l:Ldefpackage/up3;

    .line 21
    .line 22
    return-void
.end method

.method public final c(Ldefpackage/yn4;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/vp3;->r:Ldefpackage/ll;

    .line 2
    .line 3
    iget-boolean v0, v0, Ldefpackage/ll;->o:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget-boolean v0, p0, Ldefpackage/vp3;->m:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const-string v0, "compose:lazy:prefetch:execute:urgent"

    .line 14
    .line 15
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0, p1}, Ldefpackage/vp3;->d(Ldefpackage/yn4;)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/vp3;->d(Ldefpackage/yn4;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    :goto_0
    const-string p1, "compose:lazy:prefetch:execute:item"

    .line 36
    .line 37
    const-wide/16 v0, -0x1

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, Ldefpackage/si0;->R(Ljava/lang/String;J)V

    .line 40
    .line 41
    .line 42
    return p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/vp3;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Ldefpackage/vp3;->h:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/vp3;->b()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d(Ldefpackage/yn4;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/vp3;->a:I

    .line 4
    .line 5
    int-to-long v2, v1

    .line 6
    const-string v4, "compose:lazy:prefetch:execute:item"

    .line 7
    .line 8
    invoke-static {v4, v2, v3}, Ldefpackage/si0;->R(Ljava/lang/String;J)V

    .line 9
    .line 10
    .line 11
    iget-object v5, v0, Ldefpackage/vp3;->r:Ldefpackage/ll;

    .line 12
    .line 13
    iget-object v5, v5, Ldefpackage/ll;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Ldefpackage/c82;

    .line 16
    .line 17
    iget-object v5, v5, Ldefpackage/c82;->b:Ldefpackage/wc;

    .line 18
    .line 19
    invoke-virtual {v5}, Ldefpackage/wc;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Ldefpackage/nc3;

    .line 24
    .line 25
    iget-boolean v6, v0, Ldefpackage/vp3;->h:Z

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    if-nez v6, :cond_24

    .line 29
    .line 30
    invoke-virtual {v5}, Ldefpackage/nc3;->b()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ltz v1, :cond_24

    .line 35
    .line 36
    if-ge v1, v6, :cond_24

    .line 37
    .line 38
    invoke-virtual {v5, v1}, Ldefpackage/nc3;->c(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v5, v0, Ldefpackage/vp3;->j:Ljava/lang/Object;

    .line 43
    .line 44
    if-eqz v5, :cond_0

    .line 45
    .line 46
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0}, Ldefpackage/vp3;->b()V

    .line 53
    .line 54
    .line 55
    return v7

    .line 56
    :cond_0
    iget-object v5, v0, Ldefpackage/vp3;->b:Ldefpackage/rm3;

    .line 57
    .line 58
    iget-object v6, v5, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v6, Ldefpackage/zn;

    .line 61
    .line 62
    const/4 v8, -0x1

    .line 63
    const/4 v9, 0x0

    .line 64
    if-eqz v6, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget-object v6, v5, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, Ldefpackage/w03;

    .line 70
    .line 71
    invoke-virtual {v6, v9}, Ldefpackage/w03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    if-nez v10, :cond_2

    .line 76
    .line 77
    new-instance v10, Ldefpackage/zn;

    .line 78
    .line 79
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    iput v8, v10, Ldefpackage/zn;->e:I

    .line 83
    .line 84
    invoke-virtual {v6, v9, v10}, Ldefpackage/w03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    move-object v6, v10

    .line 88
    check-cast v6, Ldefpackage/zn;

    .line 89
    .line 90
    iput-object v6, v5, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 91
    .line 92
    :goto_0
    invoke-virtual {v0}, Ldefpackage/vp3;->e()Z

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {p1 .. p1}, Ldefpackage/yn4;->a()J

    .line 96
    .line 97
    .line 98
    move-result-wide v10

    .line 99
    iput-wide v10, v0, Ldefpackage/vp3;->n:J

    .line 100
    .line 101
    sget v5, Ldefpackage/hx2;->b:I

    .line 102
    .line 103
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    sget-wide v14, Ldefpackage/hx2;->a:J

    .line 108
    .line 109
    sub-long/2addr v12, v14

    .line 110
    iput-wide v12, v0, Ldefpackage/vp3;->p:J

    .line 111
    .line 112
    const-wide/16 v12, 0x0

    .line 113
    .line 114
    iput-wide v12, v0, Ldefpackage/vp3;->o:J

    .line 115
    .line 116
    const-string v5, "compose:lazy:prefetch:available_time_nanos"

    .line 117
    .line 118
    invoke-static {v5, v10, v11}, Ldefpackage/si0;->R(Ljava/lang/String;J)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ldefpackage/vp3;->e()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    const/4 v10, 0x1

    .line 126
    if-nez v5, :cond_4

    .line 127
    .line 128
    iget-wide v14, v0, Ldefpackage/vp3;->n:J

    .line 129
    .line 130
    move-wide/from16 v16, v12

    .line 131
    .line 132
    iget-wide v12, v6, Ldefpackage/zn;->a:J

    .line 133
    .line 134
    iget-wide v7, v6, Ldefpackage/zn;->b:J

    .line 135
    .line 136
    add-long/2addr v12, v7

    .line 137
    invoke-virtual {v0, v14, v15, v12, v13}, Ldefpackage/vp3;->g(JJ)Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_3

    .line 142
    .line 143
    const-string v7, "compose:lazy:prefetch:compose"

    .line 144
    .line 145
    invoke-static {v7}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :try_start_0
    invoke-virtual {v0, v1, v6}, Ldefpackage/vp3;->f(Ljava/lang/Object;Ldefpackage/zn;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ldefpackage/vp3;->e()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_5

    .line 165
    .line 166
    goto/16 :goto_d

    .line 167
    .line 168
    :cond_4
    move-wide/from16 v16, v12

    .line 169
    .line 170
    :cond_5
    iget-object v1, v0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 171
    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    iget-wide v7, v0, Ldefpackage/vp3;->n:J

    .line 175
    .line 176
    iget-wide v12, v6, Ldefpackage/zn;->c:J

    .line 177
    .line 178
    invoke-virtual {v0, v7, v8, v12, v13}, Ldefpackage/vp3;->g(JJ)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_1c

    .line 183
    .line 184
    const-string v1, "compose:lazy:prefetch:apply"

    .line 185
    .line 186
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :try_start_1
    iget-object v1, v0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 190
    .line 191
    if-eqz v1, :cond_6

    .line 192
    .line 193
    invoke-interface {v1}, Ldefpackage/in4;->apply()Ldefpackage/jn4;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    iput-object v1, v0, Ldefpackage/vp3;->e:Ldefpackage/jn4;

    .line 198
    .line 199
    iput-object v9, v0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 200
    .line 201
    iput-boolean v10, v0, Ldefpackage/vp3;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 202
    .line 203
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ldefpackage/vp3;->h()V

    .line 207
    .line 208
    .line 209
    iget-wide v7, v0, Ldefpackage/vp3;->o:J

    .line 210
    .line 211
    iget-wide v12, v6, Ldefpackage/zn;->c:J

    .line 212
    .line 213
    invoke-static {v7, v8, v12, v13}, Ldefpackage/zn;->a(JJ)J

    .line 214
    .line 215
    .line 216
    move-result-wide v7

    .line 217
    iput-wide v7, v6, Ldefpackage/zn;->c:J

    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_6
    :try_start_2
    const-string v0, "Nothing to apply!"

    .line 221
    .line 222
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_7
    :goto_2
    iget-boolean v1, v0, Ldefpackage/vp3;->k:Z

    .line 234
    .line 235
    if-nez v1, :cond_a

    .line 236
    .line 237
    iget-wide v7, v0, Ldefpackage/vp3;->n:J

    .line 238
    .line 239
    cmp-long v1, v7, v16

    .line 240
    .line 241
    if-lez v1, :cond_1c

    .line 242
    .line 243
    const-string v1, "compose:lazy:prefetch:resolve-nested"

    .line 244
    .line 245
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :try_start_3
    iget-object v1, v0, Ldefpackage/vp3;->e:Ldefpackage/jn4;

    .line 249
    .line 250
    if-eqz v1, :cond_9

    .line 251
    .line 252
    new-instance v7, Ldefpackage/jx3;

    .line 253
    .line 254
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 255
    .line 256
    .line 257
    new-instance v8, Ldefpackage/ea;

    .line 258
    .line 259
    const/4 v12, 0x2

    .line 260
    invoke-direct {v8, v12, v7}, Ldefpackage/ea;-><init>(ILdefpackage/jx3;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v1, v8}, Ldefpackage/jn4;->b(Ldefpackage/ea;)V

    .line 264
    .line 265
    .line 266
    iget-object v1, v7, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v1, Ljava/util/List;

    .line 269
    .line 270
    if-eqz v1, :cond_8

    .line 271
    .line 272
    new-instance v7, Ldefpackage/up3;

    .line 273
    .line 274
    invoke-direct {v7, v0, v1}, Ldefpackage/up3;-><init>(Ldefpackage/vp3;Ljava/util/List;)V

    .line 275
    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_8
    :goto_3
    move-object v7, v9

    .line 279
    goto :goto_4

    .line 280
    :cond_9
    const-string v1, "Should precompose before resolving nested prefetch states"

    .line 281
    .line 282
    invoke-static {v1}, Ldefpackage/fz1;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Ldefpackage/er1;->a()V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :goto_4
    iput-object v7, v0, Ldefpackage/vp3;->l:Ldefpackage/up3;

    .line 290
    .line 291
    iput-boolean v10, v0, Ldefpackage/vp3;->k:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 292
    .line 293
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :catchall_2
    move-exception v0

    .line 298
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_a
    :goto_5
    iget-object v1, v0, Ldefpackage/vp3;->l:Ldefpackage/up3;

    .line 303
    .line 304
    if-eqz v1, :cond_16

    .line 305
    .line 306
    iget-boolean v7, v0, Ldefpackage/vp3;->m:Z

    .line 307
    .line 308
    iget-object v8, v1, Ldefpackage/up3;->b:[Ljava/util/List;

    .line 309
    .line 310
    iget v12, v1, Ldefpackage/up3;->c:I

    .line 311
    .line 312
    iget-object v13, v1, Ldefpackage/up3;->a:Ljava/util/List;

    .line 313
    .line 314
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 315
    .line 316
    .line 317
    move-result v14

    .line 318
    if-lt v12, v14, :cond_b

    .line 319
    .line 320
    goto/16 :goto_b

    .line 321
    .line 322
    :cond_b
    iget-object v12, v1, Ldefpackage/up3;->f:Ldefpackage/vp3;

    .line 323
    .line 324
    iget-boolean v12, v12, Ldefpackage/vp3;->h:Z

    .line 325
    .line 326
    if-eqz v12, :cond_c

    .line 327
    .line 328
    const-string v12, "Should not execute nested prefetch on canceled request"

    .line 329
    .line 330
    invoke-static {v12}, Ldefpackage/fz1;->c(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    :cond_c
    const-string v12, "compose:lazy:prefetch:update_nested_prefetch_count"

    .line 334
    .line 335
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    :try_start_4
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    const/4 v14, 0x0

    .line 343
    :goto_6
    if-ge v14, v12, :cond_d

    .line 344
    .line 345
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v15

    .line 349
    check-cast v15, Ldefpackage/q82;

    .line 350
    .line 351
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 352
    .line 353
    .line 354
    add-int/lit8 v14, v14, 0x1

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 358
    .line 359
    .line 360
    const-string v12, "compose:lazy:prefetch:nested"

    .line 361
    .line 362
    invoke-static {v12}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    :goto_7
    :try_start_5
    iget v12, v1, Ldefpackage/up3;->c:I

    .line 366
    .line 367
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 368
    .line 369
    .line 370
    move-result v14

    .line 371
    if-ge v12, v14, :cond_15

    .line 372
    .line 373
    iget v12, v1, Ldefpackage/up3;->c:I

    .line 374
    .line 375
    aget-object v12, v8, v12

    .line 376
    .line 377
    if-nez v12, :cond_10

    .line 378
    .line 379
    invoke-virtual/range {p1 .. p1}, Ldefpackage/yn4;->a()J

    .line 380
    .line 381
    .line 382
    move-result-wide v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 383
    cmp-long v12, v14, v16

    .line 384
    .line 385
    if-gtz v12, :cond_e

    .line 386
    .line 387
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 388
    .line 389
    .line 390
    return v10

    .line 391
    :cond_e
    :try_start_6
    iget v12, v1, Ldefpackage/up3;->c:I

    .line 392
    .line 393
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v14

    .line 397
    check-cast v14, Ldefpackage/q82;

    .line 398
    .line 399
    iget-object v15, v14, Ldefpackage/q82;->a:Ldefpackage/uc3;

    .line 400
    .line 401
    if-nez v15, :cond_f

    .line 402
    .line 403
    sget-object v14, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 404
    .line 405
    goto :goto_8

    .line 406
    :cond_f
    new-instance v5, Ldefpackage/o82;

    .line 407
    .line 408
    invoke-direct {v5, v14}, Ldefpackage/o82;-><init>(Ldefpackage/q82;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v15, v5}, Ldefpackage/uc3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    iget-object v5, v5, Ldefpackage/o82;->a:Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 417
    .line 418
    .line 419
    move-result v15

    .line 420
    iput v15, v14, Ldefpackage/q82;->e:I

    .line 421
    .line 422
    move-object v14, v5

    .line 423
    :goto_8
    aput-object v14, v8, v12

    .line 424
    .line 425
    :cond_10
    iget v5, v1, Ldefpackage/up3;->c:I

    .line 426
    .line 427
    aget-object v5, v8, v5

    .line 428
    .line 429
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    :goto_9
    iget v12, v1, Ldefpackage/up3;->d:I

    .line 433
    .line 434
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 435
    .line 436
    .line 437
    move-result v14

    .line 438
    if-ge v12, v14, :cond_14

    .line 439
    .line 440
    iget v12, v1, Ldefpackage/up3;->d:I

    .line 441
    .line 442
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v12

    .line 446
    check-cast v12, Ldefpackage/vp3;

    .line 447
    .line 448
    if-eqz v7, :cond_12

    .line 449
    .line 450
    if-eqz v12, :cond_11

    .line 451
    .line 452
    move-object v14, v12

    .line 453
    goto :goto_a

    .line 454
    :cond_11
    move-object v14, v9

    .line 455
    :goto_a
    if-eqz v14, :cond_12

    .line 456
    .line 457
    iput-boolean v10, v14, Ldefpackage/vp3;->m:Z

    .line 458
    .line 459
    :cond_12
    iput-boolean v10, v1, Ldefpackage/up3;->e:Z

    .line 460
    .line 461
    move-object/from16 v14, p1

    .line 462
    .line 463
    invoke-virtual {v12, v14}, Ldefpackage/vp3;->c(Ldefpackage/yn4;)Z

    .line 464
    .line 465
    .line 466
    move-result v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 467
    if-eqz v12, :cond_13

    .line 468
    .line 469
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 470
    .line 471
    .line 472
    return v10

    .line 473
    :cond_13
    :try_start_7
    iget v12, v1, Ldefpackage/up3;->d:I

    .line 474
    .line 475
    add-int/2addr v12, v10

    .line 476
    iput v12, v1, Ldefpackage/up3;->d:I

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_14
    move-object/from16 v14, p1

    .line 480
    .line 481
    const/4 v5, 0x0

    .line 482
    iput v5, v1, Ldefpackage/up3;->d:I

    .line 483
    .line 484
    iget v12, v1, Ldefpackage/up3;->c:I

    .line 485
    .line 486
    add-int/2addr v12, v10

    .line 487
    iput v12, v1, Ldefpackage/up3;->c:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 488
    .line 489
    goto :goto_7

    .line 490
    :cond_15
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 491
    .line 492
    .line 493
    goto :goto_b

    .line 494
    :catchall_3
    move-exception v0

    .line 495
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 496
    .line 497
    .line 498
    throw v0

    .line 499
    :catchall_4
    move-exception v0

    .line 500
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 501
    .line 502
    .line 503
    throw v0

    .line 504
    :cond_16
    :goto_b
    iget-object v1, v0, Ldefpackage/vp3;->l:Ldefpackage/up3;

    .line 505
    .line 506
    if-eqz v1, :cond_17

    .line 507
    .line 508
    iget-boolean v1, v1, Ldefpackage/up3;->e:Z

    .line 509
    .line 510
    if-ne v1, v10, :cond_17

    .line 511
    .line 512
    invoke-virtual {v0}, Ldefpackage/vp3;->h()V

    .line 513
    .line 514
    .line 515
    invoke-static {v4, v2, v3}, Ldefpackage/si0;->R(Ljava/lang/String;J)V

    .line 516
    .line 517
    .line 518
    iget-object v1, v0, Ldefpackage/vp3;->l:Ldefpackage/up3;

    .line 519
    .line 520
    if-eqz v1, :cond_17

    .line 521
    .line 522
    const/4 v5, 0x0

    .line 523
    iput-boolean v5, v1, Ldefpackage/up3;->e:Z

    .line 524
    .line 525
    :cond_17
    iget-object v1, v0, Ldefpackage/vp3;->d:Ldefpackage/nc0;

    .line 526
    .line 527
    iget-boolean v2, v0, Ldefpackage/vp3;->g:Z

    .line 528
    .line 529
    if-nez v2, :cond_1d

    .line 530
    .line 531
    if-eqz v1, :cond_1d

    .line 532
    .line 533
    iget-wide v2, v0, Ldefpackage/vp3;->n:J

    .line 534
    .line 535
    iget-wide v7, v6, Ldefpackage/zn;->d:J

    .line 536
    .line 537
    invoke-virtual {v0, v2, v3, v7, v8}, Ldefpackage/vp3;->g(JJ)Z

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    if-eqz v2, :cond_1c

    .line 542
    .line 543
    const-string v2, "compose:lazy:prefetch:measure"

    .line 544
    .line 545
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    :try_start_8
    iget-wide v1, v1, Ldefpackage/nc0;->a:J

    .line 549
    .line 550
    iget-boolean v3, v0, Ldefpackage/vp3;->h:Z

    .line 551
    .line 552
    if-eqz v3, :cond_18

    .line 553
    .line 554
    const-string v3, "Callers should check whether the request is still valid before calling performMeasure()"

    .line 555
    .line 556
    invoke-static {v3}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    :cond_18
    iget-boolean v3, v0, Ldefpackage/vp3;->g:Z

    .line 560
    .line 561
    if-eqz v3, :cond_19

    .line 562
    .line 563
    const-string v3, "Request was already measured!"

    .line 564
    .line 565
    invoke-static {v3}, Ldefpackage/fz1;->a(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    :cond_19
    iput-boolean v10, v0, Ldefpackage/vp3;->g:Z

    .line 569
    .line 570
    iget-object v3, v0, Ldefpackage/vp3;->e:Ldefpackage/jn4;

    .line 571
    .line 572
    if-eqz v3, :cond_1a

    .line 573
    .line 574
    invoke-interface {v3}, Ldefpackage/jn4;->c()I

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    const/4 v7, 0x0

    .line 579
    :goto_c
    if-ge v7, v4, :cond_1b

    .line 580
    .line 581
    invoke-interface {v3, v7, v1, v2}, Ldefpackage/jn4;->d(IJ)V

    .line 582
    .line 583
    .line 584
    add-int/lit8 v7, v7, 0x1

    .line 585
    .line 586
    goto :goto_c

    .line 587
    :cond_1a
    const-string v1, "performComposition() must be called before performMeasure()"

    .line 588
    .line 589
    invoke-static {v1}, Ldefpackage/fz1;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 590
    .line 591
    .line 592
    invoke-static {}, Ldefpackage/er1;->a()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 593
    .line 594
    .line 595
    :cond_1b
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0}, Ldefpackage/vp3;->h()V

    .line 599
    .line 600
    .line 601
    iget-wide v1, v0, Ldefpackage/vp3;->o:J

    .line 602
    .line 603
    iget-wide v3, v6, Ldefpackage/zn;->d:J

    .line 604
    .line 605
    invoke-static {v1, v2, v3, v4}, Ldefpackage/zn;->a(JJ)J

    .line 606
    .line 607
    .line 608
    move-result-wide v1

    .line 609
    iput-wide v1, v6, Ldefpackage/zn;->d:J

    .line 610
    .line 611
    iget-object v1, v0, Ldefpackage/vp3;->c:Ldefpackage/if1;

    .line 612
    .line 613
    if-eqz v1, :cond_1d

    .line 614
    .line 615
    invoke-interface {v1, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    goto :goto_e

    .line 619
    :catchall_5
    move-exception v0

    .line 620
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 621
    .line 622
    .line 623
    throw v0

    .line 624
    :cond_1c
    :goto_d
    return v10

    .line 625
    :cond_1d
    :goto_e
    iget-object v1, v0, Ldefpackage/vp3;->l:Ldefpackage/up3;

    .line 626
    .line 627
    iget-boolean v2, v0, Ldefpackage/vp3;->g:Z

    .line 628
    .line 629
    if-eqz v2, :cond_23

    .line 630
    .line 631
    iget-boolean v0, v0, Ldefpackage/vp3;->k:Z

    .line 632
    .line 633
    if-eqz v0, :cond_23

    .line 634
    .line 635
    if-eqz v1, :cond_23

    .line 636
    .line 637
    iget-object v0, v1, Ldefpackage/up3;->a:Ljava/util/List;

    .line 638
    .line 639
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    const v2, 0x7fffffff

    .line 644
    .line 645
    .line 646
    move v4, v2

    .line 647
    const/4 v3, 0x0

    .line 648
    :goto_f
    if-ge v3, v1, :cond_1e

    .line 649
    .line 650
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    check-cast v7, Ldefpackage/q82;

    .line 655
    .line 656
    iget v7, v7, Ldefpackage/q82;->d:I

    .line 657
    .line 658
    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    add-int/lit8 v3, v3, 0x1

    .line 663
    .line 664
    goto :goto_f

    .line 665
    :cond_1e
    if-ne v4, v2, :cond_1f

    .line 666
    .line 667
    const/4 v4, 0x0

    .line 668
    :cond_1f
    iget v1, v6, Ldefpackage/zn;->e:I

    .line 669
    .line 670
    const/4 v11, -0x1

    .line 671
    if-ne v1, v11, :cond_20

    .line 672
    .line 673
    move v1, v4

    .line 674
    goto :goto_10

    .line 675
    :cond_20
    mul-int/lit8 v1, v1, 0x3

    .line 676
    .line 677
    add-int/2addr v1, v4

    .line 678
    div-int/lit8 v1, v1, 0x4

    .line 679
    .line 680
    :goto_10
    iput v1, v6, Ldefpackage/zn;->e:I

    .line 681
    .line 682
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 683
    .line 684
    .line 685
    move-result v1

    .line 686
    move v7, v2

    .line 687
    const/4 v3, 0x0

    .line 688
    :goto_11
    if-ge v3, v1, :cond_21

    .line 689
    .line 690
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    check-cast v8, Ldefpackage/q82;

    .line 695
    .line 696
    iget v8, v8, Ldefpackage/q82;->e:I

    .line 697
    .line 698
    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    .line 699
    .line 700
    .line 701
    move-result v7

    .line 702
    add-int/lit8 v3, v3, 0x1

    .line 703
    .line 704
    goto :goto_11

    .line 705
    :cond_21
    if-ne v7, v2, :cond_22

    .line 706
    .line 707
    const/4 v7, 0x0

    .line 708
    :cond_22
    if-ge v7, v4, :cond_23

    .line 709
    .line 710
    move-wide/from16 v0, v16

    .line 711
    .line 712
    iput-wide v0, v6, Ldefpackage/zn;->d:J

    .line 713
    .line 714
    const/4 v5, 0x0

    .line 715
    return v5

    .line 716
    :cond_23
    const/4 v5, 0x0

    .line 717
    return v5

    .line 718
    :cond_24
    move v5, v7

    .line 719
    invoke-virtual {v0}, Ldefpackage/vp3;->b()V

    .line 720
    .line 721
    .line 722
    return v5
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/vp3;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0}, Ldefpackage/in4;->d()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    return v1
.end method

.method public final f(Ljava/lang/Object;Ldefpackage/zn;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/vp3;->r:Ldefpackage/ll;

    .line 6
    .line 7
    iget-object v1, v0, Ldefpackage/ll;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/c82;

    .line 10
    .line 11
    iget v2, p0, Ldefpackage/vp3;->a:I

    .line 12
    .line 13
    invoke-virtual {v1, v2, p1}, Ldefpackage/c82;->a(ILjava/lang/Object;)Ldefpackage/wf1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v0, v0, Ldefpackage/ll;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ldefpackage/kn4;

    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/kn4;->a()Ldefpackage/o72;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v2, v0, Ldefpackage/o72;->n:Ldefpackage/c72;

    .line 26
    .line 27
    invoke-virtual {v2}, Ldefpackage/c72;->G()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/16 v3, 0xc

    .line 32
    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    new-instance v1, Ldefpackage/xc5;

    .line 36
    .line 37
    invoke-direct {v1, v3, v0, p1}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    move-object v0, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0, p1, v1, v2}, Ldefpackage/o72;->k(Ljava/lang/Object;Ldefpackage/wf1;Z)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ldefpackage/hd5;

    .line 47
    .line 48
    invoke-direct {v1, v3, v0, p1}, Ldefpackage/hd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    iput-object v0, p0, Ldefpackage/vp3;->f:Ldefpackage/in4;

    .line 53
    .line 54
    iput-object p1, p0, Ldefpackage/vp3;->j:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_1
    const/4 p1, 0x0

    .line 57
    iput-boolean p1, p0, Ldefpackage/vp3;->q:Z

    .line 58
    .line 59
    :goto_2
    invoke-interface {v0}, Ldefpackage/in4;->d()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    iget-boolean p1, p0, Ldefpackage/vp3;->q:Z

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    new-instance p1, Ldefpackage/bt2;

    .line 70
    .line 71
    invoke-direct {p1, p0, p2}, Ldefpackage/bt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, p1}, Ldefpackage/in4;->e(Ldefpackage/bt2;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-virtual {p0}, Ldefpackage/vp3;->h()V

    .line 79
    .line 80
    .line 81
    iget-boolean p1, p0, Ldefpackage/vp3;->q:Z

    .line 82
    .line 83
    iget-wide v0, p0, Ldefpackage/vp3;->o:J

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    iget-wide p0, p2, Ldefpackage/zn;->b:J

    .line 88
    .line 89
    invoke-static {v0, v1, p0, p1}, Ldefpackage/zn;->a(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide p0

    .line 93
    iput-wide p0, p2, Ldefpackage/zn;->b:J

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    iget-wide p0, p2, Ldefpackage/zn;->a:J

    .line 97
    .line 98
    invoke-static {v0, v1, p0, p1}, Ldefpackage/zn;->a(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide p0

    .line 102
    iput-wide p0, p2, Ldefpackage/zn;->a:J

    .line 103
    .line 104
    return-void
.end method

.method public final g(JJ)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/vp3;->m:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-wide/16 p3, 0x0

    .line 6
    .line 7
    :cond_0
    cmp-long p0, p1, p3

    .line 8
    .line 9
    if-lez p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final h()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Ldefpackage/hx2;->b:I

    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-wide v3, Ldefpackage/hx2;->a:J

    .line 10
    .line 11
    sub-long/2addr v1, v3

    .line 12
    iget-wide v3, v0, Ldefpackage/vp3;->p:J

    .line 13
    .line 14
    const-wide/16 v5, 0x1

    .line 15
    .line 16
    sub-long v7, v3, v5

    .line 17
    .line 18
    or-long/2addr v7, v5

    .line 19
    const-wide v9, 0x7fffffffffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long v7, v7, v9

    .line 25
    .line 26
    const-wide/32 v11, 0xf4240

    .line 27
    .line 28
    .line 29
    const/4 v8, 0x1

    .line 30
    const-wide/16 v13, 0x0

    .line 31
    .line 32
    if-nez v7, :cond_2

    .line 33
    .line 34
    cmp-long v5, v1, v3

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    sget-object v3, Ldefpackage/mx0;->n:Ldefpackage/om0;

    .line 39
    .line 40
    :goto_0
    move v7, v8

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    cmp-long v3, v3, v13

    .line 44
    .line 45
    if-gez v3, :cond_1

    .line 46
    .line 47
    sget-wide v3, Ldefpackage/mx0;->p:J

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sget-wide v3, Ldefpackage/mx0;->o:J

    .line 51
    .line 52
    :goto_1
    shr-long v5, v3, v8

    .line 53
    .line 54
    neg-long v5, v5

    .line 55
    long-to-int v3, v3

    .line 56
    and-int/2addr v3, v8

    .line 57
    shl-long v4, v5, v8

    .line 58
    .line 59
    int-to-long v6, v3

    .line 60
    add-long v13, v4, v6

    .line 61
    .line 62
    sget v3, Ldefpackage/nx0;->a:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sub-long v15, v1, v5

    .line 66
    .line 67
    or-long/2addr v5, v15

    .line 68
    cmp-long v5, v5, v9

    .line 69
    .line 70
    if-nez v5, :cond_4

    .line 71
    .line 72
    cmp-long v3, v1, v13

    .line 73
    .line 74
    if-gez v3, :cond_3

    .line 75
    .line 76
    sget-wide v3, Ldefpackage/mx0;->p:J

    .line 77
    .line 78
    :goto_2
    move-wide v13, v3

    .line 79
    goto :goto_0

    .line 80
    :cond_3
    sget-wide v3, Ldefpackage/mx0;->o:J

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    sub-long v5, v1, v3

    .line 84
    .line 85
    xor-long v15, v5, v1

    .line 86
    .line 87
    move v7, v8

    .line 88
    xor-long v8, v5, v3

    .line 89
    .line 90
    not-long v8, v8

    .line 91
    and-long/2addr v8, v15

    .line 92
    cmp-long v8, v8, v13

    .line 93
    .line 94
    sget-object v9, Ldefpackage/ox0;->o:Ldefpackage/ox0;

    .line 95
    .line 96
    if-gez v8, :cond_7

    .line 97
    .line 98
    sget-object v8, Ldefpackage/ox0;->p:Ldefpackage/ox0;

    .line 99
    .line 100
    invoke-virtual {v9, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-gez v10, :cond_5

    .line 105
    .line 106
    div-long v5, v1, v11

    .line 107
    .line 108
    div-long v13, v3, v11

    .line 109
    .line 110
    sub-long/2addr v5, v13

    .line 111
    rem-long v13, v1, v11

    .line 112
    .line 113
    rem-long/2addr v3, v11

    .line 114
    sub-long/2addr v13, v3

    .line 115
    sget-object v3, Ldefpackage/mx0;->n:Ldefpackage/om0;

    .line 116
    .line 117
    invoke-static {v5, v6, v8}, Ldefpackage/e35;->W(JLdefpackage/ox0;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v3

    .line 121
    invoke-static {v13, v14, v9}, Ldefpackage/e35;->W(JLdefpackage/ox0;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v5

    .line 125
    invoke-static {v3, v4, v5, v6}, Ldefpackage/mx0;->b(JJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide v13

    .line 129
    goto :goto_4

    .line 130
    :cond_5
    cmp-long v3, v5, v13

    .line 131
    .line 132
    if-gez v3, :cond_6

    .line 133
    .line 134
    sget-wide v3, Ldefpackage/mx0;->p:J

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    sget-wide v3, Ldefpackage/mx0;->o:J

    .line 138
    .line 139
    :goto_3
    shr-long v5, v3, v7

    .line 140
    .line 141
    neg-long v5, v5

    .line 142
    long-to-int v3, v3

    .line 143
    and-int/2addr v3, v7

    .line 144
    shl-long v4, v5, v7

    .line 145
    .line 146
    int-to-long v8, v3

    .line 147
    add-long v13, v4, v8

    .line 148
    .line 149
    sget v3, Ldefpackage/nx0;->a:I

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    invoke-static {v5, v6, v9}, Ldefpackage/e35;->W(JLdefpackage/ox0;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v13

    .line 156
    :goto_4
    shr-long v3, v13, v7

    .line 157
    .line 158
    sget-object v5, Ldefpackage/mx0;->n:Ldefpackage/om0;

    .line 159
    .line 160
    long-to-int v5, v13

    .line 161
    and-int/2addr v5, v7

    .line 162
    if-nez v5, :cond_8

    .line 163
    .line 164
    move-wide v9, v3

    .line 165
    goto :goto_5

    .line 166
    :cond_8
    const-wide v5, 0x8637bd05af6L

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    cmp-long v5, v3, v5

    .line 172
    .line 173
    if-lez v5, :cond_9

    .line 174
    .line 175
    const-wide v9, 0x7fffffffffffffffL

    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_9
    const-wide v5, -0x8637bd05af6L

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    cmp-long v5, v3, v5

    .line 187
    .line 188
    if-gez v5, :cond_a

    .line 189
    .line 190
    const-wide/high16 v9, -0x8000000000000000L

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_a
    mul-long v9, v3, v11

    .line 194
    .line 195
    :goto_5
    iput-wide v9, v0, Ldefpackage/vp3;->o:J

    .line 196
    .line 197
    iget-wide v3, v0, Ldefpackage/vp3;->n:J

    .line 198
    .line 199
    sub-long/2addr v3, v9

    .line 200
    iput-wide v3, v0, Ldefpackage/vp3;->n:J

    .line 201
    .line 202
    iput-wide v1, v0, Ldefpackage/vp3;->p:J

    .line 203
    .line 204
    const-string v0, "compose:lazy:prefetch:available_time_nanos"

    .line 205
    .line 206
    invoke-static {v0, v3, v4}, Ldefpackage/si0;->R(Ljava/lang/String;J)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/vp3;->d:Ldefpackage/nc0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/vp3;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-boolean v2, p0, Ldefpackage/vp3;->g:Z

    .line 8
    .line 9
    iget-boolean v3, p0, Ldefpackage/vp3;->h:Z

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v5, "HandleAndRequestImpl { index = "

    .line 14
    .line 15
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget p0, p0, Ldefpackage/vp3;->a:I

    .line 19
    .line 20
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, ", constraints = "

    .line 24
    .line 25
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", isComposed = "

    .line 32
    .line 33
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, ", isMeasured = "

    .line 40
    .line 41
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, ", isCanceled = "

    .line 48
    .line 49
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, " }"

    .line 56
    .line 57
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
