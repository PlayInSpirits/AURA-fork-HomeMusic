.class public final Lch5;
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
    iput p1, p0, Lch5;->a:I

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
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Lch5;->a:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ge v2, v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    int-to-char v3, v2

    .line 32
    if-eq v3, v7, :cond_0

    .line 33
    .line 34
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v3, Lh35;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 39
    .line 40
    invoke-static {v1, v2, v3}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lg35;

    .line 49
    .line 50
    invoke-direct {v0, v8}, Lg35;-><init>(Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :pswitch_0
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :try_start_0
    invoke-static {v0}, Lz25;->a(Ljava/lang/String;)Lz25;

    .line 59
    .line 60
    .line 61
    move-result-object v8
    :try_end_0
    .catch Lcom/google/android/gms/fido/fido2/api/common/zzbc; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    goto :goto_1

    .line 63
    :catch_0
    move-exception v0

    .line 64
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    return-object v8

    .line 68
    :pswitch_1
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ge v2, v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    int-to-char v3, v2

    .line 83
    if-eq v3, v7, :cond_2

    .line 84
    .line 85
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 95
    .line 96
    .line 97
    new-instance v0, Ly25;

    .line 98
    .line 99
    invoke-direct {v0, v5}, Ly25;-><init>(Z)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_2
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    move v2, v5

    .line 108
    move-object v9, v8

    .line 109
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-ge v10, v0, :cond_8

    .line 114
    .line 115
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    int-to-char v11, v10

    .line 120
    if-eq v11, v7, :cond_7

    .line 121
    .line 122
    if-eq v11, v6, :cond_6

    .line 123
    .line 124
    if-eq v11, v4, :cond_5

    .line 125
    .line 126
    if-eq v11, v3, :cond_4

    .line 127
    .line 128
    invoke-static {v1, v10}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    invoke-static {v1, v10}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    goto :goto_3

    .line 137
    :cond_5
    sget-object v8, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 138
    .line 139
    invoke-static {v1, v10, v8}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    check-cast v8, Landroid/app/PendingIntent;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    invoke-static {v1, v10}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    goto :goto_3

    .line 151
    :cond_7
    invoke-static {v1, v10}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    goto :goto_3

    .line 156
    :cond_8
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 157
    .line 158
    .line 159
    new-instance v0, Lka0;

    .line 160
    .line 161
    invoke-direct {v0, v5, v2, v8, v9}, Lka0;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_3
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :try_start_1
    invoke-static {v0}, Lhl;->a(Ljava/lang/String;)Lhl;

    .line 170
    .line 171
    .line 172
    move-result-object v8
    :try_end_1
    .catch Lcom/google/android/gms/fido/fido2/api/common/AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException; {:try_start_1 .. :try_end_1} :catch_1

    .line 173
    goto :goto_4

    .line 174
    :catch_1
    move-exception v0

    .line 175
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    :goto_4
    return-object v8

    .line 179
    :pswitch_4
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    move-object v2, v8

    .line 184
    move-object v9, v2

    .line 185
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    if-ge v10, v0, :cond_d

    .line 190
    .line 191
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    int-to-char v11, v10

    .line 196
    if-eq v11, v7, :cond_c

    .line 197
    .line 198
    if-eq v11, v6, :cond_b

    .line 199
    .line 200
    if-eq v11, v4, :cond_a

    .line 201
    .line 202
    if-eq v11, v3, :cond_9

    .line 203
    .line 204
    invoke-static {v1, v10}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_9
    sget-object v9, Lka0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 209
    .line 210
    invoke-static {v1, v10, v9}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    check-cast v9, Lka0;

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_a
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 218
    .line 219
    invoke-static {v1, v10, v2}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, Landroid/app/PendingIntent;

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_b
    invoke-static {v1, v10}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    goto :goto_5

    .line 231
    :cond_c
    invoke-static {v1, v10}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    goto :goto_5

    .line 236
    :cond_d
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 237
    .line 238
    .line 239
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 240
    .line 241
    invoke-direct {v0, v5, v8, v2, v9}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 242
    .line 243
    .line 244
    return-object v0

    .line 245
    :pswitch_5
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    move-object v2, v8

    .line 250
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-ge v3, v0, :cond_10

    .line 255
    .line 256
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    int-to-char v5, v3

    .line 261
    if-eq v5, v6, :cond_f

    .line 262
    .line 263
    if-eq v5, v4, :cond_e

    .line 264
    .line 265
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 266
    .line 267
    .line 268
    goto :goto_6

    .line 269
    :cond_e
    invoke-static {v1, v3}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    goto :goto_6

    .line 274
    :cond_f
    invoke-static {v1, v3}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    goto :goto_6

    .line 279
    :cond_10
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 280
    .line 281
    .line 282
    new-instance v0, Lsu4;

    .line 283
    .line 284
    invoke-direct {v0, v8, v2}, Lsu4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    :try_start_2
    invoke-static {v0}, Lru4;->a(Ljava/lang/String;)Lru4;

    .line 293
    .line 294
    .line 295
    move-result-object v8
    :try_end_2
    .catch Lcom/google/android/gms/fido/fido2/api/common/TokenBinding$UnsupportedTokenBindingStatusException; {:try_start_2 .. :try_end_2} :catch_2

    .line 296
    goto :goto_7

    .line 297
    :catch_2
    move-exception v0

    .line 298
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    :goto_7
    return-object v8

    .line 302
    :pswitch_7
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-ge v2, v0, :cond_12

    .line 311
    .line 312
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    int-to-char v3, v2

    .line 317
    if-eq v3, v7, :cond_11

    .line 318
    .line 319
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_11
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    goto :goto_8

    .line 328
    :cond_12
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 329
    .line 330
    .line 331
    new-instance v0, Lnh5;

    .line 332
    .line 333
    invoke-direct {v0, v8}, Lnh5;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-object v0

    .line 337
    :pswitch_8
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    if-nez v0, :cond_13

    .line 342
    .line 343
    :try_start_3
    const-string v0, ""

    .line 344
    .line 345
    goto :goto_9

    .line 346
    :catch_3
    move-exception v0

    .line 347
    goto :goto_a

    .line 348
    :cond_13
    :goto_9
    invoke-static {v0}, Ll04;->a(Ljava/lang/String;)Ll04;

    .line 349
    .line 350
    .line 351
    move-result-object v8
    :try_end_3
    .catch Lcom/google/android/gms/fido/fido2/api/common/ResidentKeyRequirement$UnsupportedResidentKeyRequirementException; {:try_start_3 .. :try_end_3} :catch_3

    .line 352
    goto :goto_b

    .line 353
    :goto_a
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 354
    .line 355
    .line 356
    :goto_b
    return-object v8

    .line 357
    :pswitch_9
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    move-object v5, v8

    .line 362
    move-object v7, v5

    .line 363
    move-object v9, v7

    .line 364
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 365
    .line 366
    .line 367
    move-result v10

    .line 368
    if-ge v10, v0, :cond_18

    .line 369
    .line 370
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    int-to-char v11, v10

    .line 375
    if-eq v11, v6, :cond_17

    .line 376
    .line 377
    if-eq v11, v4, :cond_16

    .line 378
    .line 379
    if-eq v11, v3, :cond_15

    .line 380
    .line 381
    if-eq v11, v2, :cond_14

    .line 382
    .line 383
    invoke-static {v1, v10}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 384
    .line 385
    .line 386
    goto :goto_c

    .line 387
    :cond_14
    invoke-static {v1, v10}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v9

    .line 391
    goto :goto_c

    .line 392
    :cond_15
    invoke-static {v1, v10}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    goto :goto_c

    .line 397
    :cond_16
    invoke-static {v1, v10}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    goto :goto_c

    .line 402
    :cond_17
    invoke-static {v1, v10}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 403
    .line 404
    .line 405
    move-result-object v8

    .line 406
    goto :goto_c

    .line 407
    :cond_18
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 408
    .line 409
    .line 410
    new-instance v0, Lcs3;

    .line 411
    .line 412
    invoke-direct {v0, v5, v7, v9, v8}, Lcs3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_a
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    :try_start_4
    invoke-static {v0}, Lbs3;->a(Ljava/lang/String;)Lbs3;

    .line 421
    .line 422
    .line 423
    move-result-object v8
    :try_end_4
    .catch Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException; {:try_start_4 .. :try_end_4} :catch_4

    .line 424
    goto :goto_d

    .line 425
    :catch_4
    move-exception v0

    .line 426
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 427
    .line 428
    .line 429
    :goto_d
    return-object v8

    .line 430
    :pswitch_b
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    move-object v2, v8

    .line 435
    move-object v5, v2

    .line 436
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    if-ge v7, v0, :cond_1c

    .line 441
    .line 442
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    int-to-char v9, v7

    .line 447
    if-eq v9, v6, :cond_1b

    .line 448
    .line 449
    if-eq v9, v4, :cond_1a

    .line 450
    .line 451
    if-eq v9, v3, :cond_19

    .line 452
    .line 453
    invoke-static {v1, v7}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 454
    .line 455
    .line 456
    goto :goto_e

    .line 457
    :cond_19
    invoke-static {v1, v7}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v5

    .line 461
    goto :goto_e

    .line 462
    :cond_1a
    invoke-static {v1, v7}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    goto :goto_e

    .line 467
    :cond_1b
    invoke-static {v1, v7}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    goto :goto_e

    .line 472
    :cond_1c
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 473
    .line 474
    .line 475
    new-instance v0, Las3;

    .line 476
    .line 477
    invoke-direct {v0, v8, v2, v5}, Las3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_c
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    move-object v2, v8

    .line 486
    move-object v5, v2

    .line 487
    :goto_f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    if-ge v7, v0, :cond_20

    .line 492
    .line 493
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 494
    .line 495
    .line 496
    move-result v7

    .line 497
    int-to-char v9, v7

    .line 498
    if-eq v9, v6, :cond_1f

    .line 499
    .line 500
    if-eq v9, v4, :cond_1d

    .line 501
    .line 502
    invoke-static {v1, v7}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 503
    .line 504
    .line 505
    goto :goto_f

    .line 506
    :cond_1d
    invoke-static {v1, v7}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    if-nez v5, :cond_1e

    .line 511
    .line 512
    move-object v5, v8

    .line 513
    goto :goto_f

    .line 514
    :cond_1e
    invoke-static {v1, v5, v3}, Ll93;->s0(Landroid/os/Parcel;II)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    goto :goto_f

    .line 526
    :cond_1f
    invoke-static {v1, v7}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    goto :goto_f

    .line 531
    :cond_20
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 532
    .line 533
    .line 534
    new-instance v0, Lzr3;

    .line 535
    .line 536
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    invoke-direct {v0, v1, v2}, Lzr3;-><init>(ILjava/lang/String;)V

    .line 541
    .line 542
    .line 543
    return-object v0

    .line 544
    :pswitch_d
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 545
    .line 546
    .line 547
    move-result v0

    .line 548
    move-object v2, v8

    .line 549
    move-object v5, v2

    .line 550
    :goto_10
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 551
    .line 552
    .line 553
    move-result v7

    .line 554
    if-ge v7, v0, :cond_24

    .line 555
    .line 556
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 557
    .line 558
    .line 559
    move-result v7

    .line 560
    int-to-char v9, v7

    .line 561
    if-eq v9, v6, :cond_23

    .line 562
    .line 563
    if-eq v9, v4, :cond_22

    .line 564
    .line 565
    if-eq v9, v3, :cond_21

    .line 566
    .line 567
    invoke-static {v1, v7}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 568
    .line 569
    .line 570
    goto :goto_10

    .line 571
    :cond_21
    sget-object v5, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 572
    .line 573
    invoke-static {v1, v7, v5}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    goto :goto_10

    .line 578
    :cond_22
    invoke-static {v1, v7}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    goto :goto_10

    .line 583
    :cond_23
    invoke-static {v1, v7}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v8

    .line 587
    goto :goto_10

    .line 588
    :cond_24
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 589
    .line 590
    .line 591
    new-instance v0, Lyr3;

    .line 592
    .line 593
    invoke-direct {v0, v8, v2, v5}, Lyr3;-><init>(Ljava/lang/String;[BLjava/util/ArrayList;)V

    .line 594
    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_e
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    move-object v10, v8

    .line 602
    move-object v11, v10

    .line 603
    move-object v12, v11

    .line 604
    move-object v13, v12

    .line 605
    move-object v14, v13

    .line 606
    move-object v15, v14

    .line 607
    move-object/from16 v16, v15

    .line 608
    .line 609
    move-object/from16 v17, v16

    .line 610
    .line 611
    :goto_11
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-ge v2, v0, :cond_25

    .line 616
    .line 617
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    int-to-char v3, v2

    .line 622
    packed-switch v3, :pswitch_data_1

    .line 623
    .line 624
    .line 625
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 626
    .line 627
    .line 628
    goto :goto_11

    .line 629
    :pswitch_f
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    goto :goto_11

    .line 633
    :pswitch_10
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v17

    .line 637
    goto :goto_11

    .line 638
    :pswitch_11
    sget-object v3, Lhn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 639
    .line 640
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 641
    .line 642
    .line 643
    move-result-object v2

    .line 644
    move-object/from16 v16, v2

    .line 645
    .line 646
    check-cast v16, Lhn;

    .line 647
    .line 648
    goto :goto_11

    .line 649
    :pswitch_12
    sget-object v3, Lln;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 650
    .line 651
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    move-object v15, v2

    .line 656
    check-cast v15, Lln;

    .line 657
    .line 658
    goto :goto_11

    .line 659
    :pswitch_13
    sget-object v3, Ljn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 660
    .line 661
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    move-object v14, v2

    .line 666
    check-cast v14, Ljn;

    .line 667
    .line 668
    goto :goto_11

    .line 669
    :pswitch_14
    sget-object v3, Lkn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 670
    .line 671
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    move-object v13, v2

    .line 676
    check-cast v13, Lkn;

    .line 677
    .line 678
    goto :goto_11

    .line 679
    :pswitch_15
    invoke-static {v1, v2}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 680
    .line 681
    .line 682
    move-result-object v12

    .line 683
    goto :goto_11

    .line 684
    :pswitch_16
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v11

    .line 688
    goto :goto_11

    .line 689
    :pswitch_17
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v10

    .line 693
    goto :goto_11

    .line 694
    :cond_25
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 695
    .line 696
    .line 697
    new-instance v9, Lvr3;

    .line 698
    .line 699
    invoke-direct/range {v9 .. v17}, Lvr3;-><init>(Ljava/lang/String;Ljava/lang/String;[BLkn;Ljn;Lln;Lhn;Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    return-object v9

    .line 703
    :pswitch_18
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 704
    .line 705
    .line 706
    move-result v0

    .line 707
    move-object v10, v8

    .line 708
    move-object v11, v10

    .line 709
    move-object v12, v11

    .line 710
    move-object v13, v12

    .line 711
    move-object v14, v13

    .line 712
    move-object v15, v14

    .line 713
    move-object/from16 v16, v15

    .line 714
    .line 715
    move-object/from16 v17, v16

    .line 716
    .line 717
    move-object/from16 v18, v17

    .line 718
    .line 719
    move-object/from16 v19, v18

    .line 720
    .line 721
    move-object/from16 v20, v19

    .line 722
    .line 723
    move-object/from16 v21, v20

    .line 724
    .line 725
    move-object/from16 v22, v21

    .line 726
    .line 727
    :goto_12
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 728
    .line 729
    .line 730
    move-result v2

    .line 731
    if-ge v2, v0, :cond_28

    .line 732
    .line 733
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    int-to-char v4, v2

    .line 738
    packed-switch v4, :pswitch_data_2

    .line 739
    .line 740
    .line 741
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 742
    .line 743
    .line 744
    goto :goto_12

    .line 745
    :pswitch_19
    sget-object v4, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 746
    .line 747
    invoke-static {v1, v2, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    move-object/from16 v22, v2

    .line 752
    .line 753
    check-cast v22, Landroid/os/ResultReceiver;

    .line 754
    .line 755
    goto :goto_12

    .line 756
    :pswitch_1a
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v21

    .line 760
    goto :goto_12

    .line 761
    :pswitch_1b
    sget-object v4, Lgn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 762
    .line 763
    invoke-static {v1, v2, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    move-object/from16 v20, v2

    .line 768
    .line 769
    check-cast v20, Lgn;

    .line 770
    .line 771
    goto :goto_12

    .line 772
    :pswitch_1c
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v19

    .line 776
    goto :goto_12

    .line 777
    :pswitch_1d
    sget-object v4, Lsu4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 778
    .line 779
    invoke-static {v1, v2, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    move-object/from16 v18, v2

    .line 784
    .line 785
    check-cast v18, Lsu4;

    .line 786
    .line 787
    goto :goto_12

    .line 788
    :pswitch_1e
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    if-nez v2, :cond_26

    .line 793
    .line 794
    move-object/from16 v17, v8

    .line 795
    .line 796
    goto :goto_12

    .line 797
    :cond_26
    invoke-static {v1, v2, v3}, Ll93;->s0(Landroid/os/Parcel;II)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 801
    .line 802
    .line 803
    move-result v2

    .line 804
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    move-object/from16 v17, v2

    .line 809
    .line 810
    goto :goto_12

    .line 811
    :pswitch_1f
    sget-object v4, Lnn;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 812
    .line 813
    invoke-static {v1, v2, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    move-object/from16 v16, v2

    .line 818
    .line 819
    check-cast v16, Lnn;

    .line 820
    .line 821
    goto :goto_12

    .line 822
    :pswitch_20
    sget-object v4, Lyr3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 823
    .line 824
    invoke-static {v1, v2, v4}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 825
    .line 826
    .line 827
    move-result-object v15

    .line 828
    goto :goto_12

    .line 829
    :pswitch_21
    invoke-static {v1, v2}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 830
    .line 831
    .line 832
    move-result v2

    .line 833
    if-nez v2, :cond_27

    .line 834
    .line 835
    move-object v14, v8

    .line 836
    goto :goto_12

    .line 837
    :cond_27
    const/16 v4, 0x8

    .line 838
    .line 839
    invoke-static {v1, v2, v4}, Ll93;->s0(Landroid/os/Parcel;II)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 843
    .line 844
    .line 845
    move-result-wide v4

    .line 846
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 847
    .line 848
    .line 849
    move-result-object v2

    .line 850
    move-object v14, v2

    .line 851
    goto :goto_12

    .line 852
    :pswitch_22
    sget-object v4, Lzr3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 853
    .line 854
    invoke-static {v1, v2, v4}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 855
    .line 856
    .line 857
    move-result-object v13

    .line 858
    goto/16 :goto_12

    .line 859
    .line 860
    :pswitch_23
    invoke-static {v1, v2}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 861
    .line 862
    .line 863
    move-result-object v12

    .line 864
    goto/16 :goto_12

    .line 865
    .line 866
    :pswitch_24
    sget-object v4, Lcs3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 867
    .line 868
    invoke-static {v1, v2, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 869
    .line 870
    .line 871
    move-result-object v2

    .line 872
    move-object v11, v2

    .line 873
    check-cast v11, Lcs3;

    .line 874
    .line 875
    goto/16 :goto_12

    .line 876
    .line 877
    :pswitch_25
    sget-object v4, Las3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 878
    .line 879
    invoke-static {v1, v2, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    move-object v10, v2

    .line 884
    check-cast v10, Las3;

    .line 885
    .line 886
    goto/16 :goto_12

    .line 887
    .line 888
    :cond_28
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 889
    .line 890
    .line 891
    new-instance v9, Lxr3;

    .line 892
    .line 893
    invoke-direct/range {v9 .. v22}, Lxr3;-><init>(Las3;Lcs3;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lnn;Ljava/lang/Integer;Lsu4;Ljava/lang/String;Lgn;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 894
    .line 895
    .line 896
    return-object v9

    .line 897
    :pswitch_26
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 898
    .line 899
    .line 900
    move-result v0

    .line 901
    :goto_13
    move-object v2, v8

    .line 902
    :goto_14
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 903
    .line 904
    .line 905
    move-result v3

    .line 906
    if-ge v3, v0, :cond_2c

    .line 907
    .line 908
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    int-to-char v4, v3

    .line 913
    if-eq v4, v7, :cond_29

    .line 914
    .line 915
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 916
    .line 917
    .line 918
    goto :goto_14

    .line 919
    :cond_29
    invoke-static {v1, v3}, Ll93;->Z(Landroid/os/Parcel;I)I

    .line 920
    .line 921
    .line 922
    move-result v2

    .line 923
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    if-nez v2, :cond_2a

    .line 928
    .line 929
    goto :goto_13

    .line 930
    :cond_2a
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    new-array v6, v4, [[B

    .line 935
    .line 936
    move v9, v5

    .line 937
    :goto_15
    if-ge v9, v4, :cond_2b

    .line 938
    .line 939
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    .line 940
    .line 941
    .line 942
    move-result-object v10

    .line 943
    aput-object v10, v6, v9

    .line 944
    .line 945
    add-int/lit8 v9, v9, 0x1

    .line 946
    .line 947
    goto :goto_15

    .line 948
    :cond_2b
    add-int/2addr v3, v2

    .line 949
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 950
    .line 951
    .line 952
    move-object v2, v6

    .line 953
    goto :goto_14

    .line 954
    :cond_2c
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 955
    .line 956
    .line 957
    new-instance v0, Lmh5;

    .line 958
    .line 959
    invoke-direct {v0, v2}, Lmh5;-><init>([[B)V

    .line 960
    .line 961
    .line 962
    return-object v0

    .line 963
    :pswitch_27
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 964
    .line 965
    .line 966
    move-result v0

    .line 967
    move v9, v5

    .line 968
    move v10, v9

    .line 969
    move v11, v10

    .line 970
    move v12, v11

    .line 971
    move v13, v12

    .line 972
    :goto_16
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 973
    .line 974
    .line 975
    move-result v5

    .line 976
    if-ge v5, v0, :cond_32

    .line 977
    .line 978
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 979
    .line 980
    .line 981
    move-result v5

    .line 982
    int-to-char v8, v5

    .line 983
    if-eq v8, v7, :cond_31

    .line 984
    .line 985
    if-eq v8, v6, :cond_30

    .line 986
    .line 987
    if-eq v8, v4, :cond_2f

    .line 988
    .line 989
    if-eq v8, v3, :cond_2e

    .line 990
    .line 991
    if-eq v8, v2, :cond_2d

    .line 992
    .line 993
    invoke-static {v1, v5}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 994
    .line 995
    .line 996
    goto :goto_16

    .line 997
    :cond_2d
    invoke-static {v1, v5}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 998
    .line 999
    .line 1000
    move-result v13

    .line 1001
    goto :goto_16

    .line 1002
    :cond_2e
    invoke-static {v1, v5}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1003
    .line 1004
    .line 1005
    move-result v12

    .line 1006
    goto :goto_16

    .line 1007
    :cond_2f
    invoke-static {v1, v5}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1008
    .line 1009
    .line 1010
    move-result v11

    .line 1011
    goto :goto_16

    .line 1012
    :cond_30
    invoke-static {v1, v5}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v10

    .line 1016
    goto :goto_16

    .line 1017
    :cond_31
    invoke-static {v1, v5}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1018
    .line 1019
    .line 1020
    move-result v9

    .line 1021
    goto :goto_16

    .line 1022
    :cond_32
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1023
    .line 1024
    .line 1025
    new-instance v8, Le34;

    .line 1026
    .line 1027
    invoke-direct/range {v8 .. v13}, Le34;-><init>(IZZII)V

    .line 1028
    .line 1029
    .line 1030
    return-object v8

    .line 1031
    :pswitch_28
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1032
    .line 1033
    .line 1034
    move-result v0

    .line 1035
    move-object v2, v8

    .line 1036
    move-object v9, v2

    .line 1037
    move-object v10, v9

    .line 1038
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1039
    .line 1040
    .line 1041
    move-result v11

    .line 1042
    if-ge v11, v0, :cond_37

    .line 1043
    .line 1044
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1045
    .line 1046
    .line 1047
    move-result v11

    .line 1048
    int-to-char v12, v11

    .line 1049
    if-eq v12, v7, :cond_36

    .line 1050
    .line 1051
    if-eq v12, v6, :cond_35

    .line 1052
    .line 1053
    if-eq v12, v4, :cond_34

    .line 1054
    .line 1055
    if-eq v12, v3, :cond_33

    .line 1056
    .line 1057
    invoke-static {v1, v11}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1058
    .line 1059
    .line 1060
    goto :goto_17

    .line 1061
    :cond_33
    invoke-static {v1, v11}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1062
    .line 1063
    .line 1064
    move-result v5

    .line 1065
    goto :goto_17

    .line 1066
    :cond_34
    invoke-static {v1, v11}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 1067
    .line 1068
    .line 1069
    move-result-object v10

    .line 1070
    goto :goto_17

    .line 1071
    :cond_35
    invoke-static {v1, v11}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 1072
    .line 1073
    .line 1074
    move-result-object v9

    .line 1075
    goto :goto_17

    .line 1076
    :cond_36
    invoke-static {v1, v11}, Ll93;->v(Landroid/os/Parcel;I)[B

    .line 1077
    .line 1078
    .line 1079
    move-result-object v2

    .line 1080
    goto :goto_17

    .line 1081
    :cond_37
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1082
    .line 1083
    .line 1084
    new-instance v0, Llh5;

    .line 1085
    .line 1086
    if-nez v2, :cond_38

    .line 1087
    .line 1088
    move-object v1, v8

    .line 1089
    goto :goto_18

    .line 1090
    :cond_38
    array-length v1, v2

    .line 1091
    invoke-static {v1, v2}, Lrj5;->i(I[B)Lrj5;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    :goto_18
    if-nez v9, :cond_39

    .line 1096
    .line 1097
    move-object v2, v8

    .line 1098
    goto :goto_19

    .line 1099
    :cond_39
    array-length v2, v9

    .line 1100
    invoke-static {v2, v9}, Lrj5;->i(I[B)Lrj5;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v2

    .line 1104
    :goto_19
    if-nez v10, :cond_3a

    .line 1105
    .line 1106
    goto :goto_1a

    .line 1107
    :cond_3a
    array-length v3, v10

    .line 1108
    invoke-static {v3, v10}, Lrj5;->i(I[B)Lrj5;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v8

    .line 1112
    :goto_1a
    invoke-direct {v0, v1, v2, v8, v5}, Llh5;-><init>(Lrj5;Lrj5;Lrj5;I)V

    .line 1113
    .line 1114
    .line 1115
    return-object v0

    .line 1116
    :pswitch_29
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    :goto_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    if-ge v2, v0, :cond_3c

    .line 1125
    .line 1126
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1127
    .line 1128
    .line 1129
    move-result v2

    .line 1130
    int-to-char v3, v2

    .line 1131
    if-eq v3, v7, :cond_3b

    .line 1132
    .line 1133
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1134
    .line 1135
    .line 1136
    goto :goto_1b

    .line 1137
    :cond_3b
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v8

    .line 1141
    goto :goto_1b

    .line 1142
    :cond_3c
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1143
    .line 1144
    .line 1145
    new-instance v0, Lkh5;

    .line 1146
    .line 1147
    invoke-direct {v0, v8}, Lkh5;-><init>(Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    return-object v0

    .line 1151
    :pswitch_2a
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1152
    .line 1153
    .line 1154
    move-result v0

    .line 1155
    :goto_1c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1156
    .line 1157
    .line 1158
    move-result v2

    .line 1159
    if-ge v2, v0, :cond_3e

    .line 1160
    .line 1161
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1162
    .line 1163
    .line 1164
    move-result v2

    .line 1165
    int-to-char v3, v2

    .line 1166
    if-eq v3, v7, :cond_3d

    .line 1167
    .line 1168
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_1c

    .line 1172
    :cond_3d
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v5

    .line 1176
    goto :goto_1c

    .line 1177
    :cond_3e
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v0, Lpj1;

    .line 1181
    .line 1182
    invoke-direct {v0, v5}, Lpj1;-><init>(Z)V

    .line 1183
    .line 1184
    .line 1185
    return-object v0

    .line 1186
    :pswitch_2b
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1187
    .line 1188
    .line 1189
    move-result v0

    .line 1190
    :goto_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1191
    .line 1192
    .line 1193
    move-result v2

    .line 1194
    if-ge v2, v0, :cond_40

    .line 1195
    .line 1196
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1197
    .line 1198
    .line 1199
    move-result v2

    .line 1200
    int-to-char v3, v2

    .line 1201
    if-eq v3, v7, :cond_3f

    .line 1202
    .line 1203
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1204
    .line 1205
    .line 1206
    goto :goto_1d

    .line 1207
    :cond_3f
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v5

    .line 1211
    goto :goto_1d

    .line 1212
    :cond_40
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1213
    .line 1214
    .line 1215
    new-instance v0, Lhh5;

    .line 1216
    .line 1217
    invoke-direct {v0, v5}, Lhh5;-><init>(Z)V

    .line 1218
    .line 1219
    .line 1220
    return-object v0

    .line 1221
    :pswitch_2c
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1222
    .line 1223
    .line 1224
    move-result v0

    .line 1225
    const-wide/16 v2, 0x0

    .line 1226
    .line 1227
    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1228
    .line 1229
    .line 1230
    move-result v4

    .line 1231
    if-ge v4, v0, :cond_42

    .line 1232
    .line 1233
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1234
    .line 1235
    .line 1236
    move-result v4

    .line 1237
    int-to-char v5, v4

    .line 1238
    if-eq v5, v7, :cond_41

    .line 1239
    .line 1240
    invoke-static {v1, v4}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1241
    .line 1242
    .line 1243
    goto :goto_1e

    .line 1244
    :cond_41
    invoke-static {v1, v4}, Ll93;->X(Landroid/os/Parcel;I)J

    .line 1245
    .line 1246
    .line 1247
    move-result-wide v2

    .line 1248
    goto :goto_1e

    .line 1249
    :cond_42
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1250
    .line 1251
    .line 1252
    new-instance v0, Lgh5;

    .line 1253
    .line 1254
    invoke-direct {v0, v2, v3}, Lgh5;-><init>(J)V

    .line 1255
    .line 1256
    .line 1257
    return-object v0

    .line 1258
    :pswitch_2d
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    :goto_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    if-ge v2, v0, :cond_44

    .line 1267
    .line 1268
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1269
    .line 1270
    .line 1271
    move-result v2

    .line 1272
    int-to-char v3, v2

    .line 1273
    if-eq v3, v7, :cond_43

    .line 1274
    .line 1275
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_1f

    .line 1279
    :cond_43
    invoke-static {v1, v2}, Ll93;->V(Landroid/os/Parcel;I)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v5

    .line 1283
    goto :goto_1f

    .line 1284
    :cond_44
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1285
    .line 1286
    .line 1287
    new-instance v0, Lwk5;

    .line 1288
    .line 1289
    invoke-direct {v0, v5}, Lwk5;-><init>(Z)V

    .line 1290
    .line 1291
    .line 1292
    return-object v0

    .line 1293
    :pswitch_2e
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1294
    .line 1295
    .line 1296
    move-result v0

    .line 1297
    :goto_20
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1298
    .line 1299
    .line 1300
    move-result v2

    .line 1301
    if-ge v2, v0, :cond_47

    .line 1302
    .line 1303
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1304
    .line 1305
    .line 1306
    move-result v2

    .line 1307
    int-to-char v3, v2

    .line 1308
    if-eq v3, v7, :cond_46

    .line 1309
    .line 1310
    if-eq v3, v6, :cond_45

    .line 1311
    .line 1312
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1313
    .line 1314
    .line 1315
    goto :goto_20

    .line 1316
    :cond_45
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v8

    .line 1320
    goto :goto_20

    .line 1321
    :cond_46
    invoke-static {v1, v2}, Ll93;->W(Landroid/os/Parcel;I)I

    .line 1322
    .line 1323
    .line 1324
    move-result v5

    .line 1325
    goto :goto_20

    .line 1326
    :cond_47
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1327
    .line 1328
    .line 1329
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 1330
    .line 1331
    invoke-direct {v0, v5, v8}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    return-object v0

    .line 1335
    :pswitch_2f
    invoke-virtual {v1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    :try_start_5
    invoke-static {v0}, Lgl;->a(Ljava/lang/String;)Lgl;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v8
    :try_end_5
    .catch Lcom/google/android/gms/fido/fido2/api/common/Attachment$UnsupportedAttachmentException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1343
    goto :goto_21

    .line 1344
    :catch_5
    move-exception v0

    .line 1345
    invoke-static {v0}, Ler1;->m(Ljava/lang/Throwable;)V

    .line 1346
    .line 1347
    .line 1348
    :goto_21
    return-object v8

    .line 1349
    :pswitch_30
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1350
    .line 1351
    .line 1352
    move-result v0

    .line 1353
    move-object v2, v8

    .line 1354
    :goto_22
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1355
    .line 1356
    .line 1357
    move-result v3

    .line 1358
    if-ge v3, v0, :cond_4a

    .line 1359
    .line 1360
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1361
    .line 1362
    .line 1363
    move-result v3

    .line 1364
    int-to-char v4, v3

    .line 1365
    if-eq v4, v7, :cond_49

    .line 1366
    .line 1367
    if-eq v4, v6, :cond_48

    .line 1368
    .line 1369
    invoke-static {v1, v3}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1370
    .line 1371
    .line 1372
    goto :goto_22

    .line 1373
    :cond_48
    invoke-static {v1, v3}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    goto :goto_22

    .line 1378
    :cond_49
    invoke-static {v1, v3}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v8

    .line 1382
    goto :goto_22

    .line 1383
    :cond_4a
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1384
    .line 1385
    .line 1386
    new-instance v0, Lvd4;

    .line 1387
    .line 1388
    invoke-direct {v0, v8, v2}, Lvd4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1389
    .line 1390
    .line 1391
    return-object v0

    .line 1392
    :pswitch_31
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1393
    .line 1394
    .line 1395
    move-result v0

    .line 1396
    move-object v10, v8

    .line 1397
    move-object v11, v10

    .line 1398
    move-object v12, v11

    .line 1399
    move-object v13, v12

    .line 1400
    move-object v14, v13

    .line 1401
    move-object v15, v14

    .line 1402
    move-object/from16 v16, v15

    .line 1403
    .line 1404
    move-object/from16 v17, v16

    .line 1405
    .line 1406
    move-object/from16 v18, v17

    .line 1407
    .line 1408
    :goto_23
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    if-ge v2, v0, :cond_4b

    .line 1413
    .line 1414
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1415
    .line 1416
    .line 1417
    move-result v2

    .line 1418
    int-to-char v3, v2

    .line 1419
    packed-switch v3, :pswitch_data_3

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v1, v2}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1423
    .line 1424
    .line 1425
    goto :goto_23

    .line 1426
    :pswitch_32
    sget-object v3, Lvr3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1427
    .line 1428
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v2

    .line 1432
    move-object/from16 v18, v2

    .line 1433
    .line 1434
    check-cast v18, Lvr3;

    .line 1435
    .line 1436
    goto :goto_23

    .line 1437
    :pswitch_33
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v17

    .line 1441
    goto :goto_23

    .line 1442
    :pswitch_34
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v16

    .line 1446
    goto :goto_23

    .line 1447
    :pswitch_35
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v15

    .line 1451
    goto :goto_23

    .line 1452
    :pswitch_36
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1453
    .line 1454
    invoke-static {v1, v2, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    move-object v14, v2

    .line 1459
    check-cast v14, Landroid/net/Uri;

    .line 1460
    .line 1461
    goto :goto_23

    .line 1462
    :pswitch_37
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v13

    .line 1466
    goto :goto_23

    .line 1467
    :pswitch_38
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v12

    .line 1471
    goto :goto_23

    .line 1472
    :pswitch_39
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v11

    .line 1476
    goto :goto_23

    .line 1477
    :pswitch_3a
    invoke-static {v1, v2}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v10

    .line 1481
    goto :goto_23

    .line 1482
    :cond_4b
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1483
    .line 1484
    .line 1485
    new-instance v9, Ltd4;

    .line 1486
    .line 1487
    invoke-direct/range {v9 .. v18}, Ltd4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvr3;)V

    .line 1488
    .line 1489
    .line 1490
    return-object v9

    .line 1491
    :pswitch_3b
    invoke-static {v1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 1492
    .line 1493
    .line 1494
    move-result v0

    .line 1495
    move-object v3, v8

    .line 1496
    :goto_24
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1497
    .line 1498
    .line 1499
    move-result v4

    .line 1500
    if-ge v4, v0, :cond_4e

    .line 1501
    .line 1502
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 1503
    .line 1504
    .line 1505
    move-result v4

    .line 1506
    int-to-char v5, v4

    .line 1507
    if-eq v5, v6, :cond_4d

    .line 1508
    .line 1509
    if-eq v5, v2, :cond_4c

    .line 1510
    .line 1511
    invoke-static {v1, v4}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 1512
    .line 1513
    .line 1514
    goto :goto_24

    .line 1515
    :cond_4c
    sget-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1516
    .line 1517
    invoke-static {v1, v4, v3}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    check-cast v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 1522
    .line 1523
    goto :goto_24

    .line 1524
    :cond_4d
    invoke-static {v1, v4}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v8

    .line 1528
    goto :goto_24

    .line 1529
    :cond_4e
    invoke-static {v1, v0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 1530
    .line 1531
    .line 1532
    new-instance v0, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 1533
    .line 1534
    invoke-direct {v0, v8, v3}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 1535
    .line 1536
    .line 1537
    return-object v0

    .line 1538
    nop

    .line 1539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3b
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_18
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

    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_25
        :pswitch_24
        :pswitch_23
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
    .end packed-switch

    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lch5;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lg35;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lz25;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Ly25;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Lka0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lhl;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Lcom/google/android/gms/common/api/Status;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lsu4;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Lru4;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Lnh5;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Ll04;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lcs3;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Lbs3;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Las3;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lzr3;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lyr3;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lvr3;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lxr3;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lmh5;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Le34;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Llh5;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lkh5;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lpj1;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Lhh5;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lgh5;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lwk5;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lcom/google/android/gms/common/api/Scope;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lgl;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lvd4;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Ltd4;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

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
