.class final Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;
.super Ldefpackage/ve4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ldefpackage/ve4;"
    }
.end annotation


# static fields
.field public static final w:[B


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:[B

.field public final q:I

.field public r:I

.field public s:J

.field public t:Z

.field public volatile u:I

.field public volatile v:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->w:[B

    .line 8
    .line 9
    return-void

    .line 10
    nop

    .line 11
    :array_0
    .array-data 1
        0x66t
        0x4ct
        0x61t
        0x43t
    .end array-data
.end method

.method public constructor <init>(ILdefpackage/tb1;Z)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    new-array v3, v2, [Ldefpackage/cj0;

    .line 8
    .line 9
    new-array v4, v2, [Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 10
    .line 11
    invoke-direct {v0, v3, v4}, Ldefpackage/ve4;-><init>([Ldefpackage/cj0;[Ldefpackage/dj0;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_11

    .line 19
    .line 20
    iget-object v3, v1, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iput-object v4, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, v1, Ldefpackage/tb1;->q:Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    const/4 v6, 0x3

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x1

    .line 43
    const/4 v9, 0x4

    .line 44
    const/4 v10, 0x2

    .line 45
    const/4 v11, -0x1

    .line 46
    sparse-switch v5, :sswitch_data_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :sswitch_0
    const-string v5, "audio/opus"

    .line 51
    .line 52
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v11, v9

    .line 60
    goto :goto_0

    .line 61
    :sswitch_1
    const-string v5, "audio/flac"

    .line 62
    .line 63
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-nez v3, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move v11, v6

    .line 71
    goto :goto_0

    .line 72
    :sswitch_2
    const-string v5, "audio/alac"

    .line 73
    .line 74
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-nez v3, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    move v11, v10

    .line 82
    goto :goto_0

    .line 83
    :sswitch_3
    const-string v5, "audio/mp4a-latm"

    .line 84
    .line 85
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-nez v3, :cond_3

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move v11, v8

    .line 93
    goto :goto_0

    .line 94
    :sswitch_4
    const-string v5, "audio/vorbis"

    .line 95
    .line 96
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    move v11, v7

    .line 104
    :goto_0
    const/4 v3, 0x0

    .line 105
    packed-switch v11, :pswitch_data_0

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_1
    move-object v2, v3

    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :pswitch_0
    move v5, v7

    .line 112
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-ge v5, v6, :cond_5

    .line 117
    .line 118
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, [B

    .line 123
    .line 124
    array-length v11, v6

    .line 125
    if-ge v11, v9, :cond_6

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    move v11, v7

    .line 129
    :goto_3
    if-ge v11, v9, :cond_8

    .line 130
    .line 131
    aget-byte v12, v6, v11

    .line 132
    .line 133
    sget-object v13, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->w:[B

    .line 134
    .line 135
    aget-byte v13, v13, v11

    .line 136
    .line 137
    if-eq v12, v13, :cond_7

    .line 138
    .line 139
    :goto_4
    move v11, v7

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    move v11, v9

    .line 145
    :goto_5
    array-length v12, v6

    .line 146
    sub-int/2addr v12, v11

    .line 147
    const/16 v13, 0x22

    .line 148
    .line 149
    if-ne v12, v13, :cond_9

    .line 150
    .line 151
    new-array v12, v13, [B

    .line 152
    .line 153
    invoke-static {v6, v11, v12, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_9
    array-length v12, v6

    .line 158
    add-int/lit8 v14, v11, 0x4

    .line 159
    .line 160
    if-lt v12, v14, :cond_a

    .line 161
    .line 162
    aget-byte v12, v6, v11

    .line 163
    .line 164
    and-int/lit8 v12, v12, 0x7f

    .line 165
    .line 166
    add-int/lit8 v15, v11, 0x1

    .line 167
    .line 168
    aget-byte v15, v6, v15

    .line 169
    .line 170
    and-int/lit16 v15, v15, 0xff

    .line 171
    .line 172
    shl-int/2addr v15, v2

    .line 173
    add-int/lit8 v16, v11, 0x2

    .line 174
    .line 175
    aget-byte v2, v6, v16

    .line 176
    .line 177
    and-int/lit16 v2, v2, 0xff

    .line 178
    .line 179
    shl-int/lit8 v2, v2, 0x8

    .line 180
    .line 181
    or-int/2addr v2, v15

    .line 182
    add-int/lit8 v15, v11, 0x3

    .line 183
    .line 184
    aget-byte v15, v6, v15

    .line 185
    .line 186
    and-int/lit16 v15, v15, 0xff

    .line 187
    .line 188
    or-int/2addr v2, v15

    .line 189
    if-nez v12, :cond_a

    .line 190
    .line 191
    if-ne v2, v13, :cond_a

    .line 192
    .line 193
    array-length v2, v6

    .line 194
    add-int/lit8 v11, v11, 0x26

    .line 195
    .line 196
    if-lt v2, v11, :cond_a

    .line 197
    .line 198
    new-array v12, v13, [B

    .line 199
    .line 200
    invoke-static {v6, v14, v12, v7, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 201
    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_a
    move-object v12, v3

    .line 205
    :goto_6
    if-eqz v12, :cond_b

    .line 206
    .line 207
    move-object v2, v12

    .line 208
    goto :goto_7

    .line 209
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 210
    .line 211
    const/16 v2, 0x10

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :pswitch_1
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, [B

    .line 219
    .line 220
    array-length v3, v2

    .line 221
    add-int/lit8 v3, v3, 0xc

    .line 222
    .line 223
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 228
    .line 229
    .line 230
    const v3, 0x616c6163

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 237
    .line 238
    .line 239
    array-length v3, v2

    .line 240
    invoke-virtual {v4, v2, v7, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :pswitch_2
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    move-object v3, v2

    .line 254
    check-cast v3, [B

    .line 255
    .line 256
    goto/16 :goto_1

    .line 257
    .line 258
    :pswitch_3
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, [B

    .line 263
    .line 264
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    check-cast v3, [B

    .line 269
    .line 270
    array-length v4, v2

    .line 271
    array-length v5, v3

    .line 272
    add-int/2addr v4, v5

    .line 273
    add-int/lit8 v4, v4, 0x6

    .line 274
    .line 275
    new-array v4, v4, [B

    .line 276
    .line 277
    array-length v5, v2

    .line 278
    shr-int/lit8 v5, v5, 0x8

    .line 279
    .line 280
    int-to-byte v5, v5

    .line 281
    aput-byte v5, v4, v7

    .line 282
    .line 283
    array-length v5, v2

    .line 284
    and-int/lit16 v5, v5, 0xff

    .line 285
    .line 286
    int-to-byte v5, v5

    .line 287
    aput-byte v5, v4, v8

    .line 288
    .line 289
    array-length v5, v2

    .line 290
    invoke-static {v2, v7, v4, v10, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 291
    .line 292
    .line 293
    array-length v5, v2

    .line 294
    add-int/2addr v5, v10

    .line 295
    aput-byte v7, v4, v5

    .line 296
    .line 297
    array-length v5, v2

    .line 298
    add-int/2addr v5, v6

    .line 299
    aput-byte v7, v4, v5

    .line 300
    .line 301
    array-length v5, v2

    .line 302
    add-int/2addr v5, v9

    .line 303
    array-length v6, v3

    .line 304
    shr-int/lit8 v6, v6, 0x8

    .line 305
    .line 306
    int-to-byte v6, v6

    .line 307
    aput-byte v6, v4, v5

    .line 308
    .line 309
    array-length v5, v2

    .line 310
    add-int/lit8 v5, v5, 0x5

    .line 311
    .line 312
    array-length v6, v3

    .line 313
    and-int/lit16 v6, v6, 0xff

    .line 314
    .line 315
    int-to-byte v6, v6

    .line 316
    aput-byte v6, v4, v5

    .line 317
    .line 318
    array-length v2, v2

    .line 319
    add-int/lit8 v2, v2, 0x6

    .line 320
    .line 321
    array-length v5, v3

    .line 322
    invoke-static {v3, v7, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 323
    .line 324
    .line 325
    move-object v2, v4

    .line 326
    :goto_7
    iput-object v2, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->p:[B

    .line 327
    .line 328
    if-eqz p3, :cond_c

    .line 329
    .line 330
    goto :goto_8

    .line 331
    :cond_c
    move v9, v10

    .line 332
    :goto_8
    iput v9, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->q:I

    .line 333
    .line 334
    if-eqz p3, :cond_d

    .line 335
    .line 336
    const v3, 0x1fffe

    .line 337
    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_d
    const v3, 0xffff

    .line 341
    .line 342
    .line 343
    :goto_9
    iput v3, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->r:I

    .line 344
    .line 345
    iget-object v3, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o:Ljava/lang/String;

    .line 346
    .line 347
    iget v4, v1, Ldefpackage/tb1;->G:I

    .line 348
    .line 349
    iget v5, v1, Ldefpackage/tb1;->F:I

    .line 350
    .line 351
    move-object v1, v3

    .line 352
    move/from16 v3, p3

    .line 353
    .line 354
    invoke-direct/range {v0 .. v5}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegInitialize(Ljava/lang/String;[BZII)J

    .line 355
    .line 356
    .line 357
    move-result-wide v1

    .line 358
    iput-wide v1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 359
    .line 360
    const-wide/16 v3, 0x0

    .line 361
    .line 362
    cmp-long v1, v1, v3

    .line 363
    .line 364
    if-eqz v1, :cond_10

    .line 365
    .line 366
    iget v1, v0, Ldefpackage/ve4;->g:I

    .line 367
    .line 368
    iget-object v0, v0, Ldefpackage/ve4;->e:[Ldefpackage/cj0;

    .line 369
    .line 370
    array-length v2, v0

    .line 371
    if-ne v1, v2, :cond_e

    .line 372
    .line 373
    goto :goto_a

    .line 374
    :cond_e
    move v8, v7

    .line 375
    :goto_a
    invoke-static {v8}, Ldefpackage/rr2;->w(Z)V

    .line 376
    .line 377
    .line 378
    array-length v1, v0

    .line 379
    :goto_b
    if-ge v7, v1, :cond_f

    .line 380
    .line 381
    aget-object v2, v0, v7

    .line 382
    .line 383
    move/from16 v3, p1

    .line 384
    .line 385
    invoke-virtual {v2, v3}, Ldefpackage/cj0;->t(I)V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v7, v7, 0x1

    .line 389
    .line 390
    goto :goto_b

    .line 391
    :cond_f
    return-void

    .line 392
    :cond_10
    new-instance v0, Landroidx/media3/decoder/ffmpeg/FfmpegDecoderException;

    .line 393
    .line 394
    const-string v1, "Initialization failed."

    .line 395
    .line 396
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    throw v0

    .line 400
    :cond_11
    new-instance v0, Landroidx/media3/decoder/ffmpeg/FfmpegDecoderException;

    .line 401
    .line 402
    const-string v1, "Failed to load decoder native libraries."

    .line 403
    .line 404
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v0

    .line 408
    nop

    .line 409
    :sswitch_data_0
    .sparse-switch
        -0x3bd43e14 -> :sswitch_4
        -0x3313c2e -> :sswitch_3
        0x59ac6426 -> :sswitch_2
        0x59aeaa01 -> :sswitch_1
        0x59b2d2d8 -> :sswitch_0
    .end sparse-switch

    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method private native ffmpegDecode(JLjava/nio/ByteBuffer;ILandroidx/media3/decoder/SimpleDecoderOutputBuffer;Ljava/nio/ByteBuffer;I)I
.end method

.method private native ffmpegGetChannelCount(J)I
.end method

.method private native ffmpegGetSampleRate(J)I
.end method

.method private native ffmpegInitialize(Ljava/lang/String;[BZII)J
.end method

.method private native ffmpegRelease(J)V
.end method

.method private native ffmpegReset(J[B)J
.end method

.method private growOutputBuffer(Landroidx/media3/decoder/SimpleDecoderOutputBuffer;I)Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iput p2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->r:I

    .line 2
    .line 3
    iget-object p0, p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/nio/Buffer;->limit()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-lt p2, v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 47
    .line 48
    .line 49
    iput-object v0, p1, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 50
    .line 51
    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    invoke-super {p0}, Ldefpackage/ve4;->a()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 5
    .line 6
    invoke-direct {p0, v0, v1}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegRelease(J)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    iput-wide v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 12
    .line 13
    return-void
.end method

.method public final g()Ldefpackage/cj0;
    .locals 2

    .line 1
    new-instance p0, Ldefpackage/cj0;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->b()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-direct {p0, v0, v1}, Ldefpackage/cj0;-><init>(II)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final h()Ldefpackage/dj0;
    .locals 2

    .line 1
    new-instance v0, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 2
    .line 3
    new-instance v1, Landroidx/media3/decoder/ffmpeg/a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/media3/decoder/ffmpeg/a;-><init>(Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;-><init>(Landroidx/media3/decoder/ffmpeg/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final i(Ljava/lang/Throwable;)Landroidx/media3/decoder/DecoderException;
    .locals 1

    .line 1
    new-instance p0, Landroidx/media3/decoder/ffmpeg/FfmpegDecoderException;

    .line 2
    .line 3
    const-string v0, "Unexpected decode error"

    .line 4
    .line 5
    invoke-direct {p0, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final j(Ldefpackage/cj0;Ldefpackage/dj0;Z)Landroidx/media3/decoder/DecoderException;
    .locals 8

    .line 1
    move-object v5, p2

    .line 2
    check-cast v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    iget-wide p2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->p:[B

    .line 9
    .line 10
    invoke-direct {p0, p2, p3, v0}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegReset(J[B)J

    .line 11
    .line 12
    .line 13
    move-result-wide p2

    .line 14
    iput-wide p2, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long p2, p2, v0

    .line 19
    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    new-instance p0, Landroidx/media3/decoder/ffmpeg/FfmpegDecoderException;

    .line 23
    .line 24
    const-string p1, "Error resetting (see logcat)."

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    iget-object v3, p1, Ldefpackage/cj0;->r:Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    sget-object p2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/nio/Buffer;->limit()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget-wide p1, p1, Ldefpackage/cj0;->t:J

    .line 39
    .line 40
    iget p3, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->r:I

    .line 41
    .line 42
    iput-wide p1, v5, Ldefpackage/dj0;->p:J

    .line 43
    .line 44
    iget-object p1, v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-ge p1, p3, :cond_2

    .line 53
    .line 54
    :cond_1
    invoke-static {p3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    :cond_2
    iget-object p1, v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 69
    .line 70
    const/4 p2, 0x0

    .line 71
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 72
    .line 73
    .line 74
    iget-object p1, v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 77
    .line 78
    .line 79
    iget-object v6, v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 80
    .line 81
    iget-wide v1, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 82
    .line 83
    iget v7, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->r:I

    .line 84
    .line 85
    move-object v0, p0

    .line 86
    invoke-direct/range {v0 .. v7}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegDecode(JLjava/nio/ByteBuffer;ILandroidx/media3/decoder/SimpleDecoderOutputBuffer;Ljava/nio/ByteBuffer;I)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    const/4 p1, -0x2

    .line 91
    if-ne p0, p1, :cond_3

    .line 92
    .line 93
    new-instance p0, Landroidx/media3/decoder/ffmpeg/FfmpegDecoderException;

    .line 94
    .line 95
    const-string p1, "Error decoding (see logcat)."

    .line 96
    .line 97
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_3
    const/4 p1, -0x1

    .line 102
    const/4 p3, 0x0

    .line 103
    const/4 v1, 0x1

    .line 104
    if-ne p0, p1, :cond_4

    .line 105
    .line 106
    iput-boolean v1, v5, Ldefpackage/dj0;->r:Z

    .line 107
    .line 108
    return-object p3

    .line 109
    :cond_4
    if-nez p0, :cond_5

    .line 110
    .line 111
    iput-boolean v1, v5, Ldefpackage/dj0;->r:Z

    .line 112
    .line 113
    return-object p3

    .line 114
    :cond_5
    iget-boolean p1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->t:Z

    .line 115
    .line 116
    if-nez p1, :cond_7

    .line 117
    .line 118
    iget-wide v2, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 119
    .line 120
    invoke-direct {v0, v2, v3}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegGetChannelCount(J)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iput p1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->u:I

    .line 125
    .line 126
    iget-wide v2, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->s:J

    .line 127
    .line 128
    invoke-direct {v0, v2, v3}, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->ffmpegGetSampleRate(J)I

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iput p1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->v:I

    .line 133
    .line 134
    iget p1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->v:I

    .line 135
    .line 136
    if-nez p1, :cond_6

    .line 137
    .line 138
    const-string p1, "alac"

    .line 139
    .line 140
    iget-object v2, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    iget-object p1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->p:[B

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance p1, Ldefpackage/be3;

    .line 154
    .line 155
    iget-object v2, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->p:[B

    .line 156
    .line 157
    invoke-direct {p1, v2}, Ldefpackage/be3;-><init>([B)V

    .line 158
    .line 159
    .line 160
    iget-object v2, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->p:[B

    .line 161
    .line 162
    array-length v2, v2

    .line 163
    add-int/lit8 v2, v2, -0x4

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Ldefpackage/be3;->N(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ldefpackage/be3;->E()I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    iput p1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->v:I

    .line 173
    .line 174
    :cond_6
    iput-boolean v1, v0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->t:Z

    .line 175
    .line 176
    :cond_7
    iget-object p1, v5, Landroidx/media3/decoder/SimpleDecoderOutputBuffer;->t:Ljava/nio/ByteBuffer;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 185
    .line 186
    .line 187
    return-object p3
.end method

.method public final o()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ffmpeg"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroidx/media3/decoder/ffmpeg/FfmpegLibrary;->c()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "-"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/FfmpegAudioDecoder;->o:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
