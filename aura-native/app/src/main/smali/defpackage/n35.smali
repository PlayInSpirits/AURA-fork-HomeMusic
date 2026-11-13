.class public final Ldefpackage/n35;
.super Ldefpackage/i35;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final b:Ldefpackage/gk1;

.field public c:Ljava/lang/String;

.field public d:Z

.field public final e:Ldefpackage/pv0;

.field public f:Ldefpackage/gf1;

.field public final g:Ldefpackage/zd3;

.field public h:Ldefpackage/dt;

.field public final i:Ldefpackage/zd3;

.field public j:J

.field public k:F

.field public l:F

.field public final m:Ldefpackage/m35;


# direct methods
.method public constructor <init>(Ldefpackage/gk1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/n35;->b:Ldefpackage/gk1;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/m35;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Ldefpackage/m35;-><init>(Ldefpackage/n35;I)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p1, Ldefpackage/gk1;->i:Ldefpackage/if1;

    .line 13
    .line 14
    const-string p1, ""

    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/n35;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Ldefpackage/n35;->d:Z

    .line 20
    .line 21
    new-instance v0, Ldefpackage/pv0;

    .line 22
    .line 23
    invoke-direct {v0}, Ldefpackage/pv0;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ldefpackage/n35;->e:Ldefpackage/pv0;

    .line 27
    .line 28
    new-instance v0, Ldefpackage/rd2;

    .line 29
    .line 30
    const/16 v1, 0xa

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ldefpackage/rd2;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Ldefpackage/n35;->f:Ldefpackage/gf1;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-static {v0}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Ldefpackage/n35;->g:Ldefpackage/zd3;

    .line 43
    .line 44
    new-instance v0, Ldefpackage/qf4;

    .line 45
    .line 46
    const-wide/16 v1, 0x0

    .line 47
    .line 48
    invoke-direct {v0, v1, v2}, Ldefpackage/qf4;-><init>(J)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Ldefpackage/uc5;->B(Ljava/lang/Object;)Ldefpackage/zd3;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Ldefpackage/n35;->i:Ldefpackage/zd3;

    .line 56
    .line 57
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    iput-wide v0, p0, Ldefpackage/n35;->j:J

    .line 63
    .line 64
    const/high16 v0, 0x3f800000    # 1.0f

    .line 65
    .line 66
    iput v0, p0, Ldefpackage/n35;->k:F

    .line 67
    .line 68
    iput v0, p0, Ldefpackage/n35;->l:F

    .line 69
    .line 70
    new-instance v0, Ldefpackage/m35;

    .line 71
    .line 72
    invoke-direct {v0, p0, p1}, Ldefpackage/m35;-><init>(Ldefpackage/n35;I)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Ldefpackage/n35;->m:Ldefpackage/m35;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/sv0;)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, v1}, Ldefpackage/n35;->e(Ldefpackage/sv0;FLdefpackage/dt;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final e(Ldefpackage/sv0;FLdefpackage/dt;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/n35;->b:Ldefpackage/gk1;

    .line 6
    .line 7
    iget-boolean v3, v2, Ldefpackage/gk1;->d:Z

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x5

    .line 11
    iget-object v6, v0, Ldefpackage/n35;->g:Ldefpackage/zd3;

    .line 12
    .line 13
    const/4 v8, 0x1

    .line 14
    if-eqz v3, :cond_4

    .line 15
    .line 16
    iget-wide v9, v2, Ldefpackage/gk1;->e:J

    .line 17
    .line 18
    const-wide/16 v11, 0x10

    .line 19
    .line 20
    cmp-long v3, v9, v11

    .line 21
    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    invoke-virtual {v6}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ldefpackage/dt;

    .line 29
    .line 30
    sget v9, Ldefpackage/c45;->a:I

    .line 31
    .line 32
    instance-of v9, v3, Ldefpackage/dt;

    .line 33
    .line 34
    if-eqz v9, :cond_1

    .line 35
    .line 36
    iget v3, v3, Ldefpackage/dt;->c:I

    .line 37
    .line 38
    if-ne v3, v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    if-ne v3, v4, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-nez v3, :cond_4

    .line 45
    .line 46
    :goto_0
    instance-of v3, v1, Ldefpackage/dt;

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget v3, v1, Ldefpackage/dt;->c:I

    .line 51
    .line 52
    if-ne v3, v5, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    if-ne v3, v4, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    if-nez v1, :cond_4

    .line 59
    .line 60
    :goto_1
    move v3, v8

    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const/4 v3, 0x0

    .line 63
    :goto_2
    iget-boolean v9, v0, Ldefpackage/n35;->d:Z

    .line 64
    .line 65
    const/16 v10, 0x1a

    .line 66
    .line 67
    iget-object v11, v0, Ldefpackage/n35;->e:Ldefpackage/pv0;

    .line 68
    .line 69
    if-nez v9, :cond_a

    .line 70
    .line 71
    iget-wide v12, v0, Ldefpackage/n35;->j:J

    .line 72
    .line 73
    invoke-interface/range {p1 .. p1}, Ldefpackage/sv0;->P()J

    .line 74
    .line 75
    .line 76
    move-result-wide v14

    .line 77
    invoke-static {v12, v13, v14, v15}, Ldefpackage/qf4;->a(JJ)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_a

    .line 82
    .line 83
    iget-object v9, v11, Ldefpackage/pv0;->a:Ldefpackage/cc;

    .line 84
    .line 85
    if-eqz v9, :cond_9

    .line 86
    .line 87
    iget-object v9, v9, Ldefpackage/cc;->a:Landroid/graphics/Bitmap;

    .line 88
    .line 89
    invoke-virtual {v9}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    sget-object v12, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 97
    .line 98
    if-ne v9, v12, :cond_5

    .line 99
    .line 100
    move v4, v8

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 103
    .line 104
    if-ne v9, v12, :cond_6

    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    goto :goto_4

    .line 108
    :cond_6
    sget-object v12, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 109
    .line 110
    if-ne v9, v12, :cond_7

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 114
    .line 115
    if-lt v12, v10, :cond_8

    .line 116
    .line 117
    invoke-static {}, Ldefpackage/j3;->d()Landroid/graphics/Bitmap$Config;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    if-ne v9, v13, :cond_8

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_8
    if-lt v12, v10, :cond_9

    .line 125
    .line 126
    invoke-static {}, Ldefpackage/j3;->D()Landroid/graphics/Bitmap$Config;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    if-ne v9, v4, :cond_9

    .line 131
    .line 132
    const/4 v4, 0x4

    .line 133
    goto :goto_4

    .line 134
    :cond_9
    :goto_3
    const/4 v4, 0x0

    .line 135
    :goto_4
    if-ne v3, v4, :cond_a

    .line 136
    .line 137
    move-object/from16 v13, p1

    .line 138
    .line 139
    goto/16 :goto_b

    .line 140
    .line 141
    :cond_a
    if-ne v3, v8, :cond_c

    .line 142
    .line 143
    iget-wide v12, v2, Ldefpackage/gk1;->e:J

    .line 144
    .line 145
    sget v2, Ldefpackage/c45;->a:I

    .line 146
    .line 147
    invoke-static {v12, v13}, Ldefpackage/x40;->d(J)F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    const/high16 v9, 0x3f800000    # 1.0f

    .line 152
    .line 153
    cmpg-float v2, v2, v9

    .line 154
    .line 155
    if-nez v2, :cond_b

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_b
    invoke-static {v12, v13, v9}, Ldefpackage/x40;->b(JF)J

    .line 159
    .line 160
    .line 161
    move-result-wide v12

    .line 162
    :goto_5
    new-instance v2, Ldefpackage/dt;

    .line 163
    .line 164
    invoke-direct {v2, v5, v12, v13}, Ldefpackage/dt;-><init>(IJ)V

    .line 165
    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_c
    const/4 v2, 0x0

    .line 169
    :goto_6
    iput-object v2, v0, Ldefpackage/n35;->h:Ldefpackage/dt;

    .line 170
    .line 171
    invoke-interface/range {p1 .. p1}, Ldefpackage/sv0;->P()J

    .line 172
    .line 173
    .line 174
    move-result-wide v12

    .line 175
    const/16 v2, 0x20

    .line 176
    .line 177
    shr-long/2addr v12, v2

    .line 178
    long-to-int v5, v12

    .line 179
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    iget-object v9, v0, Ldefpackage/n35;->i:Ldefpackage/zd3;

    .line 184
    .line 185
    invoke-virtual {v9}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    check-cast v12, Ldefpackage/qf4;

    .line 190
    .line 191
    iget-wide v12, v12, Ldefpackage/qf4;->a:J

    .line 192
    .line 193
    shr-long/2addr v12, v2

    .line 194
    long-to-int v12, v12

    .line 195
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    div-float/2addr v5, v12

    .line 200
    iput v5, v0, Ldefpackage/n35;->k:F

    .line 201
    .line 202
    invoke-interface/range {p1 .. p1}, Ldefpackage/sv0;->P()J

    .line 203
    .line 204
    .line 205
    move-result-wide v12

    .line 206
    const-wide v14, 0xffffffffL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    and-long/2addr v12, v14

    .line 212
    long-to-int v5, v12

    .line 213
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    invoke-virtual {v9}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    check-cast v9, Ldefpackage/qf4;

    .line 222
    .line 223
    iget-wide v12, v9, Ldefpackage/qf4;->a:J

    .line 224
    .line 225
    and-long/2addr v12, v14

    .line 226
    long-to-int v9, v12

    .line 227
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    div-float/2addr v5, v9

    .line 232
    iput v5, v0, Ldefpackage/n35;->l:F

    .line 233
    .line 234
    invoke-interface/range {p1 .. p1}, Ldefpackage/sv0;->P()J

    .line 235
    .line 236
    .line 237
    move-result-wide v12

    .line 238
    shr-long/2addr v12, v2

    .line 239
    long-to-int v5, v12

    .line 240
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    float-to-double v12, v5

    .line 245
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 246
    .line 247
    .line 248
    move-result-wide v12

    .line 249
    double-to-float v5, v12

    .line 250
    float-to-int v5, v5

    .line 251
    invoke-interface/range {p1 .. p1}, Ldefpackage/sv0;->P()J

    .line 252
    .line 253
    .line 254
    move-result-wide v12

    .line 255
    and-long/2addr v12, v14

    .line 256
    long-to-int v9, v12

    .line 257
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    float-to-double v12, v9

    .line 262
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 263
    .line 264
    .line 265
    move-result-wide v12

    .line 266
    double-to-float v9, v12

    .line 267
    float-to-int v9, v9

    .line 268
    int-to-long v12, v5

    .line 269
    shl-long/2addr v12, v2

    .line 270
    move-wide/from16 v16, v14

    .line 271
    .line 272
    int-to-long v14, v9

    .line 273
    and-long v14, v14, v16

    .line 274
    .line 275
    or-long/2addr v12, v14

    .line 276
    invoke-interface/range {p1 .. p1}, Ldefpackage/sv0;->getLayoutDirection()Ldefpackage/r62;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    iget-object v9, v11, Ldefpackage/pv0;->a:Ldefpackage/cc;

    .line 281
    .line 282
    iget-object v14, v11, Ldefpackage/pv0;->b:Ldefpackage/aa;

    .line 283
    .line 284
    if-eqz v9, :cond_e

    .line 285
    .line 286
    if-eqz v14, :cond_e

    .line 287
    .line 288
    shr-long v7, v12, v2

    .line 289
    .line 290
    long-to-int v7, v7

    .line 291
    iget-object v8, v9, Ldefpackage/cc;->a:Landroid/graphics/Bitmap;

    .line 292
    .line 293
    move/from16 v19, v2

    .line 294
    .line 295
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-gt v7, v2, :cond_d

    .line 300
    .line 301
    move-object v7, v5

    .line 302
    and-long v4, v12, v16

    .line 303
    .line 304
    long-to-int v4, v4

    .line 305
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-gt v4, v5, :cond_f

    .line 310
    .line 311
    iget v4, v11, Ldefpackage/pv0;->d:I

    .line 312
    .line 313
    if-ne v4, v3, :cond_f

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_d
    :goto_7
    move-object v7, v5

    .line 317
    goto :goto_8

    .line 318
    :cond_e
    move/from16 v19, v2

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_f
    :goto_8
    shr-long v4, v12, v19

    .line 322
    .line 323
    long-to-int v4, v4

    .line 324
    and-long v8, v12, v16

    .line 325
    .line 326
    long-to-int v5, v8

    .line 327
    sget-object v8, Ldefpackage/s50;->e:Ldefpackage/k24;

    .line 328
    .line 329
    invoke-static {v3}, Ldefpackage/fu;->O(I)Landroid/graphics/Bitmap$Config;

    .line 330
    .line 331
    .line 332
    move-result-object v9

    .line 333
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 334
    .line 335
    if-lt v14, v10, :cond_10

    .line 336
    .line 337
    invoke-static {v3}, Ldefpackage/fu;->O(I)Landroid/graphics/Bitmap$Config;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    invoke-static {v8}, Ldefpackage/r50;->a(Ldefpackage/p50;)Landroid/graphics/ColorSpace;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    invoke-static {v4, v5, v2, v8}, Ldefpackage/j3;->e(IILandroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;)Landroid/graphics/Bitmap;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    goto :goto_9

    .line 350
    :cond_10
    const/4 v2, 0x0

    .line 351
    invoke-static {v2, v4, v5, v9}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const/4 v4, 0x1

    .line 356
    invoke-virtual {v2, v4}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 357
    .line 358
    .line 359
    :goto_9
    new-instance v9, Ldefpackage/cc;

    .line 360
    .line 361
    invoke-direct {v9, v2}, Ldefpackage/cc;-><init>(Landroid/graphics/Bitmap;)V

    .line 362
    .line 363
    .line 364
    sget-object v4, Ldefpackage/ba;->a:Landroid/graphics/Canvas;

    .line 365
    .line 366
    new-instance v14, Ldefpackage/aa;

    .line 367
    .line 368
    invoke-direct {v14}, Ldefpackage/aa;-><init>()V

    .line 369
    .line 370
    .line 371
    new-instance v4, Landroid/graphics/Canvas;

    .line 372
    .line 373
    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 374
    .line 375
    .line 376
    iput-object v4, v14, Ldefpackage/aa;->a:Landroid/graphics/Canvas;

    .line 377
    .line 378
    iput-object v9, v11, Ldefpackage/pv0;->a:Ldefpackage/cc;

    .line 379
    .line 380
    iput-object v14, v11, Ldefpackage/pv0;->b:Ldefpackage/aa;

    .line 381
    .line 382
    iput v3, v11, Ldefpackage/pv0;->d:I

    .line 383
    .line 384
    :goto_a
    iput-wide v12, v11, Ldefpackage/pv0;->c:J

    .line 385
    .line 386
    iget-object v2, v11, Ldefpackage/pv0;->e:Ldefpackage/mz;

    .line 387
    .line 388
    invoke-static {v12, v13}, Ldefpackage/l93;->o0(J)J

    .line 389
    .line 390
    .line 391
    move-result-wide v3

    .line 392
    iget-object v5, v2, Ldefpackage/mz;->n:Ldefpackage/lz;

    .line 393
    .line 394
    iget-object v8, v5, Ldefpackage/lz;->a:Ldefpackage/oo0;

    .line 395
    .line 396
    iget-object v10, v5, Ldefpackage/lz;->b:Ldefpackage/r62;

    .line 397
    .line 398
    iget-object v12, v5, Ldefpackage/lz;->c:Ldefpackage/jz;

    .line 399
    .line 400
    move-object/from16 v16, v2

    .line 401
    .line 402
    iget-wide v1, v5, Ldefpackage/lz;->d:J

    .line 403
    .line 404
    move-object/from16 v13, p1

    .line 405
    .line 406
    iput-object v13, v5, Ldefpackage/lz;->a:Ldefpackage/oo0;

    .line 407
    .line 408
    iput-object v7, v5, Ldefpackage/lz;->b:Ldefpackage/r62;

    .line 409
    .line 410
    iput-object v14, v5, Ldefpackage/lz;->c:Ldefpackage/jz;

    .line 411
    .line 412
    iput-wide v3, v5, Ldefpackage/lz;->d:J

    .line 413
    .line 414
    invoke-virtual {v14}, Ldefpackage/aa;->e()V

    .line 415
    .line 416
    .line 417
    sget-wide v17, Ldefpackage/x40;->b:J

    .line 418
    .line 419
    const-wide/16 v19, 0x0

    .line 420
    .line 421
    const/16 v21, 0x3e

    .line 422
    .line 423
    invoke-static/range {v16 .. v21}, Ldefpackage/sv0;->l(Ldefpackage/sv0;JJI)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v3, v16

    .line 427
    .line 428
    iget-object v4, v0, Ldefpackage/n35;->m:Ldefpackage/m35;

    .line 429
    .line 430
    invoke-virtual {v4, v3}, Ldefpackage/m35;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v14}, Ldefpackage/aa;->k()V

    .line 434
    .line 435
    .line 436
    iget-object v3, v3, Ldefpackage/mz;->n:Ldefpackage/lz;

    .line 437
    .line 438
    iput-object v8, v3, Ldefpackage/lz;->a:Ldefpackage/oo0;

    .line 439
    .line 440
    iput-object v10, v3, Ldefpackage/lz;->b:Ldefpackage/r62;

    .line 441
    .line 442
    iput-object v12, v3, Ldefpackage/lz;->c:Ldefpackage/jz;

    .line 443
    .line 444
    iput-wide v1, v3, Ldefpackage/lz;->d:J

    .line 445
    .line 446
    iget-object v1, v9, Ldefpackage/cc;->a:Landroid/graphics/Bitmap;

    .line 447
    .line 448
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 449
    .line 450
    .line 451
    const/4 v15, 0x0

    .line 452
    iput-boolean v15, v0, Ldefpackage/n35;->d:Z

    .line 453
    .line 454
    invoke-interface {v13}, Ldefpackage/sv0;->P()J

    .line 455
    .line 456
    .line 457
    move-result-wide v1

    .line 458
    iput-wide v1, v0, Ldefpackage/n35;->j:J

    .line 459
    .line 460
    :goto_b
    if-eqz p3, :cond_11

    .line 461
    .line 462
    move-object/from16 v24, p3

    .line 463
    .line 464
    goto :goto_d

    .line 465
    :cond_11
    invoke-virtual {v6}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, Ldefpackage/dt;

    .line 470
    .line 471
    if-eqz v1, :cond_12

    .line 472
    .line 473
    invoke-virtual {v6}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    check-cast v0, Ldefpackage/dt;

    .line 478
    .line 479
    :goto_c
    move-object/from16 v24, v0

    .line 480
    .line 481
    goto :goto_d

    .line 482
    :cond_12
    iget-object v0, v0, Ldefpackage/n35;->h:Ldefpackage/dt;

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :goto_d
    iget-object v0, v11, Ldefpackage/pv0;->a:Ldefpackage/cc;

    .line 486
    .line 487
    if-eqz v0, :cond_13

    .line 488
    .line 489
    goto :goto_e

    .line 490
    :cond_13
    const-string v1, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    .line 491
    .line 492
    invoke-static {v1}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    :goto_e
    iget-wide v1, v11, Ldefpackage/pv0;->c:J

    .line 496
    .line 497
    const/16 v25, 0x0

    .line 498
    .line 499
    const/16 v26, 0x35a

    .line 500
    .line 501
    const-wide/16 v21, 0x0

    .line 502
    .line 503
    move/from16 v23, p2

    .line 504
    .line 505
    move-object/from16 v18, v0

    .line 506
    .line 507
    move-wide/from16 v19, v1

    .line 508
    .line 509
    move-object/from16 v17, v13

    .line 510
    .line 511
    invoke-static/range {v17 .. v26}, Ldefpackage/sv0;->p(Ldefpackage/sv0;Ldefpackage/cc;JJFLdefpackage/dt;II)V

    .line 512
    .line 513
    .line 514
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Params: \tname: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/n35;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\n\tviewportWidth: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/n35;->i:Ldefpackage/zd3;

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ldefpackage/qf4;

    .line 25
    .line 26
    iget-wide v1, v1, Ldefpackage/qf4;->a:J

    .line 27
    .line 28
    const/16 v3, 0x20

    .line 29
    .line 30
    shr-long/2addr v1, v3

    .line 31
    long-to-int v1, v1

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, "\n\tviewportHeight: "

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ldefpackage/qf4;

    .line 49
    .line 50
    iget-wide v1, p0, Ldefpackage/qf4;->a:J

    .line 51
    .line 52
    const-wide v3, 0xffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v1, v3

    .line 58
    long-to-int p0, v1

    .line 59
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p0, "\n"

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method
