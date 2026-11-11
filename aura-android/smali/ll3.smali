.class public final Lll3;
.super Lau0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic G:I

.field public final synthetic H:Lml3;


# direct methods
.method public synthetic constructor <init>(Lml3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lll3;->G:I

    .line 2
    .line 3
    iput-object p1, p0, Lll3;->H:Lml3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Lz34;Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lll3;->G:I

    .line 6
    .line 7
    const/16 v3, 0xb

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    iget-object v0, v0, Lll3;->H:Lml3;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x4

    .line 17
    const/4 v10, 0x5

    .line 18
    const/4 v11, 0x6

    .line 19
    const/4 v12, 0x7

    .line 20
    const/16 v13, 0x9

    .line 21
    .line 22
    const/16 v14, 0xa

    .line 23
    .line 24
    const/16 v15, 0xc

    .line 25
    .line 26
    packed-switch v2, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v2, p2

    .line 30
    .line 31
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v16

    .line 37
    if-nez v16, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v7}, Lz34;->e(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-interface {v1, v7, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    if-nez v5, :cond_1

    .line 55
    .line 56
    invoke-interface {v1, v8}, Lz34;->e(I)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-interface {v1, v8, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 68
    .line 69
    .line 70
    move-result-wide v7

    .line 71
    invoke-interface {v1, v6, v7, v8}, Lz34;->c(IJ)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-nez v5, :cond_2

    .line 79
    .line 80
    invoke-interface {v1, v9}, Lz34;->e(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v1, v9, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getComment()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    invoke-interface {v1, v10}, Lz34;->e(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getComment()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-interface {v1, v10, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getOwner()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    if-nez v5, :cond_4

    .line 113
    .line 114
    invoke-interface {v1, v11}, Lz34;->e(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_4
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getOwner()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v1, v11, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :goto_4
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal()Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-nez v5, :cond_5

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    goto :goto_5

    .line 133
    :cond_5
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal()Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    :goto_5
    if-nez v5, :cond_6

    .line 146
    .line 147
    invoke-interface {v1, v12}, Lz34;->e(I)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    int-to-long v5, v5

    .line 156
    invoke-interface {v1, v12, v5, v6}, Lz34;->c(IJ)V

    .line 157
    .line 158
    .line 159
    :goto_6
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    int-to-long v5, v5

    .line 164
    invoke-interface {v1, v4, v5, v6}, Lz34;->c(IJ)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCreated()Ljava/util/Date;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v4}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-nez v4, :cond_7

    .line 176
    .line 177
    invoke-interface {v1, v13}, Lz34;->e(I)V

    .line 178
    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_7
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 182
    .line 183
    .line 184
    move-result-wide v4

    .line 185
    invoke-interface {v1, v13, v4, v5}, Lz34;->c(IJ)V

    .line 186
    .line 187
    .line 188
    :goto_7
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getChanged()Ljava/util/Date;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-static {v4}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    if-nez v4, :cond_8

    .line 197
    .line 198
    invoke-interface {v1, v14}, Lz34;->e(I)V

    .line 199
    .line 200
    .line 201
    goto :goto_8

    .line 202
    :cond_8
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 203
    .line 204
    .line 205
    move-result-wide v4

    .line 206
    invoke-interface {v1, v14, v4, v5}, Lz34;->c(IJ)V

    .line 207
    .line 208
    .line 209
    :goto_8
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getLastPlayed()J

    .line 210
    .line 211
    .line 212
    move-result-wide v4

    .line 213
    invoke-interface {v1, v3, v4, v5}, Lz34;->c(IJ)V

    .line 214
    .line 215
    .line 216
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lsi1;

    .line 219
    .line 220
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getAllowedUsers()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    iget-object v0, v0, Lsi1;->o:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v0, Lnk1;

    .line 227
    .line 228
    invoke-virtual {v0, v2}, Lnk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    if-nez v0, :cond_9

    .line 233
    .line 234
    invoke-interface {v1, v15}, Lz34;->e(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_9
    invoke-interface {v1, v15, v0}, Lz34;->r(ILjava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :goto_9
    return-void

    .line 242
    :pswitch_0
    move-object/from16 v2, p2

    .line 243
    .line 244
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 245
    .line 246
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    if-nez v5, :cond_a

    .line 251
    .line 252
    invoke-interface {v1, v7}, Lz34;->e(I)V

    .line 253
    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_a
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-interface {v1, v7, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :goto_a
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    if-nez v5, :cond_b

    .line 268
    .line 269
    invoke-interface {v1, v8}, Lz34;->e(I)V

    .line 270
    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_b
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    invoke-interface {v1, v8, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_b
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 281
    .line 282
    .line 283
    move-result-wide v7

    .line 284
    invoke-interface {v1, v6, v7, v8}, Lz34;->c(IJ)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    if-nez v5, :cond_c

    .line 292
    .line 293
    invoke-interface {v1, v9}, Lz34;->e(I)V

    .line 294
    .line 295
    .line 296
    goto :goto_c

    .line 297
    :cond_c
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-interface {v1, v9, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 302
    .line 303
    .line 304
    :goto_c
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getComment()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    if-nez v5, :cond_d

    .line 309
    .line 310
    invoke-interface {v1, v10}, Lz34;->e(I)V

    .line 311
    .line 312
    .line 313
    goto :goto_d

    .line 314
    :cond_d
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getComment()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-interface {v1, v10, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :goto_d
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getOwner()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    if-nez v5, :cond_e

    .line 326
    .line 327
    invoke-interface {v1, v11}, Lz34;->e(I)V

    .line 328
    .line 329
    .line 330
    goto :goto_e

    .line 331
    :cond_e
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getOwner()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    invoke-interface {v1, v11, v5}, Lz34;->r(ILjava/lang/String;)V

    .line 336
    .line 337
    .line 338
    :goto_e
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal()Ljava/lang/Boolean;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    if-nez v5, :cond_f

    .line 343
    .line 344
    const/4 v5, 0x0

    .line 345
    goto :goto_f

    .line 346
    :cond_f
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal()Ljava/lang/Boolean;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    :goto_f
    if-nez v5, :cond_10

    .line 359
    .line 360
    invoke-interface {v1, v12}, Lz34;->e(I)V

    .line 361
    .line 362
    .line 363
    goto :goto_10

    .line 364
    :cond_10
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    int-to-long v5, v5

    .line 369
    invoke-interface {v1, v12, v5, v6}, Lz34;->c(IJ)V

    .line 370
    .line 371
    .line 372
    :goto_10
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    int-to-long v5, v5

    .line 377
    invoke-interface {v1, v4, v5, v6}, Lz34;->c(IJ)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCreated()Ljava/util/Date;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-static {v4}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    if-nez v4, :cond_11

    .line 389
    .line 390
    invoke-interface {v1, v13}, Lz34;->e(I)V

    .line 391
    .line 392
    .line 393
    goto :goto_11

    .line 394
    :cond_11
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 395
    .line 396
    .line 397
    move-result-wide v4

    .line 398
    invoke-interface {v1, v13, v4, v5}, Lz34;->c(IJ)V

    .line 399
    .line 400
    .line 401
    :goto_11
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getChanged()Ljava/util/Date;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-static {v4}, Li80;->j(Ljava/util/Date;)Ljava/lang/Long;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    if-nez v4, :cond_12

    .line 410
    .line 411
    invoke-interface {v1, v14}, Lz34;->e(I)V

    .line 412
    .line 413
    .line 414
    goto :goto_12

    .line 415
    :cond_12
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 416
    .line 417
    .line 418
    move-result-wide v4

    .line 419
    invoke-interface {v1, v14, v4, v5}, Lz34;->c(IJ)V

    .line 420
    .line 421
    .line 422
    :goto_12
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getLastPlayed()J

    .line 423
    .line 424
    .line 425
    move-result-wide v4

    .line 426
    invoke-interface {v1, v3, v4, v5}, Lz34;->c(IJ)V

    .line 427
    .line 428
    .line 429
    iget-object v0, v0, Lml3;->d:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Lsi1;

    .line 432
    .line 433
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getAllowedUsers()Ljava/util/List;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    iget-object v0, v0, Lsi1;->o:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v0, Lnk1;

    .line 440
    .line 441
    invoke-virtual {v0, v2}, Lnk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-nez v0, :cond_13

    .line 446
    .line 447
    invoke-interface {v1, v15}, Lz34;->e(I)V

    .line 448
    .line 449
    .line 450
    goto :goto_13

    .line 451
    :cond_13
    invoke-interface {v1, v15, v0}, Lz34;->r(ILjava/lang/String;)V

    .line 452
    .line 453
    .line 454
    :goto_13
    return-void

    .line 455
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lll3;->G:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "INSERT OR IGNORE INTO `playlist` (`id`,`name`,`duration`,`coverArt`,`comment`,`owner`,`isUniversal`,`songCount`,`created`,`changed`,`lastPlayed`,`allowedUsers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "INSERT OR REPLACE INTO `playlist` (`id`,`name`,`duration`,`coverArt`,`comment`,`owner`,`isUniversal`,`songCount`,`created`,`changed`,`lastPlayed`,`allowedUsers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
