.class public final Lsy;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final d:[[D

.field public static final e:[[D


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [D

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v2, v0, [D

    .line 8
    .line 9
    fill-array-data v2, :array_1

    .line 10
    .line 11
    .line 12
    new-array v3, v0, [D

    .line 13
    .line 14
    fill-array-data v3, :array_2

    .line 15
    .line 16
    .line 17
    filled-new-array {v1, v2, v3}, [[D

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lsy;->d:[[D

    .line 22
    .line 23
    new-array v1, v0, [D

    .line 24
    .line 25
    fill-array-data v1, :array_3

    .line 26
    .line 27
    .line 28
    new-array v2, v0, [D

    .line 29
    .line 30
    fill-array-data v2, :array_4

    .line 31
    .line 32
    .line 33
    new-array v0, v0, [D

    .line 34
    .line 35
    fill-array-data v0, :array_5

    .line 36
    .line 37
    .line 38
    filled-new-array {v1, v2, v0}, [[D

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lsy;->e:[[D

    .line 43
    .line 44
    return-void

    .line 45
    :array_0
    .array-data 8
        0x3fd9aeb3dd11be6eL    # 0.401288
        0x3fe4ce379b77c02bL    # 0.650173
        -0x4055a6e75ff609ddL    # -0.051461
    .end array-data

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    :array_1
    .array-data 8
        -0x402ffb9bed30f063L    # -0.250268
        0x3ff345479d4d8341L    # 1.204414
        0x3fa77a2cecc814d7L    # 0.045854
    .end array-data

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    :array_2
    .array-data 8
        -0x409ef8055fbb517aL    # -0.002079
        0x3fa9103c8e25c811L    # 0.048952
        0x3fee800431bde82dL    # 0.953127
    .end array-data

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    :array_3
    .array-data 8
        0x3ffdcb079afef467L    # 1.8620678
        -0x400fd1e697792de9L    # -1.0112547
        0x3fc3188d6a8c3ae1L    # 0.14918678
    .end array-data

    :array_4
    .array-data 8
        0x3fd8cd3c1de87346L    # 0.38752654
        0x3fe3e2e5bddf7419L    # 0.62144744
        -0x407d9f0ccb1490dcL    # -0.00897398
    .end array-data

    :array_5
    .array-data 8
        -0x406fc73eee525892L    # -0.0158415
        -0x405e8770215031c7L    # -0.03412294
        0x3ff0cca7787f6d9eL    # 1.0499644
    .end array-data
.end method

.method public constructor <init>(DDD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lsy;->a:D

    .line 5
    .line 6
    iput-wide p3, p0, Lsy;->b:D

    .line 7
    .line 8
    iput-wide p5, p0, Lsy;->c:D

    .line 9
    .line 10
    return-void
.end method

.method public static a(I)Lsy;
    .locals 13

    .line 1
    sget-object v6, Lh85;->k:Lh85;

    .line 2
    .line 3
    const/high16 v0, 0xff0000

    .line 4
    .line 5
    and-int/2addr v0, p0

    .line 6
    shr-int/lit8 v0, v0, 0x10

    .line 7
    .line 8
    const v1, 0xff00

    .line 9
    .line 10
    .line 11
    and-int/2addr v1, p0

    .line 12
    shr-int/lit8 v1, v1, 0x8

    .line 13
    .line 14
    and-int/lit16 p0, p0, 0xff

    .line 15
    .line 16
    invoke-static {v0}, Lh12;->E(I)D

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    invoke-static {v1}, Lh12;->E(I)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {p0}, Lh12;->E(I)D

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    const-wide v7, 0x3fda63c2e8477c96L    # 0.41233895

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    mul-double/2addr v7, v2

    .line 34
    const-wide v9, 0x3fd6e341ae4b2c79L    # 0.35762064

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-double/2addr v9, v0

    .line 40
    add-double/2addr v9, v7

    .line 41
    const-wide v7, 0x3fc71af7273e5d5eL    # 0.18051042

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    mul-double/2addr v7, v4

    .line 47
    add-double/2addr v7, v9

    .line 48
    const-wide v9, 0x3fcb367a0f9096bcL    # 0.2126

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    mul-double/2addr v9, v2

    .line 54
    const-wide v11, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-double/2addr v11, v0

    .line 60
    add-double/2addr v11, v9

    .line 61
    const-wide v9, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    mul-double/2addr v9, v4

    .line 67
    add-double/2addr v9, v11

    .line 68
    const-wide v11, 0x3f93c8fde0401c25L    # 0.01932141

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    mul-double/2addr v2, v11

    .line 74
    const-wide v11, 0x3fbe818525c434ceL    # 0.11916382

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    mul-double/2addr v0, v11

    .line 80
    add-double/2addr v0, v2

    .line 81
    const-wide v2, 0x3fee693974c0c730L    # 0.95034478

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    mul-double/2addr v4, v2

    .line 87
    add-double/2addr v4, v0

    .line 88
    move-wide v0, v7

    .line 89
    move-wide v2, v9

    .line 90
    invoke-static/range {v0 .. v6}, Lsy;->b(DDDLh85;)Lsy;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static b(DDDLh85;)Lsy;
    .locals 35

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    sget-object v1, Lsy;->d:[[D

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v3, v1, v2

    .line 7
    .line 8
    aget-wide v4, v3, v2

    .line 9
    .line 10
    mul-double v4, v4, p0

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    aget-wide v7, v3, v6

    .line 14
    .line 15
    mul-double v7, v7, p2

    .line 16
    .line 17
    add-double/2addr v7, v4

    .line 18
    const/4 v4, 0x2

    .line 19
    aget-wide v9, v3, v4

    .line 20
    .line 21
    mul-double v9, v9, p4

    .line 22
    .line 23
    add-double/2addr v9, v7

    .line 24
    aget-object v3, v1, v6

    .line 25
    .line 26
    aget-wide v7, v3, v2

    .line 27
    .line 28
    mul-double v7, v7, p0

    .line 29
    .line 30
    aget-wide v11, v3, v6

    .line 31
    .line 32
    mul-double v11, v11, p2

    .line 33
    .line 34
    add-double/2addr v11, v7

    .line 35
    aget-wide v7, v3, v4

    .line 36
    .line 37
    mul-double v7, v7, p4

    .line 38
    .line 39
    add-double/2addr v7, v11

    .line 40
    aget-object v1, v1, v4

    .line 41
    .line 42
    aget-wide v11, v1, v2

    .line 43
    .line 44
    mul-double v11, v11, p0

    .line 45
    .line 46
    aget-wide v13, v1, v6

    .line 47
    .line 48
    mul-double v13, v13, p2

    .line 49
    .line 50
    add-double/2addr v13, v11

    .line 51
    aget-wide v11, v1, v4

    .line 52
    .line 53
    mul-double v11, v11, p4

    .line 54
    .line 55
    add-double/2addr v11, v13

    .line 56
    iget-object v1, v0, Lh85;->g:[D

    .line 57
    .line 58
    iget-wide v13, v0, Lh85;->i:D

    .line 59
    .line 60
    move v5, v2

    .line 61
    iget-wide v2, v0, Lh85;->d:D

    .line 62
    .line 63
    move v15, v4

    .line 64
    move/from16 p0, v5

    .line 65
    .line 66
    iget-wide v4, v0, Lh85;->a:D

    .line 67
    .line 68
    aget-wide v16, v1, p0

    .line 69
    .line 70
    mul-double v16, v16, v9

    .line 71
    .line 72
    aget-wide v9, v1, v6

    .line 73
    .line 74
    mul-double/2addr v9, v7

    .line 75
    aget-wide v6, v1, v15

    .line 76
    .line 77
    mul-double/2addr v6, v11

    .line 78
    iget-wide v11, v0, Lh85;->h:D

    .line 79
    .line 80
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->abs(D)D

    .line 81
    .line 82
    .line 83
    move-result-wide v18

    .line 84
    mul-double v18, v18, v11

    .line 85
    .line 86
    const-wide/high16 v20, 0x4059000000000000L    # 100.0

    .line 87
    .line 88
    move-wide/from16 p0, v2

    .line 89
    .line 90
    div-double v1, v18, v20

    .line 91
    .line 92
    move-wide/from16 v18, v4

    .line 93
    .line 94
    const-wide v3, 0x3fdae147ae147ae1L    # 0.42

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 100
    .line 101
    .line 102
    move-result-wide v1

    .line 103
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    .line 104
    .line 105
    .line 106
    move-result-wide v22

    .line 107
    mul-double v22, v22, v11

    .line 108
    .line 109
    move-wide/from16 p2, v1

    .line 110
    .line 111
    div-double v1, v22, v20

    .line 112
    .line 113
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 114
    .line 115
    .line 116
    move-result-wide v1

    .line 117
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 118
    .line 119
    .line 120
    move-result-wide v22

    .line 121
    mul-double v22, v22, v11

    .line 122
    .line 123
    div-double v11, v22, v20

    .line 124
    .line 125
    invoke-static {v11, v12, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 126
    .line 127
    .line 128
    move-result-wide v3

    .line 129
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->signum(D)D

    .line 130
    .line 131
    .line 132
    move-result-wide v11

    .line 133
    const-wide/high16 v15, 0x4079000000000000L    # 400.0

    .line 134
    .line 135
    mul-double/2addr v11, v15

    .line 136
    mul-double v11, v11, p2

    .line 137
    .line 138
    const-wide v22, 0x403b2147ae147ae1L    # 27.13

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    add-double v24, p2, v22

    .line 144
    .line 145
    div-double v11, v11, v24

    .line 146
    .line 147
    invoke-static {v9, v10}, Ljava/lang/Math;->signum(D)D

    .line 148
    .line 149
    .line 150
    move-result-wide v8

    .line 151
    mul-double/2addr v8, v15

    .line 152
    mul-double/2addr v8, v1

    .line 153
    add-double v1, v1, v22

    .line 154
    .line 155
    div-double/2addr v8, v1

    .line 156
    invoke-static {v6, v7}, Ljava/lang/Math;->signum(D)D

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    mul-double/2addr v1, v15

    .line 161
    mul-double/2addr v1, v3

    .line 162
    add-double v3, v3, v22

    .line 163
    .line 164
    div-double/2addr v1, v3

    .line 165
    const-wide/high16 v3, 0x4026000000000000L    # 11.0

    .line 166
    .line 167
    mul-double v5, v11, v3

    .line 168
    .line 169
    const-wide/high16 v15, -0x3fd8000000000000L    # -12.0

    .line 170
    .line 171
    mul-double/2addr v15, v8

    .line 172
    add-double/2addr v15, v5

    .line 173
    add-double/2addr v15, v1

    .line 174
    div-double v3, v15, v3

    .line 175
    .line 176
    add-double v5, v11, v8

    .line 177
    .line 178
    const-wide/high16 v15, 0x4000000000000000L    # 2.0

    .line 179
    .line 180
    mul-double v22, v1, v15

    .line 181
    .line 182
    sub-double v5, v5, v22

    .line 183
    .line 184
    const-wide/high16 v22, 0x4022000000000000L    # 9.0

    .line 185
    .line 186
    div-double v5, v5, v22

    .line 187
    .line 188
    const-wide/high16 v22, 0x4034000000000000L    # 20.0

    .line 189
    .line 190
    mul-double v24, v11, v22

    .line 191
    .line 192
    mul-double v8, v8, v22

    .line 193
    .line 194
    add-double v24, v24, v8

    .line 195
    .line 196
    const-wide/high16 v26, 0x4035000000000000L    # 21.0

    .line 197
    .line 198
    mul-double v26, v26, v1

    .line 199
    .line 200
    add-double v26, v26, v24

    .line 201
    .line 202
    div-double v26, v26, v22

    .line 203
    .line 204
    const-wide/high16 v24, 0x4044000000000000L    # 40.0

    .line 205
    .line 206
    mul-double v11, v11, v24

    .line 207
    .line 208
    add-double/2addr v11, v8

    .line 209
    add-double/2addr v11, v1

    .line 210
    div-double v11, v11, v22

    .line 211
    .line 212
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->atan2(DD)D

    .line 213
    .line 214
    .line 215
    move-result-wide v1

    .line 216
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 217
    .line 218
    .line 219
    move-result-wide v1

    .line 220
    const-wide/16 v7, 0x0

    .line 221
    .line 222
    cmpg-double v7, v1, v7

    .line 223
    .line 224
    const-wide v8, 0x4076800000000000L    # 360.0

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    if-gez v7, :cond_1

    .line 230
    .line 231
    add-double/2addr v1, v8

    .line 232
    :cond_0
    :goto_0
    move-wide/from16 v29, v1

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_1
    cmpl-double v7, v1, v8

    .line 236
    .line 237
    if-ltz v7, :cond_0

    .line 238
    .line 239
    sub-double/2addr v1, v8

    .line 240
    goto :goto_0

    .line 241
    :goto_1
    invoke-static/range {v29 .. v30}, Ljava/lang/Math;->toRadians(D)D

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    move-wide/from16 p2, v8

    .line 246
    .line 247
    iget-wide v8, v0, Lh85;->b:D

    .line 248
    .line 249
    mul-double/2addr v11, v8

    .line 250
    div-double v11, v11, v18

    .line 251
    .line 252
    iget-wide v7, v0, Lh85;->j:D

    .line 253
    .line 254
    mul-double v7, v7, p0

    .line 255
    .line 256
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 257
    .line 258
    .line 259
    move-result-wide v7

    .line 260
    mul-double v33, v7, v20

    .line 261
    .line 262
    div-double v7, v33, v20

    .line 263
    .line 264
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 265
    .line 266
    .line 267
    const-wide/high16 v9, 0x4010000000000000L    # 4.0

    .line 268
    .line 269
    add-double v9, v18, v9

    .line 270
    .line 271
    const-wide v11, 0x403423d70a3d70a4L    # 20.14

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    cmpg-double v11, v29, v11

    .line 277
    .line 278
    if-gez v11, :cond_2

    .line 279
    .line 280
    add-double v11, v29, p2

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_2
    move-wide/from16 v11, v29

    .line 284
    .line 285
    :goto_2
    invoke-static {v11, v12}, Ljava/lang/Math;->toRadians(D)D

    .line 286
    .line 287
    .line 288
    move-result-wide v11

    .line 289
    add-double/2addr v11, v15

    .line 290
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    .line 291
    .line 292
    .line 293
    move-result-wide v11

    .line 294
    const-wide v15, 0x400e666666666666L    # 3.8

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    add-double/2addr v11, v15

    .line 300
    const-wide/high16 v15, 0x3fd0000000000000L    # 0.25

    .line 301
    .line 302
    mul-double/2addr v11, v15

    .line 303
    const-wide v15, 0x40ae0c4ec4ec4ec5L    # 3846.153846153846

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    mul-double/2addr v11, v15

    .line 309
    move-wide/from16 p2, v1

    .line 310
    .line 311
    iget-wide v1, v0, Lh85;->e:D

    .line 312
    .line 313
    mul-double/2addr v11, v1

    .line 314
    iget-wide v1, v0, Lh85;->c:D

    .line 315
    .line 316
    mul-double/2addr v11, v1

    .line 317
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    .line 318
    .line 319
    .line 320
    move-result-wide v1

    .line 321
    mul-double/2addr v1, v11

    .line 322
    const-wide v3, 0x3fd3851eb851eb85L    # 0.305

    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    add-double v26, v26, v3

    .line 328
    .line 329
    div-double v1, v1, v26

    .line 330
    .line 331
    const-wide v3, 0x3fd28f5c28f5c28fL    # 0.29

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    iget-wide v5, v0, Lh85;->f:D

    .line 337
    .line 338
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 339
    .line 340
    .line 341
    move-result-wide v3

    .line 342
    const-wide v5, 0x3ffa3d70a3d70a3dL    # 1.64

    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    sub-double/2addr v5, v3

    .line 348
    const-wide v3, 0x3fe75c28f5c28f5cL    # 0.73

    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 354
    .line 355
    .line 356
    move-result-wide v3

    .line 357
    const-wide v5, 0x3feccccccccccccdL    # 0.9

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 363
    .line 364
    .line 365
    move-result-wide v0

    .line 366
    mul-double/2addr v0, v3

    .line 367
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 368
    .line 369
    .line 370
    move-result-wide v2

    .line 371
    mul-double v31, v2, v0

    .line 372
    .line 373
    mul-double v13, v13, v31

    .line 374
    .line 375
    mul-double v0, v0, p0

    .line 376
    .line 377
    div-double/2addr v0, v9

    .line 378
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 379
    .line 380
    .line 381
    const-wide v0, 0x3f9758e219652bd4L    # 0.0228

    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    mul-double/2addr v13, v0

    .line 387
    invoke-static {v13, v14}, Ljava/lang/Math;->log1p(D)D

    .line 388
    .line 389
    .line 390
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    .line 391
    .line 392
    .line 393
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->sin(D)D

    .line 394
    .line 395
    .line 396
    new-instance v28, Lsy;

    .line 397
    .line 398
    invoke-direct/range {v28 .. v34}, Lsy;-><init>(DDD)V

    .line 399
    .line 400
    .line 401
    return-object v28
.end method
