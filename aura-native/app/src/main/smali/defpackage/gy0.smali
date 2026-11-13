.class public final Ldefpackage/gy0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/util/function/Function;

.field public final b:Ljava/util/function/Function;

.field public final c:Ljava/util/function/Function;

.field public final d:Ljava/util/function/Function;

.field public final e:Ljava/util/function/Function;

.field public final f:Ljava/util/function/Function;

.field public final g:Ljava/util/function/Function;

.field public final h:Ljava/util/function/Function;

.field public final i:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ldefpackage/zh2;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/gy0;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/gy0;->a:Ljava/util/function/Function;

    .line 12
    .line 13
    iput-object p2, p0, Ldefpackage/gy0;->b:Ljava/util/function/Function;

    .line 14
    .line 15
    iput-object p3, p0, Ldefpackage/gy0;->c:Ljava/util/function/Function;

    .line 16
    .line 17
    iput-object p4, p0, Ldefpackage/gy0;->d:Ljava/util/function/Function;

    .line 18
    .line 19
    iput-object p5, p0, Ldefpackage/gy0;->e:Ljava/util/function/Function;

    .line 20
    .line 21
    iput-object p6, p0, Ldefpackage/gy0;->f:Ljava/util/function/Function;

    .line 22
    .line 23
    iput-object p7, p0, Ldefpackage/gy0;->g:Ljava/util/function/Function;

    .line 24
    .line 25
    iput-object p8, p0, Ldefpackage/gy0;->h:Ljava/util/function/Function;

    .line 26
    .line 27
    return-void
.end method

