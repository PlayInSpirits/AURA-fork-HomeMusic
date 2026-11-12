.class public final Lba1;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La90;
.implements Lb83;
.implements Lfx2;
.implements Leo0;


# instance fields
.field public final B:Lwf1;

.field public C:Z

.field public D:Z

.field public final E:I

.field public F:Lc12;


# direct methods
.method public constructor <init>(ILwf1;I)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x4

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0}, Lcx2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lba1;->B:Lwf1;

    .line 10
    .line 11
    iput p1, p0, Lba1;->E:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final Q()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lba1;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final j0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Ler1;->n()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lra;

    .line 30
    .line 31
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lte5;->p(Lba1;)Lba1;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lra;

    .line 43
    .line 44
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ley;

    .line 49
    .line 50
    const/16 v2, 0x8

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-virtual {v0, v2, v1, v3}, Ley;->b(IZZ)Z

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Ley;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ls91;

    .line 59
    .line 60
    invoke-virtual {v0}, Ls91;->a()V

    .line 61
    .line 62
    .line 63
    :goto_0
    iget-object v0, p0, Lba1;->F:Lc12;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0}, Lc12;->k()V

    .line 68
    .line 69
    .line 70
    :cond_3
    const/4 v0, 0x0

    .line 71
    iput-object v0, p0, Lba1;->F:Lc12;

    .line 72
    .line 73
    return-void
.end method

