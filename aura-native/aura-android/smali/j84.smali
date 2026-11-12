.class public final Lj84;
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
    iput p1, p0, Lj84;->a:I

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lj84;->a:I

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    int-to-char v3, v2

    .line 33
    if-eq v3, v7, :cond_0

    .line 34
    .line 35
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 40
    .line 41
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v9, v2

    .line 46
    check-cast v9, Landroid/app/PendingIntent;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Ls44;

    .line 53
    .line 54
    invoke-direct {v0, v9}, Ls44;-><init>(Landroid/app/PendingIntent;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    move-object v2, v9

    .line 63
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-ge v3, v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    int-to-char v4, v3

    .line 74
    if-eq v4, v7, :cond_4

    .line 75
    .line 76
    if-eq v4, v6, :cond_3

    .line 77
    .line 78
    if-eq v4, v5, :cond_2

    .line 79
    .line 80
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-static {v1, v3}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 85
    .line 86
    .line 87
    move-result v8

    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static {v1, v3}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    goto :goto_1

    .line 94
    :cond_4
    sget-object v4, Lvd4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 95
    .line 96
    invoke-static {v1, v3, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    move-object v9, v3

    .line 101
    check-cast v9, Lvd4;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 105
    .line 106
    .line 107
    new-instance v0, Lr44;

    .line 108
    .line 109
    invoke-direct {v0, v9, v2, v8}, Lr44;-><init>(Lvd4;Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :pswitch_1
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ge v2, v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    int-to-char v3, v2

    .line 128
    if-eq v3, v7, :cond_6

    .line 129
    .line 130
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    goto :goto_2

    .line 139
    :cond_7
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 140
    .line 141
    .line 142
    new-instance v0, Lbs;

    .line 143
    .line 144
    invoke-direct {v0, v8}, Lbs;-><init>(Z)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :pswitch_2
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    move-object v2, v9

    .line 153
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-ge v3, v0, :cond_b

    .line 158
    .line 159
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    int-to-char v4, v3

    .line 164
    if-eq v4, v7, :cond_a

    .line 165
    .line 166
    if-eq v4, v6, :cond_9

    .line 167
    .line 168
    if-eq v4, v5, :cond_8

    .line 169
    .line 170
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_8
    invoke-static {v1, v3}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    goto :goto_3

    .line 179
    :cond_9
    invoke-static {v1, v3}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 180
    .line 181
    .line 182
    move-result-object v9

    .line 183
    goto :goto_3

    .line 184
    :cond_a
    invoke-static {v1, v3}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    goto :goto_3

    .line 189
    :cond_b
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Las;

    .line 193
    .line 194
    invoke-direct {v0, v8, v9, v2}, Las;-><init>(Z[BLjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_3
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    if-ge v2, v0, :cond_e

    .line 207
    .line 208
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    int-to-char v3, v2

    .line 213
    if-eq v3, v7, :cond_d

    .line 214
    .line 215
    if-eq v3, v6, :cond_c

    .line 216
    .line 217
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_c
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    goto :goto_4

    .line 226
    :cond_d
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    goto :goto_4

    .line 231
    :cond_e
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 232
    .line 233
    .line 234
    new-instance v0, Lzr;

    .line 235
    .line 236
    invoke-direct {v0, v8, v9}, Lzr;-><init>(ZLjava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_4
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    move v11, v8

    .line 245
    move v14, v11

    .line 246
    move/from16 v17, v14

    .line 247
    .line 248
    move-object v12, v9

    .line 249
    move-object v13, v12

    .line 250
    move-object v15, v13

    .line 251
    move-object/from16 v16, v15

    .line 252
    .line 253
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-ge v2, v0, :cond_10

    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    int-to-char v3, v2

    .line 264
    packed-switch v3, :pswitch_data_1

    .line 265
    .line 266
    .line 267
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :pswitch_5
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 272
    .line 273
    .line 274
    move-result v17

    .line 275
    goto :goto_5

    .line 276
    :pswitch_6
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-nez v2, :cond_f

    .line 285
    .line 286
    move-object/from16 v16, v9

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_f
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    add-int/2addr v3, v2

    .line 294
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v16, v4

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :pswitch_7
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v15

    .line 304
    goto :goto_5

    .line 305
    :pswitch_8
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 306
    .line 307
    .line 308
    move-result v14

    .line 309
    goto :goto_5

    .line 310
    :pswitch_9
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    goto :goto_5

    .line 315
    :pswitch_a
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    goto :goto_5

    .line 320
    :pswitch_b
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    goto :goto_5

    .line 325
    :cond_10
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 326
    .line 327
    .line 328
    new-instance v10, Lyr;

    .line 329
    .line 330
    invoke-direct/range {v10 .. v17}, Lyr;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Z)V

    .line 331
    .line 332
    .line 333
    return-object v10

    .line 334
    :pswitch_c
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    move v6, v8

    .line 339
    move v7, v6

    .line 340
    move-object v2, v9

    .line 341
    move-object v3, v2

    .line 342
    move-object v4, v3

    .line 343
    move-object v5, v4

    .line 344
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 345
    .line 346
    .line 347
    move-result v8

    .line 348
    if-ge v8, v0, :cond_11

    .line 349
    .line 350
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 351
    .line 352
    .line 353
    move-result v8

    .line 354
    int-to-char v9, v8

    .line 355
    packed-switch v9, :pswitch_data_2

    .line 356
    .line 357
    .line 358
    invoke-static {v1, v8}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 359
    .line 360
    .line 361
    goto :goto_6

    .line 362
    :pswitch_d
    invoke-static {v1, v8}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 363
    .line 364
    .line 365
    move-result v7

    .line 366
    goto :goto_6

    .line 367
    :pswitch_e
    invoke-static {v1, v8}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    goto :goto_6

    .line 372
    :pswitch_f
    invoke-static {v1, v8}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    goto :goto_6

    .line 377
    :pswitch_10
    invoke-static {v1, v8}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    goto :goto_6

    .line 382
    :pswitch_11
    invoke-static {v1, v8}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    goto :goto_6

    .line 387
    :pswitch_12
    invoke-static {v1, v8}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    goto :goto_6

    .line 392
    :cond_11
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 393
    .line 394
    .line 395
    new-instance v1, Lth1;

    .line 396
    .line 397
    invoke-direct/range {v1 .. v7}, Lth1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 398
    .line 399
    .line 400
    return-object v1

    .line 401
    :pswitch_13
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 402
    .line 403
    .line 404
    move-result v0

    .line 405
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    if-ge v2, v0, :cond_13

    .line 410
    .line 411
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    int-to-char v3, v2

    .line 416
    if-eq v3, v7, :cond_12

    .line 417
    .line 418
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 419
    .line 420
    .line 421
    goto :goto_7

    .line 422
    :cond_12
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 423
    .line 424
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    move-object v9, v2

    .line 429
    check-cast v9, Landroid/app/PendingIntent;

    .line 430
    .line 431
    goto :goto_7

    .line 432
    :cond_13
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 433
    .line 434
    .line 435
    new-instance v0, Lds;

    .line 436
    .line 437
    invoke-direct {v0, v9}, Lds;-><init>(Landroid/app/PendingIntent;)V

    .line 438
    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_14
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    move v14, v8

    .line 446
    move v15, v14

    .line 447
    move/from16 v18, v15

    .line 448
    .line 449
    move-object v11, v9

    .line 450
    move-object v12, v11

    .line 451
    move-object v13, v12

    .line 452
    move-object/from16 v16, v13

    .line 453
    .line 454
    move-object/from16 v17, v16

    .line 455
    .line 456
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    if-ge v2, v0, :cond_14

    .line 461
    .line 462
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    int-to-char v3, v2

    .line 467
    packed-switch v3, :pswitch_data_3

    .line 468
    .line 469
    .line 470
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 471
    .line 472
    .line 473
    goto :goto_8

    .line 474
    :pswitch_15
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 475
    .line 476
    .line 477
    move-result v18

    .line 478
    goto :goto_8

    .line 479
    :pswitch_16
    sget-object v3, Lzr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 480
    .line 481
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    move-object/from16 v17, v2

    .line 486
    .line 487
    check-cast v17, Lzr;

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :pswitch_17
    sget-object v3, Las;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 491
    .line 492
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    move-object/from16 v16, v2

    .line 497
    .line 498
    check-cast v16, Las;

    .line 499
    .line 500
    goto :goto_8

    .line 501
    :pswitch_18
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 502
    .line 503
    .line 504
    move-result v15

    .line 505
    goto :goto_8

    .line 506
    :pswitch_19
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 507
    .line 508
    .line 509
    move-result v14

    .line 510
    goto :goto_8

    .line 511
    :pswitch_1a
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v13

    .line 515
    goto :goto_8

    .line 516
    :pswitch_1b
    sget-object v3, Lyr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 517
    .line 518
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    move-object v12, v2

    .line 523
    check-cast v12, Lyr;

    .line 524
    .line 525
    goto :goto_8

    .line 526
    :pswitch_1c
    sget-object v3, Lbs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 527
    .line 528
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    move-object v11, v2

    .line 533
    check-cast v11, Lbs;

    .line 534
    .line 535
    goto :goto_8

    .line 536
    :cond_14
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 537
    .line 538
    .line 539
    new-instance v10, Lcs;

    .line 540
    .line 541
    invoke-direct/range {v10 .. v18}, Lcs;-><init>(Lbs;Lyr;Ljava/lang/String;ZILas;Lzr;Z)V

    .line 542
    .line 543
    .line 544
    return-object v10

    .line 545
    :pswitch_1d
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 546
    .line 547
    .line 548
    move-result v0

    .line 549
    const-string v2, ""

    .line 550
    .line 551
    move-object v3, v2

    .line 552
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 553
    .line 554
    .line 555
    move-result v5

    .line 556
    if-ge v5, v0, :cond_18

    .line 557
    .line 558
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 559
    .line 560
    .line 561
    move-result v5

    .line 562
    int-to-char v6, v5

    .line 563
    if-eq v6, v4, :cond_17

    .line 564
    .line 565
    const/4 v7, 0x7

    .line 566
    if-eq v6, v7, :cond_16

    .line 567
    .line 568
    const/16 v7, 0x8

    .line 569
    .line 570
    if-eq v6, v7, :cond_15

    .line 571
    .line 572
    invoke-static {v1, v5}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 573
    .line 574
    .line 575
    goto :goto_9

    .line 576
    :cond_15
    invoke-static {v1, v5}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    goto :goto_9

    .line 581
    :cond_16
    sget-object v6, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 582
    .line 583
    invoke-static {v1, v5, v6}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    move-object v9, v5

    .line 588
    check-cast v9, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 589
    .line 590
    goto :goto_9

    .line 591
    :cond_17
    invoke-static {v1, v5}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    goto :goto_9

    .line 596
    :cond_18
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 597
    .line 598
    .line 599
    new-instance v0, Lcom/google/android/gms/auth/api/signin/SignInAccount;

    .line 600
    .line 601
    invoke-direct {v0, v2, v9, v3}, Lcom/google/android/gms/auth/api/signin/SignInAccount;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Ljava/lang/String;)V

    .line 602
    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_1e
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    move v11, v8

    .line 610
    move v14, v11

    .line 611
    move v15, v14

    .line 612
    move-object v12, v9

    .line 613
    move-object v13, v12

    .line 614
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    if-ge v2, v0, :cond_1f

    .line 619
    .line 620
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 621
    .line 622
    .line 623
    move-result v2

    .line 624
    int-to-char v3, v2

    .line 625
    if-eq v3, v7, :cond_1e

    .line 626
    .line 627
    if-eq v3, v6, :cond_1c

    .line 628
    .line 629
    if-eq v3, v5, :cond_1b

    .line 630
    .line 631
    if-eq v3, v4, :cond_1a

    .line 632
    .line 633
    const/4 v8, 0x5

    .line 634
    if-eq v3, v8, :cond_19

    .line 635
    .line 636
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 637
    .line 638
    .line 639
    goto :goto_a

    .line 640
    :cond_19
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 641
    .line 642
    .line 643
    move-result v15

    .line 644
    goto :goto_a

    .line 645
    :cond_1a
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 646
    .line 647
    .line 648
    move-result v14

    .line 649
    goto :goto_a

    .line 650
    :cond_1b
    sget-object v3, Lka0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 651
    .line 652
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    move-object v13, v2

    .line 657
    check-cast v13, Lka0;

    .line 658
    .line 659
    goto :goto_a

    .line 660
    :cond_1c
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    if-nez v2, :cond_1d

    .line 669
    .line 670
    move-object v12, v9

    .line 671
    goto :goto_a

    .line 672
    :cond_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 673
    .line 674
    .line 675
    move-result-object v8

    .line 676
    add-int/2addr v3, v2

    .line 677
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 678
    .line 679
    .line 680
    move-object v12, v8

    .line 681
    goto :goto_a

    .line 682
    :cond_1e
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 683
    .line 684
    .line 685
    move-result v11

    .line 686
    goto :goto_a

    .line 687
    :cond_1f
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 688
    .line 689
    .line 690
    new-instance v10, Lig5;

    .line 691
    .line 692
    invoke-direct/range {v10 .. v15}, Lig5;-><init>(ILandroid/os/IBinder;Lka0;ZZ)V

    .line 693
    .line 694
    .line 695
    return-object v10

    .line 696
    :pswitch_1f
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    move v2, v8

    .line 701
    move-object v3, v9

    .line 702
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 703
    .line 704
    .line 705
    move-result v10

    .line 706
    if-ge v10, v0, :cond_24

    .line 707
    .line 708
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 709
    .line 710
    .line 711
    move-result v10

    .line 712
    int-to-char v11, v10

    .line 713
    if-eq v11, v7, :cond_23

    .line 714
    .line 715
    if-eq v11, v6, :cond_22

    .line 716
    .line 717
    if-eq v11, v5, :cond_21

    .line 718
    .line 719
    if-eq v11, v4, :cond_20

    .line 720
    .line 721
    invoke-static {v1, v10}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 722
    .line 723
    .line 724
    goto :goto_b

    .line 725
    :cond_20
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 726
    .line 727
    invoke-static {v1, v10, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 732
    .line 733
    goto :goto_b

    .line 734
    :cond_21
    invoke-static {v1, v10}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 735
    .line 736
    .line 737
    move-result v2

    .line 738
    goto :goto_b

    .line 739
    :cond_22
    sget-object v9, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 740
    .line 741
    invoke-static {v1, v10, v9}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 742
    .line 743
    .line 744
    move-result-object v9

    .line 745
    check-cast v9, Landroid/accounts/Account;

    .line 746
    .line 747
    goto :goto_b

    .line 748
    :cond_23
    invoke-static {v1, v10}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 749
    .line 750
    .line 751
    move-result v8

    .line 752
    goto :goto_b

    .line 753
    :cond_24
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 754
    .line 755
    .line 756
    new-instance v0, Lhg5;

    .line 757
    .line 758
    invoke-direct {v0, v8, v9, v2, v3}, Lhg5;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    .line 759
    .line 760
    .line 761
    return-object v0

    .line 762
    :pswitch_20
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    const/4 v4, -0x1

    .line 767
    move-wide v14, v2

    .line 768
    move-wide/from16 v16, v14

    .line 769
    .line 770
    move/from16 v21, v4

    .line 771
    .line 772
    move v11, v8

    .line 773
    move v12, v11

    .line 774
    move v13, v12

    .line 775
    move/from16 v20, v13

    .line 776
    .line 777
    move-object/from16 v18, v9

    .line 778
    .line 779
    move-object/from16 v19, v18

    .line 780
    .line 781
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 782
    .line 783
    .line 784
    move-result v2

    .line 785
    if-ge v2, v0, :cond_25

    .line 786
    .line 787
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 788
    .line 789
    .line 790
    move-result v2

    .line 791
    int-to-char v3, v2

    .line 792
    packed-switch v3, :pswitch_data_4

    .line 793
    .line 794
    .line 795
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 796
    .line 797
    .line 798
    goto :goto_c

    .line 799
    :pswitch_21
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    move/from16 v21, v2

    .line 804
    .line 805
    goto :goto_c

    .line 806
    :pswitch_22
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    move/from16 v20, v2

    .line 811
    .line 812
    goto :goto_c

    .line 813
    :pswitch_23
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    move-object/from16 v19, v2

    .line 818
    .line 819
    goto :goto_c

    .line 820
    :pswitch_24
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    move-object/from16 v18, v2

    .line 825
    .line 826
    goto :goto_c

    .line 827
    :pswitch_25
    invoke-static {v1, v2}, Ll93;->X(Landroid/os/Parcel;I)J

    .line 828
    .line 829
    .line 830
    move-result-wide v2

    .line 831
    move-wide/from16 v16, v2

    .line 832
    .line 833
    goto :goto_c

    .line 834
    :pswitch_26
    invoke-static {v1, v2}, Ll93;->X(Landroid/os/Parcel;I)J

    .line 835
    .line 836
    .line 837
    move-result-wide v2

    .line 838
    move-wide v14, v2

    .line 839
    goto :goto_c

    .line 840
    :pswitch_27
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 841
    .line 842
    .line 843
    move-result v2

    .line 844
    move v13, v2

    .line 845
    goto :goto_c

    .line 846
    :pswitch_28
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    move v12, v2

    .line 851
    goto :goto_c

    .line 852
    :pswitch_29
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    move v11, v2

    .line 857
    goto :goto_c

    .line 858
    :cond_25
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 859
    .line 860
    .line 861
    new-instance v10, Liw2;

    .line 862
    .line 863
    invoke-direct/range {v10 .. v21}, Liw2;-><init>(IIIJJLjava/lang/String;Ljava/lang/String;II)V

    .line 864
    .line 865
    .line 866
    return-object v10

    .line 867
    :pswitch_2a
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    move-object v2, v9

    .line 872
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 873
    .line 874
    .line 875
    move-result v3

    .line 876
    if-ge v3, v0, :cond_29

    .line 877
    .line 878
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 879
    .line 880
    .line 881
    move-result v3

    .line 882
    int-to-char v4, v3

    .line 883
    if-eq v4, v7, :cond_28

    .line 884
    .line 885
    if-eq v4, v6, :cond_27

    .line 886
    .line 887
    if-eq v4, v5, :cond_26

    .line 888
    .line 889
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 890
    .line 891
    .line 892
    goto :goto_d

    .line 893
    :cond_26
    sget-object v2, Lig5;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 894
    .line 895
    invoke-static {v1, v3, v2}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 896
    .line 897
    .line 898
    move-result-object v2

    .line 899
    check-cast v2, Lig5;

    .line 900
    .line 901
    goto :goto_d

    .line 902
    :cond_27
    sget-object v4, Lka0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 903
    .line 904
    invoke-static {v1, v3, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    move-object v9, v3

    .line 909
    check-cast v9, Lka0;

    .line 910
    .line 911
    goto :goto_d

    .line 912
    :cond_28
    invoke-static {v1, v3}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 913
    .line 914
    .line 915
    move-result v8

    .line 916
    goto :goto_d

    .line 917
    :cond_29
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 918
    .line 919
    .line 920
    new-instance v0, Ldg5;

    .line 921
    .line 922
    invoke-direct {v0, v8, v9, v2}, Ldg5;-><init>(ILka0;Lig5;)V

    .line 923
    .line 924
    .line 925
    return-object v0

    .line 926
    :pswitch_2b
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    move-object v2, v9

    .line 931
    move-object v3, v2

    .line 932
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 933
    .line 934
    .line 935
    move-result v4

    .line 936
    if-ge v4, v0, :cond_2d

    .line 937
    .line 938
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    int-to-char v5, v4

    .line 943
    if-eq v5, v7, :cond_2b

    .line 944
    .line 945
    if-eq v5, v6, :cond_2a

    .line 946
    .line 947
    invoke-static {v1, v4}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 948
    .line 949
    .line 950
    goto :goto_e

    .line 951
    :cond_2a
    invoke-static {v1, v4}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v3

    .line 955
    goto :goto_e

    .line 956
    :cond_2b
    invoke-static {v1, v4}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 961
    .line 962
    .line 963
    move-result v4

    .line 964
    if-nez v2, :cond_2c

    .line 965
    .line 966
    move-object v2, v9

    .line 967
    goto :goto_e

    .line 968
    :cond_2c
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 969
    .line 970
    .line 971
    move-result-object v5

    .line 972
    add-int/2addr v4, v2

    .line 973
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 974
    .line 975
    .line 976
    move-object v2, v5

    .line 977
    goto :goto_e

    .line 978
    :cond_2d
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 979
    .line 980
    .line 981
    new-instance v0, Lyf5;

    .line 982
    .line 983
    invoke-direct {v0, v3, v2}, Lyf5;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 984
    .line 985
    .line 986
    return-object v0

    .line 987
    :pswitch_2c
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 988
    .line 989
    .line 990
    move-result v0

    .line 991
    move v11, v8

    .line 992
    move v14, v11

    .line 993
    move v15, v14

    .line 994
    move/from16 v16, v15

    .line 995
    .line 996
    move-object v12, v9

    .line 997
    move-object v13, v12

    .line 998
    move-object/from16 v17, v13

    .line 999
    .line 1000
    move-object/from16 v18, v17

    .line 1001
    .line 1002
    move-object/from16 v20, v18

    .line 1003
    .line 1004
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1005
    .line 1006
    .line 1007
    move-result v2

    .line 1008
    if-ge v2, v0, :cond_2e

    .line 1009
    .line 1010
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1011
    .line 1012
    .line 1013
    move-result v2

    .line 1014
    int-to-char v3, v2

    .line 1015
    packed-switch v3, :pswitch_data_5

    .line 1016
    .line 1017
    .line 1018
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_f

    .line 1022
    :pswitch_2d
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v20

    .line 1026
    goto :goto_f

    .line 1027
    :pswitch_2e
    sget-object v3, Lnj1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1028
    .line 1029
    invoke-static {v1, v2, v3}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v9

    .line 1033
    goto :goto_f

    .line 1034
    :pswitch_2f
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v18

    .line 1038
    goto :goto_f

    .line 1039
    :pswitch_30
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v17

    .line 1043
    goto :goto_f

    .line 1044
    :pswitch_31
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1045
    .line 1046
    .line 1047
    move-result v16

    .line 1048
    goto :goto_f

    .line 1049
    :pswitch_32
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1050
    .line 1051
    .line 1052
    move-result v15

    .line 1053
    goto :goto_f

    .line 1054
    :pswitch_33
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v14

    .line 1058
    goto :goto_f

    .line 1059
    :pswitch_34
    sget-object v3, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1060
    .line 1061
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    move-object v13, v2

    .line 1066
    check-cast v13, Landroid/accounts/Account;

    .line 1067
    .line 1068
    goto :goto_f

    .line 1069
    :pswitch_35
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1070
    .line 1071
    invoke-static {v1, v2, v3}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v12

    .line 1075
    goto :goto_f

    .line 1076
    :pswitch_36
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1077
    .line 1078
    .line 1079
    move-result v11

    .line 1080
    goto :goto_f

    .line 1081
    :cond_2e
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1082
    .line 1083
    .line 1084
    new-instance v10, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 1085
    .line 1086
    invoke-static {v9}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v19

    .line 1090
    invoke-direct/range {v10 .. v20}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    return-object v10

    .line 1094
    :pswitch_37
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    move-wide/from16 v18, v2

    .line 1099
    .line 1100
    move v11, v8

    .line 1101
    move-object v12, v9

    .line 1102
    move-object v13, v12

    .line 1103
    move-object v14, v13

    .line 1104
    move-object v15, v14

    .line 1105
    move-object/from16 v16, v15

    .line 1106
    .line 1107
    move-object/from16 v17, v16

    .line 1108
    .line 1109
    move-object/from16 v20, v17

    .line 1110
    .line 1111
    move-object/from16 v21, v20

    .line 1112
    .line 1113
    move-object/from16 v22, v21

    .line 1114
    .line 1115
    move-object/from16 v23, v22

    .line 1116
    .line 1117
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    if-ge v2, v0, :cond_2f

    .line 1122
    .line 1123
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1124
    .line 1125
    .line 1126
    move-result v2

    .line 1127
    int-to-char v3, v2

    .line 1128
    packed-switch v3, :pswitch_data_6

    .line 1129
    .line 1130
    .line 1131
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1132
    .line 1133
    .line 1134
    goto :goto_10

    .line 1135
    :pswitch_38
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v2

    .line 1139
    move-object/from16 v23, v2

    .line 1140
    .line 1141
    goto :goto_10

    .line 1142
    :pswitch_39
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    move-object/from16 v22, v2

    .line 1147
    .line 1148
    goto :goto_10

    .line 1149
    :pswitch_3a
    sget-object v3, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1150
    .line 1151
    invoke-static {v1, v2, v3}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    move-object/from16 v21, v2

    .line 1156
    .line 1157
    goto :goto_10

    .line 1158
    :pswitch_3b
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v2

    .line 1162
    move-object/from16 v20, v2

    .line 1163
    .line 1164
    goto :goto_10

    .line 1165
    :pswitch_3c
    invoke-static {v1, v2}, Ll93;->X(Landroid/os/Parcel;I)J

    .line 1166
    .line 1167
    .line 1168
    move-result-wide v2

    .line 1169
    move-wide/from16 v18, v2

    .line 1170
    .line 1171
    goto :goto_10

    .line 1172
    :pswitch_3d
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v2

    .line 1176
    move-object/from16 v17, v2

    .line 1177
    .line 1178
    goto :goto_10

    .line 1179
    :pswitch_3e
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1180
    .line 1181
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    check-cast v2, Landroid/net/Uri;

    .line 1186
    .line 1187
    move-object/from16 v16, v2

    .line 1188
    .line 1189
    goto :goto_10

    .line 1190
    :pswitch_3f
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v2

    .line 1194
    move-object v15, v2

    .line 1195
    goto :goto_10

    .line 1196
    :pswitch_40
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v2

    .line 1200
    move-object v14, v2

    .line 1201
    goto :goto_10

    .line 1202
    :pswitch_41
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v2

    .line 1206
    move-object v13, v2

    .line 1207
    goto :goto_10

    .line 1208
    :pswitch_42
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v2

    .line 1212
    move-object v12, v2

    .line 1213
    goto :goto_10

    .line 1214
    :pswitch_43
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1215
    .line 1216
    .line 1217
    move-result v2

    .line 1218
    move v11, v2

    .line 1219
    goto :goto_10

    .line 1220
    :cond_2f
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1221
    .line 1222
    .line 1223
    new-instance v10, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 1224
    .line 1225
    invoke-direct/range {v10 .. v23}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;JLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    return-object v10

    .line 1229
    :pswitch_44
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    move v2, v8

    .line 1234
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1235
    .line 1236
    .line 1237
    move-result v3

    .line 1238
    if-ge v3, v0, :cond_33

    .line 1239
    .line 1240
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1241
    .line 1242
    .line 1243
    move-result v3

    .line 1244
    int-to-char v4, v3

    .line 1245
    if-eq v4, v7, :cond_32

    .line 1246
    .line 1247
    if-eq v4, v6, :cond_31

    .line 1248
    .line 1249
    if-eq v4, v5, :cond_30

    .line 1250
    .line 1251
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1252
    .line 1253
    .line 1254
    goto :goto_11

    .line 1255
    :cond_30
    sget-object v4, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1256
    .line 1257
    invoke-static {v1, v3, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v3

    .line 1261
    move-object v9, v3

    .line 1262
    check-cast v9, Landroid/content/Intent;

    .line 1263
    .line 1264
    goto :goto_11

    .line 1265
    :cond_31
    invoke-static {v1, v3}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1266
    .line 1267
    .line 1268
    move-result v2

    .line 1269
    goto :goto_11

    .line 1270
    :cond_32
    invoke-static {v1, v3}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1271
    .line 1272
    .line 1273
    move-result v8

    .line 1274
    goto :goto_11

    .line 1275
    :cond_33
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1276
    .line 1277
    .line 1278
    new-instance v0, Lbf5;

    .line 1279
    .line 1280
    invoke-direct {v0, v8, v2, v9}, Lbf5;-><init>(IILandroid/content/Intent;)V

    .line 1281
    .line 1282
    .line 1283
    return-object v0

    .line 1284
    :pswitch_45
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1285
    .line 1286
    .line 1287
    move-result v0

    .line 1288
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1289
    .line 1290
    .line 1291
    move-result v2

    .line 1292
    if-ge v2, v0, :cond_36

    .line 1293
    .line 1294
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1295
    .line 1296
    .line 1297
    move-result v2

    .line 1298
    int-to-char v3, v2

    .line 1299
    if-eq v3, v7, :cond_35

    .line 1300
    .line 1301
    if-eq v3, v6, :cond_34

    .line 1302
    .line 1303
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1304
    .line 1305
    .line 1306
    goto :goto_12

    .line 1307
    :cond_34
    sget-object v3, Liw2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1308
    .line 1309
    invoke-static {v1, v2, v3}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v9

    .line 1313
    goto :goto_12

    .line 1314
    :cond_35
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1315
    .line 1316
    .line 1317
    move-result v8

    .line 1318
    goto :goto_12

    .line 1319
    :cond_36
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1320
    .line 1321
    .line 1322
    new-instance v0, Lkr4;

    .line 1323
    .line 1324
    invoke-direct {v0, v9, v8}, Lkr4;-><init>(Ljava/util/List;I)V

    .line 1325
    .line 1326
    .line 1327
    return-object v0

    .line 1328
    :pswitch_46
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1329
    .line 1330
    .line 1331
    move-result v0

    .line 1332
    move v2, v8

    .line 1333
    :goto_13
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1334
    .line 1335
    .line 1336
    move-result v3

    .line 1337
    if-ge v3, v0, :cond_3a

    .line 1338
    .line 1339
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1340
    .line 1341
    .line 1342
    move-result v3

    .line 1343
    int-to-char v4, v3

    .line 1344
    if-eq v4, v7, :cond_39

    .line 1345
    .line 1346
    if-eq v4, v6, :cond_38

    .line 1347
    .line 1348
    if-eq v4, v5, :cond_37

    .line 1349
    .line 1350
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1351
    .line 1352
    .line 1353
    goto :goto_13

    .line 1354
    :cond_37
    invoke-static {v1, v3}, Ll93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v9

    .line 1358
    goto :goto_13

    .line 1359
    :cond_38
    invoke-static {v1, v3}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1360
    .line 1361
    .line 1362
    move-result v2

    .line 1363
    goto :goto_13

    .line 1364
    :cond_39
    invoke-static {v1, v3}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1365
    .line 1366
    .line 1367
    move-result v8

    .line 1368
    goto :goto_13

    .line 1369
    :cond_3a
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1370
    .line 1371
    .line 1372
    new-instance v0, Lnj1;

    .line 1373
    .line 1374
    invoke-direct {v0, v8, v2, v9}, Lnj1;-><init>(IILandroid/os/Bundle;)V

    .line 1375
    .line 1376
    .line 1377
    return-object v0

    .line 1378
    :pswitch_47
    new-instance v0, Lzy4;

    .line 1379
    .line 1380
    invoke-direct {v0, v1}, Lzy4;-><init>(Landroid/os/Parcel;)V

    .line 1381
    .line 1382
    .line 1383
    return-object v0

    .line 1384
    :pswitch_48
    new-instance v0, Lop4;

    .line 1385
    .line 1386
    invoke-direct {v0, v1}, Lop4;-><init>(Landroid/os/Parcel;)V

    .line 1387
    .line 1388
    .line 1389
    return-object v0

    .line 1390
    :pswitch_49
    new-instance v0, Lfm4;

    .line 1391
    .line 1392
    invoke-direct {v0, v1}, Lfm4;-><init>(Landroid/os/Parcel;)V

    .line 1393
    .line 1394
    .line 1395
    return-object v0

    .line 1396
    :pswitch_4a
    new-instance v0, Lqk4;

    .line 1397
    .line 1398
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1399
    .line 1400
    .line 1401
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1402
    .line 1403
    .line 1404
    move-result v2

    .line 1405
    iput v2, v0, Lqk4;->n:I

    .line 1406
    .line 1407
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1408
    .line 1409
    .line 1410
    move-result v2

    .line 1411
    iput v2, v0, Lqk4;->o:I

    .line 1412
    .line 1413
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1414
    .line 1415
    .line 1416
    move-result v2

    .line 1417
    iput v2, v0, Lqk4;->p:I

    .line 1418
    .line 1419
    if-lez v2, :cond_3b

    .line 1420
    .line 1421
    new-array v2, v2, [I

    .line 1422
    .line 1423
    iput-object v2, v0, Lqk4;->q:[I

    .line 1424
    .line 1425
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1426
    .line 1427
    .line 1428
    :cond_3b
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1429
    .line 1430
    .line 1431
    move-result v2

    .line 1432
    iput v2, v0, Lqk4;->r:I

    .line 1433
    .line 1434
    if-lez v2, :cond_3c

    .line 1435
    .line 1436
    new-array v2, v2, [I

    .line 1437
    .line 1438
    iput-object v2, v0, Lqk4;->s:[I

    .line 1439
    .line 1440
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1441
    .line 1442
    .line 1443
    :cond_3c
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    if-ne v2, v7, :cond_3d

    .line 1448
    .line 1449
    move v2, v7

    .line 1450
    goto :goto_14

    .line 1451
    :cond_3d
    move v2, v8

    .line 1452
    :goto_14
    iput-boolean v2, v0, Lqk4;->u:Z

    .line 1453
    .line 1454
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1455
    .line 1456
    .line 1457
    move-result v2

    .line 1458
    if-ne v2, v7, :cond_3e

    .line 1459
    .line 1460
    move v2, v7

    .line 1461
    goto :goto_15

    .line 1462
    :cond_3e
    move v2, v8

    .line 1463
    :goto_15
    iput-boolean v2, v0, Lqk4;->v:Z

    .line 1464
    .line 1465
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1466
    .line 1467
    .line 1468
    move-result v2

    .line 1469
    if-ne v2, v7, :cond_3f

    .line 1470
    .line 1471
    goto :goto_16

    .line 1472
    :cond_3f
    move v7, v8

    .line 1473
    :goto_16
    iput-boolean v7, v0, Lqk4;->w:Z

    .line 1474
    .line 1475
    const-class v2, Lpk4;

    .line 1476
    .line 1477
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v1

    .line 1485
    iput-object v1, v0, Lqk4;->t:Ljava/util/ArrayList;

    .line 1486
    .line 1487
    return-object v0

    .line 1488
    :pswitch_4b
    new-instance v0, Lpk4;

    .line 1489
    .line 1490
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1494
    .line 1495
    .line 1496
    move-result v2

    .line 1497
    iput v2, v0, Lpk4;->n:I

    .line 1498
    .line 1499
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1500
    .line 1501
    .line 1502
    move-result v2

    .line 1503
    iput v2, v0, Lpk4;->o:I

    .line 1504
    .line 1505
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1506
    .line 1507
    .line 1508
    move-result v2

    .line 1509
    if-ne v2, v7, :cond_40

    .line 1510
    .line 1511
    goto :goto_17

    .line 1512
    :cond_40
    move v7, v8

    .line 1513
    :goto_17
    iput-boolean v7, v0, Lpk4;->q:Z

    .line 1514
    .line 1515
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1516
    .line 1517
    .line 1518
    move-result v2

    .line 1519
    if-lez v2, :cond_41

    .line 1520
    .line 1521
    new-array v2, v2, [I

    .line 1522
    .line 1523
    iput-object v2, v0, Lpk4;->p:[I

    .line 1524
    .line 1525
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readIntArray([I)V

    .line 1526
    .line 1527
    .line 1528
    :cond_41
    return-object v0

    .line 1529
    :pswitch_4c
    new-instance v0, Lze4;

    .line 1530
    .line 1531
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1532
    .line 1533
    .line 1534
    const-class v2, Ljava/lang/Long;

    .line 1535
    .line 1536
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v2

    .line 1540
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v1

    .line 1544
    check-cast v1, Ljava/lang/Long;

    .line 1545
    .line 1546
    iput-object v1, v0, Lze4;->n:Ljava/lang/Long;

    .line 1547
    .line 1548
    return-object v0

    .line 1549
    :pswitch_4d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1550
    .line 1551
    .line 1552
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1553
    .line 1554
    .line 1555
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/SimilarArtistID3;

    .line 1556
    .line 1557
    invoke-direct {v0}, Lcom/eddyizm/tempus/subsonic/models/SimilarArtistID3;-><init>()V

    .line 1558
    .line 1559
    .line 1560
    return-object v0

    .line 1561
    :pswitch_4e
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1562
    .line 1563
    .line 1564
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1565
    .line 1566
    .line 1567
    move-result v0

    .line 1568
    if-nez v0, :cond_43

    .line 1569
    .line 1570
    :cond_42
    move-object v11, v9

    .line 1571
    goto :goto_19

    .line 1572
    :cond_43
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1573
    .line 1574
    .line 1575
    move-result v0

    .line 1576
    new-instance v9, Ljava/util/ArrayList;

    .line 1577
    .line 1578
    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1579
    .line 1580
    .line 1581
    :goto_18
    if-eq v8, v0, :cond_42

    .line 1582
    .line 1583
    const-class v2, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 1584
    .line 1585
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1594
    .line 1595
    .line 1596
    add-int/lit8 v8, v8, 0x1

    .line 1597
    .line 1598
    goto :goto_18

    .line 1599
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v12

    .line 1603
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v13

    .line 1607
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v14

    .line 1611
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v15

    .line 1615
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v0

    .line 1619
    move-object/from16 v16, v0

    .line 1620
    .line 1621
    check-cast v16, Ljava/util/Date;

    .line 1622
    .line 1623
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    move-object/from16 v17, v0

    .line 1628
    .line 1629
    check-cast v17, Ljava/util/Date;

    .line 1630
    .line 1631
    invoke-virtual {v1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v0

    .line 1635
    move-object/from16 v18, v0

    .line 1636
    .line 1637
    check-cast v18, Ljava/util/Date;

    .line 1638
    .line 1639
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1640
    .line 1641
    .line 1642
    move-result v19

    .line 1643
    new-instance v10, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 1644
    .line 1645
    invoke-direct/range {v10 .. v19}, Lcom/eddyizm/tempus/subsonic/models/Share;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;I)V

    .line 1646
    .line 1647
    .line 1648
    return-object v10

    .line 1649
    :pswitch_4f
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1650
    .line 1651
    .line 1652
    new-instance v11, Lcom/eddyizm/tempus/model/Server;

    .line 1653
    .line 1654
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v12

    .line 1658
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v13

    .line 1662
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v14

    .line 1666
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1667
    .line 1668
    .line 1669
    move-result-object v15

    .line 1670
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v16

    .line 1674
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v17

    .line 1678
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 1679
    .line 1680
    .line 1681
    move-result-wide v18

    .line 1682
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1683
    .line 1684
    .line 1685
    move-result v0

    .line 1686
    if-eqz v0, :cond_44

    .line 1687
    .line 1688
    move/from16 v20, v7

    .line 1689
    .line 1690
    goto :goto_1a

    .line 1691
    :cond_44
    move/from16 v20, v8

    .line 1692
    .line 1693
    :goto_1a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v21

    .line 1697
    invoke-direct/range {v11 .. v21}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 1698
    .line 1699
    .line 1700
    return-object v11

    .line 1701
    :pswitch_50
    new-instance v0, Lk84;

    .line 1702
    .line 1703
    invoke-direct {v0, v1}, Lk84;-><init>(Landroid/os/Parcel;)V

    .line 1704
    .line 1705
    .line 1706
    return-object v0

    .line 1707
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_37
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_14
        :pswitch_13
        :pswitch_c
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch

    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch

    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
    .end packed-switch

    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lj84;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Ls44;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lr44;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lbs;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Las;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lzr;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lyr;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lth1;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lds;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lcs;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/SignInAccount;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lig5;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lhg5;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Liw2;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Ldg5;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lyf5;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lbf5;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lkr4;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lnj1;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lzy4;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lop4;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lfm4;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lqk4;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lpk4;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lze4;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/SimilarArtistID3;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/eddyizm/tempus/model/Server;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lk84;

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
