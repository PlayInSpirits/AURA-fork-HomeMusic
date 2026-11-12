.class public final Landroidx/work/impl/workers/ConstraintTrackingWorker;
.super Landroidx/work/CoroutineWorker;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final g:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 11
    .line 12
    return-void
.end method

.method public static final e(Landroidx/work/impl/workers/ConstraintTrackingWorker;Loc2;Lc52;Ldd5;Lwd0;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p4, Lbc0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p4

    .line 9
    check-cast v0, Lbc0;

    .line 10
    .line 11
    iget v1, v0, Lbc0;->p:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lbc0;->p:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lbc0;

    .line 24
    .line 25
    invoke-direct {v0, p0, p4}, Lbc0;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lwd0;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p0, v0, Lbc0;->n:Ljava/lang/Object;

    .line 29
    .line 30
    iget p4, v0, Lbc0;->p:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz p4, :cond_2

    .line 35
    .line 36
    if-ne p4, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    invoke-static {p0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, Lcc0;

    .line 52
    .line 53
    invoke-direct {p0, p1, p2, p3, v1}, Lcc0;-><init>(Loc2;Lc52;Ldd5;Lvd0;)V

    .line 54
    .line 55
    .line 56
    iput v2, v0, Lbc0;->p:I

    .line 57
    .line 58
    invoke-static {p0, v0}, Lte5;->j(Lwf1;Lvd0;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    sget-object p1, Lxe0;->n:Lxe0;

    .line 63
    .line 64
    if-ne p0, p1, :cond_3

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    return-object p0
.end method

.method public static final f(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lwd0;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 6
    .line 7
    iget-object v3, v1, Loc2;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v4, v1, Loc2;->b:Landroidx/work/WorkerParameters;

    .line 10
    .line 11
    instance-of v5, v0, Ldc0;

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    move-object v5, v0

    .line 16
    check-cast v5, Ldc0;

    .line 17
    .line 18
    iget v6, v5, Ldc0;->r:I

    .line 19
    .line 20
    const/high16 v7, -0x80000000

    .line 21
    .line 22
    and-int v8, v6, v7

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    sub-int/2addr v6, v7

    .line 27
    iput v6, v5, Ldc0;->r:I

    .line 28
    .line 29
    :goto_0
    move-object v7, v5

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    new-instance v5, Ldc0;

    .line 32
    .line 33
    invoke-direct {v5, v1, v0}, Ldc0;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lwd0;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v0, v7, Ldc0;->p:Ljava/lang/Object;

    .line 38
    .line 39
    iget v5, v7, Ldc0;->r:I

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/4 v9, 0x1

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    if-ne v5, v9, :cond_1

    .line 46
    .line 47
    iget-object v1, v7, Ldc0;->o:Loc2;

    .line 48
    .line 49
    iget-object v2, v7, Ldc0;->n:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 50
    .line 51
    :try_start_0
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    move-object v15, v2

    .line 55
    move-object v2, v1

    .line 56
    move-object v1, v15

    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    move-object v15, v2

    .line 61
    move-object v2, v1

    .line 62
    move-object v1, v15

    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v8

    .line 71
    :cond_2
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v4, Landroidx/work/WorkerParameters;->b:Loh0;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v0, v0, Loh0;->a:Ljava/util/HashMap;

    .line 80
    .line 81
    const-string v5, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 82
    .line 83
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    instance-of v5, v0, Ljava/lang/String;

    .line 88
    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    check-cast v0, Ljava/lang/String;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    move-object v0, v8

    .line 95
    :goto_2
    const-string v5, "No worker to delegate to."

    .line 96
    .line 97
    if-eqz v0, :cond_e

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_4

    .line 104
    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_4
    invoke-static {v3}, Lsc5;->b(Landroid/content/Context;)Lsc5;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v10, v6, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 112
    .line 113
    invoke-virtual {v10}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    iget-object v11, v4, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 118
    .line 119
    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10, v11}, Lfd5;->h(Ljava/lang/String;)Ldd5;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    if-nez v10, :cond_5

    .line 131
    .line 132
    new-instance v0, Lkc2;

    .line 133
    .line 134
    invoke-direct {v0}, Lkc2;-><init>()V

    .line 135
    .line 136
    .line 137
    return-object v0

    .line 138
    :cond_5
    new-instance v11, Lc52;

    .line 139
    .line 140
    iget-object v12, v6, Lsc5;->j:Lz40;

    .line 141
    .line 142
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-direct {v11, v12}, Lc52;-><init>(Lz40;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11, v10}, Lc52;->c(Ldd5;)Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-nez v12, :cond_6

    .line 153
    .line 154
    sget-object v1, Lic0;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {}, Lcx;->f()Lcx;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    new-instance v3, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v4, "Constraints not met for delegate "

    .line 163
    .line 164
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, ". Requesting retry."

    .line 171
    .line 172
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v2, v1, v0}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    new-instance v0, Llc2;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_6
    sget-object v12, Lic0;->a:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {}, Lcx;->f()Lcx;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    const-string v14, "Constraints met for delegate "

    .line 195
    .line 196
    invoke-virtual {v14, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v14

    .line 200
    invoke-virtual {v13, v12, v14}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :try_start_1
    iget-object v4, v4, Landroidx/work/WorkerParameters;->f:Lfz0;

    .line 204
    .line 205
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v3, v0, v2}, Lfz0;->g(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Loc2;

    .line 209
    .line 210
    .line 211
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 212
    iget-object v0, v2, Landroidx/work/WorkerParameters;->e:Lbq4;

    .line 213
    .line 214
    iget-object v0, v0, Lbq4;->q:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lvc5;

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    :try_start_2
    invoke-static {v0}, Lkb4;->w(Ljava/util/concurrent/Executor;)Lpe0;

    .line 222
    .line 223
    .line 224
    move-result-object v12

    .line 225
    new-instance v0, Lx70;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 226
    .line 227
    const/4 v5, 0x0

    .line 228
    const/4 v6, 0x2

    .line 229
    move-object v2, v3

    .line 230
    move-object v4, v10

    .line 231
    move-object v3, v11

    .line 232
    :try_start_3
    invoke-direct/range {v0 .. v6}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 233
    .line 234
    .line 235
    iput-object v1, v7, Ldc0;->n:Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 236
    .line 237
    iput-object v2, v7, Ldc0;->o:Loc2;

    .line 238
    .line 239
    iput v9, v7, Ldc0;->r:I

    .line 240
    .line 241
    invoke-static {v12, v0, v7}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 245
    sget-object v3, Lxe0;->n:Lxe0;

    .line 246
    .line 247
    if-ne v0, v3, :cond_7

    .line 248
    .line 249
    return-object v3

    .line 250
    :cond_7
    :goto_3
    :try_start_4
    check-cast v0, Lnc2;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1

    .line 251
    .line 252
    return-object v0

    .line 253
    :catch_1
    move-exception v0

    .line 254
    goto :goto_4

    .line 255
    :catch_2
    move-exception v0

    .line 256
    move-object v2, v3

    .line 257
    :goto_4
    invoke-virtual {v1}, Loc2;->b()Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-nez v3, :cond_8

    .line 262
    .line 263
    instance-of v3, v0, Lzb0;

    .line 264
    .line 265
    if-eqz v3, :cond_b

    .line 266
    .line 267
    :cond_8
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 268
    .line 269
    const/16 v4, 0x1f

    .line 270
    .line 271
    if-ge v3, v4, :cond_9

    .line 272
    .line 273
    const/16 v1, -0x200

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_9
    invoke-virtual {v1}, Loc2;->b()Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_a

    .line 281
    .line 282
    iget-object v1, v1, Loc2;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 283
    .line 284
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    goto :goto_5

    .line 289
    :cond_a
    instance-of v1, v0, Lzb0;

    .line 290
    .line 291
    if-eqz v1, :cond_d

    .line 292
    .line 293
    move-object v1, v0

    .line 294
    check-cast v1, Lzb0;

    .line 295
    .line 296
    iget v1, v1, Lzb0;->n:I

    .line 297
    .line 298
    :goto_5
    iget-object v2, v2, Loc2;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 299
    .line 300
    const/16 v3, -0x100

    .line 301
    .line 302
    invoke-virtual {v2, v3, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 303
    .line 304
    .line 305
    :cond_b
    instance-of v1, v0, Lzb0;

    .line 306
    .line 307
    if-eqz v1, :cond_c

    .line 308
    .line 309
    new-instance v0, Llc2;

    .line 310
    .line 311
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :cond_c
    throw v0

    .line 316
    :cond_d
    const-string v0, "Unreachable"

    .line 317
    .line 318
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-object v8

    .line 322
    :catchall_0
    sget-object v0, Lic0;->a:Ljava/lang/String;

    .line 323
    .line 324
    invoke-static {}, Lcx;->f()Lcx;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    invoke-virtual {v1, v0, v5}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, v6, Lsc5;->b:Lr90;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance v0, Lkc2;

    .line 337
    .line 338
    invoke-direct {v0}, Lkc2;-><init>()V

    .line 339
    .line 340
    .line 341
    :goto_6
    return-object v0

    .line 342
    :cond_e
    :goto_7
    sget-object v0, Lic0;->a:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {}, Lcx;->f()Lcx;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v1, v0, v5}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Lkc2;

    .line 352
    .line 353
    invoke-direct {v0}, Lkc2;-><init>()V

    .line 354
    .line 355
    .line 356
    return-object v0
.end method


# virtual methods
.method public final d(Lbf0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Loc2;->b:Landroidx/work/WorkerParameters;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lkb4;->w(Ljava/util/concurrent/Executor;)Lpe0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lac0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, p0, v2, v3}, Lac0;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p1}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
