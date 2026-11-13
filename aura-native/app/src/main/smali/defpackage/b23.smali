.class public final Ldefpackage/b23;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/b23;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ldefpackage/b23;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, Ldefpackage/v14;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ldefpackage/v14;-><init>(Landroid/os/Parcel;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Ldefpackage/h04;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Ldefpackage/h04;-><init>(I)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v2, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    move-object v3, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v3, v0

    .line 51
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    move-object v0, v4

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-nez v5, :cond_2

    .line 72
    .line 73
    move-object v5, v4

    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-nez v6, :cond_3

    .line 88
    .line 89
    move-object v6, v4

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-nez v7, :cond_4

    .line 104
    .line 105
    move-object v7, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-nez v8, :cond_5

    .line 120
    .line 121
    :goto_5
    move-object v8, v4

    .line 122
    move-object v4, v0

    .line 123
    goto :goto_6

    .line 124
    :cond_5
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    goto :goto_5

    .line 133
    :goto_6
    invoke-direct/range {v2 .. v8}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 134
    .line 135
    .line 136
    return-object v2

    .line 137
    :pswitch_2
    invoke-static {v1}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-ge v2, v0, :cond_6

    .line 146
    .line 147
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v1, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 152
    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_6
    invoke-static {v1, v0}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 156
    .line 157
    .line 158
    new-instance v0, Ldefpackage/dy3;

    .line 159
    .line 160
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_3
    invoke-static {v1}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-ge v2, v0, :cond_7

    .line 173
    .line 174
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-static {v1, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 179
    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_7
    invoke-static {v1, v0}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 183
    .line 184
    .line 185
    new-instance v0, Ldefpackage/vx3;

    .line 186
    .line 187
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 188
    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/RecordLabel;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/RecordLabel;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    new-instance v0, Lcom/eddyizm/tempus/model/RecentSearch;

    .line 208
    .line 209
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 214
    .line 215
    .line 216
    move-result-wide v3

    .line 217
    invoke-direct {v0, v2, v3, v4}, Lcom/eddyizm/tempus/model/RecentSearch;-><init>(Ljava/lang/String;J)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_6
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    invoke-direct {v0, v2, v1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    .line 232
    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_7
    new-instance v0, Ldefpackage/mu3;

    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    invoke-virtual {v1}, Landroid/os/Parcel;->readFloat()F

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-direct {v0, v2, v1}, Ldefpackage/mu3;-><init>(IF)V

    .line 246
    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance v3, Lcom/eddyizm/tempus/model/Queue;

    .line 253
    .line 254
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 263
    .line 264
    .line 265
    move-result-wide v6

    .line 266
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 267
    .line 268
    .line 269
    move-result-wide v8

    .line 270
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    invoke-direct/range {v3 .. v10}, Lcom/eddyizm/tempus/model/Queue;-><init>(Ljava/lang/String;IJJLjava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-object v3

    .line 278
    :pswitch_9
    new-instance v0, Ldefpackage/lp3;

    .line 279
    .line 280
    invoke-direct {v0, v1}, Ldefpackage/lp3;-><init>(Landroid/os/Parcel;)V

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_a
    new-instance v0, Ldefpackage/ap3;

    .line 285
    .line 286
    invoke-direct {v0, v1}, Ldefpackage/ap3;-><init>(Landroid/os/Parcel;)V

    .line 287
    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-object v0, v1

    .line 294
    new-instance v1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 295
    .line 296
    move v5, v2

    .line 297
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    move v6, v3

    .line 302
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-eqz v7, :cond_8

    .line 311
    .line 312
    move-object v7, v4

    .line 313
    move v8, v5

    .line 314
    move v4, v6

    .line 315
    goto :goto_9

    .line 316
    :cond_8
    move-object v7, v4

    .line 317
    move v4, v5

    .line 318
    move v8, v4

    .line 319
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v5

    .line 323
    move v9, v6

    .line 324
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v6

    .line 328
    move-object v10, v7

    .line 329
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 334
    .line 335
    .line 336
    move-result v11

    .line 337
    if-nez v11, :cond_9

    .line 338
    .line 339
    move-object v11, v10

    .line 340
    :goto_a
    move v12, v9

    .line 341
    goto :goto_b

    .line 342
    :cond_9
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v11

    .line 350
    goto :goto_a

    .line 351
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v9

    .line 355
    move-object v13, v10

    .line 356
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 361
    .line 362
    .line 363
    move-result v14

    .line 364
    if-nez v14, :cond_a

    .line 365
    .line 366
    move-object v14, v13

    .line 367
    :goto_c
    move v15, v12

    .line 368
    goto :goto_d

    .line 369
    :cond_a
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 370
    .line 371
    .line 372
    move-result-wide v14

    .line 373
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    goto :goto_c

    .line 378
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v12

    .line 382
    move-object/from16 v16, v13

    .line 383
    .line 384
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v13

    .line 388
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 389
    .line 390
    .line 391
    move-result v17

    .line 392
    if-nez v17, :cond_b

    .line 393
    .line 394
    move-object/from16 v17, v16

    .line 395
    .line 396
    goto :goto_e

    .line 397
    :cond_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 398
    .line 399
    .line 400
    move-result v17

    .line 401
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object v17

    .line 405
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 406
    .line 407
    .line 408
    move-result v18

    .line 409
    if-nez v18, :cond_c

    .line 410
    .line 411
    goto :goto_f

    .line 412
    :cond_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 413
    .line 414
    .line 415
    move-result v16

    .line 416
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 417
    .line 418
    .line 419
    move-result-object v16

    .line 420
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v18

    .line 424
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 425
    .line 426
    .line 427
    move-result v19

    .line 428
    if-eqz v19, :cond_d

    .line 429
    .line 430
    move-object v8, v11

    .line 431
    move-object v11, v14

    .line 432
    move-object/from16 v14, v17

    .line 433
    .line 434
    move/from16 v17, v15

    .line 435
    .line 436
    goto :goto_10

    .line 437
    :cond_d
    move-object/from16 v26, v17

    .line 438
    .line 439
    move/from16 v17, v8

    .line 440
    .line 441
    move-object v8, v11

    .line 442
    move-object v11, v14

    .line 443
    move-object/from16 v14, v26

    .line 444
    .line 445
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 446
    .line 447
    .line 448
    move-result-object v15

    .line 449
    check-cast v15, Ljava/util/Date;

    .line 450
    .line 451
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v19

    .line 455
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v20

    .line 459
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v21

    .line 463
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v22

    .line 467
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v23

    .line 471
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v24

    .line 475
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    move-object/from16 v25, v0

    .line 480
    .line 481
    check-cast v25, Ljava/util/Date;

    .line 482
    .line 483
    move-object/from16 v26, v18

    .line 484
    .line 485
    move-object/from16 v18, v15

    .line 486
    .line 487
    move-object/from16 v15, v16

    .line 488
    .line 489
    move-object/from16 v16, v26

    .line 490
    .line 491
    invoke-direct/range {v1 .. v25}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    .line 492
    .line 493
    .line 494
    return-object v1

    .line 495
    :pswitch_c
    move-object v0, v1

    .line 496
    move v8, v2

    .line 497
    move-object/from16 v16, v4

    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-nez v1, :cond_e

    .line 507
    .line 508
    move-object/from16 v6, v16

    .line 509
    .line 510
    goto :goto_12

    .line 511
    :cond_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    new-instance v4, Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 518
    .line 519
    .line 520
    move v2, v8

    .line 521
    :goto_11
    if-eq v2, v1, :cond_f

    .line 522
    .line 523
    sget-object v3, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 524
    .line 525
    invoke-interface {v3, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    add-int/lit8 v2, v2, 0x1

    .line 533
    .line 534
    goto :goto_11

    .line 535
    :cond_f
    move-object v6, v4

    .line 536
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v8

    .line 544
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v11

    .line 556
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v12

    .line 560
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v13

    .line 564
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v14

    .line 568
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 569
    .line 570
    invoke-direct/range {v5 .. v14}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    return-object v5

    .line 574
    :pswitch_d
    move-object v0, v1

    .line 575
    move v8, v2

    .line 576
    move-object/from16 v16, v4

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-nez v1, :cond_10

    .line 586
    .line 587
    move-object/from16 v4, v16

    .line 588
    .line 589
    goto :goto_14

    .line 590
    :cond_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 591
    .line 592
    .line 593
    move-result v1

    .line 594
    new-instance v4, Ljava/util/ArrayList;

    .line 595
    .line 596
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 597
    .line 598
    .line 599
    move v2, v8

    .line 600
    :goto_13
    if-eq v2, v1, :cond_11

    .line 601
    .line 602
    const-class v3, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 603
    .line 604
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual {v0, v3}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    add-int/lit8 v2, v2, 0x1

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_11
    :goto_14
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 619
    .line 620
    invoke-direct {v0, v4}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;-><init>(Ljava/util/List;)V

    .line 621
    .line 622
    .line 623
    return-object v0

    .line 624
    :pswitch_e
    move-object v0, v1

    .line 625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 629
    .line 630
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v7

    .line 638
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 639
    .line 640
    .line 641
    move-result-wide v8

    .line 642
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v10

    .line 646
    invoke-direct/range {v5 .. v10}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 647
    .line 648
    .line 649
    return-object v5

    .line 650
    :pswitch_f
    move-object v0, v1

    .line 651
    new-instance v1, Ldefpackage/di3;

    .line 652
    .line 653
    invoke-direct {v1, v0}, Ldefpackage/di3;-><init>(Landroid/os/Parcel;)V

    .line 654
    .line 655
    .line 656
    return-object v1

    .line 657
    :pswitch_10
    move-object v0, v1

    .line 658
    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 659
    .line 660
    invoke-direct {v1, v0}, Landroid/support/v4/media/session/PlaybackStateCompat;-><init>(Landroid/os/Parcel;)V

    .line 661
    .line 662
    .line 663
    return-object v1

    .line 664
    :pswitch_11
    move-object v0, v1

    .line 665
    new-instance v1, Ldefpackage/ei3;

    .line 666
    .line 667
    invoke-direct {v1, v0}, Ldefpackage/ei3;-><init>(Landroid/os/Parcel;)V

    .line 668
    .line 669
    .line 670
    return-object v1

    .line 671
    :pswitch_12
    move-object v0, v1

    .line 672
    move v15, v3

    .line 673
    move-object/from16 v16, v4

    .line 674
    .line 675
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 680
    .line 681
    .line 682
    move-result v2

    .line 683
    if-ge v2, v1, :cond_13

    .line 684
    .line 685
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 686
    .line 687
    .line 688
    move-result v2

    .line 689
    int-to-char v3, v2

    .line 690
    if-eq v3, v15, :cond_12

    .line 691
    .line 692
    invoke-static {v0, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 693
    .line 694
    .line 695
    goto :goto_15

    .line 696
    :cond_12
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 697
    .line 698
    invoke-static {v0, v2, v3}, Ldefpackage/l93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    move-object v4, v2

    .line 703
    check-cast v4, Landroid/app/PendingIntent;

    .line 704
    .line 705
    goto :goto_15

    .line 706
    :cond_13
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 707
    .line 708
    .line 709
    new-instance v0, Ldefpackage/if3;

    .line 710
    .line 711
    invoke-direct {v0, v4}, Ldefpackage/if3;-><init>(Landroid/app/PendingIntent;)V

    .line 712
    .line 713
    .line 714
    return-object v0

    .line 715
    :pswitch_13
    move-object v0, v1

    .line 716
    move v15, v3

    .line 717
    move-object/from16 v16, v4

    .line 718
    .line 719
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 724
    .line 725
    .line 726
    move-result v2

    .line 727
    if-ge v2, v1, :cond_15

    .line 728
    .line 729
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    int-to-char v3, v2

    .line 734
    if-eq v3, v15, :cond_14

    .line 735
    .line 736
    invoke-static {v0, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 737
    .line 738
    .line 739
    goto :goto_16

    .line 740
    :cond_14
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 741
    .line 742
    invoke-static {v0, v2, v3}, Ldefpackage/l93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    move-object v4, v2

    .line 747
    check-cast v4, Landroid/app/PendingIntent;

    .line 748
    .line 749
    goto :goto_16

    .line 750
    :cond_15
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 751
    .line 752
    .line 753
    new-instance v0, Ldefpackage/hf3;

    .line 754
    .line 755
    invoke-direct {v0, v4}, Ldefpackage/hf3;-><init>(Landroid/app/PendingIntent;)V

    .line 756
    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_14
    move-object v0, v1

    .line 760
    new-instance v1, Landroid/support/v4/media/session/ParcelableVolumeInfo;

    .line 761
    .line 762
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    iput v2, v1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->n:I

    .line 770
    .line 771
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 772
    .line 773
    .line 774
    move-result v2

    .line 775
    iput v2, v1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->p:I

    .line 776
    .line 777
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    iput v2, v1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->q:I

    .line 782
    .line 783
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 784
    .line 785
    .line 786
    move-result v2

    .line 787
    iput v2, v1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->r:I

    .line 788
    .line 789
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 790
    .line 791
    .line 792
    move-result v0

    .line 793
    iput v0, v1, Landroid/support/v4/media/session/ParcelableVolumeInfo;->o:I

    .line 794
    .line 795
    return-object v1

    .line 796
    :pswitch_15
    move-object v0, v1

    .line 797
    new-instance v1, Ldefpackage/xd3;

    .line 798
    .line 799
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 800
    .line 801
    .line 802
    move-result-wide v2

    .line 803
    invoke-direct {v1, v2, v3}, Ldefpackage/xd3;-><init>(J)V

    .line 804
    .line 805
    .line 806
    return-object v1

    .line 807
    :pswitch_16
    move-object v0, v1

    .line 808
    new-instance v1, Ldefpackage/wd3;

    .line 809
    .line 810
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 811
    .line 812
    .line 813
    move-result v0

    .line 814
    invoke-direct {v1, v0}, Ldefpackage/wd3;-><init>(I)V

    .line 815
    .line 816
    .line 817
    return-object v1

    .line 818
    :pswitch_17
    move-object v0, v1

    .line 819
    new-instance v1, Ldefpackage/vd3;

    .line 820
    .line 821
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    invoke-direct {v1, v0}, Ldefpackage/vd3;-><init>(F)V

    .line 826
    .line 827
    .line 828
    return-object v1

    .line 829
    :pswitch_18
    move-object v0, v1

    .line 830
    new-instance v1, Landroidx/versionedparcelable/ParcelImpl;

    .line 831
    .line 832
    invoke-direct {v1, v0}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 833
    .line 834
    .line 835
    return-object v1

    .line 836
    :pswitch_19
    move-object v0, v1

    .line 837
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    new-instance v2, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;

    .line 841
    .line 842
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v3

    .line 846
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 851
    .line 852
    .line 853
    move-result v5

    .line 854
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 855
    .line 856
    .line 857
    move-result v6

    .line 858
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v7

    .line 862
    invoke-direct/range {v2 .. v7}, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    .line 863
    .line 864
    .line 865
    return-object v2

    .line 866
    :pswitch_1a
    move-object v0, v1

    .line 867
    new-instance v1, Ldefpackage/h53;

    .line 868
    .line 869
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 873
    .line 874
    .line 875
    move-result v0

    .line 876
    iput v0, v1, Ldefpackage/h53;->n:I

    .line 877
    .line 878
    return-object v1

    .line 879
    :pswitch_1b
    move-object v0, v1

    .line 880
    new-instance v1, Ldefpackage/n33;

    .line 881
    .line 882
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 886
    .line 887
    .line 888
    move-result v2

    .line 889
    iput v2, v1, Ldefpackage/n33;->n:I

    .line 890
    .line 891
    const-class v2, Ldefpackage/n33;

    .line 892
    .line 893
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    check-cast v0, Ldefpackage/ae3;

    .line 902
    .line 903
    iput-object v0, v1, Ldefpackage/n33;->o:Ldefpackage/ae3;

    .line 904
    .line 905
    return-object v1

    .line 906
    :pswitch_1c
    move-object v0, v1

    .line 907
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    .line 909
    .line 910
    new-instance v1, Ldefpackage/c23;

    .line 911
    .line 912
    invoke-direct {v1, v0}, Ldefpackage/c23;-><init>(Landroid/os/Parcel;)V

    .line 913
    .line 914
    .line 915
    return-object v1

    .line 916
    nop

    .line 917
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/b23;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Ldefpackage/v14;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Ldefpackage/h04;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Ldefpackage/dy3;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Ldefpackage/vx3;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/RecordLabel;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/eddyizm/tempus/model/RecentSearch;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Landroid/support/v4/media/RatingCompat;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Ldefpackage/mu3;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/eddyizm/tempus/model/Queue;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Ldefpackage/lp3;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Ldefpackage/ap3;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Ldefpackage/di3;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Landroid/support/v4/media/session/PlaybackStateCompat;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Ldefpackage/ei3;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Ldefpackage/if3;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Ldefpackage/hf3;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Landroid/support/v4/media/session/ParcelableVolumeInfo;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Ldefpackage/xd3;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Ldefpackage/wd3;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Ldefpackage/vd3;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Ldefpackage/h53;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Ldefpackage/n33;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Ldefpackage/c23;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
