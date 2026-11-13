.class public final Ldefpackage/w23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ldefpackage/u43;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/w23;->c:Ljava/lang/ThreadLocal;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldefpackage/u43;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/w23;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/w23;->b:Ldefpackage/u43;

    .line 10
    .line 11
    return-void
.end method

.method public static c(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Ldefpackage/z13;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    sget-object v4, Ldefpackage/w23;->c:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    check-cast v5, Landroid/util/TypedValue;

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    new-instance v5, Landroid/util/TypedValue;

    .line 20
    .line 21
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    const/4 v4, 0x2

    .line 28
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const-string v7, "boolean"

    .line 33
    .line 34
    const-string v8, "integer"

    .line 35
    .line 36
    const-string v9, "float"

    .line 37
    .line 38
    const-class v10, Ljava/io/Serializable;

    .line 39
    .line 40
    const-class v11, Landroid/os/Parcelable;

    .line 41
    .line 42
    sget-object v12, Ldefpackage/h33;->c:Ldefpackage/b33;

    .line 43
    .line 44
    sget-object v13, Ldefpackage/h33;->j:Ldefpackage/a33;

    .line 45
    .line 46
    sget-object v14, Ldefpackage/h33;->p:Ldefpackage/a33;

    .line 47
    .line 48
    sget-object v15, Ldefpackage/h33;->m:Ldefpackage/a33;

    .line 49
    .line 50
    sget-object v16, Ldefpackage/h33;->g:Ldefpackage/a33;

    .line 51
    .line 52
    sget-object v17, Ldefpackage/h33;->d:Ldefpackage/a33;

    .line 53
    .line 54
    move/from16 v18, v4

    .line 55
    .line 56
    sget-object v4, Ldefpackage/h33;->f:Ldefpackage/b33;

    .line 57
    .line 58
    sget-object v1, Ldefpackage/h33;->o:Ldefpackage/b33;

    .line 59
    .line 60
    sget-object v2, Ldefpackage/h33;->l:Ldefpackage/b33;

    .line 61
    .line 62
    move-object/from16 v20, v13

    .line 63
    .line 64
    sget-object v13, Ldefpackage/h33;->i:Ldefpackage/b33;

    .line 65
    .line 66
    move-object/from16 v21, v14

    .line 67
    .line 68
    sget-object v14, Ldefpackage/h33;->b:Ldefpackage/b33;

    .line 69
    .line 70
    const/16 v22, 0x0

    .line 71
    .line 72
    if-eqz v6, :cond_1a

    .line 73
    .line 74
    move-object/from16 v23, v15

    .line 75
    .line 76
    invoke-virtual/range {p1 .. p2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    move/from16 v24, v3

    .line 81
    .line 82
    const-string v3, " is not Serializable or Parcelable."

    .line 83
    .line 84
    invoke-virtual {v8, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v25

    .line 88
    if-eqz v25, :cond_1

    .line 89
    .line 90
    move-object/from16 v26, v2

    .line 91
    .line 92
    move-object/from16 v25, v4

    .line 93
    .line 94
    move-object v3, v14

    .line 95
    goto/16 :goto_6

    .line 96
    .line 97
    :cond_1
    move-object/from16 v25, v4

    .line 98
    .line 99
    const-string v4, "integer[]"

    .line 100
    .line 101
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_2

    .line 106
    .line 107
    move-object/from16 v26, v2

    .line 108
    .line 109
    move-object/from16 v3, v17

    .line 110
    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_2
    const-string v4, "List<Int>"

    .line 114
    .line 115
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_3

    .line 120
    .line 121
    sget-object v3, Ldefpackage/h33;->e:Ldefpackage/a33;

    .line 122
    .line 123
    :goto_0
    move-object/from16 v26, v2

    .line 124
    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :cond_3
    const-string v4, "long"

    .line 128
    .line 129
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_4

    .line 134
    .line 135
    move-object/from16 v26, v2

    .line 136
    .line 137
    move-object/from16 v3, v25

    .line 138
    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_4
    const-string v4, "long[]"

    .line 142
    .line 143
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-eqz v4, :cond_5

    .line 148
    .line 149
    move-object/from16 v26, v2

    .line 150
    .line 151
    move-object/from16 v3, v16

    .line 152
    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :cond_5
    const-string v4, "List<Long>"

    .line 156
    .line 157
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_6

    .line 162
    .line 163
    sget-object v3, Ldefpackage/h33;->h:Ldefpackage/a33;

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_6
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_7

    .line 171
    .line 172
    move-object v3, v2

    .line 173
    move-object/from16 v26, v3

    .line 174
    .line 175
    goto/16 :goto_6

    .line 176
    .line 177
    :cond_7
    const-string v4, "boolean[]"

    .line 178
    .line 179
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-eqz v4, :cond_8

    .line 184
    .line 185
    move-object/from16 v26, v2

    .line 186
    .line 187
    move-object/from16 v3, v23

    .line 188
    .line 189
    goto/16 :goto_6

    .line 190
    .line 191
    :cond_8
    const-string v4, "List<Boolean>"

    .line 192
    .line 193
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_9

    .line 198
    .line 199
    sget-object v3, Ldefpackage/h33;->n:Ldefpackage/a33;

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_9
    const-string v4, "string"

    .line 203
    .line 204
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_a

    .line 209
    .line 210
    :goto_1
    move-object v3, v1

    .line 211
    goto :goto_0

    .line 212
    :cond_a
    const-string v4, "string[]"

    .line 213
    .line 214
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v4

    .line 218
    if-eqz v4, :cond_b

    .line 219
    .line 220
    move-object/from16 v26, v2

    .line 221
    .line 222
    move-object/from16 v3, v21

    .line 223
    .line 224
    goto/16 :goto_6

    .line 225
    .line 226
    :cond_b
    const-string v4, "List<String>"

    .line 227
    .line 228
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_c

    .line 233
    .line 234
    sget-object v3, Ldefpackage/h33;->q:Ldefpackage/a33;

    .line 235
    .line 236
    goto :goto_0

    .line 237
    :cond_c
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_d

    .line 242
    .line 243
    move-object/from16 v26, v2

    .line 244
    .line 245
    move-object v3, v13

    .line 246
    goto/16 :goto_6

    .line 247
    .line 248
    :cond_d
    const-string v4, "float[]"

    .line 249
    .line 250
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    if-eqz v4, :cond_e

    .line 255
    .line 256
    move-object/from16 v26, v2

    .line 257
    .line 258
    move-object/from16 v3, v20

    .line 259
    .line 260
    goto/16 :goto_6

    .line 261
    .line 262
    :cond_e
    const-string v4, "List<Float>"

    .line 263
    .line 264
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-eqz v4, :cond_f

    .line 269
    .line 270
    sget-object v3, Ldefpackage/h33;->k:Ldefpackage/a33;

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_f
    const-string v4, "reference"

    .line 275
    .line 276
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    if-eqz v4, :cond_10

    .line 281
    .line 282
    move-object/from16 v26, v2

    .line 283
    .line 284
    move-object v3, v12

    .line 285
    goto/16 :goto_6

    .line 286
    .line 287
    :cond_10
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-nez v4, :cond_11

    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_11
    :try_start_0
    const-string v4, "."

    .line 295
    .line 296
    move-object/from16 v26, v2

    .line 297
    .line 298
    const/4 v2, 0x0

    .line 299
    invoke-static {v6, v4, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_12

    .line 304
    .line 305
    if-eqz v15, :cond_12

    .line 306
    .line 307
    invoke-virtual {v15, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    goto :goto_2

    .line 312
    :catch_0
    move-exception v0

    .line 313
    goto/16 :goto_5

    .line 314
    .line 315
    :cond_12
    move-object v2, v6

    .line 316
    :goto_2
    const-string v4, "[]"

    .line 317
    .line 318
    const/4 v15, 0x0

    .line 319
    invoke-static {v6, v4, v15}, Ldefpackage/xm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 320
    .line 321
    .line 322
    move-result v4

    .line 323
    if-eqz v4, :cond_13

    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 326
    .line 327
    .line 328
    move-result v19

    .line 329
    move/from16 p2, v4

    .line 330
    .line 331
    add-int/lit8 v4, v19, -0x2

    .line 332
    .line 333
    invoke-virtual {v2, v15, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    goto :goto_3

    .line 338
    :cond_13
    move/from16 p2, v4

    .line 339
    .line 340
    :goto_3
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 345
    .line 346
    .line 347
    move-result v18

    .line 348
    if-eqz v18, :cond_15

    .line 349
    .line 350
    if-eqz p2, :cond_14

    .line 351
    .line 352
    new-instance v15, Ldefpackage/d33;

    .line 353
    .line 354
    invoke-direct {v15, v4}, Ldefpackage/d33;-><init>(Ljava/lang/Class;)V

    .line 355
    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_14
    new-instance v15, Ldefpackage/e33;

    .line 359
    .line 360
    invoke-direct {v15, v4}, Ldefpackage/e33;-><init>(Ljava/lang/Class;)V

    .line 361
    .line 362
    .line 363
    goto :goto_4

    .line 364
    :cond_15
    const-class v15, Ljava/lang/Enum;

    .line 365
    .line 366
    invoke-virtual {v15, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 367
    .line 368
    .line 369
    move-result v15

    .line 370
    if-eqz v15, :cond_16

    .line 371
    .line 372
    if-nez p2, :cond_16

    .line 373
    .line 374
    new-instance v15, Ldefpackage/c33;

    .line 375
    .line 376
    invoke-direct {v15, v4}, Ldefpackage/c33;-><init>(Ljava/lang/Class;)V

    .line 377
    .line 378
    .line 379
    goto :goto_4

    .line 380
    :cond_16
    invoke-virtual {v10, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 381
    .line 382
    .line 383
    move-result v15

    .line 384
    if-eqz v15, :cond_18

    .line 385
    .line 386
    if-eqz p2, :cond_17

    .line 387
    .line 388
    new-instance v15, Ldefpackage/f33;

    .line 389
    .line 390
    invoke-direct {v15, v4}, Ldefpackage/f33;-><init>(Ljava/lang/Class;)V

    .line 391
    .line 392
    .line 393
    goto :goto_4

    .line 394
    :cond_17
    new-instance v15, Ldefpackage/g33;

    .line 395
    .line 396
    invoke-direct {v15, v4}, Ldefpackage/g33;-><init>(Ljava/lang/Class;)V

    .line 397
    .line 398
    .line 399
    goto :goto_4

    .line 400
    :cond_18
    move-object/from16 v15, v22

    .line 401
    .line 402
    :goto_4
    if-eqz v15, :cond_19

    .line 403
    .line 404
    move-object v3, v15

    .line 405
    goto :goto_6

    .line 406
    :cond_19
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 420
    :goto_5
    invoke-static {v0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 421
    .line 422
    .line 423
    return-object v22

    .line 424
    :cond_1a
    move-object/from16 v26, v2

    .line 425
    .line 426
    move/from16 v24, v3

    .line 427
    .line 428
    move-object/from16 v25, v4

    .line 429
    .line 430
    move-object/from16 v23, v15

    .line 431
    .line 432
    move-object/from16 v3, v22

    .line 433
    .line 434
    :goto_6
    const/4 v2, 0x1

    .line 435
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-eqz v4, :cond_29

    .line 440
    .line 441
    iget v4, v5, Landroid/util/TypedValue;->resourceId:I

    .line 442
    .line 443
    const-string v15, "\' for "

    .line 444
    .line 445
    const-string v2, "unsupported value \'"

    .line 446
    .line 447
    move/from16 v18, v4

    .line 448
    .line 449
    const/16 v4, 0x10

    .line 450
    .line 451
    if-ne v3, v12, :cond_1d

    .line 452
    .line 453
    if-eqz v18, :cond_1b

    .line 454
    .line 455
    move/from16 v2, v18

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_1b
    iget v0, v5, Landroid/util/TypedValue;->type:I

    .line 459
    .line 460
    if-ne v0, v4, :cond_1c

    .line 461
    .line 462
    iget v0, v5, Landroid/util/TypedValue;->data:I

    .line 463
    .line 464
    if-nez v0, :cond_1c

    .line 465
    .line 466
    const/4 v2, 0x0

    .line 467
    :goto_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    move-object v12, v3

    .line 472
    move-object/from16 v5, v25

    .line 473
    .line 474
    const/4 v2, 0x1

    .line 475
    :goto_8
    move-object v3, v0

    .line 476
    :goto_9
    move-object/from16 v0, v26

    .line 477
    .line 478
    goto/16 :goto_10

    .line 479
    .line 480
    :cond_1c
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 481
    .line 482
    new-instance v1, Ljava/lang/StringBuilder;

    .line 483
    .line 484
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    iget-object v2, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 488
    .line 489
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v3}, Ldefpackage/h33;->b()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 500
    .line 501
    .line 502
    const-string v2, ". Must be a reference to a resource."

    .line 503
    .line 504
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    throw v0

    .line 515
    :cond_1d
    if-eqz v18, :cond_1f

    .line 516
    .line 517
    if-nez v3, :cond_1e

    .line 518
    .line 519
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    move-object v3, v0

    .line 524
    move-object/from16 v5, v25

    .line 525
    .line 526
    move-object/from16 v0, v26

    .line 527
    .line 528
    const/4 v2, 0x1

    .line 529
    goto/16 :goto_10

    .line 530
    .line 531
    :cond_1e
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 532
    .line 533
    new-instance v1, Ljava/lang/StringBuilder;

    .line 534
    .line 535
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    iget-object v2, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 539
    .line 540
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3}, Ldefpackage/h33;->b()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    const-string v2, ". You must use a \"reference\" type to reference other resources."

    .line 554
    .line 555
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw v0

    .line 566
    :cond_1f
    if-ne v3, v1, :cond_20

    .line 567
    .line 568
    const/4 v2, 0x1

    .line 569
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    move-object v12, v3

    .line 574
    move-object/from16 v5, v25

    .line 575
    .line 576
    goto :goto_8

    .line 577
    :cond_20
    const/4 v2, 0x1

    .line 578
    iget v0, v5, Landroid/util/TypedValue;->type:I

    .line 579
    .line 580
    const/4 v12, 0x3

    .line 581
    if-eq v0, v12, :cond_27

    .line 582
    .line 583
    const/4 v12, 0x4

    .line 584
    if-eq v0, v12, :cond_26

    .line 585
    .line 586
    const/4 v12, 0x5

    .line 587
    if-eq v0, v12, :cond_25

    .line 588
    .line 589
    const/16 v12, 0x12

    .line 590
    .line 591
    if-eq v0, v12, :cond_23

    .line 592
    .line 593
    if-lt v0, v4, :cond_22

    .line 594
    .line 595
    const/16 v4, 0x1f

    .line 596
    .line 597
    if-gt v0, v4, :cond_22

    .line 598
    .line 599
    if-ne v3, v13, :cond_21

    .line 600
    .line 601
    invoke-static {v5, v3, v13, v6, v9}, Ldefpackage/uc5;->e(Landroid/util/TypedValue;Ldefpackage/h33;Ldefpackage/h33;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/h33;

    .line 602
    .line 603
    .line 604
    move-result-object v12

    .line 605
    iget v0, v5, Landroid/util/TypedValue;->data:I

    .line 606
    .line 607
    int-to-float v0, v0

    .line 608
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    :goto_a
    move-object v3, v0

    .line 613
    move-object/from16 v5, v25

    .line 614
    .line 615
    goto/16 :goto_9

    .line 616
    .line 617
    :cond_21
    invoke-static {v5, v3, v14, v6, v8}, Ldefpackage/uc5;->e(Landroid/util/TypedValue;Ldefpackage/h33;Ldefpackage/h33;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/h33;

    .line 618
    .line 619
    .line 620
    move-result-object v12

    .line 621
    iget v0, v5, Landroid/util/TypedValue;->data:I

    .line 622
    .line 623
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    goto :goto_a

    .line 628
    :cond_22
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 629
    .line 630
    iget v1, v5, Landroid/util/TypedValue;->type:I

    .line 631
    .line 632
    new-instance v2, Ljava/lang/StringBuilder;

    .line 633
    .line 634
    const-string v3, "unsupported argument type "

    .line 635
    .line 636
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    throw v0

    .line 650
    :cond_23
    move-object/from16 v0, v26

    .line 651
    .line 652
    invoke-static {v5, v3, v0, v6, v7}, Ldefpackage/uc5;->e(Landroid/util/TypedValue;Ldefpackage/h33;Ldefpackage/h33;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/h33;

    .line 653
    .line 654
    .line 655
    move-result-object v12

    .line 656
    iget v3, v5, Landroid/util/TypedValue;->data:I

    .line 657
    .line 658
    if-eqz v3, :cond_24

    .line 659
    .line 660
    move v3, v2

    .line 661
    goto :goto_b

    .line 662
    :cond_24
    const/4 v3, 0x0

    .line 663
    :goto_b
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    :goto_c
    move-object/from16 v5, v25

    .line 668
    .line 669
    goto/16 :goto_10

    .line 670
    .line 671
    :cond_25
    move-object/from16 v0, v26

    .line 672
    .line 673
    const-string v4, "dimension"

    .line 674
    .line 675
    invoke-static {v5, v3, v14, v6, v4}, Ldefpackage/uc5;->e(Landroid/util/TypedValue;Ldefpackage/h33;Ldefpackage/h33;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/h33;

    .line 676
    .line 677
    .line 678
    move-result-object v12

    .line 679
    invoke-virtual/range {p1 .. p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 680
    .line 681
    .line 682
    move-result-object v3

    .line 683
    invoke-virtual {v5, v3}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 684
    .line 685
    .line 686
    move-result v3

    .line 687
    float-to-int v3, v3

    .line 688
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    goto :goto_c

    .line 693
    :cond_26
    move-object/from16 v0, v26

    .line 694
    .line 695
    invoke-static {v5, v3, v13, v6, v9}, Ldefpackage/uc5;->e(Landroid/util/TypedValue;Ldefpackage/h33;Ldefpackage/h33;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/h33;

    .line 696
    .line 697
    .line 698
    move-result-object v12

    .line 699
    invoke-virtual {v5}, Landroid/util/TypedValue;->getFloat()F

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    goto :goto_c

    .line 708
    :cond_27
    move-object/from16 v0, v26

    .line 709
    .line 710
    iget-object v4, v5, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 711
    .line 712
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    if-nez v3, :cond_28

    .line 717
    .line 718
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    :try_start_1
    invoke-virtual {v14, v4}, Ldefpackage/b33;->d(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 722
    .line 723
    .line 724
    move-object v3, v14

    .line 725
    goto :goto_e

    .line 726
    :catch_1
    move-object/from16 v5, v25

    .line 727
    .line 728
    :try_start_2
    invoke-virtual {v5, v4}, Ldefpackage/b33;->d(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 729
    .line 730
    .line 731
    move-object v3, v5

    .line 732
    goto :goto_d

    .line 733
    :catch_2
    :try_start_3
    invoke-virtual {v13, v4}, Ldefpackage/b33;->d(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    .line 734
    .line 735
    .line 736
    move-object v3, v13

    .line 737
    goto :goto_d

    .line 738
    :catch_3
    :try_start_4
    invoke-virtual {v0, v4}, Ldefpackage/b33;->d(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    .line 739
    .line 740
    .line 741
    move-object v3, v0

    .line 742
    goto :goto_d

    .line 743
    :catch_4
    move-object v3, v1

    .line 744
    :goto_d
    move-object v12, v3

    .line 745
    goto :goto_f

    .line 746
    :cond_28
    :goto_e
    move-object/from16 v5, v25

    .line 747
    .line 748
    goto :goto_d

    .line 749
    :goto_f
    invoke-virtual {v12, v4}, Ldefpackage/h33;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    goto :goto_10

    .line 754
    :cond_29
    move-object/from16 v5, v25

    .line 755
    .line 756
    move-object/from16 v0, v26

    .line 757
    .line 758
    move-object v12, v3

    .line 759
    move-object/from16 v3, v22

    .line 760
    .line 761
    :goto_10
    if-eqz v3, :cond_2a

    .line 762
    .line 763
    goto :goto_11

    .line 764
    :cond_2a
    move-object/from16 v3, v22

    .line 765
    .line 766
    const/4 v2, 0x0

    .line 767
    :goto_11
    if-eqz v12, :cond_2b

    .line 768
    .line 769
    goto :goto_12

    .line 770
    :cond_2b
    move-object/from16 v12, v22

    .line 771
    .line 772
    :goto_12
    if-nez v12, :cond_3c

    .line 773
    .line 774
    instance-of v4, v3, Ljava/lang/Integer;

    .line 775
    .line 776
    if-eqz v4, :cond_2c

    .line 777
    .line 778
    move-object v13, v14

    .line 779
    goto/16 :goto_14

    .line 780
    .line 781
    :cond_2c
    instance-of v4, v3, [I

    .line 782
    .line 783
    if-eqz v4, :cond_2d

    .line 784
    .line 785
    move-object/from16 v13, v17

    .line 786
    .line 787
    goto/16 :goto_14

    .line 788
    .line 789
    :cond_2d
    instance-of v4, v3, Ljava/lang/Long;

    .line 790
    .line 791
    if-eqz v4, :cond_2e

    .line 792
    .line 793
    move-object v13, v5

    .line 794
    goto/16 :goto_14

    .line 795
    .line 796
    :cond_2e
    instance-of v4, v3, [J

    .line 797
    .line 798
    if-eqz v4, :cond_2f

    .line 799
    .line 800
    move-object/from16 v13, v16

    .line 801
    .line 802
    goto/16 :goto_14

    .line 803
    .line 804
    :cond_2f
    instance-of v4, v3, Ljava/lang/Float;

    .line 805
    .line 806
    if-eqz v4, :cond_30

    .line 807
    .line 808
    goto/16 :goto_14

    .line 809
    .line 810
    :cond_30
    instance-of v4, v3, [F

    .line 811
    .line 812
    if-eqz v4, :cond_31

    .line 813
    .line 814
    move-object/from16 v13, v20

    .line 815
    .line 816
    goto/16 :goto_14

    .line 817
    .line 818
    :cond_31
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 819
    .line 820
    if-eqz v4, :cond_32

    .line 821
    .line 822
    move-object v13, v0

    .line 823
    goto/16 :goto_14

    .line 824
    .line 825
    :cond_32
    instance-of v0, v3, [Z

    .line 826
    .line 827
    if-eqz v0, :cond_33

    .line 828
    .line 829
    move-object/from16 v13, v23

    .line 830
    .line 831
    goto/16 :goto_14

    .line 832
    .line 833
    :cond_33
    instance-of v0, v3, Ljava/lang/String;

    .line 834
    .line 835
    if-nez v0, :cond_3b

    .line 836
    .line 837
    if-nez v3, :cond_34

    .line 838
    .line 839
    goto/16 :goto_13

    .line 840
    .line 841
    :cond_34
    instance-of v0, v3, [Ljava/lang/Object;

    .line 842
    .line 843
    if-eqz v0, :cond_35

    .line 844
    .line 845
    move-object v0, v3

    .line 846
    check-cast v0, [Ljava/lang/Object;

    .line 847
    .line 848
    instance-of v0, v0, [Ljava/lang/String;

    .line 849
    .line 850
    if-eqz v0, :cond_35

    .line 851
    .line 852
    move-object/from16 v13, v21

    .line 853
    .line 854
    goto/16 :goto_14

    .line 855
    .line 856
    :cond_35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 861
    .line 862
    .line 863
    move-result v0

    .line 864
    if-eqz v0, :cond_36

    .line 865
    .line 866
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v11, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 878
    .line 879
    .line 880
    move-result v0

    .line 881
    if-eqz v0, :cond_36

    .line 882
    .line 883
    new-instance v13, Ldefpackage/d33;

    .line 884
    .line 885
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    move-result-object v0

    .line 889
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    move-result-object v0

    .line 893
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-direct {v13, v0}, Ldefpackage/d33;-><init>(Ljava/lang/Class;)V

    .line 897
    .line 898
    .line 899
    goto :goto_14

    .line 900
    :cond_36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 905
    .line 906
    .line 907
    move-result v0

    .line 908
    if-eqz v0, :cond_37

    .line 909
    .line 910
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v10, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 922
    .line 923
    .line 924
    move-result v0

    .line 925
    if-eqz v0, :cond_37

    .line 926
    .line 927
    new-instance v13, Ldefpackage/f33;

    .line 928
    .line 929
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    .line 939
    .line 940
    invoke-direct {v13, v0}, Ldefpackage/f33;-><init>(Ljava/lang/Class;)V

    .line 941
    .line 942
    .line 943
    goto :goto_14

    .line 944
    :cond_37
    instance-of v0, v3, Landroid/os/Parcelable;

    .line 945
    .line 946
    if-eqz v0, :cond_38

    .line 947
    .line 948
    new-instance v13, Ldefpackage/e33;

    .line 949
    .line 950
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    invoke-direct {v13, v0}, Ldefpackage/e33;-><init>(Ljava/lang/Class;)V

    .line 955
    .line 956
    .line 957
    goto :goto_14

    .line 958
    :cond_38
    instance-of v0, v3, Ljava/lang/Enum;

    .line 959
    .line 960
    if-eqz v0, :cond_39

    .line 961
    .line 962
    new-instance v13, Ldefpackage/c33;

    .line 963
    .line 964
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    invoke-direct {v13, v0}, Ldefpackage/c33;-><init>(Ljava/lang/Class;)V

    .line 969
    .line 970
    .line 971
    goto :goto_14

    .line 972
    :cond_39
    instance-of v0, v3, Ljava/io/Serializable;

    .line 973
    .line 974
    if-eqz v0, :cond_3a

    .line 975
    .line 976
    new-instance v13, Ldefpackage/g33;

    .line 977
    .line 978
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    invoke-direct {v13, v0}, Ldefpackage/g33;-><init>(Ljava/lang/Class;)V

    .line 983
    .line 984
    .line 985
    goto :goto_14

    .line 986
    :cond_3a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    move-result-object v0

    .line 990
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 991
    .line 992
    .line 993
    move-result-object v0

    .line 994
    const-string v1, " is not supported for navigation arguments."

    .line 995
    .line 996
    const-string v2, "Object of type "

    .line 997
    .line 998
    invoke-static {v0, v1, v2}, Ldefpackage/nz2;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    return-object v22

    .line 1002
    :cond_3b
    :goto_13
    move-object v13, v1

    .line 1003
    :goto_14
    move-object v12, v13

    .line 1004
    :cond_3c
    new-instance v0, Ldefpackage/z13;

    .line 1005
    .line 1006
    move/from16 v1, v24

    .line 1007
    .line 1008
    invoke-direct {v0, v12, v1, v3, v2}, Ldefpackage/z13;-><init>(Ldefpackage/h33;ZLjava/lang/Object;Z)V

    .line 1009
    .line 1010
    .line 1011
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Ldefpackage/r23;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v5, v0, Ldefpackage/w23;->b:Ldefpackage/u43;

    .line 17
    .line 18
    invoke-virtual {v5, v4}, Ldefpackage/u43;->b(Ljava/lang/String;)Ldefpackage/t43;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Ldefpackage/t43;->a()Ldefpackage/r23;

    .line 23
    .line 24
    .line 25
    move-result-object v8

    .line 26
    iget-object v4, v0, Ldefpackage/w23;->a:Landroid/content/Context;

    .line 27
    .line 28
    invoke-virtual {v8, v4, v2}, Ldefpackage/r23;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    .line 30
    .line 31
    iget-object v5, v8, Ldefpackage/r23;->t:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    const/4 v7, 0x1

    .line 38
    add-int/2addr v6, v7

    .line 39
    :goto_0
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-eq v9, v7, :cond_1e

    .line 44
    .line 45
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    const/4 v11, 0x3

    .line 50
    if-ge v10, v6, :cond_0

    .line 51
    .line 52
    if-eq v9, v11, :cond_1e

    .line 53
    .line 54
    :cond_0
    const/4 v12, 0x2

    .line 55
    if-eq v9, v12, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    if-le v10, v6, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    const-string v10, "argument"

    .line 66
    .line 67
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    const/4 v14, 0x0

    .line 72
    const-string v15, "Arguments must have a name"

    .line 73
    .line 74
    sget-object v12, Ldefpackage/zs3;->b:[I

    .line 75
    .line 76
    if-eqz v13, :cond_4

    .line 77
    .line 78
    invoke-virtual {v1, v2, v12}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    if-eqz v10, :cond_3

    .line 90
    .line 91
    invoke-static {v9, v1, v3}, Ldefpackage/w23;->c(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Ldefpackage/z13;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 103
    .line 104
    invoke-direct {v0, v15}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0

    .line 108
    :cond_4
    const-string v13, "deepLink"

    .line 109
    .line 110
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    if-eqz v13, :cond_f

    .line 117
    .line 118
    sget-object v9, Ldefpackage/zs3;->c:[I

    .line 119
    .line 120
    invoke-virtual {v1, v2, v9}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    invoke-virtual {v9, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    const/4 v12, 0x2

    .line 136
    invoke-virtual {v9, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    if-eqz v10, :cond_5

    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v13

    .line 146
    if-nez v13, :cond_7

    .line 147
    .line 148
    :cond_5
    if-eqz v11, :cond_6

    .line 149
    .line 150
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v13

    .line 154
    if-nez v13, :cond_7

    .line 155
    .line 156
    :cond_6
    if-eqz v12, :cond_e

    .line 157
    .line 158
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_e

    .line 163
    .line 164
    :cond_7
    const-string v13, "${applicationId}"

    .line 165
    .line 166
    if-eqz v10, :cond_8

    .line 167
    .line 168
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-static {v10, v13, v15}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    goto :goto_1

    .line 180
    :cond_8
    move-object/from16 v10, v16

    .line 181
    .line 182
    :goto_1
    if-eqz v11, :cond_b

    .line 183
    .line 184
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    if-nez v15, :cond_9

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v15

    .line 195
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-static {v11, v13, v15}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v11

    .line 202
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result v15

    .line 206
    if-lez v15, :cond_a

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_a
    const-string v0, "The NavDeepLink cannot have an empty action."

    .line 210
    .line 211
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v16

    .line 215
    :cond_b
    :goto_2
    move-object/from16 v11, v16

    .line 216
    .line 217
    :goto_3
    if-eqz v12, :cond_c

    .line 218
    .line 219
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v15

    .line 223
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {v12, v13, v15}, Ldefpackage/xm4;->i0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v12

    .line 230
    goto :goto_4

    .line 231
    :cond_c
    move-object/from16 v12, v16

    .line 232
    .line 233
    :goto_4
    new-instance v13, Ldefpackage/n23;

    .line 234
    .line 235
    invoke-direct {v13, v10, v11, v12}, Ldefpackage/n23;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    new-instance v11, Ldefpackage/q23;

    .line 239
    .line 240
    invoke-direct {v11, v13, v14}, Ldefpackage/q23;-><init>(Ldefpackage/n23;I)V

    .line 241
    .line 242
    .line 243
    invoke-static {v5, v11}, Ldefpackage/ud3;->b0(Ljava/util/Map;Ldefpackage/if1;)Ljava/util/ArrayList;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v12

    .line 251
    if-eqz v12, :cond_d

    .line 252
    .line 253
    iget-object v10, v8, Ldefpackage/r23;->r:Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_d
    const-string v7, " can\'t be used to open destination "

    .line 264
    .line 265
    const-string v9, ".\nFollowing required arguments are missing: "

    .line 266
    .line 267
    const-string v5, "Deep link "

    .line 268
    .line 269
    move-object v6, v10

    .line 270
    move-object v10, v11

    .line 271
    invoke-static/range {v5 .. v10}, Ldefpackage/nz2;->q(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-object v16

    .line 275
    :cond_e
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 276
    .line 277
    const-string v1, "Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType"

    .line 278
    .line 279
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :cond_f
    const-string v13, "action"

    .line 284
    .line 285
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v13

    .line 289
    if-eqz v13, :cond_1c

    .line 290
    .line 291
    sget-object v9, Ldefpackage/zs3;->a:[I

    .line 292
    .line 293
    invoke-virtual {v4, v2, v9, v14, v14}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    invoke-virtual {v9, v14, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    invoke-virtual {v9, v7, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 302
    .line 303
    .line 304
    move-result v11

    .line 305
    move/from16 v17, v7

    .line 306
    .line 307
    new-instance v7, Ldefpackage/y13;

    .line 308
    .line 309
    invoke-direct {v7, v11}, Ldefpackage/y13;-><init>(I)V

    .line 310
    .line 311
    .line 312
    const/4 v11, 0x4

    .line 313
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 314
    .line 315
    .line 316
    move-result v19

    .line 317
    const/16 v11, 0xa

    .line 318
    .line 319
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 320
    .line 321
    .line 322
    move-result v20

    .line 323
    const/4 v11, 0x7

    .line 324
    const/4 v14, -0x1

    .line 325
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 326
    .line 327
    .line 328
    move-result v21

    .line 329
    const/16 v11, 0x8

    .line 330
    .line 331
    const/4 v14, 0x0

    .line 332
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 333
    .line 334
    .line 335
    move-result v22

    .line 336
    const/16 v11, 0x9

    .line 337
    .line 338
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 339
    .line 340
    .line 341
    move-result v23

    .line 342
    const/4 v11, 0x2

    .line 343
    const/4 v14, -0x1

    .line 344
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 345
    .line 346
    .line 347
    move-result v24

    .line 348
    const/4 v11, 0x3

    .line 349
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 350
    .line 351
    .line 352
    move-result v25

    .line 353
    const/4 v11, 0x5

    .line 354
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 355
    .line 356
    .line 357
    move-result v26

    .line 358
    const/4 v11, 0x6

    .line 359
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 360
    .line 361
    .line 362
    move-result v27

    .line 363
    new-instance v18, Ldefpackage/y23;

    .line 364
    .line 365
    invoke-direct/range {v18 .. v27}, Ldefpackage/y23;-><init>(ZZIZZIIII)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v11, v18

    .line 369
    .line 370
    iput-object v11, v7, Ldefpackage/y13;->b:Ldefpackage/y23;

    .line 371
    .line 372
    new-instance v11, Landroid/os/Bundle;

    .line 373
    .line 374
    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    .line 375
    .line 376
    .line 377
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 378
    .line 379
    .line 380
    move-result v14

    .line 381
    add-int/lit8 v14, v14, 0x1

    .line 382
    .line 383
    move-object/from16 v18, v4

    .line 384
    .line 385
    :goto_5
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    move-object/from16 v19, v5

    .line 390
    .line 391
    move/from16 v5, v17

    .line 392
    .line 393
    if-eq v4, v5, :cond_16

    .line 394
    .line 395
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 396
    .line 397
    .line 398
    move-result v5

    .line 399
    move/from16 v20, v6

    .line 400
    .line 401
    if-ge v5, v14, :cond_10

    .line 402
    .line 403
    const/4 v6, 0x3

    .line 404
    if-eq v4, v6, :cond_17

    .line 405
    .line 406
    :cond_10
    const/4 v6, 0x2

    .line 407
    if-eq v4, v6, :cond_11

    .line 408
    .line 409
    :goto_6
    move-object/from16 v5, v19

    .line 410
    .line 411
    move/from16 v6, v20

    .line 412
    .line 413
    const/16 v17, 0x1

    .line 414
    .line 415
    goto :goto_5

    .line 416
    :cond_11
    if-le v5, v14, :cond_12

    .line 417
    .line 418
    goto :goto_6

    .line 419
    :cond_12
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    if-eqz v4, :cond_14

    .line 428
    .line 429
    invoke-virtual {v1, v2, v12}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    const/4 v5, 0x0

    .line 437
    invoke-virtual {v4, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    if-eqz v6, :cond_15

    .line 442
    .line 443
    invoke-static {v4, v1, v3}, Ldefpackage/w23;->c(Landroid/content/res/TypedArray;Landroid/content/res/Resources;I)Ldefpackage/z13;

    .line 444
    .line 445
    .line 446
    move-result-object v5

    .line 447
    iget-boolean v3, v5, Ldefpackage/z13;->c:Z

    .line 448
    .line 449
    if-eqz v3, :cond_13

    .line 450
    .line 451
    if-eqz v3, :cond_13

    .line 452
    .line 453
    iget-object v3, v5, Ldefpackage/z13;->d:Ljava/lang/Object;

    .line 454
    .line 455
    if-eqz v3, :cond_13

    .line 456
    .line 457
    iget-object v5, v5, Ldefpackage/z13;->a:Ldefpackage/h33;

    .line 458
    .line 459
    invoke-virtual {v5, v11, v6, v3}, Ldefpackage/h33;->e(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    :cond_13
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 463
    .line 464
    .line 465
    :cond_14
    move/from16 v3, p4

    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_15
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 469
    .line 470
    invoke-direct {v0, v15}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    throw v0

    .line 474
    :cond_16
    move/from16 v20, v6

    .line 475
    .line 476
    :cond_17
    invoke-virtual {v11}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    if-nez v3, :cond_18

    .line 481
    .line 482
    iput-object v11, v7, Ldefpackage/y13;->c:Landroid/os/Bundle;

    .line 483
    .line 484
    :cond_18
    instance-of v3, v8, Ldefpackage/j5;

    .line 485
    .line 486
    if-nez v3, :cond_1b

    .line 487
    .line 488
    if-eqz v13, :cond_1a

    .line 489
    .line 490
    iget-object v3, v8, Ldefpackage/r23;->s:Ldefpackage/mj4;

    .line 491
    .line 492
    invoke-virtual {v3, v13, v7}, Ldefpackage/mj4;->d(ILjava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 496
    .line 497
    .line 498
    :cond_19
    :goto_7
    move/from16 v3, p4

    .line 499
    .line 500
    move-object/from16 v4, v18

    .line 501
    .line 502
    move-object/from16 v5, v19

    .line 503
    .line 504
    move/from16 v6, v20

    .line 505
    .line 506
    const/4 v7, 0x1

    .line 507
    goto/16 :goto_0

    .line 508
    .line 509
    :cond_1a
    const-string v0, "Cannot have an action with actionId 0"

    .line 510
    .line 511
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    return-object v16

    .line 515
    :cond_1b
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 516
    .line 517
    new-instance v1, Ljava/lang/StringBuilder;

    .line 518
    .line 519
    const-string v2, "Cannot add action "

    .line 520
    .line 521
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    const-string v2, " to "

    .line 528
    .line 529
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    const-string v2, " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions."

    .line 536
    .line 537
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 545
    .line 546
    .line 547
    throw v0

    .line 548
    :cond_1c
    move-object/from16 v18, v4

    .line 549
    .line 550
    move-object/from16 v19, v5

    .line 551
    .line 552
    move/from16 v20, v6

    .line 553
    .line 554
    const-string v3, "include"

    .line 555
    .line 556
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v3

    .line 560
    if-eqz v3, :cond_1d

    .line 561
    .line 562
    instance-of v3, v8, Ldefpackage/t23;

    .line 563
    .line 564
    if-eqz v3, :cond_1d

    .line 565
    .line 566
    sget-object v3, Ldefpackage/rt3;->c:[I

    .line 567
    .line 568
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    const/4 v14, 0x0

    .line 576
    invoke-virtual {v3, v14, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    move-object v5, v8

    .line 581
    check-cast v5, Ldefpackage/t23;

    .line 582
    .line 583
    invoke-virtual {v0, v4}, Ldefpackage/w23;->b(I)Ldefpackage/t23;

    .line 584
    .line 585
    .line 586
    move-result-object v4

    .line 587
    invoke-virtual {v5, v4}, Ldefpackage/t23;->g(Ldefpackage/r23;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 591
    .line 592
    .line 593
    goto :goto_7

    .line 594
    :cond_1d
    instance-of v3, v8, Ldefpackage/t23;

    .line 595
    .line 596
    if-eqz v3, :cond_19

    .line 597
    .line 598
    move-object v3, v8

    .line 599
    check-cast v3, Ldefpackage/t23;

    .line 600
    .line 601
    invoke-virtual/range {p0 .. p4}, Ldefpackage/w23;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Ldefpackage/r23;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    invoke-virtual {v3, v4}, Ldefpackage/t23;->g(Ldefpackage/r23;)V

    .line 606
    .line 607
    .line 608
    goto :goto_7

    .line 609
    :cond_1e
    return-object v8
.end method

.method public final b(I)Ldefpackage/t23;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/w23;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :cond_0
    :try_start_0
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v3, v4, :cond_1

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    if-ne v3, v5, :cond_0

    .line 27
    .line 28
    :cond_1
    if-ne v3, v4, :cond_3

    .line 29
    .line 30
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v1, v2, p1}, Ldefpackage/w23;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Ldefpackage/r23;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of v2, p0, Ldefpackage/t23;

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    check-cast p0, Ldefpackage/t23;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception p0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :try_start_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "Root element <"

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, "> did not inflate into a NavGraph"

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-direct {v2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v2

    .line 87
    :cond_3
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 88
    .line 89
    const-string v2, "No start tag found"

    .line 90
    .line 91
    invoke-direct {p0, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :goto_0
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 96
    .line 97
    new-instance v3, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v4, "Exception inflating "

    .line 103
    .line 104
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p1, " line "

    .line 115
    .line 116
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-interface {v1}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-direct {v2, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    .line 132
    .line 133
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    :goto_1
    invoke-interface {v1}, Landroid/content/res/XmlResourceParser;->close()V

    .line 135
    .line 136
    .line 137
    throw p0
.end method
