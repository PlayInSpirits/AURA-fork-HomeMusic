.class public final synthetic Ldefpackage/ei0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/ei0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/ei0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/ei0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/ei0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, Ldefpackage/ei0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/ei0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Ldefpackage/pd5;

    .line 16
    .line 17
    check-cast v5, Ldefpackage/td5;

    .line 18
    .line 19
    iget-object v0, v5, Ldefpackage/td5;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, v5, Ldefpackage/td5;->i:Ldefpackage/fd5;

    .line 22
    .line 23
    instance-of v6, p0, Ldefpackage/nd5;

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    if-eqz v6, :cond_8

    .line 27
    .line 28
    check-cast p0, Ldefpackage/nd5;

    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/nd5;->a:Ldefpackage/nc2;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ldefpackage/fd5;->g(Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    iget-object v6, v5, Ldefpackage/td5;->h:Landroidx/work/impl/WorkDatabase;

    .line 37
    .line 38
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->z()Ldefpackage/yc5;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v8, v6, Ldefpackage/yc5;->n:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v8, Landroidx/work/impl/WorkDatabase_Impl;

    .line 45
    .line 46
    invoke-virtual {v8}, Ldefpackage/s24;->b()V

    .line 47
    .line 48
    .line 49
    iget-object v6, v6, Ldefpackage/yc5;->o:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Ldefpackage/aq4;

    .line 52
    .line 53
    invoke-virtual {v6}, Ldefpackage/rx1;->a()Ldefpackage/df1;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-interface {v9, v7, v0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v8}, Ldefpackage/s24;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 61
    .line 62
    .line 63
    :try_start_1
    invoke-virtual {v9}, Ldefpackage/df1;->b()I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v8}, Ldefpackage/s24;->t()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 67
    .line 68
    .line 69
    :try_start_2
    invoke-virtual {v8}, Ldefpackage/s24;->o()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v9}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 73
    .line 74
    .line 75
    if-nez v4, :cond_0

    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_0
    if-ne v4, v2, :cond_7

    .line 80
    .line 81
    iget-object v2, v5, Ldefpackage/td5;->a:Ldefpackage/dd5;

    .line 82
    .line 83
    iget-object v4, v5, Ldefpackage/td5;->l:Ljava/lang/String;

    .line 84
    .line 85
    instance-of v6, p0, Ldefpackage/mc2;

    .line 86
    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    sget-object v6, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    new-instance v9, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v10, "Worker result SUCCESS for "

    .line 98
    .line 99
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v8, v6, v4}, Ldefpackage/cx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Ldefpackage/dd5;->d()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_1

    .line 117
    .line 118
    invoke-virtual {v5}, Ldefpackage/td5;->c()V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_5

    .line 122
    .line 123
    :cond_1
    const/4 v2, 0x3

    .line 124
    invoke-virtual {v1, v2, v0}, Ldefpackage/fd5;->n(ILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    check-cast p0, Ldefpackage/mc2;

    .line 128
    .line 129
    iget-object p0, p0, Ldefpackage/mc2;->a:Ldefpackage/oh0;

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v0, p0}, Ldefpackage/fd5;->m(Ljava/lang/String;Ldefpackage/oh0;)V

    .line 135
    .line 136
    .line 137
    iget-object p0, v5, Ldefpackage/td5;->f:Ldefpackage/xi4;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 143
    .line 144
    .line 145
    move-result-wide v8

    .line 146
    iget-object p0, v5, Ldefpackage/td5;->j:Ldefpackage/wo0;

    .line 147
    .line 148
    invoke-virtual {p0, v0}, Ldefpackage/wo0;->w(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    move v4, v3

    .line 157
    :cond_2
    :goto_0
    if-ge v4, v2, :cond_b

    .line 158
    .line 159
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    check-cast v5, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v1, v5}, Ldefpackage/fd5;->g(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    const/4 v10, 0x5

    .line 172
    if-ne v6, v10, :cond_2

    .line 173
    .line 174
    const-string v6, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    .line 175
    .line 176
    invoke-static {v7, v6}, Ldefpackage/w24;->b(ILjava/lang/String;)Ldefpackage/w24;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-virtual {v6, v7, v5}, Ldefpackage/w24;->h(ILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iget-object v10, p0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v10, Landroidx/work/impl/WorkDatabase_Impl;

    .line 186
    .line 187
    invoke-virtual {v10}, Ldefpackage/s24;->b()V

    .line 188
    .line 189
    .line 190
    invoke-static {v10, v6}, Ldefpackage/xl;->H(Ldefpackage/s24;Ldefpackage/wo4;)Landroid/database/Cursor;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    :try_start_3
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-eqz v11, :cond_3

    .line 199
    .line 200
    invoke-interface {v10, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 201
    .line 202
    .line 203
    move-result v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 204
    if-eqz v11, :cond_3

    .line 205
    .line 206
    move v11, v7

    .line 207
    goto :goto_1

    .line 208
    :catchall_0
    move-exception v0

    .line 209
    move-object p0, v0

    .line 210
    goto :goto_2

    .line 211
    :cond_3
    move v11, v3

    .line 212
    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6}, Ldefpackage/w24;->j()V

    .line 216
    .line 217
    .line 218
    if-eqz v11, :cond_2

    .line 219
    .line 220
    sget-object v6, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    const-string v11, "Setting status to enqueued for "

    .line 227
    .line 228
    invoke-virtual {v11, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v11

    .line 232
    invoke-virtual {v10, v6, v11}, Ldefpackage/cx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v7, v5}, Ldefpackage/fd5;->n(ILjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v5, v8, v9}, Ldefpackage/fd5;->l(Ljava/lang/String;J)V

    .line 239
    .line 240
    .line 241
    goto :goto_0

    .line 242
    :goto_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6}, Ldefpackage/w24;->j()V

    .line 246
    .line 247
    .line 248
    throw p0

    .line 249
    :cond_4
    instance-of v0, p0, Ldefpackage/lc2;

    .line 250
    .line 251
    if-eqz v0, :cond_5

    .line 252
    .line 253
    sget-object p0, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 254
    .line 255
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    new-instance v1, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v2, "Worker result RETRY for "

    .line 262
    .line 263
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v0, p0, v1}, Ldefpackage/cx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const/16 p0, -0x100

    .line 277
    .line 278
    invoke-virtual {v5, p0}, Ldefpackage/td5;->b(I)V

    .line 279
    .line 280
    .line 281
    :goto_3
    move v3, v7

    .line 282
    goto/16 :goto_5

    .line 283
    .line 284
    :cond_5
    sget-object v0, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 285
    .line 286
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    new-instance v6, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    const-string v7, "Worker result FAILURE for "

    .line 293
    .line 294
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    invoke-virtual {v1, v0, v4}, Ldefpackage/cx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Ldefpackage/dd5;->d()Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_6

    .line 312
    .line 313
    invoke-virtual {v5}, Ldefpackage/td5;->c()V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_5

    .line 317
    .line 318
    :cond_6
    invoke-virtual {v5, p0}, Ldefpackage/td5;->d(Ldefpackage/nc2;)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_5

    .line 322
    .line 323
    :cond_7
    invoke-static {v4}, Ldefpackage/f34;->c(I)Z

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    if-nez p0, :cond_b

    .line 328
    .line 329
    const/16 p0, -0x200

    .line 330
    .line 331
    invoke-virtual {v5, p0}, Ldefpackage/td5;->b(I)V

    .line 332
    .line 333
    .line 334
    goto :goto_3

    .line 335
    :catchall_1
    move-exception v0

    .line 336
    move-object p0, v0

    .line 337
    goto :goto_4

    .line 338
    :catchall_2
    move-exception v0

    .line 339
    move-object p0, v0

    .line 340
    :try_start_4
    invoke-virtual {v8}, Ldefpackage/s24;->o()V

    .line 341
    .line 342
    .line 343
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 344
    :goto_4
    invoke-virtual {v6, v9}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 345
    .line 346
    .line 347
    throw p0

    .line 348
    :cond_8
    instance-of v2, p0, Ldefpackage/md5;

    .line 349
    .line 350
    if-eqz v2, :cond_9

    .line 351
    .line 352
    check-cast p0, Ldefpackage/md5;

    .line 353
    .line 354
    iget-object p0, p0, Ldefpackage/md5;->a:Ldefpackage/nc2;

    .line 355
    .line 356
    invoke-virtual {v5, p0}, Ldefpackage/td5;->d(Ldefpackage/nc2;)V

    .line 357
    .line 358
    .line 359
    goto :goto_5

    .line 360
    :cond_9
    instance-of v2, p0, Ldefpackage/od5;

    .line 361
    .line 362
    if-eqz v2, :cond_c

    .line 363
    .line 364
    check-cast p0, Ldefpackage/od5;

    .line 365
    .line 366
    iget p0, p0, Ldefpackage/od5;->a:I

    .line 367
    .line 368
    invoke-virtual {v1, v0}, Ldefpackage/fd5;->g(Ljava/lang/String;)I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    const-string v4, " is "

    .line 373
    .line 374
    const-string v5, "Status for "

    .line 375
    .line 376
    if-eqz v2, :cond_a

    .line 377
    .line 378
    invoke-static {v2}, Ldefpackage/f34;->c(I)Z

    .line 379
    .line 380
    .line 381
    move-result v6

    .line 382
    if-nez v6, :cond_a

    .line 383
    .line 384
    sget-object v3, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 385
    .line 386
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    invoke-static {v5, v0, v4}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    move-result-object v4

    .line 394
    invoke-static {v2}, Ldefpackage/f34;->q(I)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    const-string v2, "; not doing any work and rescheduling for later execution"

    .line 402
    .line 403
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    invoke-virtual {v6, v3, v2}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1, v7, v0}, Ldefpackage/fd5;->n(ILjava/lang/String;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, p0, v0}, Ldefpackage/fd5;->o(ILjava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const-wide/16 v2, -0x1

    .line 420
    .line 421
    invoke-virtual {v1, v0, v2, v3}, Ldefpackage/fd5;->j(Ljava/lang/String;J)V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_3

    .line 425
    .line 426
    :cond_a
    sget-object p0, Ldefpackage/ud5;->a:Ljava/lang/String;

    .line 427
    .line 428
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-static {v5, v0, v4}, Ldefpackage/xa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-static {v2}, Ldefpackage/f34;->q(I)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    const-string v2, " ; not doing any work"

    .line 444
    .line 445
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v1, p0, v0}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    :cond_b
    :goto_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    goto :goto_6

    .line 460
    :cond_c
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 461
    .line 462
    .line 463
    :goto_6
    return-object v4

    .line 464
    :pswitch_0
    check-cast p0, Ljava/lang/String;

    .line 465
    .line 466
    check-cast v5, Ldefpackage/f25;

    .line 467
    .line 468
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    const-string v1, "UpnpControlPoint"

    .line 472
    .line 473
    const-string v0, "description is over 1048576 bytes, ignoring it: "

    .line 474
    .line 475
    :try_start_5
    iget-object v2, v5, Ldefpackage/f25;->b:Ldefpackage/rp4;

    .line 476
    .line 477
    invoke-virtual {v2}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    check-cast v2, Ldefpackage/o83;

    .line 482
    .line 483
    new-instance v3, Ldefpackage/nz3;

    .line 484
    .line 485
    invoke-direct {v3}, Ldefpackage/nz3;-><init>()V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3, p0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    new-instance v5, Ldefpackage/oz3;

    .line 492
    .line 493
    invoke-direct {v5, v3}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    new-instance v3, Ldefpackage/bv3;

    .line 500
    .line 501
    invoke-direct {v3, v2, v5}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 505
    .line 506
    .line 507
    move-result-object v2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 508
    :try_start_6
    iget-object v3, v2, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 509
    .line 510
    iget-boolean v5, v2, Ldefpackage/k14;->C:Z

    .line 511
    .line 512
    if-nez v5, :cond_d

    .line 513
    .line 514
    :goto_7
    move-object v0, v4

    .line 515
    goto :goto_8

    .line 516
    :cond_d
    invoke-virtual {v3}, Ldefpackage/n14;->source()Ldefpackage/fw;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    const-wide/32 v6, 0x100001

    .line 521
    .line 522
    .line 523
    invoke-interface {v5, v6, v7}, Ldefpackage/fw;->G(J)Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    if-eqz v5, :cond_e

    .line 528
    .line 529
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    goto :goto_7

    .line 537
    :catchall_3
    move-exception v0

    .line 538
    move-object v3, v0

    .line 539
    goto :goto_9

    .line 540
    :cond_e
    invoke-virtual {v3}, Ldefpackage/n14;->string()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 544
    :goto_8
    :try_start_7
    invoke-virtual {v2}, Ldefpackage/k14;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 545
    .line 546
    .line 547
    move-object v4, v0

    .line 548
    goto :goto_b

    .line 549
    :catch_0
    move-exception v0

    .line 550
    goto :goto_a

    .line 551
    :goto_9
    :try_start_8
    throw v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 552
    :catchall_4
    move-exception v0

    .line 553
    :try_start_9
    invoke-static {v2, v3}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    throw v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 557
    :goto_a
    new-instance v2, Ljava/lang/StringBuilder;

    .line 558
    .line 559
    const-string v3, "GET failed: "

    .line 560
    .line 561
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    invoke-static {v1, v2, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 572
    .line 573
    .line 574
    :goto_b
    new-instance v0, Ldefpackage/kd3;

    .line 575
    .line 576
    invoke-direct {v0, p0, v4}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_1
    check-cast p0, Ldefpackage/gp3;

    .line 581
    .line 582
    check-cast v5, Ljava/lang/String;

    .line 583
    .line 584
    :try_start_a
    invoke-virtual {p0, v5}, Ldefpackage/gp3;->m(Ljava/lang/String;)Lretrofit2/Call;

    .line 585
    .line 586
    .line 587
    move-result-object p0

    .line 588
    invoke-interface {p0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    invoke-virtual {p0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    check-cast p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 597
    .line 598
    if-eqz p0, :cond_f

    .line 599
    .line 600
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 601
    .line 602
    .line 603
    move-result-object p0

    .line 604
    if-eqz p0, :cond_f

    .line 605
    .line 606
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSong()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 607
    .line 608
    .line 609
    move-result-object p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 610
    goto :goto_d

    .line 611
    :catchall_5
    move-exception v0

    .line 612
    move-object p0, v0

    .line 613
    goto :goto_c

    .line 614
    :cond_f
    move-object p0, v4

    .line 615
    goto :goto_d

    .line 616
    :goto_c
    new-instance v0, Ldefpackage/s14;

    .line 617
    .line 618
    invoke-direct {v0, p0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 619
    .line 620
    .line 621
    move-object p0, v0

    .line 622
    :goto_d
    invoke-static {p0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    if-eqz v0, :cond_10

    .line 627
    .line 628
    new-instance v1, Ljava/lang/StringBuilder;

    .line 629
    .line 630
    const-string v2, "getSong("

    .line 631
    .line 632
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    const-string v2, ")"

    .line 639
    .line 640
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    const-string v2, "HubPlayer"

    .line 648
    .line 649
    invoke-static {v2, v1, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 650
    .line 651
    .line 652
    :cond_10
    instance-of v0, p0, Ldefpackage/s14;

    .line 653
    .line 654
    if-eqz v0, :cond_11

    .line 655
    .line 656
    goto :goto_e

    .line 657
    :cond_11
    move-object v4, p0

    .line 658
    :goto_e
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 659
    .line 660
    return-object v4

    .line 661
    :pswitch_2
    check-cast p0, Ldefpackage/fi0;

    .line 662
    .line 663
    move-object v7, v5

    .line 664
    check-cast v7, Landroid/net/Uri;

    .line 665
    .line 666
    iget-object v0, p0, Ldefpackage/fi0;->o:Ldefpackage/rf2;

    .line 667
    .line 668
    invoke-virtual {v0}, Ldefpackage/rf2;->m()Ldefpackage/ci0;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    iget v0, p0, Ldefpackage/fi0;->p:I

    .line 673
    .line 674
    iget-boolean p0, p0, Ldefpackage/fi0;->q:Z

    .line 675
    .line 676
    :try_start_b
    new-instance v6, Ldefpackage/ii0;

    .line 677
    .line 678
    const-wide/16 v8, 0x0

    .line 679
    .line 680
    const-wide/16 v10, -0x1

    .line 681
    .line 682
    invoke-direct/range {v6 .. v11}, Ldefpackage/ii0;-><init>(Landroid/net/Uri;JJ)V

    .line 683
    .line 684
    .line 685
    move-object v5, v4

    .line 686
    check-cast v5, Ldefpackage/zj0;

    .line 687
    .line 688
    invoke-virtual {v5, v6}, Ldefpackage/zj0;->b(Ldefpackage/ii0;)J

    .line 689
    .line 690
    .line 691
    const/16 v6, 0x400

    .line 692
    .line 693
    new-array v6, v6, [B

    .line 694
    .line 695
    move-object v7, v6

    .line 696
    move v6, v3

    .line 697
    :cond_12
    :goto_f
    const/4 v8, -0x1

    .line 698
    if-eq v3, v8, :cond_14

    .line 699
    .line 700
    array-length v3, v7

    .line 701
    if-ne v6, v3, :cond_13

    .line 702
    .line 703
    array-length v3, v7

    .line 704
    mul-int/2addr v3, v2

    .line 705
    invoke-static {v7, v3}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    move-object v7, v3

    .line 710
    :cond_13
    array-length v3, v7

    .line 711
    sub-int/2addr v3, v6

    .line 712
    invoke-virtual {v5, v7, v6, v3}, Ldefpackage/zj0;->read([BII)I

    .line 713
    .line 714
    .line 715
    move-result v3

    .line 716
    if-eq v3, v8, :cond_12

    .line 717
    .line 718
    add-int/2addr v6, v3

    .line 719
    goto :goto_f

    .line 720
    :cond_14
    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    array-length v3, v2

    .line 725
    invoke-static {v2, v3, v0}, Ldefpackage/gb;->s([BII)Landroid/graphics/Bitmap;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    if-eqz p0, :cond_15

    .line 730
    .line 731
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 732
    .line 733
    if-lt p0, v1, :cond_15

    .line 734
    .line 735
    invoke-static {v0}, Ldefpackage/db;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 736
    .line 737
    .line 738
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 739
    :cond_15
    invoke-virtual {v5}, Ldefpackage/zj0;->close()V

    .line 740
    .line 741
    .line 742
    return-object v0

    .line 743
    :catchall_6
    move-exception v0

    .line 744
    move-object p0, v0

    .line 745
    check-cast v4, Ldefpackage/zj0;

    .line 746
    .line 747
    invoke-virtual {v4}, Ldefpackage/zj0;->close()V

    .line 748
    .line 749
    .line 750
    throw p0

    .line 751
    :pswitch_3
    check-cast p0, Ldefpackage/fi0;

    .line 752
    .line 753
    check-cast v5, [B

    .line 754
    .line 755
    iget-boolean v0, p0, Ldefpackage/fi0;->q:Z

    .line 756
    .line 757
    array-length v2, v5

    .line 758
    iget p0, p0, Ldefpackage/fi0;->p:I

    .line 759
    .line 760
    invoke-static {v5, v2, p0}, Ldefpackage/gb;->s([BII)Landroid/graphics/Bitmap;

    .line 761
    .line 762
    .line 763
    move-result-object p0

    .line 764
    if-eqz v0, :cond_16

    .line 765
    .line 766
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 767
    .line 768
    if-lt v0, v1, :cond_16

    .line 769
    .line 770
    invoke-static {p0}, Ldefpackage/db;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 771
    .line 772
    .line 773
    move-result-object p0

    .line 774
    :cond_16
    return-object p0

    .line 775
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
