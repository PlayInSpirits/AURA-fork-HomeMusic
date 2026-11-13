.class public final Ldefpackage/on0;
.super Ldefpackage/nn0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final A:I

.field public final B:I

.field public final C:I

.field public final D:Z

.field public final E:I

.field public final F:Z

.field public final G:I

.field public final H:Z

.field public final I:Z

.field public final J:I

.field public final r:Z

.field public final s:Ldefpackage/jn0;

.field public final t:Z

.field public final u:Z

.field public final v:Z

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(ILdefpackage/sv4;ILdefpackage/jn0;ILjava/lang/String;IZ)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ldefpackage/nn0;-><init>(ILdefpackage/sv4;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Ldefpackage/on0;->s:Ldefpackage/jn0;

    .line 5
    .line 6
    iget-boolean p1, p4, Ldefpackage/jn0;->x0:Z

    .line 7
    .line 8
    iget-object p2, p4, Ldefpackage/cw4;->m:Ldefpackage/yw1;

    .line 9
    .line 10
    iget-object p3, p4, Ldefpackage/cw4;->o:Ldefpackage/yw1;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/16 p1, 0x18

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 p1, 0x10

    .line 18
    .line 19
    :goto_0
    const/4 p7, 0x0

    .line 20
    iput-boolean p7, p0, Ldefpackage/on0;->F:Z

    .line 21
    .line 22
    const/high16 v0, -0x40800000    # -1.0f

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    const/4 v2, 0x1

    .line 26
    if-eqz p8, :cond_5

    .line 27
    .line 28
    iget-object v3, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 29
    .line 30
    iget v4, v3, Ldefpackage/tb1;->u:I

    .line 31
    .line 32
    if-eq v4, v1, :cond_1

    .line 33
    .line 34
    iget v5, p4, Ldefpackage/cw4;->a:I

    .line 35
    .line 36
    if-gt v4, v5, :cond_5

    .line 37
    .line 38
    :cond_1
    iget v4, v3, Ldefpackage/tb1;->v:I

    .line 39
    .line 40
    if-eq v4, v1, :cond_2

    .line 41
    .line 42
    iget v5, p4, Ldefpackage/cw4;->b:I

    .line 43
    .line 44
    if-gt v4, v5, :cond_5

    .line 45
    .line 46
    :cond_2
    iget v4, v3, Ldefpackage/tb1;->y:F

    .line 47
    .line 48
    cmpl-float v5, v4, v0

    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    iget v5, p4, Ldefpackage/cw4;->c:I

    .line 53
    .line 54
    int-to-float v5, v5

    .line 55
    cmpg-float v4, v4, v5

    .line 56
    .line 57
    if-gtz v4, :cond_5

    .line 58
    .line 59
    :cond_3
    iget v3, v3, Ldefpackage/tb1;->j:I

    .line 60
    .line 61
    if-eq v3, v1, :cond_4

    .line 62
    .line 63
    iget v4, p4, Ldefpackage/cw4;->d:I

    .line 64
    .line 65
    if-gt v3, v4, :cond_5

    .line 66
    .line 67
    :cond_4
    move v3, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_5
    move v3, p7

    .line 70
    :goto_1
    iput-boolean v3, p0, Ldefpackage/on0;->r:Z

    .line 71
    .line 72
    if-eqz p8, :cond_a

    .line 73
    .line 74
    iget-object p8, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 75
    .line 76
    iget v3, p8, Ldefpackage/tb1;->u:I

    .line 77
    .line 78
    if-eq v3, v1, :cond_6

    .line 79
    .line 80
    iget v4, p4, Ldefpackage/cw4;->e:I

    .line 81
    .line 82
    if-lt v3, v4, :cond_a

    .line 83
    .line 84
    :cond_6
    iget v3, p8, Ldefpackage/tb1;->v:I

    .line 85
    .line 86
    if-eq v3, v1, :cond_7

    .line 87
    .line 88
    iget v4, p4, Ldefpackage/cw4;->f:I

    .line 89
    .line 90
    if-lt v3, v4, :cond_a

    .line 91
    .line 92
    :cond_7
    iget v3, p8, Ldefpackage/tb1;->y:F

    .line 93
    .line 94
    cmpl-float v4, v3, v0

    .line 95
    .line 96
    if-eqz v4, :cond_8

    .line 97
    .line 98
    iget v4, p4, Ldefpackage/cw4;->g:I

    .line 99
    .line 100
    int-to-float v4, v4

    .line 101
    cmpl-float v3, v3, v4

    .line 102
    .line 103
    if-ltz v3, :cond_a

    .line 104
    .line 105
    :cond_8
    iget p8, p8, Ldefpackage/tb1;->j:I

    .line 106
    .line 107
    if-eq p8, v1, :cond_9

    .line 108
    .line 109
    iget v3, p4, Ldefpackage/cw4;->h:I

    .line 110
    .line 111
    if-lt p8, v3, :cond_a

    .line 112
    .line 113
    :cond_9
    move p8, v2

    .line 114
    goto :goto_2

    .line 115
    :cond_a
    move p8, p7

    .line 116
    :goto_2
    iput-boolean p8, p0, Ldefpackage/on0;->t:Z

    .line 117
    .line 118
    invoke-static {p5, p7}, Ldefpackage/kq;->n(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result p8

    .line 122
    iput-boolean p8, p0, Ldefpackage/on0;->u:Z

    .line 123
    .line 124
    iget-object p8, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 125
    .line 126
    iget v3, p8, Ldefpackage/tb1;->y:F

    .line 127
    .line 128
    cmpl-float v0, v3, v0

    .line 129
    .line 130
    if-eqz v0, :cond_b

    .line 131
    .line 132
    const/high16 v0, 0x41200000    # 10.0f

    .line 133
    .line 134
    cmpl-float v0, v3, v0

    .line 135
    .line 136
    if-ltz v0, :cond_b

    .line 137
    .line 138
    move v0, v2

    .line 139
    goto :goto_3

    .line 140
    :cond_b
    move v0, p7

    .line 141
    :goto_3
    iput-boolean v0, p0, Ldefpackage/on0;->v:Z

    .line 142
    .line 143
    iget v0, p8, Ldefpackage/tb1;->j:I

    .line 144
    .line 145
    iput v0, p0, Ldefpackage/on0;->w:I

    .line 146
    .line 147
    iget v0, p8, Ldefpackage/tb1;->u:I

    .line 148
    .line 149
    if-eq v0, v1, :cond_d

    .line 150
    .line 151
    iget p8, p8, Ldefpackage/tb1;->v:I

    .line 152
    .line 153
    if-ne p8, v1, :cond_c

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_c
    mul-int/2addr v0, p8

    .line 157
    goto :goto_5

    .line 158
    :cond_d
    :goto_4
    move v0, v1

    .line 159
    :goto_5
    iput v0, p0, Ldefpackage/on0;->x:I

    .line 160
    .line 161
    move p8, p7

    .line 162
    :goto_6
    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    const v3, 0x7fffffff

    .line 167
    .line 168
    .line 169
    if-ge p8, v0, :cond_f

    .line 170
    .line 171
    iget-object v0, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 172
    .line 173
    invoke-interface {p3, p8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v0, v4, p7}, Ldefpackage/pn0;->c(Ldefpackage/tb1;Ljava/lang/String;Z)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-lez v0, :cond_e

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_e
    add-int/lit8 p8, p8, 0x1

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_f
    move v0, p7

    .line 190
    move p8, v3

    .line 191
    :goto_7
    iput p8, p0, Ldefpackage/on0;->z:I

    .line 192
    .line 193
    iput v0, p0, Ldefpackage/on0;->A:I

    .line 194
    .line 195
    iget-object p3, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 196
    .line 197
    iget p3, p3, Ldefpackage/tb1;->f:I

    .line 198
    .line 199
    iget p8, p4, Ldefpackage/cw4;->p:I

    .line 200
    .line 201
    sget-object v0, Ldefpackage/pn0;->k:Ldefpackage/gb3;

    .line 202
    .line 203
    if-eqz p3, :cond_10

    .line 204
    .line 205
    if-ne p3, p8, :cond_10

    .line 206
    .line 207
    move p3, v3

    .line 208
    goto :goto_8

    .line 209
    :cond_10
    and-int/2addr p3, p8

    .line 210
    invoke-static {p3}, Ljava/lang/Integer;->bitCount(I)I

    .line 211
    .line 212
    .line 213
    move-result p3

    .line 214
    :goto_8
    iput p3, p0, Ldefpackage/on0;->B:I

    .line 215
    .line 216
    iget-object p3, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 217
    .line 218
    iget p3, p3, Ldefpackage/tb1;->f:I

    .line 219
    .line 220
    if-eqz p3, :cond_12

    .line 221
    .line 222
    and-int/2addr p3, v2

    .line 223
    if-eqz p3, :cond_11

    .line 224
    .line 225
    goto :goto_9

    .line 226
    :cond_11
    move p3, p7

    .line 227
    goto :goto_a

    .line 228
    :cond_12
    :goto_9
    move p3, v2

    .line 229
    :goto_a
    iput-boolean p3, p0, Ldefpackage/on0;->D:Z

    .line 230
    .line 231
    invoke-static {p6}, Ldefpackage/pn0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    if-nez p3, :cond_13

    .line 236
    .line 237
    move p3, v2

    .line 238
    goto :goto_b

    .line 239
    :cond_13
    move p3, p7

    .line 240
    :goto_b
    iget-object p8, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 241
    .line 242
    invoke-static {p8, p6, p3}, Ldefpackage/pn0;->c(Ldefpackage/tb1;Ljava/lang/String;Z)I

    .line 243
    .line 244
    .line 245
    move-result p3

    .line 246
    iput p3, p0, Ldefpackage/on0;->E:I

    .line 247
    .line 248
    move p3, p7

    .line 249
    :goto_c
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    .line 250
    .line 251
    .line 252
    move-result p6

    .line 253
    if-ge p3, p6, :cond_15

    .line 254
    .line 255
    iget-object p6, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 256
    .line 257
    iget-object p6, p6, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 258
    .line 259
    if-eqz p6, :cond_14

    .line 260
    .line 261
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p8

    .line 265
    invoke-virtual {p6, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result p6

    .line 269
    if-eqz p6, :cond_14

    .line 270
    .line 271
    move v3, p3

    .line 272
    goto :goto_d

    .line 273
    :cond_14
    add-int/lit8 p3, p3, 0x1

    .line 274
    .line 275
    goto :goto_c

    .line 276
    :cond_15
    :goto_d
    iput v3, p0, Ldefpackage/on0;->y:I

    .line 277
    .line 278
    iget-object p2, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 279
    .line 280
    iget-object p3, p4, Ldefpackage/cw4;->n:Ldefpackage/yw1;

    .line 281
    .line 282
    invoke-static {p2, p3}, Ldefpackage/pn0;->a(Ldefpackage/tb1;Ldefpackage/yw1;)I

    .line 283
    .line 284
    .line 285
    move-result p2

    .line 286
    iput p2, p0, Ldefpackage/on0;->C:I

    .line 287
    .line 288
    and-int/lit16 p2, p5, 0x180

    .line 289
    .line 290
    const/16 p3, 0x80

    .line 291
    .line 292
    if-ne p2, p3, :cond_16

    .line 293
    .line 294
    move p2, v2

    .line 295
    goto :goto_e

    .line 296
    :cond_16
    move p2, p7

    .line 297
    :goto_e
    iput-boolean p2, p0, Ldefpackage/on0;->H:Z

    .line 298
    .line 299
    and-int/lit8 p2, p5, 0x40

    .line 300
    .line 301
    const/16 p3, 0x40

    .line 302
    .line 303
    if-ne p2, p3, :cond_17

    .line 304
    .line 305
    move p2, v2

    .line 306
    goto :goto_f

    .line 307
    :cond_17
    move p2, p7

    .line 308
    :goto_f
    iput-boolean p2, p0, Ldefpackage/on0;->I:Z

    .line 309
    .line 310
    iget-object p2, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 311
    .line 312
    iget-object p3, p2, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 313
    .line 314
    const/4 p4, 0x2

    .line 315
    if-nez p3, :cond_18

    .line 316
    .line 317
    goto :goto_12

    .line 318
    :cond_18
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 319
    .line 320
    .line 321
    move-result p6

    .line 322
    const/4 p8, 0x4

    .line 323
    const/4 v0, 0x3

    .line 324
    sparse-switch p6, :sswitch_data_0

    .line 325
    .line 326
    .line 327
    :goto_10
    move p3, v1

    .line 328
    goto :goto_11

    .line 329
    :sswitch_0
    const-string p6, "video/x-vnd.on2.vp9"

    .line 330
    .line 331
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p3

    .line 335
    if-nez p3, :cond_19

    .line 336
    .line 337
    goto :goto_10

    .line 338
    :cond_19
    move p3, p8

    .line 339
    goto :goto_11

    .line 340
    :sswitch_1
    const-string p6, "video/avc"

    .line 341
    .line 342
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result p3

    .line 346
    if-nez p3, :cond_1a

    .line 347
    .line 348
    goto :goto_10

    .line 349
    :cond_1a
    move p3, v0

    .line 350
    goto :goto_11

    .line 351
    :sswitch_2
    const-string p6, "video/hevc"

    .line 352
    .line 353
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result p3

    .line 357
    if-nez p3, :cond_1b

    .line 358
    .line 359
    goto :goto_10

    .line 360
    :cond_1b
    move p3, p4

    .line 361
    goto :goto_11

    .line 362
    :sswitch_3
    const-string p6, "video/av01"

    .line 363
    .line 364
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result p3

    .line 368
    if-nez p3, :cond_1c

    .line 369
    .line 370
    goto :goto_10

    .line 371
    :cond_1c
    move p3, v2

    .line 372
    goto :goto_11

    .line 373
    :sswitch_4
    const-string p6, "video/dolby-vision"

    .line 374
    .line 375
    invoke-virtual {p3, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p3

    .line 379
    if-nez p3, :cond_1d

    .line 380
    .line 381
    goto :goto_10

    .line 382
    :cond_1d
    move p3, p7

    .line 383
    :goto_11
    packed-switch p3, :pswitch_data_0

    .line 384
    .line 385
    .line 386
    :goto_12
    move p8, p7

    .line 387
    goto :goto_13

    .line 388
    :pswitch_0
    move p8, p4

    .line 389
    goto :goto_13

    .line 390
    :pswitch_1
    move p8, v2

    .line 391
    goto :goto_13

    .line 392
    :pswitch_2
    move p8, v0

    .line 393
    goto :goto_13

    .line 394
    :pswitch_3
    const/4 p8, 0x5

    .line 395
    :goto_13
    :pswitch_4
    iput p8, p0, Ldefpackage/on0;->J:I

    .line 396
    .line 397
    iget-boolean p3, p0, Ldefpackage/on0;->r:Z

    .line 398
    .line 399
    iget-object p6, p0, Ldefpackage/on0;->s:Ldefpackage/jn0;

    .line 400
    .line 401
    iget p8, p2, Ldefpackage/tb1;->f:I

    .line 402
    .line 403
    and-int/lit16 p8, p8, 0x4000

    .line 404
    .line 405
    if-eqz p8, :cond_1e

    .line 406
    .line 407
    goto :goto_14

    .line 408
    :cond_1e
    iget-boolean p8, p6, Ldefpackage/jn0;->B0:Z

    .line 409
    .line 410
    invoke-static {p5, p8}, Ldefpackage/kq;->n(IZ)Z

    .line 411
    .line 412
    .line 413
    move-result p8

    .line 414
    if-nez p8, :cond_1f

    .line 415
    .line 416
    goto :goto_14

    .line 417
    :cond_1f
    if-nez p3, :cond_20

    .line 418
    .line 419
    iget-boolean p8, p6, Ldefpackage/jn0;->w0:Z

    .line 420
    .line 421
    if-nez p8, :cond_20

    .line 422
    .line 423
    goto :goto_14

    .line 424
    :cond_20
    invoke-static {p5, p7}, Ldefpackage/kq;->n(IZ)Z

    .line 425
    .line 426
    .line 427
    move-result p7

    .line 428
    if-eqz p7, :cond_21

    .line 429
    .line 430
    iget-boolean p7, p0, Ldefpackage/on0;->t:Z

    .line 431
    .line 432
    if-eqz p7, :cond_21

    .line 433
    .line 434
    if-eqz p3, :cond_21

    .line 435
    .line 436
    iget p2, p2, Ldefpackage/tb1;->j:I

    .line 437
    .line 438
    if-eq p2, v1, :cond_21

    .line 439
    .line 440
    iget-boolean p2, p6, Ldefpackage/cw4;->G:Z

    .line 441
    .line 442
    if-nez p2, :cond_21

    .line 443
    .line 444
    iget-boolean p2, p6, Ldefpackage/cw4;->F:Z

    .line 445
    .line 446
    if-nez p2, :cond_21

    .line 447
    .line 448
    and-int/2addr p1, p5

    .line 449
    if-eqz p1, :cond_21

    .line 450
    .line 451
    move p7, p4

    .line 452
    goto :goto_14

    .line 453
    :cond_21
    move p7, v2

    .line 454
    :goto_14
    iput p7, p0, Ldefpackage/on0;->G:I

    .line 455
    .line 456
    return-void

    .line 457
    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Ldefpackage/on0;Ldefpackage/on0;)I
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/on0;->u:Z

    .line 2
    .line 3
    iget-boolean v1, p1, Ldefpackage/on0;->u:Z

    .line 4
    .line 5
    sget-object v2, Ldefpackage/v60;->a:Ldefpackage/t60;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Ldefpackage/t60;->c(ZZ)Ldefpackage/v60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Ldefpackage/on0;->z:I

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget v2, p1, Ldefpackage/on0;->z:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, Ldefpackage/x13;->p:Ldefpackage/x13;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/v60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ldefpackage/v60;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget v1, p0, Ldefpackage/on0;->A:I

    .line 30
    .line 31
    iget v2, p1, Ldefpackage/on0;->A:I

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->a(II)Ldefpackage/v60;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v1, p0, Ldefpackage/on0;->B:I

    .line 38
    .line 39
    iget v2, p1, Ldefpackage/on0;->B:I

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->a(II)Ldefpackage/v60;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v1, p0, Ldefpackage/on0;->C:I

    .line 46
    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget v2, p1, Ldefpackage/on0;->C:I

    .line 52
    .line 53
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/v60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ldefpackage/v60;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-boolean v1, p0, Ldefpackage/on0;->D:Z

    .line 62
    .line 63
    iget-boolean v2, p1, Ldefpackage/on0;->D:Z

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget v1, p0, Ldefpackage/on0;->E:I

    .line 70
    .line 71
    iget v2, p1, Ldefpackage/on0;->E:I

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->a(II)Ldefpackage/v60;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-boolean v1, p0, Ldefpackage/on0;->v:Z

    .line 78
    .line 79
    iget-boolean v2, p1, Ldefpackage/on0;->v:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-boolean v1, p0, Ldefpackage/on0;->r:Z

    .line 86
    .line 87
    iget-boolean v2, p1, Ldefpackage/on0;->r:Z

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-boolean v1, p0, Ldefpackage/on0;->t:Z

    .line 94
    .line 95
    iget-boolean v2, p1, Ldefpackage/on0;->t:Z

    .line 96
    .line 97
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v1, p0, Ldefpackage/on0;->y:I

    .line 102
    .line 103
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget v2, p1, Ldefpackage/on0;->y:I

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v0, v1, v2, v3}, Ldefpackage/v60;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ldefpackage/v60;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-boolean v1, p0, Ldefpackage/on0;->H:Z

    .line 118
    .line 119
    iget-boolean v2, p1, Ldefpackage/on0;->H:Z

    .line 120
    .line 121
    invoke-virtual {v0, v1, v2}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iget-boolean v2, p0, Ldefpackage/on0;->I:Z

    .line 126
    .line 127
    iget-boolean v3, p1, Ldefpackage/on0;->I:Z

    .line 128
    .line 129
    invoke-virtual {v0, v2, v3}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-eqz v1, :cond_0

    .line 134
    .line 135
    if-eqz v2, :cond_0

    .line 136
    .line 137
    iget p0, p0, Ldefpackage/on0;->J:I

    .line 138
    .line 139
    iget p1, p1, Ldefpackage/on0;->J:I

    .line 140
    .line 141
    invoke-virtual {v0, p0, p1}, Ldefpackage/v60;->a(II)Ldefpackage/v60;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :cond_0
    invoke-virtual {v0}, Ldefpackage/v60;->e()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    return p0
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/on0;->G:I

    .line 2
    .line 3
    return p0
.end method

.method public final b(Ldefpackage/nn0;)Z
    .locals 2

    .line 1
    check-cast p1, Ldefpackage/on0;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/on0;->F:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 8
    .line 9
    iget-object v0, v0, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p1, Ldefpackage/nn0;->q:Ldefpackage/tb1;

    .line 12
    .line 13
    iget-object v1, v1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Ldefpackage/on0;->s:Ldefpackage/jn0;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p0, Ldefpackage/on0;->H:Z

    .line 27
    .line 28
    iget-boolean v1, p1, Ldefpackage/on0;->H:Z

    .line 29
    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    iget-boolean p0, p0, Ldefpackage/on0;->I:Z

    .line 33
    .line 34
    iget-boolean p1, p1, Ldefpackage/on0;->I:Z

    .line 35
    .line 36
    if-ne p0, p1, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method
