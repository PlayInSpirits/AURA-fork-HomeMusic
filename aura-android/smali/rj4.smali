.class public final Lrj4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Ljb3;


# instance fields
.field public final n:Lz54;

.field public final o:[F

.field public final p:[F

.field public final q:[F

.field public final r:[F

.field public final s:[F

.field public t:F

.field public u:F

.field public final v:[F

.field public final w:[F

.field public final synthetic x:Lsj4;


# direct methods
.method public constructor <init>(Lsj4;Lz54;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrj4;->x:Lsj4;

    .line 5
    .line 6
    const/16 p1, 0x10

    .line 7
    .line 8
    new-array v0, p1, [F

    .line 9
    .line 10
    iput-object v0, p0, Lrj4;->o:[F

    .line 11
    .line 12
    new-array v0, p1, [F

    .line 13
    .line 14
    iput-object v0, p0, Lrj4;->p:[F

    .line 15
    .line 16
    new-array v0, p1, [F

    .line 17
    .line 18
    iput-object v0, p0, Lrj4;->q:[F

    .line 19
    .line 20
    new-array v1, p1, [F

    .line 21
    .line 22
    iput-object v1, p0, Lrj4;->r:[F

    .line 23
    .line 24
    new-array v2, p1, [F

    .line 25
    .line 26
    iput-object v2, p0, Lrj4;->s:[F

    .line 27
    .line 28
    new-array v3, p1, [F

    .line 29
    .line 30
    iput-object v3, p0, Lrj4;->v:[F

    .line 31
    .line 32
    new-array p1, p1, [F

    .line 33
    .line 34
    iput-object p1, p0, Lrj4;->w:[F

    .line 35
    .line 36
    iput-object p2, p0, Lrj4;->n:Lz54;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-static {v0, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, p1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 46
    .line 47
    .line 48
    const p1, 0x40490fdb    # (float)Math.PI

    .line 49
    .line 50
    .line 51
    iput p1, p0, Lrj4;->u:F

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(F[F)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lrj4;->q:[F

    .line 3
    .line 4
    array-length v1, v0

    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    neg-float p1, p1

    .line 10
    iput p1, p0, Lrj4;->u:F

    .line 11
    .line 12
    iget-object v0, p0, Lrj4;->r:[F

    .line 13
    .line 14
    iget p2, p0, Lrj4;->t:F

    .line 15
    .line 16
    neg-float v2, p2

    .line 17
    float-to-double p1, p1

    .line 18
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    double-to-float v3, p1

    .line 23
    iget p1, p0, Lrj4;->u:F

    .line 24
    .line 25
    float-to-double p1, p1

    .line 26
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    double-to-float v4, p1

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    move-object p1, v0

    .line 40
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p1
.end method

.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v2, v1, Lrj4;->w:[F

    .line 5
    .line 6
    iget-object v4, v1, Lrj4;->q:[F

    .line 7
    .line 8
    iget-object v6, v1, Lrj4;->s:[F

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 14
    .line 15
    .line 16
    iget-object v8, v1, Lrj4;->v:[F

    .line 17
    .line 18
    iget-object v10, v1, Lrj4;->r:[F

    .line 19
    .line 20
    iget-object v12, v1, Lrj4;->w:[F

    .line 21
    .line 22
    const/4 v13, 0x0

    .line 23
    const/4 v9, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 26
    .line 27
    .line 28
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    iget-object v2, v1, Lrj4;->p:[F

    .line 30
    .line 31
    iget-object v4, v1, Lrj4;->o:[F

    .line 32
    .line 33
    iget-object v6, v1, Lrj4;->v:[F

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, Lrj4;->n:Lz54;

    .line 42
    .line 43
    iget-object v5, v1, Lrj4;->p:[F

    .line 44
    .line 45
    const/16 v0, 0x4000

    .line 46
    .line 47
    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-static {}, Lj51;->l()V
    :try_end_1
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    const-string v1, "SceneRenderer"

    .line 56
    .line 57
    const-string v3, "Failed to draw a frame"

    .line 58
    .line 59
    invoke-static {v1, v3, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    iget-object v0, v2, Lz54;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    const/4 v9, 0x0

    .line 66
    invoke-virtual {v0, v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v10, 0x2

    .line 71
    if-eqz v0, :cond_9

    .line 72
    .line 73
    iget-object v0, v2, Lz54;->w:Landroid/graphics/SurfaceTexture;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 79
    .line 80
    .line 81
    :try_start_2
    invoke-static {}, Lj51;->l()V
    :try_end_2
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_2 .. :try_end_2} :catch_1

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catch_1
    move-exception v0

    .line 86
    const-string v3, "SceneRenderer"

    .line 87
    .line 88
    const-string v4, "Failed to draw a frame"

    .line 89
    .line 90
    invoke-static {v3, v4, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    iget-object v0, v2, Lz54;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-virtual {v0, v1, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_0

    .line 100
    .line 101
    iget-object v0, v2, Lz54;->t:[F

    .line 102
    .line 103
    invoke-static {v0, v9}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 104
    .line 105
    .line 106
    :cond_0
    iget-object v0, v2, Lz54;->w:Landroid/graphics/SurfaceTexture;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    .line 109
    .line 110
    .line 111
    move-result-wide v3

    .line 112
    iget-object v6, v2, Lz54;->r:Ltu;

    .line 113
    .line 114
    monitor-enter v6

    .line 115
    :try_start_3
    invoke-virtual {v6, v9, v3, v4}, Ltu;->d(ZJ)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    monitor-exit v6

    .line 120
    check-cast v0, Ljava/lang/Long;

    .line 121
    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    iget-object v6, v2, Lz54;->q:Lll;

    .line 125
    .line 126
    iget-object v11, v2, Lz54;->t:[F

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    iget-object v0, v6, Lll;->r:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, Ltu;

    .line 135
    .line 136
    invoke-virtual {v0, v7, v8}, Ltu;->f(J)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, [F

    .line 141
    .line 142
    if-nez v0, :cond_1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_1
    iget-object v7, v6, Lll;->q:Ljava/lang/Object;

    .line 146
    .line 147
    move-object v12, v7

    .line 148
    check-cast v12, [F

    .line 149
    .line 150
    aget v7, v0, v9

    .line 151
    .line 152
    aget v8, v0, v1

    .line 153
    .line 154
    neg-float v8, v8

    .line 155
    aget v0, v0, v10

    .line 156
    .line 157
    neg-float v0, v0

    .line 158
    invoke-static {v7, v8, v0}, Landroid/opengl/Matrix;->length(FFF)F

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    const/4 v14, 0x0

    .line 163
    cmpl-float v14, v13, v14

    .line 164
    .line 165
    if-eqz v14, :cond_2

    .line 166
    .line 167
    float-to-double v14, v13

    .line 168
    invoke-static {v14, v15}, Ljava/lang/Math;->toDegrees(D)D

    .line 169
    .line 170
    .line 171
    move-result-wide v14

    .line 172
    double-to-float v14, v14

    .line 173
    div-float v15, v7, v13

    .line 174
    .line 175
    div-float v16, v8, v13

    .line 176
    .line 177
    div-float v17, v0, v13

    .line 178
    .line 179
    const/4 v13, 0x0

    .line 180
    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_2
    invoke-static {v12, v9}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 185
    .line 186
    .line 187
    :goto_2
    iget-boolean v0, v6, Lll;->o:Z

    .line 188
    .line 189
    if-nez v0, :cond_3

    .line 190
    .line 191
    iget-object v0, v6, Lll;->p:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, [F

    .line 194
    .line 195
    iget-object v7, v6, Lll;->q:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v7, [F

    .line 198
    .line 199
    invoke-static {v0, v7}, Lll;->c([F[F)V

    .line 200
    .line 201
    .line 202
    iput-boolean v1, v6, Lll;->o:Z

    .line 203
    .line 204
    :cond_3
    iget-object v0, v6, Lll;->p:Ljava/lang/Object;

    .line 205
    .line 206
    move-object v13, v0

    .line 207
    check-cast v13, [F

    .line 208
    .line 209
    iget-object v0, v6, Lll;->q:Ljava/lang/Object;

    .line 210
    .line 211
    move-object v15, v0

    .line 212
    check-cast v15, [F

    .line 213
    .line 214
    const/16 v16, 0x0

    .line 215
    .line 216
    const/4 v12, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    invoke-static/range {v11 .. v16}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 219
    .line 220
    .line 221
    :cond_4
    :goto_3
    iget-object v0, v2, Lz54;->s:Ltu;

    .line 222
    .line 223
    invoke-virtual {v0, v3, v4}, Ltu;->f(J)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Lmr3;

    .line 228
    .line 229
    if-eqz v0, :cond_9

    .line 230
    .line 231
    iget-object v3, v2, Lz54;->p:Lnr3;

    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-static {v0}, Lnr3;->c(Lmr3;)Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-nez v4, :cond_5

    .line 241
    .line 242
    goto/16 :goto_5

    .line 243
    .line 244
    :cond_5
    iget v4, v0, Lmr3;->c:I

    .line 245
    .line 246
    iput v4, v3, Lnr3;->a:I

    .line 247
    .line 248
    new-instance v4, Ltu;

    .line 249
    .line 250
    iget-object v6, v0, Lmr3;->a:Llr3;

    .line 251
    .line 252
    iget-object v6, v6, Llr3;->a:[Ltu;

    .line 253
    .line 254
    aget-object v6, v6, v9

    .line 255
    .line 256
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 257
    .line 258
    .line 259
    iget-object v7, v6, Ltu;->c:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v7, [F

    .line 262
    .line 263
    array-length v8, v7

    .line 264
    div-int/lit8 v8, v8, 0x3

    .line 265
    .line 266
    iput v8, v4, Ltu;->a:I

    .line 267
    .line 268
    array-length v8, v7

    .line 269
    const/4 v11, 0x4

    .line 270
    mul-int/2addr v8, v11

    .line 271
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 276
    .line 277
    .line 278
    move-result-object v12

    .line 279
    invoke-virtual {v8, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 284
    .line 285
    .line 286
    move-result-object v8

    .line 287
    invoke-virtual {v8, v7}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-virtual {v7}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    check-cast v7, Ljava/nio/FloatBuffer;

    .line 296
    .line 297
    iput-object v7, v4, Ltu;->c:Ljava/lang/Object;

    .line 298
    .line 299
    iget-object v7, v6, Ltu;->d:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v7, [F

    .line 302
    .line 303
    array-length v8, v7

    .line 304
    mul-int/2addr v8, v11

    .line 305
    invoke-static {v8}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    invoke-virtual {v8, v12}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    invoke-virtual {v8, v7}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-virtual {v7}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    check-cast v7, Ljava/nio/FloatBuffer;

    .line 330
    .line 331
    iput-object v7, v4, Ltu;->d:Ljava/lang/Object;

    .line 332
    .line 333
    iget v6, v6, Ltu;->b:I

    .line 334
    .line 335
    if-eq v6, v1, :cond_7

    .line 336
    .line 337
    if-eq v6, v10, :cond_6

    .line 338
    .line 339
    iput v11, v4, Ltu;->b:I

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_6
    const/4 v6, 0x6

    .line 343
    iput v6, v4, Ltu;->b:I

    .line 344
    .line 345
    goto :goto_4

    .line 346
    :cond_7
    const/4 v6, 0x5

    .line 347
    iput v6, v4, Ltu;->b:I

    .line 348
    .line 349
    :goto_4
    iput-object v4, v3, Lnr3;->g:Ljava/lang/Object;

    .line 350
    .line 351
    iget-boolean v3, v0, Lmr3;->d:Z

    .line 352
    .line 353
    if-eqz v3, :cond_8

    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_8
    iget-object v0, v0, Lmr3;->b:Llr3;

    .line 357
    .line 358
    iget-object v0, v0, Llr3;->a:[Ltu;

    .line 359
    .line 360
    aget-object v0, v0, v9

    .line 361
    .line 362
    iget-object v3, v0, Ltu;->c:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast v3, [F

    .line 365
    .line 366
    array-length v4, v3

    .line 367
    array-length v4, v3

    .line 368
    mul-int/2addr v4, v11

    .line 369
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    invoke-virtual {v4, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-virtual {v4, v3}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    invoke-virtual {v3}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    check-cast v3, Ljava/nio/FloatBuffer;

    .line 394
    .line 395
    iget-object v0, v0, Ltu;->d:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, [F

    .line 398
    .line 399
    array-length v3, v0

    .line 400
    mul-int/2addr v3, v11

    .line 401
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v3, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    check-cast v0, Ljava/nio/FloatBuffer;

    .line 426
    .line 427
    goto :goto_5

    .line 428
    :catchall_0
    move-exception v0

    .line 429
    :try_start_4
    monitor-exit v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 430
    throw v0

    .line 431
    :cond_9
    :goto_5
    iget-object v3, v2, Lz54;->u:[F

    .line 432
    .line 433
    iget-object v7, v2, Lz54;->t:[F

    .line 434
    .line 435
    const/4 v8, 0x0

    .line 436
    const/4 v4, 0x0

    .line 437
    const/4 v6, 0x0

    .line 438
    invoke-static/range {v3 .. v8}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 439
    .line 440
    .line 441
    iget-object v3, v2, Lz54;->p:Lnr3;

    .line 442
    .line 443
    iget v0, v2, Lz54;->v:I

    .line 444
    .line 445
    iget-object v2, v2, Lz54;->u:[F

    .line 446
    .line 447
    const-string v4, "ProjectionRenderer"

    .line 448
    .line 449
    iget-object v5, v3, Lnr3;->g:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v5, Ltu;

    .line 452
    .line 453
    if-nez v5, :cond_a

    .line 454
    .line 455
    goto/16 :goto_a

    .line 456
    .line 457
    :cond_a
    iget v6, v3, Lnr3;->a:I

    .line 458
    .line 459
    if-ne v6, v1, :cond_b

    .line 460
    .line 461
    sget-object v6, Lnr3;->j:[F

    .line 462
    .line 463
    goto :goto_6

    .line 464
    :cond_b
    if-ne v6, v10, :cond_c

    .line 465
    .line 466
    sget-object v6, Lnr3;->k:[F

    .line 467
    .line 468
    goto :goto_6

    .line 469
    :cond_c
    sget-object v6, Lnr3;->i:[F

    .line 470
    .line 471
    :goto_6
    iget v7, v3, Lnr3;->c:I

    .line 472
    .line 473
    invoke-static {v7, v1, v9, v6, v9}, Landroid/opengl/GLES20;->glUniformMatrix3fv(IIZ[FI)V

    .line 474
    .line 475
    .line 476
    iget v6, v3, Lnr3;->b:I

    .line 477
    .line 478
    invoke-static {v6, v1, v9, v2, v9}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 479
    .line 480
    .line 481
    const v1, 0x84c0

    .line 482
    .line 483
    .line 484
    invoke-static {v1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 485
    .line 486
    .line 487
    const v1, 0x8d65

    .line 488
    .line 489
    .line 490
    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 491
    .line 492
    .line 493
    iget v0, v3, Lnr3;->f:I

    .line 494
    .line 495
    invoke-static {v0, v9}, Landroid/opengl/GLES20;->glUniform1i(II)V

    .line 496
    .line 497
    .line 498
    :try_start_5
    invoke-static {}, Lj51;->l()V
    :try_end_5
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_5 .. :try_end_5} :catch_2

    .line 499
    .line 500
    .line 501
    goto :goto_7

    .line 502
    :catch_2
    move-exception v0

    .line 503
    const-string v1, "Failed to bind uniforms"

    .line 504
    .line 505
    invoke-static {v4, v1, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 506
    .line 507
    .line 508
    :goto_7
    iget v10, v3, Lnr3;->d:I

    .line 509
    .line 510
    iget-object v0, v5, Ltu;->c:Ljava/lang/Object;

    .line 511
    .line 512
    move-object v15, v0

    .line 513
    check-cast v15, Ljava/nio/FloatBuffer;

    .line 514
    .line 515
    const/4 v11, 0x3

    .line 516
    const/16 v12, 0x1406

    .line 517
    .line 518
    const/4 v13, 0x0

    .line 519
    const/16 v14, 0xc

    .line 520
    .line 521
    invoke-static/range {v10 .. v15}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 522
    .line 523
    .line 524
    :try_start_6
    invoke-static {}, Lj51;->l()V
    :try_end_6
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_6 .. :try_end_6} :catch_3

    .line 525
    .line 526
    .line 527
    goto :goto_8

    .line 528
    :catch_3
    move-exception v0

    .line 529
    const-string v1, "Failed to load position data"

    .line 530
    .line 531
    invoke-static {v4, v1, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 532
    .line 533
    .line 534
    :goto_8
    iget v10, v3, Lnr3;->e:I

    .line 535
    .line 536
    iget-object v0, v5, Ltu;->d:Ljava/lang/Object;

    .line 537
    .line 538
    move-object v15, v0

    .line 539
    check-cast v15, Ljava/nio/FloatBuffer;

    .line 540
    .line 541
    const/4 v11, 0x2

    .line 542
    const/16 v12, 0x1406

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const/16 v14, 0x8

    .line 546
    .line 547
    invoke-static/range {v10 .. v15}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    .line 548
    .line 549
    .line 550
    :try_start_7
    invoke-static {}, Lj51;->l()V
    :try_end_7
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_7 .. :try_end_7} :catch_4

    .line 551
    .line 552
    .line 553
    goto :goto_9

    .line 554
    :catch_4
    move-exception v0

    .line 555
    const-string v1, "Failed to load texture data"

    .line 556
    .line 557
    invoke-static {v4, v1, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 558
    .line 559
    .line 560
    :goto_9
    iget v0, v5, Ltu;->b:I

    .line 561
    .line 562
    iget v1, v5, Ltu;->a:I

    .line 563
    .line 564
    invoke-static {v0, v9, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 565
    .line 566
    .line 567
    :try_start_8
    invoke-static {}, Lj51;->l()V
    :try_end_8
    .catch Landroidx/media3/common/util/GlUtil$GlException; {:try_start_8 .. :try_end_8} :catch_5

    .line 568
    .line 569
    .line 570
    goto :goto_a

    .line 571
    :catch_5
    move-exception v0

    .line 572
    const-string v1, "Failed to render"

    .line 573
    .line 574
    invoke-static {v4, v1, v0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 575
    .line 576
    .line 577
    :goto_a
    return-void

    .line 578
    :catchall_1
    move-exception v0

    .line 579
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 580
    throw v0
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 6

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 3
    .line 4
    .line 5
    int-to-float p1, p2

    .line 6
    int-to-float p2, p3

    .line 7
    div-float v3, p1, p2

    .line 8
    .line 9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpl-float p1, v3, p1

    .line 12
    .line 13
    if-lez p1, :cond_0

    .line 14
    .line 15
    const-wide p1, 0x4046800000000000L    # 45.0

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-static {p1, p2}, Ljava/lang/Math;->tan(D)D

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    float-to-double v0, v3

    .line 29
    div-double/2addr p1, v0

    .line 30
    invoke-static {p1, p2}, Ljava/lang/Math;->atan(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 39
    .line 40
    mul-double/2addr p1, v0

    .line 41
    double-to-float p1, p1

    .line 42
    :goto_0
    move v2, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/high16 p1, 0x42b40000    # 90.0f

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :goto_1
    const v4, 0x3dcccccd    # 0.1f

    .line 48
    .line 49
    .line 50
    const/high16 v5, 0x42c80000    # 100.0f

    .line 51
    .line 52
    iget-object v0, p0, Lrj4;->o:[F

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final declared-synchronized onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p1, p0, Lrj4;->x:Lsj4;

    .line 3
    .line 4
    iget-object p2, p0, Lrj4;->n:Lz54;

    .line 5
    .line 6
    invoke-virtual {p2}, Lz54;->c()Landroid/graphics/SurfaceTexture;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    iget-object v0, p1, Lsj4;->r:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, Lur2;

    .line 13
    .line 14
    const/16 v2, 0x16

    .line 15
    .line 16
    invoke-direct {v1, v2, p1, p2}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p1
.end method
