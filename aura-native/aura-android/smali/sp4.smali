.class public final Lsp4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:Ltp4;


# direct methods
.method public synthetic constructor <init>(Ltp4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsp4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lsp4;->o:Ltp4;

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
    .locals 8

    .line 1
    iget v0, p0, Lsp4;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lsp4;->o:Ltp4;

    .line 8
    .line 9
    const-string v0, "Removing command "

    .line 10
    .line 11
    invoke-static {}, Lcx;->f()Lcx;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Ltp4;->x:Ljava/lang/String;

    .line 16
    .line 17
    const-string v4, "Checking if commands are complete."

    .line 18
    .line 19
    invoke-virtual {v2, v3, v4}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ltp4;->c()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Ltp4;->t:Ljava/util/ArrayList;

    .line 26
    .line 27
    monitor-enter v2

    .line 28
    :try_start_0
    iget-object v4, p0, Ltp4;->u:Landroid/content/Intent;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-static {}, Lcx;->f()Lcx;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ltp4;->u:Landroid/content/Intent;

    .line 42
    .line 43
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v4, v3, v0}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Ltp4;->t:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Landroid/content/Intent;

    .line 60
    .line 61
    iget-object v1, p0, Ltp4;->u:Landroid/content/Intent;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    iput-object v0, p0, Ltp4;->u:Landroid/content/Intent;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    goto :goto_2

    .line 75
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v0, "Dequeue-d command is not the first."

    .line 78
    .line 79
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_1
    :goto_0
    iget-object v0, p0, Ltp4;->o:Lbq4;

    .line 84
    .line 85
    iget-object v0, v0, Lbq4;->n:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lia4;

    .line 88
    .line 89
    iget-object v1, p0, Ltp4;->s:Lk60;

    .line 90
    .line 91
    iget-object v4, v1, Lk60;->p:Ljava/lang/Object;

    .line 92
    .line 93
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    :try_start_1
    iget-object v1, v1, Lk60;->o:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    :try_start_2
    iget-object v1, p0, Ltp4;->t:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_2

    .line 110
    .line 111
    iget-object v1, v0, Lia4;->r:Ljava/lang/Object;

    .line 112
    .line 113
    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    :try_start_3
    iget-object v0, v0, Lia4;->p:Ljava/util/ArrayDeque;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 121
    if-eqz v0, :cond_2

    .line 122
    .line 123
    :try_start_4
    invoke-static {}, Lcx;->f()Lcx;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "No more commands & intents."

    .line 128
    .line 129
    invoke-virtual {v0, v3, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object p0, p0, Ltp4;->v:Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 133
    .line 134
    if-eqz p0, :cond_3

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/work/impl/background/systemalarm/SystemAlarmService;->a()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :catchall_1
    move-exception p0

    .line 141
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 142
    :try_start_6
    throw p0

    .line 143
    :cond_2
    iget-object v0, p0, Ltp4;->t:Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_3

    .line 150
    .line 151
    invoke-virtual {p0}, Ltp4;->d()V

    .line 152
    .line 153
    .line 154
    :cond_3
    :goto_1
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 155
    return-void

    .line 156
    :catchall_2
    move-exception p0

    .line 157
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 158
    :try_start_8
    throw p0

    .line 159
    :goto_2
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 160
    throw p0

    .line 161
    :pswitch_0
    const-string v0, "Acquiring operation wake lock ("

    .line 162
    .line 163
    iget-object v2, p0, Lsp4;->o:Ltp4;

    .line 164
    .line 165
    iget-object v2, v2, Ltp4;->t:Ljava/util/ArrayList;

    .line 166
    .line 167
    monitor-enter v2

    .line 168
    :try_start_9
    iget-object v3, p0, Lsp4;->o:Ltp4;

    .line 169
    .line 170
    iget-object v4, v3, Ltp4;->t:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    check-cast v4, Landroid/content/Intent;

    .line 177
    .line 178
    iput-object v4, v3, Ltp4;->u:Landroid/content/Intent;

    .line 179
    .line 180
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 181
    iget-object v2, p0, Lsp4;->o:Ltp4;

    .line 182
    .line 183
    iget-object v2, v2, Ltp4;->u:Landroid/content/Intent;

    .line 184
    .line 185
    if-eqz v2, :cond_4

    .line 186
    .line 187
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    iget-object v3, p0, Lsp4;->o:Ltp4;

    .line 192
    .line 193
    iget-object v3, v3, Ltp4;->u:Landroid/content/Intent;

    .line 194
    .line 195
    const-string v4, "KEY_START_ID"

    .line 196
    .line 197
    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-static {}, Lcx;->f()Lcx;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    sget-object v4, Ltp4;->x:Ljava/lang/String;

    .line 206
    .line 207
    new-instance v5, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-string v6, "Processing command "

    .line 210
    .line 211
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v6, p0, Lsp4;->o:Ltp4;

    .line 215
    .line 216
    iget-object v6, v6, Ltp4;->u:Landroid/content/Intent;

    .line 217
    .line 218
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v6, ", "

    .line 222
    .line 223
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    invoke-virtual {v3, v4, v5}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    iget-object v3, p0, Lsp4;->o:Ltp4;

    .line 237
    .line 238
    iget-object v3, v3, Ltp4;->n:Landroid/content/Context;

    .line 239
    .line 240
    new-instance v5, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string v6, " ("

    .line 249
    .line 250
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    const-string v6, ")"

    .line 257
    .line 258
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-static {v3, v5}, Ly85;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    const/4 v5, 0x1

    .line 270
    :try_start_a
    invoke-static {}, Lcx;->f()Lcx;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    new-instance v7, Ljava/lang/StringBuilder;

    .line 275
    .line 276
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    const-string v0, ") "

    .line 283
    .line 284
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    invoke-virtual {v6, v4, v0}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 298
    .line 299
    .line 300
    iget-object v0, p0, Lsp4;->o:Ltp4;

    .line 301
    .line 302
    iget-object v6, v0, Ltp4;->s:Lk60;

    .line 303
    .line 304
    iget-object v7, v0, Ltp4;->u:Landroid/content/Intent;

    .line 305
    .line 306
    invoke-virtual {v6, v7, v1, v0}, Lk60;->a(Landroid/content/Intent;ILtp4;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 307
    .line 308
    .line 309
    invoke-static {}, Lcx;->f()Lcx;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    new-instance v1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    const-string v6, "Releasing operation wake lock ("

    .line 316
    .line 317
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const-string v2, ") "

    .line 324
    .line 325
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-virtual {v0, v4, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 339
    .line 340
    .line 341
    iget-object p0, p0, Lsp4;->o:Ltp4;

    .line 342
    .line 343
    iget-object v0, p0, Ltp4;->o:Lbq4;

    .line 344
    .line 345
    iget-object v0, v0, Lbq4;->q:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v0, Lvc5;

    .line 348
    .line 349
    new-instance v1, Lsp4;

    .line 350
    .line 351
    invoke-direct {v1, p0, v5}, Lsp4;-><init>(Ltp4;I)V

    .line 352
    .line 353
    .line 354
    :goto_3
    invoke-virtual {v0, v1}, Lvc5;->execute(Ljava/lang/Runnable;)V

    .line 355
    .line 356
    .line 357
    goto :goto_4

    .line 358
    :catchall_3
    move-exception v0

    .line 359
    :try_start_b
    invoke-static {}, Lcx;->f()Lcx;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    sget-object v4, Ltp4;->x:Ljava/lang/String;

    .line 364
    .line 365
    const-string v6, "Unexpected error in onHandleIntent"

    .line 366
    .line 367
    invoke-virtual {v1, v4, v6, v0}, Lcx;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 368
    .line 369
    .line 370
    invoke-static {}, Lcx;->f()Lcx;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    new-instance v1, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    const-string v6, "Releasing operation wake lock ("

    .line 377
    .line 378
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    const-string v2, ") "

    .line 385
    .line 386
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-virtual {v0, v4, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 400
    .line 401
    .line 402
    iget-object p0, p0, Lsp4;->o:Ltp4;

    .line 403
    .line 404
    iget-object v0, p0, Ltp4;->o:Lbq4;

    .line 405
    .line 406
    iget-object v0, v0, Lbq4;->q:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v0, Lvc5;

    .line 409
    .line 410
    new-instance v1, Lsp4;

    .line 411
    .line 412
    invoke-direct {v1, p0, v5}, Lsp4;-><init>(Ltp4;I)V

    .line 413
    .line 414
    .line 415
    goto :goto_3

    .line 416
    :catchall_4
    move-exception v0

    .line 417
    invoke-static {}, Lcx;->f()Lcx;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    sget-object v4, Ltp4;->x:Ljava/lang/String;

    .line 422
    .line 423
    new-instance v6, Ljava/lang/StringBuilder;

    .line 424
    .line 425
    const-string v7, "Releasing operation wake lock ("

    .line 426
    .line 427
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    const-string v2, ") "

    .line 434
    .line 435
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-virtual {v1, v4, v2}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 449
    .line 450
    .line 451
    iget-object p0, p0, Lsp4;->o:Ltp4;

    .line 452
    .line 453
    iget-object v1, p0, Ltp4;->o:Lbq4;

    .line 454
    .line 455
    iget-object v1, v1, Lbq4;->q:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v1, Lvc5;

    .line 458
    .line 459
    new-instance v2, Lsp4;

    .line 460
    .line 461
    invoke-direct {v2, p0, v5}, Lsp4;-><init>(Ltp4;I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v1, v2}, Lvc5;->execute(Ljava/lang/Runnable;)V

    .line 465
    .line 466
    .line 467
    throw v0

    .line 468
    :cond_4
    :goto_4
    return-void

    .line 469
    :catchall_5
    move-exception p0

    .line 470
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 471
    throw p0

    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
