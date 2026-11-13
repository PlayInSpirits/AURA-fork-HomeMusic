.class public abstract Ldefpackage/qe4;
.super Ldefpackage/fq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Ldefpackage/tc2;

.field public final d:Landroid/os/Looper;

.field public final e:Ldefpackage/yp4;

.field public final f:Ljava/util/HashSet;

.field public final g:Ldefpackage/zt4;

.field public h:Ldefpackage/pe4;

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ldefpackage/fq;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/qe4;->d:Landroid/os/Looper;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sget-object v1, Ldefpackage/vp4;->a:Ldefpackage/vp4;

    .line 8
    .line 9
    invoke-virtual {v1, p1, v0}, Ldefpackage/vp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ldefpackage/yp4;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Ldefpackage/qe4;->e:Ldefpackage/yp4;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 21
    .line 22
    new-instance v0, Ldefpackage/zt4;

    .line 23
    .line 24
    invoke-direct {v0}, Ldefpackage/zt4;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Ldefpackage/qe4;->g:Ldefpackage/zt4;

    .line 28
    .line 29
    new-instance v0, Ldefpackage/tc2;

    .line 30
    .line 31
    new-instance v2, Ldefpackage/ss2;

    .line 32
    .line 33
    const/16 v3, 0x10

    .line 34
    .line 35
    invoke-direct {v2, v3, p0}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, p1, v1, v2}, Ldefpackage/tc2;-><init>(Landroid/os/Looper;Ldefpackage/vp4;Ldefpackage/rc2;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ldefpackage/qe4;->c:Ldefpackage/tc2;

    .line 42
    .line 43
    return-void
.end method

.method public static Z0(Ldefpackage/pe4;Ldefpackage/zt4;Ldefpackage/bu4;)Ljava/util/ArrayList;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 8
    .line 9
    instance-of v4, v3, Ldefpackage/le4;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    check-cast v3, Ldefpackage/le4;

    .line 16
    .line 17
    iget-object v1, v3, Ldefpackage/le4;->e:Ldefpackage/yw1;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3}, Ldefpackage/cu4;->o()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    :goto_0
    invoke-virtual {v3}, Ldefpackage/cu4;->o()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-ge v6, v7, :cond_d

    .line 39
    .line 40
    iget v7, v0, Ldefpackage/pe4;->A:I

    .line 41
    .line 42
    const/4 v8, -0x1

    .line 43
    if-eq v7, v8, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v7, v5

    .line 47
    :goto_1
    const/4 v8, 0x1

    .line 48
    if-ne v7, v6, :cond_2

    .line 49
    .line 50
    move v7, v8

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v7, v5

    .line 53
    :goto_2
    invoke-virtual {v3, v6, v2}, Ldefpackage/cu4;->n(ILdefpackage/bu4;)V

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    iget v10, v2, Ldefpackage/bu4;->m:I

    .line 61
    .line 62
    :goto_3
    iget v11, v2, Ldefpackage/bu4;->n:I

    .line 63
    .line 64
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    const-wide/16 v14, 0x0

    .line 70
    .line 71
    if-gt v10, v11, :cond_5

    .line 72
    .line 73
    invoke-virtual {v3, v10, v1, v8}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 74
    .line 75
    .line 76
    new-instance v11, Ldefpackage/ie4;

    .line 77
    .line 78
    move/from16 v16, v8

    .line 79
    .line 80
    iget-object v8, v1, Ldefpackage/zt4;->b:Ljava/lang/Object;

    .line 81
    .line 82
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v8, v11, Ldefpackage/ie4;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iput-wide v14, v11, Ldefpackage/ie4;->b:J

    .line 91
    .line 92
    sget-object v8, Ldefpackage/z5;->f:Ldefpackage/z5;

    .line 93
    .line 94
    iput-boolean v5, v11, Ldefpackage/ie4;->d:Z

    .line 95
    .line 96
    iget-object v8, v1, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 97
    .line 98
    iput-object v8, v11, Ldefpackage/ie4;->c:Ldefpackage/z5;

    .line 99
    .line 100
    move/from16 v17, v6

    .line 101
    .line 102
    iget-wide v5, v1, Ldefpackage/zt4;->d:J

    .line 103
    .line 104
    cmp-long v12, v5, v12

    .line 105
    .line 106
    if-eqz v12, :cond_4

    .line 107
    .line 108
    cmp-long v12, v5, v14

    .line 109
    .line 110
    if-ltz v12, :cond_3

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_3
    const/4 v12, 0x0

    .line 114
    goto :goto_5

    .line 115
    :cond_4
    :goto_4
    move/from16 v12, v16

    .line 116
    .line 117
    :goto_5
    invoke-static {v12}, Ldefpackage/rr2;->l(Z)V

    .line 118
    .line 119
    .line 120
    iput-wide v5, v11, Ldefpackage/ie4;->b:J

    .line 121
    .line 122
    iget-boolean v5, v1, Ldefpackage/zt4;->f:Z

    .line 123
    .line 124
    iput-boolean v5, v11, Ldefpackage/ie4;->d:Z

    .line 125
    .line 126
    new-instance v5, Ldefpackage/je4;

    .line 127
    .line 128
    invoke-direct {v5, v11}, Ldefpackage/je4;-><init>(Ldefpackage/ie4;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v9, v5}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    add-int/lit8 v10, v10, 0x1

    .line 135
    .line 136
    move/from16 v8, v16

    .line 137
    .line 138
    move/from16 v6, v17

    .line 139
    .line 140
    const/4 v5, 0x0

    .line 141
    goto :goto_3

    .line 142
    :cond_5
    move/from16 v17, v6

    .line 143
    .line 144
    move/from16 v16, v8

    .line 145
    .line 146
    new-instance v5, Ldefpackage/ge4;

    .line 147
    .line 148
    iget-object v6, v2, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 149
    .line 150
    invoke-direct {v5, v6}, Ldefpackage/ge4;-><init>(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    iget-wide v10, v2, Ldefpackage/bu4;->k:J

    .line 154
    .line 155
    cmp-long v6, v10, v14

    .line 156
    .line 157
    if-ltz v6, :cond_6

    .line 158
    .line 159
    move/from16 v6, v16

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_6
    const/4 v6, 0x0

    .line 163
    :goto_6
    invoke-static {v6}, Ldefpackage/rr2;->l(Z)V

    .line 164
    .line 165
    .line 166
    iput-wide v10, v5, Ldefpackage/ge4;->l:J

    .line 167
    .line 168
    iget-wide v10, v2, Ldefpackage/bu4;->l:J

    .line 169
    .line 170
    invoke-virtual {v5, v10, v11}, Ldefpackage/ge4;->a(J)V

    .line 171
    .line 172
    .line 173
    iget-wide v10, v2, Ldefpackage/bu4;->f:J

    .line 174
    .line 175
    iput-wide v10, v5, Ldefpackage/ge4;->i:J

    .line 176
    .line 177
    iget-boolean v6, v2, Ldefpackage/bu4;->h:Z

    .line 178
    .line 179
    iput-boolean v6, v5, Ldefpackage/ge4;->k:Z

    .line 180
    .line 181
    iget-boolean v6, v2, Ldefpackage/bu4;->j:Z

    .line 182
    .line 183
    iput-boolean v6, v5, Ldefpackage/ge4;->o:Z

    .line 184
    .line 185
    iget-boolean v6, v2, Ldefpackage/bu4;->g:Z

    .line 186
    .line 187
    iput-boolean v6, v5, Ldefpackage/ge4;->j:Z

    .line 188
    .line 189
    iget-object v6, v2, Ldefpackage/bu4;->i:Ldefpackage/an2;

    .line 190
    .line 191
    iput-object v6, v5, Ldefpackage/ge4;->f:Ldefpackage/an2;

    .line 192
    .line 193
    iget-object v6, v2, Ldefpackage/bu4;->c:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v6, v5, Ldefpackage/ge4;->e:Ljava/lang/Object;

    .line 196
    .line 197
    iget-object v6, v2, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 198
    .line 199
    iput-object v6, v5, Ldefpackage/ge4;->c:Ldefpackage/gn2;

    .line 200
    .line 201
    if-eqz v7, :cond_7

    .line 202
    .line 203
    iget-object v6, v0, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_7
    const/4 v6, 0x0

    .line 207
    :goto_7
    iput-object v6, v5, Ldefpackage/ge4;->d:Ldefpackage/do2;

    .line 208
    .line 209
    invoke-virtual {v9}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    iget v9, v6, Ldefpackage/gy3;->q:I

    .line 214
    .line 215
    const/4 v10, 0x0

    .line 216
    :goto_8
    add-int/lit8 v11, v9, -0x1

    .line 217
    .line 218
    if-ge v10, v11, :cond_a

    .line 219
    .line 220
    invoke-virtual {v6, v10}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    check-cast v11, Ldefpackage/je4;

    .line 225
    .line 226
    move-wide/from16 v18, v12

    .line 227
    .line 228
    iget-wide v12, v11, Ldefpackage/je4;->b:J

    .line 229
    .line 230
    cmp-long v11, v12, v18

    .line 231
    .line 232
    if-eqz v11, :cond_8

    .line 233
    .line 234
    move/from16 v11, v16

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_8
    const/4 v11, 0x0

    .line 238
    :goto_9
    const-string v12, "Periods other than last need a duration"

    .line 239
    .line 240
    invoke-static {v12, v11}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v11, v10, 0x1

    .line 244
    .line 245
    move v12, v11

    .line 246
    :goto_a
    if-ge v12, v9, :cond_9

    .line 247
    .line 248
    invoke-virtual {v6, v10}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    check-cast v13, Ldefpackage/je4;

    .line 253
    .line 254
    iget-object v13, v13, Ldefpackage/je4;->a:Ljava/lang/Object;

    .line 255
    .line 256
    invoke-virtual {v6, v12}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v20

    .line 260
    move-object/from16 v8, v20

    .line 261
    .line 262
    check-cast v8, Ldefpackage/je4;

    .line 263
    .line 264
    iget-object v8, v8, Ldefpackage/je4;->a:Ljava/lang/Object;

    .line 265
    .line 266
    invoke-virtual {v13, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v8

    .line 270
    xor-int/lit8 v8, v8, 0x1

    .line 271
    .line 272
    const-string v13, "Duplicate PeriodData UIDs in period list"

    .line 273
    .line 274
    invoke-static {v13, v8}, Ldefpackage/rr2;->k(Ljava/lang/String;Z)V

    .line 275
    .line 276
    .line 277
    add-int/lit8 v12, v12, 0x1

    .line 278
    .line 279
    goto :goto_a

    .line 280
    :cond_9
    move v10, v11

    .line 281
    move-wide/from16 v12, v18

    .line 282
    .line 283
    goto :goto_8

    .line 284
    :cond_a
    invoke-static {v6}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    iput-object v6, v5, Ldefpackage/ge4;->p:Ldefpackage/yw1;

    .line 289
    .line 290
    iget-wide v8, v2, Ldefpackage/bu4;->o:J

    .line 291
    .line 292
    cmp-long v6, v8, v14

    .line 293
    .line 294
    if-ltz v6, :cond_b

    .line 295
    .line 296
    goto :goto_b

    .line 297
    :cond_b
    const/16 v16, 0x0

    .line 298
    .line 299
    :goto_b
    invoke-static/range {v16 .. v16}, Ldefpackage/rr2;->l(Z)V

    .line 300
    .line 301
    .line 302
    iput-wide v8, v5, Ldefpackage/ge4;->n:J

    .line 303
    .line 304
    iget-wide v8, v2, Ldefpackage/bu4;->d:J

    .line 305
    .line 306
    iput-wide v8, v5, Ldefpackage/ge4;->g:J

    .line 307
    .line 308
    if-eqz v7, :cond_c

    .line 309
    .line 310
    iget-object v6, v0, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 311
    .line 312
    goto :goto_c

    .line 313
    :cond_c
    sget-object v6, Ldefpackage/jw4;->b:Ldefpackage/jw4;

    .line 314
    .line 315
    :goto_c
    iput-object v6, v5, Ldefpackage/ge4;->b:Ldefpackage/jw4;

    .line 316
    .line 317
    iget-wide v6, v2, Ldefpackage/bu4;->e:J

    .line 318
    .line 319
    iput-wide v6, v5, Ldefpackage/ge4;->h:J

    .line 320
    .line 321
    new-instance v6, Ldefpackage/he4;

    .line 322
    .line 323
    invoke-direct {v6, v5}, Ldefpackage/he4;-><init>(Ldefpackage/ge4;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    add-int/lit8 v6, v17, 0x1

    .line 330
    .line 331
    const/4 v5, 0x0

    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_d
    return-object v4
.end method

.method public static a1(Ldefpackage/oe4;Ldefpackage/pe4;JLdefpackage/cu4;IJZLdefpackage/bu4;)Ldefpackage/pe4;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move-wide/from16 v4, p2

    .line 10
    .line 11
    move-object/from16 v6, p9

    .line 12
    .line 13
    invoke-static {v4, v5, v1, v6}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const/4 v11, -0x1

    .line 27
    if-nez v7, :cond_1

    .line 28
    .line 29
    if-eq v3, v11, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Ldefpackage/cu4;->o()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-lt v3, v7, :cond_1

    .line 36
    .line 37
    :cond_0
    move-wide v12, v8

    .line 38
    const/4 v3, 0x0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-wide/from16 v12, p6

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    const-wide/16 v14, 0x0

    .line 47
    .line 48
    if-nez v7, :cond_2

    .line 49
    .line 50
    cmp-long v7, v12, v8

    .line 51
    .line 52
    if-nez v7, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2, v3, v6, v14, v15}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget-wide v7, v7, Ldefpackage/bu4;->k:J

    .line 59
    .line 60
    invoke-static {v7, v8}, Ldefpackage/f35;->i0(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v12

    .line 64
    :cond_2
    iget-object v7, v1, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 65
    .line 66
    iget-object v8, v1, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 67
    .line 68
    invoke-virtual {v7}, Ldefpackage/cu4;->p()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-nez v7, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const/4 v7, 0x0

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    :goto_1
    const/4 v7, 0x1

    .line 84
    :goto_2
    if-nez v7, :cond_6

    .line 85
    .line 86
    iget-object v9, v1, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 87
    .line 88
    iget v10, v1, Ldefpackage/pe4;->A:I

    .line 89
    .line 90
    if-eq v10, v11, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    const/4 v10, 0x0

    .line 94
    :goto_3
    invoke-virtual {v9, v10, v6, v14, v15}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    iget-object v9, v9, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {v2, v3, v6, v14, v15}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    iget-object v10, v10, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_6

    .line 111
    .line 112
    const/4 v9, 0x1

    .line 113
    goto :goto_4

    .line 114
    :cond_6
    const/4 v9, 0x0

    .line 115
    :goto_4
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    const/4 v14, 0x0

    .line 120
    if-eqz v10, :cond_7

    .line 121
    .line 122
    sget-object v10, Ldefpackage/jw4;->b:Ldefpackage/jw4;

    .line 123
    .line 124
    iput-object v14, v0, Ldefpackage/oe4;->w:Ldefpackage/yw1;

    .line 125
    .line 126
    iput-object v2, v0, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 127
    .line 128
    iput-object v10, v0, Ldefpackage/oe4;->y:Ldefpackage/jw4;

    .line 129
    .line 130
    iput-object v14, v0, Ldefpackage/oe4;->z:Ldefpackage/do2;

    .line 131
    .line 132
    goto :goto_8

    .line 133
    :cond_7
    instance-of v10, v2, Ldefpackage/le4;

    .line 134
    .line 135
    if-eqz v10, :cond_8

    .line 136
    .line 137
    move-object v10, v2

    .line 138
    check-cast v10, Ldefpackage/le4;

    .line 139
    .line 140
    iget-object v10, v10, Ldefpackage/le4;->e:Ldefpackage/yw1;

    .line 141
    .line 142
    invoke-interface {v10, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    check-cast v10, Ldefpackage/he4;

    .line 147
    .line 148
    iget-object v15, v10, Ldefpackage/he4;->b:Ldefpackage/jw4;

    .line 149
    .line 150
    iget-object v10, v10, Ldefpackage/he4;->d:Ldefpackage/do2;

    .line 151
    .line 152
    iput-object v14, v0, Ldefpackage/oe4;->w:Ldefpackage/yw1;

    .line 153
    .line 154
    iput-object v2, v0, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 155
    .line 156
    iput-object v15, v0, Ldefpackage/oe4;->y:Ldefpackage/jw4;

    .line 157
    .line 158
    iput-object v10, v0, Ldefpackage/oe4;->z:Ldefpackage/do2;

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_8
    if-nez v7, :cond_9

    .line 162
    .line 163
    if-nez v9, :cond_9

    .line 164
    .line 165
    const/4 v10, 0x1

    .line 166
    goto :goto_5

    .line 167
    :cond_9
    const/4 v10, 0x0

    .line 168
    :goto_5
    if-eqz v10, :cond_a

    .line 169
    .line 170
    iget-object v15, v1, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_a
    sget-object v15, Ldefpackage/jw4;->b:Ldefpackage/jw4;

    .line 174
    .line 175
    :goto_6
    if-eqz v10, :cond_b

    .line 176
    .line 177
    iget-object v10, v1, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_b
    move-object v10, v14

    .line 181
    :goto_7
    iput-object v14, v0, Ldefpackage/oe4;->w:Ldefpackage/yw1;

    .line 182
    .line 183
    iput-object v2, v0, Ldefpackage/oe4;->x:Ldefpackage/cu4;

    .line 184
    .line 185
    iput-object v15, v0, Ldefpackage/oe4;->y:Ldefpackage/jw4;

    .line 186
    .line 187
    iput-object v10, v0, Ldefpackage/oe4;->z:Ldefpackage/do2;

    .line 188
    .line 189
    :goto_8
    if-nez v7, :cond_f

    .line 190
    .line 191
    if-nez v9, :cond_f

    .line 192
    .line 193
    cmp-long v2, v12, v4

    .line 194
    .line 195
    if-gez v2, :cond_c

    .line 196
    .line 197
    goto :goto_9

    .line 198
    :cond_c
    if-nez v2, :cond_e

    .line 199
    .line 200
    iput v3, v0, Ldefpackage/oe4;->B:I

    .line 201
    .line 202
    iget v2, v1, Ldefpackage/pe4;->B:I

    .line 203
    .line 204
    if-eq v2, v11, :cond_d

    .line 205
    .line 206
    if-eqz p8, :cond_d

    .line 207
    .line 208
    iget-object v2, v1, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 209
    .line 210
    iget-wide v2, v2, Ldefpackage/xm;->n:J

    .line 211
    .line 212
    iget-object v1, v1, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 213
    .line 214
    iget-wide v4, v1, Ldefpackage/xm;->n:J

    .line 215
    .line 216
    sub-long/2addr v2, v4

    .line 217
    new-instance v1, Ldefpackage/xm;

    .line 218
    .line 219
    invoke-direct {v1, v2, v3}, Ldefpackage/xm;-><init>(J)V

    .line 220
    .line 221
    .line 222
    iput-object v1, v0, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_d
    invoke-virtual {v0}, Ldefpackage/oe4;->a()V

    .line 226
    .line 227
    .line 228
    iget-wide v2, v8, Ldefpackage/xm;->n:J

    .line 229
    .line 230
    invoke-static {v2, v3, v1, v6}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 231
    .line 232
    .line 233
    move-result-wide v1

    .line 234
    sub-long/2addr v1, v4

    .line 235
    new-instance v3, Ldefpackage/xm;

    .line 236
    .line 237
    invoke-direct {v3, v1, v2}, Ldefpackage/xm;-><init>(J)V

    .line 238
    .line 239
    .line 240
    iput-object v3, v0, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 241
    .line 242
    goto :goto_a

    .line 243
    :cond_e
    iget-wide v7, v8, Ldefpackage/xm;->n:J

    .line 244
    .line 245
    invoke-static {v7, v8, v1, v6}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v6

    .line 249
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 250
    .line 251
    .line 252
    move-result-wide v6

    .line 253
    iget-object v1, v1, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 254
    .line 255
    iget-wide v1, v1, Ldefpackage/xm;->n:J

    .line 256
    .line 257
    sub-long v4, v12, v4

    .line 258
    .line 259
    sub-long/2addr v1, v4

    .line 260
    const-wide/16 v4, 0x0

    .line 261
    .line 262
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 263
    .line 264
    .line 265
    move-result-wide v1

    .line 266
    iput v3, v0, Ldefpackage/oe4;->B:I

    .line 267
    .line 268
    invoke-virtual {v0}, Ldefpackage/oe4;->a()V

    .line 269
    .line 270
    .line 271
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    iput-object v3, v0, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 276
    .line 277
    new-instance v3, Ldefpackage/xm;

    .line 278
    .line 279
    invoke-direct {v3, v6, v7}, Ldefpackage/xm;-><init>(J)V

    .line 280
    .line 281
    .line 282
    iput-object v3, v0, Ldefpackage/oe4;->H:Ldefpackage/xm;

    .line 283
    .line 284
    new-instance v3, Ldefpackage/xm;

    .line 285
    .line 286
    invoke-direct {v3, v1, v2}, Ldefpackage/xm;-><init>(J)V

    .line 287
    .line 288
    .line 289
    iput-object v3, v0, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 290
    .line 291
    goto :goto_a

    .line 292
    :cond_f
    :goto_9
    iput v3, v0, Ldefpackage/oe4;->B:I

    .line 293
    .line 294
    invoke-virtual {v0}, Ldefpackage/oe4;->a()V

    .line 295
    .line 296
    .line 297
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iput-object v1, v0, Ldefpackage/oe4;->E:Ljava/lang/Long;

    .line 302
    .line 303
    new-instance v1, Ldefpackage/xm;

    .line 304
    .line 305
    invoke-direct {v1, v12, v13}, Ldefpackage/xm;-><init>(J)V

    .line 306
    .line 307
    .line 308
    iput-object v1, v0, Ldefpackage/oe4;->H:Ldefpackage/xm;

    .line 309
    .line 310
    sget-object v1, Ldefpackage/ne4;->k:Ldefpackage/xm;

    .line 311
    .line 312
    iput-object v1, v0, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 313
    .line 314
    :goto_a
    new-instance v1, Ldefpackage/pe4;

    .line 315
    .line 316
    invoke-direct {v1, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 317
    .line 318
    .line 319
    return-object v1
.end method

.method public static b1(Ldefpackage/pe4;Ldefpackage/zt4;Ldefpackage/bu4;)I
    .locals 7

    .line 1
    iget v0, p0, Ldefpackage/pe4;->A:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    :goto_0
    move v4, v0

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    iget-object v0, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 11
    .line 12
    invoke-virtual {v0}, Ldefpackage/cu4;->p()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return v4

    .line 19
    :cond_1
    iget-object v1, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 20
    .line 21
    iget-object v0, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 22
    .line 23
    invoke-interface {v0}, Ldefpackage/ne4;->get()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-static {v2, v3, p0, p2}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    invoke-static {v2, v3}, Ldefpackage/f35;->Q(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    move-object v3, p1

    .line 36
    move-object v2, p2

    .line 37
    invoke-virtual/range {v1 .. v6}, Ldefpackage/cu4;->i(Ldefpackage/bu4;Ldefpackage/zt4;IJ)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method

.method public static c1(Ldefpackage/pe4;Ljava/lang/Object;Ldefpackage/zt4;Ldefpackage/bu4;)J
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/pe4;->B:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 7
    .line 8
    iget-wide p0, p0, Ldefpackage/xm;->n:J

    .line 9
    .line 10
    return-wide p0

    .line 11
    :cond_0
    iget-object v0, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 12
    .line 13
    invoke-interface {v0}, Ldefpackage/ne4;->get()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1, p0, p3}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-object p0, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-wide p0, p0, Ldefpackage/zt4;->e:J

    .line 28
    .line 29
    invoke-static {p0, p1}, Ldefpackage/f35;->i0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    sub-long/2addr v0, p0

    .line 34
    return-wide v0
.end method

.method public static d1(Ldefpackage/cu4;Ldefpackage/le4;ILdefpackage/zt4;Ldefpackage/bu4;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/cu4;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p1, Ldefpackage/le4;->e:Ldefpackage/yw1;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-ge p2, p0, :cond_1

    .line 15
    .line 16
    return p2

    .line 17
    :cond_0
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-virtual {p0, p2, p4, v2, v3}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, Ldefpackage/bu4;->m:I

    .line 24
    .line 25
    const/4 p4, 0x1

    .line 26
    invoke-virtual {p0, p2, p3, p4}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, Ldefpackage/zt4;->b:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ldefpackage/le4;->b(Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-ne p2, v1, :cond_2

    .line 40
    .line 41
    :cond_1
    return v1

    .line 42
    :cond_2
    invoke-virtual {p1, p0, p3}, Ldefpackage/le4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 43
    .line 44
    .line 45
    iget p0, p3, Ldefpackage/zt4;->c:I

    .line 46
    .line 47
    return p0
.end method

.method public static e1(Ldefpackage/gn2;)Ldefpackage/he4;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ge4;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/ke4;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ldefpackage/ge4;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object p0, v0, Ldefpackage/ge4;->c:Ldefpackage/gn2;

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    iput-boolean p0, v0, Ldefpackage/ge4;->k:Z

    .line 15
    .line 16
    iput-boolean p0, v0, Ldefpackage/ge4;->o:Z

    .line 17
    .line 18
    new-instance p0, Ldefpackage/he4;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ldefpackage/he4;-><init>(Ldefpackage/ge4;)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public static g1(Ldefpackage/pe4;ZLdefpackage/bu4;Ldefpackage/zt4;)Ldefpackage/pi3;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v0, Ldefpackage/pe4;->A:I

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    if-eq v3, v4, :cond_0

    .line 11
    .line 12
    :goto_0
    move v7, v3

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget-object v3, v0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 17
    .line 18
    iget v5, v0, Ldefpackage/pe4;->B:I

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Ldefpackage/qe4;->b1(Ldefpackage/pe4;Ldefpackage/zt4;Ldefpackage/bu4;)I

    .line 21
    .line 22
    .line 23
    move-result v10

    .line 24
    iget-object v6, v0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 25
    .line 26
    invoke-virtual {v6}, Ldefpackage/cu4;->p()Z

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    if-nez v8, :cond_1

    .line 31
    .line 32
    const/4 v8, 0x1

    .line 33
    invoke-virtual {v6, v10, v2, v8}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v2, v2, Ldefpackage/zt4;->b:Ljava/lang/Object;

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    invoke-virtual {v6, v7, v1, v8, v9}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    iget-object v6, v6, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v8, v1, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 48
    .line 49
    move-object v9, v2

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    const/4 v2, 0x0

    .line 52
    move-object v6, v2

    .line 53
    move-object v8, v6

    .line 54
    move-object v9, v8

    .line 55
    :goto_2
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-wide v11, v0, Ldefpackage/pe4;->K:J

    .line 58
    .line 59
    if-ne v5, v4, :cond_2

    .line 60
    .line 61
    move-wide v1, v11

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    invoke-interface {v3}, Ldefpackage/ne4;->get()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-static {v2, v3, v0, v1}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    :goto_3
    move-wide v13, v1

    .line 72
    goto :goto_4

    .line 73
    :cond_3
    invoke-interface {v3}, Ldefpackage/ne4;->get()J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    invoke-static {v2, v3, v0, v1}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    if-eq v5, v4, :cond_4

    .line 82
    .line 83
    iget-object v3, v0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 84
    .line 85
    iget-wide v3, v3, Ldefpackage/xm;->n:J

    .line 86
    .line 87
    move-wide v11, v3

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-wide v11, v1

    .line 90
    goto :goto_3

    .line 91
    :goto_4
    new-instance v5, Ldefpackage/pi3;

    .line 92
    .line 93
    iget v15, v0, Ldefpackage/pe4;->B:I

    .line 94
    .line 95
    iget v0, v0, Ldefpackage/pe4;->C:I

    .line 96
    .line 97
    move/from16 v16, v0

    .line 98
    .line 99
    invoke-direct/range {v5 .. v16}, Ldefpackage/pi3;-><init>(Ljava/lang/Object;ILdefpackage/gn2;Ljava/lang/Object;IJJII)V

    .line 100
    .line 101
    .line 102
    return-object v5
.end method

.method public static h1(JLdefpackage/pe4;Ldefpackage/bu4;)J
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-wide p0

    .line 11
    :cond_0
    iget-object p0, p2, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/cu4;->p()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_1
    iget-object p0, p2, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 23
    .line 24
    iget p1, p2, Ldefpackage/pe4;->A:I

    .line 25
    .line 26
    const/4 p2, -0x1

    .line 27
    if-eq p1, p2, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 p1, 0x0

    .line 31
    :goto_0
    invoke-virtual {p0, p1, p3, v0, v1}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-wide p0, p0, Ldefpackage/bu4;->k:J

    .line 36
    .line 37
    invoke-static {p0, p1}, Ldefpackage/f35;->i0(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0
.end method

.method public static j1(Ldefpackage/pe4;Ljava/util/ArrayList;Ldefpackage/zt4;Ldefpackage/bu4;)Ldefpackage/pe4;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v4, Ldefpackage/le4;

    .line 6
    .line 7
    invoke-direct {v4, p1}, Ldefpackage/le4;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 13
    .line 14
    invoke-interface {v1}, Ldefpackage/ne4;->get()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget v1, p0, Ldefpackage/pe4;->A:I

    .line 19
    .line 20
    const/4 v5, -0x1

    .line 21
    if-eq v1, v5, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    :goto_0
    invoke-static {p1, v4, v1, p2, p3}, Ldefpackage/qe4;->d1(Ldefpackage/cu4;Ldefpackage/le4;ILdefpackage/zt4;Ldefpackage/bu4;)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-ne v6, v5, :cond_1

    .line 30
    .line 31
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-wide v7, v2

    .line 38
    :goto_1
    const/4 v9, 0x1

    .line 39
    add-int/2addr v1, v9

    .line 40
    :goto_2
    if-ne v6, v5, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, Ldefpackage/cu4;->o()I

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    if-ge v1, v10, :cond_2

    .line 47
    .line 48
    invoke-static {p1, v4, v1, p2, p3}, Ldefpackage/qe4;->d1(Ldefpackage/cu4;Ldefpackage/le4;ILdefpackage/zt4;Ldefpackage/bu4;)I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    iget p1, p0, Ldefpackage/pe4;->d:I

    .line 56
    .line 57
    if-eq p1, v9, :cond_3

    .line 58
    .line 59
    if-ne v6, v5, :cond_3

    .line 60
    .line 61
    const/4 p1, 0x4

    .line 62
    iput p1, v0, Ldefpackage/oe4;->d:I

    .line 63
    .line 64
    :cond_3
    move v5, v6

    .line 65
    move-wide v6, v7

    .line 66
    const/4 v8, 0x1

    .line 67
    move-object v1, p0

    .line 68
    move-object v9, p3

    .line 69
    invoke-static/range {v0 .. v9}, Ldefpackage/qe4;->a1(Ldefpackage/oe4;Ldefpackage/pe4;JLdefpackage/cu4;IJZLdefpackage/bu4;)Ldefpackage/pe4;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static k1(Ldefpackage/pe4;Ljava/util/ArrayList;IJLdefpackage/bu4;)Ldefpackage/pe4;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 8
    .line 9
    move-object v4, p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v1, Ldefpackage/le4;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Ldefpackage/le4;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    move-object v4, v1

    .line 17
    :goto_0
    iget p1, p0, Ldefpackage/pe4;->d:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    if-eq p1, v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v4}, Ldefpackage/cu4;->p()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    const/4 p1, -0x1

    .line 29
    if-eq p2, p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v4}, Ldefpackage/cu4;->o()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-lt p2, p1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/4 p1, 0x2

    .line 39
    iput p1, v0, Ldefpackage/oe4;->d:I

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    :goto_1
    const/4 p1, 0x4

    .line 43
    iput p1, v0, Ldefpackage/oe4;->d:I

    .line 44
    .line 45
    :cond_3
    :goto_2
    iget-object p1, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 46
    .line 47
    invoke-interface {p1}, Ldefpackage/ne4;->get()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    const/4 v8, 0x0

    .line 52
    move-object v1, p0

    .line 53
    move v5, p2

    .line 54
    move-wide v6, p3

    .line 55
    move-object v9, p5

    .line 56
    invoke-static/range {v0 .. v9}, Ldefpackage/qe4;->a1(Ldefpackage/oe4;Ldefpackage/pe4;JLdefpackage/cu4;IJZLdefpackage/bu4;)Ldefpackage/pe4;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static z1(Ldefpackage/pe4;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/pe4;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/pe4;->d:I

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    iget p0, p0, Ldefpackage/pe4;->e:I

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method


# virtual methods
.method public final A0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 16
    .line 17
    iget v1, v1, Ldefpackage/pe4;->o:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v1, v1, v2

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Ldefpackage/qe4;->x1(F)Ldefpackage/ic2;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/4 v4, 0x0

    .line 33
    iget-object v5, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0, v4, v4}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    invoke-virtual {v5, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0, v2}, Ldefpackage/oe4;->c(F)V

    .line 59
    .line 60
    .line 61
    new-instance v2, Ldefpackage/pe4;

    .line 62
    .line 63
    invoke-direct {v2, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0, v4, v4}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Ldefpackage/ur2;

    .line 74
    .line 75
    const/16 v2, 0x15

    .line 76
    .line 77
    invoke-direct {v0, v2, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance v2, Ldefpackage/h41;

    .line 81
    .line 82
    const/4 v3, 0x3

    .line 83
    invoke-direct {v2, v3, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v1, v0, v2}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_0
    return-void
.end method

.method public final A1()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qe4;->o1()Ldefpackage/ic2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    iget-object v4, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0, v1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p0, v2, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 50
    .line 51
    .line 52
    new-instance v2, Ldefpackage/ur2;

    .line 53
    .line 54
    const/16 v3, 0x15

    .line 55
    .line 56
    invoke-direct {v2, v3, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v3, Ldefpackage/h41;

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    invoke-direct {v3, v4, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v1, v2, v3}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Ldefpackage/qe4;->i:Z

    .line 70
    .line 71
    iget-object v2, p0, Ldefpackage/qe4;->c:Ldefpackage/tc2;

    .line 72
    .line 73
    invoke-virtual {v2}, Ldefpackage/tc2;->d()V

    .line 74
    .line 75
    .line 76
    iget-object v2, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 77
    .line 78
    invoke-virtual {v2}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iput v1, v2, Ldefpackage/oe4;->d:I

    .line 83
    .line 84
    sget-object v1, Ldefpackage/ne4;->k:Ldefpackage/xm;

    .line 85
    .line 86
    iput-object v1, v2, Ldefpackage/oe4;->J:Ldefpackage/xm;

    .line 87
    .line 88
    iget-object v1, v0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 89
    .line 90
    invoke-interface {v1}, Ldefpackage/ne4;->get()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    iget-object v1, p0, Ldefpackage/fq;->b:Ldefpackage/bu4;

    .line 95
    .line 96
    invoke-static {v3, v4, v0, v1}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    new-instance v1, Ldefpackage/xm;

    .line 101
    .line 102
    invoke-direct {v1, v3, v4}, Ldefpackage/xm;-><init>(J)V

    .line 103
    .line 104
    .line 105
    iput-object v1, v2, Ldefpackage/oe4;->H:Ldefpackage/xm;

    .line 106
    .line 107
    iget-object v0, v0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 108
    .line 109
    iput-object v0, v2, Ldefpackage/oe4;->I:Ldefpackage/xm;

    .line 110
    .line 111
    new-instance v0, Ldefpackage/pe4;

    .line 112
    .line 113
    invoke-direct {v0, v2}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 117
    .line 118
    return-void
.end method

.method public final B()F
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->o:F

    .line 7
    .line 8
    return p0
.end method

.method public final B1(Ljava/util/List;IJ)V
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p2, v0, :cond_1

    .line 5
    .line 6
    if-ltz p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    move v0, v1

    .line 12
    :goto_1
    invoke-static {v0}, Ldefpackage/rr2;->l(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v6, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 16
    .line 17
    const/16 v0, 0x14

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->C1(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    const/16 v0, 0x1f

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->C1(I)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    :cond_2
    return-void

    .line 40
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Ldefpackage/qe4;->s1(Ljava/util/List;IJ)Ldefpackage/ic2;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v3, Ldefpackage/zd4;

    .line 45
    .line 46
    move-object v4, p0

    .line 47
    move-object v5, p1

    .line 48
    move v7, p2

    .line 49
    move-wide v8, p3

    .line 50
    invoke-direct/range {v3 .. v9}, Ldefpackage/zd4;-><init>(Ldefpackage/qe4;Ljava/util/List;Ldefpackage/pe4;IJ)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v0, v3, v2, v2}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1a

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final C1(I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/qe4;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ldefpackage/mi3;->a(I)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final D()Ldefpackage/il;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 7
    .line 8
    return-object p0
.end method

.method public final D0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-boolean p0, p0, Ldefpackage/pe4;->h:Z

    .line 7
    .line 8
    return p0
.end method

.method public final D1(Ldefpackage/pe4;ZZ)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 6
    .line 7
    iput-object v1, v0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 8
    .line 9
    iget-boolean v3, v1, Ldefpackage/pe4;->I:Z

    .line 10
    .line 11
    iget-object v4, v1, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 12
    .line 13
    iget-object v5, v1, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 14
    .line 15
    iget v6, v1, Ldefpackage/pe4;->A:I

    .line 16
    .line 17
    iget-object v7, v1, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 18
    .line 19
    const/4 v8, 0x0

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    iput-boolean v8, v9, Ldefpackage/oe4;->K:Z

    .line 28
    .line 29
    new-instance v10, Ldefpackage/pe4;

    .line 30
    .line 31
    invoke-direct {v10, v9}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 32
    .line 33
    .line 34
    iput-object v10, v0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 35
    .line 36
    :goto_0
    iget-boolean v9, v2, Ldefpackage/pe4;->b:Z

    .line 37
    .line 38
    iget v10, v2, Ldefpackage/pe4;->C:I

    .line 39
    .line 40
    iget v11, v2, Ldefpackage/pe4;->B:I

    .line 41
    .line 42
    iget-object v12, v2, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 43
    .line 44
    iget-boolean v13, v1, Ldefpackage/pe4;->b:Z

    .line 45
    .line 46
    if-eq v9, v13, :cond_1

    .line 47
    .line 48
    const/4 v9, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v9, v8

    .line 51
    :goto_1
    iget v13, v2, Ldefpackage/pe4;->d:I

    .line 52
    .line 53
    iget v15, v1, Ldefpackage/pe4;->d:I

    .line 54
    .line 55
    if-eq v13, v15, :cond_2

    .line 56
    .line 57
    const/4 v13, 0x1

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v13, v8

    .line 60
    :goto_2
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    iget-object v15, v0, Ldefpackage/qe4;->g:Ldefpackage/zt4;

    .line 66
    .line 67
    iget-object v14, v0, Ldefpackage/fq;->b:Ldefpackage/bu4;

    .line 68
    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    iget v10, v1, Ldefpackage/pe4;->J:I

    .line 72
    .line 73
    move/from16 v21, v9

    .line 74
    .line 75
    move v8, v10

    .line 76
    move/from16 v22, v13

    .line 77
    .line 78
    goto/16 :goto_a

    .line 79
    .line 80
    :cond_3
    if-eqz p2, :cond_4

    .line 81
    .line 82
    move/from16 v21, v9

    .line 83
    .line 84
    move/from16 v22, v13

    .line 85
    .line 86
    const/4 v8, 0x1

    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :cond_4
    invoke-virtual {v12}, Ldefpackage/cu4;->p()Z

    .line 90
    .line 91
    .line 92
    move-result v20

    .line 93
    if-eqz v20, :cond_5

    .line 94
    .line 95
    move/from16 v21, v9

    .line 96
    .line 97
    move/from16 v22, v13

    .line 98
    .line 99
    :goto_3
    const/4 v8, -0x1

    .line 100
    goto/16 :goto_a

    .line 101
    .line 102
    :cond_5
    invoke-virtual {v7}, Ldefpackage/cu4;->p()Z

    .line 103
    .line 104
    .line 105
    move-result v20

    .line 106
    if-eqz v20, :cond_6

    .line 107
    .line 108
    move/from16 v21, v9

    .line 109
    .line 110
    move/from16 v22, v13

    .line 111
    .line 112
    :goto_4
    const/4 v8, 0x4

    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_6
    invoke-static {v2, v15, v14}, Ldefpackage/qe4;->b1(Ldefpackage/pe4;Ldefpackage/zt4;Ldefpackage/bu4;)I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    invoke-virtual {v12, v8}, Ldefpackage/cu4;->l(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    move/from16 v21, v9

    .line 124
    .line 125
    invoke-static {v1, v15, v14}, Ldefpackage/qe4;->b1(Ldefpackage/pe4;Ldefpackage/zt4;Ldefpackage/bu4;)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    invoke-virtual {v7, v9}, Ldefpackage/cu4;->l(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    move/from16 v22, v13

    .line 134
    .line 135
    instance-of v13, v8, Ldefpackage/ke4;

    .line 136
    .line 137
    if-eqz v13, :cond_7

    .line 138
    .line 139
    instance-of v13, v9, Ldefpackage/ke4;

    .line 140
    .line 141
    if-nez v13, :cond_7

    .line 142
    .line 143
    :goto_5
    goto :goto_3

    .line 144
    :cond_7
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    if-eqz v13, :cond_c

    .line 149
    .line 150
    iget v13, v1, Ldefpackage/pe4;->B:I

    .line 151
    .line 152
    if-ne v11, v13, :cond_c

    .line 153
    .line 154
    iget v13, v1, Ldefpackage/pe4;->C:I

    .line 155
    .line 156
    if-eq v10, v13, :cond_8

    .line 157
    .line 158
    goto :goto_8

    .line 159
    :cond_8
    invoke-static {v2, v8, v15, v14}, Ldefpackage/qe4;->c1(Ldefpackage/pe4;Ljava/lang/Object;Ldefpackage/zt4;Ldefpackage/bu4;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v23

    .line 163
    invoke-static {v1, v9, v15, v14}, Ldefpackage/qe4;->c1(Ldefpackage/pe4;Ljava/lang/Object;Ldefpackage/zt4;Ldefpackage/bu4;)J

    .line 164
    .line 165
    .line 166
    move-result-wide v25

    .line 167
    sub-long v25, v23, v25

    .line 168
    .line 169
    invoke-static/range {v25 .. v26}, Ljava/lang/Math;->abs(J)J

    .line 170
    .line 171
    .line 172
    move-result-wide v25

    .line 173
    const-wide/16 v27, 0x3e8

    .line 174
    .line 175
    cmp-long v9, v25, v27

    .line 176
    .line 177
    if-gez v9, :cond_9

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    invoke-virtual {v12, v8, v15}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 181
    .line 182
    .line 183
    const/4 v8, -0x1

    .line 184
    if-ne v11, v8, :cond_a

    .line 185
    .line 186
    iget-wide v8, v15, Ldefpackage/zt4;->d:J

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_a
    invoke-virtual {v15, v11, v10}, Ldefpackage/zt4;->a(II)J

    .line 190
    .line 191
    .line 192
    move-result-wide v8

    .line 193
    :goto_6
    invoke-static {v8, v9}, Ldefpackage/f35;->i0(J)J

    .line 194
    .line 195
    .line 196
    move-result-wide v8

    .line 197
    cmp-long v10, v8, v16

    .line 198
    .line 199
    if-eqz v10, :cond_b

    .line 200
    .line 201
    cmp-long v8, v23, v8

    .line 202
    .line 203
    if-ltz v8, :cond_b

    .line 204
    .line 205
    :goto_7
    const/4 v8, 0x0

    .line 206
    goto :goto_a

    .line 207
    :cond_b
    const/4 v8, 0x5

    .line 208
    goto :goto_a

    .line 209
    :cond_c
    :goto_8
    invoke-virtual {v7, v8}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 210
    .line 211
    .line 212
    move-result v9

    .line 213
    const/4 v13, -0x1

    .line 214
    if-ne v9, v13, :cond_d

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_d
    invoke-static {v2, v8, v15, v14}, Ldefpackage/qe4;->c1(Ldefpackage/pe4;Ljava/lang/Object;Ldefpackage/zt4;Ldefpackage/bu4;)J

    .line 218
    .line 219
    .line 220
    move-result-wide v23

    .line 221
    invoke-virtual {v12, v8, v15}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 222
    .line 223
    .line 224
    if-ne v11, v13, :cond_e

    .line 225
    .line 226
    iget-wide v8, v15, Ldefpackage/zt4;->d:J

    .line 227
    .line 228
    goto :goto_9

    .line 229
    :cond_e
    invoke-virtual {v15, v11, v10}, Ldefpackage/zt4;->a(II)J

    .line 230
    .line 231
    .line 232
    move-result-wide v8

    .line 233
    :goto_9
    invoke-static {v8, v9}, Ldefpackage/f35;->i0(J)J

    .line 234
    .line 235
    .line 236
    move-result-wide v8

    .line 237
    cmp-long v10, v8, v16

    .line 238
    .line 239
    if-eqz v10, :cond_f

    .line 240
    .line 241
    cmp-long v8, v23, v8

    .line 242
    .line 243
    if-ltz v8, :cond_f

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_f
    const/4 v8, 0x3

    .line 247
    :goto_a
    invoke-virtual {v12, v7}, Ldefpackage/cu4;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    invoke-virtual {v7}, Ldefpackage/cu4;->p()Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    move-object v13, v12

    .line 256
    if-eqz v10, :cond_11

    .line 257
    .line 258
    invoke-virtual {v13}, Ldefpackage/cu4;->p()Z

    .line 259
    .line 260
    .line 261
    move-result v10

    .line 262
    if-eqz v10, :cond_11

    .line 263
    .line 264
    move-object v12, v4

    .line 265
    move-object/from16 v25, v5

    .line 266
    .line 267
    :cond_10
    :goto_b
    const/4 v4, -0x1

    .line 268
    goto/16 :goto_11

    .line 269
    .line 270
    :cond_11
    invoke-virtual {v7}, Ldefpackage/cu4;->p()Z

    .line 271
    .line 272
    .line 273
    move-result v10

    .line 274
    invoke-virtual {v13}, Ldefpackage/cu4;->p()Z

    .line 275
    .line 276
    .line 277
    move-result v11

    .line 278
    if-eq v10, v11, :cond_13

    .line 279
    .line 280
    move-object v12, v4

    .line 281
    move-object/from16 v25, v5

    .line 282
    .line 283
    :cond_12
    const/4 v4, 0x3

    .line 284
    goto/16 :goto_11

    .line 285
    .line 286
    :cond_13
    iget v10, v2, Ldefpackage/pe4;->A:I

    .line 287
    .line 288
    const/4 v11, -0x1

    .line 289
    if-eq v10, v11, :cond_14

    .line 290
    .line 291
    :goto_c
    const-wide/16 v11, 0x0

    .line 292
    .line 293
    goto :goto_d

    .line 294
    :cond_14
    const/4 v10, 0x0

    .line 295
    goto :goto_c

    .line 296
    :goto_d
    invoke-virtual {v13, v10, v14, v11, v12}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    iget-object v10, v10, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 301
    .line 302
    const/4 v11, -0x1

    .line 303
    if-eq v6, v11, :cond_15

    .line 304
    .line 305
    move v11, v6

    .line 306
    :goto_e
    move-object v12, v4

    .line 307
    move-object/from16 v25, v5

    .line 308
    .line 309
    const-wide/16 v4, 0x0

    .line 310
    .line 311
    goto :goto_f

    .line 312
    :cond_15
    const/4 v11, 0x0

    .line 313
    goto :goto_e

    .line 314
    :goto_f
    invoke-virtual {v7, v11, v14, v4, v5}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    iget-object v4, v11, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 319
    .line 320
    instance-of v5, v10, Ldefpackage/ke4;

    .line 321
    .line 322
    if-eqz v5, :cond_16

    .line 323
    .line 324
    instance-of v5, v4, Ldefpackage/ke4;

    .line 325
    .line 326
    if-nez v5, :cond_16

    .line 327
    .line 328
    goto :goto_b

    .line 329
    :cond_16
    invoke-virtual {v10, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    if-nez v4, :cond_18

    .line 334
    .line 335
    if-nez v8, :cond_17

    .line 336
    .line 337
    const/4 v4, 0x1

    .line 338
    goto :goto_11

    .line 339
    :cond_17
    const/4 v4, 0x1

    .line 340
    if-ne v8, v4, :cond_12

    .line 341
    .line 342
    :goto_10
    const/4 v4, 0x2

    .line 343
    goto :goto_11

    .line 344
    :cond_18
    if-nez v8, :cond_19

    .line 345
    .line 346
    iget-object v4, v2, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 347
    .line 348
    invoke-interface {v4}, Ldefpackage/ne4;->get()J

    .line 349
    .line 350
    .line 351
    move-result-wide v4

    .line 352
    invoke-static {v4, v5, v2, v14}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 353
    .line 354
    .line 355
    move-result-wide v4

    .line 356
    iget-object v10, v1, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 357
    .line 358
    invoke-interface {v10}, Ldefpackage/ne4;->get()J

    .line 359
    .line 360
    .line 361
    move-result-wide v10

    .line 362
    invoke-static {v10, v11, v1, v14}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 363
    .line 364
    .line 365
    move-result-wide v10

    .line 366
    cmp-long v4, v4, v10

    .line 367
    .line 368
    if-lez v4, :cond_19

    .line 369
    .line 370
    const/4 v4, 0x0

    .line 371
    goto :goto_11

    .line 372
    :cond_19
    const/4 v4, 0x1

    .line 373
    if-ne v8, v4, :cond_10

    .line 374
    .line 375
    if-eqz p3, :cond_10

    .line 376
    .line 377
    goto :goto_10

    .line 378
    :goto_11
    iget-object v0, v0, Ldefpackage/qe4;->c:Ldefpackage/tc2;

    .line 379
    .line 380
    if-nez v9, :cond_1e

    .line 381
    .line 382
    invoke-virtual {v13}, Ldefpackage/cu4;->o()I

    .line 383
    .line 384
    .line 385
    move-result v9

    .line 386
    invoke-virtual {v7}, Ldefpackage/cu4;->o()I

    .line 387
    .line 388
    .line 389
    move-result v10

    .line 390
    if-eq v9, v10, :cond_1a

    .line 391
    .line 392
    move-object/from16 v26, v12

    .line 393
    .line 394
    :goto_12
    const/4 v5, 0x0

    .line 395
    goto :goto_15

    .line 396
    :cond_1a
    const/4 v9, 0x0

    .line 397
    :goto_13
    invoke-virtual {v13}, Ldefpackage/cu4;->o()I

    .line 398
    .line 399
    .line 400
    move-result v10

    .line 401
    if-ge v9, v10, :cond_1d

    .line 402
    .line 403
    const-wide/16 v10, 0x0

    .line 404
    .line 405
    invoke-virtual {v13, v9, v14, v10, v11}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 406
    .line 407
    .line 408
    move-result-object v5

    .line 409
    iget-object v5, v5, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 410
    .line 411
    move-object/from16 v26, v12

    .line 412
    .line 413
    invoke-virtual {v7, v9, v14, v10, v11}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 414
    .line 415
    .line 416
    move-result-object v12

    .line 417
    iget-object v10, v12, Ldefpackage/bu4;->a:Ljava/lang/Object;

    .line 418
    .line 419
    instance-of v11, v5, Ldefpackage/ke4;

    .line 420
    .line 421
    if-eqz v11, :cond_1b

    .line 422
    .line 423
    instance-of v11, v10, Ldefpackage/ke4;

    .line 424
    .line 425
    if-nez v11, :cond_1b

    .line 426
    .line 427
    const/4 v11, 0x1

    .line 428
    goto :goto_14

    .line 429
    :cond_1b
    const/4 v11, 0x0

    .line 430
    :goto_14
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-nez v5, :cond_1c

    .line 435
    .line 436
    if-nez v11, :cond_1c

    .line 437
    .line 438
    goto :goto_12

    .line 439
    :cond_1c
    add-int/lit8 v9, v9, 0x1

    .line 440
    .line 441
    move-object/from16 v12, v26

    .line 442
    .line 443
    goto :goto_13

    .line 444
    :cond_1d
    move-object/from16 v26, v12

    .line 445
    .line 446
    const/4 v5, 0x1

    .line 447
    :goto_15
    new-instance v9, Ldefpackage/q31;

    .line 448
    .line 449
    const/4 v10, 0x7

    .line 450
    invoke-direct {v9, v5, v10, v1}, Ldefpackage/q31;-><init>(IILjava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    const/4 v5, 0x0

    .line 454
    invoke-virtual {v0, v5, v9}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 455
    .line 456
    .line 457
    goto :goto_16

    .line 458
    :cond_1e
    move-object/from16 v26, v12

    .line 459
    .line 460
    const/4 v5, 0x0

    .line 461
    :goto_16
    const/16 v9, 0xb

    .line 462
    .line 463
    const/4 v11, -0x1

    .line 464
    if-eq v8, v11, :cond_1f

    .line 465
    .line 466
    invoke-static {v2, v5, v14, v15}, Ldefpackage/qe4;->g1(Ldefpackage/pe4;ZLdefpackage/bu4;Ldefpackage/zt4;)Ldefpackage/pi3;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    invoke-static {v1, v3, v14, v15}, Ldefpackage/qe4;->g1(Ldefpackage/pe4;ZLdefpackage/bu4;Ldefpackage/zt4;)Ldefpackage/pi3;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    new-instance v5, Ldefpackage/z31;

    .line 475
    .line 476
    const/4 v12, 0x1

    .line 477
    invoke-direct {v5, v8, v10, v3, v12}, Ldefpackage/z31;-><init>(ILdefpackage/pi3;Ldefpackage/pi3;I)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v9, v5}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 481
    .line 482
    .line 483
    :cond_1f
    if-eq v4, v11, :cond_22

    .line 484
    .line 485
    invoke-virtual {v7}, Ldefpackage/cu4;->p()Z

    .line 486
    .line 487
    .line 488
    move-result v3

    .line 489
    if-eqz v3, :cond_20

    .line 490
    .line 491
    const/4 v3, 0x0

    .line 492
    goto :goto_19

    .line 493
    :cond_20
    if-eq v6, v11, :cond_21

    .line 494
    .line 495
    :goto_17
    const-wide/16 v10, 0x0

    .line 496
    .line 497
    goto :goto_18

    .line 498
    :cond_21
    const/4 v6, 0x0

    .line 499
    goto :goto_17

    .line 500
    :goto_18
    invoke-virtual {v7, v6, v14, v10, v11}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    iget-object v3, v3, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 505
    .line 506
    :goto_19
    new-instance v5, Ldefpackage/a41;

    .line 507
    .line 508
    const/4 v12, 0x1

    .line 509
    invoke-direct {v5, v3, v4, v12}, Ldefpackage/a41;-><init>(Ldefpackage/gn2;II)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v12, v5}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 513
    .line 514
    .line 515
    :cond_22
    iget-object v3, v2, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 516
    .line 517
    const/16 v4, 0x12

    .line 518
    .line 519
    const/16 v5, 0x11

    .line 520
    .line 521
    const/16 v6, 0xa

    .line 522
    .line 523
    move-object/from16 v7, v25

    .line 524
    .line 525
    if-eq v3, v7, :cond_23

    .line 526
    .line 527
    new-instance v3, Ldefpackage/ae4;

    .line 528
    .line 529
    invoke-direct {v3, v1, v5}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v0, v6, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 533
    .line 534
    .line 535
    if-eqz v7, :cond_23

    .line 536
    .line 537
    new-instance v3, Ldefpackage/ae4;

    .line 538
    .line 539
    invoke-direct {v3, v1, v4}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v0, v6, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 543
    .line 544
    .line 545
    :cond_23
    iget-object v3, v2, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 546
    .line 547
    iget-object v7, v1, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 548
    .line 549
    invoke-virtual {v3, v7}, Ldefpackage/cw4;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    if-nez v3, :cond_24

    .line 554
    .line 555
    new-instance v3, Ldefpackage/ae4;

    .line 556
    .line 557
    const/16 v7, 0x13

    .line 558
    .line 559
    invoke-direct {v3, v1, v7}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v7, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 563
    .line 564
    .line 565
    :cond_24
    iget-object v3, v2, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 566
    .line 567
    iget-object v7, v1, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 568
    .line 569
    invoke-virtual {v3, v7}, Ldefpackage/jw4;->equals(Ljava/lang/Object;)Z

    .line 570
    .line 571
    .line 572
    move-result v3

    .line 573
    const/16 v7, 0x14

    .line 574
    .line 575
    if-nez v3, :cond_25

    .line 576
    .line 577
    new-instance v3, Ldefpackage/ae4;

    .line 578
    .line 579
    invoke-direct {v3, v1, v7}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 580
    .line 581
    .line 582
    const/4 v8, 0x2

    .line 583
    invoke-virtual {v0, v8, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 584
    .line 585
    .line 586
    :cond_25
    iget-object v3, v2, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 587
    .line 588
    iget-object v8, v1, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 589
    .line 590
    invoke-virtual {v3, v8}, Ldefpackage/do2;->equals(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v3

    .line 594
    const/16 v8, 0xe

    .line 595
    .line 596
    if-nez v3, :cond_26

    .line 597
    .line 598
    new-instance v3, Ldefpackage/ae4;

    .line 599
    .line 600
    const/16 v10, 0x15

    .line 601
    .line 602
    invoke-direct {v3, v1, v10}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v0, v8, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 606
    .line 607
    .line 608
    :cond_26
    const/16 v3, 0x16

    .line 609
    .line 610
    if-nez v21, :cond_27

    .line 611
    .line 612
    if-eqz v22, :cond_28

    .line 613
    .line 614
    :cond_27
    new-instance v10, Ldefpackage/ae4;

    .line 615
    .line 616
    invoke-direct {v10, v1, v3}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 617
    .line 618
    .line 619
    const/4 v11, -0x1

    .line 620
    invoke-virtual {v0, v11, v10}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 621
    .line 622
    .line 623
    :cond_28
    if-eqz v22, :cond_29

    .line 624
    .line 625
    new-instance v10, Ldefpackage/ae4;

    .line 626
    .line 627
    const/16 v11, 0x17

    .line 628
    .line 629
    invoke-direct {v10, v1, v11}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 630
    .line 631
    .line 632
    const/4 v11, 0x4

    .line 633
    invoke-virtual {v0, v11, v10}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 634
    .line 635
    .line 636
    :cond_29
    const/16 v10, 0x18

    .line 637
    .line 638
    if-nez v21, :cond_2a

    .line 639
    .line 640
    iget v11, v2, Ldefpackage/pe4;->c:I

    .line 641
    .line 642
    iget v12, v1, Ldefpackage/pe4;->c:I

    .line 643
    .line 644
    if-eq v11, v12, :cond_2b

    .line 645
    .line 646
    :cond_2a
    new-instance v11, Ldefpackage/ae4;

    .line 647
    .line 648
    invoke-direct {v11, v1, v10}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 649
    .line 650
    .line 651
    const/4 v12, 0x5

    .line 652
    invoke-virtual {v0, v12, v11}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 653
    .line 654
    .line 655
    :cond_2b
    iget v11, v2, Ldefpackage/pe4;->e:I

    .line 656
    .line 657
    iget v12, v1, Ldefpackage/pe4;->e:I

    .line 658
    .line 659
    const/16 v13, 0x19

    .line 660
    .line 661
    const/4 v14, 0x6

    .line 662
    if-eq v11, v12, :cond_2c

    .line 663
    .line 664
    new-instance v11, Ldefpackage/ae4;

    .line 665
    .line 666
    invoke-direct {v11, v1, v13}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v14, v11}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 670
    .line 671
    .line 672
    :cond_2c
    invoke-static {v2}, Ldefpackage/qe4;->z1(Ldefpackage/pe4;)Z

    .line 673
    .line 674
    .line 675
    move-result v11

    .line 676
    invoke-static {v1}, Ldefpackage/qe4;->z1(Ldefpackage/pe4;)Z

    .line 677
    .line 678
    .line 679
    move-result v12

    .line 680
    if-eq v11, v12, :cond_2d

    .line 681
    .line 682
    new-instance v11, Ldefpackage/ae4;

    .line 683
    .line 684
    const/4 v12, 0x0

    .line 685
    invoke-direct {v11, v1, v12}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 686
    .line 687
    .line 688
    const/4 v12, 0x7

    .line 689
    invoke-virtual {v0, v12, v11}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 690
    .line 691
    .line 692
    :cond_2d
    iget-object v11, v2, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 693
    .line 694
    iget-object v12, v1, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 695
    .line 696
    invoke-virtual {v11, v12}, Ldefpackage/qh3;->equals(Ljava/lang/Object;)Z

    .line 697
    .line 698
    .line 699
    move-result v11

    .line 700
    const/16 v12, 0xc

    .line 701
    .line 702
    if-nez v11, :cond_2e

    .line 703
    .line 704
    new-instance v11, Ldefpackage/ae4;

    .line 705
    .line 706
    const/4 v15, 0x1

    .line 707
    invoke-direct {v11, v1, v15}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 708
    .line 709
    .line 710
    invoke-virtual {v0, v12, v11}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 711
    .line 712
    .line 713
    :cond_2e
    iget v11, v2, Ldefpackage/pe4;->g:I

    .line 714
    .line 715
    iget v15, v1, Ldefpackage/pe4;->g:I

    .line 716
    .line 717
    const/16 v8, 0x8

    .line 718
    .line 719
    if-eq v11, v15, :cond_2f

    .line 720
    .line 721
    new-instance v11, Ldefpackage/ae4;

    .line 722
    .line 723
    const/4 v15, 0x2

    .line 724
    invoke-direct {v11, v1, v15}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0, v8, v11}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 728
    .line 729
    .line 730
    :cond_2f
    iget-boolean v11, v2, Ldefpackage/pe4;->h:Z

    .line 731
    .line 732
    iget-boolean v15, v1, Ldefpackage/pe4;->h:Z

    .line 733
    .line 734
    const/16 v3, 0x9

    .line 735
    .line 736
    if-eq v11, v15, :cond_30

    .line 737
    .line 738
    new-instance v11, Ldefpackage/ae4;

    .line 739
    .line 740
    const/4 v15, 0x3

    .line 741
    invoke-direct {v11, v1, v15}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v0, v3, v11}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 745
    .line 746
    .line 747
    :cond_30
    iget-wide v10, v2, Ldefpackage/pe4;->i:J

    .line 748
    .line 749
    move-wide/from16 v18, v10

    .line 750
    .line 751
    iget-wide v9, v1, Ldefpackage/pe4;->i:J

    .line 752
    .line 753
    cmp-long v9, v18, v9

    .line 754
    .line 755
    const/16 v10, 0x10

    .line 756
    .line 757
    if-eqz v9, :cond_31

    .line 758
    .line 759
    new-instance v9, Ldefpackage/ae4;

    .line 760
    .line 761
    const/4 v11, 0x4

    .line 762
    invoke-direct {v9, v1, v11}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v0, v10, v9}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 766
    .line 767
    .line 768
    :cond_31
    iget-wide v10, v2, Ldefpackage/pe4;->j:J

    .line 769
    .line 770
    move-wide/from16 v18, v10

    .line 771
    .line 772
    iget-wide v9, v1, Ldefpackage/pe4;->j:J

    .line 773
    .line 774
    cmp-long v9, v18, v9

    .line 775
    .line 776
    if-eqz v9, :cond_32

    .line 777
    .line 778
    new-instance v9, Ldefpackage/ae4;

    .line 779
    .line 780
    const/4 v10, 0x5

    .line 781
    invoke-direct {v9, v1, v10}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v0, v5, v9}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 785
    .line 786
    .line 787
    :cond_32
    iget-wide v9, v2, Ldefpackage/pe4;->k:J

    .line 788
    .line 789
    iget-wide v12, v1, Ldefpackage/pe4;->k:J

    .line 790
    .line 791
    cmp-long v9, v9, v12

    .line 792
    .line 793
    if-eqz v9, :cond_33

    .line 794
    .line 795
    new-instance v9, Ldefpackage/ae4;

    .line 796
    .line 797
    invoke-direct {v9, v1, v14}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0, v4, v9}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 801
    .line 802
    .line 803
    :cond_33
    iget-object v4, v2, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 804
    .line 805
    iget-object v9, v1, Ldefpackage/pe4;->n:Ldefpackage/il;

    .line 806
    .line 807
    invoke-virtual {v4, v9}, Ldefpackage/il;->equals(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    if-nez v4, :cond_34

    .line 812
    .line 813
    new-instance v4, Ldefpackage/ae4;

    .line 814
    .line 815
    const/4 v12, 0x7

    .line 816
    invoke-direct {v4, v1, v12}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0, v7, v4}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 820
    .line 821
    .line 822
    :cond_34
    iget-object v4, v2, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 823
    .line 824
    iget-object v7, v1, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 825
    .line 826
    invoke-virtual {v4, v7}, Ldefpackage/s55;->equals(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    if-nez v4, :cond_35

    .line 831
    .line 832
    new-instance v4, Ldefpackage/ae4;

    .line 833
    .line 834
    invoke-direct {v4, v1, v8}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 835
    .line 836
    .line 837
    const/16 v5, 0x19

    .line 838
    .line 839
    invoke-virtual {v0, v5, v4}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 840
    .line 841
    .line 842
    :cond_35
    iget-object v4, v2, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 843
    .line 844
    iget-object v5, v1, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 845
    .line 846
    invoke-virtual {v4, v5}, Ldefpackage/hp0;->equals(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    if-nez v4, :cond_36

    .line 851
    .line 852
    new-instance v4, Ldefpackage/ae4;

    .line 853
    .line 854
    invoke-direct {v4, v1, v3}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 855
    .line 856
    .line 857
    const/16 v3, 0x1d

    .line 858
    .line 859
    invoke-virtual {v0, v3, v4}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 860
    .line 861
    .line 862
    :cond_36
    iget-object v3, v2, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 863
    .line 864
    iget-object v4, v1, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 865
    .line 866
    invoke-virtual {v3, v4}, Ldefpackage/do2;->equals(Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    if-nez v3, :cond_37

    .line 871
    .line 872
    new-instance v3, Ldefpackage/ae4;

    .line 873
    .line 874
    invoke-direct {v3, v1, v6}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 875
    .line 876
    .line 877
    const/16 v4, 0xf

    .line 878
    .line 879
    invoke-virtual {v0, v4, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 880
    .line 881
    .line 882
    :cond_37
    iget-object v3, v2, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 883
    .line 884
    iget-object v4, v1, Ldefpackage/pe4;->u:Ldefpackage/pf4;

    .line 885
    .line 886
    invoke-virtual {v3, v4}, Ldefpackage/pf4;->equals(Ljava/lang/Object;)Z

    .line 887
    .line 888
    .line 889
    move-result v3

    .line 890
    if-nez v3, :cond_38

    .line 891
    .line 892
    new-instance v3, Ldefpackage/ae4;

    .line 893
    .line 894
    const/16 v4, 0xb

    .line 895
    .line 896
    invoke-direct {v3, v1, v4}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 897
    .line 898
    .line 899
    const/16 v15, 0x18

    .line 900
    .line 901
    invoke-virtual {v0, v15, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 902
    .line 903
    .line 904
    :cond_38
    iget v3, v2, Ldefpackage/pe4;->o:F

    .line 905
    .line 906
    iget v4, v1, Ldefpackage/pe4;->o:F

    .line 907
    .line 908
    cmpl-float v3, v3, v4

    .line 909
    .line 910
    if-eqz v3, :cond_39

    .line 911
    .line 912
    new-instance v3, Ldefpackage/ae4;

    .line 913
    .line 914
    const/16 v11, 0xc

    .line 915
    .line 916
    invoke-direct {v3, v1, v11}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 917
    .line 918
    .line 919
    const/16 v4, 0x16

    .line 920
    .line 921
    invoke-virtual {v0, v4, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 922
    .line 923
    .line 924
    :cond_39
    iget v3, v2, Ldefpackage/pe4;->t:I

    .line 925
    .line 926
    iget v4, v1, Ldefpackage/pe4;->t:I

    .line 927
    .line 928
    if-ne v3, v4, :cond_3a

    .line 929
    .line 930
    goto :goto_1a

    .line 931
    :cond_3a
    new-instance v3, Ldefpackage/ae4;

    .line 932
    .line 933
    const/16 v4, 0xd

    .line 934
    .line 935
    invoke-direct {v3, v1, v4}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 936
    .line 937
    .line 938
    const/16 v4, 0x1e

    .line 939
    .line 940
    invoke-virtual {v0, v4, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 941
    .line 942
    .line 943
    :goto_1a
    iget-object v3, v2, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 944
    .line 945
    iget-object v4, v1, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 946
    .line 947
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    if-nez v3, :cond_3b

    .line 952
    .line 953
    new-instance v3, Ldefpackage/ae4;

    .line 954
    .line 955
    const/16 v4, 0xe

    .line 956
    .line 957
    invoke-direct {v3, v1, v4}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 958
    .line 959
    .line 960
    const/16 v4, 0x1b

    .line 961
    .line 962
    invoke-virtual {v0, v4, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 963
    .line 964
    .line 965
    :cond_3b
    iget-object v3, v2, Ldefpackage/pe4;->v:Ldefpackage/qv2;

    .line 966
    .line 967
    move-object/from16 v12, v26

    .line 968
    .line 969
    invoke-virtual {v3, v12}, Ldefpackage/qv2;->equals(Ljava/lang/Object;)Z

    .line 970
    .line 971
    .line 972
    move-result v3

    .line 973
    if-nez v3, :cond_3c

    .line 974
    .line 975
    iget-wide v3, v12, Ldefpackage/qv2;->b:J

    .line 976
    .line 977
    cmp-long v3, v3, v16

    .line 978
    .line 979
    if-eqz v3, :cond_3c

    .line 980
    .line 981
    new-instance v3, Ldefpackage/ae4;

    .line 982
    .line 983
    const/16 v4, 0xf

    .line 984
    .line 985
    invoke-direct {v3, v1, v4}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 986
    .line 987
    .line 988
    const/16 v4, 0x1c

    .line 989
    .line 990
    invoke-virtual {v0, v4, v3}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 991
    .line 992
    .line 993
    :cond_3c
    iget-object v2, v2, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 994
    .line 995
    iget-object v3, v1, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 996
    .line 997
    invoke-virtual {v2, v3}, Ldefpackage/mi3;->equals(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v2

    .line 1001
    if-nez v2, :cond_3d

    .line 1002
    .line 1003
    new-instance v2, Ldefpackage/ae4;

    .line 1004
    .line 1005
    const/16 v9, 0x10

    .line 1006
    .line 1007
    invoke-direct {v2, v1, v9}, Ldefpackage/ae4;-><init>(Ldefpackage/pe4;I)V

    .line 1008
    .line 1009
    .line 1010
    const/16 v1, 0xd

    .line 1011
    .line 1012
    invoke-virtual {v0, v1, v2}, Ldefpackage/tc2;->c(ILdefpackage/qc2;)V

    .line 1013
    .line 1014
    .line 1015
    :cond_3d
    invoke-virtual {v0}, Ldefpackage/tc2;->b()V

    .line 1016
    .line 1017
    .line 1018
    return-void
.end method

.method public final E(IZ)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x22

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final E0()Ldefpackage/cw4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->m:Ldefpackage/cw4;

    .line 7
    .line 8
    return-object p0
.end method

.method public final E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1, p3, p4}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, Ldefpackage/go4;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ldefpackage/pe4;

    .line 31
    .line 32
    invoke-virtual {p0, p2}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, p2, p3, p4}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 37
    .line 38
    .line 39
    new-instance p2, Ldefpackage/ur2;

    .line 40
    .line 41
    const/16 p3, 0x15

    .line 42
    .line 43
    invoke-direct {p2, p3, p0, p1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p3, Ldefpackage/h41;

    .line 47
    .line 48
    const/4 p4, 0x3

    .line 49
    invoke-direct {p3, p4, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p2, p3}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final F()Ldefpackage/hp0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->s:Ldefpackage/hp0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final F0()J
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/pe4;->F:Ldefpackage/xm;

    .line 7
    .line 8
    iget-wide v1, v1, Ldefpackage/xm;->n:J

    .line 9
    .line 10
    iget-object v3, p0, Ldefpackage/fq;->b:Ldefpackage/bu4;

    .line 11
    .line 12
    invoke-static {v1, v2, v0, v3}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 17
    .line 18
    iget-object v2, p0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 19
    .line 20
    invoke-interface {v2}, Ldefpackage/ne4;->get()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    invoke-static {v4, v5, p0, v3}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    return-wide v0
.end method

.method public final F1()V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/qe4;->d:Landroid/os/Looper;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-ne v0, v2, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 43
    .line 44
    const-string v1, "\'\nExpected thread: \'"

    .line 45
    .line 46
    const-string v2, "\'\n"

    .line 47
    .line 48
    const-string v3, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 49
    .line 50
    invoke-static {v3, p0, v1, v0, v2}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final G()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1a

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final G0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x19

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final H(II)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x21

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final J(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x22

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final K()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->C:I

    .line 7
    .line 8
    return p0
.end method

.method public final K0()Ldefpackage/do2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->y:Ldefpackage/do2;

    .line 7
    .line 8
    return-object p0
.end method

.method public final L(IILjava/util/List;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-gt p1, p2, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v4, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 16
    .line 17
    iget-object v1, v4, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 18
    .line 19
    invoke-virtual {v1}, Ldefpackage/cu4;->o()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x14

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ldefpackage/qe4;->C1(I)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    if-le p1, v1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-virtual {p0, p1, v6, p3}, Ldefpackage/qe4;->q1(IILjava/util/List;)Ldefpackage/ic2;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance v2, Ldefpackage/be4;

    .line 43
    .line 44
    move-object v3, p0

    .line 45
    move v7, p1

    .line 46
    move-object v5, p3

    .line 47
    invoke-direct/range {v2 .. v7}, Ldefpackage/be4;-><init>(Ldefpackage/qe4;Ldefpackage/pe4;Ljava/util/List;II)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, p2, v2, v0, v0}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_1
    return-void
.end method

.method public final L0(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, v0, v1, v2}, Ldefpackage/qe4;->B1(Ljava/util/List;IJ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final M(Ldefpackage/cw4;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x1d

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final M0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/qe4;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 13
    .line 14
    iget-wide v0, p0, Ldefpackage/xm;->n:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qe4;->Z()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public final N0(Ljava/util/List;I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p2, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 14
    .line 15
    iget-object v2, v1, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 16
    .line 17
    invoke-virtual {v2}, Ldefpackage/cu4;->o()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/16 v3, 0x14

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ldefpackage/qe4;->C1(I)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    invoke-virtual {p0, p1, p2}, Ldefpackage/qe4;->l1(Ljava/util/List;I)Ldefpackage/ic2;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Ldefpackage/ce4;

    .line 45
    .line 46
    invoke-direct {v3, p0, v1, p1, p2}, Ldefpackage/ce4;-><init>(Ldefpackage/qe4;Ldefpackage/pe4;Ljava/util/List;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v2, v3, v0, v0}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public final O0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-wide v0, p0, Ldefpackage/pe4;->i:J

    .line 7
    .line 8
    return-wide v0
.end method

.method public final P(II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v0

    .line 12
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 16
    .line 17
    iget-object v2, v1, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 18
    .line 19
    invoke-virtual {v2}, Ldefpackage/cu4;->o()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/16 v3, 0x14

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ldefpackage/qe4;->C1(I)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    if-lt p1, v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-ne p1, p2, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {p0, p1, p2}, Ldefpackage/qe4;->p1(II)Ldefpackage/ic2;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Ldefpackage/fe4;

    .line 48
    .line 49
    invoke-direct {v3, p0, v1, p1, p2}, Ldefpackage/fe4;-><init>(Ldefpackage/qe4;Ldefpackage/pe4;II)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2, v3, v0, v0}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    return-void
.end method

.method public final Q(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x1b

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, "Missing implementation to handle COMMAND_SET_VIDEO_SURFACE"

    .line 14
    .line 15
    if-nez p1, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->C1(I)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    :goto_0
    return-void

    .line 27
    :cond_1
    invoke-static {v1}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_2
    invoke-static {v1}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final R(F)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->x1(F)Ldefpackage/ic2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    iget-object v4, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0, p1}, Ldefpackage/oe4;->c(F)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Ldefpackage/pe4;

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Ldefpackage/ur2;

    .line 65
    .line 66
    const/16 v0, 0x15

    .line 67
    .line 68
    invoke-direct {p1, v0, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Ldefpackage/h41;

    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    invoke-direct {v0, v2, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v1, p1, v0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final T(Ljava/util/List;IJ)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    iget-object p2, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 8
    .line 9
    iget p3, p2, Ldefpackage/pe4;->A:I

    .line 10
    .line 11
    iget-object p2, p2, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 12
    .line 13
    invoke-interface {p2}, Ldefpackage/ne4;->get()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    move p2, p3

    .line 18
    move-wide p3, v0

    .line 19
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Ldefpackage/qe4;->B1(Ljava/util/List;IJ)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final U()Landroidx/media3/common/PlaybackException;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->f:Landroidx/media3/common/PlaybackException;

    .line 7
    .line 8
    return-object p0
.end method

.method public final U0()Landroid/os/Looper;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/qe4;->d:Landroid/os/Looper;

    .line 2
    .line 3
    return-object p0
.end method

.method public final V(Z)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->t1(Z)Ldefpackage/ic2;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    iget-object v5, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {v5}, Ljava/util/HashSet;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1, v4, v4}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-boolean p1, v0, Ldefpackage/oe4;->b:Z

    .line 49
    .line 50
    iput v1, v0, Ldefpackage/oe4;->c:I

    .line 51
    .line 52
    new-instance p1, Ldefpackage/pe4;

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p1, v4, v4}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Ldefpackage/ur2;

    .line 65
    .line 66
    const/16 v0, 0x15

    .line 67
    .line 68
    invoke-direct {p1, v0, p0, v2}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Ldefpackage/h41;

    .line 72
    .line 73
    const/4 v1, 0x3

    .line 74
    invoke-direct {v0, v1, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-interface {v2, p1, v0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final X()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-wide v0, p0, Ldefpackage/pe4;->j:J

    .line 7
    .line 8
    return-wide v0
.end method

.method public final X0(IIJZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v7, 0x1

    .line 6
    const/4 v2, -0x1

    .line 7
    if-eq p1, v2, :cond_1

    .line 8
    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v3, v0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    move v3, v7

    .line 15
    :goto_1
    invoke-static {v3}, Ldefpackage/rr2;->l(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v3, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 19
    .line 20
    invoke-virtual {p0, p2}, Ldefpackage/qe4;->C1(I)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_2

    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    if-eq p1, v2, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/qe4;->k()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_4

    .line 34
    .line 35
    iget-object v2, v3, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 36
    .line 37
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    iget-object v2, v3, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 44
    .line 45
    invoke-virtual {v2}, Ldefpackage/cu4;->o()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-lt p1, v2, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    move v2, v0

    .line 53
    goto :goto_3

    .line 54
    :cond_4
    :goto_2
    move v2, v7

    .line 55
    :goto_3
    invoke-virtual/range {p0 .. p4}, Ldefpackage/qe4;->r1(IIJ)Ldefpackage/ic2;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    new-instance v0, Ldefpackage/ee4;

    .line 60
    .line 61
    move-object v1, p0

    .line 62
    move v4, p1

    .line 63
    move-wide v5, p3

    .line 64
    invoke-direct/range {v0 .. v6}, Ldefpackage/ee4;-><init>(Ldefpackage/qe4;ZLdefpackage/pe4;IJ)V

    .line 65
    .line 66
    .line 67
    xor-int/2addr v2, v7

    .line 68
    invoke-virtual {p0, v8, v0, v2, p5}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final Z()J
    .locals 3

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/pe4;->D:Ldefpackage/ne4;

    .line 7
    .line 8
    invoke-interface {v1}, Ldefpackage/ne4;->get()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object p0, p0, Ldefpackage/fq;->b:Ldefpackage/bu4;

    .line 13
    .line 14
    invoke-static {v1, v2, v0, p0}, Ldefpackage/qe4;->h1(JLdefpackage/pe4;Ldefpackage/bu4;)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final a0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v1, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 16
    .line 17
    iget v1, v1, Ldefpackage/pe4;->o:F

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    cmpl-float v1, v1, v2

    .line 21
    .line 22
    if-nez v1, :cond_2

    .line 23
    .line 24
    iget v1, v0, Ldefpackage/pe4;->p:F

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->x1(F)Ldefpackage/ic2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    iget-object v4, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p0, v0, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget v0, v0, Ldefpackage/pe4;->p:F

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ldefpackage/oe4;->c(F)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Ldefpackage/pe4;

    .line 66
    .line 67
    invoke-direct {v0, v2}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0, v0, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Ldefpackage/ur2;

    .line 78
    .line 79
    const/16 v2, 0x15

    .line 80
    .line 81
    invoke-direct {v0, v2, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v2, Ldefpackage/h41;

    .line 85
    .line 86
    const/4 v3, 0x3

    .line 87
    invoke-direct {v2, v3, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v1, v0, v2}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_0
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qe4;->n1()Ldefpackage/ic2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Ldefpackage/sl;

    .line 19
    .line 20
    const/4 v3, 0x5

    .line 21
    invoke-direct {v2, v3, v0}, Ldefpackage/sl;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v1, v2, v0, v0}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final b0()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/qe4;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/pe4;->G:Ldefpackage/xm;

    .line 13
    .line 14
    iget-wide v0, v0, Ldefpackage/xm;->n:J

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/pe4;->E:Ldefpackage/xm;

    .line 17
    .line 18
    iget-wide v2, p0, Ldefpackage/xm;->n:J

    .line 19
    .line 20
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    return-wide v0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qe4;->F0()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    return-wide v0
.end method

.method public final d(Ldefpackage/qh3;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0xd

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->u1(Ldefpackage/qh3;)Ldefpackage/ic2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    iget-object v4, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object p1, v0, Ldefpackage/oe4;->l:Ldefpackage/qh3;

    .line 50
    .line 51
    new-instance p1, Ldefpackage/pe4;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ldefpackage/ur2;

    .line 64
    .line 65
    const/16 v0, 0x15

    .line 66
    .line 67
    invoke-direct {p1, v0, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ldefpackage/h41;

    .line 71
    .line 72
    const/4 v2, 0x3

    .line 73
    invoke-direct {v0, v2, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, p1, v0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final d0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x22

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e0()Ldefpackage/jw4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->x:Ldefpackage/jw4;

    .line 7
    .line 8
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public f1(Ldefpackage/pe4;)Ldefpackage/pe4;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final g()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->d:I

    .line 7
    .line 8
    return p0
.end method

.method public final g0()Ldefpackage/do2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->z:Ldefpackage/do2;

    .line 7
    .line 8
    return-object p0
.end method

.method public final getDuration()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/qe4;->k()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 11
    .line 12
    iget-object v0, v0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/qe4;->y()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    iget-object v3, p0, Ldefpackage/qe4;->g:Ldefpackage/zt4;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v3, v2}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 25
    .line 26
    iget v0, p0, Ldefpackage/pe4;->B:I

    .line 27
    .line 28
    iget p0, p0, Ldefpackage/pe4;->C:I

    .line 29
    .line 30
    invoke-virtual {v3, v0, p0}, Ldefpackage/zt4;->a(II)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {v0, v1}, Ldefpackage/f35;->i0(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    return-wide v0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ldefpackage/fq;->x()J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0
.end method

.method public final h()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->g:I

    .line 7
    .line 8
    return p0
.end method

.method public final i()Ldefpackage/qh3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->l:Ldefpackage/qh3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final i0()Ldefpackage/jg0;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->r:Ldefpackage/jg0;

    .line 7
    .line 8
    return-object p0
.end method

.method public abstract i1()Ldefpackage/pe4;
.end method

.method public final j()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->t:I

    .line 7
    .line 8
    return p0
.end method

.method public final k()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->B:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final k0(Ldefpackage/il;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x23

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final l0(Ldefpackage/do2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x13

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public l1(Ljava/util/List;I)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final m()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->H:Ldefpackage/xm;

    .line 7
    .line 8
    iget-wide v0, p0, Ldefpackage/xm;->n:J

    .line 9
    .line 10
    return-wide v0
.end method

.method public m1(III)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final n0()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->B:I

    .line 7
    .line 8
    return p0
.end method

.method public n1()Ldefpackage/ic2;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Missing implementation to handle COMMAND_PREPARE"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final o()Ldefpackage/mi3;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->a:Ldefpackage/mi3;

    .line 7
    .line 8
    return-object p0
.end method

.method public final o0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->A:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public o1()Ldefpackage/ic2;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Missing implementation to handle COMMAND_RELEASE"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final p0(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->v1(I)Ldefpackage/ic2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    iget-object v4, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput p1, v0, Ldefpackage/oe4;->g:I

    .line 50
    .line 51
    new-instance p1, Ldefpackage/pe4;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ldefpackage/ur2;

    .line 64
    .line 65
    const/16 v0, 0x15

    .line 66
    .line 67
    invoke-direct {p1, v0, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ldefpackage/h41;

    .line 71
    .line 72
    const/4 v2, 0x3

    .line 73
    invoke-direct {v0, v2, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, p1, v0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public p1(II)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final q()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-boolean p0, p0, Ldefpackage/pe4;->b:Z

    .line 7
    .line 8
    return p0
.end method

.method public final q0(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/16 p1, 0x1a

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->C1(I)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS"

    .line 14
    .line 15
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public q1(IILjava/util/List;)Ldefpackage/ic2;
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p2}, Ldefpackage/qe4;->l1(Ljava/util/List;I)Ldefpackage/ic2;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    return-object p3

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Ldefpackage/qe4;->p1(II)Ldefpackage/ic2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance p1, Ldefpackage/ss2;

    .line 13
    .line 14
    const/16 p2, 0xf

    .line 15
    .line 16
    invoke-direct {p1, p2, p0}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p3, p1}, Ldefpackage/f35;->h0(Ldefpackage/ic2;Ldefpackage/mk;)Ldefpackage/lb4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final r0(Ldefpackage/oi3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->c:Ldefpackage/tc2;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/tc2;->e(Ldefpackage/oi3;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public abstract r1(IIJ)Ldefpackage/ic2;
.end method

.method public final s(Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->w1(Z)Ldefpackage/ic2;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    iget-object v4, p0, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/HashSet;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ldefpackage/pe4;->a()Ldefpackage/oe4;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-boolean p1, v0, Ldefpackage/oe4;->h:Z

    .line 50
    .line 51
    new-instance p1, Ldefpackage/pe4;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ldefpackage/pe4;-><init>(Ldefpackage/oe4;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ldefpackage/qe4;->f1(Ldefpackage/pe4;)Ldefpackage/pe4;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1, v3, v3}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ldefpackage/ur2;

    .line 64
    .line 65
    const/16 v0, 0x15

    .line 66
    .line 67
    invoke-direct {p1, v0, p0, v1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ldefpackage/h41;

    .line 71
    .line 72
    const/4 v2, 0x3

    .line 73
    invoke-direct {v0, v2, p0}, Ldefpackage/h41;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v1, p1, v0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public s1(Ljava/util/List;IJ)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final stop()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-virtual {p0, v1}, Ldefpackage/qe4;->C1(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {p0}, Ldefpackage/qe4;->y1()Ldefpackage/ic2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Ldefpackage/bm0;

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct {v2, v3, p0, v0}, Ldefpackage/bm0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p0, v1, v2, v0, v0}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public abstract t1(Z)Ldefpackage/ic2;
.end method

.method public final u()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-wide v0, p0, Ldefpackage/pe4;->k:J

    .line 7
    .line 8
    return-wide v0
.end method

.method public final u0(III)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    if-ltz p3, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v0

    .line 14
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 18
    .line 19
    iget-object v1, v4, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 20
    .line 21
    invoke-virtual {v1}, Ldefpackage/cu4;->o()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x14

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ldefpackage/qe4;->C1(I)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-lt p1, v1, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    sub-int p2, v6, p1

    .line 43
    .line 44
    sub-int/2addr v1, p2

    .line 45
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eq p1, v6, :cond_3

    .line 50
    .line 51
    if-ne v7, p1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p0, p1, v6, v7}, Ldefpackage/qe4;->m1(III)Ldefpackage/ic2;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v2, Ldefpackage/de4;

    .line 59
    .line 60
    move-object v3, p0

    .line 61
    move v5, p1

    .line 62
    invoke-direct/range {v2 .. v7}, Ldefpackage/de4;-><init>(Ldefpackage/qe4;Ldefpackage/pe4;III)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, p2, v2, v0, v0}, Ldefpackage/qe4;->E1(Ldefpackage/ic2;Ldefpackage/go4;ZZ)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    return-void
.end method

.method public u1(Ldefpackage/qh3;)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final v(Ldefpackage/oi3;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->c:Ldefpackage/tc2;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/tc2;->a(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final v0()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget p0, p0, Ldefpackage/pe4;->e:I

    .line 7
    .line 8
    return p0
.end method

.method public v1(I)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_SET_REPEAT_MODE"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public w1(Z)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_SET_SHUFFLE_MODE"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final x0()Ldefpackage/cu4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->w:Ldefpackage/cu4;

    .line 7
    .line 8
    return-object p0
.end method

.method public x1(F)Ldefpackage/ic2;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "Missing implementation to handle COMMAND_SET_VOLUME"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final y()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/fq;->b:Ldefpackage/bu4;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/qe4;->g:Ldefpackage/zt4;

    .line 9
    .line 10
    invoke-static {v0, p0, v1}, Ldefpackage/qe4;->b1(Ldefpackage/pe4;Ldefpackage/zt4;Ldefpackage/bu4;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public final y0()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public y1()Ldefpackage/ic2;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Missing implementation to handle COMMAND_STOP"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final z()Ldefpackage/s55;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/qe4;->F1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/qe4;->h:Ldefpackage/pe4;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/pe4;->q:Ldefpackage/s55;

    .line 7
    .line 8
    return-object p0
.end method
