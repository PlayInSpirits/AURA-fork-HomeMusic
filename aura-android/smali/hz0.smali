.class public final Lhz0;
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
    iput p1, p0, Lhz0;->a:I

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
    .locals 10

    .line 1
    iget p0, p0, Lhz0;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p0, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, v0, p1}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    new-instance p0, Lez2;

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lez2;-><init>(Landroid/os/Parcel;)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p0, p1}, Lix2;->b(II)Lix2;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :pswitch_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance p1, Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Landroid/support/v4/media/session/MediaSessionCompat$Token;-><init>(Landroid/os/Parcelable;)V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Landroid/media/session/MediaSession$Token;

    .line 60
    .line 61
    new-instance p1, Lpr2;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p0, v2}, Lpr2;-><init>(Landroid/media/session/MediaSession$Token;Lqu1;)V

    .line 67
    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_4
    new-instance p0, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 71
    .line 72
    invoke-direct {p0, p1}, Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;-><init>(Landroid/os/Parcel;)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_5
    new-instance p0, Lor2;

    .line 77
    .line 78
    invoke-direct {p0, p1}, Lor2;-><init>(Landroid/os/Parcel;)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_6
    new-instance p0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 83
    .line 84
    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_7
    new-instance p0, Leo2;

    .line 89
    .line 90
    invoke-direct {p0, p1}, Leo2;-><init>(Landroid/os/Parcel;)V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_8
    sget-object p0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 95
    .line 96
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, Landroid/support/v4/media/MediaDescriptionCompat;->a(Ljava/lang/Object;)Landroid/support/v4/media/MediaDescriptionCompat;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_9
    sget-object p0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 106
    .line 107
    invoke-interface {p0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    check-cast p0, Landroid/media/MediaDescription;

    .line 112
    .line 113
    invoke-static {p0}, Lpm2;->a(Landroid/media/MediaDescription;)Lpm2;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :pswitch_a
    new-instance p0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 119
    .line 120
    invoke-direct {p0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 121
    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_b
    new-instance p0, Lij2;

    .line 125
    .line 126
    invoke-direct {p0, p1}, Lij2;-><init>(Landroid/os/Parcel;)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_c
    new-instance p0, Lrh2;

    .line 131
    .line 132
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 133
    .line 134
    .line 135
    const-class v0, Lrh2;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    iput p1, p0, Lrh2;->n:I

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_d
    new-instance p0, Lcc2;

    .line 155
    .line 156
    invoke-direct {p0, p1}, Lcc2;-><init>(Landroid/os/Parcel;)V

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_e
    new-instance p0, Lbb2;

    .line 161
    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    iput v2, p0, Lbb2;->n:I

    .line 170
    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    iput v2, p0, Lbb2;->o:I

    .line 176
    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-ne p1, v1, :cond_0

    .line 182
    .line 183
    move v0, v1

    .line 184
    :cond_0
    iput-boolean v0, p0, Lbb2;->p:Z

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-instance p0, Lcom/eddyizm/tempus/subsonic/models/ItemGenre;

    .line 191
    .line 192
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-direct {p0, p1}, Lcom/eddyizm/tempus/subsonic/models/ItemGenre;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance p0, Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 204
    .line 205
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-nez v0, :cond_1

    .line 210
    .line 211
    move-object v0, v2

    .line 212
    goto :goto_0

    .line 213
    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-nez v1, :cond_2

    .line 226
    .line 227
    move-object v1, v2

    .line 228
    goto :goto_1

    .line 229
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_3

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    :goto_2
    invoke-direct {p0, v0, v1, v2}, Lcom/eddyizm/tempus/subsonic/models/ItemDate;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 253
    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    new-instance v3, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-direct/range {v3 .. v9}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-object v3

    .line 289
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    new-instance p0, Lp02;

    .line 293
    .line 294
    const-class v0, Landroid/content/IntentSender;

    .line 295
    .line 296
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    check-cast v0, Landroid/content/IntentSender;

    .line 308
    .line 309
    const-class v1, Landroid/content/Intent;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    check-cast v1, Landroid/content/Intent;

    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    invoke-direct {p0, v0, v1, v2, p1}, Lp02;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 330
    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_13
    invoke-static {p1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-ge v0, p0, :cond_5

    .line 342
    .line 343
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    int-to-char v3, v0

    .line 348
    if-eq v3, v1, :cond_4

    .line 349
    .line 350
    invoke-static {p1, v0}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 351
    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_4
    invoke-static {p1, v0}, Ll93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    goto :goto_3

    .line 359
    :cond_5
    invoke-static {p1, p0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 360
    .line 361
    .line 362
    new-instance p0, Lrh1;

    .line 363
    .line 364
    invoke-direct {p0, v2}, Lrh1;-><init>(Landroid/os/Bundle;)V

    .line 365
    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_14
    invoke-static {p1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 369
    .line 370
    .line 371
    move-result p0

    .line 372
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-ge v0, p0, :cond_7

    .line 377
    .line 378
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    int-to-char v3, v0

    .line 383
    if-eq v3, v1, :cond_6

    .line 384
    .line 385
    invoke-static {p1, v0}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 386
    .line 387
    .line 388
    goto :goto_4

    .line 389
    :cond_6
    invoke-static {p1, v0}, Ll93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 390
    .line 391
    .line 392
    move-result-object v2

    .line 393
    goto :goto_4

    .line 394
    :cond_7
    invoke-static {p1, p0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 395
    .line 396
    .line 397
    new-instance p0, Lqh1;

    .line 398
    .line 399
    invoke-direct {p0, v2}, Lqh1;-><init>(Landroid/os/Bundle;)V

    .line 400
    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_15
    invoke-static {p1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 404
    .line 405
    .line 406
    move-result p0

    .line 407
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-ge v0, p0, :cond_9

    .line 412
    .line 413
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    int-to-char v3, v0

    .line 418
    if-eq v3, v1, :cond_8

    .line 419
    .line 420
    invoke-static {p1, v0}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 421
    .line 422
    .line 423
    goto :goto_5

    .line 424
    :cond_8
    sget-object v2, Luf0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 425
    .line 426
    invoke-static {p1, v0, v2}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    move-object v2, v0

    .line 431
    check-cast v2, Luf0;

    .line 432
    .line 433
    goto :goto_5

    .line 434
    :cond_9
    invoke-static {p1, p0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 435
    .line 436
    .line 437
    new-instance p0, Llh1;

    .line 438
    .line 439
    invoke-direct {p0, v2}, Llh1;-><init>(Luf0;)V

    .line 440
    .line 441
    .line 442
    return-object p0

    .line 443
    :pswitch_16
    invoke-static {p1}, Ll93;->p0(Landroid/os/Parcel;)I

    .line 444
    .line 445
    .line 446
    move-result p0

    .line 447
    move-object v0, v2

    .line 448
    move-object v3, v0

    .line 449
    move-object v4, v3

    .line 450
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-ge v5, p0, :cond_e

    .line 455
    .line 456
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 457
    .line 458
    .line 459
    move-result v5

    .line 460
    int-to-char v6, v5

    .line 461
    if-eq v6, v1, :cond_d

    .line 462
    .line 463
    const/4 v7, 0x2

    .line 464
    if-eq v6, v7, :cond_c

    .line 465
    .line 466
    const/4 v7, 0x3

    .line 467
    if-eq v6, v7, :cond_b

    .line 468
    .line 469
    const/4 v7, 0x4

    .line 470
    if-eq v6, v7, :cond_a

    .line 471
    .line 472
    invoke-static {p1, v5}, Ll93;->m0(Landroid/os/Parcel;I)V

    .line 473
    .line 474
    .line 475
    goto :goto_6

    .line 476
    :cond_a
    sget-object v4, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 477
    .line 478
    invoke-static {p1, v5, v4}, Ll93;->w(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    check-cast v4, Landroid/os/ResultReceiver;

    .line 483
    .line 484
    goto :goto_6

    .line 485
    :cond_b
    invoke-static {p1, v5}, Ll93;->x(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    goto :goto_6

    .line 490
    :cond_c
    invoke-static {p1, v5}, Ll93;->u(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    goto :goto_6

    .line 495
    :cond_d
    sget-object v2, Lwf0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 496
    .line 497
    invoke-static {p1, v5, v2}, Ll93;->z(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    goto :goto_6

    .line 502
    :cond_e
    invoke-static {p1, p0}, Ll93;->H(Landroid/os/Parcel;I)V

    .line 503
    .line 504
    .line 505
    new-instance p0, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 506
    .line 507
    invoke-direct {p0, v2, v0, v3, v4}, Lcom/google/android/gms/identitycredentials/GetCredentialRequest;-><init>(Ljava/util/ArrayList;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V

    .line 508
    .line 509
    .line 510
    return-object p0

    .line 511
    :pswitch_17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    new-instance p0, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 515
    .line 516
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 525
    .line 526
    .line 527
    move-result p1

    .line 528
    invoke-direct {p0, v0, v1, p1}, Lcom/eddyizm/tempus/subsonic/models/Genre;-><init>(Ljava/lang/String;II)V

    .line 529
    .line 530
    .line 531
    return-object p0

    .line 532
    :pswitch_18
    new-instance p0, Lbe1;

    .line 533
    .line 534
    invoke-direct {p0, p1}, Lbe1;-><init>(Landroid/os/Parcel;)V

    .line 535
    .line 536
    .line 537
    return-object p0

    .line 538
    :pswitch_19
    new-instance p0, Lnd1;

    .line 539
    .line 540
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 541
    .line 542
    .line 543
    iput-object v2, p0, Lnd1;->r:Ljava/lang/String;

    .line 544
    .line 545
    new-instance v0, Ljava/util/ArrayList;

    .line 546
    .line 547
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 548
    .line 549
    .line 550
    iput-object v0, p0, Lnd1;->s:Ljava/util/ArrayList;

    .line 551
    .line 552
    new-instance v0, Ljava/util/ArrayList;

    .line 553
    .line 554
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 555
    .line 556
    .line 557
    iput-object v0, p0, Lnd1;->t:Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    iput-object v0, p0, Lnd1;->n:Ljava/util/ArrayList;

    .line 564
    .line 565
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    iput-object v0, p0, Lnd1;->o:Ljava/util/ArrayList;

    .line 570
    .line 571
    sget-object v0, Lqo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 572
    .line 573
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    check-cast v0, [Lqo;

    .line 578
    .line 579
    iput-object v0, p0, Lnd1;->p:[Lqo;

    .line 580
    .line 581
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    iput v0, p0, Lnd1;->q:I

    .line 586
    .line 587
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    iput-object v0, p0, Lnd1;->r:Ljava/lang/String;

    .line 592
    .line 593
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    iput-object v0, p0, Lnd1;->s:Ljava/util/ArrayList;

    .line 598
    .line 599
    sget-object v0, Lro;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 600
    .line 601
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    iput-object v0, p0, Lnd1;->t:Ljava/util/ArrayList;

    .line 606
    .line 607
    sget-object v0, Lgd1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 608
    .line 609
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 610
    .line 611
    .line 612
    move-result-object p1

    .line 613
    iput-object p1, p0, Lnd1;->u:Ljava/util/ArrayList;

    .line 614
    .line 615
    return-object p0

    .line 616
    :pswitch_1a
    new-instance p0, Lgd1;

    .line 617
    .line 618
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 619
    .line 620
    .line 621
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    iput-object v0, p0, Lgd1;->n:Ljava/lang/String;

    .line 626
    .line 627
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 628
    .line 629
    .line 630
    move-result p1

    .line 631
    iput p1, p0, Lgd1;->o:I

    .line 632
    .line 633
    return-object p0

    .line 634
    :pswitch_1b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    move p0, v0

    .line 638
    new-instance v0, Lcom/eddyizm/tempus/model/Favorite;

    .line 639
    .line 640
    move v3, v1

    .line 641
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    .line 642
    .line 643
    .line 644
    move-result-wide v1

    .line 645
    move v4, v3

    .line 646
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v3

    .line 650
    move v5, v4

    .line 651
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v4

    .line 655
    move v6, v5

    .line 656
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v5

    .line 660
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 661
    .line 662
    .line 663
    move-result p1

    .line 664
    if-eqz p1, :cond_f

    .line 665
    .line 666
    goto :goto_7

    .line 667
    :cond_f
    move v6, p0

    .line 668
    :goto_7
    invoke-direct/range {v0 .. v6}, Lcom/eddyizm/tempus/model/Favorite;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 669
    .line 670
    .line 671
    return-object v0

    .line 672
    :pswitch_1c
    new-instance p0, Liz0;

    .line 673
    .line 674
    invoke-direct {p0, p1}, Liz0;-><init>(Landroid/os/Parcel;)V

    .line 675
    .line 676
    .line 677
    return-object p0

    .line 678
    nop

    .line 679
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
    iget p0, p0, Lhz0;->a:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    new-array p0, p1, [Lez2;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    new-array p0, p1, [Lix2;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    new-array p0, p1, [Lpr2;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    new-array p0, p1, [Landroid/support/v4/media/session/MediaSessionCompat$QueueItem;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    new-array p0, p1, [Lor2;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_6
    new-array p0, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_7
    new-array p0, p1, [Leo2;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_8
    new-array p0, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_9
    new-array p0, p1, [Lpm2;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_a
    new-array p0, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_b
    new-array p0, p1, [Lij2;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_c
    new-array p0, p1, [Lrh2;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_d
    new-array p0, p1, [Lcc2;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_e
    new-array p0, p1, [Lbb2;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_f
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/ItemGenre;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_10
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_11
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_12
    new-array p0, p1, [Lp02;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_13
    new-array p0, p1, [Lrh1;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_14
    new-array p0, p1, [Lqh1;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_15
    new-array p0, p1, [Llh1;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_16
    new-array p0, p1, [Lcom/google/android/gms/identitycredentials/GetCredentialRequest;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_17
    new-array p0, p1, [Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_18
    new-array p0, p1, [Lbe1;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_19
    new-array p0, p1, [Lnd1;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1a
    new-array p0, p1, [Lgd1;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1b
    new-array p0, p1, [Lcom/eddyizm/tempus/model/Favorite;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1c
    new-array p0, p1, [Liz0;

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