.method public final k0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lz91;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lra;

    .line 16
    .line 17
    invoke-virtual {p0}, Lra;->getFocusOwner()Lu91;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    check-cast p0, Ley;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {p0, v0, v1, v1}, Ley;->b(IZZ)Z

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final q0()Z
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Luc5;->O(Lba1;)Lug0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x3

    .line 13
    const/4 v4, 0x2

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    if-eq v1, v5, :cond_0

    .line 18
    .line 19
    if-eq v1, v4, :cond_2

    .line 20
    .line 21
    if-ne v1, v3, :cond_1

    .line 22
    .line 23
    :cond_0
    :goto_0
    move/from16 v19, v2

    .line 24
    .line 25
    goto/16 :goto_1d

    .line 26
    .line 27
    :cond_1
    invoke-static {}, Ler1;->n()V

    .line 28
    .line 29
    .line 30
    return v2

    .line 31
    :cond_2
    move/from16 v18, v5

    .line 32
    .line 33
    goto/16 :goto_1e

    .line 34
    .line 35
    :cond_3
    invoke-static {v0}, Lj51;->P(Leo0;)Lub3;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lra;

    .line 40
    .line 41
    invoke-virtual {v1}, Lra;->getFocusOwner()Lu91;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ley;

    .line 46
    .line 47
    invoke-virtual {v1}, Ley;->f()Lba1;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v0}, Lba1;->v0()Lz91;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    if-ne v6, v0, :cond_4

    .line 56
    .line 57
    invoke-virtual {v0, v7, v7}, Lba1;->r0(Lz91;Lz91;)V

    .line 58
    .line 59
    .line 60
    return v5

    .line 61
    :cond_4
    if-eqz v6, :cond_5

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_5
    invoke-static {v0}, Lj51;->P(Leo0;)Lub3;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    check-cast v8, Lra;

    .line 69
    .line 70
    invoke-virtual {v8}, Lra;->getFocusOwner()Lu91;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Ley;

    .line 75
    .line 76
    iget-object v8, v8, Ley;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Lra;

    .line 79
    .line 80
    invoke-virtual {v8}, Lra;->B()Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-nez v8, :cond_6

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_6
    :goto_1
    const-string v8, "visitAncestors called on an unattached node"

    .line 88
    .line 89
    const/16 v9, 0x10

    .line 90
    .line 91
    if-eqz v6, :cond_12

    .line 92
    .line 93
    new-instance v11, Lf13;

    .line 94
    .line 95
    new-array v12, v9, [Lba1;

    .line 96
    .line 97
    invoke-direct {v11, v12}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v12, v6, Lcx2;->n:Lcx2;

    .line 101
    .line 102
    iget-boolean v12, v12, Lcx2;->A:Z

    .line 103
    .line 104
    if-nez v12, :cond_7

    .line 105
    .line 106
    invoke-static {v8}, Lcz1;->b(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_7
    iget-object v12, v6, Lcx2;->n:Lcx2;

    .line 110
    .line 111
    iget-object v12, v12, Lcx2;->r:Lcx2;

    .line 112
    .line 113
    invoke-static {v6}, Lj51;->O(Leo0;)Lc72;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    :goto_2
    if-eqz v13, :cond_13

    .line 118
    .line 119
    iget-object v14, v13, Lc72;->Q:Lw12;

    .line 120
    .line 121
    iget-object v14, v14, Lw12;->g:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v14, Lcx2;

    .line 124
    .line 125
    iget v14, v14, Lcx2;->q:I

    .line 126
    .line 127
    and-int/lit16 v14, v14, 0x400

    .line 128
    .line 129
    if-eqz v14, :cond_10

    .line 130
    .line 131
    :goto_3
    if-eqz v12, :cond_10

    .line 132
    .line 133
    iget v14, v12, Lcx2;->p:I

    .line 134
    .line 135
    and-int/lit16 v14, v14, 0x400

    .line 136
    .line 137
    if-eqz v14, :cond_f

    .line 138
    .line 139
    move-object v14, v12

    .line 140
    const/4 v15, 0x0

    .line 141
    :goto_4
    if-eqz v14, :cond_f

    .line 142
    .line 143
    instance-of v10, v14, Lba1;

    .line 144
    .line 145
    if-eqz v10, :cond_8

    .line 146
    .line 147
    check-cast v14, Lba1;

    .line 148
    .line 149
    invoke-virtual {v11, v14}, Lf13;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_8
    iget v10, v14, Lcx2;->p:I

    .line 154
    .line 155
    and-int/lit16 v10, v10, 0x400

    .line 156
    .line 157
    if-eqz v10, :cond_e

    .line 158
    .line 159
    instance-of v10, v14, Lfo0;

    .line 160
    .line 161
    if-eqz v10, :cond_e

    .line 162
    .line 163
    move-object v10, v14

    .line 164
    check-cast v10, Lfo0;

    .line 165
    .line 166
    iget-object v10, v10, Lfo0;->C:Lcx2;

    .line 167
    .line 168
    move v3, v2

    .line 169
    :goto_5
    if-eqz v10, :cond_d

    .line 170
    .line 171
    iget v4, v10, Lcx2;->p:I

    .line 172
    .line 173
    and-int/lit16 v4, v4, 0x400

    .line 174
    .line 175
    if-eqz v4, :cond_c

    .line 176
    .line 177
    add-int/lit8 v3, v3, 0x1

    .line 178
    .line 179
    if-ne v3, v5, :cond_9

    .line 180
    .line 181
    move-object v14, v10

    .line 182
    goto :goto_6

    .line 183
    :cond_9
    if-nez v15, :cond_a

    .line 184
    .line 185
    new-instance v4, Lf13;

    .line 186
    .line 187
    new-array v15, v9, [Lcx2;

    .line 188
    .line 189
    invoke-direct {v4, v15}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    move-object v15, v4

    .line 193
    :cond_a
    if-eqz v14, :cond_b

    .line 194
    .line 195
    invoke-virtual {v15, v14}, Lf13;->b(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    :cond_b
    invoke-virtual {v15, v10}, Lf13;->b(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_c
    :goto_6
    iget-object v10, v10, Lcx2;->s:Lcx2;

    .line 203
    .line 204
    const/4 v4, 0x2

    .line 205
    goto :goto_5

    .line 206
    :cond_d
    if-ne v3, v5, :cond_e

    .line 207
    .line 208
    :goto_7
    const/4 v3, 0x3

    .line 209
    const/4 v4, 0x2

    .line 210
    goto :goto_4

    .line 211
    :cond_e
    :goto_8
    invoke-static {v15}, Lj51;->c(Lf13;)Lcx2;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    goto :goto_7

    .line 216
    :cond_f
    iget-object v12, v12, Lcx2;->r:Lcx2;

    .line 217
    .line 218
    const/4 v3, 0x3

    .line 219
    const/4 v4, 0x2

    .line 220
    goto :goto_3

    .line 221
    :cond_10
    invoke-virtual {v13}, Lc72;->t()Lc72;

    .line 222
    .line 223
    .line 224
    move-result-object v13

    .line 225
    if-eqz v13, :cond_11

    .line 226
    .line 227
    iget-object v3, v13, Lc72;->Q:Lw12;

    .line 228
    .line 229
    if-eqz v3, :cond_11

    .line 230
    .line 231
    iget-object v3, v3, Lw12;->f:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v3, Lsq4;

    .line 234
    .line 235
    move-object v12, v3

    .line 236
    goto :goto_9

    .line 237
    :cond_11
    const/4 v12, 0x0

    .line 238
    :goto_9
    const/4 v3, 0x3

    .line 239
    const/4 v4, 0x2

    .line 240
    goto :goto_2

    .line 241
    :cond_12
    const/4 v11, 0x0

    .line 242
    :cond_13
    new-array v3, v9, [Lba1;

    .line 243
    .line 244
    new-array v4, v9, [Lba1;

    .line 245
    .line 246
    iget-object v10, v0, Lcx2;->n:Lcx2;

    .line 247
    .line 248
    iget-boolean v10, v10, Lcx2;->A:Z

    .line 249
    .line 250
    if-nez v10, :cond_14

    .line 251
    .line 252
    invoke-static {v8}, Lcz1;->b(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :cond_14
    iget-object v8, v0, Lcx2;->n:Lcx2;

    .line 256
    .line 257
    iget-object v8, v8, Lcx2;->r:Lcx2;

    .line 258
    .line 259
    invoke-static {v0}, Lj51;->O(Leo0;)Lc72;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    move v13, v2

    .line 264
    move v14, v13

    .line 265
    move v12, v5

    .line 266
    :goto_a
    if-eqz v10, :cond_25

    .line 267
    .line 268
    iget-object v15, v10, Lc72;->Q:Lw12;

    .line 269
    .line 270
    iget-object v15, v15, Lw12;->g:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v15, Lcx2;

    .line 273
    .line 274
    iget v15, v15, Lcx2;->q:I

    .line 275
    .line 276
    and-int/lit16 v15, v15, 0x400

    .line 277
    .line 278
    if-eqz v15, :cond_23

    .line 279
    .line 280
    :goto_b
    if-eqz v8, :cond_23

    .line 281
    .line 282
    iget v15, v8, Lcx2;->p:I

    .line 283
    .line 284
    and-int/lit16 v15, v15, 0x400

    .line 285
    .line 286
    if-eqz v15, :cond_22

    .line 287
    .line 288
    move-object v15, v8

    .line 289
    const/16 v16, 0x0

    .line 290
    .line 291
    :goto_c
    if-eqz v15, :cond_22

    .line 292
    .line 293
    instance-of v9, v15, Lba1;

    .line 294
    .line 295
    if-eqz v9, :cond_1a

    .line 296
    .line 297
    move-object v9, v15

    .line 298
    check-cast v9, Lba1;

    .line 299
    .line 300
    if-eqz v11, :cond_15

    .line 301
    .line 302
    invoke-virtual {v11, v9}, Lf13;->j(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v18

    .line 306
    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 307
    .line 308
    .line 309
    move-result-object v18

    .line 310
    move-object/from16 v5, v18

    .line 311
    .line 312
    goto :goto_d

    .line 313
    :cond_15
    const/4 v5, 0x0

    .line 314
    :goto_d
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 315
    .line 316
    invoke-static {v5, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-eqz v2, :cond_17

    .line 321
    .line 322
    add-int/lit8 v2, v13, 0x1

    .line 323
    .line 324
    array-length v5, v3

    .line 325
    if-ge v5, v2, :cond_16

    .line 326
    .line 327
    array-length v5, v3

    .line 328
    move-object/from16 v20, v1

    .line 329
    .line 330
    mul-int/lit8 v1, v5, 0x2

    .line 331
    .line 332
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    new-array v1, v1, [Ljava/lang/Object;

    .line 337
    .line 338
    move/from16 v21, v2

    .line 339
    .line 340
    const/4 v2, 0x0

    .line 341
    invoke-static {v3, v2, v1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 342
    .line 343
    .line 344
    move-object v3, v1

    .line 345
    goto :goto_e

    .line 346
    :cond_16
    move-object/from16 v20, v1

    .line 347
    .line 348
    move/from16 v21, v2

    .line 349
    .line 350
    :goto_e
    aput-object v9, v3, v13

    .line 351
    .line 352
    move/from16 v13, v21

    .line 353
    .line 354
    goto :goto_10

    .line 355
    :cond_17
    move-object/from16 v20, v1

    .line 356
    .line 357
    add-int/lit8 v1, v14, 0x1

    .line 358
    .line 359
    array-length v2, v4

    .line 360
    if-ge v2, v1, :cond_18

    .line 361
    .line 362
    array-length v2, v4

    .line 363
    mul-int/lit8 v5, v2, 0x2

    .line 364
    .line 365
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 366
    .line 367
    .line 368
    move-result v5

    .line 369
    new-array v5, v5, [Ljava/lang/Object;

    .line 370
    .line 371
    move/from16 v21, v1

    .line 372
    .line 373
    const/4 v1, 0x0

    .line 374
    invoke-static {v4, v1, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 375
    .line 376
    .line 377
    move-object v4, v5

    .line 378
    goto :goto_f

    .line 379
    :cond_18
    move/from16 v21, v1

    .line 380
    .line 381
    :goto_f
    aput-object v9, v4, v14

    .line 382
    .line 383
    move/from16 v14, v21

    .line 384
    .line 385
    :goto_10
    if-ne v9, v6, :cond_19

    .line 386
    .line 387
    const/4 v12, 0x0

    .line 388
    :cond_19
    const/4 v1, 0x0

    .line 389
    goto :goto_11

    .line 390
    :cond_1a
    move-object/from16 v20, v1

    .line 391
    .line 392
    const/4 v1, 0x1

    .line 393
    :goto_11
    if-eqz v1, :cond_20

    .line 394
    .line 395
    iget v1, v15, Lcx2;->p:I

    .line 396
    .line 397
    and-int/lit16 v1, v1, 0x400

    .line 398
    .line 399
    if-eqz v1, :cond_20

    .line 400
    .line 401
    instance-of v1, v15, Lfo0;

    .line 402
    .line 403
    if-eqz v1, :cond_20

    .line 404
    .line 405
    move-object v1, v15

    .line 406
    check-cast v1, Lfo0;

    .line 407
    .line 408
    iget-object v1, v1, Lfo0;->C:Lcx2;

    .line 409
    .line 410
    const/4 v2, 0x0

    .line 411
    :goto_12
    if-eqz v1, :cond_1f

    .line 412
    .line 413
    iget v5, v1, Lcx2;->p:I

    .line 414
    .line 415
    and-int/lit16 v5, v5, 0x400

    .line 416
    .line 417
    if-eqz v5, :cond_1e

    .line 418
    .line 419
    add-int/lit8 v2, v2, 0x1

    .line 420
    .line 421
    const/4 v5, 0x1

    .line 422
    if-ne v2, v5, :cond_1b

    .line 423
    .line 424
    move-object v15, v1

    .line 425
    move/from16 v17, v2

    .line 426
    .line 427
    const/16 v9, 0x10

    .line 428
    .line 429
    goto :goto_14

    .line 430
    :cond_1b
    if-nez v16, :cond_1c

    .line 431
    .line 432
    new-instance v5, Lf13;

    .line 433
    .line 434
    move/from16 v17, v2

    .line 435
    .line 436
    const/16 v9, 0x10

    .line 437
    .line 438
    new-array v2, v9, [Lcx2;

    .line 439
    .line 440
    invoke-direct {v5, v2}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    goto :goto_13

    .line 444
    :cond_1c
    move/from16 v17, v2

    .line 445
    .line 446
    const/16 v9, 0x10

    .line 447
    .line 448
    move-object/from16 v5, v16

    .line 449
    .line 450
    :goto_13
    if-eqz v15, :cond_1d

    .line 451
    .line 452
    invoke-virtual {v5, v15}, Lf13;->b(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    const/4 v15, 0x0

    .line 456
    :cond_1d
    invoke-virtual {v5, v1}, Lf13;->b(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    move-object/from16 v16, v5

    .line 460
    .line 461
    :goto_14
    move/from16 v2, v17

    .line 462
    .line 463
    goto :goto_15

    .line 464
    :cond_1e
    const/16 v9, 0x10

    .line 465
    .line 466
    :goto_15
    iget-object v1, v1, Lcx2;->s:Lcx2;

    .line 467
    .line 468
    goto :goto_12

    .line 469
    :cond_1f
    const/4 v5, 0x1

    .line 470
    const/16 v9, 0x10

    .line 471
    .line 472
    if-ne v2, v5, :cond_21

    .line 473
    .line 474
    move-object/from16 v1, v20

    .line 475
    .line 476
    const/4 v2, 0x0

    .line 477
    goto/16 :goto_c

    .line 478
    .line 479
    :cond_20
    const/16 v9, 0x10

    .line 480
    .line 481
    :cond_21
    invoke-static/range {v16 .. v16}, Lj51;->c(Lf13;)Lcx2;

    .line 482
    .line 483
    .line 484
    move-result-object v15

    .line 485
    move-object/from16 v1, v20

    .line 486
    .line 487
    const/4 v2, 0x0

    .line 488
    const/4 v5, 0x1

    .line 489
    goto/16 :goto_c

    .line 490
    .line 491
    :cond_22
    move-object/from16 v20, v1

    .line 492
    .line 493
    iget-object v8, v8, Lcx2;->r:Lcx2;

    .line 494
    .line 495
    move-object/from16 v1, v20

    .line 496
    .line 497
    const/4 v2, 0x0

    .line 498
    const/4 v5, 0x1

    .line 499
    goto/16 :goto_b

    .line 500
    .line 501
    :cond_23
    move-object/from16 v20, v1

    .line 502
    .line 503
    invoke-virtual {v10}, Lc72;->t()Lc72;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    if-eqz v10, :cond_24

    .line 508
    .line 509
    iget-object v1, v10, Lc72;->Q:Lw12;

    .line 510
    .line 511
    if-eqz v1, :cond_24

    .line 512
    .line 513
    iget-object v1, v1, Lw12;->f:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v1, Lsq4;

    .line 516
    .line 517
    move-object v8, v1

    .line 518
    goto :goto_16

    .line 519
    :cond_24
    const/4 v8, 0x0

    .line 520
    :goto_16
    move-object/from16 v1, v20

    .line 521
    .line 522
    const/4 v2, 0x0

    .line 523
    const/4 v5, 0x1

    .line 524
    goto/16 :goto_a

    .line 525
    .line 526
    :cond_25
    move-object/from16 v20, v1

    .line 527
    .line 528
    if-eqz v12, :cond_26

    .line 529
    .line 530
    if-eqz v6, :cond_26

    .line 531
    .line 532
    const/4 v1, 0x0

    .line 533
    invoke-static {v6, v1}, Luc5;->P(Lba1;Z)Z

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-nez v2, :cond_26

    .line 538
    .line 539
    :goto_17
    const/16 v19, 0x0

    .line 540
    .line 541
    goto/16 :goto_1d

    .line 542
    .line 543
    :cond_26
    new-instance v1, Lwc;

    .line 544
    .line 545
    const/4 v2, 0x4

    .line 546
    invoke-direct {v1, v2, v0}, Lwc;-><init>(ILjava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    invoke-static {v0, v1}, Lj51;->F(Lcx2;Lgf1;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0}, Lba1;->v0()Lz91;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-eqz v1, :cond_29

    .line 561
    .line 562
    const/4 v5, 0x1

    .line 563
    if-eq v1, v5, :cond_28

    .line 564
    .line 565
    const/4 v2, 0x2

    .line 566
    if-eq v1, v2, :cond_29

    .line 567
    .line 568
    const/4 v2, 0x3

    .line 569
    if-ne v1, v2, :cond_27

    .line 570
    .line 571
    goto :goto_18

    .line 572
    :cond_27
    invoke-static {}, Ler1;->n()V

    .line 573
    .line 574
    .line 575
    const/16 v19, 0x0

    .line 576
    .line 577
    return v19

    .line 578
    :cond_28
    :goto_18
    invoke-static {v0}, Lj51;->P(Leo0;)Lub3;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    check-cast v1, Lra;

    .line 583
    .line 584
    invoke-virtual {v1}, Lra;->getFocusOwner()Lu91;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    check-cast v1, Ley;

    .line 589
    .line 590
    invoke-virtual {v1, v0}, Ley;->h(Lba1;)V

    .line 591
    .line 592
    .line 593
    :cond_29
    sget-object v1, Lz91;->p:Lz91;

    .line 594
    .line 595
    sget-object v2, Lz91;->n:Lz91;

    .line 596
    .line 597
    if-eqz v12, :cond_2a

    .line 598
    .line 599
    if-eqz v6, :cond_2a

    .line 600
    .line 601
    invoke-virtual {v6, v2, v1}, Lba1;->r0(Lz91;Lz91;)V

    .line 602
    .line 603
    .line 604
    :cond_2a
    sget-object v3, Lz91;->o:Lz91;

    .line 605
    .line 606
    if-eqz v11, :cond_2c

    .line 607
    .line 608
    iget v5, v11, Lf13;->p:I

    .line 609
    .line 610
    const/16 v18, 0x1

    .line 611
    .line 612
    add-int/lit8 v5, v5, -0x1

    .line 613
    .line 614
    iget-object v8, v11, Lf13;->n:[Ljava/lang/Object;

    .line 615
    .line 616
    array-length v9, v8

    .line 617
    if-ge v5, v9, :cond_2c

    .line 618
    .line 619
    :goto_19
    if-ltz v5, :cond_2c

    .line 620
    .line 621
    aget-object v9, v8, v5

    .line 622
    .line 623
    check-cast v9, Lba1;

    .line 624
    .line 625
    invoke-virtual/range {v20 .. v20}, Ley;->f()Lba1;

    .line 626
    .line 627
    .line 628
    move-result-object v10

    .line 629
    if-eq v10, v0, :cond_2b

    .line 630
    .line 631
    goto :goto_17

    .line 632
    :cond_2b
    invoke-virtual {v9, v3, v1}, Lba1;->r0(Lz91;Lz91;)V

    .line 633
    .line 634
    .line 635
    add-int/lit8 v5, v5, -0x1

    .line 636
    .line 637
    goto :goto_19

    .line 638
    :cond_2c
    const/16 v18, 0x1

    .line 639
    .line 640
    add-int/lit8 v14, v14, -0x1

    .line 641
    .line 642
    array-length v5, v4

    .line 643
    if-ge v14, v5, :cond_2f

    .line 644
    .line 645
    :goto_1a
    if-ltz v14, :cond_2f

    .line 646
    .line 647
    aget-object v5, v4, v14

    .line 648
    .line 649
    check-cast v5, Lba1;

    .line 650
    .line 651
    invoke-virtual/range {v20 .. v20}, Ley;->f()Lba1;

    .line 652
    .line 653
    .line 654
    move-result-object v8

    .line 655
    if-eq v8, v0, :cond_2d

    .line 656
    .line 657
    :goto_1b
    goto :goto_17

    .line 658
    :cond_2d
    if-ne v5, v6, :cond_2e

    .line 659
    .line 660
    move-object v8, v2

    .line 661
    goto :goto_1c

    .line 662
    :cond_2e
    move-object v8, v1

    .line 663
    :goto_1c
    invoke-virtual {v5, v8, v3}, Lba1;->r0(Lz91;Lz91;)V

    .line 664
    .line 665
    .line 666
    add-int/lit8 v14, v14, -0x1

    .line 667
    .line 668
    goto :goto_1a

    .line 669
    :cond_2f
    invoke-virtual/range {v20 .. v20}, Ley;->f()Lba1;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    if-eq v1, v0, :cond_30

    .line 674
    .line 675
    goto/16 :goto_17

    .line 676
    .line 677
    :cond_30
    invoke-virtual {v0, v7, v2}, Lba1;->r0(Lz91;Lz91;)V

    .line 678
    .line 679
    .line 680
    invoke-virtual/range {v20 .. v20}, Ley;->f()Lba1;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    if-eq v1, v0, :cond_31

    .line 685
    .line 686
    goto :goto_1b

    .line 687
    :goto_1d
    return v19

    .line 688
    :cond_31
    const/16 v18, 0x1

    .line 689
    .line 690
    :goto_1e
    return v18
.end method

.method public final r0(Lz91;Lz91;)V
    .locals 9

    .line 1
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lra;

    .line 6
    .line 7
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ley;

    .line 12
    .line 13
    invoke-virtual {v0}, Ley;->f()Lba1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    iget-object v2, p0, Lba1;->B:Lwf1;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {v2, p1, p2}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lcx2;->n:Lcx2;

    .line 31
    .line 32
    iget-boolean p2, p1, Lcx2;->A:Z

    .line 33
    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    const-string p2, "visitAncestors called on an unattached node"

    .line 37
    .line 38
    invoke-static {p2}, Lcz1;->b(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object p2, p0, Lcx2;->n:Lcx2;

    .line 42
    .line 43
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_0
    if-eqz p0, :cond_e

    .line 48
    .line 49
    iget-object v2, p0, Lc72;->Q:Lw12;

    .line 50
    .line 51
    iget-object v2, v2, Lw12;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lcx2;

    .line 54
    .line 55
    iget v2, v2, Lcx2;->q:I

    .line 56
    .line 57
    and-int/lit16 v2, v2, 0x1400

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    if-eqz v2, :cond_c

    .line 61
    .line 62
    :goto_1
    if-eqz p2, :cond_c

    .line 63
    .line 64
    iget v2, p2, Lcx2;->p:I

    .line 65
    .line 66
    and-int/lit16 v4, v2, 0x1400

    .line 67
    .line 68
    if-eqz v4, :cond_b

    .line 69
    .line 70
    if-eq p2, p1, :cond_2

    .line 71
    .line 72
    and-int/lit16 v4, v2, 0x400

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_2
    and-int/lit16 v2, v2, 0x1000

    .line 79
    .line 80
    if-eqz v2, :cond_b

    .line 81
    .line 82
    move-object v2, p2

    .line 83
    move-object v4, v3

    .line 84
    :goto_2
    if-eqz v2, :cond_b

    .line 85
    .line 86
    instance-of v5, v2, Lxo;

    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    check-cast v2, Lxo;

    .line 91
    .line 92
    invoke-virtual {v0}, Ley;->f()Lba1;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eq v1, v5, :cond_3

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_3
    invoke-virtual {v2}, Lxo;->r0()V

    .line 100
    .line 101
    .line 102
    throw v3

    .line 103
    :cond_4
    iget v5, v2, Lcx2;->p:I

    .line 104
    .line 105
    and-int/lit16 v5, v5, 0x1000

    .line 106
    .line 107
    if-eqz v5, :cond_a

    .line 108
    .line 109
    instance-of v5, v2, Lfo0;

    .line 110
    .line 111
    if-eqz v5, :cond_a

    .line 112
    .line 113
    move-object v5, v2

    .line 114
    check-cast v5, Lfo0;

    .line 115
    .line 116
    iget-object v5, v5, Lfo0;->C:Lcx2;

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    :goto_3
    const/4 v7, 0x1

    .line 120
    if-eqz v5, :cond_9

    .line 121
    .line 122
    iget v8, v5, Lcx2;->p:I

    .line 123
    .line 124
    and-int/lit16 v8, v8, 0x1000

    .line 125
    .line 126
    if-eqz v8, :cond_8

    .line 127
    .line 128
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    if-ne v6, v7, :cond_5

    .line 131
    .line 132
    move-object v2, v5

    .line 133
    goto :goto_4

    .line 134
    :cond_5
    if-nez v4, :cond_6

    .line 135
    .line 136
    new-instance v4, Lf13;

    .line 137
    .line 138
    const/16 v7, 0x10

    .line 139
    .line 140
    new-array v7, v7, [Lcx2;

    .line 141
    .line 142
    invoke-direct {v4, v7}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_6
    if-eqz v2, :cond_7

    .line 146
    .line 147
    invoke-virtual {v4, v2}, Lf13;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    move-object v2, v3

    .line 151
    :cond_7
    invoke-virtual {v4, v5}, Lf13;->b(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_8
    :goto_4
    iget-object v5, v5, Lcx2;->s:Lcx2;

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_9
    if-ne v6, v7, :cond_a

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_a
    :goto_5
    invoke-static {v4}, Lj51;->c(Lf13;)Lcx2;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    goto :goto_2

    .line 165
    :cond_b
    iget-object p2, p2, Lcx2;->r:Lcx2;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_c
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-eqz p0, :cond_d

    .line 173
    .line 174
    iget-object p2, p0, Lc72;->Q:Lw12;

    .line 175
    .line 176
    if-eqz p2, :cond_d

    .line 177
    .line 178
    iget-object p2, p2, Lw12;->f:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p2, Lsq4;

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_d
    move-object p2, v3

    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_e
    :goto_6
    return-void
.end method

.method public final s0()Lx91;
    .locals 11

    .line 1
    new-instance v0, Lx91;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lx91;->a:Z

    .line 8
    .line 9
    sget-object v2, Ly91;->b:Ly91;

    .line 10
    .line 11
    iput-object v2, v0, Lx91;->b:Ly91;

    .line 12
    .line 13
    iput-object v2, v0, Lx91;->c:Ly91;

    .line 14
    .line 15
    iput-object v2, v0, Lx91;->d:Ly91;

    .line 16
    .line 17
    iput-object v2, v0, Lx91;->e:Ly91;

    .line 18
    .line 19
    iput-object v2, v0, Lx91;->f:Ly91;

    .line 20
    .line 21
    iput-object v2, v0, Lx91;->g:Ly91;

    .line 22
    .line 23
    iput-object v2, v0, Lx91;->h:Ly91;

    .line 24
    .line 25
    iput-object v2, v0, Lx91;->i:Ly91;

    .line 26
    .line 27
    new-instance v2, Lk2;

    .line 28
    .line 29
    const/16 v3, 0x12

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct {v2, v3, v4}, Lk2;-><init>(IB)V

    .line 33
    .line 34
    .line 35
    iput-object v2, v0, Lx91;->j:Lk2;

    .line 36
    .line 37
    new-instance v2, Lk2;

    .line 38
    .line 39
    invoke-direct {v2, v3, v4}, Lk2;-><init>(IB)V

    .line 40
    .line 41
    .line 42
    iput-object v2, v0, Lx91;->k:Lk2;

    .line 43
    .line 44
    sget-object v2, Lfz0;->a0:Lwv3;

    .line 45
    .line 46
    iput-object v2, v0, Lx91;->l:Lwv3;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    iget v3, p0, Lba1;->E:I

    .line 50
    .line 51
    if-ne v3, v1, :cond_0

    .line 52
    .line 53
    move v3, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    if-nez v3, :cond_2

    .line 56
    .line 57
    sget-object v3, Lg90;->m:Lwl4;

    .line 58
    .line 59
    invoke-static {p0, v3}, Lkb4;->q(La90;Lqr3;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Lrz1;

    .line 64
    .line 65
    check-cast v3, Lsz1;

    .line 66
    .line 67
    iget-object v3, v3, Lsz1;->a:Lzd3;

    .line 68
    .line 69
    invoke-virtual {v3}, Lzd3;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lqz1;

    .line 74
    .line 75
    iget v3, v3, Lqz1;->a:I

    .line 76
    .line 77
    if-ne v3, v1, :cond_1

    .line 78
    .line 79
    move v3, v1

    .line 80
    goto :goto_0

    .line 81
    :cond_1
    move v3, v4

    .line 82
    :goto_0
    xor-int/2addr v3, v1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    const/4 v5, 0x2

    .line 85
    if-ne v3, v5, :cond_10

    .line 86
    .line 87
    move v3, v4

    .line 88
    :goto_1
    iput-boolean v3, v0, Lx91;->a:Z

    .line 89
    .line 90
    iget-object v3, p0, Lcx2;->n:Lcx2;

    .line 91
    .line 92
    iget-boolean v5, v3, Lcx2;->A:Z

    .line 93
    .line 94
    if-nez v5, :cond_3

    .line 95
    .line 96
    const-string v5, "visitAncestors called on an unattached node"

    .line 97
    .line 98
    invoke-static {v5}, Lcz1;->b(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    iget-object v5, p0, Lcx2;->n:Lcx2;

    .line 102
    .line 103
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    if-eqz p0, :cond_f

    .line 108
    .line 109
    iget-object v6, p0, Lc72;->Q:Lw12;

    .line 110
    .line 111
    iget-object v6, v6, Lw12;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Lcx2;

    .line 114
    .line 115
    iget v6, v6, Lcx2;->q:I

    .line 116
    .line 117
    and-int/lit16 v6, v6, 0xc00

    .line 118
    .line 119
    if-eqz v6, :cond_d

    .line 120
    .line 121
    :goto_3
    if-eqz v5, :cond_d

    .line 122
    .line 123
    iget v6, v5, Lcx2;->p:I

    .line 124
    .line 125
    and-int/lit16 v7, v6, 0xc00

    .line 126
    .line 127
    if-eqz v7, :cond_c

    .line 128
    .line 129
    if-eq v5, v3, :cond_4

    .line 130
    .line 131
    and-int/lit16 v7, v6, 0x400

    .line 132
    .line 133
    if-eqz v7, :cond_4

    .line 134
    .line 135
    goto/16 :goto_7

    .line 136
    .line 137
    :cond_4
    and-int/lit16 v6, v6, 0x800

    .line 138
    .line 139
    if-eqz v6, :cond_c

    .line 140
    .line 141
    move-object v7, v2

    .line 142
    move-object v6, v5

    .line 143
    :goto_4
    if-eqz v6, :cond_c

    .line 144
    .line 145
    instance-of v8, v6, Lxo;

    .line 146
    .line 147
    if-nez v8, :cond_b

    .line 148
    .line 149
    iget v8, v6, Lcx2;->p:I

    .line 150
    .line 151
    and-int/lit16 v8, v8, 0x800

    .line 152
    .line 153
    if-eqz v8, :cond_a

    .line 154
    .line 155
    instance-of v8, v6, Lfo0;

    .line 156
    .line 157
    if-eqz v8, :cond_a

    .line 158
    .line 159
    move-object v8, v6

    .line 160
    check-cast v8, Lfo0;

    .line 161
    .line 162
    iget-object v8, v8, Lfo0;->C:Lcx2;

    .line 163
    .line 164
    move v9, v4

    .line 165
    :goto_5
    if-eqz v8, :cond_9

    .line 166
    .line 167
    iget v10, v8, Lcx2;->p:I

    .line 168
    .line 169
    and-int/lit16 v10, v10, 0x800

    .line 170
    .line 171
    if-eqz v10, :cond_8

    .line 172
    .line 173
    add-int/lit8 v9, v9, 0x1

    .line 174
    .line 175
    if-ne v9, v1, :cond_5

    .line 176
    .line 177
    move-object v6, v8

    .line 178
    goto :goto_6

    .line 179
    :cond_5
    if-nez v7, :cond_6

    .line 180
    .line 181
    new-instance v7, Lf13;

    .line 182
    .line 183
    const/16 v10, 0x10

    .line 184
    .line 185
    new-array v10, v10, [Lcx2;

    .line 186
    .line 187
    invoke-direct {v7, v10}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_6
    if-eqz v6, :cond_7

    .line 191
    .line 192
    invoke-virtual {v7, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object v6, v2

    .line 196
    :cond_7
    invoke-virtual {v7, v8}, Lf13;->b(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_8
    :goto_6
    iget-object v8, v8, Lcx2;->s:Lcx2;

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_9
    if-ne v9, v1, :cond_a

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_a
    invoke-static {v7}, Lj51;->c(Lf13;)Lcx2;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    goto :goto_4

    .line 210
    :cond_b
    check-cast v6, Lxo;

    .line 211
    .line 212
    iget-object p0, v6, Lxo;->B:Lbx2;

    .line 213
    .line 214
    const-string v0, "applyFocusProperties called on wrong node"

    .line 215
    .line 216
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-static {}, Lkf2;->k()V

    .line 223
    .line 224
    .line 225
    return-object v2

    .line 226
    :cond_c
    iget-object v5, v5, Lcx2;->r:Lcx2;

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_d
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    if-eqz p0, :cond_e

    .line 234
    .line 235
    iget-object v5, p0, Lc72;->Q:Lw12;

    .line 236
    .line 237
    if-eqz v5, :cond_e

    .line 238
    .line 239
    iget-object v5, v5, Lw12;->f:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v5, Lsq4;

    .line 242
    .line 243
    goto/16 :goto_2

    .line 244
    .line 245
    :cond_e
    move-object v5, v2

    .line 246
    goto/16 :goto_2

    .line 247
    .line 248
    :cond_f
    :goto_7
    return-object v0

    .line 249
    :cond_10
    const-string p0, "Unknown Focusability"

    .line 250
    .line 251
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-object v2
.end method

.method public final t0(Lq62;)Lwv3;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lba1;->s0()Lx91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lx91;->l:Lwv3;

    .line 6
    .line 7
    sget-object v1, Lfz0;->a0:Lwv3;

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-static {p0}, Lj51;->N(Leo0;)Lf63;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p1, p0, v2, v3}, Lq62;->A(Lq62;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    invoke-virtual {v0, p0, p1}, Lwv3;->f(J)Lwv3;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, Lj51;->N(Leo0;)Lf63;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-interface {p1, p0, v0}, Lq62;->C(Lq62;Z)Lwv3;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    invoke-static {p0}, Lj51;->N(Leo0;)Lf63;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-wide p0, p0, Ljg3;->p:J

    .line 46
    .line 47
    invoke-static {p0, p1}, Ll93;->o0(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    invoke-static {v2, v3, p0, p1}, Lbu;->d(JJ)Lwv3;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public final u0()Lz72;
    .locals 6

    .line 1
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcx2;->n:Lcx2;

    .line 13
    .line 14
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 15
    .line 16
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_d

    .line 22
    .line 23
    iget-object v2, p0, Lc72;->Q:Lw12;

    .line 24
    .line 25
    iget-object v2, v2, Lw12;->g:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lcx2;

    .line 28
    .line 29
    iget v2, v2, Lcx2;->q:I

    .line 30
    .line 31
    const v3, 0x800020

    .line 32
    .line 33
    .line 34
    and-int/2addr v2, v3

    .line 35
    if-eqz v2, :cond_b

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_b

    .line 38
    .line 39
    iget v2, v0, Lcx2;->p:I

    .line 40
    .line 41
    and-int v4, v2, v3

    .line 42
    .line 43
    if-eqz v4, :cond_a

    .line 44
    .line 45
    const/high16 v4, 0x800000

    .line 46
    .line 47
    and-int/2addr v4, v2

    .line 48
    if-eqz v4, :cond_5

    .line 49
    .line 50
    instance-of p0, v0, Lz72;

    .line 51
    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_1
    instance-of p0, v0, Lfo0;

    .line 56
    .line 57
    if-eqz p0, :cond_3

    .line 58
    .line 59
    check-cast v0, Lfo0;

    .line 60
    .line 61
    iget-object p0, v0, Lfo0;->C:Lcx2;

    .line 62
    .line 63
    move-object v0, v1

    .line 64
    :goto_2
    if-eqz p0, :cond_4

    .line 65
    .line 66
    instance-of v2, p0, Lz72;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    move-object v0, p0

    .line 71
    :cond_2
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move-object v0, v1

    .line 75
    :cond_4
    :goto_3
    check-cast v0, Lz72;

    .line 76
    .line 77
    if-eqz v0, :cond_d

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_5
    and-int/lit8 v2, v2, 0x20

    .line 81
    .line 82
    if-eqz v2, :cond_a

    .line 83
    .line 84
    instance-of v2, v0, Lfx2;

    .line 85
    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    move-object v4, v0

    .line 89
    goto :goto_5

    .line 90
    :cond_6
    instance-of v2, v0, Lfo0;

    .line 91
    .line 92
    if-eqz v2, :cond_8

    .line 93
    .line 94
    move-object v2, v0

    .line 95
    check-cast v2, Lfo0;

    .line 96
    .line 97
    iget-object v2, v2, Lfo0;->C:Lcx2;

    .line 98
    .line 99
    move-object v4, v1

    .line 100
    :goto_4
    if-eqz v2, :cond_9

    .line 101
    .line 102
    instance-of v5, v2, Lfx2;

    .line 103
    .line 104
    if-eqz v5, :cond_7

    .line 105
    .line 106
    move-object v4, v2

    .line 107
    :cond_7
    iget-object v2, v2, Lcx2;->s:Lcx2;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    move-object v4, v1

    .line 111
    :cond_9
    :goto_5
    check-cast v4, Lfx2;

    .line 112
    .line 113
    if-eqz v4, :cond_a

    .line 114
    .line 115
    invoke-interface {v4}, Lfx2;->E()Lfz0;

    .line 116
    .line 117
    .line 118
    :cond_a
    iget-object v0, v0, Lcx2;->r:Lcx2;

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_b
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-eqz p0, :cond_c

    .line 126
    .line 127
    iget-object v0, p0, Lc72;->Q:Lw12;

    .line 128
    .line 129
    if-eqz v0, :cond_c

    .line 130
    .line 131
    iget-object v0, v0, Lw12;->f:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Lsq4;

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_c
    move-object v0, v1

    .line 137
    goto :goto_0

    .line 138
    :cond_d
    return-object v1
.end method

.method public final v0()Lz91;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    sget-object v1, Lz91;->p:Lz91;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lra;

    .line 13
    .line 14
    invoke-virtual {v0}, Lra;->getFocusOwner()Lu91;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ley;

    .line 19
    .line 20
    invoke-virtual {v0}, Ley;->f()Lba1;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    if-ne p0, v0, :cond_2

    .line 28
    .line 29
    sget-object p0, Lz91;->n:Lz91;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    iget-boolean v2, v0, Lcx2;->A:Z

    .line 33
    .line 34
    if-eqz v2, :cond_e

    .line 35
    .line 36
    iget-object v2, v0, Lcx2;->n:Lcx2;

    .line 37
    .line 38
    iget-boolean v2, v2, Lcx2;->A:Z

    .line 39
    .line 40
    if-nez v2, :cond_3

    .line 41
    .line 42
    const-string v2, "visitAncestors called on an unattached node"

    .line 43
    .line 44
    invoke-static {v2}, Lcz1;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object v2, v0, Lcx2;->n:Lcx2;

    .line 48
    .line 49
    iget-object v2, v2, Lcx2;->r:Lcx2;

    .line 50
    .line 51
    invoke-static {v0}, Lj51;->O(Leo0;)Lc72;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    if-eqz v0, :cond_e

    .line 56
    .line 57
    iget-object v3, v0, Lc72;->Q:Lw12;

    .line 58
    .line 59
    iget-object v3, v3, Lw12;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lcx2;

    .line 62
    .line 63
    iget v3, v3, Lcx2;->q:I

    .line 64
    .line 65
    and-int/lit16 v3, v3, 0x400

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    if-eqz v3, :cond_c

    .line 69
    .line 70
    :goto_1
    if-eqz v2, :cond_c

    .line 71
    .line 72
    iget v3, v2, Lcx2;->p:I

    .line 73
    .line 74
    and-int/lit16 v3, v3, 0x400

    .line 75
    .line 76
    if-eqz v3, :cond_b

    .line 77
    .line 78
    move-object v3, v2

    .line 79
    move-object v5, v4

    .line 80
    :goto_2
    if-eqz v3, :cond_b

    .line 81
    .line 82
    instance-of v6, v3, Lba1;

    .line 83
    .line 84
    if-eqz v6, :cond_4

    .line 85
    .line 86
    check-cast v3, Lba1;

    .line 87
    .line 88
    if-ne p0, v3, :cond_a

    .line 89
    .line 90
    sget-object p0, Lz91;->o:Lz91;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_4
    iget v6, v3, Lcx2;->p:I

    .line 94
    .line 95
    and-int/lit16 v6, v6, 0x400

    .line 96
    .line 97
    if-eqz v6, :cond_a

    .line 98
    .line 99
    instance-of v6, v3, Lfo0;

    .line 100
    .line 101
    if-eqz v6, :cond_a

    .line 102
    .line 103
    move-object v6, v3

    .line 104
    check-cast v6, Lfo0;

    .line 105
    .line 106
    iget-object v6, v6, Lfo0;->C:Lcx2;

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    :goto_3
    const/4 v8, 0x1

    .line 110
    if-eqz v6, :cond_9

    .line 111
    .line 112
    iget v9, v6, Lcx2;->p:I

    .line 113
    .line 114
    and-int/lit16 v9, v9, 0x400

    .line 115
    .line 116
    if-eqz v9, :cond_8

    .line 117
    .line 118
    add-int/lit8 v7, v7, 0x1

    .line 119
    .line 120
    if-ne v7, v8, :cond_5

    .line 121
    .line 122
    move-object v3, v6

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    if-nez v5, :cond_6

    .line 125
    .line 126
    new-instance v5, Lf13;

    .line 127
    .line 128
    const/16 v8, 0x10

    .line 129
    .line 130
    new-array v8, v8, [Lcx2;

    .line 131
    .line 132
    invoke-direct {v5, v8}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    if-eqz v3, :cond_7

    .line 136
    .line 137
    invoke-virtual {v5, v3}, Lf13;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    move-object v3, v4

    .line 141
    :cond_7
    invoke-virtual {v5, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    :goto_4
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_9
    if-ne v7, v8, :cond_a

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    invoke-static {v5}, Lj51;->c(Lf13;)Lcx2;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    goto :goto_2

    .line 155
    :cond_b
    iget-object v2, v2, Lcx2;->r:Lcx2;

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_c
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-eqz v0, :cond_d

    .line 163
    .line 164
    iget-object v2, v0, Lc72;->Q:Lw12;

    .line 165
    .line 166
    if-eqz v2, :cond_d

    .line 167
    .line 168
    iget-object v2, v2, Lw12;->f:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Lsq4;

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_d
    move-object v2, v4

    .line 174
    goto :goto_0

    .line 175
    :cond_e
    return-object v1
.end method

.method public final w0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lba1;->v0()Lz91;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x3

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Ler1;->n()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance v0, Ljx3;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v2, Lfa;

    .line 31
    .line 32
    const/4 v3, 0x5

    .line 33
    invoke-direct {v2, v3, v0, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v2}, Lj51;->F(Lcx2;Lgf1;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, v0, Ljx3;->n:Ljava/lang/Object;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    check-cast v0, Lx91;

    .line 44
    .line 45
    iget-boolean v0, v0, Lx91;->a:Z

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lra;

    .line 54
    .line 55
    invoke-virtual {p0}, Lra;->getFocusOwner()Lu91;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ley;

    .line 60
    .line 61
    const/16 v0, 0x8

    .line 62
    .line 63
    invoke-virtual {p0, v0, v1, v1}, Ley;->b(IZZ)Z

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_0
    return-void

    .line 67
    :cond_3
    const-string p0, "focusProperties"

    .line 68
    .line 69
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0
.end method

.method public final x0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final y0(I)Z
    .locals 1

    .line 1
    const-string v0, "FocusTransactions:requestFocus"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, Lba1;->s0()Lx91;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-boolean v0, v0, Lx91;->a:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lba1;->q0()Z

    .line 15
    .line 16
    .line 17
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 19
    .line 20
    .line 21
    return p0

    .line 22
    :cond_0
    :try_start_1
    new-instance v0, Lk2;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Lk2;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, p1, v0}, Lkb4;->v(Lba1;ILif1;)Z

    .line 28
    .line 29
    .line 30
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 32
    .line 33
    .line 34
    return p0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 37
    .line 38
    .line 39
    throw p0
.end method
