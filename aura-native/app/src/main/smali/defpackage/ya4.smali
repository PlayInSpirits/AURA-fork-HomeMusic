.class public abstract Ldefpackage/ya4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/ca1;

.field public static final b:Ldefpackage/i61;

.field public static c:Ldefpackage/i61;

.field public static final d:Ldefpackage/f01;

.field public static final e:Ldefpackage/f01;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Ldefpackage/ca1;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/ca1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/ya4;->a:Ldefpackage/ca1;

    .line 9
    .line 10
    new-instance v2, Ldefpackage/i61;

    .line 11
    .line 12
    const/16 v7, 0x8

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v4, v3

    .line 17
    move-object v5, v3

    .line 18
    invoke-direct/range {v2 .. v7}, Ldefpackage/i61;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Ldefpackage/ya4;->b:Ldefpackage/i61;

    .line 22
    .line 23
    new-instance v0, Ldefpackage/f01;

    .line 24
    .line 25
    const-string v1, "NONE"

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Ldefpackage/ya4;->d:Ldefpackage/f01;

    .line 32
    .line 33
    new-instance v0, Ldefpackage/f01;

    .line 34
    .line 35
    const-string v1, "PENDING"

    .line 36
    .line 37
    invoke-direct {v0, v2, v1}, Ldefpackage/f01;-><init>(ILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Ldefpackage/ya4;->e:Ldefpackage/f01;

    .line 41
    .line 42
    return-void
.end method

.method public static final A(J[F)J
    .locals 12

    .line 1
    array-length v0, p2

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-wide p0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p2, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget v1, p2, v1

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    aget v2, p2, v2

    .line 15
    .line 16
    const/4 v3, 0x4

    .line 17
    aget v3, p2, v3

    .line 18
    .line 19
    const/4 v4, 0x5

    .line 20
    aget v4, p2, v4

    .line 21
    .line 22
    const/4 v5, 0x7

    .line 23
    aget v5, p2, v5

    .line 24
    .line 25
    const/16 v6, 0xc

    .line 26
    .line 27
    aget v6, p2, v6

    .line 28
    .line 29
    const/16 v7, 0xd

    .line 30
    .line 31
    aget v7, p2, v7

    .line 32
    .line 33
    const/16 v8, 0xf

    .line 34
    .line 35
    aget p2, p2, v8

    .line 36
    .line 37
    const/16 v8, 0x20

    .line 38
    .line 39
    shr-long v9, p0, v8

    .line 40
    .line 41
    long-to-int v9, v9

    .line 42
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    const-wide v10, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr p0, v10

    .line 52
    long-to-int p0, p0

    .line 53
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    mul-float/2addr v2, v9

    .line 58
    mul-float/2addr v5, p0

    .line 59
    add-float/2addr v5, v2

    .line 60
    add-float/2addr v5, p2

    .line 61
    const/high16 p1, 0x3f800000    # 1.0f

    .line 62
    .line 63
    div-float/2addr p1, v5

    .line 64
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    const v2, 0x7fffffff

    .line 69
    .line 70
    .line 71
    and-int/2addr p2, v2

    .line 72
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 73
    .line 74
    if-ge p2, v2, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 p1, 0x0

    .line 78
    :goto_0
    mul-float/2addr v0, v9

    .line 79
    mul-float/2addr v3, p0

    .line 80
    add-float/2addr v3, v0

    .line 81
    add-float/2addr v3, v6

    .line 82
    mul-float/2addr v3, p1

    .line 83
    mul-float/2addr v1, v9

    .line 84
    mul-float/2addr v4, p0

    .line 85
    add-float/2addr v4, v1

    .line 86
    add-float/2addr v4, v7

    .line 87
    mul-float/2addr v4, p1

    .line 88
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    int-to-long p0, p0

    .line 93
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    int-to-long v0, p2

    .line 98
    shl-long/2addr p0, v8

    .line 99
    and-long/2addr v0, v10

    .line 100
    or-long/2addr p0, v0

    .line 101
    return-wide p0
.end method

.method public static final B([FLdefpackage/v03;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    if-ge v2, v3, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    aget v2, v0, v2

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aget v3, v0, v3

    .line 16
    .line 17
    const/4 v4, 0x3

    .line 18
    aget v4, v0, v4

    .line 19
    .line 20
    const/4 v5, 0x4

    .line 21
    aget v5, v0, v5

    .line 22
    .line 23
    const/4 v6, 0x5

    .line 24
    aget v6, v0, v6

    .line 25
    .line 26
    const/4 v7, 0x7

    .line 27
    aget v7, v0, v7

    .line 28
    .line 29
    const/16 v8, 0xc

    .line 30
    .line 31
    aget v8, v0, v8

    .line 32
    .line 33
    const/16 v9, 0xd

    .line 34
    .line 35
    aget v9, v0, v9

    .line 36
    .line 37
    const/16 v10, 0xf

    .line 38
    .line 39
    aget v0, v0, v10

    .line 40
    .line 41
    iget v10, v1, Ldefpackage/v03;->b:F

    .line 42
    .line 43
    iget v11, v1, Ldefpackage/v03;->c:F

    .line 44
    .line 45
    iget v12, v1, Ldefpackage/v03;->d:F

    .line 46
    .line 47
    iget v13, v1, Ldefpackage/v03;->e:F

    .line 48
    .line 49
    mul-float v14, v4, v10

    .line 50
    .line 51
    mul-float v15, v7, v11

    .line 52
    .line 53
    add-float v16, v14, v15

    .line 54
    .line 55
    add-float v16, v16, v0

    .line 56
    .line 57
    const/high16 v17, 0x3f800000    # 1.0f

    .line 58
    .line 59
    div-float v16, v17, v16

    .line 60
    .line 61
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result v18

    .line 65
    const v19, 0x7fffffff

    .line 66
    .line 67
    .line 68
    move/from16 p0, v0

    .line 69
    .line 70
    and-int v0, v18, v19

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    move/from16 v20, v2

    .line 75
    .line 76
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 77
    .line 78
    if-ge v0, v2, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move/from16 v16, v18

    .line 82
    .line 83
    :goto_0
    mul-float v0, v20, v10

    .line 84
    .line 85
    mul-float v21, v5, v11

    .line 86
    .line 87
    add-float v22, v0, v21

    .line 88
    .line 89
    add-float v22, v22, v8

    .line 90
    .line 91
    mul-float v2, v22, v16

    .line 92
    .line 93
    mul-float/2addr v10, v3

    .line 94
    mul-float/2addr v11, v6

    .line 95
    add-float v22, v10, v11

    .line 96
    .line 97
    add-float v22, v22, v9

    .line 98
    .line 99
    move/from16 v23, v0

    .line 100
    .line 101
    mul-float v0, v22, v16

    .line 102
    .line 103
    mul-float/2addr v7, v13

    .line 104
    add-float/2addr v14, v7

    .line 105
    add-float v14, v14, p0

    .line 106
    .line 107
    div-float v14, v17, v14

    .line 108
    .line 109
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result v16

    .line 113
    move/from16 v22, v3

    .line 114
    .line 115
    and-int v3, v16, v19

    .line 116
    .line 117
    move/from16 v16, v4

    .line 118
    .line 119
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 120
    .line 121
    if-ge v3, v4, :cond_2

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    move/from16 v14, v18

    .line 125
    .line 126
    :goto_1
    mul-float/2addr v5, v13

    .line 127
    add-float v3, v23, v5

    .line 128
    .line 129
    add-float/2addr v3, v8

    .line 130
    mul-float/2addr v3, v14

    .line 131
    mul-float/2addr v6, v13

    .line 132
    add-float/2addr v10, v6

    .line 133
    add-float/2addr v10, v9

    .line 134
    mul-float/2addr v10, v14

    .line 135
    mul-float v4, v16, v12

    .line 136
    .line 137
    add-float/2addr v15, v4

    .line 138
    add-float v15, v15, p0

    .line 139
    .line 140
    div-float v13, v17, v15

    .line 141
    .line 142
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    and-int v14, v14, v19

    .line 147
    .line 148
    const/high16 v15, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 149
    .line 150
    if-ge v14, v15, :cond_3

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_3
    move/from16 v13, v18

    .line 154
    .line 155
    :goto_2
    mul-float v14, v20, v12

    .line 156
    .line 157
    add-float v21, v14, v21

    .line 158
    .line 159
    add-float v21, v21, v8

    .line 160
    .line 161
    mul-float v15, v21, v13

    .line 162
    .line 163
    mul-float v12, v12, v22

    .line 164
    .line 165
    add-float/2addr v11, v12

    .line 166
    add-float/2addr v11, v9

    .line 167
    mul-float/2addr v11, v13

    .line 168
    add-float/2addr v4, v7

    .line 169
    add-float v4, v4, p0

    .line 170
    .line 171
    div-float v17, v17, v4

    .line 172
    .line 173
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    and-int v4, v4, v19

    .line 178
    .line 179
    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 180
    .line 181
    if-ge v4, v7, :cond_4

    .line 182
    .line 183
    move/from16 v18, v17

    .line 184
    .line 185
    :cond_4
    add-float/2addr v14, v5

    .line 186
    add-float/2addr v14, v8

    .line 187
    mul-float v14, v14, v18

    .line 188
    .line 189
    add-float/2addr v12, v6

    .line 190
    add-float/2addr v12, v9

    .line 191
    mul-float v12, v12, v18

    .line 192
    .line 193
    invoke-static {v15, v14}, Ljava/lang/Math;->min(FF)F

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    iput v4, v1, Ldefpackage/v03;->b:F

    .line 206
    .line 207
    invoke-static {v11, v12}, Ljava/lang/Math;->min(FF)F

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    invoke-static {v10, v4}, Ljava/lang/Math;->min(FF)F

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    iput v4, v1, Ldefpackage/v03;->c:F

    .line 220
    .line 221
    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    iput v2, v1, Ldefpackage/v03;->d:F

    .line 234
    .line 235
    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    invoke-static {v10, v2}, Ljava/lang/Math;->max(FF)F

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    iput v0, v1, Ldefpackage/v03;->e:F

    .line 248
    .line 249
    return-void
.end method

.method public static C(Ldefpackage/le0;Ldefpackage/me0;)Ldefpackage/ne0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ldefpackage/le0;->getKey()Ldefpackage/me0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p0, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public static D(Ldefpackage/bp0;Ldefpackage/gf1;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Ldefpackage/jh4;->b:Ldefpackage/z05;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/z05;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/ch4;

    .line 8
    .line 9
    instance-of v1, v0, Ldefpackage/ox4;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    check-cast v1, Ldefpackage/ox4;

    .line 15
    .line 16
    iget-wide v2, v1, Ldefpackage/ox4;->t:J

    .line 17
    .line 18
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    iget-object v2, v1, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 27
    .line 28
    iget-object v3, v1, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 29
    .line 30
    :try_start_0
    move-object v4, v0

    .line 31
    check-cast v4, Ldefpackage/ox4;

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    invoke-static {p0, v2, v5}, Ldefpackage/jh4;->k(Ldefpackage/if1;Ldefpackage/if1;Z)Ldefpackage/if1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iput-object p0, v4, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 39
    .line 40
    check-cast v0, Ldefpackage/ox4;

    .line 41
    .line 42
    iput-object v3, v0, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 43
    .line 44
    invoke-interface {p1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    iput-object v2, v1, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 49
    .line 50
    iput-object v3, v1, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 51
    .line 52
    return-object p0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    iput-object v2, v1, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 56
    .line 57
    iput-object v3, v1, Ldefpackage/ox4;->s:Ldefpackage/if1;

    .line 58
    .line 59
    throw p0

    .line 60
    :cond_0
    if-eqz v0, :cond_1

    .line 61
    .line 62
    instance-of v1, v0, Ldefpackage/a13;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    :cond_1
    move-object v1, v0

    .line 67
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {v0, p0}, Ldefpackage/ch4;->u(Ldefpackage/if1;)Ldefpackage/ch4;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_2

    .line 73
    :goto_0
    new-instance v0, Ldefpackage/ox4;

    .line 74
    .line 75
    instance-of v2, v1, Ldefpackage/a13;

    .line 76
    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    check-cast v1, Ldefpackage/a13;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    const/4 v1, 0x0

    .line 83
    :goto_1
    const/4 v4, 0x1

    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v3, 0x0

    .line 86
    move-object v2, p0

    .line 87
    invoke-direct/range {v0 .. v5}, Ldefpackage/ox4;-><init>(Ldefpackage/a13;Ldefpackage/if1;Ldefpackage/if1;ZZ)V

    .line 88
    .line 89
    .line 90
    move-object p0, v0

    .line 91
    :goto_2
    :try_start_1
    invoke-virtual {p0}, Ldefpackage/ch4;->j()Ldefpackage/ch4;

    .line 92
    .line 93
    .line 94
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    :try_start_2
    invoke-interface {p1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 99
    :try_start_3
    invoke-static {v1}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Ldefpackage/ch4;->c()V

    .line 103
    .line 104
    .line 105
    return-object p1

    .line 106
    :catchall_1
    move-exception v0

    .line 107
    move-object p1, v0

    .line 108
    goto :goto_3

    .line 109
    :catchall_2
    move-exception v0

    .line 110
    move-object p1, v0

    .line 111
    :try_start_4
    invoke-static {v1}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V

    .line 112
    .line 113
    .line 114
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 115
    :goto_3
    invoke-virtual {p0}, Ldefpackage/ch4;->c()V

    .line 116
    .line 117
    .line 118
    throw p1
.end method

.method public static final E(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    sget-object v0, Ldefpackage/ku3;->n:Ldefpackage/ju3;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 6
    .line 7
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 40
    .line 41
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v2, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    const/4 v4, 0x0

    .line 54
    move v5, v4

    .line 55
    :cond_3
    :goto_1
    if-ge v5, v3, :cond_4

    .line 56
    .line 57
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    move-object v7, v6

    .line 64
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 65
    .line 66
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {p0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_3

    .line 75
    .line 76
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-static {v2, v0}, Ldefpackage/gb;->a0(Ljava/util/ArrayList;Ldefpackage/ku3;)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v1, Ljava/util/HashSet;

    .line 85
    .line 86
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 87
    .line 88
    .line 89
    move-object v2, p0

    .line 90
    check-cast v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    move v5, v4

    .line 97
    :goto_2
    if-ge v5, v3, :cond_5

    .line 98
    .line 99
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 106
    .line 107
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_7

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v5, v3

    .line 135
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 136
    .line 137
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    if-eqz v6, :cond_6

    .line 142
    .line 143
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_6

    .line 152
    .line 153
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_7
    new-instance p1, Ljava/util/HashSet;

    .line 158
    .line 159
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance v1, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    :cond_8
    :goto_4
    if-ge v4, v3, :cond_9

    .line 172
    .line 173
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    add-int/lit8 v4, v4, 0x1

    .line 178
    .line 179
    move-object v6, v5

    .line 180
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 181
    .line 182
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {p1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-eqz v6, :cond_8

    .line 191
    .line 192
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    invoke-static {v1, v0}, Ldefpackage/gb;->a0(Ljava/util/ArrayList;Ldefpackage/ku3;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-static {p0, p1}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    return-object p0
.end method

.method public static F(Ldefpackage/le0;Ldefpackage/ne0;)Ldefpackage/ne0;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 5
    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ldefpackage/d60;

    .line 10
    .line 11
    const/16 v1, 0x9

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v0, v1, v2}, Ldefpackage/d60;-><init>(IB)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0, p0}, Ldefpackage/ne0;->s(Ldefpackage/wf1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ldefpackage/ne0;

    .line 22
    .line 23
    return-object p0
.end method

.method public static final G([F)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const/high16 v1, 0x3f800000    # 1.0f

    .line 9
    .line 10
    aput v1, p0, v0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    const/4 v2, 0x0

    .line 14
    aput v2, p0, v0

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    aput v2, p0, v0

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    aput v2, p0, v0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    aput v2, p0, v0

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    aput v1, p0, v0

    .line 27
    .line 28
    const/4 v0, 0x6

    .line 29
    aput v2, p0, v0

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    aput v2, p0, v0

    .line 33
    .line 34
    const/16 v0, 0x8

    .line 35
    .line 36
    aput v2, p0, v0

    .line 37
    .line 38
    const/16 v0, 0x9

    .line 39
    .line 40
    aput v2, p0, v0

    .line 41
    .line 42
    const/16 v0, 0xa

    .line 43
    .line 44
    aput v1, p0, v0

    .line 45
    .line 46
    const/16 v0, 0xb

    .line 47
    .line 48
    aput v2, p0, v0

    .line 49
    .line 50
    const/16 v0, 0xc

    .line 51
    .line 52
    aput v2, p0, v0

    .line 53
    .line 54
    const/16 v0, 0xd

    .line 55
    .line 56
    aput v2, p0, v0

    .line 57
    .line 58
    const/16 v0, 0xe

    .line 59
    .line 60
    aput v2, p0, v0

    .line 61
    .line 62
    const/16 v0, 0xf

    .line 63
    .line 64
    aput v1, p0, v0

    .line 65
    .line 66
    return-void
.end method

.method public static H(Ldefpackage/ch4;Ldefpackage/ch4;Ldefpackage/if1;)V
    .locals 0

    .line 1
    if-ne p0, p1, :cond_2

    .line 2
    .line 3
    instance-of p1, p0, Ldefpackage/ox4;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    check-cast p0, Ldefpackage/ox4;

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    instance-of p1, p0, Ldefpackage/px4;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    check-cast p0, Ldefpackage/px4;

    .line 17
    .line 18
    iput-object p2, p0, Ldefpackage/px4;->h:Ldefpackage/if1;

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    const-string p1, "Non-transparent snapshot was reused: "

    .line 22
    .line 23
    invoke-static {p0, p1}, Ldefpackage/mj0;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p0}, Ldefpackage/ch4;->q(Ldefpackage/ch4;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ldefpackage/ch4;->c()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static I(Landroid/widget/TextView;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ldefpackage/l93;->k(I)V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p1}, Ldefpackage/ne;->r(Landroid/widget/TextView;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 32
    .line 33
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-le p1, v1, :cond_2

    .line 38
    .line 39
    add-int/2addr p1, v0

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public static J(Landroid/widget/TextView;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Ldefpackage/l93;->k(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 22
    .line 23
    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-le p1, v1, :cond_1

    .line 28
    .line 29
    sub-int/2addr p1, v0

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public static K(Landroid/widget/TextView;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ldefpackage/l93;->k(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    sub-int/2addr p1, v0

    .line 16
    int-to-float p1, p1

    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final L(Ldefpackage/gc0;Ldefpackage/td0;Ldefpackage/il4;Ljava/lang/Float;)Ldefpackage/vu3;
    .locals 9

    .line 1
    sget-object v0, Ldefpackage/y00;->d:Ldefpackage/x00;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Ldefpackage/x00;->a:Ldefpackage/x00;

    .line 7
    .line 8
    new-instance v0, Ldefpackage/rf2;

    .line 9
    .line 10
    sget-object v1, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Ldefpackage/rf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p3}, Ldefpackage/ya4;->a(Ljava/lang/Object;)Ldefpackage/nl4;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object p0, v0, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ldefpackage/ne0;

    .line 22
    .line 23
    iget-object v0, v0, Ldefpackage/rf2;->n:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    check-cast v4, Ldefpackage/p81;

    .line 27
    .line 28
    sget-object v0, Ldefpackage/id4;->a:Ldefpackage/xi4;

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ldefpackage/il4;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    sget-object v0, Ldefpackage/ze0;->n:Ldefpackage/ze0;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v0, Ldefpackage/ze0;->q:Ldefpackage/ze0;

    .line 40
    .line 41
    :goto_0
    new-instance v2, Ldefpackage/x70;

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    const/4 v8, 0x4

    .line 45
    move-object v3, p2

    .line 46
    move-object v6, p3

    .line 47
    invoke-direct/range {v2 .. v8}, Ldefpackage/x70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ldefpackage/vd0;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p0, v0, v2}, Ldefpackage/fu;->F(Ldefpackage/we0;Ldefpackage/ne0;Ldefpackage/ze0;Ldefpackage/wf1;)Ldefpackage/sk4;

    .line 51
    .line 52
    .line 53
    new-instance p0, Ldefpackage/vu3;

    .line 54
    .line 55
    invoke-direct {p0, v5}, Ldefpackage/vu3;-><init>(Ldefpackage/nl4;)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public static final M(Ldefpackage/h03;)I
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/h03;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Ldefpackage/h03;->b(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    :cond_0
    iget v2, p0, Ldefpackage/h03;->b:I

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ldefpackage/h03;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v2, v1, :cond_3

    .line 17
    .line 18
    iget v2, p0, Ldefpackage/h03;->b:I

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v3, p0, Ldefpackage/h03;->a:[I

    .line 23
    .line 24
    add-int/lit8 v2, v2, -0x1

    .line 25
    .line 26
    aget v2, v3, v2

    .line 27
    .line 28
    invoke-virtual {p0, v0, v2}, Ldefpackage/h03;->d(II)V

    .line 29
    .line 30
    .line 31
    iget v2, p0, Ldefpackage/h03;->b:I

    .line 32
    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Ldefpackage/h03;->c(I)V

    .line 36
    .line 37
    .line 38
    iget v2, p0, Ldefpackage/h03;->b:I

    .line 39
    .line 40
    ushr-int/lit8 v3, v2, 0x1

    .line 41
    .line 42
    move v4, v0

    .line 43
    :goto_0
    if-ge v4, v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0, v4}, Ldefpackage/h03;->b(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/lit8 v6, v4, 0x1

    .line 50
    .line 51
    mul-int/lit8 v6, v6, 0x2

    .line 52
    .line 53
    add-int/lit8 v7, v6, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v7}, Ldefpackage/h03;->b(I)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-ge v6, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v6}, Ldefpackage/h03;->b(I)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-le v9, v8, :cond_1

    .line 66
    .line 67
    if-le v9, v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {p0, v4, v9}, Ldefpackage/h03;->d(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v6, v5}, Ldefpackage/h03;->d(II)V

    .line 73
    .line 74
    .line 75
    move v4, v6

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    if-le v8, v5, :cond_0

    .line 78
    .line 79
    invoke-virtual {p0, v4, v8}, Ldefpackage/h03;->d(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7, v5}, Ldefpackage/h03;->d(II)V

    .line 83
    .line 84
    .line 85
    move v4, v7

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    const-string p0, "IntList is empty."

    .line 88
    .line 89
    invoke-static {p0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return v0

    .line 93
    :cond_3
    return v1
.end method

.method public static N([FFF)V
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    mul-float/2addr v0, p1

    .line 11
    const/4 v1, 0x4

    .line 12
    aget v1, p0, v1

    .line 13
    .line 14
    mul-float/2addr v1, p2

    .line 15
    add-float/2addr v1, v0

    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    aget v0, p0, v0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    mul-float/2addr v0, v2

    .line 22
    add-float/2addr v0, v1

    .line 23
    const/16 v1, 0xc

    .line 24
    .line 25
    aget v3, p0, v1

    .line 26
    .line 27
    add-float/2addr v0, v3

    .line 28
    const/4 v3, 0x1

    .line 29
    aget v3, p0, v3

    .line 30
    .line 31
    mul-float/2addr v3, p1

    .line 32
    const/4 v4, 0x5

    .line 33
    aget v4, p0, v4

    .line 34
    .line 35
    mul-float/2addr v4, p2

    .line 36
    add-float/2addr v4, v3

    .line 37
    const/16 v3, 0x9

    .line 38
    .line 39
    aget v3, p0, v3

    .line 40
    .line 41
    mul-float/2addr v3, v2

    .line 42
    add-float/2addr v3, v4

    .line 43
    const/16 v4, 0xd

    .line 44
    .line 45
    aget v5, p0, v4

    .line 46
    .line 47
    add-float/2addr v3, v5

    .line 48
    const/4 v5, 0x2

    .line 49
    aget v5, p0, v5

    .line 50
    .line 51
    mul-float/2addr v5, p1

    .line 52
    const/4 v6, 0x6

    .line 53
    aget v6, p0, v6

    .line 54
    .line 55
    mul-float/2addr v6, p2

    .line 56
    add-float/2addr v6, v5

    .line 57
    const/16 v5, 0xa

    .line 58
    .line 59
    aget v5, p0, v5

    .line 60
    .line 61
    mul-float/2addr v5, v2

    .line 62
    add-float/2addr v5, v6

    .line 63
    const/16 v6, 0xe

    .line 64
    .line 65
    aget v7, p0, v6

    .line 66
    .line 67
    add-float/2addr v5, v7

    .line 68
    const/4 v7, 0x3

    .line 69
    aget v7, p0, v7

    .line 70
    .line 71
    mul-float/2addr v7, p1

    .line 72
    const/4 p1, 0x7

    .line 73
    aget p1, p0, p1

    .line 74
    .line 75
    mul-float/2addr p1, p2

    .line 76
    add-float/2addr p1, v7

    .line 77
    const/16 p2, 0xb

    .line 78
    .line 79
    aget p2, p0, p2

    .line 80
    .line 81
    mul-float/2addr p2, v2

    .line 82
    add-float/2addr p2, p1

    .line 83
    const/16 p1, 0xf

    .line 84
    .line 85
    aget v2, p0, p1

    .line 86
    .line 87
    add-float/2addr p2, v2

    .line 88
    aput v0, p0, v1

    .line 89
    .line 90
    aput v3, p0, v4

    .line 91
    .line 92
    aput v5, p0, v6

    .line 93
    .line 94
    aput p2, p0, p1

    .line 95
    .line 96
    return-void
.end method

.method public static O(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 2

    .line 1
    instance-of v0, p0, Ldefpackage/dt4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1a

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Ldefpackage/dt4;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/dt4;->a:Landroid/view/ActionMode$Callback;

    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public static P(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)Landroid/view/ActionMode$Callback;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x1b

    .line 8
    .line 9
    if-gt v0, v1, :cond_1

    .line 10
    .line 11
    instance-of v0, p0, Ldefpackage/dt4;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v0, Ldefpackage/dt4;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1}, Ldefpackage/dt4;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    :goto_0
    return-object p0
.end method

.method public static Q(Ldefpackage/wf1;Ljava/lang/Object;Ldefpackage/vd0;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Ldefpackage/k12;

    .line 13
    .line 14
    invoke-direct {v0, p2}, Ldefpackage/q14;-><init>(Ldefpackage/vd0;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ldefpackage/l12;

    .line 19
    .line 20
    invoke-direct {v1, p2, v0}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;Ldefpackage/ne0;)V

    .line 21
    .line 22
    .line 23
    move-object v0, v1

    .line 24
    :goto_0
    const/4 p2, 0x2

    .line 25
    invoke-static {p2, p0}, Ldefpackage/jz4;->j(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1, v0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final a(Ljava/lang/Object;)Ldefpackage/nl4;
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/nl4;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ldefpackage/xl;->e:Ldefpackage/f01;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, Ldefpackage/nl4;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final b(Ldefpackage/dx2;Ldefpackage/lm0;Ldefpackage/ac3;Ldefpackage/wg4;ZLdefpackage/tb;FLdefpackage/rv2;Ldefpackage/y43;Ldefpackage/if1;Ldefpackage/gs;Ldefpackage/rv2;Ldefpackage/r70;Ldefpackage/rg1;II)V
    .locals 45

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v0, p3

    move/from16 v12, p4

    move/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v15, p13

    move/from16 v2, p14

    move/from16 v7, p15

    sget-object v8, Ldefpackage/fz0;->z:Ldefpackage/fs;

    const v11, -0x22247a99

    .line 1
    invoke-virtual {v15, v11}, Ldefpackage/rg1;->S(I)Ldefpackage/rg1;

    and-int/lit8 v11, v2, 0x6

    const/16 v16, 0x2

    move/from16 v17, v11

    if-nez v17, :cond_1

    invoke-virtual {v15, v1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_0

    const/16 v17, 0x4

    goto :goto_0

    :cond_0
    move/from16 v17, v16

    :goto_0
    or-int v17, v2, v17

    goto :goto_1

    :cond_1
    move/from16 v17, v2

    :goto_1
    and-int/lit8 v18, v2, 0x30

    const/16 v19, 0x10

    if-nez v18, :cond_3

    invoke-virtual {v15, v3}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2

    const/16 v18, 0x20

    goto :goto_2

    :cond_2
    move/from16 v18, v19

    :goto_2
    or-int v17, v17, v18

    :cond_3
    and-int/lit16 v11, v2, 0x180

    const/16 v20, 0x80

    move/from16 v21, v11

    if-nez v21, :cond_5

    invoke-virtual {v15, v4}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_4

    const/16 v21, 0x100

    goto :goto_3

    :cond_4
    move/from16 v21, v20

    :goto_3
    or-int v17, v17, v21

    :cond_5
    and-int/lit16 v11, v2, 0xc00

    const/16 v22, 0x400

    const/4 v1, 0x0

    move/from16 v23, v11

    if-nez v23, :cond_7

    invoke-virtual {v15, v1}, Ldefpackage/rg1;->f(Z)Z

    move-result v23

    if-eqz v23, :cond_6

    const/16 v23, 0x800

    goto :goto_4

    :cond_6
    move/from16 v23, v22

    :goto_4
    or-int v17, v17, v23

    :cond_7
    and-int/lit16 v11, v2, 0x6000

    const/16 v24, 0x2000

    const/4 v1, 0x1

    if-nez v11, :cond_9

    invoke-virtual {v15, v1}, Ldefpackage/rg1;->d(I)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v11, v24

    :goto_5
    or-int v17, v17, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int v26, v2, v11

    const/high16 v27, 0x10000

    if-nez v26, :cond_b

    invoke-virtual {v15, v0}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_a

    const/high16 v26, 0x20000

    goto :goto_6

    :cond_a
    move/from16 v26, v27

    :goto_6
    or-int v17, v17, v26

    :cond_b
    const/high16 v26, 0x180000

    and-int v29, v2, v26

    const/high16 v30, 0x80000

    move/from16 v31, v11

    if-nez v29, :cond_d

    invoke-virtual {v15, v12}, Ldefpackage/rg1;->f(Z)Z

    move-result v29

    if-eqz v29, :cond_c

    const/high16 v29, 0x100000

    goto :goto_7

    :cond_c
    move/from16 v29, v30

    :goto_7
    or-int v17, v17, v29

    :cond_d
    const/high16 v29, 0xc00000

    and-int v32, v2, v29

    move-object/from16 v1, p5

    if-nez v32, :cond_f

    invoke-virtual {v15, v1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_e

    const/high16 v33, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v33, 0x400000

    :goto_8
    or-int v17, v17, v33

    :cond_f
    const/high16 v33, 0x6000000

    and-int v34, v2, v33

    if-nez v34, :cond_11

    const/4 v11, 0x0

    invoke-virtual {v15, v11}, Ldefpackage/rg1;->d(I)Z

    move-result v35

    if-eqz v35, :cond_10

    const/high16 v11, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v11, 0x2000000

    :goto_9
    or-int v17, v17, v11

    :cond_11
    const/high16 v11, 0x30000000

    and-int v35, v2, v11

    move/from16 v36, v11

    if-nez v35, :cond_13

    invoke-virtual {v15, v5}, Ldefpackage/rg1;->c(F)Z

    move-result v35

    if-eqz v35, :cond_12

    const/high16 v35, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v35, 0x10000000

    :goto_a
    or-int v17, v17, v35

    :cond_13
    and-int/lit8 v35, v7, 0x6

    if-nez v35, :cond_15

    invoke-virtual {v15, v6}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_14

    const/16 v16, 0x4

    :cond_14
    or-int v16, v7, v16

    goto :goto_b

    :cond_15
    move/from16 v16, v7

    :goto_b
    and-int/lit8 v35, v7, 0x30

    if-nez v35, :cond_17

    invoke-virtual {v15, v13}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_16

    const/16 v19, 0x20

    :cond_16
    or-int v16, v16, v19

    :cond_17
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_19

    invoke-virtual {v15, v14}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    const/16 v20, 0x100

    :cond_18
    or-int v16, v16, v20

    :cond_19
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_1b

    invoke-virtual {v15, v8}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1a

    const/16 v22, 0x800

    :cond_1a
    or-int v16, v16, v22

    :cond_1b
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_1d

    invoke-virtual {v15, v9}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1c

    const/16 v24, 0x4000

    :cond_1c
    or-int v16, v16, v24

    :cond_1d
    and-int v11, v7, v31

    if-nez v11, :cond_1f

    invoke-virtual {v15, v10}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1e

    const/high16 v27, 0x20000

    :cond_1e
    or-int v16, v16, v27

    :cond_1f
    and-int v11, v7, v26

    if-nez v11, :cond_21

    move-object/from16 v11, p12

    invoke-virtual {v15, v11}, Ldefpackage/rg1;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_20

    const/high16 v30, 0x100000

    :cond_20
    or-int v16, v16, v30

    :goto_c
    move/from16 v1, v16

    goto :goto_d

    :cond_21
    move-object/from16 v11, p12

    goto :goto_c

    :goto_d
    const v16, 0x12492493

    and-int v2, v17, v16

    const v7, 0x12492492

    if-ne v2, v7, :cond_23

    const v2, 0x92493

    and-int/2addr v2, v1

    const v7, 0x92492

    if-eq v2, v7, :cond_22

    goto :goto_e

    :cond_22
    const/4 v2, 0x0

    goto :goto_f

    :cond_23
    :goto_e
    const/4 v2, 0x1

    :goto_f
    and-int/lit8 v7, v17, 0x1

    invoke-virtual {v15, v7, v2}, Ldefpackage/rg1;->K(IZ)Z

    move-result v2

    if-eqz v2, :cond_66

    and-int/lit8 v2, v17, 0x70

    const/16 v7, 0x20

    if-ne v2, v7, :cond_24

    const/16 v16, 0x1

    goto :goto_10

    :cond_24
    const/16 v16, 0x0

    .line 2
    :goto_10
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v7

    .line 3
    sget-object v13, Ldefpackage/j80;->a:Ldefpackage/i80;

    if-nez v16, :cond_25

    if-ne v7, v13, :cond_26

    .line 4
    :cond_25
    new-instance v7, Ldefpackage/h82;

    const/4 v11, 0x0

    invoke-direct {v7, v3, v11}, Ldefpackage/h82;-><init>(Ldefpackage/lm0;I)V

    .line 5
    invoke-virtual {v15, v7}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 6
    :cond_26
    check-cast v7, Ldefpackage/gf1;

    shr-int/lit8 v16, v17, 0x3

    and-int/lit8 v20, v16, 0xe

    shr-int/lit8 v11, v1, 0xf

    and-int/lit8 v22, v11, 0x70

    or-int v22, v20, v22

    move/from16 v24, v11

    and-int/lit16 v11, v1, 0x380

    or-int v11, v22, v11

    move/from16 v22, v1

    .line 7
    invoke-static/range {p12 .. p13}, Ldefpackage/uc5;->S(Ljava/lang/Object;Ldefpackage/rg1;)Ldefpackage/b13;

    move-result-object v1

    move/from16 v27, v11

    .line 8
    invoke-static {v14, v15}, Ldefpackage/uc5;->S(Ljava/lang/Object;Ldefpackage/rg1;)Ldefpackage/b13;

    move-result-object v11

    and-int/lit8 v30, v27, 0xe

    const/16 v35, 0x6

    xor-int/lit8 v14, v30, 0x6

    const/4 v12, 0x4

    if-le v14, v12, :cond_27

    .line 9
    invoke-virtual {v15, v3}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_28

    :cond_27
    and-int/lit8 v14, v27, 0x6

    if-ne v14, v12, :cond_29

    :cond_28
    const/4 v12, 0x1

    goto :goto_11

    :cond_29
    const/4 v12, 0x0

    :goto_11
    invoke-virtual {v15, v1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-virtual {v15, v11}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-virtual {v15, v7}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    .line 10
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_2a

    if-ne v14, v13, :cond_2b

    .line 11
    :cond_2a
    sget-object v12, Ldefpackage/rv2;->A:Ldefpackage/rv2;

    new-instance v14, Ldefpackage/jo;

    const/4 v0, 0x5

    invoke-direct {v14, v1, v11, v7, v0}, Ldefpackage/jo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 12
    sget-object v0, Ldefpackage/ph4;->a:Ldefpackage/z05;

    .line 13
    new-instance v0, Ldefpackage/dp0;

    invoke-direct {v0, v14, v12}, Ldefpackage/dp0;-><init>(Ldefpackage/gf1;Ldefpackage/rv2;)V

    .line 14
    new-instance v1, Ldefpackage/fa;

    const/16 v7, 0xb

    invoke-direct {v1, v7, v0, v3}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    new-instance v0, Ldefpackage/dp0;

    invoke-direct {v0, v1, v12}, Ldefpackage/dp0;-><init>(Ldefpackage/gf1;Ldefpackage/rv2;)V

    .line 16
    new-instance v37, Ldefpackage/k82;

    const/16 v38, 0x0

    const/16 v39, 0x0

    .line 17
    const-class v40, Ldefpackage/kl4;

    const-string v42, "value"

    const-string v43, "getValue()Ljava/lang/Object;"

    move-object/from16 v41, v0

    invoke-direct/range {v37 .. v43}, Ldefpackage/k82;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v14, v37

    .line 18
    invoke-virtual {v15, v14}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 19
    :cond_2b
    move-object v7, v14

    check-cast v7, Ldefpackage/k82;

    .line 20
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_2c

    .line 21
    iget-object v0, v15, Ldefpackage/rg1;->R:Ldefpackage/ne0;

    .line 22
    new-instance v1, Ldefpackage/yy3;

    invoke-direct {v1, v0}, Ldefpackage/yy3;-><init>(Ldefpackage/ne0;)V

    .line 23
    invoke-virtual {v15, v1}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    move-object v0, v1

    .line 24
    :cond_2c
    move-object v11, v0

    check-cast v11, Ldefpackage/we0;

    const/16 v0, 0x20

    if-ne v2, v0, :cond_2d

    const/4 v0, 0x1

    goto :goto_12

    :cond_2d
    const/4 v0, 0x0

    .line 25
    :goto_12
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2e

    if-ne v1, v13, :cond_2f

    .line 26
    :cond_2e
    new-instance v1, Ldefpackage/h82;

    const/4 v0, 0x1

    invoke-direct {v1, v3, v0}, Ldefpackage/h82;-><init>(Ldefpackage/lm0;I)V

    .line 27
    invoke-virtual {v15, v1}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 28
    :cond_2f
    check-cast v1, Ldefpackage/gf1;

    const v0, 0xfff0

    and-int v0, v17, v0

    shr-int/lit8 v12, v17, 0x9

    const/high16 v14, 0x70000

    and-int v27, v12, v14

    or-int v0, v0, v27

    const/high16 v27, 0x380000

    and-int v12, v12, v27

    or-int/2addr v0, v12

    shl-int/lit8 v12, v22, 0x15

    const/high16 v30, 0x1c00000

    and-int v12, v12, v30

    or-int/2addr v0, v12

    shl-int/lit8 v12, v22, 0xf

    const/high16 v22, 0xe000000

    and-int v37, v12, v22

    or-int v0, v0, v37

    const/high16 v37, 0x70000000

    and-int v12, v12, v37

    or-int/2addr v0, v12

    and-int/lit8 v12, v0, 0x70

    xor-int/lit8 v12, v12, 0x30

    move/from16 v38, v14

    const/16 v14, 0x20

    if-le v12, v14, :cond_30

    .line 29
    invoke-virtual {v15, v3}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_31

    :cond_30
    and-int/lit8 v12, v0, 0x30

    if-ne v12, v14, :cond_32

    :cond_31
    const/4 v12, 0x1

    goto :goto_13

    :cond_32
    const/4 v12, 0x0

    :goto_13
    and-int/lit16 v14, v0, 0x380

    xor-int/lit16 v14, v14, 0x180

    move/from16 v39, v2

    const/16 v2, 0x100

    if-le v14, v2, :cond_33

    .line 30
    invoke-virtual {v15, v4}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_34

    :cond_33
    and-int/lit16 v14, v0, 0x180

    if-ne v14, v2, :cond_35

    :cond_34
    const/4 v2, 0x1

    goto :goto_14

    :cond_35
    const/4 v2, 0x0

    :goto_14
    or-int/2addr v2, v12

    and-int/lit16 v12, v0, 0x1c00

    xor-int/lit16 v12, v12, 0xc00

    const/16 v14, 0x800

    if-le v12, v14, :cond_36

    const/4 v12, 0x0

    .line 31
    invoke-virtual {v15, v12}, Ldefpackage/rg1;->f(Z)Z

    move-result v21

    if-nez v21, :cond_37

    :cond_36
    and-int/lit16 v12, v0, 0xc00

    if-ne v12, v14, :cond_38

    :cond_37
    const/4 v12, 0x1

    goto :goto_15

    :cond_38
    const/4 v12, 0x0

    :goto_15
    or-int/2addr v2, v12

    const v12, 0xe000

    and-int/2addr v12, v0

    xor-int/lit16 v12, v12, 0x6000

    const/16 v14, 0x4000

    if-le v12, v14, :cond_39

    const/4 v12, 0x1

    .line 32
    invoke-virtual {v15, v12}, Ldefpackage/rg1;->d(I)Z

    move-result v21

    if-nez v21, :cond_3a

    goto :goto_16

    :cond_39
    const/4 v12, 0x1

    :goto_16
    and-int/lit16 v12, v0, 0x6000

    if-ne v12, v14, :cond_3b

    :cond_3a
    const/4 v12, 0x1

    goto :goto_17

    :cond_3b
    const/4 v12, 0x0

    :goto_17
    or-int/2addr v2, v12

    and-int v12, v0, v22

    xor-int v12, v12, v33

    const/high16 v14, 0x4000000

    if-le v12, v14, :cond_3c

    .line 33
    invoke-virtual {v15, v8}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3d

    :cond_3c
    and-int v8, v0, v33

    if-ne v8, v14, :cond_3e

    :cond_3d
    const/4 v8, 0x1

    goto :goto_18

    :cond_3e
    const/4 v8, 0x0

    :goto_18
    or-int/2addr v2, v8

    and-int v8, v0, v37

    xor-int v8, v8, v36

    const/high16 v12, 0x20000000

    if-le v8, v12, :cond_3f

    .line 34
    invoke-virtual {v15, v9}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_40

    :cond_3f
    and-int v8, v0, v36

    if-ne v8, v12, :cond_41

    :cond_40
    const/4 v8, 0x1

    goto :goto_19

    :cond_41
    const/4 v8, 0x0

    :goto_19
    or-int/2addr v2, v8

    and-int v8, v0, v27

    xor-int v8, v8, v26

    const/high16 v12, 0x100000

    if-le v8, v12, :cond_42

    .line 35
    invoke-virtual {v15, v5}, Ldefpackage/rg1;->c(F)Z

    move-result v8

    if-nez v8, :cond_43

    :cond_42
    and-int v8, v0, v26

    if-ne v8, v12, :cond_44

    :cond_43
    const/4 v8, 0x1

    goto :goto_1a

    :cond_44
    const/4 v8, 0x0

    :goto_1a
    or-int/2addr v2, v8

    and-int v8, v0, v30

    xor-int v8, v8, v29

    const/high16 v12, 0x800000

    if-le v8, v12, :cond_45

    .line 36
    invoke-virtual {v15, v6}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_46

    :cond_45
    and-int v8, v0, v29

    if-ne v8, v12, :cond_47

    :cond_46
    const/4 v8, 0x1

    goto :goto_1b

    :cond_47
    const/4 v8, 0x0

    :goto_1b
    or-int/2addr v2, v8

    and-int/lit8 v8, v24, 0xe

    xor-int/lit8 v8, v8, 0x6

    const/4 v12, 0x4

    if-le v8, v12, :cond_48

    .line 37
    invoke-virtual {v15, v10}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_49

    :cond_48
    and-int/lit8 v8, v24, 0x6

    if-ne v8, v12, :cond_4a

    :cond_49
    const/4 v8, 0x1

    goto :goto_1c

    :cond_4a
    const/4 v8, 0x0

    :goto_1c
    or-int/2addr v2, v8

    .line 38
    invoke-virtual {v15, v1}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v2, v8

    and-int v8, v0, v38

    xor-int v8, v8, v31

    const/high16 v14, 0x20000

    if-le v8, v14, :cond_4b

    const/4 v8, 0x0

    .line 39
    invoke-virtual {v15, v8}, Ldefpackage/rg1;->d(I)Z

    move-result v19

    if-nez v19, :cond_4c

    :cond_4b
    and-int v0, v0, v31

    if-ne v0, v14, :cond_4d

    :cond_4c
    const/4 v0, 0x1

    goto :goto_1d

    :cond_4d
    const/4 v0, 0x0

    :goto_1d
    or-int/2addr v0, v2

    .line 40
    invoke-virtual {v15, v11}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 41
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4f

    if-ne v2, v13, :cond_4e

    goto :goto_1e

    :cond_4e
    move-object v1, v7

    move/from16 v0, v39

    const/16 v14, 0x20

    goto :goto_1f

    .line 42
    :cond_4f
    :goto_1e
    new-instance v2, Ldefpackage/pc3;

    move-object v8, v1

    move/from16 v0, v39

    const/16 v14, 0x20

    invoke-direct/range {v2 .. v11}, Ldefpackage/pc3;-><init>(Ldefpackage/lm0;Ldefpackage/ac3;FLdefpackage/rv2;Ldefpackage/k82;Ldefpackage/gf1;Ldefpackage/gs;Ldefpackage/rv2;Ldefpackage/we0;)V

    move-object v1, v7

    .line 43
    invoke-virtual {v15, v2}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 44
    :goto_1f
    move-object v9, v2

    check-cast v9, Ldefpackage/pc3;

    xor-int/lit8 v2, v20, 0x6

    if-le v2, v12, :cond_50

    .line 45
    invoke-virtual {v15, v3}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_51

    :cond_50
    and-int/lit8 v2, v16, 0x6

    if-ne v2, v12, :cond_52

    :cond_51
    const/16 v25, 0x1

    :goto_20
    const/4 v8, 0x0

    goto :goto_21

    :cond_52
    const/16 v25, 0x0

    goto :goto_20

    :goto_21
    invoke-virtual {v15, v8}, Ldefpackage/rg1;->f(Z)Z

    move-result v2

    or-int v2, v25, v2

    .line 46
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_53

    if-ne v4, v13, :cond_54

    .line 47
    :cond_53
    new-instance v4, Ldefpackage/s82;

    invoke-direct {v4, v3, v8}, Ldefpackage/s82;-><init>(Ldefpackage/lm0;Z)V

    .line 48
    invoke-virtual {v15, v4}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 49
    :cond_54
    check-cast v4, Ldefpackage/s82;

    if-ne v0, v14, :cond_55

    const/4 v2, 0x1

    goto :goto_22

    :cond_55
    const/4 v2, 0x0

    :goto_22
    and-int v5, v17, v38

    const/high16 v6, 0x20000

    if-ne v5, v6, :cond_56

    const/4 v5, 0x1

    goto :goto_23

    :cond_56
    const/4 v5, 0x0

    :goto_23
    or-int/2addr v2, v5

    .line 50
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_58

    if-ne v5, v13, :cond_57

    goto :goto_24

    :cond_57
    move-object/from16 v10, p3

    goto :goto_25

    .line 51
    :cond_58
    :goto_24
    new-instance v5, Ldefpackage/gd3;

    move-object/from16 v10, p3

    invoke-direct {v5, v10, v3}, Ldefpackage/gd3;-><init>(Ldefpackage/wg4;Ldefpackage/lm0;)V

    .line 52
    invoke-virtual {v15, v5}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 53
    :goto_25
    move-object v6, v5

    check-cast v6, Ldefpackage/gd3;

    .line 54
    sget-object v2, Ldefpackage/hv;->a:Ldefpackage/l90;

    .line 55
    invoke-virtual {v15, v2}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    move-result-object v2

    .line 56
    check-cast v2, Ldefpackage/fv;

    .line 57
    sget-object v5, Ldefpackage/g90;->n:Ldefpackage/wl4;

    .line 58
    invoke-virtual {v15, v5}, Ldefpackage/rg1;->i(Ldefpackage/qr3;)Ljava/lang/Object;

    move-result-object v5

    .line 59
    check-cast v5, Ldefpackage/r62;

    if-ne v0, v14, :cond_59

    const/4 v0, 0x1

    goto :goto_26

    :cond_59
    const/4 v0, 0x0

    .line 60
    :goto_26
    invoke-virtual {v15, v2}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v0, v7

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {v15, v7}, Ldefpackage/rg1;->d(I)Z

    move-result v7

    or-int/2addr v0, v7

    .line 61
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_5a

    if-ne v7, v13, :cond_5b

    .line 62
    :cond_5a
    new-instance v7, Ldefpackage/ec3;

    invoke-direct {v7, v3, v2, v5}, Ldefpackage/ec3;-><init>(Ldefpackage/lm0;Ldefpackage/fv;Ldefpackage/r62;)V

    .line 63
    invoke-virtual {v15, v7}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 64
    :cond_5b
    move-object v8, v7

    check-cast v8, Ldefpackage/ec3;

    .line 65
    sget-object v0, Ldefpackage/ax2;->a:Ldefpackage/ax2;

    if-eqz p4, :cond_64

    const v2, -0x32e2f41d    # -1.6467512E8f

    invoke-virtual {v15, v2}, Ldefpackage/rg1;->R(I)V

    shr-int/lit8 v2, v17, 0x15

    and-int/lit8 v2, v2, 0x70

    or-int v2, v20, v2

    and-int/lit8 v5, v2, 0xe

    xor-int/lit8 v5, v5, 0x6

    if-le v5, v12, :cond_5c

    .line 66
    invoke-virtual {v15, v3}, Ldefpackage/rg1;->e(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5d

    :cond_5c
    and-int/lit8 v5, v2, 0x6

    if-ne v5, v12, :cond_5e

    :cond_5d
    const/4 v5, 0x1

    goto :goto_27

    :cond_5e
    const/4 v5, 0x0

    :goto_27
    and-int/lit8 v7, v2, 0x70

    xor-int/lit8 v7, v7, 0x30

    if-le v7, v14, :cond_5f

    const/4 v7, 0x0

    invoke-virtual {v15, v7}, Ldefpackage/rg1;->d(I)Z

    move-result v16

    if-nez v16, :cond_60

    :cond_5f
    and-int/lit8 v2, v2, 0x30

    if-ne v2, v14, :cond_61

    :cond_60
    const/16 v28, 0x1

    goto :goto_28

    :cond_61
    const/16 v28, 0x0

    :goto_28
    or-int v2, v5, v28

    .line 67
    invoke-virtual {v15}, Ldefpackage/rg1;->H()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_62

    if-ne v5, v13, :cond_63

    .line 68
    :cond_62
    new-instance v5, Ldefpackage/dc3;

    invoke-direct {v5, v3}, Ldefpackage/dc3;-><init>(Ldefpackage/lm0;)V

    .line 69
    invoke-virtual {v15, v5}, Ldefpackage/rg1;->b0(Ljava/lang/Object;)V

    .line 70
    :cond_63
    check-cast v5, Ldefpackage/dc3;

    .line 71
    iget-object v2, v3, Ldefpackage/ad3;->v:Ldefpackage/hg3;

    .line 72
    invoke-static {v5, v2}, Ldefpackage/ji2;->y(Ldefpackage/dc3;Ldefpackage/hg3;)Ldefpackage/dx2;

    move-result-object v2

    const/4 v7, 0x0

    .line 73
    invoke-virtual {v15, v7}, Ldefpackage/rg1;->o(Z)V

    goto :goto_29

    :cond_64
    const/4 v7, 0x0

    const v2, -0x32dc6545

    .line 74
    invoke-virtual {v15, v2}, Ldefpackage/rg1;->R(I)V

    .line 75
    invoke-virtual {v15, v7}, Ldefpackage/rg1;->o(Z)V

    move-object v2, v0

    .line 76
    :goto_29
    iget-object v5, v3, Ldefpackage/ad3;->y:Ldefpackage/yc3;

    move-object/from16 v13, p0

    .line 77
    invoke-interface {v13, v5}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    move-result-object v5

    .line 78
    iget-object v14, v3, Ldefpackage/ad3;->w:Ldefpackage/io;

    .line 79
    invoke-interface {v5, v14}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    move-result-object v5

    move/from16 v14, p4

    .line 80
    invoke-static {v5, v1, v4, v14}, Ldefpackage/rr2;->L(Ldefpackage/dx2;Ldefpackage/k82;Ldefpackage/s82;Z)Ldefpackage/dx2;

    move-result-object v4

    if-eqz v14, :cond_65

    .line 81
    new-instance v0, Ldefpackage/ic3;

    invoke-direct {v0, v7, v3, v11}, Ldefpackage/ic3;-><init>(ZLdefpackage/lm0;Ldefpackage/we0;)V

    sget-object v5, Ldefpackage/f94;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 82
    new-instance v5, Ldefpackage/zh;

    invoke-direct {v5, v0}, Ldefpackage/zh;-><init>(Ldefpackage/if1;)V

    .line 83
    invoke-interface {v4, v5}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    move-result-object v0

    goto :goto_2a

    .line 84
    :cond_65
    invoke-interface {v4, v0}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    move-result-object v0

    .line 85
    :goto_2a
    invoke-interface {v0, v2}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    move-result-object v2

    .line 86
    iget-object v7, v3, Ldefpackage/ad3;->p:Ldefpackage/rm2;

    move-object/from16 v4, p5

    move v5, v14

    .line 87
    invoke-static/range {v2 .. v8}, Ldefpackage/vr1;->F(Ldefpackage/dx2;Ldefpackage/lm0;Ldefpackage/tb;ZLdefpackage/gd3;Ldefpackage/rm2;Ldefpackage/ec3;)Ldefpackage/dx2;

    move-result-object v0

    move-object v8, v3

    .line 88
    new-instance v2, Ldefpackage/si1;

    invoke-direct {v2, v12, v8}, Ldefpackage/si1;-><init>(ILjava/lang/Object;)V

    sget-object v3, Ldefpackage/gp4;->a:Ldefpackage/kn3;

    .line 89
    new-instance v3, Ldefpackage/fp4;

    const/4 v4, 0x0

    move/from16 v5, v35

    invoke-direct {v3, v8, v4, v2, v5}, Ldefpackage/fp4;-><init>(Ljava/lang/Object;Ldefpackage/uo;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 90
    invoke-interface {v0, v3}, Ldefpackage/dx2;->c(Ldefpackage/dx2;)Ldefpackage/dx2;

    move-result-object v0

    move-object/from16 v11, p8

    .line 91
    invoke-static {v0, v11}, Ldefpackage/te5;->F(Ldefpackage/dx2;Ldefpackage/y43;)Ldefpackage/dx2;

    move-result-object v3

    .line 92
    iget-object v4, v8, Ldefpackage/ad3;->t:Ldefpackage/q82;

    const/4 v7, 0x0

    move-object v2, v1

    move-object v5, v9

    move-object v6, v15

    .line 93
    invoke-static/range {v2 .. v7}, Ldefpackage/su3;->b(Ldefpackage/gf1;Ldefpackage/dx2;Ldefpackage/q82;Ldefpackage/pc3;Ldefpackage/rg1;I)V

    goto :goto_2b

    :cond_66
    move-object v10, v0

    move-object v8, v3

    move-object v11, v13

    move-object/from16 v13, p0

    .line 94
    invoke-virtual/range {p13 .. p13}, Ldefpackage/rg1;->N()V

    .line 95
    :goto_2b
    invoke-virtual/range {p13 .. p13}, Ldefpackage/rg1;->p()Ldefpackage/lv3;

    move-result-object v0

    if-eqz v0, :cond_67

    move-object v1, v0

    new-instance v0, Ldefpackage/i82;

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v12, p11

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v44, v1

    move-object v2, v8

    move-object v4, v10

    move-object v9, v11

    move-object v1, v13

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v15}, Ldefpackage/i82;-><init>(Ldefpackage/dx2;Ldefpackage/lm0;Ldefpackage/ac3;Ldefpackage/wg4;ZLdefpackage/tb;FLdefpackage/rv2;Ldefpackage/y43;Ldefpackage/if1;Ldefpackage/gs;Ldefpackage/rv2;Ldefpackage/r70;II)V

    move-object/from16 v1, v44

    .line 96
    iput-object v0, v1, Ldefpackage/lv3;->d:Ldefpackage/wf1;

    :cond_67
    return-void
.end method

.method public static final c(Ldefpackage/h03;I)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/h03;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/h03;->b(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iget v0, p0, Ldefpackage/h03;->b:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ldefpackage/h03;->b(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ne v0, p1, :cond_1

    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    iget v0, p0, Ldefpackage/h03;->b:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Ldefpackage/h03;->a(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    if-lez v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x1

    .line 31
    .line 32
    ushr-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ldefpackage/h03;->b(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-le p1, v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v0, v2}, Ldefpackage/h03;->d(II)V

    .line 43
    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0, v0, p1}, Ldefpackage/h03;->d(II)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/Long;
    .locals 9

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    invoke-static {p0}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    new-array v1, v0, [C

    .line 15
    .line 16
    const/16 v2, 0x3a

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-char v2, v1, v3

    .line 20
    .line 21
    invoke-static {p0, v1}, Ldefpackage/qm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x3

    .line 30
    if-eq v1, v2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1}, Ldefpackage/xm4;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0}, Ldefpackage/xm4;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    const/4 v0, 0x2

    .line 66
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/String;

    .line 71
    .line 72
    const/16 v0, 0x2e

    .line 73
    .line 74
    invoke-static {p0, v0}, Ldefpackage/qm4;->H0(Ljava/lang/String;C)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, Ldefpackage/xm4;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-eqz p0, :cond_2

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    const-wide/16 v7, 0x3c

    .line 89
    .line 90
    cmp-long p0, v3, v7

    .line 91
    .line 92
    if-gez p0, :cond_2

    .line 93
    .line 94
    cmp-long p0, v5, v7

    .line 95
    .line 96
    if-ltz p0, :cond_1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    mul-long/2addr v1, v7

    .line 100
    add-long/2addr v1, v3

    .line 101
    mul-long/2addr v1, v7

    .line 102
    add-long/2addr v1, v5

    .line 103
    const-wide/16 v3, 0x3e8

    .line 104
    .line 105
    mul-long/2addr v1, v3

    .line 106
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 112
    return-object p0
.end method

.method public static e(Ldefpackage/p81;I)Ldefpackage/p81;
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    if-gez p1, :cond_1

    .line 3
    .line 4
    const/4 v1, -0x2

    .line 5
    if-eq p1, v1, :cond_1

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string p0, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "

    .line 11
    .line 12
    invoke-static {p1, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ldefpackage/kf2;->e(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    :goto_0
    if-ne p1, v0, :cond_2

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    sget-object v0, Ldefpackage/wv;->o:Ldefpackage/wv;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    sget-object v0, Ldefpackage/wv;->n:Ldefpackage/wv;

    .line 28
    .line 29
    :goto_1
    instance-of v1, p0, Ldefpackage/jg1;

    .line 30
    .line 31
    sget-object v2, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    check-cast p0, Ldefpackage/jg1;

    .line 36
    .line 37
    invoke-interface {p0, v2, p1, v0}, Ldefpackage/jg1;->c(Ldefpackage/ne0;ILdefpackage/wv;)Ldefpackage/p81;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_3
    new-instance v1, Ldefpackage/b10;

    .line 43
    .line 44
    invoke-direct {v1, p0, v2, p1, v0}, Ldefpackage/a10;-><init>(Ldefpackage/p81;Ldefpackage/ne0;ILdefpackage/wv;)V

    .line 45
    .line 46
    .line 47
    return-object v1
.end method

.method public static final f(Ldefpackage/j91;Ldefpackage/q81;Ldefpackage/wd0;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, Ldefpackage/u81;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ldefpackage/u81;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/u81;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ldefpackage/u81;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/u81;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ldefpackage/u81;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/u81;->p:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Ldefpackage/u81;->n:Ldefpackage/jx3;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_2
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p2, Ldefpackage/jx3;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    :try_start_1
    new-instance v1, Ldefpackage/gs0;

    .line 58
    .line 59
    invoke-direct {v1, p1, p2}, Ldefpackage/gs0;-><init>(Ldefpackage/q81;Ldefpackage/jx3;)V

    .line 60
    .line 61
    .line 62
    iput-object p2, v0, Ldefpackage/u81;->n:Ldefpackage/jx3;

    .line 63
    .line 64
    iput v3, v0, Ldefpackage/u81;->p:I

    .line 65
    .line 66
    invoke-virtual {p0, v1, v0}, Ldefpackage/j91;->a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    sget-object p1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 71
    .line 72
    if-ne p0, p1, :cond_3

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_3
    :goto_1
    return-object v2

    .line 76
    :catchall_1
    move-exception p1

    .line 77
    move-object p0, p2

    .line 78
    :goto_2
    iget-object p0, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Ljava/lang/Throwable;

    .line 81
    .line 82
    if-eqz p0, :cond_4

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_6

    .line 89
    .line 90
    :cond_4
    invoke-interface {v0}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    sget-object v0, Ldefpackage/fz0;->h0:Ldefpackage/fz0;

    .line 95
    .line 96
    invoke-interface {p2, v0}, Ldefpackage/ne0;->K(Ldefpackage/me0;)Ldefpackage/le0;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Ldefpackage/s22;

    .line 101
    .line 102
    if-eqz p2, :cond_7

    .line 103
    .line 104
    invoke-interface {p2}, Ldefpackage/s22;->isCancelled()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    invoke-interface {p2}, Ldefpackage/s22;->q()Ljava/util/concurrent/CancellationException;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    if-eqz p2, :cond_7

    .line 116
    .line 117
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-nez p2, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    throw p1

    .line 125
    :cond_7
    :goto_3
    if-nez p0, :cond_8

    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_8
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 129
    .line 130
    if-eqz p2, :cond_9

    .line 131
    .line 132
    invoke-static {p0, p1}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_9
    invoke-static {p1, p0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw p1
.end method

.method public static g(I)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt v0, p0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x25

    .line 5
    .line 6
    if-ge p0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string v1, "radix "

    .line 10
    .line 11
    const-string v2, " was not in valid range "

    .line 12
    .line 13
    invoke-static {p0, v1, v2}, Ldefpackage/f34;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v1, Ldefpackage/j02;

    .line 18
    .line 19
    const/16 v2, 0x24

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v1, v0, v2, v3}, Ldefpackage/h02;-><init>(III)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1, p0}, Ldefpackage/kf2;->g(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static h()[F
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public static i(Ldefpackage/vd0;Ldefpackage/vd0;Ldefpackage/wf1;)Ldefpackage/vd0;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Ldefpackage/jp;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p2, Ldefpackage/jp;

    .line 9
    .line 10
    invoke-virtual {p2, p0, p1}, Ldefpackage/jp;->create(Ljava/lang/Object;Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p1}, Ldefpackage/vd0;->getContext()Ldefpackage/ne0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget-object v1, Ldefpackage/q01;->n:Ldefpackage/q01;

    .line 20
    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    new-instance v0, Ldefpackage/i12;

    .line 24
    .line 25
    invoke-direct {v0, p1, p0, p2}, Ldefpackage/i12;-><init>(Ldefpackage/vd0;Ldefpackage/vd0;Ldefpackage/wf1;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    new-instance v1, Ldefpackage/j12;

    .line 30
    .line 31
    invoke-direct {v1, p1, v0, p2, p0}, Ldefpackage/j12;-><init>(Ldefpackage/vd0;Ldefpackage/ne0;Ldefpackage/wf1;Ldefpackage/vd0;)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public static j(Landroid/os/Bundle;Landroid/os/Bundle;)Ldefpackage/b54;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    move-object p0, p1

    .line 4
    :cond_0
    if-nez p0, :cond_1

    .line 5
    .line 6
    new-instance p0, Ldefpackage/b54;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance p1, Ldefpackage/z40;

    .line 17
    .line 18
    sget-object v0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ldefpackage/z40;-><init>(Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/b54;->a:Ldefpackage/z40;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    const-class p1, Ldefpackage/b54;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/os/BaseBundle;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    new-instance v0, Ldefpackage/ag2;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Ldefpackage/ag2;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v1, v2}, Ldefpackage/ag2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v0}, Ldefpackage/ag2;->b()Ldefpackage/ag2;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    new-instance p1, Ldefpackage/b54;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v0, Ldefpackage/z40;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Ldefpackage/z40;-><init>(Ljava/util/Map;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p1, Ldefpackage/b54;->a:Ldefpackage/z40;

    .line 98
    .line 99
    return-object p1
.end method

.method public static k(Ljava/lang/String;)[B
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const/16 v0, 0xb

    .line 6
    .line 7
    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final m(Ldefpackage/p81;)Ldefpackage/p81;
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/ll4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Ldefpackage/hs0;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, Ldefpackage/hs0;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ldefpackage/hs0;-><init>(Ldefpackage/p81;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static n([B)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const/16 v0, 0xb

    .line 6
    .line 7
    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final o(CCZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eq p0, p1, :cond_3

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    :goto_0
    return v0
.end method

.method public static final p(Ldefpackage/gc0;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Ldefpackage/xl;->e:Ldefpackage/f01;

    .line 2
    .line 3
    instance-of v1, p1, Ldefpackage/d91;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Ldefpackage/d91;

    .line 9
    .line 10
    iget v2, v1, Ldefpackage/d91;->q:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ldefpackage/d91;->q:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ldefpackage/d91;

    .line 23
    .line 24
    invoke-direct {v1, p1}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Ldefpackage/d91;->p:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Ldefpackage/d91;->q:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v1, Ldefpackage/d91;->o:Ldefpackage/fc0;

    .line 38
    .line 39
    iget-object v1, v1, Ldefpackage/d91;->n:Ldefpackage/jx3;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Ldefpackage/jx3;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 62
    .line 63
    new-instance v2, Ldefpackage/fc0;

    .line 64
    .line 65
    invoke-direct {v2, v4, p1}, Ldefpackage/fc0;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    iput-object p1, v1, Ldefpackage/d91;->n:Ldefpackage/jx3;

    .line 69
    .line 70
    iput-object v2, v1, Ldefpackage/d91;->o:Ldefpackage/fc0;

    .line 71
    .line 72
    iput v4, v1, Ldefpackage/d91;->q:I

    .line 73
    .line 74
    invoke-virtual {p0, v2, v1}, Ldefpackage/gc0;->a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    sget-object v1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 79
    .line 80
    if-ne p0, v1, :cond_3

    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_3
    move-object v1, p1

    .line 84
    goto :goto_2

    .line 85
    :catch_1
    move-exception p0

    .line 86
    move-object v1, p1

    .line 87
    move-object p1, p0

    .line 88
    move-object p0, v2

    .line 89
    :goto_1
    iget-object v2, p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;->n:Ljava/lang/Object;

    .line 90
    .line 91
    if-ne v2, p0, :cond_5

    .line 92
    .line 93
    :goto_2
    iget-object p0, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 94
    .line 95
    if-eq p0, v0, :cond_4

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_4
    const-string p0, "Expected at least one element"

    .line 99
    .line 100
    invoke-static {p0}, Ldefpackage/kf2;->m(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :cond_5
    throw p1
.end method

.method public static final q(Ldefpackage/p81;Ldefpackage/wf1;Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Ldefpackage/xl;->e:Ldefpackage/f01;

    .line 2
    .line 3
    instance-of v1, p2, Ldefpackage/e91;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Ldefpackage/e91;

    .line 9
    .line 10
    iget v2, v1, Ldefpackage/e91;->r:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Ldefpackage/e91;->r:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Ldefpackage/e91;

    .line 23
    .line 24
    invoke-direct {v1, p2}, Ldefpackage/wd0;-><init>(Ldefpackage/vd0;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Ldefpackage/e91;->q:Ljava/lang/Object;

    .line 28
    .line 29
    iget v2, v1, Ldefpackage/e91;->r:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v1, Ldefpackage/e91;->p:Ldefpackage/lv0;

    .line 37
    .line 38
    iget-object p1, v1, Ldefpackage/e91;->o:Ldefpackage/jx3;

    .line 39
    .line 40
    iget-object v1, v1, Ldefpackage/e91;->n:Ldefpackage/ep4;

    .line 41
    .line 42
    check-cast v1, Ldefpackage/wf1;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p2

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    invoke-static {p2}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p2, Ldefpackage/jx3;

    .line 61
    .line 62
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance v2, Ldefpackage/lv0;

    .line 68
    .line 69
    invoke-direct {v2, v3, p1, p2}, Ldefpackage/lv0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    move-object v4, p1

    .line 73
    check-cast v4, Ldefpackage/ep4;

    .line 74
    .line 75
    iput-object v4, v1, Ldefpackage/e91;->n:Ldefpackage/ep4;

    .line 76
    .line 77
    iput-object p2, v1, Ldefpackage/e91;->o:Ldefpackage/jx3;

    .line 78
    .line 79
    iput-object v2, v1, Ldefpackage/e91;->p:Ldefpackage/lv0;

    .line 80
    .line 81
    iput v3, v1, Ldefpackage/e91;->r:I

    .line 82
    .line 83
    invoke-interface {p0, v2, v1}, Ldefpackage/p81;->a(Ldefpackage/q81;Ldefpackage/vd0;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    .line 87
    sget-object v1, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 88
    .line 89
    if-ne p0, v1, :cond_3

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_3
    move-object v1, p1

    .line 93
    move-object p1, p2

    .line 94
    goto :goto_2

    .line 95
    :catch_1
    move-exception p0

    .line 96
    move-object v1, p1

    .line 97
    move-object p1, p2

    .line 98
    move-object p2, p0

    .line 99
    move-object p0, v2

    .line 100
    :goto_1
    iget-object v2, p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;->n:Ljava/lang/Object;

    .line 101
    .line 102
    if-ne v2, p0, :cond_5

    .line 103
    .line 104
    :goto_2
    iget-object p0, p1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 105
    .line 106
    if-eq p0, v0, :cond_4

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 110
    .line 111
    new-instance p1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string p2, "Expected at least one element matching the predicate "

    .line 114
    .line 115
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p0

    .line 129
    :cond_5
    throw p2
.end method

.method public static r(Ldefpackage/le0;Ldefpackage/me0;)Ldefpackage/le0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ldefpackage/le0;->getKey()Ldefpackage/me0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public static t()Ldefpackage/ch4;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/jh4;->b:Ldefpackage/z05;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/z05;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/ch4;

    .line 8
    .line 9
    return-object v0
.end method

.method public static u(Landroid/content/Context;)Landroid/graphics/Rect;
    .locals 2

    .line 1
    const-string v0, "window"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/WindowManager;

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1e

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/hb5;->g(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Ldefpackage/hb5;->d(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, Landroid/graphics/Point;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Landroid/graphics/Rect;

    .line 37
    .line 38
    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    .line 39
    .line 40
    .line 41
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 42
    .line 43
    iput v1, p0, Landroid/graphics/Rect;->right:I

    .line 44
    .line 45
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 46
    .line 47
    iput v0, p0, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    return-object p0
.end method

.method public static v(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0xffffff

    .line 5
    .line 6
    .line 7
    if-gt p1, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method public static w(Ldefpackage/mh;)Ldefpackage/mo3;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ldefpackage/mo3;

    .line 8
    .line 9
    invoke-static {p0}, Ldefpackage/ne;->o(Ldefpackage/mh;)Landroid/text/PrecomputedText$Params;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Ldefpackage/mo3;-><init>(Landroid/text/PrecomputedText$Params;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v2, Landroid/text/TextPaint;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v2, v3}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 24
    .line 25
    .line 26
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/widget/TextView;->getBreakStrategy()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {p0}, Landroid/widget/TextView;->getHyphenationFrequency()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    instance-of v6, v6, Landroid/text/method/PasswordTransformationMethod;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/4 v6, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    if-lt v0, v1, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    and-int/lit8 v0, v0, 0xf

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    if-ne v0, v1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Landroid/icu/text/DecimalFormatSymbols;->getInstance(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Ldefpackage/ne;->d(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    aget-object p0, p0, v7

    .line 73
    .line 74
    invoke-virtual {p0, v7}, Ljava/lang/String;->codePointAt(I)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(I)B

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eq p0, v6, :cond_3

    .line 83
    .line 84
    const/4 v0, 0x2

    .line 85
    if-ne p0, v0, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    :goto_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-ne v0, v6, :cond_5

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    move v6, v7

    .line 102
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    packed-switch p0, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    if-eqz v6, :cond_6

    .line 110
    .line 111
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :pswitch_0
    sget-object v3, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :pswitch_1
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :pswitch_2
    sget-object v3, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :pswitch_3
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :pswitch_4
    sget-object v3, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    .line 127
    .line 128
    :cond_6
    :goto_2
    :pswitch_5
    new-instance p0, Ldefpackage/mo3;

    .line 129
    .line 130
    invoke-direct {p0, v2, v3, v4, v5}, Ldefpackage/mo3;-><init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V

    .line 131
    .line 132
    .line 133
    return-object p0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_5
        :pswitch_0
    .end packed-switch
.end method

.method public static x(Ldefpackage/vd0;)Ldefpackage/vd0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Ldefpackage/wd0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Ldefpackage/wd0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Ldefpackage/wd0;->intercepted()Ldefpackage/vd0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    return-object v0

    .line 23
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static y(C)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static z(Ldefpackage/ch4;)Ldefpackage/ch4;
    .locals 6

    .line 1
    instance-of v0, p0, Ldefpackage/ox4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Ldefpackage/ox4;

    .line 8
    .line 9
    iget-wide v2, v0, Ldefpackage/ox4;->t:J

    .line 10
    .line 11
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    cmp-long v2, v2, v4

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    iput-object v1, v0, Ldefpackage/ox4;->r:Ldefpackage/if1;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    instance-of v0, p0, Ldefpackage/px4;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    check-cast v0, Ldefpackage/px4;

    .line 28
    .line 29
    iget-wide v2, v0, Ldefpackage/px4;->i:J

    .line 30
    .line 31
    invoke-static {}, Ldefpackage/te5;->m()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    iput-object v1, v0, Ldefpackage/px4;->h:Ldefpackage/if1;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    invoke-static {p0, v1, v0}, Ldefpackage/jh4;->g(Ldefpackage/ch4;Ldefpackage/if1;Z)Ldefpackage/ch4;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ldefpackage/ch4;->j()Ldefpackage/ch4;

    .line 48
    .line 49
    .line 50
    return-object p0
.end method


# virtual methods
.method public abstract l(Ldefpackage/g60;)I
.end method

.method public abstract s()Ldefpackage/wv3;
.end method
