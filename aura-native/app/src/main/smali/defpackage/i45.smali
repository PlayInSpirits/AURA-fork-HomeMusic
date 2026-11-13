.class public abstract Ldefpackage/i45;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 24

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    new-array v2, v0, [F

    .line 5
    .line 6
    new-array v3, v0, [F

    .line 7
    .line 8
    filled-new-array {v2, v3}, [[F

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aget v1, v1, v3

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    const/4 v5, 0x4

    .line 17
    const/4 v6, 0x3

    .line 18
    const/4 v7, 0x1

    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    if-eq v1, v7, :cond_0

    .line 22
    .line 23
    if-eq v1, v0, :cond_3

    .line 24
    .line 25
    if-eq v1, v6, :cond_3

    .line 26
    .line 27
    if-eq v1, v5, :cond_2

    .line 28
    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    :cond_0
    move v1, v7

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v1, v4

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    move v1, v5

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    move v1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_4
    move v1, v6

    .line 40
    :goto_0
    aget-object v8, v2, v3

    .line 41
    .line 42
    aget-object v2, v2, v7

    .line 43
    .line 44
    array-length v9, v8

    .line 45
    div-int/2addr v9, v0

    .line 46
    array-length v10, v8

    .line 47
    rem-int/2addr v10, v0

    .line 48
    add-int/2addr v10, v9

    .line 49
    new-array v0, v10, [Ldefpackage/pa;

    .line 50
    .line 51
    move v9, v3

    .line 52
    :goto_1
    if-ge v9, v10, :cond_d

    .line 53
    .line 54
    mul-int/lit8 v11, v9, 0x2

    .line 55
    .line 56
    new-instance v12, Ldefpackage/pa;

    .line 57
    .line 58
    aget v13, v8, v11

    .line 59
    .line 60
    add-int/lit8 v14, v11, 0x1

    .line 61
    .line 62
    aget v15, v8, v14

    .line 63
    .line 64
    aget v11, v2, v11

    .line 65
    .line 66
    aget v14, v2, v14

    .line 67
    .line 68
    const/16 v3, 0x9

    .line 69
    .line 70
    invoke-direct {v12, v3}, Ldefpackage/pa;-><init>(I)V

    .line 71
    .line 72
    .line 73
    sub-float/2addr v11, v13

    .line 74
    sub-float v3, v14, v15

    .line 75
    .line 76
    const/16 v13, 0x65

    .line 77
    .line 78
    new-array v4, v13, [F

    .line 79
    .line 80
    if-ne v1, v6, :cond_6

    .line 81
    .line 82
    :cond_5
    :goto_2
    move-object/from16 v23, v0

    .line 83
    .line 84
    move/from16 v19, v1

    .line 85
    .line 86
    move/from16 v20, v7

    .line 87
    .line 88
    const/4 v7, 0x0

    .line 89
    goto/16 :goto_7

    .line 90
    .line 91
    :cond_6
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    .line 92
    .line 93
    .line 94
    move-result v16

    .line 95
    const v17, 0x3a83126f    # 0.001f

    .line 96
    .line 97
    .line 98
    cmpg-float v16, v16, v17

    .line 99
    .line 100
    if-ltz v16, :cond_5

    .line 101
    .line 102
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 103
    .line 104
    .line 105
    move-result v16

    .line 106
    cmpg-float v16, v16, v17

    .line 107
    .line 108
    if-gez v16, :cond_7

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_7
    sub-float/2addr v15, v14

    .line 112
    sget-object v3, Ldefpackage/au0;->v:[F

    .line 113
    .line 114
    move v5, v7

    .line 115
    move/from16 v20, v5

    .line 116
    .line 117
    move/from16 v19, v15

    .line 118
    .line 119
    const/16 v17, 0x0

    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    :goto_3
    int-to-double v6, v5

    .line 124
    const-wide v21, 0x4056800000000000L    # 90.0

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    mul-double v6, v6, v21

    .line 130
    .line 131
    div-double v6, v6, v21

    .line 132
    .line 133
    const-wide v21, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    mul-double v6, v6, v21

    .line 139
    .line 140
    double-to-float v6, v6

    .line 141
    float-to-double v6, v6

    .line 142
    move/from16 v21, v15

    .line 143
    .line 144
    const/16 v22, 0x0

    .line 145
    .line 146
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 147
    .line 148
    .line 149
    move-result-wide v14

    .line 150
    double-to-float v14, v14

    .line 151
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    double-to-float v6, v6

    .line 156
    mul-float/2addr v14, v11

    .line 157
    mul-float v15, v21, v6

    .line 158
    .line 159
    sub-float v6, v14, v18

    .line 160
    .line 161
    float-to-double v6, v6

    .line 162
    sub-float v13, v15, v19

    .line 163
    .line 164
    move-object/from16 v23, v0

    .line 165
    .line 166
    move/from16 v19, v1

    .line 167
    .line 168
    float-to-double v0, v13

    .line 169
    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    .line 170
    .line 171
    .line 172
    move-result-wide v0

    .line 173
    double-to-float v0, v0

    .line 174
    add-float v17, v17, v0

    .line 175
    .line 176
    aput v17, v3, v5

    .line 177
    .line 178
    const/16 v0, 0x5a

    .line 179
    .line 180
    if-eq v5, v0, :cond_8

    .line 181
    .line 182
    add-int/lit8 v5, v5, 0x1

    .line 183
    .line 184
    move/from16 v18, v14

    .line 185
    .line 186
    move/from16 v1, v19

    .line 187
    .line 188
    move-object/from16 v0, v23

    .line 189
    .line 190
    const/16 v13, 0x65

    .line 191
    .line 192
    move/from16 v19, v15

    .line 193
    .line 194
    move/from16 v15, v21

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_8
    move/from16 v1, v20

    .line 198
    .line 199
    :goto_4
    aget v5, v3, v1

    .line 200
    .line 201
    div-float v5, v5, v17

    .line 202
    .line 203
    aput v5, v3, v1

    .line 204
    .line 205
    if-eq v1, v0, :cond_9

    .line 206
    .line 207
    add-int/lit8 v1, v1, 0x1

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_9
    const/4 v0, 0x0

    .line 211
    const/16 v1, 0x65

    .line 212
    .line 213
    :goto_5
    if-ge v0, v1, :cond_c

    .line 214
    .line 215
    int-to-float v5, v0

    .line 216
    const/high16 v6, 0x42c80000    # 100.0f

    .line 217
    .line 218
    div-float/2addr v5, v6

    .line 219
    const/16 v6, 0x5b

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    invoke-static {v3, v7, v6, v5}, Ljava/util/Arrays;->binarySearch([FIIF)I

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    const/high16 v11, 0x42b40000    # 90.0f

    .line 227
    .line 228
    if-ltz v6, :cond_a

    .line 229
    .line 230
    int-to-float v5, v6

    .line 231
    div-float/2addr v5, v11

    .line 232
    aput v5, v4, v0

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_a
    const/4 v13, -0x1

    .line 236
    if-ne v6, v13, :cond_b

    .line 237
    .line 238
    aput v22, v4, v0

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_b
    neg-int v6, v6

    .line 242
    add-int/lit8 v13, v6, -0x2

    .line 243
    .line 244
    add-int/lit8 v6, v6, -0x1

    .line 245
    .line 246
    int-to-float v14, v13

    .line 247
    aget v13, v3, v13

    .line 248
    .line 249
    sub-float/2addr v5, v13

    .line 250
    aget v6, v3, v6

    .line 251
    .line 252
    sub-float/2addr v6, v13

    .line 253
    div-float/2addr v5, v6

    .line 254
    add-float/2addr v5, v14

    .line 255
    div-float/2addr v5, v11

    .line 256
    aput v5, v4, v0

    .line 257
    .line 258
    :goto_6
    add-int/lit8 v0, v0, 0x1

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_c
    const/4 v7, 0x0

    .line 262
    goto :goto_8

    .line 263
    :goto_7
    float-to-double v0, v3

    .line 264
    float-to-double v3, v11

    .line 265
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->hypot(DD)D

    .line 266
    .line 267
    .line 268
    :goto_8
    aput-object v12, v23, v9

    .line 269
    .line 270
    add-int/lit8 v9, v9, 0x1

    .line 271
    .line 272
    move v3, v7

    .line 273
    move/from16 v1, v19

    .line 274
    .line 275
    move/from16 v7, v20

    .line 276
    .line 277
    move-object/from16 v0, v23

    .line 278
    .line 279
    const/4 v4, 0x5

    .line 280
    const/4 v5, 0x4

    .line 281
    const/4 v6, 0x3

    .line 282
    goto/16 :goto_1

    .line 283
    .line 284
    :cond_d
    return-void
.end method
