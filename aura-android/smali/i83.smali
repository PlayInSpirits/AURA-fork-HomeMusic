.class public final Li83;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lk51;


# instance fields
.field public a:Lm51;

.field public b:Lim4;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ll51;Lt71;)I
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Li83;->a:Lm51;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Li83;->b:Lim4;

    .line 11
    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p1}, Li83;->g(Ll51;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ll51;->k()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v0, "Failed to determine bitstream type"

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {v1, v0}, Landroidx/media3/common/ParserException;->a(Ljava/lang/RuntimeException;Ljava/lang/String;)Landroidx/media3/common/ParserException;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    iget-boolean v2, v0, Li83;->c:Z

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    iget-object v2, v0, Li83;->a:Lm51;

    .line 39
    .line 40
    invoke-interface {v2, v3, v4}, Lm51;->t(II)Lwv4;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v5, v0, Li83;->a:Lm51;

    .line 45
    .line 46
    invoke-interface {v5}, Lm51;->p()V

    .line 47
    .line 48
    .line 49
    iget-object v5, v0, Li83;->b:Lim4;

    .line 50
    .line 51
    iget-object v6, v0, Li83;->a:Lm51;

    .line 52
    .line 53
    iput-object v6, v5, Lim4;->c:Lm51;

    .line 54
    .line 55
    iput-object v2, v5, Lim4;->b:Lwv4;

    .line 56
    .line 57
    invoke-virtual {v5, v4}, Lim4;->d(Z)V

    .line 58
    .line 59
    .line 60
    iput-boolean v4, v0, Li83;->c:Z

    .line 61
    .line 62
    :cond_2
    iget-object v8, v0, Li83;->b:Lim4;

    .line 63
    .line 64
    iget-object v0, v8, Lim4;->a:Lbl0;

    .line 65
    .line 66
    iget-object v2, v8, Lim4;->b:Lwv4;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 72
    .line 73
    iget v2, v8, Lim4;->h:I

    .line 74
    .line 75
    const-wide/16 v5, -0x1

    .line 76
    .line 77
    const/4 v7, -0x1

    .line 78
    const/4 v9, 0x3

    .line 79
    const/4 v10, 0x2

    .line 80
    if-eqz v2, :cond_c

    .line 81
    .line 82
    if-eq v2, v4, :cond_b

    .line 83
    .line 84
    if-eq v2, v10, :cond_4

    .line 85
    .line 86
    if-ne v2, v9, :cond_3

    .line 87
    .line 88
    return v7

    .line 89
    :cond_3
    invoke-static {}, Ltb4;->a()V

    .line 90
    .line 91
    .line 92
    return v3

    .line 93
    :cond_4
    iget-object v2, v8, Lim4;->d:Ll83;

    .line 94
    .line 95
    invoke-interface {v2, v1}, Ll83;->b(Ll51;)J

    .line 96
    .line 97
    .line 98
    move-result-wide v10

    .line 99
    const-wide/16 v12, 0x0

    .line 100
    .line 101
    cmp-long v2, v10, v12

    .line 102
    .line 103
    if-ltz v2, :cond_5

    .line 104
    .line 105
    move-object/from16 v2, p2

    .line 106
    .line 107
    iput-wide v10, v2, Lt71;->a:J

    .line 108
    .line 109
    return v4

    .line 110
    :cond_5
    cmp-long v2, v10, v5

    .line 111
    .line 112
    if-gez v2, :cond_6

    .line 113
    .line 114
    const-wide/16 v14, 0x2

    .line 115
    .line 116
    add-long/2addr v10, v14

    .line 117
    neg-long v10, v10

    .line 118
    invoke-virtual {v8, v10, v11}, Lim4;->a(J)V

    .line 119
    .line 120
    .line 121
    :cond_6
    iget-boolean v2, v8, Lim4;->l:Z

    .line 122
    .line 123
    if-nez v2, :cond_7

    .line 124
    .line 125
    iget-object v2, v8, Lim4;->d:Ll83;

    .line 126
    .line 127
    invoke-interface {v2}, Ll83;->e()Lm84;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    iget-object v10, v8, Lim4;->c:Lm51;

    .line 135
    .line 136
    invoke-interface {v10, v2}, Lm51;->w(Lm84;)V

    .line 137
    .line 138
    .line 139
    iget-object v10, v8, Lim4;->b:Lwv4;

    .line 140
    .line 141
    invoke-interface {v2}, Lm84;->g()J

    .line 142
    .line 143
    .line 144
    move-result-wide v14

    .line 145
    invoke-interface {v10, v14, v15}, Lwv4;->d(J)V

    .line 146
    .line 147
    .line 148
    iput-boolean v4, v8, Lim4;->l:Z

    .line 149
    .line 150
    :cond_7
    iget-wide v10, v8, Lim4;->k:J

    .line 151
    .line 152
    cmp-long v2, v10, v12

    .line 153
    .line 154
    if-gtz v2, :cond_9

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Lbl0;->b(Ll51;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_8

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_8
    iput v9, v8, Lim4;->h:I

    .line 164
    .line 165
    return v7

    .line 166
    :cond_9
    :goto_1
    iput-wide v12, v8, Lim4;->k:J

    .line 167
    .line 168
    iget-object v0, v0, Lbl0;->r:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Lbe3;

    .line 171
    .line 172
    invoke-virtual {v8, v0}, Lim4;->b(Lbe3;)J

    .line 173
    .line 174
    .line 175
    move-result-wide v1

    .line 176
    cmp-long v4, v1, v12

    .line 177
    .line 178
    if-ltz v4, :cond_a

    .line 179
    .line 180
    iget-wide v9, v8, Lim4;->g:J

    .line 181
    .line 182
    add-long v11, v9, v1

    .line 183
    .line 184
    iget-wide v13, v8, Lim4;->e:J

    .line 185
    .line 186
    cmp-long v4, v11, v13

    .line 187
    .line 188
    if-ltz v4, :cond_a

    .line 189
    .line 190
    const-wide/32 v11, 0xf4240

    .line 191
    .line 192
    .line 193
    mul-long/2addr v9, v11

    .line 194
    iget v4, v8, Lim4;->i:I

    .line 195
    .line 196
    int-to-long v11, v4

    .line 197
    div-long v14, v9, v11

    .line 198
    .line 199
    iget-object v4, v8, Lim4;->b:Lwv4;

    .line 200
    .line 201
    iget v7, v0, Lbe3;->c:I

    .line 202
    .line 203
    invoke-interface {v4, v7, v0}, Lwv4;->e(ILbe3;)V

    .line 204
    .line 205
    .line 206
    iget-object v13, v8, Lim4;->b:Lwv4;

    .line 207
    .line 208
    iget v0, v0, Lbe3;->c:I

    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    const/16 v16, 0x1

    .line 215
    .line 216
    move/from16 v17, v0

    .line 217
    .line 218
    invoke-interface/range {v13 .. v19}, Lwv4;->a(JIIILvv4;)V

    .line 219
    .line 220
    .line 221
    iput-wide v5, v8, Lim4;->e:J

    .line 222
    .line 223
    :cond_a
    iget-wide v4, v8, Lim4;->g:J

    .line 224
    .line 225
    add-long/2addr v4, v1

    .line 226
    iput-wide v4, v8, Lim4;->g:J

    .line 227
    .line 228
    return v3

    .line 229
    :cond_b
    iget-wide v4, v8, Lim4;->f:J

    .line 230
    .line 231
    long-to-int v0, v4

    .line 232
    invoke-interface {v1, v0}, Ll51;->l(I)V

    .line 233
    .line 234
    .line 235
    iput v10, v8, Lim4;->h:I

    .line 236
    .line 237
    return v3

    .line 238
    :cond_c
    :goto_2
    invoke-virtual {v0, v1}, Lbl0;->b(Ll51;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    iget-object v11, v0, Lbl0;->r:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v11, Lbe3;

    .line 245
    .line 246
    if-nez v2, :cond_d

    .line 247
    .line 248
    iput v9, v8, Lim4;->h:I

    .line 249
    .line 250
    return v7

    .line 251
    :cond_d
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 252
    .line 253
    .line 254
    move-result-wide v12

    .line 255
    iget-wide v14, v8, Lim4;->f:J

    .line 256
    .line 257
    sub-long/2addr v12, v14

    .line 258
    iput-wide v12, v8, Lim4;->k:J

    .line 259
    .line 260
    iget-object v2, v8, Lim4;->j:Lrf2;

    .line 261
    .line 262
    invoke-virtual {v8, v11, v14, v15, v2}, Lim4;->c(Lbe3;JLrf2;)Z

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-eqz v2, :cond_e

    .line 267
    .line 268
    invoke-interface {v1}, Ll51;->getPosition()J

    .line 269
    .line 270
    .line 271
    move-result-wide v11

    .line 272
    iput-wide v11, v8, Lim4;->f:J

    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_e
    iget-object v2, v8, Lim4;->j:Lrf2;

    .line 276
    .line 277
    iget-object v2, v2, Lrf2;->n:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v2, Ltb1;

    .line 280
    .line 281
    iget v7, v2, Ltb1;->G:I

    .line 282
    .line 283
    iput v7, v8, Lim4;->i:I

    .line 284
    .line 285
    iget-boolean v7, v8, Lim4;->m:Z

    .line 286
    .line 287
    if-nez v7, :cond_f

    .line 288
    .line 289
    iget-object v7, v8, Lim4;->b:Lwv4;

    .line 290
    .line 291
    invoke-interface {v7, v2}, Lwv4;->g(Ltb1;)V

    .line 292
    .line 293
    .line 294
    iput-boolean v4, v8, Lim4;->m:Z

    .line 295
    .line 296
    :cond_f
    iget-object v2, v8, Lim4;->j:Lrf2;

    .line 297
    .line 298
    iget-object v2, v2, Lrf2;->o:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v2, Lru;

    .line 301
    .line 302
    if-eqz v2, :cond_10

    .line 303
    .line 304
    iput-object v2, v8, Lim4;->d:Ll83;

    .line 305
    .line 306
    :goto_3
    move v2, v10

    .line 307
    move-object v0, v11

    .line 308
    goto :goto_5

    .line 309
    :cond_10
    invoke-interface {v1}, Ll51;->getLength()J

    .line 310
    .line 311
    .line 312
    move-result-wide v12

    .line 313
    cmp-long v2, v12, v5

    .line 314
    .line 315
    if-nez v2, :cond_11

    .line 316
    .line 317
    new-instance v0, Lxi4;

    .line 318
    .line 319
    const/16 v1, 0x9

    .line 320
    .line 321
    invoke-direct {v0, v1}, Lxi4;-><init>(I)V

    .line 322
    .line 323
    .line 324
    iput-object v0, v8, Lim4;->d:Ll83;

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_11
    iget-object v0, v0, Lbl0;->q:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, Lk83;

    .line 330
    .line 331
    iget v2, v0, Lk83;->a:I

    .line 332
    .line 333
    and-int/lit8 v2, v2, 0x4

    .line 334
    .line 335
    if-eqz v2, :cond_12

    .line 336
    .line 337
    move/from16 v17, v4

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_12
    move/from16 v17, v3

    .line 341
    .line 342
    :goto_4
    new-instance v7, Lfm0;

    .line 343
    .line 344
    move v2, v10

    .line 345
    iget-wide v9, v8, Lim4;->f:J

    .line 346
    .line 347
    invoke-interface {v1}, Ll51;->getLength()J

    .line 348
    .line 349
    .line 350
    move-result-wide v4

    .line 351
    iget v1, v0, Lk83;->d:I

    .line 352
    .line 353
    iget v6, v0, Lk83;->e:I

    .line 354
    .line 355
    add-int/2addr v1, v6

    .line 356
    int-to-long v13, v1

    .line 357
    iget-wide v0, v0, Lk83;->b:J

    .line 358
    .line 359
    move-wide v15, v0

    .line 360
    move-object v0, v11

    .line 361
    move-wide v11, v4

    .line 362
    invoke-direct/range {v7 .. v17}, Lfm0;-><init>(Lim4;JJJJZ)V

    .line 363
    .line 364
    .line 365
    iput-object v7, v8, Lim4;->d:Ll83;

    .line 366
    .line 367
    :goto_5
    iput v2, v8, Lim4;->h:I

    .line 368
    .line 369
    iget-object v1, v0, Lbe3;->a:[B

    .line 370
    .line 371
    array-length v2, v1

    .line 372
    const v4, 0xfe01

    .line 373
    .line 374
    .line 375
    if-ne v2, v4, :cond_13

    .line 376
    .line 377
    return v3

    .line 378
    :cond_13
    iget v2, v0, Lbe3;->c:I

    .line 379
    .line 380
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    iget v2, v0, Lbe3;->c:I

    .line 389
    .line 390
    invoke-virtual {v0, v2, v1}, Lbe3;->L(I[B)V

    .line 391
    .line 392
    .line 393
    return v3
.end method

.method public final c(Ll51;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Li83;->g(Ll51;)Z

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p0

    .line 6
    :catch_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public final d(JJ)V
    .locals 5

    .line 1
    iget-object p0, p0, Li83;->b:Lim4;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lim4;->a:Lbl0;

    .line 6
    .line 7
    iget-object v1, v0, Lbl0;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lk83;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput v2, v1, Lk83;->a:I

    .line 13
    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    iput-wide v3, v1, Lk83;->b:J

    .line 17
    .line 18
    iput v2, v1, Lk83;->c:I

    .line 19
    .line 20
    iput v2, v1, Lk83;->d:I

    .line 21
    .line 22
    iput v2, v1, Lk83;->e:I

    .line 23
    .line 24
    iget-object v1, v0, Lbl0;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lbe3;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lbe3;->K(I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    iput v1, v0, Lbl0;->n:I

    .line 33
    .line 34
    iput-boolean v2, v0, Lbl0;->p:Z

    .line 35
    .line 36
    cmp-long p1, p1, v3

    .line 37
    .line 38
    if-nez p1, :cond_0

    .line 39
    .line 40
    iget-boolean p1, p0, Lim4;->l:Z

    .line 41
    .line 42
    xor-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lim4;->d(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    iget p1, p0, Lim4;->h:I

    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    iget p1, p0, Lim4;->i:I

    .line 53
    .line 54
    int-to-long p1, p1

    .line 55
    mul-long/2addr p1, p3

    .line 56
    const-wide/32 p3, 0xf4240

    .line 57
    .line 58
    .line 59
    div-long/2addr p1, p3

    .line 60
    iput-wide p1, p0, Lim4;->e:J

    .line 61
    .line 62
    iget-object p3, p0, Lim4;->d:Ll83;

    .line 63
    .line 64
    sget-object p4, Lf35;->a:Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {p3, p1, p2}, Ll83;->g(J)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x2

    .line 70
    iput p1, p0, Lim4;->h:I

    .line 71
    .line 72
    :cond_1
    return-void
.end method

.method public final f(Lm51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li83;->a:Lm51;

    .line 2
    .line 3
    return-void
.end method

.method public final g(Ll51;)Z
    .locals 8

    .line 1
    new-instance v0, Lk83;

    .line 2
    .line 3
    invoke-direct {v0}, Lk83;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p1, v1}, Lk83;->a(Ll51;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    iget v2, v0, Lk83;->a:I

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    and-int/2addr v2, v4

    .line 18
    if-eq v2, v4, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget v0, v0, Lk83;->e:I

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Lbe3;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lbe3;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iget-object v4, v2, Lbe3;->a:[B

    .line 35
    .line 36
    invoke-interface {p1, v4, v3, v0}, Ll51;->n([BII)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lbe3;->a()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    const/4 v0, 0x5

    .line 47
    if-lt p1, v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Lbe3;->A()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    const/16 v0, 0x7f

    .line 54
    .line 55
    if-ne p1, v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2}, Lbe3;->C()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    const-wide/32 v6, 0x464c4143

    .line 62
    .line 63
    .line 64
    cmp-long p1, v4, v6

    .line 65
    .line 66
    if-nez p1, :cond_1

    .line 67
    .line 68
    new-instance p1, Lu71;

    .line 69
    .line 70
    invoke-direct {p1}, Lim4;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Li83;->b:Lim4;

    .line 74
    .line 75
    return v1

    .line 76
    :cond_1
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 77
    .line 78
    .line 79
    :try_start_0
    invoke-static {v1, v2, v1}, Lzz1;->N(ILbe3;Z)Z

    .line 80
    .line 81
    .line 82
    move-result p1
    :try_end_0
    .catch Landroidx/media3/common/ParserException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move p1, v3

    .line 85
    :goto_0
    if-eqz p1, :cond_2

    .line 86
    .line 87
    new-instance p1, Ls85;

    .line 88
    .line 89
    invoke-direct {p1}, Lim4;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object p1, p0, Li83;->b:Lim4;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {v2, v3}, Lbe3;->N(I)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Leb3;->o:[B

    .line 99
    .line 100
    invoke-static {v2, p1}, Leb3;->e(Lbe3;[B)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    new-instance p1, Leb3;

    .line 107
    .line 108
    invoke-direct {p1}, Lim4;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Li83;->b:Lim4;

    .line 112
    .line 113
    :goto_1
    return v1

    .line 114
    :cond_3
    :goto_2
    return v3
.end method
