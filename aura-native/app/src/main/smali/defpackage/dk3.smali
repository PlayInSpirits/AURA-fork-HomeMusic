.class public final synthetic Ldefpackage/dk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/hk3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/hk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/dk3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/dk3;->o:Ldefpackage/hk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/dk3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/dk3;->o:Ldefpackage/hk3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ldefpackage/v52;

    .line 13
    .line 14
    iget-boolean p1, p1, Ldefpackage/v52;->a:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/hk3;->j0()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Ldefpackage/hk3;->r0:Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p0, Ldefpackage/hk3;->q0:Ldefpackage/zd3;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Ldefpackage/hk3;->o0:Ldefpackage/bj2;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ldefpackage/sk2;->o0()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p0, v0, p1}, Ldefpackage/hk3;->m0(Ldefpackage/do2;I)V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_0
    return-object v3

    .line 48
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-boolean p1, p1, Ldefpackage/v52;->a:Z

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Ldefpackage/hk3;->j0()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-object v3

    .line 62
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 63
    .line 64
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-static {p1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    iget-object v0, p0, Ldefpackage/hk3;->y0:Ldefpackage/zd3;

    .line 71
    .line 72
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Ldefpackage/hk3;->o0:Ldefpackage/bj2;

    .line 80
    .line 81
    if-eqz p1, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ldefpackage/hk3;->i0(Ldefpackage/bj2;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    return-object v3

    .line 87
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 88
    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    new-instance v0, Ljava/util/ArrayList;

    .line 92
    .line 93
    const/16 v1, 0xa

    .line 94
    .line 95
    invoke-static {p1, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lcom/eddyizm/tempus/model/Queue;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    sget-object v0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 126
    .line 127
    :cond_5
    iput-object v0, p0, Ldefpackage/hk3;->r0:Ljava/util/List;

    .line 128
    .line 129
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-boolean p1, p1, Ldefpackage/v52;->a:Z

    .line 134
    .line 135
    if-nez p1, :cond_7

    .line 136
    .line 137
    iget-object p1, p0, Ldefpackage/hk3;->o0:Ldefpackage/bj2;

    .line 138
    .line 139
    if-eqz p1, :cond_6

    .line 140
    .line 141
    invoke-virtual {p0, p1}, Ldefpackage/hk3;->i0(Ldefpackage/bj2;)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_6
    iget-object p1, p0, Ldefpackage/hk3;->r0:Ljava/util/List;

    .line 146
    .line 147
    iget-object p0, p0, Ldefpackage/hk3;->q0:Ldefpackage/zd3;

    .line 148
    .line 149
    invoke-virtual {p0, p1}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_7
    :goto_2
    return-object v3

    .line 153
    :pswitch_3
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 154
    .line 155
    iget-object v0, p0, Ldefpackage/hk3;->l0:Ldefpackage/ey;

    .line 156
    .line 157
    if-nez v0, :cond_8

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_8
    if-eqz p1, :cond_9

    .line 161
    .line 162
    iget-object v4, v0, Ldefpackage/ey;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v4, Landroid/widget/Button;

    .line 165
    .line 166
    new-instance v5, Ldefpackage/ek3;

    .line 167
    .line 168
    invoke-direct {v5, p0, p1, v2}, Ldefpackage/ek3;-><init>(Ldefpackage/hk3;Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    iget-object v4, v0, Ldefpackage/ey;->f:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v4, Landroid/widget/Button;

    .line 177
    .line 178
    new-instance v5, Ldefpackage/ek3;

    .line 179
    .line 180
    invoke-direct {v5, p0, p1, v1}, Ldefpackage/ek3;-><init>(Ldefpackage/hk3;Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 184
    .line 185
    .line 186
    iget-object v4, v0, Ldefpackage/ey;->b:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v4, Landroid/widget/Button;

    .line 189
    .line 190
    new-instance v5, Ldefpackage/ek3;

    .line 191
    .line 192
    const/4 v6, 0x2

    .line 193
    invoke-direct {v5, p0, p1, v6}, Ldefpackage/ek3;-><init>(Ldefpackage/hk3;Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    .line 198
    .line 199
    iget-object p1, v0, Ldefpackage/ey;->c:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p1, Landroid/widget/Button;

    .line 202
    .line 203
    new-instance v4, Ldefpackage/fk3;

    .line 204
    .line 205
    invoke-direct {v4, p0, v2}, Ldefpackage/fk3;-><init>(Ldefpackage/hk3;I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    .line 210
    .line 211
    iget-object p1, v0, Ldefpackage/ey;->d:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p1, Landroid/widget/Button;

    .line 214
    .line 215
    new-instance v0, Ldefpackage/fk3;

    .line 216
    .line 217
    invoke-direct {v0, p0, v1}, Ldefpackage/fk3;-><init>(Ldefpackage/hk3;I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    .line 222
    .line 223
    :cond_9
    :goto_3
    return-object v3

    .line 224
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 225
    .line 226
    iget-object p0, p0, Ldefpackage/hk3;->n0:Ldefpackage/bl2;

    .line 227
    .line 228
    if-eqz p0, :cond_a

    .line 229
    .line 230
    if-eqz p1, :cond_a

    .line 231
    .line 232
    invoke-static {p0, p1, v1}, Ldefpackage/bo2;->e(Ldefpackage/ic2;Ljava/util/List;Z)V

    .line 233
    .line 234
    .line 235
    :cond_a
    return-object v3

    .line 236
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    invoke-virtual {p0}, Ldefpackage/hk3;->h0()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    if-ne p1, v0, :cond_10

    .line 251
    .line 252
    iget-object v0, p0, Ldefpackage/hk3;->x0:Ldefpackage/zd3;

    .line 253
    .line 254
    invoke-virtual {v0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_10

    .line 265
    .line 266
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 271
    .line 272
    if-nez v0, :cond_10

    .line 273
    .line 274
    sget-object p0, Ldefpackage/is3;->c:Lcom/eddyizm/tempus/service/MediaService;

    .line 275
    .line 276
    if-nez p0, :cond_b

    .line 277
    .line 278
    goto/16 :goto_5

    .line 279
    .line 280
    :cond_b
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->b()Ldefpackage/qi3;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    if-nez p1, :cond_c

    .line 285
    .line 286
    goto/16 :goto_5

    .line 287
    .line 288
    :cond_c
    invoke-interface {p1}, Ldefpackage/qi3;->f0()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_d

    .line 293
    .line 294
    invoke-interface {p1}, Ldefpackage/qi3;->c0()V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_5

    .line 298
    .line 299
    :cond_d
    invoke-static {p1}, Lcom/eddyizm/tempus/homemusic/a;->j(Ldefpackage/qi3;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_e

    .line 304
    .line 305
    goto/16 :goto_5

    .line 306
    .line 307
    :cond_e
    sget-object v0, Ldefpackage/is3;->e:Ldefpackage/k03;

    .line 308
    .line 309
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 310
    .line 311
    invoke-virtual {v0, v1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-static {p1}, Lcom/eddyizm/tempus/homemusic/b;->h(Ldefpackage/qi3;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_f

    .line 319
    .line 320
    sget-object p0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 321
    .line 322
    new-instance p1, Ldefpackage/u6;

    .line 323
    .line 324
    const/16 v0, 0xe

    .line 325
    .line 326
    invoke-direct {p1, v0}, Ldefpackage/u6;-><init>(I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 330
    .line 331
    .line 332
    goto/16 :goto_5

    .line 333
    .line 334
    :cond_f
    sput-boolean v2, Ldefpackage/is3;->d:Z

    .line 335
    .line 336
    invoke-static {p1, p0}, Ldefpackage/is3;->a(Ldefpackage/qi3;Ldefpackage/ao2;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_5

    .line 340
    .line 341
    :cond_10
    if-ltz p1, :cond_15

    .line 342
    .line 343
    invoke-virtual {p0}, Ldefpackage/hk3;->h0()Ljava/util/List;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-ge p1, v0, :cond_15

    .line 352
    .line 353
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 358
    .line 359
    if-eqz v0, :cond_11

    .line 360
    .line 361
    invoke-static {}, Ldefpackage/u52;->k()Z

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    if-eqz p0, :cond_15

    .line 366
    .line 367
    const-string p0, "select"

    .line 368
    .line 369
    invoke-static {p0, p1, p1}, Ldefpackage/u52;->q(Ljava/lang/String;II)Z

    .line 370
    .line 371
    .line 372
    goto/16 :goto_5

    .line 373
    .line 374
    :cond_11
    invoke-virtual {p0, p1}, Ldefpackage/hk3;->k0(I)V

    .line 375
    .line 376
    .line 377
    iget-object v0, p0, Ldefpackage/hk3;->o0:Ldefpackage/bj2;

    .line 378
    .line 379
    iget-object v1, p0, Ldefpackage/hk3;->w0:[I

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    if-ltz p1, :cond_12

    .line 385
    .line 386
    array-length v2, v1

    .line 387
    if-ge p1, v2, :cond_12

    .line 388
    .line 389
    aget v1, v1, p1

    .line 390
    .line 391
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    goto :goto_4

    .line 396
    :cond_12
    const/4 v1, 0x0

    .line 397
    :goto_4
    if-eqz v0, :cond_13

    .line 398
    .line 399
    if-eqz v1, :cond_13

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    invoke-virtual {v0}, Ldefpackage/sk2;->Q0()I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    if-ge v2, v4, :cond_13

    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    invoke-virtual {v0, v2}, Ldefpackage/sk2;->Y(I)Ldefpackage/gn2;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    iget-object v2, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {p0}, Ldefpackage/hk3;->h0()Ljava/util/List;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 430
    .line 431
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    invoke-static {v2, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-eqz v2, :cond_13

    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result p0

    .line 445
    invoke-virtual {v0, p0}, Ldefpackage/sk2;->W(I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Ldefpackage/sk2;->m0()V

    .line 449
    .line 450
    .line 451
    goto :goto_5

    .line 452
    :cond_13
    if-eqz v0, :cond_14

    .line 453
    .line 454
    invoke-virtual {v0}, Ldefpackage/sk2;->Q0()I

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    if-lez v1, :cond_14

    .line 459
    .line 460
    invoke-virtual {v0}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 461
    .line 462
    .line 463
    move-result-object p1

    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0}, Ldefpackage/sk2;->o0()I

    .line 468
    .line 469
    .line 470
    move-result v0

    .line 471
    invoke-virtual {p0, p1, v0}, Ldefpackage/hk3;->m0(Ldefpackage/do2;I)V

    .line 472
    .line 473
    .line 474
    goto :goto_5

    .line 475
    :cond_14
    iget-object v0, p0, Ldefpackage/hk3;->n0:Ldefpackage/bl2;

    .line 476
    .line 477
    if-eqz v0, :cond_15

    .line 478
    .line 479
    invoke-virtual {p0}, Ldefpackage/hk3;->h0()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    const-string v1, "queue"

    .line 484
    .line 485
    invoke-static {v0, p0, p1, v1}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 486
    .line 487
    .line 488
    :cond_15
    :goto_5
    return-object v3

    .line 489
    :pswitch_6
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 490
    .line 491
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 496
    .line 497
    if-nez v0, :cond_18

    .line 498
    .line 499
    iget-object v0, p0, Ldefpackage/hk3;->o0:Ldefpackage/bj2;

    .line 500
    .line 501
    if-nez v0, :cond_18

    .line 502
    .line 503
    if-eqz p1, :cond_18

    .line 504
    .line 505
    invoke-virtual {p0}, Ldefpackage/hk3;->h0()Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    if-nez v0, :cond_18

    .line 514
    .line 515
    invoke-virtual {p0}, Ldefpackage/hk3;->h0()Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    if-eqz v1, :cond_17

    .line 528
    .line 529
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 534
    .line 535
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    invoke-static {v1, v4}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    move-result v1

    .line 547
    if-eqz v1, :cond_16

    .line 548
    .line 549
    goto :goto_7

    .line 550
    :cond_16
    add-int/lit8 v2, v2, 0x1

    .line 551
    .line 552
    goto :goto_6

    .line 553
    :cond_17
    const/4 v2, -0x1

    .line 554
    :goto_7
    if-ltz v2, :cond_18

    .line 555
    .line 556
    iget-object p1, p0, Ldefpackage/hk3;->s0:Ldefpackage/wd3;

    .line 557
    .line 558
    invoke-virtual {p1}, Ldefpackage/wd3;->g()I

    .line 559
    .line 560
    .line 561
    move-result p1

    .line 562
    if-eq v2, p1, :cond_18

    .line 563
    .line 564
    invoke-virtual {p0, v2}, Ldefpackage/hk3;->k0(I)V

    .line 565
    .line 566
    .line 567
    :cond_18
    return-object v3

    .line 568
    nop

    .line 569
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
