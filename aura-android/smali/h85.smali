.class public final Lh85;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final k:Lh85;


# instance fields
.field public final a:D

.field public final b:D

.field public final c:D

.field public final d:D

.field public final e:D

.field public final f:D

.field public final g:[D

.field public final h:D

.field public final i:D

.field public final j:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 2
    .line 3
    invoke-static {v0, v1}, Lh85;->a(D)Lh85;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lh85;->k:Lh85;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(DDDDDD[DDDD)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lh85;->f:D

    .line 5
    .line 6
    iput-wide p3, p0, Lh85;->a:D

    .line 7
    .line 8
    iput-wide p5, p0, Lh85;->b:D

    .line 9
    .line 10
    iput-wide p7, p0, Lh85;->c:D

    .line 11
    .line 12
    iput-wide p9, p0, Lh85;->d:D

    .line 13
    .line 14
    iput-wide p11, p0, Lh85;->e:D

    .line 15
    .line 16
    iput-object p13, p0, Lh85;->g:[D

    .line 17
    .line 18
    iput-wide p14, p0, Lh85;->h:D

    .line 19
    .line 20
    move-wide/from16 p1, p16

    .line 21
    .line 22
    iput-wide p1, p0, Lh85;->i:D

    .line 23
    .line 24
    move-wide/from16 p1, p18

    .line 25
    .line 26
    iput-wide p1, p0, Lh85;->j:D

    .line 27
    .line 28
    return-void
.end method

.method public static a(D)Lh85;
    .locals 45

    .line 1
    sget-object v0, Lh12;->b:[D

    .line 2
    .line 3
    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    .line 4
    .line 5
    invoke-static {v1, v2}, Lh12;->R(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const-wide v3, 0x404fd4bbab8b494cL    # 63.66197723675813

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    mul-double/2addr v1, v3

    .line 15
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 16
    .line 17
    div-double/2addr v1, v3

    .line 18
    const-wide v5, 0x3fb999999999999aL    # 0.1

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    move-wide/from16 v7, p0

    .line 24
    .line 25
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide v7

    .line 29
    const/4 v9, 0x0

    .line 30
    aget-wide v10, v0, v9

    .line 31
    .line 32
    sget-object v12, Lsy;->d:[[D

    .line 33
    .line 34
    aget-object v13, v12, v9

    .line 35
    .line 36
    aget-wide v14, v13, v9

    .line 37
    .line 38
    mul-double/2addr v14, v10

    .line 39
    const/16 v16, 0x1

    .line 40
    .line 41
    aget-wide v17, v0, v16

    .line 42
    .line 43
    aget-wide v19, v13, v16

    .line 44
    .line 45
    mul-double v19, v19, v17

    .line 46
    .line 47
    add-double v19, v19, v14

    .line 48
    .line 49
    const/4 v14, 0x2

    .line 50
    aget-wide v21, v0, v14

    .line 51
    .line 52
    aget-wide v23, v13, v14

    .line 53
    .line 54
    mul-double v23, v23, v21

    .line 55
    .line 56
    add-double v23, v23, v19

    .line 57
    .line 58
    aget-object v13, v12, v16

    .line 59
    .line 60
    aget-wide v19, v13, v9

    .line 61
    .line 62
    mul-double v19, v19, v10

    .line 63
    .line 64
    aget-wide v25, v13, v16

    .line 65
    .line 66
    mul-double v25, v25, v17

    .line 67
    .line 68
    add-double v25, v25, v19

    .line 69
    .line 70
    aget-wide v19, v13, v14

    .line 71
    .line 72
    mul-double v19, v19, v21

    .line 73
    .line 74
    add-double v19, v19, v25

    .line 75
    .line 76
    aget-object v12, v12, v14

    .line 77
    .line 78
    aget-wide v25, v12, v9

    .line 79
    .line 80
    mul-double v10, v10, v25

    .line 81
    .line 82
    aget-wide v25, v12, v16

    .line 83
    .line 84
    mul-double v17, v17, v25

    .line 85
    .line 86
    add-double v17, v17, v10

    .line 87
    .line 88
    aget-wide v10, v12, v14

    .line 89
    .line 90
    mul-double v21, v21, v10

    .line 91
    .line 92
    add-double v21, v21, v17

    .line 93
    .line 94
    neg-double v10, v1

    .line 95
    const-wide/high16 v12, 0x4045000000000000L    # 42.0

    .line 96
    .line 97
    sub-double/2addr v10, v12

    .line 98
    const-wide/high16 v12, 0x4057000000000000L    # 92.0

    .line 99
    .line 100
    div-double/2addr v10, v12

    .line 101
    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v10

    .line 105
    const-wide v12, 0x3fd1c71c71c71c72L    # 0.2777777777777778

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    mul-double/2addr v10, v12

    .line 111
    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    .line 112
    .line 113
    sub-double v10, v12, v10

    .line 114
    .line 115
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 116
    .line 117
    mul-double v10, v10, v36

    .line 118
    .line 119
    const-wide/16 v17, 0x0

    .line 120
    .line 121
    cmpg-double v15, v10, v17

    .line 122
    .line 123
    if-gez v15, :cond_0

    .line 124
    .line 125
    move-wide/from16 v10, v17

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    cmpl-double v15, v10, v12

    .line 129
    .line 130
    if-lez v15, :cond_1

    .line 131
    .line 132
    move-wide v10, v12

    .line 133
    :cond_1
    :goto_0
    div-double v17, v3, v23

    .line 134
    .line 135
    mul-double v17, v17, v10

    .line 136
    .line 137
    add-double v17, v17, v12

    .line 138
    .line 139
    sub-double v17, v17, v10

    .line 140
    .line 141
    div-double v25, v3, v19

    .line 142
    .line 143
    mul-double v25, v25, v10

    .line 144
    .line 145
    add-double v25, v25, v12

    .line 146
    .line 147
    sub-double v25, v25, v10

    .line 148
    .line 149
    div-double v27, v3, v21

    .line 150
    .line 151
    mul-double v27, v27, v10

    .line 152
    .line 153
    add-double v27, v27, v12

    .line 154
    .line 155
    sub-double v27, v27, v10

    .line 156
    .line 157
    const/4 v10, 0x3

    .line 158
    new-array v11, v10, [D

    .line 159
    .line 160
    aput-wide v17, v11, v9

    .line 161
    .line 162
    aput-wide v25, v11, v16

    .line 163
    .line 164
    aput-wide v27, v11, v14

    .line 165
    .line 166
    const-wide/high16 v17, 0x4014000000000000L    # 5.0

    .line 167
    .line 168
    mul-double v17, v17, v1

    .line 169
    .line 170
    add-double v25, v17, v12

    .line 171
    .line 172
    div-double v25, v12, v25

    .line 173
    .line 174
    mul-double v27, v25, v25

    .line 175
    .line 176
    mul-double v27, v27, v25

    .line 177
    .line 178
    mul-double v27, v27, v25

    .line 179
    .line 180
    sub-double v12, v12, v27

    .line 181
    .line 182
    mul-double v27, v27, v1

    .line 183
    .line 184
    mul-double/2addr v5, v12

    .line 185
    mul-double/2addr v5, v12

    .line 186
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->cbrt(D)D

    .line 187
    .line 188
    .line 189
    move-result-wide v1

    .line 190
    mul-double/2addr v1, v5

    .line 191
    add-double v1, v1, v27

    .line 192
    .line 193
    invoke-static {v7, v8}, Lh12;->R(D)D

    .line 194
    .line 195
    .line 196
    move-result-wide v5

    .line 197
    aget-wide v7, v0, v16

    .line 198
    .line 199
    div-double/2addr v5, v7

    .line 200
    const-wide v7, 0x3ff7ae147ae147aeL    # 1.48

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    invoke-static {v5, v6}, Ljava/lang/Math;->sqrt(D)D

    .line 206
    .line 207
    .line 208
    move-result-wide v12

    .line 209
    add-double v43, v12, v7

    .line 210
    .line 211
    const-wide v7, 0x3fc999999999999aL    # 0.2

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->pow(DD)D

    .line 217
    .line 218
    .line 219
    move-result-wide v7

    .line 220
    const-wide v12, 0x3fe7333333333333L    # 0.725

    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    div-double v30, v12, v7

    .line 226
    .line 227
    aget-wide v7, v11, v9

    .line 228
    .line 229
    mul-double/2addr v7, v1

    .line 230
    mul-double v7, v7, v23

    .line 231
    .line 232
    div-double/2addr v7, v3

    .line 233
    const-wide v12, 0x3fdae147ae147ae1L    # 0.42

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    invoke-static {v7, v8, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 239
    .line 240
    .line 241
    move-result-wide v7

    .line 242
    aget-wide v17, v11, v16

    .line 243
    .line 244
    mul-double v17, v17, v1

    .line 245
    .line 246
    mul-double v17, v17, v19

    .line 247
    .line 248
    move-wide/from16 v19, v3

    .line 249
    .line 250
    div-double v3, v17, v19

    .line 251
    .line 252
    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 253
    .line 254
    .line 255
    move-result-wide v3

    .line 256
    aget-wide v17, v11, v14

    .line 257
    .line 258
    mul-double v17, v17, v1

    .line 259
    .line 260
    mul-double v17, v17, v21

    .line 261
    .line 262
    move/from16 p0, v14

    .line 263
    .line 264
    div-double v14, v17, v19

    .line 265
    .line 266
    invoke-static {v14, v15, v12, v13}, Ljava/lang/Math;->pow(DD)D

    .line 267
    .line 268
    .line 269
    move-result-wide v12

    .line 270
    new-array v0, v10, [D

    .line 271
    .line 272
    aput-wide v7, v0, v9

    .line 273
    .line 274
    aput-wide v3, v0, v16

    .line 275
    .line 276
    aput-wide v12, v0, p0

    .line 277
    .line 278
    aget-wide v3, v0, v9

    .line 279
    .line 280
    const-wide/high16 v7, 0x4079000000000000L    # 400.0

    .line 281
    .line 282
    mul-double v12, v3, v7

    .line 283
    .line 284
    const-wide v14, 0x403b2147ae147ae1L    # 27.13

    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    add-double/2addr v3, v14

    .line 290
    div-double/2addr v12, v3

    .line 291
    aget-wide v3, v0, v16

    .line 292
    .line 293
    mul-double v17, v3, v7

    .line 294
    .line 295
    add-double/2addr v3, v14

    .line 296
    div-double v17, v17, v3

    .line 297
    .line 298
    aget-wide v3, v0, p0

    .line 299
    .line 300
    mul-double/2addr v7, v3

    .line 301
    add-double/2addr v3, v14

    .line 302
    div-double/2addr v7, v3

    .line 303
    new-array v0, v10, [D

    .line 304
    .line 305
    aput-wide v12, v0, v9

    .line 306
    .line 307
    aput-wide v17, v0, v16

    .line 308
    .line 309
    aput-wide v7, v0, p0

    .line 310
    .line 311
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 312
    .line 313
    aget-wide v7, v0, v9

    .line 314
    .line 315
    mul-double/2addr v7, v3

    .line 316
    aget-wide v3, v0, v16

    .line 317
    .line 318
    add-double/2addr v7, v3

    .line 319
    const-wide v3, 0x3fa999999999999aL    # 0.05

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    aget-wide v9, v0, p0

    .line 325
    .line 326
    mul-double/2addr v9, v3

    .line 327
    add-double/2addr v9, v7

    .line 328
    mul-double v28, v9, v30

    .line 329
    .line 330
    new-instance v25, Lh85;

    .line 331
    .line 332
    const-wide/high16 v3, 0x3fd0000000000000L    # 0.25

    .line 333
    .line 334
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 335
    .line 336
    .line 337
    move-result-wide v41

    .line 338
    const-wide v34, 0x3fe6147ae147ae14L    # 0.69

    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    move-wide/from16 v32, v30

    .line 344
    .line 345
    move-wide/from16 v39, v1

    .line 346
    .line 347
    move-wide/from16 v26, v5

    .line 348
    .line 349
    move-object/from16 v38, v11

    .line 350
    .line 351
    invoke-direct/range {v25 .. v44}, Lh85;-><init>(DDDDDD[DDDD)V

    .line 352
    .line 353
    .line 354
    return-object v25
.end method
