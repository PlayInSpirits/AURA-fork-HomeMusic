.class public final La80;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ScrollCaptureCallback;


# instance fields
.field public final a:Li94;

.field public final b:Lk02;

.field public final c:Lrm2;

.field public final d:Lra;

.field public final e:Ltd0;

.field public final f:Lsy3;


# direct methods
.method public constructor <init>(Li94;Lk02;Ltd0;Lrm2;Lra;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La80;->a:Li94;

    .line 5
    .line 6
    iput-object p2, p0, La80;->b:Lk02;

    .line 7
    .line 8
    iput-object p4, p0, La80;->c:Lrm2;

    .line 9
    .line 10
    iput-object p5, p0, La80;->d:Lra;

    .line 11
    .line 12
    new-instance p1, Ltd0;

    .line 13
    .line 14
    iget-object p3, p3, Ltd0;->n:Lne0;

    .line 15
    .line 16
    sget-object p4, Lsq0;->o:Lsq0;

    .line 17
    .line 18
    invoke-interface {p3, p4}, Lne0;->J(Lne0;)Lne0;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-direct {p1, p3}, Ltd0;-><init>(Lne0;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La80;->e:Ltd0;

    .line 26
    .line 27
    new-instance p1, Lsy3;

    .line 28
    .line 29
    iget p3, p2, Lk02;->d:I

    .line 30
    .line 31
    iget p2, p2, Lk02;->b:I

    .line 32
    .line 33
    sub-int/2addr p3, p2

    .line 34
    new-instance p2, Lz70;

    .line 35
    .line 36
    const/4 p4, 0x0

    .line 37
    invoke-direct {p2, p0, p4}, Lz70;-><init>(La80;Lvd0;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p3, p2}, Lsy3;-><init>(ILz70;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La80;->f:Lsy3;

    .line 44
    .line 45
    return-void
.end method

.method public static final a(La80;Landroid/view/ScrollCaptureSession;Lk02;Lwd0;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Ly70;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Ly70;

    .line 7
    .line 8
    iget v1, v0, Ly70;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ly70;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly70;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Ly70;-><init>(La80;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Ly70;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ly70;->t:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x2

    .line 32
    sget-object v5, Lxe0;->n:Lxe0;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v4, :cond_1

    .line 39
    .line 40
    iget p1, v0, Ly70;->q:I

    .line 41
    .line 42
    iget p2, v0, Ly70;->p:I

    .line 43
    .line 44
    iget-object v1, v0, Ly70;->o:Lk02;

    .line 45
    .line 46
    iget-object v0, v0, Ly70;->n:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v0}, Ldb;->h(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :cond_2
    iget p1, v0, Ly70;->q:I

    .line 64
    .line 65
    iget p2, v0, Ly70;->p:I

    .line 66
    .line 67
    iget-object v1, v0, Ly70;->o:Lk02;

    .line 68
    .line 69
    iget-object v2, v0, Ly70;->n:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {v2}, Ldb;->h(Ljava/lang/Object;)Landroid/view/ScrollCaptureSession;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move p3, p2

    .line 79
    move-object p2, v1

    .line 80
    move v1, p1

    .line 81
    move-object p1, v2

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-static {p3}, Lkb4;->X(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget p3, p2, Lk02;->b:I

    .line 87
    .line 88
    iget v1, p2, Lk02;->d:I

    .line 89
    .line 90
    iget-object v6, p0, La80;->f:Lsy3;

    .line 91
    .line 92
    iput-object p1, v0, Ly70;->n:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, Ly70;->o:Lk02;

    .line 95
    .line 96
    iput p3, v0, Ly70;->p:I

    .line 97
    .line 98
    iput v1, v0, Ly70;->q:I

    .line 99
    .line 100
    iput v3, v0, Ly70;->t:I

    .line 101
    .line 102
    if-gt p3, v1, :cond_a

    .line 103
    .line 104
    sub-int v3, v1, p3

    .line 105
    .line 106
    iget v7, v6, Lsy3;->a:I

    .line 107
    .line 108
    if-gt v3, v7, :cond_9

    .line 109
    .line 110
    div-int/2addr v3, v4

    .line 111
    add-int/2addr v3, p3

    .line 112
    div-int/2addr v7, v4

    .line 113
    sub-int/2addr v3, v7

    .line 114
    int-to-float v2, v3

    .line 115
    iget v3, v6, Lsy3;->c:F

    .line 116
    .line 117
    sub-float/2addr v2, v3

    .line 118
    invoke-virtual {v6, v2, v0}, Lsy3;->a(FLwd0;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v3, Lj15;->a:Lj15;

    .line 123
    .line 124
    if-ne v2, v5, :cond_4

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    move-object v2, v3

    .line 128
    :goto_1
    if-ne v2, v5, :cond_5

    .line 129
    .line 130
    move-object v3, v2

    .line 131
    :cond_5
    if-ne v3, v5, :cond_6

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    :goto_2
    new-instance v2, Lk52;

    .line 135
    .line 136
    const/16 v3, 0xf

    .line 137
    .line 138
    invoke-direct {v2, v3}, Lk52;-><init>(I)V

    .line 139
    .line 140
    .line 141
    iput-object p1, v0, Ly70;->n:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object p2, v0, Ly70;->o:Lk02;

    .line 144
    .line 145
    iput p3, v0, Ly70;->p:I

    .line 146
    .line 147
    iput v1, v0, Ly70;->q:I

    .line 148
    .line 149
    iput v4, v0, Ly70;->t:I

    .line 150
    .line 151
    invoke-interface {v0}, Lvd0;->getContext()Lne0;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v3}, Lvr1;->x(Lne0;)Led;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-virtual {v3, v2, v0}, Led;->a(Lif1;Lwd0;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-ne v0, v5, :cond_7

    .line 164
    .line 165
    :goto_3
    return-object v5

    .line 166
    :cond_7
    move-object v0, p1

    .line 167
    move p1, v1

    .line 168
    move-object v1, p2

    .line 169
    move p2, p3

    .line 170
    :goto_4
    iget-object p3, p0, La80;->f:Lsy3;

    .line 171
    .line 172
    iget v2, p3, Lsy3;->c:F

    .line 173
    .line 174
    invoke-static {v2}, Lji2;->L(F)I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    sub-int/2addr p2, v2

    .line 179
    iget p3, p3, Lsy3;->a:I

    .line 180
    .line 181
    const/4 v2, 0x0

    .line 182
    invoke-static {p2, v2, p3}, Lgb;->m(III)I

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    iget-object p3, p0, La80;->f:Lsy3;

    .line 187
    .line 188
    iget v3, p3, Lsy3;->c:F

    .line 189
    .line 190
    invoke-static {v3}, Lji2;->L(F)I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    sub-int/2addr p1, v3

    .line 195
    iget p3, p3, Lsy3;->a:I

    .line 196
    .line 197
    invoke-static {p1, v2, p3}, Lgb;->m(III)I

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    iget p3, v1, Lk02;->a:I

    .line 202
    .line 203
    iget v1, v1, Lk02;->c:I

    .line 204
    .line 205
    if-ne p2, p1, :cond_8

    .line 206
    .line 207
    sget-object p0, Lk02;->e:Lk02;

    .line 208
    .line 209
    return-object p0

    .line 210
    :cond_8
    invoke-static {v0}, Ldb;->i(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v2}, Landroid/view/Surface;->lockHardwareCanvas()Landroid/graphics/Canvas;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    :try_start_0
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 219
    .line 220
    .line 221
    int-to-float v3, p3

    .line 222
    neg-float v3, v3

    .line 223
    int-to-float v4, p2

    .line 224
    neg-float v4, v4

    .line 225
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 226
    .line 227
    .line 228
    iget-object v3, p0, La80;->b:Lk02;

    .line 229
    .line 230
    iget v4, v3, Lk02;->a:I

    .line 231
    .line 232
    int-to-float v4, v4

    .line 233
    neg-float v4, v4

    .line 234
    iget v3, v3, Lk02;->b:I

    .line 235
    .line 236
    int-to-float v3, v3

    .line 237
    neg-float v3, v3

    .line 238
    invoke-virtual {v2, v4, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 239
    .line 240
    .line 241
    iget-object v3, p0, La80;->d:Lra;

    .line 242
    .line 243
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-virtual {v3, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 248
    .line 249
    .line 250
    invoke-static {v0}, Ldb;->C(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 255
    .line 256
    .line 257
    iget-object p0, p0, La80;->f:Lsy3;

    .line 258
    .line 259
    iget p0, p0, Lsy3;->c:F

    .line 260
    .line 261
    invoke-static {p0}, Lji2;->L(F)I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    new-instance v0, Lk02;

    .line 266
    .line 267
    add-int/2addr p2, p0

    .line 268
    add-int/2addr p1, p0

    .line 269
    invoke-direct {v0, p3, p2, v1, p1}, Lk02;-><init>(IIII)V

    .line 270
    .line 271
    .line 272
    return-object v0

    .line 273
    :catchall_0
    move-exception p0

    .line 274
    invoke-static {v0}, Ldb;->C(Landroid/view/ScrollCaptureSession;)Landroid/view/Surface;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-virtual {p1, v2}, Landroid/view/Surface;->unlockCanvasAndPost(Landroid/graphics/Canvas;)V

    .line 279
    .line 280
    .line 281
    throw p0

    .line 282
    :cond_9
    const-string p0, "Expected range ("

    .line 283
    .line 284
    const-string p1, ") to be \u2264 viewportSize="

    .line 285
    .line 286
    invoke-static {v3, v7, p0, p1}, Lxa3;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    return-object v2

    .line 294
    :cond_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    new-instance p0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    const-string p1, "Expected min="

    .line 300
    .line 301
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string p1, " \u2264 max="

    .line 308
    .line 309
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 320
    .line 321
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    throw p1
.end method


# virtual methods
.method public final onScrollCaptureEnd(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    sget-object v0, Lj63;->o:Lj63;

    .line 2
    .line 3
    new-instance v1, Lp;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v1, p0, p1, v3, v2}, Lp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    iget-object p0, p0, La80;->e:Ltd0;

    .line 12
    .line 13
    invoke-static {p0, v0, v3, v1, p1}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onScrollCaptureImageRequest(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V
    .locals 7

    .line 1
    new-instance v0, Lx70;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    invoke-direct/range {v0 .. v6}, Lx70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvd0;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    const/4 p1, 0x3

    .line 14
    iget-object p3, v1, La80;->e:Ltd0;

    .line 15
    .line 16
    invoke-static {p3, p0, p0, v0, p1}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Lx;

    .line 21
    .line 22
    const/4 p3, 0x7

    .line 23
    invoke-direct {p1, p3, p2}, Lx;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, La32;->M(Lif1;)Las0;

    .line 27
    .line 28
    .line 29
    new-instance p1, Lb80;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lb80;-><init>(Lsk4;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, La80;->b:Lk02;

    .line 2
    .line 3
    invoke-static {p0}, Luo;->U(Lk02;)Landroid/graphics/Rect;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p2, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onScrollCaptureStart(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p1, p0, La80;->f:Lsy3;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput p2, p1, Lsy3;->c:F

    .line 5
    .line 6
    iget-object p0, p0, La80;->c:Lrm2;

    .line 7
    .line 8
    iget-object p0, p0, Lrm2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lzd3;

    .line 11
    .line 12
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lzd3;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 18
    .line 19
    .line 20
    return-void
.end method
