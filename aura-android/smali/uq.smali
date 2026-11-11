.class public abstract Luq;
.super Landroid/view/View;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:Z

.field public B:Landroid/animation/ValueAnimator;

.field public C:Landroid/animation/ValueAnimator;

.field public final D:I

.field public final E:I

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:I

.field public final K:I

.field public L:I

.field public M:I

.field public N:I

.field public O:I

.field public P:I

.field public Q:I

.field public final R:I

.field public S:F

.field public T:Landroid/view/MotionEvent;

.field public U:Lp42;

.field public V:Z

.field public W:F

.field public a0:F

.field public b0:Ljava/util/ArrayList;

.field public c0:I

.field public d0:I

.field public e0:F

.field public f0:[F

.field public g0:Z

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:Z

.field public l0:Z

.field public m0:Landroid/content/res/ColorStateList;

.field public final n:Landroid/graphics/Paint;

.field public n0:Landroid/content/res/ColorStateList;

.field public final o:Landroid/graphics/Paint;

.field public o0:Landroid/content/res/ColorStateList;

.field public final p:Landroid/graphics/Paint;

.field public p0:Landroid/content/res/ColorStateList;

.field public final q:Landroid/graphics/Paint;

.field public q0:Landroid/content/res/ColorStateList;

.field public final r:Landroid/graphics/Paint;

.field public final r0:Lfi2;

.field public final s:Landroid/graphics/Paint;

.field public s0:Landroid/graphics/drawable/Drawable;

.field public final t:Lsq;

.field public t0:Ljava/util/List;

.field public final u:Landroid/view/accessibility/AccessibilityManager;

.field public u0:F

.field public v:Lrq;

.field public v0:I

.field public final w:I

.field public final x:Ljava/util/ArrayList;

.field public final y:Ljava/util/ArrayList;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    const v0, 0x7f1404c0

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2, p3, v0}, Lsu3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Luq;->x:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Luq;->y:Ljava/util/ArrayList;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Luq;->z:Ljava/util/ArrayList;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Luq;->A:Z

    .line 34
    .line 35
    iput-boolean p1, p0, Luq;->V:Z

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 43
    .line 44
    const/4 v0, -0x1

    .line 45
    iput v0, p0, Luq;->c0:I

    .line 46
    .line 47
    iput v0, p0, Luq;->d0:I

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput v0, p0, Luq;->e0:F

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    iput-boolean v1, p0, Luq;->g0:Z

    .line 54
    .line 55
    iput-boolean p1, p0, Luq;->k0:Z

    .line 56
    .line 57
    new-instance v2, Lfi2;

    .line 58
    .line 59
    invoke-direct {v2}, Lfi2;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Luq;->r0:Lfi2;

    .line 63
    .line 64
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 65
    .line 66
    iput-object v3, p0, Luq;->t0:Ljava/util/List;

    .line 67
    .line 68
    iput p1, p0, Luq;->v0:I

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v3, Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v3, p0, Luq;->n:Landroid/graphics/Paint;

    .line 80
    .line 81
    sget-object v5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 82
    .line 83
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 84
    .line 85
    .line 86
    sget-object v6, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 87
    .line 88
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Landroid/graphics/Paint;

    .line 92
    .line 93
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v3, p0, Luq;->o:Landroid/graphics/Paint;

    .line 97
    .line 98
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 102
    .line 103
    .line 104
    new-instance v3, Landroid/graphics/Paint;

    .line 105
    .line 106
    invoke-direct {v3, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object v3, p0, Luq;->p:Landroid/graphics/Paint;

    .line 110
    .line 111
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 112
    .line 113
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 114
    .line 115
    .line 116
    new-instance v8, Landroid/graphics/PorterDuffXfermode;

    .line 117
    .line 118
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 119
    .line 120
    invoke-direct {v8, v9}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v8}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 124
    .line 125
    .line 126
    new-instance v3, Landroid/graphics/Paint;

    .line 127
    .line 128
    invoke-direct {v3, v1}, Landroid/graphics/Paint;-><init>(I)V

    .line 129
    .line 130
    .line 131
    iput-object v3, p0, Luq;->q:Landroid/graphics/Paint;

    .line 132
    .line 133
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 134
    .line 135
    .line 136
    new-instance v3, Landroid/graphics/Paint;

    .line 137
    .line 138
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 139
    .line 140
    .line 141
    iput-object v3, p0, Luq;->r:Landroid/graphics/Paint;

    .line 142
    .line 143
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 147
    .line 148
    .line 149
    new-instance v3, Landroid/graphics/Paint;

    .line 150
    .line 151
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object v3, p0, Luq;->s:Landroid/graphics/Paint;

    .line 155
    .line 156
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const v5, 0x7f0705c1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    iput v5, p0, Luq;->K:I

    .line 174
    .line 175
    const v5, 0x7f0705c0

    .line 176
    .line 177
    .line 178
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    iput v5, p0, Luq;->E:I

    .line 183
    .line 184
    iput v5, p0, Luq;->O:I

    .line 185
    .line 186
    const v5, 0x7f0705bd

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    iput v5, p0, Luq;->F:I

    .line 194
    .line 195
    const v5, 0x7f0705bf

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    iput v5, p0, Luq;->G:I

    .line 203
    .line 204
    const v5, 0x7f0705be

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    iput v6, p0, Luq;->H:I

    .line 212
    .line 213
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    iput v5, p0, Luq;->I:I

    .line 218
    .line 219
    const v5, 0x7f0705b9

    .line 220
    .line 221
    .line 222
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    iput v3, p0, Luq;->R:I

    .line 227
    .line 228
    new-array v9, p1, [I

    .line 229
    .line 230
    const v8, 0x7f1404c0

    .line 231
    .line 232
    .line 233
    invoke-static {v4, p2, p3, v8}, Luc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 234
    .line 235
    .line 236
    sget-object v6, Lht3;->S:[I

    .line 237
    .line 238
    move-object v5, p2

    .line 239
    move v7, p3

    .line 240
    invoke-static/range {v4 .. v9}, Luc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    const/16 p3, 0x8

    .line 248
    .line 249
    const v3, 0x7f1404e2

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 253
    .line 254
    .line 255
    move-result p3

    .line 256
    iput p3, p0, Luq;->w:I

    .line 257
    .line 258
    const/4 p3, 0x3

    .line 259
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 260
    .line 261
    .line 262
    move-result p3

    .line 263
    iput p3, p0, Luq;->W:F

    .line 264
    .line 265
    const/4 p3, 0x4

    .line 266
    const/high16 v3, 0x3f800000    # 1.0f

    .line 267
    .line 268
    invoke-virtual {p2, p3, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 269
    .line 270
    .line 271
    move-result p3

    .line 272
    iput p3, p0, Luq;->a0:F

    .line 273
    .line 274
    iget p3, p0, Luq;->W:F

    .line 275
    .line 276
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 277
    .line 278
    .line 279
    move-result-object p3

    .line 280
    filled-new-array {p3}, [Ljava/lang/Float;

    .line 281
    .line 282
    .line 283
    move-result-object p3

    .line 284
    invoke-virtual {p0, p3}, Luq;->setValues([Ljava/lang/Float;)V

    .line 285
    .line 286
    .line 287
    const/4 p3, 0x2

    .line 288
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 289
    .line 290
    .line 291
    move-result p3

    .line 292
    iput p3, p0, Luq;->e0:F

    .line 293
    .line 294
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 295
    .line 296
    .line 297
    move-result-object p3

    .line 298
    const/16 v3, 0x30

    .line 299
    .line 300
    invoke-static {p3, v3}, Lvr1;->l(Landroid/content/Context;I)F

    .line 301
    .line 302
    .line 303
    move-result p3

    .line 304
    float-to-double v5, p3

    .line 305
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 306
    .line 307
    .line 308
    move-result-wide v5

    .line 309
    double-to-float p3, v5

    .line 310
    const/16 v3, 0x9

    .line 311
    .line 312
    invoke-virtual {p2, v3, p3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 313
    .line 314
    .line 315
    move-result p3

    .line 316
    float-to-double v5, p3

    .line 317
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 318
    .line 319
    .line 320
    move-result-wide v5

    .line 321
    double-to-int p3, v5

    .line 322
    iput p3, p0, Luq;->J:I

    .line 323
    .line 324
    const/16 p3, 0x15

    .line 325
    .line 326
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-eqz v3, :cond_0

    .line 331
    .line 332
    move v5, p3

    .line 333
    goto :goto_0

    .line 334
    :cond_0
    const/16 v5, 0x17

    .line 335
    .line 336
    :goto_0
    if-eqz v3, :cond_1

    .line 337
    .line 338
    goto :goto_1

    .line 339
    :cond_1
    const/16 p3, 0x16

    .line 340
    .line 341
    :goto_1
    invoke-static {v4, p2, v5}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    if-eqz v3, :cond_2

    .line 346
    .line 347
    goto :goto_2

    .line 348
    :cond_2
    const v3, 0x7f0602b1

    .line 349
    .line 350
    .line 351
    invoke-static {v4, v3}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    :goto_2
    invoke-virtual {p0, v3}, Luq;->setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v4, p2, p3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 359
    .line 360
    .line 361
    move-result-object p3

    .line 362
    if-eqz p3, :cond_3

    .line 363
    .line 364
    goto :goto_3

    .line 365
    :cond_3
    const p3, 0x7f0602ae

    .line 366
    .line 367
    .line 368
    invoke-static {v4, p3}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 369
    .line 370
    .line 371
    move-result-object p3

    .line 372
    :goto_3
    invoke-virtual {p0, p3}, Luq;->setTrackActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 373
    .line 374
    .line 375
    const/16 p3, 0xa

    .line 376
    .line 377
    invoke-static {v4, p2, p3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 378
    .line 379
    .line 380
    move-result-object p3

    .line 381
    invoke-virtual {v2, p3}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 382
    .line 383
    .line 384
    const/16 p3, 0xd

    .line 385
    .line 386
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-eqz v3, :cond_4

    .line 391
    .line 392
    invoke-static {v4, p2, p3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 393
    .line 394
    .line 395
    move-result-object p3

    .line 396
    invoke-virtual {p0, p3}, Luq;->setThumbStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 397
    .line 398
    .line 399
    :cond_4
    const/16 p3, 0xe

    .line 400
    .line 401
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 402
    .line 403
    .line 404
    move-result p3

    .line 405
    invoke-virtual {p0, p3}, Luq;->setThumbStrokeWidth(F)V

    .line 406
    .line 407
    .line 408
    const/4 p3, 0x5

    .line 409
    invoke-static {v4, p2, p3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 410
    .line 411
    .line 412
    move-result-object p3

    .line 413
    if-eqz p3, :cond_5

    .line 414
    .line 415
    goto :goto_4

    .line 416
    :cond_5
    const p3, 0x7f0602af

    .line 417
    .line 418
    .line 419
    invoke-static {v4, p3}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 420
    .line 421
    .line 422
    move-result-object p3

    .line 423
    :goto_4
    invoke-virtual {p0, p3}, Luq;->setHaloTintList(Landroid/content/res/ColorStateList;)V

    .line 424
    .line 425
    .line 426
    const/16 p3, 0x14

    .line 427
    .line 428
    invoke-virtual {p2, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 429
    .line 430
    .line 431
    move-result p3

    .line 432
    iput-boolean p3, p0, Luq;->g0:Z

    .line 433
    .line 434
    const/16 p3, 0xf

    .line 435
    .line 436
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_6

    .line 441
    .line 442
    move v5, p3

    .line 443
    goto :goto_5

    .line 444
    :cond_6
    const/16 v5, 0x11

    .line 445
    .line 446
    :goto_5
    if-eqz v3, :cond_7

    .line 447
    .line 448
    goto :goto_6

    .line 449
    :cond_7
    const/16 p3, 0x10

    .line 450
    .line 451
    :goto_6
    invoke-static {v4, p2, v5}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    if-eqz v3, :cond_8

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_8
    const v3, 0x7f0602b0

    .line 459
    .line 460
    .line 461
    invoke-static {v4, v3}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    :goto_7
    invoke-virtual {p0, v3}, Luq;->setTickInactiveTintList(Landroid/content/res/ColorStateList;)V

    .line 466
    .line 467
    .line 468
    invoke-static {v4, p2, p3}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 469
    .line 470
    .line 471
    move-result-object p3

    .line 472
    if-eqz p3, :cond_9

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_9
    const p3, 0x7f0602ad

    .line 476
    .line 477
    .line 478
    invoke-static {v4, p3}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 479
    .line 480
    .line 481
    move-result-object p3

    .line 482
    :goto_8
    invoke-virtual {p0, p3}, Luq;->setTickActiveTintList(Landroid/content/res/ColorStateList;)V

    .line 483
    .line 484
    .line 485
    const/16 p3, 0xc

    .line 486
    .line 487
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 488
    .line 489
    .line 490
    move-result p3

    .line 491
    invoke-virtual {p0, p3}, Luq;->setThumbRadius(I)V

    .line 492
    .line 493
    .line 494
    const/4 p3, 0x6

    .line 495
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 496
    .line 497
    .line 498
    move-result p3

    .line 499
    invoke-virtual {p0, p3}, Luq;->setHaloRadius(I)V

    .line 500
    .line 501
    .line 502
    const/16 p3, 0xb

    .line 503
    .line 504
    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 505
    .line 506
    .line 507
    move-result p3

    .line 508
    invoke-virtual {p0, p3}, Luq;->setThumbElevation(F)V

    .line 509
    .line 510
    .line 511
    const/16 p3, 0x18

    .line 512
    .line 513
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 514
    .line 515
    .line 516
    move-result p3

    .line 517
    invoke-virtual {p0, p3}, Luq;->setTrackHeight(I)V

    .line 518
    .line 519
    .line 520
    const/16 p3, 0x12

    .line 521
    .line 522
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 523
    .line 524
    .line 525
    move-result p3

    .line 526
    invoke-virtual {p0, p3}, Luq;->setTickActiveRadius(I)V

    .line 527
    .line 528
    .line 529
    const/16 p3, 0x13

    .line 530
    .line 531
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 532
    .line 533
    .line 534
    move-result p3

    .line 535
    invoke-virtual {p0, p3}, Luq;->setTickInactiveRadius(I)V

    .line 536
    .line 537
    .line 538
    const/4 p3, 0x7

    .line 539
    invoke-virtual {p2, p3, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 540
    .line 541
    .line 542
    move-result p3

    .line 543
    invoke-virtual {p0, p3}, Luq;->setLabelBehavior(I)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 547
    .line 548
    .line 549
    move-result p3

    .line 550
    if-nez p3, :cond_a

    .line 551
    .line 552
    invoke-virtual {p0, p1}, Luq;->setEnabled(Z)V

    .line 553
    .line 554
    .line 555
    :cond_a
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 556
    .line 557
    .line 558
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v2}, Lfi2;->p()V

    .line 565
    .line 566
    .line 567
    invoke-static {v4}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 572
    .line 573
    .line 574
    move-result p1

    .line 575
    iput p1, p0, Luq;->D:I

    .line 576
    .line 577
    new-instance p1, Lsq;

    .line 578
    .line 579
    move-object p2, p0

    .line 580
    check-cast p2, Lcom/google/android/material/slider/Slider;

    .line 581
    .line 582
    invoke-direct {p1, p2}, Lsq;-><init>(Lcom/google/android/material/slider/Slider;)V

    .line 583
    .line 584
    .line 585
    iput-object p1, p0, Luq;->t:Lsq;

    .line 586
    .line 587
    invoke-static {p0, p1}, Lj65;->o(Landroid/view/View;Lz2;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    const-string p2, "accessibility"

    .line 595
    .line 596
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 601
    .line 602
    iput-object p1, p0, Luq;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 603
    .line 604
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    iget p0, p0, Luq;->P:I

    .line 2
    .line 3
    mul-int/lit8 p0, p0, 0x2

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, -0x1

    .line 15
    if-ne v0, v3, :cond_0

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v2, v2, p0, p0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    int-to-float p0, p0

    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    int-to-float v3, v3

    .line 29
    div-float/2addr p0, v3

    .line 30
    int-to-float v0, v0

    .line 31
    mul-float/2addr v0, p0

    .line 32
    float-to-int v0, v0

    .line 33
    int-to-float v1, v1

    .line 34
    mul-float/2addr v1, p0

    .line 35
    float-to-int p0, v1

    .line 36
    invoke-virtual {p1, v2, v2, v0, p0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final b()I
    .locals 4

    .line 1
    iget v0, p0, Luq;->L:I

    .line 2
    .line 3
    div-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget v1, p0, Luq;->M:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Luq;->x:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lkv4;

    .line 21
    .line 22
    invoke-virtual {p0}, Lkv4;->getIntrinsicHeight()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    :cond_1
    add-int/2addr v0, v3

    .line 27
    return v0
.end method

.method public final c(Z)Landroid/animation/ValueAnimator;
    .locals 6

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Luq;->C:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    iget-object v3, p0, Luq;->B:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    :goto_1
    if-eqz v3, :cond_2

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Float;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->cancel()V

    .line 35
    .line 36
    .line 37
    :cond_2
    if-eqz p1, :cond_3

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v0, v1

    .line 41
    :goto_2
    const/4 v1, 0x2

    .line 42
    new-array v1, v1, [F

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    aput v2, v1, v3

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    aput v0, v1, v2

    .line 49
    .line 50
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const v1, 0x7f040395

    .line 61
    .line 62
    .line 63
    const/16 v2, 0x53

    .line 64
    .line 65
    invoke-static {p1, v1, v2}, Lg12;->N(Landroid/content/Context;II)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const v2, 0x7f04039f

    .line 74
    .line 75
    .line 76
    sget-object v4, Lyd;->e:Landroid/view/animation/DecelerateInterpolator;

    .line 77
    .line 78
    invoke-static {v1, v2, v4}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const v1, 0x7f040398

    .line 88
    .line 89
    .line 90
    const/16 v2, 0x75

    .line 91
    .line 92
    invoke-static {p1, v1, v2}, Lg12;->N(Landroid/content/Context;II)I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const v2, 0x7f04039d

    .line 101
    .line 102
    .line 103
    sget-object v4, Lyd;->c:La61;

    .line 104
    .line 105
    invoke-static {v1, v2, v4}, Lg12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    :goto_3
    int-to-long v4, p1

    .line 110
    invoke-virtual {v0, v4, v5}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 114
    .line 115
    .line 116
    new-instance p1, Lqq;

    .line 117
    .line 118
    invoke-direct {p1, v3, p0}, Lqq;-><init>(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 122
    .line 123
    .line 124
    return-object v0
.end method

.method public final d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Luq;->O:I

    .line 5
    .line 6
    invoke-virtual {p0, p4}, Luq;->n(F)F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-float p2, p2

    .line 11
    mul-float/2addr p0, p2

    .line 12
    float-to-int p0, p0

    .line 13
    add-int/2addr v0, p0

    .line 14
    int-to-float p0, v0

    .line 15
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-float p2, p2

    .line 24
    const/high16 p4, 0x40000000    # 2.0f

    .line 25
    .line 26
    div-float/2addr p2, p4

    .line 27
    sub-float/2addr p0, p2

    .line 28
    int-to-float p2, p3

    .line 29
    invoke-virtual {p5}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 34
    .line 35
    .line 36
    move-result p3

    .line 37
    int-to-float p3, p3

    .line 38
    div-float/2addr p3, p4

    .line 39
    sub-float/2addr p2, p3

    .line 40
    invoke-virtual {p1, p0, p2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p5, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Luq;->t:Lsq;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lz41;->m(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchHoverEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final drawableStateChanged()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Luq;->q0:Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Luq;->g(Landroid/content/res/ColorStateList;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, Luq;->n:Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Luq;->p0:Landroid/content/res/ColorStateList;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Luq;->g(Landroid/content/res/ColorStateList;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v1, p0, Luq;->o:Landroid/graphics/Paint;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Luq;->o0:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Luq;->g(Landroid/content/res/ColorStateList;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v1, p0, Luq;->r:Landroid/graphics/Paint;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Luq;->n0:Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Luq;->g(Landroid/content/res/ColorStateList;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-object v1, p0, Luq;->s:Landroid/graphics/Paint;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Luq;->x:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, 0x0

    .line 55
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    check-cast v3, Lkv4;

    .line 64
    .line 65
    invoke-virtual {v3}, Lfi2;->isStateful()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget-object v0, p0, Luq;->r0:Lfi2;

    .line 80
    .line 81
    invoke-virtual {v0}, Lfi2;->isStateful()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object v0, p0, Luq;->m0:Landroid/content/res/ColorStateList;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Luq;->g(Landroid/content/res/ColorStateList;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object p0, p0, Luq;->q:Landroid/graphics/Paint;

    .line 101
    .line 102
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 103
    .line 104
    .line 105
    const/16 v0, 0x3f

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final e(F)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Luq;->U:Lp42;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lp42;->a(F)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    float-to-int p0, p1

    .line 11
    int-to-float p0, p0

    .line 12
    cmpl-float p0, p0, p1

    .line 13
    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, "%.0f"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string p0, "%.2f"

    .line 20
    .line 21
    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final f()[F
    .locals 5

    .line 1
    invoke-virtual {p0}, Luq;->getValues()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0}, Luq;->getValues()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v1}, Ljava/util/Collections;->min(Ljava/util/Collection;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Float;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    iget-object v2, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const/4 v3, 0x1

    .line 36
    if-ne v2, v3, :cond_0

    .line 37
    .line 38
    iget v1, p0, Luq;->W:F

    .line 39
    .line 40
    :cond_0
    invoke-virtual {p0, v1}, Luq;->n(F)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p0, v0}, Luq;->n(F)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0}, Luq;->j()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v4, 0x2

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    new-array p0, v4, [F

    .line 57
    .line 58
    aput v0, p0, v2

    .line 59
    .line 60
    aput v1, p0, v3

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_1
    new-array p0, v4, [F

    .line 64
    .line 65
    aput v1, p0, v2

    .line 66
    .line 67
    aput v0, p0, v3

    .line 68
    .line 69
    return-object p0
.end method

.method public final g(Landroid/content/res/ColorStateList;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1, p0, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final getAccessibilityFocusedVirtualViewId()I
    .locals 0

    .line 1
    iget-object p0, p0, Luq;->t:Lsq;

    .line 2
    .line 3
    iget p0, p0, Lz41;->x:I

    .line 4
    .line 5
    return p0
.end method

.method public getMinSeparation()F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public getValues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object p0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final h(F)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/math/BigDecimal;

    .line 11
    .line 12
    iget p0, p0, Luq;->e0:F

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {p1, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Ljava/math/MathContext;->DECIMAL64:Ljava/math/MathContext;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p0}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    long-to-double v0, v0

    .line 36
    sub-double/2addr v0, p0

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    const-wide v0, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmpg-double p0, p0, v0

    .line 47
    .line 48
    if-gez p0, :cond_0

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_0
    const/4 p0, 0x0

    .line 53
    return p0
.end method

.method public final i(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    const/4 v1, 0x3

    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    move-object p1, p0

    .line 19
    check-cast p1, Landroid/view/ViewGroup;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Landroid/view/View;->canScrollVertically(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    invoke-virtual {p1, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    :cond_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->shouldDelayChildPressedState()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    return v1

    .line 42
    :cond_2
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    :goto_1
    return v0
.end method

.method public final j()Z
    .locals 1

    .line 1
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final k()V
    .locals 7

    .line 1
    iget v0, p0, Luq;->e0:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Luq;->w()V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Luq;->a0:F

    .line 13
    .line 14
    iget v1, p0, Luq;->W:F

    .line 15
    .line 16
    sub-float/2addr v0, v1

    .line 17
    iget v1, p0, Luq;->e0:F

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    const/high16 v1, 0x3f800000    # 1.0f

    .line 21
    .line 22
    add-float/2addr v0, v1

    .line 23
    float-to-int v0, v0

    .line 24
    iget v1, p0, Luq;->j0:I

    .line 25
    .line 26
    iget v2, p0, Luq;->N:I

    .line 27
    .line 28
    mul-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    div-int/2addr v1, v2

    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Luq;->f0:[F

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    array-length v1, v1

    .line 42
    mul-int/lit8 v2, v0, 0x2

    .line 43
    .line 44
    if-eq v1, v2, :cond_2

    .line 45
    .line 46
    :cond_1
    mul-int/lit8 v1, v0, 0x2

    .line 47
    .line 48
    new-array v1, v1, [F

    .line 49
    .line 50
    iput-object v1, p0, Luq;->f0:[F

    .line 51
    .line 52
    :cond_2
    iget v1, p0, Luq;->j0:I

    .line 53
    .line 54
    int-to-float v1, v1

    .line 55
    add-int/lit8 v2, v0, -0x1

    .line 56
    .line 57
    int-to-float v2, v2

    .line 58
    div-float/2addr v1, v2

    .line 59
    const/4 v2, 0x0

    .line 60
    :goto_0
    mul-int/lit8 v3, v0, 0x2

    .line 61
    .line 62
    if-ge v2, v3, :cond_3

    .line 63
    .line 64
    iget-object v3, p0, Luq;->f0:[F

    .line 65
    .line 66
    iget v4, p0, Luq;->O:I

    .line 67
    .line 68
    int-to-float v4, v4

    .line 69
    int-to-float v5, v2

    .line 70
    const/high16 v6, 0x40000000    # 2.0f

    .line 71
    .line 72
    div-float/2addr v5, v6

    .line 73
    mul-float/2addr v5, v1

    .line 74
    add-float/2addr v5, v4

    .line 75
    aput v5, v3, v2

    .line 76
    .line 77
    add-int/lit8 v4, v2, 0x1

    .line 78
    .line 79
    invoke-virtual {p0}, Luq;->b()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    int-to-float v5, v5

    .line 84
    aput v5, v3, v4

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    :goto_1
    return-void
.end method

.method public final l(I)Z
    .locals 8

    .line 1
    iget v0, p0, Luq;->d0:I

    .line 2
    .line 3
    int-to-long v1, v0

    .line 4
    int-to-long v3, p1

    .line 5
    add-long/2addr v1, v3

    .line 6
    iget-object p1, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v3, 0x1

    .line 13
    sub-int/2addr p1, v3

    .line 14
    int-to-long v4, p1

    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    cmp-long p1, v1, v6

    .line 18
    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    move-wide v1, v6

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    cmp-long p1, v1, v4

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    move-wide v1, v4

    .line 28
    :cond_1
    :goto_0
    long-to-int p1, v1

    .line 29
    iput p1, p0, Luq;->d0:I

    .line 30
    .line 31
    if-ne p1, v0, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_2
    iget v0, p0, Luq;->c0:I

    .line 36
    .line 37
    const/4 v1, -0x1

    .line 38
    if-eq v0, v1, :cond_3

    .line 39
    .line 40
    iput p1, p0, Luq;->c0:I

    .line 41
    .line 42
    :cond_3
    invoke-virtual {p0}, Luq;->u()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 46
    .line 47
    .line 48
    return v3
.end method

.method public final m(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Luq;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const p1, 0x7fffffff

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    neg-int p1, p1

    .line 16
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Luq;->l(I)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final n(F)F
    .locals 2

    .line 1
    iget v0, p0, Luq;->W:F

    .line 2
    .line 3
    sub-float/2addr p1, v0

    .line 4
    iget v1, p0, Luq;->a0:F

    .line 5
    .line 6
    sub-float/2addr v1, v0

    .line 7
    div-float/2addr p1, v1

    .line 8
    invoke-virtual {p0}, Luq;->j()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/high16 p0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    sub-float/2addr p0, p1

    .line 17
    return p0

    .line 18
    :cond_0
    return p1
.end method

.method public final o()V
    .locals 1

    .line 1
    iget-object p0, p0, Luq;->z:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {p0}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public final onAttachedToWindow()V
    .locals 7

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Luq;->x:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    add-int/lit8 v3, v3, 0x1

    .line 19
    .line 20
    check-cast v4, Lkv4;

    .line 21
    .line 22
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const/4 v6, 0x2

    .line 36
    new-array v6, v6, [I

    .line 37
    .line 38
    invoke-virtual {v5, v6}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 39
    .line 40
    .line 41
    aget v6, v6, v2

    .line 42
    .line 43
    iput v6, v4, Lkv4;->V:I

    .line 44
    .line 45
    iget-object v6, v4, Lkv4;->P:Landroid/graphics/Rect;

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v4, Lkv4;->O:Lot;

    .line 51
    .line 52
    invoke-virtual {v5, v4}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 6

    .line 1
    iget-object v0, p0, Luq;->v:Lrq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Luq;->A:Z

    .line 10
    .line 11
    iget-object v1, p0, Luq;->x:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    :cond_1
    :goto_0
    if-ge v0, v2, :cond_4

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    check-cast v3, Lkv4;

    .line 26
    .line 27
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    new-instance v5, Lc05;

    .line 36
    .line 37
    invoke-direct {v5, v4}, Lc05;-><init>(Landroid/view/ViewGroup;)V

    .line 38
    .line 39
    .line 40
    move-object v4, v5

    .line 41
    :goto_1
    if-eqz v4, :cond_1

    .line 42
    .line 43
    iget-object v4, v4, Lc05;->n:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Landroid/view/ViewOverlay;

    .line 46
    .line 47
    invoke-virtual {v4, v3}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-nez v4, :cond_3

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget-object v3, v3, Lkv4;->O:Lot;

    .line 61
    .line 62
    invoke-virtual {v4, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    .line 1
    iget-boolean v1, p0, Luq;->l0:Z

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Luq;->w()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Luq;->k()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Luq;->b()I

    .line 15
    .line 16
    .line 17
    move-result v7

    .line 18
    iget v1, p0, Luq;->j0:I

    .line 19
    .line 20
    invoke-virtual {p0}, Luq;->f()[F

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    iget v2, p0, Luq;->O:I

    .line 25
    .line 26
    int-to-float v3, v2

    .line 27
    const/4 v9, 0x1

    .line 28
    aget v4, v8, v9

    .line 29
    .line 30
    int-to-float v10, v1

    .line 31
    mul-float/2addr v4, v10

    .line 32
    add-float/2addr v4, v3

    .line 33
    add-int/2addr v2, v1

    .line 34
    int-to-float v1, v2

    .line 35
    cmpg-float v2, v4, v1

    .line 36
    .line 37
    iget-object v6, p0, Luq;->n:Landroid/graphics/Paint;

    .line 38
    .line 39
    if-gez v2, :cond_1

    .line 40
    .line 41
    int-to-float v3, v7

    .line 42
    move v5, v3

    .line 43
    move v2, v4

    .line 44
    move v4, v1

    .line 45
    move-object v1, p1

    .line 46
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    iget v1, p0, Luq;->O:I

    .line 50
    .line 51
    int-to-float v2, v1

    .line 52
    const/4 v11, 0x0

    .line 53
    aget v1, v8, v11

    .line 54
    .line 55
    mul-float/2addr v1, v10

    .line 56
    add-float v4, v1, v2

    .line 57
    .line 58
    cmpl-float v1, v4, v2

    .line 59
    .line 60
    if-lez v1, :cond_2

    .line 61
    .line 62
    int-to-float v3, v7

    .line 63
    move v5, v3

    .line 64
    move-object v1, p1

    .line 65
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p0}, Luq;->getValues()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Ljava/lang/Float;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iget v2, p0, Luq;->W:F

    .line 83
    .line 84
    cmpl-float v1, v1, v2

    .line 85
    .line 86
    if-lez v1, :cond_3

    .line 87
    .line 88
    iget v1, p0, Luq;->j0:I

    .line 89
    .line 90
    invoke-virtual {p0}, Luq;->f()[F

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget v3, p0, Luq;->O:I

    .line 95
    .line 96
    int-to-float v3, v3

    .line 97
    aget v4, v2, v9

    .line 98
    .line 99
    int-to-float v1, v1

    .line 100
    mul-float/2addr v4, v1

    .line 101
    add-float/2addr v4, v3

    .line 102
    aget v2, v2, v11

    .line 103
    .line 104
    mul-float/2addr v2, v1

    .line 105
    add-float/2addr v2, v3

    .line 106
    int-to-float v3, v7

    .line 107
    iget-object v6, p0, Luq;->o:Landroid/graphics/Paint;

    .line 108
    .line 109
    move v5, v3

    .line 110
    move-object v1, p1

    .line 111
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget-boolean v2, p0, Luq;->g0:Z

    .line 115
    .line 116
    const/4 v8, 0x2

    .line 117
    if-eqz v2, :cond_5

    .line 118
    .line 119
    iget v2, p0, Luq;->e0:F

    .line 120
    .line 121
    const/4 v3, 0x0

    .line 122
    cmpg-float v2, v2, v3

    .line 123
    .line 124
    if-gtz v2, :cond_4

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    invoke-virtual {p0}, Luq;->f()[F

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iget-object v3, p0, Luq;->f0:[F

    .line 132
    .line 133
    aget v4, v2, v11

    .line 134
    .line 135
    array-length v3, v3

    .line 136
    div-int/2addr v3, v8

    .line 137
    sub-int/2addr v3, v9

    .line 138
    int-to-float v3, v3

    .line 139
    mul-float/2addr v4, v3

    .line 140
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    iget-object v4, p0, Luq;->f0:[F

    .line 145
    .line 146
    aget v2, v2, v9

    .line 147
    .line 148
    array-length v4, v4

    .line 149
    div-int/2addr v4, v8

    .line 150
    sub-int/2addr v4, v9

    .line 151
    int-to-float v4, v4

    .line 152
    mul-float/2addr v2, v4

    .line 153
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    iget-object v4, p0, Luq;->f0:[F

    .line 158
    .line 159
    mul-int/2addr v3, v8

    .line 160
    iget-object v5, p0, Luq;->r:Landroid/graphics/Paint;

    .line 161
    .line 162
    invoke-virtual {p1, v4, v11, v3, v5}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, p0, Luq;->f0:[F

    .line 166
    .line 167
    mul-int/2addr v2, v8

    .line 168
    sub-int v6, v2, v3

    .line 169
    .line 170
    iget-object v10, p0, Luq;->s:Landroid/graphics/Paint;

    .line 171
    .line 172
    invoke-virtual {p1, v4, v3, v6, v10}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    .line 173
    .line 174
    .line 175
    iget-object v3, p0, Luq;->f0:[F

    .line 176
    .line 177
    array-length v4, v3

    .line 178
    sub-int/2addr v4, v2

    .line 179
    invoke-virtual {p1, v3, v2, v4, v5}, Landroid/graphics/Canvas;->drawPoints([FIILandroid/graphics/Paint;)V

    .line 180
    .line 181
    .line 182
    :cond_5
    :goto_0
    iget-boolean v2, p0, Luq;->V:Z

    .line 183
    .line 184
    if-nez v2, :cond_6

    .line 185
    .line 186
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_8

    .line 191
    .line 192
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-eqz v2, :cond_8

    .line 197
    .line 198
    iget v2, p0, Luq;->j0:I

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    instance-of v3, v3, Landroid/graphics/drawable/RippleDrawable;

    .line 205
    .line 206
    if-nez v3, :cond_8

    .line 207
    .line 208
    iget v3, p0, Luq;->O:I

    .line 209
    .line 210
    int-to-float v3, v3

    .line 211
    iget-object v4, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 212
    .line 213
    iget v5, p0, Luq;->d0:I

    .line 214
    .line 215
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Ljava/lang/Float;

    .line 220
    .line 221
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-virtual {p0, v4}, Luq;->n(F)F

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    int-to-float v2, v2

    .line 230
    mul-float/2addr v4, v2

    .line 231
    add-float/2addr v4, v3

    .line 232
    float-to-int v10, v4

    .line 233
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 234
    .line 235
    const/16 v3, 0x1c

    .line 236
    .line 237
    if-ge v2, v3, :cond_7

    .line 238
    .line 239
    iget v2, p0, Luq;->Q:I

    .line 240
    .line 241
    sub-int v3, v10, v2

    .line 242
    .line 243
    int-to-float v3, v3

    .line 244
    sub-int v4, v7, v2

    .line 245
    .line 246
    int-to-float v4, v4

    .line 247
    add-int v5, v10, v2

    .line 248
    .line 249
    int-to-float v5, v5

    .line 250
    add-int/2addr v2, v7

    .line 251
    int-to-float v2, v2

    .line 252
    sget-object v6, Landroid/graphics/Region$Op;->UNION:Landroid/graphics/Region$Op;

    .line 253
    .line 254
    move v1, v5

    .line 255
    move v5, v2

    .line 256
    move v2, v3

    .line 257
    move v3, v4

    .line 258
    move v4, v1

    .line 259
    move-object v1, p1

    .line 260
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 261
    .line 262
    .line 263
    :cond_7
    int-to-float v2, v10

    .line 264
    int-to-float v3, v7

    .line 265
    iget v4, p0, Luq;->Q:I

    .line 266
    .line 267
    int-to-float v4, v4

    .line 268
    iget-object v5, p0, Luq;->q:Landroid/graphics/Paint;

    .line 269
    .line 270
    invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 271
    .line 272
    .line 273
    :cond_8
    iget v2, p0, Luq;->c0:I

    .line 274
    .line 275
    const/4 v3, -0x1

    .line 276
    const/4 v4, 0x0

    .line 277
    if-ne v2, v3, :cond_9

    .line 278
    .line 279
    iget v2, p0, Luq;->M:I

    .line 280
    .line 281
    const/4 v3, 0x3

    .line 282
    if-ne v2, v3, :cond_f

    .line 283
    .line 284
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 285
    .line 286
    .line 287
    move-result v2

    .line 288
    if-eqz v2, :cond_f

    .line 289
    .line 290
    iget v2, p0, Luq;->M:I

    .line 291
    .line 292
    if-ne v2, v8, :cond_a

    .line 293
    .line 294
    goto/16 :goto_3

    .line 295
    .line 296
    :cond_a
    iget-boolean v2, p0, Luq;->A:Z

    .line 297
    .line 298
    if-nez v2, :cond_b

    .line 299
    .line 300
    iput-boolean v9, p0, Luq;->A:Z

    .line 301
    .line 302
    invoke-virtual {p0, v9}, Luq;->c(Z)Landroid/animation/ValueAnimator;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    iput-object v2, p0, Luq;->B:Landroid/animation/ValueAnimator;

    .line 307
    .line 308
    iput-object v4, p0, Luq;->C:Landroid/animation/ValueAnimator;

    .line 309
    .line 310
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 311
    .line 312
    .line 313
    :cond_b
    iget-object v2, p0, Luq;->x:Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    move v4, v11

    .line 320
    :goto_1
    iget-object v5, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    if-ge v4, v5, :cond_d

    .line 327
    .line 328
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-eqz v5, :cond_d

    .line 333
    .line 334
    iget v5, p0, Luq;->d0:I

    .line 335
    .line 336
    if-ne v4, v5, :cond_c

    .line 337
    .line 338
    goto :goto_2

    .line 339
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    check-cast v5, Lkv4;

    .line 344
    .line 345
    iget-object v6, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    check-cast v6, Ljava/lang/Float;

    .line 352
    .line 353
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    invoke-virtual {p0, v5, v6}, Luq;->p(Lkv4;F)V

    .line 358
    .line 359
    .line 360
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 361
    .line 362
    goto :goto_1

    .line 363
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    if-eqz v4, :cond_e

    .line 368
    .line 369
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    check-cast v2, Lkv4;

    .line 374
    .line 375
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 376
    .line 377
    iget v4, p0, Luq;->d0:I

    .line 378
    .line 379
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    check-cast v3, Ljava/lang/Float;

    .line 384
    .line 385
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-virtual {p0, v2, v3}, Luq;->p(Lkv4;F)V

    .line 390
    .line 391
    .line 392
    goto :goto_3

    .line 393
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 394
    .line 395
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 396
    .line 397
    .line 398
    move-result v2

    .line 399
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 406
    .line 407
    .line 408
    move-result v0

    .line 409
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    const-string v2, "Not enough labels(%d) to display all the values(%d)"

    .line 418
    .line 419
    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v1

    .line 427
    :cond_f
    iget-boolean v2, p0, Luq;->A:Z

    .line 428
    .line 429
    if-eqz v2, :cond_10

    .line 430
    .line 431
    iput-boolean v11, p0, Luq;->A:Z

    .line 432
    .line 433
    invoke-virtual {p0, v11}, Luq;->c(Z)Landroid/animation/ValueAnimator;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    iput-object v2, p0, Luq;->C:Landroid/animation/ValueAnimator;

    .line 438
    .line 439
    iput-object v4, p0, Luq;->B:Landroid/animation/ValueAnimator;

    .line 440
    .line 441
    new-instance v3, Ll4;

    .line 442
    .line 443
    invoke-direct {v3, v8, p0}, Ll4;-><init>(ILjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 447
    .line 448
    .line 449
    iget-object v2, p0, Luq;->C:Landroid/animation/ValueAnimator;

    .line 450
    .line 451
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->start()V

    .line 452
    .line 453
    .line 454
    :cond_10
    :goto_3
    iget v2, p0, Luq;->j0:I

    .line 455
    .line 456
    :goto_4
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    if-ge v11, v3, :cond_14

    .line 463
    .line 464
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 465
    .line 466
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    check-cast v3, Ljava/lang/Float;

    .line 471
    .line 472
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    iget-object v5, p0, Luq;->s0:Landroid/graphics/drawable/Drawable;

    .line 477
    .line 478
    if-eqz v5, :cond_11

    .line 479
    .line 480
    move-object v0, p0

    .line 481
    move-object v1, p1

    .line 482
    move v3, v7

    .line 483
    invoke-virtual/range {v0 .. v5}, Luq;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    .line 484
    .line 485
    .line 486
    goto :goto_5

    .line 487
    :cond_11
    move v3, v7

    .line 488
    iget-object v1, p0, Luq;->t0:Ljava/util/List;

    .line 489
    .line 490
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 491
    .line 492
    .line 493
    move-result v1

    .line 494
    if-ge v11, v1, :cond_12

    .line 495
    .line 496
    iget-object v1, p0, Luq;->t0:Ljava/util/List;

    .line 497
    .line 498
    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    move-object v5, v1

    .line 503
    check-cast v5, Landroid/graphics/drawable/Drawable;

    .line 504
    .line 505
    move-object v0, p0

    .line 506
    move-object v1, p1

    .line 507
    invoke-virtual/range {v0 .. v5}, Luq;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_12
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 512
    .line 513
    .line 514
    move-result v5

    .line 515
    if-nez v5, :cond_13

    .line 516
    .line 517
    iget v5, p0, Luq;->O:I

    .line 518
    .line 519
    int-to-float v5, v5

    .line 520
    invoke-virtual {p0, v4}, Luq;->n(F)F

    .line 521
    .line 522
    .line 523
    move-result v6

    .line 524
    int-to-float v7, v2

    .line 525
    mul-float/2addr v6, v7

    .line 526
    add-float/2addr v6, v5

    .line 527
    int-to-float v5, v3

    .line 528
    iget v7, p0, Luq;->P:I

    .line 529
    .line 530
    int-to-float v7, v7

    .line 531
    iget-object v8, p0, Luq;->p:Landroid/graphics/Paint;

    .line 532
    .line 533
    invoke-virtual {p1, v6, v5, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 534
    .line 535
    .line 536
    :cond_13
    iget-object v5, p0, Luq;->r0:Lfi2;

    .line 537
    .line 538
    move-object v0, p0

    .line 539
    move-object v1, p1

    .line 540
    invoke-virtual/range {v0 .. v5}, Luq;->d(Landroid/graphics/Canvas;IIFLandroid/graphics/drawable/Drawable;)V

    .line 541
    .line 542
    .line 543
    :goto_5
    add-int/lit8 v11, v11, 0x1

    .line 544
    .line 545
    move v7, v3

    .line 546
    goto :goto_4

    .line 547
    :cond_14
    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p0, Luq;->t:Lsq;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Luq;->c0:I

    .line 10
    .line 11
    iget p0, p0, Luq;->d0:I

    .line 12
    .line 13
    invoke-virtual {p3, p0}, Lz41;->j(I)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const/4 p1, 0x1

    .line 18
    const v0, 0x7fffffff

    .line 19
    .line 20
    .line 21
    if-eq p2, p1, :cond_4

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    const/high16 v1, -0x80000000

    .line 25
    .line 26
    if-eq p2, p1, :cond_3

    .line 27
    .line 28
    const/16 p1, 0x11

    .line 29
    .line 30
    if-eq p2, p1, :cond_2

    .line 31
    .line 32
    const/16 p1, 0x42

    .line 33
    .line 34
    if-eq p2, p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {p0, v1}, Luq;->m(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {p0, v0}, Luq;->m(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    invoke-virtual {p0, v1}, Luq;->l(I)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-virtual {p0, v0}, Luq;->l(I)Z

    .line 50
    .line 51
    .line 52
    :goto_0
    iget p0, p0, Luq;->d0:I

    .line 53
    .line 54
    invoke-virtual {p3, p0}, Lz41;->w(I)Z

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, v2, :cond_1

    .line 21
    .line 22
    iput v1, p0, Luq;->c0:I

    .line 23
    .line 24
    :cond_1
    iget v0, p0, Luq;->c0:I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/16 v4, 0x46

    .line 28
    .line 29
    const/16 v5, 0x45

    .line 30
    .line 31
    const/16 v6, 0x51

    .line 32
    .line 33
    const/16 v7, 0x42

    .line 34
    .line 35
    const/16 v8, 0x3d

    .line 36
    .line 37
    const/4 v9, -0x1

    .line 38
    if-ne v0, v9, :cond_9

    .line 39
    .line 40
    if-eq p1, v8, :cond_5

    .line 41
    .line 42
    if-eq p1, v7, :cond_4

    .line 43
    .line 44
    if-eq p1, v6, :cond_3

    .line 45
    .line 46
    if-eq p1, v5, :cond_2

    .line 47
    .line 48
    if-eq p1, v4, :cond_3

    .line 49
    .line 50
    packed-switch p1, :pswitch_data_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_0
    invoke-virtual {p0, v2}, Luq;->m(I)V

    .line 55
    .line 56
    .line 57
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    invoke-virtual {p0, v9}, Luq;->m(I)V

    .line 61
    .line 62
    .line 63
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {p0, v9}, Luq;->l(I)Z

    .line 67
    .line 68
    .line 69
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-virtual {p0, v2}, Luq;->l(I)Z

    .line 73
    .line 74
    .line 75
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    :pswitch_2
    iget v0, p0, Luq;->d0:I

    .line 79
    .line 80
    iput v0, p0, Luq;->c0:I

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 83
    .line 84
    .line 85
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {p0, v2}, Luq;->l(I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {p0, v9}, Luq;->l(I)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    goto :goto_0

    .line 118
    :cond_7
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 119
    .line 120
    :goto_0
    if-eqz v3, :cond_8

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    return p0

    .line 127
    :cond_8
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    return p0

    .line 132
    :cond_9
    iget-boolean v0, p0, Luq;->k0:Z

    .line 133
    .line 134
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isLongPress()Z

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    or-int/2addr v0, v10

    .line 139
    iput-boolean v0, p0, Luq;->k0:Z

    .line 140
    .line 141
    iget v10, p0, Luq;->e0:F

    .line 142
    .line 143
    const/high16 v11, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/4 v12, 0x0

    .line 146
    if-eqz v0, :cond_c

    .line 147
    .line 148
    cmpl-float v0, v10, v12

    .line 149
    .line 150
    if-nez v0, :cond_a

    .line 151
    .line 152
    move v10, v11

    .line 153
    :cond_a
    iget v0, p0, Luq;->a0:F

    .line 154
    .line 155
    iget v11, p0, Luq;->W:F

    .line 156
    .line 157
    sub-float/2addr v0, v11

    .line 158
    div-float/2addr v0, v10

    .line 159
    const/high16 v11, 0x41a00000    # 20.0f

    .line 160
    .line 161
    cmpg-float v12, v0, v11

    .line 162
    .line 163
    if-gtz v12, :cond_b

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_b
    div-float/2addr v0, v11

    .line 167
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    int-to-float v0, v0

    .line 172
    mul-float/2addr v10, v0

    .line 173
    goto :goto_1

    .line 174
    :cond_c
    cmpl-float v0, v10, v12

    .line 175
    .line 176
    if-nez v0, :cond_d

    .line 177
    .line 178
    move v10, v11

    .line 179
    :cond_d
    :goto_1
    const/16 v0, 0x15

    .line 180
    .line 181
    if-eq p1, v0, :cond_12

    .line 182
    .line 183
    const/16 v0, 0x16

    .line 184
    .line 185
    if-eq p1, v0, :cond_10

    .line 186
    .line 187
    if-eq p1, v5, :cond_f

    .line 188
    .line 189
    if-eq p1, v4, :cond_e

    .line 190
    .line 191
    if-eq p1, v6, :cond_e

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_e
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    goto :goto_3

    .line 199
    :cond_f
    neg-float v0, v10

    .line 200
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    goto :goto_3

    .line 205
    :cond_10
    invoke-virtual {p0}, Luq;->j()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    if-eqz v0, :cond_11

    .line 210
    .line 211
    neg-float v10, v10

    .line 212
    :cond_11
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    goto :goto_3

    .line 217
    :cond_12
    invoke-virtual {p0}, Luq;->j()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_13

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_13
    neg-float v10, v10

    .line 225
    :goto_2
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    :goto_3
    if-eqz v3, :cond_15

    .line 230
    .line 231
    iget-object p1, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 232
    .line 233
    iget p2, p0, Luq;->c0:I

    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    check-cast p1, Ljava/lang/Float;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 246
    .line 247
    .line 248
    move-result p2

    .line 249
    add-float/2addr p2, p1

    .line 250
    iget p1, p0, Luq;->c0:I

    .line 251
    .line 252
    invoke-virtual {p0, p1, p2}, Luq;->r(IF)Z

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    if-eqz p1, :cond_14

    .line 257
    .line 258
    invoke-virtual {p0}, Luq;->u()V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 262
    .line 263
    .line 264
    :cond_14
    return v2

    .line 265
    :cond_15
    const/16 v0, 0x17

    .line 266
    .line 267
    if-eq p1, v0, :cond_19

    .line 268
    .line 269
    if-eq p1, v8, :cond_16

    .line 270
    .line 271
    if-eq p1, v7, :cond_19

    .line 272
    .line 273
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    return p0

    .line 278
    :cond_16
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_17

    .line 283
    .line 284
    invoke-virtual {p0, v2}, Luq;->l(I)Z

    .line 285
    .line 286
    .line 287
    move-result p0

    .line 288
    return p0

    .line 289
    :cond_17
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isShiftPressed()Z

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    if-eqz p1, :cond_18

    .line 294
    .line 295
    invoke-virtual {p0, v9}, Luq;->l(I)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    return p0

    .line 300
    :cond_18
    return v1

    .line 301
    :cond_19
    iput v9, p0, Luq;->c0:I

    .line 302
    .line 303
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 304
    .line 305
    .line 306
    return v2

    .line 307
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Luq;->k0:Z

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Landroid/view/View;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget p2, p0, Luq;->L:I

    .line 2
    .line 3
    iget v0, p0, Luq;->M:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Luq;->x:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lkv4;

    .line 19
    .line 20
    invoke-virtual {v0}, Lkv4;->getIntrinsicHeight()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :cond_1
    add-int/2addr p2, v2

    .line 25
    const/high16 v0, 0x40000000    # 2.0f

    .line 26
    .line 27
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Ltq;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget v0, p1, Ltq;->n:F

    .line 11
    .line 12
    iput v0, p0, Luq;->W:F

    .line 13
    .line 14
    iget v0, p1, Ltq;->o:F

    .line 15
    .line 16
    iput v0, p0, Luq;->a0:F

    .line 17
    .line 18
    iget-object v0, p1, Ltq;->p:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Luq;->q(Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    iget v0, p1, Ltq;->q:F

    .line 24
    .line 25
    iput v0, p0, Luq;->e0:F

    .line 26
    .line 27
    iget-boolean p1, p1, Ltq;->r:Z

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ltq;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget v0, p0, Luq;->W:F

    .line 11
    .line 12
    iput v0, v1, Ltq;->n:F

    .line 13
    .line 14
    iget v0, p0, Luq;->a0:F

    .line 15
    .line 16
    iput v0, v1, Ltq;->o:F

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v2, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, v1, Ltq;->p:Ljava/util/ArrayList;

    .line 26
    .line 27
    iget v0, p0, Luq;->e0:F

    .line 28
    .line 29
    iput v0, v1, Ltq;->q:F

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    iput-boolean p0, v1, Ltq;->r:Z

    .line 36
    .line 37
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    iget p2, p0, Luq;->O:I

    .line 2
    .line 3
    mul-int/lit8 p2, p2, 0x2

    .line 4
    .line 5
    sub-int/2addr p1, p2

    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iput p1, p0, Luq;->j0:I

    .line 12
    .line 13
    invoke-virtual {p0}, Luq;->k()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Luq;->u()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v2, p0, Luq;->O:I

    .line 14
    .line 15
    int-to-float v2, v2

    .line 16
    sub-float v2, v0, v2

    .line 17
    .line 18
    iget v3, p0, Luq;->j0:I

    .line 19
    .line 20
    int-to-float v3, v3

    .line 21
    div-float/2addr v2, v3

    .line 22
    iput v2, p0, Luq;->u0:F

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iput v2, p0, Luq;->u0:F

    .line 30
    .line 31
    const/high16 v3, 0x3f800000    # 1.0f

    .line 32
    .line 33
    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, Luq;->u0:F

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, -0x1

    .line 44
    const/4 v4, 0x1

    .line 45
    if-eqz v2, :cond_a

    .line 46
    .line 47
    iget v5, p0, Luq;->D:I

    .line 48
    .line 49
    if-eq v2, v4, :cond_5

    .line 50
    .line 51
    const/4 v6, 0x2

    .line 52
    if-eq v2, v6, :cond_1

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    if-eq v2, v0, :cond_5

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_1
    iget-boolean v2, p0, Luq;->V:Z

    .line 60
    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Luq;->i(Landroid/view/MotionEvent;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iget v2, p0, Luq;->S:F

    .line 70
    .line 71
    sub-float/2addr v0, v2

    .line 72
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    int-to-float v2, v5

    .line 77
    cmpg-float v0, v0, v2

    .line 78
    .line 79
    if-gez v0, :cond_2

    .line 80
    .line 81
    :goto_0
    return v1

    .line 82
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Luq;->o()V

    .line 90
    .line 91
    .line 92
    :cond_3
    move-object v0, p0

    .line 93
    check-cast v0, Lcom/google/android/material/slider/Slider;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/material/slider/Slider;->getActiveThumbIndex()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eq v2, v3, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-virtual {v0, v1}, Luq;->setActiveThumbIndex(I)V

    .line 103
    .line 104
    .line 105
    :goto_1
    iput-boolean v4, p0, Luq;->V:Z

    .line 106
    .line 107
    invoke-virtual {p0}, Luq;->s()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Luq;->u()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_5
    iput-boolean v1, p0, Luq;->V:Z

    .line 119
    .line 120
    iget-object v0, p0, Luq;->T:Landroid/view/MotionEvent;

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_7

    .line 129
    .line 130
    iget-object v0, p0, Luq;->T:Landroid/view/MotionEvent;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    sub-float/2addr v0, v2

    .line 141
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    int-to-float v2, v5

    .line 146
    cmpg-float v0, v0, v2

    .line 147
    .line 148
    if-gtz v0, :cond_7

    .line 149
    .line 150
    iget-object v0, p0, Luq;->T:Landroid/view/MotionEvent;

    .line 151
    .line 152
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    sub-float/2addr v0, v5

    .line 161
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    cmpg-float v0, v0, v2

    .line 166
    .line 167
    if-gtz v0, :cond_7

    .line 168
    .line 169
    move-object v0, p0

    .line 170
    check-cast v0, Lcom/google/android/material/slider/Slider;

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/google/android/material/slider/Slider;->getActiveThumbIndex()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eq v2, v3, :cond_6

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_6
    invoke-virtual {v0, v1}, Luq;->setActiveThumbIndex(I)V

    .line 180
    .line 181
    .line 182
    :goto_2
    invoke-virtual {p0}, Luq;->o()V

    .line 183
    .line 184
    .line 185
    :cond_7
    iget v0, p0, Luq;->c0:I

    .line 186
    .line 187
    if-eq v0, v3, :cond_9

    .line 188
    .line 189
    invoke-virtual {p0}, Luq;->s()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Luq;->u()V

    .line 193
    .line 194
    .line 195
    iput v3, p0, Luq;->c0:I

    .line 196
    .line 197
    iget-object v0, p0, Luq;->z:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_8

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_8
    invoke-static {v0}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    throw p0

    .line 215
    :cond_9
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_a
    iput v0, p0, Luq;->S:F

    .line 220
    .line 221
    invoke-virtual {p0, p1}, Luq;->i(Landroid/view/MotionEvent;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_b

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v0, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 233
    .line 234
    .line 235
    move-object v0, p0

    .line 236
    check-cast v0, Lcom/google/android/material/slider/Slider;

    .line 237
    .line 238
    invoke-virtual {v0}, Lcom/google/android/material/slider/Slider;->getActiveThumbIndex()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eq v2, v3, :cond_c

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_c
    invoke-virtual {v0, v1}, Luq;->setActiveThumbIndex(I)V

    .line 246
    .line 247
    .line 248
    :goto_4
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 249
    .line 250
    .line 251
    iput-boolean v4, p0, Luq;->V:Z

    .line 252
    .line 253
    invoke-virtual {p0}, Luq;->s()V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Luq;->u()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p0}, Luq;->o()V

    .line 263
    .line 264
    .line 265
    :goto_5
    iget-boolean v0, p0, Luq;->V:Z

    .line 266
    .line 267
    invoke-virtual {p0, v0}, Landroid/view/View;->setPressed(Z)V

    .line 268
    .line 269
    .line 270
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    iput-object p1, p0, Luq;->T:Landroid/view/MotionEvent;

    .line 275
    .line 276
    return v4
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_2

    .line 5
    .line 6
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p2, Lc05;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lc05;-><init>(Landroid/view/ViewGroup;)V

    .line 17
    .line 18
    .line 19
    move-object p1, p2

    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_1
    iget-object p0, p0, Luq;->x:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/4 v0, 0x0

    .line 30
    :goto_1
    if-ge v0, p2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    check-cast v1, Lkv4;

    .line 39
    .line 40
    iget-object v2, p1, Lc05;->n:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Landroid/view/ViewOverlay;

    .line 43
    .line 44
    invoke-virtual {v2, v1}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    :goto_2
    return-void
.end method

.method public final p(Lkv4;F)V
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Luq;->e(F)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Lkv4;->K:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p1, Lkv4;->K:Ljava/lang/CharSequence;

    .line 14
    .line 15
    iget-object v0, p1, Lkv4;->N:Lxr4;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, v0, Lxr4;->e:Z

    .line 19
    .line 20
    invoke-virtual {p1}, Lfi2;->invalidateSelf()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget v0, p0, Luq;->O:I

    .line 24
    .line 25
    invoke-virtual {p0, p2}, Luq;->n(F)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget v1, p0, Luq;->j0:I

    .line 30
    .line 31
    int-to-float v1, v1

    .line 32
    mul-float/2addr p2, v1

    .line 33
    float-to-int p2, p2

    .line 34
    add-int/2addr v0, p2

    .line 35
    invoke-virtual {p1}, Lkv4;->getIntrinsicWidth()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    div-int/lit8 p2, p2, 0x2

    .line 40
    .line 41
    sub-int/2addr v0, p2

    .line 42
    invoke-virtual {p0}, Luq;->b()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iget v1, p0, Luq;->R:I

    .line 47
    .line 48
    iget v2, p0, Luq;->P:I

    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    sub-int/2addr p2, v1

    .line 52
    invoke-virtual {p1}, Lkv4;->getIntrinsicHeight()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    sub-int v1, p2, v1

    .line 57
    .line 58
    invoke-virtual {p1}, Lkv4;->getIntrinsicWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 64
    .line 65
    .line 66
    new-instance p2, Landroid/graphics/Rect;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {p2, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0, p0, p2}, Lep0;->c(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-nez p0, :cond_1

    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    new-instance p2, Lc05;

    .line 94
    .line 95
    invoke-direct {p2, p0}, Lc05;-><init>(Landroid/view/ViewGroup;)V

    .line 96
    .line 97
    .line 98
    move-object p0, p2

    .line 99
    :goto_0
    iget-object p0, p0, Lc05;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Landroid/view/ViewOverlay;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final q(Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_f

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iput-object p1, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Luq;->l0:Z

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Luq;->d0:I

    .line 38
    .line 39
    invoke-virtual {p0}, Luq;->u()V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Luq;->x:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x0

    .line 55
    if-le v2, v3, :cond_5

    .line 56
    .line 57
    iget-object v2, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Lkv4;

    .line 86
    .line 87
    sget-object v6, Lj65;->a:Ljava/util/WeakHashMap;

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_1

    .line 94
    .line 95
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    if-nez v6, :cond_2

    .line 100
    .line 101
    move-object v7, v4

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    new-instance v7, Lc05;

    .line 104
    .line 105
    invoke-direct {v7, v6}, Lc05;-><init>(Landroid/view/ViewGroup;)V

    .line 106
    .line 107
    .line 108
    :goto_1
    if-eqz v7, :cond_1

    .line 109
    .line 110
    iget-object v6, v7, Lc05;->n:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, Landroid/view/ViewOverlay;

    .line 113
    .line 114
    invoke-virtual {v6, v5}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-nez v6, :cond_3

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_3
    iget-object v5, v5, Lkv4;->O:Lot;

    .line 128
    .line 129
    invoke-virtual {v6, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 134
    .line 135
    .line 136
    :cond_5
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-ge v2, v3, :cond_a

    .line 147
    .line 148
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v3, Lkv4;

    .line 153
    .line 154
    iget v9, p0, Luq;->w:I

    .line 155
    .line 156
    invoke-direct {v3, v2, v9}, Lkv4;-><init>(Landroid/content/Context;I)V

    .line 157
    .line 158
    .line 159
    sget-object v7, Lht3;->Z:[I

    .line 160
    .line 161
    new-array v10, v0, [I

    .line 162
    .line 163
    iget-object v5, v3, Lkv4;->L:Landroid/content/Context;

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v8, 0x0

    .line 167
    invoke-static/range {v5 .. v10}, Luc5;->D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    iget-object v5, v3, Lkv4;->L:Landroid/content/Context;

    .line 172
    .line 173
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    const v7, 0x7f0705d8

    .line 178
    .line 179
    .line 180
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    iput v6, v3, Lkv4;->U:I

    .line 185
    .line 186
    iget-object v6, v3, Lfi2;->n:Lei2;

    .line 187
    .line 188
    iget-object v6, v6, Lei2;->a:Lbc4;

    .line 189
    .line 190
    invoke-virtual {v6}, Lbc4;->g()Lzc1;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v3}, Lkv4;->w()Lh83;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    iput-object v7, v6, Lzc1;->k:Ljava/lang/Object;

    .line 199
    .line 200
    invoke-virtual {v6}, Lzc1;->a()Lbc4;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-virtual {v3, v6}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 205
    .line 206
    .line 207
    const/4 v6, 0x6

    .line 208
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    iget-object v7, v3, Lkv4;->K:Ljava/lang/CharSequence;

    .line 213
    .line 214
    invoke-static {v7, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    iget-object v8, v3, Lkv4;->N:Lxr4;

    .line 219
    .line 220
    if-nez v7, :cond_6

    .line 221
    .line 222
    iput-object v6, v3, Lkv4;->K:Ljava/lang/CharSequence;

    .line 223
    .line 224
    iput-boolean p1, v8, Lxr4;->e:Z

    .line 225
    .line 226
    invoke-virtual {v3}, Lfi2;->invalidateSelf()V

    .line 227
    .line 228
    .line 229
    :cond_6
    invoke-virtual {v2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_7

    .line 234
    .line 235
    invoke-virtual {v2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    if-eqz v6, :cond_7

    .line 240
    .line 241
    new-instance v7, Lrr4;

    .line 242
    .line 243
    invoke-direct {v7, v5, v6}, Lrr4;-><init>(Landroid/content/Context;I)V

    .line 244
    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_7
    move-object v7, v4

    .line 248
    :goto_3
    if-eqz v7, :cond_8

    .line 249
    .line 250
    invoke-virtual {v2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    if-eqz v6, :cond_8

    .line 255
    .line 256
    invoke-static {v5, v2, p1}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    iput-object v6, v7, Lrr4;->j:Landroid/content/res/ColorStateList;

    .line 261
    .line 262
    :cond_8
    invoke-virtual {v8, v7, v5}, Lxr4;->c(Lrr4;Landroid/content/Context;)V

    .line 263
    .line 264
    .line 265
    const v6, 0x7f040116

    .line 266
    .line 267
    .line 268
    const-class v7, Lkv4;

    .line 269
    .line 270
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v8

    .line 274
    invoke-static {v6, v5, v8}, Lg12;->r(ILandroid/content/Context;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    const v8, 0x1010031

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-static {v8, v5, v9}, Lg12;->r(ILandroid/content/Context;Ljava/lang/String;)I

    .line 286
    .line 287
    .line 288
    move-result v8

    .line 289
    const/16 v9, 0xe5

    .line 290
    .line 291
    invoke-static {v8, v9}, Lv50;->i(II)I

    .line 292
    .line 293
    .line 294
    move-result v8

    .line 295
    const/16 v9, 0x99

    .line 296
    .line 297
    invoke-static {v6, v9}, Lv50;->i(II)I

    .line 298
    .line 299
    .line 300
    move-result v6

    .line 301
    invoke-static {v6, v8}, Lv50;->g(II)I

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    const/4 v8, 0x7

    .line 306
    invoke-virtual {v2, v8, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    invoke-static {v6}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {v3, v6}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 315
    .line 316
    .line 317
    const v6, 0x7f04013b

    .line 318
    .line 319
    .line 320
    invoke-virtual {v7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    invoke-static {v6, v5, v7}, Lg12;->r(ILandroid/content/Context;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    invoke-virtual {v3, v5}, Lfi2;->q(Landroid/content/res/ColorStateList;)V

    .line 333
    .line 334
    .line 335
    const/4 v5, 0x2

    .line 336
    invoke-virtual {v2, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 337
    .line 338
    .line 339
    move-result v6

    .line 340
    iput v6, v3, Lkv4;->Q:I

    .line 341
    .line 342
    const/4 v6, 0x4

    .line 343
    invoke-virtual {v2, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 344
    .line 345
    .line 346
    move-result v6

    .line 347
    iput v6, v3, Lkv4;->R:I

    .line 348
    .line 349
    const/4 v6, 0x5

    .line 350
    invoke-virtual {v2, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    iput v6, v3, Lkv4;->S:I

    .line 355
    .line 356
    const/4 v6, 0x3

    .line 357
    invoke-virtual {v2, v6, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 358
    .line 359
    .line 360
    move-result v6

    .line 361
    iput v6, v3, Lkv4;->T:I

    .line 362
    .line 363
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 370
    .line 371
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_5

    .line 376
    .line 377
    invoke-static {p0}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    if-nez v2, :cond_9

    .line 382
    .line 383
    goto/16 :goto_2

    .line 384
    .line 385
    :cond_9
    new-array v5, v5, [I

    .line 386
    .line 387
    invoke-virtual {v2, v5}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 388
    .line 389
    .line 390
    aget v5, v5, v0

    .line 391
    .line 392
    iput v5, v3, Lkv4;->V:I

    .line 393
    .line 394
    iget-object v5, v3, Lkv4;->P:Landroid/graphics/Rect;

    .line 395
    .line 396
    invoke-virtual {v2, v5}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 397
    .line 398
    .line 399
    iget-object v3, v3, Lkv4;->O:Lot;

    .line 400
    .line 401
    invoke-virtual {v2, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_2

    .line 405
    .line 406
    :cond_a
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-ne v2, p1, :cond_b

    .line 411
    .line 412
    move p1, v0

    .line 413
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    move v3, v0

    .line 418
    :goto_4
    if-ge v3, v2, :cond_c

    .line 419
    .line 420
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    add-int/lit8 v3, v3, 0x1

    .line 425
    .line 426
    check-cast v4, Lkv4;

    .line 427
    .line 428
    int-to-float v5, p1

    .line 429
    invoke-virtual {v4, v5}, Lfi2;->r(F)V

    .line 430
    .line 431
    .line 432
    goto :goto_4

    .line 433
    :cond_c
    iget-object p1, p0, Luq;->y:Ljava/util/ArrayList;

    .line 434
    .line 435
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 436
    .line 437
    .line 438
    move-result v1

    .line 439
    move v2, v0

    .line 440
    :cond_d
    if-ge v2, v1, :cond_e

    .line 441
    .line 442
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    add-int/lit8 v2, v2, 0x1

    .line 447
    .line 448
    check-cast v3, Ldg4;

    .line 449
    .line 450
    iget-object v4, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 451
    .line 452
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    move v6, v0

    .line 457
    :goto_5
    if-ge v6, v5, :cond_d

    .line 458
    .line 459
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    add-int/lit8 v6, v6, 0x1

    .line 464
    .line 465
    check-cast v7, Ljava/lang/Float;

    .line 466
    .line 467
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 468
    .line 469
    .line 470
    move-result v7

    .line 471
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-object v8, p0

    .line 475
    check-cast v8, Lcom/google/android/material/slider/Slider;

    .line 476
    .line 477
    invoke-interface {v3, v7, v0}, Ldg4;->a(FZ)V

    .line 478
    .line 479
    .line 480
    goto :goto_5

    .line 481
    :cond_e
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 482
    .line 483
    .line 484
    return-void

    .line 485
    :cond_f
    const-string p0, "At least one value must be set"

    .line 486
    .line 487
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    return-void
.end method

.method public final r(IF)Z
    .locals 6

    .line 1
    iput p1, p0, Luq;->d0:I

    .line 2
    .line 3
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-float v0, p2, v0

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    float-to-double v0, v0

    .line 22
    const-wide v2, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmpg-double v0, v0, v2

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-gez v0, :cond_0

    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    invoke-virtual {p0}, Luq;->getMinSeparation()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget v2, p0, Luq;->v0:I

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    cmpl-float v3, v0, v2

    .line 43
    .line 44
    if-nez v3, :cond_1

    .line 45
    .line 46
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget v2, p0, Luq;->O:I

    .line 49
    .line 50
    int-to-float v2, v2

    .line 51
    sub-float/2addr v0, v2

    .line 52
    iget v2, p0, Luq;->j0:I

    .line 53
    .line 54
    int-to-float v2, v2

    .line 55
    div-float/2addr v0, v2

    .line 56
    iget v2, p0, Luq;->W:F

    .line 57
    .line 58
    iget v3, p0, Luq;->a0:F

    .line 59
    .line 60
    invoke-static {v2, v3, v0, v2}, Lxa3;->a(FFFF)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    :cond_2
    :goto_0
    invoke-virtual {p0}, Luq;->j()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    neg-float v0, v0

    .line 71
    :cond_3
    add-int/lit8 v2, p1, 0x1

    .line 72
    .line 73
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-lt v2, v3, :cond_4

    .line 80
    .line 81
    iget v2, p0, Luq;->a0:F

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iget-object v3, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/lang/Float;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    sub-float/2addr v2, v0

    .line 97
    :goto_1
    add-int/lit8 v3, p1, -0x1

    .line 98
    .line 99
    if-gez v3, :cond_5

    .line 100
    .line 101
    iget v0, p0, Luq;->W:F

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    iget-object v4, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    check-cast v3, Ljava/lang/Float;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    add-float/2addr v0, v3

    .line 117
    :goto_2
    invoke-static {p2, v0, v2}, Lsu3;->k(FFF)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    iget-object p2, p0, Luq;->y:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    :goto_3
    const/4 v2, 0x1

    .line 137
    if-ge v1, v0, :cond_6

    .line 138
    .line 139
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    add-int/lit8 v1, v1, 0x1

    .line 144
    .line 145
    check-cast v3, Ldg4;

    .line 146
    .line 147
    iget-object v4, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Ljava/lang/Float;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object v5, p0

    .line 163
    check-cast v5, Lcom/google/android/material/slider/Slider;

    .line 164
    .line 165
    invoke-interface {v3, v4, v2}, Ldg4;->a(FZ)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    iget-object p2, p0, Luq;->u:Landroid/view/accessibility/AccessibilityManager;

    .line 170
    .line 171
    if-eqz p2, :cond_8

    .line 172
    .line 173
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    if-eqz p2, :cond_8

    .line 178
    .line 179
    iget-object p2, p0, Luq;->v:Lrq;

    .line 180
    .line 181
    if-nez p2, :cond_7

    .line 182
    .line 183
    new-instance p2, Lrq;

    .line 184
    .line 185
    invoke-direct {p2, p0}, Lrq;-><init>(Luq;)V

    .line 186
    .line 187
    .line 188
    iput-object p2, p0, Luq;->v:Lrq;

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    invoke-virtual {p0, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 192
    .line 193
    .line 194
    :goto_4
    iget-object p2, p0, Luq;->v:Lrq;

    .line 195
    .line 196
    iput p1, p2, Lrq;->o:I

    .line 197
    .line 198
    const-wide/16 v0, 0xc8

    .line 199
    .line 200
    invoke-virtual {p0, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 201
    .line 202
    .line 203
    :cond_8
    return v2
.end method

.method public final s()V
    .locals 6

    .line 1
    iget v0, p0, Luq;->u0:F

    .line 2
    .line 3
    iget v1, p0, Luq;->e0:F

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    cmpl-float v2, v1, v2

    .line 7
    .line 8
    if-lez v2, :cond_0

    .line 9
    .line 10
    iget v2, p0, Luq;->a0:F

    .line 11
    .line 12
    iget v3, p0, Luq;->W:F

    .line 13
    .line 14
    sub-float/2addr v2, v3

    .line 15
    div-float/2addr v2, v1

    .line 16
    float-to-int v1, v2

    .line 17
    int-to-float v2, v1

    .line 18
    mul-float/2addr v0, v2

    .line 19
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-double v2, v0

    .line 24
    int-to-double v0, v1

    .line 25
    div-double/2addr v2, v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    float-to-double v2, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Luq;->j()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 35
    .line 36
    sub-double v2, v0, v2

    .line 37
    .line 38
    :cond_1
    iget v0, p0, Luq;->a0:F

    .line 39
    .line 40
    iget v1, p0, Luq;->W:F

    .line 41
    .line 42
    sub-float/2addr v0, v1

    .line 43
    float-to-double v4, v0

    .line 44
    mul-double/2addr v2, v4

    .line 45
    float-to-double v0, v1

    .line 46
    add-double/2addr v2, v0

    .line 47
    double-to-float v0, v2

    .line 48
    iget v1, p0, Luq;->c0:I

    .line 49
    .line 50
    invoke-virtual {p0, v1, v0}, Luq;->r(IF)Z

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public setActiveThumbIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Luq;->c0:I

    .line 2
    .line 3
    return-void
.end method

.method public varargs setCustomThumbDrawablesForValues([I)V
    .locals 4

    .line 44
    array-length v0, p1

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    .line 45
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 46
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    aget v3, p1, v1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p0, v0}, Luq;->setCustomThumbDrawablesForValues([Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public varargs setCustomThumbDrawablesForValues([Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Luq;->s0:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Luq;->t0:Ljava/util/List;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    iget-object v3, p0, Luq;->t0:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0, v2}, Luq;->a(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x2

    .line 9
    :goto_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public abstract setHaloRadius(I)V
.end method

.method public abstract setHaloTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setLabelBehavior(I)V
.end method

.method public setSeparationUnit(I)V
    .locals 0

    .line 1
    iput p1, p0, Luq;->v0:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Luq;->l0:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public abstract setThumbElevation(F)V
.end method

.method public abstract setThumbRadius(I)V
.end method

.method public abstract setThumbStrokeColor(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setThumbStrokeWidth(F)V
.end method

.method public abstract setTickActiveRadius(I)V
.end method

.method public abstract setTickActiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTickInactiveRadius(I)V
.end method

.method public abstract setTickInactiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTrackActiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public abstract setTrackHeight(I)V
.end method

.method public abstract setTrackInactiveTintList(Landroid/content/res/ColorStateList;)V
.end method

.method public setValues(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Luq;->q(Ljava/util/ArrayList;)V

    return-void
.end method

.method public varargs setValues([Ljava/lang/Float;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Luq;->q(Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final t(ILandroid/graphics/Rect;)V
    .locals 3

    .line 1
    iget v0, p0, Luq;->O:I

    .line 2
    .line 3
    invoke-virtual {p0}, Luq;->getValues()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/Float;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {p0, p1}, Luq;->n(F)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    iget v1, p0, Luq;->j0:I

    .line 22
    .line 23
    int-to-float v1, v1

    .line 24
    mul-float/2addr p1, v1

    .line 25
    float-to-int p1, p1

    .line 26
    add-int/2addr v0, p1

    .line 27
    invoke-virtual {p0}, Luq;->b()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget v1, p0, Luq;->P:I

    .line 32
    .line 33
    iget p0, p0, Luq;->J:I

    .line 34
    .line 35
    if-le v1, p0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v1, p0

    .line 39
    :goto_0
    div-int/lit8 v1, v1, 0x2

    .line 40
    .line 41
    sub-int p0, v0, v1

    .line 42
    .line 43
    sub-int v2, p1, v1

    .line 44
    .line 45
    add-int/2addr v0, v1

    .line 46
    add-int/2addr p1, v1

    .line 47
    invoke-virtual {p2, p0, v2, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final u()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 24
    .line 25
    iget v2, p0, Luq;->d0:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/Float;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p0, v1}, Luq;->n(F)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget v2, p0, Luq;->j0:I

    .line 42
    .line 43
    int-to-float v2, v2

    .line 44
    mul-float/2addr v1, v2

    .line 45
    iget v2, p0, Luq;->O:I

    .line 46
    .line 47
    int-to-float v2, v2

    .line 48
    add-float/2addr v1, v2

    .line 49
    float-to-int v1, v1

    .line 50
    invoke-virtual {p0}, Luq;->b()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    iget p0, p0, Luq;->Q:I

    .line 55
    .line 56
    sub-int v3, v1, p0

    .line 57
    .line 58
    sub-int v4, v2, p0

    .line 59
    .line 60
    add-int/2addr v1, p0

    .line 61
    add-int/2addr v2, p0

    .line 62
    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/drawable/Drawable;->setHotspotBounds(IIII)V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final v()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    iget v0, p0, Luq;->N:I

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    iget v1, p0, Luq;->P:I

    .line 14
    .line 15
    mul-int/lit8 v1, v1, 0x2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    add-int/2addr v1, v2

    .line 27
    iget v2, p0, Luq;->K:I

    .line 28
    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget v1, p0, Luq;->L:I

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-ne v0, v1, :cond_0

    .line 42
    .line 43
    move v0, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iput v0, p0, Luq;->L:I

    .line 46
    .line 47
    move v0, v2

    .line 48
    :goto_0
    iget v1, p0, Luq;->P:I

    .line 49
    .line 50
    iget v4, p0, Luq;->F:I

    .line 51
    .line 52
    sub-int/2addr v1, v4

    .line 53
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v4, p0, Luq;->N:I

    .line 58
    .line 59
    iget v5, p0, Luq;->G:I

    .line 60
    .line 61
    sub-int/2addr v4, v5

    .line 62
    div-int/lit8 v4, v4, 0x2

    .line 63
    .line 64
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    iget v5, p0, Luq;->h0:I

    .line 69
    .line 70
    iget v6, p0, Luq;->H:I

    .line 71
    .line 72
    sub-int/2addr v5, v6

    .line 73
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    iget v6, p0, Luq;->i0:I

    .line 78
    .line 79
    iget v7, p0, Luq;->I:I

    .line 80
    .line 81
    sub-int/2addr v6, v7

    .line 82
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iget v4, p0, Luq;->E:I

    .line 99
    .line 100
    add-int/2addr v1, v4

    .line 101
    iget v4, p0, Luq;->O:I

    .line 102
    .line 103
    if-ne v4, v1, :cond_1

    .line 104
    .line 105
    move v2, v3

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    iput v1, p0, Luq;->O:I

    .line 108
    .line 109
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 110
    .line 111
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    iget v4, p0, Luq;->O:I

    .line 122
    .line 123
    mul-int/lit8 v4, v4, 0x2

    .line 124
    .line 125
    sub-int/2addr v1, v4

    .line 126
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    iput v1, p0, Luq;->j0:I

    .line 131
    .line 132
    invoke-virtual {p0}, Luq;->k()V

    .line 133
    .line 134
    .line 135
    :cond_2
    :goto_1
    if-eqz v0, :cond_3

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    if-eqz v2, :cond_4

    .line 142
    .line 143
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 144
    .line 145
    .line 146
    :cond_4
    return-void
.end method

.method public final w()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Luq;->l0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget v0, p0, Luq;->W:F

    .line 6
    .line 7
    iget v1, p0, Luq;->a0:F

    .line 8
    .line 9
    cmpl-float v2, v0, v1

    .line 10
    .line 11
    const-string v3, ")"

    .line 12
    .line 13
    if-gez v2, :cond_f

    .line 14
    .line 15
    cmpg-float v2, v1, v0

    .line 16
    .line 17
    if-lez v2, :cond_e

    .line 18
    .line 19
    iget v2, p0, Luq;->e0:F

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    cmpl-float v2, v2, v4

    .line 23
    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    sub-float/2addr v1, v0

    .line 27
    invoke-virtual {p0, v1}, Luq;->h(F)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    iget v1, p0, Luq;->e0:F

    .line 37
    .line 38
    iget v2, p0, Luq;->W:F

    .line 39
    .line 40
    iget p0, p0, Luq;->a0:F

    .line 41
    .line 42
    const-string v3, ") must be 0, or a factor of the valueFrom("

    .line 43
    .line 44
    const-string v4, ")-valueTo("

    .line 45
    .line 46
    const-string v5, "The stepSize("

    .line 47
    .line 48
    invoke-static {v5, v1, v3, v2, v4}, Lb11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ") range"

    .line 56
    .line 57
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_1
    :goto_0
    iget-object v0, p0, Luq;->b0:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v2, 0x0

    .line 75
    move v5, v2

    .line 76
    :cond_2
    :goto_1
    const-string v6, ") when using stepSize("

    .line 77
    .line 78
    if-ge v5, v1, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    add-int/lit8 v5, v5, 0x1

    .line 85
    .line 86
    check-cast v7, Ljava/lang/Float;

    .line 87
    .line 88
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    iget v9, p0, Luq;->W:F

    .line 93
    .line 94
    cmpg-float v8, v8, v9

    .line 95
    .line 96
    if-ltz v8, :cond_4

    .line 97
    .line 98
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    iget v9, p0, Luq;->a0:F

    .line 103
    .line 104
    cmpl-float v8, v8, v9

    .line 105
    .line 106
    if-gtz v8, :cond_4

    .line 107
    .line 108
    iget v8, p0, Luq;->e0:F

    .line 109
    .line 110
    cmpl-float v8, v8, v4

    .line 111
    .line 112
    if-lez v8, :cond_2

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    iget v9, p0, Luq;->W:F

    .line 119
    .line 120
    sub-float/2addr v8, v9

    .line 121
    invoke-virtual {p0, v8}, Luq;->h(F)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_3

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 129
    .line 130
    iget v1, p0, Luq;->W:F

    .line 131
    .line 132
    iget p0, p0, Luq;->e0:F

    .line 133
    .line 134
    new-instance v2, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v4, "Value("

    .line 137
    .line 138
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v4, ") must be equal to valueFrom("

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v1, ") plus a multiple of stepSize("

    .line 153
    .line 154
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 178
    .line 179
    iget v1, p0, Luq;->W:F

    .line 180
    .line 181
    iget p0, p0, Luq;->a0:F

    .line 182
    .line 183
    new-instance v2, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v4, "Slider value("

    .line 186
    .line 187
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v4, ") must be greater or equal to valueFrom("

    .line 194
    .line 195
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v1, "), and lower or equal to valueTo("

    .line 202
    .line 203
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v0

    .line 220
    :cond_5
    invoke-virtual {p0}, Luq;->getMinSeparation()F

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    cmpg-float v1, v0, v4

    .line 225
    .line 226
    const-string v5, "minSeparation("

    .line 227
    .line 228
    if-ltz v1, :cond_d

    .line 229
    .line 230
    iget v1, p0, Luq;->e0:F

    .line 231
    .line 232
    cmpl-float v7, v1, v4

    .line 233
    .line 234
    if-lez v7, :cond_8

    .line 235
    .line 236
    cmpl-float v7, v0, v4

    .line 237
    .line 238
    if-lez v7, :cond_8

    .line 239
    .line 240
    iget v7, p0, Luq;->v0:I

    .line 241
    .line 242
    const/4 v8, 0x1

    .line 243
    if-ne v7, v8, :cond_7

    .line 244
    .line 245
    cmpg-float v1, v0, v1

    .line 246
    .line 247
    if-ltz v1, :cond_6

    .line 248
    .line 249
    invoke-virtual {p0, v0}, Luq;->h(F)Z

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    if-eqz v1, :cond_6

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 257
    .line 258
    iget p0, p0, Luq;->e0:F

    .line 259
    .line 260
    const-string v2, ") must be greater or equal and a multiple of stepSize("

    .line 261
    .line 262
    invoke-static {v5, v0, v2, p0, v6}, Lb11;->r(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p0

    .line 276
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v1

    .line 280
    :cond_7
    const-string p0, ") cannot be set as a dimension when using stepSize("

    .line 281
    .line 282
    invoke-static {v5, v0, p0, v1, v3}, Lxa3;->f(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :cond_8
    :goto_2
    iget v0, p0, Luq;->e0:F

    .line 291
    .line 292
    cmpl-float v1, v0, v4

    .line 293
    .line 294
    if-nez v1, :cond_9

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_9
    float-to-int v1, v0

    .line 298
    int-to-float v1, v1

    .line 299
    cmpl-float v1, v1, v0

    .line 300
    .line 301
    const-string v3, "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly."

    .line 302
    .line 303
    const-string v4, "uq"

    .line 304
    .line 305
    if-eqz v1, :cond_a

    .line 306
    .line 307
    new-instance v1, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v5, "Floating point value used for stepSize("

    .line 310
    .line 311
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    :cond_a
    iget v0, p0, Luq;->W:F

    .line 328
    .line 329
    float-to-int v1, v0

    .line 330
    int-to-float v1, v1

    .line 331
    cmpl-float v1, v1, v0

    .line 332
    .line 333
    if-eqz v1, :cond_b

    .line 334
    .line 335
    new-instance v1, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    const-string v5, "Floating point value used for valueFrom("

    .line 338
    .line 339
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 353
    .line 354
    .line 355
    :cond_b
    iget v0, p0, Luq;->a0:F

    .line 356
    .line 357
    float-to-int v1, v0

    .line 358
    int-to-float v1, v1

    .line 359
    cmpl-float v1, v1, v0

    .line 360
    .line 361
    if-eqz v1, :cond_c

    .line 362
    .line 363
    new-instance v1, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    const-string v5, "Floating point value used for valueTo("

    .line 366
    .line 367
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 381
    .line 382
    .line 383
    :cond_c
    :goto_3
    iput-boolean v2, p0, Luq;->l0:Z

    .line 384
    .line 385
    return-void

    .line 386
    :cond_d
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 387
    .line 388
    new-instance v1, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    const-string v0, ") must be greater or equal to 0"

    .line 397
    .line 398
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw p0

    .line 409
    :cond_e
    const-string p0, "valueTo("

    .line 410
    .line 411
    const-string v2, ") must be greater than valueFrom("

    .line 412
    .line 413
    invoke-static {p0, v1, v2, v0, v3}, Lxa3;->f(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :cond_f
    const-string p0, "valueFrom("

    .line 422
    .line 423
    const-string v2, ") must be smaller than valueTo("

    .line 424
    .line 425
    invoke-static {p0, v0, v2, v1, v3}, Lxa3;->f(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    :cond_10
    return-void
.end method
