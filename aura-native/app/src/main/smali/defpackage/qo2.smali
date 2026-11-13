.class public final synthetic Ldefpackage/qo2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldefpackage/qo2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/qo2;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/16 v3, 0x11

    .line 7
    .line 8
    const/16 v4, 0xe

    .line 9
    .line 10
    const/16 v5, 0xa

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 20
    .line 21
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ldefpackage/oy;

    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ldefpackage/gf1;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    :try_start_0
    invoke-interface {v0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ldefpackage/oy;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    invoke-virtual {v2, v0}, Ldefpackage/oy;->b(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_0
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ldefpackage/rm3;

    .line 52
    .line 53
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Ldefpackage/gl4;

    .line 56
    .line 57
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ldefpackage/z45;

    .line 60
    .line 61
    iget-object v1, v1, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ldefpackage/pq3;

    .line 64
    .line 65
    invoke-virtual {v1, v2, v0}, Ldefpackage/pq3;->g(Ldefpackage/gl4;Ldefpackage/z45;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_1
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Ldefpackage/bl2;

    .line 72
    .line 73
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v2, Ljava/lang/String;

    .line 76
    .line 77
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, Landroid/content/Context;

    .line 80
    .line 81
    const-string v3, "TempoWidget"

    .line 82
    .line 83
    const-string v4, "controller connected, isPlaying="

    .line 84
    .line 85
    :try_start_1
    invoke-virtual {v1}, Ldefpackage/u0;->isDone()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_1

    .line 90
    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_1
    invoke-virtual {v1}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ldefpackage/sk2;

    .line 98
    .line 99
    new-instance v5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ldefpackage/sk2;->h0()Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    sparse-switch v4, :sswitch_data_0

    .line 123
    .line 124
    .line 125
    goto/16 :goto_3

    .line 126
    .line 127
    :sswitch_0
    const-string v4, "tempo.widget.REPEAT"

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_7

    .line 134
    .line 135
    invoke-virtual {v1}, Ldefpackage/sk2;->h()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    const/4 v4, 0x2

    .line 140
    if-nez v2, :cond_2

    .line 141
    .line 142
    move v6, v4

    .line 143
    goto :goto_1

    .line 144
    :cond_2
    if-ne v2, v4, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    move v6, v7

    .line 148
    :goto_1
    invoke-virtual {v1, v6}, Ldefpackage/sk2;->p0(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catch_0
    move-exception v0

    .line 153
    goto :goto_4

    .line 154
    :catch_1
    move-exception v0

    .line 155
    goto :goto_4

    .line 156
    :sswitch_1
    const-string v4, "tempo.widget.PREV"

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-eqz v2, :cond_7

    .line 163
    .line 164
    invoke-virtual {v1}, Ldefpackage/sk2;->S()V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :sswitch_2
    const-string v4, "tempo.widget.NEXT"

    .line 169
    .line 170
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_7

    .line 175
    .line 176
    invoke-virtual {v1}, Ldefpackage/sk2;->H0()V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :sswitch_3
    const-string v4, "tempo.widget.PLAY_PAUSE"

    .line 181
    .line 182
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    invoke-virtual {v1}, Ldefpackage/sk2;->h0()Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_4

    .line 193
    .line 194
    invoke-virtual {v1}, Ldefpackage/sk2;->c()V

    .line 195
    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_4
    invoke-virtual {v1}, Ldefpackage/sk2;->m0()V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :sswitch_4
    const-string v4, "tempo.widget.SHUFFLE"

    .line 203
    .line 204
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_7

    .line 209
    .line 210
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Ldefpackage/qi3;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    if-nez v2, :cond_5

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_5
    sget-object v4, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 218
    .line 219
    if-nez v4, :cond_6

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_6
    sget-object v4, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 223
    .line 224
    new-instance v5, Ldefpackage/at1;

    .line 225
    .line 226
    invoke-direct {v5, v2, v7}, Ldefpackage/at1;-><init>(Ldefpackage/qi3;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 230
    .line 231
    .line 232
    move v7, v6

    .line 233
    :goto_2
    if-nez v7, :cond_7

    .line 234
    .line 235
    invoke-virtual {v1}, Ldefpackage/sk2;->D0()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    xor-int/2addr v2, v6

    .line 240
    invoke-virtual {v1, v2}, Ldefpackage/sk2;->s(Z)V

    .line 241
    .line 242
    .line 243
    :cond_7
    :goto_3
    invoke-static {v0}, Ldefpackage/ji2;->I(Landroid/content/Context;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Ldefpackage/sk2;->Y0()V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :goto_4
    const-string v1, "dispatch failed"

    .line 251
    .line 252
    invoke-static {v3, v1, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 253
    .line 254
    .line 255
    :goto_5
    return-void

    .line 256
    :pswitch_2
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v1, Ldefpackage/rf2;

    .line 259
    .line 260
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v2, Ldefpackage/tb1;

    .line 263
    .line 264
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v0, Ldefpackage/ej0;

    .line 267
    .line 268
    iget-object v1, v1, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v1, Ldefpackage/o55;

    .line 271
    .line 272
    sget-object v3, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 273
    .line 274
    invoke-interface {v1, v2, v0}, Ldefpackage/o55;->s(Ldefpackage/tb1;Ldefpackage/ej0;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_3
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, Ldefpackage/lb4;

    .line 281
    .line 282
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v2, Ldefpackage/ur2;

    .line 285
    .line 286
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Ldefpackage/ab4;

    .line 289
    .line 290
    :try_start_2
    iget-object v3, v1, Ldefpackage/u0;->n:Ljava/lang/Object;

    .line 291
    .line 292
    instance-of v3, v3, Ldefpackage/f0;

    .line 293
    .line 294
    if-eqz v3, :cond_8

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_8
    invoke-virtual {v2}, Ldefpackage/ur2;->run()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v0}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 301
    .line 302
    .line 303
    goto :goto_6

    .line 304
    :catchall_1
    move-exception v0

    .line 305
    invoke-virtual {v1, v0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 306
    .line 307
    .line 308
    :goto_6
    return-void

    .line 309
    :pswitch_4
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v1, Ldefpackage/ic2;

    .line 312
    .line 313
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v2, Ldefpackage/lb4;

    .line 316
    .line 317
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v0, Ldefpackage/mk;

    .line 320
    .line 321
    :try_start_3
    invoke-static {v1}, Ldefpackage/hw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_2

    .line 325
    :try_start_4
    invoke-interface {v0, v1}, Ldefpackage/mk;->apply(Ljava/lang/Object;)Ldefpackage/ic2;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v2, v0}, Ldefpackage/u0;->n(Ldefpackage/ic2;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 330
    .line 331
    .line 332
    goto :goto_9

    .line 333
    :catchall_2
    move-exception v0

    .line 334
    invoke-virtual {v2, v0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_9

    .line 338
    :catch_2
    move-exception v0

    .line 339
    goto :goto_7

    .line 340
    :catch_3
    move-exception v0

    .line 341
    :goto_7
    invoke-virtual {v2, v0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :catch_4
    move-exception v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-nez v1, :cond_9

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_9
    move-object v0, v1

    .line 354
    :goto_8
    invoke-virtual {v2, v0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_9

    .line 358
    :catch_5
    invoke-virtual {v2, v7}, Ldefpackage/u0;->cancel(Z)Z

    .line 359
    .line 360
    .line 361
    :goto_9
    return-void

    .line 362
    :pswitch_5
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v1, Ldefpackage/ns3;

    .line 365
    .line 366
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v2, Landroid/net/Uri;

    .line 369
    .line 370
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 371
    .line 372
    move-object v3, v0

    .line 373
    check-cast v3, Ldefpackage/lb4;

    .line 374
    .line 375
    :try_start_5
    iget-object v0, v1, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Landroid/content/Context;

    .line 378
    .line 379
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0}, Ldefpackage/c04;->g()Ldefpackage/vz3;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0, v2}, Ldefpackage/vz3;->N(Landroid/net/Uri;)Ldefpackage/vz3;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    const/16 v4, 0x200

    .line 392
    .line 393
    invoke-virtual {v0, v4, v4}, Ldefpackage/vz3;->R(II)Ldefpackage/yz3;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-virtual {v0}, Ldefpackage/yz3;->get()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, Landroid/graphics/Bitmap;

    .line 402
    .line 403
    iget-object v1, v1, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v1, Landroid/util/LruCache;

    .line 406
    .line 407
    invoke-virtual {v1, v2, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3, v0}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :catch_6
    move-exception v0

    .line 415
    invoke-virtual {v3, v0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 416
    .line 417
    .line 418
    :goto_a
    return-void

    .line 419
    :pswitch_6
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 422
    .line 423
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v2, Ljava/util/ArrayList;

    .line 426
    .line 427
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, Ljava/lang/String;

    .line 430
    .line 431
    new-instance v3, Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 434
    .line 435
    .line 436
    invoke-static {v3}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 437
    .line 438
    .line 439
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Ldefpackage/bl2;

    .line 440
    .line 441
    const/16 v4, 0x1f4

    .line 442
    .line 443
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    invoke-virtual {v3, v7, v4}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-static {v2, v3, v7, v0}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 456
    .line 457
    .line 458
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 459
    .line 460
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 461
    .line 462
    iget-object v0, v0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v0, Ldefpackage/au;

    .line 465
    .line 466
    invoke-virtual {v0, v6}, Ldefpackage/au;->d(Z)V

    .line 467
    .line 468
    .line 469
    return-void

    .line 470
    :pswitch_7
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v1, Ljava/util/List;

    .line 473
    .line 474
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v2, Ldefpackage/hx3;

    .line 477
    .line 478
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 479
    .line 480
    move-object v3, v0

    .line 481
    check-cast v3, Landroid/content/Context;

    .line 482
    .line 483
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    :cond_a
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 488
    .line 489
    .line 490
    move-result v0

    .line 491
    if-eqz v0, :cond_e

    .line 492
    .line 493
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    move-object v4, v0

    .line 498
    check-cast v4, Ldefpackage/qs3;

    .line 499
    .line 500
    sget-object v0, Ldefpackage/rs3;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 503
    .line 504
    .line 505
    move-result v0

    .line 506
    iget v6, v2, Ldefpackage/hx3;->n:I

    .line 507
    .line 508
    if-eq v0, v6, :cond_b

    .line 509
    .line 510
    goto :goto_f

    .line 511
    :cond_b
    :try_start_6
    invoke-static {v3}, Ldefpackage/au0;->D(Landroid/content/Context;)Ldefpackage/se4;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    new-instance v6, Ldefpackage/xi4;

    .line 516
    .line 517
    invoke-direct {v6, v5}, Ldefpackage/xi4;-><init>(I)V

    .line 518
    .line 519
    .line 520
    sget-object v14, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 521
    .line 522
    iget-object v9, v4, Ldefpackage/qs3;->a:Landroid/net/Uri;

    .line 523
    .line 524
    new-instance v8, Ldefpackage/ii0;

    .line 525
    .line 526
    const/16 v20, 0x0

    .line 527
    .line 528
    const/16 v19, 0x0

    .line 529
    .line 530
    const-wide/16 v15, 0x0

    .line 531
    .line 532
    const/4 v13, 0x0

    .line 533
    const-wide/16 v10, 0x0

    .line 534
    .line 535
    const/4 v12, 0x1

    .line 536
    const-wide/16 v17, -0x1

    .line 537
    .line 538
    invoke-direct/range {v8 .. v20}, Ldefpackage/ii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v6, v8}, Ldefpackage/xi4;->d(Ldefpackage/ii0;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v6

    .line 545
    invoke-virtual {v0, v6}, Ldefpackage/se4;->i(Ljava/lang/String;)Ldefpackage/yj0;

    .line 546
    .line 547
    .line 548
    move-result-object v8

    .line 549
    invoke-static {v8}, Ldefpackage/nd0;->a(Ldefpackage/nd0;)J

    .line 550
    .line 551
    .line 552
    move-result-wide v8

    .line 553
    const-wide/16 v10, -0x1

    .line 554
    .line 555
    cmp-long v10, v8, v10

    .line 556
    .line 557
    if-nez v10, :cond_c

    .line 558
    .line 559
    sget-object v11, Ldefpackage/rs3;->f:Ljava/util/HashSet;

    .line 560
    .line 561
    monitor-enter v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 562
    :try_start_7
    invoke-virtual {v11, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 566
    :try_start_8
    monitor-exit v11

    .line 567
    if-nez v12, :cond_c

    .line 568
    .line 569
    :catch_7
    move v0, v7

    .line 570
    goto :goto_d

    .line 571
    :catchall_3
    move-exception v0

    .line 572
    monitor-exit v11

    .line 573
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    .line 574
    :cond_c
    iget-wide v11, v4, Ldefpackage/qs3;->b:J

    .line 575
    .line 576
    if-nez v10, :cond_d

    .line 577
    .line 578
    goto :goto_c

    .line 579
    :cond_d
    :try_start_9
    invoke-static {v11, v12, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 580
    .line 581
    .line 582
    move-result-wide v11

    .line 583
    :goto_c
    invoke-virtual {v0, v6, v11, v12}, Ldefpackage/se4;->j(Ljava/lang/String;J)Z

    .line 584
    .line 585
    .line 586
    move-result v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 587
    :goto_d
    if-nez v0, :cond_a

    .line 588
    .line 589
    sget-object v0, Ldefpackage/rs3;->a:Ldefpackage/rs3;

    .line 590
    .line 591
    iget v6, v2, Ldefpackage/hx3;->n:I

    .line 592
    .line 593
    invoke-virtual {v0, v3, v4, v6}, Ldefpackage/rs3;->a(Landroid/content/Context;Ldefpackage/qs3;I)V

    .line 594
    .line 595
    .line 596
    goto :goto_b

    .line 597
    :cond_e
    sget-object v1, Ldefpackage/rs3;->a:Ldefpackage/rs3;

    .line 598
    .line 599
    monitor-enter v1

    .line 600
    :try_start_a
    sget-object v0, Ldefpackage/rs3;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 601
    .line 602
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    iget v2, v2, Ldefpackage/hx3;->n:I

    .line 607
    .line 608
    if-ne v0, v2, :cond_f

    .line 609
    .line 610
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 611
    .line 612
    sput-object v0, Ldefpackage/rs3;->e:Ljava/util/List;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :catchall_4
    move-exception v0

    .line 616
    goto :goto_10

    .line 617
    :cond_f
    :goto_e
    monitor-exit v1

    .line 618
    :goto_f
    return-void

    .line 619
    :goto_10
    monitor-exit v1

    .line 620
    throw v0

    .line 621
    :pswitch_8
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v1, Ldefpackage/pq3;

    .line 624
    .line 625
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v2, Ldefpackage/ry;

    .line 628
    .line 629
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, Ldefpackage/td5;

    .line 632
    .line 633
    :try_start_b
    iget-object v2, v2, Ldefpackage/ry;->o:Ldefpackage/qy;

    .line 634
    .line 635
    invoke-virtual {v2}, Ldefpackage/g2;->get()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    check-cast v2, Ljava/lang/Boolean;

    .line 640
    .line 641
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 642
    .line 643
    .line 644
    move-result v6
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_8
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_b .. :try_end_b} :catch_8

    .line 645
    :catch_8
    iget-object v2, v1, Ldefpackage/pq3;->k:Ljava/lang/Object;

    .line 646
    .line 647
    monitor-enter v2

    .line 648
    :try_start_c
    iget-object v3, v0, Ldefpackage/td5;->a:Ldefpackage/dd5;

    .line 649
    .line 650
    invoke-static {v3}, Ldefpackage/q05;->m(Ldefpackage/dd5;)Ldefpackage/rc5;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    iget-object v4, v3, Ldefpackage/rc5;->a:Ljava/lang/String;

    .line 655
    .line 656
    invoke-virtual {v1, v4}, Ldefpackage/pq3;->c(Ljava/lang/String;)Ldefpackage/td5;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    if-ne v5, v0, :cond_10

    .line 661
    .line 662
    invoke-virtual {v1, v4}, Ldefpackage/pq3;->b(Ljava/lang/String;)Ldefpackage/td5;

    .line 663
    .line 664
    .line 665
    goto :goto_11

    .line 666
    :catchall_5
    move-exception v0

    .line 667
    goto :goto_13

    .line 668
    :cond_10
    :goto_11
    invoke-static {}, Ldefpackage/cx;->f()Ldefpackage/cx;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    sget-object v5, Ldefpackage/pq3;->l:Ljava/lang/String;

    .line 673
    .line 674
    new-instance v8, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 677
    .line 678
    .line 679
    const-class v9, Ldefpackage/pq3;

    .line 680
    .line 681
    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v9

    .line 685
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    const-string v9, " "

    .line 689
    .line 690
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    const-string v4, " executed; reschedule = "

    .line 697
    .line 698
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    invoke-virtual {v0, v5, v4}, Ldefpackage/cx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    iget-object v0, v1, Ldefpackage/pq3;->j:Ljava/util/ArrayList;

    .line 712
    .line 713
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    :goto_12
    if-ge v7, v1, :cond_11

    .line 718
    .line 719
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v4

    .line 723
    add-int/lit8 v7, v7, 0x1

    .line 724
    .line 725
    check-cast v4, Ldefpackage/w21;

    .line 726
    .line 727
    invoke-interface {v4, v3, v6}, Ldefpackage/w21;->b(Ldefpackage/rc5;Z)V

    .line 728
    .line 729
    .line 730
    goto :goto_12

    .line 731
    :cond_11
    monitor-exit v2

    .line 732
    return-void

    .line 733
    :goto_13
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 734
    throw v0

    .line 735
    :pswitch_9
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 736
    .line 737
    check-cast v1, Ldefpackage/r20;

    .line 738
    .line 739
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v2, Ljava/lang/String;

    .line 742
    .line 743
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v0, Ljava/lang/String;

    .line 746
    .line 747
    iget-object v1, v1, Ldefpackage/r20;->q:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v1, Ldefpackage/mm3;

    .line 750
    .line 751
    iget-object v3, v1, Ldefpackage/mm3;->c:Ldefpackage/rm3;

    .line 752
    .line 753
    invoke-virtual {v3, v2}, Ldefpackage/rm3;->B(Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    if-eqz v0, :cond_12

    .line 757
    .line 758
    iget-object v3, v1, Ldefpackage/mm3;->d:Ldefpackage/qp4;

    .line 759
    .line 760
    invoke-virtual {v3, v2, v0}, Ldefpackage/qp4;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    :cond_12
    iget-object v0, v1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 764
    .line 765
    iget-object v0, v0, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, Ldefpackage/s24;

    .line 768
    .line 769
    new-instance v1, Ldefpackage/rs0;

    .line 770
    .line 771
    invoke-direct {v1, v4, v2}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 772
    .line 773
    .line 774
    invoke-static {v0, v7, v6, v1}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    const-string v0, "PlaylistRepository"

    .line 778
    .line 779
    new-instance v1, Ljava/lang/StringBuilder;

    .line 780
    .line 781
    const-string v3, "Deleted playlist "

    .line 782
    .line 783
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    .line 788
    .line 789
    const-string v2, " and its songs from local DB."

    .line 790
    .line 791
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v1

    .line 798
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :pswitch_a
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 803
    .line 804
    check-cast v1, Ldefpackage/mm3;

    .line 805
    .line 806
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 809
    .line 810
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v0, Ljava/util/ArrayList;

    .line 813
    .line 814
    const-string v4, "PlaylistRepository"

    .line 815
    .line 816
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v5

    .line 820
    iget-object v8, v1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 821
    .line 822
    iget-object v9, v8, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 823
    .line 824
    check-cast v9, Ldefpackage/s24;

    .line 825
    .line 826
    new-instance v10, Ldefpackage/hl3;

    .line 827
    .line 828
    invoke-direct {v10, v8, v2, v7}, Ldefpackage/hl3;-><init>(Ldefpackage/ml3;Lcom/eddyizm/tempus/subsonic/models/Playlist;I)V

    .line 829
    .line 830
    .line 831
    invoke-static {v9, v7, v6, v10}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal()Ljava/lang/Boolean;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    iget-object v8, v8, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v8, Ldefpackage/s24;

    .line 841
    .line 842
    new-instance v9, Ldefpackage/o;

    .line 843
    .line 844
    const/16 v10, 0x17

    .line 845
    .line 846
    invoke-direct {v9, v10, v2, v5}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 847
    .line 848
    .line 849
    invoke-static {v8, v7, v6, v9}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    iget-object v1, v1, Ldefpackage/mm3;->c:Ldefpackage/rm3;

    .line 853
    .line 854
    iget-object v2, v1, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v2, Ldefpackage/s24;

    .line 857
    .line 858
    new-instance v8, Ldefpackage/rs0;

    .line 859
    .line 860
    invoke-direct {v8, v3, v5}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 861
    .line 862
    .line 863
    invoke-static {v2, v6, v7, v8}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    check-cast v2, Ljava/util/List;

    .line 868
    .line 869
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 870
    .line 871
    .line 872
    move-result v3

    .line 873
    if-eqz v3, :cond_13

    .line 874
    .line 875
    if-eqz v2, :cond_16

    .line 876
    .line 877
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    if-nez v0, :cond_16

    .line 882
    .line 883
    invoke-virtual {v1, v5}, Ldefpackage/rm3;->B(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    new-instance v0, Ljava/lang/StringBuilder;

    .line 887
    .line 888
    const-string v1, "Cleared songs for playlist "

    .line 889
    .line 890
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v4, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 901
    .line 902
    .line 903
    goto :goto_15

    .line 904
    :cond_13
    if-eqz v2, :cond_14

    .line 905
    .line 906
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 907
    .line 908
    .line 909
    move-result v2

    .line 910
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    if-ne v2, v3, :cond_14

    .line 915
    .line 916
    new-instance v0, Ljava/lang/StringBuilder;

    .line 917
    .line 918
    const-string v1, "Songs for playlist "

    .line 919
    .line 920
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 924
    .line 925
    .line 926
    const-string v1, " already cached (size match)."

    .line 927
    .line 928
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 932
    .line 933
    .line 934
    move-result-object v0

    .line 935
    invoke-static {v4, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 936
    .line 937
    .line 938
    goto :goto_15

    .line 939
    :cond_14
    new-instance v2, Ljava/util/ArrayList;

    .line 940
    .line 941
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 942
    .line 943
    .line 944
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 945
    .line 946
    .line 947
    move-result v3

    .line 948
    move v8, v7

    .line 949
    :goto_14
    if-ge v8, v3, :cond_15

    .line 950
    .line 951
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v9

    .line 955
    add-int/lit8 v8, v8, 0x1

    .line 956
    .line 957
    check-cast v9, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 958
    .line 959
    new-instance v10, Lcom/eddyizm/tempus/model/PlaylistSong;

    .line 960
    .line 961
    invoke-direct {v10, v5, v9}, Lcom/eddyizm/tempus/model/PlaylistSong;-><init>(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 962
    .line 963
    .line 964
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 965
    .line 966
    .line 967
    goto :goto_14

    .line 968
    :cond_15
    invoke-virtual {v1, v5}, Ldefpackage/rm3;->B(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    iget-object v0, v1, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 972
    .line 973
    check-cast v0, Ldefpackage/s24;

    .line 974
    .line 975
    new-instance v3, Ldefpackage/o;

    .line 976
    .line 977
    const/16 v8, 0x18

    .line 978
    .line 979
    invoke-direct {v3, v8, v1, v2}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    invoke-static {v0, v7, v6, v3}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    new-instance v0, Ljava/lang/StringBuilder;

    .line 986
    .line 987
    const-string v1, "Cached "

    .line 988
    .line 989
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 993
    .line 994
    .line 995
    move-result v1

    .line 996
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 997
    .line 998
    .line 999
    const-string v1, " songs for playlist "

    .line 1000
    .line 1001
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    invoke-static {v4, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1012
    .line 1013
    .line 1014
    :cond_16
    :goto_15
    return-void

    .line 1015
    :pswitch_b
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1016
    .line 1017
    check-cast v1, Ldefpackage/mm3;

    .line 1018
    .line 1019
    iget-object v3, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v3, Ljava/util/List;

    .line 1022
    .line 1023
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast v0, Landroid/content/Context;

    .line 1026
    .line 1027
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v3

    .line 1031
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1032
    .line 1033
    .line 1034
    move-result v4

    .line 1035
    if-eqz v4, :cond_17

    .line 1036
    .line 1037
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 1042
    .line 1043
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v5

    .line 1047
    invoke-virtual {v1, v5, v7, v2}, Ldefpackage/mm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Ldefpackage/k03;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v5

    .line 1051
    new-instance v6, Ldefpackage/np1;

    .line 1052
    .line 1053
    invoke-direct {v6, v5, v0, v4}, Ldefpackage/np1;-><init>(Ldefpackage/k03;Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Playlist;)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v5, v6}, Ldefpackage/ad2;->f(Ldefpackage/a83;)V

    .line 1057
    .line 1058
    .line 1059
    goto :goto_16

    .line 1060
    :cond_17
    return-void

    .line 1061
    :pswitch_c
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v1, Ldefpackage/mm3;

    .line 1064
    .line 1065
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v2, Ljava/lang/String;

    .line 1068
    .line 1069
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1070
    .line 1071
    check-cast v0, Ljava/lang/Runnable;

    .line 1072
    .line 1073
    iget-object v3, v1, Ldefpackage/mm3;->c:Ldefpackage/rm3;

    .line 1074
    .line 1075
    invoke-virtual {v3, v2}, Ldefpackage/rm3;->B(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    iget-object v3, v1, Ldefpackage/mm3;->a:Ldefpackage/hg3;

    .line 1079
    .line 1080
    iget-object v3, v3, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast v3, Ldefpackage/s24;

    .line 1083
    .line 1084
    new-instance v5, Ldefpackage/rs0;

    .line 1085
    .line 1086
    const/16 v8, 0xb

    .line 1087
    .line 1088
    invoke-direct {v5, v8, v2}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v3, v7, v6, v5}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v3

    .line 1098
    if-eqz v3, :cond_18

    .line 1099
    .line 1100
    iget-object v5, v1, Ldefpackage/mm3;->d:Ldefpackage/qp4;

    .line 1101
    .line 1102
    invoke-virtual {v5, v2, v3}, Ldefpackage/qp4;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 1103
    .line 1104
    .line 1105
    :cond_18
    iget-object v3, v1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 1106
    .line 1107
    iget-object v3, v3, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 1108
    .line 1109
    check-cast v3, Ldefpackage/s24;

    .line 1110
    .line 1111
    new-instance v5, Ldefpackage/rs0;

    .line 1112
    .line 1113
    invoke-direct {v5, v4, v2}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    invoke-static {v3, v7, v6, v5}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    if-eqz v0, :cond_19

    .line 1120
    .line 1121
    new-instance v2, Landroid/os/Handler;

    .line 1122
    .line 1123
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1131
    .line 1132
    .line 1133
    :cond_19
    invoke-virtual {v1}, Ldefpackage/mm3;->h()V

    .line 1134
    .line 1135
    .line 1136
    return-void

    .line 1137
    :pswitch_d
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1138
    .line 1139
    check-cast v1, Ldefpackage/mm3;

    .line 1140
    .line 1141
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v2, Ljava/lang/String;

    .line 1144
    .line 1145
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1146
    .line 1147
    check-cast v0, Ljava/lang/String;

    .line 1148
    .line 1149
    iget-object v1, v1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 1150
    .line 1151
    iget-object v1, v1, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 1152
    .line 1153
    check-cast v1, Ldefpackage/s24;

    .line 1154
    .line 1155
    new-instance v3, Ldefpackage/ps0;

    .line 1156
    .line 1157
    invoke-direct {v3, v6, v0, v2}, Ldefpackage/ps0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-static {v1, v7, v6, v3}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    return-void

    .line 1164
    :pswitch_e
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1165
    .line 1166
    check-cast v1, Ldefpackage/mm3;

    .line 1167
    .line 1168
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1169
    .line 1170
    check-cast v2, Ljava/lang/String;

    .line 1171
    .line 1172
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1173
    .line 1174
    check-cast v0, Ldefpackage/k03;

    .line 1175
    .line 1176
    iget-object v1, v1, Ldefpackage/mm3;->c:Ldefpackage/rm3;

    .line 1177
    .line 1178
    iget-object v1, v1, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 1179
    .line 1180
    check-cast v1, Ldefpackage/s24;

    .line 1181
    .line 1182
    new-instance v4, Ldefpackage/rs0;

    .line 1183
    .line 1184
    invoke-direct {v4, v3, v2}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-static {v1, v6, v7, v4}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    check-cast v1, Ljava/util/List;

    .line 1192
    .line 1193
    if-eqz v1, :cond_1b

    .line 1194
    .line 1195
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v2

    .line 1199
    if-nez v2, :cond_1b

    .line 1200
    .line 1201
    new-instance v2, Ljava/util/ArrayList;

    .line 1202
    .line 1203
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1204
    .line 1205
    .line 1206
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1211
    .line 1212
    .line 1213
    move-result v3

    .line 1214
    if-eqz v3, :cond_1a

    .line 1215
    .line 1216
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v3

    .line 1220
    check-cast v3, Lcom/eddyizm/tempus/model/PlaylistSong;

    .line 1221
    .line 1222
    new-instance v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 1223
    .line 1224
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getId()Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v5

    .line 1228
    invoke-direct {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getTitle()Ljava/lang/String;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v5

    .line 1235
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getArtist()Ljava/lang/String;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v5

    .line 1242
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getAlbum()Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v5

    .line 1249
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getTrack()Ljava/lang/Integer;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v5

    .line 1256
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getCoverArtId()Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v5

    .line 1263
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getDuration()Ljava/lang/Integer;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v5

    .line 1270
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getAlbumId()Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v5

    .line 1277
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v3}, Lcom/eddyizm/tempus/model/PlaylistSong;->getArtistId()Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v3

    .line 1284
    invoke-virtual {v4, v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    goto :goto_17

    .line 1291
    :cond_1a
    invoke-virtual {v0, v2}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 1292
    .line 1293
    .line 1294
    :cond_1b
    return-void

    .line 1295
    :pswitch_f
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1296
    .line 1297
    check-cast v1, Ldefpackage/mm3;

    .line 1298
    .line 1299
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1300
    .line 1301
    check-cast v2, Ljava/lang/String;

    .line 1302
    .line 1303
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1304
    .line 1305
    check-cast v0, Landroid/content/Context;

    .line 1306
    .line 1307
    iget-object v3, v1, Ldefpackage/mm3;->d:Ldefpackage/qp4;

    .line 1308
    .line 1309
    iget-object v4, v3, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v4, Ldefpackage/s24;

    .line 1312
    .line 1313
    new-instance v8, Ldefpackage/o;

    .line 1314
    .line 1315
    const/16 v9, 0x1d

    .line 1316
    .line 1317
    invoke-direct {v8, v9, v3, v2}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1318
    .line 1319
    .line 1320
    invoke-static {v4, v6, v7, v8}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v2

    .line 1324
    check-cast v2, Ljava/util/List;

    .line 1325
    .line 1326
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v3

    .line 1330
    if-eqz v3, :cond_1c

    .line 1331
    .line 1332
    goto :goto_18

    .line 1333
    :cond_1c
    new-instance v3, Landroid/os/Handler;

    .line 1334
    .line 1335
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v4

    .line 1339
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1340
    .line 1341
    .line 1342
    new-instance v4, Ldefpackage/qo2;

    .line 1343
    .line 1344
    invoke-direct {v4, v1, v2, v0, v5}, Ldefpackage/qo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1348
    .line 1349
    .line 1350
    :goto_18
    return-void

    .line 1351
    :pswitch_10
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 1354
    .line 1355
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1356
    .line 1357
    check-cast v2, Ljava/util/List;

    .line 1358
    .line 1359
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1360
    .line 1361
    check-cast v0, Ljava/lang/String;

    .line 1362
    .line 1363
    new-instance v3, Ljava/util/ArrayList;

    .line 1364
    .line 1365
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1366
    .line 1367
    .line 1368
    invoke-static {v3}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 1369
    .line 1370
    .line 1371
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->r0:Ldefpackage/bl2;

    .line 1372
    .line 1373
    invoke-static {v2, v3, v7, v0}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 1374
    .line 1375
    .line 1376
    iget-object v0, v1, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1377
    .line 1378
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 1379
    .line 1380
    iget-object v0, v0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 1381
    .line 1382
    check-cast v0, Ldefpackage/au;

    .line 1383
    .line 1384
    invoke-virtual {v0, v6}, Ldefpackage/au;->d(Z)V

    .line 1385
    .line 1386
    .line 1387
    return-void

    .line 1388
    :pswitch_11
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1389
    .line 1390
    check-cast v1, Ldefpackage/zt2;

    .line 1391
    .line 1392
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1393
    .line 1394
    check-cast v2, Landroid/util/Pair;

    .line 1395
    .line 1396
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v0, Ljava/lang/Exception;

    .line 1399
    .line 1400
    iget-object v1, v1, Ldefpackage/zt2;->o:Ldefpackage/fo1;

    .line 1401
    .line 1402
    iget-object v1, v1, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 1403
    .line 1404
    check-cast v1, Ldefpackage/nj0;

    .line 1405
    .line 1406
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v3, Ljava/lang/Integer;

    .line 1409
    .line 1410
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1411
    .line 1412
    .line 1413
    move-result v3

    .line 1414
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v2, Ldefpackage/mt2;

    .line 1417
    .line 1418
    invoke-virtual {v1, v3, v2, v0}, Ldefpackage/nj0;->c(ILdefpackage/mt2;Ljava/lang/Exception;)V

    .line 1419
    .line 1420
    .line 1421
    return-void

    .line 1422
    :pswitch_12
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1423
    .line 1424
    check-cast v1, Ldefpackage/zt2;

    .line 1425
    .line 1426
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1427
    .line 1428
    check-cast v2, Landroid/util/Pair;

    .line 1429
    .line 1430
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v0, Ldefpackage/tv1;

    .line 1433
    .line 1434
    iget-object v1, v1, Ldefpackage/zt2;->o:Ldefpackage/fo1;

    .line 1435
    .line 1436
    iget-object v1, v1, Ldefpackage/fo1;->i:Ljava/lang/Object;

    .line 1437
    .line 1438
    check-cast v1, Ldefpackage/nj0;

    .line 1439
    .line 1440
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1441
    .line 1442
    check-cast v3, Ljava/lang/Integer;

    .line 1443
    .line 1444
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1445
    .line 1446
    .line 1447
    move-result v3

    .line 1448
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1449
    .line 1450
    check-cast v2, Ldefpackage/mt2;

    .line 1451
    .line 1452
    invoke-virtual {v1, v3, v2, v0}, Ldefpackage/nj0;->D(ILdefpackage/mt2;Ldefpackage/tv1;)V

    .line 1453
    .line 1454
    .line 1455
    return-void

    .line 1456
    :pswitch_13
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1457
    .line 1458
    check-cast v1, Ldefpackage/tn2;

    .line 1459
    .line 1460
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1461
    .line 1462
    check-cast v0, Ldefpackage/gr2;

    .line 1463
    .line 1464
    invoke-virtual {v1}, Ldefpackage/tn2;->l()Z

    .line 1465
    .line 1466
    .line 1467
    move-result v2

    .line 1468
    if-nez v2, :cond_1d

    .line 1469
    .line 1470
    iget-object v1, v1, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 1471
    .line 1472
    invoke-static {v1, v0}, Ldefpackage/ju2;->f(Ldefpackage/qi3;Ldefpackage/gr2;)V

    .line 1473
    .line 1474
    .line 1475
    :cond_1d
    return-void

    .line 1476
    :pswitch_14
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1477
    .line 1478
    check-cast v1, Ldefpackage/cj2;

    .line 1479
    .line 1480
    iget-object v3, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1481
    .line 1482
    check-cast v3, Ldefpackage/fr2;

    .line 1483
    .line 1484
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v0, Landroid/view/KeyEvent;

    .line 1487
    .line 1488
    iget-object v4, v1, Ldefpackage/cj2;->c:Ljava/lang/Object;

    .line 1489
    .line 1490
    check-cast v4, Ldefpackage/tn2;

    .line 1491
    .line 1492
    invoke-virtual {v4, v3}, Ldefpackage/tn2;->k(Ldefpackage/fr2;)Z

    .line 1493
    .line 1494
    .line 1495
    move-result v5

    .line 1496
    if-eqz v5, :cond_1e

    .line 1497
    .line 1498
    invoke-virtual {v4, v0, v7, v7}, Ldefpackage/tn2;->c(Landroid/view/KeyEvent;ZZ)Z

    .line 1499
    .line 1500
    .line 1501
    goto :goto_19

    .line 1502
    :cond_1e
    iget-object v0, v4, Ldefpackage/tn2;->h:Ldefpackage/ls2;

    .line 1503
    .line 1504
    iget-object v3, v3, Ldefpackage/fr2;->a:Ldefpackage/ms2;

    .line 1505
    .line 1506
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1507
    .line 1508
    .line 1509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    new-instance v4, Ldefpackage/bs2;

    .line 1513
    .line 1514
    invoke-direct {v4, v0, v6}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v0, v6, v4, v3, v6}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 1518
    .line 1519
    .line 1520
    :goto_19
    iput-object v2, v1, Ldefpackage/cj2;->b:Ljava/lang/Object;

    .line 1521
    .line 1522
    return-void

    .line 1523
    :pswitch_15
    iget-object v1, v0, Ldefpackage/qo2;->o:Ljava/lang/Object;

    .line 1524
    .line 1525
    check-cast v1, Ldefpackage/ro2;

    .line 1526
    .line 1527
    iget-object v2, v0, Ldefpackage/qo2;->p:Ljava/lang/Object;

    .line 1528
    .line 1529
    check-cast v2, Ldefpackage/uw1;

    .line 1530
    .line 1531
    iget-object v0, v0, Ldefpackage/qo2;->q:Ljava/lang/Object;

    .line 1532
    .line 1533
    check-cast v0, Ldefpackage/mt2;

    .line 1534
    .line 1535
    iget-object v1, v1, Ldefpackage/ro2;->c:Ldefpackage/nj0;

    .line 1536
    .line 1537
    invoke-virtual {v2}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v2

    .line 1541
    iget-object v3, v1, Ldefpackage/nj0;->q:Ldefpackage/ml3;

    .line 1542
    .line 1543
    iget-object v1, v1, Ldefpackage/nj0;->t:Ldefpackage/qi3;

    .line 1544
    .line 1545
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1549
    .line 1550
    .line 1551
    invoke-static {v2}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v4

    .line 1555
    iput-object v4, v3, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 1556
    .line 1557
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 1558
    .line 1559
    .line 1560
    move-result v4

    .line 1561
    if-nez v4, :cond_1f

    .line 1562
    .line 1563
    invoke-virtual {v2, v7}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v2

    .line 1567
    check-cast v2, Ldefpackage/mt2;

    .line 1568
    .line 1569
    iput-object v2, v3, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 1570
    .line 1571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1572
    .line 1573
    .line 1574
    iput-object v0, v3, Ldefpackage/ml3;->f:Ljava/lang/Object;

    .line 1575
    .line 1576
    :cond_1f
    iget-object v0, v3, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 1577
    .line 1578
    check-cast v0, Ldefpackage/mt2;

    .line 1579
    .line 1580
    if-nez v0, :cond_20

    .line 1581
    .line 1582
    iget-object v0, v3, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v0, Ldefpackage/yw1;

    .line 1585
    .line 1586
    iget-object v2, v3, Ldefpackage/ml3;->e:Ljava/lang/Object;

    .line 1587
    .line 1588
    check-cast v2, Ldefpackage/mt2;

    .line 1589
    .line 1590
    iget-object v4, v3, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 1591
    .line 1592
    check-cast v4, Ldefpackage/zt4;

    .line 1593
    .line 1594
    invoke-static {v1, v0, v2, v4}, Ldefpackage/ml3;->k(Ldefpackage/qi3;Ldefpackage/yw1;Ldefpackage/mt2;Ldefpackage/zt4;)Ldefpackage/mt2;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v0

    .line 1598
    iput-object v0, v3, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 1599
    .line 1600
    :cond_20
    invoke-interface {v1}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v0

    .line 1604
    invoke-virtual {v3, v0}, Ldefpackage/ml3;->v(Ldefpackage/cu4;)V

    .line 1605
    .line 1606
    .line 1607
    return-void

    .line 1608
    nop

    .line 1609
    :pswitch_data_0
    .packed-switch 0x0
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

    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    :sswitch_data_0
    .sparse-switch
        -0x5a55df9e -> :sswitch_4
        -0x9c491e -> :sswitch_3
        0x31ec4a0a -> :sswitch_2
        0x31ed614a -> :sswitch_1
        0x6ed17ef2 -> :sswitch_0
    .end sparse-switch
.end method
