.class public final Lbl1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lmz0;


# instance fields
.field public final a:Ljv3;

.field public final b:Z

.field public final c:Z

.field public final d:Ln41;

.field public final e:Ln41;

.field public final f:Ln41;

.field public g:J

.field public final h:[Z

.field public i:Ljava/lang/String;

.field public j:Lwv4;

.field public k:Lal1;

.field public l:Z

.field public m:J

.field public n:Z

.field public final o:Lbe3;


# direct methods
.method public constructor <init>(Ljv3;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbl1;->a:Ljv3;

    .line 5
    .line 6
    iput-boolean p2, p0, Lbl1;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lbl1;->c:Z

    .line 9
    .line 10
    const/4 p1, 0x3

    .line 11
    new-array p1, p1, [Z

    .line 12
    .line 13
    iput-object p1, p0, Lbl1;->h:[Z

    .line 14
    .line 15
    new-instance p1, Ln41;

    .line 16
    .line 17
    const/4 p2, 0x7

    .line 18
    invoke-direct {p1, p2}, Ln41;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lbl1;->d:Ln41;

    .line 22
    .line 23
    new-instance p1, Ln41;

    .line 24
    .line 25
    const/16 p2, 0x8

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ln41;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lbl1;->e:Ln41;

    .line 31
    .line 32
    new-instance p1, Ln41;

    .line 33
    .line 34
    const/4 p2, 0x6

    .line 35
    invoke-direct {p1, p2}, Ln41;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lbl1;->f:Ln41;

    .line 39
    .line 40
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    iput-wide p1, p0, Lbl1;->m:J

    .line 46
    .line 47
    new-instance p1, Lbe3;

    .line 48
    .line 49
    invoke-direct {p1}, Lbe3;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lbl1;->o:Lbe3;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(Lbe3;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lbl1;->j:Lwv4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p1, Lbe3;->b:I

    .line 9
    .line 10
    iget v1, p1, Lbe3;->c:I

    .line 11
    .line 12
    iget-object v2, p1, Lbe3;->a:[B

    .line 13
    .line 14
    iget-wide v3, p0, Lbl1;->g:J

    .line 15
    .line 16
    invoke-virtual {p1}, Lbe3;->a()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    int-to-long v5, v5

    .line 21
    add-long/2addr v3, v5

    .line 22
    iput-wide v3, p0, Lbl1;->g:J

    .line 23
    .line 24
    iget-object v3, p0, Lbl1;->j:Lwv4;

    .line 25
    .line 26
    invoke-virtual {p1}, Lbe3;->a()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-interface {v3, v4, p1}, Lwv4;->e(ILbe3;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object p1, p0, Lbl1;->h:[Z

    .line 34
    .line 35
    invoke-static {v2, v0, v1, p1}, Luc5;->o([BII[Z)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, v1, :cond_0

    .line 40
    .line 41
    invoke-virtual {p0, v2, v0, v1}, Lbl1;->g([BII)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    add-int/lit8 v3, p1, 0x3

    .line 46
    .line 47
    aget-byte v3, v2, v3

    .line 48
    .line 49
    and-int/lit8 v5, v3, 0x1f

    .line 50
    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    add-int/lit8 v3, p1, -0x1

    .line 54
    .line 55
    aget-byte v3, v2, v3

    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    add-int/lit8 p1, p1, -0x1

    .line 60
    .line 61
    const/4 v3, 0x4

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    const/4 v3, 0x3

    .line 64
    :goto_1
    sub-int v4, p1, v0

    .line 65
    .line 66
    if-lez v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, v2, v0, p1}, Lbl1;->g([BII)V

    .line 69
    .line 70
    .line 71
    :cond_2
    sub-int v7, v1, p1

    .line 72
    .line 73
    iget-wide v8, p0, Lbl1;->g:J

    .line 74
    .line 75
    int-to-long v10, v7

    .line 76
    sub-long v9, v8, v10

    .line 77
    .line 78
    if-gez v4, :cond_3

    .line 79
    .line 80
    neg-int v0, v4

    .line 81
    :goto_2
    move v8, v0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    const/4 v0, 0x0

    .line 84
    goto :goto_2

    .line 85
    :goto_3
    iget-wide v11, p0, Lbl1;->m:J

    .line 86
    .line 87
    move-object v6, p0

    .line 88
    invoke-virtual/range {v6 .. v12}, Lbl1;->b(IIJJ)V

    .line 89
    .line 90
    .line 91
    move-object v4, v6

    .line 92
    move-wide v6, v9

    .line 93
    iget-wide v8, v4, Lbl1;->m:J

    .line 94
    .line 95
    invoke-virtual/range {v4 .. v9}, Lbl1;->h(IJJ)V

    .line 96
    .line 97
    .line 98
    add-int v0, p1, v3

    .line 99
    .line 100
    move-object p0, v4

    .line 101
    goto :goto_0
.end method

.method public final b(IIJJ)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, Lbl1;->a:Ljv3;

    .line 6
    .line 7
    iget-object v2, v2, Ljv3;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lc6;

    .line 10
    .line 11
    iget-boolean v3, v0, Lbl1;->l:Z

    .line 12
    .line 13
    const/4 v4, 0x4

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v3, v0, Lbl1;->k:Lal1;

    .line 17
    .line 18
    iget-boolean v3, v3, Lal1;->c:Z

    .line 19
    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    :cond_0
    iget-object v3, v0, Lbl1;->d:Ln41;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ln41;->d(I)Z

    .line 25
    .line 26
    .line 27
    iget-object v6, v0, Lbl1;->e:Ln41;

    .line 28
    .line 29
    invoke-virtual {v6, v1}, Ln41;->d(I)Z

    .line 30
    .line 31
    .line 32
    iget-boolean v7, v0, Lbl1;->l:Z

    .line 33
    .line 34
    iget-boolean v8, v3, Ln41;->e:Z

    .line 35
    .line 36
    const/4 v9, 0x3

    .line 37
    if-nez v7, :cond_1

    .line 38
    .line 39
    if-eqz v8, :cond_3

    .line 40
    .line 41
    iget-boolean v7, v6, Ln41;->e:Z

    .line 42
    .line 43
    if-eqz v7, :cond_3

    .line 44
    .line 45
    new-instance v7, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v8, v3, Ln41;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v8, [B

    .line 53
    .line 54
    iget v10, v3, Ln41;->c:I

    .line 55
    .line 56
    invoke-static {v8, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    iget-object v8, v6, Ln41;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, [B

    .line 66
    .line 67
    iget v10, v6, Ln41;->c:I

    .line 68
    .line 69
    invoke-static {v8, v10}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    iget-object v8, v3, Ln41;->f:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, [B

    .line 79
    .line 80
    iget v10, v3, Ln41;->c:I

    .line 81
    .line 82
    invoke-static {v8, v9, v10}, Luc5;->L([BII)Lu13;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    iget v9, v8, Lu13;->s:I

    .line 87
    .line 88
    iget-object v10, v6, Ln41;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v10, [B

    .line 91
    .line 92
    iget v11, v6, Ln41;->c:I

    .line 93
    .line 94
    new-instance v12, Lh00;

    .line 95
    .line 96
    invoke-direct {v12, v10, v4, v11}, Lh00;-><init>([BII)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12}, Lh00;->m()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    invoke-virtual {v12}, Lh00;->m()I

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    invoke-virtual {v12}, Lh00;->s()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v12}, Lh00;->h()Z

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    new-instance v13, Lt13;

    .line 115
    .line 116
    invoke-direct {v13, v10, v11, v12}, Lt13;-><init>(IIZ)V

    .line 117
    .line 118
    .line 119
    iget v11, v8, Lu13;->a:I

    .line 120
    .line 121
    iget v12, v8, Lu13;->b:I

    .line 122
    .line 123
    iget v14, v8, Lu13;->c:I

    .line 124
    .line 125
    sget-object v15, Li40;->a:[B

    .line 126
    .line 127
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    filled-new-array {v11, v12, v14}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    const-string v12, "avc1.%02X%02X%02X"

    .line 144
    .line 145
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    iget-object v12, v0, Lbl1;->j:Lwv4;

    .line 150
    .line 151
    new-instance v14, Lsb1;

    .line 152
    .line 153
    invoke-direct {v14}, Lsb1;-><init>()V

    .line 154
    .line 155
    .line 156
    iget-object v15, v0, Lbl1;->i:Ljava/lang/String;

    .line 157
    .line 158
    iput-object v15, v14, Lsb1;->a:Ljava/lang/String;

    .line 159
    .line 160
    const-string v15, "video/mp2t"

    .line 161
    .line 162
    invoke-static {v15}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v15

    .line 166
    iput-object v15, v14, Lsb1;->l:Ljava/lang/String;

    .line 167
    .line 168
    const-string v15, "video/avc"

    .line 169
    .line 170
    invoke-static {v15}, Llw2;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    iput-object v15, v14, Lsb1;->m:Ljava/lang/String;

    .line 175
    .line 176
    iput-object v11, v14, Lsb1;->j:Ljava/lang/String;

    .line 177
    .line 178
    iget v11, v8, Lu13;->e:I

    .line 179
    .line 180
    iput v11, v14, Lsb1;->t:I

    .line 181
    .line 182
    iget v11, v8, Lu13;->f:I

    .line 183
    .line 184
    iput v11, v14, Lsb1;->u:I

    .line 185
    .line 186
    iget v11, v8, Lu13;->p:I

    .line 187
    .line 188
    iget v15, v8, Lu13;->q:I

    .line 189
    .line 190
    iget v4, v8, Lu13;->r:I

    .line 191
    .line 192
    iget v5, v8, Lu13;->h:I

    .line 193
    .line 194
    add-int/lit8 v20, v5, 0x8

    .line 195
    .line 196
    iget v5, v8, Lu13;->i:I

    .line 197
    .line 198
    add-int/lit8 v21, v5, 0x8

    .line 199
    .line 200
    move/from16 v17, v15

    .line 201
    .line 202
    new-instance v15, Lc50;

    .line 203
    .line 204
    const/16 v19, 0x0

    .line 205
    .line 206
    move/from16 v18, v4

    .line 207
    .line 208
    move/from16 v16, v11

    .line 209
    .line 210
    invoke-direct/range {v15 .. v21}, Lc50;-><init>(III[BII)V

    .line 211
    .line 212
    .line 213
    iput-object v15, v14, Lsb1;->C:Lc50;

    .line 214
    .line 215
    iget v4, v8, Lu13;->g:F

    .line 216
    .line 217
    iput v4, v14, Lsb1;->z:F

    .line 218
    .line 219
    iput-object v7, v14, Lsb1;->p:Ljava/util/List;

    .line 220
    .line 221
    iput v9, v14, Lsb1;->o:I

    .line 222
    .line 223
    invoke-static {v14, v12}, Lf34;->l(Lsb1;Lwv4;)V

    .line 224
    .line 225
    .line 226
    const/4 v4, 0x1

    .line 227
    iput-boolean v4, v0, Lbl1;->l:Z

    .line 228
    .line 229
    invoke-virtual {v2, v9}, Lc6;->x(I)V

    .line 230
    .line 231
    .line 232
    iget-object v4, v0, Lbl1;->k:Lal1;

    .line 233
    .line 234
    iget-object v4, v4, Lal1;->d:Landroid/util/SparseArray;

    .line 235
    .line 236
    iget v5, v8, Lu13;->d:I

    .line 237
    .line 238
    invoke-virtual {v4, v5, v8}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    iget-object v4, v0, Lbl1;->k:Lal1;

    .line 242
    .line 243
    iget-object v4, v4, Lal1;->e:Landroid/util/SparseArray;

    .line 244
    .line 245
    invoke-virtual {v4, v10, v13}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Ln41;->f()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v6}, Ln41;->f()V

    .line 252
    .line 253
    .line 254
    goto :goto_0

    .line 255
    :cond_1
    if-eqz v8, :cond_2

    .line 256
    .line 257
    iget-object v4, v3, Ln41;->f:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v4, [B

    .line 260
    .line 261
    iget v5, v3, Ln41;->c:I

    .line 262
    .line 263
    invoke-static {v4, v9, v5}, Luc5;->L([BII)Lu13;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    iget v5, v4, Lu13;->s:I

    .line 268
    .line 269
    invoke-virtual {v2, v5}, Lc6;->x(I)V

    .line 270
    .line 271
    .line 272
    iget-object v5, v0, Lbl1;->k:Lal1;

    .line 273
    .line 274
    iget-object v5, v5, Lal1;->d:Landroid/util/SparseArray;

    .line 275
    .line 276
    iget v6, v4, Lu13;->d:I

    .line 277
    .line 278
    invoke-virtual {v5, v6, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3}, Ln41;->f()V

    .line 282
    .line 283
    .line 284
    goto :goto_0

    .line 285
    :cond_2
    iget-boolean v3, v6, Ln41;->e:Z

    .line 286
    .line 287
    if-eqz v3, :cond_3

    .line 288
    .line 289
    iget-object v3, v6, Ln41;->f:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v3, [B

    .line 292
    .line 293
    iget v4, v6, Ln41;->c:I

    .line 294
    .line 295
    new-instance v5, Lh00;

    .line 296
    .line 297
    const/4 v7, 0x4

    .line 298
    invoke-direct {v5, v3, v7, v4}, Lh00;-><init>([BII)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v5}, Lh00;->m()I

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    invoke-virtual {v5}, Lh00;->m()I

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    invoke-virtual {v5}, Lh00;->s()V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v5}, Lh00;->h()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    new-instance v7, Lt13;

    .line 317
    .line 318
    invoke-direct {v7, v3, v4, v5}, Lt13;-><init>(IIZ)V

    .line 319
    .line 320
    .line 321
    iget-object v4, v0, Lbl1;->k:Lal1;

    .line 322
    .line 323
    iget-object v4, v4, Lal1;->e:Landroid/util/SparseArray;

    .line 324
    .line 325
    invoke-virtual {v4, v3, v7}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v6}, Ln41;->f()V

    .line 329
    .line 330
    .line 331
    :cond_3
    :goto_0
    iget-object v3, v0, Lbl1;->f:Ln41;

    .line 332
    .line 333
    invoke-virtual {v3, v1}, Ln41;->d(I)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-eqz v1, :cond_4

    .line 338
    .line 339
    iget-object v1, v3, Ln41;->f:Ljava/lang/Object;

    .line 340
    .line 341
    check-cast v1, [B

    .line 342
    .line 343
    iget v4, v3, Ln41;->c:I

    .line 344
    .line 345
    invoke-static {v4, v1}, Luc5;->b0(I[B)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    iget-object v3, v3, Ln41;->f:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v3, [B

    .line 352
    .line 353
    iget-object v4, v0, Lbl1;->o:Lbe3;

    .line 354
    .line 355
    invoke-virtual {v4, v1, v3}, Lbe3;->L(I[B)V

    .line 356
    .line 357
    .line 358
    const/4 v7, 0x4

    .line 359
    invoke-virtual {v4, v7}, Lbe3;->N(I)V

    .line 360
    .line 361
    .line 362
    move-wide/from16 v5, p5

    .line 363
    .line 364
    invoke-virtual {v2, v5, v6, v4}, Lc6;->a(JLbe3;)V

    .line 365
    .line 366
    .line 367
    :cond_4
    iget-object v1, v0, Lbl1;->k:Lal1;

    .line 368
    .line 369
    iget-boolean v2, v0, Lbl1;->l:Z

    .line 370
    .line 371
    iget v3, v1, Lal1;->i:I

    .line 372
    .line 373
    const/16 v4, 0x9

    .line 374
    .line 375
    const/4 v5, 0x0

    .line 376
    if-eq v3, v4, :cond_b

    .line 377
    .line 378
    iget-boolean v3, v1, Lal1;->c:Z

    .line 379
    .line 380
    if-eqz v3, :cond_e

    .line 381
    .line 382
    iget-object v3, v1, Lal1;->n:Lzk1;

    .line 383
    .line 384
    iget-object v4, v1, Lal1;->m:Lzk1;

    .line 385
    .line 386
    iget-boolean v6, v3, Lzk1;->a:Z

    .line 387
    .line 388
    if-nez v6, :cond_5

    .line 389
    .line 390
    goto/16 :goto_3

    .line 391
    .line 392
    :cond_5
    iget-boolean v6, v4, Lzk1;->a:Z

    .line 393
    .line 394
    if-nez v6, :cond_6

    .line 395
    .line 396
    goto :goto_1

    .line 397
    :cond_6
    iget-object v6, v3, Lzk1;->c:Lu13;

    .line 398
    .line 399
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    iget-object v7, v4, Lzk1;->c:Lu13;

    .line 403
    .line 404
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    iget v7, v7, Lu13;->m:I

    .line 408
    .line 409
    iget v8, v3, Lzk1;->f:I

    .line 410
    .line 411
    iget v9, v4, Lzk1;->f:I

    .line 412
    .line 413
    if-ne v8, v9, :cond_b

    .line 414
    .line 415
    iget v8, v3, Lzk1;->g:I

    .line 416
    .line 417
    iget v9, v4, Lzk1;->g:I

    .line 418
    .line 419
    if-ne v8, v9, :cond_b

    .line 420
    .line 421
    iget-boolean v8, v3, Lzk1;->h:Z

    .line 422
    .line 423
    iget-boolean v9, v4, Lzk1;->h:Z

    .line 424
    .line 425
    if-ne v8, v9, :cond_b

    .line 426
    .line 427
    iget-boolean v8, v3, Lzk1;->i:Z

    .line 428
    .line 429
    if-eqz v8, :cond_7

    .line 430
    .line 431
    iget-boolean v8, v4, Lzk1;->i:Z

    .line 432
    .line 433
    if-eqz v8, :cond_7

    .line 434
    .line 435
    iget-boolean v8, v3, Lzk1;->j:Z

    .line 436
    .line 437
    iget-boolean v9, v4, Lzk1;->j:Z

    .line 438
    .line 439
    if-ne v8, v9, :cond_b

    .line 440
    .line 441
    :cond_7
    iget v8, v3, Lzk1;->d:I

    .line 442
    .line 443
    iget v9, v4, Lzk1;->d:I

    .line 444
    .line 445
    if-eq v8, v9, :cond_8

    .line 446
    .line 447
    if-eqz v8, :cond_b

    .line 448
    .line 449
    if-eqz v9, :cond_b

    .line 450
    .line 451
    :cond_8
    iget v6, v6, Lu13;->m:I

    .line 452
    .line 453
    if-nez v6, :cond_9

    .line 454
    .line 455
    if-nez v7, :cond_9

    .line 456
    .line 457
    iget v8, v3, Lzk1;->m:I

    .line 458
    .line 459
    iget v9, v4, Lzk1;->m:I

    .line 460
    .line 461
    if-ne v8, v9, :cond_b

    .line 462
    .line 463
    iget v8, v3, Lzk1;->n:I

    .line 464
    .line 465
    iget v9, v4, Lzk1;->n:I

    .line 466
    .line 467
    if-ne v8, v9, :cond_b

    .line 468
    .line 469
    :cond_9
    const/4 v8, 0x1

    .line 470
    if-ne v6, v8, :cond_a

    .line 471
    .line 472
    if-ne v7, v8, :cond_a

    .line 473
    .line 474
    iget v6, v3, Lzk1;->o:I

    .line 475
    .line 476
    iget v7, v4, Lzk1;->o:I

    .line 477
    .line 478
    if-ne v6, v7, :cond_b

    .line 479
    .line 480
    iget v6, v3, Lzk1;->p:I

    .line 481
    .line 482
    iget v7, v4, Lzk1;->p:I

    .line 483
    .line 484
    if-ne v6, v7, :cond_b

    .line 485
    .line 486
    :cond_a
    iget-boolean v6, v3, Lzk1;->k:Z

    .line 487
    .line 488
    iget-boolean v7, v4, Lzk1;->k:Z

    .line 489
    .line 490
    if-ne v6, v7, :cond_b

    .line 491
    .line 492
    if-eqz v6, :cond_e

    .line 493
    .line 494
    iget v3, v3, Lzk1;->l:I

    .line 495
    .line 496
    iget v4, v4, Lzk1;->l:I

    .line 497
    .line 498
    if-eq v3, v4, :cond_e

    .line 499
    .line 500
    :cond_b
    :goto_1
    if-eqz v2, :cond_d

    .line 501
    .line 502
    iget-boolean v2, v1, Lal1;->o:Z

    .line 503
    .line 504
    if-eqz v2, :cond_d

    .line 505
    .line 506
    iget-wide v2, v1, Lal1;->j:J

    .line 507
    .line 508
    sub-long v6, p3, v2

    .line 509
    .line 510
    long-to-int v4, v6

    .line 511
    add-int v11, p1, v4

    .line 512
    .line 513
    iget-wide v7, v1, Lal1;->q:J

    .line 514
    .line 515
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    cmp-long v4, v7, v9

    .line 521
    .line 522
    if-eqz v4, :cond_d

    .line 523
    .line 524
    iget-wide v9, v1, Lal1;->p:J

    .line 525
    .line 526
    cmp-long v4, v2, v9

    .line 527
    .line 528
    if-nez v4, :cond_c

    .line 529
    .line 530
    goto :goto_2

    .line 531
    :cond_c
    move-wide v12, v9

    .line 532
    iget-boolean v9, v1, Lal1;->r:Z

    .line 533
    .line 534
    sub-long/2addr v2, v12

    .line 535
    long-to-int v10, v2

    .line 536
    iget-object v6, v1, Lal1;->a:Lwv4;

    .line 537
    .line 538
    const/4 v12, 0x0

    .line 539
    invoke-interface/range {v6 .. v12}, Lwv4;->a(JIIILvv4;)V

    .line 540
    .line 541
    .line 542
    :cond_d
    :goto_2
    iget-wide v2, v1, Lal1;->j:J

    .line 543
    .line 544
    iput-wide v2, v1, Lal1;->p:J

    .line 545
    .line 546
    iget-wide v2, v1, Lal1;->l:J

    .line 547
    .line 548
    iput-wide v2, v1, Lal1;->q:J

    .line 549
    .line 550
    iput-boolean v5, v1, Lal1;->r:Z

    .line 551
    .line 552
    const/4 v4, 0x1

    .line 553
    iput-boolean v4, v1, Lal1;->o:Z

    .line 554
    .line 555
    :cond_e
    :goto_3
    iget-boolean v2, v1, Lal1;->b:Z

    .line 556
    .line 557
    if-eqz v2, :cond_11

    .line 558
    .line 559
    iget-object v2, v1, Lal1;->n:Lzk1;

    .line 560
    .line 561
    iget-boolean v3, v2, Lzk1;->b:Z

    .line 562
    .line 563
    if-eqz v3, :cond_10

    .line 564
    .line 565
    iget v2, v2, Lzk1;->e:I

    .line 566
    .line 567
    const/4 v3, 0x7

    .line 568
    if-eq v2, v3, :cond_f

    .line 569
    .line 570
    const/4 v3, 0x2

    .line 571
    if-ne v2, v3, :cond_10

    .line 572
    .line 573
    :cond_f
    const/4 v4, 0x1

    .line 574
    goto :goto_4

    .line 575
    :cond_10
    move v4, v5

    .line 576
    goto :goto_4

    .line 577
    :cond_11
    iget-boolean v4, v1, Lal1;->s:Z

    .line 578
    .line 579
    :goto_4
    iget-boolean v2, v1, Lal1;->r:Z

    .line 580
    .line 581
    iget v3, v1, Lal1;->i:I

    .line 582
    .line 583
    const/4 v6, 0x5

    .line 584
    if-eq v3, v6, :cond_13

    .line 585
    .line 586
    if-eqz v4, :cond_12

    .line 587
    .line 588
    const/4 v4, 0x1

    .line 589
    if-ne v3, v4, :cond_12

    .line 590
    .line 591
    goto :goto_5

    .line 592
    :cond_12
    move v4, v5

    .line 593
    goto :goto_5

    .line 594
    :cond_13
    const/4 v4, 0x1

    .line 595
    :goto_5
    or-int/2addr v2, v4

    .line 596
    iput-boolean v2, v1, Lal1;->r:Z

    .line 597
    .line 598
    const/16 v3, 0x18

    .line 599
    .line 600
    iput v3, v1, Lal1;->i:I

    .line 601
    .line 602
    if-eqz v2, :cond_14

    .line 603
    .line 604
    iput-boolean v5, v0, Lbl1;->n:Z

    .line 605
    .line 606
    :cond_14
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lbl1;->g:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lbl1;->n:Z

    .line 7
    .line 8
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iput-wide v1, p0, Lbl1;->m:J

    .line 14
    .line 15
    iget-object v1, p0, Lbl1;->h:[Z

    .line 16
    .line 17
    invoke-static {v1}, Luc5;->i([Z)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lbl1;->d:Ln41;

    .line 21
    .line 22
    invoke-virtual {v1}, Ln41;->f()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lbl1;->e:Ln41;

    .line 26
    .line 27
    invoke-virtual {v1}, Ln41;->f()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lbl1;->f:Ln41;

    .line 31
    .line 32
    invoke-virtual {v1}, Ln41;->f()V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lbl1;->a:Ljv3;

    .line 36
    .line 37
    iget-object v1, v1, Ljv3;->p:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lc6;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lc6;->j(I)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, Lbl1;->k:Lal1;

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    iput-boolean v0, p0, Lal1;->k:Z

    .line 49
    .line 50
    iput-boolean v0, p0, Lal1;->o:Z

    .line 51
    .line 52
    iget-object p0, p0, Lal1;->n:Lzk1;

    .line 53
    .line 54
    iput-boolean v0, p0, Lzk1;->b:Z

    .line 55
    .line 56
    iput-boolean v0, p0, Lzk1;->a:Z

    .line 57
    .line 58
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 7

    .line 1
    iget-object v1, p0, Lbl1;->j:Lwv4;

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lbl1;->a:Ljv3;

    .line 11
    .line 12
    iget-object v1, v1, Ljv3;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lc6;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2}, Lc6;->j(I)V

    .line 18
    .line 19
    .line 20
    iget-wide v3, p0, Lbl1;->g:J

    .line 21
    .line 22
    iget-wide v5, p0, Lbl1;->m:J

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-virtual/range {v0 .. v6}, Lbl1;->b(IIJJ)V

    .line 27
    .line 28
    .line 29
    iget-wide v2, p0, Lbl1;->g:J

    .line 30
    .line 31
    const/16 v1, 0x9

    .line 32
    .line 33
    iget-wide v4, p0, Lbl1;->m:J

    .line 34
    .line 35
    invoke-virtual/range {v0 .. v5}, Lbl1;->h(IJJ)V

    .line 36
    .line 37
    .line 38
    iget-wide v3, p0, Lbl1;->g:J

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget-wide v5, p0, Lbl1;->m:J

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual/range {v0 .. v6}, Lbl1;->b(IIJJ)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final e(IJ)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lbl1;->m:J

    .line 2
    .line 3
    iget-boolean p2, p0, Lbl1;->n:Z

    .line 4
    .line 5
    and-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    :goto_0
    or-int/2addr p1, p2

    .line 13
    iput-boolean p1, p0, Lbl1;->n:Z

    .line 14
    .line 15
    return-void
.end method

.method public final f(Lm51;Lsy4;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lsy4;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lsy4;->b()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lsy4;->e:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v0, p0, Lbl1;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p2}, Lsy4;->b()V

    .line 12
    .line 13
    .line 14
    iget v0, p2, Lsy4;->d:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-interface {p1, v0, v1}, Lm51;->t(II)Lwv4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lbl1;->j:Lwv4;

    .line 22
    .line 23
    new-instance v1, Lal1;

    .line 24
    .line 25
    iget-boolean v2, p0, Lbl1;->b:Z

    .line 26
    .line 27
    iget-boolean v3, p0, Lbl1;->c:Z

    .line 28
    .line 29
    invoke-direct {v1, v0, v2, v3}, Lal1;-><init>(Lwv4;ZZ)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lbl1;->k:Lal1;

    .line 33
    .line 34
    iget-object p0, p0, Lbl1;->a:Ljv3;

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Ljv3;->a(Lm51;Lsy4;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final g([BII)V
    .locals 16

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
    iget-boolean v4, v0, Lbl1;->l:Z

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-object v4, v0, Lbl1;->k:Lal1;

    .line 14
    .line 15
    iget-boolean v4, v4, Lal1;->c:Z

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :cond_0
    iget-object v4, v0, Lbl1;->d:Ln41;

    .line 20
    .line 21
    invoke-virtual {v4, v1, v2, v3}, Ln41;->a([BII)V

    .line 22
    .line 23
    .line 24
    iget-object v4, v0, Lbl1;->e:Ln41;

    .line 25
    .line 26
    invoke-virtual {v4, v1, v2, v3}, Ln41;->a([BII)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v4, v0, Lbl1;->f:Ln41;

    .line 30
    .line 31
    invoke-virtual {v4, v1, v2, v3}, Ln41;->a([BII)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lbl1;->k:Lal1;

    .line 35
    .line 36
    iget-object v4, v0, Lal1;->e:Landroid/util/SparseArray;

    .line 37
    .line 38
    iget-object v5, v0, Lal1;->f:Lh00;

    .line 39
    .line 40
    iget-boolean v6, v0, Lal1;->k:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_2
    sub-int/2addr v3, v2

    .line 47
    iget-object v6, v0, Lal1;->g:[B

    .line 48
    .line 49
    array-length v7, v6

    .line 50
    iget v8, v0, Lal1;->h:I

    .line 51
    .line 52
    add-int/2addr v8, v3

    .line 53
    const/4 v9, 0x2

    .line 54
    if-ge v7, v8, :cond_3

    .line 55
    .line 56
    mul-int/2addr v8, v9

    .line 57
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iput-object v6, v0, Lal1;->g:[B

    .line 62
    .line 63
    :cond_3
    iget-object v6, v0, Lal1;->g:[B

    .line 64
    .line 65
    iget v7, v0, Lal1;->h:I

    .line 66
    .line 67
    invoke-static {v1, v2, v6, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    iget v1, v0, Lal1;->h:I

    .line 71
    .line 72
    add-int/2addr v1, v3

    .line 73
    iput v1, v0, Lal1;->h:I

    .line 74
    .line 75
    iget-object v2, v0, Lal1;->g:[B

    .line 76
    .line 77
    iput-object v2, v5, Lh00;->b:[B

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    iput v2, v5, Lh00;->d:I

    .line 81
    .line 82
    iput v1, v5, Lh00;->c:I

    .line 83
    .line 84
    iput v2, v5, Lh00;->e:I

    .line 85
    .line 86
    invoke-virtual {v5}, Lh00;->a()V

    .line 87
    .line 88
    .line 89
    const/16 v1, 0x8

    .line 90
    .line 91
    invoke-virtual {v5, v1}, Lh00;->d(I)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto/16 :goto_7

    .line 98
    .line 99
    :cond_4
    invoke-virtual {v5}, Lh00;->s()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5, v9}, Lh00;->i(I)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    const/4 v3, 0x5

    .line 107
    invoke-virtual {v5, v3}, Lh00;->t(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Lh00;->e()Z

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    if-nez v6, :cond_5

    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_5
    invoke-virtual {v5}, Lh00;->m()I

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Lh00;->e()Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-nez v6, :cond_6

    .line 126
    .line 127
    goto/16 :goto_7

    .line 128
    .line 129
    :cond_6
    invoke-virtual {v5}, Lh00;->m()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    iget-boolean v7, v0, Lal1;->c:Z

    .line 134
    .line 135
    const/4 v8, 0x1

    .line 136
    if-nez v7, :cond_7

    .line 137
    .line 138
    iput-boolean v2, v0, Lal1;->k:Z

    .line 139
    .line 140
    iget-object v0, v0, Lal1;->n:Lzk1;

    .line 141
    .line 142
    iput v6, v0, Lzk1;->e:I

    .line 143
    .line 144
    iput-boolean v8, v0, Lzk1;->b:Z

    .line 145
    .line 146
    return-void

    .line 147
    :cond_7
    invoke-virtual {v5}, Lh00;->e()Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-nez v7, :cond_8

    .line 152
    .line 153
    goto/16 :goto_7

    .line 154
    .line 155
    :cond_8
    invoke-virtual {v5}, Lh00;->m()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v4, v7}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    if-gez v10, :cond_9

    .line 164
    .line 165
    iput-boolean v2, v0, Lal1;->k:Z

    .line 166
    .line 167
    return-void

    .line 168
    :cond_9
    invoke-virtual {v4, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    check-cast v4, Lt13;

    .line 173
    .line 174
    iget-object v10, v0, Lal1;->d:Landroid/util/SparseArray;

    .line 175
    .line 176
    iget v11, v4, Lt13;->a:I

    .line 177
    .line 178
    iget-boolean v4, v4, Lt13;->b:Z

    .line 179
    .line 180
    invoke-virtual {v10, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    check-cast v10, Lu13;

    .line 185
    .line 186
    iget-boolean v11, v10, Lu13;->j:Z

    .line 187
    .line 188
    iget v12, v10, Lu13;->n:I

    .line 189
    .line 190
    iget v13, v10, Lu13;->l:I

    .line 191
    .line 192
    if-eqz v11, :cond_b

    .line 193
    .line 194
    invoke-virtual {v5, v9}, Lh00;->d(I)Z

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-nez v11, :cond_a

    .line 199
    .line 200
    goto/16 :goto_7

    .line 201
    .line 202
    :cond_a
    invoke-virtual {v5, v9}, Lh00;->t(I)V

    .line 203
    .line 204
    .line 205
    :cond_b
    invoke-virtual {v5, v13}, Lh00;->d(I)Z

    .line 206
    .line 207
    .line 208
    move-result v9

    .line 209
    if-nez v9, :cond_c

    .line 210
    .line 211
    goto/16 :goto_7

    .line 212
    .line 213
    :cond_c
    invoke-virtual {v5, v13}, Lh00;->i(I)I

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    iget-boolean v11, v10, Lu13;->k:Z

    .line 218
    .line 219
    if-nez v11, :cond_10

    .line 220
    .line 221
    invoke-virtual {v5, v8}, Lh00;->d(I)Z

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-nez v11, :cond_d

    .line 226
    .line 227
    goto/16 :goto_7

    .line 228
    .line 229
    :cond_d
    invoke-virtual {v5}, Lh00;->h()Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-eqz v11, :cond_f

    .line 234
    .line 235
    invoke-virtual {v5, v8}, Lh00;->d(I)Z

    .line 236
    .line 237
    .line 238
    move-result v13

    .line 239
    if-nez v13, :cond_e

    .line 240
    .line 241
    goto/16 :goto_7

    .line 242
    .line 243
    :cond_e
    invoke-virtual {v5}, Lh00;->h()Z

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    move v14, v8

    .line 248
    goto :goto_1

    .line 249
    :cond_f
    move v13, v2

    .line 250
    :goto_0
    move v14, v13

    .line 251
    goto :goto_1

    .line 252
    :cond_10
    move v11, v2

    .line 253
    move v13, v11

    .line 254
    goto :goto_0

    .line 255
    :goto_1
    iget v15, v0, Lal1;->i:I

    .line 256
    .line 257
    if-ne v15, v3, :cond_11

    .line 258
    .line 259
    move v3, v8

    .line 260
    goto :goto_2

    .line 261
    :cond_11
    move v3, v2

    .line 262
    :goto_2
    if-eqz v3, :cond_13

    .line 263
    .line 264
    invoke-virtual {v5}, Lh00;->e()Z

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    if-nez v15, :cond_12

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_12
    invoke-virtual {v5}, Lh00;->m()I

    .line 272
    .line 273
    .line 274
    move-result v15

    .line 275
    goto :goto_3

    .line 276
    :cond_13
    move v15, v2

    .line 277
    :goto_3
    iget v2, v10, Lu13;->m:I

    .line 278
    .line 279
    if-nez v2, :cond_17

    .line 280
    .line 281
    invoke-virtual {v5, v12}, Lh00;->d(I)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-nez v2, :cond_14

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_14
    invoke-virtual {v5, v12}, Lh00;->i(I)I

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-eqz v4, :cond_16

    .line 293
    .line 294
    if-nez v11, :cond_16

    .line 295
    .line 296
    invoke-virtual {v5}, Lh00;->e()Z

    .line 297
    .line 298
    .line 299
    move-result v4

    .line 300
    if-nez v4, :cond_15

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_15
    invoke-virtual {v5}, Lh00;->n()I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    move v5, v4

    .line 308
    const/4 v4, 0x0

    .line 309
    :goto_4
    const/4 v12, 0x0

    .line 310
    goto :goto_8

    .line 311
    :cond_16
    :goto_5
    const/4 v4, 0x0

    .line 312
    :goto_6
    const/4 v5, 0x0

    .line 313
    goto :goto_4

    .line 314
    :cond_17
    if-ne v2, v8, :cond_1b

    .line 315
    .line 316
    iget-boolean v2, v10, Lu13;->o:Z

    .line 317
    .line 318
    if-nez v2, :cond_1b

    .line 319
    .line 320
    invoke-virtual {v5}, Lh00;->e()Z

    .line 321
    .line 322
    .line 323
    move-result v2

    .line 324
    if-nez v2, :cond_18

    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_18
    invoke-virtual {v5}, Lh00;->n()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v4, :cond_1a

    .line 332
    .line 333
    if-nez v11, :cond_1a

    .line 334
    .line 335
    invoke-virtual {v5}, Lh00;->e()Z

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    if-nez v4, :cond_19

    .line 340
    .line 341
    :goto_7
    return-void

    .line 342
    :cond_19
    invoke-virtual {v5}, Lh00;->n()I

    .line 343
    .line 344
    .line 345
    move-result v4

    .line 346
    move v12, v4

    .line 347
    const/4 v5, 0x0

    .line 348
    move v4, v2

    .line 349
    const/4 v2, 0x0

    .line 350
    goto :goto_8

    .line 351
    :cond_1a
    move v4, v2

    .line 352
    const/4 v2, 0x0

    .line 353
    goto :goto_6

    .line 354
    :cond_1b
    const/4 v2, 0x0

    .line 355
    goto :goto_5

    .line 356
    :goto_8
    iget-object v8, v0, Lal1;->n:Lzk1;

    .line 357
    .line 358
    iput-object v10, v8, Lzk1;->c:Lu13;

    .line 359
    .line 360
    iput v1, v8, Lzk1;->d:I

    .line 361
    .line 362
    iput v6, v8, Lzk1;->e:I

    .line 363
    .line 364
    iput v9, v8, Lzk1;->f:I

    .line 365
    .line 366
    iput v7, v8, Lzk1;->g:I

    .line 367
    .line 368
    iput-boolean v11, v8, Lzk1;->h:Z

    .line 369
    .line 370
    iput-boolean v14, v8, Lzk1;->i:Z

    .line 371
    .line 372
    iput-boolean v13, v8, Lzk1;->j:Z

    .line 373
    .line 374
    iput-boolean v3, v8, Lzk1;->k:Z

    .line 375
    .line 376
    iput v15, v8, Lzk1;->l:I

    .line 377
    .line 378
    iput v2, v8, Lzk1;->m:I

    .line 379
    .line 380
    iput v5, v8, Lzk1;->n:I

    .line 381
    .line 382
    iput v4, v8, Lzk1;->o:I

    .line 383
    .line 384
    iput v12, v8, Lzk1;->p:I

    .line 385
    .line 386
    const/4 v1, 0x1

    .line 387
    iput-boolean v1, v8, Lzk1;->a:Z

    .line 388
    .line 389
    iput-boolean v1, v8, Lzk1;->b:Z

    .line 390
    .line 391
    const/4 v1, 0x0

    .line 392
    iput-boolean v1, v0, Lal1;->k:Z

    .line 393
    .line 394
    return-void
.end method

.method public final h(IJJ)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbl1;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbl1;->k:Lal1;

    .line 6
    .line 7
    iget-boolean v0, v0, Lal1;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lbl1;->d:Ln41;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ln41;->g(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lbl1;->e:Ln41;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ln41;->g(I)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lbl1;->f:Ln41;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ln41;->g(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lbl1;->k:Lal1;

    .line 27
    .line 28
    iget-boolean p0, p0, Lbl1;->n:Z

    .line 29
    .line 30
    iput p1, v0, Lal1;->i:I

    .line 31
    .line 32
    iput-wide p4, v0, Lal1;->l:J

    .line 33
    .line 34
    iput-wide p2, v0, Lal1;->j:J

    .line 35
    .line 36
    iput-boolean p0, v0, Lal1;->s:Z

    .line 37
    .line 38
    iget-boolean p0, v0, Lal1;->b:Z

    .line 39
    .line 40
    const/4 p2, 0x1

    .line 41
    if-eqz p0, :cond_2

    .line 42
    .line 43
    if-eq p1, p2, :cond_3

    .line 44
    .line 45
    :cond_2
    iget-boolean p0, v0, Lal1;->c:Z

    .line 46
    .line 47
    if-eqz p0, :cond_4

    .line 48
    .line 49
    const/4 p0, 0x5

    .line 50
    if-eq p1, p0, :cond_3

    .line 51
    .line 52
    if-eq p1, p2, :cond_3

    .line 53
    .line 54
    const/4 p0, 0x2

    .line 55
    if-ne p1, p0, :cond_4

    .line 56
    .line 57
    :cond_3
    iget-object p0, v0, Lal1;->m:Lzk1;

    .line 58
    .line 59
    iget-object p1, v0, Lal1;->n:Lzk1;

    .line 60
    .line 61
    iput-object p1, v0, Lal1;->m:Lzk1;

    .line 62
    .line 63
    iput-object p0, v0, Lal1;->n:Lzk1;

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    iput-boolean p1, p0, Lzk1;->b:Z

    .line 67
    .line 68
    iput-boolean p1, p0, Lzk1;->a:Z

    .line 69
    .line 70
    iput p1, v0, Lal1;->h:I

    .line 71
    .line 72
    iput-boolean p2, v0, Lal1;->k:Z

    .line 73
    .line 74
    :cond_4
    return-void
.end method
