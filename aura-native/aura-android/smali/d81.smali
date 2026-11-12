.class public final Ld81;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lc81;


# instance fields
.field public final a:F

.field public final b:Lbk4;


# direct methods
.method public synthetic constructor <init>(F)V
    .locals 1

    const v0, 0x3c23d70a    # 0.01f

    .line 45
    invoke-direct {p0, p1, v0}, Ld81;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Ld81;->a:F

    .line 5
    .line 6
    new-instance p2, Lbk4;

    .line 7
    .line 8
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v0, p2, Lbk4;->a:F

    .line 14
    .line 15
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p2, Lbk4;->b:D

    .line 22
    .line 23
    mul-double/2addr v0, v0

    .line 24
    double-to-float v0, v0

    .line 25
    const/4 v1, 0x0

    .line 26
    cmpg-float v0, v0, v1

    .line 27
    .line 28
    if-gtz v0, :cond_0

    .line 29
    .line 30
    const-string v0, "Spring stiffness constant must be positive."

    .line 31
    .line 32
    invoke-static {v0}, Lqo3;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    float-to-double v0, p1

    .line 36
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p2, Lbk4;->b:D

    .line 41
    .line 42
    iput-object p2, p0, Ld81;->b:Lbk4;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final b(JFFF)F
    .locals 2

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    iget-object p0, p0, Ld81;->b:Lbk4;

    .line 6
    .line 7
    iput p4, p0, Lbk4;->a:F

    .line 8
    .line 9
    invoke-virtual {p0, p3, p5, p1, p2}, Lbk4;->a(FFJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    const-wide p2, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p0, p2

    .line 19
    long-to-int p0, p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public final c(FFF)J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ld81;->b:Lbk4;

    .line 4
    .line 5
    iget-wide v1, v1, Lbk4;->b:D

    .line 6
    .line 7
    mul-double/2addr v1, v1

    .line 8
    double-to-float v1, v1

    .line 9
    sub-float v2, p1, p2

    .line 10
    .line 11
    iget v0, v0, Ld81;->a:F

    .line 12
    .line 13
    div-float/2addr v2, v0

    .line 14
    div-float v0, p3, v0

    .line 15
    .line 16
    float-to-double v3, v1

    .line 17
    float-to-double v0, v0

    .line 18
    float-to-double v5, v2

    .line 19
    invoke-static {v3, v4}, Ljava/lang/Math;->sqrt(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 24
    .line 25
    mul-double/2addr v7, v9

    .line 26
    mul-double v11, v7, v7

    .line 27
    .line 28
    const-wide/high16 v13, 0x4010000000000000L    # 4.0

    .line 29
    .line 30
    mul-double/2addr v3, v13

    .line 31
    sub-double/2addr v11, v3

    .line 32
    const-wide/16 v2, 0x0

    .line 33
    .line 34
    cmpg-double v4, v11, v2

    .line 35
    .line 36
    if-gez v4, :cond_0

    .line 37
    .line 38
    move-wide v13, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide v13

    .line 44
    :goto_0
    if-gez v4, :cond_1

    .line 45
    .line 46
    invoke-static {v11, v12}, Ljava/lang/Math;->abs(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    invoke-static {v11, v12}, Ljava/lang/Math;->sqrt(D)D

    .line 51
    .line 52
    .line 53
    :cond_1
    neg-double v7, v7

    .line 54
    add-double/2addr v7, v13

    .line 55
    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    .line 56
    .line 57
    mul-double/2addr v7, v11

    .line 58
    cmpg-double v4, v5, v2

    .line 59
    .line 60
    if-nez v4, :cond_2

    .line 61
    .line 62
    cmpg-double v11, v0, v2

    .line 63
    .line 64
    if-nez v11, :cond_2

    .line 65
    .line 66
    const-wide/16 v0, 0x0

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_2
    if-gez v4, :cond_3

    .line 71
    .line 72
    neg-double v0, v0

    .line 73
    :cond_3
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide v4

    .line 77
    mul-double v11, v7, v4

    .line 78
    .line 79
    sub-double/2addr v0, v11

    .line 80
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 81
    .line 82
    div-double v15, v13, v4

    .line 83
    .line 84
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 85
    .line 86
    .line 87
    move-result-wide v15

    .line 88
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->log(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v15

    .line 92
    move-wide/from16 p0, v2

    .line 93
    .line 94
    div-double v2, v15, v7

    .line 95
    .line 96
    div-double v15, v13, v0

    .line 97
    .line 98
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 99
    .line 100
    .line 101
    move-result-wide v15

    .line 102
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->log(D)D

    .line 103
    .line 104
    .line 105
    move-result-wide v15

    .line 106
    move-wide/from16 v19, v9

    .line 107
    .line 108
    move-wide/from16 v17, v15

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    :goto_1
    const/4 v9, 0x6

    .line 112
    if-ge v6, v9, :cond_4

    .line 113
    .line 114
    div-double v17, v17, v7

    .line 115
    .line 116
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 117
    .line 118
    .line 119
    move-result-wide v9

    .line 120
    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    .line 121
    .line 122
    .line 123
    move-result-wide v9

    .line 124
    sub-double v17, v15, v9

    .line 125
    .line 126
    add-int/lit8 v6, v6, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    div-double v9, v17, v7

    .line 130
    .line 131
    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 132
    .line 133
    .line 134
    move-result-wide v15

    .line 135
    const-wide v17, 0x7fffffffffffffffL

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    and-long v15, v15, v17

    .line 141
    .line 142
    const-wide/high16 v21, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 143
    .line 144
    cmp-long v6, v15, v21

    .line 145
    .line 146
    if-gez v6, :cond_5

    .line 147
    .line 148
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 149
    .line 150
    .line 151
    move-result-wide v15

    .line 152
    and-long v15, v15, v17

    .line 153
    .line 154
    cmp-long v6, v15, v21

    .line 155
    .line 156
    if-gez v6, :cond_6

    .line 157
    .line 158
    invoke-static {v2, v3, v9, v10}, Ljava/lang/Math;->max(DD)D

    .line 159
    .line 160
    .line 161
    move-result-wide v2

    .line 162
    goto :goto_2

    .line 163
    :cond_5
    move-wide v2, v9

    .line 164
    :cond_6
    :goto_2
    add-double v9, v11, v0

    .line 165
    .line 166
    neg-double v9, v9

    .line 167
    mul-double v15, v7, v0

    .line 168
    .line 169
    div-double/2addr v9, v15

    .line 170
    mul-double v15, v7, v9

    .line 171
    .line 172
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->exp(D)D

    .line 173
    .line 174
    .line 175
    move-result-wide v17

    .line 176
    mul-double v17, v17, v4

    .line 177
    .line 178
    mul-double v21, v0, v9

    .line 179
    .line 180
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->exp(D)D

    .line 181
    .line 182
    .line 183
    move-result-wide v15

    .line 184
    mul-double v15, v15, v21

    .line 185
    .line 186
    move-wide/from16 v21, v13

    .line 187
    .line 188
    add-double v13, v15, v17

    .line 189
    .line 190
    invoke-static {v9, v10}, Ljava/lang/Double;->isNaN(D)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    const-wide/high16 v15, -0x4010000000000000L    # -1.0

    .line 195
    .line 196
    if-nez v6, :cond_9

    .line 197
    .line 198
    cmpg-double v6, v9, p0

    .line 199
    .line 200
    if-gtz v6, :cond_7

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_7
    cmpl-double v6, v9, p0

    .line 204
    .line 205
    if-lez v6, :cond_8

    .line 206
    .line 207
    neg-double v9, v13

    .line 208
    cmpg-double v6, v9, v21

    .line 209
    .line 210
    if-gez v6, :cond_8

    .line 211
    .line 212
    cmpg-double v6, v0, p0

    .line 213
    .line 214
    if-gez v6, :cond_9

    .line 215
    .line 216
    cmpl-double v6, v4, p0

    .line 217
    .line 218
    if-lez v6, :cond_9

    .line 219
    .line 220
    move-wide/from16 v2, p0

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_8
    div-double v9, v19, v7

    .line 224
    .line 225
    neg-double v2, v9

    .line 226
    div-double v9, v4, v0

    .line 227
    .line 228
    sub-double/2addr v2, v9

    .line 229
    move-wide/from16 v15, v21

    .line 230
    .line 231
    :cond_9
    :goto_3
    const-wide v9, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    const/4 v6, 0x0

    .line 237
    :goto_4
    const-wide v13, 0x3f50624dd2f1a9fcL    # 0.001

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    cmpl-double v9, v9, v13

    .line 243
    .line 244
    if-lez v9, :cond_a

    .line 245
    .line 246
    const/16 v9, 0x64

    .line 247
    .line 248
    if-ge v6, v9, :cond_a

    .line 249
    .line 250
    add-int/lit8 v6, v6, 0x1

    .line 251
    .line 252
    mul-double v9, v0, v2

    .line 253
    .line 254
    add-double/2addr v9, v4

    .line 255
    mul-double v13, v7, v2

    .line 256
    .line 257
    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    .line 258
    .line 259
    .line 260
    move-result-wide v17

    .line 261
    mul-double v17, v17, v9

    .line 262
    .line 263
    add-double v17, v17, v15

    .line 264
    .line 265
    add-double v9, v13, v21

    .line 266
    .line 267
    mul-double/2addr v9, v0

    .line 268
    add-double/2addr v9, v11

    .line 269
    invoke-static {v13, v14}, Ljava/lang/Math;->exp(D)D

    .line 270
    .line 271
    .line 272
    move-result-wide v13

    .line 273
    mul-double/2addr v13, v9

    .line 274
    div-double v17, v17, v13

    .line 275
    .line 276
    sub-double v9, v2, v17

    .line 277
    .line 278
    sub-double/2addr v2, v9

    .line 279
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    .line 280
    .line 281
    .line 282
    move-result-wide v2

    .line 283
    move-wide/from16 v23, v9

    .line 284
    .line 285
    move-wide v9, v2

    .line 286
    move-wide/from16 v2, v23

    .line 287
    .line 288
    goto :goto_4

    .line 289
    :cond_a
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    mul-double/2addr v2, v0

    .line 295
    double-to-long v0, v2

    .line 296
    :goto_5
    const-wide/32 v2, 0xf4240

    .line 297
    .line 298
    .line 299
    mul-long/2addr v0, v2

    .line 300
    return-wide v0
.end method

.method public final d(FFF)F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(JFFF)F
    .locals 2

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    iget-object p0, p0, Ld81;->b:Lbk4;

    .line 6
    .line 7
    iput p4, p0, Lbk4;->a:F

    .line 8
    .line 9
    invoke-virtual {p0, p3, p5, p1, p2}, Lbk4;->a(FFJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    const/16 p2, 0x20

    .line 14
    .line 15
    shr-long/2addr p0, p2

    .line 16
    long-to-int p0, p0

    .line 17
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method
