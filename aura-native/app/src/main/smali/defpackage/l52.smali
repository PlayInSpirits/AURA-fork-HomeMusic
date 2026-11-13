.class public final synthetic Ldefpackage/l52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/net/nsd/NsdServiceInfo;

.field public final synthetic r:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;Landroid/net/nsd/NsdServiceInfo;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/l52;->n:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Ldefpackage/l52;->o:J

    .line 7
    .line 8
    iput-object p4, p0, Ldefpackage/l52;->p:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Ldefpackage/l52;->q:Landroid/net/nsd/NsdServiceInfo;

    .line 11
    .line 12
    iput-object p6, p0, Ldefpackage/l52;->r:Landroid/content/Context;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-object v0, p0, Ldefpackage/l52;->n:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v2, p0, Ldefpackage/l52;->o:J

    .line 4
    .line 5
    iget-object v7, p0, Ldefpackage/l52;->p:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v8, p0, Ldefpackage/l52;->q:Landroid/net/nsd/NsdServiceInfo;

    .line 8
    .line 9
    iget-object v5, p0, Ldefpackage/l52;->r:Landroid/content/Context;

    .line 10
    .line 11
    sget-object p0, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 12
    .line 13
    sget-object p0, Ldefpackage/fz0;->j0:Ldefpackage/fz0;

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0}, Ldefpackage/fz0;->e()Ljavax/net/ssl/SSLContext;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v10, 0x1

    .line 21
    move-object v1, v0

    .line 22
    move v4, v10

    .line 23
    :goto_0
    sget-wide v11, Ldefpackage/u52;->i:J

    .line 24
    .line 25
    cmp-long v0, v11, v2

    .line 26
    .line 27
    if-nez v0, :cond_a

    .line 28
    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 34
    .line 35
    .line 36
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 37
    if-nez v0, :cond_a

    .line 38
    .line 39
    :try_start_1
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    invoke-static {p0, v8, v2, v3, v10}, Ldefpackage/u52;->i(Ljavax/net/ssl/SSLContext;Landroid/net/nsd/NsdServiceInfo;JZ)Ljavax/net/ssl/SSLSocket;

    .line 50
    .line 51
    .line 52
    move-result-object v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 53
    :try_start_2
    invoke-static {v11}, Ldefpackage/fz0;->m(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v12

    .line 57
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const-string v0, "lan-playback"

    .line 63
    .line 64
    const/4 v13, 0x0

    .line 65
    invoke-virtual {v5, v0, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v6, "receivers"

    .line 70
    .line 71
    sget-object v14, Ldefpackage/z01;->n:Ldefpackage/z01;

    .line 72
    .line 73
    invoke-interface {v0, v6, v14}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v0, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    invoke-virtual {v12, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    move-object v12, v1

    .line 97
    :goto_1
    move-object v1, v0

    .line 98
    goto/16 :goto_5

    .line 99
    .line 100
    :cond_0
    :goto_2
    :try_start_3
    sput-object v12, Ldefpackage/u52;->k:Ljava/lang/String;

    .line 101
    .line 102
    new-instance v0, Lorg/json/JSONObject;

    .line 103
    .line 104
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v1, "command"

    .line 108
    .line 109
    const-string v6, "watch"

    .line 110
    .line 111
    invoke-virtual {v0, v1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-static {v11, v0}, Ldefpackage/fz0;->p(Ljavax/net/ssl/SSLSocket;Lorg/json/JSONObject;)V

    .line 119
    .line 120
    .line 121
    sget-object v0, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 122
    .line 123
    const-string v0, "Controller subscribed to live playback"

    .line 124
    .line 125
    invoke-static {v0}, Ldefpackage/w42;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 126
    .line 127
    .line 128
    move v6, v4

    .line 129
    :goto_3
    :try_start_4
    sget-wide v0, Ldefpackage/u52;->i:J

    .line 130
    .line 131
    cmp-long v0, v0, v2

    .line 132
    .line 133
    if-nez v0, :cond_5

    .line 134
    .line 135
    invoke-static {v11}, Ldefpackage/fz0;->n(Ljavax/net/ssl/SSLSocket;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v1, v7}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_4

    .line 148
    .line 149
    const-string v1, "error"

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_3

    .line 156
    .line 157
    const-string v1, "remoteVersion"

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    const/4 v4, 0x4

    .line 164
    if-lt v1, v4, :cond_2

    .line 165
    .line 166
    const-string v1, "server"

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    new-array v4, v10, [C

    .line 173
    .line 174
    const/16 v14, 0x2f

    .line 175
    .line 176
    aput-char v14, v4, v13

    .line 177
    .line 178
    invoke-static {v7, v4}, Ldefpackage/qm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    sget-object v14, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 183
    .line 184
    invoke-virtual {v4, v14}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v4}, Ldefpackage/fz0;->h([B)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-static {v1, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_1

    .line 200
    .line 201
    invoke-static {v0}, Ldefpackage/u52;->e(Lorg/json/JSONObject;)Ldefpackage/v52;

    .line 202
    .line 203
    .line 204
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 205
    :try_start_5
    sget-object v0, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 206
    .line 207
    new-instance v1, Ldefpackage/m52;

    .line 208
    .line 209
    invoke-direct/range {v1 .. v6}, Ldefpackage/m52;-><init>(JLdefpackage/v52;Landroid/content/Context;Z)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 213
    .line 214
    .line 215
    move v6, v13

    .line 216
    goto :goto_3

    .line 217
    :catchall_1
    move-exception v0

    .line 218
    move-object v1, v0

    .line 219
    move v4, v13

    .line 220
    goto :goto_5

    .line 221
    :catchall_2
    move-exception v0

    .line 222
    move-object v1, v0

    .line 223
    move v4, v6

    .line 224
    goto :goto_5

    .line 225
    :cond_1
    :try_start_6
    new-instance v0, Ldefpackage/s52;

    .line 226
    .line 227
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 228
    .line 229
    .line 230
    throw v0

    .line 231
    :cond_2
    new-instance v0, Ldefpackage/t52;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 234
    .line 235
    .line 236
    throw v0

    .line 237
    :cond_3
    new-instance v0, Ldefpackage/r52;

    .line 238
    .line 239
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_4
    new-instance v0, Ldefpackage/s52;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 246
    .line 247
    .line 248
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 249
    :cond_5
    :try_start_7
    invoke-interface {v11}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 250
    .line 251
    .line 252
    move v4, v6

    .line 253
    move-object v1, v12

    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :catchall_3
    move-exception v0

    .line 257
    move-object p0, v0

    .line 258
    goto/16 :goto_b

    .line 259
    .line 260
    :catch_0
    move-exception v0

    .line 261
    move v4, v6

    .line 262
    :goto_4
    move-object v1, v12

    .line 263
    goto :goto_6

    .line 264
    :catchall_4
    move-exception v0

    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_6
    :try_start_8
    new-instance v0, Ldefpackage/p52;

    .line 268
    .line 269
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 270
    .line 271
    .line 272
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 273
    :goto_5
    :try_start_9
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 274
    :catchall_5
    move-exception v0

    .line 275
    :try_start_a
    invoke-static {v11, v1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 276
    .line 277
    .line 278
    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 279
    :catch_1
    move-exception v0

    .line 280
    goto :goto_4

    .line 281
    :catch_2
    move-exception v0

    .line 282
    goto :goto_6

    .line 283
    :cond_7
    :try_start_b
    new-instance v0, Ldefpackage/s52;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 286
    .line 287
    .line 288
    throw v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 289
    :goto_6
    :try_start_c
    sget-wide v11, Ldefpackage/u52;->i:J

    .line 290
    .line 291
    cmp-long v6, v11, v2

    .line 292
    .line 293
    if-nez v6, :cond_a

    .line 294
    .line 295
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-virtual {v6}, Ljava/lang/Thread;->isInterrupted()Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    if-eqz v6, :cond_8

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_8
    instance-of v6, v0, Ldefpackage/p52;

    .line 307
    .line 308
    if-nez v6, :cond_9

    .line 309
    .line 310
    instance-of v6, v0, Ldefpackage/s52;

    .line 311
    .line 312
    if-nez v6, :cond_9

    .line 313
    .line 314
    instance-of v6, v0, Ldefpackage/t52;

    .line 315
    .line 316
    if-nez v6, :cond_9

    .line 317
    .line 318
    instance-of v6, v0, Ldefpackage/r52;

    .line 319
    .line 320
    if-nez v6, :cond_9

    .line 321
    .line 322
    sget-object v6, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 323
    .line 324
    const-string v11, "Controller live connection interrupted"

    .line 325
    .line 326
    invoke-virtual {v6, v11, v0}, Ldefpackage/w42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 327
    .line 328
    .line 329
    sget-object v0, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 330
    .line 331
    new-instance v6, Ldefpackage/ns1;

    .line 332
    .line 333
    invoke-direct {v6, v10, v2, v3}, Ldefpackage/ns1;-><init>(IJ)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 337
    .line 338
    .line 339
    const-wide/16 v11, 0x7d0

    .line 340
    .line 341
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :catch_3
    move-exception v0

    .line 347
    move-object p0, v0

    .line 348
    goto :goto_9

    .line 349
    :cond_9
    throw v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 350
    :cond_a
    :goto_7
    sget-wide v0, Ldefpackage/u52;->i:J

    .line 351
    .line 352
    cmp-long p0, v0, v2

    .line 353
    .line 354
    if-nez p0, :cond_c

    .line 355
    .line 356
    :goto_8
    sput-object v9, Ldefpackage/u52;->m:Ljavax/net/ssl/SSLSocket;

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :goto_9
    :try_start_d
    sget-wide v0, Ldefpackage/u52;->i:J

    .line 360
    .line 361
    cmp-long v0, v0, v2

    .line 362
    .line 363
    if-nez v0, :cond_b

    .line 364
    .line 365
    sget-object v0, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 366
    .line 367
    const-string v1, "Controller connection rejected"

    .line 368
    .line 369
    invoke-virtual {v0, v1, p0}, Ldefpackage/w42;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 370
    .line 371
    .line 372
    sget-object v0, Ldefpackage/u52;->a:Landroid/os/Handler;

    .line 373
    .line 374
    new-instance v1, Ldefpackage/mm;

    .line 375
    .line 376
    const/4 v4, 0x2

    .line 377
    invoke-direct {v1, v2, v3, p0, v4}, Ldefpackage/mm;-><init>(JLjava/lang/Object;I)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 381
    .line 382
    .line 383
    :cond_b
    sget-wide v0, Ldefpackage/u52;->i:J

    .line 384
    .line 385
    cmp-long p0, v0, v2

    .line 386
    .line 387
    if-nez p0, :cond_c

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_c
    :goto_a
    return-void

    .line 391
    :goto_b
    sget-wide v0, Ldefpackage/u52;->i:J

    .line 392
    .line 393
    cmp-long v0, v0, v2

    .line 394
    .line 395
    if-nez v0, :cond_d

    .line 396
    .line 397
    sput-object v9, Ldefpackage/u52;->m:Ljavax/net/ssl/SSLSocket;

    .line 398
    .line 399
    :cond_d
    throw p0
.end method
