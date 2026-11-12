.class public final Liu2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final f:Lzw1;

.field public static final g:Ln10;

.field public static final h:Ljava/util/HashMap;

.field public static final i:Liu2;

.field public static final j:Lpz1;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lzw1;

.field public d:Ljava/lang/String;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lrr2;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "charset"

    .line 12
    .line 13
    invoke-static {v1, v0}, Luc5;->d(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lp60;->a()Lp60;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2, v1}, Lp60;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lqw1;

    .line 25
    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    sget-object v3, Lyw1;->o:Lvw1;

    .line 29
    .line 30
    const-string v3, "expectedSize"

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    invoke-static {v4, v3}, Luc5;->f(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Luw1;

    .line 37
    .line 38
    invoke-direct {v3, v4}, Lpw1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1, v3}, Lp60;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {v3, v0}, Lqw1;->a(Ljava/lang/Object;)Lqw1;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lp60;->entrySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v1, v0

    .line 52
    check-cast v1, Ljava/util/AbstractCollection;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x1

    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    sget-object v0, Ls01;->t:Ls01;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    new-instance v1, Lue1;

    .line 65
    .line 66
    check-cast v0, Ln60;

    .line 67
    .line 68
    iget-object v3, v0, Ln60;->o:Ljava/util/Map;

    .line 69
    .line 70
    check-cast v3, Lp60;

    .line 71
    .line 72
    invoke-virtual {v3}, Lp60;->size()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-direct {v1, v3}, Lue1;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ln60;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v3, 0x0

    .line 84
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Ljava/util/Map$Entry;

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Luw1;

    .line 105
    .line 106
    invoke-virtual {v4}, Luw1;->f()Lgy3;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-virtual {v1, v5, v4}, Lue1;->x(Ljava/lang/Object;Ljava/lang/Object;)Lue1;

    .line 111
    .line 112
    .line 113
    iget v4, v4, Lgy3;->q:I

    .line 114
    .line 115
    add-int/2addr v3, v4

    .line 116
    goto :goto_0

    .line 117
    :cond_2
    new-instance v0, Lzw1;

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Lue1;->d(Z)Lly3;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-direct {v0, v1, v3}, Lzw1;-><init>(Lly3;I)V

    .line 124
    .line 125
    .line 126
    :goto_1
    sput-object v0, Liu2;->f:Lzw1;

    .line 127
    .line 128
    sget-object v0, Lo10;->q:Lo10;

    .line 129
    .line 130
    sget-object v1, Lo10;->r:Lo10;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance v3, Lt10;

    .line 136
    .line 137
    invoke-direct {v3, v1}, Lp10;-><init>(Lu10;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    new-instance v1, Ln10;

    .line 144
    .line 145
    invoke-direct {v1, v0, v3}, Ln10;-><init>(Lu10;Lu10;)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Lr10;

    .line 149
    .line 150
    const/16 v3, 0x20

    .line 151
    .line 152
    invoke-direct {v0, v3, v2}, Lr10;-><init>(CI)V

    .line 153
    .line 154
    .line 155
    new-instance v3, Ln10;

    .line 156
    .line 157
    invoke-direct {v3, v1, v0}, Ln10;-><init>(Lu10;Lu10;)V

    .line 158
    .line 159
    .line 160
    const-string v0, "()<>@,;:\\\"/[]?="

    .line 161
    .line 162
    invoke-static {v0}, Lu10;->b(Ljava/lang/String;)Lu10;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Lu10;->d()Lu10;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    new-instance v1, Ln10;

    .line 171
    .line 172
    invoke-direct {v1, v3, v0}, Ln10;-><init>(Lu10;Lu10;)V

    .line 173
    .line 174
    .line 175
    sput-object v1, Liu2;->g:Ln10;

    .line 176
    .line 177
    const-string v0, "\"\\\r"

    .line 178
    .line 179
    invoke-static {v0}, Lu10;->b(Ljava/lang/String;)Lu10;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Lu10;->d()Lu10;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const-string v0, " \t\r\n"

    .line 191
    .line 192
    invoke-static {v0}, Lu10;->b(Ljava/lang/String;)Lu10;

    .line 193
    .line 194
    .line 195
    new-instance v0, Ljava/util/HashMap;

    .line 196
    .line 197
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    sput-object v0, Liu2;->h:Ljava/util/HashMap;

    .line 201
    .line 202
    const-string v0, "*"

    .line 203
    .line 204
    invoke-static {v0, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v1, "text"

    .line 208
    .line 209
    invoke-static {v1, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-string v3, "image"

    .line 213
    .line 214
    invoke-static {v3, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    const-string v4, "audio"

    .line 218
    .line 219
    invoke-static {v4, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    const-string v5, "video"

    .line 223
    .line 224
    invoke-static {v5, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    const-string v6, "application"

    .line 228
    .line 229
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v7, "font"

    .line 233
    .line 234
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const-string v0, "cache-manifest"

    .line 238
    .line 239
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 240
    .line 241
    .line 242
    const-string v0, "css"

    .line 243
    .line 244
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 245
    .line 246
    .line 247
    const-string v0, "csv"

    .line 248
    .line 249
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 250
    .line 251
    .line 252
    const-string v0, "html"

    .line 253
    .line 254
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 255
    .line 256
    .line 257
    const-string v0, "calendar"

    .line 258
    .line 259
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 260
    .line 261
    .line 262
    const-string v0, "markdown"

    .line 263
    .line 264
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 265
    .line 266
    .line 267
    const-string v0, "plain"

    .line 268
    .line 269
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 270
    .line 271
    .line 272
    const-string v0, "javascript"

    .line 273
    .line 274
    invoke-static {v1, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 275
    .line 276
    .line 277
    const-string v8, "tab-separated-values"

    .line 278
    .line 279
    invoke-static {v1, v8}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 280
    .line 281
    .line 282
    const-string v8, "vcard"

    .line 283
    .line 284
    invoke-static {v1, v8}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 285
    .line 286
    .line 287
    const-string v8, "vnd.wap.wml"

    .line 288
    .line 289
    invoke-static {v1, v8}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 290
    .line 291
    .line 292
    const-string v8, "xml"

    .line 293
    .line 294
    invoke-static {v1, v8}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 295
    .line 296
    .line 297
    const-string v9, "vtt"

    .line 298
    .line 299
    invoke-static {v1, v9}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 300
    .line 301
    .line 302
    const-string v1, "bmp"

    .line 303
    .line 304
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    const-string v1, "x-canon-crw"

    .line 308
    .line 309
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    const-string v1, "gif"

    .line 313
    .line 314
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const-string v1, "vnd.microsoft.icon"

    .line 318
    .line 319
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    const-string v1, "jpeg"

    .line 323
    .line 324
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v1, "png"

    .line 328
    .line 329
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    const-string v1, "vnd.adobe.photoshop"

    .line 333
    .line 334
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const-string v1, "svg+xml"

    .line 338
    .line 339
    invoke-static {v3, v1}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 340
    .line 341
    .line 342
    const-string v1, "tiff"

    .line 343
    .line 344
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    const-string v1, "webp"

    .line 348
    .line 349
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    const-string v1, "heif"

    .line 353
    .line 354
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    const-string v1, "jp2"

    .line 358
    .line 359
    invoke-static {v3, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    const-string v1, "mp4"

    .line 363
    .line 364
    invoke-static {v4, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    const-string v3, "mpeg"

    .line 368
    .line 369
    invoke-static {v4, v3}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    const-string v9, "ogg"

    .line 373
    .line 374
    invoke-static {v4, v9}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    const-string v10, "webm"

    .line 378
    .line 379
    invoke-static {v4, v10}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    const-string v11, "l16"

    .line 383
    .line 384
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    const-string v11, "l24"

    .line 388
    .line 389
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    const-string v11, "basic"

    .line 393
    .line 394
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    const-string v11, "aac"

    .line 398
    .line 399
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    const-string v11, "vorbis"

    .line 403
    .line 404
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    const-string v11, "x-ms-wma"

    .line 408
    .line 409
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    const-string v11, "x-ms-wax"

    .line 413
    .line 414
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    const-string v11, "vnd.rn-realaudio"

    .line 418
    .line 419
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    const-string v11, "vnd.wave"

    .line 423
    .line 424
    invoke-static {v4, v11}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-static {v5, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v5, v3}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    invoke-static {v5, v9}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    const-string v1, "quicktime"

    .line 437
    .line 438
    invoke-static {v5, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-static {v5, v10}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    const-string v1, "x-ms-wmv"

    .line 445
    .line 446
    invoke-static {v5, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    const-string v1, "x-flv"

    .line 450
    .line 451
    invoke-static {v5, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    const-string v1, "3gpp"

    .line 455
    .line 456
    invoke-static {v5, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    const-string v1, "3gpp2"

    .line 460
    .line 461
    invoke-static {v5, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    invoke-static {v6, v8}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 465
    .line 466
    .line 467
    const-string v1, "atom+xml"

    .line 468
    .line 469
    invoke-static {v6, v1}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 470
    .line 471
    .line 472
    const-string v1, "x-bzip2"

    .line 473
    .line 474
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const-string v1, "dart"

    .line 478
    .line 479
    invoke-static {v6, v1}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 480
    .line 481
    .line 482
    const-string v1, "vnd.apple.pkpass"

    .line 483
    .line 484
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    const-string v1, "vnd.ms-fontobject"

    .line 488
    .line 489
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 490
    .line 491
    .line 492
    const-string v1, "epub+zip"

    .line 493
    .line 494
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    const-string v1, "x-www-form-urlencoded"

    .line 498
    .line 499
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    const-string v1, "pkcs12"

    .line 503
    .line 504
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    const-string v1, "binary"

    .line 508
    .line 509
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    const-string v1, "geo+json"

    .line 513
    .line 514
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    const-string v1, "x-gzip"

    .line 518
    .line 519
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    const-string v1, "hal+json"

    .line 523
    .line 524
    invoke-static {v6, v1}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 528
    .line 529
    .line 530
    const-string v0, "jose"

    .line 531
    .line 532
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    const-string v0, "jose+json"

    .line 536
    .line 537
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    const-string v0, "json"

    .line 541
    .line 542
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    sput-object v0, Liu2;->i:Liu2;

    .line 547
    .line 548
    const-string v0, "jwt"

    .line 549
    .line 550
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    const-string v0, "manifest+json"

    .line 554
    .line 555
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 556
    .line 557
    .line 558
    const-string v0, "vnd.google-earth.kml+xml"

    .line 559
    .line 560
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    const-string v0, "vnd.google-earth.kmz"

    .line 564
    .line 565
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    const-string v0, "mbox"

    .line 569
    .line 570
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    const-string v0, "x-apple-aspen-config"

    .line 574
    .line 575
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    const-string v0, "vnd.ms-excel"

    .line 579
    .line 580
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    const-string v0, "vnd.ms-outlook"

    .line 584
    .line 585
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    const-string v0, "vnd.ms-powerpoint"

    .line 589
    .line 590
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    const-string v0, "msword"

    .line 594
    .line 595
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    const-string v0, "dash+xml"

    .line 599
    .line 600
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    const-string v0, "wasm"

    .line 604
    .line 605
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    const-string v0, "x-nacl"

    .line 609
    .line 610
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    const-string v0, "x-pnacl"

    .line 614
    .line 615
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    const-string v0, "octet-stream"

    .line 619
    .line 620
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    invoke-static {v6, v9}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    const-string v0, "vnd.openxmlformats-officedocument.wordprocessingml.document"

    .line 627
    .line 628
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    const-string v0, "vnd.openxmlformats-officedocument.presentationml.presentation"

    .line 632
    .line 633
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    const-string v0, "vnd.openxmlformats-officedocument.spreadsheetml.sheet"

    .line 637
    .line 638
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    const-string v0, "vnd.oasis.opendocument.graphics"

    .line 642
    .line 643
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    const-string v0, "vnd.oasis.opendocument.presentation"

    .line 647
    .line 648
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 649
    .line 650
    .line 651
    const-string v0, "vnd.oasis.opendocument.spreadsheet"

    .line 652
    .line 653
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    const-string v0, "vnd.oasis.opendocument.text"

    .line 657
    .line 658
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    const-string v0, "opensearchdescription+xml"

    .line 662
    .line 663
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 664
    .line 665
    .line 666
    const-string v0, "pdf"

    .line 667
    .line 668
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    const-string v0, "postscript"

    .line 672
    .line 673
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    const-string v0, "protobuf"

    .line 677
    .line 678
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    const-string v0, "rdf+xml"

    .line 682
    .line 683
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 684
    .line 685
    .line 686
    const-string v0, "rtf"

    .line 687
    .line 688
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 689
    .line 690
    .line 691
    const-string v0, "font-sfnt"

    .line 692
    .line 693
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    const-string v0, "x-shockwave-flash"

    .line 697
    .line 698
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    const-string v0, "vnd.sketchup.skp"

    .line 702
    .line 703
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    .line 705
    .line 706
    const-string v0, "soap+xml"

    .line 707
    .line 708
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 709
    .line 710
    .line 711
    const-string v0, "x-tar"

    .line 712
    .line 713
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    const-string v0, "font-woff"

    .line 717
    .line 718
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    const-string v0, "font-woff2"

    .line 722
    .line 723
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    const-string v0, "xhtml+xml"

    .line 727
    .line 728
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 729
    .line 730
    .line 731
    const-string v0, "xrd+xml"

    .line 732
    .line 733
    invoke-static {v6, v0}, Liu2;->b(Ljava/lang/String;Ljava/lang/String;)Liu2;

    .line 734
    .line 735
    .line 736
    const-string v0, "zip"

    .line 737
    .line 738
    invoke-static {v6, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    const-string v0, "collection"

    .line 742
    .line 743
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    const-string v0, "otf"

    .line 747
    .line 748
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 749
    .line 750
    .line 751
    const-string v0, "sfnt"

    .line 752
    .line 753
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    const-string v0, "ttf"

    .line 757
    .line 758
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    .line 760
    .line 761
    const-string v0, "woff"

    .line 762
    .line 763
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    const-string v0, "woff2"

    .line 767
    .line 768
    invoke-static {v7, v0}, Liu2;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    new-instance v0, Luc0;

    .line 772
    .line 773
    const-string v1, "; "

    .line 774
    .line 775
    invoke-direct {v0, v1}, Luc0;-><init>(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    new-instance v1, Lpz1;

    .line 779
    .line 780
    invoke-direct {v1, v2, v0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    sput-object v1, Liu2;->j:Lpz1;

    .line 784
    .line 785
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lzw1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liu2;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Liu2;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Liu2;->c:Lzw1;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Liu2;

    .line 2
    .line 3
    sget-object v1, Ls01;->t:Ls01;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Liu2;-><init>(Ljava/lang/String;Ljava/lang/String;Lzw1;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Liu2;->h:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0, v0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Liu2;
    .locals 2

    .line 1
    new-instance v0, Liu2;

    .line 2
    .line 3
    sget-object v1, Liu2;->f:Lzw1;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Liu2;-><init>(Ljava/lang/String;Ljava/lang/String;Lzw1;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Liu2;->h:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {p0, v0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public final c()Lkg2;
    .locals 3

    .line 1
    iget-object p0, p0, Liu2;->c:Lzw1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzw1;->i()Lbx1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lzr2;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lzr2;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lhg3;

    .line 15
    .line 16
    const/16 v2, 0x1b

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lkg2;

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Lkg2;-><init>(Ljava/util/Map;Ljg2;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Liu2;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Liu2;

    .line 9
    .line 10
    iget-object v0, p0, Liu2;->a:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p1, Liu2;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Liu2;->b:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p1, Liu2;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Liu2;->c()Lkg2;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p1}, Liu2;->c()Lkg2;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0

    .line 46
    :cond_1
    const/4 p0, 0x0

    .line 47
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Liu2;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Liu2;->b:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p0}, Liu2;->c()Lkg2;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Liu2;->a:Ljava/lang/String;

    .line 12
    .line 13
    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Liu2;->e:I

    .line 22
    .line 23
    :cond_0
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Liu2;->d:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Liu2;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/16 v1, 0x2f

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Liu2;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Liu2;->c:Lzw1;

    .line 26
    .line 27
    iget v2, v1, Lzw1;->s:I

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const-string v2, "; "

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    new-instance v2, Lzr2;

    .line 38
    .line 39
    const/16 v3, 0x15

    .line 40
    .line 41
    invoke-direct {v2, v3}, Lzr2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v3, Lhg3;

    .line 45
    .line 46
    const/16 v4, 0x1b

    .line 47
    .line 48
    invoke-direct {v3, v4, v2}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ltz2;

    .line 52
    .line 53
    invoke-direct {v2, v1, v3}, Ltz2;-><init>(Lvb2;Lhg3;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lu1;->a()Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v2, Liu2;->j:Lpz1;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :try_start_0
    invoke-virtual {v2, v0, v1}, Lpz1;->u(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Liu2;->d:Ljava/lang/String;

    .line 77
    .line 78
    return-object v0

    .line 79
    :catch_0
    move-exception p0

    .line 80
    new-instance v0, Ljava/lang/AssertionError;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_1
    return-object v0
.end method
