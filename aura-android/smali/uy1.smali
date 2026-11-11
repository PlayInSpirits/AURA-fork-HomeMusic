.class public final synthetic Luy1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Float;Lqy1;Ljava/lang/Float;Lpy1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Luy1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luy1;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Luy1;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Luy1;->p:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Luy1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 16
    iput p5, p0, Luy1;->n:I

    iput-object p1, p0, Luy1;->o:Ljava/lang/Object;

    iput-object p2, p0, Luy1;->p:Ljava/lang/Object;

    iput-object p3, p0, Luy1;->q:Ljava/lang/Object;

    iput-object p4, p0, Luy1;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Luy1;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Luy1;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lqc5;

    .line 14
    .line 15
    iget-object v2, v0, Luy1;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/UUID;

    .line 18
    .line 19
    iget-object v3, v0, Luy1;->q:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Lmb1;

    .line 22
    .line 23
    iget-object v0, v0, Luy1;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v5, v1, Lqc5;->c:Lfd5;

    .line 32
    .line 33
    invoke-virtual {v5, v2}, Lfd5;->h(Ljava/lang/String;)Ldd5;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    iget v6, v5, Ldd5;->b:I

    .line 40
    .line 41
    invoke-static {v6}, Lf34;->c(I)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-nez v6, :cond_2

    .line 46
    .line 47
    iget-object v1, v1, Lqc5;->b:Lpq3;

    .line 48
    .line 49
    const-string v6, "Moving WorkSpec ("

    .line 50
    .line 51
    iget-object v7, v1, Lpq3;->k:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v7

    .line 54
    :try_start_0
    invoke-static {}, Lcx;->f()Lcx;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    sget-object v9, Lpq3;->l:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v10, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v6, ") to the foreground"

    .line 69
    .line 70
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v8, v9, v6}, Lcx;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v6, v1, Lpq3;->g:Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-virtual {v6, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Ltd5;

    .line 87
    .line 88
    if-eqz v6, :cond_1

    .line 89
    .line 90
    iget-object v8, v1, Lpq3;->a:Landroid/os/PowerManager$WakeLock;

    .line 91
    .line 92
    if-nez v8, :cond_0

    .line 93
    .line 94
    iget-object v8, v1, Lpq3;->b:Landroid/content/Context;

    .line 95
    .line 96
    const-string v9, "ProcessorForegroundLck"

    .line 97
    .line 98
    invoke-static {v8, v9}, Ly85;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    iput-object v8, v1, Lpq3;->a:Landroid/os/PowerManager$WakeLock;

    .line 103
    .line 104
    invoke-virtual {v8}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v0

    .line 109
    goto :goto_1

    .line 110
    :cond_0
    :goto_0
    iget-object v8, v1, Lpq3;->f:Ljava/util/HashMap;

    .line 111
    .line 112
    invoke-virtual {v8, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    iget-object v2, v1, Lpq3;->b:Landroid/content/Context;

    .line 116
    .line 117
    iget-object v6, v6, Ltd5;->a:Ldd5;

    .line 118
    .line 119
    invoke-static {v6}, Lq05;->m(Ldd5;)Lrc5;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    invoke-static {v2, v6, v3}, Lwp4;->c(Landroid/content/Context;Lrc5;Lmb1;)Landroid/content/Intent;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    iget-object v1, v1, Lpq3;->b:Landroid/content/Context;

    .line 128
    .line 129
    invoke-static {v1, v2}, Lud3;->G0(Landroid/content/Context;Landroid/content/Intent;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    invoke-static {v5}, Lq05;->m(Ldd5;)Lrc5;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    sget-object v2, Lwp4;->w:Ljava/lang/String;

    .line 138
    .line 139
    new-instance v2, Landroid/content/Intent;

    .line 140
    .line 141
    const-class v5, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 142
    .line 143
    invoke-direct {v2, v0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 144
    .line 145
    .line 146
    const-string v5, "ACTION_NOTIFY"

    .line 147
    .line 148
    invoke-virtual {v2, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    .line 150
    .line 151
    const-string v5, "KEY_NOTIFICATION_ID"

    .line 152
    .line 153
    iget v6, v3, Lmb1;->a:I

    .line 154
    .line 155
    invoke-virtual {v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    const-string v5, "KEY_FOREGROUND_SERVICE_TYPE"

    .line 159
    .line 160
    iget v6, v3, Lmb1;->b:I

    .line 161
    .line 162
    invoke-virtual {v2, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 163
    .line 164
    .line 165
    const-string v5, "KEY_NOTIFICATION"

    .line 166
    .line 167
    iget-object v3, v3, Lmb1;->c:Landroid/app/Notification;

    .line 168
    .line 169
    invoke-virtual {v2, v5, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 170
    .line 171
    .line 172
    const-string v3, "KEY_WORKSPEC_ID"

    .line 173
    .line 174
    iget-object v5, v1, Lrc5;->a:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v2, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    const-string v3, "KEY_GENERATION"

    .line 180
    .line 181
    iget v1, v1, Lrc5;->b:I

    .line 182
    .line 183
    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :goto_1
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    throw v0

    .line 192
    :cond_2
    const-string v0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 193
    .line 194
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_2
    return-object v4

    .line 198
    :pswitch_0
    iget-object v1, v0, Luy1;->o:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 201
    .line 202
    iget-object v5, v0, Luy1;->p:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v5, Ljava/lang/String;

    .line 205
    .line 206
    iget-object v6, v0, Luy1;->q:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v6, Ljava/lang/String;

    .line 209
    .line 210
    iget-object v0, v0, Luy1;->r:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lorg/json/JSONObject;

    .line 213
    .line 214
    const-string v7, "direction"

    .line 215
    .line 216
    const-string v8, "speed"

    .line 217
    .line 218
    const-string v9, "minutes"

    .line 219
    .line 220
    const-string v10, "mode"

    .line 221
    .line 222
    const-string v11, "Failed requirement."

    .line 223
    .line 224
    iget-boolean v12, v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 225
    .line 226
    if-eqz v12, :cond_1b

    .line 227
    .line 228
    sget-boolean v12, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 229
    .line 230
    invoke-static {v1}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 231
    .line 232
    .line 233
    move-result-object v12

    .line 234
    invoke-interface {v12, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_1b

    .line 239
    .line 240
    iget-object v5, v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Lbl2;

    .line 241
    .line 242
    if-eqz v5, :cond_1a

    .line 243
    .line 244
    invoke-virtual {v5}, Lu0;->get()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    check-cast v5, Lbj2;

    .line 249
    .line 250
    if-eqz v6, :cond_19

    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 253
    .line 254
    .line 255
    move-result v12

    .line 256
    const/4 v13, 0x3

    .line 257
    sparse-switch v12, :sswitch_data_0

    .line 258
    .line 259
    .line 260
    goto/16 :goto_11

    .line 261
    .line 262
    :sswitch_0
    const-string v2, "shuffle"

    .line 263
    .line 264
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_19

    .line 269
    .line 270
    const-string v2, "enabled"

    .line 271
    .line 272
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    invoke-virtual {v5, v0}, Lsk2;->s(Z)V

    .line 277
    .line 278
    .line 279
    goto/16 :goto_10

    .line 280
    .line 281
    :sswitch_1
    const-string v7, "timer"

    .line 282
    .line 283
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_19

    .line 288
    .line 289
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    if-eqz v7, :cond_7

    .line 298
    .line 299
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 300
    .line 301
    .line 302
    move-result v8

    .line 303
    const v10, -0x5185d186

    .line 304
    .line 305
    .line 306
    if-eq v8, v10, :cond_6

    .line 307
    .line 308
    const v10, 0x188db

    .line 309
    .line 310
    .line 311
    if-eq v8, v10, :cond_5

    .line 312
    .line 313
    const v10, 0x3f791cdf

    .line 314
    .line 315
    .line 316
    if-ne v8, v10, :cond_7

    .line 317
    .line 318
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    if-eqz v7, :cond_7

    .line 323
    .line 324
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    if-gt v3, v0, :cond_4

    .line 329
    .line 330
    const/16 v7, 0x5a1

    .line 331
    .line 332
    if-ge v0, v7, :cond_4

    .line 333
    .line 334
    invoke-virtual {v6, v2}, Lyf4;->a(Z)V

    .line 335
    .line 336
    .line 337
    iput-boolean v2, v6, Lyf4;->g:Z

    .line 338
    .line 339
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 340
    .line 341
    .line 342
    move-result-wide v7

    .line 343
    int-to-long v9, v0

    .line 344
    const-wide/32 v11, 0xea60

    .line 345
    .line 346
    .line 347
    mul-long/2addr v9, v11

    .line 348
    add-long/2addr v9, v7

    .line 349
    iput-wide v9, v6, Lyf4;->e:J

    .line 350
    .line 351
    iput-boolean v3, v6, Lyf4;->f:Z

    .line 352
    .line 353
    :try_start_2
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 361
    .line 362
    .line 363
    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 364
    :catch_0
    if-nez v4, :cond_3

    .line 365
    .line 366
    goto :goto_3

    .line 367
    :cond_3
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    const-string v2, "sleep_timer_end_time_ms"

    .line 372
    .line 373
    iget-wide v3, v6, Lyf4;->e:J

    .line 374
    .line 375
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const-string v2, "sleep_timer_end_of_track"

    .line 380
    .line 381
    iget-boolean v3, v6, Lyf4;->g:Z

    .line 382
    .line 383
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 388
    .line 389
    .line 390
    :goto_3
    new-instance v0, Ljq3;

    .line 391
    .line 392
    const/16 v2, 0x8

    .line 393
    .line 394
    invoke-direct {v0, v2, v6}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    iput-object v0, v6, Lyf4;->b:Ljq3;

    .line 398
    .line 399
    iget-object v2, v6, Lyf4;->a:Landroid/os/Handler;

    .line 400
    .line 401
    const-wide/16 v3, 0x3e8

    .line 402
    .line 403
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 404
    .line 405
    .line 406
    goto/16 :goto_10

    .line 407
    .line 408
    :cond_4
    invoke-static {v11}, Lkf2;->n(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    goto/16 :goto_12

    .line 412
    .line 413
    :cond_5
    const-string v0, "end"

    .line 414
    .line 415
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    if-eqz v0, :cond_7

    .line 420
    .line 421
    invoke-virtual {v6}, Lyf4;->e()V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_10

    .line 425
    .line 426
    :cond_6
    const-string v0, "cancel"

    .line 427
    .line 428
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_7

    .line 433
    .line 434
    invoke-virtual {v6, v3}, Lyf4;->a(Z)V

    .line 435
    .line 436
    .line 437
    goto/16 :goto_10

    .line 438
    .line 439
    :cond_7
    const-string v0, "Unknown timer mode"

    .line 440
    .line 441
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    goto/16 :goto_12

    .line 445
    .line 446
    :sswitch_2
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    if-eqz v2, :cond_19

    .line 451
    .line 452
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 453
    .line 454
    .line 455
    move-result-wide v2

    .line 456
    double-to-float v2, v2

    .line 457
    const-string v3, "pitch"

    .line 458
    .line 459
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 460
    .line 461
    .line 462
    move-result-wide v6

    .line 463
    double-to-float v0, v6

    .line 464
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 469
    .line 470
    .line 471
    cmpg-float v3, v3, v6

    .line 472
    .line 473
    if-gtz v3, :cond_8

    .line 474
    .line 475
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    cmpg-float v3, v3, v6

    .line 480
    .line 481
    if-gtz v3, :cond_8

    .line 482
    .line 483
    const v3, 0x3dcccccd    # 0.1f

    .line 484
    .line 485
    .line 486
    cmpg-float v6, v3, v2

    .line 487
    .line 488
    if-gtz v6, :cond_8

    .line 489
    .line 490
    const/high16 v6, 0x40a00000    # 5.0f

    .line 491
    .line 492
    cmpg-float v7, v2, v6

    .line 493
    .line 494
    if-gtz v7, :cond_8

    .line 495
    .line 496
    cmpg-float v3, v3, v0

    .line 497
    .line 498
    if-gtz v3, :cond_8

    .line 499
    .line 500
    cmpg-float v3, v0, v6

    .line 501
    .line 502
    if-gtz v3, :cond_8

    .line 503
    .line 504
    new-instance v3, Lqh3;

    .line 505
    .line 506
    invoke-direct {v3, v2, v0}, Lqh3;-><init>(FF)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v5, v3}, Lsk2;->d(Lqh3;)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_10

    .line 513
    .line 514
    :cond_8
    invoke-static {v11}, Lkf2;->n(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    goto/16 :goto_12

    .line 518
    .line 519
    :sswitch_3
    const-string v0, "pause"

    .line 520
    .line 521
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-eqz v0, :cond_19

    .line 526
    .line 527
    invoke-virtual {v5}, Lsk2;->c()V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_10

    .line 531
    .line 532
    :sswitch_4
    const-string v0, "hello"

    .line 533
    .line 534
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    if-eqz v0, :cond_19

    .line 539
    .line 540
    goto/16 :goto_10

    .line 541
    .line 542
    :sswitch_5
    const-string v2, "seek"

    .line 543
    .line 544
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    if-eqz v2, :cond_19

    .line 549
    .line 550
    const-string v2, "position"

    .line 551
    .line 552
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 553
    .line 554
    .line 555
    move-result-wide v6

    .line 556
    invoke-virtual {v5}, Lsk2;->getDuration()J

    .line 557
    .line 558
    .line 559
    move-result-wide v2

    .line 560
    const-wide/16 v8, 0x0

    .line 561
    .line 562
    cmp-long v0, v2, v8

    .line 563
    .line 564
    if-gez v0, :cond_9

    .line 565
    .line 566
    move-wide v10, v8

    .line 567
    goto :goto_4

    .line 568
    :cond_9
    move-wide v10, v2

    .line 569
    :goto_4
    const-wide/16 v8, 0x0

    .line 570
    .line 571
    invoke-static/range {v6 .. v11}, Lgb;->n(JJJ)J

    .line 572
    .line 573
    .line 574
    move-result-wide v2

    .line 575
    invoke-virtual {v5, v2, v3}, Lsk2;->O(J)V

    .line 576
    .line 577
    .line 578
    goto/16 :goto_10

    .line 579
    .line 580
    :sswitch_6
    const-string v0, "play"

    .line 581
    .line 582
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-eqz v0, :cond_19

    .line 587
    .line 588
    invoke-virtual {v5}, Lsk2;->m0()V

    .line 589
    .line 590
    .line 591
    goto/16 :goto_10

    .line 592
    .line 593
    :sswitch_7
    const-string v0, "next"

    .line 594
    .line 595
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_19

    .line 600
    .line 601
    invoke-virtual {v5}, Lsk2;->c0()V

    .line 602
    .line 603
    .line 604
    goto/16 :goto_10

    .line 605
    .line 606
    :sswitch_8
    const-string v1, "queue_state"

    .line 607
    .line 608
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-eqz v1, :cond_19

    .line 613
    .line 614
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    const-string v1, "offset"

    .line 618
    .line 619
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    const-string v1, "duration"

    .line 624
    .line 625
    const-string v6, "bitrate"

    .line 626
    .line 627
    const-string v7, "suffix"

    .line 628
    .line 629
    const-string v8, "artistId"

    .line 630
    .line 631
    const-string v9, "albumId"

    .line 632
    .line 633
    const-string v10, ""

    .line 634
    .line 635
    if-ltz v0, :cond_14

    .line 636
    .line 637
    invoke-virtual {v5}, Lsk2;->Q0()I

    .line 638
    .line 639
    .line 640
    move-result v12

    .line 641
    if-gt v0, v12, :cond_14

    .line 642
    .line 643
    new-instance v4, Lorg/json/JSONArray;

    .line 644
    .line 645
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v5}, Lsk2;->Q0()I

    .line 649
    .line 650
    .line 651
    move-result v11

    .line 652
    sub-int/2addr v11, v0

    .line 653
    const/16 v12, 0x14

    .line 654
    .line 655
    invoke-static {v12, v11}, Ljava/lang/Math;->min(II)I

    .line 656
    .line 657
    .line 658
    move-result v11

    .line 659
    add-int/2addr v11, v0

    .line 660
    :goto_5
    if-ge v0, v11, :cond_13

    .line 661
    .line 662
    invoke-virtual {v5, v0}, Lsk2;->Y(I)Lgn2;

    .line 663
    .line 664
    .line 665
    move-result-object v12

    .line 666
    iget-object v12, v12, Lgn2;->d:Ldo2;

    .line 667
    .line 668
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    iget-object v13, v12, Ldo2;->I:Landroid/os/Bundle;

    .line 672
    .line 673
    new-instance v14, Lorg/json/JSONObject;

    .line 674
    .line 675
    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    .line 676
    .line 677
    .line 678
    const-string v15, "id"

    .line 679
    .line 680
    invoke-virtual {v5, v0}, Lsk2;->Y(I)Lgn2;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    iget-object v2, v2, Lgn2;->a:Ljava/lang/String;

    .line 685
    .line 686
    invoke-virtual {v14, v15, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    const-string v14, "album"

    .line 691
    .line 692
    iget-object v15, v12, Ldo2;->c:Ljava/lang/CharSequence;

    .line 693
    .line 694
    const/16 v3, 0x100

    .line 695
    .line 696
    if-eqz v15, :cond_a

    .line 697
    .line 698
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v15

    .line 702
    if-eqz v15, :cond_a

    .line 703
    .line 704
    invoke-static {v3, v15}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v15

    .line 708
    goto :goto_6

    .line 709
    :cond_a
    move-object v15, v10

    .line 710
    :goto_6
    invoke-virtual {v2, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    const-string v14, "cover"

    .line 715
    .line 716
    const/16 v15, 0x200

    .line 717
    .line 718
    if-eqz v13, :cond_b

    .line 719
    .line 720
    const-string v3, "coverArtId"

    .line 721
    .line 722
    invoke-virtual {v13, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    if-eqz v3, :cond_b

    .line 727
    .line 728
    invoke-static {v15, v3}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    goto :goto_7

    .line 733
    :cond_b
    move-object v3, v10

    .line 734
    :goto_7
    invoke-virtual {v2, v14, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    if-eqz v13, :cond_c

    .line 739
    .line 740
    invoke-virtual {v13, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    if-eqz v3, :cond_c

    .line 745
    .line 746
    invoke-static {v15, v3}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    goto :goto_8

    .line 751
    :cond_c
    move-object v3, v10

    .line 752
    :goto_8
    invoke-virtual {v2, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    if-eqz v13, :cond_d

    .line 757
    .line 758
    invoke-virtual {v13, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v3

    .line 762
    if-eqz v3, :cond_d

    .line 763
    .line 764
    invoke-static {v15, v3}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v3

    .line 768
    goto :goto_9

    .line 769
    :cond_d
    move-object v3, v10

    .line 770
    :goto_9
    invoke-virtual {v2, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    if-eqz v13, :cond_e

    .line 775
    .line 776
    invoke-virtual {v13, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v3

    .line 780
    if-eqz v3, :cond_e

    .line 781
    .line 782
    const/16 v14, 0x20

    .line 783
    .line 784
    invoke-static {v14, v3}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    goto :goto_a

    .line 789
    :cond_e
    move-object v3, v10

    .line 790
    :goto_a
    invoke-virtual {v2, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    if-eqz v13, :cond_f

    .line 795
    .line 796
    invoke-virtual {v13, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 797
    .line 798
    .line 799
    move-result v3

    .line 800
    goto :goto_b

    .line 801
    :cond_f
    const/4 v3, 0x0

    .line 802
    :goto_b
    invoke-virtual {v2, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    if-eqz v13, :cond_10

    .line 807
    .line 808
    invoke-virtual {v13, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 809
    .line 810
    .line 811
    move-result v3

    .line 812
    goto :goto_c

    .line 813
    :cond_10
    const/4 v3, 0x0

    .line 814
    :goto_c
    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 815
    .line 816
    .line 817
    move-result-object v2

    .line 818
    const-string v3, "title"

    .line 819
    .line 820
    iget-object v13, v12, Ldo2;->a:Ljava/lang/CharSequence;

    .line 821
    .line 822
    if-eqz v13, :cond_11

    .line 823
    .line 824
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v13

    .line 828
    if-eqz v13, :cond_11

    .line 829
    .line 830
    const/16 v14, 0x100

    .line 831
    .line 832
    invoke-static {v14, v13}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object v13

    .line 836
    goto :goto_d

    .line 837
    :cond_11
    const/16 v14, 0x100

    .line 838
    .line 839
    move-object v13, v10

    .line 840
    :goto_d
    invoke-virtual {v2, v3, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    const-string v3, "artist"

    .line 845
    .line 846
    iget-object v12, v12, Ldo2;->b:Ljava/lang/CharSequence;

    .line 847
    .line 848
    if-eqz v12, :cond_12

    .line 849
    .line 850
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v12

    .line 854
    if-eqz v12, :cond_12

    .line 855
    .line 856
    invoke-static {v14, v12}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v12

    .line 860
    goto :goto_e

    .line 861
    :cond_12
    move-object v12, v10

    .line 862
    :goto_e
    invoke-virtual {v2, v3, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 867
    .line 868
    .line 869
    add-int/lit8 v0, v0, 0x1

    .line 870
    .line 871
    const/4 v2, 0x0

    .line 872
    const/4 v3, 0x1

    .line 873
    goto/16 :goto_5

    .line 874
    .line 875
    :cond_13
    new-instance v0, Lorg/json/JSONObject;

    .line 876
    .line 877
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 878
    .line 879
    .line 880
    const-string v1, "ok"

    .line 881
    .line 882
    const/4 v2, 0x1

    .line 883
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    const-string v1, "items"

    .line 888
    .line 889
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    const-string v1, "index"

    .line 894
    .line 895
    invoke-virtual {v5}, Lsk2;->o0()I

    .line 896
    .line 897
    .line 898
    move-result v2

    .line 899
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    const-string v1, "count"

    .line 904
    .line 905
    invoke-virtual {v5}, Lsk2;->Q0()I

    .line 906
    .line 907
    .line 908
    move-result v2

    .line 909
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    const-string v1, "revision"

    .line 914
    .line 915
    invoke-static {v5}, Lcom/eddyizm/tempus/lan/LanReceiverService;->e(Lqi3;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 920
    .line 921
    .line 922
    move-result-object v4

    .line 923
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    goto/16 :goto_12

    .line 927
    .line 928
    :cond_14
    invoke-static {v11}, Lkf2;->n(Ljava/lang/String;)V

    .line 929
    .line 930
    .line 931
    goto/16 :goto_12

    .line 932
    .line 933
    :sswitch_9
    const-string v2, "volume"

    .line 934
    .line 935
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    move-result v2

    .line 939
    if-eqz v2, :cond_19

    .line 940
    .line 941
    const-string v2, "value"

    .line 942
    .line 943
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    .line 944
    .line 945
    .line 946
    move-result-wide v2

    .line 947
    double-to-float v0, v2

    .line 948
    const/4 v2, 0x0

    .line 949
    const/high16 v3, 0x3f800000    # 1.0f

    .line 950
    .line 951
    invoke-static {v0, v2, v3}, Lgb;->l(FFF)F

    .line 952
    .line 953
    .line 954
    move-result v0

    .line 955
    invoke-virtual {v5, v0}, Lsk2;->R(F)V

    .line 956
    .line 957
    .line 958
    goto/16 :goto_10

    .line 959
    .line 960
    :sswitch_a
    const-string v2, "device_volume"

    .line 961
    .line 962
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    if-eqz v2, :cond_19

    .line 967
    .line 968
    const-class v2, Landroid/media/AudioManager;

    .line 969
    .line 970
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    check-cast v2, Landroid/media/AudioManager;

    .line 975
    .line 976
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-eqz v3, :cond_17

    .line 981
    .line 982
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 983
    .line 984
    .line 985
    move-result v0

    .line 986
    const/4 v3, 0x1

    .line 987
    if-eq v0, v3, :cond_15

    .line 988
    .line 989
    const/4 v3, -0x1

    .line 990
    if-ne v0, v3, :cond_16

    .line 991
    .line 992
    :cond_15
    const/4 v3, 0x0

    .line 993
    goto :goto_f

    .line 994
    :cond_16
    invoke-static {v11}, Lkf2;->n(Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    goto :goto_12

    .line 998
    :goto_f
    invoke-virtual {v2, v13, v0, v3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 999
    .line 1000
    .line 1001
    goto :goto_10

    .line 1002
    :cond_17
    const/4 v3, 0x0

    .line 1003
    const-string v4, "level"

    .line 1004
    .line 1005
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 1006
    .line 1007
    .line 1008
    move-result v0

    .line 1009
    invoke-virtual {v2, v13}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 1010
    .line 1011
    .line 1012
    move-result v4

    .line 1013
    invoke-static {v0, v3, v4}, Lgb;->m(III)I

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    invoke-virtual {v2, v13, v0, v3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 1018
    .line 1019
    .line 1020
    goto :goto_10

    .line 1021
    :sswitch_b
    const-string v0, "status"

    .line 1022
    .line 1023
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v0

    .line 1027
    if-eqz v0, :cond_19

    .line 1028
    .line 1029
    goto :goto_10

    .line 1030
    :sswitch_c
    const-string v2, "repeat"

    .line 1031
    .line 1032
    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v2

    .line 1036
    if-eqz v2, :cond_19

    .line 1037
    .line 1038
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 1039
    .line 1040
    .line 1041
    move-result v0

    .line 1042
    if-ltz v0, :cond_18

    .line 1043
    .line 1044
    if-ge v0, v13, :cond_18

    .line 1045
    .line 1046
    invoke-virtual {v5, v0}, Lsk2;->p0(I)V

    .line 1047
    .line 1048
    .line 1049
    goto :goto_10

    .line 1050
    :cond_18
    invoke-static {v11}, Lkf2;->n(Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    goto :goto_12

    .line 1054
    :sswitch_d
    const-string v0, "previous"

    .line 1055
    .line 1056
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    if-eqz v0, :cond_19

    .line 1061
    .line 1062
    invoke-virtual {v5}, Lsk2;->S()V

    .line 1063
    .line 1064
    .line 1065
    :goto_10
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v1, v5}, Lcom/eddyizm/tempus/lan/LanReceiverService;->f(Lqi3;)Lorg/json/JSONObject;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    goto :goto_12

    .line 1073
    :cond_19
    :goto_11
    const-string v0, "Unknown command"

    .line 1074
    .line 1075
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    goto :goto_12

    .line 1079
    :cond_1a
    const-string v0, "browserFuture"

    .line 1080
    .line 1081
    invoke-static {v0}, Lh12;->Q(Ljava/lang/String;)V

    .line 1082
    .line 1083
    .line 1084
    throw v4

    .line 1085
    :cond_1b
    invoke-static {v11}, Lkf2;->n(Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    :goto_12
    return-object v4

    .line 1089
    :pswitch_1
    iget-object v1, v0, Luy1;->o:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v1, Ljava/lang/Float;

    .line 1092
    .line 1093
    iget-object v2, v0, Luy1;->q:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v2, Lqy1;

    .line 1096
    .line 1097
    iget-object v3, v0, Luy1;->p:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v3, Ljava/lang/Float;

    .line 1100
    .line 1101
    iget-object v0, v0, Luy1;->r:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v0, Lpy1;

    .line 1104
    .line 1105
    iget-object v5, v2, Lqy1;->n:Ljava/lang/Float;

    .line 1106
    .line 1107
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1108
    .line 1109
    .line 1110
    move-result v5

    .line 1111
    if-eqz v5, :cond_1c

    .line 1112
    .line 1113
    iget-object v5, v2, Lqy1;->o:Ljava/lang/Float;

    .line 1114
    .line 1115
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v5

    .line 1119
    if-nez v5, :cond_1d

    .line 1120
    .line 1121
    :cond_1c
    iput-object v1, v2, Lqy1;->n:Ljava/lang/Float;

    .line 1122
    .line 1123
    iput-object v3, v2, Lqy1;->o:Ljava/lang/Float;

    .line 1124
    .line 1125
    new-instance v5, Lyq4;

    .line 1126
    .line 1127
    invoke-direct {v5, v0, v1, v3, v4}, Lyq4;-><init>(Lwd;Ljava/lang/Object;Ljava/lang/Float;Lce;)V

    .line 1128
    .line 1129
    .line 1130
    iput-object v5, v2, Lqy1;->q:Lyq4;

    .line 1131
    .line 1132
    iget-object v0, v2, Lqy1;->u:Lty1;

    .line 1133
    .line 1134
    iget-object v0, v0, Lty1;->b:Lzd3;

    .line 1135
    .line 1136
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1137
    .line 1138
    invoke-virtual {v0, v1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 1139
    .line 1140
    .line 1141
    const/4 v3, 0x0

    .line 1142
    iput-boolean v3, v2, Lqy1;->r:Z

    .line 1143
    .line 1144
    const/4 v3, 0x1

    .line 1145
    iput-boolean v3, v2, Lqy1;->s:Z

    .line 1146
    .line 1147
    :cond_1d
    sget-object v0, Lj15;->a:Lj15;

    .line 1148
    .line 1149
    return-object v0

    .line 1150
    nop

    .line 1151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    :sswitch_data_0
    .sparse-switch
        -0x4bec4509 -> :sswitch_d
        -0x37b3d265 -> :sswitch_c
        -0x3532300e -> :sswitch_b
        -0x34c8e6dd -> :sswitch_a
        -0x305518e6 -> :sswitch_9
        -0x2116901d -> :sswitch_8
        0x338af3 -> :sswitch_7
        0x348b34 -> :sswitch_6
        0x35ce78 -> :sswitch_5
        0x5e918d2 -> :sswitch_4
        0x65825f6 -> :sswitch_3
        0x6890047 -> :sswitch_2
        0x6940745 -> :sswitch_1
        0x7b8546f9 -> :sswitch_0
    .end sparse-switch
.end method
