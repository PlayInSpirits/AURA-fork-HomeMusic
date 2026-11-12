.class public final Lq20;
.super Lau0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic G:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq20;->G:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Lq20;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final W(Lz34;Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p2, Lcom/eddyizm/tempus/model/Queue;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getTrackOrder()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    int-to-long v0, p0

    .line 26
    const/4 p0, 0x2

    .line 27
    invoke-interface {p1, p0, v0, v1}, Lz34;->c(IJ)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x3

    .line 31
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getLastPlay()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-interface {p1, p0, v0, v1}, Lz34;->c(IJ)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x4

    .line 39
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getPlayingChanged()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    invoke-interface {p1, p0, v0, v1}, Lz34;->c(IJ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getStreamId()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 v0, 0x5

    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Queue;->getStreamId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :goto_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 v0, 0x6

    .line 69
    if-nez p0, :cond_2

    .line 70
    .line 71
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_2
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    const/4 v0, 0x7

    .line 87
    int-to-long v1, p0

    .line 88
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const/16 v0, 0x8

    .line 96
    .line 97
    if-nez p0, :cond_3

    .line 98
    .line 99
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_3
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    const/16 v0, 0x9

    .line 115
    .line 116
    if-nez p0, :cond_4

    .line 117
    .line 118
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_4
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_4
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    const/16 v0, 0xa

    .line 134
    .line 135
    if-nez p0, :cond_5

    .line 136
    .line 137
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_5
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_5
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    const/16 v0, 0xb

    .line 153
    .line 154
    if-nez p0, :cond_6

    .line 155
    .line 156
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_6
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    int-to-long v1, p0

    .line 169
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 170
    .line 171
    .line 172
    :goto_6
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    const/16 v0, 0xc

    .line 177
    .line 178
    if-nez p0, :cond_7

    .line 179
    .line 180
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_7
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 189
    .line 190
    .line 191
    move-result p0

    .line 192
    int-to-long v1, p0

    .line 193
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 194
    .line 195
    .line 196
    :goto_7
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    const/16 v0, 0xd

    .line 201
    .line 202
    if-nez p0, :cond_8

    .line 203
    .line 204
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_8
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 213
    .line 214
    .line 215
    :goto_8
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    const/16 v0, 0xe

    .line 220
    .line 221
    if-nez p0, :cond_9

    .line 222
    .line 223
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 224
    .line 225
    .line 226
    goto :goto_9

    .line 227
    :cond_9
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :goto_9
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    const/16 v0, 0xf

    .line 239
    .line 240
    if-nez p0, :cond_a

    .line 241
    .line 242
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 243
    .line 244
    .line 245
    goto :goto_a

    .line 246
    :cond_a
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v1

    .line 254
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 255
    .line 256
    .line 257
    :goto_a
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    const/16 v0, 0x10

    .line 262
    .line 263
    if-nez p0, :cond_b

    .line 264
    .line 265
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 266
    .line 267
    .line 268
    goto :goto_b

    .line 269
    :cond_b
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 274
    .line 275
    .line 276
    :goto_b
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    const/16 v0, 0x11

    .line 281
    .line 282
    if-nez p0, :cond_c

    .line 283
    .line 284
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 285
    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_c
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    :goto_c
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    const/16 v0, 0x12

    .line 300
    .line 301
    if-nez p0, :cond_d

    .line 302
    .line 303
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 304
    .line 305
    .line 306
    goto :goto_d

    .line 307
    :cond_d
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 312
    .line 313
    .line 314
    :goto_d
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    const/16 v0, 0x13

    .line 319
    .line 320
    if-nez p0, :cond_e

    .line 321
    .line 322
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 323
    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_e
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 331
    .line 332
    .line 333
    :goto_e
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    const/16 v0, 0x14

    .line 338
    .line 339
    if-nez p0, :cond_f

    .line 340
    .line 341
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 342
    .line 343
    .line 344
    goto :goto_f

    .line 345
    :cond_f
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result p0

    .line 353
    int-to-long v1, p0

    .line 354
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 355
    .line 356
    .line 357
    :goto_f
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    const/16 v0, 0x15

    .line 362
    .line 363
    if-nez p0, :cond_10

    .line 364
    .line 365
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 366
    .line 367
    .line 368
    goto :goto_10

    .line 369
    :cond_10
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 374
    .line 375
    .line 376
    move-result p0

    .line 377
    int-to-long v1, p0

    .line 378
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 379
    .line 380
    .line 381
    :goto_10
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    const/16 v0, 0x16

    .line 386
    .line 387
    if-nez p0, :cond_11

    .line 388
    .line 389
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 390
    .line 391
    .line 392
    goto :goto_11

    .line 393
    :cond_11
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result p0

    .line 401
    int-to-long v1, p0

    .line 402
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 403
    .line 404
    .line 405
    :goto_11
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    const/16 v0, 0x17

    .line 410
    .line 411
    if-nez p0, :cond_12

    .line 412
    .line 413
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 414
    .line 415
    .line 416
    goto :goto_12

    .line 417
    :cond_12
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 422
    .line 423
    .line 424
    move-result p0

    .line 425
    int-to-long v1, p0

    .line 426
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 427
    .line 428
    .line 429
    :goto_12
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    const/16 v0, 0x18

    .line 434
    .line 435
    if-nez p0, :cond_13

    .line 436
    .line 437
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 438
    .line 439
    .line 440
    goto :goto_13

    .line 441
    :cond_13
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 446
    .line 447
    .line 448
    :goto_13
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    const/16 v0, 0x19

    .line 453
    .line 454
    int-to-long v1, p0

    .line 455
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    const/16 v0, 0x1a

    .line 463
    .line 464
    if-nez p0, :cond_14

    .line 465
    .line 466
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 467
    .line 468
    .line 469
    goto :goto_14

    .line 470
    :cond_14
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    int-to-long v1, p0

    .line 479
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 480
    .line 481
    .line 482
    :goto_14
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    const/16 v0, 0x1b

    .line 487
    .line 488
    if-nez p0, :cond_15

    .line 489
    .line 490
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 491
    .line 492
    .line 493
    goto :goto_15

    .line 494
    :cond_15
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 499
    .line 500
    .line 501
    move-result-wide v1

    .line 502
    invoke-interface {p1, v1, v2, v0}, Lz34;->d(DI)V

    .line 503
    .line 504
    .line 505
    :goto_15
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 506
    .line 507
    .line 508
    move-result-object p0

    .line 509
    const/16 v0, 0x1c

    .line 510
    .line 511
    if-nez p0, :cond_16

    .line 512
    .line 513
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 514
    .line 515
    .line 516
    goto :goto_16

    .line 517
    :cond_16
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 518
    .line 519
    .line 520
    move-result-object p0

    .line 521
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 522
    .line 523
    .line 524
    move-result-wide v1

    .line 525
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 526
    .line 527
    .line 528
    :goto_16
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 529
    .line 530
    .line 531
    move-result-object p0

    .line 532
    const/16 v0, 0x1d

    .line 533
    .line 534
    if-nez p0, :cond_17

    .line 535
    .line 536
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 537
    .line 538
    .line 539
    goto :goto_17

    .line 540
    :cond_17
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    int-to-long v1, p0

    .line 549
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 550
    .line 551
    .line 552
    :goto_17
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCreated()Ljava/util/Date;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    invoke-static {p0}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 557
    .line 558
    .line 559
    move-result-object p0

    .line 560
    const/16 v0, 0x1e

    .line 561
    .line 562
    if-nez p0, :cond_18

    .line 563
    .line 564
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 565
    .line 566
    .line 567
    goto :goto_18

    .line 568
    :cond_18
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 569
    .line 570
    .line 571
    move-result-wide v1

    .line 572
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 573
    .line 574
    .line 575
    :goto_18
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    invoke-static {p0}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    const/16 v0, 0x1f

    .line 584
    .line 585
    if-nez p0, :cond_19

    .line 586
    .line 587
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 588
    .line 589
    .line 590
    goto :goto_19

    .line 591
    :cond_19
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 592
    .line 593
    .line 594
    move-result-wide v1

    .line 595
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 596
    .line 597
    .line 598
    :goto_19
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    const/16 v0, 0x20

    .line 603
    .line 604
    if-nez p0, :cond_1a

    .line 605
    .line 606
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 607
    .line 608
    .line 609
    goto :goto_1a

    .line 610
    :cond_1a
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object p0

    .line 614
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 615
    .line 616
    .line 617
    :goto_1a
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object p0

    .line 621
    const/16 v0, 0x21

    .line 622
    .line 623
    if-nez p0, :cond_1b

    .line 624
    .line 625
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 626
    .line 627
    .line 628
    goto :goto_1b

    .line 629
    :cond_1b
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 634
    .line 635
    .line 636
    :goto_1b
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object p0

    .line 640
    const/16 v0, 0x22

    .line 641
    .line 642
    if-nez p0, :cond_1c

    .line 643
    .line 644
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 645
    .line 646
    .line 647
    goto :goto_1c

    .line 648
    :cond_1c
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object p0

    .line 652
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 653
    .line 654
    .line 655
    :goto_1c
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 656
    .line 657
    .line 658
    move-result-object p0

    .line 659
    const/16 v0, 0x23

    .line 660
    .line 661
    if-nez p0, :cond_1d

    .line 662
    .line 663
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 664
    .line 665
    .line 666
    goto :goto_1d

    .line 667
    :cond_1d
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 672
    .line 673
    .line 674
    move-result-wide v1

    .line 675
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 676
    .line 677
    .line 678
    :goto_1d
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    const/16 v0, 0x24

    .line 683
    .line 684
    if-nez p0, :cond_1e

    .line 685
    .line 686
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 687
    .line 688
    .line 689
    goto :goto_1e

    .line 690
    :cond_1e
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 695
    .line 696
    .line 697
    move-result p0

    .line 698
    int-to-long v1, p0

    .line 699
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 700
    .line 701
    .line 702
    :goto_1e
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    const/16 v0, 0x25

    .line 707
    .line 708
    if-nez p0, :cond_1f

    .line 709
    .line 710
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 711
    .line 712
    .line 713
    goto :goto_1f

    .line 714
    :cond_1f
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 715
    .line 716
    .line 717
    move-result-object p0

    .line 718
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 719
    .line 720
    .line 721
    move-result p0

    .line 722
    int-to-long v1, p0

    .line 723
    invoke-interface {p1, v0, v1, v2}, Lz34;->c(IJ)V

    .line 724
    .line 725
    .line 726
    :goto_1f
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object p0

    .line 730
    const/16 v0, 0x26

    .line 731
    .line 732
    if-nez p0, :cond_20

    .line 733
    .line 734
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 735
    .line 736
    .line 737
    goto :goto_20

    .line 738
    :cond_20
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object p0

    .line 742
    invoke-interface {p1, v0, p0}, Lz34;->r(ILjava/lang/String;)V

    .line 743
    .line 744
    .line 745
    :goto_20
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getReplayGain()Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    const/16 p2, 0x2c

    .line 750
    .line 751
    const/16 v0, 0x2b

    .line 752
    .line 753
    const/16 v1, 0x2a

    .line 754
    .line 755
    const/16 v2, 0x29

    .line 756
    .line 757
    const/16 v3, 0x28

    .line 758
    .line 759
    const/16 v4, 0x27

    .line 760
    .line 761
    if-eqz p0, :cond_27

    .line 762
    .line 763
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 764
    .line 765
    .line 766
    move-result-object v5

    .line 767
    if-nez v5, :cond_21

    .line 768
    .line 769
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 770
    .line 771
    .line 772
    goto :goto_21

    .line 773
    :cond_21
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 774
    .line 775
    .line 776
    move-result-object v5

    .line 777
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 778
    .line 779
    .line 780
    move-result v5

    .line 781
    float-to-double v5, v5

    .line 782
    invoke-interface {p1, v5, v6, v4}, Lz34;->d(DI)V

    .line 783
    .line 784
    .line 785
    :goto_21
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    if-nez v4, :cond_22

    .line 790
    .line 791
    invoke-interface {p1, v3}, Lz34;->e(I)V

    .line 792
    .line 793
    .line 794
    goto :goto_22

    .line 795
    :cond_22
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 800
    .line 801
    .line 802
    move-result v4

    .line 803
    float-to-double v4, v4

    .line 804
    invoke-interface {p1, v4, v5, v3}, Lz34;->d(DI)V

    .line 805
    .line 806
    .line 807
    :goto_22
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    if-nez v3, :cond_23

    .line 812
    .line 813
    invoke-interface {p1, v2}, Lz34;->e(I)V

    .line 814
    .line 815
    .line 816
    goto :goto_23

    .line 817
    :cond_23
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    float-to-double v3, v3

    .line 826
    invoke-interface {p1, v3, v4, v2}, Lz34;->d(DI)V

    .line 827
    .line 828
    .line 829
    :goto_23
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    if-nez v2, :cond_24

    .line 834
    .line 835
    invoke-interface {p1, v1}, Lz34;->e(I)V

    .line 836
    .line 837
    .line 838
    goto :goto_24

    .line 839
    :cond_24
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    float-to-double v2, v2

    .line 848
    invoke-interface {p1, v2, v3, v1}, Lz34;->d(DI)V

    .line 849
    .line 850
    .line 851
    :goto_24
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    if-nez v1, :cond_25

    .line 856
    .line 857
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 858
    .line 859
    .line 860
    goto :goto_25

    .line 861
    :cond_25
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    float-to-double v1, v1

    .line 870
    invoke-interface {p1, v1, v2, v0}, Lz34;->d(DI)V

    .line 871
    .line 872
    .line 873
    :goto_25
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    if-nez v0, :cond_26

    .line 878
    .line 879
    invoke-interface {p1, p2}, Lz34;->e(I)V

    .line 880
    .line 881
    .line 882
    return-void

    .line 883
    :cond_26
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 884
    .line 885
    .line 886
    move-result-object p0

    .line 887
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 888
    .line 889
    .line 890
    move-result p0

    .line 891
    float-to-double v0, p0

    .line 892
    invoke-interface {p1, v0, v1, p2}, Lz34;->d(DI)V

    .line 893
    .line 894
    .line 895
    return-void

    .line 896
    :cond_27
    invoke-interface {p1, v4}, Lz34;->e(I)V

    .line 897
    .line 898
    .line 899
    invoke-interface {p1, v3}, Lz34;->e(I)V

    .line 900
    .line 901
    .line 902
    invoke-interface {p1, v2}, Lz34;->e(I)V

    .line 903
    .line 904
    .line 905
    invoke-interface {p1, v1}, Lz34;->e(I)V

    .line 906
    .line 907
    .line 908
    invoke-interface {p1, v0}, Lz34;->e(I)V

    .line 909
    .line 910
    .line 911
    invoke-interface {p1, p2}, Lz34;->e(I)V

    .line 912
    .line 913
    .line 914
    return-void
.end method


# virtual methods
.method public final c(Lz34;Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget v2, v1, Lq20;->G:I

    .line 6
    .line 7
    const/16 v3, 0x1b

    .line 8
    .line 9
    const/16 v4, 0x1c

    .line 10
    .line 11
    const/16 v5, 0x1d

    .line 12
    .line 13
    const/16 v15, 0xa

    .line 14
    .line 15
    const/16 v14, 0x8

    .line 16
    .line 17
    const/4 v13, 0x7

    .line 18
    const/16 v12, 0x9

    .line 19
    .line 20
    const/4 v11, 0x6

    .line 21
    const/4 v10, 0x3

    .line 22
    const/4 v9, 0x4

    .line 23
    const/4 v8, 0x5

    .line 24
    const/4 v7, 0x1

    .line 25
    const/4 v6, 0x2

    .line 26
    packed-switch v2, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p2

    .line 30
    .line 31
    check-cast v1, Lcom/eddyizm/tempus/model/Server;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-nez v2, :cond_2

    .line 72
    .line 73
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-nez v2, :cond_3

    .line 89
    .line 90
    invoke-interface {v0, v9}, Lz34;->e(I)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v0, v9, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-nez v2, :cond_4

    .line 106
    .line 107
    invoke-interface {v0, v8}, Lz34;->e(I)V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {v0, v8, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :goto_4
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    invoke-interface {v0, v11}, Lz34;->e(I)V

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_5
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-interface {v0, v11, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :goto_5
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getTimestamp()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    invoke-interface {v0, v13, v2, v3}, Lz34;->c(IJ)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->isLowSecurity()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    int-to-long v2, v2

    .line 147
    invoke-interface {v0, v14, v2, v3}, Lz34;->c(IJ)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-nez v2, :cond_6

    .line 155
    .line 156
    invoke-interface {v0, v12}, Lz34;->e(I)V

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_6
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-interface {v0, v12, v1}, Lz34;->r(ILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :goto_6
    return-void

    .line 168
    :pswitch_0
    move-object/from16 v1, p2

    .line 169
    .line 170
    check-cast v1, Lcom/eddyizm/tempus/model/RecentSearch;

    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/RecentSearch;->getSearch()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    if-nez v2, :cond_7

    .line 177
    .line 178
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_7
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/RecentSearch;->getSearch()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 187
    .line 188
    .line 189
    :goto_7
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/RecentSearch;->getTimestamp()J

    .line 190
    .line 191
    .line 192
    move-result-wide v1

    .line 193
    invoke-interface {v0, v6, v1, v2}, Lz34;->c(IJ)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :pswitch_1
    invoke-direct/range {p0 .. p2}, Lq20;->W(Lz34;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_2
    move-object/from16 v1, p2

    .line 202
    .line 203
    check-cast v1, Lcom/eddyizm/tempus/model/PlaylistSong;

    .line 204
    .line 205
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getPlaylistId()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    if-nez v2, :cond_8

    .line 210
    .line 211
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_8
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getPlaylistId()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :goto_8
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getId()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    if-nez v2, :cond_9

    .line 227
    .line 228
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_9
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getId()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_9
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getTitle()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    if-nez v2, :cond_a

    .line 244
    .line 245
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 246
    .line 247
    .line 248
    goto :goto_a

    .line 249
    :cond_a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getTitle()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 254
    .line 255
    .line 256
    :goto_a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getArtist()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    if-nez v2, :cond_b

    .line 261
    .line 262
    invoke-interface {v0, v9}, Lz34;->e(I)V

    .line 263
    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getArtist()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-interface {v0, v9, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :goto_b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getAlbum()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    if-nez v2, :cond_c

    .line 278
    .line 279
    invoke-interface {v0, v8}, Lz34;->e(I)V

    .line 280
    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getAlbum()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-interface {v0, v8, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 288
    .line 289
    .line 290
    :goto_c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getTrack()Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    if-nez v2, :cond_d

    .line 295
    .line 296
    invoke-interface {v0, v11}, Lz34;->e(I)V

    .line 297
    .line 298
    .line 299
    goto :goto_d

    .line 300
    :cond_d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getTrack()Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v2

    .line 304
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    int-to-long v2, v2

    .line 309
    invoke-interface {v0, v11, v2, v3}, Lz34;->c(IJ)V

    .line 310
    .line 311
    .line 312
    :goto_d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getCoverArtId()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    if-nez v2, :cond_e

    .line 317
    .line 318
    invoke-interface {v0, v13}, Lz34;->e(I)V

    .line 319
    .line 320
    .line 321
    goto :goto_e

    .line 322
    :cond_e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getCoverArtId()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-interface {v0, v13, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :goto_e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getDuration()Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    if-nez v2, :cond_f

    .line 334
    .line 335
    invoke-interface {v0, v14}, Lz34;->e(I)V

    .line 336
    .line 337
    .line 338
    goto :goto_f

    .line 339
    :cond_f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getDuration()Ljava/lang/Integer;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    int-to-long v2, v2

    .line 348
    invoke-interface {v0, v14, v2, v3}, Lz34;->c(IJ)V

    .line 349
    .line 350
    .line 351
    :goto_f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getAlbumId()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-nez v2, :cond_10

    .line 356
    .line 357
    invoke-interface {v0, v12}, Lz34;->e(I)V

    .line 358
    .line 359
    .line 360
    goto :goto_10

    .line 361
    :cond_10
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getAlbumId()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-interface {v0, v12, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 366
    .line 367
    .line 368
    :goto_10
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getArtistId()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    if-nez v2, :cond_11

    .line 373
    .line 374
    invoke-interface {v0, v15}, Lz34;->e(I)V

    .line 375
    .line 376
    .line 377
    goto :goto_11

    .line 378
    :cond_11
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/PlaylistSong;->getArtistId()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-interface {v0, v15, v1}, Lz34;->r(ILjava/lang/String;)V

    .line 383
    .line 384
    .line 385
    :goto_11
    return-void

    .line 386
    :pswitch_3
    move-object/from16 v1, p2

    .line 387
    .line 388
    check-cast v1, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 389
    .line 390
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getSongId()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v2

    .line 394
    if-nez v2, :cond_12

    .line 395
    .line 396
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 397
    .line 398
    .line 399
    goto :goto_12

    .line 400
    :cond_12
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getSongId()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 405
    .line 406
    .line 407
    :goto_12
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getArtist()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    if-nez v2, :cond_13

    .line 412
    .line 413
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 414
    .line 415
    .line 416
    goto :goto_13

    .line 417
    :cond_13
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getArtist()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 422
    .line 423
    .line 424
    :goto_13
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getTitle()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    if-nez v2, :cond_14

    .line 429
    .line 430
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 431
    .line 432
    .line 433
    goto :goto_14

    .line 434
    :cond_14
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getTitle()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :goto_14
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getLyrics()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    if-nez v2, :cond_15

    .line 446
    .line 447
    invoke-interface {v0, v9}, Lz34;->e(I)V

    .line 448
    .line 449
    .line 450
    goto :goto_15

    .line 451
    :cond_15
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getLyrics()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    invoke-interface {v0, v9, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 456
    .line 457
    .line 458
    :goto_15
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getStructuredLyrics()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    if-nez v2, :cond_16

    .line 463
    .line 464
    invoke-interface {v0, v8}, Lz34;->e(I)V

    .line 465
    .line 466
    .line 467
    goto :goto_16

    .line 468
    :cond_16
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getStructuredLyrics()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-interface {v0, v8, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 473
    .line 474
    .line 475
    :goto_16
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/LyricsCache;->getUpdatedAt()J

    .line 476
    .line 477
    .line 478
    move-result-wide v1

    .line 479
    invoke-interface {v0, v11, v1, v2}, Lz34;->c(IJ)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :pswitch_4
    move-object/from16 v1, p2

    .line 484
    .line 485
    check-cast v1, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 486
    .line 487
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-nez v2, :cond_17

    .line 492
    .line 493
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 494
    .line 495
    .line 496
    goto :goto_17

    .line 497
    :cond_17
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 502
    .line 503
    .line 504
    :goto_17
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getName()Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    if-nez v2, :cond_18

    .line 509
    .line 510
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 511
    .line 512
    .line 513
    goto :goto_18

    .line 514
    :cond_18
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getName()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 519
    .line 520
    .line 521
    :goto_18
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getStreamUrl()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    if-nez v2, :cond_19

    .line 526
    .line 527
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 528
    .line 529
    .line 530
    goto :goto_19

    .line 531
    :cond_19
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getStreamUrl()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :goto_19
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getHomePageUrl()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    if-nez v2, :cond_1a

    .line 543
    .line 544
    invoke-interface {v0, v9}, Lz34;->e(I)V

    .line 545
    .line 546
    .line 547
    goto :goto_1a

    .line 548
    :cond_1a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getHomePageUrl()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v2

    .line 552
    invoke-interface {v0, v9, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 553
    .line 554
    .line 555
    :goto_1a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getSource()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    if-nez v2, :cond_1b

    .line 560
    .line 561
    invoke-interface {v0, v8}, Lz34;->e(I)V

    .line 562
    .line 563
    .line 564
    goto :goto_1b

    .line 565
    :cond_1b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getSource()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    invoke-interface {v0, v8, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 570
    .line 571
    .line 572
    :goto_1b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    if-nez v2, :cond_1c

    .line 577
    .line 578
    invoke-interface {v0, v11}, Lz34;->e(I)V

    .line 579
    .line 580
    .line 581
    goto :goto_1c

    .line 582
    :cond_1c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-interface {v0, v11, v1}, Lz34;->r(ILjava/lang/String;)V

    .line 587
    .line 588
    .line 589
    :goto_1c
    return-void

    .line 590
    :pswitch_5
    move-object/from16 v1, p2

    .line 591
    .line 592
    check-cast v1, Lcom/eddyizm/tempus/model/Favorite;

    .line 593
    .line 594
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getTimestamp()J

    .line 595
    .line 596
    .line 597
    move-result-wide v2

    .line 598
    invoke-interface {v0, v7, v2, v3}, Lz34;->c(IJ)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getSongId()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    if-nez v2, :cond_1d

    .line 606
    .line 607
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 608
    .line 609
    .line 610
    goto :goto_1d

    .line 611
    :cond_1d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getSongId()Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v2

    .line 615
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 616
    .line 617
    .line 618
    :goto_1d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getAlbumId()Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    if-nez v2, :cond_1e

    .line 623
    .line 624
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 625
    .line 626
    .line 627
    goto :goto_1e

    .line 628
    :cond_1e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getAlbumId()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 633
    .line 634
    .line 635
    :goto_1e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getArtistId()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    if-nez v2, :cond_1f

    .line 640
    .line 641
    invoke-interface {v0, v9}, Lz34;->e(I)V

    .line 642
    .line 643
    .line 644
    goto :goto_1f

    .line 645
    :cond_1f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getArtistId()Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    invoke-interface {v0, v9, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 650
    .line 651
    .line 652
    :goto_1f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Favorite;->getToStar()Z

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    int-to-long v1, v1

    .line 657
    invoke-interface {v0, v8, v1, v2}, Lz34;->c(IJ)V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :pswitch_6
    move-object/from16 v1, p2

    .line 662
    .line 663
    check-cast v1, Lcom/eddyizm/tempus/model/Download;

    .line 664
    .line 665
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object v2

    .line 669
    if-nez v2, :cond_20

    .line 670
    .line 671
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 672
    .line 673
    .line 674
    goto :goto_20

    .line 675
    :cond_20
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 680
    .line 681
    .line 682
    :goto_20
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    if-nez v2, :cond_21

    .line 687
    .line 688
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 689
    .line 690
    .line 691
    goto :goto_21

    .line 692
    :cond_21
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 697
    .line 698
    .line 699
    :goto_21
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistName()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    if-nez v2, :cond_22

    .line 704
    .line 705
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 706
    .line 707
    .line 708
    goto :goto_22

    .line 709
    :cond_22
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistName()Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 714
    .line 715
    .line 716
    :goto_22
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getDownloadState()I

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    int-to-long v6, v2

    .line 721
    invoke-interface {v0, v9, v6, v7}, Lz34;->c(IJ)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v2

    .line 728
    if-nez v2, :cond_23

    .line 729
    .line 730
    invoke-interface {v0, v8}, Lz34;->e(I)V

    .line 731
    .line 732
    .line 733
    goto :goto_23

    .line 734
    :cond_23
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v2

    .line 738
    invoke-interface {v0, v8, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 739
    .line 740
    .line 741
    :goto_23
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    if-nez v2, :cond_24

    .line 746
    .line 747
    invoke-interface {v0, v11}, Lz34;->e(I)V

    .line 748
    .line 749
    .line 750
    goto :goto_24

    .line 751
    :cond_24
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    invoke-interface {v0, v11, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 756
    .line 757
    .line 758
    :goto_24
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    int-to-long v6, v2

    .line 763
    invoke-interface {v0, v13, v6, v7}, Lz34;->c(IJ)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    if-nez v2, :cond_25

    .line 771
    .line 772
    invoke-interface {v0, v14}, Lz34;->e(I)V

    .line 773
    .line 774
    .line 775
    goto :goto_25

    .line 776
    :cond_25
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    invoke-interface {v0, v14, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 781
    .line 782
    .line 783
    :goto_25
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    if-nez v2, :cond_26

    .line 788
    .line 789
    invoke-interface {v0, v12}, Lz34;->e(I)V

    .line 790
    .line 791
    .line 792
    goto :goto_26

    .line 793
    :cond_26
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-interface {v0, v12, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 798
    .line 799
    .line 800
    :goto_26
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v2

    .line 804
    if-nez v2, :cond_27

    .line 805
    .line 806
    invoke-interface {v0, v15}, Lz34;->e(I)V

    .line 807
    .line 808
    .line 809
    goto :goto_27

    .line 810
    :cond_27
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-interface {v0, v15, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 815
    .line 816
    .line 817
    :goto_27
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    const/16 v6, 0xb

    .line 822
    .line 823
    if-nez v2, :cond_28

    .line 824
    .line 825
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 826
    .line 827
    .line 828
    goto :goto_28

    .line 829
    :cond_28
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    int-to-long v7, v2

    .line 838
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 839
    .line 840
    .line 841
    :goto_28
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    const/16 v6, 0xc

    .line 846
    .line 847
    if-nez v2, :cond_29

    .line 848
    .line 849
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 850
    .line 851
    .line 852
    goto :goto_29

    .line 853
    :cond_29
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    int-to-long v7, v2

    .line 862
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 863
    .line 864
    .line 865
    :goto_29
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const/16 v6, 0xd

    .line 870
    .line 871
    if-nez v2, :cond_2a

    .line 872
    .line 873
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 874
    .line 875
    .line 876
    goto :goto_2a

    .line 877
    :cond_2a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 882
    .line 883
    .line 884
    :goto_2a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    const/16 v6, 0xe

    .line 889
    .line 890
    if-nez v2, :cond_2b

    .line 891
    .line 892
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 893
    .line 894
    .line 895
    goto :goto_2b

    .line 896
    :cond_2b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 901
    .line 902
    .line 903
    :goto_2b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    const/16 v6, 0xf

    .line 908
    .line 909
    if-nez v2, :cond_2c

    .line 910
    .line 911
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 912
    .line 913
    .line 914
    goto :goto_2c

    .line 915
    :cond_2c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 916
    .line 917
    .line 918
    move-result-object v2

    .line 919
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 920
    .line 921
    .line 922
    move-result-wide v7

    .line 923
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 924
    .line 925
    .line 926
    :goto_2c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    const/16 v6, 0x10

    .line 931
    .line 932
    if-nez v2, :cond_2d

    .line 933
    .line 934
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 935
    .line 936
    .line 937
    goto :goto_2d

    .line 938
    :cond_2d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 943
    .line 944
    .line 945
    :goto_2d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    const/16 v6, 0x11

    .line 950
    .line 951
    if-nez v2, :cond_2e

    .line 952
    .line 953
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 954
    .line 955
    .line 956
    goto :goto_2e

    .line 957
    :cond_2e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 962
    .line 963
    .line 964
    :goto_2e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v2

    .line 968
    const/16 v6, 0x12

    .line 969
    .line 970
    if-nez v2, :cond_2f

    .line 971
    .line 972
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 973
    .line 974
    .line 975
    goto :goto_2f

    .line 976
    :cond_2f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 981
    .line 982
    .line 983
    :goto_2f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    const/16 v6, 0x13

    .line 988
    .line 989
    if-nez v2, :cond_30

    .line 990
    .line 991
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 992
    .line 993
    .line 994
    goto :goto_30

    .line 995
    :cond_30
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    :goto_30
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v2

    .line 1006
    const/16 v6, 0x14

    .line 1007
    .line 1008
    if-nez v2, :cond_31

    .line 1009
    .line 1010
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1011
    .line 1012
    .line 1013
    goto :goto_31

    .line 1014
    :cond_31
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v2

    .line 1018
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1019
    .line 1020
    .line 1021
    move-result v2

    .line 1022
    int-to-long v7, v2

    .line 1023
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1024
    .line 1025
    .line 1026
    :goto_31
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    const/16 v6, 0x15

    .line 1031
    .line 1032
    if-nez v2, :cond_32

    .line 1033
    .line 1034
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_32

    .line 1038
    :cond_32
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    int-to-long v7, v2

    .line 1047
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1048
    .line 1049
    .line 1050
    :goto_32
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    const/16 v6, 0x16

    .line 1055
    .line 1056
    if-nez v2, :cond_33

    .line 1057
    .line 1058
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1059
    .line 1060
    .line 1061
    goto :goto_33

    .line 1062
    :cond_33
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1067
    .line 1068
    .line 1069
    move-result v2

    .line 1070
    int-to-long v7, v2

    .line 1071
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1072
    .line 1073
    .line 1074
    :goto_33
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    const/16 v6, 0x17

    .line 1079
    .line 1080
    if-nez v2, :cond_34

    .line 1081
    .line 1082
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_34

    .line 1086
    :cond_34
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v2

    .line 1090
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1091
    .line 1092
    .line 1093
    move-result v2

    .line 1094
    int-to-long v7, v2

    .line 1095
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1096
    .line 1097
    .line 1098
    :goto_34
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    const/16 v6, 0x18

    .line 1103
    .line 1104
    if-nez v2, :cond_35

    .line 1105
    .line 1106
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_35

    .line 1110
    :cond_35
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1115
    .line 1116
    .line 1117
    :goto_35
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    const/16 v6, 0x19

    .line 1122
    .line 1123
    int-to-long v7, v2

    .line 1124
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1125
    .line 1126
    .line 1127
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v2

    .line 1131
    const/16 v6, 0x1a

    .line 1132
    .line 1133
    if-nez v2, :cond_36

    .line 1134
    .line 1135
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1136
    .line 1137
    .line 1138
    goto :goto_36

    .line 1139
    :cond_36
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v2

    .line 1143
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1144
    .line 1145
    .line 1146
    move-result v2

    .line 1147
    int-to-long v7, v2

    .line 1148
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1149
    .line 1150
    .line 1151
    :goto_36
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    if-nez v2, :cond_37

    .line 1156
    .line 1157
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 1158
    .line 1159
    .line 1160
    goto :goto_37

    .line 1161
    :cond_37
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v2

    .line 1165
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1166
    .line 1167
    .line 1168
    move-result-wide v6

    .line 1169
    invoke-interface {v0, v6, v7, v3}, Lz34;->d(DI)V

    .line 1170
    .line 1171
    .line 1172
    :goto_37
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v2

    .line 1176
    if-nez v2, :cond_38

    .line 1177
    .line 1178
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_38

    .line 1182
    :cond_38
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1187
    .line 1188
    .line 1189
    move-result-wide v2

    .line 1190
    invoke-interface {v0, v4, v2, v3}, Lz34;->c(IJ)V

    .line 1191
    .line 1192
    .line 1193
    :goto_38
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v2

    .line 1197
    if-nez v2, :cond_39

    .line 1198
    .line 1199
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 1200
    .line 1201
    .line 1202
    goto :goto_39

    .line 1203
    :cond_39
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v2

    .line 1207
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1208
    .line 1209
    .line 1210
    move-result v2

    .line 1211
    int-to-long v2, v2

    .line 1212
    invoke-interface {v0, v5, v2, v3}, Lz34;->c(IJ)V

    .line 1213
    .line 1214
    .line 1215
    :goto_39
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCreated()Ljava/util/Date;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v2

    .line 1219
    invoke-static {v2}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    if-nez v2, :cond_3a

    .line 1224
    .line 1225
    const/16 v3, 0x1e

    .line 1226
    .line 1227
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 1228
    .line 1229
    .line 1230
    goto :goto_3a

    .line 1231
    :cond_3a
    const/16 v3, 0x1e

    .line 1232
    .line 1233
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v4

    .line 1237
    invoke-interface {v0, v3, v4, v5}, Lz34;->c(IJ)V

    .line 1238
    .line 1239
    .line 1240
    :goto_3a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v2

    .line 1244
    invoke-static {v2}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v2

    .line 1248
    if-nez v2, :cond_3b

    .line 1249
    .line 1250
    const/16 v3, 0x1f

    .line 1251
    .line 1252
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 1253
    .line 1254
    .line 1255
    goto :goto_3b

    .line 1256
    :cond_3b
    const/16 v3, 0x1f

    .line 1257
    .line 1258
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1259
    .line 1260
    .line 1261
    move-result-wide v4

    .line 1262
    invoke-interface {v0, v3, v4, v5}, Lz34;->c(IJ)V

    .line 1263
    .line 1264
    .line 1265
    :goto_3b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    if-nez v2, :cond_3c

    .line 1270
    .line 1271
    const/16 v2, 0x20

    .line 1272
    .line 1273
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1274
    .line 1275
    .line 1276
    goto :goto_3c

    .line 1277
    :cond_3c
    const/16 v2, 0x20

    .line 1278
    .line 1279
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v3

    .line 1283
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    :goto_3c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v2

    .line 1290
    if-nez v2, :cond_3d

    .line 1291
    .line 1292
    const/16 v2, 0x21

    .line 1293
    .line 1294
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_3d

    .line 1298
    :cond_3d
    const/16 v2, 0x21

    .line 1299
    .line 1300
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v3

    .line 1304
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 1305
    .line 1306
    .line 1307
    :goto_3d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v2

    .line 1311
    if-nez v2, :cond_3e

    .line 1312
    .line 1313
    const/16 v2, 0x22

    .line 1314
    .line 1315
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1316
    .line 1317
    .line 1318
    goto :goto_3e

    .line 1319
    :cond_3e
    const/16 v2, 0x22

    .line 1320
    .line 1321
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    :goto_3e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    if-nez v2, :cond_3f

    .line 1333
    .line 1334
    const/16 v2, 0x23

    .line 1335
    .line 1336
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1337
    .line 1338
    .line 1339
    goto :goto_3f

    .line 1340
    :cond_3f
    const/16 v2, 0x23

    .line 1341
    .line 1342
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v3

    .line 1346
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 1347
    .line 1348
    .line 1349
    move-result-wide v3

    .line 1350
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 1351
    .line 1352
    .line 1353
    :goto_3f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v2

    .line 1357
    if-nez v2, :cond_40

    .line 1358
    .line 1359
    const/16 v2, 0x24

    .line 1360
    .line 1361
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1362
    .line 1363
    .line 1364
    goto :goto_40

    .line 1365
    :cond_40
    const/16 v2, 0x24

    .line 1366
    .line 1367
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v3

    .line 1371
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1372
    .line 1373
    .line 1374
    move-result v3

    .line 1375
    int-to-long v3, v3

    .line 1376
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 1377
    .line 1378
    .line 1379
    :goto_40
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    if-nez v2, :cond_41

    .line 1384
    .line 1385
    const/16 v2, 0x25

    .line 1386
    .line 1387
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1388
    .line 1389
    .line 1390
    goto :goto_41

    .line 1391
    :cond_41
    const/16 v2, 0x25

    .line 1392
    .line 1393
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v3

    .line 1397
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1398
    .line 1399
    .line 1400
    move-result v3

    .line 1401
    int-to-long v3, v3

    .line 1402
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 1403
    .line 1404
    .line 1405
    :goto_41
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    if-nez v2, :cond_42

    .line 1410
    .line 1411
    const/16 v2, 0x26

    .line 1412
    .line 1413
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1414
    .line 1415
    .line 1416
    goto :goto_42

    .line 1417
    :cond_42
    const/16 v2, 0x26

    .line 1418
    .line 1419
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 1424
    .line 1425
    .line 1426
    :goto_42
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getReplayGain()Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v1

    .line 1430
    const/16 v2, 0x2c

    .line 1431
    .line 1432
    const/16 v3, 0x2b

    .line 1433
    .line 1434
    const/16 v4, 0x2a

    .line 1435
    .line 1436
    const/16 v5, 0x29

    .line 1437
    .line 1438
    const/16 v6, 0x28

    .line 1439
    .line 1440
    const/16 v7, 0x27

    .line 1441
    .line 1442
    if-eqz v1, :cond_49

    .line 1443
    .line 1444
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v8

    .line 1448
    if-nez v8, :cond_43

    .line 1449
    .line 1450
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 1451
    .line 1452
    .line 1453
    goto :goto_43

    .line 1454
    :cond_43
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v8

    .line 1458
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 1459
    .line 1460
    .line 1461
    move-result v8

    .line 1462
    float-to-double v8, v8

    .line 1463
    invoke-interface {v0, v8, v9, v7}, Lz34;->d(DI)V

    .line 1464
    .line 1465
    .line 1466
    :goto_43
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 1467
    .line 1468
    .line 1469
    move-result-object v7

    .line 1470
    if-nez v7, :cond_44

    .line 1471
    .line 1472
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1473
    .line 1474
    .line 1475
    goto :goto_44

    .line 1476
    :cond_44
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v7

    .line 1480
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 1481
    .line 1482
    .line 1483
    move-result v7

    .line 1484
    float-to-double v7, v7

    .line 1485
    invoke-interface {v0, v7, v8, v6}, Lz34;->d(DI)V

    .line 1486
    .line 1487
    .line 1488
    :goto_44
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v6

    .line 1492
    if-nez v6, :cond_45

    .line 1493
    .line 1494
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 1495
    .line 1496
    .line 1497
    goto :goto_45

    .line 1498
    :cond_45
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v6

    .line 1502
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 1503
    .line 1504
    .line 1505
    move-result v6

    .line 1506
    float-to-double v6, v6

    .line 1507
    invoke-interface {v0, v6, v7, v5}, Lz34;->d(DI)V

    .line 1508
    .line 1509
    .line 1510
    :goto_45
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v5

    .line 1514
    if-nez v5, :cond_46

    .line 1515
    .line 1516
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 1517
    .line 1518
    .line 1519
    goto :goto_46

    .line 1520
    :cond_46
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v5

    .line 1524
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 1525
    .line 1526
    .line 1527
    move-result v5

    .line 1528
    float-to-double v5, v5

    .line 1529
    invoke-interface {v0, v5, v6, v4}, Lz34;->d(DI)V

    .line 1530
    .line 1531
    .line 1532
    :goto_46
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v4

    .line 1536
    if-nez v4, :cond_47

    .line 1537
    .line 1538
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 1539
    .line 1540
    .line 1541
    goto :goto_47

    .line 1542
    :cond_47
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v4

    .line 1546
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 1547
    .line 1548
    .line 1549
    move-result v4

    .line 1550
    float-to-double v4, v4

    .line 1551
    invoke-interface {v0, v4, v5, v3}, Lz34;->d(DI)V

    .line 1552
    .line 1553
    .line 1554
    :goto_47
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v3

    .line 1558
    if-nez v3, :cond_48

    .line 1559
    .line 1560
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1561
    .line 1562
    .line 1563
    goto :goto_48

    .line 1564
    :cond_48
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v1

    .line 1568
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 1569
    .line 1570
    .line 1571
    move-result v1

    .line 1572
    float-to-double v3, v1

    .line 1573
    invoke-interface {v0, v3, v4, v2}, Lz34;->d(DI)V

    .line 1574
    .line 1575
    .line 1576
    goto :goto_48

    .line 1577
    :cond_49
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 1578
    .line 1579
    .line 1580
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1581
    .line 1582
    .line 1583
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 1584
    .line 1585
    .line 1586
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 1587
    .line 1588
    .line 1589
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 1590
    .line 1591
    .line 1592
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 1593
    .line 1594
    .line 1595
    :goto_48
    return-void

    .line 1596
    :pswitch_7
    move-object/from16 v1, p2

    .line 1597
    .line 1598
    check-cast v1, Lcom/eddyizm/tempus/model/Download;

    .line 1599
    .line 1600
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v2

    .line 1604
    if-nez v2, :cond_4a

    .line 1605
    .line 1606
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 1607
    .line 1608
    .line 1609
    goto :goto_49

    .line 1610
    :cond_4a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getId()Ljava/lang/String;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v2

    .line 1614
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1615
    .line 1616
    .line 1617
    :goto_49
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v2

    .line 1621
    if-nez v2, :cond_4b

    .line 1622
    .line 1623
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1624
    .line 1625
    .line 1626
    goto :goto_4a

    .line 1627
    :cond_4b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v2

    .line 1631
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1632
    .line 1633
    .line 1634
    :goto_4a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistName()Ljava/lang/String;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v2

    .line 1638
    if-nez v2, :cond_4c

    .line 1639
    .line 1640
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 1641
    .line 1642
    .line 1643
    goto :goto_4b

    .line 1644
    :cond_4c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistName()Ljava/lang/String;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v2

    .line 1648
    invoke-interface {v0, v10, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1649
    .line 1650
    .line 1651
    :goto_4b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getDownloadState()I

    .line 1652
    .line 1653
    .line 1654
    move-result v2

    .line 1655
    int-to-long v6, v2

    .line 1656
    invoke-interface {v0, v9, v6, v7}, Lz34;->c(IJ)V

    .line 1657
    .line 1658
    .line 1659
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v2

    .line 1663
    if-nez v2, :cond_4d

    .line 1664
    .line 1665
    invoke-interface {v0, v8}, Lz34;->e(I)V

    .line 1666
    .line 1667
    .line 1668
    goto :goto_4c

    .line 1669
    :cond_4d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Download;->getDownloadUri()Ljava/lang/String;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v2

    .line 1673
    invoke-interface {v0, v8, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1674
    .line 1675
    .line 1676
    :goto_4c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v2

    .line 1680
    if-nez v2, :cond_4e

    .line 1681
    .line 1682
    invoke-interface {v0, v11}, Lz34;->e(I)V

    .line 1683
    .line 1684
    .line 1685
    goto :goto_4d

    .line 1686
    :cond_4e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v2

    .line 1690
    invoke-interface {v0, v11, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1691
    .line 1692
    .line 1693
    :goto_4d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 1694
    .line 1695
    .line 1696
    move-result v2

    .line 1697
    int-to-long v6, v2

    .line 1698
    invoke-interface {v0, v13, v6, v7}, Lz34;->c(IJ)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v2

    .line 1705
    if-nez v2, :cond_4f

    .line 1706
    .line 1707
    invoke-interface {v0, v14}, Lz34;->e(I)V

    .line 1708
    .line 1709
    .line 1710
    goto :goto_4e

    .line 1711
    :cond_4f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v2

    .line 1715
    invoke-interface {v0, v14, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1716
    .line 1717
    .line 1718
    :goto_4e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v2

    .line 1722
    if-nez v2, :cond_50

    .line 1723
    .line 1724
    invoke-interface {v0, v12}, Lz34;->e(I)V

    .line 1725
    .line 1726
    .line 1727
    goto :goto_4f

    .line 1728
    :cond_50
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v2

    .line 1732
    invoke-interface {v0, v12, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1733
    .line 1734
    .line 1735
    :goto_4f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v2

    .line 1739
    if-nez v2, :cond_51

    .line 1740
    .line 1741
    invoke-interface {v0, v15}, Lz34;->e(I)V

    .line 1742
    .line 1743
    .line 1744
    goto :goto_50

    .line 1745
    :cond_51
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v2

    .line 1749
    invoke-interface {v0, v15, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1750
    .line 1751
    .line 1752
    :goto_50
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v2

    .line 1756
    const/16 v6, 0xb

    .line 1757
    .line 1758
    if-nez v2, :cond_52

    .line 1759
    .line 1760
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1761
    .line 1762
    .line 1763
    goto :goto_51

    .line 1764
    :cond_52
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 1765
    .line 1766
    .line 1767
    move-result-object v2

    .line 1768
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1769
    .line 1770
    .line 1771
    move-result v2

    .line 1772
    int-to-long v7, v2

    .line 1773
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1774
    .line 1775
    .line 1776
    :goto_51
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v2

    .line 1780
    const/16 v6, 0xc

    .line 1781
    .line 1782
    if-nez v2, :cond_53

    .line 1783
    .line 1784
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1785
    .line 1786
    .line 1787
    goto :goto_52

    .line 1788
    :cond_53
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v2

    .line 1792
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1793
    .line 1794
    .line 1795
    move-result v2

    .line 1796
    int-to-long v7, v2

    .line 1797
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1798
    .line 1799
    .line 1800
    :goto_52
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v2

    .line 1804
    const/16 v6, 0xd

    .line 1805
    .line 1806
    if-nez v2, :cond_54

    .line 1807
    .line 1808
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1809
    .line 1810
    .line 1811
    goto :goto_53

    .line 1812
    :cond_54
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v2

    .line 1816
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1817
    .line 1818
    .line 1819
    :goto_53
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 1820
    .line 1821
    .line 1822
    move-result-object v2

    .line 1823
    const/16 v6, 0xe

    .line 1824
    .line 1825
    if-nez v2, :cond_55

    .line 1826
    .line 1827
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1828
    .line 1829
    .line 1830
    goto :goto_54

    .line 1831
    :cond_55
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v2

    .line 1835
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1836
    .line 1837
    .line 1838
    :goto_54
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v2

    .line 1842
    const/16 v6, 0xf

    .line 1843
    .line 1844
    if-nez v2, :cond_56

    .line 1845
    .line 1846
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1847
    .line 1848
    .line 1849
    goto :goto_55

    .line 1850
    :cond_56
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v2

    .line 1854
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1855
    .line 1856
    .line 1857
    move-result-wide v7

    .line 1858
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1859
    .line 1860
    .line 1861
    :goto_55
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v2

    .line 1865
    const/16 v6, 0x10

    .line 1866
    .line 1867
    if-nez v2, :cond_57

    .line 1868
    .line 1869
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1870
    .line 1871
    .line 1872
    goto :goto_56

    .line 1873
    :cond_57
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v2

    .line 1877
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1878
    .line 1879
    .line 1880
    :goto_56
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v2

    .line 1884
    const/16 v6, 0x11

    .line 1885
    .line 1886
    if-nez v2, :cond_58

    .line 1887
    .line 1888
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1889
    .line 1890
    .line 1891
    goto :goto_57

    .line 1892
    :cond_58
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v2

    .line 1896
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1897
    .line 1898
    .line 1899
    :goto_57
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v2

    .line 1903
    const/16 v6, 0x12

    .line 1904
    .line 1905
    if-nez v2, :cond_59

    .line 1906
    .line 1907
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1908
    .line 1909
    .line 1910
    goto :goto_58

    .line 1911
    :cond_59
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 1912
    .line 1913
    .line 1914
    move-result-object v2

    .line 1915
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1916
    .line 1917
    .line 1918
    :goto_58
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v2

    .line 1922
    const/16 v6, 0x13

    .line 1923
    .line 1924
    if-nez v2, :cond_5a

    .line 1925
    .line 1926
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1927
    .line 1928
    .line 1929
    goto :goto_59

    .line 1930
    :cond_5a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v2

    .line 1934
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 1935
    .line 1936
    .line 1937
    :goto_59
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v2

    .line 1941
    const/16 v6, 0x14

    .line 1942
    .line 1943
    if-nez v2, :cond_5b

    .line 1944
    .line 1945
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1946
    .line 1947
    .line 1948
    goto :goto_5a

    .line 1949
    :cond_5b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v2

    .line 1953
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1954
    .line 1955
    .line 1956
    move-result v2

    .line 1957
    int-to-long v7, v2

    .line 1958
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1959
    .line 1960
    .line 1961
    :goto_5a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v2

    .line 1965
    const/16 v6, 0x15

    .line 1966
    .line 1967
    if-nez v2, :cond_5c

    .line 1968
    .line 1969
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1970
    .line 1971
    .line 1972
    goto :goto_5b

    .line 1973
    :cond_5c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v2

    .line 1977
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1978
    .line 1979
    .line 1980
    move-result v2

    .line 1981
    int-to-long v7, v2

    .line 1982
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 1983
    .line 1984
    .line 1985
    :goto_5b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v2

    .line 1989
    const/16 v6, 0x16

    .line 1990
    .line 1991
    if-nez v2, :cond_5d

    .line 1992
    .line 1993
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 1994
    .line 1995
    .line 1996
    goto :goto_5c

    .line 1997
    :cond_5d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v2

    .line 2001
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2002
    .line 2003
    .line 2004
    move-result v2

    .line 2005
    int-to-long v7, v2

    .line 2006
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 2007
    .line 2008
    .line 2009
    :goto_5c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v2

    .line 2013
    const/16 v6, 0x17

    .line 2014
    .line 2015
    if-nez v2, :cond_5e

    .line 2016
    .line 2017
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 2018
    .line 2019
    .line 2020
    goto :goto_5d

    .line 2021
    :cond_5e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v2

    .line 2025
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2026
    .line 2027
    .line 2028
    move-result v2

    .line 2029
    int-to-long v7, v2

    .line 2030
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 2031
    .line 2032
    .line 2033
    :goto_5d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v2

    .line 2037
    const/16 v6, 0x18

    .line 2038
    .line 2039
    if-nez v2, :cond_5f

    .line 2040
    .line 2041
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 2042
    .line 2043
    .line 2044
    goto :goto_5e

    .line 2045
    :cond_5f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v2

    .line 2049
    invoke-interface {v0, v6, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 2050
    .line 2051
    .line 2052
    :goto_5e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 2053
    .line 2054
    .line 2055
    move-result v2

    .line 2056
    const/16 v6, 0x19

    .line 2057
    .line 2058
    int-to-long v7, v2

    .line 2059
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 2060
    .line 2061
    .line 2062
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v2

    .line 2066
    const/16 v6, 0x1a

    .line 2067
    .line 2068
    if-nez v2, :cond_60

    .line 2069
    .line 2070
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 2071
    .line 2072
    .line 2073
    goto :goto_5f

    .line 2074
    :cond_60
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 2075
    .line 2076
    .line 2077
    move-result-object v2

    .line 2078
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2079
    .line 2080
    .line 2081
    move-result v2

    .line 2082
    int-to-long v7, v2

    .line 2083
    invoke-interface {v0, v6, v7, v8}, Lz34;->c(IJ)V

    .line 2084
    .line 2085
    .line 2086
    :goto_5f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v2

    .line 2090
    if-nez v2, :cond_61

    .line 2091
    .line 2092
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 2093
    .line 2094
    .line 2095
    goto :goto_60

    .line 2096
    :cond_61
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v2

    .line 2100
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 2101
    .line 2102
    .line 2103
    move-result-wide v6

    .line 2104
    invoke-interface {v0, v6, v7, v3}, Lz34;->d(DI)V

    .line 2105
    .line 2106
    .line 2107
    :goto_60
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v2

    .line 2111
    if-nez v2, :cond_62

    .line 2112
    .line 2113
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 2114
    .line 2115
    .line 2116
    goto :goto_61

    .line 2117
    :cond_62
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v2

    .line 2121
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 2122
    .line 2123
    .line 2124
    move-result-wide v2

    .line 2125
    invoke-interface {v0, v4, v2, v3}, Lz34;->c(IJ)V

    .line 2126
    .line 2127
    .line 2128
    :goto_61
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 2129
    .line 2130
    .line 2131
    move-result-object v2

    .line 2132
    if-nez v2, :cond_63

    .line 2133
    .line 2134
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2135
    .line 2136
    .line 2137
    goto :goto_62

    .line 2138
    :cond_63
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 2139
    .line 2140
    .line 2141
    move-result-object v2

    .line 2142
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2143
    .line 2144
    .line 2145
    move-result v2

    .line 2146
    int-to-long v2, v2

    .line 2147
    invoke-interface {v0, v5, v2, v3}, Lz34;->c(IJ)V

    .line 2148
    .line 2149
    .line 2150
    :goto_62
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCreated()Ljava/util/Date;

    .line 2151
    .line 2152
    .line 2153
    move-result-object v2

    .line 2154
    invoke-static {v2}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v2

    .line 2158
    if-nez v2, :cond_64

    .line 2159
    .line 2160
    const/16 v3, 0x1e

    .line 2161
    .line 2162
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 2163
    .line 2164
    .line 2165
    goto :goto_63

    .line 2166
    :cond_64
    const/16 v3, 0x1e

    .line 2167
    .line 2168
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 2169
    .line 2170
    .line 2171
    move-result-wide v4

    .line 2172
    invoke-interface {v0, v3, v4, v5}, Lz34;->c(IJ)V

    .line 2173
    .line 2174
    .line 2175
    :goto_63
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v2

    .line 2179
    invoke-static {v2}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 2180
    .line 2181
    .line 2182
    move-result-object v2

    .line 2183
    if-nez v2, :cond_65

    .line 2184
    .line 2185
    const/16 v3, 0x1f

    .line 2186
    .line 2187
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 2188
    .line 2189
    .line 2190
    goto :goto_64

    .line 2191
    :cond_65
    const/16 v3, 0x1f

    .line 2192
    .line 2193
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 2194
    .line 2195
    .line 2196
    move-result-wide v4

    .line 2197
    invoke-interface {v0, v3, v4, v5}, Lz34;->c(IJ)V

    .line 2198
    .line 2199
    .line 2200
    :goto_64
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v2

    .line 2204
    if-nez v2, :cond_66

    .line 2205
    .line 2206
    const/16 v2, 0x20

    .line 2207
    .line 2208
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2209
    .line 2210
    .line 2211
    goto :goto_65

    .line 2212
    :cond_66
    const/16 v2, 0x20

    .line 2213
    .line 2214
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v3

    .line 2218
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 2219
    .line 2220
    .line 2221
    :goto_65
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v2

    .line 2225
    if-nez v2, :cond_67

    .line 2226
    .line 2227
    const/16 v2, 0x21

    .line 2228
    .line 2229
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2230
    .line 2231
    .line 2232
    goto :goto_66

    .line 2233
    :cond_67
    const/16 v2, 0x21

    .line 2234
    .line 2235
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 2236
    .line 2237
    .line 2238
    move-result-object v3

    .line 2239
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 2240
    .line 2241
    .line 2242
    :goto_66
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 2243
    .line 2244
    .line 2245
    move-result-object v2

    .line 2246
    if-nez v2, :cond_68

    .line 2247
    .line 2248
    const/16 v2, 0x22

    .line 2249
    .line 2250
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2251
    .line 2252
    .line 2253
    goto :goto_67

    .line 2254
    :cond_68
    const/16 v2, 0x22

    .line 2255
    .line 2256
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 2257
    .line 2258
    .line 2259
    move-result-object v3

    .line 2260
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 2261
    .line 2262
    .line 2263
    :goto_67
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 2264
    .line 2265
    .line 2266
    move-result-object v2

    .line 2267
    if-nez v2, :cond_69

    .line 2268
    .line 2269
    const/16 v2, 0x23

    .line 2270
    .line 2271
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2272
    .line 2273
    .line 2274
    goto :goto_68

    .line 2275
    :cond_69
    const/16 v2, 0x23

    .line 2276
    .line 2277
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 2278
    .line 2279
    .line 2280
    move-result-object v3

    .line 2281
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 2282
    .line 2283
    .line 2284
    move-result-wide v3

    .line 2285
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 2286
    .line 2287
    .line 2288
    :goto_68
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 2289
    .line 2290
    .line 2291
    move-result-object v2

    .line 2292
    if-nez v2, :cond_6a

    .line 2293
    .line 2294
    const/16 v2, 0x24

    .line 2295
    .line 2296
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2297
    .line 2298
    .line 2299
    goto :goto_69

    .line 2300
    :cond_6a
    const/16 v2, 0x24

    .line 2301
    .line 2302
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v3

    .line 2306
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2307
    .line 2308
    .line 2309
    move-result v3

    .line 2310
    int-to-long v3, v3

    .line 2311
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 2312
    .line 2313
    .line 2314
    :goto_69
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v2

    .line 2318
    if-nez v2, :cond_6b

    .line 2319
    .line 2320
    const/16 v2, 0x25

    .line 2321
    .line 2322
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2323
    .line 2324
    .line 2325
    goto :goto_6a

    .line 2326
    :cond_6b
    const/16 v2, 0x25

    .line 2327
    .line 2328
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v3

    .line 2332
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2333
    .line 2334
    .line 2335
    move-result v3

    .line 2336
    int-to-long v3, v3

    .line 2337
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 2338
    .line 2339
    .line 2340
    :goto_6a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v2

    .line 2344
    if-nez v2, :cond_6c

    .line 2345
    .line 2346
    const/16 v2, 0x26

    .line 2347
    .line 2348
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2349
    .line 2350
    .line 2351
    goto :goto_6b

    .line 2352
    :cond_6c
    const/16 v2, 0x26

    .line 2353
    .line 2354
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v3

    .line 2358
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 2359
    .line 2360
    .line 2361
    :goto_6b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getReplayGain()Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v1

    .line 2365
    const/16 v2, 0x2c

    .line 2366
    .line 2367
    const/16 v3, 0x2b

    .line 2368
    .line 2369
    const/16 v4, 0x2a

    .line 2370
    .line 2371
    const/16 v5, 0x29

    .line 2372
    .line 2373
    const/16 v6, 0x28

    .line 2374
    .line 2375
    const/16 v7, 0x27

    .line 2376
    .line 2377
    if-eqz v1, :cond_73

    .line 2378
    .line 2379
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 2380
    .line 2381
    .line 2382
    move-result-object v8

    .line 2383
    if-nez v8, :cond_6d

    .line 2384
    .line 2385
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 2386
    .line 2387
    .line 2388
    goto :goto_6c

    .line 2389
    :cond_6d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 2390
    .line 2391
    .line 2392
    move-result-object v8

    .line 2393
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 2394
    .line 2395
    .line 2396
    move-result v8

    .line 2397
    float-to-double v8, v8

    .line 2398
    invoke-interface {v0, v8, v9, v7}, Lz34;->d(DI)V

    .line 2399
    .line 2400
    .line 2401
    :goto_6c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v7

    .line 2405
    if-nez v7, :cond_6e

    .line 2406
    .line 2407
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 2408
    .line 2409
    .line 2410
    goto :goto_6d

    .line 2411
    :cond_6e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v7

    .line 2415
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 2416
    .line 2417
    .line 2418
    move-result v7

    .line 2419
    float-to-double v7, v7

    .line 2420
    invoke-interface {v0, v7, v8, v6}, Lz34;->d(DI)V

    .line 2421
    .line 2422
    .line 2423
    :goto_6d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v6

    .line 2427
    if-nez v6, :cond_6f

    .line 2428
    .line 2429
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2430
    .line 2431
    .line 2432
    goto :goto_6e

    .line 2433
    :cond_6f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v6

    .line 2437
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 2438
    .line 2439
    .line 2440
    move-result v6

    .line 2441
    float-to-double v6, v6

    .line 2442
    invoke-interface {v0, v6, v7, v5}, Lz34;->d(DI)V

    .line 2443
    .line 2444
    .line 2445
    :goto_6e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v5

    .line 2449
    if-nez v5, :cond_70

    .line 2450
    .line 2451
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 2452
    .line 2453
    .line 2454
    goto :goto_6f

    .line 2455
    :cond_70
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 2456
    .line 2457
    .line 2458
    move-result-object v5

    .line 2459
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 2460
    .line 2461
    .line 2462
    move-result v5

    .line 2463
    float-to-double v5, v5

    .line 2464
    invoke-interface {v0, v5, v6, v4}, Lz34;->d(DI)V

    .line 2465
    .line 2466
    .line 2467
    :goto_6f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v4

    .line 2471
    if-nez v4, :cond_71

    .line 2472
    .line 2473
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 2474
    .line 2475
    .line 2476
    goto :goto_70

    .line 2477
    :cond_71
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v4

    .line 2481
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 2482
    .line 2483
    .line 2484
    move-result v4

    .line 2485
    float-to-double v4, v4

    .line 2486
    invoke-interface {v0, v4, v5, v3}, Lz34;->d(DI)V

    .line 2487
    .line 2488
    .line 2489
    :goto_70
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 2490
    .line 2491
    .line 2492
    move-result-object v3

    .line 2493
    if-nez v3, :cond_72

    .line 2494
    .line 2495
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2496
    .line 2497
    .line 2498
    goto :goto_71

    .line 2499
    :cond_72
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 2500
    .line 2501
    .line 2502
    move-result-object v1

    .line 2503
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 2504
    .line 2505
    .line 2506
    move-result v1

    .line 2507
    float-to-double v3, v1

    .line 2508
    invoke-interface {v0, v3, v4, v2}, Lz34;->d(DI)V

    .line 2509
    .line 2510
    .line 2511
    goto :goto_71

    .line 2512
    :cond_73
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 2513
    .line 2514
    .line 2515
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 2516
    .line 2517
    .line 2518
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2519
    .line 2520
    .line 2521
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 2522
    .line 2523
    .line 2524
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 2525
    .line 2526
    .line 2527
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 2528
    .line 2529
    .line 2530
    :goto_71
    return-void

    .line 2531
    :pswitch_8
    move-object/from16 v1, p2

    .line 2532
    .line 2533
    check-cast v1, Lcom/eddyizm/tempus/model/Chronology;

    .line 2534
    .line 2535
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Chronology;->getId()Ljava/lang/String;

    .line 2536
    .line 2537
    .line 2538
    move-result-object v2

    .line 2539
    if-nez v2, :cond_74

    .line 2540
    .line 2541
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 2542
    .line 2543
    .line 2544
    goto :goto_72

    .line 2545
    :cond_74
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Chronology;->getId()Ljava/lang/String;

    .line 2546
    .line 2547
    .line 2548
    move-result-object v2

    .line 2549
    invoke-interface {v0, v7, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 2550
    .line 2551
    .line 2552
    :goto_72
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Chronology;->getTimestamp()J

    .line 2553
    .line 2554
    .line 2555
    move-result-wide v4

    .line 2556
    invoke-interface {v0, v6, v4, v5}, Lz34;->c(IJ)V

    .line 2557
    .line 2558
    .line 2559
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Chronology;->getServer()Ljava/lang/String;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v4

    .line 2563
    if-nez v4, :cond_75

    .line 2564
    .line 2565
    invoke-interface {v0, v10}, Lz34;->e(I)V

    .line 2566
    .line 2567
    .line 2568
    goto :goto_73

    .line 2569
    :cond_75
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Chronology;->getServer()Ljava/lang/String;

    .line 2570
    .line 2571
    .line 2572
    move-result-object v4

    .line 2573
    invoke-interface {v0, v10, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2574
    .line 2575
    .line 2576
    :goto_73
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 2577
    .line 2578
    .line 2579
    move-result-object v4

    .line 2580
    if-nez v4, :cond_76

    .line 2581
    .line 2582
    invoke-interface {v0, v9}, Lz34;->e(I)V

    .line 2583
    .line 2584
    .line 2585
    goto :goto_74

    .line 2586
    :cond_76
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 2587
    .line 2588
    .line 2589
    move-result-object v4

    .line 2590
    invoke-interface {v0, v9, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2591
    .line 2592
    .line 2593
    :goto_74
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 2594
    .line 2595
    .line 2596
    move-result v4

    .line 2597
    int-to-long v4, v4

    .line 2598
    invoke-interface {v0, v8, v4, v5}, Lz34;->c(IJ)V

    .line 2599
    .line 2600
    .line 2601
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v4

    .line 2605
    if-nez v4, :cond_77

    .line 2606
    .line 2607
    invoke-interface {v0, v11}, Lz34;->e(I)V

    .line 2608
    .line 2609
    .line 2610
    goto :goto_75

    .line 2611
    :cond_77
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 2612
    .line 2613
    .line 2614
    move-result-object v4

    .line 2615
    invoke-interface {v0, v11, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2616
    .line 2617
    .line 2618
    :goto_75
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 2619
    .line 2620
    .line 2621
    move-result-object v4

    .line 2622
    if-nez v4, :cond_78

    .line 2623
    .line 2624
    invoke-interface {v0, v13}, Lz34;->e(I)V

    .line 2625
    .line 2626
    .line 2627
    goto :goto_76

    .line 2628
    :cond_78
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 2629
    .line 2630
    .line 2631
    move-result-object v4

    .line 2632
    invoke-interface {v0, v13, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2633
    .line 2634
    .line 2635
    :goto_76
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v4

    .line 2639
    if-nez v4, :cond_79

    .line 2640
    .line 2641
    invoke-interface {v0, v14}, Lz34;->e(I)V

    .line 2642
    .line 2643
    .line 2644
    goto :goto_77

    .line 2645
    :cond_79
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v4

    .line 2649
    invoke-interface {v0, v14, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2650
    .line 2651
    .line 2652
    :goto_77
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v4

    .line 2656
    if-nez v4, :cond_7a

    .line 2657
    .line 2658
    invoke-interface {v0, v12}, Lz34;->e(I)V

    .line 2659
    .line 2660
    .line 2661
    goto :goto_78

    .line 2662
    :cond_7a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 2663
    .line 2664
    .line 2665
    move-result-object v4

    .line 2666
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2667
    .line 2668
    .line 2669
    move-result v4

    .line 2670
    int-to-long v4, v4

    .line 2671
    invoke-interface {v0, v12, v4, v5}, Lz34;->c(IJ)V

    .line 2672
    .line 2673
    .line 2674
    :goto_78
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 2675
    .line 2676
    .line 2677
    move-result-object v4

    .line 2678
    if-nez v4, :cond_7b

    .line 2679
    .line 2680
    invoke-interface {v0, v15}, Lz34;->e(I)V

    .line 2681
    .line 2682
    .line 2683
    goto :goto_79

    .line 2684
    :cond_7b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v4

    .line 2688
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2689
    .line 2690
    .line 2691
    move-result v4

    .line 2692
    int-to-long v4, v4

    .line 2693
    invoke-interface {v0, v15, v4, v5}, Lz34;->c(IJ)V

    .line 2694
    .line 2695
    .line 2696
    :goto_79
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 2697
    .line 2698
    .line 2699
    move-result-object v4

    .line 2700
    const/16 v5, 0xb

    .line 2701
    .line 2702
    if-nez v4, :cond_7c

    .line 2703
    .line 2704
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2705
    .line 2706
    .line 2707
    goto :goto_7a

    .line 2708
    :cond_7c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v4

    .line 2712
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2713
    .line 2714
    .line 2715
    :goto_7a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v4

    .line 2719
    const/16 v5, 0xc

    .line 2720
    .line 2721
    if-nez v4, :cond_7d

    .line 2722
    .line 2723
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2724
    .line 2725
    .line 2726
    goto :goto_7b

    .line 2727
    :cond_7d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 2728
    .line 2729
    .line 2730
    move-result-object v4

    .line 2731
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2732
    .line 2733
    .line 2734
    :goto_7b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 2735
    .line 2736
    .line 2737
    move-result-object v4

    .line 2738
    const/16 v5, 0xd

    .line 2739
    .line 2740
    if-nez v4, :cond_7e

    .line 2741
    .line 2742
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2743
    .line 2744
    .line 2745
    goto :goto_7c

    .line 2746
    :cond_7e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 2747
    .line 2748
    .line 2749
    move-result-object v4

    .line 2750
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 2751
    .line 2752
    .line 2753
    move-result-wide v8

    .line 2754
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2755
    .line 2756
    .line 2757
    :goto_7c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 2758
    .line 2759
    .line 2760
    move-result-object v4

    .line 2761
    const/16 v5, 0xe

    .line 2762
    .line 2763
    if-nez v4, :cond_7f

    .line 2764
    .line 2765
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2766
    .line 2767
    .line 2768
    goto :goto_7d

    .line 2769
    :cond_7f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v4

    .line 2773
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2774
    .line 2775
    .line 2776
    :goto_7d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 2777
    .line 2778
    .line 2779
    move-result-object v4

    .line 2780
    const/16 v5, 0xf

    .line 2781
    .line 2782
    if-nez v4, :cond_80

    .line 2783
    .line 2784
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2785
    .line 2786
    .line 2787
    goto :goto_7e

    .line 2788
    :cond_80
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v4

    .line 2792
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2793
    .line 2794
    .line 2795
    :goto_7e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 2796
    .line 2797
    .line 2798
    move-result-object v4

    .line 2799
    const/16 v5, 0x10

    .line 2800
    .line 2801
    if-nez v4, :cond_81

    .line 2802
    .line 2803
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2804
    .line 2805
    .line 2806
    goto :goto_7f

    .line 2807
    :cond_81
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 2808
    .line 2809
    .line 2810
    move-result-object v4

    .line 2811
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2812
    .line 2813
    .line 2814
    :goto_7f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 2815
    .line 2816
    .line 2817
    move-result-object v4

    .line 2818
    const/16 v5, 0x11

    .line 2819
    .line 2820
    if-nez v4, :cond_82

    .line 2821
    .line 2822
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2823
    .line 2824
    .line 2825
    goto :goto_80

    .line 2826
    :cond_82
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 2827
    .line 2828
    .line 2829
    move-result-object v4

    .line 2830
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2831
    .line 2832
    .line 2833
    :goto_80
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 2834
    .line 2835
    .line 2836
    move-result-object v4

    .line 2837
    const/16 v5, 0x12

    .line 2838
    .line 2839
    if-nez v4, :cond_83

    .line 2840
    .line 2841
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2842
    .line 2843
    .line 2844
    goto :goto_81

    .line 2845
    :cond_83
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 2846
    .line 2847
    .line 2848
    move-result-object v4

    .line 2849
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2850
    .line 2851
    .line 2852
    move-result v4

    .line 2853
    int-to-long v8, v4

    .line 2854
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2855
    .line 2856
    .line 2857
    :goto_81
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 2858
    .line 2859
    .line 2860
    move-result-object v4

    .line 2861
    const/16 v5, 0x13

    .line 2862
    .line 2863
    if-nez v4, :cond_84

    .line 2864
    .line 2865
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2866
    .line 2867
    .line 2868
    goto :goto_82

    .line 2869
    :cond_84
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 2870
    .line 2871
    .line 2872
    move-result-object v4

    .line 2873
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2874
    .line 2875
    .line 2876
    move-result v4

    .line 2877
    int-to-long v8, v4

    .line 2878
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2879
    .line 2880
    .line 2881
    :goto_82
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 2882
    .line 2883
    .line 2884
    move-result-object v4

    .line 2885
    const/16 v5, 0x14

    .line 2886
    .line 2887
    if-nez v4, :cond_85

    .line 2888
    .line 2889
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2890
    .line 2891
    .line 2892
    goto :goto_83

    .line 2893
    :cond_85
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSamplingRate()Ljava/lang/Integer;

    .line 2894
    .line 2895
    .line 2896
    move-result-object v4

    .line 2897
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2898
    .line 2899
    .line 2900
    move-result v4

    .line 2901
    int-to-long v8, v4

    .line 2902
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2903
    .line 2904
    .line 2905
    :goto_83
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 2906
    .line 2907
    .line 2908
    move-result-object v4

    .line 2909
    const/16 v5, 0x15

    .line 2910
    .line 2911
    if-nez v4, :cond_86

    .line 2912
    .line 2913
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2914
    .line 2915
    .line 2916
    goto :goto_84

    .line 2917
    :cond_86
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitDepth()Ljava/lang/Integer;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v4

    .line 2921
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2922
    .line 2923
    .line 2924
    move-result v4

    .line 2925
    int-to-long v8, v4

    .line 2926
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2927
    .line 2928
    .line 2929
    :goto_84
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 2930
    .line 2931
    .line 2932
    move-result-object v4

    .line 2933
    const/16 v5, 0x16

    .line 2934
    .line 2935
    if-nez v4, :cond_87

    .line 2936
    .line 2937
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2938
    .line 2939
    .line 2940
    goto :goto_85

    .line 2941
    :cond_87
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v4

    .line 2945
    invoke-interface {v0, v5, v4}, Lz34;->r(ILjava/lang/String;)V

    .line 2946
    .line 2947
    .line 2948
    :goto_85
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 2949
    .line 2950
    .line 2951
    move-result v4

    .line 2952
    const/16 v5, 0x17

    .line 2953
    .line 2954
    int-to-long v8, v4

    .line 2955
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2956
    .line 2957
    .line 2958
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v4

    .line 2962
    const/16 v5, 0x18

    .line 2963
    .line 2964
    if-nez v4, :cond_88

    .line 2965
    .line 2966
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2967
    .line 2968
    .line 2969
    goto :goto_86

    .line 2970
    :cond_88
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 2971
    .line 2972
    .line 2973
    move-result-object v4

    .line 2974
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2975
    .line 2976
    .line 2977
    move-result v4

    .line 2978
    int-to-long v8, v4

    .line 2979
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 2980
    .line 2981
    .line 2982
    :goto_86
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 2983
    .line 2984
    .line 2985
    move-result-object v4

    .line 2986
    const/16 v5, 0x19

    .line 2987
    .line 2988
    if-nez v4, :cond_89

    .line 2989
    .line 2990
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 2991
    .line 2992
    .line 2993
    goto :goto_87

    .line 2994
    :cond_89
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 2995
    .line 2996
    .line 2997
    move-result-object v4

    .line 2998
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 2999
    .line 3000
    .line 3001
    move-result-wide v8

    .line 3002
    invoke-interface {v0, v8, v9, v5}, Lz34;->d(DI)V

    .line 3003
    .line 3004
    .line 3005
    :goto_87
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 3006
    .line 3007
    .line 3008
    move-result-object v4

    .line 3009
    const/16 v5, 0x1a

    .line 3010
    .line 3011
    if-nez v4, :cond_8a

    .line 3012
    .line 3013
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 3014
    .line 3015
    .line 3016
    goto :goto_88

    .line 3017
    :cond_8a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 3018
    .line 3019
    .line 3020
    move-result-object v4

    .line 3021
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 3022
    .line 3023
    .line 3024
    move-result-wide v8

    .line 3025
    invoke-interface {v0, v5, v8, v9}, Lz34;->c(IJ)V

    .line 3026
    .line 3027
    .line 3028
    :goto_88
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 3029
    .line 3030
    .line 3031
    move-result-object v4

    .line 3032
    if-nez v4, :cond_8b

    .line 3033
    .line 3034
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 3035
    .line 3036
    .line 3037
    goto :goto_89

    .line 3038
    :cond_8b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 3039
    .line 3040
    .line 3041
    move-result-object v4

    .line 3042
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 3043
    .line 3044
    .line 3045
    move-result v4

    .line 3046
    int-to-long v4, v4

    .line 3047
    invoke-interface {v0, v3, v4, v5}, Lz34;->c(IJ)V

    .line 3048
    .line 3049
    .line 3050
    :goto_89
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCreated()Ljava/util/Date;

    .line 3051
    .line 3052
    .line 3053
    move-result-object v3

    .line 3054
    invoke-static {v3}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 3055
    .line 3056
    .line 3057
    move-result-object v3

    .line 3058
    if-nez v3, :cond_8c

    .line 3059
    .line 3060
    const/16 v2, 0x1c

    .line 3061
    .line 3062
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3063
    .line 3064
    .line 3065
    goto :goto_8a

    .line 3066
    :cond_8c
    const/16 v2, 0x1c

    .line 3067
    .line 3068
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 3069
    .line 3070
    .line 3071
    move-result-wide v3

    .line 3072
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 3073
    .line 3074
    .line 3075
    :goto_8a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 3076
    .line 3077
    .line 3078
    move-result-object v2

    .line 3079
    invoke-static {v2}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 3080
    .line 3081
    .line 3082
    move-result-object v2

    .line 3083
    if-nez v2, :cond_8d

    .line 3084
    .line 3085
    const/16 v7, 0x1d

    .line 3086
    .line 3087
    invoke-interface {v0, v7}, Lz34;->e(I)V

    .line 3088
    .line 3089
    .line 3090
    goto :goto_8b

    .line 3091
    :cond_8d
    const/16 v7, 0x1d

    .line 3092
    .line 3093
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 3094
    .line 3095
    .line 3096
    move-result-wide v2

    .line 3097
    invoke-interface {v0, v7, v2, v3}, Lz34;->c(IJ)V

    .line 3098
    .line 3099
    .line 3100
    :goto_8b
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 3101
    .line 3102
    .line 3103
    move-result-object v2

    .line 3104
    if-nez v2, :cond_8e

    .line 3105
    .line 3106
    const/16 v3, 0x1e

    .line 3107
    .line 3108
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 3109
    .line 3110
    .line 3111
    goto :goto_8c

    .line 3112
    :cond_8e
    const/16 v3, 0x1e

    .line 3113
    .line 3114
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 3115
    .line 3116
    .line 3117
    move-result-object v2

    .line 3118
    invoke-interface {v0, v3, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 3119
    .line 3120
    .line 3121
    :goto_8c
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 3122
    .line 3123
    .line 3124
    move-result-object v2

    .line 3125
    if-nez v2, :cond_8f

    .line 3126
    .line 3127
    const/16 v3, 0x1f

    .line 3128
    .line 3129
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 3130
    .line 3131
    .line 3132
    goto :goto_8d

    .line 3133
    :cond_8f
    const/16 v3, 0x1f

    .line 3134
    .line 3135
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 3136
    .line 3137
    .line 3138
    move-result-object v2

    .line 3139
    invoke-interface {v0, v3, v2}, Lz34;->r(ILjava/lang/String;)V

    .line 3140
    .line 3141
    .line 3142
    :goto_8d
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 3143
    .line 3144
    .line 3145
    move-result-object v2

    .line 3146
    if-nez v2, :cond_90

    .line 3147
    .line 3148
    const/16 v2, 0x20

    .line 3149
    .line 3150
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3151
    .line 3152
    .line 3153
    goto :goto_8e

    .line 3154
    :cond_90
    const/16 v2, 0x20

    .line 3155
    .line 3156
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getType()Ljava/lang/String;

    .line 3157
    .line 3158
    .line 3159
    move-result-object v3

    .line 3160
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 3161
    .line 3162
    .line 3163
    :goto_8e
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 3164
    .line 3165
    .line 3166
    move-result-object v2

    .line 3167
    if-nez v2, :cond_91

    .line 3168
    .line 3169
    const/16 v2, 0x21

    .line 3170
    .line 3171
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3172
    .line 3173
    .line 3174
    goto :goto_8f

    .line 3175
    :cond_91
    const/16 v2, 0x21

    .line 3176
    .line 3177
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 3178
    .line 3179
    .line 3180
    move-result-object v3

    .line 3181
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 3182
    .line 3183
    .line 3184
    move-result-wide v3

    .line 3185
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 3186
    .line 3187
    .line 3188
    :goto_8f
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 3189
    .line 3190
    .line 3191
    move-result-object v2

    .line 3192
    if-nez v2, :cond_92

    .line 3193
    .line 3194
    const/16 v2, 0x22

    .line 3195
    .line 3196
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3197
    .line 3198
    .line 3199
    goto :goto_90

    .line 3200
    :cond_92
    const/16 v2, 0x22

    .line 3201
    .line 3202
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 3203
    .line 3204
    .line 3205
    move-result-object v3

    .line 3206
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 3207
    .line 3208
    .line 3209
    move-result v3

    .line 3210
    int-to-long v3, v3

    .line 3211
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 3212
    .line 3213
    .line 3214
    :goto_90
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 3215
    .line 3216
    .line 3217
    move-result-object v2

    .line 3218
    if-nez v2, :cond_93

    .line 3219
    .line 3220
    const/16 v2, 0x23

    .line 3221
    .line 3222
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3223
    .line 3224
    .line 3225
    goto :goto_91

    .line 3226
    :cond_93
    const/16 v2, 0x23

    .line 3227
    .line 3228
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 3229
    .line 3230
    .line 3231
    move-result-object v3

    .line 3232
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 3233
    .line 3234
    .line 3235
    move-result v3

    .line 3236
    int-to-long v3, v3

    .line 3237
    invoke-interface {v0, v2, v3, v4}, Lz34;->c(IJ)V

    .line 3238
    .line 3239
    .line 3240
    :goto_91
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 3241
    .line 3242
    .line 3243
    move-result-object v2

    .line 3244
    if-nez v2, :cond_94

    .line 3245
    .line 3246
    const/16 v2, 0x24

    .line 3247
    .line 3248
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3249
    .line 3250
    .line 3251
    goto :goto_92

    .line 3252
    :cond_94
    const/16 v2, 0x24

    .line 3253
    .line 3254
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 3255
    .line 3256
    .line 3257
    move-result-object v3

    .line 3258
    invoke-interface {v0, v2, v3}, Lz34;->r(ILjava/lang/String;)V

    .line 3259
    .line 3260
    .line 3261
    :goto_92
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getReplayGain()Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 3262
    .line 3263
    .line 3264
    move-result-object v1

    .line 3265
    const/16 v2, 0x2a

    .line 3266
    .line 3267
    const/16 v3, 0x29

    .line 3268
    .line 3269
    const/16 v4, 0x28

    .line 3270
    .line 3271
    const/16 v5, 0x27

    .line 3272
    .line 3273
    if-eqz v1, :cond_9b

    .line 3274
    .line 3275
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 3276
    .line 3277
    .line 3278
    move-result-object v6

    .line 3279
    if-nez v6, :cond_95

    .line 3280
    .line 3281
    const/16 v6, 0x25

    .line 3282
    .line 3283
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 3284
    .line 3285
    .line 3286
    goto :goto_93

    .line 3287
    :cond_95
    const/16 v6, 0x25

    .line 3288
    .line 3289
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackGain()Ljava/lang/Float;

    .line 3290
    .line 3291
    .line 3292
    move-result-object v7

    .line 3293
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 3294
    .line 3295
    .line 3296
    move-result v7

    .line 3297
    float-to-double v7, v7

    .line 3298
    invoke-interface {v0, v7, v8, v6}, Lz34;->d(DI)V

    .line 3299
    .line 3300
    .line 3301
    :goto_93
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 3302
    .line 3303
    .line 3304
    move-result-object v6

    .line 3305
    if-nez v6, :cond_96

    .line 3306
    .line 3307
    const/16 v6, 0x26

    .line 3308
    .line 3309
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 3310
    .line 3311
    .line 3312
    goto :goto_94

    .line 3313
    :cond_96
    const/16 v6, 0x26

    .line 3314
    .line 3315
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumGain()Ljava/lang/Float;

    .line 3316
    .line 3317
    .line 3318
    move-result-object v7

    .line 3319
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 3320
    .line 3321
    .line 3322
    move-result v7

    .line 3323
    float-to-double v7, v7

    .line 3324
    invoke-interface {v0, v7, v8, v6}, Lz34;->d(DI)V

    .line 3325
    .line 3326
    .line 3327
    :goto_94
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 3328
    .line 3329
    .line 3330
    move-result-object v6

    .line 3331
    if-nez v6, :cond_97

    .line 3332
    .line 3333
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 3334
    .line 3335
    .line 3336
    goto :goto_95

    .line 3337
    :cond_97
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getTrackPeak()Ljava/lang/Float;

    .line 3338
    .line 3339
    .line 3340
    move-result-object v6

    .line 3341
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 3342
    .line 3343
    .line 3344
    move-result v6

    .line 3345
    float-to-double v6, v6

    .line 3346
    invoke-interface {v0, v6, v7, v5}, Lz34;->d(DI)V

    .line 3347
    .line 3348
    .line 3349
    :goto_95
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 3350
    .line 3351
    .line 3352
    move-result-object v5

    .line 3353
    if-nez v5, :cond_98

    .line 3354
    .line 3355
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 3356
    .line 3357
    .line 3358
    goto :goto_96

    .line 3359
    :cond_98
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getAlbumPeak()Ljava/lang/Float;

    .line 3360
    .line 3361
    .line 3362
    move-result-object v5

    .line 3363
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 3364
    .line 3365
    .line 3366
    move-result v5

    .line 3367
    float-to-double v5, v5

    .line 3368
    invoke-interface {v0, v5, v6, v4}, Lz34;->d(DI)V

    .line 3369
    .line 3370
    .line 3371
    :goto_96
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 3372
    .line 3373
    .line 3374
    move-result-object v4

    .line 3375
    if-nez v4, :cond_99

    .line 3376
    .line 3377
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 3378
    .line 3379
    .line 3380
    goto :goto_97

    .line 3381
    :cond_99
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getBaseGain()Ljava/lang/Float;

    .line 3382
    .line 3383
    .line 3384
    move-result-object v4

    .line 3385
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 3386
    .line 3387
    .line 3388
    move-result v4

    .line 3389
    float-to-double v4, v4

    .line 3390
    invoke-interface {v0, v4, v5, v3}, Lz34;->d(DI)V

    .line 3391
    .line 3392
    .line 3393
    :goto_97
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 3394
    .line 3395
    .line 3396
    move-result-object v3

    .line 3397
    if-nez v3, :cond_9a

    .line 3398
    .line 3399
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3400
    .line 3401
    .line 3402
    goto :goto_98

    .line 3403
    :cond_9a
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->getFallbackGain()Ljava/lang/Float;

    .line 3404
    .line 3405
    .line 3406
    move-result-object v1

    .line 3407
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 3408
    .line 3409
    .line 3410
    move-result v1

    .line 3411
    float-to-double v3, v1

    .line 3412
    invoke-interface {v0, v3, v4, v2}, Lz34;->d(DI)V

    .line 3413
    .line 3414
    .line 3415
    goto :goto_98

    .line 3416
    :cond_9b
    const/16 v6, 0x25

    .line 3417
    .line 3418
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 3419
    .line 3420
    .line 3421
    const/16 v6, 0x26

    .line 3422
    .line 3423
    invoke-interface {v0, v6}, Lz34;->e(I)V

    .line 3424
    .line 3425
    .line 3426
    invoke-interface {v0, v5}, Lz34;->e(I)V

    .line 3427
    .line 3428
    .line 3429
    invoke-interface {v0, v4}, Lz34;->e(I)V

    .line 3430
    .line 3431
    .line 3432
    invoke-interface {v0, v3}, Lz34;->e(I)V

    .line 3433
    .line 3434
    .line 3435
    invoke-interface {v0, v2}, Lz34;->e(I)V

    .line 3436
    .line 3437
    .line 3438
    :goto_98
    return-void

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lq20;->G:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "INSERT OR REPLACE INTO `server` (`id`,`server_name`,`username`,`password`,`address`,`local_address`,`timestamp`,`low_security`,`client_cert`) VALUES (?,?,?,?,?,?,?,?,?)"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "INSERT OR REPLACE INTO `recent_search` (`search`,`timestamp`) VALUES (?,?)"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "INSERT OR REPLACE INTO `queue` (`id`,`track_order`,`last_play`,`playing_changed`,`stream_id`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "INSERT OR REPLACE INTO `playlist_song` (`playlist_id`,`id`,`title`,`artist`,`album`,`track`,`cover_art_id`,`duration`,`album_id`,`artist_id`) VALUES (?,?,?,?,?,?,?,?,?,?)"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    const-string p0, "INSERT OR REPLACE INTO `lyrics_cache` (`song_id`,`artist`,`title`,`lyrics`,`structured_lyrics`,`updated_at`) VALUES (?,?,?,?,?,?)"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    const-string p0, "INSERT OR REPLACE INTO `internet_radio_station_cache` (`id`,`name`,`stream_url`,`home_page_url`,`source`,`cover_art_url`) VALUES (?,?,?,?,?,?)"

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    const-string p0, "INSERT OR IGNORE INTO `favorite` (`timestamp`,`songId`,`albumId`,`artistId`,`toStar`) VALUES (?,?,?,?,?)"

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    const-string p0, "INSERT OR IGNORE INTO `download` (`id`,`playlist_id`,`playlist_name`,`download_state`,`download_uri`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    const-string p0, "INSERT OR REPLACE INTO `download` (`id`,`playlist_id`,`playlist_name`,`download_state`,`download_uri`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    const-string p0, "INSERT OR REPLACE INTO `chronology` (`id`,`timestamp`,`server`,`parent_id`,`is_dir`,`title`,`album`,`artist`,`track`,`year`,`genre`,`cover_art_id`,`size`,`content_type`,`suffix`,`transcoding_content_type`,`transcoded_suffix`,`duration`,`bitrate`,`sampling_rate`,`bit_depth`,`path`,`is_video`,`user_rating`,`average_rating`,`play_count`,`disc_number`,`created`,`starred`,`album_id`,`artist_id`,`type`,`bookmark_position`,`original_width`,`original_height`,`album_artist`,`rg_track_gain`,`rg_album_gain`,`rg_track_peak`,`rg_album_peak`,`rg_base_gain`,`rg_fallback_gain`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 34
    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
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
