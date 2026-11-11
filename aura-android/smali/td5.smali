.class public final Ltd5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldd5;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lbq4;

.field public final e:Lr90;

.field public final f:Lxi4;

.field public final g:Lpq3;

.field public final h:Landroidx/work/impl/WorkDatabase;

.field public final i:Lfd5;

.field public final j:Lwo0;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/lang/String;

.field public final m:Lt22;


# direct methods
.method public constructor <init>(Llv4;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Llv4;->s:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ldd5;

    .line 7
    .line 8
    iput-object v0, p0, Ltd5;->a:Ldd5;

    .line 9
    .line 10
    iget-object v1, p1, Llv4;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/content/Context;

    .line 13
    .line 14
    iput-object v1, p0, Ltd5;->b:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v0, v0, Ldd5;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Ltd5;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v1, p1, Llv4;->p:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lbq4;

    .line 23
    .line 24
    iput-object v1, p0, Ltd5;->d:Lbq4;

    .line 25
    .line 26
    iget-object v1, p1, Llv4;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lr90;

    .line 29
    .line 30
    iput-object v1, p0, Ltd5;->e:Lr90;

    .line 31
    .line 32
    iget-object v1, v1, Lr90;->d:Lxi4;

    .line 33
    .line 34
    iput-object v1, p0, Ltd5;->f:Lxi4;

    .line 35
    .line 36
    iget-object v1, p1, Llv4;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Lpq3;

    .line 39
    .line 40
    iput-object v1, p0, Ltd5;->g:Lpq3;

    .line 41
    .line 42
    iget-object v1, p1, Llv4;->r:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 45
    .line 46
    iput-object v1, p0, Ltd5;->h:Landroidx/work/impl/WorkDatabase;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iput-object v2, p0, Ltd5;->i:Lfd5;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->v()Lwo0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Ltd5;->j:Lwo0;

    .line 59
    .line 60
    iget-object p1, p1, Llv4;->t:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v1, p1

    .line 63
    check-cast v1, Ljava/util/ArrayList;

    .line 64
    .line 65
    iput-object v1, p0, Ltd5;->k:Ljava/util/ArrayList;

    .line 66
    .line 67
    const-string p1, "Work [ id="

    .line 68
    .line 69
    const-string v2, ", tags={ "

    .line 70
    .line 71
    invoke-static {p1, v0, v2}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const/4 v5, 0x0

    .line 76
    const/16 v6, 0x3e

    .line 77
    .line 78
    const-string v2, ","

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    invoke-static/range {v1 .. v6}, Lq40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lif1;I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, " } ]"

    .line 87
    .line 88
    invoke-static {p1, v0, v1}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Ltd5;->l:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {}, Lgb;->a()Lt22;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Ltd5;->m:Lt22;

    .line 99
    .line 100
    return-void
.end method

.method public static final a(Ltd5;Lwd0;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ltd5;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, v1, Ltd5;->d:Lbq4;

    .line 8
    .line 9
    iget-object v4, v1, Ltd5;->h:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    iget-object v5, v1, Ltd5;->e:Lr90;

    .line 12
    .line 13
    iget-object v6, v5, Lr90;->m:Li80;

    .line 14
    .line 15
    iget-object v7, v1, Ltd5;->a:Ldd5;

    .line 16
    .line 17
    instance-of v8, v0, Lrd5;

    .line 18
    .line 19
    if-eqz v8, :cond_0

    .line 20
    .line 21
    move-object v8, v0

    .line 22
    check-cast v8, Lrd5;

    .line 23
    .line 24
    iget v9, v8, Lrd5;->q:I

    .line 25
    .line 26
    const/high16 v10, -0x80000000

    .line 27
    .line 28
    and-int v11, v9, v10

    .line 29
    .line 30
    if-eqz v11, :cond_0

    .line 31
    .line 32
    sub-int/2addr v9, v10

    .line 33
    iput v9, v8, Lrd5;->q:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v8, Lrd5;

    .line 37
    .line 38
    invoke-direct {v8, v1, v0}, Lrd5;-><init>(Ltd5;Lwd0;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v0, v8, Lrd5;->o:Ljava/lang/Object;

    .line 42
    .line 43
    iget v9, v8, Lrd5;->q:I

    .line 44
    .line 45
    const/4 v10, 0x1

    .line 46
    if-eqz v9, :cond_2

    .line 47
    .line 48
    if-ne v9, v10, :cond_1

    .line 49
    .line 50
    iget-object v1, v8, Lrd5;->n:Ltd5;

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_c

    .line 56
    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto/16 :goto_d

    .line 59
    .line 60
    :catch_0
    move-exception v0

    .line 61
    goto/16 :goto_e

    .line 62
    .line 63
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    return-object v0

    .line 70
    :cond_2
    invoke-static {v0}, Lkb4;->X(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v9, v5, Lr90;->e:Lfz0;

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lxl;->y()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    iget-object v11, v7, Ldd5;->x:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v12, v7, Ldd5;->c:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v13, v7, Ldd5;->d:Ljava/lang/String;

    .line 87
    .line 88
    iget-object v14, v7, Ldd5;->e:Loh0;

    .line 89
    .line 90
    if-eqz v6, :cond_5

    .line 91
    .line 92
    if-eqz v11, :cond_5

    .line 93
    .line 94
    invoke-virtual {v7}, Ldd5;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 99
    .line 100
    const/16 v15, 0x1d

    .line 101
    .line 102
    if-lt v10, v15, :cond_3

    .line 103
    .line 104
    invoke-static {v11}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-static {v0, v10}, Lnv4;->a(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_3
    invoke-static {v11}, Lxl;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    const-string v15, "asyncTraceBegin"

    .line 117
    .line 118
    :try_start_1
    sget-object v16, Lxl;->j:Ljava/lang/reflect/Method;

    .line 119
    .line 120
    if-nez v16, :cond_4

    .line 121
    .line 122
    move/from16 v16, v0

    .line 123
    .line 124
    const-class v0, Landroid/os/Trace;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 125
    .line 126
    move-object/from16 v17, v7

    .line 127
    .line 128
    :try_start_2
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 129
    .line 130
    move-object/from16 v18, v14

    .line 131
    .line 132
    :try_start_3
    const-class v14, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 133
    .line 134
    move-object/from16 v19, v8

    .line 135
    .line 136
    :try_start_4
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    filled-new-array {v7, v14, v8}, [Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v0, v15, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sput-object v0, Lxl;->j:Ljava/lang/reflect/Method;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :catch_1
    move-exception v0

    .line 150
    goto :goto_3

    .line 151
    :catch_2
    move-exception v0

    .line 152
    move-object/from16 v19, v8

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :catch_3
    move-exception v0

    .line 156
    :goto_1
    move-object/from16 v19, v8

    .line 157
    .line 158
    move-object/from16 v18, v14

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :catch_4
    move-exception v0

    .line 162
    move-object/from16 v17, v7

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    move/from16 v16, v0

    .line 166
    .line 167
    move-object/from16 v17, v7

    .line 168
    .line 169
    move-object/from16 v19, v8

    .line 170
    .line 171
    move-object/from16 v18, v14

    .line 172
    .line 173
    :goto_2
    sget-object v0, Lxl;->j:Ljava/lang/reflect/Method;

    .line 174
    .line 175
    sget-wide v7, Lxl;->h:J

    .line 176
    .line 177
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    filled-new-array {v7, v10, v8}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    const/4 v8, 0x0

    .line 190
    invoke-virtual {v0, v8, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :goto_3
    invoke-static {v15, v0}, Lxl;->w(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_5
    :goto_4
    move-object/from16 v17, v7

    .line 199
    .line 200
    move-object/from16 v19, v8

    .line 201
    .line 202
    move-object/from16 v18, v14

    .line 203
    .line 204
    :goto_5
    new-instance v0, Lld5;

    .line 205
    .line 206
    const/4 v7, 0x0

    .line 207
    invoke-direct {v0, v1, v7}, Lld5;-><init>(Ltd5;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4, v0}, Ls24;->r(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Ljava/lang/Boolean;

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_6

    .line 224
    .line 225
    new-instance v0, Lod5;

    .line 226
    .line 227
    invoke-direct {v0}, Lod5;-><init>()V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_f

    .line 231
    .line 232
    :cond_6
    invoke-virtual/range {v17 .. v17}, Ldd5;->d()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    move-object/from16 v14, v18

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    goto/16 :goto_a

    .line 242
    .line 243
    :cond_7
    iget-object v0, v5, Lr90;->f:Lrv2;

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    sget-object v0, Loz1;->a:Ljava/lang/String;

    .line 252
    .line 253
    :try_start_5
    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 257
    const/4 v8, 0x0

    .line 258
    :try_start_6
    invoke-virtual {v0, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    check-cast v0, Landroidx/work/OverwritingInputMerger;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :catch_5
    move-exception v0

    .line 273
    goto :goto_6

    .line 274
    :catch_6
    move-exception v0

    .line 275
    const/4 v8, 0x0

    .line 276
    :goto_6
    invoke-static {}, Lcx;->f()Lcx;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    sget-object v14, Loz1;->a:Ljava/lang/String;

    .line 281
    .line 282
    const-string v15, "Trouble instantiating "

    .line 283
    .line 284
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v15

    .line 288
    invoke-virtual {v10, v14, v15, v0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 289
    .line 290
    .line 291
    move-object v0, v8

    .line 292
    :goto_7
    if-nez v0, :cond_8

    .line 293
    .line 294
    sget-object v0, Lud5;->a:Ljava/lang/String;

    .line 295
    .line 296
    invoke-static {}, Lcx;->f()Lcx;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    const-string v2, "Could not create Input Merger "

    .line 301
    .line 302
    invoke-virtual {v2, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    invoke-virtual {v1, v0, v2}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, Lmd5;

    .line 310
    .line 311
    invoke-direct {v0}, Lmd5;-><init>()V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_f

    .line 315
    .line 316
    :cond_8
    invoke-static/range {v18 .. v18}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v10, v1, Ltd5;->i:Lfd5;

    .line 321
    .line 322
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    const-string v13, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 326
    .line 327
    const/4 v14, 0x1

    .line 328
    invoke-static {v14, v13}, Lw24;->b(ILjava/lang/String;)Lw24;

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    invoke-virtual {v13, v14, v2}, Lw24;->h(ILjava/lang/String;)V

    .line 333
    .line 334
    .line 335
    iget-object v10, v10, Lfd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 336
    .line 337
    invoke-virtual {v10}, Ls24;->b()V

    .line 338
    .line 339
    .line 340
    invoke-static {v10, v13}, Lxl;->H(Ls24;Lwo4;)Landroid/database/Cursor;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    :try_start_7
    new-instance v14, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 351
    .line 352
    .line 353
    :goto_8
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    .line 354
    .line 355
    .line 356
    move-result v15

    .line 357
    if-eqz v15, :cond_9

    .line 358
    .line 359
    invoke-interface {v10, v7}, Landroid/database/Cursor;->getBlob(I)[B

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    invoke-static {v15}, Loh0;->a([B)Loh0;

    .line 364
    .line 365
    .line 366
    move-result-object v15

    .line 367
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 368
    .line 369
    .line 370
    goto :goto_8

    .line 371
    :catchall_1
    move-exception v0

    .line 372
    goto/16 :goto_10

    .line 373
    .line 374
    :cond_9
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13}, Lw24;->j()V

    .line 378
    .line 379
    .line 380
    invoke-static {v0, v14}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    new-instance v10, Lnh0;

    .line 385
    .line 386
    invoke-direct {v10, v7}, Lnh0;-><init>(I)V

    .line 387
    .line 388
    .line 389
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 390
    .line 391
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 395
    .line 396
    .line 397
    move-result v14

    .line 398
    :goto_9
    if-ge v7, v14, :cond_a

    .line 399
    .line 400
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v15

    .line 404
    add-int/lit8 v7, v7, 0x1

    .line 405
    .line 406
    check-cast v15, Loh0;

    .line 407
    .line 408
    iget-object v15, v15, Loh0;->a:Ljava/util/HashMap;

    .line 409
    .line 410
    invoke-static {v15}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 411
    .line 412
    .line 413
    move-result-object v15

    .line 414
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-interface {v13, v15}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 418
    .line 419
    .line 420
    goto :goto_9

    .line 421
    :cond_a
    invoke-virtual {v10, v13}, Lnh0;->a(Ljava/util/HashMap;)V

    .line 422
    .line 423
    .line 424
    new-instance v14, Loh0;

    .line 425
    .line 426
    iget-object v0, v10, Lnh0;->a:Ljava/util/LinkedHashMap;

    .line 427
    .line 428
    invoke-direct {v14, v0}, Loh0;-><init>(Ljava/util/LinkedHashMap;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v14}, Lbu;->E(Loh0;)[B

    .line 432
    .line 433
    .line 434
    :goto_a
    new-instance v0, Landroidx/work/WorkerParameters;

    .line 435
    .line 436
    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    iget-object v7, v1, Ltd5;->k:Ljava/util/ArrayList;

    .line 441
    .line 442
    iget-object v10, v5, Lr90;->a:Ljava/util/concurrent/ExecutorService;

    .line 443
    .line 444
    iget-object v5, v5, Lr90;->b:Lrm0;

    .line 445
    .line 446
    new-instance v13, Lzc5;

    .line 447
    .line 448
    new-instance v13, Lqc5;

    .line 449
    .line 450
    iget-object v15, v1, Ltd5;->g:Lpq3;

    .line 451
    .line 452
    invoke-direct {v13, v4, v15, v3}, Lqc5;-><init>(Landroidx/work/impl/WorkDatabase;Lpq3;Lbq4;)V

    .line 453
    .line 454
    .line 455
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 456
    .line 457
    .line 458
    iput-object v2, v0, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 459
    .line 460
    iput-object v14, v0, Landroidx/work/WorkerParameters;->b:Loh0;

    .line 461
    .line 462
    new-instance v2, Ljava/util/HashSet;

    .line 463
    .line 464
    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 465
    .line 466
    .line 467
    iput-object v10, v0, Landroidx/work/WorkerParameters;->c:Ljava/util/concurrent/ExecutorService;

    .line 468
    .line 469
    iput-object v5, v0, Landroidx/work/WorkerParameters;->d:Lne0;

    .line 470
    .line 471
    iput-object v3, v0, Landroidx/work/WorkerParameters;->e:Lbq4;

    .line 472
    .line 473
    iput-object v9, v0, Landroidx/work/WorkerParameters;->f:Lfz0;

    .line 474
    .line 475
    :try_start_8
    iget-object v2, v1, Ltd5;->b:Landroid/content/Context;

    .line 476
    .line 477
    invoke-virtual {v9, v2, v12, v0}, Lfz0;->g(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Loc2;

    .line 478
    .line 479
    .line 480
    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 481
    const/4 v14, 0x1

    .line 482
    iput-boolean v14, v2, Loc2;->d:Z

    .line 483
    .line 484
    invoke-interface/range {v19 .. v19}, Lvd0;->getContext()Lne0;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    sget-object v5, Lfz0;->h0:Lfz0;

    .line 489
    .line 490
    invoke-interface {v0, v5}, Lne0;->K(Lme0;)Lle0;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    check-cast v0, Ls22;

    .line 498
    .line 499
    new-instance v5, Lsd5;

    .line 500
    .line 501
    invoke-direct {v5, v2, v6, v11, v1}, Lsd5;-><init>(Loc2;ZLjava/lang/String;Ltd5;)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v0, v5}, Ls22;->M(Lif1;)Las0;

    .line 505
    .line 506
    .line 507
    new-instance v5, Lld5;

    .line 508
    .line 509
    invoke-direct {v5, v1, v14}, Lld5;-><init>(Ltd5;I)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v4, v5}, Ls24;->r(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    check-cast v4, Ljava/lang/Boolean;

    .line 520
    .line 521
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    if-nez v4, :cond_b

    .line 526
    .line 527
    new-instance v0, Lod5;

    .line 528
    .line 529
    invoke-direct {v0}, Lod5;-><init>()V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_f

    .line 533
    .line 534
    :cond_b
    invoke-interface {v0}, Ls22;->isCancelled()Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_c

    .line 539
    .line 540
    new-instance v0, Lod5;

    .line 541
    .line 542
    invoke-direct {v0}, Lod5;-><init>()V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_f

    .line 546
    .line 547
    :cond_c
    iget-object v0, v3, Lbq4;->q:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v0, Lvc5;

    .line 550
    .line 551
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    invoke-static {v0}, Lkb4;->w(Ljava/util/concurrent/Executor;)Lpe0;

    .line 555
    .line 556
    .line 557
    move-result-object v6

    .line 558
    :try_start_9
    new-instance v0, Lr;

    .line 559
    .line 560
    const/16 v5, 0xf

    .line 561
    .line 562
    move-object v4, v8

    .line 563
    move-object v3, v13

    .line 564
    invoke-direct/range {v0 .. v5}, Lr;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 565
    .line 566
    .line 567
    move-object/from16 v8, v19

    .line 568
    .line 569
    iput-object v1, v8, Lrd5;->n:Ltd5;

    .line 570
    .line 571
    const/4 v14, 0x1

    .line 572
    iput v14, v8, Lrd5;->q:I

    .line 573
    .line 574
    invoke-static {v6, v0, v8}, Lfu;->P(Lne0;Lwf1;Lwd0;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 578
    sget-object v2, Lxe0;->n:Lxe0;

    .line 579
    .line 580
    if-ne v0, v2, :cond_d

    .line 581
    .line 582
    :goto_b
    move-object v0, v2

    .line 583
    goto :goto_f

    .line 584
    :cond_d
    :goto_c
    :try_start_a
    check-cast v0, Lnc2;

    .line 585
    .line 586
    new-instance v2, Lnd5;

    .line 587
    .line 588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-direct {v2, v0}, Lnd5;-><init>(Lnc2;)V
    :try_end_a
    .catch Ljava/util/concurrent/CancellationException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 592
    .line 593
    .line 594
    goto :goto_b

    .line 595
    :goto_d
    sget-object v2, Lud5;->a:Ljava/lang/String;

    .line 596
    .line 597
    invoke-static {}, Lcx;->f()Lcx;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    new-instance v4, Ljava/lang/StringBuilder;

    .line 602
    .line 603
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 604
    .line 605
    .line 606
    iget-object v1, v1, Ltd5;->l:Ljava/lang/String;

    .line 607
    .line 608
    const-string v5, " failed because it threw an exception/error"

    .line 609
    .line 610
    invoke-static {v4, v1, v5}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v1

    .line 614
    invoke-virtual {v3, v2, v1, v0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 615
    .line 616
    .line 617
    new-instance v0, Lmd5;

    .line 618
    .line 619
    invoke-direct {v0}, Lmd5;-><init>()V

    .line 620
    .line 621
    .line 622
    goto :goto_f

    .line 623
    :goto_e
    sget-object v2, Lud5;->a:Ljava/lang/String;

    .line 624
    .line 625
    invoke-static {}, Lcx;->f()Lcx;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    new-instance v4, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 632
    .line 633
    .line 634
    iget-object v1, v1, Ltd5;->l:Ljava/lang/String;

    .line 635
    .line 636
    const-string v5, " was cancelled"

    .line 637
    .line 638
    invoke-static {v4, v1, v5}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    iget v3, v3, Lcx;->a:I

    .line 643
    .line 644
    const/4 v4, 0x4

    .line 645
    if-gt v3, v4, :cond_e

    .line 646
    .line 647
    invoke-static {v2, v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 648
    .line 649
    .line 650
    :cond_e
    throw v0

    .line 651
    :catchall_2
    sget-object v0, Lud5;->a:Ljava/lang/String;

    .line 652
    .line 653
    invoke-static {}, Lcx;->f()Lcx;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    new-instance v2, Ljava/lang/StringBuilder;

    .line 658
    .line 659
    const-string v3, "Could not create Worker "

    .line 660
    .line 661
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-virtual {v1, v0, v2}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    new-instance v0, Lmd5;

    .line 675
    .line 676
    invoke-direct {v0}, Lmd5;-><init>()V

    .line 677
    .line 678
    .line 679
    :goto_f
    return-object v0

    .line 680
    :goto_10
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v13}, Lw24;->j()V

    .line 684
    .line 685
    .line 686
    throw v0
.end method


# virtual methods
.method public final b(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Ltd5;->i:Lfd5;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Ltd5;->c:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2}, Lfd5;->n(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ltd5;->f:Lxi4;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-virtual {v0, v2, v3, v4}, Lfd5;->l(Ljava/lang/String;J)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Ltd5;->a:Ldd5;

    .line 22
    .line 23
    iget p0, p0, Ldd5;->v:I

    .line 24
    .line 25
    invoke-virtual {v0, p0, v2}, Lfd5;->k(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v3, -0x1

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3, v4}, Lfd5;->j(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, v2}, Lfd5;->o(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    iget-object v0, p0, Ltd5;->f:Lxi4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-object v2, p0, Ltd5;->i:Lfd5;

    .line 11
    .line 12
    iget-object v3, p0, Ltd5;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v2, v3, v0, v1}, Lfd5;->l(Ljava/lang/String;J)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-virtual {v2, v0, v3}, Lfd5;->n(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v2, Lfd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 22
    .line 23
    invoke-virtual {v1}, Ls24;->b()V

    .line 24
    .line 25
    .line 26
    iget-object v4, v2, Lfd5;->j:Laq4;

    .line 27
    .line 28
    invoke-virtual {v4}, Lrx1;->a()Ldf1;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-interface {v5, v0, v3}, Lvo4;->h(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {v1}, Ls24;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-virtual {v5}, Ldf1;->b()I

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ls24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 42
    .line 43
    .line 44
    :try_start_2
    invoke-virtual {v1}, Ls24;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4, v5}, Lrx1;->h(Ldf1;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Ltd5;->a:Ldd5;

    .line 51
    .line 52
    iget p0, p0, Ldd5;->v:I

    .line 53
    .line 54
    invoke-virtual {v2, p0, v3}, Lfd5;->k(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ls24;->b()V

    .line 58
    .line 59
    .line 60
    iget-object p0, v2, Lfd5;->f:Laq4;

    .line 61
    .line 62
    invoke-virtual {p0}, Lrx1;->a()Ldf1;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v4, v0, v3}, Lvo4;->h(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :try_start_3
    invoke-virtual {v1}, Ls24;->c()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 70
    .line 71
    .line 72
    :try_start_4
    invoke-virtual {v4}, Ldf1;->b()I

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ls24;->t()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 76
    .line 77
    .line 78
    :try_start_5
    invoke-virtual {v1}, Ls24;->o()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v4}, Lrx1;->h(Ldf1;)V

    .line 82
    .line 83
    .line 84
    const-wide/16 v0, -0x1

    .line 85
    .line 86
    invoke-virtual {v2, v3, v0, v1}, Lfd5;->j(Ljava/lang/String;J)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto :goto_0

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    :try_start_6
    invoke-virtual {v1}, Ls24;->o()V

    .line 94
    .line 95
    .line 96
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 97
    :goto_0
    invoke-virtual {p0, v4}, Lrx1;->h(Ldf1;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :catchall_2
    move-exception p0

    .line 102
    goto :goto_1

    .line 103
    :catchall_3
    move-exception p0

    .line 104
    :try_start_7
    invoke-virtual {v1}, Ls24;->o()V

    .line 105
    .line 106
    .line 107
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 108
    :goto_1
    invoke-virtual {v4, v5}, Lrx1;->h(Ldf1;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public final d(Lnc2;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ltd5;->c:Ljava/lang/String;

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lgb;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    iget-object v3, p0, Ltd5;->i:Lfd5;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-static {v1}, Lv40;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v3, v2}, Lfd5;->g(Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x6

    .line 33
    if-eq v4, v5, :cond_0

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    invoke-virtual {v3, v4, v2}, Lfd5;->n(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v3, p0, Ltd5;->j:Lwo0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, Lwo0;->w(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    check-cast p1, Lkc2;

    .line 50
    .line 51
    iget-object p1, p1, Lkc2;->a:Loh0;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Ltd5;->a:Ldd5;

    .line 57
    .line 58
    iget p0, p0, Ldd5;->v:I

    .line 59
    .line 60
    invoke-virtual {v3, p0, v0}, Lfd5;->k(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v0, p1}, Lfd5;->m(Ljava/lang/String;Loh0;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
