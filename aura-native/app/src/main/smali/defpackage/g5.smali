.class public final Ldefpackage/g5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/g5;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ldefpackage/g5;->n:I

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const-wide/16 v4, 0x3a98

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const-wide/16 v9, 0x3e8

    .line 12
    .line 13
    const-wide/16 v11, -0x1

    .line 14
    .line 15
    const/4 v13, 0x0

    .line 16
    const/4 v14, 0x2

    .line 17
    const/4 v15, 0x1

    .line 18
    const-wide/16 v16, 0x0

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, Ldefpackage/gr4;

    .line 28
    .line 29
    iget-object v3, v2, Ldefpackage/gr4;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 30
    .line 31
    :cond_0
    :goto_0
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-virtual {v2}, Ldefpackage/gr4;->c()Ldefpackage/ar4;

    .line 35
    .line 36
    .line 37
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 38
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 39
    .line 40
    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object v5, v2, Ldefpackage/gr4;->b:Ljava/util/logging/Logger;

    .line 45
    .line 46
    iget-object v6, v4, Ldefpackage/ar4;->c:Ldefpackage/fr4;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 52
    .line 53
    invoke-virtual {v5, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_2

    .line 58
    .line 59
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 60
    .line 61
    .line 62
    move-result-wide v8

    .line 63
    const-string v0, "starting"

    .line 64
    .line 65
    invoke-static {v5, v4, v6, v0}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-wide v8, v11

    .line 70
    :goto_1
    :try_start_1
    invoke-static {v2, v4}, Ldefpackage/gr4;->a(Ldefpackage/gr4;Ldefpackage/ar4;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    if-eqz v7, :cond_0

    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 76
    .line 77
    .line 78
    move-result-wide v13

    .line 79
    sub-long/2addr v13, v8

    .line 80
    invoke-static {v13, v14}, Ldefpackage/zz1;->n(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v7, "finished run in "

    .line 85
    .line 86
    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v5, v4, v6, v0}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    :try_start_2
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    .line 97
    .line 98
    :try_start_3
    iget-object v2, v2, Ldefpackage/gr4;->a:Ldefpackage/rm2;

    .line 99
    .line 100
    iget-object v2, v2, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 105
    .line 106
    .line 107
    :try_start_4
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :catchall_1
    move-exception v0

    .line 112
    goto :goto_2

    .line 113
    :catchall_2
    move-exception v0

    .line 114
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 115
    .line 116
    .line 117
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 118
    :goto_2
    if-eqz v7, :cond_3

    .line 119
    .line 120
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    sub-long/2addr v1, v8

    .line 125
    invoke-static {v1, v2}, Ldefpackage/zz1;->n(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const-string v2, "failed a run in "

    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v5, v4, v6, v1}, Ldefpackage/zz1;->c(Ljava/util/logging/Logger;Ldefpackage/ar4;Ldefpackage/fr4;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    throw v0

    .line 139
    :catchall_3
    move-exception v0

    .line 140
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :pswitch_0
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->F0()Z

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_1
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v0, Ldefpackage/c04;

    .line 155
    .line 156
    iget-object v1, v0, Ldefpackage/c04;->p:Ldefpackage/s92;

    .line 157
    .line 158
    invoke-interface {v1, v0}, Ldefpackage/s92;->f(Ldefpackage/z92;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_2
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Ldefpackage/ip0;

    .line 165
    .line 166
    invoke-virtual {v0}, Ldefpackage/ip0;->c()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_3
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Ldefpackage/np3;

    .line 173
    .line 174
    invoke-virtual {v0}, Ldefpackage/np3;->s()V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :pswitch_4
    monitor-enter p0

    .line 179
    :try_start_5
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, Landroidx/preference/PreferenceGroup;

    .line 182
    .line 183
    iget-object v0, v0, Landroidx/preference/PreferenceGroup;->b0:Ldefpackage/yd4;

    .line 184
    .line 185
    invoke-virtual {v0}, Ldefpackage/yd4;->clear()V

    .line 186
    .line 187
    .line 188
    monitor-exit p0

    .line 189
    return-void

    .line 190
    :catchall_4
    move-exception v0

    .line 191
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 192
    throw v0

    .line 193
    :pswitch_5
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, Ldefpackage/kp3;

    .line 196
    .line 197
    iget-object v0, v0, Ldefpackage/kp3;->n0:Landroidx/recyclerview/widget/RecyclerView;

    .line 198
    .line 199
    invoke-virtual {v0, v0}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :pswitch_6
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Ldefpackage/op2;

    .line 206
    .line 207
    iget-object v0, v0, Ldefpackage/op2;->b:Ldefpackage/qp2;

    .line 208
    .line 209
    iget-object v1, v0, Ldefpackage/qp2;->Z:Ldefpackage/wq2;

    .line 210
    .line 211
    if-eqz v1, :cond_4

    .line 212
    .line 213
    iput-object v13, v0, Ldefpackage/qp2;->Z:Ldefpackage/wq2;

    .line 214
    .line 215
    iget-boolean v1, v0, Ldefpackage/qp2;->o0:Z

    .line 216
    .line 217
    if-eqz v1, :cond_4

    .line 218
    .line 219
    iget-boolean v1, v0, Ldefpackage/qp2;->p0:Z

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ldefpackage/qp2;->t(Z)V

    .line 222
    .line 223
    .line 224
    :cond_4
    return-void

    .line 225
    :pswitch_7
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Ldefpackage/qp2;

    .line 228
    .line 229
    invoke-virtual {v0, v15}, Ldefpackage/qp2;->m(Z)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v0, Ldefpackage/qp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 235
    .line 236
    .line 237
    iget-object v1, v0, Ldefpackage/qp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    new-instance v2, Ldefpackage/sg;

    .line 244
    .line 245
    const/4 v3, 0x4

    .line 246
    invoke-direct {v2, v3, v0}, Ldefpackage/sg;-><init>(ILjava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :pswitch_8
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, Ldefpackage/oj2;

    .line 256
    .line 257
    iget-object v1, v0, Ldefpackage/oj2;->g:Ldefpackage/pn2;

    .line 258
    .line 259
    iget-object v1, v1, Ldefpackage/pn2;->r:Ldefpackage/oi;

    .line 260
    .line 261
    iget-object v0, v0, Ldefpackage/oj2;->e:Ldefpackage/hg3;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object v0, v0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Landroid/os/Messenger;

    .line 269
    .line 270
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v1, v0}, Ldefpackage/yd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_9
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, Ldefpackage/kd2;

    .line 281
    .line 282
    invoke-interface {v0}, Ldefpackage/kd2;->a()V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :pswitch_a
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Ldefpackage/ad2;

    .line 289
    .line 290
    iget-object v2, v0, Ldefpackage/ad2;->a:Ljava/lang/Object;

    .line 291
    .line 292
    monitor-enter v2

    .line 293
    :try_start_6
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Ldefpackage/ad2;

    .line 296
    .line 297
    iget-object v0, v0, Ldefpackage/ad2;->f:Ljava/lang/Object;

    .line 298
    .line 299
    iget-object v3, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v3, Ldefpackage/ad2;

    .line 302
    .line 303
    sget-object v4, Ldefpackage/ad2;->k:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v4, v3, Ldefpackage/ad2;->f:Ljava/lang/Object;

    .line 306
    .line 307
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 308
    iget-object v1, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v1, Ldefpackage/ad2;

    .line 311
    .line 312
    invoke-virtual {v1, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :catchall_5
    move-exception v0

    .line 317
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 318
    throw v0

    .line 319
    :pswitch_b
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Ldefpackage/h62;

    .line 322
    .line 323
    iget-boolean v2, v0, Ldefpackage/h62;->L0:Z

    .line 324
    .line 325
    if-nez v2, :cond_5

    .line 326
    .line 327
    goto/16 :goto_5

    .line 328
    .line 329
    :cond_5
    invoke-virtual {v0}, Ldefpackage/h62;->p0()V

    .line 330
    .line 331
    .line 332
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 333
    .line 334
    sget-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 335
    .line 336
    if-eqz v0, :cond_7

    .line 337
    .line 338
    iget-object v2, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v2, Ldefpackage/h62;

    .line 341
    .line 342
    iget-object v2, v2, Ldefpackage/h62;->A0:Landroidx/preference/Preference;

    .line 343
    .line 344
    if-eqz v2, :cond_6

    .line 345
    .line 346
    invoke-virtual {v2, v0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_6
    const-string v0, "status"

    .line 351
    .line 352
    invoke-static {v0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v13

    .line 356
    :cond_7
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 357
    .line 358
    .line 359
    move-result-wide v2

    .line 360
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Ldefpackage/h62;

    .line 363
    .line 364
    iget-object v0, v0, Ldefpackage/h62;->G0:Ljava/util/LinkedHashMap;

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    check-cast v0, Ljava/lang/Iterable;

    .line 374
    .line 375
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v4

    .line 383
    if-eqz v4, :cond_9

    .line 384
    .line 385
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    check-cast v4, Ljava/util/Map$Entry;

    .line 390
    .line 391
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    check-cast v4, Ldefpackage/c62;

    .line 399
    .line 400
    iget-wide v4, v4, Ldefpackage/c62;->b:J

    .line 401
    .line 402
    sub-long v4, v2, v4

    .line 403
    .line 404
    const-wide/32 v7, 0xafc8

    .line 405
    .line 406
    .line 407
    cmp-long v4, v4, v7

    .line 408
    .line 409
    if-ltz v4, :cond_8

    .line 410
    .line 411
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 412
    .line 413
    .line 414
    move v6, v15

    .line 415
    goto :goto_4

    .line 416
    :cond_9
    if-eqz v6, :cond_a

    .line 417
    .line 418
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, Ldefpackage/h62;

    .line 421
    .line 422
    invoke-virtual {v0}, Ldefpackage/h62;->n0()V

    .line 423
    .line 424
    .line 425
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v0, Ldefpackage/h62;

    .line 428
    .line 429
    iget-object v0, v0, Ldefpackage/h62;->G0:Ljava/util/LinkedHashMap;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_a

    .line 436
    .line 437
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, Ldefpackage/h62;

    .line 440
    .line 441
    iget-boolean v2, v0, Ldefpackage/h62;->O0:Z

    .line 442
    .line 443
    if-nez v2, :cond_a

    .line 444
    .line 445
    iget-boolean v2, v0, Ldefpackage/h62;->N0:Z

    .line 446
    .line 447
    if-nez v2, :cond_a

    .line 448
    .line 449
    const v2, 0x7f1302e1

    .line 450
    .line 451
    .line 452
    invoke-virtual {v0, v2}, Ldefpackage/h62;->s0(I)V

    .line 453
    .line 454
    .line 455
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v0, Ldefpackage/h62;

    .line 458
    .line 459
    invoke-virtual {v0}, Ldefpackage/h62;->q0()V

    .line 460
    .line 461
    .line 462
    :cond_a
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Ldefpackage/h62;

    .line 465
    .line 466
    iget-object v0, v0, Ldefpackage/h62;->D0:Landroid/os/Handler;

    .line 467
    .line 468
    invoke-virtual {v0, v1, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 469
    .line 470
    .line 471
    :goto_5
    return-void

    .line 472
    :pswitch_c
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v0, Ldefpackage/f22;

    .line 475
    .line 476
    iget-object v2, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 477
    .line 478
    if-eqz v2, :cond_18

    .line 479
    .line 480
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 481
    .line 482
    .line 483
    move-result-wide v2

    .line 484
    iget-wide v4, v0, Ldefpackage/f22;->B:J

    .line 485
    .line 486
    const-wide/high16 v9, -0x8000000000000000L

    .line 487
    .line 488
    cmp-long v7, v4, v9

    .line 489
    .line 490
    if-nez v7, :cond_b

    .line 491
    .line 492
    move-wide/from16 v15, v16

    .line 493
    .line 494
    goto :goto_6

    .line 495
    :cond_b
    sub-long v4, v2, v4

    .line 496
    .line 497
    move-wide v15, v4

    .line 498
    :goto_6
    iget-object v4, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 499
    .line 500
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ldefpackage/mw3;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    iget-object v5, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 505
    .line 506
    if-nez v5, :cond_c

    .line 507
    .line 508
    new-instance v5, Landroid/graphics/Rect;

    .line 509
    .line 510
    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 511
    .line 512
    .line 513
    iput-object v5, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 514
    .line 515
    :cond_c
    iget-object v5, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 516
    .line 517
    iget-object v5, v5, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 518
    .line 519
    iget-object v7, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 520
    .line 521
    iget-object v11, v4, Ldefpackage/mw3;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 522
    .line 523
    if-nez v11, :cond_d

    .line 524
    .line 525
    invoke-virtual {v7, v6, v6, v6, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 526
    .line 527
    .line 528
    goto :goto_7

    .line 529
    :cond_d
    invoke-virtual {v11, v5}, Landroidx/recyclerview/widget/RecyclerView;->P(Landroid/view/View;)Landroid/graphics/Rect;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-virtual {v7, v5}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 534
    .line 535
    .line 536
    :goto_7
    invoke-virtual {v4}, Ldefpackage/mw3;->d()Z

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    if-eqz v5, :cond_f

    .line 541
    .line 542
    iget v5, v0, Ldefpackage/f22;->j:F

    .line 543
    .line 544
    iget v7, v0, Ldefpackage/f22;->h:F

    .line 545
    .line 546
    add-float/2addr v5, v7

    .line 547
    float-to-int v5, v5

    .line 548
    iget-object v7, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 549
    .line 550
    iget v7, v7, Landroid/graphics/Rect;->left:I

    .line 551
    .line 552
    sub-int v7, v5, v7

    .line 553
    .line 554
    iget-object v11, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 555
    .line 556
    invoke-virtual {v11}, Landroid/view/View;->getPaddingLeft()I

    .line 557
    .line 558
    .line 559
    move-result v11

    .line 560
    sub-int/2addr v7, v11

    .line 561
    iget v11, v0, Ldefpackage/f22;->h:F

    .line 562
    .line 563
    cmpg-float v12, v11, v8

    .line 564
    .line 565
    if-gez v12, :cond_e

    .line 566
    .line 567
    if-gez v7, :cond_e

    .line 568
    .line 569
    :goto_8
    move v14, v7

    .line 570
    goto :goto_9

    .line 571
    :cond_e
    cmpl-float v7, v11, v8

    .line 572
    .line 573
    if-lez v7, :cond_f

    .line 574
    .line 575
    iget-object v7, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 576
    .line 577
    iget-object v7, v7, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 578
    .line 579
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 580
    .line 581
    .line 582
    move-result v7

    .line 583
    add-int/2addr v7, v5

    .line 584
    iget-object v5, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 585
    .line 586
    iget v5, v5, Landroid/graphics/Rect;->right:I

    .line 587
    .line 588
    add-int/2addr v7, v5

    .line 589
    iget-object v5, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 590
    .line 591
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    iget-object v11, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 596
    .line 597
    invoke-virtual {v11}, Landroid/view/View;->getPaddingRight()I

    .line 598
    .line 599
    .line 600
    move-result v11

    .line 601
    sub-int/2addr v5, v11

    .line 602
    sub-int/2addr v7, v5

    .line 603
    if-lez v7, :cond_f

    .line 604
    .line 605
    goto :goto_8

    .line 606
    :cond_f
    move v14, v6

    .line 607
    :goto_9
    invoke-virtual {v4}, Ldefpackage/mw3;->e()Z

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    if-eqz v4, :cond_11

    .line 612
    .line 613
    iget v4, v0, Ldefpackage/f22;->k:F

    .line 614
    .line 615
    iget v5, v0, Ldefpackage/f22;->i:F

    .line 616
    .line 617
    add-float/2addr v4, v5

    .line 618
    float-to-int v4, v4

    .line 619
    iget-object v5, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 620
    .line 621
    iget v5, v5, Landroid/graphics/Rect;->top:I

    .line 622
    .line 623
    sub-int v5, v4, v5

    .line 624
    .line 625
    iget-object v7, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 626
    .line 627
    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    .line 628
    .line 629
    .line 630
    move-result v7

    .line 631
    sub-int/2addr v5, v7

    .line 632
    iget v7, v0, Ldefpackage/f22;->i:F

    .line 633
    .line 634
    cmpg-float v11, v7, v8

    .line 635
    .line 636
    if-gez v11, :cond_10

    .line 637
    .line 638
    if-gez v5, :cond_10

    .line 639
    .line 640
    :goto_a
    move v6, v5

    .line 641
    goto :goto_b

    .line 642
    :cond_10
    cmpl-float v5, v7, v8

    .line 643
    .line 644
    if-lez v5, :cond_11

    .line 645
    .line 646
    iget-object v5, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 647
    .line 648
    iget-object v5, v5, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 649
    .line 650
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    add-int/2addr v5, v4

    .line 655
    iget-object v4, v0, Ldefpackage/f22;->A:Landroid/graphics/Rect;

    .line 656
    .line 657
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 658
    .line 659
    add-int/2addr v5, v4

    .line 660
    iget-object v4, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 661
    .line 662
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    iget-object v7, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 667
    .line 668
    invoke-virtual {v7}, Landroid/view/View;->getPaddingBottom()I

    .line 669
    .line 670
    .line 671
    move-result v7

    .line 672
    sub-int/2addr v4, v7

    .line 673
    sub-int/2addr v5, v4

    .line 674
    if-lez v5, :cond_11

    .line 675
    .line 676
    goto :goto_a

    .line 677
    :cond_11
    :goto_b
    if-eqz v14, :cond_12

    .line 678
    .line 679
    iget-object v11, v0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 680
    .line 681
    iget-object v12, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 682
    .line 683
    iget-object v4, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 684
    .line 685
    iget-object v4, v4, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 686
    .line 687
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 688
    .line 689
    .line 690
    move-result v13

    .line 691
    iget-object v4, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 692
    .line 693
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 694
    .line 695
    .line 696
    invoke-virtual/range {v11 .. v16}, Ldefpackage/e22;->f(Landroidx/recyclerview/widget/RecyclerView;IIJ)I

    .line 697
    .line 698
    .line 699
    move-result v14

    .line 700
    :cond_12
    move v4, v14

    .line 701
    if-eqz v6, :cond_13

    .line 702
    .line 703
    iget-object v11, v0, Ldefpackage/f22;->m:Ldefpackage/e22;

    .line 704
    .line 705
    iget-object v12, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 706
    .line 707
    iget-object v5, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 708
    .line 709
    iget-object v5, v5, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 710
    .line 711
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 712
    .line 713
    .line 714
    move-result v13

    .line 715
    iget-object v5, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 716
    .line 717
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 718
    .line 719
    .line 720
    move v14, v6

    .line 721
    invoke-virtual/range {v11 .. v16}, Ldefpackage/e22;->f(Landroidx/recyclerview/widget/RecyclerView;IIJ)I

    .line 722
    .line 723
    .line 724
    move-result v6

    .line 725
    goto :goto_c

    .line 726
    :cond_13
    move v14, v6

    .line 727
    :goto_c
    if-nez v4, :cond_15

    .line 728
    .line 729
    if-eqz v6, :cond_14

    .line 730
    .line 731
    goto :goto_d

    .line 732
    :cond_14
    iput-wide v9, v0, Ldefpackage/f22;->B:J

    .line 733
    .line 734
    goto :goto_e

    .line 735
    :cond_15
    :goto_d
    iget-wide v7, v0, Ldefpackage/f22;->B:J

    .line 736
    .line 737
    cmp-long v5, v7, v9

    .line 738
    .line 739
    if-nez v5, :cond_16

    .line 740
    .line 741
    iput-wide v2, v0, Ldefpackage/f22;->B:J

    .line 742
    .line 743
    :cond_16
    iget-object v2, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 744
    .line 745
    invoke-virtual {v2, v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 746
    .line 747
    .line 748
    iget-object v2, v0, Ldefpackage/f22;->c:Ldefpackage/cx3;

    .line 749
    .line 750
    if-eqz v2, :cond_17

    .line 751
    .line 752
    invoke-virtual {v0, v2}, Ldefpackage/f22;->q(Ldefpackage/cx3;)V

    .line 753
    .line 754
    .line 755
    :cond_17
    iget-object v2, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 756
    .line 757
    iget-object v3, v0, Ldefpackage/f22;->s:Ldefpackage/g5;

    .line 758
    .line 759
    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 760
    .line 761
    .line 762
    iget-object v0, v0, Ldefpackage/f22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 763
    .line 764
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 765
    .line 766
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 767
    .line 768
    .line 769
    :cond_18
    :goto_e
    return-void

    .line 770
    :pswitch_d
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, Ldefpackage/ps1;

    .line 773
    .line 774
    iget-object v2, v0, Ldefpackage/ps1;->p:Ldefpackage/zq2;

    .line 775
    .line 776
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 777
    .line 778
    .line 779
    move-result-wide v6

    .line 780
    iget-object v3, v2, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v3, Ldefpackage/oh3;

    .line 783
    .line 784
    if-nez v3, :cond_19

    .line 785
    .line 786
    goto :goto_f

    .line 787
    :cond_19
    invoke-virtual {v2, v6, v7}, Ldefpackage/zq2;->e(J)J

    .line 788
    .line 789
    .line 790
    move-result-wide v8

    .line 791
    invoke-virtual {v2, v6, v7}, Ldefpackage/zq2;->a(J)V

    .line 792
    .line 793
    .line 794
    iput-wide v8, v2, Ldefpackage/zq2;->n:J

    .line 795
    .line 796
    iget-object v2, v2, Ldefpackage/zq2;->q:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v2, Ldefpackage/lc;

    .line 799
    .line 800
    const-string v10, "progress"

    .line 801
    .line 802
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 803
    .line 804
    .line 805
    move-result-object v8

    .line 806
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 807
    .line 808
    .line 809
    move-result-object v6

    .line 810
    invoke-virtual {v2, v10, v3, v8, v6}, Ldefpackage/lc;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    :goto_f
    iget-object v0, v0, Ldefpackage/ps1;->q:Landroid/os/Handler;

    .line 814
    .line 815
    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 816
    .line 817
    .line 818
    return-void

    .line 819
    :pswitch_e
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v0, Ldefpackage/ee1;

    .line 822
    .line 823
    iput-boolean v6, v0, Ldefpackage/ee1;->x:Z

    .line 824
    .line 825
    invoke-virtual {v0}, Ldefpackage/ee1;->s()V

    .line 826
    .line 827
    .line 828
    return-void

    .line 829
    :pswitch_f
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 830
    .line 831
    check-cast v0, Ldefpackage/ld1;

    .line 832
    .line 833
    invoke-virtual {v0, v15}, Ldefpackage/ld1;->y(Z)Z

    .line 834
    .line 835
    .line 836
    return-void

    .line 837
    :pswitch_10
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v0, Ldefpackage/kc1;

    .line 840
    .line 841
    iget-object v1, v0, Ldefpackage/kc1;->W:Ldefpackage/hc1;

    .line 842
    .line 843
    if-eqz v1, :cond_1a

    .line 844
    .line 845
    invoke-virtual {v0}, Ldefpackage/kc1;->k()Ldefpackage/hc1;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    :cond_1a
    return-void

    .line 853
    :pswitch_11
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v0, Ldefpackage/e61;

    .line 856
    .line 857
    iget-object v1, v0, Ldefpackage/e61;->z:Landroid/animation/ValueAnimator;

    .line 858
    .line 859
    iget v2, v0, Ldefpackage/e61;->A:I

    .line 860
    .line 861
    if-eq v2, v15, :cond_1b

    .line 862
    .line 863
    if-eq v2, v14, :cond_1c

    .line 864
    .line 865
    goto :goto_10

    .line 866
    :cond_1b
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 867
    .line 868
    .line 869
    :cond_1c
    iput v3, v0, Ldefpackage/e61;->A:I

    .line 870
    .line 871
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    check-cast v0, Ljava/lang/Float;

    .line 876
    .line 877
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    new-array v2, v14, [F

    .line 882
    .line 883
    aput v0, v2, v6

    .line 884
    .line 885
    aput v8, v2, v15

    .line 886
    .line 887
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 888
    .line 889
    .line 890
    const-wide/16 v2, 0x1f4

    .line 891
    .line 892
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 896
    .line 897
    .line 898
    :goto_10
    return-void

    .line 899
    :pswitch_12
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v0, Ldefpackage/jz0;

    .line 902
    .line 903
    invoke-virtual {v0}, Ldefpackage/jz0;->r0()V

    .line 904
    .line 905
    .line 906
    return-void

    .line 907
    :pswitch_13
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast v0, Ldefpackage/cx0;

    .line 910
    .line 911
    iput-object v13, v0, Ldefpackage/cx0;->y:Ldefpackage/g5;

    .line 912
    .line 913
    invoke-virtual {v0}, Ldefpackage/cx0;->drawableStateChanged()V

    .line 914
    .line 915
    .line 916
    return-void

    .line 917
    :pswitch_14
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, Ldefpackage/jw0;

    .line 920
    .line 921
    iget-object v1, v0, Ldefpackage/jw0;->m:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 922
    .line 923
    iget-object v2, v0, Ldefpackage/jw0;->k:Ldefpackage/o65;

    .line 924
    .line 925
    iget v2, v2, Ldefpackage/o65;->o:I

    .line 926
    .line 927
    iget v4, v0, Ldefpackage/jw0;->j:I

    .line 928
    .line 929
    if-ne v4, v3, :cond_1d

    .line 930
    .line 931
    move v5, v15

    .line 932
    goto :goto_11

    .line 933
    :cond_1d
    move v5, v6

    .line 934
    :goto_11
    const/4 v7, 0x5

    .line 935
    if-eqz v5, :cond_1f

    .line 936
    .line 937
    invoke-virtual {v1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 938
    .line 939
    .line 940
    move-result-object v8

    .line 941
    if-eqz v8, :cond_1e

    .line 942
    .line 943
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 944
    .line 945
    .line 946
    move-result v9

    .line 947
    neg-int v9, v9

    .line 948
    goto :goto_12

    .line 949
    :cond_1e
    move v9, v6

    .line 950
    :goto_12
    add-int/2addr v9, v2

    .line 951
    goto :goto_13

    .line 952
    :cond_1f
    invoke-virtual {v1, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 953
    .line 954
    .line 955
    move-result-object v8

    .line 956
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 957
    .line 958
    .line 959
    move-result v9

    .line 960
    sub-int/2addr v9, v2

    .line 961
    :goto_13
    if-eqz v8, :cond_25

    .line 962
    .line 963
    if-eqz v5, :cond_20

    .line 964
    .line 965
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 966
    .line 967
    .line 968
    move-result v2

    .line 969
    if-lt v2, v9, :cond_21

    .line 970
    .line 971
    :cond_20
    if-nez v5, :cond_25

    .line 972
    .line 973
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 974
    .line 975
    .line 976
    move-result v2

    .line 977
    if-le v2, v9, :cond_25

    .line 978
    .line 979
    :cond_21
    invoke-virtual {v1, v8}, Landroidx/drawerlayout/widget/DrawerLayout;->i(Landroid/view/View;)I

    .line 980
    .line 981
    .line 982
    move-result v2

    .line 983
    if-nez v2, :cond_25

    .line 984
    .line 985
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    check-cast v2, Ldefpackage/hw0;

    .line 990
    .line 991
    iget-object v0, v0, Ldefpackage/jw0;->k:Ldefpackage/o65;

    .line 992
    .line 993
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 994
    .line 995
    .line 996
    move-result v5

    .line 997
    invoke-virtual {v0, v8, v9, v5}, Ldefpackage/o65;->s(Landroid/view/View;II)Z

    .line 998
    .line 999
    .line 1000
    iput-boolean v15, v2, Ldefpackage/hw0;->c:Z

    .line 1001
    .line 1002
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 1003
    .line 1004
    .line 1005
    if-ne v4, v3, :cond_22

    .line 1006
    .line 1007
    move v3, v7

    .line 1008
    :cond_22
    invoke-virtual {v1, v3}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v0

    .line 1012
    if-eqz v0, :cond_23

    .line 1013
    .line 1014
    invoke-virtual {v1, v0, v15}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 1015
    .line 1016
    .line 1017
    :cond_23
    iget-boolean v0, v1, Landroidx/drawerlayout/widget/DrawerLayout;->D:Z

    .line 1018
    .line 1019
    if-nez v0, :cond_25

    .line 1020
    .line 1021
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1022
    .line 1023
    .line 1024
    move-result-wide v7

    .line 1025
    const/4 v13, 0x0

    .line 1026
    const/4 v14, 0x0

    .line 1027
    const/4 v11, 0x3

    .line 1028
    const/4 v12, 0x0

    .line 1029
    move-wide v9, v7

    .line 1030
    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    :goto_14
    if-ge v6, v2, :cond_24

    .line 1039
    .line 1040
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v3

    .line 1044
    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1045
    .line 1046
    .line 1047
    add-int/lit8 v6, v6, 0x1

    .line 1048
    .line 1049
    goto :goto_14

    .line 1050
    :cond_24
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 1051
    .line 1052
    .line 1053
    iput-boolean v15, v1, Landroidx/drawerlayout/widget/DrawerLayout;->D:Z

    .line 1054
    .line 1055
    :cond_25
    return-void

    .line 1056
    :pswitch_15
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v0, Ldefpackage/ss0;

    .line 1059
    .line 1060
    iget-object v0, v0, Ldefpackage/ss0;->n:Ljava/lang/Object;

    .line 1061
    .line 1062
    check-cast v0, Ldefpackage/s24;

    .line 1063
    .line 1064
    new-instance v1, Ldefpackage/k2;

    .line 1065
    .line 1066
    const/16 v2, 0xf

    .line 1067
    .line 1068
    invoke-direct {v1, v2, v6}, Ldefpackage/k2;-><init>(IB)V

    .line 1069
    .line 1070
    .line 1071
    invoke-static {v0, v6, v15, v1}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    return-void

    .line 1075
    :pswitch_16
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v0, Ldefpackage/pp0;

    .line 1078
    .line 1079
    iget-object v1, v0, Ldefpackage/pp0;->o0:Ldefpackage/mp0;

    .line 1080
    .line 1081
    iget-object v0, v0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 1082
    .line 1083
    invoke-virtual {v1, v0}, Ldefpackage/mp0;->onDismiss(Landroid/content/DialogInterface;)V

    .line 1084
    .line 1085
    .line 1086
    return-void

    .line 1087
    :pswitch_17
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1088
    .line 1089
    check-cast v0, Ldefpackage/bk;

    .line 1090
    .line 1091
    iput-boolean v6, v0, Ldefpackage/bk;->p:Z

    .line 1092
    .line 1093
    iget-object v1, v0, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1096
    .line 1097
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Z:Ldefpackage/o65;

    .line 1098
    .line 1099
    if-eqz v2, :cond_26

    .line 1100
    .line 1101
    invoke-virtual {v2}, Ldefpackage/o65;->g()Z

    .line 1102
    .line 1103
    .line 1104
    move-result v2

    .line 1105
    if-eqz v2, :cond_26

    .line 1106
    .line 1107
    iget v1, v0, Ldefpackage/bk;->o:I

    .line 1108
    .line 1109
    invoke-virtual {v0, v1}, Ldefpackage/bk;->c(I)V

    .line 1110
    .line 1111
    .line 1112
    goto :goto_15

    .line 1113
    :cond_26
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 1114
    .line 1115
    if-ne v2, v14, :cond_27

    .line 1116
    .line 1117
    iget v0, v0, Ldefpackage/bk;->o:I

    .line 1118
    .line 1119
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(I)V

    .line 1120
    .line 1121
    .line 1122
    :cond_27
    :goto_15
    return-void

    .line 1123
    :pswitch_18
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1124
    .line 1125
    check-cast v0, Lcom/eddyizm/tempus/service/MediaService;

    .line 1126
    .line 1127
    invoke-virtual {v0}, Lcom/eddyizm/tempus/service/MediaService;->p()Ldefpackage/kn2;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v2

    .line 1131
    invoke-virtual {v2}, Ldefpackage/kn2;->a()Ldefpackage/qi3;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v2

    .line 1135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    invoke-interface {v2}, Ldefpackage/qi3;->h0()Z

    .line 1139
    .line 1140
    .line 1141
    move-result v3

    .line 1142
    if-nez v3, :cond_28

    .line 1143
    .line 1144
    iput-boolean v6, v0, Lcom/eddyizm/tempus/service/MediaService;->C:Z

    .line 1145
    .line 1146
    goto :goto_16

    .line 1147
    :cond_28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1148
    .line 1149
    .line 1150
    move-result-wide v6

    .line 1151
    iget-wide v11, v0, Lcom/eddyizm/tempus/service/MediaService;->E:J

    .line 1152
    .line 1153
    sub-long v11, v6, v11

    .line 1154
    .line 1155
    cmp-long v3, v11, v4

    .line 1156
    .line 1157
    if-ltz v3, :cond_29

    .line 1158
    .line 1159
    iput-wide v6, v0, Lcom/eddyizm/tempus/service/MediaService;->E:J

    .line 1160
    .line 1161
    invoke-interface {v2}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    invoke-interface {v2}, Ldefpackage/qi3;->M0()J

    .line 1166
    .line 1167
    .line 1168
    move-result-wide v4

    .line 1169
    invoke-static {v3, v4, v5}, Ldefpackage/bo2;->n(Ldefpackage/gn2;J)V

    .line 1170
    .line 1171
    .line 1172
    :cond_29
    invoke-virtual {v0, v2}, Lcom/eddyizm/tempus/service/MediaService;->w(Ldefpackage/qi3;)V

    .line 1173
    .line 1174
    .line 1175
    iget-object v0, v0, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 1176
    .line 1177
    invoke-virtual {v0, v1, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1178
    .line 1179
    .line 1180
    :goto_16
    return-void

    .line 1181
    :pswitch_19
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1182
    .line 1183
    check-cast v0, Ldefpackage/hc2;

    .line 1184
    .line 1185
    iget-object v2, v0, Ldefpackage/hc2;->p:Ldefpackage/cx0;

    .line 1186
    .line 1187
    iget-object v3, v0, Ldefpackage/hc2;->n:Ldefpackage/qn;

    .line 1188
    .line 1189
    iget-boolean v4, v0, Ldefpackage/hc2;->B:Z

    .line 1190
    .line 1191
    if-nez v4, :cond_2a

    .line 1192
    .line 1193
    goto/16 :goto_18

    .line 1194
    .line 1195
    :cond_2a
    iget-boolean v4, v0, Ldefpackage/hc2;->z:Z

    .line 1196
    .line 1197
    if-eqz v4, :cond_2b

    .line 1198
    .line 1199
    iput-boolean v6, v0, Ldefpackage/hc2;->z:Z

    .line 1200
    .line 1201
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1202
    .line 1203
    .line 1204
    move-result-wide v4

    .line 1205
    iput-wide v4, v3, Ldefpackage/qn;->e:J

    .line 1206
    .line 1207
    iput-wide v11, v3, Ldefpackage/qn;->g:J

    .line 1208
    .line 1209
    iput-wide v4, v3, Ldefpackage/qn;->f:J

    .line 1210
    .line 1211
    const/high16 v4, 0x3f000000    # 0.5f

    .line 1212
    .line 1213
    iput v4, v3, Ldefpackage/qn;->h:F

    .line 1214
    .line 1215
    :cond_2b
    iget-wide v4, v3, Ldefpackage/qn;->g:J

    .line 1216
    .line 1217
    cmp-long v4, v4, v16

    .line 1218
    .line 1219
    if-lez v4, :cond_2c

    .line 1220
    .line 1221
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1222
    .line 1223
    .line 1224
    move-result-wide v4

    .line 1225
    iget-wide v7, v3, Ldefpackage/qn;->g:J

    .line 1226
    .line 1227
    iget v9, v3, Ldefpackage/qn;->i:I

    .line 1228
    .line 1229
    int-to-long v9, v9

    .line 1230
    add-long/2addr v7, v9

    .line 1231
    cmp-long v4, v4, v7

    .line 1232
    .line 1233
    if-lez v4, :cond_2c

    .line 1234
    .line 1235
    goto :goto_17

    .line 1236
    :cond_2c
    invoke-virtual {v0}, Ldefpackage/hc2;->e()Z

    .line 1237
    .line 1238
    .line 1239
    move-result v4

    .line 1240
    if-nez v4, :cond_2d

    .line 1241
    .line 1242
    :goto_17
    iput-boolean v6, v0, Ldefpackage/hc2;->B:Z

    .line 1243
    .line 1244
    goto :goto_18

    .line 1245
    :cond_2d
    iget-boolean v4, v0, Ldefpackage/hc2;->A:Z

    .line 1246
    .line 1247
    if-eqz v4, :cond_2e

    .line 1248
    .line 1249
    iput-boolean v6, v0, Ldefpackage/hc2;->A:Z

    .line 1250
    .line 1251
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1252
    .line 1253
    .line 1254
    move-result-wide v7

    .line 1255
    const/4 v13, 0x0

    .line 1256
    const/4 v14, 0x0

    .line 1257
    const/4 v11, 0x3

    .line 1258
    const/4 v12, 0x0

    .line 1259
    move-wide v9, v7

    .line 1260
    invoke-static/range {v7 .. v14}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v4

    .line 1264
    invoke-virtual {v2, v4}, Ldefpackage/cx0;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 1268
    .line 1269
    .line 1270
    :cond_2e
    iget-wide v4, v3, Ldefpackage/qn;->f:J

    .line 1271
    .line 1272
    cmp-long v4, v4, v16

    .line 1273
    .line 1274
    if-eqz v4, :cond_2f

    .line 1275
    .line 1276
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1277
    .line 1278
    .line 1279
    move-result-wide v4

    .line 1280
    invoke-virtual {v3, v4, v5}, Ldefpackage/qn;->a(J)F

    .line 1281
    .line 1282
    .line 1283
    move-result v6

    .line 1284
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1285
    .line 1286
    mul-float/2addr v7, v6

    .line 1287
    mul-float/2addr v7, v6

    .line 1288
    const/high16 v8, 0x40800000    # 4.0f

    .line 1289
    .line 1290
    mul-float/2addr v6, v8

    .line 1291
    add-float/2addr v6, v7

    .line 1292
    iget-wide v7, v3, Ldefpackage/qn;->f:J

    .line 1293
    .line 1294
    sub-long v7, v4, v7

    .line 1295
    .line 1296
    iput-wide v4, v3, Ldefpackage/qn;->f:J

    .line 1297
    .line 1298
    long-to-float v4, v7

    .line 1299
    mul-float/2addr v4, v6

    .line 1300
    iget v3, v3, Ldefpackage/qn;->d:F

    .line 1301
    .line 1302
    mul-float/2addr v4, v3

    .line 1303
    float-to-int v3, v4

    .line 1304
    iget-object v0, v0, Ldefpackage/hc2;->D:Ldefpackage/cx0;

    .line 1305
    .line 1306
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1307
    .line 1308
    .line 1309
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 1310
    .line 1311
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1312
    .line 1313
    .line 1314
    goto :goto_18

    .line 1315
    :cond_2f
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1316
    .line 1317
    invoke-static {v0}, Ldefpackage/tb4;->e(Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    :goto_18
    return-void

    .line 1321
    :pswitch_1a
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1322
    .line 1323
    move-object v3, v0

    .line 1324
    check-cast v3, Ldefpackage/ra;

    .line 1325
    .line 1326
    invoke-virtual {v3, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1327
    .line 1328
    .line 1329
    iget-object v4, v3, Ldefpackage/ra;->z0:Landroid/view/MotionEvent;

    .line 1330
    .line 1331
    if-eqz v4, :cond_32

    .line 1332
    .line 1333
    invoke-virtual {v4}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1334
    .line 1335
    .line 1336
    move-result v0

    .line 1337
    if-eq v0, v2, :cond_32

    .line 1338
    .line 1339
    if-eq v0, v15, :cond_32

    .line 1340
    .line 1341
    const/4 v1, 0x7

    .line 1342
    if-eq v0, v1, :cond_30

    .line 1343
    .line 1344
    const/16 v2, 0x8

    .line 1345
    .line 1346
    const/16 v5, 0x9

    .line 1347
    .line 1348
    if-eq v0, v2, :cond_31

    .line 1349
    .line 1350
    if-eq v0, v5, :cond_30

    .line 1351
    .line 1352
    move v5, v14

    .line 1353
    goto :goto_19

    .line 1354
    :cond_30
    move v5, v1

    .line 1355
    :cond_31
    :goto_19
    iget-wide v6, v3, Ldefpackage/ra;->A0:J

    .line 1356
    .line 1357
    const/4 v8, 0x0

    .line 1358
    invoke-virtual/range {v3 .. v8}, Ldefpackage/ra;->G(Landroid/view/MotionEvent;IJZ)V

    .line 1359
    .line 1360
    .line 1361
    :cond_32
    return-void

    .line 1362
    :pswitch_1b
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1363
    .line 1364
    check-cast v0, Ldefpackage/ns3;

    .line 1365
    .line 1366
    :goto_1a
    :try_start_8
    iget-object v1, v0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 1367
    .line 1368
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 1369
    .line 1370
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    check-cast v1, Ldefpackage/i5;

    .line 1375
    .line 1376
    invoke-virtual {v0, v1}, Ldefpackage/ns3;->b(Ldefpackage/i5;)V
    :try_end_8
    .catch Ljava/lang/InterruptedException; {:try_start_8 .. :try_end_8} :catch_0

    .line 1377
    .line 1378
    .line 1379
    goto :goto_1a

    .line 1380
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v1

    .line 1384
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 1385
    .line 1386
    .line 1387
    goto :goto_1a

    .line 1388
    :pswitch_1c
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 1389
    .line 1390
    .line 1391
    iget-object v0, v1, Ldefpackage/g5;->o:Ljava/lang/Object;

    .line 1392
    .line 1393
    check-cast v0, Ljava/lang/Runnable;

    .line 1394
    .line 1395
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1396
    .line 1397
    .line 1398
    return-void

    .line 1399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
