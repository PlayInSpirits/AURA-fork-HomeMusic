.class public final Lhy2;
.super Lir2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final f:Lzh0;

.field public final g:Law;

.field public h:Lsk4;


# direct methods
.method public constructor <init>(Lg74;Lzh0;Lq70;Loo0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3, p4}, Lir2;-><init>(Lg74;Lwf1;Loo0;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lhy2;->f:Lzh0;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 p2, 0x6

    .line 8
    const p3, 0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-static {p3, p2, p1}, Lsu3;->a(IILwv;)Law;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lhy2;->g:Law;

    .line 16
    .line 17
    return-void
.end method

.method public static final E(Lhy2;Lg74;Lcy2;FFLwd0;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    iget-object v2, v5, Lir2;->e:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v9, v2

    .line 12
    check-cast v9, Lrf2;

    .line 13
    .line 14
    instance-of v2, v1, Ldy2;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, Ldy2;

    .line 20
    .line 21
    iget v3, v2, Ldy2;->s:I

    .line 22
    .line 23
    const/high16 v4, -0x80000000

    .line 24
    .line 25
    and-int v6, v3, v4

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    sub-int/2addr v3, v4

    .line 30
    iput v3, v2, Ldy2;->s:I

    .line 31
    .line 32
    :goto_0
    move-object v10, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v2, Ldy2;

    .line 35
    .line 36
    invoke-direct {v2, v5, v1}, Ldy2;-><init>(Lhy2;Lwd0;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    iget-object v1, v10, Ldy2;->q:Ljava/lang/Object;

    .line 41
    .line 42
    iget v2, v10, Ldy2;->s:I

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    sget-object v13, Lj15;->a:Lj15;

    .line 47
    .line 48
    const/4 v14, 0x2

    .line 49
    const/4 v15, 0x1

    .line 50
    sget-object v3, Lxe0;->n:Lxe0;

    .line 51
    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    if-eq v2, v15, :cond_2

    .line 55
    .line 56
    if-ne v2, v14, :cond_1

    .line 57
    .line 58
    invoke-static {v1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-object v13

    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v12

    .line 68
    :cond_2
    iget v0, v10, Ldy2;->p:F

    .line 69
    .line 70
    iget-object v2, v10, Ldy2;->o:Lgx3;

    .line 71
    .line 72
    iget-object v4, v10, Ldy2;->n:Lg74;

    .line 73
    .line 74
    invoke-static {v1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    move-object v12, v3

    .line 78
    move-object/from16 v16, v13

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    invoke-static {v1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object v1, v3

    .line 86
    new-instance v3, Ljx3;

    .line 87
    .line 88
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v0, v3, Ljx3;->n:Ljava/lang/Object;

    .line 92
    .line 93
    move-object/from16 v16, v13

    .line 94
    .line 95
    iget-wide v12, v0, Lcy2;->b:J

    .line 96
    .line 97
    iget-wide v14, v0, Lcy2;->a:J

    .line 98
    .line 99
    iget-object v0, v9, Lrf2;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Lm45;

    .line 102
    .line 103
    move-object v4, v3

    .line 104
    const/16 p2, 0x20

    .line 105
    .line 106
    shr-long v2, v14, p2

    .line 107
    .line 108
    long-to-int v2, v2

    .line 109
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {v0, v12, v13, v2}, Lm45;->a(JF)V

    .line 114
    .line 115
    .line 116
    iget-object v0, v9, Lrf2;->o:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Lm45;

    .line 119
    .line 120
    const-wide v2, 0xffffffffL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    and-long/2addr v14, v2

    .line 126
    long-to-int v6, v14

    .line 127
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v0, v12, v13, v6}, Lm45;->a(JF)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v5, Lhy2;->g:Law;

    .line 135
    .line 136
    invoke-static {v0}, Lhy2;->I(Law;)Lcy2;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    iget-wide v12, v0, Lcy2;->b:J

    .line 143
    .line 144
    iget-wide v14, v0, Lcy2;->a:J

    .line 145
    .line 146
    iget-object v6, v9, Lrf2;->n:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v6, Lm45;

    .line 149
    .line 150
    move-wide/from16 v17, v2

    .line 151
    .line 152
    shr-long v2, v14, p2

    .line 153
    .line 154
    long-to-int v2, v2

    .line 155
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    invoke-virtual {v6, v12, v13, v2}, Lm45;->a(JF)V

    .line 160
    .line 161
    .line 162
    iget-object v2, v9, Lrf2;->o:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v2, Lm45;

    .line 165
    .line 166
    and-long v14, v14, v17

    .line 167
    .line 168
    long-to-int v3, v14

    .line 169
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v2, v12, v13, v3}, Lm45;->a(JF)V

    .line 174
    .line 175
    .line 176
    move-object v3, v4

    .line 177
    iget-object v2, v3, Ljx3;->n:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Lcy2;

    .line 180
    .line 181
    invoke-virtual {v2, v0}, Lcy2;->a(Lcy2;)Lcy2;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iput-object v0, v3, Ljx3;->n:Ljava/lang/Object;

    .line 186
    .line 187
    :goto_2
    move-object v0, v1

    .line 188
    goto :goto_3

    .line 189
    :cond_4
    move-object v3, v4

    .line 190
    goto :goto_2

    .line 191
    :goto_3
    new-instance v1, Lgx3;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 194
    .line 195
    .line 196
    iget-object v2, v3, Ljx3;->n:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v2, Lcy2;

    .line 199
    .line 200
    iget-wide v12, v2, Lcy2;->a:J

    .line 201
    .line 202
    invoke-virtual {v7, v12, v13}, Lg74;->f(J)J

    .line 203
    .line 204
    .line 205
    move-result-wide v12

    .line 206
    invoke-virtual {v7, v12, v13}, Lg74;->h(J)F

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    iput v2, v1, Lgx3;->n:F

    .line 211
    .line 212
    invoke-static {v2}, Lh12;->b(F)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_5

    .line 217
    .line 218
    goto/16 :goto_8

    .line 219
    .line 220
    :cond_5
    new-instance v2, Ljx3;

    .line 221
    .line 222
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    const/16 v4, 0x1e

    .line 226
    .line 227
    invoke-static {v11, v11, v4}, Lj51;->a(FFI)Lxd;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    iput-object v4, v2, Ljx3;->n:Ljava/lang/Object;

    .line 232
    .line 233
    move-object v4, v0

    .line 234
    new-instance v0, Lfy2;

    .line 235
    .line 236
    const/4 v8, 0x0

    .line 237
    move/from16 v6, p4

    .line 238
    .line 239
    move-object v12, v4

    .line 240
    move/from16 v4, p3

    .line 241
    .line 242
    invoke-direct/range {v0 .. v8}, Lfy2;-><init>(Lgx3;Ljx3;Ljx3;FLhy2;FLg74;Lvd0;)V

    .line 243
    .line 244
    .line 245
    iput-object v7, v10, Ldy2;->n:Lg74;

    .line 246
    .line 247
    iput-object v1, v10, Ldy2;->o:Lgx3;

    .line 248
    .line 249
    iput v6, v10, Ldy2;->p:F

    .line 250
    .line 251
    const/4 v2, 0x1

    .line 252
    iput v2, v10, Ldy2;->s:I

    .line 253
    .line 254
    invoke-virtual {v5, v0, v10}, Lir2;->D(Lwf1;Lwd0;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    if-ne v0, v12, :cond_6

    .line 259
    .line 260
    goto/16 :goto_7

    .line 261
    .line 262
    :cond_6
    move-object v2, v1

    .line 263
    move v0, v6

    .line 264
    move-object v4, v7

    .line 265
    :goto_4
    iget-object v1, v9, Lrf2;->n:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v1, Lm45;

    .line 268
    .line 269
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v3}, Lm45;->b(F)F

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    iget-object v6, v9, Lrf2;->o:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v6, Lm45;

    .line 279
    .line 280
    invoke-virtual {v6, v3}, Lm45;->b(F)F

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    invoke-static {v1, v3}, Le35;->h(FF)J

    .line 285
    .line 286
    .line 287
    move-result-wide v6

    .line 288
    const-wide/16 v8, 0x0

    .line 289
    .line 290
    cmp-long v1, v6, v8

    .line 291
    .line 292
    if-nez v1, :cond_9

    .line 293
    .line 294
    iget v1, v2, Lgx3;->n:F

    .line 295
    .line 296
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    const/high16 v3, 0x42c80000    # 100.0f

    .line 301
    .line 302
    div-float/2addr v1, v3

    .line 303
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    iget v1, v2, Lgx3;->n:F

    .line 308
    .line 309
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-virtual {v4, v1}, Lg74;->e(F)F

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    mul-float/2addr v1, v0

    .line 318
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 319
    .line 320
    mul-float/2addr v1, v0

    .line 321
    cmpg-float v0, v1, v11

    .line 322
    .line 323
    if-nez v0, :cond_7

    .line 324
    .line 325
    move-wide v6, v8

    .line 326
    goto :goto_6

    .line 327
    :cond_7
    iget-object v0, v4, Lg74;->d:Lhb3;

    .line 328
    .line 329
    sget-object v2, Lhb3;->o:Lhb3;

    .line 330
    .line 331
    if-ne v0, v2, :cond_8

    .line 332
    .line 333
    invoke-static {v1, v11}, Le35;->h(FF)J

    .line 334
    .line 335
    .line 336
    move-result-wide v0

    .line 337
    :goto_5
    move-wide v6, v0

    .line 338
    goto :goto_6

    .line 339
    :cond_8
    invoke-static {v11, v1}, Le35;->h(FF)J

    .line 340
    .line 341
    .line 342
    move-result-wide v0

    .line 343
    goto :goto_5

    .line 344
    :cond_9
    :goto_6
    iget-object v0, v5, Lir2;->c:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Lwf1;

    .line 347
    .line 348
    new-instance v1, Lk45;

    .line 349
    .line 350
    invoke-direct {v1, v6, v7}, Lk45;-><init>(J)V

    .line 351
    .line 352
    .line 353
    const/4 v2, 0x0

    .line 354
    iput-object v2, v10, Ldy2;->n:Lg74;

    .line 355
    .line 356
    iput-object v2, v10, Ldy2;->o:Lgx3;

    .line 357
    .line 358
    const/4 v2, 0x2

    .line 359
    iput v2, v10, Ldy2;->s:I

    .line 360
    .line 361
    invoke-interface {v0, v1, v10}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-ne v0, v12, :cond_a

    .line 366
    .line 367
    :goto_7
    return-object v12

    .line 368
    :cond_a
    :goto_8
    return-object v16
.end method

.method public static final F(Lhy2;Ljx3;Lgx3;Lg74;Ljx3;JLwd0;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    instance-of v3, v2, Lgy2;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lgy2;

    .line 11
    .line 12
    iget v4, v3, Lgy2;->t:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Lgy2;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lgy2;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Lwd0;-><init>(Lvd0;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Lgy2;->s:Ljava/lang/Object;

    .line 30
    .line 31
    iget v4, v3, Lgy2;->t:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-ne v4, v6, :cond_1

    .line 38
    .line 39
    iget-object p0, v3, Lgy2;->r:Ljx3;

    .line 40
    .line 41
    iget-object p1, v3, Lgy2;->q:Lg74;

    .line 42
    .line 43
    iget-object v0, v3, Lgy2;->p:Lgx3;

    .line 44
    .line 45
    iget-object v1, v3, Lgy2;->o:Ljx3;

    .line 46
    .line 47
    iget-object v3, v3, Lgy2;->n:Lhy2;

    .line 48
    .line 49
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v7, p0

    .line 53
    move-object v5, p1

    .line 54
    move-object p1, v1

    .line 55
    move-object p0, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_2
    invoke-static {v2}, Lkb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    cmp-long v2, v0, v7

    .line 69
    .line 70
    if-gez v2, :cond_3

    .line 71
    .line 72
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    new-instance v2, Lac0;

    .line 76
    .line 77
    const/4 v4, 0x4

    .line 78
    invoke-direct {v2, p0, v5, v4}, Lac0;-><init>(Ljava/lang/Object;Lvd0;I)V

    .line 79
    .line 80
    .line 81
    iput-object p0, v3, Lgy2;->n:Lhy2;

    .line 82
    .line 83
    iput-object p1, v3, Lgy2;->o:Ljx3;

    .line 84
    .line 85
    iput-object p2, v3, Lgy2;->p:Lgx3;

    .line 86
    .line 87
    iput-object p3, v3, Lgy2;->q:Lg74;

    .line 88
    .line 89
    iput-object p4, v3, Lgy2;->r:Ljx3;

    .line 90
    .line 91
    iput v6, v3, Lgy2;->t:I

    .line 92
    .line 93
    invoke-static {v0, v1, v2, v3}, Lgb;->j0(JLwf1;Lwd0;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v0, Lxe0;->n:Lxe0;

    .line 98
    .line 99
    if-ne v2, v0, :cond_4

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_4
    move-object v0, p2

    .line 103
    move-object v5, p3

    .line 104
    move-object v7, p4

    .line 105
    :goto_1
    check-cast v2, Lcy2;

    .line 106
    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    iget-object v1, p1, Ljx3;->n:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lcy2;

    .line 112
    .line 113
    iget-boolean v1, v1, Lcy2;->c:Z

    .line 114
    .line 115
    iget-wide v3, v2, Lcy2;->a:J

    .line 116
    .line 117
    iget-wide v8, v2, Lcy2;->b:J

    .line 118
    .line 119
    new-instance v10, Lcy2;

    .line 120
    .line 121
    move/from16 p7, v1

    .line 122
    .line 123
    move-wide p3, v3

    .line 124
    move-wide/from16 p5, v8

    .line 125
    .line 126
    move-object p2, v10

    .line 127
    invoke-direct/range {p2 .. p7}, Lcy2;-><init>(JJZ)V

    .line 128
    .line 129
    .line 130
    move-object v1, p2

    .line 131
    iput-object v1, p1, Ljx3;->n:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v5, v3, v4}, Lg74;->f(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    invoke-virtual {v5, v3, v4}, Lg74;->j(J)F

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    iput p1, v0, Lgx3;->n:F

    .line 142
    .line 143
    const/16 p1, 0x1e

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    invoke-static {v1, v1, p1}, Lj51;->a(FFI)Lxd;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, v7, Ljx3;->n:Ljava/lang/Object;

    .line 151
    .line 152
    iget-object p0, p0, Lir2;->e:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Lrf2;

    .line 155
    .line 156
    iget-wide v3, v2, Lcy2;->b:J

    .line 157
    .line 158
    iget-wide v1, v2, Lcy2;->a:J

    .line 159
    .line 160
    iget-object p1, p0, Lrf2;->n:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Lm45;

    .line 163
    .line 164
    const/16 v5, 0x20

    .line 165
    .line 166
    shr-long v7, v1, v5

    .line 167
    .line 168
    long-to-int v5, v7

    .line 169
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-virtual {p1, v3, v4, v5}, Lm45;->a(JF)V

    .line 174
    .line 175
    .line 176
    iget-object p0, p0, Lrf2;->o:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, Lm45;

    .line 179
    .line 180
    const-wide v7, 0xffffffffL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    and-long/2addr v1, v7

    .line 186
    long-to-int p1, v1

    .line 187
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    invoke-virtual {p0, v3, v4, p1}, Lm45;->a(JF)V

    .line 192
    .line 193
    .line 194
    iget p0, v0, Lgx3;->n:F

    .line 195
    .line 196
    invoke-static {p0}, Lh12;->b(F)Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    xor-int/2addr p0, v6

    .line 201
    goto :goto_2

    .line 202
    :cond_5
    const/4 p0, 0x0

    .line 203
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0
.end method

.method public static I(Law;)Lcy2;
    .locals 2

    .line 1
    new-instance v0, Lby2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lby2;-><init>(Ly00;I)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lkb1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v0, v1}, Lkb1;-><init>(Lgf1;Lvd0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lsi0;->C(Lwf1;)Lba4;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lba4;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lba4;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcy2;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_1
    move-object v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v0}, Lcy2;->a(Lcy2;)Lcy2;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v1
.end method


# virtual methods
.method public final G(Le74;F)F
    .locals 3

    .line 1
    iget-object p0, p0, Lir2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lg74;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Lg74;->e(F)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p2}, Lg74;->i(F)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object p1, p1, Le74;->a:Lg74;

    .line 14
    .line 15
    iget-object p2, p1, Lg74;->k:Lq64;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, p2, v0, v1, v2}, Lg74;->d(Lq64;JI)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-virtual {p0, p1, p2}, Lg74;->f(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-virtual {p0, p1, p2}, Lg74;->h(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public final H(Lkn3;)Z
    .locals 11

    .line 1
    iget-object v0, p0, Lir2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Loo0;

    .line 4
    .line 5
    iget-object v1, p0, Lhy2;->f:Lzh0;

    .line 6
    .line 7
    iget-object v1, v1, Lzh0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/view/ViewConfiguration;

    .line 10
    .line 11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/high16 v3, 0x42800000    # 64.0f

    .line 14
    .line 15
    const/16 v4, 0x1a

    .line 16
    .line 17
    if-le v2, v4, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Lr50;->h(Landroid/view/ViewConfiguration;)F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0, v3}, Loo0;->M(F)F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    :goto_0
    neg-float v5, v5

    .line 29
    if-le v2, v4, :cond_1

    .line 30
    .line 31
    invoke-static {v1}, Lr50;->e(Landroid/view/ViewConfiguration;)F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-interface {v0, v3}, Loo0;->M(F)F

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_1
    neg-float v0, v0

    .line 41
    iget-object v1, p1, Lkn3;->a:Ljava/util/List;

    .line 42
    .line 43
    new-instance v2, Lg83;

    .line 44
    .line 45
    const-wide/16 v3, 0x0

    .line 46
    .line 47
    invoke-direct {v2, v3, v4}, Lg83;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x0

    .line 55
    move v6, v4

    .line 56
    :goto_2
    iget-wide v7, v2, Lg83;->a:J

    .line 57
    .line 58
    if-ge v6, v3, :cond_2

    .line 59
    .line 60
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lon3;

    .line 65
    .line 66
    iget-wide v9, v2, Lon3;->j:J

    .line 67
    .line 68
    invoke-static {v7, v8, v9, v10}, Lg83;->e(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v7

    .line 72
    new-instance v2, Lg83;

    .line 73
    .line 74
    invoke-direct {v2, v7, v8}, Lg83;-><init>(J)V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    const/16 v1, 0x20

    .line 81
    .line 82
    shr-long v2, v7, v1

    .line 83
    .line 84
    long-to-int v2, v2

    .line 85
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    mul-float/2addr v2, v0

    .line 90
    const-wide v9, 0xffffffffL

    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    and-long v6, v7, v9

    .line 96
    .line 97
    long-to-int v0, v6

    .line 98
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    mul-float/2addr v0, v5

    .line 103
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    int-to-long v2, v2

    .line 108
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    int-to-long v5, v0

    .line 113
    shl-long v0, v2, v1

    .line 114
    .line 115
    and-long v2, v5, v9

    .line 116
    .line 117
    or-long v6, v0, v2

    .line 118
    .line 119
    iget-object v0, p0, Lir2;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Lg74;

    .line 122
    .line 123
    invoke-virtual {v0, v6, v7}, Lg74;->f(J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v1

    .line 127
    invoke-virtual {v0, v1, v2}, Lg74;->j(J)F

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    const/4 v2, 0x0

    .line 132
    cmpg-float v3, v1, v2

    .line 133
    .line 134
    if-nez v3, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    cmpl-float v1, v1, v2

    .line 138
    .line 139
    iget-object v0, v0, Lg74;->a:La74;

    .line 140
    .line 141
    if-lez v1, :cond_4

    .line 142
    .line 143
    invoke-interface {v0}, La74;->c()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    goto :goto_3

    .line 148
    :cond_4
    invoke-interface {v0}, La74;->b()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    :goto_3
    if-eqz v4, :cond_5

    .line 153
    .line 154
    new-instance v5, Lcy2;

    .line 155
    .line 156
    iget-object p1, p1, Lkn3;->a:Ljava/util/List;

    .line 157
    .line 158
    invoke-static {p1}, Lq40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    check-cast p1, Lon3;

    .line 163
    .line 164
    iget-wide v8, p1, Lon3;->b:J

    .line 165
    .line 166
    const/4 v10, 0x0

    .line 167
    invoke-direct/range {v5 .. v10}, Lcy2;-><init>(JJZ)V

    .line 168
    .line 169
    .line 170
    iget-object p0, p0, Lhy2;->g:Law;

    .line 171
    .line 172
    invoke-interface {p0, v5}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    instance-of p0, p0, Li10;

    .line 177
    .line 178
    xor-int/lit8 p0, p0, 0x1

    .line 179
    .line 180
    return p0

    .line 181
    :cond_5
    iget-boolean p0, p0, Lir2;->a:Z

    .line 182
    .line 183
    return p0
.end method
