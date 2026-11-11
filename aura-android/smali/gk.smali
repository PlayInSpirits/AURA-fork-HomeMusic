.class public final synthetic Lgk;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lgk;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lgk;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lgk;->o:I

    .line 6
    .line 7
    iput-object p3, p0, Lgk;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 13
    iput p4, p0, Lgk;->n:I

    iput-object p1, p0, Lgk;->p:Ljava/lang/Object;

    iput-object p2, p0, Lgk;->q:Ljava/lang/Object;

    iput p3, p0, Lgk;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lgk;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, v0, Lgk;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget v7, v0, Lgk;->o:I

    .line 12
    .line 13
    iget-object v0, v0, Lgk;->p:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v0, Lvs3;

    .line 19
    .line 20
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 21
    .line 22
    iget-object v0, v0, Lvs3;->a:Lns3;

    .line 23
    .line 24
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lns3;->c()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-gez v7, :cond_0

    .line 34
    .line 35
    move v7, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-le v7, v2, :cond_1

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    :cond_1
    :goto_0
    new-instance v2, Lcom/eddyizm/tempus/model/Queue;

    .line 48
    .line 49
    invoke-direct {v2, v6}, Lcom/eddyizm/tempus/model/Queue;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, v7, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move v2, v4

    .line 56
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-ge v2, v3, :cond_2

    .line 61
    .line 62
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lcom/eddyizm/tempus/model/Queue;

    .line 67
    .line 68
    invoke-virtual {v3, v2}, Lcom/eddyizm/tempus/model/Queue;->setTrackOrder(I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object v2, v0, Lns3;->o:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Ls24;

    .line 77
    .line 78
    new-instance v3, Lls3;

    .line 79
    .line 80
    invoke-direct {v3, v0, v1, v4}, Lls3;-><init>(Lns3;Ljava/util/List;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v4, v5, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_0
    check-cast v0, Lzt2;

    .line 88
    .line 89
    check-cast v6, Landroid/util/Pair;

    .line 90
    .line 91
    iget-object v0, v0, Lzt2;->o:Lfo1;

    .line 92
    .line 93
    iget-object v0, v0, Lfo1;->i:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Lnj0;

    .line 96
    .line 97
    iget-object v1, v6, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljava/lang/Integer;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget-object v2, v6, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v2, Lmt2;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2, v7}, Lnj0;->p(ILmt2;I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_1
    check-cast v0, Lic2;

    .line 114
    .line 115
    check-cast v6, Ljava/util/List;

    .line 116
    .line 117
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    const-string v1, "MediaManager"

    .line 124
    .line 125
    const-string v2, "remove"

    .line 126
    .line 127
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    .line 129
    .line 130
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    check-cast v1, Lbj2;

    .line 135
    .line 136
    invoke-virtual {v1}, Lsk2;->Q0()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-le v1, v5, :cond_3

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Lbj2;

    .line 147
    .line 148
    invoke-virtual {v1}, Lsk2;->o0()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eq v1, v7, :cond_3

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, Lbj2;

    .line 159
    .line 160
    invoke-virtual {v0, v7}, Lsk2;->N(I)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 161
    .line 162
    .line 163
    if-eq v7, v3, :cond_3

    .line 164
    .line 165
    :try_start_1
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    new-instance v0, Lvs3;

    .line 169
    .line 170
    invoke-direct {v0}, Lvs3;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v6, v5, v4}, Lvs3;->c(Ljava/util/List;ZI)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :catch_0
    move-exception v0

    .line 178
    goto :goto_2

    .line 179
    :catch_1
    move-exception v0

    .line 180
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 181
    .line 182
    .line 183
    :cond_3
    :goto_3
    return-void

    .line 184
    :pswitch_2
    move-object v1, v0

    .line 185
    check-cast v1, Lbm2;

    .line 186
    .line 187
    check-cast v6, Lic2;

    .line 188
    .line 189
    const-string v2, "MCImplBase"

    .line 190
    .line 191
    :try_start_2
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Lab4;

    .line 196
    .line 197
    const-string v4, "SessionResult must not be null"

    .line 198
    .line 199
    invoke-static {v0, v4}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :catch_2
    move-exception v0

    .line 204
    goto :goto_4

    .line 205
    :catch_3
    move-exception v0

    .line 206
    goto :goto_4

    .line 207
    :catch_4
    move-exception v0

    .line 208
    goto :goto_5

    .line 209
    :goto_4
    const-string v4, "Session operation failed"

    .line 210
    .line 211
    invoke-static {v2, v4, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    new-instance v0, Lab4;

    .line 215
    .line 216
    invoke-direct {v0, v3}, Lab4;-><init>(I)V

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :goto_5
    const-string v3, "Session operation cancelled"

    .line 221
    .line 222
    invoke-static {v2, v3, v0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, Lab4;

    .line 226
    .line 227
    invoke-direct {v0, v5}, Lab4;-><init>(I)V

    .line 228
    .line 229
    .line 230
    :goto_6
    iget-object v3, v1, Lbm2;->D:Lpu1;

    .line 231
    .line 232
    if-nez v3, :cond_4

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_4
    :try_start_3
    iget-object v1, v1, Lbm2;->c:Lmm2;

    .line 236
    .line 237
    invoke-virtual {v0}, Lab4;->b()Landroid/os/Bundle;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-interface {v3, v1, v7, v0}, Lpu1;->a(Lju1;ILandroid/os/Bundle;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_5

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :catch_5
    const-string v0, "Error in sending"

    .line 246
    .line 247
    invoke-static {v2, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :goto_7
    return-void

    .line 251
    :pswitch_3
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 252
    .line 253
    check-cast v6, Lqc2;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    :cond_5
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-eqz v1, :cond_7

    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Lsc2;

    .line 270
    .line 271
    iget-boolean v2, v1, Lsc2;->d:Z

    .line 272
    .line 273
    if-nez v2, :cond_5

    .line 274
    .line 275
    if-eq v7, v3, :cond_6

    .line 276
    .line 277
    iget-object v2, v1, Lsc2;->b:Lxk0;

    .line 278
    .line 279
    invoke-virtual {v2, v7}, Lxk0;->b(I)V

    .line 280
    .line 281
    .line 282
    :cond_6
    iput-boolean v5, v1, Lsc2;->c:Z

    .line 283
    .line 284
    iget-object v1, v1, Lsc2;->a:Ljava/lang/Object;

    .line 285
    .line 286
    invoke-interface {v6, v1}, Lqc2;->invoke(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_7
    return-void

    .line 291
    :pswitch_4
    check-cast v0, Lsw0;

    .line 292
    .line 293
    check-cast v6, Ltw0;

    .line 294
    .line 295
    iget v1, v0, Lsw0;->a:I

    .line 296
    .line 297
    iget-object v0, v0, Lsw0;->b:Lmt2;

    .line 298
    .line 299
    invoke-interface {v6, v1, v0, v7}, Ltw0;->p(ILmt2;I)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_5
    check-cast v0, Lip0;

    .line 304
    .line 305
    iget-object v0, v0, Lip0;->c:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Lsq3;

    .line 308
    .line 309
    invoke-interface {v0, v7, v6}, Lsq3;->e(ILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :pswitch_6
    check-cast v0, Lj70;

    .line 314
    .line 315
    check-cast v6, Landroid/content/IntentSender$SendIntentException;

    .line 316
    .line 317
    new-instance v1, Landroid/content/Intent;

    .line 318
    .line 319
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 320
    .line 321
    .line 322
    const-string v2, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 323
    .line 324
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    const-string v2, "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION"

    .line 329
    .line 330
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v0, v7, v4, v1}, Lj70;->a(IILandroid/content/Intent;)Z

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_7
    check-cast v0, Lj70;

    .line 339
    .line 340
    check-cast v6, Lzh0;

    .line 341
    .line 342
    iget-object v1, v6, Lzh0;->o:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v1, Ljava/io/Serializable;

    .line 345
    .line 346
    iget-object v3, v0, Lj70;->a:Ljava/util/LinkedHashMap;

    .line 347
    .line 348
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    check-cast v3, Ljava/lang/String;

    .line 357
    .line 358
    if-nez v3, :cond_8

    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_8
    iget-object v4, v0, Lj70;->e:Ljava/util/LinkedHashMap;

    .line 362
    .line 363
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    check-cast v4, Lu5;

    .line 368
    .line 369
    if-eqz v4, :cond_9

    .line 370
    .line 371
    iget-object v2, v4, Lu5;->a:Lp5;

    .line 372
    .line 373
    :cond_9
    if-nez v2, :cond_a

    .line 374
    .line 375
    iget-object v2, v0, Lj70;->g:Landroid/os/Bundle;

    .line 376
    .line 377
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    iget-object v0, v0, Lj70;->f:Ljava/util/LinkedHashMap;

    .line 381
    .line 382
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_a
    iget-object v2, v4, Lu5;->a:Lp5;

    .line 387
    .line 388
    iget-object v0, v0, Lj70;->d:Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_b

    .line 395
    .line 396
    invoke-interface {v2, v1}, Lp5;->i(Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_b
    :goto_9
    return-void

    .line 400
    :pswitch_8
    check-cast v0, Lc12;

    .line 401
    .line 402
    check-cast v6, Landroid/os/Bundle;

    .line 403
    .line 404
    iget-object v0, v0, Lc12;->o:Ljava/lang/Object;

    .line 405
    .line 406
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 407
    .line 408
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 409
    .line 410
    if-nez v0, :cond_c

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_c
    invoke-virtual {v0}, Lv23;->g()Lr23;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    if-eqz v1, :cond_d

    .line 418
    .line 419
    invoke-virtual {v0}, Lv23;->g()Lr23;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    iget v1, v1, Lr23;->u:I

    .line 424
    .line 425
    if-ne v1, v7, :cond_d

    .line 426
    .line 427
    new-instance v8, Ly23;

    .line 428
    .line 429
    const/4 v9, 0x1

    .line 430
    const/4 v10, 0x0

    .line 431
    const/4 v11, -0x1

    .line 432
    const/4 v12, 0x0

    .line 433
    const/4 v13, 0x0

    .line 434
    move v14, v11

    .line 435
    move v15, v11

    .line 436
    move/from16 v16, v11

    .line 437
    .line 438
    move/from16 v17, v11

    .line 439
    .line 440
    invoke-direct/range {v8 .. v17}, Ly23;-><init>(ZZIZZIIII)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0, v7, v6, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 444
    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_d
    invoke-virtual {v0, v7, v6, v2}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 448
    .line 449
    .line 450
    :goto_a
    return-void

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
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
