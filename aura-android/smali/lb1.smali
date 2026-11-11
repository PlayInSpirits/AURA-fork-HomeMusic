.class public final Llb1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final r:Ljava/lang/String;

.field public static final s:J


# instance fields
.field public final n:Landroid/content/Context;

.field public final o:Lsc5;

.field public final p:Lrv1;

.field public q:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Llb1;->r:Ljava/lang/String;

    .line 8
    .line 9
    const-wide v0, 0x496cebb800L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sput-wide v0, Llb1;->s:J

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lsc5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Llb1;->n:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Llb1;->o:Lsc5;

    .line 11
    .line 12
    iget-object p1, p2, Lsc5;->g:Lrv1;

    .line 13
    .line 14
    iput-object p1, p0, Llb1;->p:Lrv1;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Llb1;->q:I

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, Llb1;->s:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "last_force_stop_ms"

    .line 4
    .line 5
    iget-object v2, v0, Llb1;->p:Lrv1;

    .line 6
    .line 7
    iget-object v3, v0, Llb1;->o:Lsc5;

    .line 8
    .line 9
    iget-object v4, v3, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    iget-object v5, v3, Lsc5;->b:Lr90;

    .line 12
    .line 13
    iget-object v6, v3, Lsc5;->g:Lrv1;

    .line 14
    .line 15
    iget-object v7, v3, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 16
    .line 17
    sget-object v8, Ldq4;->s:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, v0, Llb1;->n:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v0}, Lw22;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    invoke-static {v0, v8}, Ldq4;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->x()Lbq4;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v11, 0x0

    .line 37
    const-string v12, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 38
    .line 39
    invoke-static {v11, v12}, Lw24;->b(ILjava/lang/String;)Lw24;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    iget-object v10, v10, Lbq4;->n:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 46
    .line 47
    invoke-virtual {v10}, Ls24;->b()V

    .line 48
    .line 49
    .line 50
    invoke-static {v10, v12}, Lxl;->H(Ls24;Lwo4;)Landroid/database/Cursor;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    :try_start_0
    new-instance v13, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    .line 57
    .line 58
    .line 59
    move-result v14

    .line 60
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 64
    .line 65
    .line 66
    move-result v14

    .line 67
    if-eqz v14, :cond_0

    .line 68
    .line 69
    invoke-interface {v10, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_12

    .line 79
    .line 80
    :cond_0
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12}, Lw24;->j()V

    .line 84
    .line 85
    .line 86
    if-eqz v9, :cond_1

    .line 87
    .line 88
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v10, v11

    .line 94
    :goto_1
    new-instance v12, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v12, v10}, Ljava/util/HashSet;-><init>(I)V

    .line 97
    .line 98
    .line 99
    if-eqz v9, :cond_3

    .line 100
    .line 101
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-nez v10, :cond_3

    .line 106
    .line 107
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    move v14, v11

    .line 112
    :goto_2
    if-ge v14, v10, :cond_3

    .line 113
    .line 114
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v15

    .line 118
    add-int/lit8 v14, v14, 0x1

    .line 119
    .line 120
    check-cast v15, Landroid/app/job/JobInfo;

    .line 121
    .line 122
    invoke-static {v15}, Ldq4;->f(Landroid/app/job/JobInfo;)Lrc5;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    if-eqz v11, :cond_2

    .line 127
    .line 128
    iget-object v11, v11, Lrc5;->a:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_2
    invoke-virtual {v15}, Landroid/app/job/JobInfo;->getId()I

    .line 135
    .line 136
    .line 137
    move-result v11

    .line 138
    invoke-static {v8, v11}, Ldq4;->a(Landroid/app/job/JobScheduler;I)V

    .line 139
    .line 140
    .line 141
    :goto_3
    const/4 v11, 0x0

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    const/4 v9, 0x0

    .line 148
    :cond_4
    if-ge v9, v8, :cond_5

    .line 149
    .line 150
    invoke-virtual {v13, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    add-int/lit8 v9, v9, 0x1

    .line 155
    .line 156
    check-cast v11, Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v12, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    if-nez v11, :cond_4

    .line 163
    .line 164
    invoke-static {}, Lcx;->f()Lcx;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    sget-object v9, Ldq4;->s:Ljava/lang/String;

    .line 169
    .line 170
    const-string v11, "Reconciling jobs"

    .line 171
    .line 172
    invoke-virtual {v8, v9, v11}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 v8, 0x1

    .line 176
    goto :goto_4

    .line 177
    :cond_5
    const/4 v8, 0x0

    .line 178
    :goto_4
    const-wide/16 v11, -0x1

    .line 179
    .line 180
    if-eqz v8, :cond_7

    .line 181
    .line 182
    invoke-virtual {v4}, Ls24;->c()V

    .line 183
    .line 184
    .line 185
    :try_start_1
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 190
    .line 191
    .line 192
    move-result v14

    .line 193
    const/4 v15, 0x0

    .line 194
    :goto_5
    if-ge v15, v14, :cond_6

    .line 195
    .line 196
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v16

    .line 200
    add-int/lit8 v15, v15, 0x1

    .line 201
    .line 202
    move-object/from16 v10, v16

    .line 203
    .line 204
    check-cast v10, Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v9, v10, v11, v12}, Lfd5;->j(Ljava/lang/String;J)V

    .line 207
    .line 208
    .line 209
    goto :goto_5

    .line 210
    :catchall_1
    move-exception v0

    .line 211
    goto :goto_6

    .line 212
    :cond_6
    invoke-virtual {v4}, Ls24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4}, Ls24;->o()V

    .line 216
    .line 217
    .line 218
    goto :goto_7

    .line 219
    :goto_6
    invoke-virtual {v4}, Ls24;->o()V

    .line 220
    .line 221
    .line 222
    throw v0

    .line 223
    :cond_7
    :goto_7
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->z()Lyc5;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-virtual {v7}, Ls24;->c()V

    .line 232
    .line 233
    .line 234
    :try_start_2
    invoke-virtual {v4}, Lfd5;->e()Ljava/util/ArrayList;

    .line 235
    .line 236
    .line 237
    move-result-object v10

    .line 238
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    if-nez v13, :cond_8

    .line 243
    .line 244
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    const/4 v15, 0x0

    .line 249
    :goto_8
    if-ge v15, v14, :cond_8

    .line 250
    .line 251
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v16

    .line 255
    add-int/lit8 v15, v15, 0x1

    .line 256
    .line 257
    move-object/from16 v11, v16

    .line 258
    .line 259
    check-cast v11, Ldd5;

    .line 260
    .line 261
    iget-object v11, v11, Ldd5;->a:Ljava/lang/String;

    .line 262
    .line 263
    const/4 v12, 0x1

    .line 264
    invoke-virtual {v4, v12, v11}, Lfd5;->n(ILjava/lang/String;)V

    .line 265
    .line 266
    .line 267
    const/16 v12, -0x200

    .line 268
    .line 269
    invoke-virtual {v4, v12, v11}, Lfd5;->o(ILjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    move/from16 v16, v13

    .line 273
    .line 274
    const-wide/16 v12, -0x1

    .line 275
    .line 276
    invoke-virtual {v4, v11, v12, v13}, Lfd5;->j(Ljava/lang/String;J)V

    .line 277
    .line 278
    .line 279
    move-wide v11, v12

    .line 280
    move/from16 v13, v16

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :catchall_2
    move-exception v0

    .line 284
    goto/16 :goto_11

    .line 285
    .line 286
    :cond_8
    move/from16 v16, v13

    .line 287
    .line 288
    iget-object v4, v9, Lyc5;->n:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v4, Landroidx/work/impl/WorkDatabase_Impl;

    .line 291
    .line 292
    invoke-virtual {v4}, Ls24;->b()V

    .line 293
    .line 294
    .line 295
    iget-object v9, v9, Lyc5;->p:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v9, Laq4;

    .line 298
    .line 299
    invoke-virtual {v9}, Lrx1;->a()Ldf1;

    .line 300
    .line 301
    .line 302
    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 303
    :try_start_3
    invoke-virtual {v4}, Ls24;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 304
    .line 305
    .line 306
    :try_start_4
    invoke-virtual {v10}, Ldf1;->b()I

    .line 307
    .line 308
    .line 309
    invoke-virtual {v4}, Ls24;->t()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 310
    .line 311
    .line 312
    :try_start_5
    invoke-virtual {v4}, Ls24;->o()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 313
    .line 314
    .line 315
    :try_start_6
    invoke-virtual {v9, v10}, Lrx1;->h(Ldf1;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7}, Ls24;->t()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 319
    .line 320
    .line 321
    invoke-virtual {v7}, Ls24;->o()V

    .line 322
    .line 323
    .line 324
    if-eqz v16, :cond_a

    .line 325
    .line 326
    if-eqz v8, :cond_9

    .line 327
    .line 328
    goto :goto_9

    .line 329
    :cond_9
    const/4 v10, 0x0

    .line 330
    goto :goto_a

    .line 331
    :cond_a
    :goto_9
    const/4 v10, 0x1

    .line 332
    :goto_a
    iget-object v4, v6, Lrv1;->a:Landroidx/work/impl/WorkDatabase;

    .line 333
    .line 334
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->w()Lgp3;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    const-string v8, "reschedule_needed"

    .line 339
    .line 340
    invoke-virtual {v4, v8}, Lgp3;->l(Ljava/lang/String;)Ljava/lang/Long;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    const-wide/16 v11, 0x0

    .line 345
    .line 346
    sget-object v9, Llb1;->r:Ljava/lang/String;

    .line 347
    .line 348
    if-eqz v4, :cond_b

    .line 349
    .line 350
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 351
    .line 352
    .line 353
    move-result-wide v13

    .line 354
    const-wide/16 v15, 0x1

    .line 355
    .line 356
    cmp-long v4, v13, v15

    .line 357
    .line 358
    if-nez v4, :cond_b

    .line 359
    .line 360
    invoke-static {}, Lcx;->f()Lcx;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const-string v1, "Rescheduling Workers."

    .line 365
    .line 366
    invoke-virtual {v0, v9, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3}, Lsc5;->d()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    new-instance v0, Lfp3;

    .line 376
    .line 377
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-direct {v0, v8, v1}, Lfp3;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 382
    .line 383
    .line 384
    iget-object v1, v6, Lrv1;->a:Landroidx/work/impl/WorkDatabase;

    .line 385
    .line 386
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->w()Lgp3;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v1, v0}, Lgp3;->n(Lfp3;)V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :cond_b
    :try_start_7
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 395
    .line 396
    const/16 v6, 0x1f

    .line 397
    .line 398
    if-lt v4, v6, :cond_c

    .line 399
    .line 400
    const/high16 v6, 0x22000000

    .line 401
    .line 402
    goto :goto_b

    .line 403
    :cond_c
    const/high16 v6, 0x20000000

    .line 404
    .line 405
    :goto_b
    new-instance v8, Landroid/content/Intent;

    .line 406
    .line 407
    invoke-direct {v8}, Landroid/content/Intent;-><init>()V

    .line 408
    .line 409
    .line 410
    new-instance v13, Landroid/content/ComponentName;

    .line 411
    .line 412
    const-class v14, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 413
    .line 414
    invoke-direct {v13, v0, v14}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v8, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 418
    .line 419
    .line 420
    const-string v13, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 421
    .line 422
    invoke-virtual {v8, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 423
    .line 424
    .line 425
    const/4 v13, -0x1

    .line 426
    invoke-static {v0, v13, v8, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    const/16 v8, 0x1e

    .line 431
    .line 432
    if-lt v4, v8, :cond_10

    .line 433
    .line 434
    if-eqz v6, :cond_d

    .line 435
    .line 436
    invoke-virtual {v6}, Landroid/app/PendingIntent;->cancel()V

    .line 437
    .line 438
    .line 439
    goto :goto_c

    .line 440
    :catch_0
    move-exception v0

    .line 441
    goto :goto_e

    .line 442
    :catch_1
    move-exception v0

    .line 443
    goto :goto_e

    .line 444
    :cond_d
    :goto_c
    const-string v4, "activity"

    .line 445
    .line 446
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    check-cast v0, Landroid/app/ActivityManager;

    .line 451
    .line 452
    invoke-static {v0}, Ll3;->r(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    if-eqz v0, :cond_11

    .line 457
    .line 458
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    if-nez v4, :cond_11

    .line 463
    .line 464
    iget-object v4, v2, Lrv1;->a:Landroidx/work/impl/WorkDatabase;

    .line 465
    .line 466
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->w()Lgp3;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    invoke-virtual {v4, v1}, Lgp3;->l(Ljava/lang/String;)Ljava/lang/Long;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    if-eqz v4, :cond_e

    .line 475
    .line 476
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 477
    .line 478
    .line 479
    move-result-wide v11

    .line 480
    :cond_e
    const/4 v4, 0x0

    .line 481
    :goto_d
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    if-ge v4, v6, :cond_11

    .line 486
    .line 487
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v6

    .line 491
    invoke-static {v6}, Ll3;->d(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 492
    .line 493
    .line 494
    move-result-object v6

    .line 495
    invoke-static {v6}, Ll3;->b(Landroid/app/ApplicationExitInfo;)I

    .line 496
    .line 497
    .line 498
    move-result v8

    .line 499
    const/16 v13, 0xa

    .line 500
    .line 501
    if-ne v8, v13, :cond_f

    .line 502
    .line 503
    invoke-static {v6}, Ll3;->c(Landroid/app/ApplicationExitInfo;)J

    .line 504
    .line 505
    .line 506
    move-result-wide v13

    .line 507
    cmp-long v6, v13, v11

    .line 508
    .line 509
    if-ltz v6, :cond_f

    .line 510
    .line 511
    goto :goto_f

    .line 512
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_10
    if-nez v6, :cond_11

    .line 516
    .line 517
    invoke-static {v0}, Llb1;->c(Landroid/content/Context;)V
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7 .. :try_end_7} :catch_0

    .line 518
    .line 519
    .line 520
    goto :goto_f

    .line 521
    :cond_11
    if-eqz v10, :cond_12

    .line 522
    .line 523
    invoke-static {}, Lcx;->f()Lcx;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-string v1, "Found unfinished work, scheduling it."

    .line 528
    .line 529
    invoke-virtual {v0, v9, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    iget-object v0, v3, Lsc5;->e:Ljava/util/List;

    .line 533
    .line 534
    invoke-static {v5, v7, v0}, Lc64;->b(Lr90;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 535
    .line 536
    .line 537
    :cond_12
    return-void

    .line 538
    :goto_e
    invoke-static {}, Lcx;->f()Lcx;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    iget v4, v4, Lcx;->a:I

    .line 543
    .line 544
    const/4 v6, 0x5

    .line 545
    if-gt v4, v6, :cond_13

    .line 546
    .line 547
    const-string v4, "Ignoring exception"

    .line 548
    .line 549
    invoke-static {v9, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 550
    .line 551
    .line 552
    :cond_13
    :goto_f
    invoke-static {}, Lcx;->f()Lcx;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    const-string v4, "Application was force-stopped, rescheduling."

    .line 557
    .line 558
    invoke-virtual {v0, v9, v4}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v3}, Lsc5;->d()V

    .line 562
    .line 563
    .line 564
    iget-object v0, v5, Lr90;->d:Lxi4;

    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 570
    .line 571
    .line 572
    move-result-wide v3

    .line 573
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    new-instance v0, Lfp3;

    .line 577
    .line 578
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 579
    .line 580
    .line 581
    move-result-object v3

    .line 582
    invoke-direct {v0, v1, v3}, Lfp3;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 583
    .line 584
    .line 585
    iget-object v1, v2, Lrv1;->a:Landroidx/work/impl/WorkDatabase;

    .line 586
    .line 587
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->w()Lgp3;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    invoke-virtual {v1, v0}, Lgp3;->n(Lfp3;)V

    .line 592
    .line 593
    .line 594
    return-void

    .line 595
    :catchall_3
    move-exception v0

    .line 596
    goto :goto_10

    .line 597
    :catchall_4
    move-exception v0

    .line 598
    :try_start_8
    invoke-virtual {v4}, Ls24;->o()V

    .line 599
    .line 600
    .line 601
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 602
    :goto_10
    :try_start_9
    invoke-virtual {v9, v10}, Lrx1;->h(Ldf1;)V

    .line 603
    .line 604
    .line 605
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 606
    :goto_11
    invoke-virtual {v7}, Ls24;->o()V

    .line 607
    .line 608
    .line 609
    throw v0

    .line 610
    :goto_12
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v12}, Lw24;->j()V

    .line 614
    .line 615
    .line 616
    throw v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-object v0, p0, Llb1;->o:Lsc5;

    .line 2
    .line 3
    iget-object v0, v0, Lsc5;->b:Lr90;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Llb1;->r:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lcx;->f()Lcx;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "The default process name was not specified."

    .line 22
    .line 23
    invoke-virtual {p0, v2, v0}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    iget-object p0, p0, Llb1;->n:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {p0, v0}, Lnq3;->a(Landroid/content/Context;Lr90;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {}, Lcx;->f()Lcx;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Is default app process = "

    .line 41
    .line 42
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v2, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return p0
.end method

.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Llb1;->n:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Llb1;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Llb1;->o:Lsc5;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Llb1;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lsc5;->c()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    invoke-static {v0}, Ljz4;->E(Landroid/content/Context;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-static {}, Lcx;->f()Lcx;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "Performing cleanup operations."

    .line 25
    .line 26
    invoke-virtual {v3, v1, v4}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_3
    invoke-virtual {p0}, Llb1;->a()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lsc5;->c()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :catch_1
    move-exception v3

    .line 40
    goto :goto_1

    .line 41
    :catch_2
    move-exception v3

    .line 42
    goto :goto_1

    .line 43
    :catch_3
    move-exception v3

    .line 44
    goto :goto_1

    .line 45
    :catch_4
    move-exception v3

    .line 46
    goto :goto_1

    .line 47
    :catch_5
    move-exception v3

    .line 48
    goto :goto_1

    .line 49
    :catch_6
    move-exception v3

    .line 50
    goto :goto_1

    .line 51
    :catch_7
    move-exception v3

    .line 52
    goto :goto_1

    .line 53
    :catch_8
    move-exception v3

    .line 54
    :goto_1
    :try_start_4
    iget v4, p0, Llb1;->q:I

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    iput v4, p0, Llb1;->q:I

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    if-lt v4, v5, :cond_2

    .line 62
    .line 63
    const-class p0, Landroid/os/UserManager;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Landroid/os/UserManager;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/os/UserManager;->isUserUnlocked()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_1

    .line 76
    .line 77
    const-string p0, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    const-string p0, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"

    .line 81
    .line 82
    :goto_2
    invoke-static {}, Lcx;->f()Lcx;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0, v1, p0, v3}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    invoke-direct {v0, p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, v2, Lsc5;->b:Lr90;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_2
    int-to-long v4, v4

    .line 101
    const-wide/16 v6, 0x12c

    .line 102
    .line 103
    mul-long/2addr v4, v6

    .line 104
    invoke-static {}, Lcx;->f()Lcx;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    new-instance v9, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v10, "Retrying after "

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v8, v1, v4, v3}, Lcx;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    iget v3, p0, Llb1;->q:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 129
    .line 130
    int-to-long v3, v3

    .line 131
    mul-long/2addr v3, v6

    .line 132
    :try_start_5
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :catch_9
    move-exception p0

    .line 137
    :try_start_6
    const-string v0, "Unexpected SQLite exception during migrations"

    .line 138
    .line 139
    invoke-static {}, Lcx;->f()Lcx;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v3, v1, v0}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 147
    .line 148
    invoke-direct {v1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    iget-object p0, v2, Lsc5;->b:Lr90;

    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 157
    :goto_3
    invoke-virtual {v2}, Lsc5;->c()V

    .line 158
    .line 159
    .line 160
    throw p0
.end method
