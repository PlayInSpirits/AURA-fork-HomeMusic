.class public Lcom/google/android/material/navigation/NavigationView;
.super Lf64;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lzg2;


# static fields
.field public static final I:[I

.field public static final J:[I


# instance fields
.field public final A:Lsg;

.field public B:Z

.field public C:Z

.field public final D:I

.field public final E:Lmc4;

.field public final F:Lhi2;

.field public final G:Lqp4;

.field public final H:Lo43;

.field public final u:La43;

.field public final v:Ll43;

.field public w:Lq43;

.field public final x:I

.field public final y:[I

.field public z:Lno4;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->I:[I

    .line 9
    .line 10
    const v0, -0x101009e

    .line 11
    .line 12
    .line 13
    filled-new-array {v0}, [I

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lcom/google/android/material/navigation/NavigationView;->J:[I

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 798
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0403be

    .line 797
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/navigation/NavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move/from16 v4, p3

    .line 6
    .line 7
    const v7, 0x7f1403bc

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    invoke-static {v1, v2, v4, v7}, Lsu3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    new-instance v3, Landroid/graphics/Rect;

    .line 20
    .line 21
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v3, v0, Lf64;->p:Landroid/graphics/Rect;

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    iput-boolean v8, v0, Lf64;->q:Z

    .line 28
    .line 29
    iput-boolean v8, v0, Lf64;->r:Z

    .line 30
    .line 31
    iput-boolean v8, v0, Lf64;->s:Z

    .line 32
    .line 33
    iput-boolean v8, v0, Lf64;->t:Z

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    new-array v6, v9, [I

    .line 37
    .line 38
    const v5, 0x7f1403bd

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2, v4, v5}, Luc5;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 42
    .line 43
    .line 44
    sget-object v3, Lht3;->L:[I

    .line 45
    .line 46
    invoke-static/range {v1 .. v6}, Luc5;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, v9}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iput-object v3, v0, Lf64;->n:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v8}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lp43;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Lp43;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 68
    .line 69
    .line 70
    sget-object v3, Lj65;->a:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-static {v0, v1}, La65;->c(Landroid/view/View;Lr83;)V

    .line 73
    .line 74
    .line 75
    new-instance v10, Ll43;

    .line 76
    .line 77
    invoke-direct {v10}, Ll43;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v10, v0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 81
    .line 82
    const/4 v11, 0x2

    .line 83
    new-array v1, v11, [I

    .line 84
    .line 85
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->y:[I

    .line 86
    .line 87
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->B:Z

    .line 88
    .line 89
    iput-boolean v8, v0, Lcom/google/android/material/navigation/NavigationView;->C:Z

    .line 90
    .line 91
    iput v9, v0, Lcom/google/android/material/navigation/NavigationView;->D:I

    .line 92
    .line 93
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v12, 0x21

    .line 96
    .line 97
    if-lt v1, v12, :cond_0

    .line 98
    .line 99
    new-instance v1, Loc4;

    .line 100
    .line 101
    invoke-direct {v1, v0}, Loc4;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    new-instance v1, Lnc4;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Lnc4;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 108
    .line 109
    .line 110
    :goto_0
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->E:Lmc4;

    .line 111
    .line 112
    new-instance v1, Lhi2;

    .line 113
    .line 114
    invoke-direct {v1, v0}, Lhi2;-><init>(Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->F:Lhi2;

    .line 118
    .line 119
    new-instance v1, Lqp4;

    .line 120
    .line 121
    invoke-direct {v1, v0, v0}, Lqp4;-><init>(Lzg2;Landroid/view/View;)V

    .line 122
    .line 123
    .line 124
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->G:Lqp4;

    .line 125
    .line 126
    new-instance v1, Lo43;

    .line 127
    .line 128
    invoke-direct {v1, v0}, Lo43;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 129
    .line 130
    .line 131
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->H:Lo43;

    .line 132
    .line 133
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    new-instance v13, La43;

    .line 138
    .line 139
    invoke-direct {v13, v1}, Lqu2;-><init>(Landroid/content/Context;)V

    .line 140
    .line 141
    .line 142
    iput-object v13, v0, Lcom/google/android/material/navigation/NavigationView;->u:La43;

    .line 143
    .line 144
    const v5, 0x7f1403bc

    .line 145
    .line 146
    .line 147
    new-array v6, v9, [I

    .line 148
    .line 149
    sget-object v3, Lht3;->K:[I

    .line 150
    .line 151
    invoke-static/range {v1 .. v6}, Luc5;->E(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Ljv3;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    iget-object v5, v3, Ljv3;->o:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v5, Landroid/content/res/TypedArray;

    .line 158
    .line 159
    invoke-virtual {v5, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    if-eqz v6, :cond_1

    .line 164
    .line 165
    invoke-virtual {v3, v8}, Ljv3;->c(I)Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 170
    .line 171
    .line 172
    :cond_1
    const/4 v6, 0x7

    .line 173
    invoke-virtual {v5, v6, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    iput v6, v0, Lcom/google/android/material/navigation/NavigationView;->D:I

    .line 178
    .line 179
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    if-eqz v6, :cond_2

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    instance-of v6, v6, Landroid/graphics/drawable/ColorDrawable;

    .line 190
    .line 191
    if-eqz v6, :cond_4

    .line 192
    .line 193
    :cond_2
    invoke-static {v1, v2, v4, v7}, Lbc4;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Lzc1;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v2}, Lzc1;->a()Lbc4;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    new-instance v6, Lfi2;

    .line 206
    .line 207
    invoke-direct {v6, v2}, Lfi2;-><init>(Lbc4;)V

    .line 208
    .line 209
    .line 210
    instance-of v2, v4, Landroid/graphics/drawable/ColorDrawable;

    .line 211
    .line 212
    if-eqz v2, :cond_3

    .line 213
    .line 214
    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    .line 215
    .line 216
    invoke-virtual {v4}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v6, v2}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 225
    .line 226
    .line 227
    :cond_3
    invoke-virtual {v6, v1}, Lfi2;->j(Landroid/content/Context;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 231
    .line 232
    .line 233
    :cond_4
    const/16 v2, 0x8

    .line 234
    .line 235
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_5

    .line 240
    .line 241
    invoke-virtual {v5, v2, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    int-to-float v2, v2

    .line 246
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationView;->setElevation(F)V

    .line 247
    .line 248
    .line 249
    :cond_5
    invoke-virtual {v5, v11, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    invoke-virtual {v0, v2}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 254
    .line 255
    .line 256
    const/4 v2, 0x3

    .line 257
    invoke-virtual {v5, v2, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    iput v2, v0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 262
    .line 263
    const/16 v2, 0x1f

    .line 264
    .line 265
    invoke-virtual {v5, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    const/4 v6, 0x0

    .line 270
    if-eqz v4, :cond_6

    .line 271
    .line 272
    invoke-virtual {v3, v2}, Ljv3;->b(I)Landroid/content/res/ColorStateList;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    goto :goto_1

    .line 277
    :cond_6
    move-object v2, v6

    .line 278
    :goto_1
    const/16 v4, 0x22

    .line 279
    .line 280
    invoke-virtual {v5, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    if-eqz v7, :cond_7

    .line 285
    .line 286
    invoke-virtual {v5, v4, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    goto :goto_2

    .line 291
    :cond_7
    move v4, v9

    .line 292
    :goto_2
    const v7, 0x1010038

    .line 293
    .line 294
    .line 295
    if-nez v4, :cond_8

    .line 296
    .line 297
    if-nez v2, :cond_8

    .line 298
    .line 299
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/NavigationView;->e(I)Landroid/content/res/ColorStateList;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    :cond_8
    const/16 v14, 0xe

    .line 304
    .line 305
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    if-eqz v15, :cond_9

    .line 310
    .line 311
    invoke-virtual {v3, v14}, Ljv3;->b(I)Landroid/content/res/ColorStateList;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    goto :goto_3

    .line 316
    :cond_9
    invoke-virtual {v0, v7}, Lcom/google/android/material/navigation/NavigationView;->e(I)Landroid/content/res/ColorStateList;

    .line 317
    .line 318
    .line 319
    move-result-object v7

    .line 320
    :goto_3
    const/16 v14, 0x18

    .line 321
    .line 322
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 323
    .line 324
    .line 325
    move-result v15

    .line 326
    if-eqz v15, :cond_a

    .line 327
    .line 328
    invoke-virtual {v5, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 329
    .line 330
    .line 331
    move-result v14

    .line 332
    goto :goto_4

    .line 333
    :cond_a
    move v14, v9

    .line 334
    :goto_4
    const/16 v15, 0x19

    .line 335
    .line 336
    invoke-virtual {v5, v15, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 337
    .line 338
    .line 339
    move-result v15

    .line 340
    const/16 v11, 0xd

    .line 341
    .line 342
    invoke-virtual {v5, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 343
    .line 344
    .line 345
    move-result v16

    .line 346
    if-eqz v16, :cond_b

    .line 347
    .line 348
    invoke-virtual {v5, v11, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    invoke-virtual {v0, v11}, Lcom/google/android/material/navigation/NavigationView;->setItemIconSize(I)V

    .line 353
    .line 354
    .line 355
    :cond_b
    const/16 v11, 0x1a

    .line 356
    .line 357
    invoke-virtual {v5, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 358
    .line 359
    .line 360
    move-result v16

    .line 361
    if-eqz v16, :cond_c

    .line 362
    .line 363
    invoke-virtual {v3, v11}, Ljv3;->b(I)Landroid/content/res/ColorStateList;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    goto :goto_5

    .line 368
    :cond_c
    move-object v11, v6

    .line 369
    :goto_5
    if-nez v14, :cond_d

    .line 370
    .line 371
    if-nez v11, :cond_d

    .line 372
    .line 373
    const v11, 0x1010036

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0, v11}, Lcom/google/android/material/navigation/NavigationView;->e(I)Landroid/content/res/ColorStateList;

    .line 377
    .line 378
    .line 379
    move-result-object v11

    .line 380
    :cond_d
    const/16 v8, 0xa

    .line 381
    .line 382
    invoke-virtual {v3, v8}, Ljv3;->c(I)Landroid/graphics/drawable/Drawable;

    .line 383
    .line 384
    .line 385
    move-result-object v8

    .line 386
    if-nez v8, :cond_f

    .line 387
    .line 388
    const/16 v12, 0x11

    .line 389
    .line 390
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    if-nez v12, :cond_e

    .line 395
    .line 396
    const/16 v12, 0x12

    .line 397
    .line 398
    invoke-virtual {v5, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 399
    .line 400
    .line 401
    move-result v12

    .line 402
    if-eqz v12, :cond_f

    .line 403
    .line 404
    :cond_e
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    const/16 v12, 0x13

    .line 409
    .line 410
    invoke-static {v8, v3, v12}, Lh12;->r(Landroid/content/Context;Ljv3;I)Landroid/content/res/ColorStateList;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    invoke-virtual {v0, v3, v8}, Lcom/google/android/material/navigation/NavigationView;->f(Ljv3;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;

    .line 415
    .line 416
    .line 417
    move-result-object v8

    .line 418
    const/16 v12, 0x10

    .line 419
    .line 420
    invoke-static {v1, v3, v12}, Lh12;->r(Landroid/content/Context;Ljv3;I)Landroid/content/res/ColorStateList;

    .line 421
    .line 422
    .line 423
    move-result-object v12

    .line 424
    if-eqz v12, :cond_f

    .line 425
    .line 426
    invoke-virtual {v0, v3, v6}, Lcom/google/android/material/navigation/NavigationView;->f(Ljv3;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    move-object/from16 v17, v3

    .line 431
    .line 432
    new-instance v3, Landroid/graphics/drawable/RippleDrawable;

    .line 433
    .line 434
    invoke-static {v12}, Ll24;->c(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 435
    .line 436
    .line 437
    move-result-object v12

    .line 438
    invoke-direct {v3, v12, v6, v9}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 439
    .line 440
    .line 441
    iput-object v3, v10, Ll43;->A:Landroid/graphics/drawable/RippleDrawable;

    .line 442
    .line 443
    const/4 v3, 0x0

    .line 444
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 445
    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_f
    move-object/from16 v17, v3

    .line 449
    .line 450
    move v3, v9

    .line 451
    :goto_6
    const/16 v6, 0xb

    .line 452
    .line 453
    invoke-virtual {v5, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    if-eqz v9, :cond_10

    .line 458
    .line 459
    invoke-virtual {v5, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->setItemHorizontalPadding(I)V

    .line 464
    .line 465
    .line 466
    :cond_10
    const/16 v6, 0x1b

    .line 467
    .line 468
    invoke-virtual {v5, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 469
    .line 470
    .line 471
    move-result v9

    .line 472
    if-eqz v9, :cond_11

    .line 473
    .line 474
    invoke-virtual {v5, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 475
    .line 476
    .line 477
    move-result v6

    .line 478
    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->setItemVerticalPadding(I)V

    .line 479
    .line 480
    .line 481
    :cond_11
    const/4 v6, 0x6

    .line 482
    invoke-virtual {v5, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    invoke-virtual {v0, v6}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetStart(I)V

    .line 487
    .line 488
    .line 489
    const/4 v6, 0x5

    .line 490
    invoke-virtual {v5, v6, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 491
    .line 492
    .line 493
    move-result v9

    .line 494
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setDividerInsetEnd(I)V

    .line 495
    .line 496
    .line 497
    const/16 v9, 0x21

    .line 498
    .line 499
    invoke-virtual {v5, v9, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 500
    .line 501
    .line 502
    move-result v9

    .line 503
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetStart(I)V

    .line 504
    .line 505
    .line 506
    const/16 v9, 0x20

    .line 507
    .line 508
    invoke-virtual {v5, v9, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setSubheaderInsetEnd(I)V

    .line 513
    .line 514
    .line 515
    const/16 v9, 0x23

    .line 516
    .line 517
    iget-boolean v12, v0, Lcom/google/android/material/navigation/NavigationView;->B:Z

    .line 518
    .line 519
    invoke-virtual {v5, v9, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 520
    .line 521
    .line 522
    move-result v9

    .line 523
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setTopInsetScrimEnabled(Z)V

    .line 524
    .line 525
    .line 526
    const/4 v9, 0x4

    .line 527
    iget-boolean v12, v0, Lcom/google/android/material/navigation/NavigationView;->C:Z

    .line 528
    .line 529
    invoke-virtual {v5, v9, v12}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 530
    .line 531
    .line 532
    move-result v9

    .line 533
    invoke-virtual {v0, v9}, Lcom/google/android/material/navigation/NavigationView;->setBottomInsetScrimEnabled(Z)V

    .line 534
    .line 535
    .line 536
    const/16 v9, 0xc

    .line 537
    .line 538
    invoke-virtual {v5, v9, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 539
    .line 540
    .line 541
    move-result v9

    .line 542
    const/16 v12, 0xf

    .line 543
    .line 544
    const/4 v6, 0x1

    .line 545
    invoke-virtual {v5, v12, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 546
    .line 547
    .line 548
    move-result v12

    .line 549
    invoke-virtual {v0, v12}, Lcom/google/android/material/navigation/NavigationView;->setItemMaxLines(I)V

    .line 550
    .line 551
    .line 552
    new-instance v12, Lp43;

    .line 553
    .line 554
    invoke-direct {v12, v0}, Lp43;-><init>(Lcom/google/android/material/navigation/NavigationView;)V

    .line 555
    .line 556
    .line 557
    iput-object v12, v13, Lqu2;->e:Lou2;

    .line 558
    .line 559
    iput v6, v10, Ll43;->q:I

    .line 560
    .line 561
    invoke-virtual {v10, v1, v13}, Ll43;->l(Landroid/content/Context;Lqu2;)V

    .line 562
    .line 563
    .line 564
    if-eqz v4, :cond_12

    .line 565
    .line 566
    iput v4, v10, Ll43;->t:I

    .line 567
    .line 568
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 569
    .line 570
    .line 571
    :cond_12
    iput-object v2, v10, Ll43;->u:Landroid/content/res/ColorStateList;

    .line 572
    .line 573
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 574
    .line 575
    .line 576
    iput-object v7, v10, Ll43;->y:Landroid/content/res/ColorStateList;

    .line 577
    .line 578
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    iput v1, v10, Ll43;->O:I

    .line 586
    .line 587
    iget-object v2, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 588
    .line 589
    if-eqz v2, :cond_13

    .line 590
    .line 591
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 592
    .line 593
    .line 594
    :cond_13
    if-eqz v14, :cond_14

    .line 595
    .line 596
    iput v14, v10, Ll43;->v:I

    .line 597
    .line 598
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 599
    .line 600
    .line 601
    :cond_14
    iput-boolean v15, v10, Ll43;->w:Z

    .line 602
    .line 603
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 604
    .line 605
    .line 606
    iput-object v11, v10, Ll43;->x:Landroid/content/res/ColorStateList;

    .line 607
    .line 608
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 609
    .line 610
    .line 611
    iput-object v8, v10, Ll43;->z:Landroid/graphics/drawable/Drawable;

    .line 612
    .line 613
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 614
    .line 615
    .line 616
    iput v9, v10, Ll43;->D:I

    .line 617
    .line 618
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 619
    .line 620
    .line 621
    iget-object v1, v13, Lqu2;->a:Landroid/content/Context;

    .line 622
    .line 623
    invoke-virtual {v13, v10, v1}, Lqu2;->b(Lgv2;Landroid/content/Context;)V

    .line 624
    .line 625
    .line 626
    iget-object v1, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 627
    .line 628
    if-nez v1, :cond_17

    .line 629
    .line 630
    iget-object v1, v10, Ll43;->s:Landroid/view/LayoutInflater;

    .line 631
    .line 632
    const v2, 0x7f0d0039

    .line 633
    .line 634
    .line 635
    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    check-cast v1, Lcom/google/android/material/internal/NavigationMenuView;

    .line 640
    .line 641
    iput-object v1, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 642
    .line 643
    new-instance v2, Li43;

    .line 644
    .line 645
    iget-object v3, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 646
    .line 647
    invoke-direct {v2, v10, v3}, Li43;-><init>(Ll43;Lcom/google/android/material/internal/NavigationMenuView;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Lex3;)V

    .line 651
    .line 652
    .line 653
    iget-object v1, v10, Ll43;->r:Ld43;

    .line 654
    .line 655
    if-nez v1, :cond_15

    .line 656
    .line 657
    new-instance v1, Ld43;

    .line 658
    .line 659
    invoke-direct {v1, v10}, Ld43;-><init>(Ll43;)V

    .line 660
    .line 661
    .line 662
    iput-object v1, v10, Ll43;->r:Ld43;

    .line 663
    .line 664
    :cond_15
    iget v1, v10, Ll43;->O:I

    .line 665
    .line 666
    const/4 v2, -0x1

    .line 667
    if-eq v1, v2, :cond_16

    .line 668
    .line 669
    iget-object v2, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 670
    .line 671
    invoke-virtual {v2, v1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 672
    .line 673
    .line 674
    :cond_16
    iget-object v1, v10, Ll43;->s:Landroid/view/LayoutInflater;

    .line 675
    .line 676
    const v2, 0x7f0d0036

    .line 677
    .line 678
    .line 679
    iget-object v3, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 680
    .line 681
    const/4 v4, 0x0

    .line 682
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, Landroid/widget/LinearLayout;

    .line 687
    .line 688
    iput-object v1, v10, Ll43;->o:Landroid/widget/LinearLayout;

    .line 689
    .line 690
    const/4 v2, 0x2

    .line 691
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 692
    .line 693
    .line 694
    iget-object v1, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 695
    .line 696
    iget-object v2, v10, Ll43;->r:Ld43;

    .line 697
    .line 698
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 699
    .line 700
    .line 701
    :cond_17
    iget-object v1, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 702
    .line 703
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 704
    .line 705
    .line 706
    const/16 v1, 0x1c

    .line 707
    .line 708
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 709
    .line 710
    .line 711
    move-result v2

    .line 712
    const/4 v3, 0x0

    .line 713
    if-eqz v2, :cond_1a

    .line 714
    .line 715
    invoke-virtual {v5, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 716
    .line 717
    .line 718
    move-result v1

    .line 719
    iget-object v2, v10, Ll43;->r:Ld43;

    .line 720
    .line 721
    if-eqz v2, :cond_18

    .line 722
    .line 723
    const/4 v6, 0x1

    .line 724
    iput-boolean v6, v2, Ld43;->s:Z

    .line 725
    .line 726
    :cond_18
    invoke-direct {v0}, Lcom/google/android/material/navigation/NavigationView;->getMenuInflater()Landroid/view/MenuInflater;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-virtual {v2, v1, v13}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 731
    .line 732
    .line 733
    iget-object v1, v10, Ll43;->r:Ld43;

    .line 734
    .line 735
    if-eqz v1, :cond_19

    .line 736
    .line 737
    iput-boolean v3, v1, Ld43;->s:Z

    .line 738
    .line 739
    :cond_19
    invoke-virtual {v10, v3}, Ll43;->c(Z)V

    .line 740
    .line 741
    .line 742
    :cond_1a
    const/16 v1, 0x9

    .line 743
    .line 744
    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-eqz v2, :cond_1b

    .line 749
    .line 750
    invoke-virtual {v5, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    iget-object v2, v10, Ll43;->s:Landroid/view/LayoutInflater;

    .line 755
    .line 756
    iget-object v4, v10, Ll43;->o:Landroid/widget/LinearLayout;

    .line 757
    .line 758
    invoke-virtual {v2, v1, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    iget-object v2, v10, Ll43;->o:Landroid/widget/LinearLayout;

    .line 763
    .line 764
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 765
    .line 766
    .line 767
    iget-object v1, v10, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 768
    .line 769
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 770
    .line 771
    .line 772
    move-result v2

    .line 773
    invoke-virtual {v1, v3, v3, v3, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 774
    .line 775
    .line 776
    :cond_1b
    invoke-virtual/range {v17 .. v17}, Ljv3;->g()V

    .line 777
    .line 778
    .line 779
    new-instance v1, Lsg;

    .line 780
    .line 781
    const/4 v2, 0x5

    .line 782
    invoke-direct {v1, v2, v0}, Lsg;-><init>(ILjava/lang/Object;)V

    .line 783
    .line 784
    .line 785
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationView;->A:Lsg;

    .line 786
    .line 787
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    iget-object v0, v0, Lcom/google/android/material/navigation/NavigationView;->A:Lsg;

    .line 792
    .line 793
    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 794
    .line 795
    .line 796
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->z:Lno4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lno4;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lno4;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->z:Lno4;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->z:Lno4;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->g()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lhi2;

    .line 10
    .line 11
    iget-object v3, v2, Lyg2;->f:Loo;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    iput-object v4, v2, Lyg2;->f:Loo;

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v6, 0x22

    .line 22
    .line 23
    if-ge v5, v6, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lhw0;

    .line 29
    .line 30
    iget v0, v0, Lhw0;->a:I

    .line 31
    .line 32
    sget v5, Llw0;->a:I

    .line 33
    .line 34
    new-instance v5, Lkw0;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    invoke-direct {v5, v6, p0, v1}, Lkw0;-><init>(ILandroid/view/View;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Lcn0;

    .line 41
    .line 42
    invoke-direct {p0, v4, v1}, Lcn0;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v3, v0, v5, p0}, Lhi2;->c(Loo;ILandroid/animation/AnimatorListenerAdapter;Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    :goto_0
    invoke-virtual {v1, p0, v4}, Landroidx/drawerlayout/widget/DrawerLayout;->c(Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final b(Loo;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->g()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lhw0;

    .line 8
    .line 9
    iget v0, v0, Lhw0;->a:I

    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lhi2;

    .line 12
    .line 13
    iget-object v1, p0, Lyg2;->f:Loo;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const-string v1, "MaterialBackHelper"

    .line 18
    .line 19
    const-string v2, "Must call startBackProgress() before updateBackProgress()"

    .line 20
    .line 21
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lyg2;->f:Loo;

    .line 25
    .line 26
    iput-object p1, p0, Lyg2;->f:Loo;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget v1, p1, Loo;->d:I

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v1, 0x0

    .line 38
    :goto_0
    iget p1, p1, Loo;->c:F

    .line 39
    .line 40
    invoke-virtual {p0, p1, v0, v1}, Lhi2;->d(FIZ)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final c(Loo;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->g()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lhi2;

    .line 5
    .line 6
    iput-object p1, p0, Lyg2;->f:Loo;

    .line 7
    .line 8
    return-void
.end method

.method public final d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationView;->g()Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lhi2;

    .line 5
    .line 6
    invoke-virtual {p0}, Lhi2;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->E:Lmc4;

    .line 2
    .line 3
    iget-object v1, v0, Lmc4;->e:Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-virtual {v0}, Lmc4;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Path;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 21
    .line 22
    .line 23
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(I)Landroid/content/res/ColorStateList;
    .locals 5

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x1

    .line 15
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    .line 27
    .line 28
    invoke-static {p1, v1}, Lud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const v1, 0x7f04012d

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_1

    .line 48
    .line 49
    :goto_0
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_1
    iget p0, v0, Landroid/util/TypedValue;->data:I

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 58
    .line 59
    sget-object v2, Lcom/google/android/material/navigation/NavigationView;->I:[I

    .line 60
    .line 61
    sget-object v3, Landroid/widget/FrameLayout;->EMPTY_STATE_SET:[I

    .line 62
    .line 63
    sget-object v4, Lcom/google/android/material/navigation/NavigationView;->J:[I

    .line 64
    .line 65
    filled-new-array {v4, v2, v3}, [[I

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p1, v4, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    filled-new-array {p1, p0, v0}, [I

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-direct {v1, v2, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public final f(Ljv3;Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/InsetDrawable;
    .locals 9

    .line 1
    iget-object p1, p1, Ljv3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/16 v0, 0x11

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v2, 0x12

    .line 13
    .line 14
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-instance v4, Lfi2;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0, v0, v2}, Lbc4;->a(Landroid/content/Context;II)Lzc1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Lzc1;->a()Lbc4;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v4, p0}, Lfi2;-><init>(Lbc4;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, p2}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 36
    .line 37
    .line 38
    const/16 p0, 0x16

    .line 39
    .line 40
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const/16 p0, 0x17

    .line 45
    .line 46
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const/16 p0, 0x15

    .line 51
    .line 52
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const/16 p0, 0x14

    .line 57
    .line 58
    invoke-virtual {p1, p0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    new-instance v3, Landroid/graphics/drawable/InsetDrawable;

    .line 63
    .line 64
    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 65
    .line 66
    .line 67
    return-object v3
.end method

.method public final g()Landroid/util/Pair;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    instance-of v1, p0, Lhw0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Landroid/util/Pair;

    .line 18
    .line 19
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 20
    .line 21
    check-cast p0, Lhw0;

    .line 22
    .line 23
    invoke-direct {v1, v0, p0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    const-string p0, "NavigationView back progress requires the direct parent view to be a DrawerLayout."

    .line 28
    .line 29
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public getBackHelper()Lhi2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->F:Lhi2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCheckedItem()Landroid/view/MenuItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget-object p0, p0, Ll43;->r:Ld43;

    .line 4
    .line 5
    iget-object p0, p0, Ld43;->r:Ltu2;

    .line 6
    .line 7
    return-object p0
.end method

.method public getDividerInsetEnd()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->G:I

    .line 4
    .line 5
    return p0
.end method

.method public getDividerInsetStart()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->F:I

    .line 4
    .line 5
    return p0
.end method

.method public getHeaderCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget-object p0, p0, Ll43;->o:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget-object p0, p0, Ll43;->z:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object p0
.end method

.method public getItemHorizontalPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->B:I

    .line 4
    .line 5
    return p0
.end method

.method public getItemIconPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->D:I

    .line 4
    .line 5
    return p0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget-object p0, p0, Ll43;->y:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getItemMaxLines()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->L:I

    .line 4
    .line 5
    return p0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget-object p0, p0, Ll43;->x:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    return-object p0
.end method

.method public getItemVerticalPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->C:I

    .line 4
    .line 5
    return p0
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->u:La43;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSubheaderInsetEnd()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->I:I

    .line 4
    .line 5
    return p0
.end method

.method public getSubheaderInsetStart()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget p0, p0, Ll43;->H:I

    .line 4
    .line 5
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lf64;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lji2;->P(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->G:Lqp4;

    .line 16
    .line 17
    iget-object v1, v1, Lqp4;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lah2;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 24
    .line 25
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->H:Lo43;

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;->F:Ljava/util/ArrayList;

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-virtual {v0, p0}, Landroidx/drawerlayout/widget/DrawerLayout;->a(Lgw0;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lf64;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationView;->A:Lsg;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v1, v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->H:Lo43;

    .line 24
    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, v0, Landroidx/drawerlayout/widget/DrawerLayout;->F:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    const/high16 v2, 0x40000000    # 2.0f

    .line 8
    .line 9
    iget v3, p0, Lcom/google/android/material/navigation/NavigationView;->x:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v3, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lr43;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lr43;

    .line 10
    .line 11
    iget-object v0, p1, Lk;->n:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->u:La43;

    .line 17
    .line 18
    iget-object p1, p1, Lr43;->p:Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lqu2;->t(Landroid/os/Bundle;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lr43;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lk;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, v1, Lr43;->p:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->u:La43;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lqu2;->v(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public final onSizeChanged(IIII)V
    .locals 8

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    instance-of p3, p3, Landroidx/drawerlayout/widget/DrawerLayout;

    .line 9
    .line 10
    if-eqz p3, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    instance-of p3, p3, Lhw0;

    .line 17
    .line 18
    if-eqz p3, :cond_4

    .line 19
    .line 20
    iget p3, p0, Lcom/google/android/material/navigation/NavigationView;->D:I

    .line 21
    .line 22
    if-lez p3, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    instance-of p4, p4, Lfi2;

    .line 29
    .line 30
    if-eqz p4, :cond_4

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    check-cast p4, Lhw0;

    .line 37
    .line 38
    iget p4, p4, Lhw0;->a:I

    .line 39
    .line 40
    sget-object v0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-static {p4, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    const/4 v0, 0x3

    .line 51
    const/4 v1, 0x1

    .line 52
    if-ne p4, v0, :cond_0

    .line 53
    .line 54
    move p4, v1

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 p4, 0x0

    .line 57
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lfi2;

    .line 62
    .line 63
    iget-object v2, v0, Lfi2;->n:Lei2;

    .line 64
    .line 65
    iget-object v2, v2, Lei2;->a:Lbc4;

    .line 66
    .line 67
    invoke-virtual {v2}, Lbc4;->g()Lzc1;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    int-to-float p3, p3

    .line 72
    invoke-virtual {v2, p3}, Lzc1;->b(F)V

    .line 73
    .line 74
    .line 75
    const/4 p3, 0x0

    .line 76
    if-eqz p4, :cond_1

    .line 77
    .line 78
    new-instance p4, Lm;

    .line 79
    .line 80
    invoke-direct {p4, p3}, Lm;-><init>(F)V

    .line 81
    .line 82
    .line 83
    iput-object p4, v2, Lzc1;->e:Ljava/lang/Object;

    .line 84
    .line 85
    new-instance p4, Lm;

    .line 86
    .line 87
    invoke-direct {p4, p3}, Lm;-><init>(F)V

    .line 88
    .line 89
    .line 90
    iput-object p4, v2, Lzc1;->h:Ljava/lang/Object;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    new-instance p4, Lm;

    .line 94
    .line 95
    invoke-direct {p4, p3}, Lm;-><init>(F)V

    .line 96
    .line 97
    .line 98
    iput-object p4, v2, Lzc1;->f:Ljava/lang/Object;

    .line 99
    .line 100
    new-instance p4, Lm;

    .line 101
    .line 102
    invoke-direct {p4, p3}, Lm;-><init>(F)V

    .line 103
    .line 104
    .line 105
    iput-object p4, v2, Lzc1;->g:Ljava/lang/Object;

    .line 106
    .line 107
    :goto_1
    invoke-virtual {v2}, Lzc1;->a()Lbc4;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    invoke-virtual {v0, p4}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->E:Lmc4;

    .line 115
    .line 116
    iput-object p4, v0, Lmc4;->c:Lbc4;

    .line 117
    .line 118
    iget-object v7, v0, Lmc4;->e:Landroid/graphics/Path;

    .line 119
    .line 120
    iget-object p4, v0, Lmc4;->d:Landroid/graphics/RectF;

    .line 121
    .line 122
    invoke-virtual {p4}, Landroid/graphics/RectF;->isEmpty()Z

    .line 123
    .line 124
    .line 125
    move-result p4

    .line 126
    if-nez p4, :cond_2

    .line 127
    .line 128
    iget-object v3, v0, Lmc4;->c:Lbc4;

    .line 129
    .line 130
    if-eqz v3, :cond_2

    .line 131
    .line 132
    sget-object v2, Lcc4;->a:Lfo1;

    .line 133
    .line 134
    iget-object v5, v0, Lmc4;->d:Landroid/graphics/RectF;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    const/high16 v4, 0x3f800000    # 1.0f

    .line 138
    .line 139
    invoke-virtual/range {v2 .. v7}, Lfo1;->d(Lbc4;FLandroid/graphics/RectF;Lpz1;Landroid/graphics/Path;)V

    .line 140
    .line 141
    .line 142
    :cond_2
    invoke-virtual {v0, p0}, Lmc4;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 143
    .line 144
    .line 145
    new-instance p4, Landroid/graphics/RectF;

    .line 146
    .line 147
    int-to-float p1, p1

    .line 148
    int-to-float p2, p2

    .line 149
    invoke-direct {p4, p3, p3, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 150
    .line 151
    .line 152
    iput-object p4, v0, Lmc4;->d:Landroid/graphics/RectF;

    .line 153
    .line 154
    invoke-virtual {p4}, Landroid/graphics/RectF;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-nez p1, :cond_3

    .line 159
    .line 160
    iget-object v3, v0, Lmc4;->c:Lbc4;

    .line 161
    .line 162
    if-eqz v3, :cond_3

    .line 163
    .line 164
    sget-object v2, Lcc4;->a:Lfo1;

    .line 165
    .line 166
    iget-object v5, v0, Lmc4;->d:Landroid/graphics/RectF;

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    const/high16 v4, 0x3f800000    # 1.0f

    .line 170
    .line 171
    invoke-virtual/range {v2 .. v7}, Lfo1;->d(Lbc4;FLandroid/graphics/RectF;Lpz1;Landroid/graphics/Path;)V

    .line 172
    .line 173
    .line 174
    :cond_3
    invoke-virtual {v0, p0}, Lmc4;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 175
    .line 176
    .line 177
    iput-boolean v1, v0, Lmc4;->b:Z

    .line 178
    .line 179
    invoke-virtual {v0, p0}, Lmc4;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 180
    .line 181
    .line 182
    :cond_4
    return-void
.end method

.method public setBottomInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->C:Z

    .line 2
    .line 3
    return-void
.end method

.method public setCheckedItem(I)V
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->u:La43;

    invoke-virtual {v0, p1}, Lqu2;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 30
    check-cast p1, Ltu2;

    .line 31
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    iget-object p0, p0, Ll43;->r:Ld43;

    .line 32
    invoke-virtual {p0, p1}, Ld43;->q(Ltu2;)V

    :cond_0
    return-void
.end method

.method public setCheckedItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->u:La43;

    .line 2
    .line 3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {v0, p1}, Lqu2;->findItem(I)Landroid/view/MenuItem;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p1, Ltu2;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 16
    .line 17
    iget-object p0, p0, Ll43;->r:Ld43;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ld43;->q(Ltu2;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "Called setCheckedItem(MenuItem) with an item that is not in the current menu."

    .line 24
    .line 25
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setDividerInsetEnd(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->G:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setDividerInsetStart(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->F:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lji2;->N(Landroid/view/ViewGroup;F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setForceCompatClippingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationView;->E:Lmc4;

    .line 2
    .line 3
    iget-boolean v1, v0, Lmc4;->a:Z

    .line 4
    .line 5
    if-eq p1, v1, :cond_0

    .line 6
    .line 7
    iput-boolean p1, v0, Lmc4;->a:Z

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lmc4;->a(Lcom/google/android/material/navigation/NavigationView;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput-object p1, p0, Ll43;->z:Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemHorizontalPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->B:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemHorizontalPaddingResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 10
    .line 11
    iput p1, p0, Ll43;->B:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setItemIconPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->D:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemIconPaddingResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 10
    .line 11
    iput p1, p0, Ll43;->D:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iget v0, p0, Ll43;->E:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Ll43;->E:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Ll43;->J:Z

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput-object p1, p0, Ll43;->y:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemMaxLines(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->L:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemTextAppearance(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->v:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput-boolean p1, p0, Ll43;->w:Z

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput-object p1, p0, Ll43;->x:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemVerticalPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->C:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setItemVerticalPaddingResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 10
    .line 11
    iput p1, p0, Ll43;->C:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setNavigationItemSelectedListener(Lq43;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationView;->w:Lq43;

    .line 2
    .line 3
    return-void
.end method

.method public setOverScrollMode(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Ll43;->O:I

    .line 9
    .line 10
    iget-object p0, p0, Ll43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->setOverScrollMode(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setSubheaderInsetEnd(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->I:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setSubheaderInsetStart(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationView;->v:Ll43;

    .line 2
    .line 3
    iput p1, p0, Ll43;->H:I

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Ll43;->c(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setTopInsetScrimEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationView;->B:Z

    .line 2
    .line 3
    return-void
.end method
