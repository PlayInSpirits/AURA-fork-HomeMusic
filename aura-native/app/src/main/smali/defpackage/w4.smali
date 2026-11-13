.class public final Ldefpackage/w4;
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
    iput p1, p0, Ldefpackage/w4;->a:I

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
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ldefpackage/w4;->a:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ldefpackage/nw0;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ldefpackage/nw0;-><init>(Landroid/os/Parcel;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    new-instance v0, Ldefpackage/ow0;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ldefpackage/ow0;-><init>(Landroid/os/Parcel;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    new-instance v0, Ldefpackage/st0;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ldefpackage/st0;-><init>(Landroid/os/Parcel;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    new-instance v0, Ldefpackage/rt0;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ldefpackage/rt0;-><init>(Landroid/os/Parcel;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_3
    new-instance v0, Ldefpackage/tt0;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ldefpackage/tt0;-><init>(Landroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-object v0, v1

    .line 46
    new-instance v1, Lcom/eddyizm/tempus/model/Download;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-direct/range {v1 .. v6}, Lcom/eddyizm/tempus/model/Download;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :pswitch_5
    move-object v0, v1

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance v1, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_0

    .line 83
    .line 84
    const/4 v4, 0x0

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {v1, v4, v0}, Lcom/eddyizm/tempus/subsonic/models/DiscTitle;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :pswitch_6
    move-object v0, v1

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_1

    .line 111
    .line 112
    const/4 v6, 0x0

    .line 113
    goto :goto_2

    .line 114
    :cond_1
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    new-instance v3, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    .line 122
    .line 123
    :goto_1
    if-eq v2, v1, :cond_2

    .line 124
    .line 125
    const-class v5, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 126
    .line 127
    invoke-virtual {v5}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v0, v5}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    move-object v6, v3

    .line 142
    :goto_2
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    move-object v10, v1

    .line 159
    check-cast v10, Ljava/util/Date;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-nez v1, :cond_3

    .line 166
    .line 167
    const/4 v11, 0x0

    .line 168
    goto :goto_3

    .line 169
    :cond_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    move-object v11, v1

    .line 178
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-nez v1, :cond_4

    .line 183
    .line 184
    const/4 v12, 0x0

    .line 185
    goto :goto_4

    .line 186
    :cond_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 187
    .line 188
    .line 189
    move-result-wide v1

    .line 190
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    move-object v12, v1

    .line 195
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_5

    .line 200
    .line 201
    const/4 v13, 0x0

    .line 202
    goto :goto_5

    .line 203
    :cond_5
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 204
    .line 205
    .line 206
    move-result-wide v0

    .line 207
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    move-object v13, v4

    .line 212
    :goto_5
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 213
    .line 214
    invoke-direct/range {v5 .. v13}, Lcom/eddyizm/tempus/subsonic/models/Directory;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;)V

    .line 215
    .line 216
    .line 217
    return-object v5

    .line 218
    :pswitch_7
    move-object v0, v1

    .line 219
    new-instance v1, Ldefpackage/ql0;

    .line 220
    .line 221
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    invoke-direct {v1, v0}, Ldefpackage/ql0;-><init>(I)V

    .line 226
    .line 227
    .line 228
    return-object v1

    .line 229
    :pswitch_8
    move-object v0, v1

    .line 230
    new-instance v1, Ldefpackage/pi0;

    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 233
    .line 234
    .line 235
    move-result-wide v2

    .line 236
    invoke-direct {v1, v2, v3}, Ldefpackage/pi0;-><init>(J)V

    .line 237
    .line 238
    .line 239
    return-object v1

    .line 240
    :pswitch_9
    move-object v0, v1

    .line 241
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    const-string v2, ""

    .line 246
    .line 247
    move-object v6, v2

    .line 248
    move-object v10, v6

    .line 249
    move-object v11, v10

    .line 250
    const/4 v7, 0x0

    .line 251
    const/4 v8, 0x0

    .line 252
    const/4 v9, 0x0

    .line 253
    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-ge v2, v1, :cond_6

    .line 258
    .line 259
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

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
    invoke-static {v0, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 268
    .line 269
    .line 270
    goto :goto_6

    .line 271
    :pswitch_a
    invoke-static {v0, v2}, Ldefpackage/l93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    goto :goto_6

    .line 276
    :pswitch_b
    invoke-static {v0, v2}, Ldefpackage/l93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    goto :goto_6

    .line 281
    :pswitch_c
    invoke-static {v0, v2}, Ldefpackage/l93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    goto :goto_6

    .line 286
    :pswitch_d
    invoke-static {v0, v2}, Ldefpackage/l93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    goto :goto_6

    .line 291
    :pswitch_e
    invoke-static {v0, v2}, Ldefpackage/l93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    goto :goto_6

    .line 296
    :pswitch_f
    invoke-static {v0, v2}, Ldefpackage/l93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    goto :goto_6

    .line 301
    :cond_6
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 302
    .line 303
    .line 304
    new-instance v5, Ldefpackage/wf0;

    .line 305
    .line 306
    invoke-direct/range {v5 .. v11}, Ldefpackage/wf0;-><init>(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-object v5

    .line 310
    :pswitch_10
    move-object v0, v1

    .line 311
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    const/4 v2, 0x0

    .line 316
    const/4 v4, 0x0

    .line 317
    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    if-ge v5, v1, :cond_9

    .line 322
    .line 323
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    int-to-char v6, v5

    .line 328
    if-eq v6, v3, :cond_8

    .line 329
    .line 330
    const/4 v7, 0x2

    .line 331
    if-eq v6, v7, :cond_7

    .line 332
    .line 333
    invoke-static {v0, v5}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 334
    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_7
    invoke-static {v0, v5}, Ldefpackage/l93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    goto :goto_7

    .line 342
    :cond_8
    invoke-static {v0, v5}, Ldefpackage/l93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v4

    .line 346
    goto :goto_7

    .line 347
    :cond_9
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 348
    .line 349
    .line 350
    new-instance v0, Ldefpackage/uf0;

    .line 351
    .line 352
    invoke-direct {v0, v4, v2}, Ldefpackage/uf0;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 353
    .line 354
    .line 355
    return-object v0

    .line 356
    :pswitch_11
    move-object v0, v1

    .line 357
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    const/4 v4, 0x0

    .line 362
    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-ge v2, v1, :cond_b

    .line 367
    .line 368
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    int-to-char v5, v2

    .line 373
    if-eq v5, v3, :cond_a

    .line 374
    .line 375
    invoke-static {v0, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 376
    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_a
    invoke-static {v0, v2}, Ldefpackage/l93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    goto :goto_8

    .line 384
    :cond_b
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 385
    .line 386
    .line 387
    new-instance v0, Ldefpackage/rf0;

    .line 388
    .line 389
    invoke-direct {v0, v4}, Ldefpackage/rf0;-><init>(Landroid/os/Bundle;)V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_12
    move-object v0, v1

    .line 394
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    const/4 v4, 0x0

    .line 399
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-ge v2, v1, :cond_d

    .line 404
    .line 405
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 406
    .line 407
    .line 408
    move-result v2

    .line 409
    int-to-char v5, v2

    .line 410
    if-eq v5, v3, :cond_c

    .line 411
    .line 412
    invoke-static {v0, v2}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 413
    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_c
    invoke-static {v0, v2}, Ldefpackage/l93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    goto :goto_9

    .line 421
    :cond_d
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Ldefpackage/pf0;

    .line 425
    .line 426
    invoke-direct {v0, v4}, Ldefpackage/pf0;-><init>(Landroid/os/Bundle;)V

    .line 427
    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_13
    move-object v0, v1

    .line 431
    invoke-static {v0}, Ldefpackage/l93;->p0(Landroid/os/Parcel;)I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 436
    .line 437
    .line 438
    move-result v4

    .line 439
    if-ge v4, v1, :cond_f

    .line 440
    .line 441
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    int-to-char v5, v4

    .line 446
    if-eq v5, v3, :cond_e

    .line 447
    .line 448
    invoke-static {v0, v4}, Ldefpackage/l93;->m0(Landroid/os/Parcel;I)V

    .line 449
    .line 450
    .line 451
    goto :goto_a

    .line 452
    :cond_e
    invoke-static {v0, v4}, Ldefpackage/l93;->V(Landroid/os/Parcel;I)Z

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    goto :goto_a

    .line 457
    :cond_f
    invoke-static {v0, v1}, Ldefpackage/l93;->H(Landroid/os/Parcel;I)V

    .line 458
    .line 459
    .line 460
    new-instance v0, Ldefpackage/o30;

    .line 461
    .line 462
    invoke-direct {v0, v2}, Ldefpackage/o30;-><init>(Z)V

    .line 463
    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_14
    move-object v0, v1

    .line 467
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    new-instance v1, Lcom/eddyizm/tempus/model/Chronology;

    .line 471
    .line 472
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 477
    .line 478
    .line 479
    move-result-wide v3

    .line 480
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/eddyizm/tempus/model/Chronology;-><init>(Ljava/lang/String;JLjava/lang/String;)V

    .line 485
    .line 486
    .line 487
    return-object v1

    .line 488
    :pswitch_15
    move-object v0, v1

    .line 489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 493
    .line 494
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    if-eqz v1, :cond_10

    .line 507
    .line 508
    move v8, v3

    .line 509
    goto :goto_b

    .line 510
    :cond_10
    move v8, v2

    .line 511
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v9

    .line 515
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v10

    .line 519
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v11

    .line 523
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 524
    .line 525
    .line 526
    move-result v1

    .line 527
    if-nez v1, :cond_11

    .line 528
    .line 529
    const/4 v12, 0x0

    .line 530
    goto :goto_c

    .line 531
    :cond_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    move-object v12, v1

    .line 540
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    if-nez v1, :cond_12

    .line 545
    .line 546
    const/4 v13, 0x0

    .line 547
    goto :goto_d

    .line 548
    :cond_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    move-object v13, v1

    .line 557
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v14

    .line 561
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v15

    .line 565
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    if-nez v1, :cond_13

    .line 570
    .line 571
    const/16 v16, 0x0

    .line 572
    .line 573
    goto :goto_e

    .line 574
    :cond_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 575
    .line 576
    .line 577
    move-result-wide v16

    .line 578
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    move-object/from16 v16, v1

    .line 583
    .line 584
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v17

    .line 588
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v18

    .line 592
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v19

    .line 596
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v20

    .line 600
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-nez v1, :cond_14

    .line 605
    .line 606
    const/16 v21, 0x0

    .line 607
    .line 608
    goto :goto_f

    .line 609
    :cond_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    move-object/from16 v21, v1

    .line 618
    .line 619
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-nez v1, :cond_15

    .line 624
    .line 625
    const/16 v22, 0x0

    .line 626
    .line 627
    goto :goto_10

    .line 628
    :cond_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    move-object/from16 v22, v1

    .line 637
    .line 638
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 639
    .line 640
    .line 641
    move-result v1

    .line 642
    if-nez v1, :cond_16

    .line 643
    .line 644
    const/16 v23, 0x0

    .line 645
    .line 646
    goto :goto_11

    .line 647
    :cond_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    move-object/from16 v23, v1

    .line 656
    .line 657
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    if-nez v1, :cond_17

    .line 662
    .line 663
    const/16 v24, 0x0

    .line 664
    .line 665
    goto :goto_12

    .line 666
    :cond_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    move-object/from16 v24, v1

    .line 675
    .line 676
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v25

    .line 680
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 681
    .line 682
    .line 683
    move-result v1

    .line 684
    if-eqz v1, :cond_18

    .line 685
    .line 686
    move/from16 v26, v3

    .line 687
    .line 688
    goto :goto_13

    .line 689
    :cond_18
    move/from16 v26, v2

    .line 690
    .line 691
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 692
    .line 693
    .line 694
    move-result v1

    .line 695
    if-nez v1, :cond_19

    .line 696
    .line 697
    const/16 v27, 0x0

    .line 698
    .line 699
    goto :goto_14

    .line 700
    :cond_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 705
    .line 706
    .line 707
    move-result-object v1

    .line 708
    move-object/from16 v27, v1

    .line 709
    .line 710
    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 711
    .line 712
    .line 713
    move-result v1

    .line 714
    if-nez v1, :cond_1a

    .line 715
    .line 716
    const/16 v28, 0x0

    .line 717
    .line 718
    goto :goto_15

    .line 719
    :cond_1a
    invoke-virtual {v0}, Landroid/os/Parcel;->readDouble()D

    .line 720
    .line 721
    .line 722
    move-result-wide v1

    .line 723
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 724
    .line 725
    .line 726
    move-result-object v1

    .line 727
    move-object/from16 v28, v1

    .line 728
    .line 729
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 730
    .line 731
    .line 732
    move-result v1

    .line 733
    if-nez v1, :cond_1b

    .line 734
    .line 735
    const/16 v29, 0x0

    .line 736
    .line 737
    goto :goto_16

    .line 738
    :cond_1b
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 739
    .line 740
    .line 741
    move-result-wide v1

    .line 742
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    move-object/from16 v29, v1

    .line 747
    .line 748
    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 749
    .line 750
    .line 751
    move-result v1

    .line 752
    if-nez v1, :cond_1c

    .line 753
    .line 754
    const/16 v30, 0x0

    .line 755
    .line 756
    goto :goto_17

    .line 757
    :cond_1c
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 758
    .line 759
    .line 760
    move-result v1

    .line 761
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    move-object/from16 v30, v1

    .line 766
    .line 767
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    move-object/from16 v31, v1

    .line 772
    .line 773
    check-cast v31, Ljava/util/Date;

    .line 774
    .line 775
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 776
    .line 777
    .line 778
    move-result-object v1

    .line 779
    move-object/from16 v32, v1

    .line 780
    .line 781
    check-cast v32, Ljava/util/Date;

    .line 782
    .line 783
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v33

    .line 787
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v34

    .line 791
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v35

    .line 795
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 796
    .line 797
    .line 798
    move-result v1

    .line 799
    if-nez v1, :cond_1d

    .line 800
    .line 801
    const/16 v36, 0x0

    .line 802
    .line 803
    goto :goto_18

    .line 804
    :cond_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->readLong()J

    .line 805
    .line 806
    .line 807
    move-result-wide v1

    .line 808
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    move-object/from16 v36, v1

    .line 813
    .line 814
    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    if-nez v1, :cond_1e

    .line 819
    .line 820
    const/16 v37, 0x0

    .line 821
    .line 822
    goto :goto_19

    .line 823
    :cond_1e
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    move-object/from16 v37, v1

    .line 832
    .line 833
    :goto_19
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 834
    .line 835
    .line 836
    move-result v1

    .line 837
    if-nez v1, :cond_1f

    .line 838
    .line 839
    const/16 v38, 0x0

    .line 840
    .line 841
    goto :goto_1a

    .line 842
    :cond_1f
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 843
    .line 844
    .line 845
    move-result v1

    .line 846
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    move-object/from16 v38, v1

    .line 851
    .line 852
    :goto_1a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 853
    .line 854
    .line 855
    move-result v1

    .line 856
    if-nez v1, :cond_20

    .line 857
    .line 858
    const/4 v4, 0x0

    .line 859
    goto :goto_1b

    .line 860
    :cond_20
    sget-object v1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 861
    .line 862
    invoke-interface {v1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v4

    .line 866
    :goto_1b
    move-object/from16 v39, v4

    .line 867
    .line 868
    check-cast v39, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 869
    .line 870
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v40

    .line 874
    invoke-direct/range {v5 .. v40}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;)V

    .line 875
    .line 876
    .line 877
    return-object v5

    .line 878
    :pswitch_16
    move-object v0, v1

    .line 879
    const-class v1, Ldefpackage/ix2;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 882
    .line 883
    .line 884
    move-result-object v2

    .line 885
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    move-object v4, v2

    .line 890
    check-cast v4, Ldefpackage/ix2;

    .line 891
    .line 892
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 897
    .line 898
    .line 899
    move-result-object v2

    .line 900
    move-object v5, v2

    .line 901
    check-cast v5, Ldefpackage/ix2;

    .line 902
    .line 903
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    move-object v7, v1

    .line 912
    check-cast v7, Ldefpackage/ix2;

    .line 913
    .line 914
    const-class v1, Ldefpackage/pi0;

    .line 915
    .line 916
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    move-object v6, v1

    .line 925
    check-cast v6, Ldefpackage/pi0;

    .line 926
    .line 927
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 928
    .line 929
    .line 930
    move-result v8

    .line 931
    new-instance v3, Ldefpackage/dy;

    .line 932
    .line 933
    invoke-direct/range {v3 .. v8}, Ldefpackage/dy;-><init>(Ldefpackage/ix2;Ldefpackage/ix2;Ldefpackage/pi0;Ldefpackage/ix2;I)V

    .line 934
    .line 935
    .line 936
    return-object v3

    .line 937
    :pswitch_17
    move-object v0, v1

    .line 938
    new-instance v1, Ldefpackage/tq;

    .line 939
    .line 940
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 944
    .line 945
    .line 946
    move-result v3

    .line 947
    iput v3, v1, Ldefpackage/tq;->n:F

    .line 948
    .line 949
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 950
    .line 951
    .line 952
    move-result v3

    .line 953
    iput v3, v1, Ldefpackage/tq;->o:F

    .line 954
    .line 955
    new-instance v3, Ljava/util/ArrayList;

    .line 956
    .line 957
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 958
    .line 959
    .line 960
    iput-object v3, v1, Ldefpackage/tq;->p:Ljava/util/ArrayList;

    .line 961
    .line 962
    const-class v4, Ljava/lang/Float;

    .line 963
    .line 964
    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 965
    .line 966
    .line 967
    move-result-object v4

    .line 968
    invoke-virtual {v0, v3, v4}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v0}, Landroid/os/Parcel;->readFloat()F

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    iput v3, v1, Ldefpackage/tq;->q:F

    .line 976
    .line 977
    invoke-virtual {v0}, Landroid/os/Parcel;->createBooleanArray()[Z

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    aget-boolean v0, v0, v2

    .line 982
    .line 983
    iput-boolean v0, v1, Ldefpackage/tq;->r:Z

    .line 984
    .line 985
    return-object v1

    .line 986
    :pswitch_18
    move-object v0, v1

    .line 987
    new-instance v1, Ldefpackage/zo;

    .line 988
    .line 989
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 990
    .line 991
    .line 992
    const/16 v2, 0xff

    .line 993
    .line 994
    iput v2, v1, Ldefpackage/zo;->v:I

    .line 995
    .line 996
    const/4 v2, -0x2

    .line 997
    iput v2, v1, Ldefpackage/zo;->x:I

    .line 998
    .line 999
    iput v2, v1, Ldefpackage/zo;->y:I

    .line 1000
    .line 1001
    iput v2, v1, Ldefpackage/zo;->z:I

    .line 1002
    .line 1003
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1004
    .line 1005
    iput-object v2, v1, Ldefpackage/zo;->G:Ljava/lang/Boolean;

    .line 1006
    .line 1007
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1008
    .line 1009
    .line 1010
    move-result v2

    .line 1011
    iput v2, v1, Ldefpackage/zo;->n:I

    .line 1012
    .line 1013
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    check-cast v2, Ljava/lang/Integer;

    .line 1018
    .line 1019
    iput-object v2, v1, Ldefpackage/zo;->o:Ljava/lang/Integer;

    .line 1020
    .line 1021
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    check-cast v2, Ljava/lang/Integer;

    .line 1026
    .line 1027
    iput-object v2, v1, Ldefpackage/zo;->p:Ljava/lang/Integer;

    .line 1028
    .line 1029
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    check-cast v2, Ljava/lang/Integer;

    .line 1034
    .line 1035
    iput-object v2, v1, Ldefpackage/zo;->q:Ljava/lang/Integer;

    .line 1036
    .line 1037
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v2

    .line 1041
    check-cast v2, Ljava/lang/Integer;

    .line 1042
    .line 1043
    iput-object v2, v1, Ldefpackage/zo;->r:Ljava/lang/Integer;

    .line 1044
    .line 1045
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    check-cast v2, Ljava/lang/Integer;

    .line 1050
    .line 1051
    iput-object v2, v1, Ldefpackage/zo;->s:Ljava/lang/Integer;

    .line 1052
    .line 1053
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v2

    .line 1057
    check-cast v2, Ljava/lang/Integer;

    .line 1058
    .line 1059
    iput-object v2, v1, Ldefpackage/zo;->t:Ljava/lang/Integer;

    .line 1060
    .line 1061
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    check-cast v2, Ljava/lang/Integer;

    .line 1066
    .line 1067
    iput-object v2, v1, Ldefpackage/zo;->u:Ljava/lang/Integer;

    .line 1068
    .line 1069
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1070
    .line 1071
    .line 1072
    move-result v2

    .line 1073
    iput v2, v1, Ldefpackage/zo;->v:I

    .line 1074
    .line 1075
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v2

    .line 1079
    iput-object v2, v1, Ldefpackage/zo;->w:Ljava/lang/String;

    .line 1080
    .line 1081
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    iput v2, v1, Ldefpackage/zo;->x:I

    .line 1086
    .line 1087
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1088
    .line 1089
    .line 1090
    move-result v2

    .line 1091
    iput v2, v1, Ldefpackage/zo;->y:I

    .line 1092
    .line 1093
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1094
    .line 1095
    .line 1096
    move-result v2

    .line 1097
    iput v2, v1, Ldefpackage/zo;->z:I

    .line 1098
    .line 1099
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    iput-object v2, v1, Ldefpackage/zo;->B:Ljava/lang/CharSequence;

    .line 1104
    .line 1105
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    iput-object v2, v1, Ldefpackage/zo;->C:Ljava/lang/CharSequence;

    .line 1110
    .line 1111
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1112
    .line 1113
    .line 1114
    move-result v2

    .line 1115
    iput v2, v1, Ldefpackage/zo;->D:I

    .line 1116
    .line 1117
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    check-cast v2, Ljava/lang/Integer;

    .line 1122
    .line 1123
    iput-object v2, v1, Ldefpackage/zo;->F:Ljava/lang/Integer;

    .line 1124
    .line 1125
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    check-cast v2, Ljava/lang/Integer;

    .line 1130
    .line 1131
    iput-object v2, v1, Ldefpackage/zo;->H:Ljava/lang/Integer;

    .line 1132
    .line 1133
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v2

    .line 1137
    check-cast v2, Ljava/lang/Integer;

    .line 1138
    .line 1139
    iput-object v2, v1, Ldefpackage/zo;->I:Ljava/lang/Integer;

    .line 1140
    .line 1141
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    check-cast v2, Ljava/lang/Integer;

    .line 1146
    .line 1147
    iput-object v2, v1, Ldefpackage/zo;->J:Ljava/lang/Integer;

    .line 1148
    .line 1149
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v2

    .line 1153
    check-cast v2, Ljava/lang/Integer;

    .line 1154
    .line 1155
    iput-object v2, v1, Ldefpackage/zo;->K:Ljava/lang/Integer;

    .line 1156
    .line 1157
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    check-cast v2, Ljava/lang/Integer;

    .line 1162
    .line 1163
    iput-object v2, v1, Ldefpackage/zo;->L:Ljava/lang/Integer;

    .line 1164
    .line 1165
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v2

    .line 1169
    check-cast v2, Ljava/lang/Integer;

    .line 1170
    .line 1171
    iput-object v2, v1, Ldefpackage/zo;->M:Ljava/lang/Integer;

    .line 1172
    .line 1173
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v2

    .line 1177
    check-cast v2, Ljava/lang/Integer;

    .line 1178
    .line 1179
    iput-object v2, v1, Ldefpackage/zo;->P:Ljava/lang/Integer;

    .line 1180
    .line 1181
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    check-cast v2, Ljava/lang/Integer;

    .line 1186
    .line 1187
    iput-object v2, v1, Ldefpackage/zo;->N:Ljava/lang/Integer;

    .line 1188
    .line 1189
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v2

    .line 1193
    check-cast v2, Ljava/lang/Integer;

    .line 1194
    .line 1195
    iput-object v2, v1, Ldefpackage/zo;->O:Ljava/lang/Integer;

    .line 1196
    .line 1197
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v2

    .line 1201
    check-cast v2, Ljava/lang/Boolean;

    .line 1202
    .line 1203
    iput-object v2, v1, Ldefpackage/zo;->G:Ljava/lang/Boolean;

    .line 1204
    .line 1205
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v2

    .line 1209
    check-cast v2, Ljava/util/Locale;

    .line 1210
    .line 1211
    iput-object v2, v1, Ldefpackage/zo;->A:Ljava/util/Locale;

    .line 1212
    .line 1213
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v0

    .line 1217
    check-cast v0, Ljava/lang/Boolean;

    .line 1218
    .line 1219
    iput-object v0, v1, Ldefpackage/zo;->Q:Ljava/lang/Boolean;

    .line 1220
    .line 1221
    return-object v1

    .line 1222
    :pswitch_19
    move-object v0, v1

    .line 1223
    new-instance v1, Ldefpackage/ro;

    .line 1224
    .line 1225
    invoke-direct {v1, v0}, Ldefpackage/ro;-><init>(Landroid/os/Parcel;)V

    .line 1226
    .line 1227
    .line 1228
    return-object v1

    .line 1229
    :pswitch_1a
    move-object v0, v1

    .line 1230
    new-instance v1, Ldefpackage/qo;

    .line 1231
    .line 1232
    invoke-direct {v1, v0}, Ldefpackage/qo;-><init>(Landroid/os/Parcel;)V

    .line 1233
    .line 1234
    .line 1235
    return-object v1

    .line 1236
    :pswitch_1b
    move-object v0, v1

    .line 1237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1241
    .line 1242
    .line 1243
    move-result v1

    .line 1244
    const-class v3, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 1245
    .line 1246
    if-nez v1, :cond_21

    .line 1247
    .line 1248
    const/4 v5, 0x0

    .line 1249
    goto :goto_1d

    .line 1250
    :cond_21
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1251
    .line 1252
    .line 1253
    move-result v1

    .line 1254
    new-instance v5, Ljava/util/ArrayList;

    .line 1255
    .line 1256
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1257
    .line 1258
    .line 1259
    move v6, v2

    .line 1260
    :goto_1c
    if-eq v6, v1, :cond_22

    .line 1261
    .line 1262
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v7

    .line 1266
    invoke-virtual {v0, v7}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v7

    .line 1270
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    add-int/lit8 v6, v6, 0x1

    .line 1274
    .line 1275
    goto :goto_1c

    .line 1276
    :cond_22
    :goto_1d
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1277
    .line 1278
    .line 1279
    move-result v1

    .line 1280
    if-nez v1, :cond_23

    .line 1281
    .line 1282
    const/4 v4, 0x0

    .line 1283
    goto :goto_1f

    .line 1284
    :cond_23
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1285
    .line 1286
    .line 1287
    move-result v1

    .line 1288
    new-instance v4, Ljava/util/ArrayList;

    .line 1289
    .line 1290
    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1291
    .line 1292
    .line 1293
    :goto_1e
    if-eq v2, v1, :cond_24

    .line 1294
    .line 1295
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v6

    .line 1299
    invoke-virtual {v0, v6}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v6

    .line 1303
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1304
    .line 1305
    .line 1306
    add-int/lit8 v2, v2, 0x1

    .line 1307
    .line 1308
    goto :goto_1e

    .line 1309
    :cond_24
    :goto_1f
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 1310
    .line 1311
    invoke-direct {v0, v5, v4}, Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 1312
    .line 1313
    .line 1314
    return-object v0

    .line 1315
    :pswitch_1c
    move-object v0, v1

    .line 1316
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1317
    .line 1318
    .line 1319
    new-instance v6, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 1320
    .line 1321
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v7

    .line 1325
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v8

    .line 1329
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v9

    .line 1333
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1334
    .line 1335
    .line 1336
    move-result v10

    .line 1337
    invoke-virtual {v0}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    move-object v11, v0

    .line 1342
    check-cast v11, Ljava/util/Date;

    .line 1343
    .line 1344
    invoke-direct/range {v6 .. v11}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;)V

    .line 1345
    .line 1346
    .line 1347
    return-object v6

    .line 1348
    :pswitch_1d
    move-object v0, v1

    .line 1349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1350
    .line 1351
    .line 1352
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 1353
    .line 1354
    move-object/from16 v5, p1

    .line 1355
    .line 1356
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v1

    .line 1360
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v2

    .line 1364
    invoke-virtual {v5}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v3

    .line 1368
    check-cast v3, Ljava/util/Date;

    .line 1369
    .line 1370
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1371
    .line 1372
    .line 1373
    move-result v6

    .line 1374
    if-nez v6, :cond_25

    .line 1375
    .line 1376
    const/4 v6, 0x0

    .line 1377
    goto :goto_20

    .line 1378
    :cond_25
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1379
    .line 1380
    .line 1381
    move-result v6

    .line 1382
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v6

    .line 1386
    :goto_20
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1387
    .line 1388
    .line 1389
    move-result v7

    .line 1390
    if-nez v7, :cond_26

    .line 1391
    .line 1392
    const/4 v5, 0x0

    .line 1393
    :goto_21
    move-object v4, v6

    .line 1394
    goto :goto_22

    .line 1395
    :cond_26
    invoke-virtual {v5}, Landroid/os/Parcel;->readDouble()D

    .line 1396
    .line 1397
    .line 1398
    move-result-wide v4

    .line 1399
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v4

    .line 1403
    move-object v5, v4

    .line 1404
    goto :goto_21

    .line 1405
    :goto_22
    invoke-direct/range {v0 .. v5}, Lcom/eddyizm/tempus/subsonic/models/Artist;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/Double;)V

    .line 1406
    .line 1407
    .line 1408
    return-object v0

    .line 1409
    :pswitch_1e
    move-object v5, v1

    .line 1410
    new-instance v0, Ldefpackage/zg;

    .line 1411
    .line 1412
    invoke-direct {v0, v5}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1413
    .line 1414
    .line 1415
    invoke-virtual {v5}, Landroid/os/Parcel;->readByte()B

    .line 1416
    .line 1417
    .line 1418
    move-result v1

    .line 1419
    if-eqz v1, :cond_27

    .line 1420
    .line 1421
    move v2, v3

    .line 1422
    :cond_27
    iput-boolean v2, v0, Ldefpackage/zg;->n:Z

    .line 1423
    .line 1424
    return-object v0

    .line 1425
    :pswitch_1f
    move-object v5, v1

    .line 1426
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1430
    .line 1431
    .line 1432
    move-result v0

    .line 1433
    if-nez v0, :cond_28

    .line 1434
    .line 1435
    const/4 v4, 0x0

    .line 1436
    goto :goto_24

    .line 1437
    :cond_28
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1438
    .line 1439
    .line 1440
    move-result v0

    .line 1441
    new-instance v4, Ljava/util/ArrayList;

    .line 1442
    .line 1443
    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1444
    .line 1445
    .line 1446
    :goto_23
    if-eq v2, v0, :cond_29

    .line 1447
    .line 1448
    const-class v1, Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 1449
    .line 1450
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v1

    .line 1454
    invoke-virtual {v5, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v1

    .line 1458
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1459
    .line 1460
    .line 1461
    add-int/lit8 v2, v2, 0x1

    .line 1462
    .line 1463
    goto :goto_23

    .line 1464
    :cond_29
    :goto_24
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 1465
    .line 1466
    invoke-direct {v0, v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;-><init>(Ljava/util/List;)V

    .line 1467
    .line 1468
    .line 1469
    return-object v0

    .line 1470
    :pswitch_20
    move-object v5, v1

    .line 1471
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1472
    .line 1473
    .line 1474
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v6

    .line 1478
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v7

    .line 1482
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v8

    .line 1486
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v9

    .line 1490
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v10

    .line 1494
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1495
    .line 1496
    .line 1497
    move-result v0

    .line 1498
    if-nez v0, :cond_2a

    .line 1499
    .line 1500
    const/4 v11, 0x0

    .line 1501
    goto :goto_25

    .line 1502
    :cond_2a
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1503
    .line 1504
    .line 1505
    move-result v0

    .line 1506
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v0

    .line 1510
    move-object v11, v0

    .line 1511
    :goto_25
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1512
    .line 1513
    .line 1514
    move-result v0

    .line 1515
    if-nez v0, :cond_2b

    .line 1516
    .line 1517
    const/4 v12, 0x0

    .line 1518
    goto :goto_26

    .line 1519
    :cond_2b
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1520
    .line 1521
    .line 1522
    move-result v0

    .line 1523
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v0

    .line 1527
    move-object v12, v0

    .line 1528
    :goto_26
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1529
    .line 1530
    .line 1531
    move-result v0

    .line 1532
    if-nez v0, :cond_2c

    .line 1533
    .line 1534
    const/4 v13, 0x0

    .line 1535
    goto :goto_27

    .line 1536
    :cond_2c
    invoke-virtual {v5}, Landroid/os/Parcel;->readLong()J

    .line 1537
    .line 1538
    .line 1539
    move-result-wide v0

    .line 1540
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    move-object v13, v0

    .line 1545
    :goto_27
    invoke-virtual {v5}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v0

    .line 1549
    move-object v14, v0

    .line 1550
    check-cast v14, Ljava/util/Date;

    .line 1551
    .line 1552
    invoke-virtual {v5}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    move-object v15, v0

    .line 1557
    check-cast v15, Ljava/util/Date;

    .line 1558
    .line 1559
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1560
    .line 1561
    .line 1562
    move-result v16

    .line 1563
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v17

    .line 1567
    invoke-virtual {v5}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    move-object/from16 v18, v0

    .line 1572
    .line 1573
    check-cast v18, Ljava/util/Date;

    .line 1574
    .line 1575
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1576
    .line 1577
    .line 1578
    move-result v0

    .line 1579
    if-nez v0, :cond_2d

    .line 1580
    .line 1581
    const/16 v19, 0x0

    .line 1582
    .line 1583
    goto :goto_28

    .line 1584
    :cond_2d
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1585
    .line 1586
    .line 1587
    move-result v0

    .line 1588
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    move-object/from16 v19, v0

    .line 1593
    .line 1594
    :goto_28
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1595
    .line 1596
    .line 1597
    move-result v0

    .line 1598
    const-class v1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1599
    .line 1600
    if-nez v0, :cond_2f

    .line 1601
    .line 1602
    const/4 v2, 0x0

    .line 1603
    :cond_2e
    const/4 v0, 0x0

    .line 1604
    goto :goto_2a

    .line 1605
    :cond_2f
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1606
    .line 1607
    .line 1608
    move-result v0

    .line 1609
    new-instance v2, Ljava/util/ArrayList;

    .line 1610
    .line 1611
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1612
    .line 1613
    .line 1614
    const/4 v3, 0x0

    .line 1615
    :goto_29
    if-eq v3, v0, :cond_2e

    .line 1616
    .line 1617
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v4

    .line 1621
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v4

    .line 1625
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1626
    .line 1627
    .line 1628
    add-int/lit8 v3, v3, 0x1

    .line 1629
    .line 1630
    goto :goto_29

    .line 1631
    :goto_2a
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v21

    .line 1635
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1636
    .line 1637
    .line 1638
    move-result v3

    .line 1639
    if-nez v3, :cond_30

    .line 1640
    .line 1641
    move-object v4, v0

    .line 1642
    goto :goto_2c

    .line 1643
    :cond_30
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1644
    .line 1645
    .line 1646
    move-result v3

    .line 1647
    new-instance v4, Ljava/util/ArrayList;

    .line 1648
    .line 1649
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1650
    .line 1651
    .line 1652
    const/4 v0, 0x0

    .line 1653
    :goto_2b
    if-eq v0, v3, :cond_31

    .line 1654
    .line 1655
    move/from16 v23, v0

    .line 1656
    .line 1657
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v0

    .line 1661
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1666
    .line 1667
    .line 1668
    add-int/lit8 v0, v23, 0x1

    .line 1669
    .line 1670
    goto :goto_2b

    .line 1671
    :cond_31
    :goto_2c
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1672
    .line 1673
    .line 1674
    move-result v0

    .line 1675
    if-nez v0, :cond_32

    .line 1676
    .line 1677
    move-object/from16 v23, v1

    .line 1678
    .line 1679
    const/4 v3, 0x0

    .line 1680
    goto :goto_2e

    .line 1681
    :cond_32
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1682
    .line 1683
    .line 1684
    move-result v0

    .line 1685
    new-instance v3, Ljava/util/ArrayList;

    .line 1686
    .line 1687
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1688
    .line 1689
    .line 1690
    move-object/from16 v23, v1

    .line 1691
    .line 1692
    const/4 v1, 0x0

    .line 1693
    :goto_2d
    if-eq v1, v0, :cond_33

    .line 1694
    .line 1695
    move/from16 v24, v0

    .line 1696
    .line 1697
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v0

    .line 1701
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    add-int/lit8 v1, v1, 0x1

    .line 1709
    .line 1710
    move/from16 v0, v24

    .line 1711
    .line 1712
    goto :goto_2d

    .line 1713
    :cond_33
    :goto_2e
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v24

    .line 1717
    invoke-virtual {v5}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v25

    .line 1721
    invoke-virtual {v5}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v26

    .line 1725
    invoke-virtual {v5}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1726
    .line 1727
    .line 1728
    move-result-object v27

    .line 1729
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v0

    .line 1733
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v0

    .line 1737
    move-object/from16 v28, v0

    .line 1738
    .line 1739
    check-cast v28, Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 1740
    .line 1741
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v0

    .line 1745
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v0

    .line 1749
    move-object/from16 v29, v0

    .line 1750
    .line 1751
    check-cast v29, Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 1752
    .line 1753
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1754
    .line 1755
    .line 1756
    move-result v0

    .line 1757
    if-nez v0, :cond_34

    .line 1758
    .line 1759
    const/16 v30, 0x0

    .line 1760
    .line 1761
    goto :goto_30

    .line 1762
    :cond_34
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1763
    .line 1764
    .line 1765
    move-result v0

    .line 1766
    if-eqz v0, :cond_35

    .line 1767
    .line 1768
    const/16 v20, 0x1

    .line 1769
    .line 1770
    goto :goto_2f

    .line 1771
    :cond_35
    const/16 v20, 0x0

    .line 1772
    .line 1773
    :goto_2f
    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v0

    .line 1777
    move-object/from16 v30, v0

    .line 1778
    .line 1779
    :goto_30
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1780
    .line 1781
    .line 1782
    move-result v0

    .line 1783
    if-nez v0, :cond_36

    .line 1784
    .line 1785
    move-object/from16 v20, v2

    .line 1786
    .line 1787
    const/16 v31, 0x0

    .line 1788
    .line 1789
    goto :goto_32

    .line 1790
    :cond_36
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1791
    .line 1792
    .line 1793
    move-result v0

    .line 1794
    new-instance v1, Ljava/util/ArrayList;

    .line 1795
    .line 1796
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1797
    .line 1798
    .line 1799
    move-object/from16 v20, v2

    .line 1800
    .line 1801
    const/4 v2, 0x0

    .line 1802
    :goto_31
    if-eq v2, v0, :cond_37

    .line 1803
    .line 1804
    move/from16 p0, v0

    .line 1805
    .line 1806
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v0

    .line 1810
    invoke-virtual {v5, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v0

    .line 1814
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1815
    .line 1816
    .line 1817
    add-int/lit8 v2, v2, 0x1

    .line 1818
    .line 1819
    move/from16 v0, p0

    .line 1820
    .line 1821
    goto :goto_31

    .line 1822
    :cond_37
    move-object/from16 v31, v1

    .line 1823
    .line 1824
    :goto_32
    new-instance v5, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1825
    .line 1826
    move-object/from16 v23, v3

    .line 1827
    .line 1828
    move-object/from16 v22, v4

    .line 1829
    .line 1830
    invoke-direct/range {v5 .. v31}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;)V

    .line 1831
    .line 1832
    .line 1833
    return-object v5

    .line 1834
    :pswitch_21
    move-object v5, v1

    .line 1835
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1836
    .line 1837
    .line 1838
    new-instance v0, Ldefpackage/o5;

    .line 1839
    .line 1840
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1841
    .line 1842
    .line 1843
    move-result v1

    .line 1844
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1845
    .line 1846
    .line 1847
    move-result v2

    .line 1848
    if-nez v2, :cond_38

    .line 1849
    .line 1850
    const/4 v4, 0x0

    .line 1851
    goto :goto_33

    .line 1852
    :cond_38
    sget-object v2, Landroid/content/Intent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1853
    .line 1854
    invoke-interface {v2, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 1855
    .line 1856
    .line 1857
    move-result-object v2

    .line 1858
    move-object v4, v2

    .line 1859
    check-cast v4, Landroid/content/Intent;

    .line 1860
    .line 1861
    :goto_33
    invoke-direct {v0, v4, v1}, Ldefpackage/o5;-><init>(Landroid/content/Intent;I)V

    .line 1862
    .line 1863
    .line 1864
    return-object v0

    .line 1865
    :pswitch_22
    move-object v5, v1

    .line 1866
    new-instance v0, Ldefpackage/x4;

    .line 1867
    .line 1868
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    .line 1872
    .line 1873
    .line 1874
    move-result v1

    .line 1875
    iput v1, v0, Ldefpackage/x4;->n:I

    .line 1876
    .line 1877
    return-object v0

    .line 1878
    nop

    .line 1879
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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

    .line 1880
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/w4;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Ldefpackage/nw0;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Ldefpackage/ow0;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Ldefpackage/st0;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Ldefpackage/rt0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Ldefpackage/tt0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/eddyizm/tempus/model/Download;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/DiscTitle;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Ldefpackage/ql0;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Ldefpackage/pi0;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Ldefpackage/wf0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Ldefpackage/uf0;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Ldefpackage/rf0;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Ldefpackage/pf0;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Ldefpackage/o30;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lcom/eddyizm/tempus/model/Chronology;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Ldefpackage/dy;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Ldefpackage/tq;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Ldefpackage/zo;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Ldefpackage/ro;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Ldefpackage/qo;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Ldefpackage/zg;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Ldefpackage/o5;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Ldefpackage/x4;

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
