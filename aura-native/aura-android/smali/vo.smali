.class public final Lvo;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrv0;
.implements Lb83;
.implements Lg94;


# instance fields
.field public B:J

.field public C:Lsp1;

.field public D:J

.field public E:Lr62;

.field public F:Lya4;

.field public G:Lsp1;

.field public H:Lya4;


# virtual methods
.method public final Q()V
    .locals 2

    .line 1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lvo;->D:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lvo;->E:Lr62;

    .line 10
    .line 11
    iput-object v0, p0, Lvo;->F:Lya4;

    .line 12
    .line 13
    iput-object v0, p0, Lvo;->G:Lsp1;

    .line 14
    .line 15
    invoke-static {p0}, Ljz4;->z(Lrv0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final S(Le72;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, Le72;->n:Lmz;

    .line 6
    .line 7
    sget-object v7, Lc71;->d:Lc71;

    .line 8
    .line 9
    iget-object v3, v0, Lvo;->C:Lsp1;

    .line 10
    .line 11
    sget-object v4, Lkb4;->b:Lsp1;

    .line 12
    .line 13
    if-ne v3, v4, :cond_1

    .line 14
    .line 15
    iget-wide v2, v0, Lvo;->B:J

    .line 16
    .line 17
    sget-wide v4, Lx40;->g:J

    .line 18
    .line 19
    invoke-static {v2, v3, v4, v5}, Lx40;->c(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-wide v1, v0, Lvo;->B:J

    .line 26
    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    const/16 v5, 0x7e

    .line 30
    .line 31
    move-object/from16 v0, p1

    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lsv0;->l(Lsv0;JJI)V

    .line 34
    .line 35
    .line 36
    move-object v1, v0

    .line 37
    :cond_0
    move-object v0, v1

    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_1
    invoke-interface {v2}, Lsv0;->P()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    iget-wide v5, v0, Lvo;->D:J

    .line 45
    .line 46
    invoke-static {v3, v4, v5, v6}, Lqf4;->a(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Le72;->getLayoutDirection()Lr62;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, v0, Lvo;->E:Lr62;

    .line 57
    .line 58
    if-ne v3, v4, :cond_2

    .line 59
    .line 60
    iget-object v3, v0, Lvo;->G:Lsp1;

    .line 61
    .line 62
    iget-object v4, v0, Lvo;->C:Lsp1;

    .line 63
    .line 64
    invoke-static {v3, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    iget-object v3, v0, Lvo;->F:Lya4;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    new-instance v3, Lfa;

    .line 77
    .line 78
    const/4 v4, 0x2

    .line 79
    invoke-direct {v3, v4, v0, v1}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v3}, Lj51;->F(Lcx2;Lgf1;)V

    .line 83
    .line 84
    .line 85
    iget-object v3, v0, Lvo;->H:Lya4;

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    iput-object v4, v0, Lvo;->H:Lya4;

    .line 89
    .line 90
    :goto_0
    iput-object v3, v0, Lvo;->F:Lya4;

    .line 91
    .line 92
    invoke-interface {v2}, Lsv0;->P()J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    iput-wide v4, v0, Lvo;->D:J

    .line 97
    .line 98
    invoke-virtual {v1}, Le72;->getLayoutDirection()Lr62;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object v4, v0, Lvo;->E:Lr62;

    .line 103
    .line 104
    iget-object v4, v0, Lvo;->C:Lsp1;

    .line 105
    .line 106
    iput-object v4, v0, Lvo;->G:Lsp1;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    iget-wide v4, v0, Lvo;->B:J

    .line 112
    .line 113
    sget-wide v8, Lx40;->g:J

    .line 114
    .line 115
    invoke-static {v4, v5, v8, v9}, Lx40;->c(JJ)Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-nez v4, :cond_0

    .line 120
    .line 121
    iget-wide v4, v0, Lvo;->B:J

    .line 122
    .line 123
    instance-of v0, v3, Lnb3;

    .line 124
    .line 125
    const/16 v6, 0x20

    .line 126
    .line 127
    const-wide v8, 0xffffffffL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    if-eqz v0, :cond_3

    .line 133
    .line 134
    check-cast v3, Lnb3;

    .line 135
    .line 136
    iget-object v0, v3, Lnb3;->f:Lwv3;

    .line 137
    .line 138
    iget v2, v0, Lwv3;->a:F

    .line 139
    .line 140
    iget v3, v0, Lwv3;->b:F

    .line 141
    .line 142
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    int-to-long v10, v2

    .line 147
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    int-to-long v2, v2

    .line 152
    shl-long/2addr v10, v6

    .line 153
    and-long/2addr v2, v8

    .line 154
    or-long/2addr v2, v10

    .line 155
    invoke-static {v0}, Ljz4;->L(Lwv3;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v8

    .line 159
    move-wide/from16 v26, v4

    .line 160
    .line 161
    move-wide v3, v2

    .line 162
    move-wide/from16 v1, v26

    .line 163
    .line 164
    move-wide v5, v8

    .line 165
    const/4 v8, 0x3

    .line 166
    move-object/from16 v0, p1

    .line 167
    .line 168
    invoke-virtual/range {v0 .. v8}, Le72;->H(JJJLq05;I)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_2

    .line 172
    .line 173
    :cond_3
    move-object v0, v1

    .line 174
    instance-of v1, v3, Lob3;

    .line 175
    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    check-cast v3, Lob3;

    .line 179
    .line 180
    iget-object v1, v3, Lob3;->g:Lnc;

    .line 181
    .line 182
    if-eqz v1, :cond_4

    .line 183
    .line 184
    :goto_1
    invoke-virtual {v0, v1, v4, v5, v7}, Le72;->c(Lnc;JLq05;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_2

    .line 188
    .line 189
    :cond_4
    iget-object v1, v3, Lob3;->f:Lg34;

    .line 190
    .line 191
    iget v3, v1, Lg34;->b:F

    .line 192
    .line 193
    iget v10, v1, Lg34;->a:F

    .line 194
    .line 195
    iget-wide v11, v1, Lg34;->h:J

    .line 196
    .line 197
    shr-long/2addr v11, v6

    .line 198
    long-to-int v11, v11

    .line 199
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 200
    .line 201
    .line 202
    move-result v11

    .line 203
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    int-to-long v12, v12

    .line 208
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    int-to-long v14, v14

    .line 213
    shl-long/2addr v12, v6

    .line 214
    and-long/2addr v14, v8

    .line 215
    or-long/2addr v12, v14

    .line 216
    iget v14, v1, Lg34;->c:F

    .line 217
    .line 218
    sub-float/2addr v14, v10

    .line 219
    iget v1, v1, Lg34;->d:F

    .line 220
    .line 221
    sub-float/2addr v1, v3

    .line 222
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    int-to-long v14, v3

    .line 227
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    move-wide/from16 v16, v8

    .line 232
    .line 233
    int-to-long v8, v1

    .line 234
    shl-long/2addr v14, v6

    .line 235
    and-long v8, v8, v16

    .line 236
    .line 237
    or-long/2addr v8, v14

    .line 238
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    int-to-long v14, v1

    .line 243
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    int-to-long v10, v1

    .line 248
    shl-long/2addr v14, v6

    .line 249
    and-long v10, v10, v16

    .line 250
    .line 251
    or-long/2addr v10, v14

    .line 252
    iget-object v1, v2, Lmz;->n:Llz;

    .line 253
    .line 254
    iget-object v1, v1, Llz;->c:Ljz;

    .line 255
    .line 256
    shr-long v14, v12, v6

    .line 257
    .line 258
    long-to-int v3, v14

    .line 259
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 260
    .line 261
    .line 262
    move-result v19

    .line 263
    and-long v12, v12, v16

    .line 264
    .line 265
    long-to-int v12, v12

    .line 266
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 267
    .line 268
    .line 269
    move-result v20

    .line 270
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    shr-long v13, v8, v6

    .line 275
    .line 276
    long-to-int v13, v13

    .line 277
    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    add-float v21, v13, v3

    .line 282
    .line 283
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    and-long v8, v8, v16

    .line 288
    .line 289
    long-to-int v8, v8

    .line 290
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    add-float v22, v8, v3

    .line 295
    .line 296
    shr-long v8, v10, v6

    .line 297
    .line 298
    long-to-int v3, v8

    .line 299
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 300
    .line 301
    .line 302
    move-result v23

    .line 303
    and-long v8, v10, v16

    .line 304
    .line 305
    long-to-int v3, v8

    .line 306
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 307
    .line 308
    .line 309
    move-result v24

    .line 310
    const/4 v3, 0x3

    .line 311
    invoke-static {v2, v4, v5, v7, v3}, Lmz;->a(Lmz;JLq05;I)Lgc;

    .line 312
    .line 313
    .line 314
    move-result-object v25

    .line 315
    move-object/from16 v18, v1

    .line 316
    .line 317
    invoke-interface/range {v18 .. v25}, Ljz;->d(FFFFFFLgc;)V

    .line 318
    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_5
    instance-of v1, v3, Lmb3;

    .line 322
    .line 323
    if-eqz v1, :cond_6

    .line 324
    .line 325
    check-cast v3, Lmb3;

    .line 326
    .line 327
    iget-object v1, v3, Lmb3;->f:Lnc;

    .line 328
    .line 329
    goto/16 :goto_1

    .line 330
    .line 331
    :cond_6
    invoke-static {}, Ler1;->n()V

    .line 332
    .line 333
    .line 334
    return-void

    .line 335
    :goto_2
    invoke-virtual {v0}, Le72;->a()V

    .line 336
    .line 337
    .line 338
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final c0(Lq94;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvo;->C:Lsp1;

    .line 2
    .line 3
    invoke-static {p1, p0}, Lo94;->b(Lq94;Lac4;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
