.class public Lpm0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Loj1;

.field public c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpm0;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Loj1;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p1, v1}, Loj1;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lpm0;->b:Loj1;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput p1, p0, Lpm0;->c:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ltj0;
    .locals 0

    .line 1
    new-instance p0, Lau;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lau;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lau;->b()Ltj0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final b(Landroid/os/Handler;Lo55;Lqm;Lrs4;Lxv2;)[Lkq;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-object/from16 v6, p5

    .line 8
    .line 9
    new-instance v7, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget v2, v0, Lpm0;->c:I

    .line 15
    .line 16
    const-wide/16 v4, 0x1388

    .line 17
    .line 18
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v8

    .line 22
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    const-class v10, Lo55;

    .line 25
    .line 26
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    new-instance v12, Lmk2;

    .line 29
    .line 30
    iget-object v13, v0, Lpm0;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-direct {v12, v13}, Lmk2;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iget-object v14, v0, Lpm0;->b:Loj1;

    .line 36
    .line 37
    iput-object v14, v12, Lmk2;->c:Lzj2;

    .line 38
    .line 39
    iput-wide v4, v12, Lmk2;->d:J

    .line 40
    .line 41
    iput-object v3, v12, Lmk2;->e:Landroid/os/Handler;

    .line 42
    .line 43
    iput-object v1, v12, Lmk2;->f:Lo55;

    .line 44
    .line 45
    const/16 v4, 0x32

    .line 46
    .line 47
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iput v4, v12, Lmk2;->g:I

    .line 52
    .line 53
    iget-boolean v4, v12, Lmk2;->b:Z

    .line 54
    .line 55
    const/4 v15, 0x1

    .line 56
    xor-int/2addr v4, v15

    .line 57
    invoke-static {v4}, Lrr2;->w(Z)V

    .line 58
    .line 59
    .line 60
    iget-object v4, v12, Lmk2;->e:Landroid/os/Handler;

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    if-nez v4, :cond_0

    .line 65
    .line 66
    iget-object v15, v12, Lmk2;->f:Lo55;

    .line 67
    .line 68
    if-eqz v15, :cond_1

    .line 69
    .line 70
    :cond_0
    if-eqz v4, :cond_2

    .line 71
    .line 72
    iget-object v4, v12, Lmk2;->f:Lo55;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    :cond_1
    const/4 v4, 0x1

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move/from16 v4, v17

    .line 79
    .line 80
    :goto_0
    invoke-static {v4}, Lrr2;->w(Z)V

    .line 81
    .line 82
    .line 83
    const/4 v4, 0x1

    .line 84
    iput-boolean v4, v12, Lmk2;->b:Z

    .line 85
    .line 86
    new-instance v4, Lok2;

    .line 87
    .line 88
    invoke-direct {v4, v12}, Lok2;-><init>(Lmk2;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    const-string v15, "Error instantiating FFmpeg extension"

    .line 95
    .line 96
    const-string v4, "DefaultRenderersFactory"

    .line 97
    .line 98
    const/16 v18, 0x0

    .line 99
    .line 100
    const-class v12, Landroid/os/Handler;

    .line 101
    .line 102
    move-object/from16 v19, v8

    .line 103
    .line 104
    const/4 v8, 0x2

    .line 105
    if-nez v2, :cond_3

    .line 106
    .line 107
    move/from16 v21, v8

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result v20

    .line 115
    if-ne v2, v8, :cond_4

    .line 116
    .line 117
    add-int/lit8 v20, v20, -0x1

    .line 118
    .line 119
    :cond_4
    move/from16 v2, v20

    .line 120
    .line 121
    const/16 v20, 0x3

    .line 122
    .line 123
    move/from16 v21, v8

    .line 124
    .line 125
    const/4 v8, 0x4

    .line 126
    :try_start_0
    const-string v22, "androidx.media3.decoder.vp9.LibvpxVideoRenderer"

    .line 127
    .line 128
    invoke-static/range {v22 .. v22}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    new-array v3, v8, [Ljava/lang/Class;

    .line 133
    .line 134
    aput-object v11, v3, v17

    .line 135
    .line 136
    const/16 v16, 0x1

    .line 137
    .line 138
    aput-object v12, v3, v16

    .line 139
    .line 140
    aput-object v10, v3, v21

    .line 141
    .line 142
    aput-object v9, v3, v20

    .line 143
    .line 144
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    new-array v3, v8, [Ljava/lang/Object;

    .line 149
    .line 150
    aput-object v19, v3, v17

    .line 151
    .line 152
    const/16 v16, 0x1

    .line 153
    .line 154
    aput-object p1, v3, v16

    .line 155
    .line 156
    aput-object p2, v3, v21

    .line 157
    .line 158
    aput-object v5, v3, v20

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Lkq;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    .line 166
    add-int/lit8 v3, v2, 0x1

    .line 167
    .line 168
    :try_start_1
    invoke-virtual {v7, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    const-string v1, "Loaded LibvpxVideoRenderer."

    .line 172
    .line 173
    invoke-static {v4, v1}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :catch_0
    move-exception v0

    .line 178
    goto :goto_1

    .line 179
    :catch_1
    move v2, v3

    .line 180
    goto :goto_2

    .line 181
    :goto_1
    const-string v1, "Error instantiating VP9 extension"

    .line 182
    .line 183
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    return-object v18

    .line 187
    :catch_2
    :goto_2
    move v3, v2

    .line 188
    :goto_3
    :try_start_2
    const-string v1, "androidx.media3.decoder.av1.Libdav1dVideoRenderer"

    .line 189
    .line 190
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    new-array v2, v8, [Ljava/lang/Class;

    .line 195
    .line 196
    aput-object v11, v2, v17

    .line 197
    .line 198
    const/16 v16, 0x1

    .line 199
    .line 200
    aput-object v12, v2, v16

    .line 201
    .line 202
    aput-object v10, v2, v21

    .line 203
    .line 204
    aput-object v9, v2, v20

    .line 205
    .line 206
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    new-array v2, v8, [Ljava/lang/Object;

    .line 211
    .line 212
    aput-object v19, v2, v17

    .line 213
    .line 214
    const/16 v16, 0x1

    .line 215
    .line 216
    aput-object p1, v2, v16

    .line 217
    .line 218
    aput-object p2, v2, v21

    .line 219
    .line 220
    aput-object v5, v2, v20

    .line 221
    .line 222
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, Lkq;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 227
    .line 228
    add-int/lit8 v2, v3, 0x1

    .line 229
    .line 230
    :try_start_3
    invoke-virtual {v7, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const-string v1, "Loaded Libdav1dVideoRenderer."

    .line 234
    .line 235
    invoke-static {v4, v1}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :catch_3
    move-exception v0

    .line 240
    goto :goto_4

    .line 241
    :catch_4
    move v3, v2

    .line 242
    goto :goto_5

    .line 243
    :goto_4
    const-string v1, "Error instantiating AV1 extension"

    .line 244
    .line 245
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 246
    .line 247
    .line 248
    return-object v18

    .line 249
    :catch_5
    :goto_5
    move v2, v3

    .line 250
    :goto_6
    :try_start_4
    const-class v1, Lx41;

    .line 251
    .line 252
    new-array v3, v8, [Ljava/lang/Class;

    .line 253
    .line 254
    aput-object v11, v3, v17

    .line 255
    .line 256
    const/16 v16, 0x1

    .line 257
    .line 258
    aput-object v12, v3, v16

    .line 259
    .line 260
    aput-object v10, v3, v21

    .line 261
    .line 262
    aput-object v9, v3, v20

    .line 263
    .line 264
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    new-array v3, v8, [Ljava/lang/Object;

    .line 269
    .line 270
    aput-object v19, v3, v17

    .line 271
    .line 272
    const/16 v16, 0x1

    .line 273
    .line 274
    aput-object p1, v3, v16

    .line 275
    .line 276
    aput-object p2, v3, v21

    .line 277
    .line 278
    aput-object v5, v3, v20

    .line 279
    .line 280
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    check-cast v1, Lkq;

    .line 285
    .line 286
    invoke-virtual {v7, v2, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    const-string v1, "Loaded FfmpegVideoRenderer."

    .line 290
    .line 291
    invoke-static {v4, v1}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :catch_6
    move-exception v0

    .line 296
    invoke-static {v15, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    return-object v18

    .line 300
    :catch_7
    :goto_7
    invoke-virtual {v0, v13}, Lpm0;->a(Landroid/content/Context;)Ltj0;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    iget v8, v0, Lpm0;->c:I

    .line 305
    .line 306
    const-class v9, Landroid/content/Context;

    .line 307
    .line 308
    const-class v10, Lsm;

    .line 309
    .line 310
    const-class v11, Lqm;

    .line 311
    .line 312
    new-instance v1, Lbk2;

    .line 313
    .line 314
    iget-object v0, v0, Lpm0;->a:Landroid/content/Context;

    .line 315
    .line 316
    move-object v2, v1

    .line 317
    move-object v1, v0

    .line 318
    move-object v0, v2

    .line 319
    move-object/from16 v3, p1

    .line 320
    .line 321
    move-object v2, v14

    .line 322
    move-object v14, v4

    .line 323
    move-object/from16 v4, p3

    .line 324
    .line 325
    invoke-direct/range {v0 .. v5}, Lbk2;-><init>(Landroid/content/Context;Lzj2;Landroid/os/Handler;Lqm;Lsm;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    if-nez v8, :cond_5

    .line 332
    .line 333
    goto/16 :goto_17

    .line 334
    .line 335
    :cond_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    move/from16 v2, v21

    .line 340
    .line 341
    if-ne v8, v2, :cond_6

    .line 342
    .line 343
    add-int/lit8 v0, v0, -0x1

    .line 344
    .line 345
    :cond_6
    :try_start_5
    const-string v2, "androidx.media3.decoder.midi.MidiRenderer"

    .line 346
    .line 347
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    filled-new-array {v9, v12, v11, v10}, [Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object v8

    .line 355
    invoke-virtual {v2, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    filled-new-array {v1, v3, v4, v5}, [Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    invoke-virtual {v2, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    check-cast v2, Lkq;
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_a
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_8

    .line 368
    .line 369
    add-int/lit8 v8, v0, 0x1

    .line 370
    .line 371
    :try_start_6
    invoke-virtual {v7, v0, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    const-string v0, "Loaded MidiRenderer."

    .line 375
    .line 376
    invoke-static {v14, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_9
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_8

    .line 377
    .line 378
    .line 379
    goto :goto_a

    .line 380
    :catch_8
    move-exception v0

    .line 381
    goto :goto_8

    .line 382
    :catch_9
    move v0, v8

    .line 383
    goto :goto_9

    .line 384
    :goto_8
    const-string v1, "Error instantiating MIDI extension"

    .line 385
    .line 386
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    return-object v18

    .line 390
    :catch_a
    :goto_9
    move v8, v0

    .line 391
    :goto_a
    :try_start_7
    const-string v0, "androidx.media3.decoder.opus.LibopusAudioRenderer"

    .line 392
    .line 393
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    filled-new-array {v12, v11, v10}, [Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, Lkq;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_d
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_b

    .line 414
    .line 415
    add-int/lit8 v2, v8, 0x1

    .line 416
    .line 417
    :try_start_8
    invoke-virtual {v7, v8, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    const-string v0, "Loaded LibopusAudioRenderer."

    .line 421
    .line 422
    invoke-static {v14, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/ClassNotFoundException; {:try_start_8 .. :try_end_8} :catch_c
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_b

    .line 423
    .line 424
    .line 425
    goto :goto_d

    .line 426
    :catch_b
    move-exception v0

    .line 427
    goto :goto_b

    .line 428
    :catch_c
    move v8, v2

    .line 429
    goto :goto_c

    .line 430
    :goto_b
    const-string v1, "Error instantiating Opus extension"

    .line 431
    .line 432
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 433
    .line 434
    .line 435
    return-object v18

    .line 436
    :catch_d
    :goto_c
    move v2, v8

    .line 437
    :goto_d
    :try_start_9
    const-string v0, "androidx.media3.decoder.flac.LibflacAudioRenderer"

    .line 438
    .line 439
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    filled-new-array {v12, v11, v10}, [Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    move-result-object v8

    .line 447
    invoke-virtual {v0, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v8

    .line 455
    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    check-cast v0, Lkq;
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_10
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_e

    .line 460
    .line 461
    add-int/lit8 v8, v2, 0x1

    .line 462
    .line 463
    :try_start_a
    invoke-virtual {v7, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 464
    .line 465
    .line 466
    const-string v0, "Loaded LibflacAudioRenderer."

    .line 467
    .line 468
    invoke-static {v14, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_a .. :try_end_a} :catch_f
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_e

    .line 469
    .line 470
    .line 471
    goto :goto_10

    .line 472
    :catch_e
    move-exception v0

    .line 473
    goto :goto_e

    .line 474
    :catch_f
    move v2, v8

    .line 475
    goto :goto_f

    .line 476
    :goto_e
    const-string v1, "Error instantiating FLAC extension"

    .line 477
    .line 478
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 479
    .line 480
    .line 481
    return-object v18

    .line 482
    :catch_10
    :goto_f
    move v8, v2

    .line 483
    :goto_10
    :try_start_b
    const-class v0, Landroidx/media3/decoder/ffmpeg/b;

    .line 484
    .line 485
    filled-new-array {v12, v11, v10}, [Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 490
    .line 491
    .line 492
    move-result-object v0

    .line 493
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    check-cast v0, Lkq;
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b .. :try_end_b} :catch_13
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_11

    .line 502
    .line 503
    add-int/lit8 v2, v8, 0x1

    .line 504
    .line 505
    :try_start_c
    invoke-virtual {v7, v8, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    const-string v0, "Loaded FfmpegAudioRenderer."

    .line 509
    .line 510
    invoke-static {v14, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_12
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_11

    .line 511
    .line 512
    .line 513
    goto :goto_13

    .line 514
    :catch_11
    move-exception v0

    .line 515
    goto :goto_11

    .line 516
    :catch_12
    move v8, v2

    .line 517
    goto :goto_12

    .line 518
    :goto_11
    invoke-static {v15, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 519
    .line 520
    .line 521
    return-object v18

    .line 522
    :catch_13
    :goto_12
    move v2, v8

    .line 523
    :goto_13
    :try_start_d
    const-string v0, "androidx.media3.decoder.iamf.LibiamfAudioRenderer"

    .line 524
    .line 525
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    filled-new-array {v9, v12, v11, v10}, [Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    move-result-object v8

    .line 533
    invoke-virtual {v0, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    filled-new-array {v1, v3, v4, v5}, [Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    check-cast v0, Lkq;
    :try_end_d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_d .. :try_end_d} :catch_16
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_14

    .line 546
    .line 547
    add-int/lit8 v1, v2, 0x1

    .line 548
    .line 549
    :try_start_e
    invoke-virtual {v7, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    const-string v0, "Loaded LibiamfAudioRenderer."

    .line 553
    .line 554
    invoke-static {v14, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e .. :try_end_e} :catch_15
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_14

    .line 555
    .line 556
    .line 557
    goto :goto_16

    .line 558
    :catch_14
    move-exception v0

    .line 559
    goto :goto_14

    .line 560
    :catch_15
    move v2, v1

    .line 561
    goto :goto_15

    .line 562
    :goto_14
    const-string v1, "Error instantiating IAMF extension"

    .line 563
    .line 564
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 565
    .line 566
    .line 567
    return-object v18

    .line 568
    :catch_16
    :goto_15
    move v1, v2

    .line 569
    :goto_16
    :try_start_f
    const-string v0, "androidx.media3.decoder.mpegh.MpeghAudioRenderer"

    .line 570
    .line 571
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    filled-new-array {v12, v11, v10}, [Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    check-cast v0, Lkq;

    .line 592
    .line 593
    invoke-virtual {v7, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    const-string v0, "Loaded MpeghAudioRenderer."

    .line 597
    .line 598
    invoke-static {v14, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/ClassNotFoundException; {:try_start_f .. :try_end_f} :catch_18
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_17

    .line 599
    .line 600
    .line 601
    goto :goto_17

    .line 602
    :catch_17
    move-exception v0

    .line 603
    const-string v1, "Error instantiating MPEG-H extension"

    .line 604
    .line 605
    invoke-static {v1, v0}, Lmj0;->j(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 606
    .line 607
    .line 608
    return-object v18

    .line 609
    :catch_18
    :goto_17
    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    new-instance v1, Lts4;

    .line 614
    .line 615
    move-object/from16 v2, p4

    .line 616
    .line 617
    invoke-direct {v1, v2, v0}, Lts4;-><init>(Lrs4;Landroid/os/Looper;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    invoke-virtual {v3}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    new-instance v1, Lyv2;

    .line 628
    .line 629
    invoke-direct {v1, v6, v0}, Lyv2;-><init>(Lxv2;Landroid/os/Looper;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    new-instance v1, Lyv2;

    .line 636
    .line 637
    invoke-direct {v1, v6, v0}, Lyv2;-><init>(Lxv2;Landroid/os/Looper;)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    new-instance v0, Lvy;

    .line 644
    .line 645
    invoke-direct {v0}, Lvy;-><init>()V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    new-instance v0, Ldw1;

    .line 652
    .line 653
    new-instance v1, Lvj;

    .line 654
    .line 655
    const/4 v4, 0x1

    .line 656
    invoke-direct {v1, v13, v4}, Lvj;-><init>(Landroid/content/Context;I)V

    .line 657
    .line 658
    .line 659
    invoke-direct {v0, v1}, Ldw1;-><init>(Lvj;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move/from16 v0, v17

    .line 666
    .line 667
    new-array v0, v0, [Lkq;

    .line 668
    .line 669
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    check-cast v0, [Lkq;

    .line 674
    .line 675
    return-object v0
.end method
