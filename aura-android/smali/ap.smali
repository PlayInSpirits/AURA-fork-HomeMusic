.class public final Lap;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lzo;

.field public final b:Lzo;

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lzo;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lzo;

    .line 5
    .line 6
    invoke-direct {v0}, Lzo;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lap;->b:Lzo;

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    new-instance p2, Lzo;

    .line 14
    .line 15
    invoke-direct {p2}, Lzo;-><init>()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget v1, p2, Lzo;->n:I

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v1, :cond_5

    .line 24
    .line 25
    const-string v4, "badge"

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v5, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :cond_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eq v6, v0, :cond_2

    .line 40
    .line 41
    if-ne v6, v2, :cond_1

    .line 42
    .line 43
    :cond_2
    if-ne v6, v0, :cond_4

    .line 44
    .line 45
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-static {v6, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 56
    .line 57
    .line 58
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    invoke-interface {v1}, Landroid/util/AttributeSet;->getStyleAttribute()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    :goto_0
    move-object v5, v1

    .line 64
    goto :goto_3

    .line 65
    :catch_0
    move-exception v0

    .line 66
    :goto_1
    move-object p0, v0

    .line 67
    goto :goto_2

    .line 68
    :catch_1
    move-exception v0

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    :try_start_1
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 71
    .line 72
    new-instance p1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string p2, "Must have a <"

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p2, "> start tag"

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0

    .line 98
    :cond_4
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 99
    .line 100
    const-string p1, "No start tag found"

    .line 101
    .line 102
    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 106
    :goto_2
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    .line 107
    .line 108
    new-instance p2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v0, "Can\'t load badge resource ID #0x"

    .line 111
    .line 112
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-direct {p1, p2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 130
    .line 131
    .line 132
    throw p1

    .line 133
    :cond_5
    const/4 v1, 0x0

    .line 134
    move v4, v3

    .line 135
    goto :goto_0

    .line 136
    :goto_3
    if-nez v4, :cond_6

    .line 137
    .line 138
    const v4, 0x7f140471

    .line 139
    .line 140
    .line 141
    :cond_6
    move v8, v4

    .line 142
    sget-object v6, Lht3;->c:[I

    .line 143
    .line 144
    new-array v9, v3, [I

    .line 145
    .line 146
    const v7, 0x7f040067

    .line 147
    .line 148
    .line 149
    move-object v4, p1

    .line 150
    invoke-static/range {v4 .. v9}, Luc5;->D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const/4 v5, 0x4

    .line 159
    const/4 v6, -0x1

    .line 160
    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    int-to-float v5, v5

    .line 165
    iput v5, p0, Lap;->c:F

    .line 166
    .line 167
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    const v7, 0x7f07051e

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    iput v5, p0, Lap;->i:I

    .line 179
    .line 180
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    const v7, 0x7f070521

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    iput v5, p0, Lap;->j:I

    .line 192
    .line 193
    const/16 v5, 0xe

    .line 194
    .line 195
    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    int-to-float v5, v5

    .line 200
    iput v5, p0, Lap;->d:F

    .line 201
    .line 202
    const/16 v5, 0xc

    .line 203
    .line 204
    const v7, 0x7f07037b

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimension(I)F

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    invoke-virtual {p1, v5, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    iput v5, p0, Lap;->e:F

    .line 216
    .line 217
    const/16 v5, 0x11

    .line 218
    .line 219
    const v8, 0x7f07037f

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    invoke-virtual {p1, v5, v9}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 227
    .line 228
    .line 229
    move-result v5

    .line 230
    iput v5, p0, Lap;->g:F

    .line 231
    .line 232
    const/4 v5, 0x3

    .line 233
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimension(I)F

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    invoke-virtual {p1, v5, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    iput v5, p0, Lap;->f:F

    .line 242
    .line 243
    const/16 v5, 0xd

    .line 244
    .line 245
    invoke-virtual {v1, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    invoke-virtual {p1, v5, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    iput v5, p0, Lap;->h:F

    .line 254
    .line 255
    const/16 v5, 0x18

    .line 256
    .line 257
    invoke-virtual {p1, v5, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    iput v5, p0, Lap;->k:I

    .line 262
    .line 263
    iget-object v5, p0, Lap;->b:Lzo;

    .line 264
    .line 265
    iget v7, p2, Lzo;->v:I

    .line 266
    .line 267
    const/4 v8, -0x2

    .line 268
    if-ne v7, v8, :cond_7

    .line 269
    .line 270
    const/16 v7, 0xff

    .line 271
    .line 272
    :cond_7
    iput v7, v5, Lzo;->v:I

    .line 273
    .line 274
    iget v7, p2, Lzo;->x:I

    .line 275
    .line 276
    if-eq v7, v8, :cond_8

    .line 277
    .line 278
    iput v7, v5, Lzo;->x:I

    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_8
    const/16 v5, 0x17

    .line 282
    .line 283
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    iget-object v9, p0, Lap;->b:Lzo;

    .line 288
    .line 289
    if-eqz v7, :cond_9

    .line 290
    .line 291
    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    iput v5, v9, Lzo;->x:I

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_9
    iput v6, v9, Lzo;->x:I

    .line 299
    .line 300
    :goto_4
    iget-object v5, p2, Lzo;->w:Ljava/lang/String;

    .line 301
    .line 302
    if-eqz v5, :cond_a

    .line 303
    .line 304
    iget-object v6, p0, Lap;->b:Lzo;

    .line 305
    .line 306
    iput-object v5, v6, Lzo;->w:Ljava/lang/String;

    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_a
    const/4 v5, 0x7

    .line 310
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    if-eqz v6, :cond_b

    .line 315
    .line 316
    iget-object v6, p0, Lap;->b:Lzo;

    .line 317
    .line 318
    invoke-virtual {p1, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    iput-object v5, v6, Lzo;->w:Ljava/lang/String;

    .line 323
    .line 324
    :cond_b
    :goto_5
    iget-object v5, p0, Lap;->b:Lzo;

    .line 325
    .line 326
    iget-object v6, p2, Lzo;->B:Ljava/lang/CharSequence;

    .line 327
    .line 328
    iput-object v6, v5, Lzo;->B:Ljava/lang/CharSequence;

    .line 329
    .line 330
    iget-object v6, p2, Lzo;->C:Ljava/lang/CharSequence;

    .line 331
    .line 332
    if-nez v6, :cond_c

    .line 333
    .line 334
    const v6, 0x7f130374

    .line 335
    .line 336
    .line 337
    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    :cond_c
    iput-object v6, v5, Lzo;->C:Ljava/lang/CharSequence;

    .line 342
    .line 343
    iget-object v5, p0, Lap;->b:Lzo;

    .line 344
    .line 345
    iget v6, p2, Lzo;->D:I

    .line 346
    .line 347
    if-nez v6, :cond_d

    .line 348
    .line 349
    const v6, 0x7f12000b

    .line 350
    .line 351
    .line 352
    :cond_d
    iput v6, v5, Lzo;->D:I

    .line 353
    .line 354
    iget v6, p2, Lzo;->E:I

    .line 355
    .line 356
    if-nez v6, :cond_e

    .line 357
    .line 358
    const v6, 0x7f130381

    .line 359
    .line 360
    .line 361
    :cond_e
    iput v6, v5, Lzo;->E:I

    .line 362
    .line 363
    iget-object v6, p2, Lzo;->G:Ljava/lang/Boolean;

    .line 364
    .line 365
    if-eqz v6, :cond_10

    .line 366
    .line 367
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-eqz v6, :cond_f

    .line 372
    .line 373
    goto :goto_6

    .line 374
    :cond_f
    move v6, v3

    .line 375
    goto :goto_7

    .line 376
    :cond_10
    :goto_6
    move v6, v2

    .line 377
    :goto_7
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    iput-object v6, v5, Lzo;->G:Ljava/lang/Boolean;

    .line 382
    .line 383
    iget-object v5, p0, Lap;->b:Lzo;

    .line 384
    .line 385
    iget v6, p2, Lzo;->y:I

    .line 386
    .line 387
    if-ne v6, v8, :cond_11

    .line 388
    .line 389
    const/16 v6, 0x15

    .line 390
    .line 391
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    :cond_11
    iput v6, v5, Lzo;->y:I

    .line 396
    .line 397
    iget-object v5, p0, Lap;->b:Lzo;

    .line 398
    .line 399
    iget v6, p2, Lzo;->z:I

    .line 400
    .line 401
    if-ne v6, v8, :cond_12

    .line 402
    .line 403
    const/16 v6, 0x16

    .line 404
    .line 405
    invoke-virtual {p1, v6, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    :cond_12
    iput v6, v5, Lzo;->z:I

    .line 410
    .line 411
    iget-object v5, p0, Lap;->b:Lzo;

    .line 412
    .line 413
    iget-object v6, p2, Lzo;->r:Ljava/lang/Integer;

    .line 414
    .line 415
    const v7, 0x7f1401cb

    .line 416
    .line 417
    .line 418
    if-nez v6, :cond_13

    .line 419
    .line 420
    const/4 v6, 0x5

    .line 421
    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    goto :goto_8

    .line 426
    :cond_13
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v6

    .line 430
    :goto_8
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    iput-object v6, v5, Lzo;->r:Ljava/lang/Integer;

    .line 435
    .line 436
    iget-object v5, p0, Lap;->b:Lzo;

    .line 437
    .line 438
    iget-object v6, p2, Lzo;->s:Ljava/lang/Integer;

    .line 439
    .line 440
    if-nez v6, :cond_14

    .line 441
    .line 442
    const/4 v6, 0x6

    .line 443
    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    goto :goto_9

    .line 448
    :cond_14
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 449
    .line 450
    .line 451
    move-result v6

    .line 452
    :goto_9
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    iput-object v6, v5, Lzo;->s:Ljava/lang/Integer;

    .line 457
    .line 458
    iget-object v5, p0, Lap;->b:Lzo;

    .line 459
    .line 460
    iget-object v6, p2, Lzo;->t:Ljava/lang/Integer;

    .line 461
    .line 462
    if-nez v6, :cond_15

    .line 463
    .line 464
    const/16 v6, 0xf

    .line 465
    .line 466
    invoke-virtual {p1, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    goto :goto_a

    .line 471
    :cond_15
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 472
    .line 473
    .line 474
    move-result v6

    .line 475
    :goto_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 476
    .line 477
    .line 478
    move-result-object v6

    .line 479
    iput-object v6, v5, Lzo;->t:Ljava/lang/Integer;

    .line 480
    .line 481
    iget-object v5, p0, Lap;->b:Lzo;

    .line 482
    .line 483
    iget-object v6, p2, Lzo;->u:Ljava/lang/Integer;

    .line 484
    .line 485
    if-nez v6, :cond_16

    .line 486
    .line 487
    const/16 v6, 0x10

    .line 488
    .line 489
    invoke-virtual {p1, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 490
    .line 491
    .line 492
    move-result v6

    .line 493
    goto :goto_b

    .line 494
    :cond_16
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    :goto_b
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    iput-object v6, v5, Lzo;->u:Ljava/lang/Integer;

    .line 503
    .line 504
    iget-object v5, p0, Lap;->b:Lzo;

    .line 505
    .line 506
    iget-object v6, p2, Lzo;->o:Ljava/lang/Integer;

    .line 507
    .line 508
    if-nez v6, :cond_17

    .line 509
    .line 510
    invoke-static {v4, p1, v2}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 515
    .line 516
    .line 517
    move-result v2

    .line 518
    goto :goto_c

    .line 519
    :cond_17
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    :goto_c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    iput-object v2, v5, Lzo;->o:Ljava/lang/Integer;

    .line 528
    .line 529
    iget-object v2, p0, Lap;->b:Lzo;

    .line 530
    .line 531
    iget-object v5, p2, Lzo;->q:Ljava/lang/Integer;

    .line 532
    .line 533
    if-nez v5, :cond_18

    .line 534
    .line 535
    const/16 v5, 0x8

    .line 536
    .line 537
    const v6, 0x7f14025e

    .line 538
    .line 539
    .line 540
    invoke-virtual {p1, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    goto :goto_d

    .line 545
    :cond_18
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 546
    .line 547
    .line 548
    move-result v5

    .line 549
    :goto_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    iput-object v5, v2, Lzo;->q:Ljava/lang/Integer;

    .line 554
    .line 555
    iget-object v2, p2, Lzo;->p:Ljava/lang/Integer;

    .line 556
    .line 557
    if-eqz v2, :cond_19

    .line 558
    .line 559
    iget-object v4, p0, Lap;->b:Lzo;

    .line 560
    .line 561
    iput-object v2, v4, Lzo;->p:Ljava/lang/Integer;

    .line 562
    .line 563
    goto :goto_e

    .line 564
    :cond_19
    const/16 v2, 0x9

    .line 565
    .line 566
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 567
    .line 568
    .line 569
    move-result v5

    .line 570
    iget-object v6, p0, Lap;->b:Lzo;

    .line 571
    .line 572
    if-eqz v5, :cond_1a

    .line 573
    .line 574
    invoke-static {v4, p1, v2}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 579
    .line 580
    .line 581
    move-result v2

    .line 582
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    iput-object v2, v6, Lzo;->p:Ljava/lang/Integer;

    .line 587
    .line 588
    goto :goto_e

    .line 589
    :cond_1a
    new-instance v2, Lrr4;

    .line 590
    .line 591
    iget-object v5, v6, Lzo;->q:Ljava/lang/Integer;

    .line 592
    .line 593
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    invoke-direct {v2, v4, v5}, Lrr4;-><init>(Landroid/content/Context;I)V

    .line 598
    .line 599
    .line 600
    iget-object v4, p0, Lap;->b:Lzo;

    .line 601
    .line 602
    iget-object v2, v2, Lrr4;->j:Landroid/content/res/ColorStateList;

    .line 603
    .line 604
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 605
    .line 606
    .line 607
    move-result v2

    .line 608
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    iput-object v2, v4, Lzo;->p:Ljava/lang/Integer;

    .line 613
    .line 614
    :goto_e
    iget-object v2, p0, Lap;->b:Lzo;

    .line 615
    .line 616
    iget-object v4, p2, Lzo;->F:Ljava/lang/Integer;

    .line 617
    .line 618
    if-nez v4, :cond_1b

    .line 619
    .line 620
    const v4, 0x800035

    .line 621
    .line 622
    .line 623
    invoke-virtual {p1, v0, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 624
    .line 625
    .line 626
    move-result v0

    .line 627
    goto :goto_f

    .line 628
    :cond_1b
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    :goto_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    iput-object v0, v2, Lzo;->F:Ljava/lang/Integer;

    .line 637
    .line 638
    iget-object v0, p0, Lap;->b:Lzo;

    .line 639
    .line 640
    iget-object v2, p2, Lzo;->H:Ljava/lang/Integer;

    .line 641
    .line 642
    if-nez v2, :cond_1c

    .line 643
    .line 644
    const v2, 0x7f07051f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 648
    .line 649
    .line 650
    move-result v2

    .line 651
    const/16 v4, 0xb

    .line 652
    .line 653
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 654
    .line 655
    .line 656
    move-result v2

    .line 657
    goto :goto_10

    .line 658
    :cond_1c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    :goto_10
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    iput-object v2, v0, Lzo;->H:Ljava/lang/Integer;

    .line 667
    .line 668
    iget-object v0, p0, Lap;->b:Lzo;

    .line 669
    .line 670
    iget-object v2, p2, Lzo;->I:Ljava/lang/Integer;

    .line 671
    .line 672
    if-nez v2, :cond_1d

    .line 673
    .line 674
    const v2, 0x7f070381

    .line 675
    .line 676
    .line 677
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    const/16 v2, 0xa

    .line 682
    .line 683
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    goto :goto_11

    .line 688
    :cond_1d
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 689
    .line 690
    .line 691
    move-result v1

    .line 692
    :goto_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    iput-object v1, v0, Lzo;->I:Ljava/lang/Integer;

    .line 697
    .line 698
    iget-object v0, p0, Lap;->b:Lzo;

    .line 699
    .line 700
    iget-object v1, p2, Lzo;->J:Ljava/lang/Integer;

    .line 701
    .line 702
    if-nez v1, :cond_1e

    .line 703
    .line 704
    const/16 v1, 0x12

    .line 705
    .line 706
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    goto :goto_12

    .line 711
    :cond_1e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    :goto_12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    iput-object v1, v0, Lzo;->J:Ljava/lang/Integer;

    .line 720
    .line 721
    iget-object v0, p0, Lap;->b:Lzo;

    .line 722
    .line 723
    iget-object v1, p2, Lzo;->K:Ljava/lang/Integer;

    .line 724
    .line 725
    if-nez v1, :cond_1f

    .line 726
    .line 727
    const/16 v1, 0x19

    .line 728
    .line 729
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 730
    .line 731
    .line 732
    move-result v1

    .line 733
    goto :goto_13

    .line 734
    :cond_1f
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    :goto_13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    iput-object v1, v0, Lzo;->K:Ljava/lang/Integer;

    .line 743
    .line 744
    iget-object v0, p0, Lap;->b:Lzo;

    .line 745
    .line 746
    iget-object v1, p2, Lzo;->L:Ljava/lang/Integer;

    .line 747
    .line 748
    if-nez v1, :cond_20

    .line 749
    .line 750
    iget-object v1, v0, Lzo;->J:Ljava/lang/Integer;

    .line 751
    .line 752
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    const/16 v2, 0x13

    .line 757
    .line 758
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    goto :goto_14

    .line 763
    :cond_20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    :goto_14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    iput-object v1, v0, Lzo;->L:Ljava/lang/Integer;

    .line 772
    .line 773
    iget-object v0, p0, Lap;->b:Lzo;

    .line 774
    .line 775
    iget-object v1, p2, Lzo;->M:Ljava/lang/Integer;

    .line 776
    .line 777
    if-nez v1, :cond_21

    .line 778
    .line 779
    iget-object v1, v0, Lzo;->K:Ljava/lang/Integer;

    .line 780
    .line 781
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 782
    .line 783
    .line 784
    move-result v1

    .line 785
    const/16 v2, 0x1a

    .line 786
    .line 787
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 788
    .line 789
    .line 790
    move-result v1

    .line 791
    goto :goto_15

    .line 792
    :cond_21
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    :goto_15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 797
    .line 798
    .line 799
    move-result-object v1

    .line 800
    iput-object v1, v0, Lzo;->M:Ljava/lang/Integer;

    .line 801
    .line 802
    iget-object v0, p0, Lap;->b:Lzo;

    .line 803
    .line 804
    iget-object v1, p2, Lzo;->P:Ljava/lang/Integer;

    .line 805
    .line 806
    if-nez v1, :cond_22

    .line 807
    .line 808
    const/16 v1, 0x14

    .line 809
    .line 810
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    goto :goto_16

    .line 815
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 816
    .line 817
    .line 818
    move-result v1

    .line 819
    :goto_16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    iput-object v1, v0, Lzo;->P:Ljava/lang/Integer;

    .line 824
    .line 825
    iget-object v0, p0, Lap;->b:Lzo;

    .line 826
    .line 827
    iget-object v1, p2, Lzo;->N:Ljava/lang/Integer;

    .line 828
    .line 829
    if-nez v1, :cond_23

    .line 830
    .line 831
    move v1, v3

    .line 832
    goto :goto_17

    .line 833
    :cond_23
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 834
    .line 835
    .line 836
    move-result v1

    .line 837
    :goto_17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    iput-object v1, v0, Lzo;->N:Ljava/lang/Integer;

    .line 842
    .line 843
    iget-object v0, p0, Lap;->b:Lzo;

    .line 844
    .line 845
    iget-object v1, p2, Lzo;->O:Ljava/lang/Integer;

    .line 846
    .line 847
    if-nez v1, :cond_24

    .line 848
    .line 849
    move v1, v3

    .line 850
    goto :goto_18

    .line 851
    :cond_24
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 852
    .line 853
    .line 854
    move-result v1

    .line 855
    :goto_18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 856
    .line 857
    .line 858
    move-result-object v1

    .line 859
    iput-object v1, v0, Lzo;->O:Ljava/lang/Integer;

    .line 860
    .line 861
    iget-object v0, p0, Lap;->b:Lzo;

    .line 862
    .line 863
    iget-object v1, p2, Lzo;->Q:Ljava/lang/Boolean;

    .line 864
    .line 865
    if-nez v1, :cond_25

    .line 866
    .line 867
    invoke-virtual {p1, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 868
    .line 869
    .line 870
    move-result v1

    .line 871
    goto :goto_19

    .line 872
    :cond_25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    :goto_19
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 877
    .line 878
    .line 879
    move-result-object v1

    .line 880
    iput-object v1, v0, Lzo;->Q:Ljava/lang/Boolean;

    .line 881
    .line 882
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 883
    .line 884
    .line 885
    iget-object p1, p2, Lzo;->A:Ljava/util/Locale;

    .line 886
    .line 887
    iget-object v0, p0, Lap;->b:Lzo;

    .line 888
    .line 889
    if-nez p1, :cond_26

    .line 890
    .line 891
    sget-object p1, Ljava/util/Locale$Category;->FORMAT:Ljava/util/Locale$Category;

    .line 892
    .line 893
    invoke-static {p1}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 894
    .line 895
    .line 896
    move-result-object p1

    .line 897
    iput-object p1, v0, Lzo;->A:Ljava/util/Locale;

    .line 898
    .line 899
    goto :goto_1a

    .line 900
    :cond_26
    iput-object p1, v0, Lzo;->A:Ljava/util/Locale;

    .line 901
    .line 902
    :goto_1a
    iput-object p2, p0, Lap;->a:Lzo;

    .line 903
    .line 904
    return-void
.end method
