.class public final synthetic Ldd0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lgd0;Lb25;Ls22;Le74;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Ldd0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldd0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Ldd0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Ldd0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lgx3;Lc74;Lgx3;Luk0;)V
    .locals 0

    .line 14
    const/4 p4, 0x1

    iput p4, p0, Ldd0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldd0;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldd0;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldd0;->q:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Ldd0;->n:I

    iput-object p1, p0, Ldd0;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldd0;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldd0;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ldd0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    sget-object v5, Lj15;->a:Lj15;

    .line 8
    .line 9
    iget-object v6, p0, Ldd0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v7, p0, Ldd0;->p:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Ldd0;->o:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Lif1;

    .line 19
    .line 20
    check-cast v7, Ljx3;

    .line 21
    .line 22
    check-cast v6, Llu2;

    .line 23
    .line 24
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lad2;

    .line 29
    .line 30
    iget-object p1, v7, Ljx3;->n:Ljava/lang/Object;

    .line 31
    .line 32
    if-eq p1, p0, :cond_1

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    check-cast p1, Lad2;

    .line 37
    .line 38
    iget-object v0, v6, Llu2;->l:Li44;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Li44;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lku2;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object v0, p1, Lku2;->a:Lad2;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lad2;->j(La83;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iput-object p0, v7, Ljx3;->n:Ljava/lang/Object;

    .line 54
    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    new-instance p1, Lkl3;

    .line 58
    .line 59
    const/16 v0, 0xd

    .line 60
    .line 61
    invoke-direct {p1, v0, v6}, Lkl3;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lht1;

    .line 65
    .line 66
    invoke-direct {v0, p1, v2}, Lht1;-><init>(Lif1;I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, p0, v0}, Llu2;->l(Lad2;Lht1;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-object v5

    .line 73
    :pswitch_0
    check-cast p0, Lw44;

    .line 74
    .line 75
    check-cast v6, La54;

    .line 76
    .line 77
    check-cast p1, Lyr0;

    .line 78
    .line 79
    iget-object p1, p0, Lw44;->o:Lw03;

    .line 80
    .line 81
    invoke-virtual {p1, v7}, Lw03;->b(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_2

    .line 86
    .line 87
    iget-object v0, p0, Lw44;->n:Ljava/util/Map;

    .line 88
    .line 89
    invoke-interface {v0, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v7, v6}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Lv44;

    .line 96
    .line 97
    invoke-direct {v4, p0, v7, v6}, Lv44;-><init>(Lw44;Ljava/lang/Object;La54;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-string p0, "Key "

    .line 102
    .line 103
    const-string p1, " was used multiple times "

    .line 104
    .line 105
    invoke-static {v7, p1, p0}, Lnz2;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_0
    return-object v4

    .line 109
    :pswitch_1
    check-cast p0, Ljava/lang/String;

    .line 110
    .line 111
    check-cast v7, Landroid/content/Context;

    .line 112
    .line 113
    check-cast v6, Lb13;

    .line 114
    .line 115
    check-cast p1, Lyr0;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    if-eqz p0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_3
    invoke-static {}, Lud3;->t()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-static {p1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    new-instance p1, Li73;

    .line 138
    .line 139
    invoke-direct {p1, v6, v3}, Li73;-><init>(Lb13;I)V

    .line 140
    .line 141
    .line 142
    invoke-static {v7}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0}, Lc04;->g()Lvz3;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0, p0}, Lvz3;->P(Ljava/lang/String;)Lvz3;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    sget-object v0, Lwg0;->b:Lxq0;

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Llq;->e(Lxq0;)Llq;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    check-cast p0, Lvz3;

    .line 161
    .line 162
    sget-object v0, Lfh0;->g:Lof;

    .line 163
    .line 164
    invoke-virtual {p0, p1, v4, p0, v0}, Lvz3;->J(Lwq4;Lyz3;Llq;Ljava/util/concurrent/Executor;)V

    .line 165
    .line 166
    .line 167
    new-instance p0, Lvy1;

    .line 168
    .line 169
    const/4 v0, 0x3

    .line 170
    invoke-direct {p0, v0, v7, p1}, Lvy1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_4
    :goto_1
    invoke-interface {v6, v4}, Lb13;->setValue(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    new-instance p0, Lj73;

    .line 178
    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    :goto_2
    return-object p0

    .line 183
    :pswitch_2
    check-cast p0, Ljava/util/Set;

    .line 184
    .line 185
    check-cast v7, Lkz2;

    .line 186
    .line 187
    check-cast v6, Ljx3;

    .line 188
    .line 189
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-eqz p0, :cond_b

    .line 194
    .line 195
    iget-object p0, v7, Lkz2;->b:Lw03;

    .line 196
    .line 197
    invoke-virtual {p0, p1}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    if-eqz p0, :cond_b

    .line 202
    .line 203
    instance-of p1, p0, Lx03;

    .line 204
    .line 205
    if-eqz p1, :cond_9

    .line 206
    .line 207
    check-cast p0, Lx03;

    .line 208
    .line 209
    iget-object p1, p0, Lx03;->b:[Ljava/lang/Object;

    .line 210
    .line 211
    iget-object p0, p0, Lx03;->a:[J

    .line 212
    .line 213
    array-length v0, p0

    .line 214
    sub-int/2addr v0, v2

    .line 215
    if-ltz v0, :cond_b

    .line 216
    .line 217
    move v2, v1

    .line 218
    :goto_3
    aget-wide v3, p0, v2

    .line 219
    .line 220
    not-long v7, v3

    .line 221
    const/4 v9, 0x7

    .line 222
    shl-long/2addr v7, v9

    .line 223
    and-long/2addr v7, v3

    .line 224
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    and-long/2addr v7, v9

    .line 230
    cmp-long v7, v7, v9

    .line 231
    .line 232
    if-eqz v7, :cond_8

    .line 233
    .line 234
    sub-int v7, v2, v0

    .line 235
    .line 236
    not-int v7, v7

    .line 237
    ushr-int/lit8 v7, v7, 0x1f

    .line 238
    .line 239
    const/16 v8, 0x8

    .line 240
    .line 241
    rsub-int/lit8 v7, v7, 0x8

    .line 242
    .line 243
    move v9, v1

    .line 244
    :goto_4
    if-ge v9, v7, :cond_7

    .line 245
    .line 246
    const-wide/16 v10, 0xff

    .line 247
    .line 248
    and-long/2addr v10, v3

    .line 249
    const-wide/16 v12, 0x80

    .line 250
    .line 251
    cmp-long v10, v10, v12

    .line 252
    .line 253
    if-gez v10, :cond_6

    .line 254
    .line 255
    shl-int/lit8 v10, v2, 0x3

    .line 256
    .line 257
    add-int/2addr v10, v9

    .line 258
    aget-object v10, p1, v10

    .line 259
    .line 260
    check-cast v10, Ly94;

    .line 261
    .line 262
    iget-object v11, v6, Ljx3;->n:Ljava/lang/Object;

    .line 263
    .line 264
    if-nez v11, :cond_5

    .line 265
    .line 266
    new-instance v11, Ljava/util/ArrayList;

    .line 267
    .line 268
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 269
    .line 270
    .line 271
    iput-object v11, v6, Ljx3;->n:Ljava/lang/Object;

    .line 272
    .line 273
    :cond_5
    iget-object v11, v6, Ljx3;->n:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v11, Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v11, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    :cond_6
    shr-long/2addr v3, v8

    .line 281
    add-int/lit8 v9, v9, 0x1

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_7
    if-ne v7, v8, :cond_b

    .line 285
    .line 286
    :cond_8
    if-eq v2, v0, :cond_b

    .line 287
    .line 288
    add-int/lit8 v2, v2, 0x1

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_9
    check-cast p0, Ly94;

    .line 292
    .line 293
    iget-object p1, v6, Ljx3;->n:Ljava/lang/Object;

    .line 294
    .line 295
    if-nez p1, :cond_a

    .line 296
    .line 297
    new-instance p1, Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 300
    .line 301
    .line 302
    iput-object p1, v6, Ljx3;->n:Ljava/lang/Object;

    .line 303
    .line 304
    :cond_a
    iget-object p1, v6, Ljx3;->n:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast p1, Ljava/util/List;

    .line 307
    .line 308
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    :cond_b
    return-object v5

    .line 312
    :pswitch_3
    check-cast p0, Lba1;

    .line 313
    .line 314
    check-cast v7, Ley;

    .line 315
    .line 316
    check-cast v6, Lif1;

    .line 317
    .line 318
    check-cast p1, Lba1;

    .line 319
    .line 320
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-eqz p0, :cond_c

    .line 325
    .line 326
    goto :goto_5

    .line 327
    :cond_c
    iget-object p0, v7, Ley;->c:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast p0, Lba1;

    .line 330
    .line 331
    invoke-static {p1, p0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    if-nez p0, :cond_d

    .line 336
    .line 337
    invoke-interface {v6, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    check-cast p0, Ljava/lang/Boolean;

    .line 342
    .line 343
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    :goto_5
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    goto :goto_6

    .line 352
    :cond_d
    const-string p0, "Focus search landed at the root."

    .line 353
    .line 354
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    :goto_6
    return-object v4

    .line 358
    :pswitch_4
    check-cast p0, Lgx3;

    .line 359
    .line 360
    check-cast v7, Lc74;

    .line 361
    .line 362
    check-cast v6, Lgx3;

    .line 363
    .line 364
    check-cast p1, Lvd;

    .line 365
    .line 366
    iget-object v0, p1, Lvd;->e:Lzd3;

    .line 367
    .line 368
    invoke-virtual {v0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, Ljava/lang/Number;

    .line 373
    .line 374
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    iget v1, p0, Lgx3;->n:F

    .line 379
    .line 380
    sub-float/2addr v0, v1

    .line 381
    invoke-virtual {v7, v0}, Lc74;->a(F)F

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    iget-object v2, p1, Lvd;->e:Lzd3;

    .line 386
    .line 387
    invoke-virtual {v2}, Lzd3;->getValue()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    check-cast v2, Ljava/lang/Number;

    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    iput v2, p0, Lgx3;->n:F

    .line 398
    .line 399
    iget-object p0, p1, Lvd;->a:Lhd5;

    .line 400
    .line 401
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast p0, Lif1;

    .line 404
    .line 405
    iget-object v2, p1, Lvd;->f:Lce;

    .line 406
    .line 407
    invoke-interface {p0, v2}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    check-cast p0, Ljava/lang/Number;

    .line 412
    .line 413
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 414
    .line 415
    .line 416
    move-result p0

    .line 417
    iput p0, v6, Lgx3;->n:F

    .line 418
    .line 419
    sub-float/2addr v0, v1

    .line 420
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    const/high16 v0, 0x3f000000    # 0.5f

    .line 425
    .line 426
    cmpl-float p0, p0, v0

    .line 427
    .line 428
    if-lez p0, :cond_e

    .line 429
    .line 430
    invoke-virtual {p1}, Lvd;->a()V

    .line 431
    .line 432
    .line 433
    :cond_e
    return-object v5

    .line 434
    :pswitch_5
    check-cast p0, Lgd0;

    .line 435
    .line 436
    check-cast v7, Ls22;

    .line 437
    .line 438
    check-cast v6, Le74;

    .line 439
    .line 440
    check-cast p1, Ljava/lang/Float;

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    iget-boolean v0, p0, Lgd0;->D:Z

    .line 447
    .line 448
    if-eqz v0, :cond_f

    .line 449
    .line 450
    const/high16 v0, 0x3f800000    # 1.0f

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_f
    const/high16 v0, -0x40800000    # -1.0f

    .line 454
    .line 455
    :goto_7
    mul-float v1, v0, p1

    .line 456
    .line 457
    iget-object p0, p0, Lgd0;->C:Lg74;

    .line 458
    .line 459
    invoke-virtual {p0, v1}, Lg74;->i(F)J

    .line 460
    .line 461
    .line 462
    move-result-wide v1

    .line 463
    invoke-virtual {p0, v1, v2}, Lg74;->f(J)J

    .line 464
    .line 465
    .line 466
    move-result-wide v1

    .line 467
    iget-object v6, v6, Le74;->a:Lg74;

    .line 468
    .line 469
    iget-object v8, v6, Lg74;->k:Lq64;

    .line 470
    .line 471
    invoke-virtual {v6, v8, v1, v2, v3}, Lg74;->d(Lq64;JI)J

    .line 472
    .line 473
    .line 474
    move-result-wide v1

    .line 475
    invoke-virtual {p0, v1, v2}, Lg74;->f(J)J

    .line 476
    .line 477
    .line 478
    move-result-wide v1

    .line 479
    invoke-virtual {p0, v1, v2}, Lg74;->h(J)F

    .line 480
    .line 481
    .line 482
    move-result p0

    .line 483
    mul-float/2addr p0, v0

    .line 484
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    cmpg-float v0, v0, v1

    .line 493
    .line 494
    if-gez v0, :cond_10

    .line 495
    .line 496
    const-string v0, " < "

    .line 497
    .line 498
    const-string v1, ")"

    .line 499
    .line 500
    const-string v2, "Scroll animation cancelled because scroll was not consumed ("

    .line 501
    .line 502
    invoke-static {v2, p0, v0, p1, v1}, Lxa3;->f(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 507
    .line 508
    invoke-direct {p1, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 512
    .line 513
    .line 514
    invoke-interface {v7, p1}, Ls22;->f(Ljava/util/concurrent/CancellationException;)V

    .line 515
    .line 516
    .line 517
    :cond_10
    return-object v5

    .line 518
    nop

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
