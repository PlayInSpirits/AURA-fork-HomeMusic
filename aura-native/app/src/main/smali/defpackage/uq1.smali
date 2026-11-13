.class public final Ldefpackage/uq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final q:Ljava/util/logging/Logger;


# instance fields
.field public final n:Ldefpackage/fw;

.field public final o:Ldefpackage/tq1;

.field public final p:Ldefpackage/yp1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ldefpackage/iq1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldefpackage/uq1;->q:Ljava/util/logging/Logger;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ldefpackage/fw;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 8
    .line 9
    new-instance v0, Ldefpackage/tq1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ldefpackage/tq1;-><init>(Ldefpackage/fw;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/uq1;->o:Ldefpackage/tq1;

    .line 15
    .line 16
    new-instance p1, Ldefpackage/yp1;

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ldefpackage/yp1;-><init>(Ldefpackage/tq1;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ldefpackage/uq1;->p:Ldefpackage/yp1;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final b(ZLdefpackage/mq1;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object v3, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 7
    .line 8
    const-wide/16 v4, 0x9

    .line 9
    .line 10
    invoke-interface {v3, v4, v5}, Ldefpackage/fw;->P(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 14
    .line 15
    invoke-static {v3}, Ldefpackage/xe5;->n(Ldefpackage/fw;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0x4000

    .line 20
    .line 21
    if-gt v3, v4, :cond_30

    .line 22
    .line 23
    iget-object v5, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 24
    .line 25
    invoke-interface {v5}, Ldefpackage/fw;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    and-int/lit16 v5, v5, 0xff

    .line 30
    .line 31
    iget-object v6, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 32
    .line 33
    invoke-interface {v6}, Ldefpackage/fw;->readByte()B

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    and-int/lit16 v7, v6, 0xff

    .line 38
    .line 39
    iget-object v8, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 40
    .line 41
    invoke-interface {v8}, Ldefpackage/fw;->readInt()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const v9, 0x7fffffff

    .line 46
    .line 47
    .line 48
    and-int/2addr v9, v8

    .line 49
    const/16 v10, 0x8

    .line 50
    .line 51
    const/4 v11, 0x1

    .line 52
    if-eq v5, v10, :cond_0

    .line 53
    .line 54
    sget-object v12, Ldefpackage/uq1;->q:Ljava/util/logging/Logger;

    .line 55
    .line 56
    sget-object v13, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 57
    .line 58
    invoke-virtual {v12, v13}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    if-eqz v13, :cond_0

    .line 63
    .line 64
    invoke-static {v11, v9, v3, v5, v7}, Ldefpackage/iq1;->b(ZIIII)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    invoke-virtual {v12, v13}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    const/4 v12, 0x4

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    if-ne v5, v12, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const-string v0, "Expected a SETTINGS frame but was "

    .line 78
    .line 79
    invoke-static {v5}, Ldefpackage/iq1;->a(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1, v0}, Ldefpackage/mj0;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return v2

    .line 87
    :cond_2
    :goto_0
    const/4 v14, 0x5

    .line 88
    const/4 v15, 0x3

    .line 89
    const/4 v13, 0x2

    .line 90
    packed-switch v5, :pswitch_data_0

    .line 91
    .line 92
    .line 93
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 94
    .line 95
    int-to-long v1, v3

    .line 96
    invoke-interface {v0, v1, v2}, Ldefpackage/fw;->skip(J)V

    .line 97
    .line 98
    .line 99
    return v11

    .line 100
    :pswitch_0
    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    .line 101
    .line 102
    if-ne v3, v12, :cond_7

    .line 103
    .line 104
    :try_start_1
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 105
    .line 106
    invoke-interface {v0}, Ldefpackage/fw;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 110
    const-wide/32 v4, 0x7fffffff

    .line 111
    .line 112
    .line 113
    int-to-long v12, v0

    .line 114
    and-long/2addr v4, v12

    .line 115
    const-wide/16 v12, 0x0

    .line 116
    .line 117
    cmp-long v0, v4, v12

    .line 118
    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    sget-object v2, Ldefpackage/uq1;->q:Ljava/util/logging/Logger;

    .line 122
    .line 123
    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 124
    .line 125
    invoke-virtual {v2, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    invoke-static {v9, v3, v4, v5, v11}, Ldefpackage/iq1;->c(IIJZ)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    iget-object v1, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 139
    .line 140
    if-nez v9, :cond_4

    .line 141
    .line 142
    monitor-enter v1

    .line 143
    :try_start_2
    iget-wide v2, v1, Ldefpackage/rq1;->H:J

    .line 144
    .line 145
    add-long/2addr v2, v4

    .line 146
    iput-wide v2, v1, Ldefpackage/rq1;->H:J

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    .line 150
    .line 151
    monitor-exit v1

    .line 152
    return v11

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    monitor-exit v1

    .line 155
    throw v0

    .line 156
    :cond_4
    invoke-virtual {v1, v9}, Ldefpackage/rq1;->j(I)Ldefpackage/yq1;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-eqz v1, :cond_2a

    .line 161
    .line 162
    monitor-enter v1

    .line 163
    :try_start_3
    iget-wide v2, v1, Ldefpackage/yq1;->e:J

    .line 164
    .line 165
    add-long/2addr v2, v4

    .line 166
    iput-wide v2, v1, Ldefpackage/yq1;->e:J

    .line 167
    .line 168
    if-lez v0, :cond_5

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 171
    .line 172
    .line 173
    :cond_5
    monitor-exit v1

    .line 174
    return v11

    .line 175
    :catchall_1
    move-exception v0

    .line 176
    monitor-exit v1

    .line 177
    throw v0

    .line 178
    :cond_6
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    .line 179
    .line 180
    const-string v1, "windowSizeIncrement was 0"

    .line 181
    .line 182
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :catch_0
    move-exception v0

    .line 187
    goto :goto_1

    .line 188
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 189
    .line 190
    new-instance v1, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 206
    :goto_1
    sget-object v1, Ldefpackage/uq1;->q:Ljava/util/logging/Logger;

    .line 207
    .line 208
    invoke-static {v11, v9, v3, v10, v7}, Ldefpackage/iq1;->b(ZIIII)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0

    .line 216
    :pswitch_1
    if-lt v3, v10, :cond_f

    .line 217
    .line 218
    if-nez v9, :cond_e

    .line 219
    .line 220
    iget-object v4, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 221
    .line 222
    invoke-interface {v4}, Ldefpackage/fw;->readInt()I

    .line 223
    .line 224
    .line 225
    move-result v4

    .line 226
    iget-object v5, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 227
    .line 228
    invoke-interface {v5}, Ldefpackage/fw;->readInt()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    sub-int/2addr v3, v10

    .line 233
    sget-object v6, Ldefpackage/b21;->o:Ldefpackage/om0;

    .line 234
    .line 235
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {}, Ldefpackage/b21;->values()[Ldefpackage/b21;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    array-length v7, v6

    .line 243
    move v8, v2

    .line 244
    :goto_2
    if-ge v8, v7, :cond_9

    .line 245
    .line 246
    aget-object v9, v6, v8

    .line 247
    .line 248
    iget v10, v9, Ldefpackage/b21;->n:I

    .line 249
    .line 250
    if-ne v10, v5, :cond_8

    .line 251
    .line 252
    move-object v13, v9

    .line 253
    goto :goto_3

    .line 254
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_9
    const/4 v13, 0x0

    .line 258
    :goto_3
    if-eqz v13, :cond_d

    .line 259
    .line 260
    sget-object v5, Ldefpackage/yw;->q:Ldefpackage/yw;

    .line 261
    .line 262
    if-lez v3, :cond_a

    .line 263
    .line 264
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 265
    .line 266
    int-to-long v5, v3

    .line 267
    invoke-interface {v0, v5, v6}, Ldefpackage/fw;->g(J)Ldefpackage/yw;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    :cond_a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5}, Ldefpackage/yw;->d()I

    .line 275
    .line 276
    .line 277
    iget-object v3, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 278
    .line 279
    monitor-enter v3

    .line 280
    :try_start_5
    iget-object v0, v3, Ldefpackage/rq1;->o:Ljava/util/LinkedHashMap;

    .line 281
    .line 282
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    new-array v5, v2, [Ldefpackage/yq1;

    .line 287
    .line 288
    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iput-boolean v11, v3, Ldefpackage/rq1;->s:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 293
    .line 294
    monitor-exit v3

    .line 295
    check-cast v0, [Ldefpackage/yq1;

    .line 296
    .line 297
    array-length v3, v0

    .line 298
    :goto_4
    if-ge v2, v3, :cond_2a

    .line 299
    .line 300
    aget-object v5, v0, v2

    .line 301
    .line 302
    iget v6, v5, Ldefpackage/yq1;->a:I

    .line 303
    .line 304
    if-le v6, v4, :cond_c

    .line 305
    .line 306
    invoke-virtual {v5}, Ldefpackage/yq1;->g()Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-eqz v6, :cond_c

    .line 311
    .line 312
    sget-object v6, Ldefpackage/b21;->t:Ldefpackage/b21;

    .line 313
    .line 314
    monitor-enter v5

    .line 315
    :try_start_6
    iget-object v7, v5, Ldefpackage/yq1;->l:Ldefpackage/b21;

    .line 316
    .line 317
    if-nez v7, :cond_b

    .line 318
    .line 319
    iput-object v6, v5, Ldefpackage/yq1;->l:Ldefpackage/b21;

    .line 320
    .line 321
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 322
    .line 323
    .line 324
    goto :goto_5

    .line 325
    :catchall_2
    move-exception v0

    .line 326
    goto :goto_6

    .line 327
    :cond_b
    :goto_5
    monitor-exit v5

    .line 328
    iget-object v6, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 329
    .line 330
    iget v5, v5, Ldefpackage/yq1;->a:I

    .line 331
    .line 332
    invoke-virtual {v6, v5}, Ldefpackage/rq1;->n(I)Ldefpackage/yq1;

    .line 333
    .line 334
    .line 335
    goto :goto_7

    .line 336
    :goto_6
    :try_start_7
    monitor-exit v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 337
    throw v0

    .line 338
    :cond_c
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :catchall_3
    move-exception v0

    .line 342
    monitor-exit v3

    .line 343
    throw v0

    .line 344
    :cond_d
    const-string v0, "TYPE_GOAWAY unexpected error code: "

    .line 345
    .line 346
    invoke-static {v5, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return v2

    .line 354
    :cond_e
    const-string v0, "TYPE_GOAWAY streamId != 0"

    .line 355
    .line 356
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return v2

    .line 360
    :cond_f
    const-string v0, "TYPE_GOAWAY length < 8: "

    .line 361
    .line 362
    invoke-static {v3, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return v2

    .line 370
    :pswitch_2
    if-ne v3, v10, :cond_16

    .line 371
    .line 372
    if-nez v9, :cond_15

    .line 373
    .line 374
    iget-object v3, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 375
    .line 376
    invoke-interface {v3}, Ldefpackage/fw;->readInt()I

    .line 377
    .line 378
    .line 379
    move-result v3

    .line 380
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 381
    .line 382
    invoke-interface {v0}, Ldefpackage/fw;->readInt()I

    .line 383
    .line 384
    .line 385
    move-result v0

    .line 386
    and-int/lit8 v4, v6, 0x1

    .line 387
    .line 388
    if-eqz v4, :cond_10

    .line 389
    .line 390
    move v2, v11

    .line 391
    :cond_10
    iget-object v4, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 392
    .line 393
    if-eqz v2, :cond_14

    .line 394
    .line 395
    monitor-enter v4

    .line 396
    const-wide/16 v0, 0x1

    .line 397
    .line 398
    if-eq v3, v11, :cond_13

    .line 399
    .line 400
    if-eq v3, v13, :cond_12

    .line 401
    .line 402
    if-eq v3, v15, :cond_11

    .line 403
    .line 404
    goto :goto_8

    .line 405
    :cond_11
    :try_start_8
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V

    .line 406
    .line 407
    .line 408
    goto :goto_8

    .line 409
    :catchall_4
    move-exception v0

    .line 410
    goto :goto_9

    .line 411
    :cond_12
    iget-wide v2, v4, Ldefpackage/rq1;->A:J

    .line 412
    .line 413
    add-long/2addr v2, v0

    .line 414
    iput-wide v2, v4, Ldefpackage/rq1;->A:J

    .line 415
    .line 416
    goto :goto_8

    .line 417
    :cond_13
    iget-wide v2, v4, Ldefpackage/rq1;->y:J

    .line 418
    .line 419
    add-long/2addr v2, v0

    .line 420
    iput-wide v2, v4, Ldefpackage/rq1;->y:J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 421
    .line 422
    :goto_8
    monitor-exit v4

    .line 423
    return v11

    .line 424
    :goto_9
    monitor-exit v4

    .line 425
    throw v0

    .line 426
    :cond_14
    iget-object v2, v4, Ldefpackage/rq1;->u:Ldefpackage/fr4;

    .line 427
    .line 428
    new-instance v4, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    iget-object v5, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 434
    .line 435
    iget-object v5, v5, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 436
    .line 437
    const-string v6, " ping"

    .line 438
    .line 439
    invoke-static {v4, v5, v6}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    new-instance v5, Ldefpackage/lq1;

    .line 444
    .line 445
    iget-object v1, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 446
    .line 447
    invoke-direct {v5, v1, v3, v0}, Ldefpackage/lq1;-><init>(Ldefpackage/rq1;II)V

    .line 448
    .line 449
    .line 450
    invoke-static {v2, v4, v5}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V

    .line 451
    .line 452
    .line 453
    return v11

    .line 454
    :cond_15
    const-string v0, "TYPE_PING streamId != 0"

    .line 455
    .line 456
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    return v2

    .line 460
    :cond_16
    const-string v0, "TYPE_PING length != 8: "

    .line 461
    .line 462
    invoke-static {v3, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 467
    .line 468
    .line 469
    return v2

    .line 470
    :pswitch_3
    invoke-virtual {v0, v1, v3, v7, v9}, Ldefpackage/uq1;->q(Ldefpackage/mq1;III)V

    .line 471
    .line 472
    .line 473
    return v11

    .line 474
    :pswitch_4
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 475
    .line 476
    if-nez v9, :cond_25

    .line 477
    .line 478
    and-int/lit8 v5, v6, 0x1

    .line 479
    .line 480
    if-eqz v5, :cond_18

    .line 481
    .line 482
    if-nez v3, :cond_17

    .line 483
    .line 484
    goto/16 :goto_10

    .line 485
    .line 486
    :cond_17
    const-string v0, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 487
    .line 488
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    return v2

    .line 492
    :cond_18
    rem-int/lit8 v5, v3, 0x6

    .line 493
    .line 494
    if-nez v5, :cond_24

    .line 495
    .line 496
    new-instance v5, Ldefpackage/pb4;

    .line 497
    .line 498
    invoke-direct {v5}, Ldefpackage/pb4;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-static {v2, v3}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    const/4 v6, 0x6

    .line 506
    invoke-static {v3, v6}, Ldefpackage/gb;->b0(Ldefpackage/j02;I)Ldefpackage/h02;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    iget v7, v3, Ldefpackage/h02;->n:I

    .line 511
    .line 512
    iget v8, v3, Ldefpackage/h02;->o:I

    .line 513
    .line 514
    iget v3, v3, Ldefpackage/h02;->p:I

    .line 515
    .line 516
    if-lez v3, :cond_19

    .line 517
    .line 518
    if-le v7, v8, :cond_1a

    .line 519
    .line 520
    :cond_19
    if-gez v3, :cond_23

    .line 521
    .line 522
    if-gt v8, v7, :cond_23

    .line 523
    .line 524
    :cond_1a
    :goto_a
    invoke-interface {v0}, Ldefpackage/fw;->readShort()S

    .line 525
    .line 526
    .line 527
    move-result v9

    .line 528
    sget-object v10, Ldefpackage/xe5;->a:[B

    .line 529
    .line 530
    const v10, 0xffff

    .line 531
    .line 532
    .line 533
    and-int/2addr v9, v10

    .line 534
    invoke-interface {v0}, Ldefpackage/fw;->readInt()I

    .line 535
    .line 536
    .line 537
    move-result v10

    .line 538
    if-eq v9, v13, :cond_20

    .line 539
    .line 540
    if-eq v9, v15, :cond_1f

    .line 541
    .line 542
    if-eq v9, v12, :cond_1d

    .line 543
    .line 544
    if-eq v9, v14, :cond_1b

    .line 545
    .line 546
    move/from16 v16, v2

    .line 547
    .line 548
    goto :goto_b

    .line 549
    :cond_1b
    move/from16 v16, v2

    .line 550
    .line 551
    if-lt v10, v4, :cond_1c

    .line 552
    .line 553
    const v2, 0xffffff

    .line 554
    .line 555
    .line 556
    if-gt v10, v2, :cond_1c

    .line 557
    .line 558
    goto :goto_b

    .line 559
    :cond_1c
    const-string v0, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    .line 560
    .line 561
    invoke-static {v10, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    return v16

    .line 569
    :cond_1d
    move/from16 v16, v2

    .line 570
    .line 571
    if-ltz v10, :cond_1e

    .line 572
    .line 573
    const/4 v9, 0x7

    .line 574
    goto :goto_b

    .line 575
    :cond_1e
    const-string v0, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 576
    .line 577
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    return v16

    .line 581
    :cond_1f
    move/from16 v16, v2

    .line 582
    .line 583
    move v9, v12

    .line 584
    goto :goto_b

    .line 585
    :cond_20
    move/from16 v16, v2

    .line 586
    .line 587
    if-eqz v10, :cond_22

    .line 588
    .line 589
    if-ne v10, v11, :cond_21

    .line 590
    .line 591
    goto :goto_b

    .line 592
    :cond_21
    const-string v0, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 593
    .line 594
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    return v16

    .line 598
    :cond_22
    :goto_b
    invoke-virtual {v5, v9, v10}, Ldefpackage/pb4;->b(II)V

    .line 599
    .line 600
    .line 601
    if-eq v7, v8, :cond_23

    .line 602
    .line 603
    add-int/2addr v7, v3

    .line 604
    move/from16 v2, v16

    .line 605
    .line 606
    goto :goto_a

    .line 607
    :cond_23
    iget-object v0, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 608
    .line 609
    iget-object v2, v0, Ldefpackage/rq1;->u:Ldefpackage/fr4;

    .line 610
    .line 611
    new-instance v3, Ljava/lang/StringBuilder;

    .line 612
    .line 613
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 614
    .line 615
    .line 616
    iget-object v0, v0, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 617
    .line 618
    const-string v4, " applyAndAckSettings"

    .line 619
    .line 620
    invoke-static {v3, v0, v4}, Ldefpackage/b11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    new-instance v3, Ldefpackage/gp;

    .line 625
    .line 626
    invoke-direct {v3, v6, v1, v5}, Ldefpackage/gp;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    invoke-static {v2, v0, v3}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V

    .line 630
    .line 631
    .line 632
    return v11

    .line 633
    :cond_24
    move/from16 v16, v2

    .line 634
    .line 635
    const-string v0, "TYPE_SETTINGS length % 6 != 0: "

    .line 636
    .line 637
    invoke-static {v3, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    return v16

    .line 645
    :cond_25
    move/from16 v16, v2

    .line 646
    .line 647
    const-string v0, "TYPE_SETTINGS streamId != 0"

    .line 648
    .line 649
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    return v16

    .line 653
    :pswitch_5
    move/from16 v16, v2

    .line 654
    .line 655
    if-ne v3, v12, :cond_2d

    .line 656
    .line 657
    if-eqz v9, :cond_2c

    .line 658
    .line 659
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 660
    .line 661
    invoke-interface {v0}, Ldefpackage/fw;->readInt()I

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    sget-object v2, Ldefpackage/b21;->o:Ldefpackage/om0;

    .line 666
    .line 667
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    invoke-static {}, Ldefpackage/b21;->values()[Ldefpackage/b21;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    array-length v3, v2

    .line 675
    move/from16 v4, v16

    .line 676
    .line 677
    :goto_c
    if-ge v4, v3, :cond_27

    .line 678
    .line 679
    aget-object v5, v2, v4

    .line 680
    .line 681
    iget v6, v5, Ldefpackage/b21;->n:I

    .line 682
    .line 683
    if-ne v6, v0, :cond_26

    .line 684
    .line 685
    goto :goto_d

    .line 686
    :cond_26
    add-int/lit8 v4, v4, 0x1

    .line 687
    .line 688
    goto :goto_c

    .line 689
    :cond_27
    const/4 v5, 0x0

    .line 690
    :goto_d
    if-eqz v5, :cond_2b

    .line 691
    .line 692
    iget-object v0, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 693
    .line 694
    if-eqz v9, :cond_28

    .line 695
    .line 696
    and-int/lit8 v1, v8, 0x1

    .line 697
    .line 698
    if-nez v1, :cond_28

    .line 699
    .line 700
    iget-object v1, v0, Ldefpackage/rq1;->v:Ldefpackage/fr4;

    .line 701
    .line 702
    new-instance v2, Ljava/lang/StringBuilder;

    .line 703
    .line 704
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 705
    .line 706
    .line 707
    iget-object v3, v0, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 708
    .line 709
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 710
    .line 711
    .line 712
    const/16 v3, 0x5b

    .line 713
    .line 714
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 718
    .line 719
    .line 720
    const-string v3, "] onReset"

    .line 721
    .line 722
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    new-instance v3, Ldefpackage/oq1;

    .line 730
    .line 731
    invoke-direct {v3, v0, v9, v5, v13}, Ldefpackage/oq1;-><init>(Ldefpackage/rq1;ILjava/lang/Object;I)V

    .line 732
    .line 733
    .line 734
    invoke-static {v1, v2, v3}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V

    .line 735
    .line 736
    .line 737
    return v11

    .line 738
    :cond_28
    invoke-virtual {v0, v9}, Ldefpackage/rq1;->n(I)Ldefpackage/yq1;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    if-eqz v1, :cond_2a

    .line 743
    .line 744
    monitor-enter v1

    .line 745
    :try_start_9
    iget-object v0, v1, Ldefpackage/yq1;->l:Ldefpackage/b21;

    .line 746
    .line 747
    if-nez v0, :cond_29

    .line 748
    .line 749
    iput-object v5, v1, Ldefpackage/yq1;->l:Ldefpackage/b21;

    .line 750
    .line 751
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 752
    .line 753
    .line 754
    goto :goto_e

    .line 755
    :catchall_5
    move-exception v0

    .line 756
    goto :goto_f

    .line 757
    :cond_29
    :goto_e
    monitor-exit v1

    .line 758
    return v11

    .line 759
    :goto_f
    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 760
    throw v0

    .line 761
    :cond_2a
    :goto_10
    return v11

    .line 762
    :cond_2b
    const-string v1, "TYPE_RST_STREAM unexpected error code: "

    .line 763
    .line 764
    invoke-static {v0, v1}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    return v16

    .line 772
    :cond_2c
    const-string v0, "TYPE_RST_STREAM streamId == 0"

    .line 773
    .line 774
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 775
    .line 776
    .line 777
    return v16

    .line 778
    :cond_2d
    const-string v0, "TYPE_RST_STREAM length: "

    .line 779
    .line 780
    const-string v1, " != 4"

    .line 781
    .line 782
    invoke-static {v3, v0, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    return v16

    .line 790
    :pswitch_6
    move/from16 v16, v2

    .line 791
    .line 792
    if-ne v3, v14, :cond_2f

    .line 793
    .line 794
    if-eqz v9, :cond_2e

    .line 795
    .line 796
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 797
    .line 798
    invoke-interface {v0}, Ldefpackage/fw;->readInt()I

    .line 799
    .line 800
    .line 801
    invoke-interface {v0}, Ldefpackage/fw;->readByte()B

    .line 802
    .line 803
    .line 804
    return v11

    .line 805
    :cond_2e
    const-string v0, "TYPE_PRIORITY streamId == 0"

    .line 806
    .line 807
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    return v16

    .line 811
    :cond_2f
    const-string v0, "TYPE_PRIORITY length: "

    .line 812
    .line 813
    const-string v1, " != 5"

    .line 814
    .line 815
    invoke-static {v3, v0, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    return v16

    .line 823
    :pswitch_7
    invoke-virtual {v0, v1, v3, v7, v9}, Ldefpackage/uq1;->n(Ldefpackage/mq1;III)V

    .line 824
    .line 825
    .line 826
    return v11

    .line 827
    :pswitch_8
    invoke-virtual {v0, v1, v3, v7, v9}, Ldefpackage/uq1;->f(Ldefpackage/mq1;III)V

    .line 828
    .line 829
    .line 830
    return v11

    .line 831
    :cond_30
    move/from16 v16, v2

    .line 832
    .line 833
    const-string v0, "FRAME_SIZE_ERROR: "

    .line 834
    .line 835
    invoke-static {v3, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    return v16

    .line 843
    :catch_1
    move/from16 v16, v2

    .line 844
    .line 845
    return v16

    .line 846
    nop

    .line 847
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

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Ldefpackage/mq1;III)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    if-eqz v3, :cond_f

    .line 10
    .line 11
    and-int/lit8 v4, v2, 0x1

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move v4, v6

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v6

    .line 19
    const/4 v6, 0x0

    .line 20
    :goto_0
    and-int/lit8 v7, v2, 0x20

    .line 21
    .line 22
    if-nez v7, :cond_e

    .line 23
    .line 24
    and-int/lit8 v7, v2, 0x8

    .line 25
    .line 26
    if-eqz v7, :cond_1

    .line 27
    .line 28
    iget-object v7, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 29
    .line 30
    invoke-interface {v7}, Ldefpackage/fw;->readByte()B

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sget-object v8, Ldefpackage/xe5;->a:[B

    .line 35
    .line 36
    and-int/lit16 v7, v7, 0xff

    .line 37
    .line 38
    :goto_1
    move/from16 v8, p2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v7, 0x0

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-static {v8, v2, v7}, Ldefpackage/te5;->E(III)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v8, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v9, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    and-int/lit8 v10, v3, 0x1

    .line 57
    .line 58
    if-nez v10, :cond_2

    .line 59
    .line 60
    move v10, v4

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    const/4 v10, 0x0

    .line 63
    :goto_3
    if-eqz v10, :cond_3

    .line 64
    .line 65
    new-instance v4, Ldefpackage/tv;

    .line 66
    .line 67
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    int-to-long v10, v2

    .line 71
    invoke-interface {v8, v10, v11}, Ldefpackage/fw;->P(J)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v8, v4, v10, v11}, Ldefpackage/ej4;->read(Ldefpackage/tv;J)J

    .line 75
    .line 76
    .line 77
    iget-object v8, v9, Ldefpackage/rq1;->v:Ldefpackage/fr4;

    .line 78
    .line 79
    new-instance v1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object v5, v9, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 v5, 0x5b

    .line 90
    .line 91
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v5, "] onData"

    .line 98
    .line 99
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v10

    .line 106
    new-instance v1, Ldefpackage/nq1;

    .line 107
    .line 108
    move v5, v2

    .line 109
    move-object v2, v9

    .line 110
    invoke-direct/range {v1 .. v6}, Ldefpackage/nq1;-><init>(Ldefpackage/rq1;ILdefpackage/tv;IZ)V

    .line 111
    .line 112
    .line 113
    invoke-static {v8, v10, v1}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_a

    .line 117
    .line 118
    :cond_3
    invoke-virtual {v9, v3}, Ldefpackage/rq1;->j(I)Ldefpackage/yq1;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    if-nez v9, :cond_4

    .line 123
    .line 124
    iget-object v4, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 125
    .line 126
    sget-object v5, Ldefpackage/b21;->q:Ldefpackage/b21;

    .line 127
    .line 128
    invoke-virtual {v4, v3, v5}, Ldefpackage/rq1;->v(ILdefpackage/b21;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, v1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 132
    .line 133
    int-to-long v2, v2

    .line 134
    invoke-virtual {v1, v2, v3}, Ldefpackage/rq1;->s(J)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v8, v2, v3}, Ldefpackage/fw;->skip(J)V

    .line 138
    .line 139
    .line 140
    goto/16 :goto_a

    .line 141
    .line 142
    :cond_4
    sget-object v1, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 143
    .line 144
    iget-object v1, v9, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 145
    .line 146
    int-to-long v2, v2

    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-wide v10, v2

    .line 151
    :goto_4
    const-wide/16 v12, 0x0

    .line 152
    .line 153
    cmp-long v14, v10, v12

    .line 154
    .line 155
    iget-object v15, v1, Ldefpackage/wq1;->t:Ldefpackage/yq1;

    .line 156
    .line 157
    if-lez v14, :cond_c

    .line 158
    .line 159
    monitor-enter v15

    .line 160
    :try_start_0
    iget-boolean v14, v1, Ldefpackage/wq1;->o:Z

    .line 161
    .line 162
    iget-object v5, v1, Ldefpackage/wq1;->q:Ldefpackage/tv;

    .line 163
    .line 164
    move-wide/from16 p1, v12

    .line 165
    .line 166
    iget-wide v12, v5, Ldefpackage/tv;->o:J

    .line 167
    .line 168
    add-long/2addr v12, v10

    .line 169
    iget-wide v4, v1, Ldefpackage/wq1;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 170
    .line 171
    cmp-long v4, v12, v4

    .line 172
    .line 173
    if-lez v4, :cond_5

    .line 174
    .line 175
    const/4 v4, 0x1

    .line 176
    goto :goto_5

    .line 177
    :cond_5
    const/4 v4, 0x0

    .line 178
    :goto_5
    monitor-exit v15

    .line 179
    if-eqz v4, :cond_6

    .line 180
    .line 181
    invoke-interface {v8, v10, v11}, Ldefpackage/fw;->skip(J)V

    .line 182
    .line 183
    .line 184
    iget-object v1, v1, Ldefpackage/wq1;->t:Ldefpackage/yq1;

    .line 185
    .line 186
    sget-object v2, Ldefpackage/b21;->s:Ldefpackage/b21;

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Ldefpackage/yq1;->e(Ldefpackage/b21;)V

    .line 189
    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_6
    if-eqz v14, :cond_7

    .line 193
    .line 194
    invoke-interface {v8, v10, v11}, Ldefpackage/fw;->skip(J)V

    .line 195
    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_7
    iget-object v4, v1, Ldefpackage/wq1;->p:Ldefpackage/tv;

    .line 199
    .line 200
    invoke-interface {v8, v4, v10, v11}, Ldefpackage/ej4;->read(Ldefpackage/tv;J)J

    .line 201
    .line 202
    .line 203
    move-result-wide v4

    .line 204
    const-wide/16 v12, -0x1

    .line 205
    .line 206
    cmp-long v12, v4, v12

    .line 207
    .line 208
    if-eqz v12, :cond_b

    .line 209
    .line 210
    sub-long/2addr v10, v4

    .line 211
    iget-object v4, v1, Ldefpackage/wq1;->t:Ldefpackage/yq1;

    .line 212
    .line 213
    monitor-enter v4

    .line 214
    :try_start_1
    iget-boolean v5, v1, Ldefpackage/wq1;->s:Z

    .line 215
    .line 216
    if-eqz v5, :cond_8

    .line 217
    .line 218
    iget-object v5, v1, Ldefpackage/wq1;->p:Ldefpackage/tv;

    .line 219
    .line 220
    invoke-virtual {v5}, Ldefpackage/tv;->b()V

    .line 221
    .line 222
    .line 223
    goto :goto_7

    .line 224
    :catchall_0
    move-exception v0

    .line 225
    goto :goto_8

    .line 226
    :cond_8
    iget-object v5, v1, Ldefpackage/wq1;->q:Ldefpackage/tv;

    .line 227
    .line 228
    iget-wide v12, v5, Ldefpackage/tv;->o:J

    .line 229
    .line 230
    cmp-long v12, v12, p1

    .line 231
    .line 232
    if-nez v12, :cond_9

    .line 233
    .line 234
    const/4 v12, 0x1

    .line 235
    goto :goto_6

    .line 236
    :cond_9
    const/4 v12, 0x0

    .line 237
    :goto_6
    iget-object v13, v1, Ldefpackage/wq1;->p:Ldefpackage/tv;

    .line 238
    .line 239
    invoke-virtual {v5, v13}, Ldefpackage/tv;->p(Ldefpackage/ej4;)J

    .line 240
    .line 241
    .line 242
    if-eqz v12, :cond_a

    .line 243
    .line 244
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 245
    .line 246
    .line 247
    :cond_a
    :goto_7
    monitor-exit v4

    .line 248
    const/4 v4, 0x1

    .line 249
    goto :goto_4

    .line 250
    :goto_8
    monitor-exit v4

    .line 251
    throw v0

    .line 252
    :cond_b
    new-instance v0, Ljava/io/EOFException;

    .line 253
    .line 254
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 255
    .line 256
    .line 257
    throw v0

    .line 258
    :catchall_1
    move-exception v0

    .line 259
    monitor-exit v15

    .line 260
    throw v0

    .line 261
    :cond_c
    sget-object v4, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 262
    .line 263
    iget-object v4, v15, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 264
    .line 265
    invoke-virtual {v4, v2, v3}, Ldefpackage/rq1;->s(J)V

    .line 266
    .line 267
    .line 268
    iget-object v1, v1, Ldefpackage/wq1;->t:Ldefpackage/yq1;

    .line 269
    .line 270
    iget-object v1, v1, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 271
    .line 272
    iget-object v1, v1, Ldefpackage/rq1;->C:Ldefpackage/r81;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    :goto_9
    if-eqz v6, :cond_d

    .line 278
    .line 279
    sget-object v1, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 280
    .line 281
    const/4 v4, 0x1

    .line 282
    invoke-virtual {v9, v1, v4}, Ldefpackage/yq1;->i(Ldefpackage/tl1;Z)V

    .line 283
    .line 284
    .line 285
    :cond_d
    :goto_a
    iget-object v0, v0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 286
    .line 287
    int-to-long v1, v7

    .line 288
    invoke-interface {v0, v1, v2}, Ldefpackage/fw;->skip(J)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_e
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 293
    .line 294
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_f
    const-string v0, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 299
    .line 300
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    return-void
.end method

.method public final j(IIII)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/uq1;->o:Ldefpackage/tq1;

    .line 2
    .line 3
    iput p1, v0, Ldefpackage/tq1;->r:I

    .line 4
    .line 5
    iput p1, v0, Ldefpackage/tq1;->o:I

    .line 6
    .line 7
    iput p2, v0, Ldefpackage/tq1;->s:I

    .line 8
    .line 9
    iput p3, v0, Ldefpackage/tq1;->p:I

    .line 10
    .line 11
    iput p4, v0, Ldefpackage/tq1;->q:I

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/uq1;->p:Ldefpackage/yp1;

    .line 14
    .line 15
    iget-object p1, p0, Ldefpackage/yp1;->c:Ldefpackage/xu3;

    .line 16
    .line 17
    iget-object p2, p0, Ldefpackage/yp1;->b:Ljava/util/ArrayList;

    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ldefpackage/xu3;->l()Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-nez p3, :cond_c

    .line 24
    .line 25
    invoke-virtual {p1}, Ldefpackage/xu3;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    sget-object p4, Ldefpackage/xe5;->a:[B

    .line 30
    .line 31
    and-int/lit16 p4, p3, 0xff

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/16 v1, 0x80

    .line 35
    .line 36
    if-eq p4, v1, :cond_b

    .line 37
    .line 38
    and-int/lit16 v2, p3, 0x80

    .line 39
    .line 40
    if-ne v2, v1, :cond_3

    .line 41
    .line 42
    const/16 p3, 0x7f

    .line 43
    .line 44
    invoke-virtual {p0, p4, p3}, Ldefpackage/yp1;->e(II)I

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    add-int/lit8 p4, p3, -0x1

    .line 49
    .line 50
    if-ltz p4, :cond_1

    .line 51
    .line 52
    sget-object v1, Ldefpackage/aq1;->a:[Ldefpackage/pl1;

    .line 53
    .line 54
    array-length v2, v1

    .line 55
    add-int/lit8 v2, v2, -0x1

    .line 56
    .line 57
    if-gt p4, v2, :cond_1

    .line 58
    .line 59
    aget-object p3, v1, p4

    .line 60
    .line 61
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    sget-object v1, Ldefpackage/aq1;->a:[Ldefpackage/pl1;

    .line 66
    .line 67
    array-length v1, v1

    .line 68
    sub-int/2addr p4, v1

    .line 69
    iget v1, p0, Ldefpackage/yp1;->e:I

    .line 70
    .line 71
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    add-int/2addr v1, p4

    .line 74
    if-ltz v1, :cond_2

    .line 75
    .line 76
    iget-object p4, p0, Ldefpackage/yp1;->d:[Ldefpackage/pl1;

    .line 77
    .line 78
    array-length v2, p4

    .line 79
    if-ge v1, v2, :cond_2

    .line 80
    .line 81
    aget-object p3, p4, v1

    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    const-string p0, "Header index too large "

    .line 91
    .line 92
    invoke-static {p3, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_3
    const/16 v1, 0x40

    .line 101
    .line 102
    if-ne p4, v1, :cond_4

    .line 103
    .line 104
    sget-object p3, Ldefpackage/aq1;->a:[Ldefpackage/pl1;

    .line 105
    .line 106
    invoke-virtual {p0}, Ldefpackage/yp1;->d()Ldefpackage/yw;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    invoke-static {p3}, Ldefpackage/aq1;->a(Ldefpackage/yw;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ldefpackage/yp1;->d()Ldefpackage/yw;

    .line 114
    .line 115
    .line 116
    move-result-object p4

    .line 117
    new-instance v0, Ldefpackage/pl1;

    .line 118
    .line 119
    invoke-direct {v0, p3, p4}, Ldefpackage/pl1;-><init>(Ldefpackage/yw;Ldefpackage/yw;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v0}, Ldefpackage/yp1;->c(Ldefpackage/pl1;)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_4
    and-int/lit8 v2, p3, 0x40

    .line 127
    .line 128
    if-ne v2, v1, :cond_5

    .line 129
    .line 130
    const/16 p3, 0x3f

    .line 131
    .line 132
    invoke-virtual {p0, p4, p3}, Ldefpackage/yp1;->e(II)I

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    add-int/lit8 p3, p3, -0x1

    .line 137
    .line 138
    invoke-virtual {p0, p3}, Ldefpackage/yp1;->b(I)Ldefpackage/yw;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    invoke-virtual {p0}, Ldefpackage/yp1;->d()Ldefpackage/yw;

    .line 143
    .line 144
    .line 145
    move-result-object p4

    .line 146
    new-instance v0, Ldefpackage/pl1;

    .line 147
    .line 148
    invoke-direct {v0, p3, p4}, Ldefpackage/pl1;-><init>(Ldefpackage/yw;Ldefpackage/yw;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v0}, Ldefpackage/yp1;->c(Ldefpackage/pl1;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_5
    and-int/lit8 p3, p3, 0x20

    .line 157
    .line 158
    const/16 v1, 0x20

    .line 159
    .line 160
    if-ne p3, v1, :cond_8

    .line 161
    .line 162
    const/16 p3, 0x1f

    .line 163
    .line 164
    invoke-virtual {p0, p4, p3}, Ldefpackage/yp1;->e(II)I

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    iput p3, p0, Ldefpackage/yp1;->a:I

    .line 169
    .line 170
    if-ltz p3, :cond_7

    .line 171
    .line 172
    const/16 p4, 0x1000

    .line 173
    .line 174
    if-gt p3, p4, :cond_7

    .line 175
    .line 176
    iget p4, p0, Ldefpackage/yp1;->g:I

    .line 177
    .line 178
    if-ge p3, p4, :cond_0

    .line 179
    .line 180
    if-nez p3, :cond_6

    .line 181
    .line 182
    iget-object p3, p0, Ldefpackage/yp1;->d:[Ldefpackage/pl1;

    .line 183
    .line 184
    invoke-static {p3, v0}, Ldefpackage/ti;->h0([Ljava/lang/Object;Ldefpackage/f01;)V

    .line 185
    .line 186
    .line 187
    iget-object p3, p0, Ldefpackage/yp1;->d:[Ldefpackage/pl1;

    .line 188
    .line 189
    array-length p3, p3

    .line 190
    add-int/lit8 p3, p3, -0x1

    .line 191
    .line 192
    iput p3, p0, Ldefpackage/yp1;->e:I

    .line 193
    .line 194
    const/4 p3, 0x0

    .line 195
    iput p3, p0, Ldefpackage/yp1;->f:I

    .line 196
    .line 197
    iput p3, p0, Ldefpackage/yp1;->g:I

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_6
    sub-int/2addr p4, p3

    .line 202
    invoke-virtual {p0, p4}, Ldefpackage/yp1;->a(I)I

    .line 203
    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 208
    .line 209
    iget p0, p0, Ldefpackage/yp1;->a:I

    .line 210
    .line 211
    new-instance p2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    const-string p3, "Invalid dynamic table size update "

    .line 214
    .line 215
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p1

    .line 229
    :cond_8
    const/16 p3, 0x10

    .line 230
    .line 231
    if-eq p4, p3, :cond_a

    .line 232
    .line 233
    if-nez p4, :cond_9

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_9
    const/16 p3, 0xf

    .line 237
    .line 238
    invoke-virtual {p0, p4, p3}, Ldefpackage/yp1;->e(II)I

    .line 239
    .line 240
    .line 241
    move-result p3

    .line 242
    add-int/lit8 p3, p3, -0x1

    .line 243
    .line 244
    invoke-virtual {p0, p3}, Ldefpackage/yp1;->b(I)Ldefpackage/yw;

    .line 245
    .line 246
    .line 247
    move-result-object p3

    .line 248
    invoke-virtual {p0}, Ldefpackage/yp1;->d()Ldefpackage/yw;

    .line 249
    .line 250
    .line 251
    move-result-object p4

    .line 252
    new-instance v0, Ldefpackage/pl1;

    .line 253
    .line 254
    invoke-direct {v0, p3, p4}, Ldefpackage/pl1;-><init>(Ldefpackage/yw;Ldefpackage/yw;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_a
    :goto_1
    sget-object p3, Ldefpackage/aq1;->a:[Ldefpackage/pl1;

    .line 263
    .line 264
    invoke-virtual {p0}, Ldefpackage/yp1;->d()Ldefpackage/yw;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    invoke-static {p3}, Ldefpackage/aq1;->a(Ldefpackage/yw;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Ldefpackage/yp1;->d()Ldefpackage/yw;

    .line 272
    .line 273
    .line 274
    move-result-object p4

    .line 275
    new-instance v0, Ldefpackage/pl1;

    .line 276
    .line 277
    invoke-direct {v0, p3, p4}, Ldefpackage/pl1;-><init>(Ldefpackage/yw;Ldefpackage/yw;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_b
    const-string p0, "index == 0"

    .line 286
    .line 287
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    return-object v0

    .line 291
    :cond_c
    invoke-static {p2}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 296
    .line 297
    .line 298
    return-object p0
.end method

.method public final n(Ldefpackage/mq1;III)V
    .locals 9

    .line 1
    if-eqz p4, :cond_9

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v7, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v7, v1

    .line 12
    :goto_0
    and-int/lit8 v0, p3, 0x8

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 17
    .line 18
    invoke-interface {v0}, Ldefpackage/fw;->readByte()B

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v3, Ldefpackage/xe5;->a:[B

    .line 23
    .line 24
    and-int/lit16 v0, v0, 0xff

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, v1

    .line 28
    :goto_1
    and-int/lit8 v3, p3, 0x20

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v3, p0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 33
    .line 34
    invoke-interface {v3}, Ldefpackage/fw;->readInt()I

    .line 35
    .line 36
    .line 37
    invoke-interface {v3}, Ldefpackage/fw;->readByte()B

    .line 38
    .line 39
    .line 40
    sget-object v3, Ldefpackage/xe5;->a:[B

    .line 41
    .line 42
    add-int/lit8 p2, p2, -0x5

    .line 43
    .line 44
    :cond_2
    invoke-static {p2, p3, v0}, Ldefpackage/te5;->E(III)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p0, p2, v0, p3, p4}, Ldefpackage/uq1;->j(IIII)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object v5, p1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 53
    .line 54
    if-eqz p4, :cond_3

    .line 55
    .line 56
    and-int/lit8 p1, p4, 0x1

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    move v1, v2

    .line 61
    :cond_3
    const/16 p1, 0x5b

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iget-object p2, v5, Ldefpackage/rq1;->v:Ldefpackage/fr4;

    .line 66
    .line 67
    new-instance p3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v0, v5, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p1, "] onHeaders"

    .line 84
    .line 85
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p3, Ldefpackage/oq1;

    .line 93
    .line 94
    invoke-direct {p3, v5, p4, p0, v7}, Ldefpackage/oq1;-><init>(Ldefpackage/rq1;ILjava/util/List;Z)V

    .line 95
    .line 96
    .line 97
    invoke-static {p2, p1, p3}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    monitor-enter v5

    .line 102
    :try_start_0
    invoke-virtual {v5, p4}, Ldefpackage/rq1;->j(I)Ldefpackage/yq1;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-nez p2, :cond_8

    .line 107
    .line 108
    iget-boolean p2, v5, Ldefpackage/rq1;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    if-eqz p2, :cond_5

    .line 111
    .line 112
    monitor-exit v5

    .line 113
    return-void

    .line 114
    :cond_5
    :try_start_1
    iget p2, v5, Ldefpackage/rq1;->q:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    if-gt p4, p2, :cond_6

    .line 117
    .line 118
    monitor-exit v5

    .line 119
    return-void

    .line 120
    :cond_6
    :try_start_2
    rem-int/lit8 p2, p4, 0x2

    .line 121
    .line 122
    iget p3, v5, Ldefpackage/rq1;->r:I

    .line 123
    .line 124
    rem-int/lit8 p3, p3, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    .line 126
    if-ne p2, p3, :cond_7

    .line 127
    .line 128
    monitor-exit v5

    .line 129
    return-void

    .line 130
    :cond_7
    :try_start_3
    invoke-static {p0}, Ldefpackage/ze5;->i(Ljava/util/List;)Ldefpackage/tl1;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    new-instance v3, Ldefpackage/yq1;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    move v4, p4

    .line 138
    invoke-direct/range {v3 .. v8}, Ldefpackage/yq1;-><init>(ILdefpackage/rq1;ZZLdefpackage/tl1;)V

    .line 139
    .line 140
    .line 141
    iput v4, v5, Ldefpackage/rq1;->q:I

    .line 142
    .line 143
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    iget-object p2, v5, Ldefpackage/rq1;->o:Ljava/util/LinkedHashMap;

    .line 148
    .line 149
    invoke-interface {p2, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    iget-object p0, v5, Ldefpackage/rq1;->t:Ldefpackage/gr4;

    .line 153
    .line 154
    invoke-virtual {p0}, Ldefpackage/gr4;->e()Ldefpackage/fr4;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance p2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-object p3, v5, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p1, "] onStream"

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    new-instance p2, Ldefpackage/gp;

    .line 184
    .line 185
    const/4 p3, 0x5

    .line 186
    invoke-direct {p2, p3, v5, v3}, Ldefpackage/gp;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p0, p1, p2}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    .line 191
    .line 192
    monitor-exit v5

    .line 193
    return-void

    .line 194
    :catchall_0
    move-exception v0

    .line 195
    move-object p0, v0

    .line 196
    goto :goto_2

    .line 197
    :cond_8
    monitor-exit v5

    .line 198
    invoke-static {p0}, Ldefpackage/ze5;->i(Ljava/util/List;)Ldefpackage/tl1;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p2, p0, v7}, Ldefpackage/yq1;->i(Ldefpackage/tl1;Z)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :goto_2
    monitor-exit v5

    .line 207
    throw p0

    .line 208
    :cond_9
    const-string p0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 209
    .line 210
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public final q(Ldefpackage/mq1;III)V
    .locals 3

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 8
    .line 9
    invoke-interface {v0}, Ldefpackage/fw;->readByte()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Ldefpackage/xe5;->a:[B

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object v1, p0, Ldefpackage/uq1;->n:Ldefpackage/fw;

    .line 20
    .line 21
    invoke-interface {v1}, Ldefpackage/fw;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const v2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    and-int/2addr v1, v2

    .line 29
    add-int/lit8 p2, p2, -0x4

    .line 30
    .line 31
    invoke-static {p2, p3, v0}, Ldefpackage/te5;->E(III)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0, p2, v0, p3, p4}, Ldefpackage/uq1;->j(IIII)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, p1, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 40
    .line 41
    monitor-enter p1

    .line 42
    :try_start_0
    iget-object p2, p1, Ldefpackage/rq1;->L:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    sget-object p0, Ldefpackage/b21;->q:Ldefpackage/b21;

    .line 55
    .line 56
    invoke-virtual {p1, v1, p0}, Ldefpackage/rq1;->v(ILdefpackage/b21;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    monitor-exit p1

    .line 60
    return-void

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :try_start_1
    iget-object p2, p1, Ldefpackage/rq1;->L:Ljava/util/LinkedHashSet;

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    .line 71
    .line 72
    monitor-exit p1

    .line 73
    iget-object p2, p1, Ldefpackage/rq1;->v:Ldefpackage/fr4;

    .line 74
    .line 75
    new-instance p3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    iget-object p4, p1, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const/16 p4, 0x5b

    .line 86
    .line 87
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p4, "] onRequest"

    .line 94
    .line 95
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    new-instance p4, Ldefpackage/oq1;

    .line 103
    .line 104
    const/4 v0, 0x1

    .line 105
    invoke-direct {p4, p1, v1, p0, v0}, Ldefpackage/oq1;-><init>(Ldefpackage/rq1;ILjava/lang/Object;I)V

    .line 106
    .line 107
    .line 108
    invoke-static {p2, p3, p4}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :goto_1
    monitor-exit p1

    .line 113
    throw p0

    .line 114
    :cond_2
    const-string p0, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 115
    .line 116
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method
