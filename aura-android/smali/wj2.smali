.class public final Lwj2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lhg3;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/os/Bundle;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lpz1;


# direct methods
.method public synthetic constructor <init>(Lpz1;Lhg3;Ljava/lang/String;Landroid/os/Bundle;Lv14;I)V
    .locals 0

    .line 18
    iput p6, p0, Lwj2;->n:I

    iput-object p1, p0, Lwj2;->s:Lpz1;

    iput-object p2, p0, Lwj2;->o:Lhg3;

    iput-object p3, p0, Lwj2;->p:Ljava/lang/String;

    iput-object p4, p0, Lwj2;->q:Landroid/os/Bundle;

    iput-object p5, p0, Lwj2;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lpz1;Lhg3;Ljava/lang/String;Landroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwj2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwj2;->s:Lpz1;

    .line 8
    .line 9
    iput-object p2, p0, Lwj2;->o:Lhg3;

    .line 10
    .line 11
    iput-object p3, p0, Lwj2;->p:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lwj2;->r:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lwj2;->q:Landroid/os/Bundle;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lwj2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lwj2;->p:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "MLSLegacyStub"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Lwj2;->r:Ljava/lang/Object;

    .line 9
    .line 10
    const-string v5, "MBServiceCompat"

    .line 11
    .line 12
    iget-object v6, p0, Lwj2;->s:Lpz1;

    .line 13
    .line 14
    iget-object v7, p0, Lwj2;->o:Lhg3;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, v7, Lhg3;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroid/os/Messenger;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, v6, Lpz1;->o:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lpn2;

    .line 30
    .line 31
    iget-object v1, v1, Lpn2;->r:Loi;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Loj2;

    .line 38
    .line 39
    iget-object v11, p0, Lwj2;->p:Ljava/lang/String;

    .line 40
    .line 41
    if-nez v0, :cond_0

    .line 42
    .line 43
    const-string p0, "addSubscription for callback that isn\'t registered id="

    .line 44
    .line 45
    invoke-static {p0, v11, v5}, Lxa3;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_0
    iget-object v1, v0, Loj2;->f:Ljava/util/HashMap;

    .line 51
    .line 52
    iget-object v5, v6, Lpz1;->o:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v8, v5

    .line 55
    check-cast v8, Lpn2;

    .line 56
    .line 57
    check-cast v4, Landroid/os/IBinder;

    .line 58
    .line 59
    invoke-virtual {v1, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    check-cast v5, Ljava/util/List;

    .line 64
    .line 65
    if-nez v5, :cond_1

    .line 66
    .line 67
    new-instance v5, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    iget-object v10, p0, Lwj2;->q:Landroid/os/Bundle;

    .line 81
    .line 82
    if-eqz v7, :cond_6

    .line 83
    .line 84
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    check-cast v7, Lld3;

    .line 89
    .line 90
    iget-object v9, v7, Lld3;->a:Ljava/lang/Object;

    .line 91
    .line 92
    if-ne v4, v9, :cond_2

    .line 93
    .line 94
    iget-object v7, v7, Lld3;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Landroid/os/Bundle;

    .line 97
    .line 98
    if-ne v10, v7, :cond_3

    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_3
    const-string v9, "android.media.browse.extra.PAGE_SIZE"

    .line 103
    .line 104
    const-string v12, "android.media.browse.extra.PAGE"

    .line 105
    .line 106
    const/4 v13, -0x1

    .line 107
    if-nez v10, :cond_4

    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v7, v12, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-ne v10, v13, :cond_2

    .line 117
    .line 118
    invoke-virtual {v7, v9, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-ne v7, v13, :cond_2

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    if-nez v7, :cond_5

    .line 126
    .line 127
    invoke-virtual {v10, v12, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-ne v7, v13, :cond_2

    .line 132
    .line 133
    invoke-virtual {v10, v9, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-ne v7, v13, :cond_2

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_5
    invoke-virtual {v10, v12, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-virtual {v7, v12, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    if-ne v14, v12, :cond_2

    .line 149
    .line 150
    invoke-virtual {v10, v9, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    invoke-virtual {v7, v9, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    if-ne v10, v7, :cond_2

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_6
    new-instance p0, Lld3;

    .line 162
    .line 163
    invoke-direct {p0, v4, v10}, Lld3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v5, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v11, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v8, v11, v0, v10, v3}, Lpn2;->g(Ljava/lang/String;Loj2;Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 173
    .line 174
    .line 175
    iput-object v0, v8, Lpn2;->s:Loj2;

    .line 176
    .line 177
    invoke-virtual {v8}, Lpn2;->b()Lfr2;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    if-nez v9, :cond_7

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_7
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-eqz p0, :cond_8

    .line 189
    .line 190
    new-instance p0, Ljava/lang/StringBuilder;

    .line 191
    .line 192
    const-string v0, "onSubscribe(): Ignoring empty id from "

    .line 193
    .line 194
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-static {v2, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_8
    iget-object p0, v8, Lpn2;->z:Ltn2;

    .line 209
    .line 210
    iget-object p0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 211
    .line 212
    new-instance v7, Lt6;

    .line 213
    .line 214
    const/16 v12, 0xe

    .line 215
    .line 216
    invoke-direct/range {v7 .. v12}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 217
    .line 218
    .line 219
    invoke-static {p0, v7}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 220
    .line 221
    .line 222
    :goto_0
    iput-object v3, v8, Lpn2;->s:Loj2;

    .line 223
    .line 224
    :goto_1
    return-void

    .line 225
    :pswitch_0
    iget-object v0, v7, Lhg3;->o:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Landroid/os/Messenger;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v2, v6, Lpz1;->o:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, Lpn2;

    .line 236
    .line 237
    iget-object v2, v2, Lpn2;->r:Loi;

    .line 238
    .line 239
    invoke-virtual {v2, v0}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    check-cast v0, Loj2;

    .line 244
    .line 245
    iget-object v2, p0, Lwj2;->q:Landroid/os/Bundle;

    .line 246
    .line 247
    if-nez v0, :cond_9

    .line 248
    .line 249
    new-instance p0, Ljava/lang/StringBuilder;

    .line 250
    .line 251
    const-string v0, "sendCustomAction for callback that isn\'t registered action="

    .line 252
    .line 253
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    const-string v0, ", extras="

    .line 260
    .line 261
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    invoke-static {v5, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_9
    iget-object v1, v6, Lpz1;->o:Ljava/lang/Object;

    .line 276
    .line 277
    move-object v6, v1

    .line 278
    check-cast v6, Lpn2;

    .line 279
    .line 280
    check-cast v4, Lv14;

    .line 281
    .line 282
    new-instance v9, Lnj2;

    .line 283
    .line 284
    const/4 v1, 0x2

    .line 285
    iget-object v7, p0, Lwj2;->p:Ljava/lang/String;

    .line 286
    .line 287
    invoke-direct {v9, v7, v4, v1}, Lnj2;-><init>(Ljava/lang/Object;Lv14;I)V

    .line 288
    .line 289
    .line 290
    iput-object v0, v6, Lpn2;->s:Loj2;

    .line 291
    .line 292
    if-nez v2, :cond_a

    .line 293
    .line 294
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 295
    .line 296
    move-object v10, p0

    .line 297
    goto :goto_2

    .line 298
    :cond_a
    move-object v10, v2

    .line 299
    :goto_2
    invoke-virtual {v6}, Lpn2;->b()Lfr2;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    if-nez v8, :cond_b

    .line 304
    .line 305
    invoke-virtual {v9}, Luj2;->e()V

    .line 306
    .line 307
    .line 308
    goto :goto_3

    .line 309
    :cond_b
    invoke-virtual {v9}, Luj2;->a()V

    .line 310
    .line 311
    .line 312
    iget-object p0, v6, Lpn2;->z:Ltn2;

    .line 313
    .line 314
    iget-object p0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 315
    .line 316
    new-instance v5, Lmr;

    .line 317
    .line 318
    const/4 v11, 0x7

    .line 319
    invoke-direct/range {v5 .. v11}, Lmr;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 320
    .line 321
    .line 322
    invoke-static {p0, v5}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 323
    .line 324
    .line 325
    :goto_3
    iput-object v3, v6, Lpn2;->s:Loj2;

    .line 326
    .line 327
    invoke-virtual {v9}, Luj2;->b()Z

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    if-eqz p0, :cond_c

    .line 332
    .line 333
    :goto_4
    return-void

    .line 334
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    new-instance v0, Ljava/lang/StringBuilder;

    .line 337
    .line 338
    const-string v1, "onCustomAction must call detach() or sendResult() or sendError() before returning for action="

    .line 339
    .line 340
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string v1, " extras="

    .line 347
    .line 348
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw p0

    .line 362
    :pswitch_1
    iget-object v0, v7, Lhg3;->o:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v0, Landroid/os/Messenger;

    .line 365
    .line 366
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    iget-object v7, v6, Lpz1;->o:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v7, Lpn2;

    .line 373
    .line 374
    iget-object v7, v7, Lpn2;->r:Loi;

    .line 375
    .line 376
    invoke-virtual {v7, v0}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    check-cast v0, Loj2;

    .line 381
    .line 382
    if-nez v0, :cond_d

    .line 383
    .line 384
    new-instance p0, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    const-string v0, "search for callback that isn\'t registered query="

    .line 387
    .line 388
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    invoke-static {v5, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    goto :goto_6

    .line 402
    :cond_d
    iget-object v1, v6, Lpz1;->o:Ljava/lang/Object;

    .line 403
    .line 404
    move-object v6, v1

    .line 405
    check-cast v6, Lpn2;

    .line 406
    .line 407
    check-cast v4, Lv14;

    .line 408
    .line 409
    new-instance v8, Lnj2;

    .line 410
    .line 411
    const/4 v1, 0x1

    .line 412
    iget-object v9, p0, Lwj2;->p:Ljava/lang/String;

    .line 413
    .line 414
    invoke-direct {v8, v9, v4, v1}, Lnj2;-><init>(Ljava/lang/Object;Lv14;I)V

    .line 415
    .line 416
    .line 417
    iput-object v0, v6, Lpn2;->s:Loj2;

    .line 418
    .line 419
    invoke-virtual {v6}, Lpn2;->b()Lfr2;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    if-nez v7, :cond_e

    .line 424
    .line 425
    invoke-virtual {v8, v3}, Luj2;->f(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    goto :goto_5

    .line 429
    :cond_e
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_f

    .line 434
    .line 435
    new-instance p0, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v0, "Ignoring empty query from "

    .line 438
    .line 439
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {p0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    invoke-static {v2, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v8, v3}, Luj2;->f(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    goto :goto_5

    .line 456
    :cond_f
    iget-object v0, v7, Lfr2;->d:Ler2;

    .line 457
    .line 458
    instance-of v0, v0, Lon2;

    .line 459
    .line 460
    if-nez v0, :cond_10

    .line 461
    .line 462
    goto :goto_5

    .line 463
    :cond_10
    invoke-virtual {v8}, Luj2;->a()V

    .line 464
    .line 465
    .line 466
    iget-object v0, v6, Lpn2;->z:Ltn2;

    .line 467
    .line 468
    iget-object v0, v0, Ltn2;->l:Landroid/os/Handler;

    .line 469
    .line 470
    new-instance v5, Lt6;

    .line 471
    .line 472
    iget-object v10, p0, Lwj2;->q:Landroid/os/Bundle;

    .line 473
    .line 474
    invoke-direct/range {v5 .. v10}, Lt6;-><init>(Lpn2;Lfr2;Lnj2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 475
    .line 476
    .line 477
    invoke-static {v0, v5}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 478
    .line 479
    .line 480
    :goto_5
    iput-object v3, v6, Lpn2;->s:Loj2;

    .line 481
    .line 482
    invoke-virtual {v8}, Luj2;->b()Z

    .line 483
    .line 484
    .line 485
    move-result p0

    .line 486
    if-eqz p0, :cond_11

    .line 487
    .line 488
    goto :goto_6

    .line 489
    :cond_11
    const-string p0, "onSearch must call detach() or sendResult() before returning for query="

    .line 490
    .line 491
    invoke-static {p0, v9}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    :goto_6
    return-void

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
