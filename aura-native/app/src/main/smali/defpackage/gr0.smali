.class public final Ldefpackage/gr0;
.super Ldefpackage/ar4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 10
    iput p3, p0, Ldefpackage/gr0;->e:I

    iput-object p1, p0, Ldefpackage/gr0;->f:Ljava/lang/Object;

    invoke-direct {p0, p2}, Ldefpackage/ar4;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ldefpackage/gf1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ldefpackage/gr0;->e:I

    .line 3
    .line 4
    iput-object p2, p0, Ldefpackage/gr0;->f:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Ldefpackage/ar4;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/gr0;->e:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const-wide/16 v4, -0x1

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/gr0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ldefpackage/gf1;

    .line 15
    .line 16
    invoke-interface {v0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-wide v4

    .line 20
    :pswitch_0
    iget-object v0, v0, Ldefpackage/gr0;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ldefpackage/dv3;

    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    iget-object v1, v0, Ldefpackage/dv3;->c:Ljava/util/Map;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-nez v9, :cond_10

    .line 43
    .line 44
    iget-object v8, v0, Ldefpackage/dv3;->f:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 45
    .line 46
    invoke-virtual {v8}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    if-eqz v9, :cond_2

    .line 55
    .line 56
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    check-cast v9, Ldefpackage/cv3;

    .line 61
    .line 62
    iget-object v9, v9, Ldefpackage/cv3;->d:Ldefpackage/o34;

    .line 63
    .line 64
    iget-object v9, v9, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 65
    .line 66
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-nez v9, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 74
    .line 75
    .line 76
    :cond_1
    :goto_1
    const-wide/16 v4, 0x0

    .line 77
    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_2
    iget-wide v8, v0, Ldefpackage/dv3;->b:J

    .line 81
    .line 82
    sub-long v8, v6, v8

    .line 83
    .line 84
    const-wide/16 v12, 0x1

    .line 85
    .line 86
    add-long/2addr v8, v12

    .line 87
    iget-object v12, v0, Ldefpackage/dv3;->f:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 88
    .line 89
    invoke-virtual {v12}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v12

    .line 93
    const/4 v13, 0x0

    .line 94
    const-wide v14, 0x7fffffffffffffffL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    move-object/from16 v18, v13

    .line 100
    .line 101
    move-wide/from16 v16, v14

    .line 102
    .line 103
    move-wide v14, v8

    .line 104
    move-object/from16 v9, v18

    .line 105
    .line 106
    move v8, v3

    .line 107
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v19

    .line 111
    if-eqz v19, :cond_7

    .line 112
    .line 113
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v19

    .line 117
    move-wide/from16 v20, v4

    .line 118
    .line 119
    move-object/from16 v4, v19

    .line 120
    .line 121
    check-cast v4, Ldefpackage/cv3;

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    monitor-enter v4

    .line 127
    :try_start_0
    invoke-virtual {v0, v4, v6, v7}, Ldefpackage/dv3;->a(Ldefpackage/cv3;J)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-lez v5, :cond_3

    .line 132
    .line 133
    add-int/lit8 v8, v8, 0x1

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    iget-wide v10, v4, Ldefpackage/cv3;->t:J

    .line 137
    .line 138
    cmp-long v5, v10, v14

    .line 139
    .line 140
    if-gez v5, :cond_4

    .line 141
    .line 142
    move-object v9, v4

    .line 143
    move-wide v14, v10

    .line 144
    :cond_4
    iget-object v5, v4, Ldefpackage/cv3;->d:Ldefpackage/o34;

    .line 145
    .line 146
    iget-object v5, v5, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 147
    .line 148
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    if-nez v5, :cond_6

    .line 153
    .line 154
    add-int/lit8 v3, v3, 0x1

    .line 155
    .line 156
    cmp-long v5, v10, v16

    .line 157
    .line 158
    if-gez v5, :cond_5

    .line 159
    .line 160
    move-object/from16 v18, v4

    .line 161
    .line 162
    move-wide/from16 v16, v10

    .line 163
    .line 164
    :cond_5
    :goto_3
    monitor-exit v4

    .line 165
    move-wide/from16 v4, v20

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_6
    :try_start_1
    new-instance v0, Ljava/lang/ClassCastException;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 171
    .line 172
    .line 173
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    monitor-exit v4

    .line 176
    throw v0

    .line 177
    :cond_7
    move-wide/from16 v20, v4

    .line 178
    .line 179
    if-eqz v9, :cond_8

    .line 180
    .line 181
    move-object v13, v9

    .line 182
    goto :goto_4

    .line 183
    :cond_8
    const/4 v4, 0x5

    .line 184
    if-le v3, v4, :cond_9

    .line 185
    .line 186
    move-wide/from16 v14, v16

    .line 187
    .line 188
    move-object/from16 v13, v18

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_9
    move-wide/from16 v14, v20

    .line 192
    .line 193
    :goto_4
    if-eqz v13, :cond_d

    .line 194
    .line 195
    monitor-enter v13

    .line 196
    :try_start_2
    iget-object v3, v13, Ldefpackage/cv3;->s:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    if-nez v3, :cond_a

    .line 203
    .line 204
    monitor-exit v13

    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_a
    :try_start_3
    iget-wide v3, v13, Ldefpackage/cv3;->t:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 208
    .line 209
    cmp-long v3, v3, v14

    .line 210
    .line 211
    if-eqz v3, :cond_b

    .line 212
    .line 213
    monitor-exit v13

    .line 214
    goto/16 :goto_1

    .line 215
    .line 216
    :cond_b
    :try_start_4
    iput-boolean v2, v13, Ldefpackage/cv3;->m:Z

    .line 217
    .line 218
    iget-object v2, v0, Ldefpackage/dv3;->f:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 219
    .line 220
    invoke-virtual {v2, v13}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 221
    .line 222
    .line 223
    monitor-exit v13

    .line 224
    iget-object v2, v13, Ldefpackage/cv3;->d:Ldefpackage/o34;

    .line 225
    .line 226
    iget-object v2, v2, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 227
    .line 228
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-nez v1, :cond_c

    .line 233
    .line 234
    iget-object v1, v13, Ldefpackage/cv3;->f:Ljava/net/Socket;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-static {v1}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 240
    .line 241
    .line 242
    iget-object v1, v0, Ldefpackage/dv3;->f:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 243
    .line 244
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_1

    .line 249
    .line 250
    iget-object v0, v0, Ldefpackage/dv3;->d:Ldefpackage/fr4;

    .line 251
    .line 252
    invoke-virtual {v0}, Ldefpackage/fr4;->a()V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :cond_c
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :catchall_1
    move-exception v0

    .line 263
    monitor-exit v13

    .line 264
    throw v0

    .line 265
    :cond_d
    if-eqz v18, :cond_e

    .line 266
    .line 267
    iget-wide v0, v0, Ldefpackage/dv3;->b:J

    .line 268
    .line 269
    add-long v16, v16, v0

    .line 270
    .line 271
    sub-long v4, v16, v6

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_e
    if-lez v8, :cond_f

    .line 275
    .line 276
    iget-wide v4, v0, Ldefpackage/dv3;->b:J

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_f
    move-wide/from16 v4, v20

    .line 280
    .line 281
    :goto_5
    return-wide v4

    .line 282
    :cond_10
    invoke-static {v8}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    throw v0

    .line 287
    :pswitch_1
    move-wide/from16 v20, v4

    .line 288
    .line 289
    iget-object v0, v0, Ldefpackage/gr0;->f:Ljava/lang/Object;

    .line 290
    .line 291
    move-object v1, v0

    .line 292
    check-cast v1, Ldefpackage/jr0;

    .line 293
    .line 294
    monitor-enter v1

    .line 295
    :try_start_5
    iget-boolean v0, v1, Ldefpackage/jr0;->z:Z

    .line 296
    .line 297
    if-eqz v0, :cond_14

    .line 298
    .line 299
    iget-boolean v0, v1, Ldefpackage/jr0;->A:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 300
    .line 301
    if-eqz v0, :cond_11

    .line 302
    .line 303
    goto :goto_8

    .line 304
    :cond_11
    :try_start_6
    invoke-virtual {v1}, Ldefpackage/jr0;->M()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :catchall_2
    move-exception v0

    .line 309
    goto :goto_a

    .line 310
    :catch_0
    :try_start_7
    iput-boolean v2, v1, Ldefpackage/jr0;->B:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 311
    .line 312
    :goto_6
    :try_start_8
    invoke-virtual {v1}, Ldefpackage/jr0;->s()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_13

    .line 317
    .line 318
    invoke-virtual {v1}, Ldefpackage/jr0;->J()V

    .line 319
    .line 320
    .line 321
    iput v3, v1, Ldefpackage/jr0;->w:I
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :catch_1
    :try_start_9
    iput-boolean v2, v1, Ldefpackage/jr0;->C:Z

    .line 325
    .line 326
    iget-object v0, v1, Ldefpackage/jr0;->u:Ldefpackage/wu3;

    .line 327
    .line 328
    if-eqz v0, :cond_12

    .line 329
    .line 330
    invoke-static {v0}, Ldefpackage/xe5;->b(Ljava/io/Closeable;)V

    .line 331
    .line 332
    .line 333
    :cond_12
    new-instance v0, Ldefpackage/ct;

    .line 334
    .line 335
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 336
    .line 337
    .line 338
    new-instance v2, Ldefpackage/wu3;

    .line 339
    .line 340
    invoke-direct {v2, v0}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V

    .line 341
    .line 342
    .line 343
    iput-object v2, v1, Ldefpackage/jr0;->u:Ldefpackage/wu3;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 344
    .line 345
    :cond_13
    :goto_7
    monitor-exit v1

    .line 346
    goto :goto_9

    .line 347
    :cond_14
    :goto_8
    monitor-exit v1

    .line 348
    :goto_9
    return-wide v20

    .line 349
    :goto_a
    monitor-exit v1

    .line 350
    throw v0

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
