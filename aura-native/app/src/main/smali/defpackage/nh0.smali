.class public final Ldefpackage/nh0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/HashMap;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_16

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Map$Entry;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    goto/16 :goto_14

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v2}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/4 v4, 0x1

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    move v3, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    :goto_1
    if-eqz v3, :cond_2

    .line 76
    .line 77
    move v3, v4

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    :goto_2
    if-eqz v3, :cond_3

    .line 90
    .line 91
    move v3, v4

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    :goto_3
    if-eqz v3, :cond_4

    .line 104
    .line 105
    move v3, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_4
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 108
    .line 109
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    :goto_4
    if-eqz v3, :cond_5

    .line 118
    .line 119
    move v3, v4

    .line 120
    goto :goto_5

    .line 121
    :cond_5
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 122
    .line 123
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    :goto_5
    if-eqz v3, :cond_6

    .line 132
    .line 133
    move v3, v4

    .line 134
    goto :goto_6

    .line 135
    :cond_6
    const-class v3, Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    :goto_6
    if-eqz v3, :cond_7

    .line 146
    .line 147
    move v3, v4

    .line 148
    goto :goto_7

    .line 149
    :cond_7
    const-class v3, [Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    :goto_7
    if-eqz v3, :cond_8

    .line 160
    .line 161
    move v3, v4

    .line 162
    goto :goto_8

    .line 163
    :cond_8
    const-class v3, [Ljava/lang/Byte;

    .line 164
    .line 165
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    :goto_8
    if-eqz v3, :cond_9

    .line 174
    .line 175
    move v3, v4

    .line 176
    goto :goto_9

    .line 177
    :cond_9
    const-class v3, [Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    :goto_9
    if-eqz v3, :cond_a

    .line 188
    .line 189
    move v3, v4

    .line 190
    goto :goto_a

    .line 191
    :cond_a
    const-class v3, [Ljava/lang/Long;

    .line 192
    .line 193
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    :goto_a
    if-eqz v3, :cond_b

    .line 202
    .line 203
    move v3, v4

    .line 204
    goto :goto_b

    .line 205
    :cond_b
    const-class v3, [Ljava/lang/Float;

    .line 206
    .line 207
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    :goto_b
    if-eqz v3, :cond_c

    .line 216
    .line 217
    move v3, v4

    .line 218
    goto :goto_c

    .line 219
    :cond_c
    const-class v3, [Ljava/lang/Double;

    .line 220
    .line 221
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    :goto_c
    if-eqz v3, :cond_d

    .line 230
    .line 231
    goto :goto_d

    .line 232
    :cond_d
    const-class v3, [Ljava/lang/String;

    .line 233
    .line 234
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    :goto_d
    if-eqz v4, :cond_e

    .line 243
    .line 244
    goto/16 :goto_14

    .line 245
    .line 246
    :cond_e
    const-class v3, [Z

    .line 247
    .line 248
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    const/4 v4, 0x0

    .line 257
    if-eqz v3, :cond_10

    .line 258
    .line 259
    check-cast v0, [Z

    .line 260
    .line 261
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 262
    .line 263
    array-length v2, v0

    .line 264
    new-array v3, v2, [Ljava/lang/Boolean;

    .line 265
    .line 266
    :goto_e
    if-ge v4, v2, :cond_f

    .line 267
    .line 268
    aget-boolean v5, v0, v4

    .line 269
    .line 270
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    aput-object v5, v3, v4

    .line 275
    .line 276
    add-int/lit8 v4, v4, 0x1

    .line 277
    .line 278
    goto :goto_e

    .line 279
    :cond_f
    move-object v0, v3

    .line 280
    goto/16 :goto_14

    .line 281
    .line 282
    :cond_10
    const-class v3, [B

    .line 283
    .line 284
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_11

    .line 293
    .line 294
    check-cast v0, [B

    .line 295
    .line 296
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 297
    .line 298
    array-length v2, v0

    .line 299
    new-array v3, v2, [Ljava/lang/Byte;

    .line 300
    .line 301
    :goto_f
    if-ge v4, v2, :cond_f

    .line 302
    .line 303
    aget-byte v5, v0, v4

    .line 304
    .line 305
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    aput-object v5, v3, v4

    .line 310
    .line 311
    add-int/lit8 v4, v4, 0x1

    .line 312
    .line 313
    goto :goto_f

    .line 314
    :cond_11
    const-class v3, [I

    .line 315
    .line 316
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    if-eqz v3, :cond_12

    .line 325
    .line 326
    check-cast v0, [I

    .line 327
    .line 328
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 329
    .line 330
    array-length v2, v0

    .line 331
    new-array v3, v2, [Ljava/lang/Integer;

    .line 332
    .line 333
    :goto_10
    if-ge v4, v2, :cond_f

    .line 334
    .line 335
    aget v5, v0, v4

    .line 336
    .line 337
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    aput-object v5, v3, v4

    .line 342
    .line 343
    add-int/lit8 v4, v4, 0x1

    .line 344
    .line 345
    goto :goto_10

    .line 346
    :cond_12
    const-class v3, [J

    .line 347
    .line 348
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-eqz v3, :cond_13

    .line 357
    .line 358
    check-cast v0, [J

    .line 359
    .line 360
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 361
    .line 362
    array-length v2, v0

    .line 363
    new-array v3, v2, [Ljava/lang/Long;

    .line 364
    .line 365
    :goto_11
    if-ge v4, v2, :cond_f

    .line 366
    .line 367
    aget-wide v5, v0, v4

    .line 368
    .line 369
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    aput-object v5, v3, v4

    .line 374
    .line 375
    add-int/lit8 v4, v4, 0x1

    .line 376
    .line 377
    goto :goto_11

    .line 378
    :cond_13
    const-class v3, [F

    .line 379
    .line 380
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    if-eqz v3, :cond_14

    .line 389
    .line 390
    check-cast v0, [F

    .line 391
    .line 392
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 393
    .line 394
    array-length v2, v0

    .line 395
    new-array v3, v2, [Ljava/lang/Float;

    .line 396
    .line 397
    :goto_12
    if-ge v4, v2, :cond_f

    .line 398
    .line 399
    aget v5, v0, v4

    .line 400
    .line 401
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    aput-object v5, v3, v4

    .line 406
    .line 407
    add-int/lit8 v4, v4, 0x1

    .line 408
    .line 409
    goto :goto_12

    .line 410
    :cond_14
    const-class v3, [D

    .line 411
    .line 412
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-virtual {v2, v3}, Ldefpackage/i30;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-eqz v3, :cond_15

    .line 421
    .line 422
    check-cast v0, [D

    .line 423
    .line 424
    sget-object v2, Ldefpackage/ki0;->a:Ljava/lang/String;

    .line 425
    .line 426
    array-length v2, v0

    .line 427
    new-array v3, v2, [Ljava/lang/Double;

    .line 428
    .line 429
    :goto_13
    if-ge v4, v2, :cond_f

    .line 430
    .line 431
    aget-wide v5, v0, v4

    .line 432
    .line 433
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    aput-object v5, v3, v4

    .line 438
    .line 439
    add-int/lit8 v4, v4, 0x1

    .line 440
    .line 441
    goto :goto_13

    .line 442
    :goto_14
    iget-object v2, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 443
    .line 444
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto/16 :goto_0

    .line 448
    .line 449
    :cond_15
    const-string p0, "Key "

    .line 450
    .line 451
    const-string p1, " has invalid type "

    .line 452
    .line 453
    invoke-static {p0, v1, p1, v2}, Ldefpackage/tb4;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    :cond_16
    return-void
.end method

.method public b(Ldefpackage/rc5;)Ldefpackage/gl4;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ldefpackage/gl4;

    .line 11
    .line 12
    return-object p0
.end method

.method public c(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ldefpackage/rc5;

    .line 36
    .line 37
    iget-object v3, v3, Ldefpackage/rc5;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v3, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Ljava/lang/Iterable;

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ldefpackage/rc5;

    .line 78
    .line 79
    invoke-interface {p0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Ljava/lang/Iterable;

    .line 88
    .line 89
    invoke-static {p0}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public d(Ldefpackage/rc5;)Ldefpackage/gl4;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/nh0;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ldefpackage/gl4;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ldefpackage/gl4;-><init>(Ldefpackage/rc5;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    :cond_0
    check-cast v0, Ldefpackage/gl4;

    .line 18
    .line 19
    return-object v0
.end method
