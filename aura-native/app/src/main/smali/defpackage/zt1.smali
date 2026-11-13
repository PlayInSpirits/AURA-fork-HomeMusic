.class public final Ldefpackage/zt1;
.super Ldefpackage/fh0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public n:Z

.field public final o:I

.field public final p:Ldefpackage/tu;

.field public final q:Ldefpackage/tu;

.field public r:I

.field public s:[B

.field public t:I

.field public final synthetic u:Ldefpackage/cu1;


# direct methods
.method public constructor <init>(Ldefpackage/cu1;I[I[I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/zt1;->u:Ldefpackage/cu1;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Ldefpackage/zt1;->n:Z

    .line 8
    .line 9
    iput p1, p0, Ldefpackage/zt1;->r:I

    .line 10
    .line 11
    new-array v0, p1, [B

    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/zt1;->s:[B

    .line 14
    .line 15
    iput p1, p0, Ldefpackage/zt1;->t:I

    .line 16
    .line 17
    iput p2, p0, Ldefpackage/zt1;->o:I

    .line 18
    .line 19
    invoke-static {p3}, Ldefpackage/cu1;->b([I)Ldefpackage/tu;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Ldefpackage/zt1;->p:Ldefpackage/tu;

    .line 24
    .line 25
    invoke-static {p4}, Ldefpackage/cu1;->b([I)Ldefpackage/tu;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ldefpackage/zt1;->q:Ldefpackage/tu;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/zt1;->t:I

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/zt1;->r:I

    .line 4
    .line 5
    sub-int/2addr v0, p0

    .line 6
    return v0
.end method

.method public final o()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ldefpackage/zt1;->n:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final r([BII)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    iget-boolean v5, v0, Ldefpackage/zt1;->n:Z

    .line 14
    .line 15
    if-eqz v5, :cond_1

    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    return v0

    .line 19
    :cond_1
    iget v5, v0, Ldefpackage/zt1;->t:I

    .line 20
    .line 21
    iget v6, v0, Ldefpackage/zt1;->r:I

    .line 22
    .line 23
    sub-int/2addr v5, v6

    .line 24
    if-lez v5, :cond_2

    .line 25
    .line 26
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    iget-object v6, v0, Ldefpackage/zt1;->s:[B

    .line 31
    .line 32
    iget v7, v0, Ldefpackage/zt1;->r:I

    .line 33
    .line 34
    invoke-static {v6, v7, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget v6, v0, Ldefpackage/zt1;->r:I

    .line 38
    .line 39
    add-int/2addr v6, v5

    .line 40
    iput v6, v0, Ldefpackage/zt1;->r:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v5, v4

    .line 44
    :goto_0
    if-ge v5, v3, :cond_e

    .line 45
    .line 46
    iget-object v6, v0, Ldefpackage/zt1;->u:Ldefpackage/cu1;

    .line 47
    .line 48
    iget-object v7, v6, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 49
    .line 50
    iget-object v8, v6, Ldefpackage/cu1;->r:Ldefpackage/i;

    .line 51
    .line 52
    iget-object v9, v8, Ldefpackage/i;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v9, [B

    .line 55
    .line 56
    iget-object v10, v0, Ldefpackage/zt1;->p:Ldefpackage/tu;

    .line 57
    .line 58
    invoke-static {v7, v10}, Ldefpackage/cu1;->f(Ldefpackage/qs;Ldefpackage/tu;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const v10, 0xffff

    .line 63
    .line 64
    .line 65
    const/4 v11, 0x1

    .line 66
    const/16 v12, 0x100

    .line 67
    .line 68
    if-ge v7, v12, :cond_4

    .line 69
    .line 70
    add-int/lit8 v6, v5, 0x1

    .line 71
    .line 72
    add-int/2addr v5, v2

    .line 73
    int-to-byte v7, v7

    .line 74
    iget v12, v8, Ldefpackage/i;->a:I

    .line 75
    .line 76
    aput-byte v7, v9, v12

    .line 77
    .line 78
    add-int/lit8 v9, v12, 0x1

    .line 79
    .line 80
    and-int/2addr v9, v10

    .line 81
    iget-boolean v10, v8, Ldefpackage/i;->b:Z

    .line 82
    .line 83
    if-nez v10, :cond_3

    .line 84
    .line 85
    if-ge v9, v12, :cond_3

    .line 86
    .line 87
    iput-boolean v11, v8, Ldefpackage/i;->b:Z

    .line 88
    .line 89
    :cond_3
    iput v9, v8, Ldefpackage/i;->a:I

    .line 90
    .line 91
    aput-byte v7, v1, v5

    .line 92
    .line 93
    move/from16 v17, v4

    .line 94
    .line 95
    :goto_1
    move v5, v6

    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_4
    if-le v7, v12, :cond_d

    .line 99
    .line 100
    sget-object v12, Ldefpackage/cu1;->s:[S

    .line 101
    .line 102
    add-int/lit16 v7, v7, -0x101

    .line 103
    .line 104
    aget-short v7, v12, v7

    .line 105
    .line 106
    ushr-int/lit8 v12, v7, 0x5

    .line 107
    .line 108
    and-int/lit8 v7, v7, 0x1f

    .line 109
    .line 110
    int-to-long v12, v12

    .line 111
    iget-object v14, v6, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 112
    .line 113
    invoke-static {v14, v7}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 114
    .line 115
    .line 116
    move-result-wide v14

    .line 117
    add-long/2addr v14, v12

    .line 118
    long-to-int v7, v14

    .line 119
    iget-object v12, v6, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 120
    .line 121
    iget-object v13, v0, Ldefpackage/zt1;->q:Ldefpackage/tu;

    .line 122
    .line 123
    invoke-static {v12, v13}, Ldefpackage/cu1;->f(Ldefpackage/qs;Ldefpackage/tu;)I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    sget-object v13, Ldefpackage/cu1;->t:[I

    .line 128
    .line 129
    aget v12, v13, v12

    .line 130
    .line 131
    ushr-int/lit8 v13, v12, 0x4

    .line 132
    .line 133
    and-int/lit8 v12, v12, 0xf

    .line 134
    .line 135
    int-to-long v13, v13

    .line 136
    iget-object v6, v6, Ldefpackage/cu1;->p:Ldefpackage/qs;

    .line 137
    .line 138
    invoke-static {v6, v12}, Ldefpackage/cu1;->j(Ldefpackage/qs;I)J

    .line 139
    .line 140
    .line 141
    move-result-wide v15

    .line 142
    add-long v12, v15, v13

    .line 143
    .line 144
    long-to-int v6, v12

    .line 145
    iget-object v12, v0, Ldefpackage/zt1;->s:[B

    .line 146
    .line 147
    array-length v12, v12

    .line 148
    if-ge v12, v7, :cond_5

    .line 149
    .line 150
    new-array v12, v7, [B

    .line 151
    .line 152
    iput-object v12, v0, Ldefpackage/zt1;->s:[B

    .line 153
    .line 154
    :cond_5
    iput v7, v0, Ldefpackage/zt1;->t:I

    .line 155
    .line 156
    iput v4, v0, Ldefpackage/zt1;->r:I

    .line 157
    .line 158
    iget-object v12, v0, Ldefpackage/zt1;->s:[B

    .line 159
    .line 160
    array-length v13, v9

    .line 161
    if-gt v6, v13, :cond_c

    .line 162
    .line 163
    iget v13, v8, Ldefpackage/i;->a:I

    .line 164
    .line 165
    sub-int v14, v13, v6

    .line 166
    .line 167
    and-int/2addr v14, v10

    .line 168
    iget-boolean v15, v8, Ldefpackage/i;->b:Z

    .line 169
    .line 170
    if-nez v15, :cond_7

    .line 171
    .line 172
    if-ge v14, v13, :cond_6

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_6
    const-string v0, "Attempt to read beyond memory: dist="

    .line 176
    .line 177
    invoke-static {v6, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return v4

    .line 185
    :cond_7
    :goto_2
    move v6, v4

    .line 186
    :goto_3
    if-ge v6, v7, :cond_a

    .line 187
    .line 188
    aget-byte v13, v9, v14

    .line 189
    .line 190
    iget v15, v8, Ldefpackage/i;->a:I

    .line 191
    .line 192
    aput-byte v13, v9, v15

    .line 193
    .line 194
    add-int/lit8 v16, v15, 0x1

    .line 195
    .line 196
    move/from16 v17, v4

    .line 197
    .line 198
    and-int v4, v16, v10

    .line 199
    .line 200
    move/from16 v16, v10

    .line 201
    .line 202
    iget-boolean v10, v8, Ldefpackage/i;->b:Z

    .line 203
    .line 204
    if-nez v10, :cond_8

    .line 205
    .line 206
    if-ge v4, v15, :cond_8

    .line 207
    .line 208
    iput-boolean v11, v8, Ldefpackage/i;->b:Z

    .line 209
    .line 210
    :cond_8
    iput v4, v8, Ldefpackage/i;->a:I

    .line 211
    .line 212
    aput-byte v13, v12, v6

    .line 213
    .line 214
    add-int/lit8 v6, v6, 0x1

    .line 215
    .line 216
    add-int/lit8 v4, v14, 0x1

    .line 217
    .line 218
    and-int v4, v4, v16

    .line 219
    .line 220
    iget-boolean v10, v8, Ldefpackage/i;->b:Z

    .line 221
    .line 222
    if-nez v10, :cond_9

    .line 223
    .line 224
    if-ge v4, v14, :cond_9

    .line 225
    .line 226
    iput-boolean v11, v8, Ldefpackage/i;->b:Z

    .line 227
    .line 228
    :cond_9
    move v14, v4

    .line 229
    move/from16 v10, v16

    .line 230
    .line 231
    move/from16 v4, v17

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_a
    move/from16 v17, v4

    .line 235
    .line 236
    add-int v4, v2, v5

    .line 237
    .line 238
    sub-int v6, v3, v5

    .line 239
    .line 240
    iget v7, v0, Ldefpackage/zt1;->t:I

    .line 241
    .line 242
    iget v8, v0, Ldefpackage/zt1;->r:I

    .line 243
    .line 244
    sub-int/2addr v7, v8

    .line 245
    if-lez v7, :cond_b

    .line 246
    .line 247
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    iget-object v7, v0, Ldefpackage/zt1;->s:[B

    .line 252
    .line 253
    iget v8, v0, Ldefpackage/zt1;->r:I

    .line 254
    .line 255
    invoke-static {v7, v8, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 256
    .line 257
    .line 258
    iget v4, v0, Ldefpackage/zt1;->r:I

    .line 259
    .line 260
    add-int/2addr v4, v6

    .line 261
    iput v4, v0, Ldefpackage/zt1;->r:I

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_b
    move/from16 v6, v17

    .line 265
    .line 266
    :goto_4
    add-int/2addr v6, v5

    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :goto_5
    move/from16 v4, v17

    .line 270
    .line 271
    goto/16 :goto_0

    .line 272
    .line 273
    :cond_c
    move/from16 v17, v4

    .line 274
    .line 275
    const-string v0, "Illegal distance parameter: "

    .line 276
    .line 277
    invoke-static {v6, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return v17

    .line 285
    :cond_d
    iput-boolean v11, v0, Ldefpackage/zt1;->n:Z

    .line 286
    .line 287
    :cond_e
    return v5
.end method

.method public final x()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/zt1;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    iget p0, p0, Ldefpackage/zt1;->o:I

    .line 8
    .line 9
    return p0
.end method
