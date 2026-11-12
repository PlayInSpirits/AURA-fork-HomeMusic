.class public final Lr60;
.super Ljava/util/AbstractSet;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public transient n:Ljava/lang/Object;

.field public transient o:[I

.field public transient p:[Ljava/lang/Object;

.field public transient q:I

.field public transient r:I


# direct methods
.method public static a(I)Lr60;
    .locals 4

    .line 1
    new-instance v0, Lr60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    const-string v3, "Expected size must be >= 0"

    .line 13
    .line 14
    invoke-static {v3, v2}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, Ljz4;->o(II)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    iput p0, v0, Lr60;->q:I

    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lr60;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x1f

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Lr60;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const-string v5, "Arrays already allocated"

    .line 19
    .line 20
    invoke-static {v5, v2}, Lrr2;->v(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iget v2, v0, Lr60;->q:I

    .line 24
    .line 25
    add-int/lit8 v5, v2, 0x1

    .line 26
    .line 27
    const/4 v6, 0x2

    .line 28
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v5}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    int-to-double v7, v6

    .line 37
    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    .line 38
    .line 39
    mul-double/2addr v9, v7

    .line 40
    double-to-int v7, v9

    .line 41
    if-le v5, v7, :cond_1

    .line 42
    .line 43
    shl-int/lit8 v6, v6, 0x1

    .line 44
    .line 45
    if-lez v6, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/high16 v6, 0x40000000    # 2.0f

    .line 49
    .line 50
    :cond_1
    :goto_0
    const/4 v5, 0x4

    .line 51
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-static {v5}, Lbu;->g(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    iput-object v6, v0, Lr60;->n:Ljava/lang/Object;

    .line 60
    .line 61
    sub-int/2addr v5, v4

    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    rsub-int/lit8 v5, v5, 0x20

    .line 67
    .line 68
    iget v6, v0, Lr60;->q:I

    .line 69
    .line 70
    invoke-static {v6, v5, v3}, Lbu;->s(III)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    iput v5, v0, Lr60;->q:I

    .line 75
    .line 76
    new-array v5, v2, [I

    .line 77
    .line 78
    iput-object v5, v0, Lr60;->o:[I

    .line 79
    .line 80
    new-array v2, v2, [Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v2, v0, Lr60;->p:[Ljava/lang/Object;

    .line 83
    .line 84
    :cond_2
    invoke-virtual {v0}, Lr60;->b()Ljava/util/Set;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    return v0

    .line 95
    :cond_3
    invoke-virtual {v0}, Lr60;->f()[I

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0}, Lr60;->e()[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    iget v6, v0, Lr60;->r:I

    .line 104
    .line 105
    add-int/lit8 v7, v6, 0x1

    .line 106
    .line 107
    invoke-static {v1}, Lg12;->U(Ljava/lang/Object;)I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    iget v9, v0, Lr60;->q:I

    .line 112
    .line 113
    and-int/2addr v9, v3

    .line 114
    shl-int v9, v4, v9

    .line 115
    .line 116
    sub-int/2addr v9, v4

    .line 117
    and-int v10, v8, v9

    .line 118
    .line 119
    iget-object v11, v0, Lr60;->n:Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-static {v10, v11}, Lbu;->B(ILjava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result v11

    .line 128
    const/4 v12, 0x0

    .line 129
    if-nez v11, :cond_5

    .line 130
    .line 131
    if-le v7, v9, :cond_4

    .line 132
    .line 133
    invoke-static {v9}, Lbu;->t(I)I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {v0, v9, v2, v8, v6}, Lr60;->g(IIII)I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    goto/16 :goto_3

    .line 142
    .line 143
    :cond_4
    iget-object v2, v0, Lr60;->n:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    invoke-static {v10, v7, v2}, Lbu;->C(IILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    not-int v10, v9

    .line 153
    and-int v13, v8, v10

    .line 154
    .line 155
    move v14, v12

    .line 156
    :goto_1
    sub-int/2addr v11, v4

    .line 157
    aget v15, v2, v11

    .line 158
    .line 159
    move/from16 v16, v3

    .line 160
    .line 161
    and-int v3, v15, v10

    .line 162
    .line 163
    if-ne v3, v13, :cond_6

    .line 164
    .line 165
    aget-object v3, v5, v11

    .line 166
    .line 167
    invoke-static {v1, v3}, Lsi0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_6

    .line 172
    .line 173
    return v12

    .line 174
    :cond_6
    and-int v3, v15, v9

    .line 175
    .line 176
    add-int/2addr v14, v4

    .line 177
    if-nez v3, :cond_d

    .line 178
    .line 179
    const/16 v3, 0x9

    .line 180
    .line 181
    if-lt v14, v3, :cond_a

    .line 182
    .line 183
    iget v2, v0, Lr60;->q:I

    .line 184
    .line 185
    and-int/lit8 v2, v2, 0x1f

    .line 186
    .line 187
    shl-int v2, v4, v2

    .line 188
    .line 189
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 190
    .line 191
    const/high16 v4, 0x3f800000    # 1.0f

    .line 192
    .line 193
    invoke-direct {v3, v2, v4}, Ljava/util/LinkedHashSet;-><init>(IF)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Lr60;->isEmpty()Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    const/4 v4, -0x1

    .line 201
    if-eqz v2, :cond_8

    .line 202
    .line 203
    :cond_7
    move v12, v4

    .line 204
    :cond_8
    :goto_2
    if-ltz v12, :cond_9

    .line 205
    .line 206
    invoke-virtual {v0}, Lr60;->e()[Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    aget-object v2, v2, v12

    .line 211
    .line 212
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    add-int/lit8 v12, v12, 0x1

    .line 216
    .line 217
    iget v2, v0, Lr60;->r:I

    .line 218
    .line 219
    if-ge v12, v2, :cond_7

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_9
    iput-object v3, v0, Lr60;->n:Ljava/lang/Object;

    .line 223
    .line 224
    const/4 v2, 0x0

    .line 225
    iput-object v2, v0, Lr60;->o:[I

    .line 226
    .line 227
    iput-object v2, v0, Lr60;->p:[Ljava/lang/Object;

    .line 228
    .line 229
    iget v2, v0, Lr60;->q:I

    .line 230
    .line 231
    add-int/lit8 v2, v2, 0x20

    .line 232
    .line 233
    iput v2, v0, Lr60;->q:I

    .line 234
    .line 235
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    return v0

    .line 240
    :cond_a
    if-le v7, v9, :cond_b

    .line 241
    .line 242
    invoke-static {v9}, Lbu;->t(I)I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    invoke-virtual {v0, v9, v2, v8, v6}, Lr60;->g(IIII)I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    goto :goto_3

    .line 251
    :cond_b
    invoke-static {v15, v7, v9}, Lbu;->s(III)I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    aput v3, v2, v11

    .line 256
    .line 257
    :goto_3
    invoke-virtual {v0}, Lr60;->f()[I

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    array-length v2, v2

    .line 262
    if-le v7, v2, :cond_c

    .line 263
    .line 264
    ushr-int/lit8 v3, v2, 0x1

    .line 265
    .line 266
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    add-int/2addr v3, v2

    .line 271
    or-int/2addr v3, v4

    .line 272
    const v5, 0x3fffffff    # 1.9999999f

    .line 273
    .line 274
    .line 275
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eq v3, v2, :cond_c

    .line 280
    .line 281
    invoke-virtual {v0}, Lr60;->f()[I

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([II)[I

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    iput-object v2, v0, Lr60;->o:[I

    .line 290
    .line 291
    invoke-virtual {v0}, Lr60;->e()[Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    iput-object v2, v0, Lr60;->p:[Ljava/lang/Object;

    .line 300
    .line 301
    :cond_c
    invoke-static {v8, v12, v9}, Lbu;->s(III)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-virtual {v0}, Lr60;->f()[I

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    aput v2, v3, v6

    .line 310
    .line 311
    invoke-virtual {v0}, Lr60;->e()[Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    aput-object v1, v2, v6

    .line 316
    .line 317
    iput v7, v0, Lr60;->r:I

    .line 318
    .line 319
    iget v1, v0, Lr60;->q:I

    .line 320
    .line 321
    add-int/lit8 v1, v1, 0x20

    .line 322
    .line 323
    iput v1, v0, Lr60;->q:I

    .line 324
    .line 325
    return v4

    .line 326
    :cond_d
    move v11, v3

    .line 327
    move/from16 v3, v16

    .line 328
    .line 329
    goto/16 :goto_1
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object p0, p0, Lr60;->n:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/util/Set;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/util/Set;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final clear()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lr60;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget v0, p0, Lr60;->q:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, 0x20

    .line 11
    .line 12
    iput v0, p0, Lr60;->q:I

    .line 13
    .line 14
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lr60;->size()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x3

    .line 27
    invoke-static {v3, v4}, Ljz4;->o(II)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    iput v3, p0, Lr60;->q:I

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lr60;->n:Ljava/lang/Object;

    .line 37
    .line 38
    iput v2, p0, Lr60;->r:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Lr60;->e()[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget v3, p0, Lr60;->r:I

    .line 46
    .line 47
    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lr60;->n:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    instance-of v1, v0, [B

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    check-cast v0, [B

    .line 60
    .line 61
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    instance-of v1, v0, [S

    .line 66
    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    check-cast v0, [S

    .line 70
    .line 71
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([SS)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    check-cast v0, [I

    .line 76
    .line 77
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 78
    .line 79
    .line 80
    :goto_0
    invoke-virtual {p0}, Lr60;->f()[I

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget v1, p0, Lr60;->r:I

    .line 85
    .line 86
    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 87
    .line 88
    .line 89
    iput v2, p0, Lr60;->r:I

    .line 90
    .line 91
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Lr60;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_1
    invoke-static {p1}, Lg12;->U(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget v1, p0, Lr60;->q:I

    .line 24
    .line 25
    and-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    shl-int v1, v2, v1

    .line 29
    .line 30
    sub-int/2addr v1, v2

    .line 31
    iget-object v3, p0, Lr60;->n:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    and-int v4, v0, v1

    .line 37
    .line 38
    invoke-static {v4, v3}, Lbu;->B(ILjava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    not-int v4, v1

    .line 46
    and-int/2addr v0, v4

    .line 47
    :cond_3
    sub-int/2addr v3, v2

    .line 48
    invoke-virtual {p0}, Lr60;->f()[I

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    aget v5, v5, v3

    .line 53
    .line 54
    and-int v6, v5, v4

    .line 55
    .line 56
    if-ne v6, v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {p0}, Lr60;->e()[Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    aget-object v3, v6, v3

    .line 63
    .line 64
    invoke-static {p1, v3}, Lsi0;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    return v2

    .line 71
    :cond_4
    and-int v3, v5, v1

    .line 72
    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    :goto_0
    const/4 p0, 0x0

    .line 76
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lr60;->n:Ljava/lang/Object;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final e()[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lr60;->p:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p0, [Ljava/lang/Object;

    .line 7
    .line 8
    return-object p0
.end method

.method public final f()[I
    .locals 0

    .line 1
    iget-object p0, p0, Lr60;->o:[I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    check-cast p0, [I

    .line 7
    .line 8
    return-object p0
.end method

.method public final g(IIII)I
    .locals 8

    .line 1
    invoke-static {p2}, Lbu;->g(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    add-int/lit8 p2, p2, -0x1

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    and-int/2addr p3, p2

    .line 10
    add-int/lit8 p4, p4, 0x1

    .line 11
    .line 12
    invoke-static {p3, p4, v0}, Lbu;->C(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p3, p0, Lr60;->n:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lr60;->f()[I

    .line 21
    .line 22
    .line 23
    move-result-object p4

    .line 24
    const/4 v1, 0x0

    .line 25
    :goto_0
    if-gt v1, p1, :cond_2

    .line 26
    .line 27
    invoke-static {v1, p3}, Lbu;->B(ILjava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    :goto_1
    if-eqz v2, :cond_1

    .line 32
    .line 33
    add-int/lit8 v3, v2, -0x1

    .line 34
    .line 35
    aget v4, p4, v3

    .line 36
    .line 37
    not-int v5, p1

    .line 38
    and-int/2addr v5, v4

    .line 39
    or-int/2addr v5, v1

    .line 40
    and-int v6, v5, p2

    .line 41
    .line 42
    invoke-static {v6, v0}, Lbu;->B(ILjava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    invoke-static {v6, v2, v0}, Lbu;->C(IILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v5, v7, p2}, Lbu;->s(III)I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    aput v2, p4, v3

    .line 54
    .line 55
    and-int v2, v4, p1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    iput-object v0, p0, Lr60;->n:Ljava/lang/Object;

    .line 62
    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    rsub-int/lit8 p1, p1, 0x20

    .line 68
    .line 69
    iget p3, p0, Lr60;->q:I

    .line 70
    .line 71
    const/16 p4, 0x1f

    .line 72
    .line 73
    invoke-static {p3, p1, p4}, Lbu;->s(III)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iput p1, p0, Lr60;->q:I

    .line 78
    .line 79
    return p2
.end method

.method public final isEmpty()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lr60;->size()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lq60;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lq60;-><init>(Lr60;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lr60;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    iget v0, p0, Lr60;->q:I

    .line 21
    .line 22
    and-int/lit8 v0, v0, 0x1f

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    shl-int v0, v2, v0

    .line 26
    .line 27
    add-int/lit8 v5, v0, -0x1

    .line 28
    .line 29
    iget-object v6, p0, Lr60;->n:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lr60;->f()[I

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-virtual {p0}, Lr60;->e()[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    move-object v3, p1

    .line 45
    invoke-static/range {v3 .. v9}, Lbu;->A(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v0, -0x1

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    :goto_0
    return v1

    .line 53
    :cond_2
    iget-object v0, p0, Lr60;->n:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lr60;->f()[I

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {p0}, Lr60;->e()[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {p0}, Lr60;->size()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    add-int/lit8 v7, v6, -0x1

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    if-ge p1, v7, :cond_5

    .line 74
    .line 75
    aget-object v9, v4, v7

    .line 76
    .line 77
    aput-object v9, v4, p1

    .line 78
    .line 79
    aput-object v8, v4, v7

    .line 80
    .line 81
    aget v4, v3, v7

    .line 82
    .line 83
    aput v4, v3, p1

    .line 84
    .line 85
    aput v1, v3, v7

    .line 86
    .line 87
    invoke-static {v9}, Lg12;->U(Ljava/lang/Object;)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    and-int/2addr v1, v5

    .line 92
    invoke-static {v1, v0}, Lbu;->B(ILjava/lang/Object;)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-ne v4, v6, :cond_3

    .line 97
    .line 98
    add-int/2addr p1, v2

    .line 99
    invoke-static {v1, p1, v0}, Lbu;->C(IILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_3
    :goto_1
    sub-int/2addr v4, v2

    .line 104
    aget v0, v3, v4

    .line 105
    .line 106
    and-int v1, v0, v5

    .line 107
    .line 108
    if-ne v1, v6, :cond_4

    .line 109
    .line 110
    add-int/2addr p1, v2

    .line 111
    invoke-static {v0, p1, v5}, Lbu;->s(III)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    aput p1, v3, v4

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move v4, v1

    .line 119
    goto :goto_1

    .line 120
    :cond_5
    aput-object v8, v4, p1

    .line 121
    .line 122
    aput v1, v3, p1

    .line 123
    .line 124
    :goto_2
    iget p1, p0, Lr60;->r:I

    .line 125
    .line 126
    sub-int/2addr p1, v2

    .line 127
    iput p1, p0, Lr60;->r:I

    .line 128
    .line 129
    iget p1, p0, Lr60;->q:I

    .line 130
    .line 131
    add-int/lit8 p1, p1, 0x20

    .line 132
    .line 133
    iput p1, p0, Lr60;->q:I

    .line 134
    .line 135
    return v2
.end method

.method public final size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget p0, p0, Lr60;->r:I

    .line 13
    .line 14
    return p0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 61
    invoke-virtual {p0}, Lr60;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 62
    new-array p0, p0, [Ljava/lang/Object;

    return-object p0

    .line 63
    :cond_0
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 64
    invoke-interface {v0}, Ljava/util/Set;->toArray()[Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lr60;->e()[Ljava/lang/Object;

    move-result-object v0

    iget p0, p0, Lr60;->r:I

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lr60;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    array-length p0, p1

    .line 10
    if-lez p0, :cond_0

    .line 11
    .line 12
    aput-object v1, p1, v2

    .line 13
    .line 14
    :cond_0
    return-object p1

    .line 15
    :cond_1
    invoke-virtual {p0}, Lr60;->b()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {v0, p1}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_2
    invoke-virtual {p0}, Lr60;->e()[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget p0, p0, Lr60;->r:I

    .line 31
    .line 32
    array-length v3, v0

    .line 33
    invoke-static {v2, p0, v3}, Lrr2;->u(III)V

    .line 34
    .line 35
    .line 36
    array-length v3, p1

    .line 37
    if-ge v3, p0, :cond_4

    .line 38
    .line 39
    array-length v1, p1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_1

    .line 52
    :cond_4
    array-length v3, p1

    .line 53
    if-le v3, p0, :cond_5

    .line 54
    .line 55
    aput-object v1, p1, p0

    .line 56
    .line 57
    :cond_5
    :goto_1
    invoke-static {v0, v2, p1, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    return-object p1
.end method
