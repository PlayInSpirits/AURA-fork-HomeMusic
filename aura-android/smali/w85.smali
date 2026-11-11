.class public final synthetic Lw85;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lw85;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lw85;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lw85;->o:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw85;->n:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, Lw85;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lwd5;

    .line 11
    .line 12
    iget-object v0, v0, Lw85;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lea2;

    .line 15
    .line 16
    iget-boolean v2, v1, Lwd5;->p:Z

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iput-object v0, v1, Lwd5;->q:Lea2;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lea2;->a(Laa2;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    iget-object v1, v0, Lw85;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lrf2;

    .line 29
    .line 30
    iget-object v0, v0, Lw85;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v1, Lrf2;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Landroid/net/wifi/WifiManager$WifiLock;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    monitor-exit v1

    .line 54
    return-void

    .line 55
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0

    .line 57
    :pswitch_1
    iget-object v1, v0, Lw85;->p:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Ly10;

    .line 60
    .line 61
    iget-object v0, v0, Lw85;->o:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 64
    .line 65
    iget-object v1, v1, Ly10;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Lrf2;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    new-instance v2, Ljava/lang/Thread;

    .line 79
    .line 80
    new-instance v3, Lw85;

    .line 81
    .line 82
    const/4 v4, 0x4

    .line 83
    invoke-direct {v3, v4, v1, v0}, Lw85;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    const-string v0, "ExoPlayer:WifiLockManager"

    .line 87
    .line 88
    invoke-direct {v2, v3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 92
    .line 93
    .line 94
    :cond_2
    return-void

    .line 95
    :pswitch_2
    iget-object v1, v0, Lw85;->p:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lbl2;

    .line 98
    .line 99
    iget-object v0, v0, Lw85;->o:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v2, v0

    .line 102
    check-cast v2, Landroid/content/Context;

    .line 103
    .line 104
    const-string v0, "album"

    .line 105
    .line 106
    const-string v3, "artist"

    .line 107
    .line 108
    :try_start_2
    invoke-virtual {v1}, Lu0;->isDone()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_3

    .line 113
    .line 114
    goto/16 :goto_d

    .line 115
    .line 116
    :cond_3
    invoke-virtual {v1}, Lu0;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lsk2;

    .line 121
    .line 122
    invoke-virtual {v1}, Lsk2;->a()Lgn2;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    const/4 v5, 0x0

    .line 127
    if-eqz v4, :cond_e

    .line 128
    .line 129
    iget-object v4, v4, Lgn2;->d:Ldo2;

    .line 130
    .line 131
    if-eqz v4, :cond_e

    .line 132
    .line 133
    iget-object v6, v4, Ldo2;->I:Landroid/os/Bundle;

    .line 134
    .line 135
    iget-object v7, v4, Ldo2;->a:Ljava/lang/CharSequence;

    .line 136
    .line 137
    if-eqz v7, :cond_4

    .line 138
    .line 139
    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    move-object v7, v5

    .line 145
    :goto_2
    iget-object v8, v4, Ldo2;->b:Ljava/lang/CharSequence;

    .line 146
    .line 147
    if-eqz v8, :cond_5

    .line 148
    .line 149
    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    goto :goto_3

    .line 154
    :cond_5
    move-object v8, v5

    .line 155
    :goto_3
    iget-object v4, v4, Ldo2;->c:Ljava/lang/CharSequence;

    .line 156
    .line 157
    if-eqz v4, :cond_6

    .line 158
    .line 159
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    goto :goto_4

    .line 164
    :cond_6
    move-object v4, v5

    .line 165
    :goto_4
    if-eqz v6, :cond_d

    .line 166
    .line 167
    if-nez v7, :cond_7

    .line 168
    .line 169
    const-string v5, "title"

    .line 170
    .line 171
    invoke-virtual {v6, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    goto :goto_5

    .line 176
    :cond_7
    move-object v5, v7

    .line 177
    :goto_5
    if-nez v8, :cond_8

    .line 178
    .line 179
    invoke-virtual {v6, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    goto :goto_6

    .line 184
    :cond_8
    move-object v7, v8

    .line 185
    :goto_6
    if-nez v4, :cond_9

    .line 186
    .line 187
    invoke-virtual {v6, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    :cond_9
    const-string v8, "coverArtId"

    .line 192
    .line 193
    invoke-virtual {v6, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    const-string v9, "assetLinkSong"

    .line 198
    .line 199
    invoke-virtual {v6, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    if-nez v9, :cond_a

    .line 204
    .line 205
    const-string v9, "song"

    .line 206
    .line 207
    const-string v10, "id"

    .line 208
    .line 209
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    invoke-static {v9, v10}, Ll93;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    :cond_a
    const-string v10, "assetLinkAlbum"

    .line 218
    .line 219
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    if-nez v10, :cond_b

    .line 224
    .line 225
    const-string v10, "albumId"

    .line 226
    .line 227
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v10

    .line 231
    invoke-static {v0, v10}, Ll93;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    goto :goto_7

    .line 236
    :cond_b
    move-object v0, v10

    .line 237
    :goto_7
    const-string v10, "assetLinkArtist"

    .line 238
    .line 239
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    if-nez v10, :cond_c

    .line 244
    .line 245
    const-string v10, "artistId"

    .line 246
    .line 247
    invoke-virtual {v6, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v6

    .line 251
    invoke-static {v3, v6}, Ll93;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    move-object v15, v0

    .line 256
    move-object/from16 v16, v3

    .line 257
    .line 258
    move-object v6, v8

    .line 259
    move-object v14, v9

    .line 260
    goto :goto_8

    .line 261
    :cond_c
    move-object v15, v0

    .line 262
    move-object v6, v8

    .line 263
    move-object v14, v9

    .line 264
    move-object/from16 v16, v10

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_d
    move-object v6, v5

    .line 268
    move-object v14, v6

    .line 269
    move-object v15, v14

    .line 270
    move-object/from16 v16, v15

    .line 271
    .line 272
    move-object v5, v7

    .line 273
    move-object v7, v8

    .line 274
    goto :goto_8

    .line 275
    :cond_e
    move-object v4, v5

    .line 276
    move-object v6, v4

    .line 277
    move-object v7, v6

    .line 278
    move-object v14, v7

    .line 279
    move-object v15, v14

    .line 280
    move-object/from16 v16, v15

    .line 281
    .line 282
    :goto_8
    invoke-virtual {v1}, Lsk2;->M0()J

    .line 283
    .line 284
    .line 285
    move-result-wide v8

    .line 286
    invoke-virtual {v1}, Lsk2;->getDuration()J

    .line 287
    .line 288
    .line 289
    move-result-wide v10

    .line 290
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    cmp-long v0, v8, v12

    .line 296
    .line 297
    const-wide/16 v17, 0x0

    .line 298
    .line 299
    if-nez v0, :cond_f

    .line 300
    .line 301
    move-wide/from16 v8, v17

    .line 302
    .line 303
    :cond_f
    cmp-long v0, v10, v12

    .line 304
    .line 305
    if-nez v0, :cond_10

    .line 306
    .line 307
    move-wide/from16 v12, v17

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_10
    move-wide v12, v10

    .line 311
    :goto_9
    if-eqz v5, :cond_11

    .line 312
    .line 313
    :goto_a
    move-object v3, v5

    .line 314
    goto :goto_b

    .line 315
    :cond_11
    const v0, 0x7f130591

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    goto :goto_a

    .line 323
    :goto_b
    if-eqz v7, :cond_12

    .line 324
    .line 325
    goto :goto_c

    .line 326
    :cond_12
    const v0, 0x7f130592

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    :goto_c
    invoke-virtual {v1}, Lsk2;->h0()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    move-wide v10, v8

    .line 338
    invoke-virtual {v1}, Lsk2;->D0()Z

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    invoke-virtual {v1}, Lsk2;->h()I

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    move-object v5, v4

    .line 347
    move-object v4, v7

    .line 348
    move v7, v0

    .line 349
    invoke-static/range {v2 .. v16}, Lji2;->T(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1}, Lsk2;->Y0()V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 353
    .line 354
    .line 355
    :catch_0
    :goto_d
    return-void

    .line 356
    :pswitch_3
    iget-object v1, v0, Lw85;->p:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v1, Lxc5;

    .line 359
    .line 360
    iget-object v0, v0, Lw85;->o:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 363
    .line 364
    monitor-enter v1

    .line 365
    :try_start_3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_13

    .line 370
    .line 371
    iget-object v0, v1, Lxc5;->p:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, Landroid/os/PowerManager$WakeLock;

    .line 374
    .line 375
    if-eqz v0, :cond_13

    .line 376
    .line 377
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 378
    .line 379
    .line 380
    goto :goto_e

    .line 381
    :catchall_1
    move-exception v0

    .line 382
    goto :goto_f

    .line 383
    :cond_13
    :goto_e
    monitor-exit v1

    .line 384
    return-void

    .line 385
    :goto_f
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 386
    throw v0

    .line 387
    :pswitch_4
    iget-object v1, v0, Lw85;->p:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v1, Ly10;

    .line 390
    .line 391
    iget-object v0, v0, Lw85;->o:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 394
    .line 395
    iget-object v1, v1, Ly10;->d:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v1, Lxc5;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    if-eqz v2, :cond_14

    .line 407
    .line 408
    new-instance v2, Ljava/lang/Thread;

    .line 409
    .line 410
    new-instance v3, Lw85;

    .line 411
    .line 412
    const/4 v4, 0x1

    .line 413
    invoke-direct {v3, v4, v1, v0}, Lw85;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    const-string v0, "ExoPlayer:WakeLockManager"

    .line 417
    .line 418
    invoke-direct {v2, v3, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 422
    .line 423
    .line 424
    :cond_14
    return-void

    .line 425
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
