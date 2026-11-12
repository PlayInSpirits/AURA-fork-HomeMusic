.class public final synthetic Lcs0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Li54;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcs0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lcs0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 11

    .line 1
    iget v0, p0, Lcs0;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lcs0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lz40;

    .line 10
    .line 11
    iget-object v0, p0, Lz40;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-static {v0}, Llg2;->a0(Ljava/util/Map;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lnl4;

    .line 50
    .line 51
    invoke-virtual {v2}, Lnl4;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {p0, v2, v3}, Lz40;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v0, p0, Lz40;->o:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-static {v0}, Llg2;->a0(Ljava/util/Map;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Ljava/util/Map$Entry;

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Li54;

    .line 98
    .line 99
    invoke-interface {v2}, Li54;->a()Landroid/os/Bundle;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {p0, v2, v3}, Lz40;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    iget-object p0, p0, Lz40;->n:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 110
    .line 111
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_2

    .line 116
    .line 117
    new-array p0, v1, [Lkd3;

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_3

    .line 142
    .line 143
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/util/Map$Entry;

    .line 148
    .line 149
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/String;

    .line 154
    .line 155
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v4, Lkd3;

    .line 160
    .line 161
    invoke-direct {v4, v3, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_3
    new-array p0, v1, [Lkd3;

    .line 169
    .line 170
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, [Lkd3;

    .line 175
    .line 176
    :goto_3
    array-length v0, p0

    .line 177
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, [Lkd3;

    .line 182
    .line 183
    invoke-static {p0}, Lfh0;->g([Lkd3;)Landroid/os/Bundle;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    return-object p0

    .line 188
    :pswitch_0
    check-cast p0, Landroidx/navigation/fragment/NavHostFragment;

    .line 189
    .line 190
    iget p0, p0, Landroidx/navigation/fragment/NavHostFragment;->n0:I

    .line 191
    .line 192
    if-eqz p0, :cond_4

    .line 193
    .line 194
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    new-instance v0, Lkd3;

    .line 199
    .line 200
    const-string v1, "android-support-nav:fragment:graphId"

    .line 201
    .line 202
    invoke-direct {v0, v1, p0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    filled-new-array {v0}, [Lkd3;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {p0}, Lfh0;->g([Lkd3;)Landroid/os/Bundle;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    goto :goto_4

    .line 214
    :cond_4
    sget-object p0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    :goto_4
    return-object p0

    .line 220
    :pswitch_1
    check-cast p0, Lv23;

    .line 221
    .line 222
    iget-object v0, p0, Lv23;->m:Ljava/util/LinkedHashMap;

    .line 223
    .line 224
    iget-object v2, p0, Lv23;->l:Ljava/util/LinkedHashMap;

    .line 225
    .line 226
    iget-object v3, p0, Lv23;->g:Lii;

    .line 227
    .line 228
    new-instance v4, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 231
    .line 232
    .line 233
    new-instance v5, Landroid/os/Bundle;

    .line 234
    .line 235
    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 236
    .line 237
    .line 238
    iget-object v6, p0, Lv23;->u:Lu43;

    .line 239
    .line 240
    iget-object v6, v6, Lu43;->a:Ljava/util/LinkedHashMap;

    .line 241
    .line 242
    invoke-static {v6}, Llg2;->a0(Ljava/util/Map;)Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    :cond_5
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_6

    .line 259
    .line 260
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    check-cast v7, Ljava/util/Map$Entry;

    .line 265
    .line 266
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v8

    .line 270
    check-cast v8, Ljava/lang/String;

    .line 271
    .line 272
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v7

    .line 276
    check-cast v7, Lt43;

    .line 277
    .line 278
    invoke-virtual {v7}, Lt43;->h()Landroid/os/Bundle;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    if-eqz v7, :cond_5

    .line 283
    .line 284
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    invoke-virtual {v5, v8, v7}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 292
    .line 293
    .line 294
    move-result v6

    .line 295
    const/4 v7, 0x0

    .line 296
    if-nez v6, :cond_7

    .line 297
    .line 298
    new-instance v6, Landroid/os/Bundle;

    .line 299
    .line 300
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 301
    .line 302
    .line 303
    const-string v8, "android-support-nav:controller:navigatorState:names"

    .line 304
    .line 305
    invoke-virtual {v5, v8, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 306
    .line 307
    .line 308
    const-string v4, "android-support-nav:controller:navigatorState"

    .line 309
    .line 310
    invoke-virtual {v6, v4, v5}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 311
    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_7
    move-object v6, v7

    .line 315
    :goto_6
    invoke-virtual {v3}, Lii;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v4

    .line 319
    if-nez v4, :cond_a

    .line 320
    .line 321
    if-nez v6, :cond_8

    .line 322
    .line 323
    new-instance v4, Landroid/os/Bundle;

    .line 324
    .line 325
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 326
    .line 327
    .line 328
    move-object v6, v4

    .line 329
    :cond_8
    iget v4, v3, Lii;->p:I

    .line 330
    .line 331
    new-array v4, v4, [Landroid/os/Parcelable;

    .line 332
    .line 333
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    move v5, v1

    .line 338
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    if-eqz v8, :cond_9

    .line 343
    .line 344
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v8

    .line 348
    check-cast v8, La23;

    .line 349
    .line 350
    add-int/lit8 v9, v5, 0x1

    .line 351
    .line 352
    new-instance v10, Lc23;

    .line 353
    .line 354
    invoke-direct {v10, v8}, Lc23;-><init>(La23;)V

    .line 355
    .line 356
    .line 357
    aput-object v10, v4, v5

    .line 358
    .line 359
    move v5, v9

    .line 360
    goto :goto_7

    .line 361
    :cond_9
    const-string v3, "android-support-nav:controller:backStack"

    .line 362
    .line 363
    invoke-virtual {v6, v3, v4}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 364
    .line 365
    .line 366
    :cond_a
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    if-nez v3, :cond_d

    .line 371
    .line 372
    if-nez v6, :cond_b

    .line 373
    .line 374
    new-instance v3, Landroid/os/Bundle;

    .line 375
    .line 376
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 377
    .line 378
    .line 379
    move-object v6, v3

    .line 380
    :cond_b
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 381
    .line 382
    .line 383
    move-result v3

    .line 384
    new-array v3, v3, [I

    .line 385
    .line 386
    new-instance v4, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    move v5, v1

    .line 400
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    if-eqz v8, :cond_c

    .line 405
    .line 406
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v8

    .line 410
    check-cast v8, Ljava/util/Map$Entry;

    .line 411
    .line 412
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    check-cast v9, Ljava/lang/Number;

    .line 417
    .line 418
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 419
    .line 420
    .line 421
    move-result v9

    .line 422
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v8

    .line 426
    check-cast v8, Ljava/lang/String;

    .line 427
    .line 428
    add-int/lit8 v10, v5, 0x1

    .line 429
    .line 430
    aput v9, v3, v5

    .line 431
    .line 432
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move v5, v10

    .line 436
    goto :goto_8

    .line 437
    :cond_c
    const-string v2, "android-support-nav:controller:backStackDestIds"

    .line 438
    .line 439
    invoke-virtual {v6, v2, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 440
    .line 441
    .line 442
    const-string v2, "android-support-nav:controller:backStackIds"

    .line 443
    .line 444
    invoke-virtual {v6, v2, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 445
    .line 446
    .line 447
    :cond_d
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    if-nez v2, :cond_12

    .line 452
    .line 453
    if-nez v6, :cond_e

    .line 454
    .line 455
    new-instance v2, Landroid/os/Bundle;

    .line 456
    .line 457
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 458
    .line 459
    .line 460
    move-object v6, v2

    .line 461
    :cond_e
    new-instance v2, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-eqz v3, :cond_11

    .line 479
    .line 480
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    check-cast v3, Ljava/util/Map$Entry;

    .line 485
    .line 486
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    check-cast v4, Ljava/lang/String;

    .line 491
    .line 492
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    check-cast v3, Lii;

    .line 497
    .line 498
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    iget v5, v3, Lii;->p:I

    .line 502
    .line 503
    new-array v5, v5, [Landroid/os/Parcelable;

    .line 504
    .line 505
    invoke-virtual {v3}, Ljava/util/AbstractList;->iterator()Ljava/util/Iterator;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    move v8, v1

    .line 510
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v9

    .line 514
    if-eqz v9, :cond_10

    .line 515
    .line 516
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v9

    .line 520
    add-int/lit8 v10, v8, 0x1

    .line 521
    .line 522
    if-ltz v8, :cond_f

    .line 523
    .line 524
    check-cast v9, Lc23;

    .line 525
    .line 526
    aput-object v9, v5, v8

    .line 527
    .line 528
    move v8, v10

    .line 529
    goto :goto_a

    .line 530
    :cond_f
    invoke-static {}, Lgb;->c0()V

    .line 531
    .line 532
    .line 533
    throw v7

    .line 534
    :cond_10
    const-string v3, "android-support-nav:controller:backStackStates:"

    .line 535
    .line 536
    invoke-static {v3, v4}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    invoke-virtual {v6, v3, v5}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 541
    .line 542
    .line 543
    goto :goto_9

    .line 544
    :cond_11
    const-string v0, "android-support-nav:controller:backStackStates"

    .line 545
    .line 546
    invoke-virtual {v6, v0, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 547
    .line 548
    .line 549
    :cond_12
    iget-boolean v0, p0, Lv23;->f:Z

    .line 550
    .line 551
    if-eqz v0, :cond_14

    .line 552
    .line 553
    if-nez v6, :cond_13

    .line 554
    .line 555
    new-instance v0, Landroid/os/Bundle;

    .line 556
    .line 557
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 558
    .line 559
    .line 560
    move-object v6, v0

    .line 561
    :cond_13
    const-string v0, "android-support-nav:controller:deepLinkHandled"

    .line 562
    .line 563
    iget-boolean p0, p0, Lv23;->f:Z

    .line 564
    .line 565
    invoke-virtual {v6, v0, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 566
    .line 567
    .line 568
    :cond_14
    if-nez v6, :cond_15

    .line 569
    .line 570
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 571
    .line 572
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    :cond_15
    return-object v6

    .line 576
    :pswitch_2
    check-cast p0, Lld1;

    .line 577
    .line 578
    invoke-virtual {p0}, Lld1;->W()Landroid/os/Bundle;

    .line 579
    .line 580
    .line 581
    move-result-object p0

    .line 582
    return-object p0

    .line 583
    :pswitch_3
    check-cast p0, Ly44;

    .line 584
    .line 585
    invoke-virtual {p0}, Ly44;->c()Ljava/util/Map;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    new-instance v0, Landroid/os/Bundle;

    .line 590
    .line 591
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 592
    .line 593
    .line 594
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 595
    .line 596
    .line 597
    move-result-object p0

    .line 598
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    if-eqz v1, :cond_17

    .line 607
    .line 608
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    check-cast v1, Ljava/util/Map$Entry;

    .line 613
    .line 614
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    check-cast v2, Ljava/lang/String;

    .line 619
    .line 620
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    check-cast v1, Ljava/util/List;

    .line 625
    .line 626
    instance-of v3, v1, Ljava/util/ArrayList;

    .line 627
    .line 628
    if-eqz v3, :cond_16

    .line 629
    .line 630
    check-cast v1, Ljava/util/ArrayList;

    .line 631
    .line 632
    goto :goto_c

    .line 633
    :cond_16
    new-instance v3, Ljava/util/ArrayList;

    .line 634
    .line 635
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 636
    .line 637
    .line 638
    move-object v1, v3

    .line 639
    :goto_c
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 640
    .line 641
    .line 642
    goto :goto_b

    .line 643
    :cond_17
    return-object v0

    .line 644
    nop

    .line 645
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
