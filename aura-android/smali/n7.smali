.class public final synthetic Ln7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ln7;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 10

    .line 1
    iget p0, p0, Ln7;->n:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lr95;

    .line 10
    .line 11
    check-cast p2, Lr95;

    .line 12
    .line 13
    iget-wide p0, p1, Lr95;->b:J

    .line 14
    .line 15
    iget-wide v0, p2, Lr95;->b:J

    .line 16
    .line 17
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :pswitch_0
    check-cast p1, Ls95;

    .line 23
    .line 24
    check-cast p2, Ls95;

    .line 25
    .line 26
    iget-object p0, p1, Ls95;->a:Lt95;

    .line 27
    .line 28
    iget p0, p0, Lt95;->b:I

    .line 29
    .line 30
    iget-object p1, p2, Ls95;->a:Lt95;

    .line 31
    .line 32
    iget p1, p1, Lt95;->b:I

    .line 33
    .line 34
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :pswitch_1
    check-cast p1, Ljava/lang/Double;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Double;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :pswitch_2
    check-cast p1, Leg4;

    .line 49
    .line 50
    check-cast p2, Leg4;

    .line 51
    .line 52
    iget p0, p1, Leg4;->c:F

    .line 53
    .line 54
    iget p1, p2, Leg4;->c:F

    .line 55
    .line 56
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    return p0

    .line 61
    :pswitch_3
    check-cast p1, Leg4;

    .line 62
    .line 63
    check-cast p2, Leg4;

    .line 64
    .line 65
    iget p0, p1, Leg4;->a:I

    .line 66
    .line 67
    iget p1, p2, Leg4;->a:I

    .line 68
    .line 69
    sub-int/2addr p0, p1

    .line 70
    return p0

    .line 71
    :pswitch_4
    sget-object p0, Lr94;->b:Lm94;

    .line 72
    .line 73
    invoke-virtual {p0, p1, p2}, Lm94;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    return p0

    .line 84
    :pswitch_5
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 85
    .line 86
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_2

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string v0, ""

    .line 105
    .line 106
    if-eqz p0, :cond_0

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    move-object p0, v0

    .line 114
    :goto_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    if-eqz p1, :cond_1

    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 130
    .line 131
    .line 132
    move-result p0

    .line 133
    if-nez p0, :cond_5

    .line 134
    .line 135
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-nez p0, :cond_5

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_3

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    goto :goto_1

    .line 156
    :cond_3
    move p0, v2

    .line 157
    :goto_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    if-eqz p1, :cond_4

    .line 162
    .line 163
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    :cond_4
    invoke-static {p0, v2}, Ljava/lang/Integer;->compare(II)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    goto :goto_2

    .line 176
    :cond_5
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move v0, v1

    .line 184
    :goto_2
    return v0

    .line 185
    :pswitch_6
    check-cast p1, Lte4;

    .line 186
    .line 187
    check-cast p2, Lte4;

    .line 188
    .line 189
    iget-wide v2, p1, Lte4;->s:J

    .line 190
    .line 191
    iget-wide v4, p2, Lte4;->s:J

    .line 192
    .line 193
    sub-long v6, v2, v4

    .line 194
    .line 195
    const-wide/16 v8, 0x0

    .line 196
    .line 197
    cmp-long p0, v6, v8

    .line 198
    .line 199
    if-nez p0, :cond_7

    .line 200
    .line 201
    invoke-virtual {p1, p2}, Lte4;->a(Lte4;)I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    goto :goto_3

    .line 206
    :cond_7
    cmp-long p0, v2, v4

    .line 207
    .line 208
    if-gez p0, :cond_8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    move v0, v1

    .line 212
    :goto_3
    return v0

    .line 213
    :pswitch_7
    check-cast p1, Lc72;

    .line 214
    .line 215
    check-cast p2, Lc72;

    .line 216
    .line 217
    iget-object p0, p1, Lc72;->R:Lf72;

    .line 218
    .line 219
    iget-object p0, p0, Lf72;->p:Lti2;

    .line 220
    .line 221
    iget p0, p0, Lti2;->O:F

    .line 222
    .line 223
    iget-object v0, p2, Lc72;->R:Lf72;

    .line 224
    .line 225
    iget-object v0, v0, Lf72;->p:Lti2;

    .line 226
    .line 227
    iget v0, v0, Lti2;->O:F

    .line 228
    .line 229
    cmpg-float v1, p0, v0

    .line 230
    .line 231
    if-nez v1, :cond_9

    .line 232
    .line 233
    invoke-virtual {p1}, Lc72;->u()I

    .line 234
    .line 235
    .line 236
    move-result p0

    .line 237
    invoke-virtual {p2}, Lc72;->u()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    invoke-static {p0, p1}, Lh12;->j(II)I

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    goto :goto_4

    .line 246
    :cond_9
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    :goto_4
    return p0

    .line 251
    :pswitch_8
    check-cast p1, Lj02;

    .line 252
    .line 253
    check-cast p2, Lj02;

    .line 254
    .line 255
    iget p0, p1, Lh02;->o:I

    .line 256
    .line 257
    iget p1, p1, Lh02;->n:I

    .line 258
    .line 259
    sub-int/2addr p0, p1

    .line 260
    iget p1, p2, Lh02;->o:I

    .line 261
    .line 262
    iget p2, p2, Lh02;->n:I

    .line 263
    .line 264
    sub-int/2addr p1, p2

    .line 265
    sub-int/2addr p0, p1

    .line 266
    return p0

    .line 267
    :pswitch_9
    check-cast p1, Lqm1;

    .line 268
    .line 269
    check-cast p2, Lqm1;

    .line 270
    .line 271
    iget-object p0, p1, Lqm1;->a:Ljava/lang/String;

    .line 272
    .line 273
    iget-object p1, p2, Lqm1;->a:Ljava/lang/String;

    .line 274
    .line 275
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    return p0

    .line 280
    :pswitch_a
    check-cast p1, Lo12;

    .line 281
    .line 282
    check-cast p2, Lo12;

    .line 283
    .line 284
    iget p0, p1, Lo12;->b:I

    .line 285
    .line 286
    iget p1, p2, Lo12;->b:I

    .line 287
    .line 288
    invoke-static {p0, p1}, Lh12;->j(II)I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    return p0

    .line 293
    :pswitch_b
    check-cast p1, [B

    .line 294
    .line 295
    check-cast p2, [B

    .line 296
    .line 297
    array-length p0, p1

    .line 298
    array-length v0, p2

    .line 299
    if-eq p0, v0, :cond_a

    .line 300
    .line 301
    array-length p0, p1

    .line 302
    array-length p1, p2

    .line 303
    sub-int v2, p0, p1

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_a
    move p0, v2

    .line 307
    :goto_5
    array-length v0, p1

    .line 308
    if-ge p0, v0, :cond_c

    .line 309
    .line 310
    aget-byte v0, p1, p0

    .line 311
    .line 312
    aget-byte v1, p2, p0

    .line 313
    .line 314
    if-eq v0, v1, :cond_b

    .line 315
    .line 316
    sub-int v2, v0, v1

    .line 317
    .line 318
    goto :goto_6

    .line 319
    :cond_b
    add-int/lit8 p0, p0, 0x1

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_c
    :goto_6
    return v2

    .line 323
    :pswitch_c
    check-cast p1, Lns0;

    .line 324
    .line 325
    check-cast p2, Lns0;

    .line 326
    .line 327
    iget-wide p0, p1, Lns0;->c:J

    .line 328
    .line 329
    iget-wide v0, p2, Lns0;->c:J

    .line 330
    .line 331
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compare(JJ)I

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    return p0

    .line 336
    :pswitch_d
    check-cast p1, Lon0;

    .line 337
    .line 338
    check-cast p2, Lon0;

    .line 339
    .line 340
    iget-boolean p0, p1, Lon0;->r:Z

    .line 341
    .line 342
    iget v0, p1, Lon0;->w:I

    .line 343
    .line 344
    if-eqz p0, :cond_d

    .line 345
    .line 346
    iget-boolean p0, p1, Lon0;->u:Z

    .line 347
    .line 348
    if-eqz p0, :cond_d

    .line 349
    .line 350
    sget-object p0, Lpn0;->k:Lgb3;

    .line 351
    .line 352
    goto :goto_7

    .line 353
    :cond_d
    sget-object p0, Lpn0;->k:Lgb3;

    .line 354
    .line 355
    invoke-virtual {p0}, Lgb3;->a()Lgb3;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    :goto_7
    iget-object v1, p1, Lon0;->s:Ljn0;

    .line 360
    .line 361
    iget-boolean v1, v1, Lcw4;->F:Z

    .line 362
    .line 363
    sget-object v2, Lv60;->a:Lt60;

    .line 364
    .line 365
    if-eqz v1, :cond_e

    .line 366
    .line 367
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    iget v3, p2, Lon0;->w:I

    .line 372
    .line 373
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    sget-object v4, Lpn0;->k:Lgb3;

    .line 378
    .line 379
    invoke-virtual {v4}, Lgb3;->a()Lgb3;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    invoke-virtual {v2, v1, v3, v4}, Lt60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    :cond_e
    iget p1, p1, Lon0;->x:I

    .line 388
    .line 389
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    iget v1, p2, Lon0;->x:I

    .line 394
    .line 395
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v2, p1, v1, p0}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    iget p2, p2, Lon0;->w:I

    .line 408
    .line 409
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    invoke-virtual {p1, v0, p2, p0}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    invoke-virtual {p0}, Lv60;->e()I

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    return p0

    .line 422
    :pswitch_e
    check-cast p1, Lon0;

    .line 423
    .line 424
    check-cast p2, Lon0;

    .line 425
    .line 426
    invoke-static {p1, p2}, Lon0;->c(Lon0;Lon0;)I

    .line 427
    .line 428
    .line 429
    move-result p0

    .line 430
    return p0

    .line 431
    :pswitch_f
    check-cast p1, Ljava/util/List;

    .line 432
    .line 433
    check-cast p2, Ljava/util/List;

    .line 434
    .line 435
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    check-cast p0, Lln0;

    .line 440
    .line 441
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    check-cast p1, Lln0;

    .line 446
    .line 447
    invoke-virtual {p0, p1}, Lln0;->c(Lln0;)I

    .line 448
    .line 449
    .line 450
    move-result p0

    .line 451
    return p0

    .line 452
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 453
    .line 454
    check-cast p2, Ljava/util/List;

    .line 455
    .line 456
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    check-cast p0, Lfn0;

    .line 461
    .line 462
    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    check-cast p1, Lfn0;

    .line 467
    .line 468
    invoke-virtual {p0, p1}, Lfn0;->c(Lfn0;)I

    .line 469
    .line 470
    .line 471
    move-result p0

    .line 472
    return p0

    .line 473
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 474
    .line 475
    check-cast p2, Ljava/util/List;

    .line 476
    .line 477
    new-instance p0, Ln7;

    .line 478
    .line 479
    const/16 v0, 0x9

    .line 480
    .line 481
    invoke-direct {p0, v0}, Ln7;-><init>(I)V

    .line 482
    .line 483
    .line 484
    invoke-static {p1, p0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    check-cast p0, Lon0;

    .line 489
    .line 490
    new-instance v1, Ln7;

    .line 491
    .line 492
    invoke-direct {v1, v0}, Ln7;-><init>(I)V

    .line 493
    .line 494
    .line 495
    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    check-cast v0, Lon0;

    .line 500
    .line 501
    invoke-static {p0, v0}, Lon0;->c(Lon0;Lon0;)I

    .line 502
    .line 503
    .line 504
    move-result p0

    .line 505
    invoke-static {p0}, Lt60;->f(I)Lv60;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    invoke-virtual {p0, v0, v1}, Lv60;->a(II)Lv60;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    new-instance v0, Ln7;

    .line 522
    .line 523
    const/16 v1, 0xa

    .line 524
    .line 525
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 526
    .line 527
    .line 528
    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    check-cast p1, Lon0;

    .line 533
    .line 534
    new-instance v0, Ln7;

    .line 535
    .line 536
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-static {p2, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object p2

    .line 543
    check-cast p2, Lon0;

    .line 544
    .line 545
    new-instance v0, Ln7;

    .line 546
    .line 547
    invoke-direct {v0, v1}, Ln7;-><init>(I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {p0, p1, p2, v0}, Lv60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lv60;

    .line 551
    .line 552
    .line 553
    move-result-object p0

    .line 554
    invoke-virtual {p0}, Lv60;->e()I

    .line 555
    .line 556
    .line 557
    move-result p0

    .line 558
    return p0

    .line 559
    :pswitch_12
    check-cast p1, Ljava/util/List;

    .line 560
    .line 561
    check-cast p2, Ljava/util/List;

    .line 562
    .line 563
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    check-cast p0, Lgn0;

    .line 568
    .line 569
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    check-cast p1, Lgn0;

    .line 574
    .line 575
    iget p0, p0, Lgn0;->s:I

    .line 576
    .line 577
    iget p1, p1, Lgn0;->s:I

    .line 578
    .line 579
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 580
    .line 581
    .line 582
    move-result p0

    .line 583
    return p0

    .line 584
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 585
    .line 586
    check-cast p2, Ljava/lang/Integer;

    .line 587
    .line 588
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 589
    .line 590
    .line 591
    move-result p0

    .line 592
    if-ne p0, v0, :cond_f

    .line 593
    .line 594
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 595
    .line 596
    .line 597
    move-result p0

    .line 598
    if-ne p0, v0, :cond_11

    .line 599
    .line 600
    move v0, v2

    .line 601
    goto :goto_8

    .line 602
    :cond_f
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 603
    .line 604
    .line 605
    move-result p0

    .line 606
    if-ne p0, v0, :cond_10

    .line 607
    .line 608
    move v0, v1

    .line 609
    goto :goto_8

    .line 610
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result p0

    .line 614
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 615
    .line 616
    .line 617
    move-result p1

    .line 618
    sub-int v0, p0, p1

    .line 619
    .line 620
    :cond_11
    :goto_8
    return v0

    .line 621
    :pswitch_14
    check-cast p1, Lf00;

    .line 622
    .line 623
    check-cast p2, Lf00;

    .line 624
    .line 625
    iget p0, p2, Lf00;->b:I

    .line 626
    .line 627
    iget p1, p1, Lf00;->b:I

    .line 628
    .line 629
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 630
    .line 631
    .line 632
    move-result p0

    .line 633
    return p0

    .line 634
    :pswitch_15
    check-cast p1, Ltb1;

    .line 635
    .line 636
    check-cast p2, Ltb1;

    .line 637
    .line 638
    iget p0, p2, Ltb1;->j:I

    .line 639
    .line 640
    iget p1, p1, Ltb1;->j:I

    .line 641
    .line 642
    sub-int/2addr p0, p1

    .line 643
    return p0

    .line 644
    :pswitch_16
    check-cast p1, Lgq3;

    .line 645
    .line 646
    check-cast p2, Lgq3;

    .line 647
    .line 648
    iget p0, p2, Lgq3;->a:I

    .line 649
    .line 650
    iget p1, p1, Lgq3;->a:I

    .line 651
    .line 652
    invoke-static {p0, p1}, Lh12;->j(II)I

    .line 653
    .line 654
    .line 655
    move-result p0

    .line 656
    return p0

    .line 657
    :pswitch_17
    check-cast p1, Ljava/util/Date;

    .line 658
    .line 659
    check-cast p2, Ljava/util/Date;

    .line 660
    .line 661
    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    .line 662
    .line 663
    .line 664
    move-result p0

    .line 665
    return p0

    .line 666
    nop

    .line 667
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
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
.end method