.method public static a(Ldefpackage/d64;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;Ldefpackage/dy0;Ljava/util/function/Function;)D
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    move-object/from16 v5, p1

    .line 12
    .line 13
    invoke-interface {v5, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    check-cast v5, Ljava/lang/Double;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 20
    .line 21
    .line 22
    move-result-wide v7

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {v2, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ldefpackage/gy0;

    .line 32
    .line 33
    :goto_0
    if-nez v2, :cond_1

    .line 34
    .line 35
    return-wide v7

    .line 36
    :cond_1
    iget-object v9, v2, Ldefpackage/gy0;->c:Ljava/util/function/Function;

    .line 37
    .line 38
    invoke-interface {v9, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    check-cast v9, Ljava/lang/Double;

    .line 43
    .line 44
    invoke-virtual {v9}, Ljava/lang/Double;->doubleValue()D

    .line 45
    .line 46
    .line 47
    move-result-wide v9

    .line 48
    invoke-static {v7, v8, v9, v10}, Ldefpackage/ji2;->D(DD)D

    .line 49
    .line 50
    .line 51
    move-result-wide v9

    .line 52
    invoke-interface {v1, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    check-cast v11, Ljava/lang/Double;

    .line 57
    .line 58
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 59
    .line 60
    .line 61
    move-result-wide v12

    .line 62
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    move-object/from16 v15, p3

    .line 67
    .line 68
    invoke-interface {v15, v14, v11}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v11

    .line 72
    check-cast v11, Ljava/lang/Double;

    .line 73
    .line 74
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 75
    .line 76
    .line 77
    move-result-wide v14

    .line 78
    invoke-static {v12, v13, v14, v15}, Ldefpackage/ji2;->D(DD)D

    .line 79
    .line 80
    .line 81
    move-result-wide v16

    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    iget-wide v5, v4, Ldefpackage/dy0;->b:D

    .line 88
    .line 89
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 94
    .line 95
    .line 96
    move-result-wide v18

    .line 97
    :goto_1
    const-wide/high16 v4, 0x4035000000000000L    # 21.0

    .line 98
    .line 99
    if-nez p7, :cond_3

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_3
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    move-object/from16 v11, p7

    .line 107
    .line 108
    invoke-interface {v11, v6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    if-nez v6, :cond_4

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-interface {v11, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    check-cast v4, Ljava/lang/Double;

    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 126
    .line 127
    .line 128
    move-result-wide v4

    .line 129
    :goto_2
    cmpg-double v6, v16, v18

    .line 130
    .line 131
    if-gez v6, :cond_5

    .line 132
    .line 133
    move-wide/from16 v4, v18

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    cmpl-double v6, v16, v4

    .line 137
    .line 138
    if-lez v6, :cond_6

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    move-wide/from16 v4, v16

    .line 142
    .line 143
    :goto_3
    cmpl-double v6, v4, v16

    .line 144
    .line 145
    if-nez v6, :cond_7

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_7
    invoke-static {v12, v13, v4, v5}, Ldefpackage/gy0;->b(DD)D

    .line 149
    .line 150
    .line 151
    move-result-wide v14

    .line 152
    :goto_4
    iget-object v2, v2, Ldefpackage/gy0;->e:Ljava/util/function/Function;

    .line 153
    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    invoke-interface {v2, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-nez v2, :cond_a

    .line 161
    .line 162
    :cond_8
    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    const-wide/16 v9, 0x3c

    .line 167
    .line 168
    cmp-long v2, v4, v9

    .line 169
    .line 170
    if-gez v2, :cond_a

    .line 171
    .line 172
    invoke-static {v14, v15}, Ljava/lang/Math;->round(D)J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    const-wide/16 v9, 0x31

    .line 177
    .line 178
    cmp-long v2, v4, v9

    .line 179
    .line 180
    if-gtz v2, :cond_9

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_9
    const-wide v14, 0x4048800000000000L    # 49.0

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    :cond_a
    :goto_5
    if-nez v3, :cond_b

    .line 189
    .line 190
    const/4 v5, 0x0

    .line 191
    goto :goto_6

    .line 192
    :cond_b
    invoke-interface {v3, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    move-object v5, v2

    .line 197
    check-cast v5, Ldefpackage/uu4;

    .line 198
    .line 199
    :goto_6
    if-nez v5, :cond_c

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_c
    iget-object v2, v5, Ldefpackage/uu4;->a:Ldefpackage/gy0;

    .line 203
    .line 204
    invoke-interface {v1, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    check-cast v1, Ljava/lang/Double;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 211
    .line 212
    .line 213
    move-result-wide v3

    .line 214
    sub-double v9, v14, v3

    .line 215
    .line 216
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    .line 217
    .line 218
    .line 219
    move-result-wide v9

    .line 220
    const-wide/high16 v11, 0x402e000000000000L    # 15.0

    .line 221
    .line 222
    cmpl-double v1, v9, v11

    .line 223
    .line 224
    if-ltz v1, :cond_d

    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_d
    iget v1, v5, Ldefpackage/uu4;->b:I

    .line 228
    .line 229
    invoke-static {v1}, Ldefpackage/xa3;->w(I)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    const-wide/16 v5, 0x0

    .line 234
    .line 235
    const-wide/high16 v16, 0x4059000000000000L    # 100.0

    .line 236
    .line 237
    if-eqz v1, :cond_15

    .line 238
    .line 239
    const/4 v13, 0x1

    .line 240
    if-eq v1, v13, :cond_12

    .line 241
    .line 242
    const/4 v3, 0x2

    .line 243
    if-eq v1, v3, :cond_e

    .line 244
    .line 245
    :goto_7
    return-wide v14

    .line 246
    :cond_e
    iget-object v1, v2, Ldefpackage/gy0;->c:Ljava/util/function/Function;

    .line 247
    .line 248
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, Ljava/lang/Double;

    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 255
    .line 256
    .line 257
    move-result-wide v0

    .line 258
    cmpl-double v0, v7, v0

    .line 259
    .line 260
    if-lez v0, :cond_f

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_f
    const/4 v13, 0x0

    .line 264
    :goto_8
    sub-double/2addr v9, v11

    .line 265
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    .line 266
    .line 267
    .line 268
    move-result-wide v0

    .line 269
    if-eqz v13, :cond_10

    .line 270
    .line 271
    add-double v2, v14, v0

    .line 272
    .line 273
    cmpg-double v2, v2, v16

    .line 274
    .line 275
    if-gtz v2, :cond_11

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_10
    cmpg-double v2, v14, v0

    .line 279
    .line 280
    if-gez v2, :cond_11

    .line 281
    .line 282
    :goto_9
    add-double/2addr v14, v0

    .line 283
    return-wide v14

    .line 284
    :cond_11
    sub-double/2addr v14, v0

    .line 285
    return-wide v14

    .line 286
    :cond_12
    sub-double/2addr v3, v11

    .line 287
    cmpg-double v0, v3, v5

    .line 288
    .line 289
    if-gez v0, :cond_13

    .line 290
    .line 291
    return-wide v5

    .line 292
    :cond_13
    cmpl-double v0, v3, v16

    .line 293
    .line 294
    if-lez v0, :cond_14

    .line 295
    .line 296
    return-wide v16

    .line 297
    :cond_14
    return-wide v3

    .line 298
    :cond_15
    add-double/2addr v3, v11

    .line 299
    cmpg-double v0, v3, v5

    .line 300
    .line 301
    if-gez v0, :cond_16

    .line 302
    .line 303
    return-wide v5

    .line 304
    :cond_16
    cmpl-double v0, v3, v16

    .line 305
    .line 306
    if-lez v0, :cond_17

    .line 307
    .line 308
    return-wide v16

    .line 309
    :cond_17
    return-wide v3
.end method

.method public static b(DD)D
    .locals 25

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmpg-double v4, v0, v2

    .line 6
    .line 7
    const-wide v9, 0x3fd999999999999aL    # 0.4

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide v11, 0x3fa47ae147ae147bL    # 0.04

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const-wide/high16 v13, 0x4014000000000000L    # 5.0

    .line 18
    .line 19
    const-wide/high16 v15, 0x4059000000000000L    # 100.0

    .line 20
    .line 21
    const-wide/high16 v17, -0x4010000000000000L    # -1.0

    .line 22
    .line 23
    if-ltz v4, :cond_0

    .line 24
    .line 25
    cmpl-double v19, v0, v15

    .line 26
    .line 27
    if-lez v19, :cond_1

    .line 28
    .line 29
    :cond_0
    const-wide/high16 v19, 0x4030000000000000L    # 16.0

    .line 30
    .line 31
    const-wide/high16 v23, 0x405d000000000000L    # 116.0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-wide/high16 v19, 0x4030000000000000L    # 16.0

    .line 35
    .line 36
    invoke-static {v0, v1}, Ldefpackage/h12;->R(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    add-double v21, v5, v13

    .line 41
    .line 42
    mul-double v21, v21, p2

    .line 43
    .line 44
    const-wide/high16 v23, 0x405d000000000000L    # 116.0

    .line 45
    .line 46
    sub-double v7, v21, v13

    .line 47
    .line 48
    cmpg-double v21, v7, v2

    .line 49
    .line 50
    if-ltz v21, :cond_3

    .line 51
    .line 52
    cmpl-double v21, v7, v15

    .line 53
    .line 54
    if-lez v21, :cond_2

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-static {v7, v8, v5, v6}, Ldefpackage/ji2;->E(DD)D

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    sub-double v21, v5, p2

    .line 62
    .line 63
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->abs(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v21

    .line 67
    cmpg-double v5, v5, p2

    .line 68
    .line 69
    if-gez v5, :cond_4

    .line 70
    .line 71
    cmpl-double v5, v21, v11

    .line 72
    .line 73
    if-lez v5, :cond_4

    .line 74
    .line 75
    :cond_3
    :goto_0
    move-wide/from16 v5, v17

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    div-double/2addr v7, v15

    .line 79
    invoke-static {v7, v8}, Ldefpackage/h12;->B(D)D

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    mul-double v5, v5, v23

    .line 84
    .line 85
    sub-double v5, v5, v19

    .line 86
    .line 87
    add-double/2addr v5, v9

    .line 88
    cmpg-double v7, v5, v2

    .line 89
    .line 90
    if-ltz v7, :cond_3

    .line 91
    .line 92
    cmpl-double v7, v5, v15

    .line 93
    .line 94
    if-lez v7, :cond_5

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    :goto_1
    cmpg-double v7, v5, v2

    .line 98
    .line 99
    if-gez v7, :cond_6

    .line 100
    .line 101
    move-wide v5, v15

    .line 102
    :cond_6
    if-ltz v4, :cond_9

    .line 103
    .line 104
    cmpl-double v4, v0, v15

    .line 105
    .line 106
    if-lez v4, :cond_7

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_7
    invoke-static {v0, v1}, Ldefpackage/h12;->R(D)D

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    add-double v21, v7, v13

    .line 114
    .line 115
    div-double v21, v21, p2

    .line 116
    .line 117
    sub-double v13, v21, v13

    .line 118
    .line 119
    cmpg-double v4, v13, v2

    .line 120
    .line 121
    if-ltz v4, :cond_9

    .line 122
    .line 123
    cmpl-double v4, v13, v15

    .line 124
    .line 125
    if-lez v4, :cond_8

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_8
    invoke-static {v7, v8, v13, v14}, Ldefpackage/ji2;->E(DD)D

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    sub-double v21, v7, p2

    .line 133
    .line 134
    invoke-static/range {v21 .. v22}, Ljava/lang/Math;->abs(D)D

    .line 135
    .line 136
    .line 137
    move-result-wide v21

    .line 138
    cmpg-double v4, v7, p2

    .line 139
    .line 140
    if-gez v4, :cond_a

    .line 141
    .line 142
    cmpl-double v4, v21, v11

    .line 143
    .line 144
    if-lez v4, :cond_a

    .line 145
    .line 146
    :cond_9
    :goto_2
    move-wide/from16 v7, v17

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_a
    div-double/2addr v13, v15

    .line 150
    invoke-static {v13, v14}, Ldefpackage/h12;->B(D)D

    .line 151
    .line 152
    .line 153
    move-result-wide v7

    .line 154
    mul-double v7, v7, v23

    .line 155
    .line 156
    sub-double v7, v7, v19

    .line 157
    .line 158
    sub-double/2addr v7, v9

    .line 159
    cmpg-double v4, v7, v2

    .line 160
    .line 161
    if-ltz v4, :cond_9

    .line 162
    .line 163
    cmpl-double v4, v7, v15

    .line 164
    .line 165
    if-lez v4, :cond_b

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_b
    :goto_3
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->max(DD)D

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-static {v5, v6, v0, v1}, Ldefpackage/ji2;->D(DD)D

    .line 173
    .line 174
    .line 175
    move-result-wide v7

    .line 176
    invoke-static {v2, v3, v0, v1}, Ldefpackage/ji2;->D(DD)D

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 181
    .line 182
    .line 183
    move-result-wide v0

    .line 184
    const-wide/16 v11, 0x3c

    .line 185
    .line 186
    cmp-long v0, v0, v11

    .line 187
    .line 188
    if-gez v0, :cond_d

    .line 189
    .line 190
    sub-double v0, v7, v9

    .line 191
    .line 192
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 193
    .line 194
    .line 195
    move-result-wide v0

    .line 196
    const-wide v11, 0x3fb999999999999aL    # 0.1

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    cmpg-double v0, v0, v11

    .line 202
    .line 203
    if-gez v0, :cond_c

    .line 204
    .line 205
    cmpg-double v0, v7, p2

    .line 206
    .line 207
    if-gez v0, :cond_c

    .line 208
    .line 209
    cmpg-double v0, v9, p2

    .line 210
    .line 211
    if-gez v0, :cond_c

    .line 212
    .line 213
    const/4 v0, 0x1

    .line 214
    goto :goto_4

    .line 215
    :cond_c
    const/4 v0, 0x0

    .line 216
    :goto_4
    cmpl-double v1, v7, p2

    .line 217
    .line 218
    if-gez v1, :cond_e

    .line 219
    .line 220
    cmpl-double v1, v7, v9

    .line 221
    .line 222
    if-gez v1, :cond_e

    .line 223
    .line 224
    if-eqz v0, :cond_f

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_d
    cmpl-double v0, v9, p2

    .line 228
    .line 229
    if-gez v0, :cond_f

    .line 230
    .line 231
    cmpl-double v0, v9, v7

    .line 232
    .line 233
    if-ltz v0, :cond_e

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_e
    :goto_5
    return-wide v5

    .line 237
    :cond_f
    :goto_6
    return-wide v2
.end method

.method public static c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Ldefpackage/gy0;
    .locals 9

    .line 1
    new-instance v0, Ldefpackage/gy0;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/ey0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, v2}, Ldefpackage/ey0;-><init>(Ljava/util/function/Function;I)V

    .line 7
    .line 8
    .line 9
    move v3, v2

    .line 10
    new-instance v2, Ldefpackage/ey0;

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    invoke-direct {v2, p0, v4}, Ldefpackage/ey0;-><init>(Ljava/util/function/Function;I)V

    .line 14
    .line 15
    .line 16
    new-instance v6, Ldefpackage/fy0;

    .line 17
    .line 18
    invoke-direct {v6, p1, p2, p3, v3}, Ldefpackage/fy0;-><init>(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;I)V

    .line 19
    .line 20
    .line 21
    new-instance v7, Ldefpackage/fy0;

    .line 22
    .line 23
    invoke-direct {v7, p1, p2, p3, v4}, Ldefpackage/fy0;-><init>(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;I)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move-object v3, p1

    .line 28
    move-object v5, p2

    .line 29
    move-object v8, p3

    .line 30
    invoke-direct/range {v0 .. v8}, Ldefpackage/gy0;-><init>(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ldefpackage/zh2;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method


# virtual methods
.method public final d(Ldefpackage/d64;)D
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/gy0;->c:Ljava/util/function/Function;

    .line 6
    .line 7
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Ljava/lang/Double;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    iget-wide v5, v1, Ldefpackage/d64;->d:D

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    cmpg-double v9, v5, v7

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x1

    .line 25
    if-gez v9, :cond_0

    .line 26
    .line 27
    move v9, v11

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v9, v10

    .line 30
    :goto_0
    cmpl-double v7, v5, v7

    .line 31
    .line 32
    iget-object v8, v0, Ldefpackage/gy0;->g:Ljava/util/function/Function;

    .line 33
    .line 34
    iget-object v12, v0, Ldefpackage/gy0;->f:Ljava/util/function/Function;

    .line 35
    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Double;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    if-eqz v9, :cond_1

    .line 49
    .line 50
    invoke-interface {v12, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    :goto_1
    check-cast v7, Ljava/lang/Double;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    invoke-interface {v8, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    goto :goto_1

    .line 62
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    .line 63
    .line 64
    .line 65
    move-result-wide v13

    .line 66
    sub-double/2addr v13, v3

    .line 67
    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide v5

    .line 71
    mul-double/2addr v5, v13

    .line 72
    add-double/2addr v3, v5

    .line 73
    :cond_2
    iget-object v5, v0, Ldefpackage/gy0;->e:Ljava/util/function/Function;

    .line 74
    .line 75
    if-nez v5, :cond_3

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    invoke-interface {v5, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Ldefpackage/gy0;

    .line 84
    .line 85
    :goto_3
    if-eqz v5, :cond_8

    .line 86
    .line 87
    iget-object v15, v5, Ldefpackage/gy0;->e:Ljava/util/function/Function;

    .line 88
    .line 89
    if-eqz v15, :cond_4

    .line 90
    .line 91
    invoke-interface {v15, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v15

    .line 95
    if-eqz v15, :cond_4

    .line 96
    .line 97
    move v15, v11

    .line 98
    goto :goto_4

    .line 99
    :cond_4
    move v15, v10

    .line 100
    :goto_4
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/Double;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 107
    .line 108
    .line 109
    move-result-wide v6

    .line 110
    iget-object v2, v5, Ldefpackage/gy0;->c:Ljava/util/function/Function;

    .line 111
    .line 112
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/lang/Double;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 119
    .line 120
    .line 121
    move-result-wide v13

    .line 122
    invoke-static {v6, v7, v13, v14}, Ldefpackage/ji2;->D(DD)D

    .line 123
    .line 124
    .line 125
    move-result-wide v6

    .line 126
    if-eqz v9, :cond_5

    .line 127
    .line 128
    invoke-interface {v12, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    check-cast v2, Ljava/lang/Double;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 135
    .line 136
    .line 137
    move-result-wide v8

    .line 138
    iget-object v2, v5, Ldefpackage/gy0;->f:Ljava/util/function/Function;

    .line 139
    .line 140
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, Ljava/lang/Double;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 147
    .line 148
    .line 149
    move-result-wide v12

    .line 150
    invoke-static {v8, v9, v12, v13}, Ldefpackage/ji2;->D(DD)D

    .line 151
    .line 152
    .line 153
    move-result-wide v8

    .line 154
    if-eqz v15, :cond_9

    .line 155
    .line 156
    move-wide v13, v8

    .line 157
    goto :goto_6

    .line 158
    :cond_5
    invoke-interface {v8, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    check-cast v2, Ljava/lang/Double;

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 165
    .line 166
    .line 167
    move-result-wide v8

    .line 168
    iget-object v2, v5, Ldefpackage/gy0;->g:Ljava/util/function/Function;

    .line 169
    .line 170
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/lang/Double;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    invoke-static {v8, v9, v12, v13}, Ldefpackage/ji2;->D(DD)D

    .line 181
    .line 182
    .line 183
    move-result-wide v8

    .line 184
    if-eqz v15, :cond_6

    .line 185
    .line 186
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(DD)D

    .line 187
    .line 188
    .line 189
    move-result-wide v13

    .line 190
    goto :goto_5

    .line 191
    :cond_6
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 192
    .line 193
    :goto_5
    if-eqz v15, :cond_7

    .line 194
    .line 195
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(DD)D

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    goto :goto_6

    .line 200
    :cond_7
    const-wide/high16 v6, 0x4035000000000000L    # 21.0

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_8
    const-wide/high16 v6, 0x4035000000000000L    # 21.0

    .line 204
    .line 205
    :cond_9
    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    .line 206
    .line 207
    :goto_6
    new-instance v2, Ldefpackage/zx0;

    .line 208
    .line 209
    invoke-direct {v2, v1, v10}, Ldefpackage/zx0;-><init>(Ldefpackage/d64;I)V

    .line 210
    .line 211
    .line 212
    new-instance v8, Ldefpackage/cy0;

    .line 213
    .line 214
    invoke-direct {v8, v3, v4}, Ldefpackage/cy0;-><init>(D)V

    .line 215
    .line 216
    .line 217
    new-instance v4, Ldefpackage/t8;

    .line 218
    .line 219
    invoke-direct {v4, v11, v5}, Ldefpackage/t8;-><init>(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    new-instance v3, Ldefpackage/dy0;

    .line 223
    .line 224
    invoke-direct {v3, v13, v14, v10}, Ldefpackage/dy0;-><init>(DI)V

    .line 225
    .line 226
    .line 227
    new-instance v5, Ldefpackage/dy0;

    .line 228
    .line 229
    invoke-direct {v5, v6, v7, v11}, Ldefpackage/dy0;-><init>(DI)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v0, Ldefpackage/gy0;->c:Ljava/util/function/Function;

    .line 233
    .line 234
    iget-object v0, v0, Ldefpackage/gy0;->h:Ljava/util/function/Function;

    .line 235
    .line 236
    move-object v6, v3

    .line 237
    move-object v7, v5

    .line 238
    move-object v3, v8

    .line 239
    move-object v5, v0

    .line 240
    move-object/from16 v0, p1

    .line 241
    .line 242
    invoke-static/range {v0 .. v7}, Ldefpackage/gy0;->a(Ldefpackage/d64;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/util/function/Function;Ljava/util/function/Function;Ldefpackage/dy0;Ljava/util/function/Function;)D

    .line 243
    .line 244
    .line 245
    move-result-wide v0

    .line 246
    return-wide v0
.end method
