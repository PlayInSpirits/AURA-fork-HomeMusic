.class public abstract Lp11;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lp11;->a:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Lmc5;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lmc5;->a:Lsc5;

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lmc5;->e:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lmc5;->b(Lmc5;)Ljava/util/HashSet;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v2, p0, Lmc5;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    :goto_0
    if-nez v1, :cond_3

    .line 48
    .line 49
    iget-object v1, v0, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 50
    .line 51
    iget-object v2, v0, Lsc5;->b:Lr90;

    .line 52
    .line 53
    invoke-virtual {v1}, Ls24;->c()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    invoke-static {v1, v2, p0}, Lgh0;->e(Landroidx/work/impl/WorkDatabase;Lr90;Lmc5;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Lp11;->b(Lmc5;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-virtual {v1}, Ls24;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ls24;->o()V

    .line 67
    .line 68
    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    iget-object p0, v0, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 72
    .line 73
    iget-object v0, v0, Lsc5;->e:Ljava/util/List;

    .line 74
    .line 75
    invoke-static {v2, p0, v0}, Lc64;->b(Lr90;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    invoke-virtual {v1}, Ls24;->o()V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_3
    const-string v0, "WorkContinuation has cycles ("

    .line 85
    .line 86
    const-string v1, ")"

    .line 87
    .line 88
    invoke-static {p0, v1, v0}, Lnz2;->w(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static b(Lmc5;)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lmc5;->b(Lmc5;)Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lmc5;->a:Lsc5;

    .line 8
    .line 9
    iget-object v3, v0, Lmc5;->d:Ljava/util/List;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    new-array v5, v4, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, v0, Lmc5;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget v6, v0, Lmc5;->c:I

    .line 23
    .line 24
    iget-object v7, v2, Lsc5;->b:Lr90;

    .line 25
    .line 26
    iget-object v7, v7, Lr90;->d:Lxi4;

    .line 27
    .line 28
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    iget-object v9, v2, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 36
    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    array-length v11, v1

    .line 40
    if-lez v11, :cond_0

    .line 41
    .line 42
    const/4 v11, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v11, v4

    .line 45
    :goto_0
    const/4 v12, 0x4

    .line 46
    const/4 v13, 0x3

    .line 47
    if-eqz v11, :cond_6

    .line 48
    .line 49
    array-length v15, v1

    .line 50
    move/from16 v18, v4

    .line 51
    .line 52
    move/from16 v19, v18

    .line 53
    .line 54
    const/16 v17, 0x1

    .line 55
    .line 56
    :goto_1
    if-ge v4, v15, :cond_7

    .line 57
    .line 58
    aget-object v10, v1, v4

    .line 59
    .line 60
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 61
    .line 62
    .line 63
    move-result-object v14

    .line 64
    invoke-virtual {v14, v10}, Lfd5;->h(Ljava/lang/String;)Ldd5;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    if-nez v14, :cond_2

    .line 69
    .line 70
    invoke-static {}, Lcx;->f()Lcx;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    new-instance v2, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v3, "Prerequisite "

    .line 77
    .line 78
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v3, " doesn\'t exist; not enqueuing"

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    sget-object v3, Lp11;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v1, v3, v2}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_1
    :goto_2
    const/4 v4, 0x0

    .line 99
    :goto_3
    const/4 v9, 0x1

    .line 100
    goto/16 :goto_16

    .line 101
    .line 102
    :cond_2
    iget v10, v14, Ldd5;->b:I

    .line 103
    .line 104
    if-ne v10, v13, :cond_3

    .line 105
    .line 106
    const/4 v14, 0x1

    .line 107
    goto :goto_4

    .line 108
    :cond_3
    const/4 v14, 0x0

    .line 109
    :goto_4
    and-int v17, v17, v14

    .line 110
    .line 111
    if-ne v10, v12, :cond_4

    .line 112
    .line 113
    const/16 v19, 0x1

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_4
    const/4 v14, 0x6

    .line 117
    if-ne v10, v14, :cond_5

    .line 118
    .line 119
    const/16 v18, 0x1

    .line 120
    .line 121
    :cond_5
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    const/16 v17, 0x1

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    :cond_7
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_18

    .line 135
    .line 136
    if-nez v11, :cond_18

    .line 137
    .line 138
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v10, v5}, Lfd5;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    if-nez v14, :cond_18

    .line 151
    .line 152
    if-eq v6, v13, :cond_c

    .line 153
    .line 154
    if-ne v6, v12, :cond_8

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_8
    const/4 v13, 0x2

    .line 158
    if-ne v6, v13, :cond_a

    .line 159
    .line 160
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    const/4 v14, 0x0

    .line 165
    :goto_6
    if-ge v14, v6, :cond_a

    .line 166
    .line 167
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    add-int/lit8 v14, v14, 0x1

    .line 172
    .line 173
    check-cast v15, Lcd5;

    .line 174
    .line 175
    iget v15, v15, Lcd5;->b:I

    .line 176
    .line 177
    const/4 v12, 0x1

    .line 178
    if-eq v15, v12, :cond_1

    .line 179
    .line 180
    if-ne v15, v13, :cond_9

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_9
    const/4 v12, 0x4

    .line 184
    goto :goto_6

    .line 185
    :cond_a
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    new-instance v6, Lv6;

    .line 189
    .line 190
    const/4 v12, 0x4

    .line 191
    invoke-direct {v6, v9, v5, v2, v12}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9, v6}, Ls24;->s(Ljava/lang/Runnable;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    const/4 v13, 0x0

    .line 206
    :goto_7
    if-ge v13, v12, :cond_b

    .line 207
    .line 208
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v14

    .line 212
    add-int/lit8 v13, v13, 0x1

    .line 213
    .line 214
    check-cast v14, Lcd5;

    .line 215
    .line 216
    iget-object v14, v14, Lcd5;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v6, v14}, Lfd5;->a(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_b
    move-object/from16 v20, v3

    .line 223
    .line 224
    move/from16 v22, v4

    .line 225
    .line 226
    move-object/from16 v23, v9

    .line 227
    .line 228
    const/4 v3, 0x1

    .line 229
    const/4 v9, 0x0

    .line 230
    goto/16 :goto_10

    .line 231
    .line 232
    :cond_c
    :goto_8
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->v()Lwo0;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    new-instance v12, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v14

    .line 245
    const/4 v15, 0x0

    .line 246
    :goto_9
    if-ge v15, v14, :cond_13

    .line 247
    .line 248
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v20

    .line 252
    add-int/lit8 v15, v15, 0x1

    .line 253
    .line 254
    move-object/from16 v13, v20

    .line 255
    .line 256
    check-cast v13, Lcd5;

    .line 257
    .line 258
    move-object/from16 v20, v3

    .line 259
    .line 260
    iget-object v3, v13, Lcd5;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move/from16 v22, v4

    .line 266
    .line 267
    const-string v4, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    .line 268
    .line 269
    move-object/from16 v23, v9

    .line 270
    .line 271
    const/4 v9, 0x1

    .line 272
    invoke-static {v9, v4}, Lw24;->b(ILjava/lang/String;)Lw24;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v4, v9, v3}, Lw24;->h(ILjava/lang/String;)V

    .line 277
    .line 278
    .line 279
    iget-object v3, v11, Lwo0;->n:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v3, Landroidx/work/impl/WorkDatabase_Impl;

    .line 282
    .line 283
    invoke-virtual {v3}, Ls24;->b()V

    .line 284
    .line 285
    .line 286
    invoke-static {v3, v4}, Lxl;->H(Ls24;Lwo4;)Landroid/database/Cursor;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_d

    .line 295
    .line 296
    const/4 v9, 0x0

    .line 297
    invoke-interface {v3, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 298
    .line 299
    .line 300
    move-result v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    if-eqz v16, :cond_e

    .line 302
    .line 303
    const/16 v16, 0x1

    .line 304
    .line 305
    goto :goto_a

    .line 306
    :catchall_0
    move-exception v0

    .line 307
    goto :goto_d

    .line 308
    :cond_d
    const/4 v9, 0x0

    .line 309
    :cond_e
    move/from16 v16, v9

    .line 310
    .line 311
    :goto_a
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4}, Lw24;->j()V

    .line 315
    .line 316
    .line 317
    if-nez v16, :cond_12

    .line 318
    .line 319
    iget v3, v13, Lcd5;->b:I

    .line 320
    .line 321
    const/4 v4, 0x3

    .line 322
    if-ne v3, v4, :cond_f

    .line 323
    .line 324
    const/16 v16, 0x1

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_f
    move/from16 v16, v9

    .line 328
    .line 329
    :goto_b
    and-int v16, v17, v16

    .line 330
    .line 331
    const/4 v4, 0x4

    .line 332
    if-ne v3, v4, :cond_10

    .line 333
    .line 334
    const/16 v19, 0x1

    .line 335
    .line 336
    goto :goto_c

    .line 337
    :cond_10
    const/4 v4, 0x6

    .line 338
    if-ne v3, v4, :cond_11

    .line 339
    .line 340
    const/16 v18, 0x1

    .line 341
    .line 342
    :cond_11
    :goto_c
    iget-object v3, v13, Lcd5;->a:Ljava/lang/String;

    .line 343
    .line 344
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move/from16 v17, v16

    .line 348
    .line 349
    :cond_12
    move-object/from16 v3, v20

    .line 350
    .line 351
    move/from16 v4, v22

    .line 352
    .line 353
    move-object/from16 v9, v23

    .line 354
    .line 355
    const/4 v13, 0x3

    .line 356
    goto :goto_9

    .line 357
    :goto_d
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4}, Lw24;->j()V

    .line 361
    .line 362
    .line 363
    throw v0

    .line 364
    :cond_13
    move-object/from16 v20, v3

    .line 365
    .line 366
    move/from16 v22, v4

    .line 367
    .line 368
    move-object/from16 v23, v9

    .line 369
    .line 370
    const/4 v4, 0x4

    .line 371
    const/4 v9, 0x0

    .line 372
    if-ne v6, v4, :cond_16

    .line 373
    .line 374
    if-nez v18, :cond_14

    .line 375
    .line 376
    if-eqz v19, :cond_16

    .line 377
    .line 378
    :cond_14
    invoke-virtual/range {v23 .. v23}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v3, v5}, Lfd5;->i(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    move v10, v9

    .line 391
    :goto_e
    if-ge v10, v6, :cond_15

    .line 392
    .line 393
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v11

    .line 397
    add-int/lit8 v10, v10, 0x1

    .line 398
    .line 399
    check-cast v11, Lcd5;

    .line 400
    .line 401
    iget-object v11, v11, Lcd5;->a:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v3, v11}, Lfd5;->a(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    goto :goto_e

    .line 407
    :cond_15
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 408
    .line 409
    move/from16 v18, v9

    .line 410
    .line 411
    move/from16 v19, v18

    .line 412
    .line 413
    :cond_16
    invoke-interface {v12, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    check-cast v1, [Ljava/lang/String;

    .line 418
    .line 419
    array-length v3, v1

    .line 420
    if-lez v3, :cond_17

    .line 421
    .line 422
    const/4 v11, 0x1

    .line 423
    goto :goto_f

    .line 424
    :cond_17
    move v11, v9

    .line 425
    :goto_f
    move v3, v9

    .line 426
    goto :goto_10

    .line 427
    :cond_18
    move-object/from16 v20, v3

    .line 428
    .line 429
    move/from16 v22, v4

    .line 430
    .line 431
    move-object/from16 v23, v9

    .line 432
    .line 433
    const/4 v9, 0x0

    .line 434
    goto :goto_f

    .line 435
    :goto_10
    invoke-interface/range {v20 .. v20}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    move v12, v3

    .line 440
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    if-eqz v3, :cond_20

    .line 445
    .line 446
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    check-cast v3, Lbd5;

    .line 451
    .line 452
    iget-object v6, v3, Lbd5;->b:Ldd5;

    .line 453
    .line 454
    iget-object v10, v3, Lbd5;->a:Ljava/util/UUID;

    .line 455
    .line 456
    if-eqz v11, :cond_1b

    .line 457
    .line 458
    if-nez v17, :cond_1b

    .line 459
    .line 460
    if-eqz v19, :cond_19

    .line 461
    .line 462
    const/4 v13, 0x4

    .line 463
    iput v13, v6, Ldd5;->b:I

    .line 464
    .line 465
    const/4 v14, 0x6

    .line 466
    goto :goto_12

    .line 467
    :cond_19
    const/4 v13, 0x4

    .line 468
    if-eqz v18, :cond_1a

    .line 469
    .line 470
    const/4 v14, 0x6

    .line 471
    iput v14, v6, Ldd5;->b:I

    .line 472
    .line 473
    goto :goto_12

    .line 474
    :cond_1a
    const/4 v14, 0x6

    .line 475
    const/4 v15, 0x5

    .line 476
    iput v15, v6, Ldd5;->b:I

    .line 477
    .line 478
    goto :goto_12

    .line 479
    :cond_1b
    const/4 v13, 0x4

    .line 480
    const/4 v14, 0x6

    .line 481
    iput-wide v7, v6, Ldd5;->n:J

    .line 482
    .line 483
    :goto_12
    iget v15, v6, Ldd5;->b:I

    .line 484
    .line 485
    const/4 v9, 0x1

    .line 486
    if-ne v15, v9, :cond_1c

    .line 487
    .line 488
    const/4 v12, 0x1

    .line 489
    :cond_1c
    invoke-virtual/range {v23 .. v23}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 490
    .line 491
    .line 492
    move-result-object v9

    .line 493
    iget-object v15, v2, Lsc5;->e:Ljava/util/List;

    .line 494
    .line 495
    invoke-static {v15, v6}, Lgh0;->K(Ljava/util/List;Ldd5;)Ldd5;

    .line 496
    .line 497
    .line 498
    move-result-object v6

    .line 499
    iget-object v15, v9, Lfd5;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 500
    .line 501
    invoke-virtual {v15}, Ls24;->b()V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v15}, Ls24;->c()V

    .line 505
    .line 506
    .line 507
    :try_start_1
    iget-object v9, v9, Lfd5;->b:Lvo0;

    .line 508
    .line 509
    invoke-virtual {v9, v6}, Lvo0;->m(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v15}, Ls24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 513
    .line 514
    .line 515
    invoke-virtual {v15}, Ls24;->o()V

    .line 516
    .line 517
    .line 518
    if-eqz v11, :cond_1d

    .line 519
    .line 520
    array-length v6, v1

    .line 521
    const/4 v9, 0x0

    .line 522
    :goto_13
    if-ge v9, v6, :cond_1d

    .line 523
    .line 524
    aget-object v15, v1, v9

    .line 525
    .line 526
    new-instance v13, Lto0;

    .line 527
    .line 528
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v14

    .line 532
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-direct {v13, v14, v15}, Lto0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual/range {v23 .. v23}, Landroidx/work/impl/WorkDatabase;->v()Lwo0;

    .line 539
    .line 540
    .line 541
    move-result-object v14

    .line 542
    iget-object v15, v14, Lwo0;->n:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v15, Landroidx/work/impl/WorkDatabase_Impl;

    .line 545
    .line 546
    invoke-virtual {v15}, Ls24;->b()V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v15}, Ls24;->c()V

    .line 550
    .line 551
    .line 552
    :try_start_2
    iget-object v14, v14, Lwo0;->o:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v14, Lvo0;

    .line 555
    .line 556
    invoke-virtual {v14, v13}, Lvo0;->m(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v15}, Ls24;->t()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 560
    .line 561
    .line 562
    invoke-virtual {v15}, Ls24;->o()V

    .line 563
    .line 564
    .line 565
    add-int/lit8 v9, v9, 0x1

    .line 566
    .line 567
    const/4 v13, 0x4

    .line 568
    const/4 v14, 0x6

    .line 569
    goto :goto_13

    .line 570
    :catchall_1
    move-exception v0

    .line 571
    invoke-virtual {v15}, Ls24;->o()V

    .line 572
    .line 573
    .line 574
    throw v0

    .line 575
    :cond_1d
    invoke-virtual/range {v23 .. v23}, Landroidx/work/impl/WorkDatabase;->B()Lhd5;

    .line 576
    .line 577
    .line 578
    move-result-object v6

    .line 579
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v9

    .line 583
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    iget-object v3, v3, Lbd5;->c:Ljava/util/Set;

    .line 587
    .line 588
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 595
    .line 596
    .line 597
    check-cast v3, Ljava/lang/Iterable;

    .line 598
    .line 599
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 604
    .line 605
    .line 606
    move-result v13

    .line 607
    if-eqz v13, :cond_1e

    .line 608
    .line 609
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v13

    .line 613
    check-cast v13, Ljava/lang/String;

    .line 614
    .line 615
    new-instance v14, Lgd5;

    .line 616
    .line 617
    invoke-direct {v14, v13, v9}, Lgd5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    iget-object v13, v6, Lhd5;->o:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v13, Landroidx/work/impl/WorkDatabase_Impl;

    .line 623
    .line 624
    invoke-virtual {v13}, Ls24;->b()V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v13}, Ls24;->c()V

    .line 628
    .line 629
    .line 630
    :try_start_3
    iget-object v15, v6, Lhd5;->p:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v15, Lvo0;

    .line 633
    .line 634
    invoke-virtual {v15, v14}, Lvo0;->m(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v13}, Ls24;->t()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 638
    .line 639
    .line 640
    invoke-virtual {v13}, Ls24;->o()V

    .line 641
    .line 642
    .line 643
    goto :goto_14

    .line 644
    :catchall_2
    move-exception v0

    .line 645
    invoke-virtual {v13}, Ls24;->o()V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :cond_1e
    if-nez v22, :cond_1f

    .line 650
    .line 651
    invoke-virtual/range {v23 .. v23}, Landroidx/work/impl/WorkDatabase;->y()Lxc5;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    new-instance v6, Lwc5;

    .line 656
    .line 657
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v9

    .line 661
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    invoke-direct {v6, v5, v9}, Lwc5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    iget-object v9, v3, Lxc5;->o:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v9, Landroidx/work/impl/WorkDatabase_Impl;

    .line 670
    .line 671
    invoke-virtual {v9}, Ls24;->b()V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v9}, Ls24;->c()V

    .line 675
    .line 676
    .line 677
    :try_start_4
    iget-object v3, v3, Lxc5;->p:Ljava/lang/Object;

    .line 678
    .line 679
    check-cast v3, Lvo0;

    .line 680
    .line 681
    invoke-virtual {v3, v6}, Lvo0;->m(Ljava/lang/Object;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v9}, Ls24;->t()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 685
    .line 686
    .line 687
    invoke-virtual {v9}, Ls24;->o()V

    .line 688
    .line 689
    .line 690
    goto :goto_15

    .line 691
    :catchall_3
    move-exception v0

    .line 692
    invoke-virtual {v9}, Ls24;->o()V

    .line 693
    .line 694
    .line 695
    throw v0

    .line 696
    :cond_1f
    :goto_15
    const/4 v9, 0x0

    .line 697
    goto/16 :goto_11

    .line 698
    .line 699
    :catchall_4
    move-exception v0

    .line 700
    invoke-virtual {v15}, Ls24;->o()V

    .line 701
    .line 702
    .line 703
    throw v0

    .line 704
    :cond_20
    move v4, v12

    .line 705
    goto/16 :goto_3

    .line 706
    .line 707
    :goto_16
    iput-boolean v9, v0, Lmc5;->g:Z

    .line 708
    .line 709
    return v4
.end method
