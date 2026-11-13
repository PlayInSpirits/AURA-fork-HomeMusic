.class public final synthetic Ldefpackage/d52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:Ldefpackage/g52;

.field public final synthetic o:Lcom/eddyizm/tempus/lan/LanReceiverService;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Lorg/json/JSONObject;

.field public final synthetic r:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/g52;Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/d52;->n:Ldefpackage/g52;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/d52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/d52;->p:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/d52;->q:Lorg/json/JSONObject;

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/d52;->r:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/d52;->n:Ldefpackage/g52;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/d52;->o:Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/d52;->p:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v0, Ldefpackage/d52;->q:Lorg/json/JSONObject;

    .line 10
    .line 11
    iget-object v0, v0, Ldefpackage/d52;->r:Ljava/util/List;

    .line 12
    .line 13
    sget-boolean v5, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 14
    .line 15
    invoke-virtual {v1}, Ldefpackage/g52;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    iget-object v1, v2, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 19
    .line 20
    const-string v6, "browserFuture"

    .line 21
    .line 22
    if-eqz v1, :cond_16

    .line 23
    .line 24
    invoke-virtual {v1}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ldefpackage/bj2;

    .line 29
    .line 30
    const-string v7, "replace"

    .line 31
    .line 32
    const-string v8, "append"

    .line 33
    .line 34
    const-string v9, "next"

    .line 35
    .line 36
    filled-new-array {v7, v8, v9}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    invoke-static {v10}, Ldefpackage/ti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    invoke-interface {v10, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-nez v10, :cond_1

    .line 49
    .line 50
    const-string v10, "revision"

    .line 51
    .line 52
    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lcom/eddyizm/tempus/lan/LanReceiverService;->e(Ldefpackage/qi3;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v12

    .line 70
    if-lez v12, :cond_0

    .line 71
    .line 72
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eqz v10, :cond_0

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 80
    .line 81
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v1, "error"

    .line 85
    .line 86
    const-string v2, "queue_changed"

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_1
    :goto_0
    if-eqz v3, :cond_14

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    const-string v11, "to"

    .line 103
    .line 104
    const-string v12, "from"

    .line 105
    .line 106
    const-string v13, "index"

    .line 107
    .line 108
    move-object v15, v6

    .line 109
    const/16 p0, 0x0

    .line 110
    .line 111
    const-wide/16 v5, 0x0

    .line 112
    .line 113
    const-string v16, "Failed requirement."

    .line 114
    .line 115
    const/16 v17, 0x1

    .line 116
    .line 117
    const/4 v14, 0x0

    .line 118
    sparse-switch v10, :sswitch_data_0

    .line 119
    .line 120
    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :sswitch_0
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-eqz v3, :cond_15

    .line 128
    .line 129
    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-ltz v3, :cond_3

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-ge v3, v7, :cond_3

    .line 140
    .line 141
    const-string v7, "position"

    .line 142
    .line 143
    invoke-virtual {v4, v7, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v7

    .line 147
    cmp-long v4, v7, v5

    .line 148
    .line 149
    if-gez v4, :cond_2

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_2
    move-wide v5, v7

    .line 153
    :goto_1
    invoke-virtual {v1, v0, v3, v5, v6}, Ldefpackage/sk2;->T(Ljava/util/List;IJ)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ldefpackage/sk2;->b()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ldefpackage/sk2;->m0()V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_3
    invoke-static/range {v16 .. v16}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :sswitch_1
    const-string v0, "reorder"

    .line 169
    .line 170
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_15

    .line 175
    .line 176
    const-string v0, "ids"

    .line 177
    .line 178
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    invoke-static {v14, v3}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    new-instance v4, Ljava/util/ArrayList;

    .line 191
    .line 192
    const/16 v5, 0xa

    .line 193
    .line 194
    invoke-static {v3, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    :goto_2
    move-object v5, v3

    .line 206
    check-cast v5, Ldefpackage/i02;

    .line 207
    .line 208
    iget-boolean v5, v5, Ldefpackage/i02;->p:Z

    .line 209
    .line 210
    if-eqz v5, :cond_4

    .line 211
    .line 212
    move-object v5, v3

    .line 213
    check-cast v5, Ldefpackage/b02;

    .line 214
    .line 215
    invoke-virtual {v5}, Ldefpackage/b02;->nextInt()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_4
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-static {v14, v0}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    new-instance v3, Ljava/util/ArrayList;

    .line 236
    .line 237
    const/16 v5, 0xa

    .line 238
    .line 239
    invoke-static {v0, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    :goto_3
    move-object v5, v0

    .line 251
    check-cast v5, Ldefpackage/i02;

    .line 252
    .line 253
    iget-boolean v5, v5, Ldefpackage/i02;->p:Z

    .line 254
    .line 255
    if-eqz v5, :cond_5

    .line 256
    .line 257
    move-object v5, v0

    .line 258
    check-cast v5, Ldefpackage/b02;

    .line 259
    .line 260
    invoke-virtual {v5}, Ldefpackage/b02;->nextInt()I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    invoke-virtual {v1, v5}, Ldefpackage/sk2;->Y(I)Ldefpackage/gn2;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    iget-object v5, v5, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_5
    new-instance v0, Ldefpackage/b52;

    .line 275
    .line 276
    invoke-direct {v0, v3}, Ldefpackage/b52;-><init>(Ljava/util/ArrayList;)V

    .line 277
    .line 278
    .line 279
    invoke-static {v0}, Ldefpackage/vr1;->m(Ldefpackage/kk1;)Ljava/util/Map;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    new-instance v3, Ldefpackage/c52;

    .line 284
    .line 285
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 286
    .line 287
    .line 288
    iput-object v4, v3, Ldefpackage/c52;->a:Ljava/util/ArrayList;

    .line 289
    .line 290
    invoke-static {v3}, Ldefpackage/vr1;->m(Ldefpackage/kk1;)Ljava/util/Map;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-static {v0, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_a

    .line 299
    .line 300
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    move v3, v14

    .line 305
    move v5, v3

    .line 306
    :goto_4
    if-ge v5, v0, :cond_11

    .line 307
    .line 308
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v6

    .line 312
    add-int/lit8 v5, v5, 0x1

    .line 313
    .line 314
    add-int/lit8 v7, v3, 0x1

    .line 315
    .line 316
    if-ltz v3, :cond_9

    .line 317
    .line 318
    check-cast v6, Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    invoke-static {v3, v8}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 325
    .line 326
    .line 327
    move-result-object v8

    .line 328
    invoke-virtual {v8}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v8

    .line 332
    :cond_6
    move-object v9, v8

    .line 333
    check-cast v9, Ldefpackage/i02;

    .line 334
    .line 335
    iget-boolean v9, v9, Ldefpackage/i02;->p:Z

    .line 336
    .line 337
    if-eqz v9, :cond_8

    .line 338
    .line 339
    move-object v9, v8

    .line 340
    check-cast v9, Ldefpackage/b02;

    .line 341
    .line 342
    invoke-virtual {v9}, Ldefpackage/b02;->nextInt()I

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    invoke-virtual {v1, v9}, Ldefpackage/sk2;->Y(I)Ldefpackage/gn2;

    .line 347
    .line 348
    .line 349
    move-result-object v10

    .line 350
    iget-object v10, v10, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {v10, v6}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v10

    .line 356
    if-eqz v10, :cond_6

    .line 357
    .line 358
    if-eq v9, v3, :cond_7

    .line 359
    .line 360
    invoke-virtual {v1, v9, v3}, Ldefpackage/sk2;->t0(II)V

    .line 361
    .line 362
    .line 363
    :cond_7
    move v3, v7

    .line 364
    goto :goto_4

    .line 365
    :cond_8
    const-string v0, "Collection contains no element matching the predicate."

    .line 366
    .line 367
    invoke-static {v0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-object p0

    .line 371
    :cond_9
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 372
    .line 373
    .line 374
    throw p0

    .line 375
    :cond_a
    invoke-static/range {v16 .. v16}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return-object p0

    .line 379
    :sswitch_2
    const-string v0, "clear"

    .line 380
    .line 381
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-eqz v0, :cond_15

    .line 386
    .line 387
    invoke-virtual {v1}, Ldefpackage/sk2;->r()V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_8

    .line 391
    .line 392
    :sswitch_3
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    if-eqz v4, :cond_15

    .line 397
    .line 398
    goto/16 :goto_5

    .line 399
    .line 400
    :sswitch_4
    const-string v0, "move"

    .line 401
    .line 402
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_15

    .line 407
    .line 408
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 413
    .line 414
    .line 415
    move-result v3

    .line 416
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    if-ltz v0, :cond_b

    .line 421
    .line 422
    if-ge v0, v4, :cond_b

    .line 423
    .line 424
    if-ltz v3, :cond_b

    .line 425
    .line 426
    if-ge v3, v4, :cond_b

    .line 427
    .line 428
    invoke-virtual {v1, v0, v3}, Ldefpackage/sk2;->t0(II)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_8

    .line 432
    .line 433
    :cond_b
    invoke-static/range {v16 .. v16}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    return-object p0

    .line 437
    :sswitch_5
    const-string v0, "select"

    .line 438
    .line 439
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_15

    .line 444
    .line 445
    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    if-ltz v0, :cond_c

    .line 450
    .line 451
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 452
    .line 453
    .line 454
    move-result v3

    .line 455
    if-ge v0, v3, :cond_c

    .line 456
    .line 457
    invoke-virtual {v1, v0, v5, v6}, Ldefpackage/sk2;->n(IJ)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1}, Ldefpackage/sk2;->b()V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1}, Ldefpackage/sk2;->m0()V

    .line 464
    .line 465
    .line 466
    goto/16 :goto_8

    .line 467
    .line 468
    :cond_c
    invoke-static/range {v16 .. v16}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    return-object p0

    .line 472
    :sswitch_6
    const-string v0, "remove"

    .line 473
    .line 474
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-eqz v0, :cond_15

    .line 479
    .line 480
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    invoke-virtual {v4, v11}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    move-result v3

    .line 488
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 489
    .line 490
    .line 491
    move-result v4

    .line 492
    if-ltz v0, :cond_d

    .line 493
    .line 494
    if-gt v0, v4, :cond_d

    .line 495
    .line 496
    if-gt v0, v3, :cond_d

    .line 497
    .line 498
    if-gt v3, v4, :cond_d

    .line 499
    .line 500
    invoke-virtual {v1, v0, v3}, Ldefpackage/sk2;->P(II)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_8

    .line 504
    .line 505
    :cond_d
    invoke-static/range {v16 .. v16}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    return-object p0

    .line 509
    :sswitch_7
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v4

    .line 513
    if-eqz v4, :cond_15

    .line 514
    .line 515
    :goto_5
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 520
    .line 521
    .line 522
    move-result v5

    .line 523
    if-ltz v4, :cond_13

    .line 524
    .line 525
    if-lez v5, :cond_13

    .line 526
    .line 527
    int-to-long v6, v4

    .line 528
    int-to-long v4, v5

    .line 529
    add-long/2addr v6, v4

    .line 530
    const-wide/16 v4, 0x1f4

    .line 531
    .line 532
    cmp-long v4, v6, v4

    .line 533
    .line 534
    if-gtz v4, :cond_13

    .line 535
    .line 536
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    if-nez v4, :cond_e

    .line 541
    .line 542
    move/from16 v4, v17

    .line 543
    .line 544
    goto :goto_6

    .line 545
    :cond_e
    move v4, v14

    .line 546
    :goto_6
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    if-eqz v3, :cond_10

    .line 551
    .line 552
    if-nez v4, :cond_10

    .line 553
    .line 554
    invoke-virtual {v1}, Ldefpackage/sk2;->o0()I

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    add-int/lit8 v3, v3, 0x1

    .line 559
    .line 560
    iget-object v5, v2, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 561
    .line 562
    if-eqz v5, :cond_f

    .line 563
    .line 564
    invoke-virtual {v5}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    check-cast v5, Ldefpackage/bj2;

    .line 569
    .line 570
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 579
    .line 580
    .line 581
    move-result v8

    .line 582
    add-int/2addr v8, v7

    .line 583
    sget-object v7, Ldefpackage/bo2;->a:Ljava/lang/ref/WeakReference;

    .line 584
    .line 585
    new-instance v7, Landroid/os/Bundle;

    .line 586
    .line 587
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 588
    .line 589
    .line 590
    const-string v9, "play_next_insert_pos"

    .line 591
    .line 592
    invoke-virtual {v7, v9, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 593
    .line 594
    .line 595
    const-string v9, "play_next_count"

    .line 596
    .line 597
    invoke-virtual {v7, v9, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 598
    .line 599
    .line 600
    const-string v6, "play_next_target_count"

    .line 601
    .line 602
    invoke-virtual {v7, v6, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 603
    .line 604
    .line 605
    new-instance v6, Ldefpackage/va4;

    .line 606
    .line 607
    const-string v8, "com.eddyizm.tempus.PLAY_NEXT_FIXUP"

    .line 608
    .line 609
    sget-object v9, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 610
    .line 611
    invoke-direct {v6, v8, v9}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v5, v6, v7}, Ldefpackage/sk2;->b1(Ldefpackage/va4;Landroid/os/Bundle;)Ldefpackage/ic2;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    new-instance v6, Ldefpackage/tv1;

    .line 619
    .line 620
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 621
    .line 622
    .line 623
    sget-object v7, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 624
    .line 625
    new-instance v8, Ldefpackage/lg1;

    .line 626
    .line 627
    invoke-direct {v8, v14, v5, v6}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    invoke-interface {v5, v8, v7}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v0, v3}, Ldefpackage/sk2;->N0(Ljava/util/List;I)V

    .line 634
    .line 635
    .line 636
    goto :goto_7

    .line 637
    :cond_f
    invoke-static {v15}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    throw p0

    .line 641
    :cond_10
    invoke-virtual {v1, v0}, Ldefpackage/sk2;->w0(Ljava/util/List;)V

    .line 642
    .line 643
    .line 644
    :goto_7
    if-eqz v4, :cond_11

    .line 645
    .line 646
    invoke-virtual {v1}, Ldefpackage/sk2;->b()V

    .line 647
    .line 648
    .line 649
    :cond_11
    :goto_8
    invoke-virtual {v1}, Ldefpackage/sk2;->Q0()I

    .line 650
    .line 651
    .line 652
    move-result v0

    .line 653
    invoke-static {v14, v0}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    new-instance v3, Ljava/util/ArrayList;

    .line 658
    .line 659
    const/16 v5, 0xa

    .line 660
    .line 661
    invoke-static {v0, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 662
    .line 663
    .line 664
    move-result v4

    .line 665
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    :goto_9
    move-object v4, v0

    .line 673
    check-cast v4, Ldefpackage/i02;

    .line 674
    .line 675
    iget-boolean v4, v4, Ldefpackage/i02;->p:Z

    .line 676
    .line 677
    if-eqz v4, :cond_12

    .line 678
    .line 679
    move-object v4, v0

    .line 680
    check-cast v4, Ldefpackage/b02;

    .line 681
    .line 682
    invoke-virtual {v4}, Ldefpackage/b02;->nextInt()I

    .line 683
    .line 684
    .line 685
    move-result v4

    .line 686
    invoke-virtual {v1, v4}, Ldefpackage/sk2;->Y(I)Ldefpackage/gn2;

    .line 687
    .line 688
    .line 689
    move-result-object v4

    .line 690
    invoke-static {v4}, Ldefpackage/gi1;->N(Ldefpackage/gn2;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    goto :goto_9

    .line 698
    :cond_12
    new-instance v0, Ldefpackage/vs3;

    .line 699
    .line 700
    invoke-direct {v0}, Ldefpackage/vs3;-><init>()V

    .line 701
    .line 702
    .line 703
    move/from16 v4, v17

    .line 704
    .line 705
    invoke-virtual {v0, v3, v4, v14}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V

    .line 706
    .line 707
    .line 708
    invoke-virtual {v2, v1}, Lcom/eddyizm/tempus/lan/LanReceiverService;->f(Ldefpackage/qi3;)Lorg/json/JSONObject;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    return-object v0

    .line 713
    :cond_13
    invoke-static/range {v16 .. v16}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    return-object p0

    .line 717
    :cond_14
    const/16 p0, 0x0

    .line 718
    .line 719
    :cond_15
    :goto_a
    const-string v0, "Unknown queue edit"

    .line 720
    .line 721
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    return-object p0

    .line 725
    :cond_16
    move-object v15, v6

    .line 726
    const/16 p0, 0x0

    .line 727
    .line 728
    invoke-static {v15}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    throw p0

    .line 732
    nop

    .line 733
    :sswitch_data_0
    .sparse-switch
        -0x541b30e6 -> :sswitch_7
        -0x37b5077c -> :sswitch_6
        -0x3600cb04 -> :sswitch_5
        0x333bd1 -> :sswitch_4
        0x338af3 -> :sswitch_3
        0x5a5b64d -> :sswitch_2
        0x413160fb -> :sswitch_1
        0x413cb2b4 -> :sswitch_0
    .end sparse-switch
.end method
