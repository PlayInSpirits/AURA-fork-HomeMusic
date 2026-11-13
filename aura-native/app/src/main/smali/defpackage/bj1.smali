.class public final Ldefpackage/bj1;
.super Ldefpackage/fo0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/rv0;


# instance fields
.field public final synthetic D:I

.field public final E:Ldefpackage/tb;

.field public final F:Ldefpackage/vy0;

.field public G:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/ip4;Ldefpackage/tb;Ldefpackage/vy0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/bj1;->D:I

    .line 17
    invoke-direct {p0}, Ldefpackage/fo0;-><init>()V

    .line 18
    iput-object p2, p0, Ldefpackage/bj1;->E:Ldefpackage/tb;

    .line 19
    iput-object p3, p0, Ldefpackage/bj1;->F:Ldefpackage/vy0;

    .line 20
    invoke-virtual {p0, p1}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    return-void
.end method

.method public constructor <init>(Ldefpackage/ip4;Ldefpackage/tb;Ldefpackage/vy0;Ldefpackage/ac3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/bj1;->D:I

    .line 3
    .line 4
    invoke-direct {p0}, Ldefpackage/fo0;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Ldefpackage/bj1;->E:Ldefpackage/tb;

    .line 8
    .line 9
    iput-object p3, p0, Ldefpackage/bj1;->F:Ldefpackage/vy0;

    .line 10
    .line 11
    iput-object p4, p0, Ldefpackage/bj1;->G:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/fo0;->q0(Ldefpackage/eo0;)Ldefpackage/eo0;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p0, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 23
    .line 24
    .line 25
    return p0
.end method

.method public static u0(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    .line 1
    invoke-virtual {p4}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p4, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x20

    .line 9
    .line 10
    shr-long v1, p1, p0

    .line 11
    .line 12
    long-to-int p0, v1

    .line 13
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const-wide v1, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v1

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p4, p0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p4}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p4, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 36
    .line 37
    .line 38
    return p0
.end method


# virtual methods
.method public final S(Ldefpackage/e72;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ldefpackage/bj1;->D:I

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/bj1;->E:Ldefpackage/tb;

    .line 8
    .line 9
    iget-object v7, v0, Ldefpackage/bj1;->F:Ldefpackage/vy0;

    .line 10
    .line 11
    const/high16 v11, 0x42b40000    # 90.0f

    .line 12
    .line 13
    const/high16 v12, 0x43870000    # 270.0f

    .line 14
    .line 15
    const/high16 v13, 0x43340000    # 180.0f

    .line 16
    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Ldefpackage/e72;->n:Ldefpackage/mz;

    .line 21
    .line 22
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 23
    .line 24
    .line 25
    move-result-wide v14

    .line 26
    invoke-virtual {v3, v14, v15}, Ldefpackage/tb;->j(J)V

    .line 27
    .line 28
    .line 29
    iget-object v14, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 30
    .line 31
    invoke-virtual {v14}, Ldefpackage/i61;->g()Ldefpackage/jz;

    .line 32
    .line 33
    .line 34
    move-result-object v14

    .line 35
    invoke-static {v14}, Ldefpackage/ba;->a(Ldefpackage/jz;)Landroid/graphics/Canvas;

    .line 36
    .line 37
    .line 38
    move-result-object v14

    .line 39
    iget-object v15, v3, Ldefpackage/tb;->d:Ldefpackage/zd3;

    .line 40
    .line 41
    invoke-virtual {v15}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 45
    .line 46
    .line 47
    move-result-wide v15

    .line 48
    invoke-static/range {v15 .. v16}, Ldefpackage/qf4;->b(J)Z

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    if-eqz v15, :cond_0

    .line 53
    .line 54
    invoke-virtual {v1}, Ldefpackage/e72;->a()V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_16

    .line 58
    .line 59
    :cond_0
    invoke-virtual {v14}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 60
    .line 61
    .line 62
    move-result v15

    .line 63
    if-nez v15, :cond_9

    .line 64
    .line 65
    iget-object v0, v7, Ldefpackage/vy0;->d:Landroid/widget/EdgeEffect;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object v0, v7, Ldefpackage/vy0;->e:Landroid/widget/EdgeEffect;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v0, v7, Ldefpackage/vy0;->f:Landroid/widget/EdgeEffect;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 84
    .line 85
    .line 86
    :cond_3
    iget-object v0, v7, Ldefpackage/vy0;->g:Landroid/widget/EdgeEffect;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 91
    .line 92
    .line 93
    :cond_4
    iget-object v0, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 94
    .line 95
    if-eqz v0, :cond_5

    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 98
    .line 99
    .line 100
    :cond_5
    iget-object v0, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 105
    .line 106
    .line 107
    :cond_6
    iget-object v0, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 108
    .line 109
    if-eqz v0, :cond_7

    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 112
    .line 113
    .line 114
    :cond_7
    iget-object v0, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 119
    .line 120
    .line 121
    :cond_8
    invoke-virtual {v1}, Ldefpackage/e72;->a()V

    .line 122
    .line 123
    .line 124
    goto/16 :goto_16

    .line 125
    .line 126
    :cond_9
    const/high16 v15, 0x41f00000    # 30.0f

    .line 127
    .line 128
    invoke-virtual {v1, v15}, Ldefpackage/e72;->M(F)F

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    iget-object v4, v7, Ldefpackage/vy0;->d:Landroid/widget/EdgeEffect;

    .line 133
    .line 134
    invoke-static {v4}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-nez v4, :cond_b

    .line 139
    .line 140
    iget-object v4, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 141
    .line 142
    invoke-static {v4}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_b

    .line 147
    .line 148
    iget-object v4, v7, Ldefpackage/vy0;->e:Landroid/widget/EdgeEffect;

    .line 149
    .line 150
    invoke-static {v4}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_b

    .line 155
    .line 156
    iget-object v4, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 157
    .line 158
    invoke-static {v4}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_a

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_a
    const/4 v4, 0x0

    .line 166
    goto :goto_1

    .line 167
    :cond_b
    :goto_0
    const/4 v4, 0x1

    .line 168
    :goto_1
    iget-object v6, v7, Ldefpackage/vy0;->f:Landroid/widget/EdgeEffect;

    .line 169
    .line 170
    invoke-static {v6}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_d

    .line 175
    .line 176
    iget-object v6, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 177
    .line 178
    invoke-static {v6}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_d

    .line 183
    .line 184
    iget-object v6, v7, Ldefpackage/vy0;->g:Landroid/widget/EdgeEffect;

    .line 185
    .line 186
    invoke-static {v6}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_d

    .line 191
    .line 192
    iget-object v6, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 193
    .line 194
    invoke-static {v6}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-eqz v6, :cond_c

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_c
    const/4 v6, 0x0

    .line 202
    goto :goto_3

    .line 203
    :cond_d
    :goto_2
    const/4 v6, 0x1

    .line 204
    :goto_3
    if-eqz v4, :cond_e

    .line 205
    .line 206
    if-eqz v6, :cond_e

    .line 207
    .line 208
    const-wide v17, 0xffffffffL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ldefpackage/bj1;->v0()Landroid/graphics/RenderNode;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-virtual {v14}, Landroid/graphics/Canvas;->getWidth()I

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    const/16 v19, 0x20

    .line 222
    .line 223
    invoke-virtual {v14}, Landroid/graphics/Canvas;->getHeight()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    invoke-static {v8, v9, v10}, Ldefpackage/ek2;->q(Landroid/graphics/RenderNode;II)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_e
    const-wide v17, 0xffffffffL

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    const/16 v19, 0x20

    .line 237
    .line 238
    if-eqz v4, :cond_f

    .line 239
    .line 240
    invoke-virtual {v0}, Ldefpackage/bj1;->v0()Landroid/graphics/RenderNode;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    invoke-virtual {v14}, Landroid/graphics/Canvas;->getWidth()I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    invoke-static {v15}, Ldefpackage/ji2;->L(F)I

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    mul-int/lit8 v10, v10, 0x2

    .line 253
    .line 254
    add-int/2addr v10, v9

    .line 255
    invoke-virtual {v14}, Landroid/graphics/Canvas;->getHeight()I

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    invoke-static {v8, v10, v9}, Ldefpackage/ek2;->q(Landroid/graphics/RenderNode;II)V

    .line 260
    .line 261
    .line 262
    goto :goto_4

    .line 263
    :cond_f
    if-eqz v6, :cond_33

    .line 264
    .line 265
    invoke-virtual {v0}, Ldefpackage/bj1;->v0()Landroid/graphics/RenderNode;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    invoke-virtual {v14}, Landroid/graphics/Canvas;->getWidth()I

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    invoke-virtual {v14}, Landroid/graphics/Canvas;->getHeight()I

    .line 274
    .line 275
    .line 276
    move-result v10

    .line 277
    invoke-static {v15}, Ldefpackage/ji2;->L(F)I

    .line 278
    .line 279
    .line 280
    move-result v20

    .line 281
    mul-int/lit8 v20, v20, 0x2

    .line 282
    .line 283
    add-int v10, v20, v10

    .line 284
    .line 285
    invoke-static {v8, v9, v10}, Ldefpackage/ek2;->q(Landroid/graphics/RenderNode;II)V

    .line 286
    .line 287
    .line 288
    :goto_4
    invoke-virtual {v0}, Ldefpackage/bj1;->v0()Landroid/graphics/RenderNode;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    invoke-static {v8}, Ldefpackage/ek2;->e(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    iget-object v9, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 297
    .line 298
    invoke-static {v9}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 299
    .line 300
    .line 301
    move-result v9

    .line 302
    sget-object v10, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 303
    .line 304
    if-eqz v9, :cond_11

    .line 305
    .line 306
    iget-object v9, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 307
    .line 308
    if-nez v9, :cond_10

    .line 309
    .line 310
    invoke-virtual {v7, v10}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 311
    .line 312
    .line 313
    move-result-object v9

    .line 314
    iput-object v9, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 315
    .line 316
    :cond_10
    invoke-static {v11, v9, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 317
    .line 318
    .line 319
    invoke-virtual {v9}, Landroid/widget/EdgeEffect;->finish()V

    .line 320
    .line 321
    .line 322
    :cond_11
    iget-object v9, v7, Ldefpackage/vy0;->f:Landroid/widget/EdgeEffect;

    .line 323
    .line 324
    invoke-static {v9}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    const/high16 v20, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/16 v11, 0x1f

    .line 331
    .line 332
    if-eqz v9, :cond_16

    .line 333
    .line 334
    invoke-virtual {v7}, Ldefpackage/vy0;->c()Landroid/widget/EdgeEffect;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    invoke-static {v12, v9, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 339
    .line 340
    .line 341
    move-result v21

    .line 342
    iget-object v12, v7, Ldefpackage/vy0;->f:Landroid/widget/EdgeEffect;

    .line 343
    .line 344
    invoke-static {v12}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 345
    .line 346
    .line 347
    move-result v12

    .line 348
    if-eqz v12, :cond_15

    .line 349
    .line 350
    invoke-virtual {v3}, Ldefpackage/tb;->c()J

    .line 351
    .line 352
    .line 353
    move-result-wide v22

    .line 354
    move/from16 v24, v6

    .line 355
    .line 356
    and-long v5, v22, v17

    .line 357
    .line 358
    long-to-int v5, v5

    .line 359
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    iget-object v6, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 364
    .line 365
    if-nez v6, :cond_12

    .line 366
    .line 367
    invoke-virtual {v7, v10}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    iput-object v6, v7, Ldefpackage/vy0;->j:Landroid/widget/EdgeEffect;

    .line 372
    .line 373
    :cond_12
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 374
    .line 375
    if-lt v12, v11, :cond_13

    .line 376
    .line 377
    invoke-static {v9}, Ldefpackage/qe;->b(Landroid/widget/EdgeEffect;)F

    .line 378
    .line 379
    .line 380
    move-result v9

    .line 381
    goto :goto_5

    .line 382
    :cond_13
    const/4 v9, 0x0

    .line 383
    :goto_5
    sub-float v5, v20, v5

    .line 384
    .line 385
    if-lt v12, v11, :cond_14

    .line 386
    .line 387
    invoke-static {v6, v9, v5}, Ldefpackage/qe;->d(Landroid/widget/EdgeEffect;FF)F

    .line 388
    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_14
    invoke-virtual {v6, v9, v5}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 392
    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_15
    move/from16 v24, v6

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_16
    move/from16 v24, v6

    .line 399
    .line 400
    const/16 v21, 0x0

    .line 401
    .line 402
    :goto_6
    iget-object v5, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 403
    .line 404
    invoke-static {v5}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    sget-object v6, Ldefpackage/hb3;->n:Ldefpackage/hb3;

    .line 409
    .line 410
    if-eqz v5, :cond_18

    .line 411
    .line 412
    iget-object v5, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 413
    .line 414
    if-nez v5, :cond_17

    .line 415
    .line 416
    invoke-virtual {v7, v6}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    iput-object v5, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 421
    .line 422
    :cond_17
    invoke-static {v13, v5, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 423
    .line 424
    .line 425
    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->finish()V

    .line 426
    .line 427
    .line 428
    :cond_18
    iget-object v5, v7, Ldefpackage/vy0;->d:Landroid/widget/EdgeEffect;

    .line 429
    .line 430
    invoke-static {v5}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    if-eqz v5, :cond_1e

    .line 435
    .line 436
    invoke-virtual {v7}, Ldefpackage/vy0;->e()Landroid/widget/EdgeEffect;

    .line 437
    .line 438
    .line 439
    move-result-object v5

    .line 440
    const/4 v12, 0x0

    .line 441
    invoke-static {v12, v5, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    if-nez v9, :cond_1a

    .line 446
    .line 447
    if-eqz v21, :cond_19

    .line 448
    .line 449
    goto :goto_7

    .line 450
    :cond_19
    const/16 v21, 0x0

    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_1a
    :goto_7
    const/16 v21, 0x1

    .line 454
    .line 455
    :goto_8
    iget-object v9, v7, Ldefpackage/vy0;->d:Landroid/widget/EdgeEffect;

    .line 456
    .line 457
    invoke-static {v9}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    if-eqz v9, :cond_1e

    .line 462
    .line 463
    invoke-virtual {v3}, Ldefpackage/tb;->c()J

    .line 464
    .line 465
    .line 466
    move-result-wide v22

    .line 467
    shr-long v12, v22, v19

    .line 468
    .line 469
    long-to-int v12, v12

    .line 470
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 471
    .line 472
    .line 473
    move-result v12

    .line 474
    iget-object v13, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 475
    .line 476
    if-nez v13, :cond_1b

    .line 477
    .line 478
    invoke-virtual {v7, v6}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 479
    .line 480
    .line 481
    move-result-object v13

    .line 482
    iput-object v13, v7, Ldefpackage/vy0;->h:Landroid/widget/EdgeEffect;

    .line 483
    .line 484
    :cond_1b
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 485
    .line 486
    if-lt v9, v11, :cond_1c

    .line 487
    .line 488
    invoke-static {v5}, Ldefpackage/qe;->b(Landroid/widget/EdgeEffect;)F

    .line 489
    .line 490
    .line 491
    move-result v5

    .line 492
    goto :goto_9

    .line 493
    :cond_1c
    const/4 v5, 0x0

    .line 494
    :goto_9
    if-lt v9, v11, :cond_1d

    .line 495
    .line 496
    invoke-static {v13, v5, v12}, Ldefpackage/qe;->d(Landroid/widget/EdgeEffect;FF)F

    .line 497
    .line 498
    .line 499
    goto :goto_a

    .line 500
    :cond_1d
    invoke-virtual {v13, v5, v12}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 501
    .line 502
    .line 503
    :cond_1e
    :goto_a
    iget-object v5, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 504
    .line 505
    invoke-static {v5}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 506
    .line 507
    .line 508
    move-result v5

    .line 509
    if-eqz v5, :cond_20

    .line 510
    .line 511
    iget-object v5, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 512
    .line 513
    if-nez v5, :cond_1f

    .line 514
    .line 515
    invoke-virtual {v7, v10}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iput-object v5, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 520
    .line 521
    :cond_1f
    const/high16 v9, 0x43870000    # 270.0f

    .line 522
    .line 523
    invoke-static {v9, v5, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 524
    .line 525
    .line 526
    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->finish()V

    .line 527
    .line 528
    .line 529
    :cond_20
    iget-object v5, v7, Ldefpackage/vy0;->g:Landroid/widget/EdgeEffect;

    .line 530
    .line 531
    invoke-static {v5}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 532
    .line 533
    .line 534
    move-result v5

    .line 535
    if-eqz v5, :cond_26

    .line 536
    .line 537
    invoke-virtual {v7}, Ldefpackage/vy0;->d()Landroid/widget/EdgeEffect;

    .line 538
    .line 539
    .line 540
    move-result-object v5

    .line 541
    const/high16 v9, 0x42b40000    # 90.0f

    .line 542
    .line 543
    invoke-static {v9, v5, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 544
    .line 545
    .line 546
    move-result v9

    .line 547
    if-nez v9, :cond_22

    .line 548
    .line 549
    if-eqz v21, :cond_21

    .line 550
    .line 551
    goto :goto_b

    .line 552
    :cond_21
    const/16 v21, 0x0

    .line 553
    .line 554
    goto :goto_c

    .line 555
    :cond_22
    :goto_b
    const/16 v21, 0x1

    .line 556
    .line 557
    :goto_c
    iget-object v9, v7, Ldefpackage/vy0;->g:Landroid/widget/EdgeEffect;

    .line 558
    .line 559
    invoke-static {v9}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 560
    .line 561
    .line 562
    move-result v9

    .line 563
    if-eqz v9, :cond_26

    .line 564
    .line 565
    invoke-virtual {v3}, Ldefpackage/tb;->c()J

    .line 566
    .line 567
    .line 568
    move-result-wide v12

    .line 569
    and-long v12, v12, v17

    .line 570
    .line 571
    long-to-int v9, v12

    .line 572
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    iget-object v12, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 577
    .line 578
    if-nez v12, :cond_23

    .line 579
    .line 580
    invoke-virtual {v7, v10}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 581
    .line 582
    .line 583
    move-result-object v12

    .line 584
    iput-object v12, v7, Ldefpackage/vy0;->k:Landroid/widget/EdgeEffect;

    .line 585
    .line 586
    :cond_23
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 587
    .line 588
    if-lt v10, v11, :cond_24

    .line 589
    .line 590
    invoke-static {v5}, Ldefpackage/qe;->b(Landroid/widget/EdgeEffect;)F

    .line 591
    .line 592
    .line 593
    move-result v5

    .line 594
    goto :goto_d

    .line 595
    :cond_24
    const/4 v5, 0x0

    .line 596
    :goto_d
    if-lt v10, v11, :cond_25

    .line 597
    .line 598
    invoke-static {v12, v5, v9}, Ldefpackage/qe;->d(Landroid/widget/EdgeEffect;FF)F

    .line 599
    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_25
    invoke-virtual {v12, v5, v9}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 603
    .line 604
    .line 605
    :cond_26
    :goto_e
    iget-object v5, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 606
    .line 607
    invoke-static {v5}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 608
    .line 609
    .line 610
    move-result v5

    .line 611
    if-eqz v5, :cond_28

    .line 612
    .line 613
    iget-object v5, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 614
    .line 615
    if-nez v5, :cond_27

    .line 616
    .line 617
    invoke-virtual {v7, v6}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 618
    .line 619
    .line 620
    move-result-object v5

    .line 621
    iput-object v5, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 622
    .line 623
    :cond_27
    const/4 v12, 0x0

    .line 624
    invoke-static {v12, v5, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 625
    .line 626
    .line 627
    invoke-virtual {v5}, Landroid/widget/EdgeEffect;->finish()V

    .line 628
    .line 629
    .line 630
    :cond_28
    iget-object v5, v7, Ldefpackage/vy0;->e:Landroid/widget/EdgeEffect;

    .line 631
    .line 632
    invoke-static {v5}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    if-eqz v5, :cond_2f

    .line 637
    .line 638
    invoke-virtual {v7}, Ldefpackage/vy0;->b()Landroid/widget/EdgeEffect;

    .line 639
    .line 640
    .line 641
    move-result-object v5

    .line 642
    const/high16 v9, 0x43340000    # 180.0f

    .line 643
    .line 644
    invoke-static {v9, v5, v8}, Ldefpackage/bj1;->t0(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    if-nez v9, :cond_2a

    .line 649
    .line 650
    if-eqz v21, :cond_29

    .line 651
    .line 652
    goto :goto_f

    .line 653
    :cond_29
    const/16 v16, 0x0

    .line 654
    .line 655
    goto :goto_10

    .line 656
    :cond_2a
    :goto_f
    const/16 v16, 0x1

    .line 657
    .line 658
    :goto_10
    iget-object v9, v7, Ldefpackage/vy0;->e:Landroid/widget/EdgeEffect;

    .line 659
    .line 660
    invoke-static {v9}, Ldefpackage/vy0;->g(Landroid/widget/EdgeEffect;)Z

    .line 661
    .line 662
    .line 663
    move-result v9

    .line 664
    if-eqz v9, :cond_2e

    .line 665
    .line 666
    invoke-virtual {v3}, Ldefpackage/tb;->c()J

    .line 667
    .line 668
    .line 669
    move-result-wide v9

    .line 670
    shr-long v9, v9, v19

    .line 671
    .line 672
    long-to-int v9, v9

    .line 673
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 674
    .line 675
    .line 676
    move-result v9

    .line 677
    iget-object v10, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 678
    .line 679
    if-nez v10, :cond_2b

    .line 680
    .line 681
    invoke-virtual {v7, v6}, Ldefpackage/vy0;->a(Ldefpackage/hb3;)Landroid/widget/EdgeEffect;

    .line 682
    .line 683
    .line 684
    move-result-object v10

    .line 685
    iput-object v10, v7, Ldefpackage/vy0;->i:Landroid/widget/EdgeEffect;

    .line 686
    .line 687
    :cond_2b
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 688
    .line 689
    if-lt v6, v11, :cond_2c

    .line 690
    .line 691
    invoke-static {v5}, Ldefpackage/qe;->b(Landroid/widget/EdgeEffect;)F

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    goto :goto_11

    .line 696
    :cond_2c
    const/4 v5, 0x0

    .line 697
    :goto_11
    sub-float v7, v20, v9

    .line 698
    .line 699
    if-lt v6, v11, :cond_2d

    .line 700
    .line 701
    invoke-static {v10, v5, v7}, Ldefpackage/qe;->d(Landroid/widget/EdgeEffect;FF)F

    .line 702
    .line 703
    .line 704
    goto :goto_12

    .line 705
    :cond_2d
    invoke-virtual {v10, v5, v7}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 706
    .line 707
    .line 708
    :cond_2e
    :goto_12
    move/from16 v21, v16

    .line 709
    .line 710
    :cond_2f
    if-eqz v21, :cond_30

    .line 711
    .line 712
    invoke-virtual {v3}, Ldefpackage/tb;->d()V

    .line 713
    .line 714
    .line 715
    :cond_30
    if-eqz v24, :cond_31

    .line 716
    .line 717
    const/4 v3, 0x0

    .line 718
    goto :goto_13

    .line 719
    :cond_31
    move v3, v15

    .line 720
    :goto_13
    if-eqz v4, :cond_32

    .line 721
    .line 722
    const/4 v5, 0x0

    .line 723
    goto :goto_14

    .line 724
    :cond_32
    move v5, v15

    .line 725
    :goto_14
    invoke-virtual {v1}, Ldefpackage/e72;->getLayoutDirection()Ldefpackage/r62;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    new-instance v6, Ldefpackage/aa;

    .line 730
    .line 731
    invoke-direct {v6}, Ldefpackage/aa;-><init>()V

    .line 732
    .line 733
    .line 734
    iput-object v8, v6, Ldefpackage/aa;->a:Landroid/graphics/Canvas;

    .line 735
    .line 736
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 737
    .line 738
    .line 739
    move-result-wide v7

    .line 740
    iget-object v9, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 741
    .line 742
    invoke-virtual {v9}, Ldefpackage/i61;->h()Ldefpackage/oo0;

    .line 743
    .line 744
    .line 745
    move-result-object v9

    .line 746
    iget-object v10, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 747
    .line 748
    invoke-virtual {v10}, Ldefpackage/i61;->i()Ldefpackage/r62;

    .line 749
    .line 750
    .line 751
    move-result-object v10

    .line 752
    iget-object v11, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 753
    .line 754
    invoke-virtual {v11}, Ldefpackage/i61;->g()Ldefpackage/jz;

    .line 755
    .line 756
    .line 757
    move-result-object v11

    .line 758
    iget-object v12, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 759
    .line 760
    invoke-virtual {v12}, Ldefpackage/i61;->j()J

    .line 761
    .line 762
    .line 763
    move-result-wide v12

    .line 764
    iget-object v15, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 765
    .line 766
    iget-object v0, v15, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 767
    .line 768
    move-object/from16 v20, v14

    .line 769
    .line 770
    move-object v14, v0

    .line 771
    check-cast v14, Ldefpackage/sj1;

    .line 772
    .line 773
    invoke-virtual {v15, v1}, Ldefpackage/i61;->r(Ldefpackage/oo0;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v15, v4}, Ldefpackage/i61;->s(Ldefpackage/r62;)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v15, v6}, Ldefpackage/i61;->q(Ldefpackage/jz;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v15, v7, v8}, Ldefpackage/i61;->t(J)V

    .line 783
    .line 784
    .line 785
    const/4 v0, 0x0

    .line 786
    iput-object v0, v15, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 787
    .line 788
    invoke-virtual {v6}, Ldefpackage/aa;->e()V

    .line 789
    .line 790
    .line 791
    :try_start_0
    iget-object v0, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 792
    .line 793
    iget-object v0, v0, Ldefpackage/i61;->o:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v0, Ldefpackage/zg5;

    .line 796
    .line 797
    invoke-virtual {v0, v3, v5}, Ldefpackage/zg5;->C(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 798
    .line 799
    .line 800
    :try_start_1
    invoke-virtual {v1}, Ldefpackage/e72;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 801
    .line 802
    .line 803
    :try_start_2
    iget-object v0, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 804
    .line 805
    iget-object v0, v0, Ldefpackage/i61;->o:Ljava/lang/Object;

    .line 806
    .line 807
    check-cast v0, Ldefpackage/zg5;

    .line 808
    .line 809
    neg-float v1, v3

    .line 810
    neg-float v3, v5

    .line 811
    invoke-virtual {v0, v1, v3}, Ldefpackage/zg5;->C(FF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 812
    .line 813
    .line 814
    invoke-virtual {v6}, Ldefpackage/aa;->k()V

    .line 815
    .line 816
    .line 817
    iget-object v0, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 818
    .line 819
    invoke-virtual {v0, v9}, Ldefpackage/i61;->r(Ldefpackage/oo0;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v10}, Ldefpackage/i61;->s(Ldefpackage/r62;)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v0, v11}, Ldefpackage/i61;->q(Ldefpackage/jz;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v0, v12, v13}, Ldefpackage/i61;->t(J)V

    .line 829
    .line 830
    .line 831
    iput-object v14, v0, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 832
    .line 833
    invoke-virtual/range {p0 .. p0}, Ldefpackage/bj1;->v0()Landroid/graphics/RenderNode;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-static {v0}, Ldefpackage/ek2;->p(Landroid/graphics/RenderNode;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual/range {v20 .. v20}, Landroid/graphics/Canvas;->save()I

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    move-object/from16 v2, v20

    .line 845
    .line 846
    invoke-virtual {v2, v1, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 847
    .line 848
    .line 849
    invoke-virtual/range {p0 .. p0}, Ldefpackage/bj1;->v0()Landroid/graphics/RenderNode;

    .line 850
    .line 851
    .line 852
    move-result-object v1

    .line 853
    invoke-static {v2, v1}, Ldefpackage/lm4;->o(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 857
    .line 858
    .line 859
    goto :goto_16

    .line 860
    :catchall_0
    move-exception v0

    .line 861
    goto :goto_15

    .line 862
    :catchall_1
    move-exception v0

    .line 863
    :try_start_3
    iget-object v1, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 864
    .line 865
    iget-object v1, v1, Ldefpackage/i61;->o:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v1, Ldefpackage/zg5;

    .line 868
    .line 869
    neg-float v3, v3

    .line 870
    neg-float v4, v5

    .line 871
    invoke-virtual {v1, v3, v4}, Ldefpackage/zg5;->C(FF)V

    .line 872
    .line 873
    .line 874
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 875
    :goto_15
    invoke-virtual {v6}, Ldefpackage/aa;->k()V

    .line 876
    .line 877
    .line 878
    iget-object v1, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 879
    .line 880
    invoke-virtual {v1, v9}, Ldefpackage/i61;->r(Ldefpackage/oo0;)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1, v10}, Ldefpackage/i61;->s(Ldefpackage/r62;)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v1, v11}, Ldefpackage/i61;->q(Ldefpackage/jz;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v1, v12, v13}, Ldefpackage/i61;->t(J)V

    .line 890
    .line 891
    .line 892
    iput-object v14, v1, Ldefpackage/i61;->p:Ljava/lang/Object;

    .line 893
    .line 894
    throw v0

    .line 895
    :cond_33
    invoke-virtual {v1}, Ldefpackage/e72;->a()V

    .line 896
    .line 897
    .line 898
    :goto_16
    return-void

    .line 899
    :pswitch_0
    const-wide v17, 0xffffffffL

    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    const/16 v19, 0x20

    .line 905
    .line 906
    iget-object v0, v0, Ldefpackage/bj1;->G:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v0, Ldefpackage/ac3;

    .line 909
    .line 910
    iget-object v2, v1, Ldefpackage/e72;->n:Ldefpackage/mz;

    .line 911
    .line 912
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 913
    .line 914
    .line 915
    move-result-wide v4

    .line 916
    invoke-virtual {v3, v4, v5}, Ldefpackage/tb;->j(J)V

    .line 917
    .line 918
    .line 919
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 920
    .line 921
    .line 922
    move-result-wide v4

    .line 923
    invoke-static {v4, v5}, Ldefpackage/qf4;->b(J)Z

    .line 924
    .line 925
    .line 926
    move-result v4

    .line 927
    if-eqz v4, :cond_34

    .line 928
    .line 929
    invoke-virtual {v1}, Ldefpackage/e72;->a()V

    .line 930
    .line 931
    .line 932
    goto/16 :goto_20

    .line 933
    .line 934
    :cond_34
    invoke-virtual {v1}, Ldefpackage/e72;->a()V

    .line 935
    .line 936
    .line 937
    iget-object v4, v3, Ldefpackage/tb;->d:Ldefpackage/zd3;

    .line 938
    .line 939
    invoke-virtual {v4}, Ldefpackage/zd3;->getValue()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    iget-object v4, v2, Ldefpackage/mz;->o:Ldefpackage/i61;

    .line 943
    .line 944
    invoke-virtual {v4}, Ldefpackage/i61;->g()Ldefpackage/jz;

    .line 945
    .line 946
    .line 947
    move-result-object v4

    .line 948
    invoke-static {v4}, Ldefpackage/ba;->a(Ldefpackage/jz;)Landroid/graphics/Canvas;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    iget-object v5, v7, Ldefpackage/vy0;->f:Landroid/widget/EdgeEffect;

    .line 953
    .line 954
    invoke-static {v5}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 955
    .line 956
    .line 957
    move-result v5

    .line 958
    sget-object v6, Ldefpackage/r62;->n:Ldefpackage/r62;

    .line 959
    .line 960
    if-eqz v5, :cond_36

    .line 961
    .line 962
    invoke-virtual {v7}, Ldefpackage/vy0;->c()Landroid/widget/EdgeEffect;

    .line 963
    .line 964
    .line 965
    move-result-object v5

    .line 966
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 967
    .line 968
    .line 969
    move-result-wide v10

    .line 970
    and-long v10, v10, v17

    .line 971
    .line 972
    long-to-int v8, v10

    .line 973
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 974
    .line 975
    .line 976
    move-result v8

    .line 977
    neg-float v8, v8

    .line 978
    invoke-virtual {v1}, Ldefpackage/e72;->getLayoutDirection()Ldefpackage/r62;

    .line 979
    .line 980
    .line 981
    move-result-object v10

    .line 982
    if-ne v10, v6, :cond_35

    .line 983
    .line 984
    iget v10, v0, Ldefpackage/ac3;->a:F

    .line 985
    .line 986
    goto :goto_17

    .line 987
    :cond_35
    iget v10, v0, Ldefpackage/ac3;->b:F

    .line 988
    .line 989
    :goto_17
    invoke-virtual {v1, v10}, Ldefpackage/e72;->M(F)F

    .line 990
    .line 991
    .line 992
    move-result v10

    .line 993
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 994
    .line 995
    .line 996
    move-result v8

    .line 997
    int-to-long v13, v8

    .line 998
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 999
    .line 1000
    .line 1001
    move-result v8

    .line 1002
    int-to-long v10, v8

    .line 1003
    shl-long v13, v13, v19

    .line 1004
    .line 1005
    and-long v10, v10, v17

    .line 1006
    .line 1007
    or-long/2addr v10, v13

    .line 1008
    const/high16 v8, 0x43870000    # 270.0f

    .line 1009
    .line 1010
    invoke-static {v8, v10, v11, v5, v4}, Ldefpackage/bj1;->u0(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v5

    .line 1014
    goto :goto_18

    .line 1015
    :cond_36
    const/4 v5, 0x0

    .line 1016
    :goto_18
    iget-object v8, v7, Ldefpackage/vy0;->d:Landroid/widget/EdgeEffect;

    .line 1017
    .line 1018
    invoke-static {v8}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v8

    .line 1022
    if-eqz v8, :cond_39

    .line 1023
    .line 1024
    invoke-virtual {v7}, Ldefpackage/vy0;->e()Landroid/widget/EdgeEffect;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v8

    .line 1028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    const/4 v12, 0x0

    .line 1032
    invoke-virtual {v1, v12}, Ldefpackage/e72;->M(F)F

    .line 1033
    .line 1034
    .line 1035
    move-result v10

    .line 1036
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1037
    .line 1038
    .line 1039
    move-result v11

    .line 1040
    int-to-long v13, v11

    .line 1041
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1042
    .line 1043
    .line 1044
    move-result v10

    .line 1045
    int-to-long v10, v10

    .line 1046
    shl-long v13, v13, v19

    .line 1047
    .line 1048
    and-long v10, v10, v17

    .line 1049
    .line 1050
    or-long/2addr v10, v13

    .line 1051
    invoke-static {v12, v10, v11, v8, v4}, Ldefpackage/bj1;->u0(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v8

    .line 1055
    if-nez v8, :cond_38

    .line 1056
    .line 1057
    if-eqz v5, :cond_37

    .line 1058
    .line 1059
    goto :goto_19

    .line 1060
    :cond_37
    const/4 v5, 0x0

    .line 1061
    goto :goto_1a

    .line 1062
    :cond_38
    :goto_19
    const/4 v5, 0x1

    .line 1063
    :cond_39
    :goto_1a
    iget-object v8, v7, Ldefpackage/vy0;->g:Landroid/widget/EdgeEffect;

    .line 1064
    .line 1065
    invoke-static {v8}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v8

    .line 1069
    if-eqz v8, :cond_3d

    .line 1070
    .line 1071
    invoke-virtual {v7}, Ldefpackage/vy0;->d()Landroid/widget/EdgeEffect;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v8

    .line 1075
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v10

    .line 1079
    shr-long v10, v10, v19

    .line 1080
    .line 1081
    long-to-int v10, v10

    .line 1082
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1083
    .line 1084
    .line 1085
    move-result v10

    .line 1086
    invoke-static {v10}, Ldefpackage/ji2;->L(F)I

    .line 1087
    .line 1088
    .line 1089
    move-result v10

    .line 1090
    invoke-virtual {v1}, Ldefpackage/e72;->getLayoutDirection()Ldefpackage/r62;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v11

    .line 1094
    if-ne v11, v6, :cond_3a

    .line 1095
    .line 1096
    iget v6, v0, Ldefpackage/ac3;->b:F

    .line 1097
    .line 1098
    goto :goto_1b

    .line 1099
    :cond_3a
    iget v6, v0, Ldefpackage/ac3;->a:F

    .line 1100
    .line 1101
    :goto_1b
    int-to-float v10, v10

    .line 1102
    neg-float v10, v10

    .line 1103
    invoke-virtual {v1, v6}, Ldefpackage/e72;->M(F)F

    .line 1104
    .line 1105
    .line 1106
    move-result v6

    .line 1107
    add-float/2addr v6, v10

    .line 1108
    const/4 v12, 0x0

    .line 1109
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1110
    .line 1111
    .line 1112
    move-result v10

    .line 1113
    int-to-long v10, v10

    .line 1114
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1115
    .line 1116
    .line 1117
    move-result v6

    .line 1118
    int-to-long v13, v6

    .line 1119
    shl-long v10, v10, v19

    .line 1120
    .line 1121
    and-long v13, v13, v17

    .line 1122
    .line 1123
    or-long/2addr v10, v13

    .line 1124
    const/high16 v6, 0x42b40000    # 90.0f

    .line 1125
    .line 1126
    invoke-static {v6, v10, v11, v8, v4}, Ldefpackage/bj1;->u0(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v6

    .line 1130
    if-nez v6, :cond_3c

    .line 1131
    .line 1132
    if-eqz v5, :cond_3b

    .line 1133
    .line 1134
    goto :goto_1c

    .line 1135
    :cond_3b
    const/4 v5, 0x0

    .line 1136
    goto :goto_1d

    .line 1137
    :cond_3c
    :goto_1c
    const/4 v5, 0x1

    .line 1138
    :cond_3d
    :goto_1d
    iget-object v6, v7, Ldefpackage/vy0;->e:Landroid/widget/EdgeEffect;

    .line 1139
    .line 1140
    invoke-static {v6}, Ldefpackage/vy0;->f(Landroid/widget/EdgeEffect;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v6

    .line 1144
    if-eqz v6, :cond_40

    .line 1145
    .line 1146
    invoke-virtual {v7}, Ldefpackage/vy0;->b()Landroid/widget/EdgeEffect;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v6

    .line 1150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1151
    .line 1152
    .line 1153
    const/4 v12, 0x0

    .line 1154
    invoke-virtual {v1, v12}, Ldefpackage/e72;->M(F)F

    .line 1155
    .line 1156
    .line 1157
    move-result v0

    .line 1158
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 1159
    .line 1160
    .line 1161
    move-result-wide v7

    .line 1162
    shr-long v7, v7, v19

    .line 1163
    .line 1164
    long-to-int v1, v7

    .line 1165
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1166
    .line 1167
    .line 1168
    move-result v1

    .line 1169
    neg-float v1, v1

    .line 1170
    invoke-interface {v2}, Ldefpackage/sv0;->P()J

    .line 1171
    .line 1172
    .line 1173
    move-result-wide v7

    .line 1174
    and-long v7, v7, v17

    .line 1175
    .line 1176
    long-to-int v2, v7

    .line 1177
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1178
    .line 1179
    .line 1180
    move-result v2

    .line 1181
    neg-float v2, v2

    .line 1182
    add-float/2addr v2, v0

    .line 1183
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1184
    .line 1185
    .line 1186
    move-result v0

    .line 1187
    int-to-long v0, v0

    .line 1188
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1189
    .line 1190
    .line 1191
    move-result v2

    .line 1192
    int-to-long v7, v2

    .line 1193
    shl-long v0, v0, v19

    .line 1194
    .line 1195
    and-long v7, v7, v17

    .line 1196
    .line 1197
    or-long/2addr v0, v7

    .line 1198
    const/high16 v9, 0x43340000    # 180.0f

    .line 1199
    .line 1200
    invoke-static {v9, v0, v1, v6, v4}, Ldefpackage/bj1;->u0(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v0

    .line 1204
    if-nez v0, :cond_3f

    .line 1205
    .line 1206
    if-eqz v5, :cond_3e

    .line 1207
    .line 1208
    goto :goto_1e

    .line 1209
    :cond_3e
    const/4 v4, 0x0

    .line 1210
    goto :goto_1f

    .line 1211
    :cond_3f
    :goto_1e
    const/4 v4, 0x1

    .line 1212
    :goto_1f
    move v5, v4

    .line 1213
    :cond_40
    if-eqz v5, :cond_41

    .line 1214
    .line 1215
    invoke-virtual {v3}, Ldefpackage/tb;->d()V

    .line 1216
    .line 1217
    .line 1218
    :cond_41
    :goto_20
    return-void

    .line 1219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public v0()Landroid/graphics/RenderNode;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/bj1;->G:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/RenderNode;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Ldefpackage/ek2;->f()Landroid/graphics/RenderNode;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Ldefpackage/bj1;->G:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
