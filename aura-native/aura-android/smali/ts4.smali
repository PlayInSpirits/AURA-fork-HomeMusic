.class public final Lts4;
.super Lkq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final F:Li80;

.field public final G:Lcj0;

.field public H:Lkg0;

.field public final I:Lsn4;

.field public J:Z

.field public K:I

.field public L:Lrn4;

.field public M:Lvn4;

.field public N:Lwn4;

.field public O:Lwn4;

.field public P:I

.field public final Q:Landroid/os/Handler;

.field public final R:Lrs4;

.field public final S:Lgp3;

.field public T:Z

.field public U:Z

.field public V:Ltb1;

.field public W:J

.field public X:J


# direct methods
.method public constructor <init>(Lrs4;Landroid/os/Looper;)V
    .locals 2

    .line 1
    sget-object v0, Lsn4;->l:Lom1;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {p0, v1}, Lkq;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lts4;->R:Lrs4;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 14
    .line 15
    new-instance p1, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p1, p0, Lts4;->Q:Landroid/os/Handler;

    .line 21
    .line 22
    iput-object v0, p0, Lts4;->I:Lsn4;

    .line 23
    .line 24
    new-instance p1, Li80;

    .line 25
    .line 26
    const/16 p2, 0x13

    .line 27
    .line 28
    invoke-direct {p1, p2}, Li80;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lts4;->F:Li80;

    .line 32
    .line 33
    new-instance p1, Lcj0;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {p1, p2, v0}, Lcj0;-><init>(II)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lts4;->G:Lcj0;

    .line 41
    .line 42
    new-instance p1, Lgp3;

    .line 43
    .line 44
    const/16 p2, 0x9

    .line 45
    .line 46
    invoke-direct {p1, p2, v0}, Lgp3;-><init>(IZ)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lts4;->S:Lgp3;

    .line 50
    .line 51
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    iput-wide p1, p0, Lts4;->X:J

    .line 57
    .line 58
    iput-wide p1, p0, Lts4;->W:J

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final A(JJ)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-boolean v0, v1, Lkq;->A:Z

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-wide v5, v1, Lts4;->X:J

    .line 11
    .line 12
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v0, v5, v7

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    cmp-long v0, v2, v5

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Lts4;->L()V

    .line 26
    .line 27
    .line 28
    iput-boolean v4, v1, Lts4;->U:Z

    .line 29
    .line 30
    :cond_0
    iget-boolean v0, v1, Lts4;->U:Z

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_11

    .line 35
    .line 36
    :cond_1
    iget-object v0, v1, Lts4;->V:Ltb1;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Ltb1;->n:Ljava/lang/String;

    .line 42
    .line 43
    const-string v5, "application/x-media3-cues"

    .line 44
    .line 45
    invoke-static {v0, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v5, v1, Lts4;->R:Lrs4;

    .line 50
    .line 51
    iget-object v6, v1, Lts4;->Q:Landroid/os/Handler;

    .line 52
    .line 53
    const/4 v7, 0x4

    .line 54
    const/4 v8, -0x4

    .line 55
    iget-object v9, v1, Lts4;->S:Lgp3;

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    if-eqz v0, :cond_a

    .line 59
    .line 60
    iget-object v0, v1, Lts4;->H:Lkg0;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-boolean v0, v1, Lts4;->T:Z

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_2
    iget-object v0, v1, Lts4;->G:Lcj0;

    .line 72
    .line 73
    invoke-virtual {v1, v9, v0, v10}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eq v9, v8, :cond_3

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :cond_3
    invoke-virtual {v0, v7}, Luv;->d(I)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_4

    .line 86
    .line 87
    iput-boolean v4, v1, Lts4;->T:Z

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-virtual {v0}, Lcj0;->u()V

    .line 91
    .line 92
    .line 93
    iget-object v7, v0, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-wide v12, v0, Lcj0;->t:J

    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    invoke-virtual {v7}, Ljava/nio/Buffer;->limit()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    iget-object v11, v1, Lts4;->F:Li80;

    .line 113
    .line 114
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-virtual {v11, v8, v9, v7}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v11, v10}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 125
    .line 126
    .line 127
    const-class v7, Landroid/os/Bundle;

    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    invoke-virtual {v11, v7}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-virtual {v11}, Landroid/os/Parcel;->recycle()V

    .line 138
    .line 139
    .line 140
    const-string v8, "c"

    .line 141
    .line 142
    invoke-virtual {v7, v8}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v11, Llg0;

    .line 150
    .line 151
    invoke-static {}, Lyw1;->j()Luw1;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 156
    .line 157
    .line 158
    move-result v14

    .line 159
    if-ge v10, v14, :cond_5

    .line 160
    .line 161
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    check-cast v14, Landroid/os/Bundle;

    .line 166
    .line 167
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v14}, Lig0;->a(Landroid/os/Bundle;)Lig0;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    invoke-virtual {v9, v14}, Lpw1;->c(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    add-int/lit8 v10, v10, 0x1

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_5
    invoke-virtual {v9}, Luw1;->f()Lgy3;

    .line 181
    .line 182
    .line 183
    move-result-object v16

    .line 184
    const-string v8, "d"

    .line 185
    .line 186
    invoke-virtual {v7, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v14

    .line 190
    invoke-direct/range {v11 .. v16}, Llg0;-><init>(JJLjava/util/List;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Lcj0;->r()V

    .line 194
    .line 195
    .line 196
    iget-object v0, v1, Lts4;->H:Lkg0;

    .line 197
    .line 198
    invoke-interface {v0, v11, v2, v3}, Lkg0;->b(Llg0;J)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    :goto_1
    iget-object v0, v1, Lts4;->H:Lkg0;

    .line 203
    .line 204
    iget-wide v7, v1, Lts4;->W:J

    .line 205
    .line 206
    invoke-interface {v0, v7, v8}, Lkg0;->a(J)J

    .line 207
    .line 208
    .line 209
    move-result-wide v7

    .line 210
    const-wide/high16 v11, -0x8000000000000000L

    .line 211
    .line 212
    cmp-long v0, v7, v11

    .line 213
    .line 214
    if-nez v0, :cond_6

    .line 215
    .line 216
    iget-boolean v9, v1, Lts4;->T:Z

    .line 217
    .line 218
    if-eqz v9, :cond_6

    .line 219
    .line 220
    if-nez v10, :cond_6

    .line 221
    .line 222
    iput-boolean v4, v1, Lts4;->U:Z

    .line 223
    .line 224
    :cond_6
    if-eqz v0, :cond_7

    .line 225
    .line 226
    cmp-long v0, v7, v2

    .line 227
    .line 228
    if-gtz v0, :cond_7

    .line 229
    .line 230
    move v10, v4

    .line 231
    :cond_7
    if-eqz v10, :cond_9

    .line 232
    .line 233
    iget-object v0, v1, Lts4;->H:Lkg0;

    .line 234
    .line 235
    invoke-interface {v0, v2, v3}, Lkg0;->c(J)Lyw1;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iget-object v7, v1, Lts4;->H:Lkg0;

    .line 240
    .line 241
    invoke-interface {v7, v2, v3}, Lkg0;->d(J)J

    .line 242
    .line 243
    .line 244
    move-result-wide v7

    .line 245
    new-instance v9, Ljg0;

    .line 246
    .line 247
    invoke-virtual {v1, v7, v8}, Lts4;->J(J)J

    .line 248
    .line 249
    .line 250
    move-result-wide v10

    .line 251
    invoke-direct {v9, v10, v11, v0}, Ljg0;-><init>(JLjava/util/List;)V

    .line 252
    .line 253
    .line 254
    if-eqz v6, :cond_8

    .line 255
    .line 256
    invoke-virtual {v6, v4, v9}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_8
    iget-object v0, v9, Ljg0;->a:Lgy3;

    .line 265
    .line 266
    invoke-interface {v5, v0}, Lrs4;->n(Lgy3;)V

    .line 267
    .line 268
    .line 269
    invoke-interface {v5, v9}, Lrs4;->e(Ljg0;)V

    .line 270
    .line 271
    .line 272
    :goto_2
    iget-object v0, v1, Lts4;->H:Lkg0;

    .line 273
    .line 274
    invoke-interface {v0, v7, v8}, Lkg0;->e(J)V

    .line 275
    .line 276
    .line 277
    :cond_9
    iput-wide v2, v1, Lts4;->W:J

    .line 278
    .line 279
    return-void

    .line 280
    :cond_a
    invoke-virtual {v1}, Lts4;->H()V

    .line 281
    .line 282
    .line 283
    iput-wide v2, v1, Lts4;->W:J

    .line 284
    .line 285
    iget-object v0, v1, Lts4;->O:Lwn4;

    .line 286
    .line 287
    const-string v11, "Subtitle decoding failed. streamFormat="

    .line 288
    .line 289
    const-string v12, "TextRenderer"

    .line 290
    .line 291
    const/4 v13, 0x0

    .line 292
    if-nez v0, :cond_c

    .line 293
    .line 294
    iget-object v0, v1, Lts4;->L:Lrn4;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-interface {v0, v2, v3}, Lrn4;->c(J)V

    .line 300
    .line 301
    .line 302
    :try_start_0
    iget-object v0, v1, Lts4;->L:Lrn4;

    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-interface {v0}, Lzi0;->d()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Lwn4;

    .line 312
    .line 313
    iput-object v0, v1, Lts4;->O:Lwn4;
    :try_end_0
    .catch Landroidx/media3/extractor/text/SubtitleDecoderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 314
    .line 315
    goto :goto_4

    .line 316
    :catch_0
    move-exception v0

    .line 317
    new-instance v2, Ljava/lang/StringBuilder;

    .line 318
    .line 319
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    iget-object v3, v1, Lts4;->V:Ltb1;

    .line 323
    .line 324
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-static {v12, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 332
    .line 333
    .line 334
    new-instance v0, Ljg0;

    .line 335
    .line 336
    sget-object v2, Lgy3;->r:Lgy3;

    .line 337
    .line 338
    iget-wide v7, v1, Lts4;->W:J

    .line 339
    .line 340
    invoke-virtual {v1, v7, v8}, Lts4;->J(J)J

    .line 341
    .line 342
    .line 343
    move-result-wide v7

    .line 344
    invoke-direct {v0, v7, v8, v2}, Ljg0;-><init>(JLjava/util/List;)V

    .line 345
    .line 346
    .line 347
    if-eqz v6, :cond_b

    .line 348
    .line 349
    invoke-virtual {v6, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 354
    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_b
    iget-object v2, v0, Ljg0;->a:Lgy3;

    .line 358
    .line 359
    invoke-interface {v5, v2}, Lrs4;->n(Lgy3;)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v5, v0}, Lrs4;->e(Ljg0;)V

    .line 363
    .line 364
    .line 365
    :goto_3
    invoke-virtual {v1}, Lts4;->L()V

    .line 366
    .line 367
    .line 368
    iget-object v0, v1, Lts4;->L:Lrn4;

    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-interface {v0}, Lzi0;->a()V

    .line 374
    .line 375
    .line 376
    iput-object v13, v1, Lts4;->L:Lrn4;

    .line 377
    .line 378
    iput v10, v1, Lts4;->K:I

    .line 379
    .line 380
    invoke-virtual {v1}, Lts4;->K()V

    .line 381
    .line 382
    .line 383
    goto/16 :goto_11

    .line 384
    .line 385
    :cond_c
    :goto_4
    iget v0, v1, Lkq;->u:I

    .line 386
    .line 387
    const/4 v14, 0x2

    .line 388
    if-eq v0, v14, :cond_d

    .line 389
    .line 390
    goto/16 :goto_11

    .line 391
    .line 392
    :cond_d
    iget-object v0, v1, Lts4;->N:Lwn4;

    .line 393
    .line 394
    if-eqz v0, :cond_e

    .line 395
    .line 396
    invoke-virtual {v1}, Lts4;->I()J

    .line 397
    .line 398
    .line 399
    move-result-wide v15

    .line 400
    move v0, v10

    .line 401
    :goto_5
    cmp-long v15, v15, v2

    .line 402
    .line 403
    if-gtz v15, :cond_f

    .line 404
    .line 405
    iget v0, v1, Lts4;->P:I

    .line 406
    .line 407
    add-int/2addr v0, v4

    .line 408
    iput v0, v1, Lts4;->P:I

    .line 409
    .line 410
    invoke-virtual {v1}, Lts4;->I()J

    .line 411
    .line 412
    .line 413
    move-result-wide v15

    .line 414
    move v0, v4

    .line 415
    goto :goto_5

    .line 416
    :cond_e
    move v0, v10

    .line 417
    :cond_f
    iget-object v15, v1, Lts4;->O:Lwn4;

    .line 418
    .line 419
    if-eqz v15, :cond_10

    .line 420
    .line 421
    invoke-virtual {v15, v7}, Luv;->d(I)Z

    .line 422
    .line 423
    .line 424
    move-result v16

    .line 425
    if-eqz v16, :cond_12

    .line 426
    .line 427
    if-nez v0, :cond_10

    .line 428
    .line 429
    invoke-virtual {v1}, Lts4;->I()J

    .line 430
    .line 431
    .line 432
    move-result-wide v15

    .line 433
    const-wide v17, 0x7fffffffffffffffL

    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    cmp-long v15, v15, v17

    .line 439
    .line 440
    if-nez v15, :cond_10

    .line 441
    .line 442
    iget v15, v1, Lts4;->K:I

    .line 443
    .line 444
    if-ne v15, v14, :cond_11

    .line 445
    .line 446
    invoke-virtual {v1}, Lts4;->L()V

    .line 447
    .line 448
    .line 449
    iget-object v15, v1, Lts4;->L:Lrn4;

    .line 450
    .line 451
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    invoke-interface {v15}, Lzi0;->a()V

    .line 455
    .line 456
    .line 457
    iput-object v13, v1, Lts4;->L:Lrn4;

    .line 458
    .line 459
    iput v10, v1, Lts4;->K:I

    .line 460
    .line 461
    invoke-virtual {v1}, Lts4;->K()V

    .line 462
    .line 463
    .line 464
    :cond_10
    :goto_6
    move-object/from16 v16, v9

    .line 465
    .line 466
    goto :goto_7

    .line 467
    :cond_11
    invoke-virtual {v1}, Lts4;->L()V

    .line 468
    .line 469
    .line 470
    iput-boolean v4, v1, Lts4;->U:Z

    .line 471
    .line 472
    goto :goto_6

    .line 473
    :cond_12
    move-object/from16 v16, v9

    .line 474
    .line 475
    iget-wide v8, v15, Ldj0;->p:J

    .line 476
    .line 477
    cmp-long v8, v8, v2

    .line 478
    .line 479
    if-gtz v8, :cond_14

    .line 480
    .line 481
    iget-object v0, v1, Lts4;->N:Lwn4;

    .line 482
    .line 483
    if-eqz v0, :cond_13

    .line 484
    .line 485
    invoke-virtual {v0}, Ldj0;->s()V

    .line 486
    .line 487
    .line 488
    :cond_13
    invoke-virtual {v15, v2, v3}, Lwn4;->e(J)I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    iput v0, v1, Lts4;->P:I

    .line 493
    .line 494
    iput-object v15, v1, Lts4;->N:Lwn4;

    .line 495
    .line 496
    iput-object v13, v1, Lts4;->O:Lwn4;

    .line 497
    .line 498
    move v0, v4

    .line 499
    :cond_14
    :goto_7
    if-eqz v0, :cond_19

    .line 500
    .line 501
    iget-object v0, v1, Lts4;->N:Lwn4;

    .line 502
    .line 503
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    iget-object v0, v1, Lts4;->N:Lwn4;

    .line 507
    .line 508
    invoke-virtual {v0, v2, v3}, Lwn4;->e(J)I

    .line 509
    .line 510
    .line 511
    move-result v0

    .line 512
    if-eqz v0, :cond_17

    .line 513
    .line 514
    iget-object v8, v1, Lts4;->N:Lwn4;

    .line 515
    .line 516
    invoke-virtual {v8}, Lwn4;->n()I

    .line 517
    .line 518
    .line 519
    move-result v8

    .line 520
    if-nez v8, :cond_15

    .line 521
    .line 522
    goto :goto_8

    .line 523
    :cond_15
    iget-object v8, v1, Lts4;->N:Lwn4;

    .line 524
    .line 525
    const/4 v9, -0x1

    .line 526
    if-ne v0, v9, :cond_16

    .line 527
    .line 528
    invoke-virtual {v8}, Lwn4;->n()I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    sub-int/2addr v0, v4

    .line 533
    invoke-virtual {v8, v0}, Lwn4;->k(I)J

    .line 534
    .line 535
    .line 536
    move-result-wide v8

    .line 537
    goto :goto_9

    .line 538
    :cond_16
    sub-int/2addr v0, v4

    .line 539
    invoke-virtual {v8, v0}, Lwn4;->k(I)J

    .line 540
    .line 541
    .line 542
    move-result-wide v8

    .line 543
    goto :goto_9

    .line 544
    :cond_17
    :goto_8
    iget-object v0, v1, Lts4;->N:Lwn4;

    .line 545
    .line 546
    iget-wide v8, v0, Ldj0;->p:J

    .line 547
    .line 548
    :goto_9
    invoke-virtual {v1, v8, v9}, Lts4;->J(J)J

    .line 549
    .line 550
    .line 551
    move-result-wide v8

    .line 552
    new-instance v0, Ljg0;

    .line 553
    .line 554
    iget-object v15, v1, Lts4;->N:Lwn4;

    .line 555
    .line 556
    invoke-virtual {v15, v2, v3}, Lwn4;->m(J)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-direct {v0, v8, v9, v2}, Ljg0;-><init>(JLjava/util/List;)V

    .line 561
    .line 562
    .line 563
    if-eqz v6, :cond_18

    .line 564
    .line 565
    invoke-virtual {v6, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 570
    .line 571
    .line 572
    goto :goto_a

    .line 573
    :cond_18
    iget-object v2, v0, Ljg0;->a:Lgy3;

    .line 574
    .line 575
    invoke-interface {v5, v2}, Lrs4;->n(Lgy3;)V

    .line 576
    .line 577
    .line 578
    invoke-interface {v5, v0}, Lrs4;->e(Ljg0;)V

    .line 579
    .line 580
    .line 581
    :cond_19
    :goto_a
    iget v0, v1, Lts4;->K:I

    .line 582
    .line 583
    if-ne v0, v14, :cond_1a

    .line 584
    .line 585
    goto/16 :goto_11

    .line 586
    .line 587
    :cond_1a
    :goto_b
    :try_start_1
    iget-boolean v0, v1, Lts4;->T:Z

    .line 588
    .line 589
    if-nez v0, :cond_23

    .line 590
    .line 591
    iget-object v0, v1, Lts4;->M:Lvn4;

    .line 592
    .line 593
    if-nez v0, :cond_1c

    .line 594
    .line 595
    iget-object v0, v1, Lts4;->L:Lrn4;

    .line 596
    .line 597
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    invoke-interface {v0}, Lzi0;->e()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    check-cast v0, Lvn4;

    .line 605
    .line 606
    if-nez v0, :cond_1b

    .line 607
    .line 608
    goto/16 :goto_11

    .line 609
    .line 610
    :cond_1b
    iput-object v0, v1, Lts4;->M:Lvn4;

    .line 611
    .line 612
    goto :goto_c

    .line 613
    :catch_1
    move-exception v0

    .line 614
    goto :goto_f

    .line 615
    :cond_1c
    :goto_c
    iget v2, v1, Lts4;->K:I

    .line 616
    .line 617
    if-ne v2, v4, :cond_1d

    .line 618
    .line 619
    iput v7, v0, Luv;->o:I

    .line 620
    .line 621
    iget-object v2, v1, Lts4;->L:Lrn4;

    .line 622
    .line 623
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    invoke-interface {v2, v0}, Lzi0;->f(Lvn4;)V

    .line 627
    .line 628
    .line 629
    iput-object v13, v1, Lts4;->M:Lvn4;

    .line 630
    .line 631
    iput v14, v1, Lts4;->K:I

    .line 632
    .line 633
    return-void

    .line 634
    :cond_1d
    move-object/from16 v2, v16

    .line 635
    .line 636
    invoke-virtual {v1, v2, v0, v10}, Lkq;->z(Lgp3;Lcj0;I)I

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    const/4 v8, -0x4

    .line 641
    if-ne v3, v8, :cond_20

    .line 642
    .line 643
    invoke-virtual {v0, v7}, Luv;->d(I)Z

    .line 644
    .line 645
    .line 646
    move-result v3

    .line 647
    if-eqz v3, :cond_1e

    .line 648
    .line 649
    iput-boolean v4, v1, Lts4;->T:Z

    .line 650
    .line 651
    iput-boolean v10, v1, Lts4;->J:Z

    .line 652
    .line 653
    goto :goto_d

    .line 654
    :cond_1e
    iget-object v3, v2, Lgp3;->p:Ljava/lang/Object;

    .line 655
    .line 656
    check-cast v3, Ltb1;

    .line 657
    .line 658
    if-nez v3, :cond_1f

    .line 659
    .line 660
    goto :goto_11

    .line 661
    :cond_1f
    iget-wide v7, v3, Ltb1;->s:J

    .line 662
    .line 663
    iput-wide v7, v0, Lvn4;->x:J

    .line 664
    .line 665
    invoke-virtual {v0}, Lcj0;->u()V

    .line 666
    .line 667
    .line 668
    iget-boolean v3, v1, Lts4;->J:Z

    .line 669
    .line 670
    invoke-virtual {v0, v4}, Luv;->d(I)Z

    .line 671
    .line 672
    .line 673
    move-result v7

    .line 674
    xor-int/2addr v7, v4

    .line 675
    and-int/2addr v3, v7

    .line 676
    iput-boolean v3, v1, Lts4;->J:Z

    .line 677
    .line 678
    :goto_d
    iget-boolean v3, v1, Lts4;->J:Z

    .line 679
    .line 680
    if-nez v3, :cond_21

    .line 681
    .line 682
    iget-object v3, v1, Lts4;->L:Lrn4;

    .line 683
    .line 684
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-interface {v3, v0}, Lzi0;->f(Lvn4;)V

    .line 688
    .line 689
    .line 690
    iput-object v13, v1, Lts4;->M:Lvn4;
    :try_end_1
    .catch Landroidx/media3/extractor/text/SubtitleDecoderException; {:try_start_1 .. :try_end_1} :catch_1

    .line 691
    .line 692
    goto :goto_e

    .line 693
    :cond_20
    const/4 v0, -0x3

    .line 694
    if-ne v3, v0, :cond_21

    .line 695
    .line 696
    goto :goto_11

    .line 697
    :cond_21
    :goto_e
    move-object/from16 v16, v2

    .line 698
    .line 699
    const/4 v7, 0x4

    .line 700
    goto :goto_b

    .line 701
    :goto_f
    new-instance v2, Ljava/lang/StringBuilder;

    .line 702
    .line 703
    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    iget-object v3, v1, Lts4;->V:Ltb1;

    .line 707
    .line 708
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    invoke-static {v12, v2, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 716
    .line 717
    .line 718
    new-instance v0, Ljg0;

    .line 719
    .line 720
    sget-object v2, Lgy3;->r:Lgy3;

    .line 721
    .line 722
    iget-wide v7, v1, Lts4;->W:J

    .line 723
    .line 724
    invoke-virtual {v1, v7, v8}, Lts4;->J(J)J

    .line 725
    .line 726
    .line 727
    move-result-wide v7

    .line 728
    invoke-direct {v0, v7, v8, v2}, Ljg0;-><init>(JLjava/util/List;)V

    .line 729
    .line 730
    .line 731
    if-eqz v6, :cond_22

    .line 732
    .line 733
    invoke-virtual {v6, v4, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 738
    .line 739
    .line 740
    goto :goto_10

    .line 741
    :cond_22
    iget-object v2, v0, Ljg0;->a:Lgy3;

    .line 742
    .line 743
    invoke-interface {v5, v2}, Lrs4;->n(Lgy3;)V

    .line 744
    .line 745
    .line 746
    invoke-interface {v5, v0}, Lrs4;->e(Ljg0;)V

    .line 747
    .line 748
    .line 749
    :goto_10
    invoke-virtual {v1}, Lts4;->L()V

    .line 750
    .line 751
    .line 752
    iget-object v0, v1, Lts4;->L:Lrn4;

    .line 753
    .line 754
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 755
    .line 756
    .line 757
    invoke-interface {v0}, Lzi0;->a()V

    .line 758
    .line 759
    .line 760
    iput-object v13, v1, Lts4;->L:Lrn4;

    .line 761
    .line 762
    iput v10, v1, Lts4;->K:I

    .line 763
    .line 764
    invoke-virtual {v1}, Lts4;->K()V

    .line 765
    .line 766
    .line 767
    :cond_23
    :goto_11
    return-void
.end method

.method public final E(Ltb1;)I
    .locals 3

    .line 1
    iget-object v0, p1, Ltb1;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "application/x-media3-cues"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p1, Ltb1;->n:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object p0, p0, Lts4;->I:Lsn4;

    .line 15
    .line 16
    check-cast p0, Lom1;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lom1;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lom0;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lom0;->n(Ltb1;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    const-string p0, "application/cea-608"

    .line 32
    .line 33
    invoke-static {v1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    const-string p0, "application/x-mp4-cea-608"

    .line 40
    .line 41
    invoke-static {v1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    const-string p0, "application/cea-708"

    .line 48
    .line 49
    invoke-static {v1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {v1}, Llw2;->k(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    invoke-static {p0, v2, v2, v2}, Lkq;->a(IIII)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_1
    invoke-static {v2, v2, v2, v2}, Lkq;->a(IIII)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    return p0

    .line 73
    :cond_2
    :goto_0
    iget p0, p1, Ltb1;->O:I

    .line 74
    .line 75
    if-nez p0, :cond_3

    .line 76
    .line 77
    const/4 p0, 0x4

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/4 p0, 0x2

    .line 80
    :goto_1
    invoke-static {p0, v2, v2, v2}, Lkq;->a(IIII)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method

.method public final H()V
    .locals 2

    .line 1
    iget-object v0, p0, Lts4;->V:Ltb1;

    .line 2
    .line 3
    iget-object v0, v0, Ltb1;->n:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "application/cea-608"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lts4;->V:Ltb1;

    .line 14
    .line 15
    iget-object v0, v0, Ltb1;->n:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "application/x-mp4-cea-608"

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lts4;->V:Ltb1;

    .line 26
    .line 27
    iget-object v0, v0, Ltb1;->n:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "application/cea-708"

    .line 30
    .line 31
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 41
    :goto_1
    iget-object p0, p0, Lts4;->V:Ltb1;

    .line 42
    .line 43
    iget-object p0, p0, Ltb1;->n:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    const-string v0, "application/x-media3-cues"

    .line 49
    .line 50
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v0, "Legacy decoding is disabled, can\'t handle %s samples (expected %s)."

    .line 55
    .line 56
    invoke-static {v0, p0}, Lgh0;->s(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final I()J
    .locals 4

    .line 1
    iget v0, p0, Lts4;->P:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, Lts4;->N:Lwn4;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lts4;->P:I

    .line 18
    .line 19
    iget-object v1, p0, Lts4;->N:Lwn4;

    .line 20
    .line 21
    invoke-virtual {v1}, Lwn4;->n()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1
    iget-object v0, p0, Lts4;->N:Lwn4;

    .line 29
    .line 30
    iget p0, p0, Lts4;->P:I

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Lwn4;->k(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
.end method

.method public final J(J)J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p1, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 14
    .line 15
    .line 16
    iget-wide v0, p0, Lkq;->x:J

    .line 17
    .line 18
    sub-long/2addr p1, v0

    .line 19
    return-wide p1
.end method

.method public final K()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lts4;->J:Z

    .line 3
    .line 4
    iget-object v1, p0, Lts4;->V:Ltb1;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v2, p0, Lts4;->I:Lsn4;

    .line 10
    .line 11
    check-cast v2, Lom1;

    .line 12
    .line 13
    iget-object v2, v2, Lom1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lom0;

    .line 16
    .line 17
    iget-object v3, v1, Ltb1;->n:Ljava/lang/String;

    .line 18
    .line 19
    iget v4, v1, Ltb1;->K:I

    .line 20
    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    const/4 v6, -0x1

    .line 28
    sparse-switch v5, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    :goto_0
    move v0, v6

    .line 32
    goto :goto_1

    .line 33
    :sswitch_0
    const-string v0, "application/cea-708"

    .line 34
    .line 35
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v0, 0x2

    .line 43
    goto :goto_1

    .line 44
    :sswitch_1
    const-string v5, "application/cea-608"

    .line 45
    .line 46
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-nez v5, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_2
    const-string v0, "application/x-mp4-cea-608"

    .line 54
    .line 55
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x0

    .line 63
    :cond_2
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :pswitch_0
    new-instance v0, Li00;

    .line 68
    .line 69
    iget-object v1, v1, Ltb1;->q:Ljava/util/List;

    .line 70
    .line 71
    invoke-direct {v0, v1, v4}, Li00;-><init>(Ljava/util/List;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :pswitch_1
    new-instance v0, Le00;

    .line 76
    .line 77
    invoke-direct {v0, v4, v3}, Le00;-><init>(ILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    :goto_2
    invoke-virtual {v2, v1}, Lom0;->n(Ltb1;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Lom0;->C(Ltb1;)Lzn4;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    new-instance v1, Lho0;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    const-string v3, "Decoder"

    .line 102
    .line 103
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-direct {v1, v2, v0}, Lho0;-><init>(Ljava/lang/String;Lzn4;)V

    .line 108
    .line 109
    .line 110
    move-object v0, v1

    .line 111
    :goto_3
    iput-object v0, p0, Lts4;->L:Lrn4;

    .line 112
    .line 113
    iget-wide v1, p0, Lkq;->y:J

    .line 114
    .line 115
    invoke-interface {v0, v1, v2}, Lzi0;->b(J)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_4
    const-string p0, "Attempted to create decoder for unsupported MIME type: "

    .line 120
    .line 121
    invoke-static {p0, v3}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :sswitch_data_0
    .sparse-switch
        0x37713300 -> :sswitch_2
        0x5d578071 -> :sswitch_1
        0x5d578432 -> :sswitch_0
    .end sparse-switch

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final L()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lts4;->M:Lvn4;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lts4;->P:I

    .line 6
    .line 7
    iget-object v1, p0, Lts4;->N:Lwn4;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ldj0;->s()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lts4;->N:Lwn4;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lts4;->O:Lwn4;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Ldj0;->s()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lts4;->O:Lwn4;

    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "TextRenderer"

    .line 2
    .line 3
    return-object p0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljg0;

    .line 9
    .line 10
    iget-object v0, p1, Ljg0;->a:Lgy3;

    .line 11
    .line 12
    iget-object p0, p0, Lts4;->R:Lrs4;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lrs4;->n(Lgy3;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1}, Lrs4;->e(Ljg0;)V

    .line 18
    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    invoke-static {}, Ltb4;->a()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final m()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lts4;->U:Z

    .line 2
    .line 3
    return p0
.end method

.method public final o()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lts4;->V:Ltb1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, v0, Ltb1;->n:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "application/x-media3-cues"

    .line 10
    .line 11
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lts4;->H:Lkg0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-wide v2, p0, Lts4;->W:J

    .line 23
    .line 24
    invoke-interface {v0, v2, v3}, Lkg0;->a(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/high16 v4, -0x8000000000000000L

    .line 29
    .line 30
    cmp-long v0, v2, v4

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :try_start_0
    iget-object p0, p0, Lkq;->v:Lq44;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, Lq44;->s()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    iget-boolean v0, p0, Lts4;->U:Z

    .line 45
    .line 46
    if-nez v0, :cond_6

    .line 47
    .line 48
    iget-boolean v0, p0, Lts4;->T:Z

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    iget-object v0, p0, Lts4;->N:Lwn4;

    .line 53
    .line 54
    iget-wide v2, p0, Lts4;->W:J

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {v0}, Lwn4;->n()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-lez v4, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0}, Lwn4;->n()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    sub-int/2addr v4, v1

    .line 69
    invoke-virtual {v0, v4}, Lwn4;->k(I)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    cmp-long v0, v4, v2

    .line 74
    .line 75
    if-lez v0, :cond_3

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    iget-object v0, p0, Lts4;->O:Lwn4;

    .line 79
    .line 80
    iget-wide v2, p0, Lts4;->W:J

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0}, Lwn4;->n()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-lez v4, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Lwn4;->n()I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    sub-int/2addr v4, v1

    .line 95
    invoke-virtual {v0, v4}, Lwn4;->k(I)J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    cmp-long v0, v4, v2

    .line 100
    .line 101
    if-lez v0, :cond_4

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    iget-object p0, p0, Lts4;->M:Lvn4;

    .line 105
    .line 106
    if-nez p0, :cond_6

    .line 107
    .line 108
    :cond_5
    :goto_0
    return v1

    .line 109
    :catch_0
    :cond_6
    const/4 p0, 0x0

    .line 110
    return p0
.end method

.method public final p()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lts4;->V:Ltb1;

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, Lts4;->X:J

    .line 10
    .line 11
    new-instance v3, Ljg0;

    .line 12
    .line 13
    sget-object v4, Lgy3;->r:Lgy3;

    .line 14
    .line 15
    iget-wide v5, p0, Lts4;->W:J

    .line 16
    .line 17
    invoke-virtual {p0, v5, v6}, Lts4;->J(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-direct {v3, v5, v6, v4}, Ljg0;-><init>(JLjava/util/List;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, Lts4;->Q:Landroid/os/Handler;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-virtual {v4, v5, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v4, v3, Ljg0;->a:Lgy3;

    .line 38
    .line 39
    iget-object v5, p0, Lts4;->R:Lrs4;

    .line 40
    .line 41
    invoke-interface {v5, v4}, Lrs4;->n(Lgy3;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v5, v3}, Lrs4;->e(Ljg0;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iput-wide v1, p0, Lts4;->W:J

    .line 48
    .line 49
    iget-object v1, p0, Lts4;->L:Lrn4;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Lts4;->L()V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lts4;->L:Lrn4;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Lzi0;->a()V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lts4;->L:Lrn4;

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    iput v0, p0, Lts4;->K:I

    .line 68
    .line 69
    :cond_1
    return-void
.end method

.method public final r(JZZ)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lts4;->W:J

    .line 2
    .line 3
    iget-object p1, p0, Lts4;->H:Lkg0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lkg0;->clear()V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance p1, Ljg0;

    .line 11
    .line 12
    sget-object p2, Lgy3;->r:Lgy3;

    .line 13
    .line 14
    iget-wide p3, p0, Lts4;->W:J

    .line 15
    .line 16
    invoke-virtual {p0, p3, p4}, Lts4;->J(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p3

    .line 20
    invoke-direct {p1, p3, p4, p2}, Ljg0;-><init>(JLjava/util/List;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lts4;->Q:Landroid/os/Handler;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object p2, p1, Ljg0;->a:Lgy3;

    .line 37
    .line 38
    iget-object p3, p0, Lts4;->R:Lrs4;

    .line 39
    .line 40
    invoke-interface {p3, p2}, Lrs4;->n(Lgy3;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p3, p1}, Lrs4;->e(Ljg0;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 p1, 0x0

    .line 47
    iput-boolean p1, p0, Lts4;->T:Z

    .line 48
    .line 49
    iput-boolean p1, p0, Lts4;->U:Z

    .line 50
    .line 51
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    iput-wide p2, p0, Lts4;->X:J

    .line 57
    .line 58
    iget-object p2, p0, Lts4;->V:Ltb1;

    .line 59
    .line 60
    if-eqz p2, :cond_3

    .line 61
    .line 62
    iget-object p2, p2, Ltb1;->n:Ljava/lang/String;

    .line 63
    .line 64
    const-string p3, "application/x-media3-cues"

    .line 65
    .line 66
    invoke-static {p2, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    if-nez p2, :cond_3

    .line 71
    .line 72
    iget p2, p0, Lts4;->K:I

    .line 73
    .line 74
    if-eqz p2, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, Lts4;->L()V

    .line 77
    .line 78
    .line 79
    iget-object p2, p0, Lts4;->L:Lrn4;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-interface {p2}, Lzi0;->a()V

    .line 85
    .line 86
    .line 87
    const/4 p2, 0x0

    .line 88
    iput-object p2, p0, Lts4;->L:Lrn4;

    .line 89
    .line 90
    iput p1, p0, Lts4;->K:I

    .line 91
    .line 92
    invoke-virtual {p0}, Lts4;->K()V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_2
    invoke-virtual {p0}, Lts4;->L()V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lts4;->L:Lrn4;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-interface {p1}, Lzi0;->flush()V

    .line 105
    .line 106
    .line 107
    iget-wide p2, p0, Lkq;->y:J

    .line 108
    .line 109
    invoke-interface {p1, p2, p3}, Lzi0;->b(J)V

    .line 110
    .line 111
    .line 112
    :cond_3
    return-void
.end method

.method public final x([Ltb1;JJLmt2;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    aget-object p1, p1, p2

    .line 3
    .line 4
    iput-object p1, p0, Lts4;->V:Ltb1;

    .line 5
    .line 6
    iget-object p1, p1, Ltb1;->n:Ljava/lang/String;

    .line 7
    .line 8
    const-string p2, "application/x-media3-cues"

    .line 9
    .line 10
    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 p2, 0x1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lts4;->H()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lts4;->L:Lrn4;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput p2, p0, Lts4;->K:I

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Lts4;->K()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object p1, p0, Lts4;->V:Ltb1;

    .line 32
    .line 33
    iget p1, p1, Ltb1;->L:I

    .line 34
    .line 35
    if-ne p1, p2, :cond_2

    .line 36
    .line 37
    new-instance p1, Lkv2;

    .line 38
    .line 39
    invoke-direct {p1}, Lkv2;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    new-instance p1, Lxv1;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Lxv1;-><init>(I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iput-object p1, p0, Lts4;->H:Lkg0;

    .line 49
    .line 50
    return-void
.end method
