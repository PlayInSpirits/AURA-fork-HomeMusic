.class public final Ljd3;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lu62;
.implements Lrv0;


# instance fields
.field public B:Lhd3;

.field public C:Z

.field public D:Lhs;

.field public E:Li80;

.field public F:F

.field public G:Ldt;


# direct methods
.method public static q0(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Lqf4;->a(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide v0, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v0

    .line 18
    long-to-int p0, p0

    .line 19
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const p1, 0x7fffffff

    .line 28
    .line 29
    .line 30
    and-int/2addr p0, p1

    .line 31
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 32
    .line 33
    if-ge p0, p1, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static r0(J)Z
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1}, Lqf4;->a(JJ)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0x20

    .line 13
    .line 14
    shr-long/2addr p0, v0

    .line 15
    long-to-int p0, p0

    .line 16
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const p1, 0x7fffffff

    .line 25
    .line 26
    .line 27
    and-int/2addr p0, p1

    .line 28
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 29
    .line 30
    if-ge p0, p1, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method


# virtual methods
.method public final S(Le72;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v6, v1, Le72;->n:Lmz;

    .line 6
    .line 7
    iget-object v2, v0, Ljd3;->B:Lhd3;

    .line 8
    .line 9
    invoke-virtual {v2}, Lhd3;->d()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    invoke-static {v2, v3}, Ljd3;->r0(J)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    const/16 v5, 0x20

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    shr-long v7, v2, v5

    .line 22
    .line 23
    long-to-int v4, v7

    .line 24
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v6}, Lsv0;->P()J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    shr-long/2addr v7, v5

    .line 34
    long-to-int v4, v7

    .line 35
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    :goto_0
    invoke-static {v2, v3}, Ljd3;->q0(J)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    const-wide v8, 0xffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    if-eqz v7, :cond_1

    .line 49
    .line 50
    and-long/2addr v2, v8

    .line 51
    long-to-int v2, v2

    .line 52
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-interface {v6}, Lsv0;->P()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    and-long/2addr v2, v8

    .line 62
    long-to-int v2, v2

    .line 63
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    :goto_1
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    int-to-long v3, v3

    .line 72
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    int-to-long v10, v2

    .line 77
    shl-long v2, v3, v5

    .line 78
    .line 79
    and-long/2addr v10, v8

    .line 80
    or-long/2addr v2, v10

    .line 81
    invoke-interface {v6}, Lsv0;->P()J

    .line 82
    .line 83
    .line 84
    move-result-wide v10

    .line 85
    shr-long/2addr v10, v5

    .line 86
    long-to-int v4, v10

    .line 87
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    const/4 v7, 0x0

    .line 92
    cmpg-float v4, v4, v7

    .line 93
    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    invoke-interface {v6}, Lsv0;->P()J

    .line 98
    .line 99
    .line 100
    move-result-wide v10

    .line 101
    and-long/2addr v10, v8

    .line 102
    long-to-int v4, v10

    .line 103
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    cmpg-float v4, v4, v7

    .line 108
    .line 109
    if-nez v4, :cond_3

    .line 110
    .line 111
    :goto_2
    const-wide/16 v2, 0x0

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    iget-object v4, v0, Ljd3;->E:Li80;

    .line 115
    .line 116
    invoke-interface {v6}, Lsv0;->P()J

    .line 117
    .line 118
    .line 119
    move-result-wide v10

    .line 120
    invoke-virtual {v4, v2, v3, v10, v11}, Li80;->h(JJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    invoke-static {v2, v3, v10, v11}, Lq05;->z(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    :goto_3
    iget-object v10, v0, Ljd3;->D:Lhs;

    .line 129
    .line 130
    shr-long v11, v2, v5

    .line 131
    .line 132
    long-to-int v4, v11

    .line 133
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    and-long v11, v2, v8

    .line 142
    .line 143
    long-to-int v7, v11

    .line 144
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    int-to-long v11, v4

    .line 153
    shl-long/2addr v11, v5

    .line 154
    int-to-long v13, v7

    .line 155
    and-long/2addr v13, v8

    .line 156
    or-long/2addr v11, v13

    .line 157
    invoke-interface {v6}, Lsv0;->P()J

    .line 158
    .line 159
    .line 160
    move-result-wide v13

    .line 161
    shr-long/2addr v13, v5

    .line 162
    long-to-int v4, v13

    .line 163
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-interface {v6}, Lsv0;->P()J

    .line 172
    .line 173
    .line 174
    move-result-wide v13

    .line 175
    and-long/2addr v13, v8

    .line 176
    long-to-int v7, v13

    .line 177
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    int-to-long v13, v4

    .line 186
    shl-long/2addr v13, v5

    .line 187
    move-wide/from16 v16, v8

    .line 188
    .line 189
    int-to-long v8, v7

    .line 190
    and-long v7, v8, v16

    .line 191
    .line 192
    or-long/2addr v13, v7

    .line 193
    invoke-virtual {v1}, Le72;->getLayoutDirection()Lr62;

    .line 194
    .line 195
    .line 196
    move-result-object v15

    .line 197
    invoke-virtual/range {v10 .. v15}, Lhs;->a(JJLr62;)J

    .line 198
    .line 199
    .line 200
    move-result-wide v7

    .line 201
    shr-long v4, v7, v5

    .line 202
    .line 203
    long-to-int v4, v4

    .line 204
    int-to-float v9, v4

    .line 205
    and-long v4, v7, v16

    .line 206
    .line 207
    long-to-int v4, v4

    .line 208
    int-to-float v7, v4

    .line 209
    iget-object v4, v6, Lmz;->o:Li61;

    .line 210
    .line 211
    iget-object v4, v4, Li61;->o:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v4, Lzg5;

    .line 214
    .line 215
    invoke-virtual {v4, v9, v7}, Lzg5;->C(FF)V

    .line 216
    .line 217
    .line 218
    :try_start_0
    iget-object v4, v0, Ljd3;->B:Lhd3;

    .line 219
    .line 220
    move-object v5, v4

    .line 221
    iget v4, v0, Ljd3;->F:F

    .line 222
    .line 223
    iget-object v0, v0, Ljd3;->G:Ldt;

    .line 224
    .line 225
    move-object/from16 v18, v5

    .line 226
    .line 227
    move-object v5, v0

    .line 228
    move-object/from16 v0, v18

    .line 229
    .line 230
    invoke-virtual/range {v0 .. v5}, Lhd3;->c(Le72;JFLdt;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 231
    .line 232
    .line 233
    iget-object v0, v6, Lmz;->o:Li61;

    .line 234
    .line 235
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Lzg5;

    .line 238
    .line 239
    neg-float v1, v9

    .line 240
    neg-float v2, v7

    .line 241
    invoke-virtual {v0, v1, v2}, Lzg5;->C(FF)V

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {p1 .. p1}, Le72;->a()V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :catchall_0
    move-exception v0

    .line 249
    iget-object v1, v6, Lmz;->o:Li61;

    .line 250
    .line 251
    iget-object v1, v1, Li61;->o:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v1, Lzg5;

    .line 254
    .line 255
    neg-float v2, v9

    .line 256
    neg-float v3, v7

    .line 257
    invoke-virtual {v1, v2, v3}, Lzg5;->C(FF)V

    .line 258
    .line 259
    .line 260
    throw v0
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final r(Lcf2;Lpi2;J)Lvi2;
    .locals 11

    .line 1
    invoke-static {p3, p4}, Lnc0;->d(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p3, p4}, Lnc0;->c(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v1

    .line 18
    :goto_0
    invoke-static {p3, p4}, Lnc0;->f(J)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    invoke-static {p3, p4}, Lnc0;->e(J)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    move v1, v2

    .line 31
    :cond_1
    iget-boolean v2, p0, Ljd3;->C:Z

    .line 32
    .line 33
    const-wide v3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Ljd3;->B:Lhd3;

    .line 41
    .line 42
    invoke-virtual {v2}, Lhd3;->d()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    cmp-long v2, v5, v3

    .line 47
    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    if-nez v0, :cond_b

    .line 52
    .line 53
    :goto_1
    if-eqz v1, :cond_3

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Ljd3;->B:Lhd3;

    .line 58
    .line 59
    invoke-virtual {v0}, Lhd3;->d()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-static {v0, v1}, Ljd3;->r0(J)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/16 v5, 0x20

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    shr-long v6, v0, v5

    .line 72
    .line 73
    long-to-int v2, v6

    .line 74
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    invoke-static {p3, p4}, Lnc0;->j(J)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    :goto_2
    invoke-static {v0, v1}, Ljd3;->q0(J)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    const-wide v7, 0xffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    if-eqz v6, :cond_5

    .line 97
    .line 98
    and-long/2addr v0, v7

    .line 99
    long-to-int v0, v0

    .line 100
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-static {p3, p4}, Lnc0;->i(J)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    :goto_3
    invoke-static {v2, p3, p4}, Lqc0;->f(IJ)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-static {v0, p3, p4}, Lqc0;->e(IJ)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    int-to-float v1, v1

    .line 122
    int-to-float v0, v0

    .line 123
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    int-to-long v1, v1

    .line 128
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    int-to-long v9, v0

    .line 133
    shl-long v0, v1, v5

    .line 134
    .line 135
    and-long/2addr v9, v7

    .line 136
    or-long/2addr v0, v9

    .line 137
    iget-boolean v2, p0, Ljd3;->C:Z

    .line 138
    .line 139
    if-eqz v2, :cond_a

    .line 140
    .line 141
    iget-object v2, p0, Ljd3;->B:Lhd3;

    .line 142
    .line 143
    invoke-virtual {v2}, Lhd3;->d()J

    .line 144
    .line 145
    .line 146
    move-result-wide v9

    .line 147
    cmp-long v2, v9, v3

    .line 148
    .line 149
    if-eqz v2, :cond_a

    .line 150
    .line 151
    iget-object v2, p0, Ljd3;->B:Lhd3;

    .line 152
    .line 153
    invoke-virtual {v2}, Lhd3;->d()J

    .line 154
    .line 155
    .line 156
    move-result-wide v2

    .line 157
    invoke-static {v2, v3}, Ljd3;->r0(J)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-nez v2, :cond_6

    .line 162
    .line 163
    shr-long v2, v0, v5

    .line 164
    .line 165
    long-to-int v2, v2

    .line 166
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    goto :goto_4

    .line 171
    :cond_6
    iget-object v2, p0, Ljd3;->B:Lhd3;

    .line 172
    .line 173
    invoke-virtual {v2}, Lhd3;->d()J

    .line 174
    .line 175
    .line 176
    move-result-wide v2

    .line 177
    shr-long/2addr v2, v5

    .line 178
    long-to-int v2, v2

    .line 179
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    :goto_4
    iget-object v3, p0, Ljd3;->B:Lhd3;

    .line 184
    .line 185
    invoke-virtual {v3}, Lhd3;->d()J

    .line 186
    .line 187
    .line 188
    move-result-wide v3

    .line 189
    invoke-static {v3, v4}, Ljd3;->q0(J)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_7

    .line 194
    .line 195
    and-long v3, v0, v7

    .line 196
    .line 197
    long-to-int v3, v3

    .line 198
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    goto :goto_5

    .line 203
    :cond_7
    iget-object v3, p0, Ljd3;->B:Lhd3;

    .line 204
    .line 205
    invoke-virtual {v3}, Lhd3;->d()J

    .line 206
    .line 207
    .line 208
    move-result-wide v3

    .line 209
    and-long/2addr v3, v7

    .line 210
    long-to-int v3, v3

    .line 211
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    :goto_5
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    int-to-long v9, v2

    .line 220
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    int-to-long v2, v2

    .line 225
    shl-long/2addr v9, v5

    .line 226
    and-long/2addr v2, v7

    .line 227
    or-long/2addr v2, v9

    .line 228
    shr-long v9, v0, v5

    .line 229
    .line 230
    long-to-int v4, v9

    .line 231
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    const/4 v6, 0x0

    .line 236
    cmpg-float v4, v4, v6

    .line 237
    .line 238
    if-nez v4, :cond_8

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_8
    and-long v9, v0, v7

    .line 242
    .line 243
    long-to-int v4, v9

    .line 244
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    cmpg-float v4, v4, v6

    .line 249
    .line 250
    if-nez v4, :cond_9

    .line 251
    .line 252
    :goto_6
    const-wide/16 v0, 0x0

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_9
    iget-object p0, p0, Ljd3;->E:Li80;

    .line 256
    .line 257
    invoke-virtual {p0, v2, v3, v0, v1}, Li80;->h(JJ)J

    .line 258
    .line 259
    .line 260
    move-result-wide v0

    .line 261
    invoke-static {v2, v3, v0, v1}, Lq05;->z(JJ)J

    .line 262
    .line 263
    .line 264
    move-result-wide v0

    .line 265
    :cond_a
    :goto_7
    shr-long v2, v0, v5

    .line 266
    .line 267
    long-to-int p0, v2

    .line 268
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 269
    .line 270
    .line 271
    move-result p0

    .line 272
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 273
    .line 274
    .line 275
    move-result p0

    .line 276
    invoke-static {p0, p3, p4}, Lqc0;->f(IJ)I

    .line 277
    .line 278
    .line 279
    move-result p0

    .line 280
    and-long/2addr v0, v7

    .line 281
    long-to-int v0, v0

    .line 282
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    invoke-static {v0, p3, p4}, Lqc0;->e(IJ)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    invoke-static {p0, v0, p3, p4}, Lnc0;->a(IIJ)J

    .line 295
    .line 296
    .line 297
    move-result-wide p3

    .line 298
    goto :goto_9

    .line 299
    :cond_b
    :goto_8
    invoke-static {p3, p4}, Lnc0;->h(J)I

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    invoke-static {p3, p4}, Lnc0;->g(J)I

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-static {p0, v0, p3, p4}, Lnc0;->a(IIJ)J

    .line 308
    .line 309
    .line 310
    move-result-wide p3

    .line 311
    :goto_9
    invoke-interface {p2, p3, p4}, Lpi2;->r(J)Ljg3;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    iget p2, p0, Ljg3;->n:I

    .line 316
    .line 317
    iget p3, p0, Ljg3;->o:I

    .line 318
    .line 319
    new-instance p4, Lla;

    .line 320
    .line 321
    const/4 v0, 0x3

    .line 322
    invoke-direct {p4, p0, v0}, Lla;-><init>(Ljg3;I)V

    .line 323
    .line 324
    .line 325
    sget-object p0, Lv01;->n:Lv01;

    .line 326
    .line 327
    invoke-interface {p1, p2, p3, p0, p4}, Lwi2;->v(IILjava/util/Map;Lif1;)Lvi2;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Ljd3;->B:Lhd3;

    .line 2
    .line 3
    iget-boolean v1, p0, Ljd3;->C:Z

    .line 4
    .line 5
    iget-object v2, p0, Ljd3;->D:Lhs;

    .line 6
    .line 7
    iget v3, p0, Ljd3;->F:F

    .line 8
    .line 9
    iget-object p0, p0, Ljd3;->G:Ldt;

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v5, "PainterModifier(painter="

    .line 14
    .line 15
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", sizeToIntrinsics="

    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", alignment="

    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", alpha="

    .line 38
    .line 39
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", colorFilter="

    .line 46
    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, ")"

    .line 54
    .line 55
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method
