.class public final Ldefpackage/gk0;
.super Landroid/os/Handler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/gm2;Landroid/os/Looper;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/gk0;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Ldefpackage/gk0;->b:Z

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ldefpackage/ik0;Landroid/os/Looper;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/gk0;->a:I

    .line 13
    iput-object p1, p0, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 14
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Ldefpackage/gk0;->a:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string v5, "MediaControllerCompat"

    .line 13
    .line 14
    iget-object v0, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v6, v0

    .line 17
    check-cast v6, Ldefpackage/gm2;

    .line 18
    .line 19
    iget-object v7, v6, Ldefpackage/gm2;->e:Ldefpackage/im2;

    .line 20
    .line 21
    iget-boolean v0, v1, Ldefpackage/gk0;->b:Z

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_0
    iget v0, v2, Landroid/os/Message;->what:I

    .line 28
    .line 29
    if-eq v0, v4, :cond_7

    .line 30
    .line 31
    const/16 v1, 0x8

    .line 32
    .line 33
    if-eq v0, v1, :cond_6

    .line 34
    .line 35
    const/16 v1, 0x9

    .line 36
    .line 37
    if-eq v0, v1, :cond_5

    .line 38
    .line 39
    packed-switch v0, :pswitch_data_1

    .line 40
    .line 41
    .line 42
    goto/16 :goto_7

    .line 43
    .line 44
    :pswitch_0
    iget-boolean v0, v7, Ldefpackage/im2;->l:Z

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v7}, Ldefpackage/im2;->e1()V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_7

    .line 52
    .line 53
    :cond_1
    iget-object v1, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 54
    .line 55
    iget-object v0, v7, Ldefpackage/im2;->i:Ldefpackage/wo0;

    .line 56
    .line 57
    invoke-virtual {v0}, Ldefpackage/wo0;->z()Ldefpackage/ei3;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, Ldefpackage/im2;->Y0(Ldefpackage/ei3;)Ldefpackage/ei3;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    iget-object v0, v7, Ldefpackage/im2;->i:Ldefpackage/wo0;

    .line 66
    .line 67
    iget-object v0, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ldefpackage/xk2;

    .line 70
    .line 71
    iget-object v0, v0, Ldefpackage/xk2;->e:Ldefpackage/pr2;

    .line 72
    .line 73
    invoke-virtual {v0}, Ldefpackage/pr2;->a()Ldefpackage/qu1;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const/4 v2, -0x1

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    :try_start_0
    invoke-interface {v0}, Ldefpackage/qu1;->h()I

    .line 81
    .line 82
    .line 83
    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    move v14, v0

    .line 85
    goto :goto_1

    .line 86
    :catch_0
    move-exception v0

    .line 87
    goto :goto_0

    .line 88
    :catch_1
    move-exception v0

    .line 89
    :goto_0
    const-string v4, "Dead object in getRepeatMode."

    .line 90
    .line 91
    invoke-static {v5, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    move v14, v2

    .line 95
    :goto_1
    iget-object v0, v7, Ldefpackage/im2;->i:Ldefpackage/wo0;

    .line 96
    .line 97
    iget-object v0, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Ldefpackage/xk2;

    .line 100
    .line 101
    iget-object v0, v0, Ldefpackage/xk2;->e:Ldefpackage/pr2;

    .line 102
    .line 103
    invoke-virtual {v0}, Ldefpackage/pr2;->a()Ldefpackage/qu1;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    :try_start_1
    invoke-interface {v0}, Ldefpackage/qu1;->V()I

    .line 110
    .line 111
    .line 112
    move-result v2
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 113
    :cond_3
    :goto_2
    move v15, v2

    .line 114
    goto :goto_4

    .line 115
    :catch_2
    move-exception v0

    .line 116
    goto :goto_3

    .line 117
    :catch_3
    move-exception v0

    .line 118
    :goto_3
    const-string v4, "Dead object in getShuffleMode."

    .line 119
    .line 120
    invoke-static {v5, v4, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :goto_4
    new-instance v8, Ldefpackage/hm2;

    .line 125
    .line 126
    iget-object v0, v1, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v9, v0

    .line 129
    check-cast v9, Ldefpackage/fg4;

    .line 130
    .line 131
    iget-object v0, v1, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v11, v0

    .line 134
    check-cast v11, Ldefpackage/eo2;

    .line 135
    .line 136
    iget-object v12, v1, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 137
    .line 138
    iget-object v0, v1, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v13, v0

    .line 141
    check-cast v13, Ljava/lang/CharSequence;

    .line 142
    .line 143
    iget-object v0, v1, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 144
    .line 145
    move-object/from16 v16, v0

    .line 146
    .line 147
    check-cast v16, Landroid/os/Bundle;

    .line 148
    .line 149
    invoke-direct/range {v8 .. v16}, Ldefpackage/hm2;-><init>(Ldefpackage/fg4;Ldefpackage/ei3;Ldefpackage/eo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 150
    .line 151
    .line 152
    iput-object v8, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 153
    .line 154
    iget-object v0, v7, Ldefpackage/im2;->i:Ldefpackage/wo0;

    .line 155
    .line 156
    iget-object v0, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Ldefpackage/xk2;

    .line 159
    .line 160
    iget-object v0, v0, Ldefpackage/xk2;->e:Ldefpackage/pr2;

    .line 161
    .line 162
    invoke-virtual {v0}, Ldefpackage/pr2;->a()Ldefpackage/qu1;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    const/4 v1, 0x0

    .line 167
    if-eqz v0, :cond_4

    .line 168
    .line 169
    :try_start_2
    invoke-interface {v0}, Ldefpackage/qu1;->Y()Z

    .line 170
    .line 171
    .line 172
    move-result v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_4

    .line 173
    goto :goto_6

    .line 174
    :catch_4
    move-exception v0

    .line 175
    goto :goto_5

    .line 176
    :catch_5
    move-exception v0

    .line 177
    :goto_5
    const-string v2, "Dead object in isCaptioningEnabled."

    .line 178
    .line 179
    invoke-static {v5, v2, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    :cond_4
    move v0, v1

    .line 183
    :goto_6
    invoke-virtual {v6, v0}, Ldefpackage/gm2;->a(Z)V

    .line 184
    .line 185
    .line 186
    iget-object v0, v6, Ldefpackage/gm2;->d:Landroid/os/Handler;

    .line 187
    .line 188
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 192
    .line 193
    invoke-virtual {v7, v1, v0}, Ldefpackage/im2;->b1(ZLdefpackage/hm2;)V

    .line 194
    .line 195
    .line 196
    goto/16 :goto_7

    .line 197
    .line 198
    :pswitch_1
    iget-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Ljava/lang/Integer;

    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    iget-object v0, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 207
    .line 208
    new-instance v8, Ldefpackage/hm2;

    .line 209
    .line 210
    iget-object v1, v0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 211
    .line 212
    move-object v9, v1

    .line 213
    check-cast v9, Ldefpackage/fg4;

    .line 214
    .line 215
    iget-object v1, v0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 216
    .line 217
    move-object v10, v1

    .line 218
    check-cast v10, Ldefpackage/ei3;

    .line 219
    .line 220
    iget-object v1, v0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 221
    .line 222
    move-object v11, v1

    .line 223
    check-cast v11, Ldefpackage/eo2;

    .line 224
    .line 225
    iget-object v12, v0, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 226
    .line 227
    iget-object v1, v0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 228
    .line 229
    move-object v13, v1

    .line 230
    check-cast v13, Ljava/lang/CharSequence;

    .line 231
    .line 232
    iget v14, v0, Ldefpackage/hm2;->b:I

    .line 233
    .line 234
    iget-object v0, v0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 235
    .line 236
    move-object/from16 v16, v0

    .line 237
    .line 238
    check-cast v16, Landroid/os/Bundle;

    .line 239
    .line 240
    invoke-direct/range {v8 .. v16}, Ldefpackage/hm2;-><init>(Ldefpackage/fg4;Ldefpackage/ei3;Ldefpackage/eo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 241
    .line 242
    .line 243
    iput-object v8, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 244
    .line 245
    invoke-virtual {v6}, Ldefpackage/gm2;->e()V

    .line 246
    .line 247
    .line 248
    goto :goto_7

    .line 249
    :pswitch_2
    iget-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v0, Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    invoke-virtual {v6, v0}, Ldefpackage/gm2;->a(Z)V

    .line 258
    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_5
    iget-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    iget-object v0, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 270
    .line 271
    new-instance v8, Ldefpackage/hm2;

    .line 272
    .line 273
    iget-object v1, v0, Ldefpackage/hm2;->d:Ljava/lang/Object;

    .line 274
    .line 275
    move-object v9, v1

    .line 276
    check-cast v9, Ldefpackage/fg4;

    .line 277
    .line 278
    iget-object v1, v0, Ldefpackage/hm2;->e:Ljava/lang/Object;

    .line 279
    .line 280
    move-object v10, v1

    .line 281
    check-cast v10, Ldefpackage/ei3;

    .line 282
    .line 283
    iget-object v1, v0, Ldefpackage/hm2;->f:Ljava/lang/Object;

    .line 284
    .line 285
    move-object v11, v1

    .line 286
    check-cast v11, Ldefpackage/eo2;

    .line 287
    .line 288
    iget-object v12, v0, Ldefpackage/hm2;->a:Ljava/util/List;

    .line 289
    .line 290
    iget-object v1, v0, Ldefpackage/hm2;->g:Ljava/lang/Object;

    .line 291
    .line 292
    move-object v13, v1

    .line 293
    check-cast v13, Ljava/lang/CharSequence;

    .line 294
    .line 295
    iget v15, v0, Ldefpackage/hm2;->c:I

    .line 296
    .line 297
    iget-object v0, v0, Ldefpackage/hm2;->h:Ljava/lang/Object;

    .line 298
    .line 299
    move-object/from16 v16, v0

    .line 300
    .line 301
    check-cast v16, Landroid/os/Bundle;

    .line 302
    .line 303
    invoke-direct/range {v8 .. v16}, Ldefpackage/hm2;-><init>(Ldefpackage/fg4;Ldefpackage/ei3;Ldefpackage/eo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 304
    .line 305
    .line 306
    iput-object v8, v7, Ldefpackage/im2;->n:Ldefpackage/hm2;

    .line 307
    .line 308
    invoke-virtual {v6}, Ldefpackage/gm2;->e()V

    .line 309
    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_6
    invoke-virtual {v7}, Ldefpackage/im2;->a1()Ldefpackage/sk2;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {v0}, Ldefpackage/sk2;->Y0()V

    .line 317
    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_7
    iget-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v0, Ldefpackage/ei3;

    .line 323
    .line 324
    invoke-virtual {v6, v0}, Ldefpackage/gm2;->b(Ldefpackage/ei3;)V

    .line 325
    .line 326
    .line 327
    :goto_7
    return-void

    .line 328
    :pswitch_3
    iget-object v0, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 329
    .line 330
    move-object v5, v0

    .line 331
    check-cast v5, Ldefpackage/hk0;

    .line 332
    .line 333
    :try_start_3
    iget v0, v2, Landroid/os/Message;->what:I

    .line 334
    .line 335
    if-eq v0, v3, :cond_a

    .line 336
    .line 337
    if-ne v0, v4, :cond_9

    .line 338
    .line 339
    iget-object v0, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v0, Ldefpackage/ik0;

    .line 342
    .line 343
    iget-object v4, v0, Ldefpackage/ik0;->k:Ldefpackage/ll;

    .line 344
    .line 345
    iget-object v0, v0, Ldefpackage/ik0;->l:Ljava/util/UUID;

    .line 346
    .line 347
    iget-object v6, v5, Ldefpackage/hk0;->d:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v6, Ldefpackage/k31;

    .line 350
    .line 351
    invoke-virtual {v4, v0, v6}, Ldefpackage/ll;->e(Ljava/util/UUID;Ldefpackage/k31;)Ldefpackage/qm2;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    iget-object v4, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v4, Ldefpackage/ik0;

    .line 358
    .line 359
    iget-object v4, v4, Ldefpackage/ik0;->o:Ljava/lang/Object;

    .line 360
    .line 361
    monitor-enter v4
    :try_end_3
    .catch Landroidx/media3/exoplayer/drm/MediaDrmCallbackException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    .line 362
    :try_start_4
    iget-object v6, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v6, Ldefpackage/ik0;

    .line 365
    .line 366
    iget-object v6, v6, Ldefpackage/ik0;->y:Ldefpackage/si1;

    .line 367
    .line 368
    if-eqz v6, :cond_8

    .line 369
    .line 370
    iget-object v7, v0, Ldefpackage/qm2;->b:Ldefpackage/ed2;

    .line 371
    .line 372
    if-eqz v7, :cond_8

    .line 373
    .line 374
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 375
    .line 376
    .line 377
    move-result-wide v8

    .line 378
    iget-wide v10, v5, Ldefpackage/hk0;->c:J

    .line 379
    .line 380
    sub-long v18, v8, v10

    .line 381
    .line 382
    new-instance v12, Ldefpackage/ed2;

    .line 383
    .line 384
    iget-object v13, v7, Ldefpackage/ed2;->a:Ldefpackage/ii0;

    .line 385
    .line 386
    iget-object v14, v7, Ldefpackage/ed2;->b:Landroid/net/Uri;

    .line 387
    .line 388
    iget-object v15, v7, Ldefpackage/ed2;->c:Ljava/util/Map;

    .line 389
    .line 390
    iget-wide v8, v7, Ldefpackage/ed2;->d:J

    .line 391
    .line 392
    iget-wide v10, v7, Ldefpackage/ed2;->f:J

    .line 393
    .line 394
    move-wide/from16 v16, v8

    .line 395
    .line 396
    move-wide/from16 v20, v10

    .line 397
    .line 398
    invoke-direct/range {v12 .. v21}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 399
    .line 400
    .line 401
    iget-object v6, v6, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v6, Ldefpackage/uw1;

    .line 404
    .line 405
    invoke-virtual {v6, v12}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    goto :goto_8

    .line 409
    :catchall_0
    move-exception v0

    .line 410
    goto :goto_9

    .line 411
    :cond_8
    :goto_8
    monitor-exit v4

    .line 412
    goto/16 :goto_10

    .line 413
    .line 414
    :goto_9
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 415
    :try_start_5
    throw v0

    .line 416
    :catch_6
    move-exception v0

    .line 417
    goto :goto_a

    .line 418
    :catch_7
    move-exception v0

    .line 419
    goto :goto_b

    .line 420
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 421
    .line 422
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 423
    .line 424
    .line 425
    throw v0

    .line 426
    :cond_a
    iget-object v0, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v0, Ldefpackage/ik0;

    .line 429
    .line 430
    iget-object v0, v0, Ldefpackage/ik0;->k:Ldefpackage/ll;

    .line 431
    .line 432
    iget-object v4, v5, Ldefpackage/hk0;->d:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v4, Ldefpackage/l31;

    .line 435
    .line 436
    invoke-virtual {v0, v4}, Ldefpackage/ll;->f(Ldefpackage/l31;)Ldefpackage/qm2;

    .line 437
    .line 438
    .line 439
    move-result-object v0
    :try_end_5
    .catch Landroidx/media3/exoplayer/drm/MediaDrmCallbackException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    .line 440
    goto/16 :goto_10

    .line 441
    .line 442
    :goto_a
    const-string v3, "DefaultDrmSession"

    .line 443
    .line 444
    const-string v4, "Key/provisioning request produced an unexpected exception. Not retrying."

    .line 445
    .line 446
    invoke-static {v3, v4, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 447
    .line 448
    .line 449
    goto/16 :goto_10

    .line 450
    .line 451
    :goto_b
    iget-object v4, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v4, Ldefpackage/hk0;

    .line 454
    .line 455
    iget-boolean v6, v4, Ldefpackage/hk0;->b:Z

    .line 456
    .line 457
    if-nez v6, :cond_b

    .line 458
    .line 459
    goto/16 :goto_10

    .line 460
    .line 461
    :cond_b
    iget v6, v4, Ldefpackage/hk0;->e:I

    .line 462
    .line 463
    add-int/2addr v6, v3

    .line 464
    iput v6, v4, Ldefpackage/hk0;->e:I

    .line 465
    .line 466
    iget-object v7, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v7, Ldefpackage/ik0;

    .line 469
    .line 470
    iget-object v7, v7, Ldefpackage/ik0;->i:Ldefpackage/i80;

    .line 471
    .line 472
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    const/4 v7, 0x3

    .line 476
    if-le v6, v7, :cond_c

    .line 477
    .line 478
    goto/16 :goto_10

    .line 479
    .line 480
    :cond_c
    new-instance v8, Ldefpackage/ed2;

    .line 481
    .line 482
    iget-object v9, v0, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;->n:Ldefpackage/ii0;

    .line 483
    .line 484
    iget-object v10, v0, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;->o:Landroid/net/Uri;

    .line 485
    .line 486
    iget-object v11, v0, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;->p:Ljava/util/Map;

    .line 487
    .line 488
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 489
    .line 490
    .line 491
    move-result-wide v12

    .line 492
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 493
    .line 494
    .line 495
    move-result-wide v6

    .line 496
    iget-wide v14, v4, Ldefpackage/hk0;->c:J

    .line 497
    .line 498
    sub-long v14, v6, v14

    .line 499
    .line 500
    iget-wide v6, v0, Landroidx/media3/exoplayer/drm/MediaDrmCallbackException;->q:J

    .line 501
    .line 502
    move-wide/from16 v16, v6

    .line 503
    .line 504
    invoke-direct/range {v8 .. v17}, Ldefpackage/ed2;-><init>(Ldefpackage/ii0;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 508
    .line 509
    .line 510
    move-result-object v6

    .line 511
    instance-of v6, v6, Ljava/io/IOException;

    .line 512
    .line 513
    if-eqz v6, :cond_d

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    check-cast v6, Ljava/io/IOException;

    .line 520
    .line 521
    goto :goto_c

    .line 522
    :cond_d
    new-instance v6, Landroidx/media3/exoplayer/drm/DefaultDrmSession$UnexpectedDrmSessionException;

    .line 523
    .line 524
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 529
    .line 530
    .line 531
    :goto_c
    iget-object v7, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 532
    .line 533
    check-cast v7, Ldefpackage/ik0;

    .line 534
    .line 535
    iget-object v7, v7, Ldefpackage/ik0;->i:Ldefpackage/i80;

    .line 536
    .line 537
    iget v4, v4, Ldefpackage/hk0;->e:I

    .line 538
    .line 539
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    :goto_d
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    if-eqz v6, :cond_10

    .line 548
    .line 549
    instance-of v7, v6, Landroidx/media3/common/ParserException;

    .line 550
    .line 551
    if-nez v7, :cond_f

    .line 552
    .line 553
    instance-of v7, v6, Ljava/io/FileNotFoundException;

    .line 554
    .line 555
    if-nez v7, :cond_f

    .line 556
    .line 557
    instance-of v7, v6, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    .line 558
    .line 559
    if-nez v7, :cond_f

    .line 560
    .line 561
    instance-of v7, v6, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    .line 562
    .line 563
    if-nez v7, :cond_f

    .line 564
    .line 565
    instance-of v7, v6, Landroidx/media3/datasource/DataSourceException;

    .line 566
    .line 567
    if-eqz v7, :cond_e

    .line 568
    .line 569
    move-object v7, v6

    .line 570
    check-cast v7, Landroidx/media3/datasource/DataSourceException;

    .line 571
    .line 572
    iget v7, v7, Landroidx/media3/datasource/DataSourceException;->n:I

    .line 573
    .line 574
    const/16 v11, 0x7d8

    .line 575
    .line 576
    if-ne v7, v11, :cond_e

    .line 577
    .line 578
    goto :goto_e

    .line 579
    :cond_e
    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    goto :goto_d

    .line 584
    :cond_f
    :goto_e
    move-wide v3, v9

    .line 585
    goto :goto_f

    .line 586
    :cond_10
    sub-int/2addr v4, v3

    .line 587
    mul-int/lit16 v4, v4, 0x3e8

    .line 588
    .line 589
    const/16 v3, 0x1388

    .line 590
    .line 591
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 592
    .line 593
    .line 594
    move-result v3

    .line 595
    int-to-long v3, v3

    .line 596
    :goto_f
    cmp-long v6, v3, v9

    .line 597
    .line 598
    if-nez v6, :cond_11

    .line 599
    .line 600
    goto :goto_10

    .line 601
    :cond_11
    iget-object v6, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v6, Ldefpackage/ik0;

    .line 604
    .line 605
    iget-object v6, v6, Ldefpackage/ik0;->o:Ljava/lang/Object;

    .line 606
    .line 607
    monitor-enter v6

    .line 608
    :try_start_6
    iget-object v7, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v7, Ldefpackage/ik0;

    .line 611
    .line 612
    iget-object v7, v7, Ldefpackage/ik0;->y:Ldefpackage/si1;

    .line 613
    .line 614
    if-eqz v7, :cond_12

    .line 615
    .line 616
    iget-object v7, v7, Ldefpackage/si1;->o:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v7, Ldefpackage/uw1;

    .line 619
    .line 620
    invoke-virtual {v7, v8}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    :cond_12
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 624
    monitor-enter p0

    .line 625
    :try_start_7
    iget-boolean v6, v1, Ldefpackage/gk0;->b:Z

    .line 626
    .line 627
    if-nez v6, :cond_13

    .line 628
    .line 629
    invoke-static {v2}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v1, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 634
    .line 635
    .line 636
    monitor-exit p0

    .line 637
    goto :goto_12

    .line 638
    :catchall_1
    move-exception v0

    .line 639
    goto :goto_14

    .line 640
    :cond_13
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 641
    :goto_10
    iget-object v3, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v3, Ldefpackage/ik0;

    .line 644
    .line 645
    iget-object v3, v3, Ldefpackage/ik0;->i:Ldefpackage/i80;

    .line 646
    .line 647
    iget-wide v6, v5, Ldefpackage/hk0;->a:J

    .line 648
    .line 649
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    monitor-enter p0

    .line 653
    :try_start_8
    iget-boolean v3, v1, Ldefpackage/gk0;->b:Z

    .line 654
    .line 655
    if-nez v3, :cond_14

    .line 656
    .line 657
    iget-object v3, v1, Ldefpackage/gk0;->c:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v3, Ldefpackage/ik0;

    .line 660
    .line 661
    iget-object v3, v3, Ldefpackage/ik0;->n:Ldefpackage/zk;

    .line 662
    .line 663
    iget v2, v2, Landroid/os/Message;->what:I

    .line 664
    .line 665
    iget-object v4, v5, Ldefpackage/hk0;->d:Ljava/lang/Object;

    .line 666
    .line 667
    invoke-static {v4, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v3, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 676
    .line 677
    .line 678
    goto :goto_11

    .line 679
    :catchall_2
    move-exception v0

    .line 680
    goto :goto_13

    .line 681
    :cond_14
    :goto_11
    monitor-exit p0

    .line 682
    :goto_12
    return-void

    .line 683
    :goto_13
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 684
    throw v0

    .line 685
    :goto_14
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 686
    throw v0

    .line 687
    :catchall_3
    move-exception v0

    .line 688
    :try_start_a
    monitor-exit v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 689
    throw v0

    .line 690
    nop

    .line 691
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :pswitch_data_1
    .packed-switch 0xb
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
